package com.jagex.audio.api;

import com.jagex.audio.stream.BussManager;
import com.jagex.core.utils.MonotonicTime;
import deob.ObfuscatedName;

@ObfuscatedName("mj")
public class AudioBuss {

	@ObfuscatedName("mj.e")
	public float volume;

	@ObfuscatedName("mj.n")
	public AudioBuss parent;

	@ObfuscatedName("mj.m")
	public VolumeProvider volumeProvider;

	@ObfuscatedName("mj.k")
	public float priority;

	@ObfuscatedName("mj.f")
	public float volumeEaseVolume2;

	@ObfuscatedName("mj.w")
	public float volumeEaseVolume1;

	@ObfuscatedName("mj.l")
	public long volumeEaseTime1;

	@ObfuscatedName("mj.u")
	public long volumeEaseTime2;

	public AudioBuss(int arg0, float priority, Object arg2, BussManager arg3, VolumeProvider volumeProvider, AudioBuss parent) {
		this.parent = parent;
		this.volumeProvider = volumeProvider;
		this.volume = 1.0F;
		this.priority = priority;
		this.volumeEaseVolume1 = -1.0F;
		this.volumeEaseVolume2 = -1.0F;
		this.volumeEaseTime1 = -1L;
		this.volumeEaseTime2 = -1L;
	}

	@ObfuscatedName("mj.e(I)F")
	public float getSelfPriority() {
		return this.priority;
	}

	@ObfuscatedName("mj.n(I)F")
	public float getPriority() {
		float var1 = 1.0F;
		for (AudioBuss var2 = this; var2 != null; var2 = var2.getParent()) {
			var1 *= var2.getSelfPriority();
		}
		return var1;
	}

	@ObfuscatedName("mj.m(I)V")
	public void update() {
		if (this.volumeProvider != null) {
			float var1 = this.volumeProvider.getVolume();
			if (this.volume != var1 && this.volumeEaseVolume2 < 0.0F) {
				this.volumeEaseVolume1 = this.volume;
				this.volumeEaseVolume2 = var1;
				this.volumeEaseTime1 = MonotonicTime.get();
				this.volumeEaseTime2 = this.volumeEaseTime1 + 100L;
			}
		}
		if (this.volumeEaseVolume2 >= 0.0F) {
			long var2 = MonotonicTime.get();
			if (var2 > this.volumeEaseTime2) {
				this.volume = this.volumeEaseVolume2;
				this.volumeEaseVolume2 = -1.0F;
			} else {
				float var4 = this.volumeEaseVolume2 - this.volumeEaseVolume1;
				long var5 = this.volumeEaseTime2 - this.volumeEaseTime1;
				float var7 = var4 / (float) var5;
				this.volume = (float) (var2 - this.volumeEaseTime1) * var7 + this.volumeEaseVolume1;
				if (this.volume == this.volumeEaseVolume2) {
					this.volumeEaseVolume2 = -1.0F;
				}
			}
		}
		this.volume = Math.min(1.0F, Math.max(this.volume, 0.0F));
	}

	@ObfuscatedName("mj.k(B)F")
	public float getVolume() {
		float var1 = this.volume;
		for (AudioBuss var2 = this.parent; var2 != null; var2 = var2.getParent()) {
			var1 *= var2.getSelfVolume();
		}
		return Math.min(Math.max(var1, 0.0F), 1.0F);
	}

	@ObfuscatedName("mj.f(I)F")
	public float getSelfVolume() {
		return this.volume;
	}

	@ObfuscatedName("mj.w(FI)V")
	public void method5897(float arg0) {
		if (this.volumeProvider == null) {
			this.volumeEaseVolume2 = arg0;
			this.volumeEaseVolume1 = this.volume;
			this.volumeEaseTime1 = MonotonicTime.get();
			this.volumeEaseTime2 = this.volumeEaseTime1 + 100L;
		}
	}

	@ObfuscatedName("mj.l(I)Lmj;")
	public AudioBuss getParent() {
		return this.parent;
	}
}
