package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Iterator;

@OriginalClass("client!wd")
public final class Class633 implements Iterator {

	@OriginalMember(owner = "client!wd", name = "qq", descriptor = "I")
	static int anInt5595;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
	int anInt5594;

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "[Lclient!wv;")
	Class649[] aClass649Array1;

	@OriginalMember(owner = "client!wd", name = "qd", descriptor = "(Lclient!yp;I)V")
	static void method32784(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class230.method26004(local11, local14, arg0, (byte) 102);
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "([Lclient!wv;)V")
	Class633(@OriginalArg(0) Class649[] arg0) {
		this.aClass649Array1 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "()Z")
	public boolean method32780() {
		return this.anInt5594 * -2126806717 < this.aClass649Array1.length;
	}

	@OriginalMember(owner = "client!wd", name = "next", descriptor = "()Ljava/lang/Object;")
	@Override
	public Object next() {
		return this.aClass649Array1[(this.anInt5594 += -12381333) * -2126806717 - 1];
	}

	@OriginalMember(owner = "client!wd", name = "remove", descriptor = "()V")
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wd", name = "hasNext", descriptor = "()Z")
	@Override
	public boolean hasNext() {
		return this.anInt5594 * -2126806717 < this.aClass649Array1.length;
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "()Ljava/lang/Object;")
	public Object method32781() {
		return this.aClass649Array1[(this.anInt5594 += -12381333) * -2126806717 - 1];
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "()V")
	public void method32782() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "()V")
	public void method32783() {
		throw new UnsupportedOperationException();
	}
}
