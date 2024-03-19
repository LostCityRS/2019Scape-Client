package com.jagex.graphics;

import com.jagex.core.io.SendablePacket;
import com.jagex.game.client.ClientMessage;
import com.jagex.game.network.protocol.ClientProt;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("uo")
public class SimpleToolkitChange implements SendablePacket {

	@ObfuscatedName("uo.e")
	public final ToolkitType field7281;

	public SimpleToolkitChange(ToolkitType arg0) {
		this.field7281 = arg0;
	}

	@ObfuscatedName("uo.e(I)V")
	public void method9201() {
		ClientMessage var1 = ClientMessage.createMessage(ClientProt.SIMPLE_TOOLKIT_CHANGE, Client.gameConnection.randomOut);
		var1.buf.p1_alt1(this.field7281.getId());
		Client.gameConnection.queue(var1);
	}
}
