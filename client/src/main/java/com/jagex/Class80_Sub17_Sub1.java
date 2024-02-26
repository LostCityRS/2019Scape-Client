package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asm")
public final class Class80_Sub17_Sub1 extends Class80_Sub17 {

	@OriginalMember(owner = "client!asm", name = "s", descriptor = "[Lclient!asm;")
	static Class80_Sub17_Sub1[] aClass80_Sub17_Sub1Array1 = new Class80_Sub17_Sub1[0];

	@OriginalMember(owner = "client!asm", name = "d", descriptor = "I")
	int anInt3117;

	@OriginalMember(owner = "client!asm", name = "h", descriptor = "J")
	long aLong273;

	@OriginalMember(owner = "client!asm", name = "q", descriptor = "I")
	int anInt3118;

	@OriginalMember(owner = "client!asm", name = "x", descriptor = "I")
	int anInt3119;

	@OriginalMember(owner = "client!asm", name = "r", descriptor = "I")
	int anInt3120;

	@OriginalMember(owner = "client!asm", name = "ai", descriptor = "(IIIJI)Lclient!asm;")
	static Class80_Sub17_Sub1 method22883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class80_Sub17_Sub1[] local2 = aClass80_Sub17_Sub1Array1;
		synchronized (aClass80_Sub17_Sub1Array1) {
			@Pc(11) Class80_Sub17_Sub1 local11;
			if (Class693.anInt5783 * 550784815 == 0) {
				local11 = new Class80_Sub17_Sub1();
			} else {
				local11 = aClass80_Sub17_Sub1Array1[(Class693.anInt5783 -= -159033393) * 550784815];
			}
			local11.anInt3120 = arg0 * 1222583847;
			local11.anInt3118 = arg1 * -1059915661;
			local11.anInt3119 = arg2 * 578164905;
			local11.aLong273 = arg3 * -8754848232914932123L;
			local11.anInt3117 = arg4 * 342837035;
			return local11;
		}
	}

	@OriginalMember(owner = "client!asm", name = "<init>", descriptor = "()V")
	Class80_Sub17_Sub1() {
	}

	@OriginalMember(owner = "client!asm", name = "u", descriptor = "(B)I")
	@Override
	public int method23455(@OriginalArg(0) byte arg0) {
		return this.anInt3117 * -199147645;
	}

	@OriginalMember(owner = "client!asm", name = "l", descriptor = "(I)J")
	@Override
	public long method23456(@OriginalArg(0) int arg0) {
		return this.aLong273 * -5453770263417203859L;
	}

	@OriginalMember(owner = "client!asm", name = "e", descriptor = "(I)I")
	@Override
	public int method23454(@OriginalArg(0) int arg0) {
		return this.anInt3119 * 1593576345;
	}

	@OriginalMember(owner = "client!asm", name = "y", descriptor = "()I")
	@Override
	public int method23466() {
		return this.anInt3117 * -199147645;
	}

	@OriginalMember(owner = "client!asm", name = "f", descriptor = "(I)I")
	@Override
	public int method23451(@OriginalArg(0) int arg0) {
		return this.anInt3118 * -2053346117;
	}

	@OriginalMember(owner = "client!asm", name = "i", descriptor = "(I)V")
	@Override
	public void method23453(@OriginalArg(0) int arg0) {
		@Pc(2) Class80_Sub17_Sub1[] local2 = aClass80_Sub17_Sub1Array1;
		synchronized (aClass80_Sub17_Sub1Array1) {
			if (Class693.anInt5783 * 550784815 < Class483.anInt5003 * -637116961 - 1) {
				aClass80_Sub17_Sub1Array1[(Class693.anInt5783 += -159033393) * 550784815 - 1] = this;
			}
		}
	}

	@OriginalMember(owner = "client!asm", name = "v", descriptor = "()V")
	@Override
	public void method23465() {
		@Pc(2) Class80_Sub17_Sub1[] local2 = aClass80_Sub17_Sub1Array1;
		synchronized (aClass80_Sub17_Sub1Array1) {
			if (Class693.anInt5783 * 550784815 < Class483.anInt5003 * -637116961 - 1) {
				aClass80_Sub17_Sub1Array1[(Class693.anInt5783 += -159033393) * 550784815 - 1] = this;
			}
		}
	}

	@OriginalMember(owner = "client!asm", name = "m", descriptor = "()I")
	@Override
	public int method23458() {
		return this.anInt3120 * 1736567191;
	}

	@OriginalMember(owner = "client!asm", name = "o", descriptor = "()I")
	@Override
	public int method23461() {
		return this.anInt3120 * 1736567191;
	}

	@OriginalMember(owner = "client!asm", name = "j", descriptor = "()I")
	@Override
	public int method23457() {
		return this.anInt3118 * -2053346117;
	}

	@OriginalMember(owner = "client!asm", name = "a", descriptor = "()I")
	@Override
	public int method23460() {
		return this.anInt3119 * 1593576345;
	}

	@OriginalMember(owner = "client!asm", name = "x", descriptor = "()J")
	@Override
	public long method23462() {
		return this.aLong273 * -5453770263417203859L;
	}

	@OriginalMember(owner = "client!asm", name = "z", descriptor = "()J")
	@Override
	public long method23463() {
		return this.aLong273 * -5453770263417203859L;
	}

	@OriginalMember(owner = "client!asm", name = "p", descriptor = "()J")
	@Override
	public long method23464() {
		return this.aLong273 * -5453770263417203859L;
	}

	@OriginalMember(owner = "client!asm", name = "s", descriptor = "()J")
	@Override
	public long method23459() {
		return this.aLong273 * -5453770263417203859L;
	}

	@OriginalMember(owner = "client!asm", name = "t", descriptor = "(B)I")
	@Override
	public int method23452(@OriginalArg(0) byte arg0) {
		return this.anInt3120 * 1736567191;
	}
}
