package com.jagex.graphics.legacygl;

import com.jagex.game.config.BillboardTypeList;
import com.jagex.game.config.ParticleEffectorTypeList;
import com.jagex.game.config.ParticleEmitterTypeList;
import com.jagex.graphics.MaterialList;
import com.jagex.graphics.Renderer;
import com.jagex.graphics.TextureList;
import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("co")
public class LegacyOpenGLRendererFactory {

	public LegacyOpenGLRendererFactory() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("co.e(Ljava/awt/Canvas;Ldf;Les;Lnx;Lnb;Lnp;I)Ldh;")
	public static Renderer create(Canvas arg0, MaterialList arg1, TextureList arg2, BillboardTypeList arg3, ParticleEmitterTypeList arg4, ParticleEffectorTypeList arg5, int arg6) {
		return new LegacyOpenGLRenderer(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}
}
