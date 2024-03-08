package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("yw")
public class class670 {

	@ObfuscatedName("yw.e")
	public static class163 field8187 = new class163(128);

	public class670() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ss.e(I)V")
	public static void method8004() {
		field8187.method2969();
	}

	@ObfuscatedName("lv.n(II)Lasc;")
	public static class1185 method5402(int arg0) {
		class1185 var1 = (class1185) field8187.method2966((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Statics.field5010.method6879(arg0, 0);
		if (var2 == null || var2.length <= 1) {
			return null;
		}
		class1185 var3;
		try {
			var3 = method2817(var2);
		} catch (Exception var5) {
			throw new RuntimeException(var5.getMessage() + " " + arg0);
		}
		field8187.method2968(var3, (long) arg0);
		return var3;
	}

	@ObfuscatedName("vs.m(Luh;IIS)Lasc;")
	public static class1185 method9425(class572 arg0, int arg1, int arg2) {
		int var3 = arg0.field7271 | arg1 << 10;
		class1185 var4 = (class1185) field8187.method2966((long) var3 << 16);
		if (var4 != null) {
			return var4;
		}
		byte[] var5 = Statics.field5010.method6894(Statics.field5010.method6903(var3));
		if (var5 == null) {
			int var8 = arg0.field7271 | arg2 + 65536 << 10;
			class1185 var9 = (class1185) field8187.method2966((long) var8 << 16);
			if (var9 != null) {
				return var9;
			}
			byte[] var10 = Statics.field5010.method6894(Statics.field5010.method6903(var8));
			if (var10 == null) {
				int var13 = arg0.field7271 | 0x3FFFC00;
				class1185 var14 = (class1185) field8187.method2966((long) var13 << 16);
				if (var14 != null) {
					return var14;
				}
				byte[] var15 = Statics.field5010.method6894(Statics.field5010.method6903(var13));
				if (var15 == null) {
					return null;
				} else if (var15.length <= 1) {
					return null;
				} else {
					class1185 var16;
					try {
						var16 = method2817(var15);
					} catch (Exception var20) {
						throw new RuntimeException(var20.getMessage() + " " + var13);
					}
					var16.field12373 = arg0;
					field8187.method2968(var16, (long) var13 << 16);
					return var16;
				}
			} else if (var10.length <= 1) {
				return null;
			} else {
				class1185 var11;
				try {
					var11 = method2817(var10);
				} catch (Exception var19) {
					throw new RuntimeException(var19.getMessage() + " " + var8);
				}
				var11.field12373 = arg0;
				field8187.method2968(var11, (long) var8 << 16);
				return var11;
			}
		} else if (var5.length <= 1) {
			return null;
		} else {
			class1185 var6;
			try {
				var6 = method2817(var5);
			} catch (Exception var18) {
				throw new RuntimeException(var18.getMessage() + " " + var3);
			}
			var6.field12373 = arg0;
			field8187.method2968(var6, (long) var3 << 16);
			return var6;
		}
	}

	@ObfuscatedName("ek.k([BS)Lasc;")
	public static class1185 method2817(byte[] arg0) {
		return new class1185(new class997(arg0), Statics.field4626);
	}
}
