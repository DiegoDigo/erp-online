package br.com.control.vendas.cadastro.modelo.clienteOld;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estabelecimento {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private TipoEstabelecimento tipo;
	
	
}
