package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public final class Class509 implements SerializableEnum {

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
	static int anInt5367;

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "Lclient!ql;")
	static final Class509 aClass509_3 = new Class509(0);

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "Lclient!ql;")
	static final Class509 aClass509_2 = new Class509(1);

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "Lclient!ql;")
	static final Class509 aClass509_1 = new Class509(2);

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
	final int anInt5366;

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "()[Lclient!ql;")
	public static Class509[] method30418() {
		return new Class509[] { aClass509_1, aClass509_3, aClass509_2 };
	}

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "()[Lclient!ql;")
	public static Class509[] method30419() {
		return new Class509[] { aClass509_1, aClass509_3, aClass509_2 };
	}

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "(II)V")
	public static void method30420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class32.method17839(arg0, 1053859546);
	}

	@OriginalMember(owner = "client!ql", name = "ajk", descriptor = "(Lclient!yf;I)V")
	static void method30421(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		arg0.anInt6049 -= 957530791;
	}

	@OriginalMember(owner = "client!ql", name = "amj", descriptor = "(Lclient!yf;I)V")
	static void method30422(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class11.method179(-2122244561);
	}

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(I)V")
	Class509(@OriginalArg(0) int arg0) {
		this.anInt5366 = arg0 * -842351179;
	}

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt5366 * 2001471645;
	}

}
