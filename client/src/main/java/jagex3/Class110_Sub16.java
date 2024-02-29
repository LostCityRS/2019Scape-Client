package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!agn")
public final class Class110_Sub16 extends Class110 {

	@OriginalMember(owner = "client!agn", name = "n", descriptor = "I")
	final int anInt967;

	@OriginalMember(owner = "client!agn", name = "m", descriptor = "I")
	final int anInt968;

	@OriginalMember(owner = "client!agn", name = "<init>", descriptor = "(Lclient!alw;)V")
	Class110_Sub16(@OriginalArg(0) Class93_Sub41 arg0) {
		super(arg0);
		this.anInt967 = arg0.method22427(-1434290800) * -1119162511;
		this.anInt968 = arg0.method22425((short) 16384) * -821623023;
	}

	@OriginalMember(owner = "client!agn", name = "n", descriptor = "(I)V")
	@Override
	public void method20150(@OriginalArg(0) int arg0) {
		Class274.aClass258_11.method26155(this.anInt967 * 1995829649, this.anInt968 * 343329265, 1631428105);
	}

	@OriginalMember(owner = "client!agn", name = "f", descriptor = "()V")
	@Override
	public void method20152() {
		Class274.aClass258_11.method26155(this.anInt967 * 1995829649, this.anInt968 * 343329265, 1631428105);
	}
}
