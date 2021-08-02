package br.com.loja.servicos.impl;

import br.com.loja.entities.Estoque;
import br.com.loja.repositorios.EstoqueRepositorio;
import br.com.loja.servicos.EstoqueService;

/**
 * TRANSFORMAR ISSO EM OUTRA PASTA NUM CONTROLLER, RETIRAR DAQUI
 * não faz muito sentido utilizar uma interface com o nome de estoque, se você usa a mesma interface no pedido
 * cria só uma e utiliza os métodos que vão ser obrigatórios, tipo um crud interface, daí se tu n for usar, deixa a função vazia msm
 */
public class EstoqueServiceImpl implements EstoqueService {
	
	private final EstoqueRepositorio estoqueRepositorio;
	
	public EstoqueServiceImpl(EstoqueRepositorio estoqueRepositorio) {
		super();
		this.estoqueRepositorio = estoqueRepositorio;
	}

	@Override
	public Estoque buscarEstoque() {
		return this.estoqueRepositorio.getEstoqueFromDatabase();
	}

	@Override
	public Estoque removeEstoque() {
		// TODO Auto-generated method stub
		return null;
	}
}
