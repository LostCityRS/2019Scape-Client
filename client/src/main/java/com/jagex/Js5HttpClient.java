package com.jagex;

import deob.ObfuscatedName;

import java.net.MalformedURLException;
import java.net.URL;
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
			} else if (this.field4470 + 10000L >= class213.method3655()) {
				return null;
			} else {
				Object var8 = null;
				String var9;
				if (var7) {
					var9 = "&cb=" + class213.method3655();
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
				Future var13 = this.field4469.submit(new class444(this, var10, var12));
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

	@ObfuscatedName("pu.w(ZB)V")
	public void method7053(boolean arg0) {
		this.field4468 = arg0;
	}
}
