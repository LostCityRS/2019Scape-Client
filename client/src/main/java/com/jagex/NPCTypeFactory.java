package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ih")
public abstract class NPCTypeFactory implements ConfigTypeFactory {

	@ObfuscatedName("ih.e")
	public final ModeGame field2772;

	@ObfuscatedName("ih.n")
	public boolean field2769;

	@ObfuscatedName("ih.m")
	public final Js5 field2770;

	@ObfuscatedName("ih.k")
	public final WeightedCache field2771 = new WeightedCache(50);

	@ObfuscatedName("ih.f")
	public final WeightedCache field2768 = new WeightedCache(5);

	@ObfuscatedName("ih.w")
	public int field2773;

	@ObfuscatedName("ih.l")
	public final String[] field2774;

	public NPCTypeFactory(boolean arg0, Js5 arg1, Language arg2, ModeGame arg3) {
		this.field2769 = arg0;
		this.field2770 = arg1;
		this.field2772 = arg3;
		if (ModeGame.field8335 == this.field2772) {
			this.field2774 = new String[] { null, null, null, null, null, LocalisedText.field9075.method15021(arg2) };
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
		WeightedCache var2 = this.field2771;
		synchronized (this.field2771) {
			this.field2771.method2924();
		}
		WeightedCache var4 = this.field2768;
		synchronized (this.field2768) {
			this.field2768.method2924();
		}
	}

	@ObfuscatedName("ih.m(B)V")
	public void method4577() {
		WeightedCache var1 = this.field2771;
		synchronized (this.field2771) {
			this.field2771.method2924();
		}
		WeightedCache var3 = this.field2768;
		synchronized (this.field2768) {
			this.field2768.method2924();
		}
	}

	@ObfuscatedName("ih.k(II)V")
	public void method4578(int arg0) {
		WeightedCache var2 = this.field2771;
		synchronized (this.field2771) {
			this.field2771.method2923(arg0);
		}
		WeightedCache var4 = this.field2768;
		synchronized (this.field2768) {
			this.field2768.method2923(arg0);
		}
	}

	@ObfuscatedName("ih.f(I)V")
	public void method4584() {
		WeightedCache var1 = this.field2771;
		synchronized (this.field2771) {
			this.field2771.method2928();
		}
		WeightedCache var3 = this.field2768;
		synchronized (this.field2768) {
			this.field2768.method2928();
		}
	}
}
