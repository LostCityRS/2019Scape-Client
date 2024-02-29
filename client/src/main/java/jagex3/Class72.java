package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!acw")
public final class Class72 implements SerializableEnum {

	@OriginalMember(owner = "client!acw", name = "ln", descriptor = "I")
	public static int anInt241;

	@OriginalMember(owner = "client!acw", name = "hv", descriptor = "Lclient!adm;")
	public static Class79_Sub1_Sub2 aClass79_Sub1_Sub2_2;

	@OriginalMember(owner = "client!acw", name = "e", descriptor = "Lclient!acw;")
	public static final Class72 aClass72_1 = new Class72(0);

	@OriginalMember(owner = "client!acw", name = "n", descriptor = "Lclient!acw;")
	public static final Class72 aClass72_2 = new Class72(1);

	@OriginalMember(owner = "client!acw", name = "m", descriptor = "I")
	final int anInt240;

	@OriginalMember(owner = "client!acw", name = "bde", descriptor = "(Lclient!yf;B)V")
	static void method1253(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class78.method1317(Class159_Sub1.anInt1948 * -1131450757, -460060699);
	}

	@OriginalMember(owner = "client!acw", name = "<init>", descriptor = "(I)V")
	Class72(@OriginalArg(0) int arg0) {
		this.anInt240 = arg0 * -1850367747;
	}

	@OriginalMember(owner = "client!acw", name = "n", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt240 * 1422097493;
	}

}
