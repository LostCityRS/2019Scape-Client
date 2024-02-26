package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class442 {

	@OriginalMember(owner = "client!nm", name = "t", descriptor = "Lclient!nm;")
	public static final Class442 aClass442_9 = new Class442(3);

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "Lclient!nm;")
	public static final Class442 aClass442_1 = new Class442(7);

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "Lclient!nm;")
	public static final Class442 aClass442_2 = new Class442(9);

	@OriginalMember(owner = "client!nm", name = "u", descriptor = "Lclient!nm;")
	public static final Class442 aClass442_3 = new Class442(11);

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "Lclient!nm;")
	public static final Class442 aClass442_11 = new Class442(1);

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "Lclient!nm;")
	public static final Class442 aClass442_5 = new Class442(6);

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "Lclient!nm;")
	public static final Class442 aClass442_6 = new Class442(5);

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "Lclient!nm;")
	public static final Class442 aClass442_7 = new Class442(2);

	@OriginalMember(owner = "client!nm", name = "o", descriptor = "Lclient!nm;")
	public static final Class442 aClass442_8 = new Class442(4);

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "Lclient!nm;")
	public static final Class442 aClass442_4 = new Class442(8);

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "Lclient!nm;")
	public static final Class442 aClass442_10 = new Class442(13);

	@OriginalMember(owner = "client!nm", name = "s", descriptor = "Lclient!nm;")
	static final Class442 aClass442_13 = new Class442(10);

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "Lclient!nm;")
	static final Class442 aClass442_12 = new Class442(12);

	@OriginalMember(owner = "client!nm", name = "x", descriptor = "I")
	final int anInt4878;

	@OriginalMember(owner = "client!nm", name = "axo", descriptor = "(Lclient!yp;I)V")
	static void method29209(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(24) int local24 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		Class90.method1869(local24, local11, arg0, (byte) -1);
	}

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(I)V")
	Class442(@OriginalArg(0) int arg0) {
		this.anInt4878 = arg0 * -1701297763;
	}

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "(I)Ljava/lang/Object;")
	public Object method29190(@OriginalArg(0) int arg0) throws Throwable {
		return Class64.method1221(Class306.anApplet1, this.method29196(2081262890), 20937170);
	}

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "()Ljava/lang/String;")
	public String method29191() {
		return "_" + this.anInt4878 * -408204107;
	}

	@OriginalMember(owner = "client!nm", name = "s", descriptor = "()Ljava/lang/Object;")
	public Object method29192() throws Throwable {
		return Class64.method1221(Class306.anApplet1, this.method29196(-1869103043), 20937170);
	}

	@OriginalMember(owner = "client!nm", name = "x", descriptor = "()Ljava/lang/Object;")
	public Object method29193() throws Throwable {
		return Class64.method1221(Class306.anApplet1, this.method29196(775412779), 20937170);
	}

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "(I)V")
	public void method29194(@OriginalArg(0) int arg0) {
		try {
			this.method29190(1629135454);
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!nm", name = "u", descriptor = "([Ljava/lang/Object;I)V")
	public void method29195(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.method29203(arg0, (byte) 111);
		} catch (@Pc(6) Throwable local6) {
		}
	}

	@OriginalMember(owner = "client!nm", name = "t", descriptor = "(I)Ljava/lang/String;")
	public String method29196(@OriginalArg(0) int arg0) {
		return "_" + this.anInt4878 * -408204107;
	}

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "([Ljava/lang/Object;)Ljava/lang/Object;")
	public Object method29197(@OriginalArg(0) Object[] arg0) throws Throwable {
		return Class64.method1220(Class306.anApplet1, this.method29196(-748841341), arg0, (byte) 96);
	}

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "([Ljava/lang/Object;)Ljava/lang/Object;")
	public Object method29198(@OriginalArg(0) Object[] arg0) throws Throwable {
		return Class64.method1220(Class306.anApplet1, this.method29196(-1540751048), arg0, (byte) 61);
	}

	@OriginalMember(owner = "client!nm", name = "o", descriptor = "([Ljava/lang/Object;)Ljava/lang/Object;")
	public Object method29199(@OriginalArg(0) Object[] arg0) throws Throwable {
		return Class64.method1220(Class306.anApplet1, this.method29196(318935383), arg0, (byte) 42);
	}

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "([Ljava/lang/Object;)Ljava/lang/Object;")
	public Object method29200(@OriginalArg(0) Object[] arg0) throws Throwable {
		return Class64.method1220(Class306.anApplet1, this.method29196(-834341743), arg0, (byte) 98);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "()Ljava/lang/Object;")
	public Object method29201() throws Throwable {
		return Class64.method1221(Class306.anApplet1, this.method29196(-1283846068), 20937170);
	}

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "()Ljava/lang/Object;")
	public Object method29202() throws Throwable {
		return Class64.method1221(Class306.anApplet1, this.method29196(1138352924), 20937170);
	}

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "([Ljava/lang/Object;B)Ljava/lang/Object;")
	public Object method29203(@OriginalArg(0) Object[] arg0, @OriginalArg(1) byte arg1) throws Throwable {
		return Class64.method1220(Class306.anApplet1, this.method29196(-1063702378), arg0, (byte) 26);
	}

	@OriginalMember(owner = "client!nm", name = "w", descriptor = "()Ljava/lang/Object;")
	public Object method29204() throws Throwable {
		return Class64.method1221(Class306.anApplet1, this.method29196(1041604881), 20937170);
	}

	@OriginalMember(owner = "client!nm", name = "r", descriptor = "([Ljava/lang/Object;)V")
	public void method29205(@OriginalArg(0) Object[] arg0) {
		try {
			this.method29203(arg0, (byte) 15);
		} catch (@Pc(6) Throwable local6) {
		}
	}

	@OriginalMember(owner = "client!nm", name = "q", descriptor = "([Ljava/lang/Object;)V")
	public void method29206(@OriginalArg(0) Object[] arg0) {
		try {
			this.method29203(arg0, (byte) 71);
		} catch (@Pc(6) Throwable local6) {
		}
	}

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "()V")
	public void method29207() {
		try {
			this.method29190(1774296671);
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "()V")
	public void method29208() {
		try {
			this.method29190(538167849);
		} catch (@Pc(5) Throwable local5) {
		}
	}
}
