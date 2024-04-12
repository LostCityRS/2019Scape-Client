package com.jagex.game.config.bastype;

import com.jagex.core.datastruct.HashTable;
import com.jagex.core.datastruct.Node;
import com.jagex.core.io.Packet;
import com.jagex.game.client.MutableConfig;
import com.jagex.game.config.ConfigType;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Trig1;
import deob.ObfuscatedName;

import java.util.Arrays;
import java.util.Iterator;

@ObfuscatedName("vr")
public class BASType implements MutableConfig, ConfigType {

	@ObfuscatedName("vr.e")
	public int readyanim;

	@ObfuscatedName("vr.n")
	public int[] field7335;

	@ObfuscatedName("vr.m")
	public int[] field7324;

	@ObfuscatedName("vr.k")
	public int field7327;

	@ObfuscatedName("vr.f")
	public int readyanim_l;

	@ObfuscatedName("vr.w")
	public int readyanim_r;

	@ObfuscatedName("vr.l")
	public int walkanim;

	@ObfuscatedName("vr.u")
	public int walkanim_b;

	@ObfuscatedName("vr.z")
	public int walkanim_l;

	@ObfuscatedName("vr.p")
	public int walkanim_r;

	@ObfuscatedName("vr.d")
	public int runanim;

	@ObfuscatedName("vr.c")
	public int runanim_b;

	@ObfuscatedName("vr.r")
	public int runanim_l;

	@ObfuscatedName("vr.v")
	public int runanim_r;

	@ObfuscatedName("vr.o")
	public int crawlanim;

	@ObfuscatedName("vr.s")
	public int crawlanim_b;

	@ObfuscatedName("vr.y")
	public int crawlanim_l;

	@ObfuscatedName("vr.q")
	public int crawlanim_r;

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
	public Matrix4x3[] field7348;

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
	public int walkspeed;

	@ObfuscatedName("vr.av")
	public int field7360;

	@ObfuscatedName("vr.ao")
	public boolean field7346;

	public BASType() {
		this.readyanim = -1;
		this.field7335 = null;
		this.field7324 = null;
		this.field7327 = 0;
		this.readyanim_l = -1;
		this.readyanim_r = -1;
		this.walkanim = -1;
		this.walkanim_b = -1;
		this.walkanim_l = -1;
		this.walkanim_r = -1;
		this.runanim = -1;
		this.runanim_b = -1;
		this.runanim_l = -1;
		this.runanim_r = -1;
		this.crawlanim = -1;
		this.crawlanim_b = -1;
		this.crawlanim_l = -1;
		this.crawlanim_r = -1;
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
		this.walkspeed = -1;
		this.field7360 = -1;
		this.field7346 = true;
	}

	public BASType(int arg0) {
		this.readyanim = -1;
		this.field7335 = null;
		this.field7324 = null;
		this.field7327 = 0;
		this.readyanim_l = -1;
		this.readyanim_r = -1;
		this.walkanim = -1;
		this.walkanim_b = -1;
		this.walkanim_l = -1;
		this.walkanim_r = -1;
		this.runanim = -1;
		this.runanim_b = -1;
		this.runanim_l = -1;
		this.runanim_r = -1;
		this.crawlanim = -1;
		this.crawlanim_b = -1;
		this.crawlanim_l = -1;
		this.crawlanim_r = -1;
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
		this.walkspeed = -1;
		this.field7360 = -1;
		this.field7346 = true;
	}

	@ObfuscatedName("vr.e(Lalw;B)V")
	public void decode(Packet buf) {
		while (true) {
			int var2 = buf.g1();
			if (var2 == 0) {
				return;
			}
			this.method9298(buf, var2);
		}
	}

	@ObfuscatedName("vr.u(Lalw;II)V")
	public void method9298(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.readyanim = arg0.gSmart2or4null();
			this.walkanim = arg0.gSmart2or4null();
		} else if (arg1 == 2) {
			this.crawlanim = arg0.gSmart2or4null();
		} else if (arg1 == 3) {
			this.crawlanim_b = arg0.gSmart2or4null();
		} else if (arg1 == 4) {
			this.crawlanim_l = arg0.gSmart2or4null();
		} else if (arg1 == 5) {
			this.crawlanim_r = arg0.gSmart2or4null();
		} else if (arg1 == 6) {
			this.runanim = arg0.gSmart2or4null();
		} else if (arg1 == 7) {
			this.runanim_b = arg0.gSmart2or4null();
		} else if (arg1 == 8) {
			this.runanim_l = arg0.gSmart2or4null();
		} else if (arg1 == 9) {
			this.runanim_r = arg0.gSmart2or4null();
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
			this.walkspeed = arg0.g1();
		} else if (arg1 == 38) {
			this.readyanim_l = arg0.gSmart2or4null();
		} else if (arg1 == 39) {
			this.readyanim_r = arg0.gSmart2or4null();
		} else if (arg1 == 40) {
			this.walkanim_b = arg0.gSmart2or4null();
		} else if (arg1 == 41) {
			this.walkanim_l = arg0.gSmart2or4null();
		} else if (arg1 == 42) {
			this.walkanim_r = arg0.gSmart2or4null();
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
		if (this.readyanim != -1) {
			return this.readyanim;
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
		} else if (this.readyanim == arg0) {
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
	public Matrix4x3[] method9291() {
		if (this.field7348 != null) {
			return this.field7348;
		} else if (this.field7357 == null) {
			return null;
		} else {
			this.field7348 = new Matrix4x3[this.field7357.length];
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
					Matrix4x3 var8 = this.field7348[var1] = new Matrix4x3();
					if (var7 != 0) {
						var8.rotateAroundAxis(0.0F, 0.0F, 1.0F, Trig1.radians(var7));
					}
					if (var5 != 0) {
						var8.rotateAroundAxis(1.0F, 0.0F, 0.0F, Trig1.radians(var5));
					}
					if (var6 != 0) {
						var8.rotateAroundAxis(0.0F, 1.0F, 0.0F, Trig1.radians(var6));
					}
					var8.translate((float) var2, (float) var3, (float) var4);
				}
			}
			return this.field7348;
		}
	}

	@ObfuscatedName("vr.o(I)[I")
	public int[] method9293() {
		HashTable var1 = new HashTable(16);
		method6205(this.readyanim, var1);
		if (this.field7335 != null) {
			int[] var2 = this.field7335;
			for (int var3 = 0; var3 < var2.length; var3++) {
				int var4 = var2[var3];
				method6205(var4, var1);
			}
		}
		method6205(this.readyanim_l, var1);
		method6205(this.readyanim_r, var1);
		method6205(this.walkanim, var1);
		method6205(this.walkanim_b, var1);
		method6205(this.walkanim_l, var1);
		method6205(this.walkanim_r, var1);
		method6205(this.runanim, var1);
		method6205(this.runanim_b, var1);
		method6205(this.runanim_l, var1);
		method6205(this.runanim_r, var1);
		method6205(this.crawlanim, var1);
		method6205(this.crawlanim_b, var1);
		method6205(this.crawlanim_l, var1);
		method6205(this.crawlanim_r, var1);
		method6205(this.field7352, var1);
		method6205(this.field7337, var1);
		method6205(this.field7338, var1);
		method6205(this.field7339, var1);
		method6205(this.field7320, var1);
		method6205(this.field7341, var1);
		int[] var5 = new int[var1.size()];
		int var6 = 0;
		Iterator var7 = var1.iterator();
		while (var7.hasNext()) {
			Node var8 = (Node) var7.next();
			var5[var6++] = (int) var8.nodeId;
		}
		return var5;
	}

	@ObfuscatedName("oi.s(ILaan;I)V")
	public static final void method6205(int arg0, HashTable arg1) {
		if (arg0 != -1 && arg1.get((long) arg0) == null) {
			arg1.put(new Node(), (long) arg0);
		}
	}

	@ObfuscatedName("vr.z(IB)V")
	public void setId(int arg0) {
	}
}
