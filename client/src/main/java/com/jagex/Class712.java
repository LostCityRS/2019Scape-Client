package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;

@OriginalClass("client!zn")
public final class Class712 implements Interface75 {

	@OriginalMember(owner = "client!zn", name = "i", descriptor = "I")
	public static final int anInt5822 = 4;

	@OriginalMember(owner = "client!zn", name = "t", descriptor = "Lclient!zn;")
	public static final Class712 aClass712_4 = new Class712(0, (byte) -1);

	@OriginalMember(owner = "client!zn", name = "f", descriptor = "Lclient!zn;")
	public static final Class712 aClass712_1 = new Class712(1, (byte) 0);

	@OriginalMember(owner = "client!zn", name = "e", descriptor = "Lclient!zn;")
	public static final Class712 aClass712_2 = new Class712(2, (byte) 1);

	@OriginalMember(owner = "client!zn", name = "u", descriptor = "Lclient!zn;")
	public static final Class712 aClass712_5 = new Class712(3, (byte) 2);

	@OriginalMember(owner = "client!zn", name = "l", descriptor = "Lclient!zn;")
	public static final Class712 aClass712_3 = new Class712(4, (byte) 3);

	@OriginalMember(owner = "client!zn", name = "g", descriptor = "I")
	public final int anInt5823;

	@OriginalMember(owner = "client!zn", name = "m", descriptor = "B")
	public byte aByte165;

	@OriginalMember(owner = "client!zn", name = "t", descriptor = "(I)[Lclient!zn;")
	public static Class712[] method37173(@OriginalArg(0) int arg0) {
		return new Class712[] { aClass712_4, aClass712_1, aClass712_2, aClass712_5, aClass712_3 };
	}

	@OriginalMember(owner = "client!zn", name = "u", descriptor = "()[Lclient!zn;")
	public static Class712[] method37175() {
		return new Class712[] { aClass712_4, aClass712_1, aClass712_2, aClass712_5, aClass712_3 };
	}

	@OriginalMember(owner = "client!zn", name = "l", descriptor = "()[Lclient!zn;")
	public static Class712[] method37176() {
		return new Class712[] { aClass712_4, aClass712_1, aClass712_2, aClass712_5, aClass712_3 };
	}

	@OriginalMember(owner = "client!zn", name = "l", descriptor = "(I)V")
	static void method37178(@OriginalArg(0) int arg0) {
		if (Class677.aFileOutputStream1 != null) {
			try {
				Class677.aFileOutputStream1.close();
			} catch (@Pc(6) IOException local6) {
			}
		}
		Class677.aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!zn", name = "m", descriptor = "(Ljava/lang/Float;Ljava/lang/Float;I)V")
	static void method37179(@OriginalArg(0) Float arg0, @OriginalArg(1) Float arg1, @OriginalArg(2) int arg2) {
		arg1 = 1.0F - arg1;
		if (arg0 < 0.0F) {
			arg0 = 0.0F;
		}
		if (arg1 < 0.0F) {
			arg1 = 0.0F;
		}
		if (arg0 > 1.0F || arg1 > 1.0F) {
			@Pc(56) float local56 = (float) ((double) (arg0 * (arg0 - 2.0F + arg1)) + (double) arg1 * ((double) arg1 - 2.0D) + 1.0D);
			if (Class223.aFloat259 + local56 > 0.0F) {
				Class283.method26875(arg0, arg1, -425166355);
			}
		}
		@Pc(72) Float local72 = 1.0F - arg1;
	}

	@OriginalMember(owner = "client!zn", name = "arp", descriptor = "(Lclient!yp;B)V")
	static void method37180(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		client.aBoolean747 = true;
		Class480.method30005((byte) 12);
	}

	@OriginalMember(owner = "client!zn", name = "<init>", descriptor = "(IB)V")
	Class712(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.anInt5823 = arg0 * -1728615119;
		this.aByte165 = arg1;
	}

	@OriginalMember(owner = "client!zn", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.aByte165;
	}

	@OriginalMember(owner = "client!zn", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.aByte165;
	}

	@OriginalMember(owner = "client!zn", name = "e", descriptor = "(I)I")
	public int method37174(@OriginalArg(0) int arg0) {
		return this.aByte165 + 1;
	}

	@OriginalMember(owner = "client!zn", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.aByte165;
	}

	@OriginalMember(owner = "client!zn", name = "m", descriptor = "()I")
	public int method37177() {
		return this.aByte165 + 1;
	}
}
