package com.jagex.game.client;

import rs2.client.Client;
import com.jagex.core.io.SendablePacket;
import deob.ObfuscatedName;
import deob.Statics;
import rs2.shared.prot.ClientProt;

@ObfuscatedName("alv")
public class ClientMapBuildStuck extends MapBuildStuck implements SendablePacket {

	public ClientMapBuildStuck(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7, int arg8) {
		super(arg0, arg1, arg2 > 65535 ? 65535 : arg2, arg3, arg4 > 255 ? 255 : arg4, arg5, arg6, arg7, arg8 > 255 ? 255 : arg8);
	}

	@ObfuscatedName("alv.e(I)V")
	public void method9201() {
		ClientMessage var1 = Statics.method1604(ClientProt.MAP_BUILD_STUCK, Client.field10849.field794);
		var1.field11432.p1_alt3(this.field8862);
		int var2 = (this.field8869 ? 2 : 0) | (this.field8867 ? 1 : 0);
		var1.field11432.p1_alt2(var2);
		var1.field11432.p1_alt3(this.field8866);
		var1.field11432.p2_alt1(this.field8864);
		var1.field11432.p1(this.field8865);
		var1.field11432.p4_alt3(this.field8870);
		var1.field11432.p4_alt1(this.field8863);
		var1.field11432.p1_alt3(this.field8868);
		Client.field10849.method934(var1);
	}
}
