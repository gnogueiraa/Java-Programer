package aula02;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
     //soma();
	//converte();
	//calculaSalarioBruto();
	calculaSalarioLiquido();
		
	}
	
	/*
	 * faca uma rotina que leia o nome do desenvolvedor, o valor da hora
	 * e a quantidade de horas trabalhadas, o percentual do IRF,
	 * e imprima o salário liquido do desnvolvedor.
	 * Exemplo:
	 * in: nome: bill gates
	 * in: valor por hora:120.0
	 * in:quantidade de horas trabalhadas:200
	 * in: percentual do IRF: 15
	 * out bill gates -  Bruto: R$ 24.000,00
	 * out:              IRF: R$:3.600,00
	 * out:              Líquido: R$:20.400,00
	 */
	
	/*
	 * public static void main(String[] args) {
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
	 */
	public static void calculaSalarioLiquido() {
	
		double valorBruto = retornaSalarioBruto();
       Scanner sc = new Scanner (System.in);
	   double irf = sc.nextDouble();
	   double valorIRF = valorBruto * irf/100;
	  double valorLiquido = valorBruto - valorIRF;
	  System.out.print("Salário Bruto: "+ valorBruto);
	  System.out.print("Valor do IRF: " + valorIRF);
	  System.out.print("Salário Líquido : R$ "+ valorLiquido);
	  
	}
		
	public static double retornaSalarioBruto() {
			int horas;
			double valor;
			String nome;
			Scanner sc = new Scanner(System.in);
			System.out.print("Nome : ");
			nome = sc.nextLine();
			System.out.print("Valor por hora : ");
			valor= sc.nextDouble();
			System.out.print("Quantidade de horas trabalhadas: ");
			horas= sc.nextInt();
		
			return (valor*horas);
		
		}
		
	
	/*
	 * Faça uma rotina que leia o nome do desenvolvedor, o valor da hora
	 * e a quantidade de horas trabalhadas, e imprima o salario toltal
	 * do desenvolvedor.
	 * exemplo:
	 * in: nome: bill Gates
	 * in valor por hora: 120.00
	 * in: quantidade de horas trabalhadas: 200
	 * out: bill gates = 24000.0
	 */
	
	public static void calculaSalarioBruto() {
		
		/*
		 * String nome;
		String sobrenome;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		nome = sc.next();
		sobrenome = sc.next();
		System.out.println(nome + " " + sobrenome);
		 */
		int horas;
		double valor_horas;
		String nome;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome : ");
		nome = sc.nextLine();
		System.out.print("Valor por hora : ");
		valor_horas= sc.nextDouble();
		System.out.print("Quantidade de horas trabalhadas: ");
		horas= sc.nextInt();
	System.out.println(nome + " - R$ " + (horas * valor_horas));
	sc.close();
	}
	/*
	 * ler a temperatura em graus Celsius e imprimir o valor
	 * correspondente em graus fahrenheit e kelvin
	 * f= c * 9/5 + 32
	 * k= c + 273,15
	 * exemplo
	 * in temperatura em celsius: 30
	 * out: temperatura em fahrenheit = xxxx ºf
	 * out temperatura em kelvin = xxx K
	 */
	
	public static void converte() {
		double celsius;   // graus celsius
		double fahr;       // graus fahrennheit
		double kelvin;    // graus kelvin
		Scanner sc = new Scanner(System.in);
	       System.out.print("Digite a temperatura em Celsius: ");
	       celsius = sc.nextDouble();
	       fahr = celsius * (9.0/5.0) + 32;
	       kelvin = celsius + 273.15;
	       System.out.println("Temperatura em Fahrenheit = " + fahr +"ºF" +
	    		             "Temperatura em Kelvin = " + kelvin + "K");
	       sc.close();
	}
		

   
	
	
	/*
      * Crie uma rotina que leia 2 números inteiros
      * e imprima a soma dos números
      */
	public static void soma() {
	   int n1;
	   int n2;
	   
       Scanner sc = new Scanner(System.in);
       System.out.print("Digite o valor A: ");
       n1 = sc.nextInt();
       System.out.print("Digite o valor B: ");
       n2 = sc.nextInt();
       System.out.print("Soma = " + (n1+ n2 ));
		sc.close();
	}
	}
        
