package com.jagex;

import com.jagex.graphics.runetek5.Renderer;
import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("t")
public class CpuProfiling {

	public CpuProfiling() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("z.n(I)I")
	public static int method270() {
		Canvas var0 = new Canvas();
		var0.setSize(100, 100);
		Renderer var1 = Renderer.method14575(0, var0, null, null, null, null, null, null, 0);
		long var2 = MonotonicTime.method3655();
		for (int var4 = 0; var4 < 10000; var4++) {
			var1.method2552(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		}
		int var5 = (int) (MonotonicTime.method3655() - var2);
		var1.method2301(0, 0, 100, 100, -16777216);
		var1.method2578();
		return var5;
	}
}
