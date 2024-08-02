package avaliacao.semana1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String nomeCliente = JOptionPane.showInputDialog("Qual seu nome? ");
		DateTimeFormatter formatoEsperado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataNascimentoClienteInserida = JOptionPane.showInputDialog("Qual sua data de nascimento? ");
		LocalDate dataNascimentoCliente = LocalDate.parse(dataNascimentoClienteInserida, formatoEsperado);
		List<Cliente> informacoesCliente = new ArrayList<Cliente>();
		for (int i = 0; i < nomeCliente.length(); i++) {
			Cliente cliente = new Cliente();
			cliente.setNome(nomeCliente);
			cliente.setDataNascimento(dataNascimentoCliente);
			informacoesCliente.add(cliente);
		}
		List<Venda> unidades = new ArrayList<Venda>();
		Venda venda = new Venda();
		int totalDeUnidades = Integer
				.parseInt(JOptionPane.showInputDialog("quantas unidades ao total deseja levar hoje?"));
		unidades.add(venda);
		List<Produto> InformacoesVenda = new ArrayList<Produto>();
		for (int i = 0; i < totalDeUnidades; i++) {
			Produto produto = new Produto();
			String nomeProdutoVenda = JOptionPane.showInputDialog("Qual o nome do produto que deseja comprar? ");
			double valorUnidadeProduto = Double
					.parseDouble(JOptionPane.showInputDialog("Quanto é o valor da unidade desse produto? "));
			int quantidadeProdutoVenda = Integer
					.parseInt(JOptionPane.showInputDialog("Quanto desse produto que deseja comprar? "));
			double precoTotalProduto = quantidadeProdutoVenda * valorUnidadeProduto;
			double precoTotalVenda = precoTotalProduto * quantidadeProdutoVenda;
			produto.setNomeProduto(nomeProdutoVenda);
			produto.setPrecoUnidade(valorUnidadeProduto);
			produto.setQuantidade(quantidadeProdutoVenda);
			InformacoesVenda.add(produto);
			if (nomeProdutoVenda.equals("fim") || nomeProdutoVenda.equals(totalDeUnidades)) {
				String menuPagamento = "1- Cartao de credito\n 2- Cartao de debito\n 3- Dinheiro";
				int op = Integer.parseInt(JOptionPane.showInputDialog(menuPagamento));
				switch (op) {
				case 1:
					String formaDePagamento1 = ("Cartao de Credito");
					String cupomCliente1 = "" + "****************** CUPOM ******************" + InformacoesVenda
							+ quantidadeProdutoVenda + "x" + valorUnidadeProduto + precoTotalVenda + "Subtotal: "
							+ precoTotalVenda + "Desconto: " + "Forma de Pagamento: " + formaDePagamento1 + "Nome: "
							+ nomeCliente;
					JOptionPane.showMessageDialog(null, cupomCliente1);
				case 2:
					String formaDePagamento2 = ("Cartao de Debito");
					String cupomCliente2 = "" + "****************** CUPOM ******************" + InformacoesVenda
							+ quantidadeProdutoVenda + "x" + valorUnidadeProduto + precoTotalVenda + "Subtotal: "
							+ precoTotalVenda + "Desconto: " + "Forma de Pagamento: " + formaDePagamento2 + "Nome: "
							+ nomeCliente;
					JOptionPane.showMessageDialog(null, cupomCliente2);
				case 3:
					String formaDePagamento3 = ("Dinheiro");
					String cupomCliente3 = "" + "****************** CUPOM ******************" + InformacoesVenda
							+ quantidadeProdutoVenda + "x" + valorUnidadeProduto + precoTotalVenda + "Subtotal: "
							+ precoTotalVenda + "Desconto: " + "Forma de Pagamento: " + formaDePagamento3 + "Nome: "
							+ nomeCliente;
					JOptionPane.showMessageDialog(null, cupomCliente3);

				}

			}

		}

	}
}
