package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class561 {

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "I")
	public int anInt5189;

	@OriginalMember(owner = "client!sv", name = "u", descriptor = "I")
	public int anInt5190;

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "I")
	public int anInt5191;

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
	public int anInt5188 = -1389203317;

	@OriginalMember(owner = "client!sv", name = "t", descriptor = "Lclient!aad;")
	public final Class6 aClass6_9;

	@OriginalMember(owner = "client!sv", name = "abe", descriptor = "(Lclient!yp;I)V")
	static void method31425(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (client.anInt3577 * 740205413 == 2 && local12 < client.anInt3573 * 975306769) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aClass676Array1[local12].aBoolean983 ? 1 : 0;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!sv", name = "aba", descriptor = "(Lclient!yp;B)V")
	static void method31426(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) ((Class303.method27111((byte) 57) - Class134.aClass305_1.method27136(-2064047106) - Class231.aLong355 * -6086046986162291493L) / 1000L);
	}

	@OriginalMember(owner = "client!sv", name = "art", descriptor = "(Lclient!yp;I)V")
	static void method31427(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub26_1, arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] == 1 ? 1 : 0, (byte) 78);
		client.aClass539_1.method30938(1550327889);
		Class719.method37291(1744126177);
		client.aBoolean714 = false;
	}

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lclient!ahb;)V")
	Class561(@OriginalArg(0) Class120_Sub1_Sub1_Sub1 arg0) {
		this.aClass6_9 = new Class6_Sub1(arg0, false);
	}
}
