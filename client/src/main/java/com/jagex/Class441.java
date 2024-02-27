package com.jagex;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class441 {

	@OriginalMember(owner = "client!nl", name = "bh", descriptor = "Lclient!cm;")
	public static Class100 aClass100_44;

	@OriginalMember(owner = "client!nl", name = "lt", descriptor = "I")
	public static int anInt5047;

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "Ljava/lang/Object;")
	final Object anObject18;

	@OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
	int anInt5046;

	@OriginalMember(owner = "client!nl", name = "bu", descriptor = "(Lclient!yf;I)V")
	static void method29035(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		Class577.method31538(local11, arg0, -780527725);
	}

	@OriginalMember(owner = "client!nl", name = "axh", descriptor = "(Lclient!yf;B)V")
	static void method29036(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!nl", name = "m", descriptor = "(Ljava/lang/Object;III)[B")
	public static byte[] method29037(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(10) byte[] local10 = (byte[]) arg0;
			return Arrays.copyOfRange(local10, arg1, arg2 + arg1);
		} else if (arg0 instanceof ByteBuffer) {
			@Pc(23) ByteBuffer local23 = (ByteBuffer) arg0;
			@Pc(26) byte[] local26 = new byte[arg2];
			local23.position(arg1);
			local23.get(local26, 0, arg2);
			return local26;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	Class441(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		this.anObject18 = arg0;
		this.anInt5046 = arg1 * 1240994129;
	}
}
