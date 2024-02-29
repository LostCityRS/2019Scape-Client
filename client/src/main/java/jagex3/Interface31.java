package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jy")
public interface Interface31 {

	@OriginalMember(owner = "client!jy", name = "m", descriptor = "(Lclient!jl;I)Lclient!jn;")
	Interface29 method36884(@OriginalArg(0) Class363 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jy", name = "n", descriptor = "(Lclient!jl;I)Lclient!jn;")
	Interface29 method36885(@OriginalArg(0) Class363 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jy", name = "e", descriptor = "(Lclient!jl;IB)Lclient!jn;")
	Interface29 method36886(@OriginalArg(0) Class363 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2);
}
