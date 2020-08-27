package Assignments;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("First Number: ");
		
		int a = scan.nextInt();
		
		System.out.println("Second Number: ");
		
		int b = scan.nextInt();
		
		scan.close();
		
		int product = a * b;
		
		System.out.println("Output: " + product);
		
		
	}
}
