package com.jagex.game.client;

import com.jagex.client;
import com.jagex.core.io.SendablePacket;
import deob.ObfuscatedName;
import deob.Statics;
import rs2.shared.prot.ClientProt;

@ObfuscatedName("alq")
public class ClientAutoSetupResult extends AutoSetupResult implements SendablePacket {

	@ObfuscatedName("alq.e(I)V")
	public void method9201() {
		ClientMessage var1 = Statics.method1604(ClientProt.AUTO_SETUP_RESULT, client.field10849.field794);
		var1.field11432.p2(this.field8904);
		var1.field11432.p1_alt1(this.field8905);
		var1.field11432.p3_alt3(this.field8900);
		var1.field11432.p3_alt3(this.field8903);
		var1.field11432.p2(this.field8899);
		var1.field11432.p1_alt3(this.field8896);
		var1.field11432.p3(this.field8902);
		var1.field11432.p3_alt1(this.field8898);
		client.field10849.method934(var1);
	}

	@ObfuscatedName("alq.z(II)V")
	public void method18312(int arg0) {
		this.field8896 = arg0;
	}

	@ObfuscatedName("alq.p(II)V")
	public void method18313(int arg0) {
		this.field8904 |= arg0;
	}

	@ObfuscatedName("alq.d(II)V")
	public void method18314(int arg0) {
		this.field8905 = arg0;
	}

	@ObfuscatedName("alq.c(IIS)V")
	public void method18318(int arg0, int arg1) {
		if (arg0 == 0 && arg1 > 32767) {
			arg1 = 32767;
		} else if (arg1 > 8388607) {
			arg1 = 8388607;
		}
		switch(arg0) {
			case 0:
				this.field8899 = arg1;
				break;
			case 1:
				this.field8898 = arg1;
			case 2:
			case 4:
			default:
				break;
			case 3:
				this.field8902 = arg1;
				break;
			case 5:
				this.field8903 = arg1;
		}
	}
}
