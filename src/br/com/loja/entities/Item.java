package br.com.loja.entities;

import java.math.BigDecimal;

//tb_item
public class Item {

	private int id;
	private String descricao;
	private BigDecimal valor;
	/**
	 * Quantidade não deve ficar em itens, mas sim no estoque
	 */
	private Integer quantidade;

	// TB_CATEGORIA
	private Categoria categoria;
	private StatusItem status;

	public Item() {
	}
	
	public Item(int id, String descricao, BigDecimal valor, Integer quantidade){
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public Item(int id, String descricao, BigDecimal valor, Integer quantidade, 
			Categoria categoria,StatusItem status) {
		
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
		this.categoria = categoria;
		this.status = status;
	}

	public Item(String string, BigDecimal bigDecimal) {
		this.descricao = string;
		this.valor = bigDecimal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public StatusItem getStatus() {
		return status;
	}

	public void setStatus(StatusItem status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Nome: " + descricao + " Quantidade: " + quantidade + " Valor: " + valor + " Status em estoque: "
				+ status;
	}
}
