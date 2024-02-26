package com.jagex;

import java.awt.Point;
import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class289 implements Interface75 {

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "Lclient!pf;")
	static Class480 aClass480_90;

	@OriginalMember(owner = "client!gj", name = "hg", descriptor = "Lclient!aoi;")
	public static Class41_Sub8 aClass41_Sub8_1;

	@OriginalMember(owner = "client!gj", name = "t", descriptor = "Lclient!gj;")
	public static final Class289 aClass289_2 = new Class289(0, 0);

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "Lclient!gj;")
	public static final Class289 aClass289_3 = new Class289(2, 1);

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "Lclient!gj;")
	public static final Class289 aClass289_4 = new Class289(1, 2);

	@OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
	final int anInt3943;

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
	final int anInt3944;

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "()[Lclient!gj;")
	public static Class289[] method26919() {
		return new Class289[] { aClass289_2, aClass289_4, aClass289_3 };
	}

	@OriginalMember(owner = "client!gj", name = "t", descriptor = "(I)[Lclient!gj;")
	public static Class289[] method26920(@OriginalArg(0) int arg0) {
		return new Class289[] { aClass289_2, aClass289_4, aClass289_3 };
	}

	@OriginalMember(owner = "client!gj", name = "t", descriptor = "(Ljava/io/File;I)V")
	static void method26921(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1) {
		Class553.aFile4 = arg0;
		if (!Class553.aFile4.exists()) {
			throw new RuntimeException("");
		}
		Class553.aBoolean913 = true;
	}

	@OriginalMember(owner = "client!gj", name = "abn", descriptor = "(Lclient!yp;I)V")
	static void method26922(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class134.aClass305_1.method27140(local12, -85229527).method27054(619815856);
	}

	@OriginalMember(owner = "client!gj", name = "ayu", descriptor = "(Lclient!yp;I)V")
	static void method26923(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) boolean local1 = true;
		if (client.aBoolean705) {
			try {
				@Pc(7) Object local7 = Class442.aClass442_8.method29190(1612376134);
				if (local7 != null) {
					local1 = (Boolean) local7;
				}
			} catch (@Pc(16) Throwable local16) {
			}
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!gj", name = "bfi", descriptor = "(Lclient!yp;I)V")
	static void method26924(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!gj", name = "gp", descriptor = "(IB)V")
	static void method26925(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (Class703.aClass80_Sub37_49.aClass165_Sub46_1.method16910(1990223208) == 0) {
			arg0 = -1;
		}
		if (client.anInt3525 * -284278233 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(21) Class674 local21 = (Class674) Class279.aClass41_Sub4_1.method18054(arg0, 1387062021);
			@Pc(25) Class109 local25 = local21.method33577(-12406613);
			if (local25 == null) {
				arg0 = -1;
			} else {
				Class365.aClass555_1.setcustomcursor(Class454.aCanvas6, local25.method7117(true), local25.method7126(), local25.method7137(), new Point(local21.anInt5733 * -103573951, local21.anInt5735 * 527126297));
				client.anInt3525 = arg0 * -724759145;
			}
		}
		if (arg0 == -1 && client.anInt3525 * -284278233 != -1) {
			Class365.aClass555_1.setcustomcursor(Class454.aCanvas6, null, -1, -1, new Point());
			client.anInt3525 = 724759145;
		}
	}

	@OriginalMember(owner = "client!gj", name = "awt", descriptor = "(Lclient!yp;B)V")
	static void method26926(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (client.anInt3460 * 1849344509 != -1) {
			if (local12 == 0) {
				arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.anInt3460 * 1849344509;
				return;
			}
			local12--;
		}
		@Pc(43) Class80_Sub40 local43 = (Class80_Sub40) client.aClass24_20.method580((byte) -73);
		while (local12-- > 0) {
			local43 = (Class80_Sub40) client.aClass24_20.method566((byte) 7);
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local43.anInt3156 * -151091669;
	}

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(II)V")
	Class289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3943 = arg0 * -1456356687;
		this.anInt3944 = arg1 * 304303953;
	}

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt3944 * -1944888911;
	}

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt3944 * -1944888911;
	}

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt3944 * -1944888911;
	}
}
