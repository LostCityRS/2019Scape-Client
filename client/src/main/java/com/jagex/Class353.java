package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iy")
public final class Class353 implements Interface75 {

	@OriginalMember(owner = "client!iy", name = "t", descriptor = "Lclient!iy;")
	static final Class353 aClass353_1 = new Class353(0);

	@OriginalMember(owner = "client!iy", name = "f", descriptor = "Lclient!iy;")
	static final Class353 aClass353_3 = new Class353(1);

	@OriginalMember(owner = "client!iy", name = "e", descriptor = "Lclient!iy;")
	static final Class353 aClass353_2 = new Class353(2);

	@OriginalMember(owner = "client!iy", name = "u", descriptor = "I")
	final int anInt4262;

	@OriginalMember(owner = "client!iy", name = "l", descriptor = "(Lclient!yp;I)V")
	static void method28068(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1] = ((Class352) Class106.aClass73_Sub1_6.method18054(arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1], 190924319)).aBoolean834 ? 1 : 0;
	}

	@OriginalMember(owner = "client!iy", name = "qp", descriptor = "(Lclient!yp;I)V")
	static void method28069(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 1998270702);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class661.method33317(local16, local22, arg0, 1141532829);
	}

	@OriginalMember(owner = "client!iy", name = "agk", descriptor = "(Lclient!yp;B)V")
	static void method28070(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(18) Class43 local18 = (Class43) Class25.aClass41_Sub9_1.method18054(local12, 667827327);
		if (local18.anInt155 * 1882600249 == -1 && local18.anInt156 * -330302317 >= 0) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local18.anInt156 * -330302317;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local12;
		}
	}

	@OriginalMember(owner = "client!iy", name = "g", descriptor = "(I)Z")
	public static boolean method28071(@OriginalArg(0) int arg0) {
		return Class238.anInt3841 * 1722349977 != 4;
	}

	@OriginalMember(owner = "client!iy", name = "azd", descriptor = "(Lclient!yp;B)V")
	static void method28072(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!iy", name = "<init>", descriptor = "(I)V")
	Class353(@OriginalArg(0) int arg0) {
		this.anInt4262 = arg0 * 485777809;
	}

	@OriginalMember(owner = "client!iy", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt4262 * 1662680945;
	}

	@OriginalMember(owner = "client!iy", name = "f", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt4262 * 1662680945;
	}

	@OriginalMember(owner = "client!iy", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt4262 * 1662680945;
	}
}
