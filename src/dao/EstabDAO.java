package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Estabelecimento;


public class EstabDAO {
	private Conexao conexao;
	private String query;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public EstabDAO() {
		conexao = conexao.getInstance();
	}
	
	public void alteraNome(Estabelecimento estab) {

		try {
			query = "UPDATE estabelecimento SET nome = ?";
			ps = conexao.getConexao().prepareStatement(query);

			ps.setString(1, estab.getNome());

			ps.executeUpdate();
			
			ps.close();
		} catch (SQLException e) {

		}
	}
	
	public void alteraTelefone(Estabelecimento estab) {

		try {
			query = "UPDATE estabelecimento SET telefone = ?";
			ps = conexao.getConexao().prepareStatement(query);

			ps.setString(1, estab.getTelefone());

			ps.executeUpdate();
			
			ps.close();
		} catch (SQLException e) {

		}
	}

	public void alteraEndereco(Estabelecimento estab) {

		try {
			query = "UPDATE estabelecimento SET endereco = ?";
			ps = conexao.getConexao().prepareStatement(query);

			ps.setString(1, estab.getEndereco());

			ps.executeUpdate();
			
			ps.close();
		} catch (SQLException e) {

		}
	}
	public ResultSet listarEstabelecimentos() {
		try {
			query = "SELECT * FROM estabelecimentos";
			ps = conexao.getConexao().prepareStatement(query);
			
			rs = ps.executeQuery();
			
			return rs;
		}catch (SQLException e) {

		}return null;
	}
}