package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!api")
public final class Exception_Sub2 extends Exception {

	@OriginalMember(owner = "client!api", name = "t", descriptor = "I")
	final int anInt2515;

	@OriginalMember(owner = "client!api", name = "<init>", descriptor = "()V")
	Exception_Sub2() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!api", name = "f", descriptor = "()I")
	public int method18061() {
		return this.anInt2515 * 170034875;
	}

	@OriginalMember(owner = "client!api", name = "t", descriptor = "(I)I")
	public int method18062(@OriginalArg(0) int arg0) {
		return this.anInt2515 * 170034875;
	}

	@OriginalMember(owner = "client!api", name = "e", descriptor = "()I")
	public int method18063() {
		return this.anInt2515 * 170034875;
	}

	@OriginalMember(owner = "client!api", name = "u", descriptor = "()I")
	public int method18064() {
		return this.anInt2515 * 170034875;
	}
}
