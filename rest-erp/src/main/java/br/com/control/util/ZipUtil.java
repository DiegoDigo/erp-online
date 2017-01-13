package br.com.control.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipUtil {

	private List<String> listaArquivos;
	private final String nomeArquivoZipASerGerado;
	private final String diretorioOrigemArquivos;

	public ZipUtil(String pastaImagensProdutos, String saida) {
		listaArquivos = new ArrayList<String>();
		nomeArquivoZipASerGerado = saida;
		diretorioOrigemArquivos = pastaImagensProdutos;
		generateFileList(new File(diretorioOrigemArquivos));
	}

	public void zip() {
		
		byte[] buffer = new byte[1024];
		String source = "";
		FileOutputStream fos = null;
		ZipOutputStream zos = null;
		try {
			try {
				source = diretorioOrigemArquivos.substring(diretorioOrigemArquivos.lastIndexOf("\\") + 1, diretorioOrigemArquivos.length());
			} catch (Exception e) {
				source = diretorioOrigemArquivos;
			}
			fos = new FileOutputStream(nomeArquivoZipASerGerado);
			zos = new ZipOutputStream(fos);

			FileInputStream in = null;

			for (String file : this.listaArquivos) {
				ZipEntry ze = new ZipEntry(source + File.separator + file);
				zos.putNextEntry(ze);
				try {
					in = new FileInputStream(diretorioOrigemArquivos + File.separator + file);
					int len;
					while ((len = in.read(buffer)) > 0) {
						zos.write(buffer, 0, len);
					}
				} finally {
					in.close();
				}
			}

			zos.closeEntry();

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				zos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void generateFileList(File node) {
		if (node.isFile()) {
			listaArquivos.add(generateZipEntry(node.toString()));
		}
		if (node.isDirectory()) {
			String[] subNote = node.list();
			for (String filename : subNote) {
				generateFileList(new File(node, filename));
			}
		}
	}

	private String generateZipEntry(String file) {
		return file.substring(diretorioOrigemArquivos.length() + 1, file.length());
	}
}