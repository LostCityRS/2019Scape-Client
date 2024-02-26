package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.List;

@OriginalClass("client!ge")
public final class Class286 implements Interface26 {

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "Ljava/util/List;")
	static List aList14;

	@OriginalMember(owner = "client!ge", name = "bq", descriptor = "I")
	public static int anInt3941;

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
	protected static int anInt3942;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ge", name = "this$0", descriptor = "Lclient!gc;")
	final Class284 aClass284_7;

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "(Lclient!yp;I)V")
	static void method26897(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1] = ((Class352) Class106.aClass73_Sub1_6.method18054(arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1], -1935778245)).anInt4256 * -2054382389;
	}

	@OriginalMember(owner = "client!ge", name = "hx", descriptor = "(Lclient!yp;I)V")
	static void method26898(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2103715432);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class630.method32716(local16, local22, true, 1, arg0, -1102022993);
	}

	@OriginalMember(owner = "client!ge", name = "uy", descriptor = "(Lclient!yp;B)V")
	static void method26899(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(14) Class327 local14 = Class301.method27041(arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], 2073403395);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local14.anInt4167 * 1052460537;
	}

	@OriginalMember(owner = "client!ge", name = "xd", descriptor = "(Lclient!yp;I)V")
	static void method26900(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method19031(-1113584827);
	}

	@OriginalMember(owner = "client!ge", name = "ls", descriptor = "([Lclient!hx;II)V")
	static void method26901(@OriginalArg(0) Class327[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class327 local9 = arg0[local1];
			if (local9 != null) {
				if (local9.anInt4135 * 710314345 == 0) {
					if (local9.aClass327Array4 != null) {
						method26901(local9.aClass327Array4, arg1, 1559739494);
					}
					@Pc(35) Class80_Sub40 local35 = (Class80_Sub40) client.aClass24_20.method560((long) (local9.anInt4087 * -2053489901));
					if (local35 != null) {
						Class2_Sub1_Sub2.method1852(local35.anInt3156 * -151091669, arg1, -1470630919);
					}
				}
				@Pc(53) Class80_Sub42 local53;
				if (arg1 == 0 && local9.anObjectArray34 != null) {
					local53 = new Class80_Sub42();
					local53.aClass327_3 = local9;
					local53.anObjectArray4 = local9.anObjectArray34;
					Class279.method26847(local53, 1768996572);
				}
				if (arg1 == 1 && local9.anObjectArray12 != null) {
					if (local9.anInt4094 * 2071556223 >= 0) {
						@Pc(81) Class327 local81 = Class301.method27041(local9.anInt4087 * -2053489901, 1996014119);
						if (local81 == null || local81.aClass327Array3 == null || local9.anInt4094 * 2071556223 >= local81.aClass327Array3.length || local9 != local81.aClass327Array3[local9.anInt4094 * 2071556223]) {
							continue;
						}
					}
					local53 = new Class80_Sub42();
					local53.aClass327_3 = local9;
					local53.anObjectArray4 = local9.anObjectArray12;
					Class279.method26847(local53, 513726317);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!gc;)V")
	Class286(@OriginalArg(0) Class284 arg0) {
		this.aClass284_7 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "(Lclient!gz;I)V")
	@Override
	public void method27029(@OriginalArg(0) Class305 arg0, @OriginalArg(1) int arg1) {
		arg0.method27137((byte) -118);
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(Lclient!gz;)V")
	@Override
	public void method27028(@OriginalArg(0) Class305 arg0) {
		arg0.method27137((byte) -101);
	}
}
