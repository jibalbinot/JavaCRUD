package br.com.opet.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.opet.model.Veiculo;

/*
 * Classe responsável por manipular (CRUD) o BD
 * 
 *  ---- No MySQL ----
 * create database veiculoDB;
 * use veiculoDB;
 * create table veiculo (id BIGINT NOT NULL AUTO_INCREMENT, placa VARCHAR(8), ano INT, primary key (placa));
 * insert into veiculo (placa, ano) values ("BAL-1705",2021);
 * select * from veiculo;
 */
public class VeiculoDAO {

	public ArrayList<Veiculo> listar() {
		ArrayList<Veiculo> alVeiculo = new ArrayList<>();
		Connection c = null;
		String clausula = "";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			c = FabricaDeConexoes.pegaConexao(true);
			clausula = "select id, placa, ano from veiculo";
			ps = c.prepareStatement(clausula);
			rs = ps.executeQuery();
			while (rs.next()) {
				Veiculo v = new Veiculo();// cria um bean
				v.setId(rs.getInt("id"));
				v.setPlaca(rs.getString("placa"));
				v.setAno(rs.getInt("ano"));
				alVeiculo.add(v);
			}
			// fechar os elementos na ordem inversa
			rs.close();
			ps.close();
			c.close();
			return alVeiculo;// retorna a lista com os veiculos
		} catch (ClassNotFoundException e) {
			return null;
		} catch (SQLException e) {
			try {
				rs.close();
				ps.close();
				c.close();
			} catch (SQLException e1) {
				return null;
			}
			return null;
		}
	}

	public boolean inserir(Veiculo v) {
		// implementar
		return false;
	}

	public boolean autualizar(int id) {
		// implementar
		return false;
	}

	public boolean excluir(Veiculo v) {
		// implementar
		return false;
	}
}
