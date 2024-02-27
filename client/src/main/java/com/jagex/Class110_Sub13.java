package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agj")
public final class Class110_Sub13 extends Class110 {

	@OriginalMember(owner = "client!agj", name = "n", descriptor = "I")
	final int anInt951;

	@OriginalMember(owner = "client!agj", name = "d", descriptor = "(II)I")
	public static int method8035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class93_Sub1_Sub15 local5 = (Class93_Sub1_Sub15) Class329.aClass16_29.method215((long) arg0);
		if (local5 == null) {
			return -1;
		} else if (local5.aClass93_Sub1_67 == Class329.aClass18_15.aClass93_Sub1_4) {
			return -1;
		} else {
			return -565994431 * ((Class93_Sub1_Sub15) local5.aClass93_Sub1_67).anInt3090;
		}
	}

	@OriginalMember(owner = "client!agj", name = "ab", descriptor = "(Lclient!yf;I)V")
	static void method8036(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class16 local11 = arg0.aClass93_Sub1_Sub13_1.aClass16Array1[arg0.anIntArray522[arg0.anInt6050 * -709694321]];
		@Pc(28) Class93_Sub14 local28 = (Class93_Sub14) local11.method215((long) arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091]);
		if (local28 != null) {
			arg0.anInt6050 += local28.anInt1526 * -1980026331;
		}
	}

	@OriginalMember(owner = "client!agj", name = "<init>", descriptor = "(Lclient!alw;)V")
	Class110_Sub13(@OriginalArg(0) Class93_Sub41 arg0) {
		super(arg0);
		this.anInt951 = arg0.method22427(-1434290800) * -1963170323;
	}

	@OriginalMember(owner = "client!agj", name = "n", descriptor = "(I)V")
	@Override
	public void method20150(@OriginalArg(0) int arg0) {
		Class249.aClass239Array1[this.anInt951 * 121749477].method25898((byte) -15);
	}

	@OriginalMember(owner = "client!agj", name = "f", descriptor = "()V")
	@Override
	public void method20152() {
		Class249.aClass239Array1[this.anInt951 * 121749477].method25898((byte) -57);
	}
}
