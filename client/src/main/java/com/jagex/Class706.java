package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zh")
public final class Class706 {

	@OriginalMember(owner = "client!zh", name = "g", descriptor = "([S)[S")
	public static short[] method37131(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(7) short[] local7 = new short[arg0.length];
			System.arraycopy(arg0, 0, local7, 0, arg0.length);
			return local7;
		}
	}

	@OriginalMember(owner = "client!zh", name = "e", descriptor = "([B)[B")
	public static byte[] method37132(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(7) byte[] local7 = new byte[arg0.length];
			System.arraycopy(arg0, 0, local7, 0, arg0.length);
			return local7;
		}
	}

	@OriginalMember(owner = "client!zh", name = "u", descriptor = "([B)[B")
	public static byte[] method37133(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(7) byte[] local7 = new byte[arg0.length];
			System.arraycopy(arg0, 0, local7, 0, arg0.length);
			return local7;
		}
	}

	@OriginalMember(owner = "client!zh", name = "l", descriptor = "([S)[S")
	public static short[] method37134(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(7) short[] local7 = new short[arg0.length];
			System.arraycopy(arg0, 0, local7, 0, arg0.length);
			return local7;
		}
	}

	@OriginalMember(owner = "client!zh", name = "i", descriptor = "([S)[S")
	public static short[] method37135(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(7) short[] local7 = new short[arg0.length];
			System.arraycopy(arg0, 0, local7, 0, arg0.length);
			return local7;
		}
	}

	@OriginalMember(owner = "client!zh", name = "awp", descriptor = "(Lclient!yp;I)V")
	static void method37136(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (client.anInt3433 * 1994758437 != 13 && client.anInt3433 * 1994758437 != 18 || Class353.method28071(995967159)) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 1;
		} else if (Class47.aBoolean28) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		} else if (Class47.aLong10 * -5301286679800453637L > Class303.currentTimeMillis((byte) 72) - 1000L) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 1;
		} else {
			Class47.aBoolean28 = true;
			@Pc(76) Class75 local76 = Class52.method1074(16777215);
			@Pc(82) Class80_Sub31 local82 = Class623.method32440(Class443.aClass443_79, local76.aClass22_1, -191270971);
			local82.aPacketBit_2.p4(RuntimeException_Sub1.anInt3204 * -1360627077);
			local76.method1325(local82, (byte) -95);
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!zh", name = "gu", descriptor = "(I)V")
	public static void method37137(@OriginalArg(0) int arg0) {
		@Pc(6) Class40 local6 = SecondaryLinkedList.method70("2", client.aClass722_4.aString247, true, -1042851952);
		Class120_Sub1_Sub1_Sub4.aClass110_Sub1_1.method7299(local6, 1354415048);
	}

	@OriginalMember(owner = "client!zh", name = "<init>", descriptor = "()V")
	Class706() throws Throwable {
		throw new Error();
	}
}
