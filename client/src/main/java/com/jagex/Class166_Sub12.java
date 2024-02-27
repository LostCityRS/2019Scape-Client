package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aml")
public final class Class166_Sub12 extends Class166 {

	@OriginalMember(owner = "client!aml", name = "r", descriptor = "I")
	public static int anInt2143;

	@OriginalMember(owner = "client!aml", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aml", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub12(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aml", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!aml", name = "o", descriptor = "(B)V")
	public void method15621(@OriginalArg(0) byte arg0) {
		if (this.aClass93_Sub36_49.method14365(-879763557).method146(1935768023)) {
			this.anInt2379 = Class332.aClass332_1.anInt4188 * 1605425435;
			return;
		}
		@Pc(20) int local20 = this.aClass93_Sub36_49.method14365(-1502273040).method138((byte) -119);
		if (local20 < 245) {
			this.anInt2379 = Class332.aClass332_6.anInt4188 * 1605425435;
		}
		if (this.anInt2379 * 960141055 == Class332.aClass332_5.anInt4188 * 595334117 && local20 < 500) {
			this.anInt2379 = Class332.aClass332_3.anInt4188 * 1605425435;
		}
		if (this.anInt2379 * 960141055 < Class332.aClass332_6.anInt4188 * 595334117 || this.anInt2379 * 960141055 > Class332.aClass332_4.anInt4188 * 595334117) {
			this.anInt2379 = this.method16554((byte) 38) * -88839937;
		}
	}

	@OriginalMember(owner = "client!aml", name = "n", descriptor = "(II)I")
	@Override
	public int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass93_Sub36_49.method14365(1992741128).method146(-1550506619)) {
			return 3;
		}
		@Pc(15) int local15 = this.aClass93_Sub36_49.method14365(-1948683721).method138((byte) -55);
		if (local15 < 245) {
			return 3;
		} else if (arg0 == Class332.aClass332_5.anInt4188 * 595334117 && local15 < 500) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!aml", name = "s", descriptor = "(I)Z")
	public boolean method15622(@OriginalArg(0) int arg0) {
		if (this.aClass93_Sub36_49.method14365(-9844680).method146(766109348)) {
			return false;
		} else {
			@Pc(15) int local15 = this.aClass93_Sub36_49.method14365(-475520841).method138((byte) -70);
			return local15 >= 245;
		}
	}

	@OriginalMember(owner = "client!aml", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return this.aClass93_Sub36_49.method14365(2018536402).method146(1125858158) ? Class332.aClass332_1.anInt4188 * 595334117 : Class332.aClass332_6.anInt4188 * 595334117;
	}

	@OriginalMember(owner = "client!aml", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!aml", name = "y", descriptor = "(B)I")
	public int method15623(@OriginalArg(0) byte arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!aml", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return this.aClass93_Sub36_49.method14365(1585042200).method146(-657378030) ? Class332.aClass332_1.anInt4188 * 595334117 : Class332.aClass332_6.anInt4188 * 595334117;
	}

	@OriginalMember(owner = "client!aml", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return this.aClass93_Sub36_49.method14365(-37889168).method146(759162841) ? Class332.aClass332_1.anInt4188 * 595334117 : Class332.aClass332_6.anInt4188 * 595334117;
	}

	@OriginalMember(owner = "client!aml", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!aml", name = "z", descriptor = "(I)I")
	@Override
	public int method16561(@OriginalArg(0) int arg0) {
		if (this.aClass93_Sub36_49.method14365(72769861).method146(428347079)) {
			return 3;
		}
		@Pc(15) int local15 = this.aClass93_Sub36_49.method14365(-1604584445).method138((byte) -3);
		if (local15 < 245) {
			return 3;
		} else if (arg0 == Class332.aClass332_5.anInt4188 * 595334117 && local15 < 500) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!aml", name = "p", descriptor = "(I)I")
	@Override
	public int method16552(@OriginalArg(0) int arg0) {
		if (this.aClass93_Sub36_49.method14365(-1649861903).method146(1950871529)) {
			return 3;
		}
		@Pc(15) int local15 = this.aClass93_Sub36_49.method14365(1418522602).method138((byte) -55);
		if (local15 < 245) {
			return 3;
		} else if (arg0 == Class332.aClass332_5.anInt4188 * 595334117 && local15 < 500) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!aml", name = "g", descriptor = "()I")
	public int method15624() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!aml", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return this.aClass93_Sub36_49.method14365(-664936552).method146(1957533433) ? Class332.aClass332_1.anInt4188 * 595334117 : Class332.aClass332_6.anInt4188 * 595334117;
	}

	@OriginalMember(owner = "client!aml", name = "q", descriptor = "()V")
	public void method15625() {
		if (this.aClass93_Sub36_49.method14365(1257976089).method146(-1179165317)) {
			this.anInt2379 = Class332.aClass332_1.anInt4188 * 1605425435;
			return;
		}
		@Pc(20) int local20 = this.aClass93_Sub36_49.method14365(610470334).method138((byte) -65);
		if (local20 < 245) {
			this.anInt2379 = Class332.aClass332_6.anInt4188 * 1605425435;
		}
		if (this.anInt2379 * 960141055 == Class332.aClass332_5.anInt4188 * 595334117 && local20 < 500) {
			this.anInt2379 = Class332.aClass332_3.anInt4188 * 1605425435;
		}
		if (this.anInt2379 * 960141055 < Class332.aClass332_6.anInt4188 * 595334117 || this.anInt2379 * 960141055 > Class332.aClass332_4.anInt4188 * 595334117) {
			this.anInt2379 = this.method16554((byte) -101) * -88839937;
		}
	}

	@OriginalMember(owner = "client!aml", name = "x", descriptor = "()Z")
	public boolean method15626() {
		if (this.aClass93_Sub36_49.method14365(1898935026).method146(-835018584)) {
			return false;
		} else {
			@Pc(15) int local15 = this.aClass93_Sub36_49.method14365(-1437377002).method138((byte) -35);
			return local15 >= 245;
		}
	}

	@OriginalMember(owner = "client!aml", name = "b", descriptor = "()Z")
	public boolean method15627() {
		if (this.aClass93_Sub36_49.method14365(-1587592325).method146(1401367497)) {
			return false;
		} else {
			@Pc(15) int local15 = this.aClass93_Sub36_49.method14365(-2074380036).method138((byte) -127);
			return local15 >= 245;
		}
	}

	@OriginalMember(owner = "client!aml", name = "h", descriptor = "()Z")
	public boolean method15628() {
		if (this.aClass93_Sub36_49.method14365(1923575052).method146(-581036206)) {
			return false;
		} else {
			@Pc(15) int local15 = this.aClass93_Sub36_49.method14365(1061667833).method138((byte) -75);
			return local15 >= 245;
		}
	}

	@OriginalMember(owner = "client!aml", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return this.aClass93_Sub36_49.method14365(887164441).method146(1404952239) ? Class332.aClass332_1.anInt4188 * 595334117 : Class332.aClass332_6.anInt4188 * 595334117;
	}

	@OriginalMember(owner = "client!aml", name = "a", descriptor = "()I")
	public int method15629() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!aml", name = "i", descriptor = "()I")
	public int method15630() {
		return this.anInt2379 * 960141055;
	}
}
