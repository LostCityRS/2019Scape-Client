package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
import rs2.shared.prot.ClientProt;

@ObfuscatedName("ux")
public class ClientDirectXFailure implements SendablePacket {

	@ObfuscatedName("ux.e")
	public final int field7274;

	public ClientDirectXFailure(int arg0) {
		this.field7274 = arg0;
	}

	@ObfuscatedName("ux.e(I)V")
	public void method9201() {
		ClientMessage var1 = Statics.method1604(ClientProt.DIRECTX_FAILURE, client.field10849.field794);
		var1.field11432.p2(this.field7274);
		client.field10849.method934(var1);
	}
}
