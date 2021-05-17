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
				System.out.println("Ir� cadastrar ...");
				break;
			case 2 :
				System.out.println("Ir� consultar");
				break;
			case 3 :
				System.out.println("Veiculos cadastrados ...");
				alVeiculo = v.listar();//pegar as informa�oes do BC
				tv.mostrar(alVeiculo);
				break;
			case 4 :
				System.out.println("Ir� alterar ...");
				break;
			case 5 :
				System.out.println("Ir� excluir ...");
				break;
			default :
				tv.erro("Op��o inv�lida");
			}
			opc = tv.menu();
		}
		
	}

}
