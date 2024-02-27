package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class289 {

	@OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
	int anInt3945;

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
	int anInt3946;

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
	int anInt3947;

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
	int anInt3948;

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
	int anInt3949;

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
	int anInt3950;

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "[I")
	int[] anIntArray373;

	@OriginalMember(owner = "client!gi", name = "u", descriptor = "[I")
	int[] anIntArray374;

	@OriginalMember(owner = "client!gi", name = "z", descriptor = "Lclient!hk;")
	Class315 aClass315_1;

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "[[I")
	int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
	Class289() {
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(Lclient!hk;)V")
	void method26644(@OriginalArg(0) Class315 arg0) {
		this.aClass315_1 = arg0;
		this.anInt3950 = this.aClass315_1.method27229(16);
		this.anInt3948 = this.aClass315_1.method27229(24);
		this.anInt3947 = this.aClass315_1.method27229(24);
		this.anInt3946 = this.aClass315_1.method27229(24) + 1;
		this.anInt3949 = this.aClass315_1.method27229(6) + 1;
		this.anInt3945 = this.aClass315_1.method27229(8);
		if (this.anIntArray374 == null || this.anIntArray374.length != this.anInt3949) {
			this.anIntArray374 = new int[this.anInt3949];
		}
		@Pc(58) int local58;
		for (local58 = 0; local58 < this.anInt3949; local58++) {
			@Pc(64) int local64 = 0;
			@Pc(69) int local69 = this.aClass315_1.method27229(3);
			@Pc(77) boolean local77 = this.aClass315_1.method27223() != 0;
			if (local77) {
				local64 = this.aClass315_1.method27229(5);
			}
			this.anIntArray374[local58] = local64 << 3 | local69;
		}
		if (this.anIntArray373 == null || this.anIntArray373.length != this.anInt3949 * 8) {
			this.anIntArray373 = new int[this.anInt3949 * 8];
		}
		for (local58 = 0; local58 < this.anInt3949 * 8; local58++) {
			this.anIntArray373[local58] = (this.anIntArray374[local58 >> 3] & 0x1 << (local58 & 0x7)) == 0 ? -1 : this.aClass315_1.method27229(8);
		}
	}

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "([I)V")
	void method26645(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "([Lclient!hb;I[Z)[Lclient!hb;")
	Class308[] method26646(@OriginalArg(0) Class308[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[] arg2) {
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
		local4 = this.aClass315_1.aClass324Array2[this.anInt3945].anInt4177;
		local13 = this.anInt3947 - this.anInt3948;
		@Pc(46) int local46 = local13 / this.anInt3946;
		@Pc(69) int local69;
		if (this.anIntArrayArray48 != null && this.anIntArrayArray48.length == local2 && this.anIntArrayArray48[0].length == local46) {
			for (local69 = 0; local69 < local2; local69++) {
				this.method26645(this.anIntArrayArray48[local69]);
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
							local111 = this.aClass315_1.aClass324Array2[this.anInt3945].method27377(this.aClass315_1);
							for (local115 = local4 - 1; local115 >= 0; local115--) {
								if (local87 + local115 < local46) {
									this.anIntArrayArray48[local94][local87 + local115] = local111 % this.anInt3949;
								}
								local111 /= this.anInt3949;
							}
						}
					}
				}
				for (local94 = 0; local94 < local4; local94++) {
					for (local111 = 0; local111 < local2; local111++) {
						if (!arg2[local111]) {
							local115 = this.anIntArrayArray48[local111][local87];
							@Pc(173) int local173 = this.anIntArray373[local115 * 8 + local69];
							if (local173 >= 0) {
								@Pc(183) int local183 = this.anInt3948 + local87 * this.anInt3946;
								@Pc(189) Class324 local189 = this.aClass315_1.aClass324Array2[local173];
								@Pc(198) int local198;
								if (this.anInt3950 == 0) {
									local198 = this.anInt3946 / local189.anInt4177;
									for (@Pc(200) int local200 = 0; local200 < local198; local200++) {
										@Pc(208) float[] local208 = local189.method27378(this.aClass315_1);
										for (@Pc(210) int local210 = 0; local210 < local189.anInt4177; local210++) {
											arg0[local111].aFloatArray103[local183 + local200 + local210 * local198] += local208[local210];
										}
									}
								} else if (this.anInt3950 == 1 || this.anInt3950 == 2) {
									local198 = 0;
									while (local198 < this.anInt3946) {
										@Pc(256) float[] local256 = local189.method27378(this.aClass315_1);
										for (@Pc(258) int local258 = 0; local258 < local189.anInt4177; local258++) {
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

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "(Lclient!hk;)V")
	void method26647(@OriginalArg(0) Class315 arg0) {
		this.aClass315_1 = arg0;
		this.anInt3950 = this.aClass315_1.method27229(16);
		this.anInt3948 = this.aClass315_1.method27229(24);
		this.anInt3947 = this.aClass315_1.method27229(24);
		this.anInt3946 = this.aClass315_1.method27229(24) + 1;
		this.anInt3949 = this.aClass315_1.method27229(6) + 1;
		this.anInt3945 = this.aClass315_1.method27229(8);
		if (this.anIntArray374 == null || this.anIntArray374.length != this.anInt3949) {
			this.anIntArray374 = new int[this.anInt3949];
		}
		@Pc(58) int local58;
		for (local58 = 0; local58 < this.anInt3949; local58++) {
			@Pc(64) int local64 = 0;
			@Pc(69) int local69 = this.aClass315_1.method27229(3);
			@Pc(77) boolean local77 = this.aClass315_1.method27223() != 0;
			if (local77) {
				local64 = this.aClass315_1.method27229(5);
			}
			this.anIntArray374[local58] = local64 << 3 | local69;
		}
		if (this.anIntArray373 == null || this.anIntArray373.length != this.anInt3949 * 8) {
			this.anIntArray373 = new int[this.anInt3949 * 8];
		}
		for (local58 = 0; local58 < this.anInt3949 * 8; local58++) {
			this.anIntArray373[local58] = (this.anIntArray374[local58 >> 3] & 0x1 << (local58 & 0x7)) == 0 ? -1 : this.aClass315_1.method27229(8);
		}
	}

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "([I)V")
	void method26648(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "w", descriptor = "([Lclient!hb;I[Z)[Lclient!hb;")
	Class308[] method26649(@OriginalArg(0) Class308[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[] arg2) {
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
		local4 = this.aClass315_1.aClass324Array2[this.anInt3945].anInt4177;
		local13 = this.anInt3947 - this.anInt3948;
		@Pc(46) int local46 = local13 / this.anInt3946;
		@Pc(69) int local69;
		if (this.anIntArrayArray48 != null && this.anIntArrayArray48.length == local2 && this.anIntArrayArray48[0].length == local46) {
			for (local69 = 0; local69 < local2; local69++) {
				this.method26645(this.anIntArrayArray48[local69]);
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
							local111 = this.aClass315_1.aClass324Array2[this.anInt3945].method27377(this.aClass315_1);
							for (local115 = local4 - 1; local115 >= 0; local115--) {
								if (local87 + local115 < local46) {
									this.anIntArrayArray48[local94][local87 + local115] = local111 % this.anInt3949;
								}
								local111 /= this.anInt3949;
							}
						}
					}
				}
				for (local94 = 0; local94 < local4; local94++) {
					for (local111 = 0; local111 < local2; local111++) {
						if (!arg2[local111]) {
							local115 = this.anIntArrayArray48[local111][local87];
							@Pc(173) int local173 = this.anIntArray373[local115 * 8 + local69];
							if (local173 >= 0) {
								@Pc(183) int local183 = this.anInt3948 + local87 * this.anInt3946;
								@Pc(189) Class324 local189 = this.aClass315_1.aClass324Array2[local173];
								@Pc(198) int local198;
								if (this.anInt3950 == 0) {
									local198 = this.anInt3946 / local189.anInt4177;
									for (@Pc(200) int local200 = 0; local200 < local198; local200++) {
										@Pc(208) float[] local208 = local189.method27378(this.aClass315_1);
										for (@Pc(210) int local210 = 0; local210 < local189.anInt4177; local210++) {
											arg0[local111].aFloatArray103[local183 + local200 + local210 * local198] += local208[local210];
										}
									}
								} else if (this.anInt3950 == 1 || this.anInt3950 == 2) {
									local198 = 0;
									while (local198 < this.anInt3946) {
										@Pc(256) float[] local256 = local189.method27378(this.aClass315_1);
										for (@Pc(258) int local258 = 0; local258 < local189.anInt4177; local258++) {
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
