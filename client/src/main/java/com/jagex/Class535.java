package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class535 {

	@OriginalMember(owner = "client!rp", name = "t", descriptor = "I")
	public final int anInt5078;

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
	public final int anInt5080;

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
	public final int anInt5079;

	@OriginalMember(owner = "client!rp", name = "u", descriptor = "I")
	public final int anInt5077;

	@OriginalMember(owner = "client!rp", name = "akq", descriptor = "(Lclient!yp;I)V")
	static void method30853(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(15) Class80_Sub1_Sub12 local15 = Class146.method13874(-1584186611);
		if (local15 != null) {
			@Pc(35) boolean local35 = local15.method22596(local12 >> 28 & 0x3, local12 >> 14 & 0x3FFF, local12 & 0x3FFF, Class681.anIntArray521, (byte) -4);
			if (local35) {
				Class517.method30583(Class681.anIntArray521[1], Class681.anIntArray521[2], -1647951753);
			}
		}
	}

	@OriginalMember(owner = "client!rp", name = "amr", descriptor = "(Lclient!yp;S)V")
	static void method30854(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt5778 -= -664415586;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		if (local13 >= 2) {
			throw new RuntimeException();
		}
		client.anInt3533 = local13 * -1672939165;
		@Pc(34) int local34 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		if (local34 + 1 >= client.anIntArrayArrayArray15[client.anInt3533 * -1416605621].length >> 1) {
			throw new RuntimeException();
		}
		client.anInt3492 = local34 * 895621537;
		client.anInt3493 = 0;
		client.anInt3494 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2] * 1578026899;
		client.anInt3442 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 3] * 1704919167;
		@Pc(90) int local90 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 4];
		if (local90 >= 2) {
			throw new RuntimeException();
		}
		client.anInt3491 = local90 * 1956883921;
		@Pc(111) int local111 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 5];
		if (local111 + 1 >= client.anIntArrayArrayArray15[client.anInt3491 * -1222128847].length >> 1) {
			throw new RuntimeException();
		}
		client.anInt3539 = local111 * -1801419393;
		Class368.anInt4502 = 1209200986;
		Class130_Sub1.anInt1175 = -1464167667;
		Class588.anInt5304 = -503779167;
	}

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "(Lclient!als;IIB)V")
	static void method30855(@OriginalArg(0) Class72_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		arg0.method15590(arg1, (byte) 6);
		@Pc(10) byte local10;
		if (arg2 > 100000) {
			Class673.method33570((short) 16383);
			local10 = 4;
		} else if (arg2 > 50000) {
			Class123_Sub3.method10025(126369314);
			local10 = 3;
		} else if (arg2 > 10000) {
			Class143.method11833(1413071081);
			local10 = 2;
		} else {
			Class59.method1177(true, 1328870525);
			local10 = 1;
		}
		if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(1418013103) == arg1) {
			Class703.aClass80_Sub37_49.method14959(Class703.aClass80_Sub37_49.aClass165_Sub1_2, true, 470442690);
		} else {
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub1_1, arg1, (byte) 56);
			Class528.method30719(arg1, false, 1056740349);
		}
		Class719.method37291(-316185739);
		arg0.method15583(local10, -756928212);
	}

	@OriginalMember(owner = "client!rp", name = "bx", descriptor = "(IIS)B")
	static byte method30856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		if (Class607.aClass607_20.anInt5396 * 1323580581 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rp", name = "bat", descriptor = "(Lclient!yp;I)V")
	static void method30857(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub26_1.method16950(local12, (byte) -102);
	}

	@OriginalMember(owner = "client!rp", name = "os", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method30858(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -2126346893) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray29 = Class431.method29089(local13, arg2, 890944235);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V")
	Class535() {
		this.anInt5078 = ((int) (Math.random() * 4.0D) + 32) * -1911256891;
		this.anInt5080 = ((int) (Math.random() * 2.0D) + 3) * -622192623;
		this.anInt5079 = ((int) (Math.random() * 3.0D) + 16) * 1427226261;
		if (Class703.aClass80_Sub37_49.aClass165_Sub2_1.method15861(1423795933) == 1) {
			this.anInt5077 = (int) (Math.random() * 6.0D) * -599265997;
		} else {
			this.anInt5077 = (int) (Math.random() * 12.0D) * -599265997;
		}
	}

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(IIII)V")
	Class535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5078 = arg0 * -1911256891;
		this.anInt5080 = arg1 * -622192623;
		this.anInt5079 = arg2 * 1427226261;
		this.anInt5077 = arg3 * -599265997;
	}
}
