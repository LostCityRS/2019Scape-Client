package com.jagex;

import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aol")
public class Class32_Sub10 extends Class32 {

	@OriginalMember(owner = "client!aol", name = "i", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!aol", name = "e", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z", line = 11)
	public static final boolean method17005(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null || arg2 == null) {
			return false;
		} else if (arg0.startsWith("#") || arg2.startsWith("#")) {
			return arg0.equals(arg2);
		} else {
			return arg1.equals(arg3);
		}
	}

	@OriginalMember(owner = "client!aol", name = "<init>", descriptor = "(Lclient!zd;Lclient!zt;Lclient!py;Lclient!py;)V", line = 13)
	public Class32_Sub10(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) Class497 arg2, @OriginalArg(3) Class497 arg3) {
		super(arg0, arg1, arg2, Class667.aClass667_97, 64, new Class156_Sub1(arg3));
	}

	@OriginalMember(owner = "client!aol", name = "q", descriptor = "()V", line = 17)
	@Override
	public void method17813() {
		super.method17810(-218718198);
		((Class156) this.anInterface4_25).method14188(-1139456133);
	}

	@OriginalMember(owner = "client!aol", name = "y", descriptor = "()V", line = 17)
	@Override
	public void method17812() {
		super.method17810(1535005134);
		((Class156) this.anInterface4_25).method14188(-2106934101);
	}

	@OriginalMember(owner = "client!aol", name = "x", descriptor = "()V", line = 17)
	@Override
	public void method17814() {
		super.method17810(-1619627056);
		((Class156) this.anInterface4_25).method14188(-1813007493);
	}

	@OriginalMember(owner = "client!aol", name = "b", descriptor = "()V", line = 17)
	@Override
	public void method17809() {
		super.method17810(133076701);
		((Class156) this.anInterface4_25).method14188(-727813071);
	}

	@OriginalMember(owner = "client!aol", name = "h", descriptor = "()V", line = 17)
	@Override
	public void method17815() {
		super.method17810(-2123049487);
		((Class156) this.anInterface4_25).method14188(-1025235881);
	}

	@OriginalMember(owner = "client!aol", name = "r", descriptor = "(I)V", line = 17)
	@Override
	public void method17810(@OriginalArg(0) int arg0) {
		super.method17810(1761389388);
		((Class156) this.anInterface4_25).method14188(-1970356791);
	}

	@OriginalMember(owner = "client!aol", name = "s", descriptor = "()V", line = 17)
	@Override
	public void method17811() {
		super.method17810(1723704004);
		((Class156) this.anInterface4_25).method14188(-1668702448);
	}

	@OriginalMember(owner = "client!aol", name = "v", descriptor = "(II)V", line = 22)
	@Override
	public void method17817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method17817(arg0, -1213957524);
		((Class156) this.anInterface4_25).method14194(arg0, -1238930772);
	}

	@OriginalMember(owner = "client!aol", name = "g", descriptor = "(I)V", line = 22)
	@Override
	public void method17818(@OriginalArg(0) int arg0) {
		super.method17817(arg0, -1979815580);
		((Class156) this.anInterface4_25).method14194(arg0, -2083678623);
	}

	@OriginalMember(owner = "client!aol", name = "a", descriptor = "(I)V", line = 22)
	@Override
	public void method17821(@OriginalArg(0) int arg0) {
		super.method17817(arg0, -1113556365);
		((Class156) this.anInterface4_25).method14194(arg0, -544773474);
	}

	@OriginalMember(owner = "client!aol", name = "j", descriptor = "(I)V", line = 22)
	@Override
	public void method17820(@OriginalArg(0) int arg0) {
		super.method17817(arg0, -1923186255);
		((Class156) this.anInterface4_25).method14194(arg0, -1361798341);
	}

	@OriginalMember(owner = "client!aol", name = "i", descriptor = "(I)V", line = 22)
	@Override
	public void method17819(@OriginalArg(0) int arg0) {
		super.method17817(arg0, -2092584977);
		((Class156) this.anInterface4_25).method14194(arg0, 478752863);
	}

	@OriginalMember(owner = "client!aol", name = "t", descriptor = "()V", line = 27)
	@Override
	public void method17823() {
		super.method17822(1366234249);
		((Class156) this.anInterface4_25).method14195(1929398610);
	}

	@OriginalMember(owner = "client!aol", name = "o", descriptor = "(I)V", line = 27)
	@Override
	public void method17822(@OriginalArg(0) int arg0) {
		super.method17822(44152861);
		((Class156) this.anInterface4_25).method14195(2124516501);
	}
}
