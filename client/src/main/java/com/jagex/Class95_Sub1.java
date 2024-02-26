package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aeb")
public final class Class95_Sub1 extends Class95 implements Interface15 {

	@OriginalMember(owner = "client!aeb", name = "<init>", descriptor = "(Lclient!afm;I[BIZ)V")
	Class95_Sub1(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aeb", name = "i", descriptor = "(I[BI)V")
	@Override
	public void method2087(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2743(arg1, arg2);
	}

	@OriginalMember(owner = "client!aeb", name = "t", descriptor = "()I")
	@Override
	public int method2088() {
		return this.anInt405;
	}

	@OriginalMember(owner = "client!aeb", name = "f", descriptor = "()J")
	@Override
	public long method2093() {
		return 0L;
	}

	@OriginalMember(owner = "client!aeb", name = "d", descriptor = "()V")
	@Override
	void method2747() {
		this.aClass102_Sub3_22.method6435(this);
	}

	@OriginalMember(owner = "client!aeb", name = "e", descriptor = "(I[BI)V")
	@Override
	public void method2089(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2743(arg1, arg2);
	}

	@OriginalMember(owner = "client!aeb", name = "u", descriptor = "()I")
	@Override
	public int method2090() {
		return this.anInt405;
	}

	@OriginalMember(owner = "client!aeb", name = "l", descriptor = "()I")
	@Override
	public int method2091() {
		return this.anInt405;
	}

	@OriginalMember(owner = "client!aeb", name = "g", descriptor = "()J")
	@Override
	public long method2092() {
		return 0L;
	}

	@OriginalMember(owner = "client!aeb", name = "m", descriptor = "(I[BI)V")
	@Override
	public void method2094(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2743(arg1, arg2);
	}

	@OriginalMember(owner = "client!aeb", name = "r", descriptor = "()V")
	@Override
	void method2741() {
		this.aClass102_Sub3_22.method6435(this);
	}

	@OriginalMember(owner = "client!aeb", name = "q", descriptor = "()V")
	@Override
	void method2749() {
		this.aClass102_Sub3_22.method6435(this);
	}

	@OriginalMember(owner = "client!aeb", name = "h", descriptor = "()V")
	@Override
	void method2748() {
		this.aClass102_Sub3_22.method6435(this);
	}

	@OriginalMember(owner = "client!aeb", name = "x", descriptor = "()V")
	@Override
	void method2742() {
		this.aClass102_Sub3_22.method6435(this);
	}
}
