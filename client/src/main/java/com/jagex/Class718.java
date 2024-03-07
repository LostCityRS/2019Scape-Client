package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zu")
public class Class718 implements Interface75 {

	@OriginalMember(owner = "client!zu", name = "e", descriptor = "Lclient!zu;")
	public static final Class718 aClass718_2 = new Class718(0, "");

	@OriginalMember(owner = "client!zu", name = "n", descriptor = "Lclient!zu;")
	public static final Class718 aClass718_1 = new Class718(1, "");

	@OriginalMember(owner = "client!zu", name = "m", descriptor = "I")
	final int anInt5964;

	@OriginalMember(owner = "client!zu", name = "<init>", descriptor = "(ILjava/lang/String;)V", line = 10)
	Class718(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		this.anInt5964 = arg0 * 489803697;
	}

	@OriginalMember(owner = "client!zu", name = "n", descriptor = "()I", line = 15)
	@Override
	public int getId() {
		return this.anInt5964 * -1350231727;
	}

	@OriginalMember(owner = "client!zu", name = "k", descriptor = "()I", line = 15)
	@Override
	public int method36919() {
		return this.anInt5964 * -1350231727;
	}

	@OriginalMember(owner = "client!zu", name = "j", descriptor = "(III)I", line = 1613)
	static final int method36900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(35) int local35 = Class172.method23247(arg0 - 1, arg1 - 1, -477508561) + Class172.method23247(arg0 + 1, arg1 - 1, 1021794419) + Class172.method23247(arg0 - 1, arg1 + 1, -106035870) + Class172.method23247(arg0 + 1, arg1 + 1, -1490960142);
		@Pc(63) int local63 = Class172.method23247(arg0 - 1, arg1, -497583460) + Class172.method23247(arg0 + 1, arg1, 786097930) + Class172.method23247(arg0, arg1 - 1, 620789460) + Class172.method23247(arg0, arg1 + 1, -2018869124);
		@Pc(68) int local68 = Class172.method23247(arg0, arg1, -1982182737);
		return local63 / 8 + local35 / 16 + local68 / 4;
	}

	@OriginalMember(owner = "client!zu", name = "yo", descriptor = "(Lclient!yf;I)V", line = 9250)
	static final void method36901(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.anInt3560 * 988143729;
	}
}
