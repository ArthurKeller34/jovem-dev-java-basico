package aula2.poo.exercicio1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataInserida = JOptionPane.showInputDialog("Insira uma data: ");
		LocalDate data = LocalDate.parse(dataInserida, formato);
		DayOfWeek diaDaSemana = data.getDayOfWeek();
		JOptionPane.showMessageDialog(null, "O dia da semana dessa data é: " + diaDaSemana);

	}
}
