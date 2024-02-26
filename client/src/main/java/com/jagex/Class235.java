package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dx")
public final class Class235 {

	@OriginalMember(owner = "client!dx", name = "h", descriptor = "Lclient!eu;")
	static Class252 aClass252_1;

	@OriginalMember(owner = "client!dx", name = "q", descriptor = "Z")
	static boolean aBoolean764;

	@OriginalMember(owner = "client!dx", name = "u", descriptor = "Z")
	static boolean aBoolean763 = true;

	@OriginalMember(owner = "client!dx", name = "t", descriptor = "[Lclient!dl;")
	Class227[] aClass227Array1;

	@OriginalMember(owner = "client!dx", name = "e", descriptor = "Lclient!pf;")
	Class480 aClass480_87;

	@OriginalMember(owner = "client!dx", name = "f", descriptor = "I")
	int anInt3803;

	@OriginalMember(owner = "client!dx", name = "y", descriptor = "(Lclient!yp;B)V")
	static void method26125(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(9) Class107 local9 = (Class107) arg0.aClass80_Sub1_Sub20_2.anObjectArray5[arg0.anInt5780 * -1336568839];
		@Pc(30) Interface22 local30 = (Interface22) (arg0.anIntArray526[arg0.anInt5780 * -1336568839] == 0 ? arg0.aMap23.get(local9.aClass143_6) : arg0.aMap24.get(local9.aClass143_6));
		@Pc(35) Class519 local35 = local9.aClass521_6.method30623(-666678663);
		if (local35 == Class519.aClass519_4) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local30.method36980(local9, -1010673845);
		} else if (Class519.aClass519_3 == local35) {
			arg0.aLongArray27[(arg0.anInt5777 += 1311199625) * -628853575 - 1] = local30.method36984(local9, 2063032589);
		} else if (Class519.aClass519_2 == local35) {
			try {
				@Pc(88) String local88 = (String) local30.method36988(local9, -1671888128);
				if (local88 == null) {
					local88 = "null";
				}
				arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local88;
			} catch (@Pc(109) Exception local109) {
				throw new RuntimeException(local109);
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dx", name = "aab", descriptor = "(Lclient!yp;I)V")
	static void method26126(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		if (local13.startsWith(Class6_Sub1.method23670(0, -2107869878)) || local13.startsWith(Class6_Sub1.method23670(1, 618220038))) {
			local13 = local13.substring(7);
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class143_Sub1.method11097(local13, -969889085);
	}

	@OriginalMember(owner = "client!dx", name = "d", descriptor = "(Lclient!ahb;B)V")
	static void method26127(@OriginalArg(0) Class120_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) byte arg1) {
		if (arg0 instanceof Class120_Sub1_Sub1_Sub1_Sub1) {
			@Pc(5) Class120_Sub1_Sub1_Sub1_Sub1 local5 = (Class120_Sub1_Sub1_Sub1_Sub1) arg0;
			if (local5.aClass335_1 != null) {
				Class578.method31798(local5, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 != local5.aByte99, (byte) 49);
			}
		} else if (arg0 instanceof Class120_Sub1_Sub1_Sub1_Sub2) {
			@Pc(26) Class120_Sub1_Sub1_Sub1_Sub2 local26 = (Class120_Sub1_Sub1_Sub1_Sub2) arg0;
			Class103_Sub13.method7940(local26, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 != local26.aByte99, (byte) -21);
		}
	}

	@OriginalMember(owner = "client!dx", name = "<init>", descriptor = "(Lclient!pf;)V")
	public Class235(@OriginalArg(0) Class480 arg0) {
		this.aClass480_87 = arg0;
		this.anInt3803 = arg0.method29929(0, -561697017) * -1290566779;
		this.method26119((byte) 12);
	}

	@OriginalMember(owner = "client!dx", name = "u", descriptor = "(I)Lclient!dl;")
	public Class227 method26118(@OriginalArg(0) int arg0) {
		this.method26119((byte) 15);
		return this.aClass227Array1[arg0];
	}

	@OriginalMember(owner = "client!dx", name = "f", descriptor = "(B)V")
	void method26119(@OriginalArg(0) byte arg0) {
		if (!aBoolean763) {
			return;
		}
		aBoolean763 = false;
		this.aClass227Array1 = new Class227[this.anInt3803 * 683408717];
		for (@Pc(13) int local13 = 0; local13 < this.anInt3803 * 683408717; local13++) {
			@Pc(29) Packet local29 = new Packet(this.aClass480_87.method29918(0, local13, 1896589581));
			if (local29.data == null) {
				this.aClass227Array1[local13] = null;
			} else {
				try {
					@Pc(42) Class227 local42 = new Class227();
					local42.method25970(local13, local29, 1034673634);
					this.aClass227Array1[local13] = local42;
				} catch (@Pc(54) Exception local54) {
					this.aClass227Array1[local13] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dx", name = "t", descriptor = "(II)Lclient!dl;")
	public Class227 method26120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26119((byte) -9);
		return this.aClass227Array1[arg0];
	}

	@OriginalMember(owner = "client!dx", name = "e", descriptor = "(I)Lclient!dl;")
	public Class227 method26121(@OriginalArg(0) int arg0) {
		this.method26119((byte) 15);
		return this.aClass227Array1[arg0];
	}

	@OriginalMember(owner = "client!dx", name = "l", descriptor = "(I)Lclient!dl;")
	public Class227 method26122(@OriginalArg(0) int arg0) {
		this.method26119((byte) -72);
		return this.aClass227Array1[arg0];
	}

	@OriginalMember(owner = "client!dx", name = "g", descriptor = "()V")
	void method26123() {
		if (!aBoolean763) {
			return;
		}
		aBoolean763 = false;
		this.aClass227Array1 = new Class227[this.anInt3803 * 683408717];
		for (@Pc(13) int local13 = 0; local13 < this.anInt3803 * 683408717; local13++) {
			@Pc(29) Packet local29 = new Packet(this.aClass480_87.method29918(0, local13, 1896589581));
			if (local29.data == null) {
				this.aClass227Array1[local13] = null;
			} else {
				try {
					@Pc(42) Class227 local42 = new Class227();
					local42.method25970(local13, local29, -1883780932);
					this.aClass227Array1[local13] = local42;
				} catch (@Pc(54) Exception local54) {
					this.aClass227Array1[local13] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dx", name = "i", descriptor = "()V")
	void method26124() {
		if (!aBoolean763) {
			return;
		}
		aBoolean763 = false;
		this.aClass227Array1 = new Class227[this.anInt3803 * 683408717];
		for (@Pc(13) int local13 = 0; local13 < this.anInt3803 * 683408717; local13++) {
			@Pc(29) Packet local29 = new Packet(this.aClass480_87.method29918(0, local13, 1896589581));
			if (local29.data == null) {
				this.aClass227Array1[local13] = null;
			} else {
				try {
					@Pc(42) Class227 local42 = new Class227();
					local42.method25970(local13, local29, -1729168360);
					this.aClass227Array1[local13] = local42;
				} catch (@Pc(54) Exception local54) {
					this.aClass227Array1[local13] = null;
				}
			}
		}
	}
}
