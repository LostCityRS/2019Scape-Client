package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asp")
public final class Class80_Sub38_Sub1 extends Class80_Sub38 {

	@OriginalMember(owner = "client!asp", name = "k", descriptor = "I")
	static final int anInt3127 = 1638;

	@OriginalMember(owner = "client!asp", name = "j", descriptor = "I")
	static final int anInt3128 = 0;

	@OriginalMember(owner = "client!asp", name = "s", descriptor = "I")
	static final int anInt3129 = 4;

	@OriginalMember(owner = "client!asp", name = "a", descriptor = "I")
	static final int anInt3130 = 4;

	@OriginalMember(owner = "client!asp", name = "x", descriptor = "Z")
	static final boolean aBoolean609 = true;

	@OriginalMember(owner = "client!asp", name = "n", descriptor = "I")
	static final int anInt3136 = 8;

	@OriginalMember(owner = "client!asp", name = "w", descriptor = "[S")
	short[] aShortArray60;

	@OriginalMember(owner = "client!asp", name = "r", descriptor = "[S")
	short[] aShortArray61;

	@OriginalMember(owner = "client!asp", name = "q", descriptor = "[B")
	byte[] aByteArray60 = new byte[512];

	@OriginalMember(owner = "client!asp", name = "h", descriptor = "I")
	int anInt3131 = 0;

	@OriginalMember(owner = "client!asp", name = "d", descriptor = "I")
	int anInt3132 = -2037742092;

	@OriginalMember(owner = "client!asp", name = "z", descriptor = "I")
	int anInt3135 = -1805111572;

	@OriginalMember(owner = "client!asp", name = "p", descriptor = "I")
	int anInt3133 = -2000595900;

	@OriginalMember(owner = "client!asp", name = "v", descriptor = "I")
	int anInt3134 = -753889490;

	@OriginalMember(owner = "client!asp", name = "y", descriptor = "Z")
	boolean aBoolean610 = true;

	@OriginalMember(owner = "client!asp", name = "p", descriptor = "(IIIIIIFZ)[[I")
	public static int[][] method22946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int[][] local3 = new int[arg1][arg0];
		@Pc(7) Class80_Sub38_Sub1 local7 = new Class80_Sub38_Sub1();
		local7.aBoolean610 = arg7;
		local7.anInt3132 = arg3 * -1583177347;
		local7.anInt3135 = arg4 * 1696205755;
		local7.anInt3133 = arg5 * -500148975;
		local7.anInt3134 = (int) (arg6 * 4096.0F) * 1727490573;
		local7.method22953(679948657);
		Class53.method1081(arg0, arg1, -1169288134);
		for (@Pc(42) int local42 = 0; local42 < arg1; local42++) {
			local7.method22948(local42, local3[local42], (byte) 39);
		}
		return local3;
	}

	@OriginalMember(owner = "client!asp", name = "z", descriptor = "(IIIIIFZ)[I")
	public static int[] method22951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) int[] local2 = new int[arg0];
		@Pc(6) Class80_Sub38_Sub1 local6 = new Class80_Sub38_Sub1();
		local6.anInt3131 = arg1 * -846140413;
		local6.aBoolean610 = arg6;
		local6.anInt3132 = arg2 * -1583177347;
		local6.anInt3135 = arg3 * 1696205755;
		local6.anInt3133 = arg4 * -500148975;
		local6.anInt3134 = (int) (arg5 * 4096.0F) * 1727490573;
		local6.method22953(-59830913);
		Class53.method1081(arg0, 1, -608524951);
		local6.method22948(0, local2, (byte) -74);
		return local2;
	}

	@OriginalMember(owner = "client!asp", name = "v", descriptor = "(IIIIIIFZ)[[I")
	public static int[][] method22958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int[][] local3 = new int[arg1][arg0];
		@Pc(7) Class80_Sub38_Sub1 local7 = new Class80_Sub38_Sub1();
		local7.aBoolean610 = arg7;
		local7.anInt3132 = arg3 * -1583177347;
		local7.anInt3135 = arg4 * 1696205755;
		local7.anInt3133 = arg5 * -500148975;
		local7.anInt3134 = (int) (arg6 * 4096.0F) * 1727490573;
		local7.method22953(1866223475);
		Class53.method1081(arg0, arg1, -566075644);
		for (@Pc(42) int local42 = 0; local42 < arg1; local42++) {
			local7.method22948(local42, local3[local42], (byte) -65);
		}
		return local3;
	}

	@OriginalMember(owner = "client!asp", name = "<init>", descriptor = "()V")
	Class80_Sub38_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!asp", name = "u", descriptor = "(I)V")
	void method22945(@OriginalArg(0) int arg0) {
		@Pc(20) int local20;
		if (this.anInt3134 * 1306784965 > 0) {
			this.aShortArray60 = new short[this.anInt3133 * -896189455];
			this.aShortArray61 = new short[this.anInt3133 * -896189455];
			for (local20 = 0; local20 < this.anInt3133 * -896189455; local20++) {
				this.aShortArray60[local20] = (short) (Math.pow((double) ((float) (this.anInt3134 * 1306784965) / 4096.0F), (double) local20) * 4096.0D);
				this.aShortArray61[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		} else if (this.aShortArray60 != null && this.aShortArray60.length == this.anInt3133 * -896189455) {
			this.aShortArray61 = new short[this.anInt3133 * -896189455];
			for (local20 = 0; local20 < this.anInt3133 * -896189455; local20++) {
				this.aShortArray61[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		}
	}

	@OriginalMember(owner = "client!asp", name = "f", descriptor = "(IIIIIII)I")
	int method22947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0 >> 12;
		@Pc(7) int local7 = local3 + 1;
		if (local7 >= arg5) {
			local7 = 0;
		}
		@Pc(16) int local16 = arg0 & 0xFFF;
		local3 &= 0xFF;
		local7 &= 0xFF;
		@Pc(28) int local28 = local16 - 4096;
		@Pc(32) int local32 = arg1 - 4096;
		@Pc(36) int local36 = Class137.anIntArray260[local16];
		@Pc(45) int local45 = this.aByteArray60[arg2 + local3] & 0x3;
		@Pc(59) int local59;
		if (local45 <= 1) {
			local59 = local45 == 0 ? local16 + arg1 : arg1 - local16;
		} else {
			local59 = local45 == 2 ? local16 - arg1 : -local16 - arg1;
		}
		local45 = this.aByteArray60[arg2 + local7] & 0x3;
		@Pc(94) int local94;
		if (local45 <= 1) {
			local94 = local45 == 0 ? arg1 + local28 : arg1 - local28;
		} else {
			local94 = local45 == 2 ? local28 - arg1 : -local28 - arg1;
		}
		@Pc(117) int local117 = local59 + ((local94 - local59) * local36 >> 12);
		local45 = this.aByteArray60[local3 + arg3] & 0x3;
		if (local45 <= 1) {
			local59 = local45 == 0 ? local32 + local16 : local32 - local16;
		} else {
			local59 = local45 == 2 ? local16 - local32 : -local16 - local32;
		}
		local45 = this.aByteArray60[local7 + arg3] & 0x3;
		if (local45 <= 1) {
			local94 = local45 == 0 ? local28 + local32 : local32 - local28;
		} else {
			local94 = local45 == 2 ? local28 - local32 : -local28 - local32;
		}
		@Pc(198) int local198 = local59 + ((local94 - local59) * local36 >> 12);
		return local117 + ((local198 - local117) * arg4 >> 12);
	}

	@OriginalMember(owner = "client!asp", name = "t", descriptor = "(I[IB)V")
	void method22948(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) byte arg2) {
		@Pc(8) int local8 = Class53.anIntArray23[arg0] * this.anInt3135 * -1624047245;
		@Pc(108) int local108;
		@Pc(122) int local122;
		@Pc(26) int local26;
		@Pc(19) short local19;
		@Pc(94) int local94;
		@Pc(50) int local50;
		@Pc(44) int local44;
		@Pc(35) int local35;
		@Pc(71) int local71;
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(80) int local80;
		@Pc(89) int local89;
		if (this.anInt3133 * -896189455 == 1) {
			local19 = this.aShortArray60[0];
			local26 = this.aShortArray61[0] << 12;
			local35 = this.anInt3135 * -1624047245 * local26 >> 12;
			local44 = this.anInt3132 * 610246613 * local26 >> 12;
			local50 = local26 * local8 >> 12;
			local54 = local50 >> 12;
			local58 = local54 + 1;
			if (local58 >= local35) {
				local58 = 0;
			}
			local50 &= 0xFFF;
			local71 = Class137.anIntArray260[local50];
			local80 = this.aByteArray60[local54 & 0xFF] & 0xFF;
			local89 = this.aByteArray60[local58 & 0xFF] & 0xFF;
			if (this.aBoolean610) {
				for (local94 = 0; local94 < Class53.anInt199 * -249890311; local94++) {
					local108 = this.anInt3132 * 610246613 * Class53.anIntArray24[local94];
					local122 = this.method22947(local26 * local108 >> 12, local50, local80, local89, local71, local44, 805204250);
					@Pc(128) int local128 = local19 * local122 >> 12;
					arg1[local94] = (local128 >> 1) + 2048;
				}
			} else {
				for (local94 = 0; local94 < Class53.anInt199 * -249890311; local94++) {
					local108 = Class53.anIntArray24[local94] * 610246613 * this.anInt3132;
					local122 = this.method22947(local108 * local26 >> 12, local50, local80, local89, local71, local44, 1241487525);
					arg1[local94] = local19 * local122 >> 12;
				}
			}
			return;
		}
		local19 = this.aShortArray60[0];
		if (local19 > 8 || local19 < -8) {
			local26 = this.aShortArray61[0] << 12;
			local35 = local26 * this.anInt3135 * -1624047245 >> 12;
			local44 = local26 * 610246613 * this.anInt3132 >> 12;
			local50 = local8 * local26 >> 12;
			local54 = local50 >> 12;
			local58 = local54 + 1;
			if (local58 >= local35) {
				local58 = 0;
			}
			local50 &= 0xFFF;
			local71 = Class137.anIntArray260[local50];
			local80 = this.aByteArray60[local54 & 0xFF] & 0xFF;
			local89 = this.aByteArray60[local58 & 0xFF] & 0xFF;
			for (local94 = 0; local94 < Class53.anInt199 * -249890311; local94++) {
				local108 = Class53.anIntArray24[local94] * this.anInt3132 * 610246613;
				local122 = this.method22947(local108 * local26 >> 12, local50, local80, local89, local71, local44, 176586323);
				arg1[local94] = local122 * local19 >> 12;
			}
		}
		for (@Pc(301) int local301 = 1; local301 < this.anInt3133 * -896189455; local301++) {
			local19 = this.aShortArray60[local301];
			if (local19 > 8 || local19 < -8) {
				local26 = this.aShortArray61[local301] << 12;
				local35 = this.anInt3135 * -1624047245 * local26 >> 12;
				local44 = this.anInt3132 * 610246613 * local26 >> 12;
				local50 = local8 * local26 >> 12;
				local54 = local50 >> 12;
				local58 = local54 + 1;
				if (local58 >= local35) {
					local58 = 0;
				}
				local50 &= 0xFFF;
				local71 = Class137.anIntArray260[local50];
				local80 = this.aByteArray60[local54 & 0xFF] & 0xFF;
				local89 = this.aByteArray60[local58 & 0xFF] & 0xFF;
				if (this.aBoolean610 && local301 == this.anInt3133 * -896189455 - 1) {
					for (local94 = 0; local94 < Class53.anInt199 * -249890311; local94++) {
						local108 = this.anInt3132 * 610246613 * Class53.anIntArray24[local94];
						local122 = this.method22947(local108 * local26 >> 12, local50, local80, local89, local71, local44, -471902371);
						local122 = (local19 * local122 >> 12) + arg1[local94];
						arg1[local94] = (local122 >> 1) + 2048;
					}
				} else {
					for (local94 = 0; local94 < Class53.anInt199 * -249890311; local94++) {
						local108 = Class53.anIntArray24[local94] * this.anInt3132 * 610246613;
						local122 = this.method22947(local108 * local26 >> 12, local50, local80, local89, local71, local44, 890081604);
						arg1[local94] += local19 * local122 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!asp", name = "i", descriptor = "(I[I)V")
	void method22949(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(8) int local8 = Class53.anIntArray23[arg0] * this.anInt3135 * -1624047245;
		@Pc(108) int local108;
		@Pc(122) int local122;
		@Pc(26) int local26;
		@Pc(19) short local19;
		@Pc(94) int local94;
		@Pc(50) int local50;
		@Pc(44) int local44;
		@Pc(35) int local35;
		@Pc(71) int local71;
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(80) int local80;
		@Pc(89) int local89;
		if (this.anInt3133 * -896189455 == 1) {
			local19 = this.aShortArray60[0];
			local26 = this.aShortArray61[0] << 12;
			local35 = this.anInt3135 * -1624047245 * local26 >> 12;
			local44 = this.anInt3132 * 610246613 * local26 >> 12;
			local50 = local26 * local8 >> 12;
			local54 = local50 >> 12;
			local58 = local54 + 1;
			if (local58 >= local35) {
				local58 = 0;
			}
			local50 &= 0xFFF;
			local71 = Class137.anIntArray260[local50];
			local80 = this.aByteArray60[local54 & 0xFF] & 0xFF;
			local89 = this.aByteArray60[local58 & 0xFF] & 0xFF;
			if (this.aBoolean610) {
				for (local94 = 0; local94 < Class53.anInt199 * -249890311; local94++) {
					local108 = this.anInt3132 * 610246613 * Class53.anIntArray24[local94];
					local122 = this.method22947(local26 * local108 >> 12, local50, local80, local89, local71, local44, -655435040);
					@Pc(128) int local128 = local19 * local122 >> 12;
					arg1[local94] = (local128 >> 1) + 2048;
				}
			} else {
				for (local94 = 0; local94 < Class53.anInt199 * -249890311; local94++) {
					local108 = Class53.anIntArray24[local94] * 610246613 * this.anInt3132;
					local122 = this.method22947(local108 * local26 >> 12, local50, local80, local89, local71, local44, 787472857);
					arg1[local94] = local19 * local122 >> 12;
				}
			}
			return;
		}
		local19 = this.aShortArray60[0];
		if (local19 > 8 || local19 < -8) {
			local26 = this.aShortArray61[0] << 12;
			local35 = local26 * this.anInt3135 * -1624047245 >> 12;
			local44 = local26 * 610246613 * this.anInt3132 >> 12;
			local50 = local8 * local26 >> 12;
			local54 = local50 >> 12;
			local58 = local54 + 1;
			if (local58 >= local35) {
				local58 = 0;
			}
			local50 &= 0xFFF;
			local71 = Class137.anIntArray260[local50];
			local80 = this.aByteArray60[local54 & 0xFF] & 0xFF;
			local89 = this.aByteArray60[local58 & 0xFF] & 0xFF;
			for (local94 = 0; local94 < Class53.anInt199 * -249890311; local94++) {
				local108 = Class53.anIntArray24[local94] * this.anInt3132 * 610246613;
				local122 = this.method22947(local108 * local26 >> 12, local50, local80, local89, local71, local44, 275565007);
				arg1[local94] = local122 * local19 >> 12;
			}
		}
		for (@Pc(301) int local301 = 1; local301 < this.anInt3133 * -896189455; local301++) {
			local19 = this.aShortArray60[local301];
			if (local19 > 8 || local19 < -8) {
				local26 = this.aShortArray61[local301] << 12;
				local35 = this.anInt3135 * -1624047245 * local26 >> 12;
				local44 = this.anInt3132 * 610246613 * local26 >> 12;
				local50 = local8 * local26 >> 12;
				local54 = local50 >> 12;
				local58 = local54 + 1;
				if (local58 >= local35) {
					local58 = 0;
				}
				local50 &= 0xFFF;
				local71 = Class137.anIntArray260[local50];
				local80 = this.aByteArray60[local54 & 0xFF] & 0xFF;
				local89 = this.aByteArray60[local58 & 0xFF] & 0xFF;
				if (this.aBoolean610 && local301 == this.anInt3133 * -896189455 - 1) {
					for (local94 = 0; local94 < Class53.anInt199 * -249890311; local94++) {
						local108 = this.anInt3132 * 610246613 * Class53.anIntArray24[local94];
						local122 = this.method22947(local108 * local26 >> 12, local50, local80, local89, local71, local44, 906387475);
						local122 = (local19 * local122 >> 12) + arg1[local94];
						arg1[local94] = (local122 >> 1) + 2048;
					}
				} else {
					for (local94 = 0; local94 < Class53.anInt199 * -249890311; local94++) {
						local108 = Class53.anIntArray24[local94] * this.anInt3132 * 610246613;
						local122 = this.method22947(local108 * local26 >> 12, local50, local80, local89, local71, local44, -423207513);
						arg1[local94] += local19 * local122 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!asp", name = "m", descriptor = "(I[I)V")
	void method22950(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(8) int local8 = Class53.anIntArray23[arg0] * this.anInt3135 * -1624047245;
		@Pc(108) int local108;
		@Pc(122) int local122;
		@Pc(26) int local26;
		@Pc(19) short local19;
		@Pc(94) int local94;
		@Pc(50) int local50;
		@Pc(44) int local44;
		@Pc(35) int local35;
		@Pc(71) int local71;
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(80) int local80;
		@Pc(89) int local89;
		if (this.anInt3133 * -896189455 == 1) {
			local19 = this.aShortArray60[0];
			local26 = this.aShortArray61[0] << 12;
			local35 = this.anInt3135 * -1624047245 * local26 >> 12;
			local44 = this.anInt3132 * 610246613 * local26 >> 12;
			local50 = local26 * local8 >> 12;
			local54 = local50 >> 12;
			local58 = local54 + 1;
			if (local58 >= local35) {
				local58 = 0;
			}
			local50 &= 0xFFF;
			local71 = Class137.anIntArray260[local50];
			local80 = this.aByteArray60[local54 & 0xFF] & 0xFF;
			local89 = this.aByteArray60[local58 & 0xFF] & 0xFF;
			if (this.aBoolean610) {
				for (local94 = 0; local94 < Class53.anInt199 * -249890311; local94++) {
					local108 = this.anInt3132 * 610246613 * Class53.anIntArray24[local94];
					local122 = this.method22947(local26 * local108 >> 12, local50, local80, local89, local71, local44, 803393570);
					@Pc(128) int local128 = local19 * local122 >> 12;
					arg1[local94] = (local128 >> 1) + 2048;
				}
			} else {
				for (local94 = 0; local94 < Class53.anInt199 * -249890311; local94++) {
					local108 = Class53.anIntArray24[local94] * 610246613 * this.anInt3132;
					local122 = this.method22947(local108 * local26 >> 12, local50, local80, local89, local71, local44, -179842426);
					arg1[local94] = local19 * local122 >> 12;
				}
			}
			return;
		}
		local19 = this.aShortArray60[0];
		if (local19 > 8 || local19 < -8) {
			local26 = this.aShortArray61[0] << 12;
			local35 = local26 * this.anInt3135 * -1624047245 >> 12;
			local44 = local26 * 610246613 * this.anInt3132 >> 12;
			local50 = local8 * local26 >> 12;
			local54 = local50 >> 12;
			local58 = local54 + 1;
			if (local58 >= local35) {
				local58 = 0;
			}
			local50 &= 0xFFF;
			local71 = Class137.anIntArray260[local50];
			local80 = this.aByteArray60[local54 & 0xFF] & 0xFF;
			local89 = this.aByteArray60[local58 & 0xFF] & 0xFF;
			for (local94 = 0; local94 < Class53.anInt199 * -249890311; local94++) {
				local108 = Class53.anIntArray24[local94] * this.anInt3132 * 610246613;
				local122 = this.method22947(local108 * local26 >> 12, local50, local80, local89, local71, local44, 474755902);
				arg1[local94] = local122 * local19 >> 12;
			}
		}
		for (@Pc(301) int local301 = 1; local301 < this.anInt3133 * -896189455; local301++) {
			local19 = this.aShortArray60[local301];
			if (local19 > 8 || local19 < -8) {
				local26 = this.aShortArray61[local301] << 12;
				local35 = this.anInt3135 * -1624047245 * local26 >> 12;
				local44 = this.anInt3132 * 610246613 * local26 >> 12;
				local50 = local8 * local26 >> 12;
				local54 = local50 >> 12;
				local58 = local54 + 1;
				if (local58 >= local35) {
					local58 = 0;
				}
				local50 &= 0xFFF;
				local71 = Class137.anIntArray260[local50];
				local80 = this.aByteArray60[local54 & 0xFF] & 0xFF;
				local89 = this.aByteArray60[local58 & 0xFF] & 0xFF;
				if (this.aBoolean610 && local301 == this.anInt3133 * -896189455 - 1) {
					for (local94 = 0; local94 < Class53.anInt199 * -249890311; local94++) {
						local108 = this.anInt3132 * 610246613 * Class53.anIntArray24[local94];
						local122 = this.method22947(local108 * local26 >> 12, local50, local80, local89, local71, local44, 1169345314);
						local122 = (local19 * local122 >> 12) + arg1[local94];
						arg1[local94] = (local122 >> 1) + 2048;
					}
				} else {
					for (local94 = 0; local94 < Class53.anInt199 * -249890311; local94++) {
						local108 = Class53.anIntArray24[local94] * this.anInt3132 * 610246613;
						local122 = this.method22947(local108 * local26 >> 12, local50, local80, local89, local71, local44, 807021526);
						arg1[local94] += local19 * local122 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!asp", name = "j", descriptor = "(IIIIII)I")
	int method22952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg0 >> 12;
		@Pc(7) int local7 = local3 + 1;
		if (local7 >= arg5) {
			local7 = 0;
		}
		@Pc(16) int local16 = arg0 & 0xFFF;
		local3 &= 0xFF;
		local7 &= 0xFF;
		@Pc(28) int local28 = local16 - 4096;
		@Pc(32) int local32 = arg1 - 4096;
		@Pc(36) int local36 = Class137.anIntArray260[local16];
		@Pc(45) int local45 = this.aByteArray60[arg2 + local3] & 0x3;
		@Pc(59) int local59;
		if (local45 <= 1) {
			local59 = local45 == 0 ? local16 + arg1 : arg1 - local16;
		} else {
			local59 = local45 == 2 ? local16 - arg1 : -local16 - arg1;
		}
		local45 = this.aByteArray60[arg2 + local7] & 0x3;
		@Pc(94) int local94;
		if (local45 <= 1) {
			local94 = local45 == 0 ? arg1 + local28 : arg1 - local28;
		} else {
			local94 = local45 == 2 ? local28 - arg1 : -local28 - arg1;
		}
		@Pc(117) int local117 = local59 + ((local94 - local59) * local36 >> 12);
		local45 = this.aByteArray60[local3 + arg3] & 0x3;
		if (local45 <= 1) {
			local59 = local45 == 0 ? local32 + local16 : local32 - local16;
		} else {
			local59 = local45 == 2 ? local16 - local32 : -local16 - local32;
		}
		local45 = this.aByteArray60[local7 + arg3] & 0x3;
		if (local45 <= 1) {
			local94 = local45 == 0 ? local28 + local32 : local32 - local28;
		} else {
			local94 = local45 == 2 ? local28 - local32 : -local28 - local32;
		}
		@Pc(198) int local198 = local59 + ((local94 - local59) * local36 >> 12);
		return local117 + ((local198 - local117) * arg4 >> 12);
	}

	@OriginalMember(owner = "client!asp", name = "e", descriptor = "(I)V")
	void method22953(@OriginalArg(0) int arg0) {
		this.aByteArray60 = Class53.method1076(this.anInt3131 * -1003610453, 555393750);
		this.method22945(-649033537);
		for (@Pc(17) int local17 = this.anInt3133 * -896189455 - 1; local17 >= 1; local17--) {
			@Pc(25) short local25 = this.aShortArray60[local17];
			if (local25 > 8 || local25 < -8) {
				break;
			}
			this.anInt3133 -= -500148975;
		}
	}

	@OriginalMember(owner = "client!asp", name = "s", descriptor = "()V")
	void method22954() {
		@Pc(20) int local20;
		if (this.anInt3134 * 1306784965 > 0) {
			this.aShortArray60 = new short[this.anInt3133 * -896189455];
			this.aShortArray61 = new short[this.anInt3133 * -896189455];
			for (local20 = 0; local20 < this.anInt3133 * -896189455; local20++) {
				this.aShortArray60[local20] = (short) (Math.pow((double) ((float) (this.anInt3134 * 1306784965) / 4096.0F), (double) local20) * 4096.0D);
				this.aShortArray61[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		} else if (this.aShortArray60 != null && this.aShortArray60.length == this.anInt3133 * -896189455) {
			this.aShortArray61 = new short[this.anInt3133 * -896189455];
			for (local20 = 0; local20 < this.anInt3133 * -896189455; local20++) {
				this.aShortArray61[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		}
	}

	@OriginalMember(owner = "client!asp", name = "x", descriptor = "()V")
	void method22955() {
		@Pc(20) int local20;
		if (this.anInt3134 * 1306784965 > 0) {
			this.aShortArray60 = new short[this.anInt3133 * -896189455];
			this.aShortArray61 = new short[this.anInt3133 * -896189455];
			for (local20 = 0; local20 < this.anInt3133 * -896189455; local20++) {
				this.aShortArray60[local20] = (short) (Math.pow((double) ((float) (this.anInt3134 * 1306784965) / 4096.0F), (double) local20) * 4096.0D);
				this.aShortArray61[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		} else if (this.aShortArray60 != null && this.aShortArray60.length == this.anInt3133 * -896189455) {
			this.aShortArray61 = new short[this.anInt3133 * -896189455];
			for (local20 = 0; local20 < this.anInt3133 * -896189455; local20++) {
				this.aShortArray61[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		}
	}

	@OriginalMember(owner = "client!asp", name = "a", descriptor = "()V")
	void method22956() {
		this.aByteArray60 = Class53.method1076(this.anInt3131 * -1003610453, 555393750);
		this.method22945(-479352382);
		for (@Pc(17) int local17 = this.anInt3133 * -896189455 - 1; local17 >= 1; local17--) {
			@Pc(25) short local25 = this.aShortArray60[local17];
			if (local25 > 8 || local25 < -8) {
				break;
			}
			this.anInt3133 -= -500148975;
		}
	}

	@OriginalMember(owner = "client!asp", name = "o", descriptor = "(IIIIII)I")
	int method22957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg0 >> 12;
		@Pc(7) int local7 = local3 + 1;
		if (local7 >= arg5) {
			local7 = 0;
		}
		@Pc(16) int local16 = arg0 & 0xFFF;
		local3 &= 0xFF;
		local7 &= 0xFF;
		@Pc(28) int local28 = local16 - 4096;
		@Pc(32) int local32 = arg1 - 4096;
		@Pc(36) int local36 = Class137.anIntArray260[local16];
		@Pc(45) int local45 = this.aByteArray60[arg2 + local3] & 0x3;
		@Pc(59) int local59;
		if (local45 <= 1) {
			local59 = local45 == 0 ? local16 + arg1 : arg1 - local16;
		} else {
			local59 = local45 == 2 ? local16 - arg1 : -local16 - arg1;
		}
		local45 = this.aByteArray60[arg2 + local7] & 0x3;
		@Pc(94) int local94;
		if (local45 <= 1) {
			local94 = local45 == 0 ? arg1 + local28 : arg1 - local28;
		} else {
			local94 = local45 == 2 ? local28 - arg1 : -local28 - arg1;
		}
		@Pc(117) int local117 = local59 + ((local94 - local59) * local36 >> 12);
		local45 = this.aByteArray60[local3 + arg3] & 0x3;
		if (local45 <= 1) {
			local59 = local45 == 0 ? local32 + local16 : local32 - local16;
		} else {
			local59 = local45 == 2 ? local16 - local32 : -local16 - local32;
		}
		local45 = this.aByteArray60[local7 + arg3] & 0x3;
		if (local45 <= 1) {
			local94 = local45 == 0 ? local28 + local32 : local32 - local28;
		} else {
			local94 = local45 == 2 ? local28 - local32 : -local28 - local32;
		}
		@Pc(198) int local198 = local59 + ((local94 - local59) * local36 >> 12);
		return local117 + ((local198 - local117) * arg4 >> 12);
	}
}
