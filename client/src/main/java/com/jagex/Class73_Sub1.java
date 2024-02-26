package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!apc")
public final class Class73_Sub1 extends Class73 {

	@OriginalMember(owner = "client!apc", name = "t", descriptor = "(B)[Lclient!cl;")
	static Class208[] method17920(@OriginalArg(0) byte arg0) {
		return new Class208[] { Class208.aClass208_9, Class208.aClass208_2, Class208.aClass208_3, Class208.aClass208_4, Class208.aClass208_1, Class208.aClass208_6, Class208.aClass208_7, Class208.aClass208_8, Class208.aClass208_5 };
	}

	@OriginalMember(owner = "client!apc", name = "<init>", descriptor = "(Lclient!zy;Lclient!zv;Lclient!pf;Z)V")
	public Class73_Sub1(@OriginalArg(0) Class722 arg0, @OriginalArg(1) Class719 arg1, @OriginalArg(2) Class480 arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, Class664.aClass664_67, arg2, new Class334(), arg3);
	}

	@OriginalMember(owner = "client!apc", name = "f", descriptor = "(I)I")
	@Override
	public int method18051(@OriginalArg(0) int arg0) {
		return this.anInt2513 * 604664039;
	}

	@OriginalMember(owner = "client!apc", name = "l", descriptor = "()I")
	@Override
	public int method18052() {
		return this.anInt2513 * 604664039;
	}
}
