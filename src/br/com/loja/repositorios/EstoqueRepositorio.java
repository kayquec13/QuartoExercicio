package br.com.loja.repositorios;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.loja.entities.Categoria;
import br.com.loja.entities.Estoque;
import br.com.loja.entities.Item;
import br.com.loja.entities.Pedido;
import br.com.loja.entities.StatusItem;
import br.com.loja.servicos.PedidoService;
import br.com.loja.servicos.impl.PedidoServiceImpl;
import br.com.loja.util.ControlaPedido;

public class EstoqueRepositorio {

	private List<Item> itens;

	public EstoqueRepositorio() {
		Categoria alimento = new Categoria(1, "Alimento");
		Categoria limpeza = new Categoria(2, "Limpeza");

		this.itens = new ArrayList<Item>();

		this.itens.add(new Item(1, "Arroz", new BigDecimal(15), 10, alimento, StatusItem.PRODUTO_EM_ESTOQUE));
		this.itens.add(new Item(2, "Cloro", new BigDecimal(5), 10, limpeza, StatusItem.PRODUTO_EM_ESTOQUE));
	}

	public Estoque getEstoqueFromDatabase() {
		return new Estoque(this.itens);
	}

	public Estoque removeEstoque(Item itemPedido) {

		for (Item item : this.itens) {
			if (itemPedido.getId() == item.getId()) {
				if (item.getQuantidade() >= itemPedido.getQuantidade()) {
					item.setQuantidade(item.getQuantidade() - itemPedido.getQuantidade());

					if (item.getQuantidade() > 0) {
						item.setStatus(StatusItem.PRODUTO_EM_ESTOQUE);
					} else {
						item.setStatus(StatusItem.SEM_ESTOQUE_DO_PRODUTO);
					}
				} else {
					System.out.println("\n A quantidade do pedido é maior" + " que a que temos em estoque do produto: "
							+ item.getDescricao());
				}
			}
		}

		return ;
	}

}
