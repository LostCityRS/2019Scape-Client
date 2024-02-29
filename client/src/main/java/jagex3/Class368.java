package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class368 {

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
	public int anInt4747;

	@OriginalMember(owner = "client!ju", name = "n", descriptor = "I")
	public int anInt4748;

	@OriginalMember(owner = "client!ju", name = "m", descriptor = "I")
	public int anInt4749;

	@OriginalMember(owner = "client!ju", name = "n", descriptor = "([FIFS)F")
	static float method28143(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) short arg3) {
		@Pc(3) float local3 = arg0[arg1];
		for (@Pc(7) int local7 = arg1 - 1; local7 >= 0; local7--) {
			local3 = arg0[local7] + arg2 * local3;
		}
		return local3;
	}

	@OriginalMember(owner = "client!ju", name = "aem", descriptor = "(Lclient!yf;B)V")
	static void method28144(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(9) int local9 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1];
		arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1] = Class464.method29465(local9);
	}

	@OriginalMember(owner = "client!ju", name = "ays", descriptor = "(Lclient!yf;B)V")
	static void method28145(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class481.anInt5303 * -2042157777;
	}

	@OriginalMember(owner = "client!ju", name = "ayc", descriptor = "(Lclient!yf;B)V")
	static void method28146(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class549.anInt5453 * -1276619065;
	}

	@OriginalMember(owner = "client!ju", name = "ce", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method28147(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(17) boolean local17 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091] == 1;
		if (local17 != arg0.aBoolean685) {
			arg0.aBoolean685 = local17;
			Class354.method27789(arg0, -1174743804);
		}
		if (arg0.anInt4011 * 532402067 == -1 && !arg1.aBoolean712) {
			Class667.method33099(arg0.anInt3994 * -1549590237, (short) 26704);
		}
	}

	@OriginalMember(owner = "client!ju", name = "arr", descriptor = "(Lclient!yf;S)V")
	static void method28148(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub17_1, arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091], (byte) 82);
		client.aClass532_1.method30650((byte) 0);
		Class106_Sub1.method5148(1506467753);
		client.aBoolean603 = false;
	}

	@OriginalMember(owner = "client!ju", name = "jt", descriptor = "(Lclient!yf;I)V")
	static void method28149(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
	}
}
