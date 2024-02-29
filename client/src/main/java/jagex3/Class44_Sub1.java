package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aow")
public final class Class44_Sub1 extends Class44 {

	@OriginalMember(owner = "client!aow", name = "l", descriptor = "(Lclient!alw;II)Lclient!asy;")
	static Class93_Sub1_Sub20 method17444(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(30) Class93_Sub1_Sub20 local30 = new Class93_Sub1_Sub20(arg1, arg0.method22439(1660144684), arg0.method22439(507085097), arg0.method22431(-118643075), arg0.method22431(-118643075), arg0.method22425((short) 16384) == 1, arg0.method22425((short) 16384), arg0.method22425((short) 16384));
		@Pc(34) int local34 = arg0.method22425((short) 16384);
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			local30.aClass22_42.method407(new Class93_Sub32(arg0.method22425((short) 16384), arg0.method22427(-1434290800), arg0.method22427(-1434290800), arg0.method22427(-1434290800), arg0.method22427(-1434290800), arg0.method22427(-1434290800), arg0.method22427(-1434290800), arg0.method22427(-1434290800), arg0.method22427(-1434290800)), 156232669);
		}
		local30.method23182((short) -1937);
		return local30;
	}

	@OriginalMember(owner = "client!aow", name = "bdn", descriptor = "(Lclient!yf;I)V")
	static void method17445(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!aow", name = "<init>", descriptor = "(Lclient!zd;Lclient!zt;ZLclient!py;Lclient!ao;)V")
	Class44_Sub1(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class497 arg3, @OriginalArg(4) Interface11 arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aow", name = "y", descriptor = "(ILclient!ao;)Lclient!ay;")
	@Override
	public Interface13 method27795(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class47(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!aow", name = "x", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method27798() {
		return Class47.class;
	}

	@OriginalMember(owner = "client!aow", name = "s", descriptor = "(ILclient!ao;)Lclient!ay;")
	@Override
	public Interface13 method27793(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class47(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!aow", name = "v", descriptor = "(ILclient!ao;I)Lclient!ay;")
	@Override
	public Interface13 method27796(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2) {
		return new Class47(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!aow", name = "q", descriptor = "(ILclient!ao;)Lclient!ay;")
	@Override
	public Interface13 method27797(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class47(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!aow", name = "o", descriptor = "(B)Ljava/lang/Class;")
	@Override
	public Class method27794(@OriginalArg(0) byte arg0) {
		return Class47.class;
	}
}
