package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class562 {

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "I")
	static final int anInt5509 = 512;

	@OriginalMember(owner = "client!sv", name = "rj", descriptor = "I")
	static int anInt5513;

	@OriginalMember(owner = "client!sv", name = "m", descriptor = "I")
	int anInt5501;

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "I")
	int anInt5502;

	@OriginalMember(owner = "client!sv", name = "i", descriptor = "Lclient!sv;")
	Class562 aClass562_1;

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "Lclient!cm;")
	Class100 aClass100_46;

	@OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
	int anInt5507;

	@OriginalMember(owner = "client!sv", name = "o", descriptor = "I")
	int anInt5508;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "[B")
	byte[] aByteArray100;

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "Z")
	boolean aBoolean820;

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "Lclient!do;")
	Class109 aClass109_7;

	@OriginalMember(owner = "client!sv", name = "j", descriptor = "I")
	int anInt5510;

	@OriginalMember(owner = "client!sv", name = "t", descriptor = "I")
	int anInt5511;

	@OriginalMember(owner = "client!sv", name = "ae", descriptor = "I")
	int anInt5512;

	@OriginalMember(owner = "client!sv", name = "u", descriptor = "I")
	int anInt5499 = -2080735533;

	@OriginalMember(owner = "client!sv", name = "s", descriptor = "Z")
	boolean aBoolean819 = true;

	@OriginalMember(owner = "client!sv", name = "z", descriptor = "I")
	final int anInt5503;

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "I")
	final int anInt5504;

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "I")
	final int anInt5505;

	@OriginalMember(owner = "client!sv", name = "n", descriptor = "I")
	final int anInt5500;

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "[Lclient!sw;")
	Class563[] aClass563Array2;

	@OriginalMember(owner = "client!sv", name = "r", descriptor = "Lclient!uw;")
	Class604 aClass604_1;

	@OriginalMember(owner = "client!sv", name = "w", descriptor = "[Lclient!sw;")
	Class563[] aClass563Array1;

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "Lclient!sw;")
	Class563 aClass563_1;

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "I")
	int anInt5506;

	@OriginalMember(owner = "client!sv", name = "v", descriptor = "(Lclient!py;Lclient!df;Lclient!es;)V")
	public static void method31346(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class225 arg1, @OriginalArg(2) Interface24 arg2) {
		Class280.aClass497_100 = arg0;
		Class388.aClass225_7 = arg1;
		Class319.anInterface24_8 = arg2;
	}

	@OriginalMember(owner = "client!sv", name = "o", descriptor = "()V")
	public static void method31347() {
		Class563.method31376();
	}

	@OriginalMember(owner = "client!sv", name = "s", descriptor = "()V")
	public static void method31348() {
		Class563.method31376();
	}

	@OriginalMember(owner = "client!sv", name = "y", descriptor = "()V")
	public static void method31368() {
		Class563.method31376();
	}

	@OriginalMember(owner = "client!sv", name = "ck", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V")
	static void method31369(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		arg0.anInt3992 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091] * -1059281523;
		Class354.method27789(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!sv", name = "aif", descriptor = "(Lclient!yf;B)V")
	static void method31370(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(17) Class93_Sub1_Sub18 local17 = Class372.aClass58_2.method1097(local12, -737304293);
		if (local17.anIntArray266 == null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local17.anIntArray266.length;
		}
	}

	@OriginalMember(owner = "client!sv", name = "aji", descriptor = "(Lclient!yf;S)V")
	static void method31371(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		throw new RuntimeException("");
	}

	@OriginalMember(owner = "client!sv", name = "akb", descriptor = "(Lclient!yf;I)V")
	static void method31372(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		if (Class159_Sub1.aClass16_15 == null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			@Pc(20) Class93 local20 = Class159_Sub1.aClass16_15.method215((long) local12);
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local20 == null ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!sv", name = "acd", descriptor = "(Lclient!yf;B)V")
	static void method31373(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class557.aClass297_1.method26764(-1639881512) ? 1 : 0;
	}

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(I[Lclient!sw;IIIILclient!uw;I)V")
	public Class562(@OriginalArg(0) int arg0, @OriginalArg(1) Class563[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class604 arg6, @OriginalArg(7) int arg7) {
		this.anInt5503 = arg3 * -297793145;
		this.anInt5504 = arg4 * 1540142085;
		this.anInt5505 = arg5 * 696803317;
		this.anInt5500 = arg0 * -1427522121;
		this.aClass563Array2 = arg1;
		this.aClass604_1 = arg6;
		if (arg1 == null) {
			this.aClass563Array1 = null;
			this.aClass563_1 = null;
		} else {
			this.aClass563Array1 = new Class563[arg1.length];
			this.aClass563_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
		this.anInt5506 = arg7 * 718916829;
	}

	@OriginalMember(owner = "client!sv", name = "am", descriptor = "(Lclient!dh;IIII)V")
	void method31334(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class470 local2 = arg0.method20529();
		@Pc(6) Class470 local6 = new Class470();
		local6.method29566(0.0F, 0.0F, 0.0F);
		local6.method29560(0.0F, -1.0F, 0.0F, Class464.method29463(-arg2 & 0x3FFF));
		local6.method29560(-1.0F, 0.0F, 0.0F, Class464.method29463(-arg1 & 0x3FFF));
		local6.method29560(0.0F, 0.0F, -1.0F, Class464.method29463(-arg3 & 0x3FFF));
		arg0.method20528(local6);
		@Pc(48) Class470 local48 = new Class470();
		if (this.anInt5511 * 775061697 != arg4) {
			this.aClass109_7.method6881((byte) arg4, this.aByteArray100);
			this.anInt5511 = arg4 * -1239281855;
		}
		this.aClass109_7.method6947(local48, null, 0);
		arg0.method20528(local2);
	}

	@OriginalMember(owner = "client!sv", name = "z", descriptor = "(Lclient!dh;I)V")
	void method31335(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(7) boolean local7 = Class280.aClass497_100.method30273(this.anInt5506 * -1118213259, 1404366259);
			if (local7) {
				arg0.method20534(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				@Pc(25) Class231 local25 = Class231.method25748(Class280.aClass497_100, this.anInt5506 * -1118213259, 0);
				this.aClass109_7 = arg0.method20522(local25, 1099776, 0, 255, 1);
				@Pc(38) byte[] local38 = this.aClass109_7.method6875();
				if (local38 == null) {
					this.aByteArray100 = null;
				} else {
					this.aByteArray100 = new byte[local38.length];
					System.arraycopy(local38, 0, this.aByteArray100, 0, local38.length);
				}
			}
		} catch (@Pc(59) Exception local59) {
		}
	}

	@OriginalMember(owner = "client!sv", name = "ac", descriptor = "(Lclient!dh;IIIIIIIIIZZ)V")
	public void method31336(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) boolean arg11) {
		@Pc(1) int local1 = 0;
		if (this.aBoolean820) {
			local1 = this.anInt5510 * -1292446037;
		}
		if (this.aClass562_1 == null) {
			if (this.anInt5500 * 138588167 == -1) {
				arg0.method20665(arg2, arg3, arg4, arg5, arg9 | 0xFF000000, 0);
			}
			this.method31344(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, local1, -45831260);
			return;
		}
		@Pc(15) Class562 local15 = this;
		@Pc(18) Class562 local18 = this.aClass562_1;
		if (this.hashCode() > local18.hashCode()) {
			local15 = this.aClass562_1;
			local18 = this;
			local1 = 255 - local1;
		}
		local15.method31344(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, local1, -1668040909);
		local18.method31344(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, arg11, 255 - local1, 767712563);
	}

	@OriginalMember(owner = "client!sv", name = "ag", descriptor = "(Lclient!dh;)V")
	void method31337(@OriginalArg(0) Class104 arg0) {
		try {
			@Pc(7) boolean local7 = Class280.aClass497_100.method30273(this.anInt5506 * -1118213259, -310545360);
			if (local7) {
				arg0.method20534(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				@Pc(25) Class231 local25 = Class231.method25748(Class280.aClass497_100, this.anInt5506 * -1118213259, 0);
				this.aClass109_7 = arg0.method20522(local25, 1099776, 0, 255, 1);
				@Pc(38) byte[] local38 = this.aClass109_7.method6875();
				if (local38 == null) {
					this.aByteArray100 = null;
				} else {
					this.aByteArray100 = new byte[local38.length];
					System.arraycopy(local38, 0, this.aByteArray100, 0, local38.length);
				}
			}
		} catch (@Pc(59) Exception local59) {
		}
	}

	@OriginalMember(owner = "client!sv", name = "m", descriptor = "(III)V")
	public void method31338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean820) {
		}
		this.anInt5510 = ((arg1 - this.anInt5512 * 1477186659) * arg0 / 255 + this.anInt5512 * 1477186659) * 562197507;
	}

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "(I)Lclient!sv;")
	public Class562 method31339(@OriginalArg(0) int arg0) {
		return this.aClass562_1;
	}

	@OriginalMember(owner = "client!sv", name = "ah", descriptor = "(Lclient!dh;IIIIIIIII)V")
	public void method31340(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.method31343(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, 0, arg9, true, false, -2137165835);
	}

	@OriginalMember(owner = "client!sv", name = "u", descriptor = "(Lclient!dh;III)Z")
	public boolean method31341(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 != this.anInt5499 * 1512928933) {
			this.anInt5499 = arg1 * 2080735533;
			@Pc(14) int local14 = Class278.method26458(arg1, 423254006);
			if (local14 > 512) {
				local14 = 512;
			}
			if (local14 <= 0) {
				local14 = 1;
			}
			if (local14 != this.anInt5501 * -773000899) {
				this.anInt5501 = local14 * 101215765;
				this.aClass100_46 = null;
			}
			if (this.aClass563Array2 != null) {
				this.anInt5502 = 0;
				@Pc(49) int[] local49 = new int[this.aClass563Array2.length];
				for (@Pc(51) int local51 = 0; local51 < this.aClass563Array2.length; local51++) {
					@Pc(61) Class563 local61 = this.aClass563Array2[local51];
					if (local61.method31395(this.anInt5503 * -331387849, this.anInt5504 * -366741299, this.anInt5505 * 777917533, this.anInt5499 * 1512928933)) {
						local49[this.anInt5502 * -1069112057] = local61.anInt5526;
						this.aClass563Array1[(this.anInt5502 += 1413855415) * -1069112057 - 1] = local61;
					}
				}
				Class350.method27727(local49, this.aClass563Array1, 0, this.anInt5502 * -1069112057 - 1, 1597934566);
			}
			this.aBoolean819 = true;
		}
		@Pc(122) boolean local122 = false;
		if (this.aBoolean819) {
			this.aBoolean819 = false;
			for (@Pc(135) int local135 = this.anInt5502 * -1069112057 - 1; local135 >= 0; local135--) {
				@Pc(146) boolean local146 = this.aClass563Array1[local135].method31377(arg0, this.aClass563_1);
				this.aBoolean819 |= !local146;
				local122 |= local146;
			}
		}
		if (arg2 == 0 || !arg0.method20438()) {
			this.aClass109_7 = null;
		} else if (this.aClass109_7 == null && this.anInt5506 * -1118213259 >= 0) {
			this.method31335(arg0, -2106744281);
		}
		if (this.aClass562_1 != null && this.aClass562_1 != this) {
			this.aClass562_1.method31355(2116530090);
			local122 |= this.aClass562_1.method31341(arg0, arg1, arg2, 1974574634);
		}
		return local122;
	}

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "(Lclient!dh;IIIIIIIIII)V")
	public void method31342(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.method31343(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, 0, arg9, true, false, -2056367908);
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "(Lclient!dh;IIIIIIIIIZZI)V")
	public void method31343(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) int arg12) {
		@Pc(1) int local1 = 0;
		if (this.aBoolean820) {
			local1 = this.anInt5510 * -1292446037;
		}
		if (this.aClass562_1 == null) {
			if (this.anInt5500 * 138588167 == -1) {
				arg0.method20665(arg2, arg3, arg4, arg5, arg9 | 0xFF000000, 0);
			}
			this.method31344(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, local1, -766352119);
			return;
		}
		@Pc(15) Class562 local15 = this;
		@Pc(18) Class562 local18 = this.aClass562_1;
		if (this.hashCode() > local18.hashCode()) {
			local15 = this.aClass562_1;
			local18 = this;
			local1 = 255 - local1;
		}
		local15.method31344(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, local1, -1090467293);
		local18.method31344(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, arg11, 255 - local1, -1735144959);
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(Lclient!dh;IIIIIIIIIZZII)V")
	void method31344(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		@Pc(3) int local3 = 255 - arg12;
		arg0.method20513();
		arg0.method20514();
		if (this.aClass109_7 == null) {
			arg0.method20786(2, 0);
			arg7 = arg1 + arg7 & 0x3FFF;
			if (this.anInt5500 * 138588167 == -1 || this.anInt5501 * -773000899 == 0) {
				arg0.method20665(arg2, arg3, arg4, arg5, local3 << 24 | arg9, arg10 ? 0 : 1);
			} else {
				@Pc(40) Class235 local40 = Class388.aClass225_7.method25690(this.anInt5500 * 138588167, -371240932);
				if (this.aClass100_46 == null && Class319.anInterface24_8.method6765(Class616.aClass616_2, local40.anInt3829 * -1747960127, -1, Class618.aClass618_3 == local40.aClass618_2 ? Class609.aClass609_2 : Class609.aClass609_1, 0.7F, this.anInt5501 * -773000899, this.anInt5501 * -773000899, false, -1630596103)) {
					@Pc(112) int[] local112 = local40.aClass618_2 == Class618.aClass618_3 ? Class319.anInterface24_8.method6780(Class616.aClass616_2, local40.anInt3829 * -1747960127, 0.7F, this.anInt5501 * -773000899, this.anInt5501 * -773000899, false, (byte) -49) : Class319.anInterface24_8.method6764(Class616.aClass616_2, local40.anInt3829 * -1747960127, 0.7F, this.anInt5501 * -773000899, this.anInt5501 * -773000899, false, -183044511);
					this.anInt5507 = local112[0] * 947814753;
					this.anInt5508 = local112[local112.length - 1] * 693908015;
					this.aClass100_46 = arg0.method20510(local112, 0, local40.anInt3847 * -923926085, local40.anInt3847 * -923926085, local40.anInt3847 * -923926085, 438797212);
				}
				@Pc(161) int local161 = local3 == 255 ? (Class618.aClass618_3 == local40.aClass618_2 ? 1 : 0) : 1;
				if (local161 == 1 && arg10) {
					arg0.method20665(arg2, arg3, arg4, arg5, arg9, 0);
				}
				if (this.aClass100_46 != null) {
					@Pc(183) int local183 = arg5 * arg6 / -4096;
					@Pc(195) int local195;
					for (local195 = arg7 * arg5 / 4096 + (arg4 - arg5) / 2; local195 > arg5; local195 -= arg5) {
					}
					while (local195 < 0) {
						local195 += arg5;
					}
					@Pc(218) int local218;
					if (this.aClass604_1 == Class604.aClass604_3) {
						for (local218 = local195 - arg5; local218 < arg4; local218 += arg5) {
							this.aClass100_46.method18188(arg2 + local218, arg3 + local183, arg5, arg5, 0, local3 << 24 | 0xFFFFFF, local161);
						}
						if ((this.anInt5507 * 2144985761 & 0xFF000000) != 0) {
							arg0.method20612(0, 0, arg4, arg3 + local183 + 1, this.anInt5507 * 2144985761, (byte) 15);
						}
						if ((this.anInt5508 * -1094429489 & 0xFF000000) != 0) {
							arg0.method20612(0, local183 + arg3 + arg5, arg4, arg5 - (arg5 + local183 + arg3), this.anInt5508 * -1094429489, (byte) 46);
						}
					} else {
						while (local183 > arg5) {
							local183 -= arg5;
						}
						while (local183 < 0) {
							local183 += arg5;
						}
						for (local218 = local195 - arg5; local218 < arg4; local218 += arg5) {
							for (@Pc(321) int local321 = local183 - arg5; local321 < arg5; local321 += arg5) {
								this.aClass100_46.method18188(arg2 + local218, local321 + arg3, arg5, arg5, 0, local3 << 24 | 0xFFFFFF, local161);
							}
						}
					}
				}
			}
		} else if (arg11) {
			@Pc(375) Class489 local375 = arg0.method20666();
			@Pc(378) Class489 local378 = arg0.method20666();
			local375.aFloatArray116[2] = local375.aFloatArray116[3];
			local375.aFloatArray116[6] = local375.aFloatArray116[7];
			local375.aFloatArray116[10] = local375.aFloatArray116[11];
			local375.aFloatArray116[14] = local375.aFloatArray116[15];
			arg0.method20531(local375);
			this.method31345(arg0, arg6, arg7, arg8, arg12, 755766171);
			arg0.method20531(local378);
		} else {
			if (arg10) {
				arg0.method20786(3, arg9);
			}
			this.method31345(arg0, arg6, arg7, arg8, arg12, 802733869);
		}
		for (@Pc(446) int local446 = this.anInt5502 * -1069112057 - 1; local446 >= 0; local446--) {
			this.aClass563Array1[local446].method31378(arg0, arg2, arg3, arg4, arg5, arg6, arg7, this.anInt5503 * -331387849, this.anInt5504 * -366741299, this.anInt5505 * 777917533, local3);
		}
		arg0.method20786(2, 0);
		arg0.method20515();
	}

	@OriginalMember(owner = "client!sv", name = "r", descriptor = "(Lclient!dh;IIIII)V")
	void method31345(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) Class470 local2 = arg0.method20529();
		@Pc(6) Class470 local6 = new Class470();
		local6.method29566(0.0F, 0.0F, 0.0F);
		local6.method29560(0.0F, -1.0F, 0.0F, Class464.method29463(-arg2 & 0x3FFF));
		local6.method29560(-1.0F, 0.0F, 0.0F, Class464.method29463(-arg1 & 0x3FFF));
		local6.method29560(0.0F, 0.0F, -1.0F, Class464.method29463(-arg3 & 0x3FFF));
		arg0.method20528(local6);
		@Pc(48) Class470 local48 = new Class470();
		if (this.anInt5511 * 775061697 != arg4) {
			this.aClass109_7.method6881((byte) arg4, this.aByteArray100);
			this.anInt5511 = arg4 * -1239281855;
		}
		this.aClass109_7.method6947(local48, null, 0);
		arg0.method20528(local2);
	}

	@OriginalMember(owner = "client!sv", name = "q", descriptor = "(II)V")
	public void method31349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean820) {
		}
		this.anInt5510 = ((arg1 - this.anInt5512 * 1477186659) * arg0 / 255 + this.anInt5512 * 1477186659) * 562197507;
	}

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "()Z")
	public boolean method31350() {
		return this.aBoolean820;
	}

	@OriginalMember(owner = "client!sv", name = "x", descriptor = "(Lclient!sv;)V")
	public void method31351(@OriginalArg(0) Class562 arg0) {
		if (this.aBoolean820) {
			this.anInt5512 = this.anInt5510 * 1474073369;
		} else if (arg0 != null && arg0.aBoolean820) {
			this.anInt5512 = 152976821 - arg0.anInt5510 * 1474073369;
		} else {
			this.anInt5512 = 0;
		}
		this.aBoolean820 = true;
		this.aClass562_1 = arg0;
		this.anInt5510 = 0;
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(Lclient!sv;)V")
	public void method31352(@OriginalArg(0) Class562 arg0) {
		if (this.aBoolean820) {
			this.anInt5512 = this.anInt5510 * 1474073369;
		} else if (arg0 != null && arg0.aBoolean820) {
			this.anInt5512 = 152976821 - arg0.anInt5510 * 1474073369;
		} else {
			this.anInt5512 = 0;
		}
		this.aBoolean820 = true;
		this.aClass562_1 = arg0;
		this.anInt5510 = 0;
	}

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "()V")
	public void method31353() {
		this.aBoolean820 = false;
		this.aClass562_1 = null;
		this.anInt5510 = 0;
	}

	@OriginalMember(owner = "client!sv", name = "i", descriptor = "()Z")
	public boolean method31354() {
		return this.aBoolean820;
	}

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "(I)V")
	public void method31355(@OriginalArg(0) int arg0) {
		this.aBoolean820 = false;
		this.aClass562_1 = null;
		this.anInt5510 = 0;
	}

	@OriginalMember(owner = "client!sv", name = "j", descriptor = "()Z")
	public boolean method31356() {
		return this.aBoolean820;
	}

	@OriginalMember(owner = "client!sv", name = "w", descriptor = "(B)Z")
	public boolean method31357(@OriginalArg(0) byte arg0) {
		return this.aBoolean820;
	}

	@OriginalMember(owner = "client!sv", name = "ae", descriptor = "(Lclient!dh;II)Z")
	public boolean method31358(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 != this.anInt5499 * 1512928933) {
			this.anInt5499 = arg1 * 2080735533;
			@Pc(14) int local14 = Class278.method26458(arg1, 423254006);
			if (local14 > 512) {
				local14 = 512;
			}
			if (local14 <= 0) {
				local14 = 1;
			}
			if (local14 != this.anInt5501 * -773000899) {
				this.anInt5501 = local14 * 101215765;
				this.aClass100_46 = null;
			}
			if (this.aClass563Array2 != null) {
				this.anInt5502 = 0;
				@Pc(49) int[] local49 = new int[this.aClass563Array2.length];
				for (@Pc(51) int local51 = 0; local51 < this.aClass563Array2.length; local51++) {
					@Pc(61) Class563 local61 = this.aClass563Array2[local51];
					if (local61.method31395(this.anInt5503 * -331387849, this.anInt5504 * -366741299, this.anInt5505 * 777917533, this.anInt5499 * 1512928933)) {
						local49[this.anInt5502 * -1069112057] = local61.anInt5526;
						this.aClass563Array1[(this.anInt5502 += 1413855415) * -1069112057 - 1] = local61;
					}
				}
				Class350.method27727(local49, this.aClass563Array1, 0, this.anInt5502 * -1069112057 - 1, 1596871668);
			}
			this.aBoolean819 = true;
		}
		@Pc(122) boolean local122 = false;
		if (this.aBoolean819) {
			this.aBoolean819 = false;
			for (@Pc(135) int local135 = this.anInt5502 * -1069112057 - 1; local135 >= 0; local135--) {
				@Pc(146) boolean local146 = this.aClass563Array1[local135].method31377(arg0, this.aClass563_1);
				this.aBoolean819 |= !local146;
				local122 |= local146;
			}
		}
		if (arg2 == 0 || !arg0.method20438()) {
			this.aClass109_7 = null;
		} else if (this.aClass109_7 == null && this.anInt5506 * -1118213259 >= 0) {
			this.method31335(arg0, -2042885960);
		}
		if (this.aClass562_1 != null && this.aClass562_1 != this) {
			this.aClass562_1.method31355(1164072402);
			local122 |= this.aClass562_1.method31341(arg0, arg1, arg2, 129379937);
		}
		return local122;
	}

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "(Lclient!sv;I)V")
	public void method31359(@OriginalArg(0) Class562 arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean820) {
			this.anInt5512 = this.anInt5510 * 1474073369;
		} else if (arg0 != null && arg0.aBoolean820) {
			this.anInt5512 = 152976821 - arg0.anInt5510 * 1474073369;
		} else {
			this.anInt5512 = 0;
		}
		this.aBoolean820 = true;
		this.aClass562_1 = arg0;
		this.anInt5510 = 0;
	}

	@OriginalMember(owner = "client!sv", name = "aw", descriptor = "(Lclient!dh;IIIIIIIIIZZI)V")
	void method31360(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) int arg12) {
		@Pc(3) int local3 = 255 - arg12;
		arg0.method20513();
		arg0.method20514();
		if (this.aClass109_7 == null) {
			arg0.method20786(2, 0);
			arg7 = arg1 + arg7 & 0x3FFF;
			if (this.anInt5500 * 138588167 == -1 || this.anInt5501 * -773000899 == 0) {
				arg0.method20665(arg2, arg3, arg4, arg5, local3 << 24 | arg9, arg10 ? 0 : 1);
			} else {
				@Pc(40) Class235 local40 = Class388.aClass225_7.method25690(this.anInt5500 * 138588167, -1409801055);
				if (this.aClass100_46 == null && Class319.anInterface24_8.method6765(Class616.aClass616_2, local40.anInt3829 * -1747960127, -1, Class618.aClass618_3 == local40.aClass618_2 ? Class609.aClass609_2 : Class609.aClass609_1, 0.7F, this.anInt5501 * -773000899, this.anInt5501 * -773000899, false, -1630596103)) {
					@Pc(112) int[] local112 = local40.aClass618_2 == Class618.aClass618_3 ? Class319.anInterface24_8.method6780(Class616.aClass616_2, local40.anInt3829 * -1747960127, 0.7F, this.anInt5501 * -773000899, this.anInt5501 * -773000899, false, (byte) -117) : Class319.anInterface24_8.method6764(Class616.aClass616_2, local40.anInt3829 * -1747960127, 0.7F, this.anInt5501 * -773000899, this.anInt5501 * -773000899, false, -1695534783);
					this.anInt5507 = local112[0] * 947814753;
					this.anInt5508 = local112[local112.length - 1] * 693908015;
					this.aClass100_46 = arg0.method20510(local112, 0, local40.anInt3847 * -923926085, local40.anInt3847 * -923926085, local40.anInt3847 * -923926085, 438797212);
				}
				@Pc(161) int local161 = local3 == 255 ? (Class618.aClass618_3 == local40.aClass618_2 ? 1 : 0) : 1;
				if (local161 == 1 && arg10) {
					arg0.method20665(arg2, arg3, arg4, arg5, arg9, 0);
				}
				if (this.aClass100_46 != null) {
					@Pc(183) int local183 = arg5 * arg6 / -4096;
					@Pc(195) int local195;
					for (local195 = arg7 * arg5 / 4096 + (arg4 - arg5) / 2; local195 > arg5; local195 -= arg5) {
					}
					while (local195 < 0) {
						local195 += arg5;
					}
					@Pc(218) int local218;
					if (this.aClass604_1 == Class604.aClass604_3) {
						for (local218 = local195 - arg5; local218 < arg4; local218 += arg5) {
							this.aClass100_46.method18188(arg2 + local218, arg3 + local183, arg5, arg5, 0, local3 << 24 | 0xFFFFFF, local161);
						}
						if ((this.anInt5507 * 2144985761 & 0xFF000000) != 0) {
							arg0.method20612(0, 0, arg4, arg3 + local183 + 1, this.anInt5507 * 2144985761, (byte) 63);
						}
						if ((this.anInt5508 * -1094429489 & 0xFF000000) != 0) {
							arg0.method20612(0, local183 + arg3 + arg5, arg4, arg5 - (arg5 + local183 + arg3), this.anInt5508 * -1094429489, (byte) 110);
						}
					} else {
						while (local183 > arg5) {
							local183 -= arg5;
						}
						while (local183 < 0) {
							local183 += arg5;
						}
						for (local218 = local195 - arg5; local218 < arg4; local218 += arg5) {
							for (@Pc(321) int local321 = local183 - arg5; local321 < arg5; local321 += arg5) {
								this.aClass100_46.method18188(arg2 + local218, local321 + arg3, arg5, arg5, 0, local3 << 24 | 0xFFFFFF, local161);
							}
						}
					}
				}
			}
		} else if (arg11) {
			@Pc(375) Class489 local375 = arg0.method20666();
			@Pc(378) Class489 local378 = arg0.method20666();
			local375.aFloatArray116[2] = local375.aFloatArray116[3];
			local375.aFloatArray116[6] = local375.aFloatArray116[7];
			local375.aFloatArray116[10] = local375.aFloatArray116[11];
			local375.aFloatArray116[14] = local375.aFloatArray116[15];
			arg0.method20531(local375);
			this.method31345(arg0, arg6, arg7, arg8, arg12, 1059574030);
			arg0.method20531(local378);
		} else {
			if (arg10) {
				arg0.method20786(3, arg9);
			}
			this.method31345(arg0, arg6, arg7, arg8, arg12, 1804757812);
		}
		for (@Pc(446) int local446 = this.anInt5502 * -1069112057 - 1; local446 >= 0; local446--) {
			this.aClass563Array1[local446].method31378(arg0, arg2, arg3, arg4, arg5, arg6, arg7, this.anInt5503 * -331387849, this.anInt5504 * -366741299, this.anInt5505 * 777917533, local3);
		}
		arg0.method20786(2, 0);
		arg0.method20515();
	}

	@OriginalMember(owner = "client!sv", name = "al", descriptor = "(Lclient!dh;IIIIIIIIIZZ)V")
	public void method31361(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) boolean arg11) {
		@Pc(1) int local1 = 0;
		if (this.aBoolean820) {
			local1 = this.anInt5510 * -1292446037;
		}
		if (this.aClass562_1 == null) {
			if (this.anInt5500 * 138588167 == -1) {
				arg0.method20665(arg2, arg3, arg4, arg5, arg9 | 0xFF000000, 0);
			}
			this.method31344(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, local1, 2071582048);
			return;
		}
		@Pc(15) Class562 local15 = this;
		@Pc(18) Class562 local18 = this.aClass562_1;
		if (this.hashCode() > local18.hashCode()) {
			local15 = this.aClass562_1;
			local18 = this;
			local1 = 255 - local1;
		}
		local15.method31344(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, local1, -1879839639);
		local18.method31344(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, arg11, 255 - local1, 1087065941);
	}

	@OriginalMember(owner = "client!sv", name = "t", descriptor = "()Lclient!sv;")
	public Class562 method31362() {
		return this.aClass562_1;
	}

	@OriginalMember(owner = "client!sv", name = "ai", descriptor = "(Lclient!dh;IIIIIIIIIZZI)V")
	void method31363(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) int arg12) {
		@Pc(3) int local3 = 255 - arg12;
		arg0.method20513();
		arg0.method20514();
		if (this.aClass109_7 == null) {
			arg0.method20786(2, 0);
			arg7 = arg1 + arg7 & 0x3FFF;
			if (this.anInt5500 * 138588167 == -1 || this.anInt5501 * -773000899 == 0) {
				arg0.method20665(arg2, arg3, arg4, arg5, local3 << 24 | arg9, arg10 ? 0 : 1);
			} else {
				@Pc(40) Class235 local40 = Class388.aClass225_7.method25690(this.anInt5500 * 138588167, -464869256);
				if (this.aClass100_46 == null && Class319.anInterface24_8.method6765(Class616.aClass616_2, local40.anInt3829 * -1747960127, -1, Class618.aClass618_3 == local40.aClass618_2 ? Class609.aClass609_2 : Class609.aClass609_1, 0.7F, this.anInt5501 * -773000899, this.anInt5501 * -773000899, false, -1630596103)) {
					@Pc(112) int[] local112 = local40.aClass618_2 == Class618.aClass618_3 ? Class319.anInterface24_8.method6780(Class616.aClass616_2, local40.anInt3829 * -1747960127, 0.7F, this.anInt5501 * -773000899, this.anInt5501 * -773000899, false, (byte) -14) : Class319.anInterface24_8.method6764(Class616.aClass616_2, local40.anInt3829 * -1747960127, 0.7F, this.anInt5501 * -773000899, this.anInt5501 * -773000899, false, 1218750590);
					this.anInt5507 = local112[0] * 947814753;
					this.anInt5508 = local112[local112.length - 1] * 693908015;
					this.aClass100_46 = arg0.method20510(local112, 0, local40.anInt3847 * -923926085, local40.anInt3847 * -923926085, local40.anInt3847 * -923926085, 438797212);
				}
				@Pc(161) int local161 = local3 == 255 ? (Class618.aClass618_3 == local40.aClass618_2 ? 1 : 0) : 1;
				if (local161 == 1 && arg10) {
					arg0.method20665(arg2, arg3, arg4, arg5, arg9, 0);
				}
				if (this.aClass100_46 != null) {
					@Pc(183) int local183 = arg5 * arg6 / -4096;
					@Pc(195) int local195;
					for (local195 = arg7 * arg5 / 4096 + (arg4 - arg5) / 2; local195 > arg5; local195 -= arg5) {
					}
					while (local195 < 0) {
						local195 += arg5;
					}
					@Pc(218) int local218;
					if (this.aClass604_1 == Class604.aClass604_3) {
						for (local218 = local195 - arg5; local218 < arg4; local218 += arg5) {
							this.aClass100_46.method18188(arg2 + local218, arg3 + local183, arg5, arg5, 0, local3 << 24 | 0xFFFFFF, local161);
						}
						if ((this.anInt5507 * 2144985761 & 0xFF000000) != 0) {
							arg0.method20612(0, 0, arg4, arg3 + local183 + 1, this.anInt5507 * 2144985761, (byte) 77);
						}
						if ((this.anInt5508 * -1094429489 & 0xFF000000) != 0) {
							arg0.method20612(0, local183 + arg3 + arg5, arg4, arg5 - (arg5 + local183 + arg3), this.anInt5508 * -1094429489, (byte) 3);
						}
					} else {
						while (local183 > arg5) {
							local183 -= arg5;
						}
						while (local183 < 0) {
							local183 += arg5;
						}
						for (local218 = local195 - arg5; local218 < arg4; local218 += arg5) {
							for (@Pc(321) int local321 = local183 - arg5; local321 < arg5; local321 += arg5) {
								this.aClass100_46.method18188(arg2 + local218, local321 + arg3, arg5, arg5, 0, local3 << 24 | 0xFFFFFF, local161);
							}
						}
					}
				}
			}
		} else if (arg11) {
			@Pc(375) Class489 local375 = arg0.method20666();
			@Pc(378) Class489 local378 = arg0.method20666();
			local375.aFloatArray116[2] = local375.aFloatArray116[3];
			local375.aFloatArray116[6] = local375.aFloatArray116[7];
			local375.aFloatArray116[10] = local375.aFloatArray116[11];
			local375.aFloatArray116[14] = local375.aFloatArray116[15];
			arg0.method20531(local375);
			this.method31345(arg0, arg6, arg7, arg8, arg12, 1240139022);
			arg0.method20531(local378);
		} else {
			if (arg10) {
				arg0.method20786(3, arg9);
			}
			this.method31345(arg0, arg6, arg7, arg8, arg12, 1508206001);
		}
		for (@Pc(446) int local446 = this.anInt5502 * -1069112057 - 1; local446 >= 0; local446--) {
			this.aClass563Array1[local446].method31378(arg0, arg2, arg3, arg4, arg5, arg6, arg7, this.anInt5503 * -331387849, this.anInt5504 * -366741299, this.anInt5505 * 777917533, local3);
		}
		arg0.method20786(2, 0);
		arg0.method20515();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "()Z")
	public boolean method31364() {
		return this.aBoolean820;
	}

	@OriginalMember(owner = "client!sv", name = "as", descriptor = "(Lclient!dh;IIIIIIIIIZZI)V")
	void method31365(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) int arg12) {
		@Pc(3) int local3 = 255 - arg12;
		arg0.method20513();
		arg0.method20514();
		if (this.aClass109_7 == null) {
			arg0.method20786(2, 0);
			arg7 = arg1 + arg7 & 0x3FFF;
			if (this.anInt5500 * 138588167 == -1 || this.anInt5501 * -773000899 == 0) {
				arg0.method20665(arg2, arg3, arg4, arg5, local3 << 24 | arg9, arg10 ? 0 : 1);
			} else {
				@Pc(40) Class235 local40 = Class388.aClass225_7.method25690(this.anInt5500 * 138588167, -403511438);
				if (this.aClass100_46 == null && Class319.anInterface24_8.method6765(Class616.aClass616_2, local40.anInt3829 * -1747960127, -1, Class618.aClass618_3 == local40.aClass618_2 ? Class609.aClass609_2 : Class609.aClass609_1, 0.7F, this.anInt5501 * -773000899, this.anInt5501 * -773000899, false, -1630596103)) {
					@Pc(112) int[] local112 = local40.aClass618_2 == Class618.aClass618_3 ? Class319.anInterface24_8.method6780(Class616.aClass616_2, local40.anInt3829 * -1747960127, 0.7F, this.anInt5501 * -773000899, this.anInt5501 * -773000899, false, (byte) -92) : Class319.anInterface24_8.method6764(Class616.aClass616_2, local40.anInt3829 * -1747960127, 0.7F, this.anInt5501 * -773000899, this.anInt5501 * -773000899, false, 1573164314);
					this.anInt5507 = local112[0] * 947814753;
					this.anInt5508 = local112[local112.length - 1] * 693908015;
					this.aClass100_46 = arg0.method20510(local112, 0, local40.anInt3847 * -923926085, local40.anInt3847 * -923926085, local40.anInt3847 * -923926085, 438797212);
				}
				@Pc(161) int local161 = local3 == 255 ? (Class618.aClass618_3 == local40.aClass618_2 ? 1 : 0) : 1;
				if (local161 == 1 && arg10) {
					arg0.method20665(arg2, arg3, arg4, arg5, arg9, 0);
				}
				if (this.aClass100_46 != null) {
					@Pc(183) int local183 = arg5 * arg6 / -4096;
					@Pc(195) int local195;
					for (local195 = arg7 * arg5 / 4096 + (arg4 - arg5) / 2; local195 > arg5; local195 -= arg5) {
					}
					while (local195 < 0) {
						local195 += arg5;
					}
					@Pc(218) int local218;
					if (this.aClass604_1 == Class604.aClass604_3) {
						for (local218 = local195 - arg5; local218 < arg4; local218 += arg5) {
							this.aClass100_46.method18188(arg2 + local218, arg3 + local183, arg5, arg5, 0, local3 << 24 | 0xFFFFFF, local161);
						}
						if ((this.anInt5507 * 2144985761 & 0xFF000000) != 0) {
							arg0.method20612(0, 0, arg4, arg3 + local183 + 1, this.anInt5507 * 2144985761, (byte) 18);
						}
						if ((this.anInt5508 * -1094429489 & 0xFF000000) != 0) {
							arg0.method20612(0, local183 + arg3 + arg5, arg4, arg5 - (arg5 + local183 + arg3), this.anInt5508 * -1094429489, (byte) 63);
						}
					} else {
						while (local183 > arg5) {
							local183 -= arg5;
						}
						while (local183 < 0) {
							local183 += arg5;
						}
						for (local218 = local195 - arg5; local218 < arg4; local218 += arg5) {
							for (@Pc(321) int local321 = local183 - arg5; local321 < arg5; local321 += arg5) {
								this.aClass100_46.method18188(arg2 + local218, local321 + arg3, arg5, arg5, 0, local3 << 24 | 0xFFFFFF, local161);
							}
						}
					}
				}
			}
		} else if (arg11) {
			@Pc(375) Class489 local375 = arg0.method20666();
			@Pc(378) Class489 local378 = arg0.method20666();
			local375.aFloatArray116[2] = local375.aFloatArray116[3];
			local375.aFloatArray116[6] = local375.aFloatArray116[7];
			local375.aFloatArray116[10] = local375.aFloatArray116[11];
			local375.aFloatArray116[14] = local375.aFloatArray116[15];
			arg0.method20531(local375);
			this.method31345(arg0, arg6, arg7, arg8, arg12, 1333300451);
			arg0.method20531(local378);
		} else {
			if (arg10) {
				arg0.method20786(3, arg9);
			}
			this.method31345(arg0, arg6, arg7, arg8, arg12, 1999729007);
		}
		for (@Pc(446) int local446 = this.anInt5502 * -1069112057 - 1; local446 >= 0; local446--) {
			this.aClass563Array1[local446].method31378(arg0, arg2, arg3, arg4, arg5, arg6, arg7, this.anInt5503 * -331387849, this.anInt5504 * -366741299, this.anInt5505 * 777917533, local3);
		}
		arg0.method20786(2, 0);
		arg0.method20515();
	}

	@OriginalMember(owner = "client!sv", name = "at", descriptor = "(Lclient!dh;IIII)V")
	void method31366(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class470 local2 = arg0.method20529();
		@Pc(6) Class470 local6 = new Class470();
		local6.method29566(0.0F, 0.0F, 0.0F);
		local6.method29560(0.0F, -1.0F, 0.0F, Class464.method29463(-arg2 & 0x3FFF));
		local6.method29560(-1.0F, 0.0F, 0.0F, Class464.method29463(-arg1 & 0x3FFF));
		local6.method29560(0.0F, 0.0F, -1.0F, Class464.method29463(-arg3 & 0x3FFF));
		arg0.method20528(local6);
		@Pc(48) Class470 local48 = new Class470();
		if (this.anInt5511 * 775061697 != arg4) {
			this.aClass109_7.method6881((byte) arg4, this.aByteArray100);
			this.anInt5511 = arg4 * -1239281855;
		}
		this.aClass109_7.method6947(local48, null, 0);
		arg0.method20528(local2);
	}

	@OriginalMember(owner = "client!sv", name = "ad", descriptor = "(Lclient!dh;IIII)V")
	void method31367(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class470 local2 = arg0.method20529();
		@Pc(6) Class470 local6 = new Class470();
		local6.method29566(0.0F, 0.0F, 0.0F);
		local6.method29560(0.0F, -1.0F, 0.0F, Class464.method29463(-arg2 & 0x3FFF));
		local6.method29560(-1.0F, 0.0F, 0.0F, Class464.method29463(-arg1 & 0x3FFF));
		local6.method29560(0.0F, 0.0F, -1.0F, Class464.method29463(-arg3 & 0x3FFF));
		arg0.method20528(local6);
		@Pc(48) Class470 local48 = new Class470();
		if (this.anInt5511 * 775061697 != arg4) {
			this.aClass109_7.method6881((byte) arg4, this.aByteArray100);
			this.anInt5511 = arg4 * -1239281855;
		}
		this.aClass109_7.method6947(local48, null, 0);
		arg0.method20528(local2);
	}
}
