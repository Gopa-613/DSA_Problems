package hobii;
//Given an unsorted list of n elements, find the first element, which is repeated.
public class FirstRepeated {
public static int repeat(int arr[], int n) {
	for(int i = 0; i<n; i++) { //loop for the elements of the array (starting from index 0)
		for(int j = i+1; j<n; j++) { //loop for the elements to be compared
			if(arr[i] == arr[j]) { // to check whether the value is same as the array element
				return arr[i]; // return the repeated value
			}
		}
	}
	return 0;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {34, 56, 77, 1, 5, 6, 6, 6, 7, 8, 10, 34, 20, 30};
System.out.println(repeat(arr,arr.length));
	}

}
