package com.jagex.js5.network;

import com.jagex.core.io.Packet;
import com.jagex.core.utils.ByteArrayPool;
import com.jagex.core.utils.MonotonicTime;
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
	public String host;

	@ObfuscatedName("pu.n")
	public int port;

	@ObfuscatedName("pu.m")
	public final int game;

	@ObfuscatedName("pu.f")
	public volatile int pendingRequests = 0;

	@ObfuscatedName("pu.l")
	public ExecutorService executor = Executors.newFixedThreadPool(2);

	@ObfuscatedName("pu.u")
	public long lastException;

	@ObfuscatedName("pu.c")
	public boolean field4468 = false;

	public Js5HttpClient(String arg0, int arg1, int arg2) {
		this.host = arg0;
		this.port = arg1;
		this.game = arg2;
	}

	@ObfuscatedName("pu.e(I)Z")
	public boolean isPendingRequestsFull() {
		return this.pendingRequests >= 10;
	}

	@ObfuscatedName("pu.n(I)Latb;")
	public Js5HttpRequest requestMasterIndex() {
		return this.sendHttpRequest(255, 255, (byte) 0, true, 0, 0);
	}

	@ObfuscatedName("pu.m(IIBZIII)Latb;")
	public Js5HttpRequest sendHttpRequest(int arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5) {
		if (arg0 < 0 || arg1 < 0) {
			throw new RuntimeException(arg0 + "," + arg1);
		} else if (this.isPendingRequestsFull()) {
			return null;
		} else {
			boolean var7 = arg0 == 255 && arg1 == 255;
			if (!this.field4468 && !var7) {
				return null;
			} else if (this.lastException + 10000L >= MonotonicTime.get()) {
				return null;
			} else {
				Object var8 = null;
				String var9;
				if (var7) {
					var9 = "&cb=" + MonotonicTime.get();
				} else {
					var9 = "&c=" + arg4 + "&v=" + arg5;
				}
				URL var10;
				try {
					var10 = new URL("http", this.host, this.port, "/ms?m=" + this.game + "&a=" + arg0 + "&g=" + arg1 + var9);
				} catch (MalformedURLException var14) {
					return null;
				}
				Js5HttpRequest var12 = new Js5HttpRequest(arg2);
				var12.urgent = arg3;
				this.pendingRequests++;
				Future var13 = this.executor.submit(new Js5HttpClient.Js5HTTPClient_Task(var10, var12));
				var12.setFutureResponse(var13);
				return var12;
			}
		}
	}

	@ObfuscatedName("pu.k(I)V")
	public void removePendingRequest() {
		this.pendingRequests--;
	}

	@ObfuscatedName("pu.f(I)V")
	public void shutdownExecutor() {
		this.executor.shutdown();
	}

	@ObfuscatedName("pu.w(ZB)V")
	public void method7053(boolean arg0) {
		this.field4468 = arg0;
	}

	@ObfuscatedName("pr")
	public class Js5HTTPClientResponse {

		@ObfuscatedName("pr.e")
		public byte[] response = null;

		public Js5HTTPClientResponse(InputStream arg1, Js5HttpRequest arg2, URL arg3) {
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
				for (int var12 = 0; var12 < arg2.padding; var12++) {
					var6.p1(0);
				}
				byte[] var13 = new byte[var6.pos];
				System.arraycopy(var6.data, 0, var13, 0, var6.pos);
				var6.release();
				Object var14 = null;
				ByteArrayPool.release(var8);
				Object var15 = null;
				this.response = var13;
				try {
					arg1.close();
				} catch (IOException var17) {
					var17.printStackTrace();
				}
			}
			arg2.incomplete = false;
			Js5HttpClient.this.removePendingRequest();
		}

		@ObfuscatedName("pr.e(I)[B")
		public byte[] getResponseBytes() {
			return this.response;
		}
	}

	@ObfuscatedName("pv")
	public class Js5HTTPClient_Task implements Callable {

		@ObfuscatedName("pv.e")
		public URL url;

		@ObfuscatedName("pv.n")
		public Js5HttpRequest request;

		public Js5HTTPClient_Task(URL arg1, Js5HttpRequest arg2) {
			this.url = arg1;
			this.request = arg2;
		}

		public Object call() throws Exception {
			URLConnection var1 = this.url.openConnection();
			var1.setConnectTimeout(10000);
			var1.setReadTimeout(60000);
			boolean var2 = true;
			try {
				var1.connect();
			} catch (IOException var4) {
				Js5HttpClient.this.lastException = MonotonicTime.get();
				var2 = false;
			}
			return Js5HttpClient.this.new Js5HTTPClientResponse(var2 ? var1.getInputStream() : null, this.request, this.url);
		}
	}
}
