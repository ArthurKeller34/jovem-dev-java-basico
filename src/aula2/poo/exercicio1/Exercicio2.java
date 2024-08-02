package aula2.poo.exercicio1;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		String primeiraFrase = JOptionPane.showInputDialog("Digite a priemira frase: ");
		String segundaFrase = JOptionPane.showInputDialog("Digite a segunda frase: ");
		if (primeiraFrase.equals(segundaFrase)) {
			JOptionPane.showMessageDialog(null, "As duas frases são iguais ");
		} else {
			JOptionPane.showMessageDialog(null, "As frases não sao iguais:\n " + "A primeira frase contem "
					+ primeiraFrase.length() + " caracteres\n " + "A segunda frase contem: " + segundaFrase.length() + " caracteres");

		}
	}
}
