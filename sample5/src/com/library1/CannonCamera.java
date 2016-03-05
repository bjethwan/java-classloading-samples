package com.library1;

import com.common.ICamera;

public class CannonCamera implements ICamera{

	@Override
	public String takePhoto() {
		return "Cannon Camera Photo Taken";
	}
	

}
