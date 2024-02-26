package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.nio.ByteBuffer;

@OriginalClass("client!lr")
public final class Class403 {

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
	static final int anInt4585 = 128;

	@OriginalMember(owner = "client!lr", name = "t", descriptor = "I")
	static final int anInt4592 = 7;

	@OriginalMember(owner = "client!lr", name = "w", descriptor = "[B")
	byte[] aByteArray90;

	@OriginalMember(owner = "client!lr", name = "x", descriptor = "[I")
	int[] anIntArray444;

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "Z")
	boolean aBoolean855 = true;

	@OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
	int anInt4591 = -1;

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "Lclient!afa;")
	final Class102_Sub1 aClass102_Sub1_38;

	@OriginalMember(owner = "client!lr", name = "u", descriptor = "Lclient!lu;")
	final Class406 aClass406_2;

	@OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
	final int anInt4586;

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
	final int anInt4587;

	@OriginalMember(owner = "client!lr", name = "k", descriptor = "I")
	int anInt4590;

	@OriginalMember(owner = "client!lr", name = "s", descriptor = "I")
	int anInt4589;

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "Lclient!mv;")
	Interface44 anInterface44_6;

	@OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
	final int anInt4588;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "Lclient!lb;")
	Interface34 anInterface34_25;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!afa;Lclient!lu;Lclient!aes;IIIII)V")
	Class403(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) Class406 arg1, @OriginalArg(2) Class100_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass102_Sub1_38 = arg0;
		this.aClass406_2 = arg1;
		this.anInt4586 = arg6;
		this.anInt4587 = arg7;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(49) int local49;
		@Pc(51) int local51;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local49 = (local33 + local35) * arg2.anInt448 * -1548585779 + local29;
			for (local51 = 0; local51 < local23; local51++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray2[local49++];
				if (local60 != null) {
					local25 += local60.length;
				}
			}
		}
		if (local25 > 0) {
			this.anInt4590 = Integer.MIN_VALUE;
			this.anInt4589 = Integer.MAX_VALUE;
			this.anInterface44_6 = this.aClass102_Sub1_38.method21246(false);
			this.anInterface44_6.method29401(local25);
			@Pc(93) ByteBuffer local93 = this.aClass102_Sub1_38.aByteBuffer7;
			local93.clear();
			for (local49 = 0; local49 < local23; local49++) {
				local51 = (local33 + local49) * arg2.anInt448 * -1548585779 + local29;
				for (@Pc(114) int local114 = 0; local114 < local23; local114++) {
					@Pc(123) short[] local123 = arg2.aShortArrayArray2[local51++];
					if (local123 != null) {
						for (@Pc(127) int local127 = 0; local127 < local123.length; local127++) {
							@Pc(137) int local137 = local123[local127] & 0xFFFF;
							if (local137 < this.anInt4589) {
								this.anInt4589 = local137;
							}
							if (local137 > this.anInt4590) {
								this.anInt4590 = local137;
							}
							local93.putShort((short) local137);
						}
					}
				}
			}
			this.anInterface44_6.method29383(0, local93.position(), this.aClass102_Sub1_38.aLong168);
			this.anInt4588 = local25 / 3;
		} else {
			this.anInt4588 = 0;
			this.anInterface34_25 = null;
		}
	}

	@OriginalMember(owner = "client!lr", name = "t", descriptor = "(Lclient!je;)V")
	void method28897(@OriginalArg(0) Class119 arg0) {
		this.method28898(arg0, this.anInterface44_6, 0, this.anInt4588);
	}

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "(Lclient!je;Lclient!mv;II)V")
	void method28898(@OriginalArg(0) Class119 arg0, @OriginalArg(1) Interface44 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= 0) {
			return;
		}
		this.method28904();
		this.aClass102_Sub1_38.method21251(arg1);
		arg0.anInterface34_8 = this.anInterface34_25;
		arg0.anInt1107 = this.anInt4589;
		arg0.anInt1108 = this.anInt4590 - this.anInt4589 + 1;
		arg0.anInt1105 = arg2;
		arg0.anInt1109 = arg3;
		arg0.method9410(false);
	}

	@OriginalMember(owner = "client!lr", name = "m", descriptor = "(Lclient!je;Lclient!mv;II)V")
	void method28899(@OriginalArg(0) Class119 arg0, @OriginalArg(1) Interface44 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= 0) {
			return;
		}
		this.method28904();
		this.aClass102_Sub1_38.method21251(arg1);
		arg0.anInterface34_8 = this.anInterface34_25;
		arg0.anInt1107 = this.anInt4589;
		arg0.anInt1108 = this.anInt4590 - this.anInt4589 + 1;
		arg0.anInt1105 = arg2;
		arg0.anInt1109 = arg3;
		arg0.method9410(false);
	}

	@OriginalMember(owner = "client!lr", name = "u", descriptor = "(Lclient!je;)V")
	void method28900(@OriginalArg(0) Class119 arg0) {
		this.method28898(arg0, this.anInterface44_6, 0, this.anInt4588);
	}

	@OriginalMember(owner = "client!lr", name = "l", descriptor = "(Lclient!je;Lclient!mv;II)V")
	void method28901(@OriginalArg(0) Class119 arg0, @OriginalArg(1) Interface44 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= 0) {
			return;
		}
		this.method28904();
		this.aClass102_Sub1_38.method21251(arg1);
		arg0.anInterface34_8 = this.anInterface34_25;
		arg0.anInt1107 = this.anInt4589;
		arg0.anInt1108 = this.anInt4590 - this.anInt4589 + 1;
		arg0.anInt1105 = arg2;
		arg0.anInt1109 = arg3;
		arg0.method9410(false);
	}

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "(Lclient!je;Lclient!mv;II)V")
	void method28902(@OriginalArg(0) Class119 arg0, @OriginalArg(1) Interface44 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= 0) {
			return;
		}
		this.method28904();
		this.aClass102_Sub1_38.method21251(arg1);
		arg0.anInterface34_8 = this.anInterface34_25;
		arg0.anInt1107 = this.anInt4589;
		arg0.anInt1108 = this.anInt4590 - this.anInt4589 + 1;
		arg0.anInt1105 = arg2;
		arg0.anInt1109 = arg3;
		arg0.method9410(false);
	}

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "(Lclient!je;Lclient!mv;II)V")
	void method28903(@OriginalArg(0) Class119 arg0, @OriginalArg(1) Interface44 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= 0) {
			return;
		}
		this.method28904();
		this.aClass102_Sub1_38.method21251(arg1);
		arg0.anInterface34_8 = this.anInterface34_25;
		arg0.anInt1107 = this.anInt4589;
		arg0.anInt1108 = this.anInt4590 - this.anInt4589 + 1;
		arg0.anInt1105 = arg2;
		arg0.anInt1109 = arg3;
		arg0.method9410(false);
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "()V")
	void method28904() {
		if (!this.aBoolean855) {
			return;
		}
		this.aBoolean855 = false;
		@Pc(10) byte[] local10 = this.aClass406_2.aByteArray91;
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = this.aClass406_2.anInt4595;
		@Pc(26) int local26 = this.anInt4586 + this.anInt4587 * this.aClass406_2.anInt4595;
		@Pc(28) int local28;
		for (local28 = -128; local28 < 0; local28++) {
			local12 = (local12 << 8) - local12;
			for (@Pc(38) int local38 = -128; local38 < 0; local38++) {
				if (local10[local26++] != 0) {
					local12++;
				}
			}
			local26 += local16 - 128;
		}
		if (this.anInterface34_25 != null && this.anInt4591 == local12) {
			this.aBoolean855 = false;
			return;
		}
		this.anInt4591 = local12;
		local28 = 0;
		local26 = this.anInt4586 + this.anInt4587 * local16;
		@Pc(98) int local98;
		@Pc(102) int local102;
		@Pc(116) int local116;
		if (!this.aClass102_Sub1_38.method21204(Class210.aClass210_17, Class236.aClass236_21)) {
			if (this.anIntArray444 == null) {
				this.anIntArray444 = new int[16384];
			}
			@Pc(208) int[] local208 = this.anIntArray444;
			for (local98 = -128; local98 < 0; local98++) {
				for (local102 = -128; local102 < 0; local102++) {
					if (local10[local26] == 0) {
						local116 = 0;
						if (local10[local26 - 1] != 0) {
							local116++;
						}
						if (local10[local26 + 1] != 0) {
							local116++;
						}
						if (local10[local26 - local16] != 0) {
							local116++;
						}
						if (local10[local26 + local16] != 0) {
							local116++;
						}
						local208[local28++] = local116 * 17 << 24;
					} else {
						local208[local28++] = 1140850688;
					}
					local26++;
				}
				local26 += this.aClass406_2.anInt4595 - 128;
			}
			if (this.anInterface34_25 == null) {
				this.anInterface34_25 = this.aClass102_Sub1_38.method21206(128, 128, false, this.anIntArray444);
				this.anInterface34_25.method11656(false, false);
			} else {
				this.anInterface34_25.method11665(0, 0, 128, 128, this.anIntArray444, 0, 128);
			}
			return;
		}
		if (this.aByteArray90 == null) {
			this.aByteArray90 = new byte[16384];
		}
		@Pc(96) byte[] local96 = this.aByteArray90;
		for (local98 = -128; local98 < 0; local98++) {
			for (local102 = -128; local102 < 0; local102++) {
				if (local10[local26] == 0) {
					local116 = 0;
					if (local10[local26 - 1] != 0) {
						local116++;
					}
					if (local10[local26 + 1] != 0) {
						local116++;
					}
					if (local10[local26 - local16] != 0) {
						local116++;
					}
					if (local10[local26 + local16] != 0) {
						local116++;
					}
					local96[local28++] = (byte) (local116 * 17);
				} else {
					local96[local28++] = 68;
				}
				local26++;
			}
			local26 += this.aClass406_2.anInt4595 - 128;
		}
		if (this.anInterface34_25 == null) {
			this.anInterface34_25 = this.aClass102_Sub1_38.method21179(Class210.aClass210_17, 128, 128, false, this.aByteArray90);
			this.anInterface34_25.method11656(false, false);
		} else {
			this.anInterface34_25.method11669(0, 0, 128, 128, this.aByteArray90, Class210.aClass210_17, 0, 128);
		}
	}

	@OriginalMember(owner = "client!lr", name = "o", descriptor = "()V")
	void method28905() {
		if (!this.aBoolean855) {
			return;
		}
		this.aBoolean855 = false;
		@Pc(10) byte[] local10 = this.aClass406_2.aByteArray91;
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = this.aClass406_2.anInt4595;
		@Pc(26) int local26 = this.anInt4586 + this.anInt4587 * this.aClass406_2.anInt4595;
		@Pc(28) int local28;
		for (local28 = -128; local28 < 0; local28++) {
			local12 = (local12 << 8) - local12;
			for (@Pc(38) int local38 = -128; local38 < 0; local38++) {
				if (local10[local26++] != 0) {
					local12++;
				}
			}
			local26 += local16 - 128;
		}
		if (this.anInterface34_25 != null && this.anInt4591 == local12) {
			this.aBoolean855 = false;
			return;
		}
		this.anInt4591 = local12;
		local28 = 0;
		local26 = this.anInt4586 + this.anInt4587 * local16;
		@Pc(98) int local98;
		@Pc(102) int local102;
		@Pc(116) int local116;
		if (!this.aClass102_Sub1_38.method21204(Class210.aClass210_17, Class236.aClass236_21)) {
			if (this.anIntArray444 == null) {
				this.anIntArray444 = new int[16384];
			}
			@Pc(208) int[] local208 = this.anIntArray444;
			for (local98 = -128; local98 < 0; local98++) {
				for (local102 = -128; local102 < 0; local102++) {
					if (local10[local26] == 0) {
						local116 = 0;
						if (local10[local26 - 1] != 0) {
							local116++;
						}
						if (local10[local26 + 1] != 0) {
							local116++;
						}
						if (local10[local26 - local16] != 0) {
							local116++;
						}
						if (local10[local26 + local16] != 0) {
							local116++;
						}
						local208[local28++] = local116 * 17 << 24;
					} else {
						local208[local28++] = 1140850688;
					}
					local26++;
				}
				local26 += this.aClass406_2.anInt4595 - 128;
			}
			if (this.anInterface34_25 == null) {
				this.anInterface34_25 = this.aClass102_Sub1_38.method21206(128, 128, false, this.anIntArray444);
				this.anInterface34_25.method11656(false, false);
			} else {
				this.anInterface34_25.method11665(0, 0, 128, 128, this.anIntArray444, 0, 128);
			}
			return;
		}
		if (this.aByteArray90 == null) {
			this.aByteArray90 = new byte[16384];
		}
		@Pc(96) byte[] local96 = this.aByteArray90;
		for (local98 = -128; local98 < 0; local98++) {
			for (local102 = -128; local102 < 0; local102++) {
				if (local10[local26] == 0) {
					local116 = 0;
					if (local10[local26 - 1] != 0) {
						local116++;
					}
					if (local10[local26 + 1] != 0) {
						local116++;
					}
					if (local10[local26 - local16] != 0) {
						local116++;
					}
					if (local10[local26 + local16] != 0) {
						local116++;
					}
					local96[local28++] = (byte) (local116 * 17);
				} else {
					local96[local28++] = 68;
				}
				local26++;
			}
			local26 += this.aClass406_2.anInt4595 - 128;
		}
		if (this.anInterface34_25 == null) {
			this.anInterface34_25 = this.aClass102_Sub1_38.method21179(Class210.aClass210_17, 128, 128, false, this.aByteArray90);
			this.anInterface34_25.method11656(false, false);
		} else {
			this.anInterface34_25.method11669(0, 0, 128, 128, this.aByteArray90, Class210.aClass210_17, 0, 128);
		}
	}

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "()V")
	void method28906() {
		if (!this.aBoolean855) {
			return;
		}
		this.aBoolean855 = false;
		@Pc(10) byte[] local10 = this.aClass406_2.aByteArray91;
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = this.aClass406_2.anInt4595;
		@Pc(26) int local26 = this.anInt4586 + this.anInt4587 * this.aClass406_2.anInt4595;
		@Pc(28) int local28;
		for (local28 = -128; local28 < 0; local28++) {
			local12 = (local12 << 8) - local12;
			for (@Pc(38) int local38 = -128; local38 < 0; local38++) {
				if (local10[local26++] != 0) {
					local12++;
				}
			}
			local26 += local16 - 128;
		}
		if (this.anInterface34_25 != null && this.anInt4591 == local12) {
			this.aBoolean855 = false;
			return;
		}
		this.anInt4591 = local12;
		local28 = 0;
		local26 = this.anInt4586 + this.anInt4587 * local16;
		@Pc(98) int local98;
		@Pc(102) int local102;
		@Pc(116) int local116;
		if (!this.aClass102_Sub1_38.method21204(Class210.aClass210_17, Class236.aClass236_21)) {
			if (this.anIntArray444 == null) {
				this.anIntArray444 = new int[16384];
			}
			@Pc(208) int[] local208 = this.anIntArray444;
			for (local98 = -128; local98 < 0; local98++) {
				for (local102 = -128; local102 < 0; local102++) {
					if (local10[local26] == 0) {
						local116 = 0;
						if (local10[local26 - 1] != 0) {
							local116++;
						}
						if (local10[local26 + 1] != 0) {
							local116++;
						}
						if (local10[local26 - local16] != 0) {
							local116++;
						}
						if (local10[local26 + local16] != 0) {
							local116++;
						}
						local208[local28++] = local116 * 17 << 24;
					} else {
						local208[local28++] = 1140850688;
					}
					local26++;
				}
				local26 += this.aClass406_2.anInt4595 - 128;
			}
			if (this.anInterface34_25 == null) {
				this.anInterface34_25 = this.aClass102_Sub1_38.method21206(128, 128, false, this.anIntArray444);
				this.anInterface34_25.method11656(false, false);
			} else {
				this.anInterface34_25.method11665(0, 0, 128, 128, this.anIntArray444, 0, 128);
			}
			return;
		}
		if (this.aByteArray90 == null) {
			this.aByteArray90 = new byte[16384];
		}
		@Pc(96) byte[] local96 = this.aByteArray90;
		for (local98 = -128; local98 < 0; local98++) {
			for (local102 = -128; local102 < 0; local102++) {
				if (local10[local26] == 0) {
					local116 = 0;
					if (local10[local26 - 1] != 0) {
						local116++;
					}
					if (local10[local26 + 1] != 0) {
						local116++;
					}
					if (local10[local26 - local16] != 0) {
						local116++;
					}
					if (local10[local26 + local16] != 0) {
						local116++;
					}
					local96[local28++] = (byte) (local116 * 17);
				} else {
					local96[local28++] = 68;
				}
				local26++;
			}
			local26 += this.aClass406_2.anInt4595 - 128;
		}
		if (this.anInterface34_25 == null) {
			this.anInterface34_25 = this.aClass102_Sub1_38.method21179(Class210.aClass210_17, 128, 128, false, this.aByteArray90);
			this.anInterface34_25.method11656(false, false);
		} else {
			this.anInterface34_25.method11669(0, 0, 128, 128, this.aByteArray90, Class210.aClass210_17, 0, 128);
		}
	}
}
