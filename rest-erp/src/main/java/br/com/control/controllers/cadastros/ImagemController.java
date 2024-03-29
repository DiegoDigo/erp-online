package br.com.control.controllers.cadastros;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.controllers.AbstractController;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.rotas.RotasRest;
import br.com.control.util.ZipUtil;

@RestController
@RequestMapping(RotasRest.RAIZ + RotasRest.RAIZ_IMAGEM + RotasRest.RAIZ_PRODUTO)
public class ImagemController extends AbstractController {

	
	@Value("${caminho_imagens_produtos_erp}")
	private String caminhoImagensProdutosErp;
	
	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=multipart/form-data")
	@ResponseBody
	public ByteArrayResource getFile(@RequestParam(value = "mensagem") MensagemRecebida<String> mensagem) throws IOException {
		new ZipUtil(caminhoImagensProdutosErp, caminhoImagensProdutosErp+"_ZIP.zip").zip();
		byte[] array = Files.readAllBytes(new File(caminhoImagensProdutosErp+"_ZIP.zip").toPath());
		return new ByteArrayResource(array);
	}
}
