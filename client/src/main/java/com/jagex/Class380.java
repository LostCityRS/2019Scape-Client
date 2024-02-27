package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class380 implements Interface33 {

	@OriginalMember(owner = "client!ki", name = "ou", descriptor = "I")
	public static int anInt4784;

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "Lclient!eu;")
	Class106 aClass106_12;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "Lclient!lv;")
	final Class407 aClass407_1;

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "Lclient!py;")
	final Class497 aClass497_110;

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "Lclient!py;")
	final Class497 aClass497_109;

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "(IIIII)I")
	static int method28297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11 = 65536 - Class464.anIntArray454[arg2 * 8192 / arg3] >> 1;
		return ((65536 - local11) * arg0 >> 16) + (local11 * arg1 >> 16);
	}

	@OriginalMember(owner = "client!ki", name = "s", descriptor = "(Lclient!hq;IIIZLclient!yf;I)V")
	static void method28298(@OriginalArg(0) Class320 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class681 arg5, @OriginalArg(6) int arg6) {
		if (arg2 == 0) {
			throw new RuntimeException();
		}
		@Pc(10) Class312 local10 = arg0.aClass312Array3[arg1];
		if (local10.aClass312Array2 == null) {
			local10.aClass312Array2 = new Class312[arg3 + 1];
			local10.aClass312Array1 = local10.aClass312Array2;
		}
		if (local10.aClass312Array2.length <= arg3) {
			@Pc(39) Class312[] local39;
			if (local10.aClass312Array1 == local10.aClass312Array2) {
				local39 = new Class312[arg3 + 1];
				for (@Pc(41) int local41 = 0; local41 < local10.aClass312Array2.length; local41++) {
					local39[local41] = local10.aClass312Array2[local41];
				}
				local10.aClass312Array2 = local10.aClass312Array1 = local39;
			} else {
				local39 = new Class312[arg3 + 1];
				@Pc(72) Class312[] local72 = new Class312[arg3 + 1];
				for (@Pc(74) int local74 = 0; local74 < local10.aClass312Array2.length; local74++) {
					local39[local74] = local10.aClass312Array2[local74];
					local72[local74] = local10.aClass312Array1[local74];
				}
				local10.aClass312Array2 = local39;
				local10.aClass312Array1 = local72;
			}
		}
		if (arg3 > 0 && local10.aClass312Array2[arg3 - 1] == null) {
			throw new RuntimeException("" + (arg3 - 1));
		}
		@Pc(128) Class312 local128 = new Class312();
		local128.anInt4012 = arg2 * 1608521137;
		local128.anInt4026 = (local128.anInt3994 = local10.anInt3994) * 1172877961;
		local128.anInt4011 = arg3 * -1970231653;
		local10.aClass312Array2[arg3] = local128;
		if (local10.aClass312Array1 != local10.aClass312Array2) {
			local10.aClass312Array1[arg3] = local128;
		}
		@Pc(169) Class677 local169;
		if (arg4) {
			local169 = arg5.aClass677_2;
		} else {
			local169 = arg5.aClass677_1;
		}
		local169.aClass320_4 = arg0;
		local169.aClass312_13 = local128;
		Class354.method27789(local10, -1174743804);
	}

	@OriginalMember(owner = "client!ki", name = "agq", descriptor = "(Lclient!yf;I)V")
	static void method28299(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = ((Class47) Class277.aClass32_Sub12_1.method18273(local12, 740005349)).anInt153 * 497223015;
	}

	@OriginalMember(owner = "client!ki", name = "aht", descriptor = "(Lclient!yf;I)V")
	static void method28300(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		if (client.anInt3514 * 2055688893 == 0 && (client.aBoolean623 && !client.aBoolean635 || client.aBoolean640)) {
			return;
		}
		@Pc(28) String local28 = local13.toLowerCase();
		@Pc(30) byte local30 = 0;
		if (local28.startsWith(Class74.aClass74_158.method1259(Class717.aClass717_15, (byte) 50))) {
			local30 = 0;
			local13 = local13.substring(Class74.aClass74_158.method1259(Class717.aClass717_15, (byte) -42).length());
		} else if (local28.startsWith(Class74.aClass74_142.method1259(Class717.aClass717_15, (byte) 46))) {
			local30 = 1;
			local13 = local13.substring(Class74.aClass74_142.method1259(Class717.aClass717_15, (byte) -52).length());
		} else if (local28.startsWith(Class74.aClass74_49.method1259(Class717.aClass717_15, (byte) -50))) {
			local30 = 2;
			local13 = local13.substring(Class74.aClass74_49.method1259(Class717.aClass717_15, (byte) -109).length());
		} else if (local28.startsWith(Class74.aClass74_161.method1259(Class717.aClass717_15, (byte) -25))) {
			local30 = 3;
			local13 = local13.substring(Class74.aClass74_161.method1259(Class717.aClass717_15, (byte) 13).length());
		} else if (local28.startsWith(Class74.aClass74_162.method1259(Class717.aClass717_15, (byte) 99))) {
			local30 = 4;
			local13 = local13.substring(Class74.aClass74_162.method1259(Class717.aClass717_15, (byte) -10).length());
		} else if (local28.startsWith(Class74.aClass74_163.method1259(Class717.aClass717_15, (byte) 30))) {
			local30 = 5;
			local13 = local13.substring(Class74.aClass74_163.method1259(Class717.aClass717_15, (byte) -51).length());
		} else if (local28.startsWith(Class74.aClass74_164.method1259(Class717.aClass717_15, (byte) 53))) {
			local30 = 6;
			local13 = local13.substring(Class74.aClass74_164.method1259(Class717.aClass717_15, (byte) -72).length());
		} else if (local28.startsWith(Class74.aClass74_165.method1259(Class717.aClass717_15, (byte) 30))) {
			local30 = 7;
			local13 = local13.substring(Class74.aClass74_165.method1259(Class717.aClass717_15, (byte) 8).length());
		} else if (local28.startsWith(Class74.aClass74_47.method1259(Class717.aClass717_15, (byte) -61))) {
			local30 = 8;
			local13 = local13.substring(Class74.aClass74_47.method1259(Class717.aClass717_15, (byte) 48).length());
		} else if (local28.startsWith(Class74.aClass74_86.method1259(Class717.aClass717_15, (byte) 56))) {
			local30 = 9;
			local13 = local13.substring(Class74.aClass74_86.method1259(Class717.aClass717_15, (byte) 8).length());
		} else if (local28.startsWith(Class74.aClass74_168.method1259(Class717.aClass717_15, (byte) -4))) {
			local30 = 10;
			local13 = local13.substring(Class74.aClass74_168.method1259(Class717.aClass717_15, (byte) -38).length());
		} else if (local28.startsWith(Class74.aClass74_20.method1259(Class717.aClass717_15, (byte) 24))) {
			local30 = 11;
			local13 = local13.substring(Class74.aClass74_20.method1259(Class717.aClass717_15, (byte) -16).length());
		} else if (Class717.aClass717_15 != Class106.aClass717_8) {
			if (local28.startsWith(Class74.aClass74_158.method1259(Class106.aClass717_8, (byte) 91))) {
				local30 = 0;
				local13 = local13.substring(Class74.aClass74_158.method1259(Class106.aClass717_8, (byte) 10).length());
			} else if (local28.startsWith(Class74.aClass74_142.method1259(Class106.aClass717_8, (byte) -45))) {
				local30 = 1;
				local13 = local13.substring(Class74.aClass74_142.method1259(Class106.aClass717_8, (byte) -56).length());
			} else if (local28.startsWith(Class74.aClass74_49.method1259(Class106.aClass717_8, (byte) -30))) {
				local30 = 2;
				local13 = local13.substring(Class74.aClass74_49.method1259(Class106.aClass717_8, (byte) 18).length());
			} else if (local28.startsWith(Class74.aClass74_161.method1259(Class106.aClass717_8, (byte) 4))) {
				local30 = 3;
				local13 = local13.substring(Class74.aClass74_161.method1259(Class106.aClass717_8, (byte) 9).length());
			} else if (local28.startsWith(Class74.aClass74_162.method1259(Class106.aClass717_8, (byte) 53))) {
				local30 = 4;
				local13 = local13.substring(Class74.aClass74_162.method1259(Class106.aClass717_8, (byte) -54).length());
			} else if (local28.startsWith(Class74.aClass74_163.method1259(Class106.aClass717_8, (byte) 22))) {
				local30 = 5;
				local13 = local13.substring(Class74.aClass74_163.method1259(Class106.aClass717_8, (byte) 44).length());
			} else if (local28.startsWith(Class74.aClass74_164.method1259(Class106.aClass717_8, (byte) -95))) {
				local30 = 6;
				local13 = local13.substring(Class74.aClass74_164.method1259(Class106.aClass717_8, (byte) 29).length());
			} else if (local28.startsWith(Class74.aClass74_165.method1259(Class106.aClass717_8, (byte) 55))) {
				local30 = 7;
				local13 = local13.substring(Class74.aClass74_165.method1259(Class106.aClass717_8, (byte) 29).length());
			} else if (local28.startsWith(Class74.aClass74_47.method1259(Class106.aClass717_8, (byte) 56))) {
				local30 = 8;
				local13 = local13.substring(Class74.aClass74_47.method1259(Class106.aClass717_8, (byte) 8).length());
			} else if (local28.startsWith(Class74.aClass74_86.method1259(Class106.aClass717_8, (byte) 32))) {
				local30 = 9;
				local13 = local13.substring(Class74.aClass74_86.method1259(Class106.aClass717_8, (byte) -30).length());
			} else if (local28.startsWith(Class74.aClass74_168.method1259(Class106.aClass717_8, (byte) 46))) {
				local30 = 10;
				local13 = local13.substring(Class74.aClass74_168.method1259(Class106.aClass717_8, (byte) -27).length());
			} else if (local28.startsWith(Class74.aClass74_20.method1259(Class106.aClass717_8, (byte) 121))) {
				local30 = 11;
				local13 = local13.substring(Class74.aClass74_20.method1259(Class106.aClass717_8, (byte) 60).length());
			}
		}
		local28 = local13.toLowerCase();
		@Pc(469) byte local469 = 0;
		if (local28.startsWith(Class74.aClass74_170.method1259(Class717.aClass717_15, (byte) -10))) {
			local469 = 1;
			local13 = local13.substring(Class74.aClass74_170.method1259(Class717.aClass717_15, (byte) 25).length());
		} else if (local28.startsWith(Class74.aClass74_171.method1259(Class717.aClass717_15, (byte) -98))) {
			local469 = 2;
			local13 = local13.substring(Class74.aClass74_171.method1259(Class717.aClass717_15, (byte) 102).length());
		} else if (local28.startsWith(Class74.aClass74_172.method1259(Class717.aClass717_15, (byte) 99))) {
			local469 = 3;
			local13 = local13.substring(Class74.aClass74_172.method1259(Class717.aClass717_15, (byte) 34).length());
		} else if (local28.startsWith(Class74.aClass74_70.method1259(Class717.aClass717_15, (byte) -115))) {
			local469 = 4;
			local13 = local13.substring(Class74.aClass74_70.method1259(Class717.aClass717_15, (byte) -5).length());
		} else if (local28.startsWith(Class74.aClass74_174.method1259(Class717.aClass717_15, (byte) -107))) {
			local469 = 5;
			local13 = local13.substring(Class74.aClass74_174.method1259(Class717.aClass717_15, (byte) 92).length());
		} else if (Class106.aClass717_8 != Class717.aClass717_15) {
			if (local28.startsWith(Class74.aClass74_170.method1259(Class106.aClass717_8, (byte) -2))) {
				local469 = 1;
				local13 = local13.substring(Class74.aClass74_170.method1259(Class106.aClass717_8, (byte) 56).length());
			} else if (local28.startsWith(Class74.aClass74_171.method1259(Class106.aClass717_8, (byte) -48))) {
				local469 = 2;
				local13 = local13.substring(Class74.aClass74_171.method1259(Class106.aClass717_8, (byte) 85).length());
			} else if (local28.startsWith(Class74.aClass74_172.method1259(Class106.aClass717_8, (byte) 12))) {
				local469 = 3;
				local13 = local13.substring(Class74.aClass74_172.method1259(Class106.aClass717_8, (byte) 41).length());
			} else if (local28.startsWith(Class74.aClass74_70.method1259(Class106.aClass717_8, (byte) -77))) {
				local469 = 4;
				local13 = local13.substring(Class74.aClass74_70.method1259(Class106.aClass717_8, (byte) 12).length());
			} else if (local28.startsWith(Class74.aClass74_174.method1259(Class106.aClass717_8, (byte) -42))) {
				local469 = 5;
				local13 = local13.substring(Class74.aClass74_174.method1259(Class106.aClass717_8, (byte) 107).length());
			}
		}
		@Pc(654) Class175 local654 = Class330.method27465(-1833824436);
		@Pc(660) Class93_Sub22 local660 = Class102.method2592(Class446.aClass446_97, local654.aClass24_2, (byte) 85);
		local660.aClass93_Sub41_Sub2_1.method22522(0, (byte) -7);
		@Pc(671) int local671 = local660.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
		local660.aClass93_Sub41_Sub2_1.method22522(local30, (byte) -60);
		local660.aClass93_Sub41_Sub2_1.method22522(local469, (byte) -106);
		Class284.method26577(local660.aClass93_Sub41_Sub2_1, local13, -1497248091);
		local660.aClass93_Sub41_Sub2_1.method22549(local660.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local671, (byte) 77);
		local654.method24363(local660, -1650727993);
	}

	@OriginalMember(owner = "client!ki", name = "ah", descriptor = "(B)V")
	public static void method28301(@OriginalArg(0) byte arg0) {
		for (@Pc(4) Class93_Sub1_Sub8 local4 = (Class93_Sub1_Sub8) Class454.aClass18_16.method246(1058596476); local4 != null; local4 = (Class93_Sub1_Sub8) Class454.aClass18_16.method253(2034479483)) {
			if (local4.anInt3013 * -2109043087 > 1) {
				local4.anInt3013 = 0;
				Class454.aClass240_85.method25923(local4, ((Class93_Sub1_Sub7) local4.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68).aLong155 * 7070093341456026777L);
				local4.aClass18_10.method245(-407174100);
			}
		}
		Class454.anInt5200 = 0;
		Class454.anInt5203 = 0;
		Class454.aClass22_55.method406(-2037259486);
		Class454.aClass16_34.method219((byte) 91);
		Class454.aClass18_16.method245(-1784026983);
		Class454.aBoolean782 = false;
	}

	@OriginalMember(owner = "client!ki", name = "app", descriptor = "(Lclient!yf;B)V")
	static void method28302(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class111.method6796(-1306274954);
	}

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!py;Lclient!py;Lclient!lv;)V")
	Class380(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class407 arg2) {
		this.aClass407_1 = arg2;
		this.aClass497_110 = arg0;
		this.aClass497_109 = arg1;
	}

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "(I)Z")
	@Override
	public boolean method28460(@OriginalArg(0) int arg0) {
		@Pc(1) boolean local1 = true;
		if (!this.aClass497_110.method30235(this.aClass407_1.anInt4857 * 1186513455, -512225963)) {
			local1 = false;
		}
		if (!this.aClass497_109.method30235(this.aClass407_1.anInt4857 * 1186513455, -512225963)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ki", name = "u", descriptor = "()Z")
	@Override
	public boolean method28459() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass497_110.method30235(this.aClass407_1.anInt4857 * 1186513455, -512225963)) {
			local1 = false;
		}
		if (!this.aClass497_109.method30235(this.aClass407_1.anInt4857 * 1186513455, -512225963)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "(ZI)V")
	@Override
	public void method28466(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg0) {
			@Pc(21) int local21 = this.aClass407_1.aClass390_14.method28454(this.aClass407_1.anInt4855 * -1489497161, client.anInt3511 * 2040043391, 1166433294) + this.aClass407_1.anInt4851 * -1430649519;
			@Pc(41) int local41 = this.aClass407_1.aClass392_14.method28471(this.aClass407_1.anInt4853 * -1599928051, client.anInt3512 * -817449061, (short) 255) + this.aClass407_1.anInt4852 * 1380832809;
			this.aClass106_12.method7563(this.aClass407_1.aString207, local21, local41, this.aClass407_1.anInt4855 * -1489497161, this.aClass407_1.anInt4853 * -1599928051, this.aClass407_1.anInt4858 * 603161807, this.aClass407_1.anInt4859 * -1071278391, this.aClass407_1.anInt4856 * -1283910243, this.aClass407_1.anInt4854 * -142218921, this.aClass407_1.anInt4850 * -689304573, null, null, null, 0, 0, (short) 657);
		}
	}

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)V")
	@Override
	public void method28461(@OriginalArg(0) int arg0) {
		@Pc(10) Class5 local10 = Class691.method36775(this.aClass497_109, this.aClass407_1.anInt4857 * 1186513455, Class157.aClass462_2, -238173970);
		this.aClass106_12 = Class694.aClass104_14.method20518(local10, Class203.method24662(this.aClass497_110, this.aClass407_1.anInt4857 * 1186513455), true);
	}

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "(Z)V")
	@Override
	public void method28463(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			@Pc(21) int local21 = this.aClass407_1.aClass390_14.method28454(this.aClass407_1.anInt4855 * -1489497161, client.anInt3511 * 2040043391, 754302417) + this.aClass407_1.anInt4851 * -1430649519;
			@Pc(41) int local41 = this.aClass407_1.aClass392_14.method28471(this.aClass407_1.anInt4853 * -1599928051, client.anInt3512 * -817449061, (short) 255) + this.aClass407_1.anInt4852 * 1380832809;
			this.aClass106_12.method7563(this.aClass407_1.aString207, local21, local41, this.aClass407_1.anInt4855 * -1489497161, this.aClass407_1.anInt4853 * -1599928051, this.aClass407_1.anInt4858 * 603161807, this.aClass407_1.anInt4859 * -1071278391, this.aClass407_1.anInt4856 * -1283910243, this.aClass407_1.anInt4854 * -142218921, this.aClass407_1.anInt4850 * -689304573, null, null, null, 0, 0, (short) 657);
		}
	}

	@OriginalMember(owner = "client!ki", name = "w", descriptor = "()V")
	@Override
	public void method28464() {
		@Pc(10) Class5 local10 = Class691.method36775(this.aClass497_109, this.aClass407_1.anInt4857 * 1186513455, Class157.aClass462_2, 964448075);
		this.aClass106_12 = Class694.aClass104_14.method20518(local10, Class203.method24662(this.aClass497_110, this.aClass407_1.anInt4857 * 1186513455), true);
	}

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "()V")
	@Override
	public void method28465() {
		@Pc(10) Class5 local10 = Class691.method36775(this.aClass497_109, this.aClass407_1.anInt4857 * 1186513455, Class157.aClass462_2, -439602759);
		this.aClass106_12 = Class694.aClass104_14.method20518(local10, Class203.method24662(this.aClass497_110, this.aClass407_1.anInt4857 * 1186513455), true);
	}

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "(Z)V")
	@Override
	public void method28462(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			@Pc(21) int local21 = this.aClass407_1.aClass390_14.method28454(this.aClass407_1.anInt4855 * -1489497161, client.anInt3511 * 2040043391, 1860493955) + this.aClass407_1.anInt4851 * -1430649519;
			@Pc(41) int local41 = this.aClass407_1.aClass392_14.method28471(this.aClass407_1.anInt4853 * -1599928051, client.anInt3512 * -817449061, (short) 255) + this.aClass407_1.anInt4852 * 1380832809;
			this.aClass106_12.method7563(this.aClass407_1.aString207, local21, local41, this.aClass407_1.anInt4855 * -1489497161, this.aClass407_1.anInt4853 * -1599928051, this.aClass407_1.anInt4858 * 603161807, this.aClass407_1.anInt4859 * -1071278391, this.aClass407_1.anInt4856 * -1283910243, this.aClass407_1.anInt4854 * -142218921, this.aClass407_1.anInt4850 * -689304573, null, null, null, 0, 0, (short) 657);
		}
	}
}
