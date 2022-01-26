package application;

import java.util.Scanner;

import entities.convercao;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Qual a cotação do dólar atualmente?  ");
		
		convercao.cot = sc.nextDouble();
		
		System.out.print("Quantos dólares você quer comprar?  ");
		
		convercao.dolar = sc.nextDouble();
		
		System.out.printf("Valor em reais a pagar:  %.2f", convercao.calculo());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
