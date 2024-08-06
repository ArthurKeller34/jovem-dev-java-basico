package avaliacao.semana1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		List<Cliente> listaCliente = new ArrayList<Cliente>();
		Cliente cliente = new Cliente();
		String nomeCliente = JOptionPane.showInputDialog("Qual seu nome? ");
		DateTimeFormatter formatoEsperado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataNascimentoCliente = JOptionPane.showInputDialog("Qual a data do seu nascimento? ");
		LocalDate dataNascimentoClienteFormatada = LocalDate.parse(dataNascimentoCliente, formatoEsperado);
		cliente.add(nomeCliente);
		cliente.add(dataNascimentoClienteFormatada);
		listaCliente.add(cliente);
		List<Produto> listaDeProdutos = new ArrayList<Produto>();
		while (true) {
			Produto produto = new Produto();
			String produtoEscolhidoPeloCliente = JOptionPane.showInputDialog("Qual produto esta levando? (digite fim para sair) ");
			if (produtoEscolhidoPeloCliente.equals("fim")) { 
				break;
			}
			double precoUnidadeProduto = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da unidade deste produto? "));
			int quatidadeDoProduto = Integer.parseInt(JOptionPane.showInputDialog("Quantas unidades esta comprando? "));
			produto.add(produtoEscolhidoPeloCliente);
			produto.add(precoUnidadeProduto);
			produto.add(quatidadeDoProduto);
			listaDeProdutos.add(produto);
		
		} 
		String menuDePagamento = "1 - Cartão de credito" + "\nCartão de debito" + "\nDinheiro";
		int opEscolhida = Integer.parseInt(JOptionPane.showInputDialog(menuDePagamento));
		switch (opEscolhida) {
		case 1:
			
			break;

		case 2:
			break;
			
		case 3:
		}
		
	}
}
