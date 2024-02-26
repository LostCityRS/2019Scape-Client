package com.jagex;

import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acg")
public final class Class57 implements Interface11 {

	@OriginalMember(owner = "client!acg", name = "r", descriptor = "Lclient!arz;")
	static Class80_Sub1_Sub11 aClass80_Sub1_Sub11_1;

	@OriginalMember(owner = "client!acg", name = "e", descriptor = "I")
	public int anInt203;

	@OriginalMember(owner = "client!acg", name = "f", descriptor = "I")
	public int anInt204;

	@OriginalMember(owner = "client!acg", name = "l", descriptor = "[I")
	int[] anIntArray26;

	@OriginalMember(owner = "client!acg", name = "u", descriptor = "Z")
	public boolean aBoolean31 = false;

	@OriginalMember(owner = "client!acg", name = "t", descriptor = "Lclient!acw;")
	Class71 aClass71_1;

	@OriginalMember(owner = "client!acg", name = "am", descriptor = "(Lclient!yp;I)V")
	static void method1162(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anObjectArray45[arg0.anIntArray526[arg0.anInt5780 * -1336568839]] = arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
	}

	@OriginalMember(owner = "client!acg", name = "nq", descriptor = "(Lclient!ad;I)V")
	static void method1163(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class80_Sub31 local5 = Class623.method32440(Class443.aClass443_47, arg0.aClass22_1, -191270971);
		arg0.method1325(local5, (byte) -43);
		client.aBoolean749 = true;
	}

	@OriginalMember(owner = "client!acg", name = "eh", descriptor = "(Lclient!yp;B)V")
	static void method1164(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class433.method29105(local11, local14, arg0, 1206901479);
	}

	@OriginalMember(owner = "client!acg", name = "t", descriptor = "(Ljava/awt/Component;I)Lclient!un;")
	public static Class155 method1165(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1) {
		return new Class155_Sub1(arg0);
	}

	@OriginalMember(owner = "client!acg", name = "<init>", descriptor = "(ILclient!acw;)V")
	Class57(@OriginalArg(0) int arg0, @OriginalArg(1) Class71 arg1) {
		this.aClass71_1 = arg1;
	}

	@OriginalMember(owner = "client!acg", name = "r", descriptor = "(Lclient!di;IZJ)V")
	void method1146(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) long arg3) {
		if (!this.aClass71_1.aClass480_76.method29945(this.anInt204 * -782006561, (byte) 1)) {
			return;
		}
		@Pc(20) Class109 local20 = Class212.method25822(this.aClass71_1.aClass480_76, this.anInt204 * -782006561, 0);
		if (local20 != null) {
			local20.method7125();
			if (arg2) {
				local20.method7172();
			}
			@Pc(30) int local30;
			for (local30 = 0; local30 < arg1; local30++) {
				local20.method7133();
			}
			this.anIntArray26 = local20.method7117(false);
			if (this.anInt203 * -567332909 != 0) {
				local30 = this.anInt203 * -567332909 >> 16 & 0xFF;
				@Pc(65) int local65 = this.anInt203 * -567332909 >> 8 & 0xFF;
				@Pc(72) int local72 = this.anInt203 * -567332909 & 0xFF;
				for (@Pc(74) int local74 = 0; local74 < this.anIntArray26.length; local74++) {
					@Pc(88) int local88 = this.anIntArray26[local74] >> 24 & 0xFF;
					@Pc(92) int local92 = 256 - local88;
					if (local88 != 0) {
						@Pc(107) int local107 = (this.anIntArray26[local74] & 0xFF0000) * -16777216 * local30;
						@Pc(118) int local118 = local65 * (this.anIntArray26[local74] & 0xFF00) * 16711680;
						@Pc(129) int local129 = local72 * 65280 * (this.anIntArray26[local74] & 0xFF);
						@Pc(137) int local137 = (local107 | local118 | local129) >>> 8;
						if (local88 == 255) {
							this.anIntArray26[local74] = local137;
						} else {
							@Pc(151) int local151 = this.anIntArray26[local74];
							this.anIntArray26[local74] = local88 << 24 | (local92 * (local137 & 0xFF00FF) + (local151 & 0xFF00FF) * local88 & 0xFF00FF00) + ((local137 & 0xFF00) * local92 + local88 * (local151 & 0xFF00) & 0xFF0000) >> 8;
						}
					}
				}
			}
		}
		@Pc(195) Class99 local195 = arg0.method20906(local20, true);
		if (local195 != null) {
			this.aClass71_1.aClass243_64.method26253(local195, arg3);
		}
	}

	@OriginalMember(owner = "client!acg", name = "l", descriptor = "(Lclient!ald;II)V")
	void method1147(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt204 = arg0.method23210((byte) 84) * 1330230559;
		} else if (arg1 == 2) {
			this.anInt203 = arg0.method23180(1710327153) * -610402213;
		} else if (arg1 == 3) {
			this.aBoolean31 = true;
		} else if (arg1 == 4) {
			this.anInt204 = -1330230559;
		} else if (arg1 == 5) {
		}
	}

	@OriginalMember(owner = "client!acg", name = "g", descriptor = "(Lclient!di;IZI)Lclient!cm;")
	public Class99 method1148(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(22) long local22 = (long) (this.anInt204 * -782006561 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.anInt2931 * -829205491 << 19);
		@Pc(29) Class99 local29 = (Class99) this.aClass71_1.aClass243_64.method26282(local22);
		if (local29 == null) {
			this.method1150(arg0, arg1, arg2, local22);
			return (Class99) this.aClass71_1.aClass243_64.method26282(local22);
		} else {
			return local29;
		}
	}

	@OriginalMember(owner = "client!acg", name = "k", descriptor = "(Lclient!di;IZ)Lclient!cm;")
	public Class99 method1149(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(22) long local22 = (long) (this.anInt204 * -782006561 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.anInt2931 * -829205491 << 19);
		@Pc(29) Class99 local29 = (Class99) this.aClass71_1.aClass243_64.method26282(local22);
		if (local29 == null) {
			this.method1150(arg0, arg1, arg2, local22);
			return (Class99) this.aClass71_1.aClass243_64.method26282(local22);
		} else {
			return local29;
		}
	}

	@OriginalMember(owner = "client!acg", name = "m", descriptor = "(Lclient!di;IZJ)V")
	void method1150(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) long arg3) {
		if (!this.aClass71_1.aClass480_76.method29945(this.anInt204 * -782006561, (byte) 1)) {
			return;
		}
		@Pc(20) Class109 local20 = Class212.method25822(this.aClass71_1.aClass480_76, this.anInt204 * -782006561, 0);
		if (local20 != null) {
			local20.method7125();
			if (arg2) {
				local20.method7172();
			}
			@Pc(30) int local30;
			for (local30 = 0; local30 < arg1; local30++) {
				local20.method7133();
			}
			this.anIntArray26 = local20.method7117(false);
			if (this.anInt203 * -567332909 != 0) {
				local30 = this.anInt203 * -567332909 >> 16 & 0xFF;
				@Pc(65) int local65 = this.anInt203 * -567332909 >> 8 & 0xFF;
				@Pc(72) int local72 = this.anInt203 * -567332909 & 0xFF;
				for (@Pc(74) int local74 = 0; local74 < this.anIntArray26.length; local74++) {
					@Pc(88) int local88 = this.anIntArray26[local74] >> 24 & 0xFF;
					@Pc(92) int local92 = 256 - local88;
					if (local88 != 0) {
						@Pc(107) int local107 = (this.anIntArray26[local74] & 0xFF0000) * -16777216 * local30;
						@Pc(118) int local118 = local65 * (this.anIntArray26[local74] & 0xFF00) * 16711680;
						@Pc(129) int local129 = local72 * 65280 * (this.anIntArray26[local74] & 0xFF);
						@Pc(137) int local137 = (local107 | local118 | local129) >>> 8;
						if (local88 == 255) {
							this.anIntArray26[local74] = local137;
						} else {
							@Pc(151) int local151 = this.anIntArray26[local74];
							this.anIntArray26[local74] = local88 << 24 | (local92 * (local137 & 0xFF00FF) + (local151 & 0xFF00FF) * local88 & 0xFF00FF00) + ((local137 & 0xFF00) * local92 + local88 * (local151 & 0xFF00) & 0xFF0000) >> 8;
						}
					}
				}
			}
		}
		@Pc(195) Class99 local195 = arg0.method20906(local20, true);
		if (local195 != null) {
			this.aClass71_1.aClass243_64.method26253(local195, arg3);
		}
	}

	@OriginalMember(owner = "client!acg", name = "o", descriptor = "(I)Z")
	public boolean method1151(@OriginalArg(0) int arg0) {
		return this.aClass71_1.aClass480_76.method29945(this.anInt204 * -782006561, (byte) 1);
	}

	@OriginalMember(owner = "client!acg", name = "z", descriptor = "()Z")
	public boolean method1152() {
		return this.aClass71_1.aClass480_76.method29945(this.anInt204 * -782006561, (byte) 1);
	}

	@OriginalMember(owner = "client!acg", name = "t", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method37006(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-374919480);
			if (local3 == 0) {
				return;
			}
			this.method1147(arg0, local3, -2141466622);
		}
	}

	@OriginalMember(owner = "client!acg", name = "i", descriptor = "(Lclient!di;IZI)[I")
	public int[] method1153(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (this.anIntArray26 == null) {
			@Pc(28) long local28 = (long) (this.anInt204 * -782006561 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.anInt2931 * -829205491 << 19);
			this.method1150(arg0, arg1, arg2, local28);
			return this.anIntArray26;
		} else {
			return this.anIntArray26;
		}
	}

	@OriginalMember(owner = "client!acg", name = "j", descriptor = "(Lclient!ald;I)V")
	void method1154(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt204 = arg0.method23210((byte) 30) * 1330230559;
		} else if (arg1 == 2) {
			this.anInt203 = arg0.method23180(1710327153) * -610402213;
		} else if (arg1 == 3) {
			this.aBoolean31 = true;
		} else if (arg1 == 4) {
			this.anInt204 = -1330230559;
		} else if (arg1 == 5) {
		}
	}

	@OriginalMember(owner = "client!acg", name = "a", descriptor = "(Lclient!ald;I)V")
	void method1155(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt204 = arg0.method23210((byte) 52) * 1330230559;
		} else if (arg1 == 2) {
			this.anInt203 = arg0.method23180(1710327153) * -610402213;
		} else if (arg1 == 3) {
			this.aBoolean31 = true;
		} else if (arg1 == 4) {
			this.anInt204 = -1330230559;
		} else if (arg1 == 5) {
		}
	}

	@OriginalMember(owner = "client!acg", name = "e", descriptor = "()V")
	@Override
	public void method37008() {
	}

	@OriginalMember(owner = "client!acg", name = "f", descriptor = "(B)V")
	@Override
	public void method37007(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!acg", name = "x", descriptor = "(Lclient!di;IZ)[I")
	public int[] method1156(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.anIntArray26 == null) {
			@Pc(28) long local28 = (long) (this.anInt204 * -782006561 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.anInt2931 * -829205491 << 19);
			this.method1150(arg0, arg1, arg2, local28);
			return this.anIntArray26;
		} else {
			return this.anIntArray26;
		}
	}

	@OriginalMember(owner = "client!acg", name = "w", descriptor = "(Lclient!di;IZJ)V")
	void method1157(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) long arg3) {
		if (!this.aClass71_1.aClass480_76.method29945(this.anInt204 * -782006561, (byte) 1)) {
			return;
		}
		@Pc(20) Class109 local20 = Class212.method25822(this.aClass71_1.aClass480_76, this.anInt204 * -782006561, 0);
		if (local20 != null) {
			local20.method7125();
			if (arg2) {
				local20.method7172();
			}
			@Pc(30) int local30;
			for (local30 = 0; local30 < arg1; local30++) {
				local20.method7133();
			}
			this.anIntArray26 = local20.method7117(false);
			if (this.anInt203 * -567332909 != 0) {
				local30 = this.anInt203 * -567332909 >> 16 & 0xFF;
				@Pc(65) int local65 = this.anInt203 * -567332909 >> 8 & 0xFF;
				@Pc(72) int local72 = this.anInt203 * -567332909 & 0xFF;
				for (@Pc(74) int local74 = 0; local74 < this.anIntArray26.length; local74++) {
					@Pc(88) int local88 = this.anIntArray26[local74] >> 24 & 0xFF;
					@Pc(92) int local92 = 256 - local88;
					if (local88 != 0) {
						@Pc(107) int local107 = (this.anIntArray26[local74] & 0xFF0000) * -16777216 * local30;
						@Pc(118) int local118 = local65 * (this.anIntArray26[local74] & 0xFF00) * 16711680;
						@Pc(129) int local129 = local72 * 65280 * (this.anIntArray26[local74] & 0xFF);
						@Pc(137) int local137 = (local107 | local118 | local129) >>> 8;
						if (local88 == 255) {
							this.anIntArray26[local74] = local137;
						} else {
							@Pc(151) int local151 = this.anIntArray26[local74];
							this.anIntArray26[local74] = local88 << 24 | (local92 * (local137 & 0xFF00FF) + (local151 & 0xFF00FF) * local88 & 0xFF00FF00) + ((local137 & 0xFF00) * local92 + local88 * (local151 & 0xFF00) & 0xFF0000) >> 8;
						}
					}
				}
			}
		}
		@Pc(195) Class99 local195 = arg0.method20906(local20, true);
		if (local195 != null) {
			this.aClass71_1.aClass243_64.method26253(local195, arg3);
		}
	}

	@OriginalMember(owner = "client!acg", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	public void method37009(@OriginalArg(0) Class80_Sub36 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-1400953967);
			if (local3 == 0) {
				return;
			}
			this.method1147(arg0, local3, -2145833352);
		}
	}

	@OriginalMember(owner = "client!acg", name = "q", descriptor = "(Lclient!di;IZJ)V")
	void method1158(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) long arg3) {
		if (!this.aClass71_1.aClass480_76.method29945(this.anInt204 * -782006561, (byte) 1)) {
			return;
		}
		@Pc(20) Class109 local20 = Class212.method25822(this.aClass71_1.aClass480_76, this.anInt204 * -782006561, 0);
		if (local20 != null) {
			local20.method7125();
			if (arg2) {
				local20.method7172();
			}
			@Pc(30) int local30;
			for (local30 = 0; local30 < arg1; local30++) {
				local20.method7133();
			}
			this.anIntArray26 = local20.method7117(false);
			if (this.anInt203 * -567332909 != 0) {
				local30 = this.anInt203 * -567332909 >> 16 & 0xFF;
				@Pc(65) int local65 = this.anInt203 * -567332909 >> 8 & 0xFF;
				@Pc(72) int local72 = this.anInt203 * -567332909 & 0xFF;
				for (@Pc(74) int local74 = 0; local74 < this.anIntArray26.length; local74++) {
					@Pc(88) int local88 = this.anIntArray26[local74] >> 24 & 0xFF;
					@Pc(92) int local92 = 256 - local88;
					if (local88 != 0) {
						@Pc(107) int local107 = (this.anIntArray26[local74] & 0xFF0000) * -16777216 * local30;
						@Pc(118) int local118 = local65 * (this.anIntArray26[local74] & 0xFF00) * 16711680;
						@Pc(129) int local129 = local72 * 65280 * (this.anIntArray26[local74] & 0xFF);
						@Pc(137) int local137 = (local107 | local118 | local129) >>> 8;
						if (local88 == 255) {
							this.anIntArray26[local74] = local137;
						} else {
							@Pc(151) int local151 = this.anIntArray26[local74];
							this.anIntArray26[local74] = local88 << 24 | (local92 * (local137 & 0xFF00FF) + (local151 & 0xFF00FF) * local88 & 0xFF00FF00) + ((local137 & 0xFF00) * local92 + local88 * (local151 & 0xFF00) & 0xFF0000) >> 8;
						}
					}
				}
			}
		}
		@Pc(195) Class99 local195 = arg0.method20906(local20, true);
		if (local195 != null) {
			this.aClass71_1.aClass243_64.method26253(local195, arg3);
		}
	}

	@OriginalMember(owner = "client!acg", name = "h", descriptor = "(Lclient!di;IZJ)V")
	void method1159(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) long arg3) {
		if (!this.aClass71_1.aClass480_76.method29945(this.anInt204 * -782006561, (byte) 1)) {
			return;
		}
		@Pc(20) Class109 local20 = Class212.method25822(this.aClass71_1.aClass480_76, this.anInt204 * -782006561, 0);
		if (local20 != null) {
			local20.method7125();
			if (arg2) {
				local20.method7172();
			}
			@Pc(30) int local30;
			for (local30 = 0; local30 < arg1; local30++) {
				local20.method7133();
			}
			this.anIntArray26 = local20.method7117(false);
			if (this.anInt203 * -567332909 != 0) {
				local30 = this.anInt203 * -567332909 >> 16 & 0xFF;
				@Pc(65) int local65 = this.anInt203 * -567332909 >> 8 & 0xFF;
				@Pc(72) int local72 = this.anInt203 * -567332909 & 0xFF;
				for (@Pc(74) int local74 = 0; local74 < this.anIntArray26.length; local74++) {
					@Pc(88) int local88 = this.anIntArray26[local74] >> 24 & 0xFF;
					@Pc(92) int local92 = 256 - local88;
					if (local88 != 0) {
						@Pc(107) int local107 = (this.anIntArray26[local74] & 0xFF0000) * -16777216 * local30;
						@Pc(118) int local118 = local65 * (this.anIntArray26[local74] & 0xFF00) * 16711680;
						@Pc(129) int local129 = local72 * 65280 * (this.anIntArray26[local74] & 0xFF);
						@Pc(137) int local137 = (local107 | local118 | local129) >>> 8;
						if (local88 == 255) {
							this.anIntArray26[local74] = local137;
						} else {
							@Pc(151) int local151 = this.anIntArray26[local74];
							this.anIntArray26[local74] = local88 << 24 | (local92 * (local137 & 0xFF00FF) + (local151 & 0xFF00FF) * local88 & 0xFF00FF00) + ((local137 & 0xFF00) * local92 + local88 * (local151 & 0xFF00) & 0xFF0000) >> 8;
						}
					}
				}
			}
		}
		@Pc(195) Class99 local195 = arg0.method20906(local20, true);
		if (local195 != null) {
			this.aClass71_1.aClass243_64.method26253(local195, arg3);
		}
	}

	@OriginalMember(owner = "client!acg", name = "d", descriptor = "()Z")
	public boolean method1160() {
		return this.aClass71_1.aClass480_76.method29945(this.anInt204 * -782006561, (byte) 1);
	}

	@OriginalMember(owner = "client!acg", name = "s", descriptor = "(Lclient!di;IZ)Lclient!cm;")
	public Class99 method1161(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(22) long local22 = (long) (this.anInt204 * -782006561 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.anInt2931 * -829205491 << 19);
		@Pc(29) Class99 local29 = (Class99) this.aClass71_1.aClass243_64.method26282(local22);
		if (local29 == null) {
			this.method1150(arg0, arg1, arg2, local22);
			return (Class99) this.aClass71_1.aClass243_64.method26282(local22);
		} else {
			return local29;
		}
	}
}
