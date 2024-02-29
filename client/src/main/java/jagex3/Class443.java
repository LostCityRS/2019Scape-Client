package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class443 implements Interface75 {

	@OriginalMember(owner = "client!nn", name = "gl", descriptor = "Lclient!py;")
	public static Class497 aClass497_115;

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "Lclient!nn;")
	static final Class443 aClass443_10 = new Class443(0, -1, true, false, true);

	@OriginalMember(owner = "client!nn", name = "n", descriptor = "Lclient!nn;")
	static final Class443 aClass443_9 = new Class443(1, 0, true, true, true);

	@OriginalMember(owner = "client!nn", name = "m", descriptor = "Lclient!nn;")
	static final Class443 aClass443_3 = new Class443(2, 1, true, true, false);

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "Lclient!nn;")
	static final Class443 aClass443_4 = new Class443(3, 8, false, true, true);

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "Lclient!nn;")
	static final Class443 aClass443_2 = new Class443(4, 9, false, false, true);

	@OriginalMember(owner = "client!nn", name = "w", descriptor = "Lclient!nn;")
	static final Class443 aClass443_5 = new Class443(5, 10, false, true, true);

	@OriginalMember(owner = "client!nn", name = "l", descriptor = "Lclient!nn;")
	static final Class443 aClass443_6 = new Class443(6, 11, false, false, true);

	@OriginalMember(owner = "client!nn", name = "u", descriptor = "Lclient!nn;")
	static final Class443 aClass443_7 = new Class443(7, 12, false, false, true);

	@OriginalMember(owner = "client!nn", name = "z", descriptor = "Lclient!nn;")
	static final Class443 aClass443_8 = new Class443(8, 13, false, false, true);

	@OriginalMember(owner = "client!nn", name = "p", descriptor = "I")
	final int anInt5055;

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
	public final int anInt5054;

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "Z")
	public final boolean aBoolean780;

	@OriginalMember(owner = "client!nn", name = "r", descriptor = "Z")
	public final boolean aBoolean779;

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "(I)[Lclient!nn;")
	public static Class443[] method29046(@OriginalArg(0) int arg0) {
		return new Class443[] { aClass443_7, aClass443_3, aClass443_5, aClass443_4, aClass443_6, aClass443_8, aClass443_9, aClass443_10, aClass443_2 };
	}

	@OriginalMember(owner = "client!nn", name = "m", descriptor = "()[Lclient!nn;")
	public static Class443[] method29047() {
		return new Class443[] { aClass443_7, aClass443_3, aClass443_5, aClass443_4, aClass443_6, aClass443_8, aClass443_9, aClass443_10, aClass443_2 };
	}

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "()[Lclient!nn;")
	public static Class443[] method29048() {
		return new Class443[] { aClass443_7, aClass443_3, aClass443_5, aClass443_4, aClass443_6, aClass443_8, aClass443_9, aClass443_10, aClass443_2 };
	}

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "(Lclient!py;Ljava/lang/String;ZB)Lclient!tw;")
	public static Class584 method29049(@OriginalArg(0) Class497 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		@Pc(4) int local4 = arg0.method30248(arg1, -1497248091);
		if (local4 == -1) {
			return new Class584(0);
		}
		@Pc(18) byte[] local18 = arg0.method30225(local4, 1, (byte) 0);
		if (local18 == null) {
			return new Class584(0);
		}
		@Pc(30) Class93_Sub41 local30 = new Class93_Sub41(local18);
		@Pc(34) int local34 = local30.method22427(-1434290800);
		@Pc(39) Class584 local39 = new Class584(local34);
		@Pc(41) int local41 = 0;
		while (true) {
			while (local41 < local39.anInt5597 * 1285867561) {
				@Pc(51) int local51 = local30.method22431(-118643075);
				@Pc(55) int local55 = local30.method22427(-1434290800);
				@Pc(59) int local59 = local30.method22425((short) 16384);
				if (!arg2 && local59 == 1) {
					local39.anInt5597 -= -2084350951;
				} else {
					local39.anIntArray475[local41] = local51;
					local39.anIntArray474[local41] = local55;
					local41++;
				}
			}
			return local39;
		}
	}

	@OriginalMember(owner = "client!nn", name = "ws", descriptor = "(Lclient!yf;S)V")
	static void method29050(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class624.aClass120_1.method8669(local12, -165618893);
	}

	@OriginalMember(owner = "client!nn", name = "l", descriptor = "(I)Lclient!alc;")
	public static Class154_Sub1 method29051(@OriginalArg(0) int arg0) {
		return Class50.anInt194 * -621240299 < Class50.aClass154_Sub1Array1.length ? Class50.aClass154_Sub1Array1[(Class50.anInt194 += 291909437) * -621240299 - 1] : null;
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	static String method29052(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Class527.aString231.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class527.aString231.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class527.aString231.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(IIZZZ)V")
	Class443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5055 = arg0 * -389425723;
		this.anInt5054 = arg1 * 1820500783;
		this.aBoolean780 = arg3;
		this.aBoolean779 = arg4;
	}

	@OriginalMember(owner = "client!nn", name = "n", descriptor = "()I")
	@Override
	public int method37101() {
		return this.anInt5055 * 1363599629;
	}

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "()I")
	@Override
	public int method37100() {
		return this.anInt5055 * 1363599629;
	}
}
