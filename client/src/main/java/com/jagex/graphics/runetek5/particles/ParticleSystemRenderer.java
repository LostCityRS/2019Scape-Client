package com.jagex.graphics.runetek5.particles;

import com.jagex.*;
import com.jagex.game.runetek5.config.ParticleEffectorType;
import com.jagex.game.runetek5.config.ParticleEffectorTypeList;
import com.jagex.game.runetek5.config.ParticleEmitterTypeList;
import deob.ObfuscatedName;
import deob.Statics;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("xl")
public class ParticleSystemRenderer {

	@ObfuscatedName("xl.m")
	public static int field7791 = 0;

	@ObfuscatedName("xl.k")
	public static int field7797 = 0;

	@ObfuscatedName("xl.w")
	public static int field7793 = 0;

	@ObfuscatedName("xl.l")
	public static int field7792 = 0;

	@ObfuscatedName("xl.u")
	public static int field7790 = 0;

	@ObfuscatedName("xl.z")
	public static int field7801 = 0;

	@ObfuscatedName("xl.d")
	public static ParticleEffectorType[] field7795 = new ParticleEffectorType[16];

	@ObfuscatedName("xl.c")
	public static int field7798 = 0;

	@ObfuscatedName("xl.r")
	public static IterableMap field7799 = new IterableMap(16);

	@ObfuscatedName("xl.v")
	public static IterableMap field7800 = new IterableMap(8);

	@ObfuscatedName("xl.o")
	public static int field7796 = 0;

	@ObfuscatedName("xl.s")
	public static int field7802 = 2;

	public ParticleSystemRenderer() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("vh.e(II)I")
	public static int method9543(int arg0) {
		IntWrapper var1 = (IntWrapper) field7799.method14495((long) arg0);
		if (var1 == null) {
			ParticleEffectorType var2 = Statics.field12041.method5973(arg0);
			if (var2 == null || var2.field3549 != 2) {
				return -1;
			}
			var1 = new IntWrapper(field7798);
			field7799.method14501(var1, (long) arg0);
			field7795[++field7798 - 1] = var2;
		}
		return var1.field11442;
	}

	@ObfuscatedName("ah.n(Lnb;Lnp;I)V")
	public static void method706(ParticleEmitterTypeList arg0, ParticleEffectorTypeList arg1) {
		field7791 = 0;
		field7797 = 0;
		Statics.field8349 = new LinkedList();
		Statics.field7794 = new MovingParticle[1024];
		Statics.field1920 = new ParticleSystem[ParticleLimits.field1419[field7802] + 1];
		field7793 = 0;
		field7792 = 0;
		Statics.field12041 = arg1;
	}

	@ObfuscatedName("po.m(Ldh;J)V")
	public static void method6866(Renderer arg0, long arg1) {
		field7801 = field7790;
		field7790 = 0;
		MonotonicTime.method3655();
		Iterator var3 = Statics.field8349.iterator();
		while (var3.hasNext()) {
			ParticleSystem var4 = (ParticleSystem) var3.next();
			boolean var5 = var4.method9934(arg0, arg1);
			if (!var5) {
				var3.remove();
				Statics.field1920[field7792] = var4;
				field7792 = field7792 + 1 & ParticleLimits.field1419[field7802];
			}
		}
	}

	@ObfuscatedName("tm.k(Ltx;Ldh;B)V")
	public static void method8460(Scene arg0, Renderer arg1) {
		Iterator var2 = Statics.field8349.iterator();
		while (var2.hasNext()) {
			ParticleSystem var3 = (ParticleSystem) var2.next();
			if (var3.field7807) {
				var3.method9941(arg0, arg1);
			}
		}
	}

	@ObfuscatedName("ge.f(B)V")
	public static void method3561() {
		field7800 = new IterableMap(8);
		field7796 = 0;
		Iterator var0 = Statics.field8349.iterator();
		while (var0.hasNext()) {
			ParticleSystem var1 = (ParticleSystem) var0.next();
			var1.method9968();
		}
	}

	@ObfuscatedName("hv.w(II)V")
	public static void method4293(int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		field7802 = arg0;
		Statics.field1920 = new ParticleSystem[ParticleLimits.field1419[field7802] + 1];
		field7793 = 0;
		field7792 = 0;
	}
}
