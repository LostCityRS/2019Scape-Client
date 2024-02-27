package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class313 {

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "Ljava/lang/String;")
	static final String aString174 = "#";

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z")
	public static boolean method27021(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		if (arg0 == null || arg2 == null) {
			return false;
		} else if (arg0.startsWith("#") || arg2.startsWith("#")) {
			return arg0.equals(arg2);
		} else {
			return arg1.equals(arg3);
		}
	}

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z")
	public static boolean method27022(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		if (arg0 == null || arg2 == null) {
			return false;
		} else if (arg0.startsWith("#") || arg2.startsWith("#")) {
			return arg0.equals(arg2);
		} else {
			return arg1.equals(arg3);
		}
	}

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z")
	public static boolean method27023(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		if (arg0 == null || arg2 == null) {
			return false;
		} else if (arg0.startsWith("#") || arg2.startsWith("#")) {
			return arg0.equals(arg2);
		} else {
			return arg1.equals(arg3);
		}
	}

	@OriginalMember(owner = "client!hg", name = "im", descriptor = "(Lclient!yf;I)V")
	static void method27024(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!hg", name = "z", descriptor = "(IIIILclient!abn;ZI)V")
	static void method27025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class40 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(8) long local8 = (long) (arg0 | (arg5 ? Integer.MIN_VALUE : 0));
		@Pc(13) Class93_Sub6 local13 = (Class93_Sub6) Class93_Sub6.aClass16_9.method215(local8);
		if (local13 == null) {
			local13 = new Class93_Sub6();
			Class93_Sub6.aClass16_9.method221(local13, local8);
		}
		if (local13.anIntArray173.length <= arg1) {
			@Pc(34) int[] local34 = new int[arg1 + 1];
			@Pc(39) int[] local39 = new int[arg1 + 1];
			@Pc(41) Class40[] local41 = null;
			if (local13.aClass40Array1 != null) {
				local41 = new Class40[arg1 + 1];
			}
			@Pc(52) int local52;
			for (local52 = 0; local52 < local13.anIntArray173.length; local52++) {
				local34[local52] = local13.anIntArray173[local52];
				local39[local52] = local13.anIntArray174[local52];
				if (local13.aClass40Array1 != null) {
					local41[local52] = local13.aClass40Array1[local52];
				}
			}
			for (local52 = local13.anIntArray173.length; local52 < arg1; local52++) {
				local34[local52] = -1;
				local39[local52] = 0;
			}
			local13.anIntArray173 = local34;
			local13.anIntArray174 = local39;
			local13.aClass40Array1 = local41;
		}
		local13.anIntArray173[arg1] = arg2;
		local13.anIntArray174[arg1] = arg3;
		if (arg4 != null) {
			if (local13.aClass40Array1 == null) {
				local13.aClass40Array1 = new Class40[local13.anIntArray173.length];
			}
			local13.aClass40Array1[arg1] = arg4;
		} else if (local13.aClass40Array1 != null) {
			local13.aClass40Array1[arg1] = null;
		}
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
	Class313() throws Throwable {
		throw new Error();
	}
}
