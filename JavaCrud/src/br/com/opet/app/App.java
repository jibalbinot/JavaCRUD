package br.com.opet.app;

import java.util.ArrayList;

import br.com.opet.model.Veiculo;

public class App {

	public static void main(String[] args) {
		
		//criei uma lista
		ArrayList<Veiculo> lista = new ArrayList<>();
		
		//criei um elemento que já tem o bean o DAO
		Veiculo v = new Veiculo();
		
		//chamei a funcao de listar
		lista = v.listar();
		
		//mostrar na tela
		for (Veiculo aux : lista) {
			aux.mostrar();
		}
		
	}

}
