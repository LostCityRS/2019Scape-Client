package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;
import com.jagex.game.client.MoveSpeed;
import deob.ObfuscatedName;
import rs2.client.scene.entities.PathingEntity;

@ObfuscatedName("er")
public class CutsceneRoute {

	@ObfuscatedName("er.m")
	public final int[] field1751;

	@ObfuscatedName("er.k")
	public final int[] field1754;

	public CutsceneRoute(Packet arg0) {
		int var2 = arg0.gSmart1or2();
		this.field1751 = new int[var2];
		this.field1754 = new int[var2];
		for (int var3 = 0; var3 < var2; var3++) {
			int var4 = arg0.g1();
			this.field1751[var3] = var4;
			int var5 = arg0.g2();
			int var6 = arg0.g2();
			this.field1754[var3] = (var5 << 16) + var6;
		}
	}

	@ObfuscatedName("er.e(Lea;II)V")
	public void method2906(CutsceneEntity arg0, int arg1) {
		int var3 = this.field1754[0];
		arg0.method2866(arg1, var3 >>> 16, var3 & 0xFFFF);
		PathingEntity var4 = arg0.getEntity();
		var4.routeLength = 0;
		for (int var5 = this.field1751.length - 1; var5 >= 0; var5--) {
			int var6 = this.field1751[var5];
			int var7 = this.field1754[var5];
			var4.routeWaypointX[var4.routeLength] = var7 >> 16;
			var4.routeWaypointZ[var4.routeLength] = var7 & 0xFFFF;
			byte var8 = MoveSpeed.WALK.serialID;
			if (var6 == 0) {
				var8 = MoveSpeed.CRAWL.serialID;
			} else if (var6 == 2) {
				var8 = MoveSpeed.RUN.serialID;
			}
			var4.routeSpeeds[var4.routeLength] = var8;
			var4.routeLength++;
		}
	}
}
