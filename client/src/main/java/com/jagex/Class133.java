package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public class Class133 implements Interface32 {

	@OriginalMember(owner = "client!la", name = "ak", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray16;

	@OriginalMember(owner = "client!la", name = "e", descriptor = "I")
	public final int anInt1133;

	@OriginalMember(owner = "client!la", name = "n", descriptor = "Lclient!kv;")
	public final Class390 aClass390_6;

	@OriginalMember(owner = "client!la", name = "m", descriptor = "Lclient!ky;")
	public final Class392 aClass392_6;

	@OriginalMember(owner = "client!la", name = "k", descriptor = "I")
	public final int anInt1131;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "I")
	public final int anInt1132;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(ILclient!kv;Lclient!ky;II)V", line = 12)
	Class133(@OriginalArg(0) int arg0, @OriginalArg(1) Class390 arg1, @OriginalArg(2) Class392 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt1133 = arg0 * -1883674719;
		this.aClass390_6 = arg1;
		this.aClass392_6 = arg2;
		this.anInt1131 = arg3 * -994359025;
		this.anInt1132 = arg4 * -1548417669;
	}

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "(Lclient!alw;I)Lclient!la;", line = 21)
	public static Class133 method28926(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.gSmart2or4null(-1215915305);
		@Pc(10) Class390 local10 = Class708.method36753(1635987414)[arg0.g1((short) 16384)];
		@Pc(17) Class392 local17 = Class252.method25976(-2134249016)[arg0.g1((short) 16384)];
		@Pc(21) int local21 = arg0.g2s((byte) -123);
		@Pc(25) int local25 = arg0.g2s((byte) -63);
		return new Class133(local3, local10, local17, local21, local25);
	}

	@OriginalMember(owner = "client!la", name = "n", descriptor = "(S)Lclient!kt;", line = 30)
	@Override
	public Class388 method28578(@OriginalArg(0) short arg0) {
		return Class388.aClass388_8;
	}

	@OriginalMember(owner = "client!la", name = "l", descriptor = "()Lclient!kt;", line = 30)
	@Override
	public Class388 method28579() {
		return Class388.aClass388_8;
	}

	@OriginalMember(owner = "client!la", name = "w", descriptor = "(I[ILclient!hq;ZI)Lclient!hq;", line = 297)
	public static Class320 method10072(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class320 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (!Class589.aClass497_132.method30073(arg0, -1392918358)) {
			return null;
		}
		@Pc(11) int local11 = Class589.aClass497_132.method30084(arg0, 481794000);
		@Pc(16) Class312[] local16;
		if (local11 == 0) {
			local16 = new Class312[0];
		} else if (arg2 == null) {
			local16 = new Class312[local11];
		} else {
			local16 = arg2.aClass312Array3;
		}
		if (arg2 == null) {
			arg2 = new Class320(arg3, local16);
		} else {
			arg2.aClass312Array3 = local16;
			arg2.aBoolean708 = arg3;
		}
		for (@Pc(43) int local43 = 0; local43 < local11; local43++) {
			if (arg2.aClass312Array3[local43] == null) {
				@Pc(58) byte[] local58 = Class589.aClass497_132.method30067(arg0, local43, arg1, (byte) -19);
				if (local58 != null) {
					@Pc(70) Class312 local70 = arg2.aClass312Array3[local43] = new Class312();
					local70.anInt3953 = (local43 + (arg0 << 16)) * -212068725;
					local70.method26861(new Packet(local58), -253284198);
				}
			}
		}
		return arg2;
	}
}
