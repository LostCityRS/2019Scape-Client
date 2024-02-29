package com.jagex;

import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!apy")
public class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!apy", name = "c", descriptor = "I")
	static int anInt2587;

	@OriginalMember(owner = "client!apy", name = "<init>", descriptor = "()V", line = 299)
	InputStream_Sub1() {
	}

	@OriginalMember(owner = "client!apy", name = "read", descriptor = "()I", line = 302)
	@Override
	public int read() {
		Class212.method25431(30000L);
		return -1;
	}

	@OriginalMember(owner = "client!apy", name = "e", descriptor = "()I", line = 302)
	public int method18277() {
		Class212.method25431(30000L);
		return -1;
	}
}
