package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("agc")
public final class class889 extends class238 {

	@ObfuscatedName("agc.z")
	public final class1126 field10388;

	@ObfuscatedName("agc.p")
	public class887 field10389;

	@ObfuscatedName("agc.d")
	public boolean field10387;

	public class889(class1126 arg0, class239 arg1) {
		super(arg0, arg1);
		this.field10388 = arg0;
		this.field10387 = false;
	}

	@ObfuscatedName("agc.f(Lafc;Lhn;)Lhi;")
	public class234 method4156(class850 arg0, class233 arg1) {
		return new class887((class1126) arg0, this, arg1);
	}

	@ObfuscatedName("agc.d(Lhi;)Z")
	public boolean method4162(class234 arg0) {
		if (this.field10389 == arg0) {
			return true;
		} else if (arg0.method4083()) {
			this.field10389 = (class887) arg0;
			this.field2573 = this.method4200(arg0);
			if (this.field2573 == -1) {
				throw new IllegalArgumentException();
			}
			if (this.field10387) {
				this.field10388.method19032(this.field10389.field10367);
				this.field10388.method18998(this.field10389.field10360);
				this.field10388.field11972 = this.field10389;
			}
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("agc.v(Lhv;)Laql;")
	public class1150 method4165(class240 arg0) {
		return new class1220(this, arg0);
	}

	@ObfuscatedName("agc.e()V")
	public void method4244() {
		if (this.field10389 == null) {
			throw new class1209();
		}
		this.field10388.method19032(this.field10389.field10367);
		this.field10388.method18998(this.field10389.field10360);
		this.field10388.field11972 = this.field10389;
		this.field10387 = true;
	}

	@ObfuscatedName("agc.n()V")
	public void method4214() {
		this.field10388.method19032(0L);
		this.field10388.method18998(0L);
		this.field10387 = false;
		this.field10388.field11972 = null;
		this.field10388.method16038(1);
		this.field10388.method16092(null);
		this.field10388.method16038(0);
		this.field10388.method16092(null);
	}

	@ObfuscatedName("agc.m()Z")
	public boolean method4184() {
		return this.field10388.field11972 == this.field10389;
	}
}
