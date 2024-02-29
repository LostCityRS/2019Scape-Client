package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!acu")
public interface Interface7 {

	@OriginalMember(owner = "client!acu", name = "e", descriptor = "(I)I")
	int method30201(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!acu", name = "n", descriptor = "(B)Lclient!acv;")
	Class71 method30202(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!acu", name = "l", descriptor = "()Lclient!acv;")
	Class71 method30203();

	@OriginalMember(owner = "client!acu", name = "k", descriptor = "()I")
	int method30204();

	@OriginalMember(owner = "client!acu", name = "f", descriptor = "()Lclient!acv;")
	Class71 method30205();

	@OriginalMember(owner = "client!acu", name = "w", descriptor = "()Lclient!acv;")
	Class71 method30206();

	@OriginalMember(owner = "client!acu", name = "m", descriptor = "()I")
	int method30207();
}
