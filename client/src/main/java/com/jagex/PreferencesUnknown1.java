package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("anq")
public class PreferencesUnknown1 extends PreferencesOption {

	public PreferencesUnknown1(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesUnknown1(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("anq.o(B)V")
	public void method18637() {
		if (this.field8417.displayMode2.method18546() && !Renderer.method723(this.field8417.displayMode2.method18545())) {
			this.field8416 = 0;
		}
		if (this.field8416 < 0 || this.field8416 > 2) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("anq.e(B)I")
	public int method14069() {
		return 0;
	}

	@ObfuscatedName("anq.s(I)Z")
	public boolean method18638() {
		return Renderer.method723(this.field8417.displayMode2.method18545());
	}

	@ObfuscatedName("anq.n(II)I")
	public int method14070(int arg0) {
		return Renderer.method723(this.field8417.displayMode2.method18545()) ? 1 : 3;
	}

	@ObfuscatedName("anq.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("anq.y(I)I")
	public int method18639() {
		return this.field8416;
	}
}
