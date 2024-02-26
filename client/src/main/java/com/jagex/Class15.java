package com.jagex;

import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aan")
public final class Class15 {

	@OriginalMember(owner = "client!aan", name = "x", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray1 = new String[100];

	@OriginalMember(owner = "client!aan", name = "w", descriptor = "Lclient!aaf;")
	public final Interface1 anInterface1_1;

	@OriginalMember(owner = "client!aan", name = "f", descriptor = "[B")
	byte[] aByteArray9;

	@OriginalMember(owner = "client!aan", name = "t", descriptor = "[B")
	byte[] aByteArray11;

	@OriginalMember(owner = "client!aan", name = "u", descriptor = "[B")
	byte[] aByteArray10;

	@OriginalMember(owner = "client!aan", name = "k", descriptor = "[[S")
	short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!aan", name = "a", descriptor = "I")
	public int anInt49;

	@OriginalMember(owner = "client!aan", name = "s", descriptor = "I")
	public int anInt43;

	@OriginalMember(owner = "client!aan", name = "e", descriptor = "[[B")
	byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!aan", name = "l", descriptor = "I")
	public int anInt44;

	@OriginalMember(owner = "client!aan", name = "m", descriptor = "I")
	public int anInt48;

	@OriginalMember(owner = "client!aan", name = "o", descriptor = "I")
	public int anInt47;

	@OriginalMember(owner = "client!aan", name = "g", descriptor = "I")
	public int anInt45;

	@OriginalMember(owner = "client!aan", name = "i", descriptor = "I")
	public int anInt46;

	@OriginalMember(owner = "client!aan", name = "j", descriptor = "I")
	public int anInt50;

	@OriginalMember(owner = "client!aan", name = "v", descriptor = "(Lclient!pf;II)Lclient!aan;")
	public static Class15 method367(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Class165_Sub44.method16877(arg0, arg1, arg2, null, 622076858);
	}

	@OriginalMember(owner = "client!aan", name = "n", descriptor = "(Lclient!pf;II)Lclient!aan;")
	public static Class15 method386(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Class165_Sub44.method16877(arg0, arg1, arg2, null, -1823681331);
	}

	@OriginalMember(owner = "client!aan", name = "p", descriptor = "(Lclient!pf;II)Lclient!aan;")
	public static Class15 method387(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Class165_Sub44.method16877(arg0, arg1, arg2, null, -1732438392);
	}

	@OriginalMember(owner = "client!aan", name = "b", descriptor = "(Lclient!pf;IILclient!aaf;)Lclient!aan;")
	public static Class15 method388(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface1 arg3) {
		@Pc(5) byte[] local5 = arg0.method29918(arg1, arg2, 1896589581);
		return local5 == null ? null : new Class15(local5, arg3);
	}

	@OriginalMember(owner = "client!aan", name = "ax", descriptor = "(Lclient!pf;ILclient!aaf;)Lclient!aan;")
	public static Class15 method389(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface1 arg2) {
		@Pc(4) byte[] local4 = arg0.method29926(arg1, 1472047355);
		return local4 == null ? null : new Class15(local4, arg2);
	}

	@OriginalMember(owner = "client!aan", name = "ay", descriptor = "([[B[[B[B[B[BII)I")
	static int method390(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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

	@OriginalMember(owner = "client!aan", name = "aq", descriptor = "([[B[[B[B[B[BII)I")
	static int method392(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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

	@OriginalMember(owner = "client!aan", name = "c", descriptor = "(Lclient!pf;IILclient!aaf;)Lclient!aan;")
	public static Class15 method408(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface1 arg3) {
		@Pc(5) byte[] local5 = arg0.method29918(arg1, arg2, 1896589581);
		return local5 == null ? null : new Class15(local5, arg3);
	}

	@OriginalMember(owner = "client!aan", name = "y", descriptor = "(Lclient!pf;II)Lclient!aan;")
	public static Class15 method415(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Class165_Sub44.method16877(arg0, arg1, arg2, null, -1841439320);
	}

	@OriginalMember(owner = "client!aan", name = "ai", descriptor = "([[B[[B[B[B[BII)I")
	static int method419(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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

	@OriginalMember(owner = "client!aan", name = "m", descriptor = "(Lclient!aqc;B)V")
	public static void method421(@OriginalArg(0) Class120_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class80_Sub21 local8 = (Class80_Sub21) Class80_Sub21.aClass24_12.method560((long) (arg0.anInt2671 * 1078276675));
		if (local8 == null) {
			Class676.method33587(arg0.aByte99, arg0.anIntArray234[0], arg0.anIntArray242[0], 0, null, null, arg0, (byte) -93);
		} else {
			local8.method14186(2049758485);
		}
	}

	@OriginalMember(owner = "client!aan", name = "iy", descriptor = "(II)I")
	static int method422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0x3F;
		@Pc(9) int local9 = arg0 >> 6 & 0x3;
		if (local3 == 18) {
			if (local9 == 0) {
				return 1;
			}
			if (local9 == 1) {
				return 2;
			}
			if (local9 == 2) {
				return 4;
			}
			if (local9 == 3) {
				return 8;
			}
		} else if (local3 == 19 || local3 == 21) {
			if (local9 == 0) {
				return 16;
			}
			if (local9 == 1) {
				return 32;
			}
			if (local9 == 2) {
				return 64;
			}
			if (local9 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!aan", name = "atp", descriptor = "(Lclient!yp;B)V")
	static void method423(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!aan", name = "f", descriptor = "(II)Lclient!ib;")
	public static Class332 method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class332[] local2 = Class331.method27788(-1048694321);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class332 local12 = local2[local4];
			if (local12.anInt4193 * -1606525071 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aan", name = "<init>", descriptor = "([BLclient!aaf;)V")
	Class15(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Interface1 arg1) {
		this.anInterface1_1 = arg1;
		@Pc(9) Class80_Sub36 local9 = new Class80_Sub36(arg0);
		@Pc(13) int local13 = local9.method23362(-2030125298);
		if (local13 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local9.method23362(20836203) == 1;
		this.aByteArray9 = new byte[256];
		local9.method23399(this.aByteArray9, 0, 256, -1930922125);
		this.aByteArray11 = new byte[256];
		local9.method23399(this.aByteArray11, 0, 256, -1972314666);
		this.aByteArray10 = new byte[256];
		local9.method23399(this.aByteArray10, 0, 256, -1653275992);
		this.aShortArrayArray1 = new short[256][4];
		this.anInt49 = local9.method23178((byte) -96) * -1450321981;
		this.anInt43 = local9.method23178((byte) -104) * 1827480797;
		@Pc(84) int local84;
		for (local84 = 0; local84 < 256; local84++) {
			this.aShortArrayArray1[local84][0] = (short) local9.method23178((byte) -49);
		}
		for (local84 = 0; local84 < 256; local84++) {
			this.aShortArrayArray1[local84][1] = (short) local9.method23178((byte) -79);
		}
		for (local84 = 0; local84 < 256; local84++) {
			this.aShortArrayArray1[local84][2] = this.aByteArray9[local84];
			this.aShortArrayArray1[local84][3] = this.aByteArray11[local84];
		}
		@Pc(152) int local152;
		if (local30) {
			@Pc(150) byte[][] local150 = new byte[256][];
			@Pc(167) int local167;
			for (local152 = 0; local152 < 256; local152++) {
				local150[local152] = new byte[this.aByteArray11[local152]];
				@Pc(165) byte local165 = 0;
				for (local167 = 0; local167 < local150[local152].length; local167++) {
					local165 += local9.method23177((byte) -20);
					local150[local152][local167] = local165;
				}
			}
			@Pc(193) byte[][] local193 = new byte[256][];
			@Pc(195) int local195;
			for (local195 = 0; local195 < 256; local195++) {
				local193[local195] = new byte[this.aByteArray11[local195]];
				@Pc(208) byte local208 = 0;
				for (@Pc(210) int local210 = 0; local210 < local193[local195].length; local210++) {
					local208 += local9.method23177((byte) -6);
					local193[local195][local210] = local208;
				}
			}
			this.aByteArrayArray2 = new byte[256][256];
			for (local195 = 0; local195 < 256; local195++) {
				if (local195 != 32 && local195 != 160) {
					for (local167 = 0; local167 < 256; local167++) {
						if (local167 != 32 && local167 != 160) {
							this.aByteArrayArray2[local195][local167] = (byte) Class601.method32104(local150, local193, this.aByteArray10, this.aByteArray9, this.aByteArray11, local195, local167, 1952075109);
						}
					}
				}
			}
			this.anInt44 = (this.aByteArray10[32] + this.aByteArray11[32]) * 1315878961;
		} else {
			this.anInt44 = local9.method23362(694116327) * 1315878961;
		}
		this.anInt48 = local9.method23362(-1166684408) * 1904944649;
		this.anInt47 = local9.method23362(-1133122945) * 768909829;
		this.anInt45 = local9.method23362(375633705) * 1758710727;
		this.anInt46 = local9.method23362(-686281450) * -1182124275;
		this.anInt50 = local9.method23362(221146626) * 1149206211;
		if (this.anInt50 * -2031443477 != 1) {
			this.anInt44 = this.anInt44 * -1978818351 / (this.anInt50 * -2031443477) * 1315878961;
			this.anInt48 = this.anInt48 * 1329743929 / (this.anInt50 * -2031443477) * 1904944649;
			this.anInt47 = this.anInt47 * 1096473293 / (this.anInt50 * -2031443477) * 768909829;
			this.anInt45 = this.anInt45 * 1190692343 / (this.anInt50 * -2031443477) * 1758710727;
			this.anInt46 = -191270971 * this.anInt46 / (-2031443477 * this.anInt50) * -1182124275;
			for (local84 = 0; local84 < 256; local84++) {
				this.aByteArray9[local84] = (byte) (this.aByteArray9[local84] / (this.anInt50 * -2031443477));
				this.aByteArray11[local84] = (byte) (this.aByteArray11[local84] / (this.anInt50 * -2031443477));
				this.aByteArray10[local84] = (byte) (this.aByteArray10[local84] / (this.anInt50 * -2031443477));
			}
			if (local30) {
				for (local84 = 0; local84 < 256; local84++) {
					for (local152 = 0; local152 < 256; local152++) {
						this.aByteArrayArray2[local84][local152] = (byte) (this.aByteArrayArray2[local84][local152] / (this.anInt50 * -2031443477));
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aan", name = "l", descriptor = "(ICI)I")
	public int method368(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		return this.aByteArrayArray2 == null ? 0 : this.aByteArrayArray2[arg0][arg1];
	}

	@OriginalMember(owner = "client!aan", name = "g", descriptor = "(IS)I")
	public int method369(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		return this.aByteArray9[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!aan", name = "ac", descriptor = "(IC)I")
	public int method370(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		return this.aByteArrayArray2 == null ? 0 : this.aByteArrayArray2[arg0][arg1];
	}

	@OriginalMember(owner = "client!aan", name = "i", descriptor = "(II)I")
	public int method371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray11[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!aan", name = "aj", descriptor = "(IC)I")
	public int method372(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		return this.aByteArrayArray2 == null ? 0 : this.aByteArrayArray2[arg0][arg1];
	}

	@OriginalMember(owner = "client!aan", name = "j", descriptor = "(Ljava/lang/String;I)I")
	public int method373(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method374(arg0, null, -1804945099);
	}

	@OriginalMember(owner = "client!aan", name = "a", descriptor = "(Ljava/lang/String;[Lclient!aat;I)I")
	public int method374(@OriginalArg(0) String arg0, @OriginalArg(1) Interface2[] arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = arg0.length();
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(21) char local21 = arg0.charAt(local14);
			if (local21 == '<') {
				local5 = local14;
			} else {
				if (local21 == '>' && local5 != -1) {
					@Pc(40) String local40 = arg0.substring(local5 + 1, local14);
					local5 = -1;
					if (local40.equals("lt")) {
						local21 = '<';
					} else if (local40.equals("gt")) {
						local21 = '>';
					} else if (local40.equals("nbsp")) {
						local21 = ' ';
					} else if (local40.equals("shy")) {
						local21 = '\u00ad';
					} else if (local40.equals("times")) {
						local21 = '×';
					} else if (local40.equals("euro")) {
						local21 = '\u0080';
					} else if (local40.equals("copy")) {
						local21 = '©';
					} else {
						if (!local40.equals("reg")) {
							@Pc(110) int local110;
							if (local40.startsWith("img=") && arg1 != null) {
								try {
									local110 = Class679.method33621(local40.substring(4), 1650869605);
									local9 += arg1[local110].method18214();
									local7 = -1;
								} catch (@Pc(121) Exception local121) {
								}
								continue;
							}
							if (local40.startsWith("sprite=") && this.anInterface1_1 != null) {
								try {
									@Pc(132) boolean local132 = true;
									@Pc(136) int local136 = local40.indexOf(44);
									if (local136 == -1) {
										local110 = Class679.method33621(local40.substring(7), -266015048);
									} else {
										local110 = Class679.method33621(local40.substring(7, local136), -1717020839);
									}
									local9 += this.anInterface1_1.method29584(local110, 141666267);
									local7 = -1;
								} catch (@Pc(165) Exception local165) {
								}
							}
							continue;
						}
						local21 = '®';
					}
				}
				if (local5 == -1) {
					local9 += this.aByteArray9[Class308.method27442(local21, (byte) -25) & 0xFF] & 0xFF;
					if (this.aByteArrayArray2 != null && local7 != -1) {
						local9 += this.aByteArrayArray2[local7][local21];
					}
					local7 = local21;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!aan", name = "k", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;[Lclient!aat;S)I")
	public int method375(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) Interface2[] arg3, @OriginalArg(4) short arg4) {
		return this.method395(arg0, arg1, arg2, arg3, true, (byte) 2);
	}

	@OriginalMember(owner = "client!aan", name = "ae", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;[Lclient!aat;)I")
	public int method376(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) Interface2[] arg3) {
		return this.method395(arg0, arg1, arg2, arg3, true, (byte) 2);
	}

	@OriginalMember(owner = "client!aan", name = "w", descriptor = "(Ljava/lang/String;I[Lclient!aat;I)I")
	public int method377(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = this.method375(arg0, new int[] { arg1 }, aStringArray1, arg2, (short) 414);
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(27) int local27 = this.method374(aStringArray1[local16], arg2, -1976404756);
			if (local27 > local14) {
				local14 = local27;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!aan", name = "r", descriptor = "(Ljava/lang/String;I[Lclient!aat;S)I")
	public int method378(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2, @OriginalArg(3) short arg3) {
		return this.method375(arg0, new int[] { arg1 }, aStringArray1, arg2, (short) 414);
	}

	@OriginalMember(owner = "client!aan", name = "q", descriptor = "(Ljava/lang/String;I[Lclient!aat;II)Ljava/lang/String;")
	public String method379(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) int local12 = this.method375(arg0, new int[] { arg1 }, aStringArray1, arg2, (short) 414);
		return arg3 >= 0 && arg3 < local12 ? aStringArray1[arg3] : null;
	}

	@OriginalMember(owner = "client!aan", name = "h", descriptor = "(Ljava/lang/String;II[Lclient!aat;B)I")
	public int method380(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface2[] arg3, @OriginalArg(4) byte arg4) {
		if (arg2 == 0) {
			arg2 = this.anInt44 * -1978818351;
		}
		@Pc(20) int local20 = this.method375(arg0, new int[] { arg1 }, aStringArray1, arg3, (short) 414);
		@Pc(26) int local26 = arg2 * (local20 - 1);
		return local26 + this.anInt45 * 1190692343 + this.anInt46 * -191270971;
	}

	@OriginalMember(owner = "client!aan", name = "al", descriptor = "(I)I")
	public int method381(@OriginalArg(0) int arg0) {
		return this.aByteArray9[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!aan", name = "z", descriptor = "(Ljava/lang/String;IIII[Lclient!aat;B)I")
	public int method382(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface2[] arg5, @OriginalArg(6) byte arg6) {
		if (arg2 == 0) {
			arg2 = this.anInt44 * -1978818351;
		}
		@Pc(21) int local21 = this.method395(arg0, new int[] { arg1 }, aStringArray1, arg5, false, (byte) 2);
		if (local21 == 0) {
			return 0;
		}
		if (arg4 < 0) {
			arg4 = 0;
		}
		arg4 /= arg2;
		if (arg4 >= local21) {
			arg4 = local21 - 1;
		}
		@Pc(44) String local44 = aStringArray1[arg4];
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 0;
		@Pc(50) int local50;
		for (local50 = 0; local50 < arg3 && local46 < local44.length(); local50 = this.method374(local44.substring(0, local46), arg5, -1823445462)) {
			local48 = local50;
			local46++;
		}
		if (local46 == local44.length() && local44.endsWith("<br>")) {
			local46 -= 4;
		}
		if (arg3 - local48 < local50 - arg3) {
			local46--;
		}
		for (@Pc(89) int local89 = 0; local89 < arg4; local89++) {
			local46 += aStringArray1[local89].length();
		}
		return local46;
	}

	@OriginalMember(owner = "client!aan", name = "au", descriptor = "(Ljava/lang/String;I[Lclient!aat;)I")
	public int method383(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2) {
		@Pc(12) int local12 = this.method375(arg0, new int[] { arg1 }, aStringArray1, arg2, (short) 414);
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(27) int local27 = this.method374(aStringArray1[local16], arg2, -1871388206);
			if (local27 > local14) {
				local14 = local27;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!aan", name = "o", descriptor = "(II)[S")
	public short[] method384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aShortArrayArray1[arg0];
	}

	@OriginalMember(owner = "client!aan", name = "ba", descriptor = "(Ljava/lang/String;II[Lclient!aat;)I")
	public int method385(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface2[] arg3) {
		if (arg2 == 0) {
			arg2 = this.anInt44 * -1978818351;
		}
		@Pc(20) int local20 = this.method375(arg0, new int[] { arg1 }, aStringArray1, arg3, (short) 414);
		@Pc(26) int local26 = arg2 * (local20 - 1);
		return local26 + this.anInt45 * 1190692343 + this.anInt46 * -191270971;
	}

	@OriginalMember(owner = "client!aan", name = "ad", descriptor = "(Ljava/lang/String;)I")
	public int method391(@OriginalArg(0) String arg0) {
		return this.method374(arg0, null, -1760273575);
	}

	@OriginalMember(owner = "client!aan", name = "ao", descriptor = "(IC)I")
	public int method393(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		return this.aByteArrayArray2 == null ? 0 : this.aByteArrayArray2[arg0][arg1];
	}

	@OriginalMember(owner = "client!aan", name = "an", descriptor = "(Ljava/lang/String;[Lclient!aat;)I")
	public int method394(@OriginalArg(0) String arg0, @OriginalArg(1) Interface2[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = arg0.length();
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(21) char local21 = arg0.charAt(local14);
			if (local21 == '<') {
				local5 = local14;
			} else {
				if (local21 == '>' && local5 != -1) {
					@Pc(40) String local40 = arg0.substring(local5 + 1, local14);
					local5 = -1;
					if (local40.equals("lt")) {
						local21 = '<';
					} else if (local40.equals("gt")) {
						local21 = '>';
					} else if (local40.equals("nbsp")) {
						local21 = ' ';
					} else if (local40.equals("shy")) {
						local21 = '\u00ad';
					} else if (local40.equals("times")) {
						local21 = '×';
					} else if (local40.equals("euro")) {
						local21 = '\u0080';
					} else if (local40.equals("copy")) {
						local21 = '©';
					} else {
						if (!local40.equals("reg")) {
							@Pc(110) int local110;
							if (local40.startsWith("img=") && arg1 != null) {
								try {
									local110 = Class679.method33621(local40.substring(4), 1863954983);
									local9 += arg1[local110].method18214();
									local7 = -1;
								} catch (@Pc(121) Exception local121) {
								}
								continue;
							}
							if (local40.startsWith("sprite=") && this.anInterface1_1 != null) {
								try {
									@Pc(132) boolean local132 = true;
									@Pc(136) int local136 = local40.indexOf(44);
									if (local136 == -1) {
										local110 = Class679.method33621(local40.substring(7), 2011977845);
									} else {
										local110 = Class679.method33621(local40.substring(7, local136), -896765682);
									}
									local9 += this.anInterface1_1.method29584(local110, 141666267);
									local7 = -1;
								} catch (@Pc(165) Exception local165) {
								}
							}
							continue;
						}
						local21 = '®';
					}
				}
				if (local5 == -1) {
					local9 += this.aByteArray9[Class308.method27442(local21, (byte) -7) & 0xFF] & 0xFF;
					if (this.aByteArrayArray2 != null && local7 != -1) {
						local9 += this.aByteArrayArray2[local7][local21];
					}
					local7 = local21;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!aan", name = "x", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;[Lclient!aat;ZB)I")
	int method395(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) Interface2[] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte arg5) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = -1;
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = -1;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = 0;
		@Pc(23) int local23 = arg0.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(36) int local36 = Class308.method27442(arg0.charAt(local25), (byte) 49) & 0xFF;
			@Pc(38) int local38 = 0;
			if (local36 == 60) {
				local16 = local25;
			} else {
				@Pc(53) int local53;
				if (local16 == -1) {
					local53 = local25;
					local38 += this.method369(local36, (short) -9280);
					if (this.aByteArrayArray2 != null && local18 != -1) {
						local38 += this.aByteArrayArray2[local18][local36];
					}
					local18 = local36;
				} else {
					if (local36 != 62) {
						continue;
					}
					local53 = local16;
					@Pc(60) String local60 = arg0.substring(local16 + 1, local25);
					local16 = -1;
					if (local60.equals("br")) {
						arg2[local20] = arg0.substring(local8, local25 + 1);
						local20++;
						if (local20 >= arg2.length) {
							return 0;
						}
						local8 = local25 + 1;
						local6 = 0;
						local10 = -1;
						local18 = -1;
						continue;
					}
					if (local60.equals("lt")) {
						local38 += this.method369(60, (short) -4292);
						if (this.aByteArrayArray2 != null && local18 != -1) {
							local38 += this.aByteArrayArray2[local18][60];
						}
						local18 = 60;
					} else if (local60.equals("gt")) {
						local38 += this.method369(62, (short) -28243);
						if (this.aByteArrayArray2 != null && local18 != -1) {
							local38 += this.aByteArrayArray2[local18][62];
						}
						local18 = 62;
					} else if (local60.equals("nbsp")) {
						local38 += this.method369(160, (short) -18406);
						if (this.aByteArrayArray2 != null && local18 != -1) {
							local38 += this.aByteArrayArray2[local18][160];
						}
						local18 = 160;
					} else if (local60.equals("shy")) {
						local38 += this.method369(173, (short) -2946);
						if (this.aByteArrayArray2 != null && local18 != -1) {
							local38 += this.aByteArrayArray2[local18][173];
						}
						local18 = 173;
					} else if (local60.equals("times")) {
						local38 += this.method369(215, (short) -30299);
						if (this.aByteArrayArray2 != null && local18 != -1) {
							local38 += this.aByteArrayArray2[local18][215];
						}
						local18 = 215;
					} else if (local60.equals("euro")) {
						local38 += this.method369(128, (short) -22705);
						if (this.aByteArrayArray2 != null && local18 != -1) {
							local38 += this.aByteArrayArray2[local18][128];
						}
						local18 = 128;
					} else if (local60.equals("copy")) {
						local38 += this.method369(169, (short) -8089);
						if (this.aByteArrayArray2 != null && local18 != -1) {
							local38 += this.aByteArrayArray2[local18][169];
						}
						local18 = 169;
					} else if (local60.equals("reg")) {
						local38 += this.method369(174, (short) -10878);
						if (this.aByteArrayArray2 != null && local18 != -1) {
							local38 += this.aByteArrayArray2[local18][174];
						}
						local18 = 174;
					} else {
						@Pc(342) int local342;
						if (local60.startsWith("img=") && arg3 != null) {
							try {
								local342 = Class679.method33621(local60.substring(4), -1511652146);
								local38 += arg3[local342].method18214();
								local18 = -1;
							} catch (@Pc(353) Exception local353) {
							}
						} else if (local60.startsWith("sprite=") && this.anInterface1_1 != null) {
							try {
								@Pc(364) boolean local364 = true;
								@Pc(368) int local368 = local60.indexOf(44);
								if (local368 == -1) {
									local342 = Class679.method33621(local60.substring(7), -431818939);
								} else {
									local342 = Class679.method33621(local60.substring(7, local368), 1977223382);
								}
								@Pc(392) int local392 = local38 + this.anInterface1_1.method29584(local342, 141666267);
								local18 = -1;
							} catch (@Pc(397) Exception local397) {
							}
							continue;
						}
					}
					local36 = -1;
				}
				if (local38 > 0) {
					local6 += local38;
					if (arg1 != null) {
						if (local36 == 32) {
							local10 = local25;
							local12 = local6;
							local14 = arg4 ? 1 : 0;
						}
						if (local6 > arg1[local20 < arg1.length ? local20 : arg1.length - 1]) {
							if (local10 >= 0) {
								arg2[local20] = arg0.substring(local8, local10 + 1 - local14);
								local20++;
								if (local20 >= arg2.length) {
									return 0;
								}
								local8 = local10 + 1;
								local10 = -1;
								local6 -= local12;
								local18 = -1;
							} else {
								arg2[local20] = arg0.substring(local8, local53);
								local20++;
								if (local20 >= arg2.length) {
									return 0;
								}
								local8 = local53;
								local10 = -1;
								local6 = local38;
								local18 = -1;
							}
						}
						if (local36 == 45) {
							local10 = local25;
							local12 = local6;
							local14 = 0;
						}
					}
				}
			}
		}
		if (arg0.length() > local8) {
			arg2[local20] = arg0.substring(local8, arg0.length());
			local20++;
		}
		return local20;
	}

	@OriginalMember(owner = "client!aan", name = "ag", descriptor = "(I)I")
	public int method396(@OriginalArg(0) int arg0) {
		return this.aByteArray9[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!aan", name = "ab", descriptor = "(I)I")
	public int method397(@OriginalArg(0) int arg0) {
		return this.aByteArray9[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!aan", name = "bg", descriptor = "(Ljava/lang/String;I[Lclient!aat;I)Ljava/lang/String;")
	public String method398(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = this.method375(arg0, new int[] { arg1 }, aStringArray1, arg2, (short) 414);
		return arg3 >= 0 && arg3 < local12 ? aStringArray1[arg3] : null;
	}

	@OriginalMember(owner = "client!aan", name = "ah", descriptor = "(I)I")
	public int method399(@OriginalArg(0) int arg0) {
		return this.aByteArray11[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!aan", name = "af", descriptor = "(I)I")
	public int method400(@OriginalArg(0) int arg0) {
		return this.aByteArray11[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!aan", name = "m", descriptor = "(II)I")
	public int method401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray10[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!aan", name = "d", descriptor = "(Ljava/lang/String;III[Lclient!aat;B)Ljava/awt/Point;")
	public Point method402(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface2[] arg4, @OriginalArg(5) byte arg5) {
		if (arg3 <= 0) {
			return new Point(0, arg2 + this.anInt45 * 1190692343);
		}
		if (arg3 > arg0.length()) {
			arg3 = arg0.length();
		}
		if (arg2 == 0) {
			arg2 = this.anInt44 * -1978818351;
		}
		@Pc(41) int local41 = this.method395(arg0, new int[] { arg1 }, aStringArray1, arg4, false, (byte) 2);
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < local41; local45++) {
			@Pc(53) int local53 = aStringArray1[local45].length();
			if (local43 + local53 > arg3 || local41 - 1 == local45 && arg3 == arg0.length()) {
				@Pc(72) String local72 = arg0.substring(local43, arg3);
				if (local72.endsWith("<br>")) {
					local72 = "";
					@Pc(81) int local81 = local43 + local53;
					local45++;
				}
				@Pc(89) int local89 = this.method374(local72, arg4, -2118787968);
				@Pc(98) int local98 = this.anInt45 * 1190692343 + local45 * arg2;
				return new Point(local89, local98);
			}
			local43 += local53;
		}
		return null;
	}

	@OriginalMember(owner = "client!aan", name = "at", descriptor = "(Ljava/lang/String;)I")
	public int method403(@OriginalArg(0) String arg0) {
		return this.method374(arg0, null, -1872004902);
	}

	@OriginalMember(owner = "client!aan", name = "bt", descriptor = "(Ljava/lang/String;IIII[Lclient!aat;)I")
	public int method404(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface2[] arg5) {
		if (arg2 == 0) {
			arg2 = this.anInt44 * -1978818351;
		}
		@Pc(21) int local21 = this.method395(arg0, new int[] { arg1 }, aStringArray1, arg5, false, (byte) 2);
		if (local21 == 0) {
			return 0;
		}
		if (arg4 < 0) {
			arg4 = 0;
		}
		arg4 /= arg2;
		if (arg4 >= local21) {
			arg4 = local21 - 1;
		}
		@Pc(44) String local44 = aStringArray1[arg4];
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 0;
		@Pc(50) int local50;
		for (local50 = 0; local50 < arg3 && local46 < local44.length(); local50 = this.method374(local44.substring(0, local46), arg5, -1936846551)) {
			local48 = local50;
			local46++;
		}
		if (local46 == local44.length() && local44.endsWith("<br>")) {
			local46 -= 4;
		}
		if (arg3 - local48 < local50 - arg3) {
			local46--;
		}
		for (@Pc(89) int local89 = 0; local89 < arg4; local89++) {
			local46 += aStringArray1[local89].length();
		}
		return local46;
	}

	@OriginalMember(owner = "client!aan", name = "av", descriptor = "(Ljava/lang/String;[Lclient!aat;)I")
	public int method405(@OriginalArg(0) String arg0, @OriginalArg(1) Interface2[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = arg0.length();
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(21) char local21 = arg0.charAt(local14);
			if (local21 == '<') {
				local5 = local14;
			} else {
				if (local21 == '>' && local5 != -1) {
					@Pc(40) String local40 = arg0.substring(local5 + 1, local14);
					local5 = -1;
					if (local40.equals("lt")) {
						local21 = '<';
					} else if (local40.equals("gt")) {
						local21 = '>';
					} else if (local40.equals("nbsp")) {
						local21 = ' ';
					} else if (local40.equals("shy")) {
						local21 = '\u00ad';
					} else if (local40.equals("times")) {
						local21 = '×';
					} else if (local40.equals("euro")) {
						local21 = '\u0080';
					} else if (local40.equals("copy")) {
						local21 = '©';
					} else {
						if (!local40.equals("reg")) {
							@Pc(110) int local110;
							if (local40.startsWith("img=") && arg1 != null) {
								try {
									local110 = Class679.method33621(local40.substring(4), -1262394068);
									local9 += arg1[local110].method18214();
									local7 = -1;
								} catch (@Pc(121) Exception local121) {
								}
								continue;
							}
							if (local40.startsWith("sprite=") && this.anInterface1_1 != null) {
								try {
									@Pc(132) boolean local132 = true;
									@Pc(136) int local136 = local40.indexOf(44);
									if (local136 == -1) {
										local110 = Class679.method33621(local40.substring(7), 1914596103);
									} else {
										local110 = Class679.method33621(local40.substring(7, local136), -1419749186);
									}
									local9 += this.anInterface1_1.method29584(local110, 141666267);
									local7 = -1;
								} catch (@Pc(165) Exception local165) {
								}
							}
							continue;
						}
						local21 = '®';
					}
				}
				if (local5 == -1) {
					local9 += this.aByteArray9[Class308.method27442(local21, (byte) -62) & 0xFF] & 0xFF;
					if (this.aByteArrayArray2 != null && local7 != -1) {
						local9 += this.aByteArrayArray2[local7][local21];
					}
					local7 = local21;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!aan", name = "ak", descriptor = "(I)[S")
	public short[] method406(@OriginalArg(0) int arg0) {
		return this.aShortArrayArray1[arg0];
	}

	@OriginalMember(owner = "client!aan", name = "aa", descriptor = "(Ljava/lang/String;I[Lclient!aat;)Ljava/lang/String;")
	public String method407(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2) {
		if (this.method374(arg0, arg2, -1949423157) <= arg1) {
			return arg0;
		}
		@Pc(16) int local16 = arg1 - this.method374("...", null, -2108444688);
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = -1;
		@Pc(22) int local22 = 0;
		@Pc(25) int local25 = arg0.length();
		@Pc(27) String local27 = "";
		for (@Pc(29) int local29 = 0; local29 < local25; local29++) {
			@Pc(36) char local36 = arg0.charAt(local29);
			if (local36 == '<') {
				local18 = local29;
			} else {
				if (local36 == '>' && local18 != -1) {
					@Pc(55) String local55 = arg0.substring(local18 + 1, local29);
					local18 = -1;
					if (local55.equals("lt")) {
						local36 = '<';
					} else if (local55.equals("gt")) {
						local36 = '>';
					} else if (local55.equals("nbsp")) {
						local36 = ' ';
					} else if (local55.equals("shy")) {
						local36 = '\u00ad';
					} else if (local55.equals("times")) {
						local36 = '×';
					} else if (local55.equals("euro")) {
						local36 = '\u0080';
					} else if (local55.equals("copy")) {
						local36 = '©';
					} else {
						if (!local55.equals("reg")) {
							@Pc(126) int local126;
							if (local55.startsWith("img=") && arg2 != null) {
								try {
									local126 = Class679.method33621(local55.substring(4), 480448575);
									local22 += arg2[local126].method18214();
									local20 = -1;
									if (local22 > local16) {
										return local27 + "...";
									}
									local27 = arg0.substring(0, local29 + 1);
								} catch (@Pc(156) Exception local156) {
								}
								continue;
							}
							if (local55.startsWith("sprite=") && this.anInterface1_1 != null) {
								try {
									@Pc(167) boolean local167 = true;
									@Pc(171) int local171 = local55.indexOf(44);
									if (local171 == -1) {
										local126 = Class679.method33621(local55.substring(7), 1706630781);
									} else {
										local126 = Class679.method33621(local55.substring(7, local171), 1963809433);
									}
									local22 += this.anInterface1_1.method29584(local126, 141666267);
									local20 = -1;
									if (local22 > local16) {
										return local27 + "...";
									}
									local27 = arg0.substring(0, local29 + 1);
								} catch (@Pc(219) Exception local219) {
								}
							}
							continue;
						}
						local36 = '®';
					}
				}
				if (local18 == -1) {
					local22 += this.aByteArray9[Class308.method27442(local36, (byte) 32) & 0xFF] & 0xFF;
					if (this.aByteArrayArray2 != null && local20 != -1) {
						local22 += this.aByteArrayArray2[local20][local36];
					}
					local20 = local36;
					@Pc(255) int local255 = local22;
					if (this.aByteArrayArray2 != null) {
						local255 = local22 + this.aByteArrayArray2[local36][46];
					}
					if (local255 > local16) {
						return local27 + "...";
					}
					local27 = arg0.substring(0, local29 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!aan", name = "ap", descriptor = "(Ljava/lang/String;I[Lclient!aat;)I")
	public int method409(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2) {
		@Pc(12) int local12 = this.method375(arg0, new int[] { arg1 }, aStringArray1, arg2, (short) 414);
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(27) int local27 = this.method374(aStringArray1[local16], arg2, -2082358569);
			if (local27 > local14) {
				local14 = local27;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!aan", name = "ar", descriptor = "(Ljava/lang/String;I[Lclient!aat;)I")
	public int method410(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2) {
		@Pc(12) int local12 = this.method375(arg0, new int[] { arg1 }, aStringArray1, arg2, (short) 414);
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(27) int local27 = this.method374(aStringArray1[local16], arg2, -1816544138);
			if (local27 > local14) {
				local14 = local27;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!aan", name = "am", descriptor = "(I)I")
	public int method411(@OriginalArg(0) int arg0) {
		return this.aByteArray10[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!aan", name = "az", descriptor = "(Ljava/lang/String;I[Lclient!aat;)I")
	public int method412(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2) {
		return this.method375(arg0, new int[] { arg1 }, aStringArray1, arg2, (short) 414);
	}

	@OriginalMember(owner = "client!aan", name = "as", descriptor = "(Ljava/lang/String;I[Lclient!aat;)I")
	public int method413(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2) {
		return this.method375(arg0, new int[] { arg1 }, aStringArray1, arg2, (short) 414);
	}

	@OriginalMember(owner = "client!aan", name = "aw", descriptor = "(Ljava/lang/String;I[Lclient!aat;I)Ljava/lang/String;")
	public String method414(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = this.method375(arg0, new int[] { arg1 }, aStringArray1, arg2, (short) 414);
		return arg3 >= 0 && arg3 < local12 ? aStringArray1[arg3] : null;
	}

	@OriginalMember(owner = "client!aan", name = "bl", descriptor = "(Ljava/lang/String;I[Lclient!aat;I)Ljava/lang/String;")
	public String method416(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = this.method375(arg0, new int[] { arg1 }, aStringArray1, arg2, (short) 414);
		return arg3 >= 0 && arg3 < local12 ? aStringArray1[arg3] : null;
	}

	@OriginalMember(owner = "client!aan", name = "br", descriptor = "(Ljava/lang/String;I[Lclient!aat;I)Ljava/lang/String;")
	public String method417(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = this.method375(arg0, new int[] { arg1 }, aStringArray1, arg2, (short) 414);
		return arg3 >= 0 && arg3 < local12 ? aStringArray1[arg3] : null;
	}

	@OriginalMember(owner = "client!aan", name = "bn", descriptor = "(Ljava/lang/String;II[Lclient!aat;)I")
	public int method418(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface2[] arg3) {
		if (arg2 == 0) {
			arg2 = this.anInt44 * -1978818351;
		}
		@Pc(20) int local20 = this.method375(arg0, new int[] { arg1 }, aStringArray1, arg3, (short) 414);
		@Pc(26) int local26 = arg2 * (local20 - 1);
		return local26 + this.anInt45 * 1190692343 + this.anInt46 * -191270971;
	}

	@OriginalMember(owner = "client!aan", name = "s", descriptor = "(Ljava/lang/String;I[Lclient!aat;I)Ljava/lang/String;")
	public String method420(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2, @OriginalArg(3) int arg3) {
		if (this.method374(arg0, arg2, -2030411866) <= arg1) {
			return arg0;
		}
		@Pc(16) int local16 = arg1 - this.method374("...", null, -1854710755);
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = -1;
		@Pc(22) int local22 = 0;
		@Pc(25) int local25 = arg0.length();
		@Pc(27) String local27 = "";
		for (@Pc(29) int local29 = 0; local29 < local25; local29++) {
			@Pc(36) char local36 = arg0.charAt(local29);
			if (local36 == '<') {
				local18 = local29;
			} else {
				if (local36 == '>' && local18 != -1) {
					@Pc(55) String local55 = arg0.substring(local18 + 1, local29);
					local18 = -1;
					if (local55.equals("lt")) {
						local36 = '<';
					} else if (local55.equals("gt")) {
						local36 = '>';
					} else if (local55.equals("nbsp")) {
						local36 = ' ';
					} else if (local55.equals("shy")) {
						local36 = '\u00ad';
					} else if (local55.equals("times")) {
						local36 = '×';
					} else if (local55.equals("euro")) {
						local36 = '\u0080';
					} else if (local55.equals("copy")) {
						local36 = '©';
					} else {
						if (!local55.equals("reg")) {
							@Pc(126) int local126;
							if (local55.startsWith("img=") && arg2 != null) {
								try {
									local126 = Class679.method33621(local55.substring(4), 53942328);
									local22 += arg2[local126].method18214();
									local20 = -1;
									if (local22 > local16) {
										return local27 + "...";
									}
									local27 = arg0.substring(0, local29 + 1);
								} catch (@Pc(156) Exception local156) {
								}
								continue;
							}
							if (local55.startsWith("sprite=") && this.anInterface1_1 != null) {
								try {
									@Pc(167) boolean local167 = true;
									@Pc(171) int local171 = local55.indexOf(44);
									if (local171 == -1) {
										local126 = Class679.method33621(local55.substring(7), -837203275);
									} else {
										local126 = Class679.method33621(local55.substring(7, local171), -696173956);
									}
									local22 += this.anInterface1_1.method29584(local126, 141666267);
									local20 = -1;
									if (local22 > local16) {
										return local27 + "...";
									}
									local27 = arg0.substring(0, local29 + 1);
								} catch (@Pc(219) Exception local219) {
								}
							}
							continue;
						}
						local36 = '®';
					}
				}
				if (local18 == -1) {
					local22 += this.aByteArray9[Class308.method27442(local36, (byte) 24) & 0xFF] & 0xFF;
					if (this.aByteArrayArray2 != null && local20 != -1) {
						local22 += this.aByteArrayArray2[local20][local36];
					}
					local20 = local36;
					@Pc(255) int local255 = local22;
					if (this.aByteArrayArray2 != null) {
						local255 = local22 + this.aByteArrayArray2[local36][46];
					}
					if (local255 > local16) {
						return local27 + "...";
					}
					local27 = arg0.substring(0, local29 + 1);
				}
			}
		}
		return arg0;
	}
}
