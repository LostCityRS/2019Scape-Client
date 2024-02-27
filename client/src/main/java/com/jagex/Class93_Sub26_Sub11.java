package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!art")
public final class Class93_Sub26_Sub11 extends Class93_Sub26 {

	@OriginalMember(owner = "client!art", name = "k", descriptor = "I")
	int anInt3040;

	@OriginalMember(owner = "client!art", name = "f", descriptor = "I")
	int anInt3041;

	// $FF: synthetic field
	@OriginalMember(owner = "client!art", name = "this$0", descriptor = "Lclient!kd;")
	final Class375 aClass375_11;

	@OriginalMember(owner = "client!art", name = "aeq", descriptor = "(Lclient!yf;I)V")
	static void method21927(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Math.abs(local12);
	}

	@OriginalMember(owner = "client!art", name = "<init>", descriptor = "(Lclient!kd;)V")
	Class93_Sub26_Sub11(@OriginalArg(0) Class375 arg0) {
		this.aClass375_11 = arg0;
	}

	@OriginalMember(owner = "client!art", name = "e", descriptor = "(Lclient!alw;B)V")
	@Override
	void method22003(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		this.anInt3040 = arg0.method22431(-118643075) * 747782121;
		this.anInt3041 = arg0.method22431(-118643075) * -1756715163;
	}

	@OriginalMember(owner = "client!art", name = "n", descriptor = "(Lclient!kr;I)V")
	@Override
	void method22004(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		arg0.method28360(this.anInt3040 * -1458272167, this.anInt3041 * 849425005, -1322514559);
	}

	@OriginalMember(owner = "client!art", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	void method22005(@OriginalArg(0) Class93_Sub41 arg0) {
		this.anInt3040 = arg0.method22431(-118643075) * 747782121;
		this.anInt3041 = arg0.method22431(-118643075) * -1756715163;
	}

	@OriginalMember(owner = "client!art", name = "k", descriptor = "(Lclient!kr;)V")
	@Override
	void method22006(@OriginalArg(0) Class386 arg0) {
		arg0.method28360(this.anInt3040 * -1458272167, this.anInt3041 * 849425005, -1328927281);
	}

	@OriginalMember(owner = "client!art", name = "f", descriptor = "(Lclient!kr;)V")
	@Override
	void method22002(@OriginalArg(0) Class386 arg0) {
		arg0.method28360(this.anInt3040 * -1458272167, this.anInt3041 * 849425005, -1494115294);
	}

	@OriginalMember(owner = "client!art", name = "w", descriptor = "(Lclient!kr;)V")
	@Override
	void method22007(@OriginalArg(0) Class386 arg0) {
		arg0.method28360(this.anInt3040 * -1458272167, this.anInt3041 * 849425005, -881684525);
	}
}
