package com.jagex.graphics.camera;

import deob.ObfuscatedName;

@ObfuscatedName("jy")
public interface CameraTrackableProvider {

	@ObfuscatedName("jy.e(Ljl;IB)Ljn;")
	CameraTrackable getCameraTrackable(CameraTrackableType cameraTrackableType, int index);
}
