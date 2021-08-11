package br.com.loja.repositorios;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.loja.entities.Categoria;
import br.com.loja.entities.Estoque;
import br.com.loja.entities.Item;
import br.com.loja.enuns.StatusItem;

public class EstoqueRepositorio {

	private List<Item> itens;

	public EstoqueRepositorio() {
		Categoria alimento = new Categoria(1, "Alimento");
		Categoria limpeza = new Categoria(2, "Limpeza");

		this.itens = new ArrayList<Item>();

		this.itens.add(new Item(1, "Arroz", new BigDecimal(15), 10, alimento, StatusItem.PRODUTO_EM_ESTOQUE));
		this.itens.add(new Item(2, "Cloro", new BigDecimal(5), 10, limpeza, StatusItem.PRODUTO_EM_ESTOQUE));
	}

	public Estoque buscarEstoque() {
		return new Estoque(this.itens);
	}

	public void removerEstoque(List<Item> itensPedido) {
		for (Item itemPedido : itensPedido) {
			for (Item itemEstoque : this.itens) {
				if (itemPedido.getId() == itemEstoque.getId()) {
					if (itemPedido.getQuantidade() <= itemEstoque.getQuantidade()) {
						itemEstoque.setQuantidade(itemEstoque.getQuantidade() - itemPedido.getQuantidade());
						controlaStatus();
					} else {
						controlaStatus();
					}
				}
			}
		}
	}

	public void controlaStatus() {
		for (Item item : this.itens) {
			if (item.getQuantidade() > 0) {
				item.setStatus(StatusItem.PRODUTO_EM_ESTOQUE);
			} else {
				item.setStatus(StatusItem.SEM_ESTOQUE_DO_PRODUTO);
			}
		}
	}

	public BigDecimal calculaTotal() {
		BigDecimal valor = new BigDecimal(0);
		for (Item item : this.itens) {

			BigDecimal quantidade = new BigDecimal(item.getQuantidade());
			BigDecimal valorProduto = item.getValor();
			BigDecimal soma = new BigDecimal(0);

			soma = quantidade.multiply(valorProduto);
			valor = valor.add(soma);
		}
		return valor;
	}
	
    public List<Item> buscarItensDoEstoque(String mouse) {
        List<Item> itensRetornar = new ArrayList<>();
        if (mouse != null) {
            for (Item iten : buscarEstoque().getItens()) {
                if (iten.getDescricao().equals(mouse)) {
                    itensRetornar.add(iten);
                }
            }
        } else {
            itensRetornar = buscarEstoque().getItens();
        }
        return itensRetornar;
    }
	
    public void salvar(Item item) {
        if (item.getId() != null) {
            Item itemPersist = buscarPorId(item.getId());
            itemPersist.setQuantidade(item.getQuantidade());
            itemPersist.setDescricao(item.getDescricao());
            itemPersist.setStatus(item.getStatus());
            itemPersist.setCategoria(item.getCategoria());
            itemPersist.setValor(item.getValor());
        } else {
            item.setId(proximoIDDoItem());
            adicionaItemEstoque(item);
        }
    }

    private void adicionaItemEstoque(Item item) {
		buscarEstoque().addItem(item);
    }

    private Integer proximoIDDoItem() {
        final List<Item> itens = buscarEstoque().getItens();
        if(itens == null || itens.isEmpty()) {
            return 1;
        }
        final int size = itens.size();
        final Item item = itens.get(size-1);
        return item.getId()+1;
    }

    public Item buscarPorId(Integer id) {
        for (Item item : buscarEstoque().getItens()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
      


}
