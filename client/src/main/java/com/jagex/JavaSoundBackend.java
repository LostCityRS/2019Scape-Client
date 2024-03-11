package com.jagex;

import deob.ObfuscatedName;

import java.util.*;

@ObfuscatedName("aiz")
public class JavaSoundBackend extends SoundBackend {

	@ObfuscatedName("aiz.n")
	public java.util.HashMap field10688 = new java.util.HashMap();

	@ObfuscatedName("aiz.m")
	public AudioRelated2 field10694 = new AudioRelated2(this);

	@ObfuscatedName("aiz.k")
	public volatile boolean field10690 = false;

	@ObfuscatedName("aiz.f")
	public Thread field10691;

	@ObfuscatedName("aiz.w")
	public Thread field10692;

	@ObfuscatedName("aiz.l")
	public List field10693 = new ArrayList();

	@ObfuscatedName("aiz.u")
	public Runnable field10687 = new JavaSoundBackend_Task1(this);

	@ObfuscatedName("aiz.z")
	public Runnable field10695 = new JavaSoundBackend_Task2(this);

	@ObfuscatedName("aiz.aw(I)Ljava/util/HashMap;")
	public java.util.HashMap method16804() {
		return this.field10688;
	}

	public JavaSoundBackend(SoundBackendConfig arg0) {
		java.util.Iterator var2 = arg0.field8053.keySet().iterator();
		while (var2.hasNext()) {
			class473 var3 = (class473) var2.next();
			this.field10688.put(var3, new class480[(Integer) arg0.field8053.get(var3)]);
		}
		java.util.Iterator var4 = this.field10688.keySet().iterator();
		while (var4.hasNext()) {
			class473 var5 = (class473) var4.next();
			class480[] var6 = (class480[]) this.field10688.get(var5);
			for (int var7 = 0; var7 < var6.length; var7++) {
				VorbisDecoder var8 = new VorbisDecoder(2.0F);
				var8.method3774(0, AudioFormat.field3441, AudioEndianness.field3439, 2);
				var6[var7] = new class480(var5, 8192, 3, var8, this);
			}
		}
		PcmPlayer var9 = new PcmPlayer(this, 44100.0F, 32768);
		PcmPlayer var10 = new PcmPlayer(this, 22050.0F, 16384);
		this.field10693.add(var9);
		this.field10693.add(var10);
		this.field10691 = new Thread(this.field10695);
		this.field10692 = new Thread(this.field10687);
		this.field10691.setPriority(10);
		this.field10692.setPriority(10);
		this.field10691.start();
		this.field10692.start();
	}

	@ObfuscatedName("aiz.e(I)V")
	public void method5874() {
		if (this.field10694 != null) {
			this.field10694.method5849();
		}
		java.util.Iterator var1 = this.field10688.keySet().iterator();
		while (true) {
			class480[] var3;
			byte var6;
			int var8;
			do {
				if (!var1.hasNext()) {
					return;
				}
				class473 var2 = (class473) var1.next();
				var3 = (class480[]) this.field10688.get(var2);
				if (!var2.field4856) {
					boolean var4 = false;
					for (int var5 = 0; var5 < var3.length; var5++) {
						var3[var5].method7601();
						var4 |= var3[var5].method7588();
					}
					if (var4) {
						Arrays.sort(var3, new JavaSoundBackendComparator(this));
					}
				}
				var6 = 6;
				boolean var7 = false;
				var8 = var3.length - 1;
				while (!var7) {
					float var9 = var3[var8].method7531();
					class474 var10 = var3[var8].method7550();
					if (var9 >= 0.0F) {
						var7 = true;
					} else if (class474.field4863 == var10 || class474.field4861 == var10 || class474.field4862 == var10) {
						var3[var8].method7489();
					}
					var8--;
					if (var8 < 0) {
						var7 = true;
					}
				}
			} while (var8 < var3.length - var6);
			while (var8 >= var3.length - var6) {
				class474 var11 = var3[var8].method7550();
				if (class474.field4863 == var11) {
					var3[var8].method7489();
				}
				var8--;
			}
		}
	}

	@ObfuscatedName("aiz.f(Ljava/lang/Object;I)I")
	public int method5864(Object arg0) {
		if (arg0 == null || !(arg0 instanceof SoundSample)) {
			return 0;
		}
		SoundSample var2 = (SoundSample) arg0;
		PcmPlayer var3 = var2.field6863;
		synchronized (var2.field6863) {
			return var2.method8628();
		}
	}

	@ObfuscatedName("aiz.as(FI)Lts;")
	public PcmPlayer method16806(float arg0) {
		float var2 = -1.0F;
		float var3 = Float.MAX_VALUE;
		PcmPlayer var4 = null;
		Iterator var5 = this.field10693.iterator();
		while (true) {
			PcmPlayer var6;
			float var7;
			float var8;
			do {
				if (!var5.hasNext()) {
					return var4;
				}
				var6 = (PcmPlayer) var5.next();
				var7 = var6.field6875;
				var8 = Math.abs(var7 - arg0);
			} while (!(var2 < 0.0F) && !(var8 < var3));
			var2 = var7;
			var3 = var8;
			var4 = var6;
		}
	}

	@ObfuscatedName("aiz.n(IILnd;Lmw;IFB)Ljava/lang/Object;")
	public Object method5861(int arg0, int arg1, AudioFormat arg2, AudioEndianness arg3, int arg4, float arg5) {
		PcmPlayer var7 = this.method16806((float) arg1 * arg5);
		SoundSample var8 = new SoundSample(this, var7, arg4, (float) arg1 * arg5, arg2.field3445, arg0 < 2 ? 2 : arg0, AudioFormat.field3441 == arg2 || AudioFormat.field3442 == arg2, AudioEndianness.field3438 == arg3);
		PcmPlayer var9 = var8.field6863;
		synchronized (var8.field6863) {
			var8.field6863.method8649(var8);
			return var8;
		}
	}

	@ObfuscatedName("aiz.m(Ljava/lang/Object;I)V")
	public void method5863(Object arg0) {
		if (arg0 == null || !(arg0 instanceof SoundSample)) {
			return;
		}
		SoundSample var2 = (SoundSample) arg0;
		PcmPlayer var3 = var2.field6863;
		synchronized (var2.field6863) {
			var2.field6863.method8650(var2);
		}
	}

	@ObfuscatedName("aiz.k(Ljava/lang/Object;[BIII)V")
	public void method5875(Object arg0, byte[] arg1, int arg2, int arg3) {
		if (arg0 == null || !(arg0 instanceof SoundSample)) {
			return;
		}
		SoundSample var5 = (SoundSample) arg0;
		PcmPlayer var6 = var5.field6863;
		synchronized (var5.field6863) {
			var5.method8626(arg1, arg2, arg3);
		}
	}

	@ObfuscatedName("aiz.w(Lqk;B)Lrq;")
	public class480 method5865(class473 arg0) {
		java.util.HashMap var2 = this.field10688;
		synchronized (this.field10688) {
			class480[] var3 = (class480[]) this.field10688.get(arg0);
			if (var3 == null) {
				return null;
			}
			for (int var4 = 0; var4 < var3.length; var4++) {
				class480 var5 = var3[var4];
				class474 var6 = var5.method7550();
				if (class474.field4859 == var6) {
					var5.method7592();
					return var5;
				}
			}
			return null;
		}
	}

	@ObfuscatedName("aiz.l(Lmj;I)Ljava/lang/Object;")
	public Object method5866(AudioBuss arg0) {
		return null;
	}

	@ObfuscatedName("aiz.u(I)Lmb;")
	public AudioRelated2 method5880() {
		return this.field10694;
	}

	@ObfuscatedName("aiz.z(B)V")
	public void method5868() {
		java.util.HashMap var1 = this.method16804();
		synchronized (var1) {
			java.util.Iterator var3 = var1.keySet().iterator();
			while (var3.hasNext()) {
				class473 var4 = (class473) var3.next();
				class480[] var5 = (class480[]) var1.get(var4);
				for (int var6 = 0; var6 < var5.length; var6++) {
					if (var5[var6].method7550() != class474.field4859) {
						var5[var6].method7489();
						var5[var6].method7484();
					}
				}
			}
		}
		boolean var8 = false;
		while (!var8) {
			var8 = true;
			synchronized (var1) {
				java.util.Iterator var10 = var1.keySet().iterator();
				while (var10.hasNext()) {
					class473 var11 = (class473) var10.next();
					class480[] var12 = (class480[]) var1.get(var11);
					for (int var13 = 0; var13 < var12.length; var13++) {
						if (var12[var13].method7550() != class474.field4859) {
							var12[var13].method7601();
							var8 = false;
						}
					}
				}
			}
			PreciseSleep.sleep(10L);
		}
		this.field10690 = true;
		try {
			this.field10691.join();
		} catch (InterruptedException var18) {
			var18.printStackTrace();
		}
		try {
			this.field10692.join();
		} catch (InterruptedException var17) {
			var17.printStackTrace();
		}
	}
}
