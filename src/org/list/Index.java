package org.list;

import java.util.ArrayList;
import java.util.List;

public class Index {
	public static void main(String[] args) {
		
		List<Integer>l =new ArrayList<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		
		int i=l.indexOf(10);
		System.out.println(i);
		
		int j=l. lastIndexOf(10);
		System.out.println(j);
		
		int k=l.indexOf(90);
		System.out.println(k);
		
		int m =l.indexOf(50);
		System.out.println(m);
		
		int n=l.indexOf(70);
		System.out.println(n);
		
		
	}
	
	

}
