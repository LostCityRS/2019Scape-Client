package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vy")
public final class Class628 implements Interface75 {

	@OriginalMember(owner = "client!vy", name = "d", descriptor = "Lclient!ew;")
	static Interface23 anInterface23_10;

	@OriginalMember(owner = "client!vy", name = "t", descriptor = "Lclient!vy;")
	static final Class628 aClass628_3 = new Class628(0);

	@OriginalMember(owner = "client!vy", name = "f", descriptor = "Lclient!vy;")
	static final Class628 aClass628_4 = new Class628(1);

	@OriginalMember(owner = "client!vy", name = "e", descriptor = "Lclient!vy;")
	public static final Class628 aClass628_2 = new Class628(2);

	@OriginalMember(owner = "client!vy", name = "u", descriptor = "I")
	final int anInt5541;

	@OriginalMember(owner = "client!vy", name = "l", descriptor = "()[Lclient!vy;")
	static Class628[] method32548() {
		return new Class628[] { aClass628_3, aClass628_2, aClass628_4 };
	}

	@OriginalMember(owner = "client!vy", name = "e", descriptor = "()[Lclient!vy;")
	static Class628[] method32549() {
		return new Class628[] { aClass628_3, aClass628_2, aClass628_4 };
	}

	@OriginalMember(owner = "client!vy", name = "u", descriptor = "()[Lclient!vy;")
	static Class628[] method32550() {
		return new Class628[] { aClass628_3, aClass628_2, aClass628_4 };
	}

	@OriginalMember(owner = "client!vy", name = "t", descriptor = "(Lclient!xv;B)V")
	public static void method32551(@OriginalArg(0) Class671 arg0, @OriginalArg(1) byte arg1) {
		if (arg0.aClass427_3 == Class427.aClass427_2) {
			Class659.aClass138_6 = new Class138_Sub1(arg0);
		} else if (arg0.aClass427_3 == Class427.aClass427_1) {
			Class659.aClass138_6 = new Class138_Sub2(arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vy", name = "cd", descriptor = "(Lclient!yp;I)V")
	static void method32552(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2023540710);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class8.method314(local16, local22, arg0, 1353527554);
	}

	@OriginalMember(owner = "client!vy", name = "ara", descriptor = "(Lclient!yp;I)V")
	static void method32553(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub17_1, arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] == 1 ? 1 : 0, (byte) 96);
		Class719.method37291(1602510388);
		client.aBoolean714 = false;
	}

	@OriginalMember(owner = "client!vy", name = "bar", descriptor = "(Lclient!yp;I)V")
	static void method32554(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!vy", name = "dp", descriptor = "(Lclient!yp;I)V")
	static void method32555(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2122187071);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class483.method30027(local16, local22, arg0, 6410410);
	}

	@OriginalMember(owner = "client!vy", name = "asf", descriptor = "(Lclient!yp;I)V")
	static void method32556(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub9_1, arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] == 1 ? 1 : 0, (byte) 90);
		client.aClass539_1.method30938(97660207);
		Class719.method37291(827056212);
		client.aBoolean714 = false;
	}

	@OriginalMember(owner = "client!vy", name = "<init>", descriptor = "(I)V")
	Class628(@OriginalArg(0) int arg0) {
		this.anInt5541 = arg0 * 1629816657;
	}

	@OriginalMember(owner = "client!vy", name = "f", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt5541 * -200498767;
	}

	@OriginalMember(owner = "client!vy", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt5541 * -200498767;
	}

	@OriginalMember(owner = "client!vy", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt5541 * -200498767;
	}
}
