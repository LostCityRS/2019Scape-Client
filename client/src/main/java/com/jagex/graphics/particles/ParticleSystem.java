package com.jagex.graphics.particles;

import com.jagex.game.client.MovingParticle;
import com.jagex.game.world.entity.Scene;
import com.jagex.graphics.ModelParticleEffector;
import com.jagex.graphics.ModelParticleEmitter;
import com.jagex.graphics.Toolkit;
import deob.ObfuscatedName;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("xy")
public class ParticleSystem {

	@ObfuscatedName("xy.e")
	public boolean field7804 = false;

	@ObfuscatedName("xy.n")
	public boolean field7810 = false;

	@ObfuscatedName("xy.m")
	public MovingParticle[] field7805 = new MovingParticle[8192];

	@ObfuscatedName("xy.k")
	public int field7806 = 0;

	@ObfuscatedName("xy.f")
	public long field7811;

	@ObfuscatedName("xy.w")
	public long field7808;

	@ObfuscatedName("xy.l")
	public List field7809 = new LinkedList();

	@ObfuscatedName("xy.u")
	public int field7813 = 0;

	@ObfuscatedName("xy.z")
	public List field7803 = new LinkedList();

	@ObfuscatedName("xy.p")
	public int field7812 = 0;

	@ObfuscatedName("xy.d")
	public boolean field7814 = false;

	@ObfuscatedName("xy.c")
	public boolean field7807 = false;

	@ObfuscatedName("xy.r")
	public int field7815;

	@ObfuscatedName("xy.v")
	public ParticleList field7816 = new ParticleList();

	@ObfuscatedName("xy.o")
	public static boolean[] field7817 = new boolean[64];

	@ObfuscatedName("xy.s")
	public static boolean[] field7818 = new boolean[16];

	@ObfuscatedName("xy.e(IZ)Lxy;")
	public static ParticleSystem method9962(int arg0, boolean arg1) {
		if (ParticleSystemRenderer.field7793 == ParticleSystemRenderer.field7792) {
			return new ParticleSystem(arg0, arg1);
		} else {
			ParticleSystem var2 = ParticleSystemRenderer.field1920[ParticleSystemRenderer.field7793];
			ParticleSystemRenderer.field7793 = ParticleSystemRenderer.field7793 + 1 & ParticleLimits.field1419[ParticleSystemRenderer.field7802];
			var2.method9929(arg0, arg1);
			return var2;
		}
	}

	public ParticleSystem(int arg0, boolean arg1) {
		this.method9929(arg0, arg1);
	}

	@ObfuscatedName("xy.n(IZ)V")
	public void method9929(int arg0, boolean arg1) {
		ParticleSystemRenderer.field8349.add(this);
		this.field7808 = arg0;
		this.field7811 = arg0;
		this.field7814 = true;
		this.field7807 = arg1;
	}

	@ObfuscatedName("xy.m()V")
	public void method9930() {
		this.field7814 = true;
	}

	@ObfuscatedName("xy.k()V")
	public void method9968() {
		this.field7804 = true;
		Iterator var1 = this.field7803.iterator();
		while (var1.hasNext()) {
			ParticleEffector var2 = (ParticleEffector) var1.next();
			if (var2.field11483.field3549 == 1) {
				var2.unlink();
			}
		}
		for (int var3 = 0; var3 < this.field7805.length; var3++) {
			if (this.field7805[var3] != null) {
				this.field7805[var3].method19669();
				this.field7805[var3] = null;
			}
		}
		this.field7806 = 0;
		this.field7809 = new LinkedList();
		this.field7813 = 0;
		this.field7803 = new LinkedList();
		this.field7812 = 0;
	}

	@ObfuscatedName("xy.f()V")
	public void method9932() {
		this.field7810 = true;
	}

	@ObfuscatedName("xy.w()V")
	public void method9946() {
		this.field7810 = false;
	}

	@ObfuscatedName("xy.l(Ldh;J)Z")
	public boolean method9934(Toolkit arg0, long arg1) {
		if (this.field7811 == this.field7808) {
			this.method9946();
		} else {
			this.method9932();
		}
		if (arg1 - this.field7808 > 750L) {
			this.method9968();
			return false;
		}
		int var4 = (int) (arg1 - this.field7811);
		if (this.field7814) {
			Iterator var5 = this.field7809.iterator();
			while (var5.hasNext()) {
				ParticleEmitter var6 = (ParticleEmitter) var5.next();
				for (int var7 = 0; var7 < var6.field7772.field3458; var7++) {
					var6.method9897(arg0, arg1, 1, !this.field7810);
				}
			}
			this.field7814 = false;
		}
		Iterator var8 = this.field7809.iterator();
		while (var8.hasNext()) {
			ParticleEmitter var9 = (ParticleEmitter) var8.next();
			var9.method9897(arg0, arg1, var4, !this.field7810);
		}
		this.field7811 = arg1;
		return true;
	}

	@ObfuscatedName("xy.u(J)V")
	public void method9935(long arg0) {
		this.field7808 = arg0;
	}

	@ObfuscatedName("xy.z(Ldh;J[Ldu;[Lcq;Z)V")
	public void method9936(Toolkit arg0, long arg1, ModelParticleEmitter[] arg2, ModelParticleEffector[] arg3, boolean arg4) {
		if (!this.field7804) {
			this.method9937(arg0, arg2, arg4);
			this.method9938(arg3, arg4);
			this.field7808 = arg1;
		}
	}

	@ObfuscatedName("xy.p(Ldh;[Ldu;Z)V")
	public void method9937(Toolkit arg0, ModelParticleEmitter[] arg1, boolean arg2) {
		for (int var4 = 0; var4 < 64; var4++) {
			field7817[var4] = false;
		}
		Iterator var5 = this.field7809.iterator();
		while (true) {
			label66: while (var5.hasNext()) {
				ParticleEmitter var6 = (ParticleEmitter) var5.next();
				if (arg1 != null) {
					for (int var7 = 0; var7 < arg1.length && var7 != 64; var7++) {
						if (arg1[var7] == var6.field7788 || arg1[var7].field1465 == var6.field7788) {
							field7817[var7] = true;
							var6.method9896();
							var6.field7778 = false;
							continue label66;
						}
					}
				}
				if (!arg2) {
					if (var6.field7776 == 0) {
						var5.remove();
						this.field7813--;
					} else {
						var6.field7778 = true;
					}
				}
			}
			if (arg1 != null) {
				for (int var8 = 0; var8 < arg1.length && var8 != 64 && this.field7813 != 64; var8++) {
					if (!field7817[var8]) {
						ParticleEmitter var9 = new ParticleEmitter(arg0, arg1[var8], this, this.field7808);
						this.field7809.add(var9);
						this.field7813++;
						field7817[var8] = true;
					}
				}
			}
			return;
		}
	}

	@ObfuscatedName("xy.d([Lcq;Z)V")
	public void method9938(ModelParticleEffector[] arg0, boolean arg1) {
		for (int var3 = 0; var3 < 16; var3++) {
			field7818[var3] = false;
		}
		Iterator var4 = this.field7803.iterator();
		while (true) {
			label71: while (var4.hasNext()) {
				ParticleEffector var5 = (ParticleEffector) var4.next();
				if (arg0 != null) {
					for (int var6 = 0; var6 < arg0.length; var6++) {
						if (arg0[var6] == var5.field11488 || arg0[var6].field1230 == var5.field11488) {
							field7818[var6] = true;
							var5.method17872();
							continue label71;
						}
					}
				}
				if (!arg1) {
					var5.unlink();
					this.field7812--;
					if (var5.isLinked()) {
						var5.unlink();
						ParticleSystemRenderer.field7796--;
					}
				}
			}
			if (arg0 != null) {
				for (int var7 = 0; var7 < arg0.length && var7 != 16 && this.field7812 != 16; var7++) {
					if (!field7818[var7]) {
						ParticleEffector var8 = null;
						if (arg0[var7].method1509(ParticleSystemRenderer.field12041).field3549 == 1 && ParticleSystemRenderer.field7796 < 32) {
							var8 = new ParticleEffector(arg0[var7], this);
							ParticleSystemRenderer.field7800.put(var8, (long) arg0[var7].field1228);
							ParticleSystemRenderer.field7796++;
						}
						if (var8 == null) {
							var8 = new ParticleEffector(arg0[var7], this);
						}
						this.field7803.add(var8);
						this.field7812++;
						field7818[var7] = true;
					}
				}
			}
			return;
		}
	}

	@ObfuscatedName("xy.c()Ldm;")
	public ParticleList method9939() {
		this.field7816.list.clear();
		for (int var1 = 0; var1 < this.field7805.length; var1++) {
			if (this.field7805[var1] != null && this.field7805[var1].field12526 != null) {
				this.field7816.list.pushBack(this.field7805[var1]);
			}
		}
		return this.field7816;
	}

	@ObfuscatedName("xy.r(IIIII)V")
	public void method9963(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.field7815 = arg0;
	}

	@ObfuscatedName("xy.v(Ltx;Ldh;)V")
	public void method9941(Scene arg0, Toolkit arg1) {
		this.field7816.list.clear();
		Iterator var3 = this.field7809.iterator();
		while (var3.hasNext()) {
			ParticleEmitter var4 = (ParticleEmitter) var3.next();
			var4.method9898(arg0, arg1, this.field7811);
		}
	}

	@ObfuscatedName("xy.o()Ldm;")
	public ParticleList method9965() {
		return this.field7816;
	}
}
