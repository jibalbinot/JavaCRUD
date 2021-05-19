package br.com.opet.view;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.opet.model.Veiculo;

public class TelaVeiculo {
	private Scanner s = new Scanner(System.in);
	
	public int menu() {
		int opc;
		System.out.println();
		System.out.println("----- Tela Veiculo -----");
		System.out.println("1 - cadastrar");
		System.out.println("2 - consultar");
		System.out.println("3 - listar");
		System.out.println("4 - alterar");
		System.out.println("5 - excluir");
		System.out.println("0 - sair");
		System.out.println("------------------------");
		System.out.print("Opcao: ");
		opc = Integer.parseInt(s.next());
		return opc;
	}
	
	public void erro(String erro) {
		System.err.println(erro);
	}
	
	public void mostrar(ArrayList<Veiculo> alVeiculo) {
		for(Veiculo aux : alVeiculo)
			aux.mostrar();
	}

	public Veiculo adicionar() {
		Veiculo v = new Veiculo();
		System.out.print("Informe placa [XXX-nnnn]: ");
		v.setPlaca(s.next());
		System.out.print("Informe ano [nnnn]......: ");
		v.setAno(Integer.parseInt(s.next()));
		return v;
	}
	
	public Veiculo alterar(int id) {
		Veiculo v = this.adicionar();
		v.setId(id);
		return v;
	}

	public void mensagem(String mensagem) {
		System.out.println(mensagem);	
	}

	public int lerId() {
		System.out.print("Informe ID.............: ");
		int id = Integer.parseInt(s.next());
		return id;
	}

}
