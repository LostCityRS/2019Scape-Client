package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public abstract class Class147 {

	@OriginalMember(owner = "client!sr", name = "x", descriptor = "()Lclient!sr;")
	public static Class147 method12685() {
		try {
			return new Class147_Sub2();
		} catch (@Pc(4) Throwable local4) {
			return new Class147_Sub1();
		}
	}

	@OriginalMember(owner = "client!sr", name = "q", descriptor = "()Lclient!sr;")
	public static Class147 method12702() {
		try {
			return new Class147_Sub2();
		} catch (@Pc(4) Throwable local4) {
			return new Class147_Sub1();
		}
	}

	@OriginalMember(owner = "client!sr", name = "ana", descriptor = "(Lclient!yf;I)V")
	static void method12703(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 1;
	}

	@OriginalMember(owner = "client!sr", name = "io", descriptor = "(B)V")
	static void method12704(@OriginalArg(0) byte arg0) {
		@Pc(2) Iterator local2 = client.aClass16_21.iterator();
		while (local2.hasNext()) {
			@Pc(9) Class93_Sub1_Sub9 local9 = (Class93_Sub1_Sub9) local2.next();
			@Pc(12) Class132_Sub1_Sub1_Sub5 local12 = local9.aClass132_Sub1_Sub1_Sub5_1;
			local12.method24105(1, -1562858572);
			if (local12.method24106(943040433)) {
				local9.method23981(-889254931);
				local12.method24108((byte) 106);
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "afu", descriptor = "(Lclient!yf;I)V")
	static void method12705(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class498.method30317((char) local12, (byte) 1) ? 1 : 0;
	}

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V")
	Class147() {
	}

	@OriginalMember(owner = "client!sr", name = "m", descriptor = "(B)V")
	abstract void method12684(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!sr", name = "n", descriptor = "(J)I")
	final int method12686(@OriginalArg(0) long arg0) {
		@Pc(3) long local3 = this.method12687(-261970263);
		if (local3 > 0L) {
			Class212.method25532(local3);
		}
		return this.method12688(arg0);
	}

	@OriginalMember(owner = "client!sr", name = "k", descriptor = "(I)J")
	abstract long method12687(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "(J)I")
	abstract int method12688(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(J)I")
	final int method12689(@OriginalArg(0) long arg0) {
		@Pc(3) long local3 = this.method12687(-627329361);
		if (local3 > 0L) {
			Class212.method25532(local3);
		}
		return this.method12688(arg0);
	}

	@OriginalMember(owner = "client!sr", name = "l", descriptor = "()V")
	abstract void method12690();

	@OriginalMember(owner = "client!sr", name = "u", descriptor = "()J")
	abstract long method12691();

	@OriginalMember(owner = "client!sr", name = "z", descriptor = "(J)I")
	abstract int method12692(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "(J)I")
	abstract int method12693(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "(J)I")
	abstract int method12694(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(J)I")
	abstract int method12695(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!sr", name = "o", descriptor = "()J")
	abstract long method12696();

	@OriginalMember(owner = "client!sr", name = "v", descriptor = "()J")
	abstract long method12697();

	@OriginalMember(owner = "client!sr", name = "r", descriptor = "(J)I")
	abstract int method12698(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!sr", name = "s", descriptor = "()J")
	abstract long method12699();

	@OriginalMember(owner = "client!sr", name = "y", descriptor = "()J")
	abstract long method12700();

	@OriginalMember(owner = "client!sr", name = "w", descriptor = "(I)J")
	abstract long method12701(@OriginalArg(0) int arg0);
}
