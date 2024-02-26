package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.nio.ByteBuffer;
import java.util.Arrays;

@OriginalClass("client!yx")
public final class Class696 {

	@OriginalMember(owner = "client!yx", name = "t", descriptor = "I")
	public static final int anInt5799 = 16777215;

	@OriginalMember(owner = "client!yx", name = "f", descriptor = "I")
	public static final int anInt5800 = 13156520;

	@OriginalMember(owner = "client!yx", name = "e", descriptor = "F")
	public static final float aFloat361 = 1.1523438F;

	@OriginalMember(owner = "client!yx", name = "u", descriptor = "F")
	public static final float aFloat362 = 0.69921875F;

	@OriginalMember(owner = "client!yx", name = "l", descriptor = "F")
	public static final float aFloat363 = 1.2F;

	@OriginalMember(owner = "client!yx", name = "g", descriptor = "I")
	public static final int anInt5801 = -50;

	@OriginalMember(owner = "client!yx", name = "j", descriptor = "I")
	static final int anInt5802 = 5000;

	@OriginalMember(owner = "client!yx", name = "m", descriptor = "I")
	public static final int anInt5803 = -50;

	@OriginalMember(owner = "client!yx", name = "o", descriptor = "I")
	public static final int anInt5804 = 0;

	@OriginalMember(owner = "client!yx", name = "a", descriptor = "I")
	public static final int anInt5805 = 2816;

	@OriginalMember(owner = "client!yx", name = "i", descriptor = "I")
	public static final int anInt5806 = -60;

	@OriginalMember(owner = "client!yx", name = "s", descriptor = "I")
	public static final int anInt5807 = 2816;

	@OriginalMember(owner = "client!yx", name = "k", descriptor = "I")
	public static final int anInt5808 = 2816;

	static {
		new Class463(0.6F, 0.6F, 0.6F);
		new Class463(0.3F, 0.3F, 0.3F);
		new Class463(0.3F, 0.3F, 0.5F);
	}

	@OriginalMember(owner = "client!yx", name = "ls", descriptor = "(Lclient!hx;IIILclient!yp;S)V")
	static void method37036(@OriginalArg(0) Class327 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class690 arg4, @OriginalArg(5) short arg5) {
		if (arg0.anIntArray410 == null) {
			throw new RuntimeException();
		}
		arg0.anIntArray410[arg1] = arg2;
		arg0.anIntArray401[arg1] = arg3;
	}

	@OriginalMember(owner = "client!yx", name = "rt", descriptor = "(Lclient!yp;I)V")
	static void method37037(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.anInt4102 * 1332657417;
	}

	@OriginalMember(owner = "client!yx", name = "agv", descriptor = "(Lclient!yp;B)V")
	static void method37038(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = ((Class43) Class25.aClass41_Sub9_1.method18054(local12, -125577003)).aBoolean21 ? 1 : 0;
	}

	@OriginalMember(owner = "client!yx", name = "amx", descriptor = "(Lclient!yp;I)V")
	static void method37039(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		Class420.method29012(arg0.anIntArray525[arg0.anInt5778 * 1896589581], arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1], 0, 1812254696);
	}

	@OriginalMember(owner = "client!yx", name = "t", descriptor = "([BZS)Ljava/lang/Object;")
	public static Object method37040(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) short arg2) {
		if (arg0 == null) {
			return null;
		} else if (arg0.length > 136) {
			@Pc(12) ByteBuffer local12 = ByteBuffer.allocateDirect(arg0.length);
			local12.position(0);
			local12.put(arg0);
			return local12;
		} else if (arg1) {
			return Arrays.copyOf(arg0, arg0.length);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!yx", name = "kb", descriptor = "(Lclient!yp;S)V")
	static void method37041(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class661.method33316(local11, local14, arg0, 1316601915);
	}

	@OriginalMember(owner = "client!yx", name = "<init>", descriptor = "()V")
	Class696() throws Throwable {
		throw new Error();
	}
}
