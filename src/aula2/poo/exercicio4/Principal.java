package aula2.poo.exercicio4;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal extends Carro {

	public static void main(String[] args) {
		List<Carro> carros = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			Carro carroNovo = new Carro();
			String modeloInserido = JOptionPane.showInputDialog("Qual o modelo do carro? ");
			int anoInserido = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano do carro? "));
			String corInserida = JOptionPane.showInputDialog("Qual a cor do carro? ");
			carroNovo.setModelos(modeloInserido);
			carroNovo.setAnos(anoInserido);
			carroNovo.setCores(corInserida);
			carros.add(carroNovo);

		}
		for (Carro carro : carros) {
			String msg = "Modelo: " + carro.getModelos() + "\nAno: " + carro.getAnos() + "\nCore: " + carro.getCores();
			JOptionPane.showMessageDialog(null, msg);
		}
	}
}