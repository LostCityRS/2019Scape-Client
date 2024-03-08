package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ji")
public class class280 {

	@ObfuscatedName("ji.m")
	public static int field2946 = -1;

	@ObfuscatedName("ji.o")
	public static boolean field2944 = false;

	@ObfuscatedName("ji.q")
	public static int field2945 = -1;

	public class280() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("jb.e(I)V")
	public static void method4883() {
		field2944 = true;
		Statics.field8535 = class10.field470;
		Statics.field4407 = class10.field481;
		client.method9620(false);
		class432.method3670();
		Statics.field2938 = null;
		Statics.field1833 = null;
		client.method6972(5);
	}

	@ObfuscatedName("nt.n(B)Z")
	public static boolean method6040() {
		return field2944;
	}

	@ObfuscatedName("adf.m(I)V")
	public static void method15243() {
		if (Statics.field2938 == null) {
			Statics.field2938 = class277.method4920();
			Statics.field3419 = Statics.field2938[0];
			Statics.field7966 = class213.method3655();
		}
		if (Statics.field593 == null) {
			method254();
		}
		class277 var0 = Statics.field3419;
		int var1 = method7622();
		if (Statics.field3419 == var0) {
			Statics.field2942 = Statics.field3419.field2908.method15021(Statics.field1680);
			Statics.field4964 = Statics.field2942;
			if (Statics.field3419.field2926) {
				Statics.field9130 = (Statics.field3419.field2924 - Statics.field3419.field2923) * var1 / 100 + Statics.field3419.field2923;
			}
			if (Statics.field3419.field2925) {
				Statics.field4964 = Statics.field4964 + " - " + Statics.field9130 + "%";
			}
		} else if (Statics.field3419 == class277.field2919) {
			Statics.field593 = null;
			client.method6972(4);
			if (field2944) {
				field2944 = false;
				class10.method665(Statics.field8535, Statics.field4407, "", false);
			}
		} else {
			Statics.field2942 = var0.field2922.method15021(Statics.field1680);
			Statics.field4964 = Statics.field2942;
			if (Statics.field3419.field2925) {
				Statics.field4964 = Statics.field4964 + " - " + var0.field2924 + "%";
			}
			Statics.field9130 = var0.field2924;
			if (Statics.field3419.field2926 || var0.field2926) {
				Statics.field7966 = class213.method3655();
			}
		}
		if (Statics.field593 == null) {
			return;
		}
		Statics.field593.method4849(Statics.field7966, Statics.field2942, Statics.field4964, Statics.field9130, Statics.field3419);
		if (Statics.field2939 == null) {
			return;
		}
		for (int var2 = field2946 + 1; var2 < Statics.field2939.length; var2++) {
			if (Statics.field2939[var2].method4912() >= 100 && field2946 == var2 - 1 && client.field10791 != 5 && Statics.field593.method4857()) {
				try {
					Statics.field2939[var2].method4916();
				} catch (Exception var4) {
					Statics.field2939 = null;
					break;
				}
				Statics.field593.method4879(Statics.field2939[var2]);
				field2946++;
				if (field2946 >= Statics.field2939.length - 1 && Statics.field2939.length > 1) {
					field2946 = Statics.field2841.method15223() ? 0 : -1;
				}
			}
		}
	}

	@ObfuscatedName("l.k(B)V")
	public static void method254() {
		if (Statics.field3419 != null) {
			Statics.field593 = new class275();
			Statics.field593.method4849(Statics.field7966, Statics.field3419.field2908.method15021(Statics.field1680), Statics.field3419.field2908.method15021(Statics.field1680), Statics.field3419.field2923, Statics.field3419);
			Statics.field2940 = new Thread(Statics.field593, "");
			Statics.field2940.start();
		}
	}

	@ObfuscatedName("dk.f(ZI)V")
	public static void method2010(boolean arg0) {
		if (Statics.field593 == null) {
			method254();
		}
		if (arg0) {
			Statics.field593.method4845();
		}
	}

	@ObfuscatedName("gt.w(I)I")
	public static int method3583() {
		return Statics.field593.method4846();
	}

	@ObfuscatedName("apb.l(I)V")
	public static void method18929() {
		if (Statics.field2939 == null) {
			return;
		}
		class281[] var0 = Statics.field2939;
		for (int var1 = 0; var1 < var0.length; var1++) {
			class281 var2 = var0[var1];
			var2.method4916();
		}
	}

	@ObfuscatedName("gt.u(I)I")
	public static int method3584() {
		int var0 = Statics.field3419.field2920;
		if (var0 < Statics.field2938.length - 1) {
			Statics.field3419 = Statics.field2938[var0 + 1];
		}
		return 100;
	}

	@ObfuscatedName("rm.z(I)I")
	public static int method7622() {
		if (Statics.field688.field11536.method18740() == 0) {
			for (int var0 = 0; var0 < client.field10819; var0++) {
				if (client.field11067[var0].method9131() == 's' || client.field11067[var0].method9131() == 'S') {
					Statics.field688.method18157(Statics.field688.field11536, 1);
					client.field10812 = true;
					class576.method6971(class770.field8880);
					break;
				}
			}
		}
		if (Statics.field3419 == class277.field2913) {
			if (Statics.field1833 == null) {
				Statics.field1833 = new class437(Statics.field4489, Statics.field4436, Statics.field4479, class34.field623, class34.field625);
			}
			if (!Statics.field1833.method6834()) {
				return 0;
			}
			client.method3596(0, null, true);
			Statics.field2941 = !class278.method4062();
			Statics.field8522 = client.method5156(Statics.field2941 ? class759.field8827 : class759.field8805, false, 1, true, true);
			Statics.field8532 = client.method5156(class759.field8826, false, 1, true, true);
			Statics.field7672 = client.method5156(class759.field8807, false, 1, true, true);
			Statics.field1587 = client.method5156(class759.field8823, true, 1, true, true);
		}
		if (Statics.field3419 == class277.field2911) {
			boolean var1 = Statics.field8532.method6896();
			boolean var2 = Statics.field1587.method6896();
			int var3 = Statics.field6888[class759.field8826.method14917()].method16823();
			int var4 = var3 + Statics.field6888[Statics.field2941 ? class759.field8827.method14917() : class759.field8805.method14917()].method16823();
			int var5 = var4 + Statics.field6888[class759.field8807.method14917()].method16823();
			int var6 = var5 + (var2 ? 100 : Statics.field1587.method6893());
			int var7 = var6 + (var1 ? 100 : Statics.field8532.method6893());
			if (var7 != 500) {
				return var7 / 5;
			}
			Statics.field11389 = new class629(Statics.field1587);
			Statics.field7921 = new class623(Statics.field1587);
			class14.method3470(Statics.field11389);
			int var8 = Statics.field688.field11559.method18714();
			Statics.field2841 = new class797(client.field10768, Statics.field1680, Statics.field8532);
			class799[] var9 = Statics.field2841.method15218(var8);
			if (var9.length == 0) {
				var9 = Statics.field2841.method15218(0);
			}
			class297 var10 = new class297(Statics.field8522, Statics.field7672);
			if (var9.length > 0) {
				Statics.field2939 = new class281[var9.length];
				for (int var11 = 0; var11 < Statics.field2939.length; var11++) {
					Statics.field2939[var11] = new class278(Statics.field2841.method15217(var9[var11].field9217), var9[var11].field9215, var9[var11].field9216, var10);
				}
			}
		}
		if (Statics.field3419 == class277.field2904) {
			Statics.field7538 = new class402(Statics.field8198, Statics.field8522, Statics.field7672, class14.method845());
		}
		if (Statics.field3419 == class277.field2905) {
			int var12 = Statics.field7538.method6179();
			int var13 = Statics.field7538.method6161();
			if (var12 < var13) {
				return var12 * 100 / var13;
			}
		}
		if (Statics.field3419 == class277.field2906) {
			if (Statics.field2939 != null && Statics.field2939.length > 0) {
				if (Statics.field2939[0].method4912() < 100) {
					return 0;
				}
				if (Statics.field2939.length > 1 && Statics.field2841.method15223() && Statics.field2939[1].method4912() < 100) {
					return 0;
				}
			}
			Statics.field7538.method6157(client.field10833);
			class14.method7114(Statics.field8198);
			client.method6972(11);
		}
		if (Statics.field3419 == class277.field2907) {
			Statics.field10317 = client.method5156(class759.field8804, false, 1, false, true);
			Statics.field7420 = client.method5156(class759.field8815, false, 1, false, true);
			Statics.field10287 = client.method5156(class759.field8806, false, 1, false, true);
			Statics.field11262 = client.method5156(class759.field8799, false, 1, false, true);
			Statics.field11838 = client.method5156(class759.field8822, false, 1, true, true);
			Statics.field7283 = client.method5156(class759.field8834, false, 1, true, true);
			Statics.field527 = client.method5156(class759.field8839, false, 1, true, true);
			Statics.field11752 = client.method5156(class759.field8816, true, 1, false, true);
			Statics.field9213 = client.method5156(class759.field8808, false, 1, false, true);
			Statics.field1450 = client.method5156(class759.field8836, true, 1, false, true);
			Statics.field8741 = client.method5156(class759.field8803, false, 1, false, true);
			Statics.field5010 = client.method5156(class759.field8800, false, 1, true, true);
			Statics.field2613 = client.method5156(class759.field8820, true, 1, false, false);
			Statics.field3085 = client.method5156(class759.field8829, true, 1, false, false);
			Statics.field4475 = client.method5156(class759.field8809, false, 1, true, true);
			Statics.field8700 = client.method5156(class759.field8842, false, 1, true, true);
			Statics.field4618 = client.method5156(class759.field8818, false, 1, true, true);
			Statics.field7537 = client.method5156(class759.field8812, false, 1, true, true);
			Statics.field8285 = client.method5156(class759.field8813, false, 1, true, true);
			Statics.field2149 = client.method5156(class759.field8814, false, 1, true, true);
			Statics.field3611 = client.method5156(class759.field8825, false, 1, true, true);
			Statics.field10752 = client.method5156(class759.field8798, true, 1, false, false);
			Statics.field8332 = client.method5156(class759.field8830, true, 1, false, true);
			Statics.field4404 = client.method5156(class759.field8817, false, 1, true, true);
			Statics.field1935 = client.method5156(class759.field8821, false, 1, true, true);
			Statics.field10249 = client.method5156(class759.field8819, true, 1, true, true);
			Statics.field6879 = client.method5156(class759.field8811, false, 1, true, true);
			Statics.field736 = client.method5156(class759.field8810, false, 1, true, true);
			Statics.field3808 = client.method5156(class759.field8828, true, 1, false, true);
			Statics.field7060 = client.method5156(class759.field8801, true, 1, false, true);
			Statics.field2900 = client.method5156(class759.field8824, true, 1, true, true);
		}
		if (Statics.field3419 == class277.field2921) {
			int var14 = 0;
			int var15 = 0;
			for (int var16 = 0; var16 < Statics.field6888.length; var16++) {
				if (Statics.field6888[var16] != null) {
					var14 += Statics.field6888[var16].method16823();
					var15++;
				}
			}
			if (var15 > 0) {
				var14 /= var15;
			}
			if (var14 != 100) {
				if (field2945 < 0) {
					field2945 = var14;
				}
				return (var14 - field2945) * 100 / (100 - field2945);
			}
			class14.method16430(Statics.field11389);
			Statics.field7538 = new class402(Statics.field8198, Statics.field10317, Statics.field7672, class14.method845());
		}
		if (Statics.field3419 == class277.field2909) {
			byte[] var17 = Statics.field1587.method6894(class628.field7705.field7708);
			if (var17 == null) {
				return 0;
			}
			Statics.field1798 = new class183();
			Statics.field1798.method3148(50, 7340032);
			method714(var17);
			client.method6972(1);
		}
		if (Statics.field3419 == class277.field2910 && Statics.field10577 == null) {
			Statics.field10577 = new class536(Statics.field7060);
			class500.method14694(Statics.field10577);
		}
		if (Statics.field3419 == class277.field2902) {
			int var18 = class432.method5140();
			if (var18 < 100) {
				return var18;
			}
			Statics.method987(Statics.field1587.method6894(class628.field7701.field7708));
			Statics.field7577 = Statics.field11389.field7731;
			Statics.field1434 = Statics.field11389.field7729;
			Statics.field10766 = Statics.field11389.field7714;
			Statics.field9259 = Statics.field11389.field7734;
			if (Statics.field11389.field7739 != -1 && Statics.field11389.field7740 != -1) {
				client.field10941 = Statics.field11389.field7739;
				client.field10942 = Statics.field11389.field7740;
			}
			Statics.field1709 = new class631(Statics.field1587);
			Statics.field2767 = new class620(Statics.field1587);
			Statics.field1971 = new class622(Statics.field1587);
			Statics.field2775 = new class625(Statics.field1587);
			Statics.field6792 = new class626(Statics.field1587);
		}
		if (Statics.field3419 == class277.field2912) {
			if (Statics.field11389.field7738 != -1 && !Statics.field9213.method6888(Statics.field11389.field7738, 0)) {
				return 99;
			}
			Statics.field7366 = new class125(Statics.field10249);
			Statics.field7669 = new class847(Statics.field1450);
			Statics.field3086 = new class1099(client.field10768, Statics.field1680, Statics.field11838);
			Statics.field11742 = new class1089(client.field10768, Statics.field1680, Statics.field11838);
			Statics.field2427 = new class1091(client.field10768, Statics.field1680, Statics.field11838, Statics.field10317);
			Statics.field9123 = new class758(client.field10768, Statics.field1680, Statics.field11838, class655.field8013, 64, new class762(class745.class));
			Statics.field1840 = new class758(client.field10768, Statics.field1680, Statics.field11838, class655.field8012, 16, new class762(class793.class));
			Statics.field8514 = new class1096(client.field10768, Statics.field1680, Statics.field8700);
			Statics.field8168 = new class1092(client.field10768, Statics.field1680, Statics.field11838);
			Statics.field8145 = new class1094(client.field10768, Statics.field1680, Statics.field11838);
			Statics.field2936 = new class1088(client.field10768, Statics.field1680, Statics.field11838, Statics.field10317);
			Statics.field4894 = new class1086(client.field10768, Statics.field1680, Statics.field11838, Statics.field10317);
			Statics.field2628 = new class1084(client.field10768, Statics.field1680, Statics.field11838, Statics.field9213);
			Statics.field7762 = new class1100(client.field10768, Statics.field1680, Statics.field11838);
			Statics.field7943 = new class1098(client.field10768, Statics.field1680, Statics.field11838);
			Statics.field1897 = new class1090(client.field10768, Statics.field1680, true, Statics.field4475, Statics.field9213);
			client.field10855.method7733(Statics.field1897);
			Statics.field3183.method7674(new class1090(client.field10768, Statics.field1680, true, Statics.field4475, Statics.field9213));
			Statics.field5011 = new class1081(client.field10768, Statics.field1680, Statics.field11838, Statics.field10317);
			Statics.field4241 = new class1097(client.field10768, Statics.field1680, Statics.field11838, Statics.field10317);
			Statics.field7961 = new class1082(client.field10768, Statics.field1680, true, Statics.field4618, Statics.field9213);
			Statics.field1842 = new class1095(client.field10768, Statics.field1680, true, Statics.field3086, Statics.field7537, Statics.field9213);
			Statics.field1972 = new class1101(client.field10768, Statics.field1680, Statics.field11838, true);
			Statics.field10771 = new class1079(client.field10768, Statics.field1680, Statics.field11838);
			Statics.field8797 = new class1080(client.field10768, Statics.field1680, Statics.field8285, Statics.field7420, Statics.field10287, Statics.field11262, Statics.field10771);
			Statics.field2879 = new class1087(client.field10768, Statics.field1680, Statics.field11838);
			Statics.field687 = new class1083(client.field10768, Statics.field1680, Statics.field11838);
			Statics.field4874 = new class1093(client.field10768, Statics.field1680, Statics.field2149, Statics.field9213);
			Statics.field7713 = new class1102(client.field10768, Statics.field1680, Statics.field3611, true);
			Statics.field8911 = new class807(client.field10768, class455.field4592, Statics.field1680, Statics.field11838);
			Statics.field8485 = new class806(client.field10768, class455.field4594, Statics.field1680, Statics.field11838);
			Statics.field8135 = new class807(client.field10768, class455.field4596, Statics.field1680, Statics.field11838);
			Statics.field8783 = new class807(client.field10768, class455.field4600, Statics.field1680, Statics.field11838);
			Statics.field12225 = new class807(client.field10768, class455.field4597, Statics.field1680, Statics.field11838);
			Statics.field3415 = new class807(client.field10768, class455.field4599, Statics.field1680, Statics.field11838);
			Statics.field1819 = new class807(client.field10768, class455.field4602, Statics.field1680, Statics.field11838);
			Statics.field1232 = class808.method15149(new class808[] { Statics.field8911, Statics.field8485, Statics.field8135, Statics.field8783, Statics.field12225, Statics.field3415, Statics.field1819 });
			Statics.field8736 = new class1085(client.field10768, Statics.field1680, Statics.field11838, Statics.field1232);
			Statics.field4626 = new class279();
			class226.method3669(Statics.field527, Statics.field9213, Statics.field10317, Statics.field7672);
			Statics.field9211 = new class382(Statics.field736);
			Statics.field2013 = new class377(Statics.field6879);
			Statics.field7282 = new class380(Statics.field6879);
			Statics.field3823 = new class458(Statics.field1680, Statics.field4404, Statics.field1935);
			Statics.field489 = new class768(Statics.field1680, Statics.field4404, Statics.field1935, new class374());
			Statics.field7410 = new class36(Statics.field8485, Statics.field8736, Statics.field2767.method9784());
			client.method9516();
			class721.method6114(Statics.field8797);
			class633.method706(Statics.field7282, Statics.field2013);
			class502.method13864(Statics.field9213, Statics.field7366, Statics.field7669);
			class245 var19 = new class245(Statics.field8741.method6906("huffman", ""));
			class246.method4338(var19);
			Statics.field6594 = class511.method6109();
			Statics.field10581 = new class1000(true);
		}
		if (Statics.field3419 == class277.field2918) {
			int var20 = class14.method15381(Statics.field10317) + Statics.field7538.method6191(true);
			int var21 = Statics.method14611() + Statics.field7538.method6161();
			if (var20 < var21) {
				return var20 * 100 / var21;
			}
		}
		if (Statics.field3419 == class277.field2914) {
			class541.method8506(Statics.field10752, Statics.field8332, Statics.field8168, Statics.field8145, client.field10855.method7750(), Statics.field5011, Statics.field4241, Statics.field7410, Statics.field7410);
		}
		if (Statics.field3419 == class277.field2915) {
			Statics.field7228 = new class861(Statics.field8911);
			method9212();
			Statics.field1895 = class28.method18618();
			Statics.field11752.method6900(false, true);
			Statics.field10317.method6900(true, true);
			Statics.field7672.method6900(true, true);
			Statics.field8741.method6900(true, true);
			client.field10807 = true;
		}
		if (Statics.field3419 == class277.field2916 && Statics.field11389.field7724 != -1) {
			if (!class226.method5364(Statics.field11389.field7724, null)) {
				return 0;
			}
			boolean var22 = true;
			for (int var23 = 0; var23 < Statics.field11725[Statics.field11389.field7724].field2151.length; var23++) {
				class226 var24 = Statics.field11725[Statics.field11389.field7724].field2151[var23];
				if (var24.field2184 == 5 && var24.field2215 != -1 && !Statics.field10317.method6888(var24.field2215, 0)) {
					var22 = false;
				}
			}
			if (!var22) {
				return 0;
			}
		}
		if (Statics.field3419 == class277.field2917) {
			client.method7227(true);
		}
		if (Statics.field3419 == class277.field2903) {
			Statics.field593.method4856();
			try {
				Statics.field2940.join();
			} catch (InterruptedException var26) {
				return 0;
			}
			Statics.field593 = null;
			Statics.field2940 = null;
			Statics.field8522 = null;
			Statics.field8532 = null;
			Statics.field2841 = null;
			Statics.field2939 = null;
			Statics.field8540.remove(class759.field8826);
			Statics.field8540.remove(class759.field8805);
			Statics.field8540.remove(class759.field8827);
			class278.method271();
			client.field10779 = Statics.field688.field11536.method18740() == 1;
			Statics.field688.method18157(Statics.field688.field11536, 1);
			if (client.field10779) {
				Statics.field688.method18157(Statics.field688.field11524, 0);
			} else if (Statics.field688.field11524.field11771 && Statics.field10581.field11613 < 512 && Statics.field10581.field11613 != 0) {
				Statics.field688.method18157(Statics.field688.field11524, 0);
			}
			class48.method16391();
			if (client.field10779) {
				client.method486(0, false);
				if (!client.field10812) {
					class576.method6971(class770.field8881);
				}
			} else {
				client.method486(Statics.field688.field11524.method18545(), false);
				if (Statics.field688.field11524.method18545() == 0) {
					class576.method6971(class770.field8882);
				}
			}
			client.method13880(Statics.field688.field11542.method18539(), -1, -1, false);
			Statics.field7538.method6157(client.field10833);
			class14.method7114(Statics.field8198);
			class14.method5202(Statics.field8198, Statics.field10317);
		}
		return method3584();
	}

	@ObfuscatedName("al.d([BB)V")
	public static void method714(byte[] arg0) {
		class997 var1 = new class997(arg0);
		while (true) {
			int var2 = var1.method17904();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				int var3 = var1.method17906();
				Statics.field1798.method3171(var3);
			}
		}
	}

	@ObfuscatedName("ux.c(I)V")
	public static void method9212() {
		class752 var0 = class507.method18567("2", client.field10768.field8333, false);
		Statics.field7228.method16420(var0);
	}

	@ObfuscatedName("ss.r(B)V")
	public static void method8005() {
		if (Statics.field593 != null) {
			Statics.field593.method4856();
		}
		if (Statics.field2940 == null) {
			return;
		}
		while (true) {
			try {
				Statics.field2940.join();
				break;
			} catch (InterruptedException var1) {
			}
		}
	}
}
