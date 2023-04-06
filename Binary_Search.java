
public class Binary_Search {
public static int Bin_src(int arr[], int n, int key) {
	int mid;
int low = 0;
int high = n-1;
while(low<=high) {
	mid = low+(high-low)/2;
	if(arr[mid] == key) {
		return mid;
	}
	else {
		if(arr[mid]<key) {
			low = mid+1;
		}
		else {
			high= mid -1;
			
		}
	}
}
	return 0;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {2,3,4,5,7,8};
int n = arr.length;
System.out.println(Bin_src(arr,n,7));
	}

}
