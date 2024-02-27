package com.jagex;

import java.util.HashMap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xf")
public final class Class657 {

	@OriginalMember(owner = "client!xf", name = "vj", descriptor = "[I")
	public static int[] anIntArray511;

	@OriginalMember(owner = "client!xf", name = "cg", descriptor = "I")
	static int anInt5972;

	@OriginalMember(owner = "client!xf", name = "n", descriptor = "Ljava/util/HashMap;")
	public HashMap aHashMap13;

	@OriginalMember(owner = "client!xf", name = "e", descriptor = "Lclient!mz;")
	Class429 aClass429_3;

	@OriginalMember(owner = "client!xf", name = "lp", descriptor = "(Ljava/lang/String;II)V")
	public static void method32934(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class175 local2 = Class330.method27465(-1553800594);
		@Pc(8) Class93_Sub22 local8 = Class102.method2592(Class446.aClass446_56, local2.aClass24_2, (byte) 31);
		local8.aClass93_Sub41_Sub2_1.method22522(Class46.method894(arg0, -2061366101) + 1, (byte) -21);
		local8.aClass93_Sub41_Sub2_1.method22414(arg0, 98344578);
		local8.aClass93_Sub41_Sub2_1.method22459(arg1, 1243726215);
		local2.method24363(local8, -2038067562);
	}

	@OriginalMember(owner = "client!xf", name = "m", descriptor = "([BIIB)Ljava/lang/String;")
	public static String method32935(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(2) char[] local2 = new char[arg2];
		@Pc(4) int local4 = 0;
		@Pc(6) int local6 = arg1;
		@Pc(10) int local10 = arg1 + arg2;
		while (local6 < local10) {
			@Pc(20) int local20 = arg0[local6++] & 0xFF;
			@Pc(27) int local27;
			if (local20 < 128) {
				if (local20 == 0) {
					local27 = 65533;
				} else {
					local27 = local20;
				}
			} else if (local20 < 192) {
				local27 = 65533;
			} else if (local20 < 224) {
				if (local6 < local10 && (arg0[local6] & 0xC0) == 128) {
					local27 = (local20 & 0x1F) << 6 | arg0[local6++] & 0x3F;
					if (local27 < 128) {
						local27 = 65533;
					}
				} else {
					local27 = 65533;
				}
			} else if (local20 < 240) {
				if (local6 + 1 < local10 && (arg0[local6] & 0xC0) == 128 && (arg0[local6 + 1] & 0xC0) == 128) {
					local27 = (local20 & 0xF) << 12 | (arg0[local6++] & 0x3F) << 6 | arg0[local6++] & 0x3F;
					if (local27 < 2048) {
						local27 = 65533;
					}
				} else {
					local27 = 65533;
				}
			} else if (local20 >= 248) {
				local27 = 65533;
			} else if (local6 + 2 < local10 && (arg0[local6] & 0xC0) == 128 && (arg0[local6 + 1] & 0xC0) == 128 && (arg0[local6 + 2] & 0xC0) == 128) {
				local27 = (local20 & 0x7) << 18 | (arg0[local6++] & 0x3F) << 12 | (arg0[local6++] & 0x3F) << 6 | arg0[local6++] & 0x3F;
				if (local27 >= 65536 && local27 <= 1114111) {
					local27 = 65533;
				} else {
					local27 = 65533;
				}
			} else {
				local27 = 65533;
			}
			local2[local4++] = (char) local27;
		}
		return new String(local2, 0, local4);
	}

	@OriginalMember(owner = "client!xf", name = "akv", descriptor = "(Lclient!yf;I)V")
	static void method32936(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		Class676.method33403(local12, -1709818384);
	}

	@OriginalMember(owner = "client!xf", name = "e", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method32937(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			@Pc(13) char local13 = arg0.charAt(local6);
			if (local13 == '<' || local13 == '>') {
				local4 += 3;
			}
		}
		@Pc(29) StringBuilder local29 = new StringBuilder(local4 + local2);
		for (@Pc(31) int local31 = 0; local31 < local2; local31++) {
			@Pc(38) char local38 = arg0.charAt(local31);
			if (local38 == '<') {
				local29.append("<lt>");
			} else if (local38 == '>') {
				local29.append("<gt>");
			} else {
				local29.append(local38);
			}
		}
		return local29.toString();
	}

	@OriginalMember(owner = "client!xf", name = "m", descriptor = "(CI)Z")
	public static boolean method32938(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		if (arg0 > ' ' && arg0 < '\u007f' || !(arg0 <= '\u007f' || arg0 >= ' ') || arg0 > ' ' && arg0 <= 'ÿ') {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(24) char[] local24 = Class712.aCharArray8;
			for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
				@Pc(34) char local34 = local24[local26];
				if (arg0 == local34) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!xf", name = "<init>", descriptor = "(Lclient!mz;)V")
	public Class657(@OriginalArg(0) Class429 arg0) {
		this.method32932(-861778233);
		this.aClass429_3 = arg0;
	}

	@OriginalMember(owner = "client!xf", name = "n", descriptor = "()V")
	void method32931() {
		this.aHashMap13 = new HashMap();
		this.aHashMap13.put(Class508.aClass508_6, 50);
	}

	@OriginalMember(owner = "client!xf", name = "e", descriptor = "(I)V")
	void method32932(@OriginalArg(0) int arg0) {
		this.aHashMap13 = new HashMap();
		this.aHashMap13.put(Class508.aClass508_6, 50);
	}

	@OriginalMember(owner = "client!xf", name = "m", descriptor = "()V")
	void method32933() {
		this.aHashMap13 = new HashMap();
		this.aHashMap13.put(Class508.aClass508_6, 50);
	}
}
