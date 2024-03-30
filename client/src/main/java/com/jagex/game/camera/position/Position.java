package com.jagex.game.camera.position;

import com.jagex.core.datastruct.SceneLevelTileFlags;
import com.jagex.core.io.Packet;
import com.jagex.game.shared.movement.CoordFine;
import com.jagex.graphics.camera.Camera;
import com.jagex.math.Vector3;
import com.jagex.math.Vector3i;
import deob.ObfuscatedName;

@ObfuscatedName("kl")
public abstract class Position {

	@ObfuscatedName("kl.e")
	public final Camera camera;

	public Position(Camera camera) {
		this.camera = camera;
	}

	@ObfuscatedName("kl.n(I)Z")
	public abstract boolean method5218();

	@ObfuscatedName("kl.m(B)Lox;")
	public abstract Vector3 method5219();

	@ObfuscatedName("kl.f(B)Lakt;")
	public abstract CoordFine method5221();

	@ObfuscatedName("kl.w(I)F")
	public abstract float method5222();

	@ObfuscatedName("kl.l(Lju;IIB)V")
	public abstract void method5223(Vector3i arg0, int arg1, int arg2);

	@ObfuscatedName("kl.u(Lalw;I)V")
	public abstract void method5224(Packet arg0);

	@ObfuscatedName("kl.k(I)[D")
	public abstract double[] method5230();

	@ObfuscatedName("kl.e(F[[[ILqx;IIB)V")
	public abstract void method5238(float arg0, int[][][] arg1, SceneLevelTileFlags arg2, int arg3, int arg4);
}
