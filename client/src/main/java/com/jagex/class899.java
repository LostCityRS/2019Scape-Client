package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ahr")
public class class899 extends class286 {

	@ObfuscatedName("ahr.u")
	public class238 field10505;

	@ObfuscatedName("ahr.z")
	public class1150 field10512;

	@ObfuscatedName("ahr.p")
	public final class426 field10506 = new class426();

	@ObfuscatedName("ahr.d")
	public class1150 field10507;

	@ObfuscatedName("ahr.c")
	public class1150 field10504;

	@ObfuscatedName("ahr.r")
	public class1150 field10508;

	@ObfuscatedName("ahr.v")
	public class1150 field10509;

	@ObfuscatedName("ahr.o")
	public class1150 field10503;

	@ObfuscatedName("ahr.s")
	public class1150 field10511;

	@ObfuscatedName("ahr.y")
	public class234 field10514;

	@ObfuscatedName("ahr.q")
	public class234 field10513;

	@ObfuscatedName("ahr.x")
	public class234 field10510;

	public class899(class850 arg0) throws class1108 {
		super(arg0);
		this.method16630();
	}

	@ObfuscatedName("ahr.p(B)Z")
	public boolean method16630() throws class1108 {
		this.field10505 = this.field2986.method15964("Particle");
		this.field10507 = this.field10505.method4157("WVPMatrix");
		this.field10512 = this.field10505.method4157("DiffuseSampler");
		this.field10504 = this.field10505.method4157("TexCoordMatrix");
		this.field10508 = this.field10505.method4157("DistanceFogPlane");
		this.field10509 = this.field10505.method4157("DistanceFogColour");
		this.field10503 = this.field10505.method4157("DistanceFogAmount");
		this.field10511 = this.field10505.method4157("DiffuseColour");
		this.field10514 = this.field10505.method4227("NoFog");
		this.field10513 = this.field10505.method4227("ParticleFog");
		this.field10510 = this.field10505.method4227("BillboardFog");
		if (!this.field10514.method4083()) {
			return false;
		} else if (this.field10513.method4083()) {
			return this.field10510.method4083();
		} else {
			return false;
		}
	}

	@ObfuscatedName("ahr.e(Lpq;)V")
	public void method5038(class426 arg0) {
		this.field10506.method6604(arg0);
		this.field10506.method6720(this.field2986.field10081);
	}

	@ObfuscatedName("ahr.n(IZ)V")
	public void method5039(int arg0, boolean arg1) {
		this.field10505.method4162(arg1 ? this.field10513 : this.field10514);
		this.field10505.method4244();
		this.method16629(arg1, true);
		this.field2986.method16079(class357.field3403, 0, arg0 * 4, 0, arg0 * 2);
	}

	@ObfuscatedName("ahr.m(Z)V")
	public void method5040(boolean arg0) {
		this.field10505.method4162(arg0 ? this.field10510 : this.field10514);
		this.field10505.method4244();
		this.method16629(arg0, false);
		this.field2986.method16075();
	}

	@ObfuscatedName("ahr.d(ZZB)V")
	public void method16629(boolean arg0, boolean arg1) {
		this.field10505.method4252(this.field10512, 0, this.field2991);
		this.field10505.method4166(this.field10507, this.field10506);
		this.field10505.method4201(this.field10504, this.field2987);
		this.field10505.method4173(this.field10511, this.field2988);
		if (!arg0) {
			return;
		}
		if (arg1) {
			this.field10505.method4169(this.field10508, this.field2989.field4244, this.field2989.field4243, this.field2989.field4242, this.field2989.field4245);
		} else {
			this.field10505.method4268(this.field10503, Math.min(Math.max(this.field2985, 0.0F), 1.0F));
		}
		this.field10505.method4218(this.field10509, this.field2990.field4308, this.field2990.field4311, this.field2990.field4313);
	}
}
