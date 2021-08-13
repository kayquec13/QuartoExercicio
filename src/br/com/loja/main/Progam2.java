package br.com.loja.main;

import org.junit.jupiter.api.Test;

import br.com.loja.entities.Item;

public class Progam2 {
@Test
	public  void main() {
	Iniciadora iniciadora = new Iniciadora();
	
	System.out.println("-------------Consultando----------");
	
	iniciadora.setup();
	iniciadora.consultar("Arroz");
	
	System.out.println("-------------Editando----------");
	
	iniciadora.editar(1);
	
	final Item itemModicando = iniciadora.getEstoqueControler().getItemModificado(); 			
	itemModicando.setDescricao("MOUSE");
	itemModicando.setQuantidade(10);
		
	
	System.out.println("-------------Consultando----------");
	iniciadora.salvar();
	
	iniciadora.consultar("MOUSE");
	
	System.out.println("-------------Deletando----------");
	iniciadora.remover(1,2);
	iniciadora.consultar("MOUSE");
	iniciadora.consultar("Cloro");
	}
}
