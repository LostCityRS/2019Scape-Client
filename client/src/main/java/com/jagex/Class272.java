package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
final class Class272 implements Interface55 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!fq", name = "this$0", descriptor = "Lclient!fg;")
	final Class263 aClass263_10;

	@OriginalMember(owner = "client!fq", name = "s", descriptor = "(Lclient!di;IIIIIIII)V")
	static void method26709(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class570 local3 = client.aClass539_1.method30932(-1638462787);
		@Pc(11) Interface60 local11 = (Interface60) local3.method31570(arg1, arg2, arg3, (byte) -54);
		@Pc(24) Class625 local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(50) int local50;
		if (local11 != null) {
			local24 = (Class625) client.aClass539_1.method30905(-1017880396).method18054(local11.method13834((byte) -61), 467156670);
			local30 = local11.method13820(-863805456) & 0x3;
			local34 = local11.method13819(599702610);
			if (-71198285 * local24.anInt5500 == -1) {
				local50 = arg6;
				if (local24.anInt5506 * 350558937 > 0) {
					local50 = arg7;
				}
				if (local34 == Class607.aClass607_13.anInt5396 * 1323580581 || local34 == Class607.aClass607_16.anInt5396 * 1323580581) {
					if (local30 == 0) {
						arg0.method20719(arg4, arg5, 4, local50, (byte) -91);
					} else if (local30 == 1) {
						arg0.method20893(arg4, arg5, 4, local50, -1675000969);
					} else if (local30 == 2) {
						arg0.method20719(arg4 + 3, arg5, 4, local50, (byte) -86);
					} else if (local30 == 3) {
						arg0.method20893(arg4, arg5 + 3, 4, local50, -901169672);
					}
				}
				if (local34 == Class607.aClass607_5.anInt5396 * 1323580581) {
					if (local30 == 0) {
						arg0.method20716(arg4, arg5, 1, 1, local50, (byte) 98);
					} else if (local30 == 1) {
						arg0.method20716(arg4 + 3, arg5, 1, 1, local50, (byte) 2);
					} else if (local30 == 2) {
						arg0.method20716(arg4 + 3, arg5 + 3, 1, 1, local50, (byte) 48);
					} else if (local30 == 3) {
						arg0.method20716(arg4, arg5 + 3, 1, 1, local50, (byte) 123);
					}
				}
				if (local34 == Class607.aClass607_16.anInt5396 * 1323580581) {
					if (local30 == 0) {
						arg0.method20893(arg4, arg5, 4, local50, -1081198788);
					} else if (local30 == 1) {
						arg0.method20719(arg4 + 3, arg5, 4, local50, (byte) -121);
					} else if (local30 == 2) {
						arg0.method20893(arg4, arg5 + 3, 4, local50, -246574084);
					} else if (local30 == 3) {
						arg0.method20719(arg4, arg5, 4, local50, (byte) -18);
					}
				}
			} else {
				Class597.method32021(arg0, local24, local30, arg4, arg5, 1646881969);
			}
		}
		local11 = (Interface60) local3.method31574(arg1, arg2, arg3, client.anInterface62_1, (byte) -59);
		if (local11 != null) {
			local24 = (Class625) client.aClass539_1.method30905(1652611874).method18054(local11.method13834((byte) 21), 471594716);
			local30 = local11.method13820(1524949719) & 0x3;
			local34 = local11.method13819(1146861979);
			if (local24.anInt5500 * -71198285 != -1) {
				Class597.method32021(arg0, local24, local30, arg4, arg5, 569693239);
			} else if (Class607.aClass607_20.anInt5396 * 1323580581 == local34) {
				local50 = -1118482;
				if (local24.anInt5506 * 350558937 > 0) {
					local50 = -1179648;
				}
				if (local30 == 0 || local30 == 2) {
					arg0.method20720(arg4, arg5 + 3, arg4 + 3, arg5, local50, -533502230);
				} else {
					arg0.method20720(arg4, arg5, arg4 + 3, arg5 + 3, local50, -533502230);
				}
			}
		}
		local11 = (Interface60) local3.method31558(arg1, arg2, arg3, -369426228);
		if (local11 == null) {
			return;
		}
		local24 = (Class625) client.aClass539_1.method30905(240198694).method18054(local11.method13834((byte) 51), 283793975);
		local30 = local11.method13820(-1500256240) & 0x3;
		if (local24.anInt5500 * -71198285 != -1) {
			Class597.method32021(arg0, local24, local30, arg4, arg5, 852800943);
		}
	}

	@OriginalMember(owner = "client!fq", name = "bax", descriptor = "(Lclient!yp;I)V")
	static void method26710(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!fg;)V")
	Class272(@OriginalArg(0) Class263 arg0) {
		this.aClass263_10 = arg0;
	}

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V")
	@Override
	public void method26708(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class529 local2 = (Class529) arg0;
		@Pc(6) Class463 local6 = local2.method30747(-159508747);
		@Pc(10) float local10 = local2.method30743(-27607154);
		@Pc(14) float local14 = local2.method30744((byte) -1);
		@Pc(19) Class463 local19 = this.aClass263_10.method26531((byte) 16);
		@Pc(23) Class463 local23 = Class463.method29487(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(27) int local27 = 8192;
		@Pc(30) float local30 = local23.method29481();
		@Pc(32) float local32 = 0.0F;
		if (local30 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(45) float local45 = (Float) arg2[0];
			@Pc(51) float local51 = (Float) arg2[1];
			@Pc(102) float local102;
			if (local19.aFloat297 > local6.aFloat297 - local45 / 2.0F && local19.aFloat297 < local45 / 2.0F + local6.aFloat297 && local19.aFloat296 > local6.aFloat296 - local51 / 2.0F && local19.aFloat296 < local6.aFloat296 + local51 / 2.0F) {
				local102 = Math.abs(local19.aFloat297 - (local6.aFloat297 + local45 / 2.0F));
				@Pc(113) float local113 = Math.abs(local19.aFloat297 - (local6.aFloat297 - local45 / 2.0F));
				@Pc(124) float local124 = Math.abs(local19.aFloat296 - (local6.aFloat297 + local51 / 2.0F));
				@Pc(135) float local135 = Math.abs(local19.aFloat296 - (local6.aFloat297 - local51 / 2.0F));
				@Pc(139) float local139 = local14 - local10;
				@Pc(143) float local143 = Math.min(local102, local113);
				@Pc(147) float local147 = Math.min(local124, local135);
				@Pc(153) float local153 = 1.0F / local139 * local143;
				@Pc(159) float local159 = 1.0F / local139 * local147;
				@Pc(165) float local165 = Math.min(Math.max(local153, 0.0F), 1.0F);
				@Pc(171) float local171 = Math.min(Math.max(local159, 0.0F), 1.0F);
				local25 = Math.min(local165, local171);
			}
			if (local23.aFloat297 != 0.0F || local23.aFloat296 != 0.0F) {
				@Pc(227) int local227;
				if (Class368.anInt4502 * -1583611537 == 3) {
					local102 = BufferedSocket.aClass121_Sub1_2.method9648(-340872501);
					if (local23.aFloat297 != 0.0F || local23.aFloat296 != 0.0F) {
						local227 = (int) ((double) (-1.0F * local102) * 2607.5945876176133D) - (int) (Math.atan2((double) local23.aFloat297, (double) local23.aFloat296) * 2607.5945876176133D) - 4096 & 0x3FFF;
						if (local227 > 8192) {
							local227 = 16384 - local227;
						}
						@Pc(240) int local240;
						if (local30 <= 0.0F) {
							local240 = 8192;
						} else if (local30 >= 4096.0F) {
							local240 = 16384;
						} else {
							local240 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
						}
						local27 = local227 * local240 / 8192 + (16384 - local240 >> 1);
					}
					local32 = (float) local27 * 6.1035156E-5F;
				} else {
					@Pc(295) int local295 = -(Class664.anInt5692 * -953671403) - (int) (Math.atan2((double) local23.aFloat297, (double) local23.aFloat296) * 2607.5945876176133D) - 4096 & 0x3FFF;
					if (local295 > 8192) {
						local295 = 16384 - local295;
					}
					if (local30 <= 0.0F) {
						local227 = 8192;
					} else if (local30 >= 4096.0F) {
						local227 = 16384;
					} else {
						local227 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
					}
					local27 = local227 * local295 / 8192 + (16384 - local227 >> 1);
					local32 = (float) local27 * 6.1035156E-5F;
				}
			}
		}
		arg1[0] = (float) (local27 < 0 ? (double) local25 : (double) local25 * Math.sqrt((double) (1.0F - local32)));
		arg1[1] = (float) (local27 < 0 ? (double) -local25 : (double) local25 * Math.sqrt((double) local32));
	}

	@OriginalMember(owner = "client!fq", name = "t", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;I)V")
	@Override
	public void method26706(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class529 local2 = (Class529) arg0;
		@Pc(6) Class463 local6 = local2.method30747(-159508747);
		@Pc(10) float local10 = local2.method30743(-27607154);
		@Pc(14) float local14 = local2.method30744((byte) -71);
		@Pc(19) Class463 local19 = this.aClass263_10.method26531((byte) 97);
		@Pc(23) Class463 local23 = Class463.method29487(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(27) int local27 = 8192;
		@Pc(30) float local30 = local23.method29481();
		@Pc(32) float local32 = 0.0F;
		if (local30 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(45) float local45 = (Float) arg2[0];
			@Pc(51) float local51 = (Float) arg2[1];
			@Pc(102) float local102;
			if (local19.aFloat297 > local6.aFloat297 - local45 / 2.0F && local19.aFloat297 < local45 / 2.0F + local6.aFloat297 && local19.aFloat296 > local6.aFloat296 - local51 / 2.0F && local19.aFloat296 < local6.aFloat296 + local51 / 2.0F) {
				local102 = Math.abs(local19.aFloat297 - (local6.aFloat297 + local45 / 2.0F));
				@Pc(113) float local113 = Math.abs(local19.aFloat297 - (local6.aFloat297 - local45 / 2.0F));
				@Pc(124) float local124 = Math.abs(local19.aFloat296 - (local6.aFloat297 + local51 / 2.0F));
				@Pc(135) float local135 = Math.abs(local19.aFloat296 - (local6.aFloat297 - local51 / 2.0F));
				@Pc(139) float local139 = local14 - local10;
				@Pc(143) float local143 = Math.min(local102, local113);
				@Pc(147) float local147 = Math.min(local124, local135);
				@Pc(153) float local153 = 1.0F / local139 * local143;
				@Pc(159) float local159 = 1.0F / local139 * local147;
				@Pc(165) float local165 = Math.min(Math.max(local153, 0.0F), 1.0F);
				@Pc(171) float local171 = Math.min(Math.max(local159, 0.0F), 1.0F);
				local25 = Math.min(local165, local171);
			}
			if (local23.aFloat297 != 0.0F || local23.aFloat296 != 0.0F) {
				@Pc(227) int local227;
				if (Class368.anInt4502 * -1583611537 == 3) {
					local102 = BufferedSocket.aClass121_Sub1_2.method9648(2086670892);
					if (local23.aFloat297 != 0.0F || local23.aFloat296 != 0.0F) {
						local227 = (int) ((double) (-1.0F * local102) * 2607.5945876176133D) - (int) (Math.atan2((double) local23.aFloat297, (double) local23.aFloat296) * 2607.5945876176133D) - 4096 & 0x3FFF;
						if (local227 > 8192) {
							local227 = 16384 - local227;
						}
						@Pc(240) int local240;
						if (local30 <= 0.0F) {
							local240 = 8192;
						} else if (local30 >= 4096.0F) {
							local240 = 16384;
						} else {
							local240 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
						}
						local27 = local227 * local240 / 8192 + (16384 - local240 >> 1);
					}
					local32 = (float) local27 * 6.1035156E-5F;
				} else {
					@Pc(295) int local295 = -(Class664.anInt5692 * -953671403) - (int) (Math.atan2((double) local23.aFloat297, (double) local23.aFloat296) * 2607.5945876176133D) - 4096 & 0x3FFF;
					if (local295 > 8192) {
						local295 = 16384 - local295;
					}
					if (local30 <= 0.0F) {
						local227 = 8192;
					} else if (local30 >= 4096.0F) {
						local227 = 16384;
					} else {
						local227 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
					}
					local27 = local227 * local295 / 8192 + (16384 - local227 >> 1);
					local32 = (float) local27 * 6.1035156E-5F;
				}
			}
		}
		arg1[0] = (float) (local27 < 0 ? (double) local25 : (double) local25 * Math.sqrt((double) (1.0F - local32)));
		arg1[1] = (float) (local27 < 0 ? (double) -local25 : (double) local25 * Math.sqrt((double) local32));
	}

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V")
	@Override
	public void method26707(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class529 local2 = (Class529) arg0;
		@Pc(6) Class463 local6 = local2.method30747(-159508747);
		@Pc(10) float local10 = local2.method30743(-27607154);
		@Pc(14) float local14 = local2.method30744((byte) -85);
		@Pc(19) Class463 local19 = this.aClass263_10.method26531((byte) 58);
		@Pc(23) Class463 local23 = Class463.method29487(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(27) int local27 = 8192;
		@Pc(30) float local30 = local23.method29481();
		@Pc(32) float local32 = 0.0F;
		if (local30 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(45) float local45 = (Float) arg2[0];
			@Pc(51) float local51 = (Float) arg2[1];
			@Pc(102) float local102;
			if (local19.aFloat297 > local6.aFloat297 - local45 / 2.0F && local19.aFloat297 < local45 / 2.0F + local6.aFloat297 && local19.aFloat296 > local6.aFloat296 - local51 / 2.0F && local19.aFloat296 < local6.aFloat296 + local51 / 2.0F) {
				local102 = Math.abs(local19.aFloat297 - (local6.aFloat297 + local45 / 2.0F));
				@Pc(113) float local113 = Math.abs(local19.aFloat297 - (local6.aFloat297 - local45 / 2.0F));
				@Pc(124) float local124 = Math.abs(local19.aFloat296 - (local6.aFloat297 + local51 / 2.0F));
				@Pc(135) float local135 = Math.abs(local19.aFloat296 - (local6.aFloat297 - local51 / 2.0F));
				@Pc(139) float local139 = local14 - local10;
				@Pc(143) float local143 = Math.min(local102, local113);
				@Pc(147) float local147 = Math.min(local124, local135);
				@Pc(153) float local153 = 1.0F / local139 * local143;
				@Pc(159) float local159 = 1.0F / local139 * local147;
				@Pc(165) float local165 = Math.min(Math.max(local153, 0.0F), 1.0F);
				@Pc(171) float local171 = Math.min(Math.max(local159, 0.0F), 1.0F);
				local25 = Math.min(local165, local171);
			}
			if (local23.aFloat297 != 0.0F || local23.aFloat296 != 0.0F) {
				@Pc(227) int local227;
				if (Class368.anInt4502 * -1583611537 == 3) {
					local102 = BufferedSocket.aClass121_Sub1_2.method9648(418755835);
					if (local23.aFloat297 != 0.0F || local23.aFloat296 != 0.0F) {
						local227 = (int) ((double) (-1.0F * local102) * 2607.5945876176133D) - (int) (Math.atan2((double) local23.aFloat297, (double) local23.aFloat296) * 2607.5945876176133D) - 4096 & 0x3FFF;
						if (local227 > 8192) {
							local227 = 16384 - local227;
						}
						@Pc(240) int local240;
						if (local30 <= 0.0F) {
							local240 = 8192;
						} else if (local30 >= 4096.0F) {
							local240 = 16384;
						} else {
							local240 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
						}
						local27 = local227 * local240 / 8192 + (16384 - local240 >> 1);
					}
					local32 = (float) local27 * 6.1035156E-5F;
				} else {
					@Pc(295) int local295 = -(Class664.anInt5692 * -953671403) - (int) (Math.atan2((double) local23.aFloat297, (double) local23.aFloat296) * 2607.5945876176133D) - 4096 & 0x3FFF;
					if (local295 > 8192) {
						local295 = 16384 - local295;
					}
					if (local30 <= 0.0F) {
						local227 = 8192;
					} else if (local30 >= 4096.0F) {
						local227 = 16384;
					} else {
						local227 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
					}
					local27 = local227 * local295 / 8192 + (16384 - local227 >> 1);
					local32 = (float) local27 * 6.1035156E-5F;
				}
			}
		}
		arg1[0] = (float) (local27 < 0 ? (double) local25 : (double) local25 * Math.sqrt((double) (1.0F - local32)));
		arg1[1] = (float) (local27 < 0 ? (double) -local25 : (double) local25 * Math.sqrt((double) local32));
	}
}
