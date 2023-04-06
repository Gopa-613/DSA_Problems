import java.util.Arrays;

public class Sort1toN {
	public class SortArray {
		   public static void main(String[] args) { 
				        int[] arr = {8, 5, 6, 1, 9, 3, 2, 7, 4, 10}; // Example array containing unique elements from 1 to N
				        selectionSort(arr); // Sort the array using selection sort
				        System.out.println(Arrays.toString(arr)); // Print the sorted array
				    }

				    public static void selectionSort(int[] arr) {
				        for (int i = 0; i < arr.length - 1; i++) {
				            int minIndex = i;
				            for (int j = i + 1; j < arr.length; j++) {
				                if (arr[j] < arr[minIndex]) {
				                    minIndex = j;
				                }
				            }
				            int temp = arr[i];
				            arr[i] = arr[minIndex];
				            arr[minIndex] = temp;
				        }
				    }
				}
}
		


	