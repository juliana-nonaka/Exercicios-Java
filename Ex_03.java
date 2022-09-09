package Familia58;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
int x;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme sua idade: ");
		x = leia.nextInt();
		
		if(x>=10 && x<=14) {
		System.out.println("\n10-14: Categoria Infantil");
		}
		else if (x>=15 && x<=17) {
			System.out.println("\n15-17: Categoria Juvenil");
			
		}
		else if (x>=18 && x<25) {
			System.out.println("\n18-25: Categoria Adulto");
		}
		else {
			System.out.println("\nInsira uma idade válida!");
		}
	}




	}


