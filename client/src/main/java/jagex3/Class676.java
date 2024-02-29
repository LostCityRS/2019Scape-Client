package jagex3;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!y")
public final class Class676 {

	@OriginalMember(owner = "client!y", name = "n", descriptor = "[I")
	static int[] anIntArray518;

	@OriginalMember(owner = "client!y", name = "e", descriptor = "I")
	static final int anInt6045 = 3;

	@OriginalMember(owner = "client!y", name = "w", descriptor = "Lclient!zl;")
	static Class709 aClass709_1;

	@OriginalMember(owner = "client!y", name = "p", descriptor = "Lclient!zg;")
	static Class704 aClass704_1;

	@OriginalMember(owner = "client!y", name = "af", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray38;

	@OriginalMember(owner = "client!y", name = "m", descriptor = "I")
	static int anInt6046 = 0;

	@OriginalMember(owner = "client!y", name = "k", descriptor = "I")
	static int anInt6044 = 0;

	@OriginalMember(owner = "client!y", name = "i", descriptor = "()V")
	public static void method33349() {
		if (-849002901 * client.anInt3435 == 4 && (!Class251.method26066(1978708434) && !Class631.method32463(-2037447260))) {
			Class481.method29937(12, 1823202236);
		}
	}

	@OriginalMember(owner = "client!y", name = "g", descriptor = "()V")
	public static void method33350() {
		if (-849002901 * client.anInt3435 == 4 && (!Class251.method26066(-785900424) && !Class631.method32463(2033505897))) {
			Class481.method29937(12, 1823202236);
		}
	}

	@OriginalMember(owner = "client!y", name = "bo", descriptor = "(Lclient!akl;)[I")
	static int[] method33351(@OriginalArg(0) Class93_Sub22 arg0) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(518);
		@Pc(7) int[] local7 = new int[4];
		@Pc(9) int local9;
		for (local9 = 0; local9 < 4; local9++) {
			local7[local9] = (int) (Math.random() * 9.9999999E7D);
		}
		local4.method22522(10, (byte) -98);
		local4.method22407(local7[0], (byte) 53);
		local4.method22407(local7[1], (byte) 63);
		local4.method22407(local7[2], (byte) 43);
		local4.method22407(local7[3], (byte) 4);
		for (local9 = 0; local9 < 10; local9++) {
			local4.method22407((int) (Math.random() * 9.9999999E7D), (byte) 57);
		}
		local4.method22466((int) (Math.random() * 9.9999999E7D), 2137045299);
		local4.method22428(Class95.aBigInteger2, Class95.aBigInteger4, (byte) -49);
		arg0.aClass93_Sub41_Sub2_1.method22417(local4.aByteArray58, 0, local4.anInt3070 * 212851357, 2026842986);
		return local7;
	}

	@OriginalMember(owner = "client!y", name = "au", descriptor = "()V")
	public static void method33352() {
		if (client.anInt3435 * -849002901 == 0) {
			@Pc(10) Class93_Sub22 local10 = Class102.method2592(Class446.aClass446_63, client.aClass175_1.aClass24_2, (byte) 53);
			client.aClass175_1.method24363(local10, -1640495749);
			aClass704_1 = Class704.aClass704_3;
			Class355.aString190 = null;
		}
	}

	@OriginalMember(owner = "client!y", name = "t", descriptor = "()V")
	static void method33353() {
		Class588.aClass588_3 = Class588.aClass588_1;
		aClass709_1 = Class709.aClass709_11;
		Class490.aClass700_1 = Class700.aClass700_20;
		Class103.aClass721_1 = Class721.aClass721_2;
		aClass704_1 = Class704.aClass704_5;
		Class325.aClass715_1 = Class715.aClass715_5;
		Class355.aString190 = null;
	}

	@OriginalMember(owner = "client!y", name = "ae", descriptor = "()V")
	static void method33354() {
		Class588.aClass588_3 = Class588.aClass588_1;
		aClass709_1 = Class709.aClass709_11;
		Class490.aClass700_1 = Class700.aClass700_20;
		Class103.aClass721_1 = Class721.aClass721_2;
		aClass704_1 = Class704.aClass704_5;
		Class325.aClass715_1 = Class715.aClass715_5;
		Class355.aString190 = null;
	}

	@OriginalMember(owner = "client!y", name = "ah", descriptor = "()Z")
	static boolean method33355() {
		return Class588.aClass588_3 != null;
	}

	@OriginalMember(owner = "client!y", name = "al", descriptor = "()Z")
	static boolean method33356() {
		return Class588.aClass588_3 != null;
	}

	@OriginalMember(owner = "client!y", name = "ac", descriptor = "()Z")
	static boolean method33357() {
		return Class588.aClass588_3 != null;
	}

	@OriginalMember(owner = "client!y", name = "ai", descriptor = "()Z")
	static boolean method33358() {
		return Class588.aClass588_3 != null;
	}

	@OriginalMember(owner = "client!y", name = "ag", descriptor = "()Z")
	static boolean method33359() {
		return Class588.aClass588_3 != null;
	}

	@OriginalMember(owner = "client!y", name = "bq", descriptor = "(Lclient!zg;)V")
	static void method33360(@OriginalArg(0) Class704 arg0) {
		aClass704_1 = arg0;
		Class355.aString190 = null;
	}

	@OriginalMember(owner = "client!y", name = "bd", descriptor = "(Lclient!zx;)V")
	static void method33361(@OriginalArg(0) Class721 arg0) {
		Class103.aClass721_1 = arg0;
	}

	@OriginalMember(owner = "client!y", name = "an", descriptor = "()Lclient!zr;")
	public static Class715 method33362() {
		return Class325.aClass715_1 == null ? Class715.aClass715_5 : Class325.aClass715_1;
	}

	@OriginalMember(owner = "client!y", name = "am", descriptor = "()V")
	public static void method33363() {
		if (client.anInt3435 * -849002901 == 0) {
			@Pc(10) Class93_Sub22 local10 = Class102.method2592(Class446.aClass446_63, client.aClass175_1.aClass24_2, (byte) 73);
			client.aClass175_1.method24363(local10, -1997958176);
			aClass704_1 = Class704.aClass704_3;
			Class355.aString190 = null;
		}
	}

	@OriginalMember(owner = "client!y", name = "bz", descriptor = "(Lclient!akl;)[I")
	static int[] method33364(@OriginalArg(0) Class93_Sub22 arg0) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(518);
		@Pc(7) int[] local7 = new int[4];
		@Pc(9) int local9;
		for (local9 = 0; local9 < 4; local9++) {
			local7[local9] = (int) (Math.random() * 9.9999999E7D);
		}
		local4.method22522(10, (byte) -18);
		local4.method22407(local7[0], (byte) -32);
		local4.method22407(local7[1], (byte) 72);
		local4.method22407(local7[2], (byte) -6);
		local4.method22407(local7[3], (byte) 7);
		for (local9 = 0; local9 < 10; local9++) {
			local4.method22407((int) (Math.random() * 9.9999999E7D), (byte) -35);
		}
		local4.method22466((int) (Math.random() * 9.9999999E7D), 2127564948);
		local4.method22428(Class95.aBigInteger2, Class95.aBigInteger4, (byte) -68);
		arg0.aClass93_Sub41_Sub2_1.method22417(local4.aByteArray58, 0, local4.anInt3070 * 212851357, 2026842986);
		return local7;
	}

	@OriginalMember(owner = "client!y", name = "ar", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;)V")
	public static void method33365(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) String arg4) {
		if (client.anInt3435 * -849002901 != 0) {
			return;
		}
		@Pc(11) Class93_Sub22 local11 = Class102.method2592(Class446.aClass446_22, client.aClass175_1.aClass24_2, (byte) 97);
		local11.aClass93_Sub41_Sub2_1.method22466(0, 2145789629);
		@Pc(22) int local22 = local11.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
		local11.aClass93_Sub41_Sub2_1.method22414(arg0, -1994265361);
		local11.aClass93_Sub41_Sub2_1.method22414(arg1, -623907003);
		local11.aClass93_Sub41_Sub2_1.method22522(arg2, (byte) -25);
		local11.aClass93_Sub41_Sub2_1.method22522(arg3 ? 1 : 0, (byte) 2);
		local11.aClass93_Sub41_Sub2_1.method22414(arg4, 1778384841);
		local11.aClass93_Sub41_Sub2_1.anInt3070 += -1529454093;
		local11.aClass93_Sub41_Sub2_1.method22453(anIntArray518, local22, local11.aClass93_Sub41_Sub2_1.anInt3070 * 212851357, (byte) -37);
		local11.aClass93_Sub41_Sub2_1.method22419(local11.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local22, 1452587200);
		client.aClass175_1.method24363(local11, -1631732402);
		if (arg2 < 13) {
			client.aBoolean610 = true;
			Class277.method26450((byte) 0);
		}
		Class490.aClass700_1 = Class700.aClass700_18;
	}

	@OriginalMember(owner = "client!y", name = "ap", descriptor = "(I)V")
	public static void method33366(@OriginalArg(0) int arg0) {
		if (client.anInt3435 * -849002901 == 0) {
			@Pc(10) Class93_Sub22 local10 = Class102.method2592(Class446.aClass446_120, client.aClass175_1.aClass24_2, (byte) 83);
			local10.aClass93_Sub41_Sub2_1.method22522(arg0, (byte) -74);
			client.aClass175_1.method24363(local10, -2014207092);
		}
	}

	@OriginalMember(owner = "client!y", name = "aq", descriptor = "(I)V")
	public static void method33367(@OriginalArg(0) int arg0) {
		if (client.anInt3435 * -849002901 == 0) {
			@Pc(10) Class93_Sub22 local10 = Class102.method2592(Class446.aClass446_120, client.aClass175_1.aClass24_2, (byte) 32);
			local10.aClass93_Sub41_Sub2_1.method22522(arg0, (byte) -10);
			client.aClass175_1.method24363(local10, -1711803005);
		}
	}

	@OriginalMember(owner = "client!y", name = "ax", descriptor = "(I)V")
	public static void method33368(@OriginalArg(0) int arg0) {
		if (client.anInt3435 * -849002901 == 0) {
			@Pc(10) Class93_Sub22 local10 = Class102.method2592(Class446.aClass446_120, client.aClass175_1.aClass24_2, (byte) 91);
			local10.aClass93_Sub41_Sub2_1.method22522(arg0, (byte) -52);
			client.aClass175_1.method24363(local10, -2145733800);
		}
	}

	@OriginalMember(owner = "client!y", name = "av", descriptor = "()Lclient!zl;")
	public static Class709 method33369() {
		return aClass709_1 == null ? Class709.aClass709_4 : aClass709_1;
	}

	@OriginalMember(owner = "client!y", name = "bw", descriptor = "(Lclient!akl;)[I")
	static int[] method33370(@OriginalArg(0) Class93_Sub22 arg0) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(518);
		@Pc(7) int[] local7 = new int[4];
		@Pc(9) int local9;
		for (local9 = 0; local9 < 4; local9++) {
			local7[local9] = (int) (Math.random() * 9.9999999E7D);
		}
		local4.method22522(10, (byte) -50);
		local4.method22407(local7[0], (byte) 70);
		local4.method22407(local7[1], (byte) 50);
		local4.method22407(local7[2], (byte) -1);
		local4.method22407(local7[3], (byte) -24);
		for (local9 = 0; local9 < 10; local9++) {
			local4.method22407((int) (Math.random() * 9.9999999E7D), (byte) 1);
		}
		local4.method22466((int) (Math.random() * 9.9999999E7D), 2131355690);
		local4.method22428(Class95.aBigInteger2, Class95.aBigInteger4, (byte) -97);
		arg0.aClass93_Sub41_Sub2_1.method22417(local4.aByteArray58, 0, local4.anInt3070 * 212851357, 2026842986);
		return local7;
	}

	@OriginalMember(owner = "client!y", name = "aj", descriptor = "()Lclient!zl;")
	public static Class709 method33371() {
		return aClass709_1 == null ? Class709.aClass709_4 : aClass709_1;
	}

	@OriginalMember(owner = "client!y", name = "bu", descriptor = "()V")
	static void method33372() {
		if (Class588.aClass588_3 == null) {
			return;
		}
		try {
			@Pc(9) short local9;
			if (anInt6044 * -1667786339 == 0) {
				local9 = 250;
			} else {
				local9 = 2000;
			}
			anInt6046 += -2146389243;
			if (anInt6046 * -1394007603 > local9) {
				Class132_Sub1_Sub3_Sub1.method12304(-109098973);
			}
			@Pc(62) int local62;
			if (Class588.aClass588_1 == Class588.aClass588_3) {
				client.aClass175_1.method24365(Class516.method30470(Class50.aClass28_2.method599((byte) 1), 40000, (short) 3779), Class50.aClass28_2.aString4, 2126602668);
				client.aClass175_1.method24381(50126301);
				@Pc(43) Class93_Sub22 local43 = Class720.method37099((byte) 92);
				local43.aClass93_Sub41_Sub2_1.method22522(Class449.aClass449_6.anInt5141 * 1690737369, (byte) -125);
				local43.aClass93_Sub41_Sub2_1.method22466(0, 2130457804);
				local62 = local43.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
				local43.aClass93_Sub41_Sub2_1.method22466(910, 2142019340);
				local43.aClass93_Sub41_Sub2_1.method22466(1, 2142649753);
				anIntArray518 = Class367.method28140(local43, (byte) 42);
				@Pc(82) int local82 = local43.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
				local43.aClass93_Sub41_Sub2_1.method22414(client.aString139, 1830627072);
				local43.aClass93_Sub41_Sub2_1.method22466(client.anInt3426 * -1765120027, 2145276661);
				local43.aClass93_Sub41_Sub2_1.method22407(client.anInt3429 * 1672118199, (byte) 51);
				local43.aClass93_Sub41_Sub2_1.method22407(client.anInt3428 * -1830493323, (byte) 35);
				local43.aClass93_Sub41_Sub2_1.method22414(Class454.aString219, 1860722181);
				local43.aClass93_Sub41_Sub2_1.method22522(Class106.aClass717_8.method37101(), (byte) -14);
				local43.aClass93_Sub41_Sub2_1.method22522(client.aClass702_4.anInt6114 * -1111983921, (byte) -34);
				Class314.method27033(local43.aClass93_Sub41_Sub2_1, 1361591805);
				@Pc(133) String local133 = client.aString138;
				local43.aClass93_Sub41_Sub2_1.method22522(local133 == null ? 0 : 1, (byte) -89);
				if (local133 != null) {
					local43.aClass93_Sub41_Sub2_1.method22414(local133, -1327176077);
				}
				Class125_Sub3.aClass93_Sub42_1.method15310(local43.aClass93_Sub41_Sub2_1, 1497583141);
				local43.aClass93_Sub41_Sub2_1.anInt3070 += -1529454093;
				local43.aClass93_Sub41_Sub2_1.method22453(anIntArray518, local82, local43.aClass93_Sub41_Sub2_1.anInt3070 * 212851357, (byte) -47);
				local43.aClass93_Sub41_Sub2_1.method22419(local43.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local62, -2093458461);
				client.aClass175_1.method24363(local43, -1916095872);
				client.aClass175_1.method24362((byte) 58);
				Class588.aClass588_3 = Class588.aClass588_2;
			}
			if (Class588.aClass588_2 == Class588.aClass588_3) {
				if (client.aClass175_1.method24368((byte) -37) == null) {
					Class132_Sub1_Sub3_Sub1.method12304(-109098973);
					return;
				}
				if (!client.aClass175_1.method24368((byte) -77).method14720(1, 579405890)) {
					return;
				}
				client.aClass175_1.method24368((byte) -40).method14711(client.aClass175_1.aClass93_Sub41_Sub2_2.aByteArray58, 0, 1, (byte) -44);
				aClass709_1 = (Class709) Class107.method18131(Class124_Sub3.method21467(-1284600780), client.aClass175_1.aClass93_Sub41_Sub2_2.aByteArray58[0] & 0xFF, -1915563430);
				if (Class709.aClass709_7 == aClass709_1) {
					client.aClass175_1.aClass24_2 = new Class24(anIntArray518);
					@Pc(247) int[] local247 = new int[4];
					for (local62 = 0; local62 < 4; local62++) {
						local247[local62] = anIntArray518[local62] + 50;
					}
					client.aClass175_1.aClass24_3 = new Class24(local247);
					new Class24(local247);
					client.aClass175_1.aClass93_Sub41_Sub2_2.method22684(client.aClass175_1.aClass24_3, (byte) -101);
					Class481.method29937(0, 1823202236);
					client.aClass175_1.method24381(150838055);
					client.aClass175_1.aClass93_Sub41_Sub2_2.anInt3070 = 0;
					client.aClass175_1.aClass453_1 = null;
					client.aClass175_1.aClass453_4 = null;
					client.aClass175_1.aClass453_3 = null;
					client.aClass175_1.anInt3298 = 0;
					Class624.aClass120_1.aClass647_1.method32823((byte) 48);
					Class151.method13981(-1589523704);
				} else {
					client.aClass175_1.method24367((byte) 80);
				}
				client.aClass175_1.aClass453_2 = null;
				Class588.aClass588_3 = null;
			}
		} catch (@Pc(318) IOException local318) {
			Class132_Sub1_Sub3_Sub1.method12304(-109098973);
		}
	}

	@OriginalMember(owner = "client!y", name = "ab", descriptor = "()Lclient!zb;")
	public static Class700 method33373() {
		return Class490.aClass700_1 == null ? Class700.aClass700_20 : Class490.aClass700_1;
	}

	@OriginalMember(owner = "client!y", name = "az", descriptor = "()Lclient!zx;")
	public static Class721 method33374() {
		return Class103.aClass721_1 == null ? Class721.aClass721_2 : Class103.aClass721_1;
	}

	@OriginalMember(owner = "client!y", name = "aa", descriptor = "()Lclient!zx;")
	public static Class721 method33375() {
		return Class103.aClass721_1 == null ? Class721.aClass721_2 : Class103.aClass721_1;
	}

	@OriginalMember(owner = "client!y", name = "af", descriptor = "()Lclient!zr;")
	public static Class715 method33376() {
		return Class325.aClass715_1 == null ? Class715.aClass715_5 : Class325.aClass715_1;
	}

	@OriginalMember(owner = "client!y", name = "ak", descriptor = "()Lclient!zr;")
	public static Class715 method33377() {
		return Class325.aClass715_1 == null ? Class715.aClass715_5 : Class325.aClass715_1;
	}

	@OriginalMember(owner = "client!y", name = "bb", descriptor = "(Ljava/lang/String;)V")
	static void method33378(@OriginalArg(0) String arg0) {
		aClass704_1 = Class704.aClass704_2;
		Class355.aString190 = arg0;
	}

	@OriginalMember(owner = "client!y", name = "bf", descriptor = "()Lclient!zg;")
	public static Class704 method33379() {
		return aClass704_1 == null ? Class704.aClass704_5 : aClass704_1;
	}

	@OriginalMember(owner = "client!y", name = "bl", descriptor = "()Lclient!zg;")
	public static Class704 method33380() {
		return aClass704_1 == null ? Class704.aClass704_5 : aClass704_1;
	}

	@OriginalMember(owner = "client!y", name = "bk", descriptor = "()Lclient!zg;")
	public static Class704 method33381() {
		return aClass704_1 == null ? Class704.aClass704_5 : aClass704_1;
	}

	@OriginalMember(owner = "client!y", name = "bh", descriptor = "()Ljava/lang/String;")
	public static String method33382() {
		return Class355.aString190;
	}

	@OriginalMember(owner = "client!y", name = "bx", descriptor = "()Ljava/lang/String;")
	public static String method33383() {
		return Class355.aString190;
	}

	@OriginalMember(owner = "client!y", name = "ay", descriptor = "()Lclient!zl;")
	public static Class709 method33384() {
		return aClass709_1 == null ? Class709.aClass709_4 : aClass709_1;
	}

	@OriginalMember(owner = "client!y", name = "at", descriptor = "(Ljava/lang/String;)V")
	public static void method33385(@OriginalArg(0) String arg0) {
		if (client.anInt3435 * -849002901 != 0) {
			return;
		}
		@Pc(11) Class93_Sub22 local11 = Class102.method2592(Class446.aClass446_13, client.aClass175_1.aClass24_2, (byte) 19);
		local11.aClass93_Sub41_Sub2_1.method22522(0, (byte) -34);
		@Pc(22) int local22 = local11.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
		local11.aClass93_Sub41_Sub2_1.method22414(arg0, 602607085);
		local11.aClass93_Sub41_Sub2_1.anInt3070 += -1529454093;
		local11.aClass93_Sub41_Sub2_1.method22453(anIntArray518, local22, local11.aClass93_Sub41_Sub2_1.anInt3070 * 212851357, (byte) -33);
		local11.aClass93_Sub41_Sub2_1.method22549(local11.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local22, (byte) 111);
		client.aClass175_1.method24363(local11, -1705637315);
		Class325.aClass715_1 = Class715.aClass715_3;
	}

	@OriginalMember(owner = "client!y", name = "bi", descriptor = "(Lclient!zr;)V")
	static void method33386(@OriginalArg(0) Class715 arg0) {
		Class325.aClass715_1 = arg0;
	}

	@OriginalMember(owner = "client!y", name = "bn", descriptor = "(Lclient!zr;)V")
	static void method33387(@OriginalArg(0) Class715 arg0) {
		Class325.aClass715_1 = arg0;
	}

	@OriginalMember(owner = "client!y", name = "bt", descriptor = "(Lclient!zg;)V")
	static void method33388(@OriginalArg(0) Class704 arg0) {
		aClass704_1 = arg0;
		Class355.aString190 = null;
	}

	@OriginalMember(owner = "client!y", name = "j", descriptor = "()V")
	static void method33389() {
		Class588.aClass588_3 = Class588.aClass588_1;
		aClass709_1 = Class709.aClass709_11;
		Class490.aClass700_1 = Class700.aClass700_20;
		Class103.aClass721_1 = Class721.aClass721_2;
		aClass704_1 = Class704.aClass704_5;
		Class325.aClass715_1 = Class715.aClass715_5;
		Class355.aString190 = null;
	}

	@OriginalMember(owner = "client!y", name = "bm", descriptor = "(Lclient!zg;)V")
	static void method33390(@OriginalArg(0) Class704 arg0) {
		aClass704_1 = arg0;
		Class355.aString190 = null;
	}

	@OriginalMember(owner = "client!y", name = "ao", descriptor = "()Lclient!zl;")
	public static Class709 method33391() {
		return aClass709_1 == null ? Class709.aClass709_4 : aClass709_1;
	}

	@OriginalMember(owner = "client!y", name = "be", descriptor = "(Ljava/lang/String;)V")
	static void method33392(@OriginalArg(0) String arg0) {
		aClass704_1 = Class704.aClass704_2;
		Class355.aString190 = arg0;
	}

	@OriginalMember(owner = "client!y", name = "by", descriptor = "()V")
	static void method33393() {
		if (Class588.aClass588_3 == null) {
			return;
		}
		try {
			@Pc(9) short local9;
			if (anInt6044 * -1667786339 == 0) {
				local9 = 250;
			} else {
				local9 = 2000;
			}
			anInt6046 += -2146389243;
			if (anInt6046 * -1394007603 > local9) {
				Class132_Sub1_Sub3_Sub1.method12304(-109098973);
			}
			@Pc(62) int local62;
			if (Class588.aClass588_1 == Class588.aClass588_3) {
				client.aClass175_1.method24365(Class516.method30470(Class50.aClass28_2.method599((byte) 1), 40000, (short) 11905), Class50.aClass28_2.aString4, 2126602668);
				client.aClass175_1.method24381(121736975);
				@Pc(43) Class93_Sub22 local43 = Class720.method37099((byte) -65);
				local43.aClass93_Sub41_Sub2_1.method22522(Class449.aClass449_6.anInt5141 * 1690737369, (byte) -60);
				local43.aClass93_Sub41_Sub2_1.method22466(0, 2126829557);
				local62 = local43.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
				local43.aClass93_Sub41_Sub2_1.method22466(910, 2130855350);
				local43.aClass93_Sub41_Sub2_1.method22466(1, 2138639926);
				anIntArray518 = Class367.method28140(local43, (byte) 75);
				@Pc(82) int local82 = local43.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
				local43.aClass93_Sub41_Sub2_1.method22414(client.aString139, -992502632);
				local43.aClass93_Sub41_Sub2_1.method22466(client.anInt3426 * -1765120027, 2141964745);
				local43.aClass93_Sub41_Sub2_1.method22407(client.anInt3429 * 1672118199, (byte) 48);
				local43.aClass93_Sub41_Sub2_1.method22407(client.anInt3428 * -1830493323, (byte) -32);
				local43.aClass93_Sub41_Sub2_1.method22414(Class454.aString219, -232688334);
				local43.aClass93_Sub41_Sub2_1.method22522(Class106.aClass717_8.method37101(), (byte) -107);
				local43.aClass93_Sub41_Sub2_1.method22522(client.aClass702_4.anInt6114 * -1111983921, (byte) -74);
				Class314.method27033(local43.aClass93_Sub41_Sub2_1, 828866243);
				@Pc(133) String local133 = client.aString138;
				local43.aClass93_Sub41_Sub2_1.method22522(local133 == null ? 0 : 1, (byte) -71);
				if (local133 != null) {
					local43.aClass93_Sub41_Sub2_1.method22414(local133, -897239165);
				}
				Class125_Sub3.aClass93_Sub42_1.method15310(local43.aClass93_Sub41_Sub2_1, 1691727545);
				local43.aClass93_Sub41_Sub2_1.anInt3070 += -1529454093;
				local43.aClass93_Sub41_Sub2_1.method22453(anIntArray518, local82, local43.aClass93_Sub41_Sub2_1.anInt3070 * 212851357, (byte) -4);
				local43.aClass93_Sub41_Sub2_1.method22419(local43.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local62, -1951115392);
				client.aClass175_1.method24363(local43, -1470868569);
				client.aClass175_1.method24362((byte) 52);
				Class588.aClass588_3 = Class588.aClass588_2;
			}
			if (Class588.aClass588_2 == Class588.aClass588_3) {
				if (client.aClass175_1.method24368((byte) 21) == null) {
					Class132_Sub1_Sub3_Sub1.method12304(-109098973);
					return;
				}
				if (!client.aClass175_1.method24368((byte) 67).method14720(1, 1965140543)) {
					return;
				}
				client.aClass175_1.method24368((byte) -25).method14711(client.aClass175_1.aClass93_Sub41_Sub2_2.aByteArray58, 0, 1, (byte) -30);
				aClass709_1 = (Class709) Class107.method18131(Class124_Sub3.method21467(-204989580), client.aClass175_1.aClass93_Sub41_Sub2_2.aByteArray58[0] & 0xFF, -1915563430);
				if (Class709.aClass709_7 == aClass709_1) {
					client.aClass175_1.aClass24_2 = new Class24(anIntArray518);
					@Pc(247) int[] local247 = new int[4];
					for (local62 = 0; local62 < 4; local62++) {
						local247[local62] = anIntArray518[local62] + 50;
					}
					client.aClass175_1.aClass24_3 = new Class24(local247);
					new Class24(local247);
					client.aClass175_1.aClass93_Sub41_Sub2_2.method22684(client.aClass175_1.aClass24_3, (byte) -15);
					Class481.method29937(0, 1823202236);
					client.aClass175_1.method24381(-1476784853);
					client.aClass175_1.aClass93_Sub41_Sub2_2.anInt3070 = 0;
					client.aClass175_1.aClass453_1 = null;
					client.aClass175_1.aClass453_4 = null;
					client.aClass175_1.aClass453_3 = null;
					client.aClass175_1.anInt3298 = 0;
					Class624.aClass120_1.aClass647_1.method32823((byte) 52);
					Class151.method13981(-227598485);
				} else {
					client.aClass175_1.method24367((byte) 33);
				}
				client.aClass175_1.aClass453_2 = null;
				Class588.aClass588_3 = null;
			}
		} catch (@Pc(318) IOException local318) {
			Class132_Sub1_Sub3_Sub1.method12304(-109098973);
		}
	}

	@OriginalMember(owner = "client!y", name = "bc", descriptor = "(Lclient!zr;)V")
	static void method33394(@OriginalArg(0) Class715 arg0) {
		Class325.aClass715_1 = arg0;
	}

	@OriginalMember(owner = "client!y", name = "ad", descriptor = "()V")
	public static void method33395() {
		if (client.anInt3435 * -849002901 == 0) {
			@Pc(10) Class93_Sub22 local10 = Class102.method2592(Class446.aClass446_63, client.aClass175_1.aClass24_2, (byte) 89);
			client.aClass175_1.method24363(local10, -1489856501);
			aClass704_1 = Class704.aClass704_3;
			Class355.aString190 = null;
		}
	}

	@OriginalMember(owner = "client!y", name = "aw", descriptor = "(Ljava/lang/String;)V")
	public static void method33396(@OriginalArg(0) String arg0) {
		if (client.anInt3435 * -849002901 != 0) {
			return;
		}
		@Pc(10) Class93_Sub22 local10 = Class102.method2592(Class446.aClass446_30, client.aClass175_1.aClass24_2, (byte) 26);
		local10.aClass93_Sub41_Sub2_1.method22466(0, 2140262963);
		@Pc(21) int local21 = local10.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
		local10.aClass93_Sub41_Sub2_1.method22414(arg0, -1419540724);
		local10.aClass93_Sub41_Sub2_1.anInt3070 += -1529454093;
		local10.aClass93_Sub41_Sub2_1.method22453(anIntArray518, local21, local10.aClass93_Sub41_Sub2_1.anInt3070 * 212851357, (byte) -6);
		local10.aClass93_Sub41_Sub2_1.method22419(local10.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local21, 1993492562);
		client.aClass175_1.method24363(local10, -2133150541);
		Class103.aClass721_1 = Class721.aClass721_5;
	}

	@OriginalMember(owner = "client!y", name = "as", descriptor = "(Ljava/lang/String;)V")
	public static void method33397(@OriginalArg(0) String arg0) {
		if (client.anInt3435 * -849002901 != 0) {
			return;
		}
		@Pc(10) Class93_Sub22 local10 = Class102.method2592(Class446.aClass446_30, client.aClass175_1.aClass24_2, (byte) 109);
		local10.aClass93_Sub41_Sub2_1.method22466(0, 2127815341);
		@Pc(21) int local21 = local10.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
		local10.aClass93_Sub41_Sub2_1.method22414(arg0, 830369134);
		local10.aClass93_Sub41_Sub2_1.anInt3070 += -1529454093;
		local10.aClass93_Sub41_Sub2_1.method22453(anIntArray518, local21, local10.aClass93_Sub41_Sub2_1.anInt3070 * 212851357, (byte) -33);
		local10.aClass93_Sub41_Sub2_1.method22419(local10.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local21, -596845068);
		client.aClass175_1.method24363(local10, -1576589710);
		Class103.aClass721_1 = Class721.aClass721_5;
	}

	@OriginalMember(owner = "client!y", name = "i", descriptor = "(I)I")
	public static int method33398(@OriginalArg(0) int arg0) {
		return Class166_Sub13.aTwitchTV1.GetWebcamState();
	}

	@OriginalMember(owner = "client!y", name = "axb", descriptor = "(Lclient!yf;I)V")
	static void method33399(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class687.anInt6070 * 412739781;
	}

	@OriginalMember(owner = "client!y", name = "bq", descriptor = "(Lclient!yf;I)V")
	static void method33400(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(29) Class677 local29;
		if (arg0.aBoolean884) {
			local29 = arg0.aClass677_2;
		} else {
			local29 = arg0.aClass677_1;
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local23 != -1 && local29.method33406(local13, local23, -1410519884) ? 1 : 0;
	}

	@OriginalMember(owner = "client!y", name = "e", descriptor = "(Lclient!dh;Lclient!hf;I)V")
	static void method33401(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) int arg2) {
		@Pc(37) boolean local37 = Class277.aClass32_Sub12_1.method17081(arg0, arg1.anInt4086 * 307668159, arg1.anInt4087 * -570377411, arg1.anInt4038 * 2095239745, arg1.anInt4039 * 1581456827 | 0xFF000000, arg1.anInt4055 * -1654869125, arg1.aBoolean693 ? Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass658_1 : null, 1423341978) == null;
		if (local37) {
			Class114.aClass22_14.method407(new Class93_Sub10(arg1.anInt4086 * 307668159, arg1.anInt4087 * -570377411, arg1.anInt4038 * 2095239745, arg1.anInt4039 * 1581456827 | 0xFF000000, arg1.anInt4055 * -1654869125, arg1.aBoolean693), -542709515);
			Class354.method27789(arg1, -1174743804);
		}
	}

	@OriginalMember(owner = "client!y", name = "ii", descriptor = "(IIILclient!ajf;I)V")
	static void method33402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class93_Sub3 arg3, @OriginalArg(4) int arg4) {
		@Pc(10) long local10 = (long) (arg0 << 28 | arg2 << 14 | arg1);
		@Pc(15) Class93_Sub5 local15 = (Class93_Sub5) client.aClass16_20.method215(local10);
		if (local15 == null) {
			local15 = new Class93_Sub5();
			client.aClass16_20.method221(local15, local10);
			local15.aClass22_17.method407(arg3, -98830014);
			return;
		}
		@Pc(41) Class47 local41 = (Class47) Class277.aClass32_Sub12_1.method18273(arg3.anInt1405 * -308533965, 616318106);
		@Pc(46) int local46 = local41.anInt135 * 1415652865;
		if (local41.anInt150 * -1809820871 == 1) {
			local46 *= arg3.anInt1404 * -815066371 + 1;
		}
		for (@Pc(67) Class93_Sub3 local67 = (Class93_Sub3) local15.aClass22_17.method445((byte) 86); local67 != null; local67 = (Class93_Sub3) local15.aClass22_17.method415(970329713)) {
			local41 = (Class47) Class277.aClass32_Sub12_1.method18273(local67.anInt1405 * -308533965, -1804441507);
			@Pc(83) int local83 = local41.anInt135 * 1415652865;
			if (local41.anInt150 * -1809820871 == 1) {
				local83 *= local67.anInt1404 * -815066371 + 1;
			}
			if (local46 > local83) {
				Class169.method18353(arg3, local67, (byte) 94);
				return;
			}
		}
		local15.aClass22_17.method407(arg3, -1633488610);
	}

	@OriginalMember(owner = "client!y", name = "eq", descriptor = "(II)V")
	public static void method33403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class355 local5 = (Class355) Class159_Sub1.aHashMap5.get(arg0);
		if (local5 == null) {
			local5 = new Class355();
		}
		local5.anInt4259 = Class159_Sub1.anInt1944 * -1043952585;
		local5.anInt4258 = Class159_Sub1.anInt1955 * -1400884413;
		Class159_Sub1.aHashMap5.put(arg0, local5);
	}

	@OriginalMember(owner = "client!y", name = "e", descriptor = "(Lclient!akt;I)V")
	static void method33404(@OriginalArg(0) Class93_Sub30 arg0, @OriginalArg(1) int arg1) {
		Class1.aClass123_Sub1_1 = new Class123_Sub1(client.aClass699_1);
		Class1.aClass123_Sub1_1.method8926(Class358.aClass358_3, (byte) 39);
		try {
			@Pc(15) Class124_Sub2 local15 = (Class124_Sub2) Class1.aClass123_Sub1_1.method8931(Class342.aClass342_4, false, -1833699449);
			@Pc(22) Class25_Sub1 local22 = (Class25_Sub1) Class1.aClass123_Sub1_1.method8927(Class338.aClass338_7, false, 755970988);
			local15.method9297(arg0, -1049152339);
			local22.method15975(new Class471(0.0F, 0.0F, 0.0F), -1497248091);
			Class1.aClass123_Sub1_1.method8938(Class472.method29710(99999.0F, 99999.0F, 99999.0F), -4089155);
			Class1.aClass123_Sub1_1.method9057(Class472.method29710(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), 1980201292);
			Class1.aClass123_Sub1_1.method9075(Class472.method29710(99999.0F, 99999.0F, 99999.0F), 1253268154);
			Class1.aClass123_Sub1_1.method8933(Class472.method29710(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), -849002901);
		} catch (@Pc(65) Exception_Sub3 local65) {
		}
		Class1.anInt1 = Class82.aClass153_1.method14058(-1466472870) * 1043723381;
		Class627.anInt5866 = Class82.aClass153_1.method14064(516785759) * -155409771;
		Class1.aBoolean1 = true;
	}

	@OriginalMember(owner = "client!y", name = "<init>", descriptor = "()V")
	Class676() throws Throwable {
		throw new Error();
	}
}
