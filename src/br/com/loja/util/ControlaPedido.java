package br.com.loja.util;

import br.com.loja.entities.Pedido;
import br.com.loja.servicos.PedidoService;

/**
 * não entendi pra que serve o controle, se já tem o repositorio, é repeticao de codigo só
 */
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
