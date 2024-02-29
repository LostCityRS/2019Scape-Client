package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!akv")
public class Class93_Sub32 extends Class93 {

	@OriginalMember(owner = "client!akv", name = "k", descriptor = "I")
	int anInt1618;

	@OriginalMember(owner = "client!akv", name = "f", descriptor = "I")
	int anInt1613;

	@OriginalMember(owner = "client!akv", name = "w", descriptor = "I")
	int anInt1614;

	@OriginalMember(owner = "client!akv", name = "l", descriptor = "I")
	int anInt1615;

	@OriginalMember(owner = "client!akv", name = "u", descriptor = "I")
	int anInt1617;

	@OriginalMember(owner = "client!akv", name = "z", descriptor = "I")
	int anInt1616;

	@OriginalMember(owner = "client!akv", name = "p", descriptor = "I")
	int anInt1619;

	@OriginalMember(owner = "client!akv", name = "d", descriptor = "I")
	int anInt1620;

	@OriginalMember(owner = "client!akv", name = "c", descriptor = "I")
	int anInt1621;

	@OriginalMember(owner = "client!akv", name = "<init>", descriptor = "(IIIIIIIII)V", line = 16)
	Class93_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt1618 = arg0 * 510161869;
		this.anInt1613 = arg1 * -1397809565;
		this.anInt1614 = arg2 * -2071732255;
		this.anInt1615 = arg3 * 1417769943;
		this.anInt1617 = arg4 * -531940189;
		this.anInt1616 = arg5 * 1098666051;
		this.anInt1619 = arg6 * 2034259939;
		this.anInt1620 = arg7 * 1588501079;
		this.anInt1621 = arg8 * -1906952417;
	}

	@OriginalMember(owner = "client!akv", name = "e", descriptor = "(III)Z", line = 29)
	boolean method13914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0 >= this.anInt1613 * 1917342539 && arg0 <= this.anInt1615 * -1091293209 && arg1 >= this.anInt1614 * 840213537 && arg1 <= this.anInt1617 * -1446815989;
	}

	@OriginalMember(owner = "client!akv", name = "n", descriptor = "(IIII)Z", line = 34)
	boolean method13915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return arg0 >= this.anInt1618 * 1148825861 && arg1 >= this.anInt1613 * 1917342539 && arg1 <= this.anInt1615 * -1091293209 && arg2 >= this.anInt1614 * 840213537 && arg2 <= this.anInt1617 * -1446815989;
	}

	@OriginalMember(owner = "client!akv", name = "w", descriptor = "(III)Z", line = 34)
	boolean method13916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0 >= this.anInt1618 * 1148825861 && arg1 >= this.anInt1613 * 1917342539 && arg1 <= this.anInt1615 * -1091293209 && arg2 >= this.anInt1614 * 840213537 && arg2 <= this.anInt1617 * -1446815989;
	}

	@OriginalMember(owner = "client!akv", name = "l", descriptor = "(III)Z", line = 34)
	boolean method13917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0 >= this.anInt1618 * 1148825861 && arg1 >= this.anInt1613 * 1917342539 && arg1 <= this.anInt1615 * -1091293209 && arg2 >= this.anInt1614 * 840213537 && arg2 <= this.anInt1617 * -1446815989;
	}

	@OriginalMember(owner = "client!akv", name = "u", descriptor = "(III)Z", line = 34)
	boolean method13918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0 >= this.anInt1618 * 1148825861 && arg1 >= this.anInt1613 * 1917342539 && arg1 <= this.anInt1615 * -1091293209 && arg2 >= this.anInt1614 * 840213537 && arg2 <= this.anInt1617 * -1446815989;
	}

	@OriginalMember(owner = "client!akv", name = "m", descriptor = "(III)Z", line = 39)
	boolean method13919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0 >= this.anInt1616 * -1215398805 && arg0 <= this.anInt1620 * 447541607 && arg1 >= this.anInt1619 * -144202293 && arg1 <= this.anInt1621 * 71730399;
	}

	@OriginalMember(owner = "client!akv", name = "c", descriptor = "(II[I)V", line = 44)
	void method13920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		arg2[0] = this.anInt1618 * 1148825861;
		arg2[1] = this.anInt1613 * 1917342539 - this.anInt1616 * -1215398805 + arg0;
		arg2[2] = arg1 + (this.anInt1614 * 840213537 - this.anInt1619 * -144202293);
	}

	@OriginalMember(owner = "client!akv", name = "k", descriptor = "(II[II)V", line = 44)
	void method13921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		arg2[0] = this.anInt1618 * 1148825861;
		arg2[1] = this.anInt1613 * 1917342539 - this.anInt1616 * -1215398805 + arg0;
		arg2[2] = arg1 + (this.anInt1614 * 840213537 - this.anInt1619 * -144202293);
	}

	@OriginalMember(owner = "client!akv", name = "z", descriptor = "(II[I)V", line = 44)
	void method13922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		arg2[0] = this.anInt1618 * 1148825861;
		arg2[1] = this.anInt1613 * 1917342539 - this.anInt1616 * -1215398805 + arg0;
		arg2[2] = arg1 + (this.anInt1614 * 840213537 - this.anInt1619 * -144202293);
	}

	@OriginalMember(owner = "client!akv", name = "p", descriptor = "(II[I)V", line = 44)
	void method13923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		arg2[0] = this.anInt1618 * 1148825861;
		arg2[1] = this.anInt1613 * 1917342539 - this.anInt1616 * -1215398805 + arg0;
		arg2[2] = arg1 + (this.anInt1614 * 840213537 - this.anInt1619 * -144202293);
	}

	@OriginalMember(owner = "client!akv", name = "d", descriptor = "(II[I)V", line = 44)
	void method13924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		arg2[0] = this.anInt1618 * 1148825861;
		arg2[1] = this.anInt1613 * 1917342539 - this.anInt1616 * -1215398805 + arg0;
		arg2[2] = arg1 + (this.anInt1614 * 840213537 - this.anInt1619 * -144202293);
	}

	@OriginalMember(owner = "client!akv", name = "v", descriptor = "(II[I)V", line = 50)
	void method13925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		arg2[0] = 0;
		arg2[1] = arg0 + (this.anInt1616 * -1215398805 - this.anInt1613 * 1917342539);
		arg2[2] = this.anInt1619 * -144202293 - this.anInt1614 * 840213537 + arg1;
	}

	@OriginalMember(owner = "client!akv", name = "f", descriptor = "(II[IB)V", line = 50)
	void method13926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte arg3) {
		arg2[0] = 0;
		arg2[1] = arg0 + (this.anInt1616 * -1215398805 - this.anInt1613 * 1917342539);
		arg2[2] = this.anInt1619 * -144202293 - this.anInt1614 * 840213537 + arg1;
	}

	@OriginalMember(owner = "client!akv", name = "r", descriptor = "(II[I)V", line = 50)
	void method13927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		arg2[0] = 0;
		arg2[1] = arg0 + (this.anInt1616 * -1215398805 - this.anInt1613 * 1917342539);
		arg2[2] = this.anInt1619 * -144202293 - this.anInt1614 * 840213537 + arg1;
	}

	@OriginalMember(owner = "client!akv", name = "y", descriptor = "(II[I)V", line = 50)
	void method13928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		arg2[0] = 0;
		arg2[1] = arg0 + (this.anInt1616 * -1215398805 - this.anInt1613 * 1917342539);
		arg2[2] = this.anInt1619 * -144202293 - this.anInt1614 * 840213537 + arg1;
	}

	@OriginalMember(owner = "client!akv", name = "x", descriptor = "(CI)Z", line = 236)
	public static boolean method13929(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!akv", name = "lw", descriptor = "(Lclient!hf;IS)I", line = 12298)
	static int method13930(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		if (!client.method25364(arg0).method13622(arg1, -244589856) && arg0.anObjectArray26 == null) {
			return -1;
		} else if (arg0.anIntArray376 == null || arg0.anIntArray376.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray376[arg1];
		}
	}

	@OriginalMember(owner = "client!akv", name = "arg", descriptor = "(Lclient!yf;I)V", line = 12903)
	static final void method13931(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class642.method32520(false, (short) 3224);
	}
}
