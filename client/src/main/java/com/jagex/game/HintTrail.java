package com.jagex.game;

import com.jagex.core.datastruct.SceneLevelTileFlags;
import com.jagex.core.io.Packet;
import com.jagex.game.shared.movement.CoordGrid;
import com.jagex.game.world.entity.Scene;
import com.jagex.graphics.Model;
import com.jagex.graphics.ModelUnlit;
import com.jagex.graphics.Toolkit;
import deob.ObfuscatedName;
import rs2.client.Client;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ta")
public class HintTrail {

	@ObfuscatedName("ta.e")
	public static int modelDetails = 0;

	@ObfuscatedName("ta.n")
	public final int field6749;

	@ObfuscatedName("ta.m")
	public final int field6751;

	@ObfuscatedName("ta.k")
	public final int[] field6750;

	@ObfuscatedName("ta.f")
	public final int[] field6753;

	@ObfuscatedName("ta.w")
	public Model model;

	@ObfuscatedName("ta.l")
	public LinkedList field6752;

	@ObfuscatedName("ta.u")
	public boolean field6756;

	public HintTrail(Toolkit arg0, Packet arg1, int arg2) {
		this.field6749 = arg2;
		this.field6751 = arg1.gSmart1or2s();
		this.field6750 = new int[this.field6751];
		this.field6753 = new int[this.field6751];
		int var4 = arg1.g2();
		int var5 = arg1.g2();
		for (int var6 = 0; var6 < this.field6751; var6++) {
			this.field6750[var6] = var4 + arg1.g1b();
			this.field6753[var6] = var5 + arg1.g1b();
		}
		this.model = this.method8402(arg0);
	}

	@ObfuscatedName("ta.e(Ldh;S)Ldo;")
	public Model method8402(Toolkit arg0) {
		ModelUnlit var2 = ModelUnlit.get(Client.modelsJs5, this.field6749, 0);
		if (var2 == null) {
			return null;
		} else {
			if (var2.version < 13) {
				var2.scaleByPowerOfTwo(2);
			}
			return arg0.createModel(var2, 2048, modelDetails, 64, 768);
		}
	}

	@ObfuscatedName("ta.n(Ltx;B)V")
	public void method8412(Scene arg0) {
		if (arg0 == null || this.field6751 <= 0) {
			return;
		}
		this.method8405(arg0);
		Iterator var2 = this.field6752.iterator();
		while (var2.hasNext()) {
			HintTrailPoint var3 = (HintTrailPoint) var2.next();
			arg0.addEntity(var3, false);
		}
		this.field6756 = true;
	}

	@ObfuscatedName("ta.m(Ltx;B)V")
	public void method8404(Scene arg0) {
		if (arg0 == null || this.field6752 == null) {
			return;
		}
		Iterator var2 = this.field6752.iterator();
		while (var2.hasNext()) {
			HintTrailPoint var3 = (HintTrailPoint) var2.next();
			arg0.removeEntity(var3.level, var3.minSceneTileX, var3.minSceneTileZ, new HintTrailPointPrimaryLayerEntityPredicate(var3));
		}
	}

	@ObfuscatedName("ta.k(Ltx;B)V")
	public void method8405(Scene arg0) {
		this.field6752 = new LinkedList();
		SceneLevelTileFlags var2 = Client.world.getSceneLevelTileFlags();
		CoordGrid var3 = Client.world.getBase();
		CoordGrid var4 = new CoordGrid(Client.currentPlayerLevel, this.field6750[0], this.field6753[0]);
		for (int var5 = 1; var5 < this.field6751; var5++) {
			CoordGrid var6 = new CoordGrid(Client.currentPlayerLevel, this.field6750[var5], this.field6753[var5]);
			while (var4.x != var6.x || var4.z != var6.z) {
				if (var4.x < var6.x) {
					var4.x++;
				} else if (var4.x > var6.x) {
					var4.x--;
				}
				if (var4.z < var6.z) {
					var4.z++;
				} else if (var4.z > var6.z) {
					var4.z--;
				}
				int var7 = Client.currentPlayerLevel;
				int var8 = var4.x - var3.x;
				int var9 = var4.z - var3.z;
				if (var8 >= 0 && var8 < arg0.maxTileX && var9 >= 0 && var9 < arg0.maxTileZ) {
					int var10 = (var8 << 9) + 256;
					int var11 = (var9 << 9) + 256;
					if (var2.isLinkBelow(var8, var9)) {
						var7++;
					}
					this.field6752.add(new HintTrailPoint(arg0, this, Client.currentPlayerLevel, var7, var10, Client.getHeightmapY(var10, var11, Client.currentPlayerLevel), var11));
				}
			}
			var4 = var6;
		}
	}

	@ObfuscatedName("qo.f(II)V")
	public static void resetModelCache(int arg0) {
		modelDetails = arg0;
	}

	@ObfuscatedName("ta.w(I)V")
	public void method8406() {
		this.field6756 = false;
		this.model = null;
	}

	@ObfuscatedName("ta.l(I)Z")
	public boolean method8407() {
		return this.field6756;
	}

	@ObfuscatedName("ta.u(Ldh;I)Z")
	public boolean method8408(Toolkit arg0) {
		this.model = this.method8402(arg0);
		return this.model != null;
	}
}
