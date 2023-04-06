
public class PrintBase16 {
	public static void printInt(int number) {
		 String conversion = "0123456789ABCDEF";
		 int base = 16;
		 char digit = (char) (number % base);
		 number = number / base;
		 if (number != 0) {
		printInt(number);
		 }
		 System.out.print(conversion.charAt(digit));
		}

	
	    public static void main(String[] args) {
	        int num = 8;
			printInt(num);
	    }
	}

