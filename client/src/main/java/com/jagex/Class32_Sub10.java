package com.jagex;

import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aol")
public final class Class32_Sub10 extends Class32 {

	@OriginalMember(owner = "client!aol", name = "i", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!aol", name = "e", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z")
	public static boolean method17017(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null || arg2 == null) {
			return false;
		} else if (arg0.startsWith("#") || arg2.startsWith("#")) {
			return arg0.equals(arg2);
		} else {
			return arg1.equals(arg3);
		}
	}

	@OriginalMember(owner = "client!aol", name = "<init>", descriptor = "(Lclient!zd;Lclient!zt;Lclient!py;Lclient!py;)V")
	public Class32_Sub10(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) Class497 arg2, @OriginalArg(3) Class497 arg3) {
		super(arg0, arg1, arg2, Class667.aClass667_97, 64, new Class156_Sub1(arg3));
	}

	@OriginalMember(owner = "client!aol", name = "q", descriptor = "()V")
	@Override
	public void method17825() {
		super.method17819(-218718198);
		((Class156) this.anInterface4_25).method14189(-1139456133);
	}

	@OriginalMember(owner = "client!aol", name = "t", descriptor = "()V")
	@Override
	public void method17832() {
		super.method17823(1366234249);
		((Class156) this.anInterface4_25).method14191(1929398610);
	}

	@OriginalMember(owner = "client!aol", name = "v", descriptor = "(II)V")
	@Override
	public void method17820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method17820(arg0, -1213957524);
		((Class156) this.anInterface4_25).method14195(arg0, -1238930772);
	}

	@OriginalMember(owner = "client!aol", name = "o", descriptor = "(I)V")
	@Override
	public void method17823(@OriginalArg(0) int arg0) {
		super.method17823(44152861);
		((Class156) this.anInterface4_25).method14191(2124516501);
	}

	@OriginalMember(owner = "client!aol", name = "y", descriptor = "()V")
	@Override
	public void method17824() {
		super.method17819(1535005134);
		((Class156) this.anInterface4_25).method14189(-2106934101);
	}

	@OriginalMember(owner = "client!aol", name = "g", descriptor = "(I)V")
	@Override
	public void method17829(@OriginalArg(0) int arg0) {
		super.method17820(arg0, -1979815580);
		((Class156) this.anInterface4_25).method14195(arg0, -2083678623);
	}

	@OriginalMember(owner = "client!aol", name = "x", descriptor = "()V")
	@Override
	public void method17826() {
		super.method17819(-1619627056);
		((Class156) this.anInterface4_25).method14189(-1813007493);
	}

	@OriginalMember(owner = "client!aol", name = "b", descriptor = "()V")
	@Override
	public void method17818() {
		super.method17819(133076701);
		((Class156) this.anInterface4_25).method14189(-727813071);
	}

	@OriginalMember(owner = "client!aol", name = "h", descriptor = "()V")
	@Override
	public void method17827() {
		super.method17819(-2123049487);
		((Class156) this.anInterface4_25).method14189(-1025235881);
	}

	@OriginalMember(owner = "client!aol", name = "a", descriptor = "(I)V")
	@Override
	public void method17837(@OriginalArg(0) int arg0) {
		super.method17820(arg0, -1113556365);
		((Class156) this.anInterface4_25).method14195(arg0, -544773474);
	}

	@OriginalMember(owner = "client!aol", name = "j", descriptor = "(I)V")
	@Override
	public void method17831(@OriginalArg(0) int arg0) {
		super.method17820(arg0, -1923186255);
		((Class156) this.anInterface4_25).method14195(arg0, -1361798341);
	}

	@OriginalMember(owner = "client!aol", name = "i", descriptor = "(I)V")
	@Override
	public void method17830(@OriginalArg(0) int arg0) {
		super.method17820(arg0, -2092584977);
		((Class156) this.anInterface4_25).method14195(arg0, 478752863);
	}

	@OriginalMember(owner = "client!aol", name = "r", descriptor = "(I)V")
	@Override
	public void method17819(@OriginalArg(0) int arg0) {
		super.method17819(1761389388);
		((Class156) this.anInterface4_25).method14189(-1970356791);
	}

	@OriginalMember(owner = "client!aol", name = "s", descriptor = "()V")
	@Override
	public void method17822() {
		super.method17819(1723704004);
		((Class156) this.anInterface4_25).method14189(-1668702448);
	}
}
