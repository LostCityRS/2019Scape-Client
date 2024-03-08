package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ajt")
public final class class962 extends class532 {

	@ObfuscatedName("ajt.k")
	public int field11238;

	@ObfuscatedName("ajt.f")
	public int field11229;

	@ObfuscatedName("ajt.w")
	public int field11226;

	@ObfuscatedName("ajt.l")
	public int field11228;

	@ObfuscatedName("ajt.u")
	public int field11227;

	@ObfuscatedName("ajt.z")
	public int field11231;

	@ObfuscatedName("ajt.p")
	public int field11232;

	@ObfuscatedName("ajt.d")
	public class420 field11233;

	@ObfuscatedName("ajt.c")
	public int field11234;

	@ObfuscatedName("ajt.r")
	public int field11235;

	@ObfuscatedName("ajt.v")
	public int field11236;

	@ObfuscatedName("ajt.o")
	public class420 field11230;

	@ObfuscatedName("ajt.s")
	public class597 field11241;

	@ObfuscatedName("ajt.y")
	public boolean field11239 = true;

	@ObfuscatedName("ajt.q")
	public boolean field11240 = false;

	@ObfuscatedName("ajt.x")
	public static class715 field11237 = new class715();

	@ObfuscatedName("ajt.b")
	public static class715 field11242 = new class715();

	@ObfuscatedName("ajt.h")
	public static long field11243 = 1L;

	@ObfuscatedName("jf.e(IIIIIIILoe;B)V")
	public static void method4653(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class420 arg7) {
		class962 var8 = null;
		for (class962 var9 = (class962) field11237.method14191(); var9 != null; var9 = (class962) field11237.method14161()) {
			if (var9.field11238 == arg0 && var9.field11226 == arg1 && var9.field11228 == arg2 && var9.field11229 == arg3) {
				var8 = var9;
				break;
			}
		}
		if (var8 == null) {
			var8 = new class962();
			var8.field11238 = arg0;
			var8.field11229 = arg3;
			var8.field11226 = arg1;
			var8.field11228 = arg2;
			if (arg1 >= 0 && arg2 >= 0 && arg1 < client.field10855.method7728() && arg2 < client.field10855.method7758()) {
				method9023(var8);
			}
			field11237.method14153(var8);
		}
		var8.field11234 = arg4;
		var8.field11236 = arg5;
		var8.field11235 = arg6;
		if (arg7 != null) {
			var8.field11230 = new class420(arg7);
		}
		var8.field11239 = true;
		var8.field11240 = false;
	}

	@ObfuscatedName("pa.n(IIIIIILvp;B)V")
	public static void method6816(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class597 arg6) {
		class962 var7 = null;
		for (class962 var8 = (class962) field11242.method14191(); var8 != null; var8 = (class962) field11242.method14161()) {
			if (var8.field11238 == arg0 && var8.field11226 == arg1 && var8.field11228 == arg2 && var8.field11229 == arg3) {
				var7 = var8;
				break;
			}
		}
		if (var7 == null) {
			var7 = new class962();
			var7.field11238 = arg0;
			var7.field11229 = arg3;
			var7.field11226 = arg1;
			var7.field11228 = arg2;
			field11242.method14153(var7);
		}
		var7.field11234 = arg4;
		var7.field11236 = arg5;
		var7.field11241 = arg6;
		var7.field11239 = true;
		var7.field11240 = false;
	}

	@ObfuscatedName("jx.m(B)V")
	public static final void method5070() {
		for (class962 var0 = (class962) field11237.method14191(); var0 != null; var0 = (class962) field11237.method14161()) {
			if (var0.field11240) {
				var0.method8440();
			} else {
				var0.field11239 = true;
				if (var0.field11226 >= 0 && var0.field11228 >= 0 && var0.field11226 < client.field10855.method7728() && var0.field11228 < client.field10855.method7758()) {
					method9023(var0);
				}
			}
		}
		for (class962 var1 = (class962) field11242.method14191(); var1 != null; var1 = (class962) field11242.method14161()) {
			if (var1.field11240) {
				var1.method8440();
			} else {
				var1.field11239 = true;
			}
		}
	}

	@ObfuscatedName("uf.k(Lajt;B)V")
	public static final void method9023(class962 arg0) {
		class550 var1 = client.field10855.method7743();
		if (var1 == null) {
			return;
		}
		class514 var2 = null;
		if (arg0.field11229 == 0) {
			var2 = (class514) var1.method8711(arg0.field11238, arg0.field11226, arg0.field11228);
		}
		if (arg0.field11229 == 1) {
			var2 = (class514) var1.method8735(arg0.field11238, arg0.field11226, arg0.field11228);
		}
		if (arg0.field11229 == 2) {
			var2 = (class514) var1.method8856(arg0.field11238, arg0.field11226, arg0.field11228, client.field11001);
		}
		if (arg0.field11229 == 3) {
			var2 = (class514) var1.method8767(arg0.field11238, arg0.field11226, arg0.field11228);
		}
		if (var2 == null) {
			arg0.field11227 = -1;
			arg0.field11232 = 0;
			arg0.field11231 = 0;
		} else {
			arg0.field11227 = var2.method8223();
			arg0.field11232 = var2.method8220();
			arg0.field11231 = var2.method8204();
		}
		if (var2 instanceof class1019) {
			class1019 var3 = (class1019) var2;
			arg0.field11230 = var3.field11711 == null ? null : new class420(var3.field11711);
		}
	}

	@ObfuscatedName("eq.w(Lajt;ZI)V")
	public static final void method2834(class962 arg0, boolean arg1) {
		if (arg0.field11240) {
			if (arg0.field11227 < 0 || class938.method14705(client.field10855.method7750(), arg0.field11227, arg0.field11232)) {
				if (arg1) {
					method9194(arg0.field11238, arg0.field11229, arg0.field11226, arg0.field11228, null);
				} else {
					method15005(arg0.field11238, arg0.field11229, arg0.field11226, arg0.field11228, arg0.field11227, arg0.field11231, arg0.field11232, arg0.field11233, -1, 0);
				}
				arg0.method8440();
			}
		} else if (arg0.field11239 && arg0.field11226 >= 1 && arg0.field11228 >= 1 && arg0.field11226 <= client.field10855.method7728() - 2 && arg0.field11228 <= client.field10855.method7758() - 2 && (arg0.field11234 < 0 || class938.method14705(client.field10855.method7750(), arg0.field11234, arg0.field11236))) {
			if (arg1) {
				method9194(arg0.field11238, arg0.field11229, arg0.field11226, arg0.field11228, arg0.field11241);
			} else {
				method15005(arg0.field11238, arg0.field11229, arg0.field11226, arg0.field11228, arg0.field11234, arg0.field11235, arg0.field11236, arg0.field11230, -1, 0);
			}
			arg0.field11239 = false;
			if (!arg1 && arg0.field11234 == arg0.field11227 && arg0.field11227 == -1) {
				arg0.method8440();
			} else if (!arg1 && arg0.field11234 == arg0.field11227 && arg0.field11235 == arg0.field11231 && arg0.field11236 == arg0.field11232) {
				arg0.method8440();
			}
		}
	}

	@ObfuscatedName("acv.l(IIIIIIILoe;IIB)V")
	public static final void method15005(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class420 arg7, int arg8, int arg9) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.field10855.method7728() - 2 || arg3 > client.field10855.method7758() - 2) {
			return;
		}
		int var10 = arg0;
		if (arg0 < 3 && client.field10855.method7793().method7105(arg2, arg3)) {
			var10 = arg0 + 1;
		}
		if (client.field10855.method7743() == null) {
			return;
		}
		client.field10855.method7744().method16871(Statics.field8198, arg0, arg1, arg2, arg3);
		if (arg4 >= 0) {
			int var11 = Statics.field688.field11526.method18489();
			Statics.field688.method18157(Statics.field688.field11526, 1);
			client.field10855.method7744().method16867(Statics.field8198, var10, arg0, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg7);
			Statics.field688.method18157(Statics.field688.field11526, var11);
		}
		class42.method16444(Statics.field4490.field11717);
	}

	@ObfuscatedName("ud.u(IIIILvp;I)V")
	public static final void method9194(int arg0, int arg1, int arg2, int arg3, class597 arg4) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.field10855.method7728() - 2 || arg3 > client.field10855.method7758() - 2) {
			return;
		}
		if (client.field10855.method7743() == null) {
			return;
		}
		class514 var5 = client.field10855.method7744().method16899(arg0, arg1, arg2, arg3);
		if (var5 == null) {
			return;
		}
		if (var5 instanceof class946) {
			((class946) var5).method17369(arg4);
		} else if (var5 instanceof class947) {
			((class947) var5).method17396(arg4);
		} else if (var5 instanceof class952) {
			((class952) var5).method17429(arg4);
		} else if (var5 instanceof class951) {
			((class951) var5).method17425(arg4);
		}
	}
}
