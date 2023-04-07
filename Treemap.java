package joonn;
import java.util.*;
public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap <String,Integer> tm = new TreeMap<String, Integer>();
tm.put("Elsa", new Integer(20));
tm.put("chelsea", new Integer(40));
tm.put("Rosy", new Integer(25));
System.out.println("The Student count : "+tm.size());
for(String key : tm.keySet()) {

	System.out.println(key+ " score marks :" + tm.get(key));
	}
	System.out.println("Elsa score present:" + tm.containsKey("Elsa"));
	System.out.println("chelsea score present: " + tm.containsKey("chelsea"));
	tm.remove("Elsa");
	System.out.println("Elsa score present:" + tm.containsKey("Elsa"));
	}


	}

