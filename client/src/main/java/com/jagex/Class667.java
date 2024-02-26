package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xo")
public final class Class667 {

	@OriginalMember(owner = "client!xo", name = "qs", descriptor = "[Lclient!hx;")
	static Class327[] aClass327Array5;

	@OriginalMember(owner = "client!xo", name = "q", descriptor = "I")
	int anInt5701;

	@OriginalMember(owner = "client!xo", name = "r", descriptor = "I")
	int anInt5703;

	@OriginalMember(owner = "client!xo", name = "a", descriptor = "I")
	int anInt5704;

	@OriginalMember(owner = "client!xo", name = "s", descriptor = "I")
	int anInt5705;

	@OriginalMember(owner = "client!xo", name = "k", descriptor = "I")
	int anInt5706;

	@OriginalMember(owner = "client!xo", name = "x", descriptor = "I")
	int anInt5707;

	@OriginalMember(owner = "client!xo", name = "w", descriptor = "I")
	int anInt5708;

	@OriginalMember(owner = "client!xo", name = "g", descriptor = "I")
	int anInt5709;

	@OriginalMember(owner = "client!xo", name = "u", descriptor = "I")
	int anInt5702 = 0;

	@OriginalMember(owner = "client!xo", name = "m", descriptor = "Z")
	boolean aBoolean979 = false;

	@OriginalMember(owner = "client!xo", name = "o", descriptor = "Lclient!xx;")
	Class673 aClass673_2 = new Class673();

	@OriginalMember(owner = "client!xo", name = "j", descriptor = "Lclient!xx;")
	Class673 aClass673_1 = new Class673();

	@OriginalMember(owner = "client!xo", name = "h", descriptor = "Z")
	boolean aBoolean980 = false;

	@OriginalMember(owner = "client!xo", name = "d", descriptor = "Z")
	boolean aBoolean981 = false;

	@OriginalMember(owner = "client!xo", name = "t", descriptor = "Lclient!dm;")
	final Class228 aClass228_2;

	@OriginalMember(owner = "client!xo", name = "e", descriptor = "Lclient!xe;")
	final Class658 aClass658_8;

	@OriginalMember(owner = "client!xo", name = "i", descriptor = "J")
	long aLong411;

	@OriginalMember(owner = "client!xo", name = "f", descriptor = "Lclient!nl;")
	Class441 aClass441_1;

	@OriginalMember(owner = "client!xo", name = "l", descriptor = "Lclient!aac;")
	Class5 aClass5_9;

	@OriginalMember(owner = "client!xo", name = "o", descriptor = "(Lclient!yp;B)V")
	static void method33469(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(16) boolean local16 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] != 0;
		Class666.method33459(local16, -184178646);
	}

	@OriginalMember(owner = "client!xo", name = "gd", descriptor = "(Lclient!yp;B)V")
	static void method33470(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2098399549);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class585.method31855(local16, local22, arg0, -1713365129);
	}

	@OriginalMember(owner = "client!xo", name = "ur", descriptor = "(Lclient!yp;I)V")
	static void method33471(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2115991132);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anInt4124 * 1923070285;
	}

	@OriginalMember(owner = "client!xo", name = "adn", descriptor = "(Lclient!yp;I)V")
	static void method33472(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(31) int local31 = client.aClass533ArrayArray1[local23][local13].method30824((byte) 14);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local31 == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!xo", name = "u", descriptor = "(IIZI)I")
	public static int method33473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class80_Sub3 local4 = Class565.method31482(arg0, arg2, 105917101);
		if (local4 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(15) int local15 = 0;
			for (@Pc(17) int local17 = 0; local17 < local4.anIntArray178.length; local17++) {
				if (local4.anIntArray179[local17] == arg1) {
					local15 += local4.anIntArray178[local17];
				}
			}
			return local15;
		}
	}

	@OriginalMember(owner = "client!xo", name = "atz", descriptor = "(Lclient!yp;B)V")
	static void method33474(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!xo", name = "<init>", descriptor = "(Lclient!di;Lclient!dm;Lclient!xe;J)V")
	Class667(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class228 arg1, @OriginalArg(2) Class658 arg2, @OriginalArg(3) long arg3) {
		this.aClass228_2 = arg1;
		this.aClass658_8 = arg2;
		this.aLong411 = arg3 * -3365808086973607931L;
		this.aClass441_1 = this.aClass228_2.method25987(arg0.anInterface47_6, 1257356922);
		if (!arg0.method20671() && this.aClass441_1.anInt4821 * 2032421977 != -1) {
			this.aClass441_1 = arg0.anInterface47_6.method29270(this.aClass441_1.anInt4821 * 2032421977, -1681407132);
		}
		this.aClass5_9 = new Class5();
		this.anInt5702 = (int) ((double) (this.anInt5702 * 1330054067) + Math.random() * 64.0D) * 1983996795;
		this.method33461(-2138202675);
		this.aClass673_1.anInt5726 = this.aClass673_2.anInt5726;
		this.aClass673_1.anInt5730 = this.aClass673_2.anInt5730;
		this.aClass673_1.anInt5723 = this.aClass673_2.anInt5723;
		this.aClass673_1.anInt5724 = this.aClass673_2.anInt5724;
		this.aClass673_1.anInt5725 = this.aClass673_2.anInt5725;
		this.aClass673_1.anInt5731 = this.aClass673_2.anInt5731;
		this.aClass673_1.anInt5727 = this.aClass673_2.anInt5727;
		this.aClass673_1.anInt5728 = this.aClass673_2.anInt5728;
		this.aClass673_1.anInt5721 = this.aClass673_2.anInt5721;
	}

	@OriginalMember(owner = "client!xo", name = "f", descriptor = "(Lclient!di;JIZB)V")
	void method33460(@OriginalArg(0) Class102 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte arg4) {
		@Pc(50) int local50;
		if (this.aBoolean979) {
			arg3 = false;
		} else if (Class654.anInt5665 * 2087772395 < this.aClass441_1.anInt4848 * -1173047255) {
			arg3 = false;
		} else if (Class654.anInt5664 * -1981380807 > Class233.anIntArray352[Class654.anInt5665 * 2087772395]) {
			arg3 = false;
		} else if (this.aBoolean980) {
			arg3 = false;
		} else if (-967717265 * this.aClass441_1.anInt4847 != -1) {
			local50 = (int) (arg1 - this.aLong411 * -8019141587421020979L);
			if (this.aClass441_1.aBoolean866 || local50 <= this.aClass441_1.anInt4847 * -967717265) {
				local50 %= this.aClass441_1.anInt4847 * -967717265;
			} else {
				arg3 = false;
			}
			if (!this.aClass441_1.aBoolean865 && local50 < this.aClass441_1.anInt4877 * 1916660543) {
				arg3 = false;
			}
			if (this.aClass441_1.aBoolean865 && local50 >= this.aClass441_1.anInt4877 * 1916660543) {
				arg3 = false;
			}
		}
		this.anInt5709 = 0;
		for (@Pc(107) Class147_Sub3_Sub1_Sub1 local107 = (Class147_Sub3_Sub1_Sub1) this.aClass5_9.method93((byte) -23); local107 != null; local107 = (Class147_Sub3_Sub1_Sub1) this.aClass5_9.method110(570354584)) {
			local107.method23941(arg1, arg2);
			this.anInt5709 += 929172197;
		}
		if (arg3) {
			local50 = (this.aClass673_2.anInt5726 * -1789566271 + this.aClass673_2.anInt5724 * -157585787 + this.aClass673_2.anInt5727 * 1520949925) / 3;
			@Pc(169) int local169 = (this.aClass673_2.anInt5728 * 1967189039 + this.aClass673_2.anInt5725 * 60012361 + this.aClass673_2.anInt5730 * -224403723) / 3;
			@Pc(189) int local189 = (this.aClass673_2.anInt5723 * -1166825643 + this.aClass673_2.anInt5731 * 1901136555 + this.aClass673_2.anInt5721 * 341263379) / 3;
			@Pc(243) int local243;
			@Pc(255) int local255;
			@Pc(267) int local267;
			@Pc(279) int local279;
			@Pc(291) int local291;
			@Pc(303) int local303;
			@Pc(436) int local436;
			@Pc(493) int local493;
			@Pc(524) int local524;
			if (local50 != this.aClass673_2.anInt5722 * 99654427 || local169 != this.aClass673_2.anInt5729 * -1465801059 || this.aClass673_2.anInt5732 * 478669299 != local189 || !this.aBoolean981) {
				this.aClass673_2.anInt5722 = local50 * -1637857517;
				this.aClass673_2.anInt5729 = local169 * -1793454155;
				this.aClass673_2.anInt5732 = local189 * 1720112955;
				local243 = this.aClass673_2.anInt5724 * -157585787 - this.aClass673_2.anInt5726 * -1789566271;
				local255 = this.aClass673_2.anInt5725 * 60012361 - this.aClass673_2.anInt5730 * -224403723;
				local267 = this.aClass673_2.anInt5731 * 1901136555 - this.aClass673_2.anInt5723 * -1166825643;
				local279 = this.aClass673_2.anInt5727 * 1520949925 - this.aClass673_2.anInt5726 * -1789566271;
				local291 = this.aClass673_2.anInt5728 * 1967189039 - this.aClass673_2.anInt5730 * -224403723;
				local303 = this.aClass673_2.anInt5721 * 341263379 - this.aClass673_2.anInt5723 * -1166825643;
				this.anInt5704 = (local303 * local255 - local267 * local291) * -1349303991;
				this.anInt5705 = (local279 * local267 - local243 * local303) * 1587827207;
				this.anInt5706 = (local291 * local243 - local255 * local279) * 1761894181;
				while (true) {
					if (this.anInt5704 * 1897496825 <= 32767 && this.anInt5705 * -1444906057 <= 32767 && this.anInt5706 * 1329112237 <= 32767 && this.anInt5704 * 1897496825 >= -32767 && this.anInt5705 * -1444906057 >= -32767 && this.anInt5706 * 1329112237 >= -32767) {
						local436 = (int) Math.sqrt((double) (this.anInt5705 * -1444906057 * this.anInt5705 * -1444906057 + this.anInt5704 * 1897496825 * 1897496825 * this.anInt5704 + this.anInt5706 * 1329112237 * 1329112237 * this.anInt5706));
						if (local436 <= 0) {
							local436 = 1;
						}
						this.anInt5704 = this.anInt5704 * 1331887879 / local436 * -1349303991;
						this.anInt5705 = this.anInt5705 * -1812265911 / local436 * 1587827207;
						this.anInt5706 = this.anInt5706 * 52288339 / local436 * 1761894181;
						if (this.aClass441_1.aShort173 > 0 || this.aClass441_1.aShort175 > 0) {
							local493 = (int) (Math.atan2((double) (this.anInt5706 * 1329112237), (double) (this.anInt5704 * 1897496825)) * 2607.5945876176133D);
							local524 = (int) (Math.atan2((double) (this.anInt5705 * -1444906057), Math.sqrt((double) (this.anInt5706 * 1329112237 * 1329112237 * this.anInt5706 + this.anInt5704 * 1897496825 * this.anInt5704 * 1897496825))) * 2607.5945876176133D);
							this.anInt5708 = (this.aClass441_1.aShort173 - this.aClass441_1.aShort176) * 1427867635;
							this.anInt5707 = (local493 + this.aClass441_1.aShort176 - (this.anInt5708 * 1858562363 >> 1)) * -277223093;
							this.anInt5701 = (this.aClass441_1.aShort175 - this.aClass441_1.aShort174) * -196010431;
							this.anInt5703 = (local524 + this.aClass441_1.aShort174 - (this.anInt5701 * 69071297 >> 1)) * -2017935925;
						}
						this.aBoolean981 = true;
						break;
					}
					this.anInt5704 = (this.anInt5704 * 1897496825 >> 1) * -1349303991;
					this.anInt5705 = (this.anInt5705 * -1444906057 >> 1) * 1587827207;
					this.anInt5706 = (this.anInt5706 * 1329112237 >> 1) * 1761894181;
				}
			}
			this.anInt5702 += (int) ((double) arg2 * ((double) (this.aClass441_1.anInt4840 * 229737699) + Math.random() * (double) (this.aClass441_1.anInt4855 * 668664665 - this.aClass441_1.anInt4840 * 229737699))) * 1983996795;
			if (this.anInt5702 * 1330054067 > 63) {
				local243 = this.anInt5702 * 1330054067 >> 6;
				this.anInt5702 = (this.anInt5702 * 1330054067 & 0x3F) * 1983996795;
				local255 = (arg2 << 8) / local243;
				local303 = 0;
				local436 = 0;
				while (local436 < local243) {
					@Pc(697) int local697;
					@Pc(705) int local705;
					@Pc(709) int local709;
					if (this.aClass441_1.aShort173 <= 0 && this.aClass441_1.aShort175 <= 0) {
						local267 = this.anInt5704 * 1897496825;
						local279 = this.anInt5705 * -1444906057;
						local291 = this.anInt5706 * 1329112237;
					} else {
						local493 = this.anInt5707 * -363112349 + (int) ((double) (this.anInt5708 * 1858562363) * Math.random());
						local493 &= 0x3FFF;
						local524 = Class467.anIntArray454[local493];
						@Pc(683) int local683 = Class467.anIntArray453[local493];
						local697 = this.anInt5703 * -501710877 + (int) ((double) (this.anInt5701 * 69071297) * Math.random());
						@Pc(701) int local701 = local697 & 0x1FFF;
						local705 = Class467.anIntArray454[local701];
						local709 = Class467.anIntArray453[local701];
						@Pc(711) byte local711 = 13;
						local267 = local705 * local683 >> local711;
						local279 = (local709 << 1) * -1;
						local291 = local705 * local524 >> local711;
					}
					@Pc(748) float local748 = (float) Math.random();
					@Pc(751) float local751 = (float) Math.random();
					if (local748 + local751 > 1.0F) {
						local748 = 1.0F - local748;
						local751 = 1.0F - local751;
					}
					@Pc(771) float local771 = 1.0F - (local748 + local751);
					local697 = (int) (local748 * (float) (this.aClass673_2.anInt5726 * -1789566271) + local751 * (float) (this.aClass673_2.anInt5724 * -157585787) + local771 * (float) (this.aClass673_2.anInt5727 * 1520949925));
					local705 = (int) (local751 * (float) (this.aClass673_2.anInt5725 * 60012361) + local748 * (float) (this.aClass673_2.anInt5730 * -224403723) + local771 * (float) (this.aClass673_2.anInt5728 * 1967189039));
					local709 = (int) ((float) (this.aClass673_2.anInt5721 * 341263379) * local771 + (float) (this.aClass673_2.anInt5731 * 1901136555) * local751 + local748 * (float) (this.aClass673_2.anInt5723 * -1166825643));
					@Pc(877) int local877 = this.aClass441_1.anInt4822 * 1371189245 + (int) (Math.random() * (double) (this.aClass441_1.anInt4819 * 348650589 - this.aClass441_1.anInt4822 * 1371189245));
					@Pc(899) int local899 = this.aClass441_1.anInt4843 * 2030093429 + (int) (Math.random() * (double) (this.aClass441_1.anInt4839 * 1069131619 - this.aClass441_1.anInt4843 * 2030093429));
					@Pc(921) int local921 = this.aClass441_1.anInt4849 * 197851837 + (int) (Math.random() * (double) (this.aClass441_1.anInt4829 * 457745935 - this.aClass441_1.anInt4849 * 197851837));
					@Pc(927) int local927 = this.aClass441_1.anInt4850 * -1490575487;
					if (this.aClass441_1.anInt4876 * 1805988519 != 0) {
						if (this.aClass441_1.anInt4823 * 982056797 == 0) {
							local927 += (int) (Math.random() * (double) (this.aClass441_1.anInt4876 * 1805988519 + 1));
						} else {
							local927 += (int) (Math.random() * (double) (this.aClass441_1.anInt4823 * 982056797 + 1)) * (this.aClass441_1.anInt4876 * 1805988519 / (this.aClass441_1.anInt4823 * 982056797));
						}
					}
					@Pc(987) int local987 = this.aClass441_1.anInt4853 * 2088568563;
					if (this.aClass441_1.anInt4873 * -1518671149 != 0) {
						local987 += (int) (Math.random() * (double) (this.aClass441_1.anInt4873 * -1518671149 + 1));
					}
					@Pc(1087) int local1087;
					if (this.aClass441_1.aBoolean864) {
						@Pc(1013) double local1013 = Math.random();
						local1087 = (int) ((double) (this.aClass441_1.anInt4846 * 1059303861) + local1013 * (double) (this.aClass441_1.anInt4857 * 287836821)) << 16 | (int) ((double) (this.aClass441_1.anInt4836 * 1289335701) + (double) (this.aClass441_1.anInt4866 * 2068571619) * local1013) << 8 | (int) (local1013 * (double) (this.aClass441_1.anInt4862 * 1343467425) + (double) (this.aClass441_1.anInt4854 * 881534829)) | (int) ((double) (this.aClass441_1.anInt4858 * -1110965177) + Math.random() * (double) (this.aClass441_1.anInt4865 * 334951963)) << 24;
					} else {
						local1087 = (int) ((double) (this.aClass441_1.anInt4846 * 1059303861) + Math.random() * (double) (this.aClass441_1.anInt4857 * 287836821)) << 16 | (int) ((double) (this.aClass441_1.anInt4836 * 1289335701) + Math.random() * (double) (this.aClass441_1.anInt4866 * 2068571619)) << 8 | (int) ((double) (this.aClass441_1.anInt4854 * 881534829) + Math.random() * (double) (this.aClass441_1.anInt4862 * 1343467425)) | (int) ((double) (this.aClass441_1.anInt4858 * -1110965177) + Math.random() * (double) (this.aClass441_1.anInt4865 * 334951963)) << 24;
					}
					@Pc(1168) int local1168 = this.aClass441_1.anInt4837 * 2128159281;
					if (!arg0.method20671() && !this.aClass441_1.aBoolean868) {
						local1168 = -1;
					}
					@Pc(1190) Class147_Sub3_Sub1_Sub1 local1190;
					if (Class654.anInt5669 * -715383901 == Class654.anInt5672 * 1053668183) {
						local1190 = new Class147_Sub3_Sub1_Sub1(this, local697, local705, local709, local267, local279, local291, local877, local899, local1087, local921, local927, local987, local1168, this.aClass441_1.aBoolean867, this.aClass441_1.aBoolean869);
					} else {
						local1190 = Class654.aClass147_Sub3_Sub1_Sub1Array1[Class654.anInt5672 * 1053668183];
						Class654.anInt5672 = (Class654.anInt5672 * 1053668183 + 1 & 0x3FF) * 1765468263;
						local1190.method23939(this, local697, local705, local709, local267, local279, local291, local877, local899, local1087, local921, local927, local987, local1168, this.aClass441_1.aBoolean867, this.aClass441_1.aBoolean869);
					}
					if (local303 > 256) {
						local1190.method23941(arg1, local303 >> 8);
					}
					this.anInt5709 += 929172197;
					local436++;
					local303 += local255;
				}
			}
		}
		if (!this.aClass673_2.method33567(this.aClass673_1, (byte) 3)) {
			@Pc(1278) Class673 local1278 = this.aClass673_1;
			this.aClass673_1 = this.aClass673_2;
			this.aClass673_2 = local1278;
			this.aClass673_2.anInt5726 = this.aClass228_2.anInt3675 * -1675826451;
			this.aClass673_2.anInt5730 = this.aClass228_2.anInt3679 * -1535612833;
			this.aClass673_2.anInt5723 = this.aClass228_2.anInt3677 * -1047267557;
			this.aClass673_2.anInt5724 = this.aClass228_2.anInt3680 * 750705497;
			this.aClass673_2.anInt5725 = this.aClass228_2.anInt3670 * 1278111505;
			this.aClass673_2.anInt5731 = this.aClass228_2.anInt3678 * 1866689401;
			this.aClass673_2.anInt5727 = this.aClass228_2.anInt3676 * -405331819;
			this.aClass673_2.anInt5728 = this.aClass228_2.anInt3682 * -1179212633;
			this.aClass673_2.anInt5721 = this.aClass228_2.anInt3683 * -1670235687;
			this.aClass673_2.anInt5722 = this.aClass673_1.anInt5722;
			this.aClass673_2.anInt5729 = this.aClass673_1.anInt5729;
			this.aClass673_2.anInt5732 = this.aClass673_1.anInt5732;
		}
		Class654.anInt5668 += this.anInt5709 * 752510333;
	}

	@OriginalMember(owner = "client!xo", name = "t", descriptor = "(I)V")
	void method33461(@OriginalArg(0) int arg0) {
		this.aClass673_2.anInt5726 = this.aClass228_2.anInt3675 * -1675826451;
		this.aClass673_2.anInt5730 = this.aClass228_2.anInt3679 * -1535612833;
		this.aClass673_2.anInt5723 = this.aClass228_2.anInt3677 * -1047267557;
		this.aClass673_2.anInt5724 = this.aClass228_2.anInt3680 * 750705497;
		this.aClass673_2.anInt5725 = this.aClass228_2.anInt3670 * 1278111505;
		this.aClass673_2.anInt5731 = this.aClass228_2.anInt3678 * 1866689401;
		this.aClass673_2.anInt5727 = this.aClass228_2.anInt3676 * -405331819;
		this.aClass673_2.anInt5728 = this.aClass228_2.anInt3682 * -1179212633;
		this.aClass673_2.anInt5721 = this.aClass228_2.anInt3683 * -1670235687;
		if (this.aClass673_2.anInt5724 * -157585787 == this.aClass673_2.anInt5726 * -1789566271 && this.aClass673_2.anInt5727 * 1520949925 == this.aClass673_2.anInt5724 * -157585787 && this.aClass673_2.anInt5725 * 60012361 == this.aClass673_2.anInt5730 * -224403723 && this.aClass673_2.anInt5725 * 60012361 == this.aClass673_2.anInt5728 * 1967189039 && this.aClass673_2.anInt5731 * 1901136555 == this.aClass673_2.anInt5723 * -1166825643 && this.aClass673_2.anInt5731 * 1901136555 == this.aClass673_2.anInt5721 * 341263379) {
			this.aBoolean980 = true;
		} else if (this.aBoolean980) {
			this.aBoolean980 = false;
			this.aClass673_1.anInt5726 = this.aClass673_2.anInt5726;
			this.aClass673_1.anInt5730 = this.aClass673_2.anInt5730;
			this.aClass673_1.anInt5723 = this.aClass673_2.anInt5723;
			this.aClass673_1.anInt5724 = this.aClass673_2.anInt5724;
			this.aClass673_1.anInt5725 = this.aClass673_2.anInt5725;
			this.aClass673_1.anInt5731 = this.aClass673_2.anInt5731;
			this.aClass673_1.anInt5727 = this.aClass673_2.anInt5727;
			this.aClass673_1.anInt5728 = this.aClass673_2.anInt5728;
			this.aClass673_1.anInt5721 = this.aClass673_2.anInt5721;
		}
	}

	@OriginalMember(owner = "client!xo", name = "e", descriptor = "(Lclient!te;Lclient!di;J)V")
	void method33462(@OriginalArg(0) Class570 arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) long arg2) {
		for (@Pc(5) Class147_Sub3_Sub1_Sub1 local5 = (Class147_Sub3_Sub1_Sub1) this.aClass5_9.method93((byte) -115); local5 != null; local5 = (Class147_Sub3_Sub1_Sub1) this.aClass5_9.method110(254208373)) {
			local5.method23942(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!xo", name = "i", descriptor = "(Lclient!di;JIZ)V")
	void method33463(@OriginalArg(0) Class102 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(50) int local50;
		if (this.aBoolean979) {
			arg3 = false;
		} else if (Class654.anInt5665 * 2087772395 < this.aClass441_1.anInt4848 * -1173047255) {
			arg3 = false;
		} else if (Class654.anInt5664 * -1981380807 > Class233.anIntArray352[Class654.anInt5665 * 2087772395]) {
			arg3 = false;
		} else if (this.aBoolean980) {
			arg3 = false;
		} else if (-967717265 * this.aClass441_1.anInt4847 != -1) {
			local50 = (int) (arg1 - this.aLong411 * -8019141587421020979L);
			if (this.aClass441_1.aBoolean866 || local50 <= this.aClass441_1.anInt4847 * -967717265) {
				local50 %= this.aClass441_1.anInt4847 * -967717265;
			} else {
				arg3 = false;
			}
			if (!this.aClass441_1.aBoolean865 && local50 < this.aClass441_1.anInt4877 * 1916660543) {
				arg3 = false;
			}
			if (this.aClass441_1.aBoolean865 && local50 >= this.aClass441_1.anInt4877 * 1916660543) {
				arg3 = false;
			}
		}
		this.anInt5709 = 0;
		for (@Pc(107) Class147_Sub3_Sub1_Sub1 local107 = (Class147_Sub3_Sub1_Sub1) this.aClass5_9.method93((byte) -6); local107 != null; local107 = (Class147_Sub3_Sub1_Sub1) this.aClass5_9.method110(-1942445702)) {
			local107.method23941(arg1, arg2);
			this.anInt5709 += 929172197;
		}
		if (arg3) {
			local50 = (this.aClass673_2.anInt5726 * -1789566271 + this.aClass673_2.anInt5724 * -157585787 + this.aClass673_2.anInt5727 * 1520949925) / 3;
			@Pc(169) int local169 = (this.aClass673_2.anInt5728 * 1967189039 + this.aClass673_2.anInt5725 * 60012361 + this.aClass673_2.anInt5730 * -224403723) / 3;
			@Pc(189) int local189 = (this.aClass673_2.anInt5723 * -1166825643 + this.aClass673_2.anInt5731 * 1901136555 + this.aClass673_2.anInt5721 * 341263379) / 3;
			@Pc(243) int local243;
			@Pc(255) int local255;
			@Pc(267) int local267;
			@Pc(279) int local279;
			@Pc(291) int local291;
			@Pc(303) int local303;
			@Pc(436) int local436;
			@Pc(493) int local493;
			@Pc(524) int local524;
			if (local50 != this.aClass673_2.anInt5722 * 99654427 || local169 != this.aClass673_2.anInt5729 * -1465801059 || this.aClass673_2.anInt5732 * 478669299 != local189 || !this.aBoolean981) {
				this.aClass673_2.anInt5722 = local50 * -1637857517;
				this.aClass673_2.anInt5729 = local169 * -1793454155;
				this.aClass673_2.anInt5732 = local189 * 1720112955;
				local243 = this.aClass673_2.anInt5724 * -157585787 - this.aClass673_2.anInt5726 * -1789566271;
				local255 = this.aClass673_2.anInt5725 * 60012361 - this.aClass673_2.anInt5730 * -224403723;
				local267 = this.aClass673_2.anInt5731 * 1901136555 - this.aClass673_2.anInt5723 * -1166825643;
				local279 = this.aClass673_2.anInt5727 * 1520949925 - this.aClass673_2.anInt5726 * -1789566271;
				local291 = this.aClass673_2.anInt5728 * 1967189039 - this.aClass673_2.anInt5730 * -224403723;
				local303 = this.aClass673_2.anInt5721 * 341263379 - this.aClass673_2.anInt5723 * -1166825643;
				this.anInt5704 = (local303 * local255 - local267 * local291) * -1349303991;
				this.anInt5705 = (local279 * local267 - local243 * local303) * 1587827207;
				this.anInt5706 = (local291 * local243 - local255 * local279) * 1761894181;
				while (true) {
					if (this.anInt5704 * 1897496825 <= 32767 && this.anInt5705 * -1444906057 <= 32767 && this.anInt5706 * 1329112237 <= 32767 && this.anInt5704 * 1897496825 >= -32767 && this.anInt5705 * -1444906057 >= -32767 && this.anInt5706 * 1329112237 >= -32767) {
						local436 = (int) Math.sqrt((double) (this.anInt5705 * -1444906057 * this.anInt5705 * -1444906057 + this.anInt5704 * 1897496825 * 1897496825 * this.anInt5704 + this.anInt5706 * 1329112237 * 1329112237 * this.anInt5706));
						if (local436 <= 0) {
							local436 = 1;
						}
						this.anInt5704 = this.anInt5704 * 1331887879 / local436 * -1349303991;
						this.anInt5705 = this.anInt5705 * -1812265911 / local436 * 1587827207;
						this.anInt5706 = this.anInt5706 * 52288339 / local436 * 1761894181;
						if (this.aClass441_1.aShort173 > 0 || this.aClass441_1.aShort175 > 0) {
							local493 = (int) (Math.atan2((double) (this.anInt5706 * 1329112237), (double) (this.anInt5704 * 1897496825)) * 2607.5945876176133D);
							local524 = (int) (Math.atan2((double) (this.anInt5705 * -1444906057), Math.sqrt((double) (this.anInt5706 * 1329112237 * 1329112237 * this.anInt5706 + this.anInt5704 * 1897496825 * this.anInt5704 * 1897496825))) * 2607.5945876176133D);
							this.anInt5708 = (this.aClass441_1.aShort173 - this.aClass441_1.aShort176) * 1427867635;
							this.anInt5707 = (local493 + this.aClass441_1.aShort176 - (this.anInt5708 * 1858562363 >> 1)) * -277223093;
							this.anInt5701 = (this.aClass441_1.aShort175 - this.aClass441_1.aShort174) * -196010431;
							this.anInt5703 = (local524 + this.aClass441_1.aShort174 - (this.anInt5701 * 69071297 >> 1)) * -2017935925;
						}
						this.aBoolean981 = true;
						break;
					}
					this.anInt5704 = (this.anInt5704 * 1897496825 >> 1) * -1349303991;
					this.anInt5705 = (this.anInt5705 * -1444906057 >> 1) * 1587827207;
					this.anInt5706 = (this.anInt5706 * 1329112237 >> 1) * 1761894181;
				}
			}
			this.anInt5702 += (int) ((double) arg2 * ((double) (this.aClass441_1.anInt4840 * 229737699) + Math.random() * (double) (this.aClass441_1.anInt4855 * 668664665 - this.aClass441_1.anInt4840 * 229737699))) * 1983996795;
			if (this.anInt5702 * 1330054067 > 63) {
				local243 = this.anInt5702 * 1330054067 >> 6;
				this.anInt5702 = (this.anInt5702 * 1330054067 & 0x3F) * 1983996795;
				local255 = (arg2 << 8) / local243;
				local303 = 0;
				local436 = 0;
				while (local436 < local243) {
					@Pc(697) int local697;
					@Pc(705) int local705;
					@Pc(709) int local709;
					if (this.aClass441_1.aShort173 <= 0 && this.aClass441_1.aShort175 <= 0) {
						local267 = this.anInt5704 * 1897496825;
						local279 = this.anInt5705 * -1444906057;
						local291 = this.anInt5706 * 1329112237;
					} else {
						local493 = this.anInt5707 * -363112349 + (int) ((double) (this.anInt5708 * 1858562363) * Math.random());
						local493 &= 0x3FFF;
						local524 = Class467.anIntArray454[local493];
						@Pc(683) int local683 = Class467.anIntArray453[local493];
						local697 = this.anInt5703 * -501710877 + (int) ((double) (this.anInt5701 * 69071297) * Math.random());
						@Pc(701) int local701 = local697 & 0x1FFF;
						local705 = Class467.anIntArray454[local701];
						local709 = Class467.anIntArray453[local701];
						@Pc(711) byte local711 = 13;
						local267 = local705 * local683 >> local711;
						local279 = (local709 << 1) * -1;
						local291 = local705 * local524 >> local711;
					}
					@Pc(748) float local748 = (float) Math.random();
					@Pc(751) float local751 = (float) Math.random();
					if (local748 + local751 > 1.0F) {
						local748 = 1.0F - local748;
						local751 = 1.0F - local751;
					}
					@Pc(771) float local771 = 1.0F - (local748 + local751);
					local697 = (int) (local748 * (float) (this.aClass673_2.anInt5726 * -1789566271) + local751 * (float) (this.aClass673_2.anInt5724 * -157585787) + local771 * (float) (this.aClass673_2.anInt5727 * 1520949925));
					local705 = (int) (local751 * (float) (this.aClass673_2.anInt5725 * 60012361) + local748 * (float) (this.aClass673_2.anInt5730 * -224403723) + local771 * (float) (this.aClass673_2.anInt5728 * 1967189039));
					local709 = (int) ((float) (this.aClass673_2.anInt5721 * 341263379) * local771 + (float) (this.aClass673_2.anInt5731 * 1901136555) * local751 + local748 * (float) (this.aClass673_2.anInt5723 * -1166825643));
					@Pc(877) int local877 = this.aClass441_1.anInt4822 * 1371189245 + (int) (Math.random() * (double) (this.aClass441_1.anInt4819 * 348650589 - this.aClass441_1.anInt4822 * 1371189245));
					@Pc(899) int local899 = this.aClass441_1.anInt4843 * 2030093429 + (int) (Math.random() * (double) (this.aClass441_1.anInt4839 * 1069131619 - this.aClass441_1.anInt4843 * 2030093429));
					@Pc(921) int local921 = this.aClass441_1.anInt4849 * 197851837 + (int) (Math.random() * (double) (this.aClass441_1.anInt4829 * 457745935 - this.aClass441_1.anInt4849 * 197851837));
					@Pc(927) int local927 = this.aClass441_1.anInt4850 * -1490575487;
					if (this.aClass441_1.anInt4876 * 1805988519 != 0) {
						if (this.aClass441_1.anInt4823 * 982056797 == 0) {
							local927 += (int) (Math.random() * (double) (this.aClass441_1.anInt4876 * 1805988519 + 1));
						} else {
							local927 += (int) (Math.random() * (double) (this.aClass441_1.anInt4823 * 982056797 + 1)) * (this.aClass441_1.anInt4876 * 1805988519 / (this.aClass441_1.anInt4823 * 982056797));
						}
					}
					@Pc(987) int local987 = this.aClass441_1.anInt4853 * 2088568563;
					if (this.aClass441_1.anInt4873 * -1518671149 != 0) {
						local987 += (int) (Math.random() * (double) (this.aClass441_1.anInt4873 * -1518671149 + 1));
					}
					@Pc(1087) int local1087;
					if (this.aClass441_1.aBoolean864) {
						@Pc(1013) double local1013 = Math.random();
						local1087 = (int) ((double) (this.aClass441_1.anInt4846 * 1059303861) + local1013 * (double) (this.aClass441_1.anInt4857 * 287836821)) << 16 | (int) ((double) (this.aClass441_1.anInt4836 * 1289335701) + (double) (this.aClass441_1.anInt4866 * 2068571619) * local1013) << 8 | (int) (local1013 * (double) (this.aClass441_1.anInt4862 * 1343467425) + (double) (this.aClass441_1.anInt4854 * 881534829)) | (int) ((double) (this.aClass441_1.anInt4858 * -1110965177) + Math.random() * (double) (this.aClass441_1.anInt4865 * 334951963)) << 24;
					} else {
						local1087 = (int) ((double) (this.aClass441_1.anInt4846 * 1059303861) + Math.random() * (double) (this.aClass441_1.anInt4857 * 287836821)) << 16 | (int) ((double) (this.aClass441_1.anInt4836 * 1289335701) + Math.random() * (double) (this.aClass441_1.anInt4866 * 2068571619)) << 8 | (int) ((double) (this.aClass441_1.anInt4854 * 881534829) + Math.random() * (double) (this.aClass441_1.anInt4862 * 1343467425)) | (int) ((double) (this.aClass441_1.anInt4858 * -1110965177) + Math.random() * (double) (this.aClass441_1.anInt4865 * 334951963)) << 24;
					}
					@Pc(1168) int local1168 = this.aClass441_1.anInt4837 * 2128159281;
					if (!arg0.method20671() && !this.aClass441_1.aBoolean868) {
						local1168 = -1;
					}
					@Pc(1190) Class147_Sub3_Sub1_Sub1 local1190;
					if (Class654.anInt5669 * -715383901 == Class654.anInt5672 * 1053668183) {
						local1190 = new Class147_Sub3_Sub1_Sub1(this, local697, local705, local709, local267, local279, local291, local877, local899, local1087, local921, local927, local987, local1168, this.aClass441_1.aBoolean867, this.aClass441_1.aBoolean869);
					} else {
						local1190 = Class654.aClass147_Sub3_Sub1_Sub1Array1[Class654.anInt5672 * 1053668183];
						Class654.anInt5672 = (Class654.anInt5672 * 1053668183 + 1 & 0x3FF) * 1765468263;
						local1190.method23939(this, local697, local705, local709, local267, local279, local291, local877, local899, local1087, local921, local927, local987, local1168, this.aClass441_1.aBoolean867, this.aClass441_1.aBoolean869);
					}
					if (local303 > 256) {
						local1190.method23941(arg1, local303 >> 8);
					}
					this.anInt5709 += 929172197;
					local436++;
					local303 += local255;
				}
			}
		}
		if (!this.aClass673_2.method33567(this.aClass673_1, (byte) -127)) {
			@Pc(1278) Class673 local1278 = this.aClass673_1;
			this.aClass673_1 = this.aClass673_2;
			this.aClass673_2 = local1278;
			this.aClass673_2.anInt5726 = this.aClass228_2.anInt3675 * -1675826451;
			this.aClass673_2.anInt5730 = this.aClass228_2.anInt3679 * -1535612833;
			this.aClass673_2.anInt5723 = this.aClass228_2.anInt3677 * -1047267557;
			this.aClass673_2.anInt5724 = this.aClass228_2.anInt3680 * 750705497;
			this.aClass673_2.anInt5725 = this.aClass228_2.anInt3670 * 1278111505;
			this.aClass673_2.anInt5731 = this.aClass228_2.anInt3678 * 1866689401;
			this.aClass673_2.anInt5727 = this.aClass228_2.anInt3676 * -405331819;
			this.aClass673_2.anInt5728 = this.aClass228_2.anInt3682 * -1179212633;
			this.aClass673_2.anInt5721 = this.aClass228_2.anInt3683 * -1670235687;
			this.aClass673_2.anInt5722 = this.aClass673_1.anInt5722;
			this.aClass673_2.anInt5729 = this.aClass673_1.anInt5729;
			this.aClass673_2.anInt5732 = this.aClass673_1.anInt5732;
		}
		Class654.anInt5668 += this.anInt5709 * 752510333;
	}

	@OriginalMember(owner = "client!xo", name = "u", descriptor = "()V")
	void method33464() {
		this.aClass673_2.anInt5726 = this.aClass228_2.anInt3675 * -1675826451;
		this.aClass673_2.anInt5730 = this.aClass228_2.anInt3679 * -1535612833;
		this.aClass673_2.anInt5723 = this.aClass228_2.anInt3677 * -1047267557;
		this.aClass673_2.anInt5724 = this.aClass228_2.anInt3680 * 750705497;
		this.aClass673_2.anInt5725 = this.aClass228_2.anInt3670 * 1278111505;
		this.aClass673_2.anInt5731 = this.aClass228_2.anInt3678 * 1866689401;
		this.aClass673_2.anInt5727 = this.aClass228_2.anInt3676 * -405331819;
		this.aClass673_2.anInt5728 = this.aClass228_2.anInt3682 * -1179212633;
		this.aClass673_2.anInt5721 = this.aClass228_2.anInt3683 * -1670235687;
		if (this.aClass673_2.anInt5724 * -157585787 == this.aClass673_2.anInt5726 * -1789566271 && this.aClass673_2.anInt5727 * 1520949925 == this.aClass673_2.anInt5724 * -157585787 && this.aClass673_2.anInt5725 * 60012361 == this.aClass673_2.anInt5730 * -224403723 && this.aClass673_2.anInt5725 * 60012361 == this.aClass673_2.anInt5728 * 1967189039 && this.aClass673_2.anInt5731 * 1901136555 == this.aClass673_2.anInt5723 * -1166825643 && this.aClass673_2.anInt5731 * 1901136555 == this.aClass673_2.anInt5721 * 341263379) {
			this.aBoolean980 = true;
		} else if (this.aBoolean980) {
			this.aBoolean980 = false;
			this.aClass673_1.anInt5726 = this.aClass673_2.anInt5726;
			this.aClass673_1.anInt5730 = this.aClass673_2.anInt5730;
			this.aClass673_1.anInt5723 = this.aClass673_2.anInt5723;
			this.aClass673_1.anInt5724 = this.aClass673_2.anInt5724;
			this.aClass673_1.anInt5725 = this.aClass673_2.anInt5725;
			this.aClass673_1.anInt5731 = this.aClass673_2.anInt5731;
			this.aClass673_1.anInt5727 = this.aClass673_2.anInt5727;
			this.aClass673_1.anInt5728 = this.aClass673_2.anInt5728;
			this.aClass673_1.anInt5721 = this.aClass673_2.anInt5721;
		}
	}

	@OriginalMember(owner = "client!xo", name = "g", descriptor = "()V")
	void method33465() {
		this.aClass673_2.anInt5726 = this.aClass228_2.anInt3675 * -1675826451;
		this.aClass673_2.anInt5730 = this.aClass228_2.anInt3679 * -1535612833;
		this.aClass673_2.anInt5723 = this.aClass228_2.anInt3677 * -1047267557;
		this.aClass673_2.anInt5724 = this.aClass228_2.anInt3680 * 750705497;
		this.aClass673_2.anInt5725 = this.aClass228_2.anInt3670 * 1278111505;
		this.aClass673_2.anInt5731 = this.aClass228_2.anInt3678 * 1866689401;
		this.aClass673_2.anInt5727 = this.aClass228_2.anInt3676 * -405331819;
		this.aClass673_2.anInt5728 = this.aClass228_2.anInt3682 * -1179212633;
		this.aClass673_2.anInt5721 = this.aClass228_2.anInt3683 * -1670235687;
		if (this.aClass673_2.anInt5724 * -157585787 == this.aClass673_2.anInt5726 * -1789566271 && this.aClass673_2.anInt5727 * 1520949925 == this.aClass673_2.anInt5724 * -157585787 && this.aClass673_2.anInt5725 * 60012361 == this.aClass673_2.anInt5730 * -224403723 && this.aClass673_2.anInt5725 * 60012361 == this.aClass673_2.anInt5728 * 1967189039 && this.aClass673_2.anInt5731 * 1901136555 == this.aClass673_2.anInt5723 * -1166825643 && this.aClass673_2.anInt5731 * 1901136555 == this.aClass673_2.anInt5721 * 341263379) {
			this.aBoolean980 = true;
		} else if (this.aBoolean980) {
			this.aBoolean980 = false;
			this.aClass673_1.anInt5726 = this.aClass673_2.anInt5726;
			this.aClass673_1.anInt5730 = this.aClass673_2.anInt5730;
			this.aClass673_1.anInt5723 = this.aClass673_2.anInt5723;
			this.aClass673_1.anInt5724 = this.aClass673_2.anInt5724;
			this.aClass673_1.anInt5725 = this.aClass673_2.anInt5725;
			this.aClass673_1.anInt5731 = this.aClass673_2.anInt5731;
			this.aClass673_1.anInt5727 = this.aClass673_2.anInt5727;
			this.aClass673_1.anInt5728 = this.aClass673_2.anInt5728;
			this.aClass673_1.anInt5721 = this.aClass673_2.anInt5721;
		}
	}

	@OriginalMember(owner = "client!xo", name = "l", descriptor = "()V")
	void method33466() {
		this.aClass673_2.anInt5726 = this.aClass228_2.anInt3675 * -1675826451;
		this.aClass673_2.anInt5730 = this.aClass228_2.anInt3679 * -1535612833;
		this.aClass673_2.anInt5723 = this.aClass228_2.anInt3677 * -1047267557;
		this.aClass673_2.anInt5724 = this.aClass228_2.anInt3680 * 750705497;
		this.aClass673_2.anInt5725 = this.aClass228_2.anInt3670 * 1278111505;
		this.aClass673_2.anInt5731 = this.aClass228_2.anInt3678 * 1866689401;
		this.aClass673_2.anInt5727 = this.aClass228_2.anInt3676 * -405331819;
		this.aClass673_2.anInt5728 = this.aClass228_2.anInt3682 * -1179212633;
		this.aClass673_2.anInt5721 = this.aClass228_2.anInt3683 * -1670235687;
		if (this.aClass673_2.anInt5724 * -157585787 == this.aClass673_2.anInt5726 * -1789566271 && this.aClass673_2.anInt5727 * 1520949925 == this.aClass673_2.anInt5724 * -157585787 && this.aClass673_2.anInt5725 * 60012361 == this.aClass673_2.anInt5730 * -224403723 && this.aClass673_2.anInt5725 * 60012361 == this.aClass673_2.anInt5728 * 1967189039 && this.aClass673_2.anInt5731 * 1901136555 == this.aClass673_2.anInt5723 * -1166825643 && this.aClass673_2.anInt5731 * 1901136555 == this.aClass673_2.anInt5721 * 341263379) {
			this.aBoolean980 = true;
		} else if (this.aBoolean980) {
			this.aBoolean980 = false;
			this.aClass673_1.anInt5726 = this.aClass673_2.anInt5726;
			this.aClass673_1.anInt5730 = this.aClass673_2.anInt5730;
			this.aClass673_1.anInt5723 = this.aClass673_2.anInt5723;
			this.aClass673_1.anInt5724 = this.aClass673_2.anInt5724;
			this.aClass673_1.anInt5725 = this.aClass673_2.anInt5725;
			this.aClass673_1.anInt5731 = this.aClass673_2.anInt5731;
			this.aClass673_1.anInt5727 = this.aClass673_2.anInt5727;
			this.aClass673_1.anInt5728 = this.aClass673_2.anInt5728;
			this.aClass673_1.anInt5721 = this.aClass673_2.anInt5721;
		}
	}

	@OriginalMember(owner = "client!xo", name = "m", descriptor = "(Lclient!te;Lclient!di;J)V")
	void method33467(@OriginalArg(0) Class570 arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) long arg2) {
		for (@Pc(5) Class147_Sub3_Sub1_Sub1 local5 = (Class147_Sub3_Sub1_Sub1) this.aClass5_9.method93((byte) -15); local5 != null; local5 = (Class147_Sub3_Sub1_Sub1) this.aClass5_9.method110(-147242420)) {
			local5.method23942(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!xo", name = "o", descriptor = "(Lclient!te;Lclient!di;J)V")
	void method33468(@OriginalArg(0) Class570 arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) long arg2) {
		for (@Pc(5) Class147_Sub3_Sub1_Sub1 local5 = (Class147_Sub3_Sub1_Sub1) this.aClass5_9.method93((byte) 25); local5 != null; local5 = (Class147_Sub3_Sub1_Sub1) this.aClass5_9.method110(1722292523)) {
			local5.method23942(arg0, arg1, arg2);
		}
	}
}
