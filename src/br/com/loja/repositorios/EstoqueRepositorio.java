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

		/**
		 * Aqui, você pode utilizar somente a inicialização dos itens já criados, você pode, no ItemRepositorio,
		 * utilizar um método, por ex: buscar();, para trazer esses itens e criar o estoque.
		 * 
		 * ItemRepositorio itemRepo = new ItemRepositorio();
		 * this.itens = itemRepositorio.getItems():
		 * criarEstoque();
		 * 
		 * Na funcao criarEstoque, aqui mesmo no repositorio, você pode fazer
		 * this.itens.forEach((item) -> //getters and setters no model Estoque, com valor, id do item e valor total)
		 * 
		 * não esqueça de utilizar sempre as propriedades e os add do array list pra n precisar ficar instanciando
		 */
		
		/**
		 * Categorias devem ser criadas em seu próprio repositório. Criar um "CategoriaRepositorio"
		 * e adicionar um método create();
		 */
		Categoria alimento = new Categoria(1, "Alimento");
		Categoria limpeza = new Categoria(2, "Limpeza");

		/**
		 * Não faz sentido criar um item com quantidades, sendo que quem é reponsável por isso é o estoque.
		 * Você deve utilizar o model Item apenas para linkar eles a categoria, o nome do item e o valor.
		 * Como nós vamos simular o banco de dados, você deve, no model de estoque, utilizar somente os campos:
		 * - ID DO ESTOQUE
		 * - ID DO ITEM
		 * - QUANTIDADE DE ITENS NO ESTOQUE
		 * - VALOR TOTAL DO ITEM EM ESTOQUE (quantidade x valor cada item)
		 * - Pode utilizar também o status.
		 * 
		 */
		this.itens = new ArrayList<Item>();

		this.itens.add(new Item(1, "Arroz", new BigDecimal(15), 10, alimento, StatusItem.PRODUTO_EM_ESTOQUE));
		this.itens.add(new Item(2, "Cloro", new BigDecimal(5), 10, limpeza, StatusItem.PRODUTO_EM_ESTOQUE));
	}

	public Estoque getEstoqueFromDatabase() {
		return new Estoque(this.itens);
	}

	public Estoque removeEstoque(Item itemPedido) {

		// Caso queira diminuir algumas linhas de código na remoção, da uma olhada nesse link --> https://www.baeldung.com/find-list-element-java

		/**
		 * Essa função deve retornar true ou false, porquê não é trabalho dela printar se deu certo ou não. 
		 * 
		 * Mais ou menos como eu faria, reutilizando um pouco das funções nativas do java logo em cima
		 * eu só quero que essa função remova, nao preciso mt de um status no estoque, se o estoque for zero
		 * já da pra saber que ta sem, não precisa de status
		 * 
		 * Caso essa funcao retornar false no foreach de pedido, retorna pra ele "Produto sem estoque, refaça o pedido"
		 * for (Item item : this.itens) {
			if (itemPedido.getId() == item.getId()) {
				if (item.getQuantidade() >= itemPedido.getQuantidade()) {
					item.setQuantidade(item.getQuantidade() - itemPedido.getQuantidade());
					return true;
				}
				return false;
			}
		}
		*/

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
					System.out.println("\n A quantidade do pedido � maior" + " que a que temos em estoque do produto: "
							+ item.getDescricao());
				}
			}
		}

		return ;
	}

}
