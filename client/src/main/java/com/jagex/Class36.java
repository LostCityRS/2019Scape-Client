package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!abi")
public class Class36 implements Interface75 {

	@OriginalMember(owner = "client!abi", name = "vc", descriptor = "I")
	public static int anInt117;

	@OriginalMember(owner = "client!abi", name = "kz", descriptor = "Lclient!alw;")
	public static Class93_Sub41 aClass93_Sub41_1;

	@OriginalMember(owner = "client!abi", name = "e", descriptor = "Lclient!abi;")
	public static final Class36 aClass36_1 = new Class36(0, 0);

	@OriginalMember(owner = "client!abi", name = "n", descriptor = "Lclient!abi;")
	public static final Class36 aClass36_2 = new Class36(3, 1);

	@OriginalMember(owner = "client!abi", name = "m", descriptor = "Lclient!abi;")
	public static final Class36 aClass36_3 = new Class36(2, 2);

	@OriginalMember(owner = "client!abi", name = "k", descriptor = "Lclient!abi;")
	public static final Class36 aClass36_4 = new Class36(1, 3);

	@OriginalMember(owner = "client!abi", name = "f", descriptor = "I")
	public final int anInt115;

	@OriginalMember(owner = "client!abi", name = "w", descriptor = "I")
	final int anInt116;

	@OriginalMember(owner = "client!abi", name = "<init>", descriptor = "(II)V", line = 15)
	Class36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt115 = arg0 * 1491313767;
		this.anInt116 = arg1 * -1897340771;
	}

	@OriginalMember(owner = "client!abi", name = "n", descriptor = "()I", line = 21)
	@Override
	public int method36920() {
		return this.anInt116 * 1487185333;
	}

	@OriginalMember(owner = "client!abi", name = "k", descriptor = "()I", line = 21)
	@Override
	public int method36919() {
		return this.anInt116 * 1487185333;
	}

	@OriginalMember(owner = "client!abi", name = "v", descriptor = "(CI)Z", line = 182)
	public static boolean method693(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
