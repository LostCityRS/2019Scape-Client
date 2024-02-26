package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class349 {

	@OriginalMember(owner = "client!iu", name = "l", descriptor = "I")
	public static int anInt4254;

	@OriginalMember(owner = "client!iu", name = "t", descriptor = "[I")
	int[] anIntArray421;

	@OriginalMember(owner = "client!iu", name = "f", descriptor = "(Lclient!pf;Lclient!xl;IB)[B")
	static byte[] method27998(@OriginalArg(0) Class480 arg0, @OriginalArg(1) Class664 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		return arg1.method33353(314472044) > 1 ? arg0.method29918(arg1.method33356(arg2, (byte) 121), arg1.method33354(arg2, (byte) -8), 1896589581) : arg0.method29918(arg1.anInt5690 * -1975739137, arg2, 1896589581);
	}

	@OriginalMember(owner = "client!iu", name = "gm", descriptor = "(B)V")
	static void method27999(@OriginalArg(0) byte arg0) {
		Class332.method27799(Class279.aClass102_9, 1230605396);
		if (client.anInt3484 * -1803257749 != Class507.anInt5045 * -1170417853) {
			Class643.method33027(2003506049);
		}
	}

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "(I)Lclient!art;")
	static Class80_Sub1_Sub9 method28000(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub1_Sub9 local4 = (Class80_Sub1_Sub9) Class80_Sub1_Sub9.aClass3_11.method50((byte) -13);
		if (local4 != null) {
			local4.method24395((byte) 10);
			local4.method24406(-2147483640);
			return local4;
		}
		do {
			local4 = (Class80_Sub1_Sub9) Class80_Sub1_Sub9.aClass3_12.method50((byte) 60);
			if (local4 == null) {
				return null;
			}
			if (local4.method22096(-1853381875) > Class303.method27111((byte) 13)) {
				return null;
			}
			local4.method24395((byte) 84);
			local4.method24406(-2147483645);
		} while ((local4.aLong340 * 4203303297430504511L & Long.MIN_VALUE) == 0L);
		return local4;
	}

	@OriginalMember(owner = "client!iu", name = "arh", descriptor = "(Lclient!yp;I)V")
	static void method28001(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.anInt3450 * -1080683649;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.anInt3429 * 1838023237;
	}

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "([I)V")
	public Class349(@OriginalArg(0) int[] arg0) {
		@Pc(3) int local3;
		for (local3 = 1; local3 <= (arg0.length >> 1) + arg0.length; local3 <<= 0x1) {
		}
		this.anIntArray421 = new int[local3 + local3];
		@Pc(25) int local25;
		for (local25 = 0; local25 < local3 + local3; local25++) {
			this.anIntArray421[local25] = -1;
		}
		local25 = 0;
		while (local25 < arg0.length) {
			@Pc(51) int local51;
			for (local51 = arg0[local25] & local3 - 1; this.anIntArray421[local51 + 1 + local51] != -1; local51 = local51 + 1 & local3 - 1) {
			}
			this.anIntArray421[local51 + local51] = arg0[local25];
			this.anIntArray421[local51 + local51 + 1] = local25++;
		}
	}

	@OriginalMember(owner = "client!iu", name = "f", descriptor = "(I)I")
	public int method27992(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = (this.anIntArray421.length >> 1) - 1;
		@Pc(11) int local11 = arg0 & local7;
		while (true) {
			@Pc(20) int local20 = this.anIntArray421[local11 + local11 + 1];
			if (local20 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray421[local11 + local11]) {
				return local20;
			}
			local11 = local11 + 1 & local7;
		}
	}

	@OriginalMember(owner = "client!iu", name = "g", descriptor = "(I)I")
	public int method27993(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = (this.anIntArray421.length >> 1) - 1;
		@Pc(11) int local11 = arg0 & local7;
		while (true) {
			@Pc(20) int local20 = this.anIntArray421[local11 + local11 + 1];
			if (local20 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray421[local11 + local11]) {
				return local20;
			}
			local11 = local11 + 1 & local7;
		}
	}

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "(I)I")
	public int method27994(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = (this.anIntArray421.length >> 1) - 1;
		@Pc(11) int local11 = arg0 & local7;
		while (true) {
			@Pc(20) int local20 = this.anIntArray421[local11 + local11 + 1];
			if (local20 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray421[local11 + local11]) {
				return local20;
			}
			local11 = local11 + 1 & local7;
		}
	}

	@OriginalMember(owner = "client!iu", name = "t", descriptor = "(II)I")
	public int method27995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = (this.anIntArray421.length >> 1) - 1;
		@Pc(11) int local11 = arg0 & local7;
		while (true) {
			@Pc(20) int local20 = this.anIntArray421[local11 + local11 + 1];
			if (local20 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray421[local11 + local11]) {
				return local20;
			}
			local11 = local11 + 1 & local7;
		}
	}

	@OriginalMember(owner = "client!iu", name = "u", descriptor = "(I)I")
	public int method27996(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = (this.anIntArray421.length >> 1) - 1;
		@Pc(11) int local11 = arg0 & local7;
		while (true) {
			@Pc(20) int local20 = this.anIntArray421[local11 + local11 + 1];
			if (local20 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray421[local11 + local11]) {
				return local20;
			}
			local11 = local11 + 1 & local7;
		}
	}

	@OriginalMember(owner = "client!iu", name = "l", descriptor = "(I)I")
	public int method27997(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = (this.anIntArray421.length >> 1) - 1;
		@Pc(11) int local11 = arg0 & local7;
		while (true) {
			@Pc(20) int local20 = this.anIntArray421[local11 + local11 + 1];
			if (local20 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray421[local11 + local11]) {
				return local20;
			}
			local11 = local11 + 1 & local7;
		}
	}
}
