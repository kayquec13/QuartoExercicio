package br.com.loja.util;

import br.com.loja.entities.Pedido;
import br.com.loja.servicos.PedidoService;

public class ControlaPedido {
	private final PedidoService pedidoService;
	
	public ControlaPedido(PedidoService pedidoService) {
		super();
		this.pedidoService = pedidoService;
	}
	
	public Pedido buscar() {
		return this.pedidoService.buscarPedido();
	}
}
