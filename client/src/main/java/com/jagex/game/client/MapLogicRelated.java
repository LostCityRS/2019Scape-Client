package com.jagex.game.client;

import com.jagex.game.network.ServerConnection;
import com.jagex.game.network.protocol.ClientProt;
import deob.ObfuscatedName;
import java.io.IOException;
import rs2.client.Client;

@ObfuscatedName("rz")
public class MapLogicRelated {

	public MapLogicRelated() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("pg.e(ZB)V")
	public static void noTimeoutConnections(boolean arg0) {
		Client.audioApi.update();
		if (!Client.isStateGame(Client.state)) {
			return;
		}
		ServerConnection[] var1 = Client.connections;
		for (int var2 = 0; var2 < var1.length; var2++) {
			ServerConnection var3 = var1[var2];
			var3.numConnections++;
			if (var3.numConnections < 50 && !arg0) {
				return;
			}
			var3.numConnections = 0;
			if (!var3.disconnected && var3.getStream() != null) {
				ClientMessage var4 = ClientMessage.createMessage(ClientProt.NO_TIMEOUT, var3.randomOut);
				var3.queue(var4);
				try {
					var3.flush();
				} catch (IOException var6) {
					var3.disconnected = true;
				}
			}
		}
		Client.audioApi.update();
	}
}
