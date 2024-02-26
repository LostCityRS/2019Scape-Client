package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class511 implements Comparable {

	@OriginalMember(owner = "client!qm", name = "u", descriptor = "J")
	long aLong389;

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "J")
	long aLong390;

	@OriginalMember(owner = "client!qm", name = "t", descriptor = "Ljava/lang/Object;")
	Object anObject21;

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "Ljava/lang/Object;")
	Object anObject20;

	@OriginalMember(owner = "client!qm", name = "aiu", descriptor = "(Lclient!yp;I)V")
	static void method30549(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.aClass453_1.anIntArray451[local13] = local23;
	}

	@OriginalMember(owner = "client!qm", name = "baw", descriptor = "(Lclient!yp;I)V")
	static void method30550(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub8_1.method16950(local12, (byte) -87);
	}

	@OriginalMember(owner = "client!qm", name = "bs", descriptor = "(Lclient!yp;I)V")
	static void method30551(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] == 0) {
			arg0.anInt5780 += arg0.anIntArray526[-1336568839 * arg0.anInt5780] * -1216954807;
		}
	}

	@OriginalMember(owner = "client!qm", name = "cm", descriptor = "(Lclient!yp;B)V")
	static void method30552(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2083022052);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class565.method31479(local16, local22, arg0, (byte) 114);
	}

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "(IIZB)I")
	public static int method30553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		@Pc(1) int local1 = 0;
		@Pc(6) Class80_Sub3 local6 = Class565.method31482(arg0, arg2, 874158985);
		if (local6 == null) {
			return 0;
		}
		for (@Pc(12) int local12 = 0; local12 < local6.anIntArray179.length; local12++) {
			if (local6.anIntArray179[local12] >= 0 && ((Class43) Class25.aClass41_Sub9_1.method18054(local6.anIntArray179[local12], 2141743993)).anInt122 * 855963023 == arg1) {
				local1 += Class220.method25906(arg0, local12, arg2, -866041822);
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)V")
	Class511(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		this.anObject21 = arg0;
		this.anObject20 = arg1;
	}

	@OriginalMember(owner = "client!qm", name = "compareTo", descriptor = "(Ljava/lang/Object;)I")
	@Override
	public int compareTo(@OriginalArg(0) Object arg0) {
		return this.method30541((Class511) arg0, (byte) -95);
	}

	@OriginalMember(owner = "client!qm", name = "t", descriptor = "(Lclient!qm;B)I")
	int method30541(@OriginalArg(0) Class511 arg0, @OriginalArg(1) byte arg1) {
		if (this.aLong389 * 3128270234227994127L < arg0.aLong389 * 3128270234227994127L) {
			return -1;
		} else if (this.aLong389 * 3128270234227994127L > arg0.aLong389 * 3128270234227994127L) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qm", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class511)) {
			throw new IllegalArgumentException();
		}
		return this.anObject20.equals(((Class511) arg0).anObject20);
	}

	@OriginalMember(owner = "client!qm", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.anObject20.hashCode();
	}

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "(Ljava/lang/Object;)I")
	public int method30542(@OriginalArg(0) Object arg0) {
		return this.method30541((Class511) arg0, (byte) -73);
	}

	@OriginalMember(owner = "client!qm", name = "rn", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method30543(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class511)) {
			throw new IllegalArgumentException();
		}
		return this.anObject20.equals(((Class511) arg0).anObject20);
	}

	@OriginalMember(owner = "client!qm", name = "rs", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method30544(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class511)) {
			throw new IllegalArgumentException();
		}
		return this.anObject20.equals(((Class511) arg0).anObject20);
	}

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "(Lclient!qm;)I")
	int method30545(@OriginalArg(0) Class511 arg0) {
		if (this.aLong389 * 3128270234227994127L < arg0.aLong389 * 3128270234227994127L) {
			return -1;
		} else if (this.aLong389 * 3128270234227994127L > arg0.aLong389 * 3128270234227994127L) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "(Lclient!qm;)I")
	int method30546(@OriginalArg(0) Class511 arg0) {
		if (this.aLong389 * 3128270234227994127L < arg0.aLong389 * 3128270234227994127L) {
			return -1;
		} else if (this.aLong389 * 3128270234227994127L > arg0.aLong389 * 3128270234227994127L) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qm", name = "rm", descriptor = "()I")
	public int method30547() {
		return this.anObject20.hashCode();
	}

	@OriginalMember(owner = "client!qm", name = "u", descriptor = "(Lclient!qm;)I")
	int method30548(@OriginalArg(0) Class511 arg0) {
		if (this.aLong389 * 3128270234227994127L < arg0.aLong389 * 3128270234227994127L) {
			return -1;
		} else if (this.aLong389 * 3128270234227994127L > arg0.aLong389 * 3128270234227994127L) {
			return 1;
		} else {
			return 0;
		}
	}
}
