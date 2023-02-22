package org.string;

public class QustionNo12 {
public static void main(String[] args) {
	String s = "welcome to java class";
	

	String[] spl= s.split(" ");
	
	
    for (String string : spl) {
		System.out.println(string);
	}
    
    
	// qustion no 12.2 
    
    
    String[] spl2 = s.split("l");
    for (String sr : spl2) {
		System.out.println(sr);
	}
}
}
