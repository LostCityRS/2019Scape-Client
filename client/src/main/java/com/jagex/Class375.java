package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class375 implements Interface33 {

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	public static final int anInt4513 = 1;

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
	public static final int anInt4514 = 0;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	public static final int anInt4517 = 2;

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "Lclient!aan;")
	static Class15 aClass15_9;

	@OriginalMember(owner = "client!kc", name = "u", descriptor = "Lclient!ky;")
	public final Class391 aClass391_9;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "Lclient!km;")
	public final Class383 aClass383_9;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
	public final int anInt4516;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
	public final int anInt4512;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	public final int anInt4515;

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
	public final int anInt4518;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
	public final int anInt4519;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "(Lclient!ald;)Lclient!kc;")
	public static Class375 method28446(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(6) Class391 local6 = Class58_Sub1.method15727((byte) -115)[arg0.method23362(16182529)];
		@Pc(13) Class383 local13 = Class646.method33047(-1097781758)[arg0.method23362(-1379487647)];
		@Pc(17) int local17 = arg0.method23179(1685993792);
		@Pc(21) int local21 = arg0.method23179(608021025);
		@Pc(25) int local25 = arg0.method23210((byte) 85);
		@Pc(29) int local29 = arg0.method23182(-457708469);
		@Pc(33) int local33 = arg0.method23362(625929322);
		return new Class375(local6, local13, local17, local21, local25, local29, local33);
	}

	@OriginalMember(owner = "client!kc", name = "u", descriptor = "(Lclient!ald;)Lclient!kc;")
	public static Class375 method28447(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(6) Class391 local6 = Class58_Sub1.method15727((byte) -121)[arg0.method23362(-1478484509)];
		@Pc(13) Class383 local13 = Class646.method33047(-1097781758)[arg0.method23362(1124847787)];
		@Pc(17) int local17 = arg0.method23179(-370250033);
		@Pc(21) int local21 = arg0.method23179(-680893293);
		@Pc(25) int local25 = arg0.method23210((byte) 44);
		@Pc(29) int local29 = arg0.method23182(2102306367);
		@Pc(33) int local33 = arg0.method23362(-1373247896);
		return new Class375(local6, local13, local17, local21, local25, local29, local33);
	}

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "(B)[Lclient!wl;")
	public static Class640[] method28448(@OriginalArg(0) byte arg0) {
		return new Class640[] { Class640.aClass640_3, Class640.aClass640_1, Class640.aClass640_2 };
	}

	@OriginalMember(owner = "client!kc", name = "pe", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method28449(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -1840623039) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray42 = Class431.method29089(local13, arg2, 1802231376);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!kc", name = "pl", descriptor = "(Lclient!yp;I)V")
	static void method28450(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class114.method8627(local11, local14, arg0, -1742814743);
	}

	@OriginalMember(owner = "client!kc", name = "xy", descriptor = "(Lclient!yp;I)V")
	static void method28451(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class220.method25906(local13, local23, true, -866041822);
	}

	@OriginalMember(owner = "client!kc", name = "bej", descriptor = "(Lclient!yp;S)V")
	static void method28452(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		if (Class411.anIterator2 != null && Class411.anIterator2.hasNext()) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (Integer) Class411.anIterator2.next();
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		}
	}

	@OriginalMember(owner = "client!kc", name = "adp", descriptor = "(Lclient!yp;I)V")
	static void method28453(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		Class570.method31722(arg0.aClass80_Sub32_4 == Class477.aClass80_Sub32_3, local12, -980912312);
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!ky;Lclient!km;IIIII)V")
	Class375(@OriginalArg(0) Class391 arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass391_9 = arg0;
		this.aClass383_9 = arg1;
		this.anInt4516 = arg2 * -750892473;
		this.anInt4512 = arg3 * -1046783177;
		this.anInt4515 = arg4 * 1118239927;
		this.anInt4518 = arg5 * 197244063;
		this.anInt4519 = arg6 * -574478975;
	}

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)Lclient!kz;")
	@Override
	public Class392 method28942(@OriginalArg(0) int arg0) {
		return Class392.aClass392_9;
	}

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "()Lclient!kz;")
	@Override
	public Class392 method28941() {
		return Class392.aClass392_9;
	}
}
