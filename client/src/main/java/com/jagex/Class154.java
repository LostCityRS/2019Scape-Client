package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public abstract class Class154 {

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
	static final int anInt1646 = 4;

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
	static final int anInt1647 = 2;

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
	static final int anInt1648 = 1;

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
	static final int anInt1649 = 8;

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
	public int anInt1650;

	@OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
	int anInt1651;

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
	public int anInt1652;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V", line = 12)
	Class154() {
	}

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)Z", line = 15)
	public boolean method14132(@OriginalArg(0) int arg0) {
		return (this.anInt1650 * 803722663 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "()Z", line = 15)
	public boolean method14133() {
		return (this.anInt1650 * 803722663 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wg", name = "w", descriptor = "()Z", line = 15)
	public boolean method14134() {
		return (this.anInt1650 * 803722663 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "()Z", line = 19)
	public boolean method14135() {
		return (this.anInt1650 * 803722663 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "(S)Z", line = 19)
	public boolean method14136(@OriginalArg(0) short arg0) {
		return (this.anInt1650 * 803722663 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!wg", name = "p", descriptor = "()Z", line = 23)
	public boolean method14137() {
		return (this.anInt1650 * 803722663 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!wg", name = "u", descriptor = "()Z", line = 23)
	public boolean method14138() {
		return (this.anInt1650 * 803722663 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "(I)Z", line = 23)
	public boolean method14139(@OriginalArg(0) int arg0) {
		return (this.anInt1650 * 803722663 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!wg", name = "z", descriptor = "()Z", line = 23)
	public boolean method14140() {
		return (this.anInt1650 * 803722663 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "(B)Z", line = 27)
	public boolean method14141(@OriginalArg(0) byte arg0) {
		return (this.anInt1650 * 803722663 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "()Z", line = 27)
	public boolean method14142() {
		return (this.anInt1650 * 803722663 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!wg", name = "fx", descriptor = "(ZI)Z", line = 2462)
	public static boolean method14144(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(2) boolean local2 = Class694.aClass104_14.method20622();
		if (arg0 == local2) {
			return true;
		}
		if (!arg0) {
			Class694.aClass104_14.method20645();
		} else if (!Class694.aClass104_14.method20646()) {
			arg0 = false;
		}
		if (local2 == arg0) {
			return false;
		} else {
			Class51.options.method14363(Class51.options.aClass166_Sub28_1, arg0 ? 1 : 0, (byte) 104);
			Class106_Sub1.method5135(1212135578);
			return true;
		}
	}

	@OriginalMember(owner = "client!wg", name = "aij", descriptor = "(Lclient!yf;I)V", line = 11337)
	static final void method14145(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		if (local23 == -1) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class687.aClass514_1.method30267(local13, (byte) -12).method22369((char) local23, -642307170);
		}
	}

	@OriginalMember(owner = "client!wg", name = "aox", descriptor = "(Lclient!yf;S)V", line = 12624)
	static final void method14146(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) throws Exception_Sub3 {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class333 local16 = Class93_Sub20.method13658(local12, (byte) 1);
		if (local16 == null) {
			throw new RuntimeException();
		}
		Class65.aClass123_Sub1_2.method8952(local16, -1823239522);
	}

	@OriginalMember(owner = "client!wg", name = "apu", descriptor = "(Lclient!yf;I)V", line = 12685)
	static final void method14147(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -725861497;
		if (Class65.aClass123_Sub1_2.method9020((byte) -67) != Class338.aClass338_7) {
			throw new RuntimeException();
		}
		((Class25_Sub1) Class65.aClass123_Sub1_2.method9017(2039716393)).method15979(arg0.anIntArray519[arg0.anInt5891 * -1497248091], arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1], arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2], 1854058851);
	}
}
