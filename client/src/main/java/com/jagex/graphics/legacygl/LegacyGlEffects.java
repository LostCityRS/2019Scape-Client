package com.jagex.graphics.legacygl;

import com.jagex.graphics.gl.effects.*;
import deob.ObfuscatedName;

@ObfuscatedName("bw")
public class LegacyGlEffects {

	@ObfuscatedName("bw.e")
	public GlEffect[] field1030;

	@ObfuscatedName("bw.n")
	public int field1027 = 0;

	@ObfuscatedName("bw.m")
	public int field1028 = 0;

	@ObfuscatedName("bw.k")
	public int field1026 = 0;

	@ObfuscatedName("bw.f")
	public final LegacyOpenGLRenderer field1029;

	@ObfuscatedName("bw.w")
	public final LegacyGlEffectRelated field1031;

	@ObfuscatedName("bw.l")
	public final LegacyGlEffectRelated2 field1032;

	public LegacyGlEffects(LegacyOpenGLRenderer arg0) {
		this.field1029 = arg0;
		this.field1031 = new LegacyGlEffectRelated(arg0);
		this.field1030 = new GlEffect[16];
		this.field1030[1] = new GLEnvironmentMapEffect(arg0);
		this.field1030[2] = new GLWaterEffect(arg0, this.field1031);
		this.field1030[4] = new GLUnderwaterEffect(arg0, this.field1031);
		this.field1030[5] = new GLLakeWaterEffect(arg0, this.field1031);
		this.field1030[6] = new GLLightAbsorbEffect(arg0);
		this.field1030[7] = new GlReflectionEffect(arg0);
		this.field1030[3] = this.field1032 = new LegacyGlEffectRelated2(arg0);
		this.field1030[8] = new GLHDWaterEffect(arg0, this.field1031);
		this.field1030[9] = new GLHDWaterWaveEffect(arg0, this.field1031);
		if (!this.field1030[8].method1252()) {
			this.field1030[8] = this.field1030[4];
		}
		if (!this.field1030[9].method1252()) {
			this.field1030[9] = this.field1030[8];
		}
	}

	@ObfuscatedName("bw.e(I)Z")
	public boolean method1277(int arg0) {
		return this.field1030[arg0].method1252();
	}

	@ObfuscatedName("bw.n(IIIZZ)V")
	public void method1278(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
		boolean var6 = arg4 & this.field1029.method15730();
		if (!var6 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			if (arg0 == 4) {
				arg2 = arg1;
			}
			arg0 = 2;
		}
		if (arg0 != 0 && arg3) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.field1026 != arg0) {
			if (this.field1026 != 0) {
				this.field1030[this.field1026 & Integer.MAX_VALUE].method1255();
			}
			if (arg0 != 0) {
				this.field1030[arg0 & Integer.MAX_VALUE].method1263(arg3);
				this.field1030[arg0 & Integer.MAX_VALUE].method1254(arg3);
				this.field1030[arg0 & Integer.MAX_VALUE].method1256(arg1, arg2);
			}
			this.field1026 = arg0;
			this.field1027 = arg1;
			this.field1028 = arg2;
		} else if (this.field1026 != 0) {
			this.field1030[this.field1026 & Integer.MAX_VALUE].method1254(arg3);
			if (this.field1027 != arg1 || this.field1028 != arg2) {
				this.field1030[this.field1026 & Integer.MAX_VALUE].method1256(arg1, arg2);
				this.field1027 = arg1;
				this.field1028 = arg2;
			}
		}
	}

	@ObfuscatedName("bw.m(Lbq;I)Z")
	public boolean method1276(LegacyOpenGLTexture arg0, int arg1) {
		if (this.field1026 == 0) {
			return false;
		} else {
			this.field1030[this.field1026 & Integer.MAX_VALUE].method1251(arg0, arg1);
			return true;
		}
	}
}
