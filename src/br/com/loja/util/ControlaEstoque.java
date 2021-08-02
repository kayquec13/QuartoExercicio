package br.com.loja.util;

import br.com.loja.entities.Estoque;
import br.com.loja.servicos.EstoqueService;

/**
 * não entendi pra que serve o controle, se já tem o repositorio, é repeticao de codigo só
 */
public class ControlaEstoque {

	private final EstoqueService estoqueService;

	public ControlaEstoque(EstoqueService estoqueService) {
		super();
		this.estoqueService = estoqueService;
	}

	public Estoque buscar() {
		return this.estoqueService.buscarEstoque();
	}
		
	public Estoque removeEstoque() {
		 return this.estoqueService.removeEstoque();
	}
}
