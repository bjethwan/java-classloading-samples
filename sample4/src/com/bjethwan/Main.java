package com.bjethwan;

import java.net.URL;
import java.net.URLClassLoader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		URL url = new URL("file:///Users/bjethwan/java-classloading-samples/sample4/lib/helper.jar");
		URLClassLoader ucl = new URLClassLoader(new URL[]{url});
		Class clazz1 = Class.forName("com.jethwani.Helper", true, ucl);
		
		URL url1 = new URL("file:///Users/bjethwan/java-classloading-samples/sample4/lib/helper.jar");
		URLClassLoader ucl1 = new URLClassLoader(new URL[]{url1});
		Class clazz2 = Class.forName("com.jethwani.Helper", true, ucl1);
		
		System.out.println("clazz1 == clazz2 = "+(clazz1 == clazz2));
		
		System.out.println("clazz1.getName() == clazz2.getName() = "+(clazz1.getName() == clazz2.getName()));
		
		System.out.println(clazz1.getName());
	}
}
