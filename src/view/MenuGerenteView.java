package view;

import java.util.Scanner;

public class MenuGerenteView {
	public int telaDeMenuGerente() {
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		System.out.println("Menu de gerente");
		System.out.println("");
		
		System.out.println("(1) Cadastrar mesa");
		System.out.println("(2) Listar mesas disponíveis");
		System.out.println("(3) Listar todas mesas");
		System.out.println("(4) Excluir mesa");
		System.out.println("(5) Liberar mesa");
		System.out.println("(6) Cadastrar funcionário");
		System.out.println("(7) Editar dados do estabelecimento");
		System.out.print("Opcao: ");
		opcao = sc.nextInt();
		
		System.out.println("");
		System.out.println("-------------------");

		return opcao;
	}
	public void telaOpcaoInvalida() {
		System.out.println("Opcao Invalida!");
	}
}
