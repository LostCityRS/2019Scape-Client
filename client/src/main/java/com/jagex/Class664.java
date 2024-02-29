package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xm")
public class Class664 {

	@OriginalMember(owner = "client!xm", name = "s", descriptor = "I")
	int anInt5838;

	@OriginalMember(owner = "client!xm", name = "w", descriptor = "I")
	int anInt5839;

	@OriginalMember(owner = "client!xm", name = "o", descriptor = "I")
	int anInt5840;

	@OriginalMember(owner = "client!xm", name = "d", descriptor = "I")
	int anInt5841;

	@OriginalMember(owner = "client!xm", name = "c", descriptor = "I")
	int anInt5842;

	@OriginalMember(owner = "client!xm", name = "r", descriptor = "I")
	int anInt5843;

	@OriginalMember(owner = "client!xm", name = "v", descriptor = "I")
	int anInt5844;

	@OriginalMember(owner = "client!xm", name = "y", descriptor = "I")
	int anInt5846;

	@OriginalMember(owner = "client!xm", name = "k", descriptor = "I")
	int anInt5845 = 0;

	@OriginalMember(owner = "client!xm", name = "u", descriptor = "Z")
	boolean aBoolean864 = false;

	@OriginalMember(owner = "client!xm", name = "z", descriptor = "Lclient!xw;")
	Class673 aClass673_1 = new Class673();

	@OriginalMember(owner = "client!xm", name = "p", descriptor = "Lclient!xw;")
	Class673 aClass673_2 = new Class673();

	@OriginalMember(owner = "client!xm", name = "q", descriptor = "Z")
	boolean aBoolean865 = false;

	@OriginalMember(owner = "client!xm", name = "x", descriptor = "Z")
	boolean aBoolean863 = false;

	@OriginalMember(owner = "client!xm", name = "e", descriptor = "Lclient!du;")
	final Class234 aClass234_2;

	@OriginalMember(owner = "client!xm", name = "m", descriptor = "Lclient!xy;")
	final Class674 aClass674_8;

	@OriginalMember(owner = "client!xm", name = "l", descriptor = "J")
	long aLong303;

	@OriginalMember(owner = "client!xm", name = "n", descriptor = "Lclient!nj;")
	Class439 aClass439_1;

	@OriginalMember(owner = "client!xm", name = "f", descriptor = "Lclient!aas;")
	Class21 aClass21_9;

	@OriginalMember(owner = "client!xm", name = "<init>", descriptor = "(Lclient!dh;Lclient!du;Lclient!xy;J)V", line = 31)
	Class664(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class234 arg1, @OriginalArg(2) Class674 arg2, @OriginalArg(3) long arg3) {
		this.aClass234_2 = arg1;
		this.aClass674_8 = arg2;
		this.aLong303 = arg3 * -6368982138519190511L;
		this.aClass439_1 = this.aClass234_2.method25735(arg0.anInterface46_6, (byte) -63);
		if (!arg0.method20539() && -1845927989 * this.aClass439_1.anInt4827 != -1) {
			this.aClass439_1 = arg0.anInterface46_6.method28821(this.aClass439_1.anInt4827 * -1845927989, -1260024152);
		}
		this.aClass21_9 = new Class21();
		this.anInt5845 = (int) ((double) (this.anInt5845 * 723478237) + Math.random() * 64.0D) * -1762025099;
		this.method32872((byte) 97);
		this.aClass673_2.anInt5870 = this.aClass673_1.anInt5870;
		this.aClass673_2.anInt5864 = this.aClass673_1.anInt5864;
		this.aClass673_2.anInt5865 = this.aClass673_1.anInt5865;
		this.aClass673_2.anInt5866 = this.aClass673_1.anInt5866;
		this.aClass673_2.anInt5867 = this.aClass673_1.anInt5867;
		this.aClass673_2.anInt5873 = this.aClass673_1.anInt5873;
		this.aClass673_2.anInt5869 = this.aClass673_1.anInt5869;
		this.aClass673_2.anInt5874 = this.aClass673_1.anInt5874;
		this.aClass673_2.anInt5871 = this.aClass673_1.anInt5871;
	}

	@OriginalMember(owner = "client!xm", name = "bz", descriptor = "(III)I", line = 44)
	static int method32871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Class615.aClass615_10.anInt5628 * 948246811 == arg0 || Class615.aClass615_5.anInt5628 * 948246811 == arg0 ? Class132_Sub1_Sub2_Sub2.anIntArray172[arg1 & 0x3] : Class132_Sub1_Sub2_Sub2.anIntArray171[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!xm", name = "e", descriptor = "(B)V", line = 52)
	void method32872(@OriginalArg(0) byte arg0) {
		this.aClass673_1.anInt5870 = this.aClass234_2.anInt3761 * 1786791051;
		this.aClass673_1.anInt5864 = this.aClass234_2.anInt3764 * -1859654007;
		this.aClass673_1.anInt5865 = this.aClass234_2.anInt3762 * -1279408919;
		this.aClass673_1.anInt5866 = this.aClass234_2.anInt3763 * -802278055;
		this.aClass673_1.anInt5867 = this.aClass234_2.anInt3760 * 16704351;
		this.aClass673_1.anInt5873 = this.aClass234_2.anInt3765 * -782532479;
		this.aClass673_1.anInt5869 = this.aClass234_2.anInt3756 * 474112169;
		this.aClass673_1.anInt5874 = this.aClass234_2.anInt3757 * 2057817315;
		this.aClass673_1.anInt5871 = this.aClass234_2.anInt3768 * -1107597221;
		if (this.aClass673_1.anInt5870 * 1887436333 == this.aClass673_1.anInt5866 * -188994503 && this.aClass673_1.anInt5869 * 1149898119 == this.aClass673_1.anInt5866 * -188994503 && this.aClass673_1.anInt5864 * -1144912701 == this.aClass673_1.anInt5867 * -2039293013 && this.aClass673_1.anInt5874 * -25907919 == this.aClass673_1.anInt5867 * -2039293013 && this.aClass673_1.anInt5865 * 1798534353 == this.aClass673_1.anInt5873 * 74112251 && this.aClass673_1.anInt5871 * 11123705 == this.aClass673_1.anInt5873 * 74112251) {
			this.aBoolean865 = true;
		} else if (this.aBoolean865) {
			this.aBoolean865 = false;
			this.aClass673_2.anInt5870 = this.aClass673_1.anInt5870;
			this.aClass673_2.anInt5864 = this.aClass673_1.anInt5864;
			this.aClass673_2.anInt5865 = this.aClass673_1.anInt5865;
			this.aClass673_2.anInt5866 = this.aClass673_1.anInt5866;
			this.aClass673_2.anInt5867 = this.aClass673_1.anInt5867;
			this.aClass673_2.anInt5873 = this.aClass673_1.anInt5873;
			this.aClass673_2.anInt5869 = this.aClass673_1.anInt5869;
			this.aClass673_2.anInt5874 = this.aClass673_1.anInt5874;
			this.aClass673_2.anInt5871 = this.aClass673_1.anInt5871;
		}
	}

	@OriginalMember(owner = "client!xm", name = "k", descriptor = "()V", line = 52)
	void method32873() {
		this.aClass673_1.anInt5870 = this.aClass234_2.anInt3761 * 1786791051;
		this.aClass673_1.anInt5864 = this.aClass234_2.anInt3764 * -1859654007;
		this.aClass673_1.anInt5865 = this.aClass234_2.anInt3762 * -1279408919;
		this.aClass673_1.anInt5866 = this.aClass234_2.anInt3763 * -802278055;
		this.aClass673_1.anInt5867 = this.aClass234_2.anInt3760 * 16704351;
		this.aClass673_1.anInt5873 = this.aClass234_2.anInt3765 * -782532479;
		this.aClass673_1.anInt5869 = this.aClass234_2.anInt3756 * 474112169;
		this.aClass673_1.anInt5874 = this.aClass234_2.anInt3757 * 2057817315;
		this.aClass673_1.anInt5871 = this.aClass234_2.anInt3768 * -1107597221;
		if (this.aClass673_1.anInt5870 * 1887436333 == this.aClass673_1.anInt5866 * -188994503 && this.aClass673_1.anInt5869 * 1149898119 == this.aClass673_1.anInt5866 * -188994503 && this.aClass673_1.anInt5864 * -1144912701 == this.aClass673_1.anInt5867 * -2039293013 && this.aClass673_1.anInt5874 * -25907919 == this.aClass673_1.anInt5867 * -2039293013 && this.aClass673_1.anInt5865 * 1798534353 == this.aClass673_1.anInt5873 * 74112251 && this.aClass673_1.anInt5871 * 11123705 == this.aClass673_1.anInt5873 * 74112251) {
			this.aBoolean865 = true;
		} else if (this.aBoolean865) {
			this.aBoolean865 = false;
			this.aClass673_2.anInt5870 = this.aClass673_1.anInt5870;
			this.aClass673_2.anInt5864 = this.aClass673_1.anInt5864;
			this.aClass673_2.anInt5865 = this.aClass673_1.anInt5865;
			this.aClass673_2.anInt5866 = this.aClass673_1.anInt5866;
			this.aClass673_2.anInt5867 = this.aClass673_1.anInt5867;
			this.aClass673_2.anInt5873 = this.aClass673_1.anInt5873;
			this.aClass673_2.anInt5869 = this.aClass673_1.anInt5869;
			this.aClass673_2.anInt5874 = this.aClass673_1.anInt5874;
			this.aClass673_2.anInt5871 = this.aClass673_1.anInt5871;
		}
	}

	@OriginalMember(owner = "client!xm", name = "w", descriptor = "()V", line = 52)
	void method32874() {
		this.aClass673_1.anInt5870 = this.aClass234_2.anInt3761 * 1786791051;
		this.aClass673_1.anInt5864 = this.aClass234_2.anInt3764 * -1859654007;
		this.aClass673_1.anInt5865 = this.aClass234_2.anInt3762 * -1279408919;
		this.aClass673_1.anInt5866 = this.aClass234_2.anInt3763 * -802278055;
		this.aClass673_1.anInt5867 = this.aClass234_2.anInt3760 * 16704351;
		this.aClass673_1.anInt5873 = this.aClass234_2.anInt3765 * -782532479;
		this.aClass673_1.anInt5869 = this.aClass234_2.anInt3756 * 474112169;
		this.aClass673_1.anInt5874 = this.aClass234_2.anInt3757 * 2057817315;
		this.aClass673_1.anInt5871 = this.aClass234_2.anInt3768 * -1107597221;
		if (this.aClass673_1.anInt5870 * 1887436333 == this.aClass673_1.anInt5866 * -188994503 && this.aClass673_1.anInt5869 * 1149898119 == this.aClass673_1.anInt5866 * -188994503 && this.aClass673_1.anInt5864 * -1144912701 == this.aClass673_1.anInt5867 * -2039293013 && this.aClass673_1.anInt5874 * -25907919 == this.aClass673_1.anInt5867 * -2039293013 && this.aClass673_1.anInt5865 * 1798534353 == this.aClass673_1.anInt5873 * 74112251 && this.aClass673_1.anInt5871 * 11123705 == this.aClass673_1.anInt5873 * 74112251) {
			this.aBoolean865 = true;
		} else if (this.aBoolean865) {
			this.aBoolean865 = false;
			this.aClass673_2.anInt5870 = this.aClass673_1.anInt5870;
			this.aClass673_2.anInt5864 = this.aClass673_1.anInt5864;
			this.aClass673_2.anInt5865 = this.aClass673_1.anInt5865;
			this.aClass673_2.anInt5866 = this.aClass673_1.anInt5866;
			this.aClass673_2.anInt5867 = this.aClass673_1.anInt5867;
			this.aClass673_2.anInt5873 = this.aClass673_1.anInt5873;
			this.aClass673_2.anInt5869 = this.aClass673_1.anInt5869;
			this.aClass673_2.anInt5874 = this.aClass673_1.anInt5874;
			this.aClass673_2.anInt5871 = this.aClass673_1.anInt5871;
		}
	}

	@OriginalMember(owner = "client!xm", name = "f", descriptor = "()V", line = 52)
	void method32875() {
		this.aClass673_1.anInt5870 = this.aClass234_2.anInt3761 * 1786791051;
		this.aClass673_1.anInt5864 = this.aClass234_2.anInt3764 * -1859654007;
		this.aClass673_1.anInt5865 = this.aClass234_2.anInt3762 * -1279408919;
		this.aClass673_1.anInt5866 = this.aClass234_2.anInt3763 * -802278055;
		this.aClass673_1.anInt5867 = this.aClass234_2.anInt3760 * 16704351;
		this.aClass673_1.anInt5873 = this.aClass234_2.anInt3765 * -782532479;
		this.aClass673_1.anInt5869 = this.aClass234_2.anInt3756 * 474112169;
		this.aClass673_1.anInt5874 = this.aClass234_2.anInt3757 * 2057817315;
		this.aClass673_1.anInt5871 = this.aClass234_2.anInt3768 * -1107597221;
		if (this.aClass673_1.anInt5870 * 1887436333 == this.aClass673_1.anInt5866 * -188994503 && this.aClass673_1.anInt5869 * 1149898119 == this.aClass673_1.anInt5866 * -188994503 && this.aClass673_1.anInt5864 * -1144912701 == this.aClass673_1.anInt5867 * -2039293013 && this.aClass673_1.anInt5874 * -25907919 == this.aClass673_1.anInt5867 * -2039293013 && this.aClass673_1.anInt5865 * 1798534353 == this.aClass673_1.anInt5873 * 74112251 && this.aClass673_1.anInt5871 * 11123705 == this.aClass673_1.anInt5873 * 74112251) {
			this.aBoolean865 = true;
		} else if (this.aBoolean865) {
			this.aBoolean865 = false;
			this.aClass673_2.anInt5870 = this.aClass673_1.anInt5870;
			this.aClass673_2.anInt5864 = this.aClass673_1.anInt5864;
			this.aClass673_2.anInt5865 = this.aClass673_1.anInt5865;
			this.aClass673_2.anInt5866 = this.aClass673_1.anInt5866;
			this.aClass673_2.anInt5867 = this.aClass673_1.anInt5867;
			this.aClass673_2.anInt5873 = this.aClass673_1.anInt5873;
			this.aClass673_2.anInt5869 = this.aClass673_1.anInt5869;
			this.aClass673_2.anInt5874 = this.aClass673_1.anInt5874;
			this.aClass673_2.anInt5871 = this.aClass673_1.anInt5871;
		}
	}

	@OriginalMember(owner = "client!xm", name = "n", descriptor = "(Lclient!dh;JIZI)V", line = 79)
	void method32876(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(50) int local50;
		if (this.aBoolean864) {
			arg3 = false;
		} else if (Class663.anInt5837 * 763077233 < this.aClass439_1.anInt4859 * 1749563333) {
			arg3 = false;
		} else if (Class663.anInt5836 * 602818647 > Class223.anIntArray337[Class663.anInt5837 * 763077233]) {
			arg3 = false;
		} else if (this.aBoolean865) {
			arg3 = false;
		} else if (this.aClass439_1.anInt4854 * 1403596617 != -1) {
			local50 = (int) (arg1 - this.aLong303 * -1975389202734125839L);
			if (this.aClass439_1.aBoolean760 || local50 <= this.aClass439_1.anInt4854 * 1403596617) {
				local50 %= this.aClass439_1.anInt4854 * 1403596617;
			} else {
				arg3 = false;
			}
			if (!this.aClass439_1.aBoolean759 && local50 < this.aClass439_1.anInt4881 * 1583213615) {
				arg3 = false;
			}
			if (this.aClass439_1.aBoolean759 && local50 >= this.aClass439_1.anInt4881 * 1583213615) {
				arg3 = false;
			}
		}
		this.anInt5839 = 0;
		for (@Pc(107) Class149_Sub4_Sub1_Sub1 local107 = (Class149_Sub4_Sub1_Sub1) this.aClass21_9.method390((short) 11150); local107 != null; local107 = (Class149_Sub4_Sub1_Sub1) this.aClass21_9.method392(-1915563430)) {
			local107.method23779(arg1, arg2);
			this.anInt5839 += -940017829;
		}
		if (arg3) {
			local50 = (this.aClass673_1.anInt5870 * 1887436333 + this.aClass673_1.anInt5866 * -188994503 + this.aClass673_1.anInt5869 * 1149898119) / 3;
			@Pc(168) int local168 = (this.aClass673_1.anInt5874 * -25907919 + this.aClass673_1.anInt5864 * -1144912701 + this.aClass673_1.anInt5867 * -2039293013) / 3;
			@Pc(188) int local188 = (this.aClass673_1.anInt5873 * 74112251 + this.aClass673_1.anInt5865 * 1798534353 + this.aClass673_1.anInt5871 * 11123705) / 3;
			@Pc(242) int local242;
			@Pc(254) int local254;
			@Pc(266) int local266;
			@Pc(278) int local278;
			@Pc(290) int local290;
			@Pc(302) int local302;
			@Pc(435) int local435;
			@Pc(492) int local492;
			@Pc(523) int local523;
			if (this.aClass673_1.anInt5863 * 976933385 != local50 || local168 != this.aClass673_1.anInt5868 * -29624619 || local188 != this.aClass673_1.anInt5872 * 667123649 || !this.aBoolean863) {
				this.aClass673_1.anInt5863 = local50 * -452174791;
				this.aClass673_1.anInt5868 = local168 * -1851288963;
				this.aClass673_1.anInt5872 = local188 * -813658047;
				local242 = this.aClass673_1.anInt5866 * -188994503 - this.aClass673_1.anInt5870 * 1887436333;
				local254 = this.aClass673_1.anInt5867 * -2039293013 - this.aClass673_1.anInt5864 * -1144912701;
				local266 = this.aClass673_1.anInt5873 * 74112251 - this.aClass673_1.anInt5865 * 1798534353;
				local278 = this.aClass673_1.anInt5869 * 1149898119 - this.aClass673_1.anInt5870 * 1887436333;
				local290 = this.aClass673_1.anInt5874 * -25907919 - this.aClass673_1.anInt5864 * -1144912701;
				local302 = this.aClass673_1.anInt5871 * 11123705 - this.aClass673_1.anInt5865 * 1798534353;
				this.anInt5841 = (local254 * local302 - local290 * local266) * 1329347549;
				this.anInt5842 = (local266 * local278 - local302 * local242) * -2065540257;
				this.anInt5843 = (local242 * local290 - local254 * local278) * 1123290765;
				while (true) {
					if (this.anInt5841 * 410186869 <= 32767 && this.anInt5842 * -1705066337 <= 32767 && this.anInt5843 * 1055745093 <= 32767 && this.anInt5841 * 410186869 >= -32767 && this.anInt5842 * -1705066337 >= -32767 && this.anInt5843 * 1055745093 >= -32767) {
						local435 = (int) Math.sqrt((double) (this.anInt5843 * 1055745093 * this.anInt5843 * 1055745093 + this.anInt5842 * -1705066337 * -1705066337 * this.anInt5842 + this.anInt5841 * 410186869 * this.anInt5841 * 410186869));
						if (local435 <= 0) {
							local435 = 1;
						}
						this.anInt5841 = this.anInt5841 * 1640467339 / local435 * 1329347549;
						this.anInt5842 = -974078111 * this.anInt5842 / local435 * -2065540257;
						this.anInt5843 = this.anInt5843 * 1932860347 / local435 * 1123290765;
						if (this.aClass439_1.aShort172 > 0 || this.aClass439_1.aShort173 > 0) {
							local492 = (int) (Math.atan2((double) (this.anInt5843 * 1055745093), (double) (this.anInt5841 * 410186869)) * 2607.5945876176133D);
							local523 = (int) (Math.atan2((double) (this.anInt5842 * -1705066337), Math.sqrt((double) (this.anInt5841 * 410186869 * this.anInt5841 * 410186869 + this.anInt5843 * 1055745093 * this.anInt5843 * 1055745093))) * 2607.5945876176133D);
							this.anInt5840 = (this.aClass439_1.aShort172 - this.aClass439_1.aShort171) * -707830497;
							this.anInt5844 = (this.aClass439_1.aShort171 + local492 - (this.anInt5840 * 566484703 >> 1)) * -682733889;
							this.anInt5846 = (this.aClass439_1.aShort173 - this.aClass439_1.aShort174) * -1622811125;
							this.anInt5838 = (local523 + this.aClass439_1.aShort174 - (this.anInt5846 * 565263779 >> 1)) * -1946038677;
						}
						this.aBoolean863 = true;
						break;
					}
					this.anInt5841 = (this.anInt5841 * 410186869 >> 1) * 1329347549;
					this.anInt5842 = (this.anInt5842 * -1705066337 >> 1) * -2065540257;
					this.anInt5843 = (this.anInt5843 * 1055745093 >> 1) * 1123290765;
				}
			}
			this.anInt5845 += (int) ((double) arg2 * ((double) (this.aClass439_1.anInt4832 * 2066620443) + Math.random() * (double) (this.aClass439_1.anInt4848 * 1826453045 - this.aClass439_1.anInt4832 * 2066620443))) * -1762025099;
			if (this.anInt5845 * 723478237 > 63) {
				local242 = this.anInt5845 * 723478237 >> 6;
				this.anInt5845 = (this.anInt5845 * 723478237 & 0x3F) * -1762025099;
				local254 = (arg2 << 8) / local242;
				local302 = 0;
				local435 = 0;
				while (local435 < local242) {
					@Pc(696) int local696;
					@Pc(704) int local704;
					@Pc(708) int local708;
					if (this.aClass439_1.aShort172 <= 0 && this.aClass439_1.aShort173 <= 0) {
						local266 = this.anInt5841 * 410186869;
						local278 = this.anInt5842 * -1705066337;
						local290 = this.anInt5843 * 1055745093;
					} else {
						local492 = this.anInt5844 * 225190207 + (int) ((double) (this.anInt5840 * 566484703) * Math.random());
						local492 &= 0x3FFF;
						local523 = Class464.anIntArray451[local492];
						@Pc(682) int local682 = Class464.anIntArray452[local492];
						local696 = this.anInt5838 * 2042588739 + (int) ((double) (this.anInt5846 * 565263779) * Math.random());
						@Pc(700) int local700 = local696 & 0x1FFF;
						local704 = Class464.anIntArray451[local700];
						local708 = Class464.anIntArray452[local700];
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
					local696 = (int) (local750 * (float) (this.aClass673_1.anInt5866 * -188994503) + local747 * (float) (this.aClass673_1.anInt5870 * 1887436333) + (float) (this.aClass673_1.anInt5869 * 1149898119) * local770);
					local704 = (int) (local770 * (float) (this.aClass673_1.anInt5874 * -25907919) + (float) (this.aClass673_1.anInt5867 * -2039293013) * local750 + local747 * (float) (this.aClass673_1.anInt5864 * -1144912701));
					local708 = (int) (local770 * (float) (this.aClass673_1.anInt5871 * 11123705) + local747 * (float) (this.aClass673_1.anInt5865 * 1798534353) + local750 * (float) (this.aClass673_1.anInt5873 * 74112251));
					@Pc(876) int local876 = this.aClass439_1.anInt4864 * -444880703 + (int) (Math.random() * (double) (this.aClass439_1.anInt4860 * -1681293365 - this.aClass439_1.anInt4864 * -444880703));
					@Pc(898) int local898 = this.aClass439_1.anInt4845 * 1271310647 + (int) (Math.random() * (double) (this.aClass439_1.anInt4846 * -389325657 - this.aClass439_1.anInt4845 * 1271310647));
					@Pc(920) int local920 = this.aClass439_1.anInt4856 * 1249105109 + (int) (Math.random() * (double) (this.aClass439_1.anInt4836 * 1015697057 - this.aClass439_1.anInt4856 * 1249105109));
					@Pc(926) int local926 = this.aClass439_1.anInt4875 * 548685717;
					if (this.aClass439_1.anInt4883 * 1023487107 != 0) {
						if (this.aClass439_1.anInt4858 * 1295082377 == 0) {
							local926 += (int) (Math.random() * (double) (this.aClass439_1.anInt4883 * 1023487107 + 1));
						} else {
							local926 += (int) (Math.random() * (double) (this.aClass439_1.anInt4858 * 1295082377 + 1)) * (this.aClass439_1.anInt4883 * 1023487107 / (this.aClass439_1.anInt4858 * 1295082377));
						}
					}
					@Pc(986) int local986 = this.aClass439_1.anInt4882 * -1703691311;
					if (this.aClass439_1.anInt4884 * -662836557 != 0) {
						local986 += (int) (Math.random() * (double) (this.aClass439_1.anInt4884 * -662836557 + 1));
					}
					@Pc(1087) int local1087;
					if (this.aClass439_1.aBoolean758) {
						@Pc(1013) double local1013 = Math.random();
						local1087 = (int) ((double) (this.aClass439_1.anInt4842 * 2065954673) + (double) (this.aClass439_1.anInt4828 * -337195755) * local1013) << 16 | (int) (local1013 * (double) (this.aClass439_1.anInt4867 * -1061868401) + (double) (this.aClass439_1.anInt4869 * 1674413895)) << 8 | (int) ((double) (this.aClass439_1.anInt4870 * 587176347) * local1013 + (double) (this.aClass439_1.anInt4868 * -735811045)) | (int) ((double) (this.aClass439_1.anInt4838 * 87515485) + Math.random() * (double) (this.aClass439_1.anInt4873 * -881850919)) << 24;
					} else {
						local1087 = (int) ((double) (this.aClass439_1.anInt4842 * 2065954673) + Math.random() * (double) (this.aClass439_1.anInt4828 * -337195755)) << 16 | (int) ((double) (this.aClass439_1.anInt4869 * 1674413895) + Math.random() * (double) (this.aClass439_1.anInt4867 * -1061868401)) << 8 | (int) ((double) (this.aClass439_1.anInt4868 * -735811045) + Math.random() * (double) (this.aClass439_1.anInt4870 * 587176347)) | (int) ((double) (this.aClass439_1.anInt4838 * 87515485) + Math.random() * (double) (this.aClass439_1.anInt4873 * -881850919)) << 24;
					}
					@Pc(1168) int local1168 = this.aClass439_1.anInt4865 * 2072003037;
					if (!arg0.method20539() && !this.aClass439_1.aBoolean763) {
						local1168 = -1;
					}
					@Pc(1190) Class149_Sub4_Sub1_Sub1 local1190;
					if (Class663.anInt5834 * -42244385 == Class663.anInt5830 * 1271911793) {
						local1190 = new Class149_Sub4_Sub1_Sub1(this, local696, local704, local708, local266, local278, local290, local876, local898, local1087, local920, local926, local986, local1168, this.aClass439_1.aBoolean762, this.aClass439_1.aBoolean761);
					} else {
						local1190 = Class663.aClass149_Sub4_Sub1_Sub1Array1[Class663.anInt5830 * 1271911793];
						Class663.anInt5830 = (Class663.anInt5830 * 1271911793 + 1 & 0x3FF) * 130042769;
						local1190.method23775(this, local696, local704, local708, local266, local278, local290, local876, local898, local1087, local920, local926, local986, local1168, this.aClass439_1.aBoolean762, this.aClass439_1.aBoolean761);
					}
					if (local302 > 256) {
						local1190.method23779(arg1, local302 >> 8);
					}
					this.anInt5839 += -940017829;
					local435++;
					local302 += local254;
				}
			}
		}
		if (!this.aClass673_1.method33086(this.aClass673_2, -1921055132)) {
			@Pc(1278) Class673 local1278 = this.aClass673_2;
			this.aClass673_2 = this.aClass673_1;
			this.aClass673_1 = local1278;
			this.aClass673_1.anInt5870 = this.aClass234_2.anInt3761 * 1786791051;
			this.aClass673_1.anInt5864 = this.aClass234_2.anInt3764 * -1859654007;
			this.aClass673_1.anInt5865 = this.aClass234_2.anInt3762 * -1279408919;
			this.aClass673_1.anInt5866 = this.aClass234_2.anInt3763 * -802278055;
			this.aClass673_1.anInt5867 = this.aClass234_2.anInt3760 * 16704351;
			this.aClass673_1.anInt5873 = this.aClass234_2.anInt3765 * -782532479;
			this.aClass673_1.anInt5869 = this.aClass234_2.anInt3756 * 474112169;
			this.aClass673_1.anInt5874 = this.aClass234_2.anInt3757 * 2057817315;
			this.aClass673_1.anInt5871 = this.aClass234_2.anInt3768 * -1107597221;
			this.aClass673_1.anInt5863 = this.aClass673_2.anInt5863;
			this.aClass673_1.anInt5868 = this.aClass673_2.anInt5868;
			this.aClass673_1.anInt5872 = this.aClass673_2.anInt5872;
		}
		Class663.anInt5829 += this.anInt5839 * 1615413587;
	}

	@OriginalMember(owner = "client!xm", name = "l", descriptor = "(Lclient!dh;JIZ)V", line = 79)
	void method32877(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(50) int local50;
		if (this.aBoolean864) {
			arg3 = false;
		} else if (Class663.anInt5837 * 763077233 < this.aClass439_1.anInt4859 * 1749563333) {
			arg3 = false;
		} else if (Class663.anInt5836 * 602818647 > Class223.anIntArray337[Class663.anInt5837 * 763077233]) {
			arg3 = false;
		} else if (this.aBoolean865) {
			arg3 = false;
		} else if (this.aClass439_1.anInt4854 * 1403596617 != -1) {
			local50 = (int) (arg1 - this.aLong303 * -1975389202734125839L);
			if (this.aClass439_1.aBoolean760 || local50 <= this.aClass439_1.anInt4854 * 1403596617) {
				local50 %= this.aClass439_1.anInt4854 * 1403596617;
			} else {
				arg3 = false;
			}
			if (!this.aClass439_1.aBoolean759 && local50 < this.aClass439_1.anInt4881 * 1583213615) {
				arg3 = false;
			}
			if (this.aClass439_1.aBoolean759 && local50 >= this.aClass439_1.anInt4881 * 1583213615) {
				arg3 = false;
			}
		}
		this.anInt5839 = 0;
		for (@Pc(107) Class149_Sub4_Sub1_Sub1 local107 = (Class149_Sub4_Sub1_Sub1) this.aClass21_9.method390((short) 23483); local107 != null; local107 = (Class149_Sub4_Sub1_Sub1) this.aClass21_9.method392(-1915563430)) {
			local107.method23779(arg1, arg2);
			this.anInt5839 += -940017829;
		}
		if (arg3) {
			local50 = (this.aClass673_1.anInt5870 * 1887436333 + this.aClass673_1.anInt5866 * -188994503 + this.aClass673_1.anInt5869 * 1149898119) / 3;
			@Pc(168) int local168 = (this.aClass673_1.anInt5874 * -25907919 + this.aClass673_1.anInt5864 * -1144912701 + this.aClass673_1.anInt5867 * -2039293013) / 3;
			@Pc(188) int local188 = (this.aClass673_1.anInt5873 * 74112251 + this.aClass673_1.anInt5865 * 1798534353 + this.aClass673_1.anInt5871 * 11123705) / 3;
			@Pc(242) int local242;
			@Pc(254) int local254;
			@Pc(266) int local266;
			@Pc(278) int local278;
			@Pc(290) int local290;
			@Pc(302) int local302;
			@Pc(435) int local435;
			@Pc(492) int local492;
			@Pc(523) int local523;
			if (this.aClass673_1.anInt5863 * 976933385 != local50 || local168 != this.aClass673_1.anInt5868 * -29624619 || local188 != this.aClass673_1.anInt5872 * 667123649 || !this.aBoolean863) {
				this.aClass673_1.anInt5863 = local50 * -452174791;
				this.aClass673_1.anInt5868 = local168 * -1851288963;
				this.aClass673_1.anInt5872 = local188 * -813658047;
				local242 = this.aClass673_1.anInt5866 * -188994503 - this.aClass673_1.anInt5870 * 1887436333;
				local254 = this.aClass673_1.anInt5867 * -2039293013 - this.aClass673_1.anInt5864 * -1144912701;
				local266 = this.aClass673_1.anInt5873 * 74112251 - this.aClass673_1.anInt5865 * 1798534353;
				local278 = this.aClass673_1.anInt5869 * 1149898119 - this.aClass673_1.anInt5870 * 1887436333;
				local290 = this.aClass673_1.anInt5874 * -25907919 - this.aClass673_1.anInt5864 * -1144912701;
				local302 = this.aClass673_1.anInt5871 * 11123705 - this.aClass673_1.anInt5865 * 1798534353;
				this.anInt5841 = (local254 * local302 - local290 * local266) * 1329347549;
				this.anInt5842 = (local266 * local278 - local302 * local242) * -2065540257;
				this.anInt5843 = (local242 * local290 - local254 * local278) * 1123290765;
				while (true) {
					if (this.anInt5841 * 410186869 <= 32767 && this.anInt5842 * -1705066337 <= 32767 && this.anInt5843 * 1055745093 <= 32767 && this.anInt5841 * 410186869 >= -32767 && this.anInt5842 * -1705066337 >= -32767 && this.anInt5843 * 1055745093 >= -32767) {
						local435 = (int) Math.sqrt((double) (this.anInt5843 * 1055745093 * this.anInt5843 * 1055745093 + this.anInt5842 * -1705066337 * -1705066337 * this.anInt5842 + this.anInt5841 * 410186869 * this.anInt5841 * 410186869));
						if (local435 <= 0) {
							local435 = 1;
						}
						this.anInt5841 = this.anInt5841 * 1640467339 / local435 * 1329347549;
						this.anInt5842 = -974078111 * this.anInt5842 / local435 * -2065540257;
						this.anInt5843 = this.anInt5843 * 1932860347 / local435 * 1123290765;
						if (this.aClass439_1.aShort172 > 0 || this.aClass439_1.aShort173 > 0) {
							local492 = (int) (Math.atan2((double) (this.anInt5843 * 1055745093), (double) (this.anInt5841 * 410186869)) * 2607.5945876176133D);
							local523 = (int) (Math.atan2((double) (this.anInt5842 * -1705066337), Math.sqrt((double) (this.anInt5841 * 410186869 * this.anInt5841 * 410186869 + this.anInt5843 * 1055745093 * this.anInt5843 * 1055745093))) * 2607.5945876176133D);
							this.anInt5840 = (this.aClass439_1.aShort172 - this.aClass439_1.aShort171) * -707830497;
							this.anInt5844 = (this.aClass439_1.aShort171 + local492 - (this.anInt5840 * 566484703 >> 1)) * -682733889;
							this.anInt5846 = (this.aClass439_1.aShort173 - this.aClass439_1.aShort174) * -1622811125;
							this.anInt5838 = (local523 + this.aClass439_1.aShort174 - (this.anInt5846 * 565263779 >> 1)) * -1946038677;
						}
						this.aBoolean863 = true;
						break;
					}
					this.anInt5841 = (this.anInt5841 * 410186869 >> 1) * 1329347549;
					this.anInt5842 = (this.anInt5842 * -1705066337 >> 1) * -2065540257;
					this.anInt5843 = (this.anInt5843 * 1055745093 >> 1) * 1123290765;
				}
			}
			this.anInt5845 += (int) ((double) arg2 * ((double) (this.aClass439_1.anInt4832 * 2066620443) + Math.random() * (double) (this.aClass439_1.anInt4848 * 1826453045 - this.aClass439_1.anInt4832 * 2066620443))) * -1762025099;
			if (this.anInt5845 * 723478237 > 63) {
				local242 = this.anInt5845 * 723478237 >> 6;
				this.anInt5845 = (this.anInt5845 * 723478237 & 0x3F) * -1762025099;
				local254 = (arg2 << 8) / local242;
				local302 = 0;
				local435 = 0;
				while (local435 < local242) {
					@Pc(696) int local696;
					@Pc(704) int local704;
					@Pc(708) int local708;
					if (this.aClass439_1.aShort172 <= 0 && this.aClass439_1.aShort173 <= 0) {
						local266 = this.anInt5841 * 410186869;
						local278 = this.anInt5842 * -1705066337;
						local290 = this.anInt5843 * 1055745093;
					} else {
						local492 = this.anInt5844 * 225190207 + (int) ((double) (this.anInt5840 * 566484703) * Math.random());
						local492 &= 0x3FFF;
						local523 = Class464.anIntArray451[local492];
						@Pc(682) int local682 = Class464.anIntArray452[local492];
						local696 = this.anInt5838 * 2042588739 + (int) ((double) (this.anInt5846 * 565263779) * Math.random());
						@Pc(700) int local700 = local696 & 0x1FFF;
						local704 = Class464.anIntArray451[local700];
						local708 = Class464.anIntArray452[local700];
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
					local696 = (int) (local750 * (float) (this.aClass673_1.anInt5866 * -188994503) + local747 * (float) (this.aClass673_1.anInt5870 * 1887436333) + (float) (this.aClass673_1.anInt5869 * 1149898119) * local770);
					local704 = (int) (local770 * (float) (this.aClass673_1.anInt5874 * -25907919) + (float) (this.aClass673_1.anInt5867 * -2039293013) * local750 + local747 * (float) (this.aClass673_1.anInt5864 * -1144912701));
					local708 = (int) (local770 * (float) (this.aClass673_1.anInt5871 * 11123705) + local747 * (float) (this.aClass673_1.anInt5865 * 1798534353) + local750 * (float) (this.aClass673_1.anInt5873 * 74112251));
					@Pc(876) int local876 = this.aClass439_1.anInt4864 * -444880703 + (int) (Math.random() * (double) (this.aClass439_1.anInt4860 * -1681293365 - this.aClass439_1.anInt4864 * -444880703));
					@Pc(898) int local898 = this.aClass439_1.anInt4845 * 1271310647 + (int) (Math.random() * (double) (this.aClass439_1.anInt4846 * -389325657 - this.aClass439_1.anInt4845 * 1271310647));
					@Pc(920) int local920 = this.aClass439_1.anInt4856 * 1249105109 + (int) (Math.random() * (double) (this.aClass439_1.anInt4836 * 1015697057 - this.aClass439_1.anInt4856 * 1249105109));
					@Pc(926) int local926 = this.aClass439_1.anInt4875 * 548685717;
					if (this.aClass439_1.anInt4883 * 1023487107 != 0) {
						if (this.aClass439_1.anInt4858 * 1295082377 == 0) {
							local926 += (int) (Math.random() * (double) (this.aClass439_1.anInt4883 * 1023487107 + 1));
						} else {
							local926 += (int) (Math.random() * (double) (this.aClass439_1.anInt4858 * 1295082377 + 1)) * (this.aClass439_1.anInt4883 * 1023487107 / (this.aClass439_1.anInt4858 * 1295082377));
						}
					}
					@Pc(986) int local986 = this.aClass439_1.anInt4882 * -1703691311;
					if (this.aClass439_1.anInt4884 * -662836557 != 0) {
						local986 += (int) (Math.random() * (double) (this.aClass439_1.anInt4884 * -662836557 + 1));
					}
					@Pc(1087) int local1087;
					if (this.aClass439_1.aBoolean758) {
						@Pc(1013) double local1013 = Math.random();
						local1087 = (int) ((double) (this.aClass439_1.anInt4842 * 2065954673) + (double) (this.aClass439_1.anInt4828 * -337195755) * local1013) << 16 | (int) (local1013 * (double) (this.aClass439_1.anInt4867 * -1061868401) + (double) (this.aClass439_1.anInt4869 * 1674413895)) << 8 | (int) ((double) (this.aClass439_1.anInt4870 * 587176347) * local1013 + (double) (this.aClass439_1.anInt4868 * -735811045)) | (int) ((double) (this.aClass439_1.anInt4838 * 87515485) + Math.random() * (double) (this.aClass439_1.anInt4873 * -881850919)) << 24;
					} else {
						local1087 = (int) ((double) (this.aClass439_1.anInt4842 * 2065954673) + Math.random() * (double) (this.aClass439_1.anInt4828 * -337195755)) << 16 | (int) ((double) (this.aClass439_1.anInt4869 * 1674413895) + Math.random() * (double) (this.aClass439_1.anInt4867 * -1061868401)) << 8 | (int) ((double) (this.aClass439_1.anInt4868 * -735811045) + Math.random() * (double) (this.aClass439_1.anInt4870 * 587176347)) | (int) ((double) (this.aClass439_1.anInt4838 * 87515485) + Math.random() * (double) (this.aClass439_1.anInt4873 * -881850919)) << 24;
					}
					@Pc(1168) int local1168 = this.aClass439_1.anInt4865 * 2072003037;
					if (!arg0.method20539() && !this.aClass439_1.aBoolean763) {
						local1168 = -1;
					}
					@Pc(1190) Class149_Sub4_Sub1_Sub1 local1190;
					if (Class663.anInt5834 * -42244385 == Class663.anInt5830 * 1271911793) {
						local1190 = new Class149_Sub4_Sub1_Sub1(this, local696, local704, local708, local266, local278, local290, local876, local898, local1087, local920, local926, local986, local1168, this.aClass439_1.aBoolean762, this.aClass439_1.aBoolean761);
					} else {
						local1190 = Class663.aClass149_Sub4_Sub1_Sub1Array1[Class663.anInt5830 * 1271911793];
						Class663.anInt5830 = (Class663.anInt5830 * 1271911793 + 1 & 0x3FF) * 130042769;
						local1190.method23775(this, local696, local704, local708, local266, local278, local290, local876, local898, local1087, local920, local926, local986, local1168, this.aClass439_1.aBoolean762, this.aClass439_1.aBoolean761);
					}
					if (local302 > 256) {
						local1190.method23779(arg1, local302 >> 8);
					}
					this.anInt5839 += -940017829;
					local435++;
					local302 += local254;
				}
			}
		}
		if (!this.aClass673_1.method33086(this.aClass673_2, -1559336392)) {
			@Pc(1278) Class673 local1278 = this.aClass673_2;
			this.aClass673_2 = this.aClass673_1;
			this.aClass673_1 = local1278;
			this.aClass673_1.anInt5870 = this.aClass234_2.anInt3761 * 1786791051;
			this.aClass673_1.anInt5864 = this.aClass234_2.anInt3764 * -1859654007;
			this.aClass673_1.anInt5865 = this.aClass234_2.anInt3762 * -1279408919;
			this.aClass673_1.anInt5866 = this.aClass234_2.anInt3763 * -802278055;
			this.aClass673_1.anInt5867 = this.aClass234_2.anInt3760 * 16704351;
			this.aClass673_1.anInt5873 = this.aClass234_2.anInt3765 * -782532479;
			this.aClass673_1.anInt5869 = this.aClass234_2.anInt3756 * 474112169;
			this.aClass673_1.anInt5874 = this.aClass234_2.anInt3757 * 2057817315;
			this.aClass673_1.anInt5871 = this.aClass234_2.anInt3768 * -1107597221;
			this.aClass673_1.anInt5863 = this.aClass673_2.anInt5863;
			this.aClass673_1.anInt5868 = this.aClass673_2.anInt5868;
			this.aClass673_1.anInt5872 = this.aClass673_2.anInt5872;
		}
		Class663.anInt5829 += this.anInt5839 * 1615413587;
	}

	@OriginalMember(owner = "client!xm", name = "z", descriptor = "(Lclient!tx;Lclient!dh;J)V", line = 227)
	void method32878(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) long arg2) {
		for (@Pc(5) Class149_Sub4_Sub1_Sub1 local5 = (Class149_Sub4_Sub1_Sub1) this.aClass21_9.method390((short) 7175); local5 != null; local5 = (Class149_Sub4_Sub1_Sub1) this.aClass21_9.method392(-1915563430)) {
			local5.method23782(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!xm", name = "m", descriptor = "(Lclient!tx;Lclient!dh;J)V", line = 227)
	void method32879(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) long arg2) {
		for (@Pc(5) Class149_Sub4_Sub1_Sub1 local5 = (Class149_Sub4_Sub1_Sub1) this.aClass21_9.method390((short) 23066); local5 != null; local5 = (Class149_Sub4_Sub1_Sub1) this.aClass21_9.method392(-1915563430)) {
			local5.method23782(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!xm", name = "u", descriptor = "(Lclient!tx;Lclient!dh;J)V", line = 227)
	void method32880(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) long arg2) {
		for (@Pc(5) Class149_Sub4_Sub1_Sub1 local5 = (Class149_Sub4_Sub1_Sub1) this.aClass21_9.method390((short) 14312); local5 != null; local5 = (Class149_Sub4_Sub1_Sub1) this.aClass21_9.method392(-1915563430)) {
			local5.method23782(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!xm", name = "p", descriptor = "(Lclient!tx;Lclient!dh;J)V", line = 227)
	void method32881(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) long arg2) {
		for (@Pc(5) Class149_Sub4_Sub1_Sub1 local5 = (Class149_Sub4_Sub1_Sub1) this.aClass21_9.method390((short) 18960); local5 != null; local5 = (Class149_Sub4_Sub1_Sub1) this.aClass21_9.method392(-1915563430)) {
			local5.method23782(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!xm", name = "bi", descriptor = "(II)Z", line = 1404)
	static boolean method32882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 18 || arg0 == 19 || arg0 == 20 || arg0 == 21 || arg0 == 22 || arg0 == 1004) {
			return true;
		} else {
			return arg0 == 17;
		}
	}

	@OriginalMember(owner = "client!xm", name = "ez", descriptor = "(Lclient!yf;I)V", line = 5800)
	static final void method32883(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1183104155);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class336.method27445(local16, local22, arg0, (short) -1767);
	}

	@OriginalMember(owner = "client!xm", name = "amv", descriptor = "(Lclient!yf;I)V", line = 12108)
	static final void method32884(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= 463840436;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(43) int local43 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 3];
		@Pc(47) Class611 local47 = client.aClass532_1.method30455(1703500171);
		Class104_Sub3.method5765((local13 >> 14 & 0x3FFF) - local47.anInt5623 * 270611681, (local13 & 0x3FFF) - local47.anInt5624 * -1994307635, local23 << 2, local33, local43, false, 1645651862);
		client.aBoolean619 = true;
	}
}
