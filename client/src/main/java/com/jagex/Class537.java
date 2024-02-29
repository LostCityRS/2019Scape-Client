package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public class Class537 {

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "Lclient!rc;")
	Class526 aClass526_11;

	@OriginalMember(owner = "client!rt", name = "n", descriptor = "Lclient!ase;")
	Class93_Sub41_Sub2 aClass93_Sub41_Sub2_3;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lclient!rc;Lclient!ase;)V", line = 9)
	public Class537(@OriginalArg(0) Class526 arg0, @OriginalArg(1) Class93_Sub41_Sub2 arg1) {
		this.aClass526_11 = arg0;
		this.aClass93_Sub41_Sub2_3 = arg1;
	}

	@OriginalMember(owner = "client!rt", name = "apq", descriptor = "(Lclient!yf;S)V", line = 12666)
	static final void method30760(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(17) boolean local17 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] == 1;
		if (local17) {
			Class322.method27271(3, 1589735282);
		} else {
			Class322.method27271(2, -1917962815);
		}
	}

	@OriginalMember(owner = "client!rt", name = "azn", descriptor = "(Lclient!yf;B)V", line = 14221)
	static final void method30761(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
