package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class239 {

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
	static final int anInt3855 = 2;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
	static final int anInt3856 = 0;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "[I")
	final int[] anIntArray355;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "[I")
	final int[] anIntArray356;

	@OriginalMember(owner = "client!eb", name = "ah", descriptor = "(I)I")
	public static int method26212(@OriginalArg(0) int arg0) {
		return Class622.aTwitchWebcamDeviceArray1 == null ? 0 : Class622.aTwitchWebcamDeviceArray1.length;
	}

	@OriginalMember(owner = "client!eb", name = "mz", descriptor = "(Lclient!yp;I)V")
	static void method26213(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 1994673745);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class350.method28012(local16, local22, arg0, (byte) 44);
	}

	@OriginalMember(owner = "client!eb", name = "akc", descriptor = "(Lclient!yp;B)V")
	static void method26214(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) Class3 local33 = Class159.method15416(local13 >> 14 & 0x3FFF, local13 & 0x3FFF);
		@Pc(35) boolean local35 = false;
		for (@Pc(40) Class80_Sub1_Sub12 local40 = (Class80_Sub1_Sub12) local33.method50((byte) -38); local40 != null; local40 = (Class80_Sub1_Sub12) local33.method46((byte) -102)) {
			if (local40.anInt3091 * 1774210559 == local23) {
				local35 = true;
				break;
			}
		}
		if (local35) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 1;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!eb", name = "ayr", descriptor = "(Lclient!yp;B)V")
	static void method26215(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class141_Sub1.anInt1282 * 2082219;
	}

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "(IILclient!hx;Lclient!hr;IIB)V")
	static void method26216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class327 arg2, @OriginalArg(3) Class323 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		@Pc(1) Class101[] local1 = client.aClass101Array1;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Class101 local11 = local1[local3];
			if (local11 != null && local11.anInt467 * 1614016575 != 0 && client.anInt3436 % 20 < 10) {
				@Pc(59) int local59;
				if (local11.anInt467 * 1614016575 == 1) {
					@Pc(38) Class80_Sub19 local38 = (Class80_Sub19) client.aClass24_18.method560((long) (local11.anInt464 * 1096614689));
					if (local38 != null) {
						@Pc(45) Class120_Sub1_Sub1_Sub1_Sub1 local45 = (Class120_Sub1_Sub1_Sub1_Sub1) local38.anObject5;
						@Pc(49) Class463 local49 = local45.method24552().aClass463_61;
						local59 = (int) local49.aFloat297 / 128 - arg0 / 128;
						@Pc(69) int local69 = (int) local49.aFloat296 / 128 - arg1 / 128;
						Class616.method32288(arg2, arg3, arg4, arg5, local59, local69, local11.anInt461 * -168952975, 360000L);
					}
				}
				if (local11.anInt467 * 1614016575 == 2) {
					@Pc(98) int local98 = local11.anInt466 * -191529145 / 128 - arg0 / 128;
					@Pc(109) int local109 = local11.anInt465 * -1207974023 / 128 - arg1 / 128;
					@Pc(117) long local117 = (long) (local11.anInt460 * -380320871 << 7);
					@Pc(121) long local121 = local117 * local117;
					Class616.method32288(arg2, arg3, arg4, arg5, local98, local109, local11.anInt461 * -168952975, local121);
				}
				if (local11.anInt467 * 1614016575 == 10 && local11.anInt464 * 1096614689 >= 0 && local11.anInt464 * 1096614689 < client.aClass120_Sub1_Sub1_Sub1_Sub2Array1.length) {
					@Pc(158) Class120_Sub1_Sub1_Sub1_Sub2 local158 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local11.anInt464 * 1096614689];
					if (local158 != null) {
						@Pc(165) Class463 local165 = local158.method24552().aClass463_61;
						@Pc(175) int local175 = (int) local165.aFloat297 / 128 - arg0 / 128;
						local59 = (int) local165.aFloat296 / 128 - arg1 / 128;
						Class616.method32288(arg2, arg3, arg4, arg5, local175, local59, local11.anInt461 * -168952975, 360000L);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class239(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(5) int local5 = arg0.method23195(1837109654);
		this.anIntArray355 = new int[local5];
		this.anIntArray356 = new int[local5];
		for (@Pc(15) int local15 = 0; local15 < local5; local15++) {
			@Pc(22) int local22 = arg0.method23362(148340612);
			this.anIntArray355[local15] = local22;
			@Pc(31) int local31 = arg0.method23178((byte) -14);
			@Pc(35) int local35 = arg0.method23178((byte) -107);
			this.anIntArray356[local15] = local35 + (local31 << 16);
		}
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(Lclient!ex;I)V")
	void method26209(@OriginalArg(0) Class254 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray356[0];
		arg0.method26387(arg1, local4 >>> 16, local4 & 0xFFFF, (byte) 1);
		@Pc(18) Class120_Sub1_Sub1_Sub1 local18 = arg0.method26399((byte) -2);
		local18.anInt2700 = 0;
		for (@Pc(27) int local27 = this.anIntArray355.length - 1; local27 >= 0; local27--) {
			@Pc(34) int local34 = this.anIntArray355[local27];
			@Pc(39) int local39 = this.anIntArray356[local27];
			local18.anIntArray234[local18.anInt2700 * 1679797067] = local39 >> 16;
			local18.anIntArray242[local18.anInt2700 * 1679797067] = local39 & 0xFFFF;
			@Pc(62) byte local62 = Class712.aClass712_2.aByte165;
			if (local34 == 0) {
				local62 = Class712.aClass712_1.aByte165;
			} else if (local34 == 2) {
				local62 = Class712.aClass712_5.aByte165;
			}
			local18.aByteArray49[local18.anInt2700 * 1679797067] = local62;
			local18.anInt2700 += -1307113885;
		}
	}

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "(Lclient!ex;IB)V")
	void method26210(@OriginalArg(0) Class254 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(4) int local4 = this.anIntArray356[0];
		arg0.method26387(arg1, local4 >>> 16, local4 & 0xFFFF, (byte) 1);
		@Pc(18) Class120_Sub1_Sub1_Sub1 local18 = arg0.method26399((byte) -3);
		local18.anInt2700 = 0;
		for (@Pc(27) int local27 = this.anIntArray355.length - 1; local27 >= 0; local27--) {
			@Pc(34) int local34 = this.anIntArray355[local27];
			@Pc(39) int local39 = this.anIntArray356[local27];
			local18.anIntArray234[local18.anInt2700 * 1679797067] = local39 >> 16;
			local18.anIntArray242[local18.anInt2700 * 1679797067] = local39 & 0xFFFF;
			@Pc(62) byte local62 = Class712.aClass712_2.aByte165;
			if (local34 == 0) {
				local62 = Class712.aClass712_1.aByte165;
			} else if (local34 == 2) {
				local62 = Class712.aClass712_5.aByte165;
			}
			local18.aByteArray49[local18.anInt2700 * 1679797067] = local62;
			local18.anInt2700 += -1307113885;
		}
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(Lclient!ex;I)V")
	void method26211(@OriginalArg(0) Class254 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray356[0];
		arg0.method26387(arg1, local4 >>> 16, local4 & 0xFFFF, (byte) 1);
		@Pc(18) Class120_Sub1_Sub1_Sub1 local18 = arg0.method26399((byte) -14);
		local18.anInt2700 = 0;
		for (@Pc(27) int local27 = this.anIntArray355.length - 1; local27 >= 0; local27--) {
			@Pc(34) int local34 = this.anIntArray355[local27];
			@Pc(39) int local39 = this.anIntArray356[local27];
			local18.anIntArray234[local18.anInt2700 * 1679797067] = local39 >> 16;
			local18.anIntArray242[local18.anInt2700 * 1679797067] = local39 & 0xFFFF;
			@Pc(62) byte local62 = Class712.aClass712_2.aByte165;
			if (local34 == 0) {
				local62 = Class712.aClass712_1.aByte165;
			} else if (local34 == 2) {
				local62 = Class712.aClass712_5.aByte165;
			}
			local18.aByteArray49[local18.anInt2700 * 1679797067] = local62;
			local18.anInt2700 += -1307113885;
		}
	}
}
