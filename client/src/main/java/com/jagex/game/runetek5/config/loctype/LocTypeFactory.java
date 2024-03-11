package com.jagex.game.runetek5.config.loctype;

import com.jagex.LocalisedText;
import com.jagex.ModelUnlit;
import com.jagex.Pair;
import com.jagex.WeightedCache;
import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import deob.ObfuscatedName;

@ObfuscatedName("vh")
public abstract class LocTypeFactory {

	@ObfuscatedName("vh.e")
	public boolean field7531;

	@ObfuscatedName("vh.n")
	public final WeightedCache field7530 = new WeightedCache(500);

	@ObfuscatedName("vh.m")
	public final WeightedCache field7533 = new WeightedCache(30);

	@ObfuscatedName("vh.k")
	public final WeightedCache field7532 = new WeightedCache(50);

	@ObfuscatedName("vh.f")
	public int field7536;

	@ObfuscatedName("vh.w")
	public final String[] field7534;

	@ObfuscatedName("vh.l")
	public ModelUnlit[] field7535 = new ModelUnlit[4];

	@ObfuscatedName("vh.u")
	public Pair field7529 = new Pair(null, null);

	public LocTypeFactory(boolean arg0, Language arg1, ModeGame arg2) {
		this.field7531 = arg0;
		if (ModeGame.RUNESCAPE == arg2) {
			this.field7534 = new String[] { null, null, null, null, null, LocalisedText.EXAMINE.method15021(arg1) };
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
		WeightedCache var2 = this.field7530;
		synchronized (this.field7530) {
			this.field7530.method2924();
		}
		WeightedCache var4 = this.field7533;
		synchronized (this.field7533) {
			this.field7533.method2924();
		}
		WeightedCache var6 = this.field7532;
		synchronized (this.field7532) {
			this.field7532.method2924();
		}
	}

	@ObfuscatedName("vh.m(I)V")
	public void method9521() {
		WeightedCache var1 = this.field7530;
		synchronized (this.field7530) {
			this.field7530.method2924();
		}
		WeightedCache var3 = this.field7533;
		synchronized (this.field7533) {
			this.field7533.method2924();
		}
		WeightedCache var5 = this.field7532;
		synchronized (this.field7532) {
			this.field7532.method2924();
		}
		this.field7535 = new ModelUnlit[4];
		this.field7529 = new Pair(null, null);
	}

	@ObfuscatedName("vh.k(IB)V")
	public void method9522(int arg0) {
		WeightedCache var2 = this.field7530;
		synchronized (this.field7530) {
			this.field7530.method2923(arg0);
		}
		WeightedCache var4 = this.field7533;
		synchronized (this.field7533) {
			this.field7533.method2923(arg0);
		}
		WeightedCache var6 = this.field7532;
		synchronized (this.field7532) {
			this.field7532.method2923(arg0);
		}
	}

	@ObfuscatedName("vh.f(I)V")
	public void method9520() {
		WeightedCache var1 = this.field7530;
		synchronized (this.field7530) {
			this.field7530.method2928();
		}
		WeightedCache var3 = this.field7533;
		synchronized (this.field7533) {
			this.field7533.method2928();
		}
		WeightedCache var5 = this.field7532;
		synchronized (this.field7532) {
			this.field7532.method2928();
		}
	}

	@ObfuscatedName("vh.l(IS)Z")
	public abstract boolean method9525(int arg0);

	@ObfuscatedName("vh.w(II)[B")
	public abstract byte[] method9530(int arg0);
}
