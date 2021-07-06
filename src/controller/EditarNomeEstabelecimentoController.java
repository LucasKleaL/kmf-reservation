package controller;

import dao.EstabDAO;
import model.Estabelecimento;
import view.EditarEstabelecimentoView;

public class EditarNomeEstabelecimentoController {
	private EditarEstabelecimentoView eev;
	private Estabelecimento estabelecimento;
	private EstabDAO estabDAO;

	public EditarNomeEstabelecimentoController() {
		estabelecimento = new Estabelecimento();

		eev = new EditarEstabelecimentoView();
		
		

		estabDAO = new EstabDAO();
		estabDAO.alteraNome(eev.telaEditarNome());
	}
}

