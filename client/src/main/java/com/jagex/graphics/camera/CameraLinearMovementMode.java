package com.jagex.graphics.camera;

import deob.ObfuscatedName;

@ObfuscatedName("ic")
public class CameraLinearMovementMode {

	@ObfuscatedName("ic.e")
	public static final CameraLinearMovementMode field2824 = new CameraLinearMovementMode(0, true);

	@ObfuscatedName("ic.n")
	public static final CameraLinearMovementMode field2825 = new CameraLinearMovementMode(1, true);

	@ObfuscatedName("ic.m")
	public static final CameraLinearMovementMode field2823 = new CameraLinearMovementMode(2, false);

	@ObfuscatedName("ic.k")
	public int field2822;

	@ObfuscatedName("ic.f")
	public boolean field2821;

	public CameraLinearMovementMode(int arg0, boolean arg1) {
		this.field2822 = arg0;
		this.field2821 = arg1;
	}

	@ObfuscatedName("akj.e(IB)Lic;")
	public static CameraLinearMovementMode method17805(int arg0) {
		if (field2824.field2822 == arg0) {
			return field2824;
		} else if (field2825.field2822 == arg0) {
			return field2825;
		} else if (field2823.field2822 == arg0) {
			return field2823;
		} else {
			return null;
		}
	}
}
