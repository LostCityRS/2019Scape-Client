package com.jagex.game.world.entity;

import com.jagex.graphics.scenegraph.PrimaryLayerEntity;
import deob.ObfuscatedName;

@ObfuscatedName("uc")
public class PrimaryLayerEntityList {

    @ObfuscatedName("uc.e")
	public PrimaryLayerEntity field7057;

	@ObfuscatedName("uc.n")
	public PrimaryLayerEntityList field7058;

	@ObfuscatedName("uc.m")
	public static int field7059 = 0;

	@ObfuscatedName("wx.k")
	public static PrimaryLayerEntityList field7674;

	@ObfuscatedName("j.e(Lash;I)Luc;")
	public static PrimaryLayerEntityList method644(PrimaryLayerEntity arg0) {
		PrimaryLayerEntityList var1;
		if (field7674 == null) {
			var1 = new PrimaryLayerEntityList();
		} else {
			var1 = field7674;
			field7674 = field7674.field7058;
			var1.field7058 = null;
			field7059--;
		}
		var1.field7057 = arg0;
		return var1;
	}

	@ObfuscatedName("uc.n(B)V")
	public void method8973() {
		if (field7059 < 500) {
			this.field7057 = null;
			this.field7058 = field7674;
			field7674 = this;
			field7059++;
		}
	}
}
