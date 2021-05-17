package br.com.opet.model;

import br.com.opet.model.dao.VeiculoDAO;

/*
 * JavaBean
 * Classe que modela em memoria uma entidade
 * Mapeia uma tabela do banco de dados para a memória
 */
public class Veiculo extends VeiculoDAO {
	private int id;
	private String placa;
	private int ano;
	
	public void mostrar() {
		System.out.print(this.getId()+" ");
		System.out.print(this.getPlaca()+" ");
		System.out.print(this.getAno()+" ");
		System.out.println();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}	
}
