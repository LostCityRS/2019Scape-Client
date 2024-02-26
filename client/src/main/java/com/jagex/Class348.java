package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.File;
import java.io.IOException;

@OriginalClass("client!it")
public final class Class348 implements Interface75 {

	@OriginalMember(owner = "client!it", name = "j", descriptor = "Ljava/lang/String;")
	static String aString192;

	@OriginalMember(owner = "client!it", name = "t", descriptor = "Lclient!it;")
	static final Class348 aClass348_4 = new Class348(0);

	@OriginalMember(owner = "client!it", name = "f", descriptor = "Lclient!it;")
	static final Class348 aClass348_1 = new Class348(1);

	@OriginalMember(owner = "client!it", name = "e", descriptor = "Lclient!it;")
	static final Class348 aClass348_2 = new Class348(2);

	@OriginalMember(owner = "client!it", name = "u", descriptor = "Lclient!it;")
	static final Class348 aClass348_3 = new Class348(3);

	@OriginalMember(owner = "client!it", name = "l", descriptor = "I")
	final int anInt4253;

	@OriginalMember(owner = "client!it", name = "t", descriptor = "(I)[Lclient!kz;")
	public static Class392[] method27985(@OriginalArg(0) int arg0) {
		return new Class392[] { Class392.aClass392_11, Class392.aClass392_2, Class392.aClass392_3, Class392.aClass392_4, Class392.aClass392_5, Class392.aClass392_6, Class392.aClass392_1, Class392.aClass392_8, Class392.aClass392_7, Class392.aClass392_10, Class392.aClass392_9 };
	}

	@OriginalMember(owner = "client!it", name = "f", descriptor = "(B)I")
	public static int method27986(@OriginalArg(0) byte arg0) {
		return Class329.anInt4183 * -1388797475 - 1;
	}

	@OriginalMember(owner = "client!it", name = "t", descriptor = "(B)V")
	public static void method27987(@OriginalArg(0) byte arg0) throws RuntimeException {
		if (!Class531.aString220.startsWith("win")) {
			return;
		}
		Class354.method28073(1824898204);
		@Pc(7) Object local7 = null;
		@Pc(9) String local9 = Class355.aString195;
		@Pc(14) File local14 = new File(local9);
		if (!local14.isFile()) {
			throw new RuntimeException();
		}
		if (!local14.canRead()) {
			throw new RuntimeException();
		}
		if (Class145.aClass145_1 == Class355.aClass145_5) {
			throw new RuntimeException();
		}
		try {
			Class355.aProcess1 = (new ProcessBuilder(new String[] { local9 })).start();
			Class355.aClass145_5 = Class145.aClass145_1;
		} catch (@Pc(50) IOException local50) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!it", name = "ep", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method27988(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (!local13.equals(arg0.aString183)) {
			arg0.aString183 = local13;
			Class296.method26998(arg0, 1161377607);
		}
		if (arg0.anInt4094 * 2071556223 == -1 && !arg1.aBoolean794) {
			Class245.method26323(arg0.anInt4087 * -2053489901, -1563187067);
		}
	}

	@OriginalMember(owner = "client!it", name = "gx", descriptor = "(Lclient!yp;I)V")
	static void method27989(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 1994755526);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class364.method28215(local16, local22, arg0, (byte) 1);
	}

	@OriginalMember(owner = "client!it", name = "axg", descriptor = "(Lclient!yp;I)V")
	static void method27990(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!it", name = "l", descriptor = "(IB)V")
	static void method27991(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class243 local2 = Class430.aClass243_81;
		synchronized (Class430.aClass243_81) {
			Class430.aClass243_81.method26247(arg0, (byte) 71);
		}
	}

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(I)V")
	Class348(@OriginalArg(0) int arg0) {
		this.anInt4253 = arg0 * -126951857;
	}

	@OriginalMember(owner = "client!it", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt4253 * 78608559;
	}

	@OriginalMember(owner = "client!it", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt4253 * 78608559;
	}

	@OriginalMember(owner = "client!it", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt4253 * 78608559;
	}
}
