package com.jagex.audio.stream;

import com.jagex.audio.api.SoundBackend;
import com.jagex.audio.backend.AudioMixerRelated;
import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("wp")
public class AudioStream implements AudioProcessingInterface {

	@ObfuscatedName("wp.e")
	public SoundBackend field7628;

	@ObfuscatedName("wp.n")
	public AudioStreamRelated field7629 = AudioStreamRelated.field7627;

	@ObfuscatedName("wp.m")
	public int field7631;

	@ObfuscatedName("wp.k")
	public Js5 field7630;

	@ObfuscatedName("wp.f")
	public AudioMixerRelated field7632;

	public AudioStream(Js5 arg0, int arg1, SoundBackend arg2, AudioMixerRelated arg3) {
		this.field7630 = arg0;
		this.field7631 = arg1;
		this.field7628 = arg2;
		this.field7632 = arg3;
		this.field7629 = AudioStreamRelated.field7625;
	}

	@ObfuscatedName("wp.e(B)V")
	public void method9672() {
		if (AudioStreamRelated.field7625 != this.field7629) {
			return;
		}
		this.method9737();
		this.field7629 = AudioStreamRelated.field7626;
		if (this.field7632 != null) {
			this.field7632.method3130(this, 0, this.field7631, true);
		}
	}

	@ObfuscatedName("wp.n(B)Lrw;")
	public Sound method9710() {
		Sound var1 = new Sound(this.field7628);
		var1.method7376(this);
		return var1;
	}

	@ObfuscatedName("wp.m(I)Lwl;")
	public AudioStreamRelated method9674() {
		return this.field7629;
	}

	@ObfuscatedName("wp.k(I)Z")
	public boolean method9675() {
		return true;
	}

	@ObfuscatedName("wp.f(I)V")
	public void method9737() {
	}

	@ObfuscatedName("wp.l(I)I")
	public int method9678() {
		return 0;
	}

	@ObfuscatedName("wp.u(I)Lqk;")
	public SoundRelatedType2 method9679() {
		return SoundRelatedType2.field4851;
	}

	@ObfuscatedName("wp.z(B)I")
	public int method9680() {
		return this.field7631;
	}

	@ObfuscatedName("wp.w(II)[B")
	public byte[] method9673(int arg0) {
		int var2 = arg0;
		if (arg0 == 0) {
			var2 = this.field7631;
		}
		return this.field7630.fetchFile(var2);
	}

	@ObfuscatedName("wp.p(Lalw;B)V")
	public void method9681(Packet arg0) {
	}

	@ObfuscatedName("wp.d(II)Lalw;")
	public Packet method9686(int arg0) {
		return null;
	}

	@ObfuscatedName("wp.c(II)Z")
	public boolean method9683(int arg0) {
		return false;
	}

	@ObfuscatedName("wp.r(I)Z")
	public boolean method9702() {
		return false;
	}

	@ObfuscatedName("wp.v(B)I")
	public int method9685() {
		return 0;
	}

	@ObfuscatedName("wp.o(ZB)V")
	public void method9671(boolean arg0) {
	}

	@ObfuscatedName("wp.s(S)Z")
	public boolean method9687() {
		return false;
	}
}
