import java.util.*;
public class Wave_array {

	public static void waveForm(int[] arr) {
	    Arrays.sort(arr);
	    for (int i = 0; i < arr.length - 1; i += 2) {
	        int temp = arr[i];
	        arr[i] = arr[i + 1];
	        arr[i + 1] = temp;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {8, 1, 2, 3, 4, 5, 6, 4, 2};
waveForm(arr);

System.out.println(Arrays.toString(arr));
	}

}
