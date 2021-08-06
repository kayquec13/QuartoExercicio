package br.com.loja.servicos;

import br.com.loja.entities.Pedido;

public interface CrudServicePedido {

	Pedido buscarPedido();

	void calculaPedido();
}
