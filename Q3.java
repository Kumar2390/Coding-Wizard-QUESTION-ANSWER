//Write a program to print the following series: 0, 1, 1, 2, 4, 7, 13, . . . . upto n.
public class Q3 {

			
		public static int tribonacci(int n)
		{
			
			if (n == 0 || n == 1 || n == 2) {
				
				return 0;
				
			}
				
			if (n == 3) {
				
				return 1;
			}
				
			else {
				return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
			}
		}
		public static void main(String args[])
		{
			int n = 9;
			for (int i = 1; i < n; i++)
				System.out.print(tribonacci(i)+" ");
		}
	
}