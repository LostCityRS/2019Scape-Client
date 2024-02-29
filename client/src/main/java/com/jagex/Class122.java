package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kz")
public abstract class Class122 implements Interface33 {

	@OriginalMember(owner = "client!kz", name = "k", descriptor = "Lclient!eu;")
	Class106 aClass106_8;

	@OriginalMember(owner = "client!kz", name = "f", descriptor = "I")
	int anInt2827;

	@OriginalMember(owner = "client!kz", name = "w", descriptor = "J")
	long aLong131;

	@OriginalMember(owner = "client!kz", name = "e", descriptor = "Lclient!py;")
	final Class497 aClass497_90;

	@OriginalMember(owner = "client!kz", name = "n", descriptor = "Lclient!py;")
	final Class497 aClass497_89;

	@OriginalMember(owner = "client!kz", name = "m", descriptor = "Lclient!kp;")
	final Class125 aClass125_5;

	@OriginalMember(owner = "client!kz", name = "<init>", descriptor = "(Lclient!py;Lclient!py;Lclient!kp;)V", line = 19)
	Class122(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class125 arg2) {
		this.aClass497_90 = arg0;
		this.aClass497_89 = arg1;
		this.aClass125_5 = arg2;
	}

	@OriginalMember(owner = "client!kz", name = "n", descriptor = "(ZI)V", line = 26)
	@Override
	public void method28285(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(19) int local19 = this.aClass125_5.aClass390_7.method28274(this.aClass125_5.anInt2983 * 1135283731, client.anInt3511 * 2040043391, -1156484062) + this.aClass125_5.anInt2981 * 483768335;
		@Pc(39) int local39 = this.aClass125_5.aClass392_7.method28291(this.aClass125_5.anInt2980 * -1017655207, client.anInt3512 * -817449061, (short) 255) + this.aClass125_5.anInt2982 * 2099407685;
		this.method20216(arg0, local19, local39, (short) 29116);
		this.method20217(arg0, local19, local39, 1261112801);
		@Pc(55) String local55 = Class653.aClass357_1.method27751((byte) -83);
		if (Class305.method26797(94466000) - this.aLong131 * -4000576377463988303L > 10000L) {
			local55 = local55 + " (" + Class653.aClass357_1.method27760(602155627).anInt4590 * -909097621 + ")";
		}
		this.aClass106_8.method7530(local55, this.aClass125_5.anInt2983 * 1135283731 / 2 + local19, this.aClass125_5.anInt2985 * -1946839755 + local39 + this.aClass125_5.anInt2980 * -1017655207 / 2 + 4, this.aClass125_5.anInt2984 * 291173831, -1, 1357185837);
	}

	@OriginalMember(owner = "client!kz", name = "k", descriptor = "(Z)V", line = 26)
	@Override
	public void method28281(@OriginalArg(0) boolean arg0) {
		@Pc(19) int local19 = this.aClass125_5.aClass390_7.method28274(this.aClass125_5.anInt2983 * 1135283731, client.anInt3511 * 2040043391, 1833193692) + this.aClass125_5.anInt2981 * 483768335;
		@Pc(39) int local39 = this.aClass125_5.aClass392_7.method28291(this.aClass125_5.anInt2980 * -1017655207, client.anInt3512 * -817449061, (short) 255) + this.aClass125_5.anInt2982 * 2099407685;
		this.method20216(arg0, local19, local39, (short) 23483);
		this.method20217(arg0, local19, local39, 1261112801);
		@Pc(55) String local55 = Class653.aClass357_1.method27751((byte) -113);
		if (Class305.method26797(-116299067) - this.aLong131 * -4000576377463988303L > 10000L) {
			local55 = local55 + " (" + Class653.aClass357_1.method27760(602155627).anInt4590 * -909097621 + ")";
		}
		this.aClass106_8.method7530(local55, this.aClass125_5.anInt2983 * 1135283731 / 2 + local19, this.aClass125_5.anInt2985 * -1946839755 + local39 + this.aClass125_5.anInt2980 * -1017655207 / 2 + 4, this.aClass125_5.anInt2984 * 291173831, -1, 1357185837);
	}

	@OriginalMember(owner = "client!kz", name = "f", descriptor = "(Z)V", line = 26)
	@Override
	public void method28282(@OriginalArg(0) boolean arg0) {
		@Pc(19) int local19 = this.aClass125_5.aClass390_7.method28274(this.aClass125_5.anInt2983 * 1135283731, client.anInt3511 * 2040043391, -141363417) + this.aClass125_5.anInt2981 * 483768335;
		@Pc(39) int local39 = this.aClass125_5.aClass392_7.method28291(this.aClass125_5.anInt2980 * -1017655207, client.anInt3512 * -817449061, (short) 255) + this.aClass125_5.anInt2982 * 2099407685;
		this.method20216(arg0, local19, local39, (short) 7219);
		this.method20217(arg0, local19, local39, 1261112801);
		@Pc(55) String local55 = Class653.aClass357_1.method27751((byte) -15);
		if (Class305.method26797(1260776468) - this.aLong131 * -4000576377463988303L > 10000L) {
			local55 = local55 + " (" + Class653.aClass357_1.method27760(602155627).anInt4590 * -909097621 + ")";
		}
		this.aClass106_8.method7530(local55, this.aClass125_5.anInt2983 * 1135283731 / 2 + local19, this.aClass125_5.anInt2985 * -1946839755 + local39 + this.aClass125_5.anInt2980 * -1017655207 / 2 + 4, this.aClass125_5.anInt2984 * 291173831, -1, 1357185837);
	}

	@OriginalMember(owner = "client!kz", name = "w", descriptor = "()V", line = 36)
	@Override
	public void method28283() {
		@Pc(10) Class5 local10 = Class691.method36548(this.aClass497_89, this.aClass125_5.anInt2986 * -1726029297, Class157.aClass462_2, -827100733);
		this.aClass106_8 = Class694.aClass104_14.method20593(local10, Class203.method24653(this.aClass497_90, this.aClass125_5.anInt2986 * -1726029297), true);
	}

	@OriginalMember(owner = "client!kz", name = "e", descriptor = "(I)V", line = 36)
	@Override
	public void method28280(@OriginalArg(0) int arg0) {
		@Pc(10) Class5 local10 = Class691.method36548(this.aClass497_89, this.aClass125_5.anInt2986 * -1726029297, Class157.aClass462_2, -868470660);
		this.aClass106_8 = Class694.aClass104_14.method20593(local10, Class203.method24653(this.aClass497_90, this.aClass125_5.anInt2986 * -1726029297), true);
	}

	@OriginalMember(owner = "client!kz", name = "l", descriptor = "()V", line = 36)
	@Override
	public void method28284() {
		@Pc(10) Class5 local10 = Class691.method36548(this.aClass497_89, this.aClass125_5.anInt2986 * -1726029297, Class157.aClass462_2, -687538583);
		this.aClass106_8 = Class694.aClass104_14.method20593(local10, Class203.method24653(this.aClass497_90, this.aClass125_5.anInt2986 * -1726029297), true);
	}

	@OriginalMember(owner = "client!kz", name = "m", descriptor = "(I)Z", line = 41)
	@Override
	public boolean method28279(@OriginalArg(0) int arg0) {
		@Pc(1) boolean local1 = true;
		if (!this.aClass497_90.method30071(this.aClass125_5.anInt2986 * -1726029297, -512225963)) {
			local1 = false;
		}
		if (!this.aClass497_89.method30071(this.aClass125_5.anInt2986 * -1726029297, -512225963)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kz", name = "u", descriptor = "()Z", line = 41)
	@Override
	public boolean method28278() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass497_90.method30071(this.aClass125_5.anInt2986 * -1726029297, -512225963)) {
			local1 = false;
		}
		if (!this.aClass497_89.method30071(this.aClass125_5.anInt2986 * -1726029297, -512225963)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kz", name = "d", descriptor = "(B)I", line = 51)
	int method20211(@OriginalArg(0) byte arg0) {
		@Pc(3) int local3 = Class653.aClass357_1.method27749(1285578807);
		@Pc(7) int local7 = local3 * 100;
		if (local3 == this.anInt2827 * 466791593 && local3 != 0) {
			@Pc(20) int local20 = Class653.aClass357_1.method27748(-1340940817);
			if (local20 > local3) {
				@Pc(32) long local32 = this.aLong131 * -4000576377463988303L - Class653.aClass357_1.method27758(2010044839);
				if (local32 > 0L) {
					@Pc(48) long local48 = local32 * 10000L / (long) local3 * (long) (local20 - local3);
					@Pc(58) long local58 = (Class305.method26797(805217755) - this.aLong131 * -4000576377463988303L) * 10000L;
					if (local58 < local48) {
						local7 = (int) ((long) (local3 * 100) + (long) (local20 - local3) * 100L * local58 / local48);
					} else {
						local7 = local20 * 100;
					}
				}
			}
		} else {
			this.anInt2827 = local3 * -1466255463;
			this.aLong131 = Class305.method26797(879923751) * 4433505070836107601L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!kz", name = "r", descriptor = "()I", line = 51)
	int method20212() {
		@Pc(3) int local3 = Class653.aClass357_1.method27749(1285578807);
		@Pc(7) int local7 = local3 * 100;
		if (local3 == this.anInt2827 * 466791593 && local3 != 0) {
			@Pc(20) int local20 = Class653.aClass357_1.method27748(-1251945600);
			if (local20 > local3) {
				@Pc(32) long local32 = this.aLong131 * -4000576377463988303L - Class653.aClass357_1.method27758(2010044839);
				if (local32 > 0L) {
					@Pc(48) long local48 = local32 * 10000L / (long) local3 * (long) (local20 - local3);
					@Pc(58) long local58 = (Class305.method26797(563181815) - this.aLong131 * -4000576377463988303L) * 10000L;
					if (local58 < local48) {
						local7 = (int) ((long) (local3 * 100) + (long) (local20 - local3) * 100L * local58 / local48);
					} else {
						local7 = local20 * 100;
					}
				}
			}
		} else {
			this.anInt2827 = local3 * -1466255463;
			this.aLong131 = Class305.method26797(915094059) * 4433505070836107601L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!kz", name = "afq", descriptor = "(Lclient!yf;I)V", line = 10463)
	static final void method20213(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class685.anIntArray522[local12 & 0xFFFF];
	}

	@OriginalMember(owner = "client!kz", name = "ajg", descriptor = "(Lclient!yf;I)V", line = 11424)
	static final void method20214(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!kz", name = "bfm", descriptor = "(Lclient!yf;I)V", line = 15145)
	static final void method20215(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aClass67_15.method36920();
	}

	@OriginalMember(owner = "client!kz", name = "z", descriptor = "(ZIIS)V")
	abstract void method20216(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short arg3);

	@OriginalMember(owner = "client!kz", name = "p", descriptor = "(ZIII)V")
	abstract void method20217(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!kz", name = "c", descriptor = "(ZII)V")
	abstract void method20218(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kz", name = "v", descriptor = "(ZII)V")
	abstract void method20219(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kz", name = "o", descriptor = "(ZII)V")
	abstract void method20220(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
