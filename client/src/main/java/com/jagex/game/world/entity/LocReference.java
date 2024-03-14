package com.jagex.game.world.entity;

import com.jagex.game.shared.movement.CoordGrid;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("yv")
public class LocReference {

	@ObfuscatedName("yv.e")
	public final CoordGrid field8196;

	@ObfuscatedName("yv.n")
	public final int field8195;

	@ObfuscatedName("yv.m")
	public final int field8197;

	public LocReference(CoordGrid arg0, int arg1, int arg2, int arg3) {
		this.field8196 = arg0;
		this.field8195 = arg1;
		this.field8197 = arg3;
	}

	@ObfuscatedName("yv.e(I)I")
	public int method10759() {
		return Client.field10914[this.field8195];
	}

	@ObfuscatedName("yv.n(I)Lst;")
	public Location method10760() {
		Location var1 = this.method10761();
		if (var1 == null) {
			return null;
		} else if (var1.method8223() == this.field8197) {
			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("yv.m(I)Lst;")
	public Location method10761() {
		int var1 = this.field8196.level;
		CoordGrid var2 = Client.world.method7727();
		int var3 = this.field8196.x - var2.x;
		int var4 = this.field8196.z - var2.z;
		if (var3 < 0 || var4 < 0 || var3 >= Client.world.method7728() || var4 >= Client.world.method7758() || Client.world.method7743() == null) {
			return null;
		}
		switch(this.method10759()) {
			case 0:
				return (Location) Client.world.method7743().method8711(var1, var3, var4);
			case 1:
				return (Location) Client.world.method7743().method8735(var1, var3, var4);
			case 2:
				return (Location) Client.world.method7743().method8856(var1, var3, var4, Client.field11001);
			case 3:
				return (Location) Client.world.method7743().method8767(var1, var3, var4);
			default:
				return null;
		}
	}
}
