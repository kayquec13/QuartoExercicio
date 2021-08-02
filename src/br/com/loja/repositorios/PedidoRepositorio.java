package br.com.loja.repositorios;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.loja.entities.Item;
import br.com.loja.entities.Pedido;

public class PedidoRepositorio {

	private List<Item> itens;

	public PedidoRepositorio() {

		this.itens = new ArrayList<Item>();
		this.itens.add(new Item(1, "Arroz", new BigDecimal(15), 5));
		this.itens.add(new Item(2, "Cloro", new BigDecimal(5), 2));
	}
	
	public Pedido getPedidoRepositorio() {
		return new  Pedido(this.itens);
	}
}
