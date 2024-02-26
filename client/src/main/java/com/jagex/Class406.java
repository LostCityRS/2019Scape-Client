package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class406 {

	@OriginalMember(owner = "client!lu", name = "o", descriptor = "[[Lclient!lr;")
	Class403[][] aClass403ArrayArray1;

	@OriginalMember(owner = "client!lu", name = "t", descriptor = "Lclient!afa;")
	final Class102_Sub1 aClass102_Sub1_39;

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "Lclient!aes;")
	final Class100_Sub2 aClass100_Sub2_3;

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "I")
	final int anInt4595;

	@OriginalMember(owner = "client!lu", name = "u", descriptor = "I")
	final int anInt4596;

	@OriginalMember(owner = "client!lu", name = "l", descriptor = "[B")
	final byte[] aByteArray91;

	@OriginalMember(owner = "client!lu", name = "m", descriptor = "I")
	final int anInt4597;

	@OriginalMember(owner = "client!lu", name = "g", descriptor = "I")
	final int anInt4594;

	@OriginalMember(owner = "client!lu", name = "i", descriptor = "I")
	final int anInt4598;

	@OriginalMember(owner = "client!lu", name = "i", descriptor = "([B[BIIIIII)V")
	static void method28923(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] += arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] += arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] += arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!lu", name = "o", descriptor = "([BIIIII)Z")
	static boolean method28924(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg2 % arg5;
		@Pc(9) int local9;
		if (local3 == 0) {
			local9 = 0;
		} else {
			local9 = arg5 - local3;
		}
		@Pc(21) int local21 = -((arg3 + arg5 - 1) / arg5);
		@Pc(30) int local30 = -((arg2 + arg5 - 1) / arg5);
		for (@Pc(32) int local32 = local21; local32 < 0; local32++) {
			for (@Pc(36) int local36 = local30; local36 < 0; local36++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += arg5;
			}
			arg1 -= local9;
			if (arg0[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg4;
		}
		return false;
	}

	@OriginalMember(owner = "client!lu", name = "v", descriptor = "([B[BIIIIII)V")
	static void method28932(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] += arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] += arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] += arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!lu", name = "n", descriptor = "([BIIIII)Z")
	static boolean method28933(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg2 % arg5;
		@Pc(9) int local9;
		if (local3 == 0) {
			local9 = 0;
		} else {
			local9 = arg5 - local3;
		}
		@Pc(21) int local21 = -((arg3 + arg5 - 1) / arg5);
		@Pc(30) int local30 = -((arg2 + arg5 - 1) / arg5);
		for (@Pc(32) int local32 = local21; local32 < 0; local32++) {
			for (@Pc(36) int local36 = local30; local36 < 0; local36++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += arg5;
			}
			arg1 -= local9;
			if (arg0[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg4;
		}
		return false;
	}

	@OriginalMember(owner = "client!lu", name = "m", descriptor = "([B[BIIIIII)V")
	static void method28934(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] -= arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] -= arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] -= arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!lu", name = "z", descriptor = "([B[BIIIIII)V")
	static void method28935(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] += arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] += arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] += arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!lu", name = "p", descriptor = "([B[BIIIIII)V")
	static void method28936(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] += arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] += arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] += arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!lu", name = "y", descriptor = "([BIIIII)Z")
	static boolean method28938(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg2 % arg5;
		@Pc(9) int local9;
		if (local3 == 0) {
			local9 = 0;
		} else {
			local9 = arg5 - local3;
		}
		@Pc(21) int local21 = -((arg3 + arg5 - 1) / arg5);
		@Pc(30) int local30 = -((arg2 + arg5 - 1) / arg5);
		for (@Pc(32) int local32 = local21; local32 < 0; local32++) {
			for (@Pc(36) int local36 = local30; local36 < 0; local36++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += arg5;
			}
			arg1 -= local9;
			if (arg0[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg4;
		}
		return false;
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "([BIIIII)Z")
	static boolean method28940(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg2 % arg5;
		@Pc(9) int local9;
		if (local3 == 0) {
			local9 = 0;
		} else {
			local9 = arg5 - local3;
		}
		@Pc(21) int local21 = -((arg3 + arg5 - 1) / arg5);
		@Pc(30) int local30 = -((arg2 + arg5 - 1) / arg5);
		for (@Pc(32) int local32 = local21; local32 < 0; local32++) {
			for (@Pc(36) int local36 = local30; local36 < 0; local36++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += arg5;
			}
			arg1 -= local9;
			if (arg0[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg4;
		}
		return false;
	}

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lclient!afa;Lclient!aes;)V")
	Class406(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) Class100_Sub2 arg1) {
		this.aClass102_Sub1_39 = arg0;
		this.aClass100_Sub2_3 = arg1;
		this.anInt4595 = (this.aClass100_Sub2_3.anInt448 * -1548585779 * this.aClass100_Sub2_3.anInt447 * -1174710433 >> this.aClass102_Sub1_39.anInt2980) + 2;
		this.anInt4596 = (this.aClass100_Sub2_3.anInt446 * -1356799781 * this.aClass100_Sub2_3.anInt447 * -1174710433 >> this.aClass102_Sub1_39.anInt2980) + 2;
		this.aByteArray91 = new byte[this.anInt4595 * this.anInt4596];
		this.anInt4597 = this.aClass102_Sub1_39.anInt2980 + 7 - this.aClass100_Sub2_3.anInt445 * -615169581;
		this.anInt4594 = this.aClass100_Sub2_3.anInt448 * -1548585779 >> this.anInt4597;
		this.anInt4598 = this.aClass100_Sub2_3.anInt446 * -1356799781 >> this.anInt4597;
	}

	@OriginalMember(owner = "client!lu", name = "l", descriptor = "(Lclient!arx;II)Z")
	boolean method28916(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class80_Sub1_Sub10_Sub2 local2 = (Class80_Sub1_Sub10_Sub2) arg0;
		arg1 += local2.anInt3262 + 1;
		arg2 += local2.anInt3263 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4595;
		@Pc(26) int local26 = local2.anInt3260;
		@Pc(29) int local29 = local2.anInt3261;
		@Pc(34) int local34 = this.anInt4595 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt4595;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt4596) {
			local40 = arg2 + local26 + 1 - this.anInt4596;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt4595) {
			local40 = arg1 + local29 + 1 - this.anInt4595;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt4595;
			return method28924(this.aByteArray91, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lu", name = "q", descriptor = "(Lclient!arx;II)Z")
	boolean method28917(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class80_Sub1_Sub10_Sub2 local2 = (Class80_Sub1_Sub10_Sub2) arg0;
		arg1 += local2.anInt3262 + 1;
		arg2 += local2.anInt3263 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4595;
		@Pc(26) int local26 = local2.anInt3260;
		@Pc(29) int local29 = local2.anInt3261;
		@Pc(34) int local34 = this.anInt4595 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt4595;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt4596) {
			local40 = arg2 + local26 + 1 - this.anInt4596;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt4595) {
			local40 = arg1 + local29 + 1 - this.anInt4595;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt4595;
			return method28924(this.aByteArray91, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "(Lclient!je;III[[ZZ)V")
	void method28918(@OriginalArg(0) Class119 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[][] arg4, @OriginalArg(5) boolean arg5) {
		this.aClass102_Sub1_39.method20762(false);
		@Pc(12) float local12 = 1.0F / (float) (this.aClass102_Sub1_39.anInt2962 * 128);
		@Pc(32) int local32;
		@Pc(34) int local34;
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(60) int local60;
		@Pc(76) int local76;
		if (arg5) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt4598; local16++) {
				@Pc(25) int local25 = local16 << this.anInt4597;
				local32 = local16 + 1 << this.anInt4597;
				label144: for (local34 = 0; local34 < this.anInt4594; local34++) {
					if (this.aClass403ArrayArray1[local34][local16] != null) {
						local51 = local34 << this.anInt4597;
						local58 = local34 + 1 << this.anInt4597;
						for (local60 = local51; local60 < local58; local60++) {
							if (local60 - arg1 >= -arg3 && local60 - arg1 <= arg3) {
								for (local76 = local25; local76 < local32; local76++) {
									if (local76 - arg2 >= -arg3 && local76 - arg2 <= arg3 && arg4[local60 - arg1 + arg3][local76 - arg2 + arg3]) {
										arg0.aClass487_35.method30070(local12, local12, 1.0F, 1.0F);
										arg0.aClass487_35.aFloatArray114[12] = -local34;
										arg0.aClass487_35.aFloatArray114[13] = -local16;
										this.aClass403ArrayArray1[local34][local16].method28897(arg0);
										continue label144;
									}
								}
							}
						}
					}
				}
			}
		} else {
			@Pc(152) int[] local152 = new int[this.anInt4598 * this.anInt4594];
			@Pc(156) ByteBuffer local156 = this.aClass102_Sub1_39.aByteBuffer7;
			local156.clear();
			local32 = 0;
			for (local34 = 0; local34 < this.anInt4598; local34++) {
				local51 = local34 << this.anInt4597;
				local58 = local34 + 1 << this.anInt4597;
				for (local60 = 0; local60 < this.anInt4594; local60++) {
					@Pc(192) Class403 local192 = this.aClass403ArrayArray1[local60][local34];
					@Pc(194) int local194 = 0;
					if (local192 != null) {
						@Pc(201) int local201 = local60 << this.anInt4597;
						@Pc(208) int local208 = local60 + 1 << this.anInt4597;
						for (@Pc(210) int local210 = local51; local210 < local58; local210++) {
							if (local210 - arg2 >= -arg3 && local210 - arg2 <= arg3) {
								@Pc(234) int local234 = local210 * this.aClass100_Sub2_3.anInt448 * -1548585779 + local201;
								for (@Pc(236) int local236 = local201; local236 < local208; local236++) {
									if (local236 - arg1 >= -arg3 && local236 - arg1 <= arg3 && arg4[local236 - arg1 + arg3][local210 - arg2 + arg3]) {
										@Pc(270) short[] local270 = this.aClass100_Sub2_3.aShortArrayArray2[local234];
										if (local270 != null) {
											for (@Pc(274) int local274 = 0; local274 < local270.length; local274++) {
												local156.putShort(local270[local274]);
												local194++;
											}
										}
									}
									local234++;
								}
							}
						}
					}
					local152[local32] = local194;
					local32++;
				}
			}
			if (local156.position() != 0) {
				local34 = local156.position();
				@Pc(314) Interface44 local314 = this.aClass102_Sub1_39.method21249(local34 / 2);
				local314.method29383(0, local34, this.aClass102_Sub1_39.aLong168);
				local58 = 0;
				local32 = 0;
				for (local60 = 0; local60 < this.anInt4598; local60++) {
					for (local76 = 0; local76 < this.anInt4594; local76++) {
						if (local152[local32] != 0) {
							arg0.aClass487_35.method30070(local12, local12, 1.0F, 1.0F);
							arg0.aClass487_35.aFloatArray114[12] = -local76;
							arg0.aClass487_35.aFloatArray114[13] = -local60;
							this.aClass403ArrayArray1[local76][local60].method28898(arg0, local314, local58, local152[local32] / 3);
							local58 += local152[local32];
						}
						local32++;
					}
				}
			}
		}
		this.aClass102_Sub1_39.method20762(true);
	}

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "(Lclient!arx;II)V")
	void method28919(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class80_Sub1_Sub10_Sub2 local2 = (Class80_Sub1_Sub10_Sub2) arg0;
		arg1 += local2.anInt3262 + 1;
		arg2 += local2.anInt3263 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4595;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3260;
		@Pc(31) int local31 = local2.anInt3261;
		@Pc(36) int local36 = this.anInt4595 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt4595;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt4596) {
			local44 = arg2 + local28 + 1 - this.anInt4596;
			local28 -= local44;
		}
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local31 -= local44;
			local25 += local44;
			local23 += local44;
			local38 += local44;
			local36 += local44;
			arg1 = 1;
		}
		if (arg1 + local31 >= this.anInt4595) {
			local44 = arg1 + local31 + 1 - this.anInt4595;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method28923(this.aByteArray91, local2.aByteArray64, local25, local23, local31, local28, local36, local38);
			this.method28931(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!lu", name = "u", descriptor = "(Lclient!arx;II)V")
	void method28920(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class80_Sub1_Sub10_Sub2 local2 = (Class80_Sub1_Sub10_Sub2) arg0;
		arg1 += local2.anInt3262 + 1;
		arg2 += local2.anInt3263 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4595;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3260;
		@Pc(31) int local31 = local2.anInt3261;
		@Pc(36) int local36 = this.anInt4595 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt4595;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt4596) {
			local44 = arg2 + local28 + 1 - this.anInt4596;
			local28 -= local44;
		}
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local31 -= local44;
			local25 += local44;
			local23 += local44;
			local38 += local44;
			local36 += local44;
			arg1 = 1;
		}
		if (arg1 + local31 >= this.anInt4595) {
			local44 = arg1 + local31 + 1 - this.anInt4595;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method28934(this.aByteArray91, local2.aByteArray64, local25, local23, local31, local28, local36, local38);
			this.method28931(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!lu", name = "r", descriptor = "(Lclient!arx;II)Z")
	boolean method28921(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class80_Sub1_Sub10_Sub2 local2 = (Class80_Sub1_Sub10_Sub2) arg0;
		arg1 += local2.anInt3262 + 1;
		arg2 += local2.anInt3263 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4595;
		@Pc(26) int local26 = local2.anInt3260;
		@Pc(29) int local29 = local2.anInt3261;
		@Pc(34) int local34 = this.anInt4595 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt4595;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt4596) {
			local40 = arg2 + local26 + 1 - this.anInt4596;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt4595) {
			local40 = arg1 + local29 + 1 - this.anInt4595;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt4595;
			return method28924(this.aByteArray91, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lu", name = "h", descriptor = "(Lclient!arx;II)Z")
	boolean method28922(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class80_Sub1_Sub10_Sub2 local2 = (Class80_Sub1_Sub10_Sub2) arg0;
		arg1 += local2.anInt3262 + 1;
		arg2 += local2.anInt3263 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4595;
		@Pc(26) int local26 = local2.anInt3260;
		@Pc(29) int local29 = local2.anInt3261;
		@Pc(34) int local34 = this.anInt4595 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt4595;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt4596) {
			local40 = arg2 + local26 + 1 - this.anInt4596;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt4595) {
			local40 = arg1 + local29 + 1 - this.anInt4595;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt4595;
			return method28924(this.aByteArray91, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lu", name = "j", descriptor = "()V")
	void method28925() {
		this.aClass403ArrayArray1 = new Class403[this.anInt4594][this.anInt4598];
		for (@Pc(8) int local8 = 0; local8 < this.anInt4598; local8++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt4594; local14++) {
				this.aClass403ArrayArray1[local14][local8] = new Class403(this.aClass102_Sub1_39, this, this.aClass100_Sub2_3, local14, local8, this.anInt4597, local14 * 128 + 1, local8 * 128 + 1);
				if (this.aClass403ArrayArray1[local14][local8].anInt4588 == 0) {
					this.aClass403ArrayArray1[local14][local8] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!je;III[[ZZ)V")
	void method28926(@OriginalArg(0) Class119 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[][] arg4, @OriginalArg(5) boolean arg5) {
		this.aClass102_Sub1_39.method20762(false);
		@Pc(12) float local12 = 1.0F / (float) (this.aClass102_Sub1_39.anInt2962 * 128);
		@Pc(32) int local32;
		@Pc(34) int local34;
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(60) int local60;
		@Pc(76) int local76;
		if (arg5) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt4598; local16++) {
				@Pc(25) int local25 = local16 << this.anInt4597;
				local32 = local16 + 1 << this.anInt4597;
				label144: for (local34 = 0; local34 < this.anInt4594; local34++) {
					if (this.aClass403ArrayArray1[local34][local16] != null) {
						local51 = local34 << this.anInt4597;
						local58 = local34 + 1 << this.anInt4597;
						for (local60 = local51; local60 < local58; local60++) {
							if (local60 - arg1 >= -arg3 && local60 - arg1 <= arg3) {
								for (local76 = local25; local76 < local32; local76++) {
									if (local76 - arg2 >= -arg3 && local76 - arg2 <= arg3 && arg4[local60 - arg1 + arg3][local76 - arg2 + arg3]) {
										arg0.aClass487_35.method30070(local12, local12, 1.0F, 1.0F);
										arg0.aClass487_35.aFloatArray114[12] = -local34;
										arg0.aClass487_35.aFloatArray114[13] = -local16;
										this.aClass403ArrayArray1[local34][local16].method28897(arg0);
										continue label144;
									}
								}
							}
						}
					}
				}
			}
		} else {
			@Pc(152) int[] local152 = new int[this.anInt4598 * this.anInt4594];
			@Pc(156) ByteBuffer local156 = this.aClass102_Sub1_39.aByteBuffer7;
			local156.clear();
			local32 = 0;
			for (local34 = 0; local34 < this.anInt4598; local34++) {
				local51 = local34 << this.anInt4597;
				local58 = local34 + 1 << this.anInt4597;
				for (local60 = 0; local60 < this.anInt4594; local60++) {
					@Pc(192) Class403 local192 = this.aClass403ArrayArray1[local60][local34];
					@Pc(194) int local194 = 0;
					if (local192 != null) {
						@Pc(201) int local201 = local60 << this.anInt4597;
						@Pc(208) int local208 = local60 + 1 << this.anInt4597;
						for (@Pc(210) int local210 = local51; local210 < local58; local210++) {
							if (local210 - arg2 >= -arg3 && local210 - arg2 <= arg3) {
								@Pc(234) int local234 = local210 * this.aClass100_Sub2_3.anInt448 * -1548585779 + local201;
								for (@Pc(236) int local236 = local201; local236 < local208; local236++) {
									if (local236 - arg1 >= -arg3 && local236 - arg1 <= arg3 && arg4[local236 - arg1 + arg3][local210 - arg2 + arg3]) {
										@Pc(270) short[] local270 = this.aClass100_Sub2_3.aShortArrayArray2[local234];
										if (local270 != null) {
											for (@Pc(274) int local274 = 0; local274 < local270.length; local274++) {
												local156.putShort(local270[local274]);
												local194++;
											}
										}
									}
									local234++;
								}
							}
						}
					}
					local152[local32] = local194;
					local32++;
				}
			}
			if (local156.position() != 0) {
				local34 = local156.position();
				@Pc(314) Interface44 local314 = this.aClass102_Sub1_39.method21249(local34 / 2);
				local314.method29383(0, local34, this.aClass102_Sub1_39.aLong168);
				local58 = 0;
				local32 = 0;
				for (local60 = 0; local60 < this.anInt4598; local60++) {
					for (local76 = 0; local76 < this.anInt4594; local76++) {
						if (local152[local32] != 0) {
							arg0.aClass487_35.method30070(local12, local12, 1.0F, 1.0F);
							arg0.aClass487_35.aFloatArray114[12] = -local76;
							arg0.aClass487_35.aFloatArray114[13] = -local60;
							this.aClass403ArrayArray1[local76][local60].method28898(arg0, local314, local58, local152[local32] / 3);
							local58 += local152[local32];
						}
						local32++;
					}
				}
			}
		}
		this.aClass102_Sub1_39.method20762(true);
	}

	@OriginalMember(owner = "client!lu", name = "t", descriptor = "()V")
	void method28927() {
		this.aClass403ArrayArray1 = new Class403[this.anInt4594][this.anInt4598];
		for (@Pc(8) int local8 = 0; local8 < this.anInt4598; local8++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt4594; local14++) {
				this.aClass403ArrayArray1[local14][local8] = new Class403(this.aClass102_Sub1_39, this, this.aClass100_Sub2_3, local14, local8, this.anInt4597, local14 * 128 + 1, local8 * 128 + 1);
				if (this.aClass403ArrayArray1[local14][local8].anInt4588 == 0) {
					this.aClass403ArrayArray1[local14][local8] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "k", descriptor = "(Lclient!arx;II)Z")
	boolean method28928(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class80_Sub1_Sub10_Sub2 local2 = (Class80_Sub1_Sub10_Sub2) arg0;
		arg1 += local2.anInt3262 + 1;
		arg2 += local2.anInt3263 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4595;
		@Pc(26) int local26 = local2.anInt3260;
		@Pc(29) int local29 = local2.anInt3261;
		@Pc(34) int local34 = this.anInt4595 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt4595;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt4596) {
			local40 = arg2 + local26 + 1 - this.anInt4596;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt4595) {
			local40 = arg1 + local29 + 1 - this.anInt4595;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt4595;
			return method28924(this.aByteArray91, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lu", name = "x", descriptor = "(Lclient!arx;II)Z")
	boolean method28929(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class80_Sub1_Sub10_Sub2 local2 = (Class80_Sub1_Sub10_Sub2) arg0;
		arg1 += local2.anInt3262 + 1;
		arg2 += local2.anInt3263 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4595;
		@Pc(26) int local26 = local2.anInt3260;
		@Pc(29) int local29 = local2.anInt3261;
		@Pc(34) int local34 = this.anInt4595 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt4595;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt4596) {
			local40 = arg2 + local26 + 1 - this.anInt4596;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt4595) {
			local40 = arg1 + local29 + 1 - this.anInt4595;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt4595;
			return method28924(this.aByteArray91, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lu", name = "w", descriptor = "(Lclient!arx;II)Z")
	boolean method28930(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class80_Sub1_Sub10_Sub2 local2 = (Class80_Sub1_Sub10_Sub2) arg0;
		arg1 += local2.anInt3262 + 1;
		arg2 += local2.anInt3263 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4595;
		@Pc(26) int local26 = local2.anInt3260;
		@Pc(29) int local29 = local2.anInt3261;
		@Pc(34) int local34 = this.anInt4595 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt4595;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt4596) {
			local40 = arg2 + local26 + 1 - this.anInt4596;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt4595) {
			local40 = arg1 + local29 + 1 - this.anInt4595;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt4595;
			return method28924(this.aByteArray91, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lu", name = "g", descriptor = "(IIII)V")
	void method28931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass403ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class403[] local45 = this.aClass403ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				if (local45[local47] != null) {
					local45[local47].aBoolean855 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "(IIII)V")
	void method28937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass403ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class403[] local45 = this.aClass403ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				if (local45[local47] != null) {
					local45[local47].aBoolean855 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "s", descriptor = "(Lclient!arx;II)V")
	void method28939(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class80_Sub1_Sub10_Sub2 local2 = (Class80_Sub1_Sub10_Sub2) arg0;
		arg1 += local2.anInt3262 + 1;
		arg2 += local2.anInt3263 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4595;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3260;
		@Pc(31) int local31 = local2.anInt3261;
		@Pc(36) int local36 = this.anInt4595 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt4595;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt4596) {
			local44 = arg2 + local28 + 1 - this.anInt4596;
			local28 -= local44;
		}
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local31 -= local44;
			local25 += local44;
			local23 += local44;
			local38 += local44;
			local36 += local44;
			arg1 = 1;
		}
		if (arg1 + local31 >= this.anInt4595) {
			local44 = arg1 + local31 + 1 - this.anInt4595;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method28923(this.aByteArray91, local2.aByteArray64, local25, local23, local31, local28, local36, local38);
			this.method28931(arg1, arg2, local31, local28);
		}
	}
}
