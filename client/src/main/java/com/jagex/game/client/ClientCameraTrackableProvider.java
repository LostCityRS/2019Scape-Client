package com.jagex.game.client;

import com.jagex.game.world.entity.ObjectNode;
import com.jagex.graphics.camera.CameraTrackable;
import com.jagex.graphics.camera.CameraTrackableProvider;
import com.jagex.graphics.camera.CameraTrackableType;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("z")
public class ClientCameraTrackableProvider implements CameraTrackableProvider {

	@ObfuscatedName("z.e(Ljl;IB)Ljn;")
	public CameraTrackable getCameraTrackable(CameraTrackableType arg0, int arg1) {
		if (CameraTrackableType.PLAYER == arg0) {
			return Client.players[arg1];
		}
		if (CameraTrackableType.NPC == arg0) {
			ObjectNode var3 = (ObjectNode) Client.npcs.get((long) arg1);
			if (var3 != null) {
				return (CameraTrackable) var3.value;
			}
		}
		return null;
	}
}
