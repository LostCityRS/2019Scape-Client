package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public class Class590 {

	@OriginalMember(owner = "client!uc", name = "gn", descriptor = "Lclient!py;")
	public static Class497 aClass497_133;

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
	static int anInt5475 = 0;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "Lclient!ash;")
	public Class132_Sub1_Sub1 aClass132_Sub1_Sub1_1;

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "Lclient!uc;")
	public Class590 aClass590_2;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V", line = 11)
	Class590() {
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(Lclient!alw;I)Lclient!li;", line = 13)
	public static Class398 method31684(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.method22542(-1000341262);
		return new Class398(local3);
	}

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "(Lclient!ash;)Lclient!uc;", line = 15)
	static Class590 method31685(@OriginalArg(0) Class132_Sub1_Sub1 arg0) {
		@Pc(5) Class590 local5;
		if (Class650.aClass590_3 == null) {
			local5 = new Class590();
		} else {
			local5 = Class650.aClass590_3;
			Class650.aClass590_3 = Class650.aClass590_3.aClass590_2;
			local5.aClass590_2 = null;
			anInt5475 -= 879993487;
		}
		local5.aClass132_Sub1_Sub1_1 = arg0;
		return local5;
	}

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "(Lclient!ash;)Lclient!uc;", line = 15)
	static Class590 method31686(@OriginalArg(0) Class132_Sub1_Sub1 arg0) {
		@Pc(5) Class590 local5;
		if (Class650.aClass590_3 == null) {
			local5 = new Class590();
		} else {
			local5 = Class650.aClass590_3;
			Class650.aClass590_3 = Class650.aClass590_3.aClass590_2;
			local5.aClass590_2 = null;
			anInt5475 -= 879993487;
		}
		local5.aClass132_Sub1_Sub1_1 = arg0;
		return local5;
	}

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "()V", line = 27)
	void method31687() {
		if (anInt5475 * -242402193 < 500) {
			this.aClass132_Sub1_Sub1_1 = null;
			this.aClass590_2 = Class650.aClass590_3;
			Class650.aClass590_3 = this;
			anInt5475 += 879993487;
		}
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "()V", line = 27)
	void method31688() {
		if (anInt5475 * -242402193 < 500) {
			this.aClass132_Sub1_Sub1_1 = null;
			this.aClass590_2 = Class650.aClass590_3;
			Class650.aClass590_3 = this;
			anInt5475 += 879993487;
		}
	}

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "(B)V", line = 27)
	void method31689(@OriginalArg(0) byte arg0) {
		if (anInt5475 * -242402193 < 500) {
			this.aClass132_Sub1_Sub1_1 = null;
			this.aClass590_2 = Class650.aClass590_3;
			Class650.aClass590_3 = this;
			anInt5475 += 879993487;
		}
	}

	@OriginalMember(owner = "client!uc", name = "w", descriptor = "()V", line = 27)
	void method31690() {
		if (anInt5475 * -242402193 < 500) {
			this.aClass132_Sub1_Sub1_1 = null;
			this.aClass590_2 = Class650.aClass590_3;
			Class650.aClass590_3 = this;
			anInt5475 += 879993487;
		}
	}

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "(IIII)I", line = 35)
	public static int method31691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
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

	@OriginalMember(owner = "client!uc", name = "akp", descriptor = "(Lclient!yf;I)V", line = 11600)
	static final void method31692(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) Class18 local33 = Class159.method14522(local13 >> 14 & 0x3FFF, local13 & 0x3FFF);
		@Pc(35) boolean local35 = false;
		for (@Pc(40) Class93_Sub1_Sub20 local40 = (Class93_Sub1_Sub20) local33.method256(740548573); local40 != null; local40 = (Class93_Sub1_Sub20) local33.method264(1953368263)) {
			if (local40.anInt3168 * 937363209 == local23) {
				local35 = true;
				break;
			}
		}
		if (local35) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 1;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!uc", name = "avb", descriptor = "(Lclient!yf;I)V", line = 13453)
	static final void method31693(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
