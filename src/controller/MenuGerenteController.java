package controller;


import view.MenuGerenteView;

public class MenuGerenteController {
	private MenuGerenteView menuGerenteView;
	private CadastrarMesasController cadastrarMesasController;
	private CadastrarFuncionarioController cadastrarFuncionarioController;
	private ListarMesasDisponiveisController listarMesasDisponiveisController;
	private ListarTodasMesasController listarTodasMesasController;
	private ExcluirMesaController excluirMesaController;
	private LiberarMesaController liberarMesaController;
	private MenuEdicaoEstabController editarEstabController;

	public MenuGerenteController() {
		menuGerenteView = new MenuGerenteView();
		int opcao = 0;
		opcao = menuGerenteView.telaDeMenuGerente();

		switch (opcao) {
			case 1 -> cadastrarMesasController = new CadastrarMesasController();
			case 2 -> {
				listarMesasDisponiveisController = new ListarMesasDisponiveisController();
				listarMesasDisponiveisController.listarMesasDisponiveisController();
			}
			case 3 -> listarTodasMesasController = new ListarTodasMesasController();
			case 4 -> excluirMesaController = new ExcluirMesaController();
			case 5 -> liberarMesaController = new LiberarMesaController();
			case 6 -> cadastrarFuncionarioController = new CadastrarFuncionarioController();
			case 7 -> editarEstabController = new MenuEdicaoEstabController();
			default -> menuGerenteView.telaOpcaoInvalida();
		}

	}
}
