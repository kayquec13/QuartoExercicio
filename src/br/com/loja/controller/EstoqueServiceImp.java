package br.com.loja.controller;

import br.com.loja.entities.Estoque;
import br.com.loja.entities.Pedido;
import br.com.loja.repositorios.EstoqueRepositorio;
import br.com.loja.servicos.CrudServiceEstoque;

public class EstoqueServiceImp implements CrudServiceEstoque {

	private final EstoqueRepositorio estoqueRepositorio;
	private final PedidoServiceImp pedidoService;

	public EstoqueServiceImp() {
		super();
		this.estoqueRepositorio = new EstoqueRepositorio();
		this.pedidoService = new PedidoServiceImp();
	}

	public void mostrarEstoque() {
		Estoque estoque = buscarEstoque();
		estoque.mostrarItens();
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

}
