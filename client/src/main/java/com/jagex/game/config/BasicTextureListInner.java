package com.jagex.game.config;

import com.jagex.graphics.TextureList;
import com.jagex.graphics.TextureRelated1;
import com.jagex.graphics.TextureRelated2;
import deob.ObfuscatedName;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

@ObfuscatedName("dk")
public abstract class BasicTextureListInner implements TextureList {

	@ObfuscatedName("dk.e")
	public static double field1432 = -1.0D;

	@ObfuscatedName("dk.n")
	public static final int[] field1433 = new int[256];

	@ObfuscatedName("kp.e([ID)V")
	public static void method5366(int[] arg0, double arg1) {
		if (field1432 != arg1) {
			for (int var3 = 0; var3 < 256; var3++) {
				int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
				field1433[var3] = var4 > 255 ? 255 : var4;
			}
			field1432 = arg1;
		}
		for (int var5 = 0; var5 < arg0.length; var5++) {
			int var6 = field1433[arg0[var5] >> 16 & 0xFF];
			int var7 = field1433[arg0[var5] >> 8 & 0xFF];
			int var8 = field1433[arg0[var5] >> 0 & 0xFF];
			arg0[var5] = arg0[var5] & 0xFF000000 | var6 << 16 | var7 << 8 | var8;
		}
	}

	@ObfuscatedName("dk.k(Lvk;ID)[I")
	public int[] method1992(TextureRelated2 arg0, int arg1, double arg2) {
		int[] var5 = this.method1979(arg0, arg1, arg2);
		if (var5 == null) {
			return null;
		}
		for (int var6 = 0; var6 < var5.length; var6++) {
			if ((var5[var6] & 0xFFFFFF) == 0) {
				var5[var6] &= 0xFFFFFF;
			} else {
				var5[var6] |= 0xFF000000;
			}
		}
		return var5;
	}

	@ObfuscatedName("dk.f(Lvk;ID)[I")
	public int[] method1979(TextureRelated2 arg0, int arg1, double arg2) {
		byte[] var5 = this.method2002(arg0, arg1);
		if (var5 == null) {
			return null;
		}
		try {
			byte var6 = (byte) (var5[0] & 0xFF);
			if (TextureRelated2.field7585 == arg0) {
				if (var6 != 6) {
					return null;
				}
				int[] var7 = null;
				int var8 = 1;
				for (int var9 = 0; var9 < 6; var9++) {
					int var10 = (var5[var8] & 0xFF) << 24 | (var5[var8 + 1] & 0xFF) << 16 | (var5[var8 + 2] & 0xFF) << 8 | var5[var8 + 3] & 0xFF;
					byte[] var11 = new byte[var10];
					System.arraycopy(var5, var8 + 4, var11, 0, var10);
					int[] var12 = this.method1996(var11, false);
					if (var9 == 0) {
						var7 = new int[var12.length * 6];
					}
					System.arraycopy(var12, 0, var7, var12.length * var9, var12.length);
					var8 += var10 + 4;
				}
				if (arg2 != 1.0D) {
					method5366(var7, arg2);
				}
				return var7;
			} else if (var6 == 1) {
				byte[] var13 = new byte[var5.length - 5];
				System.arraycopy(var5, 5, var13, 0, var5.length - 5);
				int[] var14 = this.method1996(var13, false);
				if (var14 == null) {
					return null;
				} else {
					if (arg2 != 1.0D) {
						method5366(var14, arg2);
					}
					return var14;
				}
			} else {
				return null;
			}
		} catch (IOException var16) {
			return null;
		}
	}

	@ObfuscatedName("dk.w(Lvk;IID)[F")
	public float[] method1980(TextureRelated2 arg0, int arg1, int arg2, double arg3) {
		if (TextureRelated2.field7586 != arg0) {
			return null;
		}
		int[] var6 = this.method1979(arg0, arg1, arg3);
		if (var6 == null) {
			return null;
		}
		int[] var7 = null;
		byte[] var8 = this.method2002(TextureRelated2.field7587, arg2);
		if (var8 != null) {
			try {
				byte var9 = (byte) (var8[0] & 0xFF);
				if (var9 != 1) {
					return null;
				}
				byte[] var10 = new byte[var8.length - 5];
				System.arraycopy(var8, 5, var10, 0, var8.length - 5);
				var7 = this.method1996(var10, false);
				for (int var11 = 0; var11 < var7.length; var11++) {
					var7[var11] = var7[var11] >> 16 & 0xFF;
				}
			} catch (IOException var22) {
			}
		}
		if (var7 == null) {
			var7 = new int[var6.length];
		}
		float[] var13 = new float[var6.length * 4];
		int var14 = 0;
		for (int var15 = 0; var15 < var6.length; var15++) {
			int var16 = var6[var15];
			int var17 = var16 >>> 24;
			int var18 = var16 >> 16 & 0xFF;
			int var19 = var16 >> 8 & 0xFF;
			int var20 = var16 & 0xFF;
			float var21 = (float) var7[var15] * 31.0F / 255.0F + 1.0F;
			var13[var14++] = (float) var18 * var21 / 255.0F;
			var13[var14++] = (float) var19 * var21 / 255.0F;
			var13[var14++] = (float) var20 * var21 / 255.0F;
			var13[var14++] = (float) var17 / 255.0F;
		}
		return var13;
	}

	@ObfuscatedName("dk.l(B)V")
	public void method1982() {
	}

	@ObfuscatedName("dk.u(Lvk;IFIIZI)[I")
	public int[] getTexture(TextureRelated2 arg0, int arg1, float arg2, int arg3, int arg4, boolean arg5) {
		return this.method1992(arg0, arg1, (double) arg2);
	}

	@ObfuscatedName("dk.z(Lvk;IFIIZB)[I")
	public int[] getSpecialTexture(TextureRelated2 arg0, int arg1, float arg2, int arg3, int arg4, boolean arg5) {
		return this.method1979(arg0, arg1, (double) arg2);
	}

	@ObfuscatedName("dk.p(Lvk;IIFIIZB)[F")
	public float[] method1984(TextureRelated2 arg0, int arg1, int arg2, float arg3, int arg4, int arg5, boolean arg6) {
		return this.method1980(arg0, arg1, arg2, (double) arg3);
	}

	@ObfuscatedName("dk.d([BZI)[I")
	public int[] method1996(byte[] arg0, boolean arg1) throws IOException {
		BufferedImage var3 = ImageIO.read(new ByteArrayInputStream(arg0));
		if (var3 == null) {
			return null;
		}
		int[] var4 = method14804(var3);
		if (arg1) {
			for (int var5 = var3.getHeight() - 1; var5 >= 0; var5--) {
				int var6 = var5 * var3.getWidth();
				int var7 = (var5 + 1) * var3.getWidth();
				while (var6 < var7) {
					var7--;
					int var8 = var4[var6];
					var4[var6] = var4[var7];
					var4[var7] = var8;
					var6++;
				}
			}
		}
		return var4;
	}

	@ObfuscatedName("abu.c(Ljava/awt/image/BufferedImage;I)[I")
	public static int[] method14804(BufferedImage arg0) {
		if (arg0.getType() != 10 && arg0.getType() != 0) {
			return arg0.getRGB(0, 0, arg0.getWidth(), arg0.getHeight(), null, 0, arg0.getWidth());
		}
		Object var1 = null;
		int[] var2 = arg0.getRaster().getPixels(0, 0, arg0.getWidth(), arg0.getHeight(), (int[]) var1);
		int[] var3 = new int[arg0.getWidth() * arg0.getHeight()];
		if (arg0.getType() == 10) {
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (var2[var4] << 16) + (var2[var4] << 8) + var2[var4] + -16777216;
			}
		} else {
			for (int var5 = 0; var5 < var3.length; var5++) {
				int var6 = var5 * 2;
				var3[var5] = (var2[var6 + 1] << 24) + var2[var6] + (var2[var6] << 16) + (var2[var6] << 8);
			}
		}
		return var3;
	}

	@ObfuscatedName("dk.m(Lvk;IILvc;FIIZI)Z")
	public abstract boolean loadTexture(TextureRelated2 arg0, int arg1, int arg2, TextureRelated1 arg3, float arg4, int arg5, int arg6, boolean arg7);

	@ObfuscatedName("dk.n(Lvk;IB)[B")
	public abstract byte[] method2002(TextureRelated2 arg0, int arg1);
}
