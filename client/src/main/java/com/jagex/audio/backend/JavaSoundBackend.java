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
import com.jagex.core.utils.PreciseSleep;
import deob.ObfuscatedName;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import java.util.*;

@ObfuscatedName("aiz")
public class JavaSoundBackend extends SoundBackend {

	@ObfuscatedName("aiz.n")
	public java.util.HashMap field10688 = new java.util.HashMap();

	@ObfuscatedName("aiz.m")
	public BussManager field10694 = new BussManager(this);

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

	@ObfuscatedName("tp")
	public static class JavaSoundBackend_Task1 implements Runnable {

		// $FF: synthetic field
		public final JavaSoundBackend this$0;

		// line 35
		public JavaSoundBackend_Task1(JavaSoundBackend arg0) {
			this.this$0 = arg0;
		}

		public void run() {
			label54: while (true) {
				try {
					if (!this.this$0.field10690) {
						Iterator var1 = this.this$0.field10693.iterator();
						while (var1.hasNext()) {
							PcmPlayer var2 = (PcmPlayer) var1.next();
							var2.method8646();
						}
						HashMap var3 = this.this$0.method16804();
						Iterator var4 = var3.keySet().iterator();
						while (true) {
							SoundRelatedType2 var5;
							do {
								if (!var4.hasNext()) {
									Iterator var8 = this.this$0.field10693.iterator();
									while (var8.hasNext()) {
										PcmPlayer var9 = (PcmPlayer) var8.next();
										var9.method8647();
									}
									PreciseSleep.sleep(6L);
									continue label54;
								}
								var5 = (SoundRelatedType2) var4.next();
							} while (var5.field4856);
							AudioProcessingUnit[] var6 = (AudioProcessingUnit[]) var3.get(var5);
							for (int var7 = 0; var7 < var6.length; var7++) {
								var6[var7].method7507();
							}
						}
					}
				} catch (Exception var11) {
					JagException.report(null, var11);
					var11.printStackTrace();
				}
				return;
			}
		}
	}

	@ObfuscatedName("tv")
	public static class JavaSoundBackend_Task2 implements Runnable {

		// $FF: synthetic field
		public final JavaSoundBackend this$0;

		// line 72
		public JavaSoundBackend_Task2(JavaSoundBackend arg0) {
			this.this$0 = arg0;
		}

		public void run() {
			label36: while (true) {
				try {
					if (!this.this$0.field10690) {
						HashMap var1 = this.this$0.method16804();
						Iterator var2 = var1.keySet().iterator();
						while (true) {
							SoundRelatedType2 var3;
							do {
								if (!var2.hasNext()) {
									PreciseSleep.sleep(10L);
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
					var7.printStackTrace();
				}
				return;
			}
		}
	}

	// line 99
	@ObfuscatedName("aiz.aw(I)Ljava/util/HashMap;")
	public java.util.HashMap method16804() {
		return this.field10688;
	}

	public JavaSoundBackend(SoundBackendConfig arg0) {
		java.util.Iterator var2 = arg0.field8053.keySet().iterator();
		while (var2.hasNext()) {
			SoundRelatedType2 var3 = (SoundRelatedType2) var2.next();
			this.field10688.put(var3, new AudioProcessingUnit[(Integer) arg0.field8053.get(var3)]);
		}
		java.util.Iterator var4 = this.field10688.keySet().iterator();
		while (var4.hasNext()) {
			SoundRelatedType2 var5 = (SoundRelatedType2) var4.next();
			AudioProcessingUnit[] var6 = (AudioProcessingUnit[]) this.field10688.get(var5);
			for (int var7 = 0; var7 < var6.length; var7++) {
				VorbisSound var8 = new VorbisSound(2.0F);
				var8.method3774(0, AudioFormat.field3441, AudioEndianness.LITTLE, 2);
				var6[var7] = new AudioProcessingUnit(var5, 8192, 3, var8, this);
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

	// line 138
	@ObfuscatedName("aiz.e(I)V")
	public void method5874() {
		if (this.field10694 != null) {
			this.field10694.update();
		}
		java.util.Iterator var1 = this.field10688.keySet().iterator();
		while (true) {
			AudioProcessingUnit[] var3;
			byte var6;
			int var8;
			do {
				if (!var1.hasNext()) {
					return;
				}
				SoundRelatedType2 var2 = (SoundRelatedType2) var1.next();
				var3 = (AudioProcessingUnit[]) this.field10688.get(var2);
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

	@ObfuscatedName("tt")
	public static class JavaSoundBackendComparator implements Comparator {

		// $FF: synthetic field
		public final JavaSoundBackend this$0;

		// line 150
		public JavaSoundBackendComparator(JavaSoundBackend arg0) {
			this.this$0 = arg0;
		}

		@ObfuscatedName("tt.e(Lrq;Lrq;I)I")
		public int method8639(AudioProcessingUnit arg0, AudioProcessingUnit arg1) {
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
			return this.method8639((AudioProcessingUnit) arg0, (AudioProcessingUnit) arg1);
		}

		public boolean equals(Object arg0) {
			return super.equals(arg0);
		}
	}

	// line 198
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
	public Object playSample(int arg0, int arg1, AudioFormat format, AudioEndianness endianness, int arg4, float arg5) {
		PcmPlayer var7 = this.method16806((float) arg1 * arg5);
		SoundSample var8 = new SoundSample(this, var7, arg4, (float) arg1 * arg5, format.field3445, arg0 < 2 ? 2 : arg0, AudioFormat.field3441 == format || AudioFormat.field3442 == format, AudioEndianness.BIG == endianness);
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
	public AudioProcessingUnit method5865(SoundRelatedType2 arg0) {
		java.util.HashMap var2 = this.field10688;
		synchronized (this.field10688) {
			AudioProcessingUnit[] var3 = (AudioProcessingUnit[]) this.field10688.get(arg0);
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

	@ObfuscatedName("aiz.l(Lmj;I)Ljava/lang/Object;")
	public Object method5866(AudioBuss arg0) {
		return null;
	}

	@ObfuscatedName("aiz.u(I)Lmb;")
	public BussManager getBussManager() {
		return this.field10694;
	}

	// line 278
	@ObfuscatedName("aiz.z(B)V")
	public void method5868() {
		java.util.HashMap var1 = this.method16804();
		synchronized (var1) {
			java.util.Iterator var3 = var1.keySet().iterator();
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
				java.util.Iterator var10 = var1.keySet().iterator();
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

	@ObfuscatedName("ts")
	public static class PcmPlayer {

		// $FF: synthetic field
		public final JavaSoundBackend this$0;

		@ObfuscatedName("ts.e")
		public boolean field6869;

		@ObfuscatedName("ts.n")
		public SourceDataLine field6871;

		@ObfuscatedName("ts.m")
		public byte[] field6876;

		@ObfuscatedName("ts.k")
		public byte[] field6870;

		@ObfuscatedName("ts.f")
		public int field6872;

		@ObfuscatedName("ts.w")
		public int field6868;

		@ObfuscatedName("ts.l")
		public int field6874;

		@ObfuscatedName("ts.u")
		public float field6875;

		@ObfuscatedName("ts.z")
		public int field6873;

		@ObfuscatedName("ts.p")
		public int field6877;

		@ObfuscatedName("ts.d")
		public List field6878;

		// line 340
		public PcmPlayer(JavaSoundBackend arg0, float arg1, int arg2) {
			this.this$0 = arg0;
			this.field6873 = 16;
			this.field6877 = 2;
			this.field6878 = new ArrayList();
			if (!this.field6869) {
				this.field6875 = arg1;
				if (this.field6873 > 16) {
					throw new RuntimeException("");
				}
				try {
					javax.sound.sampled.AudioFormat var4 = new javax.sound.sampled.AudioFormat(this.field6875, this.field6873, this.field6877, true, false);
					try {
						DataLine.Info var5 = new DataLine.Info(SourceDataLine.class, var4, arg2);
						this.field6871 = (SourceDataLine) AudioSystem.getLine(var5);
					} catch (IllegalArgumentException var8) {
						return;
					}
					this.field6871.open(var4, arg2);
					this.field6871.start();
				} catch (LineUnavailableException var9) {
					return;
				}
				this.field6876 = new byte[arg2];
				this.field6870 = new byte[this.field6873 / 8];
				this.field6874 = 0;
				this.field6869 = true;
			}
		}

		@ObfuscatedName("ts.e(I)V")
		public void method8646() {
			if (this.field6869 && this.field6871 != null) {
				this.field6872 = this.field6871.available();
			}
		}

		@ObfuscatedName("ts.n(I)V")
		public void method8647() {
			this.field6868 = 0;
			this.method8648();
			while (this.field6868 > 0) {
				int var1 = this.field6868;
				if (this.field6874 + var1 >= this.field6876.length) {
					var1 = this.field6876.length - this.field6874;
				}
				this.field6871.write(this.field6876, this.field6874, var1);
				for (int var2 = 0; var2 < var1; var2++) {
					this.field6876[this.field6874 + var2] = 0;
				}
				this.field6874 += var1;
				this.field6874 %= this.field6876.length;
				this.field6868 -= var1;
			}
		}

		@ObfuscatedName("ts.m(I)V")
		public void method8648() {
			synchronized (this) {
				int var2 = Integer.MAX_VALUE;
				double var3 = (double) (this.field6873 / 8 * this.field6877);
				boolean var5 = false;
				Iterator var6 = this.field6878.iterator();
				while (var6.hasNext()) {
					SoundSample var7 = (SoundSample) var6.next();
					int var8 = var7.field6857.length - var7.field6860;
					if (this.field6875 != var7.field6862) {
						int var9 = (int) (this.field6875 / var7.field6862 * (float) var8);
						var8 = (int) (var3 * Math.ceil((double) var9 / var3));
					}
					var7.field6861 = var8;
					if (var8 > 0 && var8 < var2) {
						var5 = true;
						var2 = var8;
					}
				}
				if (var2 > this.field6872) {
					var2 = this.field6872;
				}
				if (var2 != 0 && var5) {
					int var10 = this.field6873 / 8;
					Iterator var11 = this.field6878.iterator();
					while (true) {
						SoundSample var12;
						do {
							if (!var11.hasNext()) {
								this.field6868 = var2;
								return;
							}
							var12 = (SoundSample) var11.next();
						} while (var12.field6861 < var2);
						int var13 = this.field6874;
						int var14 = 0;
						int var15 = var12.field6859 / 8;
						double var16 = 0.0D;
						int var18 = 0;
						double var19 = (double) this.field6875;
						double var21 = (double) var12.field6862;
						int var23 = var12.field6865;
						while (var12.field6861 > 0 && var14 < var2) {
							short var24 = 0;
							short var25 = 0;
							byte[] var26 = this.field6870;
							for (int var27 = 0; var27 < var26.length; var27++) {
								var26[var27] = this.field6876[var13 + var27];
								var24 = (short) (var24 | (var26[var27] & 0xFF) << var27 * 8);
							}
							if (this.field6875 == var12.field6862) {
								byte[] var45 = var12.field6858;
								for (int var46 = 0; var46 < var45.length; var46++) {
									var45[var46] = var12.field6857[var12.field6865 + var46];
									var25 = (short) (var25 | (var45[var46] & 0xFF) << var46 * 8);
								}
								var12.field6865 += var15;
								var12.field6865 %= var12.field6857.length;
								var12.field6860 += var15;
							} else {
								byte[] var28 = var12.field6858;
								float var29 = (float) (var16 / var19 * var21);
								float var30 = (float) Math.floor((double) var29);
								short var31 = 0;
								short var32 = 0;
								int var33 = (int) Math.floor((double) var29);
								int var34 = (int) Math.ceil((double) var29);
								int var35 = var12.field6864 * var28.length * var33 + var28.length * var18;
								int var36 = var12.field6864 * var28.length * var34 + var28.length * var18;
								int var37 = var23 + var35;
								int var38 = var23 + var36;
								int var39 = var37 % var12.field6857.length;
								int var40 = var38 % var12.field6857.length;
								for (int var41 = 0; var41 < var28.length; var41++) {
									var28[var41] = var12.field6857[var39 + var41];
									var31 = (short) (var31 | (var28[var41] & 0xFF) << var41 * 8);
								}
								for (int var42 = 0; var42 < var28.length; var42++) {
									var28[var42] = var12.field6857[var40 + var42];
									var32 = (short) (var32 | (var28[var42] & 0xFF) << var42 * 8);
								}
								float var43 = var29 - var30;
								if (var43 < 0.0F || var43 > 1.0F) {
									throw new RuntimeException("");
								}
								float var44 = (float) (var32 - var31);
								var25 = (short) (var43 * var44 + (float) var31);
								var18++;
								var18 %= var12.field6864;
								if (var18 == 0) {
									var16++;
								}
							}
							short var48 = (short) (var24 + var25);
							if (var48 > 32767) {
								var48 = 32767;
							}
							if (var48 < -32768) {
								var48 = -32768;
							}
							this.field6876[var13] = (byte) var48;
							this.field6876[var13 + 1] = (byte) (var48 >> 8);
							int var49 = var10 + var13;
							var13 = var49 % this.field6876.length;
							var14 += var15;
						}
						if (this.field6875 != var12.field6862) {
							double var50 = var21 / var19 * (double) var2;
							int var52 = (int) (var3 * Math.ceil(var50 / var3));
							var12.field6865 += var52;
							var12.field6865 %= var12.field6857.length;
							var12.field6860 += var52;
						}
					}
				}
			}
		}

		@ObfuscatedName("ts.k(Lth;B)V")
		public void method8649(SoundSample arg0) {
			this.field6878.add(arg0);
		}

		@ObfuscatedName("ts.f(Lth;I)V")
		public void method8650(SoundSample arg0) {
			this.field6878.remove(arg0);
		}
	}

	@ObfuscatedName("th")
	public static class SoundSample {

		// $FF: synthetic field
		public final JavaSoundBackend this$0;

		@ObfuscatedName("th.e")
		public PcmPlayer field6863;

		@ObfuscatedName("th.n")
		public byte[] field6857;

		@ObfuscatedName("th.m")
		public byte[] field6858;

		@ObfuscatedName("th.k")
		public int field6865;

		@ObfuscatedName("th.f")
		public int field6856;

		@ObfuscatedName("th.w")
		public int field6860;

		@ObfuscatedName("th.l")
		public int field6861;

		@ObfuscatedName("th.u")
		public final float field6862;

		@ObfuscatedName("th.z")
		public final int field6859;

		@ObfuscatedName("th.p")
		public final int field6864;

		// line 524
		public SoundSample(JavaSoundBackend arg0, PcmPlayer arg1, int arg2, float arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
			this.this$0 = arg0;
			this.field6863 = arg1;
			this.field6857 = new byte[arg2];
			this.field6858 = new byte[arg4 / 8];
			this.field6860 = this.field6857.length;
			this.field6862 = arg3;
			this.field6859 = arg4;
			this.field6864 = arg5;
			this.field6856 = 0;
			this.field6865 = 0;
			this.field6861 = 0;
		}

		@ObfuscatedName("th.e([BIIB)V")
		public void method8626(byte[] arg0, int arg1, int arg2) {
			int var4 = arg1;
			while (var4 < arg1 + arg2) {
				this.field6857[this.field6856] = arg0[var4];
				this.field6857[this.field6856 + 1] = arg0[var4 + 1];
				var4 += 2;
				this.field6856 += 2;
				this.field6856 %= this.field6857.length;
				this.field6860 -= 2;
			}
		}

		@ObfuscatedName("th.n(I)I")
		public int method8628() {
			return this.field6860;
		}
	}
}
