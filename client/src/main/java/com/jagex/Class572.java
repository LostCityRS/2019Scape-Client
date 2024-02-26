package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class572 {

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
	static final int anInt5273 = 2;

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
	static final int anInt5274 = 2014;

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
	static final int anInt5275 = 12;

	@OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
	static final int anInt5276 = 1;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
	static final int anInt5277 = 39424;

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
	static final int anInt5278 = 8;

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
	static final int anInt5281 = -2014;

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
	int anInt5280;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
	int anInt5279 = 0;

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "Lclient!us;")
	Class600 aClass600_2;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!us;)V")
	Class572(@OriginalArg(0) Class600 arg0) {
		this.aClass600_2 = arg0;
	}

	@OriginalMember(owner = "client!tg", name = "u", descriptor = "([IIIIIIII)Z")
	boolean method31736(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 > arg7) {
			arg4 = arg7;
		}
		if (arg3 < 0) {
			arg3 = 0;
		}
		if (arg3 >= arg4) {
			return true;
		}
		arg1 += arg3 - 1;
		@Pc(25) int local25 = arg4 - arg3 >> 2;
		arg5 += arg6 * arg3;
		@Pc(47) int local47;
		@Pc(58) int local58;
		if (this.anInt5280 == 1) {
			this.anInt5279 += local25;
			while (true) {
				local25--;
				if (local25 < 0) {
					local25 = arg4 - arg3 & 0x3;
					while (true) {
						local25--;
						if (local25 < 0) {
							return true;
						}
						arg1++;
						if (arg5 < arg0[arg1]) {
							arg0[arg1] = arg5;
						}
						arg5 += arg6;
					}
				}
				local47 = arg1 + 1;
				if (arg5 < arg0[local47]) {
					arg0[local47] = arg5;
				}
				local58 = arg5 + arg6;
				local47++;
				if (local58 < arg0[local47]) {
					arg0[local47] = local58;
				}
				local58 += arg6;
				local47++;
				if (local58 < arg0[local47]) {
					arg0[local47] = local58;
				}
				local58 += arg6;
				arg1 = local47 + 1;
				if (local58 < arg0[arg1]) {
					arg0[arg1] = local58;
				}
				arg5 = local58 + arg6;
			}
		} else {
			arg5 -= 39424;
			while (true) {
				local25--;
				if (local25 < 0) {
					local25 = arg4 - arg3 & 0x3;
					while (true) {
						local25--;
						if (local25 < 0) {
							return true;
						}
						arg1++;
						if (arg5 < arg0[arg1]) {
							return false;
						}
						arg5 += arg6;
					}
				}
				local47 = arg1 + 1;
				if (arg5 < arg0[local47]) {
					return false;
				}
				local58 = arg5 + arg6;
				local47++;
				if (local58 < arg0[local47]) {
					return false;
				}
				local58 += arg6;
				local47++;
				if (local58 < arg0[local47]) {
					return false;
				}
				local58 += arg6;
				arg1 = local47 + 1;
				if (local58 < arg0[arg1]) {
					return false;
				}
				arg5 = local58 + arg6;
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "(IIIIIIIII)Z")
	boolean method31737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg0 > 2014 || arg1 > 2014 || arg2 > 2014 || arg3 > 2014 || arg4 > 2014 || arg5 > 2014) {
			return false;
		} else if (arg0 >= -2014 && arg1 >= -2014 && arg2 >= -2014 && arg3 >= -2014 && arg4 >= -2014 && arg5 >= -2014) {
			@Pc(51) int local51;
			if (this.anInt5280 == 2) {
				local51 = arg3 + arg0 * this.aClass600_2.anInt5377;
				if (local51 >= 0 && local51 < this.aClass600_2.anIntArray487.length && (arg6 << 8) - 39424 < this.aClass600_2.anIntArray487[local51]) {
					return false;
				}
				local51 = arg4 + arg1 * this.aClass600_2.anInt5377;
				if (local51 >= 0 && local51 < this.aClass600_2.anIntArray487.length && (arg7 << 8) - 39424 < this.aClass600_2.anIntArray487[local51]) {
					return false;
				}
				local51 = arg5 + arg2 * this.aClass600_2.anInt5377;
				if (local51 >= 0 && local51 < this.aClass600_2.anIntArray487.length && (arg8 << 8) - 39424 < this.aClass600_2.anIntArray487[local51]) {
					return false;
				}
			}
			local51 = arg4 - arg3;
			@Pc(138) int local138 = arg1 - arg0;
			@Pc(142) int local142 = arg5 - arg3;
			@Pc(146) int local146 = arg2 - arg0;
			@Pc(150) int local150 = arg7 - arg6;
			@Pc(154) int local154 = arg8 - arg6;
			if (arg0 < arg1 && arg0 < arg2) {
				arg0--;
				if (arg1 > arg2) {
					arg1++;
				} else {
					arg2++;
				}
			} else if (arg1 < arg2) {
				arg1--;
				if (arg0 > arg2) {
					arg0++;
				} else {
					arg2++;
				}
			} else {
				arg2--;
				if (arg0 > arg1) {
					arg0++;
				} else {
					arg1++;
				}
			}
			@Pc(188) int local188 = 0;
			if (arg1 != arg0) {
				local188 = (arg4 - arg3 << 12) / (arg1 - arg0);
			}
			@Pc(203) int local203 = 0;
			if (arg2 != arg1) {
				local203 = (arg5 - arg4 << 12) / (arg2 - arg1);
			}
			@Pc(218) int local218 = 0;
			if (arg2 != arg0) {
				local218 = (arg3 - arg5 << 12) / (arg0 - arg2);
			}
			@Pc(239) int local239 = local51 * local146 - local142 * local138;
			if (local239 == 0) {
				return false;
			}
			@Pc(255) int local255 = (local150 * local146 - local154 * local138 << 8) / local239;
			@Pc(267) int local267 = (local154 * local51 - local150 * local142 << 8) / local239;
			if (arg0 <= arg1 && arg0 <= arg2) {
				if (arg0 >= this.aClass600_2.anInt5369) {
					return true;
				}
				if (arg1 > this.aClass600_2.anInt5369) {
					arg1 = this.aClass600_2.anInt5369;
				}
				if (arg2 > this.aClass600_2.anInt5369) {
					arg2 = this.aClass600_2.anInt5369;
				}
				arg6 = (arg6 << 8) - local255 * arg3 + local255;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0xC;
					if (arg0 < 0) {
						arg5 -= local218 * arg0;
						arg3 -= local188 * arg0;
						arg6 -= local267 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0xC;
					if (arg1 < 0) {
						arg4 -= local203 * arg1;
						arg1 = 0;
					}
					if ((arg0 == arg1 || local218 >= local188) && (arg0 != arg1 || local218 <= local203)) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 *= this.aClass600_2.anInt5377;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!this.method31738(this.aClass600_2.anIntArray487, arg0, 0, (arg4 >> 12) - 1, (arg5 >> 12) + 1, arg6, local255, this.aClass600_2.anInt5377)) {
										return false;
									}
									arg5 += local218;
									arg4 += local203;
									arg6 += local267;
									arg0 += this.aClass600_2.anInt5377;
								}
							}
							if (!this.method31738(this.aClass600_2.anIntArray487, arg0, 0, (arg3 >> 12) - 1, (arg5 >> 12) + 1, arg6, local255, this.aClass600_2.anInt5377)) {
								return false;
							}
							arg5 += local218;
							arg3 += local188;
							arg6 += local267;
							arg0 += this.aClass600_2.anInt5377;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 *= this.aClass600_2.anInt5377;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!this.method31738(this.aClass600_2.anIntArray487, arg0, 0, (arg5 >> 12) - 1, (arg4 >> 12) + 1, arg6, local255, this.aClass600_2.anInt5377)) {
										return false;
									}
									arg5 += local218;
									arg4 += local203;
									arg6 += local267;
									arg0 += this.aClass600_2.anInt5377;
								}
							}
							if (!this.method31738(this.aClass600_2.anIntArray487, arg0, 0, (arg5 >> 12) - 1, (arg3 >> 12) + 1, arg6, local255, this.aClass600_2.anInt5377)) {
								return false;
							}
							arg5 += local218;
							arg3 += local188;
							arg6 += local267;
							arg0 += this.aClass600_2.anInt5377;
						}
					}
				} else {
					arg4 = arg3 <<= 0xC;
					if (arg0 < 0) {
						arg4 -= local218 * arg0;
						arg3 -= local188 * arg0;
						arg6 -= local267 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0xC;
					if (arg2 < 0) {
						arg5 -= local203 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local218 < local188 || arg0 == arg2 && local203 > local188) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 *= this.aClass600_2.anInt5377;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!this.method31738(this.aClass600_2.anIntArray487, arg0, 0, (arg5 >> 12) - 1, (arg3 >> 12) + 1, arg6, local255, this.aClass600_2.anInt5377)) {
										return false;
									}
									arg5 += local203;
									arg3 += local188;
									arg6 += local267;
									arg0 += this.aClass600_2.anInt5377;
								}
							}
							if (!this.method31738(this.aClass600_2.anIntArray487, arg0, 0, (arg4 >> 12) - 1, (arg3 >> 12) + 1, arg6, local255, this.aClass600_2.anInt5377)) {
								return false;
							}
							arg4 += local218;
							arg3 += local188;
							arg6 += local267;
							arg0 += this.aClass600_2.anInt5377;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 *= this.aClass600_2.anInt5377;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!this.method31738(this.aClass600_2.anIntArray487, arg0, 0, (arg3 >> 12) - 1, (arg5 >> 12) + 1, arg6, local255, this.aClass600_2.anInt5377)) {
										return false;
									}
									arg5 += local203;
									arg3 += local188;
									arg6 += local267;
									arg0 += this.aClass600_2.anInt5377;
								}
							}
							if (!this.method31738(this.aClass600_2.anIntArray487, arg0, 0, (arg3 >> 12) - 1, (arg4 >> 12) + 1, arg6, local255, this.aClass600_2.anInt5377)) {
								return false;
							}
							arg4 += local218;
							arg3 += local188;
							arg6 += local267;
							arg0 += this.aClass600_2.anInt5377;
						}
					}
				}
			} else if (arg1 > arg2) {
				if (arg2 >= this.aClass600_2.anInt5369) {
					return true;
				}
				if (arg0 > this.aClass600_2.anInt5369) {
					arg0 = this.aClass600_2.anInt5369;
				}
				if (arg1 > this.aClass600_2.anInt5369) {
					arg1 = this.aClass600_2.anInt5369;
				}
				arg8 = (arg8 << 8) - local255 * arg5 + local255;
				if (arg0 < arg1) {
					arg4 = arg5 <<= 0xC;
					if (arg2 < 0) {
						arg4 -= local203 * arg2;
						arg5 -= local218 * arg2;
						arg8 -= local267 * arg2;
						arg2 = 0;
					}
					arg3 <<= 0xC;
					if (arg0 < 0) {
						arg3 -= local188 * arg0;
						arg0 = 0;
					}
					if (local203 < local218) {
						arg1 -= arg0;
						arg0 -= arg2;
						arg2 *= this.aClass600_2.anInt5377;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!this.method31738(this.aClass600_2.anIntArray487, arg2, 0, (arg4 >> 12) - 1, (arg3 >> 12) + 1, arg8, local255, this.aClass600_2.anInt5377)) {
										return false;
									}
									arg4 += local203;
									arg3 += local188;
									arg8 += local267;
									arg2 += this.aClass600_2.anInt5377;
								}
							}
							if (!this.method31738(this.aClass600_2.anIntArray487, arg2, 0, (arg4 >> 12) - 1, (arg5 >> 12) + 1, arg8, local255, this.aClass600_2.anInt5377)) {
								return false;
							}
							arg4 += local203;
							arg5 += local218;
							arg8 += local267;
							arg2 += this.aClass600_2.anInt5377;
						}
					} else {
						arg1 -= arg0;
						arg0 -= arg2;
						arg2 *= this.aClass600_2.anInt5377;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!this.method31738(this.aClass600_2.anIntArray487, arg2, 0, (arg3 >> 12) - 1, (arg4 >> 12) + 1, arg8, local255, this.aClass600_2.anInt5377)) {
										return false;
									}
									arg4 += local203;
									arg3 += local188;
									arg8 += local267;
									arg2 += this.aClass600_2.anInt5377;
								}
							}
							if (!this.method31738(this.aClass600_2.anIntArray487, arg2, 0, (arg5 >> 12) - 1, (arg4 >> 12) + 1, arg8, local255, this.aClass600_2.anInt5377)) {
								return false;
							}
							arg4 += local203;
							arg5 += local218;
							arg8 += local267;
							arg2 += this.aClass600_2.anInt5377;
						}
					}
				} else {
					arg3 = arg5 <<= 0xC;
					if (arg2 < 0) {
						arg3 -= local203 * arg2;
						arg5 -= local218 * arg2;
						arg8 -= local267 * arg2;
						arg2 = 0;
					}
					arg4 <<= 0xC;
					if (arg1 < 0) {
						arg4 -= local188 * arg1;
						arg1 = 0;
					}
					if (local203 < local218) {
						arg0 -= arg1;
						arg1 -= arg2;
						arg2 *= this.aClass600_2.anInt5377;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!this.method31738(this.aClass600_2.anIntArray487, arg2, 0, (arg4 >> 12) - 1, (arg5 >> 12) + 1, arg8, local255, this.aClass600_2.anInt5377)) {
										return false;
									}
									arg4 += local188;
									arg5 += local218;
									arg8 += local267;
									arg2 += this.aClass600_2.anInt5377;
								}
							}
							if (!this.method31738(this.aClass600_2.anIntArray487, arg2, 0, (arg3 >> 12) - 1, (arg5 >> 12) + 1, arg8, local255, this.aClass600_2.anInt5377)) {
								return false;
							}
							arg3 += local203;
							arg5 += local218;
							arg8 += local267;
							arg2 += this.aClass600_2.anInt5377;
						}
					} else {
						arg0 -= arg1;
						arg1 -= arg2;
						arg2 *= this.aClass600_2.anInt5377;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!this.method31738(this.aClass600_2.anIntArray487, arg2, 0, (arg5 >> 12) - 1, (arg4 >> 12) + 1, arg8, local255, this.aClass600_2.anInt5377)) {
										return false;
									}
									arg4 += local188;
									arg5 += local218;
									arg8 += local267;
									arg2 += this.aClass600_2.anInt5377;
								}
							}
							if (!this.method31738(this.aClass600_2.anIntArray487, arg2, 0, (arg5 >> 12) - 1, (arg3 >> 12) + 1, arg8, local255, this.aClass600_2.anInt5377)) {
								return false;
							}
							arg3 += local203;
							arg5 += local218;
							arg8 += local267;
							arg2 += this.aClass600_2.anInt5377;
						}
					}
				}
			} else if (arg1 >= this.aClass600_2.anInt5369) {
				return true;
			} else {
				if (arg2 > this.aClass600_2.anInt5369) {
					arg2 = this.aClass600_2.anInt5369;
				}
				if (arg0 > this.aClass600_2.anInt5369) {
					arg0 = this.aClass600_2.anInt5369;
				}
				arg7 = (arg7 << 8) - local255 * arg4 + local255;
				if (arg2 >= arg0) {
					arg5 = arg4 <<= 0xC;
					if (arg1 < 0) {
						arg5 -= local188 * arg1;
						arg4 -= local203 * arg1;
						arg7 -= local267 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0xC;
					if (arg0 < 0) {
						arg3 -= local218 * arg0;
						arg0 = 0;
					}
					if (local188 < local203) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 *= this.aClass600_2.anInt5377;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!this.method31738(this.aClass600_2.anIntArray487, arg1, 0, (arg3 >> 12) - 1, (arg4 >> 12) + 1, arg7, local255, this.aClass600_2.anInt5377)) {
										return false;
									}
									arg3 += local218;
									arg4 += local203;
									arg7 += local267;
									arg1 += this.aClass600_2.anInt5377;
								}
							}
							if (!this.method31738(this.aClass600_2.anIntArray487, arg1, 0, (arg5 >> 12) - 1, (arg4 >> 12) + 1, arg7, local255, this.aClass600_2.anInt5377)) {
								return false;
							}
							arg5 += local188;
							arg4 += local203;
							arg7 += local267;
							arg1 += this.aClass600_2.anInt5377;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 *= this.aClass600_2.anInt5377;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!this.method31738(this.aClass600_2.anIntArray487, arg1, 0, (arg4 >> 12) - 1, (arg3 >> 12) + 1, arg7, local255, this.aClass600_2.anInt5377)) {
										return false;
									}
									arg3 += local218;
									arg4 += local203;
									arg7 += local267;
									arg1 += this.aClass600_2.anInt5377;
								}
							}
							if (!this.method31738(this.aClass600_2.anIntArray487, arg1, 0, (arg4 >> 12) - 1, (arg5 >> 12) + 1, arg7, local255, this.aClass600_2.anInt5377)) {
								return false;
							}
							arg5 += local188;
							arg4 += local203;
							arg7 += local267;
							arg1 += this.aClass600_2.anInt5377;
						}
					}
				} else {
					arg3 = arg4 <<= 0xC;
					if (arg1 < 0) {
						arg3 -= local188 * arg1;
						arg4 -= local203 * arg1;
						arg7 -= local267 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0xC;
					if (arg2 < 0) {
						arg5 -= local218 * arg2;
						arg2 = 0;
					}
					if ((arg1 == arg2 || local188 >= local203) && (arg1 != arg2 || local188 <= local218)) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 *= this.aClass600_2.anInt5377;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!this.method31738(this.aClass600_2.anIntArray487, arg1, 0, (arg5 >> 12) - 1, (arg3 >> 12) + 1, arg7, local255, this.aClass600_2.anInt5377)) {
										return false;
									}
									arg3 += local188;
									arg5 += local218;
									arg7 += local267;
									arg1 += this.aClass600_2.anInt5377;
								}
							}
							if (!this.method31738(this.aClass600_2.anIntArray487, arg1, 0, (arg4 >> 12) - 1, (arg3 >> 12) + 1, arg7, local255, this.aClass600_2.anInt5377)) {
								return false;
							}
							arg3 += local188;
							arg4 += local203;
							arg7 += local267;
							arg1 += this.aClass600_2.anInt5377;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 *= this.aClass600_2.anInt5377;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!this.method31738(this.aClass600_2.anIntArray487, arg1, 0, (arg3 >> 12) - 1, (arg5 >> 12) + 1, arg7, local255, this.aClass600_2.anInt5377)) {
										return false;
									}
									arg3 += local188;
									arg5 += local218;
									arg7 += local267;
									arg1 += this.aClass600_2.anInt5377;
								}
							}
							if (!this.method31738(this.aClass600_2.anIntArray487, arg1, 0, (arg3 >> 12) - 1, (arg4 >> 12) + 1, arg7, local255, this.aClass600_2.anInt5377)) {
								return false;
							}
							arg3 += local188;
							arg4 += local203;
							arg7 += local267;
							arg1 += this.aClass600_2.anInt5377;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "([IIIIIIII)Z")
	boolean method31738(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 > arg7) {
			arg4 = arg7;
		}
		if (arg3 < 0) {
			arg3 = 0;
		}
		if (arg3 >= arg4) {
			return true;
		}
		arg1 += arg3 - 1;
		@Pc(25) int local25 = arg4 - arg3 >> 2;
		arg5 += arg6 * arg3;
		@Pc(47) int local47;
		@Pc(58) int local58;
		if (this.anInt5280 == 1) {
			this.anInt5279 += local25;
			while (true) {
				local25--;
				if (local25 < 0) {
					local25 = arg4 - arg3 & 0x3;
					while (true) {
						local25--;
						if (local25 < 0) {
							return true;
						}
						arg1++;
						if (arg5 < arg0[arg1]) {
							arg0[arg1] = arg5;
						}
						arg5 += arg6;
					}
				}
				local47 = arg1 + 1;
				if (arg5 < arg0[local47]) {
					arg0[local47] = arg5;
				}
				local58 = arg5 + arg6;
				local47++;
				if (local58 < arg0[local47]) {
					arg0[local47] = local58;
				}
				local58 += arg6;
				local47++;
				if (local58 < arg0[local47]) {
					arg0[local47] = local58;
				}
				local58 += arg6;
				arg1 = local47 + 1;
				if (local58 < arg0[arg1]) {
					arg0[arg1] = local58;
				}
				arg5 = local58 + arg6;
			}
		} else {
			arg5 -= 39424;
			while (true) {
				local25--;
				if (local25 < 0) {
					local25 = arg4 - arg3 & 0x3;
					while (true) {
						local25--;
						if (local25 < 0) {
							return true;
						}
						arg1++;
						if (arg5 < arg0[arg1]) {
							return false;
						}
						arg5 += arg6;
					}
				}
				local47 = arg1 + 1;
				if (arg5 < arg0[local47]) {
					return false;
				}
				local58 = arg5 + arg6;
				local47++;
				if (local58 < arg0[local47]) {
					return false;
				}
				local58 += arg6;
				local47++;
				if (local58 < arg0[local47]) {
					return false;
				}
				local58 += arg6;
				arg1 = local47 + 1;
				if (local58 < arg0[arg1]) {
					return false;
				}
				arg5 = local58 + arg6;
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "([IIIIIIII)Z")
	boolean method31739(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 > arg7) {
			arg4 = arg7;
		}
		if (arg3 < 0) {
			arg3 = 0;
		}
		if (arg3 >= arg4) {
			return true;
		}
		arg1 += arg3 - 1;
		@Pc(25) int local25 = arg4 - arg3 >> 2;
		arg5 += arg6 * arg3;
		@Pc(47) int local47;
		@Pc(58) int local58;
		if (this.anInt5280 == 1) {
			this.anInt5279 += local25;
			while (true) {
				local25--;
				if (local25 < 0) {
					local25 = arg4 - arg3 & 0x3;
					while (true) {
						local25--;
						if (local25 < 0) {
							return true;
						}
						arg1++;
						if (arg5 < arg0[arg1]) {
							arg0[arg1] = arg5;
						}
						arg5 += arg6;
					}
				}
				local47 = arg1 + 1;
				if (arg5 < arg0[local47]) {
					arg0[local47] = arg5;
				}
				local58 = arg5 + arg6;
				local47++;
				if (local58 < arg0[local47]) {
					arg0[local47] = local58;
				}
				local58 += arg6;
				local47++;
				if (local58 < arg0[local47]) {
					arg0[local47] = local58;
				}
				local58 += arg6;
				arg1 = local47 + 1;
				if (local58 < arg0[arg1]) {
					arg0[arg1] = local58;
				}
				arg5 = local58 + arg6;
			}
		} else {
			arg5 -= 39424;
			while (true) {
				local25--;
				if (local25 < 0) {
					local25 = arg4 - arg3 & 0x3;
					while (true) {
						local25--;
						if (local25 < 0) {
							return true;
						}
						arg1++;
						if (arg5 < arg0[arg1]) {
							return false;
						}
						arg5 += arg6;
					}
				}
				local47 = arg1 + 1;
				if (arg5 < arg0[local47]) {
					return false;
				}
				local58 = arg5 + arg6;
				local47++;
				if (local58 < arg0[local47]) {
					return false;
				}
				local58 += arg6;
				local47++;
				if (local58 < arg0[local47]) {
					return false;
				}
				local58 += arg6;
				arg1 = local47 + 1;
				if (local58 < arg0[arg1]) {
					return false;
				}
				arg5 = local58 + arg6;
			}
		}
	}
}
