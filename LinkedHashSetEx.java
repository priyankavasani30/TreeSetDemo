package treesetexamples;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {

		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		lh.add("abc");
		lh.add("xyz");
		lh.add("pqr");
		lh.add("pqr");
		System.out.println(lh);

		lh.forEach(l -> System.out.println(l));
		
	}

}
