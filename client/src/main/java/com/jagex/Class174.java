package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public class Class174 {

	@OriginalMember(owner = "client!aw", name = "n", descriptor = "I")
	static final int anInt3294 = 1;

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "I")
	static final int anInt3296 = 2;

	@OriginalMember(owner = "client!aw", name = "uz", descriptor = "I")
	static int anInt3297;

	@OriginalMember(owner = "client!aw", name = "m", descriptor = "[B")
	static byte[] aByteArray63 = new byte[2048];

	@OriginalMember(owner = "client!aw", name = "k", descriptor = "[B")
	static byte[] aByteArray64 = new byte[2048];

	@OriginalMember(owner = "client!aw", name = "f", descriptor = "[Lclient!alw;")
	static Packet[] aPacketArray2 = new Packet[2048];

	@OriginalMember(owner = "client!aw", name = "w", descriptor = "[Lclient!alw;")
	static Packet[] aPacketArray1 = new Packet[2048];

	@OriginalMember(owner = "client!aw", name = "l", descriptor = "I")
	public static int anInt3293 = 0;

	@OriginalMember(owner = "client!aw", name = "u", descriptor = "[I")
	static int[] anIntArray278 = new int[2048];

	@OriginalMember(owner = "client!aw", name = "z", descriptor = "I")
	static int anInt3295 = 0;

	@OriginalMember(owner = "client!aw", name = "p", descriptor = "[I")
	static int[] anIntArray277 = new int[2048];

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "[Lclient!c;")
	static Class200[] aClass200Array1 = new Class200[2048];

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "I")
	static int anInt3292 = 0;

	@OriginalMember(owner = "client!aw", name = "r", descriptor = "[I")
	static int[] anIntArray279 = new int[2048];

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "(IB)I", line = 12)
	public static int method24323(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "(B)[Lclient!wn;", line = 14)
	public static Class641[] method24324(@OriginalArg(0) byte arg0) {
		return new Class641[] { Class641.aClass641_3, Class641.aClass641_2, Class641.aClass641_1 };
	}

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "(B)[Lclient!qj;", line = 14)
	public static Class507[] method24325(@OriginalArg(0) byte arg0) {
		return new Class507[] { Class507.aClass507_4, Class507.aClass507_5, Class507.aClass507_6 };
	}

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "()V", line = 37)
	Class174() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!aw", name = "p", descriptor = "(Lclient!ase;)V", line = 42)
	static final void method24326(@OriginalArg(0) PacketBit arg0) {
		arg0.accessBits((byte) -74);
		@Pc(6) int local6 = client.anInt3513 * -859840571;
		@Pc(19) Class132_Sub1_Sub1_Sub1_Sub2 local19 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local6] = new Class132_Sub1_Sub1_Sub1_Sub2(client.aClass532_1.method30481(-1026292381));
		local19.anInt2768 = local6 * 171759809;
		@Pc(29) int local29 = arg0.gBit(30, 76459257);
		@Pc(34) byte local34 = (byte) (local29 >> 28);
		@Pc(40) int local40 = local29 >> 14 & 0x3FFF;
		@Pc(44) int local44 = local29 & 0x3FFF;
		@Pc(48) Class611 local48 = client.aClass532_1.method30455(2004832834);
		local19.anIntArray240[0] = local40 - local48.anInt5623 * 270611681;
		local19.anIntArray239[0] = local44 - local48.anInt5624 * -1994307635;
		local19.method24244((float) ((local19.anIntArray240[0] << 9) + (local19.method19986(1571372511) << 8)), local19.method24218().aClass472_61.aFloat318, (float) ((local19.anIntArray239[0] << 9) + (local19.method19986(-1886875829) << 8)));
		Class512.anInt5209 = (local19.aByte100 = local19.aByte99 = local34) * -69533369;
		if (client.aClass532_1.method30487(-134831049).method30330(local19.anIntArray240[0], local19.anIntArray239[0], -662808309)) {
			local19.aByte99++;
		}
		if (aPacketArray2[local6] != null) {
			local19.method20052(aPacketArray2[local6], 1871747168);
		}
		if (aPacketArray1[local6] != null) {
			local19.method20055(aPacketArray1[local6], 1267127393);
		}
		anInt3293 = 0;
		anIntArray278[(anInt3293 += -1190240903) * -1081967415 - 1] = local6;
		aByteArray63[local6] = 0;
		anInt3295 = 0;
		for (@Pc(174) int local174 = 1; local174 < 2048; local174++) {
			if (local6 != local174) {
				@Pc(186) int local186 = arg0.gBit(18, -1419874338);
				@Pc(192) int local192 = local186 >> 16 & 0x3;
				@Pc(198) int local198 = local186 >> 8 & 0xFF;
				@Pc(202) int local202 = local186 & 0xFF;
				@Pc(210) Class200 local210 = aClass200Array1[local174] = new Class200();
				local210.anInt3377 = (local202 + (local192 << 28) + (local198 << 14)) * -1383292861;
				local210.anInt3376 = 0;
				local210.anInt3375 = -1517206021;
				local210.aClass286_2 = Class286.aClass286_5;
				local210.aBoolean578 = false;
				anIntArray277[(anInt3295 += -70810673) * 1575920431 - 1] = local174;
				aByteArray63[local174] = 0;
			}
		}
		arg0.accessBytes(1007435066);
		@Pc(260) Class342 local260 = Class65.aClass123_Sub1_2.method9024(-1662199153);
		if (Class342.aClass342_3 == local260) {
			@Pc(268) Class124_Sub1 local268 = (Class124_Sub1) Class65.aClass123_Sub1_2.method9011((byte) -65);
			local268.method9161((byte) 3);
		}
		@Pc(275) Class338 local275 = Class65.aClass123_Sub1_2.method9020((byte) -33);
		if (Class338.aClass338_4 == local275) {
			@Pc(283) Class25_Sub5 local283 = (Class25_Sub5) Class65.aClass123_Sub1_2.method9017(-2101107243);
			local283.method16477(-2128412549);
		}
	}

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "(Lclient!ase;I)V", line = 91)
	static final void method24327(@OriginalArg(0) PacketBit arg0, @OriginalArg(1) int arg1) {
		anInt3292 = 0;
		Class127.method9259(arg0, -2104775823);
		Class1.method11(arg0, (byte) -11);
		if (arg0.pos * 212851357 != arg1) {
			throw new RuntimeException(arg0.pos * 212851357 + " " + arg1);
		}
	}

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "(Lclient!ase;I)V", line = 91)
	static final void method24328(@OriginalArg(0) PacketBit arg0, @OriginalArg(1) int arg1) {
		anInt3292 = 0;
		Class127.method9259(arg0, -227997620);
		Class1.method11(arg0, (byte) -15);
		if (arg0.pos * 212851357 != arg1) {
			throw new RuntimeException(arg0.pos * 212851357 + " " + arg1);
		}
	}

	@OriginalMember(owner = "client!aw", name = "v", descriptor = "(Lclient!ase;)V", line = 100)
	static final void method24329(@OriginalArg(0) PacketBit arg0) {
		@Pc(1) int local1 = 0;
		arg0.accessBits((byte) -38);
		@Pc(6) int local6;
		@Pc(15) int local15;
		@Pc(38) int local38;
		for (local6 = 0; local6 < anInt3293 * -1081967415; local6++) {
			local15 = anIntArray278[local6];
			if ((aByteArray63[local15] & 0x1) == 0) {
				if (local1 > 0) {
					local1--;
					aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
				} else {
					local38 = arg0.gBit(1, -144894545);
					if (local38 == 0) {
						local1 = Class206.method24698(arg0, -1048529910);
						aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
					} else {
						Class93_Sub35.method19706(arg0, local15, (short) 16196);
					}
				}
			}
		}
		arg0.accessBytes(-346448219);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.accessBits((byte) 43);
		for (local6 = 0; local6 < anInt3293 * -1081967415; local6++) {
			local15 = anIntArray278[local6];
			if ((aByteArray63[local15] & 0x1) != 0) {
				if (local1 > 0) {
					local1--;
					aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
				} else {
					local38 = arg0.gBit(1, 1606331061);
					if (local38 == 0) {
						local1 = Class206.method24698(arg0, -1428960522);
						aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
					} else {
						Class93_Sub35.method19706(arg0, local15, (short) 30040);
					}
				}
			}
		}
		arg0.accessBytes(797958978);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.accessBits((byte) -49);
		for (local6 = 0; local6 < anInt3295 * 1575920431; local6++) {
			local15 = anIntArray277[local6];
			if ((aByteArray63[local15] & 0x1) != 0) {
				if (local1 > 0) {
					local1--;
					aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
				} else {
					local38 = arg0.gBit(1, -178180016);
					if (local38 == 0) {
						local1 = Class206.method24698(arg0, -2095833166);
						aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
					} else if (method272(arg0, local15, 1652916632)) {
						aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
					}
				}
			}
		}
		arg0.accessBytes(1964653431);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.accessBits((byte) -69);
		for (local6 = 0; local6 < anInt3295 * 1575920431; local6++) {
			local15 = anIntArray277[local6];
			if ((aByteArray63[local15] & 0x1) == 0) {
				if (local1 > 0) {
					local1--;
					aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
				} else {
					local38 = arg0.gBit(1, 62001750);
					if (local38 == 0) {
						local1 = Class206.method24698(arg0, -1158902776);
						aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
					} else if (method272(arg0, local15, -148091095)) {
						aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
					}
				}
			}
		}
		arg0.accessBytes(1376821618);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		anInt3293 = 0;
		anInt3295 = 0;
		for (local6 = 1; local6 < 2048; local6++) {
			aByteArray63[local6] = (byte) (aByteArray63[local6] >> 1);
			@Pc(314) Class132_Sub1_Sub1_Sub1_Sub2 local314 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local6];
			if (local314 == null) {
				anIntArray277[(anInt3295 += -70810673) * 1575920431 - 1] = local6;
			} else {
				anIntArray278[(anInt3293 += -1190240903) * -1081967415 - 1] = local6;
			}
		}
	}

	@OriginalMember(owner = "client!aw", name = "o", descriptor = "(Lclient!ase;)V", line = 100)
	static final void method24330(@OriginalArg(0) PacketBit arg0) {
		@Pc(1) int local1 = 0;
		arg0.accessBits((byte) -48);
		@Pc(6) int local6;
		@Pc(15) int local15;
		@Pc(38) int local38;
		for (local6 = 0; local6 < anInt3293 * -1081967415; local6++) {
			local15 = anIntArray278[local6];
			if ((aByteArray63[local15] & 0x1) == 0) {
				if (local1 > 0) {
					local1--;
					aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
				} else {
					local38 = arg0.gBit(1, 379096221);
					if (local38 == 0) {
						local1 = Class206.method24698(arg0, -967876728);
						aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
					} else {
						Class93_Sub35.method19706(arg0, local15, (short) 32100);
					}
				}
			}
		}
		arg0.accessBytes(1223182063);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.accessBits((byte) 80);
		for (local6 = 0; local6 < anInt3293 * -1081967415; local6++) {
			local15 = anIntArray278[local6];
			if ((aByteArray63[local15] & 0x1) != 0) {
				if (local1 > 0) {
					local1--;
					aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
				} else {
					local38 = arg0.gBit(1, -403147639);
					if (local38 == 0) {
						local1 = Class206.method24698(arg0, -961968864);
						aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
					} else {
						Class93_Sub35.method19706(arg0, local15, (short) 26045);
					}
				}
			}
		}
		arg0.accessBytes(477340658);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.accessBits((byte) -5);
		for (local6 = 0; local6 < anInt3295 * 1575920431; local6++) {
			local15 = anIntArray277[local6];
			if ((aByteArray63[local15] & 0x1) != 0) {
				if (local1 > 0) {
					local1--;
					aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
				} else {
					local38 = arg0.gBit(1, 1738919649);
					if (local38 == 0) {
						local1 = Class206.method24698(arg0, -1042487968);
						aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
					} else if (method272(arg0, local15, 1488410228)) {
						aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
					}
				}
			}
		}
		arg0.accessBytes(-328480192);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.accessBits((byte) -18);
		for (local6 = 0; local6 < anInt3295 * 1575920431; local6++) {
			local15 = anIntArray277[local6];
			if ((aByteArray63[local15] & 0x1) == 0) {
				if (local1 > 0) {
					local1--;
					aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
				} else {
					local38 = arg0.gBit(1, -115858759);
					if (local38 == 0) {
						local1 = Class206.method24698(arg0, -2084526245);
						aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
					} else if (method272(arg0, local15, 1527906565)) {
						aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
					}
				}
			}
		}
		arg0.accessBytes(-2005494454);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		anInt3293 = 0;
		anInt3295 = 0;
		for (local6 = 1; local6 < 2048; local6++) {
			aByteArray63[local6] = (byte) (aByteArray63[local6] >> 1);
			@Pc(314) Class132_Sub1_Sub1_Sub1_Sub2 local314 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local6];
			if (local314 == null) {
				anIntArray277[(anInt3295 += -70810673) * 1575920431 - 1] = local6;
			} else {
				anIntArray278[(anInt3293 += -1190240903) * -1081967415 - 1] = local6;
			}
		}
	}

	@OriginalMember(owner = "client!aw", name = "r", descriptor = "(Lclient!ase;)V", line = 100)
	static final void method24331(@OriginalArg(0) PacketBit arg0) {
		@Pc(1) int local1 = 0;
		arg0.accessBits((byte) -29);
		@Pc(6) int local6;
		@Pc(15) int local15;
		@Pc(38) int local38;
		for (local6 = 0; local6 < anInt3293 * -1081967415; local6++) {
			local15 = anIntArray278[local6];
			if ((aByteArray63[local15] & 0x1) == 0) {
				if (local1 > 0) {
					local1--;
					aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
				} else {
					local38 = arg0.gBit(1, -1628167421);
					if (local38 == 0) {
						local1 = Class206.method24698(arg0, -1837702129);
						aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
					} else {
						Class93_Sub35.method19706(arg0, local15, (short) 24085);
					}
				}
			}
		}
		arg0.accessBytes(871800367);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.accessBits((byte) -2);
		for (local6 = 0; local6 < anInt3293 * -1081967415; local6++) {
			local15 = anIntArray278[local6];
			if ((aByteArray63[local15] & 0x1) != 0) {
				if (local1 > 0) {
					local1--;
					aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
				} else {
					local38 = arg0.gBit(1, 1547781716);
					if (local38 == 0) {
						local1 = Class206.method24698(arg0, -2080747546);
						aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
					} else {
						Class93_Sub35.method19706(arg0, local15, (short) 21590);
					}
				}
			}
		}
		arg0.accessBytes(1818217574);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.accessBits((byte) 74);
		for (local6 = 0; local6 < anInt3295 * 1575920431; local6++) {
			local15 = anIntArray277[local6];
			if ((aByteArray63[local15] & 0x1) != 0) {
				if (local1 > 0) {
					local1--;
					aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
				} else {
					local38 = arg0.gBit(1, -34721795);
					if (local38 == 0) {
						local1 = Class206.method24698(arg0, -1682887288);
						aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
					} else if (method272(arg0, local15, 766986022)) {
						aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
					}
				}
			}
		}
		arg0.accessBytes(844438065);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.accessBits((byte) -10);
		for (local6 = 0; local6 < anInt3295 * 1575920431; local6++) {
			local15 = anIntArray277[local6];
			if ((aByteArray63[local15] & 0x1) == 0) {
				if (local1 > 0) {
					local1--;
					aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
				} else {
					local38 = arg0.gBit(1, -1480212297);
					if (local38 == 0) {
						local1 = Class206.method24698(arg0, -1872803424);
						aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
					} else if (method272(arg0, local15, 1327962612)) {
						aByteArray63[local15] = (byte) (aByteArray63[local15] | 0x2);
					}
				}
			}
		}
		arg0.accessBytes(421542502);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		anInt3293 = 0;
		anInt3295 = 0;
		for (local6 = 1; local6 < 2048; local6++) {
			aByteArray63[local6] = (byte) (aByteArray63[local6] >> 1);
			@Pc(314) Class132_Sub1_Sub1_Sub1_Sub2 local314 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local6];
			if (local314 == null) {
				anIntArray277[(anInt3295 += -70810673) * 1575920431 - 1] = local6;
			} else {
				anIntArray278[(anInt3293 += -1190240903) * -1081967415 - 1] = local6;
			}
		}
	}

	@OriginalMember(owner = "client!aw", name = "x", descriptor = "(Lclient!ase;)I", line = 200)
	static int method24332(@OriginalArg(0) PacketBit arg0) {
		@Pc(4) int local4 = arg0.gBit(2, -1335779831);
		@Pc(8) int local8;
		if (local4 == 0) {
			local8 = 0;
		} else if (local4 == 1) {
			local8 = arg0.gBit(5, 316702070);
		} else if (local4 == 2) {
			local8 = arg0.gBit(8, -1921259231);
		} else {
			local8 = arg0.gBit(11, 68950717);
		}
		return local8;
	}

	@OriginalMember(owner = "client!aw", name = "y", descriptor = "(Lclient!ase;)I", line = 200)
	static int method24333(@OriginalArg(0) PacketBit arg0) {
		@Pc(4) int local4 = arg0.gBit(2, -1050585559);
		@Pc(8) int local8;
		if (local4 == 0) {
			local8 = 0;
		} else if (local4 == 1) {
			local8 = arg0.gBit(5, 1392535358);
		} else if (local4 == 2) {
			local8 = arg0.gBit(8, -230620747);
		} else {
			local8 = arg0.gBit(11, 1502586789);
		}
		return local8;
	}

	@OriginalMember(owner = "client!aw", name = "s", descriptor = "(Lclient!ase;)I", line = 200)
	static int method24334(@OriginalArg(0) PacketBit arg0) {
		@Pc(4) int local4 = arg0.gBit(2, -341542139);
		@Pc(8) int local8;
		if (local4 == 0) {
			local8 = 0;
		} else if (local4 == 1) {
			local8 = arg0.gBit(5, 71790937);
		} else if (local4 == 2) {
			local8 = arg0.gBit(8, 627027368);
		} else {
			local8 = arg0.gBit(11, -937869452);
		}
		return local8;
	}

	@OriginalMember(owner = "client!aw", name = "q", descriptor = "(Lclient!ase;)I", line = 200)
	static int method24335(@OriginalArg(0) PacketBit arg0) {
		@Pc(4) int local4 = arg0.gBit(2, 637159262);
		@Pc(8) int local8;
		if (local4 == 0) {
			local8 = 0;
		} else if (local4 == 1) {
			local8 = arg0.gBit(5, -1121675553);
		} else if (local4 == 2) {
			local8 = arg0.gBit(8, 629400868);
		} else {
			local8 = arg0.gBit(11, -1912263171);
		}
		return local8;
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(Lclient!ase;I)V", line = 210)
	static void method24336(@OriginalArg(0) PacketBit arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class611 local3 = client.aClass532_1.method30455(2056483808);
		@Pc(13) boolean local13 = arg0.gBit(1, 975798686) == 1;
		if (local13) {
			anIntArray279[(anInt3292 += 981825405) * 2140666325 - 1] = arg1;
		}
		@Pc(32) int local32 = arg0.gBit(2, -60762421);
		@Pc(36) Class132_Sub1_Sub1_Sub1_Sub2 local36 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		if (local32 != 0) {
			@Pc(162) int local162;
			@Pc(167) int local167;
			@Pc(172) int local172;
			@Pc(177) int local177;
			@Pc(190) int local190;
			if (local32 == 1) {
				local162 = arg0.gBit(3, 2054311349);
				local167 = arg0.gBit(1, -1526668382);
				local172 = local36.anIntArray240[0];
				local177 = local36.anIntArray239[0];
				if (local167 == 1) {
					aByteArray64[arg1] = Class707.aClass707_3.aByte176;
					local190 = arg0.gBit(2, -1685725386);
					switch(local190) {
						case 0:
							local36.method20074(local172, local177 + 1, aByteArray64[arg1], (byte) 24);
							break;
						case 1:
							local36.method20074(local172 - 1, local177, aByteArray64[arg1], (byte) 79);
							break;
						case 2:
							local36.method20074(local172 + 1, local177, aByteArray64[arg1], (byte) 19);
							break;
						case 3:
							local36.method20074(local172, local177 - 1, aByteArray64[arg1], (byte) 81);
					}
				}
				if (local162 == 0) {
					local172--;
					local177--;
				} else if (local162 == 1) {
					local177--;
				} else if (local162 == 2) {
					local172++;
					local177--;
				} else if (local162 == 3) {
					local172--;
				} else if (local162 == 4) {
					local172++;
				} else if (local162 == 5) {
					local172--;
					local177++;
				} else if (local162 == 6) {
					local177++;
				} else if (local162 == 7) {
					local172++;
					local177++;
				}
				local36.method20074(local172, local177, aByteArray64[arg1], (byte) 124);
			} else if (local32 == 2) {
				local162 = arg0.gBit(4, -626256186);
				local167 = local36.anIntArray240[0];
				local172 = local36.anIntArray239[0];
				if (local162 == 0) {
					local167 -= 2;
					local172 -= 2;
				} else if (local162 == 1) {
					local167--;
					local172 -= 2;
				} else if (local162 == 2) {
					local172 -= 2;
				} else if (local162 == 3) {
					local167++;
					local172 -= 2;
				} else if (local162 == 4) {
					local167 += 2;
					local172 -= 2;
				} else if (local162 == 5) {
					local167 -= 2;
					local172--;
				} else if (local162 == 6) {
					local167 += 2;
					local172--;
				} else if (local162 == 7) {
					local167 -= 2;
				} else if (local162 == 8) {
					local167 += 2;
				} else if (local162 == 9) {
					local167 -= 2;
					local172++;
				} else if (local162 == 10) {
					local167 += 2;
					local172++;
				} else if (local162 == 11) {
					local167 -= 2;
					local172 += 2;
				} else if (local162 == 12) {
					local167--;
					local172 += 2;
				} else if (local162 == 13) {
					local172 += 2;
				} else if (local162 == 14) {
					local167++;
					local172 += 2;
				} else if (local162 == 15) {
					local167 += 2;
					local172 += 2;
				}
				local36.method20074(local167, local172, aByteArray64[arg1], (byte) 80);
			} else {
				local162 = arg0.gBit(1, 1778819141);
				@Pc(442) int local442;
				@Pc(453) int local453;
				@Pc(460) int local460;
				if (local162 == 0) {
					local167 = arg0.gBit(15, -467881558);
					local172 = local167 >> 12 & 0x7;
					local177 = (byte) (local167 >> 10) & 0x3;
					local190 = local167 >> 5 & 0x1F;
					if (local190 > 15) {
						local190 -= 32;
					}
					local442 = local167 & 0x1F;
					if (local442 > 15) {
						local442 -= 32;
					}
					local453 = local190 + local36.anIntArray240[0];
					local460 = local442 + local36.anIntArray239[0];
					if (local172 == Class707.aClass707_4.anInt5958 * -793472015) {
						local36.method20076(local453, local460, (byte) 1);
					} else {
						aByteArray64[arg1] = (byte) (local172 - 1);
						local36.method20074(local453, local460, aByteArray64[arg1], (byte) 98);
					}
					local36.aByte100 = local36.aByte99 = (byte) (local36.aByte100 + local177 & 0x3);
					if (client.aClass532_1.method30487(28535818).method30330(local453, local460, -662808309)) {
						local36.aByte99++;
					}
					if (client.anInt3513 * -859840571 == arg1 && Class512.anInt5209 * 1177442423 != local36.aByte100) {
						Class512.anInt5209 = local36.aByte100 * -69533369;
					}
				} else {
					local167 = arg0.gBit(3, 1140643232);
					local172 = arg0.gBit(30, 1780242456);
					local177 = local172 >> 28 & 0x3;
					local190 = local172 >> 14 & 0x3FFF;
					local442 = local172 & 0x3FFF;
					local453 = (local36.anIntArray240[0] + local3.anInt5623 * 270611681 + local190 & 0x3FFF) - local3.anInt5623 * 270611681;
					local460 = (local442 + local3.anInt5624 * -1994307635 + local36.anIntArray239[0] & 0x3FFF) - local3.anInt5624 * -1994307635;
					if (local167 == Class707.aClass707_4.anInt5958 * -793472015) {
						local36.method20076(local453, local460, (byte) 1);
					} else {
						aByteArray64[arg1] = (byte) (local167 - 1);
						local36.method20074(local453, local460, aByteArray64[arg1], (byte) 53);
					}
					local36.aByte100 = local36.aByte99 = (byte) (local177 + local36.aByte100 & 0x3);
					if (client.aClass532_1.method30487(938095035).method30330(local453, local460, -662808309)) {
						local36.aByte99++;
					}
					if (client.anInt3513 * -859840571 == arg1) {
						Class512.anInt5209 = local36.aByte100 * -69533369;
					}
				}
			}
		} else if (!local13) {
			if (client.anInt3513 * -859840571 == arg1) {
				throw new RuntimeException();
			}
			@Pc(59) Class200 local59 = aClass200Array1[arg1] = new Class200();
			Class707.method36744(64827022);
			local59.anInt3377 = ((local3.anInt5623 * 270611681 + local36.anIntArray240[0] >> 6 << 14) + (local36.aByte100 << 28) + (local36.anIntArray239[0] + -1994307635 * local3.anInt5624 >> 6)) * -1383292861;
			if (local36.anInt2799 * 1643784853 == -1) {
				local59.anInt3376 = local36.aClass523_7.method30365(2064844087) * -373179301;
			} else {
				local59.anInt3376 = local36.anInt2799 * 1116180215;
			}
			local59.anInt3375 = local36.anInt2772 * 1830096795;
			local59.aClass286_2 = local36.aClass286_1;
			local59.aBoolean578 = local36.aBoolean455;
			if (local36.anInt2807 * -1513940767 > 0) {
				Class378.method28071(local36, -1314427900);
			}
			client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[arg1] = null;
			if (arg0.gBit(1, 1225254888) != 0) {
				method272(arg0, arg1, 947624255);
			}
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!ase;I)V", line = 210)
	static void method24337(@OriginalArg(0) PacketBit arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class611 local3 = client.aClass532_1.method30455(1704593589);
		@Pc(13) boolean local13 = arg0.gBit(1, 600260686) == 1;
		if (local13) {
			anIntArray279[(anInt3292 += 981825405) * 2140666325 - 1] = arg1;
		}
		@Pc(32) int local32 = arg0.gBit(2, 1033547960);
		@Pc(36) Class132_Sub1_Sub1_Sub1_Sub2 local36 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		if (local32 != 0) {
			@Pc(162) int local162;
			@Pc(167) int local167;
			@Pc(172) int local172;
			@Pc(177) int local177;
			@Pc(190) int local190;
			if (local32 == 1) {
				local162 = arg0.gBit(3, 528330519);
				local167 = arg0.gBit(1, 658464332);
				local172 = local36.anIntArray240[0];
				local177 = local36.anIntArray239[0];
				if (local167 == 1) {
					aByteArray64[arg1] = Class707.aClass707_3.aByte176;
					local190 = arg0.gBit(2, -805648229);
					switch(local190) {
						case 0:
							local36.method20074(local172, local177 + 1, aByteArray64[arg1], (byte) 29);
							break;
						case 1:
							local36.method20074(local172 - 1, local177, aByteArray64[arg1], (byte) 48);
							break;
						case 2:
							local36.method20074(local172 + 1, local177, aByteArray64[arg1], (byte) 22);
							break;
						case 3:
							local36.method20074(local172, local177 - 1, aByteArray64[arg1], (byte) 86);
					}
				}
				if (local162 == 0) {
					local172--;
					local177--;
				} else if (local162 == 1) {
					local177--;
				} else if (local162 == 2) {
					local172++;
					local177--;
				} else if (local162 == 3) {
					local172--;
				} else if (local162 == 4) {
					local172++;
				} else if (local162 == 5) {
					local172--;
					local177++;
				} else if (local162 == 6) {
					local177++;
				} else if (local162 == 7) {
					local172++;
					local177++;
				}
				local36.method20074(local172, local177, aByteArray64[arg1], (byte) 99);
			} else if (local32 == 2) {
				local162 = arg0.gBit(4, 804032430);
				local167 = local36.anIntArray240[0];
				local172 = local36.anIntArray239[0];
				if (local162 == 0) {
					local167 -= 2;
					local172 -= 2;
				} else if (local162 == 1) {
					local167--;
					local172 -= 2;
				} else if (local162 == 2) {
					local172 -= 2;
				} else if (local162 == 3) {
					local167++;
					local172 -= 2;
				} else if (local162 == 4) {
					local167 += 2;
					local172 -= 2;
				} else if (local162 == 5) {
					local167 -= 2;
					local172--;
				} else if (local162 == 6) {
					local167 += 2;
					local172--;
				} else if (local162 == 7) {
					local167 -= 2;
				} else if (local162 == 8) {
					local167 += 2;
				} else if (local162 == 9) {
					local167 -= 2;
					local172++;
				} else if (local162 == 10) {
					local167 += 2;
					local172++;
				} else if (local162 == 11) {
					local167 -= 2;
					local172 += 2;
				} else if (local162 == 12) {
					local167--;
					local172 += 2;
				} else if (local162 == 13) {
					local172 += 2;
				} else if (local162 == 14) {
					local167++;
					local172 += 2;
				} else if (local162 == 15) {
					local167 += 2;
					local172 += 2;
				}
				local36.method20074(local167, local172, aByteArray64[arg1], (byte) 21);
			} else {
				local162 = arg0.gBit(1, -845586229);
				@Pc(442) int local442;
				@Pc(453) int local453;
				@Pc(460) int local460;
				if (local162 == 0) {
					local167 = arg0.gBit(15, 836555898);
					local172 = local167 >> 12 & 0x7;
					local177 = (byte) (local167 >> 10) & 0x3;
					local190 = local167 >> 5 & 0x1F;
					if (local190 > 15) {
						local190 -= 32;
					}
					local442 = local167 & 0x1F;
					if (local442 > 15) {
						local442 -= 32;
					}
					local453 = local190 + local36.anIntArray240[0];
					local460 = local442 + local36.anIntArray239[0];
					if (local172 == Class707.aClass707_4.anInt5958 * -793472015) {
						local36.method20076(local453, local460, (byte) 1);
					} else {
						aByteArray64[arg1] = (byte) (local172 - 1);
						local36.method20074(local453, local460, aByteArray64[arg1], (byte) 57);
					}
					local36.aByte100 = local36.aByte99 = (byte) (local36.aByte100 + local177 & 0x3);
					if (client.aClass532_1.method30487(1792384093).method30330(local453, local460, -662808309)) {
						local36.aByte99++;
					}
					if (client.anInt3513 * -859840571 == arg1 && Class512.anInt5209 * 1177442423 != local36.aByte100) {
						Class512.anInt5209 = local36.aByte100 * -69533369;
					}
				} else {
					local167 = arg0.gBit(3, -2085650135);
					local172 = arg0.gBit(30, 965681783);
					local177 = local172 >> 28 & 0x3;
					local190 = local172 >> 14 & 0x3FFF;
					local442 = local172 & 0x3FFF;
					local453 = (local36.anIntArray240[0] + local3.anInt5623 * 270611681 + local190 & 0x3FFF) - local3.anInt5623 * 270611681;
					local460 = (local442 + local3.anInt5624 * -1994307635 + local36.anIntArray239[0] & 0x3FFF) - local3.anInt5624 * -1994307635;
					if (local167 == Class707.aClass707_4.anInt5958 * -793472015) {
						local36.method20076(local453, local460, (byte) 1);
					} else {
						aByteArray64[arg1] = (byte) (local167 - 1);
						local36.method20074(local453, local460, aByteArray64[arg1], (byte) 72);
					}
					local36.aByte100 = local36.aByte99 = (byte) (local177 + local36.aByte100 & 0x3);
					if (client.aClass532_1.method30487(305897231).method30330(local453, local460, -662808309)) {
						local36.aByte99++;
					}
					if (client.anInt3513 * -859840571 == arg1) {
						Class512.anInt5209 = local36.aByte100 * -69533369;
					}
				}
			}
		} else if (!local13) {
			if (client.anInt3513 * -859840571 == arg1) {
				throw new RuntimeException();
			}
			@Pc(59) Class200 local59 = aClass200Array1[arg1] = new Class200();
			Class707.method36744(-361255961);
			local59.anInt3377 = ((local3.anInt5623 * 270611681 + local36.anIntArray240[0] >> 6 << 14) + (local36.aByte100 << 28) + (local36.anIntArray239[0] + -1994307635 * local3.anInt5624 >> 6)) * -1383292861;
			if (local36.anInt2799 * 1643784853 == -1) {
				local59.anInt3376 = local36.aClass523_7.method30365(-1148370382) * -373179301;
			} else {
				local59.anInt3376 = local36.anInt2799 * 1116180215;
			}
			local59.anInt3375 = local36.anInt2772 * 1830096795;
			local59.aClass286_2 = local36.aClass286_1;
			local59.aBoolean578 = local36.aBoolean455;
			if (local36.anInt2807 * -1513940767 > 0) {
				Class378.method28071(local36, -1314427900);
			}
			client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[arg1] = null;
			if (arg0.gBit(1, -1879828558) != 0) {
				method272(arg0, arg1, 1913646215);
			}
		}
	}

	@OriginalMember(owner = "client!aw", name = "h", descriptor = "(Lclient!ase;I)V", line = 210)
	static void method24338(@OriginalArg(0) PacketBit arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class611 local3 = client.aClass532_1.method30455(1939578511);
		@Pc(13) boolean local13 = arg0.gBit(1, 254314335) == 1;
		if (local13) {
			anIntArray279[(anInt3292 += 981825405) * 2140666325 - 1] = arg1;
		}
		@Pc(32) int local32 = arg0.gBit(2, -1026209959);
		@Pc(36) Class132_Sub1_Sub1_Sub1_Sub2 local36 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		if (local32 != 0) {
			@Pc(162) int local162;
			@Pc(167) int local167;
			@Pc(172) int local172;
			@Pc(177) int local177;
			@Pc(190) int local190;
			if (local32 == 1) {
				local162 = arg0.gBit(3, -100741815);
				local167 = arg0.gBit(1, -805702270);
				local172 = local36.anIntArray240[0];
				local177 = local36.anIntArray239[0];
				if (local167 == 1) {
					aByteArray64[arg1] = Class707.aClass707_3.aByte176;
					local190 = arg0.gBit(2, -1027596188);
					switch(local190) {
						case 0:
							local36.method20074(local172, local177 + 1, aByteArray64[arg1], (byte) 76);
							break;
						case 1:
							local36.method20074(local172 - 1, local177, aByteArray64[arg1], (byte) 66);
							break;
						case 2:
							local36.method20074(local172 + 1, local177, aByteArray64[arg1], (byte) 117);
							break;
						case 3:
							local36.method20074(local172, local177 - 1, aByteArray64[arg1], (byte) 116);
					}
				}
				if (local162 == 0) {
					local172--;
					local177--;
				} else if (local162 == 1) {
					local177--;
				} else if (local162 == 2) {
					local172++;
					local177--;
				} else if (local162 == 3) {
					local172--;
				} else if (local162 == 4) {
					local172++;
				} else if (local162 == 5) {
					local172--;
					local177++;
				} else if (local162 == 6) {
					local177++;
				} else if (local162 == 7) {
					local172++;
					local177++;
				}
				local36.method20074(local172, local177, aByteArray64[arg1], (byte) 31);
			} else if (local32 == 2) {
				local162 = arg0.gBit(4, -1556389661);
				local167 = local36.anIntArray240[0];
				local172 = local36.anIntArray239[0];
				if (local162 == 0) {
					local167 -= 2;
					local172 -= 2;
				} else if (local162 == 1) {
					local167--;
					local172 -= 2;
				} else if (local162 == 2) {
					local172 -= 2;
				} else if (local162 == 3) {
					local167++;
					local172 -= 2;
				} else if (local162 == 4) {
					local167 += 2;
					local172 -= 2;
				} else if (local162 == 5) {
					local167 -= 2;
					local172--;
				} else if (local162 == 6) {
					local167 += 2;
					local172--;
				} else if (local162 == 7) {
					local167 -= 2;
				} else if (local162 == 8) {
					local167 += 2;
				} else if (local162 == 9) {
					local167 -= 2;
					local172++;
				} else if (local162 == 10) {
					local167 += 2;
					local172++;
				} else if (local162 == 11) {
					local167 -= 2;
					local172 += 2;
				} else if (local162 == 12) {
					local167--;
					local172 += 2;
				} else if (local162 == 13) {
					local172 += 2;
				} else if (local162 == 14) {
					local167++;
					local172 += 2;
				} else if (local162 == 15) {
					local167 += 2;
					local172 += 2;
				}
				local36.method20074(local167, local172, aByteArray64[arg1], (byte) 64);
			} else {
				local162 = arg0.gBit(1, 1219406039);
				@Pc(442) int local442;
				@Pc(453) int local453;
				@Pc(460) int local460;
				if (local162 == 0) {
					local167 = arg0.gBit(15, -930382657);
					local172 = local167 >> 12 & 0x7;
					local177 = (byte) (local167 >> 10) & 0x3;
					local190 = local167 >> 5 & 0x1F;
					if (local190 > 15) {
						local190 -= 32;
					}
					local442 = local167 & 0x1F;
					if (local442 > 15) {
						local442 -= 32;
					}
					local453 = local190 + local36.anIntArray240[0];
					local460 = local442 + local36.anIntArray239[0];
					if (local172 == Class707.aClass707_4.anInt5958 * -793472015) {
						local36.method20076(local453, local460, (byte) 1);
					} else {
						aByteArray64[arg1] = (byte) (local172 - 1);
						local36.method20074(local453, local460, aByteArray64[arg1], (byte) 91);
					}
					local36.aByte100 = local36.aByte99 = (byte) (local36.aByte100 + local177 & 0x3);
					if (client.aClass532_1.method30487(390804325).method30330(local453, local460, -662808309)) {
						local36.aByte99++;
					}
					if (client.anInt3513 * -859840571 == arg1 && Class512.anInt5209 * 1177442423 != local36.aByte100) {
						Class512.anInt5209 = local36.aByte100 * -69533369;
					}
				} else {
					local167 = arg0.gBit(3, 1821231761);
					local172 = arg0.gBit(30, -293891491);
					local177 = local172 >> 28 & 0x3;
					local190 = local172 >> 14 & 0x3FFF;
					local442 = local172 & 0x3FFF;
					local453 = (local36.anIntArray240[0] + local3.anInt5623 * 270611681 + local190 & 0x3FFF) - local3.anInt5623 * 270611681;
					local460 = (local442 + local3.anInt5624 * -1994307635 + local36.anIntArray239[0] & 0x3FFF) - local3.anInt5624 * -1994307635;
					if (local167 == Class707.aClass707_4.anInt5958 * -793472015) {
						local36.method20076(local453, local460, (byte) 1);
					} else {
						aByteArray64[arg1] = (byte) (local167 - 1);
						local36.method20074(local453, local460, aByteArray64[arg1], (byte) 103);
					}
					local36.aByte100 = local36.aByte99 = (byte) (local177 + local36.aByte100 & 0x3);
					if (client.aClass532_1.method30487(-1252147202).method30330(local453, local460, -662808309)) {
						local36.aByte99++;
					}
					if (client.anInt3513 * -859840571 == arg1) {
						Class512.anInt5209 = local36.aByte100 * -69533369;
					}
				}
			}
		} else if (!local13) {
			if (client.anInt3513 * -859840571 == arg1) {
				throw new RuntimeException();
			}
			@Pc(59) Class200 local59 = aClass200Array1[arg1] = new Class200();
			Class707.method36744(-938111458);
			local59.anInt3377 = ((local3.anInt5623 * 270611681 + local36.anIntArray240[0] >> 6 << 14) + (local36.aByte100 << 28) + (local36.anIntArray239[0] + -1994307635 * local3.anInt5624 >> 6)) * -1383292861;
			if (local36.anInt2799 * 1643784853 == -1) {
				local59.anInt3376 = local36.aClass523_7.method30365(266975307) * -373179301;
			} else {
				local59.anInt3376 = local36.anInt2799 * 1116180215;
			}
			local59.anInt3375 = local36.anInt2772 * 1830096795;
			local59.aClass286_2 = local36.aClass286_1;
			local59.aBoolean578 = local36.aBoolean455;
			if (local36.anInt2807 * -1513940767 > 0) {
				Class378.method28071(local36, -1314427900);
			}
			client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[arg1] = null;
			if (arg0.gBit(1, -666387071) != 0) {
				method272(arg0, arg1, 1696685381);
			}
		}
	}

	@OriginalMember(owner = "client!aw", name = "w", descriptor = "(IIIIIIFZI)[[I", line = 218)
	public static int[][] method24339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int[][] local3 = new int[arg1][arg0];
		@Pc(7) Class93_Sub38_Sub1 local7 = new Class93_Sub38_Sub1();
		local7.aBoolean509 = arg7;
		local7.anInt3102 = arg3 * -1746277229;
		local7.anInt3101 = arg4 * 476450465;
		local7.anInt3104 = arg5 * 445855015;
		local7.anInt3106 = (int) (arg6 * 4096.0F) * 1868074503;
		local7.method22791(-911752065);
		Class66.method1189(arg0, arg1, 1215367215);
		for (@Pc(42) int local42 = 0; local42 < arg1; local42++) {
			local7.method22783(local42, local3[local42], -1240746179);
		}
		return local3;
	}

	@OriginalMember(owner = "client!aap", name = "w", descriptor = "(Lclient!ase;II)Z", line = 381)
	static boolean method272(@OriginalArg(0) PacketBit arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg0.gBit(2, -1249348482);
		@Pc(22) int local22;
		@Pc(27) int local27;
		@Pc(121) int local121;
		@Pc(125) int local125;
		@Pc(131) int local131;
		@Pc(135) int local135;
		if (local4 == 0) {
			if (arg0.gBit(1, 2022185544) != 0) {
				method272(arg0, arg1, 1181703894);
			}
			local22 = arg0.gBit(6, -1897194506);
			local27 = arg0.gBit(6, -2059073893);
			@Pc(37) boolean local37 = arg0.gBit(1, 1372140904) == 1;
			if (local37) {
				anIntArray279[(anInt3292 += 981825405) * 2140666325 - 1] = arg1;
			}
			if (client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[arg1] != null) {
				throw new RuntimeException();
			}
			@Pc(64) Class200 local64 = aClass200Array1[arg1];
			@Pc(75) Class132_Sub1_Sub1_Sub1_Sub2 local75 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[arg1] = new Class132_Sub1_Sub1_Sub1_Sub2(client.aClass532_1.method30481(-1820788427));
			local75.anInt2768 = arg1 * 171759809;
			if (aPacketArray2[arg1] != null) {
				local75.method20052(aPacketArray2[arg1], 2070630033);
			}
			if (aPacketArray1[arg1] != null) {
				local75.method20055(aPacketArray1[arg1], -1086348893);
			}
			local75.method19953(local64.anInt3376 * -659221549, true, -1693723577);
			local75.anInt2772 = local64.anInt3375 * 715767443;
			local121 = local64.anInt3377 * -930829205;
			local125 = local121 >> 28;
			local131 = local121 >> 14 & 0xFF;
			local135 = local121 & 0xFF;
			@Pc(139) Class611 local139 = client.aClass532_1.method30455(1759915115);
			@Pc(150) int local150 = (local131 << 6) + local22 - local139.anInt5623 * 270611681;
			@Pc(161) int local161 = (local135 << 6) + local27 - local139.anInt5624 * -1994307635;
			local75.aClass286_1 = local64.aClass286_2;
			local75.aBoolean455 = local64.aBoolean578;
			local75.aByteArray47[0] = aByteArray64[arg1];
			local75.aByte100 = local75.aByte99 = (byte) local125;
			if (client.aClass532_1.method30487(-277650001).method30330(local150, local161, -662808309)) {
				local75.aByte99++;
			}
			local75.method20076(local150, local161, (byte) 1);
			aClass200Array1[arg1] = null;
			return true;
		} else if (local4 == 1) {
			local22 = arg0.gBit(2, 1384763225);
			local27 = aClass200Array1[arg1].anInt3377 * -930829205;
			aClass200Array1[arg1].anInt3377 = ((local27 & 0xFFFFFFF) + ((local22 + (local27 >> 28) & 0x3) << 28)) * -1383292861;
			return false;
		} else {
			@Pc(263) int local263;
			@Pc(270) int local270;
			@Pc(293) int local293;
			if (local4 != 2) {
				local22 = arg0.gBit(20, -675729298);
				local27 = local22 >> 18 & 0x3;
				local263 = local22 >> 16 & 0x3;
				local270 = local22 >> 8 & 0xFF;
				local293 = local22 & 0xFF;
				local121 = aClass200Array1[arg1].anInt3377 * -930829205;
				aByteArray64[arg1] = (byte) (local27 - 1);
				if (Class174.class.desiredAssertionStatus() && (aByteArray64[arg1] < 0 || aByteArray64[arg1] > 3)) {
					throw new AssertionError();
				}
				local125 = (local121 >> 28) + local263 & 0x3;
				local131 = (local121 >> 14) + local270 & 0xFF;
				local135 = local121 + local293 & 0xFF;
				Class107.method18116(Class707.method36744(1375636269), local27 - 1, -1915563430);
				aClass200Array1[arg1].anInt3377 = ((local125 << 28) + (local131 << 14) + local135) * -1383292861;
				return false;
			}
			local22 = arg0.gBit(5, 1000755576);
			local27 = local22 >> 3 & 0x3;
			local263 = local22 & 0x7;
			local270 = aClass200Array1[arg1].anInt3377 * -930829205;
			if (Class174.class.desiredAssertionStatus() && (aByteArray64[arg1] < 0 || aByteArray64[arg1] > 3)) {
				throw new AssertionError();
			}
			local293 = local27 + (local270 >> 28) & 0x3;
			local121 = local270 >> 14 & 0xFF;
			local125 = local270 & 0xFF;
			if (local263 == 0) {
				local121--;
				local125--;
			}
			if (local263 == 1) {
				local125--;
			}
			if (local263 == 2) {
				local121++;
				local125--;
			}
			if (local263 == 3) {
				local121--;
			}
			if (local263 == 4) {
				local121++;
			}
			if (local263 == 5) {
				local121--;
				local125++;
			}
			if (local263 == 6) {
				local125++;
			}
			if (local263 == 7) {
				local121++;
				local125++;
			}
			Class107.method18116(Class707.method36744(945261972), aByteArray64[arg1], -1915563430);
			aClass200Array1[arg1].anInt3377 = (local125 + (local293 << 28) + (local121 << 14)) * -1383292861;
			return false;
		}
	}

	@OriginalMember(owner = "client!aw", name = "i", descriptor = "(Lclient!ase;I)Z", line = 381)
	static boolean method24340(@OriginalArg(0) PacketBit arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0.gBit(2, 1497627492);
		@Pc(22) int local22;
		@Pc(27) int local27;
		@Pc(121) int local121;
		@Pc(125) int local125;
		@Pc(131) int local131;
		@Pc(135) int local135;
		if (local4 == 0) {
			if (arg0.gBit(1, -88941345) != 0) {
				method272(arg0, arg1, 1873578642);
			}
			local22 = arg0.gBit(6, -1382405167);
			local27 = arg0.gBit(6, 592612901);
			@Pc(37) boolean local37 = arg0.gBit(1, -1226235022) == 1;
			if (local37) {
				anIntArray279[(anInt3292 += 981825405) * 2140666325 - 1] = arg1;
			}
			if (client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[arg1] != null) {
				throw new RuntimeException();
			}
			@Pc(64) Class200 local64 = aClass200Array1[arg1];
			@Pc(75) Class132_Sub1_Sub1_Sub1_Sub2 local75 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[arg1] = new Class132_Sub1_Sub1_Sub1_Sub2(client.aClass532_1.method30481(-1728665426));
			local75.anInt2768 = arg1 * 171759809;
			if (aPacketArray2[arg1] != null) {
				local75.method20052(aPacketArray2[arg1], 1895540878);
			}
			if (aPacketArray1[arg1] != null) {
				local75.method20055(aPacketArray1[arg1], -559674232);
			}
			local75.method19953(local64.anInt3376 * -659221549, true, -669893771);
			local75.anInt2772 = local64.anInt3375 * 715767443;
			local121 = local64.anInt3377 * -930829205;
			local125 = local121 >> 28;
			local131 = local121 >> 14 & 0xFF;
			local135 = local121 & 0xFF;
			@Pc(139) Class611 local139 = client.aClass532_1.method30455(1794401190);
			@Pc(150) int local150 = (local131 << 6) + local22 - local139.anInt5623 * 270611681;
			@Pc(161) int local161 = (local135 << 6) + local27 - local139.anInt5624 * -1994307635;
			local75.aClass286_1 = local64.aClass286_2;
			local75.aBoolean455 = local64.aBoolean578;
			local75.aByteArray47[0] = aByteArray64[arg1];
			local75.aByte100 = local75.aByte99 = (byte) local125;
			if (client.aClass532_1.method30487(-1744543974).method30330(local150, local161, -662808309)) {
				local75.aByte99++;
			}
			local75.method20076(local150, local161, (byte) 1);
			aClass200Array1[arg1] = null;
			return true;
		} else if (local4 == 1) {
			local22 = arg0.gBit(2, 1921476564);
			local27 = aClass200Array1[arg1].anInt3377 * -930829205;
			aClass200Array1[arg1].anInt3377 = ((local27 & 0xFFFFFFF) + ((local22 + (local27 >> 28) & 0x3) << 28)) * -1383292861;
			return false;
		} else {
			@Pc(263) int local263;
			@Pc(270) int local270;
			@Pc(293) int local293;
			if (local4 != 2) {
				local22 = arg0.gBit(20, -1163828491);
				local27 = local22 >> 18 & 0x3;
				local263 = local22 >> 16 & 0x3;
				local270 = local22 >> 8 & 0xFF;
				local293 = local22 & 0xFF;
				local121 = aClass200Array1[arg1].anInt3377 * -930829205;
				aByteArray64[arg1] = (byte) (local27 - 1);
				assert aByteArray64[arg1] >= 0 && aByteArray64[arg1] <= 3;
				local125 = (local121 >> 28) + local263 & 0x3;
				local131 = (local121 >> 14) + local270 & 0xFF;
				local135 = local121 + local293 & 0xFF;
				Class107.method18116(Class707.method36744(710127512), local27 - 1, -1915563430);
				aClass200Array1[arg1].anInt3377 = ((local125 << 28) + (local131 << 14) + local135) * -1383292861;
				return false;
			}
			local22 = arg0.gBit(5, -1394861101);
			local27 = local22 >> 3 & 0x3;
			local263 = local22 & 0x7;
			local270 = aClass200Array1[arg1].anInt3377 * -930829205;
			assert aByteArray64[arg1] >= 0 && aByteArray64[arg1] <= 3;
			local293 = local27 + (local270 >> 28) & 0x3;
			local121 = local270 >> 14 & 0xFF;
			local125 = local270 & 0xFF;
			if (local263 == 0) {
				local121--;
				local125--;
			}
			if (local263 == 1) {
				local125--;
			}
			if (local263 == 2) {
				local121++;
				local125--;
			}
			if (local263 == 3) {
				local121--;
			}
			if (local263 == 4) {
				local121++;
			}
			if (local263 == 5) {
				local121--;
				local125++;
			}
			if (local263 == 6) {
				local125++;
			}
			if (local263 == 7) {
				local121++;
				local125++;
			}
			Class107.method18116(Class707.method36744(1393758394), aByteArray64[arg1], -1915563430);
			aClass200Array1[arg1].anInt3377 = (local125 + (local293 << 28) + (local121 << 14)) * -1383292861;
			return false;
		}
	}

	@OriginalMember(owner = "client!aw", name = "g", descriptor = "(Lclient!ase;I)Z", line = 381)
	static boolean method24341(@OriginalArg(0) PacketBit arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0.gBit(2, 212836289);
		@Pc(22) int local22;
		@Pc(27) int local27;
		@Pc(121) int local121;
		@Pc(125) int local125;
		@Pc(131) int local131;
		@Pc(135) int local135;
		if (local4 == 0) {
			if (arg0.gBit(1, 1237863832) != 0) {
				method272(arg0, arg1, 1570497275);
			}
			local22 = arg0.gBit(6, 113393332);
			local27 = arg0.gBit(6, -1529800174);
			@Pc(37) boolean local37 = arg0.gBit(1, 284161233) == 1;
			if (local37) {
				anIntArray279[(anInt3292 += 981825405) * 2140666325 - 1] = arg1;
			}
			if (client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[arg1] != null) {
				throw new RuntimeException();
			}
			@Pc(64) Class200 local64 = aClass200Array1[arg1];
			@Pc(75) Class132_Sub1_Sub1_Sub1_Sub2 local75 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[arg1] = new Class132_Sub1_Sub1_Sub1_Sub2(client.aClass532_1.method30481(-1973199699));
			local75.anInt2768 = arg1 * 171759809;
			if (aPacketArray2[arg1] != null) {
				local75.method20052(aPacketArray2[arg1], 1863137915);
			}
			if (aPacketArray1[arg1] != null) {
				local75.method20055(aPacketArray1[arg1], -172484488);
			}
			local75.method19953(local64.anInt3376 * -659221549, true, -58666409);
			local75.anInt2772 = local64.anInt3375 * 715767443;
			local121 = local64.anInt3377 * -930829205;
			local125 = local121 >> 28;
			local131 = local121 >> 14 & 0xFF;
			local135 = local121 & 0xFF;
			@Pc(139) Class611 local139 = client.aClass532_1.method30455(1755854464);
			@Pc(150) int local150 = (local131 << 6) + local22 - local139.anInt5623 * 270611681;
			@Pc(161) int local161 = (local135 << 6) + local27 - local139.anInt5624 * -1994307635;
			local75.aClass286_1 = local64.aClass286_2;
			local75.aBoolean455 = local64.aBoolean578;
			local75.aByteArray47[0] = aByteArray64[arg1];
			local75.aByte100 = local75.aByte99 = (byte) local125;
			if (client.aClass532_1.method30487(-61075162).method30330(local150, local161, -662808309)) {
				local75.aByte99++;
			}
			local75.method20076(local150, local161, (byte) 1);
			aClass200Array1[arg1] = null;
			return true;
		} else if (local4 == 1) {
			local22 = arg0.gBit(2, 1024024432);
			local27 = aClass200Array1[arg1].anInt3377 * -930829205;
			aClass200Array1[arg1].anInt3377 = ((local27 & 0xFFFFFFF) + ((local22 + (local27 >> 28) & 0x3) << 28)) * -1383292861;
			return false;
		} else {
			@Pc(263) int local263;
			@Pc(270) int local270;
			@Pc(293) int local293;
			if (local4 != 2) {
				local22 = arg0.gBit(20, 1064324246);
				local27 = local22 >> 18 & 0x3;
				local263 = local22 >> 16 & 0x3;
				local270 = local22 >> 8 & 0xFF;
				local293 = local22 & 0xFF;
				local121 = aClass200Array1[arg1].anInt3377 * -930829205;
				aByteArray64[arg1] = (byte) (local27 - 1);
				assert aByteArray64[arg1] >= 0 && aByteArray64[arg1] <= 3;
				local125 = (local121 >> 28) + local263 & 0x3;
				local131 = (local121 >> 14) + local270 & 0xFF;
				local135 = local121 + local293 & 0xFF;
				Class107.method18116(Class707.method36744(1364621876), local27 - 1, -1915563430);
				aClass200Array1[arg1].anInt3377 = ((local125 << 28) + (local131 << 14) + local135) * -1383292861;
				return false;
			}
			local22 = arg0.gBit(5, 484011803);
			local27 = local22 >> 3 & 0x3;
			local263 = local22 & 0x7;
			local270 = aClass200Array1[arg1].anInt3377 * -930829205;
			assert aByteArray64[arg1] >= 0 && aByteArray64[arg1] <= 3;
			local293 = local27 + (local270 >> 28) & 0x3;
			local121 = local270 >> 14 & 0xFF;
			local125 = local270 & 0xFF;
			if (local263 == 0) {
				local121--;
				local125--;
			}
			if (local263 == 1) {
				local125--;
			}
			if (local263 == 2) {
				local121++;
				local125--;
			}
			if (local263 == 3) {
				local121--;
			}
			if (local263 == 4) {
				local121++;
			}
			if (local263 == 5) {
				local121--;
				local125++;
			}
			if (local263 == 6) {
				local125++;
			}
			if (local263 == 7) {
				local121++;
				local125++;
			}
			Class107.method18116(Class707.method36744(-1521778318), aByteArray64[arg1], -1915563430);
			aClass200Array1[arg1].anInt3377 = (local125 + (local293 << 28) + (local121 << 14)) * -1383292861;
			return false;
		}
	}

	@OriginalMember(owner = "client!aw", name = "j", descriptor = "(Lclient!ase;)V", line = 472)
	static final void method24342(@OriginalArg(0) PacketBit arg0) {
		for (@Pc(1) int local1 = 0; local1 < anInt3292 * 2140666325; local1++) {
			arg0.g2(-1434290800);
			@Pc(14) int local14 = anIntArray279[local1];
			@Pc(18) Class132_Sub1_Sub1_Sub1_Sub2 local18 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local14];
			@Pc(22) int local22 = arg0.g1((short) 16384);
			if ((local22 & 0x40) != 0) {
				local22 += arg0.g1((short) 16384) << 8;
			}
			if ((local22 & 0x1000) != 0) {
				local22 += arg0.g1((short) 16384) << 16;
			}
			Class534.method30625(arg0, local14, local18, local22, 414306194);
		}
	}

	@OriginalMember(owner = "client!aw", name = "t", descriptor = "(Lclient!ase;)V", line = 472)
	static final void method24343(@OriginalArg(0) PacketBit arg0) {
		for (@Pc(1) int local1 = 0; local1 < anInt3292 * 2140666325; local1++) {
			arg0.g2(-1434290800);
			@Pc(14) int local14 = anIntArray279[local1];
			@Pc(18) Class132_Sub1_Sub1_Sub1_Sub2 local18 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local14];
			@Pc(22) int local22 = arg0.g1((short) 16384);
			if ((local22 & 0x40) != 0) {
				local22 += arg0.g1((short) 16384) << 8;
			}
			if ((local22 & 0x1000) != 0) {
				local22 += arg0.g1((short) 16384) << 16;
			}
			Class534.method30625(arg0, local14, local18, local22, 414306194);
		}
	}

	@OriginalMember(owner = "client!aw", name = "ae", descriptor = "(Lclient!ase;ILclient!aqk;I)V", line = 484)
	static final void method24344(@OriginalArg(0) PacketBit arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class132_Sub1_Sub1_Sub1_Sub2 arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8;
		if ((arg3 & 0x80) != 0) {
			@Pc(6) int[] local6 = new int[4];
			for (local8 = 0; local8 < 4; local8++) {
				local6[local8] = arg0.gSmart2or4null(-1532836275);
			}
			local8 = arg0.g1_alt2(1601136230);
			Class623.method32150(arg2, local6, local8, false, 74518649);
		}
		@Pc(66) int local66;
		@Pc(73) Class500 local73;
		@Pc(79) Class466 local79;
		@Pc(57) int local57;
		if ((arg3 & 0x40000) != 0) {
			arg0.pos += 1403713386;
			local57 = arg0.data[(arg0.pos += -1445626955) * 212851357 - 1] & 0xFF;
			for (local8 = 0; local8 < local57; local8++) {
				local66 = arg0.g1_alt3(1249200523);
				local73 = (Class500) Class107.method18116(Class500.method30156(-1842025323), local66, -1915563430);
				local79 = Class21.aClass79_Sub1_Sub1_1.method1470(arg0, local73, (byte) 1);
				arg2.anInterface3_5.method776(local79.anInt5092 * -1181855333, local79.anObject19, (byte) 72);
			}
		}
		if ((arg3 & 0x10) != 0) {
			arg2.anInt2799 = arg0.g2_alt3(16711680) * 1224757437;
			if (arg2.anInt2763 * -846948133 == 0) {
				arg2.method19951(arg2.anInt2799 * 1643784853, (byte) 117);
				arg2.anInt2799 = -1224757437;
			}
		}
		if ((arg3 & 0x10000) != 0) {
			arg2.aBoolean455 = arg0.g1_alt3(1433969165) == 1;
		}
		@Pc(155) int local155;
		@Pc(151) int local151;
		@Pc(170) int local170;
		if ((arg3 & 0x20) != 0) {
			local57 = arg0.g1_alt1(1922783035);
			@Pc(197) int local197;
			if (local57 > 0) {
				for (local8 = 0; local8 < local57; local8++) {
					local151 = -1;
					@Pc(153) boolean local153 = true;
					local155 = -1;
					local66 = arg0.gSmart1or2((byte) -39);
					if (local66 == 32767) {
						local66 = arg0.gSmart1or2((byte) -70);
						local170 = arg0.gSmart1or2((byte) -66);
						local151 = arg0.gSmart1or2((byte) -111);
						local155 = arg0.gSmart1or2((byte) -101);
					} else if (local66 == 32766) {
						local66 = -1;
						local170 = arg0.g1((short) 16384);
					} else {
						local170 = arg0.gSmart1or2((byte) -70);
					}
					local197 = arg0.gSmart1or2((byte) -35);
					arg2.method19972(local66, local170, local151, local155, client.anInt3485, local197, -1983976110);
				}
			}
			local8 = arg0.g1_alt3(1992262277);
			if (local8 > 0) {
				for (local66 = 0; local66 < local8; local66++) {
					local151 = arg0.gSmart1or2((byte) -8);
					local170 = arg0.gSmart1or2((byte) -99);
					if (local170 == 32767) {
						arg2.method19977(local151, -1286239838);
					} else {
						local155 = arg0.gSmart1or2((byte) -80);
						local197 = arg0.g1_alt3(1372916805);
						@Pc(246) int local246 = local170 > 0 ? arg0.g1_alt2(1467557360) : local197;
						arg2.method19976(local151, client.anInt3485, local170, local155, local197, local246, 1804055066);
					}
				}
			}
		}
		@Pc(274) int[] local274;
		@Pc(277) int[] local277;
		if ((arg3 & 0x8000) != 0) {
			local57 = arg0.g1_alt3(1412390262);
			local274 = new int[local57];
			local277 = new int[local57];
			@Pc(280) int[] local280 = new int[local57];
			for (local170 = 0; local170 < local57; local170++) {
				local274[local170] = arg0.gSmart2or4null(-221997059);
				local277[local170] = arg0.g1_alt1(1714650891);
				local280[local170] = arg0.g2_alt3(16711680);
			}
			Class133_Sub1.method10075(arg2, local274, local277, local280, (short) -11022);
		}
		@Pc(359) boolean local359;
		if ((arg3 & 0x100000) != 0) {
			local57 = arg0.g2_alt3(16711680);
			local8 = arg0.g4_alt1(-745846880);
			if (local57 == 65535) {
				local57 = -1;
			}
			local66 = arg0.g1_alt1(1439867545);
			local151 = local66 & 0x7;
			local170 = local66 >> 3 & 0xF;
			if (local170 == 15) {
				local170 = -1;
			}
			local359 = (local66 >> 7 & 0x1) == 1;
			arg2.method19967(local57, local8, local151, local170, local359, 4, (byte) -28);
		}
		@Pc(379) byte[] local379;
		@Pc(384) Packet local384;
		if ((arg3 & 0x4) != 0) {
			local57 = arg0.g1_alt1(1513485820);
			local379 = new byte[local57];
			local384 = new Packet(local379);
			arg0.gdata_alt2(local379, 0, local57, -1878385553);
			aPacketArray2[arg1] = local384;
			arg2.method20052(local384, 2100772978);
		}
		if ((arg3 & 0x80000) != 0) {
			local57 = arg0.g1_alt1(1006424998);
			local274 = new int[local57];
			local277 = new int[local57];
			for (local151 = 0; local151 < local57; local151++) {
				local170 = arg0.g2_alt1(1877739255);
				if ((local170 & 0xC000) == 49152) {
					local155 = arg0.g2_alt1(1557861274);
					local274[local151] = local170 << 16 | local155;
				} else {
					local274[local151] = local170;
				}
				local277[local151] = arg0.g2_alt2(1960941632);
			}
			arg2.method19957(local274, local277, 586855086);
		}
		if ((arg3 & 0x2000) != 0) {
			local57 = arg0.g2(-1434290800);
			local8 = arg0.g4_alt2(1573716082);
			if (local57 == 65535) {
				local57 = -1;
			}
			local66 = arg0.g1_alt1(1471199558);
			local151 = local66 & 0x7;
			local170 = local66 >> 3 & 0xF;
			if (local170 == 15) {
				local170 = -1;
			}
			local359 = (local66 >> 7 & 0x1) == 1;
			arg2.method19967(local57, local8, local151, local170, local359, 2, (byte) -86);
		}
		if ((arg3 & 0x2) != 0) {
			local57 = arg0.g2_alt3(16711680);
			local8 = arg0.g4_alt3(-28140331);
			if (local57 == 65535) {
				local57 = -1;
			}
			local66 = arg0.g1_alt1(1009308650);
			local151 = local66 & 0x7;
			local170 = local66 >> 3 & 0xF;
			if (local170 == 15) {
				local170 = -1;
			}
			local359 = (local66 >> 7 & 0x1) == 1;
			arg2.method19967(local57, local8, local151, local170, local359, 0, (byte) -25);
		}
		if ((arg3 & 0x800) != 0) {
			local57 = arg0.g1((short) 16384);
			local379 = new byte[local57];
			local384 = new Packet(local379);
			arg0.gdata_alt1(local379, 0, local57, (byte) 98);
			aPacketArray1[arg1] = local384;
			arg2.method20055(local384, 359635020);
		}
		if ((arg3 & 0x20000) != 0) {
			arg2.anInterface3_5.method777(1656154432);
			arg0.pos += 1403713386;
			local57 = arg0.data[(arg0.pos += -1445626955) * 212851357 - 1] & 0xFF;
			for (local8 = 0; local8 < local57; local8++) {
				local66 = arg0.g1_alt3(2050003278);
				local73 = (Class500) Class107.method18116(Class500.method30156(-2004547610), local66, -1915563430);
				local79 = Class21.aClass79_Sub1_Sub1_1.method1470(arg0, local73, (byte) 1);
				arg2.anInterface3_5.method776(local79.anInt5092 * -1181855333, local79.anObject19, (byte) 69);
			}
		}
		@Pc(673) String local673;
		if ((arg3 & 0x200) != 0) {
			local673 = arg0.gjstr(1541581729);
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == arg2) {
				Class227.method25612(2, 0, arg2.method20069(true, (byte) 6), arg2.method20072(false, 2091353777), arg2.aString81, local673, null, -1886986456);
			}
			arg2.method20089(local673, 0, 0, -1685399895);
		}
		if ((arg3 & 0x8) != 0) {
			arg2.anInt2775 = arg0.g1b_alt2(-1988114859) * -1449351677;
			arg2.anInt2777 = arg0.g1b(681678586) * -2034096445;
			arg2.anInt2793 = arg0.g1b_alt2(1963322713) * -688148243;
			arg2.anInt2778 = arg0.g1b_alt1((byte) 71) * 501346955;
			arg2.anInt2773 = arg0.g1b_alt1((byte) 103) * -1861667641;
			arg2.anInt2779 = arg0.g1b(591446904) * -1832474127;
			arg2.anInt2780 = (arg0.g2_alt3(16711680) + client.anInt3485) * 755240883;
			arg2.anInt2762 = (arg0.g2_alt1(756891666) + client.anInt3485) * 1838812733;
			arg2.anInt2782 = arg0.g2_alt1(704699618) * 862199857;
			arg2.anInt2763 = 1975362387;
			arg2.anInt2760 = 0;
			arg2.anInt2775 += arg2.anIntArray240[0] * -1449351677;
			arg2.anInt2777 += arg2.anIntArray239[0] * -2034096445;
			arg2.anInt2793 += arg2.anIntArray240[0] * -688148243;
			arg2.anInt2778 += arg2.anIntArray239[0] * 501346955;
			arg2.anInt2773 += arg2.aByte100 * -1861667641;
			arg2.anInt2779 += arg2.aByte100 * -1832474127;
		}
		if ((arg3 & 0x1) != 0) {
			local57 = arg0.g2(-1434290800);
			if (local57 == 65535) {
				local57 = -1;
			}
			arg2.anInt2772 = local57 * -1158576417;
		}
		if ((arg3 & 0x800000) != 0) {
			arg2.aByte71 = arg0.g1b_alt2(14201012);
			arg2.aByte72 = arg0.g1b_alt3(-1763905107);
			arg2.aByte73 = arg0.g1b_alt2(-384198214);
			arg2.aByte74 = (byte) arg0.g1_alt1(1210674380);
			arg2.anInt2789 = (client.anInt3485 + arg0.g2(-1434290800)) * 782633717;
			arg2.anInt2796 = (client.anInt3485 + arg0.g2(-1434290800)) * 1198097015;
		}
		if ((arg3 & 0x400) != 0) {
			arg2.aClass286_1 = (Class286) Class107.method18116(Class286.method26522((byte) 8), arg0.g1_alt2(793852712), -1915563430);
			if (arg2.aClass286_1 == null) {
				arg2.aClass286_1 = Class286.aClass286_5;
			}
		}
		if ((arg3 & 0x100) != 0) {
			local57 = arg0.g2_alt3(16711680);
			local8 = arg0.g4_alt2(517487288);
			if (local57 == 65535) {
				local57 = -1;
			}
			local66 = arg0.g1_alt2(545328039);
			local151 = local66 & 0x7;
			local170 = local66 >> 3 & 0xF;
			if (local170 == 15) {
				local170 = -1;
			}
			local359 = (local66 >> 7 & 0x1) == 1;
			arg2.method19967(local57, local8, local151, local170, local359, 1, (byte) -99);
		}
		if ((arg3 & 0x200000) != 0) {
			local673 = arg0.gjstr(2097079512);
			local8 = arg0.g1((short) 16384);
			if ((local8 & 0x1) != 0) {
				Class227.method25612(2, local8, arg2.method20069(true, (byte) 20), arg2.method20072(false, 2091353777), arg2.aString81, local673, null, -1873248631);
			}
			arg2.method20089(local673, 0, 0, -1685399895);
		}
		if ((arg3 & 0x400000) == 0) {
			return;
		}
		local57 = arg0.g2_alt3(16711680);
		local8 = arg0.g4(-118643075);
		if (local57 == 65535) {
			local57 = -1;
		}
		local66 = arg0.g1_alt1(1490418732);
		local151 = local66 & 0x7;
		local170 = local66 >> 3 & 0xF;
		if (local170 == 15) {
			local170 = -1;
		}
		local359 = (local66 >> 7 & 0x1) == 1;
		arg2.method19967(local57, local8, local151, local170, local359, 3, (byte) -75);
	}

	@OriginalMember(owner = "client!aw", name = "ag", descriptor = "()V", line = 712)
	static void method24345() {
		anInt3293 = 0;
		for (@Pc(3) int local3 = 0; local3 < 2048; local3++) {
			aPacketArray2[local3] = null;
			aPacketArray1[local3] = null;
			aByteArray64[local3] = Class707.aClass707_2.aByte176;
			aClass200Array1[local3] = null;
		}
	}

	@OriginalMember(owner = "client!aw", name = "ah", descriptor = "()V", line = 712)
	static void method24346() {
		anInt3293 = 0;
		for (@Pc(3) int local3 = 0; local3 < 2048; local3++) {
			aPacketArray2[local3] = null;
			aPacketArray1[local3] = null;
			aByteArray64[local3] = Class707.aClass707_2.aByte176;
			aClass200Array1[local3] = null;
		}
	}

	@OriginalMember(owner = "client!aw", name = "alk", descriptor = "(Lclient!yf;I)V", line = 11823)
	static final void method24347(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) int local16 = Class639.method32467(local12, -1184267426);
		if (local16 < 0) {
			throw new RuntimeException();
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16;
	}
}
