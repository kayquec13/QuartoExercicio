package br.com.loja.service;

import java.util.List;

import br.com.loja.entities.Estoque;
import br.com.loja.entities.Item;
import br.com.loja.entities.Pedido;
import br.com.loja.interfac.CrudServiceEstoque;
import br.com.loja.repositorios.EstoqueRepositorio;

public class EstoqueServiceImp implements CrudServiceEstoque {

	private final EstoqueRepositorio estoqueRepositorio;
	private final PedidoServiceImp pedidoService;

	public EstoqueServiceImp() {
		super();
		this.estoqueRepositorio = new EstoqueRepositorio();
		this.pedidoService = new PedidoServiceImp();
	}

	public EstoqueServiceImp(EstoqueRepositorio estoqueRepositorio, PedidoServiceImp pedidoService) {
		this.estoqueRepositorio = estoqueRepositorio;
		this.pedidoService = pedidoService;
	}

	public void mostrarEstoque() {
		Estoque estoque = buscarEstoque();
		estoque.mostrarItens();
	}

	//preciso encontrar uma forma de remover o item por id
	public void atualizaItemImpl(int id, Integer quantidade) {
		estoqueRepositorio.atualizaLista(id, quantidade);
	}

	@Override
	public Estoque buscarEstoque() {
		return estoqueRepositorio.buscarEstoque();
	}

	@Override
	public void removeEstoque() {
		Pedido pedido = pedidoService.buscarPedido();
		estoqueRepositorio.removerEstoque(pedido.getItens());
	}

	@Override
	public void calculaEstoque() {
		System.out.println("Total do estoque:" + estoqueRepositorio.calculaTotal());
	}

	@Override
	public void salvar(Item item) {
		this.estoqueRepositorio.salvar(item);
	}

	@Override
	public List<Item> buscarItemsNoEstoque(String mouse) {
		// TODO Auto-generated method stub
		return this.estoqueRepositorio.buscarItensDoEstoque(mouse);
	}

	@Override
	public Item buscarItemPorId(int id) {
		for (Item item : buscarItemsNoEstoque(null)) {
			if (item.getId() == id) {
				return item;
			}
		}
		return null;
	}

}
