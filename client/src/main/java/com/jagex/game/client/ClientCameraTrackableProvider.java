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
	public CameraTrackable getCameraTrackable(CameraTrackableType cameraTrackableType, int index) {
		if (CameraTrackableType.PLAYER == cameraTrackableType) {
			return Client.players[index];
		}
		if (CameraTrackableType.NPC == cameraTrackableType) {
			ObjectNode var3 = (ObjectNode) Client.npcs.get((long) index);
			if (var3 != null) {
				return (CameraTrackable) var3.value;
			}
		}
		return null;
	}
}
