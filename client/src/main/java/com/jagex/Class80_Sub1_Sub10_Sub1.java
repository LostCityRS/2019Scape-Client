package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!atc")
public final class Class80_Sub1_Sub10_Sub1 extends Class80_Sub1_Sub10 {

	@OriginalMember(owner = "client!atc", name = "i", descriptor = "I")
	static final int anInt3206 = 16;

	@OriginalMember(owner = "client!atc", name = "j", descriptor = "I")
	int anInt3205;

	@OriginalMember(owner = "client!atc", name = "o", descriptor = "I")
	int anInt3207;

	@OriginalMember(owner = "client!atc", name = "a", descriptor = "I")
	int anInt3208;

	@OriginalMember(owner = "client!atc", name = "m", descriptor = "I")
	int anInt3209;

	@OriginalMember(owner = "client!atc", name = "s", descriptor = "[B")
	final byte[] aByteArray62;

	@OriginalMember(owner = "client!atc", name = "l", descriptor = "([BIIII)V")
	static void method23527(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 >= arg4) {
			return;
		}
		arg1 += arg3;
		@Pc(13) int local13 = arg4 - arg3 >> 2;
		while (true) {
			local13--;
			if (local13 < 0) {
				local13 = arg4 - arg3 & 0x3;
				while (true) {
					local13--;
					if (local13 < 0) {
						return;
					}
					arg0[arg1++] = 1;
				}
			}
			@Pc(19) int local19 = arg1 + 1;
			arg0[arg1] = 1;
			@Pc(24) int local24 = local19 + 1;
			arg0[local19] = 1;
			@Pc(29) int local29 = local24 + 1;
			arg0[local24] = 1;
			arg1 = local29 + 1;
			arg0[local29] = 1;
		}
	}

	@OriginalMember(owner = "client!atc", name = "v", descriptor = "([BIIII)V")
	static void method23538(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 >= arg4) {
			return;
		}
		arg1 += arg3;
		@Pc(13) int local13 = arg4 - arg3 >> 2;
		while (true) {
			local13--;
			if (local13 < 0) {
				local13 = arg4 - arg3 & 0x3;
				while (true) {
					local13--;
					if (local13 < 0) {
						return;
					}
					arg0[arg1++] = 1;
				}
			}
			@Pc(19) int local19 = arg1 + 1;
			arg0[arg1] = 1;
			@Pc(24) int local24 = local19 + 1;
			arg0[local19] = 1;
			@Pc(29) int local29 = local24 + 1;
			arg0[local24] = 1;
			arg1 = local29 + 1;
			arg0[local29] = 1;
		}
	}

	@OriginalMember(owner = "client!atc", name = "y", descriptor = "([BIIII)V")
	static void method23539(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 >= arg4) {
			return;
		}
		arg1 += arg3;
		@Pc(13) int local13 = arg4 - arg3 >> 2;
		while (true) {
			local13--;
			if (local13 < 0) {
				local13 = arg4 - arg3 & 0x3;
				while (true) {
					local13--;
					if (local13 < 0) {
						return;
					}
					arg0[arg1++] = 1;
				}
			}
			@Pc(19) int local19 = arg1 + 1;
			arg0[arg1] = 1;
			@Pc(24) int local24 = local19 + 1;
			arg0[local19] = 1;
			@Pc(29) int local29 = local24 + 1;
			arg0[local24] = 1;
			arg1 = local29 + 1;
			arg0[local29] = 1;
		}
	}

	@OriginalMember(owner = "client!atc", name = "<init>", descriptor = "(Lclient!afm;II)V")
	Class80_Sub1_Sub10_Sub1(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray62 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!atc", name = "p", descriptor = "(IIIIII)V")
	void method23523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg1 != arg0) {
			local1 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(16) int local16 = 0;
		if (arg2 != arg1) {
			local16 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(31) int local31 = 0;
		if (arg2 != arg0) {
			local31 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg1 < arg2) {
				arg5 = arg3 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= local31 * arg0;
					arg3 -= local1 * arg0;
					arg0 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local16 * arg1;
					arg1 = 0;
				}
				if ((arg0 == arg1 || local31 >= local1) && (arg0 != arg1 || local31 <= local16)) {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt3209;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23527(this.aByteArray62, arg0, 0, arg4 >> 16, arg5 >> 16);
								arg5 += local31;
								arg4 += local16;
								arg0 += this.anInt3209;
							}
						}
						method23527(this.aByteArray62, arg0, 0, arg3 >> 16, arg5 >> 16);
						arg5 += local31;
						arg3 += local1;
						arg0 += this.anInt3209;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt3209;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23527(this.aByteArray62, arg0, 0, arg5 >> 16, arg4 >> 16);
								arg5 += local31;
								arg4 += local16;
								arg0 += this.anInt3209;
							}
						}
						method23527(this.aByteArray62, arg0, 0, arg5 >> 16, arg3 >> 16);
						arg5 += local31;
						arg3 += local1;
						arg0 += this.anInt3209;
					}
				}
			} else {
				arg4 = arg3 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= local31 * arg0;
					arg3 -= local1 * arg0;
					arg0 = 0;
				}
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local16 * arg2;
					arg2 = 0;
				}
				if ((arg0 == arg2 || local31 >= local1) && (arg0 != arg2 || local16 <= local1)) {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt3209;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method23527(this.aByteArray62, arg0, 0, arg3 >> 16, arg5 >> 16);
								arg5 += local16;
								arg3 += local1;
								arg0 += this.anInt3209;
							}
						}
						method23527(this.aByteArray62, arg0, 0, arg3 >> 16, arg4 >> 16);
						arg4 += local31;
						arg3 += local1;
						arg0 += this.anInt3209;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt3209;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method23527(this.aByteArray62, arg0, 0, arg5 >> 16, arg3 >> 16);
								arg5 += local16;
								arg3 += local1;
								arg0 += this.anInt3209;
							}
						}
						method23527(this.aByteArray62, arg0, 0, arg4 >> 16, arg3 >> 16);
						arg4 += local31;
						arg3 += local1;
						arg0 += this.anInt3209;
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg2 < arg0) {
				arg3 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= local1 * arg1;
					arg4 -= local16 * arg1;
					arg1 = 0;
				}
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local31 * arg2;
					arg2 = 0;
				}
				if (arg1 != arg2 && local1 < local16 || arg1 == arg2 && local1 > local31) {
					arg0 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt3209;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method23527(this.aByteArray62, arg1, 0, arg3 >> 16, arg5 >> 16);
								arg3 += local1;
								arg5 += local31;
								arg1 += this.anInt3209;
							}
						}
						method23527(this.aByteArray62, arg1, 0, arg3 >> 16, arg4 >> 16);
						arg3 += local1;
						arg4 += local16;
						arg1 += this.anInt3209;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt3209;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method23527(this.aByteArray62, arg1, 0, arg5 >> 16, arg3 >> 16);
								arg3 += local1;
								arg5 += local31;
								arg1 += this.anInt3209;
							}
						}
						method23527(this.aByteArray62, arg1, 0, arg4 >> 16, arg3 >> 16);
						arg3 += local1;
						arg4 += local16;
						arg1 += this.anInt3209;
					}
				}
			} else {
				arg5 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= local1 * arg1;
					arg4 -= local16 * arg1;
					arg1 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local31 * arg0;
					arg0 = 0;
				}
				if (local1 < local16) {
					arg2 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt3209;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23527(this.aByteArray62, arg1, 0, arg3 >> 16, arg4 >> 16);
								arg3 += local31;
								arg4 += local16;
								arg1 += this.anInt3209;
							}
						}
						method23527(this.aByteArray62, arg1, 0, arg5 >> 16, arg4 >> 16);
						arg5 += local1;
						arg4 += local16;
						arg1 += this.anInt3209;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt3209;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23527(this.aByteArray62, arg1, 0, arg4 >> 16, arg3 >> 16);
								arg3 += local31;
								arg4 += local16;
								arg1 += this.anInt3209;
							}
						}
						method23527(this.aByteArray62, arg1, 0, arg4 >> 16, arg5 >> 16);
						arg5 += local1;
						arg4 += local16;
						arg1 += this.anInt3209;
					}
				}
			}
		} else if (arg0 < arg1) {
			arg4 = arg5 <<= 0x10;
			if (arg2 < 0) {
				arg4 -= local16 * arg2;
				arg5 -= local31 * arg2;
				arg2 = 0;
			}
			arg3 <<= 0x10;
			if (arg0 < 0) {
				arg3 -= local1 * arg0;
				arg0 = 0;
			}
			if (local16 < local31) {
				arg1 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt3209;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method23527(this.aByteArray62, arg2, 0, arg4 >> 16, arg3 >> 16);
							arg4 += local16;
							arg3 += local1;
							arg2 += this.anInt3209;
						}
					}
					method23527(this.aByteArray62, arg2, 0, arg4 >> 16, arg5 >> 16);
					arg4 += local16;
					arg5 += local31;
					arg2 += this.anInt3209;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt3209;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method23527(this.aByteArray62, arg2, 0, arg3 >> 16, arg4 >> 16);
							arg4 += local16;
							arg3 += local1;
							arg2 += this.anInt3209;
						}
					}
					method23527(this.aByteArray62, arg2, 0, arg5 >> 16, arg4 >> 16);
					arg4 += local16;
					arg5 += local31;
					arg2 += this.anInt3209;
				}
			}
		} else {
			arg3 = arg5 <<= 0x10;
			if (arg2 < 0) {
				arg3 -= local16 * arg2;
				arg5 -= local31 * arg2;
				arg2 = 0;
			}
			arg4 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= local1 * arg1;
				arg1 = 0;
			}
			if (local16 < local31) {
				arg0 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt3209;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method23527(this.aByteArray62, arg2, 0, arg4 >> 16, arg5 >> 16);
							arg4 += local1;
							arg5 += local31;
							arg2 += this.anInt3209;
						}
					}
					method23527(this.aByteArray62, arg2, 0, arg3 >> 16, arg5 >> 16);
					arg3 += local16;
					arg5 += local31;
					arg2 += this.anInt3209;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt3209;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method23527(this.aByteArray62, arg2, 0, arg5 >> 16, arg4 >> 16);
							arg4 += local1;
							arg5 += local31;
							arg2 += this.anInt3209;
						}
					}
					method23527(this.aByteArray62, arg2, 0, arg5 >> 16, arg3 >> 16);
					arg3 += local16;
					arg5 += local31;
					arg2 += this.anInt3209;
				}
			}
		}
	}

	@OriginalMember(owner = "client!atc", name = "t", descriptor = "(IIII)V")
	void method23524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3205 = arg0;
		this.anInt3208 = arg1;
		this.anInt3209 = arg2 - arg0;
		this.anInt3207 = arg3 - arg1;
	}

	@OriginalMember(owner = "client!atc", name = "e", descriptor = "()V")
	void method23525() {
		@Pc(1) int local1 = -1;
		@Pc(7) int local7 = this.aByteArray62.length - 8;
		while (local1 < local7) {
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
		}
		while (local1 < this.aByteArray62.length - 1) {
			local1++;
			this.aByteArray62[local1] = 0;
		}
	}

	@OriginalMember(owner = "client!atc", name = "u", descriptor = "(IIIIII)V")
	void method23526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg1 != arg0) {
			local1 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(16) int local16 = 0;
		if (arg2 != arg1) {
			local16 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(31) int local31 = 0;
		if (arg2 != arg0) {
			local31 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg1 < arg2) {
				arg5 = arg3 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= local31 * arg0;
					arg3 -= local1 * arg0;
					arg0 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local16 * arg1;
					arg1 = 0;
				}
				if ((arg0 == arg1 || local31 >= local1) && (arg0 != arg1 || local31 <= local16)) {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt3209;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23527(this.aByteArray62, arg0, 0, arg4 >> 16, arg5 >> 16);
								arg5 += local31;
								arg4 += local16;
								arg0 += this.anInt3209;
							}
						}
						method23527(this.aByteArray62, arg0, 0, arg3 >> 16, arg5 >> 16);
						arg5 += local31;
						arg3 += local1;
						arg0 += this.anInt3209;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt3209;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23527(this.aByteArray62, arg0, 0, arg5 >> 16, arg4 >> 16);
								arg5 += local31;
								arg4 += local16;
								arg0 += this.anInt3209;
							}
						}
						method23527(this.aByteArray62, arg0, 0, arg5 >> 16, arg3 >> 16);
						arg5 += local31;
						arg3 += local1;
						arg0 += this.anInt3209;
					}
				}
			} else {
				arg4 = arg3 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= local31 * arg0;
					arg3 -= local1 * arg0;
					arg0 = 0;
				}
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local16 * arg2;
					arg2 = 0;
				}
				if ((arg0 == arg2 || local31 >= local1) && (arg0 != arg2 || local16 <= local1)) {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt3209;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method23527(this.aByteArray62, arg0, 0, arg3 >> 16, arg5 >> 16);
								arg5 += local16;
								arg3 += local1;
								arg0 += this.anInt3209;
							}
						}
						method23527(this.aByteArray62, arg0, 0, arg3 >> 16, arg4 >> 16);
						arg4 += local31;
						arg3 += local1;
						arg0 += this.anInt3209;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt3209;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method23527(this.aByteArray62, arg0, 0, arg5 >> 16, arg3 >> 16);
								arg5 += local16;
								arg3 += local1;
								arg0 += this.anInt3209;
							}
						}
						method23527(this.aByteArray62, arg0, 0, arg4 >> 16, arg3 >> 16);
						arg4 += local31;
						arg3 += local1;
						arg0 += this.anInt3209;
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg2 < arg0) {
				arg3 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= local1 * arg1;
					arg4 -= local16 * arg1;
					arg1 = 0;
				}
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local31 * arg2;
					arg2 = 0;
				}
				if (arg1 != arg2 && local1 < local16 || arg1 == arg2 && local1 > local31) {
					arg0 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt3209;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method23527(this.aByteArray62, arg1, 0, arg3 >> 16, arg5 >> 16);
								arg3 += local1;
								arg5 += local31;
								arg1 += this.anInt3209;
							}
						}
						method23527(this.aByteArray62, arg1, 0, arg3 >> 16, arg4 >> 16);
						arg3 += local1;
						arg4 += local16;
						arg1 += this.anInt3209;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt3209;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method23527(this.aByteArray62, arg1, 0, arg5 >> 16, arg3 >> 16);
								arg3 += local1;
								arg5 += local31;
								arg1 += this.anInt3209;
							}
						}
						method23527(this.aByteArray62, arg1, 0, arg4 >> 16, arg3 >> 16);
						arg3 += local1;
						arg4 += local16;
						arg1 += this.anInt3209;
					}
				}
			} else {
				arg5 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= local1 * arg1;
					arg4 -= local16 * arg1;
					arg1 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local31 * arg0;
					arg0 = 0;
				}
				if (local1 < local16) {
					arg2 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt3209;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23527(this.aByteArray62, arg1, 0, arg3 >> 16, arg4 >> 16);
								arg3 += local31;
								arg4 += local16;
								arg1 += this.anInt3209;
							}
						}
						method23527(this.aByteArray62, arg1, 0, arg5 >> 16, arg4 >> 16);
						arg5 += local1;
						arg4 += local16;
						arg1 += this.anInt3209;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt3209;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23527(this.aByteArray62, arg1, 0, arg4 >> 16, arg3 >> 16);
								arg3 += local31;
								arg4 += local16;
								arg1 += this.anInt3209;
							}
						}
						method23527(this.aByteArray62, arg1, 0, arg4 >> 16, arg5 >> 16);
						arg5 += local1;
						arg4 += local16;
						arg1 += this.anInt3209;
					}
				}
			}
		} else if (arg0 < arg1) {
			arg4 = arg5 <<= 0x10;
			if (arg2 < 0) {
				arg4 -= local16 * arg2;
				arg5 -= local31 * arg2;
				arg2 = 0;
			}
			arg3 <<= 0x10;
			if (arg0 < 0) {
				arg3 -= local1 * arg0;
				arg0 = 0;
			}
			if (local16 < local31) {
				arg1 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt3209;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method23527(this.aByteArray62, arg2, 0, arg4 >> 16, arg3 >> 16);
							arg4 += local16;
							arg3 += local1;
							arg2 += this.anInt3209;
						}
					}
					method23527(this.aByteArray62, arg2, 0, arg4 >> 16, arg5 >> 16);
					arg4 += local16;
					arg5 += local31;
					arg2 += this.anInt3209;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt3209;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method23527(this.aByteArray62, arg2, 0, arg3 >> 16, arg4 >> 16);
							arg4 += local16;
							arg3 += local1;
							arg2 += this.anInt3209;
						}
					}
					method23527(this.aByteArray62, arg2, 0, arg5 >> 16, arg4 >> 16);
					arg4 += local16;
					arg5 += local31;
					arg2 += this.anInt3209;
				}
			}
		} else {
			arg3 = arg5 <<= 0x10;
			if (arg2 < 0) {
				arg3 -= local16 * arg2;
				arg5 -= local31 * arg2;
				arg2 = 0;
			}
			arg4 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= local1 * arg1;
				arg1 = 0;
			}
			if (local16 < local31) {
				arg0 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt3209;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method23527(this.aByteArray62, arg2, 0, arg4 >> 16, arg5 >> 16);
							arg4 += local1;
							arg5 += local31;
							arg2 += this.anInt3209;
						}
					}
					method23527(this.aByteArray62, arg2, 0, arg3 >> 16, arg5 >> 16);
					arg3 += local16;
					arg5 += local31;
					arg2 += this.anInt3209;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt3209;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method23527(this.aByteArray62, arg2, 0, arg5 >> 16, arg4 >> 16);
							arg4 += local1;
							arg5 += local31;
							arg2 += this.anInt3209;
						}
					}
					method23527(this.aByteArray62, arg2, 0, arg5 >> 16, arg3 >> 16);
					arg3 += local16;
					arg5 += local31;
					arg2 += this.anInt3209;
				}
			}
		}
	}

	@OriginalMember(owner = "client!atc", name = "g", descriptor = "(IIII)V")
	void method23528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3205 = arg0;
		this.anInt3208 = arg1;
		this.anInt3209 = arg2 - arg0;
		this.anInt3207 = arg3 - arg1;
	}

	@OriginalMember(owner = "client!atc", name = "i", descriptor = "(IIII)V")
	void method23529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3205 = arg0;
		this.anInt3208 = arg1;
		this.anInt3209 = arg2 - arg0;
		this.anInt3207 = arg3 - arg1;
	}

	@OriginalMember(owner = "client!atc", name = "m", descriptor = "(II)Z")
	boolean method23530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray62.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!atc", name = "o", descriptor = "(II)Z")
	boolean method23531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray62.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!atc", name = "f", descriptor = "(II)Z")
	boolean method23532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray62.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!atc", name = "j", descriptor = "(II)Z")
	boolean method23533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray62.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!atc", name = "s", descriptor = "()V")
	void method23534() {
		@Pc(1) int local1 = -1;
		@Pc(7) int local7 = this.aByteArray62.length - 8;
		while (local1 < local7) {
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
		}
		while (local1 < this.aByteArray62.length - 1) {
			local1++;
			this.aByteArray62[local1] = 0;
		}
	}

	@OriginalMember(owner = "client!atc", name = "x", descriptor = "()V")
	void method23535() {
		@Pc(1) int local1 = -1;
		@Pc(7) int local7 = this.aByteArray62.length - 8;
		while (local1 < local7) {
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
		}
		while (local1 < this.aByteArray62.length - 1) {
			local1++;
			this.aByteArray62[local1] = 0;
		}
	}

	@OriginalMember(owner = "client!atc", name = "z", descriptor = "()V")
	void method23536() {
		@Pc(1) int local1 = -1;
		@Pc(7) int local7 = this.aByteArray62.length - 8;
		while (local1 < local7) {
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
		}
		while (local1 < this.aByteArray62.length - 1) {
			local1++;
			this.aByteArray62[local1] = 0;
		}
	}

	@OriginalMember(owner = "client!atc", name = "a", descriptor = "()V")
	void method23537() {
		@Pc(1) int local1 = -1;
		@Pc(7) int local7 = this.aByteArray62.length - 8;
		while (local1 < local7) {
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
			local1++;
			this.aByteArray62[local1] = 0;
		}
		while (local1 < this.aByteArray62.length - 1) {
			local1++;
			this.aByteArray62[local1] = 0;
		}
	}
}
