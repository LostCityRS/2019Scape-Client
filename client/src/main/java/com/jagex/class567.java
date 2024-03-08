package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("uy")
public abstract class class567 {

	@ObfuscatedName("uy.e")
	public final class442 field7229;

	@ObfuscatedName("uy.n")
	public class162 field7230 = new class162(20);

	public class567(class442 arg0) {
		this.field7229 = arg0;
	}

	@ObfuscatedName("uy.e(I)V")
	public void method9166() {
		class162 var1 = this.field7230;
		synchronized (this.field7230) {
			this.field7230.method2924();
		}
	}

	@ObfuscatedName("uy.n(II)V")
	public void method9172(int arg0) {
		class162 var2 = this.field7230;
		synchronized (this.field7230) {
			this.field7230.method2923(arg0);
		}
	}

	@ObfuscatedName("uy.m(I)V")
	public void method9168() {
		class162 var1 = this.field7230;
		synchronized (this.field7230) {
			this.field7230.method2928();
		}
	}
}
