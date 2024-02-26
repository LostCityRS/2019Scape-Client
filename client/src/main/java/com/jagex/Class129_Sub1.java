package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aho")
public final class Class129_Sub1 extends Class129 {

	@OriginalMember(owner = "client!aho", name = "ao", descriptor = "(I)V")
	static void method10141(@OriginalArg(0) int arg0) {
		Class238.aClass75_3.method1314(1587586714);
		Class238.aClass75_3.aPacketBit_1.pos = 0;
		Class238.aClass75_3.aClass448_2 = null;
		Class238.aClass75_3.aClass448_3 = null;
		Class238.aClass75_3.aClass448_4 = null;
		Class238.aClass75_3.aClass448_1 = null;
		Class238.aClass75_3.anInt248 = 0;
		Class238.aClass75_3.anInt245 = 0;
		client.anInt3584 = 0;
		Class474.method29881(1285614822);
		Class521.method30634(-1773130851);
		@Pc(32) int local32;
		for (local32 = 0; local32 < 2048; local32++) {
			client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local32] = null;
		}
		Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 = null;
		for (local32 = 0; local32 < client.anInt3452 * -340916049; local32++) {
			@Pc(56) Class120_Sub1_Sub1_Sub1 local56 = (Class120_Sub1_Sub1_Sub1) client.aClass80_Sub19Array1[local32].anObject5;
			if (local56 != null) {
				local56.anInt2683 = -1779375907;
			}
		}
		Class74.method1311((byte) 78);
		Class151.method14543(Class676.method33586(-952388210), (byte) -31);
		Class604.method32148(18, 1508093692);
		for (local32 = 0; local32 < 106; local32++) {
			client.aBooleanArray19[local32] = true;
		}
		Class103_Sub23.method8699(Class238.aClass75_3, 2035573692);
		Class533.aClass692_2 = null;
		Class80.aLong339 = 0L;
		Class514.method30571(-1925354276);
		Class120_Sub1_Sub1_Sub4.aClass110_Sub1_1.method7310(-55151040);
	}

	@OriginalMember(owner = "client!aho", name = "t", descriptor = "(S)V")
	public static void method10142(@OriginalArg(0) short arg0) {
		if (!Class47.aBoolean29) {
			return;
		}
		if (Class47.anInt181 * -1447287333 < Class635.anInt5596 * 828983813) {
			Class47.anInt181 = Class635.anInt5596 * 312051103;
		}
		while (true) {
			while (Class47.anInt181 * -1447287333 < Class635.anInt5600 * 1540152885) {
				@Pc(27) Class163_Sub1 local27 = Class80_Sub28_Sub2.method21750(Class47.anInt181 * -1447287333, 2037370194);
				if (local27 != null && local27.anInt2087 * 1438063139 == -1) {
					if (Class47.aClass692_1 == null) {
						Class47.aClass692_1 = client.aClass680_1.method33626(local27.aString61, (byte) 101);
					}
					@Pc(55) int local55 = Class47.aClass692_1.anInt5782 * -1361729949;
					if (local55 == -1) {
						return;
					}
					local27.anInt2087 = local55 * -965253749;
					Class47.anInt181 += -1802154413;
					Class47.aClass692_1 = null;
				} else {
					Class47.anInt181 += -1802154413;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aho", name = "<init>", descriptor = "(Lclient!pf;Lclient!pf;Lclient!ahs;)V")
	Class129_Sub1(@OriginalArg(0) Class480 arg0, @OriginalArg(1) Class480 arg1, @OriginalArg(2) Class125_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aho", name = "x", descriptor = "(ZII)V")
	@Override
	void method20272(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = this.method20280(-286957209) * this.aClass125_5.anInt2900 * 199320851 / 10000;
		Class279.aClass102_9.method20722(arg1, arg2 + 2, local11, this.aClass125_5.anInt2903 * 1087492339 - 2, ((Class125_Sub3) this.aClass125_5).anInt1183 * -1177778903, 0);
		Class279.aClass102_9.method20722(arg1 + local11, arg2 + 2, this.aClass125_5.anInt2900 * 199320851 - local11, this.aClass125_5.anInt2903 * 1087492339 - 2, 0, 0);
	}

	@OriginalMember(owner = "client!aho", name = "s", descriptor = "(ZIII)V")
	@Override
	void method20273(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = this.method20280(-1349900758) * this.aClass125_5.anInt2900 * 199320851 / 10000;
		Class279.aClass102_9.method20722(arg1, arg2 + 2, local11, this.aClass125_5.anInt2903 * 1087492339 - 2, ((Class125_Sub3) this.aClass125_5).anInt1183 * -1177778903, 0);
		Class279.aClass102_9.method20722(arg1 + local11, arg2 + 2, this.aClass125_5.anInt2900 * 199320851 - local11, this.aClass125_5.anInt2903 * 1087492339 - 2, 0, 0);
	}

	@OriginalMember(owner = "client!aho", name = "a", descriptor = "(ZIIB)V")
	@Override
	void method20274(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		Class279.aClass102_9.method20818(arg1 - 2, arg2, this.aClass125_5.anInt2900 * 199320851 + 4, this.aClass125_5.anInt2903 * 1087492339 + 2, ((Class125_Sub3) this.aClass125_5).anInt1184 * 1608329867, 0);
		Class279.aClass102_9.method20818(arg1 - 1, arg2 + 1, this.aClass125_5.anInt2900 * 199320851 + 2, this.aClass125_5.anInt2903 * 1087492339, 0, 0);
	}

	@OriginalMember(owner = "client!aho", name = "w", descriptor = "(ZII)V")
	@Override
	void method20275(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class279.aClass102_9.method20818(arg1 - 2, arg2, this.aClass125_5.anInt2900 * 199320851 + 4, this.aClass125_5.anInt2903 * 1087492339 + 2, ((Class125_Sub3) this.aClass125_5).anInt1184 * 1608329867, 0);
		Class279.aClass102_9.method20818(arg1 - 1, arg2 + 1, this.aClass125_5.anInt2900 * 199320851 + 2, this.aClass125_5.anInt2903 * 1087492339, 0, 0);
	}

	@OriginalMember(owner = "client!aho", name = "h", descriptor = "(ZII)V")
	@Override
	void method20278(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class279.aClass102_9.method20818(arg1 - 2, arg2, this.aClass125_5.anInt2900 * 199320851 + 4, this.aClass125_5.anInt2903 * 1087492339 + 2, ((Class125_Sub3) this.aClass125_5).anInt1184 * 1608329867, 0);
		Class279.aClass102_9.method20818(arg1 - 1, arg2 + 1, this.aClass125_5.anInt2900 * 199320851 + 2, this.aClass125_5.anInt2903 * 1087492339, 0, 0);
	}

	@OriginalMember(owner = "client!aho", name = "r", descriptor = "(ZII)V")
	@Override
	void method20276(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class279.aClass102_9.method20818(arg1 - 2, arg2, this.aClass125_5.anInt2900 * 199320851 + 4, this.aClass125_5.anInt2903 * 1087492339 + 2, ((Class125_Sub3) this.aClass125_5).anInt1184 * 1608329867, 0);
		Class279.aClass102_9.method20818(arg1 - 1, arg2 + 1, this.aClass125_5.anInt2900 * 199320851 + 2, this.aClass125_5.anInt2903 * 1087492339, 0, 0);
	}

	@OriginalMember(owner = "client!aho", name = "q", descriptor = "(ZII)V")
	@Override
	void method20277(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class279.aClass102_9.method20818(arg1 - 2, arg2, this.aClass125_5.anInt2900 * 199320851 + 4, this.aClass125_5.anInt2903 * 1087492339 + 2, ((Class125_Sub3) this.aClass125_5).anInt1184 * 1608329867, 0);
		Class279.aClass102_9.method20818(arg1 - 1, arg2 + 1, this.aClass125_5.anInt2900 * 199320851 + 2, this.aClass125_5.anInt2903 * 1087492339, 0, 0);
	}
}
