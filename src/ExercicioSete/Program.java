package ExercicioSete;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
        System.out.println("SISTEMA PARA VERIFICAR COORDENADAS PLANO CARTESIANO  ....");
        System.out.println("INFORME VALOR DE X");
		double valorX = entradaDados.nextDouble();
		System.out.println("INFORME VALOR DE Y");
		double valorY = entradaDados.nextDouble();
		
		if (valorX == 0.0 && valorY == 0.0) {
			System.out.println("Origem");
		}
		else if (valorX == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (valorY == 0.0) {
			System.out.println("Eixo X");
		}
		else if (valorX > 0.0 && valorY > 0.0) {
			System.out.println("Q1");
		}
		else if (valorX < 0.0 && valorY > 0.0) {
			System.out.println("Q2");
		}
		else if (valorX < 0.0 && valorY  < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
		entradaDados.close();
	}

}
