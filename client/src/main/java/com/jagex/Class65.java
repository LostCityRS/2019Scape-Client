package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aco")
public class Class65 implements Interface13 {

	@OriginalMember(owner = "client!aco", name = "uh", descriptor = "Lclient!ahc;")
	public static Class123_Sub1 aClass123_Sub1_2;

	@OriginalMember(owner = "client!aco", name = "f", descriptor = "[I")
	int[] anIntArray17;

	@OriginalMember(owner = "client!aco", name = "n", descriptor = "I")
	public int anInt232;

	@OriginalMember(owner = "client!aco", name = "m", descriptor = "I")
	public int anInt233;

	@OriginalMember(owner = "client!aco", name = "k", descriptor = "Z")
	public boolean aBoolean30 = false;

	@OriginalMember(owner = "client!aco", name = "e", descriptor = "Lclient!ace;")
	Class56 aClass56_1;

	@OriginalMember(owner = "client!aco", name = "<init>", descriptor = "(ILclient!ace;)V", line = 17)
	Class65(@OriginalArg(0) int arg0, @OriginalArg(1) Class56 arg1) {
		this.aClass56_1 = arg1;
	}

	@OriginalMember(owner = "client!aco", name = "m", descriptor = "(Lclient!alw;)V", line = 23)
	@Override
	public void method36655(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1175(arg0, local3, (byte) 14);
		}
	}

	@OriginalMember(owner = "client!aco", name = "k", descriptor = "(Lclient!alw;)V", line = 23)
	@Override
	public void method36656(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1175(arg0, local3, (byte) 14);
		}
	}

	@OriginalMember(owner = "client!aco", name = "f", descriptor = "(Lclient!alw;)V", line = 23)
	@Override
	public void method36657(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1175(arg0, local3, (byte) 14);
		}
	}

	@OriginalMember(owner = "client!aco", name = "w", descriptor = "(Lclient!alw;)V", line = 23)
	@Override
	public void method36658(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1175(arg0, local3, (byte) 14);
		}
	}

	@OriginalMember(owner = "client!aco", name = "e", descriptor = "(Lclient!alw;B)V", line = 23)
	@Override
	public void method36654(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1175(arg0, local3, (byte) 14);
		}
	}

	@OriginalMember(owner = "client!aco", name = "r", descriptor = "(Lclient!alw;I)V", line = 30)
	void method1172(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt232 = arg0.method22542(-1570042732) * 626349445;
		} else if (arg1 == 2) {
			this.anInt233 = arg0.method22478((short) -215) * -637469593;
		} else if (arg1 == 3) {
			this.aBoolean30 = true;
		} else if (arg1 == 4) {
			this.anInt232 = -626349445;
		} else if (arg1 == 5) {
		}
	}

	@OriginalMember(owner = "client!aco", name = "v", descriptor = "(Lclient!alw;I)V", line = 30)
	void method1173(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt232 = arg0.method22542(-626459236) * 626349445;
		} else if (arg1 == 2) {
			this.anInt233 = arg0.method22478((short) -11489) * -637469593;
		} else if (arg1 == 3) {
			this.aBoolean30 = true;
		} else if (arg1 == 4) {
			this.anInt232 = -626349445;
		} else if (arg1 == 5) {
		}
	}

	@OriginalMember(owner = "client!aco", name = "o", descriptor = "(Lclient!alw;I)V", line = 30)
	void method1174(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt232 = arg0.method22542(-300264608) * 626349445;
		} else if (arg1 == 2) {
			this.anInt233 = arg0.method22478((short) -1811) * -637469593;
		} else if (arg1 == 3) {
			this.aBoolean30 = true;
		} else if (arg1 == 4) {
			this.anInt232 = -626349445;
		} else if (arg1 == 5) {
		}
	}

	@OriginalMember(owner = "client!aco", name = "u", descriptor = "(Lclient!alw;IB)V", line = 30)
	void method1175(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (arg1 == 1) {
			this.anInt232 = arg0.method22542(-269066044) * 626349445;
		} else if (arg1 == 2) {
			this.anInt233 = arg0.method22478((short) -6815) * -637469593;
		} else if (arg1 == 3) {
			this.aBoolean30 = true;
		} else if (arg1 == 4) {
			this.anInt232 = -626349445;
		} else if (arg1 == 5) {
		}
	}

	@OriginalMember(owner = "client!aco", name = "y", descriptor = "(Lclient!dh;IZ)Lclient!cm;", line = 39)
	public Class100 method1176(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(22) long local22 = (long) (this.anInt232 * -1612489907 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.anInt2888 * 658538839 << 19);
		@Pc(29) Class100 local29 = (Class100) this.aClass56_1.aClass240_63.method25829(local22);
		if (local29 == null) {
			this.method1183(arg0, arg1, arg2, local22);
			return (Class100) this.aClass56_1.aClass240_63.method25829(local22);
		} else {
			return local29;
		}
	}

	@OriginalMember(owner = "client!aco", name = "z", descriptor = "(Lclient!dh;IZI)Lclient!cm;", line = 39)
	public Class100 method1177(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(22) long local22 = (long) (this.anInt232 * -1612489907 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.anInt2888 * 658538839 << 19);
		@Pc(29) Class100 local29 = (Class100) this.aClass56_1.aClass240_63.method25829(local22);
		if (local29 == null) {
			this.method1183(arg0, arg1, arg2, local22);
			return (Class100) this.aClass56_1.aClass240_63.method25829(local22);
		} else {
			return local29;
		}
	}

	@OriginalMember(owner = "client!aco", name = "s", descriptor = "(Lclient!dh;IZ)Lclient!cm;", line = 39)
	public Class100 method1178(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(22) long local22 = (long) (this.anInt232 * -1612489907 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.anInt2888 * 658538839 << 19);
		@Pc(29) Class100 local29 = (Class100) this.aClass56_1.aClass240_63.method25829(local22);
		if (local29 == null) {
			this.method1183(arg0, arg1, arg2, local22);
			return (Class100) this.aClass56_1.aClass240_63.method25829(local22);
		} else {
			return local29;
		}
	}

	@OriginalMember(owner = "client!aco", name = "q", descriptor = "(Lclient!dh;IZ)Lclient!cm;", line = 39)
	public Class100 method1179(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(22) long local22 = (long) (this.anInt232 * -1612489907 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.anInt2888 * 658538839 << 19);
		@Pc(29) Class100 local29 = (Class100) this.aClass56_1.aClass240_63.method25829(local22);
		if (local29 == null) {
			this.method1183(arg0, arg1, arg2, local22);
			return (Class100) this.aClass56_1.aClass240_63.method25829(local22);
		} else {
			return local29;
		}
	}

	@OriginalMember(owner = "client!aco", name = "b", descriptor = "(Lclient!dh;IZ)[I", line = 47)
	public int[] method1180(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.anIntArray17 == null) {
			@Pc(28) long local28 = (long) (this.anInt232 * -1612489907 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.anInt2888 * 658538839 << 19);
			this.method1183(arg0, arg1, arg2, local28);
			return this.anIntArray17;
		} else {
			return this.anIntArray17;
		}
	}

	@OriginalMember(owner = "client!aco", name = "p", descriptor = "(Lclient!dh;IZB)[I", line = 47)
	public int[] method1181(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		if (this.anIntArray17 == null) {
			@Pc(28) long local28 = (long) (this.anInt232 * -1612489907 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.anInt2888 * 658538839 << 19);
			this.method1183(arg0, arg1, arg2, local28);
			return this.anIntArray17;
		} else {
			return this.anIntArray17;
		}
	}

	@OriginalMember(owner = "client!aco", name = "x", descriptor = "(Lclient!dh;IZ)[I", line = 47)
	public int[] method1182(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.anIntArray17 == null) {
			@Pc(28) long local28 = (long) (this.anInt232 * -1612489907 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.anInt2888 * 658538839 << 19);
			this.method1183(arg0, arg1, arg2, local28);
			return this.anIntArray17;
		} else {
			return this.anIntArray17;
		}
	}

	@OriginalMember(owner = "client!aco", name = "d", descriptor = "(Lclient!dh;IZJ)V", line = 54)
	void method1183(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) long arg3) {
		if (!this.aClass56_1.aClass497_85.method30071(this.anInt232 * -1612489907, -512225963)) {
			return;
		}
		@Pc(20) Class105 local20 = Class203.method24648(this.aClass56_1.aClass497_85, this.anInt232 * -1612489907, 0);
		if (local20 != null) {
			local20.method7162();
			if (arg2) {
				local20.method7169();
			}
			@Pc(31) int local31;
			for (local31 = 0; local31 < arg1; local31++) {
				local20.method7155();
			}
			this.anIntArray17 = local20.method7171(false);
			if (this.anInt233 * -1811914921 != 0) {
				local31 = this.anInt233 * -1811914921 >> 16 & 0xFF;
				@Pc(67) int local67 = this.anInt233 * -1811914921 >> 8 & 0xFF;
				@Pc(74) int local74 = this.anInt233 * -1811914921 & 0xFF;
				for (@Pc(76) int local76 = 0; local76 < this.anIntArray17.length; local76++) {
					@Pc(90) int local90 = this.anIntArray17[local76] >> 24 & 0xFF;
					@Pc(94) int local94 = 256 - local90;
					if (local90 != 0) {
						@Pc(108) int local108 = (this.anIntArray17[local76] & 0xFF0000) * local31 * -16777216;
						@Pc(119) int local119 = local67 * 16711680 * (this.anIntArray17[local76] & 0xFF00);
						@Pc(130) int local130 = (this.anIntArray17[local76] & 0xFF) * local74 * 65280;
						@Pc(138) int local138 = (local108 | local119 | local130) >>> 8;
						if (local90 == 255) {
							this.anIntArray17[local76] = local138;
						} else {
							@Pc(152) int local152 = this.anIntArray17[local76];
							this.anIntArray17[local76] = local90 << 24 | (local90 * (local152 & 0xFF00FF) + (local138 & 0xFF00FF) * local94 & 0xFF00FF00) + (local90 * (local152 & 0xFF00) + (local138 & 0xFF00) * local94 & 0xFF0000) >> 8;
						}
					}
				}
			}
		}
		@Pc(196) Class100 local196 = arg0.method20589(local20, true);
		if (local196 != null) {
			this.aClass56_1.aClass240_63.method25838(local196, arg3);
		}
	}

	@OriginalMember(owner = "client!aco", name = "h", descriptor = "(Lclient!dh;IZJ)V", line = 54)
	void method1184(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) long arg3) {
		if (!this.aClass56_1.aClass497_85.method30071(this.anInt232 * -1612489907, -512225963)) {
			return;
		}
		@Pc(20) Class105 local20 = Class203.method24648(this.aClass56_1.aClass497_85, this.anInt232 * -1612489907, 0);
		if (local20 != null) {
			local20.method7162();
			if (arg2) {
				local20.method7169();
			}
			@Pc(31) int local31;
			for (local31 = 0; local31 < arg1; local31++) {
				local20.method7155();
			}
			this.anIntArray17 = local20.method7171(false);
			if (this.anInt233 * -1811914921 != 0) {
				local31 = this.anInt233 * -1811914921 >> 16 & 0xFF;
				@Pc(67) int local67 = this.anInt233 * -1811914921 >> 8 & 0xFF;
				@Pc(74) int local74 = this.anInt233 * -1811914921 & 0xFF;
				for (@Pc(76) int local76 = 0; local76 < this.anIntArray17.length; local76++) {
					@Pc(90) int local90 = this.anIntArray17[local76] >> 24 & 0xFF;
					@Pc(94) int local94 = 256 - local90;
					if (local90 != 0) {
						@Pc(108) int local108 = (this.anIntArray17[local76] & 0xFF0000) * local31 * -16777216;
						@Pc(119) int local119 = local67 * 16711680 * (this.anIntArray17[local76] & 0xFF00);
						@Pc(130) int local130 = (this.anIntArray17[local76] & 0xFF) * local74 * 65280;
						@Pc(138) int local138 = (local108 | local119 | local130) >>> 8;
						if (local90 == 255) {
							this.anIntArray17[local76] = local138;
						} else {
							@Pc(152) int local152 = this.anIntArray17[local76];
							this.anIntArray17[local76] = local90 << 24 | (local90 * (local152 & 0xFF00FF) + (local138 & 0xFF00FF) * local94 & 0xFF00FF00) + (local90 * (local152 & 0xFF00) + (local138 & 0xFF00) * local94 & 0xFF0000) >> 8;
						}
					}
				}
			}
		}
		@Pc(196) Class100 local196 = arg0.method20589(local20, true);
		if (local196 != null) {
			this.aClass56_1.aClass240_63.method25838(local196, arg3);
		}
	}

	@OriginalMember(owner = "client!aco", name = "c", descriptor = "(I)Z", line = 88)
	public boolean method1185(@OriginalArg(0) int arg0) {
		return this.aClass56_1.aClass497_85.method30071(this.anInt232 * -1612489907, -512225963);
	}

	@OriginalMember(owner = "client!aco", name = "a", descriptor = "()Z", line = 88)
	public boolean method1186() {
		return this.aClass56_1.aClass497_85.method30071(this.anInt232 * -1612489907, -512225963);
	}

	@OriginalMember(owner = "client!aco", name = "l", descriptor = "()V", line = 91)
	@Override
	public void method36659() {
	}

	@OriginalMember(owner = "client!aco", name = "n", descriptor = "(I)V", line = 91)
	@Override
	public void method36653(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aco", name = "gz", descriptor = "(Lclient!ahm;ZI)V", line = 3922)
	static final void method1187(@OriginalArg(0) Class132_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class622 local3 = arg0.method19997(1204621913);
		if (arg0.anInt2763 * -846948133 == 0) {
			arg0.anInt2791 = 0;
			Class279.anInt3892 = Class707.aClass707_5.aByte176 * 511155897;
			Class274.anInt3887 = 0;
			return;
		}
		if (arg0.aClass19_3.method23557(-1815863422) && !arg0.aClass19_3.method23578((byte) 0)) {
			@Pc(34) Class263 local34 = arg0.aClass19_3.method23560(-386337976);
			if (arg0.anInt2760 * -215928493 > 0 && local34.anInt3867 * -2017474589 == 0) {
				arg0.anInt2791 += -1315809289;
				Class279.anInt3892 = Class707.aClass707_5.aByte176 * 511155897;
				Class274.anInt3887 = 0;
				return;
			}
			if (arg0.anInt2760 * -215928493 <= 0 && local34.anInt3876 * -1511529595 == 0) {
				arg0.anInt2791 += -1315809289;
				Class279.anInt3892 = Class707.aClass707_5.aByte176 * 511155897;
				Class274.anInt3887 = 0;
				return;
			}
		}
		for (@Pc(85) int local85 = 0; local85 < arg0.aClass554Array3.length; local85++) {
			if (arg0.aClass554Array3[local85].anInt5319 * 601549465 != -1 && arg0.aClass554Array3[local85].aClass19_7.method23578((byte) 0)) {
				@Pc(119) Class697 local119 = (Class697) Class501.aClass32_Sub18_1.method18261(arg0.aClass554Array3[local85].anInt5319 * 601549465, -1457911894);
				if (local119.aBoolean881 && local119.anInt5949 * 1477426425 != -1) {
					@Pc(137) Class263 local137 = (Class263) Class32.aClass32_Sub17_23.method18261(local119.anInt5949 * 1477426425, 1117391038);
					if (arg0.anInt2760 * -215928493 > 0 && local137.anInt3867 * -2017474589 == 0) {
						arg0.anInt2791 += -1315809289;
						Class279.anInt3892 = Class707.aClass707_5.aByte176 * 511155897;
						Class274.anInt3887 = 0;
						return;
					}
					if (arg0.anInt2760 * -215928493 <= 0 && local137.anInt3876 * -1511529595 == 0) {
						arg0.anInt2791 += -1315809289;
						Class279.anInt3892 = Class707.aClass707_5.aByte176 * 511155897;
						Class274.anInt3887 = 0;
						return;
					}
				}
			}
		}
		@Pc(193) Class472 local193 = Class472.method29537(arg0.method24220().aClass472_61);
		@Pc(197) int local197 = (int) local193.aFloat317;
		@Pc(201) int local201 = (int) local193.aFloat319;
		@Pc(219) int local219 = arg0.anIntArray240[arg0.anInt2763 * -846948133 - 1] * 512 + arg0.method19986(-377394071) * 256;
		@Pc(237) int local237 = arg0.anIntArray239[arg0.anInt2763 * -846948133 - 1] * 512 + arg0.method19986(1600788225) * 256;
		if (local197 < local219) {
			if (local201 < local237) {
				arg0.method19951(10240, (byte) 5);
			} else if (local201 > local237) {
				arg0.method19951(14336, (byte) 48);
			} else {
				arg0.method19951(12288, (byte) 77);
			}
		} else if (local197 > local219) {
			if (local201 < local237) {
				arg0.method19951(6144, (byte) 98);
			} else if (local201 > local237) {
				arg0.method19951(2048, (byte) 91);
			} else {
				arg0.method19951(4096, (byte) 28);
			}
		} else if (local201 < local237) {
			arg0.method19951(8192, (byte) 64);
		} else if (local201 > local237) {
			arg0.method19951(0, (byte) 108);
		}
		@Pc(310) byte local310 = arg0.aByteArray47[arg0.anInt2763 * -846948133 - 1];
		if (!arg1 && (local219 - local197 > 1024 || local219 - local197 < -1024 || local237 - local201 > 1024 || local237 - local201 < -1024)) {
			arg0.method24244((float) local219, local193.aFloat318, (float) local237);
			arg0.method19953(arg0.anInt2771 * -1921859025, false, 1414376484);
			arg0.anInt2763 -= 1975362387;
			if (arg0.anInt2760 * -215928493 > 0) {
				arg0.anInt2760 -= 958020315;
			}
			Class279.anInt3892 = Class707.aClass707_5.aByte176 * 511155897;
			Class274.anInt3887 = 0;
			local193.method29544();
			return;
		}
		@Pc(377) int local377 = 16;
		@Pc(379) boolean local379 = true;
		if (arg0 instanceof Class132_Sub1_Sub1_Sub1_Sub1) {
			local379 = ((Class132_Sub1_Sub1_Sub1_Sub1) arg0).aClass336_1.aBoolean719;
		}
		@Pc(400) int local400;
		if (local379) {
			local400 = arg0.anInt2771 * -1921859025 - arg0.aClass523_7.anInt5223 * -1093332503;
			if (local400 != 0 && arg0.anInt2772 * -583289569 == -1 && arg0.anInt2788 * -846020455 != 0) {
				local377 = 8;
			}
			if (!arg1 && arg0.anInt2763 * -846948133 > 2) {
				local377 = 24;
			}
			if (!arg1 && arg0.anInt2763 * -846948133 > 3) {
				local377 = 32;
			}
		} else {
			if (!arg1 && arg0.anInt2763 * -846948133 > 1) {
				local377 = 24;
			}
			if (!arg1 && arg0.anInt2763 * -846948133 > 2) {
				local377 = 32;
			}
		}
		if (arg0.anInt2791 * 938318279 > 0 && arg0.anInt2763 * -846948133 > 1) {
			local377 = 32;
			arg0.anInt2791 -= -1315809289;
		}
		if (local310 == Class707.aClass707_3.aByte176) {
			local377 <<= 0x1;
		} else if (Class707.aClass707_1.aByte176 == local310) {
			local377 >>= 0x1;
		}
		if (local3.anInt5678 * -941909983 != -1) {
			local377 <<= 0x9;
			if (arg0.anInt2763 * -846948133 == 1) {
				local400 = arg0.anInt2792 * 6024725 * 6024725 * arg0.anInt2792;
				@Pc(537) int local537 = ((int) local193.aFloat317 > local219 ? (int) local193.aFloat317 - local219 : local219 - (int) local193.aFloat317) << 9;
				@Pc(556) int local556 = ((int) local193.aFloat319 > local237 ? (int) local193.aFloat319 - local237 : local237 - (int) local193.aFloat319) << 9;
				@Pc(563) int local563 = local537 > local556 ? local537 : local556;
				@Pc(570) int local570 = local563 * local3.anInt5678 * -1883819966;
				if (local400 > local570) {
					arg0.anInt2792 = arg0.anInt2792 * 6024725 / 2 * -281185987;
				} else if (local400 / 2 > local563) {
					arg0.anInt2792 -= local3.anInt5678 * -1672032035;
					if (arg0.anInt2792 * 6024725 < 0) {
						arg0.anInt2792 = 0;
					}
				} else if (arg0.anInt2792 * 6024725 < local377) {
					arg0.anInt2792 += local3.anInt5678 * -1672032035;
					if (arg0.anInt2792 * 6024725 > local377) {
						arg0.anInt2792 = local377 * -281185987;
					}
				}
			} else if (arg0.anInt2792 * 6024725 < local377) {
				arg0.anInt2792 += local3.anInt5678 * -1672032035;
				if (arg0.anInt2792 * 6024725 > local377) {
					arg0.anInt2792 = local377 * -281185987;
				}
			} else if (arg0.anInt2792 * 6024725 > 0) {
				arg0.anInt2792 -= local3.anInt5678 * -1672032035;
				if (arg0.anInt2792 * 6024725 < 0) {
					arg0.anInt2792 = 0;
				}
			}
			local377 = arg0.anInt2792 * 6024725 >> 9;
			if (local377 < 1) {
				local377 = 1;
			}
		}
		Class274.anInt3887 = 0;
		if (local219 == local197 && local237 == local201) {
			Class279.anInt3892 = Class707.aClass707_5.aByte176 * 511155897;
		} else {
			if (local197 < local219) {
				local193.aFloat317 += local377;
				Class274.anInt3887 = (Class274.anInt3887 * -799220063 | 0x4) * 2036761953;
				if (local193.aFloat317 > (float) local219) {
					local193.aFloat317 = local219;
				}
			} else if (local197 > local219) {
				local193.aFloat317 -= local377;
				Class274.anInt3887 = (Class274.anInt3887 * -799220063 | 0x8) * 2036761953;
				if (local193.aFloat317 < (float) local219) {
					local193.aFloat317 = local219;
				}
			}
			if (local201 < local237) {
				local193.aFloat319 += local377;
				Class274.anInt3887 = (Class274.anInt3887 * -799220063 | 0x1) * 2036761953;
				if (local193.aFloat319 > (float) local237) {
					local193.aFloat319 = local237;
				}
			} else if (local201 > local237) {
				local193.aFloat319 -= local377;
				Class274.anInt3887 = (Class274.anInt3887 * -799220063 | 0x2) * 2036761953;
				if (local193.aFloat319 < (float) local237) {
					local193.aFloat319 = local237;
				}
			}
			arg0.method24239(local193);
			if (local377 >= 32) {
				Class279.anInt3892 = Class707.aClass707_3.aByte176 * 511155897;
			} else {
				Class279.anInt3892 = local310 * 511155897;
			}
		}
		if ((int) local193.aFloat317 == local219 && (int) local193.aFloat319 == local237) {
			arg0.anInt2763 -= 1975362387;
			if (arg0.anInt2760 * -215928493 > 0) {
				arg0.anInt2760 -= 958020315;
			}
		}
		local193.method29544();
	}

	@OriginalMember(owner = "client!aco", name = "oa", descriptor = "(Lclient!yf;B)V", line = 7558)
	static final void method1188(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1218019240);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class498.method30136(local16, local22, arg0, (byte) 61);
	}
}
