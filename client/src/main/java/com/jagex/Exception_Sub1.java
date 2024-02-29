package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apb")
public class Exception_Sub1 extends Exception {

	@OriginalMember(owner = "client!apb", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString64;

	@OriginalMember(owner = "client!apb", name = "n", descriptor = "I")
	public final int anInt2449;

	@OriginalMember(owner = "client!apb", name = "<init>", descriptor = "(ILjava/lang/String;)V", line = 8)
	public Exception_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		this(arg0, arg1, (Throwable) null);
	}

	@OriginalMember(owner = "client!apb", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V", line = 12)
	public Exception_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Throwable arg2) {
		super(arg2);
		this.aString64 = arg1;
		this.anInt2449 = arg0 * -462967707;
	}

	@OriginalMember(owner = "client!apb", name = "l", descriptor = "(I)V", line = 323)
	public static void method17631(@OriginalArg(0) int arg0) {
		if (Class362.anInterface30Array1 == null) {
			return;
		}
		@Pc(3) Interface30[] local3 = Class362.anInterface30Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(13) Interface30 local13 = local3[local5];
			local13.method27923((short) 253);
		}
	}
}
