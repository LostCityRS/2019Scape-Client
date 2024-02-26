package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;

@OriginalClass("client!m")
public final class Class411 {

	@OriginalMember(owner = "client!m", name = "eq", descriptor = "Lclient!pq;")
	public static Class490 aClass490_2;

	@OriginalMember(owner = "client!m", name = "wl", descriptor = "Ljava/util/Iterator;")
	public static Iterator anIterator2;

	@OriginalMember(owner = "client!m", name = "v", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!m", name = "t", descriptor = "Lclient!m;")
	static final Class411 aClass411_2 = new Class411();

	@OriginalMember(owner = "client!m", name = "f", descriptor = "Lclient!m;")
	static final Class411 aClass411_1 = new Class411();

	@OriginalMember(owner = "client!m", name = "g", descriptor = "(I[ILclient!he;ZI)Lclient!he;")
	public static Class310 method28963(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class310 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (!Class642.aClass480_131.method29975(arg0, -1403081456)) {
			return null;
		}
		@Pc(11) int local11 = Class642.aClass480_131.method29929(arg0, -561697017);
		@Pc(17) Class327[] local17;
		if (local11 == 0) {
			local17 = new Class327[0];
		} else if (arg2 == null) {
			local17 = new Class327[local11];
		} else {
			local17 = arg2.aClass327Array2;
		}
		if (arg2 == null) {
			arg2 = new Class310(arg3, local17);
		} else {
			arg2.aClass327Array2 = local17;
			arg2.aBoolean794 = arg3;
		}
		for (@Pc(45) int local45 = 0; local45 < local11; local45++) {
			if (arg2.aClass327Array2[local45] == null) {
				@Pc(61) byte[] local61 = Class642.aClass480_131.method29919(arg0, local45, arg1, (byte) -29);
				if (local61 != null) {
					@Pc(73) Class327 local73 = arg2.aClass327Array2[local45] = new Class327();
					local73.anInt4087 = ((arg0 << 16) + local45) * 837863195;
					local73.method27653(new Packet(local61), 909570795);
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(Lclient!di;J)V")
	public static void method28964(@OriginalArg(0) Class102 arg0, @OriginalArg(1) long arg1) {
		Class654.anInt5664 = Class654.anInt5668 * -2011109703;
		Class654.anInt5668 = 0;
		Class303.method27111((byte) 33);
		@Pc(11) Iterator local11 = Class286.aList14.iterator();
		while (local11.hasNext()) {
			@Pc(18) Class658 local18 = (Class658) local11.next();
			@Pc(23) boolean local23 = local18.method33236(arg0, arg1);
			if (!local23) {
				local11.remove();
				Class40.aClass658Array1[Class654.anInt5667 * -1544286437] = local18;
				Class654.anInt5667 = (Class654.anInt5667 * -1544286437 + 1 & Class233.anIntArray351[Class654.anInt5665 * 2087772395]) * 2032775955;
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "t", descriptor = "(Ljava/net/Socket;IB)Lclient!ug;")
	public static Class160 method28965(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) throws IOException {
		return Class515.method30572(arg0, arg1, arg1, 1535694702);
	}

	@OriginalMember(owner = "client!m", name = "gi", descriptor = "(ZI)Z")
	public static boolean method28966(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(2) boolean local2 = Class279.aClass102_9.method20784();
		if (arg0 == local2) {
			return true;
		}
		if (!arg0) {
			Class279.aClass102_9.method20856();
		} else if (!Class279.aClass102_9.method20822()) {
			arg0 = false;
		}
		if (arg0 == local2) {
			return false;
		} else {
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub47_1, arg0 ? 1 : 0, (byte) 87);
			Class719.method37291(1771601674);
			return true;
		}
	}

	@OriginalMember(owner = "client!m", name = "hm", descriptor = "(I)V")
	static void method28967(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < client.anInt3453 * -1702559601; local1++) {
			@Pc(10) int local10 = client.anIntArray304[local1];
			@Pc(16) Class80_Sub19 local16 = (Class80_Sub19) client.aClass24_18.method560((long) local10);
			if (local16 != null) {
				@Pc(23) Class120_Sub1_Sub1_Sub1_Sub1 local23 = (Class120_Sub1_Sub1_Sub1_Sub1) local16.anObject5;
				Class539.method31037(local23, false, (byte) -7);
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
	Class411() {
	}
}
