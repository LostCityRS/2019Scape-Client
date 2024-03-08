package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("arv")
public class class1169 extends class980 {

	// $FF: synthetic field
	public final class311 this$0;

	@ObfuscatedName("arv.k")
	public int field12263;

	@ObfuscatedName("arv.f")
	public byte field12261;

	@ObfuscatedName("arv.w")
	public int field12262;

	@ObfuscatedName("arv.l")
	public String field12260;

	public class1169(class311 arg0) {
		this.this$0 = arg0;
		this.field12263 = -1;
	}

	@ObfuscatedName("arv.e(Lalw;I)V")
	public void method17757(class997 arg0) {
		arg0.method17904();
		this.field12263 = arg0.method17906();
		this.field12261 = arg0.method17905();
		this.field12262 = arg0.method17906();
		arg0.method17914();
		this.field12260 = arg0.method17918();
		arg0.method17904();
	}

	@ObfuscatedName("arv.n(Lakr;S)V")
	public void method17753(class979 arg0) {
		class308 var2 = arg0.field11392[this.field12263];
		var2.field3089 = this.field12261;
		var2.field3088 = this.field12262;
		var2.field3087 = this.field12260;
	}
}
