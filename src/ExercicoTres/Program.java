package ExercicoTres;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
	  Locale.setDefault(Locale.US);
      Scanner entradaDados = new Scanner(System.in);
      
      System.out.println("SISTEMA DE VERIFICAÇÃO DE MULTIPLOS ...");
      
      System.out.println("INFORME O PRIMEIRO NUMERO");
      int valorUm = entradaDados.nextInt();
      System.out.println("INFORME O SEGUNDO NUMERO");
      int valorDois = entradaDados.nextInt();
      
      if(valorUm % valorDois == 0 || valorDois % valorUm == 0) {
    	  System.out.println("SÃO MULTIPLOS");
      }else {
    	  System.out.println("NÃO SÃO MULTIPLOS");
      }
      
      entradaDados.close();
	}
}
