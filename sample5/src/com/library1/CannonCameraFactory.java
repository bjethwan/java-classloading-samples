package com.library1;

import com.common.ICamera;
import com.common.ICameraFactory;

public class CannonCameraFactory implements ICameraFactory {

	@Override
	public ICamera createCamera() {
		
		return new CannonCamera();
	}

}
