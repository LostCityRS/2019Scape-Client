package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arf")
public final class Class93_Sub31_Sub1 extends Class93_Sub31 {

	@OriginalMember(owner = "client!arf", name = "f", descriptor = "B")
	byte aByte78;

	@OriginalMember(owner = "client!arf", name = "k", descriptor = "Ljava/lang/String;")
	String aString95;

	@OriginalMember(owner = "client!arf", name = "w", descriptor = "B")
	byte aByte79;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arf", name = "this$0", descriptor = "Lclient!kc;")
	final Class374 aClass374_1;

	@OriginalMember(owner = "client!arf", name = "<init>", descriptor = "(Lclient!kc;)V")
	Class93_Sub31_Sub1(@OriginalArg(0) Class374 arg0) {
		this.aClass374_1 = arg0;
	}

	@OriginalMember(owner = "client!arf", name = "f", descriptor = "(Lclient!akr;)V")
	@Override
	void method22020(@OriginalArg(0) Class93_Sub28 arg0) {
		arg0.aString44 = this.aString95;
		if (this.aString95 != null) {
			arg0.aByte55 = this.aByte78;
			arg0.aByte56 = this.aByte79;
		}
	}

	@OriginalMember(owner = "client!arf", name = "e", descriptor = "(Lclient!alw;I)V")
	@Override
	void method22023(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aString95 = arg0.method22438((byte) 67);
		if (this.aString95 != null) {
			arg0.method22425((short) 16384);
			this.aByte78 = arg0.method22426(979793910);
			this.aByte79 = arg0.method22426(734349756);
		}
	}

	@OriginalMember(owner = "client!arf", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	void method22018(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aString95 = arg0.method22438((byte) 62);
		if (this.aString95 != null) {
			arg0.method22425((short) 16384);
			this.aByte78 = arg0.method22426(1950133705);
			this.aByte79 = arg0.method22426(2065458583);
		}
	}

	@OriginalMember(owner = "client!arf", name = "k", descriptor = "(Lclient!akr;)V")
	@Override
	void method22021(@OriginalArg(0) Class93_Sub28 arg0) {
		arg0.aString44 = this.aString95;
		if (this.aString95 != null) {
			arg0.aByte55 = this.aByte78;
			arg0.aByte56 = this.aByte79;
		}
	}

	@OriginalMember(owner = "client!arf", name = "w", descriptor = "(Lclient!akr;)V")
	@Override
	void method22022(@OriginalArg(0) Class93_Sub28 arg0) {
		arg0.aString44 = this.aString95;
		if (this.aString95 != null) {
			arg0.aByte55 = this.aByte78;
			arg0.aByte56 = this.aByte79;
		}
	}

	@OriginalMember(owner = "client!arf", name = "n", descriptor = "(Lclient!akr;S)V")
	@Override
	void method22019(@OriginalArg(0) Class93_Sub28 arg0, @OriginalArg(1) short arg1) {
		arg0.aString44 = this.aString95;
		if (this.aString95 != null) {
			arg0.aByte55 = this.aByte78;
			arg0.aByte56 = this.aByte79;
		}
	}
}
