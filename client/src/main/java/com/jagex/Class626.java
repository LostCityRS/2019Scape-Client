package com.jagex;

import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class Class626 {

	@OriginalMember(owner = "client!vw", name = "oh", descriptor = "I")
	public static int userDob;

	@OriginalMember(owner = "client!vw", name = "e", descriptor = "I")
	final int anInt5701;

	@OriginalMember(owner = "client!vw", name = "f", descriptor = "Ljava/util/LinkedList;")
	final LinkedList aLinkedList8;

	@OriginalMember(owner = "client!vw", name = "n", descriptor = "I")
	final int anInt5703;

	@OriginalMember(owner = "client!vw", name = "m", descriptor = "I")
	final int anInt5702;

	@OriginalMember(owner = "client!vw", name = "k", descriptor = "F")
	final float aFloat338;

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(ILjava/util/LinkedList;IIF)V", line = 12)
	Class626(@OriginalArg(0) int arg0, @OriginalArg(1) LinkedList arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		this.anInt5701 = arg0 * -9922527;
		this.aLinkedList8 = arg1;
		this.anInt5703 = arg2 * -965967917;
		this.anInt5702 = arg3 * -742829027;
		this.aFloat338 = arg4;
	}

	@OriginalMember(owner = "client!vw", name = "e", descriptor = "(Lclient!py;Lclient!py;II)V", line = 16)
	public static void method32243(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class93_Sub1_Sub10.aClass497_94 = arg0;
		Class93_Sub1_Sub10.aClass497_95 = arg1;
	}

	@OriginalMember(owner = "client!vw", name = "aoo", descriptor = "(Lclient!yf;I)V", line = 12440)
	static final void method32244(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class65.aClass123_Sub1_2.method9020((byte) -35) == null ? -1 : Class65.aClass123_Sub1_2.method9020((byte) -58).anInt4184 * -210852351;
	}
}
