package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("arz")
public class class1168 extends class980 {

	// $FF: synthetic field
	public final class311 this$0;

	@ObfuscatedName("arz.k")
	public String field12258;

	@ObfuscatedName("arz.f")
	public int field12257;

	@ObfuscatedName("arz.w")
	public byte field12259;

	public class1168(class311 arg0) {
		this.this$0 = arg0;
		this.field12258 = null;
	}

	@ObfuscatedName("arz.e(Lalw;I)V")
	public void method17757(class997 arg0) {
		if (arg0.method17904() != 255) {
			arg0.field11503 -= -1445626955;
			arg0.method17914();
		}
		this.field12258 = arg0.method17917();
		this.field12257 = arg0.method17906();
		this.field12259 = arg0.method17905();
		arg0.method17914();
	}

	@ObfuscatedName("arz.n(Lakr;S)V")
	public void method17753(class979 arg0) {
		class308 var2 = new class308();
		var2.field3087 = this.field12258;
		var2.field3088 = this.field12257;
		var2.field3089 = this.field12259;
		arg0.method17734(var2);
	}
}
