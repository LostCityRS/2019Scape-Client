package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public final class Class308 {

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
	int anInt3988;

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "[F")
	float[] aFloatArray103;

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
	int anInt3989;

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "Z")
	boolean aBoolean683;

	// $FF: synthetic field
	@OriginalMember(owner = "client!hb", name = "this$0", descriptor = "Lclient!hk;")
	final Class315 aClass315_2;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!hk;)V")
	Class308(@OriginalArg(0) Class315 arg0) {
		this.aClass315_2 = arg0;
	}
}
