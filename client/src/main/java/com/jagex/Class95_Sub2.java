package com.jagex;

import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aev")
public final class Class95_Sub2 extends Class95 implements Interface14 {

	@OriginalMember(owner = "client!aev", name = "j", descriptor = "I")
	int anInt409;

	@OriginalMember(owner = "client!aev", name = "<init>", descriptor = "(Lclient!afm;ILclient!jaclib/memory/Buffer;IZ)V")
	Class95_Sub2(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt409 = arg1;
	}

	@OriginalMember(owner = "client!aev", name = "<init>", descriptor = "(Lclient!afm;I[BIZ)V")
	Class95_Sub2(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt409 = arg1;
	}

	@OriginalMember(owner = "client!aev", name = "h", descriptor = "()V")
	@Override
	void method2748() {
		this.aClass102_Sub3_22.method6377(this);
	}

	@OriginalMember(owner = "client!aev", name = "t", descriptor = "()I")
	@Override
	public int method2758() {
		return this.anInt405;
	}

	@OriginalMember(owner = "client!aev", name = "f", descriptor = "()I")
	@Override
	public int method2752() {
		return this.anInt409;
	}

	@OriginalMember(owner = "client!aev", name = "e", descriptor = "()J")
	@Override
	public long method2753() {
		return 0L;
	}

	@OriginalMember(owner = "client!aev", name = "q", descriptor = "()V")
	@Override
	void method2749() {
		this.aClass102_Sub3_22.method6377(this);
	}

	@OriginalMember(owner = "client!aev", name = "u", descriptor = "(I[BI)V")
	@Override
	public void method2754(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2743(arg1, arg2);
		this.anInt409 = arg0;
	}

	@OriginalMember(owner = "client!aev", name = "x", descriptor = "()V")
	@Override
	void method2742() {
		this.aClass102_Sub3_22.method6377(this);
	}

	@OriginalMember(owner = "client!aev", name = "g", descriptor = "()I")
	@Override
	public int method2756() {
		return this.anInt405;
	}

	@OriginalMember(owner = "client!aev", name = "i", descriptor = "()I")
	@Override
	public int method2759() {
		return this.anInt405;
	}

	@OriginalMember(owner = "client!aev", name = "j", descriptor = "()J")
	@Override
	public long method2760() {
		return 0L;
	}

	@OriginalMember(owner = "client!aev", name = "o", descriptor = "()I")
	@Override
	public int method2763() {
		return this.anInt409;
	}

	@OriginalMember(owner = "client!aev", name = "k", descriptor = "(I[BI)V")
	@Override
	public void method2757(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2743(arg1, arg2);
		this.anInt409 = arg0;
	}

	@OriginalMember(owner = "client!aev", name = "a", descriptor = "()J")
	@Override
	public long method2761() {
		return 0L;
	}

	@OriginalMember(owner = "client!aev", name = "s", descriptor = "()J")
	@Override
	public long method2762() {
		return 0L;
	}

	@OriginalMember(owner = "client!aev", name = "m", descriptor = "()I")
	@Override
	public int method2751() {
		return this.anInt405;
	}

	@OriginalMember(owner = "client!aev", name = "r", descriptor = "()V")
	@Override
	void method2741() {
		this.aClass102_Sub3_22.method6377(this);
	}

	@OriginalMember(owner = "client!aev", name = "d", descriptor = "()V")
	@Override
	void method2747() {
		this.aClass102_Sub3_22.method6377(this);
	}

	@OriginalMember(owner = "client!aev", name = "l", descriptor = "()I")
	@Override
	public int method2755() {
		return this.anInt405;
	}
}
