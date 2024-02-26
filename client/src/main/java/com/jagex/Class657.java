package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xd")
final class Class657 implements Iterator {

	@OriginalMember(owner = "client!xd", name = "t", descriptor = "I")
	int anInt5678;

	// $FF: synthetic field
	@OriginalMember(owner = "client!xd", name = "this$0", descriptor = "Lclient!adv;")
	final Class2_Sub1_Sub2 aClass2_Sub1_Sub2_15;

	@OriginalMember(owner = "client!xd", name = "gx", descriptor = "(IIII)V")
	static void method33227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(32) String local32 = "tele " + arg0 + Class256.aString157 + (arg1 >> 6) + Class256.aString157 + (arg2 >> 6) + Class256.aString157 + (arg1 & 0x3F) + Class256.aString157 + (arg2 & 0x3F);
		System.out.println(local32);
		Class138.method11536(local32, true, false, (byte) 48);
	}

	@OriginalMember(owner = "client!xd", name = "ac", descriptor = "(III)V")
	static void method33228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class374 local5 = (Class374) Class664.aClass41_Sub17_2.method18054(arg0, 1662406247);
		@Pc(14) Class80_Sub1_Sub9 local14 = Class22.method545(1, (long) (local5.aClass107_1.anInt862 * -1873516487));
		try {
			if (Class80_Sub1_Sub9.aBoolean580) {
				local14.anInt3064 = Class120_Sub1_Sub1_Sub4.aClass110_Sub1_1.method36980(local5.aClass107_1, -478232466) * -1221031713;
			}
			local14.anInt3064 = local5.method28422(local14.anInt3064 * 1216164639, arg1, 745638658) * -1221031713;
			local14.method22135(-457826299);
		} catch (@Pc(42) Exception_Sub6 local42) {
			Class603.method32133("" + arg0, local42, 839300151);
		}
	}

	@OriginalMember(owner = "client!xd", name = "u", descriptor = "(Lclient!pf;ILclient!wp;ZLclient!ej;I)Lclient!wc;")
	public static Interface68 method33229(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface70 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class243 arg4, @OriginalArg(5) int arg5) {
		if (Class659.aClass138_6 == null) {
			return null;
		} else {
			return (Interface68) (arg3 ? new Class643(arg0, arg1, Class659.aClass138_6, arg2) : new Class642(arg0, arg1, Class659.aClass138_6, arg2, arg4));
		}
	}

	@OriginalMember(owner = "client!xd", name = "<init>", descriptor = "(Lclient!adv;)V")
	Class657(@OriginalArg(0) Class2_Sub1_Sub2 arg0) {
		this.aClass2_Sub1_Sub2_15 = arg0;
	}

	@OriginalMember(owner = "client!xd", name = "t", descriptor = "()Z")
	public boolean method33223() {
		return this.anInt5678 * -1759337973 < this.aClass2_Sub1_Sub2_15.method18051(531113814);
	}

	@OriginalMember(owner = "client!xd", name = "hasNext", descriptor = "()Z")
	@Override
	public boolean hasNext() {
		return this.anInt5678 * -1759337973 < this.aClass2_Sub1_Sub2_15.method18051(-814416670);
	}

	@OriginalMember(owner = "client!xd", name = "u", descriptor = "()V")
	public void method33224() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!xd", name = "remove", descriptor = "()V")
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!xd", name = "next", descriptor = "()Ljava/lang/Object;")
	@Override
	public Object next() {
		@Pc(11) int local11 = (this.anInt5678 += 1727486371) * -1759337973 - 1;
		@Pc(19) Class107_Sub1 local19 = (Class107_Sub1) this.aClass2_Sub1_Sub2_15.aClass243_6.method26282((long) local11);
		return local19 == null ? this.aClass2_Sub1_Sub2_15.method1840(local11, -433501004) : local19;
	}

	@OriginalMember(owner = "client!xd", name = "f", descriptor = "()Ljava/lang/Object;")
	public Object method33225() {
		@Pc(11) int local11 = (this.anInt5678 += 1727486371) * -1759337973 - 1;
		@Pc(19) Class107_Sub1 local19 = (Class107_Sub1) this.aClass2_Sub1_Sub2_15.aClass243_6.method26282((long) local11);
		return local19 == null ? this.aClass2_Sub1_Sub2_15.method1840(local11, 1337342826) : local19;
	}

	@OriginalMember(owner = "client!xd", name = "e", descriptor = "()V")
	public void method33226() {
		throw new UnsupportedOperationException();
	}
}
