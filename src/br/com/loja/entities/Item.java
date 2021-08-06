package br.com.loja.entities;

import java.math.BigDecimal;

import br.com.loja.enuns.StatusItem;

//tb_item
public class Item {

	private int id;
	private String descricao;
	private Integer quantidade;
	private BigDecimal valor;

	// TB_CATEGORIA
	private Categoria categoria;
	private StatusItem status;

	public Item() {
	}

	public Item(int id, String descricao, BigDecimal valor) {
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
	}

	public Item(int id, String descricao, BigDecimal valor, Integer quantidade, Categoria categoria,
			StatusItem status) {

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

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Nome: " + descricao + " Valor: " + valor + " , Quantidade:" 
				+ quantidade + " , Status em estoque: "
				+ status;
	}
}
