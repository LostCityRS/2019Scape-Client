package com.jagex.game.client;

import com.jagex.game.network.ServerConnection;
import com.jagex.game.network.protocol.ClientProt;
import deob.ObfuscatedName;
import rs2.client.Client;

import java.io.IOException;

@ObfuscatedName("rz")
public class MapLogicRelated {

	public MapLogicRelated() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("pg.e(ZB)V")
	public static void noTimeoutConnections(boolean force) {
		Client.audioApi.update();
		if (!Client.isStateGame(Client.state)) {
			return;
		}
		ServerConnection[] connections = Client.connections;
		for (int index = 0; index < connections.length; index++) {
			ServerConnection connection = connections[index];
			connection.numConnections++;
			if (connection.numConnections < 50 && !force) {
				return;
			}
			connection.numConnections = 0;
			if (!connection.disconnected && connection.getStream() != null) {
				ClientMessage message = ClientMessage.createMessage(ClientProt.NO_TIMEOUT, connection.randomOut);
				connection.queue(message);
				try {
					connection.flush();
				} catch (IOException ioException) {
					connection.disconnected = true;
				}
			}
		}
		Client.audioApi.update();
	}
}
