package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aje")
public final class Class93_Sub2 extends Class93 {

	@OriginalMember(owner = "client!aje", name = "z", descriptor = "[I")
	static int[] anIntArray165;

	@OriginalMember(owner = "client!aje", name = "l", descriptor = "Z")
	boolean aBoolean262;

	@OriginalMember(owner = "client!aje", name = "w", descriptor = "I")
	int anInt1402;

	@OriginalMember(owner = "client!aje", name = "k", descriptor = "I")
	final int anInt1403;

	@OriginalMember(owner = "client!aje", name = "f", descriptor = "I")
	final int anInt1401;

	@OriginalMember(owner = "client!aje", name = "u", descriptor = "[I")
	int[] anIntArray164;

	@OriginalMember(owner = "client!aje", name = "<init>", descriptor = "(III[IZ)V")
	Class93_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1403 = arg1;
		this.anInt1401 = arg2;
		this.anIntArray164 = arg3;
		if (arg4) {
			@Pc(16) int[] local16 = new int[this.anInt1401];
			@Pc(20) int[] local20 = new int[this.anInt1401];
			@Pc(24) int[] local24 = new int[this.anInt1401];
			@Pc(28) int[] local28 = new int[this.anInt1401];
			if (anIntArray165 == null || anIntArray165.length != this.anIntArray164.length) {
				anIntArray165 = new int[this.anIntArray164.length];
			}
			@Pc(44) int local44 = this.anInt1401;
			@Pc(47) int local47 = this.anInt1401;
			@Pc(51) int local51 = local44 - 1;
			@Pc(55) int local55 = local47 - 1;
			@Pc(59) int local59 = local44 * local47;
			@Pc(64) int local64;
			@Pc(65) int local65 = local64 = local44;
			@Pc(71) int local71;
			@Pc(67) int local67;
			for (local67 = 2; local67 >= 0; local67--) {
				for (local71 = local51; local71 >= 0; local71--) {
					local64--;
					@Pc(79) int local79 = this.anIntArray164[local64];
					local16[local71] += local79 >> 24 & 0xFF;
					local20[local71] += local79 >> 16 & 0xFF;
					local24[local71] += local79 >> 8 & 0xFF;
					local28[local71] += local79 & 0xFF;
				}
				if (local64 == 0) {
					local64 = local59;
				}
			}
			@Pc(131) int local131 = local59;
			for (@Pc(133) int local133 = local55; local133 >= 0; local133--) {
				@Pc(137) int local137 = 1;
				@Pc(139) int local139 = 1;
				@Pc(141) int local141 = 0;
				@Pc(143) int local143 = 0;
				@Pc(145) int local145 = 0;
				@Pc(147) int local147 = 0;
				for (local71 = 2; local71 >= 0; local71--) {
					local139--;
					local147 += local16[local139];
					local145 += local20[local139];
					local141 += local24[local139];
					local143 += local28[local139];
					if (local139 == 0) {
						local139 = local44;
					}
				}
				for (local71 = local51; local71 >= 0; local71--) {
					local139--;
					local137--;
					local67 = local147 / 9;
					@Pc(196) int local196 = local145 / 9;
					@Pc(200) int local200 = local141 / 9;
					@Pc(204) int local204 = local143 / 9;
					local131--;
					anIntArray165[local131] = local67 << 24 | local196 << 16 | local200 << 8 | local204;
					local147 += local16[local139] - local16[local137];
					local145 += local20[local139] - local20[local137];
					local143 += local28[local139] - local28[local137];
					local141 += local24[local139] - local24[local137];
					if (local139 == 0) {
						local139 = local44;
					}
					if (local137 == 0) {
						local137 = local44;
					}
				}
				for (local71 = local51; local71 >= 0; local71--) {
					local64--;
					@Pc(281) int local281 = this.anIntArray164[local64];
					local65--;
					@Pc(287) int local287 = this.anIntArray164[local65];
					local16[local71] += (local281 >> 24 & 0xFF) - (local287 >> 24 & 0xFF);
					local20[local71] += (local281 >> 16 & 0xFF) - (local287 >> 16 & 0xFF);
					local24[local71] += (local281 >> 8 & 0xFF) - (local287 >> 8 & 0xFF);
					local28[local71] += (local281 & 0xFF) - (local287 & 0xFF);
				}
				if (local64 == 0) {
					local64 = local59;
				}
				if (local65 == 0) {
					local65 = local59;
				}
			}
			@Pc(366) int[] local366 = this.anIntArray164;
			this.anIntArray164 = anIntArray165;
			anIntArray165 = local366;
		}
	}

	@OriginalMember(owner = "client!aje", name = "l", descriptor = "(II)V")
	void method11798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0 && arg1 == 0) {
			return;
		}
		if (anIntArray165 == null || anIntArray165.length != this.anIntArray164.length) {
			anIntArray165 = new int[this.anIntArray164.length];
		}
		@Pc(21) int local21 = this.anIntArray164.length;
		@Pc(23) int local23 = arg0;
		@Pc(28) int local28 = this.anInt1401 - 1;
		@Pc(33) int local33 = this.anInt1401 * arg1;
		@Pc(37) int local37 = local21 - 1;
		for (@Pc(39) int local39 = 0; local39 < local21; local39 += this.anInt1401) {
			@Pc(48) int local48 = local39 + local33 & local37;
			for (@Pc(50) int local50 = 0; local50 < this.anInt1401; local50++) {
				@Pc(58) int local58 = local39 + local50;
				@Pc(66) int local66 = local48 + (local50 + local23 & local28);
				anIntArray165[local58] = this.anIntArray164[local66];
			}
		}
		@Pc(84) int[] local84 = this.anIntArray164;
		this.anIntArray164 = anIntArray165;
		anIntArray165 = local84;
	}

	@OriginalMember(owner = "client!aje", name = "e", descriptor = "()[I")
	int[] method11799() {
		return this.anIntArray164;
	}

	@OriginalMember(owner = "client!aje", name = "n", descriptor = "(II)V")
	void method11800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0 && arg1 == 0) {
			return;
		}
		if (anIntArray165 == null || anIntArray165.length != this.anIntArray164.length) {
			anIntArray165 = new int[this.anIntArray164.length];
		}
		@Pc(21) int local21 = this.anIntArray164.length;
		@Pc(23) int local23 = arg0;
		@Pc(28) int local28 = this.anInt1401 - 1;
		@Pc(33) int local33 = this.anInt1401 * arg1;
		@Pc(37) int local37 = local21 - 1;
		for (@Pc(39) int local39 = 0; local39 < local21; local39 += this.anInt1401) {
			@Pc(48) int local48 = local39 + local33 & local37;
			for (@Pc(50) int local50 = 0; local50 < this.anInt1401; local50++) {
				@Pc(58) int local58 = local39 + local50;
				@Pc(66) int local66 = local48 + (local50 + local23 & local28);
				anIntArray165[local58] = this.anIntArray164[local66];
			}
		}
		@Pc(84) int[] local84 = this.anIntArray164;
		this.anIntArray164 = anIntArray165;
		anIntArray165 = local84;
	}

	@OriginalMember(owner = "client!aje", name = "w", descriptor = "(II)V")
	void method11801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0 && arg1 == 0) {
			return;
		}
		if (anIntArray165 == null || anIntArray165.length != this.anIntArray164.length) {
			anIntArray165 = new int[this.anIntArray164.length];
		}
		@Pc(21) int local21 = this.anIntArray164.length;
		@Pc(23) int local23 = arg0;
		@Pc(28) int local28 = this.anInt1401 - 1;
		@Pc(33) int local33 = this.anInt1401 * arg1;
		@Pc(37) int local37 = local21 - 1;
		for (@Pc(39) int local39 = 0; local39 < local21; local39 += this.anInt1401) {
			@Pc(48) int local48 = local39 + local33 & local37;
			for (@Pc(50) int local50 = 0; local50 < this.anInt1401; local50++) {
				@Pc(58) int local58 = local39 + local50;
				@Pc(66) int local66 = local48 + (local50 + local23 & local28);
				anIntArray165[local58] = this.anIntArray164[local66];
			}
		}
		@Pc(84) int[] local84 = this.anIntArray164;
		this.anIntArray164 = anIntArray165;
		anIntArray165 = local84;
	}

	@OriginalMember(owner = "client!aje", name = "m", descriptor = "()[I")
	int[] method11802() {
		return this.anIntArray164;
	}

	@OriginalMember(owner = "client!aje", name = "f", descriptor = "()[I")
	int[] method11803() {
		return this.anIntArray164;
	}

	@OriginalMember(owner = "client!aje", name = "k", descriptor = "()[I")
	int[] method11804() {
		return this.anIntArray164;
	}
}
