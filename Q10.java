//Write a program that accepts an integer (n) and computes the value of n+nn+nnn.

public class Q10 {
	static int cal(int n) {
		int sum=0;
		 for (int i = 1; i <=3; i++)
	        {
	            String number = "";
	            for (int j = 0; j < i; j++)
	            {
	                number = number + n;
	            }
	          
	            sum += Integer.parseInt(number);
	        }
	       
	      return sum; 
	}

	public static void main(String[] args) {
	int n=10;
	System.out.println("the value of n+nn+nnn for "+n+" is "+ cal(n)); // here it calculate as (10 + 1010 + 101010)

	}

}
