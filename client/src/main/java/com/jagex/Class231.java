package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class231 {

	@OriginalMember(owner = "client!dr", name = "bs", descriptor = "Lclient!cm;")
	public static Class99 aClass99_27;

	@OriginalMember(owner = "client!dr", name = "fi", descriptor = "Lclient!pf;")
	public static Class480 aClass480_86;

	@OriginalMember(owner = "client!dr", name = "oy", descriptor = "J")
	public static long aLong355;

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "Lclient!dj;")
	Class225 aClass225_6;

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "Z")
	boolean aBoolean760;

	@OriginalMember(owner = "client!dr", name = "l", descriptor = "[Lclient!ev;")
	Class253[] aClass253Array1;

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "Z")
	boolean aBoolean761;

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "F")
	float aFloat276;

	@OriginalMember(owner = "client!dr", name = "m", descriptor = "F")
	float aFloat277;

	@OriginalMember(owner = "client!dr", name = "u", descriptor = "Lclient!dj;")
	Class225 aClass225_7;

	@OriginalMember(owner = "client!dr", name = "k", descriptor = "[F")
	float[] aFloatArray99;

	@OriginalMember(owner = "client!dr", name = "x", descriptor = "F")
	float aFloat278;

	@OriginalMember(owner = "client!dr", name = "w", descriptor = "F")
	float aFloat279;

	@OriginalMember(owner = "client!dr", name = "t", descriptor = "Z")
	boolean aBoolean762;

	@OriginalMember(owner = "client!dr", name = "o", descriptor = "[F")
	float[] aFloatArray97 = new float[4];

	@OriginalMember(owner = "client!dr", name = "j", descriptor = "[F")
	float[] aFloatArray98 = new float[4];

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "Z")
	boolean aBoolean759 = true;

	@OriginalMember(owner = "client!dr", name = "s", descriptor = "I")
	int anInt3774 = 0;

	@OriginalMember(owner = "client!dr", name = "ry", descriptor = "(Lclient!yp;B)V")
	static void method26033(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2132172257);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class531.method30815(local16, local22, arg0, 2013755656);
	}

	@OriginalMember(owner = "client!dr", name = "anb", descriptor = "(Lclient!yp;I)V")
	static void method26034(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (Class160.aClass121_Sub1_2.method9607(-2123649700) != Class340.aClass340_5) {
			throw new RuntimeException();
		}
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = Class160.aClass121_Sub1_2.method9628(517433720);
	}

	@OriginalMember(owner = "client!dr", name = "ati", descriptor = "(Lclient!yp;I)V")
	static void method26035(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub13_1.method16080(-664035279) == 2 ? 1 : 0;
	}

	@OriginalMember(owner = "client!dr", name = "t", descriptor = "(Lclient!yy;Lclient!zw;IB)I")
	public static int method26036(@OriginalArg(0) Class697 arg0, @OriginalArg(1) Class720 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		return Class697.aClass697_4 == arg0 ? 43594 : arg2 + 40000;
	}

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "()V")
	Class231() {
	}

	@OriginalMember(owner = "client!dr", name = "w", descriptor = "(I)F")
	float method26007(@OriginalArg(0) int arg0) {
		if (arg0 < this.method26031((byte) 1)) {
			return this.aFloat278;
		} else if (arg0 > this.method26011(-2095860160)) {
			return this.aFloat279;
		} else {
			return this.aFloatArray99[arg0 - this.method26031((byte) 1)];
		}
	}

	@OriginalMember(owner = "client!dr", name = "x", descriptor = "(Lclient!ald;I)I")
	int method26008(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.g2();
		Class666.method33458(arg0.g1(), -255202897);
		this.aClass225_6 = Class616.method32287(arg0.g1(), 107209021);
		this.aClass225_7 = Class616.method32287(arg0.g1(), -1256740765);
		this.aBoolean762 = arg0.g1() != 0;
		this.aClass253Array1 = new Class253[local3];
		@Pc(38) Class253 local38 = null;
		@Pc(40) int local40;
		for (local40 = 0; local40 < local3; local40++) {
			@Pc(47) Class253 local47 = new Class253();
			local47.method26378(arg0, arg1, 2130804991);
			this.aClass253Array1[local40] = local47;
			if (local38 != null) {
				local38.aClass253_1 = local47;
			}
			local38 = local47;
		}
		this.aFloatArray99 = new float[this.method26012(-1648615768) + 1];
		for (local40 = this.method26031((byte) 1); local40 <= this.method26011(-2095860160); local40++) {
			this.aFloatArray99[local40 - this.method26031((byte) 1)] = Class323.method27610(this, (float) local40, (byte) -35);
		}
		this.aFloat278 = Class323.method27610(this, (float) (this.method26031((byte) 1) - 1), (byte) 87);
		this.aFloat279 = Class323.method27610(this, (float) (this.method26011(-2095860160) + 1), (byte) -16);
		return local3;
	}

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "(II)F")
	float method26009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < this.method26031((byte) 1)) {
			return this.aFloat278;
		} else if (arg0 > this.method26011(-2095860160)) {
			return this.aFloat279;
		} else {
			return this.aFloatArray99[arg0 - this.method26031((byte) 1)];
		}
	}

	@OriginalMember(owner = "client!dr", name = "t", descriptor = "(Lclient!ald;II)I")
	int method26010(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0.g2();
		Class666.method33458(arg0.g1(), -255202897);
		this.aClass225_6 = Class616.method32287(arg0.g1(), 1862898202);
		this.aClass225_7 = Class616.method32287(arg0.g1(), -38087050);
		this.aBoolean762 = arg0.g1() != 0;
		this.aClass253Array1 = new Class253[local3];
		@Pc(38) Class253 local38 = null;
		@Pc(40) int local40;
		for (local40 = 0; local40 < local3; local40++) {
			@Pc(47) Class253 local47 = new Class253();
			local47.method26378(arg0, arg1, 510657892);
			this.aClass253Array1[local40] = local47;
			if (local38 != null) {
				local38.aClass253_1 = local47;
			}
			local38 = local47;
		}
		this.aFloatArray99 = new float[this.method26012(-1636350441) + 1];
		for (local40 = this.method26031((byte) 1); local40 <= this.method26011(-2095860160); local40++) {
			this.aFloatArray99[local40 - this.method26031((byte) 1)] = Class323.method27610(this, (float) local40, (byte) 32);
		}
		this.aFloat278 = Class323.method27610(this, (float) (this.method26031((byte) 1) - 1), (byte) -92);
		this.aFloat279 = Class323.method27610(this, (float) (this.method26011(-2095860160) + 1), (byte) 104);
		return local3;
	}

	@OriginalMember(owner = "client!dr", name = "u", descriptor = "(I)I")
	int method26011(@OriginalArg(0) int arg0) {
		return this.aClass253Array1 == null ? 0 : this.aClass253Array1[this.method26015(-2030978563) - 1].anInt3881 * -1813617981;
	}

	@OriginalMember(owner = "client!dr", name = "l", descriptor = "(I)I")
	int method26012(@OriginalArg(0) int arg0) {
		return this.method26011(-2095860160) - this.method26031((byte) 1);
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "()I")
	int method26013() {
		return this.aClass253Array1 == null ? 0 : this.aClass253Array1.length;
	}

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "(FI)Lclient!ev;")
	Class253 method26014(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.method26020(arg0, -1655304780);
		return local4 >= 0 && local4 < this.aClass253Array1.length ? this.aClass253Array1[local4] : null;
	}

	@OriginalMember(owner = "client!dr", name = "m", descriptor = "(I)I")
	int method26015(@OriginalArg(0) int arg0) {
		return this.aClass253Array1 == null ? 0 : this.aClass253Array1.length;
	}

	@OriginalMember(owner = "client!dr", name = "o", descriptor = "(Lclient!ald;I)I")
	int method26016(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.g2();
		Class666.method33458(arg0.g1(), -255202897);
		this.aClass225_6 = Class616.method32287(arg0.g1(), -1072402704);
		this.aClass225_7 = Class616.method32287(arg0.g1(), 873407146);
		this.aBoolean762 = arg0.g1() != 0;
		this.aClass253Array1 = new Class253[local3];
		@Pc(38) Class253 local38 = null;
		@Pc(40) int local40;
		for (local40 = 0; local40 < local3; local40++) {
			@Pc(47) Class253 local47 = new Class253();
			local47.method26378(arg0, arg1, 1634639352);
			this.aClass253Array1[local40] = local47;
			if (local38 != null) {
				local38.aClass253_1 = local47;
			}
			local38 = local47;
		}
		this.aFloatArray99 = new float[this.method26012(-1690160205) + 1];
		for (local40 = this.method26031((byte) 1); local40 <= this.method26011(-2095860160); local40++) {
			this.aFloatArray99[local40 - this.method26031((byte) 1)] = Class323.method27610(this, (float) local40, (byte) 60);
		}
		this.aFloat278 = Class323.method27610(this, (float) (this.method26031((byte) 1) - 1), (byte) 0);
		this.aFloat279 = Class323.method27610(this, (float) (this.method26011(-2095860160) + 1), (byte) -5);
		return local3;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!ald;I)I")
	int method26017(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.g2();
		Class666.method33458(arg0.g1(), -255202897);
		this.aClass225_6 = Class616.method32287(arg0.g1(), 1345677533);
		this.aClass225_7 = Class616.method32287(arg0.g1(), 2098861330);
		this.aBoolean762 = arg0.g1() != 0;
		this.aClass253Array1 = new Class253[local3];
		@Pc(38) Class253 local38 = null;
		@Pc(40) int local40;
		for (local40 = 0; local40 < local3; local40++) {
			@Pc(47) Class253 local47 = new Class253();
			local47.method26378(arg0, arg1, 1133361146);
			this.aClass253Array1[local40] = local47;
			if (local38 != null) {
				local38.aClass253_1 = local47;
			}
			local38 = local47;
		}
		this.aFloatArray99 = new float[this.method26012(-2144997308) + 1];
		for (local40 = this.method26031((byte) 1); local40 <= this.method26011(-2095860160); local40++) {
			this.aFloatArray99[local40 - this.method26031((byte) 1)] = Class323.method27610(this, (float) local40, (byte) -1);
		}
		this.aFloat278 = Class323.method27610(this, (float) (this.method26031((byte) 1) - 1), (byte) 87);
		this.aFloat279 = Class323.method27610(this, (float) (this.method26011(-2095860160) + 1), (byte) -59);
		return local3;
	}

	@OriginalMember(owner = "client!dr", name = "h", descriptor = "()I")
	int method26018() {
		return this.aClass253Array1 == null ? 0 : this.aClass253Array1[0].anInt3881 * -1813617981;
	}

	@OriginalMember(owner = "client!dr", name = "s", descriptor = "(Lclient!ald;I)I")
	int method26019(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.g2();
		Class666.method33458(arg0.g1(), -255202897);
		this.aClass225_6 = Class616.method32287(arg0.g1(), -1707881505);
		this.aClass225_7 = Class616.method32287(arg0.g1(), 499956838);
		this.aBoolean762 = arg0.g1() != 0;
		this.aClass253Array1 = new Class253[local3];
		@Pc(38) Class253 local38 = null;
		@Pc(40) int local40;
		for (local40 = 0; local40 < local3; local40++) {
			@Pc(47) Class253 local47 = new Class253();
			local47.method26378(arg0, arg1, 718016059);
			this.aClass253Array1[local40] = local47;
			if (local38 != null) {
				local38.aClass253_1 = local47;
			}
			local38 = local47;
		}
		this.aFloatArray99 = new float[this.method26012(-1499888288) + 1];
		for (local40 = this.method26031((byte) 1); local40 <= this.method26011(-2095860160); local40++) {
			this.aFloatArray99[local40 - this.method26031((byte) 1)] = Class323.method27610(this, (float) local40, (byte) 8);
		}
		this.aFloat278 = Class323.method27610(this, (float) (this.method26031((byte) 1) - 1), (byte) -3);
		this.aFloat279 = Class323.method27610(this, (float) (this.method26011(-2095860160) + 1), (byte) -7);
		return local3;
	}

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "(FI)I")
	int method26020(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3774 * -572450039 >= 0 && (float) (this.aClass253Array1[-572450039 * this.anInt3774].anInt3881 * -1813617981) <= arg0 && (this.aClass253Array1[this.anInt3774 * -572450039].aClass253_1 == null || (float) (this.aClass253Array1[this.anInt3774 * -572450039].aClass253_1.anInt3881 * -1813617981) > arg0)) {
			return this.anInt3774 * -572450039;
		} else if (arg0 < (float) this.method26031((byte) 1) || arg0 > (float) this.method26011(-2095860160)) {
			return -1;
		} else {
			@Pc(67) int local67 = this.method26015(-2030978563);
			@Pc(72) int local72 = this.anInt3774 * -572450039;
			if (local67 > 0) {
				@Pc(76) int local76 = 0;
				@Pc(80) int local80 = local67 - 1;
				do {
					@Pc(86) int local86 = local76 + local80 >> 1;
					if (arg0 < (float) (this.aClass253Array1[local86].anInt3881 * -1813617981)) {
						if (arg0 > (float) (this.aClass253Array1[local86 - 1].anInt3881 * -1813617981)) {
							local72 = local86 - 1;
							break;
						}
						local80 = local86 - 1;
					} else {
						if (!(arg0 > (float) (this.aClass253Array1[local86].anInt3881 * -1813617981))) {
							local72 = local86;
							break;
						}
						if (arg0 < (float) (this.aClass253Array1[local86 + 1].anInt3881 * -1813617981)) {
							local72 = local86;
							break;
						}
						local76 = local86 + 1;
					}
				} while (local76 <= local80);
			}
			if (local72 != this.anInt3774 * -572450039) {
				this.anInt3774 = local72 * 1084810041;
				this.aBoolean759 = true;
			}
			return this.anInt3774 * -572450039;
		}
	}

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "()I")
	int method26021() {
		return this.aClass253Array1 == null ? 0 : this.aClass253Array1[this.method26015(-2030978563) - 1].anInt3881 * -1813617981;
	}

	@OriginalMember(owner = "client!dr", name = "r", descriptor = "()I")
	int method26022() {
		return this.aClass253Array1 == null ? 0 : this.aClass253Array1[0].anInt3881 * -1813617981;
	}

	@OriginalMember(owner = "client!dr", name = "q", descriptor = "()I")
	int method26023() {
		return this.aClass253Array1 == null ? 0 : this.aClass253Array1[0].anInt3881 * -1813617981;
	}

	@OriginalMember(owner = "client!dr", name = "k", descriptor = "(Lclient!ald;I)I")
	int method26024(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.g2();
		Class666.method33458(arg0.g1(), -255202897);
		this.aClass225_6 = Class616.method32287(arg0.g1(), -1946791019);
		this.aClass225_7 = Class616.method32287(arg0.g1(), 1385319698);
		this.aBoolean762 = arg0.g1() != 0;
		this.aClass253Array1 = new Class253[local3];
		@Pc(38) Class253 local38 = null;
		@Pc(40) int local40;
		for (local40 = 0; local40 < local3; local40++) {
			@Pc(47) Class253 local47 = new Class253();
			local47.method26378(arg0, arg1, 1006660569);
			this.aClass253Array1[local40] = local47;
			if (local38 != null) {
				local38.aClass253_1 = local47;
			}
			local38 = local47;
		}
		this.aFloatArray99 = new float[this.method26012(-1479703721) + 1];
		for (local40 = this.method26031((byte) 1); local40 <= this.method26011(-2095860160); local40++) {
			this.aFloatArray99[local40 - this.method26031((byte) 1)] = Class323.method27610(this, (float) local40, (byte) 2);
		}
		this.aFloat278 = Class323.method27610(this, (float) (this.method26031((byte) 1) - 1), (byte) -82);
		this.aFloat279 = Class323.method27610(this, (float) (this.method26011(-2095860160) + 1), (byte) -64);
		return local3;
	}

	@OriginalMember(owner = "client!dr", name = "j", descriptor = "(Lclient!ald;I)I")
	int method26025(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.g2();
		Class666.method33458(arg0.g1(), -255202897);
		this.aClass225_6 = Class616.method32287(arg0.g1(), -1834700119);
		this.aClass225_7 = Class616.method32287(arg0.g1(), 1778798319);
		this.aBoolean762 = arg0.g1() != 0;
		this.aClass253Array1 = new Class253[local3];
		@Pc(38) Class253 local38 = null;
		@Pc(40) int local40;
		for (local40 = 0; local40 < local3; local40++) {
			@Pc(47) Class253 local47 = new Class253();
			local47.method26378(arg0, arg1, 2127177983);
			this.aClass253Array1[local40] = local47;
			if (local38 != null) {
				local38.aClass253_1 = local47;
			}
			local38 = local47;
		}
		this.aFloatArray99 = new float[this.method26012(-1435988082) + 1];
		for (local40 = this.method26031((byte) 1); local40 <= this.method26011(-2095860160); local40++) {
			this.aFloatArray99[local40 - this.method26031((byte) 1)] = Class323.method27610(this, (float) local40, (byte) 44);
		}
		this.aFloat278 = Class323.method27610(this, (float) (this.method26031((byte) 1) - 1), (byte) -42);
		this.aFloat279 = Class323.method27610(this, (float) (this.method26011(-2095860160) + 1), (byte) 6);
		return local3;
	}

	@OriginalMember(owner = "client!dr", name = "z", descriptor = "()I")
	int method26026() {
		return this.aClass253Array1 == null ? 0 : this.aClass253Array1[this.method26015(-2030978563) - 1].anInt3881 * -1813617981;
	}

	@OriginalMember(owner = "client!dr", name = "p", descriptor = "()I")
	int method26027() {
		return this.method26011(-2095860160) - this.method26031((byte) 1);
	}

	@OriginalMember(owner = "client!dr", name = "v", descriptor = "(F)I")
	int method26028(@OriginalArg(0) float arg0) {
		if (this.anInt3774 * -572450039 >= 0 && (float) (this.aClass253Array1[-572450039 * this.anInt3774].anInt3881 * -1813617981) <= arg0 && (this.aClass253Array1[this.anInt3774 * -572450039].aClass253_1 == null || (float) (this.aClass253Array1[this.anInt3774 * -572450039].aClass253_1.anInt3881 * -1813617981) > arg0)) {
			return this.anInt3774 * -572450039;
		} else if (arg0 < (float) this.method26031((byte) 1) || arg0 > (float) this.method26011(-2095860160)) {
			return -1;
		} else {
			@Pc(67) int local67 = this.method26015(-2030978563);
			@Pc(72) int local72 = this.anInt3774 * -572450039;
			if (local67 > 0) {
				@Pc(76) int local76 = 0;
				@Pc(80) int local80 = local67 - 1;
				do {
					@Pc(86) int local86 = local76 + local80 >> 1;
					if (arg0 < (float) (this.aClass253Array1[local86].anInt3881 * -1813617981)) {
						if (arg0 > (float) (this.aClass253Array1[local86 - 1].anInt3881 * -1813617981)) {
							local72 = local86 - 1;
							break;
						}
						local80 = local86 - 1;
					} else {
						if (!(arg0 > (float) (this.aClass253Array1[local86].anInt3881 * -1813617981))) {
							local72 = local86;
							break;
						}
						if (arg0 < (float) (this.aClass253Array1[local86 + 1].anInt3881 * -1813617981)) {
							local72 = local86;
							break;
						}
						local76 = local86 + 1;
					}
				} while (local76 <= local80);
			}
			if (local72 != this.anInt3774 * -572450039) {
				this.anInt3774 = local72 * 1084810041;
				this.aBoolean759 = true;
			}
			return this.anInt3774 * -572450039;
		}
	}

	@OriginalMember(owner = "client!dr", name = "y", descriptor = "(F)I")
	int method26029(@OriginalArg(0) float arg0) {
		if (this.anInt3774 * -572450039 >= 0 && (float) (this.aClass253Array1[-572450039 * this.anInt3774].anInt3881 * -1813617981) <= arg0 && (this.aClass253Array1[this.anInt3774 * -572450039].aClass253_1 == null || (float) (this.aClass253Array1[this.anInt3774 * -572450039].aClass253_1.anInt3881 * -1813617981) > arg0)) {
			return this.anInt3774 * -572450039;
		} else if (arg0 < (float) this.method26031((byte) 1) || arg0 > (float) this.method26011(-2095860160)) {
			return -1;
		} else {
			@Pc(67) int local67 = this.method26015(-2030978563);
			@Pc(72) int local72 = this.anInt3774 * -572450039;
			if (local67 > 0) {
				@Pc(76) int local76 = 0;
				@Pc(80) int local80 = local67 - 1;
				do {
					@Pc(86) int local86 = local76 + local80 >> 1;
					if (arg0 < (float) (this.aClass253Array1[local86].anInt3881 * -1813617981)) {
						if (arg0 > (float) (this.aClass253Array1[local86 - 1].anInt3881 * -1813617981)) {
							local72 = local86 - 1;
							break;
						}
						local80 = local86 - 1;
					} else {
						if (!(arg0 > (float) (this.aClass253Array1[local86].anInt3881 * -1813617981))) {
							local72 = local86;
							break;
						}
						if (arg0 < (float) (this.aClass253Array1[local86 + 1].anInt3881 * -1813617981)) {
							local72 = local86;
							break;
						}
						local76 = local86 + 1;
					}
				} while (local76 <= local80);
			}
			if (local72 != this.anInt3774 * -572450039) {
				this.anInt3774 = local72 * 1084810041;
				this.aBoolean759 = true;
			}
			return this.anInt3774 * -572450039;
		}
	}

	@OriginalMember(owner = "client!dr", name = "n", descriptor = "(F)Lclient!ev;")
	Class253 method26030(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = this.method26020(arg0, 1078695534);
		return local4 >= 0 && local4 < this.aClass253Array1.length ? this.aClass253Array1[local4] : null;
	}

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "(B)I")
	int method26031(@OriginalArg(0) byte arg0) {
		return this.aClass253Array1 == null ? 0 : this.aClass253Array1[0].anInt3881 * -1813617981;
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "()I")
	int method26032() {
		return this.aClass253Array1 == null ? 0 : this.aClass253Array1.length;
	}
}
