package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yi")
public final class Class684 implements Interface11 {

	@OriginalMember(owner = "client!yi", name = "t", descriptor = "I")
	static final int anInt5770 = 8224;

	@OriginalMember(owner = "client!yi", name = "i", descriptor = "[S")
	short[] aShortArray150;

	@OriginalMember(owner = "client!yi", name = "u", descriptor = "I")
	int anInt5761;

	@OriginalMember(owner = "client!yi", name = "g", descriptor = "[S")
	short[] aShortArray151;

	@OriginalMember(owner = "client!yi", name = "m", descriptor = "[S")
	short[] aShortArray152;

	@OriginalMember(owner = "client!yi", name = "o", descriptor = "[S")
	short[] aShortArray153;

	@OriginalMember(owner = "client!yi", name = "a", descriptor = "[B")
	byte[] aByteArray113;

	@OriginalMember(owner = "client!yi", name = "j", descriptor = "[B")
	byte[] aByteArray114;

	@OriginalMember(owner = "client!yi", name = "l", descriptor = "I")
	public int anInt5764 = 1789284219;

	@OriginalMember(owner = "client!yi", name = "s", descriptor = "I")
	int anInt5766 = 1266770048;

	@OriginalMember(owner = "client!yi", name = "k", descriptor = "I")
	int anInt5767 = -1359812480;

	@OriginalMember(owner = "client!yi", name = "x", descriptor = "I")
	int anInt5768 = 0;

	@OriginalMember(owner = "client!yi", name = "w", descriptor = "I")
	int anInt5769 = 0;

	@OriginalMember(owner = "client!yi", name = "r", descriptor = "I")
	int anInt5765 = 0;

	@OriginalMember(owner = "client!yi", name = "q", descriptor = "Z")
	public boolean aBoolean986 = false;

	@OriginalMember(owner = "client!yi", name = "h", descriptor = "B")
	byte aByte164 = 0;

	@OriginalMember(owner = "client!yi", name = "d", descriptor = "I")
	int anInt5763 = -1734238233;

	@OriginalMember(owner = "client!yi", name = "e", descriptor = "I")
	final int anInt5762;

	@OriginalMember(owner = "client!yi", name = "f", descriptor = "Lclient!yv;")
	final Class157 aClass157_1;

	@OriginalMember(owner = "client!yi", name = "e", descriptor = "(B)Z")
	static boolean method36790(@OriginalArg(0) byte arg0) {
		return Class499.aClass411_3 != null;
	}

	@OriginalMember(owner = "client!yi", name = "<init>", descriptor = "(ILclient!yv;)V")
	Class684(@OriginalArg(0) int arg0, @OriginalArg(1) Class157 arg1) {
		this.anInt5762 = arg0 * 163315981;
		this.aClass157_1 = arg1;
	}

	@OriginalMember(owner = "client!yi", name = "d", descriptor = "(Lclient!di;IZLclient!cb;Lclient!cb;IIIIIIILclient!aad;B)Lclient!dn;")
	Class105 method36773(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) Class100 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class6 arg12, @OriginalArg(13) byte arg13) {
		@Pc(1) int local1 = arg1;
		@Pc(11) boolean local11 = arg2 & this.aByte164 != 0;
		if (arg12 != null) {
			local1 = arg1 | arg12.method23592(1943840301);
		}
		if (this.anInt5767 * -451898575 != 128) {
			local1 |= 0x2;
		}
		if (this.anInt5766 * -1876652735 != 128 || this.anInt5768 * 1486931933 != 0 || arg8 != 0) {
			local1 |= 0x5;
		}
		if (local11) {
			local1 |= 0x7;
		}
		@Pc(58) Class243 local58 = this.aClass157_1.aClass243_28;
		@Pc(77) Class105 local77;
		synchronized (this.aClass157_1.aClass243_28) {
			local77 = (Class105) this.aClass157_1.aClass243_28.method26282((long) (this.anInt5762 * 1957279173 | arg0.anInt2931 * -829205491 << 29));
		}
		if (local77 == null || arg0.method21083(local77.method7326(), local1) != 0) {
			if (local77 != null) {
				local1 = arg0.method20755(local1, local77.method7326());
			}
			@Pc(104) int local104 = local1;
			if (this.aShortArray151 != null) {
				local104 = local1 | 0x4000;
			}
			if (this.aShortArray152 != null) {
				local104 |= 0x8000;
			}
			@Pc(129) Class232 local129 = Class232.method26043(this.aClass157_1.aClass480_45, this.anInt5761 * 123623335, 0);
			if (local129 == null) {
				return null;
			}
			if (local129.anInt3781 < 13) {
				local129.method26085(2);
			}
			local77 = arg0.method20753(local129, local104, this.aClass157_1.anInt1947 * -1086174193, this.anInt5769 * -1292746091 + 64, this.anInt5765 * -866807259 + 850);
			@Pc(168) int local168;
			if (this.aShortArray151 != null) {
				for (local168 = 0; local168 < this.aShortArray151.length; local168++) {
					local77.method7391(this.aShortArray151[local168], this.aShortArray150[local168]);
				}
			}
			if (this.aShortArray152 != null) {
				for (local168 = 0; local168 < this.aShortArray152.length; local168++) {
					local77.method7341(this.aShortArray152[local168], this.aShortArray153[local168]);
				}
			}
			local77.method7422(local1);
			@Pc(215) Class243 local215 = this.aClass157_1.aClass243_28;
			synchronized (this.aClass157_1.aClass243_28) {
				this.aClass157_1.aClass243_28.method26253(local77, (long) (this.anInt5762 * 1957279173 | arg0.anInt2931 * -829205491 << 29));
			}
		}
		@Pc(247) Class105 local247 = local77.method7324(arg13, local1, true);
		if (arg12 != null) {
			arg12.method23593(local247, 0, (byte) 28);
		}
		if (this.anInt5766 * -1876652735 != 128 || this.anInt5767 * -451898575 != 128) {
			local247.method7334(this.anInt5766 * -1876652735, this.anInt5767 * -451898575, this.anInt5766 * -1876652735);
		}
		if (this.anInt5768 * 1486931933 != 0) {
			if (this.anInt5768 * 1486931933 == 90) {
				arg8 += 4096;
			}
			if (this.anInt5768 * 1486931933 == 180) {
				arg8 += 8192;
			}
			if (this.anInt5768 * 1486931933 == 270) {
				arg8 += 12288;
			}
		}
		if (arg8 != 0) {
			arg8 &= 0x3FFF;
			local247.method7328(arg8);
		}
		if (local11) {
			if (arg3 == null) {
				if (arg9 != 0) {
					local247.method7330(arg9);
				}
				if (arg10 != 0) {
					local247.method7318(arg10);
				}
				if (arg11 != 0) {
					local247.method7332(0, arg11, 0);
				}
			} else {
				local247.method7417(this.aByte164, this.anInt5763 * 651885609, arg3, arg4, arg5, arg6, arg7);
			}
		}
		local247.method7422(arg1);
		return local247;
	}

	@OriginalMember(owner = "client!yi", name = "z", descriptor = "(Lclient!di;IZLclient!cb;Lclient!cb;IIIIIIILclient!aad;B)Lclient!dn;")
	Class105 method36774(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) Class100 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class6 arg12, @OriginalArg(13) byte arg13) {
		@Pc(1) int local1 = arg1;
		@Pc(11) boolean local11 = arg2 & this.aByte164 != 0;
		if (arg12 != null) {
			local1 = arg1 | arg12.method23592(2039827531);
		}
		if (this.anInt5767 * -451898575 != 128) {
			local1 |= 0x2;
		}
		if (this.anInt5766 * -1876652735 != 128 || this.anInt5768 * 1486931933 != 0 || arg8 != 0) {
			local1 |= 0x5;
		}
		if (local11) {
			local1 |= 0x7;
		}
		@Pc(58) Class243 local58 = this.aClass157_1.aClass243_28;
		@Pc(77) Class105 local77;
		synchronized (this.aClass157_1.aClass243_28) {
			local77 = (Class105) this.aClass157_1.aClass243_28.method26282((long) (this.anInt5762 * 1957279173 | arg0.anInt2931 * -829205491 << 29));
		}
		if (local77 == null || arg0.method21083(local77.method7326(), local1) != 0) {
			if (local77 != null) {
				local1 = arg0.method20755(local1, local77.method7326());
			}
			@Pc(104) int local104 = local1;
			if (this.aShortArray151 != null) {
				local104 = local1 | 0x4000;
			}
			if (this.aShortArray152 != null) {
				local104 |= 0x8000;
			}
			@Pc(129) Class232 local129 = Class232.method26043(this.aClass157_1.aClass480_45, this.anInt5761 * 123623335, 0);
			if (local129 == null) {
				return null;
			}
			if (local129.anInt3781 < 13) {
				local129.method26085(2);
			}
			local77 = arg0.method20753(local129, local104, this.aClass157_1.anInt1947 * -1086174193, this.anInt5769 * -1292746091 + 64, this.anInt5765 * -866807259 + 850);
			@Pc(168) int local168;
			if (this.aShortArray151 != null) {
				for (local168 = 0; local168 < this.aShortArray151.length; local168++) {
					local77.method7391(this.aShortArray151[local168], this.aShortArray150[local168]);
				}
			}
			if (this.aShortArray152 != null) {
				for (local168 = 0; local168 < this.aShortArray152.length; local168++) {
					local77.method7341(this.aShortArray152[local168], this.aShortArray153[local168]);
				}
			}
			local77.method7422(local1);
			@Pc(215) Class243 local215 = this.aClass157_1.aClass243_28;
			synchronized (this.aClass157_1.aClass243_28) {
				this.aClass157_1.aClass243_28.method26253(local77, (long) (this.anInt5762 * 1957279173 | arg0.anInt2931 * -829205491 << 29));
			}
		}
		@Pc(247) Class105 local247 = local77.method7324(arg13, local1, true);
		if (arg12 != null) {
			arg12.method23593(local247, 0, (byte) 64);
		}
		if (this.anInt5766 * -1876652735 != 128 || this.anInt5767 * -451898575 != 128) {
			local247.method7334(this.anInt5766 * -1876652735, this.anInt5767 * -451898575, this.anInt5766 * -1876652735);
		}
		if (this.anInt5768 * 1486931933 != 0) {
			if (this.anInt5768 * 1486931933 == 90) {
				arg8 += 4096;
			}
			if (this.anInt5768 * 1486931933 == 180) {
				arg8 += 8192;
			}
			if (this.anInt5768 * 1486931933 == 270) {
				arg8 += 12288;
			}
		}
		if (arg8 != 0) {
			arg8 &= 0x3FFF;
			local247.method7328(arg8);
		}
		if (local11) {
			if (arg3 == null) {
				if (arg9 != 0) {
					local247.method7330(arg9);
				}
				if (arg10 != 0) {
					local247.method7318(arg10);
				}
				if (arg11 != 0) {
					local247.method7332(0, arg11, 0);
				}
			} else {
				local247.method7417(this.aByte164, this.anInt5763 * 651885609, arg3, arg4, arg5, arg6, arg7);
			}
		}
		local247.method7422(arg1);
		return local247;
	}

	@OriginalMember(owner = "client!yi", name = "l", descriptor = "(Lclient!ald;II)V")
	void method36775(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt5761 = arg0.gSmart2or4null() * -1576214505;
		} else if (arg1 == 2) {
			this.anInt5764 = arg0.gSmart2or4null() * -1789284219;
		} else if (arg1 == 4) {
			this.anInt5766 = arg0.g2() * 982975169;
		} else if (arg1 == 5) {
			this.anInt5767 = arg0.g2() * -2124552751;
		} else if (arg1 == 6) {
			this.anInt5768 = arg0.g2() * 1977665653;
		} else if (arg1 == 7) {
			this.anInt5769 = arg0.g1() * -9209667;
		} else if (arg1 == 8) {
			this.anInt5765 = arg0.g1() * 729430445;
		} else if (arg1 == 10) {
			this.aBoolean986 = true;
		} else if (arg1 == 9) {
			this.aByte164 = 3;
			this.anInt5763 = -1211161824;
		} else if (arg1 == 15) {
			this.aByte164 = 3;
			this.anInt5763 = arg0.g2() * 1734238233;
		} else if (arg1 == 16) {
			this.aByte164 = 3;
			this.anInt5763 = arg0.g4() * 1734238233;
		} else {
			@Pc(128) int local128;
			@Pc(138) int local138;
			if (arg1 == 40) {
				local128 = arg0.g1();
				this.aShortArray151 = new short[local128];
				this.aShortArray150 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray151[local138] = (short) arg0.g2();
					this.aShortArray150[local138] = (short) arg0.g2();
				}
			} else if (arg1 == 41) {
				local128 = arg0.g1();
				this.aShortArray152 = new short[local128];
				this.aShortArray153 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray152[local138] = (short) arg0.g2();
					this.aShortArray153[local138] = (short) arg0.g2();
				}
			} else {
				@Pc(210) int local210;
				@Pc(226) int local226;
				@Pc(224) byte local224;
				if (arg1 == 44) {
					local128 = arg0.g2();
					local138 = 0;
					for (local210 = local128; local210 > 0; local210 >>= 0x1) {
						local138++;
					}
					this.aByteArray114 = new byte[local138];
					local224 = 0;
					for (local226 = 0; local226 < local138; local226++) {
						if ((local128 & 0x1 << local226) > 0) {
							this.aByteArray114[local226] = local224++;
						} else {
							this.aByteArray114[local226] = -1;
						}
					}
				} else if (arg1 == 45) {
					local128 = arg0.g2();
					local138 = 0;
					for (local210 = local128; local210 > 0; local210 >>= 0x1) {
						local138++;
					}
					this.aByteArray113 = new byte[local138];
					local224 = 0;
					for (local226 = 0; local226 < local138; local226++) {
						if ((local128 & 0x1 << local226) > 0) {
							this.aByteArray113[local226] = local224++;
						} else {
							this.aByteArray113[local226] = -1;
						}
					}
				} else if (arg1 == 46) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!yi", name = "t", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method37006(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			this.method36775(arg0, local3, -1539155395);
		}
	}

	@OriginalMember(owner = "client!yi", name = "i", descriptor = "(Lclient!di;IIIIILclient!aad;BB)Lclient!dn;")
	public Class105 method36776(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class6 arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8) {
		return this.aByte164 == 3 ? this.method36787(arg0, arg1, true, null, null, 0, 0, 0, arg2, arg3, arg4, arg5, arg6, arg7, 1172950274) : this.method36787(arg0, arg1, false, null, null, 0, 0, 0, arg2, 0, 0, 0, arg6, arg7, 1083504275);
	}

	@OriginalMember(owner = "client!yi", name = "m", descriptor = "(Lclient!di;IILclient!cb;Lclient!cb;IIILclient!aad;BI)Lclient!dn;")
	public Class105 method36777(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) Class100 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class6 arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) int arg10) {
		return this.method36787(arg0, arg1, true, arg3, arg4, arg5, arg6, arg7, arg2, 0, 0, 0, arg8, arg9, 172141590);
	}

	@OriginalMember(owner = "client!yi", name = "q", descriptor = "(Lclient!di;IZLclient!cb;Lclient!cb;IIIIIIILclient!aad;B)Lclient!dn;")
	Class105 method36778(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) Class100 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class6 arg12, @OriginalArg(13) byte arg13) {
		@Pc(1) int local1 = arg1;
		@Pc(11) boolean local11 = arg2 & this.aByte164 != 0;
		if (arg12 != null) {
			local1 = arg1 | arg12.method23592(1968407467);
		}
		if (this.anInt5767 * -451898575 != 128) {
			local1 |= 0x2;
		}
		if (this.anInt5766 * -1876652735 != 128 || this.anInt5768 * 1486931933 != 0 || arg8 != 0) {
			local1 |= 0x5;
		}
		if (local11) {
			local1 |= 0x7;
		}
		@Pc(58) Class243 local58 = this.aClass157_1.aClass243_28;
		@Pc(77) Class105 local77;
		synchronized (this.aClass157_1.aClass243_28) {
			local77 = (Class105) this.aClass157_1.aClass243_28.method26282((long) (this.anInt5762 * 1957279173 | arg0.anInt2931 * -829205491 << 29));
		}
		if (local77 == null || arg0.method21083(local77.method7326(), local1) != 0) {
			if (local77 != null) {
				local1 = arg0.method20755(local1, local77.method7326());
			}
			@Pc(104) int local104 = local1;
			if (this.aShortArray151 != null) {
				local104 = local1 | 0x4000;
			}
			if (this.aShortArray152 != null) {
				local104 |= 0x8000;
			}
			@Pc(129) Class232 local129 = Class232.method26043(this.aClass157_1.aClass480_45, this.anInt5761 * 123623335, 0);
			if (local129 == null) {
				return null;
			}
			if (local129.anInt3781 < 13) {
				local129.method26085(2);
			}
			local77 = arg0.method20753(local129, local104, this.aClass157_1.anInt1947 * -1086174193, this.anInt5769 * -1292746091 + 64, this.anInt5765 * -866807259 + 850);
			@Pc(168) int local168;
			if (this.aShortArray151 != null) {
				for (local168 = 0; local168 < this.aShortArray151.length; local168++) {
					local77.method7391(this.aShortArray151[local168], this.aShortArray150[local168]);
				}
			}
			if (this.aShortArray152 != null) {
				for (local168 = 0; local168 < this.aShortArray152.length; local168++) {
					local77.method7341(this.aShortArray152[local168], this.aShortArray153[local168]);
				}
			}
			local77.method7422(local1);
			@Pc(215) Class243 local215 = this.aClass157_1.aClass243_28;
			synchronized (this.aClass157_1.aClass243_28) {
				this.aClass157_1.aClass243_28.method26253(local77, (long) (this.anInt5762 * 1957279173 | arg0.anInt2931 * -829205491 << 29));
			}
		}
		@Pc(247) Class105 local247 = local77.method7324(arg13, local1, true);
		if (arg12 != null) {
			arg12.method23593(local247, 0, (byte) 36);
		}
		if (this.anInt5766 * -1876652735 != 128 || this.anInt5767 * -451898575 != 128) {
			local247.method7334(this.anInt5766 * -1876652735, this.anInt5767 * -451898575, this.anInt5766 * -1876652735);
		}
		if (this.anInt5768 * 1486931933 != 0) {
			if (this.anInt5768 * 1486931933 == 90) {
				arg8 += 4096;
			}
			if (this.anInt5768 * 1486931933 == 180) {
				arg8 += 8192;
			}
			if (this.anInt5768 * 1486931933 == 270) {
				arg8 += 12288;
			}
		}
		if (arg8 != 0) {
			arg8 &= 0x3FFF;
			local247.method7328(arg8);
		}
		if (local11) {
			if (arg3 == null) {
				if (arg9 != 0) {
					local247.method7330(arg9);
				}
				if (arg10 != 0) {
					local247.method7318(arg10);
				}
				if (arg11 != 0) {
					local247.method7332(0, arg11, 0);
				}
			} else {
				local247.method7417(this.aByte164, this.anInt5763 * 651885609, arg3, arg4, arg5, arg6, arg7);
			}
		}
		local247.method7422(arg1);
		return local247;
	}

	@OriginalMember(owner = "client!yi", name = "a", descriptor = "(Lclient!ald;I)V")
	void method36779(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5761 = arg0.gSmart2or4null() * -1576214505;
		} else if (arg1 == 2) {
			this.anInt5764 = arg0.gSmart2or4null() * -1789284219;
		} else if (arg1 == 4) {
			this.anInt5766 = arg0.g2() * 982975169;
		} else if (arg1 == 5) {
			this.anInt5767 = arg0.g2() * -2124552751;
		} else if (arg1 == 6) {
			this.anInt5768 = arg0.g2() * 1977665653;
		} else if (arg1 == 7) {
			this.anInt5769 = arg0.g1() * -9209667;
		} else if (arg1 == 8) {
			this.anInt5765 = arg0.g1() * 729430445;
		} else if (arg1 == 10) {
			this.aBoolean986 = true;
		} else if (arg1 == 9) {
			this.aByte164 = 3;
			this.anInt5763 = -1211161824;
		} else if (arg1 == 15) {
			this.aByte164 = 3;
			this.anInt5763 = arg0.g2() * 1734238233;
		} else if (arg1 == 16) {
			this.aByte164 = 3;
			this.anInt5763 = arg0.g4() * 1734238233;
		} else {
			@Pc(128) int local128;
			@Pc(138) int local138;
			if (arg1 == 40) {
				local128 = arg0.g1();
				this.aShortArray151 = new short[local128];
				this.aShortArray150 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray151[local138] = (short) arg0.g2();
					this.aShortArray150[local138] = (short) arg0.g2();
				}
			} else if (arg1 == 41) {
				local128 = arg0.g1();
				this.aShortArray152 = new short[local128];
				this.aShortArray153 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray152[local138] = (short) arg0.g2();
					this.aShortArray153[local138] = (short) arg0.g2();
				}
			} else {
				@Pc(210) int local210;
				@Pc(226) int local226;
				@Pc(224) byte local224;
				if (arg1 == 44) {
					local128 = arg0.g2();
					local138 = 0;
					for (local210 = local128; local210 > 0; local210 >>= 0x1) {
						local138++;
					}
					this.aByteArray114 = new byte[local138];
					local224 = 0;
					for (local226 = 0; local226 < local138; local226++) {
						if ((local128 & 0x1 << local226) > 0) {
							this.aByteArray114[local226] = local224++;
						} else {
							this.aByteArray114[local226] = -1;
						}
					}
				} else if (arg1 == 45) {
					local128 = arg0.g2();
					local138 = 0;
					for (local210 = local128; local210 > 0; local210 >>= 0x1) {
						local138++;
					}
					this.aByteArray113 = new byte[local138];
					local224 = 0;
					for (local226 = 0; local226 < local138; local226++) {
						if ((local128 & 0x1 << local226) > 0) {
							this.aByteArray113[local226] = local224++;
						} else {
							this.aByteArray113[local226] = -1;
						}
					}
				} else if (arg1 == 46) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!yi", name = "f", descriptor = "(B)V")
	@Override
	public void method37007(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!yi", name = "e", descriptor = "()V")
	@Override
	public void method37008() {
	}

	@OriginalMember(owner = "client!yi", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	public void method37009(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			this.method36775(arg0, local3, -763186568);
		}
	}

	@OriginalMember(owner = "client!yi", name = "s", descriptor = "(Lclient!di;ILclient!aad;B)Lclient!dn;")
	public Class105 method36780(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) byte arg3) {
		return this.method36787(arg0, arg1, false, null, null, 0, 0, 0, 0, 0, 0, 0, arg2, arg3, 1598660910);
	}

	@OriginalMember(owner = "client!yi", name = "k", descriptor = "(Lclient!di;IIIIILclient!aad;B)Lclient!dn;")
	public Class105 method36781(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class6 arg6, @OriginalArg(7) byte arg7) {
		return this.aByte164 == 3 ? this.method36787(arg0, arg1, true, null, null, 0, 0, 0, arg2, arg3, arg4, arg5, arg6, arg7, 2018946702) : this.method36787(arg0, arg1, false, null, null, 0, 0, 0, arg2, 0, 0, 0, arg6, arg7, 683512395);
	}

	@OriginalMember(owner = "client!yi", name = "x", descriptor = "(Lclient!di;IILclient!cb;Lclient!cb;IIILclient!aad;B)Lclient!dn;")
	public Class105 method36782(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) Class100 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class6 arg8, @OriginalArg(9) byte arg9) {
		return this.method36787(arg0, arg1, true, arg3, arg4, arg5, arg6, arg7, arg2, 0, 0, 0, arg8, arg9, 986536312);
	}

	@OriginalMember(owner = "client!yi", name = "w", descriptor = "(Lclient!di;IILclient!cb;Lclient!cb;IIILclient!aad;B)Lclient!dn;")
	public Class105 method36783(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) Class100 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class6 arg8, @OriginalArg(9) byte arg9) {
		return this.method36787(arg0, arg1, true, arg3, arg4, arg5, arg6, arg7, arg2, 0, 0, 0, arg8, arg9, -1638852473);
	}

	@OriginalMember(owner = "client!yi", name = "r", descriptor = "(Lclient!di;IILclient!cb;Lclient!cb;IIILclient!aad;B)Lclient!dn;")
	public Class105 method36784(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) Class100 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class6 arg8, @OriginalArg(9) byte arg9) {
		return this.method36787(arg0, arg1, true, arg3, arg4, arg5, arg6, arg7, arg2, 0, 0, 0, arg8, arg9, 495477728);
	}

	@OriginalMember(owner = "client!yi", name = "j", descriptor = "(I)Z")
	public boolean method36785(@OriginalArg(0) int arg0) {
		return this.anInt5761 * 123623335 == -1 ? true : this.aClass157_1.aClass480_45.method29925(this.anInt5761 * 123623335, 0, -1418592821);
	}

	@OriginalMember(owner = "client!yi", name = "h", descriptor = "(Lclient!di;IZLclient!cb;Lclient!cb;IIIIIIILclient!aad;B)Lclient!dn;")
	Class105 method36786(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) Class100 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class6 arg12, @OriginalArg(13) byte arg13) {
		@Pc(1) int local1 = arg1;
		@Pc(11) boolean local11 = arg2 & this.aByte164 != 0;
		if (arg12 != null) {
			local1 = arg1 | arg12.method23592(1976796701);
		}
		if (this.anInt5767 * -451898575 != 128) {
			local1 |= 0x2;
		}
		if (this.anInt5766 * -1876652735 != 128 || this.anInt5768 * 1486931933 != 0 || arg8 != 0) {
			local1 |= 0x5;
		}
		if (local11) {
			local1 |= 0x7;
		}
		@Pc(58) Class243 local58 = this.aClass157_1.aClass243_28;
		@Pc(77) Class105 local77;
		synchronized (this.aClass157_1.aClass243_28) {
			local77 = (Class105) this.aClass157_1.aClass243_28.method26282((long) (this.anInt5762 * 1957279173 | arg0.anInt2931 * -829205491 << 29));
		}
		if (local77 == null || arg0.method21083(local77.method7326(), local1) != 0) {
			if (local77 != null) {
				local1 = arg0.method20755(local1, local77.method7326());
			}
			@Pc(104) int local104 = local1;
			if (this.aShortArray151 != null) {
				local104 = local1 | 0x4000;
			}
			if (this.aShortArray152 != null) {
				local104 |= 0x8000;
			}
			@Pc(129) Class232 local129 = Class232.method26043(this.aClass157_1.aClass480_45, this.anInt5761 * 123623335, 0);
			if (local129 == null) {
				return null;
			}
			if (local129.anInt3781 < 13) {
				local129.method26085(2);
			}
			local77 = arg0.method20753(local129, local104, this.aClass157_1.anInt1947 * -1086174193, this.anInt5769 * -1292746091 + 64, this.anInt5765 * -866807259 + 850);
			@Pc(168) int local168;
			if (this.aShortArray151 != null) {
				for (local168 = 0; local168 < this.aShortArray151.length; local168++) {
					local77.method7391(this.aShortArray151[local168], this.aShortArray150[local168]);
				}
			}
			if (this.aShortArray152 != null) {
				for (local168 = 0; local168 < this.aShortArray152.length; local168++) {
					local77.method7341(this.aShortArray152[local168], this.aShortArray153[local168]);
				}
			}
			local77.method7422(local1);
			@Pc(215) Class243 local215 = this.aClass157_1.aClass243_28;
			synchronized (this.aClass157_1.aClass243_28) {
				this.aClass157_1.aClass243_28.method26253(local77, (long) (this.anInt5762 * 1957279173 | arg0.anInt2931 * -829205491 << 29));
			}
		}
		@Pc(247) Class105 local247 = local77.method7324(arg13, local1, true);
		if (arg12 != null) {
			arg12.method23593(local247, 0, (byte) 84);
		}
		if (this.anInt5766 * -1876652735 != 128 || this.anInt5767 * -451898575 != 128) {
			local247.method7334(this.anInt5766 * -1876652735, this.anInt5767 * -451898575, this.anInt5766 * -1876652735);
		}
		if (this.anInt5768 * 1486931933 != 0) {
			if (this.anInt5768 * 1486931933 == 90) {
				arg8 += 4096;
			}
			if (this.anInt5768 * 1486931933 == 180) {
				arg8 += 8192;
			}
			if (this.anInt5768 * 1486931933 == 270) {
				arg8 += 12288;
			}
		}
		if (arg8 != 0) {
			arg8 &= 0x3FFF;
			local247.method7328(arg8);
		}
		if (local11) {
			if (arg3 == null) {
				if (arg9 != 0) {
					local247.method7330(arg9);
				}
				if (arg10 != 0) {
					local247.method7318(arg10);
				}
				if (arg11 != 0) {
					local247.method7332(0, arg11, 0);
				}
			} else {
				local247.method7417(this.aByte164, this.anInt5763 * 651885609, arg3, arg4, arg5, arg6, arg7);
			}
		}
		local247.method7422(arg1);
		return local247;
	}

	@OriginalMember(owner = "client!yi", name = "o", descriptor = "(Lclient!di;IZLclient!cb;Lclient!cb;IIIIIIILclient!aad;BI)Lclient!dn;")
	Class105 method36787(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) Class100 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class6 arg12, @OriginalArg(13) byte arg13, @OriginalArg(14) int arg14) {
		@Pc(1) int local1 = arg1;
		@Pc(11) boolean local11 = arg2 & this.aByte164 != 0;
		if (arg12 != null) {
			local1 = arg1 | arg12.method23592(1950598498);
		}
		if (this.anInt5767 * -451898575 != 128) {
			local1 |= 0x2;
		}
		if (this.anInt5766 * -1876652735 != 128 || this.anInt5768 * 1486931933 != 0 || arg8 != 0) {
			local1 |= 0x5;
		}
		if (local11) {
			local1 |= 0x7;
		}
		@Pc(58) Class243 local58 = this.aClass157_1.aClass243_28;
		@Pc(77) Class105 local77;
		synchronized (this.aClass157_1.aClass243_28) {
			local77 = (Class105) this.aClass157_1.aClass243_28.method26282((long) (this.anInt5762 * 1957279173 | arg0.anInt2931 * -829205491 << 29));
		}
		if (local77 == null || arg0.method21083(local77.method7326(), local1) != 0) {
			if (local77 != null) {
				local1 = arg0.method20755(local1, local77.method7326());
			}
			@Pc(104) int local104 = local1;
			if (this.aShortArray151 != null) {
				local104 = local1 | 0x4000;
			}
			if (this.aShortArray152 != null) {
				local104 |= 0x8000;
			}
			@Pc(129) Class232 local129 = Class232.method26043(this.aClass157_1.aClass480_45, this.anInt5761 * 123623335, 0);
			if (local129 == null) {
				return null;
			}
			if (local129.anInt3781 < 13) {
				local129.method26085(2);
			}
			local77 = arg0.method20753(local129, local104, this.aClass157_1.anInt1947 * -1086174193, this.anInt5769 * -1292746091 + 64, this.anInt5765 * -866807259 + 850);
			@Pc(168) int local168;
			if (this.aShortArray151 != null) {
				for (local168 = 0; local168 < this.aShortArray151.length; local168++) {
					local77.method7391(this.aShortArray151[local168], this.aShortArray150[local168]);
				}
			}
			if (this.aShortArray152 != null) {
				for (local168 = 0; local168 < this.aShortArray152.length; local168++) {
					local77.method7341(this.aShortArray152[local168], this.aShortArray153[local168]);
				}
			}
			local77.method7422(local1);
			@Pc(215) Class243 local215 = this.aClass157_1.aClass243_28;
			synchronized (this.aClass157_1.aClass243_28) {
				this.aClass157_1.aClass243_28.method26253(local77, (long) (this.anInt5762 * 1957279173 | arg0.anInt2931 * -829205491 << 29));
			}
		}
		@Pc(247) Class105 local247 = local77.method7324(arg13, local1, true);
		if (arg12 != null) {
			arg12.method23593(local247, 0, (byte) 42);
		}
		if (this.anInt5766 * -1876652735 != 128 || this.anInt5767 * -451898575 != 128) {
			local247.method7334(this.anInt5766 * -1876652735, this.anInt5767 * -451898575, this.anInt5766 * -1876652735);
		}
		if (this.anInt5768 * 1486931933 != 0) {
			if (this.anInt5768 * 1486931933 == 90) {
				arg8 += 4096;
			}
			if (this.anInt5768 * 1486931933 == 180) {
				arg8 += 8192;
			}
			if (this.anInt5768 * 1486931933 == 270) {
				arg8 += 12288;
			}
		}
		if (arg8 != 0) {
			arg8 &= 0x3FFF;
			local247.method7328(arg8);
		}
		if (local11) {
			if (arg3 == null) {
				if (arg9 != 0) {
					local247.method7330(arg9);
				}
				if (arg10 != 0) {
					local247.method7318(arg10);
				}
				if (arg11 != 0) {
					local247.method7332(0, arg11, 0);
				}
			} else {
				local247.method7417(this.aByte164, this.anInt5763 * 651885609, arg3, arg4, arg5, arg6, arg7);
			}
		}
		local247.method7422(arg1);
		return local247;
	}

	@OriginalMember(owner = "client!yi", name = "p", descriptor = "()Z")
	public boolean method36788() {
		return this.anInt5761 * 123623335 == -1 ? true : this.aClass157_1.aClass480_45.method29925(this.anInt5761 * 123623335, 0, -2069237456);
	}

	@OriginalMember(owner = "client!yi", name = "g", descriptor = "(Lclient!di;ILclient!aad;BI)Lclient!dn;")
	public Class105 method36789(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		return this.method36787(arg0, arg1, false, null, null, 0, 0, 0, 0, 0, 0, 0, arg2, arg3, -1076172872);
	}
}
