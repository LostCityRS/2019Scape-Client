package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!agw")
public final class Class103_Sub22 extends Class103 {

	@OriginalMember(owner = "client!agw", name = "bh", descriptor = "Ljava/lang/String;")
	public static String aString44;

	@OriginalMember(owner = "client!agw", name = "f", descriptor = "I")
	final int anInt1020;

	@OriginalMember(owner = "client!agw", name = "e", descriptor = "I")
	final int anInt1018;

	@OriginalMember(owner = "client!agw", name = "u", descriptor = "Ljava/lang/String;")
	final String aString43;

	@OriginalMember(owner = "client!agw", name = "l", descriptor = "I")
	final int anInt1017;

	@OriginalMember(owner = "client!agw", name = "g", descriptor = "I")
	final int anInt1019;

	@OriginalMember(owner = "client!agw", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class103_Sub22(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt1020 = arg0.g2() * -413259903;
		this.anInt1018 = arg0.g2() * -1051847969;
		this.aString43 = arg0.gjstr();
		this.anInt1017 = arg0.g4() * 65752757;
		this.anInt1019 = arg0.g2() * -325802555;
	}

	@OriginalMember(owner = "client!agw", name = "l", descriptor = "()V")
	@Override
	public void method19198() {
		Class93.method1882(Class507.anInt5045 * -1170417853, this.anInt1020 * -220587903, this.anInt1018 * 809117983, Class439.method29150(this.anInt1020 * -220587903, this.anInt1018 * 809117983, Class507.anInt5045 * -1170417853, 1037753497), this.anInt1019 * 1212387597, this.anInt1017 * -1590186083, this.aString43, 871596794);
	}

	@OriginalMember(owner = "client!agw", name = "f", descriptor = "(I)V")
	@Override
	public void method19206(@OriginalArg(0) int arg0) {
		Class93.method1882(Class507.anInt5045 * -1170417853, this.anInt1020 * -220587903, this.anInt1018 * 809117983, Class439.method29150(this.anInt1020 * -220587903, this.anInt1018 * 809117983, Class507.anInt5045 * -1170417853, 1037753497), this.anInt1019 * 1212387597, this.anInt1017 * -1590186083, this.aString43, 1859462632);
	}

	@OriginalMember(owner = "client!agw", name = "g", descriptor = "()V")
	@Override
	public void method19202() {
		Class93.method1882(Class507.anInt5045 * -1170417853, this.anInt1020 * -220587903, this.anInt1018 * 809117983, Class439.method29150(this.anInt1020 * -220587903, this.anInt1018 * 809117983, Class507.anInt5045 * -1170417853, 1037753497), this.anInt1019 * 1212387597, this.anInt1017 * -1590186083, this.aString43, -853566218);
	}
}
