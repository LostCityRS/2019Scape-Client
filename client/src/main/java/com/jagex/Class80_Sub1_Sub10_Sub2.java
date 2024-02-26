package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!atu")
public final class Class80_Sub1_Sub10_Sub2 extends Class80_Sub1_Sub10 {

	@OriginalMember(owner = "client!atu", name = "i", descriptor = "I")
	static final int anInt3264 = 16;

	@OriginalMember(owner = "client!atu", name = "o", descriptor = "I")
	int anInt3260;

	@OriginalMember(owner = "client!atu", name = "m", descriptor = "I")
	int anInt3261;

	@OriginalMember(owner = "client!atu", name = "j", descriptor = "I")
	int anInt3262;

	@OriginalMember(owner = "client!atu", name = "a", descriptor = "I")
	int anInt3263;

	@OriginalMember(owner = "client!atu", name = "s", descriptor = "[B")
	final byte[] aByteArray64;

	@OriginalMember(owner = "client!atu", name = "l", descriptor = "([BIIII)V")
	static void method24023(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
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

	@OriginalMember(owner = "client!atu", name = "p", descriptor = "([BIIII)V")
	static void method24029(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
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

	@OriginalMember(owner = "client!atu", name = "v", descriptor = "([BIIII)V")
	static void method24033(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
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

	@OriginalMember(owner = "client!atu", name = "y", descriptor = "([BIIII)V")
	static void method24034(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
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

	@OriginalMember(owner = "client!atu", name = "<init>", descriptor = "(Lclient!afa;II)V")
	Class80_Sub1_Sub10_Sub2(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray64 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!atu", name = "g", descriptor = "(IIII)V")
	void method24018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3262 = arg0;
		this.anInt3263 = arg1;
		this.anInt3261 = arg2 - arg0;
		this.anInt3260 = arg3 - arg1;
	}

	@OriginalMember(owner = "client!atu", name = "t", descriptor = "(IIII)V")
	void method24019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3262 = arg0;
		this.anInt3263 = arg1;
		this.anInt3261 = arg2 - arg0;
		this.anInt3260 = arg3 - arg1;
	}

	@OriginalMember(owner = "client!atu", name = "z", descriptor = "(IIIIII)V")
	void method24020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
					arg0 *= this.anInt3261;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method24023(this.aByteArray64, arg0, 0, arg4 >> 16, arg5 >> 16);
								arg5 += local31;
								arg4 += local16;
								arg0 += this.anInt3261;
							}
						}
						method24023(this.aByteArray64, arg0, 0, arg3 >> 16, arg5 >> 16);
						arg5 += local31;
						arg3 += local1;
						arg0 += this.anInt3261;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt3261;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method24023(this.aByteArray64, arg0, 0, arg5 >> 16, arg4 >> 16);
								arg5 += local31;
								arg4 += local16;
								arg0 += this.anInt3261;
							}
						}
						method24023(this.aByteArray64, arg0, 0, arg5 >> 16, arg3 >> 16);
						arg5 += local31;
						arg3 += local1;
						arg0 += this.anInt3261;
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
					arg0 *= this.anInt3261;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method24023(this.aByteArray64, arg0, 0, arg3 >> 16, arg5 >> 16);
								arg5 += local16;
								arg3 += local1;
								arg0 += this.anInt3261;
							}
						}
						method24023(this.aByteArray64, arg0, 0, arg3 >> 16, arg4 >> 16);
						arg4 += local31;
						arg3 += local1;
						arg0 += this.anInt3261;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt3261;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method24023(this.aByteArray64, arg0, 0, arg5 >> 16, arg3 >> 16);
								arg5 += local16;
								arg3 += local1;
								arg0 += this.anInt3261;
							}
						}
						method24023(this.aByteArray64, arg0, 0, arg4 >> 16, arg3 >> 16);
						arg4 += local31;
						arg3 += local1;
						arg0 += this.anInt3261;
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
					arg1 *= this.anInt3261;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method24023(this.aByteArray64, arg1, 0, arg3 >> 16, arg5 >> 16);
								arg3 += local1;
								arg5 += local31;
								arg1 += this.anInt3261;
							}
						}
						method24023(this.aByteArray64, arg1, 0, arg3 >> 16, arg4 >> 16);
						arg3 += local1;
						arg4 += local16;
						arg1 += this.anInt3261;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt3261;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method24023(this.aByteArray64, arg1, 0, arg5 >> 16, arg3 >> 16);
								arg3 += local1;
								arg5 += local31;
								arg1 += this.anInt3261;
							}
						}
						method24023(this.aByteArray64, arg1, 0, arg4 >> 16, arg3 >> 16);
						arg3 += local1;
						arg4 += local16;
						arg1 += this.anInt3261;
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
					arg1 *= this.anInt3261;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method24023(this.aByteArray64, arg1, 0, arg3 >> 16, arg4 >> 16);
								arg3 += local31;
								arg4 += local16;
								arg1 += this.anInt3261;
							}
						}
						method24023(this.aByteArray64, arg1, 0, arg5 >> 16, arg4 >> 16);
						arg5 += local1;
						arg4 += local16;
						arg1 += this.anInt3261;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt3261;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method24023(this.aByteArray64, arg1, 0, arg4 >> 16, arg3 >> 16);
								arg3 += local31;
								arg4 += local16;
								arg1 += this.anInt3261;
							}
						}
						method24023(this.aByteArray64, arg1, 0, arg4 >> 16, arg5 >> 16);
						arg5 += local1;
						arg4 += local16;
						arg1 += this.anInt3261;
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
				arg2 *= this.anInt3261;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method24023(this.aByteArray64, arg2, 0, arg4 >> 16, arg3 >> 16);
							arg4 += local16;
							arg3 += local1;
							arg2 += this.anInt3261;
						}
					}
					method24023(this.aByteArray64, arg2, 0, arg4 >> 16, arg5 >> 16);
					arg4 += local16;
					arg5 += local31;
					arg2 += this.anInt3261;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt3261;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method24023(this.aByteArray64, arg2, 0, arg3 >> 16, arg4 >> 16);
							arg4 += local16;
							arg3 += local1;
							arg2 += this.anInt3261;
						}
					}
					method24023(this.aByteArray64, arg2, 0, arg5 >> 16, arg4 >> 16);
					arg4 += local16;
					arg5 += local31;
					arg2 += this.anInt3261;
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
				arg2 *= this.anInt3261;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method24023(this.aByteArray64, arg2, 0, arg4 >> 16, arg5 >> 16);
							arg4 += local1;
							arg5 += local31;
							arg2 += this.anInt3261;
						}
					}
					method24023(this.aByteArray64, arg2, 0, arg3 >> 16, arg5 >> 16);
					arg3 += local16;
					arg5 += local31;
					arg2 += this.anInt3261;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt3261;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method24023(this.aByteArray64, arg2, 0, arg5 >> 16, arg4 >> 16);
							arg4 += local1;
							arg5 += local31;
							arg2 += this.anInt3261;
						}
					}
					method24023(this.aByteArray64, arg2, 0, arg5 >> 16, arg3 >> 16);
					arg3 += local16;
					arg5 += local31;
					arg2 += this.anInt3261;
				}
			}
		}
	}

	@OriginalMember(owner = "client!atu", name = "e", descriptor = "()V")
	void method24021() {
		@Pc(1) int local1 = -1;
		@Pc(7) int local7 = this.aByteArray64.length - 8;
		while (local1 < local7) {
			local1++;
			this.aByteArray64[local1] = 0;
			local1++;
			this.aByteArray64[local1] = 0;
			local1++;
			this.aByteArray64[local1] = 0;
			local1++;
			this.aByteArray64[local1] = 0;
			local1++;
			this.aByteArray64[local1] = 0;
			local1++;
			this.aByteArray64[local1] = 0;
			local1++;
			this.aByteArray64[local1] = 0;
			local1++;
			this.aByteArray64[local1] = 0;
		}
		while (local1 < this.aByteArray64.length - 1) {
			local1++;
			this.aByteArray64[local1] = 0;
		}
	}

	@OriginalMember(owner = "client!atu", name = "a", descriptor = "()V")
	void method24022() {
		@Pc(1) int local1 = -1;
		@Pc(7) int local7 = this.aByteArray64.length - 8;
		while (local1 < local7) {
			local1++;
			this.aByteArray64[local1] = 0;
			local1++;
			this.aByteArray64[local1] = 0;
			local1++;
			this.aByteArray64[local1] = 0;
			local1++;
			this.aByteArray64[local1] = 0;
			local1++;
			this.aByteArray64[local1] = 0;
			local1++;
			this.aByteArray64[local1] = 0;
			local1++;
			this.aByteArray64[local1] = 0;
			local1++;
			this.aByteArray64[local1] = 0;
		}
		while (local1 < this.aByteArray64.length - 1) {
			local1++;
			this.aByteArray64[local1] = 0;
		}
	}

	@OriginalMember(owner = "client!atu", name = "o", descriptor = "(II)Z")
	boolean method24024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray64.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!atu", name = "i", descriptor = "(IIII)V")
	void method24025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3262 = arg0;
		this.anInt3263 = arg1;
		this.anInt3261 = arg2 - arg0;
		this.anInt3260 = arg3 - arg1;
	}

	@OriginalMember(owner = "client!atu", name = "m", descriptor = "(II)Z")
	boolean method24026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray64.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!atu", name = "f", descriptor = "(II)Z")
	boolean method24027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray64.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!atu", name = "j", descriptor = "(II)Z")
	boolean method24028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray64.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!atu", name = "s", descriptor = "()V")
	void method24030() {
		@Pc(1) int local1 = -1;
		@Pc(7) int local7 = this.aByteArray64.length - 8;
		while (local1 < local7) {
			local1++;
			this.aByteArray64[local1] = 0;
			local1++;
			this.aByteArray64[local1] = 0;
			local1++;
			this.aByteArray64[local1] = 0;
			local1++;
			this.aByteArray64[local1] = 0;
			local1++;
			this.aByteArray64[local1] = 0;
			local1++;
			this.aByteArray64[local1] = 0;
			local1++;
			this.aByteArray64[local1] = 0;
			local1++;
			this.aByteArray64[local1] = 0;
		}
		while (local1 < this.aByteArray64.length - 1) {
			local1++;
			this.aByteArray64[local1] = 0;
		}
	}

	@OriginalMember(owner = "client!atu", name = "u", descriptor = "(IIIIII)V")
	void method24031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
					arg0 *= this.anInt3261;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method24023(this.aByteArray64, arg0, 0, arg4 >> 16, arg5 >> 16);
								arg5 += local31;
								arg4 += local16;
								arg0 += this.anInt3261;
							}
						}
						method24023(this.aByteArray64, arg0, 0, arg3 >> 16, arg5 >> 16);
						arg5 += local31;
						arg3 += local1;
						arg0 += this.anInt3261;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt3261;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method24023(this.aByteArray64, arg0, 0, arg5 >> 16, arg4 >> 16);
								arg5 += local31;
								arg4 += local16;
								arg0 += this.anInt3261;
							}
						}
						method24023(this.aByteArray64, arg0, 0, arg5 >> 16, arg3 >> 16);
						arg5 += local31;
						arg3 += local1;
						arg0 += this.anInt3261;
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
					arg0 *= this.anInt3261;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method24023(this.aByteArray64, arg0, 0, arg3 >> 16, arg5 >> 16);
								arg5 += local16;
								arg3 += local1;
								arg0 += this.anInt3261;
							}
						}
						method24023(this.aByteArray64, arg0, 0, arg3 >> 16, arg4 >> 16);
						arg4 += local31;
						arg3 += local1;
						arg0 += this.anInt3261;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt3261;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method24023(this.aByteArray64, arg0, 0, arg5 >> 16, arg3 >> 16);
								arg5 += local16;
								arg3 += local1;
								arg0 += this.anInt3261;
							}
						}
						method24023(this.aByteArray64, arg0, 0, arg4 >> 16, arg3 >> 16);
						arg4 += local31;
						arg3 += local1;
						arg0 += this.anInt3261;
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
					arg1 *= this.anInt3261;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method24023(this.aByteArray64, arg1, 0, arg3 >> 16, arg5 >> 16);
								arg3 += local1;
								arg5 += local31;
								arg1 += this.anInt3261;
							}
						}
						method24023(this.aByteArray64, arg1, 0, arg3 >> 16, arg4 >> 16);
						arg3 += local1;
						arg4 += local16;
						arg1 += this.anInt3261;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt3261;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method24023(this.aByteArray64, arg1, 0, arg5 >> 16, arg3 >> 16);
								arg3 += local1;
								arg5 += local31;
								arg1 += this.anInt3261;
							}
						}
						method24023(this.aByteArray64, arg1, 0, arg4 >> 16, arg3 >> 16);
						arg3 += local1;
						arg4 += local16;
						arg1 += this.anInt3261;
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
					arg1 *= this.anInt3261;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method24023(this.aByteArray64, arg1, 0, arg3 >> 16, arg4 >> 16);
								arg3 += local31;
								arg4 += local16;
								arg1 += this.anInt3261;
							}
						}
						method24023(this.aByteArray64, arg1, 0, arg5 >> 16, arg4 >> 16);
						arg5 += local1;
						arg4 += local16;
						arg1 += this.anInt3261;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt3261;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method24023(this.aByteArray64, arg1, 0, arg4 >> 16, arg3 >> 16);
								arg3 += local31;
								arg4 += local16;
								arg1 += this.anInt3261;
							}
						}
						method24023(this.aByteArray64, arg1, 0, arg4 >> 16, arg5 >> 16);
						arg5 += local1;
						arg4 += local16;
						arg1 += this.anInt3261;
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
				arg2 *= this.anInt3261;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method24023(this.aByteArray64, arg2, 0, arg4 >> 16, arg3 >> 16);
							arg4 += local16;
							arg3 += local1;
							arg2 += this.anInt3261;
						}
					}
					method24023(this.aByteArray64, arg2, 0, arg4 >> 16, arg5 >> 16);
					arg4 += local16;
					arg5 += local31;
					arg2 += this.anInt3261;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt3261;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method24023(this.aByteArray64, arg2, 0, arg3 >> 16, arg4 >> 16);
							arg4 += local16;
							arg3 += local1;
							arg2 += this.anInt3261;
						}
					}
					method24023(this.aByteArray64, arg2, 0, arg5 >> 16, arg4 >> 16);
					arg4 += local16;
					arg5 += local31;
					arg2 += this.anInt3261;
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
				arg2 *= this.anInt3261;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method24023(this.aByteArray64, arg2, 0, arg4 >> 16, arg5 >> 16);
							arg4 += local1;
							arg5 += local31;
							arg2 += this.anInt3261;
						}
					}
					method24023(this.aByteArray64, arg2, 0, arg3 >> 16, arg5 >> 16);
					arg3 += local16;
					arg5 += local31;
					arg2 += this.anInt3261;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt3261;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method24023(this.aByteArray64, arg2, 0, arg5 >> 16, arg4 >> 16);
							arg4 += local1;
							arg5 += local31;
							arg2 += this.anInt3261;
						}
					}
					method24023(this.aByteArray64, arg2, 0, arg5 >> 16, arg3 >> 16);
					arg3 += local16;
					arg5 += local31;
					arg2 += this.anInt3261;
				}
			}
		}
	}

	@OriginalMember(owner = "client!atu", name = "x", descriptor = "(IIIIII)V")
	void method24032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
					arg0 *= this.anInt3261;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method24023(this.aByteArray64, arg0, 0, arg4 >> 16, arg5 >> 16);
								arg5 += local31;
								arg4 += local16;
								arg0 += this.anInt3261;
							}
						}
						method24023(this.aByteArray64, arg0, 0, arg3 >> 16, arg5 >> 16);
						arg5 += local31;
						arg3 += local1;
						arg0 += this.anInt3261;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt3261;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method24023(this.aByteArray64, arg0, 0, arg5 >> 16, arg4 >> 16);
								arg5 += local31;
								arg4 += local16;
								arg0 += this.anInt3261;
							}
						}
						method24023(this.aByteArray64, arg0, 0, arg5 >> 16, arg3 >> 16);
						arg5 += local31;
						arg3 += local1;
						arg0 += this.anInt3261;
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
					arg0 *= this.anInt3261;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method24023(this.aByteArray64, arg0, 0, arg3 >> 16, arg5 >> 16);
								arg5 += local16;
								arg3 += local1;
								arg0 += this.anInt3261;
							}
						}
						method24023(this.aByteArray64, arg0, 0, arg3 >> 16, arg4 >> 16);
						arg4 += local31;
						arg3 += local1;
						arg0 += this.anInt3261;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt3261;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method24023(this.aByteArray64, arg0, 0, arg5 >> 16, arg3 >> 16);
								arg5 += local16;
								arg3 += local1;
								arg0 += this.anInt3261;
							}
						}
						method24023(this.aByteArray64, arg0, 0, arg4 >> 16, arg3 >> 16);
						arg4 += local31;
						arg3 += local1;
						arg0 += this.anInt3261;
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
					arg1 *= this.anInt3261;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method24023(this.aByteArray64, arg1, 0, arg3 >> 16, arg5 >> 16);
								arg3 += local1;
								arg5 += local31;
								arg1 += this.anInt3261;
							}
						}
						method24023(this.aByteArray64, arg1, 0, arg3 >> 16, arg4 >> 16);
						arg3 += local1;
						arg4 += local16;
						arg1 += this.anInt3261;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt3261;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method24023(this.aByteArray64, arg1, 0, arg5 >> 16, arg3 >> 16);
								arg3 += local1;
								arg5 += local31;
								arg1 += this.anInt3261;
							}
						}
						method24023(this.aByteArray64, arg1, 0, arg4 >> 16, arg3 >> 16);
						arg3 += local1;
						arg4 += local16;
						arg1 += this.anInt3261;
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
					arg1 *= this.anInt3261;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method24023(this.aByteArray64, arg1, 0, arg3 >> 16, arg4 >> 16);
								arg3 += local31;
								arg4 += local16;
								arg1 += this.anInt3261;
							}
						}
						method24023(this.aByteArray64, arg1, 0, arg5 >> 16, arg4 >> 16);
						arg5 += local1;
						arg4 += local16;
						arg1 += this.anInt3261;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt3261;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method24023(this.aByteArray64, arg1, 0, arg4 >> 16, arg3 >> 16);
								arg3 += local31;
								arg4 += local16;
								arg1 += this.anInt3261;
							}
						}
						method24023(this.aByteArray64, arg1, 0, arg4 >> 16, arg5 >> 16);
						arg5 += local1;
						arg4 += local16;
						arg1 += this.anInt3261;
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
				arg2 *= this.anInt3261;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method24023(this.aByteArray64, arg2, 0, arg4 >> 16, arg3 >> 16);
							arg4 += local16;
							arg3 += local1;
							arg2 += this.anInt3261;
						}
					}
					method24023(this.aByteArray64, arg2, 0, arg4 >> 16, arg5 >> 16);
					arg4 += local16;
					arg5 += local31;
					arg2 += this.anInt3261;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt3261;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method24023(this.aByteArray64, arg2, 0, arg3 >> 16, arg4 >> 16);
							arg4 += local16;
							arg3 += local1;
							arg2 += this.anInt3261;
						}
					}
					method24023(this.aByteArray64, arg2, 0, arg5 >> 16, arg4 >> 16);
					arg4 += local16;
					arg5 += local31;
					arg2 += this.anInt3261;
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
				arg2 *= this.anInt3261;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method24023(this.aByteArray64, arg2, 0, arg4 >> 16, arg5 >> 16);
							arg4 += local1;
							arg5 += local31;
							arg2 += this.anInt3261;
						}
					}
					method24023(this.aByteArray64, arg2, 0, arg3 >> 16, arg5 >> 16);
					arg3 += local16;
					arg5 += local31;
					arg2 += this.anInt3261;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt3261;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method24023(this.aByteArray64, arg2, 0, arg5 >> 16, arg4 >> 16);
							arg4 += local1;
							arg5 += local31;
							arg2 += this.anInt3261;
						}
					}
					method24023(this.aByteArray64, arg2, 0, arg5 >> 16, arg3 >> 16);
					arg3 += local16;
					arg5 += local31;
					arg2 += this.anInt3261;
				}
			}
		}
	}
}
