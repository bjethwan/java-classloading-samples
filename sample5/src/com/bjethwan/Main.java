package com.bjethwan;

import java.net.URL;
import java.net.URLClassLoader;

import com.common.ICamera;
import com.common.ICameraFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	public static void main(String[] args) throws Exception {
		
		URL url = new URL("file:///Users/bjethwan/java-classloading-samples/sample5/config/config.json");
		ObjectMapper mapper = new ObjectMapper();
		Config config = mapper.readValue(url, Config.class);
		System.out.println(config.getFactoryJar());
		System.out.println(config.getFactoryClass());
		
		URL url1 = new URL(config.getFactoryJar());
		URLClassLoader ucl = new URLClassLoader(new URL[]{url1});
		Class clazz = Class.forName(config.getFactoryClass(), true, ucl);
		ICameraFactory cameraFacrtory = (ICameraFactory) clazz.newInstance();
		ICamera camera = cameraFacrtory.createCamera();
		System.out.println(camera.takePhoto());
		
		
		
		
		
	}
}
