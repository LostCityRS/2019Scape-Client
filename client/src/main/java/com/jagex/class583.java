package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("vl")
public abstract class class583 {

	@ObfuscatedName("vl.e")
	public final class442 field7315;

	@ObfuscatedName("vl.n")
	public final class162 field7316 = new class162(20);

	public class583(class442 arg0) {
		this.field7315 = arg0;
	}

	@ObfuscatedName("vl.e(I)V")
	public void method9277() {
		class162 var1 = this.field7316;
		synchronized (this.field7316) {
			this.field7316.method2924();
		}
	}

	@ObfuscatedName("vl.n(II)V")
	public void method9282(int arg0) {
		class162 var2 = this.field7316;
		synchronized (this.field7316) {
			this.field7316.method2923(arg0);
		}
	}

	@ObfuscatedName("vl.m(I)V")
	public void method9279() {
		class162 var1 = this.field7316;
		synchronized (this.field7316) {
			this.field7316.method2928();
		}
	}
}
