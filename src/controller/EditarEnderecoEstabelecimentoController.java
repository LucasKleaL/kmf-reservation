package controller;


import model.Estabelecimento;
import view.CadastrarClienteView;
import view.EditarEstabelecimentoView;
import dao.EstabDAO;

public class EditarEnderecoEstabelecimentoController {
    private EditarEstabelecimentoView eev;
    private Estabelecimento estabelecimento;
    private EstabDAO estabDAO;

    public EditarEnderecoEstabelecimentoController() {
        estabelecimento = new Estabelecimento();

        eev = new EditarEstabelecimentoView();

        estabelecimento = eev.telaEditarEndereco();

        estabDAO = new EstabDAO();
        estabDAO.alteraNome(eev.telaEditarEndereco());
    }
}