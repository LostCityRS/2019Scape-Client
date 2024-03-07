package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arx")
public class Class93_Sub26_Sub13 extends Class93_Sub26 {

	@OriginalMember(owner = "client!arx", name = "f", descriptor = "Z")
	boolean aBoolean507;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arx", name = "this$0", descriptor = "Lclient!kd;")
	final Class375 this$0;

	@OriginalMember(owner = "client!arx", name = "k", descriptor = "I")
	int anInt3049;

	@OriginalMember(owner = "client!arx", name = "<init>", descriptor = "(Lclient!kd;)V", line = 165)
	Class93_Sub26_Sub13(@OriginalArg(0) Class375 arg0) {
		this.this$0 = arg0;
		this.anInt3049 = 1415942809;
	}

	@OriginalMember(owner = "client!arx", name = "m", descriptor = "(Lclient!alw;)V", line = 168)
	@Override
	void method21994(@OriginalArg(0) Packet arg0) {
		this.anInt3049 = arg0.g2(-1434290800) * -1415942809;
		this.aBoolean507 = arg0.g1((short) 16384) == 1;
	}

	@OriginalMember(owner = "client!arx", name = "e", descriptor = "(Lclient!alw;B)V", line = 168)
	@Override
	void method21992(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		this.anInt3049 = arg0.g2(-1434290800) * -1415942809;
		this.aBoolean507 = arg0.g1((short) 16384) == 1;
	}

	@OriginalMember(owner = "client!arx", name = "k", descriptor = "(Lclient!kr;)V", line = 173)
	@Override
	void method21995(@OriginalArg(0) Class386 arg0) {
		arg0.method28209(this.anInt3049 * -1036034473, this.aBoolean507, (byte) -16);
	}

	@OriginalMember(owner = "client!arx", name = "w", descriptor = "(Lclient!kr;)V", line = 173)
	@Override
	void method21996(@OriginalArg(0) Class386 arg0) {
		arg0.method28209(this.anInt3049 * -1036034473, this.aBoolean507, (byte) -4);
	}

	@OriginalMember(owner = "client!arx", name = "n", descriptor = "(Lclient!kr;I)V", line = 173)
	@Override
	void method21993(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		arg0.method28209(this.anInt3049 * -1036034473, this.aBoolean507, (byte) 6);
	}

	@OriginalMember(owner = "client!arx", name = "f", descriptor = "(Lclient!kr;)V", line = 173)
	@Override
	void method21991(@OriginalArg(0) Class386 arg0) {
		arg0.method28209(this.anInt3049 * -1036034473, this.aBoolean507, (byte) -11);
	}
}
