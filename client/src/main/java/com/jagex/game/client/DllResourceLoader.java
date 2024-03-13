package com.jagex.game.client;

import com.jagex.graphics.GraphicsPacketQueue;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("pa")
public class DllResourceLoader implements ResourceLoader {

	@ObfuscatedName("pa.e")
	public final String field4336;

	@ObfuscatedName("pa.n")
	public final boolean field4335;

	@ObfuscatedName("pa.m")
	public boolean field4337;

	public DllResourceLoader(String arg0, boolean arg1) {
		this.field4336 = arg0;
		this.field4335 = arg1;
	}

	public DllResourceLoader(String arg0) {
		this(arg0, false);
	}

	@ObfuscatedName("pa.e(I)I")
	public int method6782() {
		if (this.field4337) {
			return 100;
		}
		try {
			return Client.field10577.method8464(this.field4336, this.field4335);
		} catch (HardwarePlatformLoaderException var2) {
			GraphicsPacketQueue.method18474(NativeLibraryFailureType.field8907, var2.field11896, var2.field11897, var2.getCause());
			this.field4337 = true;
			return 100;
		}
	}

	@ObfuscatedName("pa.u(B)Z")
	public boolean method6812() {
		return this.field4337;
	}

	@ObfuscatedName("pa.z(B)V")
	public void method6813() {
		this.field4337 = true;
	}

	@ObfuscatedName("pa.n(B)Lacv;")
	public LoadableResourceType method6781() {
		return LoadableResourceType.field8915;
	}
}
