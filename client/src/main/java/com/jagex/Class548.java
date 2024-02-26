package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class548 {

	@OriginalMember(owner = "client!sf", name = "kv", descriptor = "Lclient!ald;")
	public static Class80_Sub36 aClass80_Sub36_16;

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "Lclient!arx;")
	Class80_Sub1_Sub10 aClass80_Sub1_Sub10_5;

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "Lclient!dn;")
	Class105 aClass105_6;

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "Lclient!aad;")
	Class6 aClass6_8;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
	int anInt5135;

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "[Z")
	boolean[] aBooleanArray31;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "Lclient!xe;")
	Class658 aClass658_7;

	@OriginalMember(owner = "client!sf", name = "z", descriptor = "Lclient!vj;")
	Class614 aClass614_2;

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "Z")
	boolean aBoolean906 = false;

	@OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
	int anInt5134 = -2049218935;

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
	int anInt5131 = 0;

	@OriginalMember(owner = "client!sf", name = "x", descriptor = "Z")
	boolean aBoolean907 = false;

	@OriginalMember(owner = "client!sf", name = "q", descriptor = "Z")
	boolean aBoolean909 = false;

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "Lclient!aod;")
	Class41_Sub3 aClass41_Sub3_10;

	@OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
	int anInt5132;

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
	int anInt5133;

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
	int anInt5130;

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "Lclient!alf;")
	Class120_Sub1 aClass120_Sub1_24;

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "B")
	byte aByte149;

	@OriginalMember(owner = "client!sf", name = "w", descriptor = "Z")
	boolean aBoolean908;

	@OriginalMember(owner = "client!sf", name = "o", descriptor = "Lclient!aad;")
	Class6 aClass6_7;

	@OriginalMember(owner = "client!sf", name = "bbd", descriptor = "(Lclient!yp;I)V")
	static void method31272(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -442943724;
	}

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "(II)I")
	public static int method31273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 >>> 1;
		@Pc(9) int local9 = local3 | local3 >>> 1;
		@Pc(15) int local15 = local9 | local9 >>> 2;
		@Pc(21) int local21 = local15 | local15 >>> 4;
		@Pc(27) int local27 = local21 | local21 >>> 8;
		@Pc(33) int local33 = local27 | local27 >>> 16;
		return arg0 & ~local33;
	}

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!di;Lclient!aod;Lclient!vv;IIILclient!alf;ZII)V")
	Class548(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class41_Sub3 arg1, @OriginalArg(2) Class625 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class120_Sub1 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass41_Sub3_10 = arg1;
		this.anInt5132 = arg2.anInt5499 * 231452109;
		this.anInt5133 = arg3 * 1469050665;
		this.anInt5130 = arg4 * 163322985;
		this.aClass120_Sub1_24 = arg6;
		this.aBoolean907 = arg8 != -1;
		this.aByte149 = (byte) arg5;
		this.aBoolean906 = arg7;
		this.aBoolean908 = arg0.method20667() && arg2.aBoolean951 && !this.aBoolean906;
		this.aClass6_7 = new Class6_Sub1(arg6, false);
		this.method31239(false, arg8, 1, this.aBoolean907 ? arg9 : 0, -919953866);
	}

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "(Lclient!di;Lclient!dn;Lclient!ov;IIIIZI)V")
	void method31238(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		@Pc(2) Class228[] local2 = arg1.method7385();
		@Pc(5) Class211[] local5 = arg1.method7386();
		if ((this.aClass658_7 == null || this.aClass658_7.aBoolean972) && (local2 != null || local5 != null)) {
			@Pc(28) Class625 local28 = (Class625) this.aClass41_Sub3_10.method18054(this.anInt5132 * -1004622293, -1639126699);
			if (local28.anIntArray503 != null) {
				local28 = local28.method32456(Class672.aClass134_1, client.anInt3541 * -1330995431 == 0 ? Class251.anInterface24_3 : Class672.aClass134_1, -626145238);
			}
			if (local28 != null) {
				this.aClass658_7 = Class658.method33264(client.anInt3436, true);
			}
		}
		if (this.aClass658_7 == null) {
			return;
		}
		arg1.method7346(arg2);
		if (arg7) {
			this.aClass658_7.method33238(arg0, (long) client.anInt3436, local2, local5, false);
		} else {
			this.aClass658_7.method33237((long) client.anInt3436);
		}
		this.aClass658_7.method33242(this.aByte149, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!sf", name = "s", descriptor = "(ZIIII)V")
	void method31239(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(1) int local1 = arg1;
		@Pc(3) boolean local3 = false;
		if (arg1 == -1) {
			@Pc(16) Class625 local16 = (Class625) this.aClass41_Sub3_10.method18054(this.anInt5132 * -1004622293, 1736504206);
			@Pc(18) Class625 local18 = local16;
			if (local16.anIntArray503 != null) {
				local16 = local16.method32456(Class672.aClass134_1, client.anInt3541 * -1330995431 == 0 ? Class251.anInterface24_3 : Class672.aClass134_1, -1806680979);
			}
			if (local16 == null) {
				return;
			}
			if (local16 == local18) {
				local18 = null;
			}
			if (local16.method32469(250238984)) {
				if (!local16.aBoolean942 || Class703.aClass80_Sub37_49.aClass165_Sub35_1.method16584(-1880430607) == 1) {
					if (arg0 && this.aClass6_7.method23590(-499060808) && local16.method32467(this.aClass6_7.method23582(1233020229), (byte) 105)) {
						return;
					}
					if (this.anInt5134 * -1941041081 != local16.anInt5499 * 324896623) {
						local3 = local16.aBoolean947;
					}
					local1 = local16.method32465(1324282097);
					if (local16.method32453((byte) 16)) {
						arg2 = 0;
					} else {
						arg2 = 1;
					}
				}
			} else if (local18 != null && local18.method32469(-491935544) && (!local18.aBoolean942 || Class703.aClass80_Sub37_49.aClass165_Sub35_1.method16584(1908038620) == 1)) {
				if (arg0 && this.aClass6_7.method23590(-499060808) && local18.method32467(this.aClass6_7.method23582(-976508652), (byte) 117)) {
					return;
				}
				if (this.anInt5134 * -1941041081 != local16.anInt5499 * 324896623) {
					local3 = local18.aBoolean947;
				}
				local1 = local18.method32465(-1086249596);
				if (local18.method32453((byte) 16)) {
					arg2 = 0;
				} else {
					arg2 = 1;
				}
			}
		}
		if (local1 == -1) {
			this.aClass6_7.method23634(-1, false, -1924546221);
		} else {
			this.aClass6_7.method23626(local1, arg3, arg2, local3, (byte) -95);
			this.anInt5135 = client.anInt3436 * 1064832067;
			this.aBoolean909 = false;
			this.aClass105_6 = null;
		}
	}

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "(Lclient!di;B)V")
	void method31240(@OriginalArg(0) Class102 arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass80_Sub1_Sub10_5 != null) {
			@Pc(8) Class463 local8 = this.aClass120_Sub1_24.method24552().aClass463_61;
			client.aClass539_1.method30932(-1638462787).method31588(this.aClass80_Sub1_Sub10_5, this.aByte149, (int) local8.aFloat297, (int) local8.aFloat296, this.aBooleanArray31, 1099174782);
			this.aBooleanArray31 = null;
			this.aClass80_Sub1_Sub10_5 = null;
		}
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(Lclient!vj;I)V")
	void method31241(@OriginalArg(0) Class614 arg0, @OriginalArg(1) int arg1) {
		this.aClass614_2 = arg0;
		this.aClass105_6 = null;
	}

	@OriginalMember(owner = "client!sf", name = "x", descriptor = "(II)V")
	public void method31242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass6_8 = null;
		if (arg1 > 0) {
			this.aClass6_8 = new Class6_Sub1(this.aClass120_Sub1_24, false);
			this.aClass6_8.method23626(arg0, arg1, 1, false, (byte) -102);
		} else {
			this.aBoolean907 = true;
			this.method31239(false, arg0, 1, 0, -919953866);
		}
	}

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "(B)Lclient!vv;")
	Class625 method31243(@OriginalArg(0) byte arg0) {
		return (Class625) this.aClass41_Sub3_10.method18054(this.anInt5132 * -1004622293, 1443416879);
	}

	@OriginalMember(owner = "client!sf", name = "u", descriptor = "(I)I")
	int method31244(@OriginalArg(0) int arg0) {
		return -this.method31249(750082816);
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(Lclient!vj;)V")
	void method31245(@OriginalArg(0) Class614 arg0) {
		this.aClass614_2 = arg0;
		this.aClass105_6 = null;
	}

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "(I)Z")
	boolean method31246(@OriginalArg(0) int arg0) {
		return this.aBoolean908;
	}

	@OriginalMember(owner = "client!sf", name = "o", descriptor = "(Lclient!di;I)V")
	void method31247(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		this.method31250(arg0, 262144, true, true, 573975141);
	}

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "(III)V")
	public void method31248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass6_8 = null;
		if (arg1 > 0) {
			this.aClass6_8 = new Class6_Sub1(this.aClass120_Sub1_24, false);
			this.aClass6_8.method23626(arg0, arg1, 1, false, (byte) -77);
		} else {
			this.aBoolean907 = true;
			this.method31239(false, arg0, 1, 0, -919953866);
		}
	}

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)I")
	int method31249(@OriginalArg(0) int arg0) {
		return this.anInt5131 * 925816457;
	}

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "(Lclient!di;IZZI)Lclient!dn;")
	Class105 method31250(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(9) Class625 local9 = (Class625) this.aClass41_Sub3_10.method18054(this.anInt5132 * -1004622293, 944851894);
		if (local9.anIntArray503 != null) {
			local9 = local9.method32456(Class672.aClass134_1, client.anInt3541 * -1330995431 == 0 ? Class251.anInterface24_3 : Class672.aClass134_1, -1042375091);
		}
		if (local9 == null) {
			this.method31240(arg0, (byte) 8);
			this.anInt5134 = -2049218935;
			return null;
		}
		if (!this.aBoolean907 && local9.anInt5499 * 324896623 != this.anInt5134 * -1941041081) {
			this.method31239(true, -1, 0, 0, -919953866);
			this.aBoolean909 = false;
			this.aClass105_6 = null;
		}
		this.method31252(this.aClass120_Sub1_24, -31007479);
		if (arg3) {
			arg3 &= this.aBoolean908 & !this.aBoolean909 & Class703.aClass80_Sub37_49.aClass165_Sub22_1.method16266(1100554676) != 0;
		}
		if (arg2 && !arg3) {
			this.anInt5134 = local9.anInt5499 * -670610535;
			return null;
		}
		@Pc(105) Class463 local105 = this.aClass120_Sub1_24.method24552().aClass463_61;
		@Pc(109) Class570 local109 = client.aClass539_1.method30932(-1638462787);
		if (arg3) {
			local109.method31588(this.aClass80_Sub1_Sub10_5, this.aByte149, (int) local105.aFloat297, (int) local105.aFloat296, this.aBooleanArray31, 1545719862);
			this.aBoolean909 = false;
		}
		@Pc(135) Class100 local135 = local109.aClass100Array1[this.aByte149];
		@Pc(143) Class100 local143;
		if (this.aBoolean906) {
			local143 = local109.aClass100Array3[0];
		} else {
			local143 = this.aByte149 < 3 ? local109.aClass100Array1[this.aByte149 + 1] : null;
		}
		@Pc(160) Class105 local160 = null;
		if (this.aClass6_7.method23590(-499060808)) {
			if (arg3) {
				arg1 |= 0x40000;
			}
			local160 = local9.method32461(arg0, arg1, this.anInt5133 * 1263148313 == 11 ? 10 : this.anInt5133 * 1263148313, this.anInt5133 * 1263148313 == 11 ? this.anInt5130 * 1986737113 + 4 : this.anInt5130 * 1986737113, local135, local143, (int) local105.aFloat297, local135.method2915((int) local105.aFloat297, (int) local105.aFloat296, (byte) -42), (int) local105.aFloat296, this.aClass6_7, this.aClass614_2, 2137366215);
			if (local160 == null) {
				this.aBooleanArray31 = null;
				this.aClass80_Sub1_Sub10_5 = null;
				this.anInt5131 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray31 == null) {
						this.aBooleanArray31 = new boolean[4];
					}
					this.aClass80_Sub1_Sub10_5 = local160.method7361(this.aClass80_Sub1_Sub10_5);
					local109.method31587(this.aClass80_Sub1_Sub10_5, this.aByte149, (int) local105.aFloat297, (int) local105.aFloat296, this.aBooleanArray31, 1710268013);
					this.aBoolean909 = true;
				}
				this.anInt5131 = local160.method7366() * -1632534599;
				local160.method7501();
			}
			this.aClass105_6 = null;
		} else if (this.aClass105_6 != null && (this.aClass105_6.method7326() & arg1) == arg1 && this.anInt5134 * -1941041081 == local9.anInt5499 * 324896623) {
			local160 = this.aClass105_6;
		} else {
			if (this.aClass105_6 != null) {
				arg1 |= this.aClass105_6.method7326();
			}
			@Pc(373) Class44 local373 = local9.method32460(arg0, arg1, this.anInt5133 * 1263148313 == 11 ? 10 : this.anInt5133 * 1263148313, this.anInt5133 * 1263148313 == 11 ? this.anInt5130 * 1986737113 + 4 : this.anInt5130 * 1986737113, local135, local143, (int) local105.aFloat297, local135.method2915((int) local105.aFloat297, (int) local105.aFloat296, (byte) -9), (int) local105.aFloat296, arg3, this.aClass614_2, (byte) -85);
			if (local373 == null) {
				this.aBooleanArray31 = null;
				this.aClass80_Sub1_Sub10_5 = null;
				this.aClass105_6 = null;
				this.anInt5131 = 0;
			} else {
				this.aClass105_6 = local160 = (Class105) local373.anObject1;
				if (arg3) {
					this.aClass80_Sub1_Sub10_5 = (Class80_Sub1_Sub10) local373.anObject2;
					this.aBooleanArray31 = null;
					local109.method31587(this.aClass80_Sub1_Sub10_5, this.aByte149, (int) local105.aFloat297, (int) local105.aFloat296, null, 1216250082);
					this.aBoolean909 = true;
				}
				this.anInt5131 = local160.method7366() * -1632534599;
				local160.method7501();
			}
		}
		this.anInt5134 = local9.anInt5499 * -670610535;
		return local160;
	}

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "(II)V")
	public void method31251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass6_8 = null;
		if (arg1 > 0) {
			this.aClass6_8 = new Class6_Sub1(this.aClass120_Sub1_24, false);
			this.aClass6_8.method23626(arg0, arg1, 1, false, (byte) -57);
		} else {
			this.aBoolean907 = true;
			this.method31239(false, arg0, 1, 0, -919953866);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!alf;I)V")
	void method31252(@OriginalArg(0) Class120_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass6_8 != null && this.aClass6_8.method23590(-499060808)) {
			this.aClass6_8.method23601(client.anInt3436 - this.anInt5135 * -333209493, -1169894130);
			if (this.aClass6_8.method23658((byte) 1)) {
				this.aClass6_8.method23587(-1, -2060415981);
			}
			if (!this.aClass6_8.method23589((byte) 102)) {
				this.aClass6_7 = this.aClass6_8;
				this.aBoolean907 = true;
				this.anInt5135 = client.anInt3436 * 1064832067;
				return;
			}
		}
		if (!this.aClass6_7.method23590(-499060808)) {
			this.method31239(false, -1, 0, 0, -919953866);
		} else if (this.aClass6_7.method23601(client.anInt3436 - this.anInt5135 * -333209493, -1558001657)) {
			if (Class703.aClass80_Sub37_49.aClass165_Sub22_1.method16266(499765501) == 2) {
				this.aBoolean909 = false;
			}
			if (this.aClass6_7.method23658((byte) 1)) {
				this.aClass6_7.method23587(-1, -2060415981);
				this.aBoolean907 = false;
				this.method31239(false, -1, 0, 0, -919953866);
			}
		}
		this.anInt5135 = client.anInt3436 * 1064832067;
	}

	@OriginalMember(owner = "client!sf", name = "w", descriptor = "()I")
	int method31253() {
		return this.anInt5131 * 925816457;
	}

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "()I")
	int method31254() {
		return this.anInt5131 * 925816457;
	}

	@OriginalMember(owner = "client!sf", name = "q", descriptor = "()I")
	int method31255() {
		return this.anInt5131 * 925816457;
	}

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "(Lclient!vj;)V")
	void method31256(@OriginalArg(0) Class614 arg0) {
		this.aClass614_2 = arg0;
		this.aClass105_6 = null;
	}

	@OriginalMember(owner = "client!sf", name = "z", descriptor = "(Lclient!vj;)V")
	void method31257(@OriginalArg(0) Class614 arg0) {
		this.aClass614_2 = arg0;
		this.aClass105_6 = null;
	}

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "(Lclient!vj;)V")
	void method31258(@OriginalArg(0) Class614 arg0) {
		this.aClass614_2 = arg0;
		this.aClass105_6 = null;
	}

	@OriginalMember(owner = "client!sf", name = "v", descriptor = "()I")
	int method31259() {
		return -this.method31249(1587850946);
	}

	@OriginalMember(owner = "client!sf", name = "y", descriptor = "()Lclient!vv;")
	Class625 method31260() {
		return (Class625) this.aClass41_Sub3_10.method18054(this.anInt5132 * -1004622293, -2129399326);
	}

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "()Lclient!vv;")
	Class625 method31261() {
		return (Class625) this.aClass41_Sub3_10.method18054(this.anInt5132 * -1004622293, -1693305441);
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "()Lclient!vv;")
	Class625 method31262() {
		return (Class625) this.aClass41_Sub3_10.method18054(this.anInt5132 * -1004622293, -533732808);
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(Lclient!di;IZZ)Lclient!dn;")
	Class105 method31263(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(9) Class625 local9 = (Class625) this.aClass41_Sub3_10.method18054(this.anInt5132 * -1004622293, -618546754);
		if (local9.anIntArray503 != null) {
			local9 = local9.method32456(Class672.aClass134_1, client.anInt3541 * -1330995431 == 0 ? Class251.anInterface24_3 : Class672.aClass134_1, -669167102);
		}
		if (local9 == null) {
			this.method31240(arg0, (byte) 8);
			this.anInt5134 = -2049218935;
			return null;
		}
		if (!this.aBoolean907 && local9.anInt5499 * 324896623 != this.anInt5134 * -1941041081) {
			this.method31239(true, -1, 0, 0, -919953866);
			this.aBoolean909 = false;
			this.aClass105_6 = null;
		}
		this.method31252(this.aClass120_Sub1_24, -1717942349);
		if (arg3) {
			arg3 &= this.aBoolean908 & !this.aBoolean909 & Class703.aClass80_Sub37_49.aClass165_Sub22_1.method16266(474639108) != 0;
		}
		if (arg2 && !arg3) {
			this.anInt5134 = local9.anInt5499 * -670610535;
			return null;
		}
		@Pc(105) Class463 local105 = this.aClass120_Sub1_24.method24552().aClass463_61;
		@Pc(109) Class570 local109 = client.aClass539_1.method30932(-1638462787);
		if (arg3) {
			local109.method31588(this.aClass80_Sub1_Sub10_5, this.aByte149, (int) local105.aFloat297, (int) local105.aFloat296, this.aBooleanArray31, -1302379225);
			this.aBoolean909 = false;
		}
		@Pc(135) Class100 local135 = local109.aClass100Array1[this.aByte149];
		@Pc(143) Class100 local143;
		if (this.aBoolean906) {
			local143 = local109.aClass100Array3[0];
		} else {
			local143 = this.aByte149 < 3 ? local109.aClass100Array1[this.aByte149 + 1] : null;
		}
		@Pc(160) Class105 local160 = null;
		if (this.aClass6_7.method23590(-499060808)) {
			if (arg3) {
				arg1 |= 0x40000;
			}
			local160 = local9.method32461(arg0, arg1, this.anInt5133 * 1263148313 == 11 ? 10 : this.anInt5133 * 1263148313, this.anInt5133 * 1263148313 == 11 ? this.anInt5130 * 1986737113 + 4 : this.anInt5130 * 1986737113, local135, local143, (int) local105.aFloat297, local135.method2915((int) local105.aFloat297, (int) local105.aFloat296, (byte) -82), (int) local105.aFloat296, this.aClass6_7, this.aClass614_2, 2067879131);
			if (local160 == null) {
				this.aBooleanArray31 = null;
				this.aClass80_Sub1_Sub10_5 = null;
				this.anInt5131 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray31 == null) {
						this.aBooleanArray31 = new boolean[4];
					}
					this.aClass80_Sub1_Sub10_5 = local160.method7361(this.aClass80_Sub1_Sub10_5);
					local109.method31587(this.aClass80_Sub1_Sub10_5, this.aByte149, (int) local105.aFloat297, (int) local105.aFloat296, this.aBooleanArray31, 1633486397);
					this.aBoolean909 = true;
				}
				this.anInt5131 = local160.method7366() * -1632534599;
				local160.method7501();
			}
			this.aClass105_6 = null;
		} else if (this.aClass105_6 != null && (this.aClass105_6.method7326() & arg1) == arg1 && this.anInt5134 * -1941041081 == local9.anInt5499 * 324896623) {
			local160 = this.aClass105_6;
		} else {
			if (this.aClass105_6 != null) {
				arg1 |= this.aClass105_6.method7326();
			}
			@Pc(373) Class44 local373 = local9.method32460(arg0, arg1, this.anInt5133 * 1263148313 == 11 ? 10 : this.anInt5133 * 1263148313, this.anInt5133 * 1263148313 == 11 ? this.anInt5130 * 1986737113 + 4 : this.anInt5130 * 1986737113, local135, local143, (int) local105.aFloat297, local135.method2915((int) local105.aFloat297, (int) local105.aFloat296, (byte) -127), (int) local105.aFloat296, arg3, this.aClass614_2, (byte) 10);
			if (local373 == null) {
				this.aBooleanArray31 = null;
				this.aClass80_Sub1_Sub10_5 = null;
				this.aClass105_6 = null;
				this.anInt5131 = 0;
			} else {
				this.aClass105_6 = local160 = (Class105) local373.anObject1;
				if (arg3) {
					this.aClass80_Sub1_Sub10_5 = (Class80_Sub1_Sub10) local373.anObject2;
					this.aBooleanArray31 = null;
					local109.method31587(this.aClass80_Sub1_Sub10_5, this.aByte149, (int) local105.aFloat297, (int) local105.aFloat296, null, 1299353574);
					this.aBoolean909 = true;
				}
				this.anInt5131 = local160.method7366() * -1632534599;
				local160.method7501();
			}
		}
		this.anInt5134 = local9.anInt5499 * -670610535;
		return local160;
	}

	@OriginalMember(owner = "client!sf", name = "ax", descriptor = "(Lclient!di;Lclient!dn;Lclient!ov;IIIIZ)V")
	void method31264(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(2) Class228[] local2 = arg1.method7385();
		@Pc(5) Class211[] local5 = arg1.method7386();
		if ((this.aClass658_7 == null || this.aClass658_7.aBoolean972) && (local2 != null || local5 != null)) {
			@Pc(28) Class625 local28 = (Class625) this.aClass41_Sub3_10.method18054(this.anInt5132 * -1004622293, -805977057);
			if (local28.anIntArray503 != null) {
				local28 = local28.method32456(Class672.aClass134_1, client.anInt3541 * -1330995431 == 0 ? Class251.anInterface24_3 : Class672.aClass134_1, 543148006);
			}
			if (local28 != null) {
				this.aClass658_7 = Class658.method33264(client.anInt3436, true);
			}
		}
		if (this.aClass658_7 == null) {
			return;
		}
		arg1.method7346(arg2);
		if (arg7) {
			this.aClass658_7.method33238(arg0, (long) client.anInt3436, local2, local5, false);
		} else {
			this.aClass658_7.method33237((long) client.anInt3436);
		}
		this.aClass658_7.method33242(this.aByte149, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!sf", name = "ay", descriptor = "(Lclient!di;Lclient!dn;Lclient!ov;IIIIZ)V")
	void method31265(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(2) Class228[] local2 = arg1.method7385();
		@Pc(5) Class211[] local5 = arg1.method7386();
		if ((this.aClass658_7 == null || this.aClass658_7.aBoolean972) && (local2 != null || local5 != null)) {
			@Pc(28) Class625 local28 = (Class625) this.aClass41_Sub3_10.method18054(this.anInt5132 * -1004622293, -2123867957);
			if (local28.anIntArray503 != null) {
				local28 = local28.method32456(Class672.aClass134_1, client.anInt3541 * -1330995431 == 0 ? Class251.anInterface24_3 : Class672.aClass134_1, 136836614);
			}
			if (local28 != null) {
				this.aClass658_7 = Class658.method33264(client.anInt3436, true);
			}
		}
		if (this.aClass658_7 == null) {
			return;
		}
		arg1.method7346(arg2);
		if (arg7) {
			this.aClass658_7.method33238(arg0, (long) client.anInt3436, local2, local5, false);
		} else {
			this.aClass658_7.method33237((long) client.anInt3436);
		}
		this.aClass658_7.method33242(this.aByte149, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!sf", name = "ai", descriptor = "()Z")
	boolean method31266() {
		return this.aBoolean908;
	}

	@OriginalMember(owner = "client!sf", name = "ag", descriptor = "(ZIII)V")
	void method31267(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1 = arg1;
		@Pc(3) boolean local3 = false;
		if (arg1 == -1) {
			@Pc(16) Class625 local16 = (Class625) this.aClass41_Sub3_10.method18054(this.anInt5132 * -1004622293, 1377135447);
			@Pc(18) Class625 local18 = local16;
			if (local16.anIntArray503 != null) {
				local16 = local16.method32456(Class672.aClass134_1, client.anInt3541 * -1330995431 == 0 ? Class251.anInterface24_3 : Class672.aClass134_1, -1811050783);
			}
			if (local16 == null) {
				return;
			}
			if (local16 == local18) {
				local18 = null;
			}
			if (local16.method32469(-1079016946)) {
				if (!local16.aBoolean942 || Class703.aClass80_Sub37_49.aClass165_Sub35_1.method16584(420948093) == 1) {
					if (arg0 && this.aClass6_7.method23590(-499060808) && local16.method32467(this.aClass6_7.method23582(-336703072), (byte) 87)) {
						return;
					}
					if (this.anInt5134 * -1941041081 != local16.anInt5499 * 324896623) {
						local3 = local16.aBoolean947;
					}
					local1 = local16.method32465(-1740879674);
					if (local16.method32453((byte) 16)) {
						arg2 = 0;
					} else {
						arg2 = 1;
					}
				}
			} else if (local18 != null && local18.method32469(-1270706476) && (!local18.aBoolean942 || Class703.aClass80_Sub37_49.aClass165_Sub35_1.method16584(-510297691) == 1)) {
				if (arg0 && this.aClass6_7.method23590(-499060808) && local18.method32467(this.aClass6_7.method23582(12731786), (byte) 27)) {
					return;
				}
				if (this.anInt5134 * -1941041081 != local16.anInt5499 * 324896623) {
					local3 = local18.aBoolean947;
				}
				local1 = local18.method32465(-544786243);
				if (local18.method32453((byte) 16)) {
					arg2 = 0;
				} else {
					arg2 = 1;
				}
			}
		}
		if (local1 == -1) {
			this.aClass6_7.method23634(-1, false, -739192549);
		} else {
			this.aClass6_7.method23626(local1, arg3, arg2, local3, (byte) -85);
			this.anInt5135 = client.anInt3436 * 1064832067;
			this.aBoolean909 = false;
			this.aClass105_6 = null;
		}
	}

	@OriginalMember(owner = "client!sf", name = "ao", descriptor = "(Lclient!alf;)V")
	void method31268(@OriginalArg(0) Class120_Sub1 arg0) {
		if (this.aClass6_8 != null && this.aClass6_8.method23590(-499060808)) {
			this.aClass6_8.method23601(client.anInt3436 - this.anInt5135 * -333209493, -1264668504);
			if (this.aClass6_8.method23658((byte) 1)) {
				this.aClass6_8.method23587(-1, -2060415981);
			}
			if (!this.aClass6_8.method23589((byte) 15)) {
				this.aClass6_7 = this.aClass6_8;
				this.aBoolean907 = true;
				this.anInt5135 = client.anInt3436 * 1064832067;
				return;
			}
		}
		if (!this.aClass6_7.method23590(-499060808)) {
			this.method31239(false, -1, 0, 0, -919953866);
		} else if (this.aClass6_7.method23601(client.anInt3436 - this.anInt5135 * -333209493, -1657120957)) {
			if (Class703.aClass80_Sub37_49.aClass165_Sub22_1.method16266(-1638860908) == 2) {
				this.aBoolean909 = false;
			}
			if (this.aClass6_7.method23658((byte) 1)) {
				this.aClass6_7.method23587(-1, -2060415981);
				this.aBoolean907 = false;
				this.method31239(false, -1, 0, 0, -919953866);
			}
		}
		this.anInt5135 = client.anInt3436 * 1064832067;
	}

	@OriginalMember(owner = "client!sf", name = "aq", descriptor = "(Lclient!di;)V")
	void method31269(@OriginalArg(0) Class102 arg0) {
		this.method31250(arg0, 262144, true, true, 1404412694);
	}

	@OriginalMember(owner = "client!sf", name = "ac", descriptor = "(Lclient!alf;)V")
	void method31270(@OriginalArg(0) Class120_Sub1 arg0) {
		if (this.aClass6_8 != null && this.aClass6_8.method23590(-499060808)) {
			this.aClass6_8.method23601(client.anInt3436 - this.anInt5135 * -333209493, -1825187624);
			if (this.aClass6_8.method23658((byte) 1)) {
				this.aClass6_8.method23587(-1, -2060415981);
			}
			if (!this.aClass6_8.method23589((byte) 68)) {
				this.aClass6_7 = this.aClass6_8;
				this.aBoolean907 = true;
				this.anInt5135 = client.anInt3436 * 1064832067;
				return;
			}
		}
		if (!this.aClass6_7.method23590(-499060808)) {
			this.method31239(false, -1, 0, 0, -919953866);
		} else if (this.aClass6_7.method23601(client.anInt3436 - this.anInt5135 * -333209493, -1135609447)) {
			if (Class703.aClass80_Sub37_49.aClass165_Sub22_1.method16266(1669655979) == 2) {
				this.aBoolean909 = false;
			}
			if (this.aClass6_7.method23658((byte) 1)) {
				this.aClass6_7.method23587(-1, -2060415981);
				this.aBoolean907 = false;
				this.method31239(false, -1, 0, 0, -919953866);
			}
		}
		this.anInt5135 = client.anInt3436 * 1064832067;
	}

	@OriginalMember(owner = "client!sf", name = "aj", descriptor = "(Lclient!alf;)V")
	void method31271(@OriginalArg(0) Class120_Sub1 arg0) {
		if (this.aClass6_8 != null && this.aClass6_8.method23590(-499060808)) {
			this.aClass6_8.method23601(client.anInt3436 - this.anInt5135 * -333209493, -1334271291);
			if (this.aClass6_8.method23658((byte) 1)) {
				this.aClass6_8.method23587(-1, -2060415981);
			}
			if (!this.aClass6_8.method23589((byte) 68)) {
				this.aClass6_7 = this.aClass6_8;
				this.aBoolean907 = true;
				this.anInt5135 = client.anInt3436 * 1064832067;
				return;
			}
		}
		if (!this.aClass6_7.method23590(-499060808)) {
			this.method31239(false, -1, 0, 0, -919953866);
		} else if (this.aClass6_7.method23601(client.anInt3436 - this.anInt5135 * -333209493, -1619189704)) {
			if (Class703.aClass80_Sub37_49.aClass165_Sub22_1.method16266(1874523636) == 2) {
				this.aBoolean909 = false;
			}
			if (this.aClass6_7.method23658((byte) 1)) {
				this.aClass6_7.method23587(-1, -2060415981);
				this.aBoolean907 = false;
				this.method31239(false, -1, 0, 0, -919953866);
			}
		}
		this.anInt5135 = client.anInt3436 * 1064832067;
	}
}
