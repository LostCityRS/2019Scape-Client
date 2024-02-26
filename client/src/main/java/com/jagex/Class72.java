package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acx")
public abstract class Class72 {

	@OriginalMember(owner = "client!acx", name = "g", descriptor = "I")
	public static final int anInt2030 = 256;

	@OriginalMember(owner = "client!acx", name = "f", descriptor = "I")
	public static final int anInt2031 = 4;

	@OriginalMember(owner = "client!acx", name = "e", descriptor = "I")
	public static final int anInt2032 = 16;

	@OriginalMember(owner = "client!acx", name = "i", descriptor = "I")
	public static final int anInt2033 = 512;

	@OriginalMember(owner = "client!acx", name = "l", descriptor = "I")
	public static final int anInt2034 = 64;

	@OriginalMember(owner = "client!acx", name = "u", descriptor = "I")
	public static final int anInt2035 = 32;

	@OriginalMember(owner = "client!acx", name = "m", descriptor = "I")
	public static final int anInt2037 = 2048;

	@OriginalMember(owner = "client!acx", name = "o", descriptor = "I")
	public static final int anInt2038 = 4096;

	@OriginalMember(owner = "client!acx", name = "j", descriptor = "I")
	public static final int anInt2039 = 8192;

	@OriginalMember(owner = "client!acx", name = "a", descriptor = "I")
	public static final int anInt2040 = 16384;

	@OriginalMember(owner = "client!acx", name = "s", descriptor = "I")
	public static final int anInt2041 = 32768;

	@OriginalMember(owner = "client!acx", name = "t", descriptor = "I")
	public static final int anInt2046 = 2;

	@OriginalMember(owner = "client!acx", name = "h", descriptor = "I")
	protected int anInt2043;

	@OriginalMember(owner = "client!acx", name = "d", descriptor = "I")
	protected int anInt2048;

	@OriginalMember(owner = "client!acx", name = "z", descriptor = "I")
	protected int anInt2049;

	@OriginalMember(owner = "client!acx", name = "k", descriptor = "I")
	protected int anInt2042 = -1412183853;

	@OriginalMember(owner = "client!acx", name = "x", descriptor = "I")
	protected int anInt2036 = 367844341;

	@OriginalMember(owner = "client!acx", name = "w", descriptor = "I")
	protected int anInt2044 = 328441523;

	@OriginalMember(owner = "client!acx", name = "r", descriptor = "I")
	protected int anInt2045 = -111161763;

	@OriginalMember(owner = "client!acx", name = "q", descriptor = "I")
	protected int anInt2047 = -2077716845;

	@OriginalMember(owner = "client!acx", name = "arb", descriptor = "(Lclient!yp;B)V")
	static void method15575(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(27) String local27 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		@Pc(42) boolean local42 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1] == 1;
		Class469.method29739(local13, local27, local42, 65536);
	}

	@OriginalMember(owner = "client!acx", name = "<init>", descriptor = "()V")
	Class72() {
	}

	@OriginalMember(owner = "client!acx", name = "u", descriptor = "(B)I")
	public final int method15572(@OriginalArg(0) byte arg0) {
		return this.anInt2049 * -979866707;
	}

	@OriginalMember(owner = "client!acx", name = "l", descriptor = "()I")
	public final int method15573() {
		return this.anInt2049 * -979866707;
	}

	@OriginalMember(owner = "client!acx", name = "g", descriptor = "()I")
	public final int method15574() {
		return this.anInt2049 * -979866707;
	}
}
