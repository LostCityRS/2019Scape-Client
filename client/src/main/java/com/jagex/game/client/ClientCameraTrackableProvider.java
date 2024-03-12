package com.jagex.game.client;

import rs2.client.Client;
import com.jagex.game.world.entity.ObjectWrapper;
import com.jagex.graphics.camera.CameraTrackable;
import com.jagex.graphics.camera.CameraTrackableProvider;
import com.jagex.graphics.camera.CameraTrackableType;
import deob.ObfuscatedName;

@ObfuscatedName("z")
public class ClientCameraTrackableProvider implements CameraTrackableProvider {

	@ObfuscatedName("z.e(Ljl;IB)Ljn;")
	public CameraTrackable method268(CameraTrackableType arg0, int arg1) {
		if (CameraTrackableType.field2838 == arg0) {
			return Client.field10944[arg1];
		}
		if (CameraTrackableType.field2839 == arg0) {
			ObjectWrapper var3 = (ObjectWrapper) Client.field10838.method14495((long) arg1);
			if (var3 != null) {
				return (CameraTrackable) var3.field11436;
			}
		}
		return null;
	}
}
