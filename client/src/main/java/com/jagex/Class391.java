package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public class Class391 implements Interface33 {

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "Lclient!kn;")
	final Class383 aClass383_1;

	@OriginalMember(owner = "client!kw", name = "n", descriptor = "Lclient!kf;")
	final Class377 aClass377_2;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lclient!kf;Lclient!kn;)V", line = 13)
	Class391(@OriginalArg(0) Class377 arg0, @OriginalArg(1) Class383 arg1) {
		this.aClass383_1 = arg1;
		this.aClass377_2 = arg0;
	}

	@OriginalMember(owner = "client!kw", name = "m", descriptor = "(I)Z", line = 19)
	@Override
	public boolean method28279(@OriginalArg(0) int arg0) {
		return this.aClass377_2.method28053((byte) 0);
	}

	@OriginalMember(owner = "client!kw", name = "u", descriptor = "()Z", line = 19)
	@Override
	public boolean method28278() {
		return this.aClass377_2.method28053((byte) 0);
	}

	@OriginalMember(owner = "client!kw", name = "l", descriptor = "()V", line = 22)
	@Override
	public void method28284() {
	}

	@OriginalMember(owner = "client!kw", name = "w", descriptor = "()V", line = 22)
	@Override
	public void method28283() {
	}

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "(I)V", line = 22)
	@Override
	public void method28280(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!kw", name = "n", descriptor = "(ZI)V", line = 25)
	@Override
	public void method28285(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class376 local9 = this.aClass377_2.method28049(this.aClass383_1.anInt4640 * -87994391, 1980145941);
		if (local9 == null) {
			return;
		}
		@Pc(32) int local32 = this.aClass383_1.aClass390_10.method28274(this.aClass383_1.anInt4638 * -1061715617, client.anInt3511 * 2040043391, -281081870) + this.aClass383_1.anInt4634 * -798260597;
		@Pc(52) int local52 = this.aClass383_1.aClass392_10.method28291(this.aClass383_1.anInt4639 * -1224526545, client.anInt3512 * -817449061, (short) 255) + this.aClass383_1.anInt4635 * -1626253363;
		if (this.aClass383_1.aBoolean740) {
			Class694.aClass104_14.method20573(local32, local52, this.aClass383_1.anInt4638 * -1061715617, this.aClass383_1.anInt4639 * -1224526545, this.aClass383_1.anInt4633 * 447508329, 0);
		}
		local52 += this.method28286(Class118_Sub1.aClass106_3, local9.aString192, local32, local52, 5, 880463574) * 12;
		local52 += 8;
		if (this.aClass383_1.aBoolean740) {
			Class694.aClass104_14.method20578(local32, local52, local32 + this.aClass383_1.anInt4638 * -1061715617 - 1, local52, this.aClass383_1.anInt4633 * 447508329, 0);
		}
		local52++;
		local52 += this.method28286(Class118_Sub1.aClass106_3, local9.aString193, local32, local52, 5, 1441534110) * 12;
		local52 += 5;
		@Pc(144) int local144 = local52 + this.method28286(Class118_Sub1.aClass106_3, local9.aString194, local32, local52, 5, 1239177597) * 12;
	}

	@OriginalMember(owner = "client!kw", name = "k", descriptor = "(Z)V", line = 25)
	@Override
	public void method28281(@OriginalArg(0) boolean arg0) {
		@Pc(9) Class376 local9 = this.aClass377_2.method28049(this.aClass383_1.anInt4640 * -87994391, 1420835547);
		if (local9 == null) {
			return;
		}
		@Pc(32) int local32 = this.aClass383_1.aClass390_10.method28274(this.aClass383_1.anInt4638 * -1061715617, client.anInt3511 * 2040043391, 1499997051) + this.aClass383_1.anInt4634 * -798260597;
		@Pc(52) int local52 = this.aClass383_1.aClass392_10.method28291(this.aClass383_1.anInt4639 * -1224526545, client.anInt3512 * -817449061, (short) 255) + this.aClass383_1.anInt4635 * -1626253363;
		if (this.aClass383_1.aBoolean740) {
			Class694.aClass104_14.method20573(local32, local52, this.aClass383_1.anInt4638 * -1061715617, this.aClass383_1.anInt4639 * -1224526545, this.aClass383_1.anInt4633 * 447508329, 0);
		}
		local52 += this.method28286(Class118_Sub1.aClass106_3, local9.aString192, local32, local52, 5, 1170987856) * 12;
		local52 += 8;
		if (this.aClass383_1.aBoolean740) {
			Class694.aClass104_14.method20578(local32, local52, local32 + this.aClass383_1.anInt4638 * -1061715617 - 1, local52, this.aClass383_1.anInt4633 * 447508329, 0);
		}
		local52++;
		local52 += this.method28286(Class118_Sub1.aClass106_3, local9.aString193, local32, local52, 5, 1784316353) * 12;
		local52 += 5;
		@Pc(144) int local144 = local52 + this.method28286(Class118_Sub1.aClass106_3, local9.aString194, local32, local52, 5, 1835862826) * 12;
	}

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "(Z)V", line = 25)
	@Override
	public void method28282(@OriginalArg(0) boolean arg0) {
		@Pc(9) Class376 local9 = this.aClass377_2.method28049(this.aClass383_1.anInt4640 * -87994391, -1080400681);
		if (local9 == null) {
			return;
		}
		@Pc(32) int local32 = this.aClass383_1.aClass390_10.method28274(this.aClass383_1.anInt4638 * -1061715617, client.anInt3511 * 2040043391, -595781350) + this.aClass383_1.anInt4634 * -798260597;
		@Pc(52) int local52 = this.aClass383_1.aClass392_10.method28291(this.aClass383_1.anInt4639 * -1224526545, client.anInt3512 * -817449061, (short) 255) + this.aClass383_1.anInt4635 * -1626253363;
		if (this.aClass383_1.aBoolean740) {
			Class694.aClass104_14.method20573(local32, local52, this.aClass383_1.anInt4638 * -1061715617, this.aClass383_1.anInt4639 * -1224526545, this.aClass383_1.anInt4633 * 447508329, 0);
		}
		local52 += this.method28286(Class118_Sub1.aClass106_3, local9.aString192, local32, local52, 5, 1658618712) * 12;
		local52 += 8;
		if (this.aClass383_1.aBoolean740) {
			Class694.aClass104_14.method20578(local32, local52, local32 + this.aClass383_1.anInt4638 * -1061715617 - 1, local52, this.aClass383_1.anInt4633 * 447508329, 0);
		}
		local52++;
		local52 += this.method28286(Class118_Sub1.aClass106_3, local9.aString193, local32, local52, 5, 1686869047) * 12;
		local52 += 5;
		@Pc(144) int local144 = local52 + this.method28286(Class118_Sub1.aClass106_3, local9.aString194, local32, local52, 5, 1985760887) * 12;
	}

	@OriginalMember(owner = "client!kw", name = "z", descriptor = "(Lclient!eu;Ljava/lang/String;IIII)I", line = 41)
	int method28286(@OriginalArg(0) Class106 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return arg0.method7534(arg1, arg4 + arg2, arg4 + arg3, this.aClass383_1.anInt4638 * -1061715617 - arg4 * 2, this.aClass383_1.anInt4639 * -1224526545 - arg4 * 2, this.aClass383_1.anInt4636 * 2084249013, this.aClass383_1.anInt4637 * 766491199, 0, 0, 0, null, null, null, 0, 0, (short) 657);
	}

	@OriginalMember(owner = "client!kw", name = "gd", descriptor = "(Lclient!ahm;I)V", line = 3902)
	static final void method28287(@OriginalArg(0) Class132_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class19 local2 = arg0.aClass19_3;
		if (arg0.anInt2762 * -1538623211 == client.anInt3485 || !local2.method23557(392779085) || local2.method23623(1, -1338319326)) {
			@Pc(27) int local27 = arg0.anInt2762 * -1538623211 - arg0.anInt2780 * -2095106181;
			@Pc(34) int local34 = client.anInt3485 - arg0.anInt2780 * -2095106181;
			@Pc(45) int local45 = arg0.anInt2775 * -1016506880 + arg0.method19986(-1274879683) * 256;
			@Pc(56) int local56 = arg0.anInt2777 * -294398464 + arg0.method19986(1416437668) * 256;
			@Pc(67) int local67 = arg0.anInt2793 * -195442176 + arg0.method19986(927700343) * 256;
			@Pc(78) int local78 = arg0.anInt2778 * 1120552448 + arg0.method19986(-219874162) * 256;
			@Pc(90) int local90 = (local67 * local34 + local45 * (local27 - local34)) / local27;
			@Pc(102) int local102 = ((local27 - local34) * local56 + local34 * local78) / local27;
			@Pc(111) int local111 = Class305.method26802(local90, local102, arg0.anInt2773 * -1628091145, (byte) 0);
			@Pc(120) int local120 = Class305.method26802(local67, local78, arg0.anInt2779 * -1734662383, (byte) -20);
			@Pc(132) int local132 = ((local27 - local34) * local111 + local120 * local34) / local27;
			arg0.method24244((float) local90, (float) local132, (float) local102);
		}
		arg0.anInt2791 = 0;
		arg0.method19953(arg0.anInt2782 * -1729677103, false, 1713513919);
	}

	@OriginalMember(owner = "client!kw", name = "bf", descriptor = "(Lclient!yf;B)V", line = 5081)
	static final void method28288(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5894 -= 1566132618;
		if (arg0.aLongArray27[arg0.anInt5894 * -2000995827 + 1] == arg0.aLongArray27[arg0.anInt5894 * -2000995827]) {
			arg0.anInt5889 += arg0.anIntArray520[arg0.anInt5889 * -709694321] * 2047914607;
		}
	}

	@OriginalMember(owner = "client!kw", name = "ba", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 5246)
	static final void method28289(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5891 -= 463840436;
		arg0.anInt3975 = arg2.anIntArray519[arg2.anInt5891 * -1497248091] * -2099671483;
		arg0.anInt3976 = arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 1] * 586132379;
		@Pc(39) int local39 = arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 2];
		if (local39 < 0) {
			local39 = 0;
		} else if (local39 > 5) {
			local39 = 5;
		}
		@Pc(59) int local59 = arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 3];
		if (local59 < 0) {
			local59 = 0;
		} else if (local59 > 5) {
			local59 = 5;
		}
		arg0.aByte126 = (byte) local39;
		arg0.aByte127 = (byte) local59;
		Class354.method27694(arg0, -1174743804);
		Class237.method25775(arg1, arg0, (byte) 48);
		if (arg0.anInt3971 * -158526639 == 0) {
			Class548.method31015(arg1, arg0, false, 1481485788);
		}
		if (arg0.anInt3970 * 532402067 == -1 && !arg1.aBoolean708) {
			Class110_Sub1.method6371(arg0.anInt3953 * -1549590237, (byte) -47);
		}
	}
}
