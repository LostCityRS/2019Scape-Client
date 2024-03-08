package com.jagex;

import deob.ObfuscatedName;
import jagdx.IUnknown;

@ObfuscatedName("op")
public abstract class class408 implements class329 {

	@ObfuscatedName("op.e")
	public final class1126 field4219;

	@ObfuscatedName("op.n")
	public final class109 field4221;

	@ObfuscatedName("op.m")
	public final class135 field4218;

	@ObfuscatedName("op.k")
	public boolean field4220;

	@ObfuscatedName("op.f")
	public long field4217 = 0L;

	public class408(class1126 arg0, class109 arg1, class135 arg2, boolean arg3, int arg4) {
		this.field4219 = arg0;
		this.field4221 = arg1;
		this.field4218 = arg2;
		this.field4220 = arg3;
		this.field4219.method15985(this);
	}

	@ObfuscatedName("op.bl()J")
	public long method6225() {
		return this.field4217;
	}

	@ObfuscatedName("op.ay(Llt;)V")
	public void method5824(class343 arg0) {
	}

	@ObfuscatedName("op.m()V")
	public void method1010() {
		if (this.field4217 != 0L) {
			IUnknown.Release(this.field4217);
			this.field4217 = 0L;
		}
		this.field4219.method16198(this);
	}

	@ObfuscatedName("op.bk()V")
	public void method6226() {
		if (this.field4217 != 0L) {
			this.field4219.method19023(this.field4217);
			this.field4217 = 0L;
		}
	}

	public void finalize() {
		this.method6226();
	}
}
