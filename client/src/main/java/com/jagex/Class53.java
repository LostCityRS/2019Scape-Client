package com.jagex;

import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acb")
public abstract class Class53 {

	@OriginalMember(owner = "client!acb", name = "ny", descriptor = "[Lclient!aal;")
	static Class14[] aClass14Array2;

	@OriginalMember(owner = "client!acb", name = "e", descriptor = "I")
	protected final int anInt2011;

	@OriginalMember(owner = "client!acb", name = "n", descriptor = "I")
	protected final int anInt2006;

	@OriginalMember(owner = "client!acb", name = "m", descriptor = "I")
	protected final int anInt2007;

	@OriginalMember(owner = "client!acb", name = "k", descriptor = "I")
	protected final int anInt2008;

	@OriginalMember(owner = "client!acb", name = "f", descriptor = "I")
	protected final int anInt2009;

	@OriginalMember(owner = "client!acb", name = "w", descriptor = "I")
	protected final int anInt2005;

	@OriginalMember(owner = "client!acb", name = "l", descriptor = "Z")
	protected final boolean aBoolean360;

	@OriginalMember(owner = "client!acb", name = "u", descriptor = "Z")
	protected final boolean aBoolean361;

	@OriginalMember(owner = "client!acb", name = "z", descriptor = "I")
	protected final int anInt2010;

	@OriginalMember(owner = "client!acb", name = "<init>", descriptor = "(IIIIIIZZI)V", line = 14)
	Class53(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.anInt2011 = arg0 * -704045685;
		this.anInt2006 = arg1 * 1816926333;
		this.anInt2007 = (arg2 > 65535 ? 65535 : arg2) * -1848361869;
		this.anInt2008 = arg3 * 1386677177;
		this.anInt2009 = (arg4 > 255 ? 255 : arg4) * 260482925;
		this.anInt2005 = arg5 * -395873039;
		this.aBoolean360 = arg6;
		this.aBoolean361 = arg7;
		this.anInt2010 = arg8 * -1865268073;
	}

	@OriginalMember(owner = "client!acb", name = "e", descriptor = "(I)[Lclient!nu;", line = 28)
	static Class449[] method14943(@OriginalArg(0) int arg0) {
		return new Class449[] { Class449.aClass449_1, Class449.aClass449_9, Class449.aClass449_11, Class449.aClass449_2, Class449.aClass449_10, Class449.aClass449_5, Class449.aClass449_8, Class449.aClass449_7, Class449.aClass449_4, Class449.aClass449_6, Class449.aClass449_3, Class449.aClass449_12 };
	}

	@OriginalMember(owner = "client!acb", name = "vp", descriptor = "(Lclient!yf;S)V", line = 8851)
	static final void method14944(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		Class348.method27623(local13, new Class93_Sub40(local23, 3), null, true, (byte) 0);
	}

	@OriginalMember(owner = "client!acb", name = "all", descriptor = "(Lclient!yf;I)V", line = 11851)
	static final void method14945(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (Class4.aBoolean2) {
			@Pc(4) Class14[] local4 = Class124_Sub3.method21443(16711935);
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local4.length;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!acb", name = "mx", descriptor = "(J)Ljava/lang/String;", line = 12396)
	static String method14946(@OriginalArg(0) long arg0) {
		return Class285.method26490(new Date(arg0), "EEE dd-MMM-yyyy HH:mm:ss zzz", 1649412825);
	}
}
