package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aah")
public final class Class9 {

	@OriginalMember(owner = "client!aah", name = "fl", descriptor = "Lclient!pf;")
	public static Class480 aClass480_1;

	@OriginalMember(owner = "client!aah", name = "k", descriptor = "I")
	int anInt20;

	@OriginalMember(owner = "client!aah", name = "r", descriptor = "I")
	int anInt22;

	@OriginalMember(owner = "client!aah", name = "i", descriptor = "[B")
	byte[] aByteArray4;

	@OriginalMember(owner = "client!aah", name = "o", descriptor = "I")
	int anInt24;

	@OriginalMember(owner = "client!aah", name = "x", descriptor = "B")
	byte aByte1;

	@OriginalMember(owner = "client!aah", name = "s", descriptor = "I")
	int anInt26;

	@OriginalMember(owner = "client!aah", name = "d", descriptor = "I")
	int anInt27;

	@OriginalMember(owner = "client!aah", name = "w", descriptor = "I")
	int anInt28;

	@OriginalMember(owner = "client!aah", name = "q", descriptor = "I")
	int anInt30;

	@OriginalMember(owner = "client!aah", name = "h", descriptor = "I")
	int anInt31;

	@OriginalMember(owner = "client!aah", name = "z", descriptor = "I")
	int anInt33;

	@OriginalMember(owner = "client!aah", name = "j", descriptor = "[B")
	byte[] aByteArray5;

	@OriginalMember(owner = "client!aah", name = "b", descriptor = "I")
	int anInt34;

	@OriginalMember(owner = "client!aah", name = "p", descriptor = "I")
	int anInt35;

	@OriginalMember(owner = "client!aah", name = "y", descriptor = "I")
	int anInt37;

	@OriginalMember(owner = "client!aah", name = "am", descriptor = "I")
	int anInt38;

	@OriginalMember(owner = "client!aah", name = "t", descriptor = "I")
	final int anInt36 = 4096;

	@OriginalMember(owner = "client!aah", name = "f", descriptor = "I")
	final int anInt18 = 16;

	@OriginalMember(owner = "client!aah", name = "e", descriptor = "I")
	final int anInt19 = 258;

	@OriginalMember(owner = "client!aah", name = "u", descriptor = "I")
	final int anInt29 = 6;

	@OriginalMember(owner = "client!aah", name = "l", descriptor = "I")
	final int anInt21 = 50;

	@OriginalMember(owner = "client!aah", name = "g", descriptor = "I")
	final int anInt25 = 18002;

	@OriginalMember(owner = "client!aah", name = "m", descriptor = "I")
	int anInt23 = 0;

	@OriginalMember(owner = "client!aah", name = "a", descriptor = "I")
	int anInt32 = 0;

	@OriginalMember(owner = "client!aah", name = "v", descriptor = "[I")
	int[] anIntArray1 = new int[256];

	@OriginalMember(owner = "client!aah", name = "n", descriptor = "[I")
	int[] anIntArray2 = new int[257];

	@OriginalMember(owner = "client!aah", name = "ax", descriptor = "[Z")
	boolean[] aBooleanArray2 = new boolean[256];

	@OriginalMember(owner = "client!aah", name = "ay", descriptor = "[Z")
	boolean[] aBooleanArray1 = new boolean[16];

	@OriginalMember(owner = "client!aah", name = "ai", descriptor = "[B")
	byte[] aByteArray6 = new byte[256];

	@OriginalMember(owner = "client!aah", name = "aq", descriptor = "[B")
	byte[] aByteArray3 = new byte[4096];

	@OriginalMember(owner = "client!aah", name = "ao", descriptor = "[I")
	int[] anIntArray3 = new int[16];

	@OriginalMember(owner = "client!aah", name = "aj", descriptor = "[B")
	byte[] aByteArray7 = new byte[18002];

	@OriginalMember(owner = "client!aah", name = "ac", descriptor = "[B")
	byte[] aByteArray8 = new byte[18002];

	@OriginalMember(owner = "client!aah", name = "ag", descriptor = "[[B")
	byte[][] aByteArrayArray1 = new byte[6][258];

	@OriginalMember(owner = "client!aah", name = "ab", descriptor = "[[I")
	int[][] anIntArrayArray1 = new int[6][258];

	@OriginalMember(owner = "client!aah", name = "al", descriptor = "[[I")
	int[][] anIntArrayArray2 = new int[6][258];

	@OriginalMember(owner = "client!aah", name = "ah", descriptor = "[[I")
	int[][] anIntArrayArray3 = new int[6][258];

	@OriginalMember(owner = "client!aah", name = "af", descriptor = "[I")
	int[] anIntArray4 = new int[6];

	@OriginalMember(owner = "client!aah", name = "f", descriptor = "(IB)V")
	static void method315(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		Class264.anInt3914 = arg0 * -1833432385;
		Class101.aClass243_7.method26256(1693912082);
	}

	@OriginalMember(owner = "client!aah", name = "t", descriptor = "(B)[Lclient!vb;")
	public static Class608[] method316(@OriginalArg(0) byte arg0) {
		return new Class608[] { Class608.aClass608_3, Class608.aClass608_4, Class608.aClass608_5 };
	}

	@OriginalMember(owner = "client!aah", name = "kq", descriptor = "(IB)Ljava/lang/String;")
	static String method317(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) String local2 = Integer.toString(arg0);
		for (@Pc(7) int local7 = local2.length() - 3; local7 > 0; local7 -= 3) {
			local2 = local2.substring(0, local7) + Class256.aString157 + local2.substring(local7);
		}
		if (local2.length() > 9) {
			return " " + Class90.method1870(65408, -1821950061) + local2.substring(0, local2.length() - 8) + Class60.aClass60_162.method1180(Class512.aClass719_3, 1252586521) + " (" + local2 + ")" + Class256.aString156;
		} else if (local2.length() > 6) {
			return " " + Class90.method1870(16777215, -1813303021) + local2.substring(0, local2.length() - 4) + Class60.aClass60_144.method1180(Class512.aClass719_3, -527590962) + " (" + local2 + ")" + Class256.aString156;
		} else {
			return " " + Class90.method1870(16776960, -1108949736) + local2 + Class256.aString156;
		}
	}

	@OriginalMember(owner = "client!aah", name = "<init>", descriptor = "()V")
	Class9() {
	}
}
