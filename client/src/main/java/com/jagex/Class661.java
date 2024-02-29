package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xj")
public class Class661 implements Interface13 {

	@OriginalMember(owner = "client!xj", name = "z", descriptor = "J")
	static long aLong302;

	@OriginalMember(owner = "client!xj", name = "n", descriptor = "I")
	int anInt5825;

	@OriginalMember(owner = "client!xj", name = "m", descriptor = "I")
	public int anInt5826;

	@OriginalMember(owner = "client!xj", name = "k", descriptor = "I")
	public int anInt5827;

	@OriginalMember(owner = "client!xj", name = "e", descriptor = "Lclient!xd;")
	final Class162 aClass162_1;

	@OriginalMember(owner = "client!xj", name = "<init>", descriptor = "(ILclient!xd;)V", line = 16)
	Class661(@OriginalArg(0) int arg0, @OriginalArg(1) Class162 arg1) {
		this.aClass162_1 = arg1;
	}

	@OriginalMember(owner = "client!xj", name = "e", descriptor = "(Lclient!alw;B)V", line = 22)
	@Override
	public void method36654(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method32834(arg0, local3, -1614610382);
		}
	}

	@OriginalMember(owner = "client!xj", name = "m", descriptor = "(Lclient!alw;)V", line = 22)
	@Override
	public void method36655(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method32834(arg0, local3, -1208991450);
		}
	}

	@OriginalMember(owner = "client!xj", name = "k", descriptor = "(Lclient!alw;)V", line = 22)
	@Override
	public void method36656(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method32834(arg0, local3, -404219092);
		}
	}

	@OriginalMember(owner = "client!xj", name = "w", descriptor = "(Lclient!alw;)V", line = 22)
	@Override
	public void method36658(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method32834(arg0, local3, -1378804945);
		}
	}

	@OriginalMember(owner = "client!xj", name = "f", descriptor = "(Lclient!alw;)V", line = 22)
	@Override
	public void method36657(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method32834(arg0, local3, -328638672);
		}
	}

	@OriginalMember(owner = "client!xj", name = "k", descriptor = "(Lclient!alw;B)Lclient!kp;", line = 24)
	public static Class125 method32833(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class125 local3 = Class32_Sub4.method16727(arg0, -423624971);
		@Pc(7) int local7 = arg0.method22542(-280326472);
		@Pc(11) int local11 = arg0.method22542(-1674557000);
		@Pc(15) int local15 = arg0.method22542(-1727622688);
		@Pc(19) int local19 = arg0.method22542(-1967552013);
		@Pc(23) int local23 = arg0.method22542(-794453534);
		@Pc(27) int local27 = arg0.method22542(-2087916654);
		return new Class125_Sub2(local3.aClass390_7, local3.aClass392_7, local3.anInt2981 * 483768335, local3.anInt2982 * 2099407685, local3.anInt2983 * 1135283731, local3.anInt2980 * -1017655207, local3.anInt2985 * -1946839755, local3.anInt2986 * -1726029297, local3.anInt2984 * 291173831, local7, local11, local15, local19, local23, local27);
	}

	@OriginalMember(owner = "client!xj", name = "u", descriptor = "(Lclient!alw;II)V", line = 29)
	void method32834(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt5825 = arg0.method22542(-1502285807) * -1817257563;
		} else if (arg1 == 2) {
			this.anInt5826 = arg0.method22465((short) 16384) * 751866733;
			this.anInt5827 = arg0.method22465((short) 16384) * -2078419265;
		}
	}

	@OriginalMember(owner = "client!xj", name = "c", descriptor = "()Lclient!de;", line = 38)
	public synchronized Class105 method32835() {
		@Pc(10) Class105 local10 = (Class105) this.aClass162_1.aClass240_37.method25829((long) (this.anInt5825 * -1818466771));
		if (local10 != null) {
			return local10;
		}
		local10 = Class203.method24648(this.aClass162_1.aClass497_56, this.anInt5825 * -1818466771, 0);
		if (local10 != null) {
			this.aClass162_1.aClass240_37.method25838(local10, (long) (this.anInt5825 * -1818466771));
		}
		return local10;
	}

	@OriginalMember(owner = "client!xj", name = "z", descriptor = "(I)Lclient!de;", line = 38)
	public synchronized Class105 method32836(@OriginalArg(0) int arg0) {
		@Pc(10) Class105 local10 = (Class105) this.aClass162_1.aClass240_37.method25829((long) (this.anInt5825 * -1818466771));
		if (local10 != null) {
			return local10;
		}
		local10 = Class203.method24648(this.aClass162_1.aClass497_56, this.anInt5825 * -1818466771, 0);
		if (local10 != null) {
			this.aClass162_1.aClass240_37.method25838(local10, (long) (this.anInt5825 * -1818466771));
		}
		return local10;
	}

	@OriginalMember(owner = "client!xj", name = "r", descriptor = "()Lclient!de;", line = 38)
	public synchronized Class105 method32837() {
		@Pc(10) Class105 local10 = (Class105) this.aClass162_1.aClass240_37.method25829((long) (this.anInt5825 * -1818466771));
		if (local10 != null) {
			return local10;
		}
		local10 = Class203.method24648(this.aClass162_1.aClass497_56, this.anInt5825 * -1818466771, 0);
		if (local10 != null) {
			this.aClass162_1.aClass240_37.method25838(local10, (long) (this.anInt5825 * -1818466771));
		}
		return local10;
	}

	@OriginalMember(owner = "client!xj", name = "p", descriptor = "()Lclient!de;", line = 38)
	public synchronized Class105 method32838() {
		@Pc(10) Class105 local10 = (Class105) this.aClass162_1.aClass240_37.method25829((long) (this.anInt5825 * -1818466771));
		if (local10 != null) {
			return local10;
		}
		local10 = Class203.method24648(this.aClass162_1.aClass497_56, this.anInt5825 * -1818466771, 0);
		if (local10 != null) {
			this.aClass162_1.aClass240_37.method25838(local10, (long) (this.anInt5825 * -1818466771));
		}
		return local10;
	}

	@OriginalMember(owner = "client!xj", name = "d", descriptor = "()Lclient!de;", line = 38)
	public synchronized Class105 method32839() {
		@Pc(10) Class105 local10 = (Class105) this.aClass162_1.aClass240_37.method25829((long) (this.anInt5825 * -1818466771));
		if (local10 != null) {
			return local10;
		}
		local10 = Class203.method24648(this.aClass162_1.aClass497_56, this.anInt5825 * -1818466771, 0);
		if (local10 != null) {
			this.aClass162_1.aClass240_37.method25838(local10, (long) (this.anInt5825 * -1818466771));
		}
		return local10;
	}

	@OriginalMember(owner = "client!xj", name = "n", descriptor = "(I)V", line = 45)
	@Override
	public void method36653(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!xj", name = "l", descriptor = "()V", line = 45)
	@Override
	public void method36659() {
	}

	@OriginalMember(owner = "client!xj", name = "e", descriptor = "(II)Z", line = 58)
	public static boolean method32840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class249.anInt3843 * -213302133 != arg0 || Class136.aClass244_1 == null) {
			Class287.method26542(-100950526);
			Class136.aClass244_1 = Class244.aClass244_2;
			Class249.anInt3843 = arg0 * 1397359395;
		}
		@Pc(40) int local40;
		if (Class244.aClass244_2 == Class136.aClass244_1) {
			@Pc(23) byte[] local23 = Class446.aClass497_117.method30079(arg0, (byte) 58);
			if (local23 == null) {
				return false;
			}
			@Pc(33) Class93_Sub41 local33 = new Class93_Sub41(local23);
			Class437.method28816(local33, -1420512156);
			local40 = local33.method22465((short) 16384);
			@Pc(42) int local42;
			for (local42 = 0; local42 < local40; local42++) {
				Class249.aClass22_51.method408(new Class93_Sub27(local33), -1304297262);
			}
			local42 = local33.method22528((byte) -18);
			Class249.aClass255Array1 = new Class255[local42];
			@Pc(63) int local63;
			for (local63 = 0; local63 < local42; local63++) {
				Class249.aClass255Array1[local63] = new Class255(local33);
			}
			local63 = local33.method22528((byte) -74);
			Class249.aClass239Array1 = new Class239[local63];
			@Pc(84) int local84;
			for (local84 = 0; local84 < local63; local84++) {
				Class249.aClass239Array1[local84] = new Class239(local33, local84);
			}
			local84 = local33.method22528((byte) -53);
			Class152.aClass243Array2 = new Class243[local84];
			@Pc(106) int local106;
			for (local106 = 0; local106 < local84; local106++) {
				Class152.aClass243Array2[local106] = new Class243(local33);
			}
			local106 = local33.method22528((byte) -100);
			Class716.aClass250Array1 = new Class250[local106];
			@Pc(127) int local127;
			for (local127 = 0; local127 < local106; local127++) {
				Class716.aClass250Array1[local127] = new Class250(local33);
			}
			local127 = local33.method22528((byte) -108);
			Class249.aClass110Array1 = new Class110[local127];
			for (@Pc(148) int local148 = 0; local148 < local127; local148++) {
				Class249.aClass110Array1[local148] = Class18.method242(local33, -774040536);
			}
			Class136.aClass244_1 = Class244.aClass244_3;
		}
		if (Class136.aClass244_1 == Class244.aClass244_3) {
			@Pc(166) boolean local166 = true;
			@Pc(168) Class239[] local168 = Class249.aClass239Array1;
			for (local40 = 0; local40 < local168.length; local40++) {
				@Pc(178) Class239 local178 = local168[local40];
				if (!local178.method25816(-582205390)) {
					local166 = false;
				}
			}
			@Pc(188) Class110[] local188 = Class249.aClass110Array1;
			for (local40 = 0; local40 < local188.length; local40++) {
				@Pc(198) Class110 local198 = local188[local40];
				if (!local198.method20141(-2020544498)) {
					local166 = false;
				}
			}
			@Pc(208) Class243[] local208 = Class152.aClass243Array2;
			for (local40 = 0; local40 < local208.length; local40++) {
				@Pc(218) Class243 local218 = local208[local40];
				if (!local218.method25886(-565555133)) {
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

	@OriginalMember(owner = "client!xj", name = "d", descriptor = "(IZB)V", line = 155)
	static void method32841(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		@Pc(4) Class93_Sub6 local4 = Class557.method31064(arg0, arg1, (short) 255);
		if (local4 != null) {
			local4.method23969(1984001492);
		}
	}

	@OriginalMember(owner = "client!xj", name = "u", descriptor = "(Lclient!aqk;I)V", line = 280)
	public static void method32842(@OriginalArg(0) Class132_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class93_Sub13 local8 = (Class93_Sub13) Class93_Sub13.aClass16_11.method214((long) (arg0.anInt2768 * -1688488127));
		if (local8 == null) {
			Class643.method32582(arg0.aByte100, arg0.anIntArray240[0], arg0.anIntArray239[0], 0, null, null, arg0, 694869299);
		} else {
			local8.method13471((byte) 72);
		}
	}

	@OriginalMember(owner = "client!xj", name = "an", descriptor = "(Lclient!yf;B)V", line = 5076)
	static final void method32843(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5894 -= 1566132618;
		if (arg0.aLongArray27[arg0.anInt5894 * -2000995827 + 1] != arg0.aLongArray27[arg0.anInt5894 * -2000995827]) {
			arg0.anInt5889 += arg0.anIntArray520[arg0.anInt5889 * -709694321] * 2047914607;
		}
	}

	@OriginalMember(owner = "client!xj", name = "ns", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 7480)
	static final void method32844(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (Class532.method30597(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		Class499.method30149(local13, arg2, -922353742);
	}
}
