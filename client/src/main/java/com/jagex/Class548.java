package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public class Class548 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!sf", name = "this$0", descriptor = "Lclient!sb;")
	final Class545 this$0;

	@OriginalMember(owner = "client!sf", name = "u", descriptor = "(II)I", line = 74)
	public static int method31010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local1 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local1 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local1 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local1 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local1++;
		}
		return local1 + arg0;
	}

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!sb;)V", line = 78)
	Class548(@OriginalArg(0) Class545 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "w", descriptor = "(B)V", line = 165)
	static void method31011(@OriginalArg(0) byte arg0) {
		Class701.aClass93_Sub1_Sub7_7 = new Class93_Sub1_Sub7(Class74.aClass74_56.method1259(Class106.aClass717_8, (byte) -78), "", client.anInt3520 * 895420077, 1006, -1, 0L, 0, 0, true, false, 0L, true);
	}

	@OriginalMember(owner = "client!sf", name = "se", descriptor = "(Lclient!yf;I)V", line = 8212)
	static final void method31012(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local11.anInt4004 * 1572745861;
	}

	@OriginalMember(owner = "client!sf", name = "sb", descriptor = "(Lclient!yf;I)V", line = 8311)
	static final void method31013(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		if (local11.aString165 == null) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local11.aString165;
		}
	}

	@OriginalMember(owner = "client!sf", name = "aex", descriptor = "(Lclient!yf;I)V", line = 10340)
	static final void method31014(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local13 & local23;
	}

	@OriginalMember(owner = "client!sf", name = "jx", descriptor = "(Lclient!hq;Lclient!hf;ZI)V", line = 10879)
	public static void method31015(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		Class110_Sub21.method8545(arg0.aClass312Array3, arg1, arg2, -1532752138);
	}

	@OriginalMember(owner = "client!sf", name = "lb", descriptor = "(B)V", line = 12060)
	public static final void method31016(@OriginalArg(0) byte arg0) {
		@Pc(2) Class175 local2 = Class330.method27371(-1858814111);
		@Pc(8) Class93_Sub22 local8 = Class102.method2588(Class446.aClass446_94, local2.aClass24_2, (byte) 45);
		local8.aClass93_Sub41_Sub2_1.method22394(0, (byte) -42);
		local2.method24356(local8, -1509960398);
	}
}
