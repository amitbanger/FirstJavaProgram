package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMaPExample {
	public static void main(String[] args) {
		Map<String, Integer> cerificationCost = new HashMap<>();
		cerificationCost.put("ISTQB", 7000);
		cerificationCost.put("CSTE", 1100);
		cerificationCost.put("Agile", 12000);
		cerificationCost.put("Jave", 13000);
		cerificationCost.put("Oracle", 25000);//let's try to remove element from hash map using Map.remove(Object)
		Set<String> setOfCertifications  = cerificationCost.keySet();
		//Map - before removing a mapping System.out.printLn("before: " + certificationCost); // let's use iterator
		Iterator<String> iterator = cerificationCost.keySet().iterator();
		while(iterator.hasNext())
		{
			String certification = iterator.next();
			if (certification.contains("ISTQB")) {
				iterator.remove();
			}
		}//Map - after removing a mapping
		System.out.println("after: " + cerificationCost);

		/******************Associate specific value with the specific key********************/

		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");

		System.out.println("The size of hashMap is " + hash_map.size());//to get the size of hashMap
		for(Map.Entry x:hash_map.entrySet()) {
			System.out.println(x.getKey()+"" + x.getValue());
		}

		/********copy from one map to another**********/	
		HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
		HashMap<Integer, String> hashMap2 = new HashMap<Integer, String>();
		//populate hash map
		hashMap1.put(1, "Red");
		hashMap1.put(2, "Green");
		hashMap1.put(3, "Black");
		System.out.println("\nValues in first map: " + hashMap1);
		hashMap2.put(4, "white");
		hashMap2.put(5, "Blue");
		hashMap2.put(6, "Orange");
		System.out.println("\nValues in second map: " + hashMap2);

		//put all values in second map
		hashMap2.putAll(hashMap1);
		System.out.println("\nNow values in second map: " + hashMap2);
		hashMap2.clear(); // To clear all the mapping from hashmap
		System.out.println("Size of second map: " + hashMap2);
		//check if map is empty

		boolean result = hashMap2.isEmpty();//to check whether hash map is empty or not
		//check the result
		System.out.println("Is hash map empty: " + result);

		/*************************HashMap clone********************/

		HashMap<Integer, String> hash_mapClone = new HashMap<Integer, String>();

		hash_mapClone.put(1, "Red");
		hash_mapClone.put(2, "Green");
		hash_mapClone.put(3, "Black");
		hash_mapClone.put(4, "White");
		hash_mapClone.put(5, "Blue");
		// print the map
		System.out.println("The Original map: " + hash_mapClone);
		HashMap<Integer,String> new_hash_map= new HashMap<Integer,String>(); 
		new_hash_map = (HashMap)hash_mapClone.clone();   
		System.out.println("Cloned map: " + new_hash_map); 
		/*------------------------hashMap key mapping-------------------------------------------------  */ 
		HashMap < String, Integer > hash_mapKM = new HashMap < String, Integer > ();
		hash_mapKM.put("Red", 1);
		hash_mapKM.put("Green", 2);
		hash_mapKM.put("Black", 3);
		hash_mapKM.put("White", 4);
		hash_mapKM.put("Blue", 5);
		// print the map
		System.out.println("The Original map: " + hash_mapKM);
		System.out.println("1. Is key 'Green' exists?");
		if (hash_mapKM.containsKey("Green")) {
			//key exists
			System.out.println("yes! - " + hash_mapKM.get("Green"));
		} else {
			//key does not exists
			System.out.println("no!");
		}

		System.out.println("\n2. Is key 'orange' exists?");
		if (hash_mapKM.containsKey("orange")) {
			System.out.println("yes! - " + hash_mapKM.get("orange"));
		} else {
			System.out.println("no!");
		}
		/*--------------------------------------Create a set view of the mapping---------------*/
		HashMap < Integer, String > hash_mapSet = new HashMap < Integer, String > ();
		hash_mapSet.put(1, "Red");
		hash_mapSet.put(2, "Green");
		hash_mapSet.put(3, "Black");
		hash_mapSet.put(4, "White");
		hash_mapSet.put(5, "Blue");
		// create set view for the map
		Set set = hash_mapSet.entrySet();
		// check set values
		System.out.println("Set values: " + set);
		/*----------------------------------value of Specified key-----------------------*/
		HashMap<Integer,String> hash_mapSP= new HashMap<Integer,String>();  
		hash_mapSP.put(1,"Red");
		hash_mapSP.put(2,"Green");
		hash_mapSP.put(3,"Black");
		hash_mapSP.put(4,"White");
		hash_mapSP.put(5,"Blue");
		// get value of key 3
		String val=(String)hash_mapSP.get(3); 
		// check the value
		System.out.println("Value for key 3 is: " + val);
		// checking collection view of the map
		System.out.println("Collection view is: "+ hash_mapSP.values());
	} 
}