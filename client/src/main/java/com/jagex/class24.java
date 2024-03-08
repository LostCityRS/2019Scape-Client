package com.jagex;

import com.jagex.deob.ObfuscatedName;
import com.jagex.deob.Statics;
import java.io.IOException;

@ObfuscatedName("y")
public class class24 {

	@ObfuscatedName("y.m")
	public static int field583 = 0;

	@ObfuscatedName("y.k")
	public static int field580 = 0;

	public class24() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("dk.e(I)V")
	public static void method2009() {
		if (client.field10791 == 4 && (!class10.method2865() && !method9610())) {
			client.method6972(12);
		}
	}

	@ObfuscatedName("amf.n(B)V")
	public static void method18476() {
		Statics.field517 = class15.field515;
		Statics.field584 = class704.field8368;
		Statics.field4406 = class705.field8390;
		Statics.field872 = class707.field8397;
		Statics.field585 = class706.field8394;
		Statics.field2589 = class708.field8407;
		Statics.field618 = null;
	}

	@ObfuscatedName("wa.m(I)Z")
	public static boolean method9610() {
		return Statics.field517 != null;
	}

	@ObfuscatedName("w.k(Ljava/lang/String;B)V")
	public static void method233(String arg0) {
		if (client.field10791 != 0) {
			return;
		}
		class983 var1 = Statics.method1604(class390.field3710, client.field10835.field794);
		var1.field11432.method17945(0);
		int var2 = var1.field11432.field11503;
		var1.field11432.method17893(arg0);
		var1.field11432.field11503 += -1529454093;
		var1.field11432.method17932(Statics.field581, var2, var1.field11432.field11503);
		var1.field11432.method17898(var1.field11432.field11503 - var2);
		client.field10835.method934(var1);
		Statics.field872 = class707.field8400;
	}

	@ObfuscatedName("alb.f(Ljava/lang/String;I)V")
	public static void method18305(String arg0) {
		if (client.field10791 != 0) {
			return;
		}
		class983 var1 = Statics.method1604(class390.field3693, client.field10835.field794);
		var1.field11432.method18001(0);
		int var2 = var1.field11432.field11503;
		var1.field11432.method17893(arg0);
		var1.field11432.field11503 += -1529454093;
		var1.field11432.method17932(Statics.field581, var2, var1.field11432.field11503);
		var1.field11432.method18028(var1.field11432.field11503 - var2);
		client.field10835.method934(var1);
		Statics.field2589 = class708.field8405;
	}

	@ObfuscatedName("ae.w(I)V")
	public static void method648() {
		if (client.field10791 == 0) {
			class983 var0 = Statics.method1604(class390.field3743, client.field10835.field794);
			client.field10835.method934(var0);
			Statics.field585 = class706.field8392;
			Statics.field618 = null;
		}
	}

	@ObfuscatedName("arv.l(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;I)V")
	public static void method19266(String arg0, String arg1, int arg2, boolean arg3, String arg4) {
		if (client.field10791 != 0) {
			return;
		}
		class983 var5 = Statics.method1604(class390.field3702, client.field10835.field794);
		var5.field11432.method17945(0);
		int var6 = var5.field11432.field11503;
		var5.field11432.method17893(arg0);
		var5.field11432.method17893(arg1);
		var5.field11432.method18001(arg2);
		var5.field11432.method18001(arg3 ? 1 : 0);
		var5.field11432.method17893(arg4);
		var5.field11432.field11503 += -1529454093;
		var5.field11432.method17932(Statics.field581, var6, var5.field11432.field11503);
		var5.field11432.method17898(var5.field11432.field11503 - var6);
		client.field10835.method934(var5);
		if (arg2 < 13) {
			client.field10814 = true;
			client.method3094();
		}
		Statics.field4406 = class705.field8388;
	}

	@ObfuscatedName("afu.u(II)V")
	public static void method16428(int arg0) {
		if (client.field10791 == 0) {
			class983 var1 = Statics.method1604(class390.field3800, client.field10835.field794);
			var1.field11432.method18001(arg0);
			client.field10835.method934(var1);
		}
	}

	@ObfuscatedName("et.z(I)Lzl;")
	public static class704 method2858() {
		return Statics.field584 == null ? class704.field8361 : Statics.field584;
	}

	@ObfuscatedName("amf.p(I)Lzb;")
	public static class705 method18475() {
		return Statics.field4406 == null ? class705.field8390 : Statics.field4406;
	}

	@ObfuscatedName("vn.d(B)Lzx;")
	public static class707 method9583() {
		return Statics.field872 == null ? class707.field8397 : Statics.field872;
	}

	@ObfuscatedName("ahj.c(B)Lzr;")
	public static class708 method16613() {
		return Statics.field2589 == null ? class708.field8407 : Statics.field2589;
	}

	@ObfuscatedName("ahn.r(B)Lzg;")
	public static class706 method16742() {
		return Statics.field585 == null ? class706.field8394 : Statics.field585;
	}

	@ObfuscatedName("xh.v(B)Ljava/lang/String;")
	public static String method10209() {
		return Statics.field618;
	}

	@ObfuscatedName("gs.s(Lzx;I)V")
	public static void method3581(class707 arg0) {
		Statics.field872 = arg0;
	}

	@ObfuscatedName("ac.y(Lzr;B)V")
	public static void method717(class708 arg0) {
		Statics.field2589 = arg0;
	}

	@ObfuscatedName("jl.q(Lzg;I)V")
	public static void method4664(class706 arg0) {
		Statics.field585 = arg0;
		Statics.field618 = null;
	}

	@ObfuscatedName("cc.x(Ljava/lang/String;I)V")
	public static void method1587(String arg0) {
		Statics.field585 = class706.field8391;
		Statics.field618 = arg0;
	}

	@ObfuscatedName("ack.b(I)V")
	public static void method14952() {
		if (Statics.field517 == null) {
			return;
		}
		try {
			short var0;
			if (field580 == 0) {
				var0 = 250;
			} else {
				var0 = 2000;
			}
			field583++;
			if (field583 > var0) {
				Statics.method17428();
			}
			if (Statics.field517 == class15.field515) {
				client.field10835.method936(class561.method7130(Statics.field8751.method14764(), 40000), Statics.field8751.field8745);
				client.field10835.method952();
				class983 var1 = class983.method13920();
				var1.field11432.method18001(class391.field3815.field3812);
				var1.field11432.method17945(0);
				int var2 = var1.field11432.field11503;
				var1.field11432.method17945(910);
				var1.field11432.method17945(1);
				Statics.field581 = method4942(var1);
				int var3 = var1.field11432.field11503;
				var1.field11432.method17893(client.field10789);
				var1.field11432.method17945(client.field10772);
				var1.field11432.method17886(client.field10776);
				var1.field11432.method17886(client.field10775);
				var1.field11432.method17893(Statics.field579);
				var1.field11432.method18001(Statics.field1680.method1303());
				var1.field11432.method18001(client.field10768.field8339);
				class507.method4286(var1.field11432);
				String var4 = client.field10781;
				var1.field11432.method18001(var4 == null ? 0 : 1);
				if (var4 != null) {
					var1.field11432.method17893(var4);
				}
				Statics.field10581.method18188(var1.field11432);
				var1.field11432.field11503 += -1529454093;
				var1.field11432.method17932(Statics.field581, var3, var1.field11432.field11503);
				var1.field11432.method17898(var1.field11432.field11503 - var2);
				client.field10835.method934(var1);
				client.field10835.method933();
				Statics.field517 = class15.field516;
			}
			if (Statics.field517 == class15.field516) {
				if (client.field10835.method939() == null) {
					Statics.method17428();
					return;
				}
				if (!client.field10835.method939().method9038(1)) {
					return;
				}
				client.field10835.method939().method9029(client.field10835.field795.field11502, 0, 1);
				Statics.field584 = (class704) class686.method1897(class704.method16743(), client.field10835.field795.field11502[0] & 0xFF);
				if (Statics.field584 == class704.field8364) {
					client.field10835.field794 = new class734(Statics.field581);
					int[] var5 = new int[4];
					for (int var6 = 0; var6 < 4; var6++) {
						var5[var6] = Statics.field581[var6] + 50;
					}
					client.field10835.field809 = new class734(var5);
					new class734(var5);
					client.field10835.field795.method19566(client.field10835.field809);
					client.method6972(0);
					client.field10835.method952();
					client.field10835.field795.field11503 = 0;
					client.field10835.field790 = null;
					client.field10835.field806 = null;
					client.field10835.field805 = null;
					client.field10835.field789 = 0;
					Statics.field7410.field632.method9624();
					class1171.method716();
				} else {
					client.field10835.method938();
				}
				client.field10835.field796 = null;
				Statics.field517 = null;
			}
		} catch (IOException var8) {
			Statics.method17428();
		}
	}

	@ObfuscatedName("js.h(Lakl;B)[I")
	public static int[] method4942(class983 arg0) {
		class997 var1 = new class997(518);
		int[] var2 = new int[4];
		for (int var3 = 0; var3 < 4; var3++) {
			var2[var3] = (int) (Math.random() * 9.9999999E7D);
		}
		var1.method18001(10);
		var1.method17886(var2[0]);
		var1.method17886(var2[1]);
		var1.method17886(var2[2]);
		var1.method17886(var2[3]);
		for (int var4 = 0; var4 < 10; var4++) {
			var1.method17886((int) (Math.random() * 9.9999999E7D));
		}
		var1.method17945((int) (Math.random() * 9.9999999E7D));
		var1.method17907(class34.field624, class34.field626);
		arg0.field11432.method17896(var1.field11502, 0, var1.field11503);
		return var2;
	}
}
