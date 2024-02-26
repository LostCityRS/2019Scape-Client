package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class590 implements Interface75 {

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "Lclient!ud;")
	static final Class590 aClass590_2 = new Class590(0);

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "Lclient!ud;")
	public static final Class590 aClass590_3 = new Class590(1);

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
	int anInt5315;

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "()[Lclient!ud;")
	static Class590[] method31913() {
		return new Class590[] { aClass590_3, aClass590_2 };
	}

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "()[Lclient!ud;")
	static Class590[] method31914() {
		return new Class590[] { aClass590_3, aClass590_2 };
	}

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "()[Lclient!ud;")
	static Class590[] method31915() {
		return new Class590[] { aClass590_3, aClass590_2 };
	}

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "()[Lclient!ud;")
	static Class590[] method31916() {
		return new Class590[] { aClass590_3, aClass590_2 };
	}

	@OriginalMember(owner = "client!ud", name = "azx", descriptor = "(Lclient!yp;I)V")
	static void method31917(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!ud", name = "agg", descriptor = "(Lclient!yp;I)V")
	static void method31918(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		@Pc(26) int local26 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(32) Class15 local32 = Class317.aClass464_1.method29594(client.anInterface49_1, local26, (byte) 1);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local32.method374(local13, Class344.aClass99Array6, -1786920312);
	}

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)I")
	public static int method31919(@OriginalArg(0) int arg0) {
		return Class365.aClass369_1.method28297(-1586984437);
	}

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "(IB)Z")
	public static boolean method31920(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return arg0 >= Class607.aClass607_17.anInt5396 * 1323580581 && arg0 <= Class607.aClass607_4.anInt5396 * 1323580581;
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(I)V")
	Class590(@OriginalArg(0) int arg0) {
		this.anInt5315 = arg0 * -806913359;
	}

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt5315 * 838110801;
	}

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt5315 * 838110801;
	}

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt5315 * 838110801;
	}
}
