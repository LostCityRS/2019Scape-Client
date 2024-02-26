package com.jagex;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
final class Class267 implements Interface55 {

	@OriginalMember(owner = "client!fk", name = "z", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray6;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fk", name = "this$0", descriptor = "Lclient!fg;")
	final Class263 aClass263_6;

	@OriginalMember(owner = "client!fk", name = "jw", descriptor = "(Lclient!yp;I)V")
	static void method26662(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!fk", name = "xx", descriptor = "(Lclient!yp;I)V")
	static void method26663(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local12 >> 14 & 0x3FFF;
	}

	@OriginalMember(owner = "client!fk", name = "za", descriptor = "(Lclient!yp;I)V")
	static void method26664(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 1815275855;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		if (local23 == -1) {
			throw new RuntimeException();
		}
		@Pc(46) Class50 local46 = (Class50) Class111_Sub1.aClass41_Sub20_1.method18054(local23, 864855370);
		if (local46.aClass521_1.method37268() != local13) {
			throw new RuntimeException();
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local46.method1018(local33, (short) -13342) ? 1 : 0;
	}

	@OriginalMember(owner = "client!fk", name = "bcu", descriptor = "(Lclient!alf;Lclient!yp;I)V")
	static void method26665(@OriginalArg(0) Class120_Sub1 arg0, @OriginalArg(1) Class690 arg1, @OriginalArg(2) int arg2) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (arg0.aClass246Array21 != null) {
			for (@Pc(14) int local14 = 0; local14 < arg0.aClass246Array21.length; local14++) {
				@Pc(24) Class246 local24 = arg0.aClass246Array21[local14];
				if (local24.aBoolean773) {
					@Pc(38) int local38;
					@Pc(44) int local44;
					if (local24.anInt3866 < local24.anInt3865) {
						local38 = local24.anInt3866 - local24.anInt3868;
						local44 = local24.anInt3868 + local24.anInt3865;
					} else {
						local38 = local24.anInt3865 - local24.anInt3868;
						local44 = local24.anInt3868 + local24.anInt3866;
					}
					@Pc(68) int local68;
					@Pc(74) int local74;
					if (local24.anInt3867 < local24.anInt3864) {
						local68 = local24.anInt3867 - local24.anInt3868;
						local74 = local24.anInt3868 + local24.anInt3864;
					} else {
						local68 = local24.anInt3864 - local24.anInt3868;
						local74 = local24.anInt3868 + local24.anInt3867;
					}
					if (!local1 || local38 < local3) {
						local3 = local38;
					}
					if (!local1 || local68 < local5) {
						local5 = local68;
					}
					if (!local1 || local44 > local7) {
						local7 = local44;
					}
					if (!local1 || local74 > local9) {
						local9 = local74;
					}
					local1 = true;
				}
			}
		}
		arg1.anIntArray525[(arg1.anInt5778 += 2036747717) * 1896589581 - 1] = local1 ? 1 : 0;
		arg1.anIntArray525[(arg1.anInt5778 += 2036747717) * 1896589581 - 1] = local3;
		arg1.anIntArray525[(arg1.anInt5778 += 2036747717) * 1896589581 - 1] = local5;
		arg1.anIntArray525[(arg1.anInt5778 += 2036747717) * 1896589581 - 1] = local7;
		arg1.anIntArray525[(arg1.anInt5778 += 2036747717) * 1896589581 - 1] = local9;
	}

	@OriginalMember(owner = "client!fk", name = "hc", descriptor = "(IIIIIB)V")
	public static void method26666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		Class606.anInt5395 = arg0 * -856571401;
		Class62.anInt214 = arg1 * -1939246685;
		Class203.anInt3387 = arg2 * 1958492387;
		Class165_Sub13.anInt2172 = arg3 * 183775561;
		Class147_Sub1.anInt1445 = arg4 * 2007509839;
		if (Class368.anInt4502 * -1583611537 == 3) {
			Class373.method28414(973438623);
		}
		if (Class147_Sub1.anInt1445 * -9303121 >= 100) {
			@Pc(37) int local37 = Class606.anInt5395 * -2103472640 + 256;
			@Pc(43) int local43 = Class62.anInt214 * -1433135616 + 256;
			@Pc(55) int local55 = Class439.method29150(local37, local43, Class507.anInt5045 * -1170417853, 1037753497) - Class203.anInt3387 * 1729023179;
			@Pc(61) int local61 = local37 - Class89.anInt319 * 1749751025;
			@Pc(67) int local67 = local55 - Class283.anInt3937 * -1465520451;
			@Pc(73) int local73 = local43 - Class102_Sub2.anInt653 * 1132703631;
			@Pc(84) int local84 = (int) Math.sqrt((double) (local73 * local73 + local61 * local61));
			client.anInt3481 = ((int) (Math.atan2((double) local67, (double) local84) * 2607.5945876176133D) & 0x3FFF) * -560342087;
			Class664.anInt5692 = ((int) (Math.atan2((double) local61, (double) local73) * -2607.5945876176133D) & 0x3FFF) * -399825347;
			Class338.anInt4231 = 0;
			if (client.anInt3481 * 1789770377 < 1024) {
				client.anInt3481 = 1735320576;
			}
			if (client.anInt3481 * 1789770377 > 3072) {
				client.anInt3481 = 910994432;
			}
		}
		Class368.anInt4502 = -423988277;
		Class130_Sub1.anInt1175 = -1464167667;
		Class588.anInt5304 = -503779167;
	}

	@OriginalMember(owner = "client!fk", name = "t", descriptor = "(Ljava/awt/Canvas;Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;III)Lclient!di;")
	public static Class102 method26667(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) Interface23 arg2, @OriginalArg(3) Interface46 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface48 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		return new Class102_Sub2(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!fg;)V")
	Class267(@OriginalArg(0) Class263 arg0) {
		this.aClass263_6 = arg0;
	}

	@OriginalMember(owner = "client!fk", name = "t", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;I)V")
	@Override
	public void method26706(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class529 local2 = (Class529) arg0;
		@Pc(6) Class463 local6 = local2.method30747(-159508747);
		@Pc(10) float local10 = local2.method30743(-27607154);
		@Pc(14) float local14 = local2.method30744((byte) -8);
		@Pc(21) Class463 local21 = Class463.method29487(local6, this.aClass263_6.method26531((byte) 106));
		@Pc(23) float local23 = 0.0F;
		@Pc(26) float local26 = local21.method29481();
		if (local26 >= local14) {
			local23 = 0.0F;
		}
		if (local26 <= local10) {
			local23 = 1.0F;
		} else {
			@Pc(51) float local51 = 1.0F - (local26 - local10) * (1.0F / (local14 - local10));
			if ((double) local51 < 0.0D || (double) local51 > 1.0D) {
				local51 = Math.min(Math.max(local51, 0.0F), 1.0F);
			}
			local23 = local51;
		}
		@Pc(71) int local71 = 8192;
		@Pc(73) float local73 = 0.0F;
		@Pc(115) int local115;
		if (Class368.anInt4502 * -1583611537 == 3) {
			@Pc(82) float local82 = Class160.aClass121_Sub1_2.method9648(-1101596195);
			if (local21.aFloat297 != 0.0F || local21.aFloat296 != 0.0F) {
				local115 = (int) ((double) (-1.0F * local82) * 2607.5945876176133D) - (int) (Math.atan2((double) local21.aFloat297, (double) local21.aFloat296) * 2607.5945876176133D) - 4096 & 0x3FFF;
				if (local115 > 8192) {
					local115 = 16384 - local115;
				}
				@Pc(128) int local128;
				if (local26 <= 0.0F) {
					local128 = 8192;
				} else if (local26 >= 4096.0F) {
					local128 = 16384;
				} else {
					local128 = (int) (local26 * 8192.0F / 4096.0F + 8192.0F);
				}
				local71 = (16384 - local128 >> 1) + local115 * local128 / 8192;
			}
			local73 = (float) local71 * 6.1035156E-5F;
		} else {
			if (local21.aFloat297 != 0.0F || local21.aFloat296 != 0.0F) {
				@Pc(193) int local193 = -(Class664.anInt5692 * -953671403) - (int) (Math.atan2((double) local21.aFloat297, (double) local21.aFloat296) * 2607.5945876176133D) - 4096 & 0x3FFF;
				if (local193 > 8192) {
					local193 = 16384 - local193;
				}
				if (local26 <= 0.0F) {
					local115 = 8192;
				} else if (local26 >= 4096.0F) {
					local115 = 16384;
				} else {
					local115 = (int) (local26 * 8192.0F / 4096.0F + 8192.0F);
				}
				local71 = (16384 - local115 >> 1) + local115 * local193 / 8192;
			}
			local73 = (float) local71 * 6.1035156E-5F;
		}
		arg1[0] = (float) (local71 < 0 ? (double) local23 : (double) local23 * Math.sqrt((double) ((1.0F - local73) * 2.0F)));
		arg1[1] = (float) (local71 < 0 ? (double) -local23 : (double) local23 * Math.sqrt((double) (local73 * 2.0F)));
	}

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V")
	@Override
	public void method26707(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class529 local2 = (Class529) arg0;
		@Pc(6) Class463 local6 = local2.method30747(-159508747);
		@Pc(10) float local10 = local2.method30743(-27607154);
		@Pc(14) float local14 = local2.method30744((byte) -20);
		@Pc(21) Class463 local21 = Class463.method29487(local6, this.aClass263_6.method26531((byte) 71));
		@Pc(23) float local23 = 0.0F;
		@Pc(26) float local26 = local21.method29481();
		if (local26 >= local14) {
			local23 = 0.0F;
		}
		if (local26 <= local10) {
			local23 = 1.0F;
		} else {
			@Pc(51) float local51 = 1.0F - (local26 - local10) * (1.0F / (local14 - local10));
			if ((double) local51 < 0.0D || (double) local51 > 1.0D) {
				local51 = Math.min(Math.max(local51, 0.0F), 1.0F);
			}
			local23 = local51;
		}
		@Pc(71) int local71 = 8192;
		@Pc(73) float local73 = 0.0F;
		@Pc(115) int local115;
		if (Class368.anInt4502 * -1583611537 == 3) {
			@Pc(82) float local82 = Class160.aClass121_Sub1_2.method9648(435593999);
			if (local21.aFloat297 != 0.0F || local21.aFloat296 != 0.0F) {
				local115 = (int) ((double) (-1.0F * local82) * 2607.5945876176133D) - (int) (Math.atan2((double) local21.aFloat297, (double) local21.aFloat296) * 2607.5945876176133D) - 4096 & 0x3FFF;
				if (local115 > 8192) {
					local115 = 16384 - local115;
				}
				@Pc(128) int local128;
				if (local26 <= 0.0F) {
					local128 = 8192;
				} else if (local26 >= 4096.0F) {
					local128 = 16384;
				} else {
					local128 = (int) (local26 * 8192.0F / 4096.0F + 8192.0F);
				}
				local71 = (16384 - local128 >> 1) + local115 * local128 / 8192;
			}
			local73 = (float) local71 * 6.1035156E-5F;
		} else {
			if (local21.aFloat297 != 0.0F || local21.aFloat296 != 0.0F) {
				@Pc(193) int local193 = -(Class664.anInt5692 * -953671403) - (int) (Math.atan2((double) local21.aFloat297, (double) local21.aFloat296) * 2607.5945876176133D) - 4096 & 0x3FFF;
				if (local193 > 8192) {
					local193 = 16384 - local193;
				}
				if (local26 <= 0.0F) {
					local115 = 8192;
				} else if (local26 >= 4096.0F) {
					local115 = 16384;
				} else {
					local115 = (int) (local26 * 8192.0F / 4096.0F + 8192.0F);
				}
				local71 = (16384 - local115 >> 1) + local115 * local193 / 8192;
			}
			local73 = (float) local71 * 6.1035156E-5F;
		}
		arg1[0] = (float) (local71 < 0 ? (double) local23 : (double) local23 * Math.sqrt((double) ((1.0F - local73) * 2.0F)));
		arg1[1] = (float) (local71 < 0 ? (double) -local23 : (double) local23 * Math.sqrt((double) (local73 * 2.0F)));
	}

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V")
	@Override
	public void method26708(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class529 local2 = (Class529) arg0;
		@Pc(6) Class463 local6 = local2.method30747(-159508747);
		@Pc(10) float local10 = local2.method30743(-27607154);
		@Pc(14) float local14 = local2.method30744((byte) -50);
		@Pc(21) Class463 local21 = Class463.method29487(local6, this.aClass263_6.method26531((byte) 125));
		@Pc(23) float local23 = 0.0F;
		@Pc(26) float local26 = local21.method29481();
		if (local26 >= local14) {
			local23 = 0.0F;
		}
		if (local26 <= local10) {
			local23 = 1.0F;
		} else {
			@Pc(51) float local51 = 1.0F - (local26 - local10) * (1.0F / (local14 - local10));
			if ((double) local51 < 0.0D || (double) local51 > 1.0D) {
				local51 = Math.min(Math.max(local51, 0.0F), 1.0F);
			}
			local23 = local51;
		}
		@Pc(71) int local71 = 8192;
		@Pc(73) float local73 = 0.0F;
		@Pc(115) int local115;
		if (Class368.anInt4502 * -1583611537 == 3) {
			@Pc(82) float local82 = Class160.aClass121_Sub1_2.method9648(1893417589);
			if (local21.aFloat297 != 0.0F || local21.aFloat296 != 0.0F) {
				local115 = (int) ((double) (-1.0F * local82) * 2607.5945876176133D) - (int) (Math.atan2((double) local21.aFloat297, (double) local21.aFloat296) * 2607.5945876176133D) - 4096 & 0x3FFF;
				if (local115 > 8192) {
					local115 = 16384 - local115;
				}
				@Pc(128) int local128;
				if (local26 <= 0.0F) {
					local128 = 8192;
				} else if (local26 >= 4096.0F) {
					local128 = 16384;
				} else {
					local128 = (int) (local26 * 8192.0F / 4096.0F + 8192.0F);
				}
				local71 = (16384 - local128 >> 1) + local115 * local128 / 8192;
			}
			local73 = (float) local71 * 6.1035156E-5F;
		} else {
			if (local21.aFloat297 != 0.0F || local21.aFloat296 != 0.0F) {
				@Pc(193) int local193 = -(Class664.anInt5692 * -953671403) - (int) (Math.atan2((double) local21.aFloat297, (double) local21.aFloat296) * 2607.5945876176133D) - 4096 & 0x3FFF;
				if (local193 > 8192) {
					local193 = 16384 - local193;
				}
				if (local26 <= 0.0F) {
					local115 = 8192;
				} else if (local26 >= 4096.0F) {
					local115 = 16384;
				} else {
					local115 = (int) (local26 * 8192.0F / 4096.0F + 8192.0F);
				}
				local71 = (16384 - local115 >> 1) + local115 * local193 / 8192;
			}
			local73 = (float) local71 * 6.1035156E-5F;
		}
		arg1[0] = (float) (local71 < 0 ? (double) local23 : (double) local23 * Math.sqrt((double) ((1.0F - local73) * 2.0F)));
		arg1[1] = (float) (local71 < 0 ? (double) -local23 : (double) local23 * Math.sqrt((double) (local73 * 2.0F)));
	}
}
