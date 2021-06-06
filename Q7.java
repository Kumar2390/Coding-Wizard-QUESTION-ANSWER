//You have a variable i and when i=1 output is 3,for i=2 output is 8 and for i=3 output is 13.you have to find for 
//which value of i output is 78? Condition: Without using any loop

public class Q7 {

	public static void main(String[] args) {
		 
		//arithmetic sequence: an = a1 + (n - 1) d    
		// an is the nth term, a1 is the first term, n is the last position, d is the common difference
		// Sequence: 3, 8, 13,.....,78
		// To find position of 78
		int an, a1, n, d;
		
		a1 = 3;
		d = 5;   //8 - 3 = 5 or 13 - 8 = 5
		an = 78; //change this to get any other value's position/output
		
		n = ((an - a1) / d) + 1;
		
		System.out.println("Required value of i for 78: "+n);
	}

}
