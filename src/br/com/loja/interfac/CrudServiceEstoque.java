package br.com.loja.interfac;

import java.util.List;

import br.com.loja.entities.Estoque;
import br.com.loja.entities.Item;

public interface CrudServiceEstoque {

	Estoque buscarEstoque();

	void removeEstoque();

	void calculaEstoque();

	List<Item> buscarItemsNoEstoque(String mouse);

	Item buscarItemPorId(int id);

	void salvar(Item item);
}
