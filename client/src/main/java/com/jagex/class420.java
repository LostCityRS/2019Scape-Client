package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("oe")
public class class420 {

	@ObfuscatedName("oe.p")
	public class421 field4297;

	@ObfuscatedName("oe.d")
	public class423 field4298;

	@ObfuscatedName("oe.c")
	public class423 field4299;

	public class420(class997 arg0, boolean arg1) {
		this.method6384(arg0, arg1);
	}

	public class420() {
		this.field4297 = new class421();
		this.field4298 = new class423();
		this.field4299 = new class423(1.0F, 1.0F, 1.0F);
	}

	public class420(class420 arg0) {
		this();
		this.method6386(arg0);
	}

	@ObfuscatedName("oe.e(Lalw;Z)V")
	public void method6384(class997 arg0, boolean arg1) {
		if (arg1) {
			this.method6391(arg0);
		} else {
			this.field4297 = new class421(arg0);
			this.field4298 = new class423(arg0);
			this.field4299 = new class423(arg0);
		}
	}

	@ObfuscatedName("oe.n(Lalw;)V")
	public void method6391(class997 arg0) {
		int var2 = arg0.method17904();
		float var3 = 0.0F;
		float var4 = 0.0F;
		float var5 = 0.0F;
		float var6 = 1.0F;
		if ((var2 & 0x1) != 0) {
			var3 = (float) arg0.method17973() / 32768.0F;
			var4 = (float) arg0.method17973() / 32768.0F;
			var5 = (float) arg0.method17973() / 32768.0F;
			var6 = (float) arg0.method17973() / 32768.0F;
		}
		this.field4297 = new class421(var3, var4, var5, var6);
		float var7 = 0.0F;
		float var8 = 0.0F;
		float var9 = 0.0F;
		if ((var2 & 0x2) != 0) {
			var7 = arg0.method17973();
		}
		if ((var2 & 0x4) != 0) {
			var8 = arg0.method17973();
		}
		if ((var2 & 0x8) != 0) {
			var9 = arg0.method17973();
		}
		this.field4298 = new class423(var7, var8, var9);
		float var10 = 1.0F;
		float var11 = 1.0F;
		float var12 = 1.0F;
		if ((var2 & 0x10) == 0) {
			if ((var2 & 0x20) != 0) {
				var10 = (float) arg0.method17973() / 128.0F;
			}
			if ((var2 & 0x40) != 0) {
				var11 = (float) arg0.method17973() / 128.0F;
			}
			if ((var2 & 0x80) != 0) {
				var12 = (float) arg0.method17973() / 128.0F;
			}
		} else {
			float var13 = (float) arg0.method17973() / 128.0F;
			var12 = var13;
			var11 = var13;
			var10 = var13;
		}
		this.field4299 = new class423(var10, var11, var12);
	}

	@ObfuscatedName("oe.m(Loe;)V")
	public void method6386(class420 arg0) {
		this.field4297.method6412(arg0.field4297);
		this.field4298.method6492(arg0.field4298);
		this.field4299.method6492(arg0.field4299);
	}

	@ObfuscatedName("oe.k()V")
	public final void method6387() {
		this.field4297.method6418();
		this.field4298.method6494();
		this.field4298.method6526(this.field4297);
		this.field4299.field4308 = 1.0F / this.field4299.field4308;
		this.field4299.field4311 = 1.0F / this.field4299.field4311;
		this.field4299.field4313 = 1.0F / this.field4299.field4313;
	}

	@ObfuscatedName("oe.f(Loe;)V")
	public final void method6398(class420 arg0) {
		this.field4297.method6424(arg0.field4297);
		this.field4298.method6526(arg0.field4297);
		this.field4298.method6497(arg0.field4298);
		this.field4299.method6506(arg0.field4299);
	}

	public String toString() {
		return "[" + this.field4297.toString() + "|" + this.field4298.toString() + "|" + this.field4299.toString() + "]";
	}

	public boolean equals(Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof class420) {
			class420 var2 = (class420) arg0;
			return this.field4297.equals(var2.field4297) && this.field4298.method6488(var2.field4298) && this.field4299.method6488(var2.field4299);
		} else {
			return false;
		}
	}
}
