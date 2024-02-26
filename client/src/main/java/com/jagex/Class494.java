package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class494 implements Interface6 {

	@OriginalMember(owner = "client!pu", name = "f", descriptor = "Z")
	final boolean aBoolean883;

	@OriginalMember(owner = "client!pu", name = "t", descriptor = "Ljava/lang/String;")
	final String aString213;

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "Z")
	boolean aBoolean884;

	@OriginalMember(owner = "client!pu", name = "awd", descriptor = "(Lclient!yp;I)V")
	static void method30292(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class163_Sub1 local2 = Class614.method32269(222714909);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local2 == null ? 0 : local2.anInt2081 * -682140789;
	}

	@OriginalMember(owner = "client!pu", name = "qx", descriptor = "(Lclient!yp;I)V")
	static void method30293(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class661.method33317(local11, local14, arg0, 1141532829);
	}

	@OriginalMember(owner = "client!pu", name = "aym", descriptor = "(Lclient!yp;B)V")
	static void method30294(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		if (client.aBoolean705) {
			Class442.aClass442_6.method29194(-874429244);
		}
	}

	@OriginalMember(owner = "client!pu", name = "wu", descriptor = "(Lclient!yp;B)V")
	static void method30295(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 1593803993;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(43) int local43 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 3];
		@Pc(53) int local53 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 4];
		Class490.aClass263_13.method26532(Class280.aClass280_9, local13, local23, local43, Class278.aClass278_5.method26831(-183770081), Class269.aClass269_5, 0.0F, 0.0F, null, 0, local53, local33, 2090470240);
	}

	@OriginalMember(owner = "client!pu", name = "t", descriptor = "([BI)[B")
	public static byte[] method30296(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(7) byte[] local7 = new byte[arg0.length];
			System.arraycopy(arg0, 0, local7, 0, arg0.length);
			return local7;
		}
	}

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "(I)V")
	public static void method30297(@OriginalArg(0) int arg0) {
		Class86.aClass99_2 = null;
		Class27.anInt83 = -208096495;
	}

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	Class494(@OriginalArg(0) String arg0) {
		this(arg0, false);
	}

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Ljava/lang/String;Z)V")
	Class494(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		this.aString213 = arg0;
		this.aBoolean883 = arg1;
	}

	@OriginalMember(owner = "client!pu", name = "t", descriptor = "(B)I")
	@Override
	public int method30349(@OriginalArg(0) byte arg0) {
		if (this.aBoolean884) {
			return 100;
		}
		try {
			return Class373.aClass586_1.method31865(this.aString213, this.aBoolean883, (byte) 122);
		} catch (@Pc(13) Exception_Sub1 local13) {
			Class115_Sub1.method8671(Class70.aClass70_2, local13.aString70, local13.anInt2514 * -1965296183, local13.getCause(), -199906023);
			this.aBoolean884 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!pu", name = "l", descriptor = "()I")
	@Override
	public int method30353() {
		if (this.aBoolean884) {
			return 100;
		}
		try {
			return Class373.aClass586_1.method31865(this.aString213, this.aBoolean883, (byte) 63);
		} catch (@Pc(13) Exception_Sub1 local13) {
			Class115_Sub1.method8671(Class70.aClass70_2, local13.aString70, local13.anInt2514 * -1965296183, local13.getCause(), -199906023);
			this.aBoolean884 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!pu", name = "j", descriptor = "(I)V")
	void method30286(@OriginalArg(0) int arg0) {
		this.aBoolean884 = true;
	}

	@OriginalMember(owner = "client!pu", name = "f", descriptor = "(I)Lclient!acr;")
	@Override
	public Class67 method30347(@OriginalArg(0) int arg0) {
		return Class67.aClass67_4;
	}

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "()I")
	@Override
	public int method30348() {
		if (this.aBoolean884) {
			return 100;
		}
		try {
			return Class373.aClass586_1.method31865(this.aString213, this.aBoolean883, (byte) 125);
		} catch (@Pc(13) Exception_Sub1 local13) {
			Class115_Sub1.method8671(Class70.aClass70_2, local13.aString70, local13.anInt2514 * -1965296183, local13.getCause(), -199906023);
			this.aBoolean884 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!pu", name = "u", descriptor = "()I")
	@Override
	public int method30350() {
		if (this.aBoolean884) {
			return 100;
		}
		try {
			return Class373.aClass586_1.method31865(this.aString213, this.aBoolean883, (byte) 124);
		} catch (@Pc(13) Exception_Sub1 local13) {
			Class115_Sub1.method8671(Class70.aClass70_2, local13.aString70, local13.anInt2514 * -1965296183, local13.getCause(), -199906023);
			this.aBoolean884 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!pu", name = "s", descriptor = "()Z")
	boolean method30287() {
		return this.aBoolean884;
	}

	@OriginalMember(owner = "client!pu", name = "g", descriptor = "()I")
	@Override
	public int method30352() {
		if (this.aBoolean884) {
			return 100;
		}
		try {
			return Class373.aClass586_1.method31865(this.aString213, this.aBoolean883, (byte) 59);
		} catch (@Pc(13) Exception_Sub1 local13) {
			Class115_Sub1.method8671(Class70.aClass70_2, local13.aString70, local13.anInt2514 * -1965296183, local13.getCause(), -199906023);
			this.aBoolean884 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!pu", name = "i", descriptor = "()Lclient!acr;")
	@Override
	public Class67 method30346() {
		return Class67.aClass67_4;
	}

	@OriginalMember(owner = "client!pu", name = "m", descriptor = "()Lclient!acr;")
	@Override
	public Class67 method30351() {
		return Class67.aClass67_4;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "()Z")
	boolean method30288() {
		return this.aBoolean884;
	}

	@OriginalMember(owner = "client!pu", name = "x", descriptor = "()V")
	void method30289() {
		this.aBoolean884 = true;
	}

	@OriginalMember(owner = "client!pu", name = "k", descriptor = "()V")
	void method30290() {
		this.aBoolean884 = true;
	}

	@OriginalMember(owner = "client!pu", name = "o", descriptor = "(I)Z")
	boolean method30291(@OriginalArg(0) int arg0) {
		return this.aBoolean884;
	}
}
