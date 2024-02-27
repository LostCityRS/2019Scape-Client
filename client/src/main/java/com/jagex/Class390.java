package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class390 {

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "Lclient!kv;")
	static final Class390 aClass390_13 = new Class390();

	@OriginalMember(owner = "client!kv", name = "n", descriptor = "Lclient!kv;")
	static final Class390 aClass390_11 = new Class390();

	@OriginalMember(owner = "client!kv", name = "m", descriptor = "Lclient!kv;")
	static final Class390 aClass390_12 = new Class390();

	@OriginalMember(owner = "client!kv", name = "m", descriptor = "()[Lclient!kv;")
	public static Class390[] method28455() {
		return new Class390[] { aClass390_13, aClass390_11, aClass390_12 };
	}

	@OriginalMember(owner = "client!kv", name = "os", descriptor = "(Lclient!yf;I)V")
	static void method28457(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1566203425);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class166_Sub17.method15730(local16, local22, arg0, 1052532299);
	}

	@OriginalMember(owner = "client!kv", name = "us", descriptor = "(Lclient!yf;I)V")
	static void method28458(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1488217971);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local16.anInt4042 * 1553054515 == 1 ? local16.anInt4078 * 371778301 : -1;
	}

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "()V")
	Class390() {
	}

	@OriginalMember(owner = "client!kv", name = "n", descriptor = "(III)I")
	public int method28454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = Class553.anInt3408 * -1378711501 > arg1 ? Class553.anInt3408 * -1378711501 : arg1;
		if (aClass390_13 == this) {
			return 0;
		} else if (aClass390_12 == this) {
			return local10 - arg0;
		} else if (aClass390_11 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "(II)I")
	public int method28456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = Class553.anInt3408 * -1378711501 > arg1 ? Class553.anInt3408 * -1378711501 : arg1;
		if (aClass390_13 == this) {
			return 0;
		} else if (aClass390_12 == this) {
			return local10 - arg0;
		} else if (aClass390_11 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}
}
