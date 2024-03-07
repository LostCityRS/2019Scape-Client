package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public class Class398 implements Interface32 {

	@OriginalMember(owner = "client!li", name = "e", descriptor = "I")
	public final int anInt4672;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(I)V", line = 8)
	Class398(@OriginalArg(0) int arg0) {
		this.anInt4672 = arg0 * 917257497;
	}

	@OriginalMember(owner = "client!li", name = "k", descriptor = "(Lclient!alw;)Lclient!li;", line = 13)
	public static Class398 method28491(@OriginalArg(0) Packet arg0) {
		@Pc(3) int local3 = arg0.gSmart2or4null(-786810799);
		return new Class398(local3);
	}

	@OriginalMember(owner = "client!li", name = "m", descriptor = "(Lclient!alw;)Lclient!li;", line = 13)
	public static Class398 method28492(@OriginalArg(0) Packet arg0) {
		@Pc(3) int local3 = arg0.gSmart2or4null(-652502672);
		return new Class398(local3);
	}

	@OriginalMember(owner = "client!li", name = "n", descriptor = "(S)Lclient!kt;", line = 18)
	@Override
	public Class388 method28578(@OriginalArg(0) short arg0) {
		return Class388.aClass388_9;
	}

	@OriginalMember(owner = "client!li", name = "l", descriptor = "()Lclient!kt;", line = 18)
	@Override
	public Class388 method28579() {
		return Class388.aClass388_9;
	}

	@OriginalMember(owner = "client!li", name = "ayg", descriptor = "(Lclient!yf;B)V", line = 13976)
	static final void method28493(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class659.anInt5822 * 1565516845;
	}
}
