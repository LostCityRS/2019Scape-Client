package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aec")
public class Class98_Sub1 extends Class98 implements Interface16 {

	@OriginalMember(owner = "client!aec", name = "<init>", descriptor = "(Lclient!afa;I[BIZ)V", line = 6)
	Class98_Sub1(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aec", name = "e", descriptor = "()I", line = 10)
	@Override
	public int method2567() {
		return this.anInt444;
	}

	@OriginalMember(owner = "client!aec", name = "k", descriptor = "()I", line = 10)
	@Override
	public int method2562() {
		return this.anInt444;
	}

	@OriginalMember(owner = "client!aec", name = "f", descriptor = "()I", line = 10)
	@Override
	public int method2558() {
		return this.anInt444;
	}

	@OriginalMember(owner = "client!aec", name = "n", descriptor = "()J", line = 14)
	@Override
	public long method2559() {
		return 0L;
	}

	@OriginalMember(owner = "client!aec", name = "l", descriptor = "()J", line = 14)
	@Override
	public long method2564() {
		return 0L;
	}

	@OriginalMember(owner = "client!aec", name = "w", descriptor = "()J", line = 14)
	@Override
	public long method2563() {
		return 0L;
	}

	@OriginalMember(owner = "client!aec", name = "v", descriptor = "()V", line = 18)
	@Override
	void method2750() {
		this.aClass104_Sub1_23.method3853(this);
	}

	@OriginalMember(owner = "client!aec", name = "d", descriptor = "()V", line = 18)
	@Override
	void method2752() {
		this.aClass104_Sub1_23.method3853(this);
	}

	@OriginalMember(owner = "client!aec", name = "r", descriptor = "()V", line = 18)
	@Override
	void method2751() {
		this.aClass104_Sub1_23.method3853(this);
	}

	@OriginalMember(owner = "client!aec", name = "u", descriptor = "(I[BI)V", line = 22)
	@Override
	public void method2565(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2748(arg1, arg2);
	}

	@OriginalMember(owner = "client!aec", name = "m", descriptor = "(I[BI)V", line = 22)
	@Override
	public void method2561(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2748(arg1, arg2);
	}

	@OriginalMember(owner = "client!aec", name = "z", descriptor = "(I[BI)V", line = 22)
	@Override
	public void method2560(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2748(arg1, arg2);
	}

	@OriginalMember(owner = "client!aec", name = "p", descriptor = "(I[BI)V", line = 22)
	@Override
	public void method2566(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2748(arg1, arg2);
	}
}
