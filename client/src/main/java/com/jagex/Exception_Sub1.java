package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aph")
public final class Exception_Sub1 extends Exception {

	@OriginalMember(owner = "client!aph", name = "f", descriptor = "I")
	public final int anInt2514;

	@OriginalMember(owner = "client!aph", name = "t", descriptor = "Ljava/lang/String;")
	public final String aString70;

	@OriginalMember(owner = "client!aph", name = "<init>", descriptor = "(ILjava/lang/String;)V")
	Exception_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		this(arg0, arg1, (Throwable) null);
	}

	@OriginalMember(owner = "client!aph", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
	Exception_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Throwable arg2) {
		super(arg2);
		this.aString70 = arg1;
		this.anInt2514 = arg0 * -314821511;
	}
}
