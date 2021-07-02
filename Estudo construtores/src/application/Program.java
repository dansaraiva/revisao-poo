package application;

import java.util.Locale;
import java.util.Scanner;

import enitites.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock ");
		int quantity = sc.nextInt();
		
		Product p = new Product(name, price, quantity);
		
		System.out.println("Product data: " + p);
		System.out.println("Enter the number of products to be added in stock:");
		int add = sc.nextInt();
		p.addProducts(add);
		System.out.println("Updated data:" + p);
		System.out.println("Enter the number of products to be removed in stock:");
		int rem = sc.nextInt();
		p.removeProducts(rem);
		System.out.print("Updated data:" + p);
	}

}
