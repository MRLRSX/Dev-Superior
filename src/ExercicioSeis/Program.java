package ExercicioSeis;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);

		System.out.println("SISTEMA PARA VERIFICAR INTERVALO ....");
		System.out.println("INFORME O NUMERO PARA VERIFICAR O INTERVALO ....");
		double valorUm = entradaDados.nextDouble();

		if (valorUm > 0 && valorUm <= 25) {
			System.out.println("0 A 25");
		} else if (valorUm > 25 && valorUm <= 50) {
			System.out.println("26 A 50");
		} else if (valorUm > 50 && valorUm <= 75) {
			System.out.println("51 A 75");
		} else if (valorUm > 75 && valorUm <= 100) {
			System.out.println("76 A 100");
		} else {
			System.out.println("ACIMA DE 100");
		}

		entradaDados.close();
	}
}
