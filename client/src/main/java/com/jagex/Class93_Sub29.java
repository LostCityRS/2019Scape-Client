package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aks")
public class Class93_Sub29 extends Class93 {

	@OriginalMember(owner = "client!aks", name = "f", descriptor = "I")
	public int anInt1604;

	@OriginalMember(owner = "client!aks", name = "w", descriptor = "I")
	public int anInt1605;

	@OriginalMember(owner = "client!aks", name = "u", descriptor = "I")
	public int anInt1606;

	@OriginalMember(owner = "client!aks", name = "z", descriptor = "I")
	public int anInt1607;

	@OriginalMember(owner = "client!aks", name = "l", descriptor = "I")
	public int anInt1608;

	@OriginalMember(owner = "client!aks", name = "k", descriptor = "I")
	public int anInt1603 = -634047057;

	@OriginalMember(owner = "client!aks", name = "p", descriptor = "Z")
	public boolean aBoolean340 = false;

	@OriginalMember(owner = "client!aks", name = "<init>", descriptor = "(I)V", line = 14)
	Class93_Sub29(@OriginalArg(0) int arg0) {
		this.anInt1603 = arg0 * 634047057;
	}

	@OriginalMember(owner = "client!aks", name = "yd", descriptor = "(Lclient!yf;I)V", line = 9347)
	static final void method13850(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class353.method27687(Class370.method27997(1479594670), arg0, 671168003);
	}

	@OriginalMember(owner = "client!aks", name = "auo", descriptor = "(Lclient!yf;B)V", line = 13437)
	static final void method13851(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub44_1.method16449(2098691445);
	}
}
