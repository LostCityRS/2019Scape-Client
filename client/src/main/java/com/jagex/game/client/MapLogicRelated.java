package com.jagex.game.client;

import com.jagex.game.network.ServerConnection;
import com.jagex.game.network.protocol.ClientProt;
import deob.ObfuscatedName;
import deob.Statics;
import rs2.client.Client;

import java.io.IOException;

@ObfuscatedName("rz")
public class MapLogicRelated {

	public MapLogicRelated() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("pg.e(ZB)V")
	public static void method6969(boolean arg0) {
		Client.field1798.method3149();
		if (!Client.isStateGame(Client.state)) {
			return;
		}
		ServerConnection[] var1 = Client.field10850;
		for (int var2 = 0; var2 < var1.length; var2++) {
			ServerConnection var3 = var1[var2];
			var3.field793++;
			if (var3.field793 < 50 && !arg0) {
				return;
			}
			var3.field793 = 0;
			if (!var3.field808 && var3.method939() != null) {
				ClientMessage var4 = Statics.method1604(ClientProt.NO_TIMEOUT, var3.field794);
				var3.method934(var4);
				try {
					var3.method933();
				} catch (IOException var6) {
					var3.field808 = true;
				}
			}
		}
		Client.field1798.method3149();
	}
}
