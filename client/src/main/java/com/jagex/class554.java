package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ul")
public class class554 {

	@ObfuscatedName("ul.g")
	public class973 field7003;

	@ObfuscatedName("ul.i")
	public boolean field7004;

	@ObfuscatedName("ul.j")
	public boolean field7005;

	@ObfuscatedName("ul.t")
	public int field7006;

	@ObfuscatedName("ul.ae")
	public short[] field6981;

	@ObfuscatedName("ul.ag")
	public int field7014;

	@ObfuscatedName("ul.ah")
	public int field7009;

	@ObfuscatedName("ul.al")
	public int field7010;

	@ObfuscatedName("ul.ac")
	public int field7011;

	@ObfuscatedName("ul.ai")
	public int field6985;

	@ObfuscatedName("ul.aw")
	public int field7013;

	@ObfuscatedName("ul.at")
	public int field6990 = -1;

	public class554(class133 arg0, int arg1, class997 arg2, int arg3) {
		if (Statics.field1970 == null) {
			method3615();
		}
		this.field7006 = arg2.method17904();
		this.field7004 = (this.field7006 & 0x8) != 0;
		this.field7005 = (this.field7006 & 0x10) != 0;
		this.field7006 &= 0x7;
		int var5 = arg2.method17906() << arg3;
		int var6 = arg2.method17906() << arg3;
		int var7 = arg2.method17906() << arg3;
		int var8 = arg2.method17904();
		int var9 = var8 * 2 + 1;
		this.field6981 = new short[var9];
		for (int var10 = 0; var10 < this.field6981.length; var10++) {
			short var11 = (short) arg2.method17906();
			int var12 = var11 >>> 8;
			int var13 = var11 & 0xFF;
			if (var12 >= var9) {
				var12 = var9 - 1;
			}
			if (var13 > var9 - var12) {
				var13 = var9 - var12;
			}
			this.field6981[var10] = (short) (var12 << 8 | var13);
		}
		int var14 = (var8 << arg1) + (0x1 << arg1 >> 1);
		int var15 = Statics.field8151 == null ? Statics.field8149[class662.method4937(arg2.method17906()) & 0xFFFF] : Statics.field8151[arg2.method17906()];
		int var16 = arg2.method17904();
		this.field7014 = var16 & 0x1F;
		this.field7011 = (var16 & 0xE0) << 3;
		if (this.field7014 != 31) {
			this.method8910();
		}
		this.field6990 = arg2.method17973();
		this.method8900(arg0, var5, var7, var6, var14, var15);
	}

	@ObfuscatedName("ul.e(Ldh;IIIIII)V")
	public void method8900(class133 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.field7003 = arg0.method2227(arg1, arg2, arg3, arg4, arg5, 1.0F);
	}

	@ObfuscatedName("ul.n(IIIII)V")
	public void method8899(int arg0, int arg1, int arg2, int arg3) {
		this.field7009 = arg0;
		this.field7013 = arg3;
		this.field6985 = arg2;
		this.field7010 = arg1;
	}

	@ObfuscatedName("ul.m(I)V")
	public void method8910() {
		switch(this.field7014) {
			case 2:
				this.field7009 = 1;
				this.field7013 = 0;
				this.field6985 = 2048;
				this.field7010 = 2048;
				break;
			case 3:
				this.field7009 = 1;
				this.field7013 = 0;
				this.field6985 = 2048;
				this.field7010 = 4096;
				break;
			case 4:
				this.field7009 = 4;
				this.field7013 = 0;
				this.field6985 = 2048;
				this.field7010 = 2048;
				break;
			case 5:
				this.field7009 = 4;
				this.field7013 = 0;
				this.field6985 = 2048;
				this.field7010 = 8192;
				break;
			case 6:
				this.field7009 = 3;
				this.field7013 = 1280;
				this.field6985 = 768;
				this.field7010 = 2048;
				break;
			case 7:
				this.field7009 = 3;
				this.field7013 = 1280;
				this.field6985 = 768;
				this.field7010 = 4096;
				break;
			case 8:
				this.field7009 = 3;
				this.field7013 = 1024;
				this.field6985 = 1024;
				this.field7010 = 2048;
				break;
			case 9:
				this.field7009 = 3;
				this.field7013 = 1024;
				this.field6985 = 1024;
				this.field7010 = 4096;
				break;
			case 10:
				this.field7009 = 3;
				this.field7013 = 1536;
				this.field6985 = 512;
				this.field7010 = 2048;
				break;
			case 11:
				this.field7009 = 3;
				this.field7013 = 1536;
				this.field6985 = 512;
				this.field7010 = 4096;
				break;
			case 12:
				this.field7009 = 2;
				this.field7013 = 0;
				this.field6985 = 2048;
				this.field7010 = 2048;
				break;
			case 13:
				this.field7009 = 2;
				this.field7013 = 0;
				this.field6985 = 2048;
				this.field7010 = 8192;
				break;
			case 14:
				this.field7009 = 1;
				this.field7013 = 1280;
				this.field6985 = 768;
				this.field7010 = 2048;
				break;
			case 15:
				this.field7009 = 1;
				this.field7013 = 1536;
				this.field6985 = 512;
				this.field7010 = 4096;
				break;
			case 16:
				this.field7009 = 1;
				this.field7013 = 1792;
				this.field6985 = 256;
				this.field7010 = 8192;
				break;
			default:
				this.field7013 = 0;
				this.field7009 = 0;
				this.field6985 = 2048;
				this.field7010 = 2048;
		}
	}

	@ObfuscatedName("ul.k(IZI)V")
	public void method8898(int arg0, boolean arg1) {
		int var4;
		if (arg1) {
			var4 = 2048;
		} else {
			int var3 = this.field7010 * arg0 / 50 + this.field7011 & 0x7FF;
			switch(this.field7009) {
				case 1:
					var4 = (class417.field4270[var3 << 3] >> 4) + 1024;
					break;
				case 2:
					var4 = var3;
					break;
				case 3:
					var4 = Statics.field1970[var3] >> 1;
					break;
				case 4:
					var4 = var3 >> 10 << 11;
					break;
				case 5:
					var4 = (var3 < 1024 ? var3 : 2048 - var3) << 1;
					break;
				default:
					var4 = 2048;
			}
		}
		float var5 = (float) ((this.field6985 * var4 >> 11) + this.field7013) / 2048.0F;
		float var6 = var5 * this.field7003.method17652();
		this.field7003.method17612(var6);
		this.field7003.method17622();
	}

	@ObfuscatedName("gj.f(I)V")
	public static void method3615() {
		Statics.field1970 = class1195.method16661(2048, 35, 8, 8, 4, 0.4F, true);
	}
}
