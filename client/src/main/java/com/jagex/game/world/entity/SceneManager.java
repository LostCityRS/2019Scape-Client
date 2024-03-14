package com.jagex.game.world.entity;

import com.jagex.graphics.scenegraph.PrimaryLayerEntity;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("ad")
public class SceneManager {

	@ObfuscatedName("ad.e")
	public static boolean field735 = false;

	public SceneManager() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("qm.e(B)V")
	public static void method7319() {
		if (field735) {
			return;
		}
		method3097(Client.world.getScene().field6904);
		if (Client.world.getScene().field6914 != null) {
			method3097(Client.world.getScene().field6914);
		}
		field735 = true;
	}

	@ObfuscatedName("fw.n([[[Ltk;I)V")
	public static void method3097(Tile[][][] arg0) {
		for (int var1 = 0; var1 < arg0.length; var1++) {
			Tile[][] var2 = arg0[var1];
			for (int var3 = 0; var3 < var2.length; var3++) {
				for (int var4 = 0; var4 < var2[var3].length; var4++) {
					Tile var5 = var2[var3][var4];
					if (var5 != null) {
						if (var5.groundDecoration instanceof Location) {
							((Location) var5.groundDecoration).method8205();
						}
						if (var5.wallDecoration instanceof Location) {
							((Location) var5.wallDecoration).method8205();
						}
						if (var5.dynamicWallDecoration instanceof Location) {
							((Location) var5.dynamicWallDecoration).method8205();
						}
						if (var5.wall instanceof Location) {
							((Location) var5.wall).method8205();
						}
						if (var5.dynamicWall instanceof Location) {
							((Location) var5.dynamicWall).method8205();
						}
						for (PrimaryLayerEntityList var6 = var5.entities; var6 != null; var6 = var6.field7058) {
							PrimaryLayerEntity var7 = var6.field7057;
							if (var7 instanceof Location) {
								((Location) var7).method8205();
							}
						}
					}
				}
			}
		}
	}
}
