package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aoe")
public final class Class41_Sub4 extends Class41 {

	@OriginalMember(owner = "client!aoe", name = "<init>", descriptor = "(Lclient!zy;Lclient!zv;Lclient!pf;Lclient!pf;)V")
	public Class41_Sub4(@OriginalArg(0) Class722 arg0, @OriginalArg(1) Class719 arg1, @OriginalArg(2) Class480 arg2, @OriginalArg(3) Class480 arg3) {
		super(arg0, arg1, arg2, Class664.aClass664_61, 64, new Class154_Sub1(arg3));
	}

	@OriginalMember(owner = "client!aoe", name = "x", descriptor = "()V")
	@Override
	public void method17932() {
		super.method17928((byte) -5);
		((Class154) this.anInterface3_25).method14979((short) -1472);
	}

	@OriginalMember(owner = "client!aoe", name = "m", descriptor = "(B)V")
	@Override
	public void method17928(@OriginalArg(0) byte arg0) {
		super.method17928((byte) -16);
		((Class154) this.anInterface3_25).method14979((short) -10818);
	}

	@OriginalMember(owner = "client!aoe", name = "s", descriptor = "(IS)V")
	@Override
	public void method17934(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		super.method17934(arg0, (short) 10799);
		((Class154) this.anInterface3_25).method14984(arg0, -1622518447);
	}

	@OriginalMember(owner = "client!aoe", name = "w", descriptor = "()V")
	@Override
	public void method17933() {
		super.method17928((byte) 106);
		((Class154) this.anInterface3_25).method14979((short) -19755);
	}

	@OriginalMember(owner = "client!aoe", name = "k", descriptor = "(I)V")
	@Override
	public void method17929(@OriginalArg(0) int arg0) {
		super.method17929(1513896403);
		((Class154) this.anInterface3_25).method14977(-641242640);
	}

	@OriginalMember(owner = "client!aoe", name = "r", descriptor = "(I)V")
	@Override
	public void method17930(@OriginalArg(0) int arg0) {
		super.method17934(arg0, (short) 6387);
		((Class154) this.anInterface3_25).method14984(arg0, -1231705971);
	}

	@OriginalMember(owner = "client!aoe", name = "q", descriptor = "(I)V")
	@Override
	public void method17935(@OriginalArg(0) int arg0) {
		super.method17934(arg0, (short) 13846);
		((Class154) this.anInterface3_25).method14984(arg0, -1271569051);
	}

	@OriginalMember(owner = "client!aoe", name = "h", descriptor = "(I)V")
	@Override
	public void method17931(@OriginalArg(0) int arg0) {
		super.method17934(arg0, (short) 28778);
		((Class154) this.anInterface3_25).method14984(arg0, -1491771290);
	}

	@OriginalMember(owner = "client!aoe", name = "d", descriptor = "()V")
	@Override
	public void method17942() {
		super.method17929(2137742957);
		((Class154) this.anInterface3_25).method14977(-72656617);
	}

	@OriginalMember(owner = "client!aoe", name = "z", descriptor = "()V")
	@Override
	public void method17937() {
		super.method17929(2040032515);
		((Class154) this.anInterface3_25).method14977(494585555);
	}

	@OriginalMember(owner = "client!aoe", name = "p", descriptor = "()V")
	@Override
	public void method17938() {
		super.method17929(1623694267);
		((Class154) this.anInterface3_25).method14977(1970727756);
	}
}
