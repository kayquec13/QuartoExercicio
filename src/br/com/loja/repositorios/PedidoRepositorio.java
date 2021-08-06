package br.com.loja.repositorios;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.loja.entities.Categoria;
import br.com.loja.entities.Item;
import br.com.loja.entities.Pedido;
import br.com.loja.enuns.StatusItem;

public class PedidoRepositorio {

	private List<Item> itens;

	public PedidoRepositorio() {

		Categoria alimento = new Categoria(1, "Alimento");
		Categoria limpeza = new Categoria(2, "Limpeza");

		this.itens = new ArrayList<Item>();
		this.itens.add(new Item(1, "Arroz", new BigDecimal(15), 10, alimento, 
				StatusItem.PRODUTO_EM_ESTOQUE));
		this.itens.add(new Item(2, "Cloro", new BigDecimal(5), 4, limpeza, 
				StatusItem.PRODUTO_EM_ESTOQUE));
	}

	public Pedido buscarPedido() {
		return new Pedido(this.itens);
	}

	public BigDecimal calculaTotal() {
		BigDecimal valor = new BigDecimal(0);
		for (Item item : this.itens) {

			BigDecimal quantidade = new BigDecimal(item.getQuantidade());
			BigDecimal valorProduto = item.getValor();
			BigDecimal soma = new BigDecimal(0);

			soma = quantidade.multiply(valorProduto);
			valor = valor.add(soma);
		}
		return valor;
	}
}
