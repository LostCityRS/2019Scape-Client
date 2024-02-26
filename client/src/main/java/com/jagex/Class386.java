package com.jagex;

import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class386 {

	@OriginalMember(owner = "client!kr", name = "t", descriptor = "Ljava/lang/String;")
	final String aString205;

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "Ljava/lang/String;")
	final String aString206;

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "Ljava/lang/String;")
	final String aString207;

	@OriginalMember(owner = "client!kr", name = "s", descriptor = "(Ljava/awt/image/BufferedImage;B)[I")
	public static int[] method28603(@OriginalArg(0) BufferedImage arg0, @OriginalArg(1) byte arg1) {
		if (arg0.getType() != 10 && arg0.getType() != 0) {
			return arg0.getRGB(0, 0, arg0.getWidth(), arg0.getHeight(), null, 0, arg0.getWidth());
		}
		@Pc(8) Object local8 = null;
		@Pc(19) int[] local19 = arg0.getRaster().getPixels(0, 0, arg0.getWidth(), arg0.getHeight(), (int[]) local8);
		@Pc(26) int[] local26 = new int[arg0.getWidth() * arg0.getHeight()];
		@Pc(32) int local32;
		if (arg0.getType() == 10) {
			for (local32 = 0; local32 < local26.length; local32++) {
				local26[local32] = (local19[local32] << 8) + -16777216 + (local19[local32] << 16) + local19[local32];
			}
		} else {
			for (local32 = 0; local32 < local26.length; local32++) {
				@Pc(69) int local69 = local32 * 2;
				local26[local32] = local19[local69] + (local19[local69 + 1] << 24) + (local19[local69] << 16) + (local19[local69] << 8);
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!kr", name = "us", descriptor = "(Lclient!yp;I)V")
	static void method28604(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2026792573);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anInt4082 * 254495303;
	}

	@OriginalMember(owner = "client!kr", name = "azu", descriptor = "(Lclient!yp;B)V")
	static void method28605(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!kr", name = "wc", descriptor = "(Lclient!yp;B)V")
	static void method28606(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -664415586;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(43) int local43 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 3];
		@Pc(53) int local53 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 4];
		@Pc(63) int local63 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 5];
		@Pc(82) Class529 local82 = Class490.aClass263_13.method26536(Class280.aClass280_1, Class490.aClass263_13, local13, local23, local43, Class278.aClass278_5.method26831(-197175426), Class269.aClass269_5, 0.0F, 0.0F, null, 0, local53, false, -45413264);
		if (local82 != null) {
			Class490.aClass263_13.method26575(local82, local63, local33, (byte) -38);
		}
	}

	@OriginalMember(owner = "client!kr", name = "sr", descriptor = "(Lclient!yp;I)V")
	static void method28607(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(24) int local24 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(30) Class79 local30 = (Class79) Class370.aClass41_Sub10_1.method18054(local24, 137853496);
		if (local30.method1428(-592656069)) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local11.method27645(local24, local30.aString11, 2058911646);
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.method27648(local24, local30.anInt253 * 680817871, 2008199031);
		}
	}

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	Class386(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString205 = arg0;
		this.aString206 = arg1;
		this.aString207 = arg2;
	}
}
