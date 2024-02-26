package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

import java.io.IOException;
import java.io.OutputStream;

@OriginalClass("client!apu")
public final class OutputStream_Sub1 extends OutputStream {

	@OriginalMember(owner = "client!apu", name = "jd", descriptor = "Lclient!ug;")
	static Class160 aClass160_3;

	@OriginalMember(owner = "client!apu", name = "s", descriptor = "(III)I")
	public static int method18473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}

	@OriginalMember(owner = "client!apu", name = "<init>", descriptor = "()V")
	OutputStream_Sub1() {
	}

	@OriginalMember(owner = "client!apu", name = "t", descriptor = "(I)V")
	public void method18472(@OriginalArg(0) int arg0) throws IOException {
		throw new IOException();
	}

	@OriginalMember(owner = "client!apu", name = "write", descriptor = "(I)V")
	@Override
	public void write(@OriginalArg(0) int arg0) throws IOException {
		throw new IOException();
	}
}
