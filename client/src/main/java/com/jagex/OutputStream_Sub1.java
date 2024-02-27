package com.jagex;

import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!apm")
public final class OutputStream_Sub1 extends OutputStream {

	@OriginalMember(owner = "client!apm", name = "bfj", descriptor = "(Lclient!yf;B)V")
	static void method17855(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 1;
	}

	@OriginalMember(owner = "client!apm", name = "<init>", descriptor = "()V")
	OutputStream_Sub1() {
	}

	@OriginalMember(owner = "client!apm", name = "write", descriptor = "(I)V")
	@Override
	public void write(@OriginalArg(0) int arg0) throws IOException {
		throw new IOException();
	}

	@OriginalMember(owner = "client!apm", name = "e", descriptor = "(I)V")
	public void method17854(@OriginalArg(0) int arg0) throws IOException {
		throw new IOException();
	}
}
