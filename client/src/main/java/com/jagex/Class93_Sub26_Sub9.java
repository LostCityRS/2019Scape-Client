package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aro")
public class Class93_Sub26_Sub9 extends Class93_Sub26 {

	@OriginalMember(owner = "client!aro", name = "f", descriptor = "Ljava/lang/String;")
	String aString102;

	@OriginalMember(owner = "client!aro", name = "k", descriptor = "I")
	int anInt3014;

	// $FF: synthetic field
	@OriginalMember(owner = "client!aro", name = "this$0", descriptor = "Lclient!kd;")
	final Class375 this$0;

	@OriginalMember(owner = "client!aro", name = "<init>", descriptor = "(Lclient!kd;)V", line = 307)
	Class93_Sub26_Sub9(@OriginalArg(0) Class375 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!aro", name = "e", descriptor = "(Lclient!alw;B)V", line = 310)
	@Override
	void method21992(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		this.anInt3014 = arg0.method22483(-118643075) * -2131198913;
		this.aString102 = arg0.method22509(736951303);
	}

	@OriginalMember(owner = "client!aro", name = "m", descriptor = "(Lclient!alw;)V", line = 310)
	@Override
	void method21994(@OriginalArg(0) Class93_Sub41 arg0) {
		this.anInt3014 = arg0.method22483(-118643075) * -2131198913;
		this.aString102 = arg0.method22509(938954467);
	}

	@OriginalMember(owner = "client!aro", name = "f", descriptor = "(Lclient!kr;)V", line = 315)
	@Override
	void method21991(@OriginalArg(0) Class386 arg0) {
		arg0.method28228(this.anInt3014 * 578122687, this.aString102, 1509242154);
	}

	@OriginalMember(owner = "client!aro", name = "n", descriptor = "(Lclient!kr;I)V", line = 315)
	@Override
	void method21993(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		arg0.method28228(this.anInt3014 * 578122687, this.aString102, 1145107619);
	}

	@OriginalMember(owner = "client!aro", name = "w", descriptor = "(Lclient!kr;)V", line = 315)
	@Override
	void method21996(@OriginalArg(0) Class386 arg0) {
		arg0.method28228(this.anInt3014 * 578122687, this.aString102, 427956740);
	}

	@OriginalMember(owner = "client!aro", name = "k", descriptor = "(Lclient!kr;)V", line = 315)
	@Override
	void method21995(@OriginalArg(0) Class386 arg0) {
		arg0.method28228(this.anInt3014 * 578122687, this.aString102, 186604697);
	}
}
