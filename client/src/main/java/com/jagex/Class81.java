package com.jagex;

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adg")
public class Class81 {

	@OriginalMember(owner = "client!adg", name = "e", descriptor = "I")
	static final int anInt246 = 0;

	@OriginalMember(owner = "client!adg", name = "l", descriptor = "I")
	static int anInt248;

	@OriginalMember(owner = "client!adg", name = "da", descriptor = "Lclient!nw;")
	public static Class451 aClass451_1;

	@OriginalMember(owner = "client!adg", name = "n", descriptor = "Lclient!py;")
	final Class497 aClass497_12;

	@OriginalMember(owner = "client!adg", name = "m", descriptor = "[Lclient!ads;")
	final Class90[] aClass90Array1;

	@OriginalMember(owner = "client!adg", name = "k", descriptor = "I")
	final int anInt247;

	@OriginalMember(owner = "client!adg", name = "<init>", descriptor = "(Lclient!zd;Lclient!zt;Lclient!py;)V", line = 17)
	public Class81(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) Class497 arg2) {
		this.aClass497_12 = arg2;
		@Pc(14) Packet local14 = new Packet(this.aClass497_12.method30064(0, 0, (byte) 0));
		@Pc(29) int local29 = local14.data == null || local14.data.length < 1 ? -1 : local14.g1((short) 16384);
		if (local29 < 4) {
			this.aClass90Array1 = new Class90[0];
			this.anInt247 = -1987484731;
		} else {
			@Pc(44) int local44 = local14.g1((short) 16384);
			@Pc(47) Class388[] local47 = Class352.method27653(970046158);
			@Pc(49) boolean local49 = true;
			@Pc(58) int local58;
			@Pc(66) int local66;
			if (local44 == local47.length) {
				for (local58 = 0; local58 < local47.length; local58++) {
					local66 = local14.g1((short) 16384);
					if (local66 != local47[local58].anInt4651 * 1858230309) {
						local49 = false;
						break;
					}
				}
			} else {
				local49 = false;
			}
			if (local49) {
				local58 = local14.g1((short) 16384);
				local66 = local14.g1((short) 16384);
				@Pc(107) int local107;
				@Pc(103) int local103;
				if (local29 > 2) {
					this.anInt247 = local14.g2s((byte) -127) * 1987484731;
					local103 = local14.g3((short) 27760);
					local107 = local14.g2(-1434290800);
				} else {
					this.anInt247 = -1987484731;
					local103 = 0;
					local107 = 0;
				}
				this.aClass90Array1 = new Class90[local66 + 1];
				@Pc(123) int local123;
				for (local123 = 0; local123 < local58; local123++) {
					@Pc(130) int local130 = local14.g1((short) 16384);
					@Pc(139) boolean local139 = local14.g1((short) 16384) == 1;
					@Pc(143) int local143 = local14.g2(-1434290800);
					@Pc(152) Class84[] local152;
					@Pc(154) int local154;
					@Pc(161) int local161;
					@Pc(165) int local165;
					@Pc(169) int local169;
					if (this.anInt247 * -1778000653 == -1) {
						local152 = new Class84[local143];
						for (local154 = 0; local154 < local143; local154++) {
							local161 = local14.g2(-1434290800);
							local165 = local14.g3((short) 3754);
							local169 = local14.g2(-1434290800);
							local152[local154] = new Class84(local161, local165, local169);
						}
						this.aClass90Array1[local130] = new Class90(local139, local152);
					} else {
						local152 = new Class84[local143 + 1];
						local152[0] = new Class84(this.anInt247 * -1778000653, local103, local107);
						for (local154 = 0; local154 < local143; local154++) {
							local161 = local14.g2(-1434290800);
							local165 = local14.g3((short) 17964);
							local169 = local14.g2(-1434290800);
							local152[local154 + 1] = new Class84(local161, local165, local169);
						}
					}
					this.aClass90Array1[local130] = new Class90(local139, local152);
				}
				for (local123 = 0; local123 < local66 + 1; local123++) {
					if (this.aClass90Array1[local123] == null) {
						this.aClass90Array1[local123] = this.method1366(local103, local107, -138464310);
					}
				}
			} else {
				this.aClass90Array1 = new Class90[0];
				this.anInt247 = -1987484731;
			}
		}
	}

	@OriginalMember(owner = "client!adg", name = "e", descriptor = "(III)Lclient!ads;", line = 98)
	Class90 method1366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt247 * -1778000653 == -1) {
			return new Class90(false, new Class84[0]);
		} else {
			@Pc(22) Class84 local22 = new Class84(this.anInt247 * -1778000653, arg0, arg1);
			return new Class90(false, new Class84[] { local22 });
		}
	}

	@OriginalMember(owner = "client!adg", name = "n", descriptor = "(II)Lclient!adn;", line = 108)
	public Class86 method1367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) byte[] local6 = this.aClass497_12.method30064(arg0, 0, (byte) 0);
		@Pc(10) Class86 local10 = new Class86();
		local10.method1490(new Packet(local6), -2100154978);
		return local10;
	}

	@OriginalMember(owner = "client!adg", name = "f", descriptor = "(I)Lclient!adn;", line = 108)
	public Class86 method1368(@OriginalArg(0) int arg0) {
		@Pc(6) byte[] local6 = this.aClass497_12.method30064(arg0, 0, (byte) 0);
		@Pc(10) Class86 local10 = new Class86();
		local10.method1490(new Packet(local6), -1218737057);
		return local10;
	}

	@OriginalMember(owner = "client!adg", name = "m", descriptor = "(Lclient!eo;FFFI)F", line = 114)
	static float method1369(@OriginalArg(0) Class248 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4) {
		@Pc(9) float local9 = Class368.method27962(arg0.aFloatArray102, arg0.anInt3838 * 491727461, arg1, (short) -20958);
		if (Math.abs(local9) < Class221.aFloat261) {
			return arg1;
		}
		@Pc(26) float local26 = Class368.method27962(arg0.aFloatArray102, arg0.anInt3838 * 491727461, arg2, (short) 4115);
		if (Math.abs(local26) < Class221.aFloat261) {
			return arg2;
		}
		@Pc(35) float local35 = 0.0F;
		@Pc(37) float local37 = 0.0F;
		@Pc(39) float local39 = 0.0F;
		@Pc(41) float local41 = 0.0F;
		@Pc(43) boolean local43 = true;
		@Pc(45) boolean local45 = false;
		do {
			local45 = false;
			if (local43) {
				local35 = arg1;
				local41 = local9;
				local37 = arg2 - arg1;
				local39 = local37;
				local43 = false;
			}
			if (Math.abs(local41) < Math.abs(local26)) {
				arg1 = arg2;
				arg2 = local35;
				local35 = arg1;
				local9 = local26;
				local26 = local41;
				local41 = local9;
			}
			@Pc(88) float local88 = Class221.aFloat262 * Math.abs(arg2) + arg3 * 0.5F;
			@Pc(94) float local94 = (local35 - arg2) * 0.5F;
			@Pc(107) boolean local107 = Math.abs(local94) > local88 && local26 != 0.0F;
			if (local107) {
				if (Math.abs(local39) < local88 || Math.abs(local9) <= Math.abs(local26)) {
					local37 = local94;
					local39 = local94;
				} else {
					@Pc(129) float local129 = local26 / local9;
					@Pc(139) float local139;
					@Pc(143) float local143;
					if (arg1 == local35) {
						local139 = local94 * 2.0F * local129;
						local143 = 1.0F - local129;
					} else {
						local143 = local9 / local41;
						@Pc(152) float local152 = local26 / local41;
						local139 = (local143 * 2.0F * local94 * (local143 - local152) - (local152 - 1.0F) * (arg2 - arg1)) * local129;
						local143 = (local129 - 1.0F) * (local152 - 1.0F) * (local143 - 1.0F);
					}
					if ((double) local139 > 0.0D) {
						local143 = -local143;
					} else {
						local139 = -local139;
					}
					local129 = local39;
					local39 = local37;
					if (local139 * 2.0F < local143 * local94 * 3.0F - Math.abs(local88 * local143) && local139 < Math.abs(local143 * local129 * 0.5F)) {
						local37 = local139 / local143;
					} else {
						local37 = local94;
						local39 = local94;
					}
				}
				arg1 = arg2;
				local9 = local26;
				if (Math.abs(local37) > local88) {
					arg2 += local37;
				} else if ((double) local94 > 0.0D) {
					arg2 += local88;
				} else {
					arg2 -= local88;
				}
				local26 = Class368.method27962(arg0.aFloatArray102, arg0.anInt3838 * 491727461, arg2, (short) 12666);
				if ((double) (local26 * (local41 / Math.abs(local41))) > 0.0D) {
					local43 = true;
					local45 = true;
				} else {
					local45 = true;
				}
			}
		} while (local45);
		return arg2;
	}

	@OriginalMember(owner = "client!adg", name = "m", descriptor = "(II)[Lclient!adk;", line = 115)
	public Class84[] method1370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || arg0 >= this.aClass90Array1.length) {
			return this.method1366(0, 0, 1189058653).aClass84Array1;
		}
		@Pc(18) Class90 local18 = this.aClass90Array1[arg0];
		if (!local18.aBoolean37 || local18.aClass84Array1.length <= 1) {
			return local18.aClass84Array1;
		}
		@Pc(39) int local39 = this.anInt247 * -1778000653 == -1 ? 0 : 1;
		@Pc(43) Random local43 = new Random();
		@Pc(48) Class84[] local48 = new Class84[local18.aClass84Array1.length];
		System.arraycopy(local18.aClass84Array1, 0, local48, 0, local48.length);
		for (@Pc(58) int local58 = local39; local58 < local48.length; local58++) {
			@Pc(72) int local72 = Class58.method1100(local43, local48.length - local39, 1900659589) + local39;
			@Pc(77) Class84 local77 = local18.aClass84Array1[local58];
			local48[local58] = local48[local72];
			local48[local72] = local77;
		}
		return local48;
	}

	@OriginalMember(owner = "client!adg", name = "w", descriptor = "(I)[Lclient!adk;", line = 115)
	public Class84[] method1371(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.aClass90Array1.length) {
			return this.method1366(0, 0, -301333472).aClass84Array1;
		}
		@Pc(18) Class90 local18 = this.aClass90Array1[arg0];
		if (!local18.aBoolean37 || local18.aClass84Array1.length <= 1) {
			return local18.aClass84Array1;
		}
		@Pc(39) int local39 = this.anInt247 * -1778000653 == -1 ? 0 : 1;
		@Pc(43) Random local43 = new Random();
		@Pc(48) Class84[] local48 = new Class84[local18.aClass84Array1.length];
		System.arraycopy(local18.aClass84Array1, 0, local48, 0, local48.length);
		for (@Pc(58) int local58 = local39; local58 < local48.length; local58++) {
			@Pc(72) int local72 = Class58.method1100(local43, local48.length - local39, 1470519944) + local39;
			@Pc(77) Class84 local77 = local18.aClass84Array1[local58];
			local48[local58] = local48[local72];
			local48[local72] = local77;
		}
		return local48;
	}

	@OriginalMember(owner = "client!adg", name = "z", descriptor = "(I)[Lclient!adk;", line = 115)
	public Class84[] method1372(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.aClass90Array1.length) {
			return this.method1366(0, 0, -189245603).aClass84Array1;
		}
		@Pc(18) Class90 local18 = this.aClass90Array1[arg0];
		if (!local18.aBoolean37 || local18.aClass84Array1.length <= 1) {
			return local18.aClass84Array1;
		}
		@Pc(39) int local39 = this.anInt247 * -1778000653 == -1 ? 0 : 1;
		@Pc(43) Random local43 = new Random();
		@Pc(48) Class84[] local48 = new Class84[local18.aClass84Array1.length];
		System.arraycopy(local18.aClass84Array1, 0, local48, 0, local48.length);
		for (@Pc(58) int local58 = local39; local58 < local48.length; local58++) {
			@Pc(72) int local72 = Class58.method1100(local43, local48.length - local39, 1953500275) + local39;
			@Pc(77) Class84 local77 = local18.aClass84Array1[local58];
			local48[local58] = local48[local72];
			local48[local72] = local77;
		}
		return local48;
	}

	@OriginalMember(owner = "client!adg", name = "l", descriptor = "(I)[Lclient!adk;", line = 115)
	public Class84[] method1373(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.aClass90Array1.length) {
			return this.method1366(0, 0, -894779434).aClass84Array1;
		}
		@Pc(18) Class90 local18 = this.aClass90Array1[arg0];
		if (!local18.aBoolean37 || local18.aClass84Array1.length <= 1) {
			return local18.aClass84Array1;
		}
		@Pc(39) int local39 = this.anInt247 * -1778000653 == -1 ? 0 : 1;
		@Pc(43) Random local43 = new Random();
		@Pc(48) Class84[] local48 = new Class84[local18.aClass84Array1.length];
		System.arraycopy(local18.aClass84Array1, 0, local48, 0, local48.length);
		for (@Pc(58) int local58 = local39; local58 < local48.length; local58++) {
			@Pc(72) int local72 = Class58.method1100(local43, local48.length - local39, 2106718585) + local39;
			@Pc(77) Class84 local77 = local18.aClass84Array1[local58];
			local48[local58] = local48[local72];
			local48[local72] = local77;
		}
		return local48;
	}

	@OriginalMember(owner = "client!adg", name = "u", descriptor = "(I)[Lclient!adk;", line = 115)
	public Class84[] method1374(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.aClass90Array1.length) {
			return this.method1366(0, 0, 650898618).aClass84Array1;
		}
		@Pc(18) Class90 local18 = this.aClass90Array1[arg0];
		if (!local18.aBoolean37 || local18.aClass84Array1.length <= 1) {
			return local18.aClass84Array1;
		}
		@Pc(39) int local39 = this.anInt247 * -1778000653 == -1 ? 0 : 1;
		@Pc(43) Random local43 = new Random();
		@Pc(48) Class84[] local48 = new Class84[local18.aClass84Array1.length];
		System.arraycopy(local18.aClass84Array1, 0, local48, 0, local48.length);
		for (@Pc(58) int local58 = local39; local58 < local48.length; local58++) {
			@Pc(72) int local72 = Class58.method1100(local43, local48.length - local39, 1513681391) + local39;
			@Pc(77) Class84 local77 = local18.aClass84Array1[local58];
			local48[local58] = local48[local72];
			local48[local72] = local77;
		}
		return local48;
	}

	@OriginalMember(owner = "client!adg", name = "p", descriptor = "()Z", line = 134)
	public boolean method1375() {
		return this.anInt247 * -1778000653 != -1;
	}

	@OriginalMember(owner = "client!adg", name = "k", descriptor = "(I)Z", line = 134)
	public boolean method1376(@OriginalArg(0) int arg0) {
		return this.anInt247 * -1778000653 != -1;
	}

	@OriginalMember(owner = "client!adg", name = "d", descriptor = "()Z", line = 134)
	public boolean method1377() {
		return this.anInt247 * -1778000653 != -1;
	}

	@OriginalMember(owner = "client!adg", name = "de", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 5660)
	static final void method1378(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5891 -= -987882558;
		arg0.aBoolean690 = true;
		arg0.anInt4015 = Math.max(Math.min(arg2.anIntArray519[arg2.anInt5891 * -1497248091], 2816), 0) * 1094472689;
		arg0.anInt4016 = Math.max(Math.min(arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 1], 2816), 0) * -2057294137;
		arg0.anInt4018 = Math.max(Math.min(arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 2], 2816), 0) * -1579231497;
		@Pc(71) int local71 = Math.max(Math.min(arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 3], 255), 0);
		@Pc(85) int local85 = Math.max(Math.min(arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 4], 255), 0);
		@Pc(99) int local99 = Math.max(Math.min(arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 5], 255), 0);
		arg0.anInt4020 = (local71 << 16 | local85 << 8 | local99) * 2024574293;
		arg0.anInt4053 = arg2.anIntArray519[-1497248091 * arg2.anInt5891 + 6] * -1943553031;
		arg0.anInt4017 = arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 7] * -467528811;
		arg0.anInt4040 = arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 8] * 870711937;
		arg0.anInt4021 = arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 9] * -4582817;
		Class354.method27694(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!adg", name = "amu", descriptor = "(Lclient!yf;I)V", line = 12056)
	static final void method1379(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class447.aClass447_5.method28913(-2061104310);
	}
}
