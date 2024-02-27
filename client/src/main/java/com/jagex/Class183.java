package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class183 implements Interface18 {

	@OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
	final int anInt3324;

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
	final int anInt3323;

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "[I")
	final int[] anIntArray293;

	@OriginalMember(owner = "client!bg", name = "yn", descriptor = "(Lclient!yp;B)V")
	static void method24698(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class597.focus ? 1 : 0;
	}

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "(II)Lclient!aaj;")
	public static Class11 method24699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class11[] local2 = Class122_Sub2.method10324(-948747253);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class11 local12 = local2[local4];
			if (local12.anInt42 * 468896967 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bg", name = "sa", descriptor = "(Lclient!yp;I)V")
	static void method24700(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.anInt4115 * -337000325;
	}

	@OriginalMember(owner = "client!bg", name = "afc", descriptor = "(Lclient!yp;B)V")
	static void method24701(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		@Pc(19) StringBuilder local19 = new StringBuilder(local13.length());
		@Pc(21) boolean local21 = false;
		for (@Pc(23) int local23 = 0; local23 < local13.length(); local23++) {
			@Pc(31) char local31 = local13.charAt(local23);
			if (local31 == '<') {
				local21 = true;
			} else if (local31 == '>') {
				local21 = false;
			} else if (!local21) {
				local19.append(local31);
			}
		}
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local19.toString();
	}

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(II[I)V")
	Class183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		this.anInt3324 = arg0 * -1603769433;
		this.anInt3323 = arg1 * -1863498501;
		this.anIntArray293 = arg2;
	}

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(II)V")
	Class183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this(arg0, arg1, new int[arg1 * arg0]);
	}

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "()V")
	@Override
	public void method30834() {
	}

	@OriginalMember(owner = "client!bg", name = "t", descriptor = "()I")
	@Override
	public int method30843() {
		return this.anInt3324 * -1842770921;
	}

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "()I")
	@Override
	public int method30838() {
		return this.anInt3323 * 85599795;
	}

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "()I")
	@Override
	public int method30842() {
		return this.anInt3323 * 85599795;
	}

	@OriginalMember(owner = "client!bg", name = "u", descriptor = "()I")
	@Override
	public int method30840() {
		return this.anInt3324 * -1842770921;
	}

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "()I")
	@Override
	public int method30841() {
		return this.anInt3324 * -1842770921;
	}

	@OriginalMember(owner = "client!bg", name = "o", descriptor = "()V")
	@Override
	public void method30836() {
	}

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "()V")
	@Override
	public void method30835() {
	}

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "()V")
	@Override
	public void method30837() {
	}

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "()I")
	@Override
	public int method30839() {
		return this.anInt3324 * -1842770921;
	}
}
