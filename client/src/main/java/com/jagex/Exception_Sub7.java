package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!apz")
public final class Exception_Sub7 extends Exception {

	@OriginalMember(owner = "client!apz", name = "o", descriptor = "J")
	static long aLong155;

	@OriginalMember(owner = "client!apz", name = "t", descriptor = "Ljava/lang/String;")
	public final String aString71;

	@OriginalMember(owner = "client!apz", name = "f", descriptor = "I")
	public final int anInt2613;

	@OriginalMember(owner = "client!apz", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
	public Exception_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Throwable arg2) {
		super(arg2);
		this.aString71 = arg1;
		this.anInt2613 = arg0 * 816355897;
	}

	@OriginalMember(owner = "client!apz", name = "<init>", descriptor = "(ILjava/lang/String;)V")
	public Exception_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		this(arg0, arg1, (Throwable) null);
	}
}
