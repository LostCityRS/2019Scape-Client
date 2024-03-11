package com.jagex.graphics.camera;

import com.jagex.game.client.CoordFine;
import com.jagex.math.Quaternion;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;

@ObfuscatedName("jn")
public interface CameraTrackable {

	@ObfuscatedName("jn.f(B)Lox;")
	Vector3 method4666();

	@ObfuscatedName("jn.m(B)Lakt;")
	CoordFine method4667();

	@ObfuscatedName("jn.k(I)Lov;")
	Quaternion method4668();

	@ObfuscatedName("jn.n(I)I")
	int method4670();

	@ObfuscatedName("jn.e(I)Ljl;")
	CameraTrackableType method4675();
}
