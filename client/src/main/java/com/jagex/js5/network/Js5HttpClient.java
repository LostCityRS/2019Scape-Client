package com.jagex.js5.network;

import com.jagex.core.util.ByteArrayPool;
import com.jagex.MonotonicTime;
import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("pu")
public class Js5HttpClient {

	@ObfuscatedName("pu.e")
	public String field4474;

	@ObfuscatedName("pu.n")
	public int field4465;

	@ObfuscatedName("pu.m")
	public final int field4473;

	@ObfuscatedName("pu.f")
	public volatile int field4467 = 0;

	@ObfuscatedName("pu.l")
	public ExecutorService field4469 = Executors.newFixedThreadPool(2);

	@ObfuscatedName("pu.u")
	public long field4470;

	@ObfuscatedName("pu.c")
	public boolean field4468 = false;

	public Js5HttpClient(String arg0, int arg1, int arg2) {
		this.field4474 = arg0;
		this.field4465 = arg1;
		this.field4473 = arg2;
	}

	@ObfuscatedName("pu.e(I)Z")
	public boolean method7048() {
		return this.field4467 >= 10;
	}

	@ObfuscatedName("pu.n(I)Latb;")
	public Js5HttpRequest method7049() {
		return this.method7068(255, 255, (byte) 0, true, 0, 0);
	}

	@ObfuscatedName("pu.m(IIBZIII)Latb;")
	public Js5HttpRequest method7068(int arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5) {
		if (arg0 < 0 || arg1 < 0) {
			throw new RuntimeException(arg0 + "," + arg1);
		} else if (this.method7048()) {
			return null;
		} else {
			boolean var7 = arg0 == 255 && arg1 == 255;
			if (!this.field4468 && !var7) {
				return null;
			} else if (this.field4470 + 10000L >= MonotonicTime.method3655()) {
				return null;
			} else {
				Object var8 = null;
				String var9;
				if (var7) {
					var9 = "&cb=" + MonotonicTime.method3655();
				} else {
					var9 = "&c=" + arg4 + "&v=" + arg5;
				}
				URL var10;
				try {
					var10 = new URL("http", this.field4474, this.field4465, "/ms?m=" + this.field4473 + "&a=" + arg0 + "&g=" + arg1 + var9);
				} catch (MalformedURLException var14) {
					return null;
				}
				Js5HttpRequest var12 = new Js5HttpRequest(arg2);
				var12.field12342 = arg3;
				this.field4467++;
				Future var13 = this.field4469.submit(new Js5HTTPClient_Task(this, var10, var12));
				var12.method19716(var13);
				return var12;
			}
		}
	}

	@ObfuscatedName("pu.k(I)V")
	public void method7051() {
		this.field4467--;
	}

	@ObfuscatedName("pu.f(I)V")
	public void method7063() {
		this.field4469.shutdown();
	}

	// line 75
	@ObfuscatedName("pu.w(ZB)V")
	public void method7053(boolean arg0) {
		this.field4468 = arg0;
	}

	@ObfuscatedName("pv")
	public static class Js5HTTPClient_Task implements Callable {

		// $FF: synthetic field
		public final Js5HttpClient this$0;

		@ObfuscatedName("pv.e")
		public URL field4429;

		@ObfuscatedName("pv.n")
		public Js5HttpRequest field4428;

		// line 82
		public Js5HTTPClient_Task(Js5HttpClient arg0, URL arg1, Js5HttpRequest arg2) {
			this.this$0 = arg0;
			this.field4429 = arg1;
			this.field4428 = arg2;
		}

		public Object call() throws Exception {
			URLConnection var1 = this.field4429.openConnection();
			var1.setConnectTimeout(10000);
			var1.setReadTimeout(60000);
			boolean var2 = true;
			try {
				var1.connect();
			} catch (IOException var4) {
				this.this$0.field4470 = MonotonicTime.method3655();
				var2 = false;
			}
			return new Js5HTTPClientResponse(this.this$0, var2 ? var1.getInputStream() : null, this.field4428, this.field4429);
		}
	}

	@ObfuscatedName("pr")
	public static class Js5HTTPClientResponse {

		// $FF: synthetic field
		public final Js5HttpClient this$0;

		@ObfuscatedName("pr.e")
		public byte[] field4405;

		// line 106
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
}
