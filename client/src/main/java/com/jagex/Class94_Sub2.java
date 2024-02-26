package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aeh")
public final class Class94_Sub2 extends Class94 implements Interface15 {

	@OriginalMember(owner = "client!aeh", name = "<init>", descriptor = "(Lclient!afm;I[BI)V")
	Class94_Sub2(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!aeh", name = "g", descriptor = "()J")
	@Override
	public long method2092() {
		return this.aBuffer3.f();
	}

	@OriginalMember(owner = "client!aeh", name = "f", descriptor = "()J")
	@Override
	public long method2093() {
		return this.aBuffer3.f();
	}

	@OriginalMember(owner = "client!aeh", name = "e", descriptor = "(I[BI)V")
	@Override
	public void method2089(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2086(arg1, arg2);
	}

	@OriginalMember(owner = "client!aeh", name = "t", descriptor = "()I")
	@Override
	public int method2088() {
		return 0;
	}

	@OriginalMember(owner = "client!aeh", name = "l", descriptor = "()I")
	@Override
	public int method2091() {
		return 0;
	}

	@OriginalMember(owner = "client!aeh", name = "u", descriptor = "()I")
	@Override
	public int method2090() {
		return 0;
	}

	@OriginalMember(owner = "client!aeh", name = "i", descriptor = "(I[BI)V")
	@Override
	public void method2087(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2086(arg1, arg2);
	}

	@OriginalMember(owner = "client!aeh", name = "m", descriptor = "(I[BI)V")
	@Override
	public void method2094(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2086(arg1, arg2);
	}
}
