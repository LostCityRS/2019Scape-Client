package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.HashSet;
import java.util.Set;

@OriginalClass("client!yy")
public final class Class697 implements Interface75 {

	@OriginalMember(owner = "client!yy", name = "au", descriptor = "I")
	static int anInt5810;

	@OriginalMember(owner = "client!yy", name = "b", descriptor = "[Lclient!cm;")
	static Class99[] aClass99Array9;

	@OriginalMember(owner = "client!yy", name = "t", descriptor = "Lclient!yy;")
	public static final Class697 aClass697_4 = new Class697("", 0, new Class709[] { Class709.aClass709_1 });

	@OriginalMember(owner = "client!yy", name = "f", descriptor = "Lclient!yy;")
	public static final Class697 aClass697_3 = new Class697("", 1, new Class709[] { Class709.aClass709_2, Class709.aClass709_1 });

	@OriginalMember(owner = "client!yy", name = "e", descriptor = "Lclient!yy;")
	public static final Class697 aClass697_2 = new Class697("", 2, new Class709[] { Class709.aClass709_2, Class709.aClass709_3, Class709.aClass709_1 });

	@OriginalMember(owner = "client!yy", name = "u", descriptor = "Lclient!yy;")
	public static final Class697 aClass697_5 = new Class697("", 3, new Class709[] { Class709.aClass709_2 });

	@OriginalMember(owner = "client!yy", name = "l", descriptor = "Lclient!yy;")
	public static final Class697 aClass697_6 = new Class697("", 4);

	@OriginalMember(owner = "client!yy", name = "g", descriptor = "Lclient!yy;")
	public static final Class697 aClass697_7 = new Class697("", 5, new Class709[] { Class709.aClass709_2, Class709.aClass709_1 });

	@OriginalMember(owner = "client!yy", name = "i", descriptor = "Lclient!yy;")
	static final Class697 aClass697_8 = new Class697("", 6, new Class709[] { Class709.aClass709_1 });

	@OriginalMember(owner = "client!yy", name = "m", descriptor = "Lclient!yy;")
	static final Class697 aClass697_9 = new Class697("", 8, new Class709[] { Class709.aClass709_2, Class709.aClass709_1 });

	@OriginalMember(owner = "client!yy", name = "o", descriptor = "Lclient!yy;")
	static final Class697 aClass697_10 = new Class697("", 9, new Class709[] { Class709.aClass709_2, Class709.aClass709_3 });

	@OriginalMember(owner = "client!yy", name = "j", descriptor = "Lclient!yy;")
	public static final Class697 aClass697_11 = new Class697("", 10, new Class709[] { Class709.aClass709_2 });

	@OriginalMember(owner = "client!yy", name = "a", descriptor = "Lclient!yy;")
	static final Class697 aClass697_14 = new Class697("", 11, new Class709[] { Class709.aClass709_2 });

	@OriginalMember(owner = "client!yy", name = "s", descriptor = "Lclient!yy;")
	static final Class697 aClass697_13 = new Class697("", 12, new Class709[] { Class709.aClass709_2, Class709.aClass709_1 });

	@OriginalMember(owner = "client!yy", name = "k", descriptor = "Lclient!yy;")
	static final Class697 aClass697_12 = new Class697("", 13, new Class709[] { Class709.aClass709_2 });

	@OriginalMember(owner = "client!yy", name = "w", descriptor = "Ljava/util/Set;")
	final Set aSet2 = new HashSet();

	@OriginalMember(owner = "client!yy", name = "x", descriptor = "I")
	final int anInt5809;

	static {
		method37048(-1161287359);
	}

	@OriginalMember(owner = "client!yy", name = "ad", descriptor = "(Lclient!yp;S)V")
	static void method37045(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt5776 -= -825189621;
	}

	@OriginalMember(owner = "client!yy", name = "if", descriptor = "(Lclient!yp;I)V")
	static void method37047(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class519.method30606(local11, local14, arg0, arg0.aClass80_Sub32_4 == Class477.aClass80_Sub32_3 ? Class322.aClass322_6 : Class322.aClass322_4, 1701359227);
	}

	@OriginalMember(owner = "client!yy", name = "t", descriptor = "(I)[Lclient!yy;")
	public static Class697[] method37048(@OriginalArg(0) int arg0) {
		return new Class697[] { aClass697_7, aClass697_12, aClass697_6, aClass697_5, aClass697_11, aClass697_2, aClass697_9, aClass697_3, aClass697_8, aClass697_13, aClass697_10, aClass697_14, aClass697_4 };
	}

	@OriginalMember(owner = "client!yy", name = "u", descriptor = "()[Lclient!yy;")
	public static Class697[] method37049() {
		return new Class697[] { aClass697_7, aClass697_12, aClass697_6, aClass697_5, aClass697_11, aClass697_2, aClass697_9, aClass697_3, aClass697_8, aClass697_13, aClass697_10, aClass697_14, aClass697_4 };
	}

	@OriginalMember(owner = "client!yy", name = "l", descriptor = "()[Lclient!yy;")
	public static Class697[] method37050() {
		return new Class697[] { aClass697_7, aClass697_12, aClass697_6, aClass697_5, aClass697_11, aClass697_2, aClass697_9, aClass697_3, aClass697_8, aClass697_13, aClass697_10, aClass697_14, aClass697_4 };
	}

	@OriginalMember(owner = "client!yy", name = "t", descriptor = "(I)[Lclient!ci;")
	static Class205[] method37051(@OriginalArg(0) int arg0) {
		return new Class205[] { Class205.aClass205_12, Class205.aClass205_2, Class205.aClass205_3, Class205.aClass205_4, Class205.aClass205_17, Class205.aClass205_6, Class205.aClass205_10, Class205.aClass205_8, Class205.aClass205_9, Class205.aClass205_5, Class205.aClass205_11, Class205.aClass205_15, Class205.aClass205_13, Class205.aClass205_7, Class205.aClass205_14, Class205.aClass205_1, Class205.aClass205_16 };
	}

	@OriginalMember(owner = "client!yy", name = "l", descriptor = "([J[IIIS)V")
	static void method37052(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) short arg4) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) long local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(46) int local46 = local14 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(48) int local48 = arg2; local48 < arg3; local48++) {
			if (arg0[local48] < (long) (local48 & local46) + local14) {
				@Pc(66) long local66 = arg0[local48];
				arg0[local48] = arg0[local10];
				arg0[local10] = local66;
				@Pc(80) int local80 = arg1[local48];
				arg1[local48] = arg1[local10];
				arg1[local10++] = local80;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		method37052(arg0, arg1, arg2, local10 - 1, (short) 19198);
		method37052(arg0, arg1, local10 + 1, arg3, (short) -5854);
	}

	@OriginalMember(owner = "client!yy", name = "oz", descriptor = "(Lclient!yp;B)V")
	static void method37053(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class80_Sub38.method22944(local11, local14, arg0, -1732170706);
	}

	@OriginalMember(owner = "client!yy", name = "ajq", descriptor = "(Lclient!yp;I)V")
	static void method37054(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
	}

	@OriginalMember(owner = "client!yy", name = "jh", descriptor = "(Lclient!alf;IZI)V")
	public static void method37055(@OriginalArg(0) Class120_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		Class504.method30459(arg0, arg1, true, arg2, 631235569);
	}

	@OriginalMember(owner = "client!yy", name = "r", descriptor = "(Lclient!di;I)I")
	public static int method37056(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		Class100.method2954(857506808);
		return Class669.aTwitchTV1.StopStreaming();
	}

	@OriginalMember(owner = "client!yy", name = "apj", descriptor = "(Lclient!yp;I)V")
	static void method37057(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class238.anInt3854 * -64289097;
	}

	@OriginalMember(owner = "client!yy", name = "<init>", descriptor = "(Ljava/lang/String;I[Lclient!zk;)V")
	Class697(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class709[] arg2) {
		this.anInt5809 = arg1 * -1382953551;
		@Pc(13) Class709[] local13 = arg2;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(23) Class709 local23 = local13[local15];
			this.aSet2.add(local23);
		}
	}

	@OriginalMember(owner = "client!yy", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	Class697(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5809 = arg1 * -1382953551;
	}

	@OriginalMember(owner = "client!yy", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt5809 * -1128244399;
	}

	@OriginalMember(owner = "client!yy", name = "f", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt5809 * -1128244399;
	}

	@OriginalMember(owner = "client!yy", name = "e", descriptor = "(Lclient!zk;I)Z")
	public boolean method37046(@OriginalArg(0) Class709 arg0, @OriginalArg(1) int arg1) {
		return this.aSet2.contains(arg0);
	}

	@OriginalMember(owner = "client!yy", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt5809 * -1128244399;
	}
}
