package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

import java.awt.*;

@ObfuscatedName("oa")
public class Direct3DRendererFactory {

	public Direct3DRendererFactory() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("oa.e(Ljava/awt/Canvas;Ldf;Les;Lnx;Lnb;Lnp;Lpy;I)Ldh;")
	public static Renderer method6218(Canvas arg0, class125 arg1, class143 arg2, class383 arg3, class381 arg4, class378 arg5, Js5 arg6, int arg7) {
		try {
			GpuRenderer.method15968();
			Statics.method5134().method7902("jagdx");
			return class1126.method19043(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
		} catch (RuntimeException var10) {
			var10.printStackTrace();
			throw var10;
		} catch (Throwable var11) {
			var11.printStackTrace();
			throw new RuntimeException("");
		}
	}
}
