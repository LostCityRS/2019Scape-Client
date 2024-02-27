package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Js5ArchiveIndex {

	@OriginalMember(owner = "client!ps", name = "t", descriptor = "I")
	static final int anInt5027 = 7;

	@OriginalMember(owner = "client!ps", name = "ce", descriptor = "Lclient!hx;")
	static Class327 aClass327_12;

	@OriginalMember(owner = "client!ps", name = "s", descriptor = "[[B")
	byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!ps", name = "q", descriptor = "[[I")
	int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!ps", name = "j", descriptor = "[I")
	int[] anIntArray455;

	@OriginalMember(owner = "client!ps", name = "u", descriptor = "I")
	int version;

	@OriginalMember(owner = "client!ps", name = "l", descriptor = "I")
	int anInt5024;

	@OriginalMember(owner = "client!ps", name = "m", descriptor = "Lclient!iu;")
	Class349 aClass349_1;

	@OriginalMember(owner = "client!ps", name = "i", descriptor = "[I")
	int[] anIntArray456;

	@OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
	int groupArraySize;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "[I")
	int[] anIntArray457;

	@OriginalMember(owner = "client!ps", name = "k", descriptor = "[I")
	int[] anIntArray458;

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "[I")
	int[] anIntArray459;

	@OriginalMember(owner = "client!ps", name = "x", descriptor = "[I")
	int[] anIntArray460;

	@OriginalMember(owner = "client!ps", name = "w", descriptor = "[I")
	int[] anIntArray461;

	@OriginalMember(owner = "client!ps", name = "r", descriptor = "[I")
	int[] anIntArray462;

	@OriginalMember(owner = "client!ps", name = "h", descriptor = "[[I")
	int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "[Lclient!iu;")
	Class349[] aClass349Array1;

	@OriginalMember(owner = "client!ps", name = "z", descriptor = "[I")
	int[] anIntArray463;

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "I")
	int anInt5026;

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "[B")
	byte[] aByteArray94;

	@OriginalMember(owner = "client!ps", name = "apt", descriptor = "(Lclient!yp;I)V")
	static void method30264(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5776 -= 1819398433;
		arg0.anInt5778 -= -221471862;
		Class531.method30819((String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997], (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997 + 1], arg0.anIntArray525[arg0.anInt5778 * 1896589581], arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1] == 1, (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997 + 2], 420434187);
	}

	@OriginalMember(owner = "client!ps", name = "apx", descriptor = "(Lclient!yp;B)V")
	static void method30265(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		if (BufferedSocket.aClass121_Sub1_2.method9702(184570597) != Class347.aClass347_7) {
			throw new RuntimeException();
		}
		((Class20_Sub3) BufferedSocket.aClass121_Sub1_2.method9693(1647681038)).method16650(arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], 1155933630);
	}

	@OriginalMember(owner = "client!ps", name = "t", descriptor = "(I)[Lclient!zm;")
	public static Class711[] method30266(@OriginalArg(0) int arg0) {
		return new Class711[] { Class711.aClass711_5, Class711.aClass711_4, Class711.aClass711_6, Class711.aClass711_2, Class711.aClass711_7, Class711.aClass711_3 };
	}

	@OriginalMember(owner = "client!ps", name = "cv", descriptor = "(Lclient!yp;I)V")
	static void method30267(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class8.method314(local11, local14, arg0, 1842711676);
	}

	@OriginalMember(owner = "client!ps", name = "alt", descriptor = "(Lclient!yp;S)V")
	static void method30268(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(29) int local29 = local23 >> 14 & 0x3FFF;
		@Pc(33) int local33 = local23 & 0x3FFF;
		@Pc(39) int local39 = Class544.method31184(local13, local29, local33, 2135519011);
		if (local39 < 0) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local39;
		}
	}

	@OriginalMember(owner = "client!ps", name = "aad", descriptor = "(Lclient!yp;I)V")
	static void method30269(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class568.aByte151;
	}

	@OriginalMember(owner = "client!ps", name = "z", descriptor = "(Lclient!yp;I)V")
	static void method30270(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) TwitchWebcamDevice local16 = Class578.method31796(local12, -1656049695);
		if (local16 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.e();
		}
	}

	@OriginalMember(owner = "client!ps", name = "vw", descriptor = "(Lclient!yp;I)V")
	static void method30271(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(32) Class691 local32 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		Class448.method29259(local32.aClass327_14, local13, local23, -370837082);
	}

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "([BI[B)V")
	Js5ArchiveIndex(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt5026 = Packet.getcrc(arg0, arg0.length) * -1360507039;
		if (arg1 != this.anInt5026 * 457348257) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray94 = Class130_Sub1.compute(arg0, 0, arg0.length, -1278417466);
			for (@Pc(41) int local41 = 0; local41 < 64; local41++) {
				if (this.aByteArray94[local41] != arg2[local41]) {
					throw new RuntimeException();
				}
			}
		}
		this.method30261(arg0, -655348049);
	}

	@OriginalMember(owner = "client!ps", name = "t", descriptor = "([BI)V")
	void method30261(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Packet local6 = new Packet(Class306.method27214(arg0, 1972376445));
		@Pc(10) int local10 = local6.g1();
		if (local10 < 5 || local10 > 7) {
			throw new RuntimeException();
		}
		if (local10 >= 6) {
			this.version = local6.g4() * -1921270019;
		} else {
			this.version = 0;
		}
		@Pc(38) int local38 = local6.g1();
		@Pc(47) boolean local47 = (local38 & 0x1) != 0;
		@Pc(55) boolean local55 = (local38 & 0x2) != 0;
		@Pc(64) boolean local64 = (local38 & 0x4) != 0;
		@Pc(72) boolean local72 = (local38 & 0x8) != 0;
		if (local10 >= 7) {
			this.anInt5024 = local6.gSmart2or4() * -210700441;
		} else {
			this.anInt5024 = local6.g2() * -210700441;
		}
		@Pc(92) int local92 = 0;
		@Pc(94) int local94 = -1;
		this.anIntArray459 = new int[this.anInt5024 * 2028811351];
		@Pc(106) int local106;
		if (local10 >= 7) {
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				this.anIntArray459[local106] = local92 += local6.gSmart2or4();
				if (this.anIntArray459[local106] > local94) {
					local94 = this.anIntArray459[local106];
				}
			}
		} else {
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				this.anIntArray459[local106] = local92 += local6.g2();
				if (this.anIntArray459[local106] > local94) {
					local94 = this.anIntArray459[local106];
				}
			}
		}
		this.groupArraySize = (local94 + 1) * -1293923509;
		this.anIntArray455 = new int[this.groupArraySize * 183068259];
		if (local72) {
			this.anIntArray457 = new int[this.groupArraySize * 183068259];
		}
		if (local55) {
			this.aByteArrayArray16 = new byte[this.groupArraySize * 183068259][];
		}
		this.anIntArray458 = new int[this.groupArraySize * 183068259];
		this.anIntArray462 = new int[this.groupArraySize * 183068259];
		this.anIntArrayArray58 = new int[this.groupArraySize * 183068259][];
		this.anIntArray463 = new int[this.groupArraySize * 183068259];
		if (local47) {
			this.anIntArray456 = new int[this.groupArraySize * 183068259];
			for (local106 = 0; local106 < this.groupArraySize * 183068259; local106++) {
				this.anIntArray456[local106] = -1;
			}
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				this.anIntArray456[this.anIntArray459[local106]] = local6.g4();
			}
			this.aClass349_1 = new Class349(this.anIntArray456);
		}
		for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
			this.anIntArray455[this.anIntArray459[local106]] = local6.g4();
		}
		if (local72) {
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				this.anIntArray457[local106] = local6.g4();
			}
		}
		if (local55) {
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				@Pc(332) byte[] local332 = new byte[64];
				local6.gdata(local332, 0, 64);
				this.aByteArrayArray16[this.anIntArray459[local106]] = local332;
			}
		}
		if (local64) {
			this.anIntArray460 = new int[this.groupArraySize * 183068259];
			this.anIntArray461 = new int[this.groupArraySize * 183068259];
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				this.anIntArray460[this.anIntArray459[local106]] = local6.g4();
				this.anIntArray461[this.anIntArray459[local106]] = local6.g4();
			}
		}
		for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
			this.anIntArray458[this.anIntArray459[local106]] = local6.g4();
		}
		@Pc(455) int local455;
		@Pc(459) int local459;
		@Pc(467) int local467;
		@Pc(485) int local485;
		@Pc(450) int local450;
		if (local10 >= 7) {
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				this.anIntArray462[this.anIntArray459[local106]] = local6.gSmart2or4();
			}
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				local450 = this.anIntArray459[local106];
				local455 = this.anIntArray462[local450];
				local92 = 0;
				local459 = -1;
				this.anIntArrayArray58[local450] = new int[local455];
				for (local467 = 0; local467 < local455; local467++) {
					local485 = this.anIntArrayArray58[local450][local467] = local92 += local6.gSmart2or4();
					if (local485 > local459) {
						local459 = local485;
					}
				}
				this.anIntArray463[local450] = local459 + 1;
				if (local455 == local459 + 1) {
					this.anIntArrayArray58[local450] = null;
				}
			}
		} else {
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				this.anIntArray462[this.anIntArray459[local106]] = local6.g2();
			}
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				local450 = this.anIntArray459[local106];
				local455 = this.anIntArray462[local450];
				local92 = 0;
				local459 = -1;
				this.anIntArrayArray58[local450] = new int[local455];
				for (local467 = 0; local467 < local455; local467++) {
					local485 = this.anIntArrayArray58[local450][local467] = local92 += local6.g2();
					if (local485 > local459) {
						local459 = local485;
					}
				}
				this.anIntArray463[local450] = local459 + 1;
				if (local459 + 1 == local455) {
					this.anIntArrayArray58[local450] = null;
				}
			}
		}
		if (!local47) {
			return;
		}
		this.anIntArrayArray59 = new int[local94 + 1][];
		this.aClass349Array1 = new Class349[local94 + 1];
		for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
			local450 = this.anIntArray459[local106];
			local455 = this.anIntArray462[local450];
			this.anIntArrayArray59[local450] = new int[this.anIntArray463[local450]];
			for (local459 = 0; local459 < this.anIntArray463[local450]; local459++) {
				this.anIntArrayArray59[local450][local459] = -1;
			}
			for (local459 = 0; local459 < local455; local459++) {
				if (this.anIntArrayArray58[local450] == null) {
					local467 = local459;
				} else {
					local467 = this.anIntArrayArray58[local450][local459];
				}
				this.anIntArrayArray59[local450][local467] = local6.g4();
			}
			this.aClass349Array1[local450] = new Class349(this.anIntArrayArray59[local450]);
		}
	}

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "([B)V")
	void method30262(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Packet local6 = new Packet(Class306.method27214(arg0, 1972376445));
		@Pc(10) int local10 = local6.g1();
		if (local10 < 5 || local10 > 7) {
			throw new RuntimeException();
		}
		if (local10 >= 6) {
			this.version = local6.g4() * -1921270019;
		} else {
			this.version = 0;
		}
		@Pc(38) int local38 = local6.g1();
		@Pc(47) boolean local47 = (local38 & 0x1) != 0;
		@Pc(55) boolean local55 = (local38 & 0x2) != 0;
		@Pc(64) boolean local64 = (local38 & 0x4) != 0;
		@Pc(72) boolean local72 = (local38 & 0x8) != 0;
		if (local10 >= 7) {
			this.anInt5024 = local6.gSmart2or4() * -210700441;
		} else {
			this.anInt5024 = local6.g2() * -210700441;
		}
		@Pc(92) int local92 = 0;
		@Pc(94) int local94 = -1;
		this.anIntArray459 = new int[this.anInt5024 * 2028811351];
		@Pc(106) int local106;
		if (local10 >= 7) {
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				this.anIntArray459[local106] = local92 += local6.gSmart2or4();
				if (this.anIntArray459[local106] > local94) {
					local94 = this.anIntArray459[local106];
				}
			}
		} else {
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				this.anIntArray459[local106] = local92 += local6.g2();
				if (this.anIntArray459[local106] > local94) {
					local94 = this.anIntArray459[local106];
				}
			}
		}
		this.groupArraySize = (local94 + 1) * -1293923509;
		this.anIntArray455 = new int[this.groupArraySize * 183068259];
		if (local72) {
			this.anIntArray457 = new int[this.groupArraySize * 183068259];
		}
		if (local55) {
			this.aByteArrayArray16 = new byte[this.groupArraySize * 183068259][];
		}
		this.anIntArray458 = new int[this.groupArraySize * 183068259];
		this.anIntArray462 = new int[this.groupArraySize * 183068259];
		this.anIntArrayArray58 = new int[this.groupArraySize * 183068259][];
		this.anIntArray463 = new int[this.groupArraySize * 183068259];
		if (local47) {
			this.anIntArray456 = new int[this.groupArraySize * 183068259];
			for (local106 = 0; local106 < this.groupArraySize * 183068259; local106++) {
				this.anIntArray456[local106] = -1;
			}
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				this.anIntArray456[this.anIntArray459[local106]] = local6.g4();
			}
			this.aClass349_1 = new Class349(this.anIntArray456);
		}
		for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
			this.anIntArray455[this.anIntArray459[local106]] = local6.g4();
		}
		if (local72) {
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				this.anIntArray457[local106] = local6.g4();
			}
		}
		if (local55) {
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				@Pc(332) byte[] local332 = new byte[64];
				local6.gdata(local332, 0, 64);
				this.aByteArrayArray16[this.anIntArray459[local106]] = local332;
			}
		}
		if (local64) {
			this.anIntArray460 = new int[this.groupArraySize * 183068259];
			this.anIntArray461 = new int[this.groupArraySize * 183068259];
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				this.anIntArray460[this.anIntArray459[local106]] = local6.g4();
				this.anIntArray461[this.anIntArray459[local106]] = local6.g4();
			}
		}
		for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
			this.anIntArray458[this.anIntArray459[local106]] = local6.g4();
		}
		@Pc(455) int local455;
		@Pc(459) int local459;
		@Pc(467) int local467;
		@Pc(485) int local485;
		@Pc(450) int local450;
		if (local10 >= 7) {
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				this.anIntArray462[this.anIntArray459[local106]] = local6.gSmart2or4();
			}
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				local450 = this.anIntArray459[local106];
				local455 = this.anIntArray462[local450];
				local92 = 0;
				local459 = -1;
				this.anIntArrayArray58[local450] = new int[local455];
				for (local467 = 0; local467 < local455; local467++) {
					local485 = this.anIntArrayArray58[local450][local467] = local92 += local6.gSmart2or4();
					if (local485 > local459) {
						local459 = local485;
					}
				}
				this.anIntArray463[local450] = local459 + 1;
				if (local455 == local459 + 1) {
					this.anIntArrayArray58[local450] = null;
				}
			}
		} else {
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				this.anIntArray462[this.anIntArray459[local106]] = local6.g2();
			}
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				local450 = this.anIntArray459[local106];
				local455 = this.anIntArray462[local450];
				local92 = 0;
				local459 = -1;
				this.anIntArrayArray58[local450] = new int[local455];
				for (local467 = 0; local467 < local455; local467++) {
					local485 = this.anIntArrayArray58[local450][local467] = local92 += local6.g2();
					if (local485 > local459) {
						local459 = local485;
					}
				}
				this.anIntArray463[local450] = local459 + 1;
				if (local459 + 1 == local455) {
					this.anIntArrayArray58[local450] = null;
				}
			}
		}
		if (!local47) {
			return;
		}
		this.anIntArrayArray59 = new int[local94 + 1][];
		this.aClass349Array1 = new Class349[local94 + 1];
		for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
			local450 = this.anIntArray459[local106];
			local455 = this.anIntArray462[local450];
			this.anIntArrayArray59[local450] = new int[this.anIntArray463[local450]];
			for (local459 = 0; local459 < this.anIntArray463[local450]; local459++) {
				this.anIntArrayArray59[local450][local459] = -1;
			}
			for (local459 = 0; local459 < local455; local459++) {
				if (this.anIntArrayArray58[local450] == null) {
					local467 = local459;
				} else {
					local467 = this.anIntArrayArray58[local450][local459];
				}
				this.anIntArrayArray59[local450][local467] = local6.g4();
			}
			this.aClass349Array1[local450] = new Class349(this.anIntArrayArray59[local450]);
		}
	}

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "([B)V")
	void method30263(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Packet local6 = new Packet(Class306.method27214(arg0, 1972376445));
		@Pc(10) int local10 = local6.g1();
		if (local10 < 5 || local10 > 7) {
			throw new RuntimeException();
		}
		if (local10 >= 6) {
			this.version = local6.g4() * -1921270019;
		} else {
			this.version = 0;
		}
		@Pc(38) int local38 = local6.g1();
		@Pc(47) boolean local47 = (local38 & 0x1) != 0;
		@Pc(55) boolean local55 = (local38 & 0x2) != 0;
		@Pc(64) boolean local64 = (local38 & 0x4) != 0;
		@Pc(72) boolean local72 = (local38 & 0x8) != 0;
		if (local10 >= 7) {
			this.anInt5024 = local6.gSmart2or4() * -210700441;
		} else {
			this.anInt5024 = local6.g2() * -210700441;
		}
		@Pc(92) int local92 = 0;
		@Pc(94) int local94 = -1;
		this.anIntArray459 = new int[this.anInt5024 * 2028811351];
		@Pc(106) int local106;
		if (local10 >= 7) {
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				this.anIntArray459[local106] = local92 += local6.gSmart2or4();
				if (this.anIntArray459[local106] > local94) {
					local94 = this.anIntArray459[local106];
				}
			}
		} else {
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				this.anIntArray459[local106] = local92 += local6.g2();
				if (this.anIntArray459[local106] > local94) {
					local94 = this.anIntArray459[local106];
				}
			}
		}
		this.groupArraySize = (local94 + 1) * -1293923509;
		this.anIntArray455 = new int[this.groupArraySize * 183068259];
		if (local72) {
			this.anIntArray457 = new int[this.groupArraySize * 183068259];
		}
		if (local55) {
			this.aByteArrayArray16 = new byte[this.groupArraySize * 183068259][];
		}
		this.anIntArray458 = new int[this.groupArraySize * 183068259];
		this.anIntArray462 = new int[this.groupArraySize * 183068259];
		this.anIntArrayArray58 = new int[this.groupArraySize * 183068259][];
		this.anIntArray463 = new int[this.groupArraySize * 183068259];
		if (local47) {
			this.anIntArray456 = new int[this.groupArraySize * 183068259];
			for (local106 = 0; local106 < this.groupArraySize * 183068259; local106++) {
				this.anIntArray456[local106] = -1;
			}
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				this.anIntArray456[this.anIntArray459[local106]] = local6.g4();
			}
			this.aClass349_1 = new Class349(this.anIntArray456);
		}
		for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
			this.anIntArray455[this.anIntArray459[local106]] = local6.g4();
		}
		if (local72) {
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				this.anIntArray457[local106] = local6.g4();
			}
		}
		if (local55) {
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				@Pc(332) byte[] local332 = new byte[64];
				local6.gdata(local332, 0, 64);
				this.aByteArrayArray16[this.anIntArray459[local106]] = local332;
			}
		}
		if (local64) {
			this.anIntArray460 = new int[this.groupArraySize * 183068259];
			this.anIntArray461 = new int[this.groupArraySize * 183068259];
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				this.anIntArray460[this.anIntArray459[local106]] = local6.g4();
				this.anIntArray461[this.anIntArray459[local106]] = local6.g4();
			}
		}
		for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
			this.anIntArray458[this.anIntArray459[local106]] = local6.g4();
		}
		@Pc(455) int local455;
		@Pc(459) int local459;
		@Pc(467) int local467;
		@Pc(485) int local485;
		@Pc(450) int local450;
		if (local10 >= 7) {
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				this.anIntArray462[this.anIntArray459[local106]] = local6.gSmart2or4();
			}
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				local450 = this.anIntArray459[local106];
				local455 = this.anIntArray462[local450];
				local92 = 0;
				local459 = -1;
				this.anIntArrayArray58[local450] = new int[local455];
				for (local467 = 0; local467 < local455; local467++) {
					local485 = this.anIntArrayArray58[local450][local467] = local92 += local6.gSmart2or4();
					if (local485 > local459) {
						local459 = local485;
					}
				}
				this.anIntArray463[local450] = local459 + 1;
				if (local455 == local459 + 1) {
					this.anIntArrayArray58[local450] = null;
				}
			}
		} else {
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				this.anIntArray462[this.anIntArray459[local106]] = local6.g2();
			}
			for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
				local450 = this.anIntArray459[local106];
				local455 = this.anIntArray462[local450];
				local92 = 0;
				local459 = -1;
				this.anIntArrayArray58[local450] = new int[local455];
				for (local467 = 0; local467 < local455; local467++) {
					local485 = this.anIntArrayArray58[local450][local467] = local92 += local6.g2();
					if (local485 > local459) {
						local459 = local485;
					}
				}
				this.anIntArray463[local450] = local459 + 1;
				if (local459 + 1 == local455) {
					this.anIntArrayArray58[local450] = null;
				}
			}
		}
		if (!local47) {
			return;
		}
		this.anIntArrayArray59 = new int[local94 + 1][];
		this.aClass349Array1 = new Class349[local94 + 1];
		for (local106 = 0; local106 < this.anInt5024 * 2028811351; local106++) {
			local450 = this.anIntArray459[local106];
			local455 = this.anIntArray462[local450];
			this.anIntArrayArray59[local450] = new int[this.anIntArray463[local450]];
			for (local459 = 0; local459 < this.anIntArray463[local450]; local459++) {
				this.anIntArrayArray59[local450][local459] = -1;
			}
			for (local459 = 0; local459 < local455; local459++) {
				if (this.anIntArrayArray58[local450] == null) {
					local467 = local459;
				} else {
					local467 = this.anIntArrayArray58[local450][local459];
				}
				this.anIntArrayArray59[local450][local467] = local6.g4();
			}
			this.aClass349Array1[local450] = new Class349(this.anIntArrayArray59[local450]);
		}
	}
}
