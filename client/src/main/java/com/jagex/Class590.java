package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class590 {

	@OriginalMember(owner = "client!uc", name = "gn", descriptor = "Lclient!py;")
	public static Class497 aClass497_133;

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
	static int anInt5636 = 0;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "Lclient!ash;")
	public Class132_Sub1_Sub1 aClass132_Sub1_Sub1_1;

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "Lclient!uc;")
	public Class590 aClass590_2;

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "(Lclient!ash;)Lclient!uc;")
	static Class590 method31865(@OriginalArg(0) Class132_Sub1_Sub1 arg0) {
		@Pc(5) Class590 local5;
		if (Class650.aClass590_3 == null) {
			local5 = new Class590();
		} else {
			local5 = Class650.aClass590_3;
			Class650.aClass590_3 = Class650.aClass590_3.aClass590_2;
			local5.aClass590_2 = null;
			anInt5636 -= 879993487;
		}
		local5.aClass132_Sub1_Sub1_1 = arg0;
		return local5;
	}

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "(Lclient!ash;)Lclient!uc;")
	static Class590 method31866(@OriginalArg(0) Class132_Sub1_Sub1 arg0) {
		@Pc(5) Class590 local5;
		if (Class650.aClass590_3 == null) {
			local5 = new Class590();
		} else {
			local5 = Class650.aClass590_3;
			Class650.aClass590_3 = Class650.aClass590_3.aClass590_2;
			local5.aClass590_2 = null;
			anInt5636 -= 879993487;
		}
		local5.aClass132_Sub1_Sub1_1 = arg0;
		return local5;
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(Lclient!alw;I)Lclient!li;")
	public static Class398 method31871(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.method22448(-1000341262);
		return new Class398(local3);
	}

	@OriginalMember(owner = "client!uc", name = "akp", descriptor = "(Lclient!yf;I)V")
	static void method31872(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(33) Class18 local33 = Class159.method14510(local13 >> 14 & 0x3FFF, local13 & 0x3FFF);
		@Pc(35) boolean local35 = false;
		for (@Pc(40) Class93_Sub1_Sub20 local40 = (Class93_Sub1_Sub20) local33.method246(740548573); local40 != null; local40 = (Class93_Sub1_Sub20) local33.method253(1953368263)) {
			if (local40.anInt3168 * 937363209 == local23) {
				local35 = true;
				break;
			}
		}
		if (local35) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 1;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "(IIII)I")
	public static int method31873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 4095 - arg0;
		} else if (local3 == 2) {
			return 4095 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!uc", name = "avb", descriptor = "(Lclient!yf;I)V")
	static void method31874(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	Class590() {
	}

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "()V")
	void method31867() {
		if (anInt5636 * -242402193 < 500) {
			this.aClass132_Sub1_Sub1_1 = null;
			this.aClass590_2 = Class650.aClass590_3;
			Class650.aClass590_3 = this;
			anInt5636 += 879993487;
		}
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "()V")
	void method31868() {
		if (anInt5636 * -242402193 < 500) {
			this.aClass132_Sub1_Sub1_1 = null;
			this.aClass590_2 = Class650.aClass590_3;
			Class650.aClass590_3 = this;
			anInt5636 += 879993487;
		}
	}

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "(B)V")
	void method31869(@OriginalArg(0) byte arg0) {
		if (anInt5636 * -242402193 < 500) {
			this.aClass132_Sub1_Sub1_1 = null;
			this.aClass590_2 = Class650.aClass590_3;
			Class650.aClass590_3 = this;
			anInt5636 += 879993487;
		}
	}

	@OriginalMember(owner = "client!uc", name = "w", descriptor = "()V")
	void method31870() {
		if (anInt5636 * -242402193 < 500) {
			this.aClass132_Sub1_Sub1_1 = null;
			this.aClass590_2 = Class650.aClass590_3;
			Class650.aClass590_3 = this;
			anInt5636 += 879993487;
		}
	}
}
