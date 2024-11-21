package dao;

import model.Pessoa;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {

    private static final String ARQUIVO = "data/pessoas.txt"; 

    public PessoaDAO() {
        File diretorio = new File("data");
        if (!diretorio.exists()) {
            diretorio.mkdir();
        }
    }

   
    public boolean salvar(Pessoa pessoa) {
        List<Pessoa> pessoas = listar();  
        boolean encontrado = false;


        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getId() == pessoa.getId()) {
                pessoas.set(i, pessoa);
                encontrado = true;
                break;
            }
        }


        if (!encontrado) {
            int novoId = pessoas.isEmpty() ? 1 : pessoas.get(pessoas.size() - 1).getId() + 1;
            pessoa.setId(novoId);
            pessoas.add(pessoa); 
        }

        return gravarArquivo(pessoas);
    }

    public List<Pessoa> listar() {
        List<Pessoa> pessoas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                int id = Integer.parseInt(dados[0]);
                String nome = dados[1];
                String email = dados[2];
                pessoas.add(new Pessoa(id, nome, email));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pessoas;
    }


    public boolean deletar(int id) {
        List<Pessoa> pessoas = listar();
        boolean removido = false;
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getId() == id) {
                pessoas.remove(i);
                removido = true;
                break;
            }
        }
        return removido && gravarArquivo(pessoas);
    }

    private boolean gravarArquivo(List<Pessoa> pessoas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO))) {
            for (Pessoa pessoa : pessoas) {
                writer.write(pessoa.getId() + "," + pessoa.getNome() + "," + pessoa.getEmail());
                writer.newLine();
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
