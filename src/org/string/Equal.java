package org.string;

import java.util.Scanner;

public class Equal {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string1");
		String r = s.next();
		
		System.out.println("enter the string2");
		String d = s.next();
		boolean c = r.equals(d);
		System.out.println(c);
		
		
	}

}
