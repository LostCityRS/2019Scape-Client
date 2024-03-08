package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ace")
public abstract class class782 implements class761 {

	@ObfuscatedName("ace.e")
	public final class442 field9157;

	@ObfuscatedName("ace.n")
	public class162 field9156;

	public class782(class442 arg0, int arg1) {
		this.field9157 = arg0;
		this.field9156 = new class162(arg1);
	}

	@ObfuscatedName("ace.e(IB)V")
	public void method15072(int arg0) {
		this.field9156 = new class162(arg0);
	}

	@ObfuscatedName("ace.n(I)V")
	public void method15075() {
		class162 var1 = this.field9156;
		synchronized (this.field9156) {
			this.field9156.method2924();
		}
	}

	@ObfuscatedName("ace.m(II)V")
	public void method15074(int arg0) {
		class162 var2 = this.field9156;
		synchronized (this.field9156) {
			this.field9156.method2923(arg0);
		}
	}

	@ObfuscatedName("ace.k(I)V")
	public void method15078() {
		class162 var1 = this.field9156;
		synchronized (this.field9156) {
			this.field9156.method2928();
		}
	}
}
