package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public abstract class Class108 {

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "Lclient!ed;")
	public static Class104 aClass104_22;

	@OriginalMember(owner = "client!dh", name = "ava", descriptor = "(Lclient!yp;I)V")
	static void method24049(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!dh", name = "z", descriptor = "(Lclient!asa;I)V")
	static void method24050(@OriginalArg(0) Class80_Sub36_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) boolean local8 = arg0.method23362(-1402194033) == 1;
		if (!local8) {
			return;
		}
		@Pc(12) boolean local12 = false;
		@Pc(18) int local18 = arg0.method22570((short) 23736) << 24;
		@Pc(26) int local26 = local18 | arg0.method22570((short) 30019) << 16;
		@Pc(34) int local34 = local26 | arg0.method22570((short) 22694) << 8;
		@Pc(40) int local40 = local34 | arg0.method22570((short) 26614);
		Class587.aClass474_1.method29865(Class325.aLong368 * -5160113214587875779L, local40, 1497521237);
	}

	@OriginalMember(owner = "client!dh", name = "akh", descriptor = "(Lclient!yp;S)V")
	static void method24051(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		Class143.method11841(local12, -466310010);
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
	Class108() {
	}

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "()I")
	public abstract int method24035();

	@OriginalMember(owner = "client!dh", name = "t", descriptor = "()I")
	public abstract int method24036();

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "()I")
	public abstract int method24037();

	@OriginalMember(owner = "client!dh", name = "x", descriptor = "()V")
	public abstract void method24038();

	@OriginalMember(owner = "client!dh", name = "u", descriptor = "()Z")
	abstract boolean method24039();

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "()Z")
	abstract boolean method24040();

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "()I")
	public abstract int method24041();

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "()I")
	public abstract int method24042();

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "()I")
	public abstract int method24043();

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "()Z")
	abstract boolean method24044();

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "()Z")
	abstract boolean method24045();

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "()V")
	public abstract void method24046();

	@OriginalMember(owner = "client!dh", name = "s", descriptor = "()Z")
	abstract boolean method24047();

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "()Z")
	abstract boolean method24048();
}
