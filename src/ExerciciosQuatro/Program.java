package ExerciciosQuatro;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner entradaDados = new Scanner(System.in);
      int duracao;
      
      System.out.println("SISTEMA PARA VERIFICAR HORAS DE JOGO ....");
      System.out.println("INFORME A HORA INICIAL ...");
      int horaInicial = entradaDados.nextInt();
      System.out.println("INFORME A HORA FINAL ....");
      int horaFinal = entradaDados.nextInt();
      
      if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
      
      entradaDados.close();
	}
}
