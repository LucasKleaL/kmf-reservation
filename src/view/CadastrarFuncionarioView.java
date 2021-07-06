package view;

import java.util.Scanner;
import model.Funcionario;

public class CadastrarFuncionarioView {
	private Funcionario funcionario;

	public Funcionario telaCadastrarFuncionario() {

		funcionario = new Funcionario();
		Scanner s = new Scanner(System.in);

		System.out.print("Digite o nome do funcionário: ");
		funcionario.setNome(s.nextLine());
		System.out.println("Funcionário adicionado com sucesso!");

		return funcionario;
	}
}
