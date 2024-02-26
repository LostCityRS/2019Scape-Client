package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class600 {

	@OriginalMember(owner = "client!us", name = "u", descriptor = "F")
	static final float aFloat336 = 3.0F;

	@OriginalMember(owner = "client!us", name = "l", descriptor = "I")
	static final int anInt5370 = 102;

	@OriginalMember(owner = "client!us", name = "e", descriptor = "I")
	static final int anInt5371 = 10;

	@OriginalMember(owner = "client!us", name = "b", descriptor = "Lclient!di;")
	static Class102 aClass102_13;

	@OriginalMember(owner = "client!us", name = "y", descriptor = "[I")
	int[] anIntArray486;

	@OriginalMember(owner = "client!us", name = "c", descriptor = "[I")
	int[] anIntArray487;

	@OriginalMember(owner = "client!us", name = "v", descriptor = "[I")
	int[] anIntArray488;

	@OriginalMember(owner = "client!us", name = "p", descriptor = "[I")
	int[] anIntArray489;

	@OriginalMember(owner = "client!us", name = "n", descriptor = "[I")
	int[] anIntArray490;

	@OriginalMember(owner = "client!us", name = "z", descriptor = "[I")
	int[] anIntArray491;

	@OriginalMember(owner = "client!us", name = "t", descriptor = "Z")
	public boolean aBoolean928 = true;

	@OriginalMember(owner = "client!us", name = "f", descriptor = "Z")
	boolean aBoolean927 = true;

	@OriginalMember(owner = "client!us", name = "m", descriptor = "Z")
	boolean aBoolean929 = false;

	@OriginalMember(owner = "client!us", name = "h", descriptor = "I")
	int anInt5374 = 0;

	@OriginalMember(owner = "client!us", name = "ax", descriptor = "[F")
	final float[] aFloatArray118 = new float[3];

	@OriginalMember(owner = "client!us", name = "ay", descriptor = "[I")
	final int[] anIntArray492 = new int[2];

	@OriginalMember(owner = "client!us", name = "ai", descriptor = "I")
	int anInt5377 = -1;

	@OriginalMember(owner = "client!us", name = "aq", descriptor = "I")
	int anInt5369 = -1;

	@OriginalMember(owner = "client!us", name = "ao", descriptor = "Z")
	boolean aBoolean930 = true;

	@OriginalMember(owner = "client!us", name = "o", descriptor = "I")
	int anInt5378;

	@OriginalMember(owner = "client!us", name = "j", descriptor = "I")
	int anInt5372;

	@OriginalMember(owner = "client!us", name = "g", descriptor = "Lclient!te;")
	Class570 aClass570_25;

	@OriginalMember(owner = "client!us", name = "k", descriptor = "[Lclient!uh;")
	Class593[] aClass593Array1;

	@OriginalMember(owner = "client!us", name = "s", descriptor = "I")
	int anInt5373;

	@OriginalMember(owner = "client!us", name = "w", descriptor = "[Lclient!uh;")
	Class593[] aClass593Array4;

	@OriginalMember(owner = "client!us", name = "x", descriptor = "I")
	int anInt5376;

	@OriginalMember(owner = "client!us", name = "q", descriptor = "[Lclient!uh;")
	Class593[] aClass593Array2;

	@OriginalMember(owner = "client!us", name = "r", descriptor = "I")
	int anInt5375;

	@OriginalMember(owner = "client!us", name = "d", descriptor = "[Lclient!uh;")
	Class593[] aClass593Array3;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!us", name = "i", descriptor = "Lclient!tg;")
	Class572 aClass572_1;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!te;)V")
	Class600(@OriginalArg(0) Class570 arg0) {
		this.anInt5378 = arg0.anInt5238 * 1533693671;
		this.anInt5372 = arg0.anInt5238 * 1533693671;
		this.aClass570_25 = arg0;
		this.aClass593Array1 = new Class593[541];
		this.anInt5373 = 0;
		this.aClass593Array4 = new Class593[2025];
		this.anInt5376 = 0;
		this.aClass593Array2 = new Class593[1036];
		this.anInt5375 = 0;
		this.aClass593Array3 = new Class593[1014];
		this.anInt5374 = 0;
		this.anIntArrayArrayArray17 = new int[this.aClass570_25.anInt5242 * 1984662039][this.aClass570_25.anInt5245 * 1487025827 + 1][this.aClass570_25.anInt5246 * -1561777241 + 1];
		this.aBoolean929 = false;
		this.aBoolean928 = true;
		if (this.aBoolean928) {
			this.aClass572_1 = new Class572(this);
		}
	}

	@OriginalMember(owner = "client!us", name = "x", descriptor = "(Lclient!uc;)Z")
	boolean method32054(@OriginalArg(0) Class589 arg0) {
		return arg0 == null ? false : this.method32069(arg0.anInt5309, arg0.anInt5312, arg0.anInt5313, arg0.anInt5308 - arg0.anInt5309, arg0.anInt5314 - arg0.anInt5312, arg0.anInt5310 - arg0.anInt5313);
	}

	@OriginalMember(owner = "client!us", name = "t", descriptor = "(IIIIII)V")
	public void method32055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(204) Class568 local204 = this.aClass570_25.aClass568ArrayArrayArray1[arg1][arg2][arg3];
			if (local204 == null) {
				this.aClass570_25.aClass568ArrayArrayArray1[arg1][arg2][arg3] = local204 = new Class568(arg1);
			}
			if (arg0 == 1) {
				local204.aShort179 = (short) arg4;
				local204.aShort178 = (short) arg5;
			} else if (arg0 == 2) {
				local204.aShort177 = (short) arg4;
				local204.aShort180 = (short) arg5;
			}
			if (this.aBoolean929) {
				this.method32058();
			}
			return;
		}
		@Pc(16) int local16;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(40) int local40;
		@Pc(50) int local50;
		@Pc(64) int local64;
		if (arg0 != 8) {
			local16 = (arg2 << this.aClass570_25.anInt5258 * 1479624119) + this.aClass570_25.anInt5238 * 1533693671;
			local24 = local16 - this.aClass570_25.anInt5238 * 1533693671;
			local32 = arg3 << this.aClass570_25.anInt5258 * 1479624119;
			local40 = local32 + this.aClass570_25.anInt5238 * 1533693671;
			local50 = this.aClass570_25.aClass100Array3[arg1].method2917(arg2 + 1, arg3, -1300010696);
			local64 = this.aClass570_25.aClass100Array3[arg1].method2917(arg2, arg3 + 1, -1209388078);
			this.aClass593Array2[this.anInt5375++] = new Class593(this.aClass570_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
			return;
		}
		local16 = arg2 << this.aClass570_25.anInt5258 * 1479624119;
		local24 = local16 + this.aClass570_25.anInt5238 * 1533693671;
		local32 = arg3 << this.aClass570_25.anInt5258 * 1479624119;
		local40 = local32 + this.aClass570_25.anInt5238 * 1533693671;
		local50 = this.aClass570_25.aClass100Array3[arg1].method2917(arg2, arg3, -1334699268);
		local64 = this.aClass570_25.aClass100Array3[arg1].method2917(arg2 + 1, arg3 + 1, -459956128);
		this.aClass593Array2[this.anInt5375++] = new Class593(this.aClass570_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
	}

	@OriginalMember(owner = "client!us", name = "f", descriptor = "(IIII)V")
	public void method32056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(80) Class568 local80 = this.aClass570_25.aClass568ArrayArrayArray1[arg1][arg2][arg3];
			if (local80 != null) {
				if (arg0 == 1) {
					local80.aShort179 = 0;
				} else if (arg0 == 2) {
					local80.aShort177 = 0;
				}
			}
			this.method32058();
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInt5375; local7++) {
			@Pc(16) Class593 local16 = this.aClass593Array2[local7];
			if (local16.aByte155 == arg0 && local16.aByte156 == arg1 && (local16.aShort182 == arg2 && local16.aShort184 == arg3 || local16.aShort183 == arg2 && local16.aShort185 == arg3)) {
				if (local7 != this.anInt5375) {
					System.arraycopy(this.aClass593Array2, local7 + 1, this.aClass593Array2, local7, this.aClass593Array2.length - (local7 + 1));
				}
				this.anInt5375--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!us", name = "e", descriptor = "()V")
	public void method32057() {
		this.method32058();
	}

	@OriginalMember(owner = "client!us", name = "u", descriptor = "()V")
	void method32058() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt5376; local1++) {
			this.aClass593Array4[local1] = null;
		}
		this.anInt5376 = 0;
		@Pc(26) int local26;
		@Pc(35) int local35;
		@Pc(52) Class568 local52;
		for (local1 = 0; local1 < this.aClass570_25.anInt5242 * 1984662039; local1++) {
			for (local26 = 0; local26 < this.aClass570_25.anInt5245 * 1487025827; local26++) {
				for (local35 = 0; local35 < this.aClass570_25.anInt5246 * -1561777241; local35++) {
					local52 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35][local26];
					if (local52 != null) {
						if (local52.aShort179 > 0) {
							local52.aShort179 = (short) (local52.aShort179 * -1);
						}
						if (local52.aShort177 > 0) {
							local52.aShort177 = (short) (local52.aShort177 * -1);
						}
					}
				}
			}
		}
		for (local1 = 0; local1 < this.aClass570_25.anInt5242 * 1984662039; local1++) {
			for (local26 = 0; local26 < this.aClass570_25.anInt5245 * 1487025827; local26++) {
				for (local35 = 0; local35 < this.aClass570_25.anInt5246 * -1561777241; local35++) {
					local52 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35][local26];
					if (local52 != null) {
						@Pc(146) boolean local146 = this.aClass570_25.aClass568ArrayArrayArray1[0][local35][local26] != null && this.aClass570_25.aClass568ArrayArrayArray1[0][local35][local26].aClass568_1 != null;
						@Pc(151) int local151;
						@Pc(153) int local153;
						@Pc(157) int local157;
						@Pc(169) Class568 local169;
						@Pc(179) int local179;
						@Pc(343) int local343;
						@Pc(359) int local359;
						@Pc(366) int local366;
						@Pc(384) int local384;
						@Pc(391) int local391;
						@Pc(399) int local399;
						@Pc(407) int local407;
						@Pc(421) int local421;
						@Pc(464) int local464;
						@Pc(469) int local469;
						if (local52.aShort179 < 0) {
							local151 = local26;
							local153 = local26;
							local157 = local1;
							local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35][local26 - 1];
							local179 = this.aClass570_25.aClass100Array3[local1].method2917(local35, local26, -2042868826);
							while (local151 > 0 && local169 != null && local169.aShort179 < 0 && local169.aShort179 == local52.aShort179 && local169.aShort178 == local52.aShort178 && local179 == this.aClass570_25.aClass100Array3[local1].method2917(local35, local151 - 1, -490166104) && (local151 - 1 <= 0 || local179 == this.aClass570_25.aClass100Array3[local1].method2917(local35, local151 - 2, -870679542)) && local153 - local151 <= 10) {
								local151--;
								local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35][local151 - 1];
							}
							for (local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35][local153 + 1]; local153 < this.aClass570_25.anInt5246 * -1561777241 && local169 != null && local169.aShort179 < 0 && local169.aShort179 == local52.aShort179 && local169.aShort178 == local52.aShort178 && local179 == this.aClass570_25.aClass100Array3[local1].method2917(local35, local153 + 1, -1159373804) && (local153 + 1 >= this.aClass570_25.anInt5246 * -1561777241 || local179 == this.aClass570_25.aClass100Array3[local1].method2917(local35, local153 + 2, -1137751591)) && local153 - local151 <= 10; local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35][local153 + 1]) {
								local153++;
							}
							local343 = local1 - local1 + 1;
							local359 = this.aClass570_25.aClass100Array3[local146 ? local1 + 1 : local1].method2917(local35, local151, -2069228358);
							local366 = local359 + local52.aShort179 * local343;
							local384 = this.aClass570_25.aClass100Array3[local146 ? local1 + 1 : local1].method2917(local35, local153 + 1, -1165863028);
							local391 = local384 + local52.aShort179 * local343;
							local399 = local35 << this.aClass570_25.anInt5258 * 1479624119;
							local407 = local151 << this.aClass570_25.anInt5258 * 1479624119;
							local421 = (local153 << this.aClass570_25.anInt5258 * 1479624119) + this.aClass570_25.anInt5238 * 1533693671;
							this.aClass593Array4[this.anInt5376++] = new Class593(this.aClass570_25, 1, local1, local399 + local52.aShort178, local399 + local52.aShort178, local399 + local52.aShort178, local399 + local52.aShort178, local359, local384, local391, local366, local407, local421, local421, local407);
							for (local464 = local1; local464 <= local157; local464++) {
								for (local469 = local151; local469 <= local153; local469++) {
									this.aClass570_25.aClass568ArrayArrayArray1[local464][local35][local469].aShort179 = (short) (this.aClass570_25.aClass568ArrayArrayArray1[local464][local35][local469].aShort179 * -1);
								}
							}
						}
						if (local52.aShort177 < 0) {
							local151 = local35;
							local153 = local35;
							local157 = local1;
							local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35 - 1][local26];
							local179 = this.aClass570_25.aClass100Array3[local1].method2917(local35, local26, -346107581);
							while (local151 > 0 && local169 != null && local169.aShort177 < 0 && local169.aShort177 == local52.aShort177 && local169.aShort180 == local52.aShort180 && local179 == this.aClass570_25.aClass100Array3[local1].method2917(local151 - 1, local26, -1361720766) && (local151 - 1 <= 0 || local179 == this.aClass570_25.aClass100Array3[local1].method2917(local151 - 2, local26, -248832695)) && local153 - local151 <= 10) {
								local151--;
								local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local151 - 1][local26];
							}
							for (local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local153 + 1][local26]; local153 < this.aClass570_25.anInt5245 * 1487025827 && local169 != null && local169.aShort177 < 0 && local169.aShort177 == local52.aShort177 && local169.aShort180 == local52.aShort180 && local179 == this.aClass570_25.aClass100Array3[local1].method2917(local153 + 1, local26, -1689077992) && (local153 + 1 >= this.aClass570_25.anInt5245 * 1487025827 || local179 == this.aClass570_25.aClass100Array3[local1].method2917(local153 + 2, local26, -900648037)) && local153 - local151 <= 10; local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local153 + 1][local26]) {
								local153++;
							}
							local343 = local1 - local1 + 1;
							local359 = this.aClass570_25.aClass100Array3[local146 ? local1 + 1 : local1].method2917(local151, local26, -736176154);
							local366 = local359 + local52.aShort177 * local343;
							local384 = this.aClass570_25.aClass100Array3[local146 ? local1 + 1 : local1].method2917(local153 + 1, local26, -1138108902);
							local391 = local384 + local52.aShort177 * local343;
							local399 = local151 << this.aClass570_25.anInt5258 * 1479624119;
							local407 = (local153 << this.aClass570_25.anInt5258 * 1479624119) + this.aClass570_25.anInt5238 * 1533693671;
							local421 = local26 << this.aClass570_25.anInt5258 * 1479624119;
							this.aClass593Array4[this.anInt5376++] = new Class593(this.aClass570_25, 2, local1, local399, local407, local407, local399, local359, local384, local391, local366, local421 + local52.aShort180, local421 + local52.aShort180, local421 + local52.aShort180, local421 + local52.aShort180);
							for (local464 = local1; local464 <= local157; local464++) {
								for (local469 = local151; local469 <= local153; local469++) {
									this.aClass570_25.aClass568ArrayArrayArray1[local464][local469][local26].aShort177 = (short) (this.aClass570_25.aClass568ArrayArrayArray1[local464][local469][local26].aShort177 * -1);
								}
							}
						}
					}
				}
			}
		}
		this.aBoolean929 = true;
	}

	@OriginalMember(owner = "client!us", name = "q", descriptor = "(IIIIII)V")
	public void method32059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(204) Class568 local204 = this.aClass570_25.aClass568ArrayArrayArray1[arg1][arg2][arg3];
			if (local204 == null) {
				this.aClass570_25.aClass568ArrayArrayArray1[arg1][arg2][arg3] = local204 = new Class568(arg1);
			}
			if (arg0 == 1) {
				local204.aShort179 = (short) arg4;
				local204.aShort178 = (short) arg5;
			} else if (arg0 == 2) {
				local204.aShort177 = (short) arg4;
				local204.aShort180 = (short) arg5;
			}
			if (this.aBoolean929) {
				this.method32058();
			}
			return;
		}
		@Pc(16) int local16;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(40) int local40;
		@Pc(50) int local50;
		@Pc(64) int local64;
		if (arg0 != 8) {
			local16 = (arg2 << this.aClass570_25.anInt5258 * 1479624119) + this.aClass570_25.anInt5238 * 1533693671;
			local24 = local16 - this.aClass570_25.anInt5238 * 1533693671;
			local32 = arg3 << this.aClass570_25.anInt5258 * 1479624119;
			local40 = local32 + this.aClass570_25.anInt5238 * 1533693671;
			local50 = this.aClass570_25.aClass100Array3[arg1].method2917(arg2 + 1, arg3, -266411488);
			local64 = this.aClass570_25.aClass100Array3[arg1].method2917(arg2, arg3 + 1, -538769691);
			this.aClass593Array2[this.anInt5375++] = new Class593(this.aClass570_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
			return;
		}
		local16 = arg2 << this.aClass570_25.anInt5258 * 1479624119;
		local24 = local16 + this.aClass570_25.anInt5238 * 1533693671;
		local32 = arg3 << this.aClass570_25.anInt5258 * 1479624119;
		local40 = local32 + this.aClass570_25.anInt5238 * 1533693671;
		local50 = this.aClass570_25.aClass100Array3[arg1].method2917(arg2, arg3, -1061085731);
		local64 = this.aClass570_25.aClass100Array3[arg1].method2917(arg2 + 1, arg3 + 1, -1918705641);
		this.aClass593Array2[this.anInt5375++] = new Class593(this.aClass570_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
	}

	@OriginalMember(owner = "client!us", name = "i", descriptor = "(Lclient!di;Lclient!uh;I)V")
	void method32060(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class593 arg1, @OriginalArg(2) int arg2) {
		aClass102_13 = arg0;
		@Pc(10) int local10;
		if (this.anIntArray491 != null && arg1.aByte156 >= arg2) {
			for (local10 = 0; local10 < this.anIntArray491.length; local10++) {
				if (this.anIntArray491[local10] != -1000000 && (arg1.anIntArray481[0] <= this.anIntArray491[local10] || arg1.anIntArray481[1] <= this.anIntArray491[local10] || arg1.anIntArray481[2] <= this.anIntArray491[local10] || arg1.anIntArray481[3] <= this.anIntArray491[local10]) && (arg1.anIntArray482[0] <= this.anIntArray488[local10] || arg1.anIntArray482[1] <= this.anIntArray488[local10] || arg1.anIntArray482[2] <= this.anIntArray488[local10] || arg1.anIntArray482[3] <= this.anIntArray488[local10]) && (arg1.anIntArray482[0] >= this.anIntArray489[local10] || arg1.anIntArray482[1] >= this.anIntArray489[local10] || arg1.anIntArray482[2] >= this.anIntArray489[local10] || arg1.anIntArray482[3] >= this.anIntArray489[local10]) && (arg1.anIntArray483[0] <= this.anIntArray486[local10] || arg1.anIntArray483[1] <= this.anIntArray486[local10] || arg1.anIntArray483[2] <= this.anIntArray486[local10] || arg1.anIntArray483[3] <= this.anIntArray486[local10]) && (arg1.anIntArray483[0] >= this.anIntArray490[local10] || arg1.anIntArray483[1] >= this.anIntArray490[local10] || arg1.anIntArray483[2] >= this.anIntArray490[local10] || arg1.anIntArray483[3] >= this.anIntArray490[local10])) {
					return;
				}
			}
		}
		@Pc(259) int local259;
		@Pc(293) int local293;
		@Pc(324) boolean local324;
		@Pc(354) float local354;
		if (arg1.aByte155 == 1) {
			local10 = arg1.aShort182 - this.aClass570_25.anInt5241 * 1611671173 + this.aClass570_25.anInt5244 * 1989483179;
			if (local10 >= 0 && local10 <= this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
				local259 = arg1.aShort184 - this.aClass570_25.anInt5253 * 1105662773 + this.aClass570_25.anInt5244 * 1989483179;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
					return;
				}
				local293 = arg1.aShort185 - this.aClass570_25.anInt5253 * 1105662773 + this.aClass570_25.anInt5244 * 1989483179;
				if (local293 > this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
					local293 = this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179;
				} else if (local293 < 0) {
					return;
				}
				local324 = false;
				while (local259 <= local293) {
					if (this.aClass570_25.aBooleanArrayArray20[local10][local259++]) {
						local324 = true;
						break;
					}
				}
				if (local324) {
					local354 = this.aClass570_25.anInt5254 * 1851678799 - arg1.anIntArray482[0];
					if (local354 < 0.0F) {
						local354 *= -1.0F;
					}
					if (!(local354 < (float) this.anInt5378) && (this.method32062(arg1, 0) && (this.method32062(arg1, 1) && (this.method32062(arg1, 2) && this.method32062(arg1, 3))))) {
						this.aClass593Array3[this.anInt5374++] = arg1;
					}
				}
			}
		} else if (arg1.aByte155 == 2) {
			local10 = arg1.aShort184 - this.aClass570_25.anInt5253 * 1105662773 + this.aClass570_25.anInt5244 * 1989483179;
			if (local10 >= 0 && local10 <= this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
				local259 = arg1.aShort182 - this.aClass570_25.anInt5241 * 1611671173 + this.aClass570_25.anInt5244 * 1989483179;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
					return;
				}
				local293 = arg1.aShort183 - this.aClass570_25.anInt5241 * 1611671173 + this.aClass570_25.anInt5244 * 1989483179;
				if (local293 > this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
					local293 = this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179;
				} else if (local293 < 0) {
					return;
				}
				local324 = false;
				while (local259 <= local293) {
					if (this.aClass570_25.aBooleanArrayArray20[local259++][local10]) {
						local324 = true;
						break;
					}
				}
				if (local324) {
					local354 = this.aClass570_25.anInt5255 * 749878523 - arg1.anIntArray483[0];
					if (local354 < 0.0F) {
						local354 *= -1.0F;
					}
					if (!(local354 < (float) this.anInt5378) && (this.method32062(arg1, 0) && (this.method32062(arg1, 1) && (this.method32062(arg1, 2) && this.method32062(arg1, 3))))) {
						this.aClass593Array3[this.anInt5374++] = arg1;
					}
				}
			}
		} else if (arg1.aByte155 == 16 || arg1.aByte155 == 8) {
			local10 = arg1.aShort182 - this.aClass570_25.anInt5241 * 1611671173 + this.aClass570_25.anInt5244 * 1989483179;
			if (local10 >= 0 && local10 <= this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
				local259 = arg1.aShort184 - this.aClass570_25.anInt5253 * 1105662773 + this.aClass570_25.anInt5244 * 1989483179;
				if (local259 >= 0 && local259 <= this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179 && this.aClass570_25.aBooleanArrayArray20[local10][local259]) {
					@Pc(692) float local692 = (float) (this.aClass570_25.anInt5254 * 1851678799 - arg1.anIntArray482[0]);
					if (local692 < 0.0F) {
						local692 *= -1.0F;
					}
					@Pc(712) float local712 = (float) (this.aClass570_25.anInt5255 * 749878523 - arg1.anIntArray483[0]);
					if (local712 < 0.0F) {
						local712 *= -1.0F;
					}
					if ((!(local692 < (float) this.anInt5378) || !(local712 < (float) this.anInt5378)) && (this.method32062(arg1, 0) && (this.method32062(arg1, 1) && (this.method32062(arg1, 2) && this.method32062(arg1, 3))))) {
						this.aClass593Array3[this.anInt5374++] = arg1;
					}
				}
			}
		} else if (arg1.aByte155 == 4) {
			@Pc(785) float local785 = (float) (arg1.anIntArray481[0] - this.aClass570_25.anInt5256 * 114370215);
			if (!(local785 <= (float) this.anInt5372)) {
				local259 = arg1.aShort184 - this.aClass570_25.anInt5253 * 1105662773 + this.aClass570_25.anInt5244 * 1989483179;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
					return;
				}
				local293 = arg1.aShort185 - this.aClass570_25.anInt5253 * 1105662773 + this.aClass570_25.anInt5244 * 1989483179;
				if (local293 > this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
					local293 = this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179;
				} else if (local293 < 0) {
					return;
				}
				@Pc(885) int local885 = arg1.aShort182 - this.aClass570_25.anInt5241 * 1611671173 + this.aClass570_25.anInt5244 * 1989483179;
				if (local885 < 0) {
					local885 = 0;
				} else if (local885 > this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
					return;
				}
				@Pc(919) int local919 = arg1.aShort183 - this.aClass570_25.anInt5241 * 1611671173 + this.aClass570_25.anInt5244 * 1989483179;
				if (local919 > this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
					local919 = this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179;
				} else if (local919 < 0) {
					return;
				}
				@Pc(950) boolean local950 = false;
				label286: for (@Pc(952) int local952 = local885; local952 <= local919; local952++) {
					for (@Pc(957) int local957 = local259; local957 <= local293; local957++) {
						if (this.aClass570_25.aBooleanArrayArray20[local952][local957]) {
							local950 = true;
							break label286;
						}
					}
				}
				if (local950 && (this.method32062(arg1, 0) && (this.method32062(arg1, 1) && (this.method32062(arg1, 2) && this.method32062(arg1, 3))))) {
					this.aClass593Array3[this.anInt5374++] = arg1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!us", name = "z", descriptor = "()V")
	void method32061() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt5376; local1++) {
			this.aClass593Array4[local1] = null;
		}
		this.anInt5376 = 0;
		@Pc(26) int local26;
		@Pc(35) int local35;
		@Pc(52) Class568 local52;
		for (local1 = 0; local1 < this.aClass570_25.anInt5242 * 1984662039; local1++) {
			for (local26 = 0; local26 < this.aClass570_25.anInt5245 * 1487025827; local26++) {
				for (local35 = 0; local35 < this.aClass570_25.anInt5246 * -1561777241; local35++) {
					local52 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35][local26];
					if (local52 != null) {
						if (local52.aShort179 > 0) {
							local52.aShort179 = (short) (local52.aShort179 * -1);
						}
						if (local52.aShort177 > 0) {
							local52.aShort177 = (short) (local52.aShort177 * -1);
						}
					}
				}
			}
		}
		for (local1 = 0; local1 < this.aClass570_25.anInt5242 * 1984662039; local1++) {
			for (local26 = 0; local26 < this.aClass570_25.anInt5245 * 1487025827; local26++) {
				for (local35 = 0; local35 < this.aClass570_25.anInt5246 * -1561777241; local35++) {
					local52 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35][local26];
					if (local52 != null) {
						@Pc(146) boolean local146 = this.aClass570_25.aClass568ArrayArrayArray1[0][local35][local26] != null && this.aClass570_25.aClass568ArrayArrayArray1[0][local35][local26].aClass568_1 != null;
						@Pc(151) int local151;
						@Pc(153) int local153;
						@Pc(157) int local157;
						@Pc(169) Class568 local169;
						@Pc(179) int local179;
						@Pc(343) int local343;
						@Pc(359) int local359;
						@Pc(366) int local366;
						@Pc(384) int local384;
						@Pc(391) int local391;
						@Pc(399) int local399;
						@Pc(407) int local407;
						@Pc(421) int local421;
						@Pc(464) int local464;
						@Pc(469) int local469;
						if (local52.aShort179 < 0) {
							local151 = local26;
							local153 = local26;
							local157 = local1;
							local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35][local26 - 1];
							local179 = this.aClass570_25.aClass100Array3[local1].method2917(local35, local26, -1116556283);
							while (local151 > 0 && local169 != null && local169.aShort179 < 0 && local169.aShort179 == local52.aShort179 && local169.aShort178 == local52.aShort178 && local179 == this.aClass570_25.aClass100Array3[local1].method2917(local35, local151 - 1, -1328421542) && (local151 - 1 <= 0 || local179 == this.aClass570_25.aClass100Array3[local1].method2917(local35, local151 - 2, -1934550749)) && local153 - local151 <= 10) {
								local151--;
								local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35][local151 - 1];
							}
							for (local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35][local153 + 1]; local153 < this.aClass570_25.anInt5246 * -1561777241 && local169 != null && local169.aShort179 < 0 && local169.aShort179 == local52.aShort179 && local169.aShort178 == local52.aShort178 && local179 == this.aClass570_25.aClass100Array3[local1].method2917(local35, local153 + 1, -733795952) && (local153 + 1 >= this.aClass570_25.anInt5246 * -1561777241 || local179 == this.aClass570_25.aClass100Array3[local1].method2917(local35, local153 + 2, -440295437)) && local153 - local151 <= 10; local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35][local153 + 1]) {
								local153++;
							}
							local343 = local1 - local1 + 1;
							local359 = this.aClass570_25.aClass100Array3[local146 ? local1 + 1 : local1].method2917(local35, local151, -1363545341);
							local366 = local359 + local52.aShort179 * local343;
							local384 = this.aClass570_25.aClass100Array3[local146 ? local1 + 1 : local1].method2917(local35, local153 + 1, -1237718881);
							local391 = local384 + local52.aShort179 * local343;
							local399 = local35 << this.aClass570_25.anInt5258 * 1479624119;
							local407 = local151 << this.aClass570_25.anInt5258 * 1479624119;
							local421 = (local153 << this.aClass570_25.anInt5258 * 1479624119) + this.aClass570_25.anInt5238 * 1533693671;
							this.aClass593Array4[this.anInt5376++] = new Class593(this.aClass570_25, 1, local1, local399 + local52.aShort178, local399 + local52.aShort178, local399 + local52.aShort178, local399 + local52.aShort178, local359, local384, local391, local366, local407, local421, local421, local407);
							for (local464 = local1; local464 <= local157; local464++) {
								for (local469 = local151; local469 <= local153; local469++) {
									this.aClass570_25.aClass568ArrayArrayArray1[local464][local35][local469].aShort179 = (short) (this.aClass570_25.aClass568ArrayArrayArray1[local464][local35][local469].aShort179 * -1);
								}
							}
						}
						if (local52.aShort177 < 0) {
							local151 = local35;
							local153 = local35;
							local157 = local1;
							local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35 - 1][local26];
							local179 = this.aClass570_25.aClass100Array3[local1].method2917(local35, local26, -394169023);
							while (local151 > 0 && local169 != null && local169.aShort177 < 0 && local169.aShort177 == local52.aShort177 && local169.aShort180 == local52.aShort180 && local179 == this.aClass570_25.aClass100Array3[local1].method2917(local151 - 1, local26, -1453628499) && (local151 - 1 <= 0 || local179 == this.aClass570_25.aClass100Array3[local1].method2917(local151 - 2, local26, -786342563)) && local153 - local151 <= 10) {
								local151--;
								local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local151 - 1][local26];
							}
							for (local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local153 + 1][local26]; local153 < this.aClass570_25.anInt5245 * 1487025827 && local169 != null && local169.aShort177 < 0 && local169.aShort177 == local52.aShort177 && local169.aShort180 == local52.aShort180 && local179 == this.aClass570_25.aClass100Array3[local1].method2917(local153 + 1, local26, -708139131) && (local153 + 1 >= this.aClass570_25.anInt5245 * 1487025827 || local179 == this.aClass570_25.aClass100Array3[local1].method2917(local153 + 2, local26, -962997994)) && local153 - local151 <= 10; local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local153 + 1][local26]) {
								local153++;
							}
							local343 = local1 - local1 + 1;
							local359 = this.aClass570_25.aClass100Array3[local146 ? local1 + 1 : local1].method2917(local151, local26, -2113070286);
							local366 = local359 + local52.aShort177 * local343;
							local384 = this.aClass570_25.aClass100Array3[local146 ? local1 + 1 : local1].method2917(local153 + 1, local26, -1150634572);
							local391 = local384 + local52.aShort177 * local343;
							local399 = local151 << this.aClass570_25.anInt5258 * 1479624119;
							local407 = (local153 << this.aClass570_25.anInt5258 * 1479624119) + this.aClass570_25.anInt5238 * 1533693671;
							local421 = local26 << this.aClass570_25.anInt5258 * 1479624119;
							this.aClass593Array4[this.anInt5376++] = new Class593(this.aClass570_25, 2, local1, local399, local407, local407, local399, local359, local384, local391, local366, local421 + local52.aShort180, local421 + local52.aShort180, local421 + local52.aShort180, local421 + local52.aShort180);
							for (local464 = local1; local464 <= local157; local464++) {
								for (local469 = local151; local469 <= local153; local469++) {
									this.aClass570_25.aClass568ArrayArrayArray1[local464][local469][local26].aShort177 = (short) (this.aClass570_25.aClass568ArrayArrayArray1[local464][local469][local26].aShort177 * -1);
								}
							}
						}
					}
				}
			}
		}
		this.aBoolean929 = true;
	}

	@OriginalMember(owner = "client!us", name = "m", descriptor = "(Lclient!uh;I)Z")
	boolean method32062(@OriginalArg(0) Class593 arg0, @OriginalArg(1) int arg1) {
		if (this.method32063(arg0.anIntArray482[arg1], arg0.anIntArray481[arg1], arg0.anIntArray483[arg1])) {
			arg0.aShortArray140[arg1] = (short) this.aFloatArray118[0];
			arg0.aShortArray139[arg1] = (short) this.aFloatArray118[1];
			arg0.aShortArray141[arg1] = (short) this.aFloatArray118[2];
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!us", name = "o", descriptor = "(III)Z")
	boolean method32063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		aClass102_13.method21114((float) arg0, (float) arg1, (float) arg2, this.aFloatArray118);
		if (this.aFloatArray118[2] < 50.0F) {
			return false;
		} else {
			this.aFloatArray118[0] /= 3.0F;
			this.aFloatArray118[1] /= 3.0F;
			return true;
		}
	}

	@OriginalMember(owner = "client!us", name = "j", descriptor = "(III)Z")
	boolean method32064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean928 || !this.aBoolean927) {
			return false;
		} else if (this.aClass572_1.anInt5279 < 102) {
			return false;
		} else {
			@Pc(23) int local23 = this.anIntArrayArrayArray17[arg0][arg1][arg2];
			if (local23 == -(this.aClass570_25.anInt5257 * -2082741639)) {
				return false;
			} else if (local23 == this.aClass570_25.anInt5257 * -2082741639) {
				return true;
			} else if (this.aClass570_25.aClass100Array1 == this.aClass570_25.aClass100Array2) {
				return false;
			} else {
				@Pc(59) int local59 = arg1 << this.aClass570_25.anInt5258 * 1479624119;
				@Pc(67) int local67 = arg2 << this.aClass570_25.anInt5258 * 1479624119;
				if (this.method32070(local59 + 1, this.aClass570_25.aClass100Array1[arg0].method2917(arg1, arg2, -2052072487), local67 + 1, local59 + this.aClass570_25.anInt5238 * 1533693671 - 1, this.aClass570_25.aClass100Array1[arg0].method2917(arg1 + 1, arg2 + 1, -1569728378), local67 + this.aClass570_25.anInt5238 * 1533693671 - 1, local59 + 1, this.aClass570_25.aClass100Array1[arg0].method2917(arg1, arg2 + 1, -995869126), local67 + this.aClass570_25.anInt5238 * 1533693671 - 1) && this.method32070(local59 + 1, this.aClass570_25.aClass100Array1[arg0].method2917(arg1, arg2, -527630817), local67 + 1, local59 + this.aClass570_25.anInt5238 * 1533693671 - 1, this.aClass570_25.aClass100Array1[arg0].method2917(arg1 + 1, arg2, -1356879313), local67 + 1, local59 + this.aClass570_25.anInt5238 * 1533693671 - 1, this.aClass570_25.aClass100Array1[arg0].method2917(arg1 + 1, arg2 + 1, -643525676), local67 + this.aClass570_25.anInt5238 * 1533693671 - 1)) {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = this.aClass570_25.anInt5257 * -2082741639;
					return true;
				} else {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = -(this.aClass570_25.anInt5257 * -2082741639);
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!us", name = "am", descriptor = "(Lclient!uc;)Z")
	boolean method32065(@OriginalArg(0) Class589 arg0) {
		return arg0 == null ? false : this.method32069(arg0.anInt5309, arg0.anInt5312, arg0.anInt5313, arg0.anInt5308 - arg0.anInt5309, arg0.anInt5314 - arg0.anInt5312, arg0.anInt5310 - arg0.anInt5313);
	}

	@OriginalMember(owner = "client!us", name = "n", descriptor = "(Lclient!di;I)V")
	void method32066(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		aClass102_13 = arg0;
		if (!this.aBoolean928 || !this.aBoolean927) {
			this.anInt5374 = 0;
			return;
		}
		if (this.aBoolean930) {
			this.aClass570_25.aClass59_1.method1175((byte) 34);
		}
		aClass102_13.method20723(this.anIntArray492);
		if (this.anInt5377 != (int) ((float) this.anIntArray492[0] / 3.0F) || this.anInt5369 != (int) ((float) this.anIntArray492[1] / 3.0F)) {
			this.anInt5377 = (int) ((float) this.anIntArray492[0] / 3.0F);
			this.anInt5369 = (int) ((float) this.anIntArray492[1] / 3.0F);
			this.anIntArray487 = new int[this.anInt5377 * this.anInt5369];
		}
		this.anInt5374 = 0;
		@Pc(79) int local79;
		for (local79 = 0; local79 < this.anInt5373; local79++) {
			this.method32060(aClass102_13, this.aClass593Array1[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt5376; local79++) {
			this.method32060(aClass102_13, this.aClass593Array4[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt5375; local79++) {
			this.method32060(aClass102_13, this.aClass593Array2[local79], arg1);
		}
		this.aClass572_1.anInt5279 = 0;
		if (this.anInt5374 > 0) {
			local79 = this.anIntArray487.length;
			@Pc(142) int local142 = local79 - local79 & 0x7;
			@Pc(144) int local144 = 0;
			while (local144 < local142) {
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
			}
			while (local144 < local79) {
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
			}
			this.aClass572_1.anInt5280 = 1;
			for (@Pc(212) int local212 = 0; local212 < this.anInt5374; local212++) {
				@Pc(221) Class593 local221 = this.aClass593Array3[local212];
				this.aClass572_1.method31737(local221.aShortArray139[0], local221.aShortArray139[1], local221.aShortArray139[3], local221.aShortArray140[0], local221.aShortArray140[1], local221.aShortArray140[3], local221.aShortArray141[0], local221.aShortArray141[1], local221.aShortArray141[3]);
				this.aClass572_1.method31737(local221.aShortArray139[1], local221.aShortArray139[2], local221.aShortArray139[3], local221.aShortArray140[1], local221.aShortArray140[2], local221.aShortArray140[3], local221.aShortArray141[1], local221.aShortArray141[2], local221.aShortArray141[3]);
			}
			this.aClass572_1.anInt5280 = 2;
		}
		if (this.aBoolean930) {
			this.aClass570_25.aClass59_1.method1175((byte) 114);
		}
	}

	@OriginalMember(owner = "client!us", name = "k", descriptor = "(IIIIILclient!uc;)Z")
	boolean method32067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class589 arg5) {
		if (!this.aBoolean928 || !this.aBoolean927) {
			return false;
		} else if (this.aClass572_1.anInt5279 < 102) {
			return false;
		} else if (arg1 < 0 || arg3 < 0 || arg2 >= this.anIntArrayArrayArray17[arg0].length || arg4 >= this.anIntArrayArrayArray17[arg0][arg1].length) {
			return false;
		} else if (arg1 != arg2 || arg3 != arg4) {
			for (@Pc(60) int local60 = arg1; local60 <= arg2; local60++) {
				for (@Pc(65) int local65 = arg3; local65 <= arg4; local65++) {
					if (this.anIntArrayArrayArray17[arg0][local60][local65] == -(this.aClass570_25.anInt5257 * -2082741639)) {
						return false;
					}
				}
			}
			if (this.method32054(arg5)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method32064(arg0, arg1, arg3)) {
			return this.method32054(arg5);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!us", name = "v", descriptor = "()V")
	void method32068() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt5376; local1++) {
			this.aClass593Array4[local1] = null;
		}
		this.anInt5376 = 0;
		@Pc(26) int local26;
		@Pc(35) int local35;
		@Pc(52) Class568 local52;
		for (local1 = 0; local1 < this.aClass570_25.anInt5242 * 1984662039; local1++) {
			for (local26 = 0; local26 < this.aClass570_25.anInt5245 * 1487025827; local26++) {
				for (local35 = 0; local35 < this.aClass570_25.anInt5246 * -1561777241; local35++) {
					local52 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35][local26];
					if (local52 != null) {
						if (local52.aShort179 > 0) {
							local52.aShort179 = (short) (local52.aShort179 * -1);
						}
						if (local52.aShort177 > 0) {
							local52.aShort177 = (short) (local52.aShort177 * -1);
						}
					}
				}
			}
		}
		for (local1 = 0; local1 < this.aClass570_25.anInt5242 * 1984662039; local1++) {
			for (local26 = 0; local26 < this.aClass570_25.anInt5245 * 1487025827; local26++) {
				for (local35 = 0; local35 < this.aClass570_25.anInt5246 * -1561777241; local35++) {
					local52 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35][local26];
					if (local52 != null) {
						@Pc(146) boolean local146 = this.aClass570_25.aClass568ArrayArrayArray1[0][local35][local26] != null && this.aClass570_25.aClass568ArrayArrayArray1[0][local35][local26].aClass568_1 != null;
						@Pc(151) int local151;
						@Pc(153) int local153;
						@Pc(157) int local157;
						@Pc(169) Class568 local169;
						@Pc(179) int local179;
						@Pc(343) int local343;
						@Pc(359) int local359;
						@Pc(366) int local366;
						@Pc(384) int local384;
						@Pc(391) int local391;
						@Pc(399) int local399;
						@Pc(407) int local407;
						@Pc(421) int local421;
						@Pc(464) int local464;
						@Pc(469) int local469;
						if (local52.aShort179 < 0) {
							local151 = local26;
							local153 = local26;
							local157 = local1;
							local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35][local26 - 1];
							local179 = this.aClass570_25.aClass100Array3[local1].method2917(local35, local26, -323428165);
							while (local151 > 0 && local169 != null && local169.aShort179 < 0 && local169.aShort179 == local52.aShort179 && local169.aShort178 == local52.aShort178 && local179 == this.aClass570_25.aClass100Array3[local1].method2917(local35, local151 - 1, -1959958950) && (local151 - 1 <= 0 || local179 == this.aClass570_25.aClass100Array3[local1].method2917(local35, local151 - 2, -1554173668)) && local153 - local151 <= 10) {
								local151--;
								local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35][local151 - 1];
							}
							for (local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35][local153 + 1]; local153 < this.aClass570_25.anInt5246 * -1561777241 && local169 != null && local169.aShort179 < 0 && local169.aShort179 == local52.aShort179 && local169.aShort178 == local52.aShort178 && local179 == this.aClass570_25.aClass100Array3[local1].method2917(local35, local153 + 1, -243951867) && (local153 + 1 >= this.aClass570_25.anInt5246 * -1561777241 || local179 == this.aClass570_25.aClass100Array3[local1].method2917(local35, local153 + 2, -303246910)) && local153 - local151 <= 10; local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35][local153 + 1]) {
								local153++;
							}
							local343 = local1 - local1 + 1;
							local359 = this.aClass570_25.aClass100Array3[local146 ? local1 + 1 : local1].method2917(local35, local151, -905638800);
							local366 = local359 + local52.aShort179 * local343;
							local384 = this.aClass570_25.aClass100Array3[local146 ? local1 + 1 : local1].method2917(local35, local153 + 1, -1949851065);
							local391 = local384 + local52.aShort179 * local343;
							local399 = local35 << this.aClass570_25.anInt5258 * 1479624119;
							local407 = local151 << this.aClass570_25.anInt5258 * 1479624119;
							local421 = (local153 << this.aClass570_25.anInt5258 * 1479624119) + this.aClass570_25.anInt5238 * 1533693671;
							this.aClass593Array4[this.anInt5376++] = new Class593(this.aClass570_25, 1, local1, local399 + local52.aShort178, local399 + local52.aShort178, local399 + local52.aShort178, local399 + local52.aShort178, local359, local384, local391, local366, local407, local421, local421, local407);
							for (local464 = local1; local464 <= local157; local464++) {
								for (local469 = local151; local469 <= local153; local469++) {
									this.aClass570_25.aClass568ArrayArrayArray1[local464][local35][local469].aShort179 = (short) (this.aClass570_25.aClass568ArrayArrayArray1[local464][local35][local469].aShort179 * -1);
								}
							}
						}
						if (local52.aShort177 < 0) {
							local151 = local35;
							local153 = local35;
							local157 = local1;
							local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35 - 1][local26];
							local179 = this.aClass570_25.aClass100Array3[local1].method2917(local35, local26, -2066910182);
							while (local151 > 0 && local169 != null && local169.aShort177 < 0 && local169.aShort177 == local52.aShort177 && local169.aShort180 == local52.aShort180 && local179 == this.aClass570_25.aClass100Array3[local1].method2917(local151 - 1, local26, -1957224795) && (local151 - 1 <= 0 || local179 == this.aClass570_25.aClass100Array3[local1].method2917(local151 - 2, local26, -2118434759)) && local153 - local151 <= 10) {
								local151--;
								local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local151 - 1][local26];
							}
							for (local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local153 + 1][local26]; local153 < this.aClass570_25.anInt5245 * 1487025827 && local169 != null && local169.aShort177 < 0 && local169.aShort177 == local52.aShort177 && local169.aShort180 == local52.aShort180 && local179 == this.aClass570_25.aClass100Array3[local1].method2917(local153 + 1, local26, -941186989) && (local153 + 1 >= this.aClass570_25.anInt5245 * 1487025827 || local179 == this.aClass570_25.aClass100Array3[local1].method2917(local153 + 2, local26, -1651377769)) && local153 - local151 <= 10; local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local153 + 1][local26]) {
								local153++;
							}
							local343 = local1 - local1 + 1;
							local359 = this.aClass570_25.aClass100Array3[local146 ? local1 + 1 : local1].method2917(local151, local26, -544110806);
							local366 = local359 + local52.aShort177 * local343;
							local384 = this.aClass570_25.aClass100Array3[local146 ? local1 + 1 : local1].method2917(local153 + 1, local26, -1121138595);
							local391 = local384 + local52.aShort177 * local343;
							local399 = local151 << this.aClass570_25.anInt5258 * 1479624119;
							local407 = (local153 << this.aClass570_25.anInt5258 * 1479624119) + this.aClass570_25.anInt5238 * 1533693671;
							local421 = local26 << this.aClass570_25.anInt5258 * 1479624119;
							this.aClass593Array4[this.anInt5376++] = new Class593(this.aClass570_25, 2, local1, local399, local407, local407, local399, local359, local384, local391, local366, local421 + local52.aShort180, local421 + local52.aShort180, local421 + local52.aShort180, local421 + local52.aShort180);
							for (local464 = local1; local464 <= local157; local464++) {
								for (local469 = local151; local469 <= local153; local469++) {
									this.aClass570_25.aClass568ArrayArrayArray1[local464][local469][local26].aShort177 = (short) (this.aClass570_25.aClass568ArrayArrayArray1[local464][local469][local26].aShort177 * -1);
								}
							}
						}
					}
				}
			}
		}
		this.aBoolean929 = true;
	}

	@OriginalMember(owner = "client!us", name = "w", descriptor = "(IIIIII)Z")
	boolean method32069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg0 + arg3;
		@Pc(7) int local7 = arg1 + arg4;
		@Pc(11) int local11 = arg2 + arg5;
		if (!this.method32070(arg0, local7, arg2, local3, local7, local11, arg0, local7, local11)) {
			return false;
		} else if (this.method32070(arg0, local7, arg2, local3, local7, arg2, local3, local7, local11)) {
			if (arg0 < this.aClass570_25.anInt5254 * 1851678799) {
				if (!this.method32070(arg0, arg1, local11, arg0, local7, arg2, arg0, local7, local11)) {
					return false;
				}
				if (!this.method32070(arg0, arg1, local11, arg0, arg1, arg2, arg0, local7, arg2)) {
					return false;
				}
			} else if (!this.method32070(local3, arg1, local11, local3, local7, arg2, local3, local7, local11)) {
				return false;
			} else if (!this.method32070(local3, arg1, local11, local3, arg1, arg2, local3, local7, arg2)) {
				return false;
			}
			if (arg2 < this.aClass570_25.anInt5255 * 749878523) {
				if (!this.method32070(arg0, arg1, arg2, local3, local7, arg2, arg0, local7, arg2)) {
					return false;
				}
				if (!this.method32070(arg0, arg1, arg2, local3, arg1, arg2, local3, local7, arg2)) {
					return false;
				}
			} else if (!this.method32070(arg0, arg1, local11, local3, local7, local11, arg0, local7, local11)) {
				return false;
			} else if (!this.method32070(arg0, arg1, local11, local3, arg1, local11, local3, local7, local11)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!us", name = "r", descriptor = "(IIIIIIIII)Z")
	boolean method32070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (!this.method32063(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(13) int local13 = (int) this.aFloatArray118[0];
		@Pc(19) int local19 = (int) this.aFloatArray118[1];
		@Pc(25) int local25 = (int) this.aFloatArray118[2];
		if (!this.method32063(arg3, arg4, arg5)) {
			return false;
		}
		@Pc(39) int local39 = (int) this.aFloatArray118[0];
		@Pc(45) int local45 = (int) this.aFloatArray118[1];
		@Pc(51) int local51 = (int) this.aFloatArray118[2];
		if (this.method32063(arg6, arg7, arg8)) {
			@Pc(65) int local65 = (int) this.aFloatArray118[0];
			@Pc(71) int local71 = (int) this.aFloatArray118[1];
			@Pc(77) int local77 = (int) this.aFloatArray118[2];
			return this.aClass572_1.method31737(local19, local45, local71, local13, local39, local65, local25, local51, local77);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!us", name = "ao", descriptor = "(Lclient!uh;I)Z")
	boolean method32071(@OriginalArg(0) Class593 arg0, @OriginalArg(1) int arg1) {
		if (this.method32063(arg0.anIntArray482[arg1], arg0.anIntArray481[arg1], arg0.anIntArray483[arg1])) {
			arg0.aShortArray140[arg1] = (short) this.aFloatArray118[0];
			arg0.aShortArray139[arg1] = (short) this.aFloatArray118[1];
			arg0.aShortArray141[arg1] = (short) this.aFloatArray118[2];
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!us", name = "h", descriptor = "(IIII)V")
	public void method32072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(80) Class568 local80 = this.aClass570_25.aClass568ArrayArrayArray1[arg1][arg2][arg3];
			if (local80 != null) {
				if (arg0 == 1) {
					local80.aShort179 = 0;
				} else if (arg0 == 2) {
					local80.aShort177 = 0;
				}
			}
			this.method32058();
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInt5375; local7++) {
			@Pc(16) Class593 local16 = this.aClass593Array2[local7];
			if (local16.aByte155 == arg0 && local16.aByte156 == arg1 && (local16.aShort182 == arg2 && local16.aShort184 == arg3 || local16.aShort183 == arg2 && local16.aShort185 == arg3)) {
				if (local7 != this.anInt5375) {
					System.arraycopy(this.aClass593Array2, local7 + 1, this.aClass593Array2, local7, this.aClass593Array2.length - (local7 + 1));
				}
				this.anInt5375--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!us", name = "d", descriptor = "()V")
	public void method32073() {
		this.method32058();
	}

	@OriginalMember(owner = "client!us", name = "ah", descriptor = "(IIII)Z")
	boolean method32074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean928 || !this.aBoolean927) {
			return false;
		} else if (this.aClass572_1.anInt5279 < 102) {
			return false;
		} else if (this.method32064(arg0, arg1, arg2)) {
			@Pc(30) int local30 = arg1 << this.aClass570_25.anInt5258 * 1479624119;
			@Pc(38) int local38 = arg2 << this.aClass570_25.anInt5258 * 1479624119;
			return this.method32069(local30, this.aClass570_25.aClass100Array1[arg0].method2917(arg1, arg2, -1218838939), local38, this.aClass570_25.anInt5238 * 1533693671, arg3, this.aClass570_25.anInt5238 * 1533693671);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!us", name = "s", descriptor = "(IIII)Z")
	boolean method32075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean928 || !this.aBoolean927) {
			return false;
		} else if (this.aClass572_1.anInt5279 < 102) {
			return false;
		} else if (this.method32064(arg0, arg1, arg2)) {
			@Pc(30) int local30 = arg1 << this.aClass570_25.anInt5258 * 1479624119;
			@Pc(38) int local38 = arg2 << this.aClass570_25.anInt5258 * 1479624119;
			return this.method32069(local30, this.aClass570_25.aClass100Array1[arg0].method2917(arg1, arg2, -393695597), local38, this.aClass570_25.anInt5238 * 1533693671, arg3, this.aClass570_25.anInt5238 * 1533693671);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!us", name = "at", descriptor = "(IIIIII)Z")
	boolean method32076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg0 + arg3;
		@Pc(7) int local7 = arg1 + arg4;
		@Pc(11) int local11 = arg2 + arg5;
		if (!this.method32070(arg0, local7, arg2, local3, local7, local11, arg0, local7, local11)) {
			return false;
		} else if (this.method32070(arg0, local7, arg2, local3, local7, arg2, local3, local7, local11)) {
			if (arg0 < this.aClass570_25.anInt5254 * 1851678799) {
				if (!this.method32070(arg0, arg1, local11, arg0, local7, arg2, arg0, local7, local11)) {
					return false;
				}
				if (!this.method32070(arg0, arg1, local11, arg0, arg1, arg2, arg0, local7, arg2)) {
					return false;
				}
			} else if (!this.method32070(local3, arg1, local11, local3, local7, arg2, local3, local7, local11)) {
				return false;
			} else if (!this.method32070(local3, arg1, local11, local3, arg1, arg2, local3, local7, arg2)) {
				return false;
			}
			if (arg2 < this.aClass570_25.anInt5255 * 749878523) {
				if (!this.method32070(arg0, arg1, arg2, local3, local7, arg2, arg0, local7, arg2)) {
					return false;
				}
				if (!this.method32070(arg0, arg1, arg2, local3, arg1, arg2, local3, local7, arg2)) {
					return false;
				}
			} else if (!this.method32070(arg0, arg1, local11, local3, local7, local11, arg0, local7, local11)) {
				return false;
			} else if (!this.method32070(arg0, arg1, local11, local3, arg1, local11, local3, local7, local11)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!us", name = "y", descriptor = "(IIIIIIII)V")
	public void method32077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass593Array1[this.anInt5373++] = new Class593(this.aClass570_25, arg0, arg1, arg2, arg3, arg3, arg2, arg6, arg7, arg7, arg6, arg4, arg4, arg5, arg5);
	}

	@OriginalMember(owner = "client!us", name = "ak", descriptor = "(Lclient!uc;)Z")
	boolean method32078(@OriginalArg(0) Class589 arg0) {
		return arg0 == null ? false : this.method32069(arg0.anInt5309, arg0.anInt5312, arg0.anInt5313, arg0.anInt5308 - arg0.anInt5309, arg0.anInt5314 - arg0.anInt5312, arg0.anInt5310 - arg0.anInt5313);
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(Lclient!di;I)V")
	void method32079(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		aClass102_13 = arg0;
		if (!this.aBoolean928 || !this.aBoolean927) {
			this.anInt5374 = 0;
			return;
		}
		if (this.aBoolean930) {
			this.aClass570_25.aClass59_1.method1175((byte) 80);
		}
		aClass102_13.method20723(this.anIntArray492);
		if (this.anInt5377 != (int) ((float) this.anIntArray492[0] / 3.0F) || this.anInt5369 != (int) ((float) this.anIntArray492[1] / 3.0F)) {
			this.anInt5377 = (int) ((float) this.anIntArray492[0] / 3.0F);
			this.anInt5369 = (int) ((float) this.anIntArray492[1] / 3.0F);
			this.anIntArray487 = new int[this.anInt5377 * this.anInt5369];
		}
		this.anInt5374 = 0;
		@Pc(79) int local79;
		for (local79 = 0; local79 < this.anInt5373; local79++) {
			this.method32060(aClass102_13, this.aClass593Array1[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt5376; local79++) {
			this.method32060(aClass102_13, this.aClass593Array4[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt5375; local79++) {
			this.method32060(aClass102_13, this.aClass593Array2[local79], arg1);
		}
		this.aClass572_1.anInt5279 = 0;
		if (this.anInt5374 > 0) {
			local79 = this.anIntArray487.length;
			@Pc(142) int local142 = local79 - local79 & 0x7;
			@Pc(144) int local144 = 0;
			while (local144 < local142) {
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
			}
			while (local144 < local79) {
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
			}
			this.aClass572_1.anInt5280 = 1;
			for (@Pc(212) int local212 = 0; local212 < this.anInt5374; local212++) {
				@Pc(221) Class593 local221 = this.aClass593Array3[local212];
				this.aClass572_1.method31737(local221.aShortArray139[0], local221.aShortArray139[1], local221.aShortArray139[3], local221.aShortArray140[0], local221.aShortArray140[1], local221.aShortArray140[3], local221.aShortArray141[0], local221.aShortArray141[1], local221.aShortArray141[3]);
				this.aClass572_1.method31737(local221.aShortArray139[1], local221.aShortArray139[2], local221.aShortArray139[3], local221.aShortArray140[1], local221.aShortArray140[2], local221.aShortArray140[3], local221.aShortArray141[1], local221.aShortArray141[2], local221.aShortArray141[3]);
			}
			this.aClass572_1.anInt5280 = 2;
		}
		if (this.aBoolean930) {
			this.aClass570_25.aClass59_1.method1175((byte) 89);
		}
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(Lclient!di;Lclient!uh;I)V")
	void method32080(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class593 arg1, @OriginalArg(2) int arg2) {
		aClass102_13 = arg0;
		@Pc(10) int local10;
		if (this.anIntArray491 != null && arg1.aByte156 >= arg2) {
			for (local10 = 0; local10 < this.anIntArray491.length; local10++) {
				if (this.anIntArray491[local10] != -1000000 && (arg1.anIntArray481[0] <= this.anIntArray491[local10] || arg1.anIntArray481[1] <= this.anIntArray491[local10] || arg1.anIntArray481[2] <= this.anIntArray491[local10] || arg1.anIntArray481[3] <= this.anIntArray491[local10]) && (arg1.anIntArray482[0] <= this.anIntArray488[local10] || arg1.anIntArray482[1] <= this.anIntArray488[local10] || arg1.anIntArray482[2] <= this.anIntArray488[local10] || arg1.anIntArray482[3] <= this.anIntArray488[local10]) && (arg1.anIntArray482[0] >= this.anIntArray489[local10] || arg1.anIntArray482[1] >= this.anIntArray489[local10] || arg1.anIntArray482[2] >= this.anIntArray489[local10] || arg1.anIntArray482[3] >= this.anIntArray489[local10]) && (arg1.anIntArray483[0] <= this.anIntArray486[local10] || arg1.anIntArray483[1] <= this.anIntArray486[local10] || arg1.anIntArray483[2] <= this.anIntArray486[local10] || arg1.anIntArray483[3] <= this.anIntArray486[local10]) && (arg1.anIntArray483[0] >= this.anIntArray490[local10] || arg1.anIntArray483[1] >= this.anIntArray490[local10] || arg1.anIntArray483[2] >= this.anIntArray490[local10] || arg1.anIntArray483[3] >= this.anIntArray490[local10])) {
					return;
				}
			}
		}
		@Pc(259) int local259;
		@Pc(293) int local293;
		@Pc(324) boolean local324;
		@Pc(354) float local354;
		if (arg1.aByte155 == 1) {
			local10 = arg1.aShort182 - this.aClass570_25.anInt5241 * 1611671173 + this.aClass570_25.anInt5244 * 1989483179;
			if (local10 >= 0 && local10 <= this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
				local259 = arg1.aShort184 - this.aClass570_25.anInt5253 * 1105662773 + this.aClass570_25.anInt5244 * 1989483179;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
					return;
				}
				local293 = arg1.aShort185 - this.aClass570_25.anInt5253 * 1105662773 + this.aClass570_25.anInt5244 * 1989483179;
				if (local293 > this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
					local293 = this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179;
				} else if (local293 < 0) {
					return;
				}
				local324 = false;
				while (local259 <= local293) {
					if (this.aClass570_25.aBooleanArrayArray20[local10][local259++]) {
						local324 = true;
						break;
					}
				}
				if (local324) {
					local354 = this.aClass570_25.anInt5254 * 1851678799 - arg1.anIntArray482[0];
					if (local354 < 0.0F) {
						local354 *= -1.0F;
					}
					if (!(local354 < (float) this.anInt5378) && (this.method32062(arg1, 0) && (this.method32062(arg1, 1) && (this.method32062(arg1, 2) && this.method32062(arg1, 3))))) {
						this.aClass593Array3[this.anInt5374++] = arg1;
					}
				}
			}
		} else if (arg1.aByte155 == 2) {
			local10 = arg1.aShort184 - this.aClass570_25.anInt5253 * 1105662773 + this.aClass570_25.anInt5244 * 1989483179;
			if (local10 >= 0 && local10 <= this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
				local259 = arg1.aShort182 - this.aClass570_25.anInt5241 * 1611671173 + this.aClass570_25.anInt5244 * 1989483179;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
					return;
				}
				local293 = arg1.aShort183 - this.aClass570_25.anInt5241 * 1611671173 + this.aClass570_25.anInt5244 * 1989483179;
				if (local293 > this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
					local293 = this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179;
				} else if (local293 < 0) {
					return;
				}
				local324 = false;
				while (local259 <= local293) {
					if (this.aClass570_25.aBooleanArrayArray20[local259++][local10]) {
						local324 = true;
						break;
					}
				}
				if (local324) {
					local354 = this.aClass570_25.anInt5255 * 749878523 - arg1.anIntArray483[0];
					if (local354 < 0.0F) {
						local354 *= -1.0F;
					}
					if (!(local354 < (float) this.anInt5378) && (this.method32062(arg1, 0) && (this.method32062(arg1, 1) && (this.method32062(arg1, 2) && this.method32062(arg1, 3))))) {
						this.aClass593Array3[this.anInt5374++] = arg1;
					}
				}
			}
		} else if (arg1.aByte155 == 16 || arg1.aByte155 == 8) {
			local10 = arg1.aShort182 - this.aClass570_25.anInt5241 * 1611671173 + this.aClass570_25.anInt5244 * 1989483179;
			if (local10 >= 0 && local10 <= this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
				local259 = arg1.aShort184 - this.aClass570_25.anInt5253 * 1105662773 + this.aClass570_25.anInt5244 * 1989483179;
				if (local259 >= 0 && local259 <= this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179 && this.aClass570_25.aBooleanArrayArray20[local10][local259]) {
					@Pc(692) float local692 = (float) (this.aClass570_25.anInt5254 * 1851678799 - arg1.anIntArray482[0]);
					if (local692 < 0.0F) {
						local692 *= -1.0F;
					}
					@Pc(712) float local712 = (float) (this.aClass570_25.anInt5255 * 749878523 - arg1.anIntArray483[0]);
					if (local712 < 0.0F) {
						local712 *= -1.0F;
					}
					if ((!(local692 < (float) this.anInt5378) || !(local712 < (float) this.anInt5378)) && (this.method32062(arg1, 0) && (this.method32062(arg1, 1) && (this.method32062(arg1, 2) && this.method32062(arg1, 3))))) {
						this.aClass593Array3[this.anInt5374++] = arg1;
					}
				}
			}
		} else if (arg1.aByte155 == 4) {
			@Pc(785) float local785 = (float) (arg1.anIntArray481[0] - this.aClass570_25.anInt5256 * 114370215);
			if (!(local785 <= (float) this.anInt5372)) {
				local259 = arg1.aShort184 - this.aClass570_25.anInt5253 * 1105662773 + this.aClass570_25.anInt5244 * 1989483179;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
					return;
				}
				local293 = arg1.aShort185 - this.aClass570_25.anInt5253 * 1105662773 + this.aClass570_25.anInt5244 * 1989483179;
				if (local293 > this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
					local293 = this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179;
				} else if (local293 < 0) {
					return;
				}
				@Pc(885) int local885 = arg1.aShort182 - this.aClass570_25.anInt5241 * 1611671173 + this.aClass570_25.anInt5244 * 1989483179;
				if (local885 < 0) {
					local885 = 0;
				} else if (local885 > this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
					return;
				}
				@Pc(919) int local919 = arg1.aShort183 - this.aClass570_25.anInt5241 * 1611671173 + this.aClass570_25.anInt5244 * 1989483179;
				if (local919 > this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
					local919 = this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179;
				} else if (local919 < 0) {
					return;
				}
				@Pc(950) boolean local950 = false;
				label286: for (@Pc(952) int local952 = local885; local952 <= local919; local952++) {
					for (@Pc(957) int local957 = local259; local957 <= local293; local957++) {
						if (this.aClass570_25.aBooleanArrayArray20[local952][local957]) {
							local950 = true;
							break label286;
						}
					}
				}
				if (local950 && (this.method32062(arg1, 0) && (this.method32062(arg1, 1) && (this.method32062(arg1, 2) && this.method32062(arg1, 3))))) {
					this.aClass593Array3[this.anInt5374++] = arg1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!us", name = "ax", descriptor = "(Lclient!di;Lclient!uh;I)V")
	void method32081(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class593 arg1, @OriginalArg(2) int arg2) {
		aClass102_13 = arg0;
		@Pc(10) int local10;
		if (this.anIntArray491 != null && arg1.aByte156 >= arg2) {
			for (local10 = 0; local10 < this.anIntArray491.length; local10++) {
				if (this.anIntArray491[local10] != -1000000 && (arg1.anIntArray481[0] <= this.anIntArray491[local10] || arg1.anIntArray481[1] <= this.anIntArray491[local10] || arg1.anIntArray481[2] <= this.anIntArray491[local10] || arg1.anIntArray481[3] <= this.anIntArray491[local10]) && (arg1.anIntArray482[0] <= this.anIntArray488[local10] || arg1.anIntArray482[1] <= this.anIntArray488[local10] || arg1.anIntArray482[2] <= this.anIntArray488[local10] || arg1.anIntArray482[3] <= this.anIntArray488[local10]) && (arg1.anIntArray482[0] >= this.anIntArray489[local10] || arg1.anIntArray482[1] >= this.anIntArray489[local10] || arg1.anIntArray482[2] >= this.anIntArray489[local10] || arg1.anIntArray482[3] >= this.anIntArray489[local10]) && (arg1.anIntArray483[0] <= this.anIntArray486[local10] || arg1.anIntArray483[1] <= this.anIntArray486[local10] || arg1.anIntArray483[2] <= this.anIntArray486[local10] || arg1.anIntArray483[3] <= this.anIntArray486[local10]) && (arg1.anIntArray483[0] >= this.anIntArray490[local10] || arg1.anIntArray483[1] >= this.anIntArray490[local10] || arg1.anIntArray483[2] >= this.anIntArray490[local10] || arg1.anIntArray483[3] >= this.anIntArray490[local10])) {
					return;
				}
			}
		}
		@Pc(259) int local259;
		@Pc(293) int local293;
		@Pc(324) boolean local324;
		@Pc(354) float local354;
		if (arg1.aByte155 == 1) {
			local10 = arg1.aShort182 - this.aClass570_25.anInt5241 * 1611671173 + this.aClass570_25.anInt5244 * 1989483179;
			if (local10 >= 0 && local10 <= this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
				local259 = arg1.aShort184 - this.aClass570_25.anInt5253 * 1105662773 + this.aClass570_25.anInt5244 * 1989483179;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
					return;
				}
				local293 = arg1.aShort185 - this.aClass570_25.anInt5253 * 1105662773 + this.aClass570_25.anInt5244 * 1989483179;
				if (local293 > this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
					local293 = this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179;
				} else if (local293 < 0) {
					return;
				}
				local324 = false;
				while (local259 <= local293) {
					if (this.aClass570_25.aBooleanArrayArray20[local10][local259++]) {
						local324 = true;
						break;
					}
				}
				if (local324) {
					local354 = this.aClass570_25.anInt5254 * 1851678799 - arg1.anIntArray482[0];
					if (local354 < 0.0F) {
						local354 *= -1.0F;
					}
					if (!(local354 < (float) this.anInt5378) && (this.method32062(arg1, 0) && (this.method32062(arg1, 1) && (this.method32062(arg1, 2) && this.method32062(arg1, 3))))) {
						this.aClass593Array3[this.anInt5374++] = arg1;
					}
				}
			}
		} else if (arg1.aByte155 == 2) {
			local10 = arg1.aShort184 - this.aClass570_25.anInt5253 * 1105662773 + this.aClass570_25.anInt5244 * 1989483179;
			if (local10 >= 0 && local10 <= this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
				local259 = arg1.aShort182 - this.aClass570_25.anInt5241 * 1611671173 + this.aClass570_25.anInt5244 * 1989483179;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
					return;
				}
				local293 = arg1.aShort183 - this.aClass570_25.anInt5241 * 1611671173 + this.aClass570_25.anInt5244 * 1989483179;
				if (local293 > this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
					local293 = this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179;
				} else if (local293 < 0) {
					return;
				}
				local324 = false;
				while (local259 <= local293) {
					if (this.aClass570_25.aBooleanArrayArray20[local259++][local10]) {
						local324 = true;
						break;
					}
				}
				if (local324) {
					local354 = this.aClass570_25.anInt5255 * 749878523 - arg1.anIntArray483[0];
					if (local354 < 0.0F) {
						local354 *= -1.0F;
					}
					if (!(local354 < (float) this.anInt5378) && (this.method32062(arg1, 0) && (this.method32062(arg1, 1) && (this.method32062(arg1, 2) && this.method32062(arg1, 3))))) {
						this.aClass593Array3[this.anInt5374++] = arg1;
					}
				}
			}
		} else if (arg1.aByte155 == 16 || arg1.aByte155 == 8) {
			local10 = arg1.aShort182 - this.aClass570_25.anInt5241 * 1611671173 + this.aClass570_25.anInt5244 * 1989483179;
			if (local10 >= 0 && local10 <= this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
				local259 = arg1.aShort184 - this.aClass570_25.anInt5253 * 1105662773 + this.aClass570_25.anInt5244 * 1989483179;
				if (local259 >= 0 && local259 <= this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179 && this.aClass570_25.aBooleanArrayArray20[local10][local259]) {
					@Pc(692) float local692 = (float) (this.aClass570_25.anInt5254 * 1851678799 - arg1.anIntArray482[0]);
					if (local692 < 0.0F) {
						local692 *= -1.0F;
					}
					@Pc(712) float local712 = (float) (this.aClass570_25.anInt5255 * 749878523 - arg1.anIntArray483[0]);
					if (local712 < 0.0F) {
						local712 *= -1.0F;
					}
					if ((!(local692 < (float) this.anInt5378) || !(local712 < (float) this.anInt5378)) && (this.method32062(arg1, 0) && (this.method32062(arg1, 1) && (this.method32062(arg1, 2) && this.method32062(arg1, 3))))) {
						this.aClass593Array3[this.anInt5374++] = arg1;
					}
				}
			}
		} else if (arg1.aByte155 == 4) {
			@Pc(785) float local785 = (float) (arg1.anIntArray481[0] - this.aClass570_25.anInt5256 * 114370215);
			if (!(local785 <= (float) this.anInt5372)) {
				local259 = arg1.aShort184 - this.aClass570_25.anInt5253 * 1105662773 + this.aClass570_25.anInt5244 * 1989483179;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
					return;
				}
				local293 = arg1.aShort185 - this.aClass570_25.anInt5253 * 1105662773 + this.aClass570_25.anInt5244 * 1989483179;
				if (local293 > this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
					local293 = this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179;
				} else if (local293 < 0) {
					return;
				}
				@Pc(885) int local885 = arg1.aShort182 - this.aClass570_25.anInt5241 * 1611671173 + this.aClass570_25.anInt5244 * 1989483179;
				if (local885 < 0) {
					local885 = 0;
				} else if (local885 > this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
					return;
				}
				@Pc(919) int local919 = arg1.aShort183 - this.aClass570_25.anInt5241 * 1611671173 + this.aClass570_25.anInt5244 * 1989483179;
				if (local919 > this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179) {
					local919 = this.aClass570_25.anInt5244 * 1989483179 + this.aClass570_25.anInt5244 * 1989483179;
				} else if (local919 < 0) {
					return;
				}
				@Pc(950) boolean local950 = false;
				label286: for (@Pc(952) int local952 = local885; local952 <= local919; local952++) {
					for (@Pc(957) int local957 = local259; local957 <= local293; local957++) {
						if (this.aClass570_25.aBooleanArrayArray20[local952][local957]) {
							local950 = true;
							break label286;
						}
					}
				}
				if (local950 && (this.method32062(arg1, 0) && (this.method32062(arg1, 1) && (this.method32062(arg1, 2) && this.method32062(arg1, 3))))) {
					this.aClass593Array3[this.anInt5374++] = arg1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!us", name = "p", descriptor = "()V")
	void method32082() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt5376; local1++) {
			this.aClass593Array4[local1] = null;
		}
		this.anInt5376 = 0;
		@Pc(26) int local26;
		@Pc(35) int local35;
		@Pc(52) Class568 local52;
		for (local1 = 0; local1 < this.aClass570_25.anInt5242 * 1984662039; local1++) {
			for (local26 = 0; local26 < this.aClass570_25.anInt5245 * 1487025827; local26++) {
				for (local35 = 0; local35 < this.aClass570_25.anInt5246 * -1561777241; local35++) {
					local52 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35][local26];
					if (local52 != null) {
						if (local52.aShort179 > 0) {
							local52.aShort179 = (short) (local52.aShort179 * -1);
						}
						if (local52.aShort177 > 0) {
							local52.aShort177 = (short) (local52.aShort177 * -1);
						}
					}
				}
			}
		}
		for (local1 = 0; local1 < this.aClass570_25.anInt5242 * 1984662039; local1++) {
			for (local26 = 0; local26 < this.aClass570_25.anInt5245 * 1487025827; local26++) {
				for (local35 = 0; local35 < this.aClass570_25.anInt5246 * -1561777241; local35++) {
					local52 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35][local26];
					if (local52 != null) {
						@Pc(146) boolean local146 = this.aClass570_25.aClass568ArrayArrayArray1[0][local35][local26] != null && this.aClass570_25.aClass568ArrayArrayArray1[0][local35][local26].aClass568_1 != null;
						@Pc(151) int local151;
						@Pc(153) int local153;
						@Pc(157) int local157;
						@Pc(169) Class568 local169;
						@Pc(179) int local179;
						@Pc(343) int local343;
						@Pc(359) int local359;
						@Pc(366) int local366;
						@Pc(384) int local384;
						@Pc(391) int local391;
						@Pc(399) int local399;
						@Pc(407) int local407;
						@Pc(421) int local421;
						@Pc(464) int local464;
						@Pc(469) int local469;
						if (local52.aShort179 < 0) {
							local151 = local26;
							local153 = local26;
							local157 = local1;
							local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35][local26 - 1];
							local179 = this.aClass570_25.aClass100Array3[local1].method2917(local35, local26, -1273590620);
							while (local151 > 0 && local169 != null && local169.aShort179 < 0 && local169.aShort179 == local52.aShort179 && local169.aShort178 == local52.aShort178 && local179 == this.aClass570_25.aClass100Array3[local1].method2917(local35, local151 - 1, -247523898) && (local151 - 1 <= 0 || local179 == this.aClass570_25.aClass100Array3[local1].method2917(local35, local151 - 2, -640374851)) && local153 - local151 <= 10) {
								local151--;
								local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35][local151 - 1];
							}
							for (local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35][local153 + 1]; local153 < this.aClass570_25.anInt5246 * -1561777241 && local169 != null && local169.aShort179 < 0 && local169.aShort179 == local52.aShort179 && local169.aShort178 == local52.aShort178 && local179 == this.aClass570_25.aClass100Array3[local1].method2917(local35, local153 + 1, -482608113) && (local153 + 1 >= this.aClass570_25.anInt5246 * -1561777241 || local179 == this.aClass570_25.aClass100Array3[local1].method2917(local35, local153 + 2, -605820736)) && local153 - local151 <= 10; local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35][local153 + 1]) {
								local153++;
							}
							local343 = local1 - local1 + 1;
							local359 = this.aClass570_25.aClass100Array3[local146 ? local1 + 1 : local1].method2917(local35, local151, -759222486);
							local366 = local359 + local52.aShort179 * local343;
							local384 = this.aClass570_25.aClass100Array3[local146 ? local1 + 1 : local1].method2917(local35, local153 + 1, -2008473469);
							local391 = local384 + local52.aShort179 * local343;
							local399 = local35 << this.aClass570_25.anInt5258 * 1479624119;
							local407 = local151 << this.aClass570_25.anInt5258 * 1479624119;
							local421 = (local153 << this.aClass570_25.anInt5258 * 1479624119) + this.aClass570_25.anInt5238 * 1533693671;
							this.aClass593Array4[this.anInt5376++] = new Class593(this.aClass570_25, 1, local1, local399 + local52.aShort178, local399 + local52.aShort178, local399 + local52.aShort178, local399 + local52.aShort178, local359, local384, local391, local366, local407, local421, local421, local407);
							for (local464 = local1; local464 <= local157; local464++) {
								for (local469 = local151; local469 <= local153; local469++) {
									this.aClass570_25.aClass568ArrayArrayArray1[local464][local35][local469].aShort179 = (short) (this.aClass570_25.aClass568ArrayArrayArray1[local464][local35][local469].aShort179 * -1);
								}
							}
						}
						if (local52.aShort177 < 0) {
							local151 = local35;
							local153 = local35;
							local157 = local1;
							local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local35 - 1][local26];
							local179 = this.aClass570_25.aClass100Array3[local1].method2917(local35, local26, -1893741116);
							while (local151 > 0 && local169 != null && local169.aShort177 < 0 && local169.aShort177 == local52.aShort177 && local169.aShort180 == local52.aShort180 && local179 == this.aClass570_25.aClass100Array3[local1].method2917(local151 - 1, local26, -1177381593) && (local151 - 1 <= 0 || local179 == this.aClass570_25.aClass100Array3[local1].method2917(local151 - 2, local26, -1584850133)) && local153 - local151 <= 10) {
								local151--;
								local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local151 - 1][local26];
							}
							for (local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local153 + 1][local26]; local153 < this.aClass570_25.anInt5245 * 1487025827 && local169 != null && local169.aShort177 < 0 && local169.aShort177 == local52.aShort177 && local169.aShort180 == local52.aShort180 && local179 == this.aClass570_25.aClass100Array3[local1].method2917(local153 + 1, local26, -1699591059) && (local153 + 1 >= this.aClass570_25.anInt5245 * 1487025827 || local179 == this.aClass570_25.aClass100Array3[local1].method2917(local153 + 2, local26, -514381808)) && local153 - local151 <= 10; local169 = this.aClass570_25.aClass568ArrayArrayArray1[local1][local153 + 1][local26]) {
								local153++;
							}
							local343 = local1 - local1 + 1;
							local359 = this.aClass570_25.aClass100Array3[local146 ? local1 + 1 : local1].method2917(local151, local26, -1185688549);
							local366 = local359 + local52.aShort177 * local343;
							local384 = this.aClass570_25.aClass100Array3[local146 ? local1 + 1 : local1].method2917(local153 + 1, local26, -640585752);
							local391 = local384 + local52.aShort177 * local343;
							local399 = local151 << this.aClass570_25.anInt5258 * 1479624119;
							local407 = (local153 << this.aClass570_25.anInt5258 * 1479624119) + this.aClass570_25.anInt5238 * 1533693671;
							local421 = local26 << this.aClass570_25.anInt5258 * 1479624119;
							this.aClass593Array4[this.anInt5376++] = new Class593(this.aClass570_25, 2, local1, local399, local407, local407, local399, local359, local384, local391, local366, local421 + local52.aShort180, local421 + local52.aShort180, local421 + local52.aShort180, local421 + local52.aShort180);
							for (local464 = local1; local464 <= local157; local464++) {
								for (local469 = local151; local469 <= local153; local469++) {
									this.aClass570_25.aClass568ArrayArrayArray1[local464][local469][local26].aShort177 = (short) (this.aClass570_25.aClass568ArrayArrayArray1[local464][local469][local26].aShort177 * -1);
								}
							}
						}
					}
				}
			}
		}
		this.aBoolean929 = true;
	}

	@OriginalMember(owner = "client!us", name = "ai", descriptor = "(Lclient!uh;I)Z")
	boolean method32083(@OriginalArg(0) Class593 arg0, @OriginalArg(1) int arg1) {
		if (this.method32063(arg0.anIntArray482[arg1], arg0.anIntArray481[arg1], arg0.anIntArray483[arg1])) {
			arg0.aShortArray140[arg1] = (short) this.aFloatArray118[0];
			arg0.aShortArray139[arg1] = (short) this.aFloatArray118[1];
			arg0.aShortArray141[arg1] = (short) this.aFloatArray118[2];
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!us", name = "aq", descriptor = "(Lclient!uh;I)Z")
	boolean method32084(@OriginalArg(0) Class593 arg0, @OriginalArg(1) int arg1) {
		if (this.method32063(arg0.anIntArray482[arg1], arg0.anIntArray481[arg1], arg0.anIntArray483[arg1])) {
			arg0.aShortArray140[arg1] = (short) this.aFloatArray118[0];
			arg0.aShortArray139[arg1] = (short) this.aFloatArray118[1];
			arg0.aShortArray141[arg1] = (short) this.aFloatArray118[2];
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!us", name = "aj", descriptor = "(III)Z")
	boolean method32085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		aClass102_13.method21114((float) arg0, (float) arg1, (float) arg2, this.aFloatArray118);
		if (this.aFloatArray118[2] < 50.0F) {
			return false;
		} else {
			this.aFloatArray118[0] /= 3.0F;
			this.aFloatArray118[1] /= 3.0F;
			return true;
		}
	}

	@OriginalMember(owner = "client!us", name = "ay", descriptor = "(Lclient!uh;I)Z")
	boolean method32086(@OriginalArg(0) Class593 arg0, @OriginalArg(1) int arg1) {
		if (this.method32063(arg0.anIntArray482[arg1], arg0.anIntArray481[arg1], arg0.anIntArray483[arg1])) {
			arg0.aShortArray140[arg1] = (short) this.aFloatArray118[0];
			arg0.aShortArray139[arg1] = (short) this.aFloatArray118[1];
			arg0.aShortArray141[arg1] = (short) this.aFloatArray118[2];
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!us", name = "ac", descriptor = "(III)Z")
	boolean method32087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		aClass102_13.method21114((float) arg0, (float) arg1, (float) arg2, this.aFloatArray118);
		if (this.aFloatArray118[2] < 50.0F) {
			return false;
		} else {
			this.aFloatArray118[0] /= 3.0F;
			this.aFloatArray118[1] /= 3.0F;
			return true;
		}
	}

	@OriginalMember(owner = "client!us", name = "ag", descriptor = "(III)Z")
	boolean method32088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean928 || !this.aBoolean927) {
			return false;
		} else if (this.aClass572_1.anInt5279 < 102) {
			return false;
		} else {
			@Pc(23) int local23 = this.anIntArrayArrayArray17[arg0][arg1][arg2];
			if (local23 == -(this.aClass570_25.anInt5257 * -2082741639)) {
				return false;
			} else if (local23 == this.aClass570_25.anInt5257 * -2082741639) {
				return true;
			} else if (this.aClass570_25.aClass100Array1 == this.aClass570_25.aClass100Array2) {
				return false;
			} else {
				@Pc(59) int local59 = arg1 << this.aClass570_25.anInt5258 * 1479624119;
				@Pc(67) int local67 = arg2 << this.aClass570_25.anInt5258 * 1479624119;
				if (this.method32070(local59 + 1, this.aClass570_25.aClass100Array1[arg0].method2917(arg1, arg2, -370337564), local67 + 1, local59 + this.aClass570_25.anInt5238 * 1533693671 - 1, this.aClass570_25.aClass100Array1[arg0].method2917(arg1 + 1, arg2 + 1, -459974471), local67 + this.aClass570_25.anInt5238 * 1533693671 - 1, local59 + 1, this.aClass570_25.aClass100Array1[arg0].method2917(arg1, arg2 + 1, -580155714), local67 + this.aClass570_25.anInt5238 * 1533693671 - 1) && this.method32070(local59 + 1, this.aClass570_25.aClass100Array1[arg0].method2917(arg1, arg2, -241107267), local67 + 1, local59 + this.aClass570_25.anInt5238 * 1533693671 - 1, this.aClass570_25.aClass100Array1[arg0].method2917(arg1 + 1, arg2, -873853630), local67 + 1, local59 + this.aClass570_25.anInt5238 * 1533693671 - 1, this.aClass570_25.aClass100Array1[arg0].method2917(arg1 + 1, arg2 + 1, -1527624923), local67 + this.aClass570_25.anInt5238 * 1533693671 - 1)) {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = this.aClass570_25.anInt5257 * -2082741639;
					return true;
				} else {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = -(this.aClass570_25.anInt5257 * -2082741639);
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!us", name = "ab", descriptor = "(III)Z")
	boolean method32089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean928 || !this.aBoolean927) {
			return false;
		} else if (this.aClass572_1.anInt5279 < 102) {
			return false;
		} else {
			@Pc(23) int local23 = this.anIntArrayArrayArray17[arg0][arg1][arg2];
			if (local23 == -(this.aClass570_25.anInt5257 * -2082741639)) {
				return false;
			} else if (local23 == this.aClass570_25.anInt5257 * -2082741639) {
				return true;
			} else if (this.aClass570_25.aClass100Array1 == this.aClass570_25.aClass100Array2) {
				return false;
			} else {
				@Pc(59) int local59 = arg1 << this.aClass570_25.anInt5258 * 1479624119;
				@Pc(67) int local67 = arg2 << this.aClass570_25.anInt5258 * 1479624119;
				if (this.method32070(local59 + 1, this.aClass570_25.aClass100Array1[arg0].method2917(arg1, arg2, -537319856), local67 + 1, local59 + this.aClass570_25.anInt5238 * 1533693671 - 1, this.aClass570_25.aClass100Array1[arg0].method2917(arg1 + 1, arg2 + 1, -1056959391), local67 + this.aClass570_25.anInt5238 * 1533693671 - 1, local59 + 1, this.aClass570_25.aClass100Array1[arg0].method2917(arg1, arg2 + 1, -1713896116), local67 + this.aClass570_25.anInt5238 * 1533693671 - 1) && this.method32070(local59 + 1, this.aClass570_25.aClass100Array1[arg0].method2917(arg1, arg2, -891764547), local67 + 1, local59 + this.aClass570_25.anInt5238 * 1533693671 - 1, this.aClass570_25.aClass100Array1[arg0].method2917(arg1 + 1, arg2, -420944542), local67 + 1, local59 + this.aClass570_25.anInt5238 * 1533693671 - 1, this.aClass570_25.aClass100Array1[arg0].method2917(arg1 + 1, arg2 + 1, -752814952), local67 + this.aClass570_25.anInt5238 * 1533693671 - 1)) {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = this.aClass570_25.anInt5257 * -2082741639;
					return true;
				} else {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = -(this.aClass570_25.anInt5257 * -2082741639);
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!us", name = "al", descriptor = "(III)Z")
	boolean method32090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean928 || !this.aBoolean927) {
			return false;
		} else if (this.aClass572_1.anInt5279 < 102) {
			return false;
		} else {
			@Pc(23) int local23 = this.anIntArrayArrayArray17[arg0][arg1][arg2];
			if (local23 == -(this.aClass570_25.anInt5257 * -2082741639)) {
				return false;
			} else if (local23 == this.aClass570_25.anInt5257 * -2082741639) {
				return true;
			} else if (this.aClass570_25.aClass100Array1 == this.aClass570_25.aClass100Array2) {
				return false;
			} else {
				@Pc(59) int local59 = arg1 << this.aClass570_25.anInt5258 * 1479624119;
				@Pc(67) int local67 = arg2 << this.aClass570_25.anInt5258 * 1479624119;
				if (this.method32070(local59 + 1, this.aClass570_25.aClass100Array1[arg0].method2917(arg1, arg2, -875873788), local67 + 1, local59 + this.aClass570_25.anInt5238 * 1533693671 - 1, this.aClass570_25.aClass100Array1[arg0].method2917(arg1 + 1, arg2 + 1, -992936017), local67 + this.aClass570_25.anInt5238 * 1533693671 - 1, local59 + 1, this.aClass570_25.aClass100Array1[arg0].method2917(arg1, arg2 + 1, -1690128849), local67 + this.aClass570_25.anInt5238 * 1533693671 - 1) && this.method32070(local59 + 1, this.aClass570_25.aClass100Array1[arg0].method2917(arg1, arg2, -357852638), local67 + 1, local59 + this.aClass570_25.anInt5238 * 1533693671 - 1, this.aClass570_25.aClass100Array1[arg0].method2917(arg1 + 1, arg2, -1721335854), local67 + 1, local59 + this.aClass570_25.anInt5238 * 1533693671 - 1, this.aClass570_25.aClass100Array1[arg0].method2917(arg1 + 1, arg2 + 1, -923658411), local67 + this.aClass570_25.anInt5238 * 1533693671 - 1)) {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = this.aClass570_25.anInt5257 * -2082741639;
					return true;
				} else {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = -(this.aClass570_25.anInt5257 * -2082741639);
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!us", name = "l", descriptor = "(IIIIIIII)V")
	public void method32091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass593Array1[this.anInt5373++] = new Class593(this.aClass570_25, arg0, arg1, arg2, arg3, arg3, arg2, arg6, arg7, arg7, arg6, arg4, arg4, arg5, arg5);
	}

	@OriginalMember(owner = "client!us", name = "af", descriptor = "(IIIIILclient!uc;)Z")
	boolean method32092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class589 arg5) {
		if (!this.aBoolean928 || !this.aBoolean927) {
			return false;
		} else if (this.aClass572_1.anInt5279 < 102) {
			return false;
		} else if (arg1 < 0 || arg3 < 0 || arg2 >= this.anIntArrayArrayArray17[arg0].length || arg4 >= this.anIntArrayArrayArray17[arg0][arg1].length) {
			return false;
		} else if (arg1 != arg2 || arg3 != arg4) {
			for (@Pc(60) int local60 = arg1; local60 <= arg2; local60++) {
				for (@Pc(65) int local65 = arg3; local65 <= arg4; local65++) {
					if (this.anIntArrayArrayArray17[arg0][local60][local65] == -(this.aClass570_25.anInt5257 * -2082741639)) {
						return false;
					}
				}
			}
			if (this.method32054(arg5)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method32064(arg0, arg1, arg3)) {
			return this.method32054(arg5);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!asi;III)Z")
	boolean method32093(@OriginalArg(0) Class120_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean928 || !this.aBoolean927) {
			return false;
		} else if (this.aClass572_1.anInt5279 < 102) {
			return false;
		} else if (this.method32064(arg1, arg2, arg3)) {
			@Pc(30) int local30 = arg2 << this.aClass570_25.anInt5258 * 1479624119;
			@Pc(38) int local38 = arg3 << this.aClass570_25.anInt5258 * 1479624119;
			@Pc(50) int local50 = this.aClass570_25.aClass100Array1[arg1].method2917(arg2, arg3, -1694122525) - 1;
			@Pc(56) int local56 = local50 + arg0.method24578(2053774920);
			if (arg0.aShort50 == 1) {
				if (this.method32070(local30, local50, local38, local30, local56, local38, local30, local56, local38 + this.aClass570_25.anInt5238 * 1533693671)) {
					return this.method32070(local30, local50, local38, local30, local56, local38 + this.aClass570_25.anInt5238 * 1533693671, local30, local50, local38 + this.aClass570_25.anInt5238 * 1533693671);
				} else {
					return false;
				}
			} else if (arg0.aShort50 == 2) {
				if (this.method32070(local30, local50, local38 + this.aClass570_25.anInt5238 * 1533693671, local30 + this.aClass570_25.anInt5238 * 1533693671, local56, local38 + this.aClass570_25.anInt5238 * 1533693671, local30, local56, local38 + this.aClass570_25.anInt5238 * 1533693671)) {
					return this.method32070(local30, local50, local38 + this.aClass570_25.anInt5238 * 1533693671, local30 + this.aClass570_25.anInt5238 * 1533693671, local50, local38 + this.aClass570_25.anInt5238 * 1533693671, local30 + this.aClass570_25.anInt5238 * 1533693671, local56, local38 + this.aClass570_25.anInt5238 * 1533693671);
				} else {
					return false;
				}
			} else if (arg0.aShort50 == 4) {
				if (this.method32070(local30 + this.aClass570_25.anInt5238 * 1533693671, local50, local38, local30 + this.aClass570_25.anInt5238 * 1533693671, local56, local38, local30 + this.aClass570_25.anInt5238 * 1533693671, local56, local38 + this.aClass570_25.anInt5238 * 1533693671)) {
					return this.method32070(local30 + this.aClass570_25.anInt5238 * 1533693671, local50, local38, local30 + this.aClass570_25.anInt5238 * 1533693671, local56, local38 + this.aClass570_25.anInt5238 * 1533693671, local30 + this.aClass570_25.anInt5238 * 1533693671, local50, local38 + this.aClass570_25.anInt5238 * 1533693671);
				} else {
					return false;
				}
			} else if (arg0.aShort50 == 8) {
				if (this.method32070(local30, local50, local38, local30 + this.aClass570_25.anInt5238 * 1533693671, local56, local38, local30, local56, local38)) {
					return this.method32070(local30, local50, local38, local30 + this.aClass570_25.anInt5238 * 1533693671, local50, local38, local30 + this.aClass570_25.anInt5238 * 1533693671, local56, local38);
				} else {
					return false;
				}
			} else if (arg0.aShort50 == 16) {
				return this.method32069(local30, local50, local38 + this.aClass570_25.anInt5239 * 2105539397, this.aClass570_25.anInt5239 * 2105539397, local56, this.aClass570_25.anInt5239 * 2105539397);
			} else if (arg0.aShort50 == 32) {
				return this.method32069(local30 + this.aClass570_25.anInt5239 * 2105539397, local50, local38 + this.aClass570_25.anInt5239 * 2105539397, this.aClass570_25.anInt5239 * 2105539397, local56, this.aClass570_25.anInt5239 * 2105539397);
			} else if (arg0.aShort50 == 64) {
				return this.method32069(local30 + this.aClass570_25.anInt5239 * 2105539397, local50, local38, this.aClass570_25.anInt5239 * 2105539397, local56, this.aClass570_25.anInt5239 * 2105539397);
			} else if (arg0.aShort50 == 128) {
				return this.method32069(local30, local50, local38, this.aClass570_25.anInt5239 * 2105539397, local56, this.aClass570_25.anInt5239 * 2105539397);
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!us", name = "g", descriptor = "(Lclient!di;I)V")
	void method32094(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		aClass102_13 = arg0;
		if (!this.aBoolean928 || !this.aBoolean927) {
			this.anInt5374 = 0;
			return;
		}
		if (this.aBoolean930) {
			this.aClass570_25.aClass59_1.method1175((byte) 29);
		}
		aClass102_13.method20723(this.anIntArray492);
		if (this.anInt5377 != (int) ((float) this.anIntArray492[0] / 3.0F) || this.anInt5369 != (int) ((float) this.anIntArray492[1] / 3.0F)) {
			this.anInt5377 = (int) ((float) this.anIntArray492[0] / 3.0F);
			this.anInt5369 = (int) ((float) this.anIntArray492[1] / 3.0F);
			this.anIntArray487 = new int[this.anInt5377 * this.anInt5369];
		}
		this.anInt5374 = 0;
		@Pc(79) int local79;
		for (local79 = 0; local79 < this.anInt5373; local79++) {
			this.method32060(aClass102_13, this.aClass593Array1[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt5376; local79++) {
			this.method32060(aClass102_13, this.aClass593Array4[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt5375; local79++) {
			this.method32060(aClass102_13, this.aClass593Array2[local79], arg1);
		}
		this.aClass572_1.anInt5279 = 0;
		if (this.anInt5374 > 0) {
			local79 = this.anIntArray487.length;
			@Pc(142) int local142 = local79 - local79 & 0x7;
			@Pc(144) int local144 = 0;
			while (local144 < local142) {
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
			}
			while (local144 < local79) {
				this.anIntArray487[local144++] = Integer.MAX_VALUE;
			}
			this.aClass572_1.anInt5280 = 1;
			for (@Pc(212) int local212 = 0; local212 < this.anInt5374; local212++) {
				@Pc(221) Class593 local221 = this.aClass593Array3[local212];
				this.aClass572_1.method31737(local221.aShortArray139[0], local221.aShortArray139[1], local221.aShortArray139[3], local221.aShortArray140[0], local221.aShortArray140[1], local221.aShortArray140[3], local221.aShortArray141[0], local221.aShortArray141[1], local221.aShortArray141[3]);
				this.aClass572_1.method31737(local221.aShortArray139[1], local221.aShortArray139[2], local221.aShortArray139[3], local221.aShortArray140[1], local221.aShortArray140[2], local221.aShortArray140[3], local221.aShortArray141[1], local221.aShortArray141[2], local221.aShortArray141[3]);
			}
			this.aClass572_1.anInt5280 = 2;
		}
		if (this.aBoolean930) {
			this.aClass570_25.aClass59_1.method1175((byte) 27);
		}
	}

	@OriginalMember(owner = "client!us", name = "ad", descriptor = "(IIIIII)Z")
	boolean method32095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg0 + arg3;
		@Pc(7) int local7 = arg1 + arg4;
		@Pc(11) int local11 = arg2 + arg5;
		if (!this.method32070(arg0, local7, arg2, local3, local7, local11, arg0, local7, local11)) {
			return false;
		} else if (this.method32070(arg0, local7, arg2, local3, local7, arg2, local3, local7, local11)) {
			if (arg0 < this.aClass570_25.anInt5254 * 1851678799) {
				if (!this.method32070(arg0, arg1, local11, arg0, local7, arg2, arg0, local7, local11)) {
					return false;
				}
				if (!this.method32070(arg0, arg1, local11, arg0, arg1, arg2, arg0, local7, arg2)) {
					return false;
				}
			} else if (!this.method32070(local3, arg1, local11, local3, local7, arg2, local3, local7, local11)) {
				return false;
			} else if (!this.method32070(local3, arg1, local11, local3, arg1, arg2, local3, local7, arg2)) {
				return false;
			}
			if (arg2 < this.aClass570_25.anInt5255 * 749878523) {
				if (!this.method32070(arg0, arg1, arg2, local3, local7, arg2, arg0, local7, arg2)) {
					return false;
				}
				if (!this.method32070(arg0, arg1, arg2, local3, arg1, arg2, local3, local7, arg2)) {
					return false;
				}
			} else if (!this.method32070(arg0, arg1, local11, local3, local7, local11, arg0, local7, local11)) {
				return false;
			} else if (!this.method32070(arg0, arg1, local11, local3, arg1, local11, local3, local7, local11)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}
