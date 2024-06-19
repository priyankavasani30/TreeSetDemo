package treesetexamples;

import java.util.TreeMap;

import arraylist.Color;

public class TreeMapEx {

	public static void main(String[] args) {

		TreeMap <String,Integer> courses = new TreeMap <String,Integer>();
		courses.put("Android", 5000);
		courses.put("Java", 7000);
		courses.put("Python", 8000);
		courses.put("Python", 1000);
		courses.put("c#", 15000);
		
		System.out.println(courses);
		System.out.println("First entry: " + courses.firstEntry());
		
	}

}
