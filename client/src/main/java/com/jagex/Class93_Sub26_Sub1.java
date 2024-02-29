package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqj")
public class Class93_Sub26_Sub1 extends Class93_Sub26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!aqj", name = "this$0", descriptor = "Lclient!kd;")
	final Class375 this$0;

	@OriginalMember(owner = "client!aqj", name = "k", descriptor = "J")
	long aLong128;

	@OriginalMember(owner = "client!aqj", name = "f", descriptor = "Ljava/lang/String;")
	String aString79;

	@OriginalMember(owner = "client!aqj", name = "<init>", descriptor = "(Lclient!kd;)V", line = 75)
	Class93_Sub26_Sub1(@OriginalArg(0) Class375 arg0) {
		this.this$0 = arg0;
		this.aLong128 = 1014359124195652595L;
		this.aString79 = null;
	}

	@OriginalMember(owner = "client!aqj", name = "m", descriptor = "(Lclient!alw;)V", line = 78)
	@Override
	void method21994(@OriginalArg(0) Class93_Sub41 arg0) {
		if (arg0.method22465((short) 16384) != 255) {
			arg0.anInt3070 -= -1445626955;
			this.aLong128 = arg0.method22495(1741130582) * -1014359124195652595L;
		}
		this.aString79 = arg0.method22507((byte) 84);
	}

	@OriginalMember(owner = "client!aqj", name = "e", descriptor = "(Lclient!alw;B)V", line = 78)
	@Override
	void method21992(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		if (arg0.method22465((short) 16384) != 255) {
			arg0.anInt3070 -= -1445626955;
			this.aLong128 = arg0.method22495(1184633240) * -1014359124195652595L;
		}
		this.aString79 = arg0.method22507((byte) 124);
	}

	@OriginalMember(owner = "client!aqj", name = "n", descriptor = "(Lclient!kr;I)V", line = 86)
	@Override
	void method21993(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		arg0.method28188(this.aLong128 * -2489724215546682683L, this.aString79, 0, (byte) -99);
	}

	@OriginalMember(owner = "client!aqj", name = "k", descriptor = "(Lclient!kr;)V", line = 86)
	@Override
	void method21995(@OriginalArg(0) Class386 arg0) {
		arg0.method28188(this.aLong128 * -2489724215546682683L, this.aString79, 0, (byte) -48);
	}

	@OriginalMember(owner = "client!aqj", name = "f", descriptor = "(Lclient!kr;)V", line = 86)
	@Override
	void method21991(@OriginalArg(0) Class386 arg0) {
		arg0.method28188(this.aLong128 * -2489724215546682683L, this.aString79, 0, (byte) -24);
	}

	@OriginalMember(owner = "client!aqj", name = "w", descriptor = "(Lclient!kr;)V", line = 86)
	@Override
	void method21996(@OriginalArg(0) Class386 arg0) {
		arg0.method28188(this.aLong128 * -2489724215546682683L, this.aString79, 0, (byte) -94);
	}
}
