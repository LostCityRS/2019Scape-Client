package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!atk")
public class Class93_Sub1_Sub4_Sub2 extends Class93_Sub1_Sub4 {

	@OriginalMember(owner = "client!atk", name = "l", descriptor = "I")
	static final int anInt3211 = 16;

	@OriginalMember(owner = "client!atk", name = "d", descriptor = "I")
	int anInt3209;

	@OriginalMember(owner = "client!atk", name = "u", descriptor = "I")
	int anInt3210;

	@OriginalMember(owner = "client!atk", name = "p", descriptor = "I")
	int anInt3212;

	@OriginalMember(owner = "client!atk", name = "z", descriptor = "I")
	int anInt3213;

	@OriginalMember(owner = "client!atk", name = "c", descriptor = "[B")
	final byte[] aByteArray62;

	@OriginalMember(owner = "client!atk", name = "<init>", descriptor = "(Lclient!afa;II)V", line = 14)
	Class93_Sub1_Sub4_Sub2(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray62 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!atk", name = "e", descriptor = "(IIII)V", line = 19)
	void method23518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3212 = arg0;
		this.anInt3209 = arg1;
		this.anInt3210 = arg2 - arg0;
		this.anInt3213 = arg3 - arg1;
	}

	@OriginalMember(owner = "client!atk", name = "w", descriptor = "(IIII)V", line = 19)
	void method23519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3212 = arg0;
		this.anInt3209 = arg1;
		this.anInt3210 = arg2 - arg0;
		this.anInt3213 = arg3 - arg1;
	}

	@OriginalMember(owner = "client!atk", name = "l", descriptor = "(IIII)V", line = 19)
	void method23520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3212 = arg0;
		this.anInt3209 = arg1;
		this.anInt3210 = arg2 - arg0;
		this.anInt3213 = arg3 - arg1;
	}

	@OriginalMember(owner = "client!atk", name = "n", descriptor = "(II)Z", line = 26)
	boolean method23521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray62.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!atk", name = "u", descriptor = "(II)Z", line = 26)
	boolean method23522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray62.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!atk", name = "m", descriptor = "()V", line = 30)
	void method23523() {
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

	@OriginalMember(owner = "client!atk", name = "z", descriptor = "()V", line = 30)
	void method23524() {
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

	@OriginalMember(owner = "client!atk", name = "p", descriptor = "(IIIIII)V", line = 46)
	void method23525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
					arg0 *= this.anInt3210;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg0, 0, arg4 >> 16, arg5 >> 16);
								arg5 += local31;
								arg4 += local16;
								arg0 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg0, 0, arg3 >> 16, arg5 >> 16);
						arg5 += local31;
						arg3 += local1;
						arg0 += this.anInt3210;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt3210;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg0, 0, arg5 >> 16, arg4 >> 16);
								arg5 += local31;
								arg4 += local16;
								arg0 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg0, 0, arg5 >> 16, arg3 >> 16);
						arg5 += local31;
						arg3 += local1;
						arg0 += this.anInt3210;
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
					arg0 *= this.anInt3210;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg0, 0, arg3 >> 16, arg5 >> 16);
								arg5 += local16;
								arg3 += local1;
								arg0 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg0, 0, arg3 >> 16, arg4 >> 16);
						arg4 += local31;
						arg3 += local1;
						arg0 += this.anInt3210;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt3210;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg0, 0, arg5 >> 16, arg3 >> 16);
								arg5 += local16;
								arg3 += local1;
								arg0 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg0, 0, arg4 >> 16, arg3 >> 16);
						arg4 += local31;
						arg3 += local1;
						arg0 += this.anInt3210;
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
					arg1 *= this.anInt3210;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg1, 0, arg3 >> 16, arg5 >> 16);
								arg3 += local1;
								arg5 += local31;
								arg1 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg1, 0, arg3 >> 16, arg4 >> 16);
						arg3 += local1;
						arg4 += local16;
						arg1 += this.anInt3210;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt3210;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg1, 0, arg5 >> 16, arg3 >> 16);
								arg3 += local1;
								arg5 += local31;
								arg1 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg1, 0, arg4 >> 16, arg3 >> 16);
						arg3 += local1;
						arg4 += local16;
						arg1 += this.anInt3210;
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
					arg1 *= this.anInt3210;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg1, 0, arg3 >> 16, arg4 >> 16);
								arg3 += local31;
								arg4 += local16;
								arg1 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg1, 0, arg5 >> 16, arg4 >> 16);
						arg5 += local1;
						arg4 += local16;
						arg1 += this.anInt3210;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt3210;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg1, 0, arg4 >> 16, arg3 >> 16);
								arg3 += local31;
								arg4 += local16;
								arg1 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg1, 0, arg4 >> 16, arg5 >> 16);
						arg5 += local1;
						arg4 += local16;
						arg1 += this.anInt3210;
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
				arg2 *= this.anInt3210;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method23529(this.aByteArray62, arg2, 0, arg4 >> 16, arg3 >> 16);
							arg4 += local16;
							arg3 += local1;
							arg2 += this.anInt3210;
						}
					}
					method23529(this.aByteArray62, arg2, 0, arg4 >> 16, arg5 >> 16);
					arg4 += local16;
					arg5 += local31;
					arg2 += this.anInt3210;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt3210;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method23529(this.aByteArray62, arg2, 0, arg3 >> 16, arg4 >> 16);
							arg4 += local16;
							arg3 += local1;
							arg2 += this.anInt3210;
						}
					}
					method23529(this.aByteArray62, arg2, 0, arg5 >> 16, arg4 >> 16);
					arg4 += local16;
					arg5 += local31;
					arg2 += this.anInt3210;
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
				arg2 *= this.anInt3210;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method23529(this.aByteArray62, arg2, 0, arg4 >> 16, arg5 >> 16);
							arg4 += local1;
							arg5 += local31;
							arg2 += this.anInt3210;
						}
					}
					method23529(this.aByteArray62, arg2, 0, arg3 >> 16, arg5 >> 16);
					arg3 += local16;
					arg5 += local31;
					arg2 += this.anInt3210;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt3210;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method23529(this.aByteArray62, arg2, 0, arg5 >> 16, arg4 >> 16);
							arg4 += local1;
							arg5 += local31;
							arg2 += this.anInt3210;
						}
					}
					method23529(this.aByteArray62, arg2, 0, arg5 >> 16, arg3 >> 16);
					arg3 += local16;
					arg5 += local31;
					arg2 += this.anInt3210;
				}
			}
		}
	}

	@OriginalMember(owner = "client!atk", name = "k", descriptor = "(IIIIII)V", line = 46)
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
					arg0 *= this.anInt3210;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg0, 0, arg4 >> 16, arg5 >> 16);
								arg5 += local31;
								arg4 += local16;
								arg0 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg0, 0, arg3 >> 16, arg5 >> 16);
						arg5 += local31;
						arg3 += local1;
						arg0 += this.anInt3210;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt3210;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg0, 0, arg5 >> 16, arg4 >> 16);
								arg5 += local31;
								arg4 += local16;
								arg0 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg0, 0, arg5 >> 16, arg3 >> 16);
						arg5 += local31;
						arg3 += local1;
						arg0 += this.anInt3210;
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
					arg0 *= this.anInt3210;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg0, 0, arg3 >> 16, arg5 >> 16);
								arg5 += local16;
								arg3 += local1;
								arg0 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg0, 0, arg3 >> 16, arg4 >> 16);
						arg4 += local31;
						arg3 += local1;
						arg0 += this.anInt3210;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt3210;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg0, 0, arg5 >> 16, arg3 >> 16);
								arg5 += local16;
								arg3 += local1;
								arg0 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg0, 0, arg4 >> 16, arg3 >> 16);
						arg4 += local31;
						arg3 += local1;
						arg0 += this.anInt3210;
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
					arg1 *= this.anInt3210;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg1, 0, arg3 >> 16, arg5 >> 16);
								arg3 += local1;
								arg5 += local31;
								arg1 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg1, 0, arg3 >> 16, arg4 >> 16);
						arg3 += local1;
						arg4 += local16;
						arg1 += this.anInt3210;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt3210;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg1, 0, arg5 >> 16, arg3 >> 16);
								arg3 += local1;
								arg5 += local31;
								arg1 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg1, 0, arg4 >> 16, arg3 >> 16);
						arg3 += local1;
						arg4 += local16;
						arg1 += this.anInt3210;
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
					arg1 *= this.anInt3210;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg1, 0, arg3 >> 16, arg4 >> 16);
								arg3 += local31;
								arg4 += local16;
								arg1 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg1, 0, arg5 >> 16, arg4 >> 16);
						arg5 += local1;
						arg4 += local16;
						arg1 += this.anInt3210;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt3210;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg1, 0, arg4 >> 16, arg3 >> 16);
								arg3 += local31;
								arg4 += local16;
								arg1 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg1, 0, arg4 >> 16, arg5 >> 16);
						arg5 += local1;
						arg4 += local16;
						arg1 += this.anInt3210;
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
				arg2 *= this.anInt3210;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method23529(this.aByteArray62, arg2, 0, arg4 >> 16, arg3 >> 16);
							arg4 += local16;
							arg3 += local1;
							arg2 += this.anInt3210;
						}
					}
					method23529(this.aByteArray62, arg2, 0, arg4 >> 16, arg5 >> 16);
					arg4 += local16;
					arg5 += local31;
					arg2 += this.anInt3210;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt3210;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method23529(this.aByteArray62, arg2, 0, arg3 >> 16, arg4 >> 16);
							arg4 += local16;
							arg3 += local1;
							arg2 += this.anInt3210;
						}
					}
					method23529(this.aByteArray62, arg2, 0, arg5 >> 16, arg4 >> 16);
					arg4 += local16;
					arg5 += local31;
					arg2 += this.anInt3210;
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
				arg2 *= this.anInt3210;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method23529(this.aByteArray62, arg2, 0, arg4 >> 16, arg5 >> 16);
							arg4 += local1;
							arg5 += local31;
							arg2 += this.anInt3210;
						}
					}
					method23529(this.aByteArray62, arg2, 0, arg3 >> 16, arg5 >> 16);
					arg3 += local16;
					arg5 += local31;
					arg2 += this.anInt3210;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt3210;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method23529(this.aByteArray62, arg2, 0, arg5 >> 16, arg4 >> 16);
							arg4 += local1;
							arg5 += local31;
							arg2 += this.anInt3210;
						}
					}
					method23529(this.aByteArray62, arg2, 0, arg5 >> 16, arg3 >> 16);
					arg3 += local16;
					arg5 += local31;
					arg2 += this.anInt3210;
				}
			}
		}
	}

	@OriginalMember(owner = "client!atk", name = "d", descriptor = "(IIIIII)V", line = 46)
	void method23527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
					arg0 *= this.anInt3210;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg0, 0, arg4 >> 16, arg5 >> 16);
								arg5 += local31;
								arg4 += local16;
								arg0 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg0, 0, arg3 >> 16, arg5 >> 16);
						arg5 += local31;
						arg3 += local1;
						arg0 += this.anInt3210;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt3210;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg0, 0, arg5 >> 16, arg4 >> 16);
								arg5 += local31;
								arg4 += local16;
								arg0 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg0, 0, arg5 >> 16, arg3 >> 16);
						arg5 += local31;
						arg3 += local1;
						arg0 += this.anInt3210;
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
					arg0 *= this.anInt3210;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg0, 0, arg3 >> 16, arg5 >> 16);
								arg5 += local16;
								arg3 += local1;
								arg0 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg0, 0, arg3 >> 16, arg4 >> 16);
						arg4 += local31;
						arg3 += local1;
						arg0 += this.anInt3210;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt3210;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg0, 0, arg5 >> 16, arg3 >> 16);
								arg5 += local16;
								arg3 += local1;
								arg0 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg0, 0, arg4 >> 16, arg3 >> 16);
						arg4 += local31;
						arg3 += local1;
						arg0 += this.anInt3210;
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
					arg1 *= this.anInt3210;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg1, 0, arg3 >> 16, arg5 >> 16);
								arg3 += local1;
								arg5 += local31;
								arg1 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg1, 0, arg3 >> 16, arg4 >> 16);
						arg3 += local1;
						arg4 += local16;
						arg1 += this.anInt3210;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt3210;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg1, 0, arg5 >> 16, arg3 >> 16);
								arg3 += local1;
								arg5 += local31;
								arg1 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg1, 0, arg4 >> 16, arg3 >> 16);
						arg3 += local1;
						arg4 += local16;
						arg1 += this.anInt3210;
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
					arg1 *= this.anInt3210;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg1, 0, arg3 >> 16, arg4 >> 16);
								arg3 += local31;
								arg4 += local16;
								arg1 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg1, 0, arg5 >> 16, arg4 >> 16);
						arg5 += local1;
						arg4 += local16;
						arg1 += this.anInt3210;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt3210;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg1, 0, arg4 >> 16, arg3 >> 16);
								arg3 += local31;
								arg4 += local16;
								arg1 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg1, 0, arg4 >> 16, arg5 >> 16);
						arg5 += local1;
						arg4 += local16;
						arg1 += this.anInt3210;
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
				arg2 *= this.anInt3210;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method23529(this.aByteArray62, arg2, 0, arg4 >> 16, arg3 >> 16);
							arg4 += local16;
							arg3 += local1;
							arg2 += this.anInt3210;
						}
					}
					method23529(this.aByteArray62, arg2, 0, arg4 >> 16, arg5 >> 16);
					arg4 += local16;
					arg5 += local31;
					arg2 += this.anInt3210;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt3210;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method23529(this.aByteArray62, arg2, 0, arg3 >> 16, arg4 >> 16);
							arg4 += local16;
							arg3 += local1;
							arg2 += this.anInt3210;
						}
					}
					method23529(this.aByteArray62, arg2, 0, arg5 >> 16, arg4 >> 16);
					arg4 += local16;
					arg5 += local31;
					arg2 += this.anInt3210;
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
				arg2 *= this.anInt3210;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method23529(this.aByteArray62, arg2, 0, arg4 >> 16, arg5 >> 16);
							arg4 += local1;
							arg5 += local31;
							arg2 += this.anInt3210;
						}
					}
					method23529(this.aByteArray62, arg2, 0, arg3 >> 16, arg5 >> 16);
					arg3 += local16;
					arg5 += local31;
					arg2 += this.anInt3210;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt3210;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method23529(this.aByteArray62, arg2, 0, arg5 >> 16, arg4 >> 16);
							arg4 += local1;
							arg5 += local31;
							arg2 += this.anInt3210;
						}
					}
					method23529(this.aByteArray62, arg2, 0, arg5 >> 16, arg3 >> 16);
					arg3 += local16;
					arg5 += local31;
					arg2 += this.anInt3210;
				}
			}
		}
	}

	@OriginalMember(owner = "client!atk", name = "c", descriptor = "(IIIIII)V", line = 46)
	void method23528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
					arg0 *= this.anInt3210;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg0, 0, arg4 >> 16, arg5 >> 16);
								arg5 += local31;
								arg4 += local16;
								arg0 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg0, 0, arg3 >> 16, arg5 >> 16);
						arg5 += local31;
						arg3 += local1;
						arg0 += this.anInt3210;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt3210;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg0, 0, arg5 >> 16, arg4 >> 16);
								arg5 += local31;
								arg4 += local16;
								arg0 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg0, 0, arg5 >> 16, arg3 >> 16);
						arg5 += local31;
						arg3 += local1;
						arg0 += this.anInt3210;
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
					arg0 *= this.anInt3210;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg0, 0, arg3 >> 16, arg5 >> 16);
								arg5 += local16;
								arg3 += local1;
								arg0 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg0, 0, arg3 >> 16, arg4 >> 16);
						arg4 += local31;
						arg3 += local1;
						arg0 += this.anInt3210;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt3210;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg0, 0, arg5 >> 16, arg3 >> 16);
								arg5 += local16;
								arg3 += local1;
								arg0 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg0, 0, arg4 >> 16, arg3 >> 16);
						arg4 += local31;
						arg3 += local1;
						arg0 += this.anInt3210;
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
					arg1 *= this.anInt3210;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg1, 0, arg3 >> 16, arg5 >> 16);
								arg3 += local1;
								arg5 += local31;
								arg1 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg1, 0, arg3 >> 16, arg4 >> 16);
						arg3 += local1;
						arg4 += local16;
						arg1 += this.anInt3210;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt3210;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg1, 0, arg5 >> 16, arg3 >> 16);
								arg3 += local1;
								arg5 += local31;
								arg1 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg1, 0, arg4 >> 16, arg3 >> 16);
						arg3 += local1;
						arg4 += local16;
						arg1 += this.anInt3210;
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
					arg1 *= this.anInt3210;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg1, 0, arg3 >> 16, arg4 >> 16);
								arg3 += local31;
								arg4 += local16;
								arg1 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg1, 0, arg5 >> 16, arg4 >> 16);
						arg5 += local1;
						arg4 += local16;
						arg1 += this.anInt3210;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt3210;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								method23529(this.aByteArray62, arg1, 0, arg4 >> 16, arg3 >> 16);
								arg3 += local31;
								arg4 += local16;
								arg1 += this.anInt3210;
							}
						}
						method23529(this.aByteArray62, arg1, 0, arg4 >> 16, arg5 >> 16);
						arg5 += local1;
						arg4 += local16;
						arg1 += this.anInt3210;
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
				arg2 *= this.anInt3210;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method23529(this.aByteArray62, arg2, 0, arg4 >> 16, arg3 >> 16);
							arg4 += local16;
							arg3 += local1;
							arg2 += this.anInt3210;
						}
					}
					method23529(this.aByteArray62, arg2, 0, arg4 >> 16, arg5 >> 16);
					arg4 += local16;
					arg5 += local31;
					arg2 += this.anInt3210;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt3210;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							method23529(this.aByteArray62, arg2, 0, arg3 >> 16, arg4 >> 16);
							arg4 += local16;
							arg3 += local1;
							arg2 += this.anInt3210;
						}
					}
					method23529(this.aByteArray62, arg2, 0, arg5 >> 16, arg4 >> 16);
					arg4 += local16;
					arg5 += local31;
					arg2 += this.anInt3210;
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
				arg2 *= this.anInt3210;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method23529(this.aByteArray62, arg2, 0, arg4 >> 16, arg5 >> 16);
							arg4 += local1;
							arg5 += local31;
							arg2 += this.anInt3210;
						}
					}
					method23529(this.aByteArray62, arg2, 0, arg3 >> 16, arg5 >> 16);
					arg3 += local16;
					arg5 += local31;
					arg2 += this.anInt3210;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt3210;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							method23529(this.aByteArray62, arg2, 0, arg5 >> 16, arg4 >> 16);
							arg4 += local1;
							arg5 += local31;
							arg2 += this.anInt3210;
						}
					}
					method23529(this.aByteArray62, arg2, 0, arg5 >> 16, arg3 >> 16);
					arg3 += local16;
					arg5 += local31;
					arg2 += this.anInt3210;
				}
			}
		}
	}

	@OriginalMember(owner = "client!atk", name = "f", descriptor = "([BIIII)V", line = 355)
	static final void method23529(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
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
}
