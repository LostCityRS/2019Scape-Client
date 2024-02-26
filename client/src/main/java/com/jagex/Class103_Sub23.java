package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agx")
public final class Class103_Sub23 extends Class103 {

	@OriginalMember(owner = "client!agx", name = "f", descriptor = "I")
	final int anInt1024;

	@OriginalMember(owner = "client!agx", name = "e", descriptor = "I")
	final int anInt1022;

	@OriginalMember(owner = "client!agx", name = "u", descriptor = "I")
	final int anInt1023;

	@OriginalMember(owner = "client!agx", name = "gz", descriptor = "(Lclient!ad;I)V")
	static void method8699(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class80_Sub31 local5 = Class623.method32440(Class443.aClass443_124, arg0.aClass22_1, -191270971);
		local5.aClass80_Sub36_Sub1_2.method23154(Class17.method437(-1349690784), 1275868335);
		local5.aClass80_Sub36_Sub1_2.method23155(Class80_Sub1_Sub1.anInt254 * -255202897, (byte) -97);
		local5.aClass80_Sub36_Sub1_2.method23155(Class80_Sub25.anInt1627 * 167687103, (byte) -77);
		local5.aClass80_Sub36_Sub1_2.method23154(Class703.aClass80_Sub37_49.aClass165_Sub43_1.method16849(1538334780), 1275868335);
		arg0.method1325(local5, (byte) -109);
	}

	@OriginalMember(owner = "client!agx", name = "jf", descriptor = "(IIIS)V")
	public static void method8700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short arg3) {
		@Pc(3) Class626 local3 = client.aClass539_1.method30893((byte) -125);
		@Pc(10) int local10 = arg1 + local3.anInt5540 * -390642507;
		@Pc(17) int local17 = arg2 + local3.anInt5537 * -894305615;
		if (client.aClass539_1.method30932(-1638462787) == null || client.aClass539_1.method30898((byte) 1) == Class536.aClass536_2 || arg1 < 0 || arg2 < 0 || arg1 >= client.aClass539_1.method30921(1922986069) || arg2 >= client.aClass539_1.method31011(834477916)) {
			return;
		}
		@Pc(52) long local52 = (long) (arg0 << 28 | local17 << 14 | local10);
		@Pc(57) Class80_Sub4 local57 = (Class80_Sub4) client.aClass24_22.method560(local52);
		if (local57 == null) {
			client.aClass539_1.method30932(-1638462787).method31566(arg0, arg1, arg2, (byte) 64);
			return;
		}
		@Pc(76) Class80_Sub9 local76 = (Class80_Sub9) local57.aClass8_18.method247(129206984);
		if (local76 == null) {
			client.aClass539_1.method30932(-1638462787).method31566(arg0, arg1, arg2, (byte) 32);
			return;
		}
		@Pc(91) int local91 = -1;
		@Pc(93) int local93 = -1;
		@Pc(95) int local95 = -1;
		@Pc(97) Class471 local97 = null;
		@Pc(99) Class471 local99 = null;
		@Pc(101) Class471 local101 = null;
		@Pc(111) Class120_Sub1_Sub5_Sub1 local111 = (Class120_Sub1_Sub5_Sub1) client.aClass539_1.method30932(-1638462787).method31566(arg0, arg1, arg2, (byte) 108);
		if (local111 == null) {
			local111 = new Class120_Sub1_Sub5_Sub1(client.aClass539_1.method30932(-1638462787), arg1 << 9, client.aClass539_1.method30932(-1638462787).aClass100Array1[arg0].method2917(arg1, arg2, -212624598), arg2 << 9, arg0, arg0);
		} else {
			local91 = local111.anInt3301 * -1131018903;
			local93 = local111.anInt3300 * 994861483;
			local95 = local111.anInt3302 * -1664747073;
			local97 = local111.aClass471_49;
			local99 = local111.aClass471_50;
			local101 = local111.aClass471_47;
			local111.anInt3302 = -1094121023;
			local111.anInt3300 = 111439613;
			local111.aClass570_23 = client.aClass539_1.method30932(-1638462787);
		}
		local111.anInt3301 = local76.anInt1498 * 1325952629;
		local111.anInt3299 = local76.anInt1497 * -1654177345;
		label98: while (true) {
			@Pc(195) Class80_Sub9 local195 = (Class80_Sub9) local57.aClass8_18.method237(327274010);
			if (local195 == null) {
				break;
			}
			if (local195.anInt1498 * 959158013 != local111.anInt3301 * -1131018903) {
				local111.anInt3300 = local195.anInt1498 * 485954039;
				local111.anInt3305 = local195.anInt1497 * 2036337297;
				while (true) {
					@Pc(226) Class80_Sub9 local226 = (Class80_Sub9) local57.aClass8_18.method237(-1960534712);
					if (local226 == null) {
						break label98;
					}
					if (local111.anInt3301 * -1131018903 != local226.anInt1498 * 959158013 && local226.anInt1498 * 959158013 != local111.anInt3300 * 994861483) {
						local111.anInt3302 = local226.anInt1498 * 187647555;
						local111.anInt3298 = local226.anInt1497 * 247297249;
					}
				}
			}
		}
		@Pc(275) int local275 = Class439.method29150((arg1 << 9) + 256, (arg2 << 9) + 256, arg0, 1037753497);
		local111.method24531((float) (arg1 << 9), (float) local275, (float) (arg2 << 9));
		if (local91 != local111.anInt3301 * -1131018903) {
			if (local111.anInt3301 * -1131018903 == local93) {
				local111.aClass471_49 = local99;
			} else if (local95 == local111.anInt3301 * -1131018903) {
				local111.aClass471_49 = local101;
			} else if (((Class43) Class25.aClass41_Sub9_1.method18054(local111.anInt3301 * -1131018903, -482824533)).aBoolean26) {
				local111.aClass471_49 = Class80_Sub1_Sub5.method21809((short) 11820);
			} else {
				local111.aClass471_49 = null;
			}
		}
		if (local111.anInt3300 * 994861483 == -1) {
			local111.aClass471_50 = null;
		} else if (local93 != local111.anInt3300 * 994861483) {
			if (local111.anInt3300 * 994861483 == local91) {
				local111.aClass471_50 = local97;
			} else if (local95 == local111.anInt3300 * 994861483) {
				local111.aClass471_50 = local101;
			} else if (((Class43) Class25.aClass41_Sub9_1.method18054(local111.anInt3300 * 994861483, 1877180865)).aBoolean26) {
				local111.aClass471_50 = Class80_Sub1_Sub5.method21809((short) 10567);
			} else {
				local111.aClass471_50 = null;
			}
		}
		if (local111.anInt3302 * -1664747073 == -1) {
			local111.aClass471_47 = null;
		} else if (local111.anInt3302 * -1664747073 != local95) {
			if (local91 == local111.anInt3302 * -1664747073) {
				local111.aClass471_47 = local97;
			} else if (local111.anInt3302 * -1664747073 == local93) {
				local111.aClass471_47 = local99;
			} else if (((Class43) Class25.aClass41_Sub9_1.method18054(local111.anInt3302 * -1664747073, 578858564)).aBoolean26) {
				local111.aClass471_47 = Class80_Sub1_Sub5.method21809((short) 8357);
			} else {
				local111.aClass471_47 = null;
			}
		}
		local111.anInt3304 = 0;
		local111.aByte99 = (byte) arg0;
		local111.aByte100 = (byte) arg0;
		if (client.aClass539_1.method30903(-463929735).method30429(arg1, arg2, 1923218923)) {
			local111.aByte100++;
		}
		client.aClass539_1.method30932(-1638462787).method31597(arg0, arg1, arg2, local275, local111, -1319584290);
	}

	@OriginalMember(owner = "client!agx", name = "i", descriptor = "(III)Lclient!asf;")
	public static Class80_Sub1_Sub14 method8701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class331 local5 = (Class331) Class329.aMap18.get(arg0);
		return local5.method27780(arg1, (byte) 7);
	}

	@OriginalMember(owner = "client!agx", name = "bfp", descriptor = "(Lclient!yp;I)V")
	static void method8702(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!agx", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class103_Sub23(@OriginalArg(0) Class80_Sub36 arg0) {
		super(arg0);
		this.anInt1024 = arg0.method23178((byte) -92) * 1020806835;
		this.anInt1022 = arg0.method23178((byte) -111) * 241376385;
		this.anInt1023 = arg0.method23362(-1440443022) * -1803887901;
	}

	@OriginalMember(owner = "client!agx", name = "f", descriptor = "(I)V")
	@Override
	public void method19206(@OriginalArg(0) int arg0) {
		@Pc(6) Class254 local6 = Class251.aClass254Array1[this.anInt1024 * 1968560251];
		@Pc(13) Class239 local13 = Class251.aClass239Array1[this.anInt1022 * 1655251841];
		local13.method26210(local6, this.anInt1023 * -1096860981, (byte) -111);
	}

	@OriginalMember(owner = "client!agx", name = "g", descriptor = "()V")
	@Override
	public void method19202() {
		@Pc(6) Class254 local6 = Class251.aClass254Array1[this.anInt1024 * 1968560251];
		@Pc(13) Class239 local13 = Class251.aClass239Array1[this.anInt1022 * 1655251841];
		local13.method26210(local6, this.anInt1023 * -1096860981, (byte) -40);
	}

	@OriginalMember(owner = "client!agx", name = "l", descriptor = "()V")
	@Override
	public void method19198() {
		@Pc(6) Class254 local6 = Class251.aClass254Array1[this.anInt1024 * 1968560251];
		@Pc(13) Class239 local13 = Class251.aClass239Array1[this.anInt1022 * 1655251841];
		local13.method26210(local6, this.anInt1023 * -1096860981, (byte) -48);
	}
}
