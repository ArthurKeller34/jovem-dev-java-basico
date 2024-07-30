package aula2.poo.exercicio1;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		double numDigitado = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero com virgula: "));
		int numSemVirgula = (int) numDigitado;
		JOptionPane.showMessageDialog(null, " seu numero sem a virgula é: " + numSemVirgula);
	}
}
