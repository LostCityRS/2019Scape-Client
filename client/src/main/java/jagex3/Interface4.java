package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!abs")
public interface Interface4 {

	@OriginalMember(owner = "client!abs", name = "s", descriptor = "(ILclient!ao;)Lclient!ay;")
	Interface13 method27793(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1);

	@OriginalMember(owner = "client!abs", name = "o", descriptor = "(B)Ljava/lang/Class;")
	Class method27794(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!abs", name = "y", descriptor = "(ILclient!ao;)Lclient!ay;")
	Interface13 method27795(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1);

	@OriginalMember(owner = "client!abs", name = "v", descriptor = "(ILclient!ao;I)Lclient!ay;")
	Interface13 method27796(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!abs", name = "q", descriptor = "(ILclient!ao;)Lclient!ay;")
	Interface13 method27797(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1);

	@OriginalMember(owner = "client!abs", name = "x", descriptor = "()Ljava/lang/Class;")
	Class method27798();
}
