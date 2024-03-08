package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ih")
public abstract class class261 implements class761 {

	@ObfuscatedName("ih.e")
	public final class696 field2772;

	@ObfuscatedName("ih.n")
	public boolean field2769;

	@ObfuscatedName("ih.m")
	public final class442 field2770;

	@ObfuscatedName("ih.k")
	public final class162 field2771 = new class162(50);

	@ObfuscatedName("ih.f")
	public final class162 field2768 = new class162(5);

	@ObfuscatedName("ih.w")
	public int field2773;

	@ObfuscatedName("ih.l")
	public final String[] field2774;

	public class261(boolean arg0, class442 arg1, class687 arg2, class696 arg3) {
		this.field2769 = arg0;
		this.field2770 = arg1;
		this.field2772 = arg3;
		if (class696.field8335 == this.field2772) {
			this.field2774 = new String[] { null, null, null, null, null, class776.field9075.method15021(arg2) };
		} else {
			this.field2774 = new String[] { null, null, null, null, null, null };
		}
	}

	@ObfuscatedName("ih.e(ZI)V")
	public void method4579(boolean arg0) {
		if (this.field2769 != arg0) {
			this.field2769 = arg0;
			this.method4577();
		}
	}

	@ObfuscatedName("ih.n(II)V")
	public void method4575(int arg0) {
		this.field2773 = arg0;
		class162 var2 = this.field2771;
		synchronized (this.field2771) {
			this.field2771.method2924();
		}
		class162 var4 = this.field2768;
		synchronized (this.field2768) {
			this.field2768.method2924();
		}
	}

	@ObfuscatedName("ih.m(B)V")
	public void method4577() {
		class162 var1 = this.field2771;
		synchronized (this.field2771) {
			this.field2771.method2924();
		}
		class162 var3 = this.field2768;
		synchronized (this.field2768) {
			this.field2768.method2924();
		}
	}

	@ObfuscatedName("ih.k(II)V")
	public void method4578(int arg0) {
		class162 var2 = this.field2771;
		synchronized (this.field2771) {
			this.field2771.method2923(arg0);
		}
		class162 var4 = this.field2768;
		synchronized (this.field2768) {
			this.field2768.method2923(arg0);
		}
	}

	@ObfuscatedName("ih.f(I)V")
	public void method4584() {
		class162 var1 = this.field2771;
		synchronized (this.field2771) {
			this.field2771.method2928();
		}
		class162 var3 = this.field2768;
		synchronized (this.field2768) {
			this.field2768.method2928();
		}
	}
}
