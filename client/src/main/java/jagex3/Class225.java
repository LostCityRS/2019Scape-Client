package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class225 {

	@OriginalMember(owner = "client!df", name = "k", descriptor = "Z")
	static boolean aBoolean650 = true;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "[Lclient!dv;")
	Class235[] aClass235Array1;

	@OriginalMember(owner = "client!df", name = "m", descriptor = "Lclient!py;")
	Class497 aClass497_98;

	@OriginalMember(owner = "client!df", name = "n", descriptor = "I")
	int anInt3685;

	@OriginalMember(owner = "client!df", name = "acf", descriptor = "(Lclient!yf;B)V")
	static void method25696(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class663.method33049(arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091], 1446563644);
	}

	@OriginalMember(owner = "client!df", name = "z", descriptor = "(ILjava/lang/String;ZI)V")
	public static void method25697(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (!Class146_Sub2.method11709(-468641028)) {
			return;
		}
		if (Class411.anInt4907 * 276097583 != arg0) {
			Class411.aLong274 = -7033311592096984251L;
		}
		Class411.anInt4907 = arg0 * 48143567;
		Class411.aString208 = arg1;
		Class411.aBoolean760 = arg2;
		Class481.method29937(7, 1823202236);
	}

	@OriginalMember(owner = "client!df", name = "ag", descriptor = "(III)V")
	public static void method25698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class93_Sub1_Sub11 local9 = Class371.method28187(20, (long) arg1 << 32 | (long) arg0);
		local9.method21877(2147078396);
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!py;)V")
	public Class225(@OriginalArg(0) Class497 arg0) {
		this.aClass497_98 = arg0;
		this.anInt3685 = arg0.method30243(0, 220896787) * -229302655;
		this.method25692(1734033817);
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(II)Lclient!dv;")
	public Class235 method25690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method25692(-1862138123);
		return this.aClass235Array1[arg0];
	}

	@OriginalMember(owner = "client!df", name = "w", descriptor = "(I)Lclient!dv;")
	public Class235 method25691(@OriginalArg(0) int arg0) {
		this.method25692(1535884696);
		return this.aClass235Array1[arg0];
	}

	@OriginalMember(owner = "client!df", name = "n", descriptor = "(I)V")
	void method25692(@OriginalArg(0) int arg0) {
		if (!aBoolean650) {
			return;
		}
		aBoolean650 = false;
		this.aClass235Array1 = new Class235[this.anInt3685 * -844291711];
		for (@Pc(13) int local13 = 0; local13 < this.anInt3685 * -844291711; local13++) {
			@Pc(29) Class93_Sub41 local29 = new Class93_Sub41(this.aClass497_98.method30225(0, local13, (byte) 0));
			if (local29.aByteArray58 == null) {
				this.aClass235Array1[local13] = null;
			} else {
				try {
					@Pc(43) Class235 local43 = new Class235();
					local43.method25847(local13, local29, -1101197480);
					this.aClass235Array1[local13] = local43;
				} catch (@Pc(55) Exception local55) {
					this.aClass235Array1[local13] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "k", descriptor = "(I)Lclient!dv;")
	public Class235 method25693(@OriginalArg(0) int arg0) {
		this.method25692(-921678395);
		return this.aClass235Array1[arg0];
	}

	@OriginalMember(owner = "client!df", name = "f", descriptor = "(I)Lclient!dv;")
	public Class235 method25694(@OriginalArg(0) int arg0) {
		this.method25692(790090943);
		return this.aClass235Array1[arg0];
	}

	@OriginalMember(owner = "client!df", name = "m", descriptor = "(I)Lclient!dv;")
	public Class235 method25695(@OriginalArg(0) int arg0) {
		this.method25692(1760916469);
		return this.aClass235Array1[arg0];
	}
}
