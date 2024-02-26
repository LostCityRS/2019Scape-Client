package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asc")
public abstract class Class120_Sub1_Sub5 extends Class120_Sub1 {

	@OriginalMember(owner = "client!asc", name = "<init>", descriptor = "(Lclient!te;IIIII)V")
	Class120_Sub1_Sub5(@OriginalArg(0) Class570 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0);
		this.aByte99 = (byte) arg4;
		this.aByte100 = (byte) arg5;
		this.method24542(new Class463((float) arg1, (float) arg2, (float) arg3));
	}

	@OriginalMember(owner = "client!asc", name = "gs", descriptor = "([Lclient!akb;)I")
	@Override
	final int method24623(@OriginalArg(0) Class80_Sub12[] arg0) {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		return this.method24579((int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119, (int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119, arg0, (byte) -52);
	}

	@OriginalMember(owner = "client!asc", name = "gd", descriptor = "([Lclient!akb;I)I")
	@Override
	final int method24574(@OriginalArg(0) Class80_Sub12[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		return this.method24579((int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119, (int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119, arg0, (byte) -78);
	}

	@OriginalMember(owner = "client!asc", name = "fy", descriptor = "(Lclient!di;Lclient!alf;IIIZI)V")
	@Override
	final void method24569(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asc", name = "hf", descriptor = "()Z")
	@Override
	final boolean method24618() {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		return this.aClass570_23.aBooleanArrayArray20[this.aClass570_23.anInt5244 * 1989483179 + (((int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5241 * 1611671173)][this.aClass570_23.anInt5244 * 1989483179 + (((int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5253 * 1105662773)];
	}

	@OriginalMember(owner = "client!asc", name = "fo", descriptor = "(B)Z")
	@Override
	final boolean method24566(@OriginalArg(0) byte arg0) {
		return false;
	}

	@OriginalMember(owner = "client!asc", name = "fr", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	final void method24562(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asc", name = "fb", descriptor = "(I)V")
	@Override
	final void method24570(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asc", name = "fs", descriptor = "()Z")
	@Override
	final boolean method24596() {
		return false;
	}

	@OriginalMember(owner = "client!asc", name = "fu", descriptor = "()Z")
	@Override
	final boolean method24606() {
		return false;
	}

	@OriginalMember(owner = "client!asc", name = "ff", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	final void method24598(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asc", name = "hn", descriptor = "()Z")
	@Override
	final boolean method24586() {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		return this.aClass570_23.aBooleanArrayArray20[this.aClass570_23.anInt5244 * 1989483179 + (((int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5241 * 1611671173)][this.aClass570_23.anInt5244 * 1989483179 + (((int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5253 * 1105662773)];
	}

	@OriginalMember(owner = "client!asc", name = "gj", descriptor = "(S)Z")
	@Override
	final boolean method24576(@OriginalArg(0) short arg0) {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		return this.aClass570_23.aBooleanArrayArray20[this.aClass570_23.anInt5244 * 1989483179 + (((int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5241 * 1611671173)][this.aClass570_23.anInt5244 * 1989483179 + (((int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5253 * 1105662773)];
	}

	@OriginalMember(owner = "client!asc", name = "gh", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	final void method24600(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asc", name = "gz", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	final void method24580(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asc", name = "gg", descriptor = "()V")
	@Override
	final void method24603() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asc", name = "ge", descriptor = "()V")
	@Override
	final void method24590() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asc", name = "fi", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	final void method24599(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asc", name = "gk", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	final void method24602(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asc", name = "gc", descriptor = "(Lclient!di;I)Z")
	@Override
	final boolean method24575(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		@Pc(28) Class594 local28 = this.aClass570_23.method31575(this.aByte100, (int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119, (int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119, 35632);
		return local28 != null && local28.aClass120_Sub1_Sub1_1.aBoolean669 ? this.aClass570_23.aClass600_1.method32075(this.aByte100, (int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119, (int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119, local28.aClass120_Sub1_Sub1_1.method24578(2084797306) + this.method24578(1534714449)) : this.aClass570_23.aClass600_1.method32064(this.aByte100, (int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119, (int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119);
	}

	@OriginalMember(owner = "client!asc", name = "ha", descriptor = "()Z")
	@Override
	final boolean method24620() {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		return this.aClass570_23.aBooleanArrayArray20[this.aClass570_23.anInt5244 * 1989483179 + (((int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5241 * 1611671173)][this.aClass570_23.anInt5244 * 1989483179 + (((int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5253 * 1105662773)];
	}

	@OriginalMember(owner = "client!asc", name = "hp", descriptor = "(Lclient!di;)Z")
	@Override
	final boolean method24617(@OriginalArg(0) Class102 arg0) {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		@Pc(28) Class594 local28 = this.aClass570_23.method31575(this.aByte100, (int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119, (int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119, 35632);
		return local28 != null && local28.aClass120_Sub1_Sub1_1.aBoolean669 ? this.aClass570_23.aClass600_1.method32075(this.aByte100, (int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119, (int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119, local28.aClass120_Sub1_Sub1_1.method24578(1751298505) + this.method24578(639780598)) : this.aClass570_23.aClass600_1.method32064(this.aByte100, (int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119, (int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119);
	}
}
