package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agd")
public final class Class103_Sub8 extends Class103 {

	@OriginalMember(owner = "client!agd", name = "dt", descriptor = "Lclient!asb;")
	static Class80_Sub1_Sub12 aClass80_Sub1_Sub12_1;

	@OriginalMember(owner = "client!agd", name = "f", descriptor = "I")
	final int anInt934;

	@OriginalMember(owner = "client!agd", name = "e", descriptor = "I")
	final int anInt931;

	@OriginalMember(owner = "client!agd", name = "u", descriptor = "I")
	final int anInt933;

	@OriginalMember(owner = "client!agd", name = "l", descriptor = "I")
	final int anInt932;

	@OriginalMember(owner = "client!agd", name = "g", descriptor = "I")
	final int anInt935;

	@OriginalMember(owner = "client!agd", name = "dr", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method7863(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5778 -= -664415586;
		arg0.anInt4124 = arg2.anIntArray525[arg2.anInt5778 * 1896589581] * 1072834437;
		arg0.anInt4170 = arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 1] * 1528394109;
		arg0.anInt4074 = arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 2] * 149862615;
		arg0.anInt4115 = arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 3] * -1137256781;
		arg0.anInt4127 = arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 4] * -320713609;
		arg0.anInt4131 = arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 5] * 1341335515;
		Class296.method26998(arg0, 1482536551);
		if (arg0.anInt4094 * 2071556223 == -1 && !arg1.aBoolean794) {
			Class699.method37068(arg0.anInt4087 * -2053489901, 1410186680);
			Class129.method20285(arg0.anInt4087 * -2053489901, 43850514);
		}
	}

	@OriginalMember(owner = "client!agd", name = "y", descriptor = "(IIIB)I")
	static int method7864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(24) int local24 = Class299.method27023(local3, local13, -32683579);
		@Pc(31) int local31 = Class299.method27023(local3 + 1, local13, 1585407765);
		@Pc(38) int local38 = Class299.method27023(local3, local13 + 1, 534425942);
		@Pc(47) int local47 = Class299.method27023(local3 + 1, local13 + 1, -526755288);
		@Pc(54) int local54 = Class461.method29433(local24, local31, local9, arg2, 132816888);
		@Pc(61) int local61 = Class461.method29433(local38, local47, local9, arg2, 600742618);
		return Class461.method29433(local54, local61, local19, arg2, 840933644);
	}

	@OriginalMember(owner = "client!agd", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class103_Sub8(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt934 = arg0.g2() * -936819157;
		@Pc(13) int local13 = arg0.g1();
		if ((local13 & 0x1) == 0) {
			this.anInt931 = -1586483179;
			this.anInt933 = 661220959;
		} else {
			this.anInt931 = arg0.g2() * 1586483179;
			this.anInt933 = arg0.g2() * -661220959;
		}
		if ((local13 & 0x2) == 0) {
			this.anInt932 = 1700990027;
			this.anInt935 = -1989316981;
		} else {
			this.anInt932 = arg0.g2() * -1700990027;
			this.anInt935 = arg0.g2() * 1989316981;
		}
		if ((local13 & 0x4) != 0) {
			@Pc(73) int local73 = arg0.g2();
			@Pc(77) int local77 = arg0.g2();
			@Pc(83) int local83 = local73 * 255 / local77;
			if (local73 > 0 && local83 < 1) {
				@Pc(90) boolean local90 = true;
			}
		}
	}

	@OriginalMember(owner = "client!agd", name = "l", descriptor = "()V")
	@Override
	public void method19198() {
		@Pc(8) Class120_Sub1_Sub1_Sub1 local8 = Class251.aClass254Array1[this.anInt934 * -537966461].method26399((byte) -13);
		local8.method18962(this.anInt931 * 1825956035, this.anInt933 * -1614441887, this.anInt932 * 1831772829, this.anInt935 * -458557731, client.anInt3436, 0, 1763965267);
	}

	@OriginalMember(owner = "client!agd", name = "f", descriptor = "(I)V")
	@Override
	public void method19206(@OriginalArg(0) int arg0) {
		@Pc(8) Class120_Sub1_Sub1_Sub1 local8 = Class251.aClass254Array1[this.anInt934 * -537966461].method26399((byte) 4);
		local8.method18962(this.anInt931 * 1825956035, this.anInt933 * -1614441887, this.anInt932 * 1831772829, this.anInt935 * -458557731, client.anInt3436, 0, -272394313);
	}

	@OriginalMember(owner = "client!agd", name = "g", descriptor = "()V")
	@Override
	public void method19202() {
		@Pc(8) Class120_Sub1_Sub1_Sub1 local8 = Class251.aClass254Array1[this.anInt934 * -537966461].method26399((byte) 40);
		local8.method18962(this.anInt931 * 1825956035, this.anInt933 * -1614441887, this.anInt932 * 1831772829, this.anInt935 * -458557731, client.anInt3436, 0, 1822963366);
	}
}
