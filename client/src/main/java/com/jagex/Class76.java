package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ada")
public class Class76 {

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "()V", line = 7)
	Class76() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ada", name = "w", descriptor = "(I)I", line = 12)
	public static int method1273(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ada", name = "k", descriptor = "(I)I", line = 12)
	public static int method1274(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ada", name = "f", descriptor = "(I)I", line = 12)
	public static int method1275(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ada", name = "u", descriptor = "(I)I", line = 16)
	public static int method1276(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ada", name = "l", descriptor = "(I)I", line = 16)
	public static int method1277(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ada", name = "z", descriptor = "(I)I", line = 16)
	public static int method1278(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ada", name = "p", descriptor = "(Lclient!alw;[Lclient!qw;)[Ljava/lang/Object;", line = 20)
	public static Object[] method1279(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class519[] arg1) {
		@Pc(3) int local3 = arg0.method22528((byte) -75);
		@Pc(9) Object[] local9 = new Object[local3 * arg1.length];
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			for (@Pc(16) int local16 = 0; local16 < arg1.length; local16++) {
				@Pc(27) int local27 = local11 * arg1.length + local16;
				local9[local27] = arg1[local16].aClass500_7.method30163(arg0, (byte) 0);
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!ada", name = "d", descriptor = "(Lclient!alw;[Lclient!qw;)[Ljava/lang/Object;", line = 20)
	public static Object[] method1280(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class519[] arg1) {
		@Pc(3) int local3 = arg0.method22528((byte) -57);
		@Pc(9) Object[] local9 = new Object[local3 * arg1.length];
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			for (@Pc(16) int local16 = 0; local16 < arg1.length; local16++) {
				@Pc(27) int local27 = local11 * arg1.length + local16;
				local9[local27] = arg1[local16].aClass500_7.method30163(arg0, (byte) 0);
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!ada", name = "c", descriptor = "(Lclient!alw;[Lclient!qw;)[Ljava/lang/Object;", line = 20)
	public static Object[] method1281(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class519[] arg1) {
		@Pc(3) int local3 = arg0.method22528((byte) -109);
		@Pc(9) Object[] local9 = new Object[local3 * arg1.length];
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			for (@Pc(16) int local16 = 0; local16 < arg1.length; local16++) {
				@Pc(27) int local27 = local11 * arg1.length + local16;
				local9[local27] = arg1[local16].aClass500_7.method30163(arg0, (byte) 0);
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!ada", name = "r", descriptor = "(Lclient!alw;[Lclient!qw;)[Ljava/lang/Object;", line = 20)
	public static Object[] method1282(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class519[] arg1) {
		@Pc(3) int local3 = arg0.method22528((byte) -36);
		@Pc(9) Object[] local9 = new Object[local3 * arg1.length];
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			for (@Pc(16) int local16 = 0; local16 < arg1.length; local16++) {
				@Pc(27) int local27 = local11 * arg1.length + local16;
				local9[local27] = arg1[local16].aClass500_7.method30163(arg0, (byte) 0);
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!ada", name = "n", descriptor = "(I)V", line = 90)
	public static void method1283(@OriginalArg(0) int arg0) {
		@Pc(4) Class93_Sub13 local4;
		for (local4 = (Class93_Sub13) Class93_Sub13.aClass22_21.method428((byte) 35); local4 != null; local4 = (Class93_Sub13) Class93_Sub13.aClass22_21.method442(1409776996)) {
			if (local4.aBoolean336) {
				local4.method13471((byte) 80);
			}
		}
		for (local4 = (Class93_Sub13) Class93_Sub13.aClass22_22.method428((byte) 115); local4 != null; local4 = (Class93_Sub13) Class93_Sub13.aClass22_22.method442(518951671)) {
			if (local4.aBoolean336) {
				local4.method13471((byte) -55);
			}
		}
	}

	@OriginalMember(owner = "client!ada", name = "r", descriptor = "(I)V", line = 497)
	public static void method1284(@OriginalArg(0) int arg0) {
		@Pc(2) Class240 local2 = Class658.aClass240_91;
		synchronized (Class658.aClass240_91) {
			Class658.aClass240_91.method25847((byte) -89);
		}
		local2 = Class658.aClass240_92;
		synchronized (Class658.aClass240_92) {
			Class658.aClass240_92.method25847((byte) -35);
		}
	}
}
