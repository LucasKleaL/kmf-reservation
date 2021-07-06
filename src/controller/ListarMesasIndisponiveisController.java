package controller;

import java.sql.ResultSet;

import dao.MesaDAO;
import view.ListarMesasIndisponiveisView;

public class ListarMesasIndisponiveisController {
	private MesaDAO mesaDAO;
    private ResultSet rs;
    private ListarMesasIndisponiveisView lmv;

    public Boolean listarMesasIndisponiveisController() {

        mesaDAO = new MesaDAO();
        rs = mesaDAO.listarMesasIndisponiveis();
        lmv = new ListarMesasIndisponiveisView();
        return lmv.telaListarMesasDisponiveis(rs);
    }
}
