package com.jagex.game.world;

import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("tw")
public class WorldMapRelated {

	@ObfuscatedName("tw.e")
	public int field6777;

	@ObfuscatedName("tw.n")
	public int[] field6776;

	@ObfuscatedName("tw.m")
	public int[] field6775;

	public WorldMapRelated(int arg0) {
		this.field6777 = arg0;
		this.field6776 = new int[this.field6777];
		this.field6775 = new int[this.field6777];
	}

	@ObfuscatedName("nn.e(Lpy;Ljava/lang/String;ZB)Ltw;")
	public static WorldMapRelated method6046(Js5 arg0, String arg1, boolean arg2) {
		int var3 = arg0.getgroupid(arg1);
		if (var3 == -1) {
			return new WorldMapRelated(0);
		}
		byte[] var4 = arg0.getfile(var3, 1);
		if (var4 == null) {
			return new WorldMapRelated(0);
		}
		Packet var5 = new Packet(var4);
		int var6 = var5.g2();
		WorldMapRelated var7 = new WorldMapRelated(var6);
		int var8 = 0;
		while (true) {
			while (var8 < var7.field6777) {
				int var9 = var5.g4s();
				int var10 = var5.g2();
				int var11 = var5.g1();
				if (!arg2 && var11 == 1) {
					var7.field6777--;
				} else {
					var7.field6776[var8] = var9;
					var7.field6775[var8] = var10;
					var8++;
				}
			}
			return var7;
		}
	}
}
