package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!apl")
public class Exception_Sub5 extends Exception {

	@OriginalMember(owner = "client!apl", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString65;

	@OriginalMember(owner = "client!apl", name = "n", descriptor = "I")
	public final int anInt2491;

	@OriginalMember(owner = "client!apl", name = "<init>", descriptor = "(ILjava/lang/String;)V", line = 8)
	Exception_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		this(arg0, arg1, (Throwable) null);
	}

	@OriginalMember(owner = "client!apl", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V", line = 12)
	Exception_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Throwable arg2) {
		super(arg2);
		this.aString65 = arg1;
		this.anInt2491 = arg0 * -1512005515;
	}
}
