package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqj")
public final class Class93_Sub26_Sub1 extends Class93_Sub26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!aqj", name = "this$0", descriptor = "Lclient!kd;")
	final Class375 aClass375_1;

	@OriginalMember(owner = "client!aqj", name = "k", descriptor = "J")
	long aLong128;

	@OriginalMember(owner = "client!aqj", name = "f", descriptor = "Ljava/lang/String;")
	String aString79;

	@OriginalMember(owner = "client!aqj", name = "<init>", descriptor = "(Lclient!kd;)V")
	Class93_Sub26_Sub1(@OriginalArg(0) Class375 arg0) {
		this.aClass375_1 = arg0;
		this.aLong128 = 1014359124195652595L;
		this.aString79 = null;
	}

	@OriginalMember(owner = "client!aqj", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	void method22005(@OriginalArg(0) Class93_Sub41 arg0) {
		if (arg0.method22425((short) 16384) != 255) {
			arg0.anInt3070 -= -1445626955;
			this.aLong128 = arg0.method22435(1741130582) * -1014359124195652595L;
		}
		this.aString79 = arg0.method22438((byte) 84);
	}

	@OriginalMember(owner = "client!aqj", name = "e", descriptor = "(Lclient!alw;B)V")
	@Override
	void method22003(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		if (arg0.method22425((short) 16384) != 255) {
			arg0.anInt3070 -= -1445626955;
			this.aLong128 = arg0.method22435(1184633240) * -1014359124195652595L;
		}
		this.aString79 = arg0.method22438((byte) 124);
	}

	@OriginalMember(owner = "client!aqj", name = "n", descriptor = "(Lclient!kr;I)V")
	@Override
	void method22004(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		arg0.method28352(this.aLong128 * -2489724215546682683L, this.aString79, 0, (byte) -99);
	}

	@OriginalMember(owner = "client!aqj", name = "k", descriptor = "(Lclient!kr;)V")
	@Override
	void method22006(@OriginalArg(0) Class386 arg0) {
		arg0.method28352(this.aLong128 * -2489724215546682683L, this.aString79, 0, (byte) -48);
	}

	@OriginalMember(owner = "client!aqj", name = "f", descriptor = "(Lclient!kr;)V")
	@Override
	void method22002(@OriginalArg(0) Class386 arg0) {
		arg0.method28352(this.aLong128 * -2489724215546682683L, this.aString79, 0, (byte) -24);
	}

	@OriginalMember(owner = "client!aqj", name = "w", descriptor = "(Lclient!kr;)V")
	@Override
	void method22007(@OriginalArg(0) Class386 arg0) {
		arg0.method28352(this.aLong128 * -2489724215546682683L, this.aString79, 0, (byte) -94);
	}
}
