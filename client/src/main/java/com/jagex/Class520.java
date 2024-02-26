package com.jagex;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
final class Class520 implements Interface9 {

	@OriginalMember(owner = "client!qw", name = "ahi", descriptor = "(Lclient!yp;B)V")
	static void method30613(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(18) Class43 local18 = (Class43) Class25.aClass41_Sub9_1.method18054(local12, -369448199);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local18.anInt122 * 855963023;
	}

	@OriginalMember(owner = "client!qw", name = "aml", descriptor = "(Lclient!yp;I)V")
	static void method30614(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		client.anInt3521 = arg0.anIntArray525[arg0.anInt5778 * 1896589581] * 508506113;
		client.anInt3523 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1] * 1728670783;
	}

	@OriginalMember(owner = "client!qw", name = "ir", descriptor = "(II)V")
	static void method30615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		client.anIntArray305 = new int[arg0];
		client.anIntArray314 = new int[arg0];
		client.anIntArray315 = new int[arg0];
		client.anIntArray316 = new int[arg0];
		client.anIntArray317 = new int[arg0];
	}

	@OriginalMember(owner = "client!qw", name = "aa", descriptor = "(I)Z")
	public static boolean method30616(@OriginalArg(0) int arg0) {
		if (Class531.aString220.startsWith("win")) {
			@Pc(5) String local5 = "msvcr110.dll";
			@Pc(7) String local7 = "msvcp110.dll";
			@Pc(18) String[] local18 = new String[] { local5, local7 };
			@Pc(21) String local21 = System.getenv("WINDIR");
			if (local21 == "") {
				return false;
			}
			for (@Pc(28) int local28 = 0; local28 < local18.length; local28++) {
				@Pc(48) File local48 = new File(local21 + "\\system32\\" + local18[local28]);
				if (!local48.exists() || local48.isDirectory()) {
					return false;
				}
			}
			return true;
		} else if (Class531.aString220.startsWith("mac")) {
			try {
				@Pc(68) Process local68 = Runtime.getRuntime().exec("ps -few");
				@Pc(77) BufferedReader local77 = new BufferedReader(new InputStreamReader(local68.getInputStream()));
				try {
					@Pc(80) int local80 = local68.waitFor();
					if (local80 != 0) {
						return false;
					}
				} catch (@Pc(86) InterruptedException local86) {
					return false;
				}
				@Pc(90) boolean local90 = false;
				@Pc(94) String local94;
				while ((local94 = local77.readLine()) != null) {
					if (local94.toLowerCase().indexOf("soundflowerbed") != -1) {
						local90 = true;
						break;
					}
				}
				local77.close();
				return local90;
			} catch (@Pc(109) Exception local109) {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qw", name = "hq", descriptor = "(B)V")
	public static void method30617(@OriginalArg(0) byte arg0) {
		if (!client.aBoolean723) {
			client.aFloat253 += (-24.0F - client.aFloat253) / 2.0F;
			client.aBoolean726 = true;
			client.aBoolean723 = true;
		}
	}

	@OriginalMember(owner = "client!qw", name = "u", descriptor = "(Lclient!ald;)Ljava/lang/Object;")
	@Override
	public Object method30636(@OriginalArg(0) Class80_Sub36 arg0) {
		return new Class80_Sub33(arg0);
	}

	@OriginalMember(owner = "client!qw", name = "f", descriptor = "(Lclient!ald;)Ljava/lang/Object;")
	@Override
	public Object method30635(@OriginalArg(0) Class80_Sub36 arg0) {
		return new Class80_Sub33(arg0);
	}

	@OriginalMember(owner = "client!qw", name = "e", descriptor = "(Lclient!ald;)Ljava/lang/Object;")
	@Override
	public Object method30637(@OriginalArg(0) Class80_Sub36 arg0) {
		return new Class80_Sub33(arg0);
	}

	@OriginalMember(owner = "client!qw", name = "t", descriptor = "(Lclient!ald;S)Ljava/lang/Object;")
	@Override
	public Object method30638(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) short arg1) {
		return new Class80_Sub33(arg0);
	}
}
