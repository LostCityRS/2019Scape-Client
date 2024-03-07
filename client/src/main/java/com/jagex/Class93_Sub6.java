package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajo")
public class Class93_Sub6 extends Class93 {

	@OriginalMember(owner = "client!ajo", name = "w", descriptor = "I")
	static int anInt1444;

	@OriginalMember(owner = "client!ajo", name = "k", descriptor = "Lclient!aan;")
	static final Class16 aClass16_9 = new Class16(32);

	@OriginalMember(owner = "client!ajo", name = "f", descriptor = "Lclient!eb;")
	static final Class240 aClass240_19 = new Class240(10);

	@OriginalMember(owner = "client!ajo", name = "l", descriptor = "[I")
	int[] anIntArray173 = new int[] { -1 };

	@OriginalMember(owner = "client!ajo", name = "u", descriptor = "[I")
	int[] anIntArray174 = new int[] { 0 };

	@OriginalMember(owner = "client!ajo", name = "z", descriptor = "[Lclient!abn;")
	Class40[] aClass40Array1 = null;

	@OriginalMember(owner = "client!ajo", name = "<init>", descriptor = "()V", line = 27)
	Class93_Sub6() {
	}

	@OriginalMember(owner = "client!ajo", name = "h", descriptor = "(IIZ)I", line = 30)
	public static int method12658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class93_Sub6 local4 = Class557.method31064(arg0, arg2, (short) 255);
		if (local4 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray173.length) {
			return local4.anIntArray173[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ajo", name = "a", descriptor = "(IIZ)I", line = 37)
	public static int method12659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class93_Sub6 local4 = Class557.method31064(arg0, arg2, (short) 255);
		if (local4 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray174.length) {
			return local4.anIntArray174[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ajo", name = "g", descriptor = "(IIIZ)I", line = 44)
	public static int method12660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) Class379 local5 = (Class379) Class30.aClass32_Sub16_1.get(arg2, -859872919);
		@Pc(8) Class108 local8 = local5.aClass108_1;
		@Pc(13) Class93_Sub6 local13 = Class557.method31064(arg0, arg3, (short) 255);
		@Pc(37) int local37;
		if (local13 == null || arg1 < 0 || arg1 >= local13.anIntArray174.length || local13.aClass40Array1 == null || local13.aClass40Array1[arg1] == null) {
			local37 = (Integer) local8.method7440((byte) 2);
		} else {
			local37 = local13.aClass40Array1[arg1].method781(local8.anInt867 * -1284841473, -1267242705);
		}
		return local5.method28089(local37, 1424306711);
	}

	@OriginalMember(owner = "client!ajo", name = "i", descriptor = "(IIIZ)I", line = 44)
	public static int method12661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) Class379 local5 = (Class379) Class30.aClass32_Sub16_1.get(arg2, -907740021);
		@Pc(8) Class108 local8 = local5.aClass108_1;
		@Pc(13) Class93_Sub6 local13 = Class557.method31064(arg0, arg3, (short) 255);
		@Pc(37) int local37;
		if (local13 == null || arg1 < 0 || arg1 >= local13.anIntArray174.length || local13.aClass40Array1 == null || local13.aClass40Array1[arg1] == null) {
			local37 = (Integer) local8.method7440((byte) 2);
		} else {
			local37 = local13.aClass40Array1[arg1].method781(local8.anInt867 * -1284841473, -1267242705);
		}
		return local5.method28089(local37, 356664418);
	}

	@OriginalMember(owner = "client!ajo", name = "j", descriptor = "(IIZ)I", line = 58)
	public static int method12662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class93_Sub6 local4 = Class557.method31064(arg0, arg2, (short) 255);
		if (local4 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(15) int local15 = 0;
			for (@Pc(17) int local17 = 0; local17 < local4.anIntArray174.length; local17++) {
				if (local4.anIntArray173[local17] == arg1) {
					local15 += local4.anIntArray174[local17];
				}
			}
			return local15;
		}
	}

	@OriginalMember(owner = "client!ajo", name = "t", descriptor = "(IIZZ)I", line = 79)
	public static int method12663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(4) Class93_Sub6 local4 = Class557.method31064(arg0, arg3, (short) 255);
		if (local4 == null) {
			return 0;
		}
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local4.anIntArray173.length; local12++) {
			if (local4.anIntArray173[local12] >= 0 && local4.anIntArray173[local12] < Class277.aClass32_Sub12_1.anInt2487 * -152478627) {
				@Pc(40) Class47 local40 = (Class47) Class277.aClass32_Sub12_1.get(local4.anIntArray173[local12], -285116308);
				@Pc(53) int local53 = local40.method943(arg1, ((Class87) Class124.aClass32_Sub21_7.get(arg1, 61109495)).anInt265 * 951920133, 1758654745);
				if (arg2) {
					local10 += local53 * local4.anIntArray174[local12];
				} else if (local4.anIntArray174[local12] > 0) {
					local10 += local53;
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!ajo", name = "ae", descriptor = "(IIZZ)I", line = 79)
	public static int method12664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(4) Class93_Sub6 local4 = Class557.method31064(arg0, arg3, (short) 255);
		if (local4 == null) {
			return 0;
		}
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local4.anIntArray173.length; local12++) {
			if (local4.anIntArray173[local12] >= 0 && local4.anIntArray173[local12] < Class277.aClass32_Sub12_1.anInt2487 * -152478627) {
				@Pc(40) Class47 local40 = (Class47) Class277.aClass32_Sub12_1.get(local4.anIntArray173[local12], 18704805);
				@Pc(53) int local53 = local40.method943(arg1, ((Class87) Class124.aClass32_Sub21_7.get(arg1, -1669537007)).anInt265 * 951920133, 1394551160);
				if (arg2) {
					local10 += local53 * local4.anIntArray174[local12];
				} else if (local4.anIntArray174[local12] > 0) {
					local10 += local53;
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!ajo", name = "ag", descriptor = "(IZ)I", line = 94)
	public static int method12665(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			return 0;
		}
		@Pc(8) Class93_Sub6 local8 = Class557.method31064(arg0, arg1, (short) 255);
		if (local8 == null) {
			return ((Class93_Sub1_Sub2) Class638.aClass32_Sub22_1.get(arg0, 888034153)).anInt316 * 820091969;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local8.anIntArray173.length; local23++) {
			if (local8.anIntArray173[local23] == -1) {
				local21++;
			}
		}
		return local21 + (((Class93_Sub1_Sub2) Class638.aClass32_Sub22_1.get(arg0, -979170721)).anInt316 * 820091969 - local8.anIntArray173.length);
	}

	@OriginalMember(owner = "client!ajo", name = "ah", descriptor = "(IZ)I", line = 94)
	public static int method12666(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			return 0;
		}
		@Pc(8) Class93_Sub6 local8 = Class557.method31064(arg0, arg1, (short) 255);
		if (local8 == null) {
			return ((Class93_Sub1_Sub2) Class638.aClass32_Sub22_1.get(arg0, -1689154996)).anInt316 * 820091969;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local8.anIntArray173.length; local23++) {
			if (local8.anIntArray173[local23] == -1) {
				local21++;
			}
		}
		return local21 + (((Class93_Sub1_Sub2) Class638.aClass32_Sub22_1.get(arg0, 1253210379)).anInt316 * 820091969 - local8.anIntArray173.length);
	}

	@OriginalMember(owner = "client!ajo", name = "al", descriptor = "(IIIILclient!abn;Z)V", line = 111)
	static void method12667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class40 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(8) long local8 = (long) (arg0 | (arg5 ? Integer.MIN_VALUE : 0));
		@Pc(13) Class93_Sub6 local13 = (Class93_Sub6) aClass16_9.method214(local8);
		if (local13 == null) {
			local13 = new Class93_Sub6();
			aClass16_9.method220(local13, local8);
		}
		if (local13.anIntArray173.length <= arg1) {
			@Pc(34) int[] local34 = new int[arg1 + 1];
			@Pc(39) int[] local39 = new int[arg1 + 1];
			@Pc(41) Class40[] local41 = null;
			if (local13.aClass40Array1 != null) {
				local41 = new Class40[arg1 + 1];
			}
			@Pc(52) int local52;
			for (local52 = 0; local52 < local13.anIntArray173.length; local52++) {
				local34[local52] = local13.anIntArray173[local52];
				local39[local52] = local13.anIntArray174[local52];
				if (local13.aClass40Array1 != null) {
					local41[local52] = local13.aClass40Array1[local52];
				}
			}
			for (local52 = local13.anIntArray173.length; local52 < arg1; local52++) {
				local34[local52] = -1;
				local39[local52] = 0;
			}
			local13.anIntArray173 = local34;
			local13.anIntArray174 = local39;
			local13.aClass40Array1 = local41;
		}
		local13.anIntArray173[arg1] = arg2;
		local13.anIntArray174[arg1] = arg3;
		if (arg4 != null) {
			if (local13.aClass40Array1 == null) {
				local13.aClass40Array1 = new Class40[local13.anIntArray173.length];
			}
			local13.aClass40Array1[arg1] = arg4;
		} else if (local13.aClass40Array1 != null) {
			local13.aClass40Array1[arg1] = null;
		}
	}

	@OriginalMember(owner = "client!ajo", name = "ac", descriptor = "(IIIILclient!abn;Z)V", line = 111)
	static void method12668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class40 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(8) long local8 = (long) (arg0 | (arg5 ? Integer.MIN_VALUE : 0));
		@Pc(13) Class93_Sub6 local13 = (Class93_Sub6) aClass16_9.method214(local8);
		if (local13 == null) {
			local13 = new Class93_Sub6();
			aClass16_9.method220(local13, local8);
		}
		if (local13.anIntArray173.length <= arg1) {
			@Pc(34) int[] local34 = new int[arg1 + 1];
			@Pc(39) int[] local39 = new int[arg1 + 1];
			@Pc(41) Class40[] local41 = null;
			if (local13.aClass40Array1 != null) {
				local41 = new Class40[arg1 + 1];
			}
			@Pc(52) int local52;
			for (local52 = 0; local52 < local13.anIntArray173.length; local52++) {
				local34[local52] = local13.anIntArray173[local52];
				local39[local52] = local13.anIntArray174[local52];
				if (local13.aClass40Array1 != null) {
					local41[local52] = local13.aClass40Array1[local52];
				}
			}
			for (local52 = local13.anIntArray173.length; local52 < arg1; local52++) {
				local34[local52] = -1;
				local39[local52] = 0;
			}
			local13.anIntArray173 = local34;
			local13.anIntArray174 = local39;
			local13.aClass40Array1 = local41;
		}
		local13.anIntArray173[arg1] = arg2;
		local13.anIntArray174[arg1] = arg3;
		if (arg4 != null) {
			if (local13.aClass40Array1 == null) {
				local13.aClass40Array1 = new Class40[local13.anIntArray173.length];
			}
			local13.aClass40Array1[arg1] = arg4;
		} else if (local13.aClass40Array1 != null) {
			local13.aClass40Array1[arg1] = null;
		}
	}

	@OriginalMember(owner = "client!ajo", name = "ai", descriptor = "(IZ)V", line = 145)
	static void method12669(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class93_Sub6 local4 = Class557.method31064(arg0, arg1, (short) 255);
		if (local4 == null) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < local4.anIntArray173.length; local10++) {
			local4.anIntArray173[local10] = -1;
			local4.anIntArray174[local10] = 0;
		}
		local4.aClass40Array1 = null;
	}

	@OriginalMember(owner = "client!ajo", name = "aw", descriptor = "(IZ)V", line = 145)
	static void method12670(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class93_Sub6 local4 = Class557.method31064(arg0, arg1, (short) 255);
		if (local4 == null) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < local4.anIntArray173.length; local10++) {
			local4.anIntArray173[local10] = -1;
			local4.anIntArray174[local10] = 0;
		}
		local4.aClass40Array1 = null;
	}

	@OriginalMember(owner = "client!ajo", name = "as", descriptor = "(IZ)V", line = 155)
	static void method12671(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class93_Sub6 local4 = Class557.method31064(arg0, arg1, (short) 255);
		if (local4 != null) {
			local4.method23969(-158247512);
		}
	}

	@OriginalMember(owner = "client!ajo", name = "at", descriptor = "(IZ)V", line = 155)
	static void method12672(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class93_Sub6 local4 = Class557.method31064(arg0, arg1, (short) 255);
		if (local4 != null) {
			local4.method23969(1456247297);
		}
	}

	@OriginalMember(owner = "client!ajo", name = "am", descriptor = "(IZ)V", line = 155)
	static void method12673(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class93_Sub6 local4 = Class557.method31064(arg0, arg1, (short) 255);
		if (local4 != null) {
			local4.method23969(1932122460);
		}
	}

	@OriginalMember(owner = "client!ajo", name = "ad", descriptor = "(IZ)V", line = 155)
	static void method12674(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class93_Sub6 local4 = Class557.method31064(arg0, arg1, (short) 255);
		if (local4 != null) {
			local4.method23969(1904046954);
		}
	}

	@OriginalMember(owner = "client!ajo", name = "ap", descriptor = "()V", line = 161)
	static void method12675() {
		aClass16_9.method225((byte) 103);
	}

	@OriginalMember(owner = "client!ajo", name = "au", descriptor = "()V", line = 161)
	static void method12676() {
		aClass16_9.method225((byte) 124);
	}

	@OriginalMember(owner = "client!ajo", name = "ar", descriptor = "()V", line = 161)
	static void method12677() {
		aClass16_9.method225((byte) 117);
	}

	@OriginalMember(owner = "client!ajo", name = "r", descriptor = "([II[IZI)J", line = 165)
	long method12678(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(1) long[] local1 = Packet.crc64table;
		@Pc(3) long local3 = -1L;
		@Pc(19) long local19 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg1 >> 8)) & 0xFFL)];
		local3 = local19 >>> 8 ^ local1[(int) ((local19 ^ (long) arg1) & 0xFFL)];
		@Pc(35) int local35;
		for (local35 = 0; local35 < arg0.length; local35++) {
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 24)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 16)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 8)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) arg0[local35]) & 0xFFL)];
		}
		if (arg2 != null) {
			for (local35 = 0; local35 < 5; local35++) {
				local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) arg2[local35]) & 0xFFL)];
			}
		}
		return local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!ajo", name = "aq", descriptor = "([II[IZ)J", line = 165)
	long method12679(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3) {
		@Pc(1) long[] local1 = Packet.crc64table;
		@Pc(3) long local3 = -1L;
		@Pc(19) long local19 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg1 >> 8)) & 0xFFL)];
		local3 = local19 >>> 8 ^ local1[(int) ((local19 ^ (long) arg1) & 0xFFL)];
		@Pc(35) int local35;
		for (local35 = 0; local35 < arg0.length; local35++) {
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 24)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 16)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 8)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) arg0[local35]) & 0xFFL)];
		}
		if (arg2 != null) {
			for (local35 = 0; local35 < 5; local35++) {
				local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) arg2[local35]) & 0xFFL)];
			}
		}
		return local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!ajo", name = "v", descriptor = "(Lclient!dh;ILclient!aaq;IZLclient!xg;I)Lclient!do;", line = 185)
	final Class109 method12680(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class658 arg5, @OriginalArg(6) int arg6) {
		@Pc(1) Class109 local1 = null;
		@Pc(3) int local3 = arg1;
		@Pc(5) Class622 local5 = null;
		if (arg3 != -1) {
			local5 = (Class622) Class166_Sub6.aClass32_Sub5_1.get(arg3, 359516575);
		}
		@Pc(17) int[] local17 = this.anIntArray173;
		if (local5 != null && local5.anIntArray495 != null) {
			local17 = new int[local5.anIntArray495.length];
			for (@Pc(30) int local30 = 0; local30 < local5.anIntArray495.length; local30++) {
				@Pc(40) int local40 = local5.anIntArray495[local30];
				if (local40 >= 0 && local40 < this.anIntArray173.length) {
					local17[local30] = this.anIntArray173[local40];
				} else {
					local17[local30] = -1;
				}
			}
		}
		if (arg2 != null) {
			local3 = arg1 | arg2.method23585(-2014248629);
		}
		@Pc(83) long local83 = this.method12678(local17, arg3, arg5 == null ? null : arg5.anIntArray511, arg4, 872529157);
		if (aClass240_19 != null) {
			local1 = (Class109) aClass240_19.method25829(local83);
		}
		if (local1 == null || arg0.method20759(local1.method6875(), local3) != 0) {
			if (local1 != null) {
				local3 = arg0.method20599(local3, local1.method6875());
			}
			@Pc(109) int local109 = local3;
			@Pc(111) boolean local111 = false;
			for (@Pc(113) int local113 = 0; local113 < local17.length; local113++) {
				if (local17[local113] != -1 && !((Class47) Class277.aClass32_Sub12_1.get(local17[local113], 1502071415)).method938(arg4, null, -1231176817)) {
					local111 = true;
				}
			}
			if (local111) {
				return null;
			}
			@Pc(147) Class231[] local147 = new Class231[local17.length];
			@Pc(149) int local149;
			for (local149 = 0; local149 < local17.length; local149++) {
				if (local17[local149] != -1) {
					local147[local149] = ((Class47) Class277.aClass32_Sub12_1.get(local17[local149], 401021027)).method939(arg4, null, -798141552);
				}
			}
			@Pc(207) int local207;
			@Pc(214) int local214;
			if (local5 != null && local5.anIntArrayArray65 != null) {
				for (local149 = 0; local149 < local5.anIntArrayArray65.length; local149++) {
					if (local5.anIntArrayArray65[local149] != null && local147[local149] != null) {
						local207 = local5.anIntArrayArray65[local149][0];
						local214 = local5.anIntArrayArray65[local149][1];
						@Pc(221) int local221 = local5.anIntArrayArray65[local149][2];
						@Pc(228) int local228 = local5.anIntArrayArray65[local149][3];
						@Pc(235) int local235 = local5.anIntArrayArray65[local149][4];
						@Pc(242) int local242 = local5.anIntArrayArray65[local149][5];
						if (local228 != 0 || local235 != 0 || local242 != 0) {
							local147[local149].method25689(local228, local235, local242);
						}
						if (local207 != 0 || local214 != 0 || local221 != 0) {
							local147[local149].method25687(local207, local214, local221);
						}
					}
				}
			}
			@Pc(281) Class231 local281 = new Class231(local147, local147.length);
			if (arg5 != null) {
				local109 = local3 | 0x4000;
			}
			local1 = arg0.method20597(local281, local109, anInt1444 * -2144238343, 65, 852);
			if (arg5 != null) {
				local207 = 0;
				label123: while (true) {
					if (local207 >= 10) {
						local207 = 0;
						while (true) {
							if (local207 >= 10) {
								break label123;
							}
							for (local214 = 0; local214 < Class138_Sub3.aShortArrayArray4[local207].length; local214++) {
								if (arg5.anIntArray512[local207] < Class79_Sub1_Sub2.aShortArrayArrayArray1[local207][local214].length) {
									local1.method6913(Class138_Sub3.aShortArrayArray4[local207][local214], Class79_Sub1_Sub2.aShortArrayArrayArray1[local207][local214][arg5.anIntArray512[local207]]);
								}
							}
							local207++;
						}
					}
					for (local214 = 0; local214 < Class618.aShortArrayArray6[local207].length; local214++) {
						if (arg5.anIntArray511[local207] < Class111.aShortArrayArrayArray3[local207][local214].length) {
							local1.method7017(Class618.aShortArrayArray6[local207][local214], Class111.aShortArrayArrayArray3[local207][local214][arg5.anIntArray511[local207]]);
						}
					}
					local207++;
				}
			}
			if (aClass240_19 != null) {
				local1.method6874(local3);
				aClass240_19.method25838(local1, local83);
			}
		}
		if (arg2 == null) {
			return local1;
		} else {
			@Pc(411) Class109 local411 = local1.method6938((byte) 1, local3, true);
			arg2.method23587(local411, 0, 726909592);
			return local411;
		}
	}

	@OriginalMember(owner = "client!ajo", name = "ax", descriptor = "(Lclient!dh;ILclient!aaq;IZLclient!xg;)Lclient!do;", line = 185)
	final Class109 method12681(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class658 arg5) {
		@Pc(1) Class109 local1 = null;
		@Pc(3) int local3 = arg1;
		@Pc(5) Class622 local5 = null;
		if (arg3 != -1) {
			local5 = (Class622) Class166_Sub6.aClass32_Sub5_1.get(arg3, 1889016888);
		}
		@Pc(17) int[] local17 = this.anIntArray173;
		if (local5 != null && local5.anIntArray495 != null) {
			local17 = new int[local5.anIntArray495.length];
			for (@Pc(30) int local30 = 0; local30 < local5.anIntArray495.length; local30++) {
				@Pc(40) int local40 = local5.anIntArray495[local30];
				if (local40 >= 0 && local40 < this.anIntArray173.length) {
					local17[local30] = this.anIntArray173[local40];
				} else {
					local17[local30] = -1;
				}
			}
		}
		if (arg2 != null) {
			local3 = arg1 | arg2.method23585(-1848291544);
		}
		@Pc(83) long local83 = this.method12678(local17, arg3, arg5 == null ? null : arg5.anIntArray511, arg4, -492352189);
		if (aClass240_19 != null) {
			local1 = (Class109) aClass240_19.method25829(local83);
		}
		if (local1 == null || arg0.method20759(local1.method6875(), local3) != 0) {
			if (local1 != null) {
				local3 = arg0.method20599(local3, local1.method6875());
			}
			@Pc(109) int local109 = local3;
			@Pc(111) boolean local111 = false;
			for (@Pc(113) int local113 = 0; local113 < local17.length; local113++) {
				if (local17[local113] != -1 && !((Class47) Class277.aClass32_Sub12_1.get(local17[local113], -1051006597)).method938(arg4, null, -1124244071)) {
					local111 = true;
				}
			}
			if (local111) {
				return null;
			}
			@Pc(147) Class231[] local147 = new Class231[local17.length];
			@Pc(149) int local149;
			for (local149 = 0; local149 < local17.length; local149++) {
				if (local17[local149] != -1) {
					local147[local149] = ((Class47) Class277.aClass32_Sub12_1.get(local17[local149], 1181971570)).method939(arg4, null, -1149070636);
				}
			}
			@Pc(207) int local207;
			@Pc(214) int local214;
			if (local5 != null && local5.anIntArrayArray65 != null) {
				for (local149 = 0; local149 < local5.anIntArrayArray65.length; local149++) {
					if (local5.anIntArrayArray65[local149] != null && local147[local149] != null) {
						local207 = local5.anIntArrayArray65[local149][0];
						local214 = local5.anIntArrayArray65[local149][1];
						@Pc(221) int local221 = local5.anIntArrayArray65[local149][2];
						@Pc(228) int local228 = local5.anIntArrayArray65[local149][3];
						@Pc(235) int local235 = local5.anIntArrayArray65[local149][4];
						@Pc(242) int local242 = local5.anIntArrayArray65[local149][5];
						if (local228 != 0 || local235 != 0 || local242 != 0) {
							local147[local149].method25689(local228, local235, local242);
						}
						if (local207 != 0 || local214 != 0 || local221 != 0) {
							local147[local149].method25687(local207, local214, local221);
						}
					}
				}
			}
			@Pc(281) Class231 local281 = new Class231(local147, local147.length);
			if (arg5 != null) {
				local109 = local3 | 0x4000;
			}
			local1 = arg0.method20597(local281, local109, anInt1444 * -2144238343, 65, 852);
			if (arg5 != null) {
				local207 = 0;
				label123: while (true) {
					if (local207 >= 10) {
						local207 = 0;
						while (true) {
							if (local207 >= 10) {
								break label123;
							}
							for (local214 = 0; local214 < Class138_Sub3.aShortArrayArray4[local207].length; local214++) {
								if (arg5.anIntArray512[local207] < Class79_Sub1_Sub2.aShortArrayArrayArray1[local207][local214].length) {
									local1.method6913(Class138_Sub3.aShortArrayArray4[local207][local214], Class79_Sub1_Sub2.aShortArrayArrayArray1[local207][local214][arg5.anIntArray512[local207]]);
								}
							}
							local207++;
						}
					}
					for (local214 = 0; local214 < Class618.aShortArrayArray6[local207].length; local214++) {
						if (arg5.anIntArray511[local207] < Class111.aShortArrayArrayArray3[local207][local214].length) {
							local1.method7017(Class618.aShortArrayArray6[local207][local214], Class111.aShortArrayArrayArray3[local207][local214][arg5.anIntArray511[local207]]);
						}
					}
					local207++;
				}
			}
			if (aClass240_19 != null) {
				local1.method6874(local3);
				aClass240_19.method25838(local1, local83);
			}
		}
		if (arg2 == null) {
			return local1;
		} else {
			@Pc(411) Class109 local411 = local1.method6938((byte) 1, local3, true);
			arg2.method23587(local411, 0, -718444510);
			return local411;
		}
	}

	@OriginalMember(owner = "client!ajo", name = "av", descriptor = "(I)V", line = 255)
	static void method12682(@OriginalArg(0) int arg0) {
		anInt1444 = arg0 * -2047869623;
		aClass240_19.method25847((byte) -15);
	}

	@OriginalMember(owner = "client!ajo", name = "jw", descriptor = "(Lclient!yf;I)V", line = 6661)
	static final void method12683(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
	}
}
