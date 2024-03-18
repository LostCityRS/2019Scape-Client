package com.jagex.game.client;

import com.jagex.core.datastruct.Link;
import com.jagex.core.datastruct.LinkQueue;
import deob.ObfuscatedName;
import rs2.client.scene.entities.PathingEntity;

@ObfuscatedName("ajq")
public class CoverMarkerClickbox extends Link {

	@ObfuscatedName("ajq.m")
	public static LinkQueue field11198 = new LinkQueue();

	@ObfuscatedName("ajq.k")
	public static int field11196 = 0;

	@ObfuscatedName("ajq.f")
	public PathingEntity field11197;

	@ObfuscatedName("ajq.w")
	public int field11199;

	@ObfuscatedName("ajq.l")
	public int field11195;

	@ObfuscatedName("ajq.u")
	public int field11200;

	@ObfuscatedName("ajq.z")
	public int field11201;

	@ObfuscatedName("aaq.n(I)Lajq;")
	public static CoverMarkerClickbox method14429() {
		CoverMarkerClickbox var0 = (CoverMarkerClickbox) field11198.pollFront();
		if (var0 == null) {
			return new CoverMarkerClickbox();
		} else {
			field11196--;
			return var0;
		}
	}

	@ObfuscatedName("fs.m(Lajq;I)V")
	public static void method3032(CoverMarkerClickbox arg0) {
		arg0.field11197 = null;
		if (field11196 < 20) {
			field11198.pushBack(arg0);
			field11196++;
		}
	}
}
