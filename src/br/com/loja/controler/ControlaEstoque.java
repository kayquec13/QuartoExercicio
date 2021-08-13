package br.com.loja.controler;

import java.util.List;

import br.com.loja.entities.Item;
import br.com.loja.service.EstoqueServiceImp;

public class ControlaEstoque {

	private final EstoqueServiceImp estoqueService;
	private Item itemModificado;

	public ControlaEstoque() {
		super();
		this.estoqueService = new EstoqueServiceImp();
	}

	public ControlaEstoque(EstoqueServiceImp estoqueService) {
		this.estoqueService = estoqueService;
	}

	public Item getItemModificado() {
		return itemModificado;
	}

	public void setItemModificado(Item itemModificado) {
		this.itemModificado = itemModificado;
	}
	
    public String consultar(String mouse) {
        final List<Item> items = this.estoqueService.buscarItemsNoEstoque(mouse);
        if(items == null || items.isEmpty()) {
            System.out.println("Nenhuma informação encontrada");
            return "consultar";
        }
        System.out.println("DESCRICAO | PRECO UNIT | QTD | CATEGORIA | TOTAL | ID");
        for (Item item : items) {
            System.out.printf("%s | %f | %d | %s | %f | %d \n", item.getDescricao(), item.getValor().doubleValue(),
                    item.getQuantidade(), item.getCategoria().getNome(), item.valorTotal().doubleValue(), item.getId());
        }
        return "consultar";
    }
    
	public void RemocaoItemPorId(int id, Integer quantidade ) {				
		estoqueService.atualizaItemImpl(id, quantidade);		 		 
	}

	public void editarItem(int id) {
		this.itemModificado = this.estoqueService.buscarItemPorId(id);

		if (this.itemModificado != null) {
			System.out.printf("DESCRICAO | PRECO UNIT | QTD | CATEGORIA  \n" + "%s | %f | %d | %s  \n",
					itemModificado.getDescricao(), itemModificado.getValor().doubleValue(),
					itemModificado.getQuantidade(), itemModificado.getCategoria().getNome());
		} else {
			System.out.println("Item nÃ£o encontrado");
		}
	}

	public void pesquisarEstoque() {
		this.estoqueService.mostrarEstoque();
		
	}

	public void removeEstoque() {
		this.estoqueService.removeEstoque();
	}

	public void calculaEstoque() {
		this.estoqueService.calculaEstoque();
	}

	public void salvar() {
		this.estoqueService.salvar(this.itemModificado);
	}
}
