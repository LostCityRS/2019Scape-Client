package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public final class Class261 implements Interface26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!fe", name = "this$0", descriptor = "Lclient!gx;")
	final Class303 aClass303_1;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
	final int anInt3907;

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "Z")
	final boolean aBoolean672;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!gx;Lclient!alw;)V")
	Class261(@OriginalArg(0) Class303 arg0, @OriginalArg(1) Class93_Sub41 arg1) {
		this.aClass303_1 = arg0;
		this.anInt3907 = arg1.method22427(-1434290800) * -1775494257;
		this.aBoolean672 = arg1.method22425((short) 16384) == 1;
	}

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "(Lclient!gq;)V")
	@Override
	public void method26806(@OriginalArg(0) Class297 arg0) {
		arg0.method26725(this.anInt3907 * -2090032273, this.aBoolean672, (short) -1208);
		arg0.method26715(this.anInt3907 * -2090032273, -1827643547).method26849(-1942433304);
	}

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "(Lclient!gq;)V")
	@Override
	public void method26807(@OriginalArg(0) Class297 arg0) {
		arg0.method26725(this.anInt3907 * -2090032273, this.aBoolean672, (short) -9255);
		arg0.method26715(this.anInt3907 * -2090032273, -1765980175).method26849(-1942433304);
	}

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "(Lclient!gq;B)V")
	@Override
	public void method26808(@OriginalArg(0) Class297 arg0, @OriginalArg(1) byte arg1) {
		arg0.method26725(this.anInt3907 * -2090032273, this.aBoolean672, (short) -1327);
		arg0.method26715(this.anInt3907 * -2090032273, -1529117410).method26849(-1942433304);
	}
}
