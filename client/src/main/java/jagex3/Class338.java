package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class338 {

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "Lclient!ii;")
	public static final Class338 aClass338_6 = new Class338(0, false);

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "Lclient!ii;")
	public static final Class338 aClass338_4 = new Class338(1, false);

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "Lclient!ii;")
	static final Class338 aClass338_5 = new Class338(2, true);

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "Lclient!ii;")
	public static final Class338 aClass338_7 = new Class338(3, false);

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "Lclient!ii;")
	static final Class338 aClass338_9 = new Class338(4, true);

	@OriginalMember(owner = "client!ii", name = "w", descriptor = "Lclient!ii;")
	static final Class338 aClass338_8 = new Class338(5, true);

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "Lclient!ii;")
	static final Class338 aClass338_3 = new Class338(6, true);

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
	public final int anInt4225;

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "Z")
	final boolean aBoolean726;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "(I)Lclient!ii;")
	public static Class338 method27558(@OriginalArg(0) int arg0) {
		if (arg0 == aClass338_6.anInt4225 * -210852351) {
			return aClass338_6;
		} else if (aClass338_4.anInt4225 * -210852351 == arg0) {
			return aClass338_4;
		} else if (arg0 == aClass338_5.anInt4225 * -210852351) {
			return aClass338_5;
		} else if (aClass338_7.anInt4225 * -210852351 == arg0) {
			return aClass338_7;
		} else if (aClass338_9.anInt4225 * -210852351 == arg0) {
			return aClass338_9;
		} else if (arg0 == aClass338_8.anInt4225 * -210852351) {
			return aClass338_8;
		} else if (arg0 == aClass338_3.anInt4225 * -210852351) {
			return aClass338_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ii", name = "bcw", descriptor = "(Lclient!yf;I)V")
	static void method27560(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "(Ljava/lang/String;ZZB)V")
	public static void method27561(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		Class453.method29145(arg0, arg1, "openjs", arg2, (byte) 85);
	}

	@OriginalMember(owner = "client!ii", name = "tt", descriptor = "(Lclient!yf;I)V")
	static void method27562(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 116179572);
		Class229.method25713(local16, arg0, (byte) 115);
	}

	@OriginalMember(owner = "client!ii", name = "axi", descriptor = "(Lclient!yf;B)V")
	static void method27563(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (int) (Class707.aLong311 * -9212939189200455573L / 60000L);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (int) ((Class707.aLong311 * -9212939189200455573L - Class305.method26889(-215627443) - Class99.aLong23 * 6132827453956137203L) / 60000L);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class154_Sub1.aBoolean343 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ii", name = "bx", descriptor = "(Lclient!arm;Lclient!aac;I)I")
	static int method27564(@OriginalArg(0) Class93_Sub1_Sub7 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2) {
		@Pc(3) String local3 = Class110_Sub21.method8544(arg0, -1497248091);
		@Pc(7) int[] local7 = Class477.method29887(arg0, -617857058);
		if (local7 != null) {
			local3 = local3 + Class7.method122(local7, 1591205678);
		}
		@Pc(27) int local27 = arg1.method37(local3, Class110_Sub14.aClass100Array4, (byte) -67);
		if (arg0.aBoolean504) {
			local27 += Class284.aClass100_42.method18201() + 4;
		}
		return local27;
	}

	@OriginalMember(owner = "client!ii", name = "ii", descriptor = "(Lclient!yf;B)V")
	static void method27565(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, -469509040);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class222.method25676(local16, local22, arg0, -1979609075);
	}

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(IZ)V")
	Class338(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt4225 = arg0 * -936027647;
		this.aBoolean726 = arg1;
	}

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "(B)Z")
	public boolean method27556(@OriginalArg(0) byte arg0) {
		return this.aBoolean726;
	}

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "()Z")
	public boolean method27557() {
		return this.aBoolean726;
	}

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "()Z")
	public boolean method27559() {
		return this.aBoolean726;
	}
}
