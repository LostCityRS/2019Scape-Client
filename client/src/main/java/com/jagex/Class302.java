package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Iterator;

@OriginalClass("client!gw")
public final class Class302 {

	@OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
	static final int anInt3967 = 2;

	@OriginalMember(owner = "client!gw", name = "t", descriptor = "I")
	static final int anInt3968 = 1;

	@OriginalMember(owner = "client!gw", name = "be", descriptor = "I")
	public static int anInt3972;

	@OriginalMember(owner = "client!gw", name = "k", descriptor = "Lclient!abg;")
	Class33 aClass33_2;

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "J")
	final long aLong363;

	@OriginalMember(owner = "client!gw", name = "i", descriptor = "Ljava/lang/String;")
	String aString168;

	@OriginalMember(owner = "client!gw", name = "g", descriptor = "Z")
	boolean aBoolean783;

	@OriginalMember(owner = "client!gw", name = "o", descriptor = "Z")
	boolean aBoolean784;

	@OriginalMember(owner = "client!gw", name = "u", descriptor = "[Lclient!xi;")
	final Class661[] aClass661Array2;

	@OriginalMember(owner = "client!gw", name = "l", descriptor = "Lclient!abg;")
	final Class33 aClass33_1;

	@OriginalMember(owner = "client!gw", name = "m", descriptor = "I")
	int anInt3969;

	@OriginalMember(owner = "client!gw", name = "j", descriptor = "I")
	int anInt3970;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "Lclient!gy;")
	Class304 aClass304_1;

	@OriginalMember(owner = "client!gw", name = "s", descriptor = "I")
	int anInt3971;

	@OriginalMember(owner = "client!gw", name = "u", descriptor = "(CI)Z")
	public static boolean method27105(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return arg0 >= '!' && arg0 < '0' || arg0 >= ':' && arg0 <= '@' && arg0 != '<' || arg0 >= '[' && arg0 <= '_' || arg0 >= '{';
	}

	@OriginalMember(owner = "client!gw", name = "abs", descriptor = "(Lclient!yp;B)V")
	static void method27106(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		if (local13 <= 700 && local23 <= 700) {
			@Pc(59) double local59 = (Math.random() * (double) (local23 + local13) - (double) local13 + 800.0D) / 100.0D;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) (Math.pow(2.0D, local59) + 0.5D);
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 256;
		}
	}

	@OriginalMember(owner = "client!gw", name = "ku", descriptor = "(Lclient!ahb;[IIZI)V")
	public static void method27107(@OriginalArg(0) Class120_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(4) boolean local4;
		@Pc(6) int local6;
		if (arg0.anIntArray240 != null) {
			local4 = true;
			for (local6 = 0; local6 < arg0.anIntArray240.length; local6++) {
				if (arg0.anIntArray240[local6] != arg1[local6]) {
					local4 = false;
					break;
				}
			}
			@Pc(27) Class6 local27 = arg0.aClass6_3;
			if (local4 && local27.method23590(-499060808)) {
				@Pc(38) Class261 local38 = arg0.aClass6_3.method23581((byte) 67);
				@Pc(43) int local43 = local38.anInt3897 * 746333843;
				if (local43 == 1) {
					local27.method23599(arg2, (short) 2892);
				}
				if (local43 == 2) {
					local27.method23597(-1791240997);
				}
			}
		}
		local4 = true;
		for (local6 = 0; local6 < arg1.length; local6++) {
			if (arg1[local6] != -1) {
				local4 = false;
			}
			if (arg0.anIntArray240 == null || arg0.anIntArray240[local6] == -1 || ((Class261) Class125.aClass41_Sub1_6.method18054(arg1[local6], -1723714305)).anInt3888 * 1680050639 >= ((Class261) Class125.aClass41_Sub1_6.method18054(arg0.anIntArray240[local6], 1695966570)).anInt3888 * 1680050639) {
				arg0.anIntArray240 = arg1;
				arg0.aClass6_3.method23621(arg2, (byte) -31);
				if (arg3) {
					arg0.anInt2702 = arg0.anInt2700 * 1953218201;
				}
			}
		}
		if (!local4) {
			return;
		}
		arg0.anIntArray240 = arg1;
		arg0.aClass6_3.method23621(arg2, (byte) -42);
		if (arg3) {
			arg0.anInt2702 = arg0.anInt2700 * 1953218201;
		}
	}

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lclient!ald;ZZLclient!gh;)V")
	Class302(@OriginalArg(0) Packet arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Interface27 arg3) {
		if (arg1) {
			this.aLong363 = arg0.g8() * 6306052351605621831L;
		} else {
			this.aLong363 = -6306052351605621831L;
		}
		if (arg2) {
			this.aString168 = arg0.fastgstr();
		}
		@Pc(25) int local25 = arg0.g1();
		this.aBoolean783 = (local25 & 0x1) != 0;
		this.aBoolean784 = (local25 & 0x2) != 0;
		this.aClass661Array2 = new Class661[arg3.method14(1020163795).method32799(-631871973)];
		@Pc(57) int local57 = arg0.g1();
		if (local57 > this.aClass661Array2.length) {
			throw new IllegalStateException("");
		}
		@Pc(69) int local69;
		for (local69 = 0; local69 < this.aClass661Array2.length; local69++) {
			@Pc(90) Class661 local90 = this.aClass661Array2[local69] = new Class661(arg3.method14(1020163795).method32789(local69, 928794000), true);
			if (local69 < local57) {
				local90.method33313(arg0.g4(), -2111843084);
			} else {
				local90.method33313(0, -2099863900);
			}
			local90.method33299(local90.method33296(735825645), 796698358);
		}
		local69 = arg0.g2();
		this.aClass33_1 = new Class33(arg3.method11((short) 223));
		for (@Pc(126) int local126 = 0; local126 < local69; local126++) {
			@Pc(136) Class460 local136 = arg3.method11((short) 223).method1820(arg0, -225408383);
			this.aClass33_1.method719(local136.anInt4907 * -38979583, local136.anObject19, -1989288817);
		}
		this.anInt3969 = arg0.g2() * 223310837;
		if (this.anInt3969 * 44785757 == 65535) {
			this.anInt3969 = -223310837;
		}
		this.anInt3970 = arg0.g1() * 560066379;
		this.aClass304_1 = (Class304) Class80_Sub39.method15030(Class304.method27121((byte) 1), arg0.g1(), -1769619177);
		this.anInt3971 = arg0.g1() * -1347223755;
	}

	@OriginalMember(owner = "client!gw", name = "ab", descriptor = "()Z")
	public boolean method27044() {
		return this.aBoolean784;
	}

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "(II)V")
	void method27045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3970 = arg0 * 560066379;
	}

	@OriginalMember(owner = "client!gw", name = "u", descriptor = "(B)I")
	public int method27046(@OriginalArg(0) byte arg0) {
		return this.anInt3969 * 44785757;
	}

	@OriginalMember(owner = "client!gw", name = "f", descriptor = "(I)I")
	public int method27047(@OriginalArg(0) int arg0) {
		return this.anInt3970 * -1036410269;
	}

	@OriginalMember(owner = "client!gw", name = "am", descriptor = "()Lclient!gy;")
	public Class304 method27048() {
		return this.aClass304_1;
	}

	@OriginalMember(owner = "client!gw", name = "l", descriptor = "(II)V")
	void method27049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3969 = arg0 * 223310837;
	}

	@OriginalMember(owner = "client!gw", name = "z", descriptor = "()Ljava/lang/String;")
	public String method27050() {
		return this.aString168;
	}

	@OriginalMember(owner = "client!gw", name = "i", descriptor = "(ZB)V")
	void method27051(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		this.aBoolean784 = arg0;
	}

	@OriginalMember(owner = "client!gw", name = "aa", descriptor = "(Lclient!gy;)V")
	void method27052(@OriginalArg(0) Class304 arg0) {
		this.aClass304_1 = arg0;
	}

	@OriginalMember(owner = "client!gw", name = "o", descriptor = "(Lclient!gy;B)V")
	void method27053(@OriginalArg(0) Class304 arg0, @OriginalArg(1) byte arg1) {
		this.aClass304_1 = arg0;
	}

	@OriginalMember(owner = "client!gw", name = "j", descriptor = "(I)I")
	public int method27054(@OriginalArg(0) int arg0) {
		return this.anInt3971 * 1508154141;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)V")
	void method27055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3971 = arg0 * -1347223755;
	}

	@OriginalMember(owner = "client!gw", name = "bj", descriptor = "()Lclient!abg;")
	public Class33 method27056() {
		return this.aClass33_2;
	}

	@OriginalMember(owner = "client!gw", name = "k", descriptor = "(I)Z")
	public boolean method27057(@OriginalArg(0) int arg0) {
		return this.aBoolean783;
	}

	@OriginalMember(owner = "client!gw", name = "h", descriptor = "()Ljava/lang/String;")
	public String method27058() {
		return this.aString168;
	}

	@OriginalMember(owner = "client!gw", name = "w", descriptor = "(Lclient!gw;I)V")
	void method27059(@OriginalArg(0) Class302 arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass661Array2.length; local1++) {
			this.aClass661Array2[local1].method33313(arg0.aClass661Array2[local1].method33293(975595850), -2110582268);
			this.aClass661Array2[local1].method33299(this.aClass661Array2[local1].method33296(735825645), -1103988868);
		}
		this.aClass33_1.method720((byte) 31);
		@Pc(40) Iterator local40 = arg0.aClass33_1.iterator();
		while (local40.hasNext()) {
			@Pc(47) Class460 local47 = (Class460) local40.next();
			this.aClass33_1.method719(local47.anInt4907 * -38979583, local47.anObject19, -1962011325);
		}
		this.aBoolean783 = arg0.aBoolean783;
	}

	@OriginalMember(owner = "client!gw", name = "r", descriptor = "(Lclient!gh;B)V")
	public void method27060(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass33_2 == null) {
			this.aClass33_2 = new Class33(arg0.method11((short) 223));
		} else {
			this.aClass33_2.method720((byte) -3);
		}
	}

	@OriginalMember(owner = "client!gw", name = "m", descriptor = "(B)Lclient!gy;")
	public Class304 method27061(@OriginalArg(0) byte arg0) {
		return this.aClass304_1;
	}

	@OriginalMember(owner = "client!gw", name = "ax", descriptor = "(I)V")
	void method27062(@OriginalArg(0) int arg0) {
		this.anInt3970 = arg0 * 560066379;
	}

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "()Ljava/lang/String;")
	public String method27063() {
		return this.aString168;
	}

	@OriginalMember(owner = "client!gw", name = "p", descriptor = "()Ljava/lang/String;")
	public String method27064() {
		return this.aString168;
	}

	@OriginalMember(owner = "client!gw", name = "v", descriptor = "()Ljava/lang/String;")
	public String method27065() {
		return this.aString168;
	}

	@OriginalMember(owner = "client!gw", name = "g", descriptor = "(I)Z")
	public boolean method27066(@OriginalArg(0) int arg0) {
		return this.aBoolean784;
	}

	@OriginalMember(owner = "client!gw", name = "n", descriptor = "()I")
	public int method27067() {
		return this.anInt3970 * -1036410269;
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "()I")
	public int method27068() {
		return this.anInt3970 * -1036410269;
	}

	@OriginalMember(owner = "client!gw", name = "ai", descriptor = "(I)V")
	void method27069(@OriginalArg(0) int arg0) {
		this.anInt3970 = arg0 * 560066379;
	}

	@OriginalMember(owner = "client!gw", name = "bs", descriptor = "()Lclient!abg;")
	public Class33 method27070() {
		return this.aClass33_2;
	}

	@OriginalMember(owner = "client!gw", name = "ay", descriptor = "(I)V")
	void method27071(@OriginalArg(0) int arg0) {
		this.anInt3970 = arg0 * 560066379;
	}

	@OriginalMember(owner = "client!gw", name = "bl", descriptor = "(I)Lclient!xi;")
	public Class661 method27072(@OriginalArg(0) int arg0) {
		return this.aClass661Array2[arg0];
	}

	@OriginalMember(owner = "client!gw", name = "aq", descriptor = "(I)V")
	void method27073(@OriginalArg(0) int arg0) {
		this.anInt3970 = arg0 * 560066379;
	}

	@OriginalMember(owner = "client!gw", name = "ao", descriptor = "()I")
	public int method27074() {
		return this.anInt3969 * 44785757;
	}

	@OriginalMember(owner = "client!gw", name = "t", descriptor = "(I)Ljava/lang/String;")
	public String method27075(@OriginalArg(0) int arg0) {
		return this.aString168;
	}

	@OriginalMember(owner = "client!gw", name = "ac", descriptor = "(I)V")
	void method27076(@OriginalArg(0) int arg0) {
		this.anInt3969 = arg0 * 223310837;
	}

	@OriginalMember(owner = "client!gw", name = "ag", descriptor = "(I)V")
	void method27077(@OriginalArg(0) int arg0) {
		this.anInt3969 = arg0 * 223310837;
	}

	@OriginalMember(owner = "client!gw", name = "y", descriptor = "()Ljava/lang/String;")
	public String method27078() {
		return this.aString168;
	}

	@OriginalMember(owner = "client!gw", name = "al", descriptor = "()Z")
	public boolean method27079() {
		return this.aBoolean784;
	}

	@OriginalMember(owner = "client!gw", name = "ah", descriptor = "(Z)V")
	void method27080(@OriginalArg(0) boolean arg0) {
		this.aBoolean784 = arg0;
	}

	@OriginalMember(owner = "client!gw", name = "af", descriptor = "()Lclient!gy;")
	public Class304 method27081() {
		return this.aClass304_1;
	}

	@OriginalMember(owner = "client!gw", name = "au", descriptor = "()J")
	long method27082() {
		return this.aLong363 * -9063387919729416841L;
	}

	@OriginalMember(owner = "client!gw", name = "ak", descriptor = "(Lclient!gy;)V")
	void method27083(@OriginalArg(0) Class304 arg0) {
		this.aClass304_1 = arg0;
	}

	@OriginalMember(owner = "client!gw", name = "at", descriptor = "(Lclient!gy;)V")
	void method27084(@OriginalArg(0) Class304 arg0) {
		this.aClass304_1 = arg0;
	}

	@OriginalMember(owner = "client!gw", name = "ad", descriptor = "(Lclient!gy;)V")
	void method27085(@OriginalArg(0) Class304 arg0) {
		this.aClass304_1 = arg0;
	}

	@OriginalMember(owner = "client!gw", name = "av", descriptor = "(Lclient!gy;)V")
	void method27086(@OriginalArg(0) Class304 arg0) {
		this.aClass304_1 = arg0;
	}

	@OriginalMember(owner = "client!gw", name = "x", descriptor = "(IB)Lclient!xi;")
	public Class661 method27087(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.aClass661Array2[arg0];
	}

	@OriginalMember(owner = "client!gw", name = "aj", descriptor = "()I")
	public int method27088() {
		return this.anInt3969 * 44785757;
	}

	@OriginalMember(owner = "client!gw", name = "ae", descriptor = "()I")
	public int method27089() {
		return this.anInt3971 * 1508154141;
	}

	@OriginalMember(owner = "client!gw", name = "ap", descriptor = "()I")
	public int method27090() {
		return this.anInt3971 * 1508154141;
	}

	@OriginalMember(owner = "client!gw", name = "ar", descriptor = "(I)V")
	void method27091(@OriginalArg(0) int arg0) {
		this.anInt3971 = arg0 * -1347223755;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "()I")
	public int method27092() {
		return this.anInt3970 * -1036410269;
	}

	@OriginalMember(owner = "client!gw", name = "az", descriptor = "()J")
	long method27093() {
		return this.aLong363 * -9063387919729416841L;
	}

	@OriginalMember(owner = "client!gw", name = "as", descriptor = "()J")
	long method27094() {
		return this.aLong363 * -9063387919729416841L;
	}

	@OriginalMember(owner = "client!gw", name = "aw", descriptor = "()Z")
	public boolean method27095() {
		return this.aBoolean783;
	}

	@OriginalMember(owner = "client!gw", name = "bg", descriptor = "(I)Lclient!xi;")
	public Class661 method27096(@OriginalArg(0) int arg0) {
		return this.aClass661Array2[arg0];
	}

	@OriginalMember(owner = "client!gw", name = "an", descriptor = "(Lclient!gy;)V")
	void method27097(@OriginalArg(0) Class304 arg0) {
		this.aClass304_1 = arg0;
	}

	@OriginalMember(owner = "client!gw", name = "br", descriptor = "(Lclient!gw;)V")
	void method27098(@OriginalArg(0) Class302 arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass661Array2.length; local1++) {
			this.aClass661Array2[local1].method33313(arg0.aClass661Array2[local1].method33293(-145826707), -2116761593);
			this.aClass661Array2[local1].method33299(this.aClass661Array2[local1].method33296(735825645), -783818740);
		}
		this.aClass33_1.method720((byte) 79);
		@Pc(40) Iterator local40 = arg0.aClass33_1.iterator();
		while (local40.hasNext()) {
			@Pc(47) Class460 local47 = (Class460) local40.next();
			this.aClass33_1.method719(local47.anInt4907 * -38979583, local47.anObject19, -2049668800);
		}
		this.aBoolean783 = arg0.aBoolean783;
	}

	@OriginalMember(owner = "client!gw", name = "bn", descriptor = "(Lclient!gw;)V")
	void method27099(@OriginalArg(0) Class302 arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass661Array2.length; local1++) {
			this.aClass661Array2[local1].method33313(arg0.aClass661Array2[local1].method33293(-1840475988), -2024524786);
			this.aClass661Array2[local1].method33299(this.aClass661Array2[local1].method33296(735825645), 1508590618);
		}
		this.aClass33_1.method720((byte) -62);
		@Pc(40) Iterator local40 = arg0.aClass33_1.iterator();
		while (local40.hasNext()) {
			@Pc(47) Class460 local47 = (Class460) local40.next();
			this.aClass33_1.method719(local47.anInt4907 * -38979583, local47.anObject19, -1704807854);
		}
		this.aBoolean783 = arg0.aBoolean783;
	}

	@OriginalMember(owner = "client!gw", name = "ba", descriptor = "(Lclient!gw;)V")
	void method27100(@OriginalArg(0) Class302 arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass661Array2.length; local1++) {
			this.aClass661Array2[local1].method33313(arg0.aClass661Array2[local1].method33293(-1694098905), -2125985775);
			this.aClass661Array2[local1].method33299(this.aClass661Array2[local1].method33296(735825645), 9217211);
		}
		this.aClass33_1.method720((byte) -10);
		@Pc(40) Iterator local40 = arg0.aClass33_1.iterator();
		while (local40.hasNext()) {
			@Pc(47) Class460 local47 = (Class460) local40.next();
			this.aClass33_1.method719(local47.anInt4907 * -38979583, local47.anObject19, -1859695773);
		}
		this.aBoolean783 = arg0.aBoolean783;
	}

	@OriginalMember(owner = "client!gw", name = "bt", descriptor = "(Lclient!gh;)V")
	public void method27101(@OriginalArg(0) Interface27 arg0) {
		if (this.aClass33_2 == null) {
			this.aClass33_2 = new Class33(arg0.method11((short) 223));
		} else {
			this.aClass33_2.method720((byte) -20);
		}
	}

	@OriginalMember(owner = "client!gw", name = "q", descriptor = "(I)Lclient!abg;")
	public Class33 method27102(@OriginalArg(0) int arg0) {
		return this.aClass33_2;
	}

	@OriginalMember(owner = "client!gw", name = "s", descriptor = "(B)J")
	long method27103(@OriginalArg(0) byte arg0) {
		return this.aLong363 * -9063387919729416841L;
	}

	@OriginalMember(owner = "client!gw", name = "by", descriptor = "()Lclient!abg;")
	public Class33 method27104() {
		return this.aClass33_2;
	}
}
