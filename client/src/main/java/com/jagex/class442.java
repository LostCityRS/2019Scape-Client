package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("py")
public final class class442 {

	@ObfuscatedName("py.e")
	public class439 field4416 = null;

	@ObfuscatedName("py.n")
	public Object[] field4418;

	@ObfuscatedName("py.m")
	public Object[][] field4410;

	@ObfuscatedName("py.k")
	public static class804 field4409 = new class804();

	@ObfuscatedName("py.f")
	public boolean field4412;

	@ObfuscatedName("py.z")
	public int field4415;

	@ObfuscatedName("py.p")
	public class440 field4417;

	@ObfuscatedName("py.d")
	public static boolean field4411 = false;

	@ObfuscatedName("py.c")
	public static int field4419 = 0;

	public class442(class440 arg0, boolean arg1, int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("");
		}
		this.field4417 = arg0;
		this.field4412 = arg1;
		this.field4415 = arg2;
	}

	@ObfuscatedName("py.e(B)Z")
	public synchronized boolean method6946() {
		if (this.field4416 == null) {
			this.field4416 = this.field4417.method6853();
			if (this.field4416 == null) {
				return false;
			}
			this.field4418 = new Object[this.field4416.field4392];
			this.field4410 = new Object[this.field4416.field4392][];
		}
		return true;
	}

	@ObfuscatedName("py.n(S)I")
	public int method6881() {
		if (!this.method6946()) {
			throw new IllegalStateException("");
		}
		return this.field4416.field4385;
	}

	@ObfuscatedName("py.m(IB)Z")
	public synchronized boolean method6882(int arg0) {
		if (!this.method6946()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.field4416.field4403.length && this.field4416.field4403[arg0] != 0) {
			return true;
		} else if (field4411) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@ObfuscatedName("py.k(IIB)Z")
	public synchronized boolean method6883(int arg0, int arg1) {
		if (!this.method6946()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.field4416.field4403.length && arg1 < this.field4416.field4403[arg0]) {
			return true;
		} else if (field4411) {
			throw new IllegalArgumentException(arg0 + " " + arg1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("py.f(II)V")
	public synchronized void method6957(int arg0) {
		if (this.field4412) {
			this.field4418[arg0] = this.field4417.method6854(arg0);
		} else {
			this.field4418[arg0] = class703.method2821(this.field4417.method6854(arg0), false);
		}
	}

	@ObfuscatedName("py.w(II)V")
	public void method6885(int arg0) {
		this.field4417.method6856(arg0);
	}

	@ObfuscatedName("py.l(IIB)[B")
	public byte[] method6879(int arg0, int arg1) {
		return this.method6914(arg0, arg1, null);
	}

	@ObfuscatedName("py.u(II[IB)[B")
	public synchronized byte[] method6914(int arg0, int arg1, int[] arg2) {
		if (!this.method6883(arg0, arg1)) {
			return null;
		}
		byte[] var4 = null;
		if (this.field4410[arg0] == null || this.field4410[arg0][arg1] == null) {
			boolean var5 = this.method6901(arg0, arg1, arg2);
			if (!var5) {
				this.method6957(arg0);
				boolean var6 = this.method6901(arg0, arg1, arg2);
				if (!var6) {
					return null;
				}
			}
		}
		if (this.field4410[arg0] == null) {
			throw new RuntimeException("");
		}
		if (this.field4410[arg0][arg1] != null) {
			var4 = class703.method4540(this.field4410[arg0][arg1], false);
			if (var4 == null) {
				throw new RuntimeException("");
			}
		}
		if (var4 != null) {
			if (this.field4415 == 1) {
				this.field4410[arg0][arg1] = null;
				if (this.field4416.field4403[arg0] == 1) {
					this.field4410[arg0] = null;
				}
			} else if (this.field4415 == 2) {
				this.field4410[arg0] = null;
			}
		}
		return var4;
	}

	@ObfuscatedName("py.z(III)Z")
	public synchronized boolean method6888(int arg0, int arg1) {
		if (!this.method6883(arg0, arg1)) {
			return false;
		} else if (this.field4410[arg0] != null && this.field4410[arg0][arg1] != null) {
			return true;
		} else if (this.field4418[arg0] == null) {
			this.method6957(arg0);
			return this.field4418[arg0] != null;
		} else {
			return true;
		}
	}

	@ObfuscatedName("py.p(II)Z")
	public synchronized boolean method6889(int arg0) {
		if (!this.method6946()) {
			return false;
		} else if (this.field4416.field4403.length == 1) {
			return this.method6888(0, arg0);
		} else if (!this.method6882(arg0)) {
			return false;
		} else if (this.field4416.field4403[arg0] == 1) {
			return this.method6888(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("py.d(II)Z")
	public synchronized boolean method6927(int arg0) {
		if (!this.method6882(arg0)) {
			return false;
		} else if (this.field4418[arg0] == null) {
			this.method6957(arg0);
			return this.field4418[arg0] != null;
		} else {
			return true;
		}
	}

	@ObfuscatedName("py.c(I)Z")
	public synchronized boolean method6896() {
		if (!this.method6946()) {
			return false;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < this.field4416.field4394.length; var2++) {
			int var3 = this.field4416.field4394[var2];
			if (this.field4418[var3] == null) {
				this.method6957(var3);
				if (this.field4418[var3] == null) {
					var1 = false;
				}
			}
		}
		return var1;
	}

	@ObfuscatedName("py.r(II)I")
	public synchronized int method6892(int arg0) {
		if (this.method6882(arg0)) {
			return this.field4418[arg0] == null ? this.field4417.method6855(arg0) : 100;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("py.v(I)I")
	public synchronized int method6893() {
		if (!this.method6946()) {
			return 0;
		}
		int var1 = 0;
		int var2 = 0;
		for (int var3 = 0; var3 < this.field4418.length; var3++) {
			if (this.field4416.field4399[var3] > 0) {
				var1 += 100;
				var2 += this.method6892(var3);
			}
		}
		if (var1 == 0) {
			return 100;
		} else {
			return var2 * 100 / var1;
		}
	}

	@ObfuscatedName("py.o(IB)[B")
	public synchronized byte[] method6894(int arg0) {
		if (!this.method6946()) {
			return null;
		} else if (this.field4416.field4403.length == 1) {
			return this.method6879(0, arg0);
		} else if (!this.method6882(arg0)) {
			return null;
		} else if (this.field4416.field4403[arg0] == 1) {
			return this.method6879(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("py.s(IB)[I")
	public synchronized int[] method6895(int arg0) {
		if (!this.method6882(arg0)) {
			return null;
		}
		int[] var2 = this.field4416.field4386[arg0];
		if (var2 == null) {
			var2 = new int[this.field4416.field4399[arg0]];
			int var3 = 0;
			while (var3 < var2.length) {
				var2[var3] = var3++;
			}
		}
		return var2;
	}

	@ObfuscatedName("py.y(II)Z")
	public boolean method6929(int arg0) {
		if (!this.method6946()) {
			return false;
		} else if (this.field4416.field4403.length == 1) {
			return this.method6883(0, arg0);
		} else if (!this.method6882(arg0)) {
			return false;
		} else if (this.field4416.field4403[arg0] == 1) {
			return this.method6883(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("py.q(II)I")
	public int method6897(int arg0) {
		return this.method6882(arg0) ? this.field4416.field4403[arg0] : 0;
	}

	@ObfuscatedName("py.x(B)I")
	public int method6898() {
		return this.method6946() ? this.field4416.field4403.length : -1;
	}

	@ObfuscatedName("py.b(II)V")
	public synchronized void method6899(int arg0) {
		if (this.method6882(arg0) && this.field4410 != null) {
			this.field4410[arg0] = null;
		}
	}

	@ObfuscatedName("py.h(ZZB)V")
	public void method6900(boolean arg0, boolean arg1) {
		if (!this.method6946()) {
			return;
		}
		if (arg0) {
			this.field4416.field4390 = null;
			this.field4416.field4391 = null;
		}
		if (arg1) {
			this.field4416.field4401 = null;
			this.field4416.field4402 = null;
		}
	}

	@ObfuscatedName("py.a(II[IB)Z")
	public synchronized boolean method6901(int arg0, int arg1, int[] arg2) {
		if (!this.method6882(arg0)) {
			return false;
		} else if (this.field4418[arg0] == null) {
			return false;
		} else {
			int var4 = this.field4416.field4399[arg0];
			int[] var5 = this.field4416.field4386[arg0];
			if (this.field4410[arg0] == null) {
				this.field4410[arg0] = new Object[this.field4416.field4403[arg0]];
			}
			Object[] var6 = this.field4410[arg0];
			boolean var7 = true;
			for (int var8 = 0; var8 < var4; var8++) {
				int var9;
				if (var5 == null) {
					var9 = var8;
				} else {
					var9 = var5[var8];
				}
				if (var6[var9] == null) {
					var7 = false;
					break;
				}
			}
			if (var7) {
				return true;
			}
			byte[] var10;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				var10 = class703.method4540(this.field4418[arg0], false);
			} else {
				var10 = class703.method4540(this.field4418[arg0], true);
				Packet var11 = new Packet(var10);
				int var12 = var11.g1();
				int var13 = var11.g4s();
				int var14 = (var12 == class445.field4434.getId() ? 5 : 9) + var13;
				var11.tinydec(arg2, 5, var14);
			}
			byte[] var15;
			try {
				var15 = Statics.method7275(var10);
			} catch (RuntimeException var51) {
				throw Statics.method19636(var51, (arg2 != null) + " " + arg0 + " " + var10.length + " " + Packet.getcrc(var10, var10.length) + " " + Packet.getcrc(var10, var10.length - 2) + " " + this.field4416.field4393[arg0] + " " + this.field4416.field4385);
			}
			if (this.field4412) {
				this.field4418[arg0] = null;
			}
			if (var4 <= 1) {
				int var50;
				if (var5 == null) {
					var50 = 0;
				} else {
					var50 = var5[0];
				}
				if (this.field4415 == 0) {
					var6[var50] = class703.method2821(var15, false);
				} else {
					var6[var50] = var15;
				}
			} else if (this.field4415 == 2) {
				int var33 = var15.length;
				int var53 = var33 - 1;
				int var34 = var15[var53] & 0xFF;
				int var35 = var53 - var4 * var34 * 4;
				Packet var36 = new Packet(var15);
				int var37 = 0;
				int var38 = 0;
				var36.pos = var35;
				for (int var39 = 0; var39 < var34; var39++) {
					int var40 = 0;
					for (int var41 = 0; var41 < var4; var41++) {
						var40 += var36.g4s();
						int var42;
						if (var5 == null) {
							var42 = var41;
						} else {
							var42 = var5[var41];
						}
						if (arg1 == var42) {
							var37 += var40;
							var38 = var42;
						}
					}
				}
				if (var37 == 0) {
					return true;
				}
				byte[] var43 = new byte[var37];
				int var44 = 0;
				var36.pos = var35;
				int var45 = 0;
				for (int var46 = 0; var46 < var34; var46++) {
					int var47 = 0;
					for (int var48 = 0; var48 < var4; var48++) {
						var47 += var36.g4s();
						int var49;
						if (var5 == null) {
							var49 = var48;
						} else {
							var49 = var5[var48];
						}
						if (arg1 == var49) {
							System.arraycopy(var15, var45, var43, var44, var47);
							var44 += var47;
						}
						var45 += var47;
					}
				}
				var6[var38] = var43;
			} else {
				int var17 = var15.length;
				int var52 = var17 - 1;
				int var18 = var15[var52] & 0xFF;
				int var19 = var52 - var4 * var18 * 4;
				Packet var20 = new Packet(var15);
				int[] var21 = new int[var4];
				var20.pos = var19;
				for (int var22 = 0; var22 < var18; var22++) {
					int var23 = 0;
					for (int var24 = 0; var24 < var4; var24++) {
						var23 += var20.g4s();
						var21[var24] += var23;
					}
				}
				byte[][] var25 = new byte[var4][];
				for (int var26 = 0; var26 < var4; var26++) {
					var25[var26] = new byte[var21[var26]];
					var21[var26] = 0;
				}
				var20.pos = var19;
				int var27 = 0;
				for (int var28 = 0; var28 < var18; var28++) {
					int var29 = 0;
					for (int var30 = 0; var30 < var4; var30++) {
						var29 += var20.g4s();
						System.arraycopy(var15, var27, var25[var30], var21[var30], var29);
						var21[var30] += var29;
						var27 += var29;
					}
				}
				for (int var31 = 0; var31 < var4; var31++) {
					int var32;
					if (var5 == null) {
						var32 = var31;
					} else {
						var32 = var5[var31];
					}
					if (this.field4415 == 0) {
						var6[var32] = class703.method2821(var25[var31], false);
					} else {
						var6[var32] = var25[var31];
					}
				}
			}
			return true;
		}
	}

	@ObfuscatedName("py.g(Ljava/lang/String;I)I")
	public int method6902(String arg0) {
		if (this.method6946()) {
			String var2 = arg0.toLowerCase();
			int var3 = this.field4416.field4391.method4486(class695.method3475(var2));
			return this.method6882(var3) ? var3 : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("py.i(IS)I")
	public int method6903(int arg0) {
		if (this.method6946()) {
			int var2 = this.field4416.field4391.method4486(arg0);
			return this.method6882(var2) ? var2 : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("py.j(Ljava/lang/String;B)Z")
	public boolean method6904(String arg0) {
		if (this.method6946()) {
			String var2 = arg0.toLowerCase();
			int var3 = this.field4416.field4391.method4486(class695.method3475(var2));
			return var3 >= 0;
		} else {
			return false;
		}
	}

	@ObfuscatedName("py.t(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method6905(String arg0, String arg1) {
		if (!this.method6946()) {
			return false;
		}
		String var3 = arg0.toLowerCase();
		String var4 = arg1.toLowerCase();
		int var5 = this.field4416.field4391.method4486(class695.method3475(var3));
		if (var5 < 0) {
			return false;
		} else {
			int var6 = this.field4416.field4402[var5].method4486(class695.method3475(var4));
			return var6 >= 0;
		}
	}

	@ObfuscatedName("py.ae(Ljava/lang/String;Ljava/lang/String;I)[B")
	public synchronized byte[] method6906(String arg0, String arg1) {
		if (!this.method6946()) {
			return null;
		}
		String var3 = arg0.toLowerCase();
		String var4 = arg1.toLowerCase();
		int var5 = this.field4416.field4391.method4486(class695.method3475(var3));
		if (this.method6882(var5)) {
			int var6 = this.field4416.field4402[var5].method4486(class695.method3475(var4));
			return this.method6879(var5, var6);
		} else {
			return null;
		}
	}

	@ObfuscatedName("py.ag(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method6938(String arg0, String arg1) {
		if (!this.method6946()) {
			return false;
		}
		String var3 = arg0.toLowerCase();
		String var4 = arg1.toLowerCase();
		int var5 = this.field4416.field4391.method4486(class695.method3475(var3));
		if (this.method6882(var5)) {
			int var6 = this.field4416.field4402[var5].method4486(class695.method3475(var4));
			return this.method6888(var5, var6);
		} else {
			return false;
		}
	}

	@ObfuscatedName("py.ah(Ljava/lang/String;I)Z")
	public boolean method6908(String arg0) {
		int var2 = this.method6902("");
		return var2 == -1 ? this.method6938(arg0, "") : this.method6938("", arg0);
	}

	@ObfuscatedName("py.al(Ljava/lang/String;I)Z")
	public boolean method6886(String arg0) {
		if (this.method6946()) {
			String var2 = arg0.toLowerCase();
			int var3 = this.field4416.field4391.method4486(class695.method3475(var2));
			return this.method6927(var3);
		} else {
			return false;
		}
	}

	@ObfuscatedName("py.ac(Ljava/lang/String;I)I")
	public int method6880(String arg0) {
		if (this.method6946()) {
			String var2 = arg0.toLowerCase();
			int var3 = this.field4416.field4391.method4486(class695.method3475(var2));
			return this.method6892(var3);
		} else {
			return 0;
		}
	}
}
