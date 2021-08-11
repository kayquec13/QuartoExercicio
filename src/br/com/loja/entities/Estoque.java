package br.com.loja.entities;

import java.util.List;


//TB_ESTOQUE
public class Estoque {
	
	private List<Item> itens;

	public Estoque(List<Item> itens) {
		super();
		this.itens = itens;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public void mostrarItens() {
		for(Item item : this.itens) {
			System.out.println(" Produto: " + item);
		}
	}
	
	public void addItem(Item item) {
		if(this.itens != null) {
			this.itens.add(item);
		}
	}
	
}
