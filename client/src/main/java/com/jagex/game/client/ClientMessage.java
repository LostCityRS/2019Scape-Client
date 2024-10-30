package com.jagex.game.client;

import com.jagex.core.datastruct.Node;
import com.jagex.core.io.PacketBit;
import com.jagex.encryption.Isaac;
import com.jagex.game.network.protocol.ClientProt;
import deob.ObfuscatedName;

@ObfuscatedName("akl")
public class ClientMessage extends Node {

	@ObfuscatedName("akl.k")
	public ClientProt prot;

	@ObfuscatedName("akl.f")
	public int size;

	@ObfuscatedName("akl.w")
	public PacketBit buf;

	@ObfuscatedName("akl.l")
	public int pos;

	@ObfuscatedName("akl.u")
	public static ClientMessage[] messages = new ClientMessage[300];

	@ObfuscatedName("akl.z")
	public static int messageIndex = 0;

	@ObfuscatedName("rd.e(I)Lakl;")
	public static ClientMessage popMessage() {
		return messageIndex == 0 ? new ClientMessage() : messages[--messageIndex];
	}

	@ObfuscatedName("cj.n(Lnr;Laav;B)Lakl;")
	public static ClientMessage createMessage(ClientProt arg0, Isaac arg1) {
		ClientMessage var2 = popMessage();
		var2.prot = arg0;
		var2.size = arg0.size;
		if (var2.size == -1) {
			var2.buf = new PacketBit(260);
		} else if (var2.size == -2) {
			var2.buf = new PacketBit(10000);
		} else if (var2.size <= 18) {
			var2.buf = new PacketBit(20);
		} else if (var2.size <= 98) {
			var2.buf = new PacketBit(100);
		} else {
			var2.buf = new PacketBit(260);
		}
		var2.buf.setIsaac(arg1);
		var2.buf.pIsaac1(var2.prot.id);
		var2.pos = 0;
		return var2;
	}

	@ObfuscatedName("zw.m(B)Lakl;")
	public static ClientMessage createMessage() {
		ClientMessage var0 = popMessage();
		var0.prot = null;
		var0.size = 0;
		var0.buf = new PacketBit(5000);
		return var0;
	}

	@ObfuscatedName("akl.k(I)V")
	public void pushMessage() {
		if (messageIndex < messages.length) {
			messages[++messageIndex - 1] = this;
		}
	}
}
