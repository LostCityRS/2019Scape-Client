package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agy")
public class Class119_Sub1 extends Class119 {

	@OriginalMember(owner = "client!agy", name = "<init>", descriptor = "(ZLclient!py;Lclient!zt;Lclient!zd;)V", line = 760)
	Class119_Sub1(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class717 arg2, @OriginalArg(3) Class702 arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!agy", name = "v", descriptor = "(ILclient!ao;I)Lclient!ay;", line = 764)
	@Override
	public Interface13 method27703(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2) {
		return new Class336(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agy", name = "y", descriptor = "(ILclient!ao;)Lclient!ay;", line = 764)
	@Override
	public Interface13 method27702(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class336(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agy", name = "s", descriptor = "(ILclient!ao;)Lclient!ay;", line = 764)
	@Override
	public Interface13 method27700(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class336(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agy", name = "q", descriptor = "(ILclient!ao;)Lclient!ay;", line = 764)
	@Override
	public Interface13 method27704(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class336(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agy", name = "o", descriptor = "(B)Ljava/lang/Class;", line = 768)
	@Override
	public Class method27701(@OriginalArg(0) byte arg0) {
		return Class336.class;
	}

	@OriginalMember(owner = "client!agy", name = "x", descriptor = "()Ljava/lang/Class;", line = 768)
	@Override
	public Class method27705() {
		return Class336.class;
	}

	@OriginalMember(owner = "client!agy", name = "is", descriptor = "(Lclient!alh;IZI)V", line = 6261)
	static final void method8606(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		Class77.method1300(arg0, arg1, false, arg2, -938103640);
	}

	@OriginalMember(owner = "client!agy", name = "sj", descriptor = "(Lclient!hf;Lclient!yf;I)V", line = 8318)
	static final void method8607(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class681 arg1, @OriginalArg(2) int arg2) {
		if (arg1.anInt5892 * -1243304745 >= 10) {
			throw new RuntimeException();
		} else if (arg0.anObjectArray36 != null) {
			@Pc(18) Class93_Sub39 local18 = new Class93_Sub39();
			local18.aClass312_1 = arg0;
			local18.anObjectArray4 = arg0.anObjectArray36;
			local18.anInt1999 = arg1.anInt5892 * -762873271 + -920515105;
			client.aClass22_47.method408(local18, 61365992);
		}
	}

	@OriginalMember(owner = "client!agy", name = "up", descriptor = "(Lclient!yf;I)V", line = 8655)
	static final void method8608(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 145160203);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16.anInt4042 * 1502707537;
	}
}
