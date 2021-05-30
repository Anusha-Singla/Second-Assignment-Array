package array;

import java.util.Scanner;

public class ArrayAssignment {
static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter the size of array");
		 int size = s.nextInt();
		int[] a = new int[size+1];
 		for(int i=1;i<a.length;i++) {
 			a[i] = s.nextInt();         //pushing the elements in array
 		}
		System.out.println("Elements are: ");
 		for(int i=1;i<a.length;i++){
 			System.out.println("Elements in " +i+ " Index " + a[i]);
 		}
	}

}
