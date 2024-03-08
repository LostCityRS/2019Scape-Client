package com.jagex;

import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("abe")
public class class758 implements class51 {

	@ObfuscatedName("abe.e")
	public final class442 field8792;

	@ObfuscatedName("abe.n")
	public final class655 field8793;

	@ObfuscatedName("abe.m")
	public int field8794;

	@ObfuscatedName("abe.k")
	public class162 field8795;

	@ObfuscatedName("abe.f")
	public final class761 field8796;

	public class758(class696 arg0, class687 arg1, class442 arg2, class655 arg3, int arg4, class761 arg5) {
		this.field8792 = arg2;
		this.field8793 = arg3;
		this.field8796 = arg5;
		this.field8794 = class760.method8370(this.field8792, this.field8793);
		this.field8795 = new class162(arg4);
	}

	@ObfuscatedName("abe.e(II)Lay;")
	public class53 method962(int arg0) {
		class162 var2 = this.field8795;
		class53 var3;
		synchronized (this.field8795) {
			var3 = (class53) this.field8795.method2930((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		class53 var5 = this.method14909(arg0);
		class162 var6 = this.field8795;
		synchronized (this.field8795) {
			this.field8795.method2921(var5, (long) arg0);
			return var5;
		}
	}

	@ObfuscatedName("abe.u(II)Lay;")
	public class53 method14909(int arg0) {
		class442 var2 = this.field8792;
		byte[] var3;
		synchronized (this.field8792) {
			var3 = class760.method9853(this.field8792, this.field8793, arg0);
		}
		class53 var5 = this.field8796.method4414(arg0, this);
		if (var3 != null) {
			var5.method976(new Packet(var3));
		}
		var5.method975();
		return var5;
	}

	@ObfuscatedName("abe.n(I)I")
	public int method963() {
		return this.field8794;
	}

	@ObfuscatedName("abe.z(II)V")
	public void method14910(int arg0) {
		class162 var2 = this.field8795;
		synchronized (this.field8795) {
			this.field8795.method2924();
			this.field8795 = new class162(arg0);
		}
	}

	@ObfuscatedName("abe.r(I)V")
	public void method14895() {
		class162 var1 = this.field8795;
		synchronized (this.field8795) {
			this.field8795.method2924();
		}
	}

	@ObfuscatedName("abe.v(II)V")
	public void method14896(int arg0) {
		class162 var2 = this.field8795;
		synchronized (this.field8795) {
			this.field8795.method2923(arg0);
		}
	}

	@ObfuscatedName("abe.o(I)V")
	public void method14899() {
		class162 var1 = this.field8795;
		synchronized (this.field8795) {
			this.field8795.method2928();
		}
	}

	public Iterator iterator() {
		return new class765(this);
	}
}
