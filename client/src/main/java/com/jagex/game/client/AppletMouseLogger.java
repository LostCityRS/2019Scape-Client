package com.jagex.game.client;

import com.jagex.core.io.Packet;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.game.network.protocol.ClientProt;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("alt")
public class AppletMouseLogger extends MouseLogger {

	@ObfuscatedName("alt.l(I)V")
	public void method10270() {
		MouseEvent var1 = this.method18354();
		if (var1 == null) {
			return;
		}
		int var2 = this.method10262(var1, 32767);
		int var3 = var1.method17832();
		if (var3 < 0) {
			var3 = 0;
		} else if (var3 > 65535) {
			var3 = 65535;
		}
		int var4 = var1.method17831();
		if (var4 < 0) {
			var4 = 0;
		} else if (var4 > 65535) {
			var4 = 65535;
		}
		byte var5 = 0;
		if (var1.method17848() == 2) {
			var5 = 1;
		}
		ClientMessage var6 = ClientMessage.method1604(ClientProt.EVENT_MOUSE_CLICK, Client.gameConnection.field794);
		var6.buf.p4(var4 | var3 << 16);
		var6.buf.p2_alt3(var2 | var5 << 15);
		Client.gameConnection.queue(var6);
	}

	@ObfuscatedName("alt.u(I)Z")
	public boolean method10272() {
		return this.method18354() != null || this.field7953 < MonotonicTime.get() - 2000L;
	}

	@ObfuscatedName("alt.i(I)Lakm;")
	public MouseEvent method18354() {
		return (MouseEvent) Client.field10816.method14191();
	}

	@ObfuscatedName("alt.z(S)Lakl;")
	public ClientMessage method10267() {
		return ClientMessage.method1604(ClientProt.EVENT_MOUSE_MOVE, Client.gameConnection.field794);
	}

	@ObfuscatedName("alt.w(Lalw;Lakm;I)V")
	public void method10264(Packet arg0, MouseEvent arg1) {
	}

	@ObfuscatedName("alt.f(I)I")
	public int method10263() {
		return 0;
	}
}
