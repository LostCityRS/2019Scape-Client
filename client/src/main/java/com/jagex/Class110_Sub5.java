package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public class Class110_Sub5 extends Class110 {

	@OriginalMember(owner = "client!aga", name = "n", descriptor = "Ljava/lang/String;")
	final String aString25;

	@OriginalMember(owner = "client!aga", name = "m", descriptor = "I")
	final int anInt893;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lclient!alw;)V", line = 12)
	Class110_Sub5(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.aString25 = arg0.gjstr(65766886);
		this.anInt893 = arg0.g2(-1434290800) * 1312003631;
	}

	@OriginalMember(owner = "client!aga", name = "n", descriptor = "(I)V", line = 18)
	@Override
	public void method20149(@OriginalArg(0) int arg0) {
		if (client.anInt3462 * 1756332913 != -1) {
			Class359.method27789(client.anInt3462 * 1756332913, this.aString25, this.anInt893 * 377188559, 1775744429);
		}
	}

	@OriginalMember(owner = "client!aga", name = "f", descriptor = "()V", line = 18)
	@Override
	public void method20150() {
		if (client.anInt3462 * 1756332913 != -1) {
			Class359.method27789(client.anInt3462 * 1756332913, this.aString25, this.anInt893 * 377188559, 1031300906);
		}
	}

	@OriginalMember(owner = "client!aga", name = "e", descriptor = "(Lclient!ase;I)V", line = 42)
	static final void init(@OriginalArg(0) PacketBit arg0, @OriginalArg(1) int arg1) {
		arg0.accessBits((byte) 48);
		@Pc(6) int local6 = client.selfPlayerSlot * -859840571;
		@Pc(19) Class132_Sub1_Sub1_Sub1_Sub2 local19 = Class520.selfPlayer = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local6] = new Class132_Sub1_Sub1_Sub1_Sub2(client.world.method30481(-1946144137));
		local19.anInt2768 = local6 * 171759809;
		@Pc(29) int local29 = arg0.gBit(30, 1245006124);
		@Pc(34) byte local34 = (byte) (local29 >> 28);
		@Pc(40) int local40 = local29 >> 14 & 0x3FFF;
		@Pc(44) int local44 = local29 & 0x3FFF;
		@Pc(48) Class611 local48 = client.world.method30455(1806933485);
		local19.anIntArray240[0] = local40 - local48.anInt5623 * 270611681;
		local19.anIntArray239[0] = local44 - local48.anInt5624 * -1994307635;
		local19.method24244((float) ((local19.anIntArray240[0] << 9) + (local19.method19986(-79999018) << 8)), local19.method24218().aClass472_61.aFloat318, (float) ((local19.anIntArray239[0] << 9) + (local19.method19986(1449782044) << 8)));
		Class512.anInt5209 = (local19.aByte100 = local19.aByte99 = local34) * -69533369;
		if (client.world.method30487(148494815).method30330(local19.anIntArray240[0], local19.anIntArray239[0], -662808309)) {
			local19.aByte99++;
		}
		if (Class174.aPacketArray2[local6] != null) {
			local19.method20052(Class174.aPacketArray2[local6], 1924398161);
		}
		if (Class174.aPacketArray1[local6] != null) {
			local19.method20055(Class174.aPacketArray1[local6], -1253037716);
		}
		Class174.anInt3293 = 0;
		Class174.anIntArray278[(Class174.anInt3293 += -1190240903) * -1081967415 - 1] = local6;
		Class174.aByteArray63[local6] = 0;
		Class174.anInt3295 = 0;
		for (@Pc(174) int local174 = 1; local174 < 2048; local174++) {
			if (local6 != local174) {
				@Pc(186) int local186 = arg0.gBit(18, 1558012437);
				@Pc(192) int local192 = local186 >> 16 & 0x3;
				@Pc(198) int local198 = local186 >> 8 & 0xFF;
				@Pc(202) int local202 = local186 & 0xFF;
				@Pc(210) Class200 local210 = Class174.aClass200Array1[local174] = new Class200();
				local210.anInt3377 = (local202 + (local192 << 28) + (local198 << 14)) * -1383292861;
				local210.anInt3376 = 0;
				local210.anInt3375 = -1517206021;
				local210.aClass286_2 = Class286.aClass286_5;
				local210.aBoolean578 = false;
				Class174.anIntArray277[(Class174.anInt3295 += -70810673) * 1575920431 - 1] = local174;
				Class174.aByteArray63[local174] = 0;
			}
		}
		arg0.accessBytes(1369108703);
		@Pc(260) Class342 local260 = Class65.aClass123_Sub1_2.method9024(-1662199153);
		if (Class342.aClass342_3 == local260) {
			@Pc(268) Class124_Sub1 local268 = (Class124_Sub1) Class65.aClass123_Sub1_2.method9011((byte) -2);
			local268.method9161((byte) 3);
		}
		@Pc(275) Class338 local275 = Class65.aClass123_Sub1_2.method9020((byte) -104);
		if (Class338.aClass338_4 == local275) {
			@Pc(283) Class25_Sub5 local283 = (Class25_Sub5) Class65.aClass123_Sub1_2.method9017(-1658440067);
			local283.method16477(-998402664);
		}
	}

	@OriginalMember(owner = "client!aga", name = "en", descriptor = "(III)V", line = 958)
	public static void method7655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class159_Sub1.anInt1956 = (arg0 - Class159_Sub1.anInt1915) * 130712985;
		Class159_Sub1.anInt1951 = (arg1 - Class159_Sub1.anInt1921) * 919990023;
	}

	@OriginalMember(owner = "client!aga", name = "ed", descriptor = "(IB)Z", line = 1752)
	static boolean method7656(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return arg0 == 4 || arg0 == 13 || arg0 == 15 || arg0 == 18;
	}

	@OriginalMember(owner = "client!aga", name = "ln", descriptor = "(Lclient!yf;B)V", line = 7107)
	static final void method7657(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class247.method25917(local11, local14, arg0, 1764379247);
	}
}
