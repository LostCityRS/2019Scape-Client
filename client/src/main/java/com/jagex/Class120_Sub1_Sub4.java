package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ash")
public abstract class Class120_Sub1_Sub4 extends Class120_Sub1 {

	@OriginalMember(owner = "client!ash", name = "z", descriptor = "I")
	int anInt1458 = 0;

	@OriginalMember(owner = "client!ash", name = "p", descriptor = "[Lclient!akb;")
	Class80_Sub12[] aClass80_Sub12Array13 = new Class80_Sub12[4];

	@OriginalMember(owner = "client!ash", name = "d", descriptor = "S")
	public short aShort48;

	@OriginalMember(owner = "client!ash", name = "<init>", descriptor = "(Lclient!te;IIIIIILclient!oc;)V")
	Class120_Sub1_Sub4(@OriginalArg(0) Class570 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class457 arg7) {
		super(arg0, arg7);
		this.aByte99 = (byte) arg4;
		this.aByte100 = (byte) arg5;
		this.aShort48 = (short) arg6;
		if (arg7 != null) {
			this.method24527(arg7);
		}
		this.method24530((float) arg1, (float) arg2, (float) arg3);
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			this.aClass80_Sub12Array13[local38] = null;
		}
	}

	@OriginalMember(owner = "client!ash", name = "hn", descriptor = "()Z")
	@Override
	final boolean method24586() {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		return this.aClass570_23.aBooleanArrayArray20[((int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5241 * 1611671173 + this.aClass570_23.anInt5244 * 1989483179][((int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5253 * 1105662773 + this.aClass570_23.anInt5244 * 1989483179];
	}

	@OriginalMember(owner = "client!ash", name = "hf", descriptor = "()Z")
	@Override
	final boolean method24618() {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		return this.aClass570_23.aBooleanArrayArray20[((int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5241 * 1611671173 + this.aClass570_23.anInt5244 * 1989483179][((int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5253 * 1105662773 + this.aClass570_23.anInt5244 * 1989483179];
	}

	@OriginalMember(owner = "client!ash", name = "gc", descriptor = "(Lclient!di;I)Z")
	@Override
	final boolean method24575(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		return this.aClass570_23.aClass600_1.method32064(this.aByte100, (int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119, (int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119);
	}

	@OriginalMember(owner = "client!ash", name = "gj", descriptor = "(S)Z")
	@Override
	final boolean method24576(@OriginalArg(0) short arg0) {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		return this.aClass570_23.aBooleanArrayArray20[((int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5241 * 1611671173 + this.aClass570_23.anInt5244 * 1989483179][((int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5253 * 1105662773 + this.aClass570_23.anInt5244 * 1989483179];
	}

	@OriginalMember(owner = "client!ash", name = "gs", descriptor = "([Lclient!akb;)I")
	@Override
	final int method24623(@OriginalArg(0) Class80_Sub12[] arg0) {
		if (this.aBoolean672) {
			@Pc(6) Class463 local6 = this.method24552().aClass463_61;
			this.anInt1458 = this.method24579((int) local6.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119, (int) local6.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119, this.aClass80_Sub12Array13, (byte) -110) * 282966665;
			this.aBoolean672 = false;
		}
		for (@Pc(38) int local38 = 0; local38 < this.anInt1458 * -412492871; local38++) {
			arg0[local38] = this.aClass80_Sub12Array13[local38];
		}
		return this.anInt1458 * -412492871;
	}

	@OriginalMember(owner = "client!ash", name = "hp", descriptor = "(Lclient!di;)Z")
	@Override
	final boolean method24617(@OriginalArg(0) Class102 arg0) {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		return this.aClass570_23.aClass600_1.method32064(this.aByte100, (int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119, (int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119);
	}

	@OriginalMember(owner = "client!ash", name = "ha", descriptor = "()Z")
	@Override
	final boolean method24620() {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		return this.aClass570_23.aBooleanArrayArray20[((int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5241 * 1611671173 + this.aClass570_23.anInt5244 * 1989483179][((int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5253 * 1105662773 + this.aClass570_23.anInt5244 * 1989483179];
	}

	@OriginalMember(owner = "client!ash", name = "gd", descriptor = "([Lclient!akb;I)I")
	@Override
	final int method24574(@OriginalArg(0) Class80_Sub12[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean672) {
			@Pc(6) Class463 local6 = this.method24552().aClass463_61;
			this.anInt1458 = this.method24579((int) local6.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119, (int) local6.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119, this.aClass80_Sub12Array13, (byte) 10) * 282966665;
			this.aBoolean672 = false;
		}
		for (@Pc(38) int local38 = 0; local38 < this.anInt1458 * -412492871; local38++) {
			arg0[local38] = this.aClass80_Sub12Array13[local38];
		}
		return this.anInt1458 * -412492871;
	}
}
