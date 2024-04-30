package com.jagex.audio.backend;

import com.jagex.audio.api.AudioBuss;
import com.jagex.audio.api.AudioEndianness;
import com.jagex.audio.api.AudioFormat;
import com.jagex.audio.api.SoundBackend;
import com.jagex.audio.stream.BussManager;
import com.jagex.audio.stream.AudioProcessingUnit;
import com.jagex.audio.stream.SoundRelatedType1;
import com.jagex.audio.stream.SoundRelatedType2;
import com.jagex.audio.vorbis.VorbisSound;
import com.jagex.core.utils.JagException;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.core.utils.PreciseSleep;
import deob.ObfuscatedName;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

@ObfuscatedName("aiw")
public class DummySoundBackend extends SoundBackend {

	@ObfuscatedName("aiw.n")
	public HashMap field10679 = new HashMap();

	@ObfuscatedName("aiw.m")
	public BussManager field10680 = new BussManager(this);

	@ObfuscatedName("aiw.k")
	public volatile boolean field10681 = false;

	@ObfuscatedName("aiw.f")
	public Thread field10678;

	@ObfuscatedName("aiw.w")
	public Thread field10683;

	@ObfuscatedName("aiw.l")
	public long field10684 = MonotonicTime.get();

	@ObfuscatedName("aiw.u")
	public Runnable field10685 = new DummySoundBackend_Task1(this);

	@ObfuscatedName("aiw.z")
	public Runnable field10686 = new DummySoundBackend_Task2(this);

	@ObfuscatedName("ej")
	public static class DummySoundBackend_Task1 implements Runnable {

		// $FF: synthetic field
		public final DummySoundBackend this$0;

		// line 28
		public DummySoundBackend_Task1(DummySoundBackend arg0) {
			this.this$0 = arg0;
		}

		public void run() {
			label36: while (true) {
				try {
					if (!this.this$0.field10681) {
						HashMap var1 = this.this$0.method16802();
						Iterator var2 = var1.keySet().iterator();
						while (true) {
							SoundRelatedType2 var3;
							do {
								if (!var2.hasNext()) {
									PreciseSleep.sleep(50L);
									continue label36;
								}
								var3 = (SoundRelatedType2) var2.next();
							} while (var3.field4856);
							AudioProcessingUnit[] var4 = (AudioProcessingUnit[]) var1.get(var3);
							for (int var5 = 0; var5 < var4.length; var5++) {
								var4[var5].method7507();
							}
						}
					}
				} catch (Exception var7) {
					JagException.report(null, var7);
				}
				return;
			}
		}
	}

	@ObfuscatedName("ei")
	public static class DummySoundBackend_Task2 implements Runnable {

		// $FF: synthetic field
		public final DummySoundBackend this$0;

		// line 52
		public DummySoundBackend_Task2(DummySoundBackend arg0) {
			this.this$0 = arg0;
		}

		public void run() {
			label36: while (true) {
				try {
					if (!this.this$0.field10681) {
						HashMap var1 = this.this$0.method16802();
						Iterator var2 = var1.keySet().iterator();
						while (true) {
							SoundRelatedType2 var3;
							do {
								if (!var2.hasNext()) {
									PreciseSleep.sleep(25L);
									continue label36;
								}
								var3 = (SoundRelatedType2) var2.next();
							} while (var3.field4856);
							AudioProcessingUnit[] var4 = (AudioProcessingUnit[]) var1.get(var3);
							for (int var5 = 0; var5 < var4.length; var5++) {
								var4[var5].method7504();
							}
						}
					}
				} catch (Exception var7) {
					JagException.report(null, var7);
				}
				return;
			}
		}
	}

	// line 78
	@ObfuscatedName("aiw.aw(I)Ljava/util/HashMap;")
	public HashMap method16802() {
		return this.field10679;
	}

	public DummySoundBackend(SoundBackendConfig arg0) {
		Iterator var2 = arg0.field8053.keySet().iterator();
		while (var2.hasNext()) {
			SoundRelatedType2 var3 = (SoundRelatedType2) var2.next();
			this.field10679.put(var3, new AudioProcessingUnit[(Integer) arg0.field8053.get(var3)]);
		}
		Iterator var4 = this.field10679.keySet().iterator();
		while (var4.hasNext()) {
			SoundRelatedType2 var5 = (SoundRelatedType2) var4.next();
			AudioProcessingUnit[] var6 = (AudioProcessingUnit[]) this.field10679.get(var5);
			for (int var7 = 0; var7 < var6.length; var7++) {
				VorbisSound var8 = new VorbisSound(2.0F);
				var8.method3774(0, AudioFormat.field3441, AudioEndianness.LITTLE, 2);
				var6[var7] = new AudioProcessingUnit(var5, 32768, 3, var8, this);
			}
		}
		this.field10678 = new Thread(this.field10686);
		this.field10683 = new Thread(this.field10685);
		this.field10678.setPriority(1);
		this.field10683.setPriority(1);
		this.field10678.start();
		this.field10683.start();
	}

	// line 112
	@ObfuscatedName("aiw.e(I)V")
	public void method5874() {
		if (this.field10680 != null) {
			this.field10680.update();
		}
		Iterator var1 = this.field10679.keySet().iterator();
		while (true) {
			AudioProcessingUnit[] var3;
			byte var6;
			int var8;
			do {
				if (!var1.hasNext()) {
					return;
				}
				SoundRelatedType2 var2 = (SoundRelatedType2) var1.next();
				var3 = (AudioProcessingUnit[]) this.field10679.get(var2);
				if (!var2.field4856) {
					boolean var4 = false;
					for (int var5 = 0; var5 < var3.length; var5++) {
						var3[var5].method7601();
						var4 |= var3[var5].method7588();
					}
					if (var4) {
						Arrays.sort(var3, new DummySoundComparator(this));
					}
				}
				var6 = 3;
				boolean var7 = false;
				var8 = var3.length - 1;
				while (!var7) {
					float var9 = var3[var8].method7531();
					SoundRelatedType1 var10 = var3[var8].method7550();
					if (var9 >= 0.0F) {
						var7 = true;
					} else if (SoundRelatedType1.field4863 == var10 || SoundRelatedType1.field4861 == var10 || SoundRelatedType1.field4862 == var10) {
						var3[var8].method7489();
					}
					var8--;
					if (var8 < 0) {
						var7 = true;
					}
				}
			} while (var8 < var3.length - var6);
			while (var8 >= var3.length - var6) {
				SoundRelatedType1 var11 = var3[var8].method7550();
				if (SoundRelatedType1.field4863 == var11) {
					var3[var8].method7489();
				}
				var8--;
			}
		}
	}

	@ObfuscatedName("el")
	public static class DummySoundComparator implements Comparator {

		// $FF: synthetic field
		public final DummySoundBackend this$0;

		// line 124
		public DummySoundComparator(DummySoundBackend arg0) {
			this.this$0 = arg0;
		}

		@ObfuscatedName("el.e(Lrq;Lrq;I)I")
		public int method2754(AudioProcessingUnit arg0, AudioProcessingUnit arg1) {
			float var3 = arg0.method7531();
			float var4 = arg1.method7531();
			if (var4 > var3) {
				return 1;
			} else if (var4 < var3) {
				return -1;
			} else {
				return 0;
			}
		}

		public int compare(Object arg0, Object arg1) {
			return this.method2754((AudioProcessingUnit) arg0, (AudioProcessingUnit) arg1);
		}

		public boolean equals(Object arg0) {
			return super.equals(arg0);
		}
	}

	// line 172
	@ObfuscatedName("aiw.f(Ljava/lang/Object;I)I")
	public int method5864(Object arg0) {
		long var2 = MonotonicTime.get();
		int var4 = (int) (180000.0F / ((float) (var2 - this.field10684) / 1000.0F));
		this.field10684 = var2;
		return var4;
	}

	@ObfuscatedName("aiw.n(IILnd;Lmw;IFB)Ljava/lang/Object;")
	public Object playSample(int arg0, int arg1, AudioFormat format, AudioEndianness endianness, int arg4, float arg5) {
		return new Object();
	}

	@ObfuscatedName("aiw.m(Ljava/lang/Object;I)V")
	public void method5863(Object arg0) {
	}

	@ObfuscatedName("aiw.k(Ljava/lang/Object;[BIII)V")
	public void method5875(Object arg0, byte[] arg1, int arg2, int arg3) {
	}

	@ObfuscatedName("aiw.w(Lqk;B)Lrq;")
	public AudioProcessingUnit method5865(SoundRelatedType2 arg0) {
		HashMap var2 = this.field10679;
		synchronized (this.field10679) {
			AudioProcessingUnit[] var3 = (AudioProcessingUnit[]) this.field10679.get(arg0);
			if (var3 == null) {
				return null;
			}
			for (int var4 = 0; var4 < var3.length; var4++) {
				AudioProcessingUnit var5 = var3[var4];
				SoundRelatedType1 var6 = var5.method7550();
				if (SoundRelatedType1.field4859 == var6) {
					var5.method7592();
					return var5;
				}
			}
			return null;
		}
	}

	@ObfuscatedName("aiw.l(Lmj;I)Ljava/lang/Object;")
	public Object method5866(AudioBuss arg0) {
		return null;
	}

	@ObfuscatedName("aiw.u(I)Lmb;")
	public BussManager getBussManager() {
		return this.field10680;
	}

	// line 210
	@ObfuscatedName("aiw.z(B)V")
	public void method5868() {
		HashMap var1 = this.method16802();
		synchronized (var1) {
			Iterator var3 = var1.keySet().iterator();
			while (var3.hasNext()) {
				SoundRelatedType2 var4 = (SoundRelatedType2) var3.next();
				AudioProcessingUnit[] var5 = (AudioProcessingUnit[]) var1.get(var4);
				for (int var6 = 0; var6 < var5.length; var6++) {
					if (var5[var6].method7550() != SoundRelatedType1.field4859) {
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
				Iterator var10 = var1.keySet().iterator();
				while (var10.hasNext()) {
					SoundRelatedType2 var11 = (SoundRelatedType2) var10.next();
					AudioProcessingUnit[] var12 = (AudioProcessingUnit[]) var1.get(var11);
					for (int var13 = 0; var13 < var12.length; var13++) {
						if (var12[var13].method7550() != SoundRelatedType1.field4859) {
							var12[var13].method7601();
							var8 = false;
						}
					}
				}
			}
			PreciseSleep.sleep(10L);
		}
		this.field10681 = true;
		try {
			this.field10678.join();
		} catch (InterruptedException var18) {
			var18.printStackTrace();
		}
		try {
			this.field10683.join();
		} catch (InterruptedException var17) {
			var17.printStackTrace();
		}
	}
}
