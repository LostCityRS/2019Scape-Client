package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xh")
public final class Class660 implements Interface75 {

	@OriginalMember(owner = "client!xh", name = "t", descriptor = "Lclient!xh;")
	static final Class660 aClass660_4 = new Class660(1, 0);

	@OriginalMember(owner = "client!xh", name = "f", descriptor = "Lclient!xh;")
	public static final Class660 aClass660_3 = new Class660(3, 1);

	@OriginalMember(owner = "client!xh", name = "e", descriptor = "Lclient!xh;")
	public static final Class660 aClass660_5 = new Class660(2, 2);

	@OriginalMember(owner = "client!xh", name = "u", descriptor = "Lclient!xh;")
	public static final Class660 aClass660_6 = new Class660(0, 3);

	@OriginalMember(owner = "client!xh", name = "l", descriptor = "I")
	public final int anInt5684;

	@OriginalMember(owner = "client!xh", name = "g", descriptor = "I")
	final int anInt5683;

	@OriginalMember(owner = "client!xh", name = "t", descriptor = "(I)[Lclient!xh;")
	public static Class660[] method33289(@OriginalArg(0) int arg0) {
		return new Class660[] { aClass660_6, aClass660_4, aClass660_5, aClass660_3 };
	}

	@OriginalMember(owner = "client!xh", name = "e", descriptor = "()[Lclient!xh;")
	public static Class660[] method33290() {
		return new Class660[] { aClass660_6, aClass660_4, aClass660_5, aClass660_3 };
	}

	@OriginalMember(owner = "client!xh", name = "afr", descriptor = "(Lclient!yp;I)V")
	static void method33291(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		@Pc(26) int local26 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local13 + local26;
	}

	@OriginalMember(owner = "client!xh", name = "<init>", descriptor = "(II)V")
	Class660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5684 = arg0 * 1092506975;
		this.anInt5683 = arg1 * -1138408209;
	}

	@OriginalMember(owner = "client!xh", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt5683 * 622488079;
	}

	@OriginalMember(owner = "client!xh", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt5683 * 622488079;
	}

	@OriginalMember(owner = "client!xh", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt5683 * 622488079;
	}
}
