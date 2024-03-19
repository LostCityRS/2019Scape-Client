package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("lo")
public abstract class VertexDeclaration implements DeletableResource {

	@ObfuscatedName("lo.e")
	public final VertexDeclarationElement[] elements;

	public VertexDeclaration(VertexDeclarationElement[] arg0) {
		this.elements = arg0;
	}
}
