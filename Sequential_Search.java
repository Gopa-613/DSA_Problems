
public class Sequential_Search {
public static int src(int arr[], int val) {
int n = arr.length;
	for(int i = 0; i<n;i++) {
		if(arr[i]==val) {
			return i;
		}
	}
	return 0;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {2,4,6,4,52,4};

System.out.println("The asked number is at index : " +src(arr,4));
}

}
