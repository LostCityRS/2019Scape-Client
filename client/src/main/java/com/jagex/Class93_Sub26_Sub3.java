package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arc")
public class Class93_Sub26_Sub3 extends Class93_Sub26 {

	@OriginalMember(owner = "client!arc", name = "r", descriptor = "I")
	static int anInt2999;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arc", name = "this$0", descriptor = "Lclient!kd;")
	final Class375 this$0;

	@OriginalMember(owner = "client!arc", name = "k", descriptor = "J")
	long aLong138;

	@OriginalMember(owner = "client!arc", name = "f", descriptor = "Ljava/lang/String;")
	String aString93;

	@OriginalMember(owner = "client!arc", name = "w", descriptor = "I")
	int anInt2998;

	@OriginalMember(owner = "client!arc", name = "<init>", descriptor = "(Lclient!kd;)V", line = 95)
	Class93_Sub26_Sub3(@OriginalArg(0) Class375 arg0) {
		this.this$0 = arg0;
		this.aLong138 = -2340805484773300139L;
		this.aString93 = null;
		this.anInt2998 = 0;
	}

	@OriginalMember(owner = "client!arc", name = "e", descriptor = "(Lclient!alw;B)V", line = 98)
	@Override
	void method21992(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		if (arg0.g1((short) 16384) != 255) {
			arg0.pos -= -1445626955;
			this.aLong138 = arg0.g8(-1704112608) * 2340805484773300139L;
		}
		this.aString93 = arg0.fastgstr((byte) 5);
		this.anInt2998 = arg0.g2(-1434290800) * -208430505;
	}

	@OriginalMember(owner = "client!arc", name = "m", descriptor = "(Lclient!alw;)V", line = 98)
	@Override
	void method21994(@OriginalArg(0) Packet arg0) {
		if (arg0.g1((short) 16384) != 255) {
			arg0.pos -= -1445626955;
			this.aLong138 = arg0.g8(965331828) * 2340805484773300139L;
		}
		this.aString93 = arg0.fastgstr((byte) 22);
		this.anInt2998 = arg0.g2(-1434290800) * -208430505;
	}

	@OriginalMember(owner = "client!arc", name = "n", descriptor = "(Lclient!kr;I)V", line = 107)
	@Override
	void method21993(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		arg0.method28188(this.aLong138 * 6917164260611681027L, this.aString93, this.anInt2998 * -828903065, (byte) -119);
	}

	@OriginalMember(owner = "client!arc", name = "k", descriptor = "(Lclient!kr;)V", line = 107)
	@Override
	void method21995(@OriginalArg(0) Class386 arg0) {
		arg0.method28188(this.aLong138 * 6917164260611681027L, this.aString93, this.anInt2998 * -828903065, (byte) -18);
	}

	@OriginalMember(owner = "client!arc", name = "f", descriptor = "(Lclient!kr;)V", line = 107)
	@Override
	void method21991(@OriginalArg(0) Class386 arg0) {
		arg0.method28188(this.aLong138 * 6917164260611681027L, this.aString93, this.anInt2998 * -828903065, (byte) -67);
	}

	@OriginalMember(owner = "client!arc", name = "w", descriptor = "(Lclient!kr;)V", line = 107)
	@Override
	void method21996(@OriginalArg(0) Class386 arg0) {
		arg0.method28188(this.aLong138 * 6917164260611681027L, this.aString93, this.anInt2998 * -828903065, (byte) -90);
	}
}
