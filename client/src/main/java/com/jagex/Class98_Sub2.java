package com.jagex;

import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aex")
public final class Class98_Sub2 extends Class98 implements Interface14 {

	@OriginalMember(owner = "client!aex", name = "p", descriptor = "I")
	int anInt445;

	@OriginalMember(owner = "client!aex", name = "<init>", descriptor = "(Lclient!afa;ILclient!jaclib/memory/Buffer;IZ)V")
	Class98_Sub2(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt445 = arg1;
	}

	@OriginalMember(owner = "client!aex", name = "<init>", descriptor = "(Lclient!afa;I[BIZ)V")
	Class98_Sub2(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt445 = arg1;
	}

	@OriginalMember(owner = "client!aex", name = "n", descriptor = "()I")
	@Override
	public int method2788() {
		return this.anInt445;
	}

	@OriginalMember(owner = "client!aex", name = "e", descriptor = "()I")
	@Override
	public int method2787() {
		return this.anInt444;
	}

	@OriginalMember(owner = "client!aex", name = "m", descriptor = "()J")
	@Override
	public long method2781() {
		return 0L;
	}

	@OriginalMember(owner = "client!aex", name = "d", descriptor = "()V")
	@Override
	void method2752() {
		this.aClass104_Sub1_23.method3869(this);
	}

	@OriginalMember(owner = "client!aex", name = "k", descriptor = "(I[BI)V")
	@Override
	public void method2779(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2750(arg1, arg2);
		this.anInt445 = arg0;
	}

	@OriginalMember(owner = "client!aex", name = "f", descriptor = "()I")
	@Override
	public int method2783() {
		return this.anInt444;
	}

	@OriginalMember(owner = "client!aex", name = "w", descriptor = "()I")
	@Override
	public int method2784() {
		return this.anInt444;
	}

	@OriginalMember(owner = "client!aex", name = "l", descriptor = "()I")
	@Override
	public int method2785() {
		return this.anInt444;
	}

	@OriginalMember(owner = "client!aex", name = "u", descriptor = "()J")
	@Override
	public long method2782() {
		return 0L;
	}

	@OriginalMember(owner = "client!aex", name = "r", descriptor = "()V")
	@Override
	void method2751() {
		this.aClass104_Sub1_23.method3869(this);
	}

	@OriginalMember(owner = "client!aex", name = "p", descriptor = "()I")
	@Override
	public int method2780() {
		return this.anInt445;
	}

	@OriginalMember(owner = "client!aex", name = "z", descriptor = "(I[BI)V")
	@Override
	public void method2786(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2750(arg1, arg2);
		this.anInt445 = arg0;
	}

	@OriginalMember(owner = "client!aex", name = "v", descriptor = "()V")
	@Override
	void method2749() {
		this.aClass104_Sub1_23.method3869(this);
	}
}
