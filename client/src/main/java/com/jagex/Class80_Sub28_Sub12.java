package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aru")
public final class Class80_Sub28_Sub12 extends Class80_Sub28 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!aru", name = "this$0", descriptor = "Lclient!kt;")
	final Class387 aClass387_12;

	@OriginalMember(owner = "client!aru", name = "u", descriptor = "J")
	long aLong235;

	@OriginalMember(owner = "client!aru", name = "l", descriptor = "Ljava/lang/String;")
	String aString103;

	@OriginalMember(owner = "client!aru", name = "g", descriptor = "I")
	int anInt3070;

	@OriginalMember(owner = "client!aru", name = "<init>", descriptor = "(Lclient!kt;)V")
	Class80_Sub28_Sub12(@OriginalArg(0) Class387 arg0) {
		this.aClass387_12 = arg0;
		this.aLong235 = 337630654457545291L;
		this.aString103 = null;
		this.anInt3070 = 0;
	}

	@OriginalMember(owner = "client!aru", name = "t", descriptor = "(Lclient!ald;B)V")
	@Override
	void method22223(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		if (arg0.g1() != 255) {
			arg0.pos -= 1034180571;
			this.aLong235 = arg0.g8() * -337630654457545291L;
		}
		this.aString103 = arg0.fastgstr();
		this.anInt3070 = arg0.g2() * -1402547767;
	}

	@OriginalMember(owner = "client!aru", name = "l", descriptor = "(Lclient!ald;)V")
	@Override
	void method22224(@OriginalArg(0) Packet arg0) {
		if (arg0.g1() != 255) {
			arg0.pos -= 1034180571;
			this.aLong235 = arg0.g8() * -337630654457545291L;
		}
		this.aString103 = arg0.fastgstr();
		this.anInt3070 = arg0.g2() * -1402547767;
	}

	@OriginalMember(owner = "client!aru", name = "f", descriptor = "(Lclient!kf;I)V")
	@Override
	void method22222(@OriginalArg(0) Class378 arg0, @OriginalArg(1) int arg1) {
		arg0.method28508(this.aLong235 * 8400743911844366493L, this.aString103, this.anInt3070 * 1608259705, (byte) 42);
	}

	@OriginalMember(owner = "client!aru", name = "e", descriptor = "(Lclient!ald;)V")
	@Override
	void method22225(@OriginalArg(0) Packet arg0) {
		if (arg0.g1() != 255) {
			arg0.pos -= 1034180571;
			this.aLong235 = arg0.g8() * -337630654457545291L;
		}
		this.aString103 = arg0.fastgstr();
		this.anInt3070 = arg0.g2() * -1402547767;
	}

	@OriginalMember(owner = "client!aru", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	void method22226(@OriginalArg(0) Packet arg0) {
		if (arg0.g1() != 255) {
			arg0.pos -= 1034180571;
			this.aLong235 = arg0.g8() * -337630654457545291L;
		}
		this.aString103 = arg0.fastgstr();
		this.anInt3070 = arg0.g2() * -1402547767;
	}

	@OriginalMember(owner = "client!aru", name = "g", descriptor = "(Lclient!kf;)V")
	@Override
	void method22227(@OriginalArg(0) Class378 arg0) {
		arg0.method28508(this.aLong235 * 8400743911844366493L, this.aString103, this.anInt3070 * 1608259705, (byte) -63);
	}
}
