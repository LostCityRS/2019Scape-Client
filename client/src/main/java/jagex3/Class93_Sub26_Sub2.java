package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arb")
public final class Class93_Sub26_Sub2 extends Class93_Sub26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!arb", name = "this$0", descriptor = "Lclient!kd;")
	final Class375 aClass375_2;

	@OriginalMember(owner = "client!arb", name = "k", descriptor = "I")
	int anInt2997;

	@OriginalMember(owner = "client!arb", name = "<init>", descriptor = "(Lclient!kd;)V")
	Class93_Sub26_Sub2(@OriginalArg(0) Class375 arg0) {
		this.aClass375_2 = arg0;
		this.anInt2997 = -1470702081;
	}

	@OriginalMember(owner = "client!arb", name = "f", descriptor = "(Lclient!kr;)V")
	@Override
	void method22002(@OriginalArg(0) Class386 arg0) {
		arg0.method28356(this.anInt2997 * 148561409, -806252046);
	}

	@OriginalMember(owner = "client!arb", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	void method22005(@OriginalArg(0) Class93_Sub41 arg0) {
		this.anInt2997 = arg0.method22427(-1434290800) * 1470702081;
	}

	@OriginalMember(owner = "client!arb", name = "n", descriptor = "(Lclient!kr;I)V")
	@Override
	void method22004(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		arg0.method28356(this.anInt2997 * 148561409, -1829791051);
	}

	@OriginalMember(owner = "client!arb", name = "k", descriptor = "(Lclient!kr;)V")
	@Override
	void method22006(@OriginalArg(0) Class386 arg0) {
		arg0.method28356(this.anInt2997 * 148561409, -2075981733);
	}

	@OriginalMember(owner = "client!arb", name = "w", descriptor = "(Lclient!kr;)V")
	@Override
	void method22007(@OriginalArg(0) Class386 arg0) {
		arg0.method28356(this.anInt2997 * 148561409, 174986520);
	}

	@OriginalMember(owner = "client!arb", name = "e", descriptor = "(Lclient!alw;B)V")
	@Override
	void method22003(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		this.anInt2997 = arg0.method22427(-1434290800) * 1470702081;
	}
}
