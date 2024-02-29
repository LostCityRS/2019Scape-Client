package com.jagex;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zs")
public abstract class Class716 {

	@OriginalMember(owner = "client!zs", name = "f", descriptor = "[Lclient!er;")
	static Class250[] aClass250Array1;

	@OriginalMember(owner = "client!zs", name = "<init>", descriptor = "()V", line = 7)
	Class716() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!zs", name = "f", descriptor = "([BZ)Ljava/lang/Object;", line = 12)
	public static Object method36871(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
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

	@OriginalMember(owner = "client!zs", name = "k", descriptor = "([BZ)Ljava/lang/Object;", line = 12)
	public static Object method36872(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
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

	@OriginalMember(owner = "client!zs", name = "w", descriptor = "(Ljava/lang/Object;Z)[B", line = 25)
	public static byte[] method36873(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(11) byte[] local11 = (byte[]) arg0;
			return arg1 ? Arrays.copyOf(local11, local11.length) : local11;
		} else if (arg0 instanceof ByteBuffer) {
			@Pc(26) ByteBuffer local26 = (ByteBuffer) arg0;
			@Pc(30) byte[] local30 = new byte[local26.capacity()];
			local26.position(0);
			local26.get(local30);
			return local30;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!zs", name = "l", descriptor = "(Ljava/lang/Object;II)[B", line = 43)
	public static byte[] method36874(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(10) byte[] local10 = (byte[]) arg0;
			return Arrays.copyOfRange(local10, arg1, arg2 + arg1);
		} else if (arg0 instanceof ByteBuffer) {
			@Pc(23) ByteBuffer local23 = (ByteBuffer) arg0;
			@Pc(26) byte[] local26 = new byte[arg2];
			local23.position(arg1);
			local23.get(local26, 0, arg2);
			return local26;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!zs", name = "u", descriptor = "(Ljava/lang/Object;II)[B", line = 43)
	public static byte[] method36875(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(10) byte[] local10 = (byte[]) arg0;
			return Arrays.copyOfRange(local10, arg1, arg2 + arg1);
		} else if (arg0 instanceof ByteBuffer) {
			@Pc(23) ByteBuffer local23 = (ByteBuffer) arg0;
			@Pc(26) byte[] local26 = new byte[arg2];
			local23.position(arg1);
			local23.get(local26, 0, arg2);
			return local26;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!zs", name = "id", descriptor = "(IIIIIIIB)V", line = 6340)
	static final void method36876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7) {
		@Pc(3) int local3 = arg6 - 334;
		if (local3 < 0) {
			local3 = 0;
		} else if (local3 > 100) {
			local3 = 100;
		}
		@Pc(23) int local23 = client.aShort149 + local3 * (client.aShort154 - client.aShort149) / 100;
		@Pc(29) int local29 = local23 * arg5 >> 8;
		@Pc(35) int local35 = 16384 - arg3 & 0x3FFF;
		@Pc(41) int local41 = 16384 - arg4 & 0x3FFF;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(47) int local47 = local29;
		if (local35 != 0) {
			local45 = -local29 * Class464.anIntArray451[local35] >> 14;
			local47 = local29 * Class464.anIntArray452[local35] >> 14;
		}
		if (local41 != 0) {
			local43 = local47 * Class464.anIntArray451[local41] >> 14;
			local47 = Class464.anIntArray452[local41] * local47 >> 14;
		}
		Class163.anInt2002 = (arg0 - local43) * 1636217271;
		Class130_Sub2.anInt1117 = (arg1 - local45) * 1820517185;
		Class270.anInt3884 = (arg2 - local47) * -967471741;
		Class620.anInt5644 = arg3 * -1151839067;
		Class24.anInt82 = arg4 * 1056124373;
		Class348.anInt4199 = 0;
	}

	@OriginalMember(owner = "client!zs", name = "aal", descriptor = "(Lclient!yf;S)V", line = 9739)
	static final void method36877(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		if (client.anInt3572 * 825168203 == 0) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.anInt3573 * 1882800101;
		}
	}
}
