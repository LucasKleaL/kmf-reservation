package view;

import java.util.Scanner;

import model.Estabelecimento;
import model.Mesa;

public class EditarEstabelecimentoView {
	 public Estabelecimento telaEditarNome() {
	        Estabelecimento estab = new Estabelecimento();
	        Scanner s = new Scanner(System.in);
	        
	        System.out.println("----------------------------");
	        System.out.println("Edição de estabelecimento");
	        System.out.println("----------------------------");
	        System.out.print("Digite o nome: ");
	        estab.setNome(s.next());
	        System.out.println("Nome alterado com sucesso!");
	        System.out.println("----------------------------");

	        return estab;
	    }
	 public Estabelecimento telaEditarTelefone() {
	        Estabelecimento estab = new Estabelecimento();
	        Scanner s = new Scanner(System.in);
	        
	        System.out.println("----------------------------");
	        System.out.println("Edição de estabelecimento");
	        System.out.println("----------------------------");
	        System.out.print("Digite o telefone: ");
	        estab.setTelefone(s.next());
	        System.out.println("Telefone alterado com sucesso!");
	        System.out.println("----------------------------");

	        return estab;
	    }
	 public Estabelecimento telaEditarEndereco() {
	        Estabelecimento estab = new Estabelecimento();
	        Scanner s = new Scanner(System.in);
	        
	        System.out.println("----------------------------");
	        System.out.println("Edição de estabelecimento");
	        System.out.println("----------------------------");
	        System.out.print("Digite o endereco: ");
	        estab.setEndereco(s.next());
	        System.out.println("Endereco alterado com sucesso!");
	        System.out.println("----------------------------");

	        return estab;
	    }
}
