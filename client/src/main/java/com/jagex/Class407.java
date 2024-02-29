package com.jagex;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public class Class407 implements Interface32 {

	@OriginalMember(owner = "client!lv", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString198;

	@OriginalMember(owner = "client!lv", name = "n", descriptor = "Lclient!kv;")
	public final Class390 aClass390_14;

	@OriginalMember(owner = "client!lv", name = "m", descriptor = "Lclient!ky;")
	public final Class392 aClass392_14;

	@OriginalMember(owner = "client!lv", name = "k", descriptor = "I")
	public final int anInt4690;

	@OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
	public final int anInt4691;

	@OriginalMember(owner = "client!lv", name = "w", descriptor = "I")
	public final int anInt4695;

	@OriginalMember(owner = "client!lv", name = "l", descriptor = "I")
	public final int anInt4693;

	@OriginalMember(owner = "client!lv", name = "u", descriptor = "I")
	public final int anInt4689;

	@OriginalMember(owner = "client!lv", name = "z", descriptor = "I")
	public final int anInt4694;

	@OriginalMember(owner = "client!lv", name = "p", descriptor = "I")
	public final int anInt4692;

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
	public final int anInt4696;

	@OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
	public final int anInt4697;

	@OriginalMember(owner = "client!lv", name = "r", descriptor = "I")
	public final int anInt4698;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!kv;Lclient!ky;IIIIIIIIII)V", line = 20)
	Class407(@OriginalArg(0) String arg0, @OriginalArg(1) Class390 arg1, @OriginalArg(2) Class392 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.aString198 = arg0;
		this.aClass390_14 = arg1;
		this.aClass392_14 = arg2;
		this.anInt4690 = arg3 * 722756529;
		this.anInt4691 = arg4 * 1597777433;
		this.anInt4695 = arg5 * 1858148533;
		this.anInt4693 = arg6 * 1503728231;
		this.anInt4689 = arg7 * 345374379;
		this.anInt4694 = arg8 * 251673095;
		this.anInt4692 = arg9 * -1819415099;
		this.anInt4696 = arg10 * 1380041935;
		this.anInt4697 = arg11 * -554761681;
		this.anInt4698 = arg12 * 931947385;
	}

	@OriginalMember(owner = "client!lv", name = "n", descriptor = "(II)Lclient!asc;", line = 22)
	static Class93_Sub1_Sub13 method28580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class93_Sub1_Sub13 local5 = (Class93_Sub1_Sub13) Class695.aClass253_1.method25983((long) arg0);
		if (local5 != null) {
			return local5;
		}
		@Pc(15) byte[] local15 = Class542.aClass497_129.method30064(arg0, 0, (byte) 0);
		if (local15 == null || local15.length <= 1) {
			return null;
		}
		try {
			local5 = Class113.method7408(local15, (short) 30994);
		} catch (@Pc(30) Exception local30) {
			throw new RuntimeException(local30.getMessage() + " " + arg0);
		}
		Class695.aClass253_1.method25986(local5, (long) arg0);
		return local5;
	}

	@OriginalMember(owner = "client!lv", name = "w", descriptor = "(II)Lclient!mj;", line = 53)
	public static Class420 method28581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Class670.aClass146_6 == null ? null : Class670.aClass146_6.method11692(-1946415060).method28664(arg0, (byte) 103);
	}

	@OriginalMember(owner = "client!lv", name = "n", descriptor = "(S)Lclient!kt;", line = 54)
	@Override
	public Class388 method28578(@OriginalArg(0) short arg0) {
		return Class388.aClass388_1;
	}

	@OriginalMember(owner = "client!lv", name = "l", descriptor = "()Lclient!kt;", line = 54)
	@Override
	public Class388 method28579() {
		return Class388.aClass388_1;
	}

	@OriginalMember(owner = "client!lv", name = "aj", descriptor = "(I)Z", line = 552)
	public static boolean method28582(@OriginalArg(0) int arg0) {
		if (Class527.aString222.startsWith("win")) {
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
		} else if (Class527.aString222.startsWith("mac")) {
			try {
				@Pc(68) Process local68 = Runtime.getRuntime().exec("ps -few");
				@Pc(77) BufferedReader local77 = new BufferedReader(new InputStreamReader(local68.getInputStream()));
				try {
					@Pc(80) int local80 = local68.waitFor();
					if (local80 != 0) {
						return false;
					}
				} catch (@Pc(87) InterruptedException local87) {
					return false;
				}
				@Pc(91) boolean local91 = false;
				@Pc(95) String local95;
				while ((local95 = local77.readLine()) != null) {
					if (local95.toLowerCase().indexOf("soundflowerbed") != -1) {
						local91 = true;
						break;
					}
				}
				local77.close();
				return local91;
			} catch (@Pc(110) Exception local110) {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lv", name = "x", descriptor = "(I)V", line = 713)
	public static void method28583(@OriginalArg(0) int arg0) {
		Class312.aClass240_74.method25847((byte) -10);
		Class312.aClass240_77.method25847((byte) -33);
		Class312.aClass240_75.method25847((byte) -107);
		Class312.aClass240_76.method25847((byte) -62);
	}

	@OriginalMember(owner = "client!lv", name = "acn", descriptor = "(Lclient!yf;I)V", line = 10069)
	static final void method28584(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = arg0.aClass386_3.anIntArray435[local12];
	}
}
