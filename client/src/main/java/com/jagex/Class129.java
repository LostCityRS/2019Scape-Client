package com.jagex;

import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public abstract class Class129 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!jq", name = "this$0", descriptor = "Lclient!jm;")
	final Class364 aClass364_1;

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
	int anInt2994;

	@OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
	int anInt2995;

	@OriginalMember(owner = "client!jq", name = "et", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V")
	static void method21488(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		arg0.anInt4038 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091] * 1197882817;
		Class354.method27789(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!jq", name = "gn", descriptor = "(Lclient!yf;I)V")
	static void method21489(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class138_Sub4.method11516(local11, local14, arg0, -1497248091);
	}

	@OriginalMember(owner = "client!jq", name = "aea", descriptor = "(Lclient!yf;S)V")
	static void method21490(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt6052 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		@Pc(37) int local37 = 31 - local33;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local13 << local37 >>> local23 + local37;
	}

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "(Lclient!alq;B)V")
	public static void method21491(@OriginalArg(0) Class54_Sub1 arg0, @OriginalArg(1) byte arg1) {
		Class370.method28176(arg0, -1826400890);
	}

	@OriginalMember(owner = "client!jq", name = "ne", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V")
	static void method21492(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		if (Class532.method30778(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray26 = Class499.method30329(local13, arg2, -660401871);
		arg0.aBoolean684 = true;
	}

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!jm;II)V")
	Class129(@OriginalArg(0) Class364 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass364_1 = arg0;
		this.anInt2994 = arg1 * -1333531795;
		this.anInt2995 = arg2 * -1048042055;
	}

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "(Ljava/awt/Graphics;)V")
	abstract void method21482(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "(Ljava/awt/Graphics;B)V")
	abstract void method21483(@OriginalArg(0) Graphics arg0, @OriginalArg(1) byte arg1);

	@OriginalMember(owner = "client!jq", name = "n", descriptor = "(Ljava/awt/Graphics;)V")
	abstract void method21484(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!jq", name = "w", descriptor = "(Ljava/awt/Graphics;)V")
	abstract void method21485(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!jq", name = "k", descriptor = "(Ljava/awt/Graphics;)V")
	abstract void method21486(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "(Ljava/awt/Graphics;)V")
	abstract void method21487(@OriginalArg(0) Graphics arg0);
}
