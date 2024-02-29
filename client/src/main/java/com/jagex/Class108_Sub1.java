package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aff")
public class Class108_Sub1 extends Class108 {

	@OriginalMember(owner = "client!aff", name = "fa", descriptor = "Lclient!py;")
	public static Class497 aClass497_19;

	@OriginalMember(owner = "client!aff", name = "w", descriptor = "I")
	public int anInt693;

	@OriginalMember(owner = "client!aff", name = "<init>", descriptor = "(Lclient!qe;I)V", line = 12)
	Class108_Sub1(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aff", name = "u", descriptor = "(Lclient!alw;IS)V", line = 16)
	@Override
	void method7448(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		@Pc(6) Class302 local6 = (Class302) Class107.method18116(Class539.method30785(-499262835), arg1, -1915563430);
		if (Class302.aClass302_18 == local6) {
			this.anInt693 = arg0.method22472(-1434290800) * -1222568711;
		}
	}

	@OriginalMember(owner = "client!aff", name = "d", descriptor = "(Lclient!alw;I)V", line = 16)
	@Override
	void method7449(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class302 local6 = (Class302) Class107.method18116(Class539.method30785(-558567392), arg1, -1915563430);
		if (Class302.aClass302_18 == local6) {
			this.anInt693 = arg0.method22472(-1434290800) * -1222568711;
		}
	}

	@OriginalMember(owner = "client!aff", name = "c", descriptor = "(Lclient!alw;I)V", line = 16)
	@Override
	void method7451(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class302 local6 = (Class302) Class107.method18116(Class539.method30785(-1223205404), arg1, -1915563430);
		if (Class302.aClass302_18 == local6) {
			this.anInt693 = arg0.method22472(-1434290800) * -1222568711;
		}
	}

	@OriginalMember(owner = "client!aff", name = "r", descriptor = "(Lclient!alw;I)V", line = 16)
	@Override
	void method7450(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class302 local6 = (Class302) Class107.method18116(Class539.method30785(-686594244), arg1, -1915563430);
		if (Class302.aClass302_18 == local6) {
			this.anInt693 = arg0.method22472(-1434290800) * -1222568711;
		}
	}

	@OriginalMember(owner = "client!aff", name = "n", descriptor = "(I)V", line = 21)
	@Override
	public void method36653(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aff", name = "l", descriptor = "()V", line = 21)
	@Override
	public void method36659() {
	}

	@OriginalMember(owner = "client!aff", name = "au", descriptor = "(IB)Lclient!com/jagex/twitchtv/TwitchWebcamDevice;", line = 494)
	public static TwitchWebcamDevice method5224(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (Class625.aTwitchWebcamDeviceArray1 == null) {
			return null;
		}
		for (@Pc(5) int local5 = 0; local5 < Class625.aTwitchWebcamDeviceArray1.length; local5++) {
			if (arg0 == Class625.aTwitchWebcamDeviceArray1[local5].m * -1015277237) {
				return Class625.aTwitchWebcamDeviceArray1[local5];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aff", name = "s", descriptor = "(IILclient!hf;Lclient!ch;III)V", line = 539)
	static void method5225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class312 arg2, @OriginalArg(3) Class96 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = Class174.anInt3293 * -1081967415;
		@Pc(5) int[] local5 = Class174.anIntArray278;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(16) Class132_Sub1_Sub1_Sub1_Sub2 local16 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local5[local7]];
			if (local16 != null && local16.method20084(1688699220) && !local16.aClass659_1.method32801(-125905710) && local16 != Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 && local16.aByte100 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100) {
				@Pc(39) Class472 local39 = local16.method24220().aClass472_61;
				@Pc(49) int local49 = (int) local39.aFloat317 / 128 - arg0 / 128;
				@Pc(59) int local59 = (int) local39.aFloat319 / 128 - arg1 / 128;
				@Pc(61) boolean local61 = false;
				for (@Pc(63) int local63 = 0; local63 < client.anInt3444 * 862418793; local63++) {
					@Pc(72) Class281 local72 = client.aClass281Array1[local63];
					if (local16.aString82.equals(local72.aString153) && local72.anInt3894 * 1928339871 != 0) {
						local61 = true;
						break;
					}
				}
				@Pc(90) boolean local90 = false;
				for (@Pc(92) int local92 = 0; local92 < Class623.anInt5682 * 1581594575; local92++) {
					if (local16.aString82.equals(Class93_Sub1_Sub2.aClass170Array1[local92].aString91)) {
						local90 = true;
						break;
					}
				}
				@Pc(112) boolean local112 = false;
				if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anInt2802 * -1582304709 != 0 && local16.anInt2802 * -1582304709 != 0 && local16.anInt2802 * -1582304709 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anInt2802 * -1582304709) {
					local112 = true;
				}
				if (local16.aClass658_1 != null && local16.aClass658_1.anInt5817 * 1405397749 != -1 && ((Class336) Class162.aClass32_Sub3_2.method18261(local16.aClass658_1.anInt5817 * 1405397749, 800819127)).aBoolean713) {
					Class151.method13981(arg2, arg3, arg4, arg5, local49, local59, Class393.aClass100Array6[1], 1464052313);
				} else if (Class286.aClass286_3 == local16.aClass286_1) {
					Class151.method13981(arg2, arg3, arg4, arg5, local49, local59, Class393.aClass100Array6[8], 1338713154);
				} else if (local16.aClass286_1 == Class286.aClass286_4) {
					Class151.method13981(arg2, arg3, arg4, arg5, local49, local59, Class393.aClass100Array6[6], -1310014597);
				} else if (local112) {
					Class151.method13981(arg2, arg3, arg4, arg5, local49, local59, Class393.aClass100Array6[4], 316387184);
				} else if (local61) {
					Class151.method13981(arg2, arg3, arg4, arg5, local49, local59, Class393.aClass100Array6[3], -1635710993);
				} else if (local16.aBoolean455) {
					Class151.method13981(arg2, arg3, arg4, arg5, local49, local59, Class393.aClass100Array6[7], 1406048052);
				} else if (local90) {
					Class151.method13981(arg2, arg3, arg4, arg5, local49, local59, Class393.aClass100Array6[5], -984847652);
				} else {
					Class151.method13981(arg2, arg3, arg4, arg5, local49, local59, Class393.aClass100Array6[2], 268044382);
				}
			}
		}
	}
}
