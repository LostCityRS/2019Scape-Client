package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aao")
public final class Class16 {

	@OriginalMember(owner = "client!aao", name = "t", descriptor = "Lclient!aao;")
	public static final Class16 aClass16_2 = new Class16("LIVE", 0);

	@OriginalMember(owner = "client!aao", name = "f", descriptor = "Lclient!aao;")
	public static final Class16 aClass16_5 = new Class16("BUILDLIVE", 3);

	@OriginalMember(owner = "client!aao", name = "e", descriptor = "Lclient!aao;")
	public static final Class16 aClass16_1 = new Class16("RC", 1);

	@OriginalMember(owner = "client!aao", name = "u", descriptor = "Lclient!aao;")
	public static final Class16 aClass16_3 = new Class16("WIP", 2);

	@OriginalMember(owner = "client!aao", name = "l", descriptor = "Lclient!aao;")
	static final Class16 aClass16_4 = new Class16("INTBETA", 4);

	@OriginalMember(owner = "client!aao", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString2;

	@OriginalMember(owner = "client!aao", name = "i", descriptor = "I")
	public final int anInt51;

	@OriginalMember(owner = "client!aao", name = "e", descriptor = "()[Lclient!aao;")
	static Class16[] method425() {
		return new Class16[] { aClass16_2, aClass16_3, aClass16_4, aClass16_5, aClass16_1 };
	}

	@OriginalMember(owner = "client!aao", name = "v", descriptor = "(Lclient!yp;I)V")
	static void method426(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1] = ((Class352) Class106.aClass73_Sub1_6.method18054(arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1], 1907945942)).method28039(Class672.aClass134_1, (short) 6784) ? 1 : 0;
	}

	@OriginalMember(owner = "client!aao", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	Class16(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString2 = arg0;
		this.anInt51 = arg1 * 1207056493;
	}
}
