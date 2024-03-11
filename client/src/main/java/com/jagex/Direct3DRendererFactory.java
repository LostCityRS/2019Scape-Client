package com.jagex;

import com.jagex.game.runetek5.config.BillboardTypeList;
import com.jagex.game.runetek5.config.ParticleEffectorTypeList;
import com.jagex.game.runetek5.config.ParticleEmitterTypeList;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;
import deob.Statics;

import java.awt.*;

@ObfuscatedName("oa")
public class Direct3DRendererFactory {

	public Direct3DRendererFactory() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("oa.e(Ljava/awt/Canvas;Ldf;Les;Lnx;Lnb;Lnp;Lpy;I)Ldh;")
	public static Renderer method6218(Canvas arg0, MaterialList arg1, TextureList arg2, BillboardTypeList arg3, ParticleEmitterTypeList arg4, ParticleEffectorTypeList arg5, Js5 arg6, int arg7) {
		try {
			GpuRenderer.method15968();
			Statics.method5134().method7902("jagdx");
			return Direct3DRenderer.method19043(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
		} catch (RuntimeException var10) {
			var10.printStackTrace();
			throw var10;
		} catch (Throwable var11) {
			var11.printStackTrace();
			throw new RuntimeException("");
		}
	}
}
