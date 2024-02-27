package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aeo")
public final class Class101_Sub1 extends Class101 implements Interface16 {

	@OriginalMember(owner = "client!aeo", name = "<init>", descriptor = "(Lclient!afa;I[BI)V")
	Class101_Sub1(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!aeo", name = "f", descriptor = "()I")
	@Override
	public int method2558() {
		return 0;
	}

	@OriginalMember(owner = "client!aeo", name = "e", descriptor = "()I")
	@Override
	public int method2567() {
		return 0;
	}

	@OriginalMember(owner = "client!aeo", name = "m", descriptor = "(I[BI)V")
	@Override
	public void method2561(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2774(arg1, arg2);
	}

	@OriginalMember(owner = "client!aeo", name = "k", descriptor = "()I")
	@Override
	public int method2562() {
		return 0;
	}

	@OriginalMember(owner = "client!aeo", name = "n", descriptor = "()J")
	@Override
	public long method2559() {
		return this.aBuffer3.method27896();
	}

	@OriginalMember(owner = "client!aeo", name = "w", descriptor = "()J")
	@Override
	public long method2563() {
		return this.aBuffer3.method27896();
	}

	@OriginalMember(owner = "client!aeo", name = "z", descriptor = "(I[BI)V")
	@Override
	public void method2560(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2774(arg1, arg2);
	}

	@OriginalMember(owner = "client!aeo", name = "l", descriptor = "()J")
	@Override
	public long method2564() {
		return this.aBuffer3.method27896();
	}

	@OriginalMember(owner = "client!aeo", name = "u", descriptor = "(I[BI)V")
	@Override
	public void method2565(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2774(arg1, arg2);
	}

	@OriginalMember(owner = "client!aeo", name = "p", descriptor = "(I[BI)V")
	@Override
	public void method2566(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2774(arg1, arg2);
	}
}
