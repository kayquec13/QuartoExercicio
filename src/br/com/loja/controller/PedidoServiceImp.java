package br.com.loja.controller;

import br.com.loja.entities.Pedido;
import br.com.loja.repositorios.PedidoRepositorio;
import br.com.loja.servicos.CrudServicePedido;

public class PedidoServiceImp implements CrudServicePedido {

	private final PedidoRepositorio pedidoRepositorio;

	public PedidoServiceImp() {
		super();
		this.pedidoRepositorio = new PedidoRepositorio();
	}

	public void mostrarPedido() {
		Pedido pedido = buscarPedido();
		pedido.mostrarItens();
	}

	@Override
	public Pedido buscarPedido() {
		return pedidoRepositorio.buscarPedido();
	}

	@Override
	public void calculaPedido() {
		System.out.println("Total do estoque:" + pedidoRepositorio.calculaTotal());
	}
}
