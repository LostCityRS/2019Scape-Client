package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ad")
public class class43 {

	@ObfuscatedName("ad.e")
	public static boolean field735 = false;

	public class43() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("qm.e(B)V")
	public static void method7319() {
		if (field735) {
			return;
		}
		method3097(client.field10855.method7743().field6904);
		if (client.field10855.method7743().field6914 != null) {
			method3097(client.field10855.method7743().field6914);
		}
		field735 = true;
	}

	@ObfuscatedName("fw.n([[[Ltk;I)V")
	public static void method3097(class551[][][] arg0) {
		for (int var1 = 0; var1 < arg0.length; var1++) {
			class551[][] var2 = arg0[var1];
			for (int var3 = 0; var3 < var2.length; var3++) {
				for (int var4 = 0; var4 < var2[var3].length; var4++) {
					class551 var5 = var2[var3][var4];
					if (var5 != null) {
						if (var5.field6974 instanceof class514) {
							((class514) var5.field6974).method8205();
						}
						if (var5.field6968 instanceof class514) {
							((class514) var5.field6968).method8205();
						}
						if (var5.field6976 instanceof class514) {
							((class514) var5.field6976).method8205();
						}
						if (var5.field6966 instanceof class514) {
							((class514) var5.field6966).method8205();
						}
						if (var5.field6967 instanceof class514) {
							((class514) var5.field6967).method8205();
						}
						for (class557 var6 = var5.field6964; var6 != null; var6 = var6.field7058) {
							class1200 var7 = var6.field7057;
							if (var7 instanceof class514) {
								((class514) var7).method8205();
							}
						}
					}
				}
			}
		}
	}
}
