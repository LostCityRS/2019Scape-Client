package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public class Class447 {

	@OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
	static int anInt4954;

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "Lclient!ns;")
	public static final Class447 aClass447_13 = new Class447(3);

	@OriginalMember(owner = "client!ns", name = "n", descriptor = "Lclient!ns;")
	public static final Class447 aClass447_2 = new Class447(7);

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "Lclient!ns;")
	public static final Class447 aClass447_1 = new Class447(9);

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "Lclient!ns;")
	public static final Class447 aClass447_5 = new Class447(11);

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "Lclient!ns;")
	public static final Class447 aClass447_4 = new Class447(1);

	@OriginalMember(owner = "client!ns", name = "w", descriptor = "Lclient!ns;")
	public static final Class447 aClass447_3 = new Class447(6);

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "Lclient!ns;")
	public static final Class447 aClass447_6 = new Class447(5);

	@OriginalMember(owner = "client!ns", name = "u", descriptor = "Lclient!ns;")
	public static final Class447 aClass447_7 = new Class447(2);

	@OriginalMember(owner = "client!ns", name = "z", descriptor = "Lclient!ns;")
	public static final Class447 aClass447_8 = new Class447(4);

	@OriginalMember(owner = "client!ns", name = "p", descriptor = "Lclient!ns;")
	public static final Class447 aClass447_9 = new Class447(8);

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "Lclient!ns;")
	public static final Class447 aClass447_10 = new Class447(13);

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "Lclient!ns;")
	static final Class447 aClass447_11 = new Class447(10);

	@OriginalMember(owner = "client!ns", name = "r", descriptor = "Lclient!ns;")
	static final Class447 aClass447_12 = new Class447(12);

	@OriginalMember(owner = "client!ns", name = "v", descriptor = "I")
	final int anInt4953;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(I)V", line = 36)
	Class447(@OriginalArg(0) int arg0) {
		this.anInt4953 = arg0 * -1876733335;
	}

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "(B)Ljava/lang/String;", line = 41)
	public String method28900(@OriginalArg(0) byte arg0) {
		return "_" + this.anInt4953 * -767074855;
	}

	@OriginalMember(owner = "client!ns", name = "w", descriptor = "()Ljava/lang/String;", line = 41)
	public String method28901() {
		return "_" + this.anInt4953 * -767074855;
	}

	@OriginalMember(owner = "client!ns", name = "u", descriptor = "([Ljava/lang/Object;)Ljava/lang/Object;", line = 45)
	public Object method28902(@OriginalArg(0) Object[] arg0) throws Throwable {
		return Class70.method1238(Class32_Sub10.anApplet2, this.method28900((byte) -58), arg0, -946348026);
	}

	@OriginalMember(owner = "client!ns", name = "z", descriptor = "([Ljava/lang/Object;)Ljava/lang/Object;", line = 45)
	public Object method28903(@OriginalArg(0) Object[] arg0) throws Throwable {
		return Class70.method1238(Class32_Sub10.anApplet2, this.method28900((byte) -18), arg0, -1421675881);
	}

	@OriginalMember(owner = "client!ns", name = "n", descriptor = "([Ljava/lang/Object;I)Ljava/lang/Object;", line = 45)
	public Object method28904(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1) throws Throwable {
		return Class70.method1238(Class32_Sub10.anApplet2, this.method28900((byte) -26), arg0, -477969301);
	}

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "([Ljava/lang/Object;)Ljava/lang/Object;", line = 45)
	public Object method28905(@OriginalArg(0) Object[] arg0) throws Throwable {
		return Class70.method1238(Class32_Sub10.anApplet2, this.method28900((byte) -26), arg0, -1552428073);
	}

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "(S)Ljava/lang/Object;", line = 49)
	public Object method28906(@OriginalArg(0) short arg0) throws Throwable {
		return Class70.method1237(Class32_Sub10.anApplet2, this.method28900((byte) -42), 2105786931);
	}

	@OriginalMember(owner = "client!ns", name = "p", descriptor = "()Ljava/lang/Object;", line = 49)
	public Object method28907() throws Throwable {
		return Class70.method1237(Class32_Sub10.anApplet2, this.method28900((byte) -57), 1992977010);
	}

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "()Ljava/lang/Object;", line = 49)
	public Object method28908() throws Throwable {
		return Class70.method1237(Class32_Sub10.anApplet2, this.method28900((byte) -71), 1770799661);
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "([Ljava/lang/Object;)V", line = 54)
	public void method28909(@OriginalArg(0) Object[] arg0) {
		try {
			this.method28904(arg0, 1075418221);
		} catch (@Pc(6) Throwable local6) {
		}
	}

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "([Ljava/lang/Object;I)V", line = 54)
	public void method28910(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.method28904(arg0, 1546713970);
		} catch (@Pc(6) Throwable local6) {
		}
	}

	@OriginalMember(owner = "client!ns", name = "v", descriptor = "([Ljava/lang/Object;)V", line = 54)
	public void method28911(@OriginalArg(0) Object[] arg0) {
		try {
			this.method28904(arg0, -1412600140);
		} catch (@Pc(6) Throwable local6) {
		}
	}

	@OriginalMember(owner = "client!ns", name = "r", descriptor = "([Ljava/lang/Object;)V", line = 54)
	public void method28912(@OriginalArg(0) Object[] arg0) {
		try {
			this.method28904(arg0, -1482318139);
		} catch (@Pc(6) Throwable local6) {
		}
	}

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "(I)V", line = 61)
	public void method28913(@OriginalArg(0) int arg0) {
		try {
			this.method28906((short) 255);
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!ns", name = "o", descriptor = "()V", line = 61)
	public void method28914() {
		try {
			this.method28906((short) 255);
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!ns", name = "s", descriptor = "()V", line = 61)
	public void method28915() {
		try {
			this.method28906((short) 255);
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!ns", name = "s", descriptor = "(Lclient!yf;I)V", line = 88)
	static void method28916(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class353.method27685((byte) 35) ? 1 : 0;
	}

	@OriginalMember(owner = "client!ns", name = "sn", descriptor = "(Lclient!yf;I)V", line = 8218)
	static final void method28917(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local11.anInt4042 * 1502707537;
	}

	@OriginalMember(owner = "client!ns", name = "avk", descriptor = "(Lclient!yf;I)V", line = 13477)
	static final void method28918(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
