package com.jagex;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aac")
public class Class5 {

	@OriginalMember(owner = "client!aac", name = "uf", descriptor = "I")
	static int anInt14;

	@OriginalMember(owner = "client!aac", name = "v", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray1 = new String[100];

	@OriginalMember(owner = "client!aac", name = "o", descriptor = "Lclient!aaw;")
	public final Interface1 anInterface1_1;

	@OriginalMember(owner = "client!aac", name = "n", descriptor = "[B")
	byte[] aByteArray3;

	@OriginalMember(owner = "client!aac", name = "e", descriptor = "[B")
	byte[] aByteArray1;

	@OriginalMember(owner = "client!aac", name = "k", descriptor = "[B")
	byte[] aByteArray2;

	@OriginalMember(owner = "client!aac", name = "r", descriptor = "[[S")
	short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!aac", name = "d", descriptor = "I")
	public int anInt12;

	@OriginalMember(owner = "client!aac", name = "c", descriptor = "I")
	public int anInt13;

	@OriginalMember(owner = "client!aac", name = "m", descriptor = "[[B")
	byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!aac", name = "f", descriptor = "I")
	public int anInt7;

	@OriginalMember(owner = "client!aac", name = "u", descriptor = "I")
	public int anInt9;

	@OriginalMember(owner = "client!aac", name = "z", descriptor = "I")
	public int anInt8;

	@OriginalMember(owner = "client!aac", name = "w", descriptor = "I")
	public int anInt6;

	@OriginalMember(owner = "client!aac", name = "l", descriptor = "I")
	public int anInt10;

	@OriginalMember(owner = "client!aac", name = "p", descriptor = "I")
	public int anInt11;

	@OriginalMember(owner = "client!aac", name = "e", descriptor = "(Lclient!alw;B)Lclient!ne;", line = 13)
	public static Class434 method31(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class434 local3 = new Class434();
		local3.anInt4807 = arg0.g2(-1434290800) * -1924523377;
		local3.aClass93_Sub1_Sub18_1 = Class372.aClass58_2.method1094(local3.anInt4807 * 526894191, -737304293);
		return local3;
	}

	@OriginalMember(owner = "client!aac", name = "h", descriptor = "(Lclient!py;II)Lclient!aac;", line = 26)
	public static Class5 method32(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Class446.method28894(arg0, arg1, arg2, null, -1150628510);
	}

	@OriginalMember(owner = "client!aac", name = "a", descriptor = "(Lclient!py;II)Lclient!aac;", line = 26)
	public static Class5 method33(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Class446.method28894(arg0, arg1, arg2, null, 1261778633);
	}

	@OriginalMember(owner = "client!aac", name = "n", descriptor = "(II)I", line = 28)
	public static int method34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(19) int local19 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(27) int local27 = local19 + (local19 >>> 4) & 0xF0F0F0F;
		@Pc(33) int local33 = local27 + (local27 >>> 8);
		@Pc(39) int local39 = local33 + (local33 >>> 16);
		return local39 & 0xFF;
	}

	@OriginalMember(owner = "client!aac", name = "g", descriptor = "(Lclient!py;IILclient!aaw;)Lclient!aac;", line = 30)
	public static Class5 method35(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface1 arg3) {
		@Pc(5) byte[] local5 = arg0.method30064(arg1, arg2, (byte) 0);
		return local5 == null ? null : new Class5(local5, arg3);
	}

	@OriginalMember(owner = "client!aac", name = "ae", descriptor = "(Lclient!py;ILclient!aaw;)Lclient!aac;", line = 36)
	public static Class5 method36(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface1 arg2) {
		@Pc(4) byte[] local4 = arg0.method30079(arg1, (byte) 22);
		return local4 == null ? null : new Class5(local4, arg2);
	}

	@OriginalMember(owner = "client!aac", name = "i", descriptor = "(Lclient!py;ILclient!aaw;)Lclient!aac;", line = 36)
	public static Class5 method37(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface1 arg2) {
		@Pc(4) byte[] local4 = arg0.method30079(arg1, (byte) 106);
		return local4 == null ? null : new Class5(local4, arg2);
	}

	@OriginalMember(owner = "client!aac", name = "j", descriptor = "(Lclient!py;ILclient!aaw;)Lclient!aac;", line = 36)
	public static Class5 method38(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface1 arg2) {
		@Pc(4) byte[] local4 = arg0.method30079(arg1, (byte) 73);
		return local4 == null ? null : new Class5(local4, arg2);
	}

	@OriginalMember(owner = "client!aac", name = "t", descriptor = "(Lclient!py;ILclient!aaw;)Lclient!aac;", line = 36)
	public static Class5 method39(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface1 arg2) {
		@Pc(4) byte[] local4 = arg0.method30079(arg1, (byte) 48);
		return local4 == null ? null : new Class5(local4, arg2);
	}

	@OriginalMember(owner = "client!aac", name = "<init>", descriptor = "([BLclient!aaw;)V", line = 41)
	Class5(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Interface1 arg1) {
		this.anInterface1_1 = arg1;
		@Pc(9) Packet local9 = new Packet(arg0);
		@Pc(13) int local13 = local9.g1((short) 16384);
		if (local13 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local9.g1((short) 16384) == 1;
		this.aByteArray3 = new byte[256];
		local9.gdata(this.aByteArray3, 0, 256, (short) 16190);
		this.aByteArray1 = new byte[256];
		local9.gdata(this.aByteArray1, 0, 256, (short) 11301);
		this.aByteArray2 = new byte[256];
		local9.gdata(this.aByteArray2, 0, 256, (short) 2803);
		this.aShortArrayArray1 = new short[256][4];
		this.anInt12 = local9.g2(-1434290800) * -535085581;
		this.anInt13 = local9.g2(-1434290800) * 2057731677;
		@Pc(84) int local84;
		for (local84 = 0; local84 < 256; local84++) {
			this.aShortArrayArray1[local84][0] = (short) local9.g2(-1434290800);
		}
		for (local84 = 0; local84 < 256; local84++) {
			this.aShortArrayArray1[local84][1] = (short) local9.g2(-1434290800);
		}
		for (local84 = 0; local84 < 256; local84++) {
			this.aShortArrayArray1[local84][2] = this.aByteArray3[local84];
			this.aShortArrayArray1[local84][3] = this.aByteArray1[local84];
		}
		@Pc(152) int local152;
		if (local30) {
			@Pc(150) byte[][] local150 = new byte[256][];
			@Pc(167) int local167;
			for (local152 = 0; local152 < 256; local152++) {
				local150[local152] = new byte[this.aByteArray1[local152]];
				@Pc(165) byte local165 = 0;
				for (local167 = 0; local167 < local150[local152].length; local167++) {
					local165 += local9.g1b(526491709);
					local150[local152][local167] = local165;
				}
			}
			@Pc(193) byte[][] local193 = new byte[256][];
			@Pc(195) int local195;
			for (local195 = 0; local195 < 256; local195++) {
				local193[local195] = new byte[this.aByteArray1[local195]];
				@Pc(208) byte local208 = 0;
				for (@Pc(210) int local210 = 0; local210 < local193[local195].length; local210++) {
					local208 += local9.g1b(1764571622);
					local193[local195][local210] = local208;
				}
			}
			this.aByteArrayArray1 = new byte[256][256];
			for (local195 = 0; local195 < 256; local195++) {
				if (local195 != 32 && local195 != 160) {
					for (local167 = 0; local167 < 256; local167++) {
						if (local167 != 32 && local167 != 160) {
							this.aByteArrayArray1[local195][local167] = (byte) Class650.method32668(local150, local193, this.aByteArray2, this.aByteArray3, this.aByteArray1, local195, local167, (byte) 96);
						}
					}
				}
			}
			this.anInt7 = (this.aByteArray2[32] + this.aByteArray1[32]) * -744138367;
		} else {
			this.anInt7 = local9.g1((short) 16384) * -744138367;
		}
		this.anInt9 = local9.g1((short) 16384) * -1209958315;
		this.anInt8 = local9.g1((short) 16384) * -991427611;
		this.anInt6 = local9.g1((short) 16384) * 1756701383;
		this.anInt10 = local9.g1((short) 16384) * -144696809;
		this.anInt11 = local9.g1((short) 16384) * -1904958279;
		if (this.anInt11 * 286794121 != 1) {
			this.anInt7 = this.anInt7 * -2059082111 / (this.anInt11 * 286794121) * -744138367;
			this.anInt9 = this.anInt9 * 1796177149 / (this.anInt11 * 286794121) * -1209958315;
			this.anInt8 = this.anInt8 * 1717993965 / (this.anInt11 * 286794121) * -991427611;
			this.anInt6 = this.anInt6 * -8978697 / (this.anInt11 * 286794121) * 1756701383;
			this.anInt10 = this.anInt10 * -1093354073 / (this.anInt11 * 286794121) * -144696809;
			for (local84 = 0; local84 < 256; local84++) {
				this.aByteArray3[local84] = (byte) (this.aByteArray3[local84] / (this.anInt11 * 286794121));
				this.aByteArray1[local84] = (byte) (this.aByteArray1[local84] / (this.anInt11 * 286794121));
				this.aByteArray2[local84] = (byte) (this.aByteArray2[local84] / (this.anInt11 * 286794121));
			}
			if (local30) {
				for (local84 = 0; local84 < 256; local84++) {
					for (local152 = 0; local152 < 256; local152++) {
						this.aByteArrayArray1[local84][local152] = (byte) (this.aByteArrayArray1[local84][local152] / (this.anInt11 * 286794121));
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aac", name = "e", descriptor = "(ILjava/awt/Canvas;Lclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;Lclient!py;II)Lclient!dh;", line = 53)
	public static Class104 method40(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class225 arg2, @OriginalArg(3) Interface24 arg3, @OriginalArg(4) Interface48 arg4, @OriginalArg(5) Interface46 arg5, @OriginalArg(6) Interface47 arg6, @OriginalArg(7) Class497 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		if (arg1 != null) {
			@Pc(9) Dimension local9 = arg1.getSize();
			local1 = local9.width;
			local3 = local9.height;
		}
		return Class104.method20415(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, local1, local3, 999922012);
	}

	@OriginalMember(owner = "client!aac", name = "ag", descriptor = "([[B[[B[B[B[BII)I", line = 119)
	static int method41(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) byte local3 = arg2[arg5];
		@Pc(9) int local9 = local3 + arg4[arg5];
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

	@OriginalMember(owner = "client!aac", name = "ah", descriptor = "([[B[[B[B[B[BII)I", line = 119)
	static int method42(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) byte local3 = arg2[arg5];
		@Pc(9) int local9 = local3 + arg4[arg5];
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

	@OriginalMember(owner = "client!aac", name = "f", descriptor = "(ICB)I", line = 141)
	public int method43(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) byte arg2) {
		return this.aByteArrayArray1 == null ? 0 : this.aByteArrayArray1[arg0][arg1];
	}

	@OriginalMember(owner = "client!aac", name = "al", descriptor = "(I)I", line = 146)
	public int method44(@OriginalArg(0) int arg0) {
		return this.aByteArray3[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!aac", name = "w", descriptor = "(IB)I", line = 146)
	public int method45(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.aByteArray3[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!aac", name = "l", descriptor = "(II)I", line = 150)
	public int method46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray1[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!aac", name = "ac", descriptor = "(I)I", line = 154)
	public int method47(@OriginalArg(0) int arg0) {
		return this.aByteArray2[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!aac", name = "ai", descriptor = "(I)I", line = 154)
	public int method48(@OriginalArg(0) int arg0) {
		return this.aByteArray2[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!aac", name = "u", descriptor = "(IB)I", line = 154)
	public int method49(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.aByteArray2[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!aac", name = "aw", descriptor = "(I)[S", line = 158)
	public short[] method50(@OriginalArg(0) int arg0) {
		return this.aShortArrayArray1[arg0];
	}

	@OriginalMember(owner = "client!aac", name = "as", descriptor = "(I)[S", line = 158)
	public short[] method51(@OriginalArg(0) int arg0) {
		return this.aShortArrayArray1[arg0];
	}

	@OriginalMember(owner = "client!aac", name = "z", descriptor = "(II)[S", line = 158)
	public short[] method52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aShortArrayArray1[arg0];
	}

	@OriginalMember(owner = "client!aac", name = "p", descriptor = "(Ljava/lang/String;I)I", line = 162)
	public int method53(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method55(arg0, null, (byte) -117);
	}

	@OriginalMember(owner = "client!aac", name = "au", descriptor = "(Ljava/lang/String;[Lclient!aay;)I", line = 166)
	public int method54(@OriginalArg(0) String arg0, @OriginalArg(1) Interface2[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		@Pc(13) int local13 = arg0.length();
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			@Pc(22) char local22 = arg0.charAt(local15);
			if (local22 == '<') {
				local6 = local15;
			} else {
				if (local22 == '>' && local6 != -1) {
					@Pc(41) String local41 = arg0.substring(local6 + 1, local15);
					local6 = -1;
					if (local41.equals("lt")) {
						local22 = '<';
					} else if (local41.equals("gt")) {
						local22 = '>';
					} else if (local41.equals("nbsp")) {
						local22 = ' ';
					} else if (local41.equals("shy")) {
						local22 = '\u00ad';
					} else if (local41.equals("times")) {
						local22 = '×';
					} else if (local41.equals("euro")) {
						local22 = '\u0080';
					} else if (local41.equals("copy")) {
						local22 = '©';
					} else {
						if (!local41.equals("reg")) {
							@Pc(111) int local111;
							if (local41.startsWith("img=") && arg1 != null) {
								try {
									local111 = Class616.method32090(local41.substring(4), (byte) 8);
									local10 += arg1[local111].method18160();
									local8 = -1;
								} catch (@Pc(122) Exception local122) {
								}
								continue;
							}
							if (local41.startsWith("sprite=") && this.anInterface1_1 != null) {
								try {
									@Pc(132) boolean local132 = true;
									@Pc(136) int local136 = local41.indexOf(44);
									if (local136 == -1) {
										local111 = Class616.method32090(local41.substring(7), (byte) 8);
									} else {
										local111 = Class616.method32090(local41.substring(7, local136), (byte) 8);
									}
									local10 += this.anInterface1_1.method29232(local111, 345803169);
									local8 = -1;
								} catch (@Pc(165) Exception local165) {
								}
							}
							continue;
						}
						local22 = '®';
					}
				}
				if (local6 == -1) {
					local10 += this.aByteArray3[Class138_Sub3.method11406(local22, 2131667517) & 0xFF] & 0xFF;
					if (this.aByteArrayArray1 != null && local8 != -1) {
						local10 += this.aByteArrayArray1[local8][local22];
					}
					local8 = local22;
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!aac", name = "d", descriptor = "(Ljava/lang/String;[Lclient!aay;B)I", line = 166)
	public int method55(@OriginalArg(0) String arg0, @OriginalArg(1) Interface2[] arg1, @OriginalArg(2) byte arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		@Pc(13) int local13 = arg0.length();
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			@Pc(22) char local22 = arg0.charAt(local15);
			if (local22 == '<') {
				local6 = local15;
			} else {
				if (local22 == '>' && local6 != -1) {
					@Pc(41) String local41 = arg0.substring(local6 + 1, local15);
					local6 = -1;
					if (local41.equals("lt")) {
						local22 = '<';
					} else if (local41.equals("gt")) {
						local22 = '>';
					} else if (local41.equals("nbsp")) {
						local22 = ' ';
					} else if (local41.equals("shy")) {
						local22 = '\u00ad';
					} else if (local41.equals("times")) {
						local22 = '×';
					} else if (local41.equals("euro")) {
						local22 = '\u0080';
					} else if (local41.equals("copy")) {
						local22 = '©';
					} else {
						if (!local41.equals("reg")) {
							@Pc(111) int local111;
							if (local41.startsWith("img=") && arg1 != null) {
								try {
									local111 = Class616.method32090(local41.substring(4), (byte) 8);
									local10 += arg1[local111].method18160();
									local8 = -1;
								} catch (@Pc(122) Exception local122) {
								}
								continue;
							}
							if (local41.startsWith("sprite=") && this.anInterface1_1 != null) {
								try {
									@Pc(132) boolean local132 = true;
									@Pc(136) int local136 = local41.indexOf(44);
									if (local136 == -1) {
										local111 = Class616.method32090(local41.substring(7), (byte) 8);
									} else {
										local111 = Class616.method32090(local41.substring(7, local136), (byte) 8);
									}
									local10 += this.anInterface1_1.method29232(local111, -1557198);
									local8 = -1;
								} catch (@Pc(165) Exception local165) {
								}
							}
							continue;
						}
						local22 = '®';
					}
				}
				if (local6 == -1) {
					local10 += this.aByteArray3[Class138_Sub3.method11406(local22, 2022215685) & 0xFF] & 0xFF;
					if (this.aByteArrayArray1 != null && local8 != -1) {
						local10 += this.aByteArrayArray1[local8][local22];
					}
					local8 = local22;
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!aac", name = "am", descriptor = "(Ljava/lang/String;[Lclient!aay;)I", line = 166)
	public int method56(@OriginalArg(0) String arg0, @OriginalArg(1) Interface2[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		@Pc(13) int local13 = arg0.length();
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			@Pc(22) char local22 = arg0.charAt(local15);
			if (local22 == '<') {
				local6 = local15;
			} else {
				if (local22 == '>' && local6 != -1) {
					@Pc(41) String local41 = arg0.substring(local6 + 1, local15);
					local6 = -1;
					if (local41.equals("lt")) {
						local22 = '<';
					} else if (local41.equals("gt")) {
						local22 = '>';
					} else if (local41.equals("nbsp")) {
						local22 = ' ';
					} else if (local41.equals("shy")) {
						local22 = '\u00ad';
					} else if (local41.equals("times")) {
						local22 = '×';
					} else if (local41.equals("euro")) {
						local22 = '\u0080';
					} else if (local41.equals("copy")) {
						local22 = '©';
					} else {
						if (!local41.equals("reg")) {
							@Pc(111) int local111;
							if (local41.startsWith("img=") && arg1 != null) {
								try {
									local111 = Class616.method32090(local41.substring(4), (byte) 8);
									local10 += arg1[local111].method18160();
									local8 = -1;
								} catch (@Pc(122) Exception local122) {
								}
								continue;
							}
							if (local41.startsWith("sprite=") && this.anInterface1_1 != null) {
								try {
									@Pc(132) boolean local132 = true;
									@Pc(136) int local136 = local41.indexOf(44);
									if (local136 == -1) {
										local111 = Class616.method32090(local41.substring(7), (byte) 8);
									} else {
										local111 = Class616.method32090(local41.substring(7, local136), (byte) 8);
									}
									local10 += this.anInterface1_1.method29232(local111, -1142002331);
									local8 = -1;
								} catch (@Pc(165) Exception local165) {
								}
							}
							continue;
						}
						local22 = '®';
					}
				}
				if (local6 == -1) {
					local10 += this.aByteArray3[Class138_Sub3.method11406(local22, 1727440857) & 0xFF] & 0xFF;
					if (this.aByteArrayArray1 != null && local8 != -1) {
						local10 += this.aByteArrayArray1[local8][local22];
					}
					local8 = local22;
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!aac", name = "at", descriptor = "(Ljava/lang/String;[Lclient!aay;)I", line = 166)
	public int method57(@OriginalArg(0) String arg0, @OriginalArg(1) Interface2[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		@Pc(13) int local13 = arg0.length();
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			@Pc(22) char local22 = arg0.charAt(local15);
			if (local22 == '<') {
				local6 = local15;
			} else {
				if (local22 == '>' && local6 != -1) {
					@Pc(41) String local41 = arg0.substring(local6 + 1, local15);
					local6 = -1;
					if (local41.equals("lt")) {
						local22 = '<';
					} else if (local41.equals("gt")) {
						local22 = '>';
					} else if (local41.equals("nbsp")) {
						local22 = ' ';
					} else if (local41.equals("shy")) {
						local22 = '\u00ad';
					} else if (local41.equals("times")) {
						local22 = '×';
					} else if (local41.equals("euro")) {
						local22 = '\u0080';
					} else if (local41.equals("copy")) {
						local22 = '©';
					} else {
						if (!local41.equals("reg")) {
							@Pc(111) int local111;
							if (local41.startsWith("img=") && arg1 != null) {
								try {
									local111 = Class616.method32090(local41.substring(4), (byte) 8);
									local10 += arg1[local111].method18160();
									local8 = -1;
								} catch (@Pc(122) Exception local122) {
								}
								continue;
							}
							if (local41.startsWith("sprite=") && this.anInterface1_1 != null) {
								try {
									@Pc(132) boolean local132 = true;
									@Pc(136) int local136 = local41.indexOf(44);
									if (local136 == -1) {
										local111 = Class616.method32090(local41.substring(7), (byte) 8);
									} else {
										local111 = Class616.method32090(local41.substring(7, local136), (byte) 8);
									}
									local10 += this.anInterface1_1.method29232(local111, -513420382);
									local8 = -1;
								} catch (@Pc(165) Exception local165) {
								}
							}
							continue;
						}
						local22 = '®';
					}
				}
				if (local6 == -1) {
					local10 += this.aByteArray3[Class138_Sub3.method11406(local22, 2005760029) & 0xFF] & 0xFF;
					if (this.aByteArrayArray1 != null && local8 != -1) {
						local10 += this.aByteArrayArray1[local8][local22];
					}
					local8 = local22;
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!aac", name = "ad", descriptor = "(Ljava/lang/String;[Lclient!aay;)I", line = 166)
	public int method58(@OriginalArg(0) String arg0, @OriginalArg(1) Interface2[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		@Pc(13) int local13 = arg0.length();
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			@Pc(22) char local22 = arg0.charAt(local15);
			if (local22 == '<') {
				local6 = local15;
			} else {
				if (local22 == '>' && local6 != -1) {
					@Pc(41) String local41 = arg0.substring(local6 + 1, local15);
					local6 = -1;
					if (local41.equals("lt")) {
						local22 = '<';
					} else if (local41.equals("gt")) {
						local22 = '>';
					} else if (local41.equals("nbsp")) {
						local22 = ' ';
					} else if (local41.equals("shy")) {
						local22 = '\u00ad';
					} else if (local41.equals("times")) {
						local22 = '×';
					} else if (local41.equals("euro")) {
						local22 = '\u0080';
					} else if (local41.equals("copy")) {
						local22 = '©';
					} else {
						if (!local41.equals("reg")) {
							@Pc(111) int local111;
							if (local41.startsWith("img=") && arg1 != null) {
								try {
									local111 = Class616.method32090(local41.substring(4), (byte) 8);
									local10 += arg1[local111].method18160();
									local8 = -1;
								} catch (@Pc(122) Exception local122) {
								}
								continue;
							}
							if (local41.startsWith("sprite=") && this.anInterface1_1 != null) {
								try {
									@Pc(132) boolean local132 = true;
									@Pc(136) int local136 = local41.indexOf(44);
									if (local136 == -1) {
										local111 = Class616.method32090(local41.substring(7), (byte) 8);
									} else {
										local111 = Class616.method32090(local41.substring(7, local136), (byte) 8);
									}
									local10 += this.anInterface1_1.method29232(local111, 1933094139);
									local8 = -1;
								} catch (@Pc(165) Exception local165) {
								}
							}
							continue;
						}
						local22 = '®';
					}
				}
				if (local6 == -1) {
					local10 += this.aByteArray3[Class138_Sub3.method11406(local22, 1948405654) & 0xFF] & 0xFF;
					if (this.aByteArrayArray1 != null && local8 != -1) {
						local10 += this.aByteArrayArray1[local8][local22];
					}
					local8 = local22;
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!aac", name = "c", descriptor = "(Ljava/lang/String;I[Lclient!aay;I)Ljava/lang/String;", line = 221)
	public String method59(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2, @OriginalArg(3) int arg3) {
		if (this.method55(arg0, arg2, (byte) -33) <= arg1) {
			return arg0;
		}
		@Pc(16) int local16 = arg1 - this.method55("...", null, (byte) -108);
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
									local126 = Class616.method32090(local55.substring(4), (byte) 8);
									local22 += arg2[local126].method18160();
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
										local126 = Class616.method32090(local55.substring(7), (byte) 8);
									} else {
										local126 = Class616.method32090(local55.substring(7, local171), (byte) 8);
									}
									local22 += this.anInterface1_1.method29232(local126, 1402377332);
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
					local22 += this.aByteArray3[Class138_Sub3.method11406(local36, 1719162007) & 0xFF] & 0xFF;
					if (this.aByteArrayArray1 != null && local20 != -1) {
						local22 += this.aByteArrayArray1[local20][local36];
					}
					local20 = local36;
					@Pc(255) int local255 = local22;
					if (this.aByteArrayArray1 != null) {
						local255 = local22 + this.aByteArrayArray1[local36][46];
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

	@OriginalMember(owner = "client!aac", name = "ar", descriptor = "(Ljava/lang/String;I[Lclient!aay;)Ljava/lang/String;", line = 221)
	public String method60(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2) {
		if (this.method55(arg0, arg2, (byte) -19) <= arg1) {
			return arg0;
		}
		@Pc(16) int local16 = arg1 - this.method55("...", null, (byte) -15);
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
									local126 = Class616.method32090(local55.substring(4), (byte) 8);
									local22 += arg2[local126].method18160();
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
										local126 = Class616.method32090(local55.substring(7), (byte) 8);
									} else {
										local126 = Class616.method32090(local55.substring(7, local171), (byte) 8);
									}
									local22 += this.anInterface1_1.method29232(local126, 448021774);
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
					local22 += this.aByteArray3[Class138_Sub3.method11406(local36, 1933714370) & 0xFF] & 0xFF;
					if (this.aByteArrayArray1 != null && local20 != -1) {
						local22 += this.aByteArrayArray1[local20][local36];
					}
					local20 = local36;
					@Pc(255) int local255 = local22;
					if (this.aByteArrayArray1 != null) {
						local255 = local22 + this.aByteArrayArray1[local36][46];
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

	@OriginalMember(owner = "client!aac", name = "r", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;[Lclient!aay;B)I", line = 286)
	public int method61(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) Interface2[] arg3, @OriginalArg(4) byte arg4) {
		return this.method63(arg0, arg1, arg2, arg3, true, -1106545472);
	}

	@OriginalMember(owner = "client!aac", name = "ap", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;[Lclient!aay;)I", line = 286)
	public int method62(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) Interface2[] arg3) {
		return this.method63(arg0, arg1, arg2, arg3, true, -1106545472);
	}

	@OriginalMember(owner = "client!aac", name = "v", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;[Lclient!aay;ZI)I", line = 290)
	int method63(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) Interface2[] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = 0;
		@Pc(22) int local22 = arg0.length();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(35) int local35 = Class138_Sub3.method11406(arg0.charAt(local24), 2133324171) & 0xFF;
			@Pc(37) int local37 = 0;
			if (local35 == 60) {
				local15 = local24;
			} else {
				@Pc(52) int local52;
				if (local15 == -1) {
					local52 = local24;
					local37 += this.method45(local35, (byte) 68);
					if (this.aByteArrayArray1 != null && local17 != -1) {
						local37 += this.aByteArrayArray1[local17][local35];
					}
					local17 = local35;
				} else {
					if (local35 != 62) {
						continue;
					}
					local52 = local15;
					@Pc(59) String local59 = arg0.substring(local15 + 1, local24);
					local15 = -1;
					if (local59.equals("br")) {
						arg2[local19] = arg0.substring(local7, local24 + 1);
						local19++;
						if (local19 >= arg2.length) {
							return 0;
						}
						local7 = local24 + 1;
						local5 = 0;
						local9 = -1;
						local17 = -1;
						continue;
					}
					if (local59.equals("lt")) {
						local37 += this.method45(60, (byte) -86);
						if (this.aByteArrayArray1 != null && local17 != -1) {
							local37 += this.aByteArrayArray1[local17][60];
						}
						local17 = 60;
					} else if (local59.equals("gt")) {
						local37 += this.method45(62, (byte) -35);
						if (this.aByteArrayArray1 != null && local17 != -1) {
							local37 += this.aByteArrayArray1[local17][62];
						}
						local17 = 62;
					} else if (local59.equals("nbsp")) {
						local37 += this.method45(160, (byte) -70);
						if (this.aByteArrayArray1 != null && local17 != -1) {
							local37 += this.aByteArrayArray1[local17][160];
						}
						local17 = 160;
					} else if (local59.equals("shy")) {
						local37 += this.method45(173, (byte) 4);
						if (this.aByteArrayArray1 != null && local17 != -1) {
							local37 += this.aByteArrayArray1[local17][173];
						}
						local17 = 173;
					} else if (local59.equals("times")) {
						local37 += this.method45(215, (byte) 80);
						if (this.aByteArrayArray1 != null && local17 != -1) {
							local37 += this.aByteArrayArray1[local17][215];
						}
						local17 = 215;
					} else if (local59.equals("euro")) {
						local37 += this.method45(128, (byte) -52);
						if (this.aByteArrayArray1 != null && local17 != -1) {
							local37 += this.aByteArrayArray1[local17][128];
						}
						local17 = 128;
					} else if (local59.equals("copy")) {
						local37 += this.method45(169, (byte) -18);
						if (this.aByteArrayArray1 != null && local17 != -1) {
							local37 += this.aByteArrayArray1[local17][169];
						}
						local17 = 169;
					} else if (local59.equals("reg")) {
						local37 += this.method45(174, (byte) 23);
						if (this.aByteArrayArray1 != null && local17 != -1) {
							local37 += this.aByteArrayArray1[local17][174];
						}
						local17 = 174;
					} else {
						@Pc(338) int local338;
						if (local59.startsWith("img=") && arg3 != null) {
							try {
								local338 = Class616.method32090(local59.substring(4), (byte) 8);
								local37 += arg3[local338].method18160();
								local17 = -1;
							} catch (@Pc(349) Exception local349) {
							}
						} else if (local59.startsWith("sprite=") && this.anInterface1_1 != null) {
							try {
								@Pc(359) boolean local359 = true;
								@Pc(363) int local363 = local59.indexOf(44);
								if (local363 == -1) {
									local338 = Class616.method32090(local59.substring(7), (byte) 8);
								} else {
									local338 = Class616.method32090(local59.substring(7, local363), (byte) 8);
								}
								@Pc(387) int local387 = local37 + this.anInterface1_1.method29232(local338, -895768569);
								local17 = -1;
							} catch (@Pc(392) Exception local392) {
							}
							continue;
						}
					}
					local35 = -1;
				}
				if (local37 > 0) {
					local5 += local37;
					if (arg1 != null) {
						if (local35 == 32) {
							local9 = local24;
							local11 = local5;
							local13 = arg4 ? 1 : 0;
						}
						if (local5 > arg1[local19 < arg1.length ? local19 : arg1.length - 1]) {
							if (local9 >= 0) {
								arg2[local19] = arg0.substring(local7, local9 + 1 - local13);
								local19++;
								if (local19 >= arg2.length) {
									return 0;
								}
								local7 = local9 + 1;
								local9 = -1;
								local5 -= local11;
								local17 = -1;
							} else {
								arg2[local19] = arg0.substring(local7, local52);
								local19++;
								if (local19 >= arg2.length) {
									return 0;
								}
								local7 = local52;
								local9 = -1;
								local5 = local37;
								local17 = -1;
							}
						}
						if (local35 == 45) {
							local9 = local24;
							local11 = local5;
							local13 = 0;
						}
					}
				}
			}
		}
		if (arg0.length() > local7) {
			arg2[local19] = arg0.substring(local7, arg0.length());
			local19++;
		}
		return local19;
	}

	@OriginalMember(owner = "client!aac", name = "o", descriptor = "(Ljava/lang/String;I[Lclient!aay;I)I", line = 435)
	public int method64(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = this.method61(arg0, new int[] { arg1 }, aStringArray1, arg2, (byte) 115);
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(27) int local27 = this.method55(aStringArray1[local16], arg2, (byte) -66);
			if (local27 > local14) {
				local14 = local27;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!aac", name = "aq", descriptor = "(Ljava/lang/String;I[Lclient!aay;)I", line = 435)
	public int method65(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2) {
		@Pc(12) int local12 = this.method61(arg0, new int[] { arg1 }, aStringArray1, arg2, (byte) 9);
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(27) int local27 = this.method55(aStringArray1[local16], arg2, (byte) -40);
			if (local27 > local14) {
				local14 = local27;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!aac", name = "s", descriptor = "(Ljava/lang/String;I[Lclient!aay;I)I", line = 445)
	public int method66(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2, @OriginalArg(3) int arg3) {
		return this.method61(arg0, new int[] { arg1 }, aStringArray1, arg2, (byte) 9);
	}

	@OriginalMember(owner = "client!aac", name = "ao", descriptor = "(Ljava/lang/String;I[Lclient!aay;)I", line = 445)
	public int method67(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2) {
		return this.method61(arg0, new int[] { arg1 }, aStringArray1, arg2, (byte) -11);
	}

	@OriginalMember(owner = "client!aac", name = "ax", descriptor = "(Ljava/lang/String;I[Lclient!aay;)I", line = 445)
	public int method68(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2) {
		return this.method61(arg0, new int[] { arg1 }, aStringArray1, arg2, (byte) 86);
	}

	@OriginalMember(owner = "client!aac", name = "av", descriptor = "(Ljava/lang/String;I[Lclient!aay;)I", line = 445)
	public int method69(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2) {
		return this.method61(arg0, new int[] { arg1 }, aStringArray1, arg2, (byte) 46);
	}

	@OriginalMember(owner = "client!aac", name = "aj", descriptor = "(Ljava/lang/String;I[Lclient!aay;I)Ljava/lang/String;", line = 449)
	public String method70(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = this.method61(arg0, new int[] { arg1 }, aStringArray1, arg2, (byte) 50);
		return arg3 >= 0 && arg3 < local12 ? aStringArray1[arg3] : null;
	}

	@OriginalMember(owner = "client!aac", name = "y", descriptor = "(Ljava/lang/String;I[Lclient!aay;IB)Ljava/lang/String;", line = 449)
	public String method71(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		@Pc(12) int local12 = this.method61(arg0, new int[] { arg1 }, aStringArray1, arg2, (byte) -25);
		return arg3 >= 0 && arg3 < local12 ? aStringArray1[arg3] : null;
	}

	@OriginalMember(owner = "client!aac", name = "q", descriptor = "(Ljava/lang/String;II[Lclient!aay;B)I", line = 455)
	public int method72(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface2[] arg3, @OriginalArg(4) byte arg4) {
		if (arg2 == 0) {
			arg2 = this.anInt7 * -2059082111;
		}
		@Pc(19) int local19 = this.method61(arg0, new int[] { arg1 }, aStringArray1, arg3, (byte) 11);
		@Pc(25) int local25 = arg2 * (local19 - 1);
		return this.anInt10 * -1093354073 + this.anInt6 * -8978697 + local25;
	}

	@OriginalMember(owner = "client!aac", name = "ay", descriptor = "(Ljava/lang/String;II[Lclient!aay;)I", line = 455)
	public int method73(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface2[] arg3) {
		if (arg2 == 0) {
			arg2 = this.anInt7 * -2059082111;
		}
		@Pc(19) int local19 = this.method61(arg0, new int[] { arg1 }, aStringArray1, arg3, (byte) 69);
		@Pc(25) int local25 = arg2 * (local19 - 1);
		return this.anInt10 * -1093354073 + this.anInt6 * -8978697 + local25;
	}

	@OriginalMember(owner = "client!aac", name = "x", descriptor = "(Ljava/lang/String;III[Lclient!aay;I)Ljava/awt/Point;", line = 462)
	public Point method74(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface2[] arg4, @OriginalArg(5) int arg5) {
		if (arg3 <= 0) {
			return new Point(0, arg2 + this.anInt6 * -8978697);
		}
		if (arg3 > arg0.length()) {
			arg3 = arg0.length();
		}
		if (arg2 == 0) {
			arg2 = this.anInt7 * -2059082111;
		}
		@Pc(41) int local41 = this.method63(arg0, new int[] { arg1 }, aStringArray1, arg4, false, -1106545472);
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < local41; local45++) {
			@Pc(53) int local53 = aStringArray1[local45].length();
			if (local53 + local43 > arg3 || local45 == local41 - 1 && arg3 == arg0.length()) {
				@Pc(72) String local72 = arg0.substring(local43, arg3);
				if (local72.endsWith("<br>")) {
					local72 = "";
					@Pc(81) int local81 = local43 + local53;
					local45++;
				}
				@Pc(89) int local89 = this.method55(local72, arg4, (byte) -18);
				@Pc(98) int local98 = this.anInt6 * -8978697 + local45 * arg2;
				return new Point(local89, local98);
			}
			local43 += local53;
		}
		return null;
	}

	@OriginalMember(owner = "client!aac", name = "ab", descriptor = "(Ljava/lang/String;III[Lclient!aay;)Ljava/awt/Point;", line = 462)
	public Point method75(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface2[] arg4) {
		if (arg3 <= 0) {
			return new Point(0, arg2 + this.anInt6 * -8978697);
		}
		if (arg3 > arg0.length()) {
			arg3 = arg0.length();
		}
		if (arg2 == 0) {
			arg2 = this.anInt7 * -2059082111;
		}
		@Pc(41) int local41 = this.method63(arg0, new int[] { arg1 }, aStringArray1, arg4, false, -1106545472);
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < local41; local45++) {
			@Pc(53) int local53 = aStringArray1[local45].length();
			if (local53 + local43 > arg3 || local45 == local41 - 1 && arg3 == arg0.length()) {
				@Pc(72) String local72 = arg0.substring(local43, arg3);
				if (local72.endsWith("<br>")) {
					local72 = "";
					@Pc(81) int local81 = local43 + local53;
					local45++;
				}
				@Pc(89) int local89 = this.method55(local72, arg4, (byte) -30);
				@Pc(98) int local98 = this.anInt6 * -8978697 + local45 * arg2;
				return new Point(local89, local98);
			}
			local43 += local53;
		}
		return null;
	}

	@OriginalMember(owner = "client!aac", name = "b", descriptor = "(Ljava/lang/String;IIII[Lclient!aay;I)I", line = 488)
	public int method76(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface2[] arg5, @OriginalArg(6) int arg6) {
		if (arg2 == 0) {
			arg2 = this.anInt7 * -2059082111;
		}
		@Pc(20) int local20 = this.method63(arg0, new int[] { arg1 }, aStringArray1, arg5, false, -1106545472);
		if (local20 == 0) {
			return 0;
		}
		if (arg4 < 0) {
			arg4 = 0;
		}
		arg4 /= arg2;
		if (arg4 >= local20) {
			arg4 = local20 - 1;
		}
		@Pc(43) String local43 = aStringArray1[arg4];
		@Pc(45) int local45 = 0;
		@Pc(47) int local47 = 0;
		@Pc(49) int local49;
		for (local49 = 0; local49 < arg3 && local45 < local43.length(); local49 = this.method55(local43.substring(0, local45), arg5, (byte) -76)) {
			local47 = local49;
			local45++;
		}
		if (local45 == local43.length() && local43.endsWith("<br>")) {
			local45 -= 4;
		}
		if (arg3 - local47 < local49 - arg3) {
			local45--;
		}
		for (@Pc(88) int local88 = 0; local88 < arg4; local88++) {
			local45 += aStringArray1[local88].length();
		}
		return local45;
	}

	@OriginalMember(owner = "client!aac", name = "az", descriptor = "(Ljava/lang/String;IIII[Lclient!aay;)I", line = 488)
	public int method77(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface2[] arg5) {
		if (arg2 == 0) {
			arg2 = this.anInt7 * -2059082111;
		}
		@Pc(20) int local20 = this.method63(arg0, new int[] { arg1 }, aStringArray1, arg5, false, -1106545472);
		if (local20 == 0) {
			return 0;
		}
		if (arg4 < 0) {
			arg4 = 0;
		}
		arg4 /= arg2;
		if (arg4 >= local20) {
			arg4 = local20 - 1;
		}
		@Pc(43) String local43 = aStringArray1[arg4];
		@Pc(45) int local45 = 0;
		@Pc(47) int local47 = 0;
		@Pc(49) int local49;
		for (local49 = 0; local49 < arg3 && local45 < local43.length(); local49 = this.method55(local43.substring(0, local45), arg5, (byte) -81)) {
			local47 = local49;
			local45++;
		}
		if (local45 == local43.length() && local43.endsWith("<br>")) {
			local45 -= 4;
		}
		if (arg3 - local47 < local49 - arg3) {
			local45--;
		}
		for (@Pc(88) int local88 = 0; local88 < arg4; local88++) {
			local45 += aStringArray1[local88].length();
		}
		return local45;
	}

	@OriginalMember(owner = "client!aac", name = "aa", descriptor = "(Ljava/lang/String;IIII[Lclient!aay;)I", line = 488)
	public int method78(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface2[] arg5) {
		if (arg2 == 0) {
			arg2 = this.anInt7 * -2059082111;
		}
		@Pc(20) int local20 = this.method63(arg0, new int[] { arg1 }, aStringArray1, arg5, false, -1106545472);
		if (local20 == 0) {
			return 0;
		}
		if (arg4 < 0) {
			arg4 = 0;
		}
		arg4 /= arg2;
		if (arg4 >= local20) {
			arg4 = local20 - 1;
		}
		@Pc(43) String local43 = aStringArray1[arg4];
		@Pc(45) int local45 = 0;
		@Pc(47) int local47 = 0;
		@Pc(49) int local49;
		for (local49 = 0; local49 < arg3 && local45 < local43.length(); local49 = this.method55(local43.substring(0, local45), arg5, (byte) -106)) {
			local47 = local49;
			local45++;
		}
		if (local45 == local43.length() && local43.endsWith("<br>")) {
			local45 -= 4;
		}
		if (arg3 - local47 < local49 - arg3) {
			local45--;
		}
		for (@Pc(88) int local88 = 0; local88 < arg4; local88++) {
			local45 += aStringArray1[local88].length();
		}
		return local45;
	}

	@OriginalMember(owner = "client!aac", name = "ix", descriptor = "(Lclient!alh;IZI)V", line = 6257)
	public static final void method79(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		Class77.method1300(arg0, arg1, true, arg2, -938103640);
	}

	@OriginalMember(owner = "client!aac", name = "agn", descriptor = "(Lclient!yf;I)V", line = 10713)
	static final void method80(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(18) Class47 local18 = (Class47) Class277.aClass32_Sub12_1.method18261(local12, 1561296549);
		if (local18.anInt163 * 1265448031 == -1 && local18.anInt171 * -17795249 >= 0) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local18.anInt171 * -17795249;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local12;
		}
	}
}
