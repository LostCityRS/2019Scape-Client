package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Iterator;

@OriginalClass("client!atq")
public final class Class147_Sub3_Sub1_Sub1 extends Class147_Sub3_Sub1 {

	@OriginalMember(owner = "client!atq", name = "r", descriptor = "S")
	short aShort111;

	@OriginalMember(owner = "client!atq", name = "d", descriptor = "I")
	int anInt3252;

	@OriginalMember(owner = "client!atq", name = "w", descriptor = "Lclient!xo;")
	Class667 aClass667_1;

	@OriginalMember(owner = "client!atq", name = "h", descriptor = "S")
	short aShort112;

	@OriginalMember(owner = "client!atq", name = "q", descriptor = "S")
	short aShort113;

	@OriginalMember(owner = "client!atq", name = "n", descriptor = "S")
	short aShort114;

	@OriginalMember(owner = "client!atq", name = "p", descriptor = "S")
	short aShort117;

	@OriginalMember(owner = "client!atq", name = "v", descriptor = "S")
	short aShort115;

	@OriginalMember(owner = "client!atq", name = "y", descriptor = "S")
	short aShort116;

	@OriginalMember(owner = "client!atq", name = "z", descriptor = "I")
	int anInt3253;

	@OriginalMember(owner = "client!atq", name = "<init>", descriptor = "(Lclient!xo;IIIIIIIIIIIIIZZ)V")
	Class147_Sub3_Sub1_Sub1(@OriginalArg(0) Class667 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15) {
		this.aClass667_1 = arg0;
		this.anInt3247 = arg1 << 12;
		this.anInt3248 = arg2 << 12;
		this.anInt3251 = arg3 << 12;
		this.anInt3246 = arg9;
		this.aShort113 = this.aShort112 = (short) arg8;
		this.anInt3250 = arg10;
		this.aShort110 = (short) arg11;
		this.aShort114 = (short) arg12;
		this.anInt3244 = arg13;
		this.aBoolean636 = arg15;
		this.aShort117 = (short) arg4;
		this.aShort115 = (short) arg5;
		this.aShort116 = (short) arg6;
		this.anInt3253 = arg7;
		this.method23940();
	}

	@OriginalMember(owner = "client!atq", name = "a", descriptor = "()V")
	void method23938() {
		this.aClass667_1.aClass658_8.aClass147_Sub3_Sub1_Sub1Array2[this.aShort111] = null;
		Class654.aClass147_Sub3_Sub1_Sub1Array1[Class654.anInt5669 * -715383901] = this;
		Class654.anInt5669 = (Class654.anInt5669 * -715383901 + 1 & 0x3FF) * 712437771;
		this.method23926(534888724);
		this.method23933((byte) -29);
	}

	@OriginalMember(owner = "client!atq", name = "i", descriptor = "(Lclient!xo;IIIIIIIIIIIIIZZ)V")
	void method23939(@OriginalArg(0) Class667 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15) {
		this.aClass667_1 = arg0;
		this.anInt3247 = arg1 << 12;
		this.anInt3248 = arg2 << 12;
		this.anInt3251 = arg3 << 12;
		this.anInt3246 = arg9;
		this.aShort113 = this.aShort112 = (short) arg8;
		this.anInt3250 = arg10;
		this.aShort110 = (short) arg11;
		this.aShort114 = (short) arg12;
		this.anInt3244 = arg13;
		this.aBoolean636 = arg15;
		this.aShort117 = (short) arg4;
		this.aShort115 = (short) arg5;
		this.aShort116 = (short) arg6;
		this.anInt3253 = arg7;
		this.method23940();
	}

	@OriginalMember(owner = "client!atq", name = "m", descriptor = "()V")
	void method23940() {
		@Pc(4) int local4 = this.aClass667_1.aClass658_8.anInt5679;
		if (this.aClass667_1.aClass658_8.aClass147_Sub3_Sub1_Sub1Array2[local4] != null) {
			this.aClass667_1.aClass658_8.aClass147_Sub3_Sub1_Sub1Array2[local4].method23938();
		}
		this.aClass667_1.aClass658_8.aClass147_Sub3_Sub1_Sub1Array2[local4] = this;
		this.aShort111 = (short) this.aClass667_1.aClass658_8.anInt5679;
		this.aClass667_1.aClass658_8.anInt5679 = local4 + 1 & 0x1FFF;
		this.aClass667_1.aClass5_9.method90(this, 864007266);
	}

	@OriginalMember(owner = "client!atq", name = "o", descriptor = "(JI)V")
	void method23941(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort112 = (short) (this.aShort112 - arg1);
		if (this.aShort112 <= 0) {
			this.method23938();
			return;
		}
		@Pc(17) int local17 = this.anInt3247 >> 12;
		@Pc(22) int local22 = this.anInt3248 >> 12;
		@Pc(27) int local27 = this.anInt3251 >> 12;
		@Pc(31) Class658 local31 = this.aClass667_1.aClass658_8;
		@Pc(35) Class441 local35 = this.aClass667_1.aClass441_1;
		if (local35.anInt4834 * -650899567 != 0) {
			@Pc(71) int local71;
			if (this.aShort113 - this.aShort112 <= local35.anInt4856 * 198932677) {
				local71 = (this.anInt3246 >> 8 & 0xFF00) + (this.anInt3252 >> 16 & 0xFF) + local35.anInt4818 * 2100839167 * arg1;
				@Pc(90) int local90 = (this.anInt3246 & 0xFF00) + (this.anInt3252 >> 8 & 0xFF) + local35.anInt4869 * -1225863335 * arg1;
				@Pc(109) int local109 = ((this.anInt3246 & 0xFF) << 8) + (this.anInt3252 & 0xFF) + local35.anInt4870 * -1925834317 * arg1;
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
				this.anInt3246 &= 0xFF000000;
				this.anInt3246 |= ((local71 & 0xFF00) << 8) + (local90 & 0xFF00) + (local109 >> 8 & 0xFF);
				this.anInt3252 &= 0xFF000000;
				this.anInt3252 |= ((local71 & 0xFF) << 16) + ((local90 & 0xFF) << 8) + (local109 & 0xFF);
			}
			if (this.aShort113 - this.aShort112 <= local35.anInt4867 * -1295732567) {
				local71 = (this.anInt3246 >> 16 & 0xFF00) + (this.anInt3252 >> 24 & 0xFF) + local35.anInt4871 * 1256533615 * arg1;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 > 65535) {
					local71 = 65535;
				}
				this.anInt3246 &= 0xFFFFFF;
				this.anInt3246 |= (local71 & 0xFF00) << 16;
				this.anInt3252 &= 0xFFFFFF;
				this.anInt3252 |= (local71 & 0xFF) << 24;
			}
		}
		if (local35.anInt4826 * 588877789 != -1 && this.aShort113 - this.aShort112 <= local35.anInt4872 * 556492509) {
			this.anInt3253 += local35.anInt4852 * 210470921 * arg1;
		}
		if (local35.anInt4830 * -700279591 != -1 && this.aShort113 - this.aShort112 <= local35.anInt4874 * -54052399) {
			this.anInt3250 += local35.anInt4875 * 329730669 * arg1;
		}
		if (this.aShort114 != 0) {
			this.aShort110 = (short) (this.aShort110 + this.aShort114 * arg1 & 0x3FFF);
		}
		@Pc(337) double local337 = (double) this.aShort117;
		@Pc(341) double local341 = (double) this.aShort115;
		@Pc(345) double local345 = (double) this.aShort116;
		@Pc(347) boolean local347 = false;
		@Pc(362) int local362;
		@Pc(371) int local371;
		@Pc(380) int local380;
		@Pc(397) int local397;
		@Pc(407) long local407;
		if (local35.anInt4824 * -1469004293 == 1) {
			local362 = local17 - this.aClass667_1.aClass673_2.anInt5722 * 99654427;
			local371 = local22 - this.aClass667_1.aClass673_2.anInt5729 * -1465801059;
			local380 = local27 - this.aClass667_1.aClass673_2.anInt5732 * 478669299;
			local397 = (int) Math.sqrt((double) (local362 * local362 + local371 * local371 + local380 * local380)) >> 2;
			local407 = local35.anInt4864 * -2012276753 * local397 * arg1;
			this.anInt3253 = (int) ((long) this.anInt3253 - ((long) this.anInt3253 * local407 >> 18));
		} else if (local35.anInt4824 * -1469004293 == 2) {
			local362 = local17 - this.aClass667_1.aClass673_2.anInt5722 * 99654427;
			local371 = local22 - this.aClass667_1.aClass673_2.anInt5729 * -1465801059;
			local380 = local27 - this.aClass667_1.aClass673_2.anInt5732 * 478669299;
			local397 = local362 * local362 + local371 * local371 + local380 * local380;
			local407 = local35.anInt4864 * -2012276753 * local397 * arg1;
			this.anInt3253 = (int) ((long) this.anInt3253 - ((long) this.anInt3253 * local407 >> 28));
		}
		@Pc(505) Class80_Sub34 local505;
		@Pc(508) Class433 local508;
		if (local35.anIntArray447 != null) {
			@Pc(498) Iterator local498 = local31.aList26.iterator();
			label225: while (true) {
				do {
					if (!local498.hasNext()) {
						break label225;
					}
					local505 = (Class80_Sub34) local498.next();
					local508 = local505.aClass433_1;
				} while (local508.anInt4737 * 821164565 == 1);
				@Pc(517) boolean local517 = false;
				for (@Pc(519) int local519 = 0; local519 < local35.anIntArray447.length; local519++) {
					if (local35.anIntArray447[local519] == local508.anInt4727 * 675213125) {
						local517 = true;
						break;
					}
				}
				if (local517) {
					@Pc(549) double local549 = (double) (local17 - local505.anInt1658 * -625540541);
					@Pc(557) double local557 = (double) (local22 - local505.anInt1656 * 1972615133);
					@Pc(565) double local565 = (double) (local27 - local505.anInt1657 * 1383865129);
					@Pc(577) double local577 = local549 * local549 + local557 * local557 + local565 * local565;
					if (!(local577 > (double) (local508.aLong381 * -2485574573323355369L))) {
						@Pc(589) double local589 = Math.sqrt(local577);
						if (local589 == 0.0D) {
							local589 = 1.0D;
						}
						@Pc(625) double local625 = (local549 * (double) local505.aFloat146 + local557 * (double) (local508.anInt4731 * -1950447595) + local565 * (double) local505.aFloat145) * 65535.0D / ((double) (local508.anInt4738 * -1433620913) * local589);
						if (!(local625 < (double) (local508.anInt4719 * -1240438515))) {
							@Pc(636) double local636 = 0.0D;
							if (local508.anInt4726 * 1081500269 == 1) {
								local636 = local589 / 16.0D * (double) (local508.anInt4734 * -1432924319);
							} else if (local508.anInt4726 * 1081500269 == 2) {
								local636 = local589 / 16.0D * (local589 / 16.0D) * (double) (local508.anInt4734 * -1432924319);
							}
							if (local508.anInt4728 * -1541647541 != 0) {
								@Pc(779) double local779 = local549 / local589 * (double) (local508.anInt4738 * -1433620913);
								@Pc(789) double local789 = local557 / local589 * (double) (local508.anInt4738 * -1433620913);
								@Pc(799) double local799 = local565 / local589 * (double) (local508.anInt4738 * -1433620913);
								if (local508.anInt4733 * 1483126189 == 0) {
									local337 += local779 * (double) arg1;
									local341 += local789 * (double) arg1;
									local345 += local799 * (double) arg1;
									local347 = true;
								} else {
									this.anInt3247 = (int) ((double) this.anInt3247 + local779 * (double) arg1);
									this.anInt3248 = (int) ((double) this.anInt3248 + local789 * (double) arg1);
									this.anInt3251 = (int) ((double) this.anInt3251 + local799 * (double) arg1);
								}
							} else if (local508.anInt4733 * 1483126189 == 0) {
								local337 += ((double) local505.aFloat146 - local636) * (double) arg1;
								local341 += ((double) (local508.anInt4731 * -1950447595) - local636) * (double) arg1;
								local345 += ((double) local505.aFloat145 - local636) * (double) arg1;
								local347 = true;
							} else {
								this.anInt3247 = (int) ((double) this.anInt3247 + ((double) local505.aFloat146 - local636) * (double) arg1);
								this.anInt3248 = (int) ((double) this.anInt3248 + ((double) (local508.anInt4731 * -1950447595) - local636) * (double) arg1);
								this.anInt3251 = (int) ((double) this.anInt3251 + ((double) local505.aFloat145 - local636) * (double) arg1);
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray448 != null) {
			label206: for (local362 = 0; local362 < local35.anIntArray448.length; local362++) {
				local505 = (Class80_Sub34) Class654.aClass24_39.method560((long) local35.anIntArray448[local362]);
				while (true) {
					while (true) {
						if (local505 == null) {
							continue label206;
						}
						local508 = local505.aClass433_1;
						@Pc(894) double local894 = (double) (local17 - local505.anInt1658 * -625540541);
						@Pc(902) double local902 = (double) (local22 - local505.anInt1656 * 1972615133);
						@Pc(910) double local910 = (double) (local27 - local505.anInt1657 * 1383865129);
						@Pc(922) double local922 = local894 * local894 + local902 * local902 + local910 * local910;
						if (local922 > (double) (local508.aLong381 * -2485574573323355369L)) {
							local505 = (Class80_Sub34) Class654.aClass24_39.method558((byte) 0);
						} else {
							@Pc(939) double local939 = Math.sqrt(local922);
							if (local939 == 0.0D) {
								local939 = 1.0D;
							}
							@Pc(986) double local986;
							if (local508.anInt4736 * -1765232359 > 0 && local508.anInt4736 * -1765232359 < 2047) {
								local986 = (local894 * (double) local505.aFloat146 + local902 * (double) (local508.anInt4731 * -1950447595) + local910 * (double) local505.aFloat145) * 16384.0D / ((double) (local508.anInt4738 * -1433620913) * local939);
								if (local986 < (double) (local508.anInt4719 * -1240438515)) {
									local505 = (Class80_Sub34) Class654.aClass24_39.method558((byte) 0);
									continue;
								}
							}
							local986 = 0.0D;
							if (local508.anInt4726 * 1081500269 == 1) {
								local986 = local939 / 16.0D * (double) (local508.anInt4734 * -1432924319);
							} else if (local508.anInt4726 * 1081500269 == 2) {
								local986 = local939 / 16.0D * (local939 / 16.0D) * (double) (local508.anInt4734 * -1432924319);
							}
							if (local508.anInt4728 * -1541647541 != 0) {
								@Pc(1145) double local1145 = local894 / local939 * (double) (local508.anInt4738 * -1433620913);
								@Pc(1155) double local1155 = local902 / local939 * (double) (local508.anInt4738 * -1433620913);
								@Pc(1165) double local1165 = local910 / local939 * (double) (local508.anInt4738 * -1433620913);
								if (local508.anInt4733 * 1483126189 == 0) {
									local337 += local1145 * (double) arg1;
									local341 += local1155 * (double) arg1;
									local345 += local1165 * (double) arg1;
									local347 = true;
								} else {
									this.anInt3247 = (int) ((double) this.anInt3247 + local1145 * (double) arg1);
									this.anInt3248 = (int) ((double) this.anInt3248 + local1155 * (double) arg1);
									this.anInt3251 = (int) ((double) this.anInt3251 + local1165 * (double) arg1);
								}
							} else if (local508.anInt4733 * 1483126189 == 0) {
								local337 += ((double) local505.aFloat146 - local986) * (double) arg1;
								local341 += ((double) (local508.anInt4731 * -1950447595) - local986) * (double) arg1;
								local345 += ((double) local505.aFloat145 - local986) * (double) arg1;
								local347 = true;
							} else {
								this.anInt3247 = (int) ((double) this.anInt3247 + ((double) local505.aFloat146 - local986) * (double) arg1);
								this.anInt3248 = (int) ((double) this.anInt3248 + ((double) (local508.anInt4731 * -1950447595) - local986) * (double) arg1);
								this.anInt3251 = (int) ((double) this.anInt3251 + ((double) local505.aFloat145 - local986) * (double) arg1);
							}
							local505 = (Class80_Sub34) Class654.aClass24_39.method558((byte) 0);
						}
					}
				}
			}
		}
		if (local35.anIntArray450 != null) {
			if (local35.anIntArray449 == null) {
				local35.anIntArray449 = new int[local35.anIntArray450.length];
				for (local362 = 0; local362 < local35.anIntArray450.length; local362++) {
					Class518.anInterface48_1.method29225(local35.anIntArray450[local362], (byte) 60);
					local35.anIntArray449[local362] = Class155.method15058(local35.anIntArray450[local362], -1952436405);
				}
			}
			for (local362 = 0; local362 < local35.anIntArray449.length; local362++) {
				@Pc(1288) Class433 local1288 = Class654.aClass433Array1[local35.anIntArray449[local362]];
				if (local1288.anInt4733 * 1483126189 == 0) {
					local337 += local1288.anInt4730 * -1146755817 * arg1;
					local341 += local1288.anInt4731 * -1950447595 * arg1;
					local345 += local1288.anInt4732 * -476916787 * arg1;
					local347 = true;
				} else {
					this.anInt3247 += local1288.anInt4730 * -1146755817 * arg1;
					this.anInt3248 += local1288.anInt4731 * -1950447595 * arg1;
					this.anInt3251 += local1288.anInt4732 * -476916787 * arg1;
				}
			}
		}
		if (local347) {
			while (true) {
				if (!(local337 > 32767.0D) && !(local341 > 32767.0D) && !(local345 > 32767.0D) && !(local337 < -32767.0D) && !(local341 < -32767.0D) && !(local345 < -32767.0D)) {
					this.aShort117 = (short) local337;
					this.aShort115 = (short) local341;
					this.aShort116 = (short) local345;
					break;
				}
				local337 /= 2.0D;
				local341 /= 2.0D;
				local345 /= 2.0D;
				this.anInt3253 <<= 0x1;
			}
		}
		this.anInt3247 = (int) ((long) this.anInt3247 + ((long) this.aShort117 * (long) (this.anInt3253 << 2) >> 23) * (long) arg1);
		this.anInt3248 = (int) ((long) this.anInt3248 + ((long) this.aShort115 * (long) (this.anInt3253 << 2) >> 23) * (long) arg1);
		this.anInt3251 = (int) ((long) this.anInt3251 + ((long) this.aShort116 * (long) (this.anInt3253 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!atq", name = "j", descriptor = "(Lclient!te;Lclient!di;J)V")
	void method23942(@OriginalArg(0) Class570 arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) long arg2) {
		@Pc(9) int local9 = this.anInt3247 >> arg0.anInt5258 * 1479624119 + 12;
		@Pc(19) int local19 = this.anInt3251 >> arg0.anInt5258 * 1479624119 + 12;
		@Pc(24) int local24 = this.anInt3248 >> 12;
		if (local24 > 262144 || local24 < -262144 || local9 < 0 || local9 >= arg0.anInt5245 * 1487025827 || local19 < 0 || local19 >= arg0.anInt5246 * -1561777241) {
			this.method23938();
			return;
		}
		@Pc(53) Class658 local53 = this.aClass667_1.aClass658_8;
		@Pc(57) Class441 local57 = this.aClass667_1.aClass441_1;
		@Pc(60) Class100[] local60 = arg0.aClass100Array1;
		@Pc(63) int local63 = local53.anInt5682;
		@Pc(73) Class568 local73 = arg0.aClass568ArrayArrayArray1[local53.anInt5682][local9][local19];
		if (local73 != null) {
			local63 = local73.aByte150;
		}
		@Pc(86) int local86 = local60[local63].method2917(local9, local19, -1001711647);
		@Pc(104) int local104;
		if (local63 < arg0.anInt5242 * 1984662039 - 1) {
			local104 = local60[local63 + 1].method2917(local9, local19, -1622390422);
		} else {
			local104 = local86 - (0x8 << arg0.anInt5258 * 1479624119);
		}
		if (local57.aBoolean873) {
			if (local57.anInt4842 * 702782141 == -1 && local24 > local86) {
				this.method23938();
				return;
			}
			if (local57.anInt4842 * 702782141 >= 0 && local24 > local60[local57.anInt4842 * 702782141].method2917(local9, local19, -1744126422)) {
				this.method23938();
				return;
			}
			if (local57.anInt4844 * 1595710683 == -1 && local24 < local104) {
				this.method23938();
				return;
			}
			if (local57.anInt4844 * 1595710683 >= 0 && local24 < local60[local57.anInt4844 * 1595710683 + 1].method2917(local9, local19, -1298318281)) {
				this.method23938();
				return;
			}
		}
		@Pc(190) int local190;
		for (local190 = arg0.anInt5242 * 1984662039 - 1; local190 > 0 && local24 > local60[local190].method2917(local9, local19, -1602971868); local190--) {
		}
		if (local57.aBoolean871 && local190 == 0 && local24 > local60[0].method2917(local9, local19, -1093701163)) {
			this.method23938();
		} else if (local190 == arg0.anInt5242 * 1984662039 - 1 && local60[local190].method2917(local9, local19, -1138255938) - local24 > 0x8 << arg0.anInt5258 * 1479624119) {
			this.method23938();
		} else {
			local73 = arg0.aClass568ArrayArrayArray1[local190][local9][local19];
			@Pc(305) int local305;
			if (local73 == null) {
				if (local190 == 0 || arg0.aClass568ArrayArrayArray1[0][local9][local19] == null) {
					local73 = arg0.aClass568ArrayArrayArray1[0][local9][local19] = new Class568(0);
				}
				@Pc(297) boolean local297 = arg0.aClass568ArrayArrayArray1[0][local9][local19].aClass568_1 != null;
				if (local190 == 3 && local297) {
					local190--;
				}
				for (local305 = 1; local305 <= local190; local305++) {
					if (arg0.aClass568ArrayArrayArray1[local305][local9][local19] == null) {
						local73 = arg0.aClass568ArrayArrayArray1[local305][local9][local19] = new Class568(local305);
						if (local297) {
							local73.aByte150++;
						}
					}
				}
				if (local73 == null) {
					local73 = arg0.aClass568ArrayArrayArray1[local190][local9][local19];
				}
			}
			if (local57.aBoolean870) {
				@Pc(361) int local361 = this.anInt3247 >> 12;
				local305 = this.anInt3251 >> 12;
				@Pc(375) Class589 local375;
				if (local73.aClass120_Sub1_Sub2_1 != null) {
					local375 = local73.aClass120_Sub1_Sub2_1.method24573(arg1, -1821358291);
					if (local375 != null && local375.method31908(local361, local24, local305)) {
						this.method23938();
						return;
					}
				}
				if (local73.aClass120_Sub1_Sub2_2 != null) {
					local375 = local73.aClass120_Sub1_Sub2_2.method24573(arg1, -1012739709);
					if (local375 != null && local375.method31908(local361, local24, local305)) {
						this.method23938();
						return;
					}
				}
				if (local73.aClass120_Sub1_Sub4_1 != null) {
					local375 = local73.aClass120_Sub1_Sub4_1.method24573(arg1, -1685426826);
					if (local375 != null && local375.method31908(local361, local24, local305)) {
						this.method23938();
						return;
					}
				}
				for (@Pc(429) Class594 local429 = local73.aClass594_2; local429 != null; local429 = local429.aClass594_3) {
					@Pc(437) Class589 local437 = local429.aClass120_Sub1_Sub1_1.method24573(arg1, 222870427);
					if (local437 != null && local437.method31908(local361, local24, local305)) {
						this.method23938();
						return;
					}
				}
			}
			local53.aClass221_1.aClass23_1.method552(this, 1294332398);
		}
	}

	@OriginalMember(owner = "client!atq", name = "r", descriptor = "()V")
	void method23943() {
		@Pc(4) int local4 = this.aClass667_1.aClass658_8.anInt5679;
		if (this.aClass667_1.aClass658_8.aClass147_Sub3_Sub1_Sub1Array2[local4] != null) {
			this.aClass667_1.aClass658_8.aClass147_Sub3_Sub1_Sub1Array2[local4].method23938();
		}
		this.aClass667_1.aClass658_8.aClass147_Sub3_Sub1_Sub1Array2[local4] = this;
		this.aShort111 = (short) this.aClass667_1.aClass658_8.anInt5679;
		this.aClass667_1.aClass658_8.anInt5679 = local4 + 1 & 0x1FFF;
		this.aClass667_1.aClass5_9.method90(this, 864007266);
	}

	@OriginalMember(owner = "client!atq", name = "s", descriptor = "(Lclient!xo;IIIIIIIIIIIIIZZ)V")
	void method23944(@OriginalArg(0) Class667 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15) {
		this.aClass667_1 = arg0;
		this.anInt3247 = arg1 << 12;
		this.anInt3248 = arg2 << 12;
		this.anInt3251 = arg3 << 12;
		this.anInt3246 = arg9;
		this.aShort113 = this.aShort112 = (short) arg8;
		this.anInt3250 = arg10;
		this.aShort110 = (short) arg11;
		this.aShort114 = (short) arg12;
		this.anInt3244 = arg13;
		this.aBoolean636 = arg15;
		this.aShort117 = (short) arg4;
		this.aShort115 = (short) arg5;
		this.aShort116 = (short) arg6;
		this.anInt3253 = arg7;
		this.method23940();
	}

	@OriginalMember(owner = "client!atq", name = "k", descriptor = "(Lclient!xo;IIIIIIIIIIIIIZZ)V")
	void method23945(@OriginalArg(0) Class667 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15) {
		this.aClass667_1 = arg0;
		this.anInt3247 = arg1 << 12;
		this.anInt3248 = arg2 << 12;
		this.anInt3251 = arg3 << 12;
		this.anInt3246 = arg9;
		this.aShort113 = this.aShort112 = (short) arg8;
		this.anInt3250 = arg10;
		this.aShort110 = (short) arg11;
		this.aShort114 = (short) arg12;
		this.anInt3244 = arg13;
		this.aBoolean636 = arg15;
		this.aShort117 = (short) arg4;
		this.aShort115 = (short) arg5;
		this.aShort116 = (short) arg6;
		this.anInt3253 = arg7;
		this.method23940();
	}

	@OriginalMember(owner = "client!atq", name = "x", descriptor = "(Lclient!xo;IIIIIIIIIIIIIZZ)V")
	void method23946(@OriginalArg(0) Class667 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15) {
		this.aClass667_1 = arg0;
		this.anInt3247 = arg1 << 12;
		this.anInt3248 = arg2 << 12;
		this.anInt3251 = arg3 << 12;
		this.anInt3246 = arg9;
		this.aShort113 = this.aShort112 = (short) arg8;
		this.anInt3250 = arg10;
		this.aShort110 = (short) arg11;
		this.aShort114 = (short) arg12;
		this.anInt3244 = arg13;
		this.aBoolean636 = arg15;
		this.aShort117 = (short) arg4;
		this.aShort115 = (short) arg5;
		this.aShort116 = (short) arg6;
		this.anInt3253 = arg7;
		this.method23940();
	}

	@OriginalMember(owner = "client!atq", name = "d", descriptor = "(Lclient!te;Lclient!di;J)V")
	void method23947(@OriginalArg(0) Class570 arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) long arg2) {
		@Pc(9) int local9 = this.anInt3247 >> arg0.anInt5258 * 1479624119 + 12;
		@Pc(19) int local19 = this.anInt3251 >> arg0.anInt5258 * 1479624119 + 12;
		@Pc(24) int local24 = this.anInt3248 >> 12;
		if (local24 > 262144 || local24 < -262144 || local9 < 0 || local9 >= arg0.anInt5245 * 1487025827 || local19 < 0 || local19 >= arg0.anInt5246 * -1561777241) {
			this.method23938();
			return;
		}
		@Pc(53) Class658 local53 = this.aClass667_1.aClass658_8;
		@Pc(57) Class441 local57 = this.aClass667_1.aClass441_1;
		@Pc(60) Class100[] local60 = arg0.aClass100Array1;
		@Pc(63) int local63 = local53.anInt5682;
		@Pc(73) Class568 local73 = arg0.aClass568ArrayArrayArray1[local53.anInt5682][local9][local19];
		if (local73 != null) {
			local63 = local73.aByte150;
		}
		@Pc(86) int local86 = local60[local63].method2917(local9, local19, -1081245343);
		@Pc(104) int local104;
		if (local63 < arg0.anInt5242 * 1984662039 - 1) {
			local104 = local60[local63 + 1].method2917(local9, local19, -504996331);
		} else {
			local104 = local86 - (0x8 << arg0.anInt5258 * 1479624119);
		}
		if (local57.aBoolean873) {
			if (local57.anInt4842 * 702782141 == -1 && local24 > local86) {
				this.method23938();
				return;
			}
			if (local57.anInt4842 * 702782141 >= 0 && local24 > local60[local57.anInt4842 * 702782141].method2917(local9, local19, -2119794903)) {
				this.method23938();
				return;
			}
			if (local57.anInt4844 * 1595710683 == -1 && local24 < local104) {
				this.method23938();
				return;
			}
			if (local57.anInt4844 * 1595710683 >= 0 && local24 < local60[local57.anInt4844 * 1595710683 + 1].method2917(local9, local19, -2012217462)) {
				this.method23938();
				return;
			}
		}
		@Pc(190) int local190;
		for (local190 = arg0.anInt5242 * 1984662039 - 1; local190 > 0 && local24 > local60[local190].method2917(local9, local19, -1734562576); local190--) {
		}
		if (local57.aBoolean871 && local190 == 0 && local24 > local60[0].method2917(local9, local19, -1382562389)) {
			this.method23938();
		} else if (local190 == arg0.anInt5242 * 1984662039 - 1 && local60[local190].method2917(local9, local19, -1408088898) - local24 > 0x8 << arg0.anInt5258 * 1479624119) {
			this.method23938();
		} else {
			local73 = arg0.aClass568ArrayArrayArray1[local190][local9][local19];
			@Pc(305) int local305;
			if (local73 == null) {
				if (local190 == 0 || arg0.aClass568ArrayArrayArray1[0][local9][local19] == null) {
					local73 = arg0.aClass568ArrayArrayArray1[0][local9][local19] = new Class568(0);
				}
				@Pc(297) boolean local297 = arg0.aClass568ArrayArrayArray1[0][local9][local19].aClass568_1 != null;
				if (local190 == 3 && local297) {
					local190--;
				}
				for (local305 = 1; local305 <= local190; local305++) {
					if (arg0.aClass568ArrayArrayArray1[local305][local9][local19] == null) {
						local73 = arg0.aClass568ArrayArrayArray1[local305][local9][local19] = new Class568(local305);
						if (local297) {
							local73.aByte150++;
						}
					}
				}
				if (local73 == null) {
					local73 = arg0.aClass568ArrayArrayArray1[local190][local9][local19];
				}
			}
			if (local57.aBoolean870) {
				@Pc(361) int local361 = this.anInt3247 >> 12;
				local305 = this.anInt3251 >> 12;
				@Pc(375) Class589 local375;
				if (local73.aClass120_Sub1_Sub2_1 != null) {
					local375 = local73.aClass120_Sub1_Sub2_1.method24573(arg1, -1708388864);
					if (local375 != null && local375.method31908(local361, local24, local305)) {
						this.method23938();
						return;
					}
				}
				if (local73.aClass120_Sub1_Sub2_2 != null) {
					local375 = local73.aClass120_Sub1_Sub2_2.method24573(arg1, -182596674);
					if (local375 != null && local375.method31908(local361, local24, local305)) {
						this.method23938();
						return;
					}
				}
				if (local73.aClass120_Sub1_Sub4_1 != null) {
					local375 = local73.aClass120_Sub1_Sub4_1.method24573(arg1, -843304059);
					if (local375 != null && local375.method31908(local361, local24, local305)) {
						this.method23938();
						return;
					}
				}
				for (@Pc(429) Class594 local429 = local73.aClass594_2; local429 != null; local429 = local429.aClass594_3) {
					@Pc(437) Class589 local437 = local429.aClass120_Sub1_Sub1_1.method24573(arg1, -770393827);
					if (local437 != null && local437.method31908(local361, local24, local305)) {
						this.method23938();
						return;
					}
				}
			}
			local53.aClass221_1.aClass23_1.method552(this, -1105730549);
		}
	}

	@OriginalMember(owner = "client!atq", name = "w", descriptor = "()V")
	void method23948() {
		@Pc(4) int local4 = this.aClass667_1.aClass658_8.anInt5679;
		if (this.aClass667_1.aClass658_8.aClass147_Sub3_Sub1_Sub1Array2[local4] != null) {
			this.aClass667_1.aClass658_8.aClass147_Sub3_Sub1_Sub1Array2[local4].method23938();
		}
		this.aClass667_1.aClass658_8.aClass147_Sub3_Sub1_Sub1Array2[local4] = this;
		this.aShort111 = (short) this.aClass667_1.aClass658_8.anInt5679;
		this.aClass667_1.aClass658_8.anInt5679 = local4 + 1 & 0x1FFF;
		this.aClass667_1.aClass5_9.method90(this, 864007266);
	}

	@OriginalMember(owner = "client!atq", name = "q", descriptor = "(JI)V")
	void method23949(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort112 = (short) (this.aShort112 - arg1);
		if (this.aShort112 <= 0) {
			this.method23938();
			return;
		}
		@Pc(17) int local17 = this.anInt3247 >> 12;
		@Pc(22) int local22 = this.anInt3248 >> 12;
		@Pc(27) int local27 = this.anInt3251 >> 12;
		@Pc(31) Class658 local31 = this.aClass667_1.aClass658_8;
		@Pc(35) Class441 local35 = this.aClass667_1.aClass441_1;
		if (local35.anInt4834 * -650899567 != 0) {
			@Pc(71) int local71;
			if (this.aShort113 - this.aShort112 <= local35.anInt4856 * 198932677) {
				local71 = (this.anInt3246 >> 8 & 0xFF00) + (this.anInt3252 >> 16 & 0xFF) + local35.anInt4818 * 2100839167 * arg1;
				@Pc(90) int local90 = (this.anInt3246 & 0xFF00) + (this.anInt3252 >> 8 & 0xFF) + local35.anInt4869 * -1225863335 * arg1;
				@Pc(109) int local109 = ((this.anInt3246 & 0xFF) << 8) + (this.anInt3252 & 0xFF) + local35.anInt4870 * -1925834317 * arg1;
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
				this.anInt3246 &= 0xFF000000;
				this.anInt3246 |= ((local71 & 0xFF00) << 8) + (local90 & 0xFF00) + (local109 >> 8 & 0xFF);
				this.anInt3252 &= 0xFF000000;
				this.anInt3252 |= ((local71 & 0xFF) << 16) + ((local90 & 0xFF) << 8) + (local109 & 0xFF);
			}
			if (this.aShort113 - this.aShort112 <= local35.anInt4867 * -1295732567) {
				local71 = (this.anInt3246 >> 16 & 0xFF00) + (this.anInt3252 >> 24 & 0xFF) + local35.anInt4871 * 1256533615 * arg1;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 > 65535) {
					local71 = 65535;
				}
				this.anInt3246 &= 0xFFFFFF;
				this.anInt3246 |= (local71 & 0xFF00) << 16;
				this.anInt3252 &= 0xFFFFFF;
				this.anInt3252 |= (local71 & 0xFF) << 24;
			}
		}
		if (local35.anInt4826 * 588877789 != -1 && this.aShort113 - this.aShort112 <= local35.anInt4872 * 556492509) {
			this.anInt3253 += local35.anInt4852 * 210470921 * arg1;
		}
		if (local35.anInt4830 * -700279591 != -1 && this.aShort113 - this.aShort112 <= local35.anInt4874 * -54052399) {
			this.anInt3250 += local35.anInt4875 * 329730669 * arg1;
		}
		if (this.aShort114 != 0) {
			this.aShort110 = (short) (this.aShort110 + this.aShort114 * arg1 & 0x3FFF);
		}
		@Pc(337) double local337 = (double) this.aShort117;
		@Pc(341) double local341 = (double) this.aShort115;
		@Pc(345) double local345 = (double) this.aShort116;
		@Pc(347) boolean local347 = false;
		@Pc(362) int local362;
		@Pc(371) int local371;
		@Pc(380) int local380;
		@Pc(397) int local397;
		@Pc(407) long local407;
		if (local35.anInt4824 * -1469004293 == 1) {
			local362 = local17 - this.aClass667_1.aClass673_2.anInt5722 * 99654427;
			local371 = local22 - this.aClass667_1.aClass673_2.anInt5729 * -1465801059;
			local380 = local27 - this.aClass667_1.aClass673_2.anInt5732 * 478669299;
			local397 = (int) Math.sqrt((double) (local362 * local362 + local371 * local371 + local380 * local380)) >> 2;
			local407 = local35.anInt4864 * -2012276753 * local397 * arg1;
			this.anInt3253 = (int) ((long) this.anInt3253 - ((long) this.anInt3253 * local407 >> 18));
		} else if (local35.anInt4824 * -1469004293 == 2) {
			local362 = local17 - this.aClass667_1.aClass673_2.anInt5722 * 99654427;
			local371 = local22 - this.aClass667_1.aClass673_2.anInt5729 * -1465801059;
			local380 = local27 - this.aClass667_1.aClass673_2.anInt5732 * 478669299;
			local397 = local362 * local362 + local371 * local371 + local380 * local380;
			local407 = local35.anInt4864 * -2012276753 * local397 * arg1;
			this.anInt3253 = (int) ((long) this.anInt3253 - ((long) this.anInt3253 * local407 >> 28));
		}
		@Pc(505) Class80_Sub34 local505;
		@Pc(508) Class433 local508;
		if (local35.anIntArray447 != null) {
			@Pc(498) Iterator local498 = local31.aList26.iterator();
			label225: while (true) {
				do {
					if (!local498.hasNext()) {
						break label225;
					}
					local505 = (Class80_Sub34) local498.next();
					local508 = local505.aClass433_1;
				} while (local508.anInt4737 * 821164565 == 1);
				@Pc(517) boolean local517 = false;
				for (@Pc(519) int local519 = 0; local519 < local35.anIntArray447.length; local519++) {
					if (local35.anIntArray447[local519] == local508.anInt4727 * 675213125) {
						local517 = true;
						break;
					}
				}
				if (local517) {
					@Pc(549) double local549 = (double) (local17 - local505.anInt1658 * -625540541);
					@Pc(557) double local557 = (double) (local22 - local505.anInt1656 * 1972615133);
					@Pc(565) double local565 = (double) (local27 - local505.anInt1657 * 1383865129);
					@Pc(577) double local577 = local549 * local549 + local557 * local557 + local565 * local565;
					if (!(local577 > (double) (local508.aLong381 * -2485574573323355369L))) {
						@Pc(589) double local589 = Math.sqrt(local577);
						if (local589 == 0.0D) {
							local589 = 1.0D;
						}
						@Pc(625) double local625 = (local549 * (double) local505.aFloat146 + local557 * (double) (local508.anInt4731 * -1950447595) + local565 * (double) local505.aFloat145) * 65535.0D / ((double) (local508.anInt4738 * -1433620913) * local589);
						if (!(local625 < (double) (local508.anInt4719 * -1240438515))) {
							@Pc(636) double local636 = 0.0D;
							if (local508.anInt4726 * 1081500269 == 1) {
								local636 = local589 / 16.0D * (double) (local508.anInt4734 * -1432924319);
							} else if (local508.anInt4726 * 1081500269 == 2) {
								local636 = local589 / 16.0D * (local589 / 16.0D) * (double) (local508.anInt4734 * -1432924319);
							}
							if (local508.anInt4728 * -1541647541 != 0) {
								@Pc(779) double local779 = local549 / local589 * (double) (local508.anInt4738 * -1433620913);
								@Pc(789) double local789 = local557 / local589 * (double) (local508.anInt4738 * -1433620913);
								@Pc(799) double local799 = local565 / local589 * (double) (local508.anInt4738 * -1433620913);
								if (local508.anInt4733 * 1483126189 == 0) {
									local337 += local779 * (double) arg1;
									local341 += local789 * (double) arg1;
									local345 += local799 * (double) arg1;
									local347 = true;
								} else {
									this.anInt3247 = (int) ((double) this.anInt3247 + local779 * (double) arg1);
									this.anInt3248 = (int) ((double) this.anInt3248 + local789 * (double) arg1);
									this.anInt3251 = (int) ((double) this.anInt3251 + local799 * (double) arg1);
								}
							} else if (local508.anInt4733 * 1483126189 == 0) {
								local337 += ((double) local505.aFloat146 - local636) * (double) arg1;
								local341 += ((double) (local508.anInt4731 * -1950447595) - local636) * (double) arg1;
								local345 += ((double) local505.aFloat145 - local636) * (double) arg1;
								local347 = true;
							} else {
								this.anInt3247 = (int) ((double) this.anInt3247 + ((double) local505.aFloat146 - local636) * (double) arg1);
								this.anInt3248 = (int) ((double) this.anInt3248 + ((double) (local508.anInt4731 * -1950447595) - local636) * (double) arg1);
								this.anInt3251 = (int) ((double) this.anInt3251 + ((double) local505.aFloat145 - local636) * (double) arg1);
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray448 != null) {
			label206: for (local362 = 0; local362 < local35.anIntArray448.length; local362++) {
				local505 = (Class80_Sub34) Class654.aClass24_39.method560((long) local35.anIntArray448[local362]);
				while (true) {
					while (true) {
						if (local505 == null) {
							continue label206;
						}
						local508 = local505.aClass433_1;
						@Pc(894) double local894 = (double) (local17 - local505.anInt1658 * -625540541);
						@Pc(902) double local902 = (double) (local22 - local505.anInt1656 * 1972615133);
						@Pc(910) double local910 = (double) (local27 - local505.anInt1657 * 1383865129);
						@Pc(922) double local922 = local894 * local894 + local902 * local902 + local910 * local910;
						if (local922 > (double) (local508.aLong381 * -2485574573323355369L)) {
							local505 = (Class80_Sub34) Class654.aClass24_39.method558((byte) 0);
						} else {
							@Pc(939) double local939 = Math.sqrt(local922);
							if (local939 == 0.0D) {
								local939 = 1.0D;
							}
							@Pc(986) double local986;
							if (local508.anInt4736 * -1765232359 > 0 && local508.anInt4736 * -1765232359 < 2047) {
								local986 = (local894 * (double) local505.aFloat146 + local902 * (double) (local508.anInt4731 * -1950447595) + local910 * (double) local505.aFloat145) * 16384.0D / ((double) (local508.anInt4738 * -1433620913) * local939);
								if (local986 < (double) (local508.anInt4719 * -1240438515)) {
									local505 = (Class80_Sub34) Class654.aClass24_39.method558((byte) 0);
									continue;
								}
							}
							local986 = 0.0D;
							if (local508.anInt4726 * 1081500269 == 1) {
								local986 = local939 / 16.0D * (double) (local508.anInt4734 * -1432924319);
							} else if (local508.anInt4726 * 1081500269 == 2) {
								local986 = local939 / 16.0D * (local939 / 16.0D) * (double) (local508.anInt4734 * -1432924319);
							}
							if (local508.anInt4728 * -1541647541 != 0) {
								@Pc(1145) double local1145 = local894 / local939 * (double) (local508.anInt4738 * -1433620913);
								@Pc(1155) double local1155 = local902 / local939 * (double) (local508.anInt4738 * -1433620913);
								@Pc(1165) double local1165 = local910 / local939 * (double) (local508.anInt4738 * -1433620913);
								if (local508.anInt4733 * 1483126189 == 0) {
									local337 += local1145 * (double) arg1;
									local341 += local1155 * (double) arg1;
									local345 += local1165 * (double) arg1;
									local347 = true;
								} else {
									this.anInt3247 = (int) ((double) this.anInt3247 + local1145 * (double) arg1);
									this.anInt3248 = (int) ((double) this.anInt3248 + local1155 * (double) arg1);
									this.anInt3251 = (int) ((double) this.anInt3251 + local1165 * (double) arg1);
								}
							} else if (local508.anInt4733 * 1483126189 == 0) {
								local337 += ((double) local505.aFloat146 - local986) * (double) arg1;
								local341 += ((double) (local508.anInt4731 * -1950447595) - local986) * (double) arg1;
								local345 += ((double) local505.aFloat145 - local986) * (double) arg1;
								local347 = true;
							} else {
								this.anInt3247 = (int) ((double) this.anInt3247 + ((double) local505.aFloat146 - local986) * (double) arg1);
								this.anInt3248 = (int) ((double) this.anInt3248 + ((double) (local508.anInt4731 * -1950447595) - local986) * (double) arg1);
								this.anInt3251 = (int) ((double) this.anInt3251 + ((double) local505.aFloat145 - local986) * (double) arg1);
							}
							local505 = (Class80_Sub34) Class654.aClass24_39.method558((byte) 0);
						}
					}
				}
			}
		}
		if (local35.anIntArray450 != null) {
			if (local35.anIntArray449 == null) {
				local35.anIntArray449 = new int[local35.anIntArray450.length];
				for (local362 = 0; local362 < local35.anIntArray450.length; local362++) {
					Class518.anInterface48_1.method29225(local35.anIntArray450[local362], (byte) -29);
					local35.anIntArray449[local362] = Class155.method15058(local35.anIntArray450[local362], -1722823799);
				}
			}
			for (local362 = 0; local362 < local35.anIntArray449.length; local362++) {
				@Pc(1288) Class433 local1288 = Class654.aClass433Array1[local35.anIntArray449[local362]];
				if (local1288.anInt4733 * 1483126189 == 0) {
					local337 += local1288.anInt4730 * -1146755817 * arg1;
					local341 += local1288.anInt4731 * -1950447595 * arg1;
					local345 += local1288.anInt4732 * -476916787 * arg1;
					local347 = true;
				} else {
					this.anInt3247 += local1288.anInt4730 * -1146755817 * arg1;
					this.anInt3248 += local1288.anInt4731 * -1950447595 * arg1;
					this.anInt3251 += local1288.anInt4732 * -476916787 * arg1;
				}
			}
		}
		if (local347) {
			while (true) {
				if (!(local337 > 32767.0D) && !(local341 > 32767.0D) && !(local345 > 32767.0D) && !(local337 < -32767.0D) && !(local341 < -32767.0D) && !(local345 < -32767.0D)) {
					this.aShort117 = (short) local337;
					this.aShort115 = (short) local341;
					this.aShort116 = (short) local345;
					break;
				}
				local337 /= 2.0D;
				local341 /= 2.0D;
				local345 /= 2.0D;
				this.anInt3253 <<= 0x1;
			}
		}
		this.anInt3247 = (int) ((long) this.anInt3247 + ((long) this.aShort117 * (long) (this.anInt3253 << 2) >> 23) * (long) arg1);
		this.anInt3248 = (int) ((long) this.anInt3248 + ((long) this.aShort115 * (long) (this.anInt3253 << 2) >> 23) * (long) arg1);
		this.anInt3251 = (int) ((long) this.anInt3251 + ((long) this.aShort116 * (long) (this.anInt3253 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!atq", name = "h", descriptor = "(Lclient!te;Lclient!di;J)V")
	void method23950(@OriginalArg(0) Class570 arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) long arg2) {
		@Pc(9) int local9 = this.anInt3247 >> arg0.anInt5258 * 1479624119 + 12;
		@Pc(19) int local19 = this.anInt3251 >> arg0.anInt5258 * 1479624119 + 12;
		@Pc(24) int local24 = this.anInt3248 >> 12;
		if (local24 > 262144 || local24 < -262144 || local9 < 0 || local9 >= arg0.anInt5245 * 1487025827 || local19 < 0 || local19 >= arg0.anInt5246 * -1561777241) {
			this.method23938();
			return;
		}
		@Pc(53) Class658 local53 = this.aClass667_1.aClass658_8;
		@Pc(57) Class441 local57 = this.aClass667_1.aClass441_1;
		@Pc(60) Class100[] local60 = arg0.aClass100Array1;
		@Pc(63) int local63 = local53.anInt5682;
		@Pc(73) Class568 local73 = arg0.aClass568ArrayArrayArray1[local53.anInt5682][local9][local19];
		if (local73 != null) {
			local63 = local73.aByte150;
		}
		@Pc(86) int local86 = local60[local63].method2917(local9, local19, -1941239849);
		@Pc(104) int local104;
		if (local63 < arg0.anInt5242 * 1984662039 - 1) {
			local104 = local60[local63 + 1].method2917(local9, local19, -288639828);
		} else {
			local104 = local86 - (0x8 << arg0.anInt5258 * 1479624119);
		}
		if (local57.aBoolean873) {
			if (local57.anInt4842 * 702782141 == -1 && local24 > local86) {
				this.method23938();
				return;
			}
			if (local57.anInt4842 * 702782141 >= 0 && local24 > local60[local57.anInt4842 * 702782141].method2917(local9, local19, -1125310937)) {
				this.method23938();
				return;
			}
			if (local57.anInt4844 * 1595710683 == -1 && local24 < local104) {
				this.method23938();
				return;
			}
			if (local57.anInt4844 * 1595710683 >= 0 && local24 < local60[local57.anInt4844 * 1595710683 + 1].method2917(local9, local19, -1922262533)) {
				this.method23938();
				return;
			}
		}
		@Pc(190) int local190;
		for (local190 = arg0.anInt5242 * 1984662039 - 1; local190 > 0 && local24 > local60[local190].method2917(local9, local19, -1035660938); local190--) {
		}
		if (local57.aBoolean871 && local190 == 0 && local24 > local60[0].method2917(local9, local19, -1164259816)) {
			this.method23938();
		} else if (local190 == arg0.anInt5242 * 1984662039 - 1 && local60[local190].method2917(local9, local19, -1929185567) - local24 > 0x8 << arg0.anInt5258 * 1479624119) {
			this.method23938();
		} else {
			local73 = arg0.aClass568ArrayArrayArray1[local190][local9][local19];
			@Pc(305) int local305;
			if (local73 == null) {
				if (local190 == 0 || arg0.aClass568ArrayArrayArray1[0][local9][local19] == null) {
					local73 = arg0.aClass568ArrayArrayArray1[0][local9][local19] = new Class568(0);
				}
				@Pc(297) boolean local297 = arg0.aClass568ArrayArrayArray1[0][local9][local19].aClass568_1 != null;
				if (local190 == 3 && local297) {
					local190--;
				}
				for (local305 = 1; local305 <= local190; local305++) {
					if (arg0.aClass568ArrayArrayArray1[local305][local9][local19] == null) {
						local73 = arg0.aClass568ArrayArrayArray1[local305][local9][local19] = new Class568(local305);
						if (local297) {
							local73.aByte150++;
						}
					}
				}
				if (local73 == null) {
					local73 = arg0.aClass568ArrayArrayArray1[local190][local9][local19];
				}
			}
			if (local57.aBoolean870) {
				@Pc(361) int local361 = this.anInt3247 >> 12;
				local305 = this.anInt3251 >> 12;
				@Pc(375) Class589 local375;
				if (local73.aClass120_Sub1_Sub2_1 != null) {
					local375 = local73.aClass120_Sub1_Sub2_1.method24573(arg1, -1485319620);
					if (local375 != null && local375.method31908(local361, local24, local305)) {
						this.method23938();
						return;
					}
				}
				if (local73.aClass120_Sub1_Sub2_2 != null) {
					local375 = local73.aClass120_Sub1_Sub2_2.method24573(arg1, -1587674236);
					if (local375 != null && local375.method31908(local361, local24, local305)) {
						this.method23938();
						return;
					}
				}
				if (local73.aClass120_Sub1_Sub4_1 != null) {
					local375 = local73.aClass120_Sub1_Sub4_1.method24573(arg1, -1910331116);
					if (local375 != null && local375.method31908(local361, local24, local305)) {
						this.method23938();
						return;
					}
				}
				for (@Pc(429) Class594 local429 = local73.aClass594_2; local429 != null; local429 = local429.aClass594_3) {
					@Pc(437) Class589 local437 = local429.aClass120_Sub1_Sub1_1.method24573(arg1, -55478644);
					if (local437 != null && local437.method31908(local361, local24, local305)) {
						this.method23938();
						return;
					}
				}
			}
			local53.aClass221_1.aClass23_1.method552(this, -1168225819);
		}
	}

	@OriginalMember(owner = "client!atq", name = "z", descriptor = "(Lclient!te;Lclient!di;J)V")
	void method23951(@OriginalArg(0) Class570 arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) long arg2) {
		@Pc(9) int local9 = this.anInt3247 >> arg0.anInt5258 * 1479624119 + 12;
		@Pc(19) int local19 = this.anInt3251 >> arg0.anInt5258 * 1479624119 + 12;
		@Pc(24) int local24 = this.anInt3248 >> 12;
		if (local24 > 262144 || local24 < -262144 || local9 < 0 || local9 >= arg0.anInt5245 * 1487025827 || local19 < 0 || local19 >= arg0.anInt5246 * -1561777241) {
			this.method23938();
			return;
		}
		@Pc(53) Class658 local53 = this.aClass667_1.aClass658_8;
		@Pc(57) Class441 local57 = this.aClass667_1.aClass441_1;
		@Pc(60) Class100[] local60 = arg0.aClass100Array1;
		@Pc(63) int local63 = local53.anInt5682;
		@Pc(73) Class568 local73 = arg0.aClass568ArrayArrayArray1[local53.anInt5682][local9][local19];
		if (local73 != null) {
			local63 = local73.aByte150;
		}
		@Pc(86) int local86 = local60[local63].method2917(local9, local19, -1016327545);
		@Pc(104) int local104;
		if (local63 < arg0.anInt5242 * 1984662039 - 1) {
			local104 = local60[local63 + 1].method2917(local9, local19, -327040645);
		} else {
			local104 = local86 - (0x8 << arg0.anInt5258 * 1479624119);
		}
		if (local57.aBoolean873) {
			if (local57.anInt4842 * 702782141 == -1 && local24 > local86) {
				this.method23938();
				return;
			}
			if (local57.anInt4842 * 702782141 >= 0 && local24 > local60[local57.anInt4842 * 702782141].method2917(local9, local19, -2146901186)) {
				this.method23938();
				return;
			}
			if (local57.anInt4844 * 1595710683 == -1 && local24 < local104) {
				this.method23938();
				return;
			}
			if (local57.anInt4844 * 1595710683 >= 0 && local24 < local60[local57.anInt4844 * 1595710683 + 1].method2917(local9, local19, -1662883817)) {
				this.method23938();
				return;
			}
		}
		@Pc(190) int local190;
		for (local190 = arg0.anInt5242 * 1984662039 - 1; local190 > 0 && local24 > local60[local190].method2917(local9, local19, -279858434); local190--) {
		}
		if (local57.aBoolean871 && local190 == 0 && local24 > local60[0].method2917(local9, local19, -808020910)) {
			this.method23938();
		} else if (local190 == arg0.anInt5242 * 1984662039 - 1 && local60[local190].method2917(local9, local19, -205700178) - local24 > 0x8 << arg0.anInt5258 * 1479624119) {
			this.method23938();
		} else {
			local73 = arg0.aClass568ArrayArrayArray1[local190][local9][local19];
			@Pc(305) int local305;
			if (local73 == null) {
				if (local190 == 0 || arg0.aClass568ArrayArrayArray1[0][local9][local19] == null) {
					local73 = arg0.aClass568ArrayArrayArray1[0][local9][local19] = new Class568(0);
				}
				@Pc(297) boolean local297 = arg0.aClass568ArrayArrayArray1[0][local9][local19].aClass568_1 != null;
				if (local190 == 3 && local297) {
					local190--;
				}
				for (local305 = 1; local305 <= local190; local305++) {
					if (arg0.aClass568ArrayArrayArray1[local305][local9][local19] == null) {
						local73 = arg0.aClass568ArrayArrayArray1[local305][local9][local19] = new Class568(local305);
						if (local297) {
							local73.aByte150++;
						}
					}
				}
				if (local73 == null) {
					local73 = arg0.aClass568ArrayArrayArray1[local190][local9][local19];
				}
			}
			if (local57.aBoolean870) {
				@Pc(361) int local361 = this.anInt3247 >> 12;
				local305 = this.anInt3251 >> 12;
				@Pc(375) Class589 local375;
				if (local73.aClass120_Sub1_Sub2_1 != null) {
					local375 = local73.aClass120_Sub1_Sub2_1.method24573(arg1, -913746785);
					if (local375 != null && local375.method31908(local361, local24, local305)) {
						this.method23938();
						return;
					}
				}
				if (local73.aClass120_Sub1_Sub2_2 != null) {
					local375 = local73.aClass120_Sub1_Sub2_2.method24573(arg1, -1896998586);
					if (local375 != null && local375.method31908(local361, local24, local305)) {
						this.method23938();
						return;
					}
				}
				if (local73.aClass120_Sub1_Sub4_1 != null) {
					local375 = local73.aClass120_Sub1_Sub4_1.method24573(arg1, -1998473107);
					if (local375 != null && local375.method31908(local361, local24, local305)) {
						this.method23938();
						return;
					}
				}
				for (@Pc(429) Class594 local429 = local73.aClass594_2; local429 != null; local429 = local429.aClass594_3) {
					@Pc(437) Class589 local437 = local429.aClass120_Sub1_Sub1_1.method24573(arg1, -1790824156);
					if (local437 != null && local437.method31908(local361, local24, local305)) {
						this.method23938();
						return;
					}
				}
			}
			local53.aClass221_1.aClass23_1.method552(this, -1497100034);
		}
	}

	@OriginalMember(owner = "client!atq", name = "v", descriptor = "()V")
	void method23952() {
		this.aClass667_1.aClass658_8.aClass147_Sub3_Sub1_Sub1Array2[this.aShort111] = null;
		Class654.aClass147_Sub3_Sub1_Sub1Array1[Class654.anInt5669 * -715383901] = this;
		Class654.anInt5669 = (Class654.anInt5669 * -715383901 + 1 & 0x3FF) * 712437771;
		this.method23926(1213960325);
		this.method23933((byte) -44);
	}

	@OriginalMember(owner = "client!atq", name = "p", descriptor = "()V")
	void method23953() {
		this.aClass667_1.aClass658_8.aClass147_Sub3_Sub1_Sub1Array2[this.aShort111] = null;
		Class654.aClass147_Sub3_Sub1_Sub1Array1[Class654.anInt5669 * -715383901] = this;
		Class654.anInt5669 = (Class654.anInt5669 * -715383901 + 1 & 0x3FF) * 712437771;
		this.method23926(2105304504);
		this.method23933((byte) -65);
	}

	@OriginalMember(owner = "client!atq", name = "y", descriptor = "()V")
	void method23954() {
		this.aClass667_1.aClass658_8.aClass147_Sub3_Sub1_Sub1Array2[this.aShort111] = null;
		Class654.aClass147_Sub3_Sub1_Sub1Array1[Class654.anInt5669 * -715383901] = this;
		Class654.anInt5669 = (Class654.anInt5669 * -715383901 + 1 & 0x3FF) * 712437771;
		this.method23926(908561119);
		this.method23933((byte) -71);
	}

	@OriginalMember(owner = "client!atq", name = "n", descriptor = "()V")
	void method23955() {
		this.aClass667_1.aClass658_8.aClass147_Sub3_Sub1_Sub1Array2[this.aShort111] = null;
		Class654.aClass147_Sub3_Sub1_Sub1Array1[Class654.anInt5669 * -715383901] = this;
		Class654.anInt5669 = (Class654.anInt5669 * -715383901 + 1 & 0x3FF) * 712437771;
		this.method23926(2124434407);
		this.method23933((byte) -103);
	}
}
