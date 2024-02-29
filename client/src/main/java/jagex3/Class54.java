package jagex3;

import java.util.Stack;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acc")
public abstract class Class54 {

	@OriginalMember(owner = "client!acc", name = "u", descriptor = "I")
	public static final int anInt1974 = 2048;

	@OriginalMember(owner = "client!acc", name = "n", descriptor = "I")
	public static final int anInt1975 = 4;

	@OriginalMember(owner = "client!acc", name = "w", descriptor = "I")
	public static final int anInt1976 = 256;

	@OriginalMember(owner = "client!acc", name = "k", descriptor = "I")
	public static final int anInt1977 = 32;

	@OriginalMember(owner = "client!acc", name = "f", descriptor = "I")
	public static final int anInt1978 = 64;

	@OriginalMember(owner = "client!acc", name = "p", descriptor = "I")
	public static final int anInt1979 = 8192;

	@OriginalMember(owner = "client!acc", name = "e", descriptor = "I")
	public static final int anInt1980 = 2;

	@OriginalMember(owner = "client!acc", name = "z", descriptor = "I")
	public static final int anInt1981 = 4096;

	@OriginalMember(owner = "client!acc", name = "c", descriptor = "I")
	public static final int anInt1982 = 32768;

	@OriginalMember(owner = "client!acc", name = "d", descriptor = "I")
	public static final int anInt1984 = 16384;

	@OriginalMember(owner = "client!acc", name = "l", descriptor = "I")
	public static final int anInt1988 = 512;

	@OriginalMember(owner = "client!acc", name = "m", descriptor = "I")
	public static final int anInt1993 = 16;

	@OriginalMember(owner = "client!acc", name = "b", descriptor = "I")
	protected int anInt1983;

	@OriginalMember(owner = "client!acc", name = "q", descriptor = "I")
	protected int anInt1991;

	@OriginalMember(owner = "client!acc", name = "x", descriptor = "I")
	protected int anInt1992;

	@OriginalMember(owner = "client!acc", name = "r", descriptor = "I")
	protected int anInt1986 = 944576993;

	@OriginalMember(owner = "client!acc", name = "v", descriptor = "I")
	protected int anInt1987 = -1830928139;

	@OriginalMember(owner = "client!acc", name = "o", descriptor = "I")
	protected int anInt1985 = -105484837;

	@OriginalMember(owner = "client!acc", name = "s", descriptor = "I")
	protected int anInt1989 = -711251311;

	@OriginalMember(owner = "client!acc", name = "y", descriptor = "I")
	protected int anInt1990 = -811224685;

	@OriginalMember(owner = "client!acc", name = "m", descriptor = "(Lclient!yu;Lclient!ze;II)I")
	public static int method14855(@OriginalArg(0) Class693 arg0, @OriginalArg(1) Class703 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == Class693.aClass693_8) {
			return 80;
		} else if (Class703.aClass703_2 == arg1) {
			return arg2 + 12000;
		} else {
			return arg2 + 7000;
		}
	}

	@OriginalMember(owner = "client!acc", name = "dj", descriptor = "(Lclient!dh;Lclient!aks;Lclient!hs;I)V")
	static void method14856(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class93_Sub29 arg1, @OriginalArg(2) Class322 arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class100 local4 = arg2.method27348(arg0, -1644056994);
		if (local4 == null) {
			return;
		}
		@Pc(10) int local10 = local4.method18201();
		if (local4.method18177() > local10) {
			local10 = local4.method18177();
		}
		@Pc(19) byte local19 = 10;
		@Pc(24) int local24 = arg1.anInt1606 * 704671089;
		@Pc(29) int local29 = arg1.anInt1607 * 1844815193;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		if (arg2.aString180 != null) {
			local33 = Class129_Sub2.aClass5_13.method49(arg2.aString180, Class553.anInt3408 * -1378711501, 0, null, (byte) 0);
			local31 = Class129_Sub2.aClass5_13.method55(arg2.aString180, Class553.anInt3408 * -1378711501, null, -1910907678);
		}
		@Pc(66) int local66 = arg1.anInt1606 * 704671089 + local10 / 2;
		@Pc(71) int local71 = arg1.anInt1607 * 1844815193;
		if (local24 < local10 + Class159_Sub1.anInt1919) {
			local24 = Class159_Sub1.anInt1919;
			local66 = local31 / 2 + 5 + local19 + local10 / 2 + Class159_Sub1.anInt1919;
		} else if (local24 > Class159_Sub1.anInt1941 - local10) {
			local24 = Class159_Sub1.anInt1941 - local10;
			local66 = Class159_Sub1.anInt1941 - local10 / 2 - local19 - local31 / 2 - 5;
		}
		if (local29 < local10 + Class159_Sub1.anInt1934) {
			local29 = Class159_Sub1.anInt1934;
			local71 = local10 / 2 + Class159_Sub1.anInt1934 + local19;
		} else if (local29 > Class159_Sub1.anInt1942 - local10) {
			local29 = Class159_Sub1.anInt1942 - local10;
			local71 = Class159_Sub1.anInt1942 - local10 / 2 - local19 - local33;
		}
		@Pc(174) int local174 = (int) (Math.atan2((double) (local24 - arg1.anInt1606 * 704671089), (double) (local29 - arg1.anInt1607 * 1844815193)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local4.method18193((float) local24 + (float) local10 / 2.0F, (float) local29 + (float) local10 / 2.0F, 4096, local174);
		@Pc(194) int local194 = -2;
		@Pc(196) int local196 = -2;
		@Pc(198) int local198 = -2;
		@Pc(200) int local200 = -2;
		if (arg2.aString180 != null) {
			local194 = local66 - local31 / 2 - 5;
			local196 = local71;
			local198 = local194 + 10 + local31;
			local200 = local33 + local71 + 3;
			if (arg2.anInt4149 * -664150941 != 0) {
				arg0.method20612(local194, local71, local198 - local194, local200 - local71, arg2.anInt4149 * -664150941, (byte) 20);
			}
			if (arg2.anInt4150 * 989664399 != 0) {
				arg0.method20484(local194, local71, local198 - local194, local200 - local71, arg2.anInt4150 * 989664399, 863156789);
			}
			Class171.aClass106_9.method7563(arg2.aString180, local66, local71, local31, local33, arg2.anInt4140 * 2016508123 | 0xFF000000, Class159_Sub1.aClass637_2.anInt5899 * 2079115473, 1, 0, 0, null, null, null, 0, 0, (short) 657);
		}
		if (arg2.anInt4167 * -498063801 == -1 && arg2.aString180 == null) {
			return;
		}
		@Pc(309) Class93_Sub9 local309 = new Class93_Sub9(arg1);
		local309.anInt1488 = (local24 - local10 / 2) * 1074208877;
		local309.anInt1486 = (local10 / 2 + local24) * 1065675971;
		local309.anInt1483 = (local29 - local10) * 315868373;
		local309.anInt1485 = local29 * 1073762263;
		local309.anInt1481 = local194 * 519191853;
		local309.anInt1484 = local198 * -1010491119;
		local309.anInt1487 = local196 * 92623553;
		local309.anInt1482 = local200 * 669031469;
		Class93_Sub9.aClass22_20.method407(local309, -1314847324);
	}

	@OriginalMember(owner = "client!acc", name = "m", descriptor = "(S)V")
	public static void method14857(@OriginalArg(0) short arg0) {
		@Pc(2) Stack local2 = Class573.aStack1;
		synchronized (Class573.aStack1) {
			Class573.aStack1 = new Stack();
		}
	}

	@OriginalMember(owner = "client!acc", name = "<init>", descriptor = "()V")
	Class54() {
	}

	@OriginalMember(owner = "client!acc", name = "l", descriptor = "()I")
	public final int method14852() {
		return this.anInt1983 * 2047260205;
	}

	@OriginalMember(owner = "client!acc", name = "w", descriptor = "(I)I")
	public final int method14853(@OriginalArg(0) int arg0) {
		return this.anInt1983 * 2047260205;
	}

	@OriginalMember(owner = "client!acc", name = "u", descriptor = "()I")
	public final int method14854() {
		return this.anInt1983 * 2047260205;
	}
}
