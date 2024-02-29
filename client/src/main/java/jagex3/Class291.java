package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class291 implements Interface26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!gk", name = "this$0", descriptor = "Lclient!gx;")
	final Class303 aClass303_7;

	@OriginalMember(owner = "client!gk", name = "ajw", descriptor = "(Lclient!yf;I)V")
	static void method26663(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
	}

	@OriginalMember(owner = "client!gk", name = "ata", descriptor = "(Lclient!yf;I)V")
	static void method26664(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!gk", name = "ati", descriptor = "(Lclient!yf;I)V")
	static void method26665(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub25_1.method15899(-988861719) == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!gk", name = "mx", descriptor = "(Lclient!yf;S)V")
	static void method26666(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class623.method32330(local11, local14, arg0, -1065398885);
	}

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "(IS)I")
	static int method26667(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		return arg0 < 7 ? 9 : 11;
	}

	@OriginalMember(owner = "client!gk", name = "ky", descriptor = "(Lclient!yf;B)V")
	static void method26668(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		Class114.method7635(local11, arg0, -668817039);
	}

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!gx;)V")
	Class291(@OriginalArg(0) Class303 arg0) {
		this.aClass303_7 = arg0;
	}

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "(Lclient!gq;)V")
	@Override
	public void method26806(@OriginalArg(0) Class297 arg0) {
		arg0.method26728((byte) 1);
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "(Lclient!gq;B)V")
	@Override
	public void method26808(@OriginalArg(0) Class297 arg0, @OriginalArg(1) byte arg1) {
		arg0.method26728((byte) 1);
	}

	@OriginalMember(owner = "client!gk", name = "n", descriptor = "(Lclient!gq;)V")
	@Override
	public void method26807(@OriginalArg(0) Class297 arg0) {
		arg0.method26728((byte) 1);
	}
}
