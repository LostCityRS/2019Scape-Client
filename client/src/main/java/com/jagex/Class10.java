package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aai")
public final class Class10 {

	@OriginalMember(owner = "client!aai", name = "x", descriptor = "Lclient!aan;")
	static Class15 aClass15_1;

	@OriginalMember(owner = "client!aai", name = "t", descriptor = "I")
	int anInt39;

	@OriginalMember(owner = "client!aai", name = "f", descriptor = "I")
	int anInt40;

	@OriginalMember(owner = "client!aai", name = "e", descriptor = "I")
	int anInt41;

	@OriginalMember(owner = "client!aai", name = "u", descriptor = "Lclient!arn;")
	Class80_Sub1_Sub7 aClass80_Sub1_Sub7_1;

	@OriginalMember(owner = "client!aai", name = "l", descriptor = "Lclient!arn;")
	Class80_Sub1_Sub7 aClass80_Sub1_Sub7_2;

	@OriginalMember(owner = "client!aai", name = "g", descriptor = "Z")
	boolean aBoolean4 = false;

	@OriginalMember(owner = "client!aai", name = "di", descriptor = "(I)V")
	public static void method327(@OriginalArg(0) int arg0) {
		Class163.method15763(true, (byte) 79);
	}

	@OriginalMember(owner = "client!aai", name = "<init>", descriptor = "()V")
	Class10() {
	}

	@OriginalMember(owner = "client!aai", name = "o", descriptor = "()V")
	void method318() {
		this.aBoolean4 = false;
		this.anInt39 = 0;
		this.aClass80_Sub1_Sub7_2 = null;
		this.aClass80_Sub1_Sub7_1 = null;
	}

	@OriginalMember(owner = "client!aai", name = "t", descriptor = "(Lclient!aoa;Lclient!fe;II[II)Z")
	boolean method319(@OriginalArg(0) Class41_Sub1 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		if (this.aBoolean4) {
			return true;
		} else if (arg2 >= arg4.length) {
			return false;
		} else {
			this.anInt40 = arg4[arg2] * -1968669081;
			this.aClass80_Sub1_Sub7_1 = arg0.method17000(this.anInt40 * -262292137 >> 16, -2107341196);
			this.anInt40 = (this.anInt40 * -262292137 & 0xFFFF) * -1968669081;
			if (this.aClass80_Sub1_Sub7_1 == null) {
				return false;
			}
			if (arg1.aBoolean778 && arg3 != -1 && arg3 < arg4.length) {
				this.anInt41 = arg4[arg3] * -383993161;
				this.aClass80_Sub1_Sub7_2 = arg0.method17000(this.anInt41 * 175063815 >> 16, 1722589656);
				this.anInt41 = (this.anInt41 * 175063815 & 0xFFFF) * -383993161;
			}
			if (arg1.aBoolean776) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x200) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_1.method21967(this.anInt40 * -262292137, 229145989)) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x80) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_1.method21966(this.anInt40 * -262292137, -1825062354)) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x100) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_1.method21964(this.anInt40 * -262292137, -99052148)) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x400) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_2 != null) {
				if (this.aClass80_Sub1_Sub7_2.method21967(this.anInt41 * 175063815, -1491002953)) {
					this.anInt39 = (this.anInt39 * -357325453 | 0x80) * 1975519163;
				}
				if (this.aClass80_Sub1_Sub7_2.method21966(this.anInt41 * 175063815, -1309297072)) {
					this.anInt39 = (this.anInt39 * -357325453 | 0x100) * 1975519163;
				}
				if (this.aClass80_Sub1_Sub7_2.method21964(this.anInt41 * 175063815, 1370629166)) {
					this.anInt39 = (this.anInt39 * -357325453 | 0x400) * 1975519163;
				}
			}
			this.anInt39 = (this.anInt39 * -357325453 | 0x20) * 1975519163;
			this.aBoolean4 = true;
			return true;
		}
	}

	@OriginalMember(owner = "client!aai", name = "f", descriptor = "(I)V")
	void method320(@OriginalArg(0) int arg0) {
		this.aBoolean4 = false;
		this.anInt39 = 0;
		this.aClass80_Sub1_Sub7_2 = null;
		this.aClass80_Sub1_Sub7_1 = null;
	}

	@OriginalMember(owner = "client!aai", name = "m", descriptor = "(Lclient!aoa;Lclient!fe;II[I)Z")
	boolean method321(@OriginalArg(0) Class41_Sub1 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (this.aBoolean4) {
			return true;
		} else if (arg2 >= arg4.length) {
			return false;
		} else {
			this.anInt40 = arg4[arg2] * -1968669081;
			this.aClass80_Sub1_Sub7_1 = arg0.method17000(this.anInt40 * -262292137 >> 16, -2119183806);
			this.anInt40 = (this.anInt40 * -262292137 & 0xFFFF) * -1968669081;
			if (this.aClass80_Sub1_Sub7_1 == null) {
				return false;
			}
			if (arg1.aBoolean778 && arg3 != -1 && arg3 < arg4.length) {
				this.anInt41 = arg4[arg3] * -383993161;
				this.aClass80_Sub1_Sub7_2 = arg0.method17000(this.anInt41 * 175063815 >> 16, 694496754);
				this.anInt41 = (this.anInt41 * 175063815 & 0xFFFF) * -383993161;
			}
			if (arg1.aBoolean776) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x200) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_1.method21967(this.anInt40 * -262292137, 1285271617)) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x80) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_1.method21966(this.anInt40 * -262292137, -537053514)) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x100) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_1.method21964(this.anInt40 * -262292137, -605585613)) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x400) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_2 != null) {
				if (this.aClass80_Sub1_Sub7_2.method21967(this.anInt41 * 175063815, 459026958)) {
					this.anInt39 = (this.anInt39 * -357325453 | 0x80) * 1975519163;
				}
				if (this.aClass80_Sub1_Sub7_2.method21966(this.anInt41 * 175063815, -2038180652)) {
					this.anInt39 = (this.anInt39 * -357325453 | 0x100) * 1975519163;
				}
				if (this.aClass80_Sub1_Sub7_2.method21964(this.anInt41 * 175063815, 1245345142)) {
					this.anInt39 = (this.anInt39 * -357325453 | 0x400) * 1975519163;
				}
			}
			this.anInt39 = (this.anInt39 * -357325453 | 0x20) * 1975519163;
			this.aBoolean4 = true;
			return true;
		}
	}

	@OriginalMember(owner = "client!aai", name = "u", descriptor = "(Lclient!aoa;Lclient!fe;II[I)Z")
	boolean method322(@OriginalArg(0) Class41_Sub1 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (this.aBoolean4) {
			return true;
		} else if (arg2 >= arg4.length) {
			return false;
		} else {
			this.anInt40 = arg4[arg2] * -1968669081;
			this.aClass80_Sub1_Sub7_1 = arg0.method17000(this.anInt40 * -262292137 >> 16, -1457222881);
			this.anInt40 = (this.anInt40 * -262292137 & 0xFFFF) * -1968669081;
			if (this.aClass80_Sub1_Sub7_1 == null) {
				return false;
			}
			if (arg1.aBoolean778 && arg3 != -1 && arg3 < arg4.length) {
				this.anInt41 = arg4[arg3] * -383993161;
				this.aClass80_Sub1_Sub7_2 = arg0.method17000(this.anInt41 * 175063815 >> 16, 1870607686);
				this.anInt41 = (this.anInt41 * 175063815 & 0xFFFF) * -383993161;
			}
			if (arg1.aBoolean776) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x200) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_1.method21967(this.anInt40 * -262292137, -1435882935)) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x80) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_1.method21966(this.anInt40 * -262292137, -1719455531)) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x100) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_1.method21964(this.anInt40 * -262292137, 1742927561)) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x400) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_2 != null) {
				if (this.aClass80_Sub1_Sub7_2.method21967(this.anInt41 * 175063815, -1544744928)) {
					this.anInt39 = (this.anInt39 * -357325453 | 0x80) * 1975519163;
				}
				if (this.aClass80_Sub1_Sub7_2.method21966(this.anInt41 * 175063815, -1277001201)) {
					this.anInt39 = (this.anInt39 * -357325453 | 0x100) * 1975519163;
				}
				if (this.aClass80_Sub1_Sub7_2.method21964(this.anInt41 * 175063815, -1240800594)) {
					this.anInt39 = (this.anInt39 * -357325453 | 0x400) * 1975519163;
				}
			}
			this.anInt39 = (this.anInt39 * -357325453 | 0x20) * 1975519163;
			this.aBoolean4 = true;
			return true;
		}
	}

	@OriginalMember(owner = "client!aai", name = "l", descriptor = "(Lclient!aoa;Lclient!fe;II[I)Z")
	boolean method323(@OriginalArg(0) Class41_Sub1 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (this.aBoolean4) {
			return true;
		} else if (arg2 >= arg4.length) {
			return false;
		} else {
			this.anInt40 = arg4[arg2] * -1968669081;
			this.aClass80_Sub1_Sub7_1 = arg0.method17000(this.anInt40 * -262292137 >> 16, 2111663206);
			this.anInt40 = (this.anInt40 * -262292137 & 0xFFFF) * -1968669081;
			if (this.aClass80_Sub1_Sub7_1 == null) {
				return false;
			}
			if (arg1.aBoolean778 && arg3 != -1 && arg3 < arg4.length) {
				this.anInt41 = arg4[arg3] * -383993161;
				this.aClass80_Sub1_Sub7_2 = arg0.method17000(this.anInt41 * 175063815 >> 16, 704620800);
				this.anInt41 = (this.anInt41 * 175063815 & 0xFFFF) * -383993161;
			}
			if (arg1.aBoolean776) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x200) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_1.method21967(this.anInt40 * -262292137, -2082222689)) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x80) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_1.method21966(this.anInt40 * -262292137, -1759108925)) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x100) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_1.method21964(this.anInt40 * -262292137, 97460960)) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x400) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_2 != null) {
				if (this.aClass80_Sub1_Sub7_2.method21967(this.anInt41 * 175063815, -2028143863)) {
					this.anInt39 = (this.anInt39 * -357325453 | 0x80) * 1975519163;
				}
				if (this.aClass80_Sub1_Sub7_2.method21966(this.anInt41 * 175063815, -768873116)) {
					this.anInt39 = (this.anInt39 * -357325453 | 0x100) * 1975519163;
				}
				if (this.aClass80_Sub1_Sub7_2.method21964(this.anInt41 * 175063815, 1676372780)) {
					this.anInt39 = (this.anInt39 * -357325453 | 0x400) * 1975519163;
				}
			}
			this.anInt39 = (this.anInt39 * -357325453 | 0x20) * 1975519163;
			this.aBoolean4 = true;
			return true;
		}
	}

	@OriginalMember(owner = "client!aai", name = "g", descriptor = "(Lclient!aoa;Lclient!fe;II[I)Z")
	boolean method324(@OriginalArg(0) Class41_Sub1 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (this.aBoolean4) {
			return true;
		} else if (arg2 >= arg4.length) {
			return false;
		} else {
			this.anInt40 = arg4[arg2] * -1968669081;
			this.aClass80_Sub1_Sub7_1 = arg0.method17000(this.anInt40 * -262292137 >> 16, -21681027);
			this.anInt40 = (this.anInt40 * -262292137 & 0xFFFF) * -1968669081;
			if (this.aClass80_Sub1_Sub7_1 == null) {
				return false;
			}
			if (arg1.aBoolean778 && arg3 != -1 && arg3 < arg4.length) {
				this.anInt41 = arg4[arg3] * -383993161;
				this.aClass80_Sub1_Sub7_2 = arg0.method17000(this.anInt41 * 175063815 >> 16, 365203004);
				this.anInt41 = (this.anInt41 * 175063815 & 0xFFFF) * -383993161;
			}
			if (arg1.aBoolean776) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x200) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_1.method21967(this.anInt40 * -262292137, 1652063270)) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x80) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_1.method21966(this.anInt40 * -262292137, -1078941694)) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x100) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_1.method21964(this.anInt40 * -262292137, -1208793974)) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x400) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_2 != null) {
				if (this.aClass80_Sub1_Sub7_2.method21967(this.anInt41 * 175063815, 36653446)) {
					this.anInt39 = (this.anInt39 * -357325453 | 0x80) * 1975519163;
				}
				if (this.aClass80_Sub1_Sub7_2.method21966(this.anInt41 * 175063815, -1162121744)) {
					this.anInt39 = (this.anInt39 * -357325453 | 0x100) * 1975519163;
				}
				if (this.aClass80_Sub1_Sub7_2.method21964(this.anInt41 * 175063815, 614617764)) {
					this.anInt39 = (this.anInt39 * -357325453 | 0x400) * 1975519163;
				}
			}
			this.anInt39 = (this.anInt39 * -357325453 | 0x20) * 1975519163;
			this.aBoolean4 = true;
			return true;
		}
	}

	@OriginalMember(owner = "client!aai", name = "i", descriptor = "(Lclient!aoa;Lclient!fe;II[I)Z")
	boolean method325(@OriginalArg(0) Class41_Sub1 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (this.aBoolean4) {
			return true;
		} else if (arg2 >= arg4.length) {
			return false;
		} else {
			this.anInt40 = arg4[arg2] * -1968669081;
			this.aClass80_Sub1_Sub7_1 = arg0.method17000(this.anInt40 * -262292137 >> 16, 1602250240);
			this.anInt40 = (this.anInt40 * -262292137 & 0xFFFF) * -1968669081;
			if (this.aClass80_Sub1_Sub7_1 == null) {
				return false;
			}
			if (arg1.aBoolean778 && arg3 != -1 && arg3 < arg4.length) {
				this.anInt41 = arg4[arg3] * -383993161;
				this.aClass80_Sub1_Sub7_2 = arg0.method17000(this.anInt41 * 175063815 >> 16, 781796806);
				this.anInt41 = (this.anInt41 * 175063815 & 0xFFFF) * -383993161;
			}
			if (arg1.aBoolean776) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x200) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_1.method21967(this.anInt40 * -262292137, 1876011670)) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x80) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_1.method21966(this.anInt40 * -262292137, -1261733434)) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x100) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_1.method21964(this.anInt40 * -262292137, -416283608)) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x400) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_2 != null) {
				if (this.aClass80_Sub1_Sub7_2.method21967(this.anInt41 * 175063815, 419561138)) {
					this.anInt39 = (this.anInt39 * -357325453 | 0x80) * 1975519163;
				}
				if (this.aClass80_Sub1_Sub7_2.method21966(this.anInt41 * 175063815, -1455990818)) {
					this.anInt39 = (this.anInt39 * -357325453 | 0x100) * 1975519163;
				}
				if (this.aClass80_Sub1_Sub7_2.method21964(this.anInt41 * 175063815, -1867097062)) {
					this.anInt39 = (this.anInt39 * -357325453 | 0x400) * 1975519163;
				}
			}
			this.anInt39 = (this.anInt39 * -357325453 | 0x20) * 1975519163;
			this.aBoolean4 = true;
			return true;
		}
	}

	@OriginalMember(owner = "client!aai", name = "e", descriptor = "(Lclient!aoa;Lclient!fe;II[I)Z")
	boolean method326(@OriginalArg(0) Class41_Sub1 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (this.aBoolean4) {
			return true;
		} else if (arg2 >= arg4.length) {
			return false;
		} else {
			this.anInt40 = arg4[arg2] * -1968669081;
			this.aClass80_Sub1_Sub7_1 = arg0.method17000(this.anInt40 * -262292137 >> 16, 439634686);
			this.anInt40 = (this.anInt40 * -262292137 & 0xFFFF) * -1968669081;
			if (this.aClass80_Sub1_Sub7_1 == null) {
				return false;
			}
			if (arg1.aBoolean778 && arg3 != -1 && arg3 < arg4.length) {
				this.anInt41 = arg4[arg3] * -383993161;
				this.aClass80_Sub1_Sub7_2 = arg0.method17000(this.anInt41 * 175063815 >> 16, -1613942412);
				this.anInt41 = (this.anInt41 * 175063815 & 0xFFFF) * -383993161;
			}
			if (arg1.aBoolean776) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x200) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_1.method21967(this.anInt40 * -262292137, -543899590)) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x80) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_1.method21966(this.anInt40 * -262292137, -802798639)) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x100) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_1.method21964(this.anInt40 * -262292137, -1336728268)) {
				this.anInt39 = (this.anInt39 * -357325453 | 0x400) * 1975519163;
			}
			if (this.aClass80_Sub1_Sub7_2 != null) {
				if (this.aClass80_Sub1_Sub7_2.method21967(this.anInt41 * 175063815, 2143440326)) {
					this.anInt39 = (this.anInt39 * -357325453 | 0x80) * 1975519163;
				}
				if (this.aClass80_Sub1_Sub7_2.method21966(this.anInt41 * 175063815, -345135275)) {
					this.anInt39 = (this.anInt39 * -357325453 | 0x100) * 1975519163;
				}
				if (this.aClass80_Sub1_Sub7_2.method21964(this.anInt41 * 175063815, 183594173)) {
					this.anInt39 = (this.anInt39 * -357325453 | 0x400) * 1975519163;
				}
			}
			this.anInt39 = (this.anInt39 * -357325453 | 0x20) * 1975519163;
			this.aBoolean4 = true;
			return true;
		}
	}
}
