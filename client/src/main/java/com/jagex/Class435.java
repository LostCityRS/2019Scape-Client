package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class435 {

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
	static final int anInt4798 = 0;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
	public int anInt4797 = -1460307721;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
	public int anInt4796 = 55943488;

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
	public int anInt4799 = -1209153728;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
	public int anInt4801 = -1921163634;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
	public int anInt4800 = 617555343;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "Z")
	public boolean aBoolean863 = false;

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "Z")
	public boolean aBoolean862 = false;

	@OriginalMember(owner = "client!ne", name = "kf", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method29122(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg0.anInt4157 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] * 1523812987;
	}

	@OriginalMember(owner = "client!ne", name = "ln", descriptor = "(Lclient!yp;B)V")
	static void method29123(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class607.method32182(local11, local14, arg0, 16711680);
	}

	@OriginalMember(owner = "client!ne", name = "amg", descriptor = "(Lclient!yp;B)V")
	static void method29124(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		Class138.method11536((String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997], false, false, (byte) 51);
	}

	@OriginalMember(owner = "client!ne", name = "iy", descriptor = "(Lclient!yp;B)V")
	static void method29125(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class301.method27040(local11, local14, arg0, 1673109420);
	}

	@OriginalMember(owner = "client!ne", name = "aip", descriptor = "(Lclient!yp;S)V")
	static void method29126(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = Class610.aClass52_2.method1073(local12, 2030590259).method23071((short) 451);
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	Class435() {
	}

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "(Lclient!ald;I)V")
	void method29116(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-376358457);
			if (local3 == 0) {
				return;
			}
			this.method29118(arg0, local3, arg1, (byte) -81);
		}
	}

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "(Lclient!ald;II)V")
	void method29117(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(1005535137);
			if (local3 == 0) {
				return;
			}
			this.method29118(arg0, local3, arg1, (byte) 11);
		}
	}

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "(Lclient!ald;IIB)V")
	void method29118(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if (arg1 == 1) {
			this.anInt4797 = arg0.method23178((byte) -82) * 1460307721;
			if (this.anInt4797 * -625133767 == 65535) {
				this.anInt4797 = -1460307721;
			}
		} else if (arg1 == 2) {
			this.anInt4796 = (arg0.method23178((byte) -70) + 1) * -603105659;
			this.anInt4799 = (arg0.method23178((byte) -28) + 1) * 1994372893;
		} else if (arg1 == 3) {
			arg0.method23177((byte) -32);
		} else if (arg1 == 4) {
			this.anInt4801 = arg0.method23362(987569048) * 1186901831;
		} else if (arg1 == 5) {
			this.anInt4800 = arg0.method23362(-1132427786) * 617555343;
		} else if (arg1 == 6) {
			this.aBoolean863 = true;
		} else if (arg1 == 7) {
			this.aBoolean862 = true;
		}
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "(Lclient!ald;I)V")
	void method29119(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-488486621);
			if (local3 == 0) {
				return;
			}
			this.method29118(arg0, local3, arg1, (byte) 18);
		}
	}

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "(Lclient!ald;II)V")
	void method29120(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt4797 = arg0.method23178((byte) -58) * 1460307721;
			if (this.anInt4797 * -625133767 == 65535) {
				this.anInt4797 = -1460307721;
			}
		} else if (arg1 == 2) {
			this.anInt4796 = (arg0.method23178((byte) -43) + 1) * -603105659;
			this.anInt4799 = (arg0.method23178((byte) -60) + 1) * 1994372893;
		} else if (arg1 == 3) {
			arg0.method23177((byte) -7);
		} else if (arg1 == 4) {
			this.anInt4801 = arg0.method23362(-432289593) * 1186901831;
		} else if (arg1 == 5) {
			this.anInt4800 = arg0.method23362(828838020) * 617555343;
		} else if (arg1 == 6) {
			this.aBoolean863 = true;
		} else if (arg1 == 7) {
			this.aBoolean862 = true;
		}
	}

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "(Lclient!ald;I)V")
	void method29121(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-1799829558);
			if (local3 == 0) {
				return;
			}
			this.method29118(arg0, local3, arg1, (byte) 53);
		}
	}
}
