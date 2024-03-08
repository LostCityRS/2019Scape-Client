package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("uo")
public class SimpleToolkitChange implements SendablePacket {

	@ObfuscatedName("uo.e")
	public final ToolkitType field7281;

	public SimpleToolkitChange(ToolkitType arg0) {
		this.field7281 = arg0;
	}

	@ObfuscatedName("uo.e(I)V")
	public void method9201() {
		ClientMessage var1 = Statics.method1604(ClientProt.SIMPLE_TOOLKIT_CHANGE, client.field10849.field794);
		var1.field11432.p1_alt1(this.field7281.getId());
		client.field10849.method934(var1);
	}
}
