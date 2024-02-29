package jagex3;

import java.awt.EventQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public final class Class604 implements Interface75 {

	@OriginalMember(owner = "client!uw", name = "bu", descriptor = "Ljava/awt/EventQueue;")
	static EventQueue anEventQueue1;

	@OriginalMember(owner = "client!uw", name = "cw", descriptor = "Lclient!cm;")
	static Class100 aClass100_50;

	@OriginalMember(owner = "client!uw", name = "e", descriptor = "Lclient!uw;")
	static final Class604 aClass604_4 = new Class604(0);

	@OriginalMember(owner = "client!uw", name = "n", descriptor = "Lclient!uw;")
	public static final Class604 aClass604_3 = new Class604(1);

	@OriginalMember(owner = "client!uw", name = "m", descriptor = "I")
	int anInt5714;

	@OriginalMember(owner = "client!uw", name = "w", descriptor = "()[Lclient!uw;")
	static Class604[] method32067() {
		return new Class604[] { aClass604_4, aClass604_3 };
	}

	@OriginalMember(owner = "client!uw", name = "m", descriptor = "()[Lclient!uw;")
	static Class604[] method32068() {
		return new Class604[] { aClass604_4, aClass604_3 };
	}

	@OriginalMember(owner = "client!uw", name = "f", descriptor = "()[Lclient!uw;")
	static Class604[] method32069() {
		return new Class604[] { aClass604_4, aClass604_3 };
	}

	@OriginalMember(owner = "client!uw", name = "lj", descriptor = "(Lclient!yf;I)V")
	static void method32070(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1614972612);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class675.method33347(local16, local22, arg0, -1862892858);
	}

	@OriginalMember(owner = "client!uw", name = "zw", descriptor = "(Lclient!yf;I)V")
	static void method32071(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 463840436;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		@Pc(43) int local43 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 3];
		@Pc(49) Class39 local49 = (Class39) Class19.aClass32_Sub7_5.method18273(local33, 1866311135);
		if (local49.aClass519_2.method37101() != local13 || local49.aClass519_1.method37101() != local23) {
			throw new RuntimeException(local33 + " " + local43);
		} else if (local23 == Class519.aClass519_7.method37101()) {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local49.method749(local43, -564286328);
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local49.method748(local43, -833256997);
		}
	}

	@OriginalMember(owner = "client!uw", name = "abv", descriptor = "(Lclient!yf;I)V")
	static void method32072(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		Class176.method24399(local13, true, (byte) 62);
	}

	@OriginalMember(owner = "client!uw", name = "alv", descriptor = "(Lclient!yf;I)V")
	static void method32073(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		if (local12 >= 1 && local12 <= 2) {
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub23_1, local12, (byte) 35);
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub23_2, local12, (byte) 13);
			Class106_Sub1.method5148(-566041292);
		}
	}

	@OriginalMember(owner = "client!uw", name = "bad", descriptor = "(Lclient!yf;I)V")
	static void method32074(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(I)V")
	Class604(@OriginalArg(0) int arg0) {
		this.anInt5714 = arg0 * -200282389;
	}

	@OriginalMember(owner = "client!uw", name = "n", descriptor = "()I")
	@Override
	public int method37101() {
		return this.anInt5714 * -818656829;
	}

	@OriginalMember(owner = "client!uw", name = "k", descriptor = "()I")
	@Override
	public int method37100() {
		return this.anInt5714 * -818656829;
	}
}
