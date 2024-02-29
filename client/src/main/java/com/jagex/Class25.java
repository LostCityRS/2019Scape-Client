package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aax")
public abstract class Class25 {

	@OriginalMember(owner = "client!aax", name = "bk", descriptor = "Lclient!cm;")
	public static Class100 aClass100_39;

	@OriginalMember(owner = "client!aax", name = "e", descriptor = "Lclient!je;")
	final Class123 aClass123_16;

	@OriginalMember(owner = "client!aax", name = "<init>", descriptor = "(Lclient!je;)V", line = 12)
	Class25(@OriginalArg(0) Class123 arg0) {
		this.aClass123_16 = arg0;
	}

	@OriginalMember(owner = "client!aax", name = "fo", descriptor = "(I)V", line = 2738)
	public static void method23117(@OriginalArg(0) int arg0) {
		@Pc(6) Class38 local6 = Class166_Sub18.method15743("2", client.aClass702_4.aString241, true, 199047110);
		Class596.aClass113_Sub1_1.method7419(local6, (byte) -103);
	}

	@OriginalMember(owner = "client!aax", name = "oz", descriptor = "(Lclient!yf;B)V", line = 7565)
	static final void method23118(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class498.method30136(local11, local14, arg0, (byte) 32);
	}

	@OriginalMember(owner = "client!aax", name = "asv", descriptor = "(Lclient!yf;I)V", line = 13169)
	static final void method23119(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub34_1, arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], (byte) 58);
		Class106_Sub1.method5135(1553871106);
	}

	@OriginalMember(owner = "client!aax", name = "axn", descriptor = "(Lclient!yf;I)V", line = 13844)
	static final void method23120(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		Class334.method27403(8, local13, local23, "", (short) 10458);
	}

	@OriginalMember(owner = "client!aax", name = "s", descriptor = "()Lclient!ox;")
	public abstract Class472 method23121();

	@OriginalMember(owner = "client!aax", name = "e", descriptor = "(FB)V")
	public abstract void method23122(@OriginalArg(0) float arg0, @OriginalArg(1) byte arg1);

	@OriginalMember(owner = "client!aax", name = "w", descriptor = "(Lclient!alw;I)V")
	public abstract void method23123(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aax", name = "m", descriptor = "(I)Lclient!ox;")
	public abstract Class472 method23124(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aax", name = "c", descriptor = "(Lclient!alw;)V")
	public abstract void method23125(@OriginalArg(0) Class93_Sub41 arg0);

	@OriginalMember(owner = "client!aax", name = "k", descriptor = "(I)Lclient!ox;")
	public abstract Class472 method23126(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aax", name = "f", descriptor = "(Lclient!ju;Lclient!ou;IIFB)V")
	public abstract void method23127(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) byte arg5);

	@OriginalMember(owner = "client!aax", name = "u", descriptor = "(F)V")
	public abstract void method23128(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!aax", name = "z", descriptor = "()Z")
	public abstract boolean method23129();

	@OriginalMember(owner = "client!aax", name = "p", descriptor = "(Lclient!ju;Lclient!ou;IIF)V")
	public abstract void method23130(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!aax", name = "d", descriptor = "()Lclient!ox;")
	public abstract Class472 method23131();

	@OriginalMember(owner = "client!aax", name = "l", descriptor = "(F)V")
	public abstract void method23132(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!aax", name = "r", descriptor = "(Lclient!alw;)V")
	public abstract void method23133(@OriginalArg(0) Class93_Sub41 arg0);

	@OriginalMember(owner = "client!aax", name = "v", descriptor = "(Lclient!alw;)V")
	public abstract void method23134(@OriginalArg(0) Class93_Sub41 arg0);

	@OriginalMember(owner = "client!aax", name = "o", descriptor = "(Lclient!alw;)V")
	public abstract void method23135(@OriginalArg(0) Class93_Sub41 arg0);

	@OriginalMember(owner = "client!aax", name = "n", descriptor = "(I)Z")
	public abstract boolean method23136(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aax", name = "y", descriptor = "()Lclient!ox;")
	public abstract Class472 method23137();
}
