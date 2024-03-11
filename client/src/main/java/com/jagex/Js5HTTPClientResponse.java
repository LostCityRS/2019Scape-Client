package com.jagex;

import deob.ObfuscatedName;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

@ObfuscatedName("pr")
public class Js5HTTPClientResponse {

	// $FF: synthetic field
	public final Js5HttpClient this$0;

	@ObfuscatedName("pr.e")
	public byte[] field4405;

	public Js5HTTPClientResponse(Js5HttpClient arg0, InputStream arg1, Js5HttpRequest arg2, URL arg3) {
		this.this$0 = arg0;
		this.field4405 = null;
		if (arg1 != null) {
			short var5 = 10240;
			Packet var6 = new Packet(var5, true);
			int var7 = 0;
			byte[] var8 = ByteArrayPool.alloc(1024);
			while (var7 >= 0) {
				try {
					var7 = arg1.read(var8);
				} catch (IOException var18) {
					var18.printStackTrace();
					var7 = -1;
				}
				if (var7 > 0) {
					if (var6.pos + var7 >= var6.data.length) {
						int var10 = var6.data.length + 10240;
						byte[] var11 = ByteArrayPool.alloc(var10, true);
						System.arraycopy(var6.data, 0, var11, 0, var6.pos);
						ByteArrayPool.release(var6.data);
						var6.data = var11;
					}
					var6.pdata(var8, 0, var7);
				}
			}
			for (int var12 = 0; var12 < arg2.field12563; var12++) {
				var6.p1(0);
			}
			byte[] var13 = new byte[var6.pos];
			System.arraycopy(var6.data, 0, var13, 0, var6.pos);
			var6.release();
			Object var14 = null;
			ByteArrayPool.release(var8);
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
