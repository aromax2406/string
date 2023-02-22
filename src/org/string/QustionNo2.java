package org.string;

public class QustionNo2 {

	
	
	// non literal string 
	public static void main(String[] args) {
		
		String s = new String ("aro max");
		
		
		String s2 = new String ("aro max");
		
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s2));
	}
}
