package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public class Class368 {

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
	public int anInt4586;

	@OriginalMember(owner = "client!ju", name = "n", descriptor = "I")
	public int anInt4587;

	@OriginalMember(owner = "client!ju", name = "m", descriptor = "I")
	public int anInt4588;

	@OriginalMember(owner = "client!ju", name = "n", descriptor = "([FIFS)F", line = 106)
	static float method27962(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) short arg3) {
		@Pc(3) float local3 = arg0[arg1];
		for (@Pc(7) int local7 = arg1 - 1; local7 >= 0; local7--) {
			local3 = arg0[local7] + arg2 * local3;
		}
		return local3;
	}

	@OriginalMember(owner = "client!ju", name = "ce", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 5311)
	static final void method27963(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(17) boolean local17 = arg2.anIntArray519[(arg2.anInt5891 -= 1189701933) * -1497248091] == 1;
		if (local17 != arg0.aBoolean681) {
			arg0.aBoolean681 = local17;
			Class354.method27694(arg0, -1174743804);
		}
		if (arg0.anInt3970 * 532402067 == -1 && !arg1.aBoolean708) {
			Class667.method32915(arg0.anInt3953 * -1549590237, (short) 26704);
		}
	}

	@OriginalMember(owner = "client!ju", name = "jt", descriptor = "(Lclient!yf;I)V", line = 6677)
	static final void method27964(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
	}

	@OriginalMember(owner = "client!ju", name = "aem", descriptor = "(Lclient!yf;B)V", line = 10434)
	static final void method27965(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(9) int local9 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 1];
		arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 1] = Class464.method29290(local9);
	}

	@OriginalMember(owner = "client!ju", name = "arr", descriptor = "(Lclient!yf;S)V", line = 13043)
	static final void method27966(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		Class51.options.method14363(Class51.options.aClass166_Sub17_1, arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], (byte) 82);
		client.world.method30533((byte) 0);
		Class106_Sub1.method5135(1506467753);
		client.aBoolean601 = false;
	}

	@OriginalMember(owner = "client!ju", name = "ays", descriptor = "(Lclient!yf;B)V", line = 13999)
	static final void method27967(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class481.userGraceExpiry * -2042157777;
	}

	@OriginalMember(owner = "client!ju", name = "ayc", descriptor = "(Lclient!yf;B)V", line = 14015)
	static final void method27968(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class549.userPlayAge * -1276619065;
	}
}
