package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public class Class148 {

	@OriginalMember(owner = "client!su", name = "wc", descriptor = "Lclient!d;")
	static Class220 aClass220_2;

	@OriginalMember(owner = "client!su", name = "n", descriptor = "I")
	static int anInt1470;

	// $FF: synthetic field
	@OriginalMember(owner = "client!su", name = "this$0", descriptor = "Lclient!so;")
	final Class556 aClass556_1;

	@OriginalMember(owner = "client!su", name = "t", descriptor = "[Lclient!ji;")
	Class361[] aClass361Array4;

	@OriginalMember(owner = "client!su", name = "f", descriptor = "[Lclient!ji;")
	Class361[] aClass361Array3;

	@OriginalMember(owner = "client!su", name = "agh", descriptor = "(Lclient!yp;I)V")
	static void method13457(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Character.toLowerCase((char) local12);
	}

	@OriginalMember(owner = "client!su", name = "aph", descriptor = "(Lclient!yp;I)V")
	static void method13458(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class217.method25864(554440677);
	}

	@OriginalMember(owner = "client!su", name = "mr", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method13459(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -1851623912) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray21 = Class431.method29089(local13, arg2, 1326013806);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lclient!so;)V")
	Class148(@OriginalArg(0) Class556 arg0) {
		this.aClass556_1 = arg0;
		this.aClass361Array4 = new Class361[16];
		this.aClass361Array3 = new Class361[16];
		new Class361(8);
		for (@Pc(19) int local19 = 0; local19 < 16; local19++) {
			this.aClass361Array4[local19] = new Class361(3);
			this.aClass361Array3[local19] = new Class361(3);
		}
	}
}
