package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class382 {

	@OriginalMember(owner = "client!kj", name = "m", descriptor = "Z")
	public static boolean aBoolean851;

	@OriginalMember(owner = "client!kj", name = "br", descriptor = "Lclient!cm;")
	public static Class99 aClass99_32;

	@OriginalMember(owner = "client!kj", name = "bg", descriptor = "I")
	public static int anInt4539;

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
	public int anInt4538;

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "Ljava/lang/String;")
	public String aString204;

	@OriginalMember(owner = "client!kj", name = "t", descriptor = "B")
	public byte aByte146;

	@OriginalMember(owner = "client!kj", name = "ty", descriptor = "(Lclient!yp;B)V")
	static void method28567(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2027805443);
		Class527.method30714(local16, arg0, 1759372126);
	}

	@OriginalMember(owner = "client!kj", name = "z", descriptor = "(Lclient!di;Lclient!yt;I)I")
	static int method28568(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class694 arg1, @OriginalArg(2) int arg2) {
		if (-1296978199 * arg1.anInt5788 != -1) {
			return arg1.anInt5788 * -1296978199;
		}
		if (arg1.anInt5787 * 318042297 != -1) {
			@Pc(25) Class227 local25 = arg0.aClass235_6.method26120(arg1.anInt5787 * 318042297, 73831368);
			if (!local25.aBoolean758) {
				return local25.aShort161;
			}
		}
		return arg1.anInt5786 * 1001096775;
	}

	@OriginalMember(owner = "client!kj", name = "ajf", descriptor = "(Lclient!yp;B)V")
	static void method28569(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		if (Class544.aClass155_1.method15048(81, (short) -436)) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 1;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!kj", name = "aoj", descriptor = "(Lclient!yp;I)V")
	static void method28570(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = BufferedSocket.aClass121_Sub1_2.method9702(1351329807) == null ? -1 : BufferedSocket.aClass121_Sub1_2.method9702(1073111830).anInt4252 * 1583199675;
	}

	@OriginalMember(owner = "client!kj", name = "jz", descriptor = "(Lclient!yp;I)V")
	static void method28571(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
	}

	@OriginalMember(owner = "client!kj", name = "afz", descriptor = "(Lclient!yp;B)V")
	static void method28572(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5776 -= -1650379242;
		@Pc(14) String local14 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997];
		@Pc(25) String local25 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997 + 1];
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 != null && Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1.aBoolean982) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local25;
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local14;
		}
	}

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
	Class382() {
	}
}
