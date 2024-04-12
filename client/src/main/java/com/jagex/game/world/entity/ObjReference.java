package com.jagex.game.world.entity;

import com.jagex.game.shared.movement.CoordGrid;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.scene.ObjStackList;

@ObfuscatedName("yd")
public class ObjReference {

	@ObfuscatedName("yd.e")
	public final CoordGrid field8244;

	@ObfuscatedName("yd.n")
	public final int field8243;

	public ObjReference(CoordGrid arg0, int arg1) {
		this.field8244 = arg0;
		this.field8243 = arg1;
	}

	@ObfuscatedName("yd.e(I)Laut;")
	public ObjStackEntity method13793() {
		ObjStackList var1 = (ObjStackList) Client.objStacks.get((long) (this.field8244.level << 28 | this.field8244.z << 14 | this.field8244.x));
		if (var1 == null) {
			return null;
		}
		CoordGrid var2 = Client.world.getBase();
		int var3 = this.field8244.x - var2.x;
		int var4 = this.field8244.z - var2.z;
		if (var3 >= 0 && var4 >= 0 && var3 < Client.world.getSizeX() && var4 < Client.world.getSizeZ() && Client.world.getScene() != null) {
			for (Obj var5 = (Obj) var1.levelObjStacks.head(); var5 != null; var5 = (Obj) var1.levelObjStacks.next()) {
				if (this.field8243 == var5.index) {
					return (ObjStackEntity) Client.world.getScene().getObjStack(this.field8244.level, var3, var4);
				}
			}
		}
		return null;
	}
}
