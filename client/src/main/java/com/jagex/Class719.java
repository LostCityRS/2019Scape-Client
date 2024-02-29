package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!zv")
public class Class719 {

	@OriginalMember(owner = "client!zv", name = "<init>", descriptor = "()V", line = 6)
	Class719() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!zv", name = "k", descriptor = "(Lclient!yu;Lclient!ze;I)I", line = 11)
	public static int method36902(@OriginalArg(0) Class693 arg0, @OriginalArg(1) Class703 arg1, @OriginalArg(2) int arg2) {
		return Class693.aClass693_8 == arg0 ? 43594 : arg2 + 40000;
	}

	@OriginalMember(owner = "client!zv", name = "f", descriptor = "(Lclient!yu;Lclient!ze;I)I", line = 11)
	public static int method36903(@OriginalArg(0) Class693 arg0, @OriginalArg(1) Class703 arg1, @OriginalArg(2) int arg2) {
		return Class693.aClass693_8 == arg0 ? 43594 : arg2 + 40000;
	}

	@OriginalMember(owner = "client!zv", name = "e", descriptor = "(B)[Lclient!hp;", line = 14)
	static Class319[] method36904(@OriginalArg(0) byte arg0) {
		return new Class319[] { Class319.aClass319_2, Class319.aClass319_3, Class319.aClass319_1 };
	}

	@OriginalMember(owner = "client!zv", name = "w", descriptor = "(Lclient!yu;Lclient!ze;I)I", line = 16)
	public static int method36905(@OriginalArg(0) Class693 arg0, @OriginalArg(1) Class703 arg1, @OriginalArg(2) int arg2) {
		return arg0 == Class693.aClass693_8 ? 443 : arg2 + 50000;
	}

	@OriginalMember(owner = "client!zv", name = "l", descriptor = "(Lclient!yu;Lclient!ze;I)I", line = 21)
	public static int method36906(@OriginalArg(0) Class693 arg0, @OriginalArg(1) Class703 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == Class693.aClass693_8) {
			return 80;
		} else if (Class703.aClass703_2 == arg1) {
			return arg2 + 12000;
		} else {
			return arg2 + 7000;
		}
	}
}
