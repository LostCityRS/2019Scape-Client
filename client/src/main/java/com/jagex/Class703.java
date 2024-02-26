package com.jagex;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zd")
public abstract class Class703 {

	@OriginalMember(owner = "client!zd", name = "df", descriptor = "Lclient!ale;")
	public static Class80_Sub37 aClass80_Sub37_49;

	@OriginalMember(owner = "client!zd", name = "u", descriptor = "([BZ)Ljava/lang/Object;")
	public static Object method37109(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0.length > 136) {
			@Pc(12) ByteBuffer local12 = ByteBuffer.allocateDirect(arg0.length);
			local12.position(0);
			local12.put(arg0);
			return local12;
		} else if (arg1) {
			return Arrays.copyOf(arg0, arg0.length);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!zd", name = "l", descriptor = "(Ljava/lang/Object;II)[B")
	public static byte[] method37110(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(11) byte[] local11 = (byte[]) arg0;
			return Arrays.copyOfRange(local11, arg1, arg1 + arg2);
		} else if (arg0 instanceof ByteBuffer) {
			@Pc(24) ByteBuffer local24 = (ByteBuffer) arg0;
			@Pc(27) byte[] local27 = new byte[arg2];
			local24.position(arg1);
			local24.get(local27, 0, arg2);
			return local27;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!zd", name = "g", descriptor = "(Ljava/lang/Object;II)[B")
	public static byte[] method37111(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(11) byte[] local11 = (byte[]) arg0;
			return Arrays.copyOfRange(local11, arg1, arg1 + arg2);
		} else if (arg0 instanceof ByteBuffer) {
			@Pc(24) ByteBuffer local24 = (ByteBuffer) arg0;
			@Pc(27) byte[] local27 = new byte[arg2];
			local24.position(arg1);
			local24.get(local27, 0, arg2);
			return local27;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!zd", name = "<init>", descriptor = "()V")
	Class703() throws Throwable {
		throw new Error();
	}
}
