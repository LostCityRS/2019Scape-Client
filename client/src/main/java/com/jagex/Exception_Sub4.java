package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!apj")
public class Exception_Sub4 extends Exception {

	@OriginalMember(owner = "client!apj", name = "rf", descriptor = "I")
	static int anInt2489;

	@OriginalMember(owner = "client!apj", name = "e", descriptor = "I")
	final int anInt2488;

	@OriginalMember(owner = "client!apj", name = "<init>", descriptor = "()V", line = 6)
	Exception_Sub4() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!apj", name = "n", descriptor = "()I", line = 11)
	public int method17828() {
		return this.anInt2488 * -1790443991;
	}

	@OriginalMember(owner = "client!apj", name = "e", descriptor = "(I)I", line = 11)
	public int method17829(@OriginalArg(0) int arg0) {
		return this.anInt2488 * -1790443991;
	}

	@OriginalMember(owner = "client!apj", name = "m", descriptor = "()I", line = 11)
	public int method17830() {
		return this.anInt2488 * -1790443991;
	}

	@OriginalMember(owner = "client!apj", name = "k", descriptor = "()I", line = 11)
	public int method17831() {
		return this.anInt2488 * -1790443991;
	}
}