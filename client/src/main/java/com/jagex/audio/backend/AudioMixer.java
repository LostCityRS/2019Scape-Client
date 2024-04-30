package com.jagex.audio.backend;

import com.jagex.audio.api.AudioBuss;
import com.jagex.audio.api.SoundBackend;
import com.jagex.audio.api.SoundBackendType;
import com.jagex.audio.api.VolumeProvider;
import com.jagex.audio.stream.AudioProcessingInterface;
import com.jagex.audio.stream.AudioStream;
import com.jagex.audio.stream.AudioStream2;
import com.jagex.core.datastruct.SoftLruHashTable;
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
	public static void createBackend(SoundBackendConfig arg0) {
		if (SoundBackendType.DUMMY == arg0.field8052) {
			field8056 = new JavaSoundBackend(arg0);
		} else if (SoundBackendType.JAVA == arg0.field8052) {
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
	public static AudioProcessingInterface method6064(Js5 arg0, int arg1, AudioMixerRelated arg2, boolean arg3, SoftLruHashTable arg4) {
		if (field8056 == null) {
			return null;
		} else {
			return (AudioProcessingInterface) (arg3 ? new AudioStream(arg0, arg1, field8056, arg2) : new AudioStream2(arg0, arg1, field8056, arg2, arg4));
		}
	}

	@ObfuscatedName("afj.f(IIFLma;I)V")
	public static void addBuss(int arg0, int arg1, float arg2, VolumeProvider arg3) {
		if (field8056 != null) {
			field8056.getBussManager().addBuss(arg0, arg1, arg2, arg3);
		}
	}

	@ObfuscatedName("lv.w(II)Lmj;")
	public static AudioBuss method5401(int arg0) {
		return field8056 == null ? null : field8056.getBussManager().getBuss(arg0);
	}

	@ObfuscatedName("xq.l(III)Z")
	public static boolean commonParentExists(int arg0, int arg1) {
		if (field8056 == null || field8056.getBussManager() == null) {
			return false;
		} else if (arg0 == arg1) {
			return true;
		} else {
			AudioBuss var2 = field8056.getBussManager().getBuss(arg0);
			AudioBuss var3 = field8056.getBussManager().getBuss(arg1);
			AudioBuss var4 = var2;
			do {
				if (var4 == null) {
					AudioBuss var5 = var3;
					do {
						if (var5 == null) {
							return false;
						}
						var5 = var5.getParent();
						if (var2 == var5) {
							return true;
						}
					} while (var3 != var5);
					return false;
				}
				var4 = var4.getParent();
				if (var3 == var4) {
					return true;
				}
			} while (var2 != var4);
			return false;
		}
	}
}
