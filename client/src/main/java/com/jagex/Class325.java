package com.jagex;

import jaclib.ping.Ping;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class325 {

	@OriginalMember(owner = "client!hv", name = "t", descriptor = "Ljava/lang/String;")
	static final String aString181 = "#";

	@OriginalMember(owner = "client!hv", name = "ae", descriptor = "J")
	static long aLong368;

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "[I")
	public static int[] anIntArray400;

	@OriginalMember(owner = "client!hv", name = "fh", descriptor = "Lclient!pf;")
	public static Class480 aClass480_94;

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z")
	public static boolean method27620(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		if (arg0 == null || arg2 == null) {
			return false;
		} else if (arg0.startsWith("#") || arg2.startsWith("#")) {
			return arg0.equals(arg2);
		} else {
			return arg1.equals(arg3);
		}
	}

	@OriginalMember(owner = "client!hv", name = "f", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z")
	public static boolean method27621(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		if (arg0 == null || arg2 == null) {
			return false;
		} else if (arg0.startsWith("#") || arg2.startsWith("#")) {
			return arg0.equals(arg2);
		} else {
			return arg1.equals(arg3);
		}
	}

	@OriginalMember(owner = "client!hv", name = "u", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z")
	public static boolean method27622(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		if (arg0 == null || arg2 == null) {
			return false;
		} else if (arg0.startsWith("#") || arg2.startsWith("#")) {
			return arg0.equals(arg2);
		} else {
			return arg1.equals(arg3);
		}
	}

	@OriginalMember(owner = "client!hv", name = "l", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z")
	public static boolean method27623(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		if (arg0 == null || arg2 == null) {
			return false;
		} else if (arg0.startsWith("#") || arg2.startsWith("#")) {
			return arg0.equals(arg2);
		} else {
			return arg1.equals(arg3);
		}
	}

	@OriginalMember(owner = "client!hv", name = "t", descriptor = "(I)I")
	public static int method27624(@OriginalArg(0) int arg0) {
		if (Class481.anInt4995 * 2097642135 == 0) {
			Class74.aClass74_1.method1290(new Class494("jaclib"), 1875955374);
			if (Class74.aClass74_1.method1292(-1435917229).method30349((byte) 39) != 100) {
				return 1;
			}
			if (!((Class494) Class74.aClass74_1.method1292(-1435917229)).method30291(-1680869607) && !Class117.method8819((byte) 30)) {
				try {
					Class564.aClient1.method25208(-713974552);
					Class322.method27602(47357210);
					Ping.init();
				} catch (@Pc(38) Exception_Sub7 local38) {
					Class115_Sub1.method8671(Class70.aClass70_1, local38.aString71, local38.anInt2613 * 750203913, local38.getCause(), -199906023);
				} catch (@Pc(51) Throwable local51) {
				}
			}
			Class481.anInt4995 = 84911399;
		}
		@Pc(257) int local257;
		@Pc(279) int local279;
		@Pc(297) int local297;
		if (Class481.anInt4995 * 2097642135 == 1) {
			Class481.aClass74Array1 = Class74.method1309(805046955);
			Class74.aClass74_9.method1290(new Class476(Class329.aClass480_95), 1979066664);
			Class74.aClass74_6.method1290(new Class494("jaggl"), 1368865831);
			@Pc(80) Class494 local80 = new Class494("jagdx");
			if (!Class450.aString209.startsWith("win")) {
				local80.method30286(632640379);
			}
			Class74.aClass74_3.method1290(local80, 1068409294);
			Class74.aClass74_4.method1290(new Class494("sw3d"), 1421986206);
			Class74.aClass74_26.method1290(new Class494("hw3d"), 1344648037);
			Class74.aClass74_23.method1290(new Class494("RuneScape-Setup.exe", true), 1482991185);
			Class74.aClass74_7.method1290(new Class476(Class80_Sub15.aClass480_35), 1665740126);
			Class74.aClass74_8.method1290(new Class476(Class371.aClass480_102), 1642004572);
			Class74.aClass74_12.method1290(new Class476(Class171.aClass480_82), 1701339536);
			Class74.aClass74_10.method1290(new Class476(Class223.aClass480_84), 1948472573);
			Class74.aClass74_11.method1290(new Class476(Class56.aClass480_7), 1277081627);
			Class74.aClass74_19.method1290(new Class476(Class352.aClass480_97), 1227187680);
			Class74.aClass74_27.method1290(new Class476(Class231.aClass480_86), 992399604);
			Class74.aClass74_13.method1290(new Class476(Class143_Sub3.aClass480_34), 1929381419);
			Class74.aClass74_2.method1290(new Class476(Class83.aClass480_12), 1332791847);
			Class74.aClass74_15.method1290(new Class476(Class228.aClass480_85), 1176390126);
			Class74.aClass74_16.method1290(new Class476(Class688.aClass480_135), 1849617281);
			Class74.aClass74_17.method1290(new Class476(Class62.aClass480_8), 1410949095);
			Class74.aClass74_18.method1290(new Class476(Class480.aClass480_120), 1485753561);
			Class74.aClass74_25.method1290(new Class476(Class687.aClass480_134), 1716261623);
			Class74.aClass74_20.method1290(new Class476(Class155.aClass480_41), 2088846157);
			Class74.aClass74_21.method1290(new Class498(client.aClass480_83, "huffman"), 1184930357);
			Class74.aClass74_22.method1290(new Class476(Class104_Sub2.aClass480_16), 1480270924);
			Class74.aClass74_14.method1290(new Class476(Class438.aClass480_112), 1029742758);
			Class74.aClass74_24.method1290(new Class476(Class569.aClass480_124), 2002421125);
			Class74.aClass74_5.method1290(new Class477(Class588.aClass480_127, 0), 1560163603);
			for (local257 = 0; local257 < Class481.aClass74Array1.length; local257++) {
				if (Class481.aClass74Array1[local257].method1292(-1435917229) == null) {
					throw new RuntimeException();
				}
			}
			local257 = 0;
			@Pc(277) Class74[] local277 = Class481.aClass74Array1;
			for (local279 = 0; local279 < local277.length; local279++) {
				@Pc(287) Class74 local287 = local277[local279];
				@Pc(291) int local291 = local287.method1291(-2014841248);
				local297 = local287.method1292(-1435917229).method30349((byte) -49);
				local257 += local291 * local297 / 100;
			}
			Class481.anInt4994 = local257 * -2117366737;
			Class481.anInt4995 = 169822798;
		}
		if (Class481.aClass74Array1 == null) {
			return 100;
		}
		@Pc(319) int local319 = 0;
		local257 = 0;
		@Pc(323) boolean local323 = true;
		@Pc(325) Class74[] local325 = Class481.aClass74Array1;
		for (@Pc(327) int local327 = 0; local327 < local325.length; local327++) {
			@Pc(335) Class74 local335 = local325[local327];
			local297 = local335.method1291(-1911666983);
			@Pc(345) int local345 = local335.method1292(-1435917229).method30349((byte) 6);
			if (local345 < 100) {
				local323 = false;
			}
			local319 += local297;
			local257 += local345 * local297 / 100;
		}
		if (local323) {
			Class481.aClass74Array1 = null;
		}
		local257 -= Class481.anInt4994 * -821478705;
		local319 -= Class481.anInt4994 * -821478705;
		local279 = local319 > 0 ? local257 * 100 / local319 : 100;
		if (!local323 && local279 > 99) {
			local279 = 99;
		}
		return local279;
	}

	@OriginalMember(owner = "client!hv", name = "u", descriptor = "(Lclient!yp;I)V")
	static void method27625(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class557.method31375((byte) -69);
	}

	@OriginalMember(owner = "client!hv", name = "asm", descriptor = "(Lclient!yp;I)V")
	static void method27626(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub43_2, arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], (byte) 82);
		Class719.method37291(913234739);
	}

	@OriginalMember(owner = "client!hv", name = "bau", descriptor = "(Lclient!yp;B)V")
	static void method27627(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub32_1.method16950(local12, (byte) -125);
	}

	@OriginalMember(owner = "client!hv", name = "np", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method27628(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -2007038186) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		Class431.method29089(local13, arg2, 2069072119);
	}

	@OriginalMember(owner = "client!hv", name = "uu", descriptor = "(Lclient!yp;B)V")
	static void method27629(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2008879274);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anInt4117 * -706354509;
	}

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "()V")
	Class325() throws Throwable {
		throw new Error();
	}
}
