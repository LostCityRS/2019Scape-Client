package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("kr")
public class class309 {

	@ObfuscatedName("kr.n")
	public boolean field3091;

	@ObfuscatedName("kr.m")
	public boolean field3092;

	@ObfuscatedName("kr.k")
	public long field3113;

	@ObfuscatedName("kr.f")
	public int field3094 = 0;

	@ObfuscatedName("kr.w")
	public String field3093 = null;

	@ObfuscatedName("kr.l")
	public int field3096 = 0;

	@ObfuscatedName("kr.u")
	public boolean field3097;

	@ObfuscatedName("kr.z")
	public byte field3098;

	@ObfuscatedName("kr.p")
	public byte field3090;

	@ObfuscatedName("kr.d")
	public byte field3100;

	@ObfuscatedName("kr.c")
	public byte field3117;

	@ObfuscatedName("kr.r")
	public int field3095;

	@ObfuscatedName("kr.v")
	public long[] field3103;

	@ObfuscatedName("kr.o")
	public byte[] field3104;

	@ObfuscatedName("kr.s")
	public int[] field3118;

	@ObfuscatedName("kr.y")
	public int[] field3106;

	@ObfuscatedName("kr.q")
	public int[] field3107;

	@ObfuscatedName("kr.x")
	public boolean[] field3108;

	@ObfuscatedName("kr.b")
	public int field3101 = -1;

	@ObfuscatedName("kr.h")
	public int field3110 = -1;

	@ObfuscatedName("kr.a")
	public int field3111;

	@ObfuscatedName("kr.g")
	public long[] field3112;

	@ObfuscatedName("kr.i")
	public String[] field3120;

	@ObfuscatedName("kr.j")
	public String[] field3114;

	@ObfuscatedName("kr.t")
	public class729 field3115;

	public class309(class997 arg0) {
		this.method5274(arg0);
	}

	@ObfuscatedName("kr.e(II)V")
	public void method5315(int arg0) {
		if (this.field3091) {
			if (this.field3103 == null) {
				this.field3103 = new long[arg0];
			} else {
				System.arraycopy(this.field3103, 0, this.field3103 = new long[arg0], 0, this.field3095);
			}
		}
		if (this.field3092) {
			if (this.field3120 == null) {
				this.field3120 = new String[arg0];
			} else {
				System.arraycopy(this.field3120, 0, this.field3120 = new String[arg0], 0, this.field3095);
			}
		}
		if (this.field3104 == null) {
			this.field3104 = new byte[arg0];
		} else {
			System.arraycopy(this.field3104, 0, this.field3104 = new byte[arg0], 0, this.field3095);
		}
		if (this.field3106 == null) {
			this.field3106 = new int[arg0];
		} else {
			System.arraycopy(this.field3106, 0, this.field3106 = new int[arg0], 0, this.field3095);
		}
		if (this.field3107 == null) {
			this.field3107 = new int[arg0];
		} else {
			System.arraycopy(this.field3107, 0, this.field3107 = new int[arg0], 0, this.field3095);
		}
		if (this.field3108 == null) {
			this.field3108 = new boolean[arg0];
		} else {
			System.arraycopy(this.field3108, 0, this.field3108 = new boolean[arg0], 0, this.field3095);
		}
	}

	@ObfuscatedName("kr.n(II)V")
	public void method5255(int arg0) {
		if (this.field3091) {
			if (this.field3112 == null) {
				this.field3112 = new long[arg0];
			} else {
				System.arraycopy(this.field3112, 0, this.field3112 = new long[arg0], 0, this.field3111);
			}
		}
		if (!this.field3092) {
			return;
		}
		if (this.field3114 == null) {
			this.field3114 = new String[arg0];
		} else {
			System.arraycopy(this.field3114, 0, this.field3114 = new String[arg0], 0, this.field3111);
		}
	}

	@ObfuscatedName("kr.m(Ljava/lang/String;B)I")
	public int method5256(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (int var2 = 0; var2 < this.field3095; var2++) {
			if (this.field3120[var2].equals(arg0)) {
				return var2;
			}
		}
		return -1;
	}

	@ObfuscatedName("kr.k(IIII)I")
	public int method5257(int arg0, int arg1, int arg2) {
		int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		return (this.field3106[arg0] & var4) >>> arg1;
	}

	@ObfuscatedName("kr.f(II)Ljava/lang/Integer;")
	public Integer method5318(int arg0) {
		if (this.field3115 == null) {
			return null;
		} else {
			class532 var2 = this.field3115.method14495((long) arg0);
			return var2 != null && var2 instanceof class988 ? Integer.valueOf(((class988) var2).field11442) : null;
		}
	}

	@ObfuscatedName("kr.w(II)Ljava/lang/Long;")
	public Long method5259(int arg0) {
		if (this.field3115 == null) {
			return null;
		} else {
			class532 var2 = this.field3115.method14495((long) arg0);
			return var2 != null && var2 instanceof class987 ? Long.valueOf(((class987) var2).field11441) : null;
		}
	}

	@ObfuscatedName("kr.l(II)Ljava/lang/String;")
	public String method5260(int arg0) {
		if (this.field3115 == null) {
			return null;
		} else {
			class532 var2 = this.field3115.method14495((long) arg0);
			return var2 != null && var2 instanceof class984 ? (String) ((class984) var2).field11436 : null;
		}
	}

	@ObfuscatedName("kr.u(B)[I")
	public int[] method5261() {
		if (this.field3118 == null) {
			String[] var1 = new String[this.field3095];
			this.field3118 = new int[this.field3095];
			int var2 = 0;
			while (var2 < this.field3095) {
				var1[var2] = this.field3120[var2];
				if (var1[var2] != null) {
					var1[var2] = var1[var2].toLowerCase();
				}
				this.field3118[var2] = var2++;
			}
			class664.method4054(var1, this.field3118);
		}
		return this.field3118;
	}

	@ObfuscatedName("kr.z(JLjava/lang/String;IB)V")
	public void method5262(long arg0, String arg1, int arg2) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.field3091 != arg0 > 0L) {
			throw new RuntimeException("");
		} else if ((arg1 != null) == this.field3092) {
			if (arg0 > 0L && (this.field3103 == null || this.field3095 >= this.field3103.length) || arg1 != null && (this.field3120 == null || this.field3095 >= this.field3120.length)) {
				this.method5315(this.field3095 + 5);
			}
			if (this.field3103 != null) {
				this.field3103[this.field3095] = arg0;
			}
			if (this.field3120 != null) {
				this.field3120[this.field3095] = arg1;
			}
			if (this.field3101 == -1) {
				this.field3101 = this.field3095;
				this.field3104[this.field3095] = 126;
			} else {
				this.field3104[this.field3095] = 0;
			}
			this.field3106[this.field3095] = 0;
			this.field3107[this.field3095] = arg2;
			this.field3108[this.field3095] = false;
			this.field3095++;
			this.field3118 = null;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("kr.p(II)V")
	public void method5263(int arg0) {
		if (arg0 < 0 || arg0 >= this.field3095) {
			throw new RuntimeException("");
		}
		this.field3095--;
		this.field3118 = null;
		if (this.field3095 == 0) {
			this.field3103 = null;
			this.field3120 = null;
			this.field3104 = null;
			this.field3106 = null;
			this.field3107 = null;
			this.field3108 = null;
			this.field3101 = -1;
			this.field3110 = -1;
			return;
		}
		System.arraycopy(this.field3104, arg0 + 1, this.field3104, arg0, this.field3095 - arg0);
		System.arraycopy(this.field3106, arg0 + 1, this.field3106, arg0, this.field3095 - arg0);
		System.arraycopy(this.field3107, arg0 + 1, this.field3107, arg0, this.field3095 - arg0);
		System.arraycopy(this.field3108, arg0 + 1, this.field3108, arg0, this.field3095 - arg0);
		if (this.field3103 != null) {
			System.arraycopy(this.field3103, arg0 + 1, this.field3103, arg0, this.field3095 - arg0);
		}
		if (this.field3120 != null) {
			System.arraycopy(this.field3120, arg0 + 1, this.field3120, arg0, this.field3095 - arg0);
		}
		this.method5299();
	}

	@ObfuscatedName("kr.d(I)V")
	public void method5299() {
		if (this.field3095 == 0) {
			this.field3101 = -1;
			this.field3110 = -1;
			return;
		}
		this.field3101 = -1;
		this.field3110 = -1;
		int var1 = 0;
		byte var2 = this.field3104[0];
		for (int var3 = 1; var3 < this.field3095; var3++) {
			if (this.field3104[var3] > var2) {
				if (var2 == 125) {
					this.field3110 = var1;
				}
				var1 = var3;
				var2 = this.field3104[var3];
			} else if (this.field3110 == -1 && this.field3104[var3] == 125) {
				this.field3110 = var3;
			}
		}
		this.field3101 = var1;
		if (this.field3101 != -1) {
			this.field3104[this.field3101] = 126;
		}
	}

	@ObfuscatedName("kr.c(JLjava/lang/String;I)V")
	public void method5308(long arg0, String arg1) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.field3091 != arg0 > 0L) {
			throw new RuntimeException("");
		} else if ((arg1 != null) == this.field3092) {
			if (arg0 > 0L && (this.field3112 == null || this.field3111 >= this.field3112.length) || arg1 != null && (this.field3114 == null || this.field3111 >= this.field3114.length)) {
				this.method5255(this.field3111 + 5);
			}
			if (this.field3112 != null) {
				this.field3112[this.field3111] = arg0;
			}
			if (this.field3114 != null) {
				this.field3114[this.field3111] = arg1;
			}
			this.field3111++;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("kr.r(II)V")
	public void method5266(int arg0) {
		this.field3111--;
		if (this.field3111 == 0) {
			this.field3112 = null;
			this.field3114 = null;
			return;
		}
		if (this.field3112 != null) {
			System.arraycopy(this.field3112, arg0 + 1, this.field3112, arg0, this.field3111 - arg0);
		}
		if (this.field3114 != null) {
			System.arraycopy(this.field3114, arg0 + 1, this.field3114, arg0, this.field3111 - arg0);
		}
	}

	@ObfuscatedName("kr.v(IBB)I")
	public int method5267(int arg0, byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (this.field3101 == arg0 && (this.field3110 == -1 || this.field3104[this.field3110] < 125)) {
			return -1;
		} else if (this.field3104[arg0] == arg1) {
			return -1;
		} else {
			this.field3104[arg0] = arg1;
			this.method5299();
			return arg0;
		}
	}

	@ObfuscatedName("kr.o(IZB)I")
	public int method5303(int arg0, boolean arg1) {
		if (this.field3108[arg0] == arg1) {
			return -1;
		} else {
			this.field3108[arg0] = arg1;
			return arg0;
		}
	}

	@ObfuscatedName("kr.s(IIIIB)I")
	public int method5269(int arg0, int arg1, int arg2, int arg3) {
		int var5 = (0x1 << arg2) - 1;
		int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		int var7 = var6 ^ var5;
		int var8 = arg1 << arg2;
		int var9 = var8 & var7;
		int var10 = this.field3106[arg0];
		if ((var10 & var7) == var9) {
			return -1;
		} else {
			int var11 = var10 & ~var7;
			this.field3106[arg0] = var11 | var9;
			return arg0;
		}
	}

	@ObfuscatedName("kr.y(III)Z")
	public boolean method5270(int arg0, int arg1) {
		if (this.field3115 == null) {
			this.field3115 = new class729(4);
		} else {
			class532 var3 = this.field3115.method14495((long) arg0);
			if (var3 != null) {
				if (var3 instanceof class988) {
					class988 var4 = (class988) var3;
					if (var4.field11442 == arg1) {
						return false;
					}
					var4.field11442 = arg1;
					return true;
				}
				var3.method8440();
			}
		}
		this.field3115.method14501(new class988(arg1), (long) arg0);
		return true;
	}

	@ObfuscatedName("kr.q(IIIII)Z")
	public boolean method5271(int arg0, int arg1, int arg2, int arg3) {
		int var5 = (0x1 << arg2) - 1;
		int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		int var7 = var6 ^ var5;
		int var8 = arg1 << arg2;
		int var9 = var8 & var7;
		if (this.field3115 == null) {
			this.field3115 = new class729(4);
		} else {
			class532 var10 = this.field3115.method14495((long) arg0);
			if (var10 != null) {
				if (var10 instanceof class988) {
					class988 var11 = (class988) var10;
					if ((var11.field11442 & var7) == var9) {
						return false;
					}
					var11.field11442 &= ~var7;
					var11.field11442 |= var9;
					return true;
				}
				var10.method8440();
			}
		}
		this.field3115.method14501(new class988(var9), (long) arg0);
		return true;
	}

	@ObfuscatedName("kr.x(IJ)Z")
	public boolean method5272(int arg0, long arg1) {
		if (this.field3115 == null) {
			this.field3115 = new class729(4);
		} else {
			class532 var4 = this.field3115.method14495((long) arg0);
			if (var4 != null) {
				if (var4 instanceof class987) {
					class987 var5 = (class987) var4;
					if (var5.field11441 == arg1) {
						return false;
					}
					var5.field11441 = arg1;
					return true;
				}
				var4.method8440();
			}
		}
		this.field3115.method14501(new class987(arg1), (long) arg0);
		return true;
	}

	@ObfuscatedName("kr.b(ILjava/lang/String;I)Z")
	public boolean method5273(int arg0, String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.field3115 == null) {
			this.field3115 = new class729(4);
		} else {
			class532 var3 = this.field3115.method14495((long) arg0);
			if (var3 != null) {
				if (var3 instanceof class984) {
					class984 var4 = (class984) var3;
					if (var4.field11436 instanceof String) {
						if (arg1.equals(var4.field11436)) {
							return false;
						}
						var4.method8440();
						this.field3115.method14501(new class984(arg1), var4.field6760);
						return true;
					}
				}
				var3.method8440();
			}
		}
		this.field3115.method14501(new class984(arg1), (long) arg0);
		return true;
	}

	@ObfuscatedName("kr.h(Lalw;B)V")
	public void method5274(class997 arg0) {
		int var2 = arg0.method17904();
		if (var2 < 1 || var2 > 6) {
			throw new RuntimeException("" + var2);
		}
		int var3 = arg0.method17904();
		if ((var3 & 0x1) != 0) {
			this.field3091 = true;
		}
		if ((var3 & 0x2) != 0) {
			this.field3092 = true;
		}
		if (!this.field3091) {
			this.field3103 = null;
			this.field3112 = null;
		}
		if (!this.field3092) {
			this.field3120 = null;
			this.field3114 = null;
		}
		this.field3094 = arg0.method17910();
		this.field3096 = arg0.method17910();
		if (var2 <= 3 && this.field3096 != 0) {
			this.field3096 += 16912800;
		}
		this.field3095 = arg0.method17906();
		this.field3111 = arg0.method17904();
		this.field3093 = arg0.method17918();
		if (var2 >= 4) {
			arg0.method17910();
		}
		this.field3097 = arg0.method17904() == 1;
		this.field3098 = arg0.method17905();
		this.field3090 = arg0.method17905();
		this.field3100 = arg0.method17905();
		this.field3117 = arg0.method17905();
		if (this.field3095 > 0) {
			if (this.field3091 && (this.field3103 == null || this.field3103.length < this.field3095)) {
				this.field3103 = new long[this.field3095];
			}
			if (this.field3092 && (this.field3120 == null || this.field3120.length < this.field3095)) {
				this.field3120 = new String[this.field3095];
			}
			if (this.field3104 == null || this.field3104.length < this.field3095) {
				this.field3104 = new byte[this.field3095];
			}
			if (this.field3106 == null || this.field3106.length < this.field3095) {
				this.field3106 = new int[this.field3095];
			}
			if (this.field3107 == null || this.field3107.length < this.field3095) {
				this.field3107 = new int[this.field3095];
			}
			if (this.field3108 == null || this.field3108.length < this.field3095) {
				this.field3108 = new boolean[this.field3095];
			}
			for (int var4 = 0; var4 < this.field3095; var4++) {
				if (this.field3091) {
					this.field3103[var4] = arg0.method17914();
				}
				if (this.field3092) {
					this.field3120[var4] = arg0.method17917();
				}
				this.field3104[var4] = arg0.method17905();
				if (var2 >= 2) {
					this.field3106[var4] = arg0.method17910();
				}
				if (var2 >= 5) {
					this.field3107[var4] = arg0.method17906();
				} else {
					this.field3107[var4] = 0;
				}
				if (var2 >= 6) {
					this.field3108[var4] = arg0.method17904() == 1;
				} else {
					this.field3108[var4] = false;
				}
			}
			this.method5299();
		}
		if (this.field3111 > 0) {
			if (this.field3091 && (this.field3112 == null || this.field3112.length < this.field3111)) {
				this.field3112 = new long[this.field3111];
			}
			if (this.field3092 && (this.field3114 == null || this.field3114.length < this.field3111)) {
				this.field3114 = new String[this.field3111];
			}
			for (int var5 = 0; var5 < this.field3111; var5++) {
				if (this.field3091) {
					this.field3112[var5] = arg0.method17914();
				}
				if (this.field3092) {
					this.field3114[var5] = arg0.method17917();
				}
			}
		}
		if (var2 < 3) {
			return;
		}
		int var6 = arg0.method17906();
		if (var6 <= 0) {
			return;
		}
		this.field3115 = new class729(var6 < 16 ? class783.method16657(var6) : 16);
		while (var6-- > 0) {
			int var7 = arg0.method17910();
			int var8 = var7 & 0x3FFFFFFF;
			int var9 = var7 >>> 30;
			if (var9 == 0) {
				int var10 = arg0.method17910();
				this.field3115.method14501(new class988(var10), (long) var8);
			} else if (var9 == 1) {
				long var11 = arg0.method17914();
				this.field3115.method14501(new class987(var11), (long) var8);
			} else if (var9 == 2) {
				String var13 = arg0.method17918();
				this.field3115.method14501(new class984(var13), (long) var8);
			}
		}
	}
}
