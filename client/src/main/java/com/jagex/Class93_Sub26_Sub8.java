package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arl")
public final class Class93_Sub26_Sub8 extends Class93_Sub26 {

	@OriginalMember(owner = "client!arl", name = "k", descriptor = "Ljava/lang/String;")
	String aString97;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arl", name = "this$0", descriptor = "Lclient!kd;")
	final Class375 aClass375_8;

	@OriginalMember(owner = "client!arl", name = "aww", descriptor = "(Lclient!yf;I)V")
	static void method21701(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		if (Class166_Sub1.aClass320Array1[local12] == null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class166_Sub1.aClass320Array1[local12].aClass312Array3.length;
		}
	}

	@OriginalMember(owner = "client!arl", name = "<init>", descriptor = "(Lclient!kd;)V")
	Class93_Sub26_Sub8(@OriginalArg(0) Class375 arg0) {
		this.aClass375_8 = arg0;
	}

	@OriginalMember(owner = "client!arl", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	void method22005(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aString97 = arg0.method22439(2019761598);
		arg0.method22431(-118643075);
	}

	@OriginalMember(owner = "client!arl", name = "n", descriptor = "(Lclient!kr;I)V")
	@Override
	void method22004(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		arg0.aString205 = this.aString97;
	}

	@OriginalMember(owner = "client!arl", name = "k", descriptor = "(Lclient!kr;)V")
	@Override
	void method22006(@OriginalArg(0) Class386 arg0) {
		arg0.aString205 = this.aString97;
	}

	@OriginalMember(owner = "client!arl", name = "e", descriptor = "(Lclient!alw;B)V")
	@Override
	void method22003(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		this.aString97 = arg0.method22439(295699414);
		arg0.method22431(-118643075);
	}

	@OriginalMember(owner = "client!arl", name = "f", descriptor = "(Lclient!kr;)V")
	@Override
	void method22002(@OriginalArg(0) Class386 arg0) {
		arg0.aString205 = this.aString97;
	}

	@OriginalMember(owner = "client!arl", name = "w", descriptor = "(Lclient!kr;)V")
	@Override
	void method22007(@OriginalArg(0) Class386 arg0) {
		arg0.aString205 = this.aString97;
	}
}
