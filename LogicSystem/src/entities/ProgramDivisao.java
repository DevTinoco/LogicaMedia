package entities;

import java.util.Locale;
import java.util.Scanner;

public class ProgramDivisao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		//
		
		
		int a,b,c,d,media,soma,resto;
		
		System.out.println("Digite quatro número inteiros: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		media = 4;
		soma= a * b * c * d;
		resto = soma % media;
		
		soma = (a + b + c + d);
		System.out.println("Total da soma:"+ soma);
		media = soma / media;
		System.out.println("Média dos números inteiros: " + media);
		System.out.println("Resto da divisão: " + resto);
		
		
		sc.close();
	}

}
