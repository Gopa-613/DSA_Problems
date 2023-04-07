package joonn;
import java.util.*;

public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> a = new ArrayList<Integer>();
a.add(1);
a.add(2);
System.out.println("The Elements in the Arraylist  : "+a);
System.out.println("The Size of The Arraylist : "+a.size());
System.out.println("The arraylist is Empty : "+a.isEmpty());
a.remove(a.size() -1); 
a.removeAll(a); 
System.out.println("Array IsEmpty: " + a.isEmpty());
	}

}
