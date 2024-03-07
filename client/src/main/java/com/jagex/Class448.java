package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public class Class448 {

	@OriginalMember(owner = "client!nt", name = "h", descriptor = "I")
	public static final int anInt4955 = 44;

	@OriginalMember(owner = "client!nt", name = "n", descriptor = "I")
	public static final int anInt4956 = 1;

	@OriginalMember(owner = "client!nt", name = "m", descriptor = "I")
	public static final int anInt4957 = 2;

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
	public static final int anInt4958 = 43;

	@OriginalMember(owner = "client!nt", name = "w", descriptor = "I")
	public static final int anInt4959 = 5;

	@OriginalMember(owner = "client!nt", name = "v", descriptor = "I")
	public static final int anInt4960 = 22;

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
	public static final int anInt4961 = 4;

	@OriginalMember(owner = "client!nt", name = "u", descriptor = "I")
	public static final int anInt4962 = 7;

	@OriginalMember(owner = "client!nt", name = "i", descriptor = "I")
	public static final int anInt4963 = 98;

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
	public static final int anInt4964 = 19;

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
	public static final int anInt4965 = 18;

	@OriginalMember(owner = "client!nt", name = "z", descriptor = "I")
	public static final int anInt4966 = 9;

	@OriginalMember(owner = "client!nt", name = "r", descriptor = "I")
	public static final int anInt4967 = 20;

	@OriginalMember(owner = "client!nt", name = "l", descriptor = "I")
	public static final int anInt4968 = 6;

	@OriginalMember(owner = "client!nt", name = "o", descriptor = "I")
	public static final int anInt4969 = 23;

	@OriginalMember(owner = "client!nt", name = "s", descriptor = "I")
	public static final int anInt4970 = 24;

	@OriginalMember(owner = "client!nt", name = "y", descriptor = "I")
	public static final int anInt4971 = 25;

	@OriginalMember(owner = "client!nt", name = "q", descriptor = "I")
	public static final int anInt4972 = 41;

	@OriginalMember(owner = "client!nt", name = "x", descriptor = "I")
	public static final int anInt4973 = 42;

	@OriginalMember(owner = "client!nt", name = "p", descriptor = "I")
	public static final int anInt4974 = 17;

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "I")
	public static final int anInt4975 = 0;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
	public static final int anInt4976 = 45;

	@OriginalMember(owner = "client!nt", name = "g", descriptor = "I")
	public static final int anInt4977 = 46;

	@OriginalMember(owner = "client!nt", name = "k", descriptor = "I")
	public static final int anInt4978 = 3;

	@OriginalMember(owner = "client!nt", name = "j", descriptor = "I")
	public static final int anInt4979 = 99;

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "(Lclient!yf;I)V", line = 13)
	static void method28919(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = ((Class347) Class288.aClass55_Sub2_1.get(arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], -2004200570)).aString183;
	}

	@OriginalMember(owner = "client!nt", name = "k", descriptor = "(Lclient!alw;I)Lclient!vy;", line = 27)
	public static Class628 method28920(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.g1((short) 16384);
		@Pc(6) int[] local6 = new int[local3];
		for (@Pc(8) int local8 = 0; local8 < local3; local8++) {
			local6[local8] = arg0.g1((short) 16384);
		}
		return new Class628(local6);
	}

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "()V", line = 30)
	Class448() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!nt", name = "n", descriptor = "(B)Z", line = 247)
	public static boolean method28921(@OriginalArg(0) byte arg0) {
		return Class362.aBoolean730;
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(Lclient!dh;I)V", line = 579)
	static void method28922(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (Class454.aClass489_97 != null) {
			arg0.method20604(Class454.aClass489_97);
			arg0.method20601(Class454.aClass470_53);
			arg0.method20569(Class454.anInt5053 * -1957887265, Class454.anInt5050 * -2083758407, Class454.anInt5053 * -1957887265 + Class454.anInt5051 * 1376888697, Class454.anInt5052 * 1520343609 + Class454.anInt5050 * -2083758407);
			arg0.method20566(Class454.anInt5053 * -1957887265, Class454.anInt5050 * -2083758407, Class454.anInt5051 * 1376888697, Class454.anInt5052 * 1520343609);
		}
	}

	@OriginalMember(owner = "client!nt", name = "aux", descriptor = "(Lclient!yf;B)V", line = 13393)
	static final void method28923(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.options.aClass166_Sub34_1.method16204((byte) 4);
	}

	@OriginalMember(owner = "client!nt", name = "bbd", descriptor = "(Lclient!yf;B)V", line = 14356)
	static final void method28924(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!nt", name = "bda", descriptor = "(Lclient!yf;B)V", line = 14695)
	static final void method28925(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class553.anInt3407 * 1249273355;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class553.anInt3407 * 1249273355;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 1;
	}
}
