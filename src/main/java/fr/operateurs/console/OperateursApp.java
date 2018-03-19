package fr.operateurs.console;

import java.util.Scanner;

public class OperateursApp {
	public static void main(String[] args){
		System.out.println("Veillez saisir le premier nombre...");
		Scanner questionUser = new Scanner(System.in);
		int a = questionUser.nextInt();
		System.out.println("Veillez saisir le second nombre...");
		Scanner questionUser2 = new Scanner(System.in);
		int b = questionUser2.nextInt();
		System.out.println("<nombre_1> + <nombre_2> = <résultat du calcul>"
				+ "\n a - b = " 
				+ "\n<nombre_1> * <nombre_2> = <résultat du calcul>"
				+ "\n<nombre_1> / <nombre_2> = <résultat du calcul>"
				+ "\n<nombre_1> % <nombre_2> = <résultat du calcul>");
	}
}
