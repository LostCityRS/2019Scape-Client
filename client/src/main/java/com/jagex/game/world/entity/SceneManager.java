package com.jagex.game.world.entity;

import rs2.client.Client;
import deob.ObfuscatedName;

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
		method3097(Client.world.method7743().field6904);
		if (Client.world.method7743().field6914 != null) {
			method3097(Client.world.method7743().field6914);
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
						if (var5.field6974 instanceof Location) {
							((Location) var5.field6974).method8205();
						}
						if (var5.field6968 instanceof Location) {
							((Location) var5.field6968).method8205();
						}
						if (var5.field6976 instanceof Location) {
							((Location) var5.field6976).method8205();
						}
						if (var5.field6966 instanceof Location) {
							((Location) var5.field6966).method8205();
						}
						if (var5.field6967 instanceof Location) {
							((Location) var5.field6967).method8205();
						}
						for (PrimaryLayerEntityList var6 = var5.field6964; var6 != null; var6 = var6.field7058) {
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
