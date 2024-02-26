package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aic")
public class Class137_Sub1 extends Class137 {

	@OriginalMember(owner = "client!aic", name = "k", descriptor = "I")
	int anInt2921;

	@OriginalMember(owner = "client!aic", name = "x", descriptor = "I")
	int anInt2922;

	@OriginalMember(owner = "client!aic", name = "s", descriptor = "[B")
	byte[] aByteArray56;

	@OriginalMember(owner = "client!aic", name = "w", descriptor = "[I")
	final int[] anIntArray261 = new int[this.anInt2920];

	@OriginalMember(owner = "client!aic", name = "<init>", descriptor = "(IIIIIF)V")
	Class137_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(13) int local13 = 0; local13 < this.anInt2920; local13++) {
			this.anIntArray261[local13] = (short) (Math.pow((double) arg5, (double) local13) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!aic", name = "j", descriptor = "()V")
	@Override
	final void method20603() {
		this.anInt2921 = 0;
		this.anInt2922 = 0;
	}

	@OriginalMember(owner = "client!aic", name = "f", descriptor = "()V")
	@Override
	final void method20595() {
		this.anInt2921 = 0;
		this.anInt2922 = 0;
	}

	@OriginalMember(owner = "client!aic", name = "u", descriptor = "(II)V")
	@Override
	final void method20597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2922 += arg1 * this.anIntArray261[arg0] >> 12;
	}

	@OriginalMember(owner = "client!aic", name = "w", descriptor = "(II)V")
	@Override
	final void method20617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2922 += arg1 * this.anIntArray261[arg0] >> 12;
	}

	@OriginalMember(owner = "client!aic", name = "aq", descriptor = "(IB)V")
	void method20621(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray56[this.anInt2921++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!aic", name = "a", descriptor = "()V")
	@Override
	final void method20604() {
		this.anInt2921 = 0;
		this.anInt2922 = 0;
	}

	@OriginalMember(owner = "client!aic", name = "ai", descriptor = "(IB)V")
	void method20622(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray56[this.anInt2921++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!aic", name = "k", descriptor = "()V")
	@Override
	final void method20606() {
		this.anInt2922 = Math.abs(this.anInt2922);
		if (this.anInt2922 >= 4096) {
			this.anInt2922 = 4095;
		}
		this.method20622(this.anInt2921++, (byte) (this.anInt2922 >> 4));
		this.anInt2922 = 0;
	}

	@OriginalMember(owner = "client!aic", name = "s", descriptor = "()V")
	@Override
	final void method20605() {
		this.anInt2922 = Math.abs(this.anInt2922);
		if (this.anInt2922 >= 4096) {
			this.anInt2922 = 4095;
		}
		this.method20622(this.anInt2921++, (byte) (this.anInt2922 >> 4));
		this.anInt2922 = 0;
	}

	@OriginalMember(owner = "client!aic", name = "e", descriptor = "()V")
	@Override
	final void method20596() {
		this.anInt2922 = Math.abs(this.anInt2922);
		if (this.anInt2922 >= 4096) {
			this.anInt2922 = 4095;
		}
		this.method20622(this.anInt2921++, (byte) (this.anInt2922 >> 4));
		this.anInt2922 = 0;
	}

	@OriginalMember(owner = "client!aic", name = "x", descriptor = "(II)V")
	@Override
	final void method20607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2922 += arg1 * this.anIntArray261[arg0] >> 12;
	}

	@OriginalMember(owner = "client!aic", name = "r", descriptor = "(II)V")
	@Override
	final void method20611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2922 += arg1 * this.anIntArray261[arg0] >> 12;
	}

	@OriginalMember(owner = "client!aic", name = "q", descriptor = "(II)V")
	@Override
	final void method20609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2922 += arg1 * this.anIntArray261[arg0] >> 12;
	}

	@OriginalMember(owner = "client!aic", name = "h", descriptor = "(II)V")
	@Override
	final void method20602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2922 += arg1 * this.anIntArray261[arg0] >> 12;
	}
}
