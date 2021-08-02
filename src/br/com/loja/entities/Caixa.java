package br.com.loja.entities;

import java.util.List;

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
