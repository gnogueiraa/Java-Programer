package aula03;

import javax.swing.JOptionPane;

public class Condicional {

	public static void main(String[] args) {
       //compara();
		//ternario();
		bloco();
	}
	
	public static void bloco() {
	    int num = 10;
		if (10>0) {
			System.out.println("10 � maior que zero");
			System.out.println("10 � positivo");
			System.out.println("10 � um n�mero bonito");
		} else {
			System.out.println("10 nao � maior que zero");
			System.out.println("10 n�o � positivo");
			System.out.println("10 continua sendo um n�mero bonito");
		}
	}

	public static void compara() {
	  String s = JOptionPane.showInputDialog("Digite um n�mero");
	int num = Integer.parseInt(s);
	if (num > 10) JOptionPane.showMessageDialog(null, "o n�mero � maior que 10");
	else if (num < 10) JOptionPane.showMessageDialog(null, "o n�mero � menor que 10");
	else JOptionPane.showMessageDialog(null, "o n�mero � igual a 10");
	
	}
	public static void ternario() {
		 String s = JOptionPane.showInputDialog("Digite um n�mero");
			int num = Integer.parseInt(s);
			JOptionPane.showMessageDialog(null, (num >10)? "o n�mero � menor que 10":
				                                            "o n�mero n�o � maior que 10");
	}

}