package br.com.loja.servicos;

import br.com.loja.entities.Estoque;

public interface EstoqueService {
	
	Estoque buscarEstoque();
	Estoque removeEstoque();
}
