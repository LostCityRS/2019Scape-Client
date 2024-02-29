package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public class Class373 {

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "Ljava/lang/String;")
	public String aString191;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
	public int anInt4597;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "B")
	public byte aByte150;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V", line = 8)
	Class373() {
	}

	@OriginalMember(owner = "client!kb", name = "ei", descriptor = "(I)V", line = 811)
	public static void method28020(@OriginalArg(0) int arg0) {
		Class275.method26342(true, (byte) 6);
	}

	@OriginalMember(owner = "client!kb", name = "aka", descriptor = "(Lclient!yf;B)V", line = 11703)
	static final void method28021(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class279.method26447(arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], 2020016942);
	}

	@OriginalMember(owner = "client!kb", name = "alb", descriptor = "(Lclient!yf;I)V", line = 11872)
	static final void method28022(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = Class698.anInt5951 * 1760260613;
		@Pc(7) int local7 = Class79_Sub1_Sub1.anInt255 * -1809813621;
		@Pc(9) int local9 = -1;
		if (Class4.aBoolean2) {
			@Pc(14) Class14[] local14 = Class124_Sub3.method21443(16711935);
			for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
				@Pc(24) Class14 local24 = local14[local16];
				if (local24.anInt49 * -1362482655 == local3 && local7 == local24.anInt50 * 72041005) {
					local9 = local16;
					break;
				}
			}
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local9;
	}

	@OriginalMember(owner = "client!kb", name = "axp", descriptor = "(Lclient!yf;B)V", line = 13897)
	static final void method28023(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class93_Sub8.method12992(1964973373);
	}

	@OriginalMember(owner = "client!kb", name = "bak", descriptor = "(Lclient!yf;I)V", line = 14315)
	static final void method28024(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub2_1.method16546(local12, -628091418);
	}
}
