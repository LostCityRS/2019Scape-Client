package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aiu")
final class Class138_Sub4 extends Class138 {

	@OriginalMember(owner = "client!aiu", name = "gy", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method11516(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt6052 -= -725861497;
		@Pc(13) int local13 = arg2.anIntArray521[arg2.anInt6052 * -1497248091];
		@Pc(24) short local24 = (short) arg2.anIntArray521[arg2.anInt6052 * -1497248091 + 1];
		@Pc(35) short local35 = (short) arg2.anIntArray521[arg2.anInt6052 * -1497248091 + 2];
		if (local13 < 0 || local13 >= 5) {
			return;
		}
		arg0.method26994(local13, local24, local35, 941219267);
		Class354.method27789(arg0, -1174743804);
		if (arg0.anInt4011 * 532402067 == -1 && !arg1.aBoolean712) {
			Class225.method25698(arg0.anInt3994 * -1549590237, local13, -1902758533);
		}
	}

	@OriginalMember(owner = "client!aiu", name = "e", descriptor = "(II)Lclient!jf;")
	static Class359 method11517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == Class359.aClass359_3.anInt4729 * 106242889) {
			return Class359.aClass359_3;
		} else if (arg0 == Class359.aClass359_5.anInt4729 * 106242889) {
			return Class359.aClass359_5;
		} else if (arg0 == Class359.aClass359_4.anInt4729 * 106242889) {
			return Class359.aClass359_4;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aiu", name = "<init>", descriptor = "(Lclient!xq;IZZ)V")
	Class138_Sub4(@OriginalArg(0) Class667 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, (Class138_Sub1) null);
	}

	@OriginalMember(owner = "client!aiu", name = "l", descriptor = "(Lclient!ec;)Ljava/lang/Object;")
	@Override
	Object method11524(@OriginalArg(0) Class108 arg0) {
		return arg0.aScriptVarType_6 == ScriptVarType.INT || arg0.aScriptVarType_6 == ScriptVarType.BOOLEAN ? -1 : arg0.aScriptVarType_6.getDefaultValue();
	}

	@OriginalMember(owner = "client!aiu", name = "w", descriptor = "(Lclient!ec;I)Ljava/lang/Object;")
	@Override
	Object method11522(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		return arg0.aScriptVarType_6 == ScriptVarType.INT || arg0.aScriptVarType_6 == ScriptVarType.BOOLEAN ? -1 : arg0.aScriptVarType_6.getDefaultValue();
	}

	@OriginalMember(owner = "client!aiu", name = "u", descriptor = "(Lclient!ec;)Ljava/lang/Object;")
	@Override
	Object method11523(@OriginalArg(0) Class108 arg0) {
		return arg0.aScriptVarType_6 == ScriptVarType.INT || arg0.aScriptVarType_6 == ScriptVarType.BOOLEAN ? -1 : arg0.aScriptVarType_6.getDefaultValue();
	}
}
