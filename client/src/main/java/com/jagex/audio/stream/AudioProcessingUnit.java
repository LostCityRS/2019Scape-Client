package com.jagex.audio.stream;

import com.jagex.audio.api.AudioBuss;
import com.jagex.audio.api.SoundBackend;
import com.jagex.audio.vorbis.VorbisInterface;
import com.jagex.audio.vorbis.VorbisInterface2;
import com.jagex.audio.vorbis.VorbisRelated;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.ByteArrayPool;
import com.jagex.core.utils.MonotonicTime;
import deob.ObfuscatedName;

@ObfuscatedName("rq")
public class AudioProcessingUnit {

	@ObfuscatedName("rq.e")
	public byte[] field4901;

	@ObfuscatedName("rq.n")
	public int field4896;

	@ObfuscatedName("rq.m")
	public float field4897;

	@ObfuscatedName("rq.k")
	public float field4898;

	@ObfuscatedName("rq.f")
	public float[] field4910;

	@ObfuscatedName("rq.w")
	public boolean field4900;

	@ObfuscatedName("rq.l")
	public int field4899;

	@ObfuscatedName("rq.u")
	public float field4902;

	@ObfuscatedName("rq.z")
	public SoundBaseInterface field4903;

	@ObfuscatedName("rq.p")
	public int field4904;

	@ObfuscatedName("rq.d")
	public int field4895;

	@ObfuscatedName("rq.c")
	public int field4906;

	@ObfuscatedName("rq.r")
	public int field4907;

	@ObfuscatedName("rq.v")
	public SoundRelated3[] field4908;

	@ObfuscatedName("rq.o")
	public int field4909;

	@ObfuscatedName("rq.s")
	public Object field4918;

	@ObfuscatedName("rq.y")
	public int field4928;

	@ObfuscatedName("rq.q")
	public int field4922;

	@ObfuscatedName("rq.x")
	public int field4913;

	@ObfuscatedName("rq.b")
	public int field4914;

	@ObfuscatedName("rq.h")
	public int field4926;

	@ObfuscatedName("rq.a")
	public int[] field4936;

	@ObfuscatedName("rq.g")
	public int[] field4917;

	@ObfuscatedName("rq.i")
	public int[] field4944;

	@ObfuscatedName("rq.j")
	public int field4919;

	@ObfuscatedName("rq.t")
	public boolean field4920;

	@ObfuscatedName("rq.ae")
	public SoundRelatedType1 field4912;

	@ObfuscatedName("rq.ag")
	public VorbisInterface field4921;

	@ObfuscatedName("rq.ah")
	public SoundBackend field4923;

	@ObfuscatedName("rq.al")
	public boolean field4924;

	@ObfuscatedName("rq.ac")
	public SoundAdjuster field4933;

	@ObfuscatedName("rq.ai")
	public Object field4905;

	@ObfuscatedName("rq.aw")
	public int field4927 = 0;

	@ObfuscatedName("rq.as")
	public int field4945 = 0;

	@ObfuscatedName("rq.at")
	public int field4929 = 0;

	@ObfuscatedName("rq.ad")
	public boolean field4930;

	@ObfuscatedName("rq.am")
	public int field4931 = 0;

	@ObfuscatedName("rq.au")
	public int field4932 = 0;

	@ObfuscatedName("rq.ar")
	public boolean field4915;

	@ObfuscatedName("rq.ap")
	public int field4934 = 0;

	@ObfuscatedName("rq.aq")
	public float field4935;

	@ObfuscatedName("rq.ax")
	public boolean field4916;

	@ObfuscatedName("rq.av")
	public float field4937 = 0.0F;

	@ObfuscatedName("rq.ao")
	public long field4938 = 0L;

	@ObfuscatedName("rq.aj")
	public long field4939 = 0L;

	@ObfuscatedName("rq.ay")
	public float field4940 = 0.0F;

	@ObfuscatedName("rq.ab")
	public int field4941 = 0;

	@ObfuscatedName("rq.az")
	public boolean field4942;

	@ObfuscatedName("rq.aa")
	public boolean field4943;

	@ObfuscatedName("rq.af")
	public int field4925 = 0;

	@ObfuscatedName("rq.ak")
	public boolean field4911;

	// line 66
	public AudioProcessingUnit(SoundRelatedType2 arg0, int arg1, int arg2, VorbisInterface arg3, SoundBackend arg4) {
		this.field4923 = arg4;
		this.method7480(SoundRelatedType1.field4859);
		this.field4907 = arg1;
		this.field4895 = arg2;
		this.field4921 = arg3;
		this.field4909 = 0;
		this.field4924 = false;
		this.field4921.method3770(new VorbisInterfaceRelated(this));
		this.method7517();
	}

	@ObfuscatedName("rp")
	public static class VorbisInterfaceRelated implements VorbisInterface2 {

		// $FF: synthetic field
		public final AudioProcessingUnit this$0;

		// line 74
		public VorbisInterfaceRelated(AudioProcessingUnit arg0) {
			this.this$0 = arg0;
		}

		@ObfuscatedName("rp.e(I)V")
		public void method5932() {
			this.this$0.method7506(true);
		}
	}

	// line 83
	@ObfuscatedName("rq.e(I)Lqn;")
	public SoundRelatedType1 method7550() {
		return this.field4912;
	}

	@ObfuscatedName("rq.n(Lqn;I)V")
	public void method7480(SoundRelatedType1 arg0) {
		this.field4912 = arg0;
	}

	@ObfuscatedName("rq.m(I)Z")
	public boolean method7581() {
		return SoundRelatedType1.field4858 == this.field4912;
	}

	@ObfuscatedName("rq.k(B)Z")
	public boolean method7482() {
		return SoundRelatedType1.field4865 == this.field4912;
	}

	@ObfuscatedName("rq.f(I)V")
	public void method7592() {
		if (this.method7550().field4867 >= SoundRelatedType1.field4860.field4867) {
			throw new RuntimeException("");
		}
		this.method7480(SoundRelatedType1.field4860);
	}

	@ObfuscatedName("rq.w(B)V")
	public void method7484() {
		if (this.method7550().field4867 < SoundRelatedType1.field4860.field4867) {
			throw new RuntimeException("");
		}
		this.field4905 = null;
		this.method7480(SoundRelatedType1.field4866);
	}

	@ObfuscatedName("rq.l(FII)V")
	public void method7485(float arg0, int arg1) {
		if (arg1 <= 0) {
			this.field4897 = arg0;
			this.field4937 = this.field4897;
			this.field4939 = 0L;
			this.field4938 = 0L;
		} else {
			this.field4940 = this.field4897;
			this.field4937 = arg0;
			this.field4939 = MonotonicTime.get();
			this.field4938 = this.field4939 + (long) arg1;
		}
	}

	@ObfuscatedName("rq.u(I)F")
	public float method7486() {
		return this.field4897;
	}

	@ObfuscatedName("rq.z([BLrf;IFZZIFLjava/lang/Object;I)Z")
	public boolean method7487(byte[] arg0, SoundBaseInterface arg1, int arg2, float arg3, boolean arg4, boolean arg5, int arg6, float arg7, Object arg8) {
		synchronized (this) {
			if (arg1 == null) {
				this.field4901 = arg0;
			} else {
				this.field4901 = null;
				this.field4903 = arg1;
			}
			this.field4905 = arg8;
			this.field4896 = arg2;
			this.field4897 = arg3;
			this.field4900 = arg5;
			this.field4899 = arg6;
			this.field4902 = arg7;
			byte[] var11 = null;
			if (this.field4901 != null) {
				var11 = this.field4901;
			} else if (this.field4903 != null) {
				this.field4904 = 0;
				var11 = this.field4903.method7354(this.field4904);
			}
			if (var11 == null) {
				return var11 != null;
			}
			Packet var12 = new Packet(var11);
			if (var12.g1() != 74 || var12.g1() != 65 || var12.g1() != 71 || var12.g1() != 65) {
				throw new RuntimeException("");
			}
			this.field4928 = var12.g4s();
			this.field4922 = var12.g4s();
			this.field4914 = var12.g4s();
			this.field4913 = var12.g4s();
			this.field4926 = var12.g4s();
			if (this.field4918 == null) {
				this.field4918 = this.field4923.playSample(this.field4913, this.field4914, this.field4921.method3733(), this.field4921.method3734(), this.field4907, this.field4902);
				if (this.field4918 == null) {
					this.method7480(SoundRelatedType1.field4865);
					return false;
				}
			}
			this.field4936 = new int[this.field4926];
			this.field4917 = new int[this.field4926];
			this.field4944 = new int[this.field4926];
			int var13 = this.field4926 * 8 + var12.pos;
			for (int var14 = 0; var14 < this.field4926; var14++) {
				this.field4936[var14] = var13;
				this.field4917[var14] = var12.g4s();
				this.field4944[var14] = var12.g4s();
				var13 += this.field4917[var14];
			}
			this.field4919 = var12.pos;
			this.field4908 = new SoundRelated3[this.field4895];
			this.field4910 = new float[2];
			for (int var15 = 0; var15 < this.field4910.length; var15++) {
				this.field4910[var15] = 1.0F;
			}
			if (this.field4905 instanceof Sound) {
				AudioProcessingInterface var16 = ((Sound) this.field4905).method7386();
				this.field4942 = var16.method9702();
				this.field4943 = !this.field4942;
			}
			this.field4921.method3771(this.field4943, this.field4900 ? this.field4899 : 0, this.field4928, this.field4922);
			if (this.field4903 == null) {
				this.field4924 = true;
			} else {
				int var17 = var12.data.length - this.field4919;
				byte[] var18 = ByteArrayPool.alloc(var17, true);
				System.arraycopy(var12.data, this.field4919, var18, 0, var17);
				var12.data = var18;
				var12.pos = var17;
				this.field4921.method3726(var12);
				this.field4904++;
			}
			return true;
		}
	}

	@ObfuscatedName("rq.p(I)V")
	public void method7488() {
		synchronized (this) {
			this.method7573();
		}
	}

	@ObfuscatedName("rq.d(I)V")
	public void method7489() {
		synchronized (this) {
			if (this.method7550() != SoundRelatedType1.field4858 && this.method7550().field4867 >= SoundRelatedType1.field4860.field4867) {
				this.method7480(SoundRelatedType1.field4858);
			}
		}
	}

	@ObfuscatedName("rq.c(Lro;I)V")
	public void method7536(SoundAdjuster arg0) {
		this.field4933 = arg0;
		if (this.field4933 != null) {
			this.field4933.method3053(this.field4905, this.field4910, null);
		}
	}

	@ObfuscatedName("rq.r(I)Z")
	public boolean method7491() {
		if (this.field4910 == null) {
			return false;
		}
		float var1 = 0.0F;
		float var2 = 0.0F;
		for (int var3 = 0; var3 < this.field4910.length; var3++) {
			float var4 = this.field4910[var3];
			if (this.field4897 * var4 > var1) {
				var1 = var4;
			}
			if (var4 > var2) {
				var2 = var4;
			}
		}
		if (var1 >= 1.0E-5F) {
			return true;
		} else if (var2 >= 1.0E-5F && this.field4937 >= 1.0E-5F) {
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("rq.v(B)V")
	public void method7492() {
		AudioBuss var1 = this.field4923.getBussManager().getBuss(this.field4896);
		this.field4898 = var1 == null ? 1.0F : var1.getVolume();
		float var2 = var1 == null ? 0.1F : var1.getPriority();
		float var3 = this.field4897 * var2;
		float var4 = this.field4910.length > 0 ? 0.0F : 1.0F;
		for (int var5 = 0; var5 < this.field4910.length; var5++) {
			if (this.field4910[var5] > var4) {
				var4 = this.field4910[var5];
			}
		}
		float var6 = var3 * var4;
		if (!this.method7491()) {
			var6 = -1.0F;
		}
		if (this.method7531() != var6) {
			this.method7494(var6);
			this.field4916 = true;
		}
	}

	@ObfuscatedName("rq.o(I)F")
	public float method7531() {
		return this.field4935;
	}

	@ObfuscatedName("rq.s(FI)V")
	public void method7494(float arg0) {
		synchronized (this) {
			this.field4935 = arg0;
		}
	}

	@ObfuscatedName("rq.y(B)Z")
	public boolean method7588() {
		return this.field4916;
	}

	@ObfuscatedName("rq.q(B)V")
	public void method7601() {
		synchronized (this) {
			this.method7497();
		}
	}

	@ObfuscatedName("rq.x(B)V")
	public void method7497() {
		if (this.method7550().field4867 < SoundRelatedType1.field4861.field4867) {
			return;
		}
		if (this.method7550() == SoundRelatedType1.field4866) {
			this.method7483();
			return;
		}
		this.method7563();
		if (this.field4937 != this.field4897) {
			long var1 = MonotonicTime.get();
			if (var1 > this.field4938) {
				this.field4897 = this.field4937;
			} else {
				float var3 = this.field4937 - this.field4940;
				long var4 = this.field4938 - this.field4939;
				float var6 = var3 / (float) var4;
				this.field4897 = (float) (var1 - this.field4939) * var6 + this.field4940;
				this.field4897 = Math.max(0.0F, Math.min(1.0F, this.field4897));
			}
		}
		this.method7492();
		if (this.method7550().field4867 < SoundRelatedType1.field4858.field4867) {
			this.method7501();
		}
	}

	@ObfuscatedName("rq.b(I)V")
	public void method7563() {
		synchronized (this) {
			int var2 = this.method7561();
			if (!this.field4942 || var2 <= this.field4941 || !this.field4921.method3868()) {
				VorbisRelated var3 = this.field4921.method3843();
				if (this.field4924 && VorbisRelated.field3425 != var3) {
					if (this.field4901 == null) {
						if (this.field4903 != null) {
							if (this.field4904 >= this.field4926) {
								this.field4904 = 0;
								this.field4921.method3726(null);
							} else {
								byte[] var8 = this.field4903.method7354(this.field4944[this.field4904]);
								if (var8 != null) {
									Packet var9 = new Packet(var8);
									var9.pos = var8.length;
									this.field4921.method3726(var9);
									this.method7506(false);
									this.field4904++;
								}
							}
						}
					} else if (this.field4931 >= this.field4926) {
						this.field4921.method3726(null);
						this.field4931 = 0;
					} else {
						if (this.field4906 < this.field4919) {
							this.field4906 = this.field4919;
						}
						this.field4906 = this.field4934 + this.field4936[this.field4931];
						int var4 = this.field4917[this.field4931];
						int var6 = this.field4934 + var4 > var4 ? this.field4936[this.field4931] + var4 : this.field4906 + var4;
						this.field4934 += this.field4906 + var4 > this.field4901.length ? this.field4901.length - this.field4906 : var4;
						Packet var7 = new Packet(var6 - this.field4906, true);
						if (this.field4901 == null) {
							throw new RuntimeException("");
						}
						if (var7.data == null) {
							throw new RuntimeException("");
						}
						var7.pdata(this.field4901, this.field4906, var6 - this.field4906);
						this.field4921.method3726(var7);
						this.method7506(false);
						if (this.field4934 >= var4) {
							this.field4931++;
							this.field4934 = 0;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("rq.h(I)V")
	public void method7483() {
		synchronized (this) {
			if (this.field4921.method3843() == VorbisRelated.field3427) {
				if (this.field4918 == null) {
					this.method7480(SoundRelatedType1.field4859);
				} else {
					int var2 = this.field4923.method5864(this.field4918);
					if (var2 >= this.field4907) {
						this.field4923.method5863(this.field4918);
						this.field4918 = null;
						this.method7480(SoundRelatedType1.field4859);
					}
				}
			}
		}
		this.method7517();
	}

	@ObfuscatedName("rq.a(B)V")
	public void method7573() {
		if (this.method7550() != SoundRelatedType1.field4858 && this.method7550().field4867 < SoundRelatedType1.field4861.field4867) {
			this.method7480(SoundRelatedType1.field4861);
			this.field4920 = true;
			this.method7501();
			this.method7492();
		}
	}

	@ObfuscatedName("rq.g(B)V")
	public void method7501() {
		if (this.field4920 && this.method7550().field4867 >= SoundRelatedType1.field4861.field4867 && this.method7550().field4867 < SoundRelatedType1.field4865.field4867 && this.field4933 != null && this.field4937 == this.field4897) {
			this.field4933.method3053(this.field4905, this.field4910, null);
		}
	}

	@ObfuscatedName("rq.i(I)V")
	public void method7502() {
		this.field4911 = true;
	}

	@ObfuscatedName("rq.j(I)V")
	public void method7584() {
		this.field4911 = false;
	}

	@ObfuscatedName("rq.t(B)V")
	public void method7504() {
		if (this.method7550().field4867 < SoundRelatedType1.field4861.field4867 || this.method7550().field4867 >= SoundRelatedType1.field4858.field4867 || !this.method7491()) {
			return;
		}
		synchronized (this) {
			this.field4921.method3727();
			this.method7505();
		}
		Thread.yield();
	}

	@ObfuscatedName("rq.ae(S)V")
	public void method7505() {
		if (this.field4908 == null) {
			return;
		}
		boolean var1 = true;
		VorbisRelated var2 = this.field4921.method3843();
		if (this.field4921.method3868()) {
			if (this.field4942 && this.method7512(this.field4941)) {
				if (this.field4908[this.field4932] == null) {
					Packet var3 = this.method7511(this.field4941);
					if (var3 != null) {
						this.field4908[this.field4932] = new SoundRelated3(this, var3, false);
						int var4 = this.field4921.method3722();
						int var5 = this.field4921.method3730(this.field4908[this.field4932].field4873.pos / var4);
						this.field4945 += var5;
						if (!this.field4943 && this.field4900 && this.field4925 > 0) {
							if (this.field4945 < this.field4928) {
								this.field4908[this.field4932] = null;
							} else if (this.field4945 >= this.field4928 && this.field4945 - var5 < this.field4928) {
								this.field4908[this.field4932].field4872 = this.field4921.method3731((this.field4945 - this.field4928) * var4);
							}
						}
						this.field4941++;
						if (!this.field4943 && this.field4900 && this.field4945 >= this.field4922 && (this.field4925 < this.field4899 || this.field4899 < 0)) {
							int var6 = this.field4945 - this.field4922;
							int var7 = var5 - var6;
							this.field4908[this.field4932].field4870 = this.field4921.method3731(var4 * var7);
							this.field4941 = 0;
							this.field4945 = 0;
							this.field4925++;
						}
						if (this.field4908[this.field4932] != null) {
							this.field4932++;
							this.field4932 %= this.field4908.length;
						}
					}
				}
			} else if (!this.method7514() || !this.field4942) {
				int var8 = this.field4921.method3729();
				int var9 = this.field4921.method3730(this.field4907);
				if (!this.field4930 && this.field4908[this.field4932] == null) {
					if (VorbisRelated.field3426 != var2 && var8 > 0) {
						Packet var10 = this.method7515(var9);
						this.field4908[this.field4932] = var10 == null ? null : new SoundRelated3(this, var10, false);
						int var11 = this.field4908[this.field4932] == null ? 0 : this.field4908[this.field4932].field4873.pos;
						int var12 = this.field4921.method3722();
						int var13 = this.field4921.method3730(var11 / var12);
						this.field4929 += var13;
						if (this.field4929 > this.field4945) {
							this.field4945 += var13;
							int var10000 = var8 - var13;
							if (!this.field4943 && this.field4900 && this.field4925 > 0) {
								if (this.field4945 < this.field4928) {
									this.field4908[this.field4932] = null;
								} else if (this.field4945 >= this.field4928 && this.field4945 - var13 < this.field4928) {
									this.field4908[this.field4932].field4872 = this.field4921.method3731((this.field4945 - this.field4928) * var12);
								}
							}
							if (this.field4908[this.field4932] != null) {
								if (this.field4942 && !this.method7512(this.field4941)) {
									this.method7510(this.field4908[this.field4932].field4873);
								}
								if (this.field4943 || !this.field4900 || this.field4945 < this.field4922 || this.field4925 > this.field4899 && this.field4899 >= 0) {
									this.field4941++;
								} else {
									int var15 = this.field4945 - this.field4922;
									int var16 = var13 - var15;
									this.field4908[this.field4932].field4870 = this.field4921.method3731(var12 * var16);
									this.field4941 = 0;
									this.field4925++;
									this.field4945 = 0;
								}
								this.field4932++;
								this.field4932 %= this.field4908.length;
							}
						} else {
							this.field4908[this.field4932] = null;
						}
					} else if (VorbisRelated.field3426 == var2 && this.field4900 && !this.field4943 && (this.field4925 < this.field4899 || this.field4899 < 0)) {
						this.field4921.method3721(true);
					}
				}
			}
		}
		int var17 = 0;
		for (int var18 = 0; var18 < this.field4908.length; var18++) {
			if (this.field4908[var18] != null) {
				var17++;
				var1 = false;
			}
		}
		if (!this.field4915 && this.method7531() >= 0.0F && (var17 >= this.field4895 || VorbisRelated.field3426 == var2 || VorbisRelated.field3425 == var2)) {
			this.field4915 = true;
			this.method7480(SoundRelatedType1.field4863);
		}
		if (!this.field4921.method3868() || !var1 || !this.method7514() && !this.field4930 && VorbisRelated.field3426 != var2 || this.field4900 && (this.field4943 || this.field4925 < this.field4899 || this.field4899 < 0)) {
			return;
		}
		this.method7480(SoundRelatedType1.field4865);
		this.field4920 = false;
		if (this.field4942) {
			this.method7496();
		}
	}

	@ObfuscatedName("rq.ag(ZB)V")
	public void method7506(boolean arg0) {
		this.field4924 = arg0;
	}

	@ObfuscatedName("rq.ah(B)V")
	public void method7507() {
		synchronized (this) {
			if (!this.field4911 && this.field4918 != null) {
				int var2 = this.field4923.method5864(this.field4918);
				if (var2 > 0 && (this.field4908 != null && this.field4908[this.field4909] != null && this.field4915)) {
					int var3 = this.field4927 + var2 > this.field4908[this.field4909].field4873.pos ? this.field4908[this.field4909].field4873.pos - this.field4927 : var2;
					if (this.field4927 < this.field4908[this.field4909].field4872 && this.field4927 + var3 > this.field4908[this.field4909].field4872 && this.field4908[this.field4909].field4872 >= 0) {
						this.field4927 += this.field4908[this.field4909].field4872 - this.field4927;
						var3 = this.field4927 + var2 > this.field4908[this.field4909].field4873.pos ? this.field4908[this.field4909].field4873.pos - this.field4927 : var2;
					}
					if (this.field4927 + var3 > this.field4908[this.field4909].field4870 && this.field4908[this.field4909].field4870 >= 0) {
						var3 = this.field4908[this.field4909].field4870 - this.field4927;
					}
					this.method7549(this.field4908[this.field4909].field4873.data, this.field4927, this.field4927 + var3);
					this.field4923.method5875(this.field4918, this.field4908[this.field4909].field4873.data, this.field4927, var3);
					this.field4927 += var3;
					int var10000 = var2 - var3;
					if (this.field4927 >= this.field4908[this.field4909].field4873.pos || this.field4927 >= this.field4908[this.field4909].field4870 && this.field4908[this.field4909].field4870 >= 0) {
						this.field4908[this.field4909].method7369();
						this.field4908[this.field4909] = null;
						this.field4909++;
						this.field4909 %= this.field4908.length;
						this.field4927 = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("rq.al([BIII)V")
	public void method7549(byte[] arg0, int arg1, int arg2) {
		int var4 = arg1;
		int var5 = 0;
		int var6 = this.field4921.method3733().field3445;
		while (var4 < arg0.length && var4 < arg2) {
			float var7 = this.field4898 * this.field4897 * this.field4910[var5];
			if (var6 == 16) {
				int var8 = (arg0[var4 + 1] << 8) + (arg0[var4] & 0xFF);
				int var9 = (int) (var7 * var7 * (float) var8);
				arg0[var4++] = (byte) var9;
				arg0[var4++] = (byte) (var9 >> 8);
			} else if (var6 == 8) {
				byte var10 = arg0[var4];
				byte var11 = (byte) ((float) var10 * var7);
				arg0[var4++] = var11;
			} else {
				throw new RuntimeException("");
			}
			var5++;
			var5 %= this.field4910.length;
		}
	}

	@ObfuscatedName("rq.ac(IS)Lalw;")
	public Packet method7515(int arg0) {
		return this.field4921.method3728(arg0);
	}

	@ObfuscatedName("rq.ai(Lalw;B)V")
	public void method7510(Packet arg0) {
		if (this.field4905 == null || !(this.field4905 instanceof Sound)) {
			return;
		}
		Sound var2 = (Sound) this.field4905;
		AudioProcessingInterface var3 = var2.method7386();
		byte[] var4 = new byte[arg0.pos];
		System.arraycopy(arg0.data, 0, var4, 0, arg0.pos);
		Packet var5 = new Packet(var4);
		var5.pos = arg0.pos;
		var3.method9681(var5);
	}

	@ObfuscatedName("rq.aw(II)Lalw;")
	public Packet method7511(int arg0) {
		if (this.field4905 == null || !(this.field4905 instanceof Sound)) {
			return null;
		}
		Sound var2 = (Sound) this.field4905;
		AudioProcessingInterface var3 = var2.method7386();
		Packet var4 = var3.method9686(arg0);
		Packet var5 = new Packet(var4.pos, true);
		var5.pdata(var4);
		return var5;
	}

	@ObfuscatedName("rq.as(II)Z")
	public boolean method7512(int arg0) {
		if (this.field4905 != null && this.field4905 instanceof Sound) {
			Sound var2 = (Sound) this.field4905;
			AudioProcessingInterface var3 = var2.method7386();
			return var3.method9683(arg0);
		} else {
			return false;
		}
	}

	@ObfuscatedName("rq.at(I)I")
	public int method7561() {
		if (this.field4905 != null && this.field4905 instanceof Sound) {
			Sound var1 = (Sound) this.field4905;
			AudioProcessingInterface var2 = var1.method7386();
			return var2.method9685();
		} else {
			return 0;
		}
	}

	@ObfuscatedName("rq.ad(I)Z")
	public boolean method7514() {
		synchronized (this) {
			if (this.field4905 != null && this.field4905 instanceof Sound) {
				Sound var2 = (Sound) this.field4905;
				AudioProcessingInterface var3 = var2.method7386();
				if (var3 != null) {
					return var3.method9687();
				}
			}
			return false;
		}
	}

	@ObfuscatedName("rq.am(I)V")
	public void method7496() {
		synchronized (this) {
			if (this.field4905 != null && this.field4905 instanceof Sound) {
				Sound var2 = (Sound) this.field4905;
				AudioProcessingInterface var3 = var2.method7386();
				if (var3 != null) {
					var3.method9671(true);
				}
			}
		}
	}

	@ObfuscatedName("rq.au(I)Ljava/lang/Object;")
	public Object method7516() {
		return this.field4905;
	}

	// line 686
	@ObfuscatedName("rq.ar(I)V")
	public void method7517() {
		synchronized (this) {
			this.field4901 = null;
			this.field4896 = 0;
			this.field4897 = 0.0F;
			this.field4898 = 0.0F;
			this.field4900 = false;
			this.field4899 = 0;
			this.field4902 = 1.0F;
			this.field4903 = null;
			this.field4904 = 0;
			this.field4906 = 0;
			if (this.field4908 != null) {
				for (int var2 = 0; var2 < this.field4908.length; var2++) {
					if (this.field4908[var2] != null) {
						this.field4908[var2].method7369();
					}
				}
			}
			this.field4908 = null;
			this.field4942 = false;
			this.field4909 = 0;
			this.field4928 = 0;
			this.field4922 = 0;
			this.field4913 = 0;
			this.field4914 = 0;
			this.field4926 = 0;
			this.field4936 = null;
			this.field4917 = null;
			this.field4944 = null;
			this.field4919 = 0;
			this.field4920 = false;
			this.field4921.method3738();
			this.field4924 = false;
			this.field4933 = null;
			this.field4905 = null;
			this.field4927 = 0;
			this.field4945 = 0;
			this.field4929 = 0;
			this.field4930 = false;
			this.field4931 = 0;
			this.field4932 = 0;
			this.field4915 = false;
			this.field4934 = 0;
			this.method7494(-1.0F);
			this.field4916 = false;
			this.field4937 = 0.0F;
			this.field4938 = 0L;
			this.field4939 = 0L;
			this.field4940 = 0.0F;
			this.field4941 = 0;
			this.field4925 = 0;
		}
	}

	@ObfuscatedName("qb")
	public static class SoundRelated3 {

		// $FF: synthetic field
		public final AudioProcessingUnit this$0;

		@ObfuscatedName("qb.e")
		public Packet field4873;

		@ObfuscatedName("qb.n")
		public boolean field4871;

		@ObfuscatedName("qb.m")
		public int field4872;

		@ObfuscatedName("qb.k")
		public int field4870;

		// line 750
		public SoundRelated3(AudioProcessingUnit arg0, Packet arg1, boolean arg2) {
			this.this$0 = arg0;
			this.field4873 = arg1;
			this.field4871 = arg2;
			this.field4872 = -1;
			this.field4870 = -1;
		}

		@ObfuscatedName("qb.e(I)V")
		public void method7369() {
			if (this.field4873 != null && !this.field4871) {
				this.field4873.release();
			}
			this.field4872 = -1;
			this.field4870 = -1;
		}
	}
}
