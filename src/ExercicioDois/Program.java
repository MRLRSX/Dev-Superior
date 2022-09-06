package ExercicioDois;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner entradaDados = new Scanner(System.in);
       
       System.out.println("Informe o numero para verificação");
       int valorUm = entradaDados.nextInt();
       
       if(valorUm % 2 == 0){
    	   System.out.println("NUMERO E PAR");
       }else {
    	   System.out.println("NUMERO E IMPAR");
       }
       entradaDados.close();
	}
}
