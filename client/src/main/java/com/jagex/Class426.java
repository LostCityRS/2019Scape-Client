package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class426 {

	@OriginalMember(owner = "client!mw", name = "e", descriptor = "Lclient!mw;")
	public static final Class426 aClass426_3 = new Class426();

	@OriginalMember(owner = "client!mw", name = "n", descriptor = "Lclient!mw;")
	public static final Class426 aClass426_2 = new Class426();

	@OriginalMember(owner = "client!mw", name = "ax", descriptor = "(Lclient!ou;Lclient!pq;IIB)V")
	static void method28932(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (Class454.aClass489_97 == null) {
			Class454.aClass489_97 = new Class489(arg1);
		} else {
			Class454.aClass489_97.method30018(arg1);
		}
		Class454.aClass470_53.method29545(arg0);
		Class454.anInt5212 = arg2 * 889524937;
		Class454.anInt5213 = arg3 * 1977693193;
	}

	@OriginalMember(owner = "client!mw", name = "asq", descriptor = "(Lclient!yf;B)V")
	static void method28933(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		if (local12 == -1) {
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_2, Class51.aClass93_Sub36_1.aClass166_Sub15_1.method15685(-1808076394), (byte) 5);
		} else {
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_2, local12, (byte) 47);
		}
		Class262.method26266(371080600);
	}

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "()V")
	Class426() {
	}
}
