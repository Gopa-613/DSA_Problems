
public class GCD {
	public static int GCD(int m, int n) {
		 if (m < n) {
		 return (GCD(n, m));
		 }
		 if (m % n == 0) {
		 return (n);
		 }
		 return (GCD(n, m % n));
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int m = 8;
int n = 2;
System.out.println(GCD(m,n));
	}

}
