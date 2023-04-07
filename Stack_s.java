package joonn;
import java.util.*;
public class Stack_s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> s = new Stack<Integer>();
s.push(1); s.push(2); s.push(3); s.push(4);
System.out.println("The Stack contains : "+s);
System.out.println("The size of Stack is "+s.size());

System.out.println(s.pop());
System.out.println(s.peek());

}

}
