package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class482 {

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
	static final int anInt4996 = 6;

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
	static final int anInt4997 = 1;

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
	static final int anInt4998 = 2;

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
	static final int anInt4999 = 3;

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
	static final int anInt5000 = 4;

	@OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
	static final int anInt5001 = 0;

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
	static final int anInt5002 = 7;

	@OriginalMember(owner = "client!ph", name = "asj", descriptor = "(Lclient!yp;I)V")
	static void method30019(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub36_1, arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] == 1 ? 1 : 0, (byte) 80);
		Class719.method37291(2090217657);
		client.aBoolean714 = false;
	}

	@OriginalMember(owner = "client!ph", name = "ayk", descriptor = "(Lclient!yp;I)V")
	static void method30020(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class673.method33570((short) 16383);
		RuntimeException_Sub2.method23509(494139422);
		client.aClass539_1.method30938(1767625142);
		Class719.method37291(1750778990);
		client.aBoolean714 = false;
	}

	@OriginalMember(owner = "client!ph", name = "asg", descriptor = "(Lclient!yp;I)V")
	static void method30021(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (local12 < 0 || local12 > 5 || local12 == 2) {
			local12 = 3;
		}
		Class528.method30719(local12, false, -1241943248);
	}

	@OriginalMember(owner = "client!ph", name = "aie", descriptor = "(Lclient!yp;I)V")
	static void method30022(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		@Pc(16) Class75 local16 = Class52.method1074(16777215);
		@Pc(22) Class80_Sub31 local22 = Class623.method32440(Class443.aClass443_116, local16.aClass22_1, -191270971);
		local22.aClass80_Sub36_Sub1_2.method23154(0, 1275868335);
		@Pc(33) int local33 = local22.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821;
		local22.aClass80_Sub36_Sub1_2.method23165(local13, 1977175175);
		local22.aClass80_Sub36_Sub1_2.method23155(arg0.aClass453_1.anInt4894 * 221296175, (byte) -32);
		arg0.aClass453_1.aClass80_Sub1_Sub19_1.method23050(local22.aClass80_Sub36_Sub1_2, arg0.aClass453_1.anIntArray451, (byte) -17);
		local22.aClass80_Sub36_Sub1_2.method23171(local22.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821 - local33, (byte) 106);
		local16.method1325(local22, (byte) -125);
	}

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	Class482() throws Throwable {
		throw new Error();
	}
}
