package com.jagex;

import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("adm")
public class class807 extends class808 implements class51 {

	@ObfuscatedName("adm.n")
	public final class442 field9257;

	@ObfuscatedName("adm.m")
	public final class162 field9258 = new class162(64);

	public class807(class696 arg0, class455 arg1, class687 arg2, class442 arg3) {
		super(arg0, arg1, arg2, arg3 == null ? 0 : arg3.method6897(arg1.method7218().field8040));
		this.field9257 = arg3;
	}

	@ObfuscatedName("adm.e(II)Lay;")
	public class53 method962(int arg0) {
		class162 var2 = this.field9258;
		synchronized (this.field9258) {
			class860 var3 = (class860) this.field9258.method2930((long) arg0);
			if (var3 == null) {
				var3 = this.method15266(arg0);
				this.field9258.method2921(var3, (long) arg0);
			}
			return var3;
		}
	}

	@ObfuscatedName("adm.r(IB)Lafv;")
	public class860 method15266(int arg0) {
		byte[] var2 = this.field9257.method6879(this.field9260.method7218().field8040, arg0);
		class860 var3 = new class860(this.field9260, arg0);
		if (var2 != null) {
			var3.method976(new class997(var2));
		}
		return var3;
	}

	@ObfuscatedName("adm.v(I)V")
	public void method15277() {
		class162 var1 = this.field9258;
		synchronized (this.field9258) {
			this.field9258.method2924();
		}
	}

	@ObfuscatedName("adm.o(II)V")
	public void method15274(int arg0) {
		class162 var2 = this.field9258;
		synchronized (this.field9258) {
			this.field9258.method2923(arg0);
		}
	}

	@ObfuscatedName("adm.s(I)V")
	public void method15268() {
		class162 var1 = this.field9258;
		synchronized (this.field9258) {
			this.field9258.method2928();
		}
	}

	public Iterator iterator() {
		return new class638(this);
	}

	@ObfuscatedName("adm.n(I)I")
	public int method963() {
		return super.method963();
	}
}
