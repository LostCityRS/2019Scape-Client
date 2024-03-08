package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

import java.io.IOException;

@ObfuscatedName("rz")
public class class492 {

	public class492() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("pg.e(ZB)V")
	public static void method6969(boolean arg0) {
		Statics.field1798.method3149();
		if (!client.method2737(client.field10791)) {
			return;
		}
		class49[] var1 = client.field10850;
		for (int var2 = 0; var2 < var1.length; var2++) {
			class49 var3 = var1[var2];
			var3.field793++;
			if (var3.field793 < 50 && !arg0) {
				return;
			}
			var3.field793 = 0;
			if (!var3.field808 && var3.method939() != null) {
				ClientMessage var4 = Statics.method1604(ClientProt.field3785, var3.field794);
				var3.method934(var4);
				try {
					var3.method933();
				} catch (IOException var6) {
					var3.field808 = true;
				}
			}
		}
		Statics.field1798.method3149();
	}
}
