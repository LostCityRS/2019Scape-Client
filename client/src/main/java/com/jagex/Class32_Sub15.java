package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aoq")
public class Class32_Sub15 extends Class32 {

	@OriginalMember(owner = "client!aoq", name = "<init>", descriptor = "(Lclient!zd;Lclient!zt;Lclient!py;)V", line = 12)
	public Class32_Sub15(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) Class497 arg2) {
		super(arg0, arg1, arg2, Class667.aClass667_86, 64, new Class52(Class85.class));
	}

	@OriginalMember(owner = "client!aoq", name = "aw", descriptor = "(Lclient!hf;IIB)V", line = 943)
	static void method17180(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		Class454.aClass312_11 = arg0;
		Class454.anInt5047 = arg1 * 1330186731;
		Class454.anInt5048 = arg2 * -1479154505;
	}

	@OriginalMember(owner = "client!aoq", name = "avs", descriptor = "(Lclient!yf;I)V", line = 13441)
	static final void method17181(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub29_1.method16064(-1628934257);
	}
}
