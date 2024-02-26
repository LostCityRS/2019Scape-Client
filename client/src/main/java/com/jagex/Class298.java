package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class298 {

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
	int anInt3955;

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
	int anInt3956;

	@OriginalMember(owner = "client!gs", name = "m", descriptor = "[I")
	int[] anIntArray374;

	@OriginalMember(owner = "client!gs", name = "t", descriptor = "I")
	int anInt3957;

	@OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
	int anInt3958;

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
	int anInt3959;

	@OriginalMember(owner = "client!gs", name = "i", descriptor = "[I")
	int[] anIntArray375;

	@OriginalMember(owner = "client!gs", name = "u", descriptor = "I")
	int anInt3960;

	@OriginalMember(owner = "client!gs", name = "o", descriptor = "Lclient!ha;")
	Class307 aClass307_1;

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "[[I")
	int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
	Class298() {
	}

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "([Lclient!hw;I[Z)[Lclient!hw;")
	Class326[] method27007(@OriginalArg(0) Class326[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[] arg2) {
		@Pc(2) int local2 = arg0.length;
		@Pc(4) int local4;
		@Pc(13) int local13;
		for (local4 = 0; local4 < local2; local4++) {
			if (!arg2[local4]) {
				for (local13 = 0; local13 < arg1; local13++) {
					arg0[local4].aFloatArray104[local13] = 0.0F;
				}
			}
		}
		local4 = this.aClass307_1.aClass319Array1[this.anInt3959].anInt4027;
		local13 = this.anInt3956 - this.anInt3955;
		@Pc(46) int local46 = local13 / this.anInt3960;
		@Pc(69) int local69;
		if (this.anIntArrayArray48 != null && this.anIntArrayArray48.length == local2 && this.anIntArrayArray48[0].length == local46) {
			for (local69 = 0; local69 < local2; local69++) {
				this.method27019(this.anIntArrayArray48[local69]);
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
							local111 = this.aClass307_1.aClass319Array1[this.anInt3959].method27533(this.aClass307_1);
							for (local115 = local4 - 1; local115 >= 0; local115--) {
								if (local87 + local115 < local46) {
									this.anIntArrayArray48[local94][local87 + local115] = local111 % this.anInt3958;
								}
								local111 /= this.anInt3958;
							}
						}
					}
				}
				for (local94 = 0; local94 < local4; local94++) {
					for (local111 = 0; local111 < local2; local111++) {
						if (!arg2[local111]) {
							local115 = this.anIntArrayArray48[local111][local87];
							@Pc(173) int local173 = this.anIntArray375[local115 * 8 + local69];
							if (local173 >= 0) {
								@Pc(183) int local183 = this.anInt3955 + local87 * this.anInt3960;
								@Pc(189) Class319 local189 = this.aClass307_1.aClass319Array1[local173];
								@Pc(198) int local198;
								if (this.anInt3957 == 0) {
									local198 = this.anInt3960 / local189.anInt4027;
									for (@Pc(200) int local200 = 0; local200 < local198; local200++) {
										@Pc(208) float[] local208 = local189.method27534(this.aClass307_1);
										for (@Pc(210) int local210 = 0; local210 < local189.anInt4027; local210++) {
											arg0[local111].aFloatArray104[local183 + local200 + local210 * local198] += local208[local210];
										}
									}
								} else if (this.anInt3957 == 1 || this.anInt3957 == 2) {
									local198 = 0;
									while (local198 < this.anInt3960) {
										@Pc(256) float[] local256 = local189.method27534(this.aClass307_1);
										for (@Pc(258) int local258 = 0; local258 < local189.anInt4027; local258++) {
											arg0[local111].aFloatArray104[local183 + local198] += local256[local258];
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

	@OriginalMember(owner = "client!gs", name = "m", descriptor = "([I)V")
	void method27008(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gs", name = "l", descriptor = "(Lclient!ha;)V")
	void method27009(@OriginalArg(0) Class307 arg0) {
		this.aClass307_1 = arg0;
		this.anInt3957 = this.aClass307_1.method27324(16);
		this.anInt3955 = this.aClass307_1.method27324(24);
		this.anInt3956 = this.aClass307_1.method27324(24);
		this.anInt3960 = this.aClass307_1.method27324(24) + 1;
		this.anInt3958 = this.aClass307_1.method27324(6) + 1;
		this.anInt3959 = this.aClass307_1.method27324(8);
		if (this.anIntArray374 == null || this.anIntArray374.length != this.anInt3958) {
			this.anIntArray374 = new int[this.anInt3958];
		}
		@Pc(58) int local58;
		for (local58 = 0; local58 < this.anInt3958; local58++) {
			@Pc(64) int local64 = 0;
			@Pc(69) int local69 = this.aClass307_1.method27324(3);
			@Pc(77) boolean local77 = this.aClass307_1.method27352() != 0;
			if (local77) {
				local64 = this.aClass307_1.method27324(5);
			}
			this.anIntArray374[local58] = local64 << 3 | local69;
		}
		if (this.anIntArray375 == null || this.anIntArray375.length != this.anInt3958 * 8) {
			this.anIntArray375 = new int[this.anInt3958 * 8];
		}
		for (local58 = 0; local58 < this.anInt3958 * 8; local58++) {
			this.anIntArray375[local58] = (this.anIntArray374[local58 >> 3] & 0x1 << (local58 & 0x7)) == 0 ? -1 : this.aClass307_1.method27324(8);
		}
	}

	@OriginalMember(owner = "client!gs", name = "k", descriptor = "([Lclient!hw;I[Z)[Lclient!hw;")
	Class326[] method27010(@OriginalArg(0) Class326[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[] arg2) {
		@Pc(2) int local2 = arg0.length;
		@Pc(4) int local4;
		@Pc(13) int local13;
		for (local4 = 0; local4 < local2; local4++) {
			if (!arg2[local4]) {
				for (local13 = 0; local13 < arg1; local13++) {
					arg0[local4].aFloatArray104[local13] = 0.0F;
				}
			}
		}
		local4 = this.aClass307_1.aClass319Array1[this.anInt3959].anInt4027;
		local13 = this.anInt3956 - this.anInt3955;
		@Pc(46) int local46 = local13 / this.anInt3960;
		@Pc(69) int local69;
		if (this.anIntArrayArray48 != null && this.anIntArrayArray48.length == local2 && this.anIntArrayArray48[0].length == local46) {
			for (local69 = 0; local69 < local2; local69++) {
				this.method27019(this.anIntArrayArray48[local69]);
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
							local111 = this.aClass307_1.aClass319Array1[this.anInt3959].method27533(this.aClass307_1);
							for (local115 = local4 - 1; local115 >= 0; local115--) {
								if (local87 + local115 < local46) {
									this.anIntArrayArray48[local94][local87 + local115] = local111 % this.anInt3958;
								}
								local111 /= this.anInt3958;
							}
						}
					}
				}
				for (local94 = 0; local94 < local4; local94++) {
					for (local111 = 0; local111 < local2; local111++) {
						if (!arg2[local111]) {
							local115 = this.anIntArrayArray48[local111][local87];
							@Pc(173) int local173 = this.anIntArray375[local115 * 8 + local69];
							if (local173 >= 0) {
								@Pc(183) int local183 = this.anInt3955 + local87 * this.anInt3960;
								@Pc(189) Class319 local189 = this.aClass307_1.aClass319Array1[local173];
								@Pc(198) int local198;
								if (this.anInt3957 == 0) {
									local198 = this.anInt3960 / local189.anInt4027;
									for (@Pc(200) int local200 = 0; local200 < local198; local200++) {
										@Pc(208) float[] local208 = local189.method27534(this.aClass307_1);
										for (@Pc(210) int local210 = 0; local210 < local189.anInt4027; local210++) {
											arg0[local111].aFloatArray104[local183 + local200 + local210 * local198] += local208[local210];
										}
									}
								} else if (this.anInt3957 == 1 || this.anInt3957 == 2) {
									local198 = 0;
									while (local198 < this.anInt3960) {
										@Pc(256) float[] local256 = local189.method27534(this.aClass307_1);
										for (@Pc(258) int local258 = 0; local258 < local189.anInt4027; local258++) {
											arg0[local111].aFloatArray104[local183 + local198] += local256[local258];
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

	@OriginalMember(owner = "client!gs", name = "t", descriptor = "(Lclient!ha;)V")
	void method27011(@OriginalArg(0) Class307 arg0) {
		this.aClass307_1 = arg0;
		this.anInt3957 = this.aClass307_1.method27324(16);
		this.anInt3955 = this.aClass307_1.method27324(24);
		this.anInt3956 = this.aClass307_1.method27324(24);
		this.anInt3960 = this.aClass307_1.method27324(24) + 1;
		this.anInt3958 = this.aClass307_1.method27324(6) + 1;
		this.anInt3959 = this.aClass307_1.method27324(8);
		if (this.anIntArray374 == null || this.anIntArray374.length != this.anInt3958) {
			this.anIntArray374 = new int[this.anInt3958];
		}
		@Pc(58) int local58;
		for (local58 = 0; local58 < this.anInt3958; local58++) {
			@Pc(64) int local64 = 0;
			@Pc(69) int local69 = this.aClass307_1.method27324(3);
			@Pc(77) boolean local77 = this.aClass307_1.method27352() != 0;
			if (local77) {
				local64 = this.aClass307_1.method27324(5);
			}
			this.anIntArray374[local58] = local64 << 3 | local69;
		}
		if (this.anIntArray375 == null || this.anIntArray375.length != this.anInt3958 * 8) {
			this.anIntArray375 = new int[this.anInt3958 * 8];
		}
		for (local58 = 0; local58 < this.anInt3958 * 8; local58++) {
			this.anIntArray375[local58] = (this.anIntArray374[local58 >> 3] & 0x1 << (local58 & 0x7)) == 0 ? -1 : this.aClass307_1.method27324(8);
		}
	}

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "(Lclient!ha;)V")
	void method27012(@OriginalArg(0) Class307 arg0) {
		this.aClass307_1 = arg0;
		this.anInt3957 = this.aClass307_1.method27324(16);
		this.anInt3955 = this.aClass307_1.method27324(24);
		this.anInt3956 = this.aClass307_1.method27324(24);
		this.anInt3960 = this.aClass307_1.method27324(24) + 1;
		this.anInt3958 = this.aClass307_1.method27324(6) + 1;
		this.anInt3959 = this.aClass307_1.method27324(8);
		if (this.anIntArray374 == null || this.anIntArray374.length != this.anInt3958) {
			this.anIntArray374 = new int[this.anInt3958];
		}
		@Pc(58) int local58;
		for (local58 = 0; local58 < this.anInt3958; local58++) {
			@Pc(64) int local64 = 0;
			@Pc(69) int local69 = this.aClass307_1.method27324(3);
			@Pc(77) boolean local77 = this.aClass307_1.method27352() != 0;
			if (local77) {
				local64 = this.aClass307_1.method27324(5);
			}
			this.anIntArray374[local58] = local64 << 3 | local69;
		}
		if (this.anIntArray375 == null || this.anIntArray375.length != this.anInt3958 * 8) {
			this.anIntArray375 = new int[this.anInt3958 * 8];
		}
		for (local58 = 0; local58 < this.anInt3958 * 8; local58++) {
			this.anIntArray375[local58] = (this.anIntArray374[local58 >> 3] & 0x1 << (local58 & 0x7)) == 0 ? -1 : this.aClass307_1.method27324(8);
		}
	}

	@OriginalMember(owner = "client!gs", name = "i", descriptor = "([I)V")
	void method27013(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gs", name = "u", descriptor = "(Lclient!ha;)V")
	void method27014(@OriginalArg(0) Class307 arg0) {
		this.aClass307_1 = arg0;
		this.anInt3957 = this.aClass307_1.method27324(16);
		this.anInt3955 = this.aClass307_1.method27324(24);
		this.anInt3956 = this.aClass307_1.method27324(24);
		this.anInt3960 = this.aClass307_1.method27324(24) + 1;
		this.anInt3958 = this.aClass307_1.method27324(6) + 1;
		this.anInt3959 = this.aClass307_1.method27324(8);
		if (this.anIntArray374 == null || this.anIntArray374.length != this.anInt3958) {
			this.anIntArray374 = new int[this.anInt3958];
		}
		@Pc(58) int local58;
		for (local58 = 0; local58 < this.anInt3958; local58++) {
			@Pc(64) int local64 = 0;
			@Pc(69) int local69 = this.aClass307_1.method27324(3);
			@Pc(77) boolean local77 = this.aClass307_1.method27352() != 0;
			if (local77) {
				local64 = this.aClass307_1.method27324(5);
			}
			this.anIntArray374[local58] = local64 << 3 | local69;
		}
		if (this.anIntArray375 == null || this.anIntArray375.length != this.anInt3958 * 8) {
			this.anIntArray375 = new int[this.anInt3958 * 8];
		}
		for (local58 = 0; local58 < this.anInt3958 * 8; local58++) {
			this.anIntArray375[local58] = (this.anIntArray374[local58 >> 3] & 0x1 << (local58 & 0x7)) == 0 ? -1 : this.aClass307_1.method27324(8);
		}
	}

	@OriginalMember(owner = "client!gs", name = "o", descriptor = "([I)V")
	void method27015(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "([I)V")
	void method27016(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "([Lclient!hw;I[Z)[Lclient!hw;")
	Class326[] method27017(@OriginalArg(0) Class326[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[] arg2) {
		@Pc(2) int local2 = arg0.length;
		@Pc(4) int local4;
		@Pc(13) int local13;
		for (local4 = 0; local4 < local2; local4++) {
			if (!arg2[local4]) {
				for (local13 = 0; local13 < arg1; local13++) {
					arg0[local4].aFloatArray104[local13] = 0.0F;
				}
			}
		}
		local4 = this.aClass307_1.aClass319Array1[this.anInt3959].anInt4027;
		local13 = this.anInt3956 - this.anInt3955;
		@Pc(46) int local46 = local13 / this.anInt3960;
		@Pc(69) int local69;
		if (this.anIntArrayArray48 != null && this.anIntArrayArray48.length == local2 && this.anIntArrayArray48[0].length == local46) {
			for (local69 = 0; local69 < local2; local69++) {
				this.method27019(this.anIntArrayArray48[local69]);
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
							local111 = this.aClass307_1.aClass319Array1[this.anInt3959].method27533(this.aClass307_1);
							for (local115 = local4 - 1; local115 >= 0; local115--) {
								if (local87 + local115 < local46) {
									this.anIntArrayArray48[local94][local87 + local115] = local111 % this.anInt3958;
								}
								local111 /= this.anInt3958;
							}
						}
					}
				}
				for (local94 = 0; local94 < local4; local94++) {
					for (local111 = 0; local111 < local2; local111++) {
						if (!arg2[local111]) {
							local115 = this.anIntArrayArray48[local111][local87];
							@Pc(173) int local173 = this.anIntArray375[local115 * 8 + local69];
							if (local173 >= 0) {
								@Pc(183) int local183 = this.anInt3955 + local87 * this.anInt3960;
								@Pc(189) Class319 local189 = this.aClass307_1.aClass319Array1[local173];
								@Pc(198) int local198;
								if (this.anInt3957 == 0) {
									local198 = this.anInt3960 / local189.anInt4027;
									for (@Pc(200) int local200 = 0; local200 < local198; local200++) {
										@Pc(208) float[] local208 = local189.method27534(this.aClass307_1);
										for (@Pc(210) int local210 = 0; local210 < local189.anInt4027; local210++) {
											arg0[local111].aFloatArray104[local183 + local200 + local210 * local198] += local208[local210];
										}
									}
								} else if (this.anInt3957 == 1 || this.anInt3957 == 2) {
									local198 = 0;
									while (local198 < this.anInt3960) {
										@Pc(256) float[] local256 = local189.method27534(this.aClass307_1);
										for (@Pc(258) int local258 = 0; local258 < local189.anInt4027; local258++) {
											arg0[local111].aFloatArray104[local183 + local198] += local256[local258];
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

	@OriginalMember(owner = "client!gs", name = "s", descriptor = "([Lclient!hw;I[Z)[Lclient!hw;")
	Class326[] method27018(@OriginalArg(0) Class326[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[] arg2) {
		@Pc(2) int local2 = arg0.length;
		@Pc(4) int local4;
		@Pc(13) int local13;
		for (local4 = 0; local4 < local2; local4++) {
			if (!arg2[local4]) {
				for (local13 = 0; local13 < arg1; local13++) {
					arg0[local4].aFloatArray104[local13] = 0.0F;
				}
			}
		}
		local4 = this.aClass307_1.aClass319Array1[this.anInt3959].anInt4027;
		local13 = this.anInt3956 - this.anInt3955;
		@Pc(46) int local46 = local13 / this.anInt3960;
		@Pc(69) int local69;
		if (this.anIntArrayArray48 != null && this.anIntArrayArray48.length == local2 && this.anIntArrayArray48[0].length == local46) {
			for (local69 = 0; local69 < local2; local69++) {
				this.method27019(this.anIntArrayArray48[local69]);
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
							local111 = this.aClass307_1.aClass319Array1[this.anInt3959].method27533(this.aClass307_1);
							for (local115 = local4 - 1; local115 >= 0; local115--) {
								if (local87 + local115 < local46) {
									this.anIntArrayArray48[local94][local87 + local115] = local111 % this.anInt3958;
								}
								local111 /= this.anInt3958;
							}
						}
					}
				}
				for (local94 = 0; local94 < local4; local94++) {
					for (local111 = 0; local111 < local2; local111++) {
						if (!arg2[local111]) {
							local115 = this.anIntArrayArray48[local111][local87];
							@Pc(173) int local173 = this.anIntArray375[local115 * 8 + local69];
							if (local173 >= 0) {
								@Pc(183) int local183 = this.anInt3955 + local87 * this.anInt3960;
								@Pc(189) Class319 local189 = this.aClass307_1.aClass319Array1[local173];
								@Pc(198) int local198;
								if (this.anInt3957 == 0) {
									local198 = this.anInt3960 / local189.anInt4027;
									for (@Pc(200) int local200 = 0; local200 < local198; local200++) {
										@Pc(208) float[] local208 = local189.method27534(this.aClass307_1);
										for (@Pc(210) int local210 = 0; local210 < local189.anInt4027; local210++) {
											arg0[local111].aFloatArray104[local183 + local200 + local210 * local198] += local208[local210];
										}
									}
								} else if (this.anInt3957 == 1 || this.anInt3957 == 2) {
									local198 = 0;
									while (local198 < this.anInt3960) {
										@Pc(256) float[] local256 = local189.method27534(this.aClass307_1);
										for (@Pc(258) int local258 = 0; local258 < local189.anInt4027; local258++) {
											arg0[local111].aFloatArray104[local183 + local198] += local256[local258];
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

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "([I)V")
	void method27019(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}
}
