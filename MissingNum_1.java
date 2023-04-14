//Find the missing number in an array

package agustd;
import java.util.*;
public class MissingNum_1 {
public static int num(int arr[], int n) {
	int sum = 0; //initialising sum to 0
	int num ;
	
	num = ((n+1)*(n+2))/2; //general formula to find the sum of n natural no. (n*(n+1))/2
	for(int i = 0; i<n; i++) {
		sum += arr[i];  //to find the sum of the given array elements
		
	}
	num-=sum; //subtracting the sum of array elements from total sum of given n natural numbers
	return num;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {1,2,3,5};
System.out.println("The Given array is : "+Arrays.toString(arr)); //displaying the array
System.out.println(num(arr,arr.length)+ " is the missing element.");
	}

}
