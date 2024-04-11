package com.jagex.graphics;

import com.jagex.core.utils.Algorithms;
import com.jagex.js5.Js5;
import com.jagex.math.IntMath;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Matrix4x4;
import com.jagex.math.Trig1;
import deob.ObfuscatedName;

@ObfuscatedName("sv")
public class SkyBox {

	@ObfuscatedName("sv.n")
	public final int field5084;

	@ObfuscatedName("sv.m")
	public int field5085;

	@ObfuscatedName("sv.k")
	public SkyboxRelated field5086;

	@ObfuscatedName("sv.f")
	public SkyboxRelated[] field5094;

	@ObfuscatedName("sv.w")
	public SkyboxRelated[] field5088;

	@ObfuscatedName("sv.l")
	public int field5087;

	@ObfuscatedName("sv.u")
	public int field5083 = -1;

	@ObfuscatedName("sv.z")
	public final int field5089;

	@ObfuscatedName("sv.p")
	public final int field5090;

	@ObfuscatedName("sv.d")
	public final int field5091;

	@ObfuscatedName("sv.c")
	public Sprite field5095;

	@ObfuscatedName("sv.r")
	public SkyBoxFillMode field5099;

	@ObfuscatedName("sv.v")
	public int field5096;

	@ObfuscatedName("sv.o")
	public int field5097;

	@ObfuscatedName("sv.s")
	public boolean field5098 = true;

	@ObfuscatedName("fz.y")
	public static Js5 field1810;

	@ObfuscatedName("kt.q")
	public static MaterialList field3199;

	@ObfuscatedName("hp.x")
	public static TextureList field2421;

	@ObfuscatedName("sv.b")
	public int field5093;

	@ObfuscatedName("sv.h")
	public Model field5103;

	@ObfuscatedName("sv.a")
	public byte[] field5101;

	@ObfuscatedName("sv.g")
	public boolean field5102;

	@ObfuscatedName("sv.i")
	public SkyBox field5092;

	@ObfuscatedName("sv.j")
	public int field5104;

	@ObfuscatedName("sv.t")
	public int field5105;

	@ObfuscatedName("sv.ae")
	public int field5106;

	@ObfuscatedName("zn.e(Lpy;Ldf;Les;I)V")
	public static void method13864(Js5 arg0, MaterialList arg1, TextureList arg2) {
		field1810 = arg0;
		field3199 = arg1;
		field2421 = arg2;
	}

	@ObfuscatedName("rz.n(I)V")
	public static void method7713() {
		SkyboxRelated.method7979();
	}

	public SkyBox(int arg0, SkyboxRelated[] arg1, int arg2, int arg3, int arg4, int arg5, SkyBoxFillMode arg6, int arg7) {
		this.field5089 = arg3;
		this.field5090 = arg4;
		this.field5091 = arg5;
		this.field5084 = arg0;
		this.field5094 = arg1;
		this.field5099 = arg6;
		if (arg1 == null) {
			this.field5088 = null;
			this.field5086 = null;
		} else {
			this.field5088 = new SkyboxRelated[arg1.length];
			this.field5086 = arg2 >= 0 ? arg1[arg2] : null;
		}
		this.field5093 = arg7;
	}

	@ObfuscatedName("sv.m(III)V")
	public void method7941(int arg0, int arg1) {
		if (!this.field5102) {
		}
		this.field5104 = (arg1 - this.field5106) * arg0 / 255 + this.field5106;
	}

	@ObfuscatedName("sv.k(Lsv;I)V")
	public void method7962(SkyBox arg0) {
		if (this.field5102) {
			this.field5106 = this.field5104;
		} else if (arg0 != null && arg0.field5102) {
			this.field5106 = 255 - arg0.field5104;
		} else {
			this.field5106 = 0;
		}
		this.field5102 = true;
		this.field5092 = arg0;
		this.field5104 = 0;
	}

	@ObfuscatedName("sv.f(I)V")
	public void method7958() {
		this.field5102 = false;
		this.field5092 = null;
		this.field5104 = 0;
	}

	@ObfuscatedName("sv.w(B)Z")
	public boolean method7960() {
		return this.field5102;
	}

	@ObfuscatedName("sv.l(I)Lsv;")
	public SkyBox method7942() {
		return this.field5092;
	}

	@ObfuscatedName("sv.u(Ldh;III)Z")
	public boolean method7944(Toolkit arg0, int arg1, int arg2) {
		if (this.field5083 != arg1) {
			this.field5083 = arg1;
			int var4 = IntMath.method3082(arg1);
			if (var4 > 512) {
				var4 = 512;
			}
			if (var4 <= 0) {
				var4 = 1;
			}
			if (this.field5085 != var4) {
				this.field5085 = var4;
				this.field5095 = null;
			}
			if (this.field5094 != null) {
				this.field5087 = 0;
				int[] var5 = new int[this.field5094.length];
				for (int var6 = 0; var6 < this.field5094.length; var6++) {
					SkyboxRelated var7 = this.field5094[var6];
					if (var7.method7998(this.field5089, this.field5090, this.field5091, this.field5083)) {
						var5[this.field5087] = var7.field5122;
						this.field5088[++this.field5087 - 1] = var7;
					}
				}
				Algorithms.method4397(var5, this.field5088, 0, this.field5087 - 1);
			}
			this.field5098 = true;
		}
		boolean var8 = false;
		if (this.field5098) {
			this.field5098 = false;
			for (int var9 = this.field5087 - 1; var9 >= 0; var9--) {
				boolean var10 = this.field5088[var9].method7980(arg0, this.field5086);
				this.field5098 |= !var10;
				var8 |= var10;
			}
		}
		if (arg2 == 0 || !arg0.method2127()) {
			this.field5103 = null;
		} else if (this.field5103 == null && this.field5093 >= 0) {
			this.method7938(arg0);
		}
		if (this.field5092 != null && this.field5092 != this) {
			this.field5092.method7958();
			var8 |= this.field5092.method7944(arg0, arg1, arg2);
		}
		return var8;
	}

	@ObfuscatedName("sv.z(Ldh;I)V")
	public void method7938(Toolkit arg0) {
		try {
			boolean var2 = field1810.isGroupReady(this.field5093);
			if (var2) {
				arg0.setSun(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				ModelUnlit var3 = ModelUnlit.get(field1810, this.field5093, 0);
				this.field5103 = arg0.createModel(var3, 1099776, 0, 255, 1);
				byte[] var4 = this.field5103.method1741();
				if (var4 == null) {
					this.field5101 = null;
				} else {
					this.field5101 = new byte[var4.length];
					System.arraycopy(var4, 0, this.field5101, 0, var4.length);
				}
			}
		} catch (Exception var6) {
		}
	}

	@ObfuscatedName("sv.p(Ldh;IIIIIIIIII)V")
	public void method7945(Toolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		this.method7946(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, 0, arg9, true, false);
	}

	@ObfuscatedName("sv.d(Ldh;IIIIIIIIIZZI)V")
	public void method7946(Toolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, boolean arg11) {
		int var13 = 0;
		if (this.field5102) {
			var13 = this.field5104;
		}
		if (this.field5092 == null) {
			if (this.field5084 == -1) {
				arg0.fillRectangle(arg2, arg3, arg4, arg5, arg9 | 0xFF000000, 0);
			}
			this.method7947(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, var13);
			return;
		}
		SkyBox var14 = this;
		SkyBox var15 = this.field5092;
		if (this.hashCode() > var15.hashCode()) {
			var14 = this.field5092;
			var15 = this;
			var13 = 255 - var13;
		}
		var14.method7947(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, var13);
		var15.method7947(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, arg11, 255 - var13);
	}

	@ObfuscatedName("sv.c(Ldh;IIIIIIIIIZZII)V")
	public void method7947(Toolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, boolean arg11, int arg12) {
		int var14 = 255 - arg12;
		arg0.flush();
		arg0.method2203();
		if (this.field5103 == null) {
			arg0.method2475(2, 0);
			arg7 = arg1 + arg7 & 0x3FFF;
			if (this.field5084 == -1 || this.field5085 == 0) {
				arg0.fillRectangle(arg2, arg3, arg4, arg5, var14 << 24 | arg9, arg10 ? 0 : 1);
			} else {
				Material var15 = field3199.get(this.field5084);
				if (this.field5095 == null && field2421.loadTexture(TextureRelated2.field7586, var15.diffuseTexture, -1, MaterialAlphaMode.MULTIPLY == var15.alphaMode ? TextureRelated1.field7569 : TextureRelated1.field7568, 0.7F, this.field5085, this.field5085, false)) {
					int[] var16 = MaterialAlphaMode.MULTIPLY == var15.alphaMode ? field2421.getSpecialTexture(TextureRelated2.field7586, var15.diffuseTexture, 0.7F, this.field5085, this.field5085, false) : field2421.getTexture(TextureRelated2.field7586, var15.diffuseTexture, 0.7F, this.field5085, this.field5085, false);
					this.field5096 = var16[0];
					this.field5097 = var16[var16.length - 1];
					this.field5095 = arg0.createSprite(var16, 0, var15.size, var15.size, var15.size);
				}
				int var17 = var14 == 255 ? (MaterialAlphaMode.MULTIPLY == var15.alphaMode ? 1 : 0) : 1;
				if (var17 == 1 && arg10) {
					arg0.fillRectangle(arg2, arg3, arg4, arg5, arg9, 0);
				}
				if (this.field5095 != null) {
					int var18 = arg5 * arg6 / -4096;
					int var19;
					for (var19 = arg5 * arg7 / 4096 + (arg4 - arg5) / 2; var19 > arg5; var19 -= arg5) {
					}
					while (var19 < 0) {
						var19 += arg5;
					}
					if (SkyBoxFillMode.field7237 == this.field5099) {
						for (int var20 = var19 - arg5; var20 < arg4; var20 += arg5) {
							this.field5095.drawTintedScaled(arg2 + var20, arg3 + var18, arg5, arg5, 0, var14 << 24 | 0xFFFFFF, var17);
						}
						if ((this.field5096 & 0xFF000000) != 0) {
							arg0.fillRectangle(0, 0, arg4, arg3 + var18 + 1, this.field5096);
						}
						if ((this.field5097 & 0xFF000000) != 0) {
							arg0.fillRectangle(0, arg3 + var18 + arg5, arg4, arg5 - (arg3 + var18 + arg5), this.field5097);
						}
					} else {
						while (var18 > arg5) {
							var18 -= arg5;
						}
						while (var18 < 0) {
							var18 += arg5;
						}
						for (int var21 = var19 - arg5; var21 < arg4; var21 += arg5) {
							for (int var22 = var18 - arg5; var22 < arg5; var22 += arg5) {
								this.field5095.drawTintedScaled(arg2 + var21, arg3 + var22, arg5, arg5, 0, var14 << 24 | 0xFFFFFF, var17);
							}
						}
					}
				}
			}
		} else if (arg11) {
			Matrix4x4 var23 = arg0.method2355();
			Matrix4x4 var24 = arg0.method2355();
			var23.entries[2] = var23.entries[3];
			var23.entries[6] = var23.entries[7];
			var23.entries[10] = var23.entries[11];
			var23.entries[14] = var23.entries[15];
			arg0.method2220(var23);
			this.method7948(arg0, arg6, arg7, arg8, arg12);
			arg0.method2220(var24);
		} else {
			if (arg10) {
				arg0.method2475(3, arg9);
			}
			this.method7948(arg0, arg6, arg7, arg8, arg12);
		}
		for (int var25 = this.field5087 - 1; var25 >= 0; var25--) {
			this.field5088[var25].method7981(arg0, arg2, arg3, arg4, arg5, arg6, arg7, this.field5089, this.field5090, this.field5091, var14);
		}
		arg0.method2475(2, 0);
		arg0.method2204();
	}

	@ObfuscatedName("sv.r(Ldh;IIIII)V")
	public void method7948(Toolkit arg0, int arg1, int arg2, int arg3, int arg4) {
		Matrix4x3 var6 = arg0.method2218();
		Matrix4x3 var7 = new Matrix4x3();
		var7.setToTranslation(0.0F, 0.0F, 0.0F);
		var7.rotateAroundAxis(0.0F, -1.0F, 0.0F, Trig1.radians(-arg2 & 0x3FFF));
		var7.rotateAroundAxis(-1.0F, 0.0F, 0.0F, Trig1.radians(-arg1 & 0x3FFF));
		var7.rotateAroundAxis(0.0F, 0.0F, -1.0F, Trig1.radians(-arg3 & 0x3FFF));
		arg0.method2217(var7);
		Matrix4x3 var8 = new Matrix4x3();
		if (this.field5105 != arg4) {
			this.field5103.method1747((byte) arg4, this.field5101);
			this.field5105 = arg4;
		}
		this.field5103.draw(var8, null, 0);
		arg0.method2217(var6);
	}
}
