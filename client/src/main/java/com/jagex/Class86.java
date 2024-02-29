package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adn")
public class Class86 {

	@OriginalMember(owner = "client!adn", name = "fc", descriptor = "Lclient!py;")
	public static Class497 aClass497_15;

	@OriginalMember(owner = "client!adn", name = "ub", descriptor = "I")
	static int anInt264;

	@OriginalMember(owner = "client!adn", name = "e", descriptor = "[Lclient!kk;")
	public Interface32[] anInterface32Array1;

	@OriginalMember(owner = "client!adn", name = "<init>", descriptor = "()V", line = 21)
	Class86() {
	}

	@OriginalMember(owner = "client!adn", name = "e", descriptor = "(Lclient!alw;I)V", line = 24)
	void method1490(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.anInterface32Array1 = new Interface32[arg0.method22465((short) 16384)];
		@Pc(8) Class388[] local8 = Class352.method27653(392010971);
		for (@Pc(10) int local10 = 0; local10 < this.anInterface32Array1.length; local10++) {
			this.anInterface32Array1[local10] = this.method1493(arg0, local8[arg0.method22465((short) 16384)], 98630545);
		}
	}

	@OriginalMember(owner = "client!adn", name = "m", descriptor = "(Lclient!alw;)V", line = 24)
	void method1491(@OriginalArg(0) Class93_Sub41 arg0) {
		this.anInterface32Array1 = new Interface32[arg0.method22465((short) 16384)];
		@Pc(8) Class388[] local8 = Class352.method27653(1352072445);
		for (@Pc(10) int local10 = 0; local10 < this.anInterface32Array1.length; local10++) {
			this.anInterface32Array1[local10] = this.method1493(arg0, local8[arg0.method22465((short) 16384)], 98630545);
		}
	}

	@OriginalMember(owner = "client!adn", name = "k", descriptor = "(Lclient!alw;Lclient!kt;)Lclient!kk;", line = 32)
	Interface32 method1492(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class388 arg1) {
		if (Class388.aClass388_4 == arg1) {
			return Class148_Sub1.method11759(arg0, -1650036519);
		} else if (arg1 == Class388.aClass388_2) {
			return Class679.method33234(arg0, 1443923962);
		} else if (Class388.aClass388_5 == arg1) {
			return Class466.method29326(arg0, -1937879613);
		} else if (arg1 == Class388.aClass388_6) {
			return Class121_Sub1.method8710(arg0, 495374353);
		} else if (arg1 == Class388.aClass388_8) {
			return Class449.method28926(arg0, 1469790899);
		} else if (arg1 == Class388.aClass388_3) {
			return Class389.method28263(arg0, -306182323);
		} else if (arg1 == Class388.aClass388_7) {
			return Class661.method32833(arg0, (byte) 44);
		} else if (arg1 == Class388.aClass388_1) {
			return Class249.method25932(arg0, (byte) 114);
		} else if (Class388.aClass388_9 == arg1) {
			return Class590.method31684(arg0, -891080090);
		} else if (arg1 == Class388.aClass388_10) {
			return Class496.method30031(arg0, -1201705695);
		} else if (arg1 == Class388.aClass388_11) {
			return Class66.method1191(arg0, 1059403033);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!adn", name = "n", descriptor = "(Lclient!alw;Lclient!kt;I)Lclient!kk;", line = 32)
	Interface32 method1493(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class388 arg1, @OriginalArg(2) int arg2) {
		if (Class388.aClass388_4 == arg1) {
			return Class148_Sub1.method11759(arg0, -1543751312);
		} else if (arg1 == Class388.aClass388_2) {
			return Class679.method33234(arg0, 1443923962);
		} else if (Class388.aClass388_5 == arg1) {
			return Class466.method29326(arg0, -1937879613);
		} else if (arg1 == Class388.aClass388_6) {
			return Class121_Sub1.method8710(arg0, -537224137);
		} else if (arg1 == Class388.aClass388_8) {
			return Class449.method28926(arg0, 1040159588);
		} else if (arg1 == Class388.aClass388_3) {
			return Class389.method28263(arg0, -765917292);
		} else if (arg1 == Class388.aClass388_7) {
			return Class661.method32833(arg0, (byte) 36);
		} else if (arg1 == Class388.aClass388_1) {
			return Class249.method25932(arg0, (byte) 79);
		} else if (Class388.aClass388_9 == arg1) {
			return Class590.method31684(arg0, -1544199103);
		} else if (arg1 == Class388.aClass388_10) {
			return Class496.method30031(arg0, -1425693500);
		} else if (arg1 == Class388.aClass388_11) {
			return Class66.method1191(arg0, 1059403033);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!adn", name = "m", descriptor = "([I[IIII)V", line = 43)
	public static void method1494(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(45) int local45 = local14 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(47) int local47 = arg2; local47 < arg3; local47++) {
			if (arg0[local47] < local14 + (local47 & local45)) {
				@Pc(63) int local63 = arg0[local47];
				arg0[local47] = arg0[local10];
				arg0[local10] = local63;
				@Pc(77) int local77 = arg1[local47];
				arg1[local47] = arg1[local10];
				arg1[local10++] = local77;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		method1494(arg0, arg1, arg2, local10 - 1, 1815175593);
		method1494(arg0, arg1, local10 + 1, arg3, 1815175593);
	}

	@OriginalMember(owner = "client!adn", name = "dl", descriptor = "(Lclient!yf;I)V", line = 5611)
	static final void method1495(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class686.method33485(local11, local14, arg0, -28977544);
	}
}
