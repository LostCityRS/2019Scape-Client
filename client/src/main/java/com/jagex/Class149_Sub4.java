package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajn")
public class Class149_Sub4 extends Class149 {

	@OriginalMember(owner = "client!ajn", name = "k", descriptor = "Lclient!ajn;")
	public Class149_Sub4 aClass149_Sub4_7;

	@OriginalMember(owner = "client!ajn", name = "m", descriptor = "Lclient!ajn;")
	public Class149_Sub4 aClass149_Sub4_8;

	@OriginalMember(owner = "client!ajn", name = "du", descriptor = "(Lclient!yf;B)V")
	static void method23786(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 942046040);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class686.method33665(local16, local22, arg0, 1725600539);
	}

	@OriginalMember(owner = "client!ajn", name = "m", descriptor = "()V")
	public final void method23784() {
		if (this.aClass149_Sub4_7 != null) {
			this.aClass149_Sub4_7.aClass149_Sub4_8 = this.aClass149_Sub4_8;
			this.aClass149_Sub4_8.aClass149_Sub4_7 = this.aClass149_Sub4_7;
			this.aClass149_Sub4_8 = null;
			this.aClass149_Sub4_7 = null;
		}
	}

	@OriginalMember(owner = "client!ajn", name = "n", descriptor = "(I)V")
	public final void method23785(@OriginalArg(0) int arg0) {
		if (this.aClass149_Sub4_7 != null) {
			this.aClass149_Sub4_7.aClass149_Sub4_8 = this.aClass149_Sub4_8;
			this.aClass149_Sub4_8.aClass149_Sub4_7 = this.aClass149_Sub4_7;
			this.aClass149_Sub4_8 = null;
			this.aClass149_Sub4_7 = null;
		}
	}
}
