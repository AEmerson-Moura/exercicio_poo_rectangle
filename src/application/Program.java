package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculador de AREA PERIMETRO e DIAGONAL de um Retangulo:");
		System.out.print("Largura: ");
		double width = sc.nextDouble();
		System.out.println("Altura: ");
		double height = sc.nextDouble();
		
		Rectangle rectangle = new Rectangle(width, height);
		System.out.println("AREA = "+ String.format("%.2f", rectangle.Area()));
		System.out.println("PERIMETRO = "+ String.format("%.2f", rectangle.Perimeter()));
		System.out.println("DIAGONAL = "+ String.format("%.2f", rectangle.Diagonal()));
		
		
		sc.close();
	}

}
