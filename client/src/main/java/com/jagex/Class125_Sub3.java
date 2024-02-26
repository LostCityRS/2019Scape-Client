package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahs")
public final class Class125_Sub3 extends Class125 {

	@OriginalMember(owner = "client!ahs", name = "os", descriptor = "I")
	public static int anInt1185;

	@OriginalMember(owner = "client!ahs", name = "j", descriptor = "I")
	public final int anInt1183;

	@OriginalMember(owner = "client!ahs", name = "a", descriptor = "I")
	public final int anInt1184;

	@OriginalMember(owner = "client!ahs", name = "m", descriptor = "(Lclient!ald;)Lclient!kn;")
	public static Class125 method10216(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(3) Class125 local3 = Class524.method30653(arg0, (byte) -70);
		@Pc(7) int local7 = arg0.method23182(-1086836242);
		@Pc(11) int local11 = arg0.method23182(-147719455);
		return new Class125_Sub3(local3.aClass391_8, local3.aClass383_8, local3.anInt2899 * 808275465, local3.anInt2901 * 1789354437, local3.anInt2900 * 199320851, local3.anInt2903 * 1087492339, local3.anInt2902 * -173381277, local3.anInt2904 * -176628393, local3.anInt2905 * -1330014629, local7, local11);
	}

	@OriginalMember(owner = "client!ahs", name = "g", descriptor = "(Lclient!ald;)Lclient!kn;")
	public static Class125 method10217(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(3) Class125 local3 = Class524.method30653(arg0, (byte) -91);
		@Pc(7) int local7 = arg0.method23182(77639089);
		@Pc(11) int local11 = arg0.method23182(1479910332);
		return new Class125_Sub3(local3.aClass391_8, local3.aClass383_8, local3.anInt2899 * 808275465, local3.anInt2901 * 1789354437, local3.anInt2900 * 199320851, local3.anInt2903 * 1087492339, local3.anInt2902 * -173381277, local3.anInt2904 * -176628393, local3.anInt2905 * -1330014629, local7, local11);
	}

	@OriginalMember(owner = "client!ahs", name = "i", descriptor = "(Lclient!ald;)Lclient!kn;")
	public static Class125 method10218(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(3) Class125 local3 = Class524.method30653(arg0, (byte) -87);
		@Pc(7) int local7 = arg0.method23182(-1436551962);
		@Pc(11) int local11 = arg0.method23182(-558901358);
		return new Class125_Sub3(local3.aClass391_8, local3.aClass383_8, local3.anInt2899 * 808275465, local3.anInt2901 * 1789354437, local3.anInt2900 * 199320851, local3.anInt2903 * 1087492339, local3.anInt2902 * -173381277, local3.anInt2904 * -176628393, local3.anInt2905 * -1330014629, local7, local11);
	}

	@OriginalMember(owner = "client!ahs", name = "o", descriptor = "(Lclient!ald;)Lclient!kn;")
	public static Class125 method10219(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(3) Class125 local3 = Class524.method30653(arg0, (byte) -4);
		@Pc(7) int local7 = arg0.method23182(-461883384);
		@Pc(11) int local11 = arg0.method23182(-176213774);
		return new Class125_Sub3(local3.aClass391_8, local3.aClass383_8, local3.anInt2899 * 808275465, local3.anInt2901 * 1789354437, local3.anInt2900 * 199320851, local3.anInt2903 * 1087492339, local3.anInt2902 * -173381277, local3.anInt2904 * -176628393, local3.anInt2905 * -1330014629, local7, local11);
	}

	@OriginalMember(owner = "client!ahs", name = "ji", descriptor = "(I)V")
	static void method10220(@OriginalArg(0) int arg0) {
		@Pc(2) Class80_Sub36_Sub1 local2 = client.aClass75_1.aClass80_Sub36_Sub1_1;
		local2.method22560(1668075746);
		@Pc(10) int local10 = local2.method22559(8, -325783685);
		@Pc(17) int local17;
		if (local10 < client.anInt3453 * -1702559601) {
			for (local17 = local10; local17 < client.anInt3453 * -1702559601; local17++) {
				client.anIntArray311[(client.anInt3457 += -2056063853) * 381176219 - 1] = client.anIntArray304[local17];
			}
		}
		if (local10 > client.anInt3453 * -1702559601) {
			throw new RuntimeException();
		}
		client.anInt3453 = 0;
		for (local17 = 0; local17 < local10; local17++) {
			@Pc(58) int local58 = client.anIntArray304[local17];
			@Pc(66) Class120_Sub1_Sub1_Sub1_Sub1 local66 = (Class120_Sub1_Sub1_Sub1_Sub1) ((Class80_Sub19) client.aClass24_18.method560((long) local58)).anObject5;
			@Pc(71) int local71 = local2.method22559(1, -325783685);
			if (local71 == 0) {
				client.anIntArray304[(client.anInt3453 += 192683631) * -1702559601 - 1] = local58;
				local66.anInt2694 = client.anInt3456 * -1555677495;
			} else {
				@Pc(96) int local96 = local2.method22559(2, -325783685);
				if (local96 == 0) {
					client.anIntArray304[(client.anInt3453 += 192683631) * -1702559601 - 1] = local58;
					local66.anInt2694 = client.anInt3456 * -1555677495;
					client.anIntArray308[(client.anInt3438 += -304368359) * 1467537193 - 1] = local58;
				} else {
					@Pc(158) Class716 local158;
					if (local96 == 1) {
						client.anIntArray304[(client.anInt3453 += 192683631) * -1702559601 - 1] = local58;
						local66.anInt2694 = client.anInt3456 * -1555677495;
						local158 = (Class716) Class80_Sub39.method15030(Class335.method27857((byte) -60), local2.method22559(3, -325783685), -819496316);
						local66.method18791(local158, Class712.aClass712_2.aByte165, 2114009430);
						@Pc(169) int local169 = local2.method22559(1, -325783685);
						if (local169 == 1) {
							client.anIntArray308[(client.anInt3438 += -304368359) * 1467537193 - 1] = local58;
						}
					} else if (local96 == 2) {
						client.anIntArray304[(client.anInt3453 += 192683631) * -1702559601 - 1] = local58;
						local66.anInt2694 = client.anInt3456 * -1555677495;
						if (local2.method22559(1, -325783685) == 1) {
							local158 = (Class716) Class80_Sub39.method15030(Class335.method27857((byte) -103), local2.method22559(3, -325783685), -1173886560);
							local66.method18791(local158, Class712.aClass712_5.aByte165, 2095997779);
							@Pc(237) Class716 local237 = (Class716) Class80_Sub39.method15030(Class335.method27857((byte) -84), local2.method22559(3, -325783685), -1582495862);
							local66.method18791(local237, Class712.aClass712_5.aByte165, 1355565143);
						} else {
							local158 = (Class716) Class80_Sub39.method15030(Class335.method27857((byte) -97), local2.method22559(3, -325783685), -2009280074);
							local66.method18791(local158, Class712.aClass712_1.aByte165, 1201991337);
						}
						@Pc(265) int local265 = local2.method22559(1, -325783685);
						if (local265 == 1) {
							client.anIntArray308[(client.anInt3438 += -304368359) * 1467537193 - 1] = local58;
						}
					} else if (local96 == 3) {
						client.anIntArray311[(client.anInt3457 += -2056063853) * 381176219 - 1] = local58;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ahs", name = "rz", descriptor = "(Lclient!yp;I)V")
	static void method10221(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.aBoolean800 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ahs", name = "<init>", descriptor = "(Lclient!ky;Lclient!km;IIIIIIIII)V")
	Class125_Sub3(@OriginalArg(0) Class391 arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt1183 = arg9 * -322443495;
		this.anInt1184 = arg10 * 263351587;
	}

	@OriginalMember(owner = "client!ahs", name = "l", descriptor = "()Lclient!kz;")
	@Override
	public Class392 method28941() {
		return Class392.aClass392_2;
	}

	@OriginalMember(owner = "client!ahs", name = "f", descriptor = "(I)Lclient!kz;")
	@Override
	public Class392 method28942(@OriginalArg(0) int arg0) {
		return Class392.aClass392_2;
	}
}
