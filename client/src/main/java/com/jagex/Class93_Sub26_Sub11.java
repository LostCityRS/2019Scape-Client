package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!art")
public class Class93_Sub26_Sub11 extends Class93_Sub26 {

	@OriginalMember(owner = "client!art", name = "k", descriptor = "I")
	int anInt3040;

	@OriginalMember(owner = "client!art", name = "f", descriptor = "I")
	int anInt3041;

	// $FF: synthetic field
	@OriginalMember(owner = "client!art", name = "this$0", descriptor = "Lclient!kd;")
	final Class375 this$0;

	@OriginalMember(owner = "client!art", name = "<init>", descriptor = "(Lclient!kd;)V", line = 255)
	Class93_Sub26_Sub11(@OriginalArg(0) Class375 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!art", name = "e", descriptor = "(Lclient!alw;B)V", line = 258)
	@Override
	void method21992(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		this.anInt3040 = arg0.g4(-118643075) * 747782121;
		this.anInt3041 = arg0.g4(-118643075) * -1756715163;
	}

	@OriginalMember(owner = "client!art", name = "m", descriptor = "(Lclient!alw;)V", line = 258)
	@Override
	void method21994(@OriginalArg(0) Packet arg0) {
		this.anInt3040 = arg0.g4(-118643075) * 747782121;
		this.anInt3041 = arg0.g4(-118643075) * -1756715163;
	}

	@OriginalMember(owner = "client!art", name = "n", descriptor = "(Lclient!kr;I)V", line = 263)
	@Override
	void method21993(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		arg0.method28214(this.anInt3040 * -1458272167, this.anInt3041 * 849425005, -1322514559);
	}

	@OriginalMember(owner = "client!art", name = "k", descriptor = "(Lclient!kr;)V", line = 263)
	@Override
	void method21995(@OriginalArg(0) Class386 arg0) {
		arg0.method28214(this.anInt3040 * -1458272167, this.anInt3041 * 849425005, -1328927281);
	}

	@OriginalMember(owner = "client!art", name = "f", descriptor = "(Lclient!kr;)V", line = 263)
	@Override
	void method21991(@OriginalArg(0) Class386 arg0) {
		arg0.method28214(this.anInt3040 * -1458272167, this.anInt3041 * 849425005, -1494115294);
	}

	@OriginalMember(owner = "client!art", name = "w", descriptor = "(Lclient!kr;)V", line = 263)
	@Override
	void method21996(@OriginalArg(0) Class386 arg0) {
		arg0.method28214(this.anInt3040 * -1458272167, this.anInt3041 * 849425005, -881684525);
	}

	@OriginalMember(owner = "client!art", name = "aeq", descriptor = "(Lclient!yf;I)V", line = 10446)
	static final void method21915(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Math.abs(local12);
	}
}
