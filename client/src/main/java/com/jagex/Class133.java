package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public class Class133 implements Interface32 {

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "Lclient!cm;")
	Class99 aClass99_15;

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "Lclient!pf;")
	final Class480 aClass480_33;

	@OriginalMember(owner = "client!jp", name = "t", descriptor = "Lclient!lk;")
	final Class130 aClass130_2;

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "(I)V")
	static void method10403(@OriginalArg(0) int arg0) {
		Class595.anIntArray484 = Class259.method26449(2048, 35, 8, 8, 4, 0.4F, true, -474520527);
	}

	@OriginalMember(owner = "client!jp", name = "pb", descriptor = "(Lclient!yp;S)V")
	static void method10404(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class114.method8626(local11, local14, arg0, -1777815330);
	}

	@OriginalMember(owner = "client!jp", name = "sj", descriptor = "(Lclient!yp;S)V")
	static void method10405(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.anInt4131 * 2069134419;
	}

	@OriginalMember(owner = "client!jp", name = "vj", descriptor = "(Lclient!yp;I)V")
	static void method10406(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(19) Class80_Sub40 local19 = (Class80_Sub40) client.aClass24_20.method560((long) local13);
		if (local19 != null && local19.anInt3155 * 1092245243 == 3) {
			Class80_Sub42.method15605(local19, true, true, (byte) -126);
		}
	}

	@OriginalMember(owner = "client!jp", name = "azm", descriptor = "(Lclient!yp;B)V")
	static void method10407(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!jp", name = "bi", descriptor = "(Lclient!yp;I)V")
	static void method10408(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 != null) {
			Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1.method33528(local13, local23, Class25.aClass41_Sub9_1, -1610630296);
		}
	}

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lclient!pf;Lclient!lk;)V")
	Class133(@OriginalArg(0) Class480 arg0, @OriginalArg(1) Class130 arg1) {
		this.aClass480_33 = arg0;
		this.aClass130_2 = arg1;
	}

	@OriginalMember(owner = "client!jp", name = "i", descriptor = "()V")
	@Override
	public final void method28661() {
		this.aClass99_15 = Class568.method31530(this.aClass480_33, this.aClass130_2.anInt1171 * -534993123, -940401530);
	}

	@OriginalMember(owner = "client!jp", name = "t", descriptor = "(I)V")
	@Override
	public final void method28658(@OriginalArg(0) int arg0) {
		this.aClass99_15 = Class568.method31530(this.aClass480_33, this.aClass130_2.anInt1171 * -534993123, 782850398);
	}

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "(ZB)V")
	@Override
	public void method28662(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		if (arg0) {
			@Pc(19) int local19 = this.aClass130_2.aClass391_6.method28669(this.aClass99_15.method18214(), client.anInt3510 * 1528239985, (byte) -38) + this.aClass130_2.anInt1172 * -1094014189;
			@Pc(37) int local37 = this.aClass130_2.aClass383_6.method28573(this.aClass99_15.method18288(), client.anInt3511 * 1764386615, (byte) 100) + this.aClass130_2.anInt1173 * -23088371;
			this.aClass99_15.method18225(local19, local37);
		}
	}

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method28657(@OriginalArg(0) int arg0) {
		return this.aClass480_33.method29945(this.aClass130_2.anInt1171 * -534993123, (byte) 1);
	}

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "(Z)V")
	@Override
	public void method28660(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			@Pc(19) int local19 = this.aClass130_2.aClass391_6.method28669(this.aClass99_15.method18214(), client.anInt3510 * 1528239985, (byte) -10) + this.aClass130_2.anInt1172 * -1094014189;
			@Pc(37) int local37 = this.aClass130_2.aClass383_6.method28573(this.aClass99_15.method18288(), client.anInt3511 * 1764386615, (byte) 78) + this.aClass130_2.anInt1173 * -23088371;
			this.aClass99_15.method18225(local19, local37);
		}
	}

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "(Z)V")
	@Override
	public void method28659(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			@Pc(19) int local19 = this.aClass130_2.aClass391_6.method28669(this.aClass99_15.method18214(), client.anInt3510 * 1528239985, (byte) -4) + this.aClass130_2.anInt1172 * -1094014189;
			@Pc(37) int local37 = this.aClass130_2.aClass383_6.method28573(this.aClass99_15.method18288(), client.anInt3511 * 1764386615, (byte) 37) + this.aClass130_2.anInt1173 * -23088371;
			this.aClass99_15.method18225(local19, local37);
		}
	}

	@OriginalMember(owner = "client!jp", name = "o", descriptor = "()Z")
	@Override
	public final boolean method28664() {
		return this.aClass480_33.method29945(this.aClass130_2.anInt1171 * -534993123, (byte) 1);
	}

	@OriginalMember(owner = "client!jp", name = "m", descriptor = "()V")
	@Override
	public final void method28663() {
		this.aClass99_15 = Class568.method31530(this.aClass480_33, this.aClass130_2.anInt1171 * -534993123, 396400248);
	}

	@OriginalMember(owner = "client!jp", name = "u", descriptor = "(Z)V")
	@Override
	public void method28656(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			@Pc(19) int local19 = this.aClass130_2.aClass391_6.method28669(this.aClass99_15.method18214(), client.anInt3510 * 1528239985, (byte) -39) + this.aClass130_2.anInt1172 * -1094014189;
			@Pc(37) int local37 = this.aClass130_2.aClass383_6.method28573(this.aClass99_15.method18288(), client.anInt3511 * 1764386615, (byte) 33) + this.aClass130_2.anInt1173 * -23088371;
			this.aClass99_15.method18225(local19, local37);
		}
	}

	@OriginalMember(owner = "client!jp", name = "j", descriptor = "()Z")
	@Override
	public final boolean method28665() {
		return this.aClass480_33.method29945(this.aClass130_2.anInt1171 * -534993123, (byte) 1);
	}
}
