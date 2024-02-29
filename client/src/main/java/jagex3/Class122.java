package jagex3;

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

	@OriginalMember(owner = "client!kz", name = "afq", descriptor = "(Lclient!yf;I)V")
	static void method20230(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class685.anIntArray524[local12 & 0xFFFF];
	}

	@OriginalMember(owner = "client!kz", name = "ajg", descriptor = "(Lclient!yf;I)V")
	static void method20231(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!kz", name = "bfm", descriptor = "(Lclient!yf;I)V")
	static void method20232(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.aClass67_15.method37101();
	}

	@OriginalMember(owner = "client!kz", name = "<init>", descriptor = "(Lclient!py;Lclient!py;Lclient!kp;)V")
	Class122(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class125 arg2) {
		this.aClass497_90 = arg0;
		this.aClass497_89 = arg1;
		this.aClass125_5 = arg2;
	}

	@OriginalMember(owner = "client!kz", name = "w", descriptor = "()V")
	@Override
	public void method28464() {
		@Pc(10) Class5 local10 = Class691.method36775(this.aClass497_89, this.aClass125_5.anInt2986 * -1726029297, Class157.aClass462_2, -827100733);
		this.aClass106_8 = Class694.aClass104_14.method20518(local10, Class203.method24662(this.aClass497_90, this.aClass125_5.anInt2986 * -1726029297), true);
	}

	@OriginalMember(owner = "client!kz", name = "n", descriptor = "(ZI)V")
	@Override
	public final void method28466(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(19) int local19 = this.aClass125_5.aClass390_7.method28454(this.aClass125_5.anInt2983 * 1135283731, client.anInt3511 * 2040043391, -1156484062) + this.aClass125_5.anInt2981 * 483768335;
		@Pc(39) int local39 = this.aClass125_5.aClass392_7.method28471(this.aClass125_5.anInt2980 * -1017655207, client.anInt3512 * -817449061, (short) 255) + this.aClass125_5.anInt2982 * 2099407685;
		this.method20223(arg0, local19, local39, (short) 29116);
		this.method20224(arg0, local19, local39, 1261112801);
		@Pc(55) String local55 = Class653.aClass357_1.method27919((byte) -83);
		if (Class305.method26889(94466000) - this.aLong131 * -4000576377463988303L > 10000L) {
			local55 = local55 + " (" + Class653.aClass357_1.method27922(602155627).anInt4751 * -909097621 + ")";
		}
		this.aClass106_8.method7526(local55, this.aClass125_5.anInt2983 * 1135283731 / 2 + local19, this.aClass125_5.anInt2985 * -1946839755 + local39 + this.aClass125_5.anInt2980 * -1017655207 / 2 + 4, this.aClass125_5.anInt2984 * 291173831, -1, 1357185837);
	}

	@OriginalMember(owner = "client!kz", name = "m", descriptor = "(I)Z")
	@Override
	public boolean method28460(@OriginalArg(0) int arg0) {
		@Pc(1) boolean local1 = true;
		if (!this.aClass497_90.method30235(this.aClass125_5.anInt2986 * -1726029297, -512225963)) {
			local1 = false;
		}
		if (!this.aClass497_89.method30235(this.aClass125_5.anInt2986 * -1726029297, -512225963)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kz", name = "z", descriptor = "(ZIIS)V")
	abstract void method20223(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short arg3);

	@OriginalMember(owner = "client!kz", name = "p", descriptor = "(ZIII)V")
	abstract void method20224(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!kz", name = "d", descriptor = "(B)I")
	final int method20225(@OriginalArg(0) byte arg0) {
		@Pc(3) int local3 = Class653.aClass357_1.method27918(1285578807);
		@Pc(7) int local7 = local3 * 100;
		if (local3 == this.anInt2827 * 466791593 && local3 != 0) {
			@Pc(20) int local20 = Class653.aClass357_1.method27941(-1340940817);
			if (local20 > local3) {
				@Pc(32) long local32 = this.aLong131 * -4000576377463988303L - Class653.aClass357_1.method27939(2010044839);
				if (local32 > 0L) {
					@Pc(48) long local48 = local32 * 10000L / (long) local3 * (long) (local20 - local3);
					@Pc(58) long local58 = (Class305.method26889(805217755) - this.aLong131 * -4000576377463988303L) * 10000L;
					if (local58 < local48) {
						local7 = (int) ((long) (local3 * 100) + (long) (local20 - local3) * 100L * local58 / local48);
					} else {
						local7 = local20 * 100;
					}
				}
			}
		} else {
			this.anInt2827 = local3 * -1466255463;
			this.aLong131 = Class305.method26889(879923751) * 4433505070836107601L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!kz", name = "k", descriptor = "(Z)V")
	@Override
	public final void method28462(@OriginalArg(0) boolean arg0) {
		@Pc(19) int local19 = this.aClass125_5.aClass390_7.method28454(this.aClass125_5.anInt2983 * 1135283731, client.anInt3511 * 2040043391, 1833193692) + this.aClass125_5.anInt2981 * 483768335;
		@Pc(39) int local39 = this.aClass125_5.aClass392_7.method28471(this.aClass125_5.anInt2980 * -1017655207, client.anInt3512 * -817449061, (short) 255) + this.aClass125_5.anInt2982 * 2099407685;
		this.method20223(arg0, local19, local39, (short) 23483);
		this.method20224(arg0, local19, local39, 1261112801);
		@Pc(55) String local55 = Class653.aClass357_1.method27919((byte) -113);
		if (Class305.method26889(-116299067) - this.aLong131 * -4000576377463988303L > 10000L) {
			local55 = local55 + " (" + Class653.aClass357_1.method27922(602155627).anInt4751 * -909097621 + ")";
		}
		this.aClass106_8.method7526(local55, this.aClass125_5.anInt2983 * 1135283731 / 2 + local19, this.aClass125_5.anInt2985 * -1946839755 + local39 + this.aClass125_5.anInt2980 * -1017655207 / 2 + 4, this.aClass125_5.anInt2984 * 291173831, -1, 1357185837);
	}

	@OriginalMember(owner = "client!kz", name = "f", descriptor = "(Z)V")
	@Override
	public final void method28463(@OriginalArg(0) boolean arg0) {
		@Pc(19) int local19 = this.aClass125_5.aClass390_7.method28454(this.aClass125_5.anInt2983 * 1135283731, client.anInt3511 * 2040043391, -141363417) + this.aClass125_5.anInt2981 * 483768335;
		@Pc(39) int local39 = this.aClass125_5.aClass392_7.method28471(this.aClass125_5.anInt2980 * -1017655207, client.anInt3512 * -817449061, (short) 255) + this.aClass125_5.anInt2982 * 2099407685;
		this.method20223(arg0, local19, local39, (short) 7219);
		this.method20224(arg0, local19, local39, 1261112801);
		@Pc(55) String local55 = Class653.aClass357_1.method27919((byte) -15);
		if (Class305.method26889(1260776468) - this.aLong131 * -4000576377463988303L > 10000L) {
			local55 = local55 + " (" + Class653.aClass357_1.method27922(602155627).anInt4751 * -909097621 + ")";
		}
		this.aClass106_8.method7526(local55, this.aClass125_5.anInt2983 * 1135283731 / 2 + local19, this.aClass125_5.anInt2985 * -1946839755 + local39 + this.aClass125_5.anInt2980 * -1017655207 / 2 + 4, this.aClass125_5.anInt2984 * 291173831, -1, 1357185837);
	}

	@OriginalMember(owner = "client!kz", name = "e", descriptor = "(I)V")
	@Override
	public void method28461(@OriginalArg(0) int arg0) {
		@Pc(10) Class5 local10 = Class691.method36775(this.aClass497_89, this.aClass125_5.anInt2986 * -1726029297, Class157.aClass462_2, -868470660);
		this.aClass106_8 = Class694.aClass104_14.method20518(local10, Class203.method24662(this.aClass497_90, this.aClass125_5.anInt2986 * -1726029297), true);
	}

	@OriginalMember(owner = "client!kz", name = "l", descriptor = "()V")
	@Override
	public void method28465() {
		@Pc(10) Class5 local10 = Class691.method36775(this.aClass497_89, this.aClass125_5.anInt2986 * -1726029297, Class157.aClass462_2, -687538583);
		this.aClass106_8 = Class694.aClass104_14.method20518(local10, Class203.method24662(this.aClass497_90, this.aClass125_5.anInt2986 * -1726029297), true);
	}

	@OriginalMember(owner = "client!kz", name = "u", descriptor = "()Z")
	@Override
	public boolean method28459() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass497_90.method30235(this.aClass125_5.anInt2986 * -1726029297, -512225963)) {
			local1 = false;
		}
		if (!this.aClass497_89.method30235(this.aClass125_5.anInt2986 * -1726029297, -512225963)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kz", name = "c", descriptor = "(ZII)V")
	abstract void method20226(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kz", name = "r", descriptor = "()I")
	final int method20227() {
		@Pc(3) int local3 = Class653.aClass357_1.method27918(1285578807);
		@Pc(7) int local7 = local3 * 100;
		if (local3 == this.anInt2827 * 466791593 && local3 != 0) {
			@Pc(20) int local20 = Class653.aClass357_1.method27941(-1251945600);
			if (local20 > local3) {
				@Pc(32) long local32 = this.aLong131 * -4000576377463988303L - Class653.aClass357_1.method27939(2010044839);
				if (local32 > 0L) {
					@Pc(48) long local48 = local32 * 10000L / (long) local3 * (long) (local20 - local3);
					@Pc(58) long local58 = (Class305.method26889(563181815) - this.aLong131 * -4000576377463988303L) * 10000L;
					if (local58 < local48) {
						local7 = (int) ((long) (local3 * 100) + (long) (local20 - local3) * 100L * local58 / local48);
					} else {
						local7 = local20 * 100;
					}
				}
			}
		} else {
			this.anInt2827 = local3 * -1466255463;
			this.aLong131 = Class305.method26889(915094059) * 4433505070836107601L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!kz", name = "v", descriptor = "(ZII)V")
	abstract void method20228(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kz", name = "o", descriptor = "(ZII)V")
	abstract void method20229(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
