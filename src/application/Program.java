package application;

import java.util.Scanner;

import entities.convercao;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Qual a cota��o do d�lar atualmente?  ");
		
		convercao.cot = sc.nextDouble();
		
		System.out.print("Quantos d�lares voc� quer comprar?  ");
		
		convercao.dolar = sc.nextDouble();
		
		System.out.printf("Valor em reais a pagar:  %.2f", convercao.calculo());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
