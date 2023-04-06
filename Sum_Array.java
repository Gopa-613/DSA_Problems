
public class Sum_Array {
public static int sum(int arr[]) {
	int n = arr.length;
	int sum =0;
	for(int i = 0; i<n; i++) {
		sum = sum+arr[i];
	
	}
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {1,2,3,4,5};

System.out.println("The Sum of the Numbers in Array is : "+sum(arr));
	}

}
