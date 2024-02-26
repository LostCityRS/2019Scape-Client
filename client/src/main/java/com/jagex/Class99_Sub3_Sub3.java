package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!app")
public final class Class99_Sub3_Sub3 extends Class99_Sub3 {

	@OriginalMember(owner = "client!app", name = "ah", descriptor = "[I")
	int[] anIntArray219;

	@OriginalMember(owner = "client!app", name = "<init>", descriptor = "(Lclient!aff;[IIIIIZ)V")
	Class99_Sub3_Sub3(@OriginalArg(0) Class102_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg4, arg5);
		if (arg6) {
			this.anIntArray219 = new int[arg4 * arg5];
		} else {
			this.anIntArray219 = arg1;
		}
		@Pc(21) int local21 = arg3 - this.anInt2554;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg5; local25++) {
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				this.anIntArray219[local23++] = arg1[arg2++];
			}
			arg2 += local21;
		}
	}

	@OriginalMember(owner = "client!app", name = "<init>", descriptor = "(Lclient!aff;[III)V")
	Class99_Sub3_Sub3(@OriginalArg(0) Class102_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anIntArray219 = arg1;
	}

	@OriginalMember(owner = "client!app", name = "<init>", descriptor = "(Lclient!aff;II)V")
	Class99_Sub3_Sub3(@OriginalArg(0) Class102_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg1, arg2);
		this.anIntArray219 = new int[arg1 * arg2];
	}

	@OriginalMember(owner = "client!app", name = "cu", descriptor = "([I[III)V")
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
		@Pc(121) int local121;
		@Pc(125) int local125;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(229) int local229;
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
								local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
								local125 = local121 >>> 24;
								local129 = 256 - local125;
								local133 = local3[local28];
								local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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
							@Pc(222) int local222;
							if ((local222 = local32 - (this.anInt2559 << 12)) >= 0) {
								local229 = (anInt2576 - local222) / anInt2576;
								local34 += local229;
								local32 += anInt2576 * local229;
								local28 += local229;
							}
							@Pc(250) int local250;
							if ((local250 = (local32 - anInt2576) / anInt2576) > local34) {
								local34 = local250;
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
								local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
								local125 = local121 >>> 24;
								local129 = 256 - local125;
								local133 = local3[local28];
								local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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
								local229 = (anInt2576 - 1 - local32) / anInt2576;
								local34 += local229;
								local32 += anInt2576 * local229;
								local28 += local229;
							}
							@Pc(456) int local456;
							if ((local456 = (local32 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local34) {
								local34 = local456;
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
								local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
								local125 = local121 >>> 24;
								local129 = 256 - local125;
								local133 = local3[local28];
								local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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
							@Pc(636) int local636;
							if ((local636 = local30 - (this.anInt2554 << 12)) >= 0) {
								local229 = (anInt2568 - local636) / anInt2568;
								local34 += local229;
								local30 += anInt2568 * local229;
								local28 += local229;
							}
							@Pc(664) int local664;
							if ((local664 = (local30 - anInt2568) / anInt2568) > local34) {
								local34 = local664;
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
								local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
								local125 = local121 >>> 24;
								local129 = 256 - local125;
								local133 = local3[local28];
								local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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
						@Pc(833) int local833;
						if ((local833 = local30 - (this.anInt2554 << 12)) >= 0) {
							local229 = (anInt2568 - local833) / anInt2568;
							local34 += local229;
							local30 += anInt2568 * local229;
							local32 += anInt2576 * local229;
							local28 += local229;
						}
						@Pc(867) int local867;
						if ((local867 = (local30 - anInt2568) / anInt2568) > local34) {
							local34 = local867;
						}
						@Pc(879) int local879;
						if ((local879 = local32 - (this.anInt2559 << 12)) >= 0) {
							local229 = (anInt2576 - local879) / anInt2576;
							local34 += local229;
							local30 += anInt2568 * local229;
							local32 += anInt2576 * local229;
							local28 += local229;
						}
						@Pc(913) int local913;
						if ((local913 = (local32 - anInt2576) / anInt2576) > local34) {
							local34 = local913;
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
							local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
							local125 = local121 >>> 24;
							local129 = 256 - local125;
							local133 = local3[local28];
							local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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
						@Pc(1088) int local1088;
						if ((local1088 = local30 - (this.anInt2554 << 12)) >= 0) {
							local229 = (anInt2568 - local1088) / anInt2568;
							local34 += local229;
							local30 += anInt2568 * local229;
							local32 += anInt2576 * local229;
							local28 += local229;
						}
						@Pc(1122) int local1122;
						if ((local1122 = (local30 - anInt2568) / anInt2568) > local34) {
							local34 = local1122;
						}
						if (local32 < 0) {
							local229 = (anInt2576 - 1 - local32) / anInt2576;
							local34 += local229;
							local30 += anInt2568 * local229;
							local32 += anInt2576 * local229;
							local28 += local229;
						}
						@Pc(1170) int local1170;
						if ((local1170 = (local32 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local34) {
							local34 = local1170;
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
							local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
							local125 = local121 >>> 24;
							local129 = 256 - local125;
							local133 = local3[local28];
							local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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
							local229 = (anInt2568 - 1 - local30) / anInt2568;
							local34 += local229;
							local30 += anInt2568 * local229;
							local28 += local229;
						}
						@Pc(1386) int local1386;
						if ((local1386 = (local30 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local34) {
							local34 = local1386;
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
							local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
							local125 = local121 >>> 24;
							local129 = 256 - local125;
							local133 = local3[local28];
							local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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
						local229 = (anInt2568 - 1 - local30) / anInt2568;
						local34 += local229;
						local30 += anInt2568 * local229;
						local32 += anInt2576 * local229;
						local28 += local229;
					}
					@Pc(1595) int local1595;
					if ((local1595 = (local30 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local34) {
						local34 = local1595;
					}
					@Pc(1607) int local1607;
					if ((local1607 = local32 - (this.anInt2559 << 12)) >= 0) {
						local229 = (anInt2576 - local1607) / anInt2576;
						local34 += local229;
						local30 += anInt2568 * local229;
						local32 += anInt2576 * local229;
						local28 += local229;
					}
					@Pc(1641) int local1641;
					if ((local1641 = (local32 - anInt2576) / anInt2576) > local34) {
						local34 = local1641;
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
						local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
						local125 = local121 >>> 24;
						local129 = 256 - local125;
						local133 = local3[local28];
						local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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
						local229 = (anInt2568 - 1 - local30) / anInt2568;
						local34 += local229;
						local30 += anInt2568 * local229;
						local32 += anInt2576 * local229;
						local28 += local229;
					}
					@Pc(1852) int local1852;
					if ((local1852 = (local30 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local34) {
						local34 = local1852;
					}
					if (local32 < 0) {
						local229 = (anInt2576 - 1 - local32) / anInt2576;
						local34 += local229;
						local30 += anInt2568 * local229;
						local32 += anInt2576 * local229;
						local28 += local229;
					}
					@Pc(1900) int local1900;
					if ((local1900 = (local32 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local34) {
						local34 = local1900;
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
						local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
						local125 = local121 >>> 24;
						local129 = 256 - local125;
						local133 = local3[local28];
						local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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

	@OriginalMember(owner = "client!app", name = "cz", descriptor = "(II[III)V")
	void method18310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(20) int local20;
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(44) int local44;
		@Pc(88) int local88;
		if (arg4 != 0) {
			@Pc(284) int local284;
			@Pc(296) int local296;
			if (arg4 != 1) {
				if (arg4 != 2) {
					throw new IllegalArgumentException();
				}
				if (arg3 == 1) {
					local20 = this.anIntArray219[arg0];
					local28 = arg2[arg1];
					local36 = local20 + local28;
					local44 = (local20 & 0xFF00FF) + (local28 & 0xFF00FF);
					local28 = (local44 & 0x1000100) + (local36 - local44 & 0x10000);
					arg2[arg1] = local36 - local28 | local28 - (local28 >>> 8);
				} else if (arg3 == 0) {
					local20 = this.anIntArray219[arg0];
					local28 = (local20 & 0xFF0000) * anInt2558 & 0xFF000000;
					local36 = (local20 & 0xFF00) * anInt2569 & 0xFF0000;
					local44 = (local20 & 0xFF) * anInt2583 & 0xFF00;
					local20 = (local28 | local36 | local44) >>> 8;
					local88 = arg2[arg1];
					local284 = local20 + local88;
					local296 = (local20 & 0xFF00FF) + (local88 & 0xFF00FF);
					local88 = (local296 & 0x1000100) + (local284 - local296 & 0x10000);
					arg2[arg1] = local284 - local88 | local88 - (local88 >>> 8);
				} else if (arg3 == 3) {
					local20 = this.anIntArray219[arg0];
					local28 = anInt2582;
					local36 = local20 + local28;
					local44 = (local20 & 0xFF00FF) + (local28 & 0xFF00FF);
					local88 = (local44 & 0x1000100) + (local36 - local44 & 0x10000);
					local20 = local36 - local88 | local88 - (local88 >>> 8);
					local88 = arg2[arg1];
					local36 = local20 + local88;
					local44 = (local20 & 0xFF00FF) + (local88 & 0xFF00FF);
					local88 = (local44 & 0x1000100) + (local36 - local44 & 0x10000);
					arg2[arg1] = local36 - local88 | local88 - (local88 >>> 8);
				} else if (arg3 == 2) {
					local20 = this.anIntArray219[arg0];
					local28 = (local20 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
					local36 = (local20 & 0xFF00) * anInt2578 & 0xFF0000;
					local20 = ((local28 | local36) >>> 8) + anInt2586;
					local44 = arg2[arg1];
					local88 = local20 + local44;
					local284 = (local20 & 0xFF00FF) + (local44 & 0xFF00FF);
					local44 = (local284 & 0x1000100) + (local88 - local284 & 0x10000);
					arg2[arg1] = local88 - local44 | local44 - (local44 >>> 8);
				}
			} else if (arg3 == 1) {
				local20 = this.anIntArray219[arg0];
				local28 = local20 >>> 24;
				local36 = 256 - local28;
				local44 = arg2[arg1];
				arg2[arg1] = ((local20 & 0xFF00FF) * local28 + (local44 & 0xFF00FF) * local36 & 0xFF00FF00) + ((local20 & 0xFF00) * local28 + (local44 & 0xFF00) * local36 & 0xFF0000) >> 8;
			} else if (arg3 == 0) {
				local20 = this.anIntArray219[arg0];
				local28 = (local20 >>> 24) * anInt2578 >> 8;
				local36 = 256 - local28;
				if ((anInt2582 & 0xFFFFFF) == 16777215) {
					local44 = arg2[arg1];
					arg2[arg1] = ((local20 & 0xFF00FF) * local28 + (local44 & 0xFF00FF) * local36 & 0xFF00FF00) + ((local20 & 0xFF00) * local28 + (local44 & 0xFF00) * local36 & 0xFF0000) >> 8;
				} else if (local28 == 255) {
					local44 = (local20 & 0xFF0000) * anInt2558 & 0xFF000000;
					local88 = (local20 & 0xFF00) * anInt2569 & 0xFF0000;
					local284 = (local20 & 0xFF) * anInt2583 & 0xFF00;
					arg2[arg1] = (local44 | local88 | local284) >>> 8;
				} else {
					local44 = (local20 & 0xFF0000) * anInt2558 & 0xFF000000;
					local88 = (local20 & 0xFF00) * anInt2569 & 0xFF0000;
					local284 = (local20 & 0xFF) * anInt2583 & 0xFF00;
					local20 = (local44 | local88 | local284) >>> 8;
					local296 = arg2[arg1];
					arg2[arg1] = ((local20 & 0xFF00FF) * local28 + (local296 & 0xFF00FF) * local36 & 0xFF00FF00) + ((local20 & 0xFF00) * local28 + (local296 & 0xFF00) * local36 & 0xFF0000) >> 8;
				}
			} else if (arg3 == 3) {
				local20 = this.anIntArray219[arg0];
				local28 = anInt2582;
				local36 = local20 + local28;
				local44 = (local20 & 0xFF00FF) + (local28 & 0xFF00FF);
				local88 = (local44 & 0x1000100) + (local36 - local44 & 0x10000);
				local88 = local36 - local88 | local88 - (local88 >>> 8);
				local284 = (local20 >>> 24) * anInt2578 >> 8;
				local296 = 256 - local284;
				if (local284 != 255) {
					local20 = local88;
					local88 = arg2[arg1];
					local88 = ((local20 & 0xFF00FF) * local284 + (local88 & 0xFF00FF) * local296 & 0xFF00FF00) + ((local20 & 0xFF00) * local284 + (local88 & 0xFF00) * local296 & 0xFF0000) >> 8;
				}
				arg2[arg1] = local88;
			} else if (arg3 == 2) {
				local20 = this.anIntArray219[arg0];
				local28 = local20 >>> 24;
				local36 = 256 - local28;
				local44 = (local20 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
				local88 = (local20 & 0xFF00) * anInt2578 & 0xFF0000;
				local20 = ((local44 | local88) >>> 8) + anInt2586;
				local284 = arg2[arg1];
				arg2[arg1] = ((local20 & 0xFF00FF) * local28 + (local284 & 0xFF00FF) * local36 & 0xFF00FF00) + ((local20 & 0xFF00) * local28 + (local284 & 0xFF00) * local36 & 0xFF0000) >> 8;
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg3 == 1) {
			arg2[arg1] = this.anIntArray219[arg0];
		} else {
			@Pc(18) int local18;
			@Pc(17) int local17;
			if (arg3 == 0) {
				local17 = arg0;
				local18 = arg0 + 1;
				local20 = this.anIntArray219[local17];
				local28 = (local20 & 0xFF0000) * anInt2558 & 0xFF000000;
				local36 = (local20 & 0xFF00) * anInt2569 & 0xFF0000;
				local44 = (local20 & 0xFF) * anInt2583 & 0xFF00;
				arg2[arg1] = (local28 | local36 | local44) >>> 8;
			} else if (arg3 == 3) {
				local17 = arg0;
				local18 = arg0 + 1;
				local20 = this.anIntArray219[local17];
				local28 = anInt2582;
				local36 = local20 + local28;
				local44 = (local20 & 0xFF00FF) + (local28 & 0xFF00FF);
				local88 = (local44 & 0x1000100) + (local36 - local44 & 0x10000);
				arg2[arg1] = local36 - local88 | local88 - (local88 >>> 8);
			} else if (arg3 == 2) {
				local20 = this.anIntArray219[arg0];
				local28 = (local20 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
				local36 = (local20 & 0xFF00) * anInt2578 & 0xFF0000;
				arg2[arg1] = ((local28 | local36) >>> 8) + anInt2586;
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	@OriginalMember(owner = "client!app", name = "cl", descriptor = "(II[III)V")
	void method18311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(20) int local20;
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(44) int local44;
		@Pc(88) int local88;
		if (arg4 != 0) {
			@Pc(284) int local284;
			@Pc(296) int local296;
			if (arg4 != 1) {
				if (arg4 != 2) {
					throw new IllegalArgumentException();
				}
				if (arg3 == 1) {
					local20 = this.anIntArray219[arg0];
					local28 = arg2[arg1];
					local36 = local20 + local28;
					local44 = (local20 & 0xFF00FF) + (local28 & 0xFF00FF);
					local28 = (local44 & 0x1000100) + (local36 - local44 & 0x10000);
					arg2[arg1] = local36 - local28 | local28 - (local28 >>> 8);
				} else if (arg3 == 0) {
					local20 = this.anIntArray219[arg0];
					local28 = (local20 & 0xFF0000) * anInt2558 & 0xFF000000;
					local36 = (local20 & 0xFF00) * anInt2569 & 0xFF0000;
					local44 = (local20 & 0xFF) * anInt2583 & 0xFF00;
					local20 = (local28 | local36 | local44) >>> 8;
					local88 = arg2[arg1];
					local284 = local20 + local88;
					local296 = (local20 & 0xFF00FF) + (local88 & 0xFF00FF);
					local88 = (local296 & 0x1000100) + (local284 - local296 & 0x10000);
					arg2[arg1] = local284 - local88 | local88 - (local88 >>> 8);
				} else if (arg3 == 3) {
					local20 = this.anIntArray219[arg0];
					local28 = anInt2582;
					local36 = local20 + local28;
					local44 = (local20 & 0xFF00FF) + (local28 & 0xFF00FF);
					local88 = (local44 & 0x1000100) + (local36 - local44 & 0x10000);
					local20 = local36 - local88 | local88 - (local88 >>> 8);
					local88 = arg2[arg1];
					local36 = local20 + local88;
					local44 = (local20 & 0xFF00FF) + (local88 & 0xFF00FF);
					local88 = (local44 & 0x1000100) + (local36 - local44 & 0x10000);
					arg2[arg1] = local36 - local88 | local88 - (local88 >>> 8);
				} else if (arg3 == 2) {
					local20 = this.anIntArray219[arg0];
					local28 = (local20 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
					local36 = (local20 & 0xFF00) * anInt2578 & 0xFF0000;
					local20 = ((local28 | local36) >>> 8) + anInt2586;
					local44 = arg2[arg1];
					local88 = local20 + local44;
					local284 = (local20 & 0xFF00FF) + (local44 & 0xFF00FF);
					local44 = (local284 & 0x1000100) + (local88 - local284 & 0x10000);
					arg2[arg1] = local88 - local44 | local44 - (local44 >>> 8);
				}
			} else if (arg3 == 1) {
				local20 = this.anIntArray219[arg0];
				local28 = local20 >>> 24;
				local36 = 256 - local28;
				local44 = arg2[arg1];
				arg2[arg1] = ((local20 & 0xFF00FF) * local28 + (local44 & 0xFF00FF) * local36 & 0xFF00FF00) + ((local20 & 0xFF00) * local28 + (local44 & 0xFF00) * local36 & 0xFF0000) >> 8;
			} else if (arg3 == 0) {
				local20 = this.anIntArray219[arg0];
				local28 = (local20 >>> 24) * anInt2578 >> 8;
				local36 = 256 - local28;
				if ((anInt2582 & 0xFFFFFF) == 16777215) {
					local44 = arg2[arg1];
					arg2[arg1] = ((local20 & 0xFF00FF) * local28 + (local44 & 0xFF00FF) * local36 & 0xFF00FF00) + ((local20 & 0xFF00) * local28 + (local44 & 0xFF00) * local36 & 0xFF0000) >> 8;
				} else if (local28 == 255) {
					local44 = (local20 & 0xFF0000) * anInt2558 & 0xFF000000;
					local88 = (local20 & 0xFF00) * anInt2569 & 0xFF0000;
					local284 = (local20 & 0xFF) * anInt2583 & 0xFF00;
					arg2[arg1] = (local44 | local88 | local284) >>> 8;
				} else {
					local44 = (local20 & 0xFF0000) * anInt2558 & 0xFF000000;
					local88 = (local20 & 0xFF00) * anInt2569 & 0xFF0000;
					local284 = (local20 & 0xFF) * anInt2583 & 0xFF00;
					local20 = (local44 | local88 | local284) >>> 8;
					local296 = arg2[arg1];
					arg2[arg1] = ((local20 & 0xFF00FF) * local28 + (local296 & 0xFF00FF) * local36 & 0xFF00FF00) + ((local20 & 0xFF00) * local28 + (local296 & 0xFF00) * local36 & 0xFF0000) >> 8;
				}
			} else if (arg3 == 3) {
				local20 = this.anIntArray219[arg0];
				local28 = anInt2582;
				local36 = local20 + local28;
				local44 = (local20 & 0xFF00FF) + (local28 & 0xFF00FF);
				local88 = (local44 & 0x1000100) + (local36 - local44 & 0x10000);
				local88 = local36 - local88 | local88 - (local88 >>> 8);
				local284 = (local20 >>> 24) * anInt2578 >> 8;
				local296 = 256 - local284;
				if (local284 != 255) {
					local20 = local88;
					local88 = arg2[arg1];
					local88 = ((local20 & 0xFF00FF) * local284 + (local88 & 0xFF00FF) * local296 & 0xFF00FF00) + ((local20 & 0xFF00) * local284 + (local88 & 0xFF00) * local296 & 0xFF0000) >> 8;
				}
				arg2[arg1] = local88;
			} else if (arg3 == 2) {
				local20 = this.anIntArray219[arg0];
				local28 = local20 >>> 24;
				local36 = 256 - local28;
				local44 = (local20 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
				local88 = (local20 & 0xFF00) * anInt2578 & 0xFF0000;
				local20 = ((local44 | local88) >>> 8) + anInt2586;
				local284 = arg2[arg1];
				arg2[arg1] = ((local20 & 0xFF00FF) * local28 + (local284 & 0xFF00FF) * local36 & 0xFF00FF00) + ((local20 & 0xFF00) * local28 + (local284 & 0xFF00) * local36 & 0xFF0000) >> 8;
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg3 == 1) {
			arg2[arg1] = this.anIntArray219[arg0];
		} else {
			@Pc(18) int local18;
			@Pc(17) int local17;
			if (arg3 == 0) {
				local17 = arg0;
				local18 = arg0 + 1;
				local20 = this.anIntArray219[local17];
				local28 = (local20 & 0xFF0000) * anInt2558 & 0xFF000000;
				local36 = (local20 & 0xFF00) * anInt2569 & 0xFF0000;
				local44 = (local20 & 0xFF) * anInt2583 & 0xFF00;
				arg2[arg1] = (local28 | local36 | local44) >>> 8;
			} else if (arg3 == 3) {
				local17 = arg0;
				local18 = arg0 + 1;
				local20 = this.anIntArray219[local17];
				local28 = anInt2582;
				local36 = local20 + local28;
				local44 = (local20 & 0xFF00FF) + (local28 & 0xFF00FF);
				local88 = (local44 & 0x1000100) + (local36 - local44 & 0x10000);
				arg2[arg1] = local36 - local88 | local88 - (local88 >>> 8);
			} else if (arg3 == 2) {
				local20 = this.anIntArray219[arg0];
				local28 = (local20 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
				local36 = (local20 & 0xFF00) * anInt2578 & 0xFF0000;
				arg2[arg1] = ((local28 | local36) >>> 8) + anInt2586;
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	@OriginalMember(owner = "client!app", name = "o", descriptor = "(IIII[I[III)V")
	@Override
	public void method18222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.method18315(arg0, arg1, arg2, arg3, arg4, arg6, arg7);
	}

	@OriginalMember(owner = "client!app", name = "j", descriptor = "(IIIIII)V")
	@Override
	public void method18223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int[] local3 = this.aClass102_Sub2_10.anIntArray50;
		if (local3 == null) {
			throw new IllegalStateException("");
		}
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			@Pc(23) int local23 = (arg1 + local12) * arg2 + arg0;
			@Pc(31) int local31 = (arg5 + local12) * arg2 + arg4;
			for (@Pc(33) int local33 = 0; local33 < arg2; local33++) {
				this.anIntArray219[local23 + local33] = local3[local31 + local33] & 0xFFFFFF;
			}
		}
	}

	@OriginalMember(owner = "client!app", name = "a", descriptor = "(III)V")
	@Override
	public void method18224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int[] local3 = this.aClass102_Sub2_10.anIntArray50;
		if (local3 == null) {
			throw new IllegalStateException("");
		}
		@Pc(14) int local14;
		@Pc(23) int local23;
		@Pc(35) int local35;
		@Pc(37) int local37;
		if (arg2 == 0) {
			for (local14 = 0; local14 < this.anInt2559; local14++) {
				local23 = local14 * this.anInt2554;
				local35 = (arg1 + local14) * this.aClass102_Sub2_10.anInt638 * 513500097 + arg0;
				for (local37 = 0; local37 < this.anInt2554; local37++) {
					this.anIntArray219[local23 + local37] = this.anIntArray219[local23 + local37] & 0xFFFFFF | (local3[local35 + local37] & 0xFF0000) << 8;
				}
			}
		} else if (arg2 == 1) {
			for (local14 = 0; local14 < this.anInt2559; local14++) {
				local23 = local14 * this.anInt2554;
				local35 = (arg1 + local14) * this.aClass102_Sub2_10.anInt638 * 513500097 + arg0;
				for (local37 = 0; local37 < this.anInt2554; local37++) {
					this.anIntArray219[local23 + local37] = this.anIntArray219[local23 + local37] & 0xFFFFFF | (local3[local35 + local37] & 0xFF00) << 16;
				}
			}
		} else if (arg2 == 2) {
			for (local14 = 0; local14 < this.anInt2559; local14++) {
				local23 = local14 * this.anInt2554;
				local35 = (arg1 + local14) * this.aClass102_Sub2_10.anInt638 * 513500097 + arg0;
				for (local37 = 0; local37 < this.anInt2554; local37++) {
					this.anIntArray219[local23 + local37] = this.anIntArray219[local23 + local37] & 0xFFFFFF | (local3[local35 + local37] & 0xFF) << 24;
				}
			}
		} else if (arg2 == 3) {
			for (local14 = 0; local14 < this.anInt2559; local14++) {
				local23 = local14 * this.anInt2554;
				local35 = (arg1 + local14) * this.aClass102_Sub2_10.anInt638 * 513500097 + arg0;
				for (local37 = 0; local37 < this.anInt2554; local37++) {
					this.anIntArray219[local23 + local37] = this.anIntArray219[local23 + local37] & 0xFFFFFF | (local3[local35 + local37] == 0 ? 0 : -16777216);
				}
			}
		}
	}

	@OriginalMember(owner = "client!app", name = "i", descriptor = "()Lclient!do;")
	@Override
	public Interface18 method18231() {
		return new Class183(this.anInt2554, this.anInt2559, this.anIntArray219);
	}

	@OriginalMember(owner = "client!app", name = "k", descriptor = "(IIIII)V")
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
		@Pc(284) int local284;
		@Pc(287) int local287;
		@Pc(292) int local292;
		@Pc(300) int local300;
		@Pc(308) int local308;
		@Pc(316) int local316;
		@Pc(324) int local324;
		@Pc(448) int local448;
		if (arg4 != 0) {
			@Pc(744) int local744;
			@Pc(752) int local752;
			@Pc(764) int local764;
			if (arg4 != 1) {
				if (arg4 != 2) {
					throw new IllegalArgumentException();
				}
				if (arg2 == 1) {
					for (local65 = -local41; local65 < 0; local65++) {
						for (local201 = -local44; local201 < 0; local201++) {
							local284 = this.anIntArray219[local38++];
							if (local284 == 0) {
								local36++;
							} else {
								local287 = local11[local36];
								local292 = local284 + local287;
								local300 = (local284 & 0xFF00FF) + (local287 & 0xFF00FF);
								local287 = (local300 & 0x1000100) + (local292 - local300 & 0x10000);
								local11[local36++] = local292 - local287 | local287 - (local287 >>> 8);
							}
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 0) {
					local65 = arg3 >> 16 & 0xFF;
					local201 = arg3 >> 8 & 0xFF;
					local284 = arg3 & 0xFF;
					for (local287 = -local41; local287 < 0; local287++) {
						for (local292 = -local44; local292 < 0; local292++) {
							local300 = this.anIntArray219[local38++];
							if (local300 == 0) {
								local36++;
							} else {
								local308 = (local300 & 0xFF0000) * local65 & 0xFF000000;
								local316 = (local300 & 0xFF00) * local201 & 0xFF0000;
								local324 = (local300 & 0xFF) * local284 & 0xFF00;
								local300 = (local308 | local316 | local324) >>> 8;
								local744 = local11[local36];
								local752 = local300 + local744;
								local764 = (local300 & 0xFF00FF) + (local744 & 0xFF00FF);
								local744 = (local764 & 0x1000100) + (local752 - local764 & 0x10000);
								local11[local36++] = local752 - local744 | local744 - (local744 >>> 8);
							}
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 3) {
					for (local65 = -local41; local65 < 0; local65++) {
						for (local201 = -local44; local201 < 0; local201++) {
							local284 = this.anIntArray219[local38++];
							local287 = local284 + arg3;
							local292 = (local284 & 0xFF00FF) + (arg3 & 0xFF00FF);
							local300 = (local292 & 0x1000100) + (local287 - local292 & 0x10000);
							local284 = local287 - local300 | local300 - (local300 >>> 8);
							local300 = local11[local36];
							local287 = local284 + local300;
							local292 = (local284 & 0xFF00FF) + (local300 & 0xFF00FF);
							local300 = (local292 & 0x1000100) + (local287 - local292 & 0x10000);
							local11[local36++] = local287 - local300 | local300 - (local300 >>> 8);
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 2) {
					local65 = arg3 >>> 24;
					local201 = 256 - local65;
					local284 = (arg3 & 0xFF00FF) * local201 & 0xFF00FF00;
					local287 = (arg3 & 0xFF00) * local201 & 0xFF0000;
					local448 = (local284 | local287) >>> 8;
					for (local292 = -local41; local292 < 0; local292++) {
						for (local300 = -local44; local300 < 0; local300++) {
							local308 = this.anIntArray219[local38++];
							if (local308 == 0) {
								local36++;
							} else {
								local284 = (local308 & 0xFF00FF) * local65 & 0xFF00FF00;
								local287 = (local308 & 0xFF00) * local65 & 0xFF0000;
								local308 = ((local284 | local287) >>> 8) + local448;
								local316 = local11[local36];
								local324 = local308 + local316;
								local744 = (local308 & 0xFF00FF) + (local316 & 0xFF00FF);
								local316 = (local744 & 0x1000100) + (local324 - local744 & 0x10000);
								local11[local36++] = local324 - local316 | local316 - (local316 >>> 8);
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
						local284 = this.anIntArray219[local38++];
						local287 = local284 >>> 24;
						local292 = 256 - local287;
						local300 = local11[local36];
						local11[local36++] = ((local284 & 0xFF00FF) * local287 + (local300 & 0xFF00FF) * local292 >> 8 & 0xFFFF00FF) + (((local284 & 0xFF00FF00) >>> 8) * local287 + ((local300 & 0xFF00FF00) >>> 8) * local292 & 0xFF00FF00);
					}
					local36 += local48;
					local38 += local50;
				}
			} else if (arg2 == 0) {
				if ((arg3 & 0xFFFFFF) == 16777215) {
					for (local65 = -local41; local65 < 0; local65++) {
						for (local201 = -local44; local201 < 0; local201++) {
							local284 = this.anIntArray219[local38++];
							local287 = (local284 >>> 24) * (arg3 >>> 24) >> 8;
							local292 = 256 - local287;
							local300 = local11[local36];
							local11[local36++] = ((local284 & 0xFF00FF) * local287 + (local300 & 0xFF00FF) * local292 & 0xFF00FF00) + ((local284 & 0xFF00) * local287 + (local300 & 0xFF00) * local292 & 0xFF0000) >> 8;
						}
						local36 += local48;
						local38 += local50;
					}
				} else {
					local65 = arg3 >> 16 & 0xFF;
					local201 = arg3 >> 8 & 0xFF;
					local284 = arg3 & 0xFF;
					for (local287 = -local41; local287 < 0; local287++) {
						for (local292 = -local44; local292 < 0; local292++) {
							local300 = this.anIntArray219[local38++];
							local308 = (local300 >>> 24) * (arg3 >>> 24) >> 8;
							local316 = 256 - local308;
							if (local308 == 255) {
								local324 = (local300 & 0xFF0000) * local65 & 0xFF000000;
								local744 = (local300 & 0xFF00) * local201 & 0xFF0000;
								local752 = (local300 & 0xFF) * local284 & 0xFF00;
								local11[local36++] = (local324 | local744 | local752) >>> 8;
							} else {
								local324 = (local300 & 0xFF0000) * local65 & 0xFF000000;
								local744 = (local300 & 0xFF00) * local201 & 0xFF0000;
								local752 = (local300 & 0xFF) * local284 & 0xFF00;
								local300 = (local324 | local744 | local752) >>> 8;
								local764 = local11[local36];
								local11[local36++] = ((local300 & 0xFF00FF) * local308 + (local764 & 0xFF00FF) * local316 & 0xFF00FF00) + ((local300 & 0xFF00) * local308 + (local764 & 0xFF00) * local316 & 0xFF0000) >> 8;
							}
						}
						local36 += local48;
						local38 += local50;
					}
				}
			} else if (arg2 == 3) {
				for (local65 = -local41; local65 < 0; local65++) {
					for (local201 = -local44; local201 < 0; local201++) {
						local284 = this.anIntArray219[local38++];
						local287 = local284 + arg3;
						local292 = (local284 & 0xFF00FF) + (arg3 & 0xFF00FF);
						local300 = (local292 & 0x1000100) + (local287 - local292 & 0x10000);
						local300 = local287 - local300 | local300 - (local300 >>> 8);
						local308 = (local300 >>> 24) * (arg3 >>> 24) >> 8;
						local316 = 256 - local308;
						if (local308 != 255) {
							local284 = local300;
							local300 = local11[local36];
							local300 = ((local284 & 0xFF00FF) * local308 + (local300 & 0xFF00FF) * local316 & 0xFF00FF00) + ((local284 & 0xFF00) * local308 + (local300 & 0xFF00) * local316 & 0xFF0000) >> 8;
						}
						local11[local36++] = local300;
					}
					local36 += local48;
					local38 += local50;
				}
			} else if (arg2 == 2) {
				local65 = arg3 >>> 24;
				local201 = 256 - local65;
				local284 = (arg3 & 0xFF00FF) * local201 & 0xFF00FF00;
				local287 = (arg3 & 0xFF00) * local201 & 0xFF0000;
				local448 = (local284 | local287) >>> 8;
				for (local292 = -local41; local292 < 0; local292++) {
					for (local300 = -local44; local300 < 0; local300++) {
						local308 = this.anIntArray219[local38++];
						local316 = local308 >>> 24;
						local324 = 256 - local316;
						local284 = (local308 & 0xFF00FF) * local65 & 0xFF00FF00;
						local287 = (local308 & 0xFF00) * local65 & 0xFF0000;
						local308 = ((local284 | local287) >>> 8) + local448;
						local744 = local11[local36];
						local11[local36++] = ((local308 & 0xFF00FF) * local316 + (local744 & 0xFF00FF) * local324 & 0xFF00FF00) + ((local308 & 0xFF00) * local316 + (local744 & 0xFF00) * local324 & 0xFF0000) >> 8;
					}
					local36 += local48;
					local38 += local50;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg2 == 1) {
			for (local65 = -local41; local65 < 0; local65++) {
				local201 = local36 + local44 - 3;
				while (local36 < local201) {
					local11[local36++] = this.anIntArray219[local38++];
					local11[local36++] = this.anIntArray219[local38++];
					local11[local36++] = this.anIntArray219[local38++];
					local11[local36++] = this.anIntArray219[local38++];
				}
				local201 += 3;
				while (local36 < local201) {
					local11[local36++] = this.anIntArray219[local38++];
				}
				local36 += local48;
				local38 += local50;
			}
		} else if (arg2 == 0) {
			local65 = arg3 >> 16 & 0xFF;
			local201 = arg3 >> 8 & 0xFF;
			local284 = arg3 & 0xFF;
			for (local287 = -local41; local287 < 0; local287++) {
				for (local292 = -local44; local292 < 0; local292++) {
					local300 = this.anIntArray219[local38++];
					local308 = (local300 & 0xFF0000) * local65 & 0xFF000000;
					local316 = (local300 & 0xFF00) * local201 & 0xFF0000;
					local324 = (local300 & 0xFF) * local284 & 0xFF00;
					local11[local36++] = (local308 | local316 | local324) >>> 8;
				}
				local36 += local48;
				local38 += local50;
			}
		} else if (arg2 == 3) {
			for (local65 = -local41; local65 < 0; local65++) {
				for (local201 = -local44; local201 < 0; local201++) {
					local284 = this.anIntArray219[local38++];
					local287 = local284 + arg3;
					local292 = (local284 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local300 = (local292 & 0x1000100) + (local287 - local292 & 0x10000);
					local11[local36++] = local287 - local300 | local300 - (local300 >>> 8);
				}
				local36 += local48;
				local38 += local50;
			}
		} else if (arg2 == 2) {
			local65 = arg3 >>> 24;
			local201 = 256 - local65;
			local284 = (arg3 & 0xFF00FF) * local201 & 0xFF00FF00;
			local287 = (arg3 & 0xFF00) * local201 & 0xFF0000;
			local448 = (local284 | local287) >>> 8;
			for (local292 = -local41; local292 < 0; local292++) {
				for (local300 = -local44; local300 < 0; local300++) {
					local308 = this.anIntArray219[local38++];
					local284 = (local308 & 0xFF00FF) * local65 & 0xFF00FF00;
					local287 = (local308 & 0xFF00) * local65 & 0xFF0000;
					local11[local36++] = ((local284 | local287) >>> 8) + local448;
				}
				local36 += local48;
				local38 += local50;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!app", name = "x", descriptor = "(IILclient!cg;II)V")
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
				@Pc(339) int local339 = this.anIntArray219[local26++];
				@Pc(343) int local343 = local339 >>> 24;
				@Pc(347) int local347 = 256 - local343;
				@Pc(351) int local351 = local11[local50];
				local11[local50++] = ((local339 & 0xFF00FF) * local343 + (local351 & 0xFF00FF) * local347 & 0xFF00FF00) + ((local339 & 0xFF00) * local343 + (local351 & 0xFF00) * local347 & 0xFF0000) >> 8;
			}
			local26 += local263 + local44;
			local50 += local263 + local42;
		}
	}

	@OriginalMember(owner = "client!app", name = "q", descriptor = "(IIIIIIII)V")
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
				@Pc(351) int local351;
				@Pc(360) int local360;
				@Pc(363) int local363;
				@Pc(374) int local374;
				@Pc(382) int local382;
				@Pc(390) int local390;
				@Pc(398) int local398;
				@Pc(546) int local546;
				if (arg6 != 0) {
					@Pc(906) int local906;
					@Pc(914) int local914;
					@Pc(926) int local926;
					if (arg6 != 1) {
						if (arg6 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg4 == 1) {
							local197 = local21;
							for (local283 = -arg3; local283 < 0; local283++) {
								local292 = (local23 >> 16) * this.anInt2554;
								for (local295 = -arg2; local295 < 0; local295++) {
									local351 = this.anIntArray219[(local21 >> 16) + local292];
									if (local351 == 0) {
										local73++;
									} else {
										local360 = local16[local73];
										local363 = local351 + local360;
										local374 = (local351 & 0xFF00FF) + (local360 & 0xFF00FF);
										local360 = (local374 & 0x1000100) + (local363 - local374 & 0x10000);
										local16[local73++] = local363 - local360 | local360 - (local360 >>> 8);
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
							for (local351 = -arg3; local351 < 0; local351++) {
								local360 = (local23 >> 16) * this.anInt2554;
								for (local363 = -arg2; local363 < 0; local363++) {
									local374 = this.anIntArray219[(local21 >> 16) + local360];
									if (local374 == 0) {
										local73++;
									} else {
										local382 = (local374 & 0xFF0000) * local283 & 0xFF000000;
										local390 = (local374 & 0xFF00) * local292 & 0xFF0000;
										local398 = (local374 & 0xFF) * local295 & 0xFF00;
										local374 = (local382 | local390 | local398) >>> 8;
										local906 = local16[local73];
										local914 = local374 + local906;
										local926 = (local374 & 0xFF00FF) + (local906 & 0xFF00FF);
										local906 = (local926 & 0x1000100) + (local914 - local926 & 0x10000);
										local16[local73++] = local914 - local906 | local906 - (local906 >>> 8);
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
									local351 = this.anIntArray219[(local21 >> 16) + local292];
									local360 = local351 + arg5;
									local363 = (local351 & 0xFF00FF) + (arg5 & 0xFF00FF);
									local374 = (local363 & 0x1000100) + (local360 - local363 & 0x10000);
									local351 = local360 - local374 | local374 - (local374 >>> 8);
									local374 = local16[local73];
									local360 = local351 + local374;
									local363 = (local351 & 0xFF00FF) + (local374 & 0xFF00FF);
									local374 = (local363 & 0x1000100) + (local360 - local363 & 0x10000);
									local16[local73++] = local360 - local374 | local374 - (local374 >>> 8);
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
							local546 = (local292 | local295) >>> 8;
							local351 = local21;
							for (local360 = -arg3; local360 < 0; local360++) {
								local363 = (local23 >> 16) * this.anInt2554;
								for (local374 = -arg2; local374 < 0; local374++) {
									local382 = this.anIntArray219[(local21 >> 16) + local363];
									if (local382 == 0) {
										local73++;
									} else {
										local292 = (local382 & 0xFF00FF) * local197 & 0xFF00FF00;
										local295 = (local382 & 0xFF00) * local197 & 0xFF0000;
										local382 = ((local292 | local295) >>> 8) + local546;
										local390 = local16[local73];
										local398 = local382 + local390;
										local906 = (local382 & 0xFF00FF) + (local390 & 0xFF00FF);
										local390 = (local906 & 0x1000100) + (local398 - local906 & 0x10000);
										local16[local73++] = local398 - local390 | local390 - (local390 >>> 8);
									}
									local21 += local53;
								}
								local23 += local59;
								local21 = local351;
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
								local351 = this.anIntArray219[(local21 >> 16) + local292];
								local360 = local351 >>> 24;
								local363 = 256 - local360;
								local374 = local16[local73];
								local16[local73++] = ((local351 & 0xFF00FF) * local360 + (local374 & 0xFF00FF) * local363 >> 8 & 0xFFFF00FF) + (((local351 & 0xFF00FF00) >>> 8) * local360 + ((local374 & 0xFF00FF00) >>> 8) * local363 & 0xFF00FF00);
								local21 += local53;
							}
							local23 += local59;
							local21 = local197;
							local73 += local161;
						}
					} else if (arg4 == 0) {
						local197 = local21;
						if ((arg5 & 0xFFFFFF) == 16777215) {
							for (local283 = -arg3; local283 < 0; local283++) {
								local292 = (local23 >> 16) * this.anInt2554;
								for (local295 = -arg2; local295 < 0; local295++) {
									local351 = this.anIntArray219[(local21 >> 16) + local292];
									local360 = (local351 >>> 24) * (arg5 >>> 24) >> 8;
									local363 = 256 - local360;
									local374 = local16[local73];
									local16[local73++] = ((local351 & 0xFF00FF) * local360 + (local374 & 0xFF00FF) * local363 & 0xFF00FF00) + ((local351 & 0xFF00) * local360 + (local374 & 0xFF00) * local363 & 0xFF0000) >> 8;
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
							for (local351 = -arg3; local351 < 0; local351++) {
								local360 = (local23 >> 16) * this.anInt2554;
								for (local363 = -arg2; local363 < 0; local363++) {
									local374 = this.anIntArray219[(local21 >> 16) + local360];
									local382 = (local374 >>> 24) * (arg5 >>> 24) >> 8;
									local390 = 256 - local382;
									if (local382 == 255) {
										local398 = (local374 & 0xFF0000) * local283 & 0xFF000000;
										local906 = (local374 & 0xFF00) * local292 & 0xFF0000;
										local914 = (local374 & 0xFF) * local295 & 0xFF00;
										local16[local73++] = (local398 | local906 | local914) >>> 8;
									} else {
										local398 = (local374 & 0xFF0000) * local283 & 0xFF000000;
										local906 = (local374 & 0xFF00) * local292 & 0xFF0000;
										local914 = (local374 & 0xFF) * local295 & 0xFF00;
										local374 = (local398 | local906 | local914) >>> 8;
										local926 = local16[local73];
										local16[local73++] = ((local374 & 0xFF00FF) * local382 + (local926 & 0xFF00FF) * local390 & 0xFF00FF00) + ((local374 & 0xFF00) * local382 + (local926 & 0xFF00) * local390 & 0xFF0000) >> 8;
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
						for (local283 = -arg3; local283 < 0; local283++) {
							local292 = (local23 >> 16) * this.anInt2554;
							for (local295 = -arg2; local295 < 0; local295++) {
								local351 = this.anIntArray219[(local21 >> 16) + local292];
								local360 = local351 + arg5;
								local363 = (local351 & 0xFF00FF) + (arg5 & 0xFF00FF);
								local374 = (local363 & 0x1000100) + (local360 - local363 & 0x10000);
								local374 = local360 - local374 | local374 - (local374 >>> 8);
								local382 = (local374 >>> 24) * (arg5 >>> 24) >> 8;
								local390 = 256 - local382;
								if (local382 != 255) {
									local351 = local374;
									local374 = local16[local73];
									local374 = ((local351 & 0xFF00FF) * local382 + (local374 & 0xFF00FF) * local390 & 0xFF00FF00) + ((local351 & 0xFF00) * local382 + (local374 & 0xFF00) * local390 & 0xFF0000) >> 8;
								}
								local16[local73++] = local374;
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
						local546 = (local292 | local295) >>> 8;
						local351 = local21;
						for (local360 = -arg3; local360 < 0; local360++) {
							local363 = (local23 >> 16) * this.anInt2554;
							for (local374 = -arg2; local374 < 0; local374++) {
								local382 = this.anIntArray219[(local21 >> 16) + local363];
								local390 = local382 >>> 24;
								local398 = 256 - local390;
								local292 = (local382 & 0xFF00FF) * local197 & 0xFF00FF00;
								local295 = (local382 & 0xFF00) * local197 & 0xFF0000;
								local382 = ((local292 | local295) >>> 8) + local546;
								local906 = local16[local73];
								local16[local73++] = ((local382 & 0xFF00FF) * local390 + (local906 & 0xFF00FF) * local398 & 0xFF00FF00) + ((local382 & 0xFF00) * local390 + (local906 & 0xFF00) * local398 & 0xFF0000) >> 8;
								local21 += local53;
							}
							local23 += local59;
							local21 = local351;
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
							local16[local73++] = this.anIntArray219[(local21 >> 16) + local292];
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
					for (local351 = -arg3; local351 < 0; local351++) {
						local360 = (local23 >> 16) * this.anInt2554;
						for (local363 = -arg2; local363 < 0; local363++) {
							local374 = this.anIntArray219[(local21 >> 16) + local360];
							local382 = (local374 & 0xFF0000) * local197 & 0xFF000000;
							local390 = (local374 & 0xFF00) * local283 & 0xFF0000;
							local398 = (local374 & 0xFF) * local292 & 0xFF00;
							local16[local73++] = (local382 | local390 | local398) >>> 8;
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
							local351 = this.anIntArray219[(local21 >> 16) + local292];
							local360 = local351 + arg5;
							local363 = (local351 & 0xFF00FF) + (arg5 & 0xFF00FF);
							local374 = (local363 & 0x1000100) + (local360 - local363 & 0x10000);
							local16[local73++] = local360 - local374 | local374 - (local374 >>> 8);
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
					local546 = (local292 | local295) >>> 8;
					local351 = local21;
					for (local360 = -arg3; local360 < 0; local360++) {
						local363 = (local23 >> 16) * this.anInt2554;
						for (local374 = -arg2; local374 < 0; local374++) {
							local382 = this.anIntArray219[(local21 >> 16) + local363];
							local292 = (local382 & 0xFF00FF) * local197 & 0xFF00FF00;
							local295 = (local382 & 0xFF00) * local197 & 0xFF0000;
							local16[local73++] = ((local292 | local295) >>> 8) + local546;
							local21 += local53;
						}
						local23 += local59;
						local21 = local351;
						local73 += local161;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		}
	}

	@OriginalMember(owner = "client!app", name = "cy", descriptor = "(ZZZIIFIIIIIIZ)V")
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
		@Pc(373) int local373;
		@Pc(382) int local382;
		@Pc(385) int local385;
		@Pc(406) int local406;
		@Pc(414) int local414;
		@Pc(422) int local422;
		@Pc(430) int local430;
		@Pc(604) int local604;
		if (arg10 != 0) {
			@Pc(1028) int local1028;
			@Pc(1036) int local1036;
			@Pc(1048) int local1048;
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
								local373 = this.anIntArray219[(local11 >> 16) + local296];
								if (local373 != 0) {
									if (arg0) {
										local382 = local277[local57];
										local385 = local373 + local382;
										local406 = (local373 & 0xFF00FF) + (local382 & 0xFF00FF);
										local382 = (local406 & 0x1000100) + (local385 - local406 & 0x10000);
										local277[local57] = local385 - local382 | local382 - (local382 >>> 8);
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
					for (local373 = -arg7; local373 < 0; local373++) {
						local382 = (local13 >> 16) * this.anInt2554;
						for (local385 = -arg6; local385 < 0; local385++) {
							if (!arg1 || arg5 < local273[local57]) {
								local406 = this.anIntArray219[(local11 >> 16) + local382];
								if (local406 != 0) {
									if (arg0) {
										local414 = (local406 & 0xFF0000) * local287 & 0xFF000000;
										local422 = (local406 & 0xFF00) * local296 & 0xFF0000;
										local430 = (local406 & 0xFF) * local299 & 0xFF00;
										local406 = (local414 | local422 | local430) >>> 8;
										local1028 = local277[local57];
										local1036 = local406 + local1028;
										local1048 = (local406 & 0xFF00FF) + (local1028 & 0xFF00FF);
										local1028 = (local1048 & 0x1000100) + (local1036 - local1048 & 0x10000);
										local277[local57] = local1036 - local1028 | local1028 - (local1028 >>> 8);
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
									local373 = this.anIntArray219[(local11 >> 16) + local296];
									local382 = local373 + arg9;
									local385 = (local373 & 0xFF00FF) + (arg9 & 0xFF00FF);
									local406 = (local385 & 0x1000100) + (local382 - local385 & 0x10000);
									local373 = local382 - local406 | local406 - (local406 >>> 8);
									local406 = local277[local57];
									local382 = local373 + local406;
									local385 = (local373 & 0xFF00FF) + (local406 & 0xFF00FF);
									local406 = (local385 & 0x1000100) + (local382 - local385 & 0x10000);
									local277[local57] = local382 - local406 | local406 - (local406 >>> 8);
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
					local604 = (local296 | local299) >>> 8;
					local373 = local11;
					for (local382 = -arg7; local382 < 0; local382++) {
						local385 = (local13 >> 16) * this.anInt2554;
						for (local406 = -arg6; local406 < 0; local406++) {
							if (!arg1 || arg5 < local273[local57]) {
								local414 = this.anIntArray219[(local11 >> 16) + local385];
								if (local414 != 0) {
									if (arg0) {
										local296 = (local414 & 0xFF00FF) * local284 & 0xFF00FF00;
										local299 = (local414 & 0xFF00) * local284 & 0xFF0000;
										local414 = ((local296 | local299) >>> 8) + local604;
										local422 = local277[local57];
										local430 = local414 + local422;
										local1028 = (local414 & 0xFF00FF) + (local422 & 0xFF00FF);
										local422 = (local1028 & 0x1000100) + (local430 - local1028 & 0x10000);
										local277[local57] = local430 - local422 | local422 - (local422 >>> 8);
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
						local11 = local373;
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
							if (arg0) {
								local373 = this.anIntArray219[(local11 >> 16) + local296];
								local382 = local373 >>> 24;
								local385 = 256 - local382;
								local406 = local277[local57];
								local277[local57] = ((local373 & 0xFF00FF) * local382 + (local406 & 0xFF00FF) * local385 >> 8 & 0xFFFF00FF) + (((local373 & 0xFF00FF00) >>> 8) * local382 + ((local406 & 0xFF00FF00) >>> 8) * local385 & 0xFF00FF00);
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
				local284 = local11;
				if ((arg9 & 0xFFFFFF) == 16777215) {
					for (local287 = -arg7; local287 < 0; local287++) {
						local296 = (local13 >> 16) * this.anInt2554;
						for (local299 = -arg6; local299 < 0; local299++) {
							if (!arg1 || arg5 < local273[local57]) {
								if (arg0) {
									local373 = this.anIntArray219[(local11 >> 16) + local296];
									local382 = (local373 >>> 24) * (arg9 >>> 24) >> 8;
									local385 = 256 - local382;
									local406 = local277[local57];
									local277[local57] = ((local373 & 0xFF00FF) * local382 + (local406 & 0xFF00FF) * local385 & 0xFF00FF00) + ((local373 & 0xFF00) * local382 + (local406 & 0xFF00) * local385 & 0xFF0000) >> 8;
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
				} else {
					local287 = arg9 >> 16 & 0xFF;
					local296 = arg9 >> 8 & 0xFF;
					local299 = arg9 & 0xFF;
					for (local373 = -arg7; local373 < 0; local373++) {
						local382 = (local13 >> 16) * this.anInt2554;
						for (local385 = -arg6; local385 < 0; local385++) {
							if (!arg1 || arg5 < local273[local57]) {
								local406 = this.anIntArray219[(local11 >> 16) + local382];
								local414 = (local406 >>> 24) * (arg9 >>> 24) >> 8;
								local422 = 256 - local414;
								if (local414 == 255) {
									if (arg0) {
										local430 = (local406 & 0xFF0000) * local287 & 0xFF000000;
										local1028 = (local406 & 0xFF00) * local296 & 0xFF0000;
										local1036 = (local406 & 0xFF) * local299 & 0xFF00;
										local277[local57] = (local430 | local1028 | local1036) >>> 8;
									}
									if (arg1 && arg12) {
										local273[local57] = arg5;
									}
								} else {
									if (arg0) {
										local430 = (local406 & 0xFF0000) * local287 & 0xFF000000;
										local1028 = (local406 & 0xFF00) * local296 & 0xFF0000;
										local1036 = (local406 & 0xFF) * local299 & 0xFF00;
										local406 = (local430 | local1028 | local1036) >>> 8;
										local1048 = local277[local57];
										local277[local57] = ((local406 & 0xFF00FF) * local414 + (local1048 & 0xFF00FF) * local422 & 0xFF00FF00) + ((local406 & 0xFF00) * local414 + (local1048 & 0xFF00) * local422 & 0xFF0000) >> 8;
										if (arg2) {
											@Pc(1088) int local1088 = (local1048 >>> 24) + local414;
											if (local1088 > 255) {
												local1088 = 255;
											}
											local277[local57] |= local1088 << 24;
										}
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
				}
			} else if (arg8 == 3) {
				local284 = local11;
				for (local287 = -arg7; local287 < 0; local287++) {
					local296 = (local13 >> 16) * this.anInt2554;
					for (local299 = -arg6; local299 < 0; local299++) {
						if (!arg1 || arg5 < local273[local57]) {
							if (arg0) {
								local373 = this.anIntArray219[(local11 >> 16) + local296];
								local382 = local373 + arg9;
								local385 = (local373 & 0xFF00FF) + (arg9 & 0xFF00FF);
								local406 = (local385 & 0x1000100) + (local382 - local385 & 0x10000);
								local406 = local382 - local406 | local406 - (local406 >>> 8);
								local414 = (local406 >>> 24) * (arg9 >>> 24) >> 8;
								local422 = 256 - local414;
								if (local414 != 255) {
									local373 = local406;
									local406 = local277[local57];
									local406 = ((local373 & 0xFF00FF) * local414 + (local406 & 0xFF00FF) * local422 & 0xFF00FF00) + ((local373 & 0xFF00) * local414 + (local406 & 0xFF00) * local422 & 0xFF0000) >> 8;
								}
								local277[local57] = local406;
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
				local604 = (local296 | local299) >>> 8;
				local373 = local11;
				for (local382 = -arg7; local382 < 0; local382++) {
					local385 = (local13 >> 16) * this.anInt2554;
					for (local406 = -arg6; local406 < 0; local406++) {
						if (!arg1 || arg5 < local273[local57]) {
							if (arg0) {
								local414 = this.anIntArray219[(local11 >> 16) + local385];
								local422 = local414 >>> 24;
								local430 = 256 - local422;
								local296 = (local414 & 0xFF00FF) * local284 & 0xFF00FF00;
								local299 = (local414 & 0xFF00) * local284 & 0xFF0000;
								local414 = ((local296 | local299) >>> 8) + local604;
								local1028 = local277[local57];
								local277[local57] = ((local414 & 0xFF00FF) * local422 + (local1028 & 0xFF00FF) * local430 & 0xFF00FF00) + ((local414 & 0xFF00) * local422 + (local1028 & 0xFF00) * local430 & 0xFF0000) >> 8;
							}
							if (arg1 && arg12) {
								local273[local57] = arg5;
							}
						}
						local11 += local37;
						local57++;
					}
					local13 += local43;
					local11 = local373;
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
						if (arg0) {
							local277[local57] = this.anIntArray219[(local11 >> 16) + local296];
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
			for (local373 = -arg7; local373 < 0; local373++) {
				local382 = (local13 >> 16) * this.anInt2554;
				for (local385 = -arg6; local385 < 0; local385++) {
					if (!arg1 || arg5 < local273[local57]) {
						if (arg0) {
							local406 = this.anIntArray219[(local11 >> 16) + local382];
							local414 = (local406 & 0xFF0000) * local284 & 0xFF000000;
							local422 = (local406 & 0xFF00) * local287 & 0xFF0000;
							local430 = (local406 & 0xFF) * local296 & 0xFF00;
							local277[local57] = (local414 | local422 | local430) >>> 8;
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
							local373 = this.anIntArray219[(local11 >> 16) + local296];
							local382 = local373 + arg9;
							local385 = (local373 & 0xFF00FF) + (arg9 & 0xFF00FF);
							local406 = (local385 & 0x1000100) + (local382 - local385 & 0x10000);
							local277[local57] = local382 - local406 | local406 - (local406 >>> 8);
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
			local604 = (local296 | local299) >>> 8;
			local373 = local11;
			for (local382 = -arg7; local382 < 0; local382++) {
				local385 = (local13 >> 16) * this.anInt2554;
				for (local406 = -arg6; local406 < 0; local406++) {
					if (!arg1 || arg5 < local273[local57]) {
						if (arg0) {
							local414 = this.anIntArray219[(local11 >> 16) + local385];
							local296 = (local414 & 0xFF00FF) * local284 & 0xFF00FF00;
							local299 = (local414 & 0xFF00) * local284 & 0xFF0000;
							local277[local57] = ((local296 | local299) >>> 8) + local604;
						}
						if (arg1 && arg12) {
							local273[local57] = arg5;
						}
					}
					local11 += local37;
					local57++;
				}
				local13 += local43;
				local11 = local373;
				local57 += local153;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!app", name = "cc", descriptor = "(II)V")
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
		@Pc(114) int local114;
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
							this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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
						@Pc(107) int local107;
						if ((local107 = local20 - (this.anInt2559 << 12)) >= 0) {
							local114 = (anInt2576 - local107) / anInt2576;
							local22 += local114;
							local20 += anInt2576 * local114;
							local16 += local114;
						}
						@Pc(135) int local135;
						if ((local135 = (local20 - anInt2576) / anInt2576) > local22) {
							local22 = local135;
						}
						while (local22 < 0) {
							this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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
							local114 = (anInt2576 - 1 - local20) / anInt2576;
							local22 += local114;
							local20 += anInt2576 * local114;
							local16 += local114;
						}
						@Pc(238) int local238;
						if ((local238 = (local20 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local22) {
							local22 = local238;
						}
						while (local22 < 0) {
							this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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
						@Pc(315) int local315;
						if ((local315 = local18 - (this.anInt2554 << 12)) >= 0) {
							local114 = (anInt2568 - local315) / anInt2568;
							local22 += local114;
							local18 += anInt2568 * local114;
							local16 += local114;
						}
						@Pc(343) int local343;
						if ((local343 = (local18 - anInt2568) / anInt2568) > local22) {
							local22 = local343;
						}
						while (local22 < 0) {
							this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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
					@Pc(409) int local409;
					if ((local409 = local18 - (this.anInt2554 << 12)) >= 0) {
						local114 = (anInt2568 - local409) / anInt2568;
						local22 += local114;
						local18 += anInt2568 * local114;
						local20 += anInt2576 * local114;
						local16 += local114;
					}
					@Pc(443) int local443;
					if ((local443 = (local18 - anInt2568) / anInt2568) > local22) {
						local22 = local443;
					}
					@Pc(455) int local455;
					if ((local455 = local20 - (this.anInt2559 << 12)) >= 0) {
						local114 = (anInt2576 - local455) / anInt2576;
						local22 += local114;
						local18 += anInt2568 * local114;
						local20 += anInt2576 * local114;
						local16 += local114;
					}
					@Pc(489) int local489;
					if ((local489 = (local20 - anInt2576) / anInt2576) > local22) {
						local22 = local489;
					}
					while (local22 < 0) {
						this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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
					@Pc(561) int local561;
					if ((local561 = local18 - (this.anInt2554 << 12)) >= 0) {
						local114 = (anInt2568 - local561) / anInt2568;
						local22 += local114;
						local18 += anInt2568 * local114;
						local20 += anInt2576 * local114;
						local16 += local114;
					}
					@Pc(595) int local595;
					if ((local595 = (local18 - anInt2568) / anInt2568) > local22) {
						local22 = local595;
					}
					if (local20 < 0) {
						local114 = (anInt2576 - 1 - local20) / anInt2576;
						local22 += local114;
						local18 += anInt2568 * local114;
						local20 += anInt2576 * local114;
						local16 += local114;
					}
					@Pc(643) int local643;
					if ((local643 = (local20 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local22) {
						local22 = local643;
					}
					while (local22 < 0) {
						this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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
						local114 = (anInt2568 - 1 - local18) / anInt2568;
						local22 += local114;
						local18 += anInt2568 * local114;
						local16 += local114;
					}
					@Pc(756) int local756;
					if ((local756 = (local18 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local22) {
						local22 = local756;
					}
					while (local22 < 0) {
						this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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
					local114 = (anInt2568 - 1 - local18) / anInt2568;
					local22 += local114;
					local18 += anInt2568 * local114;
					local20 += anInt2576 * local114;
					local16 += local114;
				}
				@Pc(862) int local862;
				if ((local862 = (local18 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local22) {
					local22 = local862;
				}
				@Pc(874) int local874;
				if ((local874 = local20 - (this.anInt2559 << 12)) >= 0) {
					local114 = (anInt2576 - local874) / anInt2576;
					local22 += local114;
					local18 += anInt2568 * local114;
					local20 += anInt2576 * local114;
					local16 += local114;
				}
				@Pc(908) int local908;
				if ((local908 = (local20 - anInt2576) / anInt2576) > local22) {
					local22 = local908;
				}
				while (local22 < 0) {
					this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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
					local114 = (anInt2568 - 1 - local18) / anInt2568;
					local22 += local114;
					local18 += anInt2568 * local114;
					local20 += anInt2576 * local114;
					local16 += local114;
				}
				@Pc(1016) int local1016;
				if ((local1016 = (local18 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local22) {
					local22 = local1016;
				}
				if (local20 < 0) {
					local114 = (anInt2576 - 1 - local20) / anInt2576;
					local22 += local114;
					local18 += anInt2568 * local114;
					local20 += anInt2576 * local114;
					local16 += local114;
				}
				@Pc(1064) int local1064;
				if ((local1064 = (local20 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local22) {
					local22 = local1064;
				}
				while (local22 < 0) {
					this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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

	@OriginalMember(owner = "client!app", name = "ce", descriptor = "(ZZZIIFIIIIIIZ)V")
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
		@Pc(373) int local373;
		@Pc(382) int local382;
		@Pc(385) int local385;
		@Pc(406) int local406;
		@Pc(414) int local414;
		@Pc(422) int local422;
		@Pc(430) int local430;
		@Pc(604) int local604;
		if (arg10 != 0) {
			@Pc(1028) int local1028;
			@Pc(1036) int local1036;
			@Pc(1048) int local1048;
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
								local373 = this.anIntArray219[(local11 >> 16) + local296];
								if (local373 != 0) {
									if (arg0) {
										local382 = local277[local57];
										local385 = local373 + local382;
										local406 = (local373 & 0xFF00FF) + (local382 & 0xFF00FF);
										local382 = (local406 & 0x1000100) + (local385 - local406 & 0x10000);
										local277[local57] = local385 - local382 | local382 - (local382 >>> 8);
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
					for (local373 = -arg7; local373 < 0; local373++) {
						local382 = (local13 >> 16) * this.anInt2554;
						for (local385 = -arg6; local385 < 0; local385++) {
							if (!arg1 || arg5 < local273[local57]) {
								local406 = this.anIntArray219[(local11 >> 16) + local382];
								if (local406 != 0) {
									if (arg0) {
										local414 = (local406 & 0xFF0000) * local287 & 0xFF000000;
										local422 = (local406 & 0xFF00) * local296 & 0xFF0000;
										local430 = (local406 & 0xFF) * local299 & 0xFF00;
										local406 = (local414 | local422 | local430) >>> 8;
										local1028 = local277[local57];
										local1036 = local406 + local1028;
										local1048 = (local406 & 0xFF00FF) + (local1028 & 0xFF00FF);
										local1028 = (local1048 & 0x1000100) + (local1036 - local1048 & 0x10000);
										local277[local57] = local1036 - local1028 | local1028 - (local1028 >>> 8);
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
									local373 = this.anIntArray219[(local11 >> 16) + local296];
									local382 = local373 + arg9;
									local385 = (local373 & 0xFF00FF) + (arg9 & 0xFF00FF);
									local406 = (local385 & 0x1000100) + (local382 - local385 & 0x10000);
									local373 = local382 - local406 | local406 - (local406 >>> 8);
									local406 = local277[local57];
									local382 = local373 + local406;
									local385 = (local373 & 0xFF00FF) + (local406 & 0xFF00FF);
									local406 = (local385 & 0x1000100) + (local382 - local385 & 0x10000);
									local277[local57] = local382 - local406 | local406 - (local406 >>> 8);
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
					local604 = (local296 | local299) >>> 8;
					local373 = local11;
					for (local382 = -arg7; local382 < 0; local382++) {
						local385 = (local13 >> 16) * this.anInt2554;
						for (local406 = -arg6; local406 < 0; local406++) {
							if (!arg1 || arg5 < local273[local57]) {
								local414 = this.anIntArray219[(local11 >> 16) + local385];
								if (local414 != 0) {
									if (arg0) {
										local296 = (local414 & 0xFF00FF) * local284 & 0xFF00FF00;
										local299 = (local414 & 0xFF00) * local284 & 0xFF0000;
										local414 = ((local296 | local299) >>> 8) + local604;
										local422 = local277[local57];
										local430 = local414 + local422;
										local1028 = (local414 & 0xFF00FF) + (local422 & 0xFF00FF);
										local422 = (local1028 & 0x1000100) + (local430 - local1028 & 0x10000);
										local277[local57] = local430 - local422 | local422 - (local422 >>> 8);
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
						local11 = local373;
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
							if (arg0) {
								local373 = this.anIntArray219[(local11 >> 16) + local296];
								local382 = local373 >>> 24;
								local385 = 256 - local382;
								local406 = local277[local57];
								local277[local57] = ((local373 & 0xFF00FF) * local382 + (local406 & 0xFF00FF) * local385 >> 8 & 0xFFFF00FF) + (((local373 & 0xFF00FF00) >>> 8) * local382 + ((local406 & 0xFF00FF00) >>> 8) * local385 & 0xFF00FF00);
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
				local284 = local11;
				if ((arg9 & 0xFFFFFF) == 16777215) {
					for (local287 = -arg7; local287 < 0; local287++) {
						local296 = (local13 >> 16) * this.anInt2554;
						for (local299 = -arg6; local299 < 0; local299++) {
							if (!arg1 || arg5 < local273[local57]) {
								if (arg0) {
									local373 = this.anIntArray219[(local11 >> 16) + local296];
									local382 = (local373 >>> 24) * (arg9 >>> 24) >> 8;
									local385 = 256 - local382;
									local406 = local277[local57];
									local277[local57] = ((local373 & 0xFF00FF) * local382 + (local406 & 0xFF00FF) * local385 & 0xFF00FF00) + ((local373 & 0xFF00) * local382 + (local406 & 0xFF00) * local385 & 0xFF0000) >> 8;
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
				} else {
					local287 = arg9 >> 16 & 0xFF;
					local296 = arg9 >> 8 & 0xFF;
					local299 = arg9 & 0xFF;
					for (local373 = -arg7; local373 < 0; local373++) {
						local382 = (local13 >> 16) * this.anInt2554;
						for (local385 = -arg6; local385 < 0; local385++) {
							if (!arg1 || arg5 < local273[local57]) {
								local406 = this.anIntArray219[(local11 >> 16) + local382];
								local414 = (local406 >>> 24) * (arg9 >>> 24) >> 8;
								local422 = 256 - local414;
								if (local414 == 255) {
									if (arg0) {
										local430 = (local406 & 0xFF0000) * local287 & 0xFF000000;
										local1028 = (local406 & 0xFF00) * local296 & 0xFF0000;
										local1036 = (local406 & 0xFF) * local299 & 0xFF00;
										local277[local57] = (local430 | local1028 | local1036) >>> 8;
									}
									if (arg1 && arg12) {
										local273[local57] = arg5;
									}
								} else {
									if (arg0) {
										local430 = (local406 & 0xFF0000) * local287 & 0xFF000000;
										local1028 = (local406 & 0xFF00) * local296 & 0xFF0000;
										local1036 = (local406 & 0xFF) * local299 & 0xFF00;
										local406 = (local430 | local1028 | local1036) >>> 8;
										local1048 = local277[local57];
										local277[local57] = ((local406 & 0xFF00FF) * local414 + (local1048 & 0xFF00FF) * local422 & 0xFF00FF00) + ((local406 & 0xFF00) * local414 + (local1048 & 0xFF00) * local422 & 0xFF0000) >> 8;
										if (arg2) {
											@Pc(1088) int local1088 = (local1048 >>> 24) + local414;
											if (local1088 > 255) {
												local1088 = 255;
											}
											local277[local57] |= local1088 << 24;
										}
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
				}
			} else if (arg8 == 3) {
				local284 = local11;
				for (local287 = -arg7; local287 < 0; local287++) {
					local296 = (local13 >> 16) * this.anInt2554;
					for (local299 = -arg6; local299 < 0; local299++) {
						if (!arg1 || arg5 < local273[local57]) {
							if (arg0) {
								local373 = this.anIntArray219[(local11 >> 16) + local296];
								local382 = local373 + arg9;
								local385 = (local373 & 0xFF00FF) + (arg9 & 0xFF00FF);
								local406 = (local385 & 0x1000100) + (local382 - local385 & 0x10000);
								local406 = local382 - local406 | local406 - (local406 >>> 8);
								local414 = (local406 >>> 24) * (arg9 >>> 24) >> 8;
								local422 = 256 - local414;
								if (local414 != 255) {
									local373 = local406;
									local406 = local277[local57];
									local406 = ((local373 & 0xFF00FF) * local414 + (local406 & 0xFF00FF) * local422 & 0xFF00FF00) + ((local373 & 0xFF00) * local414 + (local406 & 0xFF00) * local422 & 0xFF0000) >> 8;
								}
								local277[local57] = local406;
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
				local604 = (local296 | local299) >>> 8;
				local373 = local11;
				for (local382 = -arg7; local382 < 0; local382++) {
					local385 = (local13 >> 16) * this.anInt2554;
					for (local406 = -arg6; local406 < 0; local406++) {
						if (!arg1 || arg5 < local273[local57]) {
							if (arg0) {
								local414 = this.anIntArray219[(local11 >> 16) + local385];
								local422 = local414 >>> 24;
								local430 = 256 - local422;
								local296 = (local414 & 0xFF00FF) * local284 & 0xFF00FF00;
								local299 = (local414 & 0xFF00) * local284 & 0xFF0000;
								local414 = ((local296 | local299) >>> 8) + local604;
								local1028 = local277[local57];
								local277[local57] = ((local414 & 0xFF00FF) * local422 + (local1028 & 0xFF00FF) * local430 & 0xFF00FF00) + ((local414 & 0xFF00) * local422 + (local1028 & 0xFF00) * local430 & 0xFF0000) >> 8;
							}
							if (arg1 && arg12) {
								local273[local57] = arg5;
							}
						}
						local11 += local37;
						local57++;
					}
					local13 += local43;
					local11 = local373;
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
						if (arg0) {
							local277[local57] = this.anIntArray219[(local11 >> 16) + local296];
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
			for (local373 = -arg7; local373 < 0; local373++) {
				local382 = (local13 >> 16) * this.anInt2554;
				for (local385 = -arg6; local385 < 0; local385++) {
					if (!arg1 || arg5 < local273[local57]) {
						if (arg0) {
							local406 = this.anIntArray219[(local11 >> 16) + local382];
							local414 = (local406 & 0xFF0000) * local284 & 0xFF000000;
							local422 = (local406 & 0xFF00) * local287 & 0xFF0000;
							local430 = (local406 & 0xFF) * local296 & 0xFF00;
							local277[local57] = (local414 | local422 | local430) >>> 8;
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
							local373 = this.anIntArray219[(local11 >> 16) + local296];
							local382 = local373 + arg9;
							local385 = (local373 & 0xFF00FF) + (arg9 & 0xFF00FF);
							local406 = (local385 & 0x1000100) + (local382 - local385 & 0x10000);
							local277[local57] = local382 - local406 | local406 - (local406 >>> 8);
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
			local604 = (local296 | local299) >>> 8;
			local373 = local11;
			for (local382 = -arg7; local382 < 0; local382++) {
				local385 = (local13 >> 16) * this.anInt2554;
				for (local406 = -arg6; local406 < 0; local406++) {
					if (!arg1 || arg5 < local273[local57]) {
						if (arg0) {
							local414 = this.anIntArray219[(local11 >> 16) + local385];
							local296 = (local414 & 0xFF00FF) * local284 & 0xFF00FF00;
							local299 = (local414 & 0xFF00) * local284 & 0xFF0000;
							local277[local57] = ((local296 | local299) >>> 8) + local604;
						}
						if (arg1 && arg12) {
							local273[local57] = arg5;
						}
					}
					local11 += local37;
					local57++;
				}
				local13 += local43;
				local11 = local373;
				local57 += local153;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!app", name = "m", descriptor = "(IIII[III)V")
	@Override
	public void method18221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg6 - arg2;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			@Pc(16) int local16 = (arg1 + local5) * arg2 + arg0;
			for (@Pc(18) int local18 = 0; local18 < arg2; local18++) {
				this.anIntArray219[local16 + local18] = arg4[arg5++];
			}
			arg5 += local3;
		}
	}

	@OriginalMember(owner = "client!app", name = "co", descriptor = "(II[III)V")
	void method18312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(20) int local20;
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(44) int local44;
		@Pc(88) int local88;
		if (arg4 != 0) {
			@Pc(284) int local284;
			@Pc(296) int local296;
			if (arg4 != 1) {
				if (arg4 != 2) {
					throw new IllegalArgumentException();
				}
				if (arg3 == 1) {
					local20 = this.anIntArray219[arg0];
					local28 = arg2[arg1];
					local36 = local20 + local28;
					local44 = (local20 & 0xFF00FF) + (local28 & 0xFF00FF);
					local28 = (local44 & 0x1000100) + (local36 - local44 & 0x10000);
					arg2[arg1] = local36 - local28 | local28 - (local28 >>> 8);
				} else if (arg3 == 0) {
					local20 = this.anIntArray219[arg0];
					local28 = (local20 & 0xFF0000) * anInt2558 & 0xFF000000;
					local36 = (local20 & 0xFF00) * anInt2569 & 0xFF0000;
					local44 = (local20 & 0xFF) * anInt2583 & 0xFF00;
					local20 = (local28 | local36 | local44) >>> 8;
					local88 = arg2[arg1];
					local284 = local20 + local88;
					local296 = (local20 & 0xFF00FF) + (local88 & 0xFF00FF);
					local88 = (local296 & 0x1000100) + (local284 - local296 & 0x10000);
					arg2[arg1] = local284 - local88 | local88 - (local88 >>> 8);
				} else if (arg3 == 3) {
					local20 = this.anIntArray219[arg0];
					local28 = anInt2582;
					local36 = local20 + local28;
					local44 = (local20 & 0xFF00FF) + (local28 & 0xFF00FF);
					local88 = (local44 & 0x1000100) + (local36 - local44 & 0x10000);
					local20 = local36 - local88 | local88 - (local88 >>> 8);
					local88 = arg2[arg1];
					local36 = local20 + local88;
					local44 = (local20 & 0xFF00FF) + (local88 & 0xFF00FF);
					local88 = (local44 & 0x1000100) + (local36 - local44 & 0x10000);
					arg2[arg1] = local36 - local88 | local88 - (local88 >>> 8);
				} else if (arg3 == 2) {
					local20 = this.anIntArray219[arg0];
					local28 = (local20 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
					local36 = (local20 & 0xFF00) * anInt2578 & 0xFF0000;
					local20 = ((local28 | local36) >>> 8) + anInt2586;
					local44 = arg2[arg1];
					local88 = local20 + local44;
					local284 = (local20 & 0xFF00FF) + (local44 & 0xFF00FF);
					local44 = (local284 & 0x1000100) + (local88 - local284 & 0x10000);
					arg2[arg1] = local88 - local44 | local44 - (local44 >>> 8);
				}
			} else if (arg3 == 1) {
				local20 = this.anIntArray219[arg0];
				local28 = local20 >>> 24;
				local36 = 256 - local28;
				local44 = arg2[arg1];
				arg2[arg1] = ((local20 & 0xFF00FF) * local28 + (local44 & 0xFF00FF) * local36 & 0xFF00FF00) + ((local20 & 0xFF00) * local28 + (local44 & 0xFF00) * local36 & 0xFF0000) >> 8;
			} else if (arg3 == 0) {
				local20 = this.anIntArray219[arg0];
				local28 = (local20 >>> 24) * anInt2578 >> 8;
				local36 = 256 - local28;
				if ((anInt2582 & 0xFFFFFF) == 16777215) {
					local44 = arg2[arg1];
					arg2[arg1] = ((local20 & 0xFF00FF) * local28 + (local44 & 0xFF00FF) * local36 & 0xFF00FF00) + ((local20 & 0xFF00) * local28 + (local44 & 0xFF00) * local36 & 0xFF0000) >> 8;
				} else if (local28 == 255) {
					local44 = (local20 & 0xFF0000) * anInt2558 & 0xFF000000;
					local88 = (local20 & 0xFF00) * anInt2569 & 0xFF0000;
					local284 = (local20 & 0xFF) * anInt2583 & 0xFF00;
					arg2[arg1] = (local44 | local88 | local284) >>> 8;
				} else {
					local44 = (local20 & 0xFF0000) * anInt2558 & 0xFF000000;
					local88 = (local20 & 0xFF00) * anInt2569 & 0xFF0000;
					local284 = (local20 & 0xFF) * anInt2583 & 0xFF00;
					local20 = (local44 | local88 | local284) >>> 8;
					local296 = arg2[arg1];
					arg2[arg1] = ((local20 & 0xFF00FF) * local28 + (local296 & 0xFF00FF) * local36 & 0xFF00FF00) + ((local20 & 0xFF00) * local28 + (local296 & 0xFF00) * local36 & 0xFF0000) >> 8;
				}
			} else if (arg3 == 3) {
				local20 = this.anIntArray219[arg0];
				local28 = anInt2582;
				local36 = local20 + local28;
				local44 = (local20 & 0xFF00FF) + (local28 & 0xFF00FF);
				local88 = (local44 & 0x1000100) + (local36 - local44 & 0x10000);
				local88 = local36 - local88 | local88 - (local88 >>> 8);
				local284 = (local20 >>> 24) * anInt2578 >> 8;
				local296 = 256 - local284;
				if (local284 != 255) {
					local20 = local88;
					local88 = arg2[arg1];
					local88 = ((local20 & 0xFF00FF) * local284 + (local88 & 0xFF00FF) * local296 & 0xFF00FF00) + ((local20 & 0xFF00) * local284 + (local88 & 0xFF00) * local296 & 0xFF0000) >> 8;
				}
				arg2[arg1] = local88;
			} else if (arg3 == 2) {
				local20 = this.anIntArray219[arg0];
				local28 = local20 >>> 24;
				local36 = 256 - local28;
				local44 = (local20 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
				local88 = (local20 & 0xFF00) * anInt2578 & 0xFF0000;
				local20 = ((local44 | local88) >>> 8) + anInt2586;
				local284 = arg2[arg1];
				arg2[arg1] = ((local20 & 0xFF00FF) * local28 + (local284 & 0xFF00FF) * local36 & 0xFF00FF00) + ((local20 & 0xFF00) * local28 + (local284 & 0xFF00) * local36 & 0xFF0000) >> 8;
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg3 == 1) {
			arg2[arg1] = this.anIntArray219[arg0];
		} else {
			@Pc(18) int local18;
			@Pc(17) int local17;
			if (arg3 == 0) {
				local17 = arg0;
				local18 = arg0 + 1;
				local20 = this.anIntArray219[local17];
				local28 = (local20 & 0xFF0000) * anInt2558 & 0xFF000000;
				local36 = (local20 & 0xFF00) * anInt2569 & 0xFF0000;
				local44 = (local20 & 0xFF) * anInt2583 & 0xFF00;
				arg2[arg1] = (local28 | local36 | local44) >>> 8;
			} else if (arg3 == 3) {
				local17 = arg0;
				local18 = arg0 + 1;
				local20 = this.anIntArray219[local17];
				local28 = anInt2582;
				local36 = local20 + local28;
				local44 = (local20 & 0xFF00FF) + (local28 & 0xFF00FF);
				local88 = (local44 & 0x1000100) + (local36 - local44 & 0x10000);
				arg2[arg1] = local36 - local88 | local88 - (local88 >>> 8);
			} else if (arg3 == 2) {
				local20 = this.anIntArray219[arg0];
				local28 = (local20 & 0xFF00FF) * anInt2578 & 0xFF00FF00;
				local36 = (local20 & 0xFF00) * anInt2578 & 0xFF0000;
				arg2[arg1] = ((local28 | local36) >>> 8) + anInt2586;
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	@OriginalMember(owner = "client!app", name = "aj", descriptor = "(IIIIII)V")
	@Override
	public void method18233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int[] local3 = this.aClass102_Sub2_10.anIntArray50;
		if (local3 == null) {
			throw new IllegalStateException("");
		}
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			@Pc(23) int local23 = (arg1 + local12) * arg2 + arg0;
			@Pc(31) int local31 = (arg5 + local12) * arg2 + arg4;
			for (@Pc(33) int local33 = 0; local33 < arg2; local33++) {
				this.anIntArray219[local23 + local33] = local3[local31 + local33] & 0xFFFFFF;
			}
		}
	}

	@OriginalMember(owner = "client!app", name = "ac", descriptor = "(IIIIII)V")
	@Override
	public void method18246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int[] local3 = this.aClass102_Sub2_10.anIntArray50;
		if (local3 == null) {
			throw new IllegalStateException("");
		}
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			@Pc(23) int local23 = (arg1 + local12) * arg2 + arg0;
			@Pc(31) int local31 = (arg5 + local12) * arg2 + arg4;
			for (@Pc(33) int local33 = 0; local33 < arg2; local33++) {
				this.anIntArray219[local23 + local33] = local3[local31 + local33] & 0xFFFFFF;
			}
		}
	}

	@OriginalMember(owner = "client!app", name = "ag", descriptor = "(IIIIII)V")
	@Override
	public void method18248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int[] local3 = this.aClass102_Sub2_10.anIntArray50;
		if (local3 == null) {
			throw new IllegalStateException("");
		}
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			@Pc(23) int local23 = (arg1 + local12) * arg2 + arg0;
			@Pc(31) int local31 = (arg5 + local12) * arg2 + arg4;
			for (@Pc(33) int local33 = 0; local33 < arg2; local33++) {
				this.anIntArray219[local23 + local33] = local3[local31 + local33] & 0xFFFFFF;
			}
		}
	}

	@OriginalMember(owner = "client!app", name = "ab", descriptor = "(III)V")
	@Override
	public void method18247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int[] local3 = this.aClass102_Sub2_10.anIntArray50;
		if (local3 == null) {
			throw new IllegalStateException("");
		}
		@Pc(14) int local14;
		@Pc(23) int local23;
		@Pc(35) int local35;
		@Pc(37) int local37;
		if (arg2 == 0) {
			for (local14 = 0; local14 < this.anInt2559; local14++) {
				local23 = local14 * this.anInt2554;
				local35 = (arg1 + local14) * this.aClass102_Sub2_10.anInt638 * 513500097 + arg0;
				for (local37 = 0; local37 < this.anInt2554; local37++) {
					this.anIntArray219[local23 + local37] = this.anIntArray219[local23 + local37] & 0xFFFFFF | (local3[local35 + local37] & 0xFF0000) << 8;
				}
			}
		} else if (arg2 == 1) {
			for (local14 = 0; local14 < this.anInt2559; local14++) {
				local23 = local14 * this.anInt2554;
				local35 = (arg1 + local14) * this.aClass102_Sub2_10.anInt638 * 513500097 + arg0;
				for (local37 = 0; local37 < this.anInt2554; local37++) {
					this.anIntArray219[local23 + local37] = this.anIntArray219[local23 + local37] & 0xFFFFFF | (local3[local35 + local37] & 0xFF00) << 16;
				}
			}
		} else if (arg2 == 2) {
			for (local14 = 0; local14 < this.anInt2559; local14++) {
				local23 = local14 * this.anInt2554;
				local35 = (arg1 + local14) * this.aClass102_Sub2_10.anInt638 * 513500097 + arg0;
				for (local37 = 0; local37 < this.anInt2554; local37++) {
					this.anIntArray219[local23 + local37] = this.anIntArray219[local23 + local37] & 0xFFFFFF | (local3[local35 + local37] & 0xFF) << 24;
				}
			}
		} else if (arg2 == 3) {
			for (local14 = 0; local14 < this.anInt2559; local14++) {
				local23 = local14 * this.anInt2554;
				local35 = (arg1 + local14) * this.aClass102_Sub2_10.anInt638 * 513500097 + arg0;
				for (local37 = 0; local37 < this.anInt2554; local37++) {
					this.anIntArray219[local23 + local37] = this.anIntArray219[local23 + local37] & 0xFFFFFF | (local3[local35 + local37] == 0 ? 0 : -16777216);
				}
			}
		}
	}

	@OriginalMember(owner = "client!app", name = "al", descriptor = "(III)V")
	@Override
	public void method18215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int[] local3 = this.aClass102_Sub2_10.anIntArray50;
		if (local3 == null) {
			throw new IllegalStateException("");
		}
		@Pc(14) int local14;
		@Pc(23) int local23;
		@Pc(35) int local35;
		@Pc(37) int local37;
		if (arg2 == 0) {
			for (local14 = 0; local14 < this.anInt2559; local14++) {
				local23 = local14 * this.anInt2554;
				local35 = (arg1 + local14) * this.aClass102_Sub2_10.anInt638 * 513500097 + arg0;
				for (local37 = 0; local37 < this.anInt2554; local37++) {
					this.anIntArray219[local23 + local37] = this.anIntArray219[local23 + local37] & 0xFFFFFF | (local3[local35 + local37] & 0xFF0000) << 8;
				}
			}
		} else if (arg2 == 1) {
			for (local14 = 0; local14 < this.anInt2559; local14++) {
				local23 = local14 * this.anInt2554;
				local35 = (arg1 + local14) * this.aClass102_Sub2_10.anInt638 * 513500097 + arg0;
				for (local37 = 0; local37 < this.anInt2554; local37++) {
					this.anIntArray219[local23 + local37] = this.anIntArray219[local23 + local37] & 0xFFFFFF | (local3[local35 + local37] & 0xFF00) << 16;
				}
			}
		} else if (arg2 == 2) {
			for (local14 = 0; local14 < this.anInt2559; local14++) {
				local23 = local14 * this.anInt2554;
				local35 = (arg1 + local14) * this.aClass102_Sub2_10.anInt638 * 513500097 + arg0;
				for (local37 = 0; local37 < this.anInt2554; local37++) {
					this.anIntArray219[local23 + local37] = this.anIntArray219[local23 + local37] & 0xFFFFFF | (local3[local35 + local37] & 0xFF) << 24;
				}
			}
		} else if (arg2 == 3) {
			for (local14 = 0; local14 < this.anInt2559; local14++) {
				local23 = local14 * this.anInt2554;
				local35 = (arg1 + local14) * this.aClass102_Sub2_10.anInt638 * 513500097 + arg0;
				for (local37 = 0; local37 < this.anInt2554; local37++) {
					this.anIntArray219[local23 + local37] = this.anIntArray219[local23 + local37] & 0xFFFFFF | (local3[local35 + local37] == 0 ? 0 : -16777216);
				}
			}
		}
	}

	@OriginalMember(owner = "client!app", name = "ah", descriptor = "()Lclient!do;")
	@Override
	public Interface18 method18249() {
		return new Class183(this.anInt2554, this.anInt2559, this.anIntArray219);
	}

	@OriginalMember(owner = "client!app", name = "af", descriptor = "()Lclient!do;")
	@Override
	public Interface18 method18250() {
		return new Class183(this.anInt2554, this.anInt2559, this.anIntArray219);
	}

	@OriginalMember(owner = "client!app", name = "am", descriptor = "(IIIII)V")
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
		@Pc(284) int local284;
		@Pc(287) int local287;
		@Pc(292) int local292;
		@Pc(300) int local300;
		@Pc(308) int local308;
		@Pc(316) int local316;
		@Pc(324) int local324;
		@Pc(448) int local448;
		if (arg4 != 0) {
			@Pc(744) int local744;
			@Pc(752) int local752;
			@Pc(764) int local764;
			if (arg4 != 1) {
				if (arg4 != 2) {
					throw new IllegalArgumentException();
				}
				if (arg2 == 1) {
					for (local65 = -local41; local65 < 0; local65++) {
						for (local201 = -local44; local201 < 0; local201++) {
							local284 = this.anIntArray219[local38++];
							if (local284 == 0) {
								local36++;
							} else {
								local287 = local11[local36];
								local292 = local284 + local287;
								local300 = (local284 & 0xFF00FF) + (local287 & 0xFF00FF);
								local287 = (local300 & 0x1000100) + (local292 - local300 & 0x10000);
								local11[local36++] = local292 - local287 | local287 - (local287 >>> 8);
							}
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 0) {
					local65 = arg3 >> 16 & 0xFF;
					local201 = arg3 >> 8 & 0xFF;
					local284 = arg3 & 0xFF;
					for (local287 = -local41; local287 < 0; local287++) {
						for (local292 = -local44; local292 < 0; local292++) {
							local300 = this.anIntArray219[local38++];
							if (local300 == 0) {
								local36++;
							} else {
								local308 = (local300 & 0xFF0000) * local65 & 0xFF000000;
								local316 = (local300 & 0xFF00) * local201 & 0xFF0000;
								local324 = (local300 & 0xFF) * local284 & 0xFF00;
								local300 = (local308 | local316 | local324) >>> 8;
								local744 = local11[local36];
								local752 = local300 + local744;
								local764 = (local300 & 0xFF00FF) + (local744 & 0xFF00FF);
								local744 = (local764 & 0x1000100) + (local752 - local764 & 0x10000);
								local11[local36++] = local752 - local744 | local744 - (local744 >>> 8);
							}
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 3) {
					for (local65 = -local41; local65 < 0; local65++) {
						for (local201 = -local44; local201 < 0; local201++) {
							local284 = this.anIntArray219[local38++];
							local287 = local284 + arg3;
							local292 = (local284 & 0xFF00FF) + (arg3 & 0xFF00FF);
							local300 = (local292 & 0x1000100) + (local287 - local292 & 0x10000);
							local284 = local287 - local300 | local300 - (local300 >>> 8);
							local300 = local11[local36];
							local287 = local284 + local300;
							local292 = (local284 & 0xFF00FF) + (local300 & 0xFF00FF);
							local300 = (local292 & 0x1000100) + (local287 - local292 & 0x10000);
							local11[local36++] = local287 - local300 | local300 - (local300 >>> 8);
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 2) {
					local65 = arg3 >>> 24;
					local201 = 256 - local65;
					local284 = (arg3 & 0xFF00FF) * local201 & 0xFF00FF00;
					local287 = (arg3 & 0xFF00) * local201 & 0xFF0000;
					local448 = (local284 | local287) >>> 8;
					for (local292 = -local41; local292 < 0; local292++) {
						for (local300 = -local44; local300 < 0; local300++) {
							local308 = this.anIntArray219[local38++];
							if (local308 == 0) {
								local36++;
							} else {
								local284 = (local308 & 0xFF00FF) * local65 & 0xFF00FF00;
								local287 = (local308 & 0xFF00) * local65 & 0xFF0000;
								local308 = ((local284 | local287) >>> 8) + local448;
								local316 = local11[local36];
								local324 = local308 + local316;
								local744 = (local308 & 0xFF00FF) + (local316 & 0xFF00FF);
								local316 = (local744 & 0x1000100) + (local324 - local744 & 0x10000);
								local11[local36++] = local324 - local316 | local316 - (local316 >>> 8);
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
						local284 = this.anIntArray219[local38++];
						local287 = local284 >>> 24;
						local292 = 256 - local287;
						local300 = local11[local36];
						local11[local36++] = ((local284 & 0xFF00FF) * local287 + (local300 & 0xFF00FF) * local292 >> 8 & 0xFFFF00FF) + (((local284 & 0xFF00FF00) >>> 8) * local287 + ((local300 & 0xFF00FF00) >>> 8) * local292 & 0xFF00FF00);
					}
					local36 += local48;
					local38 += local50;
				}
			} else if (arg2 == 0) {
				if ((arg3 & 0xFFFFFF) == 16777215) {
					for (local65 = -local41; local65 < 0; local65++) {
						for (local201 = -local44; local201 < 0; local201++) {
							local284 = this.anIntArray219[local38++];
							local287 = (local284 >>> 24) * (arg3 >>> 24) >> 8;
							local292 = 256 - local287;
							local300 = local11[local36];
							local11[local36++] = ((local284 & 0xFF00FF) * local287 + (local300 & 0xFF00FF) * local292 & 0xFF00FF00) + ((local284 & 0xFF00) * local287 + (local300 & 0xFF00) * local292 & 0xFF0000) >> 8;
						}
						local36 += local48;
						local38 += local50;
					}
				} else {
					local65 = arg3 >> 16 & 0xFF;
					local201 = arg3 >> 8 & 0xFF;
					local284 = arg3 & 0xFF;
					for (local287 = -local41; local287 < 0; local287++) {
						for (local292 = -local44; local292 < 0; local292++) {
							local300 = this.anIntArray219[local38++];
							local308 = (local300 >>> 24) * (arg3 >>> 24) >> 8;
							local316 = 256 - local308;
							if (local308 == 255) {
								local324 = (local300 & 0xFF0000) * local65 & 0xFF000000;
								local744 = (local300 & 0xFF00) * local201 & 0xFF0000;
								local752 = (local300 & 0xFF) * local284 & 0xFF00;
								local11[local36++] = (local324 | local744 | local752) >>> 8;
							} else {
								local324 = (local300 & 0xFF0000) * local65 & 0xFF000000;
								local744 = (local300 & 0xFF00) * local201 & 0xFF0000;
								local752 = (local300 & 0xFF) * local284 & 0xFF00;
								local300 = (local324 | local744 | local752) >>> 8;
								local764 = local11[local36];
								local11[local36++] = ((local300 & 0xFF00FF) * local308 + (local764 & 0xFF00FF) * local316 & 0xFF00FF00) + ((local300 & 0xFF00) * local308 + (local764 & 0xFF00) * local316 & 0xFF0000) >> 8;
							}
						}
						local36 += local48;
						local38 += local50;
					}
				}
			} else if (arg2 == 3) {
				for (local65 = -local41; local65 < 0; local65++) {
					for (local201 = -local44; local201 < 0; local201++) {
						local284 = this.anIntArray219[local38++];
						local287 = local284 + arg3;
						local292 = (local284 & 0xFF00FF) + (arg3 & 0xFF00FF);
						local300 = (local292 & 0x1000100) + (local287 - local292 & 0x10000);
						local300 = local287 - local300 | local300 - (local300 >>> 8);
						local308 = (local300 >>> 24) * (arg3 >>> 24) >> 8;
						local316 = 256 - local308;
						if (local308 != 255) {
							local284 = local300;
							local300 = local11[local36];
							local300 = ((local284 & 0xFF00FF) * local308 + (local300 & 0xFF00FF) * local316 & 0xFF00FF00) + ((local284 & 0xFF00) * local308 + (local300 & 0xFF00) * local316 & 0xFF0000) >> 8;
						}
						local11[local36++] = local300;
					}
					local36 += local48;
					local38 += local50;
				}
			} else if (arg2 == 2) {
				local65 = arg3 >>> 24;
				local201 = 256 - local65;
				local284 = (arg3 & 0xFF00FF) * local201 & 0xFF00FF00;
				local287 = (arg3 & 0xFF00) * local201 & 0xFF0000;
				local448 = (local284 | local287) >>> 8;
				for (local292 = -local41; local292 < 0; local292++) {
					for (local300 = -local44; local300 < 0; local300++) {
						local308 = this.anIntArray219[local38++];
						local316 = local308 >>> 24;
						local324 = 256 - local316;
						local284 = (local308 & 0xFF00FF) * local65 & 0xFF00FF00;
						local287 = (local308 & 0xFF00) * local65 & 0xFF0000;
						local308 = ((local284 | local287) >>> 8) + local448;
						local744 = local11[local36];
						local11[local36++] = ((local308 & 0xFF00FF) * local316 + (local744 & 0xFF00FF) * local324 & 0xFF00FF00) + ((local308 & 0xFF00) * local316 + (local744 & 0xFF00) * local324 & 0xFF0000) >> 8;
					}
					local36 += local48;
					local38 += local50;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg2 == 1) {
			for (local65 = -local41; local65 < 0; local65++) {
				local201 = local36 + local44 - 3;
				while (local36 < local201) {
					local11[local36++] = this.anIntArray219[local38++];
					local11[local36++] = this.anIntArray219[local38++];
					local11[local36++] = this.anIntArray219[local38++];
					local11[local36++] = this.anIntArray219[local38++];
				}
				local201 += 3;
				while (local36 < local201) {
					local11[local36++] = this.anIntArray219[local38++];
				}
				local36 += local48;
				local38 += local50;
			}
		} else if (arg2 == 0) {
			local65 = arg3 >> 16 & 0xFF;
			local201 = arg3 >> 8 & 0xFF;
			local284 = arg3 & 0xFF;
			for (local287 = -local41; local287 < 0; local287++) {
				for (local292 = -local44; local292 < 0; local292++) {
					local300 = this.anIntArray219[local38++];
					local308 = (local300 & 0xFF0000) * local65 & 0xFF000000;
					local316 = (local300 & 0xFF00) * local201 & 0xFF0000;
					local324 = (local300 & 0xFF) * local284 & 0xFF00;
					local11[local36++] = (local308 | local316 | local324) >>> 8;
				}
				local36 += local48;
				local38 += local50;
			}
		} else if (arg2 == 3) {
			for (local65 = -local41; local65 < 0; local65++) {
				for (local201 = -local44; local201 < 0; local201++) {
					local284 = this.anIntArray219[local38++];
					local287 = local284 + arg3;
					local292 = (local284 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local300 = (local292 & 0x1000100) + (local287 - local292 & 0x10000);
					local11[local36++] = local287 - local300 | local300 - (local300 >>> 8);
				}
				local36 += local48;
				local38 += local50;
			}
		} else if (arg2 == 2) {
			local65 = arg3 >>> 24;
			local201 = 256 - local65;
			local284 = (arg3 & 0xFF00FF) * local201 & 0xFF00FF00;
			local287 = (arg3 & 0xFF00) * local201 & 0xFF0000;
			local448 = (local284 | local287) >>> 8;
			for (local292 = -local41; local292 < 0; local292++) {
				for (local300 = -local44; local300 < 0; local300++) {
					local308 = this.anIntArray219[local38++];
					local284 = (local308 & 0xFF00FF) * local65 & 0xFF00FF00;
					local287 = (local308 & 0xFF00) * local65 & 0xFF0000;
					local11[local36++] = ((local284 | local287) >>> 8) + local448;
				}
				local36 += local48;
				local38 += local50;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!app", name = "ak", descriptor = "(IIIII)V")
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
		@Pc(284) int local284;
		@Pc(287) int local287;
		@Pc(292) int local292;
		@Pc(300) int local300;
		@Pc(308) int local308;
		@Pc(316) int local316;
		@Pc(324) int local324;
		@Pc(448) int local448;
		if (arg4 != 0) {
			@Pc(744) int local744;
			@Pc(752) int local752;
			@Pc(764) int local764;
			if (arg4 != 1) {
				if (arg4 != 2) {
					throw new IllegalArgumentException();
				}
				if (arg2 == 1) {
					for (local65 = -local41; local65 < 0; local65++) {
						for (local201 = -local44; local201 < 0; local201++) {
							local284 = this.anIntArray219[local38++];
							if (local284 == 0) {
								local36++;
							} else {
								local287 = local11[local36];
								local292 = local284 + local287;
								local300 = (local284 & 0xFF00FF) + (local287 & 0xFF00FF);
								local287 = (local300 & 0x1000100) + (local292 - local300 & 0x10000);
								local11[local36++] = local292 - local287 | local287 - (local287 >>> 8);
							}
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 0) {
					local65 = arg3 >> 16 & 0xFF;
					local201 = arg3 >> 8 & 0xFF;
					local284 = arg3 & 0xFF;
					for (local287 = -local41; local287 < 0; local287++) {
						for (local292 = -local44; local292 < 0; local292++) {
							local300 = this.anIntArray219[local38++];
							if (local300 == 0) {
								local36++;
							} else {
								local308 = (local300 & 0xFF0000) * local65 & 0xFF000000;
								local316 = (local300 & 0xFF00) * local201 & 0xFF0000;
								local324 = (local300 & 0xFF) * local284 & 0xFF00;
								local300 = (local308 | local316 | local324) >>> 8;
								local744 = local11[local36];
								local752 = local300 + local744;
								local764 = (local300 & 0xFF00FF) + (local744 & 0xFF00FF);
								local744 = (local764 & 0x1000100) + (local752 - local764 & 0x10000);
								local11[local36++] = local752 - local744 | local744 - (local744 >>> 8);
							}
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 3) {
					for (local65 = -local41; local65 < 0; local65++) {
						for (local201 = -local44; local201 < 0; local201++) {
							local284 = this.anIntArray219[local38++];
							local287 = local284 + arg3;
							local292 = (local284 & 0xFF00FF) + (arg3 & 0xFF00FF);
							local300 = (local292 & 0x1000100) + (local287 - local292 & 0x10000);
							local284 = local287 - local300 | local300 - (local300 >>> 8);
							local300 = local11[local36];
							local287 = local284 + local300;
							local292 = (local284 & 0xFF00FF) + (local300 & 0xFF00FF);
							local300 = (local292 & 0x1000100) + (local287 - local292 & 0x10000);
							local11[local36++] = local287 - local300 | local300 - (local300 >>> 8);
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 2) {
					local65 = arg3 >>> 24;
					local201 = 256 - local65;
					local284 = (arg3 & 0xFF00FF) * local201 & 0xFF00FF00;
					local287 = (arg3 & 0xFF00) * local201 & 0xFF0000;
					local448 = (local284 | local287) >>> 8;
					for (local292 = -local41; local292 < 0; local292++) {
						for (local300 = -local44; local300 < 0; local300++) {
							local308 = this.anIntArray219[local38++];
							if (local308 == 0) {
								local36++;
							} else {
								local284 = (local308 & 0xFF00FF) * local65 & 0xFF00FF00;
								local287 = (local308 & 0xFF00) * local65 & 0xFF0000;
								local308 = ((local284 | local287) >>> 8) + local448;
								local316 = local11[local36];
								local324 = local308 + local316;
								local744 = (local308 & 0xFF00FF) + (local316 & 0xFF00FF);
								local316 = (local744 & 0x1000100) + (local324 - local744 & 0x10000);
								local11[local36++] = local324 - local316 | local316 - (local316 >>> 8);
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
						local284 = this.anIntArray219[local38++];
						local287 = local284 >>> 24;
						local292 = 256 - local287;
						local300 = local11[local36];
						local11[local36++] = ((local284 & 0xFF00FF) * local287 + (local300 & 0xFF00FF) * local292 >> 8 & 0xFFFF00FF) + (((local284 & 0xFF00FF00) >>> 8) * local287 + ((local300 & 0xFF00FF00) >>> 8) * local292 & 0xFF00FF00);
					}
					local36 += local48;
					local38 += local50;
				}
			} else if (arg2 == 0) {
				if ((arg3 & 0xFFFFFF) == 16777215) {
					for (local65 = -local41; local65 < 0; local65++) {
						for (local201 = -local44; local201 < 0; local201++) {
							local284 = this.anIntArray219[local38++];
							local287 = (local284 >>> 24) * (arg3 >>> 24) >> 8;
							local292 = 256 - local287;
							local300 = local11[local36];
							local11[local36++] = ((local284 & 0xFF00FF) * local287 + (local300 & 0xFF00FF) * local292 & 0xFF00FF00) + ((local284 & 0xFF00) * local287 + (local300 & 0xFF00) * local292 & 0xFF0000) >> 8;
						}
						local36 += local48;
						local38 += local50;
					}
				} else {
					local65 = arg3 >> 16 & 0xFF;
					local201 = arg3 >> 8 & 0xFF;
					local284 = arg3 & 0xFF;
					for (local287 = -local41; local287 < 0; local287++) {
						for (local292 = -local44; local292 < 0; local292++) {
							local300 = this.anIntArray219[local38++];
							local308 = (local300 >>> 24) * (arg3 >>> 24) >> 8;
							local316 = 256 - local308;
							if (local308 == 255) {
								local324 = (local300 & 0xFF0000) * local65 & 0xFF000000;
								local744 = (local300 & 0xFF00) * local201 & 0xFF0000;
								local752 = (local300 & 0xFF) * local284 & 0xFF00;
								local11[local36++] = (local324 | local744 | local752) >>> 8;
							} else {
								local324 = (local300 & 0xFF0000) * local65 & 0xFF000000;
								local744 = (local300 & 0xFF00) * local201 & 0xFF0000;
								local752 = (local300 & 0xFF) * local284 & 0xFF00;
								local300 = (local324 | local744 | local752) >>> 8;
								local764 = local11[local36];
								local11[local36++] = ((local300 & 0xFF00FF) * local308 + (local764 & 0xFF00FF) * local316 & 0xFF00FF00) + ((local300 & 0xFF00) * local308 + (local764 & 0xFF00) * local316 & 0xFF0000) >> 8;
							}
						}
						local36 += local48;
						local38 += local50;
					}
				}
			} else if (arg2 == 3) {
				for (local65 = -local41; local65 < 0; local65++) {
					for (local201 = -local44; local201 < 0; local201++) {
						local284 = this.anIntArray219[local38++];
						local287 = local284 + arg3;
						local292 = (local284 & 0xFF00FF) + (arg3 & 0xFF00FF);
						local300 = (local292 & 0x1000100) + (local287 - local292 & 0x10000);
						local300 = local287 - local300 | local300 - (local300 >>> 8);
						local308 = (local300 >>> 24) * (arg3 >>> 24) >> 8;
						local316 = 256 - local308;
						if (local308 != 255) {
							local284 = local300;
							local300 = local11[local36];
							local300 = ((local284 & 0xFF00FF) * local308 + (local300 & 0xFF00FF) * local316 & 0xFF00FF00) + ((local284 & 0xFF00) * local308 + (local300 & 0xFF00) * local316 & 0xFF0000) >> 8;
						}
						local11[local36++] = local300;
					}
					local36 += local48;
					local38 += local50;
				}
			} else if (arg2 == 2) {
				local65 = arg3 >>> 24;
				local201 = 256 - local65;
				local284 = (arg3 & 0xFF00FF) * local201 & 0xFF00FF00;
				local287 = (arg3 & 0xFF00) * local201 & 0xFF0000;
				local448 = (local284 | local287) >>> 8;
				for (local292 = -local41; local292 < 0; local292++) {
					for (local300 = -local44; local300 < 0; local300++) {
						local308 = this.anIntArray219[local38++];
						local316 = local308 >>> 24;
						local324 = 256 - local316;
						local284 = (local308 & 0xFF00FF) * local65 & 0xFF00FF00;
						local287 = (local308 & 0xFF00) * local65 & 0xFF0000;
						local308 = ((local284 | local287) >>> 8) + local448;
						local744 = local11[local36];
						local11[local36++] = ((local308 & 0xFF00FF) * local316 + (local744 & 0xFF00FF) * local324 & 0xFF00FF00) + ((local308 & 0xFF00) * local316 + (local744 & 0xFF00) * local324 & 0xFF0000) >> 8;
					}
					local36 += local48;
					local38 += local50;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg2 == 1) {
			for (local65 = -local41; local65 < 0; local65++) {
				local201 = local36 + local44 - 3;
				while (local36 < local201) {
					local11[local36++] = this.anIntArray219[local38++];
					local11[local36++] = this.anIntArray219[local38++];
					local11[local36++] = this.anIntArray219[local38++];
					local11[local36++] = this.anIntArray219[local38++];
				}
				local201 += 3;
				while (local36 < local201) {
					local11[local36++] = this.anIntArray219[local38++];
				}
				local36 += local48;
				local38 += local50;
			}
		} else if (arg2 == 0) {
			local65 = arg3 >> 16 & 0xFF;
			local201 = arg3 >> 8 & 0xFF;
			local284 = arg3 & 0xFF;
			for (local287 = -local41; local287 < 0; local287++) {
				for (local292 = -local44; local292 < 0; local292++) {
					local300 = this.anIntArray219[local38++];
					local308 = (local300 & 0xFF0000) * local65 & 0xFF000000;
					local316 = (local300 & 0xFF00) * local201 & 0xFF0000;
					local324 = (local300 & 0xFF) * local284 & 0xFF00;
					local11[local36++] = (local308 | local316 | local324) >>> 8;
				}
				local36 += local48;
				local38 += local50;
			}
		} else if (arg2 == 3) {
			for (local65 = -local41; local65 < 0; local65++) {
				for (local201 = -local44; local201 < 0; local201++) {
					local284 = this.anIntArray219[local38++];
					local287 = local284 + arg3;
					local292 = (local284 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local300 = (local292 & 0x1000100) + (local287 - local292 & 0x10000);
					local11[local36++] = local287 - local300 | local300 - (local300 >>> 8);
				}
				local36 += local48;
				local38 += local50;
			}
		} else if (arg2 == 2) {
			local65 = arg3 >>> 24;
			local201 = 256 - local65;
			local284 = (arg3 & 0xFF00FF) * local201 & 0xFF00FF00;
			local287 = (arg3 & 0xFF00) * local201 & 0xFF0000;
			local448 = (local284 | local287) >>> 8;
			for (local292 = -local41; local292 < 0; local292++) {
				for (local300 = -local44; local300 < 0; local300++) {
					local308 = this.anIntArray219[local38++];
					local284 = (local308 & 0xFF00FF) * local65 & 0xFF00FF00;
					local287 = (local308 & 0xFF00) * local65 & 0xFF0000;
					local11[local36++] = ((local284 | local287) >>> 8) + local448;
				}
				local36 += local48;
				local38 += local50;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!app", name = "at", descriptor = "(IIIII)V")
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
		@Pc(284) int local284;
		@Pc(287) int local287;
		@Pc(292) int local292;
		@Pc(300) int local300;
		@Pc(308) int local308;
		@Pc(316) int local316;
		@Pc(324) int local324;
		@Pc(448) int local448;
		if (arg4 != 0) {
			@Pc(744) int local744;
			@Pc(752) int local752;
			@Pc(764) int local764;
			if (arg4 != 1) {
				if (arg4 != 2) {
					throw new IllegalArgumentException();
				}
				if (arg2 == 1) {
					for (local65 = -local41; local65 < 0; local65++) {
						for (local201 = -local44; local201 < 0; local201++) {
							local284 = this.anIntArray219[local38++];
							if (local284 == 0) {
								local36++;
							} else {
								local287 = local11[local36];
								local292 = local284 + local287;
								local300 = (local284 & 0xFF00FF) + (local287 & 0xFF00FF);
								local287 = (local300 & 0x1000100) + (local292 - local300 & 0x10000);
								local11[local36++] = local292 - local287 | local287 - (local287 >>> 8);
							}
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 0) {
					local65 = arg3 >> 16 & 0xFF;
					local201 = arg3 >> 8 & 0xFF;
					local284 = arg3 & 0xFF;
					for (local287 = -local41; local287 < 0; local287++) {
						for (local292 = -local44; local292 < 0; local292++) {
							local300 = this.anIntArray219[local38++];
							if (local300 == 0) {
								local36++;
							} else {
								local308 = (local300 & 0xFF0000) * local65 & 0xFF000000;
								local316 = (local300 & 0xFF00) * local201 & 0xFF0000;
								local324 = (local300 & 0xFF) * local284 & 0xFF00;
								local300 = (local308 | local316 | local324) >>> 8;
								local744 = local11[local36];
								local752 = local300 + local744;
								local764 = (local300 & 0xFF00FF) + (local744 & 0xFF00FF);
								local744 = (local764 & 0x1000100) + (local752 - local764 & 0x10000);
								local11[local36++] = local752 - local744 | local744 - (local744 >>> 8);
							}
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 3) {
					for (local65 = -local41; local65 < 0; local65++) {
						for (local201 = -local44; local201 < 0; local201++) {
							local284 = this.anIntArray219[local38++];
							local287 = local284 + arg3;
							local292 = (local284 & 0xFF00FF) + (arg3 & 0xFF00FF);
							local300 = (local292 & 0x1000100) + (local287 - local292 & 0x10000);
							local284 = local287 - local300 | local300 - (local300 >>> 8);
							local300 = local11[local36];
							local287 = local284 + local300;
							local292 = (local284 & 0xFF00FF) + (local300 & 0xFF00FF);
							local300 = (local292 & 0x1000100) + (local287 - local292 & 0x10000);
							local11[local36++] = local287 - local300 | local300 - (local300 >>> 8);
						}
						local36 += local48;
						local38 += local50;
					}
				} else if (arg2 == 2) {
					local65 = arg3 >>> 24;
					local201 = 256 - local65;
					local284 = (arg3 & 0xFF00FF) * local201 & 0xFF00FF00;
					local287 = (arg3 & 0xFF00) * local201 & 0xFF0000;
					local448 = (local284 | local287) >>> 8;
					for (local292 = -local41; local292 < 0; local292++) {
						for (local300 = -local44; local300 < 0; local300++) {
							local308 = this.anIntArray219[local38++];
							if (local308 == 0) {
								local36++;
							} else {
								local284 = (local308 & 0xFF00FF) * local65 & 0xFF00FF00;
								local287 = (local308 & 0xFF00) * local65 & 0xFF0000;
								local308 = ((local284 | local287) >>> 8) + local448;
								local316 = local11[local36];
								local324 = local308 + local316;
								local744 = (local308 & 0xFF00FF) + (local316 & 0xFF00FF);
								local316 = (local744 & 0x1000100) + (local324 - local744 & 0x10000);
								local11[local36++] = local324 - local316 | local316 - (local316 >>> 8);
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
						local284 = this.anIntArray219[local38++];
						local287 = local284 >>> 24;
						local292 = 256 - local287;
						local300 = local11[local36];
						local11[local36++] = ((local284 & 0xFF00FF) * local287 + (local300 & 0xFF00FF) * local292 >> 8 & 0xFFFF00FF) + (((local284 & 0xFF00FF00) >>> 8) * local287 + ((local300 & 0xFF00FF00) >>> 8) * local292 & 0xFF00FF00);
					}
					local36 += local48;
					local38 += local50;
				}
			} else if (arg2 == 0) {
				if ((arg3 & 0xFFFFFF) == 16777215) {
					for (local65 = -local41; local65 < 0; local65++) {
						for (local201 = -local44; local201 < 0; local201++) {
							local284 = this.anIntArray219[local38++];
							local287 = (local284 >>> 24) * (arg3 >>> 24) >> 8;
							local292 = 256 - local287;
							local300 = local11[local36];
							local11[local36++] = ((local284 & 0xFF00FF) * local287 + (local300 & 0xFF00FF) * local292 & 0xFF00FF00) + ((local284 & 0xFF00) * local287 + (local300 & 0xFF00) * local292 & 0xFF0000) >> 8;
						}
						local36 += local48;
						local38 += local50;
					}
				} else {
					local65 = arg3 >> 16 & 0xFF;
					local201 = arg3 >> 8 & 0xFF;
					local284 = arg3 & 0xFF;
					for (local287 = -local41; local287 < 0; local287++) {
						for (local292 = -local44; local292 < 0; local292++) {
							local300 = this.anIntArray219[local38++];
							local308 = (local300 >>> 24) * (arg3 >>> 24) >> 8;
							local316 = 256 - local308;
							if (local308 == 255) {
								local324 = (local300 & 0xFF0000) * local65 & 0xFF000000;
								local744 = (local300 & 0xFF00) * local201 & 0xFF0000;
								local752 = (local300 & 0xFF) * local284 & 0xFF00;
								local11[local36++] = (local324 | local744 | local752) >>> 8;
							} else {
								local324 = (local300 & 0xFF0000) * local65 & 0xFF000000;
								local744 = (local300 & 0xFF00) * local201 & 0xFF0000;
								local752 = (local300 & 0xFF) * local284 & 0xFF00;
								local300 = (local324 | local744 | local752) >>> 8;
								local764 = local11[local36];
								local11[local36++] = ((local300 & 0xFF00FF) * local308 + (local764 & 0xFF00FF) * local316 & 0xFF00FF00) + ((local300 & 0xFF00) * local308 + (local764 & 0xFF00) * local316 & 0xFF0000) >> 8;
							}
						}
						local36 += local48;
						local38 += local50;
					}
				}
			} else if (arg2 == 3) {
				for (local65 = -local41; local65 < 0; local65++) {
					for (local201 = -local44; local201 < 0; local201++) {
						local284 = this.anIntArray219[local38++];
						local287 = local284 + arg3;
						local292 = (local284 & 0xFF00FF) + (arg3 & 0xFF00FF);
						local300 = (local292 & 0x1000100) + (local287 - local292 & 0x10000);
						local300 = local287 - local300 | local300 - (local300 >>> 8);
						local308 = (local300 >>> 24) * (arg3 >>> 24) >> 8;
						local316 = 256 - local308;
						if (local308 != 255) {
							local284 = local300;
							local300 = local11[local36];
							local300 = ((local284 & 0xFF00FF) * local308 + (local300 & 0xFF00FF) * local316 & 0xFF00FF00) + ((local284 & 0xFF00) * local308 + (local300 & 0xFF00) * local316 & 0xFF0000) >> 8;
						}
						local11[local36++] = local300;
					}
					local36 += local48;
					local38 += local50;
				}
			} else if (arg2 == 2) {
				local65 = arg3 >>> 24;
				local201 = 256 - local65;
				local284 = (arg3 & 0xFF00FF) * local201 & 0xFF00FF00;
				local287 = (arg3 & 0xFF00) * local201 & 0xFF0000;
				local448 = (local284 | local287) >>> 8;
				for (local292 = -local41; local292 < 0; local292++) {
					for (local300 = -local44; local300 < 0; local300++) {
						local308 = this.anIntArray219[local38++];
						local316 = local308 >>> 24;
						local324 = 256 - local316;
						local284 = (local308 & 0xFF00FF) * local65 & 0xFF00FF00;
						local287 = (local308 & 0xFF00) * local65 & 0xFF0000;
						local308 = ((local284 | local287) >>> 8) + local448;
						local744 = local11[local36];
						local11[local36++] = ((local308 & 0xFF00FF) * local316 + (local744 & 0xFF00FF) * local324 & 0xFF00FF00) + ((local308 & 0xFF00) * local316 + (local744 & 0xFF00) * local324 & 0xFF0000) >> 8;
					}
					local36 += local48;
					local38 += local50;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg2 == 1) {
			for (local65 = -local41; local65 < 0; local65++) {
				local201 = local36 + local44 - 3;
				while (local36 < local201) {
					local11[local36++] = this.anIntArray219[local38++];
					local11[local36++] = this.anIntArray219[local38++];
					local11[local36++] = this.anIntArray219[local38++];
					local11[local36++] = this.anIntArray219[local38++];
				}
				local201 += 3;
				while (local36 < local201) {
					local11[local36++] = this.anIntArray219[local38++];
				}
				local36 += local48;
				local38 += local50;
			}
		} else if (arg2 == 0) {
			local65 = arg3 >> 16 & 0xFF;
			local201 = arg3 >> 8 & 0xFF;
			local284 = arg3 & 0xFF;
			for (local287 = -local41; local287 < 0; local287++) {
				for (local292 = -local44; local292 < 0; local292++) {
					local300 = this.anIntArray219[local38++];
					local308 = (local300 & 0xFF0000) * local65 & 0xFF000000;
					local316 = (local300 & 0xFF00) * local201 & 0xFF0000;
					local324 = (local300 & 0xFF) * local284 & 0xFF00;
					local11[local36++] = (local308 | local316 | local324) >>> 8;
				}
				local36 += local48;
				local38 += local50;
			}
		} else if (arg2 == 3) {
			for (local65 = -local41; local65 < 0; local65++) {
				for (local201 = -local44; local201 < 0; local201++) {
					local284 = this.anIntArray219[local38++];
					local287 = local284 + arg3;
					local292 = (local284 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local300 = (local292 & 0x1000100) + (local287 - local292 & 0x10000);
					local11[local36++] = local287 - local300 | local300 - (local300 >>> 8);
				}
				local36 += local48;
				local38 += local50;
			}
		} else if (arg2 == 2) {
			local65 = arg3 >>> 24;
			local201 = 256 - local65;
			local284 = (arg3 & 0xFF00FF) * local201 & 0xFF00FF00;
			local287 = (arg3 & 0xFF00) * local201 & 0xFF0000;
			local448 = (local284 | local287) >>> 8;
			for (local292 = -local41; local292 < 0; local292++) {
				for (local300 = -local44; local300 < 0; local300++) {
					local308 = this.anIntArray219[local38++];
					local284 = (local308 & 0xFF00FF) * local65 & 0xFF00FF00;
					local287 = (local308 & 0xFF00) * local65 & 0xFF0000;
					local11[local36++] = ((local284 | local287) >>> 8) + local448;
				}
				local36 += local48;
				local38 += local50;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!app", name = "cf", descriptor = "(IIII[III)V")
	void method18313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg6 - arg2;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			@Pc(16) int local16 = (arg1 + local5) * arg2 + arg0;
			for (@Pc(18) int local18 = 0; local18 < arg2; local18++) {
				arg4[arg5++] = this.anIntArray219[local16 + local18];
			}
			arg5 += local3;
		}
	}

	@OriginalMember(owner = "client!app", name = "ad", descriptor = "(IILclient!cg;II)V")
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
				@Pc(339) int local339 = this.anIntArray219[local26++];
				@Pc(343) int local343 = local339 >>> 24;
				@Pc(347) int local347 = 256 - local343;
				@Pc(351) int local351 = local11[local50];
				local11[local50++] = ((local339 & 0xFF00FF) * local343 + (local351 & 0xFF00FF) * local347 & 0xFF00FF00) + ((local339 & 0xFF00) * local343 + (local351 & 0xFF00) * local347 & 0xFF0000) >> 8;
			}
			local26 += local263 + local44;
			local50 += local263 + local42;
		}
	}

	@OriginalMember(owner = "client!app", name = "an", descriptor = "(IIIIIIII)V")
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
				@Pc(351) int local351;
				@Pc(360) int local360;
				@Pc(363) int local363;
				@Pc(374) int local374;
				@Pc(382) int local382;
				@Pc(390) int local390;
				@Pc(398) int local398;
				@Pc(546) int local546;
				if (arg6 != 0) {
					@Pc(906) int local906;
					@Pc(914) int local914;
					@Pc(926) int local926;
					if (arg6 != 1) {
						if (arg6 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg4 == 1) {
							local197 = local21;
							for (local283 = -arg3; local283 < 0; local283++) {
								local292 = (local23 >> 16) * this.anInt2554;
								for (local295 = -arg2; local295 < 0; local295++) {
									local351 = this.anIntArray219[(local21 >> 16) + local292];
									if (local351 == 0) {
										local73++;
									} else {
										local360 = local16[local73];
										local363 = local351 + local360;
										local374 = (local351 & 0xFF00FF) + (local360 & 0xFF00FF);
										local360 = (local374 & 0x1000100) + (local363 - local374 & 0x10000);
										local16[local73++] = local363 - local360 | local360 - (local360 >>> 8);
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
							for (local351 = -arg3; local351 < 0; local351++) {
								local360 = (local23 >> 16) * this.anInt2554;
								for (local363 = -arg2; local363 < 0; local363++) {
									local374 = this.anIntArray219[(local21 >> 16) + local360];
									if (local374 == 0) {
										local73++;
									} else {
										local382 = (local374 & 0xFF0000) * local283 & 0xFF000000;
										local390 = (local374 & 0xFF00) * local292 & 0xFF0000;
										local398 = (local374 & 0xFF) * local295 & 0xFF00;
										local374 = (local382 | local390 | local398) >>> 8;
										local906 = local16[local73];
										local914 = local374 + local906;
										local926 = (local374 & 0xFF00FF) + (local906 & 0xFF00FF);
										local906 = (local926 & 0x1000100) + (local914 - local926 & 0x10000);
										local16[local73++] = local914 - local906 | local906 - (local906 >>> 8);
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
									local351 = this.anIntArray219[(local21 >> 16) + local292];
									local360 = local351 + arg5;
									local363 = (local351 & 0xFF00FF) + (arg5 & 0xFF00FF);
									local374 = (local363 & 0x1000100) + (local360 - local363 & 0x10000);
									local351 = local360 - local374 | local374 - (local374 >>> 8);
									local374 = local16[local73];
									local360 = local351 + local374;
									local363 = (local351 & 0xFF00FF) + (local374 & 0xFF00FF);
									local374 = (local363 & 0x1000100) + (local360 - local363 & 0x10000);
									local16[local73++] = local360 - local374 | local374 - (local374 >>> 8);
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
							local546 = (local292 | local295) >>> 8;
							local351 = local21;
							for (local360 = -arg3; local360 < 0; local360++) {
								local363 = (local23 >> 16) * this.anInt2554;
								for (local374 = -arg2; local374 < 0; local374++) {
									local382 = this.anIntArray219[(local21 >> 16) + local363];
									if (local382 == 0) {
										local73++;
									} else {
										local292 = (local382 & 0xFF00FF) * local197 & 0xFF00FF00;
										local295 = (local382 & 0xFF00) * local197 & 0xFF0000;
										local382 = ((local292 | local295) >>> 8) + local546;
										local390 = local16[local73];
										local398 = local382 + local390;
										local906 = (local382 & 0xFF00FF) + (local390 & 0xFF00FF);
										local390 = (local906 & 0x1000100) + (local398 - local906 & 0x10000);
										local16[local73++] = local398 - local390 | local390 - (local390 >>> 8);
									}
									local21 += local53;
								}
								local23 += local59;
								local21 = local351;
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
								local351 = this.anIntArray219[(local21 >> 16) + local292];
								local360 = local351 >>> 24;
								local363 = 256 - local360;
								local374 = local16[local73];
								local16[local73++] = ((local351 & 0xFF00FF) * local360 + (local374 & 0xFF00FF) * local363 >> 8 & 0xFFFF00FF) + (((local351 & 0xFF00FF00) >>> 8) * local360 + ((local374 & 0xFF00FF00) >>> 8) * local363 & 0xFF00FF00);
								local21 += local53;
							}
							local23 += local59;
							local21 = local197;
							local73 += local161;
						}
					} else if (arg4 == 0) {
						local197 = local21;
						if ((arg5 & 0xFFFFFF) == 16777215) {
							for (local283 = -arg3; local283 < 0; local283++) {
								local292 = (local23 >> 16) * this.anInt2554;
								for (local295 = -arg2; local295 < 0; local295++) {
									local351 = this.anIntArray219[(local21 >> 16) + local292];
									local360 = (local351 >>> 24) * (arg5 >>> 24) >> 8;
									local363 = 256 - local360;
									local374 = local16[local73];
									local16[local73++] = ((local351 & 0xFF00FF) * local360 + (local374 & 0xFF00FF) * local363 & 0xFF00FF00) + ((local351 & 0xFF00) * local360 + (local374 & 0xFF00) * local363 & 0xFF0000) >> 8;
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
							for (local351 = -arg3; local351 < 0; local351++) {
								local360 = (local23 >> 16) * this.anInt2554;
								for (local363 = -arg2; local363 < 0; local363++) {
									local374 = this.anIntArray219[(local21 >> 16) + local360];
									local382 = (local374 >>> 24) * (arg5 >>> 24) >> 8;
									local390 = 256 - local382;
									if (local382 == 255) {
										local398 = (local374 & 0xFF0000) * local283 & 0xFF000000;
										local906 = (local374 & 0xFF00) * local292 & 0xFF0000;
										local914 = (local374 & 0xFF) * local295 & 0xFF00;
										local16[local73++] = (local398 | local906 | local914) >>> 8;
									} else {
										local398 = (local374 & 0xFF0000) * local283 & 0xFF000000;
										local906 = (local374 & 0xFF00) * local292 & 0xFF0000;
										local914 = (local374 & 0xFF) * local295 & 0xFF00;
										local374 = (local398 | local906 | local914) >>> 8;
										local926 = local16[local73];
										local16[local73++] = ((local374 & 0xFF00FF) * local382 + (local926 & 0xFF00FF) * local390 & 0xFF00FF00) + ((local374 & 0xFF00) * local382 + (local926 & 0xFF00) * local390 & 0xFF0000) >> 8;
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
						for (local283 = -arg3; local283 < 0; local283++) {
							local292 = (local23 >> 16) * this.anInt2554;
							for (local295 = -arg2; local295 < 0; local295++) {
								local351 = this.anIntArray219[(local21 >> 16) + local292];
								local360 = local351 + arg5;
								local363 = (local351 & 0xFF00FF) + (arg5 & 0xFF00FF);
								local374 = (local363 & 0x1000100) + (local360 - local363 & 0x10000);
								local374 = local360 - local374 | local374 - (local374 >>> 8);
								local382 = (local374 >>> 24) * (arg5 >>> 24) >> 8;
								local390 = 256 - local382;
								if (local382 != 255) {
									local351 = local374;
									local374 = local16[local73];
									local374 = ((local351 & 0xFF00FF) * local382 + (local374 & 0xFF00FF) * local390 & 0xFF00FF00) + ((local351 & 0xFF00) * local382 + (local374 & 0xFF00) * local390 & 0xFF0000) >> 8;
								}
								local16[local73++] = local374;
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
						local546 = (local292 | local295) >>> 8;
						local351 = local21;
						for (local360 = -arg3; local360 < 0; local360++) {
							local363 = (local23 >> 16) * this.anInt2554;
							for (local374 = -arg2; local374 < 0; local374++) {
								local382 = this.anIntArray219[(local21 >> 16) + local363];
								local390 = local382 >>> 24;
								local398 = 256 - local390;
								local292 = (local382 & 0xFF00FF) * local197 & 0xFF00FF00;
								local295 = (local382 & 0xFF00) * local197 & 0xFF0000;
								local382 = ((local292 | local295) >>> 8) + local546;
								local906 = local16[local73];
								local16[local73++] = ((local382 & 0xFF00FF) * local390 + (local906 & 0xFF00FF) * local398 & 0xFF00FF00) + ((local382 & 0xFF00) * local390 + (local906 & 0xFF00) * local398 & 0xFF0000) >> 8;
								local21 += local53;
							}
							local23 += local59;
							local21 = local351;
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
							local16[local73++] = this.anIntArray219[(local21 >> 16) + local292];
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
					for (local351 = -arg3; local351 < 0; local351++) {
						local360 = (local23 >> 16) * this.anInt2554;
						for (local363 = -arg2; local363 < 0; local363++) {
							local374 = this.anIntArray219[(local21 >> 16) + local360];
							local382 = (local374 & 0xFF0000) * local197 & 0xFF000000;
							local390 = (local374 & 0xFF00) * local283 & 0xFF0000;
							local398 = (local374 & 0xFF) * local292 & 0xFF00;
							local16[local73++] = (local382 | local390 | local398) >>> 8;
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
							local351 = this.anIntArray219[(local21 >> 16) + local292];
							local360 = local351 + arg5;
							local363 = (local351 & 0xFF00FF) + (arg5 & 0xFF00FF);
							local374 = (local363 & 0x1000100) + (local360 - local363 & 0x10000);
							local16[local73++] = local360 - local374 | local374 - (local374 >>> 8);
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
					local546 = (local292 | local295) >>> 8;
					local351 = local21;
					for (local360 = -arg3; local360 < 0; local360++) {
						local363 = (local23 >> 16) * this.anInt2554;
						for (local374 = -arg2; local374 < 0; local374++) {
							local382 = this.anIntArray219[(local21 >> 16) + local363];
							local292 = (local382 & 0xFF00FF) * local197 & 0xFF00FF00;
							local295 = (local382 & 0xFF00) * local197 & 0xFF0000;
							local16[local73++] = ((local292 | local295) >>> 8) + local546;
							local21 += local53;
						}
						local23 += local59;
						local21 = local351;
						local73 += local161;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		}
	}

	@OriginalMember(owner = "client!app", name = "aa", descriptor = "(IIIIIIII)V")
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
				@Pc(351) int local351;
				@Pc(360) int local360;
				@Pc(363) int local363;
				@Pc(374) int local374;
				@Pc(382) int local382;
				@Pc(390) int local390;
				@Pc(398) int local398;
				@Pc(546) int local546;
				if (arg6 != 0) {
					@Pc(906) int local906;
					@Pc(914) int local914;
					@Pc(926) int local926;
					if (arg6 != 1) {
						if (arg6 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg4 == 1) {
							local197 = local21;
							for (local283 = -arg3; local283 < 0; local283++) {
								local292 = (local23 >> 16) * this.anInt2554;
								for (local295 = -arg2; local295 < 0; local295++) {
									local351 = this.anIntArray219[(local21 >> 16) + local292];
									if (local351 == 0) {
										local73++;
									} else {
										local360 = local16[local73];
										local363 = local351 + local360;
										local374 = (local351 & 0xFF00FF) + (local360 & 0xFF00FF);
										local360 = (local374 & 0x1000100) + (local363 - local374 & 0x10000);
										local16[local73++] = local363 - local360 | local360 - (local360 >>> 8);
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
							for (local351 = -arg3; local351 < 0; local351++) {
								local360 = (local23 >> 16) * this.anInt2554;
								for (local363 = -arg2; local363 < 0; local363++) {
									local374 = this.anIntArray219[(local21 >> 16) + local360];
									if (local374 == 0) {
										local73++;
									} else {
										local382 = (local374 & 0xFF0000) * local283 & 0xFF000000;
										local390 = (local374 & 0xFF00) * local292 & 0xFF0000;
										local398 = (local374 & 0xFF) * local295 & 0xFF00;
										local374 = (local382 | local390 | local398) >>> 8;
										local906 = local16[local73];
										local914 = local374 + local906;
										local926 = (local374 & 0xFF00FF) + (local906 & 0xFF00FF);
										local906 = (local926 & 0x1000100) + (local914 - local926 & 0x10000);
										local16[local73++] = local914 - local906 | local906 - (local906 >>> 8);
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
									local351 = this.anIntArray219[(local21 >> 16) + local292];
									local360 = local351 + arg5;
									local363 = (local351 & 0xFF00FF) + (arg5 & 0xFF00FF);
									local374 = (local363 & 0x1000100) + (local360 - local363 & 0x10000);
									local351 = local360 - local374 | local374 - (local374 >>> 8);
									local374 = local16[local73];
									local360 = local351 + local374;
									local363 = (local351 & 0xFF00FF) + (local374 & 0xFF00FF);
									local374 = (local363 & 0x1000100) + (local360 - local363 & 0x10000);
									local16[local73++] = local360 - local374 | local374 - (local374 >>> 8);
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
							local546 = (local292 | local295) >>> 8;
							local351 = local21;
							for (local360 = -arg3; local360 < 0; local360++) {
								local363 = (local23 >> 16) * this.anInt2554;
								for (local374 = -arg2; local374 < 0; local374++) {
									local382 = this.anIntArray219[(local21 >> 16) + local363];
									if (local382 == 0) {
										local73++;
									} else {
										local292 = (local382 & 0xFF00FF) * local197 & 0xFF00FF00;
										local295 = (local382 & 0xFF00) * local197 & 0xFF0000;
										local382 = ((local292 | local295) >>> 8) + local546;
										local390 = local16[local73];
										local398 = local382 + local390;
										local906 = (local382 & 0xFF00FF) + (local390 & 0xFF00FF);
										local390 = (local906 & 0x1000100) + (local398 - local906 & 0x10000);
										local16[local73++] = local398 - local390 | local390 - (local390 >>> 8);
									}
									local21 += local53;
								}
								local23 += local59;
								local21 = local351;
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
								local351 = this.anIntArray219[(local21 >> 16) + local292];
								local360 = local351 >>> 24;
								local363 = 256 - local360;
								local374 = local16[local73];
								local16[local73++] = ((local351 & 0xFF00FF) * local360 + (local374 & 0xFF00FF) * local363 >> 8 & 0xFFFF00FF) + (((local351 & 0xFF00FF00) >>> 8) * local360 + ((local374 & 0xFF00FF00) >>> 8) * local363 & 0xFF00FF00);
								local21 += local53;
							}
							local23 += local59;
							local21 = local197;
							local73 += local161;
						}
					} else if (arg4 == 0) {
						local197 = local21;
						if ((arg5 & 0xFFFFFF) == 16777215) {
							for (local283 = -arg3; local283 < 0; local283++) {
								local292 = (local23 >> 16) * this.anInt2554;
								for (local295 = -arg2; local295 < 0; local295++) {
									local351 = this.anIntArray219[(local21 >> 16) + local292];
									local360 = (local351 >>> 24) * (arg5 >>> 24) >> 8;
									local363 = 256 - local360;
									local374 = local16[local73];
									local16[local73++] = ((local351 & 0xFF00FF) * local360 + (local374 & 0xFF00FF) * local363 & 0xFF00FF00) + ((local351 & 0xFF00) * local360 + (local374 & 0xFF00) * local363 & 0xFF0000) >> 8;
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
							for (local351 = -arg3; local351 < 0; local351++) {
								local360 = (local23 >> 16) * this.anInt2554;
								for (local363 = -arg2; local363 < 0; local363++) {
									local374 = this.anIntArray219[(local21 >> 16) + local360];
									local382 = (local374 >>> 24) * (arg5 >>> 24) >> 8;
									local390 = 256 - local382;
									if (local382 == 255) {
										local398 = (local374 & 0xFF0000) * local283 & 0xFF000000;
										local906 = (local374 & 0xFF00) * local292 & 0xFF0000;
										local914 = (local374 & 0xFF) * local295 & 0xFF00;
										local16[local73++] = (local398 | local906 | local914) >>> 8;
									} else {
										local398 = (local374 & 0xFF0000) * local283 & 0xFF000000;
										local906 = (local374 & 0xFF00) * local292 & 0xFF0000;
										local914 = (local374 & 0xFF) * local295 & 0xFF00;
										local374 = (local398 | local906 | local914) >>> 8;
										local926 = local16[local73];
										local16[local73++] = ((local374 & 0xFF00FF) * local382 + (local926 & 0xFF00FF) * local390 & 0xFF00FF00) + ((local374 & 0xFF00) * local382 + (local926 & 0xFF00) * local390 & 0xFF0000) >> 8;
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
						for (local283 = -arg3; local283 < 0; local283++) {
							local292 = (local23 >> 16) * this.anInt2554;
							for (local295 = -arg2; local295 < 0; local295++) {
								local351 = this.anIntArray219[(local21 >> 16) + local292];
								local360 = local351 + arg5;
								local363 = (local351 & 0xFF00FF) + (arg5 & 0xFF00FF);
								local374 = (local363 & 0x1000100) + (local360 - local363 & 0x10000);
								local374 = local360 - local374 | local374 - (local374 >>> 8);
								local382 = (local374 >>> 24) * (arg5 >>> 24) >> 8;
								local390 = 256 - local382;
								if (local382 != 255) {
									local351 = local374;
									local374 = local16[local73];
									local374 = ((local351 & 0xFF00FF) * local382 + (local374 & 0xFF00FF) * local390 & 0xFF00FF00) + ((local351 & 0xFF00) * local382 + (local374 & 0xFF00) * local390 & 0xFF0000) >> 8;
								}
								local16[local73++] = local374;
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
						local546 = (local292 | local295) >>> 8;
						local351 = local21;
						for (local360 = -arg3; local360 < 0; local360++) {
							local363 = (local23 >> 16) * this.anInt2554;
							for (local374 = -arg2; local374 < 0; local374++) {
								local382 = this.anIntArray219[(local21 >> 16) + local363];
								local390 = local382 >>> 24;
								local398 = 256 - local390;
								local292 = (local382 & 0xFF00FF) * local197 & 0xFF00FF00;
								local295 = (local382 & 0xFF00) * local197 & 0xFF0000;
								local382 = ((local292 | local295) >>> 8) + local546;
								local906 = local16[local73];
								local16[local73++] = ((local382 & 0xFF00FF) * local390 + (local906 & 0xFF00FF) * local398 & 0xFF00FF00) + ((local382 & 0xFF00) * local390 + (local906 & 0xFF00) * local398 & 0xFF0000) >> 8;
								local21 += local53;
							}
							local23 += local59;
							local21 = local351;
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
							local16[local73++] = this.anIntArray219[(local21 >> 16) + local292];
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
					for (local351 = -arg3; local351 < 0; local351++) {
						local360 = (local23 >> 16) * this.anInt2554;
						for (local363 = -arg2; local363 < 0; local363++) {
							local374 = this.anIntArray219[(local21 >> 16) + local360];
							local382 = (local374 & 0xFF0000) * local197 & 0xFF000000;
							local390 = (local374 & 0xFF00) * local283 & 0xFF0000;
							local398 = (local374 & 0xFF) * local292 & 0xFF00;
							local16[local73++] = (local382 | local390 | local398) >>> 8;
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
							local351 = this.anIntArray219[(local21 >> 16) + local292];
							local360 = local351 + arg5;
							local363 = (local351 & 0xFF00FF) + (arg5 & 0xFF00FF);
							local374 = (local363 & 0x1000100) + (local360 - local363 & 0x10000);
							local16[local73++] = local360 - local374 | local374 - (local374 >>> 8);
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
					local546 = (local292 | local295) >>> 8;
					local351 = local21;
					for (local360 = -arg3; local360 < 0; local360++) {
						local363 = (local23 >> 16) * this.anInt2554;
						for (local374 = -arg2; local374 < 0; local374++) {
							local382 = this.anIntArray219[(local21 >> 16) + local363];
							local292 = (local382 & 0xFF00FF) * local197 & 0xFF00FF00;
							local295 = (local382 & 0xFF00) * local197 & 0xFF0000;
							local16[local73++] = ((local292 | local295) >>> 8) + local546;
							local21 += local53;
						}
						local23 += local59;
						local21 = local351;
						local73 += local161;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		}
	}

	@OriginalMember(owner = "client!app", name = "cs", descriptor = "(ZZZIIFIIIIIIZ)V")
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
		@Pc(373) int local373;
		@Pc(382) int local382;
		@Pc(385) int local385;
		@Pc(406) int local406;
		@Pc(414) int local414;
		@Pc(422) int local422;
		@Pc(430) int local430;
		@Pc(604) int local604;
		if (arg10 != 0) {
			@Pc(1028) int local1028;
			@Pc(1036) int local1036;
			@Pc(1048) int local1048;
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
								local373 = this.anIntArray219[(local11 >> 16) + local296];
								if (local373 != 0) {
									if (arg0) {
										local382 = local277[local57];
										local385 = local373 + local382;
										local406 = (local373 & 0xFF00FF) + (local382 & 0xFF00FF);
										local382 = (local406 & 0x1000100) + (local385 - local406 & 0x10000);
										local277[local57] = local385 - local382 | local382 - (local382 >>> 8);
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
					for (local373 = -arg7; local373 < 0; local373++) {
						local382 = (local13 >> 16) * this.anInt2554;
						for (local385 = -arg6; local385 < 0; local385++) {
							if (!arg1 || arg5 < local273[local57]) {
								local406 = this.anIntArray219[(local11 >> 16) + local382];
								if (local406 != 0) {
									if (arg0) {
										local414 = (local406 & 0xFF0000) * local287 & 0xFF000000;
										local422 = (local406 & 0xFF00) * local296 & 0xFF0000;
										local430 = (local406 & 0xFF) * local299 & 0xFF00;
										local406 = (local414 | local422 | local430) >>> 8;
										local1028 = local277[local57];
										local1036 = local406 + local1028;
										local1048 = (local406 & 0xFF00FF) + (local1028 & 0xFF00FF);
										local1028 = (local1048 & 0x1000100) + (local1036 - local1048 & 0x10000);
										local277[local57] = local1036 - local1028 | local1028 - (local1028 >>> 8);
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
									local373 = this.anIntArray219[(local11 >> 16) + local296];
									local382 = local373 + arg9;
									local385 = (local373 & 0xFF00FF) + (arg9 & 0xFF00FF);
									local406 = (local385 & 0x1000100) + (local382 - local385 & 0x10000);
									local373 = local382 - local406 | local406 - (local406 >>> 8);
									local406 = local277[local57];
									local382 = local373 + local406;
									local385 = (local373 & 0xFF00FF) + (local406 & 0xFF00FF);
									local406 = (local385 & 0x1000100) + (local382 - local385 & 0x10000);
									local277[local57] = local382 - local406 | local406 - (local406 >>> 8);
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
					local604 = (local296 | local299) >>> 8;
					local373 = local11;
					for (local382 = -arg7; local382 < 0; local382++) {
						local385 = (local13 >> 16) * this.anInt2554;
						for (local406 = -arg6; local406 < 0; local406++) {
							if (!arg1 || arg5 < local273[local57]) {
								local414 = this.anIntArray219[(local11 >> 16) + local385];
								if (local414 != 0) {
									if (arg0) {
										local296 = (local414 & 0xFF00FF) * local284 & 0xFF00FF00;
										local299 = (local414 & 0xFF00) * local284 & 0xFF0000;
										local414 = ((local296 | local299) >>> 8) + local604;
										local422 = local277[local57];
										local430 = local414 + local422;
										local1028 = (local414 & 0xFF00FF) + (local422 & 0xFF00FF);
										local422 = (local1028 & 0x1000100) + (local430 - local1028 & 0x10000);
										local277[local57] = local430 - local422 | local422 - (local422 >>> 8);
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
						local11 = local373;
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
							if (arg0) {
								local373 = this.anIntArray219[(local11 >> 16) + local296];
								local382 = local373 >>> 24;
								local385 = 256 - local382;
								local406 = local277[local57];
								local277[local57] = ((local373 & 0xFF00FF) * local382 + (local406 & 0xFF00FF) * local385 >> 8 & 0xFFFF00FF) + (((local373 & 0xFF00FF00) >>> 8) * local382 + ((local406 & 0xFF00FF00) >>> 8) * local385 & 0xFF00FF00);
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
				local284 = local11;
				if ((arg9 & 0xFFFFFF) == 16777215) {
					for (local287 = -arg7; local287 < 0; local287++) {
						local296 = (local13 >> 16) * this.anInt2554;
						for (local299 = -arg6; local299 < 0; local299++) {
							if (!arg1 || arg5 < local273[local57]) {
								if (arg0) {
									local373 = this.anIntArray219[(local11 >> 16) + local296];
									local382 = (local373 >>> 24) * (arg9 >>> 24) >> 8;
									local385 = 256 - local382;
									local406 = local277[local57];
									local277[local57] = ((local373 & 0xFF00FF) * local382 + (local406 & 0xFF00FF) * local385 & 0xFF00FF00) + ((local373 & 0xFF00) * local382 + (local406 & 0xFF00) * local385 & 0xFF0000) >> 8;
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
				} else {
					local287 = arg9 >> 16 & 0xFF;
					local296 = arg9 >> 8 & 0xFF;
					local299 = arg9 & 0xFF;
					for (local373 = -arg7; local373 < 0; local373++) {
						local382 = (local13 >> 16) * this.anInt2554;
						for (local385 = -arg6; local385 < 0; local385++) {
							if (!arg1 || arg5 < local273[local57]) {
								local406 = this.anIntArray219[(local11 >> 16) + local382];
								local414 = (local406 >>> 24) * (arg9 >>> 24) >> 8;
								local422 = 256 - local414;
								if (local414 == 255) {
									if (arg0) {
										local430 = (local406 & 0xFF0000) * local287 & 0xFF000000;
										local1028 = (local406 & 0xFF00) * local296 & 0xFF0000;
										local1036 = (local406 & 0xFF) * local299 & 0xFF00;
										local277[local57] = (local430 | local1028 | local1036) >>> 8;
									}
									if (arg1 && arg12) {
										local273[local57] = arg5;
									}
								} else {
									if (arg0) {
										local430 = (local406 & 0xFF0000) * local287 & 0xFF000000;
										local1028 = (local406 & 0xFF00) * local296 & 0xFF0000;
										local1036 = (local406 & 0xFF) * local299 & 0xFF00;
										local406 = (local430 | local1028 | local1036) >>> 8;
										local1048 = local277[local57];
										local277[local57] = ((local406 & 0xFF00FF) * local414 + (local1048 & 0xFF00FF) * local422 & 0xFF00FF00) + ((local406 & 0xFF00) * local414 + (local1048 & 0xFF00) * local422 & 0xFF0000) >> 8;
										if (arg2) {
											@Pc(1088) int local1088 = (local1048 >>> 24) + local414;
											if (local1088 > 255) {
												local1088 = 255;
											}
											local277[local57] |= local1088 << 24;
										}
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
				}
			} else if (arg8 == 3) {
				local284 = local11;
				for (local287 = -arg7; local287 < 0; local287++) {
					local296 = (local13 >> 16) * this.anInt2554;
					for (local299 = -arg6; local299 < 0; local299++) {
						if (!arg1 || arg5 < local273[local57]) {
							if (arg0) {
								local373 = this.anIntArray219[(local11 >> 16) + local296];
								local382 = local373 + arg9;
								local385 = (local373 & 0xFF00FF) + (arg9 & 0xFF00FF);
								local406 = (local385 & 0x1000100) + (local382 - local385 & 0x10000);
								local406 = local382 - local406 | local406 - (local406 >>> 8);
								local414 = (local406 >>> 24) * (arg9 >>> 24) >> 8;
								local422 = 256 - local414;
								if (local414 != 255) {
									local373 = local406;
									local406 = local277[local57];
									local406 = ((local373 & 0xFF00FF) * local414 + (local406 & 0xFF00FF) * local422 & 0xFF00FF00) + ((local373 & 0xFF00) * local414 + (local406 & 0xFF00) * local422 & 0xFF0000) >> 8;
								}
								local277[local57] = local406;
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
				local604 = (local296 | local299) >>> 8;
				local373 = local11;
				for (local382 = -arg7; local382 < 0; local382++) {
					local385 = (local13 >> 16) * this.anInt2554;
					for (local406 = -arg6; local406 < 0; local406++) {
						if (!arg1 || arg5 < local273[local57]) {
							if (arg0) {
								local414 = this.anIntArray219[(local11 >> 16) + local385];
								local422 = local414 >>> 24;
								local430 = 256 - local422;
								local296 = (local414 & 0xFF00FF) * local284 & 0xFF00FF00;
								local299 = (local414 & 0xFF00) * local284 & 0xFF0000;
								local414 = ((local296 | local299) >>> 8) + local604;
								local1028 = local277[local57];
								local277[local57] = ((local414 & 0xFF00FF) * local422 + (local1028 & 0xFF00FF) * local430 & 0xFF00FF00) + ((local414 & 0xFF00) * local422 + (local1028 & 0xFF00) * local430 & 0xFF0000) >> 8;
							}
							if (arg1 && arg12) {
								local273[local57] = arg5;
							}
						}
						local11 += local37;
						local57++;
					}
					local13 += local43;
					local11 = local373;
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
						if (arg0) {
							local277[local57] = this.anIntArray219[(local11 >> 16) + local296];
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
			for (local373 = -arg7; local373 < 0; local373++) {
				local382 = (local13 >> 16) * this.anInt2554;
				for (local385 = -arg6; local385 < 0; local385++) {
					if (!arg1 || arg5 < local273[local57]) {
						if (arg0) {
							local406 = this.anIntArray219[(local11 >> 16) + local382];
							local414 = (local406 & 0xFF0000) * local284 & 0xFF000000;
							local422 = (local406 & 0xFF00) * local287 & 0xFF0000;
							local430 = (local406 & 0xFF) * local296 & 0xFF00;
							local277[local57] = (local414 | local422 | local430) >>> 8;
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
							local373 = this.anIntArray219[(local11 >> 16) + local296];
							local382 = local373 + arg9;
							local385 = (local373 & 0xFF00FF) + (arg9 & 0xFF00FF);
							local406 = (local385 & 0x1000100) + (local382 - local385 & 0x10000);
							local277[local57] = local382 - local406 | local406 - (local406 >>> 8);
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
			local604 = (local296 | local299) >>> 8;
			local373 = local11;
			for (local382 = -arg7; local382 < 0; local382++) {
				local385 = (local13 >> 16) * this.anInt2554;
				for (local406 = -arg6; local406 < 0; local406++) {
					if (!arg1 || arg5 < local273[local57]) {
						if (arg0) {
							local414 = this.anIntArray219[(local11 >> 16) + local385];
							local296 = (local414 & 0xFF00FF) * local284 & 0xFF00FF00;
							local299 = (local414 & 0xFF00) * local284 & 0xFF0000;
							local277[local57] = ((local296 | local299) >>> 8) + local604;
						}
						if (arg1 && arg12) {
							local273[local57] = arg5;
						}
					}
					local11 += local37;
					local57++;
				}
				local13 += local43;
				local11 = local373;
				local57 += local153;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!app", name = "cj", descriptor = "(II)V")
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
		@Pc(114) int local114;
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
							this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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
						@Pc(107) int local107;
						if ((local107 = local20 - (this.anInt2559 << 12)) >= 0) {
							local114 = (anInt2576 - local107) / anInt2576;
							local22 += local114;
							local20 += anInt2576 * local114;
							local16 += local114;
						}
						@Pc(135) int local135;
						if ((local135 = (local20 - anInt2576) / anInt2576) > local22) {
							local22 = local135;
						}
						while (local22 < 0) {
							this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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
							local114 = (anInt2576 - 1 - local20) / anInt2576;
							local22 += local114;
							local20 += anInt2576 * local114;
							local16 += local114;
						}
						@Pc(238) int local238;
						if ((local238 = (local20 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local22) {
							local22 = local238;
						}
						while (local22 < 0) {
							this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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
						@Pc(315) int local315;
						if ((local315 = local18 - (this.anInt2554 << 12)) >= 0) {
							local114 = (anInt2568 - local315) / anInt2568;
							local22 += local114;
							local18 += anInt2568 * local114;
							local16 += local114;
						}
						@Pc(343) int local343;
						if ((local343 = (local18 - anInt2568) / anInt2568) > local22) {
							local22 = local343;
						}
						while (local22 < 0) {
							this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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
					@Pc(409) int local409;
					if ((local409 = local18 - (this.anInt2554 << 12)) >= 0) {
						local114 = (anInt2568 - local409) / anInt2568;
						local22 += local114;
						local18 += anInt2568 * local114;
						local20 += anInt2576 * local114;
						local16 += local114;
					}
					@Pc(443) int local443;
					if ((local443 = (local18 - anInt2568) / anInt2568) > local22) {
						local22 = local443;
					}
					@Pc(455) int local455;
					if ((local455 = local20 - (this.anInt2559 << 12)) >= 0) {
						local114 = (anInt2576 - local455) / anInt2576;
						local22 += local114;
						local18 += anInt2568 * local114;
						local20 += anInt2576 * local114;
						local16 += local114;
					}
					@Pc(489) int local489;
					if ((local489 = (local20 - anInt2576) / anInt2576) > local22) {
						local22 = local489;
					}
					while (local22 < 0) {
						this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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
					@Pc(561) int local561;
					if ((local561 = local18 - (this.anInt2554 << 12)) >= 0) {
						local114 = (anInt2568 - local561) / anInt2568;
						local22 += local114;
						local18 += anInt2568 * local114;
						local20 += anInt2576 * local114;
						local16 += local114;
					}
					@Pc(595) int local595;
					if ((local595 = (local18 - anInt2568) / anInt2568) > local22) {
						local22 = local595;
					}
					if (local20 < 0) {
						local114 = (anInt2576 - 1 - local20) / anInt2576;
						local22 += local114;
						local18 += anInt2568 * local114;
						local20 += anInt2576 * local114;
						local16 += local114;
					}
					@Pc(643) int local643;
					if ((local643 = (local20 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local22) {
						local22 = local643;
					}
					while (local22 < 0) {
						this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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
						local114 = (anInt2568 - 1 - local18) / anInt2568;
						local22 += local114;
						local18 += anInt2568 * local114;
						local16 += local114;
					}
					@Pc(756) int local756;
					if ((local756 = (local18 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local22) {
						local22 = local756;
					}
					while (local22 < 0) {
						this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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
					local114 = (anInt2568 - 1 - local18) / anInt2568;
					local22 += local114;
					local18 += anInt2568 * local114;
					local20 += anInt2576 * local114;
					local16 += local114;
				}
				@Pc(862) int local862;
				if ((local862 = (local18 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local22) {
					local22 = local862;
				}
				@Pc(874) int local874;
				if ((local874 = local20 - (this.anInt2559 << 12)) >= 0) {
					local114 = (anInt2576 - local874) / anInt2576;
					local22 += local114;
					local18 += anInt2568 * local114;
					local20 += anInt2576 * local114;
					local16 += local114;
				}
				@Pc(908) int local908;
				if ((local908 = (local20 - anInt2576) / anInt2576) > local22) {
					local22 = local908;
				}
				while (local22 < 0) {
					this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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
					local114 = (anInt2568 - 1 - local18) / anInt2568;
					local22 += local114;
					local18 += anInt2568 * local114;
					local20 += anInt2576 * local114;
					local16 += local114;
				}
				@Pc(1016) int local1016;
				if ((local1016 = (local18 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local22) {
					local22 = local1016;
				}
				if (local20 < 0) {
					local114 = (anInt2576 - 1 - local20) / anInt2576;
					local22 += local114;
					local18 += anInt2568 * local114;
					local20 += anInt2576 * local114;
					local16 += local114;
				}
				@Pc(1064) int local1064;
				if ((local1064 = (local20 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local22) {
					local22 = local1064;
				}
				while (local22 < 0) {
					this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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

	@OriginalMember(owner = "client!app", name = "ck", descriptor = "(II)V")
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
		@Pc(114) int local114;
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
							this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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
						@Pc(107) int local107;
						if ((local107 = local20 - (this.anInt2559 << 12)) >= 0) {
							local114 = (anInt2576 - local107) / anInt2576;
							local22 += local114;
							local20 += anInt2576 * local114;
							local16 += local114;
						}
						@Pc(135) int local135;
						if ((local135 = (local20 - anInt2576) / anInt2576) > local22) {
							local22 = local135;
						}
						while (local22 < 0) {
							this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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
							local114 = (anInt2576 - 1 - local20) / anInt2576;
							local22 += local114;
							local20 += anInt2576 * local114;
							local16 += local114;
						}
						@Pc(238) int local238;
						if ((local238 = (local20 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local22) {
							local22 = local238;
						}
						while (local22 < 0) {
							this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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
						@Pc(315) int local315;
						if ((local315 = local18 - (this.anInt2554 << 12)) >= 0) {
							local114 = (anInt2568 - local315) / anInt2568;
							local22 += local114;
							local18 += anInt2568 * local114;
							local16 += local114;
						}
						@Pc(343) int local343;
						if ((local343 = (local18 - anInt2568) / anInt2568) > local22) {
							local22 = local343;
						}
						while (local22 < 0) {
							this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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
					@Pc(409) int local409;
					if ((local409 = local18 - (this.anInt2554 << 12)) >= 0) {
						local114 = (anInt2568 - local409) / anInt2568;
						local22 += local114;
						local18 += anInt2568 * local114;
						local20 += anInt2576 * local114;
						local16 += local114;
					}
					@Pc(443) int local443;
					if ((local443 = (local18 - anInt2568) / anInt2568) > local22) {
						local22 = local443;
					}
					@Pc(455) int local455;
					if ((local455 = local20 - (this.anInt2559 << 12)) >= 0) {
						local114 = (anInt2576 - local455) / anInt2576;
						local22 += local114;
						local18 += anInt2568 * local114;
						local20 += anInt2576 * local114;
						local16 += local114;
					}
					@Pc(489) int local489;
					if ((local489 = (local20 - anInt2576) / anInt2576) > local22) {
						local22 = local489;
					}
					while (local22 < 0) {
						this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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
					@Pc(561) int local561;
					if ((local561 = local18 - (this.anInt2554 << 12)) >= 0) {
						local114 = (anInt2568 - local561) / anInt2568;
						local22 += local114;
						local18 += anInt2568 * local114;
						local20 += anInt2576 * local114;
						local16 += local114;
					}
					@Pc(595) int local595;
					if ((local595 = (local18 - anInt2568) / anInt2568) > local22) {
						local22 = local595;
					}
					if (local20 < 0) {
						local114 = (anInt2576 - 1 - local20) / anInt2576;
						local22 += local114;
						local18 += anInt2568 * local114;
						local20 += anInt2576 * local114;
						local16 += local114;
					}
					@Pc(643) int local643;
					if ((local643 = (local20 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local22) {
						local22 = local643;
					}
					while (local22 < 0) {
						this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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
						local114 = (anInt2568 - 1 - local18) / anInt2568;
						local22 += local114;
						local18 += anInt2568 * local114;
						local16 += local114;
					}
					@Pc(756) int local756;
					if ((local756 = (local18 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local22) {
						local22 = local756;
					}
					while (local22 < 0) {
						this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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
					local114 = (anInt2568 - 1 - local18) / anInt2568;
					local22 += local114;
					local18 += anInt2568 * local114;
					local20 += anInt2576 * local114;
					local16 += local114;
				}
				@Pc(862) int local862;
				if ((local862 = (local18 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local22) {
					local22 = local862;
				}
				@Pc(874) int local874;
				if ((local874 = local20 - (this.anInt2559 << 12)) >= 0) {
					local114 = (anInt2576 - local874) / anInt2576;
					local22 += local114;
					local18 += anInt2568 * local114;
					local20 += anInt2576 * local114;
					local16 += local114;
				}
				@Pc(908) int local908;
				if ((local908 = (local20 - anInt2576) / anInt2576) > local22) {
					local22 = local908;
				}
				while (local22 < 0) {
					this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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
					local114 = (anInt2568 - 1 - local18) / anInt2568;
					local22 += local114;
					local18 += anInt2568 * local114;
					local20 += anInt2576 * local114;
					local16 += local114;
				}
				@Pc(1016) int local1016;
				if ((local1016 = (local18 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local22) {
					local22 = local1016;
				}
				if (local20 < 0) {
					local114 = (anInt2576 - 1 - local20) / anInt2576;
					local22 += local114;
					local18 += anInt2568 * local114;
					local20 += anInt2576 * local114;
					local16 += local114;
				}
				@Pc(1064) int local1064;
				if ((local1064 = (local20 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local22) {
					local22 = local1064;
				}
				while (local22 < 0) {
					this.method18311((local20 >> 12) * this.anInt2554 + (local18 >> 12), local16++, local3, arg0, arg1);
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

	@OriginalMember(owner = "client!app", name = "ca", descriptor = "([I[III)V")
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
		@Pc(121) int local121;
		@Pc(125) int local125;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(229) int local229;
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
								local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
								local125 = local121 >>> 24;
								local129 = 256 - local125;
								local133 = local3[local28];
								local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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
							@Pc(222) int local222;
							if ((local222 = local32 - (this.anInt2559 << 12)) >= 0) {
								local229 = (anInt2576 - local222) / anInt2576;
								local34 += local229;
								local32 += anInt2576 * local229;
								local28 += local229;
							}
							@Pc(250) int local250;
							if ((local250 = (local32 - anInt2576) / anInt2576) > local34) {
								local34 = local250;
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
								local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
								local125 = local121 >>> 24;
								local129 = 256 - local125;
								local133 = local3[local28];
								local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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
								local229 = (anInt2576 - 1 - local32) / anInt2576;
								local34 += local229;
								local32 += anInt2576 * local229;
								local28 += local229;
							}
							@Pc(456) int local456;
							if ((local456 = (local32 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local34) {
								local34 = local456;
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
								local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
								local125 = local121 >>> 24;
								local129 = 256 - local125;
								local133 = local3[local28];
								local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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
							@Pc(636) int local636;
							if ((local636 = local30 - (this.anInt2554 << 12)) >= 0) {
								local229 = (anInt2568 - local636) / anInt2568;
								local34 += local229;
								local30 += anInt2568 * local229;
								local28 += local229;
							}
							@Pc(664) int local664;
							if ((local664 = (local30 - anInt2568) / anInt2568) > local34) {
								local34 = local664;
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
								local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
								local125 = local121 >>> 24;
								local129 = 256 - local125;
								local133 = local3[local28];
								local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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
						@Pc(833) int local833;
						if ((local833 = local30 - (this.anInt2554 << 12)) >= 0) {
							local229 = (anInt2568 - local833) / anInt2568;
							local34 += local229;
							local30 += anInt2568 * local229;
							local32 += anInt2576 * local229;
							local28 += local229;
						}
						@Pc(867) int local867;
						if ((local867 = (local30 - anInt2568) / anInt2568) > local34) {
							local34 = local867;
						}
						@Pc(879) int local879;
						if ((local879 = local32 - (this.anInt2559 << 12)) >= 0) {
							local229 = (anInt2576 - local879) / anInt2576;
							local34 += local229;
							local30 += anInt2568 * local229;
							local32 += anInt2576 * local229;
							local28 += local229;
						}
						@Pc(913) int local913;
						if ((local913 = (local32 - anInt2576) / anInt2576) > local34) {
							local34 = local913;
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
							local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
							local125 = local121 >>> 24;
							local129 = 256 - local125;
							local133 = local3[local28];
							local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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
						@Pc(1088) int local1088;
						if ((local1088 = local30 - (this.anInt2554 << 12)) >= 0) {
							local229 = (anInt2568 - local1088) / anInt2568;
							local34 += local229;
							local30 += anInt2568 * local229;
							local32 += anInt2576 * local229;
							local28 += local229;
						}
						@Pc(1122) int local1122;
						if ((local1122 = (local30 - anInt2568) / anInt2568) > local34) {
							local34 = local1122;
						}
						if (local32 < 0) {
							local229 = (anInt2576 - 1 - local32) / anInt2576;
							local34 += local229;
							local30 += anInt2568 * local229;
							local32 += anInt2576 * local229;
							local28 += local229;
						}
						@Pc(1170) int local1170;
						if ((local1170 = (local32 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local34) {
							local34 = local1170;
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
							local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
							local125 = local121 >>> 24;
							local129 = 256 - local125;
							local133 = local3[local28];
							local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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
							local229 = (anInt2568 - 1 - local30) / anInt2568;
							local34 += local229;
							local30 += anInt2568 * local229;
							local28 += local229;
						}
						@Pc(1386) int local1386;
						if ((local1386 = (local30 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local34) {
							local34 = local1386;
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
							local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
							local125 = local121 >>> 24;
							local129 = 256 - local125;
							local133 = local3[local28];
							local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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
						local229 = (anInt2568 - 1 - local30) / anInt2568;
						local34 += local229;
						local30 += anInt2568 * local229;
						local32 += anInt2576 * local229;
						local28 += local229;
					}
					@Pc(1595) int local1595;
					if ((local1595 = (local30 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local34) {
						local34 = local1595;
					}
					@Pc(1607) int local1607;
					if ((local1607 = local32 - (this.anInt2559 << 12)) >= 0) {
						local229 = (anInt2576 - local1607) / anInt2576;
						local34 += local229;
						local30 += anInt2568 * local229;
						local32 += anInt2576 * local229;
						local28 += local229;
					}
					@Pc(1641) int local1641;
					if ((local1641 = (local32 - anInt2576) / anInt2576) > local34) {
						local34 = local1641;
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
						local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
						local125 = local121 >>> 24;
						local129 = 256 - local125;
						local133 = local3[local28];
						local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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
						local229 = (anInt2568 - 1 - local30) / anInt2568;
						local34 += local229;
						local30 += anInt2568 * local229;
						local32 += anInt2576 * local229;
						local28 += local229;
					}
					@Pc(1852) int local1852;
					if ((local1852 = (local30 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local34) {
						local34 = local1852;
					}
					if (local32 < 0) {
						local229 = (anInt2576 - 1 - local32) / anInt2576;
						local34 += local229;
						local30 += anInt2568 * local229;
						local32 += anInt2576 * local229;
						local28 += local229;
					}
					@Pc(1900) int local1900;
					if ((local1900 = (local32 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local34) {
						local34 = local1900;
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
						local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
						local125 = local121 >>> 24;
						local129 = 256 - local125;
						local133 = local3[local28];
						local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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

	@OriginalMember(owner = "client!app", name = "cr", descriptor = "([I[III)V")
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
		@Pc(121) int local121;
		@Pc(125) int local125;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(229) int local229;
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
								local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
								local125 = local121 >>> 24;
								local129 = 256 - local125;
								local133 = local3[local28];
								local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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
							@Pc(222) int local222;
							if ((local222 = local32 - (this.anInt2559 << 12)) >= 0) {
								local229 = (anInt2576 - local222) / anInt2576;
								local34 += local229;
								local32 += anInt2576 * local229;
								local28 += local229;
							}
							@Pc(250) int local250;
							if ((local250 = (local32 - anInt2576) / anInt2576) > local34) {
								local34 = local250;
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
								local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
								local125 = local121 >>> 24;
								local129 = 256 - local125;
								local133 = local3[local28];
								local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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
								local229 = (anInt2576 - 1 - local32) / anInt2576;
								local34 += local229;
								local32 += anInt2576 * local229;
								local28 += local229;
							}
							@Pc(456) int local456;
							if ((local456 = (local32 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local34) {
								local34 = local456;
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
								local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
								local125 = local121 >>> 24;
								local129 = 256 - local125;
								local133 = local3[local28];
								local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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
							@Pc(636) int local636;
							if ((local636 = local30 - (this.anInt2554 << 12)) >= 0) {
								local229 = (anInt2568 - local636) / anInt2568;
								local34 += local229;
								local30 += anInt2568 * local229;
								local28 += local229;
							}
							@Pc(664) int local664;
							if ((local664 = (local30 - anInt2568) / anInt2568) > local34) {
								local34 = local664;
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
								local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
								local125 = local121 >>> 24;
								local129 = 256 - local125;
								local133 = local3[local28];
								local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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
						@Pc(833) int local833;
						if ((local833 = local30 - (this.anInt2554 << 12)) >= 0) {
							local229 = (anInt2568 - local833) / anInt2568;
							local34 += local229;
							local30 += anInt2568 * local229;
							local32 += anInt2576 * local229;
							local28 += local229;
						}
						@Pc(867) int local867;
						if ((local867 = (local30 - anInt2568) / anInt2568) > local34) {
							local34 = local867;
						}
						@Pc(879) int local879;
						if ((local879 = local32 - (this.anInt2559 << 12)) >= 0) {
							local229 = (anInt2576 - local879) / anInt2576;
							local34 += local229;
							local30 += anInt2568 * local229;
							local32 += anInt2576 * local229;
							local28 += local229;
						}
						@Pc(913) int local913;
						if ((local913 = (local32 - anInt2576) / anInt2576) > local34) {
							local34 = local913;
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
							local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
							local125 = local121 >>> 24;
							local129 = 256 - local125;
							local133 = local3[local28];
							local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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
						@Pc(1088) int local1088;
						if ((local1088 = local30 - (this.anInt2554 << 12)) >= 0) {
							local229 = (anInt2568 - local1088) / anInt2568;
							local34 += local229;
							local30 += anInt2568 * local229;
							local32 += anInt2576 * local229;
							local28 += local229;
						}
						@Pc(1122) int local1122;
						if ((local1122 = (local30 - anInt2568) / anInt2568) > local34) {
							local34 = local1122;
						}
						if (local32 < 0) {
							local229 = (anInt2576 - 1 - local32) / anInt2576;
							local34 += local229;
							local30 += anInt2568 * local229;
							local32 += anInt2576 * local229;
							local28 += local229;
						}
						@Pc(1170) int local1170;
						if ((local1170 = (local32 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local34) {
							local34 = local1170;
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
							local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
							local125 = local121 >>> 24;
							local129 = 256 - local125;
							local133 = local3[local28];
							local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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
							local229 = (anInt2568 - 1 - local30) / anInt2568;
							local34 += local229;
							local30 += anInt2568 * local229;
							local28 += local229;
						}
						@Pc(1386) int local1386;
						if ((local1386 = (local30 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local34) {
							local34 = local1386;
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
							local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
							local125 = local121 >>> 24;
							local129 = 256 - local125;
							local133 = local3[local28];
							local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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
						local229 = (anInt2568 - 1 - local30) / anInt2568;
						local34 += local229;
						local30 += anInt2568 * local229;
						local32 += anInt2576 * local229;
						local28 += local229;
					}
					@Pc(1595) int local1595;
					if ((local1595 = (local30 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local34) {
						local34 = local1595;
					}
					@Pc(1607) int local1607;
					if ((local1607 = local32 - (this.anInt2559 << 12)) >= 0) {
						local229 = (anInt2576 - local1607) / anInt2576;
						local34 += local229;
						local30 += anInt2568 * local229;
						local32 += anInt2576 * local229;
						local28 += local229;
					}
					@Pc(1641) int local1641;
					if ((local1641 = (local32 - anInt2576) / anInt2576) > local34) {
						local34 = local1641;
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
						local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
						local125 = local121 >>> 24;
						local129 = 256 - local125;
						local133 = local3[local28];
						local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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
						local229 = (anInt2568 - 1 - local30) / anInt2568;
						local34 += local229;
						local30 += anInt2568 * local229;
						local32 += anInt2576 * local229;
						local28 += local229;
					}
					@Pc(1852) int local1852;
					if ((local1852 = (local30 + 1 - (this.anInt2554 << 12) - anInt2568) / anInt2568) > local34) {
						local34 = local1852;
					}
					if (local32 < 0) {
						local229 = (anInt2576 - 1 - local32) / anInt2576;
						local34 += local229;
						local30 += anInt2568 * local229;
						local32 += anInt2576 * local229;
						local28 += local229;
					}
					@Pc(1900) int local1900;
					if ((local1900 = (local32 + 1 - (this.anInt2559 << 12) - anInt2576) / anInt2576) > local34) {
						local34 = local1900;
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
						local121 = this.anIntArray219[(local32 >> 12) * this.anInt2554 + (local30 >> 12)];
						local125 = local121 >>> 24;
						local129 = 256 - local125;
						local133 = local3[local28];
						local3[local28++] = ((local121 & 0xFF00FF) * local125 + (local133 & 0xFF00FF) * local129 & 0xFF00FF00) + ((local121 & 0xFF00) * local125 + (local133 & 0xFF00) * local129 & 0xFF0000) >> 8;
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

	@OriginalMember(owner = "client!app", name = "ae", descriptor = "(IIII[III)V")
	@Override
	public void method18285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg6 - arg2;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			@Pc(16) int local16 = (arg1 + local5) * arg2 + arg0;
			for (@Pc(18) int local18 = 0; local18 < arg2; local18++) {
				this.anIntArray219[local16 + local18] = arg4[arg5++];
			}
			arg5 += local3;
		}
	}

	@OriginalMember(owner = "client!app", name = "cx", descriptor = "(IIII[III)V")
	void method18314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg6 - arg2;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			@Pc(16) int local16 = (arg1 + local5) * arg2 + arg0;
			for (@Pc(18) int local18 = 0; local18 < arg2; local18++) {
				arg4[arg5++] = this.anIntArray219[local16 + local18];
			}
			arg5 += local3;
		}
	}

	@OriginalMember(owner = "client!app", name = "av", descriptor = "(IIIIIIII)V")
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
				@Pc(351) int local351;
				@Pc(360) int local360;
				@Pc(363) int local363;
				@Pc(374) int local374;
				@Pc(382) int local382;
				@Pc(390) int local390;
				@Pc(398) int local398;
				@Pc(546) int local546;
				if (arg6 != 0) {
					@Pc(906) int local906;
					@Pc(914) int local914;
					@Pc(926) int local926;
					if (arg6 != 1) {
						if (arg6 != 2) {
							throw new IllegalArgumentException();
						}
						if (arg4 == 1) {
							local197 = local21;
							for (local283 = -arg3; local283 < 0; local283++) {
								local292 = (local23 >> 16) * this.anInt2554;
								for (local295 = -arg2; local295 < 0; local295++) {
									local351 = this.anIntArray219[(local21 >> 16) + local292];
									if (local351 == 0) {
										local73++;
									} else {
										local360 = local16[local73];
										local363 = local351 + local360;
										local374 = (local351 & 0xFF00FF) + (local360 & 0xFF00FF);
										local360 = (local374 & 0x1000100) + (local363 - local374 & 0x10000);
										local16[local73++] = local363 - local360 | local360 - (local360 >>> 8);
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
							for (local351 = -arg3; local351 < 0; local351++) {
								local360 = (local23 >> 16) * this.anInt2554;
								for (local363 = -arg2; local363 < 0; local363++) {
									local374 = this.anIntArray219[(local21 >> 16) + local360];
									if (local374 == 0) {
										local73++;
									} else {
										local382 = (local374 & 0xFF0000) * local283 & 0xFF000000;
										local390 = (local374 & 0xFF00) * local292 & 0xFF0000;
										local398 = (local374 & 0xFF) * local295 & 0xFF00;
										local374 = (local382 | local390 | local398) >>> 8;
										local906 = local16[local73];
										local914 = local374 + local906;
										local926 = (local374 & 0xFF00FF) + (local906 & 0xFF00FF);
										local906 = (local926 & 0x1000100) + (local914 - local926 & 0x10000);
										local16[local73++] = local914 - local906 | local906 - (local906 >>> 8);
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
									local351 = this.anIntArray219[(local21 >> 16) + local292];
									local360 = local351 + arg5;
									local363 = (local351 & 0xFF00FF) + (arg5 & 0xFF00FF);
									local374 = (local363 & 0x1000100) + (local360 - local363 & 0x10000);
									local351 = local360 - local374 | local374 - (local374 >>> 8);
									local374 = local16[local73];
									local360 = local351 + local374;
									local363 = (local351 & 0xFF00FF) + (local374 & 0xFF00FF);
									local374 = (local363 & 0x1000100) + (local360 - local363 & 0x10000);
									local16[local73++] = local360 - local374 | local374 - (local374 >>> 8);
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
							local546 = (local292 | local295) >>> 8;
							local351 = local21;
							for (local360 = -arg3; local360 < 0; local360++) {
								local363 = (local23 >> 16) * this.anInt2554;
								for (local374 = -arg2; local374 < 0; local374++) {
									local382 = this.anIntArray219[(local21 >> 16) + local363];
									if (local382 == 0) {
										local73++;
									} else {
										local292 = (local382 & 0xFF00FF) * local197 & 0xFF00FF00;
										local295 = (local382 & 0xFF00) * local197 & 0xFF0000;
										local382 = ((local292 | local295) >>> 8) + local546;
										local390 = local16[local73];
										local398 = local382 + local390;
										local906 = (local382 & 0xFF00FF) + (local390 & 0xFF00FF);
										local390 = (local906 & 0x1000100) + (local398 - local906 & 0x10000);
										local16[local73++] = local398 - local390 | local390 - (local390 >>> 8);
									}
									local21 += local53;
								}
								local23 += local59;
								local21 = local351;
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
								local351 = this.anIntArray219[(local21 >> 16) + local292];
								local360 = local351 >>> 24;
								local363 = 256 - local360;
								local374 = local16[local73];
								local16[local73++] = ((local351 & 0xFF00FF) * local360 + (local374 & 0xFF00FF) * local363 >> 8 & 0xFFFF00FF) + (((local351 & 0xFF00FF00) >>> 8) * local360 + ((local374 & 0xFF00FF00) >>> 8) * local363 & 0xFF00FF00);
								local21 += local53;
							}
							local23 += local59;
							local21 = local197;
							local73 += local161;
						}
					} else if (arg4 == 0) {
						local197 = local21;
						if ((arg5 & 0xFFFFFF) == 16777215) {
							for (local283 = -arg3; local283 < 0; local283++) {
								local292 = (local23 >> 16) * this.anInt2554;
								for (local295 = -arg2; local295 < 0; local295++) {
									local351 = this.anIntArray219[(local21 >> 16) + local292];
									local360 = (local351 >>> 24) * (arg5 >>> 24) >> 8;
									local363 = 256 - local360;
									local374 = local16[local73];
									local16[local73++] = ((local351 & 0xFF00FF) * local360 + (local374 & 0xFF00FF) * local363 & 0xFF00FF00) + ((local351 & 0xFF00) * local360 + (local374 & 0xFF00) * local363 & 0xFF0000) >> 8;
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
							for (local351 = -arg3; local351 < 0; local351++) {
								local360 = (local23 >> 16) * this.anInt2554;
								for (local363 = -arg2; local363 < 0; local363++) {
									local374 = this.anIntArray219[(local21 >> 16) + local360];
									local382 = (local374 >>> 24) * (arg5 >>> 24) >> 8;
									local390 = 256 - local382;
									if (local382 == 255) {
										local398 = (local374 & 0xFF0000) * local283 & 0xFF000000;
										local906 = (local374 & 0xFF00) * local292 & 0xFF0000;
										local914 = (local374 & 0xFF) * local295 & 0xFF00;
										local16[local73++] = (local398 | local906 | local914) >>> 8;
									} else {
										local398 = (local374 & 0xFF0000) * local283 & 0xFF000000;
										local906 = (local374 & 0xFF00) * local292 & 0xFF0000;
										local914 = (local374 & 0xFF) * local295 & 0xFF00;
										local374 = (local398 | local906 | local914) >>> 8;
										local926 = local16[local73];
										local16[local73++] = ((local374 & 0xFF00FF) * local382 + (local926 & 0xFF00FF) * local390 & 0xFF00FF00) + ((local374 & 0xFF00) * local382 + (local926 & 0xFF00) * local390 & 0xFF0000) >> 8;
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
						for (local283 = -arg3; local283 < 0; local283++) {
							local292 = (local23 >> 16) * this.anInt2554;
							for (local295 = -arg2; local295 < 0; local295++) {
								local351 = this.anIntArray219[(local21 >> 16) + local292];
								local360 = local351 + arg5;
								local363 = (local351 & 0xFF00FF) + (arg5 & 0xFF00FF);
								local374 = (local363 & 0x1000100) + (local360 - local363 & 0x10000);
								local374 = local360 - local374 | local374 - (local374 >>> 8);
								local382 = (local374 >>> 24) * (arg5 >>> 24) >> 8;
								local390 = 256 - local382;
								if (local382 != 255) {
									local351 = local374;
									local374 = local16[local73];
									local374 = ((local351 & 0xFF00FF) * local382 + (local374 & 0xFF00FF) * local390 & 0xFF00FF00) + ((local351 & 0xFF00) * local382 + (local374 & 0xFF00) * local390 & 0xFF0000) >> 8;
								}
								local16[local73++] = local374;
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
						local546 = (local292 | local295) >>> 8;
						local351 = local21;
						for (local360 = -arg3; local360 < 0; local360++) {
							local363 = (local23 >> 16) * this.anInt2554;
							for (local374 = -arg2; local374 < 0; local374++) {
								local382 = this.anIntArray219[(local21 >> 16) + local363];
								local390 = local382 >>> 24;
								local398 = 256 - local390;
								local292 = (local382 & 0xFF00FF) * local197 & 0xFF00FF00;
								local295 = (local382 & 0xFF00) * local197 & 0xFF0000;
								local382 = ((local292 | local295) >>> 8) + local546;
								local906 = local16[local73];
								local16[local73++] = ((local382 & 0xFF00FF) * local390 + (local906 & 0xFF00FF) * local398 & 0xFF00FF00) + ((local382 & 0xFF00) * local390 + (local906 & 0xFF00) * local398 & 0xFF0000) >> 8;
								local21 += local53;
							}
							local23 += local59;
							local21 = local351;
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
							local16[local73++] = this.anIntArray219[(local21 >> 16) + local292];
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
					for (local351 = -arg3; local351 < 0; local351++) {
						local360 = (local23 >> 16) * this.anInt2554;
						for (local363 = -arg2; local363 < 0; local363++) {
							local374 = this.anIntArray219[(local21 >> 16) + local360];
							local382 = (local374 & 0xFF0000) * local197 & 0xFF000000;
							local390 = (local374 & 0xFF00) * local283 & 0xFF0000;
							local398 = (local374 & 0xFF) * local292 & 0xFF00;
							local16[local73++] = (local382 | local390 | local398) >>> 8;
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
							local351 = this.anIntArray219[(local21 >> 16) + local292];
							local360 = local351 + arg5;
							local363 = (local351 & 0xFF00FF) + (arg5 & 0xFF00FF);
							local374 = (local363 & 0x1000100) + (local360 - local363 & 0x10000);
							local16[local73++] = local360 - local374 | local374 - (local374 >>> 8);
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
					local546 = (local292 | local295) >>> 8;
					local351 = local21;
					for (local360 = -arg3; local360 < 0; local360++) {
						local363 = (local23 >> 16) * this.anInt2554;
						for (local374 = -arg2; local374 < 0; local374++) {
							local382 = this.anIntArray219[(local21 >> 16) + local363];
							local292 = (local382 & 0xFF00FF) * local197 & 0xFF00FF00;
							local295 = (local382 & 0xFF00) * local197 & 0xFF0000;
							local16[local73++] = ((local292 | local295) >>> 8) + local546;
							local21 += local53;
						}
						local23 += local59;
						local21 = local351;
						local73 += local161;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		}
	}

	@OriginalMember(owner = "client!app", name = "ao", descriptor = "(IIII[I[III)V")
	@Override
	public void method18286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.method18315(arg0, arg1, arg2, arg3, arg4, arg6, arg7);
	}

	@OriginalMember(owner = "client!app", name = "cw", descriptor = "(IIII[III)V")
	void method18315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg6 - arg2;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			@Pc(16) int local16 = (arg1 + local5) * arg2 + arg0;
			for (@Pc(18) int local18 = 0; local18 < arg2; local18++) {
				arg4[arg5++] = this.anIntArray219[local16 + local18];
			}
			arg5 += local3;
		}
	}
}
