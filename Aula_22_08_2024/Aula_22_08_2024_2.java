import javax.swing.JOptionPane;

public class Aula_22_08_2024_2 {

	public static void main(String[] args) {
		
		//Entrada de dados (Caixa de dialogo)
		String nome = JOptionPane.showInputDialog("Nome: ");
		JOptionPane.showMessageDialog(null, nome);
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("N1: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("N2: "));
		
		int resultado = (num1 * num2) + 2;
		JOptionPane.showMessageDialog(null, resultado);
		
		
	}

}
