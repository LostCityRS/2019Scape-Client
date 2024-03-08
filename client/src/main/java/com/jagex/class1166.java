package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aru")
public class class1166 extends class980 {

	// $FF: synthetic field
	public final class311 this$0;

	@ObfuscatedName("aru.k")
	public int field12253;

	public class1166(class311 arg0) {
		this.this$0 = arg0;
		this.field12253 = -1;
	}

	@ObfuscatedName("aru.e(Lalw;I)V")
	public void method17757(Packet arg0) {
		this.field12253 = arg0.g2();
		arg0.g1();
		if (arg0.g1() != 255) {
			arg0.pos -= -1445626955;
			arg0.g8();
		}
	}

	@ObfuscatedName("aru.n(Lakr;S)V")
	public void method17753(class979 arg0) {
		arg0.method17735(this.field12253);
	}
}
