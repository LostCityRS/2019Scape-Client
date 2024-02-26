package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xt")
public abstract class Class162 {

	@OriginalMember(owner = "client!xt", name = "t", descriptor = "Lclient!aag;")
	final Class8 aClass8_31 = new Class8();

	@OriginalMember(owner = "client!xt", name = "f", descriptor = "J")
	long aLong152 = -2605709727881957711L;

	@OriginalMember(owner = "client!xt", name = "e", descriptor = "J")
	long aLong153 = -9087722120326304853L;

	@OriginalMember(owner = "client!xt", name = "u", descriptor = "I")
	int anInt2088 = -169167521;

	@OriginalMember(owner = "client!xt", name = "l", descriptor = "I")
	int anInt2089 = 1218848349;

	@OriginalMember(owner = "client!xt", name = "hp", descriptor = "(Lclient!yp;I)V")
	static void method15796(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2025930272);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class630.method32716(local16, local22, false, 2, arg0, -1102022993);
	}

	@OriginalMember(owner = "client!xt", name = "wb", descriptor = "(Lclient!yp;I)V")
	static void method15797(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(17) Class80_Sub1_Sub2 local17 = (Class80_Sub1_Sub2) Class281.aClass41_Sub22_1.method18054(arg0.anIntArray525[arg0.anInt5778 * 1896589581], 1069936331);
		@Pc(27) int local27 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(29) int local29 = -1;
		for (@Pc(31) int local31 = 0; local31 < local17.anInt279 * 960911231; local31++) {
			if (local17.anIntArray30[local31] == local27) {
				local29 = local17.anIntArray29[local31];
				break;
			}
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local29;
	}

	@OriginalMember(owner = "client!xt", name = "dg", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method15798(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581];
		arg0.anInt4167 = -682912841;
		if (arg0.anInt4117 * -706354509 != local12) {
			arg0.anInt4117 = local12 * 1098751099;
			Class296.method26998(arg0, 131814196);
		}
		if (arg0.anInt4094 * 2071556223 == -1 && !arg1.aBoolean794) {
			Class165_Sub6.method15936(arg0.anInt4087 * -2053489901, (byte) -1);
		}
	}

	@OriginalMember(owner = "client!xt", name = "<init>", descriptor = "()V")
	Class162() {
	}

	@OriginalMember(owner = "client!xt", name = "d", descriptor = "(Lclient!akg;)V")
	final void method15773(@OriginalArg(0) Class80_Sub17 arg0) {
		this.aClass8_31.method232(arg0, 166029448);
	}

	@OriginalMember(owner = "client!xt", name = "k", descriptor = "()I")
	abstract int method15774();

	@OriginalMember(owner = "client!xt", name = "f", descriptor = "(I)V")
	final void method15775(@OriginalArg(0) int arg0) {
		this.aClass8_31.method260(1297983470);
		this.aLong152 = -2605709727881957711L;
		this.aLong153 = -9087722120326304853L;
		this.anInt2088 = -169167521;
		this.anInt2089 = 1218848349;
	}

	@OriginalMember(owner = "client!xt", name = "a", descriptor = "()Z")
	abstract boolean method15776();

	@OriginalMember(owner = "client!xt", name = "u", descriptor = "(Lclient!akg;II)I")
	final int method15777(@OriginalArg(0) Class80_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) long local9;
		if (-8368652091348916817L * this.aLong152 == -1L) {
			local9 = arg1;
		} else {
			local9 = arg0.method23456(-1278816192) - this.aLong152 * -8368652091348916817L;
			if (local9 > (long) arg1) {
				local9 = arg1;
			}
		}
		this.aLong152 = arg0.method23456(-1278816192) * 2605709727881957711L;
		return (int) local9;
	}

	@OriginalMember(owner = "client!xt", name = "l", descriptor = "(I)I")
	abstract int method15778(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xt", name = "g", descriptor = "(Lclient!ald;Lclient!akg;B)V")
	abstract void method15779(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class80_Sub17 arg1, @OriginalArg(2) byte arg2);

	@OriginalMember(owner = "client!xt", name = "j", descriptor = "()V")
	abstract void method15780();

	@OriginalMember(owner = "client!xt", name = "m", descriptor = "(I)Z")
	abstract boolean method15781(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xt", name = "o", descriptor = "(I)Lclient!aku;")
	abstract Class80_Sub31 method15782(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xt", name = "q", descriptor = "(Lclient!ald;Lclient!akg;)V")
	abstract void method15783(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class80_Sub17 arg1);

	@OriginalMember(owner = "client!xt", name = "r", descriptor = "(Lclient!ald;Lclient!akg;)V")
	abstract void method15784(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class80_Sub17 arg1);

	@OriginalMember(owner = "client!xt", name = "i", descriptor = "(I)V")
	abstract void method15785(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xt", name = "x", descriptor = "()I")
	abstract int method15786();

	@OriginalMember(owner = "client!xt", name = "w", descriptor = "(Lclient!ald;Lclient!akg;)V")
	abstract void method15787(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class80_Sub17 arg1);

	@OriginalMember(owner = "client!xt", name = "t", descriptor = "(I)V")
	final void method15788(@OriginalArg(0) int arg0) {
		if (this.method15781(-1514136029)) {
			@Pc(5) Class80_Sub31 local5 = null;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			@Pc(15) Iterator local15 = this.aClass8_31.iterator();
			label100: while (true) {
				while (true) {
					if (!local15.hasNext()) {
						break label100;
					}
					@Pc(22) Class80_Sub17 local22 = (Class80_Sub17) local15.next();
					if (local5 != null && local5.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821 - local7 >= 252 - (this.method15778(-1976656633) + 6)) {
						break label100;
					}
					local22.method24395((byte) 38);
					@Pc(48) int local48 = local22.method23454(-841170568);
					if (local48 < -1) {
						local48 = -1;
					} else if (local48 > 65534) {
						local48 = 65534;
					}
					@Pc(63) int local63 = local22.method23451(410760551);
					if (local63 < -1) {
						local63 = -1;
					} else if (local63 > 65534) {
						local63 = 65534;
					}
					if (local63 == this.anInt2088 * -729474719 && this.anInt2089 * 177480203 == local48) {
						local22.method23453(-454396966);
					} else {
						if (local5 == null) {
							local5 = this.method15782(-2124587702);
							local5.aClass80_Sub36_Sub1_2.method23154(0, 1275868335);
							local7 = local5.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821;
							local5.aClass80_Sub36_Sub1_2.anInt3152 += 2068361142;
							local9 = 0;
							local11 = 0;
						}
						@Pc(132) int local132;
						@Pc(139) int local139;
						@Pc(151) int local151;
						if (this.aLong153 * 4888655562420521213L == -1L) {
							local132 = local63;
							local139 = local48;
							local151 = Integer.MAX_VALUE;
						} else {
							local132 = local63 - this.anInt2088 * -729474719;
							local139 = local48 - this.anInt2089 * 177480203;
							local151 = (int) ((local22.method23456(-1278816192) - this.aLong153 * 4888655562420521213L) / 20L);
							local9 = (int) ((long) local9 + (local22.method23456(-1278816192) - this.aLong153 * 4888655562420521213L) % 20L);
						}
						this.anInt2088 = local63 * 169167521;
						this.anInt2089 = local48 * -1218848349;
						if (local151 < 8 && local132 >= -32 && local132 <= 31 && local139 >= -32 && local139 <= 31) {
							local132 += 32;
							local139 += 32;
							local5.aClass80_Sub36_Sub1_2.method23155((local132 << 6) + (local151 << 12) + local139, (byte) -62);
						} else if (local151 < 32 && local132 >= -128 && local132 <= 127 && local139 >= -128 && local139 <= 127) {
							local132 += 128;
							local139 += 128;
							local5.aClass80_Sub36_Sub1_2.method23154(local151 + 128, 1275868335);
							local5.aClass80_Sub36_Sub1_2.method23155(local139 + (local132 << 8), (byte) -72);
						} else if (local151 < 32) {
							local5.aClass80_Sub36_Sub1_2.method23154(local151 + 192, 1275868335);
							if (local63 == -1 || local48 == -1) {
								local5.aClass80_Sub36_Sub1_2.method23345(Integer.MIN_VALUE, (byte) 8);
							} else {
								local5.aClass80_Sub36_Sub1_2.method23345(local63 | local48 << 16, (byte) 13);
							}
						} else {
							local5.aClass80_Sub36_Sub1_2.method23155((local151 & 0x1FFF) + 57344, (byte) -85);
							if (local63 == -1 || local48 == -1) {
								local5.aClass80_Sub36_Sub1_2.method23345(Integer.MIN_VALUE, (byte) 68);
							} else {
								local5.aClass80_Sub36_Sub1_2.method23345(local63 | local48 << 16, (byte) 61);
							}
						}
						local11++;
						this.method15779(local5.aClass80_Sub36_Sub1_2, local22, (byte) -74);
						this.aLong153 = local22.method23456(-1278816192) * 9087722120326304853L;
						local22.method23453(-454396966);
					}
				}
			}
			if (local5 != null) {
				local5.aClass80_Sub36_Sub1_2.method23171(local5.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821 - local7, (byte) 39);
				@Pc(347) int local347 = local5.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821;
				local5.aClass80_Sub36_Sub1_2.anInt3152 = local7 * 1034180571;
				local5.aClass80_Sub36_Sub1_2.method23154(local9 / local11, 1275868335);
				local5.aClass80_Sub36_Sub1_2.method23154(local9 % local11, 1275868335);
				local5.aClass80_Sub36_Sub1_2.anInt3152 = local347 * 1034180571;
				client.aClass75_1.method1325(local5, (byte) -102);
			}
		}
		this.method15785(-864772484);
	}

	@OriginalMember(owner = "client!xt", name = "e", descriptor = "(Lclient!akg;I)V")
	final void method15789(@OriginalArg(0) Class80_Sub17 arg0, @OriginalArg(1) int arg1) {
		this.aClass8_31.method232(arg0, 1857788648);
	}

	@OriginalMember(owner = "client!xt", name = "h", descriptor = "()V")
	final void method15790() {
		this.aClass8_31.method260(1627112896);
		this.aLong152 = -2605709727881957711L;
		this.aLong153 = -9087722120326304853L;
		this.anInt2088 = -169167521;
		this.anInt2089 = 1218848349;
	}

	@OriginalMember(owner = "client!xt", name = "v", descriptor = "(Lclient!akg;I)I")
	final int method15791(@OriginalArg(0) Class80_Sub17 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9;
		if (-8368652091348916817L * this.aLong152 == -1L) {
			local9 = arg1;
		} else {
			local9 = arg0.method23456(-1278816192) - this.aLong152 * -8368652091348916817L;
			if (local9 > (long) arg1) {
				local9 = arg1;
			}
		}
		this.aLong152 = arg0.method23456(-1278816192) * 2605709727881957711L;
		return (int) local9;
	}

	@OriginalMember(owner = "client!xt", name = "z", descriptor = "(Lclient!akg;)V")
	final void method15792(@OriginalArg(0) Class80_Sub17 arg0) {
		this.aClass8_31.method232(arg0, 1351336355);
	}

	@OriginalMember(owner = "client!xt", name = "p", descriptor = "(Lclient!akg;)V")
	final void method15793(@OriginalArg(0) Class80_Sub17 arg0) {
		this.aClass8_31.method232(arg0, 435882641);
	}

	@OriginalMember(owner = "client!xt", name = "s", descriptor = "()Lclient!aku;")
	abstract Class80_Sub31 method15794();

	@OriginalMember(owner = "client!xt", name = "y", descriptor = "(Lclient!akg;I)I")
	final int method15795(@OriginalArg(0) Class80_Sub17 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9;
		if (-8368652091348916817L * this.aLong152 == -1L) {
			local9 = arg1;
		} else {
			local9 = arg0.method23456(-1278816192) - this.aLong152 * -8368652091348916817L;
			if (local9 > (long) arg1) {
				local9 = arg1;
			}
		}
		this.aLong152 = arg0.method23456(-1278816192) * 2605709727881957711L;
		return (int) local9;
	}
}
