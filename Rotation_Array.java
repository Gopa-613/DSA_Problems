
public class Rotation_Array {

	static void RightRotate(int a[],
            int n, int k)
{

// If rotation is greater
// than size of array
k=k%n;

for(int i = 0; i < n; i++)
{
if(i<k)
{
// Printing rightmost
// kth elements
System.out.print(a[n + i - k]
                 + " ");
}
else
{
// Prints array after
// 'k' elements
System.out.print(a[i - k]
                 + " ");
}
}
System.out.println();
}

//Driver program
public static void main(String args[])
{
int Array[] = {10, 20, 30, 40, 50,60};
int N = Array.length;

int K = 4;
RightRotate(Array, N, K);

}
}
