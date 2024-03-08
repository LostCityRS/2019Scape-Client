package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("bz")
public class class78 {

	@ObfuscatedName("bz.f")
	public boolean field1040;

	@ObfuscatedName("bz.w")
	public class812[] field1041 = null;

	@ObfuscatedName("bz.l")
	public class811 field1042 = null;

	@ObfuscatedName("bz.u")
	public class812[] field1043 = null;

	@ObfuscatedName("bz.z")
	public class811 field1044 = null;

	@ObfuscatedName("bz.p")
	public class811 field1038 = null;

	@ObfuscatedName("bz.e(Lafa;)V")
	public static void method1283(class849 arg0) {
		if (Statics.field1046 == null) {
			class1142 var1 = new class1142();
			byte[] var2 = var1.method19221(128, 128, 16);
			Statics.field1046 = class703.method2821(var2, false);
		}
		if (Statics.field1039 == null) {
			class1140 var3 = new class1140();
			byte[] var4 = var3.method19216(128, 128, 16);
			Statics.field1039 = class703.method2821(var4, false);
		}
		class93 var5 = arg0.field9871;
		if (var5.method1391() && Statics.field1048 == null) {
			byte[] var6 = class534.method8451(128, 128, 16, 8, new class1003(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			Statics.field1048 = class703.method2821(var6, false);
		}
	}

	public class78(class849 arg0) {
		this.field1040 = arg0.field9889;
		method1283(arg0);
		if (this.field1040) {
			byte[] var6 = class703.method4540(Statics.field1046, false);
			this.field1042 = new class811(arg0, class109.field1272, class135.field1645, 128, 128, 16, var6, class109.field1272);
			byte[] var7 = class703.method4540(Statics.field1039, false);
			this.field1044 = new class811(arg0, class109.field1272, class135.field1645, 128, 128, 16, var7, class109.field1272);
			class93 var8 = arg0.field9871;
			if (var8.method1391()) {
				byte[] var9 = class703.method4540(Statics.field1048, false);
				this.field1038 = new class811(arg0, class109.field1273, class135.field1645, 128, 128, 16);
				class811 var10 = new class811(arg0, class109.field1275, class135.field1645, 128, 128, 16, var9, class109.field1275);
				if (var8.method1390(this.field1038, var10, 2.0F)) {
					this.field1038.method1084();
				} else {
					this.field1038.method1087();
					this.field1038 = null;
				}
				var10.method1087();
			}
		} else {
			this.field1041 = new class812[16];
			for (int var2 = 0; var2 < 16; var2++) {
				byte[] var3 = class703.method6024(Statics.field1046, var2 * 32768, 32768);
				this.field1041[var2] = new class812(arg0, 3553, class109.field1272, class135.field1645, 128, 128, true, var3, class109.field1272, false);
			}
			this.field1043 = new class812[16];
			for (int var4 = 0; var4 < 16; var4++) {
				byte[] var5 = class703.method6024(Statics.field1039, var4 * 32768, 32768);
				this.field1043[var4] = new class812(arg0, 3553, class109.field1272, class135.field1645, 128, 128, true, var5, class109.field1272, false);
			}
		}
	}
}
