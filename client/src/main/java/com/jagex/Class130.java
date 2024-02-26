package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public class Class130 implements Interface33 {

	@OriginalMember(owner = "client!lk", name = "if", descriptor = "Lclient!adv;")
	public static Class2_Sub1_Sub2 aClass2_Sub1_Sub2_6;

	@OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
	public final int anInt1171;

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "Lclient!ky;")
	public final Class391 aClass391_6;

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "Lclient!km;")
	public final Class383 aClass383_6;

	@OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
	public final int anInt1172;

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
	public final int anInt1173;

	@OriginalMember(owner = "client!lk", name = "wk", descriptor = "(Lclient!yp;I)V")
	static void method10198(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -442943724;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(43) int local43 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 3];
		@Pc(45) short local45 = 256;
		Class490.aClass263_13.method26532(Class280.aClass280_9, local13, local23, local43, Class278.aClass278_5.method26831(-1174193118), Class269.aClass269_5, 0.0F, 0.0F, null, 0, local45, local33, 1674885322);
	}

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "(I)Z")
	static boolean method10199(@OriginalArg(0) int arg0) {
		return Class606.aBoolean931;
	}

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "(Lclient!tn;Lclient!tn;I)V")
	public static void method10200(@OriginalArg(0) Class80 arg0, @OriginalArg(1) Class80 arg1, @OriginalArg(2) int arg2) {
		if (arg0.aClass80_228 != null) {
			arg0.method24395((byte) 4);
		}
		arg0.aClass80_228 = arg1.aClass80_228;
		arg0.aClass80_227 = arg1;
		arg0.aClass80_228.aClass80_227 = arg0;
		arg0.aClass80_227.aClass80_228 = arg0;
	}

	@OriginalMember(owner = "client!lk", name = "bek", descriptor = "(Lclient!yp;B)V")
	static void method10201(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 1815275855;
		Class635.method32820(arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1], 751665029);
	}

	@OriginalMember(owner = "client!lk", name = "auk", descriptor = "(Lclient!yp;B)V")
	static void method10202(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub2_1.method15861(1423795933) == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(ILclient!ky;Lclient!km;II)V")
	Class130(@OriginalArg(0) int arg0, @OriginalArg(1) Class391 arg1, @OriginalArg(2) Class383 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt1171 = arg0 * 587158325;
		this.aClass391_6 = arg1;
		this.aClass383_6 = arg2;
		this.anInt1172 = arg3 * 480368411;
		this.anInt1173 = arg4 * -54111291;
	}

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "(I)Lclient!kz;")
	@Override
	public Class392 method28942(@OriginalArg(0) int arg0) {
		return Class392.aClass392_6;
	}

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "()Lclient!kz;")
	@Override
	public Class392 method28941() {
		return Class392.aClass392_6;
	}
}
