package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arw")
public class Class93_Sub26_Sub12 extends Class93_Sub26 {

	@OriginalMember(owner = "client!arw", name = "k", descriptor = "I")
	int anInt3045;

	@OriginalMember(owner = "client!arw", name = "f", descriptor = "I")
	int anInt3046;

	@OriginalMember(owner = "client!arw", name = "w", descriptor = "I")
	int anInt3047;

	@OriginalMember(owner = "client!arw", name = "l", descriptor = "I")
	int anInt3048;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arw", name = "this$0", descriptor = "Lclient!kd;")
	final Class375 this$0;

	@OriginalMember(owner = "client!arw", name = "n", descriptor = "(I)V", line = 56)
	public static void method21966(@OriginalArg(0) int arg0) {
		Class693.method36608(376773936);
	}

	@OriginalMember(owner = "client!arw", name = "<init>", descriptor = "(Lclient!kd;)V", line = 273)
	Class93_Sub26_Sub12(@OriginalArg(0) Class375 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!arw", name = "e", descriptor = "(Lclient!alw;B)V", line = 276)
	@Override
	void method21992(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		this.anInt3045 = arg0.g4(-118643075) * -816528735;
		this.anInt3048 = arg0.g4(-118643075) * 919823425;
		this.anInt3046 = arg0.g1((short) 16384) * 753735407;
		this.anInt3047 = arg0.g1((short) 16384) * -338683681;
	}

	@OriginalMember(owner = "client!arw", name = "m", descriptor = "(Lclient!alw;)V", line = 276)
	@Override
	void method21994(@OriginalArg(0) Packet arg0) {
		this.anInt3045 = arg0.g4(-118643075) * -816528735;
		this.anInt3048 = arg0.g4(-118643075) * 919823425;
		this.anInt3046 = arg0.g1((short) 16384) * 753735407;
		this.anInt3047 = arg0.g1((short) 16384) * -338683681;
	}

	@OriginalMember(owner = "client!arw", name = "k", descriptor = "(Lclient!kr;)V", line = 283)
	@Override
	void method21995(@OriginalArg(0) Class386 arg0) {
		arg0.method28219(this.anInt3045 * 1805361505, this.anInt3048 * 69905345, this.anInt3046 * -1990273009, this.anInt3047 * -1846959329, 1051756914);
	}

	@OriginalMember(owner = "client!arw", name = "n", descriptor = "(Lclient!kr;I)V", line = 283)
	@Override
	void method21993(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		arg0.method28219(this.anInt3045 * 1805361505, this.anInt3048 * 69905345, this.anInt3046 * -1990273009, this.anInt3047 * -1846959329, 1705298767);
	}

	@OriginalMember(owner = "client!arw", name = "w", descriptor = "(Lclient!kr;)V", line = 283)
	@Override
	void method21996(@OriginalArg(0) Class386 arg0) {
		arg0.method28219(this.anInt3045 * 1805361505, this.anInt3048 * 69905345, this.anInt3046 * -1990273009, this.anInt3047 * -1846959329, -562451589);
	}

	@OriginalMember(owner = "client!arw", name = "f", descriptor = "(Lclient!kr;)V", line = 283)
	@Override
	void method21991(@OriginalArg(0) Class386 arg0) {
		arg0.method28219(this.anInt3045 * 1805361505, this.anInt3048 * 69905345, this.anInt3046 * -1990273009, this.anInt3047 * -1846959329, 2119644674);
	}
}
