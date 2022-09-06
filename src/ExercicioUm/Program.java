package ExercicioUm;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner entradaDados = new Scanner(System.in);
       
       System.out.println("Informe Numero para Comparação");
       int valorUm = entradaDados.nextInt();
       
       if(valorUm < 0 ) {
    	   System.out.println("NEGATIVO");
       }else {
    	   System.out.println("POSITIVO");
       }
       
       entradaDados.close();
	}
}
