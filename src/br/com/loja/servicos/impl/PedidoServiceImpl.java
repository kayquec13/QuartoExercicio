package br.com.loja.servicos.impl;

import br.com.loja.entities.Pedido;
import br.com.loja.repositorios.PedidoRepositorio;
import br.com.loja.servicos.PedidoService;

public class PedidoServiceImpl implements PedidoService{

	private final PedidoRepositorio pedidoRepositorio;
	
	public PedidoServiceImpl (PedidoRepositorio pedidoRepositorio) {
		super();
		this.pedidoRepositorio = pedidoRepositorio;
	}
	
	@Override
	public Pedido buscarPedido() {
		return this.pedidoRepositorio.getPedidoRepositorio();
	}
}
