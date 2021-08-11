package br.com.loja.main;

import org.junit.Before;

import br.com.loja.controler.ControlaEstoque;
import br.com.loja.repositorios.EstoqueRepositorio;
import br.com.loja.service.EstoqueServiceImp;
import br.com.loja.service.PedidoServiceImp;

public class Iniciadora {
	private ControlaEstoque estoqueControler;
	private EstoqueServiceImp estoqueService;

	public Iniciadora() {

	}
			
	public ControlaEstoque getEstoqueControler() {
		return estoqueControler;
	}

	public void setEstoqueControler(ControlaEstoque estoqueControler) {
		this.estoqueControler = estoqueControler;
	}

	public EstoqueServiceImp getEstoqueService() {
		return estoqueService;
	}

	public void setEstoqueService(EstoqueServiceImp estoqueService) {
		this.estoqueService = estoqueService;
	}
	
	@Before
	public void setup() {
		this.estoqueService = new EstoqueServiceImp(new EstoqueRepositorio(), new PedidoServiceImp());
		this.estoqueControler = new ControlaEstoque(this.estoqueService);
	}

	public void salvar() {
		this.estoqueControler.salvar();
	}

	public void editar(int id) {
		this.estoqueControler.editarItem(id);
	}

	public void consultar(String nomeItem) {
		this.estoqueControler.consultar(nomeItem);
	}
}
