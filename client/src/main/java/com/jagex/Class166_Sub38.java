package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anp")
public final class Class166_Sub38 extends Class166 {

	@OriginalMember(owner = "client!anp", name = "m", descriptor = "(Lclient!alw;[Lclient!qw;I)[Ljava/lang/Object;")
	public static Object[] method16338(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class519[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0.method22644((byte) -70);
		@Pc(9) Object[] local9 = new Object[local3 * arg1.length];
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			for (@Pc(16) int local16 = 0; local16 < arg1.length; local16++) {
				@Pc(27) int local27 = local11 * arg1.length + local16;
				local9[local27] = arg1[local16].aClass500_7.method30337(arg0, (byte) 0);
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!anp", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub38(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anp", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub38(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anp", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!anp", name = "o", descriptor = "(I)V")
	public void method16332(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!anp", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anp", name = "n", descriptor = "(II)I")
	@Override
	int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!anp", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 0;
	}

	@OriginalMember(owner = "client!anp", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anp", name = "p", descriptor = "(I)I")
	@Override
	int method16552(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anp", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 0;
	}

	@OriginalMember(owner = "client!anp", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 0;
	}

	@OriginalMember(owner = "client!anp", name = "z", descriptor = "(I)I")
	@Override
	int method16561(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anp", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 0;
	}

	@OriginalMember(owner = "client!anp", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anp", name = "s", descriptor = "(I)I")
	public int method16333(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anp", name = "y", descriptor = "()V")
	public void method16334() {
	}

	@OriginalMember(owner = "client!anp", name = "q", descriptor = "()V")
	public void method16335() {
	}

	@OriginalMember(owner = "client!anp", name = "x", descriptor = "()I")
	public int method16336() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anp", name = "b", descriptor = "()I")
	public int method16337() {
		return this.anInt2379 * 960141055;
	}
}
