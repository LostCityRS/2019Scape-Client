package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aod")
public final class Class41_Sub3 extends Class41 {

	@OriginalMember(owner = "client!aod", name = "g", descriptor = "I")
	public static final int anInt2416 = 256;

	@OriginalMember(owner = "client!aod", name = "<init>", descriptor = "(Lclient!zy;Lclient!zv;ZLclient!pf;Lclient!pf;)V")
	public Class41_Sub3(@OriginalArg(0) Class722 arg0, @OriginalArg(1) Class719 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class480 arg3, @OriginalArg(4) Class480 arg4) {
		super(arg0, arg1, arg3, Class664.aClass664_76, 256, new Class161_Sub1(arg2, arg4, arg1, arg0));
	}

	@OriginalMember(owner = "client!aod", name = "x", descriptor = "()V")
	@Override
	public void method17932() {
		super.method17928((byte) 10);
		((Class161) this.anInterface3_25).method15632(1102256837);
	}

	@OriginalMember(owner = "client!aod", name = "w", descriptor = "()V")
	@Override
	public void method17933() {
		super.method17928((byte) 58);
		((Class161) this.anInterface3_25).method15632(1102256837);
	}

	@OriginalMember(owner = "client!aod", name = "c", descriptor = "(IB)V")
	public void method17155(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		((Class161) this.anInterface3_25).method15631(arg0, (byte) 78);
	}

	@OriginalMember(owner = "client!aod", name = "m", descriptor = "(B)V")
	@Override
	public void method17928(@OriginalArg(0) byte arg0) {
		super.method17928((byte) 16);
		((Class161) this.anInterface3_25).method15632(1102256837);
	}

	@OriginalMember(owner = "client!aod", name = "s", descriptor = "(IS)V")
	@Override
	public void method17934(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		super.method17934(arg0, (short) 19523);
		((Class161) this.anInterface3_25).method15633(arg0, 1149610640);
	}

	@OriginalMember(owner = "client!aod", name = "q", descriptor = "(I)V")
	@Override
	public void method17935(@OriginalArg(0) int arg0) {
		super.method17934(arg0, (short) 11501);
		((Class161) this.anInterface3_25).method15633(arg0, 1054239644);
	}

	@OriginalMember(owner = "client!aod", name = "k", descriptor = "(I)V")
	@Override
	public void method17929(@OriginalArg(0) int arg0) {
		super.method17929(1945149003);
		((Class161) this.anInterface3_25).method15634(-1533811189);
	}

	@OriginalMember(owner = "client!aod", name = "ay", descriptor = "(I)V")
	public void method17156(@OriginalArg(0) int arg0) {
		((Class161) this.anInterface3_25).method15631(arg0, (byte) 32);
	}

	@OriginalMember(owner = "client!aod", name = "r", descriptor = "(I)V")
	@Override
	public void method17930(@OriginalArg(0) int arg0) {
		super.method17934(arg0, (short) 5979);
		((Class161) this.anInterface3_25).method15633(arg0, -1105902180);
	}

	@OriginalMember(owner = "client!aod", name = "z", descriptor = "()V")
	@Override
	public void method17937() {
		super.method17929(1580944949);
		((Class161) this.anInterface3_25).method15634(1718346171);
	}

	@OriginalMember(owner = "client!aod", name = "h", descriptor = "(I)V")
	@Override
	public void method17931(@OriginalArg(0) int arg0) {
		super.method17934(arg0, (short) 6522);
		((Class161) this.anInterface3_25).method15633(arg0, 673137729);
	}

	@OriginalMember(owner = "client!aod", name = "d", descriptor = "()V")
	@Override
	public void method17942() {
		super.method17929(1514003355);
		((Class161) this.anInterface3_25).method15634(-2071311974);
	}

	@OriginalMember(owner = "client!aod", name = "ai", descriptor = "(I)V")
	public void method17157(@OriginalArg(0) int arg0) {
		((Class161) this.anInterface3_25).method15631(arg0, (byte) 104);
	}

	@OriginalMember(owner = "client!aod", name = "p", descriptor = "()V")
	@Override
	public void method17938() {
		super.method17929(1561008593);
		((Class161) this.anInterface3_25).method15634(-1007097883);
	}

	@OriginalMember(owner = "client!aod", name = "b", descriptor = "(Z)V")
	public void method17158(@OriginalArg(0) boolean arg0) {
		((Class161) this.anInterface3_25).method15630(arg0, (byte) -98);
	}

	@OriginalMember(owner = "client!aod", name = "ax", descriptor = "(Z)V")
	public void method17159(@OriginalArg(0) boolean arg0) {
		((Class161) this.anInterface3_25).method15630(arg0, (byte) -66);
	}

	@OriginalMember(owner = "client!aod", name = "n", descriptor = "(ZB)V")
	public void method17160(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		((Class161) this.anInterface3_25).method15630(arg0, (byte) -15);
	}

	@OriginalMember(owner = "client!aod", name = "aq", descriptor = "(I)V")
	public void method17161(@OriginalArg(0) int arg0) {
		((Class161) this.anInterface3_25).method15631(arg0, (byte) 126);
	}
}
