package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class230 {

	@OriginalMember(owner = "client!dn", name = "fy", descriptor = "Lclient!py;")
	public static Class497 aClass497_99;

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "Z")
	boolean aBoolean651;

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "F")
	float aFloat274;

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "Lclient!db;")
	Class222 aClass222_6;

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "Lclient!db;")
	Class222 aClass222_7;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "[Lclient!ey;")
	Class254[] aClass254Array1;

	@OriginalMember(owner = "client!dn", name = "w", descriptor = "Z")
	boolean aBoolean652;

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "F")
	float aFloat275;

	@OriginalMember(owner = "client!dn", name = "u", descriptor = "F")
	float aFloat276;

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "Z")
	boolean aBoolean653;

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "[F")
	float[] aFloatArray98;

	@OriginalMember(owner = "client!dn", name = "v", descriptor = "F")
	float aFloat277;

	@OriginalMember(owner = "client!dn", name = "z", descriptor = "[F")
	float[] aFloatArray99 = new float[4];

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "[F")
	float[] aFloatArray97 = new float[4];

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "Z")
	boolean aBoolean654 = true;

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
	int anInt3776 = 0;

	@OriginalMember(owner = "client!dn", name = "pu", descriptor = "(Lclient!yf;I)V")
	static void method25744(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1168259715);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class28.method603(local16, local22, arg0, (byte) -108);
	}

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "(Lclient!ov;I)I")
	public static int method25745(@OriginalArg(0) Class471 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class472 local4 = Class472.method29710(0.0F, 0.0F, 1.0F);
		local4.method29753(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat325, (double) local4.aFloat327);
		local4.method29713();
		if (local15 < 0.0D) {
			local15 = 3.141592653589793D + 3.141592653589793D + local15;
		}
		return (int) (local15 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!dn", name = "aiu", descriptor = "(Lclient!yf;I)V")
	static void method25746(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.aClass434_1.anIntArray447[local13] = local23;
	}

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
	Class230() {
	}

	@OriginalMember(owner = "client!dn", name = "u", descriptor = "(I)I")
	int method25719(@OriginalArg(0) int arg0) {
		return this.aClass254Array1 == null ? 0 : this.aClass254Array1.length;
	}

	@OriginalMember(owner = "client!dn", name = "z", descriptor = "(Lclient!alw;I)I")
	int method25720(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.method22427(-1434290800);
		Class263.method26291(arg0.method22425((short) 16384), -1925978155);
		this.aClass222_6 = Class151.method13978(arg0.method22425((short) 16384), (byte) 0);
		this.aClass222_7 = Class151.method13978(arg0.method22425((short) 16384), (byte) 0);
		this.aBoolean651 = arg0.method22425((short) 16384) != 0;
		this.aClass254Array1 = new Class254[local3];
		@Pc(38) Class254 local38 = null;
		@Pc(40) int local40;
		for (local40 = 0; local40 < local3; local40++) {
			@Pc(47) Class254 local47 = new Class254();
			local47.method26089(arg0, arg1, -1454412503);
			this.aClass254Array1[local40] = local47;
			if (local38 != null) {
				local38.aClass254_1 = local47;
			}
			local38 = local47;
		}
		this.aFloatArray98 = new float[this.method25724(1939832912) + 1];
		for (local40 = this.method25722(583954492); local40 <= this.method25733(-1679471766); local40++) {
			this.aFloatArray98[local40 - this.method25722(583954492)] = Class158.method14311(this, (float) local40, -698015169);
		}
		this.aFloat277 = Class158.method14311(this, (float) (this.method25722(583954492) - 1), 1544378774);
		this.aFloat274 = Class158.method14311(this, (float) (this.method25733(-193465815) + 1), 2060419373);
		return local3;
	}

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "(II)F")
	float method25721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < this.method25722(583954492)) {
			return this.aFloat277;
		} else if (arg0 > this.method25733(2613642)) {
			return this.aFloat274;
		} else {
			return this.aFloatArray98[arg0 - this.method25722(583954492)];
		}
	}

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "(I)I")
	int method25722(@OriginalArg(0) int arg0) {
		return this.aClass254Array1 == null ? 0 : this.aClass254Array1[0].anInt3893 * 1727636433;
	}

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "(F)Lclient!ey;")
	Class254 method25723(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = this.method25725(arg0, (byte) -67);
		return local4 >= 0 && local4 < this.aClass254Array1.length ? this.aClass254Array1[local4] : null;
	}

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "(I)I")
	int method25724(@OriginalArg(0) int arg0) {
		return this.method25733(-277014503) - this.method25722(583954492);
	}

	@OriginalMember(owner = "client!dn", name = "w", descriptor = "(FB)I")
	int method25725(@OriginalArg(0) float arg0, @OriginalArg(1) byte arg1) {
		if (this.anInt3776 * -534580841 >= 0 && (float) (this.aClass254Array1[this.anInt3776 * -534580841].anInt3893 * 1727636433) <= arg0 && (this.aClass254Array1[this.anInt3776 * -534580841].aClass254_1 == null || (float) (this.aClass254Array1[this.anInt3776 * -534580841].aClass254_1.anInt3893 * 1727636433) > arg0)) {
			return this.anInt3776 * -534580841;
		} else if (arg0 < (float) this.method25722(583954492) || arg0 > (float) this.method25733(-1951807406)) {
			return -1;
		} else {
			@Pc(67) int local67 = this.method25719(-1507711602);
			@Pc(72) int local72 = this.anInt3776 * -534580841;
			if (local67 > 0) {
				@Pc(76) int local76 = 0;
				@Pc(80) int local80 = local67 - 1;
				do {
					@Pc(86) int local86 = local76 + local80 >> 1;
					if (arg0 < (float) (this.aClass254Array1[local86].anInt3893 * 1727636433)) {
						if (arg0 > (float) (this.aClass254Array1[local86 - 1].anInt3893 * 1727636433)) {
							local72 = local86 - 1;
							break;
						}
						local80 = local86 - 1;
					} else {
						if (!(arg0 > (float) (this.aClass254Array1[local86].anInt3893 * 1727636433))) {
							local72 = local86;
							break;
						}
						if (arg0 < (float) (this.aClass254Array1[local86 + 1].anInt3893 * 1727636433)) {
							local72 = local86;
							break;
						}
						local76 = local86 + 1;
					}
				} while (local76 <= local80);
			}
			if (local72 != this.anInt3776 * -534580841) {
				this.anInt3776 = local72 * 1363058215;
				this.aBoolean654 = true;
			}
			return this.anInt3776 * -534580841;
		}
	}

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "(FI)Lclient!ey;")
	Class254 method25726(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.method25725(arg0, (byte) -15);
		return local4 >= 0 && local4 < this.aClass254Array1.length ? this.aClass254Array1[local4] : null;
	}

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "()I")
	int method25727() {
		return this.aClass254Array1 == null ? 0 : this.aClass254Array1[this.method25719(-1507711602) - 1].anInt3893 * 1727636433;
	}

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "(Lclient!alw;I)I")
	int method25728(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.method22427(-1434290800);
		Class263.method26291(arg0.method22425((short) 16384), -1916519202);
		this.aClass222_6 = Class151.method13978(arg0.method22425((short) 16384), (byte) 0);
		this.aClass222_7 = Class151.method13978(arg0.method22425((short) 16384), (byte) 0);
		this.aBoolean651 = arg0.method22425((short) 16384) != 0;
		this.aClass254Array1 = new Class254[local3];
		@Pc(38) Class254 local38 = null;
		@Pc(40) int local40;
		for (local40 = 0; local40 < local3; local40++) {
			@Pc(47) Class254 local47 = new Class254();
			local47.method26089(arg0, arg1, -1901686755);
			this.aClass254Array1[local40] = local47;
			if (local38 != null) {
				local38.aClass254_1 = local47;
			}
			local38 = local47;
		}
		this.aFloatArray98 = new float[this.method25724(1824730251) + 1];
		for (local40 = this.method25722(583954492); local40 <= this.method25733(-2107843277); local40++) {
			this.aFloatArray98[local40 - this.method25722(583954492)] = Class158.method14311(this, (float) local40, -613383931);
		}
		this.aFloat277 = Class158.method14311(this, (float) (this.method25722(583954492) - 1), -2008326949);
		this.aFloat274 = Class158.method14311(this, (float) (this.method25733(-1625722769) + 1), -200822286);
		return local3;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(F)Lclient!ey;")
	Class254 method25729(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = this.method25725(arg0, (byte) -112);
		return local4 >= 0 && local4 < this.aClass254Array1.length ? this.aClass254Array1[local4] : null;
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(Lclient!alw;I)I")
	int method25730(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.method22427(-1434290800);
		Class263.method26291(arg0.method22425((short) 16384), -1579061855);
		this.aClass222_6 = Class151.method13978(arg0.method22425((short) 16384), (byte) 0);
		this.aClass222_7 = Class151.method13978(arg0.method22425((short) 16384), (byte) 0);
		this.aBoolean651 = arg0.method22425((short) 16384) != 0;
		this.aClass254Array1 = new Class254[local3];
		@Pc(38) Class254 local38 = null;
		@Pc(40) int local40;
		for (local40 = 0; local40 < local3; local40++) {
			@Pc(47) Class254 local47 = new Class254();
			local47.method26089(arg0, arg1, 1246408303);
			this.aClass254Array1[local40] = local47;
			if (local38 != null) {
				local38.aClass254_1 = local47;
			}
			local38 = local47;
		}
		this.aFloatArray98 = new float[this.method25724(1604094791) + 1];
		for (local40 = this.method25722(583954492); local40 <= this.method25733(-904815006); local40++) {
			this.aFloatArray98[local40 - this.method25722(583954492)] = Class158.method14311(this, (float) local40, 986538439);
		}
		this.aFloat277 = Class158.method14311(this, (float) (this.method25722(583954492) - 1), 1779469896);
		this.aFloat274 = Class158.method14311(this, (float) (this.method25733(-378456364) + 1), -779735763);
		return local3;
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)F")
	float method25731(@OriginalArg(0) int arg0) {
		if (arg0 < this.method25722(583954492)) {
			return this.aFloat277;
		} else if (arg0 > this.method25733(-441996045)) {
			return this.aFloat274;
		} else {
			return this.aFloatArray98[arg0 - this.method25722(583954492)];
		}
	}

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "(I)F")
	float method25732(@OriginalArg(0) int arg0) {
		if (arg0 < this.method25722(583954492)) {
			return this.aFloat277;
		} else if (arg0 > this.method25733(-1256606992)) {
			return this.aFloat274;
		} else {
			return this.aFloatArray98[arg0 - this.method25722(583954492)];
		}
	}

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "(I)I")
	int method25733(@OriginalArg(0) int arg0) {
		return this.aClass254Array1 == null ? 0 : this.aClass254Array1[this.method25719(-1507711602) - 1].anInt3893 * 1727636433;
	}

	@OriginalMember(owner = "client!dn", name = "s", descriptor = "()I")
	int method25734() {
		return this.aClass254Array1 == null ? 0 : this.aClass254Array1[this.method25719(-1507711602) - 1].anInt3893 * 1727636433;
	}

	@OriginalMember(owner = "client!dn", name = "y", descriptor = "()I")
	int method25735() {
		return this.aClass254Array1 == null ? 0 : this.aClass254Array1[this.method25719(-1507711602) - 1].anInt3893 * 1727636433;
	}

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "(F)Lclient!ey;")
	Class254 method25736(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = this.method25725(arg0, (byte) -118);
		return local4 >= 0 && local4 < this.aClass254Array1.length ? this.aClass254Array1[local4] : null;
	}

	@OriginalMember(owner = "client!dn", name = "x", descriptor = "()I")
	int method25737() {
		return this.aClass254Array1 == null ? 0 : this.aClass254Array1[this.method25719(-1507711602) - 1].anInt3893 * 1727636433;
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "()I")
	int method25738() {
		return this.method25733(136306628) - this.method25722(583954492);
	}

	@OriginalMember(owner = "client!dn", name = "v", descriptor = "(I)F")
	float method25739(@OriginalArg(0) int arg0) {
		if (arg0 < this.method25722(583954492)) {
			return this.aFloat277;
		} else if (arg0 > this.method25733(-1493777469)) {
			return this.aFloat274;
		} else {
			return this.aFloatArray98[arg0 - this.method25722(583954492)];
		}
	}

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "(Lclient!alw;II)I")
	int method25740(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0.method22427(-1434290800);
		Class263.method26291(arg0.method22425((short) 16384), -1774552870);
		this.aClass222_6 = Class151.method13978(arg0.method22425((short) 16384), (byte) 0);
		this.aClass222_7 = Class151.method13978(arg0.method22425((short) 16384), (byte) 0);
		this.aBoolean651 = arg0.method22425((short) 16384) != 0;
		this.aClass254Array1 = new Class254[local3];
		@Pc(38) Class254 local38 = null;
		@Pc(40) int local40;
		for (local40 = 0; local40 < local3; local40++) {
			@Pc(47) Class254 local47 = new Class254();
			local47.method26089(arg0, arg1, 758426843);
			this.aClass254Array1[local40] = local47;
			if (local38 != null) {
				local38.aClass254_1 = local47;
			}
			local38 = local47;
		}
		this.aFloatArray98 = new float[this.method25724(1301336846) + 1];
		for (local40 = this.method25722(583954492); local40 <= this.method25733(-2043335122); local40++) {
			this.aFloatArray98[local40 - this.method25722(583954492)] = Class158.method14311(this, (float) local40, 1589252846);
		}
		this.aFloat277 = Class158.method14311(this, (float) (this.method25722(583954492) - 1), 1338927684);
		this.aFloat274 = Class158.method14311(this, (float) (this.method25733(-529509718) + 1), -2023648687);
		return local3;
	}

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "()I")
	int method25741() {
		return this.aClass254Array1 == null ? 0 : this.aClass254Array1[0].anInt3893 * 1727636433;
	}

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "()I")
	int method25742() {
		return this.aClass254Array1 == null ? 0 : this.aClass254Array1.length;
	}

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "(F)I")
	int method25743(@OriginalArg(0) float arg0) {
		if (this.anInt3776 * -534580841 >= 0 && (float) (this.aClass254Array1[this.anInt3776 * -534580841].anInt3893 * 1727636433) <= arg0 && (this.aClass254Array1[this.anInt3776 * -534580841].aClass254_1 == null || (float) (this.aClass254Array1[this.anInt3776 * -534580841].aClass254_1.anInt3893 * 1727636433) > arg0)) {
			return this.anInt3776 * -534580841;
		} else if (arg0 < (float) this.method25722(583954492) || arg0 > (float) this.method25733(-973816676)) {
			return -1;
		} else {
			@Pc(67) int local67 = this.method25719(-1507711602);
			@Pc(72) int local72 = this.anInt3776 * -534580841;
			if (local67 > 0) {
				@Pc(76) int local76 = 0;
				@Pc(80) int local80 = local67 - 1;
				do {
					@Pc(86) int local86 = local76 + local80 >> 1;
					if (arg0 < (float) (this.aClass254Array1[local86].anInt3893 * 1727636433)) {
						if (arg0 > (float) (this.aClass254Array1[local86 - 1].anInt3893 * 1727636433)) {
							local72 = local86 - 1;
							break;
						}
						local80 = local86 - 1;
					} else {
						if (!(arg0 > (float) (this.aClass254Array1[local86].anInt3893 * 1727636433))) {
							local72 = local86;
							break;
						}
						if (arg0 < (float) (this.aClass254Array1[local86 + 1].anInt3893 * 1727636433)) {
							local72 = local86;
							break;
						}
						local76 = local86 + 1;
					}
				} while (local76 <= local80);
			}
			if (local72 != this.anInt3776 * -534580841) {
				this.anInt3776 = local72 * 1363058215;
				this.aBoolean654 = true;
			}
			return this.anInt3776 * -534580841;
		}
	}
}
