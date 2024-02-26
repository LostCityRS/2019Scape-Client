package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
final class Class513 implements Interface57 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!qo", name = "this$0", descriptor = "Lclient!rh;")
	final Class529 aClass529_7;

	@OriginalMember(owner = "client!qo", name = "lm", descriptor = "(Lclient!yp;I)V")
	static void method30568(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class644.method33031(local11, local14, arg0, 1178895247);
	}

	@OriginalMember(owner = "client!qo", name = "bas", descriptor = "(Lclient!yp;I)V")
	static void method30569(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub25_1.method16950(local12, (byte) -29);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)I")
	public static int method30570(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2) {
		if (Class622.aBoolean936) {
			return Class52.method1074(16777215) == client.aClass75_1 ? Class669.aTwitchTV1.Login(arg0, arg1) : 42;
		} else {
			return 12;
		}
	}

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!rh;)V")
	Class513(@OriginalArg(0) Class529 arg0) {
		this.aClass529_7 = arg0;
	}

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "(I)[B")
	@Override
	public byte[] method30567(@OriginalArg(0) int arg0) {
		return this.aClass529_7.anInterface68_1.method32971(arg0, 678655346);
	}

	@OriginalMember(owner = "client!qo", name = "t", descriptor = "(IB)[B")
	@Override
	public byte[] method30566(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.aClass529_7.anInterface68_1.method32971(arg0, 1263577747);
	}
}
