package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahr")
public final class Class130_Sub1 extends Class130 {

	@OriginalMember(owner = "client!ahr", name = "uu", descriptor = "I")
	public static int anInt1175;

	@OriginalMember(owner = "client!ahr", name = "x", descriptor = "Lclient!arz;")
	static Class80_Sub1_Sub11 aClass80_Sub1_Sub11_2;

	@OriginalMember(owner = "client!ahr", name = "g", descriptor = "I")
	public final int anInt1174;

	@OriginalMember(owner = "client!ahr", name = "u", descriptor = "(Lclient!ald;)Lclient!lk;")
	public static Class130 method10203(@OriginalArg(0) Packet arg0) {
		@Pc(3) Class130 local3 = Class364.method28214(arg0, (byte) 0);
		@Pc(7) int local7 = arg0.g3s();
		return new Class130_Sub1(local3.anInt1171 * -534993123, local3.aClass391_6, local3.aClass383_6, local3.anInt1172 * -1094014189, local3.anInt1173 * -23088371, local7);
	}

	@OriginalMember(owner = "client!ahr", name = "g", descriptor = "(Lclient!ald;)Lclient!lk;")
	public static Class130 method10204(@OriginalArg(0) Packet arg0) {
		@Pc(3) Class130 local3 = Class364.method28214(arg0, (byte) 0);
		@Pc(7) int local7 = arg0.g3s();
		return new Class130_Sub1(local3.anInt1171 * -534993123, local3.aClass391_6, local3.aClass383_6, local3.anInt1172 * -1094014189, local3.anInt1173 * -23088371, local7);
	}

	@OriginalMember(owner = "client!ahr", name = "g", descriptor = "(Lclient!ux;B)V")
	static void method10205(@OriginalArg(0) Interface66 arg0, @OriginalArg(1) byte arg1) {
		while (Class604.aLinkedList5.size() > 10) {
			Class604.aLinkedList5.remove();
		}
		Class604.aLinkedList5.add(arg0);
	}

	@OriginalMember(owner = "client!ahr", name = "l", descriptor = "([BIII)[B")
	public static byte[] method10206(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) byte[] local4;
		if (arg1 > 0) {
			local4 = new byte[arg2];
			for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
				local4[local6] = arg0[local6 + arg1];
			}
		} else {
			local4 = arg0;
		}
		@Pc(26) Class4 local26 = new Class4();
		local26.method72((byte) 3);
		local26.method73(local4, (long) (arg2 * 8));
		@Pc(39) byte[] local39 = new byte[64];
		local26.method74(local39, 0, -1392911759);
		return local39;
	}

	@OriginalMember(owner = "client!ahr", name = "<init>", descriptor = "(ILclient!ky;Lclient!km;III)V")
	Class130_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class391 arg1, @OriginalArg(2) Class383 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt1174 = arg5 * 1477138765;
	}

	@OriginalMember(owner = "client!ahr", name = "f", descriptor = "(I)Lclient!kz;")
	@Override
	public Class392 method28942(@OriginalArg(0) int arg0) {
		return Class392.aClass392_1;
	}

	@OriginalMember(owner = "client!ahr", name = "l", descriptor = "()Lclient!kz;")
	@Override
	public Class392 method28941() {
		return Class392.aClass392_1;
	}
}
