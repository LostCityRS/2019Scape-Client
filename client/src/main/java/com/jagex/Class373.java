package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class373 {

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "Ljava/lang/String;")
	public String aString200;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
	public int anInt4758;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "B")
	public byte aByte150;

	@OriginalMember(owner = "client!kb", name = "alb", descriptor = "(Lclient!yf;I)V")
	static void method28201(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = Class698.anInt6112 * 1760260613;
		@Pc(7) int local7 = Class79_Sub1_Sub1.anInt255 * -1809813621;
		@Pc(9) int local9 = -1;
		if (Class4.aBoolean2) {
			@Pc(14) Class14[] local14 = Class124_Sub3.method21465(16711935);
			for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
				@Pc(24) Class14 local24 = local14[local16];
				if (local24.anInt49 * -1362482655 == local3 && local7 == local24.anInt50 * 72041005) {
					local9 = local16;
					break;
				}
			}
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local9;
	}

	@OriginalMember(owner = "client!kb", name = "aka", descriptor = "(Lclient!yf;B)V")
	static void method28202(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class279.method26542(arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091], 2020016942);
	}

	@OriginalMember(owner = "client!kb", name = "ei", descriptor = "(I)V")
	public static void method28203(@OriginalArg(0) int arg0) {
		Class275.method26437(true, (byte) 6);
	}

	@OriginalMember(owner = "client!kb", name = "axp", descriptor = "(Lclient!yf;B)V")
	static void method28204(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class93_Sub8.method12991(1964973373);
	}

	@OriginalMember(owner = "client!kb", name = "bak", descriptor = "(Lclient!yf;I)V")
	static void method28205(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub2_1.method16555(local12, -628091418);
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
	Class373() {
	}
}
