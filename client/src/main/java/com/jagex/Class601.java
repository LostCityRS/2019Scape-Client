package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class601 implements Interface75, Interface65 {

	@OriginalMember(owner = "client!ut", name = "bk", descriptor = "Ljava/lang/String;")
	public static String aString231;

	@OriginalMember(owner = "client!ut", name = "t", descriptor = "Lclient!ut;")
	public static final Class601 aClass601_4 = new Class601(0, "", new Class521[] { Class521.aClass521_65, Class521.aClass521_42 });

	@OriginalMember(owner = "client!ut", name = "f", descriptor = "Lclient!ut;")
	public static final Class601 aClass601_1 = new Class601(1, "", new Class521[] { Class521.aClass521_65, Class521.aClass521_65 });

	@OriginalMember(owner = "client!ut", name = "e", descriptor = "Lclient!ut;")
	public static final Class601 aClass601_2 = new Class601(2, "", new Class521[] { Class521.aClass521_42, Class521.aClass521_42 });

	@OriginalMember(owner = "client!ut", name = "u", descriptor = "Lclient!ut;")
	static final Class601 aClass601_3 = new Class601(3, "", new Class521[] { Class521.aClass521_65, Class521.aClass521_65, Class521.aClass521_42 });

	@OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
	final int anInt5379;

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "[Lclient!qy;")
	final Class521[] aClass521Array2;

	@OriginalMember(owner = "client!ut", name = "sf", descriptor = "(Lclient!yp;I)V")
	static void method32099(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.anInt4148 * -965284535;
	}

	@OriginalMember(owner = "client!ut", name = "aif", descriptor = "(Lclient!yp;I)V")
	static void method32100(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class610.aClass52_2.method1073(local12, 2118802386).method23065((byte) -110);
	}

	@OriginalMember(owner = "client!ut", name = "ajz", descriptor = "(Lclient!yp;B)V")
	static void method32101(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		if (Class544.aClass155_1.method15048(86, (short) 5091)) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 1;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!ut", name = "auv", descriptor = "(Lclient!yp;B)V")
	static void method32102(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub41_1.method16802((byte) 112) == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ut", name = "t", descriptor = "(Lclient!ald;B)Lclient!hc;")
	public static Class308 method32103(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0.g1();
		if (local3 == 0) {
			return null;
		}
		local3--;
		arg0.pos += 1034180571;
		@Pc(19) int local19 = arg0.g4();
		@Pc(22) Object[] local22 = new Object[local3];
		for (@Pc(24) int local24 = 0; local24 < local3; local24++) {
			@Pc(31) int local31 = arg0.g1();
			if (local31 == 0) {
				local22[local24] = Class519.method30594(Integer.class, (byte) 0).method30638(arg0, (short) 961);
			} else if (local31 == 1) {
				local22[local24] = Class519.method30594(String.class, (byte) 0).method30638(arg0, (short) 961);
			} else {
				throw new IllegalStateException("Unrecognised type ID in deserialise: " + local31);
			}
		}
		return new Class308(local19, local22);
	}

	@OriginalMember(owner = "client!ut", name = "u", descriptor = "([[B[[B[B[B[BIII)I")
	static int method32104(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) byte local3 = arg2[arg5];
		@Pc(9) int local9 = arg4[arg5] + local3;
		@Pc(13) byte local13 = arg2[arg6];
		@Pc(19) int local19 = arg4[arg6] + local13;
		@Pc(21) byte local21 = local3;
		if (local13 > local3) {
			local21 = local13;
		}
		@Pc(28) int local28 = local9;
		if (local19 < local9) {
			local28 = local19;
		}
		@Pc(39) int local39 = arg3[arg5] & 0xFF;
		if ((arg3[arg6] & 0xFF) < local39) {
			local39 = arg3[arg6] & 0xFF;
		}
		@Pc(56) byte[] local56 = arg1[arg5];
		@Pc(60) byte[] local60 = arg0[arg6];
		@Pc(64) int local64 = local21 - local3;
		@Pc(68) int local68 = local21 - local13;
		for (@Pc(70) int local70 = local21; local70 < local28; local70++) {
			@Pc(83) int local83 = local56[local64++] + local60[local68++];
			if (local83 < local39) {
				local39 = local83;
			}
		}
		return -local39;
	}

	@OriginalMember(owner = "client!ut", name = "z", descriptor = "(Lclient!arz;Lclient!yp;B)V")
	static void method32105(@OriginalArg(0) Class80_Sub1_Sub11 arg0, @OriginalArg(1) Class690 arg1, @OriginalArg(2) byte arg2) {
		arg1.anIntArray525[(arg1.anInt5778 += 2036747717) * 1896589581 - 1] = Class123_Sub2_Sub3.method20550(arg0, (byte) 83);
		arg1.anObjectArray46[(arg1.anInt5776 += -825189621) * -2070619997 - 1] = ByteArrayPool.method37098(arg0, 936881599);
		arg1.anObjectArray46[(arg1.anInt5776 += -825189621) * -2070619997 - 1] = Class374.method28443(arg0, 729686478);
		arg1.anObjectArray46[(arg1.anInt5776 += -825189621) * -2070619997 - 1] = Class627.method32543(arg0, -482200724);
	}

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(ILjava/lang/String;[Lclient!qy;)V")
	Class601(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class521[] arg2) {
		this.anInt5379 = arg0 * -2053715017;
		this.aClass521Array2 = arg2;
		@Pc(12) Class521[] local12 = this.aClass521Array2;
		@Pc(14) int local14 = 0;
		while (local14 < local12.length) {
			@Pc(22) Class521 local22 = local12[local14];
			switch(local22.aClass519_7.anInt5057 * -647640727) {
				case 0:
				case 1:
				case 2:
				case 3:
				default:
					local14++;
			}
		}
	}

	@OriginalMember(owner = "client!ut", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt5379 * -1057029625;
	}

	@OriginalMember(owner = "client!ut", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt5379 * -1057029625;
	}

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt5379 * -1057029625;
	}
}
