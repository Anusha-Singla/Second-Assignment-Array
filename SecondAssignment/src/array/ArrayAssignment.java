package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment {
static Scanner s = new Scanner(System.in);


static int removeDuplicates(int a[], int n)
{
    if (n == 0 || n == 1)
        return n;
  
    // To store index of next unique element
    int j = 1;
  
    // Doing same as done in Method 1
    // Just maintaining another updated index i.e. j
    for (int i = 1; i < n-1; i++)
        if (a[i] != a[i+1])
            a[j++] = a[i];
  
    a[j++] = a[n-1];
  
    return j;
}

static int firstOccPositve(int a[], int low, int high)
{
	if(high >= low)
  {
      int mid = (low + high)/2; /*low + (high - low)/2;*/
      if(mid == a[mid]){
          return mid;
      }
      
      if(mid > a[mid]){
           return firstOccPositve(a, (mid + 1), high);
      }

      else{
          return firstOccPositve(a, low, (mid -1));
      }
  }
  return -1;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter the size of array");
		 int size = s.nextInt();
		int[] a = new int[size+1];
 		for(int i=1;i<a.length;i++) {
 			a[i] = s.nextInt();                       //pushing the elements in array
 		}
 		Arrays.sort(a, 1,(a.length));     
 		int size2 = removeDuplicates(a, (a.length));  //removing duplicates
 		
 		int index = firstOccPositve(a,1, (size2-1));
		
		if (index != -1){
	        System.out.println("first positive :"+index);
	       }
	    else{
	    	System.out.println("not found");
	    }
 		
/*	System.out.println("Elements are: ");
 		for(int i=1;i<size2;i++){
 			System.out.println("Elements in " +i+ " Index " + a[i]);
	} */
 		
	}

}
