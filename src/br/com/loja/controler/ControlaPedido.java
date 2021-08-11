package br.com.loja.controler;

import br.com.loja.service.PedidoServiceImp;

public class ControlaPedido {
	private final PedidoServiceImp pedidoService;
	
	public ControlaPedido() {
		this.pedidoService = new PedidoServiceImp();
	}
	
	public void pesquisaPedido() {
		this.pedidoService.mostrarPedido();
	}
	
	public void calculaPedido() {
		pedidoService.calculaPedido();
	}
}
