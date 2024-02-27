package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sy")
public class Class148 {

	@OriginalMember(owner = "client!sy", name = "po", descriptor = "I")
	static int anInt1394;

	@OriginalMember(owner = "client!sy", name = "ab", descriptor = "I")
	public static int anInt1395;

	// $FF: synthetic field
	@OriginalMember(owner = "client!sy", name = "this$0", descriptor = "Lclient!sb;")
	final Class545 aClass545_1;

	@OriginalMember(owner = "client!sy", name = "e", descriptor = "[Lclient!jh;")
	Class361[] aClass361Array4;

	@OriginalMember(owner = "client!sy", name = "n", descriptor = "[Lclient!jh;")
	Class361[] aClass361Array3;

	@OriginalMember(owner = "client!sy", name = "tk", descriptor = "(Lclient!yf;I)V")
	static void method11758(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1763458437);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local16.anInt4020 * -903351367;
	}

	@OriginalMember(owner = "client!sy", name = "<init>", descriptor = "(Lclient!sb;)V")
	Class148(@OriginalArg(0) Class545 arg0) {
		this.aClass545_1 = arg0;
		this.aClass361Array4 = new Class361[16];
		this.aClass361Array3 = new Class361[16];
		new Class361(8);
		for (@Pc(19) int local19 = 0; local19 < 16; local19++) {
			this.aClass361Array4[local19] = new Class361(3);
			this.aClass361Array3[local19] = new Class361(3);
		}
	}
}
