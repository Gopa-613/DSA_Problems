import java.util.*;
public class Hash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> hm1 = new HashMap<String,Integer>();
		hm1.put("Logan Lee", new Integer(01));
		hm1.put("Ju Seok Hyeong", new Integer(02));
		hm1.put("Sim Suryeon", new Integer(03));
		hm1.put("Oh Yun Hi", new Integer(04));
		hm1.put("Min Seol Ah", new Integer(05));
		hm1.put("Bae Rona", new Integer(06));
		System.out.println("The size is : "+hm1.size());
		for(String key : hm1.keySet()){
		System.out.println(key + " score marks :" + hm1.get(key));
		}

		HashMap<Integer,String> hm2 = new HashMap<Integer,String>();
		hm2.put(new Integer(45), "Cheo Seo Jin");
		hm2.put(new Integer(67),"Secretary Joo");
		hm2.put(new Integer(78),"Alex");
		hm2.put(new Integer(87),"Ha Eunbyeol");
		hm2.put(new Integer(66), " Ha Euncheol");
		hm2.put(new Integer(57),"Ju Dantae");
		System.out.println("The size is : "+hm2.size());
		for(int key : hm2.keySet()){
		System.out.println(key + " score marks :" + hm2.get(key));
		}


		HashMap<String,String> hm3 = new HashMap<String,String>();
		hm3.put("Kim Jisoo", "34");
		hm3.put("Rose","67");
		hm3.put("Kim Sunoo","78");

		System.out.println("The size is : "+hm3.size());
		for(String key : hm3.keySet()){
		System.out.println(key + " score marks :" + hm3.get(key));
		}


		HashMap<Integer,Integer> hm4 = new HashMap<Integer,Integer>();
		hm4.put(34,66);
		hm4.put(45,546);
		hm4.put(56,78);

		System.out.println("The size is : "+hm4.size());
		for(int key : hm4.keySet()){
		System.out.println("key: "+ key + " and Value: " + hm4.get(key));
		}
			}

		}
	