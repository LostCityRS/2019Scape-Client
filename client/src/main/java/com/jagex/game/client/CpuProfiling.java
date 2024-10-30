package com.jagex.game.client;

import com.jagex.core.utils.MonotonicTime;
import com.jagex.game.config.BillboardTypeList;
import com.jagex.game.config.ParticleEffectorTypeList;
import com.jagex.game.config.ParticleEmitterTypeList;
import com.jagex.graphics.MaterialList;
import com.jagex.graphics.TextureList;
import com.jagex.graphics.Toolkit;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;
import java.awt.Canvas;

@ObfuscatedName("t")
public class CpuProfiling {

	public CpuProfiling() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("z.n(I)I")
	public static int profile() {
		Canvas var0 = new Canvas();
		var0.setSize(100, 100);
		Toolkit var1 = Toolkit.create(0, var0, null, null, null, null, null, null, 0);
		long var2 = MonotonicTime.get();
		for (int var4 = 0; var4 < 10000; var4++) {
			var1.method2552(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		}
		int var5 = (int) (MonotonicTime.get() - var2);
		var1.fillRectangle(0, 0, 100, 100, -16777216);
		var1.dispose();
		return var5;
	}
}
