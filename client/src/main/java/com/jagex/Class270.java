package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
final class Class270 implements Interface55 {

	@OriginalMember(owner = "client!fo", name = "fs", descriptor = "Lclient!pf;")
	public static Class480 aClass480_89;

	@OriginalMember(owner = "client!fo", name = "ib", descriptor = "Lclient!wt;")
	public static Class647 aClass647_1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fo", name = "this$0", descriptor = "Lclient!fg;")
	final Class263 aClass263_8;

	@OriginalMember(owner = "client!fo", name = "u", descriptor = "(Lclient!dr;FZI)F")
	static float method26691(@OriginalArg(0) Class231 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(1) float local1 = 0.0F;
		if (arg0 == null || arg0.method26015(-2030978563) == 0) {
			return local1;
		}
		@Pc(19) float local19 = (float) (arg0.aClass253Array1[0].anInt3881 * -1813617981);
		@Pc(32) float local32 = (float) (arg0.aClass253Array1[arg0.method26015(-2030978563) - 1].anInt3881 * -1813617981);
		@Pc(36) float local36 = local32 - local19;
		if ((double) local36 == 0.0D) {
			return arg0.aClass253Array1[0].aFloat284;
		}
		@Pc(49) float local49 = 0.0F;
		if (arg1 > local32) {
			local49 = (arg1 - local32) / local36;
		} else {
			local49 = (arg1 - local19) / local36;
		}
		@Pc(70) double local70 = (double) local49;
		@Pc(77) float local77 = Math.abs((float) ((double) local49 - local70));
		@Pc(81) float local81 = local36 * local77;
		@Pc(86) double local86 = Math.abs(local70 + 1.0D);
		@Pc(90) double local90 = local86 / 2.0D;
		@Pc(94) double local94 = (double) local90;
		@Pc(99) float local99 = (float) (local90 - local94);
		@Pc(147) float local147;
		@Pc(153) float local153;
		if (arg2) {
			if (Class225.aClass225_1 == arg0.aClass225_6) {
				if ((double) local99 == 0.0D) {
					local81 = local32 - local81;
				} else {
					local81 += local19;
				}
			} else if (arg0.aClass225_6 == Class225.aClass225_3 || arg0.aClass225_6 == Class225.aClass225_4) {
				local81 = local32 - local81;
			} else if (arg0.aClass225_6 == Class225.aClass225_2) {
				local81 = local19 - arg1;
				local147 = arg0.aClass253Array1[0].aFloat282;
				local153 = arg0.aClass253Array1[0].aFloat281;
				local1 = arg0.aClass253Array1[0].aFloat284;
				if ((double) local147 != 0.0D) {
					local1 -= local153 * local81 / local147;
				}
				return local1;
			}
		} else if (arg0.aClass225_7 == Class225.aClass225_1) {
			if ((double) local99 == 0.0D) {
				local81 += local19;
			} else {
				local81 = local32 - local81;
			}
		} else if (arg0.aClass225_7 == Class225.aClass225_3 || Class225.aClass225_4 == arg0.aClass225_7) {
			local81 += local19;
		} else if (arg0.aClass225_7 == Class225.aClass225_2) {
			local81 = arg1 - local32;
			local147 = arg0.aClass253Array1[arg0.method26015(-2030978563) - 1].aFloat280;
			local153 = arg0.aClass253Array1[arg0.method26015(-2030978563) - 1].aFloat283;
			local1 = arg0.aClass253Array1[arg0.method26015(-2030978563) - 1].aFloat284;
			if ((double) local147 != 0.0D) {
				local1 += local153 * local81 / local147;
			}
			return local1;
		}
		local1 = Class323.method27610(arg0, local81, (byte) 43);
		@Pc(286) float local286;
		if (arg2 && Class225.aClass225_4 == arg0.aClass225_6) {
			local286 = arg0.aClass253Array1[arg0.method26015(-2030978563) - 1].aFloat284 - arg0.aClass253Array1[0].aFloat284;
			local1 = (float) ((double) local1 - (double) local286 * local86);
		} else if (!arg2 && Class225.aClass225_4 == arg0.aClass225_7) {
			local286 = arg0.aClass253Array1[arg0.method26015(-2030978563) - 1].aFloat284 - arg0.aClass253Array1[0].aFloat284;
			local1 = (float) ((double) local1 + local86 * (double) local286);
		}
		return local1;
	}

	@OriginalMember(owner = "client!fo", name = "jr", descriptor = "(Lclient!yp;I)V")
	static void method26692(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
	}

	@OriginalMember(owner = "client!fo", name = "auc", descriptor = "(Lclient!yp;I)V")
	static void method26693(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub46_1.method16910(907222882) == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!fo", name = "eq", descriptor = "(IB)Z")
	static boolean method26694(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return arg0 == 5 || arg0 == 11 || arg0 == 1;
	}

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!fg;)V")
	Class270(@OriginalArg(0) Class263 arg0) {
		this.aClass263_8 = arg0;
	}

	@OriginalMember(owner = "client!fo", name = "t", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;I)V")
	@Override
	public void method26706(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class529 local2 = (Class529) arg0;
		@Pc(6) Class463 local6 = local2.method30747(-159508747);
		@Pc(10) float local10 = local2.method30743(-27607154);
		@Pc(14) float local14 = local2.method30744((byte) -39);
		@Pc(21) Class463 local21 = Class463.method29487(local6, this.aClass263_8.method26531((byte) 107));
		@Pc(23) float local23 = 0.0F;
		@Pc(26) float local26 = local21.method29481();
		if (local26 >= local14) {
			local23 = 0.0F;
		}
		if (local26 <= local10) {
			local23 = 1.0F;
		} else {
			@Pc(51) float local51 = 1.0F - 1.0F / (local14 - local10) * (local26 - local10);
			if ((double) local51 < 0.0D || (double) local51 > 1.0D) {
				local51 = Math.min(Math.max(local51, 0.0F), 1.0F);
			}
			local23 = local51;
		}
		arg1[0] = local23;
		arg1[1] = local23;
	}

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V")
	@Override
	public void method26708(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class529 local2 = (Class529) arg0;
		@Pc(6) Class463 local6 = local2.method30747(-159508747);
		@Pc(10) float local10 = local2.method30743(-27607154);
		@Pc(14) float local14 = local2.method30744((byte) -14);
		@Pc(21) Class463 local21 = Class463.method29487(local6, this.aClass263_8.method26531((byte) 87));
		@Pc(23) float local23 = 0.0F;
		@Pc(26) float local26 = local21.method29481();
		if (local26 >= local14) {
			local23 = 0.0F;
		}
		if (local26 <= local10) {
			local23 = 1.0F;
		} else {
			@Pc(51) float local51 = 1.0F - 1.0F / (local14 - local10) * (local26 - local10);
			if ((double) local51 < 0.0D || (double) local51 > 1.0D) {
				local51 = Math.min(Math.max(local51, 0.0F), 1.0F);
			}
			local23 = local51;
		}
		arg1[0] = local23;
		arg1[1] = local23;
	}

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V")
	@Override
	public void method26707(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class529 local2 = (Class529) arg0;
		@Pc(6) Class463 local6 = local2.method30747(-159508747);
		@Pc(10) float local10 = local2.method30743(-27607154);
		@Pc(14) float local14 = local2.method30744((byte) -56);
		@Pc(21) Class463 local21 = Class463.method29487(local6, this.aClass263_8.method26531((byte) 124));
		@Pc(23) float local23 = 0.0F;
		@Pc(26) float local26 = local21.method29481();
		if (local26 >= local14) {
			local23 = 0.0F;
		}
		if (local26 <= local10) {
			local23 = 1.0F;
		} else {
			@Pc(51) float local51 = 1.0F - 1.0F / (local14 - local10) * (local26 - local10);
			if ((double) local51 < 0.0D || (double) local51 > 1.0D) {
				local51 = Math.min(Math.max(local51, 0.0F), 1.0F);
			}
			local23 = local51;
		}
		arg1[0] = local23;
		arg1[1] = local23;
	}
}
