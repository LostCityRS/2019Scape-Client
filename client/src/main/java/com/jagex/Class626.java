package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vw")
public final class Class626 {

	@OriginalMember(owner = "client!vw", name = "u", descriptor = "I")
	static int anInt5539;

	@OriginalMember(owner = "client!vw", name = "dg", descriptor = "Lclient!dx;")
	public static Class235 aClass235_8;

	@OriginalMember(owner = "client!vw", name = "fj", descriptor = "[Lclient!aih;")
	public static Class141_Sub1[] aClass141_Sub1Array2;

	@OriginalMember(owner = "client!vw", name = "fw", descriptor = "Lclient!pf;")
	public static Class480 aClass480_129;

	@OriginalMember(owner = "client!vw", name = "e", descriptor = "I")
	public int anInt5537;

	@OriginalMember(owner = "client!vw", name = "f", descriptor = "I")
	public int anInt5540;

	@OriginalMember(owner = "client!vw", name = "t", descriptor = "I")
	public int anInt5538;

	@OriginalMember(owner = "client!vw", name = "sp", descriptor = "(Lclient!yp;I)V")
	static void method32533(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.anInt4074 * 1940765415;
	}

	@OriginalMember(owner = "client!vw", name = "yf", descriptor = "(Lclient!yp;I)V")
	static void method32534(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class363.aClass152_1.method14615(-1328323006);
	}

	@OriginalMember(owner = "client!vw", name = "agu", descriptor = "(Lclient!yp;B)V")
	static void method32535(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(29) Class79 local29 = (Class79) Class370.aClass41_Sub10_1.method18054(local23, 1657206439);
		if (local29.method1428(829302236)) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = ((Class43) Class25.aClass41_Sub9_1.method18054(local13, 234185932)).method891(local23, local29.aString11, (byte) 106);
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = ((Class43) Class25.aClass41_Sub9_1.method18054(local13, 792020669)).method917(local23, local29.anInt253 * 680817871, (short) 9855);
		}
	}

	@OriginalMember(owner = "client!vw", name = "co", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method32536(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg0.anInt4116 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] * 886577953;
		Class296.method26998(arg0, 1168418710);
	}

	@OriginalMember(owner = "client!vw", name = "gv", descriptor = "(Lclient!yp;I)V")
	static void method32537(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class103_Sub3.method7212(local11, local14, arg0, -1898496650);
	}

	@OriginalMember(owner = "client!vw", name = "wr", descriptor = "(Lclient!yp;I)V")
	static void method32538(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 1815275855;
		Class490.aClass263_13.method26530(arg0.anIntArray525[arg0.anInt5778 * 1896589581], arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1], -602389384);
	}

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "()V")
	public Class626() {
		this.anInt5538 = 645363905;
	}

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(III)V")
	public Class626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5538 = arg0 * -645363905;
		this.anInt5540 = arg1 * 1346275741;
		this.anInt5537 = arg2 * 1813646929;
	}

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(I)V")
	public Class626(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			this.anInt5538 = 645363905;
		} else {
			this.anInt5538 = (arg0 >> 28 & 0x3) * -645363905;
			this.anInt5540 = (arg0 >> 14 & 0x3FFF) * 1346275741;
			this.anInt5537 = (arg0 & 0x3FFF) * 1813646929;
		}
	}

	@OriginalMember(owner = "client!vw", name = "s", descriptor = "(Lclient!vw;)Z")
	boolean method32508(@OriginalArg(0) Class626 arg0) {
		return this.method32514(arg0.anInt5538 * -990975809, arg0.anInt5540 * -390642507, arg0.anInt5537 * -894305615, (byte) -2);
	}

	@OriginalMember(owner = "client!vw", name = "t", descriptor = "(Lclient!akx;I)V")
	public void method32509(@OriginalArg(0) Class80_Sub33 arg0, @OriginalArg(1) int arg1) {
		this.anInt5538 = arg0.anInt1652 * 1697589019;
		this.anInt5540 = (arg0.anInt1655 * -1125961095 >> 9) * 1346275741;
		this.anInt5537 = (arg0.anInt1653 * 1944136251 >> 9) * 1813646929;
	}

	@OriginalMember(owner = "client!vw", name = "o", descriptor = "()I")
	public int method32510() {
		return this.anInt5538 * -990975809 << 28 | this.anInt5540 * -390642507 << 14 | this.anInt5537 * -894305615;
	}

	@OriginalMember(owner = "client!vw", name = "h", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	String method32511(@OriginalArg(0) String arg0) {
		return this.anInt5538 * -990975809 + arg0 + (this.anInt5540 * -390642507 >> 6) + arg0 + (this.anInt5537 * -894305615 >> 6) + arg0 + (this.anInt5540 * -390642507 & 0x3F) + arg0 + (this.anInt5537 * -894305615 & 0x3F);
	}

	@OriginalMember(owner = "client!vw", name = "q", descriptor = "(III)Z")
	boolean method32512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 != this.anInt5538 * -990975809) {
			return false;
		} else if (arg1 == this.anInt5540 * -390642507) {
			return this.anInt5537 * -894305615 == arg2;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vw", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class626) {
			return this.method32513((Class626) arg0, (byte) 120);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vw", name = "e", descriptor = "(Lclient!vw;B)Z")
	boolean method32513(@OriginalArg(0) Class626 arg0, @OriginalArg(1) byte arg1) {
		return this.method32514(arg0.anInt5538 * -990975809, arg0.anInt5540 * -390642507, arg0.anInt5537 * -894305615, (byte) -43);
	}

	@OriginalMember(owner = "client!vw", name = "u", descriptor = "(IIIB)Z")
	boolean method32514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if (arg0 != this.anInt5538 * -990975809) {
			return false;
		} else if (arg1 == this.anInt5540 * -390642507) {
			return this.anInt5537 * -894305615 == arg2;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vw", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method32524(-1980867358);
	}

	@OriginalMember(owner = "client!vw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return this.method32515(",", 2065003566);
	}

	@OriginalMember(owner = "client!vw", name = "l", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	String method32515(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.anInt5538 * -990975809 + arg0 + (this.anInt5540 * -390642507 >> 6) + arg0 + (this.anInt5537 * -894305615 >> 6) + arg0 + (this.anInt5540 * -390642507 & 0x3F) + arg0 + (this.anInt5537 * -894305615 & 0x3F);
	}

	@OriginalMember(owner = "client!vw", name = "rn", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method32516(@OriginalArg(0) Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class626) {
			return this.method32513((Class626) arg0, (byte) 86);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vw", name = "rs", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method32517(@OriginalArg(0) Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class626) {
			return this.method32513((Class626) arg0, (byte) 42);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vw", name = "rx", descriptor = "()Ljava/lang/String;")
	public String method32518() {
		return this.method32515(",", 2015553999);
	}

	@OriginalMember(owner = "client!vw", name = "ri", descriptor = "()Ljava/lang/String;")
	public String method32519() {
		return this.method32515(",", 1988538052);
	}

	@OriginalMember(owner = "client!vw", name = "rm", descriptor = "()I")
	public int method32520() {
		return this.method32524(1374088056);
	}

	@OriginalMember(owner = "client!vw", name = "g", descriptor = "(Lclient!akx;)V")
	public void method32521(@OriginalArg(0) Class80_Sub33 arg0) {
		this.anInt5538 = arg0.anInt1652 * 1697589019;
		this.anInt5540 = (arg0.anInt1655 * -1125961095 >> 9) * 1346275741;
		this.anInt5537 = (arg0.anInt1653 * 1944136251 >> 9) * 1813646929;
	}

	@OriginalMember(owner = "client!vw", name = "i", descriptor = "(Lclient!akx;)V")
	public void method32522(@OriginalArg(0) Class80_Sub33 arg0) {
		this.anInt5538 = arg0.anInt1652 * 1697589019;
		this.anInt5540 = (arg0.anInt1655 * -1125961095 >> 9) * 1346275741;
		this.anInt5537 = (arg0.anInt1653 * 1944136251 >> 9) * 1813646929;
	}

	@OriginalMember(owner = "client!vw", name = "m", descriptor = "()I")
	public int method32523() {
		return this.anInt5538 * -990975809 << 28 | this.anInt5540 * -390642507 << 14 | this.anInt5537 * -894305615;
	}

	@OriginalMember(owner = "client!vw", name = "f", descriptor = "(I)I")
	public int method32524(@OriginalArg(0) int arg0) {
		return this.anInt5538 * -990975809 << 28 | this.anInt5540 * -390642507 << 14 | this.anInt5537 * -894305615;
	}

	@OriginalMember(owner = "client!vw", name = "z", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	String method32525(@OriginalArg(0) String arg0) {
		return this.anInt5538 * -990975809 + arg0 + (this.anInt5540 * -390642507 >> 6) + arg0 + (this.anInt5537 * -894305615 >> 6) + arg0 + (this.anInt5540 * -390642507 & 0x3F) + arg0 + (this.anInt5537 * -894305615 & 0x3F);
	}

	@OriginalMember(owner = "client!vw", name = "j", descriptor = "()I")
	public int method32526() {
		return this.anInt5538 * -990975809 << 28 | this.anInt5540 * -390642507 << 14 | this.anInt5537 * -894305615;
	}

	@OriginalMember(owner = "client!vw", name = "k", descriptor = "(Lclient!vw;)Z")
	boolean method32527(@OriginalArg(0) Class626 arg0) {
		return this.method32514(arg0.anInt5538 * -990975809, arg0.anInt5540 * -390642507, arg0.anInt5537 * -894305615, (byte) 43);
	}

	@OriginalMember(owner = "client!vw", name = "x", descriptor = "(III)Z")
	boolean method32528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 != this.anInt5538 * -990975809) {
			return false;
		} else if (arg1 == this.anInt5540 * -390642507) {
			return this.anInt5537 * -894305615 == arg2;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vw", name = "w", descriptor = "(III)Z")
	boolean method32529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 != this.anInt5538 * -990975809) {
			return false;
		} else if (arg1 == this.anInt5540 * -390642507) {
			return this.anInt5537 * -894305615 == arg2;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vw", name = "r", descriptor = "(III)Z")
	boolean method32530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 != this.anInt5538 * -990975809) {
			return false;
		} else if (arg1 == this.anInt5540 * -390642507) {
			return this.anInt5537 * -894305615 == arg2;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vw", name = "d", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	String method32531(@OriginalArg(0) String arg0) {
		return this.anInt5538 * -990975809 + arg0 + (this.anInt5540 * -390642507 >> 6) + arg0 + (this.anInt5537 * -894305615 >> 6) + arg0 + (this.anInt5540 * -390642507 & 0x3F) + arg0 + (this.anInt5537 * -894305615 & 0x3F);
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lclient!vw;)Z")
	boolean method32532(@OriginalArg(0) Class626 arg0) {
		return this.method32514(arg0.anInt5538 * -990975809, arg0.anInt5540 * -390642507, arg0.anInt5537 * -894305615, (byte) -38);
	}
}
