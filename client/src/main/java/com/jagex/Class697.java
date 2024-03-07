package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yy")
public class Class697 implements Interface13 {

	@OriginalMember(owner = "client!yy", name = "e", descriptor = "I")
	static final int anInt5943 = 8224;

	@OriginalMember(owner = "client!yy", name = "z", descriptor = "[S")
	short[] aShortArray150;

	@OriginalMember(owner = "client!yy", name = "w", descriptor = "[S")
	short[] aShortArray151;

	@OriginalMember(owner = "client!yy", name = "k", descriptor = "I")
	int anInt5942;

	@OriginalMember(owner = "client!yy", name = "l", descriptor = "[S")
	short[] aShortArray152;

	@OriginalMember(owner = "client!yy", name = "u", descriptor = "[S")
	short[] aShortArray153;

	@OriginalMember(owner = "client!yy", name = "p", descriptor = "[B")
	byte[] aByteArray113;

	@OriginalMember(owner = "client!yy", name = "d", descriptor = "[B")
	byte[] aByteArray114;

	@OriginalMember(owner = "client!yy", name = "f", descriptor = "I")
	public int anInt5949 = -456410441;

	@OriginalMember(owner = "client!yy", name = "c", descriptor = "I")
	int anInt5945 = -353016704;

	@OriginalMember(owner = "client!yy", name = "r", descriptor = "I")
	int anInt5946 = -1707355776;

	@OriginalMember(owner = "client!yy", name = "v", descriptor = "I")
	int anInt5947 = 0;

	@OriginalMember(owner = "client!yy", name = "o", descriptor = "I")
	int anInt5948 = 0;

	@OriginalMember(owner = "client!yy", name = "s", descriptor = "I")
	int anInt5944 = 0;

	@OriginalMember(owner = "client!yy", name = "y", descriptor = "Z")
	public boolean aBoolean881 = false;

	@OriginalMember(owner = "client!yy", name = "q", descriptor = "B")
	byte aByte175 = 0;

	@OriginalMember(owner = "client!yy", name = "x", descriptor = "I")
	int anInt5950 = 725340517;

	@OriginalMember(owner = "client!yy", name = "m", descriptor = "I")
	final int anInt5941;

	@OriginalMember(owner = "client!yy", name = "n", descriptor = "Lclient!yc;")
	final Class164 aClass164_1;

	@OriginalMember(owner = "client!yy", name = "<init>", descriptor = "(ILclient!yc;)V", line = 34)
	Class697(@OriginalArg(0) int arg0, @OriginalArg(1) Class164 arg1) {
		this.anInt5941 = arg0 * -1464613025;
		this.aClass164_1 = arg1;
	}

	@OriginalMember(owner = "client!yy", name = "e", descriptor = "(Lclient!alw;B)V", line = 41)
	@Override
	public void method36654(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method36661(arg0, local3, -614941657);
		}
	}

	@OriginalMember(owner = "client!yy", name = "m", descriptor = "(Lclient!alw;)V", line = 41)
	@Override
	public void method36655(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method36661(arg0, local3, -84640348);
		}
	}

	@OriginalMember(owner = "client!yy", name = "w", descriptor = "(Lclient!alw;)V", line = 41)
	@Override
	public void method36658(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method36661(arg0, local3, -1449235498);
		}
	}

	@OriginalMember(owner = "client!yy", name = "f", descriptor = "(Lclient!alw;)V", line = 41)
	@Override
	public void method36657(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method36661(arg0, local3, -1020211480);
		}
	}

	@OriginalMember(owner = "client!yy", name = "k", descriptor = "(Lclient!alw;)V", line = 41)
	@Override
	public void method36656(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method36661(arg0, local3, -455863785);
		}
	}

	@OriginalMember(owner = "client!yy", name = "v", descriptor = "(Lclient!alw;I)V", line = 48)
	void method36660(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5942 = arg0.gSmart2or4null(-1923170064) * 1576345649;
		} else if (arg1 == 2) {
			this.anInt5949 = arg0.gSmart2or4null(-1509646141) * 456410441;
		} else if (arg1 == 4) {
			this.anInt5945 = arg0.g2(-1434290800) * 232123081;
		} else if (arg1 == 5) {
			this.anInt5946 = arg0.g2(-1434290800) * -650872925;
		} else if (arg1 == 6) {
			this.anInt5947 = arg0.g2(-1434290800) * 748175151;
		} else if (arg1 == 7) {
			this.anInt5948 = arg0.g1((short) 16384) * -1527566057;
		} else if (arg1 == 8) {
			this.anInt5944 = arg0.g1((short) 16384) * 1111932275;
		} else if (arg1 == 10) {
			this.aBoolean881 = true;
		} else if (arg1 == 9) {
			this.aByte175 = 3;
			this.anInt5950 = 509162336;
		} else if (arg1 == 15) {
			this.aByte175 = 3;
			this.anInt5950 = arg0.g2(-1434290800) * -725340517;
		} else if (arg1 == 16) {
			this.aByte175 = 3;
			this.anInt5950 = arg0.g4(-118643075) * -725340517;
		} else {
			@Pc(128) int local128;
			@Pc(138) int local138;
			if (arg1 == 40) {
				local128 = arg0.g1((short) 16384);
				this.aShortArray151 = new short[local128];
				this.aShortArray152 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray151[local138] = (short) arg0.g2(-1434290800);
					this.aShortArray152[local138] = (short) arg0.g2(-1434290800);
				}
			} else if (arg1 == 41) {
				local128 = arg0.g1((short) 16384);
				this.aShortArray153 = new short[local128];
				this.aShortArray150 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray153[local138] = (short) arg0.g2(-1434290800);
					this.aShortArray150[local138] = (short) arg0.g2(-1434290800);
				}
			} else {
				@Pc(210) int local210;
				@Pc(226) int local226;
				@Pc(224) byte local224;
				if (arg1 == 44) {
					local128 = arg0.g2(-1434290800);
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
				} else if (arg1 == 45) {
					local128 = arg0.g2(-1434290800);
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
				} else if (arg1 == 46) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!yy", name = "u", descriptor = "(Lclient!alw;II)V", line = 48)
	void method36661(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt5942 = arg0.gSmart2or4null(-1501880591) * 1576345649;
		} else if (arg1 == 2) {
			this.anInt5949 = arg0.gSmart2or4null(-2011466936) * 456410441;
		} else if (arg1 == 4) {
			this.anInt5945 = arg0.g2(-1434290800) * 232123081;
		} else if (arg1 == 5) {
			this.anInt5946 = arg0.g2(-1434290800) * -650872925;
		} else if (arg1 == 6) {
			this.anInt5947 = arg0.g2(-1434290800) * 748175151;
		} else if (arg1 == 7) {
			this.anInt5948 = arg0.g1((short) 16384) * -1527566057;
		} else if (arg1 == 8) {
			this.anInt5944 = arg0.g1((short) 16384) * 1111932275;
		} else if (arg1 == 10) {
			this.aBoolean881 = true;
		} else if (arg1 == 9) {
			this.aByte175 = 3;
			this.anInt5950 = 509162336;
		} else if (arg1 == 15) {
			this.aByte175 = 3;
			this.anInt5950 = arg0.g2(-1434290800) * -725340517;
		} else if (arg1 == 16) {
			this.aByte175 = 3;
			this.anInt5950 = arg0.g4(-118643075) * -725340517;
		} else {
			@Pc(128) int local128;
			@Pc(138) int local138;
			if (arg1 == 40) {
				local128 = arg0.g1((short) 16384);
				this.aShortArray151 = new short[local128];
				this.aShortArray152 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray151[local138] = (short) arg0.g2(-1434290800);
					this.aShortArray152[local138] = (short) arg0.g2(-1434290800);
				}
			} else if (arg1 == 41) {
				local128 = arg0.g1((short) 16384);
				this.aShortArray153 = new short[local128];
				this.aShortArray150 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray153[local138] = (short) arg0.g2(-1434290800);
					this.aShortArray150[local138] = (short) arg0.g2(-1434290800);
				}
			} else {
				@Pc(210) int local210;
				@Pc(226) int local226;
				@Pc(224) byte local224;
				if (arg1 == 44) {
					local128 = arg0.g2(-1434290800);
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
				} else if (arg1 == 45) {
					local128 = arg0.g2(-1434290800);
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
				} else if (arg1 == 46) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!yy", name = "o", descriptor = "(Lclient!dh;ILclient!aaq;B)Lclient!do;", line = 123)
	public final Class109 method36662(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) byte arg3) {
		return this.method36674(arg0, arg1, false, null, null, 0, 0, 0, 0, 0, 0, 0, arg2, arg3, -1747960127);
	}

	@OriginalMember(owner = "client!yy", name = "s", descriptor = "(Lclient!dh;ILclient!aaq;B)Lclient!do;", line = 123)
	public final Class109 method36663(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) byte arg3) {
		return this.method36674(arg0, arg1, false, null, null, 0, 0, 0, 0, 0, 0, 0, arg2, arg3, -1747960127);
	}

	@OriginalMember(owner = "client!yy", name = "y", descriptor = "(Lclient!dh;ILclient!aaq;B)Lclient!do;", line = 123)
	public final Class109 method36664(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) byte arg3) {
		return this.method36674(arg0, arg1, false, null, null, 0, 0, 0, 0, 0, 0, 0, arg2, arg3, -1747960127);
	}

	@OriginalMember(owner = "client!yy", name = "z", descriptor = "(Lclient!dh;ILclient!aaq;BI)Lclient!do;", line = 123)
	public final Class109 method36665(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		return this.method36674(arg0, arg1, false, null, null, 0, 0, 0, 0, 0, 0, 0, arg2, arg3, -1747960127);
	}

	@OriginalMember(owner = "client!yy", name = "p", descriptor = "(Lclient!dh;IIIIILclient!aaq;BI)Lclient!do;", line = 127)
	public final Class109 method36666(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class19 arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) int arg8) {
		return this.aByte175 == 3 ? this.method36674(arg0, arg1, true, null, null, 0, 0, 0, arg2, arg3, arg4, arg5, arg6, arg7, -1747960127) : this.method36674(arg0, arg1, false, null, null, 0, 0, 0, arg2, 0, 0, 0, arg6, arg7, -1747960127);
	}

	@OriginalMember(owner = "client!yy", name = "q", descriptor = "(Lclient!dh;IIIIILclient!aaq;B)Lclient!do;", line = 127)
	public final Class109 method36667(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class19 arg6, @OriginalArg(7) byte arg7) {
		return this.aByte175 == 3 ? this.method36674(arg0, arg1, true, null, null, 0, 0, 0, arg2, arg3, arg4, arg5, arg6, arg7, -1747960127) : this.method36674(arg0, arg1, false, null, null, 0, 0, 0, arg2, 0, 0, 0, arg6, arg7, -1747960127);
	}

	@OriginalMember(owner = "client!yy", name = "x", descriptor = "(Lclient!dh;IIIIILclient!aaq;B)Lclient!do;", line = 127)
	public final Class109 method36668(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class19 arg6, @OriginalArg(7) byte arg7) {
		return this.aByte175 == 3 ? this.method36674(arg0, arg1, true, null, null, 0, 0, 0, arg2, arg3, arg4, arg5, arg6, arg7, -1747960127) : this.method36674(arg0, arg1, false, null, null, 0, 0, 0, arg2, 0, 0, 0, arg6, arg7, -1747960127);
	}

	@OriginalMember(owner = "client!yy", name = "d", descriptor = "(Lclient!dh;IILclient!cb;Lclient!cb;IIILclient!aaq;BB)Lclient!do;", line = 132)
	public final Class109 method36669(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class99 arg3, @OriginalArg(4) Class99 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class19 arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10) {
		return this.method36674(arg0, arg1, true, arg3, arg4, arg5, arg6, arg7, arg2, 0, 0, 0, arg8, arg9, -1747960127);
	}

	@OriginalMember(owner = "client!yy", name = "g", descriptor = "(Lclient!dh;IILclient!cb;Lclient!cb;IIILclient!aaq;B)Lclient!do;", line = 132)
	public final Class109 method36670(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class99 arg3, @OriginalArg(4) Class99 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class19 arg8, @OriginalArg(9) byte arg9) {
		return this.method36674(arg0, arg1, true, arg3, arg4, arg5, arg6, arg7, arg2, 0, 0, 0, arg8, arg9, -1747960127);
	}

	@OriginalMember(owner = "client!yy", name = "b", descriptor = "(Lclient!dh;IILclient!cb;Lclient!cb;IIILclient!aaq;B)Lclient!do;", line = 132)
	public final Class109 method36671(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class99 arg3, @OriginalArg(4) Class99 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class19 arg8, @OriginalArg(9) byte arg9) {
		return this.method36674(arg0, arg1, true, arg3, arg4, arg5, arg6, arg7, arg2, 0, 0, 0, arg8, arg9, -1747960127);
	}

	@OriginalMember(owner = "client!yy", name = "h", descriptor = "(Lclient!dh;IILclient!cb;Lclient!cb;IIILclient!aaq;B)Lclient!do;", line = 132)
	public final Class109 method36672(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class99 arg3, @OriginalArg(4) Class99 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class19 arg8, @OriginalArg(9) byte arg9) {
		return this.method36674(arg0, arg1, true, arg3, arg4, arg5, arg6, arg7, arg2, 0, 0, 0, arg8, arg9, -1747960127);
	}

	@OriginalMember(owner = "client!yy", name = "a", descriptor = "(Lclient!dh;IILclient!cb;Lclient!cb;IIILclient!aaq;B)Lclient!do;", line = 132)
	public final Class109 method36673(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class99 arg3, @OriginalArg(4) Class99 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class19 arg8, @OriginalArg(9) byte arg9) {
		return this.method36674(arg0, arg1, true, arg3, arg4, arg5, arg6, arg7, arg2, 0, 0, 0, arg8, arg9, -1747960127);
	}

	@OriginalMember(owner = "client!yy", name = "c", descriptor = "(Lclient!dh;IZLclient!cb;Lclient!cb;IIIIIIILclient!aaq;BI)Lclient!do;", line = 136)
	final Class109 method36674(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class99 arg3, @OriginalArg(4) Class99 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class19 arg12, @OriginalArg(13) byte arg13, @OriginalArg(14) int arg14) {
		@Pc(1) int local1 = arg1;
		@Pc(11) boolean local11 = arg2 & this.aByte175 != 0;
		if (arg12 != null) {
			local1 = arg1 | arg12.method23585(-1834698277);
		}
		if (this.anInt5946 * -438078453 != 128) {
			local1 |= 0x2;
		}
		if (this.anInt5945 * -1494200455 != 128 || this.anInt5947 * -1848154161 != 0 || arg8 != 0) {
			local1 |= 0x5;
		}
		if (local11) {
			local1 |= 0x7;
		}
		@Pc(59) Class240 local59 = this.aClass164_1.aClass240_39;
		@Pc(78) Class109 local78;
		synchronized (this.aClass164_1.aClass240_39) {
			local78 = (Class109) this.aClass164_1.aClass240_39.method25829((long) (this.anInt5941 * 143938719 | arg0.anInt2888 * 658538839 << 29));
		}
		if (local78 == null || arg0.method20759(local78.method6875(), local1) != 0) {
			if (local78 != null) {
				local1 = arg0.method20599(local1, local78.method6875());
			}
			@Pc(105) int local105 = local1;
			if (this.aShortArray151 != null) {
				local105 = local1 | 0x4000;
			}
			if (this.aShortArray153 != null) {
				local105 |= 0x8000;
			}
			@Pc(129) Class231 local129 = Class231.method25655(this.aClass164_1.aClass497_58, this.anInt5942 * 431372497, 0);
			if (local129 == null) {
				return null;
			}
			if (local129.anInt3738 < 13) {
				local129.method25691(2);
			}
			local78 = arg0.method20597(local129, local105, this.aClass164_1.anInt2017 * -2076184321, this.anInt5948 * -237693273 + 64, this.anInt5944 * -2056867909 + 850);
			@Pc(168) int local168;
			if (this.aShortArray151 != null) {
				for (local168 = 0; local168 < this.aShortArray151.length; local168++) {
					local78.method7017(this.aShortArray151[local168], this.aShortArray152[local168]);
				}
			}
			if (this.aShortArray153 != null) {
				for (local168 = 0; local168 < this.aShortArray153.length; local168++) {
					local78.method6913(this.aShortArray153[local168], this.aShortArray150[local168]);
				}
			}
			local78.method6874(local1);
			@Pc(215) Class240 local215 = this.aClass164_1.aClass240_39;
			synchronized (this.aClass164_1.aClass240_39) {
				this.aClass164_1.aClass240_39.method25838(local78, (long) (this.anInt5941 * 143938719 | arg0.anInt2888 * 658538839 << 29));
			}
		}
		@Pc(247) Class109 local247 = local78.method6938(arg13, local1, true);
		if (arg12 != null) {
			arg12.method23587(local247, 0, 150255679);
		}
		if (this.anInt5945 * -1494200455 != 128 || this.anInt5946 * -438078453 != 128) {
			local247.method6882(this.anInt5945 * -1494200455, this.anInt5946 * -438078453, this.anInt5945 * -1494200455);
		}
		if (this.anInt5947 * -1848154161 != 0) {
			if (this.anInt5947 * -1848154161 == 90) {
				arg8 += 4096;
			}
			if (this.anInt5947 * -1848154161 == 180) {
				arg8 += 8192;
			}
			if (this.anInt5947 * -1848154161 == 270) {
				arg8 += 12288;
			}
		}
		if (arg8 != 0) {
			arg8 &= 0x3FFF;
			local247.method6877(arg8);
		}
		if (local11) {
			if (arg3 == null) {
				if (arg9 != 0) {
					local247.method7011(arg9);
				}
				if (arg10 != 0) {
					local247.method6880(arg10);
				}
				if (arg11 != 0) {
					local247.method6968(0, arg11, 0);
				}
			} else {
				local247.method6883(this.aByte175, this.anInt5950 * 1374226323, arg3, arg4, arg5, arg6, arg7);
			}
		}
		local247.method6874(arg1);
		return local247;
	}

	@OriginalMember(owner = "client!yy", name = "i", descriptor = "(Lclient!dh;IZLclient!cb;Lclient!cb;IIIIIIILclient!aaq;B)Lclient!do;", line = 136)
	final Class109 method36675(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class99 arg3, @OriginalArg(4) Class99 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class19 arg12, @OriginalArg(13) byte arg13) {
		@Pc(1) int local1 = arg1;
		@Pc(11) boolean local11 = arg2 & this.aByte175 != 0;
		if (arg12 != null) {
			local1 = arg1 | arg12.method23585(-1728768076);
		}
		if (this.anInt5946 * -438078453 != 128) {
			local1 |= 0x2;
		}
		if (this.anInt5945 * -1494200455 != 128 || this.anInt5947 * -1848154161 != 0 || arg8 != 0) {
			local1 |= 0x5;
		}
		if (local11) {
			local1 |= 0x7;
		}
		@Pc(59) Class240 local59 = this.aClass164_1.aClass240_39;
		@Pc(78) Class109 local78;
		synchronized (this.aClass164_1.aClass240_39) {
			local78 = (Class109) this.aClass164_1.aClass240_39.method25829((long) (this.anInt5941 * 143938719 | arg0.anInt2888 * 658538839 << 29));
		}
		if (local78 == null || arg0.method20759(local78.method6875(), local1) != 0) {
			if (local78 != null) {
				local1 = arg0.method20599(local1, local78.method6875());
			}
			@Pc(105) int local105 = local1;
			if (this.aShortArray151 != null) {
				local105 = local1 | 0x4000;
			}
			if (this.aShortArray153 != null) {
				local105 |= 0x8000;
			}
			@Pc(129) Class231 local129 = Class231.method25655(this.aClass164_1.aClass497_58, this.anInt5942 * 431372497, 0);
			if (local129 == null) {
				return null;
			}
			if (local129.anInt3738 < 13) {
				local129.method25691(2);
			}
			local78 = arg0.method20597(local129, local105, this.aClass164_1.anInt2017 * -2076184321, this.anInt5948 * -237693273 + 64, this.anInt5944 * -2056867909 + 850);
			@Pc(168) int local168;
			if (this.aShortArray151 != null) {
				for (local168 = 0; local168 < this.aShortArray151.length; local168++) {
					local78.method7017(this.aShortArray151[local168], this.aShortArray152[local168]);
				}
			}
			if (this.aShortArray153 != null) {
				for (local168 = 0; local168 < this.aShortArray153.length; local168++) {
					local78.method6913(this.aShortArray153[local168], this.aShortArray150[local168]);
				}
			}
			local78.method6874(local1);
			@Pc(215) Class240 local215 = this.aClass164_1.aClass240_39;
			synchronized (this.aClass164_1.aClass240_39) {
				this.aClass164_1.aClass240_39.method25838(local78, (long) (this.anInt5941 * 143938719 | arg0.anInt2888 * 658538839 << 29));
			}
		}
		@Pc(247) Class109 local247 = local78.method6938(arg13, local1, true);
		if (arg12 != null) {
			arg12.method23587(local247, 0, -1577972426);
		}
		if (this.anInt5945 * -1494200455 != 128 || this.anInt5946 * -438078453 != 128) {
			local247.method6882(this.anInt5945 * -1494200455, this.anInt5946 * -438078453, this.anInt5945 * -1494200455);
		}
		if (this.anInt5947 * -1848154161 != 0) {
			if (this.anInt5947 * -1848154161 == 90) {
				arg8 += 4096;
			}
			if (this.anInt5947 * -1848154161 == 180) {
				arg8 += 8192;
			}
			if (this.anInt5947 * -1848154161 == 270) {
				arg8 += 12288;
			}
		}
		if (arg8 != 0) {
			arg8 &= 0x3FFF;
			local247.method6877(arg8);
		}
		if (local11) {
			if (arg3 == null) {
				if (arg9 != 0) {
					local247.method7011(arg9);
				}
				if (arg10 != 0) {
					local247.method6880(arg10);
				}
				if (arg11 != 0) {
					local247.method6968(0, arg11, 0);
				}
			} else {
				local247.method6883(this.aByte175, this.anInt5950 * 1374226323, arg3, arg4, arg5, arg6, arg7);
			}
		}
		local247.method6874(arg1);
		return local247;
	}

	@OriginalMember(owner = "client!yy", name = "ae", descriptor = "()Z", line = 195)
	public final boolean method36676() {
		return this.anInt5942 * 431372497 == -1 ? true : this.aClass164_1.aClass497_58.method30069(this.anInt5942 * 431372497, 0, -403358355);
	}

	@OriginalMember(owner = "client!yy", name = "r", descriptor = "(B)Z", line = 195)
	public final boolean method36677(@OriginalArg(0) byte arg0) {
		return this.anInt5942 * 431372497 == -1 ? true : this.aClass164_1.aClass497_58.method30069(this.anInt5942 * 431372497, 0, 1526379009);
	}

	@OriginalMember(owner = "client!yy", name = "j", descriptor = "()Z", line = 195)
	public final boolean method36678() {
		return this.anInt5942 * 431372497 == -1 ? true : this.aClass164_1.aClass497_58.method30069(this.anInt5942 * 431372497, 0, 1829457231);
	}

	@OriginalMember(owner = "client!yy", name = "t", descriptor = "()Z", line = 195)
	public final boolean method36679() {
		return this.anInt5942 * 431372497 == -1 ? true : this.aClass164_1.aClass497_58.method30069(this.anInt5942 * 431372497, 0, -583114648);
	}

	@OriginalMember(owner = "client!yy", name = "l", descriptor = "()V", line = 199)
	@Override
	public void method36659() {
	}

	@OriginalMember(owner = "client!yy", name = "n", descriptor = "(I)V", line = 199)
	@Override
	public void method36653(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!yy", name = "aws", descriptor = "(Lclient!yf;B)V", line = 13714)
	static final void method36680(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= 463840436;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(28) boolean local28 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1] == 1;
		@Pc(38) int local38 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(53) boolean local53 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 3] == 1;
		Class388.method28248(local13, local28, local38, local53, (byte) 0);
	}
}
