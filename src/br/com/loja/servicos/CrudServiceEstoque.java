package br.com.loja.servicos;

import br.com.loja.entities.Estoque;

public interface CrudServiceEstoque {

	Estoque buscarEstoque();

	void removeEstoque();

	void calculaEstoque();
}
