package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public class Class611 {

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
	public int anInt5623;

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
	public int anInt5624;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
	public int anInt5625;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V", line = 8)
	public Class611() {
		this.anInt5625 = 715656041;
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(III)V", line = 12)
	public Class611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5625 = arg0 * -715656041;
		this.anInt5623 = arg1 * 2122256161;
		this.anInt5624 = arg2 * -67830523;
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(I)V", line = 18)
	public Class611(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			this.anInt5625 = 715656041;
		} else {
			this.anInt5625 = (arg0 >> 28 & 0x3) * -715656041;
			this.anInt5623 = (arg0 >> 14 & 0x3FFF) * 2122256161;
			this.anInt5624 = (arg0 & 0x3FFF) * -67830523;
		}
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(Lclient!akt;B)V", line = 28)
	public void method32023(@OriginalArg(0) Class93_Sub30 arg0, @OriginalArg(1) byte arg1) {
		this.anInt5625 = arg0.anInt1609 * 1839387951;
		this.anInt5623 = (arg0.anInt1610 * -427776677 >> 9) * 2122256161;
		this.anInt5624 = (arg0.anInt1612 * 671628745 >> 9) * -67830523;
	}

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "(Lclient!akt;)V", line = 28)
	public void method32024(@OriginalArg(0) Class93_Sub30 arg0) {
		this.anInt5625 = arg0.anInt1609 * 1839387951;
		this.anInt5623 = (arg0.anInt1610 * -427776677 >> 9) * 2122256161;
		this.anInt5624 = (arg0.anInt1612 * 671628745 >> 9) * -67830523;
	}

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "(Lclient!akt;)V", line = 28)
	public void method32025(@OriginalArg(0) Class93_Sub30 arg0) {
		this.anInt5625 = arg0.anInt1609 * 1839387951;
		this.anInt5623 = (arg0.anInt1610 * -427776677 >> 9) * 2122256161;
		this.anInt5624 = (arg0.anInt1612 * 671628745 >> 9) * -67830523;
	}

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "(Lclient!akt;)V", line = 28)
	public void method32026(@OriginalArg(0) Class93_Sub30 arg0) {
		this.anInt5625 = arg0.anInt1609 * 1839387951;
		this.anInt5623 = (arg0.anInt1610 * -427776677 >> 9) * 2122256161;
		this.anInt5624 = (arg0.anInt1612 * 671628745 >> 9) * -67830523;
	}

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "(S)I", line = 34)
	public int method32027(@OriginalArg(0) short arg0) {
		return this.anInt5625 * -78984409 << 28 | this.anInt5623 * 270611681 << 14 | this.anInt5624 * -1994307635;
	}

	@OriginalMember(owner = "client!ve", name = "z", descriptor = "()I", line = 34)
	public int method32028() {
		return this.anInt5625 * -78984409 << 28 | this.anInt5623 * 270611681 << 14 | this.anInt5624 * -1994307635;
	}

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "()I", line = 34)
	public int method32029() {
		return this.anInt5625 * -78984409 << 28 | this.anInt5623 * 270611681 << 14 | this.anInt5624 * -1994307635;
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "()I", line = 34)
	public int method32030() {
		return this.anInt5625 * -78984409 << 28 | this.anInt5623 * 270611681 << 14 | this.anInt5624 * -1994307635;
	}

	@OriginalMember(owner = "client!ve", name = "rq", descriptor = "(Ljava/lang/Object;)Z", line = 38)
	public boolean method32031(@OriginalArg(0) Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class611) {
			return this.method32036((Class611) arg0, -990229751);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "rs", descriptor = "(Ljava/lang/Object;)Z", line = 38)
	public boolean method32032(@OriginalArg(0) Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class611) {
			return this.method32036((Class611) arg0, -1012593485);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "rp", descriptor = "(Ljava/lang/Object;)Z", line = 38)
	public boolean method32033(@OriginalArg(0) Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class611) {
			return this.method32036((Class611) arg0, -1523529240);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "ro", descriptor = "(Ljava/lang/Object;)Z", line = 38)
	public boolean method32034(@OriginalArg(0) Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class611) {
			return this.method32036((Class611) arg0, -1376301893);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 38)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class611) {
			return this.method32036((Class611) arg0, -1476282459);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "(Lclient!ve;)Z", line = 44)
	boolean method32035(@OriginalArg(0) Class611 arg0) {
		return this.method32038(arg0.anInt5625 * -78984409, arg0.anInt5623 * 270611681, arg0.anInt5624 * -1994307635, -868291596);
	}

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "(Lclient!ve;I)Z", line = 44)
	boolean method32036(@OriginalArg(0) Class611 arg0, @OriginalArg(1) int arg1) {
		return this.method32038(arg0.anInt5625 * -78984409, arg0.anInt5623 * 270611681, arg0.anInt5624 * -1994307635, 1608601108);
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(Lclient!ve;)Z", line = 44)
	boolean method32037(@OriginalArg(0) Class611 arg0) {
		return this.method32038(arg0.anInt5625 * -78984409, arg0.anInt5623 * 270611681, arg0.anInt5624 * -1994307635, -1535209391);
	}

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "(IIII)Z", line = 48)
	boolean method32038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 != this.anInt5625 * -78984409) {
			return false;
		} else if (this.anInt5623 * 270611681 == arg1) {
			return arg2 == this.anInt5624 * -1994307635;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "v", descriptor = "(III)Z", line = 48)
	boolean method32039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 != this.anInt5625 * -78984409) {
			return false;
		} else if (this.anInt5623 * 270611681 == arg1) {
			return arg2 == this.anInt5624 * -1994307635;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "hashCode", descriptor = "()I", line = 55)
	@Override
	public int hashCode() {
		return this.method32027((short) 448);
	}

	@OriginalMember(owner = "client!ve", name = "rk", descriptor = "()I", line = 55)
	public int method32040() {
		return this.method32027((short) 448);
	}

	@OriginalMember(owner = "client!ve", name = "rm", descriptor = "()I", line = 55)
	public int method32041() {
		return this.method32027((short) 448);
	}

	@OriginalMember(owner = "client!ve", name = "ri", descriptor = "()I", line = 55)
	public int method32042() {
		return this.method32027((short) 448);
	}

	@OriginalMember(owner = "client!ve", name = "rj", descriptor = "()Ljava/lang/String;", line = 59)
	public String method32043() {
		return this.method32044(",", -2090607187);
	}

	@OriginalMember(owner = "client!ve", name = "toString", descriptor = "()Ljava/lang/String;", line = 59)
	@Override
	public String toString() {
		return this.method32044(",", -2089023050);
	}

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 63)
	String method32044(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.anInt5625 * -78984409 + arg0 + (this.anInt5623 * 270611681 >> 6) + arg0 + (this.anInt5624 * -1994307635 >> 6) + arg0 + (this.anInt5623 * 270611681 & 0x3F) + arg0 + (this.anInt5624 * -1994307635 & 0x3F);
	}

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 63)
	String method32045(@OriginalArg(0) String arg0) {
		return this.anInt5625 * -78984409 + arg0 + (this.anInt5623 * 270611681 >> 6) + arg0 + (this.anInt5624 * -1994307635 >> 6) + arg0 + (this.anInt5623 * 270611681 & 0x3F) + arg0 + (this.anInt5624 * -1994307635 & 0x3F);
	}

	@OriginalMember(owner = "client!ve", name = "hc", descriptor = "(Lclient!yf;B)V", line = 6420)
	static final void method32046(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		ServerProt.method28966(local11, local14, arg0, Class310.aClass310_2, (byte) 73);
	}

	@OriginalMember(owner = "client!ve", name = "zn", descriptor = "(Lclient!yf;S)V", line = 9397)
	static final void method32047(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		if (Class108_Sub2.mapOwner != null && Class108_Sub2.mapOwner.equalsIgnoreCase(local13)) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 1;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!ve", name = "kp", descriptor = "(Lclient!hf;I)V", line = 11880)
	static final void method32048(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1) {
		if (Class312.anInt3954 * -270313193 != arg0.anInt3972 * -1428659995) {
			return;
		}
		if (Class520.selfPlayer.name2 == null) {
			arg0.anInt4037 = 0;
			arg0.anInt4038 = 0;
			return;
		}
		arg0.anInt4006 = -1268657782;
		arg0.anInt4007 = ((int) (Math.sin((double) client.anInt3485 / 40.0D) * 256.0D) & 0x7FF) * 1060356621;
		arg0.anInt4001 = -2003331097;
		arg0.anInt4037 = client.selfPlayerSlot * 1786756713;
		arg0.anInt4038 = Class704.method36732(Class520.selfPlayer.name2, 304329139) * 1171936085;
		@Pc(54) Class19_Sub3 local54 = Class520.selfPlayer.aClass19_Sub3_3;
		if (local54 == null) {
			arg0.aClass19_6 = null;
			return;
		}
		if (arg0.aClass19_6 == null) {
			arg0.aClass19_6 = new Class19_Sub2();
		}
		arg0.anInt4023 = local54.method23564((byte) 28) * 600145537;
		arg0.aClass19_6.method23554(local54, 751447761);
	}
}
