package com.jagex;

import deob.ObfuscatedName;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

@ObfuscatedName("pv")
public class Js5HTTPClient_Task implements Callable {

	// $FF: synthetic field
	public final Js5HttpClient this$0;

	@ObfuscatedName("pv.e")
	public URL field4429;

	@ObfuscatedName("pv.n")
	public Js5HttpRequest field4428;

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
