package com.jagex.graphics.gl;

import com.jagex.game.config.BillboardTypeList;
import com.jagex.game.config.ParticleEffectorTypeList;
import com.jagex.game.config.ParticleEmitterTypeList;
import com.jagex.graphics.MaterialList;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.TextureList;
import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("co")
public class GlToolkitFactory {

	public GlToolkitFactory() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("co.e(Ljava/awt/Canvas;Ldf;Les;Lnx;Lnb;Lnp;I)Ldh;")
	public static Toolkit create(Canvas arg0, MaterialList arg1, TextureList arg2, BillboardTypeList arg3, ParticleEmitterTypeList arg4, ParticleEffectorTypeList arg5, int arg6) {
		return new GlToolkit(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}
}
