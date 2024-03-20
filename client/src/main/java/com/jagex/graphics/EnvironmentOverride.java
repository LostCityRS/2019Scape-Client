package com.jagex.graphics;

import com.jagex.core.io.Packet;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;

@ObfuscatedName("yj")
public class EnvironmentOverride {

	@ObfuscatedName("yj.e")
	public int field8133;

	@ObfuscatedName("yj.n")
	public float field8124;

	@ObfuscatedName("yj.m")
	public float field8118;

	@ObfuscatedName("yj.k")
	public float field8117;

	@ObfuscatedName("yj.f")
	public Vector3 field8120;

	@ObfuscatedName("yj.w")
	public int field8121;

	@ObfuscatedName("yj.l")
	public int field8119;

	@ObfuscatedName("yj.u")
	public float field8123;

	@ObfuscatedName("yj.z")
	public float field8125;

	@ObfuscatedName("yj.p")
	public float field8134;

	@ObfuscatedName("yj.d")
	public int field8126;

	@ObfuscatedName("yj.c")
	public int field8127;

	@ObfuscatedName("yj.r")
	public int field8128;

	@ObfuscatedName("yj.v")
	public int field8129;

	@ObfuscatedName("yj.o")
	public int field8130;

	@ObfuscatedName("yj.s")
	public int field8131;

	@ObfuscatedName("yj.y")
	public int[] field8132 = new int[3];

	@ObfuscatedName("yj.q")
	public float[] field8116 = new float[3];

	@ObfuscatedName("yj.x")
	public int field8122;

	public EnvironmentOverride() {
		this.method10434();
	}

	@ObfuscatedName("yj.e(S)V")
	public void method10434() {
		this.field8133 = -1;
		this.field8124 = -1.0F;
		this.field8118 = -1.0F;
		this.field8117 = -1.0F;
		this.field8120 = null;
		this.field8121 = -1;
		this.field8119 = -1;
		this.field8123 = -1.0F;
		this.field8125 = -1.0F;
		this.field8134 = -1.0F;
		this.field8126 = -1;
		this.field8127 = -1;
		this.field8128 = -1;
		this.field8129 = -1;
		this.field8130 = -1;
		this.field8131 = -1;
		for (int var1 = 0; var1 < this.field8132.length; var1++) {
			this.field8132[var1] = -1;
			this.field8116[var1] = 0.0F;
		}
		this.field8122 = 5000;
	}

	@ObfuscatedName("yj.n(Lalw;I)Z")
	public boolean method10382(Packet arg0) {
		long var2 = arg0.g8();
		if (var2 == 0L) {
			this.field8122 = arg0.g2();
			return false;
		}
		if ((var2 & EnvironmentOverrideProperty.field8065.field8102) != 0L) {
			this.field8133 = arg0.g4s();
		}
		if ((var2 & EnvironmentOverrideProperty.field8057.field8102) != 0L) {
			this.field8124 = arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8078.field8102) != 0L) {
			this.field8118 = arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8060.field8102) != 0L) {
			this.field8117 = arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8061.field8102) != 0L) {
			this.field8120 = Vector3.create(arg0);
		}
		if ((var2 & EnvironmentOverrideProperty.field8069.field8102) != 0L) {
			arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8066.field8102) != 0L) {
			this.field8121 = arg0.g4s();
		}
		if ((var2 & EnvironmentOverrideProperty.field8064.field8102) != 0L) {
			this.field8119 = arg0.g2();
		}
		if ((var2 & EnvironmentOverrideProperty.field8095.field8102) != 0L) {
			arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8096.field8102) != 0L) {
			arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8099.field8102) != 0L) {
			arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8058.field8102) != 0L) {
			arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8063.field8102) != 0L) {
			this.field8123 = arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8070.field8102) != 0L) {
			this.field8125 = arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8071.field8102) != 0L) {
			this.field8134 = arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8072.field8102) != 0L) {
			this.field8126 = arg0.g2();
		}
		if ((var2 & EnvironmentOverrideProperty.field8073.field8102) != 0L) {
			this.field8127 = arg0.g2();
			this.field8128 = arg0.g2s();
			this.field8129 = arg0.g2s();
			this.field8130 = arg0.g2s();
			this.field8131 = arg0.g2();
		}
		if ((var2 & EnvironmentOverrideProperty.field8074.field8102) != 0L) {
			this.field8132[0] = arg0.g2();
			this.field8116[0] = arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8075.field8102) != 0L) {
			this.field8132[1] = arg0.g2();
			this.field8116[1] = arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8076.field8102) != 0L) {
			this.field8132[2] = arg0.g2();
			this.field8116[2] = arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8077.field8102) != 0L) {
			arg0.g4s();
		}
		if ((var2 & EnvironmentOverrideProperty.field8087.field8102) != 0L) {
			arg0.g4s();
		}
		if ((var2 & EnvironmentOverrideProperty.field8092.field8102) != 0L) {
			arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8080.field8102) != 0L) {
			arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8081.field8102) != 0L) {
			arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8082.field8102) != 0L) {
			arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8083.field8102) != 0L) {
			arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8084.field8102) != 0L) {
			arg0.g4s();
		}
		if ((var2 & EnvironmentOverrideProperty.field8085.field8102) != 0L) {
			arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8086.field8102) != 0L) {
			arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8068.field8102) != 0L) {
			arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8088.field8102) != 0L) {
			arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8089.field8102) != 0L) {
			new Vector3(arg0);
		}
		if ((var2 & EnvironmentOverrideProperty.field8090.field8102) != 0L) {
			new Vector3(arg0);
		}
		if ((var2 & EnvironmentOverrideProperty.field8091.field8102) != 0L) {
			new Vector3(arg0);
		}
		if ((var2 & EnvironmentOverrideProperty.field8093.field8102) != 0L) {
			arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8059.field8102) != 0L) {
			arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8094.field8102) != 0L) {
			arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8079.field8102) != 0L) {
			arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8101.field8102) != 0L) {
			arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8097.field8102) != 0L) {
			arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8098.field8102) != 0L) {
			arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8062.field8102) != 0L) {
			arg0.gFloat();
		}
		if ((var2 & EnvironmentOverrideProperty.field8100.field8102) != 0L) {
			arg0.g4s();
		}
		if ((var2 & EnvironmentOverrideProperty.field8067.field8102) != 0L) {
			arg0.g4s();
		}
		this.field8122 = arg0.g2();
		return true;
	}

	@ObfuscatedName("yj.m(I)I")
	public int getSunColour() {
		return this.field8133;
	}

	@ObfuscatedName("yj.k(I)F")
	public float getSunAmbientIntensity() {
		return this.field8124;
	}

	@ObfuscatedName("yj.f(I)F")
	public float getSunDiffiseIntensity() {
		return this.field8118;
	}

	@ObfuscatedName("yj.w(I)F")
	public float getSunShadowIntensity() {
		return this.field8117;
	}

	@ObfuscatedName("yj.l(I)Lox;")
	public Vector3 getSunDirection() {
		return this.field8120;
	}

	@ObfuscatedName("yj.u(I)I")
	public int getFogColour() {
		return this.field8121;
	}

	@ObfuscatedName("yj.z(I)I")
	public int getFogDepth() {
		return this.field8119;
	}

	@ObfuscatedName("yj.p(I)F")
	public float getBloomItensity() {
		return this.field8123;
	}

	@ObfuscatedName("yj.d(I)F")
	public float getBloomThreshold() {
		return this.field8125;
	}

	@ObfuscatedName("yj.c(I)F")
	public float getBloomWhitePointSq() {
		return this.field8134;
	}

	@ObfuscatedName("yj.r(B)I")
	public int getSampler() {
		return this.field8126;
	}

	@ObfuscatedName("yj.v(B)I")
	public int method10390() {
		return this.field8127;
	}

	@ObfuscatedName("yj.o(I)I")
	public int method10391() {
		return this.field8128;
	}

	@ObfuscatedName("yj.s(I)I")
	public int method10430() {
		return this.field8129;
	}

	@ObfuscatedName("yj.y(I)I")
	public int method10393() {
		return this.field8130;
	}

	@ObfuscatedName("yj.q(I)I")
	public int method10394() {
		return this.field8131;
	}

	@ObfuscatedName("yj.x(II)I")
	public int getColourRemappingMap(int arg0) {
		return this.field8132[arg0];
	}

	@ObfuscatedName("yj.b(II)F")
	public float method10378(int arg0) {
		return this.field8116[arg0];
	}

	@ObfuscatedName("yj.h(I)I")
	public int getFadeDuration() {
		return this.field8122;
	}
}
