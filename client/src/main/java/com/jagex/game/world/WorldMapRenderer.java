package com.jagex.game.world;

import com.jagex.core.utils.ColourUtils;
import com.jagex.game.config.iftype.Component;
import com.jagex.graphics.Renderer;
import deob.ObfuscatedName;

@ObfuscatedName("v")
public class WorldMapRenderer {

	public WorldMapRenderer() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("qi.e(Ldh;IILhf;I)V")
	public static void method7274(Renderer arg0, int arg1, int arg2, Component arg3) {
		byte var4 = 127;
		byte var5 = 7;
		for (int var6 = 63; var6 >= 0; var6--) {
			int var7 = (var6 & 0x3F) << 10 | (var5 & 0x7) << 7 | var4 & 0x7F;
			ColourUtils.method10156(false, true);
			int var8 = ColourUtils.field8149[var7];
			ColourUtils.method14805(false, true);
			arg0.method2354(arg1, (arg3.field2197 * (63 - var6) >> 6) + arg2, arg3.field2196, (arg3.field2197 >> 6) + 1, var8 | 0xFF000000, 0);
		}
	}

	@ObfuscatedName("s.n(Ldh;IILhf;II)V")
	public static void method480(Renderer arg0, int arg1, int arg2, Component arg3, int arg4) {
		for (int var5 = 7; var5 >= 0; var5--) {
			for (int var6 = 127; var6 >= 0; var6--) {
				int var7 = (arg4 & 0x3F) << 10 | (var5 & 0x7) << 7 | var6 & 0x7F;
				ColourUtils.method10156(false, true);
				int var8 = ColourUtils.field8149[var7];
				ColourUtils.method14805(false, true);
				arg0.method2354((arg3.field2196 * var6 >> 7) + arg1, (arg3.field2197 * (7 - var5) >> 3) + arg2, (arg3.field2196 >> 7) + 1, (arg3.field2197 >> 3) + 1, var8 | 0xFF000000, 0);
			}
		}
	}
}
