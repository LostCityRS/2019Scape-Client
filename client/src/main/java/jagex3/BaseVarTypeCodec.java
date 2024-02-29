package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ade")
public interface BaseVarTypeCodec {

	@OriginalMember(owner = "client!ade", name = "e", descriptor = "(Lclient!alw;I)Ljava/lang/Object;")
	Object decode(@OriginalArg(0) Class93_Sub41 arg0);
}
