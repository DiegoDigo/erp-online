package br.com.control.cadastro;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Acl;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

@Service
public class ServiceFirebaseSfa {

	@Value("${nome_bucket}")
	private String BUCKET_NAME;

	@Value("${numero_matricula_empresa}")
	private String LICENCA ;

	@Value("${arquivo_json}")
	private String FIREBASEJSON ;
	
	public boolean gravarArquivo(String caminhoPath) {

		File file = new File(caminhoPath);
		if(file.exists()) {
			Storage storage = null;
			
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			InputStream keyjson = classloader.getResourceAsStream(FIREBASEJSON);

			try {
				storage = StorageOptions.newBuilder().setProjectId(BUCKET_NAME)
						.setCredentials(GoogleCredentials
								.fromStream(keyjson))
						.build().getService();
			} catch (IOException e) {
				e.getMessage();
				throw new RuntimeException(e);
			}

			List<Acl> roles = new ArrayList<Acl>();
			roles.add(Acl.of(Acl.User.ofAllUsers(), Acl.Role.OWNER));
			
			BlobInfo blobInfo = BlobInfo
					.newBuilder(BUCKET_NAME,
							"licenca-" + LICENCA + "/vendedor-" + pegarCodigoVendedor(file) + "/" + file.getName())
					.setAcl(roles).build();

			storage.create(blobInfo, gerarArquivo(file));
			return true;
		}else {
			return false;
		}
	}

	private static byte[] gerarArquivo(File file) {
		try {
			return converteInputStreamToByteArray(new FileInputStream(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			e.getMessage();
			return null;
		}
	}

	private static byte[] converteInputStreamToByteArray(InputStream filePart) {
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();

		int nRead;
		byte[] data = new byte[16384];

		try {
			while ((nRead = filePart.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
			}
			buffer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return buffer.toByteArray();
	}

	private static String pegarCodigoVendedor(File file) {
		String codigoVendedor = file.getName().split("\\.")[0];
		return codigoVendedor.substring(codigoVendedor.length() - 8, codigoVendedor.length());
	}
}
