package com.bjethwan;

import java.net.URL;
import java.net.URLClassLoader;

public class Main {
	public static void main(String[] args) {
		
		URLClassLoader ucl = (URLClassLoader)ClassLoader.getSystemClassLoader();
		
		while(ucl !=null){
			
			System.out.println(ucl);
			
			URL[] urls = ucl.getURLs();
			for(URL url:urls){
				System.out.println(url.toString());
			}
			
			ucl = (URLClassLoader)ucl.getParent();
			System.out.println();
		}
		System.out.println("Bootstrap class loader");

	}
}

