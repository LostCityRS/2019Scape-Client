package com.jagex;

import com.jagex.deob.ObfuscatedName;
import java.io.IOException;

@ObfuscatedName("sa")
public class class522 {

	// $FF: synthetic field
	public final class524 this$1;

	@ObfuscatedName("sa.e")
	public short[] field6709;

	public class522(class524 arg0) {
		this.this$1 = arg0;
		this.field6709 = new short[768];
	}

	@ObfuscatedName("sa.e(I)V")
	public void method8331() {
		class292.method3545(this.field6709);
	}

	@ObfuscatedName("sa.n(Ljp;I)B")
	public byte method8335(class292 arg0) throws IOException {
		int var2 = 1;
		do {
			var2 = var2 << 1 | arg0.method5086(this.field6709, var2);
		} while (var2 < 256);
		return (byte) var2;
	}

	@ObfuscatedName("sa.m(Ljp;BI)B")
	public byte method8333(class292 arg0, byte arg1) throws IOException {
		int var3 = 1;
		do {
			int var4 = arg1 >> 7 & 0x1;
			arg1 = (byte) (arg1 << 1);
			int var5 = arg0.method5086(this.field6709, (var4 + 1 << 8) + var3);
			var3 = var3 << 1 | var5;
			if (var4 != var5) {
				while (var3 < 256) {
					var3 = var3 << 1 | arg0.method5086(this.field6709, var3);
				}
				return (byte) var3;
			}
		} while (var3 < 256);
		return (byte) var3;
	}
}
