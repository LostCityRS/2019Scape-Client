package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arc")
public final class Class80_Sub28_Sub2 extends Class80_Sub28 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!arc", name = "this$0", descriptor = "Lclient!kt;")
	final Class387 aClass387_2;

	@OriginalMember(owner = "client!arc", name = "u", descriptor = "J")
	long aLong189;

	@OriginalMember(owner = "client!arc", name = "l", descriptor = "Ljava/lang/String;")
	String aString97;

	@OriginalMember(owner = "client!arc", name = "t", descriptor = "(II)Lclient!aly;")
	public static Class163_Sub1 method21750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Class635.aBoolean959 && arg0 >= Class635.anInt5596 * 828983813 && arg0 <= Class635.anInt5600 * 1540152885 ? Class635.aClass163_Sub1Array2[arg0 - Class635.anInt5596 * 828983813] : null;
	}

	@OriginalMember(owner = "client!arc", name = "<init>", descriptor = "(Lclient!kt;)V")
	Class80_Sub28_Sub2(@OriginalArg(0) Class387 arg0) {
		this.aClass387_2 = arg0;
		this.aLong189 = -1628659081804031337L;
		this.aString97 = null;
	}

	@OriginalMember(owner = "client!arc", name = "e", descriptor = "(Lclient!ald;)V")
	@Override
	void method22225(@OriginalArg(0) Packet arg0) {
		if (arg0.g1() != 255) {
			arg0.pos -= 1034180571;
			this.aLong189 = arg0.g8() * 1628659081804031337L;
		}
		this.aString97 = arg0.fastgstr();
	}

	@OriginalMember(owner = "client!arc", name = "t", descriptor = "(Lclient!ald;B)V")
	@Override
	void method22223(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		if (arg0.g1() != 255) {
			arg0.pos -= 1034180571;
			this.aLong189 = arg0.g8() * 1628659081804031337L;
		}
		this.aString97 = arg0.fastgstr();
	}

	@OriginalMember(owner = "client!arc", name = "f", descriptor = "(Lclient!kf;I)V")
	@Override
	void method22222(@OriginalArg(0) Class378 arg0, @OriginalArg(1) int arg1) {
		arg0.method28489(this.aLong189 * 503895644998875865L, this.aString97, 21029236);
	}

	@OriginalMember(owner = "client!arc", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	void method22226(@OriginalArg(0) Packet arg0) {
		if (arg0.g1() != 255) {
			arg0.pos -= 1034180571;
			this.aLong189 = arg0.g8() * 1628659081804031337L;
		}
		this.aString97 = arg0.fastgstr();
	}

	@OriginalMember(owner = "client!arc", name = "l", descriptor = "(Lclient!ald;)V")
	@Override
	void method22224(@OriginalArg(0) Packet arg0) {
		if (arg0.g1() != 255) {
			arg0.pos -= 1034180571;
			this.aLong189 = arg0.g8() * 1628659081804031337L;
		}
		this.aString97 = arg0.fastgstr();
	}

	@OriginalMember(owner = "client!arc", name = "g", descriptor = "(Lclient!kf;)V")
	@Override
	void method22227(@OriginalArg(0) Class378 arg0) {
		arg0.method28489(this.aLong189 * 503895644998875865L, this.aString97, -491961414);
	}
}
