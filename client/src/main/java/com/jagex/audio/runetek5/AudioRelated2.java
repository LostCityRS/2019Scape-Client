package com.jagex.audio.runetek5;

import com.jagex.SoundBackend;
import deob.ObfuscatedName;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("mb")
public class AudioRelated2 {

	@ObfuscatedName("mb.e")
	public Map field3417 = new HashMap();

	@ObfuscatedName("mb.n")
	public SoundBackend field3418;

	public AudioRelated2(SoundBackend arg0) {
		this.field3418 = arg0;
	}

	@ObfuscatedName("mb.e(I)V")
	public void method5849() {
		Iterator var1 = this.field3417.values().iterator();
		while (var1.hasNext()) {
			AudioBuss var2 = (AudioBuss) var1.next();
			var2.method5900();
		}
	}

	@ObfuscatedName("mb.n(IIFLma;I)Lmj;")
	public AudioBuss method5848(int arg0, int arg1, float arg2, VolumeProvider arg3) {
		if (this.method5851(arg0) != null) {
			return null;
		}
		AudioBuss var5 = null;
		if (arg1 != -1) {
			var5 = this.method5851(arg1);
		}
		Object var6 = this.field3418.method5866(var5);
		AudioBuss var7 = new AudioBuss(arg0, arg2, var6, this, arg3, var5);
		this.field3417.put(arg0, var7);
		return var7;
	}

	@ObfuscatedName("mb.m(IB)Lmj;")
	public AudioBuss method5851(int arg0) {
		return (AudioBuss) this.field3417.get(arg0);
	}
}
