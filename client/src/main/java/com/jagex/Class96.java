package com.jagex;

import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public abstract class Class96 {

	@OriginalMember(owner = "client!ch", name = "iu", descriptor = "Ljava/util/Map;")
	public static Map aMap9;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V", line = 4)
	Class96() {
	}

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "(I)Lclient!yf;", line = 204)
	static final Class681 method2324(@OriginalArg(0) int arg0) {
		if (Class687.anInt5907 * 804584787 == Class687.anArrayList5.size()) {
			Class687.anArrayList5.add(new Class681());
		}
		@Pc(18) Class681 local18 = (Class681) Class687.anArrayList5.get(Class687.anInt5907 * 804584787);
		Class687.anInt5907 += 1465143003;
		return local18;
	}

	@OriginalMember(owner = "client!ch", name = "ch", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 5421)
	static final void method2325(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.aBoolean693 = arg2.anIntArray519[(arg2.anInt5891 -= 1189701933) * -1497248091] == 1;
		Class354.method27694(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!ch", name = "op", descriptor = "(Lclient!yf;B)V", line = 7581)
	static final void method2326(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 115171127);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class528.method30394(local16, local22, arg0, (byte) 47);
	}

	@OriginalMember(owner = "client!ch", name = "ady", descriptor = "(Lclient!yf;S)V", line = 10196)
	static final void method2327(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(31) int local31 = client.aClass531ArrayArray1[local23][local13].method30429(-1831329000);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local31 == 5 ? 1 : 0;
	}
}
