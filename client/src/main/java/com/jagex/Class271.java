package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Iterator;

@OriginalClass("client!fp")
final class Class271 implements Interface20 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!fp", name = "this$0", descriptor = "Lclient!fg;")
	final Class263 aClass263_9;

	@OriginalMember(owner = "client!fp", name = "t", descriptor = "(B)[Lclient!vg;")
	public static Class611[] method26701(@OriginalArg(0) byte arg0) {
		return new Class611[] { Class611.aClass611_4, Class611.aClass611_1, Class611.aClass611_2, Class611.aClass611_5, Class611.aClass611_6, Class611.aClass611_3 };
	}

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "([I[IIII)V")
	public static void method26702(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(45) int local45 = Integer.MAX_VALUE == local14 ? 0 : 1;
		for (@Pc(47) int local47 = arg2; local47 < arg3; local47++) {
			if (arg0[local47] < (local47 & local45) + local14) {
				@Pc(63) int local63 = arg0[local47];
				arg0[local47] = arg0[local10];
				arg0[local10] = local63;
				@Pc(77) int local77 = arg1[local47];
				arg1[local47] = arg1[local10];
				arg1[local10++] = local77;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		method26702(arg0, arg1, arg2, local10 - 1, -1672355743);
		method26702(arg0, arg1, local10 + 1, arg3, -568145978);
	}

	@OriginalMember(owner = "client!fp", name = "vu", descriptor = "(Lclient!yp;I)V")
	static void method26703(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class279.method26849(arg0, (byte) -6);
	}

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "(CI)Z")
	static boolean method26704(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Class702.method37108(arg0, 2120620890)) {
			return true;
		} else {
			@Pc(12) char[] local12 = Class85.aCharArray1;
			@Pc(14) int local14;
			@Pc(22) char local22;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (arg0 == local22) {
					return true;
				}
			}
			local12 = Class85.aCharArray2;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (local22 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!aty;")
	public static RuntimeException_Sub4 method26705(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub4 local5;
		if (arg0 instanceof RuntimeException_Sub4) {
			local5 = (RuntimeException_Sub4) arg0;
			local5.aString123 = local5.aString123 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub4(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lclient!fg;)V")
	Class271(@OriginalArg(0) Class263 arg0) {
		this.aClass263_9 = arg0;
	}

	@OriginalMember(owner = "client!fp", name = "u", descriptor = "(Lclient!wc;I)V")
	void method26698(@OriginalArg(0) Interface68 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Iterator local5 = this.aClass263_9.method26630(-618734835).iterator();
		while (local5.hasNext()) {
			@Pc(12) Class529 local12 = (Class529) local5.next();
			if (local12.method30740((byte) -70) == arg0) {
				local12.method30724(1718003046);
				local5.remove();
			}
		}
	}

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "(Lclient!wc;)V")
	void method26699(@OriginalArg(0) Interface68 arg0) {
		@Pc(5) Iterator local5 = this.aClass263_9.method26630(-358606639).iterator();
		while (local5.hasNext()) {
			@Pc(12) Class529 local12 = (Class529) local5.next();
			if (local12.method30740((byte) -29) == arg0) {
				local12.method30724(1718003046);
				local5.remove();
			}
		}
	}

	@OriginalMember(owner = "client!fp", name = "t", descriptor = "(Ljava/lang/Object;B)V")
	@Override
	public void method26695(@OriginalArg(0) Object arg0, @OriginalArg(1) byte arg1) {
		this.method26698((Interface68) arg0, -467876015);
	}

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "(Ljava/lang/Object;)V")
	@Override
	public void method26697(@OriginalArg(0) Object arg0) {
		this.method26698((Interface68) arg0, -109716308);
	}

	@OriginalMember(owner = "client!fp", name = "l", descriptor = "(Lclient!wc;)V")
	void method26700(@OriginalArg(0) Interface68 arg0) {
		@Pc(5) Iterator local5 = this.aClass263_9.method26630(-1551735741).iterator();
		while (local5.hasNext()) {
			@Pc(12) Class529 local12 = (Class529) local5.next();
			if (local12.method30740((byte) -108) == arg0) {
				local12.method30724(1718003046);
				local5.remove();
			}
		}
	}

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "(Ljava/lang/Object;)V")
	@Override
	public void method26696(@OriginalArg(0) Object arg0) {
		this.method26698((Interface68) arg0, -848065627);
	}
}
