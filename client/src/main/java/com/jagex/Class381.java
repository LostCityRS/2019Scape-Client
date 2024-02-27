package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class381 implements Interface32 {

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
	public final int anInt4785;

	@OriginalMember(owner = "client!kj", name = "m", descriptor = "(Lclient!alw;)Lclient!kj;")
	public static Class381 method28305(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22431(-118643075);
		return new Class381(local3);
	}

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "(Lclient!alw;)Lclient!kj;")
	public static Class381 method28306(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22431(-118643075);
		return new Class381(local3);
	}

	@OriginalMember(owner = "client!kj", name = "k", descriptor = "(Lclient!alw;)Lclient!kj;")
	public static Class381 method28307(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22431(-118643075);
		return new Class381(local3);
	}

	@OriginalMember(owner = "client!kj", name = "w", descriptor = "(Lclient!alw;)Lclient!kj;")
	public static Class381 method28308(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22431(-118643075);
		return new Class381(local3);
	}

	@OriginalMember(owner = "client!kj", name = "ed", descriptor = "(Lclient!yf;I)V")
	static void method28309(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class305.method26892(local11, local14, arg0, 1958111628);
	}

	@OriginalMember(owner = "client!kj", name = "aqy", descriptor = "(Lclient!yf;I)V")
	static void method28310(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!kj", name = "ans", descriptor = "(Lclient!yf;I)V")
	static void method28311(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (Class65.aClass123_Sub1_2.method9023(-1662199153) != Class342.aClass342_4) {
			throw new RuntimeException();
		}
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class65.aClass123_Sub1_2.method8960(1644866564);
	}

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(I)V")
	Class381(@OriginalArg(0) int arg0) {
		this.anInt4785 = arg0 * 1960194337;
	}

	@OriginalMember(owner = "client!kj", name = "n", descriptor = "(S)Lclient!kt;")
	@Override
	public Class388 method28759(@OriginalArg(0) short arg0) {
		return Class388.aClass388_4;
	}

	@OriginalMember(owner = "client!kj", name = "l", descriptor = "()Lclient!kt;")
	@Override
	public Class388 method28760() {
		return Class388.aClass388_4;
	}
}
