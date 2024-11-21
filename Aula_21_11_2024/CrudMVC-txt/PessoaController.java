package controller;

import dao.PessoaDAO;
import model.Pessoa;

import java.util.List;

public class PessoaController {
    private PessoaDAO pessoaDAO;

    public PessoaController() {
        this.pessoaDAO = new PessoaDAO();
    }

    public boolean salvar(Pessoa pessoa) {
        return pessoaDAO.salvar(pessoa);
    }

    public boolean deletar(int id) {
        return pessoaDAO.deletar(id);
    }

     public List<Pessoa> listar() {
        return pessoaDAO.listar();
    }
}
