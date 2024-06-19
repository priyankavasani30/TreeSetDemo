package treesetexamples;

import java.util.TreeSet;
import treesetexamples.Employee;

public class TreesetExample {

	public static void main(String[] args) {
		
		TreeSet<Integer> tr=new TreeSet<Integer>();
		
		TreeSet<String> tr1=new TreeSet<String>();
		
		TreeSet<Employee> tr2=new TreeSet<Employee>();
		
		
		tr.add(50);
		tr.add(5);
		tr.add(1);
		tr.add(40);
		tr.add(1);
		System.out.println(tr);
		

		
	}

}
