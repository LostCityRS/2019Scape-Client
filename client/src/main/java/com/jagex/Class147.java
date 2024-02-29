package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public abstract class Class147 {

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V", line = 6)
	Class147() {
	}

	@OriginalMember(owner = "client!sr", name = "x", descriptor = "()Lclient!sr;", line = 11)
	public static Class147 method12684() {
		try {
			return new Class147_Sub2();
		} catch (@Pc(4) Throwable local4) {
			return new Class147_Sub1();
		}
	}

	@OriginalMember(owner = "client!sr", name = "q", descriptor = "()Lclient!sr;", line = 11)
	public static Class147 method12685() {
		try {
			return new Class147_Sub2();
		} catch (@Pc(4) Throwable local4) {
			return new Class147_Sub1();
		}
	}

	@OriginalMember(owner = "client!sr", name = "n", descriptor = "(J)I", line = 19)
	final int method12686(@OriginalArg(0) long arg0) {
		@Pc(3) long local3 = this.method12692(-261970263);
		if (local3 > 0L) {
			Class212.method25431(local3);
		}
		return this.method12693(arg0);
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(J)I", line = 19)
	final int method12687(@OriginalArg(0) long arg0) {
		@Pc(3) long local3 = this.method12692(-627329361);
		if (local3 > 0L) {
			Class212.method25431(local3);
		}
		return this.method12693(arg0);
	}

	@OriginalMember(owner = "client!sr", name = "io", descriptor = "(B)V", line = 5579)
	static final void method12688(@OriginalArg(0) byte arg0) {
		@Pc(2) Iterator local2 = client.aClass16_21.iterator();
		while (local2.hasNext()) {
			@Pc(9) Class93_Sub1_Sub9 local9 = (Class93_Sub1_Sub9) local2.next();
			@Pc(12) Class132_Sub1_Sub1_Sub5 local12 = local9.aClass132_Sub1_Sub1_Sub5_1;
			local12.method24093(1, -1562858572);
			if (local12.method24097(943040433)) {
				local9.method23969(-889254931);
				local12.method24109((byte) 106);
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "afu", descriptor = "(Lclient!yf;I)V", line = 10593)
	static final void method12689(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class498.method30134((char) local12, (byte) 1) ? 1 : 0;
	}

	@OriginalMember(owner = "client!sr", name = "ana", descriptor = "(Lclient!yf;I)V", line = 12244)
	static final void method12690(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 1;
	}

	@OriginalMember(owner = "client!sr", name = "m", descriptor = "(B)V")
	abstract void method12691(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!sr", name = "k", descriptor = "(I)J")
	abstract long method12692(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "(J)I")
	abstract int method12693(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!sr", name = "l", descriptor = "()V")
	abstract void method12694();

	@OriginalMember(owner = "client!sr", name = "u", descriptor = "()J")
	abstract long method12695();

	@OriginalMember(owner = "client!sr", name = "z", descriptor = "(J)I")
	abstract int method12696(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "(J)I")
	abstract int method12697(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "(J)I")
	abstract int method12698(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(J)I")
	abstract int method12699(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!sr", name = "o", descriptor = "()J")
	abstract long method12700();

	@OriginalMember(owner = "client!sr", name = "v", descriptor = "()J")
	abstract long method12701();

	@OriginalMember(owner = "client!sr", name = "r", descriptor = "(J)I")
	abstract int method12702(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!sr", name = "s", descriptor = "()J")
	abstract long method12703();

	@OriginalMember(owner = "client!sr", name = "y", descriptor = "()J")
	abstract long method12704();

	@OriginalMember(owner = "client!sr", name = "w", descriptor = "(I)J")
	abstract long method12705(@OriginalArg(0) int arg0);
}
