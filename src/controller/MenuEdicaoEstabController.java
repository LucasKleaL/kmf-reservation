package controller;

import view.MenuEdicaoEstabView;
import view.MenuFuncionarioView;

public class MenuEdicaoEstabController {
	private MenuEdicaoEstabView menuEdicaoEstabView;
	private EditarNomeEstabelecimentoController editarNomeEstab;
	private EditarTelefoneEstabelecimentoController editarTelefoneEstab;
	private EditarEnderecoEstabelecimentoController editarEnderecoEstab;
	public MenuEdicaoEstabController() {
		menuEdicaoEstabView = new MenuEdicaoEstabView();
		int opcao = 0;
		opcao = menuEdicaoEstabView.telaDeEdicaoEstab();

		switch (opcao) {
			case 1 -> editarNomeEstab = new EditarNomeEstabelecimentoController();
			case 2 -> editarEnderecoEstab = new EditarEnderecoEstabelecimentoController();
			case 3 -> editarTelefoneEstab = new EditarTelefoneEstabelecimentoController();
			
			default -> menuEdicaoEstabView.telaOpcaoInvalida();
		}

	}
}
