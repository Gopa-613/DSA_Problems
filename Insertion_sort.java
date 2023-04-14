import java.util.Arrays;

public class Insertion_sort {
public static void insertion(int arr[], int n) {
	for(int i = 1; i<n; i++) {
		int key = arr[i];
		int j = i-1;
		while(j>=0 && arr[j]>key) {
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = key;
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,4,3,2,6,7,1};
		System.out.println("The array is : " +Arrays.toString(arr));
		insertion(arr,arr.length);
		System.out.println("The sorted array is : "+Arrays.toString(arr));
	}

}
