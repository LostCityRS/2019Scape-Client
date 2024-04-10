package com.jagex.graphics.camera;

import com.jagex.game.shared.movement.CoordFine;
import com.jagex.math.Quaternion;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;

@ObfuscatedName("jn")
public interface CameraTrackable {

	@ObfuscatedName("jn.f(B)Lox;")
	Vector3 createVector3();

	@ObfuscatedName("jn.m(B)Lakt;")
	CoordFine getTrackableCoord();

	@ObfuscatedName("jn.k(I)Lov;")
	Quaternion method4668();

	@ObfuscatedName("jn.n(I)I")
	int getIndex();

	@ObfuscatedName("jn.e(I)Ljl;")
	CameraTrackableType getCameraTrackableType();
}
