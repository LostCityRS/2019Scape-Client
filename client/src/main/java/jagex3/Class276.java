package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
final class Class276 implements Interface39 {

	@OriginalMember(owner = "client!fv", name = "hm", descriptor = "Lclient!abe;")
	public static Class32 aClass32_3;

	@OriginalMember(owner = "client!fv", name = "bb", descriptor = "Lclient!eu;")
	static Class106 aClass106_10;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fv", name = "this$0", descriptor = "Lclient!fb;")
	final Class258 aClass258_12;

	@OriginalMember(owner = "client!fv", name = "z", descriptor = "(I)V")
	static void method26440(@OriginalArg(0) int arg0) {
		if (Class168.anInt2443 * 469822389 <= 0) {
			Class168.aString61 = "";
			return;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < Class518.aStringArray35.length; local7++) {
			if (Class518.aStringArray35[local7].indexOf("--> ") != -1) {
				local5++;
				if (local5 == Class168.anInt2443 * 469822389) {
					Class168.aString61 = Class518.aStringArray35[local7].substring(Class518.aStringArray35[local7].indexOf(62) + 2);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fv", name = "arm", descriptor = "(Lclient!yf;I)V")
	static void method26441(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091] == 1 ? 1 : 0, (byte) 18);
		client.aClass532_1.method30650((byte) 0);
		Class106_Sub1.method5148(1620430151);
		client.aBoolean603 = false;
	}

	@OriginalMember(owner = "client!fv", name = "vv", descriptor = "(Lclient!yf;I)V")
	static void method26442(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 139279356);
		if (local16.aString171 == null) {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local16.aString171;
		}
	}

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!fb;)V")
	Class276(@OriginalArg(0) Class258 arg0) {
		this.aClass258_12 = arg0;
	}

	@OriginalMember(owner = "client!fv", name = "n", descriptor = "()F")
	@Override
	public float method26439() {
		return (float) Class51.aClass93_Sub36_1.aClass166_Sub35_2.method16235(1732022890) / 255.0F;
	}

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "(I)F")
	@Override
	public float method26438(@OriginalArg(0) int arg0) {
		return (float) Class51.aClass93_Sub36_1.aClass166_Sub35_2.method16235(-1215622030) / 255.0F;
	}
}
