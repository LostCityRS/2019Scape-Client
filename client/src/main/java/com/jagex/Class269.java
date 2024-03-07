package com.jagex;

import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
class Class269 implements Interface58 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!fn", name = "this$0", descriptor = "Lclient!fb;")
	final Class258 this$0;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!fb;)V", line = 59)
	Class269(@OriginalArg(0) Class258 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;B)V", line = 61)
	@Override
	public void method26350(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) byte arg3) {
		@Pc(2) Class539 local2 = (Class539) arg0;
		@Pc(6) Class472 local6 = local2.method30854((short) -1580);
		@Pc(10) float local10 = local2.method30858(-756584846);
		@Pc(14) float local14 = local2.method30860((byte) 1);
		@Pc(21) Class472 local21 = Class472.method29579(local6, this.this$0.method26037(-1505746905));
		@Pc(23) float local23 = 0.0F;
		@Pc(26) float local26 = local21.method29593();
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
		@Pc(71) int local71 = 8192;
		@Pc(73) float local73 = 0.0F;
		@Pc(115) int local115;
		if (Class429.anInt4781 * -1453926679 == 3) {
			@Pc(82) float local82 = Class65.aClass123_Sub1_2.method9042((byte) -56);
			if (local21.aFloat317 != 0.0F || local21.aFloat319 != 0.0F) {
				local115 = (int) ((double) (local82 * -1.0F) * 2607.5945876176133D) - (int) (Math.atan2((double) local21.aFloat317, (double) local21.aFloat319) * 2607.5945876176133D) - 4096 & 0x3FFF;
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
				local71 = local115 * local128 / 8192 + (16384 - local128 >> 1);
			}
			local73 = (float) local71 * 6.1035156E-5F;
		} else {
			if (local21.aFloat317 != 0.0F || local21.aFloat319 != 0.0F) {
				@Pc(193) int local193 = -(IsaacRandom.anInt82 * -20667523) - (int) (Math.atan2((double) local21.aFloat317, (double) local21.aFloat319) * 2607.5945876176133D) - 4096 & 0x3FFF;
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

	@OriginalMember(owner = "client!fn", name = "n", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 61)
	@Override
	public void method26351(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class539 local2 = (Class539) arg0;
		@Pc(6) Class472 local6 = local2.method30854((short) -8262);
		@Pc(10) float local10 = local2.method30858(-601457725);
		@Pc(14) float local14 = local2.method30860((byte) 1);
		@Pc(21) Class472 local21 = Class472.method29579(local6, this.this$0.method26037(-823818015));
		@Pc(23) float local23 = 0.0F;
		@Pc(26) float local26 = local21.method29593();
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
		@Pc(71) int local71 = 8192;
		@Pc(73) float local73 = 0.0F;
		@Pc(115) int local115;
		if (Class429.anInt4781 * -1453926679 == 3) {
			@Pc(82) float local82 = Class65.aClass123_Sub1_2.method9042((byte) -6);
			if (local21.aFloat317 != 0.0F || local21.aFloat319 != 0.0F) {
				local115 = (int) ((double) (local82 * -1.0F) * 2607.5945876176133D) - (int) (Math.atan2((double) local21.aFloat317, (double) local21.aFloat319) * 2607.5945876176133D) - 4096 & 0x3FFF;
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
				local71 = local115 * local128 / 8192 + (16384 - local128 >> 1);
			}
			local73 = (float) local71 * 6.1035156E-5F;
		} else {
			if (local21.aFloat317 != 0.0F || local21.aFloat319 != 0.0F) {
				@Pc(193) int local193 = -(IsaacRandom.anInt82 * -20667523) - (int) (Math.atan2((double) local21.aFloat317, (double) local21.aFloat319) * 2607.5945876176133D) - 4096 & 0x3FFF;
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

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 61)
	@Override
	public void method26352(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class539 local2 = (Class539) arg0;
		@Pc(6) Class472 local6 = local2.method30854((short) -21869);
		@Pc(10) float local10 = local2.method30858(-1323154846);
		@Pc(14) float local14 = local2.method30860((byte) 1);
		@Pc(21) Class472 local21 = Class472.method29579(local6, this.this$0.method26037(-1824443984));
		@Pc(23) float local23 = 0.0F;
		@Pc(26) float local26 = local21.method29593();
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
		@Pc(71) int local71 = 8192;
		@Pc(73) float local73 = 0.0F;
		@Pc(115) int local115;
		if (Class429.anInt4781 * -1453926679 == 3) {
			@Pc(82) float local82 = Class65.aClass123_Sub1_2.method9042((byte) -96);
			if (local21.aFloat317 != 0.0F || local21.aFloat319 != 0.0F) {
				local115 = (int) ((double) (local82 * -1.0F) * 2607.5945876176133D) - (int) (Math.atan2((double) local21.aFloat317, (double) local21.aFloat319) * 2607.5945876176133D) - 4096 & 0x3FFF;
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
				local71 = local115 * local128 / 8192 + (16384 - local128 >> 1);
			}
			local73 = (float) local71 * 6.1035156E-5F;
		} else {
			if (local21.aFloat317 != 0.0F || local21.aFloat319 != 0.0F) {
				@Pc(193) int local193 = -(IsaacRandom.anInt82 * -20667523) - (int) (Math.atan2((double) local21.aFloat317, (double) local21.aFloat319) * 2607.5945876176133D) - 4096 & 0x3FFF;
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

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "(Ljava/lang/CharSequence;B)[B", line = 90)
	public static byte[] method26271(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) byte[] local5 = new byte[local2];
		for (@Pc(7) int local7 = 0; local7 < local2; local7++) {
			@Pc(14) char local14 = arg0.charAt(local7);
			if (local14 > '\u0000' && local14 < '\u0080' || !(local14 < ' ' || local14 > 'ÿ')) {
				local5[local7] = (byte) local14;
			} else if (local14 == '€') {
				local5[local7] = -128;
			} else if (local14 == '‚') {
				local5[local7] = -126;
			} else if (local14 == 'ƒ') {
				local5[local7] = -125;
			} else if (local14 == '„') {
				local5[local7] = -124;
			} else if (local14 == '…') {
				local5[local7] = -123;
			} else if (local14 == '†') {
				local5[local7] = -122;
			} else if (local14 == '‡') {
				local5[local7] = -121;
			} else if (local14 == 'ˆ') {
				local5[local7] = -120;
			} else if (local14 == '‰') {
				local5[local7] = -119;
			} else if (local14 == 'Š') {
				local5[local7] = -118;
			} else if (local14 == '‹') {
				local5[local7] = -117;
			} else if (local14 == 'Œ') {
				local5[local7] = -116;
			} else if (local14 == 'Ž') {
				local5[local7] = -114;
			} else if (local14 == '‘') {
				local5[local7] = -111;
			} else if (local14 == '’') {
				local5[local7] = -110;
			} else if (local14 == '“') {
				local5[local7] = -109;
			} else if (local14 == '”') {
				local5[local7] = -108;
			} else if (local14 == '•') {
				local5[local7] = -107;
			} else if (local14 == '–') {
				local5[local7] = -106;
			} else if (local14 == '—') {
				local5[local7] = -105;
			} else if (local14 == '˜') {
				local5[local7] = -104;
			} else if (local14 == '™') {
				local5[local7] = -103;
			} else if (local14 == 'š') {
				local5[local7] = -102;
			} else if (local14 == '›') {
				local5[local7] = -101;
			} else if (local14 == 'œ') {
				local5[local7] = -100;
			} else if (local14 == 'ž') {
				local5[local7] = -98;
			} else if (local14 == 'Ÿ') {
				local5[local7] = -97;
			} else {
				local5[local7] = 63;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!fn", name = "aq", descriptor = "(I)I", line = 519)
	public static int method26272(@OriginalArg(0) int arg0) {
		Class522.aTwitchEventLiveStreams1 = null;
		return Class166_Sub13.aTwitchTV1.RequestLiveStreams(client.modeGame.aString242);
	}

	@OriginalMember(owner = "client!fn", name = "act", descriptor = "(Lclient!yf;B)V", line = 9964)
	static final void method26273(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		if (Class581.aClass386_2 == null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 1;
			arg0.aClass386_3 = Class581.aClass386_2;
			arg0.aMap26.put(Class138.aClass138_68, Class27.method591(arg0.aClass386_3, -1398644273));
		}
	}

	@OriginalMember(owner = "client!fn", name = "jy", descriptor = "(IIIIB)V", line = 10067)
	static final void method26274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		for (@Pc(1) int local1 = 0; local1 < client.anInt3562 * -1477010237; local1++) {
			@Pc(10) Rectangle local10 = client.aRectangleArray1[local1];
			if (local10.width + local10.x > arg0 && local10.x < arg0 + arg2 && local10.y + local10.height > arg1 && local10.y < arg3 + arg1) {
				client.aBooleanArray22[local1] = true;
			}
		}
	}
}
