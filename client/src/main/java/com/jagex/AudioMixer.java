package com.jagex;

import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("xt")
public class AudioMixer {

	@ObfuscatedName("xt.e")
	public static SoundBackend field8056 = null;

	public AudioMixer() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("sh.e(Lxf;I)V")
	public static void method8200(SoundBackendConfig arg0) {
		if (SoundBackendType.field3413 == arg0.field8052) {
			field8056 = new JavaSoundBackend(arg0);
		} else if (SoundBackendType.field3414 == arg0.field8052) {
			field8056 = new DummySoundBackend(arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("rs.n(I)V")
	public static void method7606() {
		if (field8056 != null) {
			field8056.method5868();
			field8056 = null;
		}
	}

	@ObfuscatedName("d.m(B)V")
	public static void method306() {
		if (field8056 != null) {
			field8056.method5874();
		}
	}

	@ObfuscatedName("nq.k(Lpy;ILwj;ZLeb;I)Lwr;")
	public static AudioApiRelated2 method6064(Js5 arg0, int arg1, AudioMixerRelated arg2, boolean arg3, WeightedCache arg4) {
		if (field8056 == null) {
			return null;
		} else {
			return (AudioApiRelated2) (arg3 ? new AudioStream(arg0, arg1, field8056, arg2) : new AudioStream2(arg0, arg1, field8056, arg2, arg4));
		}
	}

	@ObfuscatedName("afj.f(IIFLma;I)V")
	public static void method16432(int arg0, int arg1, float arg2, VolumeProvider arg3) {
		if (field8056 != null) {
			field8056.method5880().method5848(arg0, arg1, arg2, arg3);
		}
	}

	@ObfuscatedName("lv.w(II)Lmj;")
	public static AudioBuss method5401(int arg0) {
		return field8056 == null ? null : field8056.method5880().method5851(arg0);
	}
}
