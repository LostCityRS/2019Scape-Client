package com.jagex;

import com.jagex.deob.ObfuscatedName;
import com.jagex.deob.Statics;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

@ObfuscatedName("pr")
public class class441 {

	// $FF: synthetic field
	public final class448 this$0;

	@ObfuscatedName("pr.e")
	public byte[] field4405;

	public class441(class448 arg0, InputStream arg1, class1229 arg2, URL arg3) {
		this.this$0 = arg0;
		this.field4405 = null;
		if (arg1 != null) {
			short var5 = 10240;
			class997 var6 = new class997(var5, true);
			int var7 = 0;
			byte[] var8 = class702.method14027(1024);
			while (var7 >= 0) {
				try {
					var7 = arg1.read(var8);
				} catch (IOException var18) {
					var18.printStackTrace();
					var7 = -1;
				}
				if (var7 > 0) {
					if (var6.field11503 + var7 >= var6.field11502.length) {
						int var10 = var6.field11502.length + 10240;
						byte[] var11 = Statics.method14028(var10, true);
						System.arraycopy(var6.field11502, 0, var11, 0, var6.field11503);
						class702.method14031(var6.field11502);
						var6.field11502 = var11;
					}
					var6.method17896(var8, 0, var7);
				}
			}
			for (int var12 = 0; var12 < arg2.field12563; var12++) {
				var6.method18001(0);
			}
			byte[] var13 = new byte[var6.field11503];
			System.arraycopy(var6.field11502, 0, var13, 0, var6.field11503);
			var6.method18142();
			Object var14 = null;
			class702.method14031(var8);
			Object var15 = null;
			this.field4405 = var13;
			try {
				arg1.close();
			} catch (IOException var17) {
				var17.printStackTrace();
			}
		}
		arg2.field12344 = false;
		arg0.method7051();
	}

	@ObfuscatedName("pr.e(I)[B")
	public byte[] method6872() {
		return this.field4405;
	}
}
