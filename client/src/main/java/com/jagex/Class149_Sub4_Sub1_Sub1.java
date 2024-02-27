package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!atz")
public final class Class149_Sub4_Sub1_Sub1 extends Class149_Sub4_Sub1 {

	@OriginalMember(owner = "client!atz", name = "s", descriptor = "S")
	short aShort112;

	@OriginalMember(owner = "client!atz", name = "x", descriptor = "I")
	int anInt3243;

	@OriginalMember(owner = "client!atz", name = "o", descriptor = "Lclient!xm;")
	Class664 aClass664_1;

	@OriginalMember(owner = "client!atz", name = "q", descriptor = "S")
	short aShort114;

	@OriginalMember(owner = "client!atz", name = "y", descriptor = "S")
	short aShort113;

	@OriginalMember(owner = "client!atz", name = "i", descriptor = "S")
	short aShort118;

	@OriginalMember(owner = "client!atz", name = "h", descriptor = "S")
	short aShort117;

	@OriginalMember(owner = "client!atz", name = "a", descriptor = "S")
	short aShort116;

	@OriginalMember(owner = "client!atz", name = "g", descriptor = "S")
	short aShort115;

	@OriginalMember(owner = "client!atz", name = "b", descriptor = "I")
	int anInt3242;

	@OriginalMember(owner = "client!atz", name = "<init>", descriptor = "(Lclient!xm;IIIIIIIIIIIIIZZ)V")
	Class149_Sub4_Sub1_Sub1(@OriginalArg(0) Class664 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15) {
		this.aClass664_1 = arg0;
		this.anInt3236 = arg1 << 12;
		this.anInt3240 = arg2 << 12;
		this.anInt3238 = arg3 << 12;
		this.anInt3235 = arg9;
		this.aShort113 = this.aShort114 = (short) arg8;
		this.anInt3239 = arg10;
		this.aShort111 = (short) arg11;
		this.aShort118 = (short) arg12;
		this.anInt3237 = arg13;
		this.aBoolean536 = arg15;
		this.aShort117 = (short) arg4;
		this.aShort116 = (short) arg5;
		this.aShort115 = (short) arg6;
		this.anInt3242 = arg7;
		this.method23789();
	}

	@OriginalMember(owner = "client!atz", name = "v", descriptor = "()V")
	void method23787() {
		this.aClass664_1.aClass674_8.aClass149_Sub4_Sub1_Sub1Array2[this.aShort112] = null;
		Class663.aClass149_Sub4_Sub1_Sub1Array1[Class663.anInt5995 * -42244385] = this;
		Class663.anInt5995 = (Class663.anInt5995 * -42244385 + 1 & 0x3FF) * -1872112353;
		this.method23778(-719770481);
		this.method23785(1738804858);
	}

	@OriginalMember(owner = "client!atz", name = "k", descriptor = "(Lclient!xm;IIIIIIIIIIIIIZZ)V")
	void method23788(@OriginalArg(0) Class664 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15) {
		this.aClass664_1 = arg0;
		this.anInt3236 = arg1 << 12;
		this.anInt3240 = arg2 << 12;
		this.anInt3238 = arg3 << 12;
		this.anInt3235 = arg9;
		this.aShort113 = this.aShort114 = (short) arg8;
		this.anInt3239 = arg10;
		this.aShort111 = (short) arg11;
		this.aShort118 = (short) arg12;
		this.anInt3237 = arg13;
		this.aBoolean536 = arg15;
		this.aShort117 = (short) arg4;
		this.aShort116 = (short) arg5;
		this.aShort115 = (short) arg6;
		this.anInt3242 = arg7;
		this.method23789();
	}

	@OriginalMember(owner = "client!atz", name = "f", descriptor = "()V")
	void method23789() {
		@Pc(4) int local4 = this.aClass664_1.aClass674_8.anInt6036;
		if (this.aClass664_1.aClass674_8.aClass149_Sub4_Sub1_Sub1Array2[local4] != null) {
			this.aClass664_1.aClass674_8.aClass149_Sub4_Sub1_Sub1Array2[local4].method23792();
		}
		this.aClass664_1.aClass674_8.aClass149_Sub4_Sub1_Sub1Array2[local4] = this;
		this.aShort112 = (short) this.aClass664_1.aClass674_8.anInt6036;
		this.aClass664_1.aClass674_8.anInt6036 = local4 + 1 & 0x1FFF;
		this.aClass664_1.aClass21_9.method379(this, (byte) 4);
	}

	@OriginalMember(owner = "client!atz", name = "w", descriptor = "(JI)V")
	void method23790(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort114 = (short) (this.aShort114 - arg1);
		if (this.aShort114 <= 0) {
			this.method23792();
			return;
		}
		@Pc(17) int local17 = this.anInt3236 >> 12;
		@Pc(22) int local22 = this.anInt3240 >> 12;
		@Pc(27) int local27 = this.anInt3238 >> 12;
		@Pc(31) Class674 local31 = this.aClass664_1.aClass674_8;
		@Pc(35) Class439 local35 = this.aClass664_1.aClass439_1;
		if (local35.anInt5002 * 1429228259 != 0) {
			@Pc(71) int local71;
			if (this.aShort113 - this.aShort114 <= local35.anInt5035 * -1983165443) {
				local71 = (this.anInt3235 >> 8 & 0xFF00) + (this.anInt3243 >> 16 & 0xFF) + local35.anInt5040 * -1194472293 * arg1;
				@Pc(90) int local90 = (this.anInt3235 & 0xFF00) + (this.anInt3243 >> 8 & 0xFF) + local35.anInt5037 * 564518807 * arg1;
				@Pc(109) int local109 = ((this.anInt3235 & 0xFF) << 8) + (this.anInt3243 & 0xFF) + local35.anInt5038 * 1661436715 * arg1;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 > 65535) {
					local71 = 65535;
				}
				if (local90 < 0) {
					local90 = 0;
				} else if (local90 > 65535) {
					local90 = 65535;
				}
				if (local109 < 0) {
					local109 = 0;
				} else if (local109 > 65535) {
					local109 = 65535;
				}
				this.anInt3235 &= 0xFF000000;
				this.anInt3235 |= ((local71 & 0xFF00) << 8) + (local90 & 0xFF00) + (local109 >> 8 & 0xFF);
				this.anInt3243 &= 0xFF000000;
				this.anInt3243 |= ((local71 & 0xFF) << 16) + ((local90 & 0xFF) << 8) + (local109 & 0xFF);
			}
			if (this.aShort113 - this.aShort114 <= local35.anInt5016 * -1714374073) {
				local71 = (this.anInt3235 >> 16 & 0xFF00) + (this.anInt3243 >> 24 & 0xFF) + local35.anInt4990 * 1496357697 * arg1;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 > 65535) {
					local71 = 65535;
				}
				this.anInt3235 &= 0xFFFFFF;
				this.anInt3235 |= (local71 & 0xFF00) << 16;
				this.anInt3243 &= 0xFFFFFF;
				this.anInt3243 |= (local71 & 0xFF) << 24;
			}
		}
		if (local35.anInt4994 * 222856069 != -1 && this.aShort113 - this.aShort114 <= local35.anInt5039 * -929621963) {
			this.anInt3242 += local35.anInt5005 * -242626843 * arg1;
		}
		if (local35.anInt4998 * -1014056825 != -1 && this.aShort113 - this.aShort114 <= local35.anInt5023 * -2017992005) {
			this.anInt3239 += local35.anInt5032 * 708470067 * arg1;
		}
		if (this.aShort118 != 0) {
			this.aShort111 = (short) (this.aShort111 + this.aShort118 * arg1 & 0x3FFF);
		}
		@Pc(337) double local337 = (double) this.aShort117;
		@Pc(341) double local341 = (double) this.aShort116;
		@Pc(345) double local345 = (double) this.aShort115;
		@Pc(347) boolean local347 = false;
		@Pc(362) int local362;
		@Pc(371) int local371;
		@Pc(380) int local380;
		@Pc(397) int local397;
		@Pc(407) long local407;
		if (local35.anInt4992 * -532228023 == 1) {
			local362 = local17 - this.aClass664_1.aClass673_1.anInt6024 * 976933385;
			local371 = local22 - this.aClass664_1.aClass673_1.anInt6029 * -29624619;
			local380 = local27 - this.aClass664_1.aClass673_1.anInt6033 * 667123649;
			local397 = (int) Math.sqrt((double) (local362 * local362 + local371 * local371 + local380 * local380)) >> 2;
			local407 = local35.anInt5013 * -1628359587 * local397 * arg1;
			this.anInt3242 = (int) ((long) this.anInt3242 - ((long) this.anInt3242 * local407 >> 18));
		} else if (local35.anInt4992 * -532228023 == 2) {
			local362 = local17 - this.aClass664_1.aClass673_1.anInt6024 * 976933385;
			local371 = local22 - this.aClass664_1.aClass673_1.anInt6029 * -29624619;
			local380 = local27 - this.aClass664_1.aClass673_1.anInt6033 * 667123649;
			local397 = local362 * local362 + local371 * local371 + local380 * local380;
			local407 = local35.anInt5013 * -1628359587 * local397 * arg1;
			this.anInt3242 = (int) ((long) this.anInt3242 - ((long) this.anInt3242 * local407 >> 28));
		}
		@Pc(505) Class93_Sub12 local505;
		@Pc(508) Class431 local508;
		if (local35.anIntArray448 != null) {
			@Pc(498) Iterator local498 = local31.aList24.iterator();
			label225: while (true) {
				do {
					if (!local498.hasNext()) {
						break label225;
					}
					local505 = (Class93_Sub12) local498.next();
					local508 = local505.aClass431_1;
				} while (local508.anInt4953 * -1789015339 == 1);
				@Pc(517) boolean local517 = false;
				for (@Pc(519) int local519 = 0; local519 < local35.anIntArray448.length; local519++) {
					if (local35.anIntArray448[local519] == local508.anInt4952 * -955750871) {
						local517 = true;
						break;
					}
				}
				if (local517) {
					@Pc(549) double local549 = (double) (local17 - local505.anInt1505 * -622332581);
					@Pc(557) double local557 = (double) (local22 - local505.anInt1503 * 123047151);
					@Pc(565) double local565 = (double) (local27 - local505.anInt1504 * 668684485);
					@Pc(577) double local577 = local549 * local549 + local557 * local557 + local565 * local565;
					if (!(local577 > (double) (local508.aLong278 * 9057428299981225763L))) {
						@Pc(589) double local589 = Math.sqrt(local577);
						if (local589 == 0.0D) {
							local589 = 1.0D;
						}
						@Pc(625) double local625 = (local549 * (double) local505.aFloat142 + local557 * (double) (local508.anInt4956 * -1854056089) + local565 * (double) local505.aFloat143) * 65535.0D / ((double) (local508.anInt4962 * 1815004147) * local589);
						if (!(local625 < (double) (local508.anInt4958 * -220031705))) {
							@Pc(636) double local636 = 0.0D;
							if (local508.anInt4961 * 798349155 == 1) {
								local636 = local589 / 16.0D * (double) (local508.anInt4960 * 2136484877);
							} else if (local508.anInt4961 * 798349155 == 2) {
								local636 = local589 / 16.0D * (local589 / 16.0D) * (double) (local508.anInt4960 * 2136484877);
							}
							if (local508.anInt4963 * 695142527 != 0) {
								@Pc(779) double local779 = local549 / local589 * (double) (local508.anInt4962 * 1815004147);
								@Pc(789) double local789 = local557 / local589 * (double) (local508.anInt4962 * 1815004147);
								@Pc(799) double local799 = local565 / local589 * (double) (local508.anInt4962 * 1815004147);
								if (local508.anInt4946 * -520875299 == 0) {
									local337 += local779 * (double) arg1;
									local341 += local789 * (double) arg1;
									local345 += local799 * (double) arg1;
									local347 = true;
								} else {
									this.anInt3236 = (int) ((double) this.anInt3236 + local779 * (double) arg1);
									this.anInt3240 = (int) ((double) this.anInt3240 + local789 * (double) arg1);
									this.anInt3238 = (int) ((double) this.anInt3238 + local799 * (double) arg1);
								}
							} else if (local508.anInt4946 * -520875299 == 0) {
								local337 += ((double) local505.aFloat142 - local636) * (double) arg1;
								local341 += ((double) (local508.anInt4956 * -1854056089) - local636) * (double) arg1;
								local345 += ((double) local505.aFloat143 - local636) * (double) arg1;
								local347 = true;
							} else {
								this.anInt3236 = (int) ((double) this.anInt3236 + ((double) local505.aFloat142 - local636) * (double) arg1);
								this.anInt3240 = (int) ((double) this.anInt3240 + ((double) (local508.anInt4956 * -1854056089) - local636) * (double) arg1);
								this.anInt3238 = (int) ((double) this.anInt3238 + ((double) local505.aFloat143 - local636) * (double) arg1);
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray449 != null) {
			label206: for (local362 = 0; local362 < local35.anIntArray449.length; local362++) {
				local505 = (Class93_Sub12) Class663.aClass16_39.method215((long) local35.anIntArray449[local362]);
				while (true) {
					while (true) {
						if (local505 == null) {
							continue label206;
						}
						local508 = local505.aClass431_1;
						@Pc(894) double local894 = (double) (local17 - local505.anInt1505 * -622332581);
						@Pc(902) double local902 = (double) (local22 - local505.anInt1503 * 123047151);
						@Pc(910) double local910 = (double) (local27 - local505.anInt1504 * 668684485);
						@Pc(922) double local922 = local894 * local894 + local902 * local902 + local910 * local910;
						if (local922 > (double) (local508.aLong278 * 9057428299981225763L)) {
							local505 = (Class93_Sub12) Class663.aClass16_39.method216(-1796956099);
						} else {
							@Pc(939) double local939 = Math.sqrt(local922);
							if (local939 == 0.0D) {
								local939 = 1.0D;
							}
							@Pc(986) double local986;
							if (local508.anInt4959 * 60440529 > 0 && local508.anInt4959 * 60440529 < 2047) {
								local986 = (local894 * (double) local505.aFloat142 + local902 * (double) (local508.anInt4956 * -1854056089) + local910 * (double) local505.aFloat143) * 16384.0D / ((double) (local508.anInt4962 * 1815004147) * local939);
								if (local986 < (double) (local508.anInt4958 * -220031705)) {
									local505 = (Class93_Sub12) Class663.aClass16_39.method216(-1796956099);
									continue;
								}
							}
							local986 = 0.0D;
							if (local508.anInt4961 * 798349155 == 1) {
								local986 = local939 / 16.0D * (double) (local508.anInt4960 * 2136484877);
							} else if (local508.anInt4961 * 798349155 == 2) {
								local986 = local939 / 16.0D * (local939 / 16.0D) * (double) (local508.anInt4960 * 2136484877);
							}
							if (local508.anInt4963 * 695142527 != 0) {
								@Pc(1145) double local1145 = local894 / local939 * (double) (local508.anInt4962 * 1815004147);
								@Pc(1155) double local1155 = local902 / local939 * (double) (local508.anInt4962 * 1815004147);
								@Pc(1165) double local1165 = local910 / local939 * (double) (local508.anInt4962 * 1815004147);
								if (local508.anInt4946 * -520875299 == 0) {
									local337 += local1145 * (double) arg1;
									local341 += local1155 * (double) arg1;
									local345 += local1165 * (double) arg1;
									local347 = true;
								} else {
									this.anInt3236 = (int) ((double) this.anInt3236 + local1145 * (double) arg1);
									this.anInt3240 = (int) ((double) this.anInt3240 + local1155 * (double) arg1);
									this.anInt3238 = (int) ((double) this.anInt3238 + local1165 * (double) arg1);
								}
							} else if (local508.anInt4946 * -520875299 == 0) {
								local337 += ((double) local505.aFloat142 - local986) * (double) arg1;
								local341 += ((double) (local508.anInt4956 * -1854056089) - local986) * (double) arg1;
								local345 += ((double) local505.aFloat143 - local986) * (double) arg1;
								local347 = true;
							} else {
								this.anInt3236 = (int) ((double) this.anInt3236 + ((double) local505.aFloat142 - local986) * (double) arg1);
								this.anInt3240 = (int) ((double) this.anInt3240 + ((double) (local508.anInt4956 * -1854056089) - local986) * (double) arg1);
								this.anInt3238 = (int) ((double) this.anInt3238 + ((double) local505.aFloat143 - local986) * (double) arg1);
							}
							local505 = (Class93_Sub12) Class663.aClass16_39.method216(-1796956099);
						}
					}
				}
			}
		}
		if (local35.anIntArray451 != null) {
			if (local35.anIntArray450 == null) {
				local35.anIntArray450 = new int[local35.anIntArray451.length];
				for (local362 = 0; local362 < local35.anIntArray451.length; local362++) {
					Class110_Sub15_Sub2.anInterface47_1.method29056(local35.anIntArray451[local362], -657045947);
					local35.anIntArray450[local362] = Class157.method14263(local35.anIntArray451[local362], -189865995);
				}
			}
			for (local362 = 0; local362 < local35.anIntArray450.length; local362++) {
				@Pc(1288) Class431 local1288 = Class663.aClass431Array1[local35.anIntArray450[local362]];
				if (local1288.anInt4946 * -520875299 == 0) {
					local337 += local1288.anInt4955 * -823033007 * arg1;
					local341 += local1288.anInt4956 * -1854056089 * arg1;
					local345 += local1288.anInt4957 * 1279331297 * arg1;
					local347 = true;
				} else {
					this.anInt3236 += local1288.anInt4955 * -823033007 * arg1;
					this.anInt3240 += local1288.anInt4956 * -1854056089 * arg1;
					this.anInt3238 += local1288.anInt4957 * 1279331297 * arg1;
				}
			}
		}
		if (local347) {
			while (true) {
				if (!(local337 > 32767.0D) && !(local341 > 32767.0D) && !(local345 > 32767.0D) && !(local337 < -32767.0D) && !(local341 < -32767.0D) && !(local345 < -32767.0D)) {
					this.aShort117 = (short) local337;
					this.aShort116 = (short) local341;
					this.aShort115 = (short) local345;
					break;
				}
				local337 /= 2.0D;
				local341 /= 2.0D;
				local345 /= 2.0D;
				this.anInt3242 <<= 0x1;
			}
		}
		this.anInt3236 = (int) ((long) this.anInt3236 + ((long) this.aShort117 * (long) (this.anInt3242 << 2) >> 23) * (long) arg1);
		this.anInt3240 = (int) ((long) this.anInt3240 + ((long) this.aShort116 * (long) (this.anInt3242 << 2) >> 23) * (long) arg1);
		this.anInt3238 = (int) ((long) this.anInt3238 + ((long) this.aShort115 * (long) (this.anInt3242 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!atz", name = "l", descriptor = "(Lclient!tx;Lclient!dh;J)V")
	void method23791(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) long arg2) {
		@Pc(9) int local9 = this.anInt3236 >> arg0.anInt5599 * -358186793 + 12;
		@Pc(19) int local19 = this.anInt3238 >> arg0.anInt5599 * -358186793 + 12;
		@Pc(24) int local24 = this.anInt3240 >> 12;
		if (local24 > 262144 || local24 < -262144 || local9 < 0 || local9 >= arg0.anInt5604 * -200159665 || local19 < 0 || local19 >= arg0.anInt5605 * -1943751559) {
			this.method23792();
			return;
		}
		@Pc(53) Class674 local53 = this.aClass664_1.aClass674_8;
		@Pc(57) Class439 local57 = this.aClass664_1.aClass439_1;
		@Pc(60) Class99[] local60 = arg0.aClass99Array1;
		@Pc(63) int local63 = local53.anInt6039;
		@Pc(73) Class572 local73 = arg0.aClass572ArrayArrayArray3[local53.anInt6039][local9][local19];
		if (local73 != null) {
			local63 = local73.aByte163;
		}
		@Pc(86) int local86 = local60[local63].method2482(local9, local19, -953165120);
		@Pc(104) int local104;
		if (local63 < arg0.anInt5603 * -882426473 - 1) {
			local104 = local60[local63 + 1].method2482(local9, local19, -536825927);
		} else {
			local104 = local86 - (0x8 << arg0.anInt5599 * -358186793);
		}
		if (local57.aBoolean775) {
			if (local57.anInt5012 * -104301089 == -1 && local24 > local86) {
				this.method23792();
				return;
			}
			if (local57.anInt5012 * -104301089 >= 0 && local24 > local60[local57.anInt5012 * -104301089].method2482(local9, local19, -1462789072)) {
				this.method23792();
				return;
			}
			if (local57.anInt5014 * 682539117 == -1 && local24 < local104) {
				this.method23792();
				return;
			}
			if (local57.anInt5014 * 682539117 >= 0 && local24 < local60[local57.anInt5014 * 682539117 + 1].method2482(local9, local19, -576594873)) {
				this.method23792();
				return;
			}
		}
		@Pc(190) int local190;
		for (local190 = arg0.anInt5603 * -882426473 - 1; local190 > 0 && local24 > local60[local190].method2482(local9, local19, -784627360); local190--) {
		}
		if (local57.aBoolean776 && local190 == 0 && local24 > local60[0].method2482(local9, local19, -853961435)) {
			this.method23792();
		} else if (local190 == arg0.anInt5603 * -882426473 - 1 && local60[local190].method2482(local9, local19, -189708538) - local24 > 0x8 << arg0.anInt5599 * -358186793) {
			this.method23792();
		} else {
			local73 = arg0.aClass572ArrayArrayArray3[local190][local9][local19];
			@Pc(305) int local305;
			if (local73 == null) {
				if (local190 == 0 || arg0.aClass572ArrayArrayArray3[0][local9][local19] == null) {
					local73 = arg0.aClass572ArrayArrayArray3[0][local9][local19] = new Class572(0);
				}
				@Pc(297) boolean local297 = arg0.aClass572ArrayArrayArray3[0][local9][local19].aClass572_1 != null;
				if (local190 == 3 && local297) {
					local190--;
				}
				for (local305 = 1; local305 <= local190; local305++) {
					if (arg0.aClass572ArrayArrayArray3[local305][local9][local19] == null) {
						local73 = arg0.aClass572ArrayArrayArray3[local305][local9][local19] = new Class572(local305);
						if (local297) {
							local73.aByte163++;
						}
					}
				}
				if (local73 == null) {
					local73 = arg0.aClass572ArrayArrayArray3[local190][local9][local19];
				}
			}
			if (local57.aBoolean773) {
				@Pc(361) int local361 = this.anInt3236 >> 12;
				local305 = this.anInt3238 >> 12;
				@Pc(375) Class600 local375;
				if (local73.aClass132_Sub1_Sub2_1 != null) {
					local375 = local73.aClass132_Sub1_Sub2_1.method24310(arg1, (byte) 49);
					if (local375 != null && local375.method32019(local361, local24, local305)) {
						this.method23792();
						return;
					}
				}
				if (local73.aClass132_Sub1_Sub2_2 != null) {
					local375 = local73.aClass132_Sub1_Sub2_2.method24310(arg1, (byte) -71);
					if (local375 != null && local375.method32019(local361, local24, local305)) {
						this.method23792();
						return;
					}
				}
				if (local73.aClass132_Sub1_Sub4_1 != null) {
					local375 = local73.aClass132_Sub1_Sub4_1.method24310(arg1, (byte) 84);
					if (local375 != null && local375.method32019(local361, local24, local305)) {
						this.method23792();
						return;
					}
				}
				for (@Pc(429) Class590 local429 = local73.aClass590_1; local429 != null; local429 = local429.aClass590_2) {
					@Pc(437) Class600 local437 = local429.aClass132_Sub1_Sub1_1.method24310(arg1, (byte) -87);
					if (local437 != null && local437.method32019(local361, local24, local305)) {
						this.method23792();
						return;
					}
				}
			}
			local53.aClass229_1.aClass8_1.method125(this, (byte) 22);
		}
	}

	@OriginalMember(owner = "client!atz", name = "u", descriptor = "()V")
	void method23792() {
		this.aClass664_1.aClass674_8.aClass149_Sub4_Sub1_Sub1Array2[this.aShort112] = null;
		Class663.aClass149_Sub4_Sub1_Sub1Array1[Class663.anInt5995 * -42244385] = this;
		Class663.anInt5995 = (Class663.anInt5995 * -42244385 + 1 & 0x3FF) * -1872112353;
		this.method23778(-719770481);
		this.method23785(403272154);
	}

	@OriginalMember(owner = "client!atz", name = "o", descriptor = "()V")
	void method23793() {
		this.aClass664_1.aClass674_8.aClass149_Sub4_Sub1_Sub1Array2[this.aShort112] = null;
		Class663.aClass149_Sub4_Sub1_Sub1Array1[Class663.anInt5995 * -42244385] = this;
		Class663.anInt5995 = (Class663.anInt5995 * -42244385 + 1 & 0x3FF) * -1872112353;
		this.method23778(-719770481);
		this.method23785(663208805);
	}

	@OriginalMember(owner = "client!atz", name = "p", descriptor = "()V")
	void method23794() {
		@Pc(4) int local4 = this.aClass664_1.aClass674_8.anInt6036;
		if (this.aClass664_1.aClass674_8.aClass149_Sub4_Sub1_Sub1Array2[local4] != null) {
			this.aClass664_1.aClass674_8.aClass149_Sub4_Sub1_Sub1Array2[local4].method23792();
		}
		this.aClass664_1.aClass674_8.aClass149_Sub4_Sub1_Sub1Array2[local4] = this;
		this.aShort112 = (short) this.aClass664_1.aClass674_8.anInt6036;
		this.aClass664_1.aClass674_8.anInt6036 = local4 + 1 & 0x1FFF;
		this.aClass664_1.aClass21_9.method379(this, (byte) 4);
	}

	@OriginalMember(owner = "client!atz", name = "z", descriptor = "(Lclient!xm;IIIIIIIIIIIIIZZ)V")
	void method23795(@OriginalArg(0) Class664 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15) {
		this.aClass664_1 = arg0;
		this.anInt3236 = arg1 << 12;
		this.anInt3240 = arg2 << 12;
		this.anInt3238 = arg3 << 12;
		this.anInt3235 = arg9;
		this.aShort113 = this.aShort114 = (short) arg8;
		this.anInt3239 = arg10;
		this.aShort111 = (short) arg11;
		this.aShort118 = (short) arg12;
		this.anInt3237 = arg13;
		this.aBoolean536 = arg15;
		this.aShort117 = (short) arg4;
		this.aShort116 = (short) arg5;
		this.aShort115 = (short) arg6;
		this.anInt3242 = arg7;
		this.method23789();
	}

	@OriginalMember(owner = "client!atz", name = "r", descriptor = "(Lclient!tx;Lclient!dh;J)V")
	void method23796(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) long arg2) {
		@Pc(9) int local9 = this.anInt3236 >> arg0.anInt5599 * -358186793 + 12;
		@Pc(19) int local19 = this.anInt3238 >> arg0.anInt5599 * -358186793 + 12;
		@Pc(24) int local24 = this.anInt3240 >> 12;
		if (local24 > 262144 || local24 < -262144 || local9 < 0 || local9 >= arg0.anInt5604 * -200159665 || local19 < 0 || local19 >= arg0.anInt5605 * -1943751559) {
			this.method23792();
			return;
		}
		@Pc(53) Class674 local53 = this.aClass664_1.aClass674_8;
		@Pc(57) Class439 local57 = this.aClass664_1.aClass439_1;
		@Pc(60) Class99[] local60 = arg0.aClass99Array1;
		@Pc(63) int local63 = local53.anInt6039;
		@Pc(73) Class572 local73 = arg0.aClass572ArrayArrayArray3[local53.anInt6039][local9][local19];
		if (local73 != null) {
			local63 = local73.aByte163;
		}
		@Pc(86) int local86 = local60[local63].method2482(local9, local19, -870057902);
		@Pc(104) int local104;
		if (local63 < arg0.anInt5603 * -882426473 - 1) {
			local104 = local60[local63 + 1].method2482(local9, local19, -753709664);
		} else {
			local104 = local86 - (0x8 << arg0.anInt5599 * -358186793);
		}
		if (local57.aBoolean775) {
			if (local57.anInt5012 * -104301089 == -1 && local24 > local86) {
				this.method23792();
				return;
			}
			if (local57.anInt5012 * -104301089 >= 0 && local24 > local60[local57.anInt5012 * -104301089].method2482(local9, local19, -948416373)) {
				this.method23792();
				return;
			}
			if (local57.anInt5014 * 682539117 == -1 && local24 < local104) {
				this.method23792();
				return;
			}
			if (local57.anInt5014 * 682539117 >= 0 && local24 < local60[local57.anInt5014 * 682539117 + 1].method2482(local9, local19, -1357959703)) {
				this.method23792();
				return;
			}
		}
		@Pc(190) int local190;
		for (local190 = arg0.anInt5603 * -882426473 - 1; local190 > 0 && local24 > local60[local190].method2482(local9, local19, -529654527); local190--) {
		}
		if (local57.aBoolean776 && local190 == 0 && local24 > local60[0].method2482(local9, local19, -1239791058)) {
			this.method23792();
		} else if (local190 == arg0.anInt5603 * -882426473 - 1 && local60[local190].method2482(local9, local19, -999306612) - local24 > 0x8 << arg0.anInt5599 * -358186793) {
			this.method23792();
		} else {
			local73 = arg0.aClass572ArrayArrayArray3[local190][local9][local19];
			@Pc(305) int local305;
			if (local73 == null) {
				if (local190 == 0 || arg0.aClass572ArrayArrayArray3[0][local9][local19] == null) {
					local73 = arg0.aClass572ArrayArrayArray3[0][local9][local19] = new Class572(0);
				}
				@Pc(297) boolean local297 = arg0.aClass572ArrayArrayArray3[0][local9][local19].aClass572_1 != null;
				if (local190 == 3 && local297) {
					local190--;
				}
				for (local305 = 1; local305 <= local190; local305++) {
					if (arg0.aClass572ArrayArrayArray3[local305][local9][local19] == null) {
						local73 = arg0.aClass572ArrayArrayArray3[local305][local9][local19] = new Class572(local305);
						if (local297) {
							local73.aByte163++;
						}
					}
				}
				if (local73 == null) {
					local73 = arg0.aClass572ArrayArrayArray3[local190][local9][local19];
				}
			}
			if (local57.aBoolean773) {
				@Pc(361) int local361 = this.anInt3236 >> 12;
				local305 = this.anInt3238 >> 12;
				@Pc(375) Class600 local375;
				if (local73.aClass132_Sub1_Sub2_1 != null) {
					local375 = local73.aClass132_Sub1_Sub2_1.method24310(arg1, (byte) -104);
					if (local375 != null && local375.method32019(local361, local24, local305)) {
						this.method23792();
						return;
					}
				}
				if (local73.aClass132_Sub1_Sub2_2 != null) {
					local375 = local73.aClass132_Sub1_Sub2_2.method24310(arg1, (byte) -57);
					if (local375 != null && local375.method32019(local361, local24, local305)) {
						this.method23792();
						return;
					}
				}
				if (local73.aClass132_Sub1_Sub4_1 != null) {
					local375 = local73.aClass132_Sub1_Sub4_1.method24310(arg1, (byte) 56);
					if (local375 != null && local375.method32019(local361, local24, local305)) {
						this.method23792();
						return;
					}
				}
				for (@Pc(429) Class590 local429 = local73.aClass590_1; local429 != null; local429 = local429.aClass590_2) {
					@Pc(437) Class600 local437 = local429.aClass132_Sub1_Sub1_1.method24310(arg1, (byte) 35);
					if (local437 != null && local437.method32019(local361, local24, local305)) {
						this.method23792();
						return;
					}
				}
			}
			local53.aClass229_1.aClass8_1.method125(this, (byte) 30);
		}
	}

	@OriginalMember(owner = "client!atz", name = "c", descriptor = "(JI)V")
	void method23797(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort114 = (short) (this.aShort114 - arg1);
		if (this.aShort114 <= 0) {
			this.method23792();
			return;
		}
		@Pc(17) int local17 = this.anInt3236 >> 12;
		@Pc(22) int local22 = this.anInt3240 >> 12;
		@Pc(27) int local27 = this.anInt3238 >> 12;
		@Pc(31) Class674 local31 = this.aClass664_1.aClass674_8;
		@Pc(35) Class439 local35 = this.aClass664_1.aClass439_1;
		if (local35.anInt5002 * 1429228259 != 0) {
			@Pc(71) int local71;
			if (this.aShort113 - this.aShort114 <= local35.anInt5035 * -1983165443) {
				local71 = (this.anInt3235 >> 8 & 0xFF00) + (this.anInt3243 >> 16 & 0xFF) + local35.anInt5040 * -1194472293 * arg1;
				@Pc(90) int local90 = (this.anInt3235 & 0xFF00) + (this.anInt3243 >> 8 & 0xFF) + local35.anInt5037 * 564518807 * arg1;
				@Pc(109) int local109 = ((this.anInt3235 & 0xFF) << 8) + (this.anInt3243 & 0xFF) + local35.anInt5038 * 1661436715 * arg1;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 > 65535) {
					local71 = 65535;
				}
				if (local90 < 0) {
					local90 = 0;
				} else if (local90 > 65535) {
					local90 = 65535;
				}
				if (local109 < 0) {
					local109 = 0;
				} else if (local109 > 65535) {
					local109 = 65535;
				}
				this.anInt3235 &= 0xFF000000;
				this.anInt3235 |= ((local71 & 0xFF00) << 8) + (local90 & 0xFF00) + (local109 >> 8 & 0xFF);
				this.anInt3243 &= 0xFF000000;
				this.anInt3243 |= ((local71 & 0xFF) << 16) + ((local90 & 0xFF) << 8) + (local109 & 0xFF);
			}
			if (this.aShort113 - this.aShort114 <= local35.anInt5016 * -1714374073) {
				local71 = (this.anInt3235 >> 16 & 0xFF00) + (this.anInt3243 >> 24 & 0xFF) + local35.anInt4990 * 1496357697 * arg1;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 > 65535) {
					local71 = 65535;
				}
				this.anInt3235 &= 0xFFFFFF;
				this.anInt3235 |= (local71 & 0xFF00) << 16;
				this.anInt3243 &= 0xFFFFFF;
				this.anInt3243 |= (local71 & 0xFF) << 24;
			}
		}
		if (local35.anInt4994 * 222856069 != -1 && this.aShort113 - this.aShort114 <= local35.anInt5039 * -929621963) {
			this.anInt3242 += local35.anInt5005 * -242626843 * arg1;
		}
		if (local35.anInt4998 * -1014056825 != -1 && this.aShort113 - this.aShort114 <= local35.anInt5023 * -2017992005) {
			this.anInt3239 += local35.anInt5032 * 708470067 * arg1;
		}
		if (this.aShort118 != 0) {
			this.aShort111 = (short) (this.aShort111 + this.aShort118 * arg1 & 0x3FFF);
		}
		@Pc(337) double local337 = (double) this.aShort117;
		@Pc(341) double local341 = (double) this.aShort116;
		@Pc(345) double local345 = (double) this.aShort115;
		@Pc(347) boolean local347 = false;
		@Pc(362) int local362;
		@Pc(371) int local371;
		@Pc(380) int local380;
		@Pc(397) int local397;
		@Pc(407) long local407;
		if (local35.anInt4992 * -532228023 == 1) {
			local362 = local17 - this.aClass664_1.aClass673_1.anInt6024 * 976933385;
			local371 = local22 - this.aClass664_1.aClass673_1.anInt6029 * -29624619;
			local380 = local27 - this.aClass664_1.aClass673_1.anInt6033 * 667123649;
			local397 = (int) Math.sqrt((double) (local362 * local362 + local371 * local371 + local380 * local380)) >> 2;
			local407 = local35.anInt5013 * -1628359587 * local397 * arg1;
			this.anInt3242 = (int) ((long) this.anInt3242 - ((long) this.anInt3242 * local407 >> 18));
		} else if (local35.anInt4992 * -532228023 == 2) {
			local362 = local17 - this.aClass664_1.aClass673_1.anInt6024 * 976933385;
			local371 = local22 - this.aClass664_1.aClass673_1.anInt6029 * -29624619;
			local380 = local27 - this.aClass664_1.aClass673_1.anInt6033 * 667123649;
			local397 = local362 * local362 + local371 * local371 + local380 * local380;
			local407 = local35.anInt5013 * -1628359587 * local397 * arg1;
			this.anInt3242 = (int) ((long) this.anInt3242 - ((long) this.anInt3242 * local407 >> 28));
		}
		@Pc(505) Class93_Sub12 local505;
		@Pc(508) Class431 local508;
		if (local35.anIntArray448 != null) {
			@Pc(498) Iterator local498 = local31.aList24.iterator();
			label225: while (true) {
				do {
					if (!local498.hasNext()) {
						break label225;
					}
					local505 = (Class93_Sub12) local498.next();
					local508 = local505.aClass431_1;
				} while (local508.anInt4953 * -1789015339 == 1);
				@Pc(517) boolean local517 = false;
				for (@Pc(519) int local519 = 0; local519 < local35.anIntArray448.length; local519++) {
					if (local35.anIntArray448[local519] == local508.anInt4952 * -955750871) {
						local517 = true;
						break;
					}
				}
				if (local517) {
					@Pc(549) double local549 = (double) (local17 - local505.anInt1505 * -622332581);
					@Pc(557) double local557 = (double) (local22 - local505.anInt1503 * 123047151);
					@Pc(565) double local565 = (double) (local27 - local505.anInt1504 * 668684485);
					@Pc(577) double local577 = local549 * local549 + local557 * local557 + local565 * local565;
					if (!(local577 > (double) (local508.aLong278 * 9057428299981225763L))) {
						@Pc(589) double local589 = Math.sqrt(local577);
						if (local589 == 0.0D) {
							local589 = 1.0D;
						}
						@Pc(625) double local625 = (local549 * (double) local505.aFloat142 + local557 * (double) (local508.anInt4956 * -1854056089) + local565 * (double) local505.aFloat143) * 65535.0D / ((double) (local508.anInt4962 * 1815004147) * local589);
						if (!(local625 < (double) (local508.anInt4958 * -220031705))) {
							@Pc(636) double local636 = 0.0D;
							if (local508.anInt4961 * 798349155 == 1) {
								local636 = local589 / 16.0D * (double) (local508.anInt4960 * 2136484877);
							} else if (local508.anInt4961 * 798349155 == 2) {
								local636 = local589 / 16.0D * (local589 / 16.0D) * (double) (local508.anInt4960 * 2136484877);
							}
							if (local508.anInt4963 * 695142527 != 0) {
								@Pc(779) double local779 = local549 / local589 * (double) (local508.anInt4962 * 1815004147);
								@Pc(789) double local789 = local557 / local589 * (double) (local508.anInt4962 * 1815004147);
								@Pc(799) double local799 = local565 / local589 * (double) (local508.anInt4962 * 1815004147);
								if (local508.anInt4946 * -520875299 == 0) {
									local337 += local779 * (double) arg1;
									local341 += local789 * (double) arg1;
									local345 += local799 * (double) arg1;
									local347 = true;
								} else {
									this.anInt3236 = (int) ((double) this.anInt3236 + local779 * (double) arg1);
									this.anInt3240 = (int) ((double) this.anInt3240 + local789 * (double) arg1);
									this.anInt3238 = (int) ((double) this.anInt3238 + local799 * (double) arg1);
								}
							} else if (local508.anInt4946 * -520875299 == 0) {
								local337 += ((double) local505.aFloat142 - local636) * (double) arg1;
								local341 += ((double) (local508.anInt4956 * -1854056089) - local636) * (double) arg1;
								local345 += ((double) local505.aFloat143 - local636) * (double) arg1;
								local347 = true;
							} else {
								this.anInt3236 = (int) ((double) this.anInt3236 + ((double) local505.aFloat142 - local636) * (double) arg1);
								this.anInt3240 = (int) ((double) this.anInt3240 + ((double) (local508.anInt4956 * -1854056089) - local636) * (double) arg1);
								this.anInt3238 = (int) ((double) this.anInt3238 + ((double) local505.aFloat143 - local636) * (double) arg1);
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray449 != null) {
			label206: for (local362 = 0; local362 < local35.anIntArray449.length; local362++) {
				local505 = (Class93_Sub12) Class663.aClass16_39.method215((long) local35.anIntArray449[local362]);
				while (true) {
					while (true) {
						if (local505 == null) {
							continue label206;
						}
						local508 = local505.aClass431_1;
						@Pc(894) double local894 = (double) (local17 - local505.anInt1505 * -622332581);
						@Pc(902) double local902 = (double) (local22 - local505.anInt1503 * 123047151);
						@Pc(910) double local910 = (double) (local27 - local505.anInt1504 * 668684485);
						@Pc(922) double local922 = local894 * local894 + local902 * local902 + local910 * local910;
						if (local922 > (double) (local508.aLong278 * 9057428299981225763L)) {
							local505 = (Class93_Sub12) Class663.aClass16_39.method216(-1796956099);
						} else {
							@Pc(939) double local939 = Math.sqrt(local922);
							if (local939 == 0.0D) {
								local939 = 1.0D;
							}
							@Pc(986) double local986;
							if (local508.anInt4959 * 60440529 > 0 && local508.anInt4959 * 60440529 < 2047) {
								local986 = (local894 * (double) local505.aFloat142 + local902 * (double) (local508.anInt4956 * -1854056089) + local910 * (double) local505.aFloat143) * 16384.0D / ((double) (local508.anInt4962 * 1815004147) * local939);
								if (local986 < (double) (local508.anInt4958 * -220031705)) {
									local505 = (Class93_Sub12) Class663.aClass16_39.method216(-1796956099);
									continue;
								}
							}
							local986 = 0.0D;
							if (local508.anInt4961 * 798349155 == 1) {
								local986 = local939 / 16.0D * (double) (local508.anInt4960 * 2136484877);
							} else if (local508.anInt4961 * 798349155 == 2) {
								local986 = local939 / 16.0D * (local939 / 16.0D) * (double) (local508.anInt4960 * 2136484877);
							}
							if (local508.anInt4963 * 695142527 != 0) {
								@Pc(1145) double local1145 = local894 / local939 * (double) (local508.anInt4962 * 1815004147);
								@Pc(1155) double local1155 = local902 / local939 * (double) (local508.anInt4962 * 1815004147);
								@Pc(1165) double local1165 = local910 / local939 * (double) (local508.anInt4962 * 1815004147);
								if (local508.anInt4946 * -520875299 == 0) {
									local337 += local1145 * (double) arg1;
									local341 += local1155 * (double) arg1;
									local345 += local1165 * (double) arg1;
									local347 = true;
								} else {
									this.anInt3236 = (int) ((double) this.anInt3236 + local1145 * (double) arg1);
									this.anInt3240 = (int) ((double) this.anInt3240 + local1155 * (double) arg1);
									this.anInt3238 = (int) ((double) this.anInt3238 + local1165 * (double) arg1);
								}
							} else if (local508.anInt4946 * -520875299 == 0) {
								local337 += ((double) local505.aFloat142 - local986) * (double) arg1;
								local341 += ((double) (local508.anInt4956 * -1854056089) - local986) * (double) arg1;
								local345 += ((double) local505.aFloat143 - local986) * (double) arg1;
								local347 = true;
							} else {
								this.anInt3236 = (int) ((double) this.anInt3236 + ((double) local505.aFloat142 - local986) * (double) arg1);
								this.anInt3240 = (int) ((double) this.anInt3240 + ((double) (local508.anInt4956 * -1854056089) - local986) * (double) arg1);
								this.anInt3238 = (int) ((double) this.anInt3238 + ((double) local505.aFloat143 - local986) * (double) arg1);
							}
							local505 = (Class93_Sub12) Class663.aClass16_39.method216(-1796956099);
						}
					}
				}
			}
		}
		if (local35.anIntArray451 != null) {
			if (local35.anIntArray450 == null) {
				local35.anIntArray450 = new int[local35.anIntArray451.length];
				for (local362 = 0; local362 < local35.anIntArray451.length; local362++) {
					Class110_Sub15_Sub2.anInterface47_1.method29056(local35.anIntArray451[local362], -657045947);
					local35.anIntArray450[local362] = Class157.method14263(local35.anIntArray451[local362], -189865995);
				}
			}
			for (local362 = 0; local362 < local35.anIntArray450.length; local362++) {
				@Pc(1288) Class431 local1288 = Class663.aClass431Array1[local35.anIntArray450[local362]];
				if (local1288.anInt4946 * -520875299 == 0) {
					local337 += local1288.anInt4955 * -823033007 * arg1;
					local341 += local1288.anInt4956 * -1854056089 * arg1;
					local345 += local1288.anInt4957 * 1279331297 * arg1;
					local347 = true;
				} else {
					this.anInt3236 += local1288.anInt4955 * -823033007 * arg1;
					this.anInt3240 += local1288.anInt4956 * -1854056089 * arg1;
					this.anInt3238 += local1288.anInt4957 * 1279331297 * arg1;
				}
			}
		}
		if (local347) {
			while (true) {
				if (!(local337 > 32767.0D) && !(local341 > 32767.0D) && !(local345 > 32767.0D) && !(local337 < -32767.0D) && !(local341 < -32767.0D) && !(local345 < -32767.0D)) {
					this.aShort117 = (short) local337;
					this.aShort116 = (short) local341;
					this.aShort115 = (short) local345;
					break;
				}
				local337 /= 2.0D;
				local341 /= 2.0D;
				local345 /= 2.0D;
				this.anInt3242 <<= 0x1;
			}
		}
		this.anInt3236 = (int) ((long) this.anInt3236 + ((long) this.aShort117 * (long) (this.anInt3242 << 2) >> 23) * (long) arg1);
		this.anInt3240 = (int) ((long) this.anInt3240 + ((long) this.aShort116 * (long) (this.anInt3242 << 2) >> 23) * (long) arg1);
		this.anInt3238 = (int) ((long) this.anInt3238 + ((long) this.aShort115 * (long) (this.anInt3242 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!atz", name = "d", descriptor = "(JI)V")
	void method23798(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort114 = (short) (this.aShort114 - arg1);
		if (this.aShort114 <= 0) {
			this.method23792();
			return;
		}
		@Pc(17) int local17 = this.anInt3236 >> 12;
		@Pc(22) int local22 = this.anInt3240 >> 12;
		@Pc(27) int local27 = this.anInt3238 >> 12;
		@Pc(31) Class674 local31 = this.aClass664_1.aClass674_8;
		@Pc(35) Class439 local35 = this.aClass664_1.aClass439_1;
		if (local35.anInt5002 * 1429228259 != 0) {
			@Pc(71) int local71;
			if (this.aShort113 - this.aShort114 <= local35.anInt5035 * -1983165443) {
				local71 = (this.anInt3235 >> 8 & 0xFF00) + (this.anInt3243 >> 16 & 0xFF) + local35.anInt5040 * -1194472293 * arg1;
				@Pc(90) int local90 = (this.anInt3235 & 0xFF00) + (this.anInt3243 >> 8 & 0xFF) + local35.anInt5037 * 564518807 * arg1;
				@Pc(109) int local109 = ((this.anInt3235 & 0xFF) << 8) + (this.anInt3243 & 0xFF) + local35.anInt5038 * 1661436715 * arg1;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 > 65535) {
					local71 = 65535;
				}
				if (local90 < 0) {
					local90 = 0;
				} else if (local90 > 65535) {
					local90 = 65535;
				}
				if (local109 < 0) {
					local109 = 0;
				} else if (local109 > 65535) {
					local109 = 65535;
				}
				this.anInt3235 &= 0xFF000000;
				this.anInt3235 |= ((local71 & 0xFF00) << 8) + (local90 & 0xFF00) + (local109 >> 8 & 0xFF);
				this.anInt3243 &= 0xFF000000;
				this.anInt3243 |= ((local71 & 0xFF) << 16) + ((local90 & 0xFF) << 8) + (local109 & 0xFF);
			}
			if (this.aShort113 - this.aShort114 <= local35.anInt5016 * -1714374073) {
				local71 = (this.anInt3235 >> 16 & 0xFF00) + (this.anInt3243 >> 24 & 0xFF) + local35.anInt4990 * 1496357697 * arg1;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 > 65535) {
					local71 = 65535;
				}
				this.anInt3235 &= 0xFFFFFF;
				this.anInt3235 |= (local71 & 0xFF00) << 16;
				this.anInt3243 &= 0xFFFFFF;
				this.anInt3243 |= (local71 & 0xFF) << 24;
			}
		}
		if (local35.anInt4994 * 222856069 != -1 && this.aShort113 - this.aShort114 <= local35.anInt5039 * -929621963) {
			this.anInt3242 += local35.anInt5005 * -242626843 * arg1;
		}
		if (local35.anInt4998 * -1014056825 != -1 && this.aShort113 - this.aShort114 <= local35.anInt5023 * -2017992005) {
			this.anInt3239 += local35.anInt5032 * 708470067 * arg1;
		}
		if (this.aShort118 != 0) {
			this.aShort111 = (short) (this.aShort111 + this.aShort118 * arg1 & 0x3FFF);
		}
		@Pc(337) double local337 = (double) this.aShort117;
		@Pc(341) double local341 = (double) this.aShort116;
		@Pc(345) double local345 = (double) this.aShort115;
		@Pc(347) boolean local347 = false;
		@Pc(362) int local362;
		@Pc(371) int local371;
		@Pc(380) int local380;
		@Pc(397) int local397;
		@Pc(407) long local407;
		if (local35.anInt4992 * -532228023 == 1) {
			local362 = local17 - this.aClass664_1.aClass673_1.anInt6024 * 976933385;
			local371 = local22 - this.aClass664_1.aClass673_1.anInt6029 * -29624619;
			local380 = local27 - this.aClass664_1.aClass673_1.anInt6033 * 667123649;
			local397 = (int) Math.sqrt((double) (local362 * local362 + local371 * local371 + local380 * local380)) >> 2;
			local407 = local35.anInt5013 * -1628359587 * local397 * arg1;
			this.anInt3242 = (int) ((long) this.anInt3242 - ((long) this.anInt3242 * local407 >> 18));
		} else if (local35.anInt4992 * -532228023 == 2) {
			local362 = local17 - this.aClass664_1.aClass673_1.anInt6024 * 976933385;
			local371 = local22 - this.aClass664_1.aClass673_1.anInt6029 * -29624619;
			local380 = local27 - this.aClass664_1.aClass673_1.anInt6033 * 667123649;
			local397 = local362 * local362 + local371 * local371 + local380 * local380;
			local407 = local35.anInt5013 * -1628359587 * local397 * arg1;
			this.anInt3242 = (int) ((long) this.anInt3242 - ((long) this.anInt3242 * local407 >> 28));
		}
		@Pc(505) Class93_Sub12 local505;
		@Pc(508) Class431 local508;
		if (local35.anIntArray448 != null) {
			@Pc(498) Iterator local498 = local31.aList24.iterator();
			label225: while (true) {
				do {
					if (!local498.hasNext()) {
						break label225;
					}
					local505 = (Class93_Sub12) local498.next();
					local508 = local505.aClass431_1;
				} while (local508.anInt4953 * -1789015339 == 1);
				@Pc(517) boolean local517 = false;
				for (@Pc(519) int local519 = 0; local519 < local35.anIntArray448.length; local519++) {
					if (local35.anIntArray448[local519] == local508.anInt4952 * -955750871) {
						local517 = true;
						break;
					}
				}
				if (local517) {
					@Pc(549) double local549 = (double) (local17 - local505.anInt1505 * -622332581);
					@Pc(557) double local557 = (double) (local22 - local505.anInt1503 * 123047151);
					@Pc(565) double local565 = (double) (local27 - local505.anInt1504 * 668684485);
					@Pc(577) double local577 = local549 * local549 + local557 * local557 + local565 * local565;
					if (!(local577 > (double) (local508.aLong278 * 9057428299981225763L))) {
						@Pc(589) double local589 = Math.sqrt(local577);
						if (local589 == 0.0D) {
							local589 = 1.0D;
						}
						@Pc(625) double local625 = (local549 * (double) local505.aFloat142 + local557 * (double) (local508.anInt4956 * -1854056089) + local565 * (double) local505.aFloat143) * 65535.0D / ((double) (local508.anInt4962 * 1815004147) * local589);
						if (!(local625 < (double) (local508.anInt4958 * -220031705))) {
							@Pc(636) double local636 = 0.0D;
							if (local508.anInt4961 * 798349155 == 1) {
								local636 = local589 / 16.0D * (double) (local508.anInt4960 * 2136484877);
							} else if (local508.anInt4961 * 798349155 == 2) {
								local636 = local589 / 16.0D * (local589 / 16.0D) * (double) (local508.anInt4960 * 2136484877);
							}
							if (local508.anInt4963 * 695142527 != 0) {
								@Pc(779) double local779 = local549 / local589 * (double) (local508.anInt4962 * 1815004147);
								@Pc(789) double local789 = local557 / local589 * (double) (local508.anInt4962 * 1815004147);
								@Pc(799) double local799 = local565 / local589 * (double) (local508.anInt4962 * 1815004147);
								if (local508.anInt4946 * -520875299 == 0) {
									local337 += local779 * (double) arg1;
									local341 += local789 * (double) arg1;
									local345 += local799 * (double) arg1;
									local347 = true;
								} else {
									this.anInt3236 = (int) ((double) this.anInt3236 + local779 * (double) arg1);
									this.anInt3240 = (int) ((double) this.anInt3240 + local789 * (double) arg1);
									this.anInt3238 = (int) ((double) this.anInt3238 + local799 * (double) arg1);
								}
							} else if (local508.anInt4946 * -520875299 == 0) {
								local337 += ((double) local505.aFloat142 - local636) * (double) arg1;
								local341 += ((double) (local508.anInt4956 * -1854056089) - local636) * (double) arg1;
								local345 += ((double) local505.aFloat143 - local636) * (double) arg1;
								local347 = true;
							} else {
								this.anInt3236 = (int) ((double) this.anInt3236 + ((double) local505.aFloat142 - local636) * (double) arg1);
								this.anInt3240 = (int) ((double) this.anInt3240 + ((double) (local508.anInt4956 * -1854056089) - local636) * (double) arg1);
								this.anInt3238 = (int) ((double) this.anInt3238 + ((double) local505.aFloat143 - local636) * (double) arg1);
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray449 != null) {
			label206: for (local362 = 0; local362 < local35.anIntArray449.length; local362++) {
				local505 = (Class93_Sub12) Class663.aClass16_39.method215((long) local35.anIntArray449[local362]);
				while (true) {
					while (true) {
						if (local505 == null) {
							continue label206;
						}
						local508 = local505.aClass431_1;
						@Pc(894) double local894 = (double) (local17 - local505.anInt1505 * -622332581);
						@Pc(902) double local902 = (double) (local22 - local505.anInt1503 * 123047151);
						@Pc(910) double local910 = (double) (local27 - local505.anInt1504 * 668684485);
						@Pc(922) double local922 = local894 * local894 + local902 * local902 + local910 * local910;
						if (local922 > (double) (local508.aLong278 * 9057428299981225763L)) {
							local505 = (Class93_Sub12) Class663.aClass16_39.method216(-1796956099);
						} else {
							@Pc(939) double local939 = Math.sqrt(local922);
							if (local939 == 0.0D) {
								local939 = 1.0D;
							}
							@Pc(986) double local986;
							if (local508.anInt4959 * 60440529 > 0 && local508.anInt4959 * 60440529 < 2047) {
								local986 = (local894 * (double) local505.aFloat142 + local902 * (double) (local508.anInt4956 * -1854056089) + local910 * (double) local505.aFloat143) * 16384.0D / ((double) (local508.anInt4962 * 1815004147) * local939);
								if (local986 < (double) (local508.anInt4958 * -220031705)) {
									local505 = (Class93_Sub12) Class663.aClass16_39.method216(-1796956099);
									continue;
								}
							}
							local986 = 0.0D;
							if (local508.anInt4961 * 798349155 == 1) {
								local986 = local939 / 16.0D * (double) (local508.anInt4960 * 2136484877);
							} else if (local508.anInt4961 * 798349155 == 2) {
								local986 = local939 / 16.0D * (local939 / 16.0D) * (double) (local508.anInt4960 * 2136484877);
							}
							if (local508.anInt4963 * 695142527 != 0) {
								@Pc(1145) double local1145 = local894 / local939 * (double) (local508.anInt4962 * 1815004147);
								@Pc(1155) double local1155 = local902 / local939 * (double) (local508.anInt4962 * 1815004147);
								@Pc(1165) double local1165 = local910 / local939 * (double) (local508.anInt4962 * 1815004147);
								if (local508.anInt4946 * -520875299 == 0) {
									local337 += local1145 * (double) arg1;
									local341 += local1155 * (double) arg1;
									local345 += local1165 * (double) arg1;
									local347 = true;
								} else {
									this.anInt3236 = (int) ((double) this.anInt3236 + local1145 * (double) arg1);
									this.anInt3240 = (int) ((double) this.anInt3240 + local1155 * (double) arg1);
									this.anInt3238 = (int) ((double) this.anInt3238 + local1165 * (double) arg1);
								}
							} else if (local508.anInt4946 * -520875299 == 0) {
								local337 += ((double) local505.aFloat142 - local986) * (double) arg1;
								local341 += ((double) (local508.anInt4956 * -1854056089) - local986) * (double) arg1;
								local345 += ((double) local505.aFloat143 - local986) * (double) arg1;
								local347 = true;
							} else {
								this.anInt3236 = (int) ((double) this.anInt3236 + ((double) local505.aFloat142 - local986) * (double) arg1);
								this.anInt3240 = (int) ((double) this.anInt3240 + ((double) (local508.anInt4956 * -1854056089) - local986) * (double) arg1);
								this.anInt3238 = (int) ((double) this.anInt3238 + ((double) local505.aFloat143 - local986) * (double) arg1);
							}
							local505 = (Class93_Sub12) Class663.aClass16_39.method216(-1796956099);
						}
					}
				}
			}
		}
		if (local35.anIntArray451 != null) {
			if (local35.anIntArray450 == null) {
				local35.anIntArray450 = new int[local35.anIntArray451.length];
				for (local362 = 0; local362 < local35.anIntArray451.length; local362++) {
					Class110_Sub15_Sub2.anInterface47_1.method29056(local35.anIntArray451[local362], -657045947);
					local35.anIntArray450[local362] = Class157.method14263(local35.anIntArray451[local362], -189865995);
				}
			}
			for (local362 = 0; local362 < local35.anIntArray450.length; local362++) {
				@Pc(1288) Class431 local1288 = Class663.aClass431Array1[local35.anIntArray450[local362]];
				if (local1288.anInt4946 * -520875299 == 0) {
					local337 += local1288.anInt4955 * -823033007 * arg1;
					local341 += local1288.anInt4956 * -1854056089 * arg1;
					local345 += local1288.anInt4957 * 1279331297 * arg1;
					local347 = true;
				} else {
					this.anInt3236 += local1288.anInt4955 * -823033007 * arg1;
					this.anInt3240 += local1288.anInt4956 * -1854056089 * arg1;
					this.anInt3238 += local1288.anInt4957 * 1279331297 * arg1;
				}
			}
		}
		if (local347) {
			while (true) {
				if (!(local337 > 32767.0D) && !(local341 > 32767.0D) && !(local345 > 32767.0D) && !(local337 < -32767.0D) && !(local341 < -32767.0D) && !(local345 < -32767.0D)) {
					this.aShort117 = (short) local337;
					this.aShort116 = (short) local341;
					this.aShort115 = (short) local345;
					break;
				}
				local337 /= 2.0D;
				local341 /= 2.0D;
				local345 /= 2.0D;
				this.anInt3242 <<= 0x1;
			}
		}
		this.anInt3236 = (int) ((long) this.anInt3236 + ((long) this.aShort117 * (long) (this.anInt3242 << 2) >> 23) * (long) arg1);
		this.anInt3240 = (int) ((long) this.anInt3240 + ((long) this.aShort116 * (long) (this.anInt3242 << 2) >> 23) * (long) arg1);
		this.anInt3238 = (int) ((long) this.anInt3238 + ((long) this.aShort115 * (long) (this.anInt3242 << 2) >> 23) * (long) arg1);
	}
}
