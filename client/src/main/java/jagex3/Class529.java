package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class529 {

	@OriginalMember(owner = "client!rg", name = "pe", descriptor = "I")
	public static int anInt5391;

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "Lclient!rg;")
	static final Class529 aClass529_3 = new Class529();

	@OriginalMember(owner = "client!rg", name = "n", descriptor = "Lclient!rg;")
	public static final Class529 aClass529_2 = new Class529();

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "Lclient!rg;")
	public static final Class529 aClass529_1 = new Class529();

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "Lclient!rg;")
	static final Class529 aClass529_4 = new Class529();

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "(I)Z")
	static boolean method30578(@OriginalArg(0) int arg0) {
		Class411.anInt4875 = -1680223351;
		Class411.aClass175_3 = client.aClass175_2;
		return Class507.method30409(Class411.aLong274 * 4457507688757033075L == -1L, true, "", "", Class411.aLong274 * 4457507688757033075L);
	}

	@OriginalMember(owner = "client!rg", name = "n", descriptor = "(II)Lclient!zd;")
	public static Class702 method30579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class702[] local2 = Class520.method30524((byte) -91);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class702 local12 = local2[local4];
			if (arg0 == local12.anInt6114 * -1111983921) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(B)[Lclient!aaa;")
	static Class3[] method30580(@OriginalArg(0) byte arg0) {
		return new Class3[] { Class3.aClass3_4, Class3.aClass3_1, Class3.aClass3_2, Class3.aClass3_3, Class3.aClass3_5 };
	}

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "(IS)I")
	static int method30581(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		return arg0 < 7 ? 8 : 11;
	}

	@OriginalMember(owner = "client!rg", name = "ze", descriptor = "(Lclient!yf;I)V")
	static void method30582(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		@Pc(47) String local47 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		if (local23 == -1) {
			throw new RuntimeException();
		}
		@Pc(60) Class39 local60 = (Class39) Class19.aClass32_Sub7_5.method18273(local23, 493731023);
		if (local60.aScriptVarType_2.getId() != local13) {
			throw new RuntimeException();
		} else if (local60.aScriptVarType_1.getId() == ScriptVarType.STRING.getId()) {
			@Pc(84) int[] local84 = local60.method767(local47, -1497248091);
			if (local33 < 0 || local84 == null || local84.length <= local33) {
				throw new RuntimeException();
			}
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local84[local33];
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
	Class529() {
	}
}
