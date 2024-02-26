package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arf")
public final class Class80_Sub26_Sub3 extends Class80_Sub26 {

	@OriginalMember(owner = "client!arf", name = "l", descriptor = "B")
	byte aByte79;

	@OriginalMember(owner = "client!arf", name = "u", descriptor = "Ljava/lang/String;")
	String aString99;

	@OriginalMember(owner = "client!arf", name = "g", descriptor = "B")
	byte aByte80;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arf", name = "this$0", descriptor = "Lclient!kq;")
	final Class385 aClass385_3;

	@OriginalMember(owner = "client!arf", name = "<init>", descriptor = "(Lclient!kq;)V")
	Class80_Sub26_Sub3(@OriginalArg(0) Class385 arg0) {
		this.aClass385_3 = arg0;
	}

	@OriginalMember(owner = "client!arf", name = "t", descriptor = "(Lclient!ald;B)V")
	@Override
	void method22253(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) byte arg1) {
		this.aString99 = arg0.method23189(-761473881);
		if (this.aString99 != null) {
			arg0.method23362(-1907622892);
			this.aByte79 = arg0.method23177((byte) -27);
			this.aByte80 = arg0.method23177((byte) 21);
		}
	}

	@OriginalMember(owner = "client!arf", name = "f", descriptor = "(Lclient!akv;I)V")
	@Override
	void method22257(@OriginalArg(0) Class80_Sub32 arg0, @OriginalArg(1) int arg1) {
		arg0.aString52 = this.aString99;
		if (this.aString99 != null) {
			arg0.aByte55 = this.aByte79;
			arg0.aByte56 = this.aByte80;
		}
	}

	@OriginalMember(owner = "client!arf", name = "u", descriptor = "(Lclient!akv;)V")
	@Override
	void method22256(@OriginalArg(0) Class80_Sub32 arg0) {
		arg0.aString52 = this.aString99;
		if (this.aString99 != null) {
			arg0.aByte55 = this.aByte79;
			arg0.aByte56 = this.aByte80;
		}
	}

	@OriginalMember(owner = "client!arf", name = "e", descriptor = "(Lclient!ald;)V")
	@Override
	void method22255(@OriginalArg(0) Class80_Sub36 arg0) {
		this.aString99 = arg0.method23189(-761473881);
		if (this.aString99 != null) {
			arg0.method23362(-554610569);
			this.aByte79 = arg0.method23177((byte) -77);
			this.aByte80 = arg0.method23177((byte) 1);
		}
	}

	@OriginalMember(owner = "client!arf", name = "l", descriptor = "(Lclient!akv;)V")
	@Override
	void method22254(@OriginalArg(0) Class80_Sub32 arg0) {
		arg0.aString52 = this.aString99;
		if (this.aString99 != null) {
			arg0.aByte55 = this.aByte79;
			arg0.aByte56 = this.aByte80;
		}
	}
}
