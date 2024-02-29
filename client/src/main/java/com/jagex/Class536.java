package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class Class536 {

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "Lclient!rs;")
	static final Class536 aClass536_7 = new Class536(0);

	@OriginalMember(owner = "client!rs", name = "n", descriptor = "Lclient!rs;")
	public static final Class536 aClass536_1 = new Class536(1);

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "Lclient!rs;")
	public static final Class536 aClass536_3 = new Class536(2);

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "Lclient!rs;")
	public static final Class536 aClass536_4 = new Class536(3);

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "Lclient!rs;")
	public static final Class536 aClass536_5 = new Class536(4);

	@OriginalMember(owner = "client!rs", name = "w", descriptor = "Lclient!rs;")
	public static final Class536 aClass536_6 = new Class536(5);

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "Lclient!rs;")
	public static final Class536 aClass536_2 = new Class536(6);

	@OriginalMember(owner = "client!rs", name = "u", descriptor = "Lclient!rs;")
	public static final Class536 aClass536_8 = new Class536(7);

	@OriginalMember(owner = "client!rs", name = "z", descriptor = "Lclient!rs;")
	static final Class536 aClass536_9 = new Class536(8);

	@OriginalMember(owner = "client!rs", name = "p", descriptor = "Lclient!rs;")
	public static final Class536 aClass536_10 = new Class536(9);

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
	final int anInt5277;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(I)V", line = 17)
	Class536(@OriginalArg(0) int arg0) {
		this.anInt5277 = arg0 * -746331161;
	}

	@OriginalMember(owner = "client!rs", name = "n", descriptor = "(I)V", line = 30)
	public static void method30758(@OriginalArg(0) int arg0) {
		if (Class670.aClass146_6 != null) {
			Class670.aClass146_6.method11680((byte) -68);
			Class670.aClass146_6 = null;
		}
	}

	@OriginalMember(owner = "client!rs", name = "ajt", descriptor = "(Lclient!yf;B)V", line = 11469)
	static final void method30759(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= 1189701933;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
	}
}
