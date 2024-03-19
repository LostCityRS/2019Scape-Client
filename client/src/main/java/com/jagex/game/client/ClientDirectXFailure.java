package com.jagex.game.client;

import com.jagex.core.io.SendablePacket;
import com.jagex.game.network.protocol.ClientProt;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("ux")
public class ClientDirectXFailure implements SendablePacket {

	@ObfuscatedName("ux.e")
	public final int field7274;

	public ClientDirectXFailure(int arg0) {
		this.field7274 = arg0;
	}

	@ObfuscatedName("ux.e(I)V")
	public void method9201() {
		ClientMessage var1 = ClientMessage.createMessage(ClientProt.DIRECTX_FAILURE, Client.gameConnection.randomOut);
		var1.buf.p2(this.field7274);
		Client.gameConnection.queue(var1);
	}
}
