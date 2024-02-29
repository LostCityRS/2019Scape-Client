package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arl")
public class Class93_Sub26_Sub8 extends Class93_Sub26 {

	@OriginalMember(owner = "client!arl", name = "k", descriptor = "Ljava/lang/String;")
	String aString97;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arl", name = "this$0", descriptor = "Lclient!kd;")
	final Class375 this$0;

	@OriginalMember(owner = "client!arl", name = "<init>", descriptor = "(Lclient!kd;)V", line = 213)
	Class93_Sub26_Sub8(@OriginalArg(0) Class375 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!arl", name = "m", descriptor = "(Lclient!alw;)V", line = 216)
	@Override
	void method21994(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aString97 = arg0.method22509(2019761598);
		arg0.method22483(-118643075);
	}

	@OriginalMember(owner = "client!arl", name = "e", descriptor = "(Lclient!alw;B)V", line = 216)
	@Override
	void method21992(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		this.aString97 = arg0.method22509(295699414);
		arg0.method22483(-118643075);
	}

	@OriginalMember(owner = "client!arl", name = "n", descriptor = "(Lclient!kr;I)V", line = 221)
	@Override
	void method21993(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		arg0.aString196 = this.aString97;
	}

	@OriginalMember(owner = "client!arl", name = "k", descriptor = "(Lclient!kr;)V", line = 221)
	@Override
	void method21995(@OriginalArg(0) Class386 arg0) {
		arg0.aString196 = this.aString97;
	}

	@OriginalMember(owner = "client!arl", name = "f", descriptor = "(Lclient!kr;)V", line = 221)
	@Override
	void method21991(@OriginalArg(0) Class386 arg0) {
		arg0.aString196 = this.aString97;
	}

	@OriginalMember(owner = "client!arl", name = "w", descriptor = "(Lclient!kr;)V", line = 221)
	@Override
	void method21996(@OriginalArg(0) Class386 arg0) {
		arg0.aString196 = this.aString97;
	}

	@OriginalMember(owner = "client!arl", name = "aww", descriptor = "(Lclient!yf;I)V", line = 13771)
	static final void method21689(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (Class166_Sub1.aClass320Array1[local12] == null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class166_Sub1.aClass320Array1[local12].aClass312Array3.length;
		}
	}
}
