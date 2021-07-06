package view;

import java.util.Scanner;

public class MenuEdicaoEstabView {
	public int telaDeEdicaoEstab() {
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		System.out.println("Menu de edição do estabelecimento");
		System.out.println("");
		
		System.out.println("(1) Editar nome");
		System.out.println("(2) Editar endereço");
		System.out.println("(3) Editar telefone");
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
