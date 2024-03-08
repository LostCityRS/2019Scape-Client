package com.jagex;

import deob.ObfuscatedName;

import java.util.Arrays;
import java.util.Iterator;

@ObfuscatedName("vr")
public class BASType implements class757, ConfigType {

	@ObfuscatedName("vr.e")
	public int field7345;

	@ObfuscatedName("vr.n")
	public int[] field7335;

	@ObfuscatedName("vr.m")
	public int[] field7324;

	@ObfuscatedName("vr.k")
	public int field7327;

	@ObfuscatedName("vr.f")
	public int field7322;

	@ObfuscatedName("vr.w")
	public int field7354;

	@ObfuscatedName("vr.l")
	public int field7350;

	@ObfuscatedName("vr.u")
	public int field7325;

	@ObfuscatedName("vr.z")
	public int field7326;

	@ObfuscatedName("vr.p")
	public int field7351;

	@ObfuscatedName("vr.d")
	public int field7361;

	@ObfuscatedName("vr.c")
	public int field7329;

	@ObfuscatedName("vr.r")
	public int field7330;

	@ObfuscatedName("vr.v")
	public int field7331;

	@ObfuscatedName("vr.o")
	public int field7332;

	@ObfuscatedName("vr.s")
	public int field7333;

	@ObfuscatedName("vr.y")
	public int field7328;

	@ObfuscatedName("vr.q")
	public int field7319;

	@ObfuscatedName("vr.x")
	public int field7352;

	@ObfuscatedName("vr.b")
	public int field7337;

	@ObfuscatedName("vr.h")
	public int field7338;

	@ObfuscatedName("vr.a")
	public int field7339;

	@ObfuscatedName("vr.g")
	public int field7320;

	@ObfuscatedName("vr.i")
	public int field7341;

	@ObfuscatedName("vr.j")
	public int field7342;

	@ObfuscatedName("vr.t")
	public int field7343;

	@ObfuscatedName("vr.ae")
	public int field7344;

	@ObfuscatedName("vr.ag")
	public int field7323;

	@ObfuscatedName("vr.ah")
	public int[][] field7357;

	@ObfuscatedName("vr.al")
	public int[][] field7347;

	@ObfuscatedName("vr.ac")
	public class419[] field7348;

	@ObfuscatedName("vr.ai")
	public int[] field7349;

	@ObfuscatedName("vr.aw")
	public int[] field7318;

	@ObfuscatedName("vr.as")
	public int field7321;

	@ObfuscatedName("vr.at")
	public int field7340;

	@ObfuscatedName("vr.ad")
	public int field7353;

	@ObfuscatedName("vr.am")
	public int field7336;

	@ObfuscatedName("vr.au")
	public int field7355;

	@ObfuscatedName("vr.ar")
	public int field7356;

	@ObfuscatedName("vr.ap")
	public int field7334;

	@ObfuscatedName("vr.aq")
	public int field7358;

	@ObfuscatedName("vr.ax")
	public int field7359;

	@ObfuscatedName("vr.av")
	public int field7360;

	@ObfuscatedName("vr.ao")
	public boolean field7346;

	public BASType() {
		this.field7345 = -1;
		this.field7335 = null;
		this.field7324 = null;
		this.field7327 = 0;
		this.field7322 = -1;
		this.field7354 = -1;
		this.field7350 = -1;
		this.field7325 = -1;
		this.field7326 = -1;
		this.field7351 = -1;
		this.field7361 = -1;
		this.field7329 = -1;
		this.field7330 = -1;
		this.field7331 = -1;
		this.field7332 = -1;
		this.field7333 = -1;
		this.field7328 = -1;
		this.field7319 = -1;
		this.field7352 = -1;
		this.field7337 = -1;
		this.field7338 = -1;
		this.field7339 = -1;
		this.field7320 = -1;
		this.field7341 = -1;
		this.field7342 = 0;
		this.field7343 = 0;
		this.field7344 = 0;
		this.field7323 = 0;
		this.field7321 = 0;
		this.field7340 = 0;
		this.field7353 = 0;
		this.field7336 = 0;
		this.field7355 = 0;
		this.field7356 = 0;
		this.field7334 = 0;
		this.field7358 = 0;
		this.field7359 = -1;
		this.field7360 = -1;
		this.field7346 = true;
	}

	public BASType(int arg0) {
		this.field7345 = -1;
		this.field7335 = null;
		this.field7324 = null;
		this.field7327 = 0;
		this.field7322 = -1;
		this.field7354 = -1;
		this.field7350 = -1;
		this.field7325 = -1;
		this.field7326 = -1;
		this.field7351 = -1;
		this.field7361 = -1;
		this.field7329 = -1;
		this.field7330 = -1;
		this.field7331 = -1;
		this.field7332 = -1;
		this.field7333 = -1;
		this.field7328 = -1;
		this.field7319 = -1;
		this.field7352 = -1;
		this.field7337 = -1;
		this.field7338 = -1;
		this.field7339 = -1;
		this.field7320 = -1;
		this.field7341 = -1;
		this.field7342 = 0;
		this.field7343 = 0;
		this.field7344 = 0;
		this.field7323 = 0;
		this.field7321 = 0;
		this.field7340 = 0;
		this.field7353 = 0;
		this.field7336 = 0;
		this.field7355 = 0;
		this.field7356 = 0;
		this.field7334 = 0;
		this.field7358 = 0;
		this.field7359 = -1;
		this.field7360 = -1;
		this.field7346 = true;
	}

	@ObfuscatedName("vr.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method9298(arg0, var2);
		}
	}

	@ObfuscatedName("vr.u(Lalw;II)V")
	public void method9298(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.field7345 = arg0.gSmart2or4null();
			this.field7350 = arg0.gSmart2or4null();
		} else if (arg1 == 2) {
			this.field7332 = arg0.gSmart2or4null();
		} else if (arg1 == 3) {
			this.field7333 = arg0.gSmart2or4null();
		} else if (arg1 == 4) {
			this.field7328 = arg0.gSmart2or4null();
		} else if (arg1 == 5) {
			this.field7319 = arg0.gSmart2or4null();
		} else if (arg1 == 6) {
			this.field7361 = arg0.gSmart2or4null();
		} else if (arg1 == 7) {
			this.field7329 = arg0.gSmart2or4null();
		} else if (arg1 == 8) {
			this.field7330 = arg0.gSmart2or4null();
		} else if (arg1 == 9) {
			this.field7331 = arg0.gSmart2or4null();
		} else if (arg1 == 26) {
			this.field7342 = (short) (arg0.g1() * 4);
			this.field7343 = (short) (arg0.g1() * 4);
		} else if (arg1 == 27) {
			int var3 = arg0.g1();
			if (this.field7357 == null) {
				this.field7357 = new int[var3 + 1][];
			} else if (var3 >= this.field7357.length) {
				this.field7357 = (int[][]) Arrays.copyOf(this.field7357, var3 + 1);
			}
			this.field7357[var3] = new int[6];
			for (int var4 = 0; var4 < 6; var4++) {
				this.field7357[var3][var4] = arg0.g2s();
			}
		} else if (arg1 == 28) {
			int var5 = arg0.g1();
			this.field7318 = new int[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field7318[var6] = arg0.g1();
				if (this.field7318[var6] == 255) {
					this.field7318[var6] = -1;
				}
			}
		} else if (arg1 == 29) {
			this.field7321 = arg0.g1();
		} else if (arg1 == 30) {
			this.field7340 = arg0.g2();
		} else if (arg1 == 31) {
			this.field7353 = arg0.g1();
		} else if (arg1 == 32) {
			this.field7336 = arg0.g2();
		} else if (arg1 == 33) {
			this.field7355 = arg0.g2s();
		} else if (arg1 == 34) {
			this.field7356 = arg0.g1();
		} else if (arg1 == 35) {
			this.field7334 = arg0.g2();
		} else if (arg1 == 36) {
			this.field7358 = arg0.g2s();
		} else if (arg1 == 37) {
			this.field7359 = arg0.g1();
		} else if (arg1 == 38) {
			this.field7322 = arg0.gSmart2or4null();
		} else if (arg1 == 39) {
			this.field7354 = arg0.gSmart2or4null();
		} else if (arg1 == 40) {
			this.field7325 = arg0.gSmart2or4null();
		} else if (arg1 == 41) {
			this.field7326 = arg0.gSmart2or4null();
		} else if (arg1 == 42) {
			this.field7351 = arg0.gSmart2or4null();
		} else if (arg1 == 43) {
			arg0.g2();
		} else if (arg1 == 44) {
			arg0.g2();
		} else if (arg1 == 45) {
			this.field7360 = arg0.g2();
		} else if (arg1 == 46) {
			this.field7352 = arg0.gSmart2or4null();
		} else if (arg1 == 47) {
			this.field7337 = arg0.gSmart2or4null();
		} else if (arg1 == 48) {
			this.field7338 = arg0.gSmart2or4null();
		} else if (arg1 == 49) {
			this.field7339 = arg0.gSmart2or4null();
		} else if (arg1 == 50) {
			this.field7320 = arg0.gSmart2or4null();
		} else if (arg1 == 51) {
			this.field7341 = arg0.gSmart2or4null();
		} else if (arg1 == 52) {
			int var7 = arg0.g1();
			this.field7335 = new int[var7];
			this.field7324 = new int[var7];
			for (int var8 = 0; var8 < var7; var8++) {
				this.field7335[var8] = arg0.gSmart2or4null();
				int var9 = arg0.g1();
				this.field7324[var8] = var9;
				this.field7327 += var9;
			}
		} else if (arg1 == 53) {
			this.field7346 = false;
		} else if (arg1 == 54) {
			this.field7344 = arg0.g1() << 6;
			this.field7323 = arg0.g1() << 6;
		} else if (arg1 == 55) {
			int var10 = arg0.g1();
			if (this.field7349 == null) {
				this.field7349 = new int[var10 + 1];
			} else if (var10 >= this.field7349.length) {
				this.field7349 = Arrays.copyOf(this.field7349, var10 + 1);
			}
			this.field7349[var10] = arg0.g2();
		} else if (arg1 == 56) {
			int var11 = arg0.g1();
			if (this.field7347 == null) {
				this.field7347 = new int[var11 + 1][];
			} else if (var11 >= this.field7347.length) {
				this.field7347 = (int[][]) Arrays.copyOf(this.field7347, var11 + 1);
			}
			this.field7347[var11] = new int[3];
			for (int var12 = 0; var12 < 3; var12++) {
				this.field7347[var11][var12] = arg0.g2s();
			}
		}
	}

	@ObfuscatedName("vr.n(I)V")
	public void postDecode() {
	}

	@ObfuscatedName("vr.p(I)I")
	public int method9295() {
		if (this.field7345 != -1) {
			return this.field7345;
		} else if (this.field7335 == null) {
			return -1;
		} else {
			int var1 = (int) (Math.random() * (double) this.field7327);
			int var2;
			for (var2 = 0; var1 >= this.field7324[var2]; var2++) {
				var1 -= this.field7324[var2];
			}
			return this.field7335[var2];
		}
	}

	@ObfuscatedName("vr.d(II)Z")
	public boolean method9290(int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.field7345 == arg0) {
			return true;
		} else {
			if (this.field7335 != null) {
				for (int var2 = 0; var2 < this.field7335.length; var2++) {
					if (this.field7335[var2] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@ObfuscatedName("vr.c(B)[Lou;")
	public class419[] method9291() {
		if (this.field7348 != null) {
			return this.field7348;
		} else if (this.field7357 == null) {
			return null;
		} else {
			this.field7348 = new class419[this.field7357.length];
			for (int var1 = 0; var1 < this.field7357.length; var1++) {
				int var2 = 0;
				int var3 = 0;
				int var4 = 0;
				int var5 = 0;
				int var6 = 0;
				int var7 = 0;
				if (this.field7357[var1] != null) {
					var2 = this.field7357[var1][0];
					var3 = this.field7357[var1][1];
					var4 = this.field7357[var1][2];
					var5 = this.field7357[var1][3] << 3;
					var6 = this.field7357[var1][4] << 3;
					var7 = this.field7357[var1][5] << 3;
				}
				if (var2 != 0 || var3 != 0 || var4 != 0 || var5 != 0 || var6 != 0 || var7 != 0) {
					class419 var8 = this.field7348[var1] = new class419();
					if (var7 != 0) {
						var8.method6307(0.0F, 0.0F, 1.0F, class417.method6277(var7));
					}
					if (var5 != 0) {
						var8.method6307(1.0F, 0.0F, 0.0F, class417.method6277(var5));
					}
					if (var6 != 0) {
						var8.method6307(0.0F, 1.0F, 0.0F, class417.method6277(var6));
					}
					var8.method6315((float) var2, (float) var3, (float) var4);
				}
			}
			return this.field7348;
		}
	}

	@ObfuscatedName("vr.o(I)[I")
	public int[] method9293() {
		IterableMap var1 = new IterableMap(16);
		method6205(this.field7345, var1);
		if (this.field7335 != null) {
			int[] var2 = this.field7335;
			for (int var3 = 0; var3 < var2.length; var3++) {
				int var4 = var2[var3];
				method6205(var4, var1);
			}
		}
		method6205(this.field7322, var1);
		method6205(this.field7354, var1);
		method6205(this.field7350, var1);
		method6205(this.field7325, var1);
		method6205(this.field7326, var1);
		method6205(this.field7351, var1);
		method6205(this.field7361, var1);
		method6205(this.field7329, var1);
		method6205(this.field7330, var1);
		method6205(this.field7331, var1);
		method6205(this.field7332, var1);
		method6205(this.field7333, var1);
		method6205(this.field7328, var1);
		method6205(this.field7319, var1);
		method6205(this.field7352, var1);
		method6205(this.field7337, var1);
		method6205(this.field7338, var1);
		method6205(this.field7339, var1);
		method6205(this.field7320, var1);
		method6205(this.field7341, var1);
		int[] var5 = new int[var1.method14498()];
		int var6 = 0;
		Iterator var7 = var1.iterator();
		while (var7.hasNext()) {
			class532 var8 = (class532) var7.next();
			var5[var6++] = (int) var8.field6760;
		}
		return var5;
	}

	@ObfuscatedName("oi.s(ILaan;I)V")
	public static final void method6205(int arg0, IterableMap arg1) {
		if (arg0 != -1 && arg1.method14495((long) arg0) == null) {
			arg1.method14501(new class532(), (long) arg0);
		}
	}

	@ObfuscatedName("vr.z(IB)V")
	public void method2998(int arg0) {
	}
}
