package com.jagex.js5.network;

import com.jagex.core.datastruct.DualIterableQueue;
import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("pp")
public abstract class Js5TcpClient {

	@ObfuscatedName("pp.l")
	public DualIterableQueue urgent = new DualIterableQueue();

	@ObfuscatedName("pp.u")
	public DualIterableQueue field4451 = new DualIterableQueue();

	@ObfuscatedName("pp.z")
	public DualIterableQueue prefetch = new DualIterableQueue();

	@ObfuscatedName("pp.p")
	public DualIterableQueue field4443 = new DualIterableQueue();

	@ObfuscatedName("pp.d")
	public int field4441;

	@ObfuscatedName("pp.c")
	public long field4452;

	@ObfuscatedName("pp.r")
	public Packet field4450 = new Packet(6);

	@ObfuscatedName("pp.v")
	public byte xorcode = 0;

	@ObfuscatedName("pp.o")
	public volatile int field4455 = 0;

	@ObfuscatedName("pp.s")
	public volatile int field4454 = 0;

	@ObfuscatedName("pp.y")
	public volatile int field4457 = -1;

	@ObfuscatedName("pp.q")
	public volatile int field4456 = -1;

	@ObfuscatedName("pp.x")
	public Packet field4459 = new Packet(5);

	@ObfuscatedName("pp.b")
	public Packet field4460 = new Packet(5);

	@ObfuscatedName("pp.h")
	public int field4461 = 0;

	@ObfuscatedName("pp.a")
	public Js5NetRequest field4462 = null;

	@ObfuscatedName("pp.e(IIBZI)Lauq;")
	public Js5NetRequest method7011(int arg0, int arg1, byte arg2, boolean arg3) {
		long var5 = ((long) arg0 << 32) + (long) arg1;
		Js5NetRequest var7 = new Js5NetRequest();
		var7.field11440 = var5;
		var7.field12565 = arg2;
		var7.field12342 = arg3;
		if (arg3) {
			if (this.method7021() >= 500) {
				throw new RuntimeException();
			}
			this.urgent.method14339(var7);
		} else if (this.method7013() < 500) {
			this.prefetch.method14339(var7);
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
		return this.prefetch.method14320() + this.field4443.method14320();
	}

	@ObfuscatedName("pp.f(I)I")
	public int method7021() {
		return this.urgent.method14320() + this.field4451.method14320();
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
