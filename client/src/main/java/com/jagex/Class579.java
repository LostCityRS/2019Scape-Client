package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamDeviceCapability;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public class Class579 implements Interface62 {

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "Lclient!auu;")
	final Class132_Sub1_Sub1_Sub6 aClass132_Sub1_Sub1_Sub6_1;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lclient!auu;)V", line = 119)
	Class579(@OriginalArg(0) Class132_Sub1_Sub1_Sub6 arg0) {
		this.aClass132_Sub1_Sub1_Sub6_1 = arg0;
	}

	@OriginalMember(owner = "client!tr", name = "n", descriptor = "(Lclient!ash;)Z", line = 124)
	@Override
	public boolean method31366(@OriginalArg(0) Class132_Sub1_Sub1 arg0) {
		return this.aClass132_Sub1_Sub1_Sub6_1 == arg0;
	}

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "(Lclient!ash;I)Z", line = 124)
	@Override
	public boolean method31367(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		return this.aClass132_Sub1_Sub1_Sub6_1 == arg0;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!yf;I)V", line = 160)
	static void method31368(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(27) TwitchWebcamDevice local27 = Class108_Sub1.method5224(local13, (byte) -12);
		@Pc(29) TwitchWebcamDeviceCapability local29 = null;
		if (local27 != null) {
			local29 = local27.n(local23);
		}
		if (local29 != null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local29.e * -344415541;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local29.n * -959530973;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local29.m * -1121660407;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local29.k * -576563203;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local29.f * -2127096581;
			return;
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
	}

	@OriginalMember(owner = "client!tr", name = "ep", descriptor = "(IB)V", line = 833)
	static void method31369(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		Class93_Sub14.anInt1527 = arg0 * -1845499089;
		Class159_Sub1.anInt1956 = -130712985;
		Class159_Sub1.anInt1951 = -919990023;
		Class358.method27776(-668159149);
	}

	@OriginalMember(owner = "client!tr", name = "ny", descriptor = "(Lclient!yf;B)V", line = 7344)
	static final void method31370(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 857057915);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class129.method21473(local16, local22, arg0, (byte) -54);
	}

	@OriginalMember(owner = "client!tr", name = "im", descriptor = "(I)V", line = 9554)
	static final void method31371(@OriginalArg(0) int arg0) {
		@Pc(2) PacketBit local2 = client.aClass175_2.packet;
		local2.accessBits((byte) -27);
		@Pc(10) int local10 = local2.gBit(8, -495582830);
		@Pc(17) int local17;
		if (local10 < client.anInt3540 * 568731113) {
			for (local17 = local10; local17 < client.anInt3540 * 568731113; local17++) {
				client.anIntArray307[(client.anInt3458 += 1334241841) * 1235627729 - 1] = client.anIntArray323[local17];
			}
		}
		if (local10 > client.anInt3540 * 568731113) {
			throw new RuntimeException();
		}
		client.anInt3540 = 0;
		for (local17 = 0; local17 < local10; local17++) {
			@Pc(58) int local58 = client.anIntArray323[local17];
			@Pc(66) Class132_Sub1_Sub1_Sub1_Sub1 local66 = (Class132_Sub1_Sub1_Sub1_Sub1) ((Class93_Sub15) client.aClass16_18.method214((long) local58)).anObject5;
			@Pc(71) int local71 = local2.gBit(1, 1904817014);
			if (local71 == 0) {
				client.anIntArray323[(client.anInt3540 += 2039022169) * 568731113 - 1] = local58;
				local66.anInt2786 = client.anInt3445 * 848722373;
			} else {
				@Pc(97) int local97 = local2.gBit(2, 1608196776);
				if (local97 == 0) {
					client.anIntArray323[(client.anInt3540 += 2039022169) * 568731113 - 1] = local58;
					local66.anInt2786 = client.anInt3445 * 848722373;
					client.anIntArray306[(client.anInt3472 += -170330519) * 146012633 - 1] = local58;
				} else {
					@Pc(159) Class706 local159;
					if (local97 == 1) {
						client.anIntArray323[(client.anInt3540 += 2039022169) * 568731113 - 1] = local58;
						local66.anInt2786 = client.anInt3445 * 848722373;
						local159 = (Class706) Class107.method18116(Class615.method32072(595145625), local2.gBit(3, 968214772), -1915563430);
						local66.method18602(local159, Class707.aClass707_2.aByte176, -1297597723);
						@Pc(170) int local170 = local2.gBit(1, -2140374239);
						if (local170 == 1) {
							client.anIntArray306[(client.anInt3472 += -170330519) * 146012633 - 1] = local58;
						}
					} else if (local97 == 2) {
						client.anIntArray323[(client.anInt3540 += 2039022169) * 568731113 - 1] = local58;
						local66.anInt2786 = client.anInt3445 * 848722373;
						if (local2.gBit(1, -1532204574) == 1) {
							local159 = (Class706) Class107.method18116(Class615.method32072(529909126), local2.gBit(3, 1450922393), -1915563430);
							local66.method18602(local159, Class707.aClass707_3.aByte176, 57954609);
							@Pc(238) Class706 local238 = (Class706) Class107.method18116(Class615.method32072(1286385669), local2.gBit(3, 553320565), -1915563430);
							local66.method18602(local238, Class707.aClass707_3.aByte176, -26860206);
						} else {
							local159 = (Class706) Class107.method18116(Class615.method32072(1011890412), local2.gBit(3, 2143859615), -1915563430);
							local66.method18602(local159, Class707.aClass707_1.aByte176, -281436130);
						}
						@Pc(266) int local266 = local2.gBit(1, 1563282688);
						if (local266 == 1) {
							client.anIntArray306[(client.anInt3472 += -170330519) * 146012633 - 1] = local58;
						}
					} else if (local97 == 3) {
						client.anIntArray307[(client.anInt3458 += 1334241841) * 1235627729 - 1] = local58;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "ais", descriptor = "(Lclient!yf;I)V", line = 11239)
	static final void method31372(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(17) Class93_Sub1_Sub14 local17 = Class687.aClass514_1.method30267(local12, (byte) 80);
		if (local17.anIntArray260 == null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local17.anIntArray260.length;
		}
	}

	@OriginalMember(owner = "client!tr", name = "aqq", descriptor = "(Lclient!yf;B)V", line = 12843)
	static final void method31373(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= 1189701933;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
	}
}
