package aula3.tratamentoerros;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		boolean entradaValida = false;
		int numero = 0;

		while (!entradaValida) {
			String entrada = JOptionPane.showInputDialog("Digite o numero inteiro");
			try {
				numero = Integer.parseInt(entrada);
				entradaValida = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Você digitou um valor não reconhecido");
			}
		}
		JOptionPane.showMessageDialog(null, numero);

	}
}
