package aula03;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		//comSwitch();
		comIf();
		
		
	}
	
	public static void comIf() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um n�mero entre 1 e 7");
		int dia = dia = sc.nextInt();
		if (dia ==1) System.out.println("Domingo");
		else if (dia ==2) System.out.println("Segunda-feira");
		else if (dia ==3) System.out.println("Ter�a-feira");
		else if (dia ==4) System.out.println("Quarta-feira");
		else if (dia ==5) System.out.println("Quinta-feira");
		else if (dia ==6) System.out.println("Sexta-feira");
		else System.out.println("Sabado");
	}
	
	
	
	
	/* ler um n�mero inteiro entre 1 e 7 e mostrar o 
	 * respectivo dia da semana
	 */
	
	public static void comSwitch() {
		//abrindo a entrada de dados pelo teclado
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite um n�mero entre 1 e 7: ");
		int dia = sc.nextInt();
		//mostrar o dia da semana com switch case
		switch (dia) {
		case 1: System.out.println("Domingo");
		break;
		case 2: System.out.println("Segunda-feira");
		break;
		case 3: System.out.println("Ter�a-feira");
		break;
		case 4: System.out.println("Quarta-feira");
		break;
		case 5: System.out.println("Quinta -feira");
		break;
		case 6: System.out.println("Sexta-feira");
		break;
		case 7: System.out.println("S�bado");
		break;
		default: System.out.println("N�mero Inv�lido. Deve estar entre 1 e 7!");
		
		}
	}
	
}
