package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public class Class289 {

	@OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
	int anInt3904;

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
	int anInt3905;

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
	int anInt3906;

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
	int anInt3907;

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
	int anInt3908;

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
	int anInt3909;

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "[I")
	int[] anIntArray371;

	@OriginalMember(owner = "client!gi", name = "u", descriptor = "[I")
	int[] anIntArray372;

	@OriginalMember(owner = "client!gi", name = "z", descriptor = "Lclient!hk;")
	Class315 aClass315_1;

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "[[I")
	int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V", line = 20)
	Class289() {
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(Lclient!hk;)V", line = 23)
	void method26551(@OriginalArg(0) Class315 arg0) {
		this.aClass315_1 = arg0;
		this.anInt3909 = this.aClass315_1.method27116(16);
		this.anInt3907 = this.aClass315_1.method27116(24);
		this.anInt3906 = this.aClass315_1.method27116(24);
		this.anInt3905 = this.aClass315_1.method27116(24) + 1;
		this.anInt3908 = this.aClass315_1.method27116(6) + 1;
		this.anInt3904 = this.aClass315_1.method27116(8);
		if (this.anIntArray372 == null || this.anIntArray372.length != this.anInt3908) {
			this.anIntArray372 = new int[this.anInt3908];
		}
		@Pc(58) int local58;
		for (local58 = 0; local58 < this.anInt3908; local58++) {
			@Pc(64) int local64 = 0;
			@Pc(69) int local69 = this.aClass315_1.method27116(3);
			@Pc(77) boolean local77 = this.aClass315_1.method27112() != 0;
			if (local77) {
				local64 = this.aClass315_1.method27116(5);
			}
			this.anIntArray372[local58] = local64 << 3 | local69;
		}
		if (this.anIntArray371 == null || this.anIntArray371.length != this.anInt3908 * 8) {
			this.anIntArray371 = new int[this.anInt3908 * 8];
		}
		for (local58 = 0; local58 < this.anInt3908 * 8; local58++) {
			this.anIntArray371[local58] = (this.anIntArray372[local58 >> 3] & 0x1 << (local58 & 0x7)) == 0 ? -1 : this.aClass315_1.method27116(8);
		}
	}

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "(Lclient!hk;)V", line = 23)
	void method26552(@OriginalArg(0) Class315 arg0) {
		this.aClass315_1 = arg0;
		this.anInt3909 = this.aClass315_1.method27116(16);
		this.anInt3907 = this.aClass315_1.method27116(24);
		this.anInt3906 = this.aClass315_1.method27116(24);
		this.anInt3905 = this.aClass315_1.method27116(24) + 1;
		this.anInt3908 = this.aClass315_1.method27116(6) + 1;
		this.anInt3904 = this.aClass315_1.method27116(8);
		if (this.anIntArray372 == null || this.anIntArray372.length != this.anInt3908) {
			this.anIntArray372 = new int[this.anInt3908];
		}
		@Pc(58) int local58;
		for (local58 = 0; local58 < this.anInt3908; local58++) {
			@Pc(64) int local64 = 0;
			@Pc(69) int local69 = this.aClass315_1.method27116(3);
			@Pc(77) boolean local77 = this.aClass315_1.method27112() != 0;
			if (local77) {
				local64 = this.aClass315_1.method27116(5);
			}
			this.anIntArray372[local58] = local64 << 3 | local69;
		}
		if (this.anIntArray371 == null || this.anIntArray371.length != this.anInt3908 * 8) {
			this.anIntArray371 = new int[this.anInt3908 * 8];
		}
		for (local58 = 0; local58 < this.anInt3908 * 8; local58++) {
			this.anIntArray371[local58] = (this.anIntArray372[local58 >> 3] & 0x1 << (local58 & 0x7)) == 0 ? -1 : this.aClass315_1.method27116(8);
		}
	}

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "([I)V", line = 49)
	void method26553(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "([I)V", line = 49)
	void method26554(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "([Lclient!hb;I[Z)[Lclient!hb;", line = 56)
	Class308[] method26555(@OriginalArg(0) Class308[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[] arg2) {
		@Pc(2) int local2 = arg0.length;
		@Pc(4) int local4;
		@Pc(13) int local13;
		for (local4 = 0; local4 < local2; local4++) {
			if (!arg2[local4]) {
				for (local13 = 0; local13 < arg1; local13++) {
					arg0[local4].aFloatArray103[local13] = 0.0F;
				}
			}
		}
		local4 = this.aClass315_1.aClass324Array2[this.anInt3904].anInt4136;
		local13 = this.anInt3906 - this.anInt3907;
		@Pc(46) int local46 = local13 / this.anInt3905;
		@Pc(69) int local69;
		if (this.anIntArrayArray48 != null && this.anIntArrayArray48.length == local2 && this.anIntArrayArray48[0].length == local46) {
			for (local69 = 0; local69 < local2; local69++) {
				this.method26553(this.anIntArrayArray48[local69]);
			}
		} else {
			this.anIntArrayArray48 = new int[local2][local46];
		}
		for (local69 = 0; local69 < 8; local69++) {
			@Pc(87) int local87 = 0;
			while (local87 < local46) {
				@Pc(94) int local94;
				@Pc(111) int local111;
				@Pc(115) int local115;
				if (local69 == 0) {
					for (local94 = 0; local94 < local2; local94++) {
						if (!arg2[local94]) {
							local111 = this.aClass315_1.aClass324Array2[this.anInt3904].method27291(this.aClass315_1);
							for (local115 = local4 - 1; local115 >= 0; local115--) {
								if (local87 + local115 < local46) {
									this.anIntArrayArray48[local94][local87 + local115] = local111 % this.anInt3908;
								}
								local111 /= this.anInt3908;
							}
						}
					}
				}
				for (local94 = 0; local94 < local4; local94++) {
					for (local111 = 0; local111 < local2; local111++) {
						if (!arg2[local111]) {
							local115 = this.anIntArrayArray48[local111][local87];
							@Pc(173) int local173 = this.anIntArray371[local115 * 8 + local69];
							if (local173 >= 0) {
								@Pc(183) int local183 = this.anInt3907 + local87 * this.anInt3905;
								@Pc(189) Class324 local189 = this.aClass315_1.aClass324Array2[local173];
								@Pc(198) int local198;
								if (this.anInt3909 == 0) {
									local198 = this.anInt3905 / local189.anInt4136;
									for (@Pc(200) int local200 = 0; local200 < local198; local200++) {
										@Pc(208) float[] local208 = local189.method27293(this.aClass315_1);
										for (@Pc(210) int local210 = 0; local210 < local189.anInt4136; local210++) {
											arg0[local111].aFloatArray103[local183 + local200 + local210 * local198] += local208[local210];
										}
									}
								} else if (this.anInt3909 == 1 || this.anInt3909 == 2) {
									local198 = 0;
									while (local198 < this.anInt3905) {
										@Pc(256) float[] local256 = local189.method27293(this.aClass315_1);
										for (@Pc(258) int local258 = 0; local258 < local189.anInt4136; local258++) {
											arg0[local111].aFloatArray103[local183 + local198] += local256[local258];
											local198++;
										}
									}
								}
							}
						}
					}
					local87++;
					if (local87 >= local46) {
						break;
					}
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!gi", name = "w", descriptor = "([Lclient!hb;I[Z)[Lclient!hb;", line = 56)
	Class308[] method26556(@OriginalArg(0) Class308[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[] arg2) {
		@Pc(2) int local2 = arg0.length;
		@Pc(4) int local4;
		@Pc(13) int local13;
		for (local4 = 0; local4 < local2; local4++) {
			if (!arg2[local4]) {
				for (local13 = 0; local13 < arg1; local13++) {
					arg0[local4].aFloatArray103[local13] = 0.0F;
				}
			}
		}
		local4 = this.aClass315_1.aClass324Array2[this.anInt3904].anInt4136;
		local13 = this.anInt3906 - this.anInt3907;
		@Pc(46) int local46 = local13 / this.anInt3905;
		@Pc(69) int local69;
		if (this.anIntArrayArray48 != null && this.anIntArrayArray48.length == local2 && this.anIntArrayArray48[0].length == local46) {
			for (local69 = 0; local69 < local2; local69++) {
				this.method26553(this.anIntArrayArray48[local69]);
			}
		} else {
			this.anIntArrayArray48 = new int[local2][local46];
		}
		for (local69 = 0; local69 < 8; local69++) {
			@Pc(87) int local87 = 0;
			while (local87 < local46) {
				@Pc(94) int local94;
				@Pc(111) int local111;
				@Pc(115) int local115;
				if (local69 == 0) {
					for (local94 = 0; local94 < local2; local94++) {
						if (!arg2[local94]) {
							local111 = this.aClass315_1.aClass324Array2[this.anInt3904].method27291(this.aClass315_1);
							for (local115 = local4 - 1; local115 >= 0; local115--) {
								if (local87 + local115 < local46) {
									this.anIntArrayArray48[local94][local87 + local115] = local111 % this.anInt3908;
								}
								local111 /= this.anInt3908;
							}
						}
					}
				}
				for (local94 = 0; local94 < local4; local94++) {
					for (local111 = 0; local111 < local2; local111++) {
						if (!arg2[local111]) {
							local115 = this.anIntArrayArray48[local111][local87];
							@Pc(173) int local173 = this.anIntArray371[local115 * 8 + local69];
							if (local173 >= 0) {
								@Pc(183) int local183 = this.anInt3907 + local87 * this.anInt3905;
								@Pc(189) Class324 local189 = this.aClass315_1.aClass324Array2[local173];
								@Pc(198) int local198;
								if (this.anInt3909 == 0) {
									local198 = this.anInt3905 / local189.anInt4136;
									for (@Pc(200) int local200 = 0; local200 < local198; local200++) {
										@Pc(208) float[] local208 = local189.method27293(this.aClass315_1);
										for (@Pc(210) int local210 = 0; local210 < local189.anInt4136; local210++) {
											arg0[local111].aFloatArray103[local183 + local200 + local210 * local198] += local208[local210];
										}
									}
								} else if (this.anInt3909 == 1 || this.anInt3909 == 2) {
									local198 = 0;
									while (local198 < this.anInt3905) {
										@Pc(256) float[] local256 = local189.method27293(this.aClass315_1);
										for (@Pc(258) int local258 = 0; local258 < local189.anInt4136; local258++) {
											arg0[local111].aFloatArray103[local183 + local198] += local256[local258];
											local198++;
										}
									}
								}
							}
						}
					}
					local87++;
					if (local87 >= local46) {
						break;
					}
				}
			}
		}
		return arg0;
	}
}
