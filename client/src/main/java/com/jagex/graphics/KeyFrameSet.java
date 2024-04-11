package com.jagex.graphics;

import com.jagex.core.datastruct.SecondaryNode;
import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import com.jagex.math.Curve;
import deob.ObfuscatedName;

@ObfuscatedName("ard")
public class KeyFrameSet extends SecondaryNode {

	@ObfuscatedName("vi.l")
	public static Js5 field7411;

	@ObfuscatedName("zy.u")
	public static Js5 field8302;

	@ObfuscatedName("ard.z")
	public int field12315;

	@ObfuscatedName("ard.p")
	public byte[] field12314;

	@ObfuscatedName("ard.d")
	public Curve[][] field12322 = (Curve[][]) null;

	@ObfuscatedName("ard.c")
	public int field12316;

	@ObfuscatedName("ard.r")
	public int field12313;

	@ObfuscatedName("ard.v")
	public AnimBase field12317;

	@ObfuscatedName("ard.o")
	public int field12319 = 0;

	@ObfuscatedName("ard.s")
	public boolean field12320;

	@ObfuscatedName("ard.y")
	public boolean field12321;

	@ObfuscatedName("ard.q")
	public boolean field12318;

	@ObfuscatedName("vz.e(Lpy;Lpy;B)V")
	public static void method9558(Js5 arg0, Js5 arg1) {
		field7411 = arg0;
		field8302 = arg1;
	}

	public KeyFrameSet(int arg0) {
		this.field12315 = arg0;
	}

	@ObfuscatedName("ard.n(I)Z")
	public boolean method19395() {
		if (this.field12322 != null) {
			return true;
		}
		if (this.field12314 == null) {
			Js5 var1 = field7411;
			synchronized (field7411) {
				this.field12314 = field7411.fetchFile(this.field12315);
				if (this.field12314 == null) {
					return false;
				}
			}
		}
		boolean var3 = true;
		Packet var4 = new Packet(this.field12314);
		int var5 = var4.g1();
		int var6 = var4.g2();
		Js5 var7 = field8302;
		boolean var8;
		synchronized (field8302) {
			var8 = var3 & field8302.loadFile(var6);
		}
		if (!var8) {
			return false;
		}
		Js5 var10 = field7411;
		synchronized (field7411) {
			this.field12317 = new AnimBase(var6, field8302.fetchFile(var6));
			this.method19379(var4, var5);
			this.field12314 = null;
			return true;
		}
	}

	@ObfuscatedName("ard.m(Lalw;IB)V")
	public void method19379(Packet arg0, int arg1) {
		this.field12316 = arg0.g2();
		this.field12313 = arg0.g2();
		this.field12319 = arg0.g1();
		int var3 = arg0.g2();
		this.field12322 = new Curve[this.field12317.field11313][];
		for (int var4 = 0; var4 < var3; var4++) {
			TransformType var5 = TransformType.method19197(arg0.g1());
			int var6 = arg0.gSmart1or2s();
			TransformComponentType var7 = TransformComponentType.method8644(arg0.g1());
			Curve var8 = new Curve();
			var8.method2036(arg0, arg1);
			int var9 = var5.method1674();
			if (this.field12322[var6] == null) {
				this.field12322[var6] = new Curve[var9];
			}
			this.field12322[var6][var7.method1421()] = var8;
			if (TransformType.field1297 == var5) {
				this.field12318 = true;
			} else if (TransformType.field1291 == var5) {
				this.field12320 = true;
			} else if (TransformType.field1294 == var5) {
				this.field12321 = true;
			}
		}
	}

	@ObfuscatedName("ard.k(S)I")
	public int method19382() {
		return this.field12316;
	}

	@ObfuscatedName("ard.f(B)I")
	public int method19383() {
		return this.field12313;
	}

	@ObfuscatedName("ard.w(I)I")
	public int method19381() {
		return this.field12319;
	}

	@ObfuscatedName("ard.l(I)I")
	public int method19384() {
		return this.method19383() - this.method19382();
	}

	@ObfuscatedName("ard.u(I)Z")
	public boolean method19406() {
		return this.field12320;
	}

	@ObfuscatedName("ard.z(I)Z")
	public boolean method19387() {
		return this.field12321;
	}

	@ObfuscatedName("ard.p(I)Z")
	public boolean method19407() {
		return this.field12318;
	}
}
