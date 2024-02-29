package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aim")
public class Class140_Sub2 extends Class140 {

	@OriginalMember(owner = "client!aim", name = "r", descriptor = "I")
	int anInt2880;

	@OriginalMember(owner = "client!aim", name = "c", descriptor = "[B")
	byte[] aByteArray54;

	@OriginalMember(owner = "client!aim", name = "v", descriptor = "I")
	int anInt2881;

	@OriginalMember(owner = "client!aim", name = "o", descriptor = "[I")
	final int[] anIntArray250 = new int[this.anInt2879];

	@OriginalMember(owner = "client!aim", name = "<init>", descriptor = "(IIIIIF)V", line = 10)
	Class140_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(13) int local13 = 0; local13 < this.anInt2879; local13++) {
			this.anIntArray250[local13] = (short) (Math.pow((double) arg5, (double) local13) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!aim", name = "p", descriptor = "()V", line = 18)
	@Override
	void method20400() {
		this.anInt2880 = 0;
		this.anInt2881 = 0;
	}

	@OriginalMember(owner = "client!aim", name = "d", descriptor = "()V", line = 18)
	@Override
	void method20399() {
		this.anInt2880 = 0;
		this.anInt2881 = 0;
	}

	@OriginalMember(owner = "client!aim", name = "n", descriptor = "()V", line = 18)
	@Override
	void method20404() {
		this.anInt2880 = 0;
		this.anInt2881 = 0;
	}

	@OriginalMember(owner = "client!aim", name = "o", descriptor = "(II)V", line = 23)
	@Override
	void method20398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2881 += arg1 * this.anIntArray250[arg0] >> 12;
	}

	@OriginalMember(owner = "client!aim", name = "s", descriptor = "(II)V", line = 23)
	@Override
	void method20405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2881 += arg1 * this.anIntArray250[arg0] >> 12;
	}

	@OriginalMember(owner = "client!aim", name = "k", descriptor = "(II)V", line = 23)
	@Override
	void method20397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2881 += arg1 * this.anIntArray250[arg0] >> 12;
	}

	@OriginalMember(owner = "client!aim", name = "y", descriptor = "(II)V", line = 23)
	@Override
	void method20396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2881 += arg1 * this.anIntArray250[arg0] >> 12;
	}

	@OriginalMember(owner = "client!aim", name = "m", descriptor = "()V", line = 27)
	@Override
	void method20401() {
		this.anInt2881 = Math.abs(this.anInt2881);
		if (this.anInt2881 >= 4096) {
			this.anInt2881 = 4095;
		}
		this.method20407(this.anInt2880++, (byte) (this.anInt2881 >> 4));
		this.anInt2881 = 0;
	}

	@OriginalMember(owner = "client!aim", name = "c", descriptor = "()V", line = 27)
	@Override
	void method20402() {
		this.anInt2881 = Math.abs(this.anInt2881);
		if (this.anInt2881 >= 4096) {
			this.anInt2881 = 4095;
		}
		this.method20407(this.anInt2880++, (byte) (this.anInt2881 >> 4));
		this.anInt2881 = 0;
	}

	@OriginalMember(owner = "client!aim", name = "r", descriptor = "()V", line = 27)
	@Override
	void method20403() {
		this.anInt2881 = Math.abs(this.anInt2881);
		if (this.anInt2881 >= 4096) {
			this.anInt2881 = 4095;
		}
		this.method20407(this.anInt2880++, (byte) (this.anInt2881 >> 4));
		this.anInt2881 = 0;
	}

	@OriginalMember(owner = "client!aim", name = "v", descriptor = "()V", line = 27)
	@Override
	void method20406() {
		this.anInt2881 = Math.abs(this.anInt2881);
		if (this.anInt2881 >= 4096) {
			this.anInt2881 = 4095;
		}
		this.method20407(this.anInt2880++, (byte) (this.anInt2881 >> 4));
		this.anInt2881 = 0;
	}

	@OriginalMember(owner = "client!aim", name = "j", descriptor = "(IB)V", line = 34)
	void method20407(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray54[this.anInt2880++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!aim", name = "t", descriptor = "(IB)V", line = 34)
	void method20408(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray54[this.anInt2880++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
