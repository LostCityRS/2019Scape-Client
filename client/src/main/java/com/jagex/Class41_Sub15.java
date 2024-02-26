package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aot")
public final class Class41_Sub15 extends Class41 {

	@OriginalMember(owner = "client!aot", name = "acs", descriptor = "(Lclient!yp;B)V")
	static void method17719(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		Class223.method25945(arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], -2035690561);
	}

	@OriginalMember(owner = "client!aot", name = "<init>", descriptor = "(Lclient!zy;Lclient!zv;Lclient!pf;Lclient!pf;)V")
	public Class41_Sub15(@OriginalArg(0) Class722 arg0, @OriginalArg(1) Class719 arg1, @OriginalArg(2) Class480 arg2, @OriginalArg(3) Class480 arg3) {
		super(arg0, arg1, arg2, Class664.aClass664_93, 64, new Class156_Sub1(arg3));
	}

	@OriginalMember(owner = "client!aot", name = "p", descriptor = "()V")
	@Override
	public void method17938() {
		super.method17929(1440923189);
		((Class156) this.anInterface3_25).method15147((byte) 10);
	}

	@OriginalMember(owner = "client!aot", name = "m", descriptor = "(B)V")
	@Override
	public void method17928(@OriginalArg(0) byte arg0) {
		super.method17928((byte) 95);
		((Class156) this.anInterface3_25).method15146(-818977947);
	}

	@OriginalMember(owner = "client!aot", name = "s", descriptor = "(IS)V")
	@Override
	public void method17934(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		super.method17934(arg0, (short) 11314);
		((Class156) this.anInterface3_25).method15152(arg0, (short) 8960);
	}

	@OriginalMember(owner = "client!aot", name = "k", descriptor = "(I)V")
	@Override
	public void method17929(@OriginalArg(0) int arg0) {
		super.method17929(1665276048);
		((Class156) this.anInterface3_25).method15147((byte) -33);
	}

	@OriginalMember(owner = "client!aot", name = "w", descriptor = "()V")
	@Override
	public void method17933() {
		super.method17928((byte) 6);
		((Class156) this.anInterface3_25).method15146(-526655238);
	}

	@OriginalMember(owner = "client!aot", name = "r", descriptor = "(I)V")
	@Override
	public void method17930(@OriginalArg(0) int arg0) {
		super.method17934(arg0, (short) 6802);
		((Class156) this.anInterface3_25).method15152(arg0, (short) 11984);
	}

	@OriginalMember(owner = "client!aot", name = "q", descriptor = "(I)V")
	@Override
	public void method17935(@OriginalArg(0) int arg0) {
		super.method17934(arg0, (short) 10188);
		((Class156) this.anInterface3_25).method15152(arg0, (short) -4615);
	}

	@OriginalMember(owner = "client!aot", name = "h", descriptor = "(I)V")
	@Override
	public void method17931(@OriginalArg(0) int arg0) {
		super.method17934(arg0, (short) 2652);
		((Class156) this.anInterface3_25).method15152(arg0, (short) 9614);
	}

	@OriginalMember(owner = "client!aot", name = "z", descriptor = "()V")
	@Override
	public void method17937() {
		super.method17929(1762371002);
		((Class156) this.anInterface3_25).method15147((byte) 39);
	}

	@OriginalMember(owner = "client!aot", name = "x", descriptor = "()V")
	@Override
	public void method17932() {
		super.method17928((byte) -33);
		((Class156) this.anInterface3_25).method15146(-2034187446);
	}

	@OriginalMember(owner = "client!aot", name = "d", descriptor = "()V")
	@Override
	public void method17942() {
		super.method17929(1259060060);
		((Class156) this.anInterface3_25).method15147((byte) -103);
	}
}
