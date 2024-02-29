package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xj")
public final class Class661 implements Interface13 {

	@OriginalMember(owner = "client!xj", name = "z", descriptor = "J")
	static long aLong305;

	@OriginalMember(owner = "client!xj", name = "n", descriptor = "I")
	int anInt5986;

	@OriginalMember(owner = "client!xj", name = "m", descriptor = "I")
	public int anInt5987;

	@OriginalMember(owner = "client!xj", name = "k", descriptor = "I")
	public int anInt5988;

	@OriginalMember(owner = "client!xj", name = "e", descriptor = "Lclient!xd;")
	final Class162 aClass162_1;

	@OriginalMember(owner = "client!xj", name = "an", descriptor = "(Lclient!yf;B)V")
	static void method33020(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6055 -= 1566132618;
		if (arg0.aLongArray27[arg0.anInt6055 * -2000995827 + 1] != arg0.aLongArray27[arg0.anInt6055 * -2000995827]) {
			arg0.anInt6050 += arg0.anIntArray522[arg0.anInt6050 * -709694321] * 2047914607;
		}
	}

	@OriginalMember(owner = "client!xj", name = "e", descriptor = "(II)Z")
	public static boolean method33021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class249.anInt3884 * -213302133 != arg0 || Class136.aClass244_1 == null) {
			Class287.method26634(-100950526);
			Class136.aClass244_1 = Class244.aClass244_2;
			Class249.anInt3884 = arg0 * 1397359395;
		}
		@Pc(40) int local40;
		if (Class244.aClass244_2 == Class136.aClass244_1) {
			@Pc(23) byte[] local23 = Class446.aClass497_117.method30240(arg0, (byte) 58);
			if (local23 == null) {
				return false;
			}
			@Pc(33) Class93_Sub41 local33 = new Class93_Sub41(local23);
			Class437.method29000(local33, -1420512156);
			local40 = local33.method22425((short) 16384);
			@Pc(42) int local42;
			for (local42 = 0; local42 < local40; local42++) {
				Class249.aClass22_51.method407(new Class93_Sub27(local33), -1304297262);
			}
			local42 = local33.method22644((byte) -18);
			Class249.aClass255Array1 = new Class255[local42];
			@Pc(63) int local63;
			for (local63 = 0; local63 < local42; local63++) {
				Class249.aClass255Array1[local63] = new Class255(local33);
			}
			local63 = local33.method22644((byte) -74);
			Class249.aClass239Array1 = new Class239[local63];
			@Pc(84) int local84;
			for (local84 = 0; local84 < local63; local84++) {
				Class249.aClass239Array1[local84] = new Class239(local33, local84);
			}
			local84 = local33.method22644((byte) -53);
			Class152.aClass243Array2 = new Class243[local84];
			@Pc(106) int local106;
			for (local106 = 0; local106 < local84; local106++) {
				Class152.aClass243Array2[local106] = new Class243(local33);
			}
			local106 = local33.method22644((byte) -100);
			Class716.aClass250Array1 = new Class250[local106];
			@Pc(127) int local127;
			for (local127 = 0; local127 < local106; local127++) {
				Class716.aClass250Array1[local127] = new Class250(local33);
			}
			local127 = local33.method22644((byte) -108);
			Class249.aClass110Array1 = new Class110[local127];
			for (@Pc(148) int local148 = 0; local148 < local127; local148++) {
				Class249.aClass110Array1[local148] = Class18.method271(local33, -774040536);
			}
			Class136.aClass244_1 = Class244.aClass244_3;
		}
		if (Class136.aClass244_1 == Class244.aClass244_3) {
			@Pc(166) boolean local166 = true;
			@Pc(168) Class239[] local168 = Class249.aClass239Array1;
			for (local40 = 0; local40 < local168.length; local40++) {
				@Pc(178) Class239 local178 = local168[local40];
				if (!local178.method25901(-582205390)) {
					local166 = false;
				}
			}
			@Pc(188) Class110[] local188 = Class249.aClass110Array1;
			for (local40 = 0; local40 < local188.length; local40++) {
				@Pc(198) Class110 local198 = local188[local40];
				if (!local198.method20151(-2020544498)) {
					local166 = false;
				}
			}
			@Pc(208) Class243[] local208 = Class152.aClass243Array2;
			for (local40 = 0; local40 < local208.length; local40++) {
				@Pc(218) Class243 local218 = local208[local40];
				if (!local218.method25976(-565555133)) {
					local166 = false;
				}
			}
			if (!local166) {
				return false;
			}
			Class136.aClass244_1 = Class244.aClass244_4;
		}
		return true;
	}

	@OriginalMember(owner = "client!xj", name = "d", descriptor = "(IZB)V")
	static void method33022(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		@Pc(4) Class93_Sub6 local4 = Class557.method31246(arg0, arg1, (short) 255);
		if (local4 != null) {
			local4.method23981(1984001492);
		}
	}

	@OriginalMember(owner = "client!xj", name = "u", descriptor = "(Lclient!aqk;I)V")
	public static void method33023(@OriginalArg(0) Class132_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class93_Sub13 local8 = (Class93_Sub13) Class93_Sub13.aClass16_11.method215((long) (arg0.anInt2768 * -1688488127));
		if (local8 == null) {
			Class643.method32764(arg0.aByte100, arg0.anIntArray240[0], arg0.anIntArray239[0], 0, null, null, arg0, 694869299);
		} else {
			local8.method13464((byte) 72);
		}
	}

	@OriginalMember(owner = "client!xj", name = "ns", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method33024(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		if (Class532.method30778(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		Class499.method30329(local13, arg2, -922353742);
	}

	@OriginalMember(owner = "client!xj", name = "k", descriptor = "(Lclient!alw;B)Lclient!kp;")
	public static Class125 method33025(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class125 local3 = Class32_Sub4.method16739(arg0, -423624971);
		@Pc(7) int local7 = arg0.method22448(-280326472);
		@Pc(11) int local11 = arg0.method22448(-1674557000);
		@Pc(15) int local15 = arg0.method22448(-1727622688);
		@Pc(19) int local19 = arg0.method22448(-1967552013);
		@Pc(23) int local23 = arg0.method22448(-794453534);
		@Pc(27) int local27 = arg0.method22448(-2087916654);
		return new Class125_Sub2(local3.aClass390_7, local3.aClass392_7, local3.anInt2981 * 483768335, local3.anInt2982 * 2099407685, local3.anInt2983 * 1135283731, local3.anInt2980 * -1017655207, local3.anInt2985 * -1946839755, local3.anInt2986 * -1726029297, local3.anInt2984 * 291173831, local7, local11, local15, local19, local23, local27);
	}

	@OriginalMember(owner = "client!xj", name = "<init>", descriptor = "(ILclient!xd;)V")
	Class661(@OriginalArg(0) int arg0, @OriginalArg(1) Class162 arg1) {
		this.aClass162_1 = arg1;
	}

	@OriginalMember(owner = "client!xj", name = "e", descriptor = "(Lclient!alw;B)V")
	@Override
	public void method36835(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method33016(arg0, local3, -1614610382);
		}
	}

	@OriginalMember(owner = "client!xj", name = "c", descriptor = "()Lclient!de;")
	public synchronized Class105 method33014() {
		@Pc(10) Class105 local10 = (Class105) this.aClass162_1.aClass240_37.method25932((long) (this.anInt5986 * -1818466771));
		if (local10 != null) {
			return local10;
		}
		local10 = Class203.method24664(this.aClass162_1.aClass497_56, this.anInt5986 * -1818466771, 0);
		if (local10 != null) {
			this.aClass162_1.aClass240_37.method25923(local10, (long) (this.anInt5986 * -1818466771));
		}
		return local10;
	}

	@OriginalMember(owner = "client!xj", name = "z", descriptor = "(I)Lclient!de;")
	public synchronized Class105 method33015(@OriginalArg(0) int arg0) {
		@Pc(10) Class105 local10 = (Class105) this.aClass162_1.aClass240_37.method25932((long) (this.anInt5986 * -1818466771));
		if (local10 != null) {
			return local10;
		}
		local10 = Class203.method24664(this.aClass162_1.aClass497_56, this.anInt5986 * -1818466771, 0);
		if (local10 != null) {
			this.aClass162_1.aClass240_37.method25923(local10, (long) (this.anInt5986 * -1818466771));
		}
		return local10;
	}

	@OriginalMember(owner = "client!xj", name = "n", descriptor = "(I)V")
	@Override
	public void method36834(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!xj", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36836(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method33016(arg0, local3, -1208991450);
		}
	}

	@OriginalMember(owner = "client!xj", name = "k", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36837(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method33016(arg0, local3, -404219092);
		}
	}

	@OriginalMember(owner = "client!xj", name = "u", descriptor = "(Lclient!alw;II)V")
	void method33016(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt5986 = arg0.method22448(-1502285807) * -1817257563;
		} else if (arg1 == 2) {
			this.anInt5987 = arg0.method22425((short) 16384) * 751866733;
			this.anInt5988 = arg0.method22425((short) 16384) * -2078419265;
		}
	}

	@OriginalMember(owner = "client!xj", name = "r", descriptor = "()Lclient!de;")
	public synchronized Class105 method33017() {
		@Pc(10) Class105 local10 = (Class105) this.aClass162_1.aClass240_37.method25932((long) (this.anInt5986 * -1818466771));
		if (local10 != null) {
			return local10;
		}
		local10 = Class203.method24664(this.aClass162_1.aClass497_56, this.anInt5986 * -1818466771, 0);
		if (local10 != null) {
			this.aClass162_1.aClass240_37.method25923(local10, (long) (this.anInt5986 * -1818466771));
		}
		return local10;
	}

	@OriginalMember(owner = "client!xj", name = "l", descriptor = "()V")
	@Override
	public void method36840() {
	}

	@OriginalMember(owner = "client!xj", name = "p", descriptor = "()Lclient!de;")
	public synchronized Class105 method33018() {
		@Pc(10) Class105 local10 = (Class105) this.aClass162_1.aClass240_37.method25932((long) (this.anInt5986 * -1818466771));
		if (local10 != null) {
			return local10;
		}
		local10 = Class203.method24664(this.aClass162_1.aClass497_56, this.anInt5986 * -1818466771, 0);
		if (local10 != null) {
			this.aClass162_1.aClass240_37.method25923(local10, (long) (this.anInt5986 * -1818466771));
		}
		return local10;
	}

	@OriginalMember(owner = "client!xj", name = "d", descriptor = "()Lclient!de;")
	public synchronized Class105 method33019() {
		@Pc(10) Class105 local10 = (Class105) this.aClass162_1.aClass240_37.method25932((long) (this.anInt5986 * -1818466771));
		if (local10 != null) {
			return local10;
		}
		local10 = Class203.method24664(this.aClass162_1.aClass497_56, this.anInt5986 * -1818466771, 0);
		if (local10 != null) {
			this.aClass162_1.aClass240_37.method25923(local10, (long) (this.anInt5986 * -1818466771));
		}
		return local10;
	}

	@OriginalMember(owner = "client!xj", name = "w", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36839(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method33016(arg0, local3, -1378804945);
		}
	}

	@OriginalMember(owner = "client!xj", name = "f", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36838(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method33016(arg0, local3, -328638672);
		}
	}
}
