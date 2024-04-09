package com.jagex.game.client;

import com.jagex.core.utils.MonotonicTime;
import com.jagex.graphics.Toolkit;
import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("t")
public class CpuProfiling {

	public CpuProfiling() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("z.n(I)I")
	public static int profile() {
		Canvas canvas = new Canvas();
		canvas.setSize(100, 100);
		Toolkit toolkit = Toolkit.create(0, canvas, null, null, null, null, null, null, 0);
		long start = MonotonicTime.get();
		for (int var4 = 0; var4 < 10000; var4++) {
			toolkit.method2552(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		}
		int timeElapsed = (int) (MonotonicTime.get() - start);
		toolkit.fillRectangle(0, 0, 100, 100, -16777216);
		toolkit.dispose();
		return timeElapsed;
	}
}
