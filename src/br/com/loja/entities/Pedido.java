package br.com.loja.entities;

import java.util.List;

public class Pedido {

	private List<Item> itens;

	
	public Pedido() {}

	public Pedido(List<Item> itens)
	{
		this.itens = itens;
	}

	public List<Item> getItens() 
	{
		return itens;
	}

	public void setItens(List<Item> itens) 
	{
		this.itens = itens;
	}	
	
	public void mostrarItens() {
		for (Item item : itens) {
			System.out.println("Produto: " + "Nome: " + item.getDescricao()
			+ ", Quantidade: " + item.getQuantidade() + ", Valor: " 
			+ item.getValor());
		}
	}
}
