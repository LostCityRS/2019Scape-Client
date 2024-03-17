package com.jagex.graphics.gl;

import com.jagex.game.client.NativeLibraries;
import com.jagex.game.config.BillboardTypeList;
import com.jagex.game.config.ParticleEffectorTypeList;
import com.jagex.game.config.ParticleEmitterTypeList;
import com.jagex.graphics.GpuRenderer;
import com.jagex.graphics.MaterialList;
import com.jagex.graphics.Renderer;
import com.jagex.graphics.TextureList;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;
import jaggl.OpenGL;

import java.awt.*;

@ObfuscatedName("ra")
public class OpenGLRendererFactory {

	public OpenGLRendererFactory() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ra.e(Ljava/awt/Canvas;Ldf;Les;Lnx;Lnb;Lnp;Lpy;I)Ldh;")
	public static Renderer create(Canvas arg0, MaterialList arg1, TextureList arg2, BillboardTypeList arg3, ParticleEmitterTypeList arg4, ParticleEffectorTypeList arg5, Js5 arg6, int arg7) {
		try {
			GpuRenderer.method15968();
			NativeLibraries.getLoader().load("jaggl");
			Renderer.method6020(arg0);
			OpenGL var8 = new OpenGL();
			long var9 = var8.init(arg0, 8, 8, 8, 24, 0, arg7);
			if (var9 == 0L) {
				throw new RuntimeException("");
			}
			OpenGLRenderer var11 = new OpenGLRenderer(var8, arg0, var9, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			var11.init();
			return var11;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			throw ex;
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw new RuntimeException("");
		}
	}
}
