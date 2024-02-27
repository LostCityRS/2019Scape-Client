package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

@OriginalClass("client!zj")
public final class Class708 implements Interface75 {

	@OriginalMember(owner = "client!zj", name = "fo", descriptor = "Lclient!pf;")
	public static Class480 aClass480_136;

	@OriginalMember(owner = "client!zj", name = "t", descriptor = "Lclient!zj;")
	static final Class708 aClass708_2 = new Class708(-1);

	@OriginalMember(owner = "client!zj", name = "f", descriptor = "Lclient!zj;")
	public static final Class708 aClass708_3 = new Class708(-2);

	@OriginalMember(owner = "client!zj", name = "e", descriptor = "Lclient!zj;")
	public static final Class708 aClass708_4 = new Class708(-3);

	@OriginalMember(owner = "client!zj", name = "u", descriptor = "Lclient!zj;")
	static final Class708 aClass708_5 = new Class708(-4);

	@OriginalMember(owner = "client!zj", name = "l", descriptor = "Lclient!zj;")
	public static final Class708 aClass708_6 = new Class708(-5);

	@OriginalMember(owner = "client!zj", name = "g", descriptor = "Lclient!zj;")
	public static final Class708 aClass708_10 = new Class708(2);

	@OriginalMember(owner = "client!zj", name = "i", descriptor = "Lclient!zj;")
	static final Class708 aClass708_8 = new Class708(3);

	@OriginalMember(owner = "client!zj", name = "m", descriptor = "Lclient!zj;")
	static final Class708 aClass708_9 = new Class708(7);

	@OriginalMember(owner = "client!zj", name = "o", descriptor = "Lclient!zj;")
	static final Class708 aClass708_7 = new Class708(9);

	@OriginalMember(owner = "client!zj", name = "j", descriptor = "Lclient!zj;")
	static final Class708 aClass708_11 = new Class708(37);

	@OriginalMember(owner = "client!zj", name = "a", descriptor = "I")
	final int anInt5819;

	@OriginalMember(owner = "client!zj", name = "e", descriptor = "()[Lclient!zj;")
	public static Class708[] method37147() {
		return new Class708[] { aClass708_4, aClass708_11, aClass708_9, aClass708_2, aClass708_5, aClass708_3, aClass708_7, aClass708_10, aClass708_8, aClass708_6 };
	}

	@OriginalMember(owner = "client!zj", name = "afo", descriptor = "(Lclient!yp;I)V")
	static void method37148(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = ~local12;
	}

	@OriginalMember(owner = "client!zj", name = "e", descriptor = "(Lclient!aam;Ljava/awt/Frame;I)V")
	public static void method37149(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Frame arg1, @OriginalArg(2) int arg2) {
		arg0.method360((short) 255);
		arg1.setVisible(false);
		arg1.dispose();
	}

	@OriginalMember(owner = "client!zj", name = "mg", descriptor = "(Lclient!yp;I)V")
	static void method37150(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class695.method37033(local11, local14, arg0, -1808734827);
	}

	@OriginalMember(owner = "client!zj", name = "jq", descriptor = "(Lclient!yp;I)V")
	static void method37151(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
	}

	@OriginalMember(owner = "client!zj", name = "<init>", descriptor = "(I)V")
	Class708(@OriginalArg(0) int arg0) {
		this.anInt5819 = arg0 * 391345313;
	}

	@OriginalMember(owner = "client!zj", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt5819 * 1752133473;
	}

	@OriginalMember(owner = "client!zj", name = "f", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt5819 * 1752133473;
	}

	@OriginalMember(owner = "client!zj", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt5819 * 1752133473;
	}
}
