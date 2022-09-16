package br.com.generation.exercicios6;

import java.util.Scanner;

public class Animal {
	
	Scanner scan = new Scanner(System.in);
	
	
	private String nome;
	private int idade;
	
	public String getNome() {
		System.out.print("Digite o nome:");
		nome = scan.nextLine();
		
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
