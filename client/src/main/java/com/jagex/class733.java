package com.jagex;

import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("aac")
public class class733 {

	@ObfuscatedName("aac.e")
	public byte[] field8564;

	@ObfuscatedName("aac.n")
	public byte[] field8574;

	@ObfuscatedName("aac.m")
	public byte[][] field8563;

	@ObfuscatedName("aac.k")
	public byte[] field8565;

	@ObfuscatedName("aac.f")
	public int field8566;

	@ObfuscatedName("aac.w")
	public int field8562;

	@ObfuscatedName("aac.l")
	public int field8569;

	@ObfuscatedName("aac.u")
	public int field8568;

	@ObfuscatedName("aac.z")
	public int field8567;

	@ObfuscatedName("aac.p")
	public int field8570;

	@ObfuscatedName("aac.d")
	public int field8571;

	@ObfuscatedName("aac.c")
	public int field8572;

	@ObfuscatedName("aac.r")
	public short[][] field8573;

	@ObfuscatedName("aac.v")
	public static String[] field8561 = new String[100];

	@ObfuscatedName("aac.o")
	public final class731 field8575;

	@ObfuscatedName("cz.e(Lpy;III)Laac;")
	public static class733 method1593(class442 arg0, int arg1, int arg2) {
		return method6068(arg0, arg1, arg2, null);
	}

	@ObfuscatedName("nr.n(Lpy;IILaaw;I)Laac;")
	public static class733 method6068(class442 arg0, int arg1, int arg2, class731 arg3) {
		byte[] var4 = arg0.method6879(arg1, arg2);
		return var4 == null ? null : new class733(var4, arg3);
	}

	@ObfuscatedName("yr.m(Lpy;ILaaw;I)Laac;")
	public static class733 method10677(class442 arg0, int arg1, class731 arg2) {
		byte[] var3 = arg0.method6894(arg1);
		return var3 == null ? null : new class733(var3, arg2);
	}

	public class733(byte[] arg0, class731 arg1) {
		this.field8575 = arg1;
		Packet var3 = new Packet(arg0);
		int var4 = var3.g1();
		if (var4 != 0) {
			throw new RuntimeException("");
		}
		boolean var5 = var3.g1() == 1;
		this.field8574 = new byte[256];
		var3.gdata(this.field8574, 0, 256);
		this.field8564 = new byte[256];
		var3.gdata(this.field8564, 0, 256);
		this.field8565 = new byte[256];
		var3.gdata(this.field8565, 0, 256);
		this.field8573 = new short[256][4];
		this.field8571 = var3.g2();
		this.field8572 = var3.g2();
		for (int var6 = 0; var6 < 256; var6++) {
			this.field8573[var6][0] = (short) var3.g2();
		}
		for (int var7 = 0; var7 < 256; var7++) {
			this.field8573[var7][1] = (short) var3.g2();
		}
		for (int var8 = 0; var8 < 256; var8++) {
			this.field8573[var8][2] = this.field8574[var8];
			this.field8573[var8][3] = this.field8564[var8];
		}
		if (var5) {
			byte[][] var9 = new byte[256][];
			for (int var10 = 0; var10 < 256; var10++) {
				var9[var10] = new byte[this.field8564[var10]];
				byte var11 = 0;
				for (int var12 = 0; var12 < var9[var10].length; var12++) {
					var11 += var3.g1b();
					var9[var10][var12] = var11;
				}
			}
			byte[][] var13 = new byte[256][];
			for (int var14 = 0; var14 < 256; var14++) {
				var13[var14] = new byte[this.field8564[var14]];
				byte var15 = 0;
				for (int var16 = 0; var16 < var13[var14].length; var16++) {
					var15 += var3.g1b();
					var13[var14][var16] = var15;
				}
			}
			this.field8563 = new byte[256][256];
			for (int var17 = 0; var17 < 256; var17++) {
				if (var17 != 32 && var17 != 160) {
					for (int var18 = 0; var18 < 256; var18++) {
						if (var18 != 32 && var18 != 160) {
							this.field8563[var17][var18] = (byte) method9852(var9, var13, this.field8565, this.field8574, this.field8564, var17, var18);
						}
					}
				}
			}
			this.field8566 = this.field8565[32] + this.field8564[32];
		} else {
			this.field8566 = var3.g1();
		}
		this.field8568 = var3.g1();
		this.field8567 = var3.g1();
		this.field8562 = var3.g1();
		this.field8569 = var3.g1();
		this.field8570 = var3.g1();
		if (this.field8570 != 1) {
			this.field8566 /= this.field8570;
			this.field8568 /= this.field8570;
			this.field8567 /= this.field8570;
			this.field8562 /= this.field8570;
			this.field8569 /= this.field8570;
			for (int var19 = 0; var19 < 256; var19++) {
				this.field8574[var19] = (byte) (this.field8574[var19] / this.field8570);
				this.field8564[var19] = (byte) (this.field8564[var19] / this.field8570);
				this.field8565[var19] = (byte) (this.field8565[var19] / this.field8570);
			}
			if (var5) {
				for (int var20 = 0; var20 < 256; var20++) {
					for (int var21 = 0; var21 < 256; var21++) {
						this.field8563[var20][var21] = (byte) (this.field8563[var20][var21] / this.field8570);
					}
				}
			}
		}
	}

	@ObfuscatedName("wx.k([[B[[B[B[B[BIIB)I")
	public static int method9852(byte[][] arg0, byte[][] arg1, byte[] arg2, byte[] arg3, byte[] arg4, int arg5, int arg6) {
		byte var7 = arg2[arg5];
		int var8 = arg4[arg5] + var7;
		byte var9 = arg2[arg6];
		int var10 = arg4[arg6] + var9;
		byte var11 = var7;
		if (var9 > var7) {
			var11 = var9;
		}
		int var12 = var8;
		if (var10 < var8) {
			var12 = var10;
		}
		int var13 = arg3[arg5] & 0xFF;
		if ((arg3[arg6] & 0xFF) < var13) {
			var13 = arg3[arg6] & 0xFF;
		}
		byte[] var14 = arg1[arg5];
		byte[] var15 = arg0[arg6];
		int var16 = var11 - var7;
		int var17 = var11 - var9;
		for (int var18 = var11; var18 < var12; var18++) {
			int var19 = var14[var16++] + var15[var17++];
			if (var19 < var13) {
				var13 = var19;
			}
		}
		return -var13;
	}

	@ObfuscatedName("aac.f(ICB)I")
	public int method14537(int arg0, char arg1) {
		return this.field8563 == null ? 0 : this.field8563[arg0][arg1];
	}

	@ObfuscatedName("aac.w(IB)I")
	public int method14558(int arg0) {
		return this.field8574[arg0] & 0xFF;
	}

	@ObfuscatedName("aac.l(II)I")
	public int method14529(int arg0) {
		return this.field8564[arg0] & 0xFF;
	}

	@ObfuscatedName("aac.u(IB)I")
	public int method14560(int arg0) {
		return this.field8565[arg0] & 0xFF;
	}

	@ObfuscatedName("aac.z(II)[S")
	public short[] method14561(int arg0) {
		return this.field8573[arg0];
	}

	@ObfuscatedName("aac.p(Ljava/lang/String;I)I")
	public int method14532(String arg0) {
		return this.method14533(arg0, null);
	}

	@ObfuscatedName("aac.d(Ljava/lang/String;[Laay;B)I")
	public int method14533(String arg0, class732[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		int var3 = -1;
		int var4 = -1;
		int var5 = 0;
		int var6 = arg0.length();
		for (int var7 = 0; var7 < var6; var7++) {
			char var8 = arg0.charAt(var7);
			if (var8 == '<') {
				var3 = var7;
			} else {
				if (var8 == '>' && var3 != -1) {
					String var9 = arg0.substring(var3 + 1, var7);
					var3 = -1;
					if (var9.equals("lt")) {
						var8 = '<';
					} else if (var9.equals("gt")) {
						var8 = '>';
					} else if (var9.equals("nbsp")) {
						var8 = 160;
					} else if (var9.equals("shy")) {
						var8 = 173;
					} else if (var9.equals("times")) {
						var8 = 215;
					} else if (var9.equals("euro")) {
						var8 = 128;
					} else if (var9.equals("copy")) {
						var8 = 169;
					} else {
						if (!var9.equals("reg")) {
							if (var9.startsWith("img=") && arg1 != null) {
								try {
									int var10 = class695.method9595(var9.substring(4));
									var5 += arg1[var10].method1434();
									var4 = -1;
								} catch (Exception var17) {
								}
								continue;
							}
							if (var9.startsWith("sprite=") && this.field8575 != null) {
								try {
									boolean var12 = true;
									int var13 = var9.indexOf(44);
									int var14;
									if (var13 == -1) {
										var14 = class695.method9595(var9.substring(7));
									} else {
										var14 = class695.method9595(var9.substring(7, var13));
									}
									var5 += this.field8575.method6160(var14);
									var4 = -1;
								} catch (Exception var16) {
								}
							}
							continue;
						}
						var8 = 174;
					}
				}
				if (var3 == -1) {
					var5 += this.field8574[class693.method16904(var8) & 0xFF] & 0xFF;
					if (this.field8563 != null && var4 != -1) {
						var5 += this.field8563[var4][var8];
					}
					var4 = var8;
				}
			}
		}
		return var5;
	}

	@ObfuscatedName("aac.c(Ljava/lang/String;I[Laay;I)Ljava/lang/String;")
	public String method14534(String arg0, int arg1, class732[] arg2) {
		if (this.method14533(arg0, arg2) <= arg1) {
			return arg0;
		}
		int var4 = arg1 - this.method14533("...", null);
		int var5 = -1;
		int var6 = -1;
		int var7 = 0;
		int var8 = arg0.length();
		String var9 = "";
		for (int var10 = 0; var10 < var8; var10++) {
			char var11 = arg0.charAt(var10);
			if (var11 == '<') {
				var5 = var10;
			} else {
				if (var11 == '>' && var5 != -1) {
					String var12 = arg0.substring(var5 + 1, var10);
					var5 = -1;
					if (var12.equals("lt")) {
						var11 = '<';
					} else if (var12.equals("gt")) {
						var11 = '>';
					} else if (var12.equals("nbsp")) {
						var11 = 160;
					} else if (var12.equals("shy")) {
						var11 = 173;
					} else if (var12.equals("times")) {
						var11 = 215;
					} else if (var12.equals("euro")) {
						var11 = 128;
					} else if (var12.equals("copy")) {
						var11 = 169;
					} else {
						if (!var12.equals("reg")) {
							if (var12.startsWith("img=") && arg2 != null) {
								try {
									int var13 = class695.method9595(var12.substring(4));
									var7 += arg2[var13].method1434();
									var6 = -1;
									if (var7 > var4) {
										return var9 + "...";
									}
									var9 = arg0.substring(0, var10 + 1);
								} catch (Exception var21) {
								}
								continue;
							}
							if (var12.startsWith("sprite=") && this.field8575 != null) {
								try {
									boolean var15 = true;
									int var16 = var12.indexOf(44);
									int var17;
									if (var16 == -1) {
										var17 = class695.method9595(var12.substring(7));
									} else {
										var17 = class695.method9595(var12.substring(7, var16));
									}
									var7 += this.field8575.method6160(var17);
									var6 = -1;
									if (var7 > var4) {
										return var9 + "...";
									}
									var9 = arg0.substring(0, var10 + 1);
								} catch (Exception var20) {
								}
							}
							continue;
						}
						var11 = 174;
					}
				}
				if (var5 == -1) {
					var7 += this.field8574[class693.method16904(var11) & 0xFF] & 0xFF;
					if (this.field8563 != null && var6 != -1) {
						var7 += this.field8563[var6][var11];
					}
					var6 = var11;
					int var19 = var7;
					if (this.field8563 != null) {
						var19 = this.field8563[var11][46] + var7;
					}
					if (var19 > var4) {
						return var9 + "...";
					}
					var9 = arg0.substring(0, var10 + 1);
				}
			}
		}
		return arg0;
	}

	@ObfuscatedName("aac.r(Ljava/lang/String;[I[Ljava/lang/String;[Laay;B)I")
	public int method14535(String arg0, int[] arg1, String[] arg2, class732[] arg3) {
		return this.method14536(arg0, arg1, arg2, arg3, true);
	}

	@ObfuscatedName("aac.v(Ljava/lang/String;[I[Ljava/lang/String;[Laay;ZI)I")
	public int method14536(String arg0, int[] arg1, String[] arg2, class732[] arg3, boolean arg4) {
		if (arg0 == null) {
			return 0;
		}
		int var6 = 0;
		int var7 = 0;
		int var8 = -1;
		int var9 = 0;
		int var10 = 0;
		int var11 = -1;
		int var12 = -1;
		int var13 = 0;
		int var14 = arg0.length();
		for (int var15 = 0; var15 < var14; var15++) {
			int var16 = class693.method16904(arg0.charAt(var15)) & 0xFF;
			int var17 = 0;
			if (var16 == 60) {
				var11 = var15;
			} else {
				int var18;
				if (var11 == -1) {
					var18 = var15;
					var17 += this.method14558(var16);
					if (this.field8563 != null && var12 != -1) {
						var17 += this.field8563[var12][var16];
					}
					var12 = var16;
				} else {
					if (var16 != 62) {
						continue;
					}
					var18 = var11;
					String var19 = arg0.substring(var11 + 1, var15);
					var11 = -1;
					if (var19.equals("br")) {
						arg2[var13] = arg0.substring(var7, var15 + 1);
						var13++;
						if (var13 >= arg2.length) {
							return 0;
						}
						var7 = var15 + 1;
						var6 = 0;
						var8 = -1;
						var12 = -1;
						continue;
					}
					if (var19.equals("lt")) {
						var17 += this.method14558(60);
						if (this.field8563 != null && var12 != -1) {
							var17 += this.field8563[var12][60];
						}
						var12 = 60;
					} else if (var19.equals("gt")) {
						var17 += this.method14558(62);
						if (this.field8563 != null && var12 != -1) {
							var17 += this.field8563[var12][62];
						}
						var12 = 62;
					} else if (var19.equals("nbsp")) {
						var17 += this.method14558(160);
						if (this.field8563 != null && var12 != -1) {
							var17 += this.field8563[var12][160];
						}
						var12 = 160;
					} else if (var19.equals("shy")) {
						var17 += this.method14558(173);
						if (this.field8563 != null && var12 != -1) {
							var17 += this.field8563[var12][173];
						}
						var12 = 173;
					} else if (var19.equals("times")) {
						var17 += this.method14558(215);
						if (this.field8563 != null && var12 != -1) {
							var17 += this.field8563[var12][215];
						}
						var12 = 215;
					} else if (var19.equals("euro")) {
						var17 += this.method14558(128);
						if (this.field8563 != null && var12 != -1) {
							var17 += this.field8563[var12][128];
						}
						var12 = 128;
					} else if (var19.equals("copy")) {
						var17 += this.method14558(169);
						if (this.field8563 != null && var12 != -1) {
							var17 += this.field8563[var12][169];
						}
						var12 = 169;
					} else if (var19.equals("reg")) {
						var17 += this.method14558(174);
						if (this.field8563 != null && var12 != -1) {
							var17 += this.field8563[var12][174];
						}
						var12 = 174;
					} else if (var19.startsWith("img=") && arg3 != null) {
						try {
							int var20 = class695.method9595(var19.substring(4));
							var17 += arg3[var20].method1434();
							var12 = -1;
						} catch (Exception var27) {
						}
					} else if (var19.startsWith("sprite=") && this.field8575 != null) {
						try {
							boolean var22 = true;
							int var23 = var19.indexOf(44);
							int var24;
							if (var23 == -1) {
								var24 = class695.method9595(var19.substring(7));
							} else {
								var24 = class695.method9595(var19.substring(7, var23));
							}
							int var10000 = var17 + this.field8575.method6160(var24);
							var12 = -1;
						} catch (Exception var28) {
						}
						continue;
					}
					var16 = -1;
				}
				if (var17 > 0) {
					var6 += var17;
					if (arg1 != null) {
						if (var16 == 32) {
							var8 = var15;
							var9 = var6;
							var10 = arg4 ? 1 : 0;
						}
						if (var6 > arg1[var13 < arg1.length ? var13 : arg1.length - 1]) {
							if (var8 >= 0) {
								arg2[var13] = arg0.substring(var7, var8 + 1 - var10);
								var13++;
								if (var13 >= arg2.length) {
									return 0;
								}
								var7 = var8 + 1;
								var8 = -1;
								var6 -= var9;
								var12 = -1;
							} else {
								arg2[var13] = arg0.substring(var7, var18);
								var13++;
								if (var13 >= arg2.length) {
									return 0;
								}
								var7 = var18;
								var8 = -1;
								var6 = var17;
								var12 = -1;
							}
						}
						if (var16 == 45) {
							var8 = var15;
							var9 = var6;
							var10 = 0;
						}
					}
				}
			}
		}
		if (arg0.length() > var7) {
			arg2[var13] = arg0.substring(var7, arg0.length());
			var13++;
		}
		return var13;
	}

	@ObfuscatedName("aac.o(Ljava/lang/String;I[Laay;I)I")
	public int method14551(String arg0, int arg1, class732[] arg2) {
		int var4 = this.method14535(arg0, new int[] { arg1 }, field8561, arg2);
		int var5 = 0;
		for (int var6 = 0; var6 < var4; var6++) {
			int var7 = this.method14533(field8561[var6], arg2);
			if (var7 > var5) {
				var5 = var7;
			}
		}
		return var5;
	}

	@ObfuscatedName("aac.s(Ljava/lang/String;I[Laay;I)I")
	public int method14538(String arg0, int arg1, class732[] arg2) {
		return this.method14535(arg0, new int[] { arg1 }, field8561, arg2);
	}

	@ObfuscatedName("aac.y(Ljava/lang/String;I[Laay;IB)Ljava/lang/String;")
	public String method14539(String arg0, int arg1, class732[] arg2, int arg3) {
		int var5 = this.method14535(arg0, new int[] { arg1 }, field8561, arg2);
		return arg3 >= 0 && arg3 < var5 ? field8561[arg3] : null;
	}

	@ObfuscatedName("aac.q(Ljava/lang/String;II[Laay;B)I")
	public int method14545(String arg0, int arg1, int arg2, class732[] arg3) {
		if (arg2 == 0) {
			arg2 = this.field8566;
		}
		int var5 = this.method14535(arg0, new int[] { arg1 }, field8561, arg3);
		int var6 = (var5 - 1) * arg2;
		return this.field8569 + this.field8562 + var6;
	}

	@ObfuscatedName("aac.x(Ljava/lang/String;III[Laay;I)Ljava/awt/Point;")
	public Point method14541(String arg0, int arg1, int arg2, int arg3, class732[] arg4) {
		if (arg3 <= 0) {
			return new Point(0, this.field8562 + arg2);
		}
		if (arg3 > arg0.length()) {
			arg3 = arg0.length();
		}
		if (arg2 == 0) {
			arg2 = this.field8566;
		}
		int var6 = this.method14536(arg0, new int[] { arg1 }, field8561, arg4, false);
		int var7 = 0;
		for (int var8 = 0; var8 < var6; var8++) {
			int var9 = field8561[var8].length();
			if (var7 + var9 > arg3 || var6 - 1 == var8 && arg3 == arg0.length()) {
				String var10 = arg0.substring(var7, arg3);
				if (var10.endsWith("<br>")) {
					var10 = "";
					int var10000 = var7 + var9;
					var8++;
				}
				int var12 = this.method14533(var10, arg4);
				int var13 = this.field8562 + arg2 * var8;
				return new Point(var12, var13);
			}
			var7 += var9;
		}
		return null;
	}

	@ObfuscatedName("aac.b(Ljava/lang/String;IIII[Laay;I)I")
	public int method14542(String arg0, int arg1, int arg2, int arg3, int arg4, class732[] arg5) {
		if (arg2 == 0) {
			arg2 = this.field8566;
		}
		int var7 = this.method14536(arg0, new int[] { arg1 }, field8561, arg5, false);
		if (var7 == 0) {
			return 0;
		}
		if (arg4 < 0) {
			arg4 = 0;
		}
		int var8 = arg4 / arg2;
		if (var8 >= var7) {
			var8 = var7 - 1;
		}
		String var9 = field8561[var8];
		int var10 = 0;
		int var11 = 0;
		int var12;
		for (var12 = 0; var12 < arg3 && var10 < var9.length(); var12 = this.method14533(var9.substring(0, var10), arg5)) {
			var11 = var12;
			var10++;
		}
		if (var10 == var9.length() && var9.endsWith("<br>")) {
			var10 -= 4;
		}
		if (arg3 - var11 < var12 - arg3) {
			var10--;
		}
		for (int var13 = 0; var13 < var8; var13++) {
			var10 += field8561[var13].length();
		}
		return var10;
	}
}
