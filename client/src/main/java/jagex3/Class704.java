package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zg")
public final class Class704 implements SerializableEnum {

	@OriginalMember(owner = "client!zg", name = "e", descriptor = "Lclient!zg;")
	public static final Class704 aClass704_5 = new Class704(-2);

	@OriginalMember(owner = "client!zg", name = "n", descriptor = "Lclient!zg;")
	public static final Class704 aClass704_3 = new Class704(-3);

	@OriginalMember(owner = "client!zg", name = "m", descriptor = "Lclient!zg;")
	public static final Class704 aClass704_2 = new Class704(2);

	@OriginalMember(owner = "client!zg", name = "k", descriptor = "Lclient!zg;")
	public static final Class704 aClass704_4 = new Class704(3);

	@OriginalMember(owner = "client!zg", name = "f", descriptor = "Lclient!zg;")
	static final Class704 aClass704_6 = new Class704(4);

	@OriginalMember(owner = "client!zg", name = "w", descriptor = "I")
	final int anInt6115;

	@OriginalMember(owner = "client!zg", name = "f", descriptor = "()[Lclient!zg;")
	public static Class704[] method36909() {
		return new Class704[] { aClass704_2, aClass704_6, aClass704_5, aClass704_4, aClass704_3 };
	}

	@OriginalMember(owner = "client!zg", name = "m", descriptor = "()[Lclient!zg;")
	public static Class704[] method36910() {
		return new Class704[] { aClass704_2, aClass704_6, aClass704_5, aClass704_4, aClass704_3 };
	}

	@OriginalMember(owner = "client!zg", name = "w", descriptor = "()[Lclient!zg;")
	public static Class704[] method36911() {
		return new Class704[] { aClass704_2, aClass704_6, aClass704_5, aClass704_4, aClass704_3 };
	}

	@OriginalMember(owner = "client!zg", name = "d", descriptor = "(Ljava/lang/CharSequence;I)I")
	public static int method36912(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!zg", name = "ea", descriptor = "(ILjava/lang/String;ZB)V")
	static void method36913(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		Class560.method31316((byte) 117);
		Class507.method30410(1540843203);
		Class84.method1430(-1123473883);
		Class293.method26681(arg0, arg1, arg2, 1740907889);
		Class157.aClass462_2.method29418((short) -12940);
		Class157.aClass462_2.method29417(client.anInterface50_1, 1664109974);
		Class157.aClass462_2.method29424((byte) 0);
		Class520.method30520(Class694.aClass104_14, 1725558139);
		Class379.method28282(Class694.aClass104_14, Class110_Sub7.aClass497_22, -1050916289);
		Class389.method28447((byte) 31);
		Class635.method32622((short) 255);
		Class610.method32202(-1355392527);
		if (client.anInt3435 * -849002901 == 4) {
			Class481.method29937(10, 1823202236);
		} else if (client.anInt3435 * -849002901 == 13) {
			Class481.method29937(6, 1823202236);
		} else if (client.anInt3435 * -849002901 == 15) {
			Class481.method29937(16, 1823202236);
		} else if (client.anInt3435 * -849002901 == 18) {
			Class481.method29937(3, 1823202236);
		} else if (client.anInt3435 * -849002901 == 11 || client.anInt3435 * -849002901 == 1) {
			Exception_Sub1.method17643(-738493458);
		} else if (client.anInt3435 * -849002901 == 0) {
			Class481.method29937(8, 1823202236);
		} else if (client.anInt3435 * -849002901 == 3) {
			Class707.method36933(false, (byte) 1);
		}
	}

	@OriginalMember(owner = "client!zg", name = "ln", descriptor = "(S)Z")
	static boolean method36914(@OriginalArg(0) short arg0) {
		client.anInt3455 += -1136575289;
		client.aBoolean636 = true;
		return true;
	}

	@OriginalMember(owner = "client!zg", name = "bz", descriptor = "(III)B")
	static byte method36915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Class615.aClass615_6.anInt5789 * 948246811 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!zg", name = "<init>", descriptor = "(I)V")
	Class704(@OriginalArg(0) int arg0) {
		this.anInt6115 = arg0 * 1236995261;
	}

	@OriginalMember(owner = "client!zg", name = "n", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt6115 * -1656729963;
	}

}
