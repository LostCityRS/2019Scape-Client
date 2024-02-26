package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!als")
public final class Class72_Sub1 extends Class72 implements Interface66 {

	@OriginalMember(owner = "client!als", name = "k", descriptor = "(I)V")
	public void method15582(@OriginalArg(0) int arg0) {
		this.anInt2048 = arg0 * 1522069283;
	}

	@OriginalMember(owner = "client!als", name = "i", descriptor = "(II)V")
	public void method15583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2049 = arg0 * 1760047141;
	}

	@OriginalMember(owner = "client!als", name = "m", descriptor = "(II)V")
	public void method15584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2043 = (this.anInt2043 * -1188803591 | arg0) * 1618118217;
	}

	@OriginalMember(owner = "client!als", name = "t", descriptor = "(I)V")
	@Override
	public void method32127(@OriginalArg(0) int arg0) {
		@Pc(5) Class80_Sub31 local5 = Class623.method32440(Class443.aClass443_113, client.aClass75_1.aClass22_1, -191270971);
		local5.aClass80_Sub36_Sub1_2.method23157(this.anInt2036 * 773015459, 1744782003);
		local5.aClass80_Sub36_Sub1_2.method23351(this.anInt2049 * -979866707, -711109028);
		local5.aClass80_Sub36_Sub1_2.method23219(this.anInt2042 * 46674085, -294234385);
		local5.aClass80_Sub36_Sub1_2.method23268(this.anInt2045 * -1879799285, 1230191789);
		local5.aClass80_Sub36_Sub1_2.method23268(this.anInt2044 * -1090666619, 1230191789);
		local5.aClass80_Sub36_Sub1_2.method23219(this.anInt2043 * -1188803591, 1084397988);
		local5.aClass80_Sub36_Sub1_2.method23226(this.anInt2047 * -2078719899, (byte) 64);
		local5.aClass80_Sub36_Sub1_2.method23154(this.anInt2048 * -179849077, 1275868335);
		client.aClass75_1.method1325(local5, (byte) -14);
	}

	@OriginalMember(owner = "client!als", name = "j", descriptor = "(III)V")
	public void method15585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0 && arg1 > 32767) {
			arg1 = 32767;
		} else if (arg1 > 8388607) {
			arg1 = 8388607;
		}
		switch(arg0) {
			case 0:
				this.anInt2042 = arg1 * 1412183853;
				break;
			case 1:
				this.anInt2044 = arg1 * -328441523;
			case 2:
			case 4:
			default:
				break;
			case 3:
				this.anInt2045 = arg1 * 111161763;
				break;
			case 5:
				this.anInt2047 = arg1 * 2077716845;
		}
	}

	@OriginalMember(owner = "client!als", name = "f", descriptor = "()V")
	@Override
	public void method32126() {
		@Pc(5) Class80_Sub31 local5 = Class623.method32440(Class443.aClass443_113, client.aClass75_1.aClass22_1, -191270971);
		local5.aClass80_Sub36_Sub1_2.method23157(this.anInt2036 * 773015459, 2097222853);
		local5.aClass80_Sub36_Sub1_2.method23351(this.anInt2049 * -979866707, -711109028);
		local5.aClass80_Sub36_Sub1_2.method23219(this.anInt2042 * 46674085, 1665000808);
		local5.aClass80_Sub36_Sub1_2.method23268(this.anInt2045 * -1879799285, 1230191789);
		local5.aClass80_Sub36_Sub1_2.method23268(this.anInt2044 * -1090666619, 1230191789);
		local5.aClass80_Sub36_Sub1_2.method23219(this.anInt2043 * -1188803591, 821306159);
		local5.aClass80_Sub36_Sub1_2.method23226(this.anInt2047 * -2078719899, (byte) 19);
		local5.aClass80_Sub36_Sub1_2.method23154(this.anInt2048 * -179849077, 1275868335);
		client.aClass75_1.method1325(local5, (byte) -71);
	}

	@OriginalMember(owner = "client!als", name = "e", descriptor = "()V")
	@Override
	public void method32128() {
		@Pc(5) Class80_Sub31 local5 = Class623.method32440(Class443.aClass443_113, client.aClass75_1.aClass22_1, -191270971);
		local5.aClass80_Sub36_Sub1_2.method23157(this.anInt2036 * 773015459, 1149177692);
		local5.aClass80_Sub36_Sub1_2.method23351(this.anInt2049 * -979866707, -711109028);
		local5.aClass80_Sub36_Sub1_2.method23219(this.anInt2042 * 46674085, 1259872864);
		local5.aClass80_Sub36_Sub1_2.method23268(this.anInt2045 * -1879799285, 1230191789);
		local5.aClass80_Sub36_Sub1_2.method23268(this.anInt2044 * -1090666619, 1230191789);
		local5.aClass80_Sub36_Sub1_2.method23219(this.anInt2043 * -1188803591, 1649123878);
		local5.aClass80_Sub36_Sub1_2.method23226(this.anInt2047 * -2078719899, (byte) 64);
		local5.aClass80_Sub36_Sub1_2.method23154(this.anInt2048 * -179849077, 1275868335);
		client.aClass75_1.method1325(local5, (byte) -122);
	}

	@OriginalMember(owner = "client!als", name = "a", descriptor = "(I)V")
	public void method15586(@OriginalArg(0) int arg0) {
		this.anInt2049 = arg0 * 1760047141;
	}

	@OriginalMember(owner = "client!als", name = "s", descriptor = "(I)V")
	public void method15587(@OriginalArg(0) int arg0) {
		this.anInt2049 = arg0 * 1760047141;
	}

	@OriginalMember(owner = "client!als", name = "x", descriptor = "(I)V")
	public void method15588(@OriginalArg(0) int arg0) {
		this.anInt2048 = arg0 * 1522069283;
	}

	@OriginalMember(owner = "client!als", name = "w", descriptor = "(I)V")
	public void method15589(@OriginalArg(0) int arg0) {
		this.anInt2048 = arg0 * 1522069283;
	}

	@OriginalMember(owner = "client!als", name = "o", descriptor = "(IB)V")
	public void method15590(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.anInt2048 = arg0 * 1522069283;
	}

	@OriginalMember(owner = "client!als", name = "r", descriptor = "(II)V")
	public void method15591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0 && arg1 > 32767) {
			arg1 = 32767;
		} else if (arg1 > 8388607) {
			arg1 = 8388607;
		}
		switch(arg0) {
			case 0:
				this.anInt2042 = arg1 * 1412183853;
				break;
			case 1:
				this.anInt2044 = arg1 * -328441523;
			case 2:
			case 4:
			default:
				break;
			case 3:
				this.anInt2045 = arg1 * 111161763;
				break;
			case 5:
				this.anInt2047 = arg1 * 2077716845;
		}
	}

	@OriginalMember(owner = "client!als", name = "q", descriptor = "(II)V")
	public void method15592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0 && arg1 > 32767) {
			arg1 = 32767;
		} else if (arg1 > 8388607) {
			arg1 = 8388607;
		}
		switch(arg0) {
			case 0:
				this.anInt2042 = arg1 * 1412183853;
				break;
			case 1:
				this.anInt2044 = arg1 * -328441523;
			case 2:
			case 4:
			default:
				break;
			case 3:
				this.anInt2045 = arg1 * 111161763;
				break;
			case 5:
				this.anInt2047 = arg1 * 2077716845;
		}
	}
}
