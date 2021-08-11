package br.com.loja.main;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import br.com.loja.controler.ControlaEstoque;
import br.com.loja.entities.Item;
import br.com.loja.repositorios.EstoqueRepositorio;
import br.com.loja.service.EstoqueServiceImp;
import br.com.loja.service.PedidoServiceImp;


public class program3 {

	private ControlaEstoque estoqueController;
	private EstoqueServiceImp estoqueService;

	@Before
	public void setup() {
		this.estoqueService = new EstoqueServiceImp(new EstoqueRepositorio(), new PedidoServiceImp());
		this.estoqueController = new ControlaEstoque(this.estoqueService);
	}

	@Test
	public void main() {

		System.out.println("----------------CONSULTANDO-------------");
		// MANOLO 1 -> CLICOU NO btnConsultar(getInputDescricao()
		consultar("Arroz");

		System.out.println("--------EDITANDO--------------------------------");

		// MANOLO 1 -> CLICOU NO BOTAO EDITAR -> btnEditarItem(getIdItem)
		editar(1);

		// MANOLO 1 -> EDITA DADOS NA TELA
		final Item itemModicando = this.estoqueController.getItemModificado();
		itemModicando.setDescricao("MOUSE");
		itemModicando.setQuantidade(3);

		System.out.println("-------------SALVANDO---------------------");
		// MANOLO 1 -> CLICOU PARA SALVAR
		salvar();

		System.out.println("-------------CONSULTANDO---------------------");
		// MANOLO 1 -> CLICOU NO CONSULTAR
		consultar("MOUSE");

	}

	private void salvar() {
		this.estoqueController.salvar();
	}

	private void editar(int id) {
		this.estoqueController.editarItem(id);
	}

	private void consultar(String mouse) {
		this.estoqueController.consultar(mouse);
	}

}
