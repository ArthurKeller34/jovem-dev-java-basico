package aula2.poo.exercicio1;

import javax.swing.JOptionPane;

public class Principal extends Carro {

	public static void main(String[] args) {
		String menu = "1 - Cadastrar carro\n 2 - Voltar ";
		int op = Integer.parseInt(JOptionPane.showInputDialog(menu));

		switch (op) {
		case 1:

			String modeloInserido = JOptionPane.showInputDialog("Qual o modelo dos carros? ");
			String anoInserido = JOptionPane.showInputDialog("Qual os anos dos carros? ");
			String corInserida = JOptionPane.showInputDialog("Qual as cores dos carros? ");
			Carro modelo = new Carro();
			Carro ano = new Carro();
			Carro cor = new Carro();
			Carro.modelos = new Carro();
			Carro.add(ano);
			Carro.add(cor);
			JOptionPane.showMessageDialog(null, "modelos: " + modeloInserido + "\nanos: " + anoInserido + "\ncores: " + corInserida);
		case 2:
			break;
		}

	}
}

