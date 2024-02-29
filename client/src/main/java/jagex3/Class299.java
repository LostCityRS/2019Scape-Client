package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public final class Class299 implements SerializableEnum {

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "Lclient!gs;")
	static final Class299 aClass299_13 = new Class299(1, 1);

	@OriginalMember(owner = "client!gs", name = "n", descriptor = "Lclient!gs;")
	static final Class299 aClass299_2 = new Class299(9, 2);

	@OriginalMember(owner = "client!gs", name = "m", descriptor = "Lclient!gs;")
	static final Class299 aClass299_11 = new Class299(6, 3);

	@OriginalMember(owner = "client!gs", name = "k", descriptor = "Lclient!gs;")
	static final Class299 aClass299_4 = new Class299(10, 4);

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "Lclient!gs;")
	static final Class299 aClass299_7 = new Class299(7, 5);

	@OriginalMember(owner = "client!gs", name = "w", descriptor = "Lclient!gs;")
	static final Class299 aClass299_5 = new Class299(2, 6);

	@OriginalMember(owner = "client!gs", name = "l", descriptor = "Lclient!gs;")
	static final Class299 aClass299_6 = new Class299(11, 7);

	@OriginalMember(owner = "client!gs", name = "u", descriptor = "Lclient!gs;")
	static final Class299 aClass299_3 = new Class299(4, 8);

	@OriginalMember(owner = "client!gs", name = "z", descriptor = "Lclient!gs;")
	static final Class299 aClass299_8 = new Class299(13, 9);

	@OriginalMember(owner = "client!gs", name = "p", descriptor = "Lclient!gs;")
	static final Class299 aClass299_9 = new Class299(5, 10);

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "Lclient!gs;")
	static final Class299 aClass299_10 = new Class299(0, 11);

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "Lclient!gs;")
	static final Class299 aClass299_14 = new Class299(8, 12);

	@OriginalMember(owner = "client!gs", name = "r", descriptor = "Lclient!gs;")
	static final Class299 aClass299_12 = new Class299(3, 13);

	@OriginalMember(owner = "client!gs", name = "v", descriptor = "Lclient!gs;")
	static final Class299 aClass299_1 = new Class299(12, 14);

	@OriginalMember(owner = "client!gs", name = "o", descriptor = "I")
	final int anInt3968;

	@OriginalMember(owner = "client!gs", name = "s", descriptor = "I")
	final int anInt3969;

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "()[Lclient!gs;")
	static Class299[] method26801() {
		return new Class299[] { aClass299_10, aClass299_13, aClass299_5, aClass299_12, aClass299_3, aClass299_9, aClass299_11, aClass299_7, aClass299_14, aClass299_2, aClass299_4, aClass299_6, aClass299_1, aClass299_8 };
	}

	@OriginalMember(owner = "client!gs", name = "m", descriptor = "()[Lclient!gs;")
	static Class299[] method26802() {
		return new Class299[] { aClass299_10, aClass299_13, aClass299_5, aClass299_12, aClass299_3, aClass299_9, aClass299_11, aClass299_7, aClass299_14, aClass299_2, aClass299_4, aClass299_6, aClass299_1, aClass299_8 };
	}

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "(B)[Lclient!gs;")
	static Class299[] method26803(@OriginalArg(0) byte arg0) {
		return new Class299[] { aClass299_10, aClass299_13, aClass299_5, aClass299_12, aClass299_3, aClass299_9, aClass299_11, aClass299_7, aClass299_14, aClass299_2, aClass299_4, aClass299_6, aClass299_1, aClass299_8 };
	}

	@OriginalMember(owner = "client!gs", name = "s", descriptor = "(Lclient!zx;I)V")
	static void method26804(@OriginalArg(0) Class721 arg0, @OriginalArg(1) int arg1) {
		Class103.aClass721_1 = arg0;
	}

	@OriginalMember(owner = "client!gs", name = "x", descriptor = "(S)I")
	static int method26805(@OriginalArg(0) short arg0) {
		return 13;
	}

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(II)V")
	Class299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3968 = arg0 * -1711021243;
		this.anInt3969 = arg1 * -861184277;
	}

	@OriginalMember(owner = "client!gs", name = "n", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt3969 * 145054147;
	}

}
