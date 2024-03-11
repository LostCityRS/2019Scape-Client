package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("lk")
public class VertexDeclarationElement {

	@ObfuscatedName("lk.e")
	public int field3340;

	@ObfuscatedName("lk.n")
	public long field3341;

	public VertexDeclarationElement(VertexDeclarationElementComponent arg0) {
		this.field3341 = arg0.field3316;
		this.field3340 = 1;
	}

	public VertexDeclarationElement(VertexDeclarationElementComponent[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			this.method5779(arg0[var2]);
		}
	}

	@ObfuscatedName("lk.e()I")
	public final int method5776() {
		return this.field3340;
	}

	@ObfuscatedName("lk.n(I)Llj;")
	public final VertexDeclarationElementComponent method5777(int arg0) {
		return VertexDeclarationElementComponent.method5692(this.method5775(arg0));
	}

	@ObfuscatedName("lk.m(I)I")
	public final int method5775(int arg0) {
		return (int) (this.field3341 >> VertexDeclarationElementComponent.field3302 * arg0) & 0xF;
	}

	@ObfuscatedName("lk.k(Llj;)V")
	public final void method5779(VertexDeclarationElementComponent arg0) {
		this.field3341 |= arg0.field3316 << VertexDeclarationElementComponent.field3302 * this.field3340++;
	}
}
