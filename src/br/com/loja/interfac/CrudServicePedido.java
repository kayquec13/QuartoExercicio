package br.com.loja.interfac;

import br.com.loja.entities.Pedido;

public interface CrudServicePedido {

	Pedido buscarPedido();

	void calculaPedido();
}
