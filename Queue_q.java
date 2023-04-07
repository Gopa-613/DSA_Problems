package joonn;
import java.util.*;
public class Queue_q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayDeque <Integer> q = new ArrayDeque<Integer>();
q.add(1); q.add(2); q.add(3); q.add(4); q.add(5);
System.out.println("The Queue : "+q);
System.out.println(q.isEmpty());
System.out.println(q.remove());
System.out.println(q.peek());

	}

}
