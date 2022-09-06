package ExercicioCinco;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		double total = 0;

		System.out.println("    TABELA DE PREÇOS         ....");
		System.out.println("1 - Cachorro Quente  R$4,00  ....");
		System.out.println("2 - X-Salada         R$4.50  ....");
		System.out.println("3 - X-Bancon         R$5.00  ....");
		System.out.println("4 - Torrada Simples  R$2.00  ....");
		System.out.println("5 - Refrigerante     R$1.50  ....");

		System.out.println("INFORME O CODIGO DO PRODUTO");
		int codigoProduto = entradaDados.nextInt();

		System.out.println("INFORME A QUANTIDADE DO PRODUTO");
		int quantidadeProduto = entradaDados.nextInt();

		switch (codigoProduto) {

		case 1:
			total = quantidadeProduto * 4.0;
			break;
		case 2:
			total = quantidadeProduto * 4.5;
			break;
		case 3:
			total = quantidadeProduto * 5.0;
			break;
		case 4:
			total = quantidadeProduto * 2.0;
			break;
		case 5:
			total = quantidadeProduto * 1.5;
			break;
		default:
			System.out.println("QUANTIDADE OU CODIGO INCORRETO !!!");
			break;
		}
		System.out.printf("VALOR TOTAL DA COMPRA E R$ %.2f", total);

		entradaDados.close();
	}
}
