package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public class Class648 {

	@OriginalMember(owner = "client!wv", name = "e", descriptor = "Ljava/lang/String;")
	String aString237;

	@OriginalMember(owner = "client!wv", name = "n", descriptor = "I")
	int anInt5794;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "()V", line = 7)
	Class648() {
	}

	@OriginalMember(owner = "client!wv", name = "gr", descriptor = "(Lclient!yf;I)V", line = 6143)
	static final void method32656(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 398267297);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class47.method958(local16, local22, arg0, 1619063151);
	}

	@OriginalMember(owner = "client!wv", name = "alc", descriptor = "(Lclient!yf;I)V", line = 11930)
	static final void method32657(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -262021061;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(25) int local25 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1] << 1;
		@Pc(35) int local35 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(45) int local45 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 3];
		@Pc(55) int local55 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 4];
		@Pc(65) int local65 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 5];
		@Pc(75) int local75 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 6];
		if (local13 >= 0 && local13 < 2 && client.anIntArrayArrayArray15[local13] != null && local25 >= 0 && local25 < client.anIntArrayArrayArray15[local13].length) {
			client.anIntArrayArrayArray15[local13][local25] = new int[] { (local35 >> 14 & 0x3FFF) << 9, local45 << 2, (local35 & 0x3FFF) << 9, local75 };
			client.anIntArrayArrayArray15[local13][local25 + 1] = new int[] { (local55 >> 14 & 0x3FFF) << 9, local65 << 2, (local55 & 0x3FFF) << 9 };
		}
	}

	@OriginalMember(owner = "client!wv", name = "anq", descriptor = "(Lclient!yf;B)V", line = 12196)
	static final void method32658(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(18) int local18 = local12 >> 14 & 0x3FFF;
		@Pc(22) int local22 = local12 & 0x3FFF;
		@Pc(26) Class611 local26 = client.world.method30455(1787132275);
		local18 -= local26.anInt5623 * 270611681;
		if (local18 < 0) {
			local18 = 0;
		} else if (local18 >= client.world.method30459(-1267149682)) {
			local18 = client.world.method30459(1910607887);
		}
		local22 -= local26.anInt5624 * -1994307635;
		if (local22 < 0) {
			local22 = 0;
		} else if (local22 >= client.world.method30466((short) 128)) {
			local22 = client.world.method30466((short) 128);
		}
		client.anInt3481 = ((local18 << 9) + 256) * 2042260595;
		client.anInt3482 = ((local22 << 9) + 256) * -1025201801;
		Class429.anInt4781 = -823818908;
		Class444.anInt4895 = 783237131;
		Class175.anInt3306 = 1395810859;
		client.aBoolean619 = true;
	}
}
