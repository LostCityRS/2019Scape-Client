package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
final class Class259 implements Interface39 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!fc", name = "this$0", descriptor = "Lclient!fb;")
	final Class258 aClass258_2;

	@OriginalMember(owner = "client!fc", name = "axf", descriptor = "(Lclient!yf;I)V")
	static void method26238(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(18) Class322 local18 = (Class322) Class542.aClass32_Sub2_3.method18273(local12, -765082799);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local18.anInt4146 * 880251661;
	}

	@OriginalMember(owner = "client!fc", name = "att", descriptor = "(Lclient!yf;B)V")
	static void method26239(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!fb;)V")
	Class259(@OriginalArg(0) Class258 arg0) {
		this.aClass258_2 = arg0;
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)F")
	@Override
	public float method26438(@OriginalArg(0) int arg0) {
		return (float) Class51.aClass93_Sub36_1.aClass166_Sub35_4.method16235(574500123) / 255.0F;
	}

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "()F")
	@Override
	public float method26439() {
		return (float) Class51.aClass93_Sub36_1.aClass166_Sub35_4.method16235(1170062514) / 255.0F;
	}
}
