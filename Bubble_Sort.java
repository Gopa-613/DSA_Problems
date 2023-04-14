import java.util.Arrays;

public class Bubble_Sort {
public static void bubble(int arr[], int n) {
	for(int i = 0; i<n-1; i++) {
		for(int j = 0; j<n-i-1; j++) {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {5,4,3,2,6,7,1};
System.out.println("The array is : " +Arrays.toString(arr));
bubble(arr,arr.length);
System.out.println("The sorted array is : "+Arrays.toString(arr));
	}

}
