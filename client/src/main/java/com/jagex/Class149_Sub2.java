package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajd")
public class Class149_Sub2 extends Class149 {

	@OriginalMember(owner = "client!ajd", name = "m", descriptor = "I")
	int anInt1400 = (int) (Class305.method26797(1052309780) / 1000L) * -619068835;

	@OriginalMember(owner = "client!ajd", name = "k", descriptor = "Ljava/lang/String;")
	String aString42;

	@OriginalMember(owner = "client!ajd", name = "f", descriptor = "S")
	short aShort77;

	@OriginalMember(owner = "client!ajd", name = "cs", descriptor = "(Lclient!yf;I)V", line = 5433)
	static final void method11785(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class96.method2325(local11, local14, arg0, -336980874);
	}

	@OriginalMember(owner = "client!ajd", name = "sm", descriptor = "(Lclient!yf;B)V", line = 8194)
	static final void method11786(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local11.anInt4044 * 1088282729;
	}

	@OriginalMember(owner = "client!ajd", name = "zb", descriptor = "(Lclient!yf;I)V", line = 9619)
	static final void method11787(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (client.anInt3572 * 825168203 == 2 && local12 < client.anInt3444 * 862418793) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aClass281Array1[local12].anInt3895 * 1801946213;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!ajd", name = "ahm", descriptor = "(Lclient!yf;B)V", line = 10795)
	static final void method11788(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class36.anInt117 = 0;
	}

	@OriginalMember(owner = "client!ajd", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 12532)
	Class149_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString42 = arg0;
		this.aShort77 = (short) arg1;
	}

	@OriginalMember(owner = "client!ajd", name = "ape", descriptor = "(Lclient!yf;I)V", line = 12657)
	static final void method11789(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt5891 -= 463840436;
		@Pc(14) float local14 = (float) arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(25) float local25 = (float) arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(36) float local36 = (float) arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(49) float local49 = (float) arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 3] / 1000.0F;
		Class65.aClass123_Sub1_2.method8981(Class472.method29535(local14, local25, local36), local49, (byte) 1);
	}
}
