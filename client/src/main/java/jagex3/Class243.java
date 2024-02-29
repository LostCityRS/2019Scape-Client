package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class243 {

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
	int anInt3875;

	@OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
	int anInt3876;

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
	int anInt3877;

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
	int anInt3878;

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
	final int anInt3874;

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "Lclient!vj;")
	final Class615 aClass615_1;

	@OriginalMember(owner = "client!ef", name = "ao", descriptor = "(Lclient!yf;B)V")
	static void method25981(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(9) int local9 = arg0.anIntArray522[arg0.anInt6050 * -709694321] >> 16;
		@Pc(19) int local19 = arg0.anIntArray522[arg0.anInt6050 * -709694321] & 0xFFFF;
		@Pc(32) int local32 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		if (local32 < 0 || local32 > 5000) {
			throw new RuntimeException();
		}
		arg0.anIntArray520[local9] = local32;
		@Pc(48) byte local48 = -1;
		if (local19 == ScriptVarType.INT.getId()) {
			local48 = 0;
		}
		for (@Pc(56) int local56 = 0; local56 < local32; local56++) {
			arg0.anIntArrayArray67[local9][local56] = local48;
		}
	}

	@OriginalMember(owner = "client!ef", name = "uf", descriptor = "(Lclient!yf;I)V")
	static void method25982(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 384444626);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local16.anInt4031 * -1543587533;
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(Lclient!alc;Lclient!alc;IZB)I")
	static int method25983(@OriginalArg(0) Class154_Sub1 arg0, @OriginalArg(1) Class154_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte arg4) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		if (arg2 == 1) {
			local7 = arg0.anInt1652 * 1625257571;
			local12 = arg1.anInt1652 * 1625257571;
			if (!arg3) {
				if (local7 == -1) {
					local7 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local7 - local12;
		} else if (arg2 == 2) {
			return Class488.method30002(arg0.method14154((byte) -36), arg1.method14154((byte) -121), Class106.aClass717_8, -264791838);
		} else if (arg2 == 3) {
			if (arg0.aString47.equals("-")) {
				if (arg1.aString47.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString47.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Class488.method30002(arg0.aString47, arg1.aString47, Class106.aClass717_8, 437101550);
			}
		} else if (arg2 == 4) {
			return arg0.method14136((byte) 1) ? (arg1.method14136((byte) 1) ? 0 : 1) : (arg1.method14136((byte) 1) ? -1 : 0);
		} else if (arg2 == 5) {
			return arg0.method14139((short) 15375) ? (arg1.method14139((short) 3195) ? 0 : 1) : (arg1.method14139((short) 24789) ? -1 : 0);
		} else if (arg2 == 6) {
			return arg0.method14135(-1781579636) ? (arg1.method14135(-1001063696) ? 0 : 1) : (arg1.method14135(-756413084) ? -1 : 0);
		} else if (arg2 == 7) {
			return arg0.method14133(1960988737) ? (arg1.method14133(1937153473) ? 0 : 1) : (arg1.method14133(1894344278) ? -1 : 0);
		} else if (arg2 == 8) {
			local7 = arg0.anInt1655 * 1280583823;
			local12 = arg1.anInt1655 * 1280583823;
			if (arg3) {
				if (local7 == 1000) {
					local7 = -1;
				}
				if (local12 == 1000) {
					local12 = -1;
				}
			} else {
				if (local7 == -1) {
					local7 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local7 - local12;
		} else {
			return arg0.anInt1654 * 2079113925 - arg1.anInt1654 * 2079113925;
		}
	}

	@OriginalMember(owner = "client!ef", name = "ei", descriptor = "(Lclient!yf;B)V")
	static void method25984(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class258.method26234(local11, local14, arg0, 761498432);
	}

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!alw;)V")
	Class243(@OriginalArg(0) Class93_Sub41 arg0) {
		this.anInt3874 = arg0.method22448(-1231296433) * 421769509;
		this.aClass615_1 = (Class615) Class107.method18131(Class1.method10(1523069168), arg0.method22425((short) 16384), -1915563430);
	}

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "(IIIIB)V")
	void method25974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		Class359.method27971(arg0, arg1, arg2, this.aClass615_1.anInt5790 * 2081439295, this.anInt3874 * -1294794067, this.aClass615_1.anInt5789 * 948246811, arg3, null, (byte) 78);
		this.anInt3878 = arg0 * 920398435;
		this.anInt3875 = arg1 * -1231998259;
		this.anInt3877 = arg2 * -1848035729;
		this.anInt3876 = arg3 * -1520557853;
	}

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "(B)V")
	void method25975(@OriginalArg(0) byte arg0) {
		Class359.method27971(this.anInt3878 * 1569957707, this.anInt3875 * -1679422971, this.anInt3877 * 1376446607, this.aClass615_1.anInt5790 * 2081439295, -1, this.aClass615_1.anInt5789 * 948246811, this.anInt3876 * -1340857141, null, (byte) 73);
	}

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "(I)Z")
	boolean method25976(@OriginalArg(0) int arg0) {
		if (this.anInt3874 * -1294794067 < 0) {
			return true;
		}
		@Pc(13) Class610 local13 = (Class610) Class273.aClass32_Sub14_8.method18273(this.anInt3874 * -1294794067, 960491903);
		@Pc(22) boolean local22 = local13.method32159(this.aClass615_1.anInt5789 * 948246811, (byte) -60);
		@Pc(26) int[] local26 = local13.method32170(-344985243);
		if (local26 != null) {
			@Pc(30) int[] local30 = local26;
			for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
				@Pc(40) int local40 = local30[local32];
				local22 &= ((Class263) Class32.aClass32_Sub17_23.method18273(local40, 922425536)).method26287((byte) -104);
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "()V")
	void method25977() {
		Class359.method27971(this.anInt3878 * 1569957707, this.anInt3875 * -1679422971, this.anInt3877 * 1376446607, this.aClass615_1.anInt5790 * 2081439295, -1, this.aClass615_1.anInt5789 * 948246811, this.anInt3876 * -1340857141, null, (byte) 97);
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "()V")
	void method25978() {
		Class359.method27971(this.anInt3878 * 1569957707, this.anInt3875 * -1679422971, this.anInt3877 * 1376446607, this.aClass615_1.anInt5790 * 2081439295, -1, this.aClass615_1.anInt5789 * 948246811, this.anInt3876 * -1340857141, null, (byte) 61);
	}

	@OriginalMember(owner = "client!ef", name = "w", descriptor = "()V")
	void method25979() {
		Class359.method27971(this.anInt3878 * 1569957707, this.anInt3875 * -1679422971, this.anInt3877 * 1376446607, this.aClass615_1.anInt5790 * 2081439295, -1, this.aClass615_1.anInt5789 * 948246811, this.anInt3876 * -1340857141, null, (byte) 91);
	}

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "()Z")
	boolean method25980() {
		if (this.anInt3874 * -1294794067 < 0) {
			return true;
		}
		@Pc(13) Class610 local13 = (Class610) Class273.aClass32_Sub14_8.method18273(this.anInt3874 * -1294794067, -1308447379);
		@Pc(22) boolean local22 = local13.method32159(this.aClass615_1.anInt5789 * 948246811, (byte) -75);
		@Pc(26) int[] local26 = local13.method32170(432725978);
		if (local26 != null) {
			@Pc(30) int[] local30 = local26;
			for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
				@Pc(40) int local40 = local30[local32];
				local22 &= ((Class263) Class32.aClass32_Sub17_23.method18273(local40, -106184449)).method26287((byte) -3);
			}
		}
		return local22;
	}
}
