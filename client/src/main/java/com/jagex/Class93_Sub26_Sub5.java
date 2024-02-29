package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arg")
public class Class93_Sub26_Sub5 extends Class93_Sub26 {

	@OriginalMember(owner = "client!arg", name = "k", descriptor = "I")
	int anInt3004;

	@OriginalMember(owner = "client!arg", name = "f", descriptor = "J")
	long aLong145;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arg", name = "this$0", descriptor = "Lclient!kd;")
	final Class375 this$0;

	@OriginalMember(owner = "client!arg", name = "<init>", descriptor = "(Lclient!kd;)V", line = 291)
	Class93_Sub26_Sub5(@OriginalArg(0) Class375 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!arg", name = "m", descriptor = "(Lclient!alw;)V", line = 294)
	@Override
	void method21994(@OriginalArg(0) Class93_Sub41 arg0) {
		this.anInt3004 = arg0.method22483(-118643075) * -839262427;
		this.aLong145 = arg0.method22495(553203210) * -16360172209341971L;
	}

	@OriginalMember(owner = "client!arg", name = "e", descriptor = "(Lclient!alw;B)V", line = 294)
	@Override
	void method21992(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		this.anInt3004 = arg0.method22483(-118643075) * -839262427;
		this.aLong145 = arg0.method22495(-1241256000) * -16360172209341971L;
	}

	@OriginalMember(owner = "client!arg", name = "w", descriptor = "(Lclient!kr;)V", line = 299)
	@Override
	void method21996(@OriginalArg(0) Class386 arg0) {
		arg0.method28223(this.anInt3004 * -775478099, this.aLong145 * -2720073271959761947L);
	}

	@OriginalMember(owner = "client!arg", name = "n", descriptor = "(Lclient!kr;I)V", line = 299)
	@Override
	void method21993(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		arg0.method28223(this.anInt3004 * -775478099, this.aLong145 * -2720073271959761947L);
	}

	@OriginalMember(owner = "client!arg", name = "k", descriptor = "(Lclient!kr;)V", line = 299)
	@Override
	void method21995(@OriginalArg(0) Class386 arg0) {
		arg0.method28223(this.anInt3004 * -775478099, this.aLong145 * -2720073271959761947L);
	}

	@OriginalMember(owner = "client!arg", name = "f", descriptor = "(Lclient!kr;)V", line = 299)
	@Override
	void method21991(@OriginalArg(0) Class386 arg0) {
		arg0.method28223(this.anInt3004 * -775478099, this.aLong145 * -2720073271959761947L);
	}
}
