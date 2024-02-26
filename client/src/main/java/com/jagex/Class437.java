package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.EOFException;
import java.util.Iterator;

@OriginalClass("client!ng")
public final class Class437 {

	@OriginalMember(owner = "client!ng", name = "t", descriptor = "Ljava/lang/Object;")
	final Object anObject18;

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
	int anInt4804;

	@OriginalMember(owner = "client!ng", name = "u", descriptor = "(Ljava/lang/Iterable;S)I")
	static int method29138(@OriginalArg(0) Iterable arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1 = -1;
		@Pc(4) Iterator local4 = arg0.iterator();
		while (local4.hasNext()) {
			@Pc(11) Interface75 local11 = (Interface75) local4.next();
			if (local11.method37268() > local1) {
				local1 = local11.method37268();
			}
		}
		return (local1 + 8) / 8;
	}

	@OriginalMember(owner = "client!ng", name = "lw", descriptor = "(II)V")
	static void method29139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class120_Sub1_Sub4_Sub1.method13026(-2032400569);
		@Pc(10) int local10 = ((Class107_Sub2) Class528.aClass2_Sub1_Sub1_3.method18054(arg0, -234644510)).anInt863 * 773314191;
		if (local10 == 0) {
			return;
		}
		@Pc(23) int local23 = Class672.aClass134_1.method36980((Class107) Class528.aClass2_Sub1_Sub1_3.method18054(arg0, 1201259497), 707990139);
		if (local10 == 5) {
			client.anInt3520 = local23 * -556145545;
		}
		if (local10 == 6) {
			client.anInt3529 = local23 * -468156315;
		}
	}

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "(I)Lclient!p;")
	public static Class474 method29140(@OriginalArg(0) int arg0) {
		@Pc(1) Class40 local1 = null;
		boolean var13 = false;
		@Pc(50) Class474 var20;
		label114: {
			@Pc(64) Class474 local64;
			try {
				var13 = true;
				local1 = Class3.method70("3", client.aClass722_4.aString247, false, -1121022043);
				@Pc(16) byte[] local16 = new byte[(int) local1.method839((byte) 0)];
				@Pc(30) int local30;
				for (int var19 = 0; var19 < local16.length; var19 += local30) {
					local30 = local1.method832(local16, var19, local16.length - var19, (byte) -42);
					if (local30 == -1) {
						throw new EOFException();
					}
				}
				var20 = new Class474(new Packet(local16));
				var13 = false;
				break label114;
			} catch (@Pc(60) Exception local60) {
				local64 = new Class474();
				var13 = false;
			} finally {
				if (var13) {
					try {
						if (local1 != null) {
							local1.method838(913453127);
						}
					} catch (@Pc(81) Exception local81) {
					}
				}
			}
			try {
				if (local1 != null) {
					local1.method838(-104354511);
				}
			} catch (@Pc(71) Exception local71) {
			}
			return local64;
		}
		try {
			if (local1 != null) {
				local1.method838(-2041552595);
			}
		} catch (@Pc(57) Exception local57) {
		}
		return var20;
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	Class437(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		this.anObject18 = arg0;
		this.anInt4804 = arg1 * -2050094309;
	}
}
