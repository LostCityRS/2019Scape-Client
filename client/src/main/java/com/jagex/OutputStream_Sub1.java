package com.jagex;

import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!apm")
public class OutputStream_Sub1 extends OutputStream {

	@OriginalMember(owner = "client!apm", name = "<init>", descriptor = "()V", line = 291)
	OutputStream_Sub1() {
	}

	@OriginalMember(owner = "client!apm", name = "write", descriptor = "(I)V", line = 294)
	@Override
	public void write(@OriginalArg(0) int arg0) throws IOException {
		throw new IOException();
	}

	@OriginalMember(owner = "client!apm", name = "e", descriptor = "(I)V", line = 294)
	public void method17842(@OriginalArg(0) int arg0) throws IOException {
		throw new IOException();
	}

	@OriginalMember(owner = "client!apm", name = "bfj", descriptor = "(Lclient!yf;B)V", line = 15185)
	static final void method17843(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 1;
	}
}
