package com.jagex.graphics.runetek5.gl;

import com.jagex.MaterialList;
import com.jagex.graphics.runetek5.Renderer;
import com.jagex.TextureList;
import com.jagex.game.runetek5.config.BillboardTypeList;
import com.jagex.game.runetek5.config.ParticleEffectorTypeList;
import com.jagex.game.runetek5.config.ParticleEmitterTypeList;
import com.jagex.graphics.runetek5.GpuRenderer;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;
import deob.Statics;
import jaggl.OpenGL;

import java.awt.*;

@ObfuscatedName("ra")
public class OpenGLRendererFactory {

	public OpenGLRendererFactory() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ra.e(Ljava/awt/Canvas;Ldf;Les;Lnx;Lnb;Lnp;Lpy;I)Ldh;")
	public static Renderer method7664(Canvas arg0, MaterialList arg1, TextureList arg2, BillboardTypeList arg3, ParticleEmitterTypeList arg4, ParticleEffectorTypeList arg5, Js5 arg6, int arg7) {
		try {
			GpuRenderer.method15968();
			Statics.method5134().method7902("jaggl");
			Statics.method6020(arg0);
			OpenGL var8 = new OpenGL();
			long var9 = var8.init(arg0, 8, 8, 8, 24, 0, arg7);
			if (var9 == 0L) {
				throw new RuntimeException("");
			}
			OpenGLRenderer var11 = new OpenGLRenderer(var8, arg0, var9, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			var11.method15969();
			return var11;
		} catch (RuntimeException var14) {
			throw var14;
		} catch (Throwable var15) {
			throw new RuntimeException("");
		}
	}
}
