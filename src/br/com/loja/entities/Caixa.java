package br.com.loja.entities;

import java.util.List;

/**
 * por que criar uma entidade de caixa, se só vai armazenar os pedidos? eu faria mais na parte só de pedidos
 */
public class Caixa {

	private List<Pedido> pedidos;

	public Caixa() {
	}

	public Caixa(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
}
