package com.jagex;

import com.jagex.graphics.runetek5.camera.CameraTrackable;
import com.jagex.graphics.runetek5.camera.CameraTrackableProvider;
import com.jagex.graphics.runetek5.camera.CameraTrackableType;
import deob.ObfuscatedName;

@ObfuscatedName("z")
public class ClientCameraTrackableProvider implements CameraTrackableProvider {

	@ObfuscatedName("z.e(Ljl;IB)Ljn;")
	public CameraTrackable method268(CameraTrackableType arg0, int arg1) {
		if (CameraTrackableType.field2838 == arg0) {
			return client.field10944[arg1];
		}
		if (CameraTrackableType.field2839 == arg0) {
			ObjectWrapper var3 = (ObjectWrapper) client.field10838.method14495((long) arg1);
			if (var3 != null) {
				return (CameraTrackable) var3.field11436;
			}
		}
		return null;
	}
}
