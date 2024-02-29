package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public class Class75 {

	@OriginalMember(owner = "client!ad", name = "gy", descriptor = "Lclient!py;")
	public static Class497 aClass497_11;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "Z")
	static boolean aBoolean31 = false;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V", line = 11)
	Class75() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "()V", line = 16)
	public static void method1263() {
		if (aBoolean31) {
			return;
		}
		Class277.method26353(client.aClass532_1.method30481(-1472658235).aClass572ArrayArrayArray1, 2010590815);
		if (client.aClass532_1.method30481(-1813439572).aClass572ArrayArrayArray2 != null) {
			Class277.method26353(client.aClass532_1.method30481(-2000392838).aClass572ArrayArrayArray2, 1088151341);
		}
		aBoolean31 = true;
	}

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "([[[Lclient!tk;)V", line = 23)
	static void method1264(@OriginalArg(0) Class572[][][] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class572[][] local9 = arg0[local1];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(17) int local17 = 0; local17 < local9[local11].length; local17++) {
					@Pc(29) Class572 local29 = local9[local11][local17];
					if (local29 != null) {
						if (local29.aClass132_Sub1_Sub4_1 instanceof Interface61) {
							((Interface61) local29.aClass132_Sub1_Sub4_1).method13405(429773151);
						}
						if (local29.aClass132_Sub1_Sub3_1 instanceof Interface61) {
							((Interface61) local29.aClass132_Sub1_Sub3_1).method13405(-774193912);
						}
						if (local29.aClass132_Sub1_Sub3_2 instanceof Interface61) {
							((Interface61) local29.aClass132_Sub1_Sub3_2).method13405(725977458);
						}
						if (local29.aClass132_Sub1_Sub2_1 instanceof Interface61) {
							((Interface61) local29.aClass132_Sub1_Sub2_1).method13405(418386691);
						}
						if (local29.aClass132_Sub1_Sub2_2 instanceof Interface61) {
							((Interface61) local29.aClass132_Sub1_Sub2_2).method13405(-93241196);
						}
						for (@Pc(80) Class590 local80 = local29.aClass590_1; local80 != null; local80 = local80.aClass590_2) {
							@Pc(86) Class132_Sub1_Sub1 local86 = local80.aClass132_Sub1_Sub1_1;
							if (local86 instanceof Interface61) {
								((Interface61) local86).method13405(-882650282);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "([[[Lclient!tk;)V", line = 23)
	static void method1265(@OriginalArg(0) Class572[][][] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class572[][] local9 = arg0[local1];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(17) int local17 = 0; local17 < local9[local11].length; local17++) {
					@Pc(29) Class572 local29 = local9[local11][local17];
					if (local29 != null) {
						if (local29.aClass132_Sub1_Sub4_1 instanceof Interface61) {
							((Interface61) local29.aClass132_Sub1_Sub4_1).method13405(-1951219514);
						}
						if (local29.aClass132_Sub1_Sub3_1 instanceof Interface61) {
							((Interface61) local29.aClass132_Sub1_Sub3_1).method13405(-888523404);
						}
						if (local29.aClass132_Sub1_Sub3_2 instanceof Interface61) {
							((Interface61) local29.aClass132_Sub1_Sub3_2).method13405(-208629294);
						}
						if (local29.aClass132_Sub1_Sub2_1 instanceof Interface61) {
							((Interface61) local29.aClass132_Sub1_Sub2_1).method13405(-901845312);
						}
						if (local29.aClass132_Sub1_Sub2_2 instanceof Interface61) {
							((Interface61) local29.aClass132_Sub1_Sub2_2).method13405(-929253248);
						}
						for (@Pc(80) Class590 local80 = local29.aClass590_1; local80 != null; local80 = local80.aClass590_2) {
							@Pc(86) Class132_Sub1_Sub1 local86 = local80.aClass132_Sub1_Sub1_1;
							if (local86 instanceof Interface61) {
								((Interface61) local86).method13405(835583840);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "(CLclient!zt;I)I", line = 104)
	static int method1266(@OriginalArg(0) char arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local3 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == Class717.aClass717_12) {
			local3 = 1762;
		}
		return local3;
	}

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "(B)Lclient!ou;", line = 170)
	public static Class470 method1267(@OriginalArg(0) byte arg0) {
		@Pc(3) Class470 local3 = new Class470();
		local3.method29385(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793D * 2.0D));
		@Pc(23) float local23 = (float) (Math.random() * 0.5D + 0.5D) * 256.0F;
		local3.method29424(local23 - 128.0F, 0.0F, 0.0F);
		local3.method29403(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793D * 2.0D));
		return local3;
	}

	@OriginalMember(owner = "client!ad", name = "hr", descriptor = "(IB)V", line = 4664)
	static final void method1268(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		client.anIntArray327 = new int[arg0];
		client.anIntArray312 = new int[arg0];
		client.anIntArray313 = new int[arg0];
		client.anIntArray314 = new int[arg0];
		client.anIntArray302 = new int[arg0];
	}

	@OriginalMember(owner = "client!ad", name = "mp", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V", line = 7230)
	static final void method1269(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (Class532.method30597(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray12 = Class499.method30149(local13, arg2, -1334512652);
		arg0.aBoolean680 = true;
	}

	@OriginalMember(owner = "client!ad", name = "aan", descriptor = "(Lclient!yf;I)V", line = 9758)
	static final void method1270(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (client.anInt3572 * 825168203 == 0 || local12 >= client.anInt3573 * 1882800101) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = client.aClass177Array1[local12].aString124;
		}
	}

	@OriginalMember(owner = "client!ad", name = "aav", descriptor = "(Lclient!yf;B)V", line = 9787)
	static final void method1271(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (client.anInt3572 * 825168203 == 2 && local12 >= 0 && local12 < client.anInt3444 * 862418793) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aClass281Array1[local12].anInt3896 * 1129198739;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!ad", name = "abr", descriptor = "(Lclient!yf;I)V", line = 9805)
	static final void method1272(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class692.anInt5936 * 1714267873;
	}
}
