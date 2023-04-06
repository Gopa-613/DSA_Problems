import java.util.Arrays;

public class IndexArray {

	public static void rearrange(int[] arr) {
	    int n = arr.length;
	    for (int i = 0; i < n; i++) {
	        while (arr[i] != -1 && arr[i] != i) {
	            int temp = arr[arr[i]];
	            arr[arr[i]] = arr[i];
	            arr[i] = temp;
	        }
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {8, -1, 6, 1, 9, 3, 2, 7, 4, -1};
rearrange(arr);
System.out.println(Arrays.toString(arr));
	}

}
