package com.jagex;

import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aey")
public class Class101_Sub2 extends Class101 implements Interface14 {

	@OriginalMember(owner = "client!aey", name = "m", descriptor = "I")
	int anInt446;

	@OriginalMember(owner = "client!aey", name = "<init>", descriptor = "(Lclient!afa;I[BI)V", line = 10)
	Class101_Sub2(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt446 = arg1;
	}

	@OriginalMember(owner = "client!aey", name = "<init>", descriptor = "(Lclient!afa;ILclient!jaclib/memory/Buffer;)V", line = 15)
	Class101_Sub2(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt446 = arg1;
	}

	@OriginalMember(owner = "client!aey", name = "w", descriptor = "()I", line = 20)
	@Override
	public int method2784() {
		return 0;
	}

	@OriginalMember(owner = "client!aey", name = "e", descriptor = "()I", line = 20)
	@Override
	public int method2787() {
		return 0;
	}

	@OriginalMember(owner = "client!aey", name = "f", descriptor = "()I", line = 20)
	@Override
	public int method2783() {
		return 0;
	}

	@OriginalMember(owner = "client!aey", name = "l", descriptor = "()I", line = 20)
	@Override
	public int method2785() {
		return 0;
	}

	@OriginalMember(owner = "client!aey", name = "n", descriptor = "()I", line = 24)
	@Override
	public int method2788() {
		return this.anInt446;
	}

	@OriginalMember(owner = "client!aey", name = "p", descriptor = "()I", line = 24)
	@Override
	public int method2780() {
		return this.anInt446;
	}

	@OriginalMember(owner = "client!aey", name = "m", descriptor = "()J", line = 28)
	@Override
	public long method2781() {
		return this.aBuffer3.n();
	}

	@OriginalMember(owner = "client!aey", name = "u", descriptor = "()J", line = 28)
	@Override
	public long method2782() {
		return this.aBuffer3.n();
	}

	@OriginalMember(owner = "client!aey", name = "k", descriptor = "(I[BI)V", line = 32)
	@Override
	public void method2779(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2774(arg1, arg2);
		this.anInt446 = arg0;
	}

	@OriginalMember(owner = "client!aey", name = "z", descriptor = "(I[BI)V", line = 32)
	@Override
	public void method2786(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2774(arg1, arg2);
		this.anInt446 = arg0;
	}
}
