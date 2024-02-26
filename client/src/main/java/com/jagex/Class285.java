package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class285 implements Interface26 {

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "[Z")
	static boolean[] aBooleanArray23;

	// $FF: synthetic field
	@OriginalMember(owner = "client!gd", name = "this$0", descriptor = "Lclient!gc;")
	final Class284 aClass284_6;

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
	final int anInt3940;

	@OriginalMember(owner = "client!gd", name = "ez", descriptor = "(Lclient!yp;I)V")
	static void method26892(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2114357792);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class564.method31474(local16, local22, arg0, 65280);
	}

	@OriginalMember(owner = "client!gd", name = "ari", descriptor = "(Lclient!yp;B)V")
	static void method26893(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub7_1, arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] == 1 ? 1 : 0, (byte) 79);
		Class719.method37291(-705849399);
		client.aBoolean714 = false;
	}

	@OriginalMember(owner = "client!gd", name = "abv", descriptor = "(Lclient!yp;B)V")
	static void method26894(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class134.aClass305_1.method27131((byte) -90).size();
	}

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!gc;Lclient!ald;)V")
	Class285(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Packet arg1) {
		this.aClass284_6 = arg0;
		this.anInt3940 = arg1.g2() * 807069221;
	}

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "(Lclient!gz;I)V")
	@Override
	public void method27029(@OriginalArg(0) Class305 arg0, @OriginalArg(1) int arg1) {
		arg0.method27189(this.anInt3940 * -1772567123, -796828622);
		arg0.method27140(this.anInt3940 * -1772567123, -569923753);
	}

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "(Lclient!gz;)V")
	@Override
	public void method27028(@OriginalArg(0) Class305 arg0) {
		arg0.method27189(this.anInt3940 * -1772567123, -1919721773);
		arg0.method27140(this.anInt3940 * -1772567123, 270125996);
	}
}
