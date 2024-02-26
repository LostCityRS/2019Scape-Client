package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apf")
public final class Class99_Sub3_Sub1 extends Class99_Sub3 {

	@OriginalMember(owner = "client!apf", name = "ah", descriptor = "[B")
	byte[] aByteArray47;

	@OriginalMember(owner = "client!apf", name = "af", descriptor = "[I")
	int[] anIntArray213;

	@OriginalMember(owner = "client!apf", name = "<init>", descriptor = "(Lclient!aff;[B[III)V")
	Class99_Sub3_Sub1(@OriginalArg(0) Class102_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg3, arg4);
		this.aByteArray47 = arg1;
		this.anIntArray213 = arg2;
	}

	@OriginalMember(owner = "client!apf", name = "cu", descriptor = "([I[III)V")
	@Override
	void method18309(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int[] local3 = this.aClass102_Sub2_10.anIntArray50;
		if (local3 == null) {
			return;
		}
		@Pc(12) int local12;
		@Pc(18) int local18;
		@Pc(28) int local28;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(34) int local34;
		@Pc(62) int local62;
		@Pc(67) int local67;
		@Pc(73) int local73;
		@Pc(121) byte local121;
		@Pc(198) int local198;
		if (anInt2568 == 0) {
			if (anInt2576 == 0) {
				local12 = anInt2565;
				while (local12 < 0) {
					local18 = local12 + arg3;
					if (local18 >= 0) {
						if (local18 >= arg0.length) {
							return;
						}
						local28 = anInt2567;
						local30 = anInt2574;
						local32 = anInt2575;
						local34 = anInt2563;
						if (local30 >= 0 && local32 >= 0 && local30 - (this.anInt2554 << 12) < 0 && local32 - (this.anInt2559 << 12) < 0) {
							local62 = arg0[local18] - arg2;
							local67 = -arg1[local18];
							local73 = local62 - (local28 - anInt2567);
							if (local73 > 0) {
								local28 += local73;
								local34 += local73;
								local30 += anInt2568 * local73;
								local32 += anInt2576 * local73;
							} else {
								local67 -= local73;
							}
							if (local34 < local67) {
								local34 = local67;
							}
							while (local34 < 0) {
								local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
								if (local121 == 0) {
									local28++;
								} else {
									local3[local28++] = this.anIntArray213[local121 & 0xFF];
								}
								local34++;
							}
						}
					}
					local12++;
					anInt2567 += anInt2566;
				}
			} else if (anInt2576 < 0) {
				local12 = anInt2565;
				while (local12 < 0) {
					local18 = local12 + arg3;
					if (local18 >= 0) {
						if (local18 >= arg0.length) {
							return;
						}
						local28 = anInt2567;
						local30 = anInt2574;
						local32 = anInt2575 + anInt2577;
						local34 = anInt2563;
						if (local30 >= 0 && local30 - (this.anInt2554 << 12) < 0) {
							@Pc(191) int local191;
							if ((local191 = local32 - (this.anInt2559 << 12)) >= 0) {
								local198 = (anInt2576 - local191) / anInt2576;
								local34 += local198;
								local32 += anInt2576 * local198;
								local28 += local198;
							}
							@Pc(219) int local219;
							if ((local219 = (local32 - anInt2576) / anInt2576) > local34) {
								local34 = local219;
							}
							local62 = arg0[local18] - arg2;
							local67 = -arg1[local18];
							local73 = local62 - (local28 - anInt2567);
							if (local73 > 0) {
								local28 += local73;
								local34 += local73;
								local30 += anInt2568 * local73;
								local32 += anInt2576 * local73;
							} else {
								local67 -= local73;
							}
							if (local34 < local67) {
								local34 = local67;
							}
							while (local34 < 0) {
								local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
								if (local121 == 0) {
									local28++;
								} else {
									local3[local28++] = this.anIntArray213[local121 & 0xFF];
								}
								local32 += anInt2576;
								local34++;
							}
						}
					}
					local12++;
					anInt2574 += anInt2570;
					anInt2567 += anInt2566;
				}
			} else {
				local12 = anInt2565;
				while (local12 < 0) {
					local18 = local12 + arg3;
					if (local18 >= 0) {
						if (local18 >= arg0.length) {
							return;
						}
						local28 = anInt2567;
						local30 = anInt2574;
						local32 = anInt2575 + anInt2577;
						local34 = anInt2563;
						if (local30 >= 0 && local30 - (this.anInt2554 << 12) < 0) {
							if (local32 < 0) {
								local198 = (anInt2576 - 1 - local32) / anInt2576;
								local34 += local198;
								local32 += anInt2576 * local198;
								local28 += local198;
							}
							@Pc(394) int local394;
							if ((local394 = (local32 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local34) {
								local34 = local394;
							}
							local62 = arg0[local18] - arg2;
							local67 = -arg1[local18];
							local73 = local62 - (local28 - anInt2567);
							if (local73 > 0) {
								local28 += local73;
								local34 += local73;
								local30 += anInt2568 * local73;
								local32 += anInt2576 * local73;
							} else {
								local67 -= local73;
							}
							if (local34 < local67) {
								local34 = local67;
							}
							while (local34 < 0) {
								local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
								if (local121 == 0) {
									local28++;
								} else {
									local3[local28++] = this.anIntArray213[local121 & 0xFF];
								}
								local32 += anInt2576;
								local34++;
							}
						}
					}
					local12++;
					anInt2574 += anInt2570;
					anInt2567 += anInt2566;
				}
			}
		} else if (anInt2568 < 0) {
			if (anInt2576 == 0) {
				local12 = anInt2565;
				while (local12 < 0) {
					local18 = local12 + arg3;
					if (local18 >= 0) {
						if (local18 >= arg0.length) {
							return;
						}
						local28 = anInt2567;
						local30 = anInt2574 + anInt2579;
						local32 = anInt2575;
						local34 = anInt2563;
						if (local32 >= 0 && local32 - (this.anInt2559 << 12) < 0) {
							@Pc(543) int local543;
							if ((local543 = local30 - (this.anInt2554 << 12)) >= 0) {
								local198 = (anInt2568 - local543) / anInt2568;
								local34 += local198;
								local30 += anInt2568 * local198;
								local28 += local198;
							}
							@Pc(571) int local571;
							if ((local571 = (local30 - anInt2568) / anInt2568) > local34) {
								local34 = local571;
							}
							local62 = arg0[local18] - arg2;
							local67 = -arg1[local18];
							local73 = local62 - (local28 - anInt2567);
							if (local73 > 0) {
								local28 += local73;
								local34 += local73;
								local30 += anInt2568 * local73;
								local32 += anInt2576 * local73;
							} else {
								local67 -= local73;
							}
							if (local34 < local67) {
								local34 = local67;
							}
							while (local34 < 0) {
								local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
								if (local121 == 0) {
									local28++;
								} else {
									local3[local28++] = this.anIntArray213[local121 & 0xFF];
								}
								local30 += anInt2568;
								local34++;
							}
						}
					}
					local12++;
					anInt2575 += anInt2560;
					anInt2567 += anInt2566;
				}
			} else if (anInt2576 < 0) {
				local12 = anInt2565;
				while (local12 < 0) {
					local18 = local12 + arg3;
					if (local18 >= 0) {
						if (local18 >= arg0.length) {
							return;
						}
						local28 = anInt2567;
						local30 = anInt2574 + anInt2579;
						local32 = anInt2575 + anInt2577;
						local34 = anInt2563;
						@Pc(709) int local709;
						if ((local709 = local30 - (this.anInt2554 << 12)) >= 0) {
							local198 = (anInt2568 - local709) / anInt2568;
							local34 += local198;
							local30 += anInt2568 * local198;
							local32 += anInt2576 * local198;
							local28 += local198;
						}
						@Pc(743) int local743;
						if ((local743 = (local30 - anInt2568) / anInt2568) > local34) {
							local34 = local743;
						}
						@Pc(755) int local755;
						if ((local755 = local32 - (this.anInt2559 << 12)) >= 0) {
							local198 = (anInt2576 - local755) / anInt2576;
							local34 += local198;
							local30 += anInt2568 * local198;
							local32 += anInt2576 * local198;
							local28 += local198;
						}
						@Pc(789) int local789;
						if ((local789 = (local32 - anInt2576) / anInt2576) > local34) {
							local34 = local789;
						}
						local62 = arg0[local18] - arg2;
						local67 = -arg1[local18];
						local73 = local62 - (local28 - anInt2567);
						if (local73 > 0) {
							local28 += local73;
							local34 += local73;
							local30 += anInt2568 * local73;
							local32 += anInt2576 * local73;
						} else {
							local67 -= local73;
						}
						if (local34 < local67) {
							local34 = local67;
						}
						while (local34 < 0) {
							local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
							if (local121 == 0) {
								local28++;
							} else {
								local3[local28++] = this.anIntArray213[local121 & 0xFF];
							}
							local30 += anInt2568;
							local32 += anInt2576;
							local34++;
						}
					}
					local12++;
					anInt2574 += anInt2570;
					anInt2575 += anInt2560;
					anInt2567 += anInt2566;
				}
			} else {
				local12 = anInt2565;
				while (local12 < 0) {
					local18 = local12 + arg3;
					if (local18 >= 0) {
						if (local18 >= arg0.length) {
							return;
						}
						local28 = anInt2567;
						local30 = anInt2574 + anInt2579;
						local32 = anInt2575 + anInt2577;
						local34 = anInt2563;
						@Pc(933) int local933;
						if ((local933 = local30 - (this.anInt2554 << 12)) >= 0) {
							local198 = (anInt2568 - local933) / anInt2568;
							local34 += local198;
							local30 += anInt2568 * local198;
							local32 += anInt2576 * local198;
							local28 += local198;
						}
						@Pc(967) int local967;
						if ((local967 = (local30 - anInt2568) / anInt2568) > local34) {
							local34 = local967;
						}
						if (local32 < 0) {
							local198 = (anInt2576 - 1 - local32) / anInt2576;
							local34 += local198;
							local30 += anInt2568 * local198;
							local32 += anInt2576 * local198;
							local28 += local198;
						}
						@Pc(1015) int local1015;
						if ((local1015 = (local32 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local34) {
							local34 = local1015;
						}
						local62 = arg0[local18] - arg2;
						local67 = -arg1[local18];
						local73 = local62 - (local28 - anInt2567);
						if (local73 > 0) {
							local28 += local73;
							local34 += local73;
							local30 += anInt2568 * local73;
							local32 += anInt2576 * local73;
						} else {
							local67 -= local73;
						}
						if (local34 < local67) {
							local34 = local67;
						}
						while (local34 < 0) {
							local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
							if (local121 == 0) {
								local28++;
							} else {
								local3[local28++] = this.anIntArray213[local121 & 0xFF];
							}
							local30 += anInt2568;
							local32 += anInt2576;
							local34++;
						}
					}
					local12++;
					anInt2574 += anInt2570;
					anInt2575 += anInt2560;
					anInt2567 += anInt2566;
				}
			}
		} else if (anInt2576 == 0) {
			local12 = anInt2565;
			while (local12 < 0) {
				local18 = local12 + arg3;
				if (local18 >= 0) {
					if (local18 >= arg0.length) {
						return;
					}
					local28 = anInt2567;
					local30 = anInt2574 + anInt2579;
					local32 = anInt2575;
					local34 = anInt2563;
					if (local32 >= 0 && local32 - (this.anInt2559 << 12) < 0) {
						if (local30 < 0) {
							local198 = (anInt2568 - 1 - local30) / anInt2568;
							local34 += local198;
							local30 += anInt2568 * local198;
							local28 += local198;
						}
						@Pc(1200) int local1200;
						if ((local1200 = (local30 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local34) {
							local34 = local1200;
						}
						local62 = arg0[local18] - arg2;
						local67 = -arg1[local18];
						local73 = local62 - (local28 - anInt2567);
						if (local73 > 0) {
							local28 += local73;
							local34 += local73;
							local30 += anInt2568 * local73;
							local32 += anInt2576 * local73;
						} else {
							local67 -= local73;
						}
						if (local34 < local67) {
							local34 = local67;
						}
						while (local34 < 0) {
							local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
							if (local121 == 0) {
								local28++;
							} else {
								local3[local28++] = this.anIntArray213[local121 & 0xFF];
							}
							local30 += anInt2568;
							local34++;
						}
					}
				}
				local12++;
				anInt2574 += anInt2570;
				anInt2575 += anInt2560;
				anInt2567 += anInt2566;
			}
		} else if (anInt2576 < 0) {
			local12 = anInt2565;
			while (local12 < 0) {
				local18 = local12 + arg3;
				if (local18 >= 0) {
					if (local18 >= arg0.length) {
						return;
					}
					local28 = anInt2567;
					local30 = anInt2574 + anInt2579;
					local32 = anInt2575 + anInt2577;
					local34 = anInt2563;
					if (local30 < 0) {
						local198 = (anInt2568 - 1 - local30) / anInt2568;
						local34 += local198;
						local30 += anInt2568 * local198;
						local32 += anInt2576 * local198;
						local28 += local198;
					}
					@Pc(1378) int local1378;
					if ((local1378 = (local30 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local34) {
						local34 = local1378;
					}
					@Pc(1390) int local1390;
					if ((local1390 = local32 - (this.anInt2559 << 12)) >= 0) {
						local198 = (anInt2576 - local1390) / anInt2576;
						local34 += local198;
						local30 += anInt2568 * local198;
						local32 += anInt2576 * local198;
						local28 += local198;
					}
					@Pc(1424) int local1424;
					if ((local1424 = (local32 - anInt2576) / anInt2576) > local34) {
						local34 = local1424;
					}
					local62 = arg0[local18] - arg2;
					local67 = -arg1[local18];
					local73 = local62 - (local28 - anInt2567);
					if (local73 > 0) {
						local28 += local73;
						local34 += local73;
						local30 += anInt2568 * local73;
						local32 += anInt2576 * local73;
					} else {
						local67 -= local73;
					}
					if (local34 < local67) {
						local34 = local67;
					}
					while (local34 < 0) {
						local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
						if (local121 == 0) {
							local28++;
						} else {
							local3[local28++] = this.anIntArray213[local121 & 0xFF];
						}
						local30 += anInt2568;
						local32 += anInt2576;
						local34++;
					}
				}
				local12++;
				anInt2574 += anInt2570;
				anInt2575 += anInt2560;
				anInt2567 += anInt2566;
			}
		} else {
			local12 = anInt2565;
			while (local12 < 0) {
				local18 = local12 + arg3;
				if (local18 >= 0) {
					if (local18 >= arg0.length) {
						return;
					}
					local28 = anInt2567;
					local30 = anInt2574 + anInt2579;
					local32 = anInt2575 + anInt2577;
					local34 = anInt2563;
					if (local30 < 0) {
						local198 = (anInt2568 - 1 - local30) / anInt2568;
						local34 += local198;
						local30 += anInt2568 * local198;
						local32 += anInt2576 * local198;
						local28 += local198;
					}
					@Pc(1604) int local1604;
					if ((local1604 = (local30 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local34) {
						local34 = local1604;
					}
					if (local32 < 0) {
						local198 = (anInt2576 - 1 - local32) / anInt2576;
						local34 += local198;
						local30 += anInt2568 * local198;
						local32 += anInt2576 * local198;
						local28 += local198;
					}
					@Pc(1652) int local1652;
					if ((local1652 = (local32 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local34) {
						local34 = local1652;
					}
					local62 = arg0[local18] - arg2;
					local67 = -arg1[local18];
					local73 = local62 - (local28 - anInt2567);
					if (local73 > 0) {
						local28 += local73;
						local34 += local73;
						local30 += anInt2568 * local73;
						local32 += anInt2576 * local73;
					} else {
						local67 -= local73;
					}
					if (local34 < local67) {
						local34 = local67;
					}
					while (local34 < 0) {
						local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
						if (local121 == 0) {
							local28++;
						} else {
							local3[local28++] = this.anIntArray213[local121 & 0xFF];
						}
						local30 += anInt2568;
						local32 += anInt2576;
						local34++;
					}
				}
				local12++;
				anInt2574 += anInt2570;
				anInt2575 += anInt2560;
				anInt2567 += anInt2566;
			}
		}
	}

	@OriginalMember(owner = "client!apf", name = "m", descriptor = "(IIII[III)V")
	@Override
	public void method18221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!apf", name = "o", descriptor = "(IIII[I[III)V")
	@Override
	public void method18222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!apf", name = "aa", descriptor = "(IIIIIIII)V")
	@Override
	void method18257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass102_Sub2_10.method5094()) {
			throw new IllegalStateException();
		} else if (arg2 > 0 && arg3 > 0) {
			@Pc(16) int[] local16 = this.aClass102_Sub2_10.anIntArray50;
			if (local16 != null) {
				@Pc(21) int local21 = 0;
				@Pc(23) int local23 = 0;
				@Pc(29) int local29 = this.aClass102_Sub2_10.anInt638 * 513500097;
				@Pc(38) int local38 = this.anInt2555 + this.anInt2554 + this.anInt2557;
				@Pc(47) int local47 = this.anInt2556 + this.anInt2559 + this.anInt2571;
				@Pc(53) int local53 = (local38 << 16) / arg2;
				@Pc(59) int local59 = (local47 << 16) / arg3;
				@Pc(73) int local73;
				if (this.anInt2555 > 0) {
					local73 = ((this.anInt2555 << 16) + local53 - 1) / local53;
					arg0 += local73;
					local21 += local73 * local53 - (this.anInt2555 << 16);
				}
				if (this.anInt2556 > 0) {
					local73 = ((this.anInt2556 << 16) + local59 - 1) / local59;
					arg1 += local73;
					local23 += local73 * local59 - (this.anInt2556 << 16);
				}
				if (this.anInt2554 < local38) {
					arg2 = ((this.anInt2554 << 16) - local21 + local53 - 1) / local53;
				}
				if (this.anInt2559 < local47) {
					arg3 = ((this.anInt2559 << 16) - local23 + local59 - 1) / local59;
				}
				local73 = arg0 + arg1 * local29;
				@Pc(161) int local161 = local29 - arg2;
				if (arg1 + arg3 > this.aClass102_Sub2_10.anInt639 * 725126603) {
					arg3 -= arg1 + arg3 - this.aClass102_Sub2_10.anInt639 * 725126603;
				}
				@Pc(197) int local197;
				if (arg1 < this.aClass102_Sub2_10.anInt645 * -1878420243) {
					local197 = this.aClass102_Sub2_10.anInt645 * -1878420243 - arg1;
					arg3 -= local197;
					local73 += local197 * local29;
					local23 += local59 * local197;
				}
				if (arg0 + arg2 > this.aClass102_Sub2_10.anInt634 * 469139509) {
					local197 = arg0 + arg2 - this.aClass102_Sub2_10.anInt634 * 469139509;
					arg2 -= local197;
					local161 += local197;
				}
				if (arg0 < this.aClass102_Sub2_10.anInt637 * 531468375) {
					local197 = this.aClass102_Sub2_10.anInt637 * 531468375 - arg0;
					arg2 -= local197;
					local73 += local197;
					local21 += local53 * local197;
					local161 += local197;
				}
				@Pc(283) int local283;
				@Pc(292) int local292;
				@Pc(295) int local295;
				@Pc(356) int local356;
				@Pc(365) int local365;
				@Pc(368) int local368;
				@Pc(384) int local384;
				@Pc(392) int local392;
				@Pc(400) int local400;
				@Pc(408) int local408;
				@Pc(565) int local565;
				@Pc(469) byte local469;
				if (arg6 != 0) {
					@Pc(895) int local895;
					@Pc(903) int local903;
					@Pc(911) int local911;
					@Pc(923) int local923;
					@Pc(1219) byte local1219;
					if (arg6 != 1) {
						if (arg6 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg4 == 1) {
							local197 = local21;
							for (local283 = -arg3; local283 < 0; local283++) {
								local292 = (local23 >> 16) * this.anInt2554;
								for (local295 = -arg2; local295 < 0; local295++) {
									local469 = this.aByteArray47[(local21 >> 16) + local292];
									if (local469 == 0) {
										local73++;
									} else {
										local365 = this.anIntArray213[local469 & 0xFF];
										local368 = local16[local73];
										local384 = local365 + local368;
										local392 = (local365 & 0xFF00FF) + (local368 & 0xFF00FF);
										local368 = (local392 & 0x1000100) + (local384 - local392 & 0x10000);
										local16[local73++] = local384 - local368 | local368 - (local368 >>> 8);
									}
									local21 += local53;
								}
								local23 += local59;
								local21 = local197;
								local73 += local161;
							}
						} else if (arg4 == 0) {
							local197 = local21;
							local283 = arg5 >> 16 & 0xFF;
							local292 = arg5 >> 8 & 0xFF;
							local295 = arg5 & 0xFF;
							for (local356 = -arg3; local356 < 0; local356++) {
								local365 = (local23 >> 16) * this.anInt2554;
								for (local368 = -arg2; local368 < 0; local368++) {
									@Pc(1429) byte local1429 = this.aByteArray47[(local21 >> 16) + local365];
									if (local1429 == 0) {
										local73++;
									} else {
										local392 = this.anIntArray213[local1429 & 0xFF];
										local400 = (local392 & 0xFF0000) * local283 & 0xFF000000;
										local408 = (local392 & 0xFF00) * local292 & 0xFF0000;
										local895 = (local392 & 0xFF) * local295 & 0xFF00;
										local392 = (local400 | local408 | local895) >>> 8;
										local903 = local16[local73];
										local911 = local392 + local903;
										local923 = (local392 & 0xFF00FF) + (local903 & 0xFF00FF);
										local903 = (local923 & 0x1000100) + (local911 - local923 & 0x10000);
										local16[local73++] = local911 - local903 | local903 - (local903 >>> 8);
									}
									local21 += local53;
								}
								local23 += local59;
								local21 = local197;
								local73 += local161;
							}
						} else if (arg4 == 3) {
							local197 = local21;
							for (local283 = -arg3; local283 < 0; local283++) {
								local292 = (local23 >> 16) * this.anInt2554;
								for (local295 = -arg2; local295 < 0; local295++) {
									local469 = this.aByteArray47[(local21 >> 16) + local292];
									local365 = local469 > 0 ? this.anIntArray213[local469] : 0;
									local368 = local365 + arg5;
									local384 = (local365 & 0xFF00FF) + (arg5 & 0xFF00FF);
									local392 = (local384 & 0x1000100) + (local368 - local384 & 0x10000);
									local365 = local368 - local392 | local392 - (local392 >>> 8);
									local392 = local16[local73];
									local368 = local365 + local392;
									local384 = (local365 & 0xFF00FF) + (local392 & 0xFF00FF);
									local392 = (local384 & 0x1000100) + (local368 - local384 & 0x10000);
									local16[local73++] = local368 - local392 | local392 - (local392 >>> 8);
									local21 += local53;
								}
								local23 += local59;
								local21 = local197;
								local73 += local161;
							}
						} else if (arg4 == 2) {
							local197 = arg5 >>> 24;
							local283 = 256 - local197;
							local292 = (arg5 & 0xFF00FF) * local283 & 0xFF00FF00;
							local295 = (arg5 & 0xFF00) * local283 & 0xFF0000;
							local565 = (local292 | local295) >>> 8;
							local356 = local21;
							for (local365 = -arg3; local365 < 0; local365++) {
								local368 = (local23 >> 16) * this.anInt2554;
								for (local384 = -arg2; local384 < 0; local384++) {
									local1219 = this.aByteArray47[(local21 >> 16) + local368];
									if (local1219 == 0) {
										local73++;
									} else {
										local400 = this.anIntArray213[local1219 & 0xFF];
										local292 = (local400 & 0xFF00FF) * local197 & 0xFF00FF00;
										local295 = (local400 & 0xFF00) * local197 & 0xFF0000;
										local400 = ((local292 | local295) >>> 8) + local565;
										local408 = local16[local73];
										local895 = local400 + local408;
										local903 = (local400 & 0xFF00FF) + (local408 & 0xFF00FF);
										local408 = (local903 & 0x1000100) + (local895 - local903 & 0x10000);
										local16[local73++] = local895 - local408 | local408 - (local408 >>> 8);
									}
									local21 += local53;
								}
								local23 += local59;
								local21 = local356;
								local73 += local161;
							}
						} else {
							throw new IllegalArgumentException();
						}
					} else if (arg4 == 1) {
						local197 = local21;
						for (local283 = -arg3; local283 < 0; local283++) {
							local292 = (local23 >> 16) * this.anInt2554;
							for (local295 = -arg2; local295 < 0; local295++) {
								local469 = this.aByteArray47[(local21 >> 16) + local292];
								if (local469 == 0) {
									local73++;
								} else {
									local16[local73++] = this.anIntArray213[local469 & 0xFF];
								}
								local21 += local53;
							}
							local23 += local59;
							local21 = local197;
							local73 += local161;
						}
					} else {
						@Pc(758) byte local758;
						if (arg4 == 0) {
							local197 = local21;
							if ((arg5 & 0xFFFFFF) == 16777215) {
								local283 = arg5 >>> 24;
								local292 = 256 - local283;
								for (local295 = -arg3; local295 < 0; local295++) {
									local356 = (local23 >> 16) * this.anInt2554;
									for (local365 = -arg2; local365 < 0; local365++) {
										local758 = this.aByteArray47[(local21 >> 16) + local356];
										if (local758 == 0) {
											local73++;
										} else {
											local384 = this.anIntArray213[local758 & 0xFF];
											local392 = local16[local73];
											local16[local73++] = ((local384 & 0xFF00FF) * local283 + (local392 & 0xFF00FF) * local292 & 0xFF00FF00) + ((local384 & 0xFF00) * local283 + (local392 & 0xFF00) * local292 & 0xFF0000) >> 8;
										}
										local21 += local53;
									}
									local23 += local59;
									local21 = local197;
									local73 += local161;
								}
							} else {
								local283 = arg5 >> 16 & 0xFF;
								local292 = arg5 >> 8 & 0xFF;
								local295 = arg5 & 0xFF;
								local356 = arg5 >>> 24;
								local365 = 256 - local356;
								for (local368 = -arg3; local368 < 0; local368++) {
									local384 = (local23 >> 16) * this.anInt2554;
									for (local392 = -arg2; local392 < 0; local392++) {
										@Pc(875) byte local875 = this.aByteArray47[(local21 >> 16) + local384];
										if (local875 == 0) {
											local73++;
										} else {
											local408 = this.anIntArray213[local875 & 0xFF];
											if (local356 == 255) {
												local895 = (local408 & 0xFF0000) * local283 & 0xFF000000;
												local903 = (local408 & 0xFF00) * local292 & 0xFF0000;
												local911 = (local408 & 0xFF) * local295 & 0xFF00;
												local16[local73++] = (local895 | local903 | local911) >>> 8;
											} else {
												local895 = (local408 & 0xFF0000) * local283 & 0xFF000000;
												local903 = (local408 & 0xFF00) * local292 & 0xFF0000;
												local911 = (local408 & 0xFF) * local295 & 0xFF00;
												local408 = (local895 | local903 | local911) >>> 8;
												local923 = local16[local73];
												local16[local73++] = ((local408 & 0xFF00FF) * local356 + (local923 & 0xFF00FF) * local365 & 0xFF00FF00) + ((local408 & 0xFF00) * local356 + (local923 & 0xFF00) * local365 & 0xFF0000) >> 8;
											}
										}
										local21 += local53;
									}
									local23 += local59;
									local21 = local197;
									local73 += local161;
								}
							}
						} else if (arg4 == 3) {
							local197 = local21;
							local283 = arg5 >>> 24;
							local292 = 256 - local283;
							for (local295 = -arg3; local295 < 0; local295++) {
								local356 = (local23 >> 16) * this.anInt2554;
								for (local365 = -arg2; local365 < 0; local365++) {
									local758 = this.aByteArray47[(local21 >> 16) + local356];
									local384 = local758 > 0 ? this.anIntArray213[local758] : 0;
									local392 = local384 + arg5;
									local400 = (local384 & 0xFF00FF) + (arg5 & 0xFF00FF);
									local408 = (local400 & 0x1000100) + (local392 - local400 & 0x10000);
									local408 = local392 - local408 | local408 - (local408 >>> 8);
									if (local384 == 0 && local283 != 255) {
										local384 = local408;
										local408 = local16[local73];
										local408 = ((local384 & 0xFF00FF) * local283 + (local408 & 0xFF00FF) * local292 & 0xFF00FF00) + ((local384 & 0xFF00) * local283 + (local408 & 0xFF00) * local292 & 0xFF0000) >> 8;
									}
									local16[local73++] = local408;
									local21 += local53;
								}
								local23 += local59;
								local21 = local197;
								local73 += local161;
							}
						} else if (arg4 == 2) {
							local197 = arg5 >>> 24;
							local283 = 256 - local197;
							local292 = (arg5 & 0xFF00FF) * local283 & 0xFF00FF00;
							local295 = (arg5 & 0xFF00) * local283 & 0xFF0000;
							local565 = (local292 | local295) >>> 8;
							local356 = local21;
							for (local365 = -arg3; local365 < 0; local365++) {
								local368 = (local23 >> 16) * this.anInt2554;
								for (local384 = -arg2; local384 < 0; local384++) {
									local1219 = this.aByteArray47[(local21 >> 16) + local368];
									if (local1219 == 0) {
										local73++;
									} else {
										local400 = this.anIntArray213[local1219 & 0xFF];
										local292 = (local400 & 0xFF00FF) * local197 & 0xFF00FF00;
										local295 = (local400 & 0xFF00) * local197 & 0xFF0000;
										local16[local73++] = ((local292 | local295) >>> 8) + local565;
									}
									local21 += local53;
								}
								local23 += local59;
								local21 = local356;
								local73 += local161;
							}
						} else {
							throw new IllegalArgumentException();
						}
					}
				} else if (arg4 == 1) {
					local197 = local21;
					for (local283 = -arg3; local283 < 0; local283++) {
						local292 = (local23 >> 16) * this.anInt2554;
						for (local295 = -arg2; local295 < 0; local295++) {
							local16[local73++] = this.anIntArray213[this.aByteArray47[(local21 >> 16) + local292] & 0xFF];
							local21 += local53;
						}
						local23 += local59;
						local21 = local197;
						local73 += local161;
					}
				} else if (arg4 == 0) {
					local197 = arg5 >> 16 & 0xFF;
					local283 = arg5 >> 8 & 0xFF;
					local292 = arg5 & 0xFF;
					local295 = local21;
					for (local356 = -arg3; local356 < 0; local356++) {
						local365 = (local23 >> 16) * this.anInt2554;
						for (local368 = -arg2; local368 < 0; local368++) {
							local384 = this.anIntArray213[this.aByteArray47[(local21 >> 16) + local365] & 0xFF];
							local392 = (local384 & 0xFF0000) * local197 & 0xFF000000;
							local400 = (local384 & 0xFF00) * local283 & 0xFF0000;
							local408 = (local384 & 0xFF) * local292 & 0xFF00;
							local16[local73++] = (local392 | local400 | local408) >>> 8;
							local21 += local53;
						}
						local23 += local59;
						local21 = local295;
						local73 += local161;
					}
				} else if (arg4 == 3) {
					local197 = local21;
					for (local283 = -arg3; local283 < 0; local283++) {
						local292 = (local23 >> 16) * this.anInt2554;
						for (local295 = -arg2; local295 < 0; local295++) {
							local469 = this.aByteArray47[(local21 >> 16) + local292];
							local365 = local469 > 0 ? this.anIntArray213[local469] : 0;
							local368 = local365 + arg5;
							local384 = (local365 & 0xFF00FF) + (arg5 & 0xFF00FF);
							local392 = (local384 & 0x1000100) + (local368 - local384 & 0x10000);
							local16[local73++] = local368 - local392 | local392 - (local392 >>> 8);
							local21 += local53;
						}
						local23 += local59;
						local21 = local197;
						local73 += local161;
					}
				} else if (arg4 == 2) {
					local197 = arg5 >>> 24;
					local283 = 256 - local197;
					local292 = (arg5 & 0xFF00FF) * local283 & 0xFF00FF00;
					local295 = (arg5 & 0xFF00) * local283 & 0xFF0000;
					local565 = (local292 | local295) >>> 8;
					local356 = local21;
					for (local365 = -arg3; local365 < 0; local365++) {
						local368 = (local23 >> 16) * this.anInt2554;
						for (local384 = -arg2; local384 < 0; local384++) {
							local392 = this.anIntArray213[this.aByteArray47[(local21 >> 16) + local368] & 0xFF];
							local292 = (local392 & 0xFF00FF) * local197 & 0xFF00FF00;
							local295 = (local392 & 0xFF00) * local197 & 0xFF0000;
							local16[local73++] = ((local292 | local295) >>> 8) + local565;
							local21 += local53;
						}
						local23 += local59;
						local21 = local356;
						local73 += local161;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		}
	}

	@OriginalMember(owner = "client!apf", name = "ca", descriptor = "([I[III)V")
	@Override
	void method18303(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int[] local3 = this.aClass102_Sub2_10.anIntArray50;
		if (local3 == null) {
			return;
		}
		@Pc(12) int local12;
		@Pc(18) int local18;
		@Pc(28) int local28;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(34) int local34;
		@Pc(62) int local62;
		@Pc(67) int local67;
		@Pc(73) int local73;
		@Pc(121) byte local121;
		@Pc(198) int local198;
		if (anInt2568 == 0) {
			if (anInt2576 == 0) {
				local12 = anInt2565;
				while (local12 < 0) {
					local18 = local12 + arg3;
					if (local18 >= 0) {
						if (local18 >= arg0.length) {
							return;
						}
						local28 = anInt2567;
						local30 = anInt2574;
						local32 = anInt2575;
						local34 = anInt2563;
						if (local30 >= 0 && local32 >= 0 && local30 - (this.anInt2554 << 12) < 0 && local32 - (this.anInt2559 << 12) < 0) {
							local62 = arg0[local18] - arg2;
							local67 = -arg1[local18];
							local73 = local62 - (local28 - anInt2567);
							if (local73 > 0) {
								local28 += local73;
								local34 += local73;
								local30 += anInt2568 * local73;
								local32 += anInt2576 * local73;
							} else {
								local67 -= local73;
							}
							if (local34 < local67) {
								local34 = local67;
							}
							while (local34 < 0) {
								local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
								if (local121 == 0) {
									local28++;
								} else {
									local3[local28++] = this.anIntArray213[local121 & 0xFF];
								}
								local34++;
							}
						}
					}
					local12++;
					anInt2567 += anInt2566;
				}
			} else if (anInt2576 < 0) {
				local12 = anInt2565;
				while (local12 < 0) {
					local18 = local12 + arg3;
					if (local18 >= 0) {
						if (local18 >= arg0.length) {
							return;
						}
						local28 = anInt2567;
						local30 = anInt2574;
						local32 = anInt2575 + anInt2577;
						local34 = anInt2563;
						if (local30 >= 0 && local30 - (this.anInt2554 << 12) < 0) {
							@Pc(191) int local191;
							if ((local191 = local32 - (this.anInt2559 << 12)) >= 0) {
								local198 = (anInt2576 - local191) / anInt2576;
								local34 += local198;
								local32 += anInt2576 * local198;
								local28 += local198;
							}
							@Pc(219) int local219;
							if ((local219 = (local32 - anInt2576) / anInt2576) > local34) {
								local34 = local219;
							}
							local62 = arg0[local18] - arg2;
							local67 = -arg1[local18];
							local73 = local62 - (local28 - anInt2567);
							if (local73 > 0) {
								local28 += local73;
								local34 += local73;
								local30 += anInt2568 * local73;
								local32 += anInt2576 * local73;
							} else {
								local67 -= local73;
							}
							if (local34 < local67) {
								local34 = local67;
							}
							while (local34 < 0) {
								local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
								if (local121 == 0) {
									local28++;
								} else {
									local3[local28++] = this.anIntArray213[local121 & 0xFF];
								}
								local32 += anInt2576;
								local34++;
							}
						}
					}
					local12++;
					anInt2574 += anInt2570;
					anInt2567 += anInt2566;
				}
			} else {
				local12 = anInt2565;
				while (local12 < 0) {
					local18 = local12 + arg3;
					if (local18 >= 0) {
						if (local18 >= arg0.length) {
							return;
						}
						local28 = anInt2567;
						local30 = anInt2574;
						local32 = anInt2575 + anInt2577;
						local34 = anInt2563;
						if (local30 >= 0 && local30 - (this.anInt2554 << 12) < 0) {
							if (local32 < 0) {
								local198 = (anInt2576 - 1 - local32) / anInt2576;
								local34 += local198;
								local32 += anInt2576 * local198;
								local28 += local198;
							}
							@Pc(394) int local394;
							if ((local394 = (local32 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local34) {
								local34 = local394;
							}
							local62 = arg0[local18] - arg2;
							local67 = -arg1[local18];
							local73 = local62 - (local28 - anInt2567);
							if (local73 > 0) {
								local28 += local73;
								local34 += local73;
								local30 += anInt2568 * local73;
								local32 += anInt2576 * local73;
							} else {
								local67 -= local73;
							}
							if (local34 < local67) {
								local34 = local67;
							}
							while (local34 < 0) {
								local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
								if (local121 == 0) {
									local28++;
								} else {
									local3[local28++] = this.anIntArray213[local121 & 0xFF];
								}
								local32 += anInt2576;
								local34++;
							}
						}
					}
					local12++;
					anInt2574 += anInt2570;
					anInt2567 += anInt2566;
				}
			}
		} else if (anInt2568 < 0) {
			if (anInt2576 == 0) {
				local12 = anInt2565;
				while (local12 < 0) {
					local18 = local12 + arg3;
					if (local18 >= 0) {
						if (local18 >= arg0.length) {
							return;
						}
						local28 = anInt2567;
						local30 = anInt2574 + anInt2579;
						local32 = anInt2575;
						local34 = anInt2563;
						if (local32 >= 0 && local32 - (this.anInt2559 << 12) < 0) {
							@Pc(543) int local543;
							if ((local543 = local30 - (this.anInt2554 << 12)) >= 0) {
								local198 = (anInt2568 - local543) / anInt2568;
								local34 += local198;
								local30 += anInt2568 * local198;
								local28 += local198;
							}
							@Pc(571) int local571;
							if ((local571 = (local30 - anInt2568) / anInt2568) > local34) {
								local34 = local571;
							}
							local62 = arg0[local18] - arg2;
							local67 = -arg1[local18];
							local73 = local62 - (local28 - anInt2567);
							if (local73 > 0) {
								local28 += local73;
								local34 += local73;
								local30 += anInt2568 * local73;
								local32 += anInt2576 * local73;
							} else {
								local67 -= local73;
							}
							if (local34 < local67) {
								local34 = local67;
							}
							while (local34 < 0) {
								local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
								if (local121 == 0) {
									local28++;
								} else {
									local3[local28++] = this.anIntArray213[local121 & 0xFF];
								}
								local30 += anInt2568;
								local34++;
							}
						}
					}
					local12++;
					anInt2575 += anInt2560;
					anInt2567 += anInt2566;
				}
			} else if (anInt2576 < 0) {
				local12 = anInt2565;
				while (local12 < 0) {
					local18 = local12 + arg3;
					if (local18 >= 0) {
						if (local18 >= arg0.length) {
							return;
						}
						local28 = anInt2567;
						local30 = anInt2574 + anInt2579;
						local32 = anInt2575 + anInt2577;
						local34 = anInt2563;
						@Pc(709) int local709;
						if ((local709 = local30 - (this.anInt2554 << 12)) >= 0) {
							local198 = (anInt2568 - local709) / anInt2568;
							local34 += local198;
							local30 += anInt2568 * local198;
							local32 += anInt2576 * local198;
							local28 += local198;
						}
						@Pc(743) int local743;
						if ((local743 = (local30 - anInt2568) / anInt2568) > local34) {
							local34 = local743;
						}
						@Pc(755) int local755;
						if ((local755 = local32 - (this.anInt2559 << 12)) >= 0) {
							local198 = (anInt2576 - local755) / anInt2576;
							local34 += local198;
							local30 += anInt2568 * local198;
							local32 += anInt2576 * local198;
							local28 += local198;
						}
						@Pc(789) int local789;
						if ((local789 = (local32 - anInt2576) / anInt2576) > local34) {
							local34 = local789;
						}
						local62 = arg0[local18] - arg2;
						local67 = -arg1[local18];
						local73 = local62 - (local28 - anInt2567);
						if (local73 > 0) {
							local28 += local73;
							local34 += local73;
							local30 += anInt2568 * local73;
							local32 += anInt2576 * local73;
						} else {
							local67 -= local73;
						}
						if (local34 < local67) {
							local34 = local67;
						}
						while (local34 < 0) {
							local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
							if (local121 == 0) {
								local28++;
							} else {
								local3[local28++] = this.anIntArray213[local121 & 0xFF];
							}
							local30 += anInt2568;
							local32 += anInt2576;
							local34++;
						}
					}
					local12++;
					anInt2574 += anInt2570;
					anInt2575 += anInt2560;
					anInt2567 += anInt2566;
				}
			} else {
				local12 = anInt2565;
				while (local12 < 0) {
					local18 = local12 + arg3;
					if (local18 >= 0) {
						if (local18 >= arg0.length) {
							return;
						}
						local28 = anInt2567;
						local30 = anInt2574 + anInt2579;
						local32 = anInt2575 + anInt2577;
						local34 = anInt2563;
						@Pc(933) int local933;
						if ((local933 = local30 - (this.anInt2554 << 12)) >= 0) {
							local198 = (anInt2568 - local933) / anInt2568;
							local34 += local198;
							local30 += anInt2568 * local198;
							local32 += anInt2576 * local198;
							local28 += local198;
						}
						@Pc(967) int local967;
						if ((local967 = (local30 - anInt2568) / anInt2568) > local34) {
							local34 = local967;
						}
						if (local32 < 0) {
							local198 = (anInt2576 - 1 - local32) / anInt2576;
							local34 += local198;
							local30 += anInt2568 * local198;
							local32 += anInt2576 * local198;
							local28 += local198;
						}
						@Pc(1015) int local1015;
						if ((local1015 = (local32 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local34) {
							local34 = local1015;
						}
						local62 = arg0[local18] - arg2;
						local67 = -arg1[local18];
						local73 = local62 - (local28 - anInt2567);
						if (local73 > 0) {
							local28 += local73;
							local34 += local73;
							local30 += anInt2568 * local73;
							local32 += anInt2576 * local73;
						} else {
							local67 -= local73;
						}
						if (local34 < local67) {
							local34 = local67;
						}
						while (local34 < 0) {
							local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
							if (local121 == 0) {
								local28++;
							} else {
								local3[local28++] = this.anIntArray213[local121 & 0xFF];
							}
							local30 += anInt2568;
							local32 += anInt2576;
							local34++;
						}
					}
					local12++;
					anInt2574 += anInt2570;
					anInt2575 += anInt2560;
					anInt2567 += anInt2566;
				}
			}
		} else if (anInt2576 == 0) {
			local12 = anInt2565;
			while (local12 < 0) {
				local18 = local12 + arg3;
				if (local18 >= 0) {
					if (local18 >= arg0.length) {
						return;
					}
					local28 = anInt2567;
					local30 = anInt2574 + anInt2579;
					local32 = anInt2575;
					local34 = anInt2563;
					if (local32 >= 0 && local32 - (this.anInt2559 << 12) < 0) {
						if (local30 < 0) {
							local198 = (anInt2568 - 1 - local30) / anInt2568;
							local34 += local198;
							local30 += anInt2568 * local198;
							local28 += local198;
						}
						@Pc(1200) int local1200;
						if ((local1200 = (local30 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local34) {
							local34 = local1200;
						}
						local62 = arg0[local18] - arg2;
						local67 = -arg1[local18];
						local73 = local62 - (local28 - anInt2567);
						if (local73 > 0) {
							local28 += local73;
							local34 += local73;
							local30 += anInt2568 * local73;
							local32 += anInt2576 * local73;
						} else {
							local67 -= local73;
						}
						if (local34 < local67) {
							local34 = local67;
						}
						while (local34 < 0) {
							local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
							if (local121 == 0) {
								local28++;
							} else {
								local3[local28++] = this.anIntArray213[local121 & 0xFF];
							}
							local30 += anInt2568;
							local34++;
						}
					}
				}
				local12++;
				anInt2574 += anInt2570;
				anInt2575 += anInt2560;
				anInt2567 += anInt2566;
			}
		} else if (anInt2576 < 0) {
			local12 = anInt2565;
			while (local12 < 0) {
				local18 = local12 + arg3;
				if (local18 >= 0) {
					if (local18 >= arg0.length) {
						return;
					}
					local28 = anInt2567;
					local30 = anInt2574 + anInt2579;
					local32 = anInt2575 + anInt2577;
					local34 = anInt2563;
					if (local30 < 0) {
						local198 = (anInt2568 - 1 - local30) / anInt2568;
						local34 += local198;
						local30 += anInt2568 * local198;
						local32 += anInt2576 * local198;
						local28 += local198;
					}
					@Pc(1378) int local1378;
					if ((local1378 = (local30 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local34) {
						local34 = local1378;
					}
					@Pc(1390) int local1390;
					if ((local1390 = local32 - (this.anInt2559 << 12)) >= 0) {
						local198 = (anInt2576 - local1390) / anInt2576;
						local34 += local198;
						local30 += anInt2568 * local198;
						local32 += anInt2576 * local198;
						local28 += local198;
					}
					@Pc(1424) int local1424;
					if ((local1424 = (local32 - anInt2576) / anInt2576) > local34) {
						local34 = local1424;
					}
					local62 = arg0[local18] - arg2;
					local67 = -arg1[local18];
					local73 = local62 - (local28 - anInt2567);
					if (local73 > 0) {
						local28 += local73;
						local34 += local73;
						local30 += anInt2568 * local73;
						local32 += anInt2576 * local73;
					} else {
						local67 -= local73;
					}
					if (local34 < local67) {
						local34 = local67;
					}
					while (local34 < 0) {
						local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
						if (local121 == 0) {
							local28++;
						} else {
							local3[local28++] = this.anIntArray213[local121 & 0xFF];
						}
						local30 += anInt2568;
						local32 += anInt2576;
						local34++;
					}
				}
				local12++;
				anInt2574 += anInt2570;
				anInt2575 += anInt2560;
				anInt2567 += anInt2566;
			}
		} else {
			local12 = anInt2565;
			while (local12 < 0) {
				local18 = local12 + arg3;
				if (local18 >= 0) {
					if (local18 >= arg0.length) {
						return;
					}
					local28 = anInt2567;
					local30 = anInt2574 + anInt2579;
					local32 = anInt2575 + anInt2577;
					local34 = anInt2563;
					if (local30 < 0) {
						local198 = (anInt2568 - 1 - local30) / anInt2568;
						local34 += local198;
						local30 += anInt2568 * local198;
						local32 += anInt2576 * local198;
						local28 += local198;
					}
					@Pc(1604) int local1604;
					if ((local1604 = (local30 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local34) {
						local34 = local1604;
					}
					if (local32 < 0) {
						local198 = (anInt2576 - 1 - local32) / anInt2576;
						local34 += local198;
						local30 += anInt2568 * local198;
						local32 += anInt2576 * local198;
						local28 += local198;
					}
					@Pc(1652) int local1652;
					if ((local1652 = (local32 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local34) {
						local34 = local1652;
					}
					local62 = arg0[local18] - arg2;
					local67 = -arg1[local18];
					local73 = local62 - (local28 - anInt2567);
					if (local73 > 0) {
						local28 += local73;
						local34 += local73;
						local30 += anInt2568 * local73;
						local32 += anInt2576 * local73;
					} else {
						local67 -= local73;
					}
					if (local34 < local67) {
						local34 = local67;
					}
					while (local34 < 0) {
						local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
						if (local121 == 0) {
							local28++;
						} else {
							local3[local28++] = this.anIntArray213[local121 & 0xFF];
						}
						local30 += anInt2568;
						local32 += anInt2576;
						local34++;
					}
				}
				local12++;
				anInt2574 += anInt2570;
				anInt2575 += anInt2560;
				anInt2567 += anInt2566;
			}
		}
	}

	@OriginalMember(owner = "client!apf", name = "i", descriptor = "()Lclient!do;")
	@Override
	public Interface18 method18231() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!apf", name = "k", descriptor = "(IIIII)V")
	@Override
	public void method18226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass102_Sub2_10.method5094()) {
			throw new IllegalStateException();
		}
		@Pc(11) int[] local11 = this.aClass102_Sub2_10.anIntArray50;
		if (local11 == null) {
			return;
		}
		@Pc(20) int local20 = this.aClass102_Sub2_10.anInt638 * 513500097;
		arg0 += this.anInt2555;
		arg1 += this.anInt2556;
		@Pc(36) int local36 = arg1 * local20 + arg0;
		@Pc(38) int local38 = 0;
		@Pc(41) int local41 = this.anInt2559;
		@Pc(44) int local44 = this.anInt2554;
		@Pc(48) int local48 = local20 - local44;
		@Pc(50) int local50 = 0;
		@Pc(65) int local65;
		if (arg1 < this.aClass102_Sub2_10.anInt645 * -1878420243) {
			local65 = this.aClass102_Sub2_10.anInt645 * -1878420243 - arg1;
			local41 -= local65;
			arg1 = this.aClass102_Sub2_10.anInt645 * -1878420243;
			local38 += local65 * local44;
			local36 += local65 * local20;
		}
		if (arg1 + local41 > this.aClass102_Sub2_10.anInt639 * 725126603) {
			local41 -= arg1 + local41 - this.aClass102_Sub2_10.anInt639 * 725126603;
		}
		if (arg0 < this.aClass102_Sub2_10.anInt637 * 531468375) {
			local65 = this.aClass102_Sub2_10.anInt637 * 531468375 - arg0;
			local44 -= local65;
			arg0 = this.aClass102_Sub2_10.anInt637 * 531468375;
			local38 += local65;
			local36 += local65;
			local50 += local65;
			local48 += local65;
		}
		if (arg0 + local44 > this.aClass102_Sub2_10.anInt634 * 469139509) {
			local65 = arg0 + local44 - this.aClass102_Sub2_10.anInt634 * 469139509;
			local44 -= local65;
			local50 += local65;
			local48 += local65;
		}
		if (local44 <= 0 || local41 <= 0) {
			return;
		}
		@Pc(201) int local201;
		@Pc(309) int local309;
		@Pc(312) int local312;
		@Pc(317) int local317;
		@Pc(330) int local330;
		@Pc(338) int local338;
		@Pc(346) int local346;
		@Pc(354) int local354;
		@Pc(483) int local483;
		if (arg4 != 0) {
			@Pc(793) int local793;
			@Pc(801) int local801;
			@Pc(809) int local809;
			@Pc(821) int local821;
			@Pc(570) byte local570;
			@Pc(1081) byte local1081;
			if (arg4 != 1) {
				if (arg4 != 2) {
					throw new IllegalArgumentException();
				}
				if (arg2 == 1) {
					for (local65 = -local41; local65 < 0; local65++) {
						for (local201 = -local44; local201 < 0; local201++) {
							local570 = this.aByteArray47[local38++];
							if (local570 == 0) {
								local36++;
							} else {
								local312 = this.anIntArray213[local570 & 0xFF];
								local317 = local11[local36];
								local330 = local312 + local317;
								local338 = (local312 & 0xFF00FF) + (local317 & 0xFF00FF);
								local317 = (local338 & 0x1000100) + (local330 - local338 & 0x10000);
								local11[local36++] = local330 - local317 | local317 - (local317 >>> 8);
							}
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 0) {
					local65 = arg3 >> 16 & 0xFF;
					local201 = arg3 >> 8 & 0xFF;
					local309 = arg3 & 0xFF;
					for (local312 = -local41; local312 < 0; local312++) {
						for (local317 = -local44; local317 < 0; local317++) {
							@Pc(1255) byte local1255 = this.aByteArray47[local38++];
							if (local1255 == 0) {
								local36++;
							} else {
								local338 = this.anIntArray213[local1255 & 0xFF];
								local346 = (local338 & 0xFF0000) * local65 & 0xFF000000;
								local354 = (local338 & 0xFF00) * local201 & 0xFF0000;
								local793 = (local338 & 0xFF) * local309 & 0xFF00;
								local338 = (local346 | local354 | local793) >>> 8;
								local801 = local11[local36];
								local809 = local338 + local801;
								local821 = (local338 & 0xFF00FF) + (local801 & 0xFF00FF);
								local801 = (local821 & 0x1000100) + (local809 - local821 & 0x10000);
								local11[local36++] = local809 - local801 | local801 - (local801 >>> 8);
							}
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 3) {
					for (local65 = -local41; local65 < 0; local65++) {
						for (local201 = -local44; local201 < 0; local201++) {
							local570 = this.aByteArray47[local38++];
							local312 = local570 > 0 ? this.anIntArray213[local570] : 0;
							local317 = local312 + arg3;
							local330 = (local312 & 0xFF00FF) + (arg3 & 0xFF00FF);
							local338 = (local330 & 0x1000100) + (local317 - local330 & 0x10000);
							local312 = local317 - local338 | local338 - (local338 >>> 8);
							local338 = local11[local36];
							local317 = local312 + local338;
							local330 = (local312 & 0xFF00FF) + (local338 & 0xFF00FF);
							local338 = (local330 & 0x1000100) + (local317 - local330 & 0x10000);
							local11[local36++] = local317 - local338 | local338 - (local338 >>> 8);
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 2) {
					local65 = arg3 >>> 24;
					local201 = 256 - local65;
					local309 = (arg3 & 0xFF00FF) * local201 & 0xFF00FF00;
					local312 = (arg3 & 0xFF00) * local201 & 0xFF0000;
					local483 = (local309 | local312) >>> 8;
					for (local317 = -local41; local317 < 0; local317++) {
						for (local330 = -local44; local330 < 0; local330++) {
							local1081 = this.aByteArray47[local38++];
							if (local1081 == 0) {
								local36++;
							} else {
								local346 = this.anIntArray213[local1081 & 0xFF];
								local309 = (local346 & 0xFF00FF) * local65 & 0xFF00FF00;
								local312 = (local346 & 0xFF00) * local65 & 0xFF0000;
								local346 = ((local309 | local312) >>> 8) + local483;
								local354 = local11[local36];
								local793 = local346 + local354;
								local801 = (local346 & 0xFF00FF) + (local354 & 0xFF00FF);
								local354 = (local801 & 0x1000100) + (local793 - local801 & 0x10000);
								local11[local36++] = local793 - local354 | local354 - (local354 >>> 8);
							}
						}
						local36 += local48;
						local38 += local50;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg2 == 1) {
				for (local65 = -local41; local65 < 0; local65++) {
					for (local201 = -local44; local201 < 0; local201++) {
						local570 = this.aByteArray47[local38++];
						if (local570 == 0) {
							local36++;
						} else {
							local312 = this.anIntArray213[local570 & 0xFF] | 0xFF000000;
							@Pc(583) short local583 = 255;
							@Pc(585) byte local585 = 0;
							local338 = local11[local36];
							local11[local36++] = ((local312 & 0xFF00FF) * local583 + (local338 & 0xFF00FF) * local585 >> 8 & 0xFFFF00FF) + (((local312 & 0xFF00FF00) >>> 8) * local583 + ((local338 & 0xFF00FF00) >>> 8) * local585 & 0xFF00FF00);
						}
					}
					local36 += local48;
					local38 += local50;
				}
			} else {
				@Pc(672) byte local672;
				if (arg2 == 0) {
					if ((arg3 & 0xFFFFFF) == 16777215) {
						local65 = arg3 >>> 24;
						local201 = 256 - local65;
						for (local309 = -local41; local309 < 0; local309++) {
							for (local312 = -local44; local312 < 0; local312++) {
								local672 = this.aByteArray47[local38++];
								if (local672 == 0) {
									local36++;
								} else {
									local330 = this.anIntArray213[local672 & 0xFF];
									local338 = local11[local36];
									local11[local36++] = ((local330 & 0xFF00FF) * local65 + (local338 & 0xFF00FF) * local201 & 0xFF00FF00) + ((local330 & 0xFF00) * local65 + (local338 & 0xFF00) * local201 & 0xFF0000) >> 8;
								}
							}
							local36 += local48;
							local38 += local50;
						}
					} else {
						local65 = arg3 >> 16 & 0xFF;
						local201 = arg3 >> 8 & 0xFF;
						local309 = arg3 & 0xFF;
						local312 = arg3 >>> 24;
						local317 = 256 - local312;
						for (local330 = -local41; local330 < 0; local330++) {
							for (local338 = -local44; local338 < 0; local338++) {
								@Pc(773) byte local773 = this.aByteArray47[local38++];
								if (local773 == 0) {
									local36++;
								} else {
									local354 = this.anIntArray213[local773 & 0xFF];
									if (local312 == 255) {
										local793 = (local354 & 0xFF0000) * local65 & 0xFF000000;
										local801 = (local354 & 0xFF00) * local201 & 0xFF0000;
										local809 = (local354 & 0xFF) * local309 & 0xFF00;
										local11[local36++] = (local793 | local801 | local809) >>> 8;
									} else {
										local793 = (local354 & 0xFF0000) * local65 & 0xFF000000;
										local801 = (local354 & 0xFF00) * local201 & 0xFF0000;
										local809 = (local354 & 0xFF) * local309 & 0xFF00;
										local354 = (local793 | local801 | local809) >>> 8;
										local821 = local11[local36];
										local11[local36++] = ((local354 & 0xFF00FF) * local312 + (local821 & 0xFF00FF) * local317 & 0xFF00FF00) + ((local354 & 0xFF00) * local312 + (local821 & 0xFF00) * local317 & 0xFF0000) >> 8;
									}
								}
							}
							local36 += local48;
							local38 += local50;
						}
					}
				} else if (arg2 == 3) {
					local65 = arg3 >>> 24;
					local201 = 256 - local65;
					for (local309 = -local41; local309 < 0; local309++) {
						for (local312 = -local44; local312 < 0; local312++) {
							local672 = this.aByteArray47[local38++];
							local330 = local672 > 0 ? this.anIntArray213[local672] : 0;
							local338 = local330 + arg3;
							local346 = (local330 & 0xFF00FF) + (arg3 & 0xFF00FF);
							local354 = (local346 & 0x1000100) + (local338 - local346 & 0x10000);
							local354 = local338 - local354 | local354 - (local354 >>> 8);
							if (local330 == 0 && local65 != 255) {
								local330 = local354;
								local354 = local11[local36];
								local354 = ((local330 & 0xFF00FF) * local65 + (local354 & 0xFF00FF) * local201 & 0xFF00FF00) + ((local330 & 0xFF00) * local65 + (local354 & 0xFF00) * local201 & 0xFF0000) >> 8;
							}
							local11[local36++] = local354;
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 2) {
					local65 = arg3 >>> 24;
					local201 = 256 - local65;
					local309 = (arg3 & 0xFF00FF) * local201 & 0xFF00FF00;
					local312 = (arg3 & 0xFF00) * local201 & 0xFF0000;
					local483 = (local309 | local312) >>> 8;
					for (local317 = -local41; local317 < 0; local317++) {
						for (local330 = -local44; local330 < 0; local330++) {
							local1081 = this.aByteArray47[local38++];
							if (local1081 == 0) {
								local36++;
							} else {
								local346 = this.anIntArray213[local1081 & 0xFF];
								local309 = (local346 & 0xFF00FF) * local65 & 0xFF00FF00;
								local312 = (local346 & 0xFF00) * local65 & 0xFF0000;
								local11[local36++] = ((local309 | local312) >>> 8) + local483;
							}
						}
						local36 += local48;
						local38 += local50;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg2 == 1) {
			for (local65 = -local41; local65 < 0; local65++) {
				local201 = local36 + local44 - 3;
				while (local36 < local201) {
					local11[local36++] = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
					local11[local36++] = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
					local11[local36++] = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
					local11[local36++] = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
				}
				local201 += 3;
				while (local36 < local201) {
					local11[local36++] = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
				}
				local36 += local48;
				local38 += local50;
			}
		} else if (arg2 == 0) {
			local65 = arg3 >> 16 & 0xFF;
			local201 = arg3 >> 8 & 0xFF;
			local309 = arg3 & 0xFF;
			for (local312 = -local41; local312 < 0; local312++) {
				for (local317 = -local44; local317 < 0; local317++) {
					local330 = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
					local338 = (local330 & 0xFF0000) * local65 & 0xFF000000;
					local346 = (local330 & 0xFF00) * local201 & 0xFF0000;
					local354 = (local330 & 0xFF) * local309 & 0xFF00;
					local11[local36++] = (local338 | local346 | local354) >>> 8;
				}
				local36 += local48;
				local38 += local50;
			}
		} else if (arg2 == 3) {
			for (local65 = -local41; local65 < 0; local65++) {
				for (local201 = -local44; local201 < 0; local201++) {
					local309 = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
					local312 = local309 + arg3;
					local317 = (local309 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local330 = (local317 & 0x1000100) + (local312 - local317 & 0x10000);
					local11[local36++] = local312 - local330 | local330 - (local330 >>> 8);
				}
				local36 += local48;
				local38 += local50;
			}
		} else if (arg2 == 2) {
			local65 = arg3 >>> 24;
			local201 = 256 - local65;
			local309 = (arg3 & 0xFF00FF) * local201 & 0xFF00FF00;
			local312 = (arg3 & 0xFF00) * local201 & 0xFF0000;
			local483 = (local309 | local312) >>> 8;
			for (local317 = -local41; local317 < 0; local317++) {
				for (local330 = -local44; local330 < 0; local330++) {
					local338 = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
					local309 = (local338 & 0xFF00FF) * local65 & 0xFF00FF00;
					local312 = (local338 & 0xFF00) * local65 & 0xFF0000;
					local11[local36++] = ((local309 | local312) >>> 8) + local483;
				}
				local36 += local48;
				local38 += local50;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!apf", name = "x", descriptor = "(IILclient!cg;II)V")
	@Override
	public void method18235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class98 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass102_Sub2_10.method5094()) {
			throw new IllegalStateException();
		}
		@Pc(11) int[] local11 = this.aClass102_Sub2_10.anIntArray50;
		if (local11 == null) {
			return;
		}
		arg0 += this.anInt2555;
		arg1 += this.anInt2556;
		@Pc(26) int local26 = 0;
		@Pc(32) int local32 = this.aClass102_Sub2_10.anInt638 * 513500097;
		@Pc(35) int local35 = this.anInt2554;
		@Pc(38) int local38 = this.anInt2559;
		@Pc(42) int local42 = local32 - local35;
		@Pc(44) int local44 = 0;
		@Pc(50) int local50 = arg0 + arg1 * local32;
		@Pc(65) int local65;
		if (arg1 < this.aClass102_Sub2_10.anInt645 * -1878420243) {
			local65 = this.aClass102_Sub2_10.anInt645 * -1878420243 - arg1;
			local38 -= local65;
			arg1 = this.aClass102_Sub2_10.anInt645 * -1878420243;
			local26 += local65 * local35;
			local50 += local65 * local32;
		}
		if (arg1 + local38 > this.aClass102_Sub2_10.anInt639 * 725126603) {
			local38 -= arg1 + local38 - this.aClass102_Sub2_10.anInt639 * 725126603;
		}
		if (arg0 < this.aClass102_Sub2_10.anInt637 * 531468375) {
			local65 = this.aClass102_Sub2_10.anInt637 * 531468375 - arg0;
			local35 -= local65;
			arg0 = this.aClass102_Sub2_10.anInt637 * 531468375;
			local26 += local65;
			local50 += local65;
			local44 += local65;
			local42 += local65;
		}
		if (arg0 + local35 > this.aClass102_Sub2_10.anInt634 * 469139509) {
			local65 = arg0 + local35 - this.aClass102_Sub2_10.anInt634 * 469139509;
			local35 -= local65;
			local44 += local65;
			local42 += local65;
		}
		if (local35 <= 0 || local38 <= 0) {
			return;
		}
		@Pc(188) Class98_Sub2 local188 = (Class98_Sub2) arg2;
		@Pc(191) int[] local191 = local188.anIntArray40;
		@Pc(194) int[] local194 = local188.anIntArray39;
		@Pc(196) int local196 = arg1;
		if (arg4 > arg1) {
			local196 = arg4;
			local50 += (arg4 - arg1) * local32;
			local26 += (arg4 - arg1) * this.anInt2554;
		}
		@Pc(235) int local235 = arg4 + local191.length < arg1 + local38 ? arg4 + local191.length : arg1 + local38;
		for (@Pc(237) int local237 = local196; local237 < local235; local237++) {
			@Pc(248) int local248 = local191[local237 - arg4] + arg3;
			@Pc(254) int local254 = local194[local237 - arg4];
			@Pc(256) int local256 = local35;
			@Pc(263) int local263;
			if (arg0 > local248) {
				local263 = arg0 - local248;
				if (local263 >= local254) {
					local26 += local35 + local44;
					local50 += local35 + local42;
					continue;
				}
				local254 -= local263;
			} else {
				local263 = local248 - arg0;
				if (local263 >= local35) {
					local26 += local35 + local44;
					local50 += local35 + local42;
					continue;
				}
				local26 += local263;
				local256 = local35 - local263;
				local50 += local263;
			}
			local263 = 0;
			if (local256 < local254) {
				local254 = local256;
			} else {
				local263 = local256 - local254;
			}
			for (@Pc(331) int local331 = -local254; local331 < 0; local331++) {
				@Pc(339) byte local339 = this.aByteArray47[local26++];
				if (local339 == 0) {
					local50++;
				} else {
					local11[local50++] = this.anIntArray213[local339 & 0xFF];
				}
			}
			local26 += local263 + local44;
			local50 += local263 + local42;
		}
	}

	@OriginalMember(owner = "client!apf", name = "cy", descriptor = "(ZZZIIFIIIIIIZ)V")
	@Override
	void method18297(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		if (arg6 <= 0 || arg7 <= 0 || !arg0 && !arg1) {
			return;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(22) int local22 = this.anInt2555 + this.anInt2554 + this.anInt2557;
		@Pc(31) int local31 = this.anInt2556 + this.anInt2559 + this.anInt2571;
		@Pc(37) int local37 = (local22 << 16) / arg6;
		@Pc(43) int local43 = (local31 << 16) / arg7;
		@Pc(57) int local57;
		if (this.anInt2555 > 0) {
			local57 = ((this.anInt2555 << 16) + local37 - 1) / local37;
			arg3 += local57;
			local11 += local57 * local37 - (this.anInt2555 << 16);
		}
		if (this.anInt2556 > 0) {
			local57 = ((this.anInt2556 << 16) + local43 - 1) / local43;
			arg4 += local57;
			local13 += local57 * local43 - (this.anInt2556 << 16);
		}
		if (this.anInt2554 < local22) {
			arg6 = ((this.anInt2554 << 16) - local11 + local37 - 1) / local37;
		}
		if (this.anInt2559 < local31) {
			arg7 = ((this.anInt2559 << 16) - local13 + local43 - 1) / local43;
		}
		local57 = arg3 + arg4 * this.aClass102_Sub2_10.anInt638 * 513500097;
		@Pc(153) int local153 = this.aClass102_Sub2_10.anInt638 * 513500097 - arg6;
		if (arg4 + arg7 > this.aClass102_Sub2_10.anInt639 * 725126603) {
			arg7 -= arg4 + arg7 - this.aClass102_Sub2_10.anInt639 * 725126603;
		}
		@Pc(189) int local189;
		if (arg4 < this.aClass102_Sub2_10.anInt645 * -1878420243) {
			local189 = this.aClass102_Sub2_10.anInt645 * -1878420243 - arg4;
			arg7 -= local189;
			local57 += local189 * this.aClass102_Sub2_10.anInt638 * 513500097;
			local13 += local43 * local189;
		}
		if (arg3 + arg6 > this.aClass102_Sub2_10.anInt634 * 469139509) {
			local189 = arg3 + arg6 - this.aClass102_Sub2_10.anInt634 * 469139509;
			arg6 -= local189;
			local153 += local189;
		}
		if (arg3 < this.aClass102_Sub2_10.anInt637 * 531468375) {
			local189 = this.aClass102_Sub2_10.anInt637 * 531468375 - arg3;
			arg6 -= local189;
			local57 += local189;
			local11 += local37 * local189;
			local153 += local189;
		}
		@Pc(273) float[] local273 = this.aClass102_Sub2_10.aFloatArray12;
		@Pc(277) int[] local277 = this.aClass102_Sub2_10.anIntArray50;
		@Pc(284) int local284;
		@Pc(287) int local287;
		@Pc(296) int local296;
		@Pc(299) int local299;
		@Pc(378) int local378;
		@Pc(387) int local387;
		@Pc(390) int local390;
		@Pc(416) int local416;
		@Pc(424) int local424;
		@Pc(432) int local432;
		@Pc(440) int local440;
		@Pc(623) int local623;
		@Pc(519) byte local519;
		if (arg10 != 0) {
			@Pc(1013) int local1013;
			@Pc(1021) int local1021;
			@Pc(1029) int local1029;
			@Pc(1041) int local1041;
			@Pc(1378) byte local1378;
			if (arg10 != 1) {
				if (arg10 != 2) {
					throw new IllegalArgumentException();
				}
				if (arg8 == 1) {
					local284 = local11;
					for (local287 = -arg7; local287 < 0; local287++) {
						local296 = (local13 >> 16) * this.anInt2554;
						for (local299 = -arg6; local299 < 0; local299++) {
							if (!arg1 || arg5 < local273[local57]) {
								local519 = this.aByteArray47[(local11 >> 16) + local296];
								if (local519 != 0) {
									if (arg0) {
										local387 = this.anIntArray213[local519 & 0xFF];
										local390 = local277[local57];
										local416 = local387 + local390;
										local424 = (local387 & 0xFF00FF) + (local390 & 0xFF00FF);
										local390 = (local424 & 0x1000100) + (local416 - local424 & 0x10000);
										local277[local57] = local416 - local390 | local390 - (local390 >>> 8);
									}
									if (arg1 && arg12) {
										local273[local57] = arg5;
									}
								}
							}
							local11 += local37;
							local57++;
						}
						local13 += local43;
						local11 = local284;
						local57 += local153;
					}
				} else if (arg8 == 0) {
					local284 = local11;
					local287 = arg9 >> 16 & 0xFF;
					local296 = arg9 >> 8 & 0xFF;
					local299 = arg9 & 0xFF;
					for (local378 = -arg7; local378 < 0; local378++) {
						local387 = (local13 >> 16) * this.anInt2554;
						for (local390 = -arg6; local390 < 0; local390++) {
							if (!arg1 || arg5 < local273[local57]) {
								@Pc(1620) byte local1620 = this.aByteArray47[(local11 >> 16) + local387];
								if (local1620 != 0) {
									if (arg0) {
										local424 = this.anIntArray213[local1620 & 0xFF];
										local432 = (local424 & 0xFF0000) * local287 & 0xFF000000;
										local440 = (local424 & 0xFF00) * local296 & 0xFF0000;
										local1013 = (local424 & 0xFF) * local299 & 0xFF00;
										local424 = (local432 | local440 | local1013) >>> 8;
										local1021 = local277[local57];
										local1029 = local424 + local1021;
										local1041 = (local424 & 0xFF00FF) + (local1021 & 0xFF00FF);
										local1021 = (local1041 & 0x1000100) + (local1029 - local1041 & 0x10000);
										local277[local57] = local1029 - local1021 | local1021 - (local1021 >>> 8);
									}
									if (arg1 && arg12) {
										local273[local57] = arg5;
									}
								}
							}
							local11 += local37;
							local57++;
						}
						local13 += local43;
						local11 = local284;
						local57 += local153;
					}
				} else if (arg8 == 3) {
					local284 = local11;
					for (local287 = -arg7; local287 < 0; local287++) {
						local296 = (local13 >> 16) * this.anInt2554;
						for (local299 = -arg6; local299 < 0; local299++) {
							if (!arg1 || arg5 < local273[local57]) {
								if (arg0) {
									local519 = this.aByteArray47[(local11 >> 16) + local296];
									local387 = local519 > 0 ? this.anIntArray213[local519] : 0;
									local390 = local387 + arg9;
									local416 = (local387 & 0xFF00FF) + (arg9 & 0xFF00FF);
									local424 = (local416 & 0x1000100) + (local390 - local416 & 0x10000);
									local387 = local390 - local424 | local424 - (local424 >>> 8);
									local424 = local277[local57];
									local390 = local387 + local424;
									local416 = (local387 & 0xFF00FF) + (local424 & 0xFF00FF);
									local424 = (local416 & 0x1000100) + (local390 - local416 & 0x10000);
									local277[local57] = local390 - local424 | local424 - (local424 >>> 8);
								}
								if (arg1 && arg12) {
									local273[local57] = arg5;
								}
							}
							local11 += local37;
							local57++;
						}
						local13 += local43;
						local11 = local284;
						local57 += local153;
					}
				} else if (arg8 == 2) {
					local284 = arg9 >>> 24;
					local287 = 256 - local284;
					local296 = (arg9 & 0xFF00FF) * local287 & 0xFF00FF00;
					local299 = (arg9 & 0xFF00) * local287 & 0xFF0000;
					local623 = (local296 | local299) >>> 8;
					local378 = local11;
					for (local387 = -arg7; local387 < 0; local387++) {
						local390 = (local13 >> 16) * this.anInt2554;
						for (local416 = -arg6; local416 < 0; local416++) {
							if (!arg1 || arg5 < local273[local57]) {
								local1378 = this.aByteArray47[(local11 >> 16) + local390];
								if (local1378 != 0) {
									if (arg0) {
										local432 = this.anIntArray213[local1378 & 0xFF];
										local296 = (local432 & 0xFF00FF) * local284 & 0xFF00FF00;
										local299 = (local432 & 0xFF00) * local284 & 0xFF0000;
										local432 = ((local296 | local299) >>> 8) + local623;
										local440 = local277[local57];
										local1013 = local432 + local440;
										local1021 = (local432 & 0xFF00FF) + (local440 & 0xFF00FF);
										local440 = (local1021 & 0x1000100) + (local1013 - local1021 & 0x10000);
										local277[local57] = local1013 - local440 | local440 - (local440 >>> 8);
									}
									if (arg1 && arg12) {
										local273[local57] = arg5;
									}
								}
							}
							local11 += local37;
							local57++;
						}
						local13 += local43;
						local11 = local378;
						local57 += local153;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg8 == 1) {
				local284 = local11;
				for (local287 = -arg7; local287 < 0; local287++) {
					local296 = (local13 >> 16) * this.anInt2554;
					for (local299 = -arg6; local299 < 0; local299++) {
						if (!arg1 || arg5 < local273[local57]) {
							local519 = this.aByteArray47[(local11 >> 16) + local296];
							if (local519 != 0) {
								if (arg0) {
									local277[local57] = this.anIntArray213[local519 & 0xFF];
								}
								if (arg1 && arg12) {
									local273[local57] = arg5;
								}
							}
						}
						local11 += local37;
						local57++;
					}
					local13 += local43;
					local11 = local284;
					local57 += local153;
				}
			} else {
				@Pc(858) byte local858;
				if (arg8 == 0) {
					local284 = local11;
					if ((arg9 & 0xFFFFFF) == 16777215) {
						local287 = arg9 >>> 24;
						local296 = 256 - local287;
						for (local299 = -arg7; local299 < 0; local299++) {
							local378 = (local13 >> 16) * this.anInt2554;
							for (local387 = -arg6; local387 < 0; local387++) {
								if (!arg1 || arg5 < local273[local57]) {
									local858 = this.aByteArray47[(local11 >> 16) + local378];
									if (local858 != 0) {
										if (arg0) {
											local416 = this.anIntArray213[local858 & 0xFF];
											local424 = local277[local57];
											local277[local57] = ((local416 & 0xFF00FF) * local287 + (local424 & 0xFF00FF) * local296 & 0xFF00FF00) + ((local416 & 0xFF00) * local287 + (local424 & 0xFF00) * local296 & 0xFF0000) >> 8;
										}
										if (arg1 && arg12) {
											local273[local57] = arg5;
										}
									}
								}
								local11 += local37;
								local57++;
							}
							local13 += local43;
							local11 = local284;
							local57 += local153;
						}
					} else {
						local287 = arg9 >> 16 & 0xFF;
						local296 = arg9 >> 8 & 0xFF;
						local299 = arg9 & 0xFF;
						local378 = arg9 >>> 24;
						local387 = 256 - local378;
						for (local390 = -arg7; local390 < 0; local390++) {
							local416 = (local13 >> 16) * this.anInt2554;
							for (local424 = -arg6; local424 < 0; local424++) {
								if (!arg1 || arg5 < local273[local57]) {
									@Pc(991) byte local991 = this.aByteArray47[(local11 >> 16) + local416];
									if (local991 != 0) {
										local440 = this.anIntArray213[local991 & 0xFF];
										if (local378 == 255) {
											if (arg0) {
												local1013 = (local440 & 0xFF0000) * local287 & 0xFF000000;
												local1021 = (local440 & 0xFF00) * local296 & 0xFF0000;
												local1029 = (local440 & 0xFF) * local299 & 0xFF00;
												local277[local57] = (local1013 | local1021 | local1029) >>> 8;
											}
											if (arg1 && arg12) {
												local273[local57] = arg5;
											}
										} else {
											if (arg0) {
												local1013 = (local440 & 0xFF0000) * local287 & 0xFF000000;
												local1021 = (local440 & 0xFF00) * local296 & 0xFF0000;
												local1029 = (local440 & 0xFF) * local299 & 0xFF00;
												local440 = (local1013 | local1021 | local1029) >>> 8;
												local1041 = local277[local57];
												local277[local57] = ((local440 & 0xFF00FF) * local378 + (local1041 & 0xFF00FF) * local387 & 0xFF00FF00) + ((local440 & 0xFF00) * local378 + (local1041 & 0xFF00) * local387 & 0xFF0000) >> 8;
											}
											if (arg1 && arg12) {
												local273[local57] = arg5;
											}
										}
									}
								}
								local11 += local37;
								local57++;
							}
							local13 += local43;
							local11 = local284;
							local57 += local153;
						}
					}
				} else if (arg8 == 3) {
					local284 = local11;
					local287 = arg9 >>> 24;
					local296 = 256 - local287;
					for (local299 = -arg7; local299 < 0; local299++) {
						local378 = (local13 >> 16) * this.anInt2554;
						for (local387 = -arg6; local387 < 0; local387++) {
							if (!arg1 || arg5 < local273[local57]) {
								if (arg0) {
									local858 = this.aByteArray47[(local11 >> 16) + local378];
									local416 = local858 > 0 ? this.anIntArray213[local858] : 0;
									local424 = local416 + arg9;
									local432 = (local416 & 0xFF00FF) + (arg9 & 0xFF00FF);
									local440 = (local432 & 0x1000100) + (local424 - local432 & 0x10000);
									local440 = local424 - local440 | local440 - (local440 >>> 8);
									if (local416 == 0 && local287 != 255) {
										local416 = local440;
										local440 = local277[local57];
										local440 = ((local416 & 0xFF00FF) * local287 + (local440 & 0xFF00FF) * local296 & 0xFF00FF00) + ((local416 & 0xFF00) * local287 + (local440 & 0xFF00) * local296 & 0xFF0000) >> 8;
									}
									local277[local57] = local440;
								}
								if (arg1 && arg12) {
									local273[local57] = arg5;
								}
							}
							local11 += local37;
							local57++;
						}
						local13 += local43;
						local11 = local284;
						local57 += local153;
					}
				} else if (arg8 == 2) {
					local284 = arg9 >>> 24;
					local287 = 256 - local284;
					local296 = (arg9 & 0xFF00FF) * local287 & 0xFF00FF00;
					local299 = (arg9 & 0xFF00) * local287 & 0xFF0000;
					local623 = (local296 | local299) >>> 8;
					local378 = local11;
					for (local387 = -arg7; local387 < 0; local387++) {
						local390 = (local13 >> 16) * this.anInt2554;
						for (local416 = -arg6; local416 < 0; local416++) {
							if (!arg1 || arg5 < local273[local57]) {
								local1378 = this.aByteArray47[(local11 >> 16) + local390];
								if (local1378 != 0) {
									if (arg0) {
										local432 = this.anIntArray213[local1378 & 0xFF];
										local296 = (local432 & 0xFF00FF) * local284 & 0xFF00FF00;
										local299 = (local432 & 0xFF00) * local284 & 0xFF0000;
										local277[local57] = ((local296 | local299) >>> 8) + local623;
									}
									if (arg1 && arg12) {
										local273[local57] = arg5;
									}
								}
							}
							local11 += local37;
							local57++;
						}
						local13 += local43;
						local11 = local378;
						local57 += local153;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg8 == 1) {
			local284 = local11;
			for (local287 = -arg7; local287 < 0; local287++) {
				local296 = (local13 >> 16) * this.anInt2554;
				for (local299 = -arg6; local299 < 0; local299++) {
					if (!arg1 || arg5 < local273[local57]) {
						if (arg0) {
							local277[local57] = this.anIntArray213[this.aByteArray47[(local11 >> 16) + local296] & 0xFF];
						}
						if (arg1 && arg12) {
							local273[local57] = arg5;
						}
					}
					local11 += local37;
					local57++;
				}
				local13 += local43;
				local11 = local284;
				local57 += local153;
			}
		} else if (arg8 == 0) {
			local284 = arg9 >> 16 & 0xFF;
			local287 = arg9 >> 8 & 0xFF;
			local296 = arg9 & 0xFF;
			local299 = local11;
			for (local378 = -arg7; local378 < 0; local378++) {
				local387 = (local13 >> 16) * this.anInt2554;
				for (local390 = -arg6; local390 < 0; local390++) {
					if (!arg1 || arg5 < local273[local57]) {
						if (arg0) {
							local416 = this.anIntArray213[this.aByteArray47[(local11 >> 16) + local387] & 0xFF];
							local424 = (local416 & 0xFF0000) * local284 & 0xFF000000;
							local432 = (local416 & 0xFF00) * local287 & 0xFF0000;
							local440 = (local416 & 0xFF) * local296 & 0xFF00;
							local277[local57] = (local424 | local432 | local440) >>> 8;
						}
						if (arg1 && arg12) {
							local273[local57] = arg5;
						}
					}
					local11 += local37;
					local57++;
				}
				local13 += local43;
				local11 = local299;
				local57 += local153;
			}
		} else if (arg8 == 3) {
			local284 = local11;
			for (local287 = -arg7; local287 < 0; local287++) {
				local296 = (local13 >> 16) * this.anInt2554;
				for (local299 = -arg6; local299 < 0; local299++) {
					if (!arg1 || arg5 < local273[local57]) {
						if (arg0) {
							local519 = this.aByteArray47[(local11 >> 16) + local296];
							local387 = local519 > 0 ? this.anIntArray213[local519] : 0;
							local390 = local387 + arg9;
							local416 = (local387 & 0xFF00FF) + (arg9 & 0xFF00FF);
							local424 = (local416 & 0x1000100) + (local390 - local416 & 0x10000);
							local277[local57] = local390 - local424 | local424 - (local424 >>> 8);
						}
						if (arg1 && arg12) {
							local273[local57] = arg5;
						}
					}
					local11 += local37;
					local57++;
				}
				local13 += local43;
				local11 = local284;
				local57 += local153;
			}
		} else if (arg8 == 2) {
			local284 = arg9 >>> 24;
			local287 = 256 - local284;
			local296 = (arg9 & 0xFF00FF) * local287 & 0xFF00FF00;
			local299 = (arg9 & 0xFF00) * local287 & 0xFF0000;
			local623 = (local296 | local299) >>> 8;
			local378 = local11;
			for (local387 = -arg7; local387 < 0; local387++) {
				local390 = (local13 >> 16) * this.anInt2554;
				for (local416 = -arg6; local416 < 0; local416++) {
					if (!arg1 || arg5 < local273[local57]) {
						if (arg0) {
							local424 = this.anIntArray213[this.aByteArray47[(local11 >> 16) + local390] & 0xFF];
							local296 = (local424 & 0xFF00FF) * local284 & 0xFF00FF00;
							local299 = (local424 & 0xFF00) * local284 & 0xFF0000;
							local277[local57] = ((local296 | local299) >>> 8) + local623;
						}
						if (arg1 && arg12) {
							local273[local57] = arg5;
						}
					}
					local11 += local37;
					local57++;
				}
				local13 += local43;
				local11 = local378;
				local57 += local153;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!apf", name = "q", descriptor = "(IIIIIIII)V")
	@Override
	void method18230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass102_Sub2_10.method5094()) {
			throw new IllegalStateException();
		} else if (arg2 > 0 && arg3 > 0) {
			@Pc(16) int[] local16 = this.aClass102_Sub2_10.anIntArray50;
			if (local16 != null) {
				@Pc(21) int local21 = 0;
				@Pc(23) int local23 = 0;
				@Pc(29) int local29 = this.aClass102_Sub2_10.anInt638 * 513500097;
				@Pc(38) int local38 = this.anInt2555 + this.anInt2554 + this.anInt2557;
				@Pc(47) int local47 = this.anInt2556 + this.anInt2559 + this.anInt2571;
				@Pc(53) int local53 = (local38 << 16) / arg2;
				@Pc(59) int local59 = (local47 << 16) / arg3;
				@Pc(73) int local73;
				if (this.anInt2555 > 0) {
					local73 = ((this.anInt2555 << 16) + local53 - 1) / local53;
					arg0 += local73;
					local21 += local73 * local53 - (this.anInt2555 << 16);
				}
				if (this.anInt2556 > 0) {
					local73 = ((this.anInt2556 << 16) + local59 - 1) / local59;
					arg1 += local73;
					local23 += local73 * local59 - (this.anInt2556 << 16);
				}
				if (this.anInt2554 < local38) {
					arg2 = ((this.anInt2554 << 16) - local21 + local53 - 1) / local53;
				}
				if (this.anInt2559 < local47) {
					arg3 = ((this.anInt2559 << 16) - local23 + local59 - 1) / local59;
				}
				local73 = arg0 + arg1 * local29;
				@Pc(161) int local161 = local29 - arg2;
				if (arg1 + arg3 > this.aClass102_Sub2_10.anInt639 * 725126603) {
					arg3 -= arg1 + arg3 - this.aClass102_Sub2_10.anInt639 * 725126603;
				}
				@Pc(197) int local197;
				if (arg1 < this.aClass102_Sub2_10.anInt645 * -1878420243) {
					local197 = this.aClass102_Sub2_10.anInt645 * -1878420243 - arg1;
					arg3 -= local197;
					local73 += local197 * local29;
					local23 += local59 * local197;
				}
				if (arg0 + arg2 > this.aClass102_Sub2_10.anInt634 * 469139509) {
					local197 = arg0 + arg2 - this.aClass102_Sub2_10.anInt634 * 469139509;
					arg2 -= local197;
					local161 += local197;
				}
				if (arg0 < this.aClass102_Sub2_10.anInt637 * 531468375) {
					local197 = this.aClass102_Sub2_10.anInt637 * 531468375 - arg0;
					arg2 -= local197;
					local73 += local197;
					local21 += local53 * local197;
					local161 += local197;
				}
				@Pc(283) int local283;
				@Pc(292) int local292;
				@Pc(295) int local295;
				@Pc(356) int local356;
				@Pc(365) int local365;
				@Pc(368) int local368;
				@Pc(384) int local384;
				@Pc(392) int local392;
				@Pc(400) int local400;
				@Pc(408) int local408;
				@Pc(565) int local565;
				@Pc(469) byte local469;
				if (arg6 != 0) {
					@Pc(895) int local895;
					@Pc(903) int local903;
					@Pc(911) int local911;
					@Pc(923) int local923;
					@Pc(1219) byte local1219;
					if (arg6 != 1) {
						if (arg6 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg4 == 1) {
							local197 = local21;
							for (local283 = -arg3; local283 < 0; local283++) {
								local292 = (local23 >> 16) * this.anInt2554;
								for (local295 = -arg2; local295 < 0; local295++) {
									local469 = this.aByteArray47[(local21 >> 16) + local292];
									if (local469 == 0) {
										local73++;
									} else {
										local365 = this.anIntArray213[local469 & 0xFF];
										local368 = local16[local73];
										local384 = local365 + local368;
										local392 = (local365 & 0xFF00FF) + (local368 & 0xFF00FF);
										local368 = (local392 & 0x1000100) + (local384 - local392 & 0x10000);
										local16[local73++] = local384 - local368 | local368 - (local368 >>> 8);
									}
									local21 += local53;
								}
								local23 += local59;
								local21 = local197;
								local73 += local161;
							}
						} else if (arg4 == 0) {
							local197 = local21;
							local283 = arg5 >> 16 & 0xFF;
							local292 = arg5 >> 8 & 0xFF;
							local295 = arg5 & 0xFF;
							for (local356 = -arg3; local356 < 0; local356++) {
								local365 = (local23 >> 16) * this.anInt2554;
								for (local368 = -arg2; local368 < 0; local368++) {
									@Pc(1429) byte local1429 = this.aByteArray47[(local21 >> 16) + local365];
									if (local1429 == 0) {
										local73++;
									} else {
										local392 = this.anIntArray213[local1429 & 0xFF];
										local400 = (local392 & 0xFF0000) * local283 & 0xFF000000;
										local408 = (local392 & 0xFF00) * local292 & 0xFF0000;
										local895 = (local392 & 0xFF) * local295 & 0xFF00;
										local392 = (local400 | local408 | local895) >>> 8;
										local903 = local16[local73];
										local911 = local392 + local903;
										local923 = (local392 & 0xFF00FF) + (local903 & 0xFF00FF);
										local903 = (local923 & 0x1000100) + (local911 - local923 & 0x10000);
										local16[local73++] = local911 - local903 | local903 - (local903 >>> 8);
									}
									local21 += local53;
								}
								local23 += local59;
								local21 = local197;
								local73 += local161;
							}
						} else if (arg4 == 3) {
							local197 = local21;
							for (local283 = -arg3; local283 < 0; local283++) {
								local292 = (local23 >> 16) * this.anInt2554;
								for (local295 = -arg2; local295 < 0; local295++) {
									local469 = this.aByteArray47[(local21 >> 16) + local292];
									local365 = local469 > 0 ? this.anIntArray213[local469] : 0;
									local368 = local365 + arg5;
									local384 = (local365 & 0xFF00FF) + (arg5 & 0xFF00FF);
									local392 = (local384 & 0x1000100) + (local368 - local384 & 0x10000);
									local365 = local368 - local392 | local392 - (local392 >>> 8);
									local392 = local16[local73];
									local368 = local365 + local392;
									local384 = (local365 & 0xFF00FF) + (local392 & 0xFF00FF);
									local392 = (local384 & 0x1000100) + (local368 - local384 & 0x10000);
									local16[local73++] = local368 - local392 | local392 - (local392 >>> 8);
									local21 += local53;
								}
								local23 += local59;
								local21 = local197;
								local73 += local161;
							}
						} else if (arg4 == 2) {
							local197 = arg5 >>> 24;
							local283 = 256 - local197;
							local292 = (arg5 & 0xFF00FF) * local283 & 0xFF00FF00;
							local295 = (arg5 & 0xFF00) * local283 & 0xFF0000;
							local565 = (local292 | local295) >>> 8;
							local356 = local21;
							for (local365 = -arg3; local365 < 0; local365++) {
								local368 = (local23 >> 16) * this.anInt2554;
								for (local384 = -arg2; local384 < 0; local384++) {
									local1219 = this.aByteArray47[(local21 >> 16) + local368];
									if (local1219 == 0) {
										local73++;
									} else {
										local400 = this.anIntArray213[local1219 & 0xFF];
										local292 = (local400 & 0xFF00FF) * local197 & 0xFF00FF00;
										local295 = (local400 & 0xFF00) * local197 & 0xFF0000;
										local400 = ((local292 | local295) >>> 8) + local565;
										local408 = local16[local73];
										local895 = local400 + local408;
										local903 = (local400 & 0xFF00FF) + (local408 & 0xFF00FF);
										local408 = (local903 & 0x1000100) + (local895 - local903 & 0x10000);
										local16[local73++] = local895 - local408 | local408 - (local408 >>> 8);
									}
									local21 += local53;
								}
								local23 += local59;
								local21 = local356;
								local73 += local161;
							}
						} else {
							throw new IllegalArgumentException();
						}
					} else if (arg4 == 1) {
						local197 = local21;
						for (local283 = -arg3; local283 < 0; local283++) {
							local292 = (local23 >> 16) * this.anInt2554;
							for (local295 = -arg2; local295 < 0; local295++) {
								local469 = this.aByteArray47[(local21 >> 16) + local292];
								if (local469 == 0) {
									local73++;
								} else {
									local16[local73++] = this.anIntArray213[local469 & 0xFF];
								}
								local21 += local53;
							}
							local23 += local59;
							local21 = local197;
							local73 += local161;
						}
					} else {
						@Pc(758) byte local758;
						if (arg4 == 0) {
							local197 = local21;
							if ((arg5 & 0xFFFFFF) == 16777215) {
								local283 = arg5 >>> 24;
								local292 = 256 - local283;
								for (local295 = -arg3; local295 < 0; local295++) {
									local356 = (local23 >> 16) * this.anInt2554;
									for (local365 = -arg2; local365 < 0; local365++) {
										local758 = this.aByteArray47[(local21 >> 16) + local356];
										if (local758 == 0) {
											local73++;
										} else {
											local384 = this.anIntArray213[local758 & 0xFF];
											local392 = local16[local73];
											local16[local73++] = ((local384 & 0xFF00FF) * local283 + (local392 & 0xFF00FF) * local292 & 0xFF00FF00) + ((local384 & 0xFF00) * local283 + (local392 & 0xFF00) * local292 & 0xFF0000) >> 8;
										}
										local21 += local53;
									}
									local23 += local59;
									local21 = local197;
									local73 += local161;
								}
							} else {
								local283 = arg5 >> 16 & 0xFF;
								local292 = arg5 >> 8 & 0xFF;
								local295 = arg5 & 0xFF;
								local356 = arg5 >>> 24;
								local365 = 256 - local356;
								for (local368 = -arg3; local368 < 0; local368++) {
									local384 = (local23 >> 16) * this.anInt2554;
									for (local392 = -arg2; local392 < 0; local392++) {
										@Pc(875) byte local875 = this.aByteArray47[(local21 >> 16) + local384];
										if (local875 == 0) {
											local73++;
										} else {
											local408 = this.anIntArray213[local875 & 0xFF];
											if (local356 == 255) {
												local895 = (local408 & 0xFF0000) * local283 & 0xFF000000;
												local903 = (local408 & 0xFF00) * local292 & 0xFF0000;
												local911 = (local408 & 0xFF) * local295 & 0xFF00;
												local16[local73++] = (local895 | local903 | local911) >>> 8;
											} else {
												local895 = (local408 & 0xFF0000) * local283 & 0xFF000000;
												local903 = (local408 & 0xFF00) * local292 & 0xFF0000;
												local911 = (local408 & 0xFF) * local295 & 0xFF00;
												local408 = (local895 | local903 | local911) >>> 8;
												local923 = local16[local73];
												local16[local73++] = ((local408 & 0xFF00FF) * local356 + (local923 & 0xFF00FF) * local365 & 0xFF00FF00) + ((local408 & 0xFF00) * local356 + (local923 & 0xFF00) * local365 & 0xFF0000) >> 8;
											}
										}
										local21 += local53;
									}
									local23 += local59;
									local21 = local197;
									local73 += local161;
								}
							}
						} else if (arg4 == 3) {
							local197 = local21;
							local283 = arg5 >>> 24;
							local292 = 256 - local283;
							for (local295 = -arg3; local295 < 0; local295++) {
								local356 = (local23 >> 16) * this.anInt2554;
								for (local365 = -arg2; local365 < 0; local365++) {
									local758 = this.aByteArray47[(local21 >> 16) + local356];
									local384 = local758 > 0 ? this.anIntArray213[local758] : 0;
									local392 = local384 + arg5;
									local400 = (local384 & 0xFF00FF) + (arg5 & 0xFF00FF);
									local408 = (local400 & 0x1000100) + (local392 - local400 & 0x10000);
									local408 = local392 - local408 | local408 - (local408 >>> 8);
									if (local384 == 0 && local283 != 255) {
										local384 = local408;
										local408 = local16[local73];
										local408 = ((local384 & 0xFF00FF) * local283 + (local408 & 0xFF00FF) * local292 & 0xFF00FF00) + ((local384 & 0xFF00) * local283 + (local408 & 0xFF00) * local292 & 0xFF0000) >> 8;
									}
									local16[local73++] = local408;
									local21 += local53;
								}
								local23 += local59;
								local21 = local197;
								local73 += local161;
							}
						} else if (arg4 == 2) {
							local197 = arg5 >>> 24;
							local283 = 256 - local197;
							local292 = (arg5 & 0xFF00FF) * local283 & 0xFF00FF00;
							local295 = (arg5 & 0xFF00) * local283 & 0xFF0000;
							local565 = (local292 | local295) >>> 8;
							local356 = local21;
							for (local365 = -arg3; local365 < 0; local365++) {
								local368 = (local23 >> 16) * this.anInt2554;
								for (local384 = -arg2; local384 < 0; local384++) {
									local1219 = this.aByteArray47[(local21 >> 16) + local368];
									if (local1219 == 0) {
										local73++;
									} else {
										local400 = this.anIntArray213[local1219 & 0xFF];
										local292 = (local400 & 0xFF00FF) * local197 & 0xFF00FF00;
										local295 = (local400 & 0xFF00) * local197 & 0xFF0000;
										local16[local73++] = ((local292 | local295) >>> 8) + local565;
									}
									local21 += local53;
								}
								local23 += local59;
								local21 = local356;
								local73 += local161;
							}
						} else {
							throw new IllegalArgumentException();
						}
					}
				} else if (arg4 == 1) {
					local197 = local21;
					for (local283 = -arg3; local283 < 0; local283++) {
						local292 = (local23 >> 16) * this.anInt2554;
						for (local295 = -arg2; local295 < 0; local295++) {
							local16[local73++] = this.anIntArray213[this.aByteArray47[(local21 >> 16) + local292] & 0xFF];
							local21 += local53;
						}
						local23 += local59;
						local21 = local197;
						local73 += local161;
					}
				} else if (arg4 == 0) {
					local197 = arg5 >> 16 & 0xFF;
					local283 = arg5 >> 8 & 0xFF;
					local292 = arg5 & 0xFF;
					local295 = local21;
					for (local356 = -arg3; local356 < 0; local356++) {
						local365 = (local23 >> 16) * this.anInt2554;
						for (local368 = -arg2; local368 < 0; local368++) {
							local384 = this.anIntArray213[this.aByteArray47[(local21 >> 16) + local365] & 0xFF];
							local392 = (local384 & 0xFF0000) * local197 & 0xFF000000;
							local400 = (local384 & 0xFF00) * local283 & 0xFF0000;
							local408 = (local384 & 0xFF) * local292 & 0xFF00;
							local16[local73++] = (local392 | local400 | local408) >>> 8;
							local21 += local53;
						}
						local23 += local59;
						local21 = local295;
						local73 += local161;
					}
				} else if (arg4 == 3) {
					local197 = local21;
					for (local283 = -arg3; local283 < 0; local283++) {
						local292 = (local23 >> 16) * this.anInt2554;
						for (local295 = -arg2; local295 < 0; local295++) {
							local469 = this.aByteArray47[(local21 >> 16) + local292];
							local365 = local469 > 0 ? this.anIntArray213[local469] : 0;
							local368 = local365 + arg5;
							local384 = (local365 & 0xFF00FF) + (arg5 & 0xFF00FF);
							local392 = (local384 & 0x1000100) + (local368 - local384 & 0x10000);
							local16[local73++] = local368 - local392 | local392 - (local392 >>> 8);
							local21 += local53;
						}
						local23 += local59;
						local21 = local197;
						local73 += local161;
					}
				} else if (arg4 == 2) {
					local197 = arg5 >>> 24;
					local283 = 256 - local197;
					local292 = (arg5 & 0xFF00FF) * local283 & 0xFF00FF00;
					local295 = (arg5 & 0xFF00) * local283 & 0xFF0000;
					local565 = (local292 | local295) >>> 8;
					local356 = local21;
					for (local365 = -arg3; local365 < 0; local365++) {
						local368 = (local23 >> 16) * this.anInt2554;
						for (local384 = -arg2; local384 < 0; local384++) {
							local392 = this.anIntArray213[this.aByteArray47[(local21 >> 16) + local368] & 0xFF];
							local292 = (local392 & 0xFF00FF) * local197 & 0xFF00FF00;
							local295 = (local392 & 0xFF00) * local197 & 0xFF0000;
							local16[local73++] = ((local292 | local295) >>> 8) + local565;
							local21 += local53;
						}
						local23 += local59;
						local21 = local356;
						local73 += local161;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		}
	}

	@OriginalMember(owner = "client!apf", name = "at", descriptor = "(IIIII)V")
	@Override
	public void method18278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass102_Sub2_10.method5094()) {
			throw new IllegalStateException();
		}
		@Pc(11) int[] local11 = this.aClass102_Sub2_10.anIntArray50;
		if (local11 == null) {
			return;
		}
		@Pc(20) int local20 = this.aClass102_Sub2_10.anInt638 * 513500097;
		arg0 += this.anInt2555;
		arg1 += this.anInt2556;
		@Pc(36) int local36 = arg1 * local20 + arg0;
		@Pc(38) int local38 = 0;
		@Pc(41) int local41 = this.anInt2559;
		@Pc(44) int local44 = this.anInt2554;
		@Pc(48) int local48 = local20 - local44;
		@Pc(50) int local50 = 0;
		@Pc(65) int local65;
		if (arg1 < this.aClass102_Sub2_10.anInt645 * -1878420243) {
			local65 = this.aClass102_Sub2_10.anInt645 * -1878420243 - arg1;
			local41 -= local65;
			arg1 = this.aClass102_Sub2_10.anInt645 * -1878420243;
			local38 += local65 * local44;
			local36 += local65 * local20;
		}
		if (arg1 + local41 > this.aClass102_Sub2_10.anInt639 * 725126603) {
			local41 -= arg1 + local41 - this.aClass102_Sub2_10.anInt639 * 725126603;
		}
		if (arg0 < this.aClass102_Sub2_10.anInt637 * 531468375) {
			local65 = this.aClass102_Sub2_10.anInt637 * 531468375 - arg0;
			local44 -= local65;
			arg0 = this.aClass102_Sub2_10.anInt637 * 531468375;
			local38 += local65;
			local36 += local65;
			local50 += local65;
			local48 += local65;
		}
		if (arg0 + local44 > this.aClass102_Sub2_10.anInt634 * 469139509) {
			local65 = arg0 + local44 - this.aClass102_Sub2_10.anInt634 * 469139509;
			local44 -= local65;
			local50 += local65;
			local48 += local65;
		}
		if (local44 <= 0 || local41 <= 0) {
			return;
		}
		@Pc(201) int local201;
		@Pc(309) int local309;
		@Pc(312) int local312;
		@Pc(317) int local317;
		@Pc(330) int local330;
		@Pc(338) int local338;
		@Pc(346) int local346;
		@Pc(354) int local354;
		@Pc(483) int local483;
		if (arg4 != 0) {
			@Pc(793) int local793;
			@Pc(801) int local801;
			@Pc(809) int local809;
			@Pc(821) int local821;
			@Pc(570) byte local570;
			@Pc(1081) byte local1081;
			if (arg4 != 1) {
				if (arg4 != 2) {
					throw new IllegalArgumentException();
				}
				if (arg2 == 1) {
					for (local65 = -local41; local65 < 0; local65++) {
						for (local201 = -local44; local201 < 0; local201++) {
							local570 = this.aByteArray47[local38++];
							if (local570 == 0) {
								local36++;
							} else {
								local312 = this.anIntArray213[local570 & 0xFF];
								local317 = local11[local36];
								local330 = local312 + local317;
								local338 = (local312 & 0xFF00FF) + (local317 & 0xFF00FF);
								local317 = (local338 & 0x1000100) + (local330 - local338 & 0x10000);
								local11[local36++] = local330 - local317 | local317 - (local317 >>> 8);
							}
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 0) {
					local65 = arg3 >> 16 & 0xFF;
					local201 = arg3 >> 8 & 0xFF;
					local309 = arg3 & 0xFF;
					for (local312 = -local41; local312 < 0; local312++) {
						for (local317 = -local44; local317 < 0; local317++) {
							@Pc(1255) byte local1255 = this.aByteArray47[local38++];
							if (local1255 == 0) {
								local36++;
							} else {
								local338 = this.anIntArray213[local1255 & 0xFF];
								local346 = (local338 & 0xFF0000) * local65 & 0xFF000000;
								local354 = (local338 & 0xFF00) * local201 & 0xFF0000;
								local793 = (local338 & 0xFF) * local309 & 0xFF00;
								local338 = (local346 | local354 | local793) >>> 8;
								local801 = local11[local36];
								local809 = local338 + local801;
								local821 = (local338 & 0xFF00FF) + (local801 & 0xFF00FF);
								local801 = (local821 & 0x1000100) + (local809 - local821 & 0x10000);
								local11[local36++] = local809 - local801 | local801 - (local801 >>> 8);
							}
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 3) {
					for (local65 = -local41; local65 < 0; local65++) {
						for (local201 = -local44; local201 < 0; local201++) {
							local570 = this.aByteArray47[local38++];
							local312 = local570 > 0 ? this.anIntArray213[local570] : 0;
							local317 = local312 + arg3;
							local330 = (local312 & 0xFF00FF) + (arg3 & 0xFF00FF);
							local338 = (local330 & 0x1000100) + (local317 - local330 & 0x10000);
							local312 = local317 - local338 | local338 - (local338 >>> 8);
							local338 = local11[local36];
							local317 = local312 + local338;
							local330 = (local312 & 0xFF00FF) + (local338 & 0xFF00FF);
							local338 = (local330 & 0x1000100) + (local317 - local330 & 0x10000);
							local11[local36++] = local317 - local338 | local338 - (local338 >>> 8);
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 2) {
					local65 = arg3 >>> 24;
					local201 = 256 - local65;
					local309 = (arg3 & 0xFF00FF) * local201 & 0xFF00FF00;
					local312 = (arg3 & 0xFF00) * local201 & 0xFF0000;
					local483 = (local309 | local312) >>> 8;
					for (local317 = -local41; local317 < 0; local317++) {
						for (local330 = -local44; local330 < 0; local330++) {
							local1081 = this.aByteArray47[local38++];
							if (local1081 == 0) {
								local36++;
							} else {
								local346 = this.anIntArray213[local1081 & 0xFF];
								local309 = (local346 & 0xFF00FF) * local65 & 0xFF00FF00;
								local312 = (local346 & 0xFF00) * local65 & 0xFF0000;
								local346 = ((local309 | local312) >>> 8) + local483;
								local354 = local11[local36];
								local793 = local346 + local354;
								local801 = (local346 & 0xFF00FF) + (local354 & 0xFF00FF);
								local354 = (local801 & 0x1000100) + (local793 - local801 & 0x10000);
								local11[local36++] = local793 - local354 | local354 - (local354 >>> 8);
							}
						}
						local36 += local48;
						local38 += local50;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg2 == 1) {
				for (local65 = -local41; local65 < 0; local65++) {
					for (local201 = -local44; local201 < 0; local201++) {
						local570 = this.aByteArray47[local38++];
						if (local570 == 0) {
							local36++;
						} else {
							local312 = this.anIntArray213[local570 & 0xFF] | 0xFF000000;
							@Pc(583) short local583 = 255;
							@Pc(585) byte local585 = 0;
							local338 = local11[local36];
							local11[local36++] = ((local312 & 0xFF00FF) * local583 + (local338 & 0xFF00FF) * local585 >> 8 & 0xFFFF00FF) + (((local312 & 0xFF00FF00) >>> 8) * local583 + ((local338 & 0xFF00FF00) >>> 8) * local585 & 0xFF00FF00);
						}
					}
					local36 += local48;
					local38 += local50;
				}
			} else {
				@Pc(672) byte local672;
				if (arg2 == 0) {
					if ((arg3 & 0xFFFFFF) == 16777215) {
						local65 = arg3 >>> 24;
						local201 = 256 - local65;
						for (local309 = -local41; local309 < 0; local309++) {
							for (local312 = -local44; local312 < 0; local312++) {
								local672 = this.aByteArray47[local38++];
								if (local672 == 0) {
									local36++;
								} else {
									local330 = this.anIntArray213[local672 & 0xFF];
									local338 = local11[local36];
									local11[local36++] = ((local330 & 0xFF00FF) * local65 + (local338 & 0xFF00FF) * local201 & 0xFF00FF00) + ((local330 & 0xFF00) * local65 + (local338 & 0xFF00) * local201 & 0xFF0000) >> 8;
								}
							}
							local36 += local48;
							local38 += local50;
						}
					} else {
						local65 = arg3 >> 16 & 0xFF;
						local201 = arg3 >> 8 & 0xFF;
						local309 = arg3 & 0xFF;
						local312 = arg3 >>> 24;
						local317 = 256 - local312;
						for (local330 = -local41; local330 < 0; local330++) {
							for (local338 = -local44; local338 < 0; local338++) {
								@Pc(773) byte local773 = this.aByteArray47[local38++];
								if (local773 == 0) {
									local36++;
								} else {
									local354 = this.anIntArray213[local773 & 0xFF];
									if (local312 == 255) {
										local793 = (local354 & 0xFF0000) * local65 & 0xFF000000;
										local801 = (local354 & 0xFF00) * local201 & 0xFF0000;
										local809 = (local354 & 0xFF) * local309 & 0xFF00;
										local11[local36++] = (local793 | local801 | local809) >>> 8;
									} else {
										local793 = (local354 & 0xFF0000) * local65 & 0xFF000000;
										local801 = (local354 & 0xFF00) * local201 & 0xFF0000;
										local809 = (local354 & 0xFF) * local309 & 0xFF00;
										local354 = (local793 | local801 | local809) >>> 8;
										local821 = local11[local36];
										local11[local36++] = ((local354 & 0xFF00FF) * local312 + (local821 & 0xFF00FF) * local317 & 0xFF00FF00) + ((local354 & 0xFF00) * local312 + (local821 & 0xFF00) * local317 & 0xFF0000) >> 8;
									}
								}
							}
							local36 += local48;
							local38 += local50;
						}
					}
				} else if (arg2 == 3) {
					local65 = arg3 >>> 24;
					local201 = 256 - local65;
					for (local309 = -local41; local309 < 0; local309++) {
						for (local312 = -local44; local312 < 0; local312++) {
							local672 = this.aByteArray47[local38++];
							local330 = local672 > 0 ? this.anIntArray213[local672] : 0;
							local338 = local330 + arg3;
							local346 = (local330 & 0xFF00FF) + (arg3 & 0xFF00FF);
							local354 = (local346 & 0x1000100) + (local338 - local346 & 0x10000);
							local354 = local338 - local354 | local354 - (local354 >>> 8);
							if (local330 == 0 && local65 != 255) {
								local330 = local354;
								local354 = local11[local36];
								local354 = ((local330 & 0xFF00FF) * local65 + (local354 & 0xFF00FF) * local201 & 0xFF00FF00) + ((local330 & 0xFF00) * local65 + (local354 & 0xFF00) * local201 & 0xFF0000) >> 8;
							}
							local11[local36++] = local354;
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 2) {
					local65 = arg3 >>> 24;
					local201 = 256 - local65;
					local309 = (arg3 & 0xFF00FF) * local201 & 0xFF00FF00;
					local312 = (arg3 & 0xFF00) * local201 & 0xFF0000;
					local483 = (local309 | local312) >>> 8;
					for (local317 = -local41; local317 < 0; local317++) {
						for (local330 = -local44; local330 < 0; local330++) {
							local1081 = this.aByteArray47[local38++];
							if (local1081 == 0) {
								local36++;
							} else {
								local346 = this.anIntArray213[local1081 & 0xFF];
								local309 = (local346 & 0xFF00FF) * local65 & 0xFF00FF00;
								local312 = (local346 & 0xFF00) * local65 & 0xFF0000;
								local11[local36++] = ((local309 | local312) >>> 8) + local483;
							}
						}
						local36 += local48;
						local38 += local50;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg2 == 1) {
			for (local65 = -local41; local65 < 0; local65++) {
				local201 = local36 + local44 - 3;
				while (local36 < local201) {
					local11[local36++] = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
					local11[local36++] = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
					local11[local36++] = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
					local11[local36++] = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
				}
				local201 += 3;
				while (local36 < local201) {
					local11[local36++] = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
				}
				local36 += local48;
				local38 += local50;
			}
		} else if (arg2 == 0) {
			local65 = arg3 >> 16 & 0xFF;
			local201 = arg3 >> 8 & 0xFF;
			local309 = arg3 & 0xFF;
			for (local312 = -local41; local312 < 0; local312++) {
				for (local317 = -local44; local317 < 0; local317++) {
					local330 = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
					local338 = (local330 & 0xFF0000) * local65 & 0xFF000000;
					local346 = (local330 & 0xFF00) * local201 & 0xFF0000;
					local354 = (local330 & 0xFF) * local309 & 0xFF00;
					local11[local36++] = (local338 | local346 | local354) >>> 8;
				}
				local36 += local48;
				local38 += local50;
			}
		} else if (arg2 == 3) {
			for (local65 = -local41; local65 < 0; local65++) {
				for (local201 = -local44; local201 < 0; local201++) {
					local309 = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
					local312 = local309 + arg3;
					local317 = (local309 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local330 = (local317 & 0x1000100) + (local312 - local317 & 0x10000);
					local11[local36++] = local312 - local330 | local330 - (local330 >>> 8);
				}
				local36 += local48;
				local38 += local50;
			}
		} else if (arg2 == 2) {
			local65 = arg3 >>> 24;
			local201 = 256 - local65;
			local309 = (arg3 & 0xFF00FF) * local201 & 0xFF00FF00;
			local312 = (arg3 & 0xFF00) * local201 & 0xFF0000;
			local483 = (local309 | local312) >>> 8;
			for (local317 = -local41; local317 < 0; local317++) {
				for (local330 = -local44; local330 < 0; local330++) {
					local338 = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
					local309 = (local338 & 0xFF00FF) * local65 & 0xFF00FF00;
					local312 = (local338 & 0xFF00) * local65 & 0xFF0000;
					local11[local36++] = ((local309 | local312) >>> 8) + local483;
				}
				local36 += local48;
				local38 += local50;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!apf", name = "ck", descriptor = "(II)V")
	@Override
	void method18302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int[] local3 = this.aClass102_Sub2_10.anIntArray50;
		if (local3 == null) {
			return;
		}
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(18) int local18;
		@Pc(20) int local20;
		@Pc(22) int local22;
		@Pc(57) int local57;
		@Pc(60) int local60;
		@Pc(90) int local90;
		@Pc(98) int local98;
		@Pc(106) int local106;
		@Pc(114) int local114;
		@Pc(162) int local162;
		@Pc(347) int local347;
		@Pc(676) int local676;
		@Pc(684) int local684;
		@Pc(939) int local939;
		@Pc(230) byte local230;
		if (anInt2568 == 0) {
			if (anInt2576 == 0) {
				local12 = anInt2565;
				while (local12 < 0) {
					local16 = anInt2567;
					local18 = anInt2574;
					local20 = anInt2575;
					local22 = anInt2563;
					if (local18 >= 0 && local20 >= 0 && local18 - (this.anInt2554 << 12) < 0 && local20 - (this.anInt2559 << 12) < 0) {
						while (local22 < 0) {
							local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
							local60 = local16++;
							if (arg1 == 0) {
								if (arg0 == 1) {
									local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								} else if (arg0 == 0) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
									local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
									local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
									local3[local60] = (local98 | local106 | local114) >>> 8;
								} else if (arg0 == 3) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = anInt2582;
									local106 = local90 + local98;
									local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
									local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
									local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
								} else if (arg0 == 2) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
									local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg1 != 1) {
								if (arg1 != 2) {
									throw new IllegalArgumentException();
								}
								if (arg0 == 1) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = local3[local60];
										local114 = local98 + local106;
										local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
										local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
										local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
									}
								} else if (arg0 == 0) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local98 = (local106 | local114 | local162) >>> 8;
										local347 = local3[local60];
										local676 = local98 + local347;
										local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
										local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
										local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
									}
								} else if (arg0 == 3) {
									local230 = this.aByteArray47[local57];
									local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
									local106 = anInt2582;
									local114 = local98 + local106;
									local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
									local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
									local347 = local114 - local347 | local347 - (local347 >>> 8);
									if (local98 == 0 && anInt2578 != 255) {
										local98 = local347;
										local347 = local3[local60];
										local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
									}
									local3[local60] = local347;
								} else if (arg0 == 2) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
										local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
										local98 = ((local106 | local114) >>> 8) + anInt2586;
										local162 = local3[local60];
										local347 = local98 + local162;
										local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
										local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
										local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
									}
								}
							} else if (arg0 == 1) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local3[local60] = this.anIntArray213[local230 & 0xFF];
								}
							} else if (arg0 == 0) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									if ((anInt2582 & 0xFFFFFF) == 16777215) {
										local106 = anInt2582 >>> 24;
										local114 = 256 - local106;
										local162 = local3[local60];
										local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
									} else if (anInt2578 == 255) {
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local3[local60] = (local106 | local114 | local162) >>> 8;
									} else {
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local98 = (local106 | local114 | local162) >>> 8;
										local347 = local3[local60];
										local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local230 = this.aByteArray47[local57];
								local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
								local106 = anInt2582;
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local347 = local114 - local347 | local347 - (local347 >>> 8);
								if (local98 == 0 && anInt2578 != 255) {
									local98 = local347;
									local347 = local3[local60];
									local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
								local3[local60] = local347;
							} else if (arg0 == 2) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
									local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local22++;
						}
					}
					local12++;
					anInt2567 += anInt2566;
				}
			} else if (anInt2576 < 0) {
				local12 = anInt2565;
				while (local12 < 0) {
					local16 = anInt2567;
					local18 = anInt2574;
					local20 = anInt2575 + anInt2577;
					local22 = anInt2563;
					if (local18 >= 0 && local18 - (this.anInt2554 << 12) < 0) {
						@Pc(932) int local932;
						if ((local932 = local20 - (this.anInt2559 << 12)) >= 0) {
							local939 = (anInt2576 - local932) / anInt2576;
							local22 += local939;
							local20 += anInt2576 * local939;
							local16 += local939;
						}
						@Pc(960) int local960;
						if ((local960 = (local20 - anInt2576) / anInt2576) > local22) {
							local22 = local960;
						}
						while (local22 < 0) {
							local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
							local60 = local16++;
							if (arg1 == 0) {
								if (arg0 == 1) {
									local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								} else if (arg0 == 0) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
									local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
									local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
									local3[local60] = (local98 | local106 | local114) >>> 8;
								} else if (arg0 == 3) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = anInt2582;
									local106 = local90 + local98;
									local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
									local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
									local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
								} else if (arg0 == 2) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
									local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg1 != 1) {
								if (arg1 != 2) {
									throw new IllegalArgumentException();
								}
								if (arg0 == 1) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = local3[local60];
										local114 = local98 + local106;
										local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
										local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
										local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
									}
								} else if (arg0 == 0) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local98 = (local106 | local114 | local162) >>> 8;
										local347 = local3[local60];
										local676 = local98 + local347;
										local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
										local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
										local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
									}
								} else if (arg0 == 3) {
									local230 = this.aByteArray47[local57];
									local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
									local106 = anInt2582;
									local114 = local98 + local106;
									local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
									local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
									local347 = local114 - local347 | local347 - (local347 >>> 8);
									if (local98 == 0 && anInt2578 != 255) {
										local98 = local347;
										local347 = local3[local60];
										local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
									}
									local3[local60] = local347;
								} else if (arg0 == 2) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
										local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
										local98 = ((local106 | local114) >>> 8) + anInt2586;
										local162 = local3[local60];
										local347 = local98 + local162;
										local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
										local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
										local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
									}
								}
							} else if (arg0 == 1) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local3[local60] = this.anIntArray213[local230 & 0xFF];
								}
							} else if (arg0 == 0) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									if ((anInt2582 & 0xFFFFFF) == 16777215) {
										local106 = anInt2582 >>> 24;
										local114 = 256 - local106;
										local162 = local3[local60];
										local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
									} else if (anInt2578 == 255) {
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local3[local60] = (local106 | local114 | local162) >>> 8;
									} else {
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local98 = (local106 | local114 | local162) >>> 8;
										local347 = local3[local60];
										local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local230 = this.aByteArray47[local57];
								local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
								local106 = anInt2582;
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local347 = local114 - local347 | local347 - (local347 >>> 8);
								if (local98 == 0 && anInt2578 != 255) {
									local98 = local347;
									local347 = local3[local60];
									local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
								local3[local60] = local347;
							} else if (arg0 == 2) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
									local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local20 += anInt2576;
							local22++;
						}
					}
					local12++;
					anInt2574 += anInt2570;
					anInt2567 += anInt2566;
				}
			} else {
				local12 = anInt2565;
				while (local12 < 0) {
					local16 = anInt2567;
					local18 = anInt2574;
					local20 = anInt2575 + anInt2577;
					local22 = anInt2563;
					if (local18 >= 0 && local18 - (this.anInt2554 << 12) < 0) {
						if (local20 < 0) {
							local939 = (anInt2576 - 1 - local20) / anInt2576;
							local22 += local939;
							local20 += anInt2576 * local939;
							local16 += local939;
						}
						@Pc(1888) int local1888;
						if ((local1888 = (local20 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local22) {
							local22 = local1888;
						}
						while (local22 < 0) {
							local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
							local60 = local16++;
							if (arg1 == 0) {
								if (arg0 == 1) {
									local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								} else if (arg0 == 0) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
									local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
									local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
									local3[local60] = (local98 | local106 | local114) >>> 8;
								} else if (arg0 == 3) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = anInt2582;
									local106 = local90 + local98;
									local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
									local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
									local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
								} else if (arg0 == 2) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
									local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg1 != 1) {
								if (arg1 != 2) {
									throw new IllegalArgumentException();
								}
								if (arg0 == 1) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = local3[local60];
										local114 = local98 + local106;
										local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
										local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
										local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
									}
								} else if (arg0 == 0) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local98 = (local106 | local114 | local162) >>> 8;
										local347 = local3[local60];
										local676 = local98 + local347;
										local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
										local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
										local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
									}
								} else if (arg0 == 3) {
									local230 = this.aByteArray47[local57];
									local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
									local106 = anInt2582;
									local114 = local98 + local106;
									local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
									local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
									local347 = local114 - local347 | local347 - (local347 >>> 8);
									if (local98 == 0 && anInt2578 != 255) {
										local98 = local347;
										local347 = local3[local60];
										local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
									}
									local3[local60] = local347;
								} else if (arg0 == 2) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
										local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
										local98 = ((local106 | local114) >>> 8) + anInt2586;
										local162 = local3[local60];
										local347 = local98 + local162;
										local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
										local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
										local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
									}
								}
							} else if (arg0 == 1) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local3[local60] = this.anIntArray213[local230 & 0xFF];
								}
							} else if (arg0 == 0) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									if ((anInt2582 & 0xFFFFFF) == 16777215) {
										local106 = anInt2582 >>> 24;
										local114 = 256 - local106;
										local162 = local3[local60];
										local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
									} else if (anInt2578 == 255) {
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local3[local60] = (local106 | local114 | local162) >>> 8;
									} else {
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local98 = (local106 | local114 | local162) >>> 8;
										local347 = local3[local60];
										local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local230 = this.aByteArray47[local57];
								local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
								local106 = anInt2582;
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local347 = local114 - local347 | local347 - (local347 >>> 8);
								if (local98 == 0 && anInt2578 != 255) {
									local98 = local347;
									local347 = local3[local60];
									local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
								local3[local60] = local347;
							} else if (arg0 == 2) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
									local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local20 += anInt2576;
							local22++;
						}
					}
					local12++;
					anInt2574 += anInt2570;
					anInt2567 += anInt2566;
				}
			}
		} else if (anInt2568 < 0) {
			if (anInt2576 == 0) {
				local12 = anInt2565;
				while (local12 < 0) {
					local16 = anInt2567;
					local18 = anInt2574 + anInt2579;
					local20 = anInt2575;
					local22 = anInt2563;
					if (local20 >= 0 && local20 - (this.anInt2559 << 12) < 0) {
						@Pc(2790) int local2790;
						if ((local2790 = local18 - (this.anInt2554 << 12)) >= 0) {
							local939 = (anInt2568 - local2790) / anInt2568;
							local22 += local939;
							local18 += anInt2568 * local939;
							local16 += local939;
						}
						@Pc(2818) int local2818;
						if ((local2818 = (local18 - anInt2568) / anInt2568) > local22) {
							local22 = local2818;
						}
						while (local22 < 0) {
							local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
							local60 = local16++;
							if (arg1 == 0) {
								if (arg0 == 1) {
									local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								} else if (arg0 == 0) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
									local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
									local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
									local3[local60] = (local98 | local106 | local114) >>> 8;
								} else if (arg0 == 3) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = anInt2582;
									local106 = local90 + local98;
									local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
									local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
									local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
								} else if (arg0 == 2) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
									local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg1 != 1) {
								if (arg1 != 2) {
									throw new IllegalArgumentException();
								}
								if (arg0 == 1) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = local3[local60];
										local114 = local98 + local106;
										local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
										local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
										local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
									}
								} else if (arg0 == 0) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local98 = (local106 | local114 | local162) >>> 8;
										local347 = local3[local60];
										local676 = local98 + local347;
										local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
										local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
										local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
									}
								} else if (arg0 == 3) {
									local230 = this.aByteArray47[local57];
									local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
									local106 = anInt2582;
									local114 = local98 + local106;
									local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
									local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
									local347 = local114 - local347 | local347 - (local347 >>> 8);
									if (local98 == 0 && anInt2578 != 255) {
										local98 = local347;
										local347 = local3[local60];
										local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
									}
									local3[local60] = local347;
								} else if (arg0 == 2) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
										local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
										local98 = ((local106 | local114) >>> 8) + anInt2586;
										local162 = local3[local60];
										local347 = local98 + local162;
										local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
										local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
										local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
									}
								}
							} else if (arg0 == 1) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local3[local60] = this.anIntArray213[local230 & 0xFF];
								}
							} else if (arg0 == 0) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									if ((anInt2582 & 0xFFFFFF) == 16777215) {
										local106 = anInt2582 >>> 24;
										local114 = 256 - local106;
										local162 = local3[local60];
										local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
									} else if (anInt2578 == 255) {
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local3[local60] = (local106 | local114 | local162) >>> 8;
									} else {
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local98 = (local106 | local114 | local162) >>> 8;
										local347 = local3[local60];
										local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local230 = this.aByteArray47[local57];
								local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
								local106 = anInt2582;
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local347 = local114 - local347 | local347 - (local347 >>> 8);
								if (local98 == 0 && anInt2578 != 255) {
									local98 = local347;
									local347 = local3[local60];
									local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
								local3[local60] = local347;
							} else if (arg0 == 2) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
									local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local18 += anInt2568;
							local22++;
						}
					}
					local12++;
					anInt2575 += anInt2560;
					anInt2567 += anInt2566;
				}
			} else if (anInt2576 < 0) {
				local12 = anInt2565;
				while (local12 < 0) {
					local16 = anInt2567;
					local18 = anInt2574 + anInt2579;
					local20 = anInt2575 + anInt2577;
					local22 = anInt2563;
					@Pc(3709) int local3709;
					if ((local3709 = local18 - (this.anInt2554 << 12)) >= 0) {
						local939 = (anInt2568 - local3709) / anInt2568;
						local22 += local939;
						local18 += anInt2568 * local939;
						local20 += anInt2576 * local939;
						local16 += local939;
					}
					@Pc(3743) int local3743;
					if ((local3743 = (local18 - anInt2568) / anInt2568) > local22) {
						local22 = local3743;
					}
					@Pc(3755) int local3755;
					if ((local3755 = local20 - (this.anInt2559 << 12)) >= 0) {
						local939 = (anInt2576 - local3755) / anInt2576;
						local22 += local939;
						local18 += anInt2568 * local939;
						local20 += anInt2576 * local939;
						local16 += local939;
					}
					@Pc(3789) int local3789;
					if ((local3789 = (local20 - anInt2576) / anInt2576) > local22) {
						local22 = local3789;
					}
					while (local22 < 0) {
						local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
						local60 = local16++;
						if (arg1 == 0) {
							if (arg0 == 1) {
								local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							} else if (arg0 == 0) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
								local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
								local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
								local3[local60] = (local98 | local106 | local114) >>> 8;
							} else if (arg0 == 3) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = anInt2582;
								local106 = local90 + local98;
								local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
								local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
								local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
							} else if (arg0 == 2) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
								local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
								local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (arg1 != 1) {
							if (arg1 != 2) {
								throw new IllegalArgumentException();
							}
							if (arg0 == 1) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = local3[local60];
									local114 = local98 + local106;
									local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
									local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
									local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
								}
							} else if (arg0 == 0) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local98 = (local106 | local114 | local162) >>> 8;
									local347 = local3[local60];
									local676 = local98 + local347;
									local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
									local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
									local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
								}
							} else if (arg0 == 3) {
								local230 = this.aByteArray47[local57];
								local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
								local106 = anInt2582;
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local347 = local114 - local347 | local347 - (local347 >>> 8);
								if (local98 == 0 && anInt2578 != 255) {
									local98 = local347;
									local347 = local3[local60];
									local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
								local3[local60] = local347;
							} else if (arg0 == 2) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
									local98 = ((local106 | local114) >>> 8) + anInt2586;
									local162 = local3[local60];
									local347 = local98 + local162;
									local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
									local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
									local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
								}
							}
						} else if (arg0 == 1) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local3[local60] = this.anIntArray213[local230 & 0xFF];
							}
						} else if (arg0 == 0) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								if ((anInt2582 & 0xFFFFFF) == 16777215) {
									local106 = anInt2582 >>> 24;
									local114 = 256 - local106;
									local162 = local3[local60];
									local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
								} else if (anInt2578 == 255) {
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local3[local60] = (local106 | local114 | local162) >>> 8;
								} else {
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local98 = (local106 | local114 | local162) >>> 8;
									local347 = local3[local60];
									local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local230 = this.aByteArray47[local57];
							local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
							local106 = anInt2582;
							local114 = local98 + local106;
							local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
							local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
							local347 = local114 - local347 | local347 - (local347 >>> 8);
							if (local98 == 0 && anInt2578 != 255) {
								local98 = local347;
								local347 = local3[local60];
								local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
							}
							local3[local60] = local347;
						} else if (arg0 == 2) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
								local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
								local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local18 += anInt2568;
						local20 += anInt2576;
						local22++;
					}
					local12++;
					anInt2574 += anInt2570;
					anInt2575 += anInt2560;
					anInt2567 += anInt2566;
				}
			} else {
				local12 = anInt2565;
				while (local12 < 0) {
					local16 = anInt2567;
					local18 = anInt2574 + anInt2579;
					local20 = anInt2575 + anInt2577;
					local22 = anInt2563;
					@Pc(4686) int local4686;
					if ((local4686 = local18 - (this.anInt2554 << 12)) >= 0) {
						local939 = (anInt2568 - local4686) / anInt2568;
						local22 += local939;
						local18 += anInt2568 * local939;
						local20 += anInt2576 * local939;
						local16 += local939;
					}
					@Pc(4720) int local4720;
					if ((local4720 = (local18 - anInt2568) / anInt2568) > local22) {
						local22 = local4720;
					}
					if (local20 < 0) {
						local939 = (anInt2576 - 1 - local20) / anInt2576;
						local22 += local939;
						local18 += anInt2568 * local939;
						local20 += anInt2576 * local939;
						local16 += local939;
					}
					@Pc(4768) int local4768;
					if ((local4768 = (local20 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local22) {
						local22 = local4768;
					}
					while (local22 < 0) {
						local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
						local60 = local16++;
						if (arg1 == 0) {
							if (arg0 == 1) {
								local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							} else if (arg0 == 0) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
								local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
								local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
								local3[local60] = (local98 | local106 | local114) >>> 8;
							} else if (arg0 == 3) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = anInt2582;
								local106 = local90 + local98;
								local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
								local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
								local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
							} else if (arg0 == 2) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
								local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
								local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (arg1 != 1) {
							if (arg1 != 2) {
								throw new IllegalArgumentException();
							}
							if (arg0 == 1) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = local3[local60];
									local114 = local98 + local106;
									local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
									local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
									local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
								}
							} else if (arg0 == 0) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local98 = (local106 | local114 | local162) >>> 8;
									local347 = local3[local60];
									local676 = local98 + local347;
									local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
									local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
									local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
								}
							} else if (arg0 == 3) {
								local230 = this.aByteArray47[local57];
								local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
								local106 = anInt2582;
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local347 = local114 - local347 | local347 - (local347 >>> 8);
								if (local98 == 0 && anInt2578 != 255) {
									local98 = local347;
									local347 = local3[local60];
									local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
								local3[local60] = local347;
							} else if (arg0 == 2) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
									local98 = ((local106 | local114) >>> 8) + anInt2586;
									local162 = local3[local60];
									local347 = local98 + local162;
									local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
									local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
									local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
								}
							}
						} else if (arg0 == 1) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local3[local60] = this.anIntArray213[local230 & 0xFF];
							}
						} else if (arg0 == 0) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								if ((anInt2582 & 0xFFFFFF) == 16777215) {
									local106 = anInt2582 >>> 24;
									local114 = 256 - local106;
									local162 = local3[local60];
									local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
								} else if (anInt2578 == 255) {
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local3[local60] = (local106 | local114 | local162) >>> 8;
								} else {
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local98 = (local106 | local114 | local162) >>> 8;
									local347 = local3[local60];
									local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local230 = this.aByteArray47[local57];
							local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
							local106 = anInt2582;
							local114 = local98 + local106;
							local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
							local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
							local347 = local114 - local347 | local347 - (local347 >>> 8);
							if (local98 == 0 && anInt2578 != 255) {
								local98 = local347;
								local347 = local3[local60];
								local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
							}
							local3[local60] = local347;
						} else if (arg0 == 2) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
								local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
								local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local18 += anInt2568;
						local20 += anInt2576;
						local22++;
					}
					local12++;
					anInt2574 += anInt2570;
					anInt2575 += anInt2560;
					anInt2567 += anInt2566;
				}
			}
		} else if (anInt2576 == 0) {
			local12 = anInt2565;
			while (local12 < 0) {
				local16 = anInt2567;
				local18 = anInt2574 + anInt2579;
				local20 = anInt2575;
				local22 = anInt2563;
				if (local20 >= 0 && local20 - (this.anInt2559 << 12) < 0) {
					if (local18 < 0) {
						local939 = (anInt2568 - 1 - local18) / anInt2568;
						local22 += local939;
						local18 += anInt2568 * local939;
						local16 += local939;
					}
					@Pc(5706) int local5706;
					if ((local5706 = (local18 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local22) {
						local22 = local5706;
					}
					while (local22 < 0) {
						local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
						local60 = local16++;
						if (arg1 == 0) {
							if (arg0 == 1) {
								local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							} else if (arg0 == 0) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
								local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
								local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
								local3[local60] = (local98 | local106 | local114) >>> 8;
							} else if (arg0 == 3) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = anInt2582;
								local106 = local90 + local98;
								local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
								local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
								local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
							} else if (arg0 == 2) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
								local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
								local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (arg1 != 1) {
							if (arg1 != 2) {
								throw new IllegalArgumentException();
							}
							if (arg0 == 1) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = local3[local60];
									local114 = local98 + local106;
									local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
									local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
									local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
								}
							} else if (arg0 == 0) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local98 = (local106 | local114 | local162) >>> 8;
									local347 = local3[local60];
									local676 = local98 + local347;
									local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
									local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
									local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
								}
							} else if (arg0 == 3) {
								local230 = this.aByteArray47[local57];
								local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
								local106 = anInt2582;
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local347 = local114 - local347 | local347 - (local347 >>> 8);
								if (local98 == 0 && anInt2578 != 255) {
									local98 = local347;
									local347 = local3[local60];
									local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
								local3[local60] = local347;
							} else if (arg0 == 2) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
									local98 = ((local106 | local114) >>> 8) + anInt2586;
									local162 = local3[local60];
									local347 = local98 + local162;
									local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
									local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
									local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
								}
							}
						} else if (arg0 == 1) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local3[local60] = this.anIntArray213[local230 & 0xFF];
							}
						} else if (arg0 == 0) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								if ((anInt2582 & 0xFFFFFF) == 16777215) {
									local106 = anInt2582 >>> 24;
									local114 = 256 - local106;
									local162 = local3[local60];
									local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
								} else if (anInt2578 == 255) {
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local3[local60] = (local106 | local114 | local162) >>> 8;
								} else {
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local98 = (local106 | local114 | local162) >>> 8;
									local347 = local3[local60];
									local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local230 = this.aByteArray47[local57];
							local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
							local106 = anInt2582;
							local114 = local98 + local106;
							local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
							local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
							local347 = local114 - local347 | local347 - (local347 >>> 8);
							if (local98 == 0 && anInt2578 != 255) {
								local98 = local347;
								local347 = local3[local60];
								local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
							}
							local3[local60] = local347;
						} else if (arg0 == 2) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
								local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
								local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local18 += anInt2568;
						local22++;
					}
				}
				local12++;
				anInt2574 += anInt2570;
				anInt2575 += anInt2560;
				anInt2567 += anInt2566;
			}
		} else if (anInt2576 < 0) {
			for (local12 = anInt2565; local12 < 0; local12++) {
				local16 = anInt2567;
				local18 = anInt2574 + anInt2579;
				local20 = anInt2575 + anInt2577;
				local22 = anInt2563;
				if (local18 < 0) {
					local939 = (anInt2568 - 1 - local18) / anInt2568;
					local22 += local939;
					local18 += anInt2568 * local939;
					local20 += anInt2576 * local939;
					local16 += local939;
				}
				@Pc(6637) int local6637;
				if ((local6637 = (local18 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local22) {
					local22 = local6637;
				}
				@Pc(6649) int local6649;
				if ((local6649 = local20 - (this.anInt2559 << 12)) >= 0) {
					local939 = (anInt2576 - local6649) / anInt2576;
					local22 += local939;
					local18 += anInt2568 * local939;
					local20 += anInt2576 * local939;
					local16 += local939;
				}
				@Pc(6683) int local6683;
				if ((local6683 = (local20 - anInt2576) / anInt2576) > local22) {
					local22 = local6683;
				}
				while (local22 < 0) {
					local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
					local60 = local16++;
					if (arg1 == 0) {
						if (arg0 == 1) {
							local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
						} else if (arg0 == 0) {
							local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
							local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
							local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
							local3[local60] = (local98 | local106 | local114) >>> 8;
						} else if (arg0 == 3) {
							local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							local98 = anInt2582;
							local106 = local90 + local98;
							local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
							local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
							local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
						} else if (arg0 == 2) {
							local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
							local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
							local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
						} else {
							throw new IllegalArgumentException();
						}
					} else if (arg1 != 1) {
						if (arg1 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg0 == 1) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = local3[local60];
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
							}
						} else if (arg0 == 0) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
								local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
								local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
								local98 = (local106 | local114 | local162) >>> 8;
								local347 = local3[local60];
								local676 = local98 + local347;
								local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
								local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
								local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
							}
						} else if (arg0 == 3) {
							local230 = this.aByteArray47[local57];
							local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
							local106 = anInt2582;
							local114 = local98 + local106;
							local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
							local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
							local347 = local114 - local347 | local347 - (local347 >>> 8);
							if (local98 == 0 && anInt2578 != 255) {
								local98 = local347;
								local347 = local3[local60];
								local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
							}
							local3[local60] = local347;
						} else if (arg0 == 2) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
								local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
								local98 = ((local106 | local114) >>> 8) + anInt2586;
								local162 = local3[local60];
								local347 = local98 + local162;
								local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
								local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
								local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
							}
						}
					} else if (arg0 == 1) {
						local230 = this.aByteArray47[local57];
						if (local230 != 0) {
							local3[local60] = this.anIntArray213[local230 & 0xFF];
						}
					} else if (arg0 == 0) {
						local230 = this.aByteArray47[local57];
						if (local230 != 0) {
							local98 = this.anIntArray213[local230 & 0xFF];
							if ((anInt2582 & 0xFFFFFF) == 16777215) {
								local106 = anInt2582 >>> 24;
								local114 = 256 - local106;
								local162 = local3[local60];
								local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
							} else if (anInt2578 == 255) {
								local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
								local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
								local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
								local3[local60] = (local106 | local114 | local162) >>> 8;
							} else {
								local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
								local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
								local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
								local98 = (local106 | local114 | local162) >>> 8;
								local347 = local3[local60];
								local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						local230 = this.aByteArray47[local57];
						local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
						local106 = anInt2582;
						local114 = local98 + local106;
						local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
						local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
						local347 = local114 - local347 | local347 - (local347 >>> 8);
						if (local98 == 0 && anInt2578 != 255) {
							local98 = local347;
							local347 = local3[local60];
							local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
						}
						local3[local60] = local347;
					} else if (arg0 == 2) {
						local230 = this.aByteArray47[local57];
						if (local230 != 0) {
							local98 = this.anIntArray213[local230 & 0xFF];
							local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
							local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
							local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
						}
					} else {
						throw new IllegalArgumentException();
					}
					local18 += anInt2568;
					local20 += anInt2576;
					local22++;
				}
				anInt2574 += anInt2570;
				anInt2575 += anInt2560;
				anInt2567 += anInt2566;
			}
		} else {
			for (local12 = anInt2565; local12 < 0; local12++) {
				local16 = anInt2567;
				local18 = anInt2574 + anInt2579;
				local20 = anInt2575 + anInt2577;
				local22 = anInt2563;
				if (local18 < 0) {
					local939 = (anInt2568 - 1 - local18) / anInt2568;
					local22 += local939;
					local18 += anInt2568 * local939;
					local20 += anInt2576 * local939;
					local16 += local939;
				}
				@Pc(7616) int local7616;
				if ((local7616 = (local18 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local22) {
					local22 = local7616;
				}
				if (local20 < 0) {
					local939 = (anInt2576 - 1 - local20) / anInt2576;
					local22 += local939;
					local18 += anInt2568 * local939;
					local20 += anInt2576 * local939;
					local16 += local939;
				}
				@Pc(7664) int local7664;
				if ((local7664 = (local20 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local22) {
					local22 = local7664;
				}
				while (local22 < 0) {
					local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
					local60 = local16++;
					if (arg1 == 0) {
						if (arg0 == 1) {
							local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
						} else if (arg0 == 0) {
							local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
							local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
							local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
							local3[local60] = (local98 | local106 | local114) >>> 8;
						} else if (arg0 == 3) {
							local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							local98 = anInt2582;
							local106 = local90 + local98;
							local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
							local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
							local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
						} else if (arg0 == 2) {
							local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
							local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
							local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
						} else {
							throw new IllegalArgumentException();
						}
					} else if (arg1 != 1) {
						if (arg1 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg0 == 1) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = local3[local60];
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
							}
						} else if (arg0 == 0) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
								local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
								local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
								local98 = (local106 | local114 | local162) >>> 8;
								local347 = local3[local60];
								local676 = local98 + local347;
								local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
								local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
								local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
							}
						} else if (arg0 == 3) {
							local230 = this.aByteArray47[local57];
							local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
							local106 = anInt2582;
							local114 = local98 + local106;
							local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
							local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
							local347 = local114 - local347 | local347 - (local347 >>> 8);
							if (local98 == 0 && anInt2578 != 255) {
								local98 = local347;
								local347 = local3[local60];
								local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
							}
							local3[local60] = local347;
						} else if (arg0 == 2) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
								local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
								local98 = ((local106 | local114) >>> 8) + anInt2586;
								local162 = local3[local60];
								local347 = local98 + local162;
								local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
								local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
								local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
							}
						}
					} else if (arg0 == 1) {
						local230 = this.aByteArray47[local57];
						if (local230 != 0) {
							local3[local60] = this.anIntArray213[local230 & 0xFF];
						}
					} else if (arg0 == 0) {
						local230 = this.aByteArray47[local57];
						if (local230 != 0) {
							local98 = this.anIntArray213[local230 & 0xFF];
							if ((anInt2582 & 0xFFFFFF) == 16777215) {
								local106 = anInt2582 >>> 24;
								local114 = 256 - local106;
								local162 = local3[local60];
								local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
							} else if (anInt2578 == 255) {
								local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
								local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
								local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
								local3[local60] = (local106 | local114 | local162) >>> 8;
							} else {
								local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
								local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
								local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
								local98 = (local106 | local114 | local162) >>> 8;
								local347 = local3[local60];
								local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						local230 = this.aByteArray47[local57];
						local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
						local106 = anInt2582;
						local114 = local98 + local106;
						local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
						local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
						local347 = local114 - local347 | local347 - (local347 >>> 8);
						if (local98 == 0 && anInt2578 != 255) {
							local98 = local347;
							local347 = local3[local60];
							local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
						}
						local3[local60] = local347;
					} else if (arg0 == 2) {
						local230 = this.aByteArray47[local57];
						if (local230 != 0) {
							local98 = this.anIntArray213[local230 & 0xFF];
							local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
							local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
							local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
						}
					} else {
						throw new IllegalArgumentException();
					}
					local18 += anInt2568;
					local20 += anInt2576;
					local22++;
				}
				anInt2574 += anInt2570;
				anInt2575 += anInt2560;
				anInt2567 += anInt2566;
			}
		}
	}

	@OriginalMember(owner = "client!apf", name = "ao", descriptor = "(IIII[I[III)V")
	@Override
	public void method18286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!apf", name = "aj", descriptor = "(IIIIII)V")
	@Override
	public void method18233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!apf", name = "af", descriptor = "()Lclient!do;")
	@Override
	public Interface18 method18250() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!apf", name = "ag", descriptor = "(IIIIII)V")
	@Override
	public void method18248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!apf", name = "ab", descriptor = "(III)V")
	@Override
	public void method18247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!apf", name = "al", descriptor = "(III)V")
	@Override
	public void method18215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!apf", name = "ah", descriptor = "()Lclient!do;")
	@Override
	public Interface18 method18249() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!apf", name = "j", descriptor = "(IIIIII)V")
	@Override
	public void method18223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!apf", name = "am", descriptor = "(IIIII)V")
	@Override
	public void method18251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass102_Sub2_10.method5094()) {
			throw new IllegalStateException();
		}
		@Pc(11) int[] local11 = this.aClass102_Sub2_10.anIntArray50;
		if (local11 == null) {
			return;
		}
		@Pc(20) int local20 = this.aClass102_Sub2_10.anInt638 * 513500097;
		arg0 += this.anInt2555;
		arg1 += this.anInt2556;
		@Pc(36) int local36 = arg1 * local20 + arg0;
		@Pc(38) int local38 = 0;
		@Pc(41) int local41 = this.anInt2559;
		@Pc(44) int local44 = this.anInt2554;
		@Pc(48) int local48 = local20 - local44;
		@Pc(50) int local50 = 0;
		@Pc(65) int local65;
		if (arg1 < this.aClass102_Sub2_10.anInt645 * -1878420243) {
			local65 = this.aClass102_Sub2_10.anInt645 * -1878420243 - arg1;
			local41 -= local65;
			arg1 = this.aClass102_Sub2_10.anInt645 * -1878420243;
			local38 += local65 * local44;
			local36 += local65 * local20;
		}
		if (arg1 + local41 > this.aClass102_Sub2_10.anInt639 * 725126603) {
			local41 -= arg1 + local41 - this.aClass102_Sub2_10.anInt639 * 725126603;
		}
		if (arg0 < this.aClass102_Sub2_10.anInt637 * 531468375) {
			local65 = this.aClass102_Sub2_10.anInt637 * 531468375 - arg0;
			local44 -= local65;
			arg0 = this.aClass102_Sub2_10.anInt637 * 531468375;
			local38 += local65;
			local36 += local65;
			local50 += local65;
			local48 += local65;
		}
		if (arg0 + local44 > this.aClass102_Sub2_10.anInt634 * 469139509) {
			local65 = arg0 + local44 - this.aClass102_Sub2_10.anInt634 * 469139509;
			local44 -= local65;
			local50 += local65;
			local48 += local65;
		}
		if (local44 <= 0 || local41 <= 0) {
			return;
		}
		@Pc(201) int local201;
		@Pc(309) int local309;
		@Pc(312) int local312;
		@Pc(317) int local317;
		@Pc(330) int local330;
		@Pc(338) int local338;
		@Pc(346) int local346;
		@Pc(354) int local354;
		@Pc(483) int local483;
		if (arg4 != 0) {
			@Pc(793) int local793;
			@Pc(801) int local801;
			@Pc(809) int local809;
			@Pc(821) int local821;
			@Pc(570) byte local570;
			@Pc(1081) byte local1081;
			if (arg4 != 1) {
				if (arg4 != 2) {
					throw new IllegalArgumentException();
				}
				if (arg2 == 1) {
					for (local65 = -local41; local65 < 0; local65++) {
						for (local201 = -local44; local201 < 0; local201++) {
							local570 = this.aByteArray47[local38++];
							if (local570 == 0) {
								local36++;
							} else {
								local312 = this.anIntArray213[local570 & 0xFF];
								local317 = local11[local36];
								local330 = local312 + local317;
								local338 = (local312 & 0xFF00FF) + (local317 & 0xFF00FF);
								local317 = (local338 & 0x1000100) + (local330 - local338 & 0x10000);
								local11[local36++] = local330 - local317 | local317 - (local317 >>> 8);
							}
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 0) {
					local65 = arg3 >> 16 & 0xFF;
					local201 = arg3 >> 8 & 0xFF;
					local309 = arg3 & 0xFF;
					for (local312 = -local41; local312 < 0; local312++) {
						for (local317 = -local44; local317 < 0; local317++) {
							@Pc(1255) byte local1255 = this.aByteArray47[local38++];
							if (local1255 == 0) {
								local36++;
							} else {
								local338 = this.anIntArray213[local1255 & 0xFF];
								local346 = (local338 & 0xFF0000) * local65 & 0xFF000000;
								local354 = (local338 & 0xFF00) * local201 & 0xFF0000;
								local793 = (local338 & 0xFF) * local309 & 0xFF00;
								local338 = (local346 | local354 | local793) >>> 8;
								local801 = local11[local36];
								local809 = local338 + local801;
								local821 = (local338 & 0xFF00FF) + (local801 & 0xFF00FF);
								local801 = (local821 & 0x1000100) + (local809 - local821 & 0x10000);
								local11[local36++] = local809 - local801 | local801 - (local801 >>> 8);
							}
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 3) {
					for (local65 = -local41; local65 < 0; local65++) {
						for (local201 = -local44; local201 < 0; local201++) {
							local570 = this.aByteArray47[local38++];
							local312 = local570 > 0 ? this.anIntArray213[local570] : 0;
							local317 = local312 + arg3;
							local330 = (local312 & 0xFF00FF) + (arg3 & 0xFF00FF);
							local338 = (local330 & 0x1000100) + (local317 - local330 & 0x10000);
							local312 = local317 - local338 | local338 - (local338 >>> 8);
							local338 = local11[local36];
							local317 = local312 + local338;
							local330 = (local312 & 0xFF00FF) + (local338 & 0xFF00FF);
							local338 = (local330 & 0x1000100) + (local317 - local330 & 0x10000);
							local11[local36++] = local317 - local338 | local338 - (local338 >>> 8);
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 2) {
					local65 = arg3 >>> 24;
					local201 = 256 - local65;
					local309 = (arg3 & 0xFF00FF) * local201 & 0xFF00FF00;
					local312 = (arg3 & 0xFF00) * local201 & 0xFF0000;
					local483 = (local309 | local312) >>> 8;
					for (local317 = -local41; local317 < 0; local317++) {
						for (local330 = -local44; local330 < 0; local330++) {
							local1081 = this.aByteArray47[local38++];
							if (local1081 == 0) {
								local36++;
							} else {
								local346 = this.anIntArray213[local1081 & 0xFF];
								local309 = (local346 & 0xFF00FF) * local65 & 0xFF00FF00;
								local312 = (local346 & 0xFF00) * local65 & 0xFF0000;
								local346 = ((local309 | local312) >>> 8) + local483;
								local354 = local11[local36];
								local793 = local346 + local354;
								local801 = (local346 & 0xFF00FF) + (local354 & 0xFF00FF);
								local354 = (local801 & 0x1000100) + (local793 - local801 & 0x10000);
								local11[local36++] = local793 - local354 | local354 - (local354 >>> 8);
							}
						}
						local36 += local48;
						local38 += local50;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg2 == 1) {
				for (local65 = -local41; local65 < 0; local65++) {
					for (local201 = -local44; local201 < 0; local201++) {
						local570 = this.aByteArray47[local38++];
						if (local570 == 0) {
							local36++;
						} else {
							local312 = this.anIntArray213[local570 & 0xFF] | 0xFF000000;
							@Pc(583) short local583 = 255;
							@Pc(585) byte local585 = 0;
							local338 = local11[local36];
							local11[local36++] = ((local312 & 0xFF00FF) * local583 + (local338 & 0xFF00FF) * local585 >> 8 & 0xFFFF00FF) + (((local312 & 0xFF00FF00) >>> 8) * local583 + ((local338 & 0xFF00FF00) >>> 8) * local585 & 0xFF00FF00);
						}
					}
					local36 += local48;
					local38 += local50;
				}
			} else {
				@Pc(672) byte local672;
				if (arg2 == 0) {
					if ((arg3 & 0xFFFFFF) == 16777215) {
						local65 = arg3 >>> 24;
						local201 = 256 - local65;
						for (local309 = -local41; local309 < 0; local309++) {
							for (local312 = -local44; local312 < 0; local312++) {
								local672 = this.aByteArray47[local38++];
								if (local672 == 0) {
									local36++;
								} else {
									local330 = this.anIntArray213[local672 & 0xFF];
									local338 = local11[local36];
									local11[local36++] = ((local330 & 0xFF00FF) * local65 + (local338 & 0xFF00FF) * local201 & 0xFF00FF00) + ((local330 & 0xFF00) * local65 + (local338 & 0xFF00) * local201 & 0xFF0000) >> 8;
								}
							}
							local36 += local48;
							local38 += local50;
						}
					} else {
						local65 = arg3 >> 16 & 0xFF;
						local201 = arg3 >> 8 & 0xFF;
						local309 = arg3 & 0xFF;
						local312 = arg3 >>> 24;
						local317 = 256 - local312;
						for (local330 = -local41; local330 < 0; local330++) {
							for (local338 = -local44; local338 < 0; local338++) {
								@Pc(773) byte local773 = this.aByteArray47[local38++];
								if (local773 == 0) {
									local36++;
								} else {
									local354 = this.anIntArray213[local773 & 0xFF];
									if (local312 == 255) {
										local793 = (local354 & 0xFF0000) * local65 & 0xFF000000;
										local801 = (local354 & 0xFF00) * local201 & 0xFF0000;
										local809 = (local354 & 0xFF) * local309 & 0xFF00;
										local11[local36++] = (local793 | local801 | local809) >>> 8;
									} else {
										local793 = (local354 & 0xFF0000) * local65 & 0xFF000000;
										local801 = (local354 & 0xFF00) * local201 & 0xFF0000;
										local809 = (local354 & 0xFF) * local309 & 0xFF00;
										local354 = (local793 | local801 | local809) >>> 8;
										local821 = local11[local36];
										local11[local36++] = ((local354 & 0xFF00FF) * local312 + (local821 & 0xFF00FF) * local317 & 0xFF00FF00) + ((local354 & 0xFF00) * local312 + (local821 & 0xFF00) * local317 & 0xFF0000) >> 8;
									}
								}
							}
							local36 += local48;
							local38 += local50;
						}
					}
				} else if (arg2 == 3) {
					local65 = arg3 >>> 24;
					local201 = 256 - local65;
					for (local309 = -local41; local309 < 0; local309++) {
						for (local312 = -local44; local312 < 0; local312++) {
							local672 = this.aByteArray47[local38++];
							local330 = local672 > 0 ? this.anIntArray213[local672] : 0;
							local338 = local330 + arg3;
							local346 = (local330 & 0xFF00FF) + (arg3 & 0xFF00FF);
							local354 = (local346 & 0x1000100) + (local338 - local346 & 0x10000);
							local354 = local338 - local354 | local354 - (local354 >>> 8);
							if (local330 == 0 && local65 != 255) {
								local330 = local354;
								local354 = local11[local36];
								local354 = ((local330 & 0xFF00FF) * local65 + (local354 & 0xFF00FF) * local201 & 0xFF00FF00) + ((local330 & 0xFF00) * local65 + (local354 & 0xFF00) * local201 & 0xFF0000) >> 8;
							}
							local11[local36++] = local354;
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 2) {
					local65 = arg3 >>> 24;
					local201 = 256 - local65;
					local309 = (arg3 & 0xFF00FF) * local201 & 0xFF00FF00;
					local312 = (arg3 & 0xFF00) * local201 & 0xFF0000;
					local483 = (local309 | local312) >>> 8;
					for (local317 = -local41; local317 < 0; local317++) {
						for (local330 = -local44; local330 < 0; local330++) {
							local1081 = this.aByteArray47[local38++];
							if (local1081 == 0) {
								local36++;
							} else {
								local346 = this.anIntArray213[local1081 & 0xFF];
								local309 = (local346 & 0xFF00FF) * local65 & 0xFF00FF00;
								local312 = (local346 & 0xFF00) * local65 & 0xFF0000;
								local11[local36++] = ((local309 | local312) >>> 8) + local483;
							}
						}
						local36 += local48;
						local38 += local50;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg2 == 1) {
			for (local65 = -local41; local65 < 0; local65++) {
				local201 = local36 + local44 - 3;
				while (local36 < local201) {
					local11[local36++] = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
					local11[local36++] = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
					local11[local36++] = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
					local11[local36++] = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
				}
				local201 += 3;
				while (local36 < local201) {
					local11[local36++] = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
				}
				local36 += local48;
				local38 += local50;
			}
		} else if (arg2 == 0) {
			local65 = arg3 >> 16 & 0xFF;
			local201 = arg3 >> 8 & 0xFF;
			local309 = arg3 & 0xFF;
			for (local312 = -local41; local312 < 0; local312++) {
				for (local317 = -local44; local317 < 0; local317++) {
					local330 = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
					local338 = (local330 & 0xFF0000) * local65 & 0xFF000000;
					local346 = (local330 & 0xFF00) * local201 & 0xFF0000;
					local354 = (local330 & 0xFF) * local309 & 0xFF00;
					local11[local36++] = (local338 | local346 | local354) >>> 8;
				}
				local36 += local48;
				local38 += local50;
			}
		} else if (arg2 == 3) {
			for (local65 = -local41; local65 < 0; local65++) {
				for (local201 = -local44; local201 < 0; local201++) {
					local309 = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
					local312 = local309 + arg3;
					local317 = (local309 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local330 = (local317 & 0x1000100) + (local312 - local317 & 0x10000);
					local11[local36++] = local312 - local330 | local330 - (local330 >>> 8);
				}
				local36 += local48;
				local38 += local50;
			}
		} else if (arg2 == 2) {
			local65 = arg3 >>> 24;
			local201 = 256 - local65;
			local309 = (arg3 & 0xFF00FF) * local201 & 0xFF00FF00;
			local312 = (arg3 & 0xFF00) * local201 & 0xFF0000;
			local483 = (local309 | local312) >>> 8;
			for (local317 = -local41; local317 < 0; local317++) {
				for (local330 = -local44; local330 < 0; local330++) {
					local338 = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
					local309 = (local338 & 0xFF00FF) * local65 & 0xFF00FF00;
					local312 = (local338 & 0xFF00) * local65 & 0xFF0000;
					local11[local36++] = ((local309 | local312) >>> 8) + local483;
				}
				local36 += local48;
				local38 += local50;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!apf", name = "ac", descriptor = "(IIIIII)V")
	@Override
	public void method18246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!apf", name = "ak", descriptor = "(IIIII)V")
	@Override
	public void method18240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass102_Sub2_10.method5094()) {
			throw new IllegalStateException();
		}
		@Pc(11) int[] local11 = this.aClass102_Sub2_10.anIntArray50;
		if (local11 == null) {
			return;
		}
		@Pc(20) int local20 = this.aClass102_Sub2_10.anInt638 * 513500097;
		arg0 += this.anInt2555;
		arg1 += this.anInt2556;
		@Pc(36) int local36 = arg1 * local20 + arg0;
		@Pc(38) int local38 = 0;
		@Pc(41) int local41 = this.anInt2559;
		@Pc(44) int local44 = this.anInt2554;
		@Pc(48) int local48 = local20 - local44;
		@Pc(50) int local50 = 0;
		@Pc(65) int local65;
		if (arg1 < this.aClass102_Sub2_10.anInt645 * -1878420243) {
			local65 = this.aClass102_Sub2_10.anInt645 * -1878420243 - arg1;
			local41 -= local65;
			arg1 = this.aClass102_Sub2_10.anInt645 * -1878420243;
			local38 += local65 * local44;
			local36 += local65 * local20;
		}
		if (arg1 + local41 > this.aClass102_Sub2_10.anInt639 * 725126603) {
			local41 -= arg1 + local41 - this.aClass102_Sub2_10.anInt639 * 725126603;
		}
		if (arg0 < this.aClass102_Sub2_10.anInt637 * 531468375) {
			local65 = this.aClass102_Sub2_10.anInt637 * 531468375 - arg0;
			local44 -= local65;
			arg0 = this.aClass102_Sub2_10.anInt637 * 531468375;
			local38 += local65;
			local36 += local65;
			local50 += local65;
			local48 += local65;
		}
		if (arg0 + local44 > this.aClass102_Sub2_10.anInt634 * 469139509) {
			local65 = arg0 + local44 - this.aClass102_Sub2_10.anInt634 * 469139509;
			local44 -= local65;
			local50 += local65;
			local48 += local65;
		}
		if (local44 <= 0 || local41 <= 0) {
			return;
		}
		@Pc(201) int local201;
		@Pc(309) int local309;
		@Pc(312) int local312;
		@Pc(317) int local317;
		@Pc(330) int local330;
		@Pc(338) int local338;
		@Pc(346) int local346;
		@Pc(354) int local354;
		@Pc(483) int local483;
		if (arg4 != 0) {
			@Pc(793) int local793;
			@Pc(801) int local801;
			@Pc(809) int local809;
			@Pc(821) int local821;
			@Pc(570) byte local570;
			@Pc(1081) byte local1081;
			if (arg4 != 1) {
				if (arg4 != 2) {
					throw new IllegalArgumentException();
				}
				if (arg2 == 1) {
					for (local65 = -local41; local65 < 0; local65++) {
						for (local201 = -local44; local201 < 0; local201++) {
							local570 = this.aByteArray47[local38++];
							if (local570 == 0) {
								local36++;
							} else {
								local312 = this.anIntArray213[local570 & 0xFF];
								local317 = local11[local36];
								local330 = local312 + local317;
								local338 = (local312 & 0xFF00FF) + (local317 & 0xFF00FF);
								local317 = (local338 & 0x1000100) + (local330 - local338 & 0x10000);
								local11[local36++] = local330 - local317 | local317 - (local317 >>> 8);
							}
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 0) {
					local65 = arg3 >> 16 & 0xFF;
					local201 = arg3 >> 8 & 0xFF;
					local309 = arg3 & 0xFF;
					for (local312 = -local41; local312 < 0; local312++) {
						for (local317 = -local44; local317 < 0; local317++) {
							@Pc(1255) byte local1255 = this.aByteArray47[local38++];
							if (local1255 == 0) {
								local36++;
							} else {
								local338 = this.anIntArray213[local1255 & 0xFF];
								local346 = (local338 & 0xFF0000) * local65 & 0xFF000000;
								local354 = (local338 & 0xFF00) * local201 & 0xFF0000;
								local793 = (local338 & 0xFF) * local309 & 0xFF00;
								local338 = (local346 | local354 | local793) >>> 8;
								local801 = local11[local36];
								local809 = local338 + local801;
								local821 = (local338 & 0xFF00FF) + (local801 & 0xFF00FF);
								local801 = (local821 & 0x1000100) + (local809 - local821 & 0x10000);
								local11[local36++] = local809 - local801 | local801 - (local801 >>> 8);
							}
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 3) {
					for (local65 = -local41; local65 < 0; local65++) {
						for (local201 = -local44; local201 < 0; local201++) {
							local570 = this.aByteArray47[local38++];
							local312 = local570 > 0 ? this.anIntArray213[local570] : 0;
							local317 = local312 + arg3;
							local330 = (local312 & 0xFF00FF) + (arg3 & 0xFF00FF);
							local338 = (local330 & 0x1000100) + (local317 - local330 & 0x10000);
							local312 = local317 - local338 | local338 - (local338 >>> 8);
							local338 = local11[local36];
							local317 = local312 + local338;
							local330 = (local312 & 0xFF00FF) + (local338 & 0xFF00FF);
							local338 = (local330 & 0x1000100) + (local317 - local330 & 0x10000);
							local11[local36++] = local317 - local338 | local338 - (local338 >>> 8);
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 2) {
					local65 = arg3 >>> 24;
					local201 = 256 - local65;
					local309 = (arg3 & 0xFF00FF) * local201 & 0xFF00FF00;
					local312 = (arg3 & 0xFF00) * local201 & 0xFF0000;
					local483 = (local309 | local312) >>> 8;
					for (local317 = -local41; local317 < 0; local317++) {
						for (local330 = -local44; local330 < 0; local330++) {
							local1081 = this.aByteArray47[local38++];
							if (local1081 == 0) {
								local36++;
							} else {
								local346 = this.anIntArray213[local1081 & 0xFF];
								local309 = (local346 & 0xFF00FF) * local65 & 0xFF00FF00;
								local312 = (local346 & 0xFF00) * local65 & 0xFF0000;
								local346 = ((local309 | local312) >>> 8) + local483;
								local354 = local11[local36];
								local793 = local346 + local354;
								local801 = (local346 & 0xFF00FF) + (local354 & 0xFF00FF);
								local354 = (local801 & 0x1000100) + (local793 - local801 & 0x10000);
								local11[local36++] = local793 - local354 | local354 - (local354 >>> 8);
							}
						}
						local36 += local48;
						local38 += local50;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg2 == 1) {
				for (local65 = -local41; local65 < 0; local65++) {
					for (local201 = -local44; local201 < 0; local201++) {
						local570 = this.aByteArray47[local38++];
						if (local570 == 0) {
							local36++;
						} else {
							local312 = this.anIntArray213[local570 & 0xFF] | 0xFF000000;
							@Pc(583) short local583 = 255;
							@Pc(585) byte local585 = 0;
							local338 = local11[local36];
							local11[local36++] = ((local312 & 0xFF00FF) * local583 + (local338 & 0xFF00FF) * local585 >> 8 & 0xFFFF00FF) + (((local312 & 0xFF00FF00) >>> 8) * local583 + ((local338 & 0xFF00FF00) >>> 8) * local585 & 0xFF00FF00);
						}
					}
					local36 += local48;
					local38 += local50;
				}
			} else {
				@Pc(672) byte local672;
				if (arg2 == 0) {
					if ((arg3 & 0xFFFFFF) == 16777215) {
						local65 = arg3 >>> 24;
						local201 = 256 - local65;
						for (local309 = -local41; local309 < 0; local309++) {
							for (local312 = -local44; local312 < 0; local312++) {
								local672 = this.aByteArray47[local38++];
								if (local672 == 0) {
									local36++;
								} else {
									local330 = this.anIntArray213[local672 & 0xFF];
									local338 = local11[local36];
									local11[local36++] = ((local330 & 0xFF00FF) * local65 + (local338 & 0xFF00FF) * local201 & 0xFF00FF00) + ((local330 & 0xFF00) * local65 + (local338 & 0xFF00) * local201 & 0xFF0000) >> 8;
								}
							}
							local36 += local48;
							local38 += local50;
						}
					} else {
						local65 = arg3 >> 16 & 0xFF;
						local201 = arg3 >> 8 & 0xFF;
						local309 = arg3 & 0xFF;
						local312 = arg3 >>> 24;
						local317 = 256 - local312;
						for (local330 = -local41; local330 < 0; local330++) {
							for (local338 = -local44; local338 < 0; local338++) {
								@Pc(773) byte local773 = this.aByteArray47[local38++];
								if (local773 == 0) {
									local36++;
								} else {
									local354 = this.anIntArray213[local773 & 0xFF];
									if (local312 == 255) {
										local793 = (local354 & 0xFF0000) * local65 & 0xFF000000;
										local801 = (local354 & 0xFF00) * local201 & 0xFF0000;
										local809 = (local354 & 0xFF) * local309 & 0xFF00;
										local11[local36++] = (local793 | local801 | local809) >>> 8;
									} else {
										local793 = (local354 & 0xFF0000) * local65 & 0xFF000000;
										local801 = (local354 & 0xFF00) * local201 & 0xFF0000;
										local809 = (local354 & 0xFF) * local309 & 0xFF00;
										local354 = (local793 | local801 | local809) >>> 8;
										local821 = local11[local36];
										local11[local36++] = ((local354 & 0xFF00FF) * local312 + (local821 & 0xFF00FF) * local317 & 0xFF00FF00) + ((local354 & 0xFF00) * local312 + (local821 & 0xFF00) * local317 & 0xFF0000) >> 8;
									}
								}
							}
							local36 += local48;
							local38 += local50;
						}
					}
				} else if (arg2 == 3) {
					local65 = arg3 >>> 24;
					local201 = 256 - local65;
					for (local309 = -local41; local309 < 0; local309++) {
						for (local312 = -local44; local312 < 0; local312++) {
							local672 = this.aByteArray47[local38++];
							local330 = local672 > 0 ? this.anIntArray213[local672] : 0;
							local338 = local330 + arg3;
							local346 = (local330 & 0xFF00FF) + (arg3 & 0xFF00FF);
							local354 = (local346 & 0x1000100) + (local338 - local346 & 0x10000);
							local354 = local338 - local354 | local354 - (local354 >>> 8);
							if (local330 == 0 && local65 != 255) {
								local330 = local354;
								local354 = local11[local36];
								local354 = ((local330 & 0xFF00FF) * local65 + (local354 & 0xFF00FF) * local201 & 0xFF00FF00) + ((local330 & 0xFF00) * local65 + (local354 & 0xFF00) * local201 & 0xFF0000) >> 8;
							}
							local11[local36++] = local354;
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 2) {
					local65 = arg3 >>> 24;
					local201 = 256 - local65;
					local309 = (arg3 & 0xFF00FF) * local201 & 0xFF00FF00;
					local312 = (arg3 & 0xFF00) * local201 & 0xFF0000;
					local483 = (local309 | local312) >>> 8;
					for (local317 = -local41; local317 < 0; local317++) {
						for (local330 = -local44; local330 < 0; local330++) {
							local1081 = this.aByteArray47[local38++];
							if (local1081 == 0) {
								local36++;
							} else {
								local346 = this.anIntArray213[local1081 & 0xFF];
								local309 = (local346 & 0xFF00FF) * local65 & 0xFF00FF00;
								local312 = (local346 & 0xFF00) * local65 & 0xFF0000;
								local11[local36++] = ((local309 | local312) >>> 8) + local483;
							}
						}
						local36 += local48;
						local38 += local50;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg2 == 1) {
			for (local65 = -local41; local65 < 0; local65++) {
				local201 = local36 + local44 - 3;
				while (local36 < local201) {
					local11[local36++] = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
					local11[local36++] = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
					local11[local36++] = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
					local11[local36++] = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
				}
				local201 += 3;
				while (local36 < local201) {
					local11[local36++] = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
				}
				local36 += local48;
				local38 += local50;
			}
		} else if (arg2 == 0) {
			local65 = arg3 >> 16 & 0xFF;
			local201 = arg3 >> 8 & 0xFF;
			local309 = arg3 & 0xFF;
			for (local312 = -local41; local312 < 0; local312++) {
				for (local317 = -local44; local317 < 0; local317++) {
					local330 = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
					local338 = (local330 & 0xFF0000) * local65 & 0xFF000000;
					local346 = (local330 & 0xFF00) * local201 & 0xFF0000;
					local354 = (local330 & 0xFF) * local309 & 0xFF00;
					local11[local36++] = (local338 | local346 | local354) >>> 8;
				}
				local36 += local48;
				local38 += local50;
			}
		} else if (arg2 == 3) {
			for (local65 = -local41; local65 < 0; local65++) {
				for (local201 = -local44; local201 < 0; local201++) {
					local309 = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
					local312 = local309 + arg3;
					local317 = (local309 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local330 = (local317 & 0x1000100) + (local312 - local317 & 0x10000);
					local11[local36++] = local312 - local330 | local330 - (local330 >>> 8);
				}
				local36 += local48;
				local38 += local50;
			}
		} else if (arg2 == 2) {
			local65 = arg3 >>> 24;
			local201 = 256 - local65;
			local309 = (arg3 & 0xFF00FF) * local201 & 0xFF00FF00;
			local312 = (arg3 & 0xFF00) * local201 & 0xFF0000;
			local483 = (local309 | local312) >>> 8;
			for (local317 = -local41; local317 < 0; local317++) {
				for (local330 = -local44; local330 < 0; local330++) {
					local338 = this.anIntArray213[this.aByteArray47[local38++] & 0xFF];
					local309 = (local338 & 0xFF00FF) * local65 & 0xFF00FF00;
					local312 = (local338 & 0xFF00) * local65 & 0xFF0000;
					local11[local36++] = ((local309 | local312) >>> 8) + local483;
				}
				local36 += local48;
				local38 += local50;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!apf", name = "a", descriptor = "(III)V")
	@Override
	public void method18224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!apf", name = "av", descriptor = "(IIIIIIII)V")
	@Override
	void method18245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass102_Sub2_10.method5094()) {
			throw new IllegalStateException();
		} else if (arg2 > 0 && arg3 > 0) {
			@Pc(16) int[] local16 = this.aClass102_Sub2_10.anIntArray50;
			if (local16 != null) {
				@Pc(21) int local21 = 0;
				@Pc(23) int local23 = 0;
				@Pc(29) int local29 = this.aClass102_Sub2_10.anInt638 * 513500097;
				@Pc(38) int local38 = this.anInt2555 + this.anInt2554 + this.anInt2557;
				@Pc(47) int local47 = this.anInt2556 + this.anInt2559 + this.anInt2571;
				@Pc(53) int local53 = (local38 << 16) / arg2;
				@Pc(59) int local59 = (local47 << 16) / arg3;
				@Pc(73) int local73;
				if (this.anInt2555 > 0) {
					local73 = ((this.anInt2555 << 16) + local53 - 1) / local53;
					arg0 += local73;
					local21 += local73 * local53 - (this.anInt2555 << 16);
				}
				if (this.anInt2556 > 0) {
					local73 = ((this.anInt2556 << 16) + local59 - 1) / local59;
					arg1 += local73;
					local23 += local73 * local59 - (this.anInt2556 << 16);
				}
				if (this.anInt2554 < local38) {
					arg2 = ((this.anInt2554 << 16) - local21 + local53 - 1) / local53;
				}
				if (this.anInt2559 < local47) {
					arg3 = ((this.anInt2559 << 16) - local23 + local59 - 1) / local59;
				}
				local73 = arg0 + arg1 * local29;
				@Pc(161) int local161 = local29 - arg2;
				if (arg1 + arg3 > this.aClass102_Sub2_10.anInt639 * 725126603) {
					arg3 -= arg1 + arg3 - this.aClass102_Sub2_10.anInt639 * 725126603;
				}
				@Pc(197) int local197;
				if (arg1 < this.aClass102_Sub2_10.anInt645 * -1878420243) {
					local197 = this.aClass102_Sub2_10.anInt645 * -1878420243 - arg1;
					arg3 -= local197;
					local73 += local197 * local29;
					local23 += local59 * local197;
				}
				if (arg0 + arg2 > this.aClass102_Sub2_10.anInt634 * 469139509) {
					local197 = arg0 + arg2 - this.aClass102_Sub2_10.anInt634 * 469139509;
					arg2 -= local197;
					local161 += local197;
				}
				if (arg0 < this.aClass102_Sub2_10.anInt637 * 531468375) {
					local197 = this.aClass102_Sub2_10.anInt637 * 531468375 - arg0;
					arg2 -= local197;
					local73 += local197;
					local21 += local53 * local197;
					local161 += local197;
				}
				@Pc(283) int local283;
				@Pc(292) int local292;
				@Pc(295) int local295;
				@Pc(356) int local356;
				@Pc(365) int local365;
				@Pc(368) int local368;
				@Pc(384) int local384;
				@Pc(392) int local392;
				@Pc(400) int local400;
				@Pc(408) int local408;
				@Pc(565) int local565;
				@Pc(469) byte local469;
				if (arg6 != 0) {
					@Pc(895) int local895;
					@Pc(903) int local903;
					@Pc(911) int local911;
					@Pc(923) int local923;
					@Pc(1219) byte local1219;
					if (arg6 != 1) {
						if (arg6 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg4 == 1) {
							local197 = local21;
							for (local283 = -arg3; local283 < 0; local283++) {
								local292 = (local23 >> 16) * this.anInt2554;
								for (local295 = -arg2; local295 < 0; local295++) {
									local469 = this.aByteArray47[(local21 >> 16) + local292];
									if (local469 == 0) {
										local73++;
									} else {
										local365 = this.anIntArray213[local469 & 0xFF];
										local368 = local16[local73];
										local384 = local365 + local368;
										local392 = (local365 & 0xFF00FF) + (local368 & 0xFF00FF);
										local368 = (local392 & 0x1000100) + (local384 - local392 & 0x10000);
										local16[local73++] = local384 - local368 | local368 - (local368 >>> 8);
									}
									local21 += local53;
								}
								local23 += local59;
								local21 = local197;
								local73 += local161;
							}
						} else if (arg4 == 0) {
							local197 = local21;
							local283 = arg5 >> 16 & 0xFF;
							local292 = arg5 >> 8 & 0xFF;
							local295 = arg5 & 0xFF;
							for (local356 = -arg3; local356 < 0; local356++) {
								local365 = (local23 >> 16) * this.anInt2554;
								for (local368 = -arg2; local368 < 0; local368++) {
									@Pc(1429) byte local1429 = this.aByteArray47[(local21 >> 16) + local365];
									if (local1429 == 0) {
										local73++;
									} else {
										local392 = this.anIntArray213[local1429 & 0xFF];
										local400 = (local392 & 0xFF0000) * local283 & 0xFF000000;
										local408 = (local392 & 0xFF00) * local292 & 0xFF0000;
										local895 = (local392 & 0xFF) * local295 & 0xFF00;
										local392 = (local400 | local408 | local895) >>> 8;
										local903 = local16[local73];
										local911 = local392 + local903;
										local923 = (local392 & 0xFF00FF) + (local903 & 0xFF00FF);
										local903 = (local923 & 0x1000100) + (local911 - local923 & 0x10000);
										local16[local73++] = local911 - local903 | local903 - (local903 >>> 8);
									}
									local21 += local53;
								}
								local23 += local59;
								local21 = local197;
								local73 += local161;
							}
						} else if (arg4 == 3) {
							local197 = local21;
							for (local283 = -arg3; local283 < 0; local283++) {
								local292 = (local23 >> 16) * this.anInt2554;
								for (local295 = -arg2; local295 < 0; local295++) {
									local469 = this.aByteArray47[(local21 >> 16) + local292];
									local365 = local469 > 0 ? this.anIntArray213[local469] : 0;
									local368 = local365 + arg5;
									local384 = (local365 & 0xFF00FF) + (arg5 & 0xFF00FF);
									local392 = (local384 & 0x1000100) + (local368 - local384 & 0x10000);
									local365 = local368 - local392 | local392 - (local392 >>> 8);
									local392 = local16[local73];
									local368 = local365 + local392;
									local384 = (local365 & 0xFF00FF) + (local392 & 0xFF00FF);
									local392 = (local384 & 0x1000100) + (local368 - local384 & 0x10000);
									local16[local73++] = local368 - local392 | local392 - (local392 >>> 8);
									local21 += local53;
								}
								local23 += local59;
								local21 = local197;
								local73 += local161;
							}
						} else if (arg4 == 2) {
							local197 = arg5 >>> 24;
							local283 = 256 - local197;
							local292 = (arg5 & 0xFF00FF) * local283 & 0xFF00FF00;
							local295 = (arg5 & 0xFF00) * local283 & 0xFF0000;
							local565 = (local292 | local295) >>> 8;
							local356 = local21;
							for (local365 = -arg3; local365 < 0; local365++) {
								local368 = (local23 >> 16) * this.anInt2554;
								for (local384 = -arg2; local384 < 0; local384++) {
									local1219 = this.aByteArray47[(local21 >> 16) + local368];
									if (local1219 == 0) {
										local73++;
									} else {
										local400 = this.anIntArray213[local1219 & 0xFF];
										local292 = (local400 & 0xFF00FF) * local197 & 0xFF00FF00;
										local295 = (local400 & 0xFF00) * local197 & 0xFF0000;
										local400 = ((local292 | local295) >>> 8) + local565;
										local408 = local16[local73];
										local895 = local400 + local408;
										local903 = (local400 & 0xFF00FF) + (local408 & 0xFF00FF);
										local408 = (local903 & 0x1000100) + (local895 - local903 & 0x10000);
										local16[local73++] = local895 - local408 | local408 - (local408 >>> 8);
									}
									local21 += local53;
								}
								local23 += local59;
								local21 = local356;
								local73 += local161;
							}
						} else {
							throw new IllegalArgumentException();
						}
					} else if (arg4 == 1) {
						local197 = local21;
						for (local283 = -arg3; local283 < 0; local283++) {
							local292 = (local23 >> 16) * this.anInt2554;
							for (local295 = -arg2; local295 < 0; local295++) {
								local469 = this.aByteArray47[(local21 >> 16) + local292];
								if (local469 == 0) {
									local73++;
								} else {
									local16[local73++] = this.anIntArray213[local469 & 0xFF];
								}
								local21 += local53;
							}
							local23 += local59;
							local21 = local197;
							local73 += local161;
						}
					} else {
						@Pc(758) byte local758;
						if (arg4 == 0) {
							local197 = local21;
							if ((arg5 & 0xFFFFFF) == 16777215) {
								local283 = arg5 >>> 24;
								local292 = 256 - local283;
								for (local295 = -arg3; local295 < 0; local295++) {
									local356 = (local23 >> 16) * this.anInt2554;
									for (local365 = -arg2; local365 < 0; local365++) {
										local758 = this.aByteArray47[(local21 >> 16) + local356];
										if (local758 == 0) {
											local73++;
										} else {
											local384 = this.anIntArray213[local758 & 0xFF];
											local392 = local16[local73];
											local16[local73++] = ((local384 & 0xFF00FF) * local283 + (local392 & 0xFF00FF) * local292 & 0xFF00FF00) + ((local384 & 0xFF00) * local283 + (local392 & 0xFF00) * local292 & 0xFF0000) >> 8;
										}
										local21 += local53;
									}
									local23 += local59;
									local21 = local197;
									local73 += local161;
								}
							} else {
								local283 = arg5 >> 16 & 0xFF;
								local292 = arg5 >> 8 & 0xFF;
								local295 = arg5 & 0xFF;
								local356 = arg5 >>> 24;
								local365 = 256 - local356;
								for (local368 = -arg3; local368 < 0; local368++) {
									local384 = (local23 >> 16) * this.anInt2554;
									for (local392 = -arg2; local392 < 0; local392++) {
										@Pc(875) byte local875 = this.aByteArray47[(local21 >> 16) + local384];
										if (local875 == 0) {
											local73++;
										} else {
											local408 = this.anIntArray213[local875 & 0xFF];
											if (local356 == 255) {
												local895 = (local408 & 0xFF0000) * local283 & 0xFF000000;
												local903 = (local408 & 0xFF00) * local292 & 0xFF0000;
												local911 = (local408 & 0xFF) * local295 & 0xFF00;
												local16[local73++] = (local895 | local903 | local911) >>> 8;
											} else {
												local895 = (local408 & 0xFF0000) * local283 & 0xFF000000;
												local903 = (local408 & 0xFF00) * local292 & 0xFF0000;
												local911 = (local408 & 0xFF) * local295 & 0xFF00;
												local408 = (local895 | local903 | local911) >>> 8;
												local923 = local16[local73];
												local16[local73++] = ((local408 & 0xFF00FF) * local356 + (local923 & 0xFF00FF) * local365 & 0xFF00FF00) + ((local408 & 0xFF00) * local356 + (local923 & 0xFF00) * local365 & 0xFF0000) >> 8;
											}
										}
										local21 += local53;
									}
									local23 += local59;
									local21 = local197;
									local73 += local161;
								}
							}
						} else if (arg4 == 3) {
							local197 = local21;
							local283 = arg5 >>> 24;
							local292 = 256 - local283;
							for (local295 = -arg3; local295 < 0; local295++) {
								local356 = (local23 >> 16) * this.anInt2554;
								for (local365 = -arg2; local365 < 0; local365++) {
									local758 = this.aByteArray47[(local21 >> 16) + local356];
									local384 = local758 > 0 ? this.anIntArray213[local758] : 0;
									local392 = local384 + arg5;
									local400 = (local384 & 0xFF00FF) + (arg5 & 0xFF00FF);
									local408 = (local400 & 0x1000100) + (local392 - local400 & 0x10000);
									local408 = local392 - local408 | local408 - (local408 >>> 8);
									if (local384 == 0 && local283 != 255) {
										local384 = local408;
										local408 = local16[local73];
										local408 = ((local384 & 0xFF00FF) * local283 + (local408 & 0xFF00FF) * local292 & 0xFF00FF00) + ((local384 & 0xFF00) * local283 + (local408 & 0xFF00) * local292 & 0xFF0000) >> 8;
									}
									local16[local73++] = local408;
									local21 += local53;
								}
								local23 += local59;
								local21 = local197;
								local73 += local161;
							}
						} else if (arg4 == 2) {
							local197 = arg5 >>> 24;
							local283 = 256 - local197;
							local292 = (arg5 & 0xFF00FF) * local283 & 0xFF00FF00;
							local295 = (arg5 & 0xFF00) * local283 & 0xFF0000;
							local565 = (local292 | local295) >>> 8;
							local356 = local21;
							for (local365 = -arg3; local365 < 0; local365++) {
								local368 = (local23 >> 16) * this.anInt2554;
								for (local384 = -arg2; local384 < 0; local384++) {
									local1219 = this.aByteArray47[(local21 >> 16) + local368];
									if (local1219 == 0) {
										local73++;
									} else {
										local400 = this.anIntArray213[local1219 & 0xFF];
										local292 = (local400 & 0xFF00FF) * local197 & 0xFF00FF00;
										local295 = (local400 & 0xFF00) * local197 & 0xFF0000;
										local16[local73++] = ((local292 | local295) >>> 8) + local565;
									}
									local21 += local53;
								}
								local23 += local59;
								local21 = local356;
								local73 += local161;
							}
						} else {
							throw new IllegalArgumentException();
						}
					}
				} else if (arg4 == 1) {
					local197 = local21;
					for (local283 = -arg3; local283 < 0; local283++) {
						local292 = (local23 >> 16) * this.anInt2554;
						for (local295 = -arg2; local295 < 0; local295++) {
							local16[local73++] = this.anIntArray213[this.aByteArray47[(local21 >> 16) + local292] & 0xFF];
							local21 += local53;
						}
						local23 += local59;
						local21 = local197;
						local73 += local161;
					}
				} else if (arg4 == 0) {
					local197 = arg5 >> 16 & 0xFF;
					local283 = arg5 >> 8 & 0xFF;
					local292 = arg5 & 0xFF;
					local295 = local21;
					for (local356 = -arg3; local356 < 0; local356++) {
						local365 = (local23 >> 16) * this.anInt2554;
						for (local368 = -arg2; local368 < 0; local368++) {
							local384 = this.anIntArray213[this.aByteArray47[(local21 >> 16) + local365] & 0xFF];
							local392 = (local384 & 0xFF0000) * local197 & 0xFF000000;
							local400 = (local384 & 0xFF00) * local283 & 0xFF0000;
							local408 = (local384 & 0xFF) * local292 & 0xFF00;
							local16[local73++] = (local392 | local400 | local408) >>> 8;
							local21 += local53;
						}
						local23 += local59;
						local21 = local295;
						local73 += local161;
					}
				} else if (arg4 == 3) {
					local197 = local21;
					for (local283 = -arg3; local283 < 0; local283++) {
						local292 = (local23 >> 16) * this.anInt2554;
						for (local295 = -arg2; local295 < 0; local295++) {
							local469 = this.aByteArray47[(local21 >> 16) + local292];
							local365 = local469 > 0 ? this.anIntArray213[local469] : 0;
							local368 = local365 + arg5;
							local384 = (local365 & 0xFF00FF) + (arg5 & 0xFF00FF);
							local392 = (local384 & 0x1000100) + (local368 - local384 & 0x10000);
							local16[local73++] = local368 - local392 | local392 - (local392 >>> 8);
							local21 += local53;
						}
						local23 += local59;
						local21 = local197;
						local73 += local161;
					}
				} else if (arg4 == 2) {
					local197 = arg5 >>> 24;
					local283 = 256 - local197;
					local292 = (arg5 & 0xFF00FF) * local283 & 0xFF00FF00;
					local295 = (arg5 & 0xFF00) * local283 & 0xFF0000;
					local565 = (local292 | local295) >>> 8;
					local356 = local21;
					for (local365 = -arg3; local365 < 0; local365++) {
						local368 = (local23 >> 16) * this.anInt2554;
						for (local384 = -arg2; local384 < 0; local384++) {
							local392 = this.anIntArray213[this.aByteArray47[(local21 >> 16) + local368] & 0xFF];
							local292 = (local392 & 0xFF00FF) * local197 & 0xFF00FF00;
							local295 = (local392 & 0xFF00) * local197 & 0xFF0000;
							local16[local73++] = ((local292 | local295) >>> 8) + local565;
							local21 += local53;
						}
						local23 += local59;
						local21 = local356;
						local73 += local161;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		}
	}

	@OriginalMember(owner = "client!apf", name = "an", descriptor = "(IIIIIIII)V")
	@Override
	void method18256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass102_Sub2_10.method5094()) {
			throw new IllegalStateException();
		} else if (arg2 > 0 && arg3 > 0) {
			@Pc(16) int[] local16 = this.aClass102_Sub2_10.anIntArray50;
			if (local16 != null) {
				@Pc(21) int local21 = 0;
				@Pc(23) int local23 = 0;
				@Pc(29) int local29 = this.aClass102_Sub2_10.anInt638 * 513500097;
				@Pc(38) int local38 = this.anInt2555 + this.anInt2554 + this.anInt2557;
				@Pc(47) int local47 = this.anInt2556 + this.anInt2559 + this.anInt2571;
				@Pc(53) int local53 = (local38 << 16) / arg2;
				@Pc(59) int local59 = (local47 << 16) / arg3;
				@Pc(73) int local73;
				if (this.anInt2555 > 0) {
					local73 = ((this.anInt2555 << 16) + local53 - 1) / local53;
					arg0 += local73;
					local21 += local73 * local53 - (this.anInt2555 << 16);
				}
				if (this.anInt2556 > 0) {
					local73 = ((this.anInt2556 << 16) + local59 - 1) / local59;
					arg1 += local73;
					local23 += local73 * local59 - (this.anInt2556 << 16);
				}
				if (this.anInt2554 < local38) {
					arg2 = ((this.anInt2554 << 16) - local21 + local53 - 1) / local53;
				}
				if (this.anInt2559 < local47) {
					arg3 = ((this.anInt2559 << 16) - local23 + local59 - 1) / local59;
				}
				local73 = arg0 + arg1 * local29;
				@Pc(161) int local161 = local29 - arg2;
				if (arg1 + arg3 > this.aClass102_Sub2_10.anInt639 * 725126603) {
					arg3 -= arg1 + arg3 - this.aClass102_Sub2_10.anInt639 * 725126603;
				}
				@Pc(197) int local197;
				if (arg1 < this.aClass102_Sub2_10.anInt645 * -1878420243) {
					local197 = this.aClass102_Sub2_10.anInt645 * -1878420243 - arg1;
					arg3 -= local197;
					local73 += local197 * local29;
					local23 += local59 * local197;
				}
				if (arg0 + arg2 > this.aClass102_Sub2_10.anInt634 * 469139509) {
					local197 = arg0 + arg2 - this.aClass102_Sub2_10.anInt634 * 469139509;
					arg2 -= local197;
					local161 += local197;
				}
				if (arg0 < this.aClass102_Sub2_10.anInt637 * 531468375) {
					local197 = this.aClass102_Sub2_10.anInt637 * 531468375 - arg0;
					arg2 -= local197;
					local73 += local197;
					local21 += local53 * local197;
					local161 += local197;
				}
				@Pc(283) int local283;
				@Pc(292) int local292;
				@Pc(295) int local295;
				@Pc(356) int local356;
				@Pc(365) int local365;
				@Pc(368) int local368;
				@Pc(384) int local384;
				@Pc(392) int local392;
				@Pc(400) int local400;
				@Pc(408) int local408;
				@Pc(565) int local565;
				@Pc(469) byte local469;
				if (arg6 != 0) {
					@Pc(895) int local895;
					@Pc(903) int local903;
					@Pc(911) int local911;
					@Pc(923) int local923;
					@Pc(1219) byte local1219;
					if (arg6 != 1) {
						if (arg6 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg4 == 1) {
							local197 = local21;
							for (local283 = -arg3; local283 < 0; local283++) {
								local292 = (local23 >> 16) * this.anInt2554;
								for (local295 = -arg2; local295 < 0; local295++) {
									local469 = this.aByteArray47[(local21 >> 16) + local292];
									if (local469 == 0) {
										local73++;
									} else {
										local365 = this.anIntArray213[local469 & 0xFF];
										local368 = local16[local73];
										local384 = local365 + local368;
										local392 = (local365 & 0xFF00FF) + (local368 & 0xFF00FF);
										local368 = (local392 & 0x1000100) + (local384 - local392 & 0x10000);
										local16[local73++] = local384 - local368 | local368 - (local368 >>> 8);
									}
									local21 += local53;
								}
								local23 += local59;
								local21 = local197;
								local73 += local161;
							}
						} else if (arg4 == 0) {
							local197 = local21;
							local283 = arg5 >> 16 & 0xFF;
							local292 = arg5 >> 8 & 0xFF;
							local295 = arg5 & 0xFF;
							for (local356 = -arg3; local356 < 0; local356++) {
								local365 = (local23 >> 16) * this.anInt2554;
								for (local368 = -arg2; local368 < 0; local368++) {
									@Pc(1429) byte local1429 = this.aByteArray47[(local21 >> 16) + local365];
									if (local1429 == 0) {
										local73++;
									} else {
										local392 = this.anIntArray213[local1429 & 0xFF];
										local400 = (local392 & 0xFF0000) * local283 & 0xFF000000;
										local408 = (local392 & 0xFF00) * local292 & 0xFF0000;
										local895 = (local392 & 0xFF) * local295 & 0xFF00;
										local392 = (local400 | local408 | local895) >>> 8;
										local903 = local16[local73];
										local911 = local392 + local903;
										local923 = (local392 & 0xFF00FF) + (local903 & 0xFF00FF);
										local903 = (local923 & 0x1000100) + (local911 - local923 & 0x10000);
										local16[local73++] = local911 - local903 | local903 - (local903 >>> 8);
									}
									local21 += local53;
								}
								local23 += local59;
								local21 = local197;
								local73 += local161;
							}
						} else if (arg4 == 3) {
							local197 = local21;
							for (local283 = -arg3; local283 < 0; local283++) {
								local292 = (local23 >> 16) * this.anInt2554;
								for (local295 = -arg2; local295 < 0; local295++) {
									local469 = this.aByteArray47[(local21 >> 16) + local292];
									local365 = local469 > 0 ? this.anIntArray213[local469] : 0;
									local368 = local365 + arg5;
									local384 = (local365 & 0xFF00FF) + (arg5 & 0xFF00FF);
									local392 = (local384 & 0x1000100) + (local368 - local384 & 0x10000);
									local365 = local368 - local392 | local392 - (local392 >>> 8);
									local392 = local16[local73];
									local368 = local365 + local392;
									local384 = (local365 & 0xFF00FF) + (local392 & 0xFF00FF);
									local392 = (local384 & 0x1000100) + (local368 - local384 & 0x10000);
									local16[local73++] = local368 - local392 | local392 - (local392 >>> 8);
									local21 += local53;
								}
								local23 += local59;
								local21 = local197;
								local73 += local161;
							}
						} else if (arg4 == 2) {
							local197 = arg5 >>> 24;
							local283 = 256 - local197;
							local292 = (arg5 & 0xFF00FF) * local283 & 0xFF00FF00;
							local295 = (arg5 & 0xFF00) * local283 & 0xFF0000;
							local565 = (local292 | local295) >>> 8;
							local356 = local21;
							for (local365 = -arg3; local365 < 0; local365++) {
								local368 = (local23 >> 16) * this.anInt2554;
								for (local384 = -arg2; local384 < 0; local384++) {
									local1219 = this.aByteArray47[(local21 >> 16) + local368];
									if (local1219 == 0) {
										local73++;
									} else {
										local400 = this.anIntArray213[local1219 & 0xFF];
										local292 = (local400 & 0xFF00FF) * local197 & 0xFF00FF00;
										local295 = (local400 & 0xFF00) * local197 & 0xFF0000;
										local400 = ((local292 | local295) >>> 8) + local565;
										local408 = local16[local73];
										local895 = local400 + local408;
										local903 = (local400 & 0xFF00FF) + (local408 & 0xFF00FF);
										local408 = (local903 & 0x1000100) + (local895 - local903 & 0x10000);
										local16[local73++] = local895 - local408 | local408 - (local408 >>> 8);
									}
									local21 += local53;
								}
								local23 += local59;
								local21 = local356;
								local73 += local161;
							}
						} else {
							throw new IllegalArgumentException();
						}
					} else if (arg4 == 1) {
						local197 = local21;
						for (local283 = -arg3; local283 < 0; local283++) {
							local292 = (local23 >> 16) * this.anInt2554;
							for (local295 = -arg2; local295 < 0; local295++) {
								local469 = this.aByteArray47[(local21 >> 16) + local292];
								if (local469 == 0) {
									local73++;
								} else {
									local16[local73++] = this.anIntArray213[local469 & 0xFF];
								}
								local21 += local53;
							}
							local23 += local59;
							local21 = local197;
							local73 += local161;
						}
					} else {
						@Pc(758) byte local758;
						if (arg4 == 0) {
							local197 = local21;
							if ((arg5 & 0xFFFFFF) == 16777215) {
								local283 = arg5 >>> 24;
								local292 = 256 - local283;
								for (local295 = -arg3; local295 < 0; local295++) {
									local356 = (local23 >> 16) * this.anInt2554;
									for (local365 = -arg2; local365 < 0; local365++) {
										local758 = this.aByteArray47[(local21 >> 16) + local356];
										if (local758 == 0) {
											local73++;
										} else {
											local384 = this.anIntArray213[local758 & 0xFF];
											local392 = local16[local73];
											local16[local73++] = ((local384 & 0xFF00FF) * local283 + (local392 & 0xFF00FF) * local292 & 0xFF00FF00) + ((local384 & 0xFF00) * local283 + (local392 & 0xFF00) * local292 & 0xFF0000) >> 8;
										}
										local21 += local53;
									}
									local23 += local59;
									local21 = local197;
									local73 += local161;
								}
							} else {
								local283 = arg5 >> 16 & 0xFF;
								local292 = arg5 >> 8 & 0xFF;
								local295 = arg5 & 0xFF;
								local356 = arg5 >>> 24;
								local365 = 256 - local356;
								for (local368 = -arg3; local368 < 0; local368++) {
									local384 = (local23 >> 16) * this.anInt2554;
									for (local392 = -arg2; local392 < 0; local392++) {
										@Pc(875) byte local875 = this.aByteArray47[(local21 >> 16) + local384];
										if (local875 == 0) {
											local73++;
										} else {
											local408 = this.anIntArray213[local875 & 0xFF];
											if (local356 == 255) {
												local895 = (local408 & 0xFF0000) * local283 & 0xFF000000;
												local903 = (local408 & 0xFF00) * local292 & 0xFF0000;
												local911 = (local408 & 0xFF) * local295 & 0xFF00;
												local16[local73++] = (local895 | local903 | local911) >>> 8;
											} else {
												local895 = (local408 & 0xFF0000) * local283 & 0xFF000000;
												local903 = (local408 & 0xFF00) * local292 & 0xFF0000;
												local911 = (local408 & 0xFF) * local295 & 0xFF00;
												local408 = (local895 | local903 | local911) >>> 8;
												local923 = local16[local73];
												local16[local73++] = ((local408 & 0xFF00FF) * local356 + (local923 & 0xFF00FF) * local365 & 0xFF00FF00) + ((local408 & 0xFF00) * local356 + (local923 & 0xFF00) * local365 & 0xFF0000) >> 8;
											}
										}
										local21 += local53;
									}
									local23 += local59;
									local21 = local197;
									local73 += local161;
								}
							}
						} else if (arg4 == 3) {
							local197 = local21;
							local283 = arg5 >>> 24;
							local292 = 256 - local283;
							for (local295 = -arg3; local295 < 0; local295++) {
								local356 = (local23 >> 16) * this.anInt2554;
								for (local365 = -arg2; local365 < 0; local365++) {
									local758 = this.aByteArray47[(local21 >> 16) + local356];
									local384 = local758 > 0 ? this.anIntArray213[local758] : 0;
									local392 = local384 + arg5;
									local400 = (local384 & 0xFF00FF) + (arg5 & 0xFF00FF);
									local408 = (local400 & 0x1000100) + (local392 - local400 & 0x10000);
									local408 = local392 - local408 | local408 - (local408 >>> 8);
									if (local384 == 0 && local283 != 255) {
										local384 = local408;
										local408 = local16[local73];
										local408 = ((local384 & 0xFF00FF) * local283 + (local408 & 0xFF00FF) * local292 & 0xFF00FF00) + ((local384 & 0xFF00) * local283 + (local408 & 0xFF00) * local292 & 0xFF0000) >> 8;
									}
									local16[local73++] = local408;
									local21 += local53;
								}
								local23 += local59;
								local21 = local197;
								local73 += local161;
							}
						} else if (arg4 == 2) {
							local197 = arg5 >>> 24;
							local283 = 256 - local197;
							local292 = (arg5 & 0xFF00FF) * local283 & 0xFF00FF00;
							local295 = (arg5 & 0xFF00) * local283 & 0xFF0000;
							local565 = (local292 | local295) >>> 8;
							local356 = local21;
							for (local365 = -arg3; local365 < 0; local365++) {
								local368 = (local23 >> 16) * this.anInt2554;
								for (local384 = -arg2; local384 < 0; local384++) {
									local1219 = this.aByteArray47[(local21 >> 16) + local368];
									if (local1219 == 0) {
										local73++;
									} else {
										local400 = this.anIntArray213[local1219 & 0xFF];
										local292 = (local400 & 0xFF00FF) * local197 & 0xFF00FF00;
										local295 = (local400 & 0xFF00) * local197 & 0xFF0000;
										local16[local73++] = ((local292 | local295) >>> 8) + local565;
									}
									local21 += local53;
								}
								local23 += local59;
								local21 = local356;
								local73 += local161;
							}
						} else {
							throw new IllegalArgumentException();
						}
					}
				} else if (arg4 == 1) {
					local197 = local21;
					for (local283 = -arg3; local283 < 0; local283++) {
						local292 = (local23 >> 16) * this.anInt2554;
						for (local295 = -arg2; local295 < 0; local295++) {
							local16[local73++] = this.anIntArray213[this.aByteArray47[(local21 >> 16) + local292] & 0xFF];
							local21 += local53;
						}
						local23 += local59;
						local21 = local197;
						local73 += local161;
					}
				} else if (arg4 == 0) {
					local197 = arg5 >> 16 & 0xFF;
					local283 = arg5 >> 8 & 0xFF;
					local292 = arg5 & 0xFF;
					local295 = local21;
					for (local356 = -arg3; local356 < 0; local356++) {
						local365 = (local23 >> 16) * this.anInt2554;
						for (local368 = -arg2; local368 < 0; local368++) {
							local384 = this.anIntArray213[this.aByteArray47[(local21 >> 16) + local365] & 0xFF];
							local392 = (local384 & 0xFF0000) * local197 & 0xFF000000;
							local400 = (local384 & 0xFF00) * local283 & 0xFF0000;
							local408 = (local384 & 0xFF) * local292 & 0xFF00;
							local16[local73++] = (local392 | local400 | local408) >>> 8;
							local21 += local53;
						}
						local23 += local59;
						local21 = local295;
						local73 += local161;
					}
				} else if (arg4 == 3) {
					local197 = local21;
					for (local283 = -arg3; local283 < 0; local283++) {
						local292 = (local23 >> 16) * this.anInt2554;
						for (local295 = -arg2; local295 < 0; local295++) {
							local469 = this.aByteArray47[(local21 >> 16) + local292];
							local365 = local469 > 0 ? this.anIntArray213[local469] : 0;
							local368 = local365 + arg5;
							local384 = (local365 & 0xFF00FF) + (arg5 & 0xFF00FF);
							local392 = (local384 & 0x1000100) + (local368 - local384 & 0x10000);
							local16[local73++] = local368 - local392 | local392 - (local392 >>> 8);
							local21 += local53;
						}
						local23 += local59;
						local21 = local197;
						local73 += local161;
					}
				} else if (arg4 == 2) {
					local197 = arg5 >>> 24;
					local283 = 256 - local197;
					local292 = (arg5 & 0xFF00FF) * local283 & 0xFF00FF00;
					local295 = (arg5 & 0xFF00) * local283 & 0xFF0000;
					local565 = (local292 | local295) >>> 8;
					local356 = local21;
					for (local365 = -arg3; local365 < 0; local365++) {
						local368 = (local23 >> 16) * this.anInt2554;
						for (local384 = -arg2; local384 < 0; local384++) {
							local392 = this.anIntArray213[this.aByteArray47[(local21 >> 16) + local368] & 0xFF];
							local292 = (local392 & 0xFF00FF) * local197 & 0xFF00FF00;
							local295 = (local392 & 0xFF00) * local197 & 0xFF0000;
							local16[local73++] = ((local292 | local295) >>> 8) + local565;
							local21 += local53;
						}
						local23 += local59;
						local21 = local356;
						local73 += local161;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		}
	}

	@OriginalMember(owner = "client!apf", name = "ad", descriptor = "(IILclient!cg;II)V")
	@Override
	public void method18253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class98 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass102_Sub2_10.method5094()) {
			throw new IllegalStateException();
		}
		@Pc(11) int[] local11 = this.aClass102_Sub2_10.anIntArray50;
		if (local11 == null) {
			return;
		}
		arg0 += this.anInt2555;
		arg1 += this.anInt2556;
		@Pc(26) int local26 = 0;
		@Pc(32) int local32 = this.aClass102_Sub2_10.anInt638 * 513500097;
		@Pc(35) int local35 = this.anInt2554;
		@Pc(38) int local38 = this.anInt2559;
		@Pc(42) int local42 = local32 - local35;
		@Pc(44) int local44 = 0;
		@Pc(50) int local50 = arg0 + arg1 * local32;
		@Pc(65) int local65;
		if (arg1 < this.aClass102_Sub2_10.anInt645 * -1878420243) {
			local65 = this.aClass102_Sub2_10.anInt645 * -1878420243 - arg1;
			local38 -= local65;
			arg1 = this.aClass102_Sub2_10.anInt645 * -1878420243;
			local26 += local65 * local35;
			local50 += local65 * local32;
		}
		if (arg1 + local38 > this.aClass102_Sub2_10.anInt639 * 725126603) {
			local38 -= arg1 + local38 - this.aClass102_Sub2_10.anInt639 * 725126603;
		}
		if (arg0 < this.aClass102_Sub2_10.anInt637 * 531468375) {
			local65 = this.aClass102_Sub2_10.anInt637 * 531468375 - arg0;
			local35 -= local65;
			arg0 = this.aClass102_Sub2_10.anInt637 * 531468375;
			local26 += local65;
			local50 += local65;
			local44 += local65;
			local42 += local65;
		}
		if (arg0 + local35 > this.aClass102_Sub2_10.anInt634 * 469139509) {
			local65 = arg0 + local35 - this.aClass102_Sub2_10.anInt634 * 469139509;
			local35 -= local65;
			local44 += local65;
			local42 += local65;
		}
		if (local35 <= 0 || local38 <= 0) {
			return;
		}
		@Pc(188) Class98_Sub2 local188 = (Class98_Sub2) arg2;
		@Pc(191) int[] local191 = local188.anIntArray40;
		@Pc(194) int[] local194 = local188.anIntArray39;
		@Pc(196) int local196 = arg1;
		if (arg4 > arg1) {
			local196 = arg4;
			local50 += (arg4 - arg1) * local32;
			local26 += (arg4 - arg1) * this.anInt2554;
		}
		@Pc(235) int local235 = arg4 + local191.length < arg1 + local38 ? arg4 + local191.length : arg1 + local38;
		for (@Pc(237) int local237 = local196; local237 < local235; local237++) {
			@Pc(248) int local248 = local191[local237 - arg4] + arg3;
			@Pc(254) int local254 = local194[local237 - arg4];
			@Pc(256) int local256 = local35;
			@Pc(263) int local263;
			if (arg0 > local248) {
				local263 = arg0 - local248;
				if (local263 >= local254) {
					local26 += local35 + local44;
					local50 += local35 + local42;
					continue;
				}
				local254 -= local263;
			} else {
				local263 = local248 - arg0;
				if (local263 >= local35) {
					local26 += local35 + local44;
					local50 += local35 + local42;
					continue;
				}
				local26 += local263;
				local256 = local35 - local263;
				local50 += local263;
			}
			local263 = 0;
			if (local256 < local254) {
				local254 = local256;
			} else {
				local263 = local256 - local254;
			}
			for (@Pc(331) int local331 = -local254; local331 < 0; local331++) {
				@Pc(339) byte local339 = this.aByteArray47[local26++];
				if (local339 == 0) {
					local50++;
				} else {
					local11[local50++] = this.anIntArray213[local339 & 0xFF];
				}
			}
			local26 += local263 + local44;
			local50 += local263 + local42;
		}
	}

	@OriginalMember(owner = "client!apf", name = "cs", descriptor = "(ZZZIIFIIIIIIZ)V")
	@Override
	void method18305(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		if (arg6 <= 0 || arg7 <= 0 || !arg0 && !arg1) {
			return;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(22) int local22 = this.anInt2555 + this.anInt2554 + this.anInt2557;
		@Pc(31) int local31 = this.anInt2556 + this.anInt2559 + this.anInt2571;
		@Pc(37) int local37 = (local22 << 16) / arg6;
		@Pc(43) int local43 = (local31 << 16) / arg7;
		@Pc(57) int local57;
		if (this.anInt2555 > 0) {
			local57 = ((this.anInt2555 << 16) + local37 - 1) / local37;
			arg3 += local57;
			local11 += local57 * local37 - (this.anInt2555 << 16);
		}
		if (this.anInt2556 > 0) {
			local57 = ((this.anInt2556 << 16) + local43 - 1) / local43;
			arg4 += local57;
			local13 += local57 * local43 - (this.anInt2556 << 16);
		}
		if (this.anInt2554 < local22) {
			arg6 = ((this.anInt2554 << 16) - local11 + local37 - 1) / local37;
		}
		if (this.anInt2559 < local31) {
			arg7 = ((this.anInt2559 << 16) - local13 + local43 - 1) / local43;
		}
		local57 = arg3 + arg4 * this.aClass102_Sub2_10.anInt638 * 513500097;
		@Pc(153) int local153 = this.aClass102_Sub2_10.anInt638 * 513500097 - arg6;
		if (arg4 + arg7 > this.aClass102_Sub2_10.anInt639 * 725126603) {
			arg7 -= arg4 + arg7 - this.aClass102_Sub2_10.anInt639 * 725126603;
		}
		@Pc(189) int local189;
		if (arg4 < this.aClass102_Sub2_10.anInt645 * -1878420243) {
			local189 = this.aClass102_Sub2_10.anInt645 * -1878420243 - arg4;
			arg7 -= local189;
			local57 += local189 * this.aClass102_Sub2_10.anInt638 * 513500097;
			local13 += local43 * local189;
		}
		if (arg3 + arg6 > this.aClass102_Sub2_10.anInt634 * 469139509) {
			local189 = arg3 + arg6 - this.aClass102_Sub2_10.anInt634 * 469139509;
			arg6 -= local189;
			local153 += local189;
		}
		if (arg3 < this.aClass102_Sub2_10.anInt637 * 531468375) {
			local189 = this.aClass102_Sub2_10.anInt637 * 531468375 - arg3;
			arg6 -= local189;
			local57 += local189;
			local11 += local37 * local189;
			local153 += local189;
		}
		@Pc(273) float[] local273 = this.aClass102_Sub2_10.aFloatArray12;
		@Pc(277) int[] local277 = this.aClass102_Sub2_10.anIntArray50;
		@Pc(284) int local284;
		@Pc(287) int local287;
		@Pc(296) int local296;
		@Pc(299) int local299;
		@Pc(378) int local378;
		@Pc(387) int local387;
		@Pc(390) int local390;
		@Pc(416) int local416;
		@Pc(424) int local424;
		@Pc(432) int local432;
		@Pc(440) int local440;
		@Pc(623) int local623;
		@Pc(519) byte local519;
		if (arg10 != 0) {
			@Pc(1013) int local1013;
			@Pc(1021) int local1021;
			@Pc(1029) int local1029;
			@Pc(1041) int local1041;
			@Pc(1378) byte local1378;
			if (arg10 != 1) {
				if (arg10 != 2) {
					throw new IllegalArgumentException();
				}
				if (arg8 == 1) {
					local284 = local11;
					for (local287 = -arg7; local287 < 0; local287++) {
						local296 = (local13 >> 16) * this.anInt2554;
						for (local299 = -arg6; local299 < 0; local299++) {
							if (!arg1 || arg5 < local273[local57]) {
								local519 = this.aByteArray47[(local11 >> 16) + local296];
								if (local519 != 0) {
									if (arg0) {
										local387 = this.anIntArray213[local519 & 0xFF];
										local390 = local277[local57];
										local416 = local387 + local390;
										local424 = (local387 & 0xFF00FF) + (local390 & 0xFF00FF);
										local390 = (local424 & 0x1000100) + (local416 - local424 & 0x10000);
										local277[local57] = local416 - local390 | local390 - (local390 >>> 8);
									}
									if (arg1 && arg12) {
										local273[local57] = arg5;
									}
								}
							}
							local11 += local37;
							local57++;
						}
						local13 += local43;
						local11 = local284;
						local57 += local153;
					}
				} else if (arg8 == 0) {
					local284 = local11;
					local287 = arg9 >> 16 & 0xFF;
					local296 = arg9 >> 8 & 0xFF;
					local299 = arg9 & 0xFF;
					for (local378 = -arg7; local378 < 0; local378++) {
						local387 = (local13 >> 16) * this.anInt2554;
						for (local390 = -arg6; local390 < 0; local390++) {
							if (!arg1 || arg5 < local273[local57]) {
								@Pc(1620) byte local1620 = this.aByteArray47[(local11 >> 16) + local387];
								if (local1620 != 0) {
									if (arg0) {
										local424 = this.anIntArray213[local1620 & 0xFF];
										local432 = (local424 & 0xFF0000) * local287 & 0xFF000000;
										local440 = (local424 & 0xFF00) * local296 & 0xFF0000;
										local1013 = (local424 & 0xFF) * local299 & 0xFF00;
										local424 = (local432 | local440 | local1013) >>> 8;
										local1021 = local277[local57];
										local1029 = local424 + local1021;
										local1041 = (local424 & 0xFF00FF) + (local1021 & 0xFF00FF);
										local1021 = (local1041 & 0x1000100) + (local1029 - local1041 & 0x10000);
										local277[local57] = local1029 - local1021 | local1021 - (local1021 >>> 8);
									}
									if (arg1 && arg12) {
										local273[local57] = arg5;
									}
								}
							}
							local11 += local37;
							local57++;
						}
						local13 += local43;
						local11 = local284;
						local57 += local153;
					}
				} else if (arg8 == 3) {
					local284 = local11;
					for (local287 = -arg7; local287 < 0; local287++) {
						local296 = (local13 >> 16) * this.anInt2554;
						for (local299 = -arg6; local299 < 0; local299++) {
							if (!arg1 || arg5 < local273[local57]) {
								if (arg0) {
									local519 = this.aByteArray47[(local11 >> 16) + local296];
									local387 = local519 > 0 ? this.anIntArray213[local519] : 0;
									local390 = local387 + arg9;
									local416 = (local387 & 0xFF00FF) + (arg9 & 0xFF00FF);
									local424 = (local416 & 0x1000100) + (local390 - local416 & 0x10000);
									local387 = local390 - local424 | local424 - (local424 >>> 8);
									local424 = local277[local57];
									local390 = local387 + local424;
									local416 = (local387 & 0xFF00FF) + (local424 & 0xFF00FF);
									local424 = (local416 & 0x1000100) + (local390 - local416 & 0x10000);
									local277[local57] = local390 - local424 | local424 - (local424 >>> 8);
								}
								if (arg1 && arg12) {
									local273[local57] = arg5;
								}
							}
							local11 += local37;
							local57++;
						}
						local13 += local43;
						local11 = local284;
						local57 += local153;
					}
				} else if (arg8 == 2) {
					local284 = arg9 >>> 24;
					local287 = 256 - local284;
					local296 = (arg9 & 0xFF00FF) * local287 & 0xFF00FF00;
					local299 = (arg9 & 0xFF00) * local287 & 0xFF0000;
					local623 = (local296 | local299) >>> 8;
					local378 = local11;
					for (local387 = -arg7; local387 < 0; local387++) {
						local390 = (local13 >> 16) * this.anInt2554;
						for (local416 = -arg6; local416 < 0; local416++) {
							if (!arg1 || arg5 < local273[local57]) {
								local1378 = this.aByteArray47[(local11 >> 16) + local390];
								if (local1378 != 0) {
									if (arg0) {
										local432 = this.anIntArray213[local1378 & 0xFF];
										local296 = (local432 & 0xFF00FF) * local284 & 0xFF00FF00;
										local299 = (local432 & 0xFF00) * local284 & 0xFF0000;
										local432 = ((local296 | local299) >>> 8) + local623;
										local440 = local277[local57];
										local1013 = local432 + local440;
										local1021 = (local432 & 0xFF00FF) + (local440 & 0xFF00FF);
										local440 = (local1021 & 0x1000100) + (local1013 - local1021 & 0x10000);
										local277[local57] = local1013 - local440 | local440 - (local440 >>> 8);
									}
									if (arg1 && arg12) {
										local273[local57] = arg5;
									}
								}
							}
							local11 += local37;
							local57++;
						}
						local13 += local43;
						local11 = local378;
						local57 += local153;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg8 == 1) {
				local284 = local11;
				for (local287 = -arg7; local287 < 0; local287++) {
					local296 = (local13 >> 16) * this.anInt2554;
					for (local299 = -arg6; local299 < 0; local299++) {
						if (!arg1 || arg5 < local273[local57]) {
							local519 = this.aByteArray47[(local11 >> 16) + local296];
							if (local519 != 0) {
								if (arg0) {
									local277[local57] = this.anIntArray213[local519 & 0xFF];
								}
								if (arg1 && arg12) {
									local273[local57] = arg5;
								}
							}
						}
						local11 += local37;
						local57++;
					}
					local13 += local43;
					local11 = local284;
					local57 += local153;
				}
			} else {
				@Pc(858) byte local858;
				if (arg8 == 0) {
					local284 = local11;
					if ((arg9 & 0xFFFFFF) == 16777215) {
						local287 = arg9 >>> 24;
						local296 = 256 - local287;
						for (local299 = -arg7; local299 < 0; local299++) {
							local378 = (local13 >> 16) * this.anInt2554;
							for (local387 = -arg6; local387 < 0; local387++) {
								if (!arg1 || arg5 < local273[local57]) {
									local858 = this.aByteArray47[(local11 >> 16) + local378];
									if (local858 != 0) {
										if (arg0) {
											local416 = this.anIntArray213[local858 & 0xFF];
											local424 = local277[local57];
											local277[local57] = ((local416 & 0xFF00FF) * local287 + (local424 & 0xFF00FF) * local296 & 0xFF00FF00) + ((local416 & 0xFF00) * local287 + (local424 & 0xFF00) * local296 & 0xFF0000) >> 8;
										}
										if (arg1 && arg12) {
											local273[local57] = arg5;
										}
									}
								}
								local11 += local37;
								local57++;
							}
							local13 += local43;
							local11 = local284;
							local57 += local153;
						}
					} else {
						local287 = arg9 >> 16 & 0xFF;
						local296 = arg9 >> 8 & 0xFF;
						local299 = arg9 & 0xFF;
						local378 = arg9 >>> 24;
						local387 = 256 - local378;
						for (local390 = -arg7; local390 < 0; local390++) {
							local416 = (local13 >> 16) * this.anInt2554;
							for (local424 = -arg6; local424 < 0; local424++) {
								if (!arg1 || arg5 < local273[local57]) {
									@Pc(991) byte local991 = this.aByteArray47[(local11 >> 16) + local416];
									if (local991 != 0) {
										local440 = this.anIntArray213[local991 & 0xFF];
										if (local378 == 255) {
											if (arg0) {
												local1013 = (local440 & 0xFF0000) * local287 & 0xFF000000;
												local1021 = (local440 & 0xFF00) * local296 & 0xFF0000;
												local1029 = (local440 & 0xFF) * local299 & 0xFF00;
												local277[local57] = (local1013 | local1021 | local1029) >>> 8;
											}
											if (arg1 && arg12) {
												local273[local57] = arg5;
											}
										} else {
											if (arg0) {
												local1013 = (local440 & 0xFF0000) * local287 & 0xFF000000;
												local1021 = (local440 & 0xFF00) * local296 & 0xFF0000;
												local1029 = (local440 & 0xFF) * local299 & 0xFF00;
												local440 = (local1013 | local1021 | local1029) >>> 8;
												local1041 = local277[local57];
												local277[local57] = ((local440 & 0xFF00FF) * local378 + (local1041 & 0xFF00FF) * local387 & 0xFF00FF00) + ((local440 & 0xFF00) * local378 + (local1041 & 0xFF00) * local387 & 0xFF0000) >> 8;
											}
											if (arg1 && arg12) {
												local273[local57] = arg5;
											}
										}
									}
								}
								local11 += local37;
								local57++;
							}
							local13 += local43;
							local11 = local284;
							local57 += local153;
						}
					}
				} else if (arg8 == 3) {
					local284 = local11;
					local287 = arg9 >>> 24;
					local296 = 256 - local287;
					for (local299 = -arg7; local299 < 0; local299++) {
						local378 = (local13 >> 16) * this.anInt2554;
						for (local387 = -arg6; local387 < 0; local387++) {
							if (!arg1 || arg5 < local273[local57]) {
								if (arg0) {
									local858 = this.aByteArray47[(local11 >> 16) + local378];
									local416 = local858 > 0 ? this.anIntArray213[local858] : 0;
									local424 = local416 + arg9;
									local432 = (local416 & 0xFF00FF) + (arg9 & 0xFF00FF);
									local440 = (local432 & 0x1000100) + (local424 - local432 & 0x10000);
									local440 = local424 - local440 | local440 - (local440 >>> 8);
									if (local416 == 0 && local287 != 255) {
										local416 = local440;
										local440 = local277[local57];
										local440 = ((local416 & 0xFF00FF) * local287 + (local440 & 0xFF00FF) * local296 & 0xFF00FF00) + ((local416 & 0xFF00) * local287 + (local440 & 0xFF00) * local296 & 0xFF0000) >> 8;
									}
									local277[local57] = local440;
								}
								if (arg1 && arg12) {
									local273[local57] = arg5;
								}
							}
							local11 += local37;
							local57++;
						}
						local13 += local43;
						local11 = local284;
						local57 += local153;
					}
				} else if (arg8 == 2) {
					local284 = arg9 >>> 24;
					local287 = 256 - local284;
					local296 = (arg9 & 0xFF00FF) * local287 & 0xFF00FF00;
					local299 = (arg9 & 0xFF00) * local287 & 0xFF0000;
					local623 = (local296 | local299) >>> 8;
					local378 = local11;
					for (local387 = -arg7; local387 < 0; local387++) {
						local390 = (local13 >> 16) * this.anInt2554;
						for (local416 = -arg6; local416 < 0; local416++) {
							if (!arg1 || arg5 < local273[local57]) {
								local1378 = this.aByteArray47[(local11 >> 16) + local390];
								if (local1378 != 0) {
									if (arg0) {
										local432 = this.anIntArray213[local1378 & 0xFF];
										local296 = (local432 & 0xFF00FF) * local284 & 0xFF00FF00;
										local299 = (local432 & 0xFF00) * local284 & 0xFF0000;
										local277[local57] = ((local296 | local299) >>> 8) + local623;
									}
									if (arg1 && arg12) {
										local273[local57] = arg5;
									}
								}
							}
							local11 += local37;
							local57++;
						}
						local13 += local43;
						local11 = local378;
						local57 += local153;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg8 == 1) {
			local284 = local11;
			for (local287 = -arg7; local287 < 0; local287++) {
				local296 = (local13 >> 16) * this.anInt2554;
				for (local299 = -arg6; local299 < 0; local299++) {
					if (!arg1 || arg5 < local273[local57]) {
						if (arg0) {
							local277[local57] = this.anIntArray213[this.aByteArray47[(local11 >> 16) + local296] & 0xFF];
						}
						if (arg1 && arg12) {
							local273[local57] = arg5;
						}
					}
					local11 += local37;
					local57++;
				}
				local13 += local43;
				local11 = local284;
				local57 += local153;
			}
		} else if (arg8 == 0) {
			local284 = arg9 >> 16 & 0xFF;
			local287 = arg9 >> 8 & 0xFF;
			local296 = arg9 & 0xFF;
			local299 = local11;
			for (local378 = -arg7; local378 < 0; local378++) {
				local387 = (local13 >> 16) * this.anInt2554;
				for (local390 = -arg6; local390 < 0; local390++) {
					if (!arg1 || arg5 < local273[local57]) {
						if (arg0) {
							local416 = this.anIntArray213[this.aByteArray47[(local11 >> 16) + local387] & 0xFF];
							local424 = (local416 & 0xFF0000) * local284 & 0xFF000000;
							local432 = (local416 & 0xFF00) * local287 & 0xFF0000;
							local440 = (local416 & 0xFF) * local296 & 0xFF00;
							local277[local57] = (local424 | local432 | local440) >>> 8;
						}
						if (arg1 && arg12) {
							local273[local57] = arg5;
						}
					}
					local11 += local37;
					local57++;
				}
				local13 += local43;
				local11 = local299;
				local57 += local153;
			}
		} else if (arg8 == 3) {
			local284 = local11;
			for (local287 = -arg7; local287 < 0; local287++) {
				local296 = (local13 >> 16) * this.anInt2554;
				for (local299 = -arg6; local299 < 0; local299++) {
					if (!arg1 || arg5 < local273[local57]) {
						if (arg0) {
							local519 = this.aByteArray47[(local11 >> 16) + local296];
							local387 = local519 > 0 ? this.anIntArray213[local519] : 0;
							local390 = local387 + arg9;
							local416 = (local387 & 0xFF00FF) + (arg9 & 0xFF00FF);
							local424 = (local416 & 0x1000100) + (local390 - local416 & 0x10000);
							local277[local57] = local390 - local424 | local424 - (local424 >>> 8);
						}
						if (arg1 && arg12) {
							local273[local57] = arg5;
						}
					}
					local11 += local37;
					local57++;
				}
				local13 += local43;
				local11 = local284;
				local57 += local153;
			}
		} else if (arg8 == 2) {
			local284 = arg9 >>> 24;
			local287 = 256 - local284;
			local296 = (arg9 & 0xFF00FF) * local287 & 0xFF00FF00;
			local299 = (arg9 & 0xFF00) * local287 & 0xFF0000;
			local623 = (local296 | local299) >>> 8;
			local378 = local11;
			for (local387 = -arg7; local387 < 0; local387++) {
				local390 = (local13 >> 16) * this.anInt2554;
				for (local416 = -arg6; local416 < 0; local416++) {
					if (!arg1 || arg5 < local273[local57]) {
						if (arg0) {
							local424 = this.anIntArray213[this.aByteArray47[(local11 >> 16) + local390] & 0xFF];
							local296 = (local424 & 0xFF00FF) * local284 & 0xFF00FF00;
							local299 = (local424 & 0xFF00) * local284 & 0xFF0000;
							local277[local57] = ((local296 | local299) >>> 8) + local623;
						}
						if (arg1 && arg12) {
							local273[local57] = arg5;
						}
					}
					local11 += local37;
					local57++;
				}
				local13 += local43;
				local11 = local378;
				local57 += local153;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!apf", name = "cj", descriptor = "(II)V")
	@Override
	void method18304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int[] local3 = this.aClass102_Sub2_10.anIntArray50;
		if (local3 == null) {
			return;
		}
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(18) int local18;
		@Pc(20) int local20;
		@Pc(22) int local22;
		@Pc(57) int local57;
		@Pc(60) int local60;
		@Pc(90) int local90;
		@Pc(98) int local98;
		@Pc(106) int local106;
		@Pc(114) int local114;
		@Pc(162) int local162;
		@Pc(347) int local347;
		@Pc(676) int local676;
		@Pc(684) int local684;
		@Pc(939) int local939;
		@Pc(230) byte local230;
		if (anInt2568 == 0) {
			if (anInt2576 == 0) {
				local12 = anInt2565;
				while (local12 < 0) {
					local16 = anInt2567;
					local18 = anInt2574;
					local20 = anInt2575;
					local22 = anInt2563;
					if (local18 >= 0 && local20 >= 0 && local18 - (this.anInt2554 << 12) < 0 && local20 - (this.anInt2559 << 12) < 0) {
						while (local22 < 0) {
							local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
							local60 = local16++;
							if (arg1 == 0) {
								if (arg0 == 1) {
									local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								} else if (arg0 == 0) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
									local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
									local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
									local3[local60] = (local98 | local106 | local114) >>> 8;
								} else if (arg0 == 3) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = anInt2582;
									local106 = local90 + local98;
									local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
									local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
									local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
								} else if (arg0 == 2) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
									local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg1 != 1) {
								if (arg1 != 2) {
									throw new IllegalArgumentException();
								}
								if (arg0 == 1) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = local3[local60];
										local114 = local98 + local106;
										local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
										local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
										local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
									}
								} else if (arg0 == 0) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local98 = (local106 | local114 | local162) >>> 8;
										local347 = local3[local60];
										local676 = local98 + local347;
										local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
										local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
										local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
									}
								} else if (arg0 == 3) {
									local230 = this.aByteArray47[local57];
									local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
									local106 = anInt2582;
									local114 = local98 + local106;
									local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
									local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
									local347 = local114 - local347 | local347 - (local347 >>> 8);
									if (local98 == 0 && anInt2578 != 255) {
										local98 = local347;
										local347 = local3[local60];
										local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
									}
									local3[local60] = local347;
								} else if (arg0 == 2) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
										local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
										local98 = ((local106 | local114) >>> 8) + anInt2586;
										local162 = local3[local60];
										local347 = local98 + local162;
										local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
										local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
										local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
									}
								}
							} else if (arg0 == 1) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local3[local60] = this.anIntArray213[local230 & 0xFF];
								}
							} else if (arg0 == 0) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									if ((anInt2582 & 0xFFFFFF) == 16777215) {
										local106 = anInt2582 >>> 24;
										local114 = 256 - local106;
										local162 = local3[local60];
										local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
									} else if (anInt2578 == 255) {
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local3[local60] = (local106 | local114 | local162) >>> 8;
									} else {
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local98 = (local106 | local114 | local162) >>> 8;
										local347 = local3[local60];
										local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local230 = this.aByteArray47[local57];
								local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
								local106 = anInt2582;
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local347 = local114 - local347 | local347 - (local347 >>> 8);
								if (local98 == 0 && anInt2578 != 255) {
									local98 = local347;
									local347 = local3[local60];
									local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
								local3[local60] = local347;
							} else if (arg0 == 2) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
									local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local22++;
						}
					}
					local12++;
					anInt2567 += anInt2566;
				}
			} else if (anInt2576 < 0) {
				local12 = anInt2565;
				while (local12 < 0) {
					local16 = anInt2567;
					local18 = anInt2574;
					local20 = anInt2575 + anInt2577;
					local22 = anInt2563;
					if (local18 >= 0 && local18 - (this.anInt2554 << 12) < 0) {
						@Pc(932) int local932;
						if ((local932 = local20 - (this.anInt2559 << 12)) >= 0) {
							local939 = (anInt2576 - local932) / anInt2576;
							local22 += local939;
							local20 += anInt2576 * local939;
							local16 += local939;
						}
						@Pc(960) int local960;
						if ((local960 = (local20 - anInt2576) / anInt2576) > local22) {
							local22 = local960;
						}
						while (local22 < 0) {
							local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
							local60 = local16++;
							if (arg1 == 0) {
								if (arg0 == 1) {
									local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								} else if (arg0 == 0) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
									local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
									local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
									local3[local60] = (local98 | local106 | local114) >>> 8;
								} else if (arg0 == 3) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = anInt2582;
									local106 = local90 + local98;
									local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
									local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
									local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
								} else if (arg0 == 2) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
									local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg1 != 1) {
								if (arg1 != 2) {
									throw new IllegalArgumentException();
								}
								if (arg0 == 1) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = local3[local60];
										local114 = local98 + local106;
										local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
										local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
										local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
									}
								} else if (arg0 == 0) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local98 = (local106 | local114 | local162) >>> 8;
										local347 = local3[local60];
										local676 = local98 + local347;
										local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
										local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
										local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
									}
								} else if (arg0 == 3) {
									local230 = this.aByteArray47[local57];
									local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
									local106 = anInt2582;
									local114 = local98 + local106;
									local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
									local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
									local347 = local114 - local347 | local347 - (local347 >>> 8);
									if (local98 == 0 && anInt2578 != 255) {
										local98 = local347;
										local347 = local3[local60];
										local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
									}
									local3[local60] = local347;
								} else if (arg0 == 2) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
										local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
										local98 = ((local106 | local114) >>> 8) + anInt2586;
										local162 = local3[local60];
										local347 = local98 + local162;
										local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
										local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
										local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
									}
								}
							} else if (arg0 == 1) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local3[local60] = this.anIntArray213[local230 & 0xFF];
								}
							} else if (arg0 == 0) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									if ((anInt2582 & 0xFFFFFF) == 16777215) {
										local106 = anInt2582 >>> 24;
										local114 = 256 - local106;
										local162 = local3[local60];
										local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
									} else if (anInt2578 == 255) {
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local3[local60] = (local106 | local114 | local162) >>> 8;
									} else {
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local98 = (local106 | local114 | local162) >>> 8;
										local347 = local3[local60];
										local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local230 = this.aByteArray47[local57];
								local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
								local106 = anInt2582;
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local347 = local114 - local347 | local347 - (local347 >>> 8);
								if (local98 == 0 && anInt2578 != 255) {
									local98 = local347;
									local347 = local3[local60];
									local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
								local3[local60] = local347;
							} else if (arg0 == 2) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
									local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local20 += anInt2576;
							local22++;
						}
					}
					local12++;
					anInt2574 += anInt2570;
					anInt2567 += anInt2566;
				}
			} else {
				local12 = anInt2565;
				while (local12 < 0) {
					local16 = anInt2567;
					local18 = anInt2574;
					local20 = anInt2575 + anInt2577;
					local22 = anInt2563;
					if (local18 >= 0 && local18 - (this.anInt2554 << 12) < 0) {
						if (local20 < 0) {
							local939 = (anInt2576 - 1 - local20) / anInt2576;
							local22 += local939;
							local20 += anInt2576 * local939;
							local16 += local939;
						}
						@Pc(1888) int local1888;
						if ((local1888 = (local20 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local22) {
							local22 = local1888;
						}
						while (local22 < 0) {
							local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
							local60 = local16++;
							if (arg1 == 0) {
								if (arg0 == 1) {
									local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								} else if (arg0 == 0) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
									local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
									local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
									local3[local60] = (local98 | local106 | local114) >>> 8;
								} else if (arg0 == 3) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = anInt2582;
									local106 = local90 + local98;
									local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
									local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
									local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
								} else if (arg0 == 2) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
									local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg1 != 1) {
								if (arg1 != 2) {
									throw new IllegalArgumentException();
								}
								if (arg0 == 1) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = local3[local60];
										local114 = local98 + local106;
										local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
										local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
										local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
									}
								} else if (arg0 == 0) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local98 = (local106 | local114 | local162) >>> 8;
										local347 = local3[local60];
										local676 = local98 + local347;
										local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
										local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
										local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
									}
								} else if (arg0 == 3) {
									local230 = this.aByteArray47[local57];
									local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
									local106 = anInt2582;
									local114 = local98 + local106;
									local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
									local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
									local347 = local114 - local347 | local347 - (local347 >>> 8);
									if (local98 == 0 && anInt2578 != 255) {
										local98 = local347;
										local347 = local3[local60];
										local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
									}
									local3[local60] = local347;
								} else if (arg0 == 2) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
										local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
										local98 = ((local106 | local114) >>> 8) + anInt2586;
										local162 = local3[local60];
										local347 = local98 + local162;
										local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
										local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
										local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
									}
								}
							} else if (arg0 == 1) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local3[local60] = this.anIntArray213[local230 & 0xFF];
								}
							} else if (arg0 == 0) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									if ((anInt2582 & 0xFFFFFF) == 16777215) {
										local106 = anInt2582 >>> 24;
										local114 = 256 - local106;
										local162 = local3[local60];
										local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
									} else if (anInt2578 == 255) {
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local3[local60] = (local106 | local114 | local162) >>> 8;
									} else {
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local98 = (local106 | local114 | local162) >>> 8;
										local347 = local3[local60];
										local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local230 = this.aByteArray47[local57];
								local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
								local106 = anInt2582;
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local347 = local114 - local347 | local347 - (local347 >>> 8);
								if (local98 == 0 && anInt2578 != 255) {
									local98 = local347;
									local347 = local3[local60];
									local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
								local3[local60] = local347;
							} else if (arg0 == 2) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
									local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local20 += anInt2576;
							local22++;
						}
					}
					local12++;
					anInt2574 += anInt2570;
					anInt2567 += anInt2566;
				}
			}
		} else if (anInt2568 < 0) {
			if (anInt2576 == 0) {
				local12 = anInt2565;
				while (local12 < 0) {
					local16 = anInt2567;
					local18 = anInt2574 + anInt2579;
					local20 = anInt2575;
					local22 = anInt2563;
					if (local20 >= 0 && local20 - (this.anInt2559 << 12) < 0) {
						@Pc(2790) int local2790;
						if ((local2790 = local18 - (this.anInt2554 << 12)) >= 0) {
							local939 = (anInt2568 - local2790) / anInt2568;
							local22 += local939;
							local18 += anInt2568 * local939;
							local16 += local939;
						}
						@Pc(2818) int local2818;
						if ((local2818 = (local18 - anInt2568) / anInt2568) > local22) {
							local22 = local2818;
						}
						while (local22 < 0) {
							local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
							local60 = local16++;
							if (arg1 == 0) {
								if (arg0 == 1) {
									local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								} else if (arg0 == 0) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
									local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
									local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
									local3[local60] = (local98 | local106 | local114) >>> 8;
								} else if (arg0 == 3) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = anInt2582;
									local106 = local90 + local98;
									local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
									local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
									local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
								} else if (arg0 == 2) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
									local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg1 != 1) {
								if (arg1 != 2) {
									throw new IllegalArgumentException();
								}
								if (arg0 == 1) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = local3[local60];
										local114 = local98 + local106;
										local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
										local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
										local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
									}
								} else if (arg0 == 0) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local98 = (local106 | local114 | local162) >>> 8;
										local347 = local3[local60];
										local676 = local98 + local347;
										local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
										local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
										local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
									}
								} else if (arg0 == 3) {
									local230 = this.aByteArray47[local57];
									local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
									local106 = anInt2582;
									local114 = local98 + local106;
									local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
									local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
									local347 = local114 - local347 | local347 - (local347 >>> 8);
									if (local98 == 0 && anInt2578 != 255) {
										local98 = local347;
										local347 = local3[local60];
										local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
									}
									local3[local60] = local347;
								} else if (arg0 == 2) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
										local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
										local98 = ((local106 | local114) >>> 8) + anInt2586;
										local162 = local3[local60];
										local347 = local98 + local162;
										local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
										local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
										local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
									}
								}
							} else if (arg0 == 1) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local3[local60] = this.anIntArray213[local230 & 0xFF];
								}
							} else if (arg0 == 0) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									if ((anInt2582 & 0xFFFFFF) == 16777215) {
										local106 = anInt2582 >>> 24;
										local114 = 256 - local106;
										local162 = local3[local60];
										local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
									} else if (anInt2578 == 255) {
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local3[local60] = (local106 | local114 | local162) >>> 8;
									} else {
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local98 = (local106 | local114 | local162) >>> 8;
										local347 = local3[local60];
										local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local230 = this.aByteArray47[local57];
								local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
								local106 = anInt2582;
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local347 = local114 - local347 | local347 - (local347 >>> 8);
								if (local98 == 0 && anInt2578 != 255) {
									local98 = local347;
									local347 = local3[local60];
									local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
								local3[local60] = local347;
							} else if (arg0 == 2) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
									local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local18 += anInt2568;
							local22++;
						}
					}
					local12++;
					anInt2575 += anInt2560;
					anInt2567 += anInt2566;
				}
			} else if (anInt2576 < 0) {
				local12 = anInt2565;
				while (local12 < 0) {
					local16 = anInt2567;
					local18 = anInt2574 + anInt2579;
					local20 = anInt2575 + anInt2577;
					local22 = anInt2563;
					@Pc(3709) int local3709;
					if ((local3709 = local18 - (this.anInt2554 << 12)) >= 0) {
						local939 = (anInt2568 - local3709) / anInt2568;
						local22 += local939;
						local18 += anInt2568 * local939;
						local20 += anInt2576 * local939;
						local16 += local939;
					}
					@Pc(3743) int local3743;
					if ((local3743 = (local18 - anInt2568) / anInt2568) > local22) {
						local22 = local3743;
					}
					@Pc(3755) int local3755;
					if ((local3755 = local20 - (this.anInt2559 << 12)) >= 0) {
						local939 = (anInt2576 - local3755) / anInt2576;
						local22 += local939;
						local18 += anInt2568 * local939;
						local20 += anInt2576 * local939;
						local16 += local939;
					}
					@Pc(3789) int local3789;
					if ((local3789 = (local20 - anInt2576) / anInt2576) > local22) {
						local22 = local3789;
					}
					while (local22 < 0) {
						local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
						local60 = local16++;
						if (arg1 == 0) {
							if (arg0 == 1) {
								local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							} else if (arg0 == 0) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
								local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
								local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
								local3[local60] = (local98 | local106 | local114) >>> 8;
							} else if (arg0 == 3) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = anInt2582;
								local106 = local90 + local98;
								local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
								local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
								local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
							} else if (arg0 == 2) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
								local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
								local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (arg1 != 1) {
							if (arg1 != 2) {
								throw new IllegalArgumentException();
							}
							if (arg0 == 1) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = local3[local60];
									local114 = local98 + local106;
									local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
									local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
									local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
								}
							} else if (arg0 == 0) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local98 = (local106 | local114 | local162) >>> 8;
									local347 = local3[local60];
									local676 = local98 + local347;
									local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
									local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
									local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
								}
							} else if (arg0 == 3) {
								local230 = this.aByteArray47[local57];
								local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
								local106 = anInt2582;
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local347 = local114 - local347 | local347 - (local347 >>> 8);
								if (local98 == 0 && anInt2578 != 255) {
									local98 = local347;
									local347 = local3[local60];
									local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
								local3[local60] = local347;
							} else if (arg0 == 2) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
									local98 = ((local106 | local114) >>> 8) + anInt2586;
									local162 = local3[local60];
									local347 = local98 + local162;
									local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
									local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
									local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
								}
							}
						} else if (arg0 == 1) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local3[local60] = this.anIntArray213[local230 & 0xFF];
							}
						} else if (arg0 == 0) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								if ((anInt2582 & 0xFFFFFF) == 16777215) {
									local106 = anInt2582 >>> 24;
									local114 = 256 - local106;
									local162 = local3[local60];
									local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
								} else if (anInt2578 == 255) {
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local3[local60] = (local106 | local114 | local162) >>> 8;
								} else {
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local98 = (local106 | local114 | local162) >>> 8;
									local347 = local3[local60];
									local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local230 = this.aByteArray47[local57];
							local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
							local106 = anInt2582;
							local114 = local98 + local106;
							local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
							local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
							local347 = local114 - local347 | local347 - (local347 >>> 8);
							if (local98 == 0 && anInt2578 != 255) {
								local98 = local347;
								local347 = local3[local60];
								local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
							}
							local3[local60] = local347;
						} else if (arg0 == 2) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
								local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
								local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local18 += anInt2568;
						local20 += anInt2576;
						local22++;
					}
					local12++;
					anInt2574 += anInt2570;
					anInt2575 += anInt2560;
					anInt2567 += anInt2566;
				}
			} else {
				local12 = anInt2565;
				while (local12 < 0) {
					local16 = anInt2567;
					local18 = anInt2574 + anInt2579;
					local20 = anInt2575 + anInt2577;
					local22 = anInt2563;
					@Pc(4686) int local4686;
					if ((local4686 = local18 - (this.anInt2554 << 12)) >= 0) {
						local939 = (anInt2568 - local4686) / anInt2568;
						local22 += local939;
						local18 += anInt2568 * local939;
						local20 += anInt2576 * local939;
						local16 += local939;
					}
					@Pc(4720) int local4720;
					if ((local4720 = (local18 - anInt2568) / anInt2568) > local22) {
						local22 = local4720;
					}
					if (local20 < 0) {
						local939 = (anInt2576 - 1 - local20) / anInt2576;
						local22 += local939;
						local18 += anInt2568 * local939;
						local20 += anInt2576 * local939;
						local16 += local939;
					}
					@Pc(4768) int local4768;
					if ((local4768 = (local20 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local22) {
						local22 = local4768;
					}
					while (local22 < 0) {
						local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
						local60 = local16++;
						if (arg1 == 0) {
							if (arg0 == 1) {
								local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							} else if (arg0 == 0) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
								local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
								local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
								local3[local60] = (local98 | local106 | local114) >>> 8;
							} else if (arg0 == 3) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = anInt2582;
								local106 = local90 + local98;
								local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
								local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
								local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
							} else if (arg0 == 2) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
								local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
								local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (arg1 != 1) {
							if (arg1 != 2) {
								throw new IllegalArgumentException();
							}
							if (arg0 == 1) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = local3[local60];
									local114 = local98 + local106;
									local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
									local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
									local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
								}
							} else if (arg0 == 0) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local98 = (local106 | local114 | local162) >>> 8;
									local347 = local3[local60];
									local676 = local98 + local347;
									local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
									local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
									local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
								}
							} else if (arg0 == 3) {
								local230 = this.aByteArray47[local57];
								local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
								local106 = anInt2582;
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local347 = local114 - local347 | local347 - (local347 >>> 8);
								if (local98 == 0 && anInt2578 != 255) {
									local98 = local347;
									local347 = local3[local60];
									local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
								local3[local60] = local347;
							} else if (arg0 == 2) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
									local98 = ((local106 | local114) >>> 8) + anInt2586;
									local162 = local3[local60];
									local347 = local98 + local162;
									local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
									local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
									local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
								}
							}
						} else if (arg0 == 1) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local3[local60] = this.anIntArray213[local230 & 0xFF];
							}
						} else if (arg0 == 0) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								if ((anInt2582 & 0xFFFFFF) == 16777215) {
									local106 = anInt2582 >>> 24;
									local114 = 256 - local106;
									local162 = local3[local60];
									local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
								} else if (anInt2578 == 255) {
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local3[local60] = (local106 | local114 | local162) >>> 8;
								} else {
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local98 = (local106 | local114 | local162) >>> 8;
									local347 = local3[local60];
									local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local230 = this.aByteArray47[local57];
							local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
							local106 = anInt2582;
							local114 = local98 + local106;
							local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
							local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
							local347 = local114 - local347 | local347 - (local347 >>> 8);
							if (local98 == 0 && anInt2578 != 255) {
								local98 = local347;
								local347 = local3[local60];
								local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
							}
							local3[local60] = local347;
						} else if (arg0 == 2) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
								local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
								local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local18 += anInt2568;
						local20 += anInt2576;
						local22++;
					}
					local12++;
					anInt2574 += anInt2570;
					anInt2575 += anInt2560;
					anInt2567 += anInt2566;
				}
			}
		} else if (anInt2576 == 0) {
			local12 = anInt2565;
			while (local12 < 0) {
				local16 = anInt2567;
				local18 = anInt2574 + anInt2579;
				local20 = anInt2575;
				local22 = anInt2563;
				if (local20 >= 0 && local20 - (this.anInt2559 << 12) < 0) {
					if (local18 < 0) {
						local939 = (anInt2568 - 1 - local18) / anInt2568;
						local22 += local939;
						local18 += anInt2568 * local939;
						local16 += local939;
					}
					@Pc(5706) int local5706;
					if ((local5706 = (local18 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local22) {
						local22 = local5706;
					}
					while (local22 < 0) {
						local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
						local60 = local16++;
						if (arg1 == 0) {
							if (arg0 == 1) {
								local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							} else if (arg0 == 0) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
								local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
								local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
								local3[local60] = (local98 | local106 | local114) >>> 8;
							} else if (arg0 == 3) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = anInt2582;
								local106 = local90 + local98;
								local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
								local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
								local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
							} else if (arg0 == 2) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
								local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
								local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (arg1 != 1) {
							if (arg1 != 2) {
								throw new IllegalArgumentException();
							}
							if (arg0 == 1) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = local3[local60];
									local114 = local98 + local106;
									local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
									local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
									local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
								}
							} else if (arg0 == 0) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local98 = (local106 | local114 | local162) >>> 8;
									local347 = local3[local60];
									local676 = local98 + local347;
									local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
									local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
									local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
								}
							} else if (arg0 == 3) {
								local230 = this.aByteArray47[local57];
								local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
								local106 = anInt2582;
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local347 = local114 - local347 | local347 - (local347 >>> 8);
								if (local98 == 0 && anInt2578 != 255) {
									local98 = local347;
									local347 = local3[local60];
									local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
								local3[local60] = local347;
							} else if (arg0 == 2) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
									local98 = ((local106 | local114) >>> 8) + anInt2586;
									local162 = local3[local60];
									local347 = local98 + local162;
									local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
									local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
									local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
								}
							}
						} else if (arg0 == 1) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local3[local60] = this.anIntArray213[local230 & 0xFF];
							}
						} else if (arg0 == 0) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								if ((anInt2582 & 0xFFFFFF) == 16777215) {
									local106 = anInt2582 >>> 24;
									local114 = 256 - local106;
									local162 = local3[local60];
									local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
								} else if (anInt2578 == 255) {
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local3[local60] = (local106 | local114 | local162) >>> 8;
								} else {
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local98 = (local106 | local114 | local162) >>> 8;
									local347 = local3[local60];
									local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local230 = this.aByteArray47[local57];
							local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
							local106 = anInt2582;
							local114 = local98 + local106;
							local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
							local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
							local347 = local114 - local347 | local347 - (local347 >>> 8);
							if (local98 == 0 && anInt2578 != 255) {
								local98 = local347;
								local347 = local3[local60];
								local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
							}
							local3[local60] = local347;
						} else if (arg0 == 2) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
								local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
								local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local18 += anInt2568;
						local22++;
					}
				}
				local12++;
				anInt2574 += anInt2570;
				anInt2575 += anInt2560;
				anInt2567 += anInt2566;
			}
		} else if (anInt2576 < 0) {
			for (local12 = anInt2565; local12 < 0; local12++) {
				local16 = anInt2567;
				local18 = anInt2574 + anInt2579;
				local20 = anInt2575 + anInt2577;
				local22 = anInt2563;
				if (local18 < 0) {
					local939 = (anInt2568 - 1 - local18) / anInt2568;
					local22 += local939;
					local18 += anInt2568 * local939;
					local20 += anInt2576 * local939;
					local16 += local939;
				}
				@Pc(6637) int local6637;
				if ((local6637 = (local18 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local22) {
					local22 = local6637;
				}
				@Pc(6649) int local6649;
				if ((local6649 = local20 - (this.anInt2559 << 12)) >= 0) {
					local939 = (anInt2576 - local6649) / anInt2576;
					local22 += local939;
					local18 += anInt2568 * local939;
					local20 += anInt2576 * local939;
					local16 += local939;
				}
				@Pc(6683) int local6683;
				if ((local6683 = (local20 - anInt2576) / anInt2576) > local22) {
					local22 = local6683;
				}
				while (local22 < 0) {
					local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
					local60 = local16++;
					if (arg1 == 0) {
						if (arg0 == 1) {
							local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
						} else if (arg0 == 0) {
							local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
							local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
							local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
							local3[local60] = (local98 | local106 | local114) >>> 8;
						} else if (arg0 == 3) {
							local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							local98 = anInt2582;
							local106 = local90 + local98;
							local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
							local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
							local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
						} else if (arg0 == 2) {
							local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
							local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
							local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
						} else {
							throw new IllegalArgumentException();
						}
					} else if (arg1 != 1) {
						if (arg1 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg0 == 1) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = local3[local60];
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
							}
						} else if (arg0 == 0) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
								local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
								local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
								local98 = (local106 | local114 | local162) >>> 8;
								local347 = local3[local60];
								local676 = local98 + local347;
								local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
								local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
								local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
							}
						} else if (arg0 == 3) {
							local230 = this.aByteArray47[local57];
							local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
							local106 = anInt2582;
							local114 = local98 + local106;
							local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
							local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
							local347 = local114 - local347 | local347 - (local347 >>> 8);
							if (local98 == 0 && anInt2578 != 255) {
								local98 = local347;
								local347 = local3[local60];
								local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
							}
							local3[local60] = local347;
						} else if (arg0 == 2) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
								local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
								local98 = ((local106 | local114) >>> 8) + anInt2586;
								local162 = local3[local60];
								local347 = local98 + local162;
								local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
								local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
								local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
							}
						}
					} else if (arg0 == 1) {
						local230 = this.aByteArray47[local57];
						if (local230 != 0) {
							local3[local60] = this.anIntArray213[local230 & 0xFF];
						}
					} else if (arg0 == 0) {
						local230 = this.aByteArray47[local57];
						if (local230 != 0) {
							local98 = this.anIntArray213[local230 & 0xFF];
							if ((anInt2582 & 0xFFFFFF) == 16777215) {
								local106 = anInt2582 >>> 24;
								local114 = 256 - local106;
								local162 = local3[local60];
								local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
							} else if (anInt2578 == 255) {
								local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
								local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
								local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
								local3[local60] = (local106 | local114 | local162) >>> 8;
							} else {
								local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
								local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
								local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
								local98 = (local106 | local114 | local162) >>> 8;
								local347 = local3[local60];
								local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						local230 = this.aByteArray47[local57];
						local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
						local106 = anInt2582;
						local114 = local98 + local106;
						local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
						local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
						local347 = local114 - local347 | local347 - (local347 >>> 8);
						if (local98 == 0 && anInt2578 != 255) {
							local98 = local347;
							local347 = local3[local60];
							local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
						}
						local3[local60] = local347;
					} else if (arg0 == 2) {
						local230 = this.aByteArray47[local57];
						if (local230 != 0) {
							local98 = this.anIntArray213[local230 & 0xFF];
							local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
							local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
							local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
						}
					} else {
						throw new IllegalArgumentException();
					}
					local18 += anInt2568;
					local20 += anInt2576;
					local22++;
				}
				anInt2574 += anInt2570;
				anInt2575 += anInt2560;
				anInt2567 += anInt2566;
			}
		} else {
			for (local12 = anInt2565; local12 < 0; local12++) {
				local16 = anInt2567;
				local18 = anInt2574 + anInt2579;
				local20 = anInt2575 + anInt2577;
				local22 = anInt2563;
				if (local18 < 0) {
					local939 = (anInt2568 - 1 - local18) / anInt2568;
					local22 += local939;
					local18 += anInt2568 * local939;
					local20 += anInt2576 * local939;
					local16 += local939;
				}
				@Pc(7616) int local7616;
				if ((local7616 = (local18 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local22) {
					local22 = local7616;
				}
				if (local20 < 0) {
					local939 = (anInt2576 - 1 - local20) / anInt2576;
					local22 += local939;
					local18 += anInt2568 * local939;
					local20 += anInt2576 * local939;
					local16 += local939;
				}
				@Pc(7664) int local7664;
				if ((local7664 = (local20 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local22) {
					local22 = local7664;
				}
				while (local22 < 0) {
					local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
					local60 = local16++;
					if (arg1 == 0) {
						if (arg0 == 1) {
							local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
						} else if (arg0 == 0) {
							local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
							local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
							local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
							local3[local60] = (local98 | local106 | local114) >>> 8;
						} else if (arg0 == 3) {
							local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							local98 = anInt2582;
							local106 = local90 + local98;
							local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
							local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
							local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
						} else if (arg0 == 2) {
							local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
							local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
							local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
						} else {
							throw new IllegalArgumentException();
						}
					} else if (arg1 != 1) {
						if (arg1 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg0 == 1) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = local3[local60];
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
							}
						} else if (arg0 == 0) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
								local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
								local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
								local98 = (local106 | local114 | local162) >>> 8;
								local347 = local3[local60];
								local676 = local98 + local347;
								local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
								local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
								local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
							}
						} else if (arg0 == 3) {
							local230 = this.aByteArray47[local57];
							local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
							local106 = anInt2582;
							local114 = local98 + local106;
							local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
							local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
							local347 = local114 - local347 | local347 - (local347 >>> 8);
							if (local98 == 0 && anInt2578 != 255) {
								local98 = local347;
								local347 = local3[local60];
								local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
							}
							local3[local60] = local347;
						} else if (arg0 == 2) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
								local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
								local98 = ((local106 | local114) >>> 8) + anInt2586;
								local162 = local3[local60];
								local347 = local98 + local162;
								local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
								local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
								local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
							}
						}
					} else if (arg0 == 1) {
						local230 = this.aByteArray47[local57];
						if (local230 != 0) {
							local3[local60] = this.anIntArray213[local230 & 0xFF];
						}
					} else if (arg0 == 0) {
						local230 = this.aByteArray47[local57];
						if (local230 != 0) {
							local98 = this.anIntArray213[local230 & 0xFF];
							if ((anInt2582 & 0xFFFFFF) == 16777215) {
								local106 = anInt2582 >>> 24;
								local114 = 256 - local106;
								local162 = local3[local60];
								local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
							} else if (anInt2578 == 255) {
								local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
								local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
								local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
								local3[local60] = (local106 | local114 | local162) >>> 8;
							} else {
								local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
								local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
								local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
								local98 = (local106 | local114 | local162) >>> 8;
								local347 = local3[local60];
								local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						local230 = this.aByteArray47[local57];
						local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
						local106 = anInt2582;
						local114 = local98 + local106;
						local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
						local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
						local347 = local114 - local347 | local347 - (local347 >>> 8);
						if (local98 == 0 && anInt2578 != 255) {
							local98 = local347;
							local347 = local3[local60];
							local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
						}
						local3[local60] = local347;
					} else if (arg0 == 2) {
						local230 = this.aByteArray47[local57];
						if (local230 != 0) {
							local98 = this.anIntArray213[local230 & 0xFF];
							local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
							local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
							local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
						}
					} else {
						throw new IllegalArgumentException();
					}
					local18 += anInt2568;
					local20 += anInt2576;
					local22++;
				}
				anInt2574 += anInt2570;
				anInt2575 += anInt2560;
				anInt2567 += anInt2566;
			}
		}
	}

	@OriginalMember(owner = "client!apf", name = "ce", descriptor = "(ZZZIIFIIIIIIZ)V")
	@Override
	void method18300(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		if (arg6 <= 0 || arg7 <= 0 || !arg0 && !arg1) {
			return;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(22) int local22 = this.anInt2555 + this.anInt2554 + this.anInt2557;
		@Pc(31) int local31 = this.anInt2556 + this.anInt2559 + this.anInt2571;
		@Pc(37) int local37 = (local22 << 16) / arg6;
		@Pc(43) int local43 = (local31 << 16) / arg7;
		@Pc(57) int local57;
		if (this.anInt2555 > 0) {
			local57 = ((this.anInt2555 << 16) + local37 - 1) / local37;
			arg3 += local57;
			local11 += local57 * local37 - (this.anInt2555 << 16);
		}
		if (this.anInt2556 > 0) {
			local57 = ((this.anInt2556 << 16) + local43 - 1) / local43;
			arg4 += local57;
			local13 += local57 * local43 - (this.anInt2556 << 16);
		}
		if (this.anInt2554 < local22) {
			arg6 = ((this.anInt2554 << 16) - local11 + local37 - 1) / local37;
		}
		if (this.anInt2559 < local31) {
			arg7 = ((this.anInt2559 << 16) - local13 + local43 - 1) / local43;
		}
		local57 = arg3 + arg4 * this.aClass102_Sub2_10.anInt638 * 513500097;
		@Pc(153) int local153 = this.aClass102_Sub2_10.anInt638 * 513500097 - arg6;
		if (arg4 + arg7 > this.aClass102_Sub2_10.anInt639 * 725126603) {
			arg7 -= arg4 + arg7 - this.aClass102_Sub2_10.anInt639 * 725126603;
		}
		@Pc(189) int local189;
		if (arg4 < this.aClass102_Sub2_10.anInt645 * -1878420243) {
			local189 = this.aClass102_Sub2_10.anInt645 * -1878420243 - arg4;
			arg7 -= local189;
			local57 += local189 * this.aClass102_Sub2_10.anInt638 * 513500097;
			local13 += local43 * local189;
		}
		if (arg3 + arg6 > this.aClass102_Sub2_10.anInt634 * 469139509) {
			local189 = arg3 + arg6 - this.aClass102_Sub2_10.anInt634 * 469139509;
			arg6 -= local189;
			local153 += local189;
		}
		if (arg3 < this.aClass102_Sub2_10.anInt637 * 531468375) {
			local189 = this.aClass102_Sub2_10.anInt637 * 531468375 - arg3;
			arg6 -= local189;
			local57 += local189;
			local11 += local37 * local189;
			local153 += local189;
		}
		@Pc(273) float[] local273 = this.aClass102_Sub2_10.aFloatArray12;
		@Pc(277) int[] local277 = this.aClass102_Sub2_10.anIntArray50;
		@Pc(284) int local284;
		@Pc(287) int local287;
		@Pc(296) int local296;
		@Pc(299) int local299;
		@Pc(378) int local378;
		@Pc(387) int local387;
		@Pc(390) int local390;
		@Pc(416) int local416;
		@Pc(424) int local424;
		@Pc(432) int local432;
		@Pc(440) int local440;
		@Pc(623) int local623;
		@Pc(519) byte local519;
		if (arg10 != 0) {
			@Pc(1013) int local1013;
			@Pc(1021) int local1021;
			@Pc(1029) int local1029;
			@Pc(1041) int local1041;
			@Pc(1378) byte local1378;
			if (arg10 != 1) {
				if (arg10 != 2) {
					throw new IllegalArgumentException();
				}
				if (arg8 == 1) {
					local284 = local11;
					for (local287 = -arg7; local287 < 0; local287++) {
						local296 = (local13 >> 16) * this.anInt2554;
						for (local299 = -arg6; local299 < 0; local299++) {
							if (!arg1 || arg5 < local273[local57]) {
								local519 = this.aByteArray47[(local11 >> 16) + local296];
								if (local519 != 0) {
									if (arg0) {
										local387 = this.anIntArray213[local519 & 0xFF];
										local390 = local277[local57];
										local416 = local387 + local390;
										local424 = (local387 & 0xFF00FF) + (local390 & 0xFF00FF);
										local390 = (local424 & 0x1000100) + (local416 - local424 & 0x10000);
										local277[local57] = local416 - local390 | local390 - (local390 >>> 8);
									}
									if (arg1 && arg12) {
										local273[local57] = arg5;
									}
								}
							}
							local11 += local37;
							local57++;
						}
						local13 += local43;
						local11 = local284;
						local57 += local153;
					}
				} else if (arg8 == 0) {
					local284 = local11;
					local287 = arg9 >> 16 & 0xFF;
					local296 = arg9 >> 8 & 0xFF;
					local299 = arg9 & 0xFF;
					for (local378 = -arg7; local378 < 0; local378++) {
						local387 = (local13 >> 16) * this.anInt2554;
						for (local390 = -arg6; local390 < 0; local390++) {
							if (!arg1 || arg5 < local273[local57]) {
								@Pc(1620) byte local1620 = this.aByteArray47[(local11 >> 16) + local387];
								if (local1620 != 0) {
									if (arg0) {
										local424 = this.anIntArray213[local1620 & 0xFF];
										local432 = (local424 & 0xFF0000) * local287 & 0xFF000000;
										local440 = (local424 & 0xFF00) * local296 & 0xFF0000;
										local1013 = (local424 & 0xFF) * local299 & 0xFF00;
										local424 = (local432 | local440 | local1013) >>> 8;
										local1021 = local277[local57];
										local1029 = local424 + local1021;
										local1041 = (local424 & 0xFF00FF) + (local1021 & 0xFF00FF);
										local1021 = (local1041 & 0x1000100) + (local1029 - local1041 & 0x10000);
										local277[local57] = local1029 - local1021 | local1021 - (local1021 >>> 8);
									}
									if (arg1 && arg12) {
										local273[local57] = arg5;
									}
								}
							}
							local11 += local37;
							local57++;
						}
						local13 += local43;
						local11 = local284;
						local57 += local153;
					}
				} else if (arg8 == 3) {
					local284 = local11;
					for (local287 = -arg7; local287 < 0; local287++) {
						local296 = (local13 >> 16) * this.anInt2554;
						for (local299 = -arg6; local299 < 0; local299++) {
							if (!arg1 || arg5 < local273[local57]) {
								if (arg0) {
									local519 = this.aByteArray47[(local11 >> 16) + local296];
									local387 = local519 > 0 ? this.anIntArray213[local519] : 0;
									local390 = local387 + arg9;
									local416 = (local387 & 0xFF00FF) + (arg9 & 0xFF00FF);
									local424 = (local416 & 0x1000100) + (local390 - local416 & 0x10000);
									local387 = local390 - local424 | local424 - (local424 >>> 8);
									local424 = local277[local57];
									local390 = local387 + local424;
									local416 = (local387 & 0xFF00FF) + (local424 & 0xFF00FF);
									local424 = (local416 & 0x1000100) + (local390 - local416 & 0x10000);
									local277[local57] = local390 - local424 | local424 - (local424 >>> 8);
								}
								if (arg1 && arg12) {
									local273[local57] = arg5;
								}
							}
							local11 += local37;
							local57++;
						}
						local13 += local43;
						local11 = local284;
						local57 += local153;
					}
				} else if (arg8 == 2) {
					local284 = arg9 >>> 24;
					local287 = 256 - local284;
					local296 = (arg9 & 0xFF00FF) * local287 & 0xFF00FF00;
					local299 = (arg9 & 0xFF00) * local287 & 0xFF0000;
					local623 = (local296 | local299) >>> 8;
					local378 = local11;
					for (local387 = -arg7; local387 < 0; local387++) {
						local390 = (local13 >> 16) * this.anInt2554;
						for (local416 = -arg6; local416 < 0; local416++) {
							if (!arg1 || arg5 < local273[local57]) {
								local1378 = this.aByteArray47[(local11 >> 16) + local390];
								if (local1378 != 0) {
									if (arg0) {
										local432 = this.anIntArray213[local1378 & 0xFF];
										local296 = (local432 & 0xFF00FF) * local284 & 0xFF00FF00;
										local299 = (local432 & 0xFF00) * local284 & 0xFF0000;
										local432 = ((local296 | local299) >>> 8) + local623;
										local440 = local277[local57];
										local1013 = local432 + local440;
										local1021 = (local432 & 0xFF00FF) + (local440 & 0xFF00FF);
										local440 = (local1021 & 0x1000100) + (local1013 - local1021 & 0x10000);
										local277[local57] = local1013 - local440 | local440 - (local440 >>> 8);
									}
									if (arg1 && arg12) {
										local273[local57] = arg5;
									}
								}
							}
							local11 += local37;
							local57++;
						}
						local13 += local43;
						local11 = local378;
						local57 += local153;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg8 == 1) {
				local284 = local11;
				for (local287 = -arg7; local287 < 0; local287++) {
					local296 = (local13 >> 16) * this.anInt2554;
					for (local299 = -arg6; local299 < 0; local299++) {
						if (!arg1 || arg5 < local273[local57]) {
							local519 = this.aByteArray47[(local11 >> 16) + local296];
							if (local519 != 0) {
								if (arg0) {
									local277[local57] = this.anIntArray213[local519 & 0xFF];
								}
								if (arg1 && arg12) {
									local273[local57] = arg5;
								}
							}
						}
						local11 += local37;
						local57++;
					}
					local13 += local43;
					local11 = local284;
					local57 += local153;
				}
			} else {
				@Pc(858) byte local858;
				if (arg8 == 0) {
					local284 = local11;
					if ((arg9 & 0xFFFFFF) == 16777215) {
						local287 = arg9 >>> 24;
						local296 = 256 - local287;
						for (local299 = -arg7; local299 < 0; local299++) {
							local378 = (local13 >> 16) * this.anInt2554;
							for (local387 = -arg6; local387 < 0; local387++) {
								if (!arg1 || arg5 < local273[local57]) {
									local858 = this.aByteArray47[(local11 >> 16) + local378];
									if (local858 != 0) {
										if (arg0) {
											local416 = this.anIntArray213[local858 & 0xFF];
											local424 = local277[local57];
											local277[local57] = ((local416 & 0xFF00FF) * local287 + (local424 & 0xFF00FF) * local296 & 0xFF00FF00) + ((local416 & 0xFF00) * local287 + (local424 & 0xFF00) * local296 & 0xFF0000) >> 8;
										}
										if (arg1 && arg12) {
											local273[local57] = arg5;
										}
									}
								}
								local11 += local37;
								local57++;
							}
							local13 += local43;
							local11 = local284;
							local57 += local153;
						}
					} else {
						local287 = arg9 >> 16 & 0xFF;
						local296 = arg9 >> 8 & 0xFF;
						local299 = arg9 & 0xFF;
						local378 = arg9 >>> 24;
						local387 = 256 - local378;
						for (local390 = -arg7; local390 < 0; local390++) {
							local416 = (local13 >> 16) * this.anInt2554;
							for (local424 = -arg6; local424 < 0; local424++) {
								if (!arg1 || arg5 < local273[local57]) {
									@Pc(991) byte local991 = this.aByteArray47[(local11 >> 16) + local416];
									if (local991 != 0) {
										local440 = this.anIntArray213[local991 & 0xFF];
										if (local378 == 255) {
											if (arg0) {
												local1013 = (local440 & 0xFF0000) * local287 & 0xFF000000;
												local1021 = (local440 & 0xFF00) * local296 & 0xFF0000;
												local1029 = (local440 & 0xFF) * local299 & 0xFF00;
												local277[local57] = (local1013 | local1021 | local1029) >>> 8;
											}
											if (arg1 && arg12) {
												local273[local57] = arg5;
											}
										} else {
											if (arg0) {
												local1013 = (local440 & 0xFF0000) * local287 & 0xFF000000;
												local1021 = (local440 & 0xFF00) * local296 & 0xFF0000;
												local1029 = (local440 & 0xFF) * local299 & 0xFF00;
												local440 = (local1013 | local1021 | local1029) >>> 8;
												local1041 = local277[local57];
												local277[local57] = ((local440 & 0xFF00FF) * local378 + (local1041 & 0xFF00FF) * local387 & 0xFF00FF00) + ((local440 & 0xFF00) * local378 + (local1041 & 0xFF00) * local387 & 0xFF0000) >> 8;
											}
											if (arg1 && arg12) {
												local273[local57] = arg5;
											}
										}
									}
								}
								local11 += local37;
								local57++;
							}
							local13 += local43;
							local11 = local284;
							local57 += local153;
						}
					}
				} else if (arg8 == 3) {
					local284 = local11;
					local287 = arg9 >>> 24;
					local296 = 256 - local287;
					for (local299 = -arg7; local299 < 0; local299++) {
						local378 = (local13 >> 16) * this.anInt2554;
						for (local387 = -arg6; local387 < 0; local387++) {
							if (!arg1 || arg5 < local273[local57]) {
								if (arg0) {
									local858 = this.aByteArray47[(local11 >> 16) + local378];
									local416 = local858 > 0 ? this.anIntArray213[local858] : 0;
									local424 = local416 + arg9;
									local432 = (local416 & 0xFF00FF) + (arg9 & 0xFF00FF);
									local440 = (local432 & 0x1000100) + (local424 - local432 & 0x10000);
									local440 = local424 - local440 | local440 - (local440 >>> 8);
									if (local416 == 0 && local287 != 255) {
										local416 = local440;
										local440 = local277[local57];
										local440 = ((local416 & 0xFF00FF) * local287 + (local440 & 0xFF00FF) * local296 & 0xFF00FF00) + ((local416 & 0xFF00) * local287 + (local440 & 0xFF00) * local296 & 0xFF0000) >> 8;
									}
									local277[local57] = local440;
								}
								if (arg1 && arg12) {
									local273[local57] = arg5;
								}
							}
							local11 += local37;
							local57++;
						}
						local13 += local43;
						local11 = local284;
						local57 += local153;
					}
				} else if (arg8 == 2) {
					local284 = arg9 >>> 24;
					local287 = 256 - local284;
					local296 = (arg9 & 0xFF00FF) * local287 & 0xFF00FF00;
					local299 = (arg9 & 0xFF00) * local287 & 0xFF0000;
					local623 = (local296 | local299) >>> 8;
					local378 = local11;
					for (local387 = -arg7; local387 < 0; local387++) {
						local390 = (local13 >> 16) * this.anInt2554;
						for (local416 = -arg6; local416 < 0; local416++) {
							if (!arg1 || arg5 < local273[local57]) {
								local1378 = this.aByteArray47[(local11 >> 16) + local390];
								if (local1378 != 0) {
									if (arg0) {
										local432 = this.anIntArray213[local1378 & 0xFF];
										local296 = (local432 & 0xFF00FF) * local284 & 0xFF00FF00;
										local299 = (local432 & 0xFF00) * local284 & 0xFF0000;
										local277[local57] = ((local296 | local299) >>> 8) + local623;
									}
									if (arg1 && arg12) {
										local273[local57] = arg5;
									}
								}
							}
							local11 += local37;
							local57++;
						}
						local13 += local43;
						local11 = local378;
						local57 += local153;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg8 == 1) {
			local284 = local11;
			for (local287 = -arg7; local287 < 0; local287++) {
				local296 = (local13 >> 16) * this.anInt2554;
				for (local299 = -arg6; local299 < 0; local299++) {
					if (!arg1 || arg5 < local273[local57]) {
						if (arg0) {
							local277[local57] = this.anIntArray213[this.aByteArray47[(local11 >> 16) + local296] & 0xFF];
						}
						if (arg1 && arg12) {
							local273[local57] = arg5;
						}
					}
					local11 += local37;
					local57++;
				}
				local13 += local43;
				local11 = local284;
				local57 += local153;
			}
		} else if (arg8 == 0) {
			local284 = arg9 >> 16 & 0xFF;
			local287 = arg9 >> 8 & 0xFF;
			local296 = arg9 & 0xFF;
			local299 = local11;
			for (local378 = -arg7; local378 < 0; local378++) {
				local387 = (local13 >> 16) * this.anInt2554;
				for (local390 = -arg6; local390 < 0; local390++) {
					if (!arg1 || arg5 < local273[local57]) {
						if (arg0) {
							local416 = this.anIntArray213[this.aByteArray47[(local11 >> 16) + local387] & 0xFF];
							local424 = (local416 & 0xFF0000) * local284 & 0xFF000000;
							local432 = (local416 & 0xFF00) * local287 & 0xFF0000;
							local440 = (local416 & 0xFF) * local296 & 0xFF00;
							local277[local57] = (local424 | local432 | local440) >>> 8;
						}
						if (arg1 && arg12) {
							local273[local57] = arg5;
						}
					}
					local11 += local37;
					local57++;
				}
				local13 += local43;
				local11 = local299;
				local57 += local153;
			}
		} else if (arg8 == 3) {
			local284 = local11;
			for (local287 = -arg7; local287 < 0; local287++) {
				local296 = (local13 >> 16) * this.anInt2554;
				for (local299 = -arg6; local299 < 0; local299++) {
					if (!arg1 || arg5 < local273[local57]) {
						if (arg0) {
							local519 = this.aByteArray47[(local11 >> 16) + local296];
							local387 = local519 > 0 ? this.anIntArray213[local519] : 0;
							local390 = local387 + arg9;
							local416 = (local387 & 0xFF00FF) + (arg9 & 0xFF00FF);
							local424 = (local416 & 0x1000100) + (local390 - local416 & 0x10000);
							local277[local57] = local390 - local424 | local424 - (local424 >>> 8);
						}
						if (arg1 && arg12) {
							local273[local57] = arg5;
						}
					}
					local11 += local37;
					local57++;
				}
				local13 += local43;
				local11 = local284;
				local57 += local153;
			}
		} else if (arg8 == 2) {
			local284 = arg9 >>> 24;
			local287 = 256 - local284;
			local296 = (arg9 & 0xFF00FF) * local287 & 0xFF00FF00;
			local299 = (arg9 & 0xFF00) * local287 & 0xFF0000;
			local623 = (local296 | local299) >>> 8;
			local378 = local11;
			for (local387 = -arg7; local387 < 0; local387++) {
				local390 = (local13 >> 16) * this.anInt2554;
				for (local416 = -arg6; local416 < 0; local416++) {
					if (!arg1 || arg5 < local273[local57]) {
						if (arg0) {
							local424 = this.anIntArray213[this.aByteArray47[(local11 >> 16) + local390] & 0xFF];
							local296 = (local424 & 0xFF00FF) * local284 & 0xFF00FF00;
							local299 = (local424 & 0xFF00) * local284 & 0xFF0000;
							local277[local57] = ((local296 | local299) >>> 8) + local623;
						}
						if (arg1 && arg12) {
							local273[local57] = arg5;
						}
					}
					local11 += local37;
					local57++;
				}
				local13 += local43;
				local11 = local378;
				local57 += local153;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!apf", name = "cc", descriptor = "(II)V")
	@Override
	void method18301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int[] local3 = this.aClass102_Sub2_10.anIntArray50;
		if (local3 == null) {
			return;
		}
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(18) int local18;
		@Pc(20) int local20;
		@Pc(22) int local22;
		@Pc(57) int local57;
		@Pc(60) int local60;
		@Pc(90) int local90;
		@Pc(98) int local98;
		@Pc(106) int local106;
		@Pc(114) int local114;
		@Pc(162) int local162;
		@Pc(347) int local347;
		@Pc(676) int local676;
		@Pc(684) int local684;
		@Pc(939) int local939;
		@Pc(230) byte local230;
		if (anInt2568 == 0) {
			if (anInt2576 == 0) {
				local12 = anInt2565;
				while (local12 < 0) {
					local16 = anInt2567;
					local18 = anInt2574;
					local20 = anInt2575;
					local22 = anInt2563;
					if (local18 >= 0 && local20 >= 0 && local18 - (this.anInt2554 << 12) < 0 && local20 - (this.anInt2559 << 12) < 0) {
						while (local22 < 0) {
							local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
							local60 = local16++;
							if (arg1 == 0) {
								if (arg0 == 1) {
									local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								} else if (arg0 == 0) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
									local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
									local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
									local3[local60] = (local98 | local106 | local114) >>> 8;
								} else if (arg0 == 3) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = anInt2582;
									local106 = local90 + local98;
									local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
									local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
									local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
								} else if (arg0 == 2) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
									local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg1 != 1) {
								if (arg1 != 2) {
									throw new IllegalArgumentException();
								}
								if (arg0 == 1) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = local3[local60];
										local114 = local98 + local106;
										local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
										local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
										local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
									}
								} else if (arg0 == 0) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local98 = (local106 | local114 | local162) >>> 8;
										local347 = local3[local60];
										local676 = local98 + local347;
										local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
										local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
										local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
									}
								} else if (arg0 == 3) {
									local230 = this.aByteArray47[local57];
									local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
									local106 = anInt2582;
									local114 = local98 + local106;
									local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
									local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
									local347 = local114 - local347 | local347 - (local347 >>> 8);
									if (local98 == 0 && anInt2578 != 255) {
										local98 = local347;
										local347 = local3[local60];
										local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
									}
									local3[local60] = local347;
								} else if (arg0 == 2) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
										local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
										local98 = ((local106 | local114) >>> 8) + anInt2586;
										local162 = local3[local60];
										local347 = local98 + local162;
										local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
										local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
										local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
									}
								}
							} else if (arg0 == 1) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local3[local60] = this.anIntArray213[local230 & 0xFF];
								}
							} else if (arg0 == 0) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									if ((anInt2582 & 0xFFFFFF) == 16777215) {
										local106 = anInt2582 >>> 24;
										local114 = 256 - local106;
										local162 = local3[local60];
										local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
									} else if (anInt2578 == 255) {
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local3[local60] = (local106 | local114 | local162) >>> 8;
									} else {
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local98 = (local106 | local114 | local162) >>> 8;
										local347 = local3[local60];
										local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local230 = this.aByteArray47[local57];
								local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
								local106 = anInt2582;
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local347 = local114 - local347 | local347 - (local347 >>> 8);
								if (local98 == 0 && anInt2578 != 255) {
									local98 = local347;
									local347 = local3[local60];
									local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
								local3[local60] = local347;
							} else if (arg0 == 2) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
									local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local22++;
						}
					}
					local12++;
					anInt2567 += anInt2566;
				}
			} else if (anInt2576 < 0) {
				local12 = anInt2565;
				while (local12 < 0) {
					local16 = anInt2567;
					local18 = anInt2574;
					local20 = anInt2575 + anInt2577;
					local22 = anInt2563;
					if (local18 >= 0 && local18 - (this.anInt2554 << 12) < 0) {
						@Pc(932) int local932;
						if ((local932 = local20 - (this.anInt2559 << 12)) >= 0) {
							local939 = (anInt2576 - local932) / anInt2576;
							local22 += local939;
							local20 += anInt2576 * local939;
							local16 += local939;
						}
						@Pc(960) int local960;
						if ((local960 = (local20 - anInt2576) / anInt2576) > local22) {
							local22 = local960;
						}
						while (local22 < 0) {
							local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
							local60 = local16++;
							if (arg1 == 0) {
								if (arg0 == 1) {
									local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								} else if (arg0 == 0) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
									local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
									local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
									local3[local60] = (local98 | local106 | local114) >>> 8;
								} else if (arg0 == 3) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = anInt2582;
									local106 = local90 + local98;
									local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
									local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
									local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
								} else if (arg0 == 2) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
									local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg1 != 1) {
								if (arg1 != 2) {
									throw new IllegalArgumentException();
								}
								if (arg0 == 1) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = local3[local60];
										local114 = local98 + local106;
										local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
										local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
										local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
									}
								} else if (arg0 == 0) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local98 = (local106 | local114 | local162) >>> 8;
										local347 = local3[local60];
										local676 = local98 + local347;
										local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
										local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
										local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
									}
								} else if (arg0 == 3) {
									local230 = this.aByteArray47[local57];
									local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
									local106 = anInt2582;
									local114 = local98 + local106;
									local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
									local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
									local347 = local114 - local347 | local347 - (local347 >>> 8);
									if (local98 == 0 && anInt2578 != 255) {
										local98 = local347;
										local347 = local3[local60];
										local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
									}
									local3[local60] = local347;
								} else if (arg0 == 2) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
										local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
										local98 = ((local106 | local114) >>> 8) + anInt2586;
										local162 = local3[local60];
										local347 = local98 + local162;
										local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
										local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
										local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
									}
								}
							} else if (arg0 == 1) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local3[local60] = this.anIntArray213[local230 & 0xFF];
								}
							} else if (arg0 == 0) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									if ((anInt2582 & 0xFFFFFF) == 16777215) {
										local106 = anInt2582 >>> 24;
										local114 = 256 - local106;
										local162 = local3[local60];
										local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
									} else if (anInt2578 == 255) {
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local3[local60] = (local106 | local114 | local162) >>> 8;
									} else {
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local98 = (local106 | local114 | local162) >>> 8;
										local347 = local3[local60];
										local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local230 = this.aByteArray47[local57];
								local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
								local106 = anInt2582;
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local347 = local114 - local347 | local347 - (local347 >>> 8);
								if (local98 == 0 && anInt2578 != 255) {
									local98 = local347;
									local347 = local3[local60];
									local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
								local3[local60] = local347;
							} else if (arg0 == 2) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
									local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local20 += anInt2576;
							local22++;
						}
					}
					local12++;
					anInt2574 += anInt2570;
					anInt2567 += anInt2566;
				}
			} else {
				local12 = anInt2565;
				while (local12 < 0) {
					local16 = anInt2567;
					local18 = anInt2574;
					local20 = anInt2575 + anInt2577;
					local22 = anInt2563;
					if (local18 >= 0 && local18 - (this.anInt2554 << 12) < 0) {
						if (local20 < 0) {
							local939 = (anInt2576 - 1 - local20) / anInt2576;
							local22 += local939;
							local20 += anInt2576 * local939;
							local16 += local939;
						}
						@Pc(1888) int local1888;
						if ((local1888 = (local20 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local22) {
							local22 = local1888;
						}
						while (local22 < 0) {
							local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
							local60 = local16++;
							if (arg1 == 0) {
								if (arg0 == 1) {
									local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								} else if (arg0 == 0) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
									local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
									local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
									local3[local60] = (local98 | local106 | local114) >>> 8;
								} else if (arg0 == 3) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = anInt2582;
									local106 = local90 + local98;
									local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
									local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
									local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
								} else if (arg0 == 2) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
									local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg1 != 1) {
								if (arg1 != 2) {
									throw new IllegalArgumentException();
								}
								if (arg0 == 1) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = local3[local60];
										local114 = local98 + local106;
										local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
										local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
										local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
									}
								} else if (arg0 == 0) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local98 = (local106 | local114 | local162) >>> 8;
										local347 = local3[local60];
										local676 = local98 + local347;
										local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
										local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
										local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
									}
								} else if (arg0 == 3) {
									local230 = this.aByteArray47[local57];
									local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
									local106 = anInt2582;
									local114 = local98 + local106;
									local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
									local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
									local347 = local114 - local347 | local347 - (local347 >>> 8);
									if (local98 == 0 && anInt2578 != 255) {
										local98 = local347;
										local347 = local3[local60];
										local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
									}
									local3[local60] = local347;
								} else if (arg0 == 2) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
										local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
										local98 = ((local106 | local114) >>> 8) + anInt2586;
										local162 = local3[local60];
										local347 = local98 + local162;
										local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
										local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
										local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
									}
								}
							} else if (arg0 == 1) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local3[local60] = this.anIntArray213[local230 & 0xFF];
								}
							} else if (arg0 == 0) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									if ((anInt2582 & 0xFFFFFF) == 16777215) {
										local106 = anInt2582 >>> 24;
										local114 = 256 - local106;
										local162 = local3[local60];
										local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
									} else if (anInt2578 == 255) {
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local3[local60] = (local106 | local114 | local162) >>> 8;
									} else {
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local98 = (local106 | local114 | local162) >>> 8;
										local347 = local3[local60];
										local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local230 = this.aByteArray47[local57];
								local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
								local106 = anInt2582;
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local347 = local114 - local347 | local347 - (local347 >>> 8);
								if (local98 == 0 && anInt2578 != 255) {
									local98 = local347;
									local347 = local3[local60];
									local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
								local3[local60] = local347;
							} else if (arg0 == 2) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
									local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local20 += anInt2576;
							local22++;
						}
					}
					local12++;
					anInt2574 += anInt2570;
					anInt2567 += anInt2566;
				}
			}
		} else if (anInt2568 < 0) {
			if (anInt2576 == 0) {
				local12 = anInt2565;
				while (local12 < 0) {
					local16 = anInt2567;
					local18 = anInt2574 + anInt2579;
					local20 = anInt2575;
					local22 = anInt2563;
					if (local20 >= 0 && local20 - (this.anInt2559 << 12) < 0) {
						@Pc(2790) int local2790;
						if ((local2790 = local18 - (this.anInt2554 << 12)) >= 0) {
							local939 = (anInt2568 - local2790) / anInt2568;
							local22 += local939;
							local18 += anInt2568 * local939;
							local16 += local939;
						}
						@Pc(2818) int local2818;
						if ((local2818 = (local18 - anInt2568) / anInt2568) > local22) {
							local22 = local2818;
						}
						while (local22 < 0) {
							local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
							local60 = local16++;
							if (arg1 == 0) {
								if (arg0 == 1) {
									local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								} else if (arg0 == 0) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
									local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
									local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
									local3[local60] = (local98 | local106 | local114) >>> 8;
								} else if (arg0 == 3) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = anInt2582;
									local106 = local90 + local98;
									local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
									local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
									local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
								} else if (arg0 == 2) {
									local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
									local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
									local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (arg1 != 1) {
								if (arg1 != 2) {
									throw new IllegalArgumentException();
								}
								if (arg0 == 1) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = local3[local60];
										local114 = local98 + local106;
										local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
										local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
										local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
									}
								} else if (arg0 == 0) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local98 = (local106 | local114 | local162) >>> 8;
										local347 = local3[local60];
										local676 = local98 + local347;
										local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
										local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
										local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
									}
								} else if (arg0 == 3) {
									local230 = this.aByteArray47[local57];
									local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
									local106 = anInt2582;
									local114 = local98 + local106;
									local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
									local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
									local347 = local114 - local347 | local347 - (local347 >>> 8);
									if (local98 == 0 && anInt2578 != 255) {
										local98 = local347;
										local347 = local3[local60];
										local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
									}
									local3[local60] = local347;
								} else if (arg0 == 2) {
									local230 = this.aByteArray47[local57];
									if (local230 != 0) {
										local98 = this.anIntArray213[local230 & 0xFF];
										local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
										local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
										local98 = ((local106 | local114) >>> 8) + anInt2586;
										local162 = local3[local60];
										local347 = local98 + local162;
										local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
										local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
										local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
									}
								}
							} else if (arg0 == 1) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local3[local60] = this.anIntArray213[local230 & 0xFF];
								}
							} else if (arg0 == 0) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									if ((anInt2582 & 0xFFFFFF) == 16777215) {
										local106 = anInt2582 >>> 24;
										local114 = 256 - local106;
										local162 = local3[local60];
										local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
									} else if (anInt2578 == 255) {
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local3[local60] = (local106 | local114 | local162) >>> 8;
									} else {
										local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
										local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
										local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
										local98 = (local106 | local114 | local162) >>> 8;
										local347 = local3[local60];
										local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local230 = this.aByteArray47[local57];
								local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
								local106 = anInt2582;
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local347 = local114 - local347 | local347 - (local347 >>> 8);
								if (local98 == 0 && anInt2578 != 255) {
									local98 = local347;
									local347 = local3[local60];
									local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
								local3[local60] = local347;
							} else if (arg0 == 2) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
									local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local18 += anInt2568;
							local22++;
						}
					}
					local12++;
					anInt2575 += anInt2560;
					anInt2567 += anInt2566;
				}
			} else if (anInt2576 < 0) {
				local12 = anInt2565;
				while (local12 < 0) {
					local16 = anInt2567;
					local18 = anInt2574 + anInt2579;
					local20 = anInt2575 + anInt2577;
					local22 = anInt2563;
					@Pc(3709) int local3709;
					if ((local3709 = local18 - (this.anInt2554 << 12)) >= 0) {
						local939 = (anInt2568 - local3709) / anInt2568;
						local22 += local939;
						local18 += anInt2568 * local939;
						local20 += anInt2576 * local939;
						local16 += local939;
					}
					@Pc(3743) int local3743;
					if ((local3743 = (local18 - anInt2568) / anInt2568) > local22) {
						local22 = local3743;
					}
					@Pc(3755) int local3755;
					if ((local3755 = local20 - (this.anInt2559 << 12)) >= 0) {
						local939 = (anInt2576 - local3755) / anInt2576;
						local22 += local939;
						local18 += anInt2568 * local939;
						local20 += anInt2576 * local939;
						local16 += local939;
					}
					@Pc(3789) int local3789;
					if ((local3789 = (local20 - anInt2576) / anInt2576) > local22) {
						local22 = local3789;
					}
					while (local22 < 0) {
						local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
						local60 = local16++;
						if (arg1 == 0) {
							if (arg0 == 1) {
								local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							} else if (arg0 == 0) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
								local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
								local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
								local3[local60] = (local98 | local106 | local114) >>> 8;
							} else if (arg0 == 3) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = anInt2582;
								local106 = local90 + local98;
								local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
								local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
								local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
							} else if (arg0 == 2) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
								local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
								local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (arg1 != 1) {
							if (arg1 != 2) {
								throw new IllegalArgumentException();
							}
							if (arg0 == 1) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = local3[local60];
									local114 = local98 + local106;
									local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
									local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
									local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
								}
							} else if (arg0 == 0) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local98 = (local106 | local114 | local162) >>> 8;
									local347 = local3[local60];
									local676 = local98 + local347;
									local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
									local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
									local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
								}
							} else if (arg0 == 3) {
								local230 = this.aByteArray47[local57];
								local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
								local106 = anInt2582;
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local347 = local114 - local347 | local347 - (local347 >>> 8);
								if (local98 == 0 && anInt2578 != 255) {
									local98 = local347;
									local347 = local3[local60];
									local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
								local3[local60] = local347;
							} else if (arg0 == 2) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
									local98 = ((local106 | local114) >>> 8) + anInt2586;
									local162 = local3[local60];
									local347 = local98 + local162;
									local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
									local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
									local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
								}
							}
						} else if (arg0 == 1) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local3[local60] = this.anIntArray213[local230 & 0xFF];
							}
						} else if (arg0 == 0) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								if ((anInt2582 & 0xFFFFFF) == 16777215) {
									local106 = anInt2582 >>> 24;
									local114 = 256 - local106;
									local162 = local3[local60];
									local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
								} else if (anInt2578 == 255) {
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local3[local60] = (local106 | local114 | local162) >>> 8;
								} else {
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local98 = (local106 | local114 | local162) >>> 8;
									local347 = local3[local60];
									local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local230 = this.aByteArray47[local57];
							local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
							local106 = anInt2582;
							local114 = local98 + local106;
							local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
							local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
							local347 = local114 - local347 | local347 - (local347 >>> 8);
							if (local98 == 0 && anInt2578 != 255) {
								local98 = local347;
								local347 = local3[local60];
								local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
							}
							local3[local60] = local347;
						} else if (arg0 == 2) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
								local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
								local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local18 += anInt2568;
						local20 += anInt2576;
						local22++;
					}
					local12++;
					anInt2574 += anInt2570;
					anInt2575 += anInt2560;
					anInt2567 += anInt2566;
				}
			} else {
				local12 = anInt2565;
				while (local12 < 0) {
					local16 = anInt2567;
					local18 = anInt2574 + anInt2579;
					local20 = anInt2575 + anInt2577;
					local22 = anInt2563;
					@Pc(4686) int local4686;
					if ((local4686 = local18 - (this.anInt2554 << 12)) >= 0) {
						local939 = (anInt2568 - local4686) / anInt2568;
						local22 += local939;
						local18 += anInt2568 * local939;
						local20 += anInt2576 * local939;
						local16 += local939;
					}
					@Pc(4720) int local4720;
					if ((local4720 = (local18 - anInt2568) / anInt2568) > local22) {
						local22 = local4720;
					}
					if (local20 < 0) {
						local939 = (anInt2576 - 1 - local20) / anInt2576;
						local22 += local939;
						local18 += anInt2568 * local939;
						local20 += anInt2576 * local939;
						local16 += local939;
					}
					@Pc(4768) int local4768;
					if ((local4768 = (local20 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local22) {
						local22 = local4768;
					}
					while (local22 < 0) {
						local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
						local60 = local16++;
						if (arg1 == 0) {
							if (arg0 == 1) {
								local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							} else if (arg0 == 0) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
								local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
								local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
								local3[local60] = (local98 | local106 | local114) >>> 8;
							} else if (arg0 == 3) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = anInt2582;
								local106 = local90 + local98;
								local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
								local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
								local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
							} else if (arg0 == 2) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
								local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
								local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (arg1 != 1) {
							if (arg1 != 2) {
								throw new IllegalArgumentException();
							}
							if (arg0 == 1) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = local3[local60];
									local114 = local98 + local106;
									local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
									local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
									local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
								}
							} else if (arg0 == 0) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local98 = (local106 | local114 | local162) >>> 8;
									local347 = local3[local60];
									local676 = local98 + local347;
									local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
									local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
									local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
								}
							} else if (arg0 == 3) {
								local230 = this.aByteArray47[local57];
								local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
								local106 = anInt2582;
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local347 = local114 - local347 | local347 - (local347 >>> 8);
								if (local98 == 0 && anInt2578 != 255) {
									local98 = local347;
									local347 = local3[local60];
									local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
								local3[local60] = local347;
							} else if (arg0 == 2) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
									local98 = ((local106 | local114) >>> 8) + anInt2586;
									local162 = local3[local60];
									local347 = local98 + local162;
									local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
									local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
									local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
								}
							}
						} else if (arg0 == 1) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local3[local60] = this.anIntArray213[local230 & 0xFF];
							}
						} else if (arg0 == 0) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								if ((anInt2582 & 0xFFFFFF) == 16777215) {
									local106 = anInt2582 >>> 24;
									local114 = 256 - local106;
									local162 = local3[local60];
									local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
								} else if (anInt2578 == 255) {
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local3[local60] = (local106 | local114 | local162) >>> 8;
								} else {
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local98 = (local106 | local114 | local162) >>> 8;
									local347 = local3[local60];
									local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local230 = this.aByteArray47[local57];
							local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
							local106 = anInt2582;
							local114 = local98 + local106;
							local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
							local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
							local347 = local114 - local347 | local347 - (local347 >>> 8);
							if (local98 == 0 && anInt2578 != 255) {
								local98 = local347;
								local347 = local3[local60];
								local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
							}
							local3[local60] = local347;
						} else if (arg0 == 2) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
								local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
								local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local18 += anInt2568;
						local20 += anInt2576;
						local22++;
					}
					local12++;
					anInt2574 += anInt2570;
					anInt2575 += anInt2560;
					anInt2567 += anInt2566;
				}
			}
		} else if (anInt2576 == 0) {
			local12 = anInt2565;
			while (local12 < 0) {
				local16 = anInt2567;
				local18 = anInt2574 + anInt2579;
				local20 = anInt2575;
				local22 = anInt2563;
				if (local20 >= 0 && local20 - (this.anInt2559 << 12) < 0) {
					if (local18 < 0) {
						local939 = (anInt2568 - 1 - local18) / anInt2568;
						local22 += local939;
						local18 += anInt2568 * local939;
						local16 += local939;
					}
					@Pc(5706) int local5706;
					if ((local5706 = (local18 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local22) {
						local22 = local5706;
					}
					while (local22 < 0) {
						local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
						local60 = local16++;
						if (arg1 == 0) {
							if (arg0 == 1) {
								local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							} else if (arg0 == 0) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
								local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
								local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
								local3[local60] = (local98 | local106 | local114) >>> 8;
							} else if (arg0 == 3) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = anInt2582;
								local106 = local90 + local98;
								local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
								local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
								local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
							} else if (arg0 == 2) {
								local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
								local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
								local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
								local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (arg1 != 1) {
							if (arg1 != 2) {
								throw new IllegalArgumentException();
							}
							if (arg0 == 1) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = local3[local60];
									local114 = local98 + local106;
									local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
									local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
									local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
								}
							} else if (arg0 == 0) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local98 = (local106 | local114 | local162) >>> 8;
									local347 = local3[local60];
									local676 = local98 + local347;
									local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
									local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
									local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
								}
							} else if (arg0 == 3) {
								local230 = this.aByteArray47[local57];
								local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
								local106 = anInt2582;
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local347 = local114 - local347 | local347 - (local347 >>> 8);
								if (local98 == 0 && anInt2578 != 255) {
									local98 = local347;
									local347 = local3[local60];
									local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
								local3[local60] = local347;
							} else if (arg0 == 2) {
								local230 = this.aByteArray47[local57];
								if (local230 != 0) {
									local98 = this.anIntArray213[local230 & 0xFF];
									local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
									local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
									local98 = ((local106 | local114) >>> 8) + anInt2586;
									local162 = local3[local60];
									local347 = local98 + local162;
									local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
									local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
									local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
								}
							}
						} else if (arg0 == 1) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local3[local60] = this.anIntArray213[local230 & 0xFF];
							}
						} else if (arg0 == 0) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								if ((anInt2582 & 0xFFFFFF) == 16777215) {
									local106 = anInt2582 >>> 24;
									local114 = 256 - local106;
									local162 = local3[local60];
									local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
								} else if (anInt2578 == 255) {
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local3[local60] = (local106 | local114 | local162) >>> 8;
								} else {
									local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
									local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
									local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
									local98 = (local106 | local114 | local162) >>> 8;
									local347 = local3[local60];
									local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local230 = this.aByteArray47[local57];
							local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
							local106 = anInt2582;
							local114 = local98 + local106;
							local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
							local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
							local347 = local114 - local347 | local347 - (local347 >>> 8);
							if (local98 == 0 && anInt2578 != 255) {
								local98 = local347;
								local347 = local3[local60];
								local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
							}
							local3[local60] = local347;
						} else if (arg0 == 2) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
								local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
								local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local18 += anInt2568;
						local22++;
					}
				}
				local12++;
				anInt2574 += anInt2570;
				anInt2575 += anInt2560;
				anInt2567 += anInt2566;
			}
		} else if (anInt2576 < 0) {
			for (local12 = anInt2565; local12 < 0; local12++) {
				local16 = anInt2567;
				local18 = anInt2574 + anInt2579;
				local20 = anInt2575 + anInt2577;
				local22 = anInt2563;
				if (local18 < 0) {
					local939 = (anInt2568 - 1 - local18) / anInt2568;
					local22 += local939;
					local18 += anInt2568 * local939;
					local20 += anInt2576 * local939;
					local16 += local939;
				}
				@Pc(6637) int local6637;
				if ((local6637 = (local18 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local22) {
					local22 = local6637;
				}
				@Pc(6649) int local6649;
				if ((local6649 = local20 - (this.anInt2559 << 12)) >= 0) {
					local939 = (anInt2576 - local6649) / anInt2576;
					local22 += local939;
					local18 += anInt2568 * local939;
					local20 += anInt2576 * local939;
					local16 += local939;
				}
				@Pc(6683) int local6683;
				if ((local6683 = (local20 - anInt2576) / anInt2576) > local22) {
					local22 = local6683;
				}
				while (local22 < 0) {
					local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
					local60 = local16++;
					if (arg1 == 0) {
						if (arg0 == 1) {
							local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
						} else if (arg0 == 0) {
							local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
							local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
							local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
							local3[local60] = (local98 | local106 | local114) >>> 8;
						} else if (arg0 == 3) {
							local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							local98 = anInt2582;
							local106 = local90 + local98;
							local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
							local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
							local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
						} else if (arg0 == 2) {
							local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
							local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
							local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
						} else {
							throw new IllegalArgumentException();
						}
					} else if (arg1 != 1) {
						if (arg1 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg0 == 1) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = local3[local60];
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
							}
						} else if (arg0 == 0) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
								local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
								local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
								local98 = (local106 | local114 | local162) >>> 8;
								local347 = local3[local60];
								local676 = local98 + local347;
								local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
								local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
								local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
							}
						} else if (arg0 == 3) {
							local230 = this.aByteArray47[local57];
							local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
							local106 = anInt2582;
							local114 = local98 + local106;
							local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
							local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
							local347 = local114 - local347 | local347 - (local347 >>> 8);
							if (local98 == 0 && anInt2578 != 255) {
								local98 = local347;
								local347 = local3[local60];
								local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
							}
							local3[local60] = local347;
						} else if (arg0 == 2) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
								local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
								local98 = ((local106 | local114) >>> 8) + anInt2586;
								local162 = local3[local60];
								local347 = local98 + local162;
								local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
								local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
								local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
							}
						}
					} else if (arg0 == 1) {
						local230 = this.aByteArray47[local57];
						if (local230 != 0) {
							local3[local60] = this.anIntArray213[local230 & 0xFF];
						}
					} else if (arg0 == 0) {
						local230 = this.aByteArray47[local57];
						if (local230 != 0) {
							local98 = this.anIntArray213[local230 & 0xFF];
							if ((anInt2582 & 0xFFFFFF) == 16777215) {
								local106 = anInt2582 >>> 24;
								local114 = 256 - local106;
								local162 = local3[local60];
								local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
							} else if (anInt2578 == 255) {
								local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
								local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
								local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
								local3[local60] = (local106 | local114 | local162) >>> 8;
							} else {
								local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
								local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
								local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
								local98 = (local106 | local114 | local162) >>> 8;
								local347 = local3[local60];
								local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						local230 = this.aByteArray47[local57];
						local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
						local106 = anInt2582;
						local114 = local98 + local106;
						local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
						local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
						local347 = local114 - local347 | local347 - (local347 >>> 8);
						if (local98 == 0 && anInt2578 != 255) {
							local98 = local347;
							local347 = local3[local60];
							local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
						}
						local3[local60] = local347;
					} else if (arg0 == 2) {
						local230 = this.aByteArray47[local57];
						if (local230 != 0) {
							local98 = this.anIntArray213[local230 & 0xFF];
							local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
							local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
							local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
						}
					} else {
						throw new IllegalArgumentException();
					}
					local18 += anInt2568;
					local20 += anInt2576;
					local22++;
				}
				anInt2574 += anInt2570;
				anInt2575 += anInt2560;
				anInt2567 += anInt2566;
			}
		} else {
			for (local12 = anInt2565; local12 < 0; local12++) {
				local16 = anInt2567;
				local18 = anInt2574 + anInt2579;
				local20 = anInt2575 + anInt2577;
				local22 = anInt2563;
				if (local18 < 0) {
					local939 = (anInt2568 - 1 - local18) / anInt2568;
					local22 += local939;
					local18 += anInt2568 * local939;
					local20 += anInt2576 * local939;
					local16 += local939;
				}
				@Pc(7616) int local7616;
				if ((local7616 = (local18 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local22) {
					local22 = local7616;
				}
				if (local20 < 0) {
					local939 = (anInt2576 - 1 - local20) / anInt2576;
					local22 += local939;
					local18 += anInt2568 * local939;
					local20 += anInt2576 * local939;
					local16 += local939;
				}
				@Pc(7664) int local7664;
				if ((local7664 = (local20 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local22) {
					local22 = local7664;
				}
				while (local22 < 0) {
					local57 = (local20 >> 12) * this.anInt2554 + (local18 >> 12);
					local60 = local16++;
					if (arg1 == 0) {
						if (arg0 == 1) {
							local3[local60] = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
						} else if (arg0 == 0) {
							local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							local98 = (local90 & 0xFF0000) * anInt2558 & 0xFF000000;
							local106 = (local90 & 0xFF00) * anInt2569 & 0xFF0000;
							local114 = (local90 & 0xFF) * anInt2583 & 0xFF00;
							local3[local60] = (local98 | local106 | local114) >>> 8;
						} else if (arg0 == 3) {
							local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							local98 = anInt2582;
							local106 = local90 + local98;
							local114 = (local90 & 0xFF00FF) + (local98 & 0xFF00FF);
							local162 = (local114 & 0x1000100) + (local106 - local114 & 0x10000);
							local3[local60] = local106 - local162 | local162 - (local162 >>> 8);
						} else if (arg0 == 2) {
							local90 = this.anIntArray213[this.aByteArray47[local57] & 0xFF];
							local98 = (local90 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
							local106 = (local90 & 0xFF00) * anInt2578 & 0xFF0000;
							local3[local60] = ((local98 | local106) >>> 8) + anInt2586;
						} else {
							throw new IllegalArgumentException();
						}
					} else if (arg1 != 1) {
						if (arg1 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg0 == 1) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = local3[local60];
								local114 = local98 + local106;
								local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
								local106 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
								local3[local60] = local114 - local106 | local106 - (local106 >>> 8);
							}
						} else if (arg0 == 0) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
								local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
								local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
								local98 = (local106 | local114 | local162) >>> 8;
								local347 = local3[local60];
								local676 = local98 + local347;
								local684 = (local98 & 0xFF00FF) + (local347 & 0xFF00FF);
								local347 = (local684 & 0x1000100) + (local676 - local684 & 0x10000);
								local3[local60] = local676 - local347 | local347 - (local347 >>> 8);
							}
						} else if (arg0 == 3) {
							local230 = this.aByteArray47[local57];
							local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
							local106 = anInt2582;
							local114 = local98 + local106;
							local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
							local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
							local347 = local114 - local347 | local347 - (local347 >>> 8);
							if (local98 == 0 && anInt2578 != 255) {
								local98 = local347;
								local347 = local3[local60];
								local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
							}
							local3[local60] = local347;
						} else if (arg0 == 2) {
							local230 = this.aByteArray47[local57];
							if (local230 != 0) {
								local98 = this.anIntArray213[local230 & 0xFF];
								local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
								local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
								local98 = ((local106 | local114) >>> 8) + anInt2586;
								local162 = local3[local60];
								local347 = local98 + local162;
								local676 = (local98 & 0xFF00FF) + (local162 & 0xFF00FF);
								local162 = (local676 & 0x1000100) + (local347 - local676 & 0x10000);
								local3[local60] = local347 - local162 | local162 - (local162 >>> 8);
							}
						}
					} else if (arg0 == 1) {
						local230 = this.aByteArray47[local57];
						if (local230 != 0) {
							local3[local60] = this.anIntArray213[local230 & 0xFF];
						}
					} else if (arg0 == 0) {
						local230 = this.aByteArray47[local57];
						if (local230 != 0) {
							local98 = this.anIntArray213[local230 & 0xFF];
							if ((anInt2582 & 0xFFFFFF) == 16777215) {
								local106 = anInt2582 >>> 24;
								local114 = 256 - local106;
								local162 = local3[local60];
								local3[local60] = ((local98 & 0xFF00FF) * local106 + (local162 & 0xFF00FF) * local114 & 0xFF00FF00) + ((local98 & 0xFF00) * local106 + (local162 & 0xFF00) * local114 & 0xFF0000) >> 8;
							} else if (anInt2578 == 255) {
								local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
								local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
								local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
								local3[local60] = (local106 | local114 | local162) >>> 8;
							} else {
								local106 = (local98 & 0xFF0000) * anInt2558 & 0xFF000000;
								local114 = (local98 & 0xFF00) * anInt2569 & 0xFF0000;
								local162 = (local98 & 0xFF) * anInt2583 & 0xFF00;
								local98 = (local106 | local114 | local162) >>> 8;
								local347 = local3[local60];
								local3[local60] = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						local230 = this.aByteArray47[local57];
						local98 = local230 > 0 ? this.anIntArray213[local230] : 0;
						local106 = anInt2582;
						local114 = local98 + local106;
						local162 = (local98 & 0xFF00FF) + (local106 & 0xFF00FF);
						local347 = (local162 & 0x1000100) + (local114 - local162 & 0x10000);
						local347 = local114 - local347 | local347 - (local347 >>> 8);
						if (local98 == 0 && anInt2578 != 255) {
							local98 = local347;
							local347 = local3[local60];
							local347 = ((local98 & 0xFF00FF) * anInt2578 + (local347 & 0xFF00FF) * anInt2581 & 0xFF00FF00) + ((local98 & 0xFF00) * anInt2578 + (local347 & 0xFF00) * anInt2581 & 0xFF0000) >> 8;
						}
						local3[local60] = local347;
					} else if (arg0 == 2) {
						local230 = this.aByteArray47[local57];
						if (local230 != 0) {
							local98 = this.anIntArray213[local230 & 0xFF];
							local106 = (local98 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
							local114 = (local98 & 0xFF00) * anInt2578 & 0xFF0000;
							local3[local60++] = ((local106 | local114) >>> 8) + anInt2586;
						}
					} else {
						throw new IllegalArgumentException();
					}
					local18 += anInt2568;
					local20 += anInt2576;
					local22++;
				}
				anInt2574 += anInt2570;
				anInt2575 += anInt2560;
				anInt2567 += anInt2566;
			}
		}
	}

	@OriginalMember(owner = "client!apf", name = "cr", descriptor = "([I[III)V")
	@Override
	void method18296(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int[] local3 = this.aClass102_Sub2_10.anIntArray50;
		if (local3 == null) {
			return;
		}
		@Pc(12) int local12;
		@Pc(18) int local18;
		@Pc(28) int local28;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(34) int local34;
		@Pc(62) int local62;
		@Pc(67) int local67;
		@Pc(73) int local73;
		@Pc(121) byte local121;
		@Pc(198) int local198;
		if (anInt2568 == 0) {
			if (anInt2576 == 0) {
				local12 = anInt2565;
				while (local12 < 0) {
					local18 = local12 + arg3;
					if (local18 >= 0) {
						if (local18 >= arg0.length) {
							return;
						}
						local28 = anInt2567;
						local30 = anInt2574;
						local32 = anInt2575;
						local34 = anInt2563;
						if (local30 >= 0 && local32 >= 0 && local30 - (this.anInt2554 << 12) < 0 && local32 - (this.anInt2559 << 12) < 0) {
							local62 = arg0[local18] - arg2;
							local67 = -arg1[local18];
							local73 = local62 - (local28 - anInt2567);
							if (local73 > 0) {
								local28 += local73;
								local34 += local73;
								local30 += anInt2568 * local73;
								local32 += anInt2576 * local73;
							} else {
								local67 -= local73;
							}
							if (local34 < local67) {
								local34 = local67;
							}
							while (local34 < 0) {
								local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
								if (local121 == 0) {
									local28++;
								} else {
									local3[local28++] = this.anIntArray213[local121 & 0xFF];
								}
								local34++;
							}
						}
					}
					local12++;
					anInt2567 += anInt2566;
				}
			} else if (anInt2576 < 0) {
				local12 = anInt2565;
				while (local12 < 0) {
					local18 = local12 + arg3;
					if (local18 >= 0) {
						if (local18 >= arg0.length) {
							return;
						}
						local28 = anInt2567;
						local30 = anInt2574;
						local32 = anInt2575 + anInt2577;
						local34 = anInt2563;
						if (local30 >= 0 && local30 - (this.anInt2554 << 12) < 0) {
							@Pc(191) int local191;
							if ((local191 = local32 - (this.anInt2559 << 12)) >= 0) {
								local198 = (anInt2576 - local191) / anInt2576;
								local34 += local198;
								local32 += anInt2576 * local198;
								local28 += local198;
							}
							@Pc(219) int local219;
							if ((local219 = (local32 - anInt2576) / anInt2576) > local34) {
								local34 = local219;
							}
							local62 = arg0[local18] - arg2;
							local67 = -arg1[local18];
							local73 = local62 - (local28 - anInt2567);
							if (local73 > 0) {
								local28 += local73;
								local34 += local73;
								local30 += anInt2568 * local73;
								local32 += anInt2576 * local73;
							} else {
								local67 -= local73;
							}
							if (local34 < local67) {
								local34 = local67;
							}
							while (local34 < 0) {
								local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
								if (local121 == 0) {
									local28++;
								} else {
									local3[local28++] = this.anIntArray213[local121 & 0xFF];
								}
								local32 += anInt2576;
								local34++;
							}
						}
					}
					local12++;
					anInt2574 += anInt2570;
					anInt2567 += anInt2566;
				}
			} else {
				local12 = anInt2565;
				while (local12 < 0) {
					local18 = local12 + arg3;
					if (local18 >= 0) {
						if (local18 >= arg0.length) {
							return;
						}
						local28 = anInt2567;
						local30 = anInt2574;
						local32 = anInt2575 + anInt2577;
						local34 = anInt2563;
						if (local30 >= 0 && local30 - (this.anInt2554 << 12) < 0) {
							if (local32 < 0) {
								local198 = (anInt2576 - 1 - local32) / anInt2576;
								local34 += local198;
								local32 += anInt2576 * local198;
								local28 += local198;
							}
							@Pc(394) int local394;
							if ((local394 = (local32 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local34) {
								local34 = local394;
							}
							local62 = arg0[local18] - arg2;
							local67 = -arg1[local18];
							local73 = local62 - (local28 - anInt2567);
							if (local73 > 0) {
								local28 += local73;
								local34 += local73;
								local30 += anInt2568 * local73;
								local32 += anInt2576 * local73;
							} else {
								local67 -= local73;
							}
							if (local34 < local67) {
								local34 = local67;
							}
							while (local34 < 0) {
								local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
								if (local121 == 0) {
									local28++;
								} else {
									local3[local28++] = this.anIntArray213[local121 & 0xFF];
								}
								local32 += anInt2576;
								local34++;
							}
						}
					}
					local12++;
					anInt2574 += anInt2570;
					anInt2567 += anInt2566;
				}
			}
		} else if (anInt2568 < 0) {
			if (anInt2576 == 0) {
				local12 = anInt2565;
				while (local12 < 0) {
					local18 = local12 + arg3;
					if (local18 >= 0) {
						if (local18 >= arg0.length) {
							return;
						}
						local28 = anInt2567;
						local30 = anInt2574 + anInt2579;
						local32 = anInt2575;
						local34 = anInt2563;
						if (local32 >= 0 && local32 - (this.anInt2559 << 12) < 0) {
							@Pc(543) int local543;
							if ((local543 = local30 - (this.anInt2554 << 12)) >= 0) {
								local198 = (anInt2568 - local543) / anInt2568;
								local34 += local198;
								local30 += anInt2568 * local198;
								local28 += local198;
							}
							@Pc(571) int local571;
							if ((local571 = (local30 - anInt2568) / anInt2568) > local34) {
								local34 = local571;
							}
							local62 = arg0[local18] - arg2;
							local67 = -arg1[local18];
							local73 = local62 - (local28 - anInt2567);
							if (local73 > 0) {
								local28 += local73;
								local34 += local73;
								local30 += anInt2568 * local73;
								local32 += anInt2576 * local73;
							} else {
								local67 -= local73;
							}
							if (local34 < local67) {
								local34 = local67;
							}
							while (local34 < 0) {
								local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
								if (local121 == 0) {
									local28++;
								} else {
									local3[local28++] = this.anIntArray213[local121 & 0xFF];
								}
								local30 += anInt2568;
								local34++;
							}
						}
					}
					local12++;
					anInt2575 += anInt2560;
					anInt2567 += anInt2566;
				}
			} else if (anInt2576 < 0) {
				local12 = anInt2565;
				while (local12 < 0) {
					local18 = local12 + arg3;
					if (local18 >= 0) {
						if (local18 >= arg0.length) {
							return;
						}
						local28 = anInt2567;
						local30 = anInt2574 + anInt2579;
						local32 = anInt2575 + anInt2577;
						local34 = anInt2563;
						@Pc(709) int local709;
						if ((local709 = local30 - (this.anInt2554 << 12)) >= 0) {
							local198 = (anInt2568 - local709) / anInt2568;
							local34 += local198;
							local30 += anInt2568 * local198;
							local32 += anInt2576 * local198;
							local28 += local198;
						}
						@Pc(743) int local743;
						if ((local743 = (local30 - anInt2568) / anInt2568) > local34) {
							local34 = local743;
						}
						@Pc(755) int local755;
						if ((local755 = local32 - (this.anInt2559 << 12)) >= 0) {
							local198 = (anInt2576 - local755) / anInt2576;
							local34 += local198;
							local30 += anInt2568 * local198;
							local32 += anInt2576 * local198;
							local28 += local198;
						}
						@Pc(789) int local789;
						if ((local789 = (local32 - anInt2576) / anInt2576) > local34) {
							local34 = local789;
						}
						local62 = arg0[local18] - arg2;
						local67 = -arg1[local18];
						local73 = local62 - (local28 - anInt2567);
						if (local73 > 0) {
							local28 += local73;
							local34 += local73;
							local30 += anInt2568 * local73;
							local32 += anInt2576 * local73;
						} else {
							local67 -= local73;
						}
						if (local34 < local67) {
							local34 = local67;
						}
						while (local34 < 0) {
							local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
							if (local121 == 0) {
								local28++;
							} else {
								local3[local28++] = this.anIntArray213[local121 & 0xFF];
							}
							local30 += anInt2568;
							local32 += anInt2576;
							local34++;
						}
					}
					local12++;
					anInt2574 += anInt2570;
					anInt2575 += anInt2560;
					anInt2567 += anInt2566;
				}
			} else {
				local12 = anInt2565;
				while (local12 < 0) {
					local18 = local12 + arg3;
					if (local18 >= 0) {
						if (local18 >= arg0.length) {
							return;
						}
						local28 = anInt2567;
						local30 = anInt2574 + anInt2579;
						local32 = anInt2575 + anInt2577;
						local34 = anInt2563;
						@Pc(933) int local933;
						if ((local933 = local30 - (this.anInt2554 << 12)) >= 0) {
							local198 = (anInt2568 - local933) / anInt2568;
							local34 += local198;
							local30 += anInt2568 * local198;
							local32 += anInt2576 * local198;
							local28 += local198;
						}
						@Pc(967) int local967;
						if ((local967 = (local30 - anInt2568) / anInt2568) > local34) {
							local34 = local967;
						}
						if (local32 < 0) {
							local198 = (anInt2576 - 1 - local32) / anInt2576;
							local34 += local198;
							local30 += anInt2568 * local198;
							local32 += anInt2576 * local198;
							local28 += local198;
						}
						@Pc(1015) int local1015;
						if ((local1015 = (local32 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local34) {
							local34 = local1015;
						}
						local62 = arg0[local18] - arg2;
						local67 = -arg1[local18];
						local73 = local62 - (local28 - anInt2567);
						if (local73 > 0) {
							local28 += local73;
							local34 += local73;
							local30 += anInt2568 * local73;
							local32 += anInt2576 * local73;
						} else {
							local67 -= local73;
						}
						if (local34 < local67) {
							local34 = local67;
						}
						while (local34 < 0) {
							local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
							if (local121 == 0) {
								local28++;
							} else {
								local3[local28++] = this.anIntArray213[local121 & 0xFF];
							}
							local30 += anInt2568;
							local32 += anInt2576;
							local34++;
						}
					}
					local12++;
					anInt2574 += anInt2570;
					anInt2575 += anInt2560;
					anInt2567 += anInt2566;
				}
			}
		} else if (anInt2576 == 0) {
			local12 = anInt2565;
			while (local12 < 0) {
				local18 = local12 + arg3;
				if (local18 >= 0) {
					if (local18 >= arg0.length) {
						return;
					}
					local28 = anInt2567;
					local30 = anInt2574 + anInt2579;
					local32 = anInt2575;
					local34 = anInt2563;
					if (local32 >= 0 && local32 - (this.anInt2559 << 12) < 0) {
						if (local30 < 0) {
							local198 = (anInt2568 - 1 - local30) / anInt2568;
							local34 += local198;
							local30 += anInt2568 * local198;
							local28 += local198;
						}
						@Pc(1200) int local1200;
						if ((local1200 = (local30 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local34) {
							local34 = local1200;
						}
						local62 = arg0[local18] - arg2;
						local67 = -arg1[local18];
						local73 = local62 - (local28 - anInt2567);
						if (local73 > 0) {
							local28 += local73;
							local34 += local73;
							local30 += anInt2568 * local73;
							local32 += anInt2576 * local73;
						} else {
							local67 -= local73;
						}
						if (local34 < local67) {
							local34 = local67;
						}
						while (local34 < 0) {
							local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
							if (local121 == 0) {
								local28++;
							} else {
								local3[local28++] = this.anIntArray213[local121 & 0xFF];
							}
							local30 += anInt2568;
							local34++;
						}
					}
				}
				local12++;
				anInt2574 += anInt2570;
				anInt2575 += anInt2560;
				anInt2567 += anInt2566;
			}
		} else if (anInt2576 < 0) {
			local12 = anInt2565;
			while (local12 < 0) {
				local18 = local12 + arg3;
				if (local18 >= 0) {
					if (local18 >= arg0.length) {
						return;
					}
					local28 = anInt2567;
					local30 = anInt2574 + anInt2579;
					local32 = anInt2575 + anInt2577;
					local34 = anInt2563;
					if (local30 < 0) {
						local198 = (anInt2568 - 1 - local30) / anInt2568;
						local34 += local198;
						local30 += anInt2568 * local198;
						local32 += anInt2576 * local198;
						local28 += local198;
					}
					@Pc(1378) int local1378;
					if ((local1378 = (local30 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local34) {
						local34 = local1378;
					}
					@Pc(1390) int local1390;
					if ((local1390 = local32 - (this.anInt2559 << 12)) >= 0) {
						local198 = (anInt2576 - local1390) / anInt2576;
						local34 += local198;
						local30 += anInt2568 * local198;
						local32 += anInt2576 * local198;
						local28 += local198;
					}
					@Pc(1424) int local1424;
					if ((local1424 = (local32 - anInt2576) / anInt2576) > local34) {
						local34 = local1424;
					}
					local62 = arg0[local18] - arg2;
					local67 = -arg1[local18];
					local73 = local62 - (local28 - anInt2567);
					if (local73 > 0) {
						local28 += local73;
						local34 += local73;
						local30 += anInt2568 * local73;
						local32 += anInt2576 * local73;
					} else {
						local67 -= local73;
					}
					if (local34 < local67) {
						local34 = local67;
					}
					while (local34 < 0) {
						local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
						if (local121 == 0) {
							local28++;
						} else {
							local3[local28++] = this.anIntArray213[local121 & 0xFF];
						}
						local30 += anInt2568;
						local32 += anInt2576;
						local34++;
					}
				}
				local12++;
				anInt2574 += anInt2570;
				anInt2575 += anInt2560;
				anInt2567 += anInt2566;
			}
		} else {
			local12 = anInt2565;
			while (local12 < 0) {
				local18 = local12 + arg3;
				if (local18 >= 0) {
					if (local18 >= arg0.length) {
						return;
					}
					local28 = anInt2567;
					local30 = anInt2574 + anInt2579;
					local32 = anInt2575 + anInt2577;
					local34 = anInt2563;
					if (local30 < 0) {
						local198 = (anInt2568 - 1 - local30) / anInt2568;
						local34 += local198;
						local30 += anInt2568 * local198;
						local32 += anInt2576 * local198;
						local28 += local198;
					}
					@Pc(1604) int local1604;
					if ((local1604 = (local30 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local34) {
						local34 = local1604;
					}
					if (local32 < 0) {
						local198 = (anInt2576 - 1 - local32) / anInt2576;
						local34 += local198;
						local30 += anInt2568 * local198;
						local32 += anInt2576 * local198;
						local28 += local198;
					}
					@Pc(1652) int local1652;
					if ((local1652 = (local32 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local34) {
						local34 = local1652;
					}
					local62 = arg0[local18] - arg2;
					local67 = -arg1[local18];
					local73 = local62 - (local28 - anInt2567);
					if (local73 > 0) {
						local28 += local73;
						local34 += local73;
						local30 += anInt2568 * local73;
						local32 += anInt2576 * local73;
					} else {
						local67 -= local73;
					}
					if (local34 < local67) {
						local34 = local67;
					}
					while (local34 < 0) {
						local121 = this.aByteArray47[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
						if (local121 == 0) {
							local28++;
						} else {
							local3[local28++] = this.anIntArray213[local121 & 0xFF];
						}
						local30 += anInt2568;
						local32 += anInt2576;
						local34++;
					}
				}
				local12++;
				anInt2574 += anInt2570;
				anInt2575 += anInt2560;
				anInt2567 += anInt2566;
			}
		}
	}

	@OriginalMember(owner = "client!apf", name = "ae", descriptor = "(IIII[III)V")
	@Override
	public void method18285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		throw new IllegalStateException();
	}
}
