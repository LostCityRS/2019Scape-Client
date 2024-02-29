package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aht")
public class Class133_Sub1 extends Class133 {

	@OriginalMember(owner = "client!aht", name = "w", descriptor = "I")
	public final int anInt1134;

	@OriginalMember(owner = "client!aht", name = "<init>", descriptor = "(ILclient!kv;Lclient!ky;III)V", line = 9)
	Class133_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class390 arg1, @OriginalArg(2) Class392 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt1134 = arg5 * 80393609;
	}

	@OriginalMember(owner = "client!aht", name = "f", descriptor = "(Lclient!alw;)Lclient!la;", line = 14)
	public static Class133 method10074(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) Class133 local3 = Class449.method28926(arg0, 216811848);
		@Pc(7) int local7 = arg0.method22481(-87715282);
		return new Class133_Sub1(local3.anInt1133 * 716586081, local3.aClass390_6, local3.aClass392_6, local3.anInt1131 * -1599175185, local3.anInt1132 * -1271918157, local7);
	}

	@OriginalMember(owner = "client!aht", name = "l", descriptor = "()Lclient!kt;", line = 20)
	@Override
	public Class388 method28579() {
		return Class388.aClass388_6;
	}

	@OriginalMember(owner = "client!aht", name = "n", descriptor = "(S)Lclient!kt;", line = 20)
	@Override
	public Class388 method28578(@OriginalArg(0) short arg0) {
		return Class388.aClass388_6;
	}

	@OriginalMember(owner = "client!aht", name = "hu", descriptor = "(Lclient!ahm;[I[I[IS)V", line = 4339)
	public static void method10075(@OriginalArg(0) Class132_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) short arg4) {
		for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
			@Pc(9) int local9 = arg1[local1];
			@Pc(13) int local13 = arg3[local1];
			@Pc(17) int local17 = arg2[local1];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && local19 < arg0.aClass19_Sub1_Sub1Array3.length) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg0.aClass19_Sub1_Sub1Array3[local19] = null;
					} else {
						@Pc(48) Class263 local48 = (Class263) Class32.aClass32_Sub17_23.method18261(local9, -286655540);
						@Pc(53) int local53 = local48.anInt3868 * 23893545;
						@Pc(58) Class19_Sub1_Sub1 local58 = arg0.aClass19_Sub1_Sub1Array3[local19];
						if (local58 != null && local58.method23557(-492776415)) {
							if (local9 == local58.method23564((byte) 17)) {
								if (local53 == 0) {
									arg0.aClass19_Sub1_Sub1Array3[local19] = null;
									local58 = null;
								} else if (local53 == 1) {
									local58.method23608(1602702541);
									local58.anInt3224 = local17 * -754803697;
								} else if (local53 == 2) {
									local58.method23605((short) -7094);
								}
							} else if (local48.anInt3873 * -1789992573 >= local58.method23560(168831707).anInt3873 * -1789992573) {
								arg0.aClass19_Sub1_Sub1Array3[local19] = null;
								local58 = null;
							}
						}
						if (local58 == null || !local58.method23557(1427306587)) {
							local58 = arg0.aClass19_Sub1_Sub1Array3[local19] = new Class19_Sub1_Sub1(arg0);
							local58.method23566(local9, 1121104828);
							local58.anInt3224 = local17 * -754803697;
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!aht", name = "ph", descriptor = "(Lclient!yf;I)V", line = 7707)
	static final void method10076(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 276630658);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class183.method24575(local16, local22, arg0, -968264252);
	}

	@OriginalMember(owner = "client!aht", name = "aeo", descriptor = "(Lclient!yf;I)V", line = 10361)
	static final void method10077(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local13 > local23 ? local13 : local23;
	}

	@OriginalMember(owner = "client!aht", name = "ajd", descriptor = "(Lclient!yf;I)V", line = 11449)
	static final void method10078(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!aht", name = "bew", descriptor = "(Lclient!yf;I)V", line = 14935)
	static final void method10079(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (Class59.anIterator1 != null && Class59.anIterator1.hasNext()) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (Integer) Class59.anIterator1.next();
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
		}
	}
}
