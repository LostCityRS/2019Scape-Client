package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!akf")
public final class Class80_Sub16 extends Class80 {

	@OriginalMember(owner = "client!akf", name = "u", descriptor = "I")
	int anInt1570;

	@OriginalMember(owner = "client!akf", name = "l", descriptor = "I")
	int anInt1566;

	@OriginalMember(owner = "client!akf", name = "g", descriptor = "I")
	int anInt1568;

	@OriginalMember(owner = "client!akf", name = "i", descriptor = "I")
	int anInt1567;

	@OriginalMember(owner = "client!akf", name = "m", descriptor = "I")
	int anInt1569;

	@OriginalMember(owner = "client!akf", name = "o", descriptor = "I")
	int anInt1565;

	@OriginalMember(owner = "client!akf", name = "j", descriptor = "I")
	int anInt1571;

	@OriginalMember(owner = "client!akf", name = "a", descriptor = "I")
	int anInt1572;

	@OriginalMember(owner = "client!akf", name = "s", descriptor = "I")
	int anInt1573;

	@OriginalMember(owner = "client!akf", name = "<init>", descriptor = "(IIIIIIIII)V")
	Class80_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt1570 = arg0 * 836076641;
		this.anInt1566 = arg1 * 1950529115;
		this.anInt1568 = arg2 * 1500295951;
		this.anInt1567 = arg3 * 552307417;
		this.anInt1569 = arg4 * 259049515;
		this.anInt1565 = arg5 * -823046357;
		this.anInt1571 = arg6 * 305821409;
		this.anInt1572 = arg7 * 631303147;
		this.anInt1573 = arg8 * 2047000577;
	}

	@OriginalMember(owner = "client!akf", name = "t", descriptor = "(III)Z")
	boolean method14091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0 >= this.anInt1566 * 1775733203 && arg0 <= this.anInt1567 * 173692265 && arg1 >= this.anInt1568 * -667296785 && arg1 <= this.anInt1569 * -1334724989;
	}

	@OriginalMember(owner = "client!akf", name = "x", descriptor = "(II)Z")
	boolean method14092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt1565 * 879163267 && arg0 <= this.anInt1572 * -1540496189 && arg1 >= this.anInt1571 * -1739240159 && arg1 <= this.anInt1573 * 368918529;
	}

	@OriginalMember(owner = "client!akf", name = "e", descriptor = "(III)Z")
	boolean method14093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0 >= this.anInt1565 * 879163267 && arg0 <= this.anInt1572 * -1540496189 && arg1 >= this.anInt1571 * -1739240159 && arg1 <= this.anInt1573 * 368918529;
	}

	@OriginalMember(owner = "client!akf", name = "u", descriptor = "(II[II)V")
	void method14094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		arg2[0] = this.anInt1570 * -1414520927;
		arg2[1] = this.anInt1566 * 1775733203 - this.anInt1565 * 879163267 + arg0;
		arg2[2] = this.anInt1568 * -667296785 - this.anInt1571 * -1739240159 + arg1;
	}

	@OriginalMember(owner = "client!akf", name = "p", descriptor = "(II[I)V")
	void method14095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		arg2[0] = 0;
		arg2[1] = arg0 + (this.anInt1565 * 879163267 - this.anInt1566 * 1775733203);
		arg2[2] = this.anInt1571 * -1739240159 - this.anInt1568 * -667296785 + arg1;
	}

	@OriginalMember(owner = "client!akf", name = "g", descriptor = "(II)Z")
	boolean method14096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt1566 * 1775733203 && arg0 <= this.anInt1567 * 173692265 && arg1 >= this.anInt1568 * -667296785 && arg1 <= this.anInt1569 * -1334724989;
	}

	@OriginalMember(owner = "client!akf", name = "f", descriptor = "(IIIB)Z")
	boolean method14097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		return arg0 >= this.anInt1570 * -1414520927 && arg1 >= this.anInt1566 * 1775733203 && arg1 <= this.anInt1567 * 173692265 && arg2 >= this.anInt1568 * -667296785 && arg2 <= this.anInt1569 * -1334724989;
	}

	@OriginalMember(owner = "client!akf", name = "m", descriptor = "(III)Z")
	boolean method14098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0 >= this.anInt1570 * -1414520927 && arg1 >= this.anInt1566 * 1775733203 && arg1 <= this.anInt1567 * 173692265 && arg2 >= this.anInt1568 * -667296785 && arg2 <= this.anInt1569 * -1334724989;
	}

	@OriginalMember(owner = "client!akf", name = "o", descriptor = "(III)Z")
	boolean method14099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0 >= this.anInt1570 * -1414520927 && arg1 >= this.anInt1566 * 1775733203 && arg1 <= this.anInt1567 * 173692265 && arg2 >= this.anInt1568 * -667296785 && arg2 <= this.anInt1569 * -1334724989;
	}

	@OriginalMember(owner = "client!akf", name = "j", descriptor = "(III)Z")
	boolean method14100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0 >= this.anInt1570 * -1414520927 && arg1 >= this.anInt1566 * 1775733203 && arg1 <= this.anInt1567 * 173692265 && arg2 >= this.anInt1568 * -667296785 && arg2 <= this.anInt1569 * -1334724989;
	}

	@OriginalMember(owner = "client!akf", name = "a", descriptor = "(III)Z")
	boolean method14101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0 >= this.anInt1570 * -1414520927 && arg1 >= this.anInt1566 * 1775733203 && arg1 <= this.anInt1567 * 173692265 && arg2 >= this.anInt1568 * -667296785 && arg2 <= this.anInt1569 * -1334724989;
	}

	@OriginalMember(owner = "client!akf", name = "s", descriptor = "(II)Z")
	boolean method14102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt1565 * 879163267 && arg0 <= this.anInt1572 * -1540496189 && arg1 >= this.anInt1571 * -1739240159 && arg1 <= this.anInt1573 * 368918529;
	}

	@OriginalMember(owner = "client!akf", name = "l", descriptor = "(II[IB)V")
	void method14103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte arg3) {
		arg2[0] = 0;
		arg2[1] = arg0 + (this.anInt1565 * 879163267 - this.anInt1566 * 1775733203);
		arg2[2] = this.anInt1571 * -1739240159 - this.anInt1568 * -667296785 + arg1;
	}

	@OriginalMember(owner = "client!akf", name = "z", descriptor = "(II)Z")
	boolean method14104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt1565 * 879163267 && arg0 <= this.anInt1572 * -1540496189 && arg1 >= this.anInt1571 * -1739240159 && arg1 <= this.anInt1573 * 368918529;
	}

	@OriginalMember(owner = "client!akf", name = "i", descriptor = "(II)Z")
	boolean method14105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt1566 * 1775733203 && arg0 <= this.anInt1567 * 173692265 && arg1 >= this.anInt1568 * -667296785 && arg1 <= this.anInt1569 * -1334724989;
	}

	@OriginalMember(owner = "client!akf", name = "v", descriptor = "(II[I)V")
	void method14106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		arg2[0] = 0;
		arg2[1] = arg0 + (this.anInt1565 * 879163267 - this.anInt1566 * 1775733203);
		arg2[2] = this.anInt1571 * -1739240159 - this.anInt1568 * -667296785 + arg1;
	}
}
