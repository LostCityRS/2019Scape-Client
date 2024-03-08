package com.jagex;

import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("adj")
public class class806 extends class808 implements class51 {

	@ObfuscatedName("adj.n")
	public final class442 field9255;

	@ObfuscatedName("adj.m")
	public final class162 field9254 = new class162(64);

	public class806(class696 arg0, class455 arg1, class687 arg2, class442 arg3) {
		super(arg0, arg1, arg2, arg3 == null ? 0 : arg3.method6897(arg1.method7218().field8040));
		this.field9255 = arg3;
	}

	@ObfuscatedName("adj.e(II)Lay;")
	public class53 method962(int arg0) {
		class162 var2 = this.field9254;
		synchronized (this.field9254) {
			class859 var3 = (class859) this.field9254.method2930((long) arg0);
			if (var3 == null) {
				var3 = this.method15255(arg0);
				this.field9254.method2921(var3, (long) arg0);
			}
			return var3;
		}
	}

	@ObfuscatedName("adj.r(II)Laff;")
	public class859 method15255(int arg0) {
		byte[] var2 = this.field9255.method6879(this.field9260.method7218().field8040, arg0);
		class859 var3 = new class859(this.field9260, arg0);
		if (var2 != null) {
			var3.method976(new Packet(var2));
		}
		return var3;
	}

	@ObfuscatedName("adj.v(I)V")
	public void method15256() {
		class162 var1 = this.field9254;
		synchronized (this.field9254) {
			this.field9254.method2924();
		}
	}

	@ObfuscatedName("adj.o(II)V")
	public void method15259(int arg0) {
		class162 var2 = this.field9254;
		synchronized (this.field9254) {
			this.field9254.method2923(arg0);
		}
	}

	@ObfuscatedName("adj.s(B)V")
	public void method15257() {
		class162 var1 = this.field9254;
		synchronized (this.field9254) {
			this.field9254.method2928();
		}
	}

	public Iterator iterator() {
		return new class210(this);
	}

	@ObfuscatedName("adj.n(I)I")
	public int method963() {
		return super.method963();
	}
}
