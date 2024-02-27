package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xm")
public final class Class664 {

	@OriginalMember(owner = "client!xm", name = "s", descriptor = "I")
	int anInt5999;

	@OriginalMember(owner = "client!xm", name = "w", descriptor = "I")
	int anInt6000;

	@OriginalMember(owner = "client!xm", name = "o", descriptor = "I")
	int anInt6001;

	@OriginalMember(owner = "client!xm", name = "d", descriptor = "I")
	int anInt6002;

	@OriginalMember(owner = "client!xm", name = "c", descriptor = "I")
	int anInt6003;

	@OriginalMember(owner = "client!xm", name = "r", descriptor = "I")
	int anInt6004;

	@OriginalMember(owner = "client!xm", name = "v", descriptor = "I")
	int anInt6005;

	@OriginalMember(owner = "client!xm", name = "y", descriptor = "I")
	int anInt6007;

	@OriginalMember(owner = "client!xm", name = "k", descriptor = "I")
	int anInt6006 = 0;

	@OriginalMember(owner = "client!xm", name = "u", descriptor = "Z")
	boolean aBoolean873 = false;

	@OriginalMember(owner = "client!xm", name = "z", descriptor = "Lclient!xw;")
	Class673 aClass673_1 = new Class673();

	@OriginalMember(owner = "client!xm", name = "p", descriptor = "Lclient!xw;")
	Class673 aClass673_2 = new Class673();

	@OriginalMember(owner = "client!xm", name = "q", descriptor = "Z")
	boolean aBoolean874 = false;

	@OriginalMember(owner = "client!xm", name = "x", descriptor = "Z")
	boolean aBoolean872 = false;

	@OriginalMember(owner = "client!xm", name = "e", descriptor = "Lclient!du;")
	final Class234 aClass234_2;

	@OriginalMember(owner = "client!xm", name = "m", descriptor = "Lclient!xy;")
	final Class674 aClass674_8;

	@OriginalMember(owner = "client!xm", name = "l", descriptor = "J")
	long aLong306;

	@OriginalMember(owner = "client!xm", name = "n", descriptor = "Lclient!nj;")
	Class439 aClass439_1;

	@OriginalMember(owner = "client!xm", name = "f", descriptor = "Lclient!aas;")
	Class21 aClass21_9;

	@OriginalMember(owner = "client!xm", name = "ez", descriptor = "(Lclient!yf;I)V")
	static void method33062(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1183104155);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class336.method27542(local16, local22, arg0, (short) -1767);
	}

	@OriginalMember(owner = "client!xm", name = "amv", descriptor = "(Lclient!yf;I)V")
	static void method33063(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 463840436;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		@Pc(43) int local43 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 3];
		@Pc(47) Class611 local47 = client.aClass532_1.method30624(1703500171);
		Class104_Sub3.method5765((local13 >> 14 & 0x3FFF) - local47.anInt5784 * 270611681, (local13 & 0x3FFF) - local47.anInt5785 * -1994307635, local23 << 2, local33, local43, false, 1645651862);
		client.aBoolean621 = true;
	}

	@OriginalMember(owner = "client!xm", name = "bi", descriptor = "(II)Z")
	static boolean method33064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 18 || arg0 == 19 || arg0 == 20 || arg0 == 21 || arg0 == 22 || arg0 == 1004) {
			return true;
		} else {
			return arg0 == 17;
		}
	}

	@OriginalMember(owner = "client!xm", name = "bz", descriptor = "(III)I")
	static int method33065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Class615.aClass615_10.anInt5789 * 948246811 == arg0 || Class615.aClass615_5.anInt5789 * 948246811 == arg0 ? Class132_Sub1_Sub2_Sub2.anIntArray172[arg1 & 0x3] : Class132_Sub1_Sub2_Sub2.anIntArray171[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!xm", name = "<init>", descriptor = "(Lclient!dh;Lclient!du;Lclient!xy;J)V")
	Class664(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class234 arg1, @OriginalArg(2) Class674 arg2, @OriginalArg(3) long arg3) {
		this.aClass234_2 = arg1;
		this.aClass674_8 = arg2;
		this.aLong306 = arg3 * -6368982138519190511L;
		this.aClass439_1 = this.aClass234_2.method25828(arg0.anInterface46_6, (byte) -63);
		if (!arg0.method20440() && -1845927989 * this.aClass439_1.anInt4988 != -1) {
			this.aClass439_1 = arg0.anInterface46_6.method29002(this.aClass439_1.anInt4988 * -1845927989, -1260024152);
		}
		this.aClass21_9 = new Class21();
		this.anInt6006 = (int) ((double) (this.anInt6006 * 723478237) + Math.random() * 64.0D) * -1762025099;
		this.method33053((byte) 97);
		this.aClass673_2.anInt6031 = this.aClass673_1.anInt6031;
		this.aClass673_2.anInt6025 = this.aClass673_1.anInt6025;
		this.aClass673_2.anInt6026 = this.aClass673_1.anInt6026;
		this.aClass673_2.anInt6027 = this.aClass673_1.anInt6027;
		this.aClass673_2.anInt6028 = this.aClass673_1.anInt6028;
		this.aClass673_2.anInt6034 = this.aClass673_1.anInt6034;
		this.aClass673_2.anInt6030 = this.aClass673_1.anInt6030;
		this.aClass673_2.anInt6035 = this.aClass673_1.anInt6035;
		this.aClass673_2.anInt6032 = this.aClass673_1.anInt6032;
	}

	@OriginalMember(owner = "client!xm", name = "z", descriptor = "(Lclient!tx;Lclient!dh;J)V")
	void method33052(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) long arg2) {
		for (@Pc(5) Class149_Sub4_Sub1_Sub1 local5 = (Class149_Sub4_Sub1_Sub1) this.aClass21_9.method390((short) 7175); local5 != null; local5 = (Class149_Sub4_Sub1_Sub1) this.aClass21_9.method377(-1915563430)) {
			local5.method23791(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!xm", name = "e", descriptor = "(B)V")
	void method33053(@OriginalArg(0) byte arg0) {
		this.aClass673_1.anInt6031 = this.aClass234_2.anInt3802 * 1786791051;
		this.aClass673_1.anInt6025 = this.aClass234_2.anInt3805 * -1859654007;
		this.aClass673_1.anInt6026 = this.aClass234_2.anInt3803 * -1279408919;
		this.aClass673_1.anInt6027 = this.aClass234_2.anInt3804 * -802278055;
		this.aClass673_1.anInt6028 = this.aClass234_2.anInt3801 * 16704351;
		this.aClass673_1.anInt6034 = this.aClass234_2.anInt3806 * -782532479;
		this.aClass673_1.anInt6030 = this.aClass234_2.anInt3797 * 474112169;
		this.aClass673_1.anInt6035 = this.aClass234_2.anInt3798 * 2057817315;
		this.aClass673_1.anInt6032 = this.aClass234_2.anInt3809 * -1107597221;
		if (this.aClass673_1.anInt6031 * 1887436333 == this.aClass673_1.anInt6027 * -188994503 && this.aClass673_1.anInt6030 * 1149898119 == this.aClass673_1.anInt6027 * -188994503 && this.aClass673_1.anInt6025 * -1144912701 == this.aClass673_1.anInt6028 * -2039293013 && this.aClass673_1.anInt6035 * -25907919 == this.aClass673_1.anInt6028 * -2039293013 && this.aClass673_1.anInt6026 * 1798534353 == this.aClass673_1.anInt6034 * 74112251 && this.aClass673_1.anInt6032 * 11123705 == this.aClass673_1.anInt6034 * 74112251) {
			this.aBoolean874 = true;
		} else if (this.aBoolean874) {
			this.aBoolean874 = false;
			this.aClass673_2.anInt6031 = this.aClass673_1.anInt6031;
			this.aClass673_2.anInt6025 = this.aClass673_1.anInt6025;
			this.aClass673_2.anInt6026 = this.aClass673_1.anInt6026;
			this.aClass673_2.anInt6027 = this.aClass673_1.anInt6027;
			this.aClass673_2.anInt6028 = this.aClass673_1.anInt6028;
			this.aClass673_2.anInt6034 = this.aClass673_1.anInt6034;
			this.aClass673_2.anInt6030 = this.aClass673_1.anInt6030;
			this.aClass673_2.anInt6035 = this.aClass673_1.anInt6035;
			this.aClass673_2.anInt6032 = this.aClass673_1.anInt6032;
		}
	}

	@OriginalMember(owner = "client!xm", name = "n", descriptor = "(Lclient!dh;JIZI)V")
	void method33054(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(50) int local50;
		if (this.aBoolean873) {
			arg3 = false;
		} else if (Class663.anInt5998 * 763077233 < this.aClass439_1.anInt5020 * 1749563333) {
			arg3 = false;
		} else if (Class663.anInt5997 * 602818647 > Class223.anIntArray339[Class663.anInt5998 * 763077233]) {
			arg3 = false;
		} else if (this.aBoolean874) {
			arg3 = false;
		} else if (this.aClass439_1.anInt5015 * 1403596617 != -1) {
			local50 = (int) (arg1 - this.aLong306 * -1975389202734125839L);
			if (this.aClass439_1.aBoolean769 || local50 <= this.aClass439_1.anInt5015 * 1403596617) {
				local50 %= this.aClass439_1.anInt5015 * 1403596617;
			} else {
				arg3 = false;
			}
			if (!this.aClass439_1.aBoolean768 && local50 < this.aClass439_1.anInt5042 * 1583213615) {
				arg3 = false;
			}
			if (this.aClass439_1.aBoolean768 && local50 >= this.aClass439_1.anInt5042 * 1583213615) {
				arg3 = false;
			}
		}
		this.anInt6000 = 0;
		for (@Pc(107) Class149_Sub4_Sub1_Sub1 local107 = (Class149_Sub4_Sub1_Sub1) this.aClass21_9.method390((short) 11150); local107 != null; local107 = (Class149_Sub4_Sub1_Sub1) this.aClass21_9.method377(-1915563430)) {
			local107.method23790(arg1, arg2);
			this.anInt6000 += -940017829;
		}
		if (arg3) {
			local50 = (this.aClass673_1.anInt6031 * 1887436333 + this.aClass673_1.anInt6027 * -188994503 + this.aClass673_1.anInt6030 * 1149898119) / 3;
			@Pc(168) int local168 = (this.aClass673_1.anInt6035 * -25907919 + this.aClass673_1.anInt6025 * -1144912701 + this.aClass673_1.anInt6028 * -2039293013) / 3;
			@Pc(188) int local188 = (this.aClass673_1.anInt6034 * 74112251 + this.aClass673_1.anInt6026 * 1798534353 + this.aClass673_1.anInt6032 * 11123705) / 3;
			@Pc(242) int local242;
			@Pc(254) int local254;
			@Pc(266) int local266;
			@Pc(278) int local278;
			@Pc(290) int local290;
			@Pc(302) int local302;
			@Pc(435) int local435;
			@Pc(492) int local492;
			@Pc(523) int local523;
			if (this.aClass673_1.anInt6024 * 976933385 != local50 || local168 != this.aClass673_1.anInt6029 * -29624619 || local188 != this.aClass673_1.anInt6033 * 667123649 || !this.aBoolean872) {
				this.aClass673_1.anInt6024 = local50 * -452174791;
				this.aClass673_1.anInt6029 = local168 * -1851288963;
				this.aClass673_1.anInt6033 = local188 * -813658047;
				local242 = this.aClass673_1.anInt6027 * -188994503 - this.aClass673_1.anInt6031 * 1887436333;
				local254 = this.aClass673_1.anInt6028 * -2039293013 - this.aClass673_1.anInt6025 * -1144912701;
				local266 = this.aClass673_1.anInt6034 * 74112251 - this.aClass673_1.anInt6026 * 1798534353;
				local278 = this.aClass673_1.anInt6030 * 1149898119 - this.aClass673_1.anInt6031 * 1887436333;
				local290 = this.aClass673_1.anInt6035 * -25907919 - this.aClass673_1.anInt6025 * -1144912701;
				local302 = this.aClass673_1.anInt6032 * 11123705 - this.aClass673_1.anInt6026 * 1798534353;
				this.anInt6002 = (local254 * local302 - local290 * local266) * 1329347549;
				this.anInt6003 = (local266 * local278 - local302 * local242) * -2065540257;
				this.anInt6004 = (local242 * local290 - local254 * local278) * 1123290765;
				while (true) {
					if (this.anInt6002 * 410186869 <= 32767 && this.anInt6003 * -1705066337 <= 32767 && this.anInt6004 * 1055745093 <= 32767 && this.anInt6002 * 410186869 >= -32767 && this.anInt6003 * -1705066337 >= -32767 && this.anInt6004 * 1055745093 >= -32767) {
						local435 = (int) Math.sqrt((double) (this.anInt6004 * 1055745093 * this.anInt6004 * 1055745093 + this.anInt6003 * -1705066337 * -1705066337 * this.anInt6003 + this.anInt6002 * 410186869 * this.anInt6002 * 410186869));
						if (local435 <= 0) {
							local435 = 1;
						}
						this.anInt6002 = this.anInt6002 * 1640467339 / local435 * 1329347549;
						this.anInt6003 = -974078111 * this.anInt6003 / local435 * -2065540257;
						this.anInt6004 = this.anInt6004 * 1932860347 / local435 * 1123290765;
						if (this.aClass439_1.aShort172 > 0 || this.aClass439_1.aShort173 > 0) {
							local492 = (int) (Math.atan2((double) (this.anInt6004 * 1055745093), (double) (this.anInt6002 * 410186869)) * 2607.5945876176133D);
							local523 = (int) (Math.atan2((double) (this.anInt6003 * -1705066337), Math.sqrt((double) (this.anInt6002 * 410186869 * this.anInt6002 * 410186869 + this.anInt6004 * 1055745093 * this.anInt6004 * 1055745093))) * 2607.5945876176133D);
							this.anInt6001 = (this.aClass439_1.aShort172 - this.aClass439_1.aShort171) * -707830497;
							this.anInt6005 = (this.aClass439_1.aShort171 + local492 - (this.anInt6001 * 566484703 >> 1)) * -682733889;
							this.anInt6007 = (this.aClass439_1.aShort173 - this.aClass439_1.aShort174) * -1622811125;
							this.anInt5999 = (local523 + this.aClass439_1.aShort174 - (this.anInt6007 * 565263779 >> 1)) * -1946038677;
						}
						this.aBoolean872 = true;
						break;
					}
					this.anInt6002 = (this.anInt6002 * 410186869 >> 1) * 1329347549;
					this.anInt6003 = (this.anInt6003 * -1705066337 >> 1) * -2065540257;
					this.anInt6004 = (this.anInt6004 * 1055745093 >> 1) * 1123290765;
				}
			}
			this.anInt6006 += (int) ((double) arg2 * ((double) (this.aClass439_1.anInt4993 * 2066620443) + Math.random() * (double) (this.aClass439_1.anInt5009 * 1826453045 - this.aClass439_1.anInt4993 * 2066620443))) * -1762025099;
			if (this.anInt6006 * 723478237 > 63) {
				local242 = this.anInt6006 * 723478237 >> 6;
				this.anInt6006 = (this.anInt6006 * 723478237 & 0x3F) * -1762025099;
				local254 = (arg2 << 8) / local242;
				local302 = 0;
				local435 = 0;
				while (local435 < local242) {
					@Pc(696) int local696;
					@Pc(704) int local704;
					@Pc(708) int local708;
					if (this.aClass439_1.aShort172 <= 0 && this.aClass439_1.aShort173 <= 0) {
						local266 = this.anInt6002 * 410186869;
						local278 = this.anInt6003 * -1705066337;
						local290 = this.anInt6004 * 1055745093;
					} else {
						local492 = this.anInt6005 * 225190207 + (int) ((double) (this.anInt6001 * 566484703) * Math.random());
						local492 &= 0x3FFF;
						local523 = Class464.anIntArray453[local492];
						@Pc(682) int local682 = Class464.anIntArray454[local492];
						local696 = this.anInt5999 * 2042588739 + (int) ((double) (this.anInt6007 * 565263779) * Math.random());
						@Pc(700) int local700 = local696 & 0x1FFF;
						local704 = Class464.anIntArray453[local700];
						local708 = Class464.anIntArray454[local700];
						@Pc(710) byte local710 = 13;
						local266 = local704 * local682 >> local710;
						local278 = (local708 << 1) * -1;
						local290 = local523 * local704 >> local710;
					}
					@Pc(747) float local747 = (float) Math.random();
					@Pc(750) float local750 = (float) Math.random();
					if (local750 + local747 > 1.0F) {
						local747 = 1.0F - local747;
						local750 = 1.0F - local750;
					}
					@Pc(770) float local770 = 1.0F - (local750 + local747);
					local696 = (int) (local750 * (float) (this.aClass673_1.anInt6027 * -188994503) + local747 * (float) (this.aClass673_1.anInt6031 * 1887436333) + (float) (this.aClass673_1.anInt6030 * 1149898119) * local770);
					local704 = (int) (local770 * (float) (this.aClass673_1.anInt6035 * -25907919) + (float) (this.aClass673_1.anInt6028 * -2039293013) * local750 + local747 * (float) (this.aClass673_1.anInt6025 * -1144912701));
					local708 = (int) (local770 * (float) (this.aClass673_1.anInt6032 * 11123705) + local747 * (float) (this.aClass673_1.anInt6026 * 1798534353) + local750 * (float) (this.aClass673_1.anInt6034 * 74112251));
					@Pc(876) int local876 = this.aClass439_1.anInt5025 * -444880703 + (int) (Math.random() * (double) (this.aClass439_1.anInt5021 * -1681293365 - this.aClass439_1.anInt5025 * -444880703));
					@Pc(898) int local898 = this.aClass439_1.anInt5006 * 1271310647 + (int) (Math.random() * (double) (this.aClass439_1.anInt5007 * -389325657 - this.aClass439_1.anInt5006 * 1271310647));
					@Pc(920) int local920 = this.aClass439_1.anInt5017 * 1249105109 + (int) (Math.random() * (double) (this.aClass439_1.anInt4997 * 1015697057 - this.aClass439_1.anInt5017 * 1249105109));
					@Pc(926) int local926 = this.aClass439_1.anInt5036 * 548685717;
					if (this.aClass439_1.anInt5044 * 1023487107 != 0) {
						if (this.aClass439_1.anInt5019 * 1295082377 == 0) {
							local926 += (int) (Math.random() * (double) (this.aClass439_1.anInt5044 * 1023487107 + 1));
						} else {
							local926 += (int) (Math.random() * (double) (this.aClass439_1.anInt5019 * 1295082377 + 1)) * (this.aClass439_1.anInt5044 * 1023487107 / (this.aClass439_1.anInt5019 * 1295082377));
						}
					}
					@Pc(986) int local986 = this.aClass439_1.anInt5043 * -1703691311;
					if (this.aClass439_1.anInt5045 * -662836557 != 0) {
						local986 += (int) (Math.random() * (double) (this.aClass439_1.anInt5045 * -662836557 + 1));
					}
					@Pc(1087) int local1087;
					if (this.aClass439_1.aBoolean767) {
						@Pc(1013) double local1013 = Math.random();
						local1087 = (int) ((double) (this.aClass439_1.anInt5003 * 2065954673) + (double) (this.aClass439_1.anInt4989 * -337195755) * local1013) << 16 | (int) (local1013 * (double) (this.aClass439_1.anInt5028 * -1061868401) + (double) (this.aClass439_1.anInt5030 * 1674413895)) << 8 | (int) ((double) (this.aClass439_1.anInt5031 * 587176347) * local1013 + (double) (this.aClass439_1.anInt5029 * -735811045)) | (int) ((double) (this.aClass439_1.anInt4999 * 87515485) + Math.random() * (double) (this.aClass439_1.anInt5034 * -881850919)) << 24;
					} else {
						local1087 = (int) ((double) (this.aClass439_1.anInt5003 * 2065954673) + Math.random() * (double) (this.aClass439_1.anInt4989 * -337195755)) << 16 | (int) ((double) (this.aClass439_1.anInt5030 * 1674413895) + Math.random() * (double) (this.aClass439_1.anInt5028 * -1061868401)) << 8 | (int) ((double) (this.aClass439_1.anInt5029 * -735811045) + Math.random() * (double) (this.aClass439_1.anInt5031 * 587176347)) | (int) ((double) (this.aClass439_1.anInt4999 * 87515485) + Math.random() * (double) (this.aClass439_1.anInt5034 * -881850919)) << 24;
					}
					@Pc(1168) int local1168 = this.aClass439_1.anInt5026 * 2072003037;
					if (!arg0.method20440() && !this.aClass439_1.aBoolean772) {
						local1168 = -1;
					}
					@Pc(1190) Class149_Sub4_Sub1_Sub1 local1190;
					if (Class663.anInt5995 * -42244385 == Class663.anInt5991 * 1271911793) {
						local1190 = new Class149_Sub4_Sub1_Sub1(this, local696, local704, local708, local266, local278, local290, local876, local898, local1087, local920, local926, local986, local1168, this.aClass439_1.aBoolean771, this.aClass439_1.aBoolean770);
					} else {
						local1190 = Class663.aClass149_Sub4_Sub1_Sub1Array1[Class663.anInt5991 * 1271911793];
						Class663.anInt5991 = (Class663.anInt5991 * 1271911793 + 1 & 0x3FF) * 130042769;
						local1190.method23788(this, local696, local704, local708, local266, local278, local290, local876, local898, local1087, local920, local926, local986, local1168, this.aClass439_1.aBoolean771, this.aClass439_1.aBoolean770);
					}
					if (local302 > 256) {
						local1190.method23790(arg1, local302 >> 8);
					}
					this.anInt6000 += -940017829;
					local435++;
					local302 += local254;
				}
			}
		}
		if (!this.aClass673_1.method33267(this.aClass673_2, -1921055132)) {
			@Pc(1278) Class673 local1278 = this.aClass673_2;
			this.aClass673_2 = this.aClass673_1;
			this.aClass673_1 = local1278;
			this.aClass673_1.anInt6031 = this.aClass234_2.anInt3802 * 1786791051;
			this.aClass673_1.anInt6025 = this.aClass234_2.anInt3805 * -1859654007;
			this.aClass673_1.anInt6026 = this.aClass234_2.anInt3803 * -1279408919;
			this.aClass673_1.anInt6027 = this.aClass234_2.anInt3804 * -802278055;
			this.aClass673_1.anInt6028 = this.aClass234_2.anInt3801 * 16704351;
			this.aClass673_1.anInt6034 = this.aClass234_2.anInt3806 * -782532479;
			this.aClass673_1.anInt6030 = this.aClass234_2.anInt3797 * 474112169;
			this.aClass673_1.anInt6035 = this.aClass234_2.anInt3798 * 2057817315;
			this.aClass673_1.anInt6032 = this.aClass234_2.anInt3809 * -1107597221;
			this.aClass673_1.anInt6024 = this.aClass673_2.anInt6024;
			this.aClass673_1.anInt6029 = this.aClass673_2.anInt6029;
			this.aClass673_1.anInt6033 = this.aClass673_2.anInt6033;
		}
		Class663.anInt5990 += this.anInt6000 * 1615413587;
	}

	@OriginalMember(owner = "client!xm", name = "m", descriptor = "(Lclient!tx;Lclient!dh;J)V")
	void method33055(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) long arg2) {
		for (@Pc(5) Class149_Sub4_Sub1_Sub1 local5 = (Class149_Sub4_Sub1_Sub1) this.aClass21_9.method390((short) 23066); local5 != null; local5 = (Class149_Sub4_Sub1_Sub1) this.aClass21_9.method377(-1915563430)) {
			local5.method23791(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!xm", name = "k", descriptor = "()V")
	void method33056() {
		this.aClass673_1.anInt6031 = this.aClass234_2.anInt3802 * 1786791051;
		this.aClass673_1.anInt6025 = this.aClass234_2.anInt3805 * -1859654007;
		this.aClass673_1.anInt6026 = this.aClass234_2.anInt3803 * -1279408919;
		this.aClass673_1.anInt6027 = this.aClass234_2.anInt3804 * -802278055;
		this.aClass673_1.anInt6028 = this.aClass234_2.anInt3801 * 16704351;
		this.aClass673_1.anInt6034 = this.aClass234_2.anInt3806 * -782532479;
		this.aClass673_1.anInt6030 = this.aClass234_2.anInt3797 * 474112169;
		this.aClass673_1.anInt6035 = this.aClass234_2.anInt3798 * 2057817315;
		this.aClass673_1.anInt6032 = this.aClass234_2.anInt3809 * -1107597221;
		if (this.aClass673_1.anInt6031 * 1887436333 == this.aClass673_1.anInt6027 * -188994503 && this.aClass673_1.anInt6030 * 1149898119 == this.aClass673_1.anInt6027 * -188994503 && this.aClass673_1.anInt6025 * -1144912701 == this.aClass673_1.anInt6028 * -2039293013 && this.aClass673_1.anInt6035 * -25907919 == this.aClass673_1.anInt6028 * -2039293013 && this.aClass673_1.anInt6026 * 1798534353 == this.aClass673_1.anInt6034 * 74112251 && this.aClass673_1.anInt6032 * 11123705 == this.aClass673_1.anInt6034 * 74112251) {
			this.aBoolean874 = true;
		} else if (this.aBoolean874) {
			this.aBoolean874 = false;
			this.aClass673_2.anInt6031 = this.aClass673_1.anInt6031;
			this.aClass673_2.anInt6025 = this.aClass673_1.anInt6025;
			this.aClass673_2.anInt6026 = this.aClass673_1.anInt6026;
			this.aClass673_2.anInt6027 = this.aClass673_1.anInt6027;
			this.aClass673_2.anInt6028 = this.aClass673_1.anInt6028;
			this.aClass673_2.anInt6034 = this.aClass673_1.anInt6034;
			this.aClass673_2.anInt6030 = this.aClass673_1.anInt6030;
			this.aClass673_2.anInt6035 = this.aClass673_1.anInt6035;
			this.aClass673_2.anInt6032 = this.aClass673_1.anInt6032;
		}
	}

	@OriginalMember(owner = "client!xm", name = "w", descriptor = "()V")
	void method33057() {
		this.aClass673_1.anInt6031 = this.aClass234_2.anInt3802 * 1786791051;
		this.aClass673_1.anInt6025 = this.aClass234_2.anInt3805 * -1859654007;
		this.aClass673_1.anInt6026 = this.aClass234_2.anInt3803 * -1279408919;
		this.aClass673_1.anInt6027 = this.aClass234_2.anInt3804 * -802278055;
		this.aClass673_1.anInt6028 = this.aClass234_2.anInt3801 * 16704351;
		this.aClass673_1.anInt6034 = this.aClass234_2.anInt3806 * -782532479;
		this.aClass673_1.anInt6030 = this.aClass234_2.anInt3797 * 474112169;
		this.aClass673_1.anInt6035 = this.aClass234_2.anInt3798 * 2057817315;
		this.aClass673_1.anInt6032 = this.aClass234_2.anInt3809 * -1107597221;
		if (this.aClass673_1.anInt6031 * 1887436333 == this.aClass673_1.anInt6027 * -188994503 && this.aClass673_1.anInt6030 * 1149898119 == this.aClass673_1.anInt6027 * -188994503 && this.aClass673_1.anInt6025 * -1144912701 == this.aClass673_1.anInt6028 * -2039293013 && this.aClass673_1.anInt6035 * -25907919 == this.aClass673_1.anInt6028 * -2039293013 && this.aClass673_1.anInt6026 * 1798534353 == this.aClass673_1.anInt6034 * 74112251 && this.aClass673_1.anInt6032 * 11123705 == this.aClass673_1.anInt6034 * 74112251) {
			this.aBoolean874 = true;
		} else if (this.aBoolean874) {
			this.aBoolean874 = false;
			this.aClass673_2.anInt6031 = this.aClass673_1.anInt6031;
			this.aClass673_2.anInt6025 = this.aClass673_1.anInt6025;
			this.aClass673_2.anInt6026 = this.aClass673_1.anInt6026;
			this.aClass673_2.anInt6027 = this.aClass673_1.anInt6027;
			this.aClass673_2.anInt6028 = this.aClass673_1.anInt6028;
			this.aClass673_2.anInt6034 = this.aClass673_1.anInt6034;
			this.aClass673_2.anInt6030 = this.aClass673_1.anInt6030;
			this.aClass673_2.anInt6035 = this.aClass673_1.anInt6035;
			this.aClass673_2.anInt6032 = this.aClass673_1.anInt6032;
		}
	}

	@OriginalMember(owner = "client!xm", name = "f", descriptor = "()V")
	void method33058() {
		this.aClass673_1.anInt6031 = this.aClass234_2.anInt3802 * 1786791051;
		this.aClass673_1.anInt6025 = this.aClass234_2.anInt3805 * -1859654007;
		this.aClass673_1.anInt6026 = this.aClass234_2.anInt3803 * -1279408919;
		this.aClass673_1.anInt6027 = this.aClass234_2.anInt3804 * -802278055;
		this.aClass673_1.anInt6028 = this.aClass234_2.anInt3801 * 16704351;
		this.aClass673_1.anInt6034 = this.aClass234_2.anInt3806 * -782532479;
		this.aClass673_1.anInt6030 = this.aClass234_2.anInt3797 * 474112169;
		this.aClass673_1.anInt6035 = this.aClass234_2.anInt3798 * 2057817315;
		this.aClass673_1.anInt6032 = this.aClass234_2.anInt3809 * -1107597221;
		if (this.aClass673_1.anInt6031 * 1887436333 == this.aClass673_1.anInt6027 * -188994503 && this.aClass673_1.anInt6030 * 1149898119 == this.aClass673_1.anInt6027 * -188994503 && this.aClass673_1.anInt6025 * -1144912701 == this.aClass673_1.anInt6028 * -2039293013 && this.aClass673_1.anInt6035 * -25907919 == this.aClass673_1.anInt6028 * -2039293013 && this.aClass673_1.anInt6026 * 1798534353 == this.aClass673_1.anInt6034 * 74112251 && this.aClass673_1.anInt6032 * 11123705 == this.aClass673_1.anInt6034 * 74112251) {
			this.aBoolean874 = true;
		} else if (this.aBoolean874) {
			this.aBoolean874 = false;
			this.aClass673_2.anInt6031 = this.aClass673_1.anInt6031;
			this.aClass673_2.anInt6025 = this.aClass673_1.anInt6025;
			this.aClass673_2.anInt6026 = this.aClass673_1.anInt6026;
			this.aClass673_2.anInt6027 = this.aClass673_1.anInt6027;
			this.aClass673_2.anInt6028 = this.aClass673_1.anInt6028;
			this.aClass673_2.anInt6034 = this.aClass673_1.anInt6034;
			this.aClass673_2.anInt6030 = this.aClass673_1.anInt6030;
			this.aClass673_2.anInt6035 = this.aClass673_1.anInt6035;
			this.aClass673_2.anInt6032 = this.aClass673_1.anInt6032;
		}
	}

	@OriginalMember(owner = "client!xm", name = "u", descriptor = "(Lclient!tx;Lclient!dh;J)V")
	void method33059(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) long arg2) {
		for (@Pc(5) Class149_Sub4_Sub1_Sub1 local5 = (Class149_Sub4_Sub1_Sub1) this.aClass21_9.method390((short) 14312); local5 != null; local5 = (Class149_Sub4_Sub1_Sub1) this.aClass21_9.method377(-1915563430)) {
			local5.method23791(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!xm", name = "l", descriptor = "(Lclient!dh;JIZ)V")
	void method33060(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(50) int local50;
		if (this.aBoolean873) {
			arg3 = false;
		} else if (Class663.anInt5998 * 763077233 < this.aClass439_1.anInt5020 * 1749563333) {
			arg3 = false;
		} else if (Class663.anInt5997 * 602818647 > Class223.anIntArray339[Class663.anInt5998 * 763077233]) {
			arg3 = false;
		} else if (this.aBoolean874) {
			arg3 = false;
		} else if (this.aClass439_1.anInt5015 * 1403596617 != -1) {
			local50 = (int) (arg1 - this.aLong306 * -1975389202734125839L);
			if (this.aClass439_1.aBoolean769 || local50 <= this.aClass439_1.anInt5015 * 1403596617) {
				local50 %= this.aClass439_1.anInt5015 * 1403596617;
			} else {
				arg3 = false;
			}
			if (!this.aClass439_1.aBoolean768 && local50 < this.aClass439_1.anInt5042 * 1583213615) {
				arg3 = false;
			}
			if (this.aClass439_1.aBoolean768 && local50 >= this.aClass439_1.anInt5042 * 1583213615) {
				arg3 = false;
			}
		}
		this.anInt6000 = 0;
		for (@Pc(107) Class149_Sub4_Sub1_Sub1 local107 = (Class149_Sub4_Sub1_Sub1) this.aClass21_9.method390((short) 23483); local107 != null; local107 = (Class149_Sub4_Sub1_Sub1) this.aClass21_9.method377(-1915563430)) {
			local107.method23790(arg1, arg2);
			this.anInt6000 += -940017829;
		}
		if (arg3) {
			local50 = (this.aClass673_1.anInt6031 * 1887436333 + this.aClass673_1.anInt6027 * -188994503 + this.aClass673_1.anInt6030 * 1149898119) / 3;
			@Pc(168) int local168 = (this.aClass673_1.anInt6035 * -25907919 + this.aClass673_1.anInt6025 * -1144912701 + this.aClass673_1.anInt6028 * -2039293013) / 3;
			@Pc(188) int local188 = (this.aClass673_1.anInt6034 * 74112251 + this.aClass673_1.anInt6026 * 1798534353 + this.aClass673_1.anInt6032 * 11123705) / 3;
			@Pc(242) int local242;
			@Pc(254) int local254;
			@Pc(266) int local266;
			@Pc(278) int local278;
			@Pc(290) int local290;
			@Pc(302) int local302;
			@Pc(435) int local435;
			@Pc(492) int local492;
			@Pc(523) int local523;
			if (this.aClass673_1.anInt6024 * 976933385 != local50 || local168 != this.aClass673_1.anInt6029 * -29624619 || local188 != this.aClass673_1.anInt6033 * 667123649 || !this.aBoolean872) {
				this.aClass673_1.anInt6024 = local50 * -452174791;
				this.aClass673_1.anInt6029 = local168 * -1851288963;
				this.aClass673_1.anInt6033 = local188 * -813658047;
				local242 = this.aClass673_1.anInt6027 * -188994503 - this.aClass673_1.anInt6031 * 1887436333;
				local254 = this.aClass673_1.anInt6028 * -2039293013 - this.aClass673_1.anInt6025 * -1144912701;
				local266 = this.aClass673_1.anInt6034 * 74112251 - this.aClass673_1.anInt6026 * 1798534353;
				local278 = this.aClass673_1.anInt6030 * 1149898119 - this.aClass673_1.anInt6031 * 1887436333;
				local290 = this.aClass673_1.anInt6035 * -25907919 - this.aClass673_1.anInt6025 * -1144912701;
				local302 = this.aClass673_1.anInt6032 * 11123705 - this.aClass673_1.anInt6026 * 1798534353;
				this.anInt6002 = (local254 * local302 - local290 * local266) * 1329347549;
				this.anInt6003 = (local266 * local278 - local302 * local242) * -2065540257;
				this.anInt6004 = (local242 * local290 - local254 * local278) * 1123290765;
				while (true) {
					if (this.anInt6002 * 410186869 <= 32767 && this.anInt6003 * -1705066337 <= 32767 && this.anInt6004 * 1055745093 <= 32767 && this.anInt6002 * 410186869 >= -32767 && this.anInt6003 * -1705066337 >= -32767 && this.anInt6004 * 1055745093 >= -32767) {
						local435 = (int) Math.sqrt((double) (this.anInt6004 * 1055745093 * this.anInt6004 * 1055745093 + this.anInt6003 * -1705066337 * -1705066337 * this.anInt6003 + this.anInt6002 * 410186869 * this.anInt6002 * 410186869));
						if (local435 <= 0) {
							local435 = 1;
						}
						this.anInt6002 = this.anInt6002 * 1640467339 / local435 * 1329347549;
						this.anInt6003 = -974078111 * this.anInt6003 / local435 * -2065540257;
						this.anInt6004 = this.anInt6004 * 1932860347 / local435 * 1123290765;
						if (this.aClass439_1.aShort172 > 0 || this.aClass439_1.aShort173 > 0) {
							local492 = (int) (Math.atan2((double) (this.anInt6004 * 1055745093), (double) (this.anInt6002 * 410186869)) * 2607.5945876176133D);
							local523 = (int) (Math.atan2((double) (this.anInt6003 * -1705066337), Math.sqrt((double) (this.anInt6002 * 410186869 * this.anInt6002 * 410186869 + this.anInt6004 * 1055745093 * this.anInt6004 * 1055745093))) * 2607.5945876176133D);
							this.anInt6001 = (this.aClass439_1.aShort172 - this.aClass439_1.aShort171) * -707830497;
							this.anInt6005 = (this.aClass439_1.aShort171 + local492 - (this.anInt6001 * 566484703 >> 1)) * -682733889;
							this.anInt6007 = (this.aClass439_1.aShort173 - this.aClass439_1.aShort174) * -1622811125;
							this.anInt5999 = (local523 + this.aClass439_1.aShort174 - (this.anInt6007 * 565263779 >> 1)) * -1946038677;
						}
						this.aBoolean872 = true;
						break;
					}
					this.anInt6002 = (this.anInt6002 * 410186869 >> 1) * 1329347549;
					this.anInt6003 = (this.anInt6003 * -1705066337 >> 1) * -2065540257;
					this.anInt6004 = (this.anInt6004 * 1055745093 >> 1) * 1123290765;
				}
			}
			this.anInt6006 += (int) ((double) arg2 * ((double) (this.aClass439_1.anInt4993 * 2066620443) + Math.random() * (double) (this.aClass439_1.anInt5009 * 1826453045 - this.aClass439_1.anInt4993 * 2066620443))) * -1762025099;
			if (this.anInt6006 * 723478237 > 63) {
				local242 = this.anInt6006 * 723478237 >> 6;
				this.anInt6006 = (this.anInt6006 * 723478237 & 0x3F) * -1762025099;
				local254 = (arg2 << 8) / local242;
				local302 = 0;
				local435 = 0;
				while (local435 < local242) {
					@Pc(696) int local696;
					@Pc(704) int local704;
					@Pc(708) int local708;
					if (this.aClass439_1.aShort172 <= 0 && this.aClass439_1.aShort173 <= 0) {
						local266 = this.anInt6002 * 410186869;
						local278 = this.anInt6003 * -1705066337;
						local290 = this.anInt6004 * 1055745093;
					} else {
						local492 = this.anInt6005 * 225190207 + (int) ((double) (this.anInt6001 * 566484703) * Math.random());
						local492 &= 0x3FFF;
						local523 = Class464.anIntArray453[local492];
						@Pc(682) int local682 = Class464.anIntArray454[local492];
						local696 = this.anInt5999 * 2042588739 + (int) ((double) (this.anInt6007 * 565263779) * Math.random());
						@Pc(700) int local700 = local696 & 0x1FFF;
						local704 = Class464.anIntArray453[local700];
						local708 = Class464.anIntArray454[local700];
						@Pc(710) byte local710 = 13;
						local266 = local704 * local682 >> local710;
						local278 = (local708 << 1) * -1;
						local290 = local523 * local704 >> local710;
					}
					@Pc(747) float local747 = (float) Math.random();
					@Pc(750) float local750 = (float) Math.random();
					if (local750 + local747 > 1.0F) {
						local747 = 1.0F - local747;
						local750 = 1.0F - local750;
					}
					@Pc(770) float local770 = 1.0F - (local750 + local747);
					local696 = (int) (local750 * (float) (this.aClass673_1.anInt6027 * -188994503) + local747 * (float) (this.aClass673_1.anInt6031 * 1887436333) + (float) (this.aClass673_1.anInt6030 * 1149898119) * local770);
					local704 = (int) (local770 * (float) (this.aClass673_1.anInt6035 * -25907919) + (float) (this.aClass673_1.anInt6028 * -2039293013) * local750 + local747 * (float) (this.aClass673_1.anInt6025 * -1144912701));
					local708 = (int) (local770 * (float) (this.aClass673_1.anInt6032 * 11123705) + local747 * (float) (this.aClass673_1.anInt6026 * 1798534353) + local750 * (float) (this.aClass673_1.anInt6034 * 74112251));
					@Pc(876) int local876 = this.aClass439_1.anInt5025 * -444880703 + (int) (Math.random() * (double) (this.aClass439_1.anInt5021 * -1681293365 - this.aClass439_1.anInt5025 * -444880703));
					@Pc(898) int local898 = this.aClass439_1.anInt5006 * 1271310647 + (int) (Math.random() * (double) (this.aClass439_1.anInt5007 * -389325657 - this.aClass439_1.anInt5006 * 1271310647));
					@Pc(920) int local920 = this.aClass439_1.anInt5017 * 1249105109 + (int) (Math.random() * (double) (this.aClass439_1.anInt4997 * 1015697057 - this.aClass439_1.anInt5017 * 1249105109));
					@Pc(926) int local926 = this.aClass439_1.anInt5036 * 548685717;
					if (this.aClass439_1.anInt5044 * 1023487107 != 0) {
						if (this.aClass439_1.anInt5019 * 1295082377 == 0) {
							local926 += (int) (Math.random() * (double) (this.aClass439_1.anInt5044 * 1023487107 + 1));
						} else {
							local926 += (int) (Math.random() * (double) (this.aClass439_1.anInt5019 * 1295082377 + 1)) * (this.aClass439_1.anInt5044 * 1023487107 / (this.aClass439_1.anInt5019 * 1295082377));
						}
					}
					@Pc(986) int local986 = this.aClass439_1.anInt5043 * -1703691311;
					if (this.aClass439_1.anInt5045 * -662836557 != 0) {
						local986 += (int) (Math.random() * (double) (this.aClass439_1.anInt5045 * -662836557 + 1));
					}
					@Pc(1087) int local1087;
					if (this.aClass439_1.aBoolean767) {
						@Pc(1013) double local1013 = Math.random();
						local1087 = (int) ((double) (this.aClass439_1.anInt5003 * 2065954673) + (double) (this.aClass439_1.anInt4989 * -337195755) * local1013) << 16 | (int) (local1013 * (double) (this.aClass439_1.anInt5028 * -1061868401) + (double) (this.aClass439_1.anInt5030 * 1674413895)) << 8 | (int) ((double) (this.aClass439_1.anInt5031 * 587176347) * local1013 + (double) (this.aClass439_1.anInt5029 * -735811045)) | (int) ((double) (this.aClass439_1.anInt4999 * 87515485) + Math.random() * (double) (this.aClass439_1.anInt5034 * -881850919)) << 24;
					} else {
						local1087 = (int) ((double) (this.aClass439_1.anInt5003 * 2065954673) + Math.random() * (double) (this.aClass439_1.anInt4989 * -337195755)) << 16 | (int) ((double) (this.aClass439_1.anInt5030 * 1674413895) + Math.random() * (double) (this.aClass439_1.anInt5028 * -1061868401)) << 8 | (int) ((double) (this.aClass439_1.anInt5029 * -735811045) + Math.random() * (double) (this.aClass439_1.anInt5031 * 587176347)) | (int) ((double) (this.aClass439_1.anInt4999 * 87515485) + Math.random() * (double) (this.aClass439_1.anInt5034 * -881850919)) << 24;
					}
					@Pc(1168) int local1168 = this.aClass439_1.anInt5026 * 2072003037;
					if (!arg0.method20440() && !this.aClass439_1.aBoolean772) {
						local1168 = -1;
					}
					@Pc(1190) Class149_Sub4_Sub1_Sub1 local1190;
					if (Class663.anInt5995 * -42244385 == Class663.anInt5991 * 1271911793) {
						local1190 = new Class149_Sub4_Sub1_Sub1(this, local696, local704, local708, local266, local278, local290, local876, local898, local1087, local920, local926, local986, local1168, this.aClass439_1.aBoolean771, this.aClass439_1.aBoolean770);
					} else {
						local1190 = Class663.aClass149_Sub4_Sub1_Sub1Array1[Class663.anInt5991 * 1271911793];
						Class663.anInt5991 = (Class663.anInt5991 * 1271911793 + 1 & 0x3FF) * 130042769;
						local1190.method23788(this, local696, local704, local708, local266, local278, local290, local876, local898, local1087, local920, local926, local986, local1168, this.aClass439_1.aBoolean771, this.aClass439_1.aBoolean770);
					}
					if (local302 > 256) {
						local1190.method23790(arg1, local302 >> 8);
					}
					this.anInt6000 += -940017829;
					local435++;
					local302 += local254;
				}
			}
		}
		if (!this.aClass673_1.method33267(this.aClass673_2, -1559336392)) {
			@Pc(1278) Class673 local1278 = this.aClass673_2;
			this.aClass673_2 = this.aClass673_1;
			this.aClass673_1 = local1278;
			this.aClass673_1.anInt6031 = this.aClass234_2.anInt3802 * 1786791051;
			this.aClass673_1.anInt6025 = this.aClass234_2.anInt3805 * -1859654007;
			this.aClass673_1.anInt6026 = this.aClass234_2.anInt3803 * -1279408919;
			this.aClass673_1.anInt6027 = this.aClass234_2.anInt3804 * -802278055;
			this.aClass673_1.anInt6028 = this.aClass234_2.anInt3801 * 16704351;
			this.aClass673_1.anInt6034 = this.aClass234_2.anInt3806 * -782532479;
			this.aClass673_1.anInt6030 = this.aClass234_2.anInt3797 * 474112169;
			this.aClass673_1.anInt6035 = this.aClass234_2.anInt3798 * 2057817315;
			this.aClass673_1.anInt6032 = this.aClass234_2.anInt3809 * -1107597221;
			this.aClass673_1.anInt6024 = this.aClass673_2.anInt6024;
			this.aClass673_1.anInt6029 = this.aClass673_2.anInt6029;
			this.aClass673_1.anInt6033 = this.aClass673_2.anInt6033;
		}
		Class663.anInt5990 += this.anInt6000 * 1615413587;
	}

	@OriginalMember(owner = "client!xm", name = "p", descriptor = "(Lclient!tx;Lclient!dh;J)V")
	void method33061(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) long arg2) {
		for (@Pc(5) Class149_Sub4_Sub1_Sub1 local5 = (Class149_Sub4_Sub1_Sub1) this.aClass21_9.method390((short) 18960); local5 != null; local5 = (Class149_Sub4_Sub1_Sub1) this.aClass21_9.method377(-1915563430)) {
			local5.method23791(arg0, arg1, arg2);
		}
	}
}
