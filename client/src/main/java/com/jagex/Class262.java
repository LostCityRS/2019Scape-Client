package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
class Class262 implements Interface39 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ff", name = "this$0", descriptor = "Lclient!fb;")
	final Class258 this$0;

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "(S)V", line = 99)
	static void method26169(@OriginalArg(0) short arg0) {
		if (Class685.anIntArray524 != null) {
			return;
		}
		Class685.anIntArray524 = new int[65536];
		Class685.anIntArray523 = new int[65536];
		@Pc(10) double local10 = 0.7D;
		for (@Pc(12) int local12 = 0; local12 < 65536; local12++) {
			@Pc(26) double local26 = (double) (local12 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(37) double local37 = (double) (local12 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(44) double local44 = (double) (local12 & 0x7F) / 128.0D;
			@Pc(46) double local46 = local44;
			@Pc(48) double local48 = local44;
			@Pc(50) double local50 = local44;
			if (local37 != 0.0D) {
				@Pc(64) double local64;
				if (local44 < 0.5D) {
					local64 = (local37 + 1.0D) * local44;
				} else {
					local64 = local44 + local37 - local37 * local44;
				}
				@Pc(79) double local79 = local44 * 2.0D - local64;
				@Pc(83) double local83 = local26 + 0.3333333333333333D;
				if (local83 > 1.0D) {
					local83--;
				}
				@Pc(97) double local97 = local26 - 0.3333333333333333D;
				if (local97 < 0.0D) {
					local97++;
				}
				if (local83 * 6.0D < 1.0D) {
					local46 = local79 + local83 * (local64 - local79) * 6.0D;
				} else if (local83 * 2.0D < 1.0D) {
					local46 = local64;
				} else if (local83 * 3.0D < 2.0D) {
					local46 = local79 + (0.6666666666666666D - local83) * (local64 - local79) * 6.0D;
				} else {
					local46 = local79;
				}
				if (local26 * 6.0D < 1.0D) {
					local48 = local26 * 6.0D * (local64 - local79) + local79;
				} else if (local26 * 2.0D < 1.0D) {
					local48 = local64;
				} else if (local26 * 3.0D < 2.0D) {
					local48 = (0.6666666666666666D - local26) * 6.0D * (local64 - local79) + local79;
				} else {
					local48 = local79;
				}
				if (local97 * 6.0D < 1.0D) {
					local50 = local97 * 6.0D * (local64 - local79) + local79;
				} else if (local97 * 2.0D < 1.0D) {
					local50 = local64;
				} else if (local97 * 3.0D < 2.0D) {
					local50 = (0.6666666666666666D - local97) * (local64 - local79) * 6.0D + local79;
				} else {
					local50 = local79;
				}
			}
			local46 = Math.pow(local46, local10);
			local48 = Math.pow(local48, local10);
			local50 = Math.pow(local50, local10);
			@Pc(263) int local263 = (int) (local46 * 256.0D);
			@Pc(268) int local268 = (int) (local48 * 256.0D);
			@Pc(273) int local273 = (int) (local50 * 256.0D);
			@Pc(283) int local283 = (local268 << 8) + (local263 << 16) + local273;
			Class685.anIntArray524[local12] = local283 & 0xFFFFFF;
			@Pc(299) int local299 = (local268 << 8) + (local273 << 16) + local263;
			Class685.anIntArray523[local12] = local299;
		}
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)I", line = 184)
	public static int method26170(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2) {
		if (Class625.aBoolean848) {
			return Class330.method27371(-2045565124) == client.aClass175_2 ? Class166_Sub13.aTwitchTV1.Login(arg0, arg1) : 42;
		} else {
			return 12;
		}
	}

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!fb;)V", line = 485)
	Class262(@OriginalArg(0) Class258 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "n", descriptor = "()F", line = 487)
	@Override
	public float method26346() {
		return (float) Class51.options.aClass166_Sub35_1.method16226(1740916554) / 255.0F;
	}

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)F", line = 487)
	@Override
	public float method26345(@OriginalArg(0) int arg0) {
		return (float) Class51.options.aClass166_Sub35_1.method16226(-1754336219) / 255.0F;
	}

	@OriginalMember(owner = "client!ff", name = "hq", descriptor = "(I)V", line = 4633)
	public static final void method26171(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = Class51.options.aClass166_Sub15_2.method15673(1349843171);
		if (local4 == 0) {
			client.world.method30508(null, 1388606318);
			Class75.method1268(0, (byte) 91);
		} else if (local4 == 1 || local4 == 3) {
			Class249.method25945((byte) 0, 1118107359);
			Class75.method1268(512, (byte) 109);
			if (client.world.method30481(-1092450087) != null) {
				Class110.method20146(-2108217161);
			}
		} else {
			Class249.method25945((byte) (client.anInt3495 * 1815175593 - 4 & 0xFF), 2102891014);
			Class75.method1268(2, (byte) 119);
		}
		client.anInt3559 = Class512.anInt5209 * -1452064847;
	}

	@OriginalMember(owner = "client!ff", name = "fx", descriptor = "(Lclient!yf;I)V", line = 5924)
	static final void method26172(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class533.method30604(local11, local14, arg0, (byte) -84);
	}

	@OriginalMember(owner = "client!ff", name = "jz", descriptor = "(Lclient!yf;I)V", line = 6701)
	static final void method26173(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
	}

	@OriginalMember(owner = "client!ff", name = "alp", descriptor = "(Lclient!yf;I)V", line = 11947)
	static final void method26174(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = client.anIntArrayArrayArray15[arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091]].length >> 1;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local17;
	}
}
