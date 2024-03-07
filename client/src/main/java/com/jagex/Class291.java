package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public class Class291 implements Interface26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!gk", name = "this$0", descriptor = "Lclient!gx;")
	final Class303 this$0;

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "(IS)I", line = 47)
	static final int method26570(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		return arg0 < 7 ? 9 : 11;
	}

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!gx;)V", line = 267)
	Class291(@OriginalArg(0) Class303 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "(Lclient!gq;)V", line = 270)
	@Override
	public void method26713(@OriginalArg(0) Class297 arg0) {
		arg0.method26688((byte) 1);
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "(Lclient!gq;B)V", line = 270)
	@Override
	public void method26715(@OriginalArg(0) Class297 arg0, @OriginalArg(1) byte arg1) {
		arg0.method26688((byte) 1);
	}

	@OriginalMember(owner = "client!gk", name = "n", descriptor = "(Lclient!gq;)V", line = 270)
	@Override
	public void method26714(@OriginalArg(0) Class297 arg0) {
		arg0.method26688((byte) 1);
	}

	@OriginalMember(owner = "client!gk", name = "ky", descriptor = "(Lclient!yf;B)V", line = 6896)
	static final void method26571(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		Class114.method7638(local11, arg0, -668817039);
	}

	@OriginalMember(owner = "client!gk", name = "mx", descriptor = "(Lclient!yf;S)V", line = 7160)
	static final void method26572(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class623.method32149(local11, local14, arg0, -1065398885);
	}

	@OriginalMember(owner = "client!gk", name = "ajw", descriptor = "(Lclient!yf;I)V", line = 11474)
	static final void method26573(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
	}

	@OriginalMember(owner = "client!gk", name = "ata", descriptor = "(Lclient!yf;I)V", line = 13281)
	static final void method26574(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= 1189701933;
	}

	@OriginalMember(owner = "client!gk", name = "ati", descriptor = "(Lclient!yf;I)V", line = 13309)
	static final void method26575(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.options.aClass166_Sub25_1.method15888(-988861719) == 1 ? 1 : 0;
	}
}
