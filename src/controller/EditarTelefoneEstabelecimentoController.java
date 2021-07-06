package controller;


import model.Estabelecimento;
import view.CadastrarClienteView;
import view.EditarEstabelecimentoView;
import dao.EstabDAO;

public class EditarTelefoneEstabelecimentoController {
    private EditarEstabelecimentoView eev;
    private Estabelecimento estabelecimento;
    private EstabDAO estabDAO;

    public EditarTelefoneEstabelecimentoController() {
    	
		estabelecimento = new Estabelecimento();


        eev = new EditarEstabelecimentoView();



        estabDAO = new EstabDAO();
        estabDAO.alteraTelefone(eev.telaEditarTelefone());
    }
}