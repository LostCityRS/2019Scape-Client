package com.jagex;

import deob.ObfuscatedName;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

@ObfuscatedName("agt")
public final class class887 extends class234 {

	@ObfuscatedName("agt.k")
	public class889 field10363;

	@ObfuscatedName("agt.f")
	public boolean field10357;

	@ObfuscatedName("agt.w")
	public class1126 field10365;

	@ObfuscatedName("agt.l")
	public long field10367;

	@ObfuscatedName("agt.u")
	public long field10360;

	@ObfuscatedName("agt.z")
	public static final float[] field10361 = new float[16];

	@ObfuscatedName("agt.p")
	public byte[] field10362;

	@ObfuscatedName("agt.d")
	public byte[] field10358;

	@ObfuscatedName("agt.v")
	public final float[][] field10366;

	@ObfuscatedName("agt.o")
	public final boolean[] field10359;

	public class887(class1126 arg0, class889 arg1, class233 arg2) {
		this(arg0, arg2);
		this.field10365 = arg0;
		this.field10363 = arg1;
	}

	public class887(class1126 arg0, class233 arg1) {
		this.field10357 = false;
		this.field10366 = new float[2][];
		this.field10359 = new boolean[2];
		this.field2435 = arg1.field2432;
		if (arg1.field2428 != null) {
			this.field2434 = arg1.field2428;
			this.field10362 = arg0.method19009(this.field2434);
		}
		if (arg1.field2430 != null) {
			this.field2436 = arg1.field2430;
			this.field10358 = arg0.method19009(this.field2436);
		}
		arg0.method15985(this);
	}

	@ObfuscatedName("agt.n()Z")
	public boolean method4083() {
		if (this.field10357) {
			return true;
		}
		this.field10367 = this.field10362 == null ? 0L : IDirect3DDevice.CreateVertexShader(this.field10365.field11978, this.field10362);
		this.field10360 = this.field10358 == null ? 0L : IDirect3DDevice.CreatePixelShader(this.field10365.field11978, this.field10358);
		if (this.field10367 == 0L && this.field10360 == 0L) {
			return false;
		}
		int var1 = -1;
		for (int var2 = 0; var2 < this.field10363.method4158(); var2++) {
			if (this.field10363.method4159(var2) == this) {
				var1 = var2;
				break;
			}
		}
		int var3 = this.field10363.method4189();
		int var4 = this.field10363.method4190();
		for (int var5 = 0; var5 < var3; var5++) {
			class1150 var6 = this.field10363.method4160(var5);
			var6.method19245(var1);
		}
		for (int var7 = 0; var7 < var4; var7++) {
			class1150 var8 = this.field10363.method4187(var7);
			var8.method19245(var1);
		}
		int var9 = 0;
		int var10 = 0;
		int var11 = this.field10363.method4200(this);
		for (int var12 = 0; var12 < var3 + var4; var12++) {
			class1220 var13 = (class1220) (var12 < var3 ? this.field10363.method4160(var12) : this.field10363.method4187(var12 - var3));
			class236 var14 = var13.method19247();
			int var15 = 1;
			if (class236.field2441 == var14) {
				var14 = var13.method19248();
				var15 = var13.method19256();
			}
			switch(var14.field2512) {
				case 17:
				case 35:
				case 52:
				case 103:
					var15 *= 4;
				case 20:
				case 81:
				case 89:
				case 104:
				case 121:
					break;
				case 33:
				case 48:
				case 55:
				case 119:
					var15 *= 2;
					break;
				case 36:
				case 71:
				case 75:
				case 87:
					var15 *= 3;
					break;
				default:
					var15 = 0;
			}
			if (var13.field12532[var11] >= 0) {
				int var16 = var13.field12532[var11] + var15;
				if (var9 < var16) {
					var9 = var16;
				}
			}
			if (var13.field12534[var11] >= 0) {
				int var17 = var13.field12534[var11] + var15;
				if (var10 < var17) {
					var10 = var17;
				}
			}
		}
		this.field10366[0] = new float[var9 * 4];
		this.field10366[1] = new float[var10 * 4];
		this.field10357 = true;
		return true;
	}

	@ObfuscatedName("agt.k(Laql;F)V")
	public void method4084(class1150 arg0, float arg1) {
		int var3 = ((class1220) arg0).method19676();
		int var4 = ((class1220) arg0).method19677();
		if (arg0.method19247() != class236.field2525 && arg0.method19247() != class236.field2509) {
			throw new class1237(arg0, "");
		}
		if (var3 >= 0) {
			int var5 = var3 * 4;
			this.field10366[0][var5] = arg1;
			this.field10359[0] = true;
		}
		if (var4 >= 0) {
			int var6 = var4 * 4;
			this.field10366[1][var6] = arg1;
			this.field10359[1] = true;
		}
	}

	@ObfuscatedName("agt.f(Laql;FF)V")
	public void method4085(class1150 arg0, float arg1, float arg2) {
		int var4 = ((class1220) arg0).method19676();
		int var5 = ((class1220) arg0).method19677();
		if (arg0.method19247() != class236.field2495) {
			throw new class1237(arg0, "");
		}
		if (var4 >= 0) {
			int var6 = var4 * 4;
			this.field10366[0][var6] = arg1;
			this.field10366[0][var6 + 1] = arg2;
			this.field10359[0] = true;
		}
		if (var5 >= 0) {
			int var7 = var5 * 4;
			this.field10366[1][var7] = arg1;
			this.field10366[1][var7 + 1] = arg2;
			this.field10359[1] = true;
		}
	}

	@ObfuscatedName("agt.w(Laql;FFF)V")
	public void method4108(class1150 arg0, float arg1, float arg2, float arg3) {
		int var5 = ((class1220) arg0).method19676();
		int var6 = ((class1220) arg0).method19677();
		if (arg0.method19247() != class236.field2540) {
			throw new class1237(arg0, "");
		}
		if (var5 >= 0) {
			int var7 = var5 * 4;
			this.field10366[0][var7] = arg1;
			this.field10366[0][var7 + 1] = arg2;
			this.field10366[0][var7 + 2] = arg3;
			this.field10359[0] = true;
		}
		if (var6 < 0) {
			return;
		}
		int var8 = var6 * 4;
		this.field10366[1][var8] = arg1;
		this.field10366[1][var8 + 1] = arg2;
		this.field10366[1][var8 + 2] = arg3;
		this.field10359[1] = true;
	}

	@ObfuscatedName("agt.l(Laql;FFFF)V")
	public void method4087(class1150 arg0, float arg1, float arg2, float arg3, float arg4) {
		int var6 = ((class1220) arg0).method19676();
		int var7 = ((class1220) arg0).method19677();
		if (arg0.method19247() != class236.field2466) {
			throw new class1237(arg0, "");
		}
		if (var6 >= 0) {
			int var8 = var6 * 4;
			this.field10366[0][var8] = arg1;
			this.field10366[0][var8 + 1] = arg2;
			this.field10366[0][var8 + 2] = arg3;
			this.field10366[0][var8 + 3] = arg4;
			this.field10359[0] = true;
		}
		if (var7 < 0) {
			return;
		}
		int var9 = var7 * 4;
		this.field10366[1][var9] = arg1;
		this.field10366[1][var9 + 1] = arg2;
		this.field10366[1][var9 + 2] = arg3;
		this.field10366[1][var9 + 3] = arg4;
		this.field10359[1] = true;
	}

	@ObfuscatedName("agt.p(Laql;Lpq;)V")
	public void method4089(class1150 arg0, class426 arg1) {
		int var3 = ((class1220) arg0).method19676();
		int var4 = ((class1220) arg0).method19677();
		if (arg0.method19247() != class236.field2480) {
			throw new class1237(arg0, "");
		}
		if (var3 >= 0) {
			this.method16468(var3, arg1.method6637(field10361), 8);
		}
		if (var4 >= 0) {
			this.method16469(var4, arg1.method6637(field10361), 8);
		}
	}

	@ObfuscatedName("agt.d(Laql;Lpq;)V")
	public void method4101(class1150 arg0, class426 arg1) {
		int var3 = ((class1220) arg0).method19676();
		int var4 = ((class1220) arg0).method19677();
		if (arg0.method19247() != class236.field2482) {
			throw new class1237(arg0, "");
		}
		if (var3 >= 0) {
			this.method16468(var3, arg1.method6620(field10361), 16);
		}
		if (var4 >= 0) {
			this.method16469(var4, arg1.method6620(field10361), 16);
		}
	}

	@ObfuscatedName("agt.z(Laql;[FI)V")
	public void method4086(class1150 arg0, float[] arg1, int arg2) {
		int var4 = ((class1220) arg0).method19676();
		int var5 = ((class1220) arg0).method19677();
		if (arg0.method19247() != class236.field2441) {
			throw new class1237(arg0, "");
		}
		if (var4 >= 0) {
			this.method16468(var4, arg1, arg2);
		}
		if (var5 >= 0) {
			this.method16469(var5, arg1, arg2);
		}
	}

	@ObfuscatedName("agt.c(Laql;ILmq;)V")
	public void method4081(class1150 arg0, int arg1, class356 arg2) {
		this.field10365.method16038(arg1);
		this.field10365.method16092(arg2);
	}

	@ObfuscatedName("agt.r(IFFF)V")
	public void method4088(int arg0, float arg1, float arg2, float arg3) {
		int var5 = arg0 >> 16;
		int var6 = (arg0 & 0xFFFF) * 4;
		this.field10366[var5][var6] = arg1;
		this.field10366[var5][var6 + 1] = arg2;
		this.field10366[var5][var6 + 2] = arg3;
		this.field10359[var5] = true;
	}

	@ObfuscatedName("agt.v(IFFFF)V")
	public void method4123(int arg0, float arg1, float arg2, float arg3, float arg4) {
		int var6 = arg0 >> 16;
		int var7 = (arg0 & 0xFFFF) * 4;
		this.field10366[var6][var7] = arg1;
		this.field10366[var6][var7 + 1] = arg2;
		this.field10366[var6][var7 + 2] = arg3;
		this.field10366[var6][var7 + 3] = arg4;
		this.field10359[var6] = true;
	}

	@ObfuscatedName("agt.s(ILpq;)V")
	public void method4094(int arg0, class426 arg1) {
		int var3 = arg0 >> 16;
		int var4 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method6620(field10361), 0, this.field10366[var3], var4, 12);
		this.field10359[var3] = true;
	}

	@ObfuscatedName("agt.y(ILpq;)V")
	public void method4095(int arg0, class426 arg1) {
		int var3 = arg0 >> 16;
		int var4 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method6637(field10361), 0, this.field10366[var3], var4, 8);
		this.field10359[var3] = true;
	}

	@ObfuscatedName("agt.q(ILpq;)V")
	public void method4096(int arg0, class426 arg1) {
		int var3 = arg0 >> 16;
		int var4 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method6620(field10361), 0, this.field10366[var3], var4, 16);
		this.field10359[var3] = true;
	}

	@ObfuscatedName("agt.o(I[FI)V")
	public void method4093(int arg0, float[] arg1, int arg2) {
		int var4 = arg0 >> 16;
		int var5 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1, 0, this.field10366[var4], var5, arg2);
		this.field10359[var4] = true;
	}

	@ObfuscatedName("agt.af(I[FI)V")
	public final void method16468(int arg0, float[] arg1, int arg2) {
		class701.method14023(arg1, 0, this.field10366[0], arg0 * 4, arg2);
		this.field10359[0] = true;
	}

	@ObfuscatedName("agt.ak(I[FI)V")
	public final void method16469(int arg0, float[] arg1, int arg2) {
		class701.method14023(arg1, 0, this.field10366[1], arg0 * 4, arg2);
		this.field10359[1] = true;
	}

	@ObfuscatedName("agt.x(IILmq;)V")
	public void method4097(int arg0, int arg1, class356 arg2) {
		this.field10365.method16038(arg1);
		this.field10365.method16092(arg2);
	}

	@ObfuscatedName("agt.an()V")
	public void method16476() {
		if (this.field10359[0]) {
			this.field10365.field10071.clear();
			this.field10365.field10071.asFloatBuffer().put(this.field10366[0]);
			IDirect3DDevice.SetVertexShaderConstantF(this.field10365.field11978, 0, this.field10365.field10046, this.field10366[0].length / 4);
			this.field10359[0] = false;
		}
		if (this.field10359[1]) {
			this.field10365.field10071.clear();
			this.field10365.field10071.asFloatBuffer().put(this.field10366[1]);
			IDirect3DDevice.SetPixelShaderConstantF(this.field10365.field11978, 0, this.field10365.field10046, this.field10366[1].length / 4);
			this.field10359[1] = false;
		}
	}

	@ObfuscatedName("agt.m()V")
	public void method1010() {
		if (this.field10367 != 0L) {
			IUnknown.Release(this.field10367);
			this.field10367 = 0L;
		}
		if (this.field10360 != 0L) {
			IUnknown.Release(this.field10360);
			this.field10360 = 0L;
		}
		this.field10365.method16198(this);
	}

	@ObfuscatedName("agt.bf()V")
	public void method16466() {
		if (this.field10367 != 0L) {
			this.field10365.method19023(this.field10367);
			this.field10367 = 0L;
		}
		if (this.field10360 != 0L) {
			this.field10365.method19023(this.field10360);
			this.field10360 = 0L;
		}
	}

	public void finalize() {
		this.method16466();
	}
}
