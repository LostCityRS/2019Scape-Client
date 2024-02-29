package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ari")
public final class Class93_Sub26_Sub6 extends Class93_Sub26 {

	@OriginalMember(owner = "client!ari", name = "ig", descriptor = "Lclient!adm;")
	public static Class79_Sub1_Sub2 aClass79_Sub1_Sub2_3;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ari", name = "this$0", descriptor = "Lclient!kd;")
	final Class375 aClass375_6;

	@OriginalMember(owner = "client!ari", name = "k", descriptor = "I")
	int anInt3007;

	@OriginalMember(owner = "client!ari", name = "<init>", descriptor = "(Lclient!kd;)V")
	Class93_Sub26_Sub6(@OriginalArg(0) Class375 arg0) {
		this.aClass375_6 = arg0;
		this.anInt3007 = 1040572283;
	}

	@OriginalMember(owner = "client!ari", name = "f", descriptor = "(Lclient!kr;)V")
	@Override
	void method22002(@OriginalArg(0) Class386 arg0) {
		arg0.method28353(this.anInt3007 * -448473011, 242463394);
	}

	@OriginalMember(owner = "client!ari", name = "n", descriptor = "(Lclient!kr;I)V")
	@Override
	void method22004(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		arg0.method28353(this.anInt3007 * -448473011, 1353883713);
	}

	@OriginalMember(owner = "client!ari", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	void method22005(@OriginalArg(0) Class93_Sub41 arg0) {
		this.anInt3007 = arg0.method22427(-1434290800) * -1040572283;
	}

	@OriginalMember(owner = "client!ari", name = "k", descriptor = "(Lclient!kr;)V")
	@Override
	void method22006(@OriginalArg(0) Class386 arg0) {
		arg0.method28353(this.anInt3007 * -448473011, -1707577054);
	}

	@OriginalMember(owner = "client!ari", name = "e", descriptor = "(Lclient!alw;B)V")
	@Override
	void method22003(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		this.anInt3007 = arg0.method22427(-1434290800) * -1040572283;
	}

	@OriginalMember(owner = "client!ari", name = "w", descriptor = "(Lclient!kr;)V")
	@Override
	void method22007(@OriginalArg(0) Class386 arg0) {
		arg0.method28353(this.anInt3007 * -448473011, -1765568141);
	}
}
