package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqd")
public final class Class80_Sub28_Sub1 extends Class80_Sub28 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!aqd", name = "this$0", descriptor = "Lclient!kt;")
	final Class387 aClass387_1;

	@OriginalMember(owner = "client!aqd", name = "u", descriptor = "J")
	long aLong158;

	@OriginalMember(owner = "client!aqd", name = "l", descriptor = "Ljava/lang/String;")
	String aString76;

	@OriginalMember(owner = "client!aqd", name = "<init>", descriptor = "(Lclient!kt;)V")
	Class80_Sub28_Sub1(@OriginalArg(0) Class387 arg0) {
		this.aClass387_1 = arg0;
		this.aLong158 = -5061050966568184749L;
		this.aString76 = null;
	}

	@OriginalMember(owner = "client!aqd", name = "e", descriptor = "(Lclient!ald;)V")
	@Override
	void method22225(@OriginalArg(0) Packet arg0) {
		if (arg0.g1() != 255) {
			arg0.pos -= 1034180571;
			this.aLong158 = arg0.g8() * 5061050966568184749L;
		}
		this.aString76 = arg0.fastgstr();
	}

	@OriginalMember(owner = "client!aqd", name = "t", descriptor = "(Lclient!ald;B)V")
	@Override
	void method22223(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		if (arg0.g1() != 255) {
			arg0.pos -= 1034180571;
			this.aLong158 = arg0.g8() * 5061050966568184749L;
		}
		this.aString76 = arg0.fastgstr();
	}

	@OriginalMember(owner = "client!aqd", name = "f", descriptor = "(Lclient!kf;I)V")
	@Override
	void method22222(@OriginalArg(0) Class378 arg0, @OriginalArg(1) int arg1) {
		arg0.method28508(this.aLong158 * 7457118469006356517L, this.aString76, 0, (byte) -96);
	}

	@OriginalMember(owner = "client!aqd", name = "g", descriptor = "(Lclient!kf;)V")
	@Override
	void method22227(@OriginalArg(0) Class378 arg0) {
		arg0.method28508(this.aLong158 * 7457118469006356517L, this.aString76, 0, (byte) 32);
	}

	@OriginalMember(owner = "client!aqd", name = "l", descriptor = "(Lclient!ald;)V")
	@Override
	void method22224(@OriginalArg(0) Packet arg0) {
		if (arg0.g1() != 255) {
			arg0.pos -= 1034180571;
			this.aLong158 = arg0.g8() * 5061050966568184749L;
		}
		this.aString76 = arg0.fastgstr();
	}

	@OriginalMember(owner = "client!aqd", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	void method22226(@OriginalArg(0) Packet arg0) {
		if (arg0.g1() != 255) {
			arg0.pos -= 1034180571;
			this.aLong158 = arg0.g8() * 5061050966568184749L;
		}
		this.aString76 = arg0.fastgstr();
	}
}
