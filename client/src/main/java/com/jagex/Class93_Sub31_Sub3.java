package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aru")
public final class Class93_Sub31_Sub3 extends Class93_Sub31 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!aru", name = "this$0", descriptor = "Lclient!kc;")
	final Class374 aClass374_3;

	@OriginalMember(owner = "client!aru", name = "k", descriptor = "I")
	int anInt3042;

	@OriginalMember(owner = "client!aru", name = "<init>", descriptor = "(Lclient!kc;)V")
	Class93_Sub31_Sub3(@OriginalArg(0) Class374 arg0) {
		this.aClass374_3 = arg0;
		this.anInt3042 = -650162691;
	}

	@OriginalMember(owner = "client!aru", name = "e", descriptor = "(Lclient!alw;I)V")
	@Override
	void method22023(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.anInt3042 = arg0.method22427(-1434290800) * 650162691;
		arg0.method22425((short) 16384);
		if (arg0.method22425((short) 16384) != 255) {
			arg0.anInt3070 -= -1445626955;
			arg0.method22435(-1868055989);
		}
	}

	@OriginalMember(owner = "client!aru", name = "w", descriptor = "(Lclient!akr;)V")
	@Override
	void method22022(@OriginalArg(0) Class93_Sub28 arg0) {
		arg0.method13825(this.anInt3042 * -1600976725, 1671520445);
	}

	@OriginalMember(owner = "client!aru", name = "n", descriptor = "(Lclient!akr;S)V")
	@Override
	void method22019(@OriginalArg(0) Class93_Sub28 arg0, @OriginalArg(1) short arg1) {
		arg0.method13825(this.anInt3042 * -1600976725, 1019234475);
	}

	@OriginalMember(owner = "client!aru", name = "k", descriptor = "(Lclient!akr;)V")
	@Override
	void method22021(@OriginalArg(0) Class93_Sub28 arg0) {
		arg0.method13825(this.anInt3042 * -1600976725, 614111336);
	}

	@OriginalMember(owner = "client!aru", name = "f", descriptor = "(Lclient!akr;)V")
	@Override
	void method22020(@OriginalArg(0) Class93_Sub28 arg0) {
		arg0.method13825(this.anInt3042 * -1600976725, 1923061678);
	}

	@OriginalMember(owner = "client!aru", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	void method22018(@OriginalArg(0) Class93_Sub41 arg0) {
		this.anInt3042 = arg0.method22427(-1434290800) * 650162691;
		arg0.method22425((short) 16384);
		if (arg0.method22425((short) 16384) != 255) {
			arg0.anInt3070 -= -1445626955;
			arg0.method22435(825494321);
		}
	}
}
