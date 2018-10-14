package chizhenko;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		int max;

		System.out.println("enter the first number");
		a = sc.nextInt();

		System.out.println("enter the second number");
		b = sc.nextInt();

		System.out.println("enter the third number");
		c = sc.nextInt();

		System.out.println("enter the fourth number");
		d = sc.nextInt();
		
		sc.close();

		max = a;

		if (b > max) {
			max = b;
		}
		;

		if (c > max) {
			max = c;
		}
		;

		if (d > max) {
			max = d;
		}
		;
		
		System.out.println("Max number is " + max);

	}

}
