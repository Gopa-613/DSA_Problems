
public class TowerOfHanoi {
	
	    public static void main(String[] args) {
	        int numDiscs = 3;
	        char fromPeg = 'A';
	        char toPeg = 'C';
	        char auxPeg = 'B';

	        System.out.println("Steps to solve the Tower of Hanoi problem:");
	        towerOfHanoi(numDiscs, fromPeg, toPeg, auxPeg);
	    }

	    public static void towerOfHanoi(int numDiscs, char fromPeg, char toPeg, char auxPeg) {
	        if (numDiscs == 1) {
	            System.out.println(fromPeg + " -> " + toPeg);
	            return;
	        }

	        towerOfHanoi(numDiscs - 1, fromPeg, auxPeg, toPeg);
	        System.out.println(fromPeg + " -> " + toPeg);
	        towerOfHanoi(numDiscs - 1, auxPeg, toPeg, fromPeg);
	    }
	}

	