package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asq")
public abstract class Class120_Sub1_Sub3 extends Class120_Sub1 {

	@OriginalMember(owner = "client!asq", name = "p", descriptor = "I")
	int anInt1515 = 0;

	@OriginalMember(owner = "client!asq", name = "v", descriptor = "[Lclient!akb;")
	Class80_Sub12[] aClass80_Sub12Array15 = new Class80_Sub12[4];

	@OriginalMember(owner = "client!asq", name = "d", descriptor = "S")
	protected short aShort52;

	@OriginalMember(owner = "client!asq", name = "z", descriptor = "S")
	protected short aShort51;

	@OriginalMember(owner = "client!asq", name = "<init>", descriptor = "(Lclient!te;IIIIIIILclient!oc;)V")
	Class120_Sub1_Sub3(@OriginalArg(0) Class570 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class457 arg8) {
		super(arg0, arg8);
		this.aByte99 = (byte) arg4;
		this.aByte100 = (byte) arg5;
		this.aShort52 = (short) arg6;
		this.aShort51 = (short) arg7;
		if (arg8 != null) {
			this.method24527(arg8);
		}
		this.method24530((float) arg1, (float) arg2, (float) arg3);
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			this.aClass80_Sub12Array15[local42] = null;
		}
	}

	@OriginalMember(owner = "client!asq", name = "gg", descriptor = "()V")
	@Override
	final void method24603() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asq", name = "fs", descriptor = "()Z")
	@Override
	final boolean method24596() {
		return false;
	}

	@OriginalMember(owner = "client!asq", name = "gc", descriptor = "(Lclient!di;I)Z")
	@Override
	final boolean method24575(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		return this.aClass570_23.aClass600_1.method32075(this.aByte100, (int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119, (int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119, this.method24578(686201932));
	}

	@OriginalMember(owner = "client!asq", name = "gj", descriptor = "(S)Z")
	@Override
	final boolean method24576(@OriginalArg(0) short arg0) {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		return this.aClass570_23.aBooleanArrayArray20[((int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5241 * 1611671173 + this.aClass570_23.anInt5244 * 1989483179][((int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5253 * 1105662773 + this.aClass570_23.anInt5244 * 1989483179];
	}

	@OriginalMember(owner = "client!asq", name = "gd", descriptor = "([Lclient!akb;I)I")
	@Override
	final int method24574(@OriginalArg(0) Class80_Sub12[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean672) {
			@Pc(6) Class463 local6 = this.method24552().aClass463_61;
			this.anInt1515 = this.method24579((int) local6.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119, (int) local6.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119, this.aClass80_Sub12Array15, (byte) -106) * -1162770931;
			this.aBoolean672 = false;
		}
		for (@Pc(38) int local38 = 0; local38 < this.anInt1515 * 1159018693; local38++) {
			arg0[local38] = this.aClass80_Sub12Array15[local38];
		}
		return this.anInt1515 * 1159018693;
	}

	@OriginalMember(owner = "client!asq", name = "fy", descriptor = "(Lclient!di;Lclient!alf;IIIZI)V")
	@Override
	final void method24569(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asq", name = "fb", descriptor = "(I)V")
	@Override
	final void method24570(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asq", name = "gk", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	final void method24602(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asq", name = "fu", descriptor = "()Z")
	@Override
	final boolean method24606() {
		return false;
	}

	@OriginalMember(owner = "client!asq", name = "ff", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	final void method24598(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asq", name = "hp", descriptor = "(Lclient!di;)Z")
	@Override
	final boolean method24617(@OriginalArg(0) Class102 arg0) {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		return this.aClass570_23.aClass600_1.method32075(this.aByte100, (int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119, (int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119, this.method24578(1658237705));
	}

	@OriginalMember(owner = "client!asq", name = "fi", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	final void method24599(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asq", name = "gh", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	final void method24600(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asq", name = "gz", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	final void method24580(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asq", name = "fr", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	final void method24562(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asq", name = "ge", descriptor = "()V")
	@Override
	final void method24590() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asq", name = "gs", descriptor = "([Lclient!akb;)I")
	@Override
	final int method24623(@OriginalArg(0) Class80_Sub12[] arg0) {
		if (this.aBoolean672) {
			@Pc(6) Class463 local6 = this.method24552().aClass463_61;
			this.anInt1515 = this.method24579((int) local6.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119, (int) local6.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119, this.aClass80_Sub12Array15, (byte) -97) * -1162770931;
			this.aBoolean672 = false;
		}
		for (@Pc(38) int local38 = 0; local38 < this.anInt1515 * 1159018693; local38++) {
			arg0[local38] = this.aClass80_Sub12Array15[local38];
		}
		return this.anInt1515 * 1159018693;
	}

	@OriginalMember(owner = "client!asq", name = "fo", descriptor = "(B)Z")
	@Override
	final boolean method24566(@OriginalArg(0) byte arg0) {
		return false;
	}

	@OriginalMember(owner = "client!asq", name = "hf", descriptor = "()Z")
	@Override
	final boolean method24618() {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		return this.aClass570_23.aBooleanArrayArray20[((int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5241 * 1611671173 + this.aClass570_23.anInt5244 * 1989483179][((int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5253 * 1105662773 + this.aClass570_23.anInt5244 * 1989483179];
	}

	@OriginalMember(owner = "client!asq", name = "ha", descriptor = "()Z")
	@Override
	final boolean method24620() {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		return this.aClass570_23.aBooleanArrayArray20[((int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5241 * 1611671173 + this.aClass570_23.anInt5244 * 1989483179][((int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5253 * 1105662773 + this.aClass570_23.anInt5244 * 1989483179];
	}

	@OriginalMember(owner = "client!asq", name = "hn", descriptor = "()Z")
	@Override
	final boolean method24586() {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		return this.aClass570_23.aBooleanArrayArray20[((int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5241 * 1611671173 + this.aClass570_23.anInt5244 * 1989483179][((int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5253 * 1105662773 + this.aClass570_23.anInt5244 * 1989483179];
	}
}
