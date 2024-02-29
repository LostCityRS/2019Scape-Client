package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqk")
public final class Class132_Sub1_Sub1_Sub1_Sub2 extends Class132_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!aqk", name = "cp", descriptor = "I")
	int anInt2798;

	@OriginalMember(owner = "client!aqk", name = "ca", descriptor = "Ljava/lang/String;")
	String aString80;

	@OriginalMember(owner = "client!aqk", name = "cn", descriptor = "Ljava/lang/String;")
	public String aString81;

	@OriginalMember(owner = "client!aqk", name = "cw", descriptor = "Lclient!xg;")
	public Class658 aClass658_1;

	@OriginalMember(owner = "client!aqk", name = "cv", descriptor = "Ljava/lang/String;")
	public String aString82;

	@OriginalMember(owner = "client!aqk", name = "dd", descriptor = "I")
	int anInt2809;

	@OriginalMember(owner = "client!aqk", name = "cx", descriptor = "B")
	public byte aByte75 = 0;

	@OriginalMember(owner = "client!aqk", name = "ct", descriptor = "[I")
	public int[] anIntArray242 = new int[8];

	@OriginalMember(owner = "client!aqk", name = "cf", descriptor = "[I")
	public int[] anIntArray243 = new int[8];

	@OriginalMember(owner = "client!aqk", name = "co", descriptor = "I")
	public int anInt2804 = 0;

	@OriginalMember(owner = "client!aqk", name = "cr", descriptor = "I")
	public int anInt2810 = 0;

	@OriginalMember(owner = "client!aqk", name = "cm", descriptor = "I")
	public int anInt2800 = 253594077;

	@OriginalMember(owner = "client!aqk", name = "cq", descriptor = "I")
	public int anInt2801 = 0;

	@OriginalMember(owner = "client!aqk", name = "ch", descriptor = "I")
	public int anInt2799 = -1224757437;

	@OriginalMember(owner = "client!aqk", name = "cb", descriptor = "Z")
	public boolean aBoolean457 = false;

	@OriginalMember(owner = "client!aqk", name = "cs", descriptor = "I")
	public int anInt2802 = 0;

	@OriginalMember(owner = "client!aqk", name = "cy", descriptor = "I")
	public int anInt2803 = 1606428209;

	@OriginalMember(owner = "client!aqk", name = "cc", descriptor = "I")
	public int anInt2797 = 875384945;

	@OriginalMember(owner = "client!aqk", name = "cz", descriptor = "I")
	public int anInt2805 = -672560763;

	@OriginalMember(owner = "client!aqk", name = "ck", descriptor = "I")
	public int anInt2806 = 1686331715;

	@OriginalMember(owner = "client!aqk", name = "cj", descriptor = "I")
	public int anInt2807 = 0;

	@OriginalMember(owner = "client!aqk", name = "cd", descriptor = "I")
	public int anInt2808 = 2016915063;

	@OriginalMember(owner = "client!aqk", name = "dr", descriptor = "Lclient!ge;")
	public Class286 aClass286_1 = Class286.aClass286_5;

	@OriginalMember(owner = "client!aqk", name = "da", descriptor = "Lclient!xh;")
	public Class659 aClass659_1 = Class659.aClass659_3;

	@OriginalMember(owner = "client!aqk", name = "dt", descriptor = "Z")
	public boolean aBoolean456 = false;

	@OriginalMember(owner = "client!aqk", name = "<init>", descriptor = "(Lclient!tx;)V")
	public Class132_Sub1_Sub1_Sub1_Sub2(@OriginalArg(0) Class585 arg0) {
		super(arg0, Class21.aClass79_Sub1_Sub1_1);
		this.method20061((byte) 80);
	}

	@OriginalMember(owner = "client!aqk", name = "<init>", descriptor = "(Lclient!tx;I)V")
	public Class132_Sub1_Sub1_Sub1_Sub2(@OriginalArg(0) Class585 arg0, @OriginalArg(1) int arg1) {
		super(arg0, arg1, Class21.aClass79_Sub1_Sub1_1);
		this.method20061((byte) 41);
	}

	@OriginalMember(owner = "client!aqk", name = "bj", descriptor = "(S)I")
	@Override
	int method19979(@OriginalArg(0) short arg0) {
		return this.anInt2809 * 506271417;
	}

	@OriginalMember(owner = "client!aqk", name = "em", descriptor = "()Z")
	@Override
	public boolean method20012() {
		return Class93_Sub26.aClass645_15.aBoolean867;
	}

	@OriginalMember(owner = "client!aqk", name = "gu", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	void method24305(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqk", name = "id", descriptor = "(II)V")
	public void method20059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2763 = 0;
		this.anInt2760 = 0;
		this.anInt2791 = 0;
		this.anIntArray240[0] = arg0;
		this.anIntArray239[0] = arg1;
		@Pc(22) int local22 = this.method20009(404783641);
		@Pc(27) Class472 local27 = Class472.method29711(this.method24241().aClass472_61);
		local27.aFloat325 = local22 * 256 + this.anIntArray240[0] * 512;
		local27.aFloat327 = local22 * 256 + this.anIntArray239[0] * 512;
		this.method24236(local27);
		local27.method29713();
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == this) {
			client.aClass532_1.method30713((byte) 13).method33184(56038105);
		}
		if (this.aClass674_3 != null) {
			this.aClass674_3.method33273();
		}
	}

	@OriginalMember(owner = "client!aqk", name = "hr", descriptor = "(Lclient!alw;I)V")
	public void method20060(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt3070 = 0;
		@Pc(6) int local6 = arg0.method22425((short) 16384);
		for (@Pc(8) int local8 = 0; local8 < this.anIntArray242.length; local8++) {
			if ((local6 & 0x1 << local8) == 0) {
				this.anIntArray242[local8] = -1;
				this.anIntArray243[local8] = -1;
			} else {
				@Pc(23) int local23 = arg0.method22425((short) 16384);
				@Pc(27) int local27 = arg0.method22427(-1434290800);
				this.anIntArray242[local8] = local23;
				this.anIntArray243[local8] = local27;
			}
		}
	}

	@OriginalMember(owner = "client!aqk", name = "hs", descriptor = "(B)V")
	void method20061(@OriginalArg(0) byte arg0) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anIntArray242.length; local1++) {
			this.anIntArray242[local1] = -1;
		}
		for (local1 = 0; local1 < this.anIntArray243.length; local1++) {
			this.anIntArray243[local1] = -1;
		}
	}

	@OriginalMember(owner = "client!aqk", name = "fv", descriptor = "(Lclient!dh;B)Lclient!uq;")
	@Override
	public Class600 method24310(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		return null;
	}

	@OriginalMember(owner = "client!aqk", name = "fc", descriptor = "(Lclient!dh;I)Lclient!tl;")
	@Override
	Class573 method24283(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass658_1 == null || !this.method20063(arg0, 2048, (byte) -115)) {
			return null;
		}
		@Pc(14) Class470 local14 = arg0.method20520();
		@Pc(17) Class470 local17 = this.method24238();
		@Pc(20) Class458 local20 = this.method24241();
		@Pc(25) int local25 = this.aClass523_7.method30544(-65663749);
		@Pc(46) Class572 local46 = this.aClass585_23.aClass572ArrayArrayArray3[this.aByte100][(int) local20.aClass472_61.aFloat325 >> 9][(int) local20.aClass472_61.aFloat327 >> 9];
		if (local46 == null || local46.aClass132_Sub1_Sub4_1 == null) {
			this.anInt2770 = (int) ((float) (this.anInt2770 * -78148565) - (float) (this.anInt2770 * -78148565) / 10.0F) * 1068028547;
		} else {
			@Pc(61) int local61 = this.anInt2770 * -78148565 - local46.aClass132_Sub1_Sub4_1.aShort97;
			this.anInt2770 = (int) ((float) (this.anInt2770 * -78148565) - (float) local61 / 10.0F) * 1068028547;
		}
		local14.method29545(local17);
		local14.method29568(0.0F, (float) (-20 - this.anInt2770 * -78148565), 0.0F);
		@Pc(111) Class573 local111 = null;
		this.aBoolean455 = false;
		if (Class51.aClass93_Sub36_1.aClass166_Sub21_1.method15819(1832634020) == 1) {
			@Pc(124) Class622 local124 = this.method19978(-1319371126);
			if (local124.aBoolean853 && (this.aClass658_1.anInt5978 * 1405397749 == -1 || ((Class336) Class162.aClass32_Sub3_2.method18273(this.aClass658_1.anInt5978 * 1405397749, 1621821390)).aBoolean718)) {
				@Pc(160) Class19 local160 = this.aClass19_3.method23564(-1080551603) && this.aClass19_3.method23573((byte) 0) ? this.aClass19_3 : null;
				@Pc(176) Class19_Sub3 local176 = this.aClass19_Sub3_3.method23564(1321224940) && (!this.aClass19_Sub3_3.aBoolean380 || local160 == null) ? this.aClass19_Sub3_3 : null;
				@Pc(179) short local179 = Class93_Sub26.aClass645_15.aShort184;
				@Pc(182) byte local182 = Class93_Sub26.aClass645_15.aByte174;
				if (this.aClass658_1.anInt5978 * 1405397749 != -1) {
					local179 = ((Class336) Class162.aClass32_Sub3_2.method18273(this.aClass658_1.anInt5978 * 1405397749, 1474355349)).aShort167;
					local182 = ((Class336) Class162.aClass32_Sub3_2.method18273(this.aClass658_1.anInt5978 * 1405397749, 494941685)).aByte131;
				}
				@Pc(213) Class109 local213 = null;
				if (local179 > -1 && Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15666(1897492919) == 1) {
					local213 = Class270.method26391(arg0, local25, this.anInt2767 * -1595449153, this.anInt2790 * 1471665235, this.anInt2769 * 1367159499, this.aClass109Array3[0], local179, local182, local176 == null ? local160 : local176, 131449313);
				} else {
					local213 = Class365.method28102(arg0, local25, this.anInt2767 * -1595449153, this.anInt2790 * 1471665235, this.anInt2769 * 1367159499, 1, this.aClass109Array3[0], 0, 0, 160, 240, local176 == null ? local160 : local176, (byte) 28);
				}
				if (local213 != null) {
					if (this.aClass241Array21 == null || this.aClass241Array21.length < this.aClass109Array3.length + 1) {
						this.method24288(this.aClass109Array3.length + 1, -1521119563);
					}
					local111 = Class125_Sub1.method9214(true, 373147274);
					this.aBoolean455 = true;
					arg0.method20530(false);
					local213.method6947(local14, this.aClass241Array21[this.aClass109Array3.length], 0);
					arg0.method20530(true);
				}
			}
		}
		@Pc(336) int local336;
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == this) {
			for (local336 = client.aClass173Array1.length - 1; local336 >= 0; local336--) {
				@Pc(342) Class173 local342 = client.aClass173Array1[local336];
				if (local342 != null && local342.anInt3252 * -1455617703 != -1) {
					@Pc(384) int local384;
					if (local342.anInt3247 * 1661685955 == 1) {
						@Pc(365) Class93_Sub15 local365 = (Class93_Sub15) client.aClass16_18.method215((long) (local342.anInt3246 * -1095042687));
						if (local365 != null) {
							@Pc(372) Class132_Sub1_Sub1_Sub1_Sub1 local372 = (Class132_Sub1_Sub1_Sub1_Sub1) local365.anObject5;
							@Pc(380) Class472 local380 = Class472.method29755(local372.method24241().aClass472_61, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24241().aClass472_61);
							local384 = (int) local380.aFloat325;
							@Pc(388) int local388 = (int) local380.aFloat327;
							this.method20062(arg0, local14, this.aClass109Array3[0], (long) local384, (long) local388, local342.anInt3252 * -1455617703, 92160000L);
						}
					}
					if (local342.anInt3247 * 1661685955 == 2) {
						@Pc(415) Class472 local415 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24241().aClass472_61;
						@Pc(425) long local425 = (long) (local342.anInt3248 * 846615897 - (int) local415.aFloat325);
						@Pc(435) long local435 = (long) (local342.anInt3249 * 166908561 - (int) local415.aFloat327);
						@Pc(443) long local443 = (long) (local342.anInt3250 * -1294740227 << 9);
						@Pc(447) long local447 = local443 * local443;
						this.method20062(arg0, local14, this.aClass109Array3[0], local425, local435, local342.anInt3252 * -1455617703, local447);
					}
					if (local342.anInt3247 * 1661685955 == 10 && local342.anInt3246 * -1095042687 >= 0 && local342.anInt3246 * -1095042687 < client.aClass132_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(487) Class132_Sub1_Sub1_Sub1_Sub2 local487 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local342.anInt3246 * -1095042687];
						if (local487 != null) {
							@Pc(497) Class472 local497 = Class472.method29755(local487.method24241().aClass472_61, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24241().aClass472_61);
							@Pc(501) int local501 = (int) local497.aFloat325;
							local384 = (int) local497.aFloat327;
							this.method20062(arg0, local14, this.aClass109Array3[0], (long) local501, (long) local384, local342.anInt3252 * -1455617703, 92160000L);
						}
					}
				}
			}
		}
		local14.method29545(local17);
		local14.method29568(0.0F, (float) (-5 - -78148565 * this.anInt2770), 0.0F);
		if (this.aClass241Array21 == null || this.aClass241Array21.length < this.aClass109Array3.length) {
			this.method24288(this.aClass109Array3.length, 1644317300);
		}
		if (local111 == null) {
			local111 = Class125_Sub1.method9214(true, 373147274);
		}
		this.method20033(arg0, this.aClass109Array3, local14, false, 943704981);
		for (local336 = 0; local336 < this.aClass109Array3.length; local336++) {
			if (this.aClass109Array3[local336] == null) {
				this.aClass241Array21[local336].aBoolean667 = false;
			} else {
				this.aClass109Array3[local336].method6947(local14, this.aClass241Array21[local336], Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == this ? 1 : 0);
			}
		}
		if (this.aClass674_3 != null) {
			@Pc(614) Class229 local614 = this.aClass674_3.method33308();
			arg0.method20509(local614);
		}
		for (local336 = 0; local336 < this.aClass109Array3.length; local336++) {
			if (this.aClass109Array3[local336] != null) {
				this.aBoolean455 |= this.aClass109Array3[local336].method6865();
			}
			this.aClass109Array3[local336] = null;
		}
		this.anInt2761 = client.anInt3495 * 706144655;
		return local111;
	}

	@OriginalMember(owner = "client!aqk", name = "fw", descriptor = "(Lclient!dh;I)V")
	@Override
	void method24279(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass658_1 == null || !this.aBoolean453 && !this.method20063(arg0, 0, (byte) -125)) {
			return;
		}
		@Pc(16) Class470 local16 = arg0.method20520();
		local16.method29546(this.method24241());
		local16.method29568(0.0F, -5.0F, 0.0F);
		this.method20033(arg0, this.aClass109Array3, local16, this.aBoolean453, -661210470);
		for (@Pc(36) int local36 = 0; local36 < this.aClass109Array3.length; local36++) {
			this.aClass109Array3[local36] = null;
		}
	}

	@OriginalMember(owner = "client!aqk", name = "hh", descriptor = "(Lclient!dh;Lclient!ou;Lclient!do;JJIJ)V")
	void method20062(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) long arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6) {
		@Pc(7) long local7 = arg4 * arg4 + arg3 * arg3;
		if (local7 < 262144L || local7 > arg6) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg3, (double) arg4) * 2607.5945876176133D - (double) this.aClass523_7.method30544(-694446683)) & 0x3FFF;
		@Pc(51) Class109 local51 = Class127.method9258(arg0, local33, this.anInt2767 * -1595449153, this.anInt2790 * 1471665235, this.anInt2769 * 1367159499, arg5, (byte) -74);
		if (local51 != null) {
			arg0.method20530(false);
			local51.method6947(arg1, null, 0);
			arg0.method20530(true);
		}
	}

	@OriginalMember(owner = "client!aqk", name = "hp", descriptor = "(Lclient!dh;IB)Z")
	boolean method20063(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(1) int local1 = arg1;
		@Pc(5) Class622 local5 = this.method19978(828722482);
		@Pc(20) Class19 local20 = this.aClass19_3.method23564(-448923961) && !this.aClass19_3.method23573((byte) 0) ? this.aClass19_3 : null;
		@Pc(40) Class19_Sub3 local40 = !this.aClass19_Sub3_3.method23564(-1788094623) || this.aBoolean457 || this.aClass19_Sub3_3.aBoolean380 && local20 != null ? null : this.aClass19_Sub3_3;
		@Pc(45) int local45 = local5.anInt5827 * -1915635865;
		@Pc(50) int local50 = local5.anInt5828 * 512505351;
		if (local45 != 0 || local50 != 0 || local5.anInt5836 * -1220545965 != 0 || local5.anInt5838 * -572659623 != 0) {
			arg1 |= 0x7;
		}
		@Pc(76) int local76 = this.aClass523_7.method30544(1784250010);
		@Pc(95) boolean local95 = this.aByte74 != 0 && client.anInt3485 >= this.anInt2789 * -2041786019 && client.anInt3485 < this.anInt2796 * 1023735623;
		if (local95) {
			arg1 |= 0x80000;
		}
		@Pc(128) Class109 local128 = this.aClass109Array3[0] = this.aClass658_1.method32953(arg0, arg1, Class166_Sub6.aClass32_Sub5_1, Class343.aClass32_Sub19_1, Class162.aClass32_Sub3_2, Class277.aClass32_Sub12_1, Class624.aClass120_1, Class624.aClass120_1, local20, local40, this.aClass19_Sub1_Sub1Array3, this.anIntArray237, local76, true, Class113.aClass651_2, (byte) 5);
		@Pc(131) int local131 = Class153_Sub1.method14114(-1581772389);
		if (Class553.anInt3419 * 1798078423 < 96 && local131 > 50) {
			BaseVarTypeCoordFine.method30429((byte) -100);
		}
		if (Class693.aClass693_8 != Class280.aClass693_1 && local131 < 50) {
			@Pc(151) int local151 = 50 - local131;
			while (local151 > client.anInt3437 * 1775306449) {
				Class64.aByteArrayArray3[client.anInt3437 * 1775306449] = new byte[102400];
				client.anInt3437 += -1693248975;
			}
			while (local151 < client.anInt3437 * 1775306449) {
				client.anInt3437 -= -1693248975;
				Class64.aByteArrayArray3[client.anInt3437 * 1775306449] = null;
			}
		} else if (Class693.aClass693_8 != Class280.aClass693_1) {
			Class64.aByteArrayArray3 = new byte[50][];
			client.anInt3437 = 0;
		}
		if (local128 == null) {
			return false;
		}
		this.anInt2795 = local128.method6882() * -895607843;
		this.anInt2774 = local128.method6841() * -1359936025;
		local128.method6862();
		this.method19975(local128, 912130086);
		if (local45 == 0 && local50 == 0) {
			this.method19977(local76, this.method20009(30191982) << 9, this.method20009(-278572966) << 9, 0, 0, (byte) 38);
		} else {
			this.method19977(local76, local45, local50, local5.anInt5829 * 81786893, local5.anInt5810 * -154907541, (byte) 51);
			if (this.anInt2767 * -1595449153 != 0) {
				local128.method6986(this.anInt2767 * -1595449153);
			}
			if (this.anInt2790 * 1471665235 != 0) {
				local128.method6830(this.anInt2790 * 1471665235);
			}
			if (this.anInt2769 * 1367159499 != 0) {
				local128.method6939(0, this.anInt2769 * 1367159499, 0);
			}
		}
		if (local95) {
			local128.method6879(this.aByte71, this.aByte72, this.aByte73, this.aByte74 & 0xFF);
		}
		if (!this.aBoolean457) {
			this.method19976(arg0, local5, local1, local45, local50, local76, -1486164730);
		}
		return true;
	}

	@OriginalMember(owner = "client!aqk", name = "hy", descriptor = "(ZB)Ljava/lang/String;")
	public String method20064(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) String local7 = arg0 ? this.aString81 : this.aString82;
		return this.aString80 == null ? local7 : this.aString80.replaceAll(Class430.aString218, local7);
	}

	@OriginalMember(owner = "client!aqk", name = "he", descriptor = "(ZI)Ljava/lang/String;")
	public String method20065(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		return arg0 ? this.aString81 : this.aString82;
	}

	@OriginalMember(owner = "client!aqk", name = "hn", descriptor = "(IIBB)V")
	public void method20066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte arg3) {
		if (this.aClass19_3.method23564(790898335) && this.aClass19_3.method23565(185237640).anInt3917 * -1511529595 == 1) {
			this.anIntArray236 = null;
			this.aClass19_3.method23580(-1, 1216426894);
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass554Array3.length; local23++) {
			if (this.aClass554Array3[local23].anInt5480 * 601549465 != -1) {
				@Pc(49) Class697 local49 = (Class697) Class501.aClass32_Sub18_1.method18273(this.aClass554Array3[local23].anInt5480 * 601549465, 1928560303);
				if (local49.aBoolean890 && local49.anInt6110 * 1477426425 != -1 && ((Class263) Class32.aClass32_Sub17_23.method18273(local49.anInt6110 * 1477426425, -398937132)).anInt3917 * -1511529595 == 1) {
					this.aClass554Array3[local23].aClass19_7.method23580(-1, 1822566302);
					this.aClass554Array3[local23].anInt5480 = 1020147287;
				}
			}
		}
		this.anInt2799 = -1224757437;
		if (arg0 < 0 || arg0 >= client.aClass532_1.method30625(466871291) || arg1 < 0 || arg1 >= client.aClass532_1.method30655((short) 128)) {
			this.method20067(arg0, arg1, (byte) 1);
		} else if (this.anIntArray240[0] >= 0 && this.anIntArray240[0] < client.aClass532_1.method30625(1016801991) && this.anIntArray239[0] >= 0 && this.anIntArray239[0] < client.aClass532_1.method30655((short) 128)) {
			this.method20087(arg0, arg1, arg2, 1745871115);
		} else {
			this.method20067(arg0, arg1, (byte) 1);
		}
	}

	@OriginalMember(owner = "client!aqk", name = "hi", descriptor = "(IIB)V")
	public void method20067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.anInt2763 = 0;
		this.anInt2760 = 0;
		this.anInt2791 = 0;
		this.anIntArray240[0] = arg0;
		this.anIntArray239[0] = arg1;
		@Pc(22) int local22 = this.method20009(-1733412847);
		@Pc(27) Class472 local27 = Class472.method29711(this.method24241().aClass472_61);
		local27.aFloat325 = local22 * 256 + this.anIntArray240[0] * 512;
		local27.aFloat327 = local22 * 256 + this.anIntArray239[0] * 512;
		this.method24236(local27);
		local27.method29713();
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == this) {
			client.aClass532_1.method30713((byte) -18).method33184(-1280746691);
		}
		if (this.aClass674_3 != null) {
			this.aClass674_3.method33273();
		}
	}

	@OriginalMember(owner = "client!aqk", name = "fq", descriptor = "(Lclient!dh;Lclient!alh;IIIZB)V")
	@Override
	void method24281(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqk", name = "ht", descriptor = "(I)Z")
	public boolean method20068(@OriginalArg(0) int arg0) {
		return this.aClass658_1 != null;
	}

	@OriginalMember(owner = "client!aqk", name = "ej", descriptor = "()I")
	@Override
	int method20017() {
		return this.anInt2809 * 506271417;
	}

	@OriginalMember(owner = "client!aqk", name = "iu", descriptor = "()V")
	void method20069() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anIntArray242.length; local1++) {
			this.anIntArray242[local1] = -1;
		}
		for (local1 = 0; local1 < this.anIntArray243.length; local1++) {
			this.anIntArray243[local1] = -1;
		}
	}

	@OriginalMember(owner = "client!aqk", name = "bs", descriptor = "(B)I")
	@Override
	public int method19962(@OriginalArg(0) byte arg0) {
		return -1;
	}

	@OriginalMember(owner = "client!aqk", name = "hq", descriptor = "(Lclient!alw;BI)V")
	public void method20070(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		this.aByte75 = arg1;
		@Pc(4) int local4 = -1;
		this.anInt2802 = 0;
		@Pc(12) int[] local12 = new int[Class113.aClass651_2.anIntArray508.length];
		@Pc(17) Class48[] local17 = new Class48[Class113.aClass651_2.anIntArray508.length];
		@Pc(22) Class47[] local22 = new Class47[Class113.aClass651_2.anIntArray508.length];
		@Pc(24) int local24;
		@Pc(39) int local39;
		@Pc(50) int local50;
		@Pc(56) int local56;
		@Pc(101) int local101;
		for (local24 = 0; local24 < Class113.aClass651_2.anIntArray508.length; local24++) {
			if (Class113.aClass651_2.anIntArray508[local24] != 1) {
				local39 = arg0.method22425((short) 16384);
				if (local39 == 0) {
					local12[local24] = 0;
				} else {
					local50 = arg0.method22425((short) 16384);
					local56 = (local39 << 8) + local50;
					if (local24 == 0 && local56 == 65535) {
						local4 = arg0.method22448(-986082524);
						this.anInt2802 = arg0.method22425((short) 16384) * -1228663053;
						break;
					}
					if (local56 >= 2048) {
						local56 -= 2048;
						local12[local24] = local56 | 0x40000000;
						local22[local24] = (Class47) Class277.aClass32_Sub12_1.method18273(local56, 420334811);
						local101 = local22[local24].anInt180 * -2011521841;
						if (local101 != 0) {
							this.anInt2802 = local101 * -1228663053;
						}
					} else {
						local12[local24] = local56 - 256 | Integer.MIN_VALUE;
					}
				}
			}
		}
		if (local4 == -1) {
			local24 = arg0.method22427(-1434290800);
			local39 = 0;
			for (local50 = 0; local50 < Class113.aClass651_2.anIntArray508.length; local50++) {
				if (Class113.aClass651_2.anIntArray508[local50] == 0) {
					if ((local24 & 0x1 << local39) != 0) {
						local17[local50] = Class180.method24533(local22[local50], arg0, -1948282047);
					}
					local39++;
				}
			}
		}
		@Pc(163) int[] local163 = new int[10];
		for (local39 = 0; local39 < 10; local39++) {
			local50 = arg0.method22425((short) 16384);
			if (Class111.aShortArrayArrayArray3.length < 1 || local50 < 0 || local50 >= Class111.aShortArrayArrayArray3[local39][0].length) {
				local50 = 0;
			}
			local163[local39] = local50;
		}
		@Pc(197) int[] local197 = new int[10];
		for (local50 = 0; local50 < 10; local50++) {
			local56 = arg0.method22425((short) 16384);
			if (Class79_Sub1_Sub2.aShortArrayArrayArray1.length < 1 || local56 < 0 || local56 >= Class79_Sub1_Sub2.aShortArrayArrayArray1[local50][0].length) {
				local56 = 0;
			}
			local197[local50] = local56;
		}
		this.anInt2809 = arg0.method22427(-1434290800) * -1126559863;
		if (this.aClass658_1 == null) {
			this.aClass658_1 = new Class658();
		}
		local50 = this.aClass658_1.anInt5978 * 1405397749;
		@Pc(254) int[] local254 = this.aClass658_1.anIntArray513;
		this.aClass658_1.method32940(this.method19979((short) 560), local12, local17, local163, local197, this.aByte75 == 1, local4, -2109105691);
		if (local4 != local50) {
			@Pc(281) Class472 local281 = Class472.method29711(this.method24241().aClass472_61);
			local281.aFloat325 = (this.anIntArray240[0] << 9) + (this.method20009(1676733848) << 8);
			local281.aFloat327 = (this.anIntArray239[0] << 9) + (this.method20009(1937442880) << 8);
			this.method24236(local281);
			local281.method29713();
		}
		if (client.anInt3513 * -859840571 == this.anInt2768 * -1688488127 && local254 != null) {
			for (local101 = 0; local101 < local163.length; local101++) {
				if (local254[local101] != local163[local101]) {
					Class277.aClass32_Sub12_1.method17084(-2084809343);
					break;
				}
			}
		}
		if (this.aClass674_3 != null) {
			this.aClass674_3.method33273();
		}
		if (!this.aClass19_Sub3_3.method23564(1399742694) || !this.aClass19_Sub3_3.aBoolean380) {
			return;
		}
		@Pc(365) Class622 local365 = this.method19978(332881486);
		if (!local365.method32310(this.aClass19_Sub3_3.method23566((byte) 23), 2110231964)) {
			this.aClass19_Sub3_3.method23580(-1, 1700205036);
			this.aClass19_Sub3_3.aBoolean380 = false;
		}
	}

	@OriginalMember(owner = "client!aqk", name = "v", descriptor = "()Lclient!ox;")
	@Override
	public Class472 method19961() {
		return Class472.method29709();
	}

	@OriginalMember(owner = "client!aqk", name = "ei", descriptor = "()I")
	@Override
	int method20027() {
		return this.anInt2809 * 506271417;
	}

	@OriginalMember(owner = "client!aqk", name = "if", descriptor = "(II)V")
	public void method20071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2763 = 0;
		this.anInt2760 = 0;
		this.anInt2791 = 0;
		this.anIntArray240[0] = arg0;
		this.anIntArray239[0] = arg1;
		@Pc(22) int local22 = this.method20009(286295394);
		@Pc(27) Class472 local27 = Class472.method29711(this.method24241().aClass472_61);
		local27.aFloat325 = local22 * 256 + this.anIntArray240[0] * 512;
		local27.aFloat327 = local22 * 256 + this.anIntArray239[0] * 512;
		this.method24236(local27);
		local27.method29713();
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == this) {
			client.aClass532_1.method30713((byte) -10).method33184(-1168006360);
		}
		if (this.aClass674_3 != null) {
			this.aClass674_3.method33273();
		}
	}

	@OriginalMember(owner = "client!aqk", name = "iw", descriptor = "(Z)Ljava/lang/String;")
	public String method20072(@OriginalArg(0) boolean arg0) {
		return arg0 ? this.aString81 : this.aString82;
	}

	@OriginalMember(owner = "client!aqk", name = "ce", descriptor = "(I)Lclient!su;")
	@Override
	public Class561 method19983(@OriginalArg(0) int arg0) {
		if (this.aClass561_3 != null) {
			if (this.aClass561_3.aString236 == null) {
				return null;
			}
			if (client.anInt3561 * 2112576331 == 0 || client.anInt3561 * 2112576331 == 3 || client.anInt3561 * 2112576331 == 1 && Class260.method26250(this.aString82, 1492845279)) {
				return this.aClass561_3;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aqk", name = "hc", descriptor = "(Ljava/lang/String;III)V")
	public void method20073(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method19980(arg0, arg1, arg2, Class451.method29129((byte) 3) * Class93_Sub26.aClass645_15.anInt5953 * -678073063, 997705147);
	}

	@OriginalMember(owner = "client!aqk", name = "e", descriptor = "(I)Lclient!jl;")
	@Override
	public Class363 method19958(@OriginalArg(0) int arg0) {
		return Class363.aClass363_1;
	}

	@OriginalMember(owner = "client!aqk", name = "n", descriptor = "(I)I")
	@Override
	public int method19953(@OriginalArg(0) int arg0) {
		return this.anInt2768 * -1688488127;
	}

	@OriginalMember(owner = "client!aqk", name = "m", descriptor = "(B)Lclient!akt;")
	@Override
	public CoordFine method19950(@OriginalArg(0) byte arg0) {
		@Pc(3) Class611 local3 = client.aClass532_1.method30624(1708873229);
		return Class393.method28502(this.aByte100, (int) this.method24241().aClass472_61.aFloat325 + local3.anInt5784 * 1114227200, -((int) this.method24241().aClass472_61.aFloat326), (int) this.method24241().aClass472_61.aFloat327 + local3.anInt5785 * 1116707328, (short) 7825);
	}

	@OriginalMember(owner = "client!aqk", name = "eq", descriptor = "()Lclient!su;")
	@Override
	public Class561 method19992() {
		if (this.aClass561_3 != null) {
			if (this.aClass561_3.aString236 == null) {
				return null;
			}
			if (client.anInt3561 * 2112576331 == 0 || client.anInt3561 * 2112576331 == 3 || client.anInt3561 * 2112576331 == 1 && Class260.method26250(this.aString82, 1504807681)) {
				return this.aClass561_3;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aqk", name = "f", descriptor = "(B)Lclient!ox;")
	@Override
	public Class472 method19949(@OriginalArg(0) byte arg0) {
		return Class472.method29709();
	}

	@OriginalMember(owner = "client!aqk", name = "cx", descriptor = "(I)I")
	@Override
	public int method20035(@OriginalArg(0) int arg0) {
		return -(this.anInt2768 * -1688488127) - 1;
	}

	@OriginalMember(owner = "client!aqk", name = "w", descriptor = "()Lclient!jl;")
	@Override
	public Class363 method19954() {
		return Class363.aClass363_1;
	}

	@OriginalMember(owner = "client!aqk", name = "ic", descriptor = "()Z")
	public boolean method20074() {
		return this.aClass658_1 != null;
	}

	@OriginalMember(owner = "client!aqk", name = "u", descriptor = "()Lclient!akt;")
	@Override
	public CoordFine method19952() {
		@Pc(3) Class611 local3 = client.aClass532_1.method30624(1842997006);
		return Class393.method28502(this.aByte100, (int) this.method24241().aClass472_61.aFloat325 + local3.anInt5784 * 1114227200, -((int) this.method24241().aClass472_61.aFloat326), (int) this.method24241().aClass472_61.aFloat327 + local3.anInt5785 * 1116707328, (short) -10789);
	}

	@OriginalMember(owner = "client!aqk", name = "z", descriptor = "()Lclient!akt;")
	@Override
	public CoordFine method19956() {
		@Pc(3) Class611 local3 = client.aClass532_1.method30624(1817587508);
		return Class393.method28502(this.aByte100, (int) this.method24241().aClass472_61.aFloat325 + local3.anInt5784 * 1114227200, -((int) this.method24241().aClass472_61.aFloat326), (int) this.method24241().aClass472_61.aFloat327 + local3.anInt5785 * 1116707328, (short) 8650);
	}

	@OriginalMember(owner = "client!aqk", name = "p", descriptor = "()Lclient!akt;")
	@Override
	public CoordFine method19955() {
		@Pc(3) Class611 local3 = client.aClass532_1.method30624(2128852291);
		return Class393.method28502(this.aByte100, (int) this.method24241().aClass472_61.aFloat325 + local3.anInt5784 * 1114227200, -((int) this.method24241().aClass472_61.aFloat326), (int) this.method24241().aClass472_61.aFloat327 + local3.anInt5785 * 1116707328, (short) -6992);
	}

	@OriginalMember(owner = "client!aqk", name = "c", descriptor = "()Lclient!ox;")
	@Override
	public Class472 method19959() {
		return Class472.method29709();
	}

	@OriginalMember(owner = "client!aqk", name = "ii", descriptor = "(IIB)V")
	void method20075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.anInt2763 * -846948133 < this.anIntArray240.length - 1) {
			this.anInt2763 += 1975362387;
		}
		for (@Pc(20) int local20 = this.anInt2763 * -846948133; local20 > 0; local20--) {
			this.anIntArray240[local20] = this.anIntArray240[local20 - 1];
			this.anIntArray239[local20] = this.anIntArray239[local20 - 1];
			this.aByteArray47[local20] = this.aByteArray47[local20 - 1];
		}
		this.anIntArray240[0] = arg0;
		this.anIntArray239[0] = arg1;
		this.aByteArray47[0] = arg2;
	}

	@OriginalMember(owner = "client!aqk", name = "r", descriptor = "()Lclient!ox;")
	@Override
	public Class472 method19960() {
		return Class472.method29709();
	}

	@OriginalMember(owner = "client!aqk", name = "iv", descriptor = "(Lclient!alw;)V")
	public void method20076(@OriginalArg(0) Class93_Sub41 arg0) {
		arg0.anInt3070 = 0;
		@Pc(6) int local6 = arg0.method22425((short) 16384);
		for (@Pc(8) int local8 = 0; local8 < this.anIntArray242.length; local8++) {
			if ((local6 & 0x1 << local8) == 0) {
				this.anIntArray242[local8] = -1;
				this.anIntArray243[local8] = -1;
			} else {
				@Pc(23) int local23 = arg0.method22425((short) 16384);
				@Pc(27) int local27 = arg0.method22427(-1434290800);
				this.anIntArray242[local8] = local23;
				this.anIntArray243[local8] = local27;
			}
		}
	}

	@OriginalMember(owner = "client!aqk", name = "k", descriptor = "(I)Lclient!ov;")
	@Override
	public Class471 method19951(@OriginalArg(0) int arg0) {
		@Pc(1) Class471 local1 = Class471.method29702();
		local1.method29648(Class464.method29463(this.aClass523_7.anInt5384 * -1093332503), 0.0F, 0.0F);
		return local1;
	}

	@OriginalMember(owner = "client!aqk", name = "fb", descriptor = "(Lclient!dh;)Lclient!uq;")
	@Override
	public Class600 method24296(@OriginalArg(0) Class104 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aqk", name = "fo", descriptor = "(Lclient!dh;)Lclient!tl;")
	@Override
	Class573 method24278(@OriginalArg(0) Class104 arg0) {
		if (this.aClass658_1 == null || !this.method20063(arg0, 2048, (byte) -106)) {
			return null;
		}
		@Pc(14) Class470 local14 = arg0.method20520();
		@Pc(17) Class470 local17 = this.method24238();
		@Pc(20) Class458 local20 = this.method24241();
		@Pc(25) int local25 = this.aClass523_7.method30544(1481010877);
		@Pc(46) Class572 local46 = this.aClass585_23.aClass572ArrayArrayArray3[this.aByte100][(int) local20.aClass472_61.aFloat325 >> 9][(int) local20.aClass472_61.aFloat327 >> 9];
		if (local46 == null || local46.aClass132_Sub1_Sub4_1 == null) {
			this.anInt2770 = (int) ((float) (this.anInt2770 * -78148565) - (float) (this.anInt2770 * -78148565) / 10.0F) * 1068028547;
		} else {
			@Pc(61) int local61 = this.anInt2770 * -78148565 - local46.aClass132_Sub1_Sub4_1.aShort97;
			this.anInt2770 = (int) ((float) (this.anInt2770 * -78148565) - (float) local61 / 10.0F) * 1068028547;
		}
		local14.method29545(local17);
		local14.method29568(0.0F, (float) (-20 - this.anInt2770 * -78148565), 0.0F);
		@Pc(111) Class573 local111 = null;
		this.aBoolean455 = false;
		if (Class51.aClass93_Sub36_1.aClass166_Sub21_1.method15819(-194221532) == 1) {
			@Pc(124) Class622 local124 = this.method19978(-2004119314);
			if (local124.aBoolean853 && (this.aClass658_1.anInt5978 * 1405397749 == -1 || ((Class336) Class162.aClass32_Sub3_2.method18273(this.aClass658_1.anInt5978 * 1405397749, -2024494595)).aBoolean718)) {
				@Pc(160) Class19 local160 = this.aClass19_3.method23564(-733521141) && this.aClass19_3.method23573((byte) 0) ? this.aClass19_3 : null;
				@Pc(176) Class19_Sub3 local176 = this.aClass19_Sub3_3.method23564(-1570163943) && (!this.aClass19_Sub3_3.aBoolean380 || local160 == null) ? this.aClass19_Sub3_3 : null;
				@Pc(179) short local179 = Class93_Sub26.aClass645_15.aShort184;
				@Pc(182) byte local182 = Class93_Sub26.aClass645_15.aByte174;
				if (this.aClass658_1.anInt5978 * 1405397749 != -1) {
					local179 = ((Class336) Class162.aClass32_Sub3_2.method18273(this.aClass658_1.anInt5978 * 1405397749, 150261234)).aShort167;
					local182 = ((Class336) Class162.aClass32_Sub3_2.method18273(this.aClass658_1.anInt5978 * 1405397749, -1105453787)).aByte131;
				}
				@Pc(213) Class109 local213 = null;
				if (local179 > -1 && Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15666(1944709686) == 1) {
					local213 = Class270.method26391(arg0, local25, this.anInt2767 * -1595449153, this.anInt2790 * 1471665235, this.anInt2769 * 1367159499, this.aClass109Array3[0], local179, local182, local176 == null ? local160 : local176, -120264559);
				} else {
					local213 = Class365.method28102(arg0, local25, this.anInt2767 * -1595449153, this.anInt2790 * 1471665235, this.anInt2769 * 1367159499, 1, this.aClass109Array3[0], 0, 0, 160, 240, local176 == null ? local160 : local176, (byte) 67);
				}
				if (local213 != null) {
					if (this.aClass241Array21 == null || this.aClass241Array21.length < this.aClass109Array3.length + 1) {
						this.method24288(this.aClass109Array3.length + 1, 2014500188);
					}
					local111 = Class125_Sub1.method9214(true, 373147274);
					this.aBoolean455 = true;
					arg0.method20530(false);
					local213.method6947(local14, this.aClass241Array21[this.aClass109Array3.length], 0);
					arg0.method20530(true);
				}
			}
		}
		@Pc(336) int local336;
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == this) {
			for (local336 = client.aClass173Array1.length - 1; local336 >= 0; local336--) {
				@Pc(342) Class173 local342 = client.aClass173Array1[local336];
				if (local342 != null && local342.anInt3252 * -1455617703 != -1) {
					@Pc(384) int local384;
					if (local342.anInt3247 * 1661685955 == 1) {
						@Pc(365) Class93_Sub15 local365 = (Class93_Sub15) client.aClass16_18.method215((long) (local342.anInt3246 * -1095042687));
						if (local365 != null) {
							@Pc(372) Class132_Sub1_Sub1_Sub1_Sub1 local372 = (Class132_Sub1_Sub1_Sub1_Sub1) local365.anObject5;
							@Pc(380) Class472 local380 = Class472.method29755(local372.method24241().aClass472_61, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24241().aClass472_61);
							local384 = (int) local380.aFloat325;
							@Pc(388) int local388 = (int) local380.aFloat327;
							this.method20062(arg0, local14, this.aClass109Array3[0], (long) local384, (long) local388, local342.anInt3252 * -1455617703, 92160000L);
						}
					}
					if (local342.anInt3247 * 1661685955 == 2) {
						@Pc(415) Class472 local415 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24241().aClass472_61;
						@Pc(425) long local425 = (long) (local342.anInt3248 * 846615897 - (int) local415.aFloat325);
						@Pc(435) long local435 = (long) (local342.anInt3249 * 166908561 - (int) local415.aFloat327);
						@Pc(443) long local443 = (long) (local342.anInt3250 * -1294740227 << 9);
						@Pc(447) long local447 = local443 * local443;
						this.method20062(arg0, local14, this.aClass109Array3[0], local425, local435, local342.anInt3252 * -1455617703, local447);
					}
					if (local342.anInt3247 * 1661685955 == 10 && local342.anInt3246 * -1095042687 >= 0 && local342.anInt3246 * -1095042687 < client.aClass132_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(487) Class132_Sub1_Sub1_Sub1_Sub2 local487 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local342.anInt3246 * -1095042687];
						if (local487 != null) {
							@Pc(497) Class472 local497 = Class472.method29755(local487.method24241().aClass472_61, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24241().aClass472_61);
							@Pc(501) int local501 = (int) local497.aFloat325;
							local384 = (int) local497.aFloat327;
							this.method20062(arg0, local14, this.aClass109Array3[0], (long) local501, (long) local384, local342.anInt3252 * -1455617703, 92160000L);
						}
					}
				}
			}
		}
		local14.method29545(local17);
		local14.method29568(0.0F, (float) (-5 - -78148565 * this.anInt2770), 0.0F);
		if (this.aClass241Array21 == null || this.aClass241Array21.length < this.aClass109Array3.length) {
			this.method24288(this.aClass109Array3.length, 655620753);
		}
		if (local111 == null) {
			local111 = Class125_Sub1.method9214(true, 373147274);
		}
		this.method20033(arg0, this.aClass109Array3, local14, false, -96136786);
		for (local336 = 0; local336 < this.aClass109Array3.length; local336++) {
			if (this.aClass109Array3[local336] == null) {
				this.aClass241Array21[local336].aBoolean667 = false;
			} else {
				this.aClass109Array3[local336].method6947(local14, this.aClass241Array21[local336], Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == this ? 1 : 0);
			}
		}
		if (this.aClass674_3 != null) {
			@Pc(614) Class229 local614 = this.aClass674_3.method33308();
			arg0.method20509(local614);
		}
		for (local336 = 0; local336 < this.aClass109Array3.length; local336++) {
			if (this.aClass109Array3[local336] != null) {
				this.aBoolean455 |= this.aClass109Array3[local336].method6865();
			}
			this.aClass109Array3[local336] = null;
		}
		this.anInt2761 = client.anInt3495 * 706144655;
		return local111;
	}

	@OriginalMember(owner = "client!aqk", name = "fy", descriptor = "(Lclient!dh;)V")
	@Override
	void method24306(@OriginalArg(0) Class104 arg0) {
		if (this.aClass658_1 == null || !this.aBoolean453 && !this.method20063(arg0, 0, (byte) -117)) {
			return;
		}
		@Pc(16) Class470 local16 = arg0.method20520();
		local16.method29546(this.method24241());
		local16.method29568(0.0F, -5.0F, 0.0F);
		this.method20033(arg0, this.aClass109Array3, local16, this.aBoolean453, -1686723130);
		for (@Pc(36) int local36 = 0; local36 < this.aClass109Array3.length; local36++) {
			this.aClass109Array3[local36] = null;
		}
	}

	@OriginalMember(owner = "client!aqk", name = "fe", descriptor = "(Lclient!dh;)V")
	@Override
	void method24315(@OriginalArg(0) Class104 arg0) {
		if (this.aClass658_1 == null || !this.aBoolean453 && !this.method20063(arg0, 0, (byte) -19)) {
			return;
		}
		@Pc(16) Class470 local16 = arg0.method20520();
		local16.method29546(this.method24241());
		local16.method29568(0.0F, -5.0F, 0.0F);
		this.method20033(arg0, this.aClass109Array3, local16, this.aBoolean453, 709632706);
		for (@Pc(36) int local36 = 0; local36 < this.aClass109Array3.length; local36++) {
			this.aClass109Array3[local36] = null;
		}
	}

	@OriginalMember(owner = "client!aqk", name = "fk", descriptor = "(Lclient!dh;II)Z")
	@Override
	boolean method24302(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass658_1 == null || !this.method20063(arg0, 131072, (byte) -83)) {
			return false;
		}
		@Pc(14) Class470 local14 = this.method24238();
		@Pc(16) boolean local16 = false;
		@Pc(18) int local18;
		for (local18 = 0; local18 < this.aClass109Array3.length; local18++) {
			if (this.aClass109Array3[local18] != null && this.aClass109Array3[local18].aBoolean161 && this.aClass109Array3[local18].method6859(arg1, arg2, local14, true, 0)) {
				local16 = true;
				break;
			}
		}
		for (local18 = 0; local18 < this.aClass109Array3.length; local18++) {
			this.aClass109Array3[local18] = null;
		}
		return local16;
	}

	@OriginalMember(owner = "client!aqk", name = "fh", descriptor = "()Z")
	@Override
	boolean method24284() {
		return false;
	}

	@OriginalMember(owner = "client!aqk", name = "ho", descriptor = "(Lclient!alw;B)V")
	public void method20077(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		this.aByte75 = arg1;
		@Pc(4) int local4 = -1;
		this.anInt2802 = 0;
		@Pc(12) int[] local12 = new int[Class113.aClass651_2.anIntArray508.length];
		@Pc(17) Class48[] local17 = new Class48[Class113.aClass651_2.anIntArray508.length];
		@Pc(22) Class47[] local22 = new Class47[Class113.aClass651_2.anIntArray508.length];
		@Pc(24) int local24;
		@Pc(39) int local39;
		@Pc(50) int local50;
		@Pc(56) int local56;
		@Pc(101) int local101;
		for (local24 = 0; local24 < Class113.aClass651_2.anIntArray508.length; local24++) {
			if (Class113.aClass651_2.anIntArray508[local24] != 1) {
				local39 = arg0.method22425((short) 16384);
				if (local39 == 0) {
					local12[local24] = 0;
				} else {
					local50 = arg0.method22425((short) 16384);
					local56 = (local39 << 8) + local50;
					if (local24 == 0 && local56 == 65535) {
						local4 = arg0.method22448(-1073574661);
						this.anInt2802 = arg0.method22425((short) 16384) * -1228663053;
						break;
					}
					if (local56 >= 2048) {
						local56 -= 2048;
						local12[local24] = local56 | 0x40000000;
						local22[local24] = (Class47) Class277.aClass32_Sub12_1.method18273(local56, 1886973743);
						local101 = local22[local24].anInt180 * -2011521841;
						if (local101 != 0) {
							this.anInt2802 = local101 * -1228663053;
						}
					} else {
						local12[local24] = local56 - 256 | Integer.MIN_VALUE;
					}
				}
			}
		}
		if (local4 == -1) {
			local24 = arg0.method22427(-1434290800);
			local39 = 0;
			for (local50 = 0; local50 < Class113.aClass651_2.anIntArray508.length; local50++) {
				if (Class113.aClass651_2.anIntArray508[local50] == 0) {
					if ((local24 & 0x1 << local39) != 0) {
						local17[local50] = Class180.method24533(local22[local50], arg0, -552168352);
					}
					local39++;
				}
			}
		}
		@Pc(163) int[] local163 = new int[10];
		for (local39 = 0; local39 < 10; local39++) {
			local50 = arg0.method22425((short) 16384);
			if (Class111.aShortArrayArrayArray3.length < 1 || local50 < 0 || local50 >= Class111.aShortArrayArrayArray3[local39][0].length) {
				local50 = 0;
			}
			local163[local39] = local50;
		}
		@Pc(197) int[] local197 = new int[10];
		for (local50 = 0; local50 < 10; local50++) {
			local56 = arg0.method22425((short) 16384);
			if (Class79_Sub1_Sub2.aShortArrayArrayArray1.length < 1 || local56 < 0 || local56 >= Class79_Sub1_Sub2.aShortArrayArrayArray1[local50][0].length) {
				local56 = 0;
			}
			local197[local50] = local56;
		}
		this.anInt2809 = arg0.method22427(-1434290800) * -1126559863;
		if (this.aClass658_1 == null) {
			this.aClass658_1 = new Class658();
		}
		local50 = this.aClass658_1.anInt5978 * 1405397749;
		@Pc(254) int[] local254 = this.aClass658_1.anIntArray513;
		this.aClass658_1.method32940(this.method19979((short) 560), local12, local17, local163, local197, this.aByte75 == 1, local4, -2142673631);
		if (local4 != local50) {
			@Pc(281) Class472 local281 = Class472.method29711(this.method24241().aClass472_61);
			local281.aFloat325 = (this.anIntArray240[0] << 9) + (this.method20009(-776900260) << 8);
			local281.aFloat327 = (this.anIntArray239[0] << 9) + (this.method20009(-1571487427) << 8);
			this.method24236(local281);
			local281.method29713();
		}
		if (client.anInt3513 * -859840571 == this.anInt2768 * -1688488127 && local254 != null) {
			for (local101 = 0; local101 < local163.length; local101++) {
				if (local254[local101] != local163[local101]) {
					Class277.aClass32_Sub12_1.method17084(-1236631597);
					break;
				}
			}
		}
		if (this.aClass674_3 != null) {
			this.aClass674_3.method33273();
		}
		if (!this.aClass19_Sub3_3.method23564(-643099117) || !this.aClass19_Sub3_3.aBoolean380) {
			return;
		}
		@Pc(365) Class622 local365 = this.method19978(1416158046);
		if (!local365.method32310(this.aClass19_Sub3_3.method23566((byte) 63), -1350635611)) {
			this.aClass19_Sub3_3.method23580(-1, 346309464);
			this.aClass19_Sub3_3.aBoolean380 = false;
		}
	}

	@OriginalMember(owner = "client!aqk", name = "gk", descriptor = "()V")
	@Override
	void method24309() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqk", name = "hf", descriptor = "(Lclient!alw;I)V")
	public void method20078(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt3070 = 0;
		@Pc(6) int local6 = arg0.method22425((short) 16384);
		@Pc(11) byte local11 = (byte) (local6 & 0x1);
		@Pc(20) boolean local20 = (local6 & 0x4) != 0;
		@Pc(24) int local24 = super.method20009(1308627529);
		this.method19973((local6 >> 3 & 0x7) + 1, -2142170693);
		@Pc(43) boolean local43 = (local6 & 0x40) != 0;
		@Pc(48) Class472 local48 = Class472.method29711(this.method24241().aClass472_61);
		local48.aFloat325 += this.method20009(461404960) - local24 << 8;
		local48.aFloat327 += this.method20009(2041917967) - local24 << 8;
		this.method24236(local48);
		local48.method29713();
		@Pc(100) int local100;
		if (local43) {
			this.anInt2798 = arg0.method22644((byte) -122) * 1608377605;
			local100 = local11 == 0 ? Class659.aClass633_1.anInt5886 * 503316691 : Class659.aClass633_1.anInt5885 * -1032447795;
			this.aString80 = ((Class39) Class19.aClass32_Sub7_5.method18273(local100, 984053557)).method749(this.anInt2798 * 243539917, -726344232);
		} else {
			this.anInt2798 = -1608377605;
			this.aString80 = null;
		}
		this.aClass659_1 = (Class659) Class107.method18131(Class659.method32977(-675607432), arg0.method22426(675186995), -1915563430);
		if (Class693.aClass693_8 == Class280.aClass693_1 && client.anInt3514 * 2055688893 >= 2) {
			this.aClass659_1 = Class659.aClass659_3;
		}
		this.method20070(arg0, local11, -237524841);
		this.aString81 = arg0.method22439(1287782726);
		this.aString82 = this.aString81;
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == this) {
			RuntimeException_Sub1.aString116 = this.aString81;
		}
		this.anInt2804 = arg0.method22425((short) 16384) * 360524567;
		if (local20) {
			this.anInt2801 = arg0.method22427(-1434290800) * -668773121;
			if (this.anInt2801 * -526144769 == 65535) {
				this.anInt2801 = 668773121;
			}
			this.anInt2810 = this.anInt2804 * 925838279;
			this.anInt2800 = 253594077;
		} else {
			this.anInt2801 = 0;
			this.anInt2810 = arg0.method22425((short) 16384) * -1799201823;
			this.anInt2800 = arg0.method22425((short) 16384) * -253594077;
			if (this.anInt2800 * -391321205 == 255) {
				this.anInt2800 = 253594077;
			}
		}
		local100 = this.anInt2807 * -1513940767;
		this.anInt2807 = arg0.method22425((short) 16384) * 1445735201;
		if (this.anInt2807 * -1513940767 == 0) {
			Class378.method28252(this, -1314427900);
			return;
		}
		@Pc(245) int local245 = this.anInt2803 * 1706069295;
		@Pc(250) int local250 = this.anInt2797 * 479956847;
		@Pc(255) int local255 = this.anInt2805 * 1263335603;
		@Pc(260) int local260 = this.anInt2806 * -2115122027;
		@Pc(265) int local265 = this.anInt2808 * -2118206535;
		this.anInt2803 = arg0.method22427(-1434290800) * -1606428209;
		this.anInt2797 = arg0.method22427(-1434290800) * -875384945;
		this.anInt2805 = arg0.method22427(-1434290800) * 672560763;
		this.anInt2806 = arg0.method22427(-1434290800) * -1686331715;
		this.anInt2808 = arg0.method22425((short) 16384) * 715315849;
		if (local100 != this.anInt2807 * -1513940767 || this.anInt2803 * 1706069295 != local245 || local250 != this.anInt2797 * 479956847 || this.anInt2805 * 1263335603 != local255 || this.anInt2806 * -2115122027 != local260 || this.anInt2808 * -2118206535 != local265) {
			Class661.method33023(this, -519066684);
		}
	}

	@OriginalMember(owner = "client!aqk", name = "gl", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	void method24307(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqk", name = "ie", descriptor = "()V")
	void method20079() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anIntArray242.length; local1++) {
			this.anIntArray242[local1] = -1;
		}
		for (local1 = 0; local1 < this.anIntArray243.length; local1++) {
			this.anIntArray243[local1] = -1;
		}
	}

	@OriginalMember(owner = "client!aqk", name = "d", descriptor = "()Lclient!ov;")
	@Override
	public Class471 method19948() {
		@Pc(1) Class471 local1 = Class471.method29702();
		local1.method29648(Class464.method29463(this.aClass523_7.anInt5384 * -1093332503), 0.0F, 0.0F);
		return local1;
	}

	@OriginalMember(owner = "client!aqk", name = "dl", descriptor = "()I")
	@Override
	public int method19994() {
		return this.aClass658_1 == null || this.aClass658_1.anInt5978 * 1405397749 == -1 ? super.method20009(1640004791) : ((Class336) Class162.aClass32_Sub3_2.method18273(this.aClass658_1.anInt5978 * 1405397749, -705767290)).anInt4195 * 447008399;
	}

	@OriginalMember(owner = "client!aqk", name = "ij", descriptor = "(Lclient!alw;)V")
	public void method20080(@OriginalArg(0) Class93_Sub41 arg0) {
		arg0.anInt3070 = 0;
		@Pc(6) int local6 = arg0.method22425((short) 16384);
		@Pc(11) byte local11 = (byte) (local6 & 0x1);
		@Pc(20) boolean local20 = (local6 & 0x4) != 0;
		@Pc(24) int local24 = super.method20009(1469152571);
		this.method19973((local6 >> 3 & 0x7) + 1, -2142170693);
		@Pc(43) boolean local43 = (local6 & 0x40) != 0;
		@Pc(48) Class472 local48 = Class472.method29711(this.method24241().aClass472_61);
		local48.aFloat325 += this.method20009(200059129) - local24 << 8;
		local48.aFloat327 += this.method20009(-647952265) - local24 << 8;
		this.method24236(local48);
		local48.method29713();
		@Pc(100) int local100;
		if (local43) {
			this.anInt2798 = arg0.method22644((byte) -41) * 1608377605;
			local100 = local11 == 0 ? Class659.aClass633_1.anInt5886 * 503316691 : Class659.aClass633_1.anInt5885 * -1032447795;
			this.aString80 = ((Class39) Class19.aClass32_Sub7_5.method18273(local100, 418490072)).method749(this.anInt2798 * 243539917, -1744984977);
		} else {
			this.anInt2798 = -1608377605;
			this.aString80 = null;
		}
		this.aClass659_1 = (Class659) Class107.method18131(Class659.method32977(-675607432), arg0.method22426(729387973), -1915563430);
		if (Class693.aClass693_8 == Class280.aClass693_1 && client.anInt3514 * 2055688893 >= 2) {
			this.aClass659_1 = Class659.aClass659_3;
		}
		this.method20070(arg0, local11, -237524841);
		this.aString81 = arg0.method22439(56444125);
		this.aString82 = this.aString81;
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == this) {
			RuntimeException_Sub1.aString116 = this.aString81;
		}
		this.anInt2804 = arg0.method22425((short) 16384) * 360524567;
		if (local20) {
			this.anInt2801 = arg0.method22427(-1434290800) * -668773121;
			if (this.anInt2801 * -526144769 == 65535) {
				this.anInt2801 = 668773121;
			}
			this.anInt2810 = this.anInt2804 * 925838279;
			this.anInt2800 = 253594077;
		} else {
			this.anInt2801 = 0;
			this.anInt2810 = arg0.method22425((short) 16384) * -1799201823;
			this.anInt2800 = arg0.method22425((short) 16384) * -253594077;
			if (this.anInt2800 * -391321205 == 255) {
				this.anInt2800 = 253594077;
			}
		}
		local100 = this.anInt2807 * -1513940767;
		this.anInt2807 = arg0.method22425((short) 16384) * 1445735201;
		if (this.anInt2807 * -1513940767 == 0) {
			Class378.method28252(this, -1314427900);
			return;
		}
		@Pc(245) int local245 = this.anInt2803 * 1706069295;
		@Pc(250) int local250 = this.anInt2797 * 479956847;
		@Pc(255) int local255 = this.anInt2805 * 1263335603;
		@Pc(260) int local260 = this.anInt2806 * -2115122027;
		@Pc(265) int local265 = this.anInt2808 * -2118206535;
		this.anInt2803 = arg0.method22427(-1434290800) * -1606428209;
		this.anInt2797 = arg0.method22427(-1434290800) * -875384945;
		this.anInt2805 = arg0.method22427(-1434290800) * 672560763;
		this.anInt2806 = arg0.method22427(-1434290800) * -1686331715;
		this.anInt2808 = arg0.method22425((short) 16384) * 715315849;
		if (local100 != this.anInt2807 * -1513940767 || this.anInt2803 * 1706069295 != local245 || local250 != this.anInt2797 * 479956847 || this.anInt2805 * 1263335603 != local255 || this.anInt2806 * -2115122027 != local260 || this.anInt2808 * -2118206535 != local265) {
			Class661.method33023(this, 804935453);
		}
	}

	@OriginalMember(owner = "client!aqk", name = "el", descriptor = "()I")
	@Override
	int method19968() {
		return this.anInt2809 * 506271417;
	}

	@OriginalMember(owner = "client!aqk", name = "ep", descriptor = "()I")
	@Override
	public int method20041() {
		return -1;
	}

	@OriginalMember(owner = "client!aqk", name = "ek", descriptor = "()Z")
	@Override
	public boolean method20032() {
		return Class93_Sub26.aClass645_15.aBoolean867;
	}

	@OriginalMember(owner = "client!aqk", name = "ih", descriptor = "(IIB)V")
	void method20081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.anInt2763 * -846948133 < this.anIntArray240.length - 1) {
			this.anInt2763 += 1975362387;
		}
		for (@Pc(20) int local20 = this.anInt2763 * -846948133; local20 > 0; local20--) {
			this.anIntArray240[local20] = this.anIntArray240[local20 - 1];
			this.anIntArray239[local20] = this.anIntArray239[local20 - 1];
			this.aByteArray47[local20] = this.aByteArray47[local20 - 1];
		}
		this.anIntArray240[0] = arg0;
		this.anIntArray239[0] = arg1;
		this.aByteArray47[0] = arg2;
	}

	@OriginalMember(owner = "client!aqk", name = "hz", descriptor = "(Lclient!alw;B)V")
	public void method20082(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		this.aByte75 = arg1;
		@Pc(4) int local4 = -1;
		this.anInt2802 = 0;
		@Pc(12) int[] local12 = new int[Class113.aClass651_2.anIntArray508.length];
		@Pc(17) Class48[] local17 = new Class48[Class113.aClass651_2.anIntArray508.length];
		@Pc(22) Class47[] local22 = new Class47[Class113.aClass651_2.anIntArray508.length];
		@Pc(24) int local24;
		@Pc(39) int local39;
		@Pc(50) int local50;
		@Pc(56) int local56;
		@Pc(101) int local101;
		for (local24 = 0; local24 < Class113.aClass651_2.anIntArray508.length; local24++) {
			if (Class113.aClass651_2.anIntArray508[local24] != 1) {
				local39 = arg0.method22425((short) 16384);
				if (local39 == 0) {
					local12[local24] = 0;
				} else {
					local50 = arg0.method22425((short) 16384);
					local56 = (local39 << 8) + local50;
					if (local24 == 0 && local56 == 65535) {
						local4 = arg0.method22448(-223841122);
						this.anInt2802 = arg0.method22425((short) 16384) * -1228663053;
						break;
					}
					if (local56 >= 2048) {
						local56 -= 2048;
						local12[local24] = local56 | 0x40000000;
						local22[local24] = (Class47) Class277.aClass32_Sub12_1.method18273(local56, 899886084);
						local101 = local22[local24].anInt180 * -2011521841;
						if (local101 != 0) {
							this.anInt2802 = local101 * -1228663053;
						}
					} else {
						local12[local24] = local56 - 256 | Integer.MIN_VALUE;
					}
				}
			}
		}
		if (local4 == -1) {
			local24 = arg0.method22427(-1434290800);
			local39 = 0;
			for (local50 = 0; local50 < Class113.aClass651_2.anIntArray508.length; local50++) {
				if (Class113.aClass651_2.anIntArray508[local50] == 0) {
					if ((local24 & 0x1 << local39) != 0) {
						local17[local50] = Class180.method24533(local22[local50], arg0, -1093558655);
					}
					local39++;
				}
			}
		}
		@Pc(163) int[] local163 = new int[10];
		for (local39 = 0; local39 < 10; local39++) {
			local50 = arg0.method22425((short) 16384);
			if (Class111.aShortArrayArrayArray3.length < 1 || local50 < 0 || local50 >= Class111.aShortArrayArrayArray3[local39][0].length) {
				local50 = 0;
			}
			local163[local39] = local50;
		}
		@Pc(197) int[] local197 = new int[10];
		for (local50 = 0; local50 < 10; local50++) {
			local56 = arg0.method22425((short) 16384);
			if (Class79_Sub1_Sub2.aShortArrayArrayArray1.length < 1 || local56 < 0 || local56 >= Class79_Sub1_Sub2.aShortArrayArrayArray1[local50][0].length) {
				local56 = 0;
			}
			local197[local50] = local56;
		}
		this.anInt2809 = arg0.method22427(-1434290800) * -1126559863;
		if (this.aClass658_1 == null) {
			this.aClass658_1 = new Class658();
		}
		local50 = this.aClass658_1.anInt5978 * 1405397749;
		@Pc(254) int[] local254 = this.aClass658_1.anIntArray513;
		this.aClass658_1.method32940(this.method19979((short) 560), local12, local17, local163, local197, this.aByte75 == 1, local4, -2134301255);
		if (local4 != local50) {
			@Pc(281) Class472 local281 = Class472.method29711(this.method24241().aClass472_61);
			local281.aFloat325 = (this.anIntArray240[0] << 9) + (this.method20009(-674518666) << 8);
			local281.aFloat327 = (this.anIntArray239[0] << 9) + (this.method20009(-216590235) << 8);
			this.method24236(local281);
			local281.method29713();
		}
		if (client.anInt3513 * -859840571 == this.anInt2768 * -1688488127 && local254 != null) {
			for (local101 = 0; local101 < local163.length; local101++) {
				if (local254[local101] != local163[local101]) {
					Class277.aClass32_Sub12_1.method17084(-1357670552);
					break;
				}
			}
		}
		if (this.aClass674_3 != null) {
			this.aClass674_3.method33273();
		}
		if (!this.aClass19_Sub3_3.method23564(-1903518071) || !this.aClass19_Sub3_3.aBoolean380) {
			return;
		}
		@Pc(365) Class622 local365 = this.method19978(-1330709119);
		if (!local365.method32310(this.aClass19_Sub3_3.method23566((byte) 99), -1332944022)) {
			this.aClass19_Sub3_3.method23580(-1, -108249076);
			this.aClass19_Sub3_3.aBoolean380 = false;
		}
	}

	@OriginalMember(owner = "client!aqk", name = "fj", descriptor = "()I")
	@Override
	public int method20051() {
		return -(this.anInt2768 * -1688488127) - 1;
	}

	@OriginalMember(owner = "client!aqk", name = "fd", descriptor = "()I")
	@Override
	public int method20052() {
		return -(this.anInt2768 * -1688488127) - 1;
	}

	@OriginalMember(owner = "client!aqk", name = "iy", descriptor = "(IIB)V")
	void method20083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.anInt2763 * -846948133 < this.anIntArray240.length - 1) {
			this.anInt2763 += 1975362387;
		}
		for (@Pc(20) int local20 = this.anInt2763 * -846948133; local20 > 0; local20--) {
			this.anIntArray240[local20] = this.anIntArray240[local20 - 1];
			this.anIntArray239[local20] = this.anIntArray239[local20 - 1];
			this.aByteArray47[local20] = this.aByteArray47[local20 - 1];
		}
		this.anIntArray240[0] = arg0;
		this.anIntArray239[0] = arg1;
		this.aByteArray47[0] = arg2;
	}

	@OriginalMember(owner = "client!aqk", name = "hj", descriptor = "(Lclient!alw;B)V")
	public void method20084(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		this.aByte75 = arg1;
		@Pc(4) int local4 = -1;
		this.anInt2802 = 0;
		@Pc(12) int[] local12 = new int[Class113.aClass651_2.anIntArray508.length];
		@Pc(17) Class48[] local17 = new Class48[Class113.aClass651_2.anIntArray508.length];
		@Pc(22) Class47[] local22 = new Class47[Class113.aClass651_2.anIntArray508.length];
		@Pc(24) int local24;
		@Pc(39) int local39;
		@Pc(50) int local50;
		@Pc(56) int local56;
		@Pc(101) int local101;
		for (local24 = 0; local24 < Class113.aClass651_2.anIntArray508.length; local24++) {
			if (Class113.aClass651_2.anIntArray508[local24] != 1) {
				local39 = arg0.method22425((short) 16384);
				if (local39 == 0) {
					local12[local24] = 0;
				} else {
					local50 = arg0.method22425((short) 16384);
					local56 = (local39 << 8) + local50;
					if (local24 == 0 && local56 == 65535) {
						local4 = arg0.method22448(-417539907);
						this.anInt2802 = arg0.method22425((short) 16384) * -1228663053;
						break;
					}
					if (local56 >= 2048) {
						local56 -= 2048;
						local12[local24] = local56 | 0x40000000;
						local22[local24] = (Class47) Class277.aClass32_Sub12_1.method18273(local56, -912256819);
						local101 = local22[local24].anInt180 * -2011521841;
						if (local101 != 0) {
							this.anInt2802 = local101 * -1228663053;
						}
					} else {
						local12[local24] = local56 - 256 | Integer.MIN_VALUE;
					}
				}
			}
		}
		if (local4 == -1) {
			local24 = arg0.method22427(-1434290800);
			local39 = 0;
			for (local50 = 0; local50 < Class113.aClass651_2.anIntArray508.length; local50++) {
				if (Class113.aClass651_2.anIntArray508[local50] == 0) {
					if ((local24 & 0x1 << local39) != 0) {
						local17[local50] = Class180.method24533(local22[local50], arg0, -89682207);
					}
					local39++;
				}
			}
		}
		@Pc(163) int[] local163 = new int[10];
		for (local39 = 0; local39 < 10; local39++) {
			local50 = arg0.method22425((short) 16384);
			if (Class111.aShortArrayArrayArray3.length < 1 || local50 < 0 || local50 >= Class111.aShortArrayArrayArray3[local39][0].length) {
				local50 = 0;
			}
			local163[local39] = local50;
		}
		@Pc(197) int[] local197 = new int[10];
		for (local50 = 0; local50 < 10; local50++) {
			local56 = arg0.method22425((short) 16384);
			if (Class79_Sub1_Sub2.aShortArrayArrayArray1.length < 1 || local56 < 0 || local56 >= Class79_Sub1_Sub2.aShortArrayArrayArray1[local50][0].length) {
				local56 = 0;
			}
			local197[local50] = local56;
		}
		this.anInt2809 = arg0.method22427(-1434290800) * -1126559863;
		if (this.aClass658_1 == null) {
			this.aClass658_1 = new Class658();
		}
		local50 = this.aClass658_1.anInt5978 * 1405397749;
		@Pc(254) int[] local254 = this.aClass658_1.anIntArray513;
		this.aClass658_1.method32940(this.method19979((short) 560), local12, local17, local163, local197, this.aByte75 == 1, local4, -2094169182);
		if (local4 != local50) {
			@Pc(281) Class472 local281 = Class472.method29711(this.method24241().aClass472_61);
			local281.aFloat325 = (this.anIntArray240[0] << 9) + (this.method20009(-372993224) << 8);
			local281.aFloat327 = (this.anIntArray239[0] << 9) + (this.method20009(1693495752) << 8);
			this.method24236(local281);
			local281.method29713();
		}
		if (client.anInt3513 * -859840571 == this.anInt2768 * -1688488127 && local254 != null) {
			for (local101 = 0; local101 < local163.length; local101++) {
				if (local254[local101] != local163[local101]) {
					Class277.aClass32_Sub12_1.method17084(418612908);
					break;
				}
			}
		}
		if (this.aClass674_3 != null) {
			this.aClass674_3.method33273();
		}
		if (!this.aClass19_Sub3_3.method23564(-1912144572) || !this.aClass19_Sub3_3.aBoolean380) {
			return;
		}
		@Pc(365) Class622 local365 = this.method19978(-1178488314);
		if (!local365.method32310(this.aClass19_Sub3_3.method23566((byte) 109), 735959811)) {
			this.aClass19_Sub3_3.method23580(-1, 1664761096);
			this.aClass19_Sub3_3.aBoolean380 = false;
		}
	}

	@OriginalMember(owner = "client!aqk", name = "hv", descriptor = "(Lclient!alw;B)V")
	public void method20085(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		this.aByte75 = arg1;
		@Pc(4) int local4 = -1;
		this.anInt2802 = 0;
		@Pc(12) int[] local12 = new int[Class113.aClass651_2.anIntArray508.length];
		@Pc(17) Class48[] local17 = new Class48[Class113.aClass651_2.anIntArray508.length];
		@Pc(22) Class47[] local22 = new Class47[Class113.aClass651_2.anIntArray508.length];
		@Pc(24) int local24;
		@Pc(39) int local39;
		@Pc(50) int local50;
		@Pc(56) int local56;
		@Pc(101) int local101;
		for (local24 = 0; local24 < Class113.aClass651_2.anIntArray508.length; local24++) {
			if (Class113.aClass651_2.anIntArray508[local24] != 1) {
				local39 = arg0.method22425((short) 16384);
				if (local39 == 0) {
					local12[local24] = 0;
				} else {
					local50 = arg0.method22425((short) 16384);
					local56 = (local39 << 8) + local50;
					if (local24 == 0 && local56 == 65535) {
						local4 = arg0.method22448(-2005363658);
						this.anInt2802 = arg0.method22425((short) 16384) * -1228663053;
						break;
					}
					if (local56 >= 2048) {
						local56 -= 2048;
						local12[local24] = local56 | 0x40000000;
						local22[local24] = (Class47) Class277.aClass32_Sub12_1.method18273(local56, -1986666173);
						local101 = local22[local24].anInt180 * -2011521841;
						if (local101 != 0) {
							this.anInt2802 = local101 * -1228663053;
						}
					} else {
						local12[local24] = local56 - 256 | Integer.MIN_VALUE;
					}
				}
			}
		}
		if (local4 == -1) {
			local24 = arg0.method22427(-1434290800);
			local39 = 0;
			for (local50 = 0; local50 < Class113.aClass651_2.anIntArray508.length; local50++) {
				if (Class113.aClass651_2.anIntArray508[local50] == 0) {
					if ((local24 & 0x1 << local39) != 0) {
						local17[local50] = Class180.method24533(local22[local50], arg0, 166699591);
					}
					local39++;
				}
			}
		}
		@Pc(163) int[] local163 = new int[10];
		for (local39 = 0; local39 < 10; local39++) {
			local50 = arg0.method22425((short) 16384);
			if (Class111.aShortArrayArrayArray3.length < 1 || local50 < 0 || local50 >= Class111.aShortArrayArrayArray3[local39][0].length) {
				local50 = 0;
			}
			local163[local39] = local50;
		}
		@Pc(197) int[] local197 = new int[10];
		for (local50 = 0; local50 < 10; local50++) {
			local56 = arg0.method22425((short) 16384);
			if (Class79_Sub1_Sub2.aShortArrayArrayArray1.length < 1 || local56 < 0 || local56 >= Class79_Sub1_Sub2.aShortArrayArrayArray1[local50][0].length) {
				local56 = 0;
			}
			local197[local50] = local56;
		}
		this.anInt2809 = arg0.method22427(-1434290800) * -1126559863;
		if (this.aClass658_1 == null) {
			this.aClass658_1 = new Class658();
		}
		local50 = this.aClass658_1.anInt5978 * 1405397749;
		@Pc(254) int[] local254 = this.aClass658_1.anIntArray513;
		this.aClass658_1.method32940(this.method19979((short) 560), local12, local17, local163, local197, this.aByte75 == 1, local4, -2145849869);
		if (local4 != local50) {
			@Pc(281) Class472 local281 = Class472.method29711(this.method24241().aClass472_61);
			local281.aFloat325 = (this.anIntArray240[0] << 9) + (this.method20009(-527130288) << 8);
			local281.aFloat327 = (this.anIntArray239[0] << 9) + (this.method20009(-223912275) << 8);
			this.method24236(local281);
			local281.method29713();
		}
		if (client.anInt3513 * -859840571 == this.anInt2768 * -1688488127 && local254 != null) {
			for (local101 = 0; local101 < local163.length; local101++) {
				if (local254[local101] != local163[local101]) {
					Class277.aClass32_Sub12_1.method17084(1681583600);
					break;
				}
			}
		}
		if (this.aClass674_3 != null) {
			this.aClass674_3.method33273();
		}
		if (!this.aClass19_Sub3_3.method23564(1872029969) || !this.aClass19_Sub3_3.aBoolean380) {
			return;
		}
		@Pc(365) Class622 local365 = this.method19978(1187545810);
		if (!local365.method32310(this.aClass19_Sub3_3.method23566((byte) 102), 1751227440)) {
			this.aClass19_Sub3_3.method23580(-1, 1297703027);
			this.aClass19_Sub3_3.aBoolean380 = false;
		}
	}

	@OriginalMember(owner = "client!aqk", name = "fr", descriptor = "()Z")
	@Override
	boolean method24304() {
		return false;
	}

	@OriginalMember(owner = "client!aqk", name = "l", descriptor = "()I")
	@Override
	public int method19957() {
		return this.anInt2768 * -1688488127;
	}

	@OriginalMember(owner = "client!aqk", name = "io", descriptor = "(Lclient!alw;)V")
	public void method20086(@OriginalArg(0) Class93_Sub41 arg0) {
		arg0.anInt3070 = 0;
		@Pc(6) int local6 = arg0.method22425((short) 16384);
		@Pc(11) byte local11 = (byte) (local6 & 0x1);
		@Pc(20) boolean local20 = (local6 & 0x4) != 0;
		@Pc(24) int local24 = super.method20009(1932609827);
		this.method19973((local6 >> 3 & 0x7) + 1, -2142170693);
		@Pc(43) boolean local43 = (local6 & 0x40) != 0;
		@Pc(48) Class472 local48 = Class472.method29711(this.method24241().aClass472_61);
		local48.aFloat325 += this.method20009(-1942189126) - local24 << 8;
		local48.aFloat327 += this.method20009(2045512073) - local24 << 8;
		this.method24236(local48);
		local48.method29713();
		@Pc(100) int local100;
		if (local43) {
			this.anInt2798 = arg0.method22644((byte) -19) * 1608377605;
			local100 = local11 == 0 ? Class659.aClass633_1.anInt5886 * 503316691 : Class659.aClass633_1.anInt5885 * -1032447795;
			this.aString80 = ((Class39) Class19.aClass32_Sub7_5.method18273(local100, 1809345697)).method749(this.anInt2798 * 243539917, -1491303799);
		} else {
			this.anInt2798 = -1608377605;
			this.aString80 = null;
		}
		this.aClass659_1 = (Class659) Class107.method18131(Class659.method32977(-675607432), arg0.method22426(837900999), -1915563430);
		if (Class693.aClass693_8 == Class280.aClass693_1 && client.anInt3514 * 2055688893 >= 2) {
			this.aClass659_1 = Class659.aClass659_3;
		}
		this.method20070(arg0, local11, -237524841);
		this.aString81 = arg0.method22439(-105652264);
		this.aString82 = this.aString81;
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == this) {
			RuntimeException_Sub1.aString116 = this.aString81;
		}
		this.anInt2804 = arg0.method22425((short) 16384) * 360524567;
		if (local20) {
			this.anInt2801 = arg0.method22427(-1434290800) * -668773121;
			if (this.anInt2801 * -526144769 == 65535) {
				this.anInt2801 = 668773121;
			}
			this.anInt2810 = this.anInt2804 * 925838279;
			this.anInt2800 = 253594077;
		} else {
			this.anInt2801 = 0;
			this.anInt2810 = arg0.method22425((short) 16384) * -1799201823;
			this.anInt2800 = arg0.method22425((short) 16384) * -253594077;
			if (this.anInt2800 * -391321205 == 255) {
				this.anInt2800 = 253594077;
			}
		}
		local100 = this.anInt2807 * -1513940767;
		this.anInt2807 = arg0.method22425((short) 16384) * 1445735201;
		if (this.anInt2807 * -1513940767 == 0) {
			Class378.method28252(this, -1314427900);
			return;
		}
		@Pc(245) int local245 = this.anInt2803 * 1706069295;
		@Pc(250) int local250 = this.anInt2797 * 479956847;
		@Pc(255) int local255 = this.anInt2805 * 1263335603;
		@Pc(260) int local260 = this.anInt2806 * -2115122027;
		@Pc(265) int local265 = this.anInt2808 * -2118206535;
		this.anInt2803 = arg0.method22427(-1434290800) * -1606428209;
		this.anInt2797 = arg0.method22427(-1434290800) * -875384945;
		this.anInt2805 = arg0.method22427(-1434290800) * 672560763;
		this.anInt2806 = arg0.method22427(-1434290800) * -1686331715;
		this.anInt2808 = arg0.method22425((short) 16384) * 715315849;
		if (local100 != this.anInt2807 * -1513940767 || this.anInt2803 * 1706069295 != local245 || local250 != this.anInt2797 * 479956847 || this.anInt2805 * 1263335603 != local255 || this.anInt2806 * -2115122027 != local260 || this.anInt2808 * -2118206535 != local265) {
			Class661.method33023(this, 1710718114);
		}
	}

	@OriginalMember(owner = "client!aqk", name = "fl", descriptor = "(Lclient!dh;)Lclient!uq;")
	@Override
	public Class600 method24295(@OriginalArg(0) Class104 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aqk", name = "hw", descriptor = "(IIBI)V")
	void method20087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		if (this.anInt2763 * -846948133 < this.anIntArray240.length - 1) {
			this.anInt2763 += 1975362387;
		}
		for (@Pc(20) int local20 = this.anInt2763 * -846948133; local20 > 0; local20--) {
			this.anIntArray240[local20] = this.anIntArray240[local20 - 1];
			this.anIntArray239[local20] = this.anIntArray239[local20 - 1];
			this.aByteArray47[local20] = this.aByteArray47[local20 - 1];
		}
		this.anIntArray240[0] = arg0;
		this.anIntArray239[0] = arg1;
		this.aByteArray47[0] = arg2;
	}

	@OriginalMember(owner = "client!aqk", name = "fp", descriptor = "(I)Z")
	@Override
	boolean method24273(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!aqk", name = "fa", descriptor = "(Lclient!dh;IIB)Z")
	@Override
	boolean method24271(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if (this.aClass658_1 == null || !this.method20063(arg0, 131072, (byte) -4)) {
			return false;
		}
		@Pc(14) Class470 local14 = this.method24238();
		@Pc(16) boolean local16 = false;
		@Pc(18) int local18;
		for (local18 = 0; local18 < this.aClass109Array3.length; local18++) {
			if (this.aClass109Array3[local18] != null && this.aClass109Array3[local18].aBoolean161 && this.aClass109Array3[local18].method6859(arg1, arg2, local14, true, 0)) {
				local16 = true;
				break;
			}
		}
		for (local18 = 0; local18 < this.aClass109Array3.length; local18++) {
			this.aClass109Array3[local18] = null;
		}
		return local16;
	}

	@OriginalMember(owner = "client!aqk", name = "go", descriptor = "()V")
	@Override
	void method24269() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqk", name = "in", descriptor = "()V")
	void method20088() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anIntArray242.length; local1++) {
			this.anIntArray242[local1] = -1;
		}
		for (local1 = 0; local1 < this.anIntArray243.length; local1++) {
			this.anIntArray243[local1] = -1;
		}
	}

	@OriginalMember(owner = "client!aqk", name = "cg", descriptor = "(I)Z")
	@Override
	public boolean method19982(@OriginalArg(0) int arg0) {
		return Class93_Sub26.aClass645_15.aBoolean867;
	}

	@OriginalMember(owner = "client!aqk", name = "it", descriptor = "(Lclient!dh;I)Z")
	boolean method20089(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = arg1;
		@Pc(5) Class622 local5 = this.method19978(-1544632814);
		@Pc(20) Class19 local20 = this.aClass19_3.method23564(-1493677279) && !this.aClass19_3.method23573((byte) 0) ? this.aClass19_3 : null;
		@Pc(40) Class19_Sub3 local40 = !this.aClass19_Sub3_3.method23564(394065205) || this.aBoolean457 || this.aClass19_Sub3_3.aBoolean380 && local20 != null ? null : this.aClass19_Sub3_3;
		@Pc(45) int local45 = local5.anInt5827 * -1915635865;
		@Pc(50) int local50 = local5.anInt5828 * 512505351;
		if (local45 != 0 || local50 != 0 || local5.anInt5836 * -1220545965 != 0 || local5.anInt5838 * -572659623 != 0) {
			arg1 |= 0x7;
		}
		@Pc(76) int local76 = this.aClass523_7.method30544(1090381315);
		@Pc(95) boolean local95 = this.aByte74 != 0 && client.anInt3485 >= this.anInt2789 * -2041786019 && client.anInt3485 < this.anInt2796 * 1023735623;
		if (local95) {
			arg1 |= 0x80000;
		}
		@Pc(128) Class109 local128 = this.aClass109Array3[0] = this.aClass658_1.method32953(arg0, arg1, Class166_Sub6.aClass32_Sub5_1, Class343.aClass32_Sub19_1, Class162.aClass32_Sub3_2, Class277.aClass32_Sub12_1, Class624.aClass120_1, Class624.aClass120_1, local20, local40, this.aClass19_Sub1_Sub1Array3, this.anIntArray237, local76, true, Class113.aClass651_2, (byte) -23);
		@Pc(131) int local131 = Class153_Sub1.method14114(-1581772389);
		if (Class553.anInt3419 * 1798078423 < 96 && local131 > 50) {
			BaseVarTypeCoordFine.method30429((byte) -8);
		}
		if (Class693.aClass693_8 != Class280.aClass693_1 && local131 < 50) {
			@Pc(151) int local151 = 50 - local131;
			while (local151 > client.anInt3437 * 1775306449) {
				Class64.aByteArrayArray3[client.anInt3437 * 1775306449] = new byte[102400];
				client.anInt3437 += -1693248975;
			}
			while (local151 < client.anInt3437 * 1775306449) {
				client.anInt3437 -= -1693248975;
				Class64.aByteArrayArray3[client.anInt3437 * 1775306449] = null;
			}
		} else if (Class693.aClass693_8 != Class280.aClass693_1) {
			Class64.aByteArrayArray3 = new byte[50][];
			client.anInt3437 = 0;
		}
		if (local128 == null) {
			return false;
		}
		this.anInt2795 = local128.method6882() * -895607843;
		this.anInt2774 = local128.method6841() * -1359936025;
		local128.method6862();
		this.method19975(local128, 1969452585);
		if (local45 == 0 && local50 == 0) {
			this.method19977(local76, this.method20009(334689364) << 9, this.method20009(-1712506084) << 9, 0, 0, (byte) 93);
		} else {
			this.method19977(local76, local45, local50, local5.anInt5829 * 81786893, local5.anInt5810 * -154907541, (byte) 108);
			if (this.anInt2767 * -1595449153 != 0) {
				local128.method6986(this.anInt2767 * -1595449153);
			}
			if (this.anInt2790 * 1471665235 != 0) {
				local128.method6830(this.anInt2790 * 1471665235);
			}
			if (this.anInt2769 * 1367159499 != 0) {
				local128.method6939(0, this.anInt2769 * 1367159499, 0);
			}
		}
		if (local95) {
			local128.method6879(this.aByte71, this.aByte72, this.aByte73, this.aByte74 & 0xFF);
		}
		if (!this.aBoolean457) {
			this.method19976(arg0, local5, local1, local45, local50, local76, 267821179);
		}
		return true;
	}

	@OriginalMember(owner = "client!aqk", name = "ix", descriptor = "(Lclient!dh;I)Z")
	boolean method20090(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = arg1;
		@Pc(5) Class622 local5 = this.method19978(1582905696);
		@Pc(20) Class19 local20 = this.aClass19_3.method23564(1058902251) && !this.aClass19_3.method23573((byte) 0) ? this.aClass19_3 : null;
		@Pc(40) Class19_Sub3 local40 = !this.aClass19_Sub3_3.method23564(2017290773) || this.aBoolean457 || this.aClass19_Sub3_3.aBoolean380 && local20 != null ? null : this.aClass19_Sub3_3;
		@Pc(45) int local45 = local5.anInt5827 * -1915635865;
		@Pc(50) int local50 = local5.anInt5828 * 512505351;
		if (local45 != 0 || local50 != 0 || local5.anInt5836 * -1220545965 != 0 || local5.anInt5838 * -572659623 != 0) {
			arg1 |= 0x7;
		}
		@Pc(76) int local76 = this.aClass523_7.method30544(-1223204524);
		@Pc(95) boolean local95 = this.aByte74 != 0 && client.anInt3485 >= this.anInt2789 * -2041786019 && client.anInt3485 < this.anInt2796 * 1023735623;
		if (local95) {
			arg1 |= 0x80000;
		}
		@Pc(128) Class109 local128 = this.aClass109Array3[0] = this.aClass658_1.method32953(arg0, arg1, Class166_Sub6.aClass32_Sub5_1, Class343.aClass32_Sub19_1, Class162.aClass32_Sub3_2, Class277.aClass32_Sub12_1, Class624.aClass120_1, Class624.aClass120_1, local20, local40, this.aClass19_Sub1_Sub1Array3, this.anIntArray237, local76, true, Class113.aClass651_2, (byte) 28);
		@Pc(131) int local131 = Class153_Sub1.method14114(-1581772389);
		if (Class553.anInt3419 * 1798078423 < 96 && local131 > 50) {
			BaseVarTypeCoordFine.method30429((byte) 21);
		}
		if (Class693.aClass693_8 != Class280.aClass693_1 && local131 < 50) {
			@Pc(151) int local151 = 50 - local131;
			while (local151 > client.anInt3437 * 1775306449) {
				Class64.aByteArrayArray3[client.anInt3437 * 1775306449] = new byte[102400];
				client.anInt3437 += -1693248975;
			}
			while (local151 < client.anInt3437 * 1775306449) {
				client.anInt3437 -= -1693248975;
				Class64.aByteArrayArray3[client.anInt3437 * 1775306449] = null;
			}
		} else if (Class693.aClass693_8 != Class280.aClass693_1) {
			Class64.aByteArrayArray3 = new byte[50][];
			client.anInt3437 = 0;
		}
		if (local128 == null) {
			return false;
		}
		this.anInt2795 = local128.method6882() * -895607843;
		this.anInt2774 = local128.method6841() * -1359936025;
		local128.method6862();
		this.method19975(local128, -1505918381);
		if (local45 == 0 && local50 == 0) {
			this.method19977(local76, this.method20009(-235905717) << 9, this.method20009(-197564726) << 9, 0, 0, (byte) 83);
		} else {
			this.method19977(local76, local45, local50, local5.anInt5829 * 81786893, local5.anInt5810 * -154907541, (byte) 3);
			if (this.anInt2767 * -1595449153 != 0) {
				local128.method6986(this.anInt2767 * -1595449153);
			}
			if (this.anInt2790 * 1471665235 != 0) {
				local128.method6830(this.anInt2790 * 1471665235);
			}
			if (this.anInt2769 * 1367159499 != 0) {
				local128.method6939(0, this.anInt2769 * 1367159499, 0);
			}
		}
		if (local95) {
			local128.method6879(this.aByte71, this.aByte72, this.aByte73, this.aByte74 & 0xFF);
		}
		if (!this.aBoolean457) {
			this.method19976(arg0, local5, local1, local45, local50, local76, -170688629);
		}
		return true;
	}

	@OriginalMember(owner = "client!aqk", name = "is", descriptor = "(Lclient!dh;I)Z")
	boolean method20091(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = arg1;
		@Pc(5) Class622 local5 = this.method19978(1394518415);
		@Pc(20) Class19 local20 = this.aClass19_3.method23564(-2062248770) && !this.aClass19_3.method23573((byte) 0) ? this.aClass19_3 : null;
		@Pc(40) Class19_Sub3 local40 = !this.aClass19_Sub3_3.method23564(1117355771) || this.aBoolean457 || this.aClass19_Sub3_3.aBoolean380 && local20 != null ? null : this.aClass19_Sub3_3;
		@Pc(45) int local45 = local5.anInt5827 * -1915635865;
		@Pc(50) int local50 = local5.anInt5828 * 512505351;
		if (local45 != 0 || local50 != 0 || local5.anInt5836 * -1220545965 != 0 || local5.anInt5838 * -572659623 != 0) {
			arg1 |= 0x7;
		}
		@Pc(76) int local76 = this.aClass523_7.method30544(-889837522);
		@Pc(95) boolean local95 = this.aByte74 != 0 && client.anInt3485 >= this.anInt2789 * -2041786019 && client.anInt3485 < this.anInt2796 * 1023735623;
		if (local95) {
			arg1 |= 0x80000;
		}
		@Pc(128) Class109 local128 = this.aClass109Array3[0] = this.aClass658_1.method32953(arg0, arg1, Class166_Sub6.aClass32_Sub5_1, Class343.aClass32_Sub19_1, Class162.aClass32_Sub3_2, Class277.aClass32_Sub12_1, Class624.aClass120_1, Class624.aClass120_1, local20, local40, this.aClass19_Sub1_Sub1Array3, this.anIntArray237, local76, true, Class113.aClass651_2, (byte) -25);
		@Pc(131) int local131 = Class153_Sub1.method14114(-1581772389);
		if (Class553.anInt3419 * 1798078423 < 96 && local131 > 50) {
			BaseVarTypeCoordFine.method30429((byte) -5);
		}
		if (Class693.aClass693_8 != Class280.aClass693_1 && local131 < 50) {
			@Pc(151) int local151 = 50 - local131;
			while (local151 > client.anInt3437 * 1775306449) {
				Class64.aByteArrayArray3[client.anInt3437 * 1775306449] = new byte[102400];
				client.anInt3437 += -1693248975;
			}
			while (local151 < client.anInt3437 * 1775306449) {
				client.anInt3437 -= -1693248975;
				Class64.aByteArrayArray3[client.anInt3437 * 1775306449] = null;
			}
		} else if (Class693.aClass693_8 != Class280.aClass693_1) {
			Class64.aByteArrayArray3 = new byte[50][];
			client.anInt3437 = 0;
		}
		if (local128 == null) {
			return false;
		}
		this.anInt2795 = local128.method6882() * -895607843;
		this.anInt2774 = local128.method6841() * -1359936025;
		local128.method6862();
		this.method19975(local128, 1654884046);
		if (local45 == 0 && local50 == 0) {
			this.method19977(local76, this.method20009(-1397126013) << 9, this.method20009(-1371726154) << 9, 0, 0, (byte) 55);
		} else {
			this.method19977(local76, local45, local50, local5.anInt5829 * 81786893, local5.anInt5810 * -154907541, (byte) 85);
			if (this.anInt2767 * -1595449153 != 0) {
				local128.method6986(this.anInt2767 * -1595449153);
			}
			if (this.anInt2790 * 1471665235 != 0) {
				local128.method6830(this.anInt2790 * 1471665235);
			}
			if (this.anInt2769 * 1367159499 != 0) {
				local128.method6939(0, this.anInt2769 * 1367159499, 0);
			}
		}
		if (local95) {
			local128.method6879(this.aByte71, this.aByte72, this.aByte73, this.aByte74 & 0xFF);
		}
		if (!this.aBoolean457) {
			this.method19976(arg0, local5, local1, local45, local50, local76, -395857864);
		}
		return true;
	}

	@OriginalMember(owner = "client!aqk", name = "ib", descriptor = "(Z)Ljava/lang/String;")
	public String method20092(@OriginalArg(0) boolean arg0) {
		@Pc(7) String local7 = arg0 ? this.aString81 : this.aString82;
		return this.aString80 == null ? local7 : this.aString80.replaceAll(Class430.aString218, local7);
	}

	@OriginalMember(owner = "client!aqk", name = "il", descriptor = "(Z)Ljava/lang/String;")
	public String method20093(@OriginalArg(0) boolean arg0) {
		@Pc(7) String local7 = arg0 ? this.aString81 : this.aString82;
		return this.aString80 == null ? local7 : this.aString80.replaceAll(Class430.aString218, local7);
	}

	@OriginalMember(owner = "client!aqk", name = "ig", descriptor = "(Lclient!alw;)V")
	public void method20094(@OriginalArg(0) Class93_Sub41 arg0) {
		arg0.anInt3070 = 0;
		@Pc(6) int local6 = arg0.method22425((short) 16384);
		for (@Pc(8) int local8 = 0; local8 < this.anIntArray242.length; local8++) {
			if ((local6 & 0x1 << local8) == 0) {
				this.anIntArray242[local8] = -1;
				this.anIntArray243[local8] = -1;
			} else {
				@Pc(23) int local23 = arg0.method22425((short) 16384);
				@Pc(27) int local27 = arg0.method22427(-1434290800);
				this.anIntArray242[local8] = local23;
				this.anIntArray243[local8] = local27;
			}
		}
	}

	@OriginalMember(owner = "client!aqk", name = "ip", descriptor = "(II)V")
	public void method20095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2763 = 0;
		this.anInt2760 = 0;
		this.anInt2791 = 0;
		this.anIntArray240[0] = arg0;
		this.anIntArray239[0] = arg1;
		@Pc(22) int local22 = this.method20009(1826240233);
		@Pc(27) Class472 local27 = Class472.method29711(this.method24241().aClass472_61);
		local27.aFloat325 = local22 * 256 + this.anIntArray240[0] * 512;
		local27.aFloat327 = local22 * 256 + this.anIntArray239[0] * 512;
		this.method24236(local27);
		local27.method29713();
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == this) {
			client.aClass532_1.method30713((byte) 42).method33184(850350098);
		}
		if (this.aClass674_3 != null) {
			this.aClass674_3.method33273();
		}
	}

	@OriginalMember(owner = "client!aqk", name = "gq", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	void method24308(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqk", name = "ia", descriptor = "(II)V")
	public void method20096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2763 = 0;
		this.anInt2760 = 0;
		this.anInt2791 = 0;
		this.anIntArray240[0] = arg0;
		this.anIntArray239[0] = arg1;
		@Pc(22) int local22 = this.method20009(-1411672125);
		@Pc(27) Class472 local27 = Class472.method29711(this.method24241().aClass472_61);
		local27.aFloat325 = local22 * 256 + this.anIntArray240[0] * 512;
		local27.aFloat327 = local22 * 256 + this.anIntArray239[0] * 512;
		this.method24236(local27);
		local27.method29713();
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == this) {
			client.aClass532_1.method30713((byte) -52).method33184(496883854);
		}
		if (this.aClass674_3 != null) {
			this.aClass674_3.method33273();
		}
	}

	@OriginalMember(owner = "client!aqk", name = "iq", descriptor = "(Lclient!alw;)V")
	public void method20097(@OriginalArg(0) Class93_Sub41 arg0) {
		arg0.anInt3070 = 0;
		@Pc(6) int local6 = arg0.method22425((short) 16384);
		for (@Pc(8) int local8 = 0; local8 < this.anIntArray242.length; local8++) {
			if ((local6 & 0x1 << local8) == 0) {
				this.anIntArray242[local8] = -1;
				this.anIntArray243[local8] = -1;
			} else {
				@Pc(23) int local23 = arg0.method22425((short) 16384);
				@Pc(27) int local27 = arg0.method22427(-1434290800);
				this.anIntArray242[local8] = local23;
				this.anIntArray243[local8] = local27;
			}
		}
	}

	@OriginalMember(owner = "client!aqk", name = "ff", descriptor = "(B)V")
	@Override
	void method24277(@OriginalArg(0) byte arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqk", name = "ir", descriptor = "(Lclient!dh;Lclient!ou;Lclient!do;JJIJ)V")
	void method20098(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) long arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6) {
		@Pc(7) long local7 = arg4 * arg4 + arg3 * arg3;
		if (local7 < 262144L || local7 > arg6) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg3, (double) arg4) * 2607.5945876176133D - (double) this.aClass523_7.method30544(-27478678)) & 0x3FFF;
		@Pc(51) Class109 local51 = Class127.method9258(arg0, local33, this.anInt2767 * -1595449153, this.anInt2790 * 1471665235, this.anInt2769 * 1367159499, arg5, (byte) -125);
		if (local51 != null) {
			arg0.method20530(false);
			local51.method6947(arg1, null, 0);
			arg0.method20530(true);
		}
	}

	@OriginalMember(owner = "client!aqk", name = "bz", descriptor = "(I)I")
	@Override
	public int method20009(@OriginalArg(0) int arg0) {
		return this.aClass658_1 == null || this.aClass658_1.anInt5978 * 1405397749 == -1 ? super.method20009(-1170617764) : ((Class336) Class162.aClass32_Sub3_2.method18273(this.aClass658_1.anInt5978 * 1405397749, -3451010)).anInt4195 * 447008399;
	}

	@OriginalMember(owner = "client!aqk", name = "iz", descriptor = "()Z")
	public boolean method20099() {
		return this.aClass658_1 != null;
	}

	@OriginalMember(owner = "client!aqk", name = "ik", descriptor = "()Z")
	public boolean method20100() {
		return this.aClass658_1 != null;
	}

	@OriginalMember(owner = "client!aqk", name = "im", descriptor = "()Z")
	public boolean method20101() {
		return this.aClass658_1 != null;
	}

	@OriginalMember(owner = "client!aqk", name = "eh", descriptor = "()Lclient!su;")
	@Override
	public Class561 method20034() {
		if (this.aClass561_3 != null) {
			if (this.aClass561_3.aString236 == null) {
				return null;
			}
			if (client.anInt3561 * 2112576331 == 0 || client.anInt3561 * 2112576331 == 3 || client.anInt3561 * 2112576331 == 1 && Class260.method26250(this.aString82, 1830161789)) {
				return this.aClass561_3;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aqk", name = "jd", descriptor = "(Ljava/lang/String;II)V")
	public void method20102(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method19980(arg0, arg1, arg2, Class451.method29129((byte) 3) * Class93_Sub26.aClass645_15.anInt5953 * -678073063, 1172024670);
	}
}
