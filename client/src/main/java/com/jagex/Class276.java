package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class276 implements Interface11, Interface5 {

	@OriginalMember(owner = "client!fv", name = "t", descriptor = "[Z")
	public boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!fv", name = "beu", descriptor = "(Lclient!yp;B)V")
	static void method26820(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = local23 >>> 8;
		@Pc(33) int local33 = local23 & 0xFF;
		@Pc(39) Class35 local39 = (Class35) Class80_Sub1_Sub1.aClass41_2.method18054(local13, -1886359170);
		@Pc(45) Class81 local45 = (Class81) Class383.aClass41_3.method18054(local29, 1901608886);
		@Pc(50) Class521[] local50 = local45.aClass521ArrayArray2[local33];
		@Pc(55) Object[] local55 = local39.method756(local33, (byte) -112);
		if (local55 == null && local45.anObjectArrayArray2 != null) {
			local55 = local45.anObjectArrayArray2[local33];
		}
		if (local55 != null) {
			local25 = local55.length / local50.length;
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local25;
	}

	@OriginalMember(owner = "client!fv", name = "hu", descriptor = "(I)V")
	public static void method26821(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 5; local1++) {
			client.aBooleanArray21[local1] = false;
		}
		client.anInt3533 = 1672939165;
		client.anInt3491 = -1956883921;
		Class165_Sub13.anInt2172 = 0;
		Class147_Sub1.anInt1445 = 0;
		Class368.anInt4502 = 1633189263;
		if (Class676.method33586(23963327) == 3) {
			@Pc(28) Class626 local28 = client.aClass539_1.method30893((byte) -47);
			@Pc(35) int local35 = local28.anInt5540 * -390642507 << 9;
			@Pc(42) int local42 = local28.anInt5537 * -894305615 << 9;
			@Pc(47) int local47 = 1000 / Class165_Sub11.method16047((byte) -114);
			Class160.aClass121_Sub1_2.method9675((float) local47 / 1000.0F, client.aClass539_1.method30910((byte) -79).anIntArrayArrayArray14, client.aClass539_1.method30903(-463929735), local35, local42, (byte) -97);
		}
		Class130_Sub1.anInt1175 = -1464167667;
		Class588.anInt5304 = -503779167;
		client.anInt3425 = client.anInt3436 * 1891801039;
		Class656.anInt5677 = Class89.anInt319 * -613974023;
		Class614.anInt5428 = Class283.anInt3937 * 1874485949;
		Class597.anInt5363 = Class102_Sub2.anInt653 * -442810047;
		Class451.anInt4891 = client.anInt3481 * -1017814185;
		Class118.anInt1027 = Class664.anInt5692 * -147266729;
		Class163.anInt2084 = client.anInt3498 * 1654762129;
	}

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "()V")
	Class276() {
	}

	@OriginalMember(owner = "client!fv", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	public void method37009(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			this.method26818(arg0, local3, -2010025547);
		}
	}

	@OriginalMember(owner = "client!fv", name = "m", descriptor = "(Lclient!ald;I)V")
	void method26817(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10;
		@Pc(12) int local12;
		if (arg1 == 2) {
			this.aBooleanArray22 = new boolean[400];
			local10 = arg0.gSmart1or2();
			for (local12 = 0; local12 < local10; local12++) {
				this.aBooleanArray22[arg0.gSmart1or2()] = true;
			}
		} else if (arg1 == 3) {
			arg0.g1();
			local10 = arg0.gSmart1or2();
			for (local12 = 0; local12 < local10; local12++) {
				arg0.gSmart1or2();
				arg0.g1();
			}
		}
	}

	@OriginalMember(owner = "client!fv", name = "l", descriptor = "(Lclient!ald;II)V")
	void method26818(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10;
		@Pc(12) int local12;
		if (arg1 == 2) {
			this.aBooleanArray22 = new boolean[400];
			local10 = arg0.gSmart1or2();
			for (local12 = 0; local12 < local10; local12++) {
				this.aBooleanArray22[arg0.gSmart1or2()] = true;
			}
		} else if (arg1 == 3) {
			arg0.g1();
			local10 = arg0.gSmart1or2();
			for (local12 = 0; local12 < local10; local12++) {
				arg0.gSmart1or2();
				arg0.g1();
			}
		}
	}

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "(B)V")
	@Override
	public void method37007(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "(IS)V")
	@Override
	public void method37014(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
	}

	@OriginalMember(owner = "client!fv", name = "t", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method37006(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			this.method26818(arg0, local3, -2010025547);
		}
	}

	@OriginalMember(owner = "client!fv", name = "i", descriptor = "(Lclient!ald;I)V")
	void method26819(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10;
		@Pc(12) int local12;
		if (arg1 == 2) {
			this.aBooleanArray22 = new boolean[400];
			local10 = arg0.gSmart1or2();
			for (local12 = 0; local12 < local10; local12++) {
				this.aBooleanArray22[arg0.gSmart1or2()] = true;
			}
		} else if (arg1 == 3) {
			arg0.g1();
			local10 = arg0.gSmart1or2();
			for (local12 = 0; local12 < local10; local12++) {
				arg0.gSmart1or2();
				arg0.g1();
			}
		}
	}

	@OriginalMember(owner = "client!fv", name = "o", descriptor = "(I)V")
	@Override
	public void method37010(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "()V")
	@Override
	public void method37008() {
	}

	@OriginalMember(owner = "client!fv", name = "j", descriptor = "(I)V")
	@Override
	public void method37012(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
	@Override
	public void method37013(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!fv", name = "s", descriptor = "(I)V")
	@Override
	public void method37011(@OriginalArg(0) int arg0) {
	}
}
