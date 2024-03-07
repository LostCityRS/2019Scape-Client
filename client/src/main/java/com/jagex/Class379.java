package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public class Class379 implements Interface12 {

	@OriginalMember(owner = "client!kh", name = "z", descriptor = "[I")
	static int[] anIntArray433 = new int[32];

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
	int anInt4619;

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "Lclient!ec;")
	public Class108 aClass108_1;

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
	int anInt4621;

	@OriginalMember(owner = "client!kh", name = "w", descriptor = "Ljava/lang/String;")
	String aString195;

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "Lclient!qe;")
	Class138 aClass138_73;

	@OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
	int anInt4620 = -1639192877;

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
	public int anInt4622;

	@OriginalMember(owner = "client!kh", name = "n", descriptor = "Lclient!ka;")
	Class127 aClass127_1;

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(FLclient!ox;Lclient!ox;Lclient!ox;Lclient!ox;Lclient!ox;FFFFI)V", line = 12)
	public static void method28080(@OriginalArg(0) float arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class472 arg2, @OriginalArg(3) Class472 arg3, @OriginalArg(4) Class472 arg4, @OriginalArg(5) Class472 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) int arg10) {
		if (arg2.method29558(arg1)) {
			return;
		}
		@Pc(8) Class472 local8 = Class472.method29579(arg2, arg1);
		@Pc(11) float local11 = local8.method29593();
		if (arg6 > 0.0F) {
			arg4 = Class472.method29537(arg4);
			arg4.method29604(local11 / arg6 * arg7);
		}
		if (Float.POSITIVE_INFINITY == arg4.aFloat317 || Float.isNaN(arg1.aFloat317) || local11 > arg8) {
			arg1.method29550(arg2);
			arg3.method29553();
			return;
		}
		@Pc(47) Class472 local47 = Class472.method29537(arg3);
		local47.method29595();
		@Pc(53) Class472 local53 = Class472.method29611(local47, arg4);
		@Pc(57) Class472 local57 = Class472.method29601(local47, local53);
		local57.method29604(0.5F);
		@Pc(63) Class472 local63 = Class472.method29537(arg3);
		@Pc(66) Class472 local66 = Class472.method29537(local8);
		local66.method29595();
		if (local57.aFloat317 > local66.aFloat317) {
			if (local8.aFloat317 < 0.0F) {
				local63.aFloat317 += arg4.aFloat317 * arg0;
				if (local63.aFloat317 > 0.0F) {
					local63.aFloat317 = 0.0F;
				}
			} else {
				local63.aFloat317 -= arg4.aFloat317 * arg0;
				if (local63.aFloat317 < 0.0F) {
					local63.aFloat317 = 0.0F;
				}
			}
		} else if (local47.aFloat317 < arg5.aFloat317) {
			if (local8.aFloat317 < 0.0F) {
				local63.aFloat317 -= arg4.aFloat317 * arg0;
				if (local63.aFloat317 < -arg5.aFloat317) {
					local63.aFloat317 = -arg5.aFloat317;
				}
			} else {
				local63.aFloat317 += arg4.aFloat317 * arg0;
				if (local63.aFloat317 > arg5.aFloat317) {
					local63.aFloat317 = arg5.aFloat317;
				}
			}
		}
		if (local57.aFloat318 > local66.aFloat318) {
			if (local8.aFloat318 < 0.0F) {
				local63.aFloat318 += arg0 * arg4.aFloat318;
				if (local63.aFloat318 > 0.0F) {
					local63.aFloat318 = 0.0F;
				}
			} else {
				local63.aFloat318 -= arg4.aFloat318 * arg0;
				if (local63.aFloat318 < 0.0F) {
					local63.aFloat318 = 0.0F;
				}
			}
		} else if (local47.aFloat318 < arg5.aFloat318) {
			if (local8.aFloat318 < 0.0F) {
				local63.aFloat318 -= arg0 * arg4.aFloat318;
				if (local63.aFloat318 < -arg5.aFloat318) {
					local63.aFloat318 = -arg5.aFloat318;
				}
			} else {
				local63.aFloat318 += arg4.aFloat318 * arg0;
				if (local63.aFloat318 > arg5.aFloat318) {
					local63.aFloat318 = arg5.aFloat318;
				}
			}
		}
		if (local57.aFloat319 > local66.aFloat319) {
			if (local8.aFloat319 < 0.0F) {
				local63.aFloat319 += arg4.aFloat319 * arg0;
				if (local63.aFloat319 > 0.0F) {
					local63.aFloat319 = 0.0F;
				}
			} else {
				local63.aFloat319 -= arg4.aFloat319 * arg0;
				if (local63.aFloat319 < 0.0F) {
					local63.aFloat319 = 0.0F;
				}
			}
		} else if (local47.aFloat319 < arg5.aFloat319) {
			if (local8.aFloat319 < 0.0F) {
				local63.aFloat319 -= arg0 * arg4.aFloat319;
				if (local63.aFloat319 < -arg5.aFloat319) {
					local63.aFloat319 = -arg5.aFloat319;
				}
			} else {
				local63.aFloat319 += arg4.aFloat319 * arg0;
				if (local63.aFloat319 > arg5.aFloat319) {
					local63.aFloat319 = arg5.aFloat319;
				}
			}
		}
		arg3.method29634(local63, 0.8F);
		if (local11 < arg9 && arg3.method29593() < arg9) {
			arg1.method29550(arg2);
			arg3.method29553();
		} else {
			arg1.method29567(Class472.method29619(arg3, arg0));
		}
		local47.method29544();
		local63.method29544();
		local66.method29544();
	}

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray433[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)[Lclient!nk;", line = 22)
	public static Class440[] method28081(@OriginalArg(0) int arg0) {
		return new Class440[] { Class440.aClass440_8, Class440.aClass440_2, Class440.aClass440_1, Class440.aClass440_4, Class440.aClass440_5, Class440.aClass440_14, Class440.aClass440_7, Class440.aClass440_3, Class440.aClass440_9, Class440.aClass440_6, Class440.aClass440_11, Class440.aClass440_12, Class440.aClass440_13, Class440.aClass440_10, Class440.aClass440_15 };
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(ILclient!ka;)V", line = 30)
	Class379(@OriginalArg(0) int arg0, @OriginalArg(1) Class127 arg1) {
		this.anInt4622 = arg0 * 1459595497;
		this.aClass127_1 = arg1;
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(Lclient!alw;B)V", line = 36)
	@Override
	public void method36654(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		this.method28085(arg0, false, -493230055);
	}

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "(Lclient!alw;)V", line = 36)
	@Override
	public void method36655(@OriginalArg(0) Packet arg0) {
		this.method28085(arg0, false, -493230055);
	}

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(Lclient!alw;)V", line = 36)
	@Override
	public void method36657(@OriginalArg(0) Packet arg0) {
		this.method28085(arg0, false, -493230055);
	}

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "(Lclient!alw;)V", line = 36)
	@Override
	public void method36656(@OriginalArg(0) Packet arg0) {
		this.method28085(arg0, false, -493230055);
	}

	@OriginalMember(owner = "client!kh", name = "w", descriptor = "(Lclient!alw;)V", line = 36)
	@Override
	public void method36658(@OriginalArg(0) Packet arg0) {
		this.method28085(arg0, false, -493230055);
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(Lclient!alw;Z)V", line = 41)
	void method28082(@OriginalArg(0) Packet arg0, @OriginalArg(1) boolean arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method28087(arg0, local3, arg1, 206574286);
		}
	}

	@OriginalMember(owner = "client!kh", name = "r", descriptor = "(Lclient!alw;Z)V", line = 41)
	void method28083(@OriginalArg(0) Packet arg0, @OriginalArg(1) boolean arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method28087(arg0, local3, arg1, -875383904);
		}
	}

	@OriginalMember(owner = "client!kh", name = "v", descriptor = "(Lclient!alw;Z)V", line = 41)
	void method28084(@OriginalArg(0) Packet arg0, @OriginalArg(1) boolean arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method28087(arg0, local3, arg1, 361725780);
		}
	}

	@OriginalMember(owner = "client!kh", name = "u", descriptor = "(Lclient!alw;ZI)V", line = 41)
	void method28085(@OriginalArg(0) Packet arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method28087(arg0, local3, arg1, 979652591);
		}
	}

	@OriginalMember(owner = "client!kh", name = "n", descriptor = "(I)V", line = 47)
	@Override
	public void method36653(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "()V", line = 47)
	@Override
	public void method36659() {
	}

	@OriginalMember(owner = "client!kh", name = "o", descriptor = "(Lclient!alw;IZ)V", line = 50)
	void method28086(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(6) Class387 local6 = (Class387) Class107.method18116(Class224.method25590(388455393), arg1, -1915563430);
		switch(local6.anInt4650 * 1505518425) {
			case 7:
				this.anInt4619 = arg0.g1((short) 16384) * 633542449;
				this.anInt4621 = arg0.g1((short) 16384) * -942339801;
			case 9:
			default:
				break;
			case 14:
				@Pc(32) int local32 = arg0.g1((short) 16384);
				this.aClass138_73 = (Class138) Class107.method18116(Class138.method11522(910692260), local32, -1915563430);
				if (this.aClass138_73 == null) {
					throw new IllegalStateException("");
				}
				this.anInt4620 = arg0.gSmart2or4null(-1512236357) * 1639192877;
				if (this.aClass127_1 != null) {
					@Pc(66) Interface11 local66 = (Interface11) this.aClass127_1.aMap16.get(this.aClass138_73);
					if (local66 != null) {
						this.aClass108_1 = (Class108) local66.method18261(this.anInt4620 * 1982504613, -353278518);
					} else if (!arg2) {
						throw new IllegalStateException("");
					}
				}
		}
	}

	@OriginalMember(owner = "client!kh", name = "z", descriptor = "(Lclient!alw;IZI)V", line = 50)
	void method28087(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class387 local6 = (Class387) Class107.method18116(Class224.method25590(50615375), arg1, -1915563430);
		switch(local6.anInt4650 * 1505518425) {
			case 7:
				this.anInt4619 = arg0.g1((short) 16384) * 633542449;
				this.anInt4621 = arg0.g1((short) 16384) * -942339801;
			case 9:
			default:
				break;
			case 14:
				@Pc(32) int local32 = arg0.g1((short) 16384);
				this.aClass138_73 = (Class138) Class107.method18116(Class138.method11522(625044942), local32, -1915563430);
				if (this.aClass138_73 == null) {
					throw new IllegalStateException("");
				}
				this.anInt4620 = arg0.gSmart2or4null(-865376851) * 1639192877;
				if (this.aClass127_1 != null) {
					@Pc(66) Interface11 local66 = (Interface11) this.aClass127_1.aMap16.get(this.aClass138_73);
					if (local66 != null) {
						this.aClass108_1 = (Class108) local66.method18261(this.anInt4620 * 1982504613, 1573681872);
					} else if (!arg2) {
						throw new IllegalStateException("");
					}
				}
		}
	}

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "(B)Lclient!ars;", line = 65)
	static Class93_Sub1_Sub11 method28088(@OriginalArg(0) byte arg0) {
		@Pc(4) Class93_Sub1_Sub11 local4 = (Class93_Sub1_Sub11) Class93_Sub1_Sub11.aClass18_11.method256(811901256);
		if (local4 != null) {
			local4.method23969(1717644232);
			local4.method23976((short) 9196);
			return local4;
		}
		do {
			local4 = (Class93_Sub1_Sub11) Class93_Sub1_Sub11.aClass18_12.method256(-962537470);
			if (local4 == null) {
				return null;
			}
			if (local4.method21898((byte) 34) > Class305.method26797(540804487)) {
				return null;
			}
			local4.method23969(134434904);
			local4.method23976((short) 16159);
		} while ((local4.aLong233 * -5980455722457358841L & Long.MIN_VALUE) == 0L);
		return local4;
	}

	@OriginalMember(owner = "client!kh", name = "p", descriptor = "(II)I", line = 83)
	public int method28089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = anIntArray433[this.anInt4621 * -613951849 - this.anInt4619 * -1814502959];
		return arg0 >> this.anInt4619 * -1814502959 & local11;
	}

	@OriginalMember(owner = "client!kh", name = "y", descriptor = "(I)I", line = 83)
	public int method28090(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = anIntArray433[this.anInt4621 * -613951849 - this.anInt4619 * -1814502959];
		return arg0 >> this.anInt4619 * -1814502959 & local11;
	}

	@OriginalMember(owner = "client!kh", name = "s", descriptor = "(I)I", line = 83)
	public int method28091(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = anIntArray433[this.anInt4621 * -613951849 - this.anInt4619 * -1814502959];
		return arg0 >> this.anInt4619 * -1814502959 & local11;
	}

	@OriginalMember(owner = "client!kh", name = "q", descriptor = "(I)I", line = 83)
	public int method28092(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = anIntArray433[this.anInt4621 * -613951849 - this.anInt4619 * -1814502959];
		return arg0 >> this.anInt4619 * -1814502959 & local11;
	}

	@OriginalMember(owner = "client!kh", name = "x", descriptor = "(I)I", line = 83)
	public int method28093(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = anIntArray433[this.anInt4621 * -613951849 - this.anInt4619 * -1814502959];
		return arg0 >> this.anInt4619 * -1814502959 & local11;
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(III)I", line = 88)
	public int method28094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws Exception_Sub7 {
		@Pc(11) int local11 = anIntArray433[this.anInt4621 * -613951849 - this.anInt4619 * -1814502959];
		if (arg1 < 0 || arg1 > local11) {
			throw new Exception_Sub7(this.aString195 == null ? Integer.toString(this.anInt4622 * -15749287) : this.aString195, arg1, local11);
		}
		local11 <<= this.anInt4619 * -1814502959;
		return arg0 & ~local11 | arg1 << this.anInt4619 * -1814502959 & local11;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)I", line = 88)
	public int method28095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		@Pc(11) int local11 = anIntArray433[this.anInt4621 * -613951849 - this.anInt4619 * -1814502959];
		if (arg1 < 0 || arg1 > local11) {
			throw new Exception_Sub7(this.aString195 == null ? Integer.toString(this.anInt4622 * -15749287) : this.aString195, arg1, local11);
		}
		local11 <<= this.anInt4619 * -1814502959;
		return arg0 & ~local11 | arg1 << this.anInt4619 * -1814502959 & local11;
	}

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "(II)I", line = 88)
	public int method28096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		@Pc(11) int local11 = anIntArray433[this.anInt4621 * -613951849 - this.anInt4619 * -1814502959];
		if (arg1 < 0 || arg1 > local11) {
			throw new Exception_Sub7(this.aString195 == null ? Integer.toString(this.anInt4622 * -15749287) : this.aString195, arg1, local11);
		}
		local11 <<= this.anInt4619 * -1814502959;
		return arg0 & ~local11 | arg1 << this.anInt4619 * -1814502959 & local11;
	}

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "(CI)C", line = 95)
	static char method28097(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "(Lclient!dh;Lclient!py;I)V", line = 98)
	public static void method28098(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class105[] local6 = Class203.method24657(arg1, Class393.anInt4655 * -862282487, 0);
		Class707.aClass100Array9 = new Class100[local6.length];
		@Pc(12) int local12;
		for (local12 = 0; local12 < local6.length; local12++) {
			Class707.aClass100Array9[local12] = arg0.method20589(local6[local12], true);
		}
		local6 = Class203.method24657(arg1, Class393.anInt4660 * 1530987473, 0);
		Class393.aClass100Array7 = new Class100[local6.length];
		for (local12 = 0; local12 < local6.length; local12++) {
			Class393.aClass100Array7[local12] = arg0.method20589(local6[local12], true);
		}
		local6 = Class203.method24657(arg1, Class393.anInt4656 * 1048499503, 0);
		Class60.aClass100Array1 = new Class100[local6.length];
		@Pc(68) byte local68 = 25;
		@Pc(70) int local70;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method7172(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class60.aClass100Array1[local70] = arg0.method20589(local6[local70], true);
		}
		local6 = Class203.method24657(arg1, Class81.anInt248 * -49354807, 0);
		Class166_Sub37.aClass100Array5 = new Class100[local6.length];
		for (local70 = 0; local70 < local6.length; local70++) {
			Class166_Sub37.aClass100Array5[local70] = arg0.method20589(local6[local70], true);
		}
		local6 = Class203.method24657(arg1, Class393.anInt4652 * -512546131, 0);
		Class393.aClass100Array6 = new Class100[local6.length];
		local68 = 12;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method7172(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class393.aClass100Array6[local70] = arg0.method20589(local6[local70], true);
		}
		local6 = Class203.method24657(arg1, Class393.anInt4658 * 1492309703, 0);
		Class110_Sub14.aClass100Array4 = new Class100[local6.length];
		local68 = 12;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method7172(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class110_Sub14.aClass100Array4[local70] = arg0.method20589(local6[local70], true);
		}
		Class153.aClass100_18 = arg0.method20589(Class203.method24648(arg1, InputStream_Sub1.anInt2587 * -1113815385, 0), true);
		Class284.aClass100_42 = arg0.method20589(Class203.method24648(arg1, Class393.anInt4659 * -71569053, 0), true);
		local6 = Class203.method24657(arg1, Class93_Sub26_Sub3.anInt2999 * 1185056357, 0);
		Class552.aClass100Array8 = new Class100[local6.length];
		for (local70 = 0; local70 < local6.length; local70++) {
			Class552.aClass100Array8[local70] = arg0.method20589(local6[local70], true);
		}
	}

	@OriginalMember(owner = "client!kh", name = "w", descriptor = "(B)V", line = 159)
	static void method28099(@OriginalArg(0) byte arg0) {
		@Pc(2) Class240 local2 = Class330.aClass240_79;
		synchronized (Class330.aClass240_79) {
			Class330.aClass240_79.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "(I)V", line = 727)
	public static void method28100(@OriginalArg(0) int arg0) {
		Class312.aClass240_74.method25860(1161602830);
		Class312.aClass240_77.method25860(1161602830);
		Class312.aClass240_75.method25860(1161602830);
		Class312.aClass240_76.method25860(1161602830);
	}

	@OriginalMember(owner = "client!kh", name = "ao", descriptor = "(Lclient!dh;I)V", line = 1119)
	static void method28101(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (Class454.aBoolean774) {
			Class93_Sub1.method23977(arg0, -1138258603);
		} else {
			Class372.method28016(arg0, -1470452289);
		}
	}

	@OriginalMember(owner = "client!kh", name = "ke", descriptor = "(Lclient!yf;I)V", line = 6749)
	static final void method28102(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1537493195);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class420.method28741(local16, local22, arg0, (byte) -127);
	}

	@OriginalMember(owner = "client!kh", name = "nw", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V", line = 7399)
	static final void method28103(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (Class532.method30597(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		Class499.method30149(local13, arg2, -1049422236);
	}

	@OriginalMember(owner = "client!kh", name = "rx", descriptor = "(Lclient!yf;I)V", line = 8088)
	static final void method28104(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1528285061);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class375.method28042(local16, local22, arg0, (byte) 27);
	}

	@OriginalMember(owner = "client!kh", name = "tq", descriptor = "(Lclient!yf;B)V", line = 8527)
	static final void method28105(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1626527135);
		Class93_Sub3.method11814(local16, arg0, 182683471);
	}

	@OriginalMember(owner = "client!kh", name = "xr", descriptor = "(Lclient!yf;I)V", line = 9188)
	static final void method28106(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aBoolean620 ? 1 : 0;
	}

	@OriginalMember(owner = "client!kh", name = "acw", descriptor = "(Lclient!yf;B)V", line = 9998)
	static final void method28107(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = arg0.aClass386_3.aByte154;
	}
}
