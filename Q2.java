//Sorting of 2D array in both the manner i.e. in ascending and descending order, by the means of switch case operation an 
//option which order sort should be provided to user. Instructions to follow 1. All the elements of array should be 
//entered by user no pre filled values are acceptable. 2. Use of Inbuilt functions are restricted.


import java.util.Scanner;

public class Q2 {
	
	static void sort_ascending(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i].length-j-1; k++) {
					
					if (a[i][k]>a[i][k+1]) {
						int t=a[i][k];
						a[i][k]=a[i][k+1];
						a[i][k+1]=t;
					}
				}
			}
		}
	}
	static void sort_descending(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i].length-j-1; k++) {
					
					if (a[i][k]<a[i][k+1]) {
						int t=a[i][k];
						a[i][k]=a[i][k+1];
						a[i][k+1]=t;
					}
				}
			}
		}
	}
	
	static void print(int a[][],int row,int col) {
		for (int i = 0; i <row; i++) {
			for (int j = 0; j <col; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number of row of 2D array");
	int row=sc.nextInt();
	System.out.println("Enter the number of col of 2D array");
	int col=sc.nextInt();
	System.out.println("Enter the 2D array elements");
	
		int a[][]=new int[row][col];
	for (int i = 0; i <row; i++) {
		for (int j = 0; j <col; j++) {
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("Orginal 2D array:");
	print(a,row,col);
	
	System.out.println("For ascending order enter 1 / for descending order enter 2");
	int check=sc.nextInt();
	if (check==1) {
		sort_ascending(a);
		print(a,row,col);
	}
	else if(check==2) {
		sort_descending(a);
		print(a,row,col);
	}
sc.close();
	}

}
