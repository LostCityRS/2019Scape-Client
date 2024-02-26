package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Iterator;

@OriginalClass("client!jw")
public abstract class Class121 {

	@OriginalMember(owner = "client!jw", name = "x", descriptor = "F")
	public static final float aFloat103 = Float.POSITIVE_INFINITY;

	@OriginalMember(owner = "client!jw", name = "aq", descriptor = "I")
	static final int anInt1115 = 10000;

	@OriginalMember(owner = "client!jw", name = "ai", descriptor = "I")
	static final int anInt1116 = 50;

	@OriginalMember(owner = "client!jw", name = "io", descriptor = "Lclient!adv;")
	public static Class2_Sub1_Sub2 aClass2_Sub1_Sub2_4;

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "F")
	float aFloat101;

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "F")
	float aFloat102;

	@OriginalMember(owner = "client!jw", name = "e", descriptor = "Lclient!jv;")
	Class368 aClass368_2;

	@OriginalMember(owner = "client!jw", name = "u", descriptor = "Lclient!is;")
	Class347 aClass347_2;

	@OriginalMember(owner = "client!jw", name = "l", descriptor = "Lclient!aas;")
	Class20 aClass20_2;

	@OriginalMember(owner = "client!jw", name = "g", descriptor = "Lclient!ij;")
	Class340 aClass340_2;

	@OriginalMember(owner = "client!jw", name = "i", descriptor = "Lclient!kl;")
	Class123 aClass123_2;

	@OriginalMember(owner = "client!jw", name = "o", descriptor = "Lclient!iz;")
	Class354 aClass354_2;

	@OriginalMember(owner = "client!jw", name = "j", descriptor = "I")
	int anInt1114;

	@OriginalMember(owner = "client!jw", name = "ac", descriptor = "Z")
	boolean aBoolean213;

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "F")
	float aFloat108;

	@OriginalMember(owner = "client!jw", name = "ay", descriptor = "F")
	float aFloat110;

	@OriginalMember(owner = "client!jw", name = "ag", descriptor = "Z")
	boolean aBoolean214;

	@OriginalMember(owner = "client!jw", name = "ao", descriptor = "F")
	float aFloat111;

	@OriginalMember(owner = "client!jw", name = "aj", descriptor = "F")
	float aFloat112;

	@OriginalMember(owner = "client!jw", name = "ax", descriptor = "F")
	float aFloat113;

	@OriginalMember(owner = "client!jw", name = "f", descriptor = "Lclient!jd;")
	Class358 aClass358_2;

	@OriginalMember(owner = "client!jw", name = "s", descriptor = "Lclient!on;")
	final Class463 aClass463_30 = new Class463();

	@OriginalMember(owner = "client!jw", name = "k", descriptor = "Lclient!on;")
	final Class463 aClass463_31 = new Class463();

	@OriginalMember(owner = "client!jw", name = "w", descriptor = "Lclient!on;")
	final Class463 aClass463_29 = new Class463();

	@OriginalMember(owner = "client!jw", name = "r", descriptor = "Lclient!on;")
	final Class463 aClass463_32 = new Class463();

	@OriginalMember(owner = "client!jw", name = "q", descriptor = "F")
	final float aFloat104 = 5120.0F;

	@OriginalMember(owner = "client!jw", name = "h", descriptor = "F")
	final float aFloat114 = 10.0F;

	@OriginalMember(owner = "client!jw", name = "d", descriptor = "F")
	final float aFloat105 = 1.0F;

	@OriginalMember(owner = "client!jw", name = "z", descriptor = "F")
	float aFloat106 = 5120.0F;

	@OriginalMember(owner = "client!jw", name = "p", descriptor = "F")
	float aFloat115 = 10.0F;

	@OriginalMember(owner = "client!jw", name = "v", descriptor = "F")
	float aFloat107 = 1.0F;

	@OriginalMember(owner = "client!jw", name = "y", descriptor = "Lclient!on;")
	final Class463 aClass463_33 = new Class463();

	@OriginalMember(owner = "client!jw", name = "n", descriptor = "Lclient!on;")
	final Class463 aClass463_34 = new Class463();

	@OriginalMember(owner = "client!jw", name = "ab", descriptor = "I")
	int anInt1117 = 0;

	@OriginalMember(owner = "client!jw", name = "al", descriptor = "F")
	float aFloat109 = 1.0F;

	@OriginalMember(owner = "client!jw", name = "ah", descriptor = "Lclient!aax;")
	Class24 aClass24_7 = new Class24(8);

	@OriginalMember(owner = "client!jw", name = "t", descriptor = "Lclient!im;")
	final Class342 aClass342_2;

	@OriginalMember(owner = "client!jw", name = "m", descriptor = "Lclient!jj;")
	final Interface29 anInterface29_2;

	@OriginalMember(owner = "client!jw", name = "e", descriptor = "(II)[[[B")
	public static byte[][][] method9718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) byte[][][] local3 = new byte[8][4][];
		@Pc(5) int local5 = arg0;
		@Pc(7) int local7 = arg0;
		@Pc(12) byte[] local12 = new byte[arg0 * arg0];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16;
		@Pc(21) int local21;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[0][0] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local7; local21++) {
				if (local21 <= local16) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[0][1] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[0][2] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[0][3] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[1][0] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local14 >= 0 && local14 < local12.length) {
					if (local21 >= local16 << 1) {
						local12[local14] = -1;
					}
					local14++;
				} else {
					local14++;
				}
			}
		}
		local3[1][1] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[1][2] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[1][3] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[2][0] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[2][1] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[2][2] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[2][3] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[3][0] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[3][1] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[3][2] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[3][3] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[4][0] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[4][1] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[4][2] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[4][3] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local5 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[5][0] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local16 <= local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[5][1] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local5 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[5][2] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local16 >= local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[5][3] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[6][0] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[6][1] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[6][2] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[6][3] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[7][0] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[7][1] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[7][2] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[7][3] = local12;
		return local3;
	}

	@OriginalMember(owner = "client!jw", name = "fn", descriptor = "(Lclient!yp;B)V")
	static void method9719(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class123_Sub2.method20549(local11, local14, arg0, 2089485302);
	}

	@OriginalMember(owner = "client!jw", name = "ahg", descriptor = "(Lclient!yp;B)V")
	static void method9720(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(29) Class79 local29 = (Class79) Class370.aClass41_Sub10_1.method18054(local23, -1905706233);
		if (local29.method1428(-1683792175)) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = ((Class80_Sub1_Sub1) Class595.aClass73_Sub2_1.method18054(local13, -399102917)).method1483(local23, local29.aString11, (byte) 94);
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = ((Class80_Sub1_Sub1) Class595.aClass73_Sub2_1.method18054(local13, -228196576)).method1485(local23, local29.anInt253 * 680817871, (short) -32206);
		}
	}

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(Lclient!im;Lclient!jj;)V")
	Class121(@OriginalArg(0) Class342 arg0, @OriginalArg(1) Interface29 arg1) {
		this.aClass342_2 = arg0;
		this.anInterface29_2 = arg1;
		this.method9573(true, 1112369551);
	}

	@OriginalMember(owner = "client!jw", name = "s", descriptor = "(Lclient!on;I)V")
	public final void method9572(@OriginalArg(0) Class463 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		if (!this.method9579(194670896) || !this.aClass354_2.aBoolean835) {
			throw new Exception_Sub3();
		}
		this.aClass463_32.method29478(arg0);
	}

	@OriginalMember(owner = "client!jw", name = "t", descriptor = "(ZI)V")
	public final void method9573(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.aClass368_2 = Class368.aClass368_4;
		this.aClass347_2 = null;
		this.aClass20_2 = null;
		this.aClass340_2 = null;
		this.aClass123_2 = null;
		if (this.aClass342_2 != Class342.aClass342_3 && arg0) {
			this.aClass358_2 = Class358.aClass358_3;
		} else {
			this.aClass358_2 = Class358.aClass358_4;
		}
		this.aClass354_2 = Class354.aClass354_5;
		this.aClass463_30.method29477(100.0F, 100.0F, 100.0F);
		this.aClass463_31.method29477(100.0F, 100.0F, 100.0F);
		this.aFloat101 = 0.05F;
		this.aClass463_29.method29477(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass463_32.method29477(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass463_33.method29477(1.0F, 1.0F, 1.0F);
		this.aClass463_34.method29477(1.0F, 1.0F, 1.0F);
		this.aFloat108 = 1.1F;
		this.aFloat102 = 1.1F;
		this.aFloat113 = 50.0F;
		this.aFloat110 = 10000.0F;
		this.aFloat112 = 1.5707964F;
		this.aFloat111 = 1.5707964F;
		this.anInt1114 = 511240357;
		this.aBoolean213 = true;
		this.aBoolean214 = true;
		this.anInt1117 = 0;
		this.aFloat109 = 1.0F;
		this.aClass24_7.method564(-256418772);
	}

	@OriginalMember(owner = "client!jw", name = "cd", descriptor = "(Lclient!on;)V")
	public final void method9574(@OriginalArg(0) Class463 arg0) throws Exception_Sub3 {
		if (!this.method9579(2052507961) || !this.aClass354_2.aBoolean835) {
			throw new Exception_Sub3();
		}
		this.aClass463_29.method29478(arg0);
	}

	@OriginalMember(owner = "client!jw", name = "e", descriptor = "(ZFLclient!on;Lclient!oq;Lclient!on;Lclient!on;S)V")
	public final void method9575(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class463 arg2, @OriginalArg(3) Class466 arg3, @OriginalArg(4) Class463 arg4, @OriginalArg(5) Class463 arg5, @OriginalArg(6) short arg6) {
		if (this.aClass354_2 == Class354.aClass354_3) {
			Class80_Sub21.method14217(arg1, arg2, arg4, arg5, arg0 ? this.aClass463_32 : this.aClass463_29, arg0 ? this.aClass463_31 : this.aClass463_30, (float) (this.anInt1117 * 9628207), this.aFloat109, this.aFloat106, this.aFloat115, -156582254);
		} else if (this.aClass354_2 == Class354.aClass354_5) {
			Class445.method29236(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass463_32 : this.aClass463_29, arg0 ? this.aClass463_31 : this.aClass463_30, (float) (this.anInt1117 * 9628207), this.aFloat109, this.aFloat106, this.aFloat115, (byte) -31);
		} else if (this.aClass354_2 == Class354.aClass354_4) {
			Class420.method29013(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass463_34 : this.aClass463_33, arg0 ? this.aFloat102 : this.aFloat108, this.aFloat106, this.aFloat107, 1882990164);
		}
	}

	@OriginalMember(owner = "client!jw", name = "u", descriptor = "(Lclient!jd;I)V")
	public final void method9576(@OriginalArg(0) Class358 arg0, @OriginalArg(1) int arg1) {
		this.aClass358_2 = arg0;
	}

	@OriginalMember(owner = "client!jw", name = "l", descriptor = "(Lclient!is;ZI)Lclient!aas;")
	public final Class20 method9577(@OriginalArg(0) Class347 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) throws Exception_Sub3 {
		if (Class358.aClass358_4 == this.aClass358_2 && !arg1) {
			throw new Exception_Sub3();
		}
		this.aClass347_2 = arg0;
		if (arg0 == Class347.aClass347_3) {
			this.aClass20_2 = new Class20_Sub5(this);
		} else if (Class347.aClass347_7 == arg0) {
			this.aClass20_2 = new Class20_Sub3(this);
		} else if (Class347.aClass347_4 == arg0) {
			this.aClass20_2 = new Class20_Sub2(this);
		} else if (arg0 == Class347.aClass347_5) {
			this.aClass20_2 = new Class20_Sub4_Sub2(this);
		} else if (Class347.aClass347_6 == arg0) {
			this.aClass20_2 = new Class20_Sub4_Sub3(this);
		} else if (arg0 == Class347.aClass347_8) {
			this.aClass20_2 = new Class20_Sub1(this);
		} else if (arg0 == Class347.aClass347_9) {
			this.aClass20_2 = new Class20_Sub4_Sub1(this);
		}
		return this.aClass20_2;
	}

	@OriginalMember(owner = "client!jw", name = "dg", descriptor = "(I)V")
	public final void method9578(@OriginalArg(0) int arg0) {
		@Pc(6) Class80_Sub1_Sub13 local6 = (Class80_Sub1_Sub13) this.aClass24_7.method560((long) arg0);
		if (local6 != null) {
			local6.method24395((byte) 33);
		}
	}

	@OriginalMember(owner = "client!jw", name = "i", descriptor = "(I)Z")
	final boolean method9579(@OriginalArg(0) int arg0) {
		if (Class342.aClass342_3 == this.aClass342_2 && Class358.aClass358_4 == this.aClass358_2) {
			return true;
		} else {
			return Class342.aClass342_4 == this.aClass342_2 && Class358.aClass358_3 == this.aClass358_2;
		}
	}

	@OriginalMember(owner = "client!jw", name = "bp", descriptor = "(Lclient!is;Z)Lclient!aas;")
	public final Class20 method9580(@OriginalArg(0) Class347 arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub3 {
		if (Class358.aClass358_4 == this.aClass358_2 && !arg1) {
			throw new Exception_Sub3();
		}
		this.aClass347_2 = arg0;
		if (arg0 == Class347.aClass347_3) {
			this.aClass20_2 = new Class20_Sub5(this);
		} else if (Class347.aClass347_7 == arg0) {
			this.aClass20_2 = new Class20_Sub3(this);
		} else if (Class347.aClass347_4 == arg0) {
			this.aClass20_2 = new Class20_Sub2(this);
		} else if (arg0 == Class347.aClass347_5) {
			this.aClass20_2 = new Class20_Sub4_Sub2(this);
		} else if (Class347.aClass347_6 == arg0) {
			this.aClass20_2 = new Class20_Sub4_Sub3(this);
		} else if (arg0 == Class347.aClass347_8) {
			this.aClass20_2 = new Class20_Sub1(this);
		} else if (arg0 == Class347.aClass347_9) {
			this.aClass20_2 = new Class20_Sub4_Sub1(this);
		}
		return this.aClass20_2;
	}

	@OriginalMember(owner = "client!jw", name = "bn", descriptor = "(F[[[ILclient!qc;II)V")
	public final void method9581(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class502 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass20_2 != null) {
			this.aClass20_2.method23075(arg0, -909685645);
		}
		if (this.aClass123_2 != null) {
			this.aClass123_2.method20499(arg0, arg1, arg2, arg3, arg4, (short) 9987);
		}
		@Pc(24) Iterator local24 = this.aClass24_7.iterator();
		while (local24.hasNext()) {
			@Pc(31) Class80_Sub1_Sub13 local31 = (Class80_Sub1_Sub13) local24.next();
			local31.method23753(arg0, -2094327692);
		}
	}

	@OriginalMember(owner = "client!jw", name = "dn", descriptor = "(Lclient!jl;Lclient!ov;Lclient!pm;II)V")
	public final void method9582(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) Class487 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.method9600(-290818072)) {
			return;
		}
		this.aClass20_2.method23093(arg0, arg1, arg3, arg4, this.aClass123_2.method20504((byte) 121), 904100727);
		this.aClass123_2.method20518(arg0, arg3, arg4, (byte) -119);
		if (Class368.aClass368_4 == this.aClass368_2) {
			arg2.method30088(this.aFloat113, this.aFloat110, this.aFloat111, this.aFloat112);
		} else {
			arg2.method30089(this.aFloat113, this.aFloat110, (float) (this.anInt1114 * -642794527));
		}
		@Pc(52) Iterator local52 = this.aClass24_7.iterator();
		while (local52.hasNext()) {
			@Pc(59) Class80_Sub1_Sub13 local59 = (Class80_Sub1_Sub13) local52.next();
			local59.method23751(arg0, arg1, arg2, (byte) 62);
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lclient!on;I)V")
	public final void method9583(@OriginalArg(0) Class463 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		if (!this.method9579(1506571977) || !this.aClass354_2.aBoolean835) {
			throw new Exception_Sub3();
		}
		this.aClass463_29.method29478(arg0);
	}

	@OriginalMember(owner = "client!jw", name = "dp", descriptor = "()Lclient!akx;")
	public final Class80_Sub33 method9584() {
		return this.aClass123_2 != null && this.aClass123_2.method20500(645626793) ? this.aClass123_2.method20519((byte) 19) : null;
	}

	@OriginalMember(owner = "client!jw", name = "bv", descriptor = "(Lclient!is;Z)Lclient!aas;")
	public final Class20 method9585(@OriginalArg(0) Class347 arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub3 {
		if (Class358.aClass358_4 == this.aClass358_2 && !arg1) {
			throw new Exception_Sub3();
		}
		this.aClass347_2 = arg0;
		if (arg0 == Class347.aClass347_3) {
			this.aClass20_2 = new Class20_Sub5(this);
		} else if (Class347.aClass347_7 == arg0) {
			this.aClass20_2 = new Class20_Sub3(this);
		} else if (Class347.aClass347_4 == arg0) {
			this.aClass20_2 = new Class20_Sub2(this);
		} else if (arg0 == Class347.aClass347_5) {
			this.aClass20_2 = new Class20_Sub4_Sub2(this);
		} else if (Class347.aClass347_6 == arg0) {
			this.aClass20_2 = new Class20_Sub4_Sub3(this);
		} else if (arg0 == Class347.aClass347_8) {
			this.aClass20_2 = new Class20_Sub1(this);
		} else if (arg0 == Class347.aClass347_9) {
			this.aClass20_2 = new Class20_Sub4_Sub1(this);
		}
		return this.aClass20_2;
	}

	@OriginalMember(owner = "client!jw", name = "x", descriptor = "(I)V")
	public final void method9586(@OriginalArg(0) int arg0) throws Exception_Sub3 {
		if (!this.method9579(159552414)) {
			throw new Exception_Sub3();
		}
		this.aFloat106 = 5120.0F;
		this.aFloat115 = 10.0F;
		this.aFloat107 = 1.0F;
	}

	@OriginalMember(owner = "client!jw", name = "be", descriptor = "(Lclient!jd;)V")
	public final void method9587(@OriginalArg(0) Class358 arg0) {
		this.aClass358_2 = arg0;
	}

	@OriginalMember(owner = "client!jw", name = "r", descriptor = "(Lclient!on;S)V")
	public final void method9588(@OriginalArg(0) Class463 arg0, @OriginalArg(1) short arg1) throws Exception_Sub3 {
		if (!this.method9579(-667312913) || !this.aClass354_2.aBoolean835) {
			throw new Exception_Sub3();
		}
		this.aClass463_31.method29478(arg0);
	}

	@OriginalMember(owner = "client!jw", name = "q", descriptor = "(Lclient!on;FB)V")
	public final void method9589(@OriginalArg(0) Class463 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) byte arg2) throws Exception_Sub3 {
		if (!this.method9579(2063462733) || this.aClass354_2.aBoolean835) {
			throw new Exception_Sub3();
		}
		this.aClass463_33.method29478(arg0);
		this.aClass463_34.method29478(arg0);
		this.aFloat108 = arg1;
		this.aFloat102 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "h", descriptor = "(Lclient!on;FB)V")
	public final void method9590(@OriginalArg(0) Class463 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) byte arg2) throws Exception_Sub3 {
		if (!this.method9579(-599124836) || this.aClass354_2.aBoolean835) {
			throw new Exception_Sub3();
		}
		this.aClass463_33.method29478(arg0);
		this.aFloat108 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "d", descriptor = "(Lclient!on;FI)V")
	public final void method9591(@OriginalArg(0) Class463 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) throws Exception_Sub3 {
		if (!this.method9579(207022499) || this.aClass354_2.aBoolean835) {
			throw new Exception_Sub3();
		}
		this.aClass463_34.method29478(arg0);
		this.aFloat102 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "z", descriptor = "(FFI)V")
	public final void method9592(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) throws Exception_Sub3 {
		if (!this.method9579(708909628)) {
			throw new Exception_Sub3();
		}
		if (arg0 < 1.0F) {
			arg0 = 50.0F;
		}
		if (arg1 < 1.0F) {
			arg1 = 10000.0F;
		}
		if (arg0 >= arg1) {
			throw new Exception_Sub3();
		}
		this.aFloat113 = arg0;
		this.aFloat110 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "by", descriptor = "(Lclient!jd;)V")
	public final void method9593(@OriginalArg(0) Class358 arg0) {
		this.aClass358_2 = arg0;
	}

	@OriginalMember(owner = "client!jw", name = "v", descriptor = "(ZZB)V")
	public final void method9594(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) throws Exception_Sub3 {
		if (!this.method9579(-284126557)) {
			throw new Exception_Sub3();
		}
		this.aBoolean213 = arg0;
		this.aBoolean214 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "y", descriptor = "(IFI)V")
	public final void method9595(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) throws Exception_Sub3 {
		if (!this.method9579(516626103) || !this.aClass354_2.aBoolean835) {
			throw new Exception_Sub3();
		}
		this.anInt1117 = arg0 * 92314831;
		this.aFloat109 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "n", descriptor = "(Lclient!asd;B)V")
	public final void method9596(@OriginalArg(0) Class80_Sub1_Sub13 arg0, @OriginalArg(1) byte arg1) {
		this.aClass24_7.method563(arg0, (long) (arg0.anInt3226 * 393755111));
	}

	@OriginalMember(owner = "client!jw", name = "dq", descriptor = "()Lclient!on;")
	public final Class463 method9597() {
		return this.aClass20_2 != null && this.aClass20_2.method23076((byte) 14) ? this.aClass20_2.method23080(-1515276416) : null;
	}

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(II)Lclient!asd;")
	public final Class80_Sub1_Sub13 method9598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Class80_Sub1_Sub13) this.aClass24_7.method560((long) arg0);
	}

	@OriginalMember(owner = "client!jw", name = "ax", descriptor = "(B)V")
	public final void method9599(@OriginalArg(0) byte arg0) {
		this.aClass24_7.method564(-56873593);
	}

	@OriginalMember(owner = "client!jw", name = "ay", descriptor = "(I)Z")
	public final boolean method9600(@OriginalArg(0) int arg0) {
		if (this.aClass20_2 == null || this.aClass123_2 == null) {
			return false;
		} else if (this.aClass20_2.method23076((byte) 14)) {
			return this.aClass123_2.method20500(1049871043);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jw", name = "ai", descriptor = "(Lclient!jl;Lclient!ov;Lclient!pm;III)V")
	public final void method9601(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) Class487 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.method9600(-1458430763)) {
			return;
		}
		this.aClass20_2.method23093(arg0, arg1, arg3, arg4, this.aClass123_2.method20504((byte) 56), 904100727);
		this.aClass123_2.method20518(arg0, arg3, arg4, (byte) -73);
		if (Class368.aClass368_4 == this.aClass368_2) {
			arg2.method30088(this.aFloat113, this.aFloat110, this.aFloat111, this.aFloat112);
		} else {
			arg2.method30089(this.aFloat113, this.aFloat110, (float) (this.anInt1114 * -642794527));
		}
		@Pc(52) Iterator local52 = this.aClass24_7.iterator();
		while (local52.hasNext()) {
			@Pc(59) Class80_Sub1_Sub13 local59 = (Class80_Sub1_Sub13) local52.next();
			local59.method23751(arg0, arg1, arg2, (byte) 69);
		}
	}

	@OriginalMember(owner = "client!jw", name = "aq", descriptor = "(B)Lclient!jd;")
	public final Class358 method9602(@OriginalArg(0) byte arg0) {
		return this.aClass358_2;
	}

	@OriginalMember(owner = "client!jw", name = "ao", descriptor = "(I)Lclient!kl;")
	public final Class123 method9603(@OriginalArg(0) int arg0) {
		return this.aClass123_2;
	}

	@OriginalMember(owner = "client!jw", name = "av", descriptor = "(B)Lclient!oq;")
	public final Class466 method9604(@OriginalArg(0) byte arg0) {
		@Pc(1) Class466 local1 = Class466.method29640();
		local1.method29650(this.method9648(-29354872), this.method9612(1887484587), this.method9650(-1048691010));
		return local1;
	}

	@OriginalMember(owner = "client!jw", name = "ac", descriptor = "(I)Lclient!jj;")
	public final Interface29 method9605(@OriginalArg(0) int arg0) {
		return this.anInterface29_2;
	}

	@OriginalMember(owner = "client!jw", name = "k", descriptor = "(FFFI)V")
	public final void method9606(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) throws Exception_Sub3 {
		if (!this.method9579(1306583222)) {
			throw new Exception_Sub3();
		}
		this.aFloat106 = arg0;
		this.aFloat115 = arg1;
		this.aFloat107 = arg2;
	}

	@OriginalMember(owner = "client!jw", name = "ab", descriptor = "(I)Lclient!ij;")
	public final Class340 method9607(@OriginalArg(0) int arg0) {
		return this.aClass340_2;
	}

	@OriginalMember(owner = "client!jw", name = "al", descriptor = "(I)Lclient!on;")
	public final Class463 method9608(@OriginalArg(0) int arg0) {
		return this.aClass123_2 != null && this.aClass123_2.method20500(23999054) ? this.aClass123_2.method20516(1436604136) : null;
	}

	@OriginalMember(owner = "client!jw", name = "ah", descriptor = "(I)[D")
	public final double[] method9609(@OriginalArg(0) int arg0) {
		return this.aClass123_2 != null && this.aClass123_2.method20500(1294647910) ? this.aClass123_2.method20502(1297777971) : null;
	}

	@OriginalMember(owner = "client!jw", name = "m", descriptor = "(FI)V")
	public final void method9610(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		if (!this.method9579(1830019598)) {
			throw new Exception_Sub3();
		}
	}

	@OriginalMember(owner = "client!jw", name = "ev", descriptor = "()Lclient!oq;")
	public final Class466 method9611() {
		@Pc(1) Class466 local1 = Class466.method29640();
		local1.method29650(this.method9648(1787408846), this.method9612(-1491016090), this.method9650(-1696825359));
		return local1;
	}

	@OriginalMember(owner = "client!jw", name = "ak", descriptor = "(I)F")
	public final float method9612(@OriginalArg(0) int arg0) {
		@Pc(3) Class463 local3 = this.method9608(-2071393450);
		@Pc(7) Class463 local7 = this.method9668(-527069360);
		@Pc(9) float local9 = 0.0F;
		if (local3 != null && local7 != null) {
			@Pc(18) Class463 local18 = Class463.method29487(local7, local3);
			@Pc(33) float local33 = (float) Math.sqrt((double) (local18.aFloat297 * local18.aFloat297 + local18.aFloat296 * local18.aFloat296));
			local9 = (float) Math.atan2((double) -local18.aFloat295, (double) local33);
			local3.method29557();
			local7.method29557();
		}
		return local9;
	}

	@OriginalMember(owner = "client!jw", name = "bt", descriptor = "(F[[[ILclient!qc;II)V")
	public final void method9613(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class502 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass20_2 != null) {
			this.aClass20_2.method23075(arg0, -1486291881);
		}
		if (this.aClass123_2 != null) {
			this.aClass123_2.method20499(arg0, arg1, arg2, arg3, arg4, (short) 9987);
		}
		@Pc(24) Iterator local24 = this.aClass24_7.iterator();
		while (local24.hasNext()) {
			@Pc(31) Class80_Sub1_Sub13 local31 = (Class80_Sub1_Sub13) local24.next();
			local31.method23753(arg0, -2063037680);
		}
	}

	@OriginalMember(owner = "client!jw", name = "bb", descriptor = "(Lclient!is;Z)Lclient!aas;")
	public final Class20 method9614(@OriginalArg(0) Class347 arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub3 {
		if (Class358.aClass358_4 == this.aClass358_2 && !arg1) {
			throw new Exception_Sub3();
		}
		this.aClass347_2 = arg0;
		if (arg0 == Class347.aClass347_3) {
			this.aClass20_2 = new Class20_Sub5(this);
		} else if (Class347.aClass347_7 == arg0) {
			this.aClass20_2 = new Class20_Sub3(this);
		} else if (Class347.aClass347_4 == arg0) {
			this.aClass20_2 = new Class20_Sub2(this);
		} else if (arg0 == Class347.aClass347_5) {
			this.aClass20_2 = new Class20_Sub4_Sub2(this);
		} else if (Class347.aClass347_6 == arg0) {
			this.aClass20_2 = new Class20_Sub4_Sub3(this);
		} else if (arg0 == Class347.aClass347_8) {
			this.aClass20_2 = new Class20_Sub1(this);
		} else if (arg0 == Class347.aClass347_9) {
			this.aClass20_2 = new Class20_Sub4_Sub1(this);
		}
		return this.aClass20_2;
	}

	@OriginalMember(owner = "client!jw", name = "ar", descriptor = "(B)Lclient!on;")
	public final Class463 method9615(@OriginalArg(0) byte arg0) {
		return this.aClass463_31;
	}

	@OriginalMember(owner = "client!jw", name = "an", descriptor = "(I)Lclient!on;")
	public final Class463 method9616(@OriginalArg(0) int arg0) {
		return this.aClass463_29;
	}

	@OriginalMember(owner = "client!jw", name = "aa", descriptor = "(B)Lclient!on;")
	public final Class463 method9617(@OriginalArg(0) byte arg0) {
		return this.aClass463_32;
	}

	@OriginalMember(owner = "client!jw", name = "ae", descriptor = "(I)F")
	public final float method9618(@OriginalArg(0) int arg0) {
		return this.aFloat101;
	}

	@OriginalMember(owner = "client!jw", name = "ap", descriptor = "(I)Lclient!on;")
	public final Class463 method9619(@OriginalArg(0) int arg0) {
		return this.aClass463_30;
	}

	@OriginalMember(owner = "client!jw", name = "ce", descriptor = "(Lclient!on;F)V")
	public final void method9620(@OriginalArg(0) Class463 arg0, @OriginalArg(1) float arg1) throws Exception_Sub3 {
		if (!this.method9579(1999137980) || this.aClass354_2.aBoolean835) {
			throw new Exception_Sub3();
		}
		this.aClass463_33.method29478(arg0);
		this.aClass463_34.method29478(arg0);
		this.aFloat108 = arg1;
		this.aFloat102 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "br", descriptor = "(Z)V")
	public final void method9621(@OriginalArg(0) boolean arg0) {
		this.aClass368_2 = Class368.aClass368_4;
		this.aClass347_2 = null;
		this.aClass20_2 = null;
		this.aClass340_2 = null;
		this.aClass123_2 = null;
		if (this.aClass342_2 != Class342.aClass342_3 && arg0) {
			this.aClass358_2 = Class358.aClass358_3;
		} else {
			this.aClass358_2 = Class358.aClass358_4;
		}
		this.aClass354_2 = Class354.aClass354_5;
		this.aClass463_30.method29477(100.0F, 100.0F, 100.0F);
		this.aClass463_31.method29477(100.0F, 100.0F, 100.0F);
		this.aFloat101 = 0.05F;
		this.aClass463_29.method29477(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass463_32.method29477(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass463_33.method29477(1.0F, 1.0F, 1.0F);
		this.aClass463_34.method29477(1.0F, 1.0F, 1.0F);
		this.aFloat108 = 1.1F;
		this.aFloat102 = 1.1F;
		this.aFloat113 = 50.0F;
		this.aFloat110 = 10000.0F;
		this.aFloat112 = 1.5707964F;
		this.aFloat111 = 1.5707964F;
		this.anInt1114 = 511240357;
		this.aBoolean213 = true;
		this.aBoolean214 = true;
		this.anInt1117 = 0;
		this.aFloat109 = 1.0F;
		this.aClass24_7.method564(640341983);
	}

	@OriginalMember(owner = "client!jw", name = "da", descriptor = "()F")
	public final float method9622() {
		@Pc(3) Class463 local3 = this.method9608(-690834844);
		@Pc(7) Class463 local7 = this.method9668(-457790267);
		@Pc(9) float local9 = 0.0F;
		if (local3 != null && local7 != null) {
			@Pc(18) Class463 local18 = Class463.method29487(local3, local7);
			local18.aFloat295 = 0.0F;
			local9 = (float) Math.atan2((double) local18.aFloat297, (double) local18.aFloat296);
			local3.method29557();
			local7.method29557();
		}
		return (float) (3.141592653589793D - (double) local9);
	}

	@OriginalMember(owner = "client!jw", name = "as", descriptor = "(I)F")
	public final float method9623(@OriginalArg(0) int arg0) {
		return this.aFloat111;
	}

	@OriginalMember(owner = "client!jw", name = "aw", descriptor = "(B)Z")
	public final boolean method9624(@OriginalArg(0) byte arg0) {
		return this.aBoolean213;
	}

	@OriginalMember(owner = "client!jw", name = "bg", descriptor = "(I)Z")
	public final boolean method9625(@OriginalArg(0) int arg0) {
		return this.aBoolean214;
	}

	@OriginalMember(owner = "client!jw", name = "bl", descriptor = "(Z)V")
	public final void method9626(@OriginalArg(0) boolean arg0) {
		this.aClass368_2 = Class368.aClass368_4;
		this.aClass347_2 = null;
		this.aClass20_2 = null;
		this.aClass340_2 = null;
		this.aClass123_2 = null;
		if (this.aClass342_2 != Class342.aClass342_3 && arg0) {
			this.aClass358_2 = Class358.aClass358_3;
		} else {
			this.aClass358_2 = Class358.aClass358_4;
		}
		this.aClass354_2 = Class354.aClass354_5;
		this.aClass463_30.method29477(100.0F, 100.0F, 100.0F);
		this.aClass463_31.method29477(100.0F, 100.0F, 100.0F);
		this.aFloat101 = 0.05F;
		this.aClass463_29.method29477(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass463_32.method29477(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass463_33.method29477(1.0F, 1.0F, 1.0F);
		this.aClass463_34.method29477(1.0F, 1.0F, 1.0F);
		this.aFloat108 = 1.1F;
		this.aFloat102 = 1.1F;
		this.aFloat113 = 50.0F;
		this.aFloat110 = 10000.0F;
		this.aFloat112 = 1.5707964F;
		this.aFloat111 = 1.5707964F;
		this.anInt1114 = 511240357;
		this.aBoolean213 = true;
		this.aBoolean214 = true;
		this.anInt1117 = 0;
		this.aFloat109 = 1.0F;
		this.aClass24_7.method564(-724341911);
	}

	@OriginalMember(owner = "client!jw", name = "ca", descriptor = "(Lclient!on;F)V")
	public final void method9627(@OriginalArg(0) Class463 arg0, @OriginalArg(1) float arg1) throws Exception_Sub3 {
		if (!this.method9579(1735764695) || this.aClass354_2.aBoolean835) {
			throw new Exception_Sub3();
		}
		this.aClass463_34.method29478(arg0);
		this.aFloat102 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "am", descriptor = "(I)Lclient!akx;")
	public final Class80_Sub33 method9628(@OriginalArg(0) int arg0) {
		return this.aClass123_2 != null && this.aClass123_2.method20500(-119067727) ? this.aClass123_2.method20519((byte) -78) : null;
	}

	@OriginalMember(owner = "client!jw", name = "ba", descriptor = "(F[[[ILclient!qc;II)V")
	public final void method9629(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class502 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass20_2 != null) {
			this.aClass20_2.method23075(arg0, -958871348);
		}
		if (this.aClass123_2 != null) {
			this.aClass123_2.method20499(arg0, arg1, arg2, arg3, arg4, (short) 9987);
		}
		@Pc(24) Iterator local24 = this.aClass24_7.iterator();
		while (local24.hasNext()) {
			@Pc(31) Class80_Sub1_Sub13 local31 = (Class80_Sub1_Sub13) local24.next();
			local31.method23753(arg0, -1973153965);
		}
	}

	@OriginalMember(owner = "client!jw", name = "cb", descriptor = "(FF)V")
	public final void method9630(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) throws Exception_Sub3 {
		if (!this.method9579(1648432168)) {
			throw new Exception_Sub3();
		}
		this.aFloat111 = arg0;
		this.aFloat112 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "bs", descriptor = "(F[[[ILclient!qc;II)V")
	public final void method9631(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class502 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass20_2 != null) {
			this.aClass20_2.method23075(arg0, -1371315369);
		}
		if (this.aClass123_2 != null) {
			this.aClass123_2.method20499(arg0, arg1, arg2, arg3, arg4, (short) 9987);
		}
		@Pc(24) Iterator local24 = this.aClass24_7.iterator();
		while (local24.hasNext()) {
			@Pc(31) Class80_Sub1_Sub13 local31 = (Class80_Sub1_Sub13) local24.next();
			local31.method23753(arg0, -2136425391);
		}
	}

	@OriginalMember(owner = "client!jw", name = "bj", descriptor = "(ZFLclient!on;Lclient!oq;Lclient!on;Lclient!on;)V")
	public final void method9632(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class463 arg2, @OriginalArg(3) Class466 arg3, @OriginalArg(4) Class463 arg4, @OriginalArg(5) Class463 arg5) {
		if (this.aClass354_2 == Class354.aClass354_3) {
			Class80_Sub21.method14217(arg1, arg2, arg4, arg5, arg0 ? this.aClass463_32 : this.aClass463_29, arg0 ? this.aClass463_31 : this.aClass463_30, (float) (this.anInt1117 * 9628207), this.aFloat109, this.aFloat106, this.aFloat115, -156582254);
		} else if (this.aClass354_2 == Class354.aClass354_5) {
			Class445.method29236(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass463_32 : this.aClass463_29, arg0 ? this.aClass463_31 : this.aClass463_30, (float) (this.anInt1117 * 9628207), this.aFloat109, this.aFloat106, this.aFloat115, (byte) -38);
		} else if (this.aClass354_2 == Class354.aClass354_4) {
			Class420.method29013(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass463_34 : this.aClass463_33, arg0 ? this.aFloat102 : this.aFloat108, this.aFloat106, this.aFloat107, 1850906779);
		}
	}

	@OriginalMember(owner = "client!jw", name = "ec", descriptor = "()Lclient!oq;")
	public final Class466 method9633() {
		@Pc(1) Class466 local1 = Class466.method29640();
		local1.method29650(this.method9648(540830733), this.method9612(-1853409568), this.method9650(539704274));
		return local1;
	}

	@OriginalMember(owner = "client!jw", name = "bk", descriptor = "(Lclient!jd;)V")
	public final void method9634(@OriginalArg(0) Class358 arg0) {
		this.aClass358_2 = arg0;
	}

	@OriginalMember(owner = "client!jw", name = "bz", descriptor = "(Lclient!jd;)V")
	public final void method9635(@OriginalArg(0) Class358 arg0) {
		this.aClass358_2 = arg0;
	}

	@OriginalMember(owner = "client!jw", name = "bi", descriptor = "()Z")
	final boolean method9636() {
		if (Class342.aClass342_3 == this.aClass342_2 && Class358.aClass358_4 == this.aClass358_2) {
			return true;
		} else {
			return Class342.aClass342_4 == this.aClass342_2 && Class358.aClass358_3 == this.aClass358_2;
		}
	}

	@OriginalMember(owner = "client!jw", name = "bh", descriptor = "(Lclient!is;Z)Lclient!aas;")
	public final Class20 method9637(@OriginalArg(0) Class347 arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub3 {
		if (Class358.aClass358_4 == this.aClass358_2 && !arg1) {
			throw new Exception_Sub3();
		}
		this.aClass347_2 = arg0;
		if (arg0 == Class347.aClass347_3) {
			this.aClass20_2 = new Class20_Sub5(this);
		} else if (Class347.aClass347_7 == arg0) {
			this.aClass20_2 = new Class20_Sub3(this);
		} else if (Class347.aClass347_4 == arg0) {
			this.aClass20_2 = new Class20_Sub2(this);
		} else if (arg0 == Class347.aClass347_5) {
			this.aClass20_2 = new Class20_Sub4_Sub2(this);
		} else if (Class347.aClass347_6 == arg0) {
			this.aClass20_2 = new Class20_Sub4_Sub3(this);
		} else if (arg0 == Class347.aClass347_8) {
			this.aClass20_2 = new Class20_Sub1(this);
		} else if (arg0 == Class347.aClass347_9) {
			this.aClass20_2 = new Class20_Sub4_Sub1(this);
		}
		return this.aClass20_2;
	}

	@OriginalMember(owner = "client!jw", name = "cp", descriptor = "(FF)V")
	public final void method9638(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) throws Exception_Sub3 {
		if (!this.method9579(2127156220)) {
			throw new Exception_Sub3();
		}
		this.aFloat111 = arg0;
		this.aFloat112 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "(II)V")
	public final void method9639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class80_Sub1_Sub13 local6 = (Class80_Sub1_Sub13) this.aClass24_7.method560((long) arg0);
		if (local6 != null) {
			local6.method24395((byte) 85);
		}
	}

	@OriginalMember(owner = "client!jw", name = "dz", descriptor = "()F")
	public final float method9640() {
		@Pc(3) Class463 local3 = this.method9608(-1836027921);
		@Pc(7) Class463 local7 = this.method9668(-659243734);
		@Pc(9) float local9 = 0.0F;
		if (local3 != null && local7 != null) {
			@Pc(18) Class463 local18 = Class463.method29487(local7, local3);
			@Pc(33) float local33 = (float) Math.sqrt((double) (local18.aFloat297 * local18.aFloat297 + local18.aFloat296 * local18.aFloat296));
			local9 = (float) Math.atan2((double) -local18.aFloat295, (double) local33);
			local3.method29557();
			local7.method29557();
		}
		return local9;
	}

	@OriginalMember(owner = "client!jw", name = "bc", descriptor = "(Lclient!ij;Z)Lclient!kl;")
	public final Class123 method9641(@OriginalArg(0) Class340 arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub3 {
		if (this.aClass358_2 == Class358.aClass358_4 && !arg1) {
			throw new Exception_Sub3();
		}
		this.aClass340_2 = arg0;
		if (arg0 == Class340.aClass340_7) {
			this.aClass123_2 = new Class123_Sub3(this);
		} else if (arg0 == Class340.aClass340_5) {
			this.aClass123_2 = new Class123_Sub1(this);
		} else if (arg0 == Class340.aClass340_4) {
			this.aClass123_2 = new Class123_Sub2_Sub2(this);
		} else if (Class340.aClass340_3 == arg0) {
			this.aClass123_2 = new Class123_Sub2_Sub1(this);
		} else if (arg0 == Class340.aClass340_6) {
			this.aClass123_2 = new Class123_Sub2_Sub3(this);
		}
		return this.aClass123_2;
	}

	@OriginalMember(owner = "client!jw", name = "bf", descriptor = "(Lclient!ij;Z)Lclient!kl;")
	public final Class123 method9642(@OriginalArg(0) Class340 arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub3 {
		if (this.aClass358_2 == Class358.aClass358_4 && !arg1) {
			throw new Exception_Sub3();
		}
		this.aClass340_2 = arg0;
		if (arg0 == Class340.aClass340_7) {
			this.aClass123_2 = new Class123_Sub3(this);
		} else if (arg0 == Class340.aClass340_5) {
			this.aClass123_2 = new Class123_Sub1(this);
		} else if (arg0 == Class340.aClass340_4) {
			this.aClass123_2 = new Class123_Sub2_Sub2(this);
		} else if (Class340.aClass340_3 == arg0) {
			this.aClass123_2 = new Class123_Sub2_Sub1(this);
		} else if (arg0 == Class340.aClass340_6) {
			this.aClass123_2 = new Class123_Sub2_Sub3(this);
		}
		return this.aClass123_2;
	}

	@OriginalMember(owner = "client!jw", name = "bw", descriptor = "()Z")
	final boolean method9643() {
		if (Class342.aClass342_3 == this.aClass342_2 && Class358.aClass358_4 == this.aClass358_2) {
			return true;
		} else {
			return Class342.aClass342_4 == this.aClass342_2 && Class358.aClass358_3 == this.aClass358_2;
		}
	}

	@OriginalMember(owner = "client!jw", name = "bx", descriptor = "()Z")
	final boolean method9644() {
		if (Class342.aClass342_3 == this.aClass342_2 && Class358.aClass358_4 == this.aClass358_2) {
			return true;
		} else {
			return Class342.aClass342_4 == this.aClass342_2 && Class358.aClass358_3 == this.aClass358_2;
		}
	}

	@OriginalMember(owner = "client!jw", name = "p", descriptor = "(FFI)V")
	public final void method9645(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) throws Exception_Sub3 {
		if (!this.method9579(2090846876)) {
			throw new Exception_Sub3();
		}
		this.aFloat111 = arg0;
		this.aFloat112 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "bu", descriptor = "(F)V")
	public final void method9646(@OriginalArg(0) float arg0) throws Exception_Sub3 {
		if (!this.method9579(894639765)) {
			throw new Exception_Sub3();
		}
		this.aFloat101 = arg0;
	}

	@OriginalMember(owner = "client!jw", name = "g", descriptor = "(Lclient!ij;ZI)Lclient!kl;")
	public final Class123 method9647(@OriginalArg(0) Class340 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) throws Exception_Sub3 {
		if (this.aClass358_2 == Class358.aClass358_4 && !arg1) {
			throw new Exception_Sub3();
		}
		this.aClass340_2 = arg0;
		if (arg0 == Class340.aClass340_7) {
			this.aClass123_2 = new Class123_Sub3(this);
		} else if (arg0 == Class340.aClass340_5) {
			this.aClass123_2 = new Class123_Sub1(this);
		} else if (arg0 == Class340.aClass340_4) {
			this.aClass123_2 = new Class123_Sub2_Sub2(this);
		} else if (Class340.aClass340_3 == arg0) {
			this.aClass123_2 = new Class123_Sub2_Sub1(this);
		} else if (arg0 == Class340.aClass340_6) {
			this.aClass123_2 = new Class123_Sub2_Sub3(this);
		}
		return this.aClass123_2;
	}

	@OriginalMember(owner = "client!jw", name = "at", descriptor = "(I)F")
	public final float method9648(@OriginalArg(0) int arg0) {
		@Pc(3) Class463 local3 = this.method9608(1126741268);
		@Pc(7) Class463 local7 = this.method9668(-545416073);
		@Pc(9) float local9 = 0.0F;
		if (local3 != null && local7 != null) {
			@Pc(18) Class463 local18 = Class463.method29487(local3, local7);
			local18.aFloat295 = 0.0F;
			local9 = (float) Math.atan2((double) local18.aFloat297, (double) local18.aFloat296);
			local3.method29557();
			local7.method29557();
		}
		return (float) (3.141592653589793D - (double) local9);
	}

	@OriginalMember(owner = "client!jw", name = "j", descriptor = "(Lclient!iz;B)V")
	public final void method9649(@OriginalArg(0) Class354 arg0, @OriginalArg(1) byte arg1) throws Exception_Sub3 {
		if (!this.method9579(196747354)) {
			throw new Exception_Sub3();
		}
		this.aClass354_2 = arg0;
	}

	@OriginalMember(owner = "client!jw", name = "ad", descriptor = "(I)F")
	final float method9650(@OriginalArg(0) int arg0) {
		return 0.0F;
	}

	@OriginalMember(owner = "client!jw", name = "cv", descriptor = "(Lclient!on;)V")
	public final void method9651(@OriginalArg(0) Class463 arg0) throws Exception_Sub3 {
		if (!this.method9579(-27934379) || !this.aClass354_2.aBoolean835) {
			throw new Exception_Sub3();
		}
		this.aClass463_29.method29478(arg0);
	}

	@OriginalMember(owner = "client!jw", name = "az", descriptor = "(I)F")
	public final float method9652(@OriginalArg(0) int arg0) {
		return this.aFloat110;
	}

	@OriginalMember(owner = "client!jw", name = "cn", descriptor = "(Lclient!on;)V")
	public final void method9653(@OriginalArg(0) Class463 arg0) throws Exception_Sub3 {
		if (!this.method9579(624435748) || !this.aClass354_2.aBoolean835) {
			throw new Exception_Sub3();
		}
		this.aClass463_32.method29478(arg0);
	}

	@OriginalMember(owner = "client!jw", name = "cy", descriptor = "()V")
	public final void method9654() throws Exception_Sub3 {
		if (!this.method9579(-114299808)) {
			throw new Exception_Sub3();
		}
		this.aFloat106 = 5120.0F;
		this.aFloat115 = 10.0F;
		this.aFloat107 = 1.0F;
	}

	@OriginalMember(owner = "client!jw", name = "ch", descriptor = "(Lclient!on;)V")
	public final void method9655(@OriginalArg(0) Class463 arg0) throws Exception_Sub3 {
		if (!this.method9579(-99138583) || !this.aClass354_2.aBoolean835) {
			throw new Exception_Sub3();
		}
		this.aClass463_30.method29478(arg0);
	}

	@OriginalMember(owner = "client!jw", name = "cc", descriptor = "(Lclient!on;)V")
	public final void method9656(@OriginalArg(0) Class463 arg0) throws Exception_Sub3 {
		if (!this.method9579(1396332896) || !this.aClass354_2.aBoolean835) {
			throw new Exception_Sub3();
		}
		this.aClass463_31.method29478(arg0);
	}

	@OriginalMember(owner = "client!jw", name = "cu", descriptor = "(Lclient!on;)V")
	public final void method9657(@OriginalArg(0) Class463 arg0) throws Exception_Sub3 {
		if (!this.method9579(1341887279) || !this.aClass354_2.aBoolean835) {
			throw new Exception_Sub3();
		}
		this.aClass463_31.method29478(arg0);
	}

	@OriginalMember(owner = "client!jw", name = "cz", descriptor = "(Lclient!asd;)V")
	public final void method9658(@OriginalArg(0) Class80_Sub1_Sub13 arg0) {
		this.aClass24_7.method563(arg0, (long) (arg0.anInt3226 * 393755111));
	}

	@OriginalMember(owner = "client!jw", name = "au", descriptor = "(I)F")
	public final float method9659(@OriginalArg(0) int arg0) {
		return this.aFloat113;
	}

	@OriginalMember(owner = "client!jw", name = "cj", descriptor = "(Lclient!on;F)V")
	public final void method9660(@OriginalArg(0) Class463 arg0, @OriginalArg(1) float arg1) throws Exception_Sub3 {
		if (!this.method9579(-34046606) || this.aClass354_2.aBoolean835) {
			throw new Exception_Sub3();
		}
		this.aClass463_33.method29478(arg0);
		this.aClass463_34.method29478(arg0);
		this.aFloat108 = arg1;
		this.aFloat102 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "ck", descriptor = "(Lclient!on;F)V")
	public final void method9661(@OriginalArg(0) Class463 arg0, @OriginalArg(1) float arg1) throws Exception_Sub3 {
		if (!this.method9579(1405600824) || this.aClass354_2.aBoolean835) {
			throw new Exception_Sub3();
		}
		this.aClass463_33.method29478(arg0);
		this.aFloat108 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "bd", descriptor = "(Lclient!on;)V")
	public final void method9662(@OriginalArg(0) Class463 arg0) throws Exception_Sub3 {
		if (!this.method9579(-26036333) || !this.aClass354_2.aBoolean835) {
			throw new Exception_Sub3();
		}
		this.aClass463_29.method29478(arg0);
	}

	@OriginalMember(owner = "client!jw", name = "cr", descriptor = "(Lclient!on;F)V")
	public final void method9663(@OriginalArg(0) Class463 arg0, @OriginalArg(1) float arg1) throws Exception_Sub3 {
		if (!this.method9579(-431202558) || this.aClass354_2.aBoolean835) {
			throw new Exception_Sub3();
		}
		this.aClass463_34.method29478(arg0);
		this.aFloat102 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "ci", descriptor = "(Lclient!on;F)V")
	public final void method9664(@OriginalArg(0) Class463 arg0, @OriginalArg(1) float arg1) throws Exception_Sub3 {
		if (!this.method9579(-60519484) || this.aClass354_2.aBoolean835) {
			throw new Exception_Sub3();
		}
		this.aClass463_34.method29478(arg0);
		this.aFloat102 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "cm", descriptor = "(Lclient!on;F)V")
	public final void method9665(@OriginalArg(0) Class463 arg0, @OriginalArg(1) float arg1) throws Exception_Sub3 {
		if (!this.method9579(435670413) || this.aClass354_2.aBoolean835) {
			throw new Exception_Sub3();
		}
		this.aClass463_34.method29478(arg0);
		this.aFloat102 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "dy", descriptor = "()F")
	public final float method9666() {
		@Pc(3) Class463 local3 = this.method9608(339249470);
		@Pc(7) Class463 local7 = this.method9668(-476872450);
		@Pc(9) float local9 = 0.0F;
		if (local3 != null && local7 != null) {
			@Pc(18) Class463 local18 = Class463.method29487(local3, local7);
			local18.aFloat295 = 0.0F;
			local9 = (float) Math.atan2((double) local18.aFloat297, (double) local18.aFloat296);
			local3.method29557();
			local7.method29557();
		}
		return (float) (3.141592653589793D - (double) local9);
	}

	@OriginalMember(owner = "client!jw", name = "cg", descriptor = "(FF)V")
	public final void method9667(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) throws Exception_Sub3 {
		if (!this.method9579(595887987)) {
			throw new Exception_Sub3();
		}
		this.aFloat111 = arg0;
		this.aFloat112 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "af", descriptor = "(I)Lclient!on;")
	public final Class463 method9668(@OriginalArg(0) int arg0) {
		return this.aClass20_2 != null && this.aClass20_2.method23076((byte) 14) ? this.aClass20_2.method23080(-548427446) : null;
	}

	@OriginalMember(owner = "client!jw", name = "cw", descriptor = "(ZZ)V")
	public final void method9669(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub3 {
		if (!this.method9579(1373651284)) {
			throw new Exception_Sub3();
		}
		this.aBoolean213 = arg0;
		this.aBoolean214 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "cl", descriptor = "(ZZ)V")
	public final void method9670(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub3 {
		if (!this.method9579(234646516)) {
			throw new Exception_Sub3();
		}
		this.aBoolean213 = arg0;
		this.aBoolean214 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "cx", descriptor = "(ZZ)V")
	public final void method9671(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub3 {
		if (!this.method9579(599052762)) {
			throw new Exception_Sub3();
		}
		this.aBoolean213 = arg0;
		this.aBoolean214 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "cf", descriptor = "(IF)V")
	public final void method9672(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) throws Exception_Sub3 {
		if (!this.method9579(333747106) || !this.aClass354_2.aBoolean835) {
			throw new Exception_Sub3();
		}
		this.anInt1117 = arg0 * 92314831;
		this.aFloat109 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "co", descriptor = "(Lclient!asd;)V")
	public final void method9673(@OriginalArg(0) Class80_Sub1_Sub13 arg0) {
		this.aClass24_7.method563(arg0, (long) (arg0.anInt3226 * 393755111));
	}

	@OriginalMember(owner = "client!jw", name = "bo", descriptor = "(Lclient!is;Z)Lclient!aas;")
	public final Class20 method9674(@OriginalArg(0) Class347 arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub3 {
		if (Class358.aClass358_4 == this.aClass358_2 && !arg1) {
			throw new Exception_Sub3();
		}
		this.aClass347_2 = arg0;
		if (arg0 == Class347.aClass347_3) {
			this.aClass20_2 = new Class20_Sub5(this);
		} else if (Class347.aClass347_7 == arg0) {
			this.aClass20_2 = new Class20_Sub3(this);
		} else if (Class347.aClass347_4 == arg0) {
			this.aClass20_2 = new Class20_Sub2(this);
		} else if (arg0 == Class347.aClass347_5) {
			this.aClass20_2 = new Class20_Sub4_Sub2(this);
		} else if (Class347.aClass347_6 == arg0) {
			this.aClass20_2 = new Class20_Sub4_Sub3(this);
		} else if (arg0 == Class347.aClass347_8) {
			this.aClass20_2 = new Class20_Sub1(this);
		} else if (arg0 == Class347.aClass347_9) {
			this.aClass20_2 = new Class20_Sub4_Sub1(this);
		}
		return this.aClass20_2;
	}

	@OriginalMember(owner = "client!jw", name = "f", descriptor = "(F[[[ILclient!qc;IIB)V")
	public final void method9675(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class502 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		if (this.aClass20_2 != null) {
			this.aClass20_2.method23075(arg0, -1287876767);
		}
		if (this.aClass123_2 != null) {
			this.aClass123_2.method20499(arg0, arg1, arg2, arg3, arg4, (short) 9987);
		}
		@Pc(24) Iterator local24 = this.aClass24_7.iterator();
		while (local24.hasNext()) {
			@Pc(31) Class80_Sub1_Sub13 local31 = (Class80_Sub1_Sub13) local24.next();
			local31.method23753(arg0, -2052251196);
		}
	}

	@OriginalMember(owner = "client!jw", name = "cs", descriptor = "(Lclient!on;F)V")
	public final void method9676(@OriginalArg(0) Class463 arg0, @OriginalArg(1) float arg1) throws Exception_Sub3 {
		if (!this.method9579(1839858613) || this.aClass354_2.aBoolean835) {
			throw new Exception_Sub3();
		}
		this.aClass463_33.method29478(arg0);
		this.aClass463_34.method29478(arg0);
		this.aFloat108 = arg1;
		this.aFloat102 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "dh", descriptor = "(I)Lclient!asd;")
	public final Class80_Sub1_Sub13 method9677(@OriginalArg(0) int arg0) {
		return (Class80_Sub1_Sub13) this.aClass24_7.method560((long) arg0);
	}

	@OriginalMember(owner = "client!jw", name = "dd", descriptor = "()V")
	public final void method9678() {
		this.aClass24_7.method564(-1554427389);
	}

	@OriginalMember(owner = "client!jw", name = "dc", descriptor = "()V")
	public final void method9679() {
		this.aClass24_7.method564(-1816752721);
	}

	@OriginalMember(owner = "client!jw", name = "o", descriptor = "(FB)V")
	public final void method9680(@OriginalArg(0) float arg0, @OriginalArg(1) byte arg1) throws Exception_Sub3 {
		if (!this.method9579(-118245176)) {
			throw new Exception_Sub3();
		}
		this.aFloat101 = arg0;
	}

	@OriginalMember(owner = "client!jw", name = "df", descriptor = "(Lclient!jl;Lclient!ov;Lclient!pm;II)V")
	public final void method9681(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) Class487 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.method9600(-265541458)) {
			return;
		}
		this.aClass20_2.method23093(arg0, arg1, arg3, arg4, this.aClass123_2.method20504((byte) 7), 904100727);
		this.aClass123_2.method20518(arg0, arg3, arg4, (byte) -52);
		if (Class368.aClass368_4 == this.aClass368_2) {
			arg2.method30088(this.aFloat113, this.aFloat110, this.aFloat111, this.aFloat112);
		} else {
			arg2.method30089(this.aFloat113, this.aFloat110, (float) (this.anInt1114 * -642794527));
		}
		@Pc(52) Iterator local52 = this.aClass24_7.iterator();
		while (local52.hasNext()) {
			@Pc(59) Class80_Sub1_Sub13 local59 = (Class80_Sub1_Sub13) local52.next();
			local59.method23751(arg0, arg1, arg2, (byte) 92);
		}
	}

	@OriginalMember(owner = "client!jw", name = "dl", descriptor = "()Lclient!aas;")
	public final Class20 method9682() {
		return this.aClass20_2;
	}

	@OriginalMember(owner = "client!jw", name = "db", descriptor = "()Lclient!aas;")
	public final Class20 method9683() {
		return this.aClass20_2;
	}

	@OriginalMember(owner = "client!jw", name = "dt", descriptor = "()Lclient!jj;")
	public final Interface29 method9684() {
		return this.anInterface29_2;
	}

	@OriginalMember(owner = "client!jw", name = "du", descriptor = "()Lclient!ij;")
	public final Class340 method9685() {
		return this.aClass340_2;
	}

	@OriginalMember(owner = "client!jw", name = "ds", descriptor = "()Lclient!ij;")
	public final Class340 method9686() {
		return this.aClass340_2;
	}

	@OriginalMember(owner = "client!jw", name = "ct", descriptor = "(Lclient!on;)V")
	public final void method9687(@OriginalArg(0) Class463 arg0) throws Exception_Sub3 {
		if (!this.method9579(1923529969) || !this.aClass354_2.aBoolean835) {
			throw new Exception_Sub3();
		}
		this.aClass463_32.method29478(arg0);
	}

	@OriginalMember(owner = "client!jw", name = "dr", descriptor = "()Lclient!on;")
	public final Class463 method9688() {
		return this.aClass123_2 != null && this.aClass123_2.method20500(1576435222) ? this.aClass123_2.method20516(1436604136) : null;
	}

	@OriginalMember(owner = "client!jw", name = "dj", descriptor = "()Lclient!akx;")
	public final Class80_Sub33 method9689() {
		return this.aClass123_2 != null && this.aClass123_2.method20500(658136355) ? this.aClass123_2.method20519((byte) -30) : null;
	}

	@OriginalMember(owner = "client!jw", name = "de", descriptor = "()[D")
	public final double[] method9690() {
		return this.aClass123_2 != null && this.aClass123_2.method20500(1754369791) ? this.aClass123_2.method20502(986069582) : null;
	}

	@OriginalMember(owner = "client!jw", name = "dv", descriptor = "()[D")
	public final double[] method9691() {
		return this.aClass123_2 != null && this.aClass123_2.method20500(729224695) ? this.aClass123_2.method20502(199307290) : null;
	}

	@OriginalMember(owner = "client!jw", name = "dm", descriptor = "()Lclient!on;")
	public final Class463 method9692() {
		return this.aClass20_2 != null && this.aClass20_2.method23076((byte) 14) ? this.aClass20_2.method23080(-1097327104) : null;
	}

	@OriginalMember(owner = "client!jw", name = "aj", descriptor = "(I)Lclient!aas;")
	public final Class20 method9693(@OriginalArg(0) int arg0) {
		return this.aClass20_2;
	}

	@OriginalMember(owner = "client!jw", name = "do", descriptor = "()Lclient!akx;")
	public final Class80_Sub33 method9694() {
		return this.aClass123_2 != null && this.aClass123_2.method20500(1647218011) ? this.aClass123_2.method20519((byte) 18) : null;
	}

	@OriginalMember(owner = "client!jw", name = "dx", descriptor = "()Lclient!on;")
	public final Class463 method9695() {
		return this.aClass123_2 != null && this.aClass123_2.method20500(1214998733) ? this.aClass123_2.method20516(1436604136) : null;
	}

	@OriginalMember(owner = "client!jw", name = "cq", descriptor = "(I)V")
	public final void method9696(@OriginalArg(0) int arg0) {
		@Pc(6) Class80_Sub1_Sub13 local6 = (Class80_Sub1_Sub13) this.aClass24_7.method560((long) arg0);
		if (local6 != null) {
			local6.method24395((byte) 73);
		}
	}

	@OriginalMember(owner = "client!jw", name = "di", descriptor = "()F")
	public final float method9697() {
		@Pc(3) Class463 local3 = this.method9608(1488646557);
		@Pc(7) Class463 local7 = this.method9668(-2007844486);
		@Pc(9) float local9 = 0.0F;
		if (local3 != null && local7 != null) {
			@Pc(18) Class463 local18 = Class463.method29487(local7, local3);
			@Pc(33) float local33 = (float) Math.sqrt((double) (local18.aFloat297 * local18.aFloat297 + local18.aFloat296 * local18.aFloat296));
			local9 = (float) Math.atan2((double) -local18.aFloat295, (double) local33);
			local3.method29557();
			local7.method29557();
		}
		return local9;
	}

	@OriginalMember(owner = "client!jw", name = "bm", descriptor = "(Lclient!iz;)V")
	public final void method9698(@OriginalArg(0) Class354 arg0) throws Exception_Sub3 {
		if (!this.method9579(-945196003)) {
			throw new Exception_Sub3();
		}
		this.aClass354_2 = arg0;
	}

	@OriginalMember(owner = "client!jw", name = "bq", descriptor = "(Lclient!iz;)V")
	public final void method9699(@OriginalArg(0) Class354 arg0) throws Exception_Sub3 {
		if (!this.method9579(-824022068)) {
			throw new Exception_Sub3();
		}
		this.aClass354_2 = arg0;
	}

	@OriginalMember(owner = "client!jw", name = "dw", descriptor = "()Lclient!ij;")
	public final Class340 method9700() {
		return this.aClass340_2;
	}

	@OriginalMember(owner = "client!jw", name = "dk", descriptor = "()F")
	final float method9701() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!jw", name = "ag", descriptor = "(I)Lclient!is;")
	public final Class347 method9702(@OriginalArg(0) int arg0) {
		return this.aClass347_2;
	}

	@OriginalMember(owner = "client!jw", name = "ek", descriptor = "()F")
	public final float method9703() {
		return this.aFloat113;
	}

	@OriginalMember(owner = "client!jw", name = "w", descriptor = "(Lclient!on;B)V")
	public final void method9704(@OriginalArg(0) Class463 arg0, @OriginalArg(1) byte arg1) throws Exception_Sub3 {
		if (!this.method9579(-104621956) || !this.aClass354_2.aBoolean835) {
			throw new Exception_Sub3();
		}
		this.aClass463_30.method29478(arg0);
	}

	@OriginalMember(owner = "client!jw", name = "eo", descriptor = "()Lclient!on;")
	public final Class463 method9705() {
		return this.aClass463_32;
	}

	@OriginalMember(owner = "client!jw", name = "ep", descriptor = "()Lclient!on;")
	public final Class463 method9706() {
		return this.aClass463_32;
	}

	@OriginalMember(owner = "client!jw", name = "ew", descriptor = "()F")
	public final float method9707() {
		return this.aFloat101;
	}

	@OriginalMember(owner = "client!jw", name = "ee", descriptor = "()Lclient!on;")
	public final Class463 method9708() {
		return this.aClass463_30;
	}

	@OriginalMember(owner = "client!jw", name = "ef", descriptor = "()Lclient!on;")
	public final Class463 method9709() {
		return this.aClass463_30;
	}

	@OriginalMember(owner = "client!jw", name = "ez", descriptor = "()Lclient!on;")
	public final Class463 method9710() {
		return this.aClass463_30;
	}

	@OriginalMember(owner = "client!jw", name = "ey", descriptor = "()Lclient!on;")
	public final Class463 method9711() {
		return this.aClass463_30;
	}

	@OriginalMember(owner = "client!jw", name = "ed", descriptor = "()Lclient!oq;")
	public final Class466 method9712() {
		@Pc(1) Class466 local1 = Class466.method29640();
		local1.method29650(this.method9648(-1259963324), this.method9612(-2136212860), this.method9650(1682595490));
		return local1;
	}

	@OriginalMember(owner = "client!jw", name = "ea", descriptor = "()F")
	public final float method9713() {
		return this.aFloat113;
	}

	@OriginalMember(owner = "client!jw", name = "eh", descriptor = "()F")
	public final float method9714() {
		return this.aFloat113;
	}

	@OriginalMember(owner = "client!jw", name = "el", descriptor = "()F")
	public final float method9715() {
		return this.aFloat110;
	}

	@OriginalMember(owner = "client!jw", name = "em", descriptor = "()Z")
	public final boolean method9716() {
		return this.aBoolean213;
	}

	@OriginalMember(owner = "client!jw", name = "et", descriptor = "()Z")
	public final boolean method9717() {
		return this.aBoolean214;
	}
}
