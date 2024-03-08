package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("vh")
public abstract class class599 {

	@ObfuscatedName("vh.e")
	public boolean field7531;

	@ObfuscatedName("vh.n")
	public final class162 field7530 = new class162(500);

	@ObfuscatedName("vh.m")
	public final class162 field7533 = new class162(30);

	@ObfuscatedName("vh.k")
	public final class162 field7532 = new class162(50);

	@ObfuscatedName("vh.f")
	public int field7536;

	@ObfuscatedName("vh.w")
	public final String[] field7534;

	@ObfuscatedName("vh.l")
	public class120[] field7535 = new class120[4];

	@ObfuscatedName("vh.u")
	public class746 field7529 = new class746(null, null);

	public class599(boolean arg0, class687 arg1, class696 arg2) {
		this.field7531 = arg0;
		if (class696.field8335 == arg2) {
			this.field7534 = new String[] { null, null, null, null, null, class776.field9075.method15021(arg1) };
		} else {
			this.field7534 = new String[] { null, null, null, null, null, null };
		}
	}

	@ObfuscatedName("vh.e(ZI)V")
	public void method9519(boolean arg0) {
		if (this.field7531 != arg0) {
			this.field7531 = arg0;
			this.method9521();
		}
	}

	@ObfuscatedName("vh.n(IB)V")
	public void method9541(int arg0) {
		this.field7536 = arg0;
		class162 var2 = this.field7530;
		synchronized (this.field7530) {
			this.field7530.method2924();
		}
		class162 var4 = this.field7533;
		synchronized (this.field7533) {
			this.field7533.method2924();
		}
		class162 var6 = this.field7532;
		synchronized (this.field7532) {
			this.field7532.method2924();
		}
	}

	@ObfuscatedName("vh.m(I)V")
	public void method9521() {
		class162 var1 = this.field7530;
		synchronized (this.field7530) {
			this.field7530.method2924();
		}
		class162 var3 = this.field7533;
		synchronized (this.field7533) {
			this.field7533.method2924();
		}
		class162 var5 = this.field7532;
		synchronized (this.field7532) {
			this.field7532.method2924();
		}
		this.field7535 = new class120[4];
		this.field7529 = new class746(null, null);
	}

	@ObfuscatedName("vh.k(IB)V")
	public void method9522(int arg0) {
		class162 var2 = this.field7530;
		synchronized (this.field7530) {
			this.field7530.method2923(arg0);
		}
		class162 var4 = this.field7533;
		synchronized (this.field7533) {
			this.field7533.method2923(arg0);
		}
		class162 var6 = this.field7532;
		synchronized (this.field7532) {
			this.field7532.method2923(arg0);
		}
	}

	@ObfuscatedName("vh.f(I)V")
	public void method9520() {
		class162 var1 = this.field7530;
		synchronized (this.field7530) {
			this.field7530.method2928();
		}
		class162 var3 = this.field7533;
		synchronized (this.field7533) {
			this.field7533.method2928();
		}
		class162 var5 = this.field7532;
		synchronized (this.field7532) {
			this.field7532.method2928();
		}
	}

	@ObfuscatedName("vh.l(IS)Z")
	public abstract boolean method9525(int arg0);

	@ObfuscatedName("vh.w(II)[B")
	public abstract byte[] method9530(int arg0);
}
