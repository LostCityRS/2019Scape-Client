package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahx")
public class Class122_Sub3 extends Class122 {

	@OriginalMember(owner = "client!ahx", name = "c", descriptor = "S")
	static short aShort76;

	@OriginalMember(owner = "client!ahx", name = "<init>", descriptor = "(Lclient!py;Lclient!py;Lclient!ahs;)V", line = 10)
	Class122_Sub3(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class125_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ahx", name = "o", descriptor = "(ZII)V", line = 14)
	@Override
	void method20220(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = this.method20211((byte) 47) * 1135283731 * this.aClass125_5.anInt2983 / 10000;
		Class694.aClass104_14.method20721(arg1, arg2 + 2, local11, this.aClass125_5.anInt2980 * -1017655207 - 2, ((Class125_Sub3) this.aClass125_5).anInt1127 * 1895075645, 0);
		Class694.aClass104_14.method20721(arg1 + local11, arg2 + 2, this.aClass125_5.anInt2983 * 1135283731 - local11, this.aClass125_5.anInt2980 * -1017655207 - 2, 0, 0);
	}

	@OriginalMember(owner = "client!ahx", name = "p", descriptor = "(ZIII)V", line = 14)
	@Override
	void method20217(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = this.method20211((byte) -27) * 1135283731 * this.aClass125_5.anInt2983 / 10000;
		Class694.aClass104_14.method20721(arg1, arg2 + 2, local11, this.aClass125_5.anInt2980 * -1017655207 - 2, ((Class125_Sub3) this.aClass125_5).anInt1127 * 1895075645, 0);
		Class694.aClass104_14.method20721(arg1 + local11, arg2 + 2, this.aClass125_5.anInt2983 * 1135283731 - local11, this.aClass125_5.anInt2980 * -1017655207 - 2, 0, 0);
	}

	@OriginalMember(owner = "client!ahx", name = "v", descriptor = "(ZII)V", line = 14)
	@Override
	void method20219(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = this.method20211((byte) 50) * 1135283731 * this.aClass125_5.anInt2983 / 10000;
		Class694.aClass104_14.method20721(arg1, arg2 + 2, local11, this.aClass125_5.anInt2980 * -1017655207 - 2, ((Class125_Sub3) this.aClass125_5).anInt1127 * 1895075645, 0);
		Class694.aClass104_14.method20721(arg1 + local11, arg2 + 2, this.aClass125_5.anInt2983 * 1135283731 - local11, this.aClass125_5.anInt2980 * -1017655207 - 2, 0, 0);
	}

	@OriginalMember(owner = "client!ahx", name = "c", descriptor = "(ZII)V", line = 20)
	@Override
	void method20218(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class694.aClass104_14.method20573(arg1 - 2, arg2, this.aClass125_5.anInt2983 * 1135283731 + 4, this.aClass125_5.anInt2980 * -1017655207 + 2, ((Class125_Sub3) this.aClass125_5).anInt1126 * -1360115643, 0);
		Class694.aClass104_14.method20573(arg1 - 1, arg2 + 1, this.aClass125_5.anInt2983 * 1135283731 + 2, this.aClass125_5.anInt2980 * -1017655207, 0, 0);
	}

	@OriginalMember(owner = "client!ahx", name = "z", descriptor = "(ZIIS)V", line = 20)
	@Override
	void method20216(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short arg3) {
		Class694.aClass104_14.method20573(arg1 - 2, arg2, this.aClass125_5.anInt2983 * 1135283731 + 4, this.aClass125_5.anInt2980 * -1017655207 + 2, ((Class125_Sub3) this.aClass125_5).anInt1126 * -1360115643, 0);
		Class694.aClass104_14.method20573(arg1 - 1, arg2 + 1, this.aClass125_5.anInt2983 * 1135283731 + 2, this.aClass125_5.anInt2980 * -1017655207, 0, 0);
	}

	@OriginalMember(owner = "client!ahx", name = "f", descriptor = "(IIIIIFZI)[I", line = 203)
	public static int[] method10156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7) {
		@Pc(2) int[] local2 = new int[arg0];
		@Pc(6) Class93_Sub38_Sub1 local6 = new Class93_Sub38_Sub1();
		local6.anInt3105 = arg1 * 626071755;
		local6.aBoolean509 = arg6;
		local6.anInt3102 = arg2 * -1746277229;
		local6.anInt3101 = arg3 * 476450465;
		local6.anInt3104 = arg4 * 445855015;
		local6.anInt3106 = (int) (arg5 * 4096.0F) * 1868074503;
		local6.method22791(-911752065);
		Class66.method1189(arg0, 1, -1946206030);
		local6.method22783(0, local2, -1977192251);
		return local2;
	}

	@OriginalMember(owner = "client!ahx", name = "aff", descriptor = "(Lclient!yf;B)V", line = 10583)
	static final void method10157(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class239.method25819((char) local12, -702163615) ? 1 : 0;
	}
}