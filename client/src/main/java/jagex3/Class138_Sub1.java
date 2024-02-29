package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aib")
final class Class138_Sub1 extends Class138 {

	@OriginalMember(owner = "client!aib", name = "pw", descriptor = "(Lclient!yf;B)V")
	static void method10336(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class183.method24585(local11, local14, arg0, -811394430);
	}

	@OriginalMember(owner = "client!aib", name = "<init>", descriptor = "(Lclient!xq;IZZ)V")
	Class138_Sub1(@OriginalArg(0) Class667 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, (Class138_Sub1) null);
	}

	@OriginalMember(owner = "client!aib", name = "u", descriptor = "(Lclient!ec;)Ljava/lang/Object;")
	@Override
	Object method11523(@OriginalArg(0) Class108 arg0) {
		return arg0.aScriptVarType_6 == ScriptVarType.BOOLEAN ? -1 : arg0.aScriptVarType_6.getDefaultValue();
	}

	@OriginalMember(owner = "client!aib", name = "l", descriptor = "(Lclient!ec;)Ljava/lang/Object;")
	@Override
	Object method11524(@OriginalArg(0) Class108 arg0) {
		return arg0.aScriptVarType_6 == ScriptVarType.BOOLEAN ? -1 : arg0.aScriptVarType_6.getDefaultValue();
	}

	@OriginalMember(owner = "client!aib", name = "w", descriptor = "(Lclient!ec;I)Ljava/lang/Object;")
	@Override
	Object method11522(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		return arg0.aScriptVarType_6 == ScriptVarType.BOOLEAN ? -1 : arg0.aScriptVarType_6.getDefaultValue();
	}
}
