package com.jagex.audio.runetek5;

import com.jagex.MonotonicTime;
import deob.ObfuscatedName;

@ObfuscatedName("mj")
public class AudioBuss {

	@ObfuscatedName("mj.e")
	public float field3436;

	@ObfuscatedName("mj.n")
	public AudioBuss field3435;

	@ObfuscatedName("mj.m")
	public VolumeProvider field3432;

	@ObfuscatedName("mj.k")
	public float field3430;

	@ObfuscatedName("mj.f")
	public float field3434;

	@ObfuscatedName("mj.w")
	public float field3431;

	@ObfuscatedName("mj.l")
	public long field3433;

	@ObfuscatedName("mj.u")
	public long field3437;

	public AudioBuss(int arg0, float arg1, Object arg2, AudioRelated2 arg3, VolumeProvider arg4, AudioBuss arg5) {
		this.field3435 = arg5;
		this.field3432 = arg4;
		this.field3436 = 1.0F;
		this.field3430 = arg1;
		this.field3431 = -1.0F;
		this.field3434 = -1.0F;
		this.field3433 = -1L;
		this.field3437 = -1L;
	}

	@ObfuscatedName("mj.e(I)F")
	public float method5906() {
		return this.field3430;
	}

	@ObfuscatedName("mj.n(I)F")
	public float method5899() {
		float var1 = 1.0F;
		for (AudioBuss var2 = this; var2 != null; var2 = var2.method5904()) {
			var1 *= var2.method5906();
		}
		return var1;
	}

	@ObfuscatedName("mj.m(I)V")
	public void method5900() {
		if (this.field3432 != null) {
			float var1 = this.field3432.method3084();
			if (this.field3436 != var1 && this.field3434 < 0.0F) {
				this.field3431 = this.field3436;
				this.field3434 = var1;
				this.field3433 = MonotonicTime.method3655();
				this.field3437 = this.field3433 + 100L;
			}
		}
		if (this.field3434 >= 0.0F) {
			long var2 = MonotonicTime.method3655();
			if (var2 > this.field3437) {
				this.field3436 = this.field3434;
				this.field3434 = -1.0F;
			} else {
				float var4 = this.field3434 - this.field3431;
				long var5 = this.field3437 - this.field3433;
				float var7 = var4 / (float) var5;
				this.field3436 = (float) (var2 - this.field3433) * var7 + this.field3431;
				if (this.field3436 == this.field3434) {
					this.field3434 = -1.0F;
				}
			}
		}
		this.field3436 = Math.min(1.0F, Math.max(this.field3436, 0.0F));
	}

	@ObfuscatedName("mj.k(B)F")
	public float method5901() {
		float var1 = this.field3436;
		for (AudioBuss var2 = this.field3435; var2 != null; var2 = var2.method5904()) {
			var1 *= var2.method5902();
		}
		return Math.min(Math.max(var1, 0.0F), 1.0F);
	}

	@ObfuscatedName("mj.f(I)F")
	public float method5902() {
		return this.field3436;
	}

	@ObfuscatedName("mj.w(FI)V")
	public void method5897(float arg0) {
		if (this.field3432 == null) {
			this.field3434 = arg0;
			this.field3431 = this.field3436;
			this.field3433 = MonotonicTime.method3655();
			this.field3437 = this.field3433 + 100L;
		}
	}

	@ObfuscatedName("mj.l(I)Lmj;")
	public AudioBuss method5904() {
		return this.field3435;
	}
}
