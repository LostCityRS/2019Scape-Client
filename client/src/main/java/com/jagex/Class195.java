package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public class Class195 {

	@OriginalMember(owner = "client!bt", name = "n", descriptor = "I")
	static final int anInt3359 = 128;

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
	static final int anInt3362 = 7;

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "Z")
	boolean aBoolean576 = true;

	@OriginalMember(owner = "client!bt", name = "u", descriptor = "I")
	int anInt3363 = -1;

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_41;

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "Lclient!ci;")
	final Class205 aClass205_2;

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "I")
	final int anInt3360;

	@OriginalMember(owner = "client!bt", name = "w", descriptor = "I")
	final int anInt3361;

	@OriginalMember(owner = "client!bt", name = "z", descriptor = "I")
	final int anInt3364;

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "Lclient!cf;")
	Interface16 anInterface16_5;

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "Lclient!aeo;")
	Class101_Sub1 aClass101_Sub1_2;

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "Lclient!adt;")
	Class88_Sub2 aClass88_Sub2_5;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lclient!afa;Lclient!ci;Lclient!aek;IIIII)V", line = 21)
	Class195(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Class205 arg1, @OriginalArg(2) Class99_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass104_Sub1_41 = arg0;
		this.aClass205_2 = arg1;
		this.anInt3360 = arg6;
		this.anInt3361 = arg7;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(49) int local49;
		@Pc(51) int local51;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local49 = (local33 + local35) * arg2.anInt414 * -1667858293 + local29;
			for (local51 = 0; local51 < local23; local51++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray2[local49++];
				if (local60 != null) {
					local25 += local60.length;
				}
			}
		}
		this.anInt3364 = local25;
		if (local25 > 0) {
			@Pc(83) Packet local83 = new Packet(local25 * 2);
			@Pc(114) short[] local114;
			@Pc(118) int local118;
			@Pc(105) int local105;
			if (this.aClass104_Sub1_41.aBoolean106) {
				for (local49 = 0; local49 < local23; local49++) {
					local51 = (local33 + local49) * arg2.anInt414 * -1667858293 + local29;
					for (local105 = 0; local105 < local23; local105++) {
						local114 = arg2.aShortArrayArray2[local51++];
						if (local114 != null) {
							for (local118 = 0; local118 < local114.length; local118++) {
								local83.p2(local114[local118] & 0xFFFF, 2130950967);
							}
						}
					}
				}
			} else {
				for (local49 = 0; local49 < local23; local49++) {
					local51 = (local33 + local49) * arg2.anInt414 * -1667858293 + local29;
					for (local105 = 0; local105 < local23; local105++) {
						local114 = arg2.aShortArrayArray2[local51++];
						if (local114 != null) {
							for (local118 = 0; local118 < local114.length; local118++) {
								local83.ip2(local114[local118] & 0xFFFF, -198370378);
							}
						}
					}
				}
			}
			this.anInterface16_5 = this.aClass104_Sub1_41.method3843(5123, local83.data, local83.pos * 212851357, false);
			this.aClass101_Sub1_2 = new Class101_Sub1(this.aClass104_Sub1_41, 5123, null, 1);
		} else {
			this.aClass88_Sub2_5 = null;
		}
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "()V", line = 69)
	void method24598() {
		this.method24605(this.anInterface16_5, this.anInt3364);
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "()V", line = 69)
	void method24599() {
		this.method24605(this.anInterface16_5, this.anInt3364);
	}

	@OriginalMember(owner = "client!bt", name = "w", descriptor = "()V", line = 69)
	void method24600() {
		this.method24605(this.anInterface16_5, this.anInt3364);
	}

	@OriginalMember(owner = "client!bt", name = "u", descriptor = "([BI)V", line = 73)
	void method24601(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aClass101_Sub1_2.method2561(5123, arg0, arg1 * 2);
		this.method24605(this.aClass101_Sub1_2, arg1);
	}

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "([BI)V", line = 73)
	void method24602(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aClass101_Sub1_2.method2561(5123, arg0, arg1 * 2);
		this.method24605(this.aClass101_Sub1_2, arg1);
	}

	@OriginalMember(owner = "client!bt", name = "z", descriptor = "([BI)V", line = 73)
	void method24603(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aClass101_Sub1_2.method2561(5123, arg0, arg1 * 2);
		this.method24605(this.aClass101_Sub1_2, arg1);
	}

	@OriginalMember(owner = "client!bt", name = "n", descriptor = "([BI)V", line = 73)
	void method24604(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aClass101_Sub1_2.method2561(5123, arg0, arg1 * 2);
		this.method24605(this.aClass101_Sub1_2, arg1);
	}

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "(Lclient!cf;I)V", line = 78)
	void method24605(@OriginalArg(0) Interface16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method24609();
			this.aClass104_Sub1_41.method3887(this.aClass88_Sub2_5);
			this.aClass104_Sub1_41.method3862(arg0, 4, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "(Lclient!cf;I)V", line = 78)
	void method24606(@OriginalArg(0) Interface16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method24609();
			this.aClass104_Sub1_41.method3887(this.aClass88_Sub2_5);
			this.aClass104_Sub1_41.method3862(arg0, 4, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!bt", name = "r", descriptor = "()V", line = 85)
	void method24607() {
		if (!this.aBoolean576) {
			return;
		}
		this.aBoolean576 = false;
		@Pc(10) byte[] local10 = this.aClass205_2.aByteArray66;
		@Pc(14) byte[] local14 = this.aClass104_Sub1_41.aByteArray17;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = this.aClass205_2.anInt3384;
		@Pc(30) int local30 = this.anInt3360 + this.anInt3361 * this.aClass205_2.anInt3384;
		@Pc(32) int local32;
		@Pc(42) int local42;
		for (local32 = -128; local32 < 0; local32++) {
			local16 = (local16 << 8) - local16;
			for (local42 = -128; local42 < 0; local42++) {
				if (local10[local30++] != 0) {
					local16++;
				}
			}
			local30 += local20 - 128;
		}
		if (this.aClass88_Sub2_5 != null && this.anInt3363 == local16) {
			this.aBoolean576 = false;
			return;
		}
		this.anInt3363 = local16;
		local32 = 0;
		local30 = this.anInt3360 + this.anInt3361 * local20;
		for (local42 = -128; local42 < 0; local42++) {
			for (@Pc(90) int local90 = -128; local90 < 0; local90++) {
				if (local10[local30] == 0) {
					@Pc(104) int local104 = 0;
					if (local10[local30 - 1] != 0) {
						local104++;
					}
					if (local10[local30 + 1] != 0) {
						local104++;
					}
					if (local10[local30 - local20] != 0) {
						local104++;
					}
					if (local10[local30 + local20] != 0) {
						local104++;
					}
					local14[local32++] = (byte) (local104 * 17);
				} else {
					local14[local32++] = 68;
				}
				local30++;
			}
			local30 += this.aClass205_2.anInt3384 - 128;
		}
		if (this.aClass88_Sub2_5 == null) {
			this.aClass88_Sub2_5 = new Class88_Sub2(this.aClass104_Sub1_41, 3553, Class206.aClass206_19, Class226.aClass226_22, 128, 128, false, this.aClass104_Sub1_41.aByteArray17, Class206.aClass206_19, false);
			this.aClass88_Sub2_5.method18079(false, false);
			this.aClass88_Sub2_5.method18040(true);
		} else {
			this.aClass88_Sub2_5.method18084(0, 0, 128, 128, this.aClass104_Sub1_41.aByteArray17, Class206.aClass206_19, 0, 0, false);
		}
	}

	@OriginalMember(owner = "client!bt", name = "o", descriptor = "()V", line = 85)
	void method24608() {
		if (!this.aBoolean576) {
			return;
		}
		this.aBoolean576 = false;
		@Pc(10) byte[] local10 = this.aClass205_2.aByteArray66;
		@Pc(14) byte[] local14 = this.aClass104_Sub1_41.aByteArray17;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = this.aClass205_2.anInt3384;
		@Pc(30) int local30 = this.anInt3360 + this.anInt3361 * this.aClass205_2.anInt3384;
		@Pc(32) int local32;
		@Pc(42) int local42;
		for (local32 = -128; local32 < 0; local32++) {
			local16 = (local16 << 8) - local16;
			for (local42 = -128; local42 < 0; local42++) {
				if (local10[local30++] != 0) {
					local16++;
				}
			}
			local30 += local20 - 128;
		}
		if (this.aClass88_Sub2_5 != null && this.anInt3363 == local16) {
			this.aBoolean576 = false;
			return;
		}
		this.anInt3363 = local16;
		local32 = 0;
		local30 = this.anInt3360 + this.anInt3361 * local20;
		for (local42 = -128; local42 < 0; local42++) {
			for (@Pc(90) int local90 = -128; local90 < 0; local90++) {
				if (local10[local30] == 0) {
					@Pc(104) int local104 = 0;
					if (local10[local30 - 1] != 0) {
						local104++;
					}
					if (local10[local30 + 1] != 0) {
						local104++;
					}
					if (local10[local30 - local20] != 0) {
						local104++;
					}
					if (local10[local30 + local20] != 0) {
						local104++;
					}
					local14[local32++] = (byte) (local104 * 17);
				} else {
					local14[local32++] = 68;
				}
				local30++;
			}
			local30 += this.aClass205_2.anInt3384 - 128;
		}
		if (this.aClass88_Sub2_5 == null) {
			this.aClass88_Sub2_5 = new Class88_Sub2(this.aClass104_Sub1_41, 3553, Class206.aClass206_19, Class226.aClass226_22, 128, 128, false, this.aClass104_Sub1_41.aByteArray17, Class206.aClass206_19, false);
			this.aClass88_Sub2_5.method18079(false, false);
			this.aClass88_Sub2_5.method18040(true);
		} else {
			this.aClass88_Sub2_5.method18084(0, 0, 128, 128, this.aClass104_Sub1_41.aByteArray17, Class206.aClass206_19, 0, 0, false);
		}
	}

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "()V", line = 85)
	void method24609() {
		if (!this.aBoolean576) {
			return;
		}
		this.aBoolean576 = false;
		@Pc(10) byte[] local10 = this.aClass205_2.aByteArray66;
		@Pc(14) byte[] local14 = this.aClass104_Sub1_41.aByteArray17;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = this.aClass205_2.anInt3384;
		@Pc(30) int local30 = this.anInt3360 + this.anInt3361 * this.aClass205_2.anInt3384;
		@Pc(32) int local32;
		@Pc(42) int local42;
		for (local32 = -128; local32 < 0; local32++) {
			local16 = (local16 << 8) - local16;
			for (local42 = -128; local42 < 0; local42++) {
				if (local10[local30++] != 0) {
					local16++;
				}
			}
			local30 += local20 - 128;
		}
		if (this.aClass88_Sub2_5 != null && this.anInt3363 == local16) {
			this.aBoolean576 = false;
			return;
		}
		this.anInt3363 = local16;
		local32 = 0;
		local30 = this.anInt3360 + this.anInt3361 * local20;
		for (local42 = -128; local42 < 0; local42++) {
			for (@Pc(90) int local90 = -128; local90 < 0; local90++) {
				if (local10[local30] == 0) {
					@Pc(104) int local104 = 0;
					if (local10[local30 - 1] != 0) {
						local104++;
					}
					if (local10[local30 + 1] != 0) {
						local104++;
					}
					if (local10[local30 - local20] != 0) {
						local104++;
					}
					if (local10[local30 + local20] != 0) {
						local104++;
					}
					local14[local32++] = (byte) (local104 * 17);
				} else {
					local14[local32++] = 68;
				}
				local30++;
			}
			local30 += this.aClass205_2.anInt3384 - 128;
		}
		if (this.aClass88_Sub2_5 == null) {
			this.aClass88_Sub2_5 = new Class88_Sub2(this.aClass104_Sub1_41, 3553, Class206.aClass206_19, Class226.aClass226_22, 128, 128, false, this.aClass104_Sub1_41.aByteArray17, Class206.aClass206_19, false);
			this.aClass88_Sub2_5.method18079(false, false);
			this.aClass88_Sub2_5.method18040(true);
		} else {
			this.aClass88_Sub2_5.method18084(0, 0, 128, 128, this.aClass104_Sub1_41.aByteArray17, Class206.aClass206_19, 0, 0, false);
		}
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "()V", line = 85)
	void method24610() {
		if (!this.aBoolean576) {
			return;
		}
		this.aBoolean576 = false;
		@Pc(10) byte[] local10 = this.aClass205_2.aByteArray66;
		@Pc(14) byte[] local14 = this.aClass104_Sub1_41.aByteArray17;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = this.aClass205_2.anInt3384;
		@Pc(30) int local30 = this.anInt3360 + this.anInt3361 * this.aClass205_2.anInt3384;
		@Pc(32) int local32;
		@Pc(42) int local42;
		for (local32 = -128; local32 < 0; local32++) {
			local16 = (local16 << 8) - local16;
			for (local42 = -128; local42 < 0; local42++) {
				if (local10[local30++] != 0) {
					local16++;
				}
			}
			local30 += local20 - 128;
		}
		if (this.aClass88_Sub2_5 != null && this.anInt3363 == local16) {
			this.aBoolean576 = false;
			return;
		}
		this.anInt3363 = local16;
		local32 = 0;
		local30 = this.anInt3360 + this.anInt3361 * local20;
		for (local42 = -128; local42 < 0; local42++) {
			for (@Pc(90) int local90 = -128; local90 < 0; local90++) {
				if (local10[local30] == 0) {
					@Pc(104) int local104 = 0;
					if (local10[local30 - 1] != 0) {
						local104++;
					}
					if (local10[local30 + 1] != 0) {
						local104++;
					}
					if (local10[local30 - local20] != 0) {
						local104++;
					}
					if (local10[local30 + local20] != 0) {
						local104++;
					}
					local14[local32++] = (byte) (local104 * 17);
				} else {
					local14[local32++] = 68;
				}
				local30++;
			}
			local30 += this.aClass205_2.anInt3384 - 128;
		}
		if (this.aClass88_Sub2_5 == null) {
			this.aClass88_Sub2_5 = new Class88_Sub2(this.aClass104_Sub1_41, 3553, Class206.aClass206_19, Class226.aClass226_22, 128, 128, false, this.aClass104_Sub1_41.aByteArray17, Class206.aClass206_19, false);
			this.aClass88_Sub2_5.method18079(false, false);
			this.aClass88_Sub2_5.method18040(true);
		} else {
			this.aClass88_Sub2_5.method18084(0, 0, 128, 128, this.aClass104_Sub1_41.aByteArray17, Class206.aClass206_19, 0, 0, false);
		}
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "()V", line = 85)
	void method24611() {
		if (!this.aBoolean576) {
			return;
		}
		this.aBoolean576 = false;
		@Pc(10) byte[] local10 = this.aClass205_2.aByteArray66;
		@Pc(14) byte[] local14 = this.aClass104_Sub1_41.aByteArray17;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = this.aClass205_2.anInt3384;
		@Pc(30) int local30 = this.anInt3360 + this.anInt3361 * this.aClass205_2.anInt3384;
		@Pc(32) int local32;
		@Pc(42) int local42;
		for (local32 = -128; local32 < 0; local32++) {
			local16 = (local16 << 8) - local16;
			for (local42 = -128; local42 < 0; local42++) {
				if (local10[local30++] != 0) {
					local16++;
				}
			}
			local30 += local20 - 128;
		}
		if (this.aClass88_Sub2_5 != null && this.anInt3363 == local16) {
			this.aBoolean576 = false;
			return;
		}
		this.anInt3363 = local16;
		local32 = 0;
		local30 = this.anInt3360 + this.anInt3361 * local20;
		for (local42 = -128; local42 < 0; local42++) {
			for (@Pc(90) int local90 = -128; local90 < 0; local90++) {
				if (local10[local30] == 0) {
					@Pc(104) int local104 = 0;
					if (local10[local30 - 1] != 0) {
						local104++;
					}
					if (local10[local30 + 1] != 0) {
						local104++;
					}
					if (local10[local30 - local20] != 0) {
						local104++;
					}
					if (local10[local30 + local20] != 0) {
						local104++;
					}
					local14[local32++] = (byte) (local104 * 17);
				} else {
					local14[local32++] = 68;
				}
				local30++;
			}
			local30 += this.aClass205_2.anInt3384 - 128;
		}
		if (this.aClass88_Sub2_5 == null) {
			this.aClass88_Sub2_5 = new Class88_Sub2(this.aClass104_Sub1_41, 3553, Class206.aClass206_19, Class226.aClass226_22, 128, 128, false, this.aClass104_Sub1_41.aByteArray17, Class206.aClass206_19, false);
			this.aClass88_Sub2_5.method18079(false, false);
			this.aClass88_Sub2_5.method18040(true);
		} else {
			this.aClass88_Sub2_5.method18084(0, 0, 128, 128, this.aClass104_Sub1_41.aByteArray17, Class206.aClass206_19, 0, 0, false);
		}
	}

	@OriginalMember(owner = "client!bt", name = "v", descriptor = "()V", line = 85)
	void method24612() {
		if (!this.aBoolean576) {
			return;
		}
		this.aBoolean576 = false;
		@Pc(10) byte[] local10 = this.aClass205_2.aByteArray66;
		@Pc(14) byte[] local14 = this.aClass104_Sub1_41.aByteArray17;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = this.aClass205_2.anInt3384;
		@Pc(30) int local30 = this.anInt3360 + this.anInt3361 * this.aClass205_2.anInt3384;
		@Pc(32) int local32;
		@Pc(42) int local42;
		for (local32 = -128; local32 < 0; local32++) {
			local16 = (local16 << 8) - local16;
			for (local42 = -128; local42 < 0; local42++) {
				if (local10[local30++] != 0) {
					local16++;
				}
			}
			local30 += local20 - 128;
		}
		if (this.aClass88_Sub2_5 != null && this.anInt3363 == local16) {
			this.aBoolean576 = false;
			return;
		}
		this.anInt3363 = local16;
		local32 = 0;
		local30 = this.anInt3360 + this.anInt3361 * local20;
		for (local42 = -128; local42 < 0; local42++) {
			for (@Pc(90) int local90 = -128; local90 < 0; local90++) {
				if (local10[local30] == 0) {
					@Pc(104) int local104 = 0;
					if (local10[local30 - 1] != 0) {
						local104++;
					}
					if (local10[local30 + 1] != 0) {
						local104++;
					}
					if (local10[local30 - local20] != 0) {
						local104++;
					}
					if (local10[local30 + local20] != 0) {
						local104++;
					}
					local14[local32++] = (byte) (local104 * 17);
				} else {
					local14[local32++] = 68;
				}
				local30++;
			}
			local30 += this.aClass205_2.anInt3384 - 128;
		}
		if (this.aClass88_Sub2_5 == null) {
			this.aClass88_Sub2_5 = new Class88_Sub2(this.aClass104_Sub1_41, 3553, Class206.aClass206_19, Class226.aClass226_22, 128, 128, false, this.aClass104_Sub1_41.aByteArray17, Class206.aClass206_19, false);
			this.aClass88_Sub2_5.method18079(false, false);
			this.aClass88_Sub2_5.method18040(true);
		} else {
			this.aClass88_Sub2_5.method18084(0, 0, 128, 128, this.aClass104_Sub1_41.aByteArray17, Class206.aClass206_19, 0, 0, false);
		}
	}
}
