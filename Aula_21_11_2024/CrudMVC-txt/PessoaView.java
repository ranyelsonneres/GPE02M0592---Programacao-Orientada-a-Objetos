package view;

import controller.PessoaController;
import model.Pessoa;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class PessoaView extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtNome, txtEmail, txtId;
    private JButton btnSalvar, btnDeletar, btnListar, btnLimpar;;
    private JTable tabela;
    private DefaultTableModel modelo;
    private PessoaController controller;

    public PessoaView(PessoaController controller) {
        this.controller = controller;

        setTitle("Exemplo - CRUD");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JPanel painelFormulario = new JPanel();
        painelFormulario.setLayout(null);
        painelFormulario.setBounds(10, 10, 670, 150);

        JLabel lblId = new JLabel("ID:");
        lblId.setBounds(10, 10, 80, 25);
        painelFormulario.add(lblId);

        txtId = new JTextField();
        txtId.setBounds(100, 10, 200, 25);
        txtId.setEditable(false);
        painelFormulario.add(txtId);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(10, 40, 80, 25);
        painelFormulario.add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(100, 40, 200, 25);
        painelFormulario.add(txtNome);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(10, 70, 80, 25);
        painelFormulario.add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(100, 70, 200, 25);
        painelFormulario.add(txtEmail);

        btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(10, 100, 100, 30);
        painelFormulario.add(btnSalvar);

        btnDeletar = new JButton("Deletar");
        btnDeletar.setBounds(120, 100, 100, 30);
        painelFormulario.add(btnDeletar);

        btnListar = new JButton("Listar");
        btnListar.setBounds(230, 100, 100, 30);
        painelFormulario.add(btnListar);
        
        btnLimpar = new JButton("Limpar");
        btnLimpar.setBounds(340, 100, 100, 30);
        painelFormulario.add(btnLimpar);

        getContentPane().add(painelFormulario);

        modelo = new DefaultTableModel(new String[]{"ID", "Nome", "Email"}, 0);
        tabela = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tabela);
        scrollPane.setBounds(10, 170, 670, 250);
        getContentPane().add(scrollPane);

        btnSalvar.addActionListener(e -> salvarPessoa());
        btnDeletar.addActionListener(e -> deletarPessoa());
        btnListar.addActionListener(e -> listarPessoas());
        btnLimpar.addActionListener(e -> limparCampos());

        tabela.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = tabela.getSelectedRow();
                if (row != -1) {
                    txtId.setText(modelo.getValueAt(row, 0).toString());
                    txtNome.setText(modelo.getValueAt(row, 1).toString());
                    txtEmail.setText(modelo.getValueAt(row, 2).toString());
                }
            }
        });

        setLocationRelativeTo(null);
    }

    private void salvarPessoa() {
        int id = txtId.getText().isEmpty() ? 0 : Integer.parseInt(txtId.getText());
        String nome = txtNome.getText();
        String email = txtEmail.getText();
        Pessoa pessoa = new Pessoa(id, nome, email);

        if (controller.salvar(pessoa)) {
            JOptionPane.showMessageDialog(this, "Pessoa salva com sucesso!");
            listarPessoas();
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao salvar pessoa!");
        }
    }

    private void deletarPessoa() {
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecione uma pessoa para deletar.");
            return;
        }

        int id = Integer.parseInt(txtId.getText());
        int confirmacao = JOptionPane.showConfirmDialog(this, "Deseja realmente deletar a pessoa?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (confirmacao == JOptionPane.YES_OPTION) {
            if (controller.deletar(id)) {
                JOptionPane.showMessageDialog(this, "Pessoa deletada com sucesso!");
                listarPessoas();
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao deletar pessoa!");
            }
        }
    }

    private void listarPessoas() {
        modelo.setRowCount(0);
        List<Pessoa> pessoas = controller.listar();
        for (Pessoa pessoa : pessoas) {
            modelo.addRow(new Object[]{pessoa.getId(), pessoa.getNome(), pessoa.getEmail()});
        }
    }

    private void limparCampos() {
        txtId.setText("");
        txtNome.setText("");
        txtEmail.setText("");
    }
}
