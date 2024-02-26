package com.jagex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
final class Class501 implements Interface9 {

	@OriginalMember(owner = "client!qb", name = "az", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray31;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)Ljava/lang/String;")
	public static String method30419(@OriginalArg(0) int arg0) {
		return Class553.aFile4.getAbsolutePath();
	}

	@OriginalMember(owner = "client!qb", name = "aj", descriptor = "(I)Z")
	static boolean method30420(@OriginalArg(0) int arg0) {
		if (client.anInt3433 * 1994758437 == 4) {
			return !Class353.method28071(927933249) && !Class684.method36790((byte) 107);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qb", name = "bg", descriptor = "(Lclient!yp;B)V")
	static void method30421(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5777 -= -1672568046;
		if (arg0.aLongArray27[arg0.anInt5777 * -628853575] == arg0.aLongArray27[arg0.anInt5777 * -628853575 + 1]) {
			arg0.anInt5780 += arg0.anIntArray526[arg0.anInt5780 * -1336568839] * -1216954807;
		}
	}

	@OriginalMember(owner = "client!qb", name = "mi", descriptor = "(Lclient!yp;B)V")
	static void method30422(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class449.method29263(local11, local14, arg0, (byte) 88);
	}

	@OriginalMember(owner = "client!qb", name = "ard", descriptor = "(Lclient!yp;I)V")
	static void method30423(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		@Pc(16) long local16 = Class717.method37237(1162476406);
		if (local16 == 0L) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 5;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class544.method31183(local16, local13, (byte) 53);
		}
	}

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "(Lclient!yp;I)V")
	static void method30424(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class460.method29415(140839604);
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	static String method30425(@OriginalArg(0) Throwable arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(15) String local15;
		if (arg0 instanceof RuntimeException_Sub4) {
			@Pc(5) RuntimeException_Sub4 local5 = (RuntimeException_Sub4) arg0;
			local15 = local5.aString123 + " | ";
			arg0 = local5.aThrowable1;
		} else {
			local15 = "";
		}
		@Pc(25) StringWriter local25 = new StringWriter();
		@Pc(30) PrintWriter local30 = new PrintWriter(local25);
		arg0.printStackTrace(local30);
		local30.close();
		@Pc(38) String local38 = local25.toString();
		@Pc(46) BufferedReader local46 = new BufferedReader(new StringReader(local38));
		@Pc(49) String local49 = local46.readLine();
		while (true) {
			@Pc(52) String local52 = local46.readLine();
			if (local52 == null) {
				return local15 + "| " + local49;
			}
			@Pc(59) int local59 = local52.indexOf(40);
			@Pc(66) int local66 = local52.indexOf(41, local59 + 1);
			@Pc(74) String local74;
			if (local59 == -1) {
				local74 = local52;
			} else {
				local74 = local52.substring(0, local59);
			}
			local74 = local74.trim();
			local74 = local74.substring(local74.lastIndexOf(32) + 1);
			local74 = local74.substring(local74.lastIndexOf(9) + 1);
			local15 = local15 + local74;
			if (local59 != -1 && local66 != -1) {
				@Pc(116) int local116 = local52.indexOf(".java:", local59);
				if (local116 >= 0) {
					local15 = local15 + local52.substring(local116 + 5, local66);
				}
			}
			local15 = local15 + ' ';
		}
	}

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "(Lclient!ald;S)Ljava/lang/Object;")
	@Override
	public Object method30638(@OriginalArg(0) Packet arg0, @OriginalArg(1) short arg1) {
		return arg0.g8();
	}

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "(Lclient!ald;)Ljava/lang/Object;")
	@Override
	public Object method30635(@OriginalArg(0) Packet arg0) {
		return arg0.g8();
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(Lclient!ald;)Ljava/lang/Object;")
	@Override
	public Object method30637(@OriginalArg(0) Packet arg0) {
		return arg0.g8();
	}

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "(Lclient!ald;)Ljava/lang/Object;")
	@Override
	public Object method30636(@OriginalArg(0) Packet arg0) {
		return arg0.g8();
	}
}
