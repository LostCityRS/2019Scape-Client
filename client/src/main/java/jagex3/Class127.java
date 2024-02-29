package jagex3;

import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class127 implements Interface4 {

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "Ljava/util/Map;")
	final Map aMap16;

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "(Lclient!ase;I)V")
	static void method9257(@OriginalArg(0) Class93_Sub41_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		arg0.method22680((byte) -39);
		@Pc(6) int local6;
		@Pc(15) int local15;
		@Pc(38) int local38;
		for (local6 = 0; local6 < Class174.anInt3293 * -1081967415; local6++) {
			local15 = Class174.anIntArray278[local6];
			if ((Class174.aByteArray63[local15] & 0x1) == 0) {
				if (local1 > 0) {
					local1--;
					Class174.aByteArray63[local15] = (byte) (Class174.aByteArray63[local15] | 0x2);
				} else {
					local38 = arg0.method22701(1, -1428365453);
					if (local38 == 0) {
						local1 = Class206.method24713(arg0, -1799819323);
						Class174.aByteArray63[local15] = (byte) (Class174.aByteArray63[local15] | 0x2);
					} else {
						Class93_Sub35.method19718(arg0, local15, (short) 9458);
					}
				}
			}
		}
		arg0.method22682(-711559664);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.method22680((byte) -5);
		for (local6 = 0; local6 < Class174.anInt3293 * -1081967415; local6++) {
			local15 = Class174.anIntArray278[local6];
			if ((Class174.aByteArray63[local15] & 0x1) != 0) {
				if (local1 > 0) {
					local1--;
					Class174.aByteArray63[local15] = (byte) (Class174.aByteArray63[local15] | 0x2);
				} else {
					local38 = arg0.method22701(1, 453222308);
					if (local38 == 0) {
						local1 = Class206.method24713(arg0, -972609649);
						Class174.aByteArray63[local15] = (byte) (Class174.aByteArray63[local15] | 0x2);
					} else {
						Class93_Sub35.method19718(arg0, local15, (short) 30250);
					}
				}
			}
		}
		arg0.method22682(830825245);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.method22680((byte) -47);
		for (local6 = 0; local6 < Class174.anInt3295 * 1575920431; local6++) {
			local15 = Class174.anIntArray277[local6];
			if ((Class174.aByteArray63[local15] & 0x1) != 0) {
				if (local1 > 0) {
					local1--;
					Class174.aByteArray63[local15] = (byte) (Class174.aByteArray63[local15] | 0x2);
				} else {
					local38 = arg0.method22701(1, -515802717);
					if (local38 == 0) {
						local1 = Class206.method24713(arg0, -1341202410);
						Class174.aByteArray63[local15] = (byte) (Class174.aByteArray63[local15] | 0x2);
					} else if (Class18.method272(arg0, local15, 1130832603)) {
						Class174.aByteArray63[local15] = (byte) (Class174.aByteArray63[local15] | 0x2);
					}
				}
			}
		}
		arg0.method22682(-1692591558);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.method22680((byte) -5);
		for (local6 = 0; local6 < Class174.anInt3295 * 1575920431; local6++) {
			local15 = Class174.anIntArray277[local6];
			if ((Class174.aByteArray63[local15] & 0x1) == 0) {
				if (local1 > 0) {
					local1--;
					Class174.aByteArray63[local15] = (byte) (Class174.aByteArray63[local15] | 0x2);
				} else {
					local38 = arg0.method22701(1, 200211595);
					if (local38 == 0) {
						local1 = Class206.method24713(arg0, -1665931944);
						Class174.aByteArray63[local15] = (byte) (Class174.aByteArray63[local15] | 0x2);
					} else if (Class18.method272(arg0, local15, 491218498)) {
						Class174.aByteArray63[local15] = (byte) (Class174.aByteArray63[local15] | 0x2);
					}
				}
			}
		}
		arg0.method22682(-312042121);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		Class174.anInt3293 = 0;
		Class174.anInt3295 = 0;
		for (local6 = 1; local6 < 2048; local6++) {
			Class174.aByteArray63[local6] = (byte) (Class174.aByteArray63[local6] >> 1);
			@Pc(314) Class132_Sub1_Sub1_Sub1_Sub2 local314 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local6];
			if (local314 == null) {
				Class174.anIntArray277[(Class174.anInt3295 += -70810673) * 1575920431 - 1] = local6;
			} else {
				Class174.anIntArray278[(Class174.anInt3293 += -1190240903) * -1081967415 - 1] = local6;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(Lclient!dh;IIIIIB)Lclient!do;")
	public static Class109 method9258(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		@Pc(2) long local2 = (long) arg5;
		@Pc(7) Class109 local7 = (Class109) Class173.aClass240_64.method25932(local2);
		@Pc(9) short local9 = 2055;
		if (local7 == null) {
			@Pc(17) Class231 local17 = Class231.method25748(Class86.aClass497_15, arg5, 0);
			if (local17 == null) {
				return null;
			}
			if (local17.anInt3779 < 13) {
				local17.method25764(2);
			}
			local7 = arg0.method20522(local17, local9, Class173.anInt3254 * 1919361397, 64, 768);
			Class173.aClass240_64.method25923(local7, local2);
		}
		local7 = local7.method6907((byte) 6, local9, true);
		if (arg1 != 0) {
			local7.method6827(arg1);
		}
		if (arg2 != 0) {
			local7.method6986(arg2);
		}
		if (arg3 != 0) {
			local7.method6830(arg3);
		}
		if (arg4 != 0) {
			local7.method6939(0, arg4, 0);
		}
		return local7;
	}

	@OriginalMember(owner = "client!ka", name = "dr", descriptor = "(Lclient!yf;I)V")
	static void method9259(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1567549978);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class371.method28181(local16, local22, arg0, 2000067708);
	}

	@OriginalMember(owner = "client!ka", name = "eb", descriptor = "(Lclient!yf;I)V")
	static void method9260(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class644.method32782(local11, local14, arg0, (byte) -27);
	}

	@OriginalMember(owner = "client!ka", name = "aab", descriptor = "(Lclient!yf;B)V")
	static void method9261(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		Class102.method2588(local13, -1002586289);
	}

	@OriginalMember(owner = "client!ka", name = "bdm", descriptor = "(Lclient!yf;I)V")
	static void method9262(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class125.method21475(1852373697);
	}

	@OriginalMember(owner = "client!ka", name = "so", descriptor = "(Lclient!yf;B)V")
	static void method9263(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1895084890);
		Class119_Sub1.method8607(local16, arg0, -1680853935);
	}

	@OriginalMember(owner = "client!ka", name = "w", descriptor = "(I)Z")
	public static boolean method9264(@OriginalArg(0) int arg0) {
		try {
			if (!NativeMouse.available()) {
				return false;
			}
		} catch (@Pc(5) Throwable local5) {
			return false;
		}
		if (NativeMouse.instance != null) {
			throw new IllegalStateException("");
		}
		NativeMouse.instance = new NativeMouse();
		@Pc(26) Thread local26 = new Thread(new Class690());
		local26.setDaemon(true);
		local26.start();
		return true;
	}

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Ljava/util/Map;)V")
	Class127(@OriginalArg(0) Map arg0) {
		this.aMap16 = arg0;
	}
}
