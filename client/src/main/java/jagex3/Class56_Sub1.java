package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!apq")
public final class Class56_Sub1 extends Class56 {

	@OriginalMember(owner = "client!apq", name = "<init>", descriptor = "(Lclient!py;I)V")
	Class56_Sub1(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!apq", name = "q", descriptor = "(ILclient!ao;)Lclient!ay;")
	@Override
	public Interface13 method27797(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class65(arg0, this);
	}

	@OriginalMember(owner = "client!apq", name = "o", descriptor = "(B)Ljava/lang/Class;")
	@Override
	public Class method27794(@OriginalArg(0) byte arg0) {
		return Class65.class;
	}

	@OriginalMember(owner = "client!apq", name = "s", descriptor = "(ILclient!ao;)Lclient!ay;")
	@Override
	public Interface13 method27793(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class65(arg0, this);
	}

	@OriginalMember(owner = "client!apq", name = "y", descriptor = "(ILclient!ao;)Lclient!ay;")
	@Override
	public Interface13 method27795(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class65(arg0, this);
	}

	@OriginalMember(owner = "client!apq", name = "v", descriptor = "(ILclient!ao;I)Lclient!ay;")
	@Override
	public Interface13 method27796(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2) {
		return new Class65(arg0, this);
	}

	@OriginalMember(owner = "client!apq", name = "x", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method27798() {
		return Class65.class;
	}
}
