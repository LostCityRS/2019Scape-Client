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
	public void method17757(class997 arg0) {
		this.field12253 = arg0.method17906();
		arg0.method17904();
		if (arg0.method17904() != 255) {
			arg0.field11503 -= -1445626955;
			arg0.method17914();
		}
	}

	@ObfuscatedName("aru.n(Lakr;S)V")
	public void method17753(class979 arg0) {
		arg0.method17735(this.field12253);
	}
}
