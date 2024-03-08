package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
import jaggl.OpenGL;

import java.awt.*;

@ObfuscatedName("ra")
public class class488 {

	public class488() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ra.e(Ljava/awt/Canvas;Ldf;Les;Lnx;Lnb;Lnp;Lpy;I)Ldh;")
	public static Renderer method7664(Canvas arg0, class125 arg1, class143 arg2, class383 arg3, class381 arg4, class378 arg5, Js5 arg6, int arg7) {
		try {
			GpuRenderer.method15968();
			Statics.method5134().method7902("jaggl");
			Statics.method6020(arg0);
			OpenGL var8 = new OpenGL();
			long var9 = var8.init(arg0, 8, 8, 8, 24, 0, arg7);
			if (var9 == 0L) {
				throw new RuntimeException("");
			}
			class1127 var11 = new class1127(var8, arg0, var9, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			var11.method15969();
			return var11;
		} catch (RuntimeException var14) {
			throw var14;
		} catch (Throwable var15) {
			throw new RuntimeException("");
		}
	}
}
