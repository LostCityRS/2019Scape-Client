package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajf")
public class Class93_Sub3 extends Class93 {

	@OriginalMember(owner = "client!ajf", name = "fi", descriptor = "Lclient!py;")
	public static Class497 aClass497_43;

	@OriginalMember(owner = "client!ajf", name = "k", descriptor = "I")
	public int anInt1405;

	@OriginalMember(owner = "client!ajf", name = "f", descriptor = "I")
	int anInt1404;

	@OriginalMember(owner = "client!ajf", name = "<init>", descriptor = "(II)V", line = 9)
	Class93_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1405 = arg0 * 806116859;
		this.anInt1404 = arg1 * 1126767189;
	}

	@OriginalMember(owner = "client!ajf", name = "v", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z", line = 214)
	static boolean method11813(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2) {
		Class411.target = 1757895756;
		Class411.connection = client.aClass175_1;
		return Class507.method30229(false, false, arg0, arg1, -1L);
	}

	@OriginalMember(owner = "client!ajf", name = "tg", descriptor = "(Lclient!hf;Lclient!yf;I)V", line = 8508)
	static final void method11814(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class681 arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg1.anIntArray519[(arg1.anInt5891 -= 1189701933) * -1497248091];
		@Pc(27) int local27 = arg1.anIntArray519[(arg1.anInt5891 -= 1189701933) * -1497248091] - 1;
		@Pc(29) int local29 = local27;
		if (arg0.anInt4001 * 1553054515 != 6 && arg0.anInt4001 * 1553054515 != 2) {
			throw new RuntimeException("");
		}
		@Pc(55) Class336 local55 = (Class336) Class162.aClass32_Sub3_2.get(arg0.anInt4037 * 371778301, 720909893);
		if (arg0.aClass331_2 == null) {
			arg0.aClass331_2 = new Class331(local55, arg0.anInt4001 * 1553054515 == 6);
		}
		arg0.aClass331_2.aLong259 = Class388.method28251((byte) 127) * 6591543353939106377L;
		if (local55.aByteArray82 != null) {
			if (local27 < 0 || local27 >= local55.aByteArray82.length) {
				throw new RuntimeException("");
			}
			local29 = local55.aByteArray82[local27];
		}
		if (local55.aShortArray120 == null || local29 < 0 || local29 >= local55.aShortArray120.length) {
			throw new RuntimeException("");
		}
		arg0.aClass331_2.aShortArray114[local29] = (short) local12;
		Class354.method27694(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!ajf", name = "agb", descriptor = "(Lclient!yf;B)V", line = 10703)
	static final void method11815(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = ((Class47) Class277.aClass32_Sub12_1.get(local12, 928908145)).anInt135 * 1415652865;
	}

	@OriginalMember(owner = "client!ajf", name = "ase", descriptor = "(Lclient!yf;I)V", line = 13131)
	static final void method11816(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (local12 < 0 || local12 > 1) {
			local12 = 0;
		}
		Class154.method14144(local12 == 1, 1977897022);
	}
}
