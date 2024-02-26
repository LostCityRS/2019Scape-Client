package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajo")
public final class Class148_Sub1 extends Class148 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ajo", name = "this$0", descriptor = "Lclient!so;")
	final Class556 aClass556_2;

	@OriginalMember(owner = "client!ajo", name = "ea", descriptor = "(I)Lclient!akh;")
	public static Class80_Sub18 method13460(@OriginalArg(0) int arg0) {
		if (Class159_Sub1.aClass8_28 == null || Class159_Sub1.aClass7_1 == null) {
			return null;
		}
		for (@Pc(11) Class80_Sub18 local11 = (Class80_Sub18) Class159_Sub1.aClass7_1.next(); local11 != null; local11 = (Class80_Sub18) Class159_Sub1.aClass7_1.next()) {
			@Pc(23) Class320 local23 = (Class320) Class159_Sub1.aClass41_Sub13_4.method18054(local11.anInt1587 * 1945594581, -217993041);
			if (local23 != null && local23.aBoolean797 && local23.method27544(Class159_Sub1.anInterface21_2, Class159_Sub1.anInterface24_2, -2102904675)) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ajo", name = "t", descriptor = "(Lclient!ase;I)Lclient!uj;")
	static Class594 method13461(@OriginalArg(0) Class120_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class594 local5;
		if (Class362.aClass594_1 == null) {
			local5 = new Class594();
		} else {
			local5 = Class362.aClass594_1;
			Class362.aClass594_1 = Class362.aClass594_1.aClass594_3;
			local5.aClass594_3 = null;
			Class594.anInt5324 -= 1120381915;
		}
		local5.aClass120_Sub1_Sub1_1 = arg0;
		return local5;
	}

	@OriginalMember(owner = "client!ajo", name = "<init>", descriptor = "(Lclient!so;)V")
	Class148_Sub1(@OriginalArg(0) Class556 arg0) {
		super(arg0);
		this.aClass556_2 = arg0;
	}
}
