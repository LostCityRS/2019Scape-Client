package jagex3;

import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ahg")
public final class Class127_Sub1 extends Class127 {

	@OriginalMember(owner = "client!ahg", name = "jg", descriptor = "I")
	static int anInt1036;

	@OriginalMember(owner = "client!ahg", name = "arj", descriptor = "(Lclient!yf;B)V")
	static void method9265(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		client.aBoolean610 = true;
		Class277.method26450((byte) 0);
	}

	@OriginalMember(owner = "client!ahg", name = "<init>", descriptor = "(Ljava/util/Map;)V")
	Class127_Sub1(@OriginalArg(0) Map arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ahg", name = "o", descriptor = "(B)Ljava/lang/Class;")
	@Override
	public Class method27794(@OriginalArg(0) byte arg0) {
		return Class379.class;
	}

	@OriginalMember(owner = "client!ahg", name = "v", descriptor = "(ILclient!ao;I)Lclient!ay;")
	@Override
	public Interface13 method27796(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2) {
		return new Class379(arg0, this);
	}

	@OriginalMember(owner = "client!ahg", name = "q", descriptor = "(ILclient!ao;)Lclient!ay;")
	@Override
	public Interface13 method27797(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class379(arg0, this);
	}

	@OriginalMember(owner = "client!ahg", name = "s", descriptor = "(ILclient!ao;)Lclient!ay;")
	@Override
	public Interface13 method27793(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class379(arg0, this);
	}

	@OriginalMember(owner = "client!ahg", name = "y", descriptor = "(ILclient!ao;)Lclient!ay;")
	@Override
	public Interface13 method27795(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class379(arg0, this);
	}

	@OriginalMember(owner = "client!ahg", name = "x", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method27798() {
		return Class379.class;
	}
}
