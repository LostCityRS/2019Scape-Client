package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ace")
public abstract class Class56 implements Interface4 {

	@OriginalMember(owner = "client!ace", name = "e", descriptor = "Lclient!py;")
	final Class497 aClass497_85;

	@OriginalMember(owner = "client!ace", name = "n", descriptor = "Lclient!eb;")
	Class240 aClass240_63;

	@OriginalMember(owner = "client!ace", name = "sl", descriptor = "(Lclient!yf;I)V")
	static void method18045(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local11.anInt4076 * -220894753;
	}

	@OriginalMember(owner = "client!ace", name = "ej", descriptor = "(II)Z")
	public static boolean method18046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 13 || arg0 == 6 || arg0 == 15 || arg0 == 16;
	}

	@OriginalMember(owner = "client!ace", name = "q", descriptor = "(Lclient!dh;Lclient!ch;Lclient!hf;IIIIIB)V")
	static void method18047(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) Class312 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte arg8) {
		@Pc(5) Class322 local5 = (Class322) Class542.aClass32_Sub2_3.method18273(arg7, -1462404455);
		if (local5 != null && local5.anIntArray400 != null && local5.method27351(Class624.aClass120_1, Class624.aClass120_1, -1579107494)) {
			local5 = local5.method27345(Class624.aClass120_1, Class624.aClass120_1, (short) 565);
		}
		if (local5 == null || !local5.aBoolean714 || !local5.method27351(Class624.aClass120_1, Class624.aClass120_1, -1929091443)) {
			return;
		}
		@Pc(45) int local45;
		if (local5.anIntArray401 != null) {
			@Pc(43) int[] local43 = new int[local5.anIntArray401.length];
			@Pc(70) int local70;
			@Pc(95) int local95;
			@Pc(99) int local99;
			for (local45 = 0; local45 < local43.length / 2; local45++) {
				if (Class429.anInt4942 * -1453926679 == 3) {
					local70 = (int) ((double) Class65.aClass123_Sub1_2.method8962((byte) -66) * 2607.5945876176133D) + client.anInt3477 * -1357343303 & 0x3FFF;
				} else if (Class429.anInt4942 * -1453926679 == 4) {
					local70 = (int) client.aFloat253 & 0x3FFF;
				} else {
					local70 = (int) client.aFloat253 + client.anInt3477 * -1357343303 & 0x3FFF;
				}
				local95 = Class464.anIntArray453[local70];
				local99 = Class464.anIntArray454[local70];
				if (Class429.anInt4942 * -1453926679 != 4) {
					local95 = local95 * 256 / (client.anInt3478 * 663566609 + 256);
					local99 = local99 * 256 / (client.anInt3478 * 663566609 + 256);
				}
				local43[local45 * 2] = arg2.anInt4022 * 1215292027 / 2 + arg3 + (local95 * (arg6 + local5.anIntArray401[local45 * 2 + 1] * 4) + local99 * (local5.anIntArray401[local45 * 2] * 4 + arg5) >> 14);
				local43[local45 * 2 + 1] = arg4 + arg2.anInt4023 * -1490598249 / 2 - (local99 * (local5.anIntArray401[local45 * 2 + 1] * 4 + arg6) - (local5.anIntArray401[local45 * 2] * 4 + arg5) * local95 >> 14);
			}
			@Pc(219) Class327 local219 = arg2.method26971(arg0, (byte) 24);
			if (local219 != null) {
				Class232.method25792(arg0, local43, local5.anInt4165 * 1475506287, local219.anIntArray408, local219.anIntArray409);
			}
			if (local5.anInt4166 * -204583541 > 0) {
				@Pc(269) int local269;
				@Pc(279) int local279;
				@Pc(284) int local284;
				for (local70 = 0; local70 < local43.length / 2 - 1; local70++) {
					local95 = local43[local70 * 2];
					local99 = local43[local70 * 2 + 1];
					local269 = local43[(local70 + 1) * 2];
					local279 = local43[(local70 + 1) * 2 + 1];
					if (local269 < local95) {
						local284 = local95;
						@Pc(286) int local286 = local99;
						local95 = local269;
						local99 = local279;
						local269 = local284;
						local279 = local286;
					} else if (local269 == local95 && local279 < local99) {
						local284 = local99;
						local99 = local279;
						local279 = local284;
					}
					if (arg1 == null) {
						arg0.method20498(local95, local99, local269, local279, local5.anIntArray402[local5.aByteArray80[local70] & 0xFF], 1, local5.anInt4166 * -204583541, local5.anInt4142 * 812190215, local5.anInt4168 * -404138527);
					} else {
						arg0.method20848(local95, local99, local269, local279, local5.anIntArray402[local5.aByteArray80[local70] & 0xFF], 1, arg1, arg3, arg4, local5.anInt4166 * -204583541, local5.anInt4142 * 812190215, local5.anInt4168 * -404138527);
					}
				}
				local70 = local43[local43.length - 2];
				local95 = local43[local43.length - 1];
				local99 = local43[0];
				local269 = local43[1];
				if (local99 < local70) {
					local279 = local70;
					local284 = local95;
					local70 = local99;
					local95 = local269;
					local99 = local279;
					local269 = local284;
				} else if (local99 == local70 && local269 < local95) {
					local279 = local95;
					local95 = local269;
					local269 = local279;
				}
				if (arg1 == null) {
					arg0.method20498(local70, local95, local99, local269, local5.anIntArray402[local5.aByteArray80[local5.aByteArray80.length - 1] & 0xFF], 1, local5.anInt4166 * -204583541, local5.anInt4142 * 812190215, local5.anInt4168 * -404138527);
				} else {
					arg0.method20848(local70, local95, local99, local269, local5.anIntArray402[local5.aByteArray80[local5.aByteArray80.length - 1] & 0xFF], 1, arg1, arg3, arg4, local5.anInt4166 * -204583541, local5.anInt4142 * 812190215, local5.anInt4168 * -404138527);
				}
			} else if (arg1 == null) {
				for (local70 = 0; local70 < local43.length / 2 - 1; local70++) {
					arg0.method20496(local43[local70 * 2], local43[local70 * 2 + 1], local43[(local70 + 1) * 2], local43[(local70 + 1) * 2 + 1], local5.anIntArray402[local5.aByteArray80[local70] & 0xFF], 1);
				}
				arg0.method20496(local43[local43.length - 2], local43[local43.length - 1], local43[0], local43[1], local5.anIntArray402[local5.aByteArray80[local5.aByteArray80.length - 1] & 0xFF], 1);
			} else {
				for (local70 = 0; local70 < local43.length / 2 - 1; local70++) {
					arg0.method20494(local43[local70 * 2], local43[local70 * 2 + 1], local43[(local70 + 1) * 2], local43[(local70 + 1) * 2 + 1], local5.anIntArray402[local5.aByteArray80[local70] & 0xFF], 1, arg1, arg3, arg4);
				}
				arg0.method20494(local43[local43.length - 2], local43[local43.length - 1], local43[0], local43[1], local5.anIntArray402[local5.aByteArray80[local5.aByteArray80.length - 1] & 0xFF], 1, arg1, arg3, arg4);
			}
		}
		@Pc(677) Class100 local677 = null;
		if (local5.anInt4167 * -498063801 != -1) {
			local677 = local5.method27346(arg0, false, 2142970087);
			if (local677 != null) {
				local45 = local5.anInt4171 * -971620039 > 0 ? local5.anInt4171 * -971620039 : Class93_Sub26.aClass645_15.anInt5930 * -409062297;
				Class323.method27369(arg2, arg1, arg3, arg4, arg5, arg6, local677, (double) local45, local5.aClass319_4, local5.aClass328_1, 1471701722);
			}
		}
		if (local5.aString180 == null) {
			return;
		}
		local45 = 0;
		if (local677 != null) {
			local45 = local677.method18177();
		}
		@Pc(736) Class106 local736 = Class707.aClass106_13;
		@Pc(738) Class5 local738 = Class584.aClass5_15;
		if (local5.anInt4157 * 1579741579 == 1) {
			local736 = Class82.aClass106_1;
			local738 = Class348.aClass5_14;
		}
		if (local5.anInt4157 * 1579741579 == 2) {
			local736 = Class118_Sub1.aClass106_3;
			local738 = Class110_Sub3.aClass5_7;
		}
		Class285.method26612(arg2, arg1, arg3, arg4, arg5, arg6, local45, local5.aString180, local736, local738, local5.anInt4140 * 2016508123, 866499998);
	}

	@OriginalMember(owner = "client!ace", name = "k", descriptor = "(I[II)V")
	public static void method18048(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (-1 != arg0 && Class383.method28326(arg0, arg1, -23207145)) {
			@Pc(14) Class312[] local14 = Class166_Sub1.aClass320Array1[arg0].aClass312Array3;
			Class118_Sub1.method8416(local14, 2070418787);
		}
	}

	@OriginalMember(owner = "client!ace", name = "bfr", descriptor = "(Lclient!yf;B)V")
	static void method18049(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(18) Class5 local18 = Class157.aClass462_2.method29422(client.anInterface50_1, local12, -1034275569);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local18.anInt7 * -2059082111;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local18.anInt6 * -8978697;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local18.anInt10 * -1093354073;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local18.anInt9 * 1796177149;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local18.anInt8 * 1717993965;
	}

	@OriginalMember(owner = "client!ace", name = "e", descriptor = "(I)[Lclient!hy;")
	static Class328[] method18050(@OriginalArg(0) int arg0) {
		return new Class328[] { Class328.aClass328_2, Class328.aClass328_4, Class328.aClass328_3 };
	}

	@OriginalMember(owner = "client!ace", name = "aw", descriptor = "(Lclient!yf;I)V")
	static void method18051(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		@Pc(9) Class379 local9 = (Class379) arg0.aClass93_Sub1_Sub13_1.anObjectArray5[arg0.anInt6050 * -709694321];
		@Pc(33) Interface20 local33 = (Interface20) (arg0.anIntArray522[arg0.anInt6050 * -709694321] == 0 ? arg0.aMap26.get(local9.aClass108_1.aClass138_6) : arg0.aMap25.get(local9.aClass108_1.aClass138_6));
		try {
			local33.method33650(local9, arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091], -1245021829);
		} catch (@Pc(51) Exception_Sub7 local51) {
			if (!(local33 instanceof Class647)) {
				throw local51;
			}
			Class361.method27985(arg0, Class560.aClass560_5, local51, "VO", 433817837);
		}
	}

	@OriginalMember(owner = "client!ace", name = "<init>", descriptor = "(Lclient!py;I)V")
	Class56(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1) {
		this.aClass497_85 = arg0;
		this.aClass240_63 = new Class240(arg1);
	}

	@OriginalMember(owner = "client!ace", name = "e", descriptor = "(IB)V")
	final void method18034(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aClass240_63 = new Class240(arg0);
	}

	@OriginalMember(owner = "client!ace", name = "l", descriptor = "(I)V")
	final void method18035(@OriginalArg(0) int arg0) {
		this.aClass240_63 = new Class240(arg0);
	}

	@OriginalMember(owner = "client!ace", name = "m", descriptor = "(II)V")
	final void method18036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class240 local3 = this.aClass240_63;
		synchronized (this.aClass240_63) {
			this.aClass240_63.method25925(arg0, (byte) -21);
		}
	}

	@OriginalMember(owner = "client!ace", name = "n", descriptor = "(I)V")
	final void method18037(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_63;
		synchronized (this.aClass240_63) {
			this.aClass240_63.method25926((byte) -8);
		}
	}

	@OriginalMember(owner = "client!ace", name = "f", descriptor = "(I)V")
	final void method18038(@OriginalArg(0) int arg0) {
		this.aClass240_63 = new Class240(arg0);
	}

	@OriginalMember(owner = "client!ace", name = "w", descriptor = "(I)V")
	final void method18039(@OriginalArg(0) int arg0) {
		this.aClass240_63 = new Class240(arg0);
	}

	@OriginalMember(owner = "client!ace", name = "k", descriptor = "(I)V")
	final void method18040(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_63;
		synchronized (this.aClass240_63) {
			this.aClass240_63.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!ace", name = "u", descriptor = "()V")
	final void method18041() {
		@Pc(3) Class240 local3 = this.aClass240_63;
		synchronized (this.aClass240_63) {
			this.aClass240_63.method25926((byte) -123);
		}
	}

	@OriginalMember(owner = "client!ace", name = "z", descriptor = "()V")
	final void method18042() {
		@Pc(3) Class240 local3 = this.aClass240_63;
		synchronized (this.aClass240_63) {
			this.aClass240_63.method25926((byte) -42);
		}
	}

	@OriginalMember(owner = "client!ace", name = "p", descriptor = "()V")
	final void method18043() {
		@Pc(3) Class240 local3 = this.aClass240_63;
		synchronized (this.aClass240_63) {
			this.aClass240_63.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!ace", name = "d", descriptor = "()V")
	final void method18044() {
		@Pc(3) Class240 local3 = this.aClass240_63;
		synchronized (this.aClass240_63) {
			this.aClass240_63.method25930(1161602830);
		}
	}
}
