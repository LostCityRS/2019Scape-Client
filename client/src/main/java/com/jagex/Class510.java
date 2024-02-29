package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
final class Class510 implements Interface9 {

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "(B)V", line = 16)
	public static void method30245(@OriginalArg(0) byte arg0) {
		if (Class75.aBoolean31) {
			return;
		}
		Class277.method26353(client.aClass532_1.method30481(-1344665081).aClass572ArrayArrayArray1, 1741982922);
		if (client.aClass532_1.method30481(-1571706188).aClass572ArrayArrayArray2 != null) {
			Class277.method26353(client.aClass532_1.method30481(-1592981131).aClass572ArrayArrayArray2, 1091328726);
		}
		Class75.aBoolean31 = true;
	}

	@OriginalMember(owner = "client!qm", name = "m", descriptor = "(Lclient!alw;)Ljava/lang/Object;", line = 30)
	@Override
	public Object method30271(@OriginalArg(0) Class93_Sub41 arg0) {
		return new Class93_Sub30(arg0);
	}

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "(Lclient!alw;I)Ljava/lang/Object;", line = 30)
	@Override
	public Object method30272(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		return new Class93_Sub30(arg0);
	}

	@OriginalMember(owner = "client!qm", name = "n", descriptor = "(Lclient!alw;)Ljava/lang/Object;", line = 30)
	@Override
	public Object method30270(@OriginalArg(0) Class93_Sub41 arg0) {
		return new Class93_Sub30(arg0);
	}

	@OriginalMember(owner = "client!qm", name = "ae", descriptor = "(Lclient!dh;I)V", line = 884)
	static void method30246(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (Class454.aBoolean773) {
			Class379.method28101(arg0, -915127854);
		} else {
			Class612.method32055(arg0, 341027251);
		}
	}

	@OriginalMember(owner = "client!qm", name = "hb", descriptor = "(Lclient!yf;B)V", line = 6276)
	static final void method30247(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, -518589708);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class12.method187(local16, local22, true, 2, arg0, 1691862116);
	}

	@OriginalMember(owner = "client!qm", name = "zx", descriptor = "(Lclient!yf;B)V", line = 9631)
	static final void method30248(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (client.anInt3572 * 825168203 == 2 && local12 < client.anInt3444 * 862418793) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aClass281Array1[local12].anInt3897 * -1140302121;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		}
	}
}
