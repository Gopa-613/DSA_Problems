package joonn;
import java.util.*;
public class Linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer> l = new LinkedList<Integer>();
l.addFirst(1);l.addLast(2); l.addFirst(3); l.addLast(4);
System.out.println("The Linked List before Deletion of elements is : "+l);
l.removeFirst();
l.removeLast();
System.out.println("The Linked list after Deletion of elements is : "+l);
	}

}
