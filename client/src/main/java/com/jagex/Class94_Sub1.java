package com.jagex;

import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public final class Class94_Sub1 extends Class94 implements Interface14 {

	@OriginalMember(owner = "client!aea", name = "e", descriptor = "I")
	int anInt330;

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lclient!afm;I[BI)V")
	Class94_Sub1(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt330 = arg1;
	}

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lclient!afm;ILclient!jaclib/memory/Buffer;)V")
	Class94_Sub1(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt330 = arg1;
	}

	@OriginalMember(owner = "client!aea", name = "s", descriptor = "()J")
	@Override
	public long method2762() {
		return this.aBuffer3.f();
	}

	@OriginalMember(owner = "client!aea", name = "f", descriptor = "()I")
	@Override
	public int method2752() {
		return this.anInt330;
	}

	@OriginalMember(owner = "client!aea", name = "u", descriptor = "(I[BI)V")
	@Override
	public void method2754(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2086(arg1, arg2);
		this.anInt330 = arg0;
	}

	@OriginalMember(owner = "client!aea", name = "e", descriptor = "()J")
	@Override
	public long method2753() {
		return this.aBuffer3.f();
	}

	@OriginalMember(owner = "client!aea", name = "t", descriptor = "()I")
	@Override
	public int method2758() {
		return 0;
	}

	@OriginalMember(owner = "client!aea", name = "g", descriptor = "()I")
	@Override
	public int method2756() {
		return 0;
	}

	@OriginalMember(owner = "client!aea", name = "i", descriptor = "()I")
	@Override
	public int method2759() {
		return 0;
	}

	@OriginalMember(owner = "client!aea", name = "m", descriptor = "()I")
	@Override
	public int method2751() {
		return 0;
	}

	@OriginalMember(owner = "client!aea", name = "o", descriptor = "()I")
	@Override
	public int method2763() {
		return this.anInt330;
	}

	@OriginalMember(owner = "client!aea", name = "j", descriptor = "()J")
	@Override
	public long method2760() {
		return this.aBuffer3.f();
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "()J")
	@Override
	public long method2761() {
		return this.aBuffer3.f();
	}

	@OriginalMember(owner = "client!aea", name = "l", descriptor = "()I")
	@Override
	public int method2755() {
		return 0;
	}

	@OriginalMember(owner = "client!aea", name = "k", descriptor = "(I[BI)V")
	@Override
	public void method2757(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2086(arg1, arg2);
		this.anInt330 = arg0;
	}
}
