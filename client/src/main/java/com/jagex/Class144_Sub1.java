package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aiz")
public final class Class144_Sub1 extends Class144 {

	@OriginalMember(owner = "client!aiz", name = "cr", descriptor = "I")
	static final int anInt1405 = 1;

	@OriginalMember(owner = "client!aiz", name = "ca", descriptor = "I")
	static final int anInt1406 = 0;

	@OriginalMember(owner = "client!aiz", name = "cm", descriptor = "I")
	static final int anInt1407 = 3;

	@OriginalMember(owner = "client!aiz", name = "ci", descriptor = "I")
	static final int anInt1408 = 2;

	@OriginalMember(owner = "client!aiz", name = "cj", descriptor = "Z")
	static boolean aBoolean270 = false;

	@OriginalMember(owner = "client!aiz", name = "ck", descriptor = "Z")
	static boolean aBoolean269 = false;

	@OriginalMember(owner = "client!aiz", name = "cp", descriptor = "[I")
	static final int[] anIntArray171 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!aiz", name = "cg", descriptor = "[I")
	static final int[] anIntArray172 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!aiz", name = "cb", descriptor = "[I")
	static final int[] anIntArray170 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!aiz", name = "cw", descriptor = "[I")
	static final int[] anIntArray173 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!aiz", name = "cl", descriptor = "I")
	int anInt1409 = 1302684403;

	@OriginalMember(owner = "client!aiz", name = "cf", descriptor = "Lclient!aod;")
	Class41_Sub3 aClass41_Sub3_2;

	@OriginalMember(owner = "client!aiz", name = "cx", descriptor = "Lclient!xm;")
	Class665 aClass665_1;

	@OriginalMember(owner = "client!aiz", name = "cb", descriptor = "(Lclient!aod;[BIIIILclient!xs;Lclient!xs;)I")
	public static int method12000(@OriginalArg(0) Class41_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class669 arg6, @OriginalArg(7) Class669 arg7) {
		@Pc(1) int local1 = 0;
		@Pc(6) Class80_Sub36 local6 = new Class80_Sub36(arg1);
		@Pc(8) int local8 = -1;
		label73: while (true) {
			@Pc(12) int local12 = local6.method23261((byte) 60);
			if (local12 == 0) {
				return local1;
			}
			local8 += local12;
			@Pc(22) int local22 = 0;
			@Pc(24) boolean local24 = false;
			while (true) {
				@Pc(36) Class619 local36;
				@Pc(62) int local62;
				@Pc(68) Class625 local68;
				@Pc(86) int local86;
				do {
					@Pc(58) int local58;
					@Pc(81) int local81;
					do {
						do {
							do {
								do {
									@Pc(28) int local28;
									do {
										local28 = local6.method23195(1511083067);
										if (local28 == 0) {
											continue label73;
										}
										local36 = new Class619(local6);
									} while (local24);
									local22 += local28 - 1;
									@Pc(48) int local48 = local22 & 0x3F;
									@Pc(54) int local54 = local22 >> 6 & 0x3F;
									local58 = arg2 + local54;
									local62 = arg3 + local48;
									local68 = (Class625) arg0.method18054(local8, 2087707346);
									if ((local36.anInt5435 * -509515973 & 0x1) == 0) {
										local81 = local68.anInt5503 * 1462300569;
										local86 = local68.anInt5504 * -1951356049;
									} else {
										local81 = local68.anInt5504 * -1951356049;
										local86 = local68.anInt5503 * 1462300569;
									}
								} while (local58 >= arg4);
							} while (local62 >= arg5);
						} while (local58 + local81 < 0);
					} while (local62 + local86 < 0);
				} while (Class607.aClass607_10.anInt5396 * 1323580581 == local36.anInt5434 * 13806191 && Class703.aClass80_Sub37_49.aClass165_Sub26_1.method16355(-905906180) == 0 && local68.anInt5506 * 350558937 == 0 && local68.anInt5505 * -1318718743 != 1 && !local68.aBoolean948);
				if (!local68.method32459(arg7, 267388066)) {
					arg6.anInt5711 = local8 * 2092533495;
					local1++;
				}
				local24 = true;
			}
		}
	}

	@OriginalMember(owner = "client!aiz", name = "cw", descriptor = "(Lclient!aod;[BIIIILclient!xs;Lclient!xs;)I")
	public static int method12013(@OriginalArg(0) Class41_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class669 arg6, @OriginalArg(7) Class669 arg7) {
		@Pc(1) int local1 = 0;
		@Pc(6) Class80_Sub36 local6 = new Class80_Sub36(arg1);
		@Pc(8) int local8 = -1;
		label73: while (true) {
			@Pc(12) int local12 = local6.method23261((byte) -5);
			if (local12 == 0) {
				return local1;
			}
			local8 += local12;
			@Pc(22) int local22 = 0;
			@Pc(24) boolean local24 = false;
			while (true) {
				@Pc(36) Class619 local36;
				@Pc(62) int local62;
				@Pc(68) Class625 local68;
				@Pc(86) int local86;
				do {
					@Pc(58) int local58;
					@Pc(81) int local81;
					do {
						do {
							do {
								do {
									@Pc(28) int local28;
									do {
										local28 = local6.method23195(1365115961);
										if (local28 == 0) {
											continue label73;
										}
										local36 = new Class619(local6);
									} while (local24);
									local22 += local28 - 1;
									@Pc(48) int local48 = local22 & 0x3F;
									@Pc(54) int local54 = local22 >> 6 & 0x3F;
									local58 = arg2 + local54;
									local62 = arg3 + local48;
									local68 = (Class625) arg0.method18054(local8, 1088571993);
									if ((local36.anInt5435 * -509515973 & 0x1) == 0) {
										local81 = local68.anInt5503 * 1462300569;
										local86 = local68.anInt5504 * -1951356049;
									} else {
										local81 = local68.anInt5504 * -1951356049;
										local86 = local68.anInt5503 * 1462300569;
									}
								} while (local58 >= arg4);
							} while (local62 >= arg5);
						} while (local58 + local81 < 0);
					} while (local62 + local86 < 0);
				} while (Class607.aClass607_10.anInt5396 * 1323580581 == local36.anInt5434 * 13806191 && Class703.aClass80_Sub37_49.aClass165_Sub26_1.method16355(451944122) == 0 && local68.anInt5506 * 350558937 == 0 && local68.anInt5505 * -1318718743 != 1 && !local68.aBoolean948);
				if (!local68.method32459(arg7, 1263741499)) {
					arg6.anInt5711 = local8 * 2092533495;
					local1++;
				}
				local24 = true;
			}
		}
	}

	@OriginalMember(owner = "client!aiz", name = "cl", descriptor = "(Lclient!aod;II)Z")
	static boolean method12014(@OriginalArg(0) Class41_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class625 local5 = (Class625) arg0.method18054(arg1, 840985332);
		if (arg2 == 11) {
			arg2 = 10;
		}
		if (arg2 >= 5 && arg2 <= 8) {
			arg2 = 4;
		}
		return local5.method32458(arg2, (byte) -29);
	}

	@OriginalMember(owner = "client!aiz", name = "cx", descriptor = "(Lclient!aod;II)Z")
	static boolean method12015(@OriginalArg(0) Class41_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class625 local5 = (Class625) arg0.method18054(arg1, 1685375121);
		if (arg2 == 11) {
			arg2 = 10;
		}
		if (arg2 >= 5 && arg2 <= 8) {
			arg2 = 4;
		}
		return local5.method32458(arg2, (byte) -89);
	}

	@OriginalMember(owner = "client!aiz", name = "cf", descriptor = "(Lclient!aod;II)Z")
	static boolean method12016(@OriginalArg(0) Class41_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class625 local5 = (Class625) arg0.method18054(arg1, 279226419);
		if (arg2 == 11) {
			arg2 = 10;
		}
		if (arg2 >= 5 && arg2 <= 8) {
			arg2 = 4;
		}
		return local5.method32458(arg2, (byte) 0);
	}

	@OriginalMember(owner = "client!aiz", name = "cg", descriptor = "(Lclient!aod;[BIIIILclient!xs;Lclient!xs;)I")
	public static int method12017(@OriginalArg(0) Class41_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class669 arg6, @OriginalArg(7) Class669 arg7) {
		@Pc(1) int local1 = 0;
		@Pc(6) Class80_Sub36 local6 = new Class80_Sub36(arg1);
		@Pc(8) int local8 = -1;
		label73: while (true) {
			@Pc(12) int local12 = local6.method23261((byte) 12);
			if (local12 == 0) {
				return local1;
			}
			local8 += local12;
			@Pc(22) int local22 = 0;
			@Pc(24) boolean local24 = false;
			while (true) {
				@Pc(36) Class619 local36;
				@Pc(62) int local62;
				@Pc(68) Class625 local68;
				@Pc(86) int local86;
				do {
					@Pc(58) int local58;
					@Pc(81) int local81;
					do {
						do {
							do {
								do {
									@Pc(28) int local28;
									do {
										local28 = local6.method23195(1677163924);
										if (local28 == 0) {
											continue label73;
										}
										local36 = new Class619(local6);
									} while (local24);
									local22 += local28 - 1;
									@Pc(48) int local48 = local22 & 0x3F;
									@Pc(54) int local54 = local22 >> 6 & 0x3F;
									local58 = arg2 + local54;
									local62 = arg3 + local48;
									local68 = (Class625) arg0.method18054(local8, 186316397);
									if ((local36.anInt5435 * -509515973 & 0x1) == 0) {
										local81 = local68.anInt5503 * 1462300569;
										local86 = local68.anInt5504 * -1951356049;
									} else {
										local81 = local68.anInt5504 * -1951356049;
										local86 = local68.anInt5503 * 1462300569;
									}
								} while (local58 >= arg4);
							} while (local62 >= arg5);
						} while (local58 + local81 < 0);
					} while (local62 + local86 < 0);
				} while (Class607.aClass607_10.anInt5396 * 1323580581 == local36.anInt5434 * 13806191 && Class703.aClass80_Sub37_49.aClass165_Sub26_1.method16355(-1848035768) == 0 && local68.anInt5506 * 350558937 == 0 && local68.anInt5505 * -1318718743 != 1 && !local68.aBoolean948);
				if (!local68.method32459(arg7, 1734524452)) {
					arg6.anInt5711 = local8 * 2092533495;
					local1++;
				}
				local24 = true;
			}
		}
	}

	@OriginalMember(owner = "client!aiz", name = "kd", descriptor = "(ZI)V")
	static void method12033(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Class292.method26949(client.anInt3460 * 1849344509, Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103, arg0, -1748856919);
	}

	@OriginalMember(owner = "client!aiz", name = "<init>", descriptor = "(Lclient!te;Lclient!aod;IIIZLclient!qc;Lclient!xm;)V")
	public Class144_Sub1(@OriginalArg(0) Class570 arg0, @OriginalArg(1) Class41_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) Class502 arg6, @OriginalArg(7) Class665 arg7) {
		super(arg0, arg2, arg3, arg4, arg5, Class704.aClass41_Sub6_3, Class20.aClass41_Sub21_11, arg6);
		this.aClass41_Sub3_2 = arg1;
		this.aClass665_1 = arg7;
	}

	@OriginalMember(owner = "client!aiz", name = "dr", descriptor = "(Lclient!di;Z)V")
	public void method11997(@OriginalArg(0) Class102 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass570_5.method31577();
		if (!arg1) {
			@Pc(12) int local12;
			@Pc(20) int local20;
			if (this.anInt1383 * -2108820349 > 1) {
				for (local12 = 0; local12 < this.anInt1396 * -967539287; local12++) {
					for (local20 = 0; local20 < this.anInt1380 * -1218727185; local20++) {
						if ((this.aClass502_2.aByteArrayArrayArray12[1][local12][local20] & 0x2) == 2) {
							this.aClass570_5.method31553(local12, local20, (short) -5935);
						}
					}
				}
			}
			for (local12 = 0; local12 < this.anInt1383 * -2108820349; local12++) {
				for (local20 = 0; local20 <= this.anInt1380 * -1218727185; local20++) {
					for (@Pc(67) int local67 = 0; local67 <= this.anInt1396 * -967539287; local67++) {
						if ((this.aByteArrayArrayArray6[local12][local67][local20] & 0x4) != 0) {
							@Pc(87) int local87 = local67;
							@Pc(89) int local89 = local67;
							@Pc(91) int local91 = local20;
							@Pc(93) int local93 = local20;
							while (local91 > 0 && (this.aByteArrayArrayArray6[local12][local67][local91 - 1] & 0x4) != 0 && local93 - local91 < 10) {
								local91--;
							}
							while (local93 < this.anInt1380 * -1218727185 && (this.aByteArrayArrayArray6[local12][local67][local93 + 1] & 0x4) != 0 && local93 - local91 < 10) {
								local93++;
							}
							@Pc(152) int local152;
							label108: while (local87 > 0 && local89 - local87 < 10) {
								for (local152 = local91; local152 <= local93; local152++) {
									if ((this.aByteArrayArrayArray6[local12][local87 - 1][local152] & 0x4) == 0) {
										break label108;
									}
								}
								local87--;
							}
							label95: while (local89 < this.anInt1396 * -967539287 && local89 - local87 < 10) {
								for (local152 = local91; local152 <= local93; local152++) {
									if ((this.aByteArrayArrayArray6[local12][local89 + 1][local152] & 0x4) == 0) {
										break label95;
									}
								}
								local89++;
							}
							if ((local89 - local87 + 1) * (local93 - local91 + 1) >= 4) {
								local152 = this.anIntArrayArrayArray14[local12][local87][local91];
								this.aClass570_5.aClass600_1.method32091(4, local12, local87 << 9, (local89 << 9) + 512, local91 << 9, (local93 << 9) + 512, local152, local152);
								for (@Pc(255) int local255 = local87; local255 <= local89; local255++) {
									for (@Pc(260) int local260 = local91; local260 <= local93; local260++) {
										this.aByteArrayArrayArray6[local12][local255][local260] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			this.aClass570_5.aClass600_1.method32057();
		}
		this.aByteArrayArrayArray6 = null;
	}

	@OriginalMember(owner = "client!aiz", name = "cv", descriptor = "(Lclient!di;Lclient!ald;III)V")
	public void method11998(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class80_Sub36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aBoolean260) {
			return;
		}
		arg1.anInt3152 += -316490024;
		@Pc(11) boolean local11 = false;
		@Pc(13) Class655 local13 = null;
		@Pc(15) boolean local15 = false;
		while (true) {
			@Pc(27) int local27;
			@Pc(54) int local54;
			@Pc(255) int local255;
			@Pc(259) int local259;
			@Pc(58) int local58;
			while (arg1.anInt3152 * -1380987821 < arg1.aByteArray61.length) {
				local27 = arg1.method23362(-187882039);
				if (local27 != 0) {
					@Pc(120) int local120;
					@Pc(128) int local128;
					@Pc(132) int local132;
					if (local27 == 1) {
						local54 = arg1.method23362(196176899);
						if (local54 > 0) {
							for (local58 = 0; local58 < local54; local58++) {
								@Pc(73) Class595 local73 = new Class595(arg0, this.aClass570_5.anInt5258 * 1479624119, arg1, 2);
								if (local73.anInt5349 * -619633025 == 31) {
									@Pc(87) Class89 local87 = (Class89) Class332.aClass41_Sub5_1.method18054(arg1.method23178((byte) -82), -1372402142);
									local73.method31964(local87.anInt318 * 2073639953, local87.anInt315 * 1157207965, local87.anInt317 * 586892451, local87.anInt316 * 1197747641, 1928226857);
								}
								if (arg0.method20768() > 0) {
									@Pc(112) Class80_Sub12 local112 = local73.aClass80_Sub12_3;
									local120 = local112.method13949((byte) 0) + (arg2 << 9);
									local128 = local112.method13970(889275245) + (arg3 << 9);
									local132 = local120 >> 9;
									@Pc(136) int local136 = local128 >> 9;
									if (local132 >= 0 && local136 >= 0 && local132 < this.anInt1396 * -967539287 && local136 < this.anInt1380 * -1218727185) {
										local112.method13957(local120, this.anIntArrayArrayArray14[local73.anInt5347 * -1434233081][local132][local136] - local112.method13950(-1705863287), local128, -595574820);
										this.aClass570_5.method31591(local73, (byte) -48);
									}
								}
							}
						}
					} else if (local27 == 2) {
						if (local13 == null) {
							local13 = new Class655();
						}
						local13.method33172(arg1, -1111770155);
					} else if (local27 == 3) {
						if (local13 == null) {
							local13 = new Class655();
						}
						local13.method33178(arg1, (byte) 38);
					} else if (local27 == 128) {
						if (local13 == null) {
							local13 = new Class655();
						}
						local13.method33177(arg1, this.aClass665_1, 1137707479);
					} else if (local27 == 129) {
						if (this.aByteArrayArrayArray8 == null) {
							this.aByteArrayArrayArray8 = new byte[4][][];
						}
						for (local54 = 0; local54 < 4; local54++) {
							@Pc(245) byte local245 = arg1.method23177((byte) -126);
							if (local245 == 0 && this.aByteArrayArrayArray8[local54] != null) {
								local255 = arg2;
								local259 = arg2 + 64;
								local120 = arg3;
								local128 = arg3 + 64;
								if (arg2 < 0) {
									local255 = 0;
								} else if (arg2 >= this.anInt1396 * -967539287) {
									local255 = this.anInt1396 * -967539287;
								}
								if (local259 < 0) {
									local259 = 0;
								} else if (local259 >= this.anInt1396 * -967539287) {
									local259 = this.anInt1396 * -967539287;
								}
								if (arg3 < 0) {
									local120 = 0;
								} else if (arg3 >= this.anInt1380 * -1218727185) {
									local120 = this.anInt1380 * -1218727185;
								}
								if (local128 < 0) {
									local128 = 0;
								} else if (local128 >= this.anInt1380 * -1218727185) {
									local128 = this.anInt1380 * -1218727185;
								}
								while (local255 < local259) {
									while (local120 < local128) {
										this.aByteArrayArrayArray8[local54][local255][local120] = 0;
										local120++;
									}
									local255++;
								}
							} else if (local245 == 1) {
								if (this.aByteArrayArrayArray8[local54] == null) {
									this.aByteArrayArrayArray8[local54] = new byte[this.anInt1396 * -967539287 + 1][this.anInt1380 * -1218727185 + 1];
								}
								for (local255 = 0; local255 < 64; local255 += 4) {
									for (local259 = 0; local259 < 64; local259 += 4) {
										@Pc(388) byte local388 = arg1.method23177((byte) -59);
										for (local128 = local255 + arg2; local128 < local255 + 4 + arg2; local128++) {
											for (local132 = local259 + arg3; local132 < local259 + 4 + arg3; local132++) {
												if (local128 >= 0 && local128 < this.anInt1396 * -967539287 && local132 >= 0 && local132 < this.anInt1380 * -1218727185) {
													this.aByteArrayArrayArray8[local54][local128][local132] = local388;
												}
											}
										}
									}
								}
							} else if (local245 == 2) {
								if (this.aByteArrayArrayArray8[local54] == null) {
									this.aByteArrayArrayArray8[local54] = new byte[this.anInt1396 * -967539287 + 1][this.anInt1380 * -1218727185 + 1];
								}
								if (local54 > 0) {
									local255 = arg2;
									local259 = arg2 + 64;
									local120 = arg3;
									local128 = arg3 + 64;
									if (arg2 < 0) {
										local255 = 0;
									} else if (arg2 >= this.anInt1396 * -967539287) {
										local255 = this.anInt1396 * -967539287;
									}
									if (local259 < 0) {
										local259 = 0;
									} else if (local259 >= this.anInt1396 * -967539287) {
										local259 = this.anInt1396 * -967539287;
									}
									if (arg3 < 0) {
										local120 = 0;
									} else if (arg3 >= this.anInt1380 * -1218727185) {
										local120 = this.anInt1380 * -1218727185;
									}
									if (local128 < 0) {
										local128 = 0;
									} else if (local128 >= this.anInt1380 * -1218727185) {
										local128 = this.anInt1380 * -1218727185;
									}
									while (local255 < local259) {
										while (local120 < local128) {
											this.aByteArrayArrayArray8[local54][local255][local120] = this.aByteArrayArrayArray8[local54 - 1][local255][local120];
											local120++;
										}
										local255++;
									}
								}
							}
						}
						local11 = true;
					} else if (local27 == 130) {
						local15 = true;
					} else {
						throw new IllegalStateException("");
					}
				} else if (local13 == null) {
					local13 = new Class655(arg1, this.aClass665_1);
				} else {
					local13.method33176(arg1, this.aClass665_1, 1700740836);
				}
			}
			for (local27 = 0; local27 < 8; local27++) {
				for (local54 = 0; local54 < 8; local54++) {
					local58 = local27 + (arg2 >> 3);
					local255 = local54 + (arg3 >> 3);
					if (local58 >= 0 && local58 < this.anInt1396 * -967539287 >> 3 && local255 >= 0 && local255 < this.anInt1380 * -1218727185 >> 3) {
						if (local13 != null) {
							this.aClass665_1.method33423(local58, local255, local13, -2119395941);
						}
						Class147.method23932(local58, local255, local15, -793332619);
					}
				}
			}
			if (!local11 && this.aByteArrayArrayArray8 != null) {
				for (local27 = 0; local27 < 4; local27++) {
					if (this.aByteArrayArrayArray8[local27] != null) {
						for (local54 = 0; local54 < 16; local54++) {
							for (local58 = 0; local58 < 16; local58++) {
								local255 = local54 + (arg2 >> 2);
								local259 = local58 + (arg3 >> 2);
								if (local255 >= 0 && local255 < 26 && local259 >= 0 && local259 < 26) {
									this.aByteArrayArrayArray8[local27][local255][local259] = 0;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aiz", name = "ct", descriptor = "(Lclient!di;Lclient!ald;IIIIIIII)V")
	public void method11999(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class80_Sub36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aBoolean260) {
			return;
		}
		arg1.anInt3152 += -316490024;
		@Pc(11) boolean local11 = false;
		@Pc(13) Class655 local13 = null;
		@Pc(15) boolean local15 = false;
		@Pc(21) int local21 = (arg6 & 0x7) * 8;
		@Pc(27) int local27 = (arg7 & 0x7) * 8;
		while (true) {
			@Pc(39) int local39;
			@Pc(65) int local65;
			@Pc(328) int local328;
			@Pc(69) int local69;
			while (arg1.anInt3152 * -1380987821 < arg1.aByteArray61.length) {
				local39 = arg1.method23362(1046052204);
				if (local39 != 0) {
					@Pc(135) int local135;
					@Pc(175) int local175;
					@Pc(193) int local193;
					@Pc(129) int local129;
					if (local39 == 1) {
						local65 = arg1.method23362(617751331);
						if (local65 > 0) {
							for (local69 = 0; local69 < local65; local69++) {
								@Pc(84) Class595 local84 = new Class595(arg0, this.aClass570_5.anInt5258 * 1479624119, arg1, 2);
								if (local84.anInt5349 * -619633025 == 31) {
									@Pc(98) Class89 local98 = (Class89) Class332.aClass41_Sub5_1.method18054(arg1.method23178((byte) -21), 1167376157);
									local84.method31964(local98.anInt318 * 2073639953, local98.anInt315 * 1157207965, local98.anInt317 * 586892451, local98.anInt316 * 1197747641, 1928226857);
								}
								if (arg0.method20768() > 0) {
									@Pc(123) Class80_Sub12 local123 = local84.aClass80_Sub12_3;
									local129 = local123.method13949((byte) 0) >> 9;
									local135 = local123.method13970(1804175110) >> 9;
									if (arg5 == local84.anInt5347 * -1434233081 && local129 >= local21 && local129 < local21 + 8 && local135 >= local27 && local135 < local27 + 8) {
										local175 = (arg3 << 9) + Class356.method28099(local123.method13949((byte) 0) & 0xFFF, local123.method13970(1239344163) & 0xFFF, arg8, 1197912734);
										local193 = (arg4 << 9) + Class450.method29276(local123.method13949((byte) 0) & 0xFFF, local123.method13970(1108435901) & 0xFFF, arg8, 1799697594);
										local129 = local175 >> 9;
										local135 = local193 >> 9;
										if (local129 >= 0 && local135 >= 0 && local129 < this.anInt1396 * -967539287 && local135 < this.anInt1380 * -1218727185) {
											local84.anInt5347 = arg2 * 823158455;
											local123.method13957(local175, this.anIntArrayArrayArray14[local84.anInt5347 * -1434233081][local129][local135] - local123.method13950(-1746068261), local193, 222018196);
											this.aClass570_5.method31591(local84, (byte) -7);
										}
									}
								}
							}
						}
					} else if (local39 == 2) {
						if (local13 == null) {
							local13 = new Class655();
						}
						local13.method33172(arg1, -1037103775);
					} else if (local39 == 3) {
						if (local13 == null) {
							local13 = new Class655();
						}
						local13.method33178(arg1, (byte) -76);
					} else if (local39 == 128) {
						if (local13 == null) {
							local13 = new Class655();
						}
						local13.method33177(arg1, this.aClass665_1, 1137707479);
					} else if (local39 == 129) {
						if (this.aByteArrayArrayArray8 == null) {
							this.aByteArrayArrayArray8 = new byte[4][][];
						}
						for (local65 = 0; local65 < 4; local65++) {
							@Pc(315) byte local315 = arg1.method23177((byte) -52);
							@Pc(332) int local332;
							if (local315 == 0 && this.aByteArrayArrayArray8[arg2] != null) {
								if (local65 <= arg5) {
									local328 = arg3;
									local332 = arg3 + 7;
									local129 = arg4;
									local135 = arg4 + 7;
									if (arg3 < 0) {
										local328 = 0;
									} else if (arg3 >= this.anInt1396 * -967539287) {
										local328 = this.anInt1396 * -967539287;
									}
									if (local332 < 0) {
										local332 = 0;
									} else if (local332 >= this.anInt1396 * -967539287) {
										local332 = this.anInt1396 * -967539287;
									}
									if (arg4 < 0) {
										local129 = 0;
									} else if (arg4 >= this.anInt1380 * -1218727185) {
										local129 = this.anInt1380 * -1218727185;
									}
									if (local135 < 0) {
										local135 = 0;
									} else if (local135 >= this.anInt1380 * -1218727185) {
										local135 = this.anInt1380 * -1218727185;
									}
									while (local328 < local332) {
										while (local129 < local135) {
											this.aByteArrayArrayArray8[arg2][local328][local129] = 0;
											local129++;
										}
										local328++;
									}
								}
							} else if (local315 == 1) {
								if (this.aByteArrayArrayArray8[arg2] == null) {
									this.aByteArrayArrayArray8[arg2] = new byte[this.anInt1396 * -967539287 + 1][this.anInt1380 * -1218727185 + 1];
								}
								for (local328 = 0; local328 < 64; local328 += 4) {
									for (local332 = 0; local332 < 64; local332 += 4) {
										@Pc(462) byte local462 = arg1.method23177((byte) -82);
										if (local65 <= arg5) {
											for (local135 = local328; local135 < local328 + 4; local135++) {
												for (local175 = local332; local175 < local332 + 4; local175++) {
													if (local135 >= local21 && local135 < local21 + 8 && local175 >= local27 && local175 < local27 + 8) {
														local193 = arg3 + Class221.method25909(local135 & 0x7, local175 & 0x7, arg8, (byte) 5);
														@Pc(519) int local519 = arg4 + Class304.method27124(local135 & 0x7, local175 & 0x7, arg8, (byte) -9);
														if (local193 >= 0 && local193 < this.anInt1396 * -967539287 && local519 >= 0 && local519 < this.anInt1380 * -1218727185) {
															this.aByteArrayArrayArray8[arg2][local193][local519] = local462;
															local11 = true;
														}
													}
												}
											}
										}
									}
								}
							} else if (local315 == 2) {
							}
						}
					} else if (local39 == 130) {
						local15 = true;
					} else {
						throw new IllegalStateException("");
					}
				} else if (local13 == null) {
					local13 = new Class655(arg1, this.aClass665_1);
				} else {
					local13.method33176(arg1, this.aClass665_1, 1406008528);
				}
			}
			if (local13 != null) {
				this.aClass665_1.method33423(arg3 >> 3, arg4 >> 3, local13, -2110802137);
			}
			Class147.method23932(arg3 >> 3, arg4 >> 3, local15, 5595270);
			if (!local11 && this.aByteArrayArrayArray8 != null && this.aByteArrayArrayArray8[arg2] != null) {
				local39 = arg3 + 7;
				local65 = arg4 + 7;
				for (local69 = arg3; local69 < local39; local69++) {
					for (local328 = arg4; local328 < local65; local328++) {
						this.aByteArrayArrayArray8[arg2][local69][local328] = 0;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aiz", name = "cu", descriptor = "(Lclient!di;IIIIIIIIILclient!oc;I)V")
	void method12001(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class457 arg10, @OriginalArg(11) int arg11) {
		if (arg2 < this.anInt1409 * -1006966575) {
			this.anInt1409 = arg2 * 750678065;
		}
		@Pc(17) Class625 local17 = (Class625) this.aClass41_Sub3_2.method18054(arg5, 1747240816);
		if (Class703.aClass80_Sub37_49.aClass165_Sub2_1.method15861(1423795933) == 0 && local17.aBoolean950) {
			return;
		}
		@Pc(37) int local37;
		@Pc(42) int local42;
		if (arg6 == 1 || arg6 == 3) {
			local37 = local17.anInt5504 * -1951356049;
			local42 = local17.anInt5503 * 1462300569;
		} else {
			local37 = local17.anInt5503 * 1462300569;
			local42 = local17.anInt5504 * -1951356049;
		}
		@Pc(67) int local67;
		@Pc(75) int local75;
		if (arg3 + local37 <= this.anInt1396 * -967539287) {
			local67 = arg3 + (local37 >> 1);
			local75 = (local37 + 1 >> 1) + arg3;
		} else {
			local67 = arg3;
			local75 = arg3 + 1;
		}
		@Pc(96) int local96;
		@Pc(104) int local104;
		if (arg4 + local42 <= this.anInt1380 * -1218727185) {
			local96 = (local42 >> 1) + arg4;
			local104 = (local42 + 1 >> 1) + arg4;
		} else {
			local96 = arg4;
			local104 = arg4 + 1;
		}
		@Pc(117) Class100 local117 = this.aClass570_5.aClass100Array1[arg1];
		@Pc(155) int local155;
		if (Class607.aClass607_21.anInt5396 * 1323580581 == arg7 || arg7 == Class607.aClass607_22.anInt5396 * 1323580581) {
			local155 = local117.method2918(local67, local96, (byte) 1) + local117.method2918(local75, local96, (byte) 1) + local117.method2918(local67, local104, (byte) 1) + local117.method2918(local75, local104, (byte) 1) >> 2;
		} else {
			local155 = local117.method2917(local67, local96, -820735364) + local117.method2917(local75, local96, -631958831) + local117.method2917(local67, local104, -2050798062) + local117.method2917(local75, local104, -242625168) >> 2;
		}
		@Pc(190) int local190 = (local37 << 8) + (arg3 << 9);
		@Pc(198) int local198 = (arg4 << 9) + (local42 << 8);
		@Pc(211) boolean local211 = this.aBoolean263 && !this.aBoolean260 && local17.aBoolean941;
		if (local17.method32455(-1197508323)) {
			Class676.method33587(arg2, arg3, arg4, arg6, local17, null, null, (byte) 9);
		}
		@Pc(253) boolean local253 = arg8 == -1 && (!local17.method32469(-395189532) || local17.aBoolean942 && Class703.aClass80_Sub37_49.aClass165_Sub35_1.method16584(-1819817036) == 0) && local17.anIntArray503 == null && !local17.aBoolean952 && !local17.aBoolean954;
		if (aBoolean270 && (Class461.method29434(arg7, (byte) -98) && local17.anInt5508 * 1797429727 != 1 || !(!Class530.method30813(arg7, (short) 256) || local17.anInt5508 * 1797429727 != 0))) {
			return;
		}
		if (arg7 != Class607.aClass607_10.anInt5396 * 1323580581) {
			@Pc(427) Class120_Sub1_Sub1 local427;
			@Pc(379) Class120_Sub1_Sub1_Sub3 local379;
			if (Class607.aClass607_21.anInt5396 * 1323580581 == arg7 || Class607.aClass607_22.anInt5396 * 1323580581 == arg7) {
				local379 = null;
				@Pc(425) int local425;
				if (local253) {
					@Pc(421) Class120_Sub1_Sub1_Sub3 local421 = new Class120_Sub1_Sub1_Sub3(this.aClass570_5, arg0, this.aClass41_Sub3_2, local17, arg2, arg1, local190, local155, local198, this.aBoolean260, arg3, arg3 + local37 - 1, arg4, arg4 + local42 - 1, arg7, arg6, local211, local17.aClass628_1 != Class628.aClass628_2, arg10);
					local425 = local421.method13295(2106986872);
					local427 = local421;
					local379 = local421;
				} else {
					local427 = new Class120_Sub1_Sub1_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, local17, arg2, arg1, local190, local155, local198, this.aBoolean260, arg3, arg3 + local37 - 1, arg4, local42 + arg4 - 1, arg7, arg6, arg8, arg9, Class628.aClass628_2 != local17.aClass628_1, arg10);
					local425 = 15;
				}
				if (this.aClass570_5.method31696(local427, false, 6898847)) {
					if (local379 != null && local379.method13822(-1077466892)) {
						local379.method13831(arg0, 286056359);
					}
					if (local17.aBoolean946 && this.aBoolean263) {
						if (local425 > 30) {
							local425 = 30;
						}
						for (@Pc(503) int local503 = 0; local503 <= local37; local503++) {
							for (@Pc(508) int local508 = 0; local508 <= local42; local508++) {
								local117.method2941(arg3 + local503, arg4 + local508, local425);
							}
						}
					}
				}
			} else if (Class530.method30813(arg7, (short) 256) || Class590.method31920(arg7, (byte) -5)) {
				if (local253) {
					local379 = new Class120_Sub1_Sub1_Sub3(this.aClass570_5, arg0, this.aClass41_Sub3_2, local17, arg2, arg1, local190, local155, local198, this.aBoolean260, arg3, arg3 + local37 - 1, arg4, arg4 + local42 - 1, arg7, arg6, local211, true, arg10);
					if (local379.method13822(-242156226)) {
						local379.method13831(arg0, 1147863278);
					}
					local427 = local379;
				} else {
					local427 = new Class120_Sub1_Sub1_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, local17, arg2, arg1, local190, local155, local198, this.aBoolean260, arg3, local37 + arg3 - 1, arg4, arg4 + local42 - 1, arg7, arg6, arg8, arg9, true, arg10);
				}
				this.aClass570_5.method31696(local427, false, 6898847);
				if (this.aBoolean263 && !this.aBoolean260 && Class530.method30813(arg7, (short) 256) && Class607.aClass607_12.anInt5396 * 1323580581 != arg7 && arg2 > 0 && local17.anInt5508 * 1797429727 != 0) {
					this.aByteArrayArrayArray6[arg2][arg3][arg4] = (byte) (this.aByteArrayArrayArray6[arg2][arg3][arg4] | 0x4);
				}
			} else if (!this.method12002(arg0, arg7, arg6, local253, local17, arg8, arg9, arg2, arg1, local190, local155, local198, arg3, arg4, local211, local117, local37, local42, arg10, 2059245254) && !this.method12003(arg0, arg7, arg6, local253, local17, arg8, arg9, arg2, arg1, local190, local155, local198, arg3, arg4, arg10, (short) 160)) {
				;
			}
		} else if (Class703.aClass80_Sub37_49.aClass165_Sub26_1.method16355(1886228987) != 0 || local17.anInt5506 * 350558937 != 0 || local17.anInt5505 * -1318718743 == 1 || local17.aBoolean948) {
			@Pc(334) Class120_Sub1_Sub4 local334;
			if (local253) {
				@Pc(324) Class120_Sub1_Sub4_Sub2 local324 = new Class120_Sub1_Sub4_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, local17, arg2, arg1, local190, local155, local198, this.aBoolean260, arg6, local211, arg10);
				if (local324.method13822(1901861314)) {
					local324.method13831(arg0, 2145964395);
				}
				local334 = local324;
			} else {
				local334 = new Class120_Sub1_Sub4_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, local17, arg2, arg1, local190, local155, local198, this.aBoolean260, arg6, arg8, arg9, arg10);
			}
			this.aClass570_5.method31619(arg2, arg3, arg4, local334, -1978072122);
		}
	}

	@OriginalMember(owner = "client!aiz", name = "ce", descriptor = "(Lclient!di;IIZLclient!vv;IIIIIIIIIZLclient!cb;IILclient!oc;I)Z")
	boolean method12002(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class625 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) Class100 arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) Class457 arg18, @OriginalArg(19) int arg19) {
		@Pc(53) Class120_Sub1_Sub2 local53;
		if (arg1 == Class607.aClass607_13.anInt5396 * 1323580581) {
			@Pc(10) int local10 = arg4.anInt5508 * 1797429727;
			if (aBoolean269 && arg4.anInt5508 * 1797429727 == -1) {
				local10 = 1;
			}
			if (arg3) {
				@Pc(43) Class120_Sub1_Sub2_Sub1 local43 = new Class120_Sub1_Sub2_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg14, arg18);
				if (local43.method13822(-722047190)) {
					local43.method13831(arg0, 1545105220);
				}
				local53 = local43;
			} else {
				local53 = new Class120_Sub1_Sub2_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass570_5.method31556(arg7, arg12, arg13, local53, null, (byte) 0);
			if (arg2 == 0) {
				if (this.aBoolean263 && arg4.aBoolean946) {
					arg15.method2941(arg12, arg13, 50);
					arg15.method2941(arg12, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean260) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				}
			} else if (arg2 == 1) {
				if (this.aBoolean263 && arg4.aBoolean946) {
					arg15.method2941(arg12, arg13 + 1, 50);
					arg15.method2941(arg12 + 1, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean260) {
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13 + 1, arg4.anInt5509 * -1136955327, -(arg4.anInt5510 * -1688990527));
				}
			} else if (arg2 == 2) {
				if (this.aBoolean263 && arg4.aBoolean946) {
					arg15.method2941(arg12 + 1, arg13, 50);
					arg15.method2941(arg12 + 1, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean260) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12 + 1, arg13, arg4.anInt5509 * -1136955327, -(arg4.anInt5510 * -1688990527));
				}
			} else if (arg2 == 3) {
				if (this.aBoolean263 && arg4.aBoolean946) {
					arg15.method2941(arg12, arg13, 50);
					arg15.method2941(arg12 + 1, arg13, 50);
				}
				if (local10 == 1 && !this.aBoolean260) {
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				}
			}
			if (arg4.anInt5512 * 1589465651 != 64) {
				this.aClass570_5.method31559(arg7, arg12, arg13, arg4.anInt5512 * 1589465651, -303304463);
			}
			return true;
		}
		@Pc(331) Class120_Sub1_Sub2 local331;
		@Pc(321) Class120_Sub1_Sub2_Sub1 local321;
		if (Class607.aClass607_3.anInt5396 * 1323580581 == arg1) {
			if (arg3) {
				local321 = new Class120_Sub1_Sub2_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg14, arg18);
				if (local321.method13822(668039073)) {
					local321.method13831(arg0, -1818233808);
				}
				local331 = local321;
			} else {
				local331 = new Class120_Sub1_Sub2_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass570_5.method31556(arg7, arg12, arg13, local331, null, (byte) 0);
			if (arg4.aBoolean946 && this.aBoolean263) {
				if (arg2 == 0) {
					arg15.method2941(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method2941(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method2941(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method2941(arg12, arg13, 50);
				}
			}
			return true;
		} else if (arg1 == Class607.aClass607_16.anInt5396 * 1323580581) {
			@Pc(425) int local425 = arg2 + 1 & 0x3;
			if (arg3) {
				@Pc(450) Class120_Sub1_Sub2_Sub1 local450 = new Class120_Sub1_Sub2_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2 + 4, arg14, arg18);
				@Pc(471) Class120_Sub1_Sub2_Sub1 local471 = new Class120_Sub1_Sub2_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, local425, arg14, arg18);
				if (local450.method13822(228068652)) {
					local450.method13831(arg0, -602593858);
				}
				if (local471.method13822(1392071569)) {
					local471.method13831(arg0, 105568470);
				}
				local331 = local450;
				local53 = local471;
			} else {
				local331 = new Class120_Sub1_Sub2_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2 + 4, arg5, arg6, arg18);
				local53 = new Class120_Sub1_Sub2_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, local425, arg5, arg6, arg18);
			}
			this.aClass570_5.method31556(arg7, arg12, arg13, local331, local53, (byte) 0);
			if ((arg4.anInt5508 * 1797429727 == 1 || aBoolean269 && arg4.anInt5508 * 1797429727 == -1) && !this.aBoolean260) {
				if (arg2 == 0) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13 + 1, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				} else if (arg2 == 1) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12 + 1, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13 + 1, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				} else if (arg2 == 2) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12 + 1, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				} else if (arg2 == 3) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				}
			}
			if (arg4.anInt5512 * 1589465651 != 64) {
				this.aClass570_5.method31559(arg7, arg12, arg13, arg4.anInt5512 * 1589465651, -203347052);
			}
			return true;
		} else if (arg1 == Class607.aClass607_5.anInt5396 * 1323580581) {
			if (arg3) {
				local321 = new Class120_Sub1_Sub2_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg14, arg18);
				if (local321.method13822(1814199932)) {
					local321.method13831(arg0, 1125061731);
				}
				local331 = local321;
			} else {
				local331 = new Class120_Sub1_Sub2_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass570_5.method31556(arg7, arg12, arg13, local331, null, (byte) 0);
			if (arg4.aBoolean946 && this.aBoolean263) {
				if (arg2 == 0) {
					arg15.method2941(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method2941(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method2941(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method2941(arg12, arg13, 50);
				}
			}
			return true;
		} else if (arg1 == Class607.aClass607_20.anInt5396 * 1323580581) {
			@Pc(898) Class120_Sub1_Sub1 local898;
			if (arg3) {
				@Pc(888) Class120_Sub1_Sub1_Sub3 local888 = new Class120_Sub1_Sub1_Sub3(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg12, arg12, arg13, arg13, arg1, arg2, arg14, true, arg18);
				if (local888.method13822(-2142615346)) {
					local888.method13831(arg0, -936261096);
				}
				local898 = local888;
			} else {
				local898 = new Class120_Sub1_Sub1_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg12, arg16 + arg12 - 1, arg13, arg17 + arg13 - 1, arg1, arg2, arg5, arg6, true, arg18);
			}
			this.aClass570_5.method31696(local898, false, 6898847);
			if (arg4.anInt5508 * 1797429727 == 1 && !this.aBoolean260) {
				@Pc(957) byte local957;
				if ((arg2 & 0x1) == 0) {
					local957 = 8;
				} else {
					local957 = 16;
				}
				this.aClass570_5.aClass600_1.method32055(local957, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, 0);
			}
			if (arg4.anInt5512 * 1589465651 != 64) {
				this.aClass570_5.method31559(arg7, arg12, arg13, arg4.anInt5512 * 1589465651, -248323399);
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aiz", name = "cs", descriptor = "(Lclient!di;IIZLclient!vv;IIIIIIIIILclient!oc;S)Z")
	boolean method12003(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class625 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) Class457 arg14, @OriginalArg(15) short arg15) {
		@Pc(39) Class120_Sub1_Sub3 local39;
		if (arg1 == Class607.aClass607_24.anInt5396 * 1323580581) {
			if (arg3) {
				@Pc(29) Class120_Sub1_Sub3_Sub2 local29 = new Class120_Sub1_Sub3_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, 0, 0, arg1, arg2, arg14);
				if (local29.method13822(-1233269979)) {
					local29.method13831(arg0, 1508751935);
				}
				local39 = local29;
			} else {
				local39 = new Class120_Sub1_Sub3_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, 0, 0, arg1, arg2, arg5, arg6, arg14);
			}
			this.aClass570_5.method31708(arg7, arg12, arg13, local39, null, 1830631154);
			return true;
		}
		@Pc(83) int local83;
		@Pc(92) Interface60 local92;
		@Pc(141) Class120_Sub1_Sub3_Sub2 local141;
		if (arg1 == Class607.aClass607_2.anInt5396 * 1323580581) {
			local83 = 65;
			local92 = (Interface60) this.aClass570_5.method31570(arg7, arg12, arg13, (byte) 9);
			if (local92 != null) {
				local83 = ((Class625) this.aClass41_Sub3_2.method18054(local92.method13834((byte) -12), -302500169)).anInt5512 * 1589465651 + 1;
			}
			if (arg3) {
				local141 = new Class120_Sub1_Sub3_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, anIntArray171[arg2] * local83, local83 * anIntArray172[arg2], arg1, arg2, arg14);
				if (local141.method13822(1568017746)) {
					local141.method13831(arg0, -742100643);
				}
				local39 = local141;
			} else {
				local39 = new Class120_Sub1_Sub3_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, anIntArray171[arg2] * local83, anIntArray172[arg2] * local83, arg1, arg2, arg5, arg6, arg14);
			}
			this.aClass570_5.method31708(arg7, arg12, arg13, local39, null, 1830631154);
			return true;
		} else if (arg1 == Class607.aClass607_8.anInt5396 * 1323580581) {
			local83 = 33;
			local92 = (Interface60) this.aClass570_5.method31570(arg7, arg12, arg13, (byte) -66);
			if (local92 != null) {
				local83 = ((Class625) this.aClass41_Sub3_2.method18054(local92.method13834((byte) 60), 1773031176)).anInt5512 * 1589465651 / 2 + 1;
			}
			if (arg3) {
				local141 = new Class120_Sub1_Sub3_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, anIntArray171[arg2] * local83, anIntArray172[arg2] * local83, arg1, arg2 + 4, arg14);
				if (local141.method13822(-1496373429)) {
					local141.method13831(arg0, 1880194866);
				}
				local39 = local141;
			} else {
				local39 = new Class120_Sub1_Sub3_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, local83 * anIntArray170[arg2], local83 * anIntArray173[arg2], arg1, arg2 + 4, arg5, arg6, arg14);
			}
			this.aClass570_5.method31708(arg7, arg12, arg13, local39, null, 1830631154);
			return true;
		} else if (Class607.aClass607_9.anInt5396 * 1323580581 == arg1) {
			local83 = arg2 + 2 & 0x3;
			if (arg3) {
				@Pc(359) Class120_Sub1_Sub3_Sub2 local359 = new Class120_Sub1_Sub3_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, 0, 0, arg1, local83 + 4, arg14);
				if (local359.method13822(1180591951)) {
					local359.method13831(arg0, 1182932930);
				}
				local39 = local359;
			} else {
				local39 = new Class120_Sub1_Sub3_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, 0, 0, arg1, local83 + 4, arg5, arg6, arg14);
			}
			this.aClass570_5.method31708(arg7, arg12, arg13, local39, null, 1830631154);
			return true;
		} else if (arg1 == Class607.aClass607_7.anInt5396 * 1323580581) {
			@Pc(419) int local419 = arg2 + 2 & 0x3;
			@Pc(421) int local421 = 33;
			@Pc(430) Interface60 local430 = (Interface60) this.aClass570_5.method31570(arg7, arg12, arg13, (byte) -5);
			if (local430 != null) {
				local421 = ((Class625) this.aClass41_Sub3_2.method18054(local430.method13834((byte) 1), 1941123905)).anInt5512 * 1589465651 / 2 + 1;
			}
			@Pc(527) Class120_Sub1_Sub3 local527;
			if (arg3) {
				@Pc(483) Class120_Sub1_Sub3_Sub2 local483 = new Class120_Sub1_Sub3_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, local421 * anIntArray170[arg2], local421 * anIntArray173[arg2], arg1, arg2 + 4, arg14);
				@Pc(507) Class120_Sub1_Sub3_Sub2 local507 = new Class120_Sub1_Sub3_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, 0, 0, arg1, local419 + 4, arg14);
				if (local483.method13822(368376762)) {
					local483.method13831(arg0, -869019651);
				}
				if (local507.method13822(4870222)) {
					local507.method13831(arg0, 872280237);
				}
				local39 = local483;
				local527 = local507;
			} else {
				@Pc(562) Class120_Sub1_Sub3_Sub1 local562 = new Class120_Sub1_Sub3_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, local421 * anIntArray170[arg2], anIntArray173[arg2] * local421, arg1, arg2 + 4, arg5, arg6, arg14);
				@Pc(588) Class120_Sub1_Sub3_Sub1 local588 = new Class120_Sub1_Sub3_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, 0, 0, arg1, local419 + 4, arg5, arg6, arg14);
				local39 = local562;
				local527 = local588;
			}
			this.aClass570_5.method31708(arg7, arg12, arg13, local39, local527, 1830631154);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aiz", name = "cj", descriptor = "(Lclient!di;IIIIB)V")
	void method12004(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		@Pc(7) Interface60 local7 = this.method12011(arg1, arg2, arg3, arg4, -16777216);
		if (local7 == null) {
			return;
		}
		@Pc(19) Class625 local19 = (Class625) this.aClass41_Sub3_2.method18054(local7.method13834((byte) 118), -1585470798);
		@Pc(23) int local23 = local7.method13819(842638573);
		@Pc(27) int local27 = local7.method13820(65098026);
		if (local19.method32455(1629721056)) {
			Class716.method37229(arg1, arg3, arg4, local19, (short) 479);
		}
		if (local7.method13822(1035003767)) {
			local7.method13825(arg0, -1621103841);
		}
		if (arg2 == 0) {
			this.aClass570_5.method31608(arg1, arg3, arg4, -875496576);
			this.aClass570_5.method31562(arg1, arg3, arg4, -2036731858);
			if (local19.anInt5508 * 1797429727 == 1) {
				if (local27 == 0) {
					this.aClass570_5.aClass600_1.method32056(1, arg1, arg3, arg4);
				} else if (local27 == 1) {
					this.aClass570_5.aClass600_1.method32056(2, arg1, arg3, arg4 + 1);
				} else if (local27 == 2) {
					this.aClass570_5.aClass600_1.method32056(1, arg1, arg3 + 1, arg4);
				} else if (local27 == 3) {
					this.aClass570_5.aClass600_1.method32056(2, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 1) {
			this.aClass570_5.method31710(arg1, arg3, arg4, -1282927571);
			this.aClass570_5.method31564(arg1, arg3, arg4, (byte) 52);
		} else if (arg2 == 2) {
			this.aClass570_5.method31543(arg1, arg3, arg4, client.anInterface62_1, -1976997275);
			if (local23 == Class607.aClass607_20.anInt5396 * 1323580581) {
				if ((local27 & 0x1) == 0) {
					this.aClass570_5.aClass600_1.method32056(8, arg1, arg3, arg4);
				} else {
					this.aClass570_5.aClass600_1.method32056(16, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 3) {
			this.aClass570_5.method31565(arg1, arg3, arg4, 837148476);
		}
	}

	@OriginalMember(owner = "client!aiz", name = "dt", descriptor = "(IIII)Lclient!sc;")
	Interface60 method12005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Interface60 local1 = null;
		if (arg1 == 0) {
			local1 = (Interface60) this.aClass570_5.method31570(arg0, arg2, arg3, (byte) 76);
		}
		if (arg1 == 1) {
			local1 = (Interface60) this.aClass570_5.method31572(arg0, arg2, arg3, (byte) 25);
		}
		if (arg1 == 2) {
			local1 = (Interface60) this.aClass570_5.method31574(arg0, arg2, arg3, client.anInterface62_1, (byte) -100);
		}
		if (arg1 == 3) {
			local1 = (Interface60) this.aClass570_5.method31558(arg0, arg2, arg3, -385198110);
		}
		return local1;
	}

	@OriginalMember(owner = "client!aiz", name = "cq", descriptor = "(Lclient!di;IIZLclient!vv;IIIIIIIIIZLclient!cb;IILclient!oc;)Z")
	boolean method12006(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class625 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) Class100 arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) Class457 arg18) {
		@Pc(53) Class120_Sub1_Sub2 local53;
		if (arg1 == Class607.aClass607_13.anInt5396 * 1323580581) {
			@Pc(10) int local10 = arg4.anInt5508 * 1797429727;
			if (aBoolean269 && arg4.anInt5508 * 1797429727 == -1) {
				local10 = 1;
			}
			if (arg3) {
				@Pc(43) Class120_Sub1_Sub2_Sub1 local43 = new Class120_Sub1_Sub2_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg14, arg18);
				if (local43.method13822(1462778166)) {
					local43.method13831(arg0, -1737299121);
				}
				local53 = local43;
			} else {
				local53 = new Class120_Sub1_Sub2_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass570_5.method31556(arg7, arg12, arg13, local53, null, (byte) 0);
			if (arg2 == 0) {
				if (this.aBoolean263 && arg4.aBoolean946) {
					arg15.method2941(arg12, arg13, 50);
					arg15.method2941(arg12, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean260) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				}
			} else if (arg2 == 1) {
				if (this.aBoolean263 && arg4.aBoolean946) {
					arg15.method2941(arg12, arg13 + 1, 50);
					arg15.method2941(arg12 + 1, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean260) {
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13 + 1, arg4.anInt5509 * -1136955327, -(arg4.anInt5510 * -1688990527));
				}
			} else if (arg2 == 2) {
				if (this.aBoolean263 && arg4.aBoolean946) {
					arg15.method2941(arg12 + 1, arg13, 50);
					arg15.method2941(arg12 + 1, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean260) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12 + 1, arg13, arg4.anInt5509 * -1136955327, -(arg4.anInt5510 * -1688990527));
				}
			} else if (arg2 == 3) {
				if (this.aBoolean263 && arg4.aBoolean946) {
					arg15.method2941(arg12, arg13, 50);
					arg15.method2941(arg12 + 1, arg13, 50);
				}
				if (local10 == 1 && !this.aBoolean260) {
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				}
			}
			if (arg4.anInt5512 * 1589465651 != 64) {
				this.aClass570_5.method31559(arg7, arg12, arg13, arg4.anInt5512 * 1589465651, -1814169233);
			}
			return true;
		}
		@Pc(331) Class120_Sub1_Sub2 local331;
		@Pc(321) Class120_Sub1_Sub2_Sub1 local321;
		if (Class607.aClass607_3.anInt5396 * 1323580581 == arg1) {
			if (arg3) {
				local321 = new Class120_Sub1_Sub2_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg14, arg18);
				if (local321.method13822(-389658031)) {
					local321.method13831(arg0, 314082656);
				}
				local331 = local321;
			} else {
				local331 = new Class120_Sub1_Sub2_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass570_5.method31556(arg7, arg12, arg13, local331, null, (byte) 0);
			if (arg4.aBoolean946 && this.aBoolean263) {
				if (arg2 == 0) {
					arg15.method2941(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method2941(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method2941(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method2941(arg12, arg13, 50);
				}
			}
			return true;
		} else if (arg1 == Class607.aClass607_16.anInt5396 * 1323580581) {
			@Pc(425) int local425 = arg2 + 1 & 0x3;
			if (arg3) {
				@Pc(450) Class120_Sub1_Sub2_Sub1 local450 = new Class120_Sub1_Sub2_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2 + 4, arg14, arg18);
				@Pc(471) Class120_Sub1_Sub2_Sub1 local471 = new Class120_Sub1_Sub2_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, local425, arg14, arg18);
				if (local450.method13822(1101430625)) {
					local450.method13831(arg0, -1628213284);
				}
				if (local471.method13822(-1154684816)) {
					local471.method13831(arg0, -269489792);
				}
				local331 = local450;
				local53 = local471;
			} else {
				local331 = new Class120_Sub1_Sub2_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2 + 4, arg5, arg6, arg18);
				local53 = new Class120_Sub1_Sub2_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, local425, arg5, arg6, arg18);
			}
			this.aClass570_5.method31556(arg7, arg12, arg13, local331, local53, (byte) 0);
			if ((arg4.anInt5508 * 1797429727 == 1 || aBoolean269 && arg4.anInt5508 * 1797429727 == -1) && !this.aBoolean260) {
				if (arg2 == 0) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13 + 1, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				} else if (arg2 == 1) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12 + 1, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13 + 1, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				} else if (arg2 == 2) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12 + 1, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				} else if (arg2 == 3) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				}
			}
			if (arg4.anInt5512 * 1589465651 != 64) {
				this.aClass570_5.method31559(arg7, arg12, arg13, arg4.anInt5512 * 1589465651, -1207951740);
			}
			return true;
		} else if (arg1 == Class607.aClass607_5.anInt5396 * 1323580581) {
			if (arg3) {
				local321 = new Class120_Sub1_Sub2_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg14, arg18);
				if (local321.method13822(235676329)) {
					local321.method13831(arg0, -1626162330);
				}
				local331 = local321;
			} else {
				local331 = new Class120_Sub1_Sub2_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass570_5.method31556(arg7, arg12, arg13, local331, null, (byte) 0);
			if (arg4.aBoolean946 && this.aBoolean263) {
				if (arg2 == 0) {
					arg15.method2941(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method2941(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method2941(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method2941(arg12, arg13, 50);
				}
			}
			return true;
		} else if (arg1 == Class607.aClass607_20.anInt5396 * 1323580581) {
			@Pc(898) Class120_Sub1_Sub1 local898;
			if (arg3) {
				@Pc(888) Class120_Sub1_Sub1_Sub3 local888 = new Class120_Sub1_Sub1_Sub3(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg12, arg12, arg13, arg13, arg1, arg2, arg14, true, arg18);
				if (local888.method13822(-723503388)) {
					local888.method13831(arg0, 1056911537);
				}
				local898 = local888;
			} else {
				local898 = new Class120_Sub1_Sub1_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg12, arg16 + arg12 - 1, arg13, arg17 + arg13 - 1, arg1, arg2, arg5, arg6, true, arg18);
			}
			this.aClass570_5.method31696(local898, false, 6898847);
			if (arg4.anInt5508 * 1797429727 == 1 && !this.aBoolean260) {
				@Pc(957) byte local957;
				if ((arg2 & 0x1) == 0) {
					local957 = 8;
				} else {
					local957 = 16;
				}
				this.aClass570_5.aClass600_1.method32055(local957, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, 0);
			}
			if (arg4.anInt5512 * 1589465651 != 64) {
				this.aClass570_5.method31559(arg7, arg12, arg13, arg4.anInt5512 * 1589465651, -1298321789);
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aiz", name = "cr", descriptor = "(Lclient!di;Lclient!ald;II)V")
	public void method12007(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class80_Sub36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aBoolean260) {
			return;
		}
		arg1.anInt3152 += -316490024;
		@Pc(11) boolean local11 = false;
		@Pc(13) Class655 local13 = null;
		@Pc(15) boolean local15 = false;
		while (true) {
			@Pc(27) int local27;
			@Pc(54) int local54;
			@Pc(255) int local255;
			@Pc(259) int local259;
			@Pc(58) int local58;
			while (arg1.anInt3152 * -1380987821 < arg1.aByteArray61.length) {
				local27 = arg1.method23362(558463540);
				if (local27 != 0) {
					@Pc(120) int local120;
					@Pc(128) int local128;
					@Pc(132) int local132;
					if (local27 == 1) {
						local54 = arg1.method23362(985715085);
						if (local54 > 0) {
							for (local58 = 0; local58 < local54; local58++) {
								@Pc(73) Class595 local73 = new Class595(arg0, this.aClass570_5.anInt5258 * 1479624119, arg1, 2);
								if (local73.anInt5349 * -619633025 == 31) {
									@Pc(87) Class89 local87 = (Class89) Class332.aClass41_Sub5_1.method18054(arg1.method23178((byte) -22), 151716171);
									local73.method31964(local87.anInt318 * 2073639953, local87.anInt315 * 1157207965, local87.anInt317 * 586892451, local87.anInt316 * 1197747641, 1928226857);
								}
								if (arg0.method20768() > 0) {
									@Pc(112) Class80_Sub12 local112 = local73.aClass80_Sub12_3;
									local120 = local112.method13949((byte) 0) + (arg2 << 9);
									local128 = local112.method13970(-1267970163) + (arg3 << 9);
									local132 = local120 >> 9;
									@Pc(136) int local136 = local128 >> 9;
									if (local132 >= 0 && local136 >= 0 && local132 < this.anInt1396 * -967539287 && local136 < this.anInt1380 * -1218727185) {
										local112.method13957(local120, this.anIntArrayArrayArray14[local73.anInt5347 * -1434233081][local132][local136] - local112.method13950(-1859336533), local128, 474851125);
										this.aClass570_5.method31591(local73, (byte) -31);
									}
								}
							}
						}
					} else if (local27 == 2) {
						if (local13 == null) {
							local13 = new Class655();
						}
						local13.method33172(arg1, -793027672);
					} else if (local27 == 3) {
						if (local13 == null) {
							local13 = new Class655();
						}
						local13.method33178(arg1, (byte) -75);
					} else if (local27 == 128) {
						if (local13 == null) {
							local13 = new Class655();
						}
						local13.method33177(arg1, this.aClass665_1, 1137707479);
					} else if (local27 == 129) {
						if (this.aByteArrayArrayArray8 == null) {
							this.aByteArrayArrayArray8 = new byte[4][][];
						}
						for (local54 = 0; local54 < 4; local54++) {
							@Pc(245) byte local245 = arg1.method23177((byte) -90);
							if (local245 == 0 && this.aByteArrayArrayArray8[local54] != null) {
								local255 = arg2;
								local259 = arg2 + 64;
								local120 = arg3;
								local128 = arg3 + 64;
								if (arg2 < 0) {
									local255 = 0;
								} else if (arg2 >= this.anInt1396 * -967539287) {
									local255 = this.anInt1396 * -967539287;
								}
								if (local259 < 0) {
									local259 = 0;
								} else if (local259 >= this.anInt1396 * -967539287) {
									local259 = this.anInt1396 * -967539287;
								}
								if (arg3 < 0) {
									local120 = 0;
								} else if (arg3 >= this.anInt1380 * -1218727185) {
									local120 = this.anInt1380 * -1218727185;
								}
								if (local128 < 0) {
									local128 = 0;
								} else if (local128 >= this.anInt1380 * -1218727185) {
									local128 = this.anInt1380 * -1218727185;
								}
								while (local255 < local259) {
									while (local120 < local128) {
										this.aByteArrayArrayArray8[local54][local255][local120] = 0;
										local120++;
									}
									local255++;
								}
							} else if (local245 == 1) {
								if (this.aByteArrayArrayArray8[local54] == null) {
									this.aByteArrayArrayArray8[local54] = new byte[this.anInt1396 * -967539287 + 1][this.anInt1380 * -1218727185 + 1];
								}
								for (local255 = 0; local255 < 64; local255 += 4) {
									for (local259 = 0; local259 < 64; local259 += 4) {
										@Pc(388) byte local388 = arg1.method23177((byte) -96);
										for (local128 = local255 + arg2; local128 < local255 + 4 + arg2; local128++) {
											for (local132 = local259 + arg3; local132 < local259 + 4 + arg3; local132++) {
												if (local128 >= 0 && local128 < this.anInt1396 * -967539287 && local132 >= 0 && local132 < this.anInt1380 * -1218727185) {
													this.aByteArrayArrayArray8[local54][local128][local132] = local388;
												}
											}
										}
									}
								}
							} else if (local245 == 2) {
								if (this.aByteArrayArrayArray8[local54] == null) {
									this.aByteArrayArrayArray8[local54] = new byte[this.anInt1396 * -967539287 + 1][this.anInt1380 * -1218727185 + 1];
								}
								if (local54 > 0) {
									local255 = arg2;
									local259 = arg2 + 64;
									local120 = arg3;
									local128 = arg3 + 64;
									if (arg2 < 0) {
										local255 = 0;
									} else if (arg2 >= this.anInt1396 * -967539287) {
										local255 = this.anInt1396 * -967539287;
									}
									if (local259 < 0) {
										local259 = 0;
									} else if (local259 >= this.anInt1396 * -967539287) {
										local259 = this.anInt1396 * -967539287;
									}
									if (arg3 < 0) {
										local120 = 0;
									} else if (arg3 >= this.anInt1380 * -1218727185) {
										local120 = this.anInt1380 * -1218727185;
									}
									if (local128 < 0) {
										local128 = 0;
									} else if (local128 >= this.anInt1380 * -1218727185) {
										local128 = this.anInt1380 * -1218727185;
									}
									while (local255 < local259) {
										while (local120 < local128) {
											this.aByteArrayArrayArray8[local54][local255][local120] = this.aByteArrayArrayArray8[local54 - 1][local255][local120];
											local120++;
										}
										local255++;
									}
								}
							}
						}
						local11 = true;
					} else if (local27 == 130) {
						local15 = true;
					} else {
						throw new IllegalStateException("");
					}
				} else if (local13 == null) {
					local13 = new Class655(arg1, this.aClass665_1);
				} else {
					local13.method33176(arg1, this.aClass665_1, 1659100823);
				}
			}
			for (local27 = 0; local27 < 8; local27++) {
				for (local54 = 0; local54 < 8; local54++) {
					local58 = local27 + (arg2 >> 3);
					local255 = local54 + (arg3 >> 3);
					if (local58 >= 0 && local58 < this.anInt1396 * -967539287 >> 3 && local255 >= 0 && local255 < this.anInt1380 * -1218727185 >> 3) {
						if (local13 != null) {
							this.aClass665_1.method33423(local58, local255, local13, -2123306121);
						}
						Class147.method23932(local58, local255, local15, 1113580362);
					}
				}
			}
			if (!local11 && this.aByteArrayArrayArray8 != null) {
				for (local27 = 0; local27 < 4; local27++) {
					if (this.aByteArrayArrayArray8[local27] != null) {
						for (local54 = 0; local54 < 16; local54++) {
							for (local58 = 0; local58 < 16; local58++) {
								local255 = local54 + (arg2 >> 2);
								local259 = local58 + (arg3 >> 2);
								if (local255 >= 0 && local255 < 26 && local259 >= 0 && local259 < 26) {
									this.aByteArrayArrayArray8[local27][local255][local259] = 0;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aiz", name = "ci", descriptor = "(Lclient!di;Lclient!ald;II)V")
	public void method12008(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class80_Sub36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aBoolean260) {
			return;
		}
		arg1.anInt3152 += -316490024;
		@Pc(11) boolean local11 = false;
		@Pc(13) Class655 local13 = null;
		@Pc(15) boolean local15 = false;
		while (true) {
			@Pc(27) int local27;
			@Pc(54) int local54;
			@Pc(255) int local255;
			@Pc(259) int local259;
			@Pc(58) int local58;
			while (arg1.anInt3152 * -1380987821 < arg1.aByteArray61.length) {
				local27 = arg1.method23362(-316436243);
				if (local27 != 0) {
					@Pc(120) int local120;
					@Pc(128) int local128;
					@Pc(132) int local132;
					if (local27 == 1) {
						local54 = arg1.method23362(-954673493);
						if (local54 > 0) {
							for (local58 = 0; local58 < local54; local58++) {
								@Pc(73) Class595 local73 = new Class595(arg0, this.aClass570_5.anInt5258 * 1479624119, arg1, 2);
								if (local73.anInt5349 * -619633025 == 31) {
									@Pc(87) Class89 local87 = (Class89) Class332.aClass41_Sub5_1.method18054(arg1.method23178((byte) -42), -1865262586);
									local73.method31964(local87.anInt318 * 2073639953, local87.anInt315 * 1157207965, local87.anInt317 * 586892451, local87.anInt316 * 1197747641, 1928226857);
								}
								if (arg0.method20768() > 0) {
									@Pc(112) Class80_Sub12 local112 = local73.aClass80_Sub12_3;
									local120 = local112.method13949((byte) 0) + (arg2 << 9);
									local128 = local112.method13970(799396313) + (arg3 << 9);
									local132 = local120 >> 9;
									@Pc(136) int local136 = local128 >> 9;
									if (local132 >= 0 && local136 >= 0 && local132 < this.anInt1396 * -967539287 && local136 < this.anInt1380 * -1218727185) {
										local112.method13957(local120, this.anIntArrayArrayArray14[local73.anInt5347 * -1434233081][local132][local136] - local112.method13950(-1779132811), local128, -359926575);
										this.aClass570_5.method31591(local73, (byte) -48);
									}
								}
							}
						}
					} else if (local27 == 2) {
						if (local13 == null) {
							local13 = new Class655();
						}
						local13.method33172(arg1, -486298554);
					} else if (local27 == 3) {
						if (local13 == null) {
							local13 = new Class655();
						}
						local13.method33178(arg1, (byte) 31);
					} else if (local27 == 128) {
						if (local13 == null) {
							local13 = new Class655();
						}
						local13.method33177(arg1, this.aClass665_1, 1137707479);
					} else if (local27 == 129) {
						if (this.aByteArrayArrayArray8 == null) {
							this.aByteArrayArrayArray8 = new byte[4][][];
						}
						for (local54 = 0; local54 < 4; local54++) {
							@Pc(245) byte local245 = arg1.method23177((byte) -29);
							if (local245 == 0 && this.aByteArrayArrayArray8[local54] != null) {
								local255 = arg2;
								local259 = arg2 + 64;
								local120 = arg3;
								local128 = arg3 + 64;
								if (arg2 < 0) {
									local255 = 0;
								} else if (arg2 >= this.anInt1396 * -967539287) {
									local255 = this.anInt1396 * -967539287;
								}
								if (local259 < 0) {
									local259 = 0;
								} else if (local259 >= this.anInt1396 * -967539287) {
									local259 = this.anInt1396 * -967539287;
								}
								if (arg3 < 0) {
									local120 = 0;
								} else if (arg3 >= this.anInt1380 * -1218727185) {
									local120 = this.anInt1380 * -1218727185;
								}
								if (local128 < 0) {
									local128 = 0;
								} else if (local128 >= this.anInt1380 * -1218727185) {
									local128 = this.anInt1380 * -1218727185;
								}
								while (local255 < local259) {
									while (local120 < local128) {
										this.aByteArrayArrayArray8[local54][local255][local120] = 0;
										local120++;
									}
									local255++;
								}
							} else if (local245 == 1) {
								if (this.aByteArrayArrayArray8[local54] == null) {
									this.aByteArrayArrayArray8[local54] = new byte[this.anInt1396 * -967539287 + 1][this.anInt1380 * -1218727185 + 1];
								}
								for (local255 = 0; local255 < 64; local255 += 4) {
									for (local259 = 0; local259 < 64; local259 += 4) {
										@Pc(388) byte local388 = arg1.method23177((byte) -65);
										for (local128 = local255 + arg2; local128 < local255 + 4 + arg2; local128++) {
											for (local132 = local259 + arg3; local132 < local259 + 4 + arg3; local132++) {
												if (local128 >= 0 && local128 < this.anInt1396 * -967539287 && local132 >= 0 && local132 < this.anInt1380 * -1218727185) {
													this.aByteArrayArrayArray8[local54][local128][local132] = local388;
												}
											}
										}
									}
								}
							} else if (local245 == 2) {
								if (this.aByteArrayArrayArray8[local54] == null) {
									this.aByteArrayArrayArray8[local54] = new byte[this.anInt1396 * -967539287 + 1][this.anInt1380 * -1218727185 + 1];
								}
								if (local54 > 0) {
									local255 = arg2;
									local259 = arg2 + 64;
									local120 = arg3;
									local128 = arg3 + 64;
									if (arg2 < 0) {
										local255 = 0;
									} else if (arg2 >= this.anInt1396 * -967539287) {
										local255 = this.anInt1396 * -967539287;
									}
									if (local259 < 0) {
										local259 = 0;
									} else if (local259 >= this.anInt1396 * -967539287) {
										local259 = this.anInt1396 * -967539287;
									}
									if (arg3 < 0) {
										local120 = 0;
									} else if (arg3 >= this.anInt1380 * -1218727185) {
										local120 = this.anInt1380 * -1218727185;
									}
									if (local128 < 0) {
										local128 = 0;
									} else if (local128 >= this.anInt1380 * -1218727185) {
										local128 = this.anInt1380 * -1218727185;
									}
									while (local255 < local259) {
										while (local120 < local128) {
											this.aByteArrayArrayArray8[local54][local255][local120] = this.aByteArrayArrayArray8[local54 - 1][local255][local120];
											local120++;
										}
										local255++;
									}
								}
							}
						}
						local11 = true;
					} else if (local27 == 130) {
						local15 = true;
					} else {
						throw new IllegalStateException("");
					}
				} else if (local13 == null) {
					local13 = new Class655(arg1, this.aClass665_1);
				} else {
					local13.method33176(arg1, this.aClass665_1, 1982588617);
				}
			}
			for (local27 = 0; local27 < 8; local27++) {
				for (local54 = 0; local54 < 8; local54++) {
					local58 = local27 + (arg2 >> 3);
					local255 = local54 + (arg3 >> 3);
					if (local58 >= 0 && local58 < this.anInt1396 * -967539287 >> 3 && local255 >= 0 && local255 < this.anInt1380 * -1218727185 >> 3) {
						if (local13 != null) {
							this.aClass665_1.method33423(local58, local255, local13, -2139872120);
						}
						Class147.method23932(local58, local255, local15, -912553775);
					}
				}
			}
			if (!local11 && this.aByteArrayArrayArray8 != null) {
				for (local27 = 0; local27 < 4; local27++) {
					if (this.aByteArrayArrayArray8[local27] != null) {
						for (local54 = 0; local54 < 16; local54++) {
							for (local58 = 0; local58 < 16; local58++) {
								local255 = local54 + (arg2 >> 2);
								local259 = local58 + (arg3 >> 2);
								if (local255 >= 0 && local255 < 26 && local259 >= 0 && local259 < 26) {
									this.aByteArrayArrayArray8[local27][local255][local259] = 0;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aiz", name = "cm", descriptor = "(Lclient!di;Lclient!ald;IIIIIII)V")
	public void method12009(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class80_Sub36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aBoolean260) {
			return;
		}
		arg1.anInt3152 += -316490024;
		@Pc(11) boolean local11 = false;
		@Pc(13) Class655 local13 = null;
		@Pc(15) boolean local15 = false;
		@Pc(21) int local21 = (arg6 & 0x7) * 8;
		@Pc(27) int local27 = (arg7 & 0x7) * 8;
		while (true) {
			@Pc(39) int local39;
			@Pc(65) int local65;
			@Pc(328) int local328;
			@Pc(69) int local69;
			while (arg1.anInt3152 * -1380987821 < arg1.aByteArray61.length) {
				local39 = arg1.method23362(-1697050426);
				if (local39 != 0) {
					@Pc(135) int local135;
					@Pc(175) int local175;
					@Pc(193) int local193;
					@Pc(129) int local129;
					if (local39 == 1) {
						local65 = arg1.method23362(-773221029);
						if (local65 > 0) {
							for (local69 = 0; local69 < local65; local69++) {
								@Pc(84) Class595 local84 = new Class595(arg0, this.aClass570_5.anInt5258 * 1479624119, arg1, 2);
								if (local84.anInt5349 * -619633025 == 31) {
									@Pc(98) Class89 local98 = (Class89) Class332.aClass41_Sub5_1.method18054(arg1.method23178((byte) -14), -1539264710);
									local84.method31964(local98.anInt318 * 2073639953, local98.anInt315 * 1157207965, local98.anInt317 * 586892451, local98.anInt316 * 1197747641, 1928226857);
								}
								if (arg0.method20768() > 0) {
									@Pc(123) Class80_Sub12 local123 = local84.aClass80_Sub12_3;
									local129 = local123.method13949((byte) 0) >> 9;
									local135 = local123.method13970(-1852458035) >> 9;
									if (arg5 == local84.anInt5347 * -1434233081 && local129 >= local21 && local129 < local21 + 8 && local135 >= local27 && local135 < local27 + 8) {
										local175 = (arg3 << 9) + Class356.method28099(local123.method13949((byte) 0) & 0xFFF, local123.method13970(-933478418) & 0xFFF, arg8, 1198169608);
										local193 = (arg4 << 9) + Class450.method29276(local123.method13949((byte) 0) & 0xFFF, local123.method13970(-1635960984) & 0xFFF, arg8, 213052723);
										local129 = local175 >> 9;
										local135 = local193 >> 9;
										if (local129 >= 0 && local135 >= 0 && local129 < this.anInt1396 * -967539287 && local135 < this.anInt1380 * -1218727185) {
											local84.anInt5347 = arg2 * 823158455;
											local123.method13957(local175, this.anIntArrayArrayArray14[local84.anInt5347 * -1434233081][local129][local135] - local123.method13950(-1756904428), local193, 484060505);
											this.aClass570_5.method31591(local84, (byte) -81);
										}
									}
								}
							}
						}
					} else if (local39 == 2) {
						if (local13 == null) {
							local13 = new Class655();
						}
						local13.method33172(arg1, -1102897016);
					} else if (local39 == 3) {
						if (local13 == null) {
							local13 = new Class655();
						}
						local13.method33178(arg1, (byte) 65);
					} else if (local39 == 128) {
						if (local13 == null) {
							local13 = new Class655();
						}
						local13.method33177(arg1, this.aClass665_1, 1137707479);
					} else if (local39 == 129) {
						if (this.aByteArrayArrayArray8 == null) {
							this.aByteArrayArrayArray8 = new byte[4][][];
						}
						for (local65 = 0; local65 < 4; local65++) {
							@Pc(315) byte local315 = arg1.method23177((byte) -40);
							@Pc(332) int local332;
							if (local315 == 0 && this.aByteArrayArrayArray8[arg2] != null) {
								if (local65 <= arg5) {
									local328 = arg3;
									local332 = arg3 + 7;
									local129 = arg4;
									local135 = arg4 + 7;
									if (arg3 < 0) {
										local328 = 0;
									} else if (arg3 >= this.anInt1396 * -967539287) {
										local328 = this.anInt1396 * -967539287;
									}
									if (local332 < 0) {
										local332 = 0;
									} else if (local332 >= this.anInt1396 * -967539287) {
										local332 = this.anInt1396 * -967539287;
									}
									if (arg4 < 0) {
										local129 = 0;
									} else if (arg4 >= this.anInt1380 * -1218727185) {
										local129 = this.anInt1380 * -1218727185;
									}
									if (local135 < 0) {
										local135 = 0;
									} else if (local135 >= this.anInt1380 * -1218727185) {
										local135 = this.anInt1380 * -1218727185;
									}
									while (local328 < local332) {
										while (local129 < local135) {
											this.aByteArrayArrayArray8[arg2][local328][local129] = 0;
											local129++;
										}
										local328++;
									}
								}
							} else if (local315 == 1) {
								if (this.aByteArrayArrayArray8[arg2] == null) {
									this.aByteArrayArrayArray8[arg2] = new byte[this.anInt1396 * -967539287 + 1][this.anInt1380 * -1218727185 + 1];
								}
								for (local328 = 0; local328 < 64; local328 += 4) {
									for (local332 = 0; local332 < 64; local332 += 4) {
										@Pc(462) byte local462 = arg1.method23177((byte) 20);
										if (local65 <= arg5) {
											for (local135 = local328; local135 < local328 + 4; local135++) {
												for (local175 = local332; local175 < local332 + 4; local175++) {
													if (local135 >= local21 && local135 < local21 + 8 && local175 >= local27 && local175 < local27 + 8) {
														local193 = arg3 + Class221.method25909(local135 & 0x7, local175 & 0x7, arg8, (byte) 107);
														@Pc(519) int local519 = arg4 + Class304.method27124(local135 & 0x7, local175 & 0x7, arg8, (byte) -59);
														if (local193 >= 0 && local193 < this.anInt1396 * -967539287 && local519 >= 0 && local519 < this.anInt1380 * -1218727185) {
															this.aByteArrayArrayArray8[arg2][local193][local519] = local462;
															local11 = true;
														}
													}
												}
											}
										}
									}
								}
							} else if (local315 == 2) {
							}
						}
					} else if (local39 == 130) {
						local15 = true;
					} else {
						throw new IllegalStateException("");
					}
				} else if (local13 == null) {
					local13 = new Class655(arg1, this.aClass665_1);
				} else {
					local13.method33176(arg1, this.aClass665_1, 1339381945);
				}
			}
			if (local13 != null) {
				this.aClass665_1.method33423(arg3 >> 3, arg4 >> 3, local13, -2140970399);
			}
			Class147.method23932(arg3 >> 3, arg4 >> 3, local15, -54275901);
			if (!local11 && this.aByteArrayArrayArray8 != null && this.aByteArrayArrayArray8[arg2] != null) {
				local39 = arg3 + 7;
				local65 = arg4 + 7;
				for (local69 = arg3; local69 < local39; local69++) {
					for (local328 = arg4; local328 < local65; local328++) {
						this.aByteArrayArrayArray8[arg2][local69][local328] = 0;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aiz", name = "dw", descriptor = "(Lclient!di;Z)V")
	public void method12010(@OriginalArg(0) Class102 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass570_5.method31577();
		if (!arg1) {
			@Pc(12) int local12;
			@Pc(20) int local20;
			if (this.anInt1383 * -2108820349 > 1) {
				for (local12 = 0; local12 < this.anInt1396 * -967539287; local12++) {
					for (local20 = 0; local20 < this.anInt1380 * -1218727185; local20++) {
						if ((this.aClass502_2.aByteArrayArrayArray12[1][local12][local20] & 0x2) == 2) {
							this.aClass570_5.method31553(local12, local20, (short) -17304);
						}
					}
				}
			}
			for (local12 = 0; local12 < this.anInt1383 * -2108820349; local12++) {
				for (local20 = 0; local20 <= this.anInt1380 * -1218727185; local20++) {
					for (@Pc(67) int local67 = 0; local67 <= this.anInt1396 * -967539287; local67++) {
						if ((this.aByteArrayArrayArray6[local12][local67][local20] & 0x4) != 0) {
							@Pc(87) int local87 = local67;
							@Pc(89) int local89 = local67;
							@Pc(91) int local91 = local20;
							@Pc(93) int local93 = local20;
							while (local91 > 0 && (this.aByteArrayArrayArray6[local12][local67][local91 - 1] & 0x4) != 0 && local93 - local91 < 10) {
								local91--;
							}
							while (local93 < this.anInt1380 * -1218727185 && (this.aByteArrayArrayArray6[local12][local67][local93 + 1] & 0x4) != 0 && local93 - local91 < 10) {
								local93++;
							}
							@Pc(152) int local152;
							label108: while (local87 > 0 && local89 - local87 < 10) {
								for (local152 = local91; local152 <= local93; local152++) {
									if ((this.aByteArrayArrayArray6[local12][local87 - 1][local152] & 0x4) == 0) {
										break label108;
									}
								}
								local87--;
							}
							label95: while (local89 < this.anInt1396 * -967539287 && local89 - local87 < 10) {
								for (local152 = local91; local152 <= local93; local152++) {
									if ((this.aByteArrayArrayArray6[local12][local89 + 1][local152] & 0x4) == 0) {
										break label95;
									}
								}
								local89++;
							}
							if ((local89 - local87 + 1) * (local93 - local91 + 1) >= 4) {
								local152 = this.anIntArrayArrayArray14[local12][local87][local91];
								this.aClass570_5.aClass600_1.method32091(4, local12, local87 << 9, (local89 << 9) + 512, local91 << 9, (local93 << 9) + 512, local152, local152);
								for (@Pc(255) int local255 = local87; local255 <= local89; local255++) {
									for (@Pc(260) int local260 = local91; local260 <= local93; local260++) {
										this.aByteArrayArrayArray6[local12][local255][local260] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			this.aClass570_5.aClass600_1.method32057();
		}
		this.aByteArrayArrayArray6 = null;
	}

	@OriginalMember(owner = "client!aiz", name = "ck", descriptor = "(IIIII)Lclient!sc;")
	Interface60 method12011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(1) Interface60 local1 = null;
		if (arg1 == 0) {
			local1 = (Interface60) this.aClass570_5.method31570(arg0, arg2, arg3, (byte) 40);
		}
		if (arg1 == 1) {
			local1 = (Interface60) this.aClass570_5.method31572(arg0, arg2, arg3, (byte) 59);
		}
		if (arg1 == 2) {
			local1 = (Interface60) this.aClass570_5.method31574(arg0, arg2, arg3, client.anInterface62_1, (byte) -88);
		}
		if (arg1 == 3) {
			local1 = (Interface60) this.aClass570_5.method31558(arg0, arg2, arg3, 800983207);
		}
		return local1;
	}

	@OriginalMember(owner = "client!aiz", name = "dn", descriptor = "(Lclient!di;IIII)V")
	void method12012(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Interface60 local7 = this.method12011(arg1, arg2, arg3, arg4, -16777216);
		if (local7 == null) {
			return;
		}
		@Pc(19) Class625 local19 = (Class625) this.aClass41_Sub3_2.method18054(local7.method13834((byte) 1), 1228884355);
		@Pc(23) int local23 = local7.method13819(339582932);
		@Pc(27) int local27 = local7.method13820(-700384390);
		if (local19.method32455(1458026133)) {
			Class716.method37229(arg1, arg3, arg4, local19, (short) 479);
		}
		if (local7.method13822(-335236651)) {
			local7.method13825(arg0, -478529440);
		}
		if (arg2 == 0) {
			this.aClass570_5.method31608(arg1, arg3, arg4, -72832883);
			this.aClass570_5.method31562(arg1, arg3, arg4, -1973179961);
			if (local19.anInt5508 * 1797429727 == 1) {
				if (local27 == 0) {
					this.aClass570_5.aClass600_1.method32056(1, arg1, arg3, arg4);
				} else if (local27 == 1) {
					this.aClass570_5.aClass600_1.method32056(2, arg1, arg3, arg4 + 1);
				} else if (local27 == 2) {
					this.aClass570_5.aClass600_1.method32056(1, arg1, arg3 + 1, arg4);
				} else if (local27 == 3) {
					this.aClass570_5.aClass600_1.method32056(2, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 1) {
			this.aClass570_5.method31710(arg1, arg3, arg4, -229260550);
			this.aClass570_5.method31564(arg1, arg3, arg4, (byte) 94);
		} else if (arg2 == 2) {
			this.aClass570_5.method31543(arg1, arg3, arg4, client.anInterface62_1, -1925271937);
			if (local23 == Class607.aClass607_20.anInt5396 * 1323580581) {
				if ((local27 & 0x1) == 0) {
					this.aClass570_5.aClass600_1.method32056(8, arg1, arg3, arg4);
				} else {
					this.aClass570_5.aClass600_1.method32056(16, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 3) {
			this.aClass570_5.method31565(arg1, arg3, arg4, -182960428);
		}
	}

	@OriginalMember(owner = "client!aiz", name = "cz", descriptor = "(Lclient!di;[BIIIIIII)V")
	public void method12018(@OriginalArg(0) Class102 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) Class80_Sub36 local4 = new Class80_Sub36(arg1);
		@Pc(6) int local6 = -1;
		label91: while (true) {
			@Pc(10) int local10 = local4.method23261((byte) -60);
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(19) int local19 = 0;
			while (true) {
				@Pc(51) Class619 local51;
				@Pc(129) int local129;
				@Pc(153) int local153;
				@Pc(161) int local161;
				do {
					@Pc(157) int local157;
					do {
						do {
							do {
								do {
									@Pc(36) int local36;
									@Pc(42) int local42;
									do {
										do {
											do {
												@Pc(46) int local46;
												do {
													do {
														@Pc(23) int local23 = local4.method23195(1654660171);
														if (local23 == 0) {
															continue label91;
														}
														local19 += local23 - 1;
														local36 = local19 & 0x3F;
														local42 = local19 >> 6 & 0x3F;
														local46 = local19 >> 12;
														local51 = new Class619(local4);
													} while (arg5 != local46);
												} while (local42 < arg6);
											} while (local42 >= arg6 + 8);
										} while (local36 < arg7);
									} while (local36 >= arg7 + 8);
									@Pc(77) Class625 local77 = (Class625) this.aClass41_Sub3_2.method18054(local6, -1308916220);
									@Pc(89) int local89;
									@Pc(94) int local94;
									if ((local51.anInt5435 * -509515973 & 0x1) == 0) {
										local89 = local77.anInt5503 * 1462300569;
										local94 = local77.anInt5504 * -1951356049;
									} else {
										local89 = local77.anInt5504 * -1951356049;
										local94 = local77.anInt5503 * 1462300569;
									}
									local129 = arg3 + Class297.method27002(local42 & 0x7, local36 & 0x7, arg8, local77.anInt5503 * 1462300569, local77.anInt5504 * -1951356049, local51.anInt5435 * -509515973, (short) 9472);
									local153 = arg4 + Class430.method29083(local42 & 0x7, local36 & 0x7, arg8, local77.anInt5503 * 1462300569, local77.anInt5504 * -1951356049, local51.anInt5435 * -509515973, -1625151967);
									local157 = local129 + local89;
									local161 = local94 + local153;
								} while (local129 >= this.anInt1396 * -967539287);
							} while (local153 >= this.anInt1380 * -1218727185);
						} while (local157 <= 0);
					} while (local161 <= 0);
				} while (Class607.aClass607_21.anInt5396 * 1323580581 != local51.anInt5434 * 13806191 && Class607.aClass607_22.anInt5396 * 1323580581 != local51.anInt5434 * 13806191 && (local129 <= 0 || local153 <= 0 || local129 >= this.anInt1396 * -967539287 - 1 || local153 >= this.anInt1380 * -1218727185 - 1));
				this.method12001(arg0, arg2, arg2, local129, local153, local6, arg8 + local51.anInt5435 * -509515973 & 0x3, local51.anInt5434 * 13806191, -1, 0, local51.aClass457_90, 2037097126);
			}
		}
	}

	@OriginalMember(owner = "client!aiz", name = "dc", descriptor = "(Lclient!di;IIII)V")
	void method12019(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Interface60 local7 = this.method12011(arg1, arg2, arg3, arg4, -16777216);
		if (local7 == null) {
			return;
		}
		@Pc(19) Class625 local19 = (Class625) this.aClass41_Sub3_2.method18054(local7.method13834((byte) 56), 1479038012);
		@Pc(23) int local23 = local7.method13819(1296501070);
		@Pc(27) int local27 = local7.method13820(-529972627);
		if (local19.method32455(1633340284)) {
			Class716.method37229(arg1, arg3, arg4, local19, (short) 479);
		}
		if (local7.method13822(931321976)) {
			local7.method13825(arg0, -1757801020);
		}
		if (arg2 == 0) {
			this.aClass570_5.method31608(arg1, arg3, arg4, 1765606754);
			this.aClass570_5.method31562(arg1, arg3, arg4, -2098116082);
			if (local19.anInt5508 * 1797429727 == 1) {
				if (local27 == 0) {
					this.aClass570_5.aClass600_1.method32056(1, arg1, arg3, arg4);
				} else if (local27 == 1) {
					this.aClass570_5.aClass600_1.method32056(2, arg1, arg3, arg4 + 1);
				} else if (local27 == 2) {
					this.aClass570_5.aClass600_1.method32056(1, arg1, arg3 + 1, arg4);
				} else if (local27 == 3) {
					this.aClass570_5.aClass600_1.method32056(2, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 1) {
			this.aClass570_5.method31710(arg1, arg3, arg4, -2094194482);
			this.aClass570_5.method31564(arg1, arg3, arg4, (byte) 43);
		} else if (arg2 == 2) {
			this.aClass570_5.method31543(arg1, arg3, arg4, client.anInterface62_1, -1148643444);
			if (local23 == Class607.aClass607_20.anInt5396 * 1323580581) {
				if ((local27 & 0x1) == 0) {
					this.aClass570_5.aClass600_1.method32056(8, arg1, arg3, arg4);
				} else {
					this.aClass570_5.aClass600_1.method32056(16, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 3) {
			this.aClass570_5.method31565(arg1, arg3, arg4, -1543980501);
		}
	}

	@OriginalMember(owner = "client!aiz", name = "dg", descriptor = "(Lclient!di;IIZLclient!vv;IIIIIIIIIZLclient!cb;IILclient!oc;)Z")
	boolean method12020(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class625 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) Class100 arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) Class457 arg18) {
		@Pc(53) Class120_Sub1_Sub2 local53;
		if (arg1 == Class607.aClass607_13.anInt5396 * 1323580581) {
			@Pc(10) int local10 = arg4.anInt5508 * 1797429727;
			if (aBoolean269 && arg4.anInt5508 * 1797429727 == -1) {
				local10 = 1;
			}
			if (arg3) {
				@Pc(43) Class120_Sub1_Sub2_Sub1 local43 = new Class120_Sub1_Sub2_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg14, arg18);
				if (local43.method13822(948751481)) {
					local43.method13831(arg0, 1841703633);
				}
				local53 = local43;
			} else {
				local53 = new Class120_Sub1_Sub2_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass570_5.method31556(arg7, arg12, arg13, local53, null, (byte) 0);
			if (arg2 == 0) {
				if (this.aBoolean263 && arg4.aBoolean946) {
					arg15.method2941(arg12, arg13, 50);
					arg15.method2941(arg12, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean260) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				}
			} else if (arg2 == 1) {
				if (this.aBoolean263 && arg4.aBoolean946) {
					arg15.method2941(arg12, arg13 + 1, 50);
					arg15.method2941(arg12 + 1, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean260) {
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13 + 1, arg4.anInt5509 * -1136955327, -(arg4.anInt5510 * -1688990527));
				}
			} else if (arg2 == 2) {
				if (this.aBoolean263 && arg4.aBoolean946) {
					arg15.method2941(arg12 + 1, arg13, 50);
					arg15.method2941(arg12 + 1, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean260) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12 + 1, arg13, arg4.anInt5509 * -1136955327, -(arg4.anInt5510 * -1688990527));
				}
			} else if (arg2 == 3) {
				if (this.aBoolean263 && arg4.aBoolean946) {
					arg15.method2941(arg12, arg13, 50);
					arg15.method2941(arg12 + 1, arg13, 50);
				}
				if (local10 == 1 && !this.aBoolean260) {
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				}
			}
			if (arg4.anInt5512 * 1589465651 != 64) {
				this.aClass570_5.method31559(arg7, arg12, arg13, arg4.anInt5512 * 1589465651, -1520428701);
			}
			return true;
		}
		@Pc(331) Class120_Sub1_Sub2 local331;
		@Pc(321) Class120_Sub1_Sub2_Sub1 local321;
		if (Class607.aClass607_3.anInt5396 * 1323580581 == arg1) {
			if (arg3) {
				local321 = new Class120_Sub1_Sub2_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg14, arg18);
				if (local321.method13822(-1479745226)) {
					local321.method13831(arg0, 519068956);
				}
				local331 = local321;
			} else {
				local331 = new Class120_Sub1_Sub2_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass570_5.method31556(arg7, arg12, arg13, local331, null, (byte) 0);
			if (arg4.aBoolean946 && this.aBoolean263) {
				if (arg2 == 0) {
					arg15.method2941(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method2941(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method2941(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method2941(arg12, arg13, 50);
				}
			}
			return true;
		} else if (arg1 == Class607.aClass607_16.anInt5396 * 1323580581) {
			@Pc(425) int local425 = arg2 + 1 & 0x3;
			if (arg3) {
				@Pc(450) Class120_Sub1_Sub2_Sub1 local450 = new Class120_Sub1_Sub2_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2 + 4, arg14, arg18);
				@Pc(471) Class120_Sub1_Sub2_Sub1 local471 = new Class120_Sub1_Sub2_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, local425, arg14, arg18);
				if (local450.method13822(-960219171)) {
					local450.method13831(arg0, -411808972);
				}
				if (local471.method13822(904337402)) {
					local471.method13831(arg0, -1367597306);
				}
				local331 = local450;
				local53 = local471;
			} else {
				local331 = new Class120_Sub1_Sub2_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2 + 4, arg5, arg6, arg18);
				local53 = new Class120_Sub1_Sub2_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, local425, arg5, arg6, arg18);
			}
			this.aClass570_5.method31556(arg7, arg12, arg13, local331, local53, (byte) 0);
			if ((arg4.anInt5508 * 1797429727 == 1 || aBoolean269 && arg4.anInt5508 * 1797429727 == -1) && !this.aBoolean260) {
				if (arg2 == 0) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13 + 1, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				} else if (arg2 == 1) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12 + 1, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13 + 1, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				} else if (arg2 == 2) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12 + 1, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				} else if (arg2 == 3) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				}
			}
			if (arg4.anInt5512 * 1589465651 != 64) {
				this.aClass570_5.method31559(arg7, arg12, arg13, arg4.anInt5512 * 1589465651, -1434623012);
			}
			return true;
		} else if (arg1 == Class607.aClass607_5.anInt5396 * 1323580581) {
			if (arg3) {
				local321 = new Class120_Sub1_Sub2_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg14, arg18);
				if (local321.method13822(1408633490)) {
					local321.method13831(arg0, 2002127842);
				}
				local331 = local321;
			} else {
				local331 = new Class120_Sub1_Sub2_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass570_5.method31556(arg7, arg12, arg13, local331, null, (byte) 0);
			if (arg4.aBoolean946 && this.aBoolean263) {
				if (arg2 == 0) {
					arg15.method2941(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method2941(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method2941(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method2941(arg12, arg13, 50);
				}
			}
			return true;
		} else if (arg1 == Class607.aClass607_20.anInt5396 * 1323580581) {
			@Pc(898) Class120_Sub1_Sub1 local898;
			if (arg3) {
				@Pc(888) Class120_Sub1_Sub1_Sub3 local888 = new Class120_Sub1_Sub1_Sub3(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg12, arg12, arg13, arg13, arg1, arg2, arg14, true, arg18);
				if (local888.method13822(-393398181)) {
					local888.method13831(arg0, 1692138843);
				}
				local898 = local888;
			} else {
				local898 = new Class120_Sub1_Sub1_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg12, arg16 + arg12 - 1, arg13, arg17 + arg13 - 1, arg1, arg2, arg5, arg6, true, arg18);
			}
			this.aClass570_5.method31696(local898, false, 6898847);
			if (arg4.anInt5508 * 1797429727 == 1 && !this.aBoolean260) {
				@Pc(957) byte local957;
				if ((arg2 & 0x1) == 0) {
					local957 = 8;
				} else {
					local957 = 16;
				}
				this.aClass570_5.aClass600_1.method32055(local957, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, 0);
			}
			if (arg4.anInt5512 * 1589465651 != 64) {
				this.aClass570_5.method31559(arg7, arg12, arg13, arg4.anInt5512 * 1589465651, -1927952107);
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aiz", name = "dh", descriptor = "(Lclient!di;IIZLclient!vv;IIIIIIIIIZLclient!cb;IILclient!oc;)Z")
	boolean method12021(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class625 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) Class100 arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) Class457 arg18) {
		@Pc(53) Class120_Sub1_Sub2 local53;
		if (arg1 == Class607.aClass607_13.anInt5396 * 1323580581) {
			@Pc(10) int local10 = arg4.anInt5508 * 1797429727;
			if (aBoolean269 && arg4.anInt5508 * 1797429727 == -1) {
				local10 = 1;
			}
			if (arg3) {
				@Pc(43) Class120_Sub1_Sub2_Sub1 local43 = new Class120_Sub1_Sub2_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg14, arg18);
				if (local43.method13822(1494232853)) {
					local43.method13831(arg0, 826212741);
				}
				local53 = local43;
			} else {
				local53 = new Class120_Sub1_Sub2_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass570_5.method31556(arg7, arg12, arg13, local53, null, (byte) 0);
			if (arg2 == 0) {
				if (this.aBoolean263 && arg4.aBoolean946) {
					arg15.method2941(arg12, arg13, 50);
					arg15.method2941(arg12, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean260) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				}
			} else if (arg2 == 1) {
				if (this.aBoolean263 && arg4.aBoolean946) {
					arg15.method2941(arg12, arg13 + 1, 50);
					arg15.method2941(arg12 + 1, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean260) {
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13 + 1, arg4.anInt5509 * -1136955327, -(arg4.anInt5510 * -1688990527));
				}
			} else if (arg2 == 2) {
				if (this.aBoolean263 && arg4.aBoolean946) {
					arg15.method2941(arg12 + 1, arg13, 50);
					arg15.method2941(arg12 + 1, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean260) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12 + 1, arg13, arg4.anInt5509 * -1136955327, -(arg4.anInt5510 * -1688990527));
				}
			} else if (arg2 == 3) {
				if (this.aBoolean263 && arg4.aBoolean946) {
					arg15.method2941(arg12, arg13, 50);
					arg15.method2941(arg12 + 1, arg13, 50);
				}
				if (local10 == 1 && !this.aBoolean260) {
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				}
			}
			if (arg4.anInt5512 * 1589465651 != 64) {
				this.aClass570_5.method31559(arg7, arg12, arg13, arg4.anInt5512 * 1589465651, -258394313);
			}
			return true;
		}
		@Pc(331) Class120_Sub1_Sub2 local331;
		@Pc(321) Class120_Sub1_Sub2_Sub1 local321;
		if (Class607.aClass607_3.anInt5396 * 1323580581 == arg1) {
			if (arg3) {
				local321 = new Class120_Sub1_Sub2_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg14, arg18);
				if (local321.method13822(922967212)) {
					local321.method13831(arg0, -577996992);
				}
				local331 = local321;
			} else {
				local331 = new Class120_Sub1_Sub2_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass570_5.method31556(arg7, arg12, arg13, local331, null, (byte) 0);
			if (arg4.aBoolean946 && this.aBoolean263) {
				if (arg2 == 0) {
					arg15.method2941(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method2941(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method2941(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method2941(arg12, arg13, 50);
				}
			}
			return true;
		} else if (arg1 == Class607.aClass607_16.anInt5396 * 1323580581) {
			@Pc(425) int local425 = arg2 + 1 & 0x3;
			if (arg3) {
				@Pc(450) Class120_Sub1_Sub2_Sub1 local450 = new Class120_Sub1_Sub2_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2 + 4, arg14, arg18);
				@Pc(471) Class120_Sub1_Sub2_Sub1 local471 = new Class120_Sub1_Sub2_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, local425, arg14, arg18);
				if (local450.method13822(-1090601032)) {
					local450.method13831(arg0, -812856798);
				}
				if (local471.method13822(1477273086)) {
					local471.method13831(arg0, 526757540);
				}
				local331 = local450;
				local53 = local471;
			} else {
				local331 = new Class120_Sub1_Sub2_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2 + 4, arg5, arg6, arg18);
				local53 = new Class120_Sub1_Sub2_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, local425, arg5, arg6, arg18);
			}
			this.aClass570_5.method31556(arg7, arg12, arg13, local331, local53, (byte) 0);
			if ((arg4.anInt5508 * 1797429727 == 1 || aBoolean269 && arg4.anInt5508 * 1797429727 == -1) && !this.aBoolean260) {
				if (arg2 == 0) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13 + 1, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				} else if (arg2 == 1) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12 + 1, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13 + 1, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				} else if (arg2 == 2) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12 + 1, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				} else if (arg2 == 3) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				}
			}
			if (arg4.anInt5512 * 1589465651 != 64) {
				this.aClass570_5.method31559(arg7, arg12, arg13, arg4.anInt5512 * 1589465651, -1108149748);
			}
			return true;
		} else if (arg1 == Class607.aClass607_5.anInt5396 * 1323580581) {
			if (arg3) {
				local321 = new Class120_Sub1_Sub2_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg14, arg18);
				if (local321.method13822(-1858497881)) {
					local321.method13831(arg0, 149856820);
				}
				local331 = local321;
			} else {
				local331 = new Class120_Sub1_Sub2_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass570_5.method31556(arg7, arg12, arg13, local331, null, (byte) 0);
			if (arg4.aBoolean946 && this.aBoolean263) {
				if (arg2 == 0) {
					arg15.method2941(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method2941(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method2941(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method2941(arg12, arg13, 50);
				}
			}
			return true;
		} else if (arg1 == Class607.aClass607_20.anInt5396 * 1323580581) {
			@Pc(898) Class120_Sub1_Sub1 local898;
			if (arg3) {
				@Pc(888) Class120_Sub1_Sub1_Sub3 local888 = new Class120_Sub1_Sub1_Sub3(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg12, arg12, arg13, arg13, arg1, arg2, arg14, true, arg18);
				if (local888.method13822(-881455452)) {
					local888.method13831(arg0, -1119212593);
				}
				local898 = local888;
			} else {
				local898 = new Class120_Sub1_Sub1_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg12, arg16 + arg12 - 1, arg13, arg17 + arg13 - 1, arg1, arg2, arg5, arg6, true, arg18);
			}
			this.aClass570_5.method31696(local898, false, 6898847);
			if (arg4.anInt5508 * 1797429727 == 1 && !this.aBoolean260) {
				@Pc(957) byte local957;
				if ((arg2 & 0x1) == 0) {
					local957 = 8;
				} else {
					local957 = 16;
				}
				this.aClass570_5.aClass600_1.method32055(local957, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, 0);
			}
			if (arg4.anInt5512 * 1589465651 != 64) {
				this.aClass570_5.method31559(arg7, arg12, arg13, arg4.anInt5512 * 1589465651, -1749856656);
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aiz", name = "du", descriptor = "(Lclient!di;Z)V")
	public void method12022(@OriginalArg(0) Class102 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass570_5.method31577();
		if (!arg1) {
			@Pc(12) int local12;
			@Pc(20) int local20;
			if (this.anInt1383 * -2108820349 > 1) {
				for (local12 = 0; local12 < this.anInt1396 * -967539287; local12++) {
					for (local20 = 0; local20 < this.anInt1380 * -1218727185; local20++) {
						if ((this.aClass502_2.aByteArrayArrayArray12[1][local12][local20] & 0x2) == 2) {
							this.aClass570_5.method31553(local12, local20, (short) 18077);
						}
					}
				}
			}
			for (local12 = 0; local12 < this.anInt1383 * -2108820349; local12++) {
				for (local20 = 0; local20 <= this.anInt1380 * -1218727185; local20++) {
					for (@Pc(67) int local67 = 0; local67 <= this.anInt1396 * -967539287; local67++) {
						if ((this.aByteArrayArrayArray6[local12][local67][local20] & 0x4) != 0) {
							@Pc(87) int local87 = local67;
							@Pc(89) int local89 = local67;
							@Pc(91) int local91 = local20;
							@Pc(93) int local93 = local20;
							while (local91 > 0 && (this.aByteArrayArrayArray6[local12][local67][local91 - 1] & 0x4) != 0 && local93 - local91 < 10) {
								local91--;
							}
							while (local93 < this.anInt1380 * -1218727185 && (this.aByteArrayArrayArray6[local12][local67][local93 + 1] & 0x4) != 0 && local93 - local91 < 10) {
								local93++;
							}
							@Pc(152) int local152;
							label108: while (local87 > 0 && local89 - local87 < 10) {
								for (local152 = local91; local152 <= local93; local152++) {
									if ((this.aByteArrayArrayArray6[local12][local87 - 1][local152] & 0x4) == 0) {
										break label108;
									}
								}
								local87--;
							}
							label95: while (local89 < this.anInt1396 * -967539287 && local89 - local87 < 10) {
								for (local152 = local91; local152 <= local93; local152++) {
									if ((this.aByteArrayArrayArray6[local12][local89 + 1][local152] & 0x4) == 0) {
										break label95;
									}
								}
								local89++;
							}
							if ((local89 - local87 + 1) * (local93 - local91 + 1) >= 4) {
								local152 = this.anIntArrayArrayArray14[local12][local87][local91];
								this.aClass570_5.aClass600_1.method32091(4, local12, local87 << 9, (local89 << 9) + 512, local91 << 9, (local93 << 9) + 512, local152, local152);
								for (@Pc(255) int local255 = local87; local255 <= local89; local255++) {
									for (@Pc(260) int local260 = local91; local260 <= local93; local260++) {
										this.aByteArrayArrayArray6[local12][local255][local260] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			this.aClass570_5.aClass600_1.method32057();
		}
		this.aByteArrayArrayArray6 = null;
	}

	@OriginalMember(owner = "client!aiz", name = "cc", descriptor = "(Lclient!di;[BIIIIIIII)V")
	public void method12023(@OriginalArg(0) Class102 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(4) Class80_Sub36 local4 = new Class80_Sub36(arg1);
		@Pc(6) int local6 = -1;
		label91: while (true) {
			@Pc(10) int local10 = local4.method23261((byte) 71);
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(19) int local19 = 0;
			while (true) {
				@Pc(51) Class619 local51;
				@Pc(129) int local129;
				@Pc(153) int local153;
				@Pc(161) int local161;
				do {
					@Pc(157) int local157;
					do {
						do {
							do {
								do {
									@Pc(36) int local36;
									@Pc(42) int local42;
									do {
										do {
											do {
												@Pc(46) int local46;
												do {
													do {
														@Pc(23) int local23 = local4.method23195(1881767045);
														if (local23 == 0) {
															continue label91;
														}
														local19 += local23 - 1;
														local36 = local19 & 0x3F;
														local42 = local19 >> 6 & 0x3F;
														local46 = local19 >> 12;
														local51 = new Class619(local4);
													} while (arg5 != local46);
												} while (local42 < arg6);
											} while (local42 >= arg6 + 8);
										} while (local36 < arg7);
									} while (local36 >= arg7 + 8);
									@Pc(77) Class625 local77 = (Class625) this.aClass41_Sub3_2.method18054(local6, 2012113473);
									@Pc(89) int local89;
									@Pc(94) int local94;
									if ((local51.anInt5435 * -509515973 & 0x1) == 0) {
										local89 = local77.anInt5503 * 1462300569;
										local94 = local77.anInt5504 * -1951356049;
									} else {
										local89 = local77.anInt5504 * -1951356049;
										local94 = local77.anInt5503 * 1462300569;
									}
									local129 = arg3 + Class297.method27002(local42 & 0x7, local36 & 0x7, arg8, local77.anInt5503 * 1462300569, local77.anInt5504 * -1951356049, local51.anInt5435 * -509515973, (short) 9472);
									local153 = arg4 + Class430.method29083(local42 & 0x7, local36 & 0x7, arg8, local77.anInt5503 * 1462300569, local77.anInt5504 * -1951356049, local51.anInt5435 * -509515973, -462522095);
									local157 = local129 + local89;
									local161 = local94 + local153;
								} while (local129 >= this.anInt1396 * -967539287);
							} while (local153 >= this.anInt1380 * -1218727185);
						} while (local157 <= 0);
					} while (local161 <= 0);
				} while (Class607.aClass607_21.anInt5396 * 1323580581 != local51.anInt5434 * 13806191 && Class607.aClass607_22.anInt5396 * 1323580581 != local51.anInt5434 * 13806191 && (local129 <= 0 || local153 <= 0 || local129 >= this.anInt1396 * -967539287 - 1 || local153 >= this.anInt1380 * -1218727185 - 1));
				this.method12001(arg0, arg2, arg2, local129, local153, local6, arg8 + local51.anInt5435 * -509515973 & 0x3, local51.anInt5434 * 13806191, -1, 0, local51.aClass457_90, 1882924993);
			}
		}
	}

	@OriginalMember(owner = "client!aiz", name = "ca", descriptor = "(Lclient!di;ZI)V")
	public void method12024(@OriginalArg(0) Class102 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aClass570_5.method31577();
		if (!arg1) {
			@Pc(12) int local12;
			@Pc(20) int local20;
			if (this.anInt1383 * -2108820349 > 1) {
				for (local12 = 0; local12 < this.anInt1396 * -967539287; local12++) {
					for (local20 = 0; local20 < this.anInt1380 * -1218727185; local20++) {
						if ((this.aClass502_2.aByteArrayArrayArray12[1][local12][local20] & 0x2) == 2) {
							this.aClass570_5.method31553(local12, local20, (short) 15746);
						}
					}
				}
			}
			for (local12 = 0; local12 < this.anInt1383 * -2108820349; local12++) {
				for (local20 = 0; local20 <= this.anInt1380 * -1218727185; local20++) {
					for (@Pc(67) int local67 = 0; local67 <= this.anInt1396 * -967539287; local67++) {
						if ((this.aByteArrayArrayArray6[local12][local67][local20] & 0x4) != 0) {
							@Pc(87) int local87 = local67;
							@Pc(89) int local89 = local67;
							@Pc(91) int local91 = local20;
							@Pc(93) int local93 = local20;
							while (local91 > 0 && (this.aByteArrayArrayArray6[local12][local67][local91 - 1] & 0x4) != 0 && local93 - local91 < 10) {
								local91--;
							}
							while (local93 < this.anInt1380 * -1218727185 && (this.aByteArrayArrayArray6[local12][local67][local93 + 1] & 0x4) != 0 && local93 - local91 < 10) {
								local93++;
							}
							@Pc(152) int local152;
							label108: while (local87 > 0 && local89 - local87 < 10) {
								for (local152 = local91; local152 <= local93; local152++) {
									if ((this.aByteArrayArrayArray6[local12][local87 - 1][local152] & 0x4) == 0) {
										break label108;
									}
								}
								local87--;
							}
							label95: while (local89 < this.anInt1396 * -967539287 && local89 - local87 < 10) {
								for (local152 = local91; local152 <= local93; local152++) {
									if ((this.aByteArrayArrayArray6[local12][local89 + 1][local152] & 0x4) == 0) {
										break label95;
									}
								}
								local89++;
							}
							if ((local89 - local87 + 1) * (local93 - local91 + 1) >= 4) {
								local152 = this.anIntArrayArrayArray14[local12][local87][local91];
								this.aClass570_5.aClass600_1.method32091(4, local12, local87 << 9, (local89 << 9) + 512, local91 << 9, (local93 << 9) + 512, local152, local152);
								for (@Pc(255) int local255 = local87; local255 <= local89; local255++) {
									for (@Pc(260) int local260 = local91; local260 <= local93; local260++) {
										this.aByteArrayArrayArray6[local12][local255][local260] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			this.aClass570_5.aClass600_1.method32057();
		}
		this.aByteArrayArrayArray6 = null;
	}

	@OriginalMember(owner = "client!aiz", name = "df", descriptor = "(Lclient!di;IIII)V")
	void method12025(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Interface60 local7 = this.method12011(arg1, arg2, arg3, arg4, -16777216);
		if (local7 == null) {
			return;
		}
		@Pc(19) Class625 local19 = (Class625) this.aClass41_Sub3_2.method18054(local7.method13834((byte) 89), -804262388);
		@Pc(23) int local23 = local7.method13819(992473622);
		@Pc(27) int local27 = local7.method13820(467492830);
		if (local19.method32455(381202744)) {
			Class716.method37229(arg1, arg3, arg4, local19, (short) 479);
		}
		if (local7.method13822(214162915)) {
			local7.method13825(arg0, -673998695);
		}
		if (arg2 == 0) {
			this.aClass570_5.method31608(arg1, arg3, arg4, -370700811);
			this.aClass570_5.method31562(arg1, arg3, arg4, -2095500755);
			if (local19.anInt5508 * 1797429727 == 1) {
				if (local27 == 0) {
					this.aClass570_5.aClass600_1.method32056(1, arg1, arg3, arg4);
				} else if (local27 == 1) {
					this.aClass570_5.aClass600_1.method32056(2, arg1, arg3, arg4 + 1);
				} else if (local27 == 2) {
					this.aClass570_5.aClass600_1.method32056(1, arg1, arg3 + 1, arg4);
				} else if (local27 == 3) {
					this.aClass570_5.aClass600_1.method32056(2, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 1) {
			this.aClass570_5.method31710(arg1, arg3, arg4, -1233344453);
			this.aClass570_5.method31564(arg1, arg3, arg4, (byte) 84);
		} else if (arg2 == 2) {
			this.aClass570_5.method31543(arg1, arg3, arg4, client.anInterface62_1, -1940439440);
			if (local23 == Class607.aClass607_20.anInt5396 * 1323580581) {
				if ((local27 & 0x1) == 0) {
					this.aClass570_5.aClass600_1.method32056(8, arg1, arg3, arg4);
				} else {
					this.aClass570_5.aClass600_1.method32056(16, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 3) {
			this.aClass570_5.method31565(arg1, arg3, arg4, 1024333003);
		}
	}

	@OriginalMember(owner = "client!aiz", name = "dl", descriptor = "(IIII)Lclient!sc;")
	Interface60 method12026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Interface60 local1 = null;
		if (arg1 == 0) {
			local1 = (Interface60) this.aClass570_5.method31570(arg0, arg2, arg3, (byte) -24);
		}
		if (arg1 == 1) {
			local1 = (Interface60) this.aClass570_5.method31572(arg0, arg2, arg3, (byte) -39);
		}
		if (arg1 == 2) {
			local1 = (Interface60) this.aClass570_5.method31574(arg0, arg2, arg3, client.anInterface62_1, (byte) -122);
		}
		if (arg1 == 3) {
			local1 = (Interface60) this.aClass570_5.method31558(arg0, arg2, arg3, 427256622);
		}
		return local1;
	}

	@OriginalMember(owner = "client!aiz", name = "db", descriptor = "(IIII)Lclient!sc;")
	Interface60 method12027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Interface60 local1 = null;
		if (arg1 == 0) {
			local1 = (Interface60) this.aClass570_5.method31570(arg0, arg2, arg3, (byte) -10);
		}
		if (arg1 == 1) {
			local1 = (Interface60) this.aClass570_5.method31572(arg0, arg2, arg3, (byte) 23);
		}
		if (arg1 == 2) {
			local1 = (Interface60) this.aClass570_5.method31574(arg0, arg2, arg3, client.anInterface62_1, (byte) -37);
		}
		if (arg1 == 3) {
			local1 = (Interface60) this.aClass570_5.method31558(arg0, arg2, arg3, 157709778);
		}
		return local1;
	}

	@OriginalMember(owner = "client!aiz", name = "ch", descriptor = "(Lclient!di;[BIIS)V")
	public void method12028(@OriginalArg(0) Class102 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) short arg4) {
		@Pc(4) Class80_Sub36 local4 = new Class80_Sub36(arg1);
		@Pc(6) int local6 = -1;
		label66: while (true) {
			@Pc(10) int local10 = local4.method23261((byte) -70);
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(19) int local19 = 0;
			while (true) {
				@Pc(47) int local47;
				@Pc(52) Class619 local52;
				@Pc(56) int local56;
				@Pc(60) int local60;
				@Pc(103) int local103;
				do {
					@Pc(99) int local99;
					do {
						do {
							do {
								do {
									@Pc(23) int local23 = local4.method23195(1343089198);
									if (local23 == 0) {
										continue label66;
									}
									local19 += local23 - 1;
									@Pc(37) int local37 = local19 & 0x3F;
									@Pc(43) int local43 = local19 >> 6 & 0x3F;
									local47 = local19 >> 12;
									local52 = new Class619(local4);
									local56 = arg2 + local43;
									local60 = local37 + arg3;
									@Pc(67) Class625 local67 = (Class625) this.aClass41_Sub3_2.method18054(local6, 1746379166);
									@Pc(79) int local79;
									@Pc(84) int local84;
									if ((local52.anInt5435 * -509515973 & 0x1) == 0) {
										local79 = local67.anInt5503 * 1462300569;
										local84 = local67.anInt5504 * -1951356049;
									} else {
										local79 = local67.anInt5504 * -1951356049;
										local84 = local67.anInt5503 * 1462300569;
									}
									local99 = local79 + local56;
									local103 = local84 + local60;
								} while (local56 >= this.anInt1396 * -967539287);
							} while (local60 >= this.anInt1380 * -1218727185);
						} while (local99 <= 0);
					} while (local103 <= 0);
				} while (Class607.aClass607_21.anInt5396 * 1323580581 != local52.anInt5434 * 13806191 && local52.anInt5434 * 13806191 != Class607.aClass607_22.anInt5396 * 1323580581 && (local56 <= 0 || local60 <= 0 || local56 >= this.anInt1396 * -967539287 - 1 || local60 >= this.anInt1380 * -1218727185 - 1));
				this.method12001(arg0, local47, local47, local56, local60, local6, local52.anInt5435 * -509515973, local52.anInt5434 * 13806191, -1, 0, local52.aClass457_90, 1676279846);
			}
		}
	}

	@OriginalMember(owner = "client!aiz", name = "co", descriptor = "(Lclient!di;[BIIIIIII)V")
	public void method12029(@OriginalArg(0) Class102 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) Class80_Sub36 local4 = new Class80_Sub36(arg1);
		@Pc(6) int local6 = -1;
		label91: while (true) {
			@Pc(10) int local10 = local4.method23261((byte) -29);
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(19) int local19 = 0;
			while (true) {
				@Pc(51) Class619 local51;
				@Pc(129) int local129;
				@Pc(153) int local153;
				@Pc(161) int local161;
				do {
					@Pc(157) int local157;
					do {
						do {
							do {
								do {
									@Pc(36) int local36;
									@Pc(42) int local42;
									do {
										do {
											do {
												@Pc(46) int local46;
												do {
													do {
														@Pc(23) int local23 = local4.method23195(1669218298);
														if (local23 == 0) {
															continue label91;
														}
														local19 += local23 - 1;
														local36 = local19 & 0x3F;
														local42 = local19 >> 6 & 0x3F;
														local46 = local19 >> 12;
														local51 = new Class619(local4);
													} while (arg5 != local46);
												} while (local42 < arg6);
											} while (local42 >= arg6 + 8);
										} while (local36 < arg7);
									} while (local36 >= arg7 + 8);
									@Pc(77) Class625 local77 = (Class625) this.aClass41_Sub3_2.method18054(local6, -2005984805);
									@Pc(89) int local89;
									@Pc(94) int local94;
									if ((local51.anInt5435 * -509515973 & 0x1) == 0) {
										local89 = local77.anInt5503 * 1462300569;
										local94 = local77.anInt5504 * -1951356049;
									} else {
										local89 = local77.anInt5504 * -1951356049;
										local94 = local77.anInt5503 * 1462300569;
									}
									local129 = arg3 + Class297.method27002(local42 & 0x7, local36 & 0x7, arg8, local77.anInt5503 * 1462300569, local77.anInt5504 * -1951356049, local51.anInt5435 * -509515973, (short) 9472);
									local153 = arg4 + Class430.method29083(local42 & 0x7, local36 & 0x7, arg8, local77.anInt5503 * 1462300569, local77.anInt5504 * -1951356049, local51.anInt5435 * -509515973, -916026980);
									local157 = local129 + local89;
									local161 = local94 + local153;
								} while (local129 >= this.anInt1396 * -967539287);
							} while (local153 >= this.anInt1380 * -1218727185);
						} while (local157 <= 0);
					} while (local161 <= 0);
				} while (Class607.aClass607_21.anInt5396 * 1323580581 != local51.anInt5434 * 13806191 && Class607.aClass607_22.anInt5396 * 1323580581 != local51.anInt5434 * 13806191 && (local129 <= 0 || local153 <= 0 || local129 >= this.anInt1396 * -967539287 - 1 || local153 >= this.anInt1380 * -1218727185 - 1));
				this.method12001(arg0, arg2, arg2, local129, local153, local6, arg8 + local51.anInt5435 * -509515973 & 0x3, local51.anInt5434 * 13806191, -1, 0, local51.aClass457_90, 1998607106);
			}
		}
	}

	@OriginalMember(owner = "client!aiz", name = "ds", descriptor = "(Lclient!di;Z)V")
	public void method12030(@OriginalArg(0) Class102 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass570_5.method31577();
		if (!arg1) {
			@Pc(12) int local12;
			@Pc(20) int local20;
			if (this.anInt1383 * -2108820349 > 1) {
				for (local12 = 0; local12 < this.anInt1396 * -967539287; local12++) {
					for (local20 = 0; local20 < this.anInt1380 * -1218727185; local20++) {
						if ((this.aClass502_2.aByteArrayArrayArray12[1][local12][local20] & 0x2) == 2) {
							this.aClass570_5.method31553(local12, local20, (short) -11382);
						}
					}
				}
			}
			for (local12 = 0; local12 < this.anInt1383 * -2108820349; local12++) {
				for (local20 = 0; local20 <= this.anInt1380 * -1218727185; local20++) {
					for (@Pc(67) int local67 = 0; local67 <= this.anInt1396 * -967539287; local67++) {
						if ((this.aByteArrayArrayArray6[local12][local67][local20] & 0x4) != 0) {
							@Pc(87) int local87 = local67;
							@Pc(89) int local89 = local67;
							@Pc(91) int local91 = local20;
							@Pc(93) int local93 = local20;
							while (local91 > 0 && (this.aByteArrayArrayArray6[local12][local67][local91 - 1] & 0x4) != 0 && local93 - local91 < 10) {
								local91--;
							}
							while (local93 < this.anInt1380 * -1218727185 && (this.aByteArrayArrayArray6[local12][local67][local93 + 1] & 0x4) != 0 && local93 - local91 < 10) {
								local93++;
							}
							@Pc(152) int local152;
							label108: while (local87 > 0 && local89 - local87 < 10) {
								for (local152 = local91; local152 <= local93; local152++) {
									if ((this.aByteArrayArrayArray6[local12][local87 - 1][local152] & 0x4) == 0) {
										break label108;
									}
								}
								local87--;
							}
							label95: while (local89 < this.anInt1396 * -967539287 && local89 - local87 < 10) {
								for (local152 = local91; local152 <= local93; local152++) {
									if ((this.aByteArrayArrayArray6[local12][local89 + 1][local152] & 0x4) == 0) {
										break label95;
									}
								}
								local89++;
							}
							if ((local89 - local87 + 1) * (local93 - local91 + 1) >= 4) {
								local152 = this.anIntArrayArrayArray14[local12][local87][local91];
								this.aClass570_5.aClass600_1.method32091(4, local12, local87 << 9, (local89 << 9) + 512, local91 << 9, (local93 << 9) + 512, local152, local152);
								for (@Pc(255) int local255 = local87; local255 <= local89; local255++) {
									for (@Pc(260) int local260 = local91; local260 <= local93; local260++) {
										this.aByteArrayArrayArray6[local12][local255][local260] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			this.aClass570_5.aClass600_1.method32057();
		}
		this.aByteArrayArrayArray6 = null;
	}

	@OriginalMember(owner = "client!aiz", name = "cp", descriptor = "(Lclient!di;Lclient!ald;IIIIIII)V")
	public void method12031(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class80_Sub36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aBoolean260) {
			return;
		}
		arg1.anInt3152 += -316490024;
		@Pc(11) boolean local11 = false;
		@Pc(13) Class655 local13 = null;
		@Pc(15) boolean local15 = false;
		@Pc(21) int local21 = (arg6 & 0x7) * 8;
		@Pc(27) int local27 = (arg7 & 0x7) * 8;
		while (true) {
			@Pc(39) int local39;
			@Pc(65) int local65;
			@Pc(328) int local328;
			@Pc(69) int local69;
			while (arg1.anInt3152 * -1380987821 < arg1.aByteArray61.length) {
				local39 = arg1.method23362(-2031038456);
				if (local39 != 0) {
					@Pc(135) int local135;
					@Pc(175) int local175;
					@Pc(193) int local193;
					@Pc(129) int local129;
					if (local39 == 1) {
						local65 = arg1.method23362(992938857);
						if (local65 > 0) {
							for (local69 = 0; local69 < local65; local69++) {
								@Pc(84) Class595 local84 = new Class595(arg0, this.aClass570_5.anInt5258 * 1479624119, arg1, 2);
								if (local84.anInt5349 * -619633025 == 31) {
									@Pc(98) Class89 local98 = (Class89) Class332.aClass41_Sub5_1.method18054(arg1.method23178((byte) -41), 1720395123);
									local84.method31964(local98.anInt318 * 2073639953, local98.anInt315 * 1157207965, local98.anInt317 * 586892451, local98.anInt316 * 1197747641, 1928226857);
								}
								if (arg0.method20768() > 0) {
									@Pc(123) Class80_Sub12 local123 = local84.aClass80_Sub12_3;
									local129 = local123.method13949((byte) 0) >> 9;
									local135 = local123.method13970(1815345566) >> 9;
									if (arg5 == local84.anInt5347 * -1434233081 && local129 >= local21 && local129 < local21 + 8 && local135 >= local27 && local135 < local27 + 8) {
										local175 = (arg3 << 9) + Class356.method28099(local123.method13949((byte) 0) & 0xFFF, local123.method13970(942876385) & 0xFFF, arg8, 144707020);
										local193 = (arg4 << 9) + Class450.method29276(local123.method13949((byte) 0) & 0xFFF, local123.method13970(-1263974482) & 0xFFF, arg8, 1277516290);
										local129 = local175 >> 9;
										local135 = local193 >> 9;
										if (local129 >= 0 && local135 >= 0 && local129 < this.anInt1396 * -967539287 && local135 < this.anInt1380 * -1218727185) {
											local84.anInt5347 = arg2 * 823158455;
											local123.method13957(local175, this.anIntArrayArrayArray14[local84.anInt5347 * -1434233081][local129][local135] - local123.method13950(-1746805684), local193, -1898767340);
											this.aClass570_5.method31591(local84, (byte) -14);
										}
									}
								}
							}
						}
					} else if (local39 == 2) {
						if (local13 == null) {
							local13 = new Class655();
						}
						local13.method33172(arg1, 1699232937);
					} else if (local39 == 3) {
						if (local13 == null) {
							local13 = new Class655();
						}
						local13.method33178(arg1, (byte) -13);
					} else if (local39 == 128) {
						if (local13 == null) {
							local13 = new Class655();
						}
						local13.method33177(arg1, this.aClass665_1, 1137707479);
					} else if (local39 == 129) {
						if (this.aByteArrayArrayArray8 == null) {
							this.aByteArrayArrayArray8 = new byte[4][][];
						}
						for (local65 = 0; local65 < 4; local65++) {
							@Pc(315) byte local315 = arg1.method23177((byte) -10);
							@Pc(332) int local332;
							if (local315 == 0 && this.aByteArrayArrayArray8[arg2] != null) {
								if (local65 <= arg5) {
									local328 = arg3;
									local332 = arg3 + 7;
									local129 = arg4;
									local135 = arg4 + 7;
									if (arg3 < 0) {
										local328 = 0;
									} else if (arg3 >= this.anInt1396 * -967539287) {
										local328 = this.anInt1396 * -967539287;
									}
									if (local332 < 0) {
										local332 = 0;
									} else if (local332 >= this.anInt1396 * -967539287) {
										local332 = this.anInt1396 * -967539287;
									}
									if (arg4 < 0) {
										local129 = 0;
									} else if (arg4 >= this.anInt1380 * -1218727185) {
										local129 = this.anInt1380 * -1218727185;
									}
									if (local135 < 0) {
										local135 = 0;
									} else if (local135 >= this.anInt1380 * -1218727185) {
										local135 = this.anInt1380 * -1218727185;
									}
									while (local328 < local332) {
										while (local129 < local135) {
											this.aByteArrayArrayArray8[arg2][local328][local129] = 0;
											local129++;
										}
										local328++;
									}
								}
							} else if (local315 == 1) {
								if (this.aByteArrayArrayArray8[arg2] == null) {
									this.aByteArrayArrayArray8[arg2] = new byte[this.anInt1396 * -967539287 + 1][this.anInt1380 * -1218727185 + 1];
								}
								for (local328 = 0; local328 < 64; local328 += 4) {
									for (local332 = 0; local332 < 64; local332 += 4) {
										@Pc(462) byte local462 = arg1.method23177((byte) 11);
										if (local65 <= arg5) {
											for (local135 = local328; local135 < local328 + 4; local135++) {
												for (local175 = local332; local175 < local332 + 4; local175++) {
													if (local135 >= local21 && local135 < local21 + 8 && local175 >= local27 && local175 < local27 + 8) {
														local193 = arg3 + Class221.method25909(local135 & 0x7, local175 & 0x7, arg8, (byte) 53);
														@Pc(519) int local519 = arg4 + Class304.method27124(local135 & 0x7, local175 & 0x7, arg8, (byte) -92);
														if (local193 >= 0 && local193 < this.anInt1396 * -967539287 && local519 >= 0 && local519 < this.anInt1380 * -1218727185) {
															this.aByteArrayArrayArray8[arg2][local193][local519] = local462;
															local11 = true;
														}
													}
												}
											}
										}
									}
								}
							} else if (local315 == 2) {
							}
						}
					} else if (local39 == 130) {
						local15 = true;
					} else {
						throw new IllegalStateException("");
					}
				} else if (local13 == null) {
					local13 = new Class655(arg1, this.aClass665_1);
				} else {
					local13.method33176(arg1, this.aClass665_1, 1405261474);
				}
			}
			if (local13 != null) {
				this.aClass665_1.method33423(arg3 >> 3, arg4 >> 3, local13, -2114633952);
			}
			Class147.method23932(arg3 >> 3, arg4 >> 3, local15, -253375515);
			if (!local11 && this.aByteArrayArrayArray8 != null && this.aByteArrayArrayArray8[arg2] != null) {
				local39 = arg3 + 7;
				local65 = arg4 + 7;
				for (local69 = arg3; local69 < local39; local69++) {
					for (local328 = arg4; local328 < local65; local328++) {
						this.aByteArrayArrayArray8[arg2][local69][local328] = 0;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aiz", name = "dd", descriptor = "(Lclient!di;IIZLclient!vv;IIIIIIIIIZLclient!cb;IILclient!oc;)Z")
	boolean method12032(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class625 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) Class100 arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) Class457 arg18) {
		@Pc(53) Class120_Sub1_Sub2 local53;
		if (arg1 == Class607.aClass607_13.anInt5396 * 1323580581) {
			@Pc(10) int local10 = arg4.anInt5508 * 1797429727;
			if (aBoolean269 && arg4.anInt5508 * 1797429727 == -1) {
				local10 = 1;
			}
			if (arg3) {
				@Pc(43) Class120_Sub1_Sub2_Sub1 local43 = new Class120_Sub1_Sub2_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg14, arg18);
				if (local43.method13822(-488343802)) {
					local43.method13831(arg0, 1639398069);
				}
				local53 = local43;
			} else {
				local53 = new Class120_Sub1_Sub2_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass570_5.method31556(arg7, arg12, arg13, local53, null, (byte) 0);
			if (arg2 == 0) {
				if (this.aBoolean263 && arg4.aBoolean946) {
					arg15.method2941(arg12, arg13, 50);
					arg15.method2941(arg12, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean260) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				}
			} else if (arg2 == 1) {
				if (this.aBoolean263 && arg4.aBoolean946) {
					arg15.method2941(arg12, arg13 + 1, 50);
					arg15.method2941(arg12 + 1, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean260) {
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13 + 1, arg4.anInt5509 * -1136955327, -(arg4.anInt5510 * -1688990527));
				}
			} else if (arg2 == 2) {
				if (this.aBoolean263 && arg4.aBoolean946) {
					arg15.method2941(arg12 + 1, arg13, 50);
					arg15.method2941(arg12 + 1, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean260) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12 + 1, arg13, arg4.anInt5509 * -1136955327, -(arg4.anInt5510 * -1688990527));
				}
			} else if (arg2 == 3) {
				if (this.aBoolean263 && arg4.aBoolean946) {
					arg15.method2941(arg12, arg13, 50);
					arg15.method2941(arg12 + 1, arg13, 50);
				}
				if (local10 == 1 && !this.aBoolean260) {
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				}
			}
			if (arg4.anInt5512 * 1589465651 != 64) {
				this.aClass570_5.method31559(arg7, arg12, arg13, arg4.anInt5512 * 1589465651, -1511080224);
			}
			return true;
		}
		@Pc(331) Class120_Sub1_Sub2 local331;
		@Pc(321) Class120_Sub1_Sub2_Sub1 local321;
		if (Class607.aClass607_3.anInt5396 * 1323580581 == arg1) {
			if (arg3) {
				local321 = new Class120_Sub1_Sub2_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg14, arg18);
				if (local321.method13822(-1129671216)) {
					local321.method13831(arg0, 1762937328);
				}
				local331 = local321;
			} else {
				local331 = new Class120_Sub1_Sub2_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass570_5.method31556(arg7, arg12, arg13, local331, null, (byte) 0);
			if (arg4.aBoolean946 && this.aBoolean263) {
				if (arg2 == 0) {
					arg15.method2941(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method2941(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method2941(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method2941(arg12, arg13, 50);
				}
			}
			return true;
		} else if (arg1 == Class607.aClass607_16.anInt5396 * 1323580581) {
			@Pc(425) int local425 = arg2 + 1 & 0x3;
			if (arg3) {
				@Pc(450) Class120_Sub1_Sub2_Sub1 local450 = new Class120_Sub1_Sub2_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2 + 4, arg14, arg18);
				@Pc(471) Class120_Sub1_Sub2_Sub1 local471 = new Class120_Sub1_Sub2_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, local425, arg14, arg18);
				if (local450.method13822(-346279177)) {
					local450.method13831(arg0, -1417945040);
				}
				if (local471.method13822(-1065642983)) {
					local471.method13831(arg0, 1768152243);
				}
				local331 = local450;
				local53 = local471;
			} else {
				local331 = new Class120_Sub1_Sub2_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2 + 4, arg5, arg6, arg18);
				local53 = new Class120_Sub1_Sub2_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, local425, arg5, arg6, arg18);
			}
			this.aClass570_5.method31556(arg7, arg12, arg13, local331, local53, (byte) 0);
			if ((arg4.anInt5508 * 1797429727 == 1 || aBoolean269 && arg4.anInt5508 * 1797429727 == -1) && !this.aBoolean260) {
				if (arg2 == 0) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13 + 1, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				} else if (arg2 == 1) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12 + 1, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13 + 1, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				} else if (arg2 == 2) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12 + 1, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				} else if (arg2 == 3) {
					this.aClass570_5.aClass600_1.method32055(1, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
					this.aClass570_5.aClass600_1.method32055(2, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, arg4.anInt5510 * -1688990527);
				}
			}
			if (arg4.anInt5512 * 1589465651 != 64) {
				this.aClass570_5.method31559(arg7, arg12, arg13, arg4.anInt5512 * 1589465651, -1232390535);
			}
			return true;
		} else if (arg1 == Class607.aClass607_5.anInt5396 * 1323580581) {
			if (arg3) {
				local321 = new Class120_Sub1_Sub2_Sub1(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg14, arg18);
				if (local321.method13822(1486574251)) {
					local321.method13831(arg0, -1260059951);
				}
				local331 = local321;
			} else {
				local331 = new Class120_Sub1_Sub2_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass570_5.method31556(arg7, arg12, arg13, local331, null, (byte) 0);
			if (arg4.aBoolean946 && this.aBoolean263) {
				if (arg2 == 0) {
					arg15.method2941(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method2941(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method2941(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method2941(arg12, arg13, 50);
				}
			}
			return true;
		} else if (arg1 == Class607.aClass607_20.anInt5396 * 1323580581) {
			@Pc(898) Class120_Sub1_Sub1 local898;
			if (arg3) {
				@Pc(888) Class120_Sub1_Sub1_Sub3 local888 = new Class120_Sub1_Sub1_Sub3(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg12, arg12, arg13, arg13, arg1, arg2, arg14, true, arg18);
				if (local888.method13822(1988921618)) {
					local888.method13831(arg0, 561422025);
				}
				local898 = local888;
			} else {
				local898 = new Class120_Sub1_Sub1_Sub2(this.aClass570_5, arg0, this.aClass41_Sub3_2, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean260, arg12, arg16 + arg12 - 1, arg13, arg17 + arg13 - 1, arg1, arg2, arg5, arg6, true, arg18);
			}
			this.aClass570_5.method31696(local898, false, 6898847);
			if (arg4.anInt5508 * 1797429727 == 1 && !this.aBoolean260) {
				@Pc(957) byte local957;
				if ((arg2 & 0x1) == 0) {
					local957 = 8;
				} else {
					local957 = 16;
				}
				this.aClass570_5.aClass600_1.method32055(local957, arg7, arg12, arg13, arg4.anInt5509 * -1136955327, 0);
			}
			if (arg4.anInt5512 * 1589465651 != 64) {
				this.aClass570_5.method31559(arg7, arg12, arg13, arg4.anInt5512 * 1589465651, -1701317894);
			}
			return true;
		} else {
			return false;
		}
	}
}
