package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xc")
public final class Class656 implements Interface75 {

	@OriginalMember(owner = "client!xc", name = "un", descriptor = "I")
	static int anInt5677;

	@OriginalMember(owner = "client!xc", name = "t", descriptor = "Lclient!xc;")
	public static final Class656 aClass656_5 = new Class656(0);

	@OriginalMember(owner = "client!xc", name = "f", descriptor = "Lclient!xc;")
	static final Class656 aClass656_1 = new Class656(1);

	@OriginalMember(owner = "client!xc", name = "e", descriptor = "Lclient!xc;")
	static final Class656 aClass656_3 = new Class656(2);

	@OriginalMember(owner = "client!xc", name = "u", descriptor = "Lclient!xc;")
	static final Class656 aClass656_2 = new Class656(3);

	@OriginalMember(owner = "client!xc", name = "l", descriptor = "Lclient!xc;")
	static final Class656 aClass656_4 = new Class656(4);

	@OriginalMember(owner = "client!xc", name = "g", descriptor = "I")
	int anInt5676;

	@OriginalMember(owner = "client!xc", name = "nv", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method33222(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -2025759763) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray30 = Class431.method29089(local13, arg2, 1777193330);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!xc", name = "<init>", descriptor = "(I)V")
	Class656(@OriginalArg(0) int arg0) {
		this.anInt5676 = arg0 * -1384494647;
	}

	@OriginalMember(owner = "client!xc", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt5676 * 891953273;
	}

	@OriginalMember(owner = "client!xc", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt5676 * 891953273;
	}

	@OriginalMember(owner = "client!xc", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt5676 * 891953273;
	}
}
