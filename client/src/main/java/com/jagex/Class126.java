package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

@OriginalClass("client!ju")
public abstract class Class126 {

	@OriginalMember(owner = "client!ju", name = "bo", descriptor = "Lclient!adx;")
	static Class91 aClass91_13;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ju", name = "this$0", descriptor = "Lclient!jy;")
	final Class370 aClass370_1;

	@OriginalMember(owner = "client!ju", name = "t", descriptor = "I")
	int anInt2867;

	@OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
	int anInt2866;

	@OriginalMember(owner = "client!ju", name = "ath", descriptor = "(Lclient!yp;B)V")
	static void method20381(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!ju", name = "xw", descriptor = "(Lclient!yp;I)V")
	static void method20382(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class80_Sub33 local13 = (Class80_Sub33) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local13.anInt1655 * -1125961095;
	}

	@OriginalMember(owner = "client!ju", name = "fi", descriptor = "(IIIZI)V")
	public static void method20383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		client.aLong352 = 0L;
		@Pc(4) int local4 = Class17.method437(-1349690784);
		if (arg0 == 3 || local4 == 3) {
			arg3 = true;
		}
		if (!Class279.aClass102_9.method20666()) {
			arg3 = true;
		}
		Class699.method37066(local4, arg0, arg1, arg2, arg3, 988153100);
	}

	@OriginalMember(owner = "client!ju", name = "aqn", descriptor = "(Lclient!yp;I)V")
	static void method20384(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
		arg0.anInt5778 -= 2036747717;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lclient!jy;II)V")
	Class126(@OriginalArg(0) Class370 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass370_1 = arg0;
		this.anInt2867 = arg1 * 29837971;
		this.anInt2866 = arg2 * 1318877777;
	}

	@OriginalMember(owner = "client!ju", name = "u", descriptor = "(Ljava/awt/Graphics;)V")
	abstract void method20377(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!ju", name = "t", descriptor = "(Ljava/awt/Graphics;I)V")
	abstract void method20378(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ju", name = "f", descriptor = "(Ljava/awt/Graphics;)V")
	abstract void method20379(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "(Ljava/awt/Graphics;)V")
	abstract void method20380(@OriginalArg(0) Graphics arg0);
}
