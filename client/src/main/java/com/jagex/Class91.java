package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!adx")
public final class Class91 implements Interface75 {

	@OriginalMember(owner = "client!adx", name = "t", descriptor = "Lclient!adx;")
	public static final Class91 aClass91_9 = new Class91(0, 0, "", "");

	@OriginalMember(owner = "client!adx", name = "f", descriptor = "Lclient!adx;")
	static final Class91 aClass91_1 = new Class91(6, 1, "", "");

	@OriginalMember(owner = "client!adx", name = "e", descriptor = "Lclient!adx;")
	static final Class91 aClass91_5 = new Class91(7, 2, "", "");

	@OriginalMember(owner = "client!adx", name = "u", descriptor = "Lclient!adx;")
	public static final Class91 aClass91_2 = new Class91(1, 3, "", "");

	@OriginalMember(owner = "client!adx", name = "l", descriptor = "Lclient!adx;")
	static final Class91 aClass91_3 = new Class91(5, 4, "", "");

	@OriginalMember(owner = "client!adx", name = "g", descriptor = "Lclient!adx;")
	public static final Class91 aClass91_4 = new Class91(3, 5, "", "");

	@OriginalMember(owner = "client!adx", name = "i", descriptor = "Lclient!adx;")
	public static final Class91 aClass91_7 = new Class91(2, 6, "", "");

	@OriginalMember(owner = "client!adx", name = "m", descriptor = "Lclient!adx;")
	static final Class91 aClass91_6 = new Class91(8, 7, "", "");

	@OriginalMember(owner = "client!adx", name = "o", descriptor = "Lclient!adx;")
	public static final Class91 aClass91_8 = new Class91(4, -1, "", "", true, new Class91[] { aClass91_9, aClass91_1, aClass91_5, aClass91_3, aClass91_2 });

	@OriginalMember(owner = "client!adx", name = "j", descriptor = "I")
	final int anInt325;

	@OriginalMember(owner = "client!adx", name = "a", descriptor = "I")
	final int anInt324;

	@OriginalMember(owner = "client!adx", name = "s", descriptor = "Ljava/lang/String;")
	final String aString14;

	@OriginalMember(owner = "client!adx", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lclient!adx;)V")
	Class91(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class91[] arg5) {
		this.anInt325 = arg0 * -864203905;
		this.anInt324 = arg1 * -1998561309;
		this.aString14 = arg3;
	}

	@OriginalMember(owner = "client!adx", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
	Class91(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.anInt325 = arg0 * -864203905;
		this.anInt324 = arg1 * -1998561309;
		this.aString14 = arg3;
	}

	@OriginalMember(owner = "client!adx", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt324 * 1460657611;
	}

	@OriginalMember(owner = "client!adx", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return this.aString14;
	}

	@OriginalMember(owner = "client!adx", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt324 * 1460657611;
	}

	@OriginalMember(owner = "client!adx", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt324 * 1460657611;
	}

	@OriginalMember(owner = "client!adx", name = "rx", descriptor = "()Ljava/lang/String;")
	public String method1875() {
		return this.aString14;
	}

	@OriginalMember(owner = "client!adx", name = "ri", descriptor = "()Ljava/lang/String;")
	public String method1876() {
		return this.aString14;
	}
}
