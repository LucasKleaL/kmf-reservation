package controller;

import view.LoginView;

public class LoginController {
	private LoginView loginView;
	private MenuClienteController mcc;
	private MenuFuncionarioController mfc;
	private MenuGerenteController mgc;

	public LoginController() {
		loginView = new LoginView();
		int opcao = 0;
		while(true) {
			opcao = loginView.telaDeLogin();
			
			switch (opcao) {
			case 1 -> mcc = new MenuClienteController();
			case 2 -> mfc = new MenuFuncionarioController();
			case 3 -> mgc = new MenuGerenteController();
			default -> loginView.telaOpcaoInvalida();
			}	
		}
	}
}
