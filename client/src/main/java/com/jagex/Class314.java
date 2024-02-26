package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class314 {

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "[I")
	public int[] anIntArray379;

	@OriginalMember(owner = "client!hi", name = "u", descriptor = "Ljava/lang/String;")
	String aString173;

	@OriginalMember(owner = "client!hi", name = "t", descriptor = "Lclient!hl;")
	Class317 aClass317_7;

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "Ljava/lang/String;")
	String aString174;

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "Lclient!hl;")
	Class317 aClass317_8;

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "[I")
	public int[] anIntArray380;

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
	int anInt4020 = 1350624439;

	@OriginalMember(owner = "client!hi", name = "awn", descriptor = "(Lclient!yp;I)V")
	static void method27491(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -442943724;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(28) boolean local28 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1] == 1;
		@Pc(38) int local38 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(53) boolean local53 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 3] == 1;
		Class104_Sub3.method5775(local13, local28, local38, local53, -156035612);
	}

	@OriginalMember(owner = "client!hi", name = "bbo", descriptor = "(Lclient!yp;I)V")
	static void method27492(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!hi", name = "t", descriptor = "(I)[Lclient!ud;")
	static Class590[] method27493(@OriginalArg(0) int arg0) {
		return new Class590[] { Class590.aClass590_3, Class590.aClass590_2 };
	}

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
	Class314() {
	}

	@OriginalMember(owner = "client!hi", name = "t", descriptor = "(Lclient!hm;I)V")
	void method27488(@OriginalArg(0) Class318 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.method27520(-2068789169);
		this.aClass317_7 = Class226.method25966((byte) 49)[local3];
		@Pc(17) int local17;
		if (this.aClass317_7 == Class317.aClass317_10) {
			local17 = arg0.method27520(-2087915975);
			this.aClass317_8 = Class226.method25966((byte) -74)[local17];
			this.anInt4020 = arg0.method27520(-1772961563) * -1350624439;
		}
		this.aString173 = arg0.method27519((byte) 14);
		this.aString174 = arg0.method27519((byte) 14);
		local17 = arg0.method27520(-1754791579);
		this.anIntArray380 = new int[local17];
		this.anIntArray379 = new int[local17];
		for (@Pc(54) int local54 = 0; local54 < local17; local54++) {
			this.anIntArray380[local54] = arg0.method27520(-1989028929);
			this.anIntArray379[local54] = arg0.method27520(-1914017788);
		}
	}

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "(Lclient!hm;)V")
	void method27489(@OriginalArg(0) Class318 arg0) {
		@Pc(3) int local3 = arg0.method27520(-1788069615);
		this.aClass317_7 = Class226.method25966((byte) -18)[local3];
		@Pc(17) int local17;
		if (this.aClass317_7 == Class317.aClass317_10) {
			local17 = arg0.method27520(-2140445477);
			this.aClass317_8 = Class226.method25966((byte) -30)[local17];
			this.anInt4020 = arg0.method27520(-2143685154) * -1350624439;
		}
		this.aString173 = arg0.method27519((byte) 14);
		this.aString174 = arg0.method27519((byte) 14);
		local17 = arg0.method27520(-1824904724);
		this.anIntArray380 = new int[local17];
		this.anIntArray379 = new int[local17];
		for (@Pc(54) int local54 = 0; local54 < local17; local54++) {
			this.anIntArray380[local54] = arg0.method27520(-2132215767);
			this.anIntArray379[local54] = arg0.method27520(-2094452329);
		}
	}

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "(Lclient!hm;)V")
	void method27490(@OriginalArg(0) Class318 arg0) {
		@Pc(3) int local3 = arg0.method27520(-1982711689);
		this.aClass317_7 = Class226.method25966((byte) 49)[local3];
		@Pc(17) int local17;
		if (this.aClass317_7 == Class317.aClass317_10) {
			local17 = arg0.method27520(-2001870375);
			this.aClass317_8 = Class226.method25966((byte) 60)[local17];
			this.anInt4020 = arg0.method27520(-1858183447) * -1350624439;
		}
		this.aString173 = arg0.method27519((byte) 14);
		this.aString174 = arg0.method27519((byte) 14);
		local17 = arg0.method27520(-2080462045);
		this.anIntArray380 = new int[local17];
		this.anIntArray379 = new int[local17];
		for (@Pc(54) int local54 = 0; local54 < local17; local54++) {
			this.anIntArray380[local54] = arg0.method27520(-1942083082);
			this.anIntArray379[local54] = arg0.method27520(-2002738328);
		}
	}
}
