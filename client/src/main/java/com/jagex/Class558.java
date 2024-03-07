package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public class Class558 {

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "I")
	int anInt5323;

	@OriginalMember(owner = "client!sp", name = "u", descriptor = "Lclient!do;")
	Class109 aClass109_5;

	@OriginalMember(owner = "client!sp", name = "p", descriptor = "Lclient!aaq;")
	Class19 aClass19_9;

	@OriginalMember(owner = "client!sp", name = "s", descriptor = "Lclient!ara;")
	Class93_Sub1_Sub4 aClass93_Sub1_Sub4_5;

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "Lclient!vp;")
	Class620 aClass620_2;

	@OriginalMember(owner = "client!sp", name = "q", descriptor = "[Z")
	boolean[] aBooleanArray31;

	@OriginalMember(owner = "client!sp", name = "x", descriptor = "Lclient!xy;")
	Class674 aClass674_7;

	@OriginalMember(owner = "client!sp", name = "l", descriptor = "Z")
	boolean aBoolean805 = false;

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
	int anInt5327 = -1084281727;

	@OriginalMember(owner = "client!sp", name = "r", descriptor = "I")
	int anInt5328 = 0;

	@OriginalMember(owner = "client!sp", name = "v", descriptor = "Z")
	boolean aBoolean807 = false;

	@OriginalMember(owner = "client!sp", name = "y", descriptor = "Z")
	boolean aBoolean806 = false;

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "Lclient!aop;")
	Class32_Sub14 aClass32_Sub14_10;

	@OriginalMember(owner = "client!sp", name = "k", descriptor = "I")
	int anInt5324;

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
	int anInt5325;

	@OriginalMember(owner = "client!sp", name = "w", descriptor = "I")
	int anInt5326;

	@OriginalMember(owner = "client!sp", name = "m", descriptor = "Lclient!alh;")
	Class132_Sub1 aClass132_Sub1_24;

	@OriginalMember(owner = "client!sp", name = "n", descriptor = "B")
	byte aByte162;

	@OriginalMember(owner = "client!sp", name = "o", descriptor = "Z")
	boolean aBoolean808;

	@OriginalMember(owner = "client!sp", name = "z", descriptor = "Lclient!aaq;")
	Class19 aClass19_8;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Lclient!dh;Lclient!aop;Lclient!vd;IIILclient!alh;ZII)V", line = 47)
	Class558(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class32_Sub14 arg1, @OriginalArg(2) Class610 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class132_Sub1 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass32_Sub14_10 = arg1;
		this.anInt5324 = arg2.anInt5587 * 828073793;
		this.anInt5325 = arg3 * 1749100181;
		this.anInt5326 = arg4 * 2002192673;
		this.aClass132_Sub1_24 = arg6;
		this.aBoolean807 = arg8 != -1;
		this.aByte162 = (byte) arg5;
		this.aBoolean805 = arg7;
		this.aBoolean808 = arg0.method20535() && arg2.aBoolean828 && !this.aBoolean805;
		this.aClass19_8 = new Class19_Sub1(arg6, false);
		this.method31104(false, arg8, 1, this.aBoolean807 ? arg9 : 0, -845213262);
	}

	@OriginalMember(owner = "client!sp", name = "v", descriptor = "(II)V", line = 62)
	public void method31066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass19_9 = null;
		if (arg1 > 0) {
			this.aClass19_9 = new Class19_Sub1(this.aClass132_Sub1_24, false);
			this.aClass19_9.method23572(arg0, arg1, 1, false, (short) -25561);
		} else {
			this.aBoolean807 = true;
			this.method31104(false, arg0, 1, 0, -2054845639);
		}
	}

	@OriginalMember(owner = "client!sp", name = "r", descriptor = "(II)V", line = 62)
	public void method31067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass19_9 = null;
		if (arg1 > 0) {
			this.aClass19_9 = new Class19_Sub1(this.aClass132_Sub1_24, false);
			this.aClass19_9.method23572(arg0, arg1, 1, false, (short) -21362);
		} else {
			this.aBoolean807 = true;
			this.method31104(false, arg0, 1, 0, -1685082541);
		}
	}

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "(III)V", line = 62)
	public void method31068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass19_9 = null;
		if (arg1 > 0) {
			this.aClass19_9 = new Class19_Sub1(this.aClass132_Sub1_24, false);
			this.aClass19_9.method23572(arg0, arg1, 1, false, (short) 8527);
		} else {
			this.aBoolean807 = true;
			this.method31104(false, arg0, 1, 0, -1135726224);
		}
	}

	@OriginalMember(owner = "client!sp", name = "o", descriptor = "()I", line = 74)
	int method31069() {
		return this.anInt5328 * -809773691;
	}

	@OriginalMember(owner = "client!sp", name = "n", descriptor = "(I)I", line = 74)
	int method31070(@OriginalArg(0) int arg0) {
		return this.anInt5328 * -809773691;
	}

	@OriginalMember(owner = "client!sp", name = "s", descriptor = "()I", line = 74)
	int method31071() {
		return this.anInt5328 * -809773691;
	}

	@OriginalMember(owner = "client!sp", name = "y", descriptor = "(Lclient!vp;)V", line = 78)
	void method31072(@OriginalArg(0) Class620 arg0) {
		this.aClass620_2 = arg0;
		this.aClass109_5 = null;
	}

	@OriginalMember(owner = "client!sp", name = "q", descriptor = "(Lclient!vp;)V", line = 78)
	void method31073(@OriginalArg(0) Class620 arg0) {
		this.aClass620_2 = arg0;
		this.aClass109_5 = null;
	}

	@OriginalMember(owner = "client!sp", name = "x", descriptor = "(Lclient!vp;)V", line = 78)
	void method31074(@OriginalArg(0) Class620 arg0) {
		this.aClass620_2 = arg0;
		this.aClass109_5 = null;
	}

	@OriginalMember(owner = "client!sp", name = "m", descriptor = "(Lclient!vp;I)V", line = 78)
	void method31075(@OriginalArg(0) Class620 arg0, @OriginalArg(1) int arg1) {
		this.aClass620_2 = arg0;
		this.aClass109_5 = null;
	}

	@OriginalMember(owner = "client!sp", name = "h", descriptor = "()I", line = 83)
	int method31076() {
		return -this.method31070(2060838798);
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "()I", line = 83)
	int method31077() {
		return -this.method31070(1836047885);
	}

	@OriginalMember(owner = "client!sp", name = "k", descriptor = "(I)I", line = 83)
	int method31078(@OriginalArg(0) int arg0) {
		return -this.method31070(1574185411);
	}

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "(S)Lclient!vd;", line = 87)
	Class610 method31079(@OriginalArg(0) short arg0) {
		return (Class610) this.aClass32_Sub14_10.method18261(this.anInt5324 * 1228794785, 1535638980);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "()Lclient!vd;", line = 87)
	Class610 method31080() {
		return (Class610) this.aClass32_Sub14_10.method18261(this.anInt5324 * 1228794785, 316385548);
	}

	@OriginalMember(owner = "client!sp", name = "w", descriptor = "(Lclient!dh;IZZI)Lclient!do;", line = 91)
	final Class109 method31081(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(9) Class610 local9 = (Class610) this.aClass32_Sub14_10.method18261(this.anInt5324 * 1228794785, -2017480866);
		if (local9.anIntArray492 != null) {
			local9 = local9.method31991(Class624.aClass120_1, client.anInt3463 * 1819062465 == 0 ? Class249.anInterface23_3 : Class624.aClass120_1, 89276088);
		}
		if (local9 == null) {
			this.method31097(arg0, (byte) 15);
			this.anInt5327 = -1084281727;
			return null;
		}
		if (!this.aBoolean807 && local9.anInt5587 * 365009633 != this.anInt5327 * 432204927) {
			this.method31104(true, -1, 0, 0, -2143856586);
			this.aBoolean806 = false;
			this.aClass109_5 = null;
		}
		this.method31101(this.aClass132_Sub1_24, -406762289);
		if (arg3) {
			arg3 &= this.aBoolean808 & !this.aBoolean806 & Class51.options.aClass166_Sub8_1.method15531((short) 5107) != 0;
		}
		if (arg2 && !arg3) {
			this.anInt5327 = local9.anInt5587 * 1783842975;
			return null;
		}
		@Pc(106) Class472 local106 = this.aClass132_Sub1_24.method24220().aClass472_61;
		@Pc(110) Class585 local110 = client.world.method30481(-1071103310);
		if (arg3) {
			local110.method31595(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local106.aFloat317, (int) local106.aFloat319, this.aBooleanArray31, -564849535);
			this.aBoolean806 = false;
		}
		@Pc(136) Class99 local136 = local110.aClass99Array1[this.aByte162];
		@Pc(144) Class99 local144;
		if (this.aBoolean805) {
			local144 = local110.aClass99Array2[0];
		} else {
			local144 = this.aByte162 < 3 ? local110.aClass99Array1[this.aByte162 + 1] : null;
		}
		@Pc(161) Class109 local161 = null;
		if (this.aClass19_8.method23557(1829096624)) {
			if (arg3) {
				arg1 |= 0x40000;
			}
			local161 = local9.method31985(arg0, arg1, this.anInt5325 * -989891395 == 11 ? 10 : this.anInt5325 * -989891395, this.anInt5325 * -989891395 == 11 ? this.anInt5326 * -922764575 + 4 : this.anInt5326 * -922764575, local136, local144, (int) local106.aFloat317, local136.method2473((int) local106.aFloat317, (int) local106.aFloat319, 366442220), (int) local106.aFloat319, this.aClass19_8, this.aClass620_2, (byte) 1);
			if (local161 == null) {
				this.aBooleanArray31 = null;
				this.aClass93_Sub1_Sub4_5 = null;
				this.anInt5328 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray31 == null) {
						this.aBooleanArray31 = new boolean[4];
					}
					this.aClass93_Sub1_Sub4_5 = local161.method6898(this.aClass93_Sub1_Sub4_5);
					local110.method31591(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local106.aFloat317, (int) local106.aFloat319, this.aBooleanArray31, 1228728457);
					this.aBoolean806 = true;
				}
				this.anInt5328 = local161.method6917() * -856106163;
				local161.method6900();
			}
			this.aClass109_5 = null;
		} else if (this.aClass109_5 != null && (this.aClass109_5.method6875() & arg1) == arg1 && local9.anInt5587 * 365009633 == this.anInt5327 * 432204927) {
			local161 = this.aClass109_5;
		} else {
			if (this.aClass109_5 != null) {
				arg1 |= this.aClass109_5.method6875();
			}
			@Pc(373) Class34 local373 = local9.method31984(arg0, arg1, this.anInt5325 * -989891395 == 11 ? 10 : this.anInt5325 * -989891395, this.anInt5325 * -989891395 == 11 ? this.anInt5326 * -922764575 + 4 : this.anInt5326 * -922764575, local136, local144, (int) local106.aFloat317, local136.method2473((int) local106.aFloat317, (int) local106.aFloat319, 996044369), (int) local106.aFloat319, arg3, this.aClass620_2, (byte) 24);
			if (local373 == null) {
				this.aBooleanArray31 = null;
				this.aClass93_Sub1_Sub4_5 = null;
				this.aClass109_5 = null;
				this.anInt5328 = 0;
			} else {
				this.aClass109_5 = local161 = (Class109) local373.anObject1;
				if (arg3) {
					this.aClass93_Sub1_Sub4_5 = (Class93_Sub1_Sub4) local373.anObject2;
					this.aBooleanArray31 = null;
					local110.method31591(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local106.aFloat317, (int) local106.aFloat319, null, 2056183507);
					this.aBoolean806 = true;
				}
				this.anInt5328 = local161.method6917() * -856106163;
				local161.method6900();
			}
		}
		this.anInt5327 = local9.anInt5587 * 1783842975;
		return local161;
	}

	@OriginalMember(owner = "client!sp", name = "g", descriptor = "(Lclient!dh;IZZ)Lclient!do;", line = 91)
	final Class109 method31082(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(9) Class610 local9 = (Class610) this.aClass32_Sub14_10.method18261(this.anInt5324 * 1228794785, 907520427);
		if (local9.anIntArray492 != null) {
			local9 = local9.method31991(Class624.aClass120_1, client.anInt3463 * 1819062465 == 0 ? Class249.anInterface23_3 : Class624.aClass120_1, 1233056883);
		}
		if (local9 == null) {
			this.method31097(arg0, (byte) 42);
			this.anInt5327 = -1084281727;
			return null;
		}
		if (!this.aBoolean807 && local9.anInt5587 * 365009633 != this.anInt5327 * 432204927) {
			this.method31104(true, -1, 0, 0, -717291495);
			this.aBoolean806 = false;
			this.aClass109_5 = null;
		}
		this.method31101(this.aClass132_Sub1_24, -1553093893);
		if (arg3) {
			arg3 &= this.aBoolean808 & !this.aBoolean806 & Class51.options.aClass166_Sub8_1.method15531((short) 20134) != 0;
		}
		if (arg2 && !arg3) {
			this.anInt5327 = local9.anInt5587 * 1783842975;
			return null;
		}
		@Pc(106) Class472 local106 = this.aClass132_Sub1_24.method24220().aClass472_61;
		@Pc(110) Class585 local110 = client.world.method30481(-1134938099);
		if (arg3) {
			local110.method31595(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local106.aFloat317, (int) local106.aFloat319, this.aBooleanArray31, -683920045);
			this.aBoolean806 = false;
		}
		@Pc(136) Class99 local136 = local110.aClass99Array1[this.aByte162];
		@Pc(144) Class99 local144;
		if (this.aBoolean805) {
			local144 = local110.aClass99Array2[0];
		} else {
			local144 = this.aByte162 < 3 ? local110.aClass99Array1[this.aByte162 + 1] : null;
		}
		@Pc(161) Class109 local161 = null;
		if (this.aClass19_8.method23557(753732325)) {
			if (arg3) {
				arg1 |= 0x40000;
			}
			local161 = local9.method31985(arg0, arg1, this.anInt5325 * -989891395 == 11 ? 10 : this.anInt5325 * -989891395, this.anInt5325 * -989891395 == 11 ? this.anInt5326 * -922764575 + 4 : this.anInt5326 * -922764575, local136, local144, (int) local106.aFloat317, local136.method2473((int) local106.aFloat317, (int) local106.aFloat319, 719760872), (int) local106.aFloat319, this.aClass19_8, this.aClass620_2, (byte) 1);
			if (local161 == null) {
				this.aBooleanArray31 = null;
				this.aClass93_Sub1_Sub4_5 = null;
				this.anInt5328 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray31 == null) {
						this.aBooleanArray31 = new boolean[4];
					}
					this.aClass93_Sub1_Sub4_5 = local161.method6898(this.aClass93_Sub1_Sub4_5);
					local110.method31591(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local106.aFloat317, (int) local106.aFloat319, this.aBooleanArray31, 763882289);
					this.aBoolean806 = true;
				}
				this.anInt5328 = local161.method6917() * -856106163;
				local161.method6900();
			}
			this.aClass109_5 = null;
		} else if (this.aClass109_5 != null && (this.aClass109_5.method6875() & arg1) == arg1 && local9.anInt5587 * 365009633 == this.anInt5327 * 432204927) {
			local161 = this.aClass109_5;
		} else {
			if (this.aClass109_5 != null) {
				arg1 |= this.aClass109_5.method6875();
			}
			@Pc(373) Class34 local373 = local9.method31984(arg0, arg1, this.anInt5325 * -989891395 == 11 ? 10 : this.anInt5325 * -989891395, this.anInt5325 * -989891395 == 11 ? this.anInt5326 * -922764575 + 4 : this.anInt5326 * -922764575, local136, local144, (int) local106.aFloat317, local136.method2473((int) local106.aFloat317, (int) local106.aFloat319, 1193549856), (int) local106.aFloat319, arg3, this.aClass620_2, (byte) 24);
			if (local373 == null) {
				this.aBooleanArray31 = null;
				this.aClass93_Sub1_Sub4_5 = null;
				this.aClass109_5 = null;
				this.anInt5328 = 0;
			} else {
				this.aClass109_5 = local161 = (Class109) local373.anObject1;
				if (arg3) {
					this.aClass93_Sub1_Sub4_5 = (Class93_Sub1_Sub4) local373.anObject2;
					this.aBooleanArray31 = null;
					local110.method31591(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local106.aFloat317, (int) local106.aFloat319, null, 1207616778);
					this.aBoolean806 = true;
				}
				this.anInt5328 = local161.method6917() * -856106163;
				local161.method6900();
			}
		}
		this.anInt5327 = local9.anInt5587 * 1783842975;
		return local161;
	}

	@OriginalMember(owner = "client!sp", name = "i", descriptor = "(Lclient!dh;IZZ)Lclient!do;", line = 91)
	final Class109 method31083(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(9) Class610 local9 = (Class610) this.aClass32_Sub14_10.method18261(this.anInt5324 * 1228794785, 113096799);
		if (local9.anIntArray492 != null) {
			local9 = local9.method31991(Class624.aClass120_1, client.anInt3463 * 1819062465 == 0 ? Class249.anInterface23_3 : Class624.aClass120_1, 1748011725);
		}
		if (local9 == null) {
			this.method31097(arg0, (byte) 27);
			this.anInt5327 = -1084281727;
			return null;
		}
		if (!this.aBoolean807 && local9.anInt5587 * 365009633 != this.anInt5327 * 432204927) {
			this.method31104(true, -1, 0, 0, -1059630985);
			this.aBoolean806 = false;
			this.aClass109_5 = null;
		}
		this.method31101(this.aClass132_Sub1_24, -1904526266);
		if (arg3) {
			arg3 &= this.aBoolean808 & !this.aBoolean806 & Class51.options.aClass166_Sub8_1.method15531((short) 2300) != 0;
		}
		if (arg2 && !arg3) {
			this.anInt5327 = local9.anInt5587 * 1783842975;
			return null;
		}
		@Pc(106) Class472 local106 = this.aClass132_Sub1_24.method24220().aClass472_61;
		@Pc(110) Class585 local110 = client.world.method30481(-1360246377);
		if (arg3) {
			local110.method31595(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local106.aFloat317, (int) local106.aFloat319, this.aBooleanArray31, 28849493);
			this.aBoolean806 = false;
		}
		@Pc(136) Class99 local136 = local110.aClass99Array1[this.aByte162];
		@Pc(144) Class99 local144;
		if (this.aBoolean805) {
			local144 = local110.aClass99Array2[0];
		} else {
			local144 = this.aByte162 < 3 ? local110.aClass99Array1[this.aByte162 + 1] : null;
		}
		@Pc(161) Class109 local161 = null;
		if (this.aClass19_8.method23557(990486320)) {
			if (arg3) {
				arg1 |= 0x40000;
			}
			local161 = local9.method31985(arg0, arg1, this.anInt5325 * -989891395 == 11 ? 10 : this.anInt5325 * -989891395, this.anInt5325 * -989891395 == 11 ? this.anInt5326 * -922764575 + 4 : this.anInt5326 * -922764575, local136, local144, (int) local106.aFloat317, local136.method2473((int) local106.aFloat317, (int) local106.aFloat319, 1339522757), (int) local106.aFloat319, this.aClass19_8, this.aClass620_2, (byte) 1);
			if (local161 == null) {
				this.aBooleanArray31 = null;
				this.aClass93_Sub1_Sub4_5 = null;
				this.anInt5328 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray31 == null) {
						this.aBooleanArray31 = new boolean[4];
					}
					this.aClass93_Sub1_Sub4_5 = local161.method6898(this.aClass93_Sub1_Sub4_5);
					local110.method31591(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local106.aFloat317, (int) local106.aFloat319, this.aBooleanArray31, 1030275423);
					this.aBoolean806 = true;
				}
				this.anInt5328 = local161.method6917() * -856106163;
				local161.method6900();
			}
			this.aClass109_5 = null;
		} else if (this.aClass109_5 != null && (this.aClass109_5.method6875() & arg1) == arg1 && local9.anInt5587 * 365009633 == this.anInt5327 * 432204927) {
			local161 = this.aClass109_5;
		} else {
			if (this.aClass109_5 != null) {
				arg1 |= this.aClass109_5.method6875();
			}
			@Pc(373) Class34 local373 = local9.method31984(arg0, arg1, this.anInt5325 * -989891395 == 11 ? 10 : this.anInt5325 * -989891395, this.anInt5325 * -989891395 == 11 ? this.anInt5326 * -922764575 + 4 : this.anInt5326 * -922764575, local136, local144, (int) local106.aFloat317, local136.method2473((int) local106.aFloat317, (int) local106.aFloat319, 1915457063), (int) local106.aFloat319, arg3, this.aClass620_2, (byte) 24);
			if (local373 == null) {
				this.aBooleanArray31 = null;
				this.aClass93_Sub1_Sub4_5 = null;
				this.aClass109_5 = null;
				this.anInt5328 = 0;
			} else {
				this.aClass109_5 = local161 = (Class109) local373.anObject1;
				if (arg3) {
					this.aClass93_Sub1_Sub4_5 = (Class93_Sub1_Sub4) local373.anObject2;
					this.aBooleanArray31 = null;
					local110.method31591(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local106.aFloat317, (int) local106.aFloat319, null, 400432373);
					this.aBoolean806 = true;
				}
				this.anInt5328 = local161.method6917() * -856106163;
				local161.method6900();
			}
		}
		this.anInt5327 = local9.anInt5587 * 1783842975;
		return local161;
	}

	@OriginalMember(owner = "client!sp", name = "j", descriptor = "(Lclient!dh;IZZ)Lclient!do;", line = 91)
	final Class109 method31084(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(9) Class610 local9 = (Class610) this.aClass32_Sub14_10.method18261(this.anInt5324 * 1228794785, -372528071);
		if (local9.anIntArray492 != null) {
			local9 = local9.method31991(Class624.aClass120_1, client.anInt3463 * 1819062465 == 0 ? Class249.anInterface23_3 : Class624.aClass120_1, 272892866);
		}
		if (local9 == null) {
			this.method31097(arg0, (byte) -11);
			this.anInt5327 = -1084281727;
			return null;
		}
		if (!this.aBoolean807 && local9.anInt5587 * 365009633 != this.anInt5327 * 432204927) {
			this.method31104(true, -1, 0, 0, -1930223252);
			this.aBoolean806 = false;
			this.aClass109_5 = null;
		}
		this.method31101(this.aClass132_Sub1_24, 1723901333);
		if (arg3) {
			arg3 &= this.aBoolean808 & !this.aBoolean806 & Class51.options.aClass166_Sub8_1.method15531((short) 17289) != 0;
		}
		if (arg2 && !arg3) {
			this.anInt5327 = local9.anInt5587 * 1783842975;
			return null;
		}
		@Pc(106) Class472 local106 = this.aClass132_Sub1_24.method24220().aClass472_61;
		@Pc(110) Class585 local110 = client.world.method30481(-1881766963);
		if (arg3) {
			local110.method31595(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local106.aFloat317, (int) local106.aFloat319, this.aBooleanArray31, 527744872);
			this.aBoolean806 = false;
		}
		@Pc(136) Class99 local136 = local110.aClass99Array1[this.aByte162];
		@Pc(144) Class99 local144;
		if (this.aBoolean805) {
			local144 = local110.aClass99Array2[0];
		} else {
			local144 = this.aByte162 < 3 ? local110.aClass99Array1[this.aByte162 + 1] : null;
		}
		@Pc(161) Class109 local161 = null;
		if (this.aClass19_8.method23557(642404772)) {
			if (arg3) {
				arg1 |= 0x40000;
			}
			local161 = local9.method31985(arg0, arg1, this.anInt5325 * -989891395 == 11 ? 10 : this.anInt5325 * -989891395, this.anInt5325 * -989891395 == 11 ? this.anInt5326 * -922764575 + 4 : this.anInt5326 * -922764575, local136, local144, (int) local106.aFloat317, local136.method2473((int) local106.aFloat317, (int) local106.aFloat319, 1382370753), (int) local106.aFloat319, this.aClass19_8, this.aClass620_2, (byte) 1);
			if (local161 == null) {
				this.aBooleanArray31 = null;
				this.aClass93_Sub1_Sub4_5 = null;
				this.anInt5328 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray31 == null) {
						this.aBooleanArray31 = new boolean[4];
					}
					this.aClass93_Sub1_Sub4_5 = local161.method6898(this.aClass93_Sub1_Sub4_5);
					local110.method31591(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local106.aFloat317, (int) local106.aFloat319, this.aBooleanArray31, 1770808887);
					this.aBoolean806 = true;
				}
				this.anInt5328 = local161.method6917() * -856106163;
				local161.method6900();
			}
			this.aClass109_5 = null;
		} else if (this.aClass109_5 != null && (this.aClass109_5.method6875() & arg1) == arg1 && local9.anInt5587 * 365009633 == this.anInt5327 * 432204927) {
			local161 = this.aClass109_5;
		} else {
			if (this.aClass109_5 != null) {
				arg1 |= this.aClass109_5.method6875();
			}
			@Pc(373) Class34 local373 = local9.method31984(arg0, arg1, this.anInt5325 * -989891395 == 11 ? 10 : this.anInt5325 * -989891395, this.anInt5325 * -989891395 == 11 ? this.anInt5326 * -922764575 + 4 : this.anInt5326 * -922764575, local136, local144, (int) local106.aFloat317, local136.method2473((int) local106.aFloat317, (int) local106.aFloat319, 220636005), (int) local106.aFloat319, arg3, this.aClass620_2, (byte) 24);
			if (local373 == null) {
				this.aBooleanArray31 = null;
				this.aClass93_Sub1_Sub4_5 = null;
				this.aClass109_5 = null;
				this.anInt5328 = 0;
			} else {
				this.aClass109_5 = local161 = (Class109) local373.anObject1;
				if (arg3) {
					this.aClass93_Sub1_Sub4_5 = (Class93_Sub1_Sub4) local373.anObject2;
					this.aBooleanArray31 = null;
					local110.method31591(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local106.aFloat317, (int) local106.aFloat319, null, 2062260610);
					this.aBoolean806 = true;
				}
				this.anInt5328 = local161.method6917() * -856106163;
				local161.method6900();
			}
		}
		this.anInt5327 = local9.anInt5587 * 1783842975;
		return local161;
	}

	@OriginalMember(owner = "client!sp", name = "l", descriptor = "(Lclient!dh;Lclient!do;Lclient!ou;IIIIZB)V", line = 171)
	void method31085(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) Class470 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) byte arg8) {
		@Pc(2) Class234[] local2 = arg1.method6919();
		@Pc(5) Class210[] local5 = arg1.method6931();
		if ((this.aClass674_7 == null || this.aClass674_7.aBoolean870) && (local2 != null || local5 != null)) {
			@Pc(26) Class610 local26 = (Class610) this.aClass32_Sub14_10.method18261(this.anInt5324 * 1228794785, 510346103);
			if (local26.anIntArray492 != null) {
				local26 = local26.method31991(Class624.aClass120_1, client.anInt3463 * 1819062465 == 0 ? Class249.anInterface23_3 : Class624.aClass120_1, 68498104);
			}
			if (local26 != null) {
				this.aClass674_7 = Class674.method33091(client.anInt3485, true);
			}
		}
		if (this.aClass674_7 == null) {
			return;
		}
		arg1.method6873(arg2);
		if (arg7) {
			this.aClass674_7.method33113(arg0, (long) client.anInt3485, local2, local5, false);
		} else {
			this.aClass674_7.method33110((long) client.anInt3485);
		}
		this.aClass674_7.method33127(this.aByte162, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!sp", name = "t", descriptor = "(Lclient!dh;Lclient!do;Lclient!ou;IIIIZ)V", line = 171)
	void method31086(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) Class470 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(2) Class234[] local2 = arg1.method6919();
		@Pc(5) Class210[] local5 = arg1.method6931();
		if ((this.aClass674_7 == null || this.aClass674_7.aBoolean870) && (local2 != null || local5 != null)) {
			@Pc(26) Class610 local26 = (Class610) this.aClass32_Sub14_10.method18261(this.anInt5324 * 1228794785, 877741272);
			if (local26.anIntArray492 != null) {
				local26 = local26.method31991(Class624.aClass120_1, client.anInt3463 * 1819062465 == 0 ? Class249.anInterface23_3 : Class624.aClass120_1, 880450077);
			}
			if (local26 != null) {
				this.aClass674_7 = Class674.method33091(client.anInt3485, true);
			}
		}
		if (this.aClass674_7 == null) {
			return;
		}
		arg1.method6873(arg2);
		if (arg7) {
			this.aClass674_7.method33113(arg0, (long) client.anInt3485, local2, local5, false);
		} else {
			this.aClass674_7.method33110((long) client.anInt3485);
		}
		this.aClass674_7.method33127(this.aByte162, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!sp", name = "ah", descriptor = "()Z", line = 187)
	boolean method31087() {
		return this.aBoolean808;
	}

	@OriginalMember(owner = "client!sp", name = "u", descriptor = "(B)Z", line = 187)
	boolean method31088(@OriginalArg(0) byte arg0) {
		return this.aBoolean808;
	}

	@OriginalMember(owner = "client!sp", name = "ag", descriptor = "()Z", line = 187)
	boolean method31089() {
		return this.aBoolean808;
	}

	@OriginalMember(owner = "client!sp", name = "al", descriptor = "()Z", line = 187)
	boolean method31090() {
		return this.aBoolean808;
	}

	@OriginalMember(owner = "client!sp", name = "ae", descriptor = "()Z", line = 187)
	boolean method31091() {
		return this.aBoolean808;
	}

	@OriginalMember(owner = "client!sp", name = "ai", descriptor = "(Lclient!dh;)V", line = 191)
	void method31092(@OriginalArg(0) Class104 arg0) {
		this.method31081(arg0, 262144, true, true, -582910727);
	}

	@OriginalMember(owner = "client!sp", name = "z", descriptor = "(Lclient!dh;I)V", line = 191)
	void method31093(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		this.method31081(arg0, 262144, true, true, 389393591);
	}

	@OriginalMember(owner = "client!sp", name = "as", descriptor = "(Lclient!dh;)V", line = 191)
	void method31094(@OriginalArg(0) Class104 arg0) {
		this.method31081(arg0, 262144, true, true, -1102987885);
	}

	@OriginalMember(owner = "client!sp", name = "aw", descriptor = "(Lclient!dh;)V", line = 191)
	void method31095(@OriginalArg(0) Class104 arg0) {
		this.method31081(arg0, 262144, true, true, -1179166605);
	}

	@OriginalMember(owner = "client!sp", name = "ac", descriptor = "(Lclient!dh;)V", line = 191)
	void method31096(@OriginalArg(0) Class104 arg0) {
		this.method31081(arg0, 262144, true, true, -582581332);
	}

	@OriginalMember(owner = "client!sp", name = "p", descriptor = "(Lclient!dh;B)V", line = 195)
	void method31097(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass93_Sub1_Sub4_5 != null) {
			@Pc(7) Class472 local7 = this.aClass132_Sub1_24.method24220().aClass472_61;
			client.world.method30481(-1831761059).method31595(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local7.aFloat317, (int) local7.aFloat319, this.aBooleanArray31, 11786043);
			this.aBooleanArray31 = null;
			this.aClass93_Sub1_Sub4_5 = null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "at", descriptor = "(Lclient!dh;)V", line = 195)
	void method31098(@OriginalArg(0) Class104 arg0) {
		if (this.aClass93_Sub1_Sub4_5 != null) {
			@Pc(7) Class472 local7 = this.aClass132_Sub1_24.method24220().aClass472_61;
			client.world.method30481(-1205479400).method31595(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local7.aFloat317, (int) local7.aFloat319, this.aBooleanArray31, -2017766006);
			this.aBooleanArray31 = null;
			this.aClass93_Sub1_Sub4_5 = null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "ad", descriptor = "(Lclient!dh;)V", line = 195)
	void method31099(@OriginalArg(0) Class104 arg0) {
		if (this.aClass93_Sub1_Sub4_5 != null) {
			@Pc(7) Class472 local7 = this.aClass132_Sub1_24.method24220().aClass472_61;
			client.world.method30481(-1294492633).method31595(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local7.aFloat317, (int) local7.aFloat319, this.aBooleanArray31, -2078222413);
			this.aBooleanArray31 = null;
			this.aClass93_Sub1_Sub4_5 = null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "am", descriptor = "(Lclient!dh;)V", line = 195)
	void method31100(@OriginalArg(0) Class104 arg0) {
		if (this.aClass93_Sub1_Sub4_5 != null) {
			@Pc(7) Class472 local7 = this.aClass132_Sub1_24.method24220().aClass472_61;
			client.world.method30481(-1424558418).method31595(this.aClass93_Sub1_Sub4_5, this.aByte162, (int) local7.aFloat317, (int) local7.aFloat319, this.aBooleanArray31, 690861858);
			this.aBooleanArray31 = null;
			this.aClass93_Sub1_Sub4_5 = null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "(Lclient!alh;I)V", line = 204)
	void method31101(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass19_9 != null && this.aClass19_9.method23557(2128840589)) {
			this.aClass19_9.method23618(client.anInt3485 - this.anInt5323 * -1364674031, 926423949);
			if (this.aClass19_9.method23598(-1228609165)) {
				this.aClass19_9.method23566(-1, 1681810251);
			}
			if (!this.aClass19_9.method23578((byte) 0)) {
				this.aClass19_8 = this.aClass19_9;
				this.aBoolean807 = true;
				this.anInt5323 = client.anInt3485 * -367692047;
				return;
			}
		}
		if (!this.aClass19_8.method23557(-2114750013)) {
			this.method31104(false, -1, 0, 0, -1001299920);
		} else if (this.aClass19_8.method23618(client.anInt3485 - this.anInt5323 * -1364674031, 619443265)) {
			if (Class51.options.aClass166_Sub8_1.method15531((short) 5625) == 2) {
				this.aBoolean806 = false;
			}
			if (this.aClass19_8.method23598(-1228609165)) {
				this.aClass19_8.method23566(-1, 722912989);
				this.aBoolean807 = false;
				this.method31104(false, -1, 0, 0, -724380988);
			}
		}
		this.anInt5323 = client.anInt3485 * -367692047;
	}

	@OriginalMember(owner = "client!sp", name = "au", descriptor = "(Lclient!alh;)V", line = 204)
	void method31102(@OriginalArg(0) Class132_Sub1 arg0) {
		if (this.aClass19_9 != null && this.aClass19_9.method23557(-1264578799)) {
			this.aClass19_9.method23618(client.anInt3485 - this.anInt5323 * -1364674031, -537567191);
			if (this.aClass19_9.method23598(-1228609165)) {
				this.aClass19_9.method23566(-1, 249772248);
			}
			if (!this.aClass19_9.method23578((byte) 0)) {
				this.aClass19_8 = this.aClass19_9;
				this.aBoolean807 = true;
				this.anInt5323 = client.anInt3485 * -367692047;
				return;
			}
		}
		if (!this.aClass19_8.method23557(-546448940)) {
			this.method31104(false, -1, 0, 0, -1445185111);
		} else if (this.aClass19_8.method23618(client.anInt3485 - this.anInt5323 * -1364674031, -1213086443)) {
			if (Class51.options.aClass166_Sub8_1.method15531((short) 19848) == 2) {
				this.aBoolean806 = false;
			}
			if (this.aClass19_8.method23598(-1228609165)) {
				this.aClass19_8.method23566(-1, 514066098);
				this.aBoolean807 = false;
				this.method31104(false, -1, 0, 0, -1525561088);
			}
		}
		this.anInt5323 = client.anInt3485 * -367692047;
	}

	@OriginalMember(owner = "client!sp", name = "ar", descriptor = "(Lclient!alh;)V", line = 204)
	void method31103(@OriginalArg(0) Class132_Sub1 arg0) {
		if (this.aClass19_9 != null && this.aClass19_9.method23557(-2123424409)) {
			this.aClass19_9.method23618(client.anInt3485 - this.anInt5323 * -1364674031, -1749035851);
			if (this.aClass19_9.method23598(-1228609165)) {
				this.aClass19_9.method23566(-1, 461902507);
			}
			if (!this.aClass19_9.method23578((byte) 0)) {
				this.aClass19_8 = this.aClass19_9;
				this.aBoolean807 = true;
				this.anInt5323 = client.anInt3485 * -367692047;
				return;
			}
		}
		if (!this.aClass19_8.method23557(1600346919)) {
			this.method31104(false, -1, 0, 0, -1125768288);
		} else if (this.aClass19_8.method23618(client.anInt3485 - this.anInt5323 * -1364674031, 1272120888)) {
			if (Class51.options.aClass166_Sub8_1.method15531((short) 1534) == 2) {
				this.aBoolean806 = false;
			}
			if (this.aClass19_8.method23598(-1228609165)) {
				this.aClass19_8.method23566(-1, -106126006);
				this.aBoolean807 = false;
				this.method31104(false, -1, 0, 0, -1903029435);
			}
		}
		this.anInt5323 = client.anInt3485 * -367692047;
	}

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "(ZIIII)V", line = 231)
	void method31104(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(1) int local1 = arg1;
		@Pc(3) boolean local3 = false;
		if (arg1 == -1) {
			@Pc(16) Class610 local16 = (Class610) this.aClass32_Sub14_10.method18261(this.anInt5324 * 1228794785, 924845331);
			@Pc(18) Class610 local18 = local16;
			if (local16.anIntArray492 != null) {
				local16 = local16.method31991(Class624.aClass120_1, client.anInt3463 * 1819062465 == 0 ? Class249.anInterface23_3 : Class624.aClass120_1, -579369343);
			}
			if (local16 == null) {
				return;
			}
			if (local18 == local16) {
				local18 = null;
			}
			if (local16.method32005((byte) 3)) {
				if (!local16.aBoolean831 || Class51.options.aClass166_Sub31_1.method16114((short) 25438) == 1) {
					if (arg0 && this.aClass19_8.method23557(-1759640339) && local16.method32015(this.aClass19_8.method23564((byte) 89), (byte) 31)) {
						return;
					}
					if (local16.anInt5587 * 365009633 != this.anInt5327 * 432204927) {
						local3 = local16.aBoolean837;
					}
					local1 = local16.method32009((short) 19702);
					if (local16.method32008(-1667128951)) {
						arg2 = 0;
					} else {
						arg2 = 1;
					}
				}
			} else if (local18 != null && local18.method32005((byte) -102) && (!local18.aBoolean831 || Class51.options.aClass166_Sub31_1.method16114((short) 29802) == 1)) {
				if (arg0 && this.aClass19_8.method23557(-1730746214) && local18.method32015(this.aClass19_8.method23564((byte) 51), (byte) 31)) {
					return;
				}
				if (local16.anInt5587 * 365009633 != this.anInt5327 * 432204927) {
					local3 = local18.aBoolean837;
				}
				local1 = local18.method32009((short) 28064);
				if (local18.method32008(260131802)) {
					arg2 = 0;
				} else {
					arg2 = 1;
				}
			}
		}
		if (local1 == -1) {
			this.aClass19_8.method23568(-1, false, -1678286317);
		} else {
			this.aClass19_8.method23572(local1, arg3, arg2, local3, (short) 12717);
			this.anInt5323 = client.anInt3485 * -367692047;
			this.aBoolean806 = false;
			this.aClass109_5 = null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "ap", descriptor = "(ZIII)V", line = 231)
	void method31105(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1 = arg1;
		@Pc(3) boolean local3 = false;
		if (arg1 == -1) {
			@Pc(16) Class610 local16 = (Class610) this.aClass32_Sub14_10.method18261(this.anInt5324 * 1228794785, 1142026822);
			@Pc(18) Class610 local18 = local16;
			if (local16.anIntArray492 != null) {
				local16 = local16.method31991(Class624.aClass120_1, client.anInt3463 * 1819062465 == 0 ? Class249.anInterface23_3 : Class624.aClass120_1, -456826603);
			}
			if (local16 == null) {
				return;
			}
			if (local18 == local16) {
				local18 = null;
			}
			if (local16.method32005((byte) -70)) {
				if (!local16.aBoolean831 || Class51.options.aClass166_Sub31_1.method16114((short) 3195) == 1) {
					if (arg0 && this.aClass19_8.method23557(1789402127) && local16.method32015(this.aClass19_8.method23564((byte) 88), (byte) 31)) {
						return;
					}
					if (local16.anInt5587 * 365009633 != this.anInt5327 * 432204927) {
						local3 = local16.aBoolean837;
					}
					local1 = local16.method32009((short) -16001);
					if (local16.method32008(-1938355524)) {
						arg2 = 0;
					} else {
						arg2 = 1;
					}
				}
			} else if (local18 != null && local18.method32005((byte) -98) && (!local18.aBoolean831 || Class51.options.aClass166_Sub31_1.method16114((short) 13010) == 1)) {
				if (arg0 && this.aClass19_8.method23557(985533417) && local18.method32015(this.aClass19_8.method23564((byte) 93), (byte) 31)) {
					return;
				}
				if (local16.anInt5587 * 365009633 != this.anInt5327 * 432204927) {
					local3 = local18.aBoolean837;
				}
				local1 = local18.method32009((short) 7806);
				if (local18.method32008(-1647277395)) {
					arg2 = 0;
				} else {
					arg2 = 1;
				}
			}
		}
		if (local1 == -1) {
			this.aClass19_8.method23568(-1, false, -1678286317);
		} else {
			this.aClass19_8.method23572(local1, arg3, arg2, local3, (short) -10424);
			this.anInt5323 = client.anInt3485 * -367692047;
			this.aBoolean806 = false;
			this.aClass109_5 = null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "aq", descriptor = "(ZIII)V", line = 231)
	void method31106(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1 = arg1;
		@Pc(3) boolean local3 = false;
		if (arg1 == -1) {
			@Pc(16) Class610 local16 = (Class610) this.aClass32_Sub14_10.method18261(this.anInt5324 * 1228794785, -199306362);
			@Pc(18) Class610 local18 = local16;
			if (local16.anIntArray492 != null) {
				local16 = local16.method31991(Class624.aClass120_1, client.anInt3463 * 1819062465 == 0 ? Class249.anInterface23_3 : Class624.aClass120_1, 1039550395);
			}
			if (local16 == null) {
				return;
			}
			if (local18 == local16) {
				local18 = null;
			}
			if (local16.method32005((byte) -32)) {
				if (!local16.aBoolean831 || Class51.options.aClass166_Sub31_1.method16114((short) 32081) == 1) {
					if (arg0 && this.aClass19_8.method23557(-1637792855) && local16.method32015(this.aClass19_8.method23564((byte) 15), (byte) 31)) {
						return;
					}
					if (local16.anInt5587 * 365009633 != this.anInt5327 * 432204927) {
						local3 = local16.aBoolean837;
					}
					local1 = local16.method32009((short) 8893);
					if (local16.method32008(-666706171)) {
						arg2 = 0;
					} else {
						arg2 = 1;
					}
				}
			} else if (local18 != null && local18.method32005((byte) -4) && (!local18.aBoolean831 || Class51.options.aClass166_Sub31_1.method16114((short) 32309) == 1)) {
				if (arg0 && this.aClass19_8.method23557(-1789439602) && local18.method32015(this.aClass19_8.method23564((byte) 100), (byte) 31)) {
					return;
				}
				if (local16.anInt5587 * 365009633 != this.anInt5327 * 432204927) {
					local3 = local18.aBoolean837;
				}
				local1 = local18.method32009((short) -10312);
				if (local18.method32008(-464377588)) {
					arg2 = 0;
				} else {
					arg2 = 1;
				}
			}
		}
		if (local1 == -1) {
			this.aClass19_8.method23568(-1, false, -1678286317);
		} else {
			this.aClass19_8.method23572(local1, arg3, arg2, local3, (short) 12868);
			this.anInt5323 = client.anInt3485 * -367692047;
			this.aBoolean806 = false;
			this.aClass109_5 = null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "ax", descriptor = "(ZIII)V", line = 231)
	void method31107(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1 = arg1;
		@Pc(3) boolean local3 = false;
		if (arg1 == -1) {
			@Pc(16) Class610 local16 = (Class610) this.aClass32_Sub14_10.method18261(this.anInt5324 * 1228794785, 1239516771);
			@Pc(18) Class610 local18 = local16;
			if (local16.anIntArray492 != null) {
				local16 = local16.method31991(Class624.aClass120_1, client.anInt3463 * 1819062465 == 0 ? Class249.anInterface23_3 : Class624.aClass120_1, 1947854409);
			}
			if (local16 == null) {
				return;
			}
			if (local18 == local16) {
				local18 = null;
			}
			if (local16.method32005((byte) 4)) {
				if (!local16.aBoolean831 || Class51.options.aClass166_Sub31_1.method16114((short) 23137) == 1) {
					if (arg0 && this.aClass19_8.method23557(1337048738) && local16.method32015(this.aClass19_8.method23564((byte) 7), (byte) 31)) {
						return;
					}
					if (local16.anInt5587 * 365009633 != this.anInt5327 * 432204927) {
						local3 = local16.aBoolean837;
					}
					local1 = local16.method32009((short) 14703);
					if (local16.method32008(-1658848050)) {
						arg2 = 0;
					} else {
						arg2 = 1;
					}
				}
			} else if (local18 != null && local18.method32005((byte) -8) && (!local18.aBoolean831 || Class51.options.aClass166_Sub31_1.method16114((short) 23511) == 1)) {
				if (arg0 && this.aClass19_8.method23557(1279126084) && local18.method32015(this.aClass19_8.method23564((byte) 7), (byte) 31)) {
					return;
				}
				if (local16.anInt5587 * 365009633 != this.anInt5327 * 432204927) {
					local3 = local18.aBoolean837;
				}
				local1 = local18.method32009((short) 8676);
				if (local18.method32008(-1390196074)) {
					arg2 = 0;
				} else {
					arg2 = 1;
				}
			}
		}
		if (local1 == -1) {
			this.aClass19_8.method23568(-1, false, -1678286317);
		} else {
			this.aClass19_8.method23572(local1, arg3, arg2, local3, (short) 9293);
			this.anInt5323 = client.anInt3485 * -367692047;
			this.aBoolean806 = false;
			this.aClass109_5 = null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "aj", descriptor = "(IZB)V", line = 293)
	static void method31108(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28000(22, (long) arg0);
		local4.method21886(-1271190860);
		local4.anInt3020 = (arg1 ? 1 : 0) * 1415359557;
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(II)V", line = 720)
	public static void method31109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class312.aClass240_74.method25843(arg0, (byte) -7);
		Class312.aClass240_77.method25843(arg0, (byte) 25);
		Class312.aClass240_75.method25843(arg0, (byte) 31);
		Class312.aClass240_76.method25843(arg0, (byte) -2);
	}

	@OriginalMember(owner = "client!sp", name = "ig", descriptor = "(IIIII)V", line = 5605)
	static final void method31110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Class448.method28922(Class694.aClass104_14, -1873816969);
		Class125_Sub3.method10062(arg0, arg1, arg2, arg3, 256, 256, -2135802800);
		Class522.method30358(arg0, arg1, arg2, arg3, 256, 256, (byte) 0);
		Class487.method29816(arg0, arg1, arg2, arg3, 256, 256, (byte) 0);
		Class271.method26304(arg0, arg1, arg2, arg3, -2105306954);
	}

	@OriginalMember(owner = "client!sp", name = "km", descriptor = "(ZI)V", line = 11903)
	public static final void method31111(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(5) ClientMessage local5 = Class102.createGameMessage(ClientProt.aClientProt_59, client.aClass175_2.clientIsaac, (byte) 26);
		client.aClass175_2.send(local5, -1718406436);
		for (@Pc(14) Class93_Sub40 local14 = (Class93_Sub40) client.aClass16_22.method227((byte) 83); local14 != null; local14 = (Class93_Sub40) client.aClass16_22.method229(1694641359)) {
			if (!local14.method23970(658560992)) {
				local14 = (Class93_Sub40) client.aClass16_22.method227((byte) 60);
				if (local14 == null) {
					break;
				}
			}
			if (local14.anInt3171 * -256237711 == 0) {
				Class372.method28019(local14, true, arg0, 176880928);
			}
		}
		if (client.aClass312_7 != null) {
			Class354.method27694(client.aClass312_7, -1174743804);
			client.aClass312_7 = null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "aph", descriptor = "(Lclient!yf;I)V", line = 12750)
	static final void method31112(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class113_Sub1.method7418(arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], 781162662);
	}

	@OriginalMember(owner = "client!sp", name = "axe", descriptor = "(Lclient!yf;I)V", line = 13928)
	static final void method31113(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(18) Class322 local18 = (Class322) Class542.aClass32_Sub2_3.method18261(local12, -536187821);
		if (local18.aString174 == null) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local18.aString174;
		}
	}
}
