package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaq")
public final class Class18 {

	@OriginalMember(owner = "client!aaq", name = "cd", descriptor = "Ljava/lang/String;")
	static String aString3;

	@OriginalMember(owner = "client!aaq", name = "t", descriptor = "I")
	int anInt53;

	@OriginalMember(owner = "client!aaq", name = "f", descriptor = "I")
	int anInt54;

	@OriginalMember(owner = "client!aaq", name = "e", descriptor = "Z")
	boolean aBoolean6;

	@OriginalMember(owner = "client!aaq", name = "u", descriptor = "Z")
	boolean aBoolean7;

	@OriginalMember(owner = "client!aaq", name = "l", descriptor = "Z")
	boolean aBoolean8;

	@OriginalMember(owner = "client!aaq", name = "avk", descriptor = "(Lclient!yp;I)V")
	static void method458(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!aaq", name = "yb", descriptor = "(Lclient!yp;I)V")
	static void method459(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class227.method25985(local12, false, 1421769614);
	}

	@OriginalMember(owner = "client!aaq", name = "apk", descriptor = "(Lclient!yp;I)V")
	static void method460(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		Class80_Sub31.method14418(local13, (byte) 1);
	}

	@OriginalMember(owner = "client!aaq", name = "<init>", descriptor = "(IIZZZ)V")
	Class18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt53 = arg0 * -1102022619;
		this.anInt54 = arg1 * -650573307;
		this.aBoolean6 = arg2;
		this.aBoolean7 = arg3;
		this.aBoolean8 = arg4;
	}

	@OriginalMember(owner = "client!aaq", name = "j", descriptor = "()Z")
	public boolean method440() {
		return this.aBoolean6;
	}

	@OriginalMember(owner = "client!aaq", name = "t", descriptor = "(I)I")
	public int method441(@OriginalArg(0) int arg0) {
		return this.anInt53 * -1512119379;
	}

	@OriginalMember(owner = "client!aaq", name = "f", descriptor = "(I)I")
	public int method442(@OriginalArg(0) int arg0) {
		return this.anInt54 * 1011233485;
	}

	@OriginalMember(owner = "client!aaq", name = "e", descriptor = "(I)Z")
	public boolean method443(@OriginalArg(0) int arg0) {
		return this.aBoolean6;
	}

	@OriginalMember(owner = "client!aaq", name = "u", descriptor = "(I)Z")
	public boolean method444(@OriginalArg(0) int arg0) {
		return this.aBoolean7;
	}

	@OriginalMember(owner = "client!aaq", name = "i", descriptor = "()I")
	public int method445() {
		return this.anInt53 * -1512119379;
	}

	@OriginalMember(owner = "client!aaq", name = "g", descriptor = "()I")
	public int method446() {
		return this.anInt53 * -1512119379;
	}

	@OriginalMember(owner = "client!aaq", name = "q", descriptor = "()Z")
	public boolean method447() {
		return this.aBoolean8;
	}

	@OriginalMember(owner = "client!aaq", name = "m", descriptor = "()I")
	public int method448() {
		return this.anInt54 * 1011233485;
	}

	@OriginalMember(owner = "client!aaq", name = "l", descriptor = "(I)Z")
	public boolean method449(@OriginalArg(0) int arg0) {
		return this.aBoolean8;
	}

	@OriginalMember(owner = "client!aaq", name = "a", descriptor = "()Z")
	public boolean method450() {
		return this.aBoolean6;
	}

	@OriginalMember(owner = "client!aaq", name = "s", descriptor = "()Z")
	public boolean method451() {
		return this.aBoolean6;
	}

	@OriginalMember(owner = "client!aaq", name = "k", descriptor = "()Z")
	public boolean method452() {
		return this.aBoolean7;
	}

	@OriginalMember(owner = "client!aaq", name = "x", descriptor = "()Z")
	public boolean method453() {
		return this.aBoolean7;
	}

	@OriginalMember(owner = "client!aaq", name = "w", descriptor = "()Z")
	public boolean method454() {
		return this.aBoolean7;
	}

	@OriginalMember(owner = "client!aaq", name = "r", descriptor = "()Z")
	public boolean method455() {
		return this.aBoolean7;
	}

	@OriginalMember(owner = "client!aaq", name = "o", descriptor = "()I")
	public int method456() {
		return this.anInt54 * 1011233485;
	}

	@OriginalMember(owner = "client!aaq", name = "h", descriptor = "()Z")
	public boolean method457() {
		return this.aBoolean8;
	}
}
