package com.jagex.twitchtv;

import deob.ObfuscatedName;

public class TwitchWebcamFrameData {

	public int width = 0;

	public int height = 0;

	public int[] buffer = null;

	public void SetData(int arg0, int arg1, int[] arg2) {
		this.width = arg0;
		this.height = arg1;
		this.buffer = arg2;
	}

	@ObfuscatedName("com/jagex/twitchtv/TwitchWebcamFrameData.e()V")
	public void method22() {
		for (int var1 = this.height - 1; var1 >= 0; var1--) {
			int var2 = this.width * var1;
			int var3 = (var1 + 1) * this.width;
			while (var2 < var3) {
				var3--;
				int var4 = this.buffer[var2];
				this.buffer[var2] = this.buffer[var3];
				this.buffer[var3] = var4;
				var2++;
			}
		}
	}

	@ObfuscatedName("com/jagex/twitchtv/TwitchWebcamFrameData.n()V")
	public void method23() {
		for (int var1 = (this.height >> 1) - 1; var1 >= 0; var1--) {
			int var2 = this.width * var1;
			int var3 = (this.height - var1 - 1) * this.width;
			for (int var4 = -this.width; var4 < 0; var4++) {
				int var5 = this.buffer[var2];
				this.buffer[var2] = this.buffer[var3];
				this.buffer[var3] = var5;
				var2++;
				var3++;
			}
		}
	}
}
