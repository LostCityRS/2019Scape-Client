package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class308 {

	@OriginalMember(owner = "client!hc", name = "u", descriptor = "(Lclient!ald;)Lclient!hc;")
	public static Class308 method27435(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(3) int local3 = arg0.method23362(703072557);
		if (local3 == 0) {
			return null;
		}
		local3--;
		arg0.anInt3152 += 1034180571;
		@Pc(19) int local19 = arg0.method23182(-2054329860);
		@Pc(22) Object[] local22 = new Object[local3];
		for (@Pc(24) int local24 = 0; local24 < local3; local24++) {
			@Pc(31) int local31 = arg0.method23362(774429200);
			if (local31 == 0) {
				local22[local24] = Class519.method30594(Integer.class, (byte) 0).method30638(arg0, (short) 961);
			} else if (local31 == 1) {
				local22[local24] = Class519.method30594(String.class, (byte) 0).method30638(arg0, (short) 961);
			} else {
				throw new IllegalStateException("Unrecognised type ID in deserialise: " + local31);
			}
		}
		return new Class308(local19, local22);
	}

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "(Lclient!ald;)Lclient!hc;")
	public static Class308 method27436(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(3) int local3 = arg0.method23362(-45635121);
		if (local3 == 0) {
			return null;
		}
		local3--;
		arg0.anInt3152 += 1034180571;
		@Pc(19) int local19 = arg0.method23182(936059012);
		@Pc(22) Object[] local22 = new Object[local3];
		for (@Pc(24) int local24 = 0; local24 < local3; local24++) {
			@Pc(31) int local31 = arg0.method23362(1029212048);
			if (local31 == 0) {
				local22[local24] = Class519.method30594(Integer.class, (byte) 0).method30638(arg0, (short) 961);
			} else if (local31 == 1) {
				local22[local24] = Class519.method30594(String.class, (byte) 0).method30638(arg0, (short) 961);
			} else {
				throw new IllegalStateException("Unrecognised type ID in deserialise: " + local31);
			}
		}
		return new Class308(local19, local22);
	}

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "(Lclient!ald;)Lclient!hc;")
	public static Class308 method27437(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(3) int local3 = arg0.method23362(-1572965893);
		if (local3 == 0) {
			return null;
		}
		local3--;
		arg0.anInt3152 += 1034180571;
		@Pc(19) int local19 = arg0.method23182(2112197299);
		@Pc(22) Object[] local22 = new Object[local3];
		for (@Pc(24) int local24 = 0; local24 < local3; local24++) {
			@Pc(31) int local31 = arg0.method23362(614759752);
			if (local31 == 0) {
				local22[local24] = Class519.method30594(Integer.class, (byte) 0).method30638(arg0, (short) 961);
			} else if (local31 == 1) {
				local22[local24] = Class519.method30594(String.class, (byte) 0).method30638(arg0, (short) 961);
			} else {
				throw new IllegalStateException("Unrecognised type ID in deserialise: " + local31);
			}
		}
		return new Class308(local19, local22);
	}

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "(Lclient!ald;)Lclient!hc;")
	public static Class308 method27438(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(3) int local3 = arg0.method23362(-725588677);
		if (local3 == 0) {
			return null;
		}
		local3--;
		arg0.anInt3152 += 1034180571;
		@Pc(19) int local19 = arg0.method23182(1088501543);
		@Pc(22) Object[] local22 = new Object[local3];
		for (@Pc(24) int local24 = 0; local24 < local3; local24++) {
			@Pc(31) int local31 = arg0.method23362(-701255417);
			if (local31 == 0) {
				local22[local24] = Class519.method30594(Integer.class, (byte) 0).method30638(arg0, (short) 961);
			} else if (local31 == 1) {
				local22[local24] = Class519.method30594(String.class, (byte) 0).method30638(arg0, (short) 961);
			} else {
				throw new IllegalStateException("Unrecognised type ID in deserialise: " + local31);
			}
		}
		return new Class308(local19, local22);
	}

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "(Lclient!rq;I)V")
	public static void method27439(@OriginalArg(0) Interface58 arg0, @OriginalArg(1) int arg1) {
		if (Class526.anInterface58_1 != null) {
			throw new IllegalStateException("");
		}
		Class526.anInterface58_1 = arg0;
	}

	@OriginalMember(owner = "client!hc", name = "zu", descriptor = "(Lclient!yp;I)V")
	static void method27440(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (client.anInt3577 * 740205413 == 0) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -2;
		} else if (client.anInt3577 * 740205413 == 1) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.anInt3573 * 975306769;
		}
	}

	@OriginalMember(owner = "client!hc", name = "ahq", descriptor = "(Lclient!yp;I)V")
	static void method27441(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 1815275855;
		client.anInt3566 = arg0.anIntArray525[arg0.anInt5778 * 1896589581] * 421101571;
		Class125_Sub2.aClass11_5 = Class183.method24699(arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1], 2039574637);
		if (Class125_Sub2.aClass11_5 == null) {
			Class125_Sub2.aClass11_5 = Class11.aClass11_1;
		}
		client.anInt3513 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2] * -1571748591;
		@Pc(47) Class75 local47 = Class52.method1074(16777215);
		@Pc(53) Class80_Sub31 local53 = Class623.method32440(Class443.aClass443_112, local47.aClass22_1, -191270971);
		local53.aClass80_Sub36_Sub1_2.method23154(client.anInt3566 * 788343467, 1275868335);
		local53.aClass80_Sub36_Sub1_2.method23154(Class125_Sub2.aClass11_5.anInt42 * 468896967, 1275868335);
		local53.aClass80_Sub36_Sub1_2.method23154(client.anInt3513 * -1403352079, 1275868335);
		local47.method1325(local53, (byte) -90);
	}

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "(CB)B")
	public static byte method27442(@OriginalArg(0) char arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) byte local13;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local13 = (byte) arg0;
		} else if (arg0 == '€') {
			local13 = -128;
		} else if (arg0 == '‚') {
			local13 = -126;
		} else if (arg0 == 'ƒ') {
			local13 = -125;
		} else if (arg0 == '„') {
			local13 = -124;
		} else if (arg0 == '…') {
			local13 = -123;
		} else if (arg0 == '†') {
			local13 = -122;
		} else if (arg0 == '‡') {
			local13 = -121;
		} else if (arg0 == 'ˆ') {
			local13 = -120;
		} else if (arg0 == '‰') {
			local13 = -119;
		} else if (arg0 == 'Š') {
			local13 = -118;
		} else if (arg0 == '‹') {
			local13 = -117;
		} else if (arg0 == 'Œ') {
			local13 = -116;
		} else if (arg0 == 'Ž') {
			local13 = -114;
		} else if (arg0 == '‘') {
			local13 = -111;
		} else if (arg0 == '’') {
			local13 = -110;
		} else if (arg0 == '“') {
			local13 = -109;
		} else if (arg0 == '”') {
			local13 = -108;
		} else if (arg0 == '•') {
			local13 = -107;
		} else if (arg0 == '–') {
			local13 = -106;
		} else if (arg0 == '—') {
			local13 = -105;
		} else if (arg0 == '˜') {
			local13 = -104;
		} else if (arg0 == '™') {
			local13 = -103;
		} else if (arg0 == 'š') {
			local13 = -102;
		} else if (arg0 == '›') {
			local13 = -101;
		} else if (arg0 == 'œ') {
			local13 = -100;
		} else if (arg0 == 'ž') {
			local13 = -98;
		} else if (arg0 == 'Ÿ') {
			local13 = -97;
		} else {
			local13 = 63;
		}
		return local13;
	}

	@OriginalMember(owner = "client!hc", name = "ti", descriptor = "(Lclient!hx;IIFIIIIIIB)V")
	static void method27443(@OriginalArg(0) Class327 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) byte arg10) {
		if (arg0.aClass350_2 == null) {
			@Pc(12) Class335 local12 = (Class335) Class460.aClass41_Sub2_1.method18054(arg0.anInt4122 * -589001179, 120495800);
			arg0.aClass350_2 = new Class350(local12, true);
		}
		arg0.aClass350_2.aLong370 = Class475.method29884((byte) -103) * 1429031336920090503L;
		arg0.aClass350_2.method28003(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, -1415602972);
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(I[Ljava/lang/Object;)V")
	Class308(@OriginalArg(0) int arg0, @OriginalArg(1) Object[] arg1) {
	}
}
