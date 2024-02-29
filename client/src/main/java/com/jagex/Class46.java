package com.jagex;

import java.awt.image.BufferedImage;
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

@OriginalClass("client!abu")
public final class Class46 {

	@OriginalMember(owner = "client!abu", name = "<init>", descriptor = "()V", line = 6)
	Class46() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!abu", name = "k", descriptor = "(Ljava/io/File;[BI)V", line = 11)
	static void method884(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(10) DataInputStream local10 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local10.readFully(arg1, 0, arg2);
		} catch (@Pc(17) EOFException local17) {
		}
		local10.close();
	}

	@OriginalMember(owner = "client!abu", name = "f", descriptor = "(Ljava/io/File;[BI)V", line = 11)
	static void method885(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(10) DataInputStream local10 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local10.readFully(arg1, 0, arg2);
		} catch (@Pc(17) EOFException local17) {
		}
		local10.close();
	}

	@OriginalMember(owner = "client!abu", name = "w", descriptor = "(Ljava/io/File;[BI)V", line = 11)
	static void method886(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(10) DataInputStream local10 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local10.readFully(arg1, 0, arg2);
		} catch (@Pc(17) EOFException local17) {
		}
		local10.close();
	}

	@OriginalMember(owner = "client!abu", name = "l", descriptor = "(Ljava/io/File;[BI)V", line = 11)
	static void method887(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(10) DataInputStream local10 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local10.readFully(arg1, 0, arg2);
		} catch (@Pc(17) EOFException local17) {
		}
		local10.close();
	}

	@OriginalMember(owner = "client!abu", name = "z", descriptor = "(Ljava/io/File;I)[B", line = 21)
	static byte[] method888(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) byte[] local2 = new byte[arg1];
			Class305.method26796(arg0, local2, arg1, 1736907086);
			return local2;
		} catch (@Pc(10) IOException local10) {
			return null;
		}
	}

	@OriginalMember(owner = "client!abu", name = "u", descriptor = "(Ljava/io/File;I)[B", line = 21)
	static byte[] method889(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) byte[] local2 = new byte[arg1];
			Class305.method26796(arg0, local2, arg1, 1678505483);
			return local2;
		} catch (@Pc(10) IOException local10) {
			return null;
		}
	}

	@OriginalMember(owner = "client!abu", name = "p", descriptor = "(Ljava/io/File;I)[B", line = 21)
	static byte[] method890(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) byte[] local2 = new byte[arg1];
			Class305.method26796(arg0, local2, arg1, 1999643852);
			return local2;
		} catch (@Pc(10) IOException local10) {
			return null;
		}
	}

	@OriginalMember(owner = "client!abu", name = "n", descriptor = "(ZZI)V", line = 26)
	public static void method891(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg0) {
			Class685.anInt5905 -= 1883407479;
			if (Class685.anInt5905 * 774673735 == 0) {
				Class685.anIntArray522 = null;
			}
		}
		if (arg1) {
			Class685.anInt5906 -= -236883317;
			if (Class685.anInt5906 * -771365597 == 0) {
				Class685.anIntArray524 = null;
			}
		}
	}

	@OriginalMember(owner = "client!abu", name = "d", descriptor = "(Ljava/io/File;)[B", line = 31)
	public static byte[] method892(@OriginalArg(0) File arg0) {
		return Class27.method580(arg0, (int) arg0.length(), -1065378581);
	}

	@OriginalMember(owner = "client!abu", name = "c", descriptor = "(Ljava/io/File;)[B", line = 31)
	public static byte[] method893(@OriginalArg(0) File arg0) {
		return Class27.method580(arg0, (int) arg0.length(), -1326104717);
	}

	@OriginalMember(owner = "client!abu", name = "r", descriptor = "(Ljava/io/File;)[B", line = 31)
	public static byte[] method894(@OriginalArg(0) File arg0) {
		return Class27.method580(arg0, (int) arg0.length(), 513588792);
	}

	@OriginalMember(owner = "client!abu", name = "y", descriptor = "(Ljava/lang/String;I)I", line = 155)
	public static int method895(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!abu", name = "c", descriptor = "(Ljava/awt/image/BufferedImage;I)[I", line = 175)
	public static int[] method896(@OriginalArg(0) BufferedImage arg0, @OriginalArg(1) int arg1) {
		if (arg0.getType() != 10 && arg0.getType() != 0) {
			return arg0.getRGB(0, 0, arg0.getWidth(), arg0.getHeight(), null, 0, arg0.getWidth());
		}
		@Pc(8) Object local8 = null;
		@Pc(19) int[] local19 = arg0.getRaster().getPixels(0, 0, arg0.getWidth(), arg0.getHeight(), (int[]) local8);
		@Pc(26) int[] local26 = new int[arg0.getWidth() * arg0.getHeight()];
		@Pc(32) int local32;
		if (arg0.getType() == 10) {
			for (local32 = 0; local32 < local26.length; local32++) {
				local26[local32] = local19[local32] + -16777216 + (local19[local32] << 16) + (local19[local32] << 8);
			}
		} else {
			for (local32 = 0; local32 < local26.length; local32++) {
				@Pc(69) int local69 = local32 * 2;
				local26[local32] = local19[local69] + (local19[local69 + 1] << 24) + (local19[local69] << 16) + (local19[local69] << 8);
			}
		}
		return local26;
	}
}
