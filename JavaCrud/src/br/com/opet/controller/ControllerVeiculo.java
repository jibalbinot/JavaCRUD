package br.com.opet.controller;

import java.util.ArrayList;

import br.com.opet.model.Veiculo;
import br.com.opet.view.TelaVeiculo;

public class ControllerVeiculo {
	TelaVeiculo tv = new TelaVeiculo();
	Veiculo v = new Veiculo();
	ArrayList<Veiculo> alVeiculo = new ArrayList<>();
	
	public void executar() {
		int opc = tv.menu();
		while(opc != 0) {
			switch(opc) {
			case 1 :
				System.out.println("Irá cadastrar ...");
				break;
			case 2 :
				System.out.println("Irá consultar");
				break;
			case 3 :
				System.out.println("Veiculos cadastrados ...");
				alVeiculo = v.listar();//pegar as informaçoes do BC
				tv.mostrar(alVeiculo);
				break;
			case 4 :
				System.out.println("Irá alterar ...");
				break;
			case 5 :
				System.out.println("Irá excluir ...");
				break;
			default :
				tv.erro("Opção inválida");
			}
			opc = tv.menu();
		}
		
	}

}
