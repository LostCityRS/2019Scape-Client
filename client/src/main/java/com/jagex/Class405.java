package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamDeviceCapability;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class405 implements Interface33 {

	@OriginalMember(owner = "client!lt", name = "t", descriptor = "I")
	public final int anInt4593;

	@OriginalMember(owner = "client!lt", name = "f", descriptor = "(IIIIIILclient!vj;I)V")
	static void method28909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class614 arg6, @OriginalArg(7) int arg7) {
		@Pc(1) Class80_Sub8 local1 = null;
		for (@Pc(6) Class80_Sub8 local6 = (Class80_Sub8) Class80_Sub8.aClass8_20.method247(129206984); local6 != null; local6 = (Class80_Sub8) Class80_Sub8.aClass8_20.method237(388880405)) {
			if (arg0 == local6.anInt1478 * -31519745 && local6.anInt1476 * 781975081 == arg1 && arg2 == local6.anInt1473 * -1479987305 && local6.anInt1471 * 119933899 == arg3) {
				local1 = local6;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class80_Sub8();
			local1.anInt1478 = arg0 * 1498477567;
			local1.anInt1471 = arg3 * -1037090333;
			local1.anInt1476 = arg1 * 1808563737;
			local1.anInt1473 = arg2 * -1918091225;
			Class80_Sub8.aClass8_20.method232(local1, 1613257503);
		}
		local1.anInt1477 = arg4 * 1969590945;
		local1.anInt1472 = arg5 * -670378255;
		local1.aClass614_1 = arg6;
		local1.aBoolean337 = true;
		local1.aBoolean338 = false;
	}

	@OriginalMember(owner = "client!lt", name = "aom", descriptor = "(Lclient!yp;I)V")
	static void method28910(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt5778 -= 1815275855;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(46) float local46 = (float) (Math.atan((double) ((float) local13 / 2.0F / (float) local33)) * 2.0D);
		@Pc(59) float local59 = (float) (Math.atan((double) ((float) local23 / 2.0F / (float) local33)) * 2.0D);
		Class160.aClass121_Sub1_2.method9645(local46, local59, 1047425041);
	}

	@OriginalMember(owner = "client!lt", name = "bcn", descriptor = "(Lclient!yp;I)V")
	static void method28911(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!lt", name = "p", descriptor = "(Lclient!yp;I)V")
	static void method28912(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(27) TwitchWebcamDevice local27 = Class578.method31796(local13, -1933815974);
		@Pc(29) TwitchWebcamDeviceCapability local29 = null;
		if (local27 != null) {
			local29 = local27.t(local23);
		}
		if (local29 != null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local29.t * 301056343;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local29.f * -671698919;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local29.e * -1812482537;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local29.u * -1633145387;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local29.l * 1701081943;
			return;
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
	}

	@OriginalMember(owner = "client!lt", name = "afq", descriptor = "(Lclient!yp;B)V")
	static void method28913(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		arg0.anInt5778 -= -221471862;
		@Pc(27) int local27 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(37) int local37 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(43) Class15 local43 = Class317.aClass464_1.method29594(client.anInterface49_1, local37, (byte) 1);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local43.method377(local13, local27, Class344.aClass99Array6, -1247769878);
	}

	@OriginalMember(owner = "client!lt", name = "z", descriptor = "(Lclient!yp;I)V")
	static void method28914(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = ((Class352) Class106.aClass73_Sub1_6.method18054(arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 2], 603858647)).aStringArray27[arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1]];
		arg0.anInt5778 -= -221471862;
	}

	@OriginalMember(owner = "client!lt", name = "arg", descriptor = "(Lclient!yp;I)V")
	static void method28915(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class238.anInt3850 * -1514170191;
	}

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(I)V")
	Class405(@OriginalArg(0) int arg0) {
		this.anInt4593 = arg0 * -455246655;
	}

	@OriginalMember(owner = "client!lt", name = "f", descriptor = "(I)Lclient!kz;")
	@Override
	public Class392 method28942(@OriginalArg(0) int arg0) {
		return Class392.aClass392_7;
	}

	@OriginalMember(owner = "client!lt", name = "l", descriptor = "()Lclient!kz;")
	@Override
	public Class392 method28941() {
		return Class392.aClass392_7;
	}
}
