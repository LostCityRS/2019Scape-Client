package jagex3;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ly")
public final class Class410 {

	@OriginalMember(owner = "client!ly", name = "n", descriptor = "I")
	static final int anInt4866 = 128;

	@OriginalMember(owner = "client!ly", name = "e", descriptor = "I")
	static final int anInt4867 = 7;

	@OriginalMember(owner = "client!ly", name = "o", descriptor = "[B")
	byte[] aByteArray92;

	@OriginalMember(owner = "client!ly", name = "v", descriptor = "[I")
	int[] anIntArray442;

	@OriginalMember(owner = "client!ly", name = "l", descriptor = "Z")
	boolean aBoolean757 = true;

	@OriginalMember(owner = "client!ly", name = "u", descriptor = "I")
	int anInt4870 = -1;

	@OriginalMember(owner = "client!ly", name = "m", descriptor = "Lclient!afc;")
	final Class104_Sub2 aClass104_Sub2_39;

	@OriginalMember(owner = "client!ly", name = "k", descriptor = "Lclient!lg;")
	final Class397 aClass397_2;

	@OriginalMember(owner = "client!ly", name = "f", descriptor = "I")
	final int anInt4868;

	@OriginalMember(owner = "client!ly", name = "w", descriptor = "I")
	final int anInt4869;

	@OriginalMember(owner = "client!ly", name = "r", descriptor = "I")
	int anInt4872;

	@OriginalMember(owner = "client!ly", name = "c", descriptor = "I")
	int anInt4873;

	@OriginalMember(owner = "client!ly", name = "p", descriptor = "Lclient!ml;")
	Interface40 anInterface40_8;

	@OriginalMember(owner = "client!ly", name = "z", descriptor = "I")
	final int anInt4871;

	@OriginalMember(owner = "client!ly", name = "d", descriptor = "Lclient!lz;")
	Interface38 anInterface38_25;

	@OriginalMember(owner = "client!ly", name = "<init>", descriptor = "(Lclient!afc;Lclient!lg;Lclient!aem;IIIII)V")
	Class410(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class397 arg1, @OriginalArg(2) Class99_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass104_Sub2_39 = arg0;
		this.aClass397_2 = arg1;
		this.anInt4868 = arg6;
		this.anInt4869 = arg7;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(49) int local49;
		@Pc(51) int local51;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local49 = (local33 + local35) * arg2.anInt414 * -1667858293 + local29;
			for (local51 = 0; local51 < local23; local51++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray3[local49++];
				if (local60 != null) {
					local25 += local60.length;
				}
			}
		}
		if (local25 > 0) {
			this.anInt4872 = Integer.MIN_VALUE;
			this.anInt4873 = Integer.MAX_VALUE;
			this.anInterface40_8 = this.aClass104_Sub2_39.method21007(false);
			this.anInterface40_8.method29532(local25);
			@Pc(93) ByteBuffer local93 = this.aClass104_Sub2_39.aByteBuffer7;
			local93.clear();
			for (local49 = 0; local49 < local23; local49++) {
				local51 = (local33 + local49) * arg2.anInt414 * -1667858293 + local29;
				for (@Pc(114) int local114 = 0; local114 < local23; local114++) {
					@Pc(123) short[] local123 = arg2.aShortArrayArray3[local51++];
					if (local123 != null) {
						for (@Pc(127) int local127 = 0; local127 < local123.length; local127++) {
							@Pc(137) int local137 = local123[local127] & 0xFFFF;
							if (local137 < this.anInt4873) {
								this.anInt4873 = local137;
							}
							if (local137 > this.anInt4872) {
								this.anInt4872 = local137;
							}
							local93.putShort((short) local137);
						}
					}
				}
			}
			this.anInterface40_8.method29514(0, local93.position(), this.aClass104_Sub2_39.aLong132);
			this.anInt4871 = local25 / 3;
		} else {
			this.anInt4871 = 0;
			this.anInterface38_25 = null;
		}
	}

	@OriginalMember(owner = "client!ly", name = "k", descriptor = "(Lclient!jj;)V")
	void method28771(@OriginalArg(0) Class131 arg0) {
		this.method28772(arg0, this.anInterface40_8, 0, this.anInt4871);
	}

	@OriginalMember(owner = "client!ly", name = "n", descriptor = "(Lclient!jj;Lclient!ml;II)V")
	void method28772(@OriginalArg(0) Class131 arg0, @OriginalArg(1) Interface40 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= 0) {
			return;
		}
		this.method28774();
		this.aClass104_Sub2_39.method21042(arg1);
		arg0.anInterface38_18 = this.anInterface38_25;
		arg0.anInt1140 = this.anInt4873;
		arg0.anInt1141 = this.anInt4872 - this.anInt4873 + 1;
		arg0.anInt1138 = arg2;
		arg0.anInt1137 = arg3;
		arg0.method10102(false);
	}

	@OriginalMember(owner = "client!ly", name = "e", descriptor = "(Lclient!jj;)V")
	void method28773(@OriginalArg(0) Class131 arg0) {
		this.method28772(arg0, this.anInterface40_8, 0, this.anInt4871);
	}

	@OriginalMember(owner = "client!ly", name = "m", descriptor = "()V")
	void method28774() {
		if (!this.aBoolean757) {
			return;
		}
		this.aBoolean757 = false;
		@Pc(10) byte[] local10 = this.aClass397_2.aByteArray91;
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = this.aClass397_2.anInt4830;
		@Pc(26) int local26 = this.anInt4868 + this.anInt4869 * this.aClass397_2.anInt4830;
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
		if (this.anInterface38_25 != null && this.anInt4870 == local12) {
			this.aBoolean757 = false;
			return;
		}
		this.anInt4870 = local12;
		local28 = 0;
		local26 = this.anInt4868 + this.anInt4869 * local16;
		@Pc(98) int local98;
		@Pc(102) int local102;
		@Pc(116) int local116;
		if (!this.aClass104_Sub2_39.method20966(Class206.aClass206_19, Class226.aClass226_22)) {
			if (this.anIntArray442 == null) {
				this.anIntArray442 = new int[16384];
			}
			@Pc(208) int[] local208 = this.anIntArray442;
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
				local26 += this.aClass397_2.anInt4830 - 128;
			}
			if (this.anInterface38_25 == null) {
				this.anInterface38_25 = this.aClass104_Sub2_39.method21145(128, 128, false, this.anIntArray442);
				this.anInterface38_25.method11344(false, false);
			} else {
				this.anInterface38_25.method11345(0, 0, 128, 128, this.anIntArray442, 0, 128);
			}
			return;
		}
		if (this.aByteArray92 == null) {
			this.aByteArray92 = new byte[16384];
		}
		@Pc(96) byte[] local96 = this.aByteArray92;
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
			local26 += this.aClass397_2.anInt4830 - 128;
		}
		if (this.anInterface38_25 == null) {
			this.anInterface38_25 = this.aClass104_Sub2_39.method20968(Class206.aClass206_19, 128, 128, false, this.aByteArray92);
			this.anInterface38_25.method11344(false, false);
		} else {
			this.anInterface38_25.method11356(0, 0, 128, 128, this.aByteArray92, Class206.aClass206_19, 0, 128);
		}
	}

	@OriginalMember(owner = "client!ly", name = "f", descriptor = "(Lclient!jj;)V")
	void method28775(@OriginalArg(0) Class131 arg0) {
		this.method28772(arg0, this.anInterface40_8, 0, this.anInt4871);
	}

	@OriginalMember(owner = "client!ly", name = "w", descriptor = "(Lclient!jj;Lclient!ml;II)V")
	void method28776(@OriginalArg(0) Class131 arg0, @OriginalArg(1) Interface40 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= 0) {
			return;
		}
		this.method28774();
		this.aClass104_Sub2_39.method21042(arg1);
		arg0.anInterface38_18 = this.anInterface38_25;
		arg0.anInt1140 = this.anInt4873;
		arg0.anInt1141 = this.anInt4872 - this.anInt4873 + 1;
		arg0.anInt1138 = arg2;
		arg0.anInt1137 = arg3;
		arg0.method10102(false);
	}
}
