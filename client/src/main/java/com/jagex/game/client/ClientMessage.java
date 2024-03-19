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
	public static ClientMessage createMessage(ClientProt prot, Isaac isaac) {
		ClientMessage message = popMessage();
		message.prot = prot;
		message.size = prot.size;
		if (message.size == -1) {
			message.buf = new PacketBit(260);
		} else if (message.size == -2) {
			message.buf = new PacketBit(10000);
		} else if (message.size <= 18) {
			message.buf = new PacketBit(20);
		} else if (message.size <= 98) {
			message.buf = new PacketBit(100);
		} else {
			message.buf = new PacketBit(260);
		}
		message.buf.setIsaac(isaac);
		message.buf.pIsaac1(message.prot.id);
		message.pos = 0;
		return message;
	}

	@ObfuscatedName("zw.m(B)Lakl;")
	public static ClientMessage createMessage() {
		ClientMessage message = popMessage();
		message.prot = null;
		message.size = 0;
		message.buf = new PacketBit(5000);
		return message;
	}

	@ObfuscatedName("akl.k(I)V")
	public void pushMessage() {
		if (messageIndex < messages.length) {
			messages[++messageIndex - 1] = this;
		}
	}
}
