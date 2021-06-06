//Write a program that accepts an integer (n) and computes the value of n+nn+nnn.

import java.util.Scanner;
public class Q10 {
	
	public static int solve(int n) {
		
	int n1 = n;
	int n2 = (n * 10) + n;
	int n3 = (n * 10 * 10)+n2;
	
	return n1 + n2 + n3;
		
		
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		
		System.out.println("Output: "+solve(n));
		sc.close();
	
    	}

}