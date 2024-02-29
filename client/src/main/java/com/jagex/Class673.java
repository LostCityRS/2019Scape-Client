package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xw")
public class Class673 {

	@OriginalMember(owner = "client!xw", name = "p", descriptor = "I")
	int anInt5863;

	@OriginalMember(owner = "client!xw", name = "n", descriptor = "I")
	int anInt5864;

	@OriginalMember(owner = "client!xw", name = "m", descriptor = "I")
	int anInt5865;

	@OriginalMember(owner = "client!xw", name = "k", descriptor = "I")
	int anInt5866;

	@OriginalMember(owner = "client!xw", name = "f", descriptor = "I")
	int anInt5867;

	@OriginalMember(owner = "client!xw", name = "d", descriptor = "I")
	int anInt5868;

	@OriginalMember(owner = "client!xw", name = "l", descriptor = "I")
	int anInt5869;

	@OriginalMember(owner = "client!xw", name = "e", descriptor = "I")
	int anInt5870;

	@OriginalMember(owner = "client!xw", name = "z", descriptor = "I")
	int anInt5871;

	@OriginalMember(owner = "client!xw", name = "c", descriptor = "I")
	int anInt5872;

	@OriginalMember(owner = "client!xw", name = "w", descriptor = "I")
	int anInt5873;

	@OriginalMember(owner = "client!xw", name = "u", descriptor = "I")
	int anInt5874;

	@OriginalMember(owner = "client!xw", name = "<init>", descriptor = "()V", line = 246)
	Class673() {
	}

	@OriginalMember(owner = "client!xw", name = "m", descriptor = "(Lclient!xw;)Z", line = 249)
	boolean method33085(@OriginalArg(0) Class673 arg0) {
		return arg0.anInt5863 * 976933385 == this.anInt5863 * 976933385 && this.anInt5868 * -29624619 == arg0.anInt5868 * -29624619 && arg0.anInt5872 * 667123649 == this.anInt5872 * 667123649;
	}

	@OriginalMember(owner = "client!xw", name = "e", descriptor = "(Lclient!xw;I)Z", line = 249)
	boolean method33086(@OriginalArg(0) Class673 arg0, @OriginalArg(1) int arg1) {
		return arg0.anInt5863 * 976933385 == this.anInt5863 * 976933385 && this.anInt5868 * -29624619 == arg0.anInt5868 * -29624619 && arg0.anInt5872 * 667123649 == this.anInt5872 * 667123649;
	}

	@OriginalMember(owner = "client!xw", name = "k", descriptor = "(Lclient!xw;)Z", line = 249)
	boolean method33087(@OriginalArg(0) Class673 arg0) {
		return arg0.anInt5863 * 976933385 == this.anInt5863 * 976933385 && this.anInt5868 * -29624619 == arg0.anInt5868 * -29624619 && arg0.anInt5872 * 667123649 == this.anInt5872 * 667123649;
	}

	@OriginalMember(owner = "client!xw", name = "n", descriptor = "(Lclient!xw;)Z", line = 249)
	boolean method33088(@OriginalArg(0) Class673 arg0) {
		return arg0.anInt5863 * 976933385 == this.anInt5863 * 976933385 && this.anInt5868 * -29624619 == arg0.anInt5868 * -29624619 && arg0.anInt5872 * 667123649 == this.anInt5872 * 667123649;
	}

	@OriginalMember(owner = "client!xw", name = "v", descriptor = "(IB)V", line = 506)
	public static void method33089(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class240 local2 = Class658.aClass240_91;
		synchronized (Class658.aClass240_91) {
			Class658.aClass240_91.method25843(arg0, (byte) -22);
		}
		local2 = Class658.aClass240_92;
		synchronized (Class658.aClass240_92) {
			Class658.aClass240_92.method25843(arg0, (byte) 13);
		}
	}
}
