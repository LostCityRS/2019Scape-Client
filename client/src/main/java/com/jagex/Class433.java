package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public class Class433 {

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "Lclient!nd;")
	public static final Class433 aClass433_5 = new Class433(8);

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "Lclient!nd;")
	public static final Class433 aClass433_2 = new Class433(16);

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "Lclient!nd;")
	public static final Class433 aClass433_4 = new Class433(8);

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "Lclient!nd;")
	public static final Class433 aClass433_3 = new Class433(16);

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "Lclient!nd;")
	static final Class433 aClass433_6 = new Class433(32);

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
	public final int anInt4806;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "(Lclient!alw;I)Ljava/lang/String;", line = 26)
	public static String method28791(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		return Class106.method7526(arg0, 32767, -1989207878);
	}

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(I)V", line = 43)
	Class433(@OriginalArg(0) int arg0) {
		this.anInt4806 = arg0 * 1374261873;
	}

	@OriginalMember(owner = "client!nd", name = "ha", descriptor = "(Lclient!yf;I)V", line = 6255)
	static final void method28792(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class12.method187(local11, local14, false, 2, arg0, 1691862116);
	}

	@OriginalMember(owner = "client!nd", name = "mb", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V", line = 7272)
	static final void method28793(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (Class532.method30597(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray19 = Class499.method30149(local13, arg2, -181569031);
		arg0.aBoolean680 = true;
	}

	@OriginalMember(owner = "client!nd", name = "nx", descriptor = "(Lclient!yf;I)V", line = 7405)
	static final void method28794(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1063032499);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class379.method28103(local16, local22, arg0, (byte) 17);
	}

	@OriginalMember(owner = "client!nd", name = "aat", descriptor = "(Lclient!yf;B)V", line = 9677)
	static final void method28795(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		if (local13.startsWith(Class346.method27565(0, -1614681388)) || local13.startsWith(Class346.method27565(1, -1614681388))) {
			local13 = local13.substring(7);
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class260.method26158(local13, 2134078020) ? 1 : 0;
	}

	@OriginalMember(owner = "client!nd", name = "amt", descriptor = "(Lclient!yf;S)V", line = 12104)
	static final void method28796(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class106.method7570(client.anInt3435 * -849002901, 992462342) ? 1 : 0;
	}

	@OriginalMember(owner = "client!nd", name = "ayf", descriptor = "(Lclient!yf;B)V", line = 14003)
	static final void method28797(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class32_Sub19.aBoolean374 ? 1 : 0;
	}

	@OriginalMember(owner = "client!nd", name = "azg", descriptor = "(Lclient!yf;I)V", line = 14141)
	static final void method28798(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15529(-1961113908) ? 1 : 0;
	}
}
