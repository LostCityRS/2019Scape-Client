package com.jagex.game.world;

import com.jagex.core.constants.BuildAreaSize;
import com.jagex.core.datastruct.LinkList;
import com.jagex.core.datastruct.SecondaryNode;
import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("asy")
public class WorldMapAreaMetadata extends SecondaryNode {

	@ObfuscatedName("asy.l")
	public int id;

	@ObfuscatedName("asy.u")
	public String field12351;

	@ObfuscatedName("asy.z")
	public String mapName;

	@ObfuscatedName("asy.p")
	public LinkList field12353;

	@ObfuscatedName("asy.d")
	public int configOrigin;

	@ObfuscatedName("asy.c")
	public int field12355 = -1;

	@ObfuscatedName("asy.r")
	public int configZoom = -1;

	@ObfuscatedName("asy.v")
	public int field12357 = 16384;

	@ObfuscatedName("asy.o")
	public int field12358 = 0;

	@ObfuscatedName("asy.s")
	public int field12361 = 16384;

	@ObfuscatedName("asy.y")
	public int field12360 = 0;

	@ObfuscatedName("asy.q")
	public boolean field12350 = true;

	public WorldMapAreaMetadata(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
		this.id = arg0;
		this.field12351 = arg1;
		this.mapName = arg2;
		this.configOrigin = arg3;
		this.field12355 = arg4;
		this.field12350 = arg5;
		this.configZoom = arg6;
		if (this.configZoom == 255) {
			this.configZoom = 0;
		}
		BuildAreaSize.buildAreaSizeForId(arg7);
		this.field12353 = new LinkList();
	}

	@ObfuscatedName("asy.e(III)Z")
	public boolean method19469(int arg0, int arg1) {
		for (WorldMapSubarea var3 = (WorldMapSubarea) this.field12353.head(); var3 != null; var3 = (WorldMapSubarea) this.field12353.next()) {
			if (var3.method17818(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("asy.n(II[II)Z")
	public boolean method19482(int arg0, int arg1, int[] arg2) {
		for (WorldMapSubarea var4 = (WorldMapSubarea) this.field12353.head(); var4 != null; var4 = (WorldMapSubarea) this.field12353.next()) {
			if (var4.method17814(arg0, arg1)) {
				var4.method17812(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("asy.m(II[II)Z")
	public boolean method19470(int arg0, int arg1, int[] arg2) {
		for (WorldMapSubarea var4 = (WorldMapSubarea) this.field12353.head(); var4 != null; var4 = (WorldMapSubarea) this.field12353.next()) {
			if (var4.method17818(arg0, arg1)) {
				var4.method17816(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("asy.k(III[II)Z")
	public boolean method19471(int arg0, int arg1, int arg2, int[] arg3) {
		for (WorldMapSubarea var5 = (WorldMapSubarea) this.field12353.head(); var5 != null; var5 = (WorldMapSubarea) this.field12353.next()) {
			if (var5.method17815(arg0, arg1, arg2)) {
				var5.method17816(arg1, arg2, arg3);
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("asy.f(S)V")
	public void method19472() {
		this.field12357 = 16384;
		this.field12358 = 0;
		this.field12361 = 16384;
		this.field12360 = 0;
		for (WorldMapSubarea var1 = (WorldMapSubarea) this.field12353.head(); var1 != null; var1 = (WorldMapSubarea) this.field12353.next()) {
			if (var1.field11456 < this.field12357) {
				this.field12357 = var1.field11456;
			}
			if (var1.field11460 > this.field12358) {
				this.field12358 = var1.field11460;
			}
			if (var1.field11459 < this.field12361) {
				this.field12361 = var1.field11459;
			}
			if (var1.field11461 > this.field12360) {
				this.field12360 = var1.field11461;
			}
		}
	}

	@ObfuscatedName("gq.w(Lpy;II)Lasy;")
	public static WorldMapAreaMetadata method3468(Js5 arg0, int arg1) {
		Packet var2 = new Packet(arg0.getfile(0, arg1));
		return method18854(var2, arg1);
	}

	@ObfuscatedName("aow.l(Lalw;II)Lasy;")
	public static WorldMapAreaMetadata method18854(Packet arg0, int arg1) {
		WorldMapAreaMetadata var2 = new WorldMapAreaMetadata(arg1, arg0.gjstr(), arg0.gjstr(), arg0.g4s(), arg0.g4s(), arg0.g1() == 1, arg0.g1(), arg0.g1());
		int var3 = arg0.g1();
		for (int var4 = 0; var4 < var3; var4++) {
			var2.field12353.addTail(new WorldMapSubarea(arg0.g1(), arg0.g2(), arg0.g2(), arg0.g2(), arg0.g2(), arg0.g2(), arg0.g2(), arg0.g2(), arg0.g2()));
		}
		var2.method19472();
		return var2;
	}
}
