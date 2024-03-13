package com.jagex.game.client;

import com.jagex.core.datastruct.Node;
import com.jagex.core.io.PacketBit;
import com.jagex.encryption.Isaac;
import com.jagex.game.network.protocol.ClientProt;
import deob.ObfuscatedName;

@ObfuscatedName("akl")
public class ClientMessage extends Node {

	@ObfuscatedName("akl.k")
	public ClientProt field11435;

	@ObfuscatedName("akl.f")
	public int field11431;

	@ObfuscatedName("akl.w")
	public PacketBit field11432;

	@ObfuscatedName("akl.l")
	public int field11430;

	@ObfuscatedName("akl.u")
	public static ClientMessage[] field11434 = new ClientMessage[300];

	@ObfuscatedName("akl.z")
	public static int field11433 = 0;

	@ObfuscatedName("rd.e(I)Lakl;")
	public static ClientMessage method7898() {
		return field11433 == 0 ? new ClientMessage() : field11434[--field11433];
	}

	@ObfuscatedName("cj.n(Lnr;Laav;B)Lakl;")
	public static ClientMessage method1604(ClientProt arg0, Isaac arg1) {
		ClientMessage var2 = method7898();
		var2.field11435 = arg0;
		var2.field11431 = arg0.field3807;
		if (var2.field11431 == -1) {
			var2.field11432 = new PacketBit(260);
		} else if (var2.field11431 == -2) {
			var2.field11432 = new PacketBit(10000);
		} else if (var2.field11431 <= 18) {
			var2.field11432 = new PacketBit(20);
		} else if (var2.field11431 <= 98) {
			var2.field11432 = new PacketBit(100);
		} else {
			var2.field11432 = new PacketBit(260);
		}
		var2.field11432.setIsaac(arg1);
		var2.field11432.method19555(var2.field11435.field3806);
		var2.field11430 = 0;
		return var2;
	}

	@ObfuscatedName("zw.m(B)Lakl;")
	public static ClientMessage method13920() {
		ClientMessage var0 = method7898();
		var0.field11435 = null;
		var0.field11431 = 0;
		var0.field11432 = new PacketBit(5000);
		return var0;
	}

	@ObfuscatedName("akl.k(I)V")
	public void method17793() {
		if (field11433 < field11434.length) {
			field11434[++field11433 - 1] = this;
		}
	}
}
