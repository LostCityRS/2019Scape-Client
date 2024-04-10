package com.jagex.game.world.entity;

import com.jagex.game.client.RebuildRequest;
import com.jagex.game.client.RebuildType;
import com.jagex.game.config.loctype.LocTypeList;
import com.jagex.game.scene.World;
import deob.ObfuscatedName;
import rs2.client.Client;

import java.util.LinkedList;

@ObfuscatedName("ry")
public class AsyncRebuild implements Runnable {

	@ObfuscatedName("ry.e")
	public volatile boolean field5002 = false;

	@ObfuscatedName("ry.n")
	public LinkedList field5003 = new LinkedList();

	@ObfuscatedName("ry.m")
	public World field5004 = new World(true);

	@ObfuscatedName("ry.e(Laop;I)V")
	public void method7674(LocTypeList arg0) {
		this.field5004.method7733(arg0);
	}

	@ObfuscatedName("ry.n(Lrt;B)V")
	public void method7680(RebuildRequest arg0) {
		LinkedList var2 = this.field5003;
		synchronized (this.field5003) {
			this.field5003.add(arg0);
			this.field5003.notify();
		}
	}

	@ObfuscatedName("ry.m(I)Z")
	public boolean method7676() {
		return this.field5002;
	}

	@ObfuscatedName("ry.k(I)Lrl;")
	public World method7677() {
		return this.field5004;
	}

	@ObfuscatedName("ry.f(Lrl;I)V")
	public void method7678(World arg0) {
		this.field5004 = arg0;
	}

	public void run() {
		while (true) {
			this.method7688();
		}
	}

	@ObfuscatedName("ry.w(I)V")
	public void method7688() {
		Object var1 = null;
		LinkedList var2 = this.field5003;
		RebuildRequest var4;
		synchronized (this.field5003) {
			try {
				this.field5003.wait();
			} catch (InterruptedException var14) {
			}
			var4 = (RebuildRequest) this.field5003.pollFirst();
		}
		try {
			if (var4 != null) {
				this.field5002 = true;
				this.method7689(var4);
			}
		} catch (Exception var12) {
		} finally {
			this.field5002 = false;
		}
	}

	@ObfuscatedName("ry.l(Lrt;I)V")
	public void method7689(RebuildRequest arg0) {
		if (RebuildType.field5070 == arg0.rebuildType) {
			this.field5004.rebuild();
		} else {
			this.field5004.rebuildMap(arg0);
		}
		for (boolean var2 = this.field5004.rebuildScene(); !var2; var2 = this.field5004.rebuildScene()) {
		}
		this.field5004.completeRebuild();
		Client.world.completeRebuild();
	}
}
