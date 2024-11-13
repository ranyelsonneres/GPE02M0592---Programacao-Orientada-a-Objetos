package interface_grafica;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MinhaJanela extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//instanciar as variaveis
	JButton botao, botao2;
	
	//cria o construtor
	public MinhaJanela() {
		super("Interface");
		this.setSize(500, 430); //tamanho da janela
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//encerrar a janela
		this.setLocationRelativeTo(null);//centralizar a janela
		getContentPane().setLayout(null);
		
		//criar um botão
		botao = new JButton("Botão 1");
		botao.setBounds(224, 41, 115, 22);//adicionar a posição do botão
		getContentPane().add(botao);
		
		
		
		
		Button button3 = new Button("Botão 3");
		button3.setBounds(258, 150, 162, 50);
		getContentPane().add(button3);
		
		Label label = new Label("Nome");
		label.setBounds(35, 41, 62, 22);
		getContentPane().add(label);
		
		TextField textField = new TextField();
		textField.setBounds(103, 41, 102, 22);
		getContentPane().add(textField);
		
		botao2 = new JButton("Botão 2");
		botao2.setBounds(29, 150, 200, 50);
		getContentPane().add(botao2);
		botao2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//adicionar o evento
				String texto = textField.getText();
				JOptionPane.showMessageDialog(null, texto);
			}
		});
		
		Checkbox checkbox = new Checkbox("New check box");
		checkbox.setBounds(29, 85, 95, 22);
		getContentPane().add(checkbox);
		
		//adcionar uma ação (evento)
		botao.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Olá");
		});
		
		
		
	
	}
}
