package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agg")
public final class Class110_Sub10 extends Class110 {

	@OriginalMember(owner = "client!agg", name = "fn", descriptor = "Lclient!py;")
	public static Class497 aClass497_23;

	@OriginalMember(owner = "client!agg", name = "n", descriptor = "I")
	int anInt926;

	@OriginalMember(owner = "client!agg", name = "m", descriptor = "Ljava/lang/String;")
	final String aString29;

	@OriginalMember(owner = "client!agg", name = "k", descriptor = "I")
	final int anInt927;

	@OriginalMember(owner = "client!agg", name = "f", descriptor = "I")
	final int anInt925;

	@OriginalMember(owner = "client!agg", name = "hx", descriptor = "(Lclient!yf;B)V")
	static void method7990(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class12.method188(local11, local14, true, 0, arg0, 1691862116);
	}

	@OriginalMember(owner = "client!agg", name = "<init>", descriptor = "(Lclient!alw;)V")
	Class110_Sub10(@OriginalArg(0) Class93_Sub41 arg0) {
		super(arg0);
		this.anInt926 = arg0.method22427(-1434290800) * -2048059937;
		this.aString29 = arg0.method22439(1285423375);
		this.anInt927 = arg0.method22431(-118643075) * -267220097;
		this.anInt925 = arg0.method22427(-1434290800) * 812450351;
	}

	@OriginalMember(owner = "client!agg", name = "n", descriptor = "(I)V")
	@Override
	public void method20150(@OriginalArg(0) int arg0) {
		Class249.aClass239Array1[this.anInt926 * 1708975647].method25900(1176044649).method19980(this.aString29, this.anInt927 * 1158231167, 0, this.anInt925 * 20284623, 1240454780);
	}

	@OriginalMember(owner = "client!agg", name = "f", descriptor = "()V")
	@Override
	public void method20152() {
		Class249.aClass239Array1[this.anInt926 * 1708975647].method25900(354328266).method19980(this.aString29, this.anInt927 * 1158231167, 0, this.anInt925 * 20284623, 1283680156);
	}
}
