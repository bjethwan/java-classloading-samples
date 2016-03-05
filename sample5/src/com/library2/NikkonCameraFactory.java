package com.library2;

import com.common.ICamera;
import com.common.ICameraFactory;

public class NikkonCameraFactory implements ICameraFactory {

	@Override
	public ICamera createCamera() {
		return new NikkonCamera();
	}

}
