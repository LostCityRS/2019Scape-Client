package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("pp")
public abstract class class447 {

	@ObfuscatedName("pp.l")
	public class720 field4448 = new class720();

	@ObfuscatedName("pp.u")
	public class720 field4451 = new class720();

	@ObfuscatedName("pp.z")
	public class720 field4449 = new class720();

	@ObfuscatedName("pp.p")
	public class720 field4443 = new class720();

	@ObfuscatedName("pp.d")
	public int field4441;

	@ObfuscatedName("pp.c")
	public long field4452;

	@ObfuscatedName("pp.r")
	public class997 field4450 = new class997(6);

	@ObfuscatedName("pp.v")
	public byte field4447 = 0;

	@ObfuscatedName("pp.o")
	public volatile int field4455 = 0;

	@ObfuscatedName("pp.s")
	public volatile int field4454 = 0;

	@ObfuscatedName("pp.y")
	public volatile int field4457 = -1;

	@ObfuscatedName("pp.q")
	public volatile int field4456 = -1;

	@ObfuscatedName("pp.x")
	public class997 field4459 = new class997(5);

	@ObfuscatedName("pp.b")
	public class997 field4460 = new class997(5);

	@ObfuscatedName("pp.h")
	public int field4461 = 0;

	@ObfuscatedName("pp.a")
	public class1230 field4462 = null;

	@ObfuscatedName("pp.e(IIBZI)Lauq;")
	public class1230 method7011(int arg0, int arg1, byte arg2, boolean arg3) {
		long var5 = ((long) arg0 << 32) + (long) arg1;
		class1230 var7 = new class1230();
		var7.field11440 = var5;
		var7.field12565 = arg2;
		var7.field12342 = arg3;
		if (arg3) {
			if (this.method7021() >= 500) {
				throw new RuntimeException();
			}
			this.field4448.method14339(var7);
		} else if (this.method7013() < 500) {
			this.field4449.method14339(var7);
		} else {
			throw new RuntimeException();
		}
		return var7;
	}

	@ObfuscatedName("pp.n(I)Z")
	public boolean method7028() {
		return this.method7013() >= 500;
	}

	@ObfuscatedName("pp.m(I)Z")
	public boolean method7012() {
		return this.method7021() >= 500;
	}

	@ObfuscatedName("pp.k(I)I")
	public int method7013() {
		return this.field4449.method14320() + this.field4443.method14320();
	}

	@ObfuscatedName("pp.f(I)I")
	public int method7021() {
		return this.field4448.method14320() + this.field4451.method14320();
	}

	@ObfuscatedName("pp.z(ZI)V")
	public abstract void method7010(boolean arg0);

	@ObfuscatedName("pp.p(I)V")
	public abstract void method7014();

	@ObfuscatedName("pp.w(IIB)V")
	public abstract void method7015(int arg0, int arg1);

	@ObfuscatedName("pp.l(I)Z")
	public abstract boolean method7016();

	@ObfuscatedName("pp.u(Ljava/lang/Object;ZI)V")
	public abstract void method7017(Object arg0, boolean arg1);

	@ObfuscatedName("pp.d(I)V")
	public abstract void method7020();

	@ObfuscatedName("pp.c(I)V")
	public abstract void method7035();
}
