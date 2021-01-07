package aula02;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		int valor;
		//entradaTexto();
		//lendoLinhaToda();
		//lendoNumeros();
		
		valor = retorno();
		System.out.println("o retorno foi: " + valor);
	}
	
	public static int retorno () {
	   int n1 = 10;
	   int n2 = 5;
	   int total = n1 * n2;
	   return total;
	}
	
	
	public static void lendoNumeros() {
		int n1;     // n�meros inteiros
		double n2;  // valores decimais 
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro: ");
		n1 = sc.nextInt();   // l� um inteiro
		System.out.print("Digite um n�mero real: ");
		n2 = sc.nextDouble();  // l� um double
		System.out.println("Inteiro = " + n1 + "\nDecimal = " + n2);
		sc.close();
	}
	
	public static void entradaTexto() {
		String nome;
		String sobrenome;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		nome = sc.next();
		sobrenome = sc.next();
		System.out.println(nome + " " + sobrenome);
		sc.close();
	}
	
	public static void lendoLinhaToda() {
		String linha;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um texto: ");
		linha = sc.nextLine();
		System.out.println(linha);
		sc.close();
	}

}
