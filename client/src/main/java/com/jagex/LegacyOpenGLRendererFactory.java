package com.jagex;

import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("co")
public class LegacyOpenGLRendererFactory {

	public LegacyOpenGLRendererFactory() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("co.e(Ljava/awt/Canvas;Ldf;Les;Lnx;Lnb;Lnp;I)Ldh;")
	public static Renderer method1417(Canvas arg0, MaterialList arg1, TextureList arg2, BillboardTypeList arg3, ParticleEmitterTypeList arg4, ParticleEffectorTypeList arg5, int arg6) {
		return new LegacyOpenGLRenderer(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}
}
