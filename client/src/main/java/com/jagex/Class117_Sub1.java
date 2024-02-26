package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agz")
public final class Class117_Sub1 extends Class117 {

	@OriginalMember(owner = "client!agz", name = "t", descriptor = "(Lclient!ald;I)Lclient!kd;")
	public static Class376 method8821(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.method23362(958575473);
		@Pc(10) Class391 local10 = Class58_Sub1.method15727((byte) -20)[arg0.method23362(-1099961481)];
		@Pc(17) Class383 local17 = Class646.method33047(-1097781758)[arg0.method23362(-1045214140)];
		@Pc(21) int local21 = arg0.method23179(1629707234);
		@Pc(25) int local25 = arg0.method23179(699324367);
		@Pc(29) int local29 = arg0.method23178((byte) -51);
		@Pc(33) int local33 = arg0.method23178((byte) -64);
		@Pc(37) int local37 = arg0.method23182(-695676364);
		@Pc(41) int local41 = arg0.method23182(-416733943);
		@Pc(45) int local45 = arg0.method23182(-1760699419);
		@Pc(54) boolean local54 = arg0.method23362(817443862) == 1;
		return new Class376(local3, local10, local17, local21, local25, local29, local33, local37, local41, local45, local54);
	}

	@OriginalMember(owner = "client!agz", name = "<init>", descriptor = "(Lclient!an;Lclient!pf;Lclient!pf;Lclient!pf;)V")
	Class117_Sub1(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) Class480 arg1, @OriginalArg(2) Class480 arg2, @OriginalArg(3) Class480 arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!agz", name = "r", descriptor = "(ILclient!an;B)Lclient!ae;")
	@Override
	public Interface11 method28276(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1, @OriginalArg(2) byte arg2) {
		return new Class261(arg0, this);
	}

	@OriginalMember(owner = "client!agz", name = "q", descriptor = "(I)Ljava/lang/Class;")
	@Override
	public Class method28275(@OriginalArg(0) int arg0) {
		return Class261.class;
	}

	@OriginalMember(owner = "client!agz", name = "h", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28277() {
		return Class261.class;
	}

	@OriginalMember(owner = "client!agz", name = "d", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28278() {
		return Class261.class;
	}

	@OriginalMember(owner = "client!agz", name = "z", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28279(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class261(arg0, this);
	}

	@OriginalMember(owner = "client!agz", name = "p", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28280(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class261(arg0, this);
	}

	@OriginalMember(owner = "client!agz", name = "y", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28282(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class261(arg0, this);
	}

	@OriginalMember(owner = "client!agz", name = "v", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28281(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class261(arg0, this);
	}
}
