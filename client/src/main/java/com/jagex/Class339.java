package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class339 implements Interface11, Interface5 {

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "Z")
	public boolean aBoolean830;

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
	public int anInt4233;

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
	public int anInt4234;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
	public int anInt4235;

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
	public int anInt4237;

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
	public int anInt4238;

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
	public int anInt4239;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
	public int anInt4240;

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
	public int anInt4241;

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
	public int anInt4232 = 1888849976;

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
	public int anInt4236 = -456967281;

	@OriginalMember(owner = "client!ii", name = "q", descriptor = "(II)Ljava/lang/String;")
	static String method27899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return "<col=" + Integer.toHexString(arg0) + ">";
	}

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
	Class339() {
	}

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "(Lclient!ald;I)V")
	void method27895(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4232 = arg0.method23178((byte) -99) * 236106247;
		} else if (arg1 == 2) {
			this.aBoolean830 = true;
		} else if (arg1 == 3) {
			this.anInt4233 = arg0.method23179(352093361) * 187795767;
			this.anInt4234 = arg0.method23179(1174445619) * 1265635789;
			this.anInt4241 = arg0.method23179(486130215) * -529318841;
		} else if (arg1 == 4) {
			this.anInt4238 = arg0.method23362(-1950698615) * -22874481;
		} else if (arg1 == 5) {
			this.anInt4235 = arg0.method23210((byte) 32) * -1062054093;
		} else if (arg1 == 6) {
			this.anInt4236 = arg0.method23180(1710327153) * -1942174607;
		} else if (arg1 == 7) {
			this.anInt4239 = arg0.method23179(-759239470) * 485627631;
			this.anInt4237 = arg0.method23179(-129438440) * -982205175;
			this.anInt4240 = arg0.method23179(-134696213) * -779596223;
		}
	}

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method37006(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(268080720);
			if (local3 == 0) {
				return;
			}
			this.method27896(arg0, local3, (byte) 24);
		}
	}

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "(Lclient!ald;IB)V")
	void method27896(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (arg1 == 1) {
			this.anInt4232 = arg0.method23178((byte) -105) * 236106247;
		} else if (arg1 == 2) {
			this.aBoolean830 = true;
		} else if (arg1 == 3) {
			this.anInt4233 = arg0.method23179(47267435) * 187795767;
			this.anInt4234 = arg0.method23179(850992718) * 1265635789;
			this.anInt4241 = arg0.method23179(-220101187) * -529318841;
		} else if (arg1 == 4) {
			this.anInt4238 = arg0.method23362(254178116) * -22874481;
		} else if (arg1 == 5) {
			this.anInt4235 = arg0.method23210((byte) 80) * -1062054093;
		} else if (arg1 == 6) {
			this.anInt4236 = arg0.method23180(1710327153) * -1942174607;
		} else if (arg1 == 7) {
			this.anInt4239 = arg0.method23179(2054987999) * 485627631;
			this.anInt4237 = arg0.method23179(1769802326) * -982205175;
			this.anInt4240 = arg0.method23179(-122310322) * -779596223;
		}
	}

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "(IS)V")
	@Override
	public void method37014(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
	@Override
	public void method37013(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "()V")
	@Override
	public void method37008() {
	}

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	public void method37009(@OriginalArg(0) Class80_Sub36 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(247601384);
			if (local3 == 0) {
				return;
			}
			this.method27896(arg0, local3, (byte) 60);
		}
	}

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "(I)V")
	@Override
	public void method37010(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "(I)V")
	@Override
	public void method37012(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "(I)V")
	@Override
	public void method37011(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "(Lclient!ald;I)V")
	void method27897(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4232 = arg0.method23178((byte) -57) * 236106247;
		} else if (arg1 == 2) {
			this.aBoolean830 = true;
		} else if (arg1 == 3) {
			this.anInt4233 = arg0.method23179(1604567898) * 187795767;
			this.anInt4234 = arg0.method23179(265993978) * 1265635789;
			this.anInt4241 = arg0.method23179(1916372395) * -529318841;
		} else if (arg1 == 4) {
			this.anInt4238 = arg0.method23362(-840217583) * -22874481;
		} else if (arg1 == 5) {
			this.anInt4235 = arg0.method23210((byte) 107) * -1062054093;
		} else if (arg1 == 6) {
			this.anInt4236 = arg0.method23180(1710327153) * -1942174607;
		} else if (arg1 == 7) {
			this.anInt4239 = arg0.method23179(1870774371) * 485627631;
			this.anInt4237 = arg0.method23179(160811482) * -982205175;
			this.anInt4240 = arg0.method23179(1158130874) * -779596223;
		}
	}

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "(Lclient!ald;I)V")
	void method27898(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4232 = arg0.method23178((byte) -73) * 236106247;
		} else if (arg1 == 2) {
			this.aBoolean830 = true;
		} else if (arg1 == 3) {
			this.anInt4233 = arg0.method23179(1370227338) * 187795767;
			this.anInt4234 = arg0.method23179(1098518792) * 1265635789;
			this.anInt4241 = arg0.method23179(788944481) * -529318841;
		} else if (arg1 == 4) {
			this.anInt4238 = arg0.method23362(97738259) * -22874481;
		} else if (arg1 == 5) {
			this.anInt4235 = arg0.method23210((byte) 21) * -1062054093;
		} else if (arg1 == 6) {
			this.anInt4236 = arg0.method23180(1710327153) * -1942174607;
		} else if (arg1 == 7) {
			this.anInt4239 = arg0.method23179(1473254934) * 485627631;
			this.anInt4237 = arg0.method23179(1852327724) * -982205175;
			this.anInt4240 = arg0.method23179(1230734591) * -779596223;
		}
	}

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "(B)V")
	@Override
	public void method37007(@OriginalArg(0) byte arg0) {
	}
}
