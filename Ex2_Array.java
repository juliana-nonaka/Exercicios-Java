package Familia58;

import java.util.Scanner;

public class Ex2_Array {

	public static void main(String[] args) {


		int[] vetor = new int[6];
		int x, somaPar = 0, contPar = 0, contImpar = 0;

		Scanner leia = new Scanner(System.in);


		for (x = 0; x < 6; x++) {
			System.out.println("Digite um n�mero inteiro:");
			vetor[x] = leia.nextInt();
			if (vetor[x] % 2 == 0) {
				somaPar += vetor[x];
				contPar++;
			} else {
				contImpar++;
			}

		}
		
		System.out.println("a)N�meros pares digitados: ");
		for (x = 0; x < 6; x++) {
		if (vetor[x] % 2 == 0) {

			System.out.println(vetor[x] + " ");
		}

		}
		System.out.println("b)Soma dos n�meros pares digitados: \n" + somaPar);
		System.out.println("c)N�meros �mpares digitados: ");
		for (x = 0; x < 6; x++) {

		if (vetor[x] % 2 != 0) {
			System.out.println(vetor[x] + " ");
		}

	
		}
		System.out.println("d)Quantidade de n�meros �mpares digitados: \n" + contImpar);

	}

}
