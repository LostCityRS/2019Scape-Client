package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public class Class318 {

	@OriginalMember(owner = "client!hn", name = "ac", descriptor = "I")
	static int anInt4095;

	@OriginalMember(owner = "client!hn", name = "n", descriptor = "Ljava/lang/String;")
	public String aString170;

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "[Lclient!hc;")
	public Class309[] aClass309Array1;

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "Ljava/lang/String;")
	public String aString171;

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "[Lclient!hc;")
	public Class309[] aClass309Array2;

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "Ljava/lang/String;")
	public String aString172;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V", line = 99)
	Class318() {
	}

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "(Lclient!hw;I)V", line = 102)
	void method27210(@OriginalArg(0) Class326 arg0, @OriginalArg(1) int arg1) {
		this.aString172 = arg0.method27309(867966216);
		this.aString170 = arg0.method27309(940618055);
		this.aString171 = arg0.method27309(1099444221);
		@Pc(18) int local18 = arg0.method27305(989114354);
		@Pc(22) int local22 = arg0.method27305(2069902156);
		this.aClass309Array1 = local18 == 0 ? null : new Class309[local18];
		this.aClass309Array2 = local22 == 0 ? null : new Class309[local22];
		@Pc(42) int local42;
		for (local42 = 0; local42 < local18; local42++) {
			this.aClass309Array1[local42] = new Class309();
			this.aClass309Array1[local42].method26824(arg0, -1007806172);
		}
		for (local42 = 0; local42 < local22; local42++) {
			this.aClass309Array2[local42] = new Class309();
			this.aClass309Array2[local42].method26824(arg0, -2125892504);
		}
	}

	@OriginalMember(owner = "client!hn", name = "n", descriptor = "(Lclient!hw;)V", line = 102)
	void method27211(@OriginalArg(0) Class326 arg0) {
		this.aString172 = arg0.method27309(1139616875);
		this.aString170 = arg0.method27309(-790536842);
		this.aString171 = arg0.method27309(-2071559287);
		@Pc(18) int local18 = arg0.method27305(1301324530);
		@Pc(22) int local22 = arg0.method27305(317767928);
		this.aClass309Array1 = local18 == 0 ? null : new Class309[local18];
		this.aClass309Array2 = local22 == 0 ? null : new Class309[local22];
		@Pc(42) int local42;
		for (local42 = 0; local42 < local18; local42++) {
			this.aClass309Array1[local42] = new Class309();
			this.aClass309Array1[local42].method26824(arg0, -1797098882);
		}
		for (local42 = 0; local42 < local22; local42++) {
			this.aClass309Array2[local42] = new Class309();
			this.aClass309Array2[local42].method26824(arg0, -845531580);
		}
	}

	@OriginalMember(owner = "client!hn", name = "ev", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 5753)
	static final void method27212(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5891 -= -725861497;
		arg0.anInt4000 = arg2.anIntArray519[arg2.anInt5891 * -1497248091] * 1207360067;
		arg0.anInt4024 = arg2.anIntArray519[-1497248091 * arg2.anInt5891 + 1] * -1404993885;
		arg0.anInt4005 = arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 2] * -16467593;
		Class354.method27694(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!hn", name = "yb", descriptor = "(Lclient!yf;B)V", line = 9284)
	static final void method27213(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class480.method29744(local12, false, (short) -31596);
	}
}
