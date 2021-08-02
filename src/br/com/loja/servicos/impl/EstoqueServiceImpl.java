package br.com.loja.servicos.impl;

import br.com.loja.entities.Estoque;
import br.com.loja.repositorios.EstoqueRepositorio;
import br.com.loja.servicos.EstoqueService;

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
