package br.com.loja.util;

import br.com.loja.entities.Estoque;
import br.com.loja.servicos.EstoqueService;

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
