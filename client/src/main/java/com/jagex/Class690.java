package com.jagex;

import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yp")
public final class Class690 {

	@OriginalMember(owner = "client!yp", name = "f", descriptor = "[Ljava/lang/Object;")
	Object[] anObjectArray45;

	@OriginalMember(owner = "client!yp", name = "ax", descriptor = "[I")
	int[] anIntArray526;

	@OriginalMember(owner = "client!yp", name = "d", descriptor = "Lclient!akv;")
	Class80_Sub32 aClass80_Sub32_4;

	@OriginalMember(owner = "client!yp", name = "z", descriptor = "Lclient!ahb;")
	Class120_Sub1_Sub1_Sub1 aClass120_Sub1_Sub1_Sub1_4;

	@OriginalMember(owner = "client!yp", name = "s", descriptor = "Z")
	boolean aBoolean988;

	@OriginalMember(owner = "client!yp", name = "h", descriptor = "Lclient!kf;")
	Class378 aClass378_3;

	@OriginalMember(owner = "client!yp", name = "t", descriptor = "[I")
	int[] anIntArray527;

	@OriginalMember(owner = "client!yp", name = "q", descriptor = "Lclient!nz;")
	Class453 aClass453_1;

	@OriginalMember(owner = "client!yp", name = "p", descriptor = "Lclient!sc;")
	Interface60 anInterface60_1;

	@OriginalMember(owner = "client!yp", name = "v", descriptor = "Lclient!auu;")
	Class120_Sub1_Sub5_Sub1 aClass120_Sub1_Sub5_Sub1_1;

	@OriginalMember(owner = "client!yp", name = "b", descriptor = "I")
	int anInt5779;

	@OriginalMember(owner = "client!yp", name = "ay", descriptor = "[Lclient!sp;")
	Class557[] aClass557Array2;

	@OriginalMember(owner = "client!yp", name = "aq", descriptor = "Lclient!asw;")
	Class80_Sub1_Sub20 aClass80_Sub1_Sub20_2;

	@OriginalMember(owner = "client!yp", name = "e", descriptor = "[J")
	long[] aLongArray28;

	@OriginalMember(owner = "client!yp", name = "u", descriptor = "[I")
	int[] anIntArray528 = new int[5];

	@OriginalMember(owner = "client!yp", name = "l", descriptor = "[[I")
	int[][] anIntArrayArray67 = new int[5][5000];

	@OriginalMember(owner = "client!yp", name = "g", descriptor = "[I")
	int[] anIntArray525 = new int[1000];

	@OriginalMember(owner = "client!yp", name = "i", descriptor = "I")
	int anInt5778 = 0;

	@OriginalMember(owner = "client!yp", name = "m", descriptor = "[Ljava/lang/Object;")
	Object[] anObjectArray46 = new Object[1000];

	@OriginalMember(owner = "client!yp", name = "o", descriptor = "I")
	int anInt5776 = 0;

	@OriginalMember(owner = "client!yp", name = "j", descriptor = "[J")
	long[] aLongArray27 = new long[1000];

	@OriginalMember(owner = "client!yp", name = "a", descriptor = "I")
	int anInt5777 = 0;

	@OriginalMember(owner = "client!yp", name = "k", descriptor = "I")
	int anInt5775 = 0;

	@OriginalMember(owner = "client!yp", name = "x", descriptor = "[Lclient!yg;")
	Class682[] aClass682Array1 = new Class682[50];

	@OriginalMember(owner = "client!yp", name = "w", descriptor = "Lclient!yq;")
	Class691 aClass691_2 = new Class691();

	@OriginalMember(owner = "client!yp", name = "r", descriptor = "Lclient!yq;")
	Class691 aClass691_1 = new Class691();

	@OriginalMember(owner = "client!yp", name = "y", descriptor = "Ljava/util/Map;")
	Map aMap23 = new HashMap();

	@OriginalMember(owner = "client!yp", name = "n", descriptor = "Ljava/util/Map;")
	Map aMap24 = new HashMap();

	@OriginalMember(owner = "client!yp", name = "c", descriptor = "I")
	int anInt5774 = 0;

	@OriginalMember(owner = "client!yp", name = "ai", descriptor = "I")
	int anInt5780 = 1216954807;

	@OriginalMember(owner = "client!yp", name = "ox", descriptor = "(Lclient!yp;I)V")
	static void method36958(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class704.method37125(local11, local14, arg0, -741613808);
	}

	@OriginalMember(owner = "client!yp", name = "bc", descriptor = "(III)Z")
	static boolean method36959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= 1000 && arg0 < 1000) {
			return true;
		} else if (arg1 >= 1000 || arg0 >= 1000) {
			return arg1 >= 1000 && arg0 >= 1000;
		} else if (Class304.method27125(arg0, 34166)) {
			return true;
		} else {
			return !Class304.method27125(arg1, 34166);
		}
	}

	@OriginalMember(owner = "client!yp", name = "<init>", descriptor = "()V")
	Class690() {
	}
}
