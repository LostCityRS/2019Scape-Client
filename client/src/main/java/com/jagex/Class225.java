package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public class Class225 {

	@OriginalMember(owner = "client!df", name = "k", descriptor = "Z")
	static boolean aBoolean646 = true;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "[Lclient!dv;")
	Class235[] aClass235Array1;

	@OriginalMember(owner = "client!df", name = "m", descriptor = "Lclient!py;")
	Class497 aClass497_98;

	@OriginalMember(owner = "client!df", name = "n", descriptor = "I")
	int anInt3644;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!py;)V", line = 12)
	public Class225(@OriginalArg(0) Class497 arg0) {
		this.aClass497_98 = arg0;
		this.anInt3644 = arg0.method30084(0, 220896787) * -229302655;
		this.method25602(1734033817);
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(II)Lclient!dv;", line = 19)
	public Class235 method25597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method25602(-1862138123);
		return this.aClass235Array1[arg0];
	}

	@OriginalMember(owner = "client!df", name = "w", descriptor = "(I)Lclient!dv;", line = 19)
	public Class235 method25598(@OriginalArg(0) int arg0) {
		this.method25602(1535884696);
		return this.aClass235Array1[arg0];
	}

	@OriginalMember(owner = "client!df", name = "k", descriptor = "(I)Lclient!dv;", line = 19)
	public Class235 method25599(@OriginalArg(0) int arg0) {
		this.method25602(-921678395);
		return this.aClass235Array1[arg0];
	}

	@OriginalMember(owner = "client!df", name = "f", descriptor = "(I)Lclient!dv;", line = 19)
	public Class235 method25600(@OriginalArg(0) int arg0) {
		this.method25602(790090943);
		return this.aClass235Array1[arg0];
	}

	@OriginalMember(owner = "client!df", name = "m", descriptor = "(I)Lclient!dv;", line = 19)
	public Class235 method25601(@OriginalArg(0) int arg0) {
		this.method25602(1760916469);
		return this.aClass235Array1[arg0];
	}

	@OriginalMember(owner = "client!df", name = "n", descriptor = "(I)V", line = 24)
	void method25602(@OriginalArg(0) int arg0) {
		if (!aBoolean646) {
			return;
		}
		aBoolean646 = false;
		this.aClass235Array1 = new Class235[this.anInt3644 * -844291711];
		for (@Pc(13) int local13 = 0; local13 < this.anInt3644 * -844291711; local13++) {
			@Pc(29) Packet local29 = new Packet(this.aClass497_98.method30064(0, local13, (byte) 0));
			if (local29.data == null) {
				this.aClass235Array1[local13] = null;
			} else {
				try {
					@Pc(43) Class235 local43 = new Class235();
					local43.method25755(local13, local29, -1101197480);
					this.aClass235Array1[local13] = local43;
				} catch (@Pc(55) Exception local55) {
					this.aClass235Array1[local13] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "z", descriptor = "(ILjava/lang/String;ZI)V", line = 168)
	public static void method25603(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (!Class146_Sub2.method11709(-468641028)) {
			return;
		}
		if (Class411.anInt4746 * 276097583 != arg0) {
			Class411.aLong271 = -7033311592096984251L;
		}
		Class411.anInt4746 = arg0 * 48143567;
		Class411.aString199 = arg1;
		Class411.aBoolean751 = arg2;
		Class481.method29756(7, 1823202236);
	}

	@OriginalMember(owner = "client!df", name = "ag", descriptor = "(III)V", line = 177)
	public static void method25604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class93_Sub1_Sub11 local9 = Class371.method28000(20, (long) arg1 << 32 | (long) arg0);
		local9.method21885(2147078396);
	}

	@OriginalMember(owner = "client!df", name = "acf", descriptor = "(Lclient!yf;B)V", line = 10058)
	static final void method25605(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class663.method32870(arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], 1446563644);
	}
}
