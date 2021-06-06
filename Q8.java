//Write a program to solve -2x2=5x+3.
public class Q8 {

	public static void main(String[] args) {
		
	        //2*(x^2)=5*x+3  
		//2 * (x^2) + (-5 * x) - 3 = 0
		//using discriminant(Quadratic equation)
		double x, a = 2, b = -5, c = -3;
		
		double d = (Math.pow(b,2)-(4 * a * c));
		
		if(d > 0) {
			
			x = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println(x);
			
			x = (-b + Math.sqrt(d))/(2 * a);
			System.out.println(x);
			 
		}
		
		if(d == 0) {
			
			x = -b / (2 * a);
			
			System.out.println(x);
			System.out.println(x);
		}
		
		if(d < 0) {
			
			System.out.println((-b / (2 * a)+" -i"+(( Math.sqrt(-1 * (Math.pow(b,2)-(4 * a * c))) ))/ (2 * a)));
			System.out.println((-b / (2 * a)+" i"+(( Math.sqrt(-1 * (Math.pow(b,2)-(4 * a * c))) ))/ (2 * a)));
		}
		
		
		
	
	}

}