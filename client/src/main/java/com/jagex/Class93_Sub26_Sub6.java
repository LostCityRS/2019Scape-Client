package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ari")
public class Class93_Sub26_Sub6 extends Class93_Sub26 {

	@OriginalMember(owner = "client!ari", name = "ig", descriptor = "Lclient!adm;")
	public static Class79_Sub1_Sub2 aClass79_Sub1_Sub2_3;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ari", name = "this$0", descriptor = "Lclient!kd;")
	final Class375 this$0;

	@OriginalMember(owner = "client!ari", name = "k", descriptor = "I")
	int anInt3007;

	@OriginalMember(owner = "client!ari", name = "<init>", descriptor = "(Lclient!kd;)V", line = 114)
	Class93_Sub26_Sub6(@OriginalArg(0) Class375 arg0) {
		this.this$0 = arg0;
		this.anInt3007 = 1040572283;
	}

	@OriginalMember(owner = "client!ari", name = "m", descriptor = "(Lclient!alw;)V", line = 117)
	@Override
	void method21994(@OriginalArg(0) Packet arg0) {
		this.anInt3007 = arg0.g2(-1434290800) * -1040572283;
	}

	@OriginalMember(owner = "client!ari", name = "e", descriptor = "(Lclient!alw;B)V", line = 117)
	@Override
	void method21992(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		this.anInt3007 = arg0.g2(-1434290800) * -1040572283;
	}

	@OriginalMember(owner = "client!ari", name = "f", descriptor = "(Lclient!kr;)V", line = 121)
	@Override
	void method21991(@OriginalArg(0) Class386 arg0) {
		arg0.method28191(this.anInt3007 * -448473011, 242463394);
	}

	@OriginalMember(owner = "client!ari", name = "n", descriptor = "(Lclient!kr;I)V", line = 121)
	@Override
	void method21993(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		arg0.method28191(this.anInt3007 * -448473011, 1353883713);
	}

	@OriginalMember(owner = "client!ari", name = "k", descriptor = "(Lclient!kr;)V", line = 121)
	@Override
	void method21995(@OriginalArg(0) Class386 arg0) {
		arg0.method28191(this.anInt3007 * -448473011, -1707577054);
	}

	@OriginalMember(owner = "client!ari", name = "w", descriptor = "(Lclient!kr;)V", line = 121)
	@Override
	void method21996(@OriginalArg(0) Class386 arg0) {
		arg0.method28191(this.anInt3007 * -448473011, -1765568141);
	}
}
