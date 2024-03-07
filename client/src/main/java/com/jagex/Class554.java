package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public class Class554 {

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
	public int anInt5320;

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
	public int anInt5321;

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
	public int anInt5322;

	@OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
	public int anInt5319 = 1020147287;

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "Lclient!aaq;")
	public final Class19 aClass19_7;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lclient!ahm;)V", line = 12)
	Class554(@OriginalArg(0) Class132_Sub1_Sub1_Sub1 arg0) {
		this.aClass19_7 = new Class19_Sub1(arg0, false);
	}

	@OriginalMember(owner = "client!sl", name = "n", descriptor = "(Lclient!yf;I)V", line = 21)
	static void method31049(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class520.method30341(-1526076606);
	}

	@OriginalMember(owner = "client!sl", name = "ge", descriptor = "(Lclient!uq;IIILclient!do;I)V", line = 72)
	static void method31050(@OriginalArg(0) Class600 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class109 arg4, @OriginalArg(5) int arg5) {
		if (arg4 != null) {
			arg0.method31840(arg1, arg2, arg3, arg4.method6899(), arg4.method6901(), arg4.method6902(), arg4.method6917(), arg4.method6879(), arg4.method6905(), arg4.method6957());
		}
	}

	@OriginalMember(owner = "client!sl", name = "alw", descriptor = "(Lclient!yf;B)V", line = 11777)
	static final void method31051(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(29) int local29 = local23 >> 14 & 0x3FFF;
		@Pc(33) int local33 = local23 & 0x3FFF;
		@Pc(39) int local39 = Class553.method24937(local13, local29, local33, 1250225578);
		if (local39 < 0) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local39;
		}
	}

	@OriginalMember(owner = "client!sl", name = "azb", descriptor = "(Lclient!yf;I)V", line = 14157)
	static final void method31052(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.options.aClass166_Sub6_1.method15478((short) 256) ? 1 : 0;
	}
}
