package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.LinkedList;
import java.util.List;

@OriginalClass("client!ty")
public final class Class587 {

	@OriginalMember(owner = "client!ty", name = "wq", descriptor = "Lclient!p;")
	public static Class474 aClass474_1;

	@OriginalMember(owner = "client!ty", name = "t", descriptor = "I")
	public int anInt5303;

	@OriginalMember(owner = "client!ty", name = "f", descriptor = "[I")
	public int[] anIntArray479;

	@OriginalMember(owner = "client!ty", name = "e", descriptor = "[I")
	public int[] anIntArray480;

	@OriginalMember(owner = "client!ty", name = "u", descriptor = "(Lclient!pf;Ljava/lang/String;Z)Lclient!ty;")
	public static Class587 method31886(@OriginalArg(0) Class480 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) int local4 = arg0.method29934(arg1, (byte) 8);
		if (local4 == -1) {
			return new Class587(0);
		}
		@Pc(18) byte[] local18 = arg0.method29918(local4, 1, 1896589581);
		if (local18 == null) {
			return new Class587(0);
		}
		@Pc(31) Packet local31 = new Packet(local18);
		@Pc(35) int local35 = local31.g2();
		@Pc(40) Class587 local40 = new Class587(local35);
		@Pc(42) int local42 = 0;
		while (true) {
			while (local42 < local40.anInt5303 * -70603505) {
				@Pc(52) int local52 = local31.g4();
				@Pc(56) int local56 = local31.g2();
				@Pc(60) int local60 = local31.g1();
				if (!arg2 && local60 == 1) {
					local40.anInt5303 -= 1039049199;
				} else {
					local40.anIntArray479[local42] = local52;
					local40.anIntArray480[local42] = local56;
					local42++;
				}
			}
			return local40;
		}
	}

	@OriginalMember(owner = "client!ty", name = "f", descriptor = "(Lclient!pf;Ljava/lang/String;Z)Lclient!ty;")
	public static Class587 method31887(@OriginalArg(0) Class480 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) int local4 = arg0.method29934(arg1, (byte) -15);
		if (local4 == -1) {
			return new Class587(0);
		}
		@Pc(18) byte[] local18 = arg0.method29918(local4, 1, 1896589581);
		if (local18 == null) {
			return new Class587(0);
		}
		@Pc(31) Packet local31 = new Packet(local18);
		@Pc(35) int local35 = local31.g2();
		@Pc(40) Class587 local40 = new Class587(local35);
		@Pc(42) int local42 = 0;
		while (true) {
			while (local42 < local40.anInt5303 * -70603505) {
				@Pc(52) int local52 = local31.g4();
				@Pc(56) int local56 = local31.g2();
				@Pc(60) int local60 = local31.g1();
				if (!arg2 && local60 == 1) {
					local40.anInt5303 -= 1039049199;
				} else {
					local40.anIntArray479[local42] = local52;
					local40.anIntArray480[local42] = local56;
					local42++;
				}
			}
			return local40;
		}
	}

	@OriginalMember(owner = "client!ty", name = "e", descriptor = "(Lclient!pf;Ljava/lang/String;Z)Lclient!ty;")
	public static Class587 method31888(@OriginalArg(0) Class480 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) int local4 = arg0.method29934(arg1, (byte) -5);
		if (local4 == -1) {
			return new Class587(0);
		}
		@Pc(18) byte[] local18 = arg0.method29918(local4, 1, 1896589581);
		if (local18 == null) {
			return new Class587(0);
		}
		@Pc(31) Packet local31 = new Packet(local18);
		@Pc(35) int local35 = local31.g2();
		@Pc(40) Class587 local40 = new Class587(local35);
		@Pc(42) int local42 = 0;
		while (true) {
			while (local42 < local40.anInt5303 * -70603505) {
				@Pc(52) int local52 = local31.g4();
				@Pc(56) int local56 = local31.g2();
				@Pc(60) int local60 = local31.g1();
				if (!arg2 && local60 == 1) {
					local40.anInt5303 -= 1039049199;
				} else {
					local40.anIntArray479[local42] = local52;
					local40.anIntArray480[local42] = local56;
					local42++;
				}
			}
			return local40;
		}
	}

	@OriginalMember(owner = "client!ty", name = "gm", descriptor = "(Lclient!yp;S)V")
	static void method31889(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class251.method26366(local11, local14, arg0, -743322597);
	}

	@OriginalMember(owner = "client!ty", name = "aja", descriptor = "(Lclient!yp;S)V")
	static void method31890(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		if (Class544.aClass155_1.method15048(82, (short) -5815)) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 1;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!ty", name = "atm", descriptor = "(Lclient!yp;I)V")
	static void method31891(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub15_1.method16121(1873739195);
	}

	@OriginalMember(owner = "client!ty", name = "bef", descriptor = "(Lclient!yp;B)V")
	static void method31892(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(27) Class88 local27 = Class483.method30029(local13, 1215640822);
		if (local27 == null) {
			throw new RuntimeException();
		} else if (Class603.method32130(local13, 504309486) != client.anInt3451 * 1836659433) {
			throw new RuntimeException();
		} else if (Class245.aList4 == null && Class245.aList4.isEmpty()) {
			throw new RuntimeException();
		} else {
			@Pc(59) List local59 = local27.method1783(local23, 1799948398);
			Class245.aList4 = new LinkedList(Class245.aList4);
			if (local59 == null) {
				Class245.aList4.clear();
			} else {
				Class245.aList4.retainAll(local59);
			}
			Class411.anIterator2 = Class245.aList4.iterator();
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class245.aList4.size();
		}
	}

	@OriginalMember(owner = "client!ty", name = "aru", descriptor = "(Lclient!yp;I)V")
	static void method31893(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class353.method28071(567497520) ? 1 : 0;
	}

	@OriginalMember(owner = "client!ty", name = "jh", descriptor = "(Lclient!yp;I)V")
	static void method31894(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
	}

	@OriginalMember(owner = "client!ty", name = "<init>", descriptor = "(I)V")
	public Class587(@OriginalArg(0) int arg0) {
		this.anInt5303 = arg0 * 1039049199;
		this.anIntArray479 = new int[this.anInt5303 * -70603505];
		this.anIntArray480 = new int[this.anInt5303 * -70603505];
	}
}
