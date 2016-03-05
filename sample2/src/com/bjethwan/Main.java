package com.bjethwan;

public class Main {
	public static void main(String[] args) {
		
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		
		while(cl!=null){
			System.out.println(cl.toString());
			cl = cl.getParent();
		}
		
		System.out.println("Bootstrap classloader");
	}
}


