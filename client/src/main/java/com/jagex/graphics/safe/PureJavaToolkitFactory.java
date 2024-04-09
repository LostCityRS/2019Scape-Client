package com.jagex.graphics.safe;

import com.jagex.game.config.BillboardTypeList;
import com.jagex.game.config.ParticleEffectorTypeList;
import com.jagex.game.config.ParticleEmitterTypeList;
import com.jagex.graphics.MaterialList;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.TextureList;
import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("af")
public class PureJavaToolkitFactory {

	public PureJavaToolkitFactory() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("fy.e(Ljava/awt/Canvas;Ldf;Les;Lnx;Lnb;Lnp;IIB)Ldh;")
	public static Toolkit create(Canvas arg0, MaterialList arg1, TextureList arg2, BillboardTypeList arg3, ParticleEmitterTypeList arg4, ParticleEffectorTypeList arg5, int arg6, int arg7) {
		return new PureJavaToolkit(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}
}
