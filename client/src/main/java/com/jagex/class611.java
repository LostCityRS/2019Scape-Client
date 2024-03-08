package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("wz")
public class class611 {

	@ObfuscatedName("wz.e")
	public int field7612;

	@ObfuscatedName("wz.n")
	public int field7611;

	@ObfuscatedName("wz.m")
	public class729 field7613;

	@ObfuscatedName("wz.k")
	public class720 field7614 = new class720();

	public class611(int arg0) {
		this.field7612 = arg0;
		this.field7611 = arg0;
		int var2;
		for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
		}
		this.field7613 = new class729(var2);
	}

	@ObfuscatedName("wz.e(Lwk;)Ljava/lang/Object;")
	public final Object method9646(class610 arg0) {
		long var2 = arg0.method9641();
		for (class1184 var4 = (class1184) this.field7613.method14495(var2); var4 != null; var4 = (class1184) this.field7613.method14496()) {
			if (var4.field12362.method9638(arg0)) {
				Object var5 = var4.method19487();
				if (var5 != null) {
					if (var4.method19488()) {
						class1231 var6 = new class1231(arg0, var5, var4.field12363);
						this.field7613.method14501(var6, var4.field6760);
						this.field7614.method14339(var6);
						var6.field11440 = 0L;
						var4.method8440();
						var4.method17806();
					} else {
						this.field7614.method14339(var4);
						var4.field11440 = 0L;
					}
					return var5;
				}
				var4.method8440();
				var4.method17806();
				this.field7611 += var4.field12363;
			}
		}
		return null;
	}

	@ObfuscatedName("wz.n(Lwk;)V")
	public final void method9650(class610 arg0) {
		long var2 = arg0.method9641();
		for (class1184 var4 = (class1184) this.field7613.method14495(var2); var4 != null; var4 = (class1184) this.field7613.method14496()) {
			if (var4.field12362.method9638(arg0)) {
				this.method9648(var4);
				break;
			}
		}
	}

	@ObfuscatedName("wz.m(Lasr;)V")
	public final void method9648(class1184 arg0) {
		if (arg0 != null) {
			arg0.method8440();
			arg0.method17806();
			this.field7611 += arg0.field12363;
		}
	}

	@ObfuscatedName("wz.k(Ljava/lang/Object;Lwk;)V")
	public final void method9654(Object arg0, class610 arg1) {
		this.method9656(arg0, arg1, 1);
	}

	@ObfuscatedName("wz.f(Ljava/lang/Object;Lwk;I)V")
	public final void method9656(Object arg0, class610 arg1, int arg2) {
		if (arg2 > this.field7612) {
			throw new IllegalStateException();
		}
		this.method9650(arg1);
		this.field7611 -= arg2;
		while (this.field7611 < 0) {
			class1184 var4 = (class1184) this.field7614.method14315();
			this.method9648(var4);
		}
		class1231 var5 = new class1231(arg1, arg0, arg2);
		this.field7613.method14501(var5, arg1.method9641());
		this.field7614.method14339(var5);
		var5.field11440 = 0L;
	}

	@ObfuscatedName("wz.w(I)V")
	public final void method9651(int arg0) {
		for (class1184 var2 = (class1184) this.field7614.method14317(); var2 != null; var2 = (class1184) this.field7614.method14324()) {
			if (var2.method19488()) {
				if (var2.method19487() == null) {
					var2.method8440();
					var2.method17806();
					this.field7611 += var2.field12363;
				}
			} else if (++var2.field11440 > (long) arg0) {
				class1232 var3 = new class1232(var2.field12362, var2.method19487(), var2.field12363);
				this.field7613.method14501(var3, var2.field6760);
				class720.method10144(var3, var2);
				var2.method8440();
				var2.method17806();
			}
		}
	}

	@ObfuscatedName("wz.l()V")
	public final void method9652() {
		this.field7614.method14316();
		this.field7613.method14499();
		this.field7611 = this.field7612;
	}

	@ObfuscatedName("wz.u()V")
	public final void method9653() {
		for (class1184 var1 = (class1184) this.field7614.method14317(); var1 != null; var1 = (class1184) this.field7614.method14324()) {
			if (var1.method19488()) {
				var1.method8440();
				var1.method17806();
				this.field7611 += var1.field12363;
			}
		}
	}
}
