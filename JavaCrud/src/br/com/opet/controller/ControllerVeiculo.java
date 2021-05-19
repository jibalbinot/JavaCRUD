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
				//System.out.println("Irá cadastrar ...");
				v = tv.adicionar();
				if(v.inserir(v)){
					tv.mensagem("Veiculo inserido com sucesso!");
				} else {
					tv.erro("Veiculo não inserido!");
				}
				break;
			case 2 :
				//System.out.println("Irá consultar");
				v.setId(tv.lerId());
				v = v.consultar(v);
				if(v != null) {
					v.mostrar();
				} else {
					tv.erro("Veiculo não encontrado");
				}
				break;
			case 3 :
				System.out.println("Veiculos cadastrados ...");
				alVeiculo = v.listar();//pegar as informaçoes do BC
				tv.mostrar(alVeiculo);
				break;
			case 4 :
				//System.out.println("Irá alterar ...");
				v = new Veiculo();
				v.setId(tv.lerId());
				v = v.consultar(v);
				if(v != null) {
					v.mostrar();
					v = tv.alterar(v.getId());
					if(v.atualizar(v)) {
						tv.mensagem("Veiculo atualizado com sucesso!");
					} else {
						tv.erro("Veiculo não alterado!");
					}	
				} else {
					tv.erro("Veiculo não encontrado");
				}
				break;
			case 5 :
				System.out.println("Irá excluir ...");
				//implementar valendo 1 ponto
				break;
			default :
				tv.erro("Opção inválida");
			}
			opc = tv.menu();
		}
	}
}
