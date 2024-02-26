package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Iterator;

@OriginalClass("client!nq")
public final class Class445 implements Interface46 {

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "Lclient!ej;")
	Class243 aClass243_83 = new Class243(64);

	@OriginalMember(owner = "client!nq", name = "t", descriptor = "Lclient!pf;")
	Class480 aClass480_114;

	@OriginalMember(owner = "client!nq", name = "t", descriptor = "(FLclient!on;Lclient!oq;Lclient!on;Lclient!on;Lclient!on;Lclient!on;FFFFB)V")
	public static void method29236(@OriginalArg(0) float arg0, @OriginalArg(1) Class463 arg1, @OriginalArg(2) Class466 arg2, @OriginalArg(3) Class463 arg3, @OriginalArg(4) Class463 arg4, @OriginalArg(5) Class463 arg5, @OriginalArg(6) Class463 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) byte arg11) {
		if (arg3.method29480(arg1)) {
			return;
		}
		@Pc(9) Class463 local9 = Class463.method29541(0.0F, 0.0F, 0.0F);
		@Pc(14) Class463 local14 = Class463.method29472(Class463.method29487(arg3, arg1));
		local14.method29500(arg2);
		@Pc(21) Class463 local21 = Class463.method29487(local14, local9);
		@Pc(24) float local24 = local21.method29481();
		if (arg7 > 0.0F) {
			arg5 = Class463.method29472(arg5);
			arg5.method29496(local24 / arg7 * arg8);
		}
		if (Float.POSITIVE_INFINITY == arg5.aFloat297 || Float.isNaN(arg1.aFloat297) || local24 > arg9 || local24 < arg10) {
			arg1.method29478(arg3);
			arg4.method29575();
			return;
		}
		arg2.method29701();
		@Pc(68) Class463 local68 = Class463.method29541(1.0F, 0.0F, 0.0F);
		@Pc(73) Class463 local73 = Class463.method29541(0.0F, 1.0F, 0.0F);
		@Pc(78) Class463 local78 = Class463.method29541(0.0F, 0.0F, 1.0F);
		local68.method29500(arg2);
		local73.method29500(arg2);
		local78.method29500(arg2);
		@Pc(98) Class463 local98 = Class463.method29541(Class463.method29498(local68, arg4), Class463.method29498(local73, arg4), Class463.method29498(local78, arg4));
		@Pc(101) Class463 local101 = Class463.method29472(local98);
		local101.method29543();
		@Pc(111) Class463 local111 = Class463.method29562(Class463.method29514(local101, local101), Class463.method29551(arg5, 2.0F));
		@Pc(114) Class463 local114 = Class463.method29472(local21);
		local114.method29543();
		@Pc(119) Class463 local119 = Class463.method29472(local98);
		if (local111.aFloat297 > local114.aFloat297) {
			if (local21.aFloat297 < 0.0F) {
				local119.aFloat297 += arg5.aFloat297 * arg0;
				if (local119.aFloat297 > 0.0F) {
					local119.aFloat297 = 0.0F;
				}
			} else {
				local119.aFloat297 -= arg5.aFloat297 * arg0;
				if (local119.aFloat297 < 0.0F) {
					local119.aFloat297 = 0.0F;
				}
			}
		} else if (local101.aFloat297 < arg6.aFloat297) {
			if (local21.aFloat297 < 0.0F) {
				local119.aFloat297 -= arg0 * arg5.aFloat297;
				if (local119.aFloat297 < -arg6.aFloat297) {
					local119.aFloat297 = -arg6.aFloat297;
				}
			} else {
				local119.aFloat297 += arg0 * arg5.aFloat297;
				if (local119.aFloat297 > arg6.aFloat297) {
					local119.aFloat297 = arg6.aFloat297;
				}
			}
		}
		if (local111.aFloat295 > local114.aFloat295) {
			if (local21.aFloat295 < 0.0F) {
				local119.aFloat295 += arg0 * arg5.aFloat295;
				if (local119.aFloat295 > 0.0F) {
					local119.aFloat295 = 0.0F;
				}
			} else {
				local119.aFloat295 -= arg0 * arg5.aFloat295;
				if (local119.aFloat295 < 0.0F) {
					local119.aFloat295 = 0.0F;
				}
			}
		} else if (local101.aFloat295 < arg6.aFloat295) {
			if (local21.aFloat295 < 0.0F) {
				local119.aFloat295 -= arg5.aFloat295 * arg0;
				if (local119.aFloat295 < -arg6.aFloat295) {
					local119.aFloat295 = -arg6.aFloat295;
				}
			} else {
				local119.aFloat295 += arg5.aFloat295 * arg0;
				if (local119.aFloat295 > arg6.aFloat295) {
					local119.aFloat295 = arg6.aFloat295;
				}
			}
		}
		if (local111.aFloat296 > local114.aFloat296) {
			if (local21.aFloat296 < 0.0F) {
				local119.aFloat296 += arg5.aFloat296 * arg0;
				if (local119.aFloat296 > 0.0F) {
					local119.aFloat296 = 0.0F;
				}
			} else {
				local119.aFloat296 -= arg0 * arg5.aFloat296;
				if (local119.aFloat296 < 0.0F) {
					local119.aFloat296 = 0.0F;
				}
			}
		} else if (local101.aFloat296 < arg6.aFloat296) {
			if (local21.aFloat296 < 0.0F) {
				local119.aFloat296 -= arg0 * arg5.aFloat296;
				if (local119.aFloat296 < -arg6.aFloat296) {
					local119.aFloat296 = -arg6.aFloat296;
				}
			} else {
				local119.aFloat296 += arg0 * arg5.aFloat296;
				if (local119.aFloat296 > arg6.aFloat296) {
					local119.aFloat296 = arg6.aFloat296;
				}
			}
		}
		@Pc(421) Class463 local421 = Class463.method29551(local68, local119.aFloat297);
		local421.method29484(local73, local119.aFloat295);
		local421.method29484(local78, local119.aFloat296);
		arg4.method29503(local421, 0.8F);
		arg1.method29483(Class463.method29551(arg4, arg0));
		local101.method29557();
		local119.method29557();
		local114.method29557();
	}

	@OriginalMember(owner = "client!nq", name = "u", descriptor = "(Lclient!te;Lclient!di;I)V")
	public static void method29237(@OriginalArg(0) Class570 arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Iterator local2 = Class286.aList14.iterator();
		while (local2.hasNext()) {
			@Pc(9) Class658 local9 = (Class658) local2.next();
			if (local9.aBoolean973) {
				local9.method33243(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "u", descriptor = "(Lclient!ald;IB)Ljava/lang/String;")
	static String method29238(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(3) int local3 = arg0.gSmart1or2();
			if (local3 > arg1) {
				local3 = arg1;
			}
			@Pc(11) byte[] local11 = new byte[local3];
			arg0.pos += Class338.aClass336_1.method27860(arg0.data, arg0.pos * -1380987821, local11, 0, local3, (byte) -13) * 1034180571;
			return Class2.method1814(local11, 0, local3, (byte) 114);
		} catch (@Pc(39) Exception local39) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!nq", name = "t", descriptor = "(Ljava/lang/CharSequence;I)I")
	public static int method29239(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			@Pc(13) char local13 = arg0.charAt(local6);
			if (local13 <= '\u007f') {
				local4++;
			} else if (local13 <= '\u07ff') {
				local4 += 2;
			} else {
				local4 += 3;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!nq", name = "bj", descriptor = "(Lclient!yp;I)V")
	static void method29240(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 1815275855;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		Class301.method27041(local13, 2112029828);
		Class282.method26869(Class709.aClass310Array1[local13 >>> 16], local13 & 0xFFFF, local23, local33, arg0.aBoolean988, arg0, -399332650);
	}

	@OriginalMember(owner = "client!nq", name = "ca", descriptor = "(Lclient!yp;I)V")
	static void method29241(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2055214255);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class242.method26240(local16, local22, arg0, 975306769);
	}

	@OriginalMember(owner = "client!nq", name = "kn", descriptor = "(Lclient!yp;I)V")
	static void method29242(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2002383127);
		Class330.method27768(local16, arg0, -1024384318);
	}

	@OriginalMember(owner = "client!nq", name = "aee", descriptor = "(Lclient!yp;I)V")
	static void method29243(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class325.anIntArray400[local12 & 0xFFFF];
	}

	@OriginalMember(owner = "client!nq", name = "s", descriptor = "(I)Lclient!aan;")
	static Class15 method29244(@OriginalArg(0) int arg0) {
		@Pc(8) Class15 local8;
		if (!Class630.aBoolean957) {
			local8 = Class375.aClass15_9;
		} else if (Class80_Sub31.aClass104_11 == null || Class553.aClass15_11 == null) {
			local8 = Class375.aClass15_9;
		} else {
			local8 = Class553.aClass15_11;
		}
		Class630.anInt5547 = local8.anInt46 * -1955484465 + local8.anInt45 * 650663525;
		return local8;
	}

	@OriginalMember(owner = "client!nq", name = "lw", descriptor = "(Lclient!yp;I)V")
	static void method29245(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2046155148);
		Class441.method29189(local16, arg0, 32768);
	}

	@OriginalMember(owner = "client!nq", name = "ew", descriptor = "(Lclient!yp;I)V")
	static void method29246(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2038735930);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class348.method27988(local16, local22, arg0, (byte) 64);
	}

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!pf;)V")
	public Class445(@OriginalArg(0) Class480 arg0) {
		this.aClass480_114 = arg0;
	}

	@OriginalMember(owner = "client!nq", name = "t", descriptor = "(IB)Lclient!ne;")
	@Override
	public Class435 method29234(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(6) Class435 local6 = (Class435) this.aClass243_83.method26282((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(18) byte[] local18 = this.aClass480_114.method29918(0, arg0, 1896589581);
		local6 = new Class435();
		if (local18 != null) {
			local6.method29117(new Packet(local18), arg0, -388330769);
		}
		this.aClass243_83.method26253(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "(I)Lclient!ne;")
	@Override
	public Class435 method29235(@OriginalArg(0) int arg0) {
		@Pc(6) Class435 local6 = (Class435) this.aClass243_83.method26282((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(18) byte[] local18 = this.aClass480_114.method29918(0, arg0, 1896589581);
		local6 = new Class435();
		if (local18 != null) {
			local6.method29117(new Packet(local18), arg0, -388330769);
		}
		this.aClass243_83.method26253(local6, (long) arg0);
		return local6;
	}
}
