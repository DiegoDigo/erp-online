package br.com.control.controllers.cadastros;

import java.io.File;

import org.springframework.core.io.FileSystemResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.controllers.AbstractController;
import br.com.control.rotas.RotasRest;

@RestController
@RequestMapping(RotasRest.RAIZ_IMAGEM + RotasRest.RAIZ_PRODUTO)
public class ImagemController extends AbstractController {

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=multipart/form-data")
	@ResponseBody
	public FileSystemResource getFile() {
		return new FileSystemResource(new File("C://IMG.zip"));
	}

}
