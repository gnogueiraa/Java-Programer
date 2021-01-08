package aula03;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
    //ordemCrescente();
		//valorAbsoluto();
		//sinalDoNumero();
		//multiplos();
		//diferenca();
		mesAno();
		
		
		
   
	}

/* ler 1 n�mero entre 1 e 12 we eimprimir o mes correspondente
 * exemplo:
 * in: N�mero entre 1 e 12:5
 * out:maio
 * in: numero entre 1 e 12 :17
 * out: N�mero inv�lido. Deve ser entre 1 e 12
 */
	
	public static void mesAno() {
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite um n�mero entre 1 e 12: ");
		int dia = sc.nextInt();
		//mostrar o mes do ano com switch case
		switch (dia) {
		case 1: System.out.println("Janeiro");
		break;
		case 2: System.out.println("Fevereiro");
		break;
		case 3: System.out.println("Mar�o");
		break;
		case 4: System.out.println("Abriu");
		break;
		case 5: System.out.println("Maio");
		break;
		case 6: System.out.println("Junho");
		break;
		case 7: System.out.println("Julho");
		break;
		case 8: System.out.println("Agosto");
		break;
		case 9: System.out.println("Setembro");
		break;
		case 10: System.out.println("Outubro");
		break;
		case 11: System.out.println("Novembro");
		break;
		case 12: System.out.println("Dezembro");
		break;
		default: System.out.println("N�mero Inv�lido. Deve estar entre 1 e 12!");
		
		}
	}
	
	/*
	 * leia 2 n�meros e informe a diferen�a entre eles
	 * exemplo:
	 * in: primeiro numero: 3
	 * in segundo numero: 7
	 * out: a diferen�a � 4. 
	 */
	
	public static void diferenca() {
		String s;
		s = JOptionPane.showInputDialog("Digite um n�mero: ");
		int n1 = Integer.parseInt(s);
		 s = JOptionPane.showInputDialog("Digite outro n�mero: ");
		int n2 = Integer.parseInt(s);
		int n = n2 - n1;
		int dif;
		if (n1>n2) dif = n1 - n2;
		else dif = n2 -n1;
		JOptionPane.showMessageDialog(null, "A Diferen�a � : " + dif);
		
	}
	
	
	
	
	/*
	 * fazer uma rotina que leia dois numeros e mostreo-os em ordem crescente
	 */
	public static void ordemCrescente () {
		String s;
		s = JOptionPane.showInputDialog("Digite um n�mero: ");
		int num_1 = Integer.parseInt(s);
		 s = JOptionPane.showInputDialog("Digite outro n�mero: ");
		int num_2 = Integer.parseInt(s);
		if (num_1 < num_2) JOptionPane.showMessageDialog(null, num_1 +" + " + num_2);	
		 else JOptionPane.showMessageDialog(null, num_2 +" + " + num_1);
			
	}
		/*
		 * ler um numero e retronar um valor absoluto
		 */
	
		
		public static void valorAbsoluto() {
			String s;
			s = JOptionPane.showInputDialog("Digite um n�mero: ");
			int n = Integer.parseInt(s);
			if (n<0) n = n * -1;
			
		}
		
		
		/*
		 * leia um n�mero e informe se � positivo , negativo ou nulo
		 */
	
	public static void sinalDoNumero() {
		String s;
		s = JOptionPane.showInputDialog("Digite um n�mero: ");
		int n = Integer.parseInt(s);
		if (n>0) JOptionPane.showMessageDialog(null, "valor � Positivo:");
		else if  (n<0) JOptionPane.showMessageDialog(null, "valor � Negativo:");
		else JOptionPane.showMessageDialog(null, "valor � Nulo:");
	
	}

/*
 * ler 2 n�meros e informe se s�o multiplos
 * in n1:5
 * in n2:20
 * out 20 � multiplo de 5
 * in primeiro numero 10
 * in seg numero 3
 * out n�o s�o multiplos;
 */

	public static void multiplos() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Primeiro  n�mero: ");
		int n1 = sc.nextInt();
		System.out.print("Segundo  n�mero: ");
		int n2 = sc.nextInt();
		int resto = n1 % n2;
		System.out.println("Resto : " + n1 + "/"+ n2 +" = "+resto);
		if (n1%n2 ==0) System.out.println(n1 + " � m�ltiplo de " +n2);
		else if (n2%n1==0) System.out.println(n2+ " � multiplo de " + n1);
	    else System.out.println("N�o s�o M�ltiplos!");
		
	}
}
