package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arc")
public final class Class93_Sub26_Sub3 extends Class93_Sub26 {

	@OriginalMember(owner = "client!arc", name = "r", descriptor = "I")
	static int anInt2999;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arc", name = "this$0", descriptor = "Lclient!kd;")
	final Class375 aClass375_3;

	@OriginalMember(owner = "client!arc", name = "k", descriptor = "J")
	long aLong138;

	@OriginalMember(owner = "client!arc", name = "f", descriptor = "Ljava/lang/String;")
	String aString93;

	@OriginalMember(owner = "client!arc", name = "w", descriptor = "I")
	int anInt2998;

	@OriginalMember(owner = "client!arc", name = "<init>", descriptor = "(Lclient!kd;)V")
	Class93_Sub26_Sub3(@OriginalArg(0) Class375 arg0) {
		this.aClass375_3 = arg0;
		this.aLong138 = -2340805484773300139L;
		this.aString93 = null;
		this.anInt2998 = 0;
	}

	@OriginalMember(owner = "client!arc", name = "e", descriptor = "(Lclient!alw;B)V")
	@Override
	void method22003(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		if (arg0.method22425((short) 16384) != 255) {
			arg0.anInt3070 -= -1445626955;
			this.aLong138 = arg0.method22435(-1704112608) * 2340805484773300139L;
		}
		this.aString93 = arg0.method22438((byte) 5);
		this.anInt2998 = arg0.method22427(-1434290800) * -208430505;
	}

	@OriginalMember(owner = "client!arc", name = "n", descriptor = "(Lclient!kr;I)V")
	@Override
	void method22004(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		arg0.method28352(this.aLong138 * 6917164260611681027L, this.aString93, this.anInt2998 * -828903065, (byte) -119);
	}

	@OriginalMember(owner = "client!arc", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	void method22005(@OriginalArg(0) Class93_Sub41 arg0) {
		if (arg0.method22425((short) 16384) != 255) {
			arg0.anInt3070 -= -1445626955;
			this.aLong138 = arg0.method22435(965331828) * 2340805484773300139L;
		}
		this.aString93 = arg0.method22438((byte) 22);
		this.anInt2998 = arg0.method22427(-1434290800) * -208430505;
	}

	@OriginalMember(owner = "client!arc", name = "k", descriptor = "(Lclient!kr;)V")
	@Override
	void method22006(@OriginalArg(0) Class386 arg0) {
		arg0.method28352(this.aLong138 * 6917164260611681027L, this.aString93, this.anInt2998 * -828903065, (byte) -18);
	}

	@OriginalMember(owner = "client!arc", name = "f", descriptor = "(Lclient!kr;)V")
	@Override
	void method22002(@OriginalArg(0) Class386 arg0) {
		arg0.method28352(this.aLong138 * 6917164260611681027L, this.aString93, this.anInt2998 * -828903065, (byte) -67);
	}

	@OriginalMember(owner = "client!arc", name = "w", descriptor = "(Lclient!kr;)V")
	@Override
	void method22007(@OriginalArg(0) Class386 arg0) {
		arg0.method28352(this.aLong138 * 6917164260611681027L, this.aString93, this.anInt2998 * -828903065, (byte) -90);
	}
}
