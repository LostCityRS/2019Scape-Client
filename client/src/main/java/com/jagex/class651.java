package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("xd")
public abstract class class651 {

	@ObfuscatedName("xd.e")
	public class442 field7960;

	@ObfuscatedName("xd.n")
	public final class162 field7959 = new class162(2);

	public class651(class442 arg0) {
		this.field7960 = arg0;
	}

	@ObfuscatedName("xd.e(I)V")
	public void method10287() {
		class162 var1 = this.field7959;
		synchronized (this.field7959) {
			this.field7959.method2924();
		}
	}

	@ObfuscatedName("xd.n(II)V")
	public void method10291(int arg0) {
		class162 var2 = this.field7959;
		synchronized (this.field7959) {
			this.field7959.method2923(arg0);
		}
	}

	@ObfuscatedName("xd.m(I)V")
	public void method10289() {
		class162 var1 = this.field7959;
		synchronized (this.field7959) {
			this.field7959.method2928();
		}
	}
}
