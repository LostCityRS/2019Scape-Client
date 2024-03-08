package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("yc")
public abstract class class681 implements class761 {

	@ObfuscatedName("yc.e")
	public final class442 field8265;

	@ObfuscatedName("yc.n")
	public final class162 field8266 = new class162(60);

	@ObfuscatedName("yc.m")
	public int field8264;

	public class681(class442 arg0) {
		this.field8265 = arg0;
	}

	@ObfuscatedName("yc.e(II)V")
	public void method13832(int arg0) {
		this.field8264 = arg0;
		class162 var2 = this.field8266;
		synchronized (this.field8266) {
			this.field8266.method2924();
		}
	}

	@ObfuscatedName("yc.n(B)V")
	public void method13834() {
		class162 var1 = this.field8266;
		synchronized (this.field8266) {
			this.field8266.method2924();
		}
	}

	@ObfuscatedName("yc.m(IB)V")
	public void method13821(int arg0) {
		class162 var2 = this.field8266;
		synchronized (this.field8266) {
			this.field8266.method2923(arg0);
		}
	}

	@ObfuscatedName("yc.k(I)V")
	public void method13822() {
		class162 var1 = this.field8266;
		synchronized (this.field8266) {
			this.field8266.method2928();
		}
	}
}
