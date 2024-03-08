package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ahi")
public abstract class class916 extends class324 {

	@ObfuscatedName("ahi.n")
	public class238 field10587;

	@ObfuscatedName("ahi.m")
	public class1150 field10604;

	@ObfuscatedName("ahi.k")
	public class1150 field10607;

	@ObfuscatedName("ahi.f")
	public class1150 field10586;

	@ObfuscatedName("ahi.w")
	public class1150 field10605;

	@ObfuscatedName("ahi.l")
	public class1150 field10588;

	@ObfuscatedName("ahi.u")
	public class1150 field10600;

	@ObfuscatedName("ahi.z")
	public class1150 field10590;

	@ObfuscatedName("ahi.p")
	public class1150 field10591;

	@ObfuscatedName("ahi.d")
	public class1150 field10592;

	@ObfuscatedName("ahi.c")
	public class1150 field10593;

	@ObfuscatedName("ahi.r")
	public class1150 field10594;

	@ObfuscatedName("ahi.v")
	public class1150 field10595;

	@ObfuscatedName("ahi.o")
	public class1150 field10598;

	@ObfuscatedName("ahi.s")
	public class1150 field10597;

	@ObfuscatedName("ahi.y")
	public class1150 field10589;

	@ObfuscatedName("ahi.q")
	public class1150 field10585;

	@ObfuscatedName("ahi.ae")
	public int field10596;

	@ObfuscatedName("ahi.ag")
	public int[] field10609;

	@ObfuscatedName("ahi.ah")
	public static final class426 field10610 = new class426();

	@ObfuscatedName("ahi.al")
	public class426[] field10611;

	@ObfuscatedName("ahi.ac")
	public float[] field10612 = new float[3];

	public class916(class850 arg0) {
		super(arg0);
		new class419();
		this.field10611 = new class426[this.field3233.field10186];
		for (int var2 = 0; var2 < this.field3233.field10186; var2++) {
			this.field10611[var2] = new class426();
		}
	}

	@ObfuscatedName("ahi.h(Ljava/lang/String;)Z")
	public boolean method16761(String arg0) throws class1108 {
		this.field10587 = this.field3233.method15964(arg0);
		if (this.field10587 == null) {
			throw new class1108("");
		}
		this.field10604 = this.field10587.method4188("textureMatrix");
		this.field10607 = this.field10587.method4188("modelMatrix");
		this.field10586 = this.field10587.method4188("viewMatrix");
		this.field10605 = this.field10587.method4188("projectionMatrix");
		this.field10600 = this.field10587.method4188("modelViewMatrix");
		this.field10590 = this.field10587.method4188("modelViewProjectionMatrix");
		this.field10591 = this.field10587.method4188("viewProjectionMatrix");
		this.field10595 = this.field10587.method4188("ambientColour");
		this.field10589 = this.field10587.method4188("sunDirection");
		this.field10598 = this.field10587.method4188("sunColour");
		this.field10597 = this.field10587.method4188("antiSunColour");
		this.field10585 = this.field10587.method4188("sunExponent");
		this.field10592 = this.field10587.method4188("eyePosition");
		this.field10593 = this.field10587.method4188("eyePositionOS");
		this.field10594 = this.field10587.method4188("sunDirectionOS");
		if (this.method16762()) {
			if (this.field10587.method4163() == null) {
				class234 var2 = this.field10587.method4217();
				if (var2 == null) {
					throw new class1108(this.field10587.method4186() + "");
				}
				this.field10587.method4162(var2);
			}
			this.field10596 = this.field10587.method4158();
			this.field10609 = new int[this.field10596];
			return true;
		}
		this.field10587 = null;
		this.field10604 = null;
		this.field10607 = null;
		this.field10586 = null;
		this.field10605 = null;
		this.field10600 = null;
		this.field10590 = null;
		this.field10591 = null;
		this.field10595 = null;
		this.field10589 = null;
		this.field10598 = null;
		this.field10597 = null;
		this.field10585 = null;
		this.field10592 = null;
		this.field10593 = null;
		this.field10594 = null;
		return false;
	}

	@ObfuscatedName("ahi.e()V")
	public void method5417() {
		this.field10587.method4244();
		this.field10609[this.field10587.method4212()] = -1;
		this.method16773(0);
		this.method16768();
	}

	@ObfuscatedName("ahi.g()V")
	public void method16768() {
		this.method16769(this.field3233.field10111);
		this.method16765(this.field3233.method16045());
		this.method16766();
		this.method5419();
	}

	@ObfuscatedName("ahi.n()V")
	public void method5416() {
		if (this.field10587 != null) {
			this.field10587.method4214();
		}
	}

	@ObfuscatedName("ahi.i(Lpq;)V")
	public void method16765(class426 arg0) {
		if (this.field10587 == null || !this.field10587.method4184() || this.field3233.method16037() != 0) {
			return;
		}
		int var2 = this.field10587.method4212();
		if ((this.field10609[var2] & 0x80) != 0 && this.field10604 != null) {
			this.field10587.method4201(this.field10604, arg0);
			this.field10609[var2] &= 0xFFFFFF7F;
		}
	}

	@ObfuscatedName("ahi.j()V")
	public void method16766() {
		if (this.field10587 == null || !this.field10587.method4184()) {
			return;
		}
		int var1 = this.field10587.method4212();
		int var2 = this.field10609[var1];
		if ((var2 & 0x1) != 0 && this.field10607 != null) {
			this.field10587.method4166(this.field10607, this.field3233.method16002());
		}
		if ((var2 & 0x2) != 0) {
			if (this.field10586 != null) {
				this.field10587.method4166(this.field10586, this.field3233.method16000());
			}
			if (this.field10592 != null) {
				this.field10612[0] = 0.0F;
				this.field10612[1] = 0.0F;
				this.field10612[2] = 0.0F;
				this.field3233.method2218().method6319(this.field10612[0], this.field10612[1], this.field10612[2], this.field10612);
				this.field10587.method4218(this.field10592, this.field10612[0], this.field10612[1], this.field10612[2]);
			}
		}
		if ((var2 & 0x10) != 0 && this.field10600 != null) {
			this.field10587.method4166(this.field10600, this.field3233.method16244());
		}
		if ((var2 & 0x8) != 0 && this.field10588 != null) {
			this.field10587.method4166(this.field10588, this.field3233.method16035());
		}
		if ((var2 & 0x4) != 0 && this.field10605 != null) {
			this.field10587.method4166(this.field10605, this.field3233.method16005());
		}
		if ((var2 & 0x20) != 0 && this.field10590 != null) {
			field10610.method6606(this.field3233.method16244(), this.field3233.method16005());
			this.field10587.method4166(this.field10590, field10610);
		}
		if ((var2 & 0x40) != 0 && this.field10591 != null) {
			field10610.method6606(this.field3233.method16000(), this.field3233.method16005());
			this.field10587.method4166(this.field10591, field10610);
		}
		if (this.field3233.method16037() == 0 && (this.field10609[var1] & 0x80) != 0 && this.field10604 != null) {
			this.field10587.method4201(this.field10604, this.field3233.method16045());
			this.field10609[var1] &= 0xFFFFFF7F;
		}
		this.field10609[var1] = 0;
	}

	@ObfuscatedName("ahi.t(ILou;)V")
	public void method16767(int arg0, class419 arg1) {
		if (this.field10593 == null) {
			return;
		}
		class426 var3 = this.field3233.method16035();
		float[] var4 = new float[] { var3.field4315[12], var3.field4315[13], var3.field4315[14] };
		float[] var5 = new float[] { 0.0F, 0.0F, 0.0F };
		var3.method6670(var5);
		float[] var6 = new float[] { 0.0F, 0.0F, 0.0F };
		this.field3233.method2218().method6295(0.0F, 0.0F, 0.0F, var6);
		arg1.method6320(var4);
		this.field10587.method4218(this.field10593, var4[0], var4[1], var4[2]);
	}

	@ObfuscatedName("ahi.ae(ILou;)V")
	public void method16781(int arg0, class419 arg1) {
		if (this.field10594 != null) {
			float[] var3 = new float[] { this.field3233.field10114[0], this.field3233.field10114[1], this.field3233.field10114[2] };
			arg1.method6321(var3);
			this.field10587.method4218(this.field10594, var3[0], var3[1], var3[2]);
		}
	}

	@ObfuscatedName("ahi.ag(Z)V")
	public void method16769(boolean arg0) {
		if (this.field10587 == null || !this.field10587.method4184()) {
			return;
		}
		if (this.field10595 != null) {
			this.field10587.method4218(this.field10595, this.field3233.field10142 * this.field3233.field10122, this.field3233.field10122 * this.field3233.field10120, this.field3233.field10210 * this.field3233.field10122);
		}
		if (this.field10589 != null) {
			this.field10587.method4218(this.field10589, this.field3233.field10114[0], this.field3233.field10114[1], this.field3233.field10114[2]);
		}
		if (this.field10598 != null) {
			this.field10587.method4218(this.field10598, this.field3233.field10142 * this.field3233.field10123, this.field3233.field10123 * this.field3233.field10120, this.field3233.field10210 * this.field3233.field10123);
		}
		if (this.field10597 != null) {
			this.field10587.method4218(this.field10597, -this.field3233.field10142 * this.field3233.field10124, -this.field3233.field10120 * this.field3233.field10124, -this.field3233.field10210 * this.field3233.field10124);
		}
		if (this.field10585 != null) {
			this.field10587.method4268(this.field10585, Math.abs(this.field3233.field10114[1]) * 928.0F + 64.0F);
		}
	}

	@ObfuscatedName("ahi.f()V")
	public void method5419() {
	}

	@ObfuscatedName("ahi.ah(I)V")
	public void method16770(int arg0) {
		for (int var2 = 0; var2 < this.field10596; var2++) {
			this.field10609[var2] |= 0x80 << arg0;
		}
	}

	@ObfuscatedName("ahi.al(Lou;)V")
	public void method16771(class419 arg0) {
		class426 var2 = this.field3233.field10066;
		var2.method6609(arg0);
		int var3 = this.field10587.method4212();
		if (this.field10607 != null) {
			this.field10587.method4166(this.field10607, var2);
			this.field10609[var3] &= 0xFFFFFFFE;
		}
		if (this.field10600 != null) {
			field10610.method6606(var2, this.field3233.method16000());
			this.field10587.method4166(this.field10600, field10610);
			this.field10609[var3] &= 0xFFFFFFEF;
		}
		if (this.field10590 != null) {
			field10610.method6606(var2, this.field3233.method16228());
			this.field10587.method4166(this.field10590, field10610);
			this.field10609[var3] &= 0xFFFFFFDF;
		}
		this.method16767(var3, arg0);
		this.method16781(var3, arg0);
	}

	@ObfuscatedName("ahi.l()V")
	public void method5421() {
		this.method16771(class419.field4282);
	}

	@ObfuscatedName("ahi.ac(I)V")
	public void method16773(int arg0) {
		this.field10611[0].method6603();
		this.method16770(arg0);
	}

	@ObfuscatedName("ahi.a()Z")
	public abstract boolean method16762() throws class1108;
}
