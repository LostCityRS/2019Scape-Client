package com.jagex;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abx")
public final class Class48 {

	@OriginalMember(owner = "client!abx", name = "l", descriptor = "(Ljava/io/File;I)[B")
	static byte[] method990(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) byte[] local2 = new byte[arg1];
			Class354.method28081(arg0, local2, arg1, (byte) -63);
			return local2;
		} catch (@Pc(10) IOException local10) {
			return null;
		}
	}

	@OriginalMember(owner = "client!abx", name = "u", descriptor = "(Ljava/io/File;[BI)V")
	static void method991(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(10) DataInputStream local10 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local10.readFully(arg1, 0, arg2);
		} catch (@Pc(17) EOFException local17) {
		}
		local10.close();
	}

	@OriginalMember(owner = "client!abx", name = "m", descriptor = "(Ljava/io/File;)[B")
	public static byte[] method992(@OriginalArg(0) File arg0) {
		return Class695.method37034(arg0, (int) arg0.length(), 1141465155);
	}

	@OriginalMember(owner = "client!abx", name = "o", descriptor = "(Ljava/io/File;)[B")
	public static byte[] method993(@OriginalArg(0) File arg0) {
		return Class695.method37034(arg0, (int) arg0.length(), 1141465155);
	}

	@OriginalMember(owner = "client!abx", name = "i", descriptor = "(Ljava/io/File;)[B")
	public static byte[] method994(@OriginalArg(0) File arg0) {
		return Class695.method37034(arg0, (int) arg0.length(), 1141465155);
	}

	@OriginalMember(owner = "client!abx", name = "g", descriptor = "(Ljava/io/File;I)[B")
	static byte[] method995(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) byte[] local2 = new byte[arg1];
			Class354.method28081(arg0, local2, arg1, (byte) -10);
			return local2;
		} catch (@Pc(10) IOException local10) {
			return null;
		}
	}

	@OriginalMember(owner = "client!abx", name = "j", descriptor = "(Ljava/io/File;)[B")
	public static byte[] method996(@OriginalArg(0) File arg0) {
		return Class695.method37034(arg0, (int) arg0.length(), 1141465155);
	}

	@OriginalMember(owner = "client!abx", name = "a", descriptor = "(Ljava/io/File;)[B")
	public static byte[] method997(@OriginalArg(0) File arg0) {
		return Class695.method37034(arg0, (int) arg0.length(), 1141465155);
	}

	@OriginalMember(owner = "client!abx", name = "<init>", descriptor = "()V")
	Class48() throws Throwable {
		throw new Error();
	}
}
